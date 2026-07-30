package p153l;

import com.immomo.mediacore.sink.ijkStreamerUtil;
import com.tencent.could.component.common.p084ai.eventreport.entry.NetWorkParam;
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
public class bsx {

    /* JADX INFO: renamed from: a */
    public int f78248a = 0;

    /* JADX INFO: renamed from: b */
    public int f78251b = 1;

    /* JADX INFO: renamed from: c */
    public String[] f78254c = {""};

    /* JADX INFO: renamed from: d */
    public int f78257d = MMKV.ExpireInHour;

    /* JADX INFO: renamed from: e */
    public int f78260e = 0;

    /* JADX INFO: renamed from: f */
    public int f78263f = 1;

    /* JADX INFO: renamed from: g */
    public int f78266g = 20;

    /* JADX INFO: renamed from: h */
    public int f78269h = 5000;

    /* JADX INFO: renamed from: i */
    public int f78272i = 0;

    /* JADX INFO: renamed from: j */
    public int f78275j = 1;

    /* JADX INFO: renamed from: k */
    public int f78278k = 6;

    /* JADX INFO: renamed from: l */
    public int f78281l = 5000;

    /* JADX INFO: renamed from: m */
    public int f78284m = 6;

    /* JADX INFO: renamed from: n */
    public int f78287n = HuiYanResultSender.TIMEOUT_MS;

    /* JADX INFO: renamed from: o */
    public int f78290o = 0;

    /* JADX INFO: renamed from: p */
    public int f78293p = 0;

    /* JADX INFO: renamed from: q */
    public int f78296q = 0;

    /* JADX INFO: renamed from: r */
    public int f78299r = 0;

    /* JADX INFO: renamed from: s */
    public int f78301s = 0;

    /* JADX INFO: renamed from: t */
    public int f78303t = 1;

    /* JADX INFO: renamed from: u */
    public int f78305u = 2000;

    /* JADX INFO: renamed from: v */
    public int f78307v = 10000;

    /* JADX INFO: renamed from: w */
    public int f78309w = 0;

    /* JADX INFO: renamed from: x */
    public int f78311x = 5;

    /* JADX INFO: renamed from: y */
    public int f78313y = 5;

    /* JADX INFO: renamed from: z */
    public int f78315z = 6;

    /* JADX INFO: renamed from: A */
    public int f78196A = 0;

    /* JADX INFO: renamed from: B */
    public int f78198B = 0;

    /* JADX INFO: renamed from: C */
    public int f78200C = 0;

    /* JADX INFO: renamed from: D */
    public int f78202D = 0;

    /* JADX INFO: renamed from: E */
    public int f78204E = 0;

    /* JADX INFO: renamed from: F */
    public int f78206F = 0;

    /* JADX INFO: renamed from: G */
    public int f78208G = 0;

    /* JADX INFO: renamed from: H */
    public int f78210H = 0;

    /* JADX INFO: renamed from: I */
    public int f78212I = 0;

    /* JADX INFO: renamed from: J */
    public int f78214J = 1;

    /* JADX INFO: renamed from: K */
    public int f78216K = 1;

    /* JADX INFO: renamed from: L */
    public int f78218L = NetWorkParam.DEFAULT_CONNECT_TIME_OUT;

    /* JADX INFO: renamed from: M */
    public int f78220M = 2000;

    /* JADX INFO: renamed from: N */
    public int f78222N = 0;

    /* JADX INFO: renamed from: O */
    public int f78224O = 0;

    /* JADX INFO: renamed from: P */
    public int f78226P = 7;

    /* JADX INFO: renamed from: Q */
    public int f78228Q = 110;

    /* JADX INFO: renamed from: R */
    public int f78230R = 110;

    /* JADX INFO: renamed from: S */
    public int f78232S = 0;

    /* JADX INFO: renamed from: T */
    public int f78234T = 1;

    /* JADX INFO: renamed from: U */
    public int f78236U = 0;

    /* JADX INFO: renamed from: V */
    public String f78238V = "";

    /* JADX INFO: renamed from: W */
    public int f78240W = 80;

    /* JADX INFO: renamed from: X */
    public int f78242X = 0;

