package com.tencent.liteav;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.core.glcore.util.ErrorCode;
import com.google.android.exoplayer2.PlaybackException;
import com.google.firebase.FirebaseError;
import com.tencent.liteav.basic.datareport.C14026a;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.datareport.TXCDRExtInfo;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.TXCStatus;
import com.tencent.liteav.basic.p089d.C14025c;
import com.tencent.liteav.basic.util.C14052f;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.network.p098a.C14141b;
import com.tencent.liteav.network.p098a.C14145e;
import com.tencent.liteav.network.p098a.p099a.C14138a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.tencent.liteav.e */
/* JADX INFO: loaded from: classes2.dex */
public class C14108e {

    /* JADX INFO: renamed from: a */
    private static String f59202a = "TXCDataReport";

    /* JADX INFO: renamed from: u */
    private static HashMap<String, a> f59203u = new HashMap<>();

    /* JADX INFO: renamed from: c */
    private String f59205c;

    /* JADX INFO: renamed from: d */
    private Context f59206d;

    /* JADX INFO: renamed from: f */
    private long f59208f;

    /* JADX INFO: renamed from: g */
    private long f59209g;

    /* JADX INFO: renamed from: i */
    private long f59211i;

    /* JADX INFO: renamed from: j */
    private boolean f59212j;

    /* JADX INFO: renamed from: k */
    private long f59213k;

    /* JADX INFO: renamed from: r */
    private long f59220r;

    /* JADX INFO: renamed from: t */
    private String f59222t;

    /* JADX INFO: renamed from: h */
    private long f59210h = -1;

    /* JADX INFO: renamed from: m */
    private boolean f59215m = false;

    /* JADX INFO: renamed from: n */
    private long f59216n = 0;

    /* JADX INFO: renamed from: o */
    private long f59217o = 0;

    /* JADX INFO: renamed from: p */
    private long f59218p = 0;

    /* JADX INFO: renamed from: q */
    private long f59219q = 0;

    /* JADX INFO: renamed from: s */
    private int f59221s = 0;

    /* JADX INFO: renamed from: v */
    private String f59223v = "";

    /* JADX INFO: renamed from: w */
    private String f59224w = "";

    /* JADX INFO: renamed from: b */
    private HashMap f59204b = new HashMap(100);

    /* JADX INFO: renamed from: e */
    private String f59207e = TXCCommonUtil.getAppVersion();

    /* JADX INFO: renamed from: l */
    private int f59214l = 5000;

    /* JADX INFO: renamed from: com.tencent.liteav.e$a */
    public enum a {
        PENDING,
        CONFIRM,
        NEGATIVE
    }

    public C14108e(Context context) {
        this.f59220r = 0L;
        this.f59206d = context.getApplicationContext();
        this.f59220r = 0L;
    }

