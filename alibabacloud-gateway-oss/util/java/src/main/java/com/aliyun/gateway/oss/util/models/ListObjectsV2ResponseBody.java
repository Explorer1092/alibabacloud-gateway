// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gateway.oss.util.models;

import com.aliyun.tea.*;

public class ListObjectsV2ResponseBody extends TeaModel {
    /**
     * <p>The container that stores the metadata of the returned objects.</p>
     */
    @NameInMap("ListBucketResult")
    public ListBucketResult listBucketResult;

    public static ListObjectsV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListObjectsV2ResponseBody self = new ListObjectsV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public ListObjectsV2ResponseBody setListBucketResult(ListBucketResult listBucketResult) {
        this.listBucketResult = listBucketResult;
        return this;
    }
    public ListBucketResult getListBucketResult() {
        return this.listBucketResult;
    }

    public static class ListBucketResult extends TeaModel {
        /**
         * <p>If the delimiter parameter is specified in the request, the response contains CommonPrefixes. Objects whose names contain the same string from the prefix to the next occurrence of the delimiter are grouped as a single result element in CommonPrefixes.</p>
         */
        @NameInMap("CommonPrefixes")
        public java.util.List<CommonPrefix> commonPrefixes;

        /**
         * <p>The container that stores the metadata of each returned object.</p>
         */
        @NameInMap("Contents")
        public java.util.List<ObjectSummary> contents;

        /**
         * <p>If the continuation-token parameter is specified in the request, the response contains ContinuationToken.</p>
         * 
         * <strong>example:</strong>
         * <p>CgJiYw--</p>
         */
        @NameInMap("ContinuationToken")
        public String continuationToken;

        /**
         * <p>The delimiter used to group objects by name. Objects whose names contain the same string from the prefix to the next occurrence of the delimiter are grouped as a single result element in the CommonPrefixes parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("Delimiter")
        public String delimiter;

        /**
         * <p>The encoding type of the object name in the response. If the encoding-type parameter is specified in the request, the values of Delimiter, StartAfter, Prefix, NextContinuationToken, and Key are encoded in the response.</p>
         * 
         * <strong>example:</strong>
         * <p>url</p>
         */
        @NameInMap("EncodingType")
        public String encodingType;

        /**
         * <p>Indicates whether the returned results are truncated.</p>
         * <p>Valid values: true and false</p>
         * <p>true: indicates that not all of the results are returned for the request.</p>
         * <p>false indicates that all of the results are returned this time.</p>
         * <ul>
         * <li></li>
         * <li></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsTruncated")
        public Boolean isTruncated;

        /**
         * <p>The number of keys returned for this request. If Delimiter is specified, the KeyCount value is the sum of the Key and CommonPrefixes values.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("KeyCount")
        public Integer keyCount;

        /**
         * <p>The maximum number of the returned objects in the response.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MaxKeys")
        public Integer maxKeys;

        /**
         * <p>The name of the bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>example-bucket</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The token from which the next list operation starts. The NextContinuationToken value is used as the ContinuationToken value to query subsequent results.</p>
         * 
         * <strong>example:</strong>
         * <p>CgJiYw--</p>
         */
        @NameInMap("NextContinuationToken")
        public String nextContinuationToken;

        /**
         * <p>The prefix in the names of the returned objects.</p>
         * 
         * <strong>example:</strong>
         * <p>logs/</p>
         */
        @NameInMap("Prefix")
        public String prefix;

        /**
         * <p>If the start-after parameter is specified in the request, the response contains StartAfter.</p>
         * 
         * <strong>example:</strong>
         * <p>test.txt</p>
         */
        @NameInMap("StartAfter")
        public String startAfter;

        public static ListBucketResult build(java.util.Map<String, ?> map) throws Exception {
            ListBucketResult self = new ListBucketResult();
            return TeaModel.build(map, self);
        }

        public ListBucketResult setCommonPrefixes(java.util.List<CommonPrefix> commonPrefixes) {
            this.commonPrefixes = commonPrefixes;
            return this;
        }
        public java.util.List<CommonPrefix> getCommonPrefixes() {
            return this.commonPrefixes;
        }

        public ListBucketResult setContents(java.util.List<ObjectSummary> contents) {
            this.contents = contents;
            return this;
        }
        public java.util.List<ObjectSummary> getContents() {
            return this.contents;
        }

        public ListBucketResult setContinuationToken(String continuationToken) {
            this.continuationToken = continuationToken;
            return this;
        }
        public String getContinuationToken() {
            return this.continuationToken;
        }

        public ListBucketResult setDelimiter(String delimiter) {
            this.delimiter = delimiter;
            return this;
        }
        public String getDelimiter() {
            return this.delimiter;
        }

        public ListBucketResult setEncodingType(String encodingType) {
            this.encodingType = encodingType;
            return this;
        }
        public String getEncodingType() {
            return this.encodingType;
        }

        public ListBucketResult setIsTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }
        public Boolean getIsTruncated() {
            return this.isTruncated;
        }

        public ListBucketResult setKeyCount(Integer keyCount) {
            this.keyCount = keyCount;
            return this;
        }
        public Integer getKeyCount() {
            return this.keyCount;
        }

        public ListBucketResult setMaxKeys(Integer maxKeys) {
            this.maxKeys = maxKeys;
            return this;
        }
        public Integer getMaxKeys() {
            return this.maxKeys;
        }

        public ListBucketResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListBucketResult setNextContinuationToken(String nextContinuationToken) {
            this.nextContinuationToken = nextContinuationToken;
            return this;
        }
        public String getNextContinuationToken() {
            return this.nextContinuationToken;
        }

        public ListBucketResult setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public ListBucketResult setStartAfter(String startAfter) {
            this.startAfter = startAfter;
            return this;
        }
        public String getStartAfter() {
            return this.startAfter;
        }

    }

}
