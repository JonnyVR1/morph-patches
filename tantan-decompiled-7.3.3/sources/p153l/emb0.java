package p153l;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class emb0 {

    @SerializedName("agora_minkbs")
    private List<Integer> agoraMinkbs;

    @SerializedName("beautify_scale")
    public wu2 beautifyScale;

    @SerializedName("beauty_config")
    public zu2 beautyConfig;

    @SerializedName("cam")
    private g94 cam;

    @SerializedName("comm_parms")
    public vg5 commParms;

    @SerializedName("cv_config")
    public a1c cvConfig;

    @SerializedName("enable_B_encode")
    private int enableBEncode;

    @SerializedName("fdk_aac_onoff")
    private int fdkAacOnoff;

    @SerializedName("focus_enable")
    private int focusEnable;

    @SerializedName("hevc_drop_rasl")
    private int hevcDropRasl;

    @SerializedName("preview_render_api")
    private int previewRenderApi;

    @SerializedName("tanscode_aBitrate")
    private int tanscodeABitrate;

    @SerializedName("vbr_config")
    public q1l0 vbrConfig;

    @SerializedName("volc_gl_flush")
    private int volcGlFlush;

    @SerializedName("volc_minkbs")
    private List<Integer> volcMinkbs;

    @SerializedName("volc_test_appid_list")
    private List<String> volcTestAppidList;

    @SerializedName("audio_scenario")
    private int audioScenario = -1;

    @SerializedName("audio_profile")
    private int audioProfile = -1;

    @SerializedName("clear_view")
    private int clearView = 1;

    @SerializedName("sync_stream_replace")
    private int syncStreamReplace = 0;

    @SerializedName("agora_gl_flush")
    private int agoraGlFlush = 0;

    @SerializedName("agora_rtc_keepalive")
    private int agoraRtcKeepAlive = 0;

    @SerializedName("volc_rtc_keepalive")
    private int volcRtcKeepAlive = 0;

    @SerializedName("agora_ai_aec")
    private int agora_ai_aec = 0;

    @SerializedName("agora_ai_ns")
    private int agora_ai_ns = 0;

    /* JADX INFO: renamed from: a */
    public int m121336a() {
        return this.agoraGlFlush;
    }

    /* JADX INFO: renamed from: b */
    public List<Integer> m121337b() {
        return this.agoraMinkbs;
    }

    /* JADX INFO: renamed from: c */
    public int m121338c() {
        return this.agoraRtcKeepAlive;
    }

    /* JADX INFO: renamed from: d */
    public int m121339d() {
        return this.agora_ai_aec;
    }

    /* JADX INFO: renamed from: e */
    public int m121340e() {
        return this.agora_ai_ns;
    }

    /* JADX INFO: renamed from: f */
    public int m121341f() {
        return this.audioProfile;
    }

    /* JADX INFO: renamed from: g */
    public int m121342g() {
        return this.audioScenario;
    }

    /* JADX INFO: renamed from: h */
    public zu2 m121343h() {
        return this.beautyConfig;
    }

    /* JADX INFO: renamed from: i */
    public int m121344i() {
        return this.clearView;
    }

    /* JADX INFO: renamed from: j */
    public vg5 m121345j() {
        return this.commParms;
    }

    /* JADX INFO: renamed from: k */
    public a1c m121346k() {
        return this.cvConfig;
    }

    /* JADX INFO: renamed from: l */
    public int m121347l() {
        return this.enableBEncode;
    }

    /* JADX INFO: renamed from: m */
    public int m121348m() {
        return this.focusEnable;
    }

    /* JADX INFO: renamed from: n */
    public int m121349n() {
        return this.syncStreamReplace;
    }

    /* JADX INFO: renamed from: o */
    public int m121350o() {
        return this.tanscodeABitrate;
    }

    /* JADX INFO: renamed from: p */
    public q1l0 m121351p() {
        return this.vbrConfig;
    }

    /* JADX INFO: renamed from: q */
    public int m121352q() {
        return this.volcGlFlush;
    }

    /* JADX INFO: renamed from: r */
    public List<Integer> m121353r() {
        return this.volcMinkbs;
    }

    /* JADX INFO: renamed from: s */
    public int m121354s() {
        return this.volcRtcKeepAlive;
    }

    /* JADX INFO: renamed from: t */
    public List<String> m121355t() {
        return this.volcTestAppidList;
    }

    public String toString() {
        return "PushConfig{beautyConfig=" + this.beautyConfig + ", beautifyScale=" + this.beautifyScale + ", commParms=" + this.commParms + ", cvConfig=" + this.cvConfig + ", cam=" + this.cam + ", focusEnable=" + this.focusEnable + ", audioScenario=" + this.audioScenario + ", audioProfile=" + this.audioProfile + ", fdkAacOnoff=" + this.fdkAacOnoff + ", enableBEncode=" + this.enableBEncode + ", agoraMinkbs=" + this.agoraMinkbs + ", volcMinkbs=" + this.volcMinkbs + ", tanscodeABitrate=" + this.tanscodeABitrate + ", volcGlFlush=" + this.volcGlFlush + ", hevcDropRasl=" + this.hevcDropRasl + ", vbrConfig=" + this.vbrConfig + ", volcTestAppidList=" + this.volcTestAppidList + ", previewRenderApi=" + this.previewRenderApi + '}';
    }
}
