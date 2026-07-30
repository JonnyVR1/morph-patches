package com.cosmos.photon.push.channel;

/* JADX INFO: loaded from: classes.dex */
public class ChannelConstant {
    public static final String ADDRESS_DEFAULT = "com.immomo.momo.push.core";
    public static final String COMMAND_CHANNEL = "cmd:channel";
    public static final String COMMAND_EXIT = "cmd:exit";
    public static final String PERMISSION_PUSH = "com.immomo.common.PUSH_SERVICE";

    public interface Action {
        public static final String AIDL_ACTION_CHECK = "check";
        public static final String AIDL_ACTION_LOGOUT = "logout";
        public static final String AIDL_ACTION_SEND_PROBE = "send_probe_packet";
        public static final String AIDL_ACTION_SET_ALIAS = "set_alias";
        public static final String AIDL_ACTION_UNSET_ALIAS = "unset_alias";
        public static final String AIDL_ACTION_WATCH = "watch";
        public static final String PROVIDER_CHANNEL_MSG = "channel_msg";
        public static final String PROVIDER_CHANNEL_PUSH = "channel_push";
        public static final String PROVIDER_CHANNEL_RECEIVE = "channel_receive";
    }

    public interface Keys {
        public static final String KEY_ALIAS = "key_alias";
        public static final String KEY_HAS_CHANNEL = "has_channel";
        public static final String KEY_MSG_DATA = "key_msg";
        public static final String KEY_PACKAGE = "key_pkg";
        public static final String KEY_PUSH_DATA = "key_push_data";
        public static final String KEY_PUSH_DATA_TYPE = "key_push_datatype";
        public static final String KEY_PUSH_JSON_DATA = "key_push_json_data";
        public static final String KEY_RESULT = "key_ret";
        public static final String KEY_TOKEN = "key_token";
    }

    public static String getChannelCommand() {
        return "cmd:channel\nend";
    }

    public static String getExitCommand() {
        return "cmd:exit\nend";
    }

    public static String getPushServiceAction(String str) {
        return str + ".push.core";
    }

    public static String getSchedulerPushServiceAction(String str) {
        return str + ".push.scheduler";
    }
}
