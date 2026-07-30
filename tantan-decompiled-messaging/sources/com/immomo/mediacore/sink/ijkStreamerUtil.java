package com.immomo.mediacore.sink;

/* JADX INFO: loaded from: classes7.dex */
public class ijkStreamerUtil {
    public static final int FFS_PROP_INT64_AACPROFILE = 30002;
    public static final int FFS_PROP_INT64_AUDIOCACHE_DURATION = 20007;
    public static final int FFS_PROP_INT64_AUDIOCACHE_PACKET = 20008;
    public static final int FFS_PROP_INT64_AUDIOCACHE_SIZE = 20009;
    public static final int FFS_PROP_INT64_AUDIOENCODER_PACKETS = 20011;
    public static final int FFS_PROP_INT64_AUDIOENCODER_SIZE = 20010;
    public static final int FFS_PROP_INT64_AUDIOWRITED_PACKETS = 20020;
    public static final int FFS_PROP_INT64_AUDIO_SENDSIZE = 20022;
    public static final int FFS_PROP_INT64_CONNECT_TIME = 20002;
    public static final int FFS_PROP_INT64_CREAT_TIME = 20000;
    public static final int FFS_PROP_INT64_FIRST_AUDIOPACKET_TIME = 20016;
    public static final int FFS_PROP_INT64_FIRST_PACKET_SEND_TIME = 20003;
    public static final int FFS_PROP_INT64_FIRST_VIDEOPACKET_TIME = 20015;
    public static final int FFS_PROP_INT64_MIN_VIDEOCACHE_DURATION = 20014;
    public static final int FFS_PROP_INT64_RECORD_DURATION = 20017;
    public static final int FFS_PROP_INT64_RECORD_HEIGHT = 20019;
    public static final int FFS_PROP_INT64_RECORD_WIDHT = 20018;
    public static final int FFS_PROP_INT64_SERVER_TIME = 20001;
    public static final int FFS_PROP_INT64_VIDEOCACHE_DURATION = 20004;
    public static final int FFS_PROP_INT64_VIDEOCACHE_PACKET = 20005;
    public static final int FFS_PROP_INT64_VIDEOCACHE_SIZE = 20006;
    public static final int FFS_PROP_INT64_VIDEOENCODER_PACKETS = 20013;
    public static final int FFS_PROP_INT64_VIDEOENCODER_SIZE = 20012;
    public static final int FFS_PROP_INT64_VIDEO_SENDNUM = 20023;
    public static final int FFS_PROP_INT64_VIDEO_SENDSIZE = 20021;

    public interface ExternAudioDevStatusCallback {
        void onAudioDevStatusNotify(int i);
    }

    public interface JsonDateCallback {
        void JsonDateCallback(byte[] bArr, int i, Object obj);
    }
}
