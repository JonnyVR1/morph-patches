package p149l;

import com.immomo.mediacore.sink.ijkStreamerUtil;
import com.tencent.could.component.common.p079ai.eventreport.entry.NetWorkParam;
import com.tencent.could.huiyansdk.overseas.HuiYanResultSender;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.mmkv.MMKV;
import com.tencent.ugc.TXRecordCommon;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class ejx {

    /* JADX INFO: renamed from: a */
    public int f91848a = 0;

    /* JADX INFO: renamed from: b */
    public int f91851b = 1;

    /* JADX INFO: renamed from: c */
    public String[] f91854c = {""};

    /* JADX INFO: renamed from: d */
    public int f91857d = MMKV.ExpireInHour;

    /* JADX INFO: renamed from: e */
    public int f91860e = 0;

    /* JADX INFO: renamed from: f */
    public int f91863f = 1;

    /* JADX INFO: renamed from: g */
    public int f91866g = 20;

    /* JADX INFO: renamed from: h */
    public int f91869h = 5000;

    /* JADX INFO: renamed from: i */
    public int f91872i = 0;

    /* JADX INFO: renamed from: j */
    public int f91875j = 1;

    /* JADX INFO: renamed from: k */
    public int f91878k = 6;

    /* JADX INFO: renamed from: l */
    public int f91881l = 5000;

    /* JADX INFO: renamed from: m */
    public int f91884m = 6;

    /* JADX INFO: renamed from: n */
    public int f91887n = HuiYanResultSender.TIMEOUT_MS;

    /* JADX INFO: renamed from: o */
    public int f91890o = 0;

    /* JADX INFO: renamed from: p */
    public int f91893p = 0;

    /* JADX INFO: renamed from: q */
    public int f91896q = 0;

    /* JADX INFO: renamed from: r */
    public int f91899r = 0;

    /* JADX INFO: renamed from: s */
    public int f91901s = 0;

    /* JADX INFO: renamed from: t */
    public int f91903t = 1;

    /* JADX INFO: renamed from: u */
    public int f91905u = 2000;

    /* JADX INFO: renamed from: v */
    public int f91907v = 10000;

    /* JADX INFO: renamed from: w */
    public int f91909w = 0;

    /* JADX INFO: renamed from: x */
    public int f91911x = 5;

    /* JADX INFO: renamed from: y */
    public int f91913y = 5;

    /* JADX INFO: renamed from: z */
    public int f91915z = 6;

    /* JADX INFO: renamed from: A */
    public int f91796A = 0;

    /* JADX INFO: renamed from: B */
    public int f91798B = 0;

    /* JADX INFO: renamed from: C */
    public int f91800C = 0;

    /* JADX INFO: renamed from: D */
    public int f91802D = 0;

    /* JADX INFO: renamed from: E */
    public int f91804E = 0;

    /* JADX INFO: renamed from: F */
    public int f91806F = 0;

    /* JADX INFO: renamed from: G */
    public int f91808G = 0;

    /* JADX INFO: renamed from: H */
    public int f91810H = 0;

    /* JADX INFO: renamed from: I */
    public int f91812I = 0;

    /* JADX INFO: renamed from: J */
    public int f91814J = 1;

    /* JADX INFO: renamed from: K */
    public int f91816K = 1;

    /* JADX INFO: renamed from: L */
    public int f91818L = NetWorkParam.DEFAULT_CONNECT_TIME_OUT;

    /* JADX INFO: renamed from: M */
    public int f91820M = 2000;

    /* JADX INFO: renamed from: N */
    public int f91822N = 0;

    /* JADX INFO: renamed from: O */
    public int f91824O = 0;

    /* JADX INFO: renamed from: P */
    public int f91826P = 7;

    /* JADX INFO: renamed from: Q */
    public int f91828Q = 110;

    /* JADX INFO: renamed from: R */
    public int f91830R = 110;

    /* JADX INFO: renamed from: S */
    public int f91832S = 0;

    /* JADX INFO: renamed from: T */
    public int f91834T = 1;

    /* JADX INFO: renamed from: U */
    public int f91836U = 0;

    /* JADX INFO: renamed from: V */
    public String f91838V = "";

    /* JADX INFO: renamed from: W */
    public int f91840W = 80;

    /* JADX INFO: renamed from: X */
    public int f91842X = 0;

    /* JADX INFO: renamed from: Y */
    public int f91844Y = 0;

    /* JADX INFO: renamed from: Z */
    public int f91846Z = 0;

    /* JADX INFO: renamed from: a0 */
    public int f91849a0 = -1;

    /* JADX INFO: renamed from: b0 */
    public int f91852b0 = -1;

    /* JADX INFO: renamed from: c0 */
    public int f91855c0 = 0;

    /* JADX INFO: renamed from: d0 */
    public int f91858d0 = 0;

    /* JADX INFO: renamed from: e0 */
    public int f91861e0 = 0;

    /* JADX INFO: renamed from: f0 */
    public int f91864f0 = 0;

    /* JADX INFO: renamed from: g0 */
    public int f91867g0 = 128;

    /* JADX INFO: renamed from: h0 */
    public int f91870h0 = 0;

    /* JADX INFO: renamed from: i0 */
    public int f91873i0 = 0;

    /* JADX INFO: renamed from: j0 */
    public int f91876j0 = 0;

    /* JADX INFO: renamed from: k0 */
    public int f91879k0 = 0;

    /* JADX INFO: renamed from: l0 */
    public int f91882l0 = 0;

    /* JADX INFO: renamed from: m0 */
    public int f91885m0 = 0;

    /* JADX INFO: renamed from: n0 */
    public int f91888n0 = 0;

    /* JADX INFO: renamed from: o0 */
    public ArrayList<String> f91891o0 = new ArrayList<>();

    /* JADX INFO: renamed from: p0 */
    public String f91894p0 = "";

    /* JADX INFO: renamed from: q0 */
    public int f91897q0 = 1;

    /* JADX INFO: renamed from: r0 */
    public int f91900r0 = 1;

    /* JADX INFO: renamed from: s0 */
    public int f91902s0 = 1000;

    /* JADX INFO: renamed from: t0 */
    public int f91904t0 = 200;

    /* JADX INFO: renamed from: u0 */
    public int f91906u0 = 5;

    /* JADX INFO: renamed from: v0 */
    public int f91908v0 = 15;

    /* JADX INFO: renamed from: w0 */
    public int f91910w0 = 500;

    /* JADX INFO: renamed from: x0 */
    public int f91912x0 = 200;

    /* JADX INFO: renamed from: y0 */
    public int f91914y0 = 0;

    /* JADX INFO: renamed from: z0 */
    public int f91916z0 = 1000;

    /* JADX INFO: renamed from: A0 */
    public int f91797A0 = 200;

    /* JADX INFO: renamed from: B0 */
    public double f91799B0 = 0.8d;

    /* JADX INFO: renamed from: C0 */
    public List<fjx.C16863b> f91801C0 = new ArrayList();

    /* JADX INFO: renamed from: D0 */
    public fjx.C16864c f91803D0 = new fjx.C16864c();

    /* JADX INFO: renamed from: E0 */
    public int f91805E0 = 0;

    /* JADX INFO: renamed from: F0 */
    public int f91807F0 = 0;

    /* JADX INFO: renamed from: G0 */
    public int f91809G0 = 0;

    /* JADX INFO: renamed from: H0 */
    public int f91811H0 = 10000;

    /* JADX INFO: renamed from: I0 */
    public int f91813I0 = ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME;

    /* JADX INFO: renamed from: J0 */
    public int f91815J0 = 0;

    /* JADX INFO: renamed from: K0 */
    public int f91817K0 = 500;

    /* JADX INFO: renamed from: L0 */
    public int f91819L0 = 10;

    /* JADX INFO: renamed from: M0 */
    public int f91821M0 = 10;

    /* JADX INFO: renamed from: N0 */
    public int f91823N0 = 0;

    /* JADX INFO: renamed from: O0 */
    public int f91825O0 = 0;

    /* JADX INFO: renamed from: P0 */
    public float f91827P0 = 1.5f;

    /* JADX INFO: renamed from: Q0 */
    public int f91829Q0 = 1;

    /* JADX INFO: renamed from: R0 */
    public float f91831R0 = 0.5f;

    /* JADX INFO: renamed from: S0 */
    public int f91833S0 = 1;

    /* JADX INFO: renamed from: T0 */
    public int f91835T0 = 1;

    /* JADX INFO: renamed from: U0 */
    public int f91837U0 = 1;

    /* JADX INFO: renamed from: V0 */
    public int f91839V0 = 0;

    /* JADX INFO: renamed from: W0 */
    public int f91841W0 = 0;

    /* JADX INFO: renamed from: X0 */
    public int f91843X0 = TXLiteAVCode.WARNING_START_CAPTURE_IGNORED;

    /* JADX INFO: renamed from: Y0 */
    public int f91845Y0 = 7999;

    /* JADX INFO: renamed from: Z0 */
    public int f91847Z0 = TXRecordCommon.AUDIO_SAMPLERATE_8000;

    /* JADX INFO: renamed from: a1 */
    public float f91850a1 = 1.1f;

    /* JADX INFO: renamed from: b1 */
    public int f91853b1 = 100;

    /* JADX INFO: renamed from: c1 */
    public int f91856c1 = 100;

    /* JADX INFO: renamed from: d1 */
    public int f91859d1 = 1000;

    /* JADX INFO: renamed from: e1 */
    public int f91862e1 = 5000;

    /* JADX INFO: renamed from: f1 */
    public int f91865f1 = 500;

    /* JADX INFO: renamed from: g1 */
    public int f91868g1 = 0;

    /* JADX INFO: renamed from: h1 */
    public float f91871h1 = 1.0f;

    /* JADX INFO: renamed from: i1 */
    public float f91874i1 = 0.0f;

    /* JADX INFO: renamed from: j1 */
    public float f91877j1 = 1.0f;

    /* JADX INFO: renamed from: k1 */
    public float f91880k1 = 1.0f;

    /* JADX INFO: renamed from: l1 */
    public float f91883l1 = 1.0f;

    /* JADX INFO: renamed from: m1 */
    public int f91886m1 = 0;

    /* JADX INFO: renamed from: n1 */
    public int f91889n1 = 0;

    /* JADX INFO: renamed from: o1 */
    public int f91892o1 = 0;

    /* JADX INFO: renamed from: p1 */
    public Map<String, Integer> f91895p1 = new HashMap();

    /* JADX INFO: renamed from: q1 */
    public m1m f91898q1 = new m1m();

    public String toString() {
        return "MediaConfigResultFromJson{enable_roomconfig=" + this.f91848a + ", enable_medialog=" + this.f91851b + ", ipv6pburls=" + Arrays.toString(this.f91854c) + ", v6ProbeInterval=" + this.f91857d + ", slaLogUpload=" + this.f91863f + ", retryListSize=" + this.f91866g + ", retryInterval=" + this.f91869h + ", okhttpRetryCount=" + this.f91872i + ", enableDebugLogUpload=" + this.f91875j + ", pushWatchPackageSize=" + this.f91878k + ", pushWatchInterval=" + this.f91881l + ", pullWatchPackageSize=" + this.f91884m + ", pullWatchInterval=" + this.f91887n + ", disable_ans_momo0=" + this.f91890o + ", disable_ans_agora1=" + this.f91893p + ", disable_ans_weila2=" + this.f91896q + ", disable_ans_tx3=" + this.f91899r + ", enable_b_encode=" + this.f91901s + ", policyDropFrameEnable=" + this.f91903t + ", policyDropFrameBaseMarker=" + this.f91905u + ", policyDropFrameHighMarker=" + this.f91907v + ", policyVideoDynamicScaling=" + this.f91909w + ", policyBufferCheckCount=" + this.f91911x + ", levelChangeMax=" + this.f91913y + ", levelChangeScaling=" + this.f91915z + ", use_vila_decode=" + this.f91796A + ", use_vila_encode=" + this.f91798B + ", use_nc_dynamic=" + this.f91800C + ", use_nc_vad_sc=" + this.f91802D + ", use_mmrtc_HighAudioQualityLevel=" + this.f91804E + ", use_camera_selectFps=" + this.f91806F + ", camera_fps_threshold=" + this.f91808G + ", use_sox=" + this.f91810H + ", use_camera_recordhit=" + this.f91812I + ", enable_momortc_robust=" + this.f91814J + ", enablePushDrop=" + this.f91816K + ", pushDropHighMarker=" + this.f91818L + ", pushDropBaseMarker=" + this.f91820M + ", use_new_whiten=" + this.f91822N + ", usm_enable=" + this.f91824O + ", usm_value_sharp=" + this.f91826P + ", usm_value_saturation=" + this.f91828Q + ", usm_value_contrast=" + this.f91830R + ", nouse=" + this.f91832S + ", faceSkip=" + this.f91834T + ", use_lut=" + this.f91836U + ", lut_url='" + this.f91838V + "', lut_intensity=" + this.f91840W + ", enable_camera2=" + this.f91842X + ", enable_audio_media_headset=" + this.f91844Y + ", enable_tx_audio_media_headset=" + this.f91846Z + ", audioScenario=" + this.f91849a0 + ", audioProfile=" + this.f91852b0 + ", agora_min_bitrate_enable=" + this.f91855c0 + ", agora_min_bitrate_percent=" + this.f91858d0 + ", volc_min_bitrate_enable=" + this.f91861e0 + ", volc_min_bitrate_percent=" + this.f91864f0 + ", tanscode_aBitrate=" + this.f91867g0 + ", volc_gl_flush=" + this.f91870h0 + ", agora_gl_flush=" + this.f91876j0 + ", volc_test_appid_list=" + this.f91891o0 + ", pullConfig='" + this.f91894p0 + "', enable_clear_view=" + this.f91897q0 + ", flvDynamicUpdate=" + this.f91900r0 + ", audio_stacking_duration=" + this.f91902s0 + ", detection_interval=" + this.f91904t0 + ", netspeed_bad_count=" + this.f91906u0 + ", netspeed_good_count=" + this.f91908v0 + ", down_audio_duration=" + this.f91910w0 + ", up_audio_duration=" + this.f91912x0 + ", push_level_change=" + this.f91914y0 + ", abr_duration=" + this.f91916z0 + ", increase_br_step=" + this.f91797A0 + ", abr_coefficient=" + this.f91799B0 + ", mVbrList=" + this.f91801C0 + ", cvConfig=" + this.f91803D0.toString() + ", focus_enable=" + this.f91805E0 + ", hwCodec=" + this.f91807F0 + ", systemFps=" + this.f91809G0 + ", prepareTimeoutMs=" + this.f91811H0 + ", bufferingTimeoutMs=" + this.f91813I0 + ", enableLogBufferAndPullSize=" + this.f91815J0 + ", bufferLogHz=" + this.f91817K0 + ", pullSizeLogCount=" + this.f91819L0 + ", bufferLogCount=" + this.f91821M0 + ", videoRenderTHold=" + this.f91823N0 + ", newEnableLatency=" + this.f91825O0 + ", audioPtsValue=" + this.f91827P0 + ", useOpenGL=" + this.f91829Q0 + ", minVideoJumpDuration=" + this.f91831R0 + ", useNewCheckSei=" + this.f91833S0 + ", decoderRecordPts=" + this.f91837U0 + ", latencyEnable=" + this.f91841W0 + ", latencyBaseMark=" + this.f91843X0 + ", latencySpeedupMark=" + this.f91845Y0 + ", latencyDropMark=" + this.f91847Z0 + ", latencySpeedRate=" + this.f91850a1 + ", bufferFirst=" + this.f91853b1 + ", bufferCurrent=" + this.f91856c1 + ", bufferNext=" + this.f91859d1 + ", bufferLast=" + this.f91862e1 + ", bufferInterval=" + this.f91865f1 + ", filterOn=" + this.f91868g1 + ", saturation=" + this.f91871h1 + ", deblurWeight=" + this.f91874i1 + ", deblurRadius=" + this.f91877j1 + ", deblurThreshold=" + this.f91880k1 + ", contrast=" + this.f91883l1 + ", enableProxy=" + this.f91886m1 + ", enableGpuDecode=" + this.f91889n1 + '}';
    }
}