    /* JADX INFO: renamed from: Y */
    public int f78244Y = 0;

    /* JADX INFO: renamed from: Z */
    public int f78246Z = 0;

    /* JADX INFO: renamed from: a0 */
    public int f78249a0 = -1;

    /* JADX INFO: renamed from: b0 */
    public int f78252b0 = -1;

    /* JADX INFO: renamed from: c0 */
    public int f78255c0 = 0;

    /* JADX INFO: renamed from: d0 */
    public int f78258d0 = 0;

    /* JADX INFO: renamed from: e0 */
    public int f78261e0 = 0;

    /* JADX INFO: renamed from: f0 */
    public int f78264f0 = 0;

    /* JADX INFO: renamed from: g0 */
    public int f78267g0 = 128;

    /* JADX INFO: renamed from: h0 */
    public int f78270h0 = 0;

    /* JADX INFO: renamed from: i0 */
    public int f78273i0 = 0;

    /* JADX INFO: renamed from: j0 */
    public int f78276j0 = 0;

    /* JADX INFO: renamed from: k0 */
    public int f78279k0 = 0;

    /* JADX INFO: renamed from: l0 */
    public int f78282l0 = 0;

    /* JADX INFO: renamed from: m0 */
    public int f78285m0 = 0;

    /* JADX INFO: renamed from: n0 */
    public int f78288n0 = 0;

    /* JADX INFO: renamed from: o0 */
    public ArrayList<String> f78291o0 = new ArrayList<>();

    /* JADX INFO: renamed from: p0 */
    public String f78294p0 = "";

    /* JADX INFO: renamed from: q0 */
    public int f78297q0 = 1;

    /* JADX INFO: renamed from: r0 */
    public int f78300r0 = 1;

    /* JADX INFO: renamed from: s0 */
    public int f78302s0 = 1000;

    /* JADX INFO: renamed from: t0 */
    public int f78304t0 = 200;

    /* JADX INFO: renamed from: u0 */
    public int f78306u0 = 5;

    /* JADX INFO: renamed from: v0 */
    public int f78308v0 = 15;

    /* JADX INFO: renamed from: w0 */
    public int f78310w0 = 500;

    /* JADX INFO: renamed from: x0 */
    public int f78312x0 = 200;

    /* JADX INFO: renamed from: y0 */
    public int f78314y0 = 0;

    /* JADX INFO: renamed from: z0 */
    public int f78316z0 = 1000;

    /* JADX INFO: renamed from: A0 */
    public int f78197A0 = 200;

    /* JADX INFO: renamed from: B0 */
    public double f78199B0 = 0.8d;

    /* JADX INFO: renamed from: C0 */
    public List<csx.C16354b> f78201C0 = new ArrayList();

    /* JADX INFO: renamed from: D0 */
    public csx.C16355c f78203D0 = new csx.C16355c();

    /* JADX INFO: renamed from: E0 */
    public int f78205E0 = 0;

    /* JADX INFO: renamed from: F0 */
    public int f78207F0 = 0;

    /* JADX INFO: renamed from: G0 */
    public int f78209G0 = 0;

    /* JADX INFO: renamed from: H0 */
    public int f78211H0 = 10000;

    /* JADX INFO: renamed from: I0 */
    public int f78213I0 = ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME;

    /* JADX INFO: renamed from: J0 */
    public int f78215J0 = 0;

    /* JADX INFO: renamed from: K0 */
    public int f78217K0 = 500;

    /* JADX INFO: renamed from: L0 */
    public int f78219L0 = 10;

    /* JADX INFO: renamed from: M0 */
    public int f78221M0 = 10;

    /* JADX INFO: renamed from: N0 */
    public int f78223N0 = 0;

    /* JADX INFO: renamed from: O0 */
    public int f78225O0 = 0;

    /* JADX INFO: renamed from: P0 */
    public float f78227P0 = 1.5f;

    /* JADX INFO: renamed from: Q0 */
    public int f78229Q0 = 1;

    /* JADX INFO: renamed from: R0 */
    public float f78231R0 = 0.5f;

