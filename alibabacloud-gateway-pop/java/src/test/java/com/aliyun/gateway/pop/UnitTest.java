package com.aliyun.gateway.pop;

import org.junit.Assert;
import org.junit.Test;

public class UnitTest {
    @Test
    public void getRegionTest() throws Exception {
        Client client = new Client();
        Assert.assertEquals("center", client.getRegion(null, null, null));
        Assert.assertEquals("cn-hangzhou", client.getRegion(null, null, "cn-hangzhou"));
        Assert.assertEquals("center", client.getRegion("", "", null));
        Assert.assertEquals("center", client.getRegion("test", "test", null));
        Assert.assertEquals("center", client.getRegion("test", "test.alibaba.api.com", null));
        Assert.assertEquals("center", client.getRegion("test", "test.aliyuncs.com", null));
        Assert.assertEquals("center", client.getRegion("test", "test-dualstack.aliyuncs.com", null));
        Assert.assertEquals("center", client.getRegion("test", "test-inner.aliyuncs.com", null));
        Assert.assertEquals("center", client.getRegion("test", "test-vpc.aliyuncs.com", null));
        Assert.assertEquals("center", client.getRegion("test", "test-share.aliyuncs.com", null));
        Assert.assertEquals("center", client.getRegion("test", "test-cn-hangzhou.aliyuncs.com", null));
        Assert.assertEquals("cn-hangzhou", client.getRegion("test", "test.cn-hangzhou.aliyuncs.com", null));
        Assert.assertEquals("cn-hangzhou", client.getRegion("test", "test-inner.cn-hangzhou.aliyuncs.com", null));
        Assert.assertEquals("cn-hangzhou", client.getRegion("test", "test-vpc.cn-hangzhou.aliyuncs.com", null));
        Assert.assertEquals("cn-hangzhou", client.getRegion("test", "test-share.cn-hangzhou.aliyuncs.com", null));
        Assert.assertEquals("cn-hangzhou", client.getRegion("test", "test-dualstack.cn-hangzhou.aliyuncs.com", null));
        Assert.assertEquals("cn-hangzhou", client.getRegion("test", "test-proxy.cn-hangzhou.aliyuncs.com", null));
        Assert.assertEquals("cn-hangzhou-acdr-ut-1", client.getRegion("test", "test-inner.cn-hangzhou-acdr-ut-1.aliyuncs.com", null));
        Assert.assertEquals("cn-edge-1", client.getRegion("test", "test-inner.cn-edge-1.aliyuncs.com", null));
    }
}