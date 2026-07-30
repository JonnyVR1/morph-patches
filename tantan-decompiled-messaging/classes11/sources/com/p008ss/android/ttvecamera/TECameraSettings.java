package com.p008ss.android.ttvecamera;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.sina.weibo.sdk.constant.WBConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class TECameraSettings {

    /* JADX INFO: renamed from: a */
    public Context f8933a;

    /* JADX INFO: renamed from: b */
    public int f8935b;

    /* JADX INFO: renamed from: l0 */
    public boolean f8956l0;

    /* JADX INFO: renamed from: z0 */
    public static final String[] f8906z0 = {"auto", "portrait", "party", "sunset", "candlelight", "night", "hdr", "action", "landscape", "snow"};

    /* JADX INFO: renamed from: A0 */
    public static final int[] f8904A0 = {2, 0, 1, 3};

    /* JADX INFO: renamed from: B0 */
    public static final int[] f8905B0 = {1, 2, 0, 3};

    /* JADX INFO: renamed from: c */
    public TEFrameRateRange f8937c = new TEFrameRateRange(7, 30);

    /* JADX INFO: renamed from: d */
    public int f8939d = 0;

    /* JADX INFO: renamed from: e */
    public int f8941e = 0;

    /* JADX INFO: renamed from: f */
    public int f8943f = -1;

    /* JADX INFO: renamed from: g */
    public int f8945g = 17;

    /* JADX INFO: renamed from: h */
    public boolean f8947h = false;

    /* JADX INFO: renamed from: i */
    public boolean f8949i = false;

    /* JADX INFO: renamed from: j */
    public boolean f8951j = true;

    /* JADX INFO: renamed from: k */
    public boolean f8953k = false;

    /* JADX INFO: renamed from: l */
    public boolean f8955l = false;

    /* JADX INFO: renamed from: m */
    public boolean f8957m = false;

    /* JADX INFO: renamed from: n */
    public boolean f8959n = false;

    /* JADX INFO: renamed from: o */
    public boolean f8961o = false;

    /* JADX INFO: renamed from: p */
    public float f8963p = -1.0f;

    /* JADX INFO: renamed from: q */
    public TEFrameSizei f8965q = new TEFrameSizei(1280, 720);

    /* JADX INFO: renamed from: r */
    public TEFrameSizei f8967r = new TEFrameSizei(WBConstants.SDK_NEW_PAY_VERSION, 1080);

    /* JADX INFO: renamed from: s */
    public TEFrameSizei f8969s = new TEFrameSizei(WBConstants.SDK_NEW_PAY_VERSION, 1080);

    /* JADX INFO: renamed from: t */
    public int f8971t = 1;

    /* JADX INFO: renamed from: u */
    public int f8973u = 0;

    /* JADX INFO: renamed from: v */
    public int f8975v = 0;

    /* JADX INFO: renamed from: w */
    public int f8977w = 0;

    /* JADX INFO: renamed from: x */
    public int f8979x = 1;

    /* JADX INFO: renamed from: y */
    public float f8981y = 0.0f;

    /* JADX INFO: renamed from: z */
    public boolean f8983z = false;

    /* JADX INFO: renamed from: A */
    public boolean f8907A = false;

    /* JADX INFO: renamed from: B */
    public int f8908B = 0;

    /* JADX INFO: renamed from: C */
    public int f8909C = 1;

    /* JADX INFO: renamed from: D */
    public int f8910D = 1;

    /* JADX INFO: renamed from: E */
    public Bundle f8911E = new Bundle();

    /* JADX INFO: renamed from: F */
    public byte f8912F = 1;

    /* JADX INFO: renamed from: G */
    public String f8913G = "auto";

    /* JADX INFO: renamed from: H */
    public String f8914H = "0";

    /* JADX INFO: renamed from: I */
    public String f8915I = "0";

    /* JADX INFO: renamed from: J */
    public String f8916J = "-1";

    /* JADX INFO: renamed from: K */
    public C0705d f8917K = new C0705d();

    /* JADX INFO: renamed from: L */
    public boolean f8918L = true;

    /* JADX INFO: renamed from: M */
    public boolean f8919M = false;

    /* JADX INFO: renamed from: N */
    public int f8920N = 0;

    /* JADX INFO: renamed from: O */
    public int f8921O = 0;

    /* JADX INFO: renamed from: P */
    public boolean f8922P = false;

    /* JADX INFO: renamed from: Q */
    public boolean f8923Q = false;

    /* JADX INFO: renamed from: R */
    public boolean f8924R = false;

    /* JADX INFO: renamed from: S */
    public boolean f8925S = false;

    /* JADX INFO: renamed from: T */
    public int f8926T = 50;

    /* JADX INFO: renamed from: U */
    public boolean f8927U = false;

    /* JADX INFO: renamed from: V */
    public boolean f8928V = false;

    /* JADX INFO: renamed from: W */
    public int f8929W = 2500;

    /* JADX INFO: renamed from: X */
    public int f8930X = 0;

    /* JADX INFO: renamed from: Y */
    public int f8931Y = 30;

    /* JADX INFO: renamed from: Z */
    public boolean f8932Z = false;

    /* JADX INFO: renamed from: a0 */
    public boolean f8934a0 = false;

    /* JADX INFO: renamed from: b0 */
    public boolean f8936b0 = false;

    /* JADX INFO: renamed from: c0 */
    public String f8938c0 = "";

    /* JADX INFO: renamed from: d0 */
    public int f8940d0 = 0;

    /* JADX INFO: renamed from: e0 */
    public String f8942e0 = "auto";

    /* JADX INFO: renamed from: f0 */
    public int f8944f0 = 1;

    /* JADX INFO: renamed from: g0 */
    public boolean f8946g0 = false;

    /* JADX INFO: renamed from: h0 */
    public boolean f8948h0 = false;

    /* JADX INFO: renamed from: i0 */
    public boolean f8950i0 = false;

    /* JADX INFO: renamed from: j0 */
    public boolean f8952j0 = false;

    /* JADX INFO: renamed from: k0 */
    public final int f8954k0 = 5;

    /* JADX INFO: renamed from: m0 */
    public boolean f8958m0 = false;

    /* JADX INFO: renamed from: n0 */
    public boolean f8960n0 = false;

    /* JADX INFO: renamed from: o0 */
    public boolean f8962o0 = false;

    /* JADX INFO: renamed from: p0 */
    public boolean f8964p0 = false;

    /* JADX INFO: renamed from: q0 */
    public boolean f8966q0 = false;

    /* JADX INFO: renamed from: r0 */
    public boolean f8968r0 = false;

    /* JADX INFO: renamed from: s0 */
    public boolean f8970s0 = false;

    /* JADX INFO: renamed from: t0 */
    public float f8972t0 = -1.0f;

    /* JADX INFO: renamed from: u0 */
    public float f8974u0 = -1.0f;

    /* JADX INFO: renamed from: v0 */
    public boolean f8976v0 = false;

    /* JADX INFO: renamed from: w0 */
    public boolean f8978w0 = true;

    /* JADX INFO: renamed from: x0 */
    public float f8980x0 = 1.0f;

    /* JADX INFO: renamed from: y0 */
    public ARConfig f8982y0 = null;

    public static final class ARConfig {

        /* JADX INFO: renamed from: a */
        public AugmentedFaceMode f8984a = AugmentedFaceMode.DISABLED;

        /* JADX INFO: renamed from: b */
        public CloudAnchorMode f8985b = CloudAnchorMode.DISABLED;

        /* JADX INFO: renamed from: c */
        public DepthMode f8986c = DepthMode.DISABLED;

        /* JADX INFO: renamed from: d */
        public FocusMode f8987d = FocusMode.FIXED;

        /* JADX INFO: renamed from: e */
        public LightEstimationMode f8988e = LightEstimationMode.DISABLED;

        /* JADX INFO: renamed from: f */
        public PlaneFindingMode f8989f = PlaneFindingMode.DISABLED;

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
    public interface InterfaceC0702a {
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$b */
    public interface InterfaceC0703b {
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$c */
    public interface InterfaceC0704c {
        /* JADX INFO: renamed from: a */
        void m10856a(Exception exc);
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$d */
    public static class C0705d {

        /* JADX INFO: renamed from: a */
        public int f8990a = 0;

        /* JADX INFO: renamed from: b */
        public int f8991b = 0;

        /* JADX INFO: renamed from: c */
        public int f8992c = 0;

        /* JADX INFO: renamed from: d */
        public float f8993d = 0.0f;

        /* JADX INFO: renamed from: a */
        public boolean m10857a() {
            return this.f8990a > this.f8992c && this.f8993d > 0.001f;
        }

        public String toString() {
            return "ExposureCompensationInfo{max = " + this.f8990a + ", exposure = " + this.f8991b + ", min = " + this.f8992c + ", step = " + this.f8993d + "}";
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$e */
    public interface InterfaceC0706e {
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$f */
    public static final class C0707f {

        /* JADX INFO: renamed from: a */
        private static final Map<String, Class> f8994a;

        static {
            HashMap map = new HashMap();
            f8994a = map;
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
        public static Class m10858a(String str) {
            Map<String, Class> map = f8994a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$g */
    public interface InterfaceC0708g {
        /* JADX INFO: renamed from: a */
        void m10859a(int i);
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$h */
    public interface InterfaceC0709h {
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$i */
    public interface InterfaceC0710i {
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$j */
    public static class C0711j {
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$k */
    public static final class C0712k {

        /* JADX INFO: renamed from: a */
        public static final Map<String, Class> f8995a;

        static {
            HashMap map = new HashMap();
            f8995a = map;
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
        public static boolean m10860a(String str, Object obj) {
            Map<String, Class> map = f8995a;
            if (map.containsKey(str)) {
                return obj == null || obj.getClass() == map.get(str);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$l */
    public interface InterfaceC0713l {
        /* JADX INFO: renamed from: a */
        void m10861a(Exception exc);
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$m */
    public interface InterfaceC0714m {
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$n */
    public interface InterfaceC0715n {
        /* JADX INFO: renamed from: a */
        void m10862a(float f);
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$o */
    public interface InterfaceC0716o {
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$p */
    public interface InterfaceC0717p {
        boolean enableSmooth();

        void onChange(int i, float f, boolean z);

        void onZoomSupport(int i, boolean z, boolean z2, float f, List<Integer> list);
    }

    public TECameraSettings(@NonNull Context context, int i, int i2, int i3) {
        this.f8935b = 1;
        this.f8933a = context;
        this.f8935b = i;
        TEFrameSizei tEFrameSizei = this.f8965q;
        tEFrameSizei.width = i2;
        tEFrameSizei.height = i3;
    }

    /* JADX INFO: renamed from: a */
    public TEFrameSizei m10855a() {
        return this.f8965q;
    }

    public TECameraSettings(@NonNull Context context, int i) {
        this.f8935b = 1;
        this.f8933a = context;
        this.f8935b = i;
    }
}