    /* JADX INFO: renamed from: S0 */
    public int f78233S0 = 1;

    /* JADX INFO: renamed from: T0 */
    public int f78235T0 = 1;

    /* JADX INFO: renamed from: U0 */
    public int f78237U0 = 1;

    /* JADX INFO: renamed from: V0 */
    public int f78239V0 = 0;

    /* JADX INFO: renamed from: W0 */
    public int f78241W0 = 0;

    /* JADX INFO: renamed from: X0 */
    public int f78243X0 = TXLiteAVCode.WARNING_START_CAPTURE_IGNORED;

    /* JADX INFO: renamed from: Y0 */
    public int f78245Y0 = 7999;

    /* JADX INFO: renamed from: Z0 */
    public int f78247Z0 = TXRecordCommon.AUDIO_SAMPLERATE_8000;

    /* JADX INFO: renamed from: a1 */
    public float f78250a1 = 1.1f;

    /* JADX INFO: renamed from: b1 */
    public int f78253b1 = 100;

    /* JADX INFO: renamed from: c1 */
    public int f78256c1 = 100;

    /* JADX INFO: renamed from: d1 */
    public int f78259d1 = 1000;

    /* JADX INFO: renamed from: e1 */
    public int f78262e1 = 5000;

    /* JADX INFO: renamed from: f1 */
    public int f78265f1 = 500;

    /* JADX INFO: renamed from: g1 */
    public int f78268g1 = 0;

    /* JADX INFO: renamed from: h1 */
    public float f78271h1 = 1.0f;

    /* JADX INFO: renamed from: i1 */
    public float f78274i1 = 0.0f;

    /* JADX INFO: renamed from: j1 */
    public float f78277j1 = 1.0f;

    /* JADX INFO: renamed from: k1 */
    public float f78280k1 = 1.0f;

    /* JADX INFO: renamed from: l1 */
    public float f78283l1 = 1.0f;

    /* JADX INFO: renamed from: m1 */
    public int f78286m1 = 0;

    /* JADX INFO: renamed from: n1 */
    public int f78289n1 = 0;

    /* JADX INFO: renamed from: o1 */
    public int f78292o1 = 0;

    /* JADX INFO: renamed from: p1 */
    public Map<String, Integer> f78295p1 = new HashMap();

    /* JADX INFO: renamed from: q1 */
    public f4m f78298q1 = new f4m();

