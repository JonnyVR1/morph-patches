package com.p069ss.android.ttvecamera;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.p046p1.mobile.putong.core.data.Portrait;
import com.p046p1.mobile.putong.data.User;
import com.sina.weibo.sdk.constant.WBConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class TECameraSettings {

    /* JADX INFO: renamed from: a */
    public Context f55327a;

    /* JADX INFO: renamed from: b */
    public int f55329b;

    /* JADX INFO: renamed from: l0 */
    public boolean f55350l0;

    /* JADX INFO: renamed from: z0 */
    public static final String[] f55300z0 = {"auto", Portrait.TYPE, "party", "sunset", "candlelight", "night", "hdr", "action", "landscape", "snow"};

    /* JADX INFO: renamed from: A0 */
    public static final int[] f55298A0 = {2, 0, 1, 3};

    /* JADX INFO: renamed from: B0 */
    public static final int[] f55299B0 = {1, 2, 0, 3};

    /* JADX INFO: renamed from: c */
    public TEFrameRateRange f55331c = new TEFrameRateRange(7, 30);

    /* JADX INFO: renamed from: d */
    public int f55333d = 0;

    /* JADX INFO: renamed from: e */
    public int f55335e = 0;

    /* JADX INFO: renamed from: f */
    public int f55337f = -1;

    /* JADX INFO: renamed from: g */
    public int f55339g = 17;

    /* JADX INFO: renamed from: h */
    public boolean f55341h = false;

    /* JADX INFO: renamed from: i */
    public boolean f55343i = false;

    /* JADX INFO: renamed from: j */
    public boolean f55345j = true;

    /* JADX INFO: renamed from: k */
    public boolean f55347k = false;

    /* JADX INFO: renamed from: l */
    public boolean f55349l = false;

    /* JADX INFO: renamed from: m */
    public boolean f55351m = false;

    /* JADX INFO: renamed from: n */
    public boolean f55353n = false;

    /* JADX INFO: renamed from: o */
    public boolean f55355o = false;

    /* JADX INFO: renamed from: p */
    public float f55357p = -1.0f;

    /* JADX INFO: renamed from: q */
    public TEFrameSizei f55359q = new TEFrameSizei(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK, 720);

    /* JADX INFO: renamed from: r */
    public TEFrameSizei f55361r = new TEFrameSizei(WBConstants.SDK_NEW_PAY_VERSION, 1080);

    /* JADX INFO: renamed from: s */
    public TEFrameSizei f55363s = new TEFrameSizei(WBConstants.SDK_NEW_PAY_VERSION, 1080);

    /* JADX INFO: renamed from: t */
    public int f55365t = 1;

    /* JADX INFO: renamed from: u */
    public int f55367u = 0;

    /* JADX INFO: renamed from: v */
    public int f55369v = 0;

    /* JADX INFO: renamed from: w */
    public int f55371w = 0;

    /* JADX INFO: renamed from: x */
    public int f55373x = 1;

    /* JADX INFO: renamed from: y */
    public float f55375y = 0.0f;

    /* JADX INFO: renamed from: z */
    public boolean f55377z = false;

    /* JADX INFO: renamed from: A */
    public boolean f55301A = false;

    /* JADX INFO: renamed from: B */
    public int f55302B = 0;

    /* JADX INFO: renamed from: C */
    public int f55303C = 1;

    /* JADX INFO: renamed from: D */
    public int f55304D = 1;

    /* JADX INFO: renamed from: E */
    public Bundle f55305E = new Bundle();

    /* JADX INFO: renamed from: F */
    public byte f55306F = 1;

    /* JADX INFO: renamed from: G */
    public String f55307G = "auto";

    /* JADX INFO: renamed from: H */
    public String f55308H = "0";

    /* JADX INFO: renamed from: I */
    public String f55309I = "0";

    /* JADX INFO: renamed from: J */
    public String f55310J = User.ID_TEAM_ACCOUNT;

    /* JADX INFO: renamed from: K */
    public C13303d f55311K = new C13303d();

    /* JADX INFO: renamed from: L */
    public boolean f55312L = true;

    /* JADX INFO: renamed from: M */
    public boolean f55313M = false;

    /* JADX INFO: renamed from: N */
    public int f55314N = 0;

    /* JADX INFO: renamed from: O */
    public int f55315O = 0;

    /* JADX INFO: renamed from: P */
    public boolean f55316P = false;

    /* JADX INFO: renamed from: Q */
    public boolean f55317Q = false;

    /* JADX INFO: renamed from: R */
    public boolean f55318R = false;

    /* JADX INFO: renamed from: S */
    public boolean f55319S = false;

    /* JADX INFO: renamed from: T */
    public int f55320T = 50;

    /* JADX INFO: renamed from: U */
    public boolean f55321U = false;

    /* JADX INFO: renamed from: V */
    public boolean f55322V = false;

    /* JADX INFO: renamed from: W */
    public int f55323W = 2500;

    /* JADX INFO: renamed from: X */
    public int f55324X = 0;

    /* JADX INFO: renamed from: Y */
    public int f55325Y = 30;

    /* JADX INFO: renamed from: Z */
    public boolean f55326Z = false;

    /* JADX INFO: renamed from: a0 */
    public boolean f55328a0 = false;

    /* JADX INFO: renamed from: b0 */
    public boolean f55330b0 = false;

    /* JADX INFO: renamed from: c0 */
    public String f55332c0 = "";

    /* JADX INFO: renamed from: d0 */
    public int f55334d0 = 0;

    /* JADX INFO: renamed from: e0 */
    public String f55336e0 = "auto";

    /* JADX INFO: renamed from: f0 */
    public int f55338f0 = 1;

    /* JADX INFO: renamed from: g0 */
    public boolean f55340g0 = false;

    /* JADX INFO: renamed from: h0 */
    public boolean f55342h0 = false;

    /* JADX INFO: renamed from: i0 */
    public boolean f55344i0 = false;

    /* JADX INFO: renamed from: j0 */
    public boolean f55346j0 = false;

    /* JADX INFO: renamed from: k0 */
    public final int f55348k0 = 5;

    /* JADX INFO: renamed from: m0 */
    public boolean f55352m0 = false;

    /* JADX INFO: renamed from: n0 */
    public boolean f55354n0 = false;

    /* JADX INFO: renamed from: o0 */
    public boolean f55356o0 = false;

    /* JADX INFO: renamed from: p0 */
    public boolean f55358p0 = false;

    /* JADX INFO: renamed from: q0 */
    public boolean f55360q0 = false;

    /* JADX INFO: renamed from: r0 */
    public boolean f55362r0 = false;

    /* JADX INFO: renamed from: s0 */
    public boolean f55364s0 = false;

    /* JADX INFO: renamed from: t0 */
    public float f55366t0 = -1.0f;

    /* JADX INFO: renamed from: u0 */
    public float f55368u0 = -1.0f;

    /* JADX INFO: renamed from: v0 */
    public boolean f55370v0 = false;

    /* JADX INFO: renamed from: w0 */
    public boolean f55372w0 = true;

    /* JADX INFO: renamed from: x0 */
    public float f55374x0 = 1.0f;

    /* JADX INFO: renamed from: y0 */
    public ARConfig f55376y0 = null;

    public static final class ARConfig {

        /* JADX INFO: renamed from: a */
        public AugmentedFaceMode f55378a = AugmentedFaceMode.DISABLED;

        /* JADX INFO: renamed from: b */
        public CloudAnchorMode f55379b = CloudAnchorMode.DISABLED;

        /* JADX INFO: renamed from: c */
        public DepthMode f55380c = DepthMode.DISABLED;

        /* JADX INFO: renamed from: d */
        public FocusMode f55381d = FocusMode.FIXED;

        /* JADX INFO: renamed from: e */
        public LightEstimationMode f55382e = LightEstimationMode.DISABLED;

        /* JADX INFO: renamed from: f */
        public PlaneFindingMode f55383f = PlaneFindingMode.DISABLED;

        public enum AugmentedFaceMode {
            DISABLED,
            MESH3D
        }

        public enum CloudAnchorMode {
            DISABLED,
            ENABLED
        }

        public enum DepthMode {
            DISABLED,
            AUTOMATIC
        }

        public enum FocusMode {
            FIXED,
            AUTO
        }

        public enum LightEstimationMode {
            DISABLED,
            AMBIENT_INTENSITY,
            ENVIRONMENTAL_HDR
        }

        public enum PlaneFindingMode {
            DISABLED,
            HORIZONTAL,
            VERTICAL,
            HORIZONTAL_AND_VERTICAL
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$a */
    public interface InterfaceC13300a {
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$b */
    public interface InterfaceC13301b {
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$c */
    public interface InterfaceC13302c {
        /* JADX INFO: renamed from: a */
        void m80505a(Exception exc);
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$d */
    public static class C13303d {

        /* JADX INFO: renamed from: a */
        public int f55384a = 0;

        /* JADX INFO: renamed from: b */
        public int f55385b = 0;

        /* JADX INFO: renamed from: c */
        public int f55386c = 0;

        /* JADX INFO: renamed from: d */
        public float f55387d = 0.0f;

        /* JADX INFO: renamed from: a */
        public boolean m80506a() {
            return this.f55384a > this.f55386c && this.f55387d > 0.001f;
        }

        public String toString() {
            return "ExposureCompensationInfo{max = " + this.f55384a + ", exposure = " + this.f55385b + ", min = " + this.f55386c + ", step = " + this.f55387d + "}";
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$e */
    public interface InterfaceC13304e {
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$f */
    public static final class C13305f {

        /* JADX INFO: renamed from: a */
        private static final Map<String, Class> f55388a;

        static {
            HashMap map = new HashMap();
            f55388a = map;
            map.put("facing", Integer.class);
            map.put("device_support_wide_angle_mode", Integer.class);
            map.put("device_support_antishake_mode", Integer.class);
            map.put("device_support_ai_night_video", Integer.class);
            map.put("support_light_soft", Boolean.class);
            map.put("device_support_wide_angle", Boolean.class);
            map.put("device_support_anti_shake", Boolean.class);
            map.put("device_support_camera", Boolean.class);
            map.put("device_wide_angle_camera_id", String.class);
            map.put("support_wide_angle", Boolean.class);
            map.put("support_telephoto", Boolean.class);
            map.put("support_body_beauty", Boolean.class);
            map.put("support_anti_shake", Boolean.class);
            map.put("support_fps_480", Boolean.class);
            map.put("support_fps_120", Boolean.class);
            map.put("support_fps_60", Boolean.class);
            map.put("support_preview_sizes", ArrayList.class);
            map.put("support_picture_sizes", ArrayList.class);
            map.put("camera_preview_size", TEFrameSizei.class);
            map.put("camera_focus_parameters", TEFocusParameters.class);
            map.put("camera_torch_supported", Boolean.class);
            map.put("support_video_sizes", ArrayList.class);
            map.put("camera_support_fps_range", ArrayList.class);
            map.put("device_should_use_shader_zoom", Boolean.class);
            map.put("device_support_multicamera_zoom", Boolean.class);
        }

        /* JADX INFO: renamed from: a */
        public static Class m80507a(String str) {
            Map<String, Class> map = f55388a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$g */
    public interface InterfaceC13306g {
        /* JADX INFO: renamed from: a */
        void mo80508a(int i);
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$h */
    public interface InterfaceC13307h {
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$i */
    public interface InterfaceC13308i {
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$j */
    public static class C13309j {
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$k */
    public static final class C13310k {

        /* JADX INFO: renamed from: a */
        public static final Map<String, Class> f55389a;

        static {
            HashMap map = new HashMap();
            f55389a = map;
            map.put("enable_body_beauty", Boolean.class);
            map.put("enable_light_soft", Boolean.class);
            map.put("enable_anti_shake", Boolean.class);
            map.put("video_path", String.class);
            map.put("body_beauty_level", Integer.class);
            map.put("enable_dim_light_quality", Boolean.class);
            map.put("enable_ai_night_video", Boolean.class);
            map.put("enable_video_stabilization", Boolean.class);
            map.put("enable_super_Stabilization", Boolean.class);
            map.put("enable_video_hdr", Boolean.class);
            map.put("video_fps", int[].class);
            map.put("aperture", Float.class);
            map.put("flash_mode", Integer.class);
            map.put("face_detect", Integer.class);
            map.put("exposure_compensation", Integer.class);
        }

        /* JADX INFO: renamed from: a */
        public static boolean m80509a(String str, Object obj) {
            Map<String, Class> map = f55389a;
            if (map.containsKey(str)) {
                return obj == null || obj.getClass() == map.get(str);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$l */
    public interface InterfaceC13311l {
        /* JADX INFO: renamed from: a */
        void m80510a(Exception exc);
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$m */
    public interface InterfaceC13312m {
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$n */
    public interface InterfaceC13313n {
        /* JADX INFO: renamed from: a */
        void m80511a(float f);
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$o */
    public interface InterfaceC13314o {
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$p */
    public interface InterfaceC13315p {
        boolean enableSmooth();

        void onChange(int i, float f, boolean z);

        void onZoomSupport(int i, boolean z, boolean z2, float f, List<Integer> list);
    }

    public TECameraSettings(@NonNull Context context, int i, int i2, int i3) {
        this.f55329b = 1;
        this.f55327a = context;
        this.f55329b = i;
        TEFrameSizei tEFrameSizei = this.f55359q;
        tEFrameSizei.width = i2;
        tEFrameSizei.height = i3;
    }

    /* JADX INFO: renamed from: a */
    public TEFrameSizei m80504a() {
        return this.f55359q;
    }

    public TECameraSettings(@NonNull Context context, int i) {
        this.f55329b = 1;
        this.f55327a = context;
        this.f55329b = i;
    }
}
