// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gateway.oss.util.models;

import com.aliyun.tea.*;

public class ListMultipartUploadsRequest extends TeaModel {
    /**
     * <p>The character used to group objects by name. Objects whose names contain the same string that ranges from the specified prefix to the delimiter that appears for the first time are grouped as a CommonPrefixes element.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("delimiter")
    public String delimiter;

    /**
     * <p>The encoding type of the object name in the response. Values of Delimiter, KeyMarker, Prefix, NextKeyMarker, and Key can be encoded in UTF-8. However, the XML 1.0 standard cannot be used to parse control characters such as characters with an American Standard Code for Information Interchange (ASCII) value from 0 to 10. You can set the encoding-type parameter to encode values of Delimiter, KeyMarker, Prefix, NextKeyMarker, and Key in the response.</p>
     * <p>Default value: null</p>
     * 
     * <strong>example:</strong>
     * <p>The upload ID of the multipart upload task after which the list operation starts. This parameter is used together with the key-marker parameter. </p>
     * <ul>
     * <li>If the key-marker parameter is not specified, OSS ignores the upload-id-marker parameter. </li>
     * <li>If the key-marker parameter is specified, the query result includes the following tasks:<ul>
     * <li>Multipart upload tasks in which object names are alphabetically after the value of the key-marker parameter. </li>
     * <li>Multipart upload tasks in which object names are the same as the value of the key-marker parameter but whose upload IDs are greater than the value of the upload-id-marker parameter.</li>
     * </ul>
     * </li>
     * </ul>
     */
    @NameInMap("encoding-type")
    public String encodingType;

    /**
     * <p>This parameter is used together with the upload-id-marker parameter to specify the position from which the next list begins.</p>
     * <ul>
     * <li><p>If the upload-id-marker parameter is not set, Object Storage Service (OSS) returns all multipart upload tasks in which object names are alphabetically after the key-marker value.</p>
     * </li>
     * <li><p>If the upload-id-marker parameter is set, the response includes the following tasks:</p>
     * <ul>
     * <li><p>Multipart upload tasks in which object names are alphabetically after the key-marker value in alphabetical order</p>
     * </li>
     * <li><p>Multipart upload tasks in which object names are the same as the key-marker parameter value but whose upload IDs are greater than the upload-id-marker parameter value</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test1.avi</p>
     */
    @NameInMap("key-marker")
    public String keyMarker;

    /**
     * <p>The maximumnumber of multipart upload tasks that can be returned for the current request. Default value: 1000. Maximum value: 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("max-uploads")
    public Long maxUploads;

    /**
     * <p>The prefix that the returned object names must contain. If you specify a prefix in the request, the specified prefix is included in the response.</p>
     * <blockquote>
     * <p>You can use prefixes to group and manage objects in buckets in the same way you manage a folder in a file system.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>fun/</p>
     */
    @NameInMap("prefix")
    public String prefix;

    /**
     * <p>The upload ID of the multipart upload task after which the list begins. This parameter is used together with the key-marker parameter.</p>
     * <ul>
     * <li><p>If the key-marker parameter is not set, OSS ignores the upload-id-marker parameter.</p>
     * </li>
     * <li><p>If the key-marker parameter is configured, the query result includes:</p>
     * <ul>
     * <li><p>Multipart upload tasks in which object names are alphabetically after the key-marker value in alphabetical order</p>
     * </li>
     * <li><p>Multipart upload tasks in which object names are the same as the key-marker parameter value but whose upload IDs are greater than the upload-id-marker parameter value</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0004B99B8E707874FC2D692FA5D7****</p>
     */
    @NameInMap("upload-id-marker")
    public String uploadIdMarker;

    public static ListMultipartUploadsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMultipartUploadsRequest self = new ListMultipartUploadsRequest();
        return TeaModel.build(map, self);
    }

    public ListMultipartUploadsRequest setDelimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }
    public String getDelimiter() {
        return this.delimiter;
    }

    public ListMultipartUploadsRequest setEncodingType(String encodingType) {
        this.encodingType = encodingType;
        return this;
    }
    public String getEncodingType() {
        return this.encodingType;
    }

    public ListMultipartUploadsRequest setKeyMarker(String keyMarker) {
        this.keyMarker = keyMarker;
        return this;
    }
    public String getKeyMarker() {
        return this.keyMarker;
    }

    public ListMultipartUploadsRequest setMaxUploads(Long maxUploads) {
        this.maxUploads = maxUploads;
        return this;
    }
    public Long getMaxUploads() {
        return this.maxUploads;
    }

    public ListMultipartUploadsRequest setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public ListMultipartUploadsRequest setUploadIdMarker(String uploadIdMarker) {
        this.uploadIdMarker = uploadIdMarker;
        return this;
    }
    public String getUploadIdMarker() {
        return this.uploadIdMarker;
    }

}
