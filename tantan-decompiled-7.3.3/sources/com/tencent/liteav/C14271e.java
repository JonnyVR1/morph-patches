package com.tencent.liteav;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.core.glcore.util.ErrorCode;
import com.google.android.exoplayer2.PlaybackException;
import com.google.firebase.FirebaseError;
import com.tencent.liteav.basic.datareport.C14189a;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.datareport.TXCDRExtInfo;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.TXCStatus;
import com.tencent.liteav.basic.p094d.C14188c;
import com.tencent.liteav.basic.util.C14215f;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.network.p103a.C14304b;
import com.tencent.liteav.network.p103a.C14308e;
import com.tencent.liteav.network.p103a.p104a.C14301a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.tencent.liteav.e */
/* JADX INFO: loaded from: classes2.dex */
public class C14271e {

    /* JADX INFO: renamed from: a */
    private static String f60050a = "TXCDataReport";

    /* JADX INFO: renamed from: u */
    private static HashMap<String, a> f60051u = new HashMap<>();

    /* JADX INFO: renamed from: c */
    private String f60053c;

    /* JADX INFO: renamed from: d */
    private Context f60054d;

    /* JADX INFO: renamed from: f */
    private long f60056f;

    /* JADX INFO: renamed from: g */
    private long f60057g;

    /* JADX INFO: renamed from: i */
    private long f60059i;

    /* JADX INFO: renamed from: j */
    private boolean f60060j;

    /* JADX INFO: renamed from: k */
    private long f60061k;

    /* JADX INFO: renamed from: r */
    private long f60068r;

    /* JADX INFO: renamed from: t */
    private String f60070t;

    /* JADX INFO: renamed from: h */
    private long f60058h = -1;

    /* JADX INFO: renamed from: m */
    private boolean f60063m = false;

    /* JADX INFO: renamed from: n */
    private long f60064n = 0;

    /* JADX INFO: renamed from: o */
    private long f60065o = 0;

    /* JADX INFO: renamed from: p */
    private long f60066p = 0;

    /* JADX INFO: renamed from: q */
    private long f60067q = 0;

    /* JADX INFO: renamed from: s */
    private int f60069s = 0;

    /* JADX INFO: renamed from: v */
    private String f60071v = "";

    /* JADX INFO: renamed from: w */
    private String f60072w = "";

    /* JADX INFO: renamed from: b */
    private HashMap f60052b = new HashMap(100);

    /* JADX INFO: renamed from: e */
    private String f60055e = TXCCommonUtil.getAppVersion();

    /* JADX INFO: renamed from: l */
    private int f60062l = 5000;

    /* JADX INFO: renamed from: com.tencent.liteav.e$a */
    public enum a {
        PENDING,
        CONFIRM,
        NEGATIVE
    }

    public C14271e(Context context) {
        this.f60068r = 0L;
        this.f60054d = context.getApplicationContext();
        this.f60068r = 0L;
    }