    /* JADX INFO: renamed from: a */
    private void m83521a(int i) {
        TXCDRExtInfo tXCDRExtInfo = new TXCDRExtInfo();
        tXCDRExtInfo.url = this.f59205c;
        tXCDRExtInfo.report_common = false;
        tXCDRExtInfo.report_status = false;
        String str = (String) this.f59204b.get("token");
        TXCDRApi.InitEvent(this.f59206d, str, i, C14026a.f58332am, tXCDRExtInfo);
        m83522a(i, str);
        TXCDRApi.txSetEventIntValue(str, i, "u64_timestamp", ((Long) this.f59204b.get("u64_timestamp")).longValue());
        long jM82991a = TXCStatus.m82991a(this.f59223v, 7107);
        long jM82991a2 = TXCStatus.m82991a(this.f59223v, 7108);
        if (jM82991a2 != -1) {
            jM82991a2 -= jM82991a;
        }
        TXCDRApi.txSetEventIntValue(str, i, "u32_dns_time", jM82991a2 < 0 ? -1L : jM82991a2);
        long jM82991a3 = TXCStatus.m82991a(this.f59223v, 7109);
        if (jM82991a3 != -1) {
            jM82991a3 -= jM82991a;
        }
        TXCDRApi.txSetEventIntValue(str, i, "u32_connect_server_time", jM82991a3 >= 0 ? jM82991a3 : -1L);
        int iM82999c = TXCStatus.m82999c(this.f59223v, ErrorCode.EDIT_AUDIOMIX_FAILED);
        TXCDRApi.txSetEventIntValue(str, i, "u32_video_decode_type", iM82999c);
        long jM82991a4 = TXCStatus.m82991a(this.f59223v, 6001) - jM82991a;
        this.f59208f = jM82991a4;
        if (jM82991a4 < 0) {
            jM82991a4 = -1;
        }
        TXCDRApi.txSetEventIntValue(str, i, "u32_first_i_frame", jM82991a4);
        long jM82991a5 = TXCStatus.m82991a(this.f59223v, 7103) - jM82991a;
        TXCDRApi.txSetEventIntValue(str, i, "u32_first_frame_down", jM82991a5 < 0 ? -1L : jM82991a5);
        long jM82991a6 = TXCStatus.m82991a(this.f59223v, ErrorCode.EDIT_VOICECHANGE_INIT_FAILED) - jM82991a;
        TXCDRApi.txSetEventIntValue(str, i, "u32_first_video_decode_time", jM82991a6 < 0 ? -1L : jM82991a6);
        long jM82991a7 = TXCStatus.m82991a(this.f59223v, 7104) - jM82991a;
        if (jM82991a7 < 0) {
            jM82991a7 = -1;
        }
        TXCDRApi.txSetEventIntValue(str, i, "u32_first_audio_frame_down", jM82991a7);
        long jM82991a8 = TXCStatus.m82991a(this.f59223v, 2033) - jM82991a;
        if (jM82991a8 < 0) {
            jM82991a8 = -1;
        }
        TXCDRApi.txSetEventIntValue(str, i, "u32_first_audio_render_time", jM82991a8);
        int iM82999c2 = TXCStatus.m82999c(this.f59223v, 7105);
        TXCDRApi.txSetEventIntValue(str, i, "u64_err_code", iM82999c2);
        int iM82999c3 = TXCStatus.m82999c(this.f59223v, 7106);
        TXCDRApi.txSetEventIntValue(str, i, "str_err_info", iM82999c3);
        int iM82999c4 = TXCStatus.m82999c(this.f59223v, 7112);
        TXCDRApi.txSetEventValue(str, i, "u32_link_type", String.valueOf(iM82999c4));
        int iM82999c5 = TXCStatus.m82999c(this.f59223v, 7111);
        TXCDRApi.txSetEventValue(str, i, "u32_channel_type", String.valueOf(iM82999c5));
        TXCDRApi.txSetEventValue(str, i, "str_app_version", this.f59207e);
        TXCDRApi.nativeReportEvent(str, i);
        TXCLog.m82964d(f59202a, "report evt " + i + ": token=" + str + "\nstr_user_id=" + this.f59204b.get("str_user_id") + "\ndev_uuid=" + this.f59204b.get("dev_uuid") + "\nstr_session_id=" + this.f59204b.get("str_session_id") + "\nstr_device_type=" + this.f59204b.get("str_device_type") + "\nstr_os_info=" + this.f59204b.get("str_os_info") + "\nstr_package_name=" + this.f59204b.get("str_package_name") + "\nu32_network_type=" + this.f59204b.get("u32_network_type") + "\nu32_server_ip=" + this.f59204b.get("u32_server_ip") + "\nstr_stream_url=" + this.f59204b.get("str_stream_url") + "\nu64_timestamp=" + this.f59204b.get("u64_timestamp") + "\nu32_dns_time=" + jM82991a2 + "\nu32_connect_server_time=" + jM82991a3 + "\nu32_video_decode_type=" + iM82999c + "\nu32_first_frame_down=" + jM82991a5 + "\nu32_first_video_decode_time=" + jM82991a6 + "\nu32_first_i_frame=" + this.f59208f + "\nu32_first_audio_frame_down=" + jM82991a7 + "\nu32_first_audio_render_time=" + jM82991a8 + "\nu64_err_code=" + iM82999c2 + "\nstr_err_info=" + iM82999c3 + "\nu32_link_type=" + iM82999c4 + "\nu32_channel_type=" + iM82999c5 + "\nstr_app_version=" + this.f59207e);
    }

    /* JADX INFO: renamed from: b */
    private void m83523b(int i) {
        TXCDRExtInfo tXCDRExtInfo = new TXCDRExtInfo();
        tXCDRExtInfo.url = this.f59205c;
        tXCDRExtInfo.report_common = false;
        tXCDRExtInfo.report_status = false;
        String str = (String) this.f59204b.get("token");
        TXCDRApi.InitEvent(this.f59206d, str, i, C14026a.f58332am, tXCDRExtInfo);
        m83522a(i, str);
        long utcTimeTick = TXCTimeUtil.getUtcTimeTick();
        TXCDRApi.txSetEventIntValue(str, i, "u64_end_timestamp", utcTimeTick);
        TXCDRApi.txSetEventIntValue(str, i, "u64_timestamp", utcTimeTick);
        double dM83001d = TXCStatus.m83001d(this.f59223v, ErrorCode.DECODE_VIDEO_INIT_MUXER_FAILED);
        TXCDRApi.txSetEventValue(str, i, "u32_avg_cpu_usage", String.valueOf(dM83001d));
        double dM83001d2 = TXCStatus.m83001d(this.f59223v, ErrorCode.DECODE_VIDEO_DECODE_FAILED);
        TXCDRApi.txSetEventValue(str, i, "u32_avg_memory", String.valueOf(dM83001d2));
        String strValueOf = String.valueOf(this.f59220r);
        TXCDRApi.txSetEventValue(str, i, "u64_begin_timestamp", strValueOf);
        long timeTick = (TXCTimeUtil.getTimeTick() - TXCStatus.m82991a(this.f59223v, 7107)) / 1000;
        TXCDRApi.txSetEventIntValue(str, i, "u64_playtime", timeTick < 0 ? -1L : timeTick);
        TXCDRApi.txSetEventIntValue(str, i, "u32_result", timeTick < 0 ? -1L : timeTick);
        int iM82999c = TXCStatus.m82999c(this.f59223v, 7105);
        TXCDRApi.txSetEventIntValue(str, i, "u64_err_code", iM82999c);
        int iM82999c2 = TXCStatus.m82999c(this.f59223v, 2004);
        TXCDRApi.txSetEventIntValue(str, i, "u32_speed_cnt", iM82999c2);
        int iM82999c3 = TXCStatus.m82999c(this.f59223v, 2008);
        long j = iM82999c3;
        TXCDRApi.txSetEventIntValue(str, i, "u64_audio_cache_avg", j);
        TXCDRApi.txSetEventIntValue(str, i, "u32_avg_cache_time", j);
        long jM82999c = TXCStatus.m82999c(this.f59223v, 2003);
        TXCDRApi.txSetEventValue(str, i, "u32_max_load", String.valueOf(jM82999c));
        long jM82999c2 = TXCStatus.m82999c(this.f59223v, 2001);
        TXCDRApi.txSetEventValue(str, i, "u32_avg_load", String.valueOf(jM82999c2));
        long jM82999c3 = TXCStatus.m82999c(this.f59223v, 2002);
        TXCDRApi.txSetEventValue(str, i, "u32_load_cnt", String.valueOf(jM82999c3));
        int iM82999c4 = TXCStatus.m82999c(this.f59223v, 2005);
        TXCDRApi.txSetEventIntValue(str, i, "u32_nodata_cnt", iM82999c4);
        long j2 = jM82999c2 * jM82999c3;
        TXCDRApi.txSetEventIntValue(str, i, "u32_audio_block_time", j2);
        TXCDRApi.txSetEventIntValue(str, i, "u32_first_i_frame", this.f59208f);
        int iM82999c5 = TXCStatus.m82999c(this.f59223v, FirebaseError.ERROR_USER_TOKEN_EXPIRED);
        TXCDRApi.txSetEventIntValue(str, i, "u32_video_width", iM82999c5);
        int iM82999c6 = TXCStatus.m82999c(this.f59223v, 17022);
        TXCDRApi.txSetEventIntValue(str, i, "u32_video_height", iM82999c6);
        double dM83001d3 = TXCStatus.m83001d(this.f59223v, 6017);
        TXCDRApi.txSetEventValue(str, i, "u32_video_avg_fps", String.valueOf(dM83001d3));
        long jM82991a = TXCStatus.m82991a(this.f59223v, 6003);
        long jM82991a2 = TXCStatus.m82991a(this.f59223v, PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION);
        long jM82991a3 = TXCStatus.m82991a(this.f59223v, PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR);
        long j3 = jM82991a > 0 ? jM82991a3 / jM82991a : 0L;
        TXCDRApi.txSetEventIntValue(str, i, "u64_block_duration_avg", j3);
        TXCDRApi.txSetEventIntValue(str, i, "u32_avg_block_time", j3);
        TXCDRApi.txSetEventIntValue(str, i, "u64_block_count", jM82991a);
        TXCDRApi.txSetEventIntValue(str, i, "u32_video_block_time", jM82991a3);
        TXCDRApi.txSetEventIntValue(str, i, "u64_block_duration_max", jM82991a2);
        long jM82991a4 = TXCStatus.m82991a(this.f59223v, 6009);
        TXCDRApi.txSetEventIntValue(str, i, "u64_jitter_cache_max", jM82991a4);
        long jM82991a5 = TXCStatus.m82991a(this.f59223v, PlaybackException.ERROR_CODE_DRM_LICENSE_EXPIRED);
        TXCDRApi.txSetEventIntValue(str, i, "u64_jitter_cache_avg", jM82991a5);
        TXCDRApi.txSetEventValue(str, i, "u32_link_type", String.valueOf(TXCStatus.m82999c(this.f59223v, 7112)));
        int iM82999c7 = TXCStatus.m82999c(this.f59223v, 7111);
        TXCDRApi.txSetEventValue(str, i, "u32_channel_type", String.valueOf(iM82999c7));
        int iM82999c8 = TXCStatus.m82999c(this.f59223v, 7113);
        TXCDRApi.txSetEventValue(str, i, "u32_ip_count_quic", String.valueOf(iM82999c8));
        int iM82999c9 = TXCStatus.m82999c(this.f59223v, 7114);
        TXCDRApi.txSetEventValue(str, i, "u32_connect_count_quic", String.valueOf(iM82999c9));
        int iM82999c10 = TXCStatus.m82999c(this.f59223v, 7115);
        TXCDRApi.txSetEventValue(str, i, "u32_connect_count_tcp", String.valueOf(iM82999c10));
        TXCDRApi.txSetEventValue(str, i, "str_app_version", this.f59207e);
        TXCDRApi.txSetEventIntValue(str, i, "u32_is_real_time", TXCStatus.m82991a(this.f59223v, 2009));
        TXCDRApi.nativeReportEvent(str, i);
        TXCLog.m82964d(f59202a, "report evt " + i + ": token=" + str + "\nstr_user_id=" + this.f59204b.get("str_user_id") + "\ndev_uuid=" + this.f59204b.get("dev_uuid") + "\nstr_session_id=" + this.f59204b.get("str_session_id") + "\nstr_device_type=" + this.f59204b.get("str_device_type") + "\nstr_os_info=" + this.f59204b.get("str_os_info") + "\nstr_package_name=" + this.f59204b.get("str_package_name") + "\nu32_network_type=" + this.f59204b.get("u32_network_type") + "\nu32_server_ip=" + this.f59204b.get("u32_server_ip") + "\nstr_stream_url=" + this.f59204b.get("str_stream_url") + "\nu64_timestamp=" + this.f59204b.get("u64_timestamp") + "\nu32_avg_cpu_usage=" + dM83001d + "\nu32_avg_memory=" + dM83001d2 + "\nu32_first_i_frame=" + this.f59208f + "\nu32_video_width=" + iM82999c5 + "\nu32_video_height=" + iM82999c6 + "\nu32_video_avg_fps=" + dM83001d3 + "\nu32_speed_cnt=" + iM82999c2 + "\nu32_nodata_cnt=" + iM82999c4 + "\nu32_avg_cache_time=" + iM82999c3 + "\nu32_avg_block_time=" + j3 + "\nu32_avg_load=" + jM82999c2 + "\nu32_max_load=" + jM82999c + "\nu32_video_block_time=" + jM82991a3 + "\nu32_audio_block_time=" + j2 + "\nu32_load_cnt=" + jM82999c3 + "\nu32_result=" + timeTick + "\nu64_err_code=" + iM82999c + "\nu32_channel_type=" + iM82999c7 + "\nu32_ip_count_quic=" + iM82999c8 + "\nu32_connect_count_quic=" + iM82999c9 + "\nu32_connect_count_tcp=" + iM82999c10 + "\nu64_block_count=" + jM82991a + "\nu64_jitter_cache_max=" + jM82991a4 + "\nu64_jitter_cache_avg=" + jM82991a5 + "\nu64_begin_timestamp=" + strValueOf + "\nu32_is_real_time=" + TXCStatus.m82991a(this.f59223v, 2009) + "\nstr_app_version=" + this.f59207e);
    }

