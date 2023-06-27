// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gateway.oss;

import com.aliyun.tea.*;

public class Client extends com.aliyun.gateway.spi.Client {

    public java.util.List<String> _default_signed_params;
    public java.util.List<String> _except_signed_params;
    public Client() throws Exception {
        super();
        this._default_signed_params = java.util.Arrays.asList(
            "location",
            "cors",
            "objectMeta",
            "uploadId",
            "partNumber",
            "security-token",
            "position",
            "img",
            "style",
            "styleName",
            "replication",
            "replicationProgress",
            "replicationLocation",
            "cname",
            "qos",
            "startTime",
            "endTime",
            "symlink",
            "x-oss-process",
            "response-content-type",
            "response-content-language",
            "response-expires",
            "response-cache-control",
            "response-content-disposition",
            "response-content-encoding",
            "udf",
            "udfName",
            "udfImage",
            "udfId",
            "udfImageDesc",
            "udfApplication",
            "udfApplicationLog",
            "restore",
            "callback",
            "callback-var",
            "policy",
            "encryption",
            "versions",
            "versioning",
            "versionId",
            "wormId"
        );
        this._except_signed_params = java.util.Arrays.asList(
            "list-type",
            "regions"
        );
    }


    public void modifyConfiguration(com.aliyun.gateway.spi.models.InterceptorContext context, com.aliyun.gateway.spi.models.AttributeMap attributeMap) throws Exception {
        com.aliyun.gateway.spi.models.InterceptorContext.InterceptorContextConfiguration config = context.configuration;
        config.endpoint = this.getEndpoint(config.regionId, config.network, config.endpoint);
    }