    /* JADX INFO: renamed from: a */
    private void m84704a(int i) {
        TXCDRExtInfo tXCDRExtInfo = new TXCDRExtInfo();
        tXCDRExtInfo.url = this.f60053c;
        tXCDRExtInfo.report_common = false;
        tXCDRExtInfo.report_status = false;
        String str = (String) this.f60052b.get("token");
        TXCDRApi.InitEvent(this.f60054d, str, i, C14189a.f59180am, tXCDRExtInfo);
        m84705a(i, str);
        TXCDRApi.txSetEventIntValue(str, i, "u64_timestamp", ((Long) this.f60052b.get("u64_timestamp")).longValue());
        long jM84174a = TXCStatus.m84174a(this.f60071v, 7107);
        long jM84174a2 = TXCStatus.m84174a(this.f60071v, 7108);
        if (jM84174a2 != -1) {
            jM84174a2 -= jM84174a;
        }
        TXCDRApi.txSetEventIntValue(str, i, "u32_dns_time", jM84174a2 < 0 ? -1L : jM84174a2);
        long jM84174a3 = TXCStatus.m84174a(this.f60071v, 7109);
        if (jM84174a3 != -1) {
            jM84174a3 -= jM84174a;
        }
        TXCDRApi.txSetEventIntValue(str, i, "u32_connect_server_time", jM84174a3 >= 0 ? jM84174a3 : -1L);
        int iM84182c = TXCStatus.m84182c(this.f60071v, ErrorCode.EDIT_AUDIOMIX_FAILED);
        TXCDRApi.txSetEventIntValue(str, i, "u32_video_decode_type", iM84182c);
        long jM84174a4 = TXCStatus.m84174a(this.f60071v, 6001) - jM84174a;
        this.f60056f = jM84174a4;
        if (jM84174a4 < 0) {
            jM84174a4 = -1;
        }
        TXCDRApi.txSetEventIntValue(str, i, "u32_first_i_frame", jM84174a4);
        long jM84174a5 = TXCStatus.m84174a(this.f60071v, 7103) - jM84174a;
        TXCDRApi.txSetEventIntValue(str, i, "u32_first_frame_down", jM84174a5 < 0 ? -1L : jM84174a5);
        long jM84174a6 = TXCStatus.m84174a(this.f60071v, ErrorCode.EDIT_VOICECHANGE_INIT_FAILED) - jM84174a;
        TXCDRApi.txSetEventIntValue(str, i, "u32_first_video_decode_time", jM84174a6 < 0 ? -1L : jM84174a6);
        long jM84174a7 = TXCStatus.m84174a(this.f60071v, 7104) - jM84174a;
        if (jM84174a7 < 0) {
            jM84174a7 = -1;
        }
        TXCDRApi.txSetEventIntValue(str, i, "u32_first_audio_frame_down", jM84174a7);
        long jM84174a8 = TXCStatus.m84174a(this.f60071v, 2033) - jM84174a;
        if (jM84174a8 < 0) {
            jM84174a8 = -1;
        }
        TXCDRApi.txSetEventIntValue(str, i, "u32_first_audio_render_time", jM84174a8);
        int iM84182c2 = TXCStatus.m84182c(this.f60071v, 7105);
        TXCDRApi.txSetEventIntValue(str, i, "u64_err_code", iM84182c2);
        int iM84182c3 = TXCStatus.m84182c(this.f60071v, 7106);
        TXCDRApi.txSetEventIntValue(str, i, "str_err_info", iM84182c3);
        int iM84182c4 = TXCStatus.m84182c(this.f60071v, 7112);
        TXCDRApi.txSetEventValue(str, i, "u32_link_type", String.valueOf(iM84182c4));
        int iM84182c5 = TXCStatus.m84182c(this.f60071v, 7111);
        TXCDRApi.txSetEventValue(str, i, "u32_channel_type", String.valueOf(iM84182c5));
        TXCDRApi.txSetEventValue(str, i, "str_app_version", this.f60055e);
        TXCDRApi.nativeReportEvent(str, i);
        TXCLog.m84147d(f60050a, "report evt " + i + ": token=" + str + "\nstr_user_id=" + this.f60052b.get("str_user_id") + "\ndev_uuid=" + this.f60052b.get("dev_uuid") + "\nstr_session_id=" + this.f60052b.get("str_session_id") + "\nstr_device_type=" + this.f60052b.get("str_device_type") + "\nstr_os_info=" + this.f60052b.get("str_os_info") + "\nstr_package_name=" + this.f60052b.get("str_package_name") + "\nu32_network_type=" + this.f60052b.get("u32_network_type") + "\nu32_server_ip=" + this.f60052b.get("u32_server_ip") + "\nstr_stream_url=" + this.f60052b.get("str_stream_url") + "\nu64_timestamp=" + this.f60052b.get("u64_timestamp") + "\nu32_dns_time=" + jM84174a2 + "\nu32_connect_server_time=" + jM84174a3 + "\nu32_video_decode_type=" + iM84182c + "\nu32_first_frame_down=" + jM84174a5 + "\nu32_first_video_decode_time=" + jM84174a6 + "\nu32_first_i_frame=" + this.f60056f + "\nu32_first_audio_frame_down=" + jM84174a7 + "\nu32_first_audio_render_time=" + jM84174a8 + "\nu64_err_code=" + iM84182c2 + "\nstr_err_info=" + iM84182c3 + "\nu32_link_type=" + iM84182c4 + "\nu32_channel_type=" + iM84182c5 + "\nstr_app_version=" + this.f60055e);
    }

