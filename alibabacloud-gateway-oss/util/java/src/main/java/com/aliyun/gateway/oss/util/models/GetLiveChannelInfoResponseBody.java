// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gateway.oss.util.models;

import com.aliyun.tea.*;

public class GetLiveChannelInfoResponseBody extends TeaModel {
    /**
     * <p>The container that stores the returned results of the GetLiveChannelInfo request.</p>
     */
    @NameInMap("LiveChannelConfiguration")
    public LiveChannelConfiguration liveChannelConfiguration;

    public static GetLiveChannelInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLiveChannelInfoResponseBody self = new GetLiveChannelInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLiveChannelInfoResponseBody setLiveChannelConfiguration(LiveChannelConfiguration liveChannelConfiguration) {
        this.liveChannelConfiguration = liveChannelConfiguration;
        return this;
    }
    public LiveChannelConfiguration getLiveChannelConfiguration() {
        return this.liveChannelConfiguration;
    }

    public static class LiveChannelConfiguration extends TeaModel {
        /**
         * <p>The description of the LiveChannel.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The status of the LiveChannel.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>enabled: indicates that the LiveChannel is enabled.</li>
         * <li>disabled: indicates that the LiveChannel is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The container that stores the configurations used by the LiveChannel to store uploaded data.</p>
         * <blockquote>
         * <p>FragDuration, FragCount, and PlaylistName are returned only when the value of Type is HLS.</p>
         * </blockquote>
         */
        @NameInMap("Target")
        public LiveChannelTarget target;

        public static LiveChannelConfiguration build(java.util.Map<String, ?> map) throws Exception {
            LiveChannelConfiguration self = new LiveChannelConfiguration();
            return TeaModel.build(map, self);
        }

        public LiveChannelConfiguration setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public LiveChannelConfiguration setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public LiveChannelConfiguration setTarget(LiveChannelTarget target) {
            this.target = target;
            return this;
        }
        public LiveChannelTarget getTarget() {
            return this.target;
        }

    }

}