    public String toString() {
        return "MediaConfigResultFromJson{enable_roomconfig=" + this.f78248a + ", enable_medialog=" + this.f78251b + ", ipv6pburls=" + Arrays.toString(this.f78254c) + ", v6ProbeInterval=" + this.f78257d + ", slaLogUpload=" + this.f78263f + ", retryListSize=" + this.f78266g + ", retryInterval=" + this.f78269h + ", okhttpRetryCount=" + this.f78272i + ", enableDebugLogUpload=" + this.f78275j + ", pushWatchPackageSize=" + this.f78278k + ", pushWatchInterval=" + this.f78281l + ", pullWatchPackageSize=" + this.f78284m + ", pullWatchInterval=" + this.f78287n + ", disable_ans_momo0=" + this.f78290o + ", disable_ans_agora1=" + this.f78293p + ", disable_ans_weila2=" + this.f78296q + ", disable_ans_tx3=" + this.f78299r + ", enable_b_encode=" + this.f78301s + ", policyDropFrameEnable=" + this.f78303t + ", policyDropFrameBaseMarker=" + this.f78305u + ", policyDropFrameHighMarker=" + this.f78307v + ", policyVideoDynamicScaling=" + this.f78309w + ", policyBufferCheckCount=" + this.f78311x + ", levelChangeMax=" + this.f78313y + ", levelChangeScaling=" + this.f78315z + ", use_vila_decode=" + this.f78196A + ", use_vila_encode=" + this.f78198B + ", use_nc_dynamic=" + this.f78200C + ", use_nc_vad_sc=" + this.f78202D + ", use_mmrtc_HighAudioQualityLevel=" + this.f78204E + ", use_camera_selectFps=" + this.f78206F + ", camera_fps_threshold=" + this.f78208G + ", use_sox=" + this.f78210H + ", use_camera_recordhit=" + this.f78212I + ", enable_momortc_robust=" + this.f78214J + ", enablePushDrop=" + this.f78216K + ", pushDropHighMarker=" + this.f78218L + ", pushDropBaseMarker=" + this.f78220M + ", use_new_whiten=" + this.f78222N + ", usm_enable=" + this.f78224O + ", usm_value_sharp=" + this.f78226P + ", usm_value_saturation=" + this.f78228Q + ", usm_value_contrast=" + this.f78230R + ", nouse=" + this.f78232S + ", faceSkip=" + this.f78234T + ", use_lut=" + this.f78236U + ", lut_url='" + this.f78238V + "', lut_intensity=" + this.f78240W + ", enable_camera2=" + this.f78242X + ", enable_audio_media_headset=" + this.f78244Y + ", enable_tx_audio_media_headset=" + this.f78246Z + ", audioScenario=" + this.f78249a0 + ", audioProfile=" + this.f78252b0 + ", agora_min_bitrate_enable=" + this.f78255c0 + ", agora_min_bitrate_percent=" + this.f78258d0 + ", volc_min_bitrate_enable=" + this.f78261e0 + ", volc_min_bitrate_percent=" + this.f78264f0 + ", tanscode_aBitrate=" + this.f78267g0 + ", volc_gl_flush=" + this.f78270h0 + ", agora_gl_flush=" + this.f78276j0 + ", volc_test_appid_list=" + this.f78291o0 + ", pullConfig='" + this.f78294p0 + "', enable_clear_view=" + this.f78297q0 + ", flvDynamicUpdate=" + this.f78300r0 + ", audio_stacking_duration=" + this.f78302s0 + ", detection_interval=" + this.f78304t0 + ", netspeed_bad_count=" + this.f78306u0 + ", netspeed_good_count=" + this.f78308v0 + ", down_audio_duration=" + this.f78310w0 + ", up_audio_duration=" + this.f78312x0 + ", push_level_change=" + this.f78314y0 + ", abr_duration=" + this.f78316z0 + ", increase_br_step=" + this.f78197A0 + ", abr_coefficient=" + this.f78199B0 + ", mVbrList=" + this.f78201C0 + ", cvConfig=" + this.f78203D0.toString() + ", focus_enable=" + this.f78205E0 + ", hwCodec=" + this.f78207F0 + ", systemFps=" + this.f78209G0 + ", prepareTimeoutMs=" + this.f78211H0 + ", bufferingTimeoutMs=" + this.f78213I0 + ", enableLogBufferAndPullSize=" + this.f78215J0 + ", bufferLogHz=" + this.f78217K0 + ", pullSizeLogCount=" + this.f78219L0 + ", bufferLogCount=" + this.f78221M0 + ", videoRenderTHold=" + this.f78223N0 + ", newEnableLatency=" + this.f78225O0 + ", audioPtsValue=" + this.f78227P0 + ", useOpenGL=" + this.f78229Q0 + ", minVideoJumpDuration=" + this.f78231R0 + ", useNewCheckSei=" + this.f78233S0 + ", decoderRecordPts=" + this.f78237U0 + ", latencyEnable=" + this.f78241W0 + ", latencyBaseMark=" + this.f78243X0 + ", latencySpeedupMark=" + this.f78245Y0 + ", latencyDropMark=" + this.f78247Z0 + ", latencySpeedRate=" + this.f78250a1 + ", bufferFirst=" + this.f78253b1 + ", bufferCurrent=" + this.f78256c1 + ", bufferNext=" + this.f78259d1 + ", bufferLast=" + this.f78262e1 + ", bufferInterval=" + this.f78265f1 + ", filterOn=" + this.f78268g1 + ", saturation=" + this.f78271h1 + ", deblurWeight=" + this.f78274i1 + ", deblurRadius=" + this.f78277j1 + ", deblurThreshold=" + this.f78280k1 + ", contrast=" + this.f78283l1 + ", enableProxy=" + this.f78286m1 + ", enableGpuDecode=" + this.f78289n1 + '}';
    }
}