    public void modifyRequest(com.aliyun.gateway.spi.models.InterceptorContext context, com.aliyun.gateway.spi.models.AttributeMap attributeMap) throws Exception {
        com.aliyun.gateway.spi.models.InterceptorContext.InterceptorContextRequest request = context.request;
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostMap)) {
            hostMap = request.hostMap;
        }

        String bucketName = hostMap.get("bucket");
        if (com.aliyun.teautil.Common.isUnset(bucketName)) {
            bucketName = "";
        }

        if (!com.aliyun.teautil.Common.isUnset(request.headers.get("x-oss-meta-*"))) {
            Object tmp = com.aliyun.teautil.Common.parseJSON(request.headers.get("x-oss-meta-*"));
            java.util.Map<String, Object> mapData = com.aliyun.teautil.Common.assertAsMap(tmp);
            java.util.Map<String, String> metaData = com.aliyun.teautil.Common.stringifyMapValue(mapData);
            java.util.List<String> metaKeySet = com.aliyun.darabonba.map.Client.keySet(metaData);
            request.headers.put("x-oss-meta-*", null);
            for (String key : metaKeySet) {
                String newKey = "x-oss-meta-" + key + "";
                request.headers.put(newKey, metaData.get(key));
            }
        }

        com.aliyun.gateway.spi.models.InterceptorContext.InterceptorContextConfiguration config = context.configuration;
        com.aliyun.credentials.Client credential = request.credential;
        String accessKeyId = credential.getAccessKeyId();
        String accessKeySecret = credential.getAccessKeySecret();
        String securityToken = credential.getSecurityToken();
        if (!com.aliyun.teautil.Common.empty(securityToken)) {
            request.headers.put("x-oss-security-token", securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            if (com.aliyun.darabonbastring.Client.equals(request.reqBodyType, "xml")) {
                java.util.Map<String, Object> reqBodyMap = com.aliyun.teautil.Common.assertAsMap(request.body);
                request.stream = Tea.toReadable(com.aliyun.teaxml.Client.toXML(reqBodyMap));
                request.headers.put("content-type", "application/xml");
            } else if (com.aliyun.darabonbastring.Client.equals(request.reqBodyType, "json")) {
                String reqBodyStr = com.aliyun.teautil.Common.toJSONString(request.body);
                request.stream = Tea.toReadable(reqBodyStr);
                request.headers.put("content-type", "application/json; charset=utf-8");
            } else if (com.aliyun.darabonbastring.Client.equals(request.reqBodyType, "formData")) {
                java.util.Map<String, Object> reqBodyForm = com.aliyun.teautil.Common.assertAsMap(request.body);
                request.stream = Tea.toReadable(com.aliyun.openapiutil.Client.toForm(reqBodyForm));
                request.headers.put("content-type", "application/x-www-form-urlencoded");
            } else if (com.aliyun.darabonbastring.Client.equals(request.reqBodyType, "binary")) {
                attributeMap.key = TeaConverter.buildMap(
                    new TeaPair("crc", ""),
                    new TeaPair("md5", "")
                );
                request.stream = com.aliyun.ossutil.Client.inject(request.stream, attributeMap.key);
                request.headers.put("content-type", "application/octet-stream");
            }

        }

        String host = this.getHost(config.endpointType, bucketName, config.endpoint);
        request.headers = TeaConverter.merge(String.class,
            TeaConverter.buildMap(
                new TeaPair("host", host),
                new TeaPair("date", com.aliyun.teautil.Common.getDateUTCString()),
                new TeaPair("user-agent", request.userAgent)
            ),
            request.headers
        );
        request.headers.put("authorization", this.getAuthorization(request.signatureVersion, bucketName, request.pathname, request.method, request.query, request.headers, accessKeyId, accessKeySecret));
    }

    public void modifyResponse(com.aliyun.gateway.spi.models.InterceptorContext context, com.aliyun.gateway.spi.models.AttributeMap attributeMap) throws Exception {
        com.aliyun.gateway.spi.models.InterceptorContext.InterceptorContextRequest request = context.request;
        com.aliyun.gateway.spi.models.InterceptorContext.InterceptorContextResponse response = context.response;
        String bodyStr = null;
        if (com.aliyun.teautil.Common.is4xx(response.statusCode) || com.aliyun.teautil.Common.is5xx(response.statusCode)) {
            bodyStr = com.aliyun.teautil.Common.readAsString(response.body);
            if (!com.aliyun.teautil.Common.empty(bodyStr)) {
                java.util.Map<String, Object> respMap = com.aliyun.teaxml.Client.parseXml(bodyStr, null);
                java.util.Map<String, Object> err = com.aliyun.teautil.Common.assertAsMap(respMap.get("Error"));
                throw new TeaException(TeaConverter.buildMap(
                    new TeaPair("code", err.get("Code")),
                    new TeaPair("message", err.get("Message")),
                    new TeaPair("data", TeaConverter.buildMap(
                        new TeaPair("statusCode", response.statusCode),
                        new TeaPair("requestId", err.get("RequestId")),
                        new TeaPair("hostId", err.get("HostId"))
                    ))
                ));
            } else {
                java.util.Map<String, String> headers = response.headers;
                String requestId = headers.get("x-oss-request-id");
                throw new TeaException(TeaConverter.buildMap(
                    new TeaPair("code", response.statusCode),
                    new TeaPair("message", null),
                    new TeaPair("data", TeaConverter.buildMap(
                        new TeaPair("statusCode", response.statusCode),
                        new TeaPair("requestId", "" + requestId + "")
                    ))
                ));
            }

        }

        java.util.Map<String, String> ctx = attributeMap.key;
        if (!com.aliyun.teautil.Common.isUnset(ctx)) {
            if (!com.aliyun.teautil.Common.isUnset(ctx.get("crc")) && !com.aliyun.teautil.Common.isUnset(response.headers.get("x-oss-hash-crc64ecma")) && !com.aliyun.darabonbastring.Client.equals(ctx.get("crc"), response.headers.get("x-oss-hash-crc64ecma"))) {
                throw new TeaException(TeaConverter.buildMap(
                    new TeaPair("code", "CrcNotMatched"),
                    new TeaPair("data", TeaConverter.buildMap(
                        new TeaPair("clientCrc", ctx.get("crc")),
                        new TeaPair("serverCrc", response.headers.get("x-oss-hash-crc64ecma"))
                    ))
                ));
            }

            if (!com.aliyun.teautil.Common.isUnset(ctx.get("md5")) && !com.aliyun.teautil.Common.isUnset(response.headers.get("content-md5")) && !com.aliyun.darabonbastring.Client.equals(ctx.get("md5"), response.headers.get("content-md5"))) {
                throw new TeaException(TeaConverter.buildMap(
                    new TeaPair("code", "MD5NotMatched"),
                    new TeaPair("data", TeaConverter.buildMap(
                        new TeaPair("clientMD5", ctx.get("md5")),
                        new TeaPair("serverMD5", response.headers.get("content-md5"))
                    ))
                ));
            }

        }

        if (!com.aliyun.teautil.Common.isUnset(response.body)) {
            if (com.aliyun.teautil.Common.equalNumber(response.statusCode, 204)) {
                com.aliyun.teautil.Common.readAsString(response.body);
            } else if (com.aliyun.darabonbastring.Client.equals(request.bodyType, "xml")) {
                bodyStr = com.aliyun.teautil.Common.readAsString(response.body);
                java.util.Map<String, Object> result = com.aliyun.teaxml.Client.parseXml(bodyStr, null);
                java.util.List<String> list = com.aliyun.darabonba.map.Client.keySet(result);
                if (com.aliyun.teautil.Common.equalNumber(com.aliyun.darabonba.array.Client.size(list), 1)) {
                    String tmp = list.get(0);
                    try {
                        response.deserializedBody = com.aliyun.teautil.Common.assertAsMap(result.get(tmp));
                    } catch (TeaException error) {
                        response.deserializedBody = result;
                    } catch (Exception _error) {
                        TeaException error = new TeaException(_error.getMessage(), _error);
                        response.deserializedBody = result;
                    }                    
                } else {
                    response.deserializedBody = result;
                }

            } else if (com.aliyun.teautil.Common.equalString(request.bodyType, "binary")) {
                response.deserializedBody = response.body;
            } else if (com.aliyun.teautil.Common.equalString(request.bodyType, "byte")) {
                byte[] byt = com.aliyun.teautil.Common.readAsBytes(response.body);
                response.deserializedBody = byt;
            } else if (com.aliyun.teautil.Common.equalString(request.bodyType, "string")) {
                response.deserializedBody = com.aliyun.teautil.Common.readAsString(response.body);
            } else if (com.aliyun.teautil.Common.equalString(request.bodyType, "json")) {
                Object obj = com.aliyun.teautil.Common.readAsJSON(response.body);
                java.util.Map<String, Object> res = com.aliyun.teautil.Common.assertAsMap(obj);
                response.deserializedBody = res;
            } else if (com.aliyun.teautil.Common.equalString(request.bodyType, "array")) {
                response.deserializedBody = com.aliyun.teautil.Common.readAsJSON(response.body);
            } else {
                response.deserializedBody = com.aliyun.teautil.Common.readAsString(response.body);
            }

        }

    }

    public String getEndpoint(String regionId, String network, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (com.aliyun.teautil.Common.empty(regionId)) {
            regionId = "cn-hangzhou";
        }

        if (!com.aliyun.teautil.Common.empty(network)) {
            if (com.aliyun.darabonbastring.Client.contains(network, "internal")) {
                return "oss-" + regionId + "-internal.aliyuncs.com";
            } else if (com.aliyun.darabonbastring.Client.contains(network, "ipv6")) {
                return "" + regionId + "oss.aliyuncs.com";
            } else if (com.aliyun.darabonbastring.Client.contains(network, "accelerate")) {
                return "oss-" + network + ".aliyuncs.com";
            }

        }

        return "oss-" + regionId + ".aliyuncs.com";
    }

    public String getHost(String endpointType, String bucketName, String endpoint) throws Exception {
        if (com.aliyun.teautil.Common.empty(bucketName)) {
            return endpoint;
        }

        String host = "" + bucketName + "." + endpoint + "";
        if (!com.aliyun.teautil.Common.empty(endpointType)) {
            if (com.aliyun.darabonbastring.Client.equals(endpointType, "ip")) {
                host = "" + endpoint + "/" + bucketName + "";
            } else if (com.aliyun.darabonbastring.Client.equals(endpointType, "cname")) {
                host = endpoint;
            }

        }

        return host;
    }

    public String getAuthorization(String signatureVersion, String bucketName, String pathname, String method, java.util.Map<String, String> query, java.util.Map<String, String> headers, String ak, String secret) throws Exception {
        String sign = "";
        if (com.aliyun.teautil.Common.isUnset(signatureVersion) || com.aliyun.darabonbastring.Client.equals(signatureVersion, "v1")) {
            sign = this.getSignatureV1(bucketName, pathname, method, query, headers, secret);
            return "OSS " + ak + ":" + sign + "";
        } else {
            sign = this.getSignatureV2(bucketName, pathname, method, query, headers, secret);
            return "OSS2 AccessKeyId:" + ak + ",Signature:" + sign + "";
        }

    }

    public String getSignatureV1(String bucketName, String pathname, String method, java.util.Map<String, String> query, java.util.Map<String, String> headers, String secret) throws Exception {
        String resource = "";
        String stringToSign = "";
        if (!com.aliyun.teautil.Common.empty(bucketName)) {
            resource = "/" + bucketName + "";
        }

        resource = "" + resource + "" + pathname + "";
        String canonicalizedResource = this.buildCanonicalizedResource(resource, query);
        String canonicalizedHeaders = this.buildCanonicalizedHeaders(headers);
        stringToSign = "" + method + "\n" + canonicalizedHeaders + "" + canonicalizedResource + "";
        return com.aliyun.darabonba.encode.Encoder.base64EncodeToString(com.aliyun.darabonba.signature.Signer.HmacSHA1Sign(stringToSign, secret));
    }

    public String buildCanonicalizedResource(String pathname, java.util.Map<String, String> query) throws Exception {
        java.util.Map<String, String> subResourcesMap = new java.util.HashMap<>();
        String canonicalizedResource = pathname;
        if (!com.aliyun.teautil.Common.empty(pathname)) {
            java.util.List<String> paths = com.aliyun.darabonbastring.Client.split(pathname, "?", 2);
            canonicalizedResource = paths.get(0);
            if (com.aliyun.teautil.Common.equalNumber(com.aliyun.darabonba.array.Client.size(paths), 2)) {
                java.util.List<String> subResources = com.aliyun.darabonbastring.Client.split(paths.get(1), "&", null);
                for (String sub : subResources) {
                    Boolean hasExcepts = false;
                    for (String excepts : _except_signed_params) {
                        if (com.aliyun.darabonbastring.Client.contains(sub, excepts)) {
                            hasExcepts = true;
                        }

                    }
                    if (!hasExcepts) {
                        java.util.List<String> item = com.aliyun.darabonbastring.Client.split(sub, "=", null);
                        String key = item.get(0);
                        String value = null;
                        if (com.aliyun.teautil.Common.equalNumber(com.aliyun.darabonba.array.Client.size(item), 2)) {
                            value = item.get(1);
                        }

                        subResourcesMap.put(key, value);
                    }

                }
            }

        }

        java.util.List<String> subResourcesArray = com.aliyun.darabonba.map.Client.keySet(subResourcesMap);
        java.util.List<String> newQueryList = subResourcesArray;
        if (!com.aliyun.teautil.Common.isUnset(query)) {
            java.util.List<String> queryList = com.aliyun.darabonba.map.Client.keySet(query);
            newQueryList = com.aliyun.darabonba.array.Client.concat(queryList, subResourcesArray);
        }

        java.util.List<String> sortedParams = com.aliyun.darabonba.array.Client.ascSort(newQueryList);
        String separator = "?";
        for (String paramName : sortedParams) {
            if (com.aliyun.darabonba.array.Client.contains(_default_signed_params, paramName)) {
                canonicalizedResource = "" + canonicalizedResource + "" + separator + "" + paramName + "";
                if (!com.aliyun.teautil.Common.isUnset(query) && !com.aliyun.teautil.Common.isUnset(query.get(paramName))) {
                    canonicalizedResource = "" + canonicalizedResource + "=" + query.get(paramName) + "";
                } else if (!com.aliyun.teautil.Common.isUnset(subResourcesMap.get(paramName))) {
                    canonicalizedResource = "" + canonicalizedResource + "=" + subResourcesMap.get(paramName) + "";
                }

            } else if (com.aliyun.darabonba.array.Client.contains(subResourcesArray, paramName)) {
                canonicalizedResource = "" + canonicalizedResource + "" + separator + "" + paramName + "";
                if (!com.aliyun.teautil.Common.isUnset(subResourcesMap.get(paramName))) {
                    canonicalizedResource = "" + canonicalizedResource + "=" + subResourcesMap.get(paramName) + "";
                }

            }

            separator = "&";
        }
        return canonicalizedResource;
    }

    public String buildCanonicalizedHeaders(java.util.Map<String, String> headers) throws Exception {
        String canonicalizedHeaders = "";
        String contentType = headers.get("content-type");
        if (com.aliyun.teautil.Common.isUnset(contentType)) {
            contentType = "";
        }

        String contentMd5 = headers.get("content-md5");
        if (com.aliyun.teautil.Common.isUnset(contentMd5)) {
            contentMd5 = "";
        }

        canonicalizedHeaders = "" + canonicalizedHeaders + "" + contentMd5 + "\n" + contentType + "\n" + headers.get("date") + "\n";
        java.util.List<String> keys = com.aliyun.darabonba.map.Client.keySet(headers);
        java.util.List<String> sortedHeaders = com.aliyun.darabonba.array.Client.ascSort(keys);
        for (String header : sortedHeaders) {
            if (com.aliyun.darabonbastring.Client.contains(com.aliyun.darabonbastring.Client.toLower(header), "x-oss-") && !com.aliyun.teautil.Common.isUnset(headers.get(header))) {
                canonicalizedHeaders = "" + canonicalizedHeaders + "" + header + ":" + headers.get(header) + "\n";
            }

        }
        return canonicalizedHeaders;
    }

    public String getSignatureV2(String bucketName, String pathname, String method, java.util.Map<String, String> query, java.util.Map<String, String> headers, String secret) throws Exception {
        return "";
    }
}