    /* JADX INFO: renamed from: b */
    private void m84706b(int i) {
        TXCDRExtInfo tXCDRExtInfo = new TXCDRExtInfo();
        tXCDRExtInfo.url = this.f60053c;
        tXCDRExtInfo.report_common = false;
        tXCDRExtInfo.report_status = false;
        String str = (String) this.f60052b.get("token");
        TXCDRApi.InitEvent(this.f60054d, str, i, C14189a.f59180am, tXCDRExtInfo);
        m84705a(i, str);
        long utcTimeTick = TXCTimeUtil.getUtcTimeTick();
        TXCDRApi.txSetEventIntValue(str, i, "u64_end_timestamp", utcTimeTick);
        TXCDRApi.txSetEventIntValue(str, i, "u64_timestamp", utcTimeTick);
        double dM84184d = TXCStatus.m84184d(this.f60071v, ErrorCode.DECODE_VIDEO_INIT_MUXER_FAILED);
        TXCDRApi.txSetEventValue(str, i, "u32_avg_cpu_usage", String.valueOf(dM84184d));
        double dM84184d2 = TXCStatus.m84184d(this.f60071v, ErrorCode.DECODE_VIDEO_DECODE_FAILED);
        TXCDRApi.txSetEventValue(str, i, "u32_avg_memory", String.valueOf(dM84184d2));
        String strValueOf = String.valueOf(this.f60068r);
        TXCDRApi.txSetEventValue(str, i, "u64_begin_timestamp", strValueOf);
        long timeTick = (TXCTimeUtil.getTimeTick() - TXCStatus.m84174a(this.f60071v, 7107)) / 1000;
        TXCDRApi.txSetEventIntValue(str, i, "u64_playtime", timeTick < 0 ? -1L : timeTick);
        TXCDRApi.txSetEventIntValue(str, i, "u32_result", timeTick < 0 ? -1L : timeTick);
        int iM84182c = TXCStatus.m84182c(this.f60071v, 7105);
        TXCDRApi.txSetEventIntValue(str, i, "u64_err_code", iM84182c);
        int iM84182c2 = TXCStatus.m84182c(this.f60071v, 2004);
        TXCDRApi.txSetEventIntValue(str, i, "u32_speed_cnt", iM84182c2);
        int iM84182c3 = TXCStatus.m84182c(this.f60071v, 2008);
        long j = iM84182c3;
        TXCDRApi.txSetEventIntValue(str, i, "u64_audio_cache_avg", j);
        TXCDRApi.txSetEventIntValue(str, i, "u32_avg_cache_time", j);
        long jM84182c = TXCStatus.m84182c(this.f60071v, 2003);
        TXCDRApi.txSetEventValue(str, i, "u32_max_load", String.valueOf(jM84182c));
        long jM84182c2 = TXCStatus.m84182c(this.f60071v, 2001);
        TXCDRApi.txSetEventValue(str, i, "u32_avg_load", String.valueOf(jM84182c2));
        long jM84182c3 = TXCStatus.m84182c(this.f60071v, 2002);
        TXCDRApi.txSetEventValue(str, i, "u32_load_cnt", String.valueOf(jM84182c3));
        int iM84182c4 = TXCStatus.m84182c(this.f60071v, 2005);
        TXCDRApi.txSetEventIntValue(str, i, "u32_nodata_cnt", iM84182c4);
        long j2 = jM84182c2 * jM84182c3;
        TXCDRApi.txSetEventIntValue(str, i, "u32_audio_block_time", j2);
        TXCDRApi.txSetEventIntValue(str, i, "u32_first_i_frame", this.f60056f);
        int iM84182c5 = TXCStatus.m84182c(this.f60071v, FirebaseError.ERROR_USER_TOKEN_EXPIRED);
        TXCDRApi.txSetEventIntValue(str, i, "u32_video_width", iM84182c5);
        int iM84182c6 = TXCStatus.m84182c(this.f60071v, 17022);
        TXCDRApi.txSetEventIntValue(str, i, "u32_video_height", iM84182c6);
        double dM84184d3 = TXCStatus.m84184d(this.f60071v, 6017);
        TXCDRApi.txSetEventValue(str, i, "u32_video_avg_fps", String.valueOf(dM84184d3));
        long jM84174a = TXCStatus.m84174a(this.f60071v, 6003);
        long jM84174a2 = TXCStatus.m84174a(this.f60071v, PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION);
        long jM84174a3 = TXCStatus.m84174a(this.f60071v, PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR);
        long j3 = jM84174a > 0 ? jM84174a3 / jM84174a : 0L;
        TXCDRApi.txSetEventIntValue(str, i, "u64_block_duration_avg", j3);
        TXCDRApi.txSetEventIntValue(str, i, "u32_avg_block_time", j3);
        TXCDRApi.txSetEventIntValue(str, i, "u64_block_count", jM84174a);
        TXCDRApi.txSetEventIntValue(str, i, "u32_video_block_time", jM84174a3);
        TXCDRApi.txSetEventIntValue(str, i, "u64_block_duration_max", jM84174a2);
        long jM84174a4 = TXCStatus.m84174a(this.f60071v, 6009);
        TXCDRApi.txSetEventIntValue(str, i, "u64_jitter_cache_max", jM84174a4);
        long jM84174a5 = TXCStatus.m84174a(this.f60071v, PlaybackException.ERROR_CODE_DRM_LICENSE_EXPIRED);
        TXCDRApi.txSetEventIntValue(str, i, "u64_jitter_cache_avg", jM84174a5);
        TXCDRApi.txSetEventValue(str, i, "u32_link_type", String.valueOf(TXCStatus.m84182c(this.f60071v, 7112)));
        int iM84182c7 = TXCStatus.m84182c(this.f60071v, 7111);
        TXCDRApi.txSetEventValue(str, i, "u32_channel_type", String.valueOf(iM84182c7));
        int iM84182c8 = TXCStatus.m84182c(this.f60071v, 7113);
        TXCDRApi.txSetEventValue(str, i, "u32_ip_count_quic", String.valueOf(iM84182c8));
        int iM84182c9 = TXCStatus.m84182c(this.f60071v, 7114);
        TXCDRApi.txSetEventValue(str, i, "u32_connect_count_quic", String.valueOf(iM84182c9));
        int iM84182c10 = TXCStatus.m84182c(this.f60071v, 7115);
        TXCDRApi.txSetEventValue(str, i, "u32_connect_count_tcp", String.valueOf(iM84182c10));
        TXCDRApi.txSetEventValue(str, i, "str_app_version", this.f60055e);
        TXCDRApi.txSetEventIntValue(str, i, "u32_is_real_time", TXCStatus.m84174a(this.f60071v, 2009));
        TXCDRApi.nativeReportEvent(str, i);
        TXCLog.m84147d(f60050a, "report evt " + i + ": token=" + str + "\nstr_user_id=" + this.f60052b.get("str_user_id") + "\ndev_uuid=" + this.f60052b.get("dev_uuid") + "\nstr_session_id=" + this.f60052b.get("str_session_id") + "\nstr_device_type=" + this.f60052b.get("str_device_type") + "\nstr_os_info=" + this.f60052b.get("str_os_info") + "\nstr_package_name=" + this.f60052b.get("str_package_name") + "\nu32_network_type=" + this.f60052b.get("u32_network_type") + "\nu32_server_ip=" + this.f60052b.get("u32_server_ip") + "\nstr_stream_url=" + this.f60052b.get("str_stream_url") + "\nu64_timestamp=" + this.f60052b.get("u64_timestamp") + "\nu32_avg_cpu_usage=" + dM84184d + "\nu32_avg_memory=" + dM84184d2 + "\nu32_first_i_frame=" + this.f60056f + "\nu32_video_width=" + iM84182c5 + "\nu32_video_height=" + iM84182c6 + "\nu32_video_avg_fps=" + dM84184d3 + "\nu32_speed_cnt=" + iM84182c2 + "\nu32_nodata_cnt=" + iM84182c4 + "\nu32_avg_cache_time=" + iM84182c3 + "\nu32_avg_block_time=" + j3 + "\nu32_avg_load=" + jM84182c2 + "\nu32_max_load=" + jM84182c + "\nu32_video_block_time=" + jM84174a3 + "\nu32_audio_block_time=" + j2 + "\nu32_load_cnt=" + jM84182c3 + "\nu32_result=" + timeTick + "\nu64_err_code=" + iM84182c + "\nu32_channel_type=" + iM84182c7 + "\nu32_ip_count_quic=" + iM84182c8 + "\nu32_connect_count_quic=" + iM84182c9 + "\nu32_connect_count_tcp=" + iM84182c10 + "\nu64_block_count=" + jM84174a + "\nu64_jitter_cache_max=" + jM84174a4 + "\nu64_jitter_cache_avg=" + jM84174a5 + "\nu64_begin_timestamp=" + strValueOf + "\nu32_is_real_time=" + TXCStatus.m84174a(this.f60071v, 2009) + "\nstr_app_version=" + this.f60055e);
    }

