// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gateway.oss.util.models;

import com.aliyun.tea.*;

public class DeleteAccessPointPublicAccessBlockRequest extends TeaModel {
    /**
     * <p>The name of the access point.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-01</p>
     */
    @NameInMap("x-oss-access-point-name")
    public String xOssAccessPointName;

    public static DeleteAccessPointPublicAccessBlockRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessPointPublicAccessBlockRequest self = new DeleteAccessPointPublicAccessBlockRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAccessPointPublicAccessBlockRequest setXOssAccessPointName(String xOssAccessPointName) {
        this.xOssAccessPointName = xOssAccessPointName;
        return this;
    }
    public String getXOssAccessPointName() {
        return this.xOssAccessPointName;
    }

}