    /* JADX INFO: renamed from: c */
    private void m83524c(int i) {
        TXCDRExtInfo tXCDRExtInfo = new TXCDRExtInfo();
        tXCDRExtInfo.url = this.f59205c;
        tXCDRExtInfo.report_common = false;
        tXCDRExtInfo.report_status = true;
        String str = (String) this.f59204b.get("token");
        TXCDRApi.InitEvent(this.f59206d, str, i, C14026a.f58332am, tXCDRExtInfo);
        m83522a(i, str);
        TXCDRApi.txSetEventIntValue(str, i, "u64_timestamp", TXCTimeUtil.getUtcTimeTick());
        int[] iArrM83043a = C14052f.m83043a();
        TXCDRApi.txSetEventIntValue(str, i, "u32_cpu_usage", iArrM83043a[1]);
        TXCDRApi.txSetEventIntValue(str, i, "u32_app_cpu_usage", iArrM83043a[0]);
        TXCDRApi.txSetEventValue(str, i, "u32_avg_cpu_usage", String.valueOf(TXCStatus.m83001d(this.f59223v, ErrorCode.DECODE_VIDEO_INIT_MUXER_FAILED)));
        TXCDRApi.txSetEventValue(str, i, "u32_avg_memory", String.valueOf(TXCStatus.m83001d(this.f59223v, ErrorCode.DECODE_VIDEO_DECODE_FAILED)));
        TXCDRApi.txSetEventIntValue(str, i, "u32_recv_av_diff_time", TXCStatus.m82992a(this.f59223v, 6014, 2));
        TXCDRApi.txSetEventIntValue(str, i, "u32_play_av_diff_time", TXCStatus.m82992a(this.f59223v, 6013, 2));
        TXCDRApi.txSetEventValue(str, i, "u64_playtime", String.valueOf((TXCTimeUtil.getUtcTimeTick() - this.f59220r) / 1000));
        TXCDRApi.txSetEventIntValue(str, i, "u32_audio_decode_type", TXCStatus.m82999c(this.f59223v, 2015) == 0 ? 2 : 1);
        long jM82991a = TXCStatus.m82991a(this.f59223v, 2002);
        long j = this.f59211i;
        if (j == -1) {
            TXCDRApi.txSetEventIntValue(str, i, "u32_audio_block_count", 0L);
        } else if (jM82991a >= j) {
            TXCDRApi.txSetEventIntValue(str, i, "u32_audio_block_count", jM82991a - j);
        } else {
            TXCDRApi.txSetEventIntValue(str, i, "u32_audio_block_count", -1L);
        }
        this.f59211i = jM82991a;
        TXCDRApi.txSetEventIntValue(str, i, "u32_audio_cache_time", TXCStatus.m82999c(this.f59223v, 2010));
        TXCDRApi.txSetEventIntValue(str, i, "u32_audio_drop", TXCStatus.m82999c(this.f59223v, 2014));
        TXCDRApi.txSetEventIntValue(str, i, "u32_video_decode_type", TXCStatus.m82999c(this.f59223v, ErrorCode.EDIT_AUDIOMIX_FAILED));
        long jM82999c = TXCStatus.m82999c(this.f59223v, 6019);
        long j2 = this.f59210h;
        if (jM82999c >= j2) {
            TXCDRApi.txSetEventIntValue(str, i, "u32_video_recv_fps", (jM82999c - j2) / 2);
        }
        this.f59210h = jM82999c;
        TXCDRApi.txSetEventIntValue(str, i, "u32_fps", (int) TXCStatus.m83001d(this.f59223v, 6002));
        TXCDRApi.txSetEventIntValue(str, i, "u32_video_cache_time", TXCStatus.m82999c(this.f59223v, PlaybackException.ERROR_CODE_DRM_DEVICE_REVOKED));
        long jM82991a2 = TXCStatus.m82991a(this.f59223v, PlaybackException.ERROR_CODE_DRM_LICENSE_EXPIRED);
        TXCDRApi.txSetEventIntValue(str, i, "u32_video_cache_count", jM82991a2);
        TXCDRApi.txSetEventIntValue(str, i, "u32_avg_cache_count", jM82991a2);
        long jM82991a3 = TXCStatus.m82991a(this.f59223v, 6004);
        long j3 = this.f59209g;
        if (j3 != -1 && jM82991a3 >= j3) {
            TXCDRApi.txSetEventIntValue(str, i, "u32_video_block_count", jM82991a3 - j3);
        } else {
            TXCDRApi.txSetEventIntValue(str, i, "u32_video_block_count", 0L);
        }
        this.f59209g = jM82991a3;
        long jM82999c2 = TXCStatus.m82999c(this.f59223v, 7102) + TXCStatus.m82999c(this.f59223v, 7101);
        TXCDRApi.txSetEventIntValue(str, i, "u32_net_speed", jM82999c2);
        TXCDRApi.txSetEventIntValue(str, i, "u32_avg_net_speed", jM82999c2);
        TXCDRApi.txSetEventValue(str, i, "u32_link_type", String.valueOf(TXCStatus.m82999c(this.f59223v, 7112)));
        TXCDRApi.txSetEventValue(str, i, "u32_channel_type", String.valueOf(TXCStatus.m82999c(this.f59223v, 7111)));
        TXCDRApi.txSetEventValue(str, i, "str_app_version", this.f59207e);
        TXCDRApi.nativeReportEvent(str, i);
        if (this.f59215m) {
            this.f59219q++;
            this.f59218p += jM82991a2;
            if (jM82991a2 > this.f59217o) {
                this.f59217o = jM82991a2;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private void m83528f(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("room://")) {
            return;
        }
        String[] strArrSplit = str.split("/");
        strArrSplit[strArrSplit.length - 1].split("_");
        TXCStatus.m82995a(this.f59223v, 7112, (Object) 3L);
    }

    /* JADX INFO: renamed from: g */
    private void m83530g() {
        m83534a(6002, 6017, 6018);
        TXCStatus.m82995a(this.f59223v, ErrorCode.DECODE_AUDIO_INIT_MUXER_FAILED, Integer.valueOf(C14052f.m83043a()[0]));
        m83534a(ErrorCode.DECODE_AUDIO_INIT_MUXER_FAILED, ErrorCode.DECODE_VIDEO_INIT_MUXER_FAILED, ErrorCode.DECODE_AUDIO_CODEC_FAILED);
        TXCStatus.m82995a(this.f59223v, ErrorCode.DECODE_VIDEO_CODEC_FAILED, Integer.valueOf(C14052f.m83044b()));
        m83534a(ErrorCode.DECODE_VIDEO_CODEC_FAILED, ErrorCode.DECODE_VIDEO_DECODE_FAILED, ErrorCode.DECODE_AUDIO_DECODE_FAILED);
    }

    /* JADX INFO: renamed from: h */
    private void m83531h() {
        HashMap map = new HashMap();
        String strM82996b = TXCStatus.m82996b(this.f59223v, 7116);
        String strM82996b2 = TXCStatus.m82996b(this.f59223v, 7117);
        String strM82996b3 = TXCStatus.m82996b(this.f59223v, 7118);
        int iM82999c = TXCStatus.m82999c(this.f59223v, 7105);
        String strM82996b4 = TXCStatus.m82996b(this.f59223v, 7106);
        int iM82999c2 = TXCStatus.m82999c(this.f59223v, 7111);
        map.put("stream_url", strM82996b);
        map.put("stream_id", strM82996b2);
        map.put("bizid", strM82996b3);
        map.put("err_code", String.valueOf(iM82999c));
        map.put("err_info", strM82996b4);
        map.put("channel_type", String.valueOf(iM82999c2));
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.f59216n;
        map.put("start_time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date(this.f59216n)));
        map.put("end_time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date(jCurrentTimeMillis)));
        map.put("total_time", String.valueOf(j));
        long jM82991a = TXCStatus.m82991a(this.f59223v, 6003);
        long jM82991a2 = TXCStatus.m82991a(this.f59223v, PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR);
        long jM82991a3 = TXCStatus.m82991a(this.f59223v, PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION);
        long j2 = jM82991a != 0 ? jM82991a2 / jM82991a : 0L;
        map.put("block_count", String.valueOf(jM82991a));
        map.put("block_duration_max", String.valueOf(jM82991a3));
        map.put("block_duration_avg", String.valueOf(j2));
        long j3 = this.f59219q;
        long j4 = j3 != 0 ? this.f59218p / j3 : 0L;
        map.put("jitter_cache_max", String.valueOf(this.f59217o));
        map.put("jitter_cache_avg", String.valueOf(j4));
        String strTxCreateToken = TXCDRApi.txCreateToken();
        int i = C14026a.f58325af;
        int i2 = C14026a.f58331al;
        TXCDRExtInfo tXCDRExtInfo = new TXCDRExtInfo();
        tXCDRExtInfo.command_id_comment = "LINKMIC";
        TXCDRApi.InitEvent(this.f59206d, strTxCreateToken, i, i2, tXCDRExtInfo);
        TXCLog.m82964d(f59202a, "report evt 40402: token=" + strTxCreateToken);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            TXCLog.m82966e(f59202a, "RealTimePlayStatisticInfo: " + str + " = " + str2);
            if (str != null && str.length() > 0 && str2 != null) {
                TXCDRApi.txSetEventValue(strTxCreateToken, i, str, str2);
            }
        }
        TXCDRApi.nativeReportEvent(strTxCreateToken, i);
        this.f59215m = false;
        this.f59216n = 0L;
        this.f59219q = 0L;
        this.f59218p = 0L;
        this.f59217o = 0L;
    }

    /* JADX INFO: renamed from: i */
    private void m83532i() {
        this.f59212j = false;
        this.f59213k = 0L;
        this.f59221s = 0;
        String strM83046b = this.f59224w;
        if (TextUtils.isEmpty(strM83046b)) {
            strM83046b = TXCCommonUtil.getUserId();
        }
        if (TextUtils.isEmpty(strM83046b)) {
            strM83046b = C14052f.m83046b(this.f59206d);
        }
        this.f59204b.put("str_user_id", strM83046b);
        this.f59204b.put("str_device_type", C14052f.m83049c());
        this.f59204b.put("str_device_type", C14052f.m83049c());
        this.f59204b.put("u32_network_type", Integer.valueOf(C14052f.m83053e(this.f59206d)));
        this.f59204b.put("token", C14052f.m83054e());
        this.f59204b.put("str_package_name", C14052f.m83050c(this.f59206d));
        this.f59204b.put("dev_uuid", C14052f.m83055f(this.f59206d));
        this.f59204b.put("str_os_info", C14052f.m83051d());
        long utcTimeTick = TXCTimeUtil.getUtcTimeTick();
        this.f59220r = utcTimeTick;
        this.f59204b.put("u64_timestamp", Long.valueOf(utcTimeTick));
    }

    /* JADX INFO: renamed from: d */
    public void m83540d() {
        m83530g();
        if (!this.f59212j) {
            long jM82991a = TXCStatus.m82991a(this.f59223v, 6001);
            long jM82991a2 = TXCStatus.m82991a(this.f59223v, 7104);
            long jM82991a3 = TXCStatus.m82991a(this.f59223v, 2033);
            long jM82991a4 = TXCStatus.m82991a(this.f59223v, 7108);
            if (jM82991a > 0 && jM82991a2 > 0 && jM82991a4 > 0 && jM82991a3 > 0) {
                m83521a(this.f59215m ? C14026a.f58290X : C14026a.f58287U);
                this.f59214l = 5000;
                this.f59212j = true;
            }
            String strM82996b = TXCStatus.m82996b(this.f59223v, 7119);
            if (strM82996b != null) {
                m83538b(strM82996b);
            }
        }
        if (this.f59221s >= 3 && !this.f59212j) {
            m83521a(this.f59215m ? C14026a.f58290X : C14026a.f58287U);
            this.f59214l = 5000;
            this.f59212j = true;
        }
        this.f59221s++;
        if (this.f59213k <= 0) {
            this.f59213k = TXCTimeUtil.getTimeTick();
        }
        if (TXCTimeUtil.getTimeTick() > this.f59213k + ((long) this.f59214l)) {
            if (this.f59215m) {
                m83524c(C14026a.f58291Y);
                this.f59214l = 5000;
            } else {
                if (m83539c() == a.NEGATIVE) {
                    return;
                }
                m83524c(C14026a.f58288V);
                int statusReportInterval = TXCDRApi.getStatusReportInterval();
                this.f59214l = statusReportInterval;
                if (statusReportInterval < 5000) {
                    this.f59214l = 5000;
                }
                if (this.f59214l > 300000) {
                    this.f59214l = 300000;
                }
            }
            this.f59209g = TXCStatus.m82991a(this.f59223v, 6004);
            this.f59211i = TXCStatus.m82999c(this.f59223v, 2002);
            this.f59213k = TXCTimeUtil.getTimeTick();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m83542e(String str) {
        this.f59224w = str;
    }

    /* JADX INFO: renamed from: g */
    private int m83529g(String str) {
        Number number = (Number) this.f59204b.get(str);
        if (number != null) {
            return number.intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public void m83541d(String str) {
        this.f59223v = str;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m83525c(String str) {
        if (str == null || !str.contains("myqcloud")) {
            return C14025c.m82853a().m82881a(str);
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public a m83539c() {
        try {
            Uri uri = Uri.parse(this.f59222t);
            if (uri == null) {
                return a.PENDING;
            }
            final String host = uri.getHost();
            if (TextUtils.isEmpty(host)) {
                return a.PENDING;
            }
            String scheme = uri.getScheme();
            if (scheme == null) {
                return a.PENDING;
            }
            if (!scheme.equals("rtmp") && !scheme.equals("http") && !scheme.equals("https")) {
                return a.PENDING;
            }
            if (m83525c(host)) {
                return a.CONFIRM;
            }
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (queryParameterNames != null && (queryParameterNames.contains("bizid") || queryParameterNames.contains("txTime") || queryParameterNames.contains("txSecret"))) {
                return a.CONFIRM;
            }
            if (f59203u.containsKey(host)) {
                return f59203u.get(host);
            }
            f59203u.put(host, a.PENDING);
            new Thread(new Runnable() { // from class: com.tencent.liteav.e.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        boolean z = true;
                        C14145e[] c14145eArrMo83676a = C14138a.m83675c().mo83676a(new C14141b(host, true), null);
                        int length = c14145eArrMo83676a.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                z = false;
                                break;
                            }
                            C14145e c14145e = c14145eArrMo83676a[i];
                            if (c14145e.m83689a() && C14108e.m83525c(c14145e.f59490a)) {
                                break;
                            } else {
                                i++;
                            }
                        }
                        C14108e.f59203u.put(host, z ? a.CONFIRM : a.NEGATIVE);
                        TXCLog.m82964d(C14108e.f59202a, host + " isTencent " + z);
                    } catch (Exception e) {
                        TXCLog.m82967e(C14108e.f59202a, "check dns failed.", e);
                    }
                }
            }).start();
            return a.PENDING;
        } catch (Exception e) {
            TXCLog.m82967e(f59202a, "check stream failed.", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83536a(boolean z) {
        this.f59215m = z;
    }

    /* JADX INFO: renamed from: a */
    public void m83535a(String str) {
        this.f59205c = str;
        m83538b(str);
    }

    /* JADX INFO: renamed from: a */
    public void m83534a(int i, int i2, int i3) {
        String str = this.f59223v;
        if (i == 6002) {
            double dM83001d = TXCStatus.m83001d(str, i);
            if (dM83001d < 0.001d) {
                return;
            }
            double dM83001d2 = TXCStatus.m83001d(this.f59223v, i2);
            int iM82999c = TXCStatus.m82999c(this.f59223v, i3) + 1;
            TXCStatus.m82995a(this.f59223v, i2, Double.valueOf(dM83001d2 + ((dM83001d - dM83001d2) / ((double) iM82999c))));
            TXCStatus.m82995a(this.f59223v, i3, Integer.valueOf(iM82999c));
            return;
        }
        double dM82999c = TXCStatus.m82999c(str, i);
        if (dM82999c < 0.001d) {
            return;
        }
        double dM83001d3 = TXCStatus.m83001d(this.f59223v, i2);
        int iM82999c2 = TXCStatus.m82999c(this.f59223v, i3) + 1;
        TXCStatus.m82995a(this.f59223v, i2, Double.valueOf(dM83001d3 + ((dM82999c - dM83001d3) / ((double) iM82999c2))));
        TXCStatus.m82995a(this.f59223v, i3, Integer.valueOf(iM82999c2));
    }

    /* JADX INFO: renamed from: a */
    public void m83533a() {
        m83532i();
        this.f59209g = -1L;
        this.f59211i = -1L;
        this.f59216n = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: a */
    private void m83522a(int i, String str) {
        String strM82996b = TXCStatus.m82996b(this.f59223v, 7121);
        if (TextUtils.isEmpty(strM82996b)) {
            strM82996b = str;
        }
        this.f59204b.put("str_session_id", strM82996b);
        this.f59204b.put("u32_server_ip", TXCStatus.m82996b(this.f59223v, 7110));
        boolean z = this.f59215m;
        HashMap map = this.f59204b;
        if (z) {
            map.put("str_stream_url", TXCStatus.m82996b(this.f59223v, 7116));
            m83528f((String) this.f59204b.get("str_stream_url"));
        } else {
            map.put("str_stream_url", this.f59205c);
        }
        TXCDRApi.txSetEventValue(str, i, "str_user_id", (String) this.f59204b.get("str_user_id"));
        TXCDRApi.txSetEventValue(str, i, "dev_uuid", (String) this.f59204b.get("dev_uuid"));
        TXCDRApi.txSetEventValue(str, i, "str_session_id", (String) this.f59204b.get("str_session_id"));
        TXCDRApi.txSetEventValue(str, i, "str_device_type", (String) this.f59204b.get("str_device_type"));
        TXCDRApi.txSetEventValue(str, i, "str_os_info", (String) this.f59204b.get("str_os_info"));
        TXCDRApi.txSetEventValue(str, i, "str_package_name", (String) this.f59204b.get("str_package_name"));
        TXCDRApi.txSetEventIntValue(str, i, "u32_network_type", m83529g("u32_network_type"));
        TXCDRApi.txSetEventValue(str, i, "u32_server_ip", (String) this.f59204b.get("u32_server_ip"));
        TXCDRApi.txSetEventValue(str, i, "str_stream_url", (String) this.f59204b.get("str_stream_url"));
    }

    /* JADX INFO: renamed from: b */
    public void m83538b(String str) {
        if (str == null) {
            return;
        }
        this.f59222t = str;
    }

    /* JADX INFO: renamed from: b */
    public void m83537b() {
        if (this.f59212j) {
            if (this.f59215m) {
                m83523b(C14026a.f58292Z);
            } else {
                m83523b(C14026a.f58289W);
            }
        } else {
            TXCLog.m82966e(f59202a, "play " + this.f59205c + " failed");
            if (this.f59215m) {
                m83521a(C14026a.f58290X);
            } else {
                m83521a(C14026a.f58287U);
            }
        }
        if (this.f59215m) {
            m83531h();
        }
        TXCStatus.m82995a(this.f59223v, 7107, (Object) 0L);
        TXCStatus.m82995a(this.f59223v, 2033, (Object) 0L);
        TXCStatus.m82995a(this.f59223v, 6001, (Object) 0L);
        TXCStatus.m82995a(this.f59223v, 7104, (Object) 0L);
        TXCStatus.m82995a(this.f59223v, 7108, (Object) 0L);
    }
}