    /* JADX INFO: renamed from: c */
    private void m84707c(int i) {
        TXCDRExtInfo tXCDRExtInfo = new TXCDRExtInfo();
        tXCDRExtInfo.url = this.f60053c;
        tXCDRExtInfo.report_common = false;
        tXCDRExtInfo.report_status = true;
        String str = (String) this.f60052b.get("token");
        TXCDRApi.InitEvent(this.f60054d, str, i, C14189a.f59180am, tXCDRExtInfo);
        m84705a(i, str);
        TXCDRApi.txSetEventIntValue(str, i, "u64_timestamp", TXCTimeUtil.getUtcTimeTick());
        int[] iArrM84226a = C14215f.m84226a();
        TXCDRApi.txSetEventIntValue(str, i, "u32_cpu_usage", iArrM84226a[1]);
        TXCDRApi.txSetEventIntValue(str, i, "u32_app_cpu_usage", iArrM84226a[0]);
        TXCDRApi.txSetEventValue(str, i, "u32_avg_cpu_usage", String.valueOf(TXCStatus.m84184d(this.f60071v, ErrorCode.DECODE_VIDEO_INIT_MUXER_FAILED)));
        TXCDRApi.txSetEventValue(str, i, "u32_avg_memory", String.valueOf(TXCStatus.m84184d(this.f60071v, ErrorCode.DECODE_VIDEO_DECODE_FAILED)));
        TXCDRApi.txSetEventIntValue(str, i, "u32_recv_av_diff_time", TXCStatus.m84175a(this.f60071v, 6014, 2));
        TXCDRApi.txSetEventIntValue(str, i, "u32_play_av_diff_time", TXCStatus.m84175a(this.f60071v, 6013, 2));
        TXCDRApi.txSetEventValue(str, i, "u64_playtime", String.valueOf((TXCTimeUtil.getUtcTimeTick() - this.f60068r) / 1000));
        TXCDRApi.txSetEventIntValue(str, i, "u32_audio_decode_type", TXCStatus.m84182c(this.f60071v, 2015) == 0 ? 2 : 1);
        long jM84174a = TXCStatus.m84174a(this.f60071v, 2002);
        long j = this.f60059i;
        if (j == -1) {
            TXCDRApi.txSetEventIntValue(str, i, "u32_audio_block_count", 0L);
        } else if (jM84174a >= j) {
            TXCDRApi.txSetEventIntValue(str, i, "u32_audio_block_count", jM84174a - j);
        } else {
            TXCDRApi.txSetEventIntValue(str, i, "u32_audio_block_count", -1L);
        }
        this.f60059i = jM84174a;
        TXCDRApi.txSetEventIntValue(str, i, "u32_audio_cache_time", TXCStatus.m84182c(this.f60071v, 2010));
        TXCDRApi.txSetEventIntValue(str, i, "u32_audio_drop", TXCStatus.m84182c(this.f60071v, 2014));
        TXCDRApi.txSetEventIntValue(str, i, "u32_video_decode_type", TXCStatus.m84182c(this.f60071v, ErrorCode.EDIT_AUDIOMIX_FAILED));
        long jM84182c = TXCStatus.m84182c(this.f60071v, 6019);
        long j2 = this.f60058h;
        if (jM84182c >= j2) {
            TXCDRApi.txSetEventIntValue(str, i, "u32_video_recv_fps", (jM84182c - j2) / 2);
        }
        this.f60058h = jM84182c;
        TXCDRApi.txSetEventIntValue(str, i, "u32_fps", (int) TXCStatus.m84184d(this.f60071v, 6002));
        TXCDRApi.txSetEventIntValue(str, i, "u32_video_cache_time", TXCStatus.m84182c(this.f60071v, PlaybackException.ERROR_CODE_DRM_DEVICE_REVOKED));
        long jM84174a2 = TXCStatus.m84174a(this.f60071v, PlaybackException.ERROR_CODE_DRM_LICENSE_EXPIRED);
        TXCDRApi.txSetEventIntValue(str, i, "u32_video_cache_count", jM84174a2);
        TXCDRApi.txSetEventIntValue(str, i, "u32_avg_cache_count", jM84174a2);
        long jM84174a3 = TXCStatus.m84174a(this.f60071v, 6004);
        long j3 = this.f60057g;
        if (j3 != -1 && jM84174a3 >= j3) {
            TXCDRApi.txSetEventIntValue(str, i, "u32_video_block_count", jM84174a3 - j3);
        } else {
            TXCDRApi.txSetEventIntValue(str, i, "u32_video_block_count", 0L);
        }
        this.f60057g = jM84174a3;
        long jM84182c2 = TXCStatus.m84182c(this.f60071v, 7102) + TXCStatus.m84182c(this.f60071v, 7101);
        TXCDRApi.txSetEventIntValue(str, i, "u32_net_speed", jM84182c2);
        TXCDRApi.txSetEventIntValue(str, i, "u32_avg_net_speed", jM84182c2);
        TXCDRApi.txSetEventValue(str, i, "u32_link_type", String.valueOf(TXCStatus.m84182c(this.f60071v, 7112)));
        TXCDRApi.txSetEventValue(str, i, "u32_channel_type", String.valueOf(TXCStatus.m84182c(this.f60071v, 7111)));
        TXCDRApi.txSetEventValue(str, i, "str_app_version", this.f60055e);
        TXCDRApi.nativeReportEvent(str, i);
        if (this.f60063m) {
            this.f60067q++;
            this.f60066p += jM84174a2;
            if (jM84174a2 > this.f60065o) {
                this.f60065o = jM84174a2;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private void m84711f(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("room://")) {
            return;
        }
        String[] strArrSplit = str.split("/");
        strArrSplit[strArrSplit.length - 1].split("_");
        TXCStatus.m84178a(this.f60071v, 7112, (Object) 3L);
    }

    /* JADX INFO: renamed from: g */
    private void m84713g() {
        m84717a(6002, 6017, 6018);
        TXCStatus.m84178a(this.f60071v, ErrorCode.DECODE_AUDIO_INIT_MUXER_FAILED, Integer.valueOf(C14215f.m84226a()[0]));
        m84717a(ErrorCode.DECODE_AUDIO_INIT_MUXER_FAILED, ErrorCode.DECODE_VIDEO_INIT_MUXER_FAILED, ErrorCode.DECODE_AUDIO_CODEC_FAILED);
        TXCStatus.m84178a(this.f60071v, ErrorCode.DECODE_VIDEO_CODEC_FAILED, Integer.valueOf(C14215f.m84227b()));
        m84717a(ErrorCode.DECODE_VIDEO_CODEC_FAILED, ErrorCode.DECODE_VIDEO_DECODE_FAILED, ErrorCode.DECODE_AUDIO_DECODE_FAILED);
    }

    /* JADX INFO: renamed from: h */
    private void m84714h() {
        HashMap map = new HashMap();
        String strM84179b = TXCStatus.m84179b(this.f60071v, 7116);
        String strM84179b2 = TXCStatus.m84179b(this.f60071v, 7117);
        String strM84179b3 = TXCStatus.m84179b(this.f60071v, 7118);
        int iM84182c = TXCStatus.m84182c(this.f60071v, 7105);
        String strM84179b4 = TXCStatus.m84179b(this.f60071v, 7106);
        int iM84182c2 = TXCStatus.m84182c(this.f60071v, 7111);
        map.put("stream_url", strM84179b);
        map.put("stream_id", strM84179b2);
        map.put("bizid", strM84179b3);
        map.put("err_code", String.valueOf(iM84182c));
        map.put("err_info", strM84179b4);
        map.put("channel_type", String.valueOf(iM84182c2));
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.f60064n;
        map.put("start_time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date(this.f60064n)));
        map.put("end_time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date(jCurrentTimeMillis)));
        map.put("total_time", String.valueOf(j));
        long jM84174a = TXCStatus.m84174a(this.f60071v, 6003);
        long jM84174a2 = TXCStatus.m84174a(this.f60071v, PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR);
        long jM84174a3 = TXCStatus.m84174a(this.f60071v, PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION);
        long j2 = jM84174a != 0 ? jM84174a2 / jM84174a : 0L;
        map.put("block_count", String.valueOf(jM84174a));
        map.put("block_duration_max", String.valueOf(jM84174a3));
        map.put("block_duration_avg", String.valueOf(j2));
        long j3 = this.f60067q;
        long j4 = j3 != 0 ? this.f60066p / j3 : 0L;
        map.put("jitter_cache_max", String.valueOf(this.f60065o));
        map.put("jitter_cache_avg", String.valueOf(j4));
        String strTxCreateToken = TXCDRApi.txCreateToken();
        int i = C14189a.f59173af;
        int i2 = C14189a.f59179al;
        TXCDRExtInfo tXCDRExtInfo = new TXCDRExtInfo();
        tXCDRExtInfo.command_id_comment = "LINKMIC";
        TXCDRApi.InitEvent(this.f60054d, strTxCreateToken, i, i2, tXCDRExtInfo);
        TXCLog.m84147d(f60050a, "report evt 40402: token=" + strTxCreateToken);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            TXCLog.m84149e(f60050a, "RealTimePlayStatisticInfo: " + str + " = " + str2);
            if (str != null && str.length() > 0 && str2 != null) {
                TXCDRApi.txSetEventValue(strTxCreateToken, i, str, str2);
            }
        }
        TXCDRApi.nativeReportEvent(strTxCreateToken, i);
        this.f60063m = false;
        this.f60064n = 0L;
        this.f60067q = 0L;
        this.f60066p = 0L;
        this.f60065o = 0L;
    }

    /* JADX INFO: renamed from: i */
    private void m84715i() {
        this.f60060j = false;
        this.f60061k = 0L;
        this.f60069s = 0;
        String strM84229b = this.f60072w;
        if (TextUtils.isEmpty(strM84229b)) {
            strM84229b = TXCCommonUtil.getUserId();
        }
        if (TextUtils.isEmpty(strM84229b)) {
            strM84229b = C14215f.m84229b(this.f60054d);
        }
        this.f60052b.put("str_user_id", strM84229b);
        this.f60052b.put("str_device_type", C14215f.m84232c());
        this.f60052b.put("str_device_type", C14215f.m84232c());
        this.f60052b.put("u32_network_type", Integer.valueOf(C14215f.m84236e(this.f60054d)));
        this.f60052b.put("token", C14215f.m84237e());
        this.f60052b.put("str_package_name", C14215f.m84233c(this.f60054d));
        this.f60052b.put("dev_uuid", C14215f.m84238f(this.f60054d));
        this.f60052b.put("str_os_info", C14215f.m84234d());
        long utcTimeTick = TXCTimeUtil.getUtcTimeTick();
        this.f60068r = utcTimeTick;
        this.f60052b.put("u64_timestamp", Long.valueOf(utcTimeTick));
    }

    /* JADX INFO: renamed from: d */
    public void m84723d() {
        m84713g();
        if (!this.f60060j) {
            long jM84174a = TXCStatus.m84174a(this.f60071v, 6001);
            long jM84174a2 = TXCStatus.m84174a(this.f60071v, 7104);
            long jM84174a3 = TXCStatus.m84174a(this.f60071v, 2033);
            long jM84174a4 = TXCStatus.m84174a(this.f60071v, 7108);
            if (jM84174a > 0 && jM84174a2 > 0 && jM84174a4 > 0 && jM84174a3 > 0) {
                m84704a(this.f60063m ? C14189a.f59138X : C14189a.f59135U);
                this.f60062l = 5000;
                this.f60060j = true;
            }
            String strM84179b = TXCStatus.m84179b(this.f60071v, 7119);
            if (strM84179b != null) {
                m84721b(strM84179b);
            }
        }
        if (this.f60069s >= 3 && !this.f60060j) {
            m84704a(this.f60063m ? C14189a.f59138X : C14189a.f59135U);
            this.f60062l = 5000;
            this.f60060j = true;
        }
        this.f60069s++;
        if (this.f60061k <= 0) {
            this.f60061k = TXCTimeUtil.getTimeTick();
        }
        if (TXCTimeUtil.getTimeTick() > this.f60061k + ((long) this.f60062l)) {
            if (this.f60063m) {
                m84707c(C14189a.f59139Y);
                this.f60062l = 5000;
            } else {
                if (m84722c() == a.NEGATIVE) {
                    return;
                }
                m84707c(C14189a.f59136V);
                int statusReportInterval = TXCDRApi.getStatusReportInterval();
                this.f60062l = statusReportInterval;
                if (statusReportInterval < 5000) {
                    this.f60062l = 5000;
                }
                if (this.f60062l > 300000) {
                    this.f60062l = 300000;
                }
            }
            this.f60057g = TXCStatus.m84174a(this.f60071v, 6004);
            this.f60059i = TXCStatus.m84182c(this.f60071v, 2002);
            this.f60061k = TXCTimeUtil.getTimeTick();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m84725e(String str) {
        this.f60072w = str;
    }

    /* JADX INFO: renamed from: g */
    private int m84712g(String str) {
        Number number = (Number) this.f60052b.get(str);
        if (number != null) {
            return number.intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public void m84724d(String str) {
        this.f60071v = str;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m84708c(String str) {
        if (str == null || !str.contains("myqcloud")) {
            return C14188c.m84036a().m84064a(str);
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public a m84722c() {
        try {
            Uri uri = Uri.parse(this.f60070t);
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
            if (m84708c(host)) {
                return a.CONFIRM;
            }
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (queryParameterNames != null && (queryParameterNames.contains("bizid") || queryParameterNames.contains("txTime") || queryParameterNames.contains("txSecret"))) {
                return a.CONFIRM;
            }
            if (f60051u.containsKey(host)) {
                return f60051u.get(host);
            }
            f60051u.put(host, a.PENDING);
            new Thread(new Runnable() { // from class: com.tencent.liteav.e.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        boolean z = true;
                        C14308e[] c14308eArrMo84859a = C14301a.m84858c().mo84859a(new C14304b(host, true), null);
                        int length = c14308eArrMo84859a.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                z = false;
                                break;
                            }
                            C14308e c14308e = c14308eArrMo84859a[i];
                            if (c14308e.m84872a() && C14271e.m84708c(c14308e.f60338a)) {
                                break;
                            } else {
                                i++;
                            }
                        }
                        C14271e.f60051u.put(host, z ? a.CONFIRM : a.NEGATIVE);
                        TXCLog.m84147d(C14271e.f60050a, host + " isTencent " + z);
                    } catch (Exception e) {
                        TXCLog.m84150e(C14271e.f60050a, "check dns failed.", e);
                    }
                }
            }).start();
            return a.PENDING;
        } catch (Exception e) {
            TXCLog.m84150e(f60050a, "check stream failed.", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m84719a(boolean z) {
        this.f60063m = z;
    }

    /* JADX INFO: renamed from: a */
    public void m84718a(String str) {
        this.f60053c = str;
        m84721b(str);
    }

    /* JADX INFO: renamed from: a */
    public void m84717a(int i, int i2, int i3) {
        String str = this.f60071v;
        if (i == 6002) {
            double dM84184d = TXCStatus.m84184d(str, i);
            if (dM84184d < 0.001d) {
                return;
            }
            double dM84184d2 = TXCStatus.m84184d(this.f60071v, i2);
            int iM84182c = TXCStatus.m84182c(this.f60071v, i3) + 1;
            TXCStatus.m84178a(this.f60071v, i2, Double.valueOf(dM84184d2 + ((dM84184d - dM84184d2) / ((double) iM84182c))));
            TXCStatus.m84178a(this.f60071v, i3, Integer.valueOf(iM84182c));
            return;
        }
        double dM84182c = TXCStatus.m84182c(str, i);
        if (dM84182c < 0.001d) {
            return;
        }
        double dM84184d3 = TXCStatus.m84184d(this.f60071v, i2);
        int iM84182c2 = TXCStatus.m84182c(this.f60071v, i3) + 1;
        TXCStatus.m84178a(this.f60071v, i2, Double.valueOf(dM84184d3 + ((dM84182c - dM84184d3) / ((double) iM84182c2))));
        TXCStatus.m84178a(this.f60071v, i3, Integer.valueOf(iM84182c2));
    }

    /* JADX INFO: renamed from: a */
    public void m84716a() {
        m84715i();
        this.f60057g = -1L;
        this.f60059i = -1L;
        this.f60064n = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: a */
    private void m84705a(int i, String str) {
        String strM84179b = TXCStatus.m84179b(this.f60071v, 7121);
        if (TextUtils.isEmpty(strM84179b)) {
            strM84179b = str;
        }
        this.f60052b.put("str_session_id", strM84179b);
        this.f60052b.put("u32_server_ip", TXCStatus.m84179b(this.f60071v, 7110));
        boolean z = this.f60063m;
        HashMap map = this.f60052b;
        if (z) {
            map.put("str_stream_url", TXCStatus.m84179b(this.f60071v, 7116));
            m84711f((String) this.f60052b.get("str_stream_url"));
        } else {
            map.put("str_stream_url", this.f60053c);
        }
        TXCDRApi.txSetEventValue(str, i, "str_user_id", (String) this.f60052b.get("str_user_id"));
        TXCDRApi.txSetEventValue(str, i, "dev_uuid", (String) this.f60052b.get("dev_uuid"));
        TXCDRApi.txSetEventValue(str, i, "str_session_id", (String) this.f60052b.get("str_session_id"));
        TXCDRApi.txSetEventValue(str, i, "str_device_type", (String) this.f60052b.get("str_device_type"));
        TXCDRApi.txSetEventValue(str, i, "str_os_info", (String) this.f60052b.get("str_os_info"));
        TXCDRApi.txSetEventValue(str, i, "str_package_name", (String) this.f60052b.get("str_package_name"));
        TXCDRApi.txSetEventIntValue(str, i, "u32_network_type", m84712g("u32_network_type"));
        TXCDRApi.txSetEventValue(str, i, "u32_server_ip", (String) this.f60052b.get("u32_server_ip"));
        TXCDRApi.txSetEventValue(str, i, "str_stream_url", (String) this.f60052b.get("str_stream_url"));
    }

    /* JADX INFO: renamed from: b */
    public void m84721b(String str) {
        if (str == null) {
            return;
        }
        this.f60070t = str;
    }

    /* JADX INFO: renamed from: b */
    public void m84720b() {
        if (this.f60060j) {
            if (this.f60063m) {
                m84706b(C14189a.f59140Z);
            } else {
                m84706b(C14189a.f59137W);
            }
        } else {
            TXCLog.m84149e(f60050a, "play " + this.f60053c + " failed");
            if (this.f60063m) {
                m84704a(C14189a.f59138X);
            } else {
                m84704a(C14189a.f59135U);
            }
        }
        if (this.f60063m) {
            m84714h();
        }
        TXCStatus.m84178a(this.f60071v, 7107, (Object) 0L);
        TXCStatus.m84178a(this.f60071v, 2033, (Object) 0L);
        TXCStatus.m84178a(this.f60071v, 6001, (Object) 0L);
        TXCStatus.m84178a(this.f60071v, 7104, (Object) 0L);
        TXCStatus.m84178a(this.f60071v, 7108, (Object) 0L);
    }
}
