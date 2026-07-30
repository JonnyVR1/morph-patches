package com.p074ss.android.ttvecamera;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.p051p1.mobile.putong.core.data.Portrait;
import com.p051p1.mobile.putong.data.User;
import com.sina.weibo.sdk.constant.WBConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class TECameraSettings {

    /* JADX INFO: renamed from: a */
    public Context f56175a;

    /* JADX INFO: renamed from: b */
    public int f56177b;

    /* JADX INFO: renamed from: l0 */
    public boolean f56198l0;

    /* JADX INFO: renamed from: z0 */
    public static final String[] f56148z0 = {"auto", Portrait.TYPE, "party", "sunset", "candlelight", "night", "hdr", "action", "landscape", "snow"};

    /* JADX INFO: renamed from: A0 */
    public static final int[] f56146A0 = {2, 0, 1, 3};

    /* JADX INFO: renamed from: B0 */
    public static final int[] f56147B0 = {1, 2, 0, 3};

    /* JADX INFO: renamed from: c */
    public TEFrameRateRange f56179c = new TEFrameRateRange(7, 30);

    /* JADX INFO: renamed from: d */
    public int f56181d = 0;

    /* JADX INFO: renamed from: e */
    public int f56183e = 0;

    /* JADX INFO: renamed from: f */
    public int f56185f = -1;

    /* JADX INFO: renamed from: g */
    public int f56187g = 17;

    /* JADX INFO: renamed from: h */
    public boolean f56189h = false;

    /* JADX INFO: renamed from: i */
    public boolean f56191i = false;

    /* JADX INFO: renamed from: j */
    public boolean f56193j = true;

    /* JADX INFO: renamed from: k */
    public boolean f56195k = false;

    /* JADX INFO: renamed from: l */
    public boolean f56197l = false;

    /* JADX INFO: renamed from: m */
    public boolean f56199m = false;

    /* JADX INFO: renamed from: n */
    public boolean f56201n = false;

    /* JADX INFO: renamed from: o */
    public boolean f56203o = false;

    /* JADX INFO: renamed from: p */
    public float f56205p = -1.0f;

    /* JADX INFO: renamed from: q */
    public TEFrameSizei f56207q = new TEFrameSizei(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK, 720);

    /* JADX INFO: renamed from: r */
    public TEFrameSizei f56209r = new TEFrameSizei(WBConstants.SDK_NEW_PAY_VERSION, 1080);

    /* JADX INFO: renamed from: s */
    public TEFrameSizei f56211s = new TEFrameSizei(WBConstants.SDK_NEW_PAY_VERSION, 1080);

    /* JADX INFO: renamed from: t */
    public int f56213t = 1;

    /* JADX INFO: renamed from: u */
    public int f56215u = 0;

    /* JADX INFO: renamed from: v */
    public int f56217v = 0;

    /* JADX INFO: renamed from: w */
    public int f56219w = 0;

    /* JADX INFO: renamed from: x */
    public int f56221x = 1;

    /* JADX INFO: renamed from: y */
    public float f56223y = 0.0f;

    /* JADX INFO: renamed from: z */
    public boolean f56225z = false;

    /* JADX INFO: renamed from: A */
    public boolean f56149A = false;

    /* JADX INFO: renamed from: B */
    public int f56150B = 0;

    /* JADX INFO: renamed from: C */
    public int f56151C = 1;

    /* JADX INFO: renamed from: D */
    public int f56152D = 1;

    /* JADX INFO: renamed from: E */
    public Bundle f56153E = new Bundle();

    /* JADX INFO: renamed from: F */
    public byte f56154F = 1;

    /* JADX INFO: renamed from: G */
    public String f56155G = "auto";

    /* JADX INFO: renamed from: H */
    public String f56156H = "0";

    /* JADX INFO: renamed from: I */
    public String f56157I = "0";

    /* JADX INFO: renamed from: J */
    public String f56158J = User.ID_TEAM_ACCOUNT;

    /* JADX INFO: renamed from: K */
    public C13466d f56159K = new C13466d();

    /* JADX INFO: renamed from: L */
    public boolean f56160L = true;

    /* JADX INFO: renamed from: M */
    public boolean f56161M = false;

    /* JADX INFO: renamed from: N */
    public int f56162N = 0;

    /* JADX INFO: renamed from: O */
    public int f56163O = 0;

    /* JADX INFO: renamed from: P */
    public boolean f56164P = false;

    /* JADX INFO: renamed from: Q */
    public boolean f56165Q = false;

    /* JADX INFO: renamed from: R */
    public boolean f56166R = false;

    /* JADX INFO: renamed from: S */
    public boolean f56167S = false;

    /* JADX INFO: renamed from: T */
    public int f56168T = 50;

    /* JADX INFO: renamed from: U */
    public boolean f56169U = false;

    /* JADX INFO: renamed from: V */
    public boolean f56170V = false;

    /* JADX INFO: renamed from: W */
    public int f56171W = 2500;

    /* JADX INFO: renamed from: X */
    public int f56172X = 0;

    /* JADX INFO: renamed from: Y */
    public int f56173Y = 30;

    /* JADX INFO: renamed from: Z */
    public boolean f56174Z = false;

    /* JADX INFO: renamed from: a0 */
    public boolean f56176a0 = false;

    /* JADX INFO: renamed from: b0 */
    public boolean f56178b0 = false;

    /* JADX INFO: renamed from: c0 */
    public String f56180c0 = "";

    /* JADX INFO: renamed from: d0 */
    public int f56182d0 = 0;

    /* JADX INFO: renamed from: e0 */
    public String f56184e0 = "auto";

    /* JADX INFO: renamed from: f0 */
    public int f56186f0 = 1;

    /* JADX INFO: renamed from: g0 */
    public boolean f56188g0 = false;

    /* JADX INFO: renamed from: h0 */
    public boolean f56190h0 = false;

    /* JADX INFO: renamed from: i0 */
    public boolean f56192i0 = false;

    /* JADX INFO: renamed from: j0 */
    public boolean f56194j0 = false;

    /* JADX INFO: renamed from: k0 */
    public final int f56196k0 = 5;

    /* JADX INFO: renamed from: m0 */
    public boolean f56200m0 = false;

    /* JADX INFO: renamed from: n0 */
    public boolean f56202n0 = false;

    /* JADX INFO: renamed from: o0 */
    public boolean f56204o0 = false;

    /* JADX INFO: renamed from: p0 */
    public boolean f56206p0 = false;

    /* JADX INFO: renamed from: q0 */
    public boolean f56208q0 = false;

    /* JADX INFO: renamed from: r0 */
    public boolean f56210r0 = false;

    /* JADX INFO: renamed from: s0 */
    public boolean f56212s0 = false;

    /* JADX INFO: renamed from: t0 */
    public float f56214t0 = -1.0f;

    /* JADX INFO: renamed from: u0 */
    public float f56216u0 = -1.0f;

    /* JADX INFO: renamed from: v0 */
    public boolean f56218v0 = false;

    /* JADX INFO: renamed from: w0 */
    public boolean f56220w0 = true;

    /* JADX INFO: renamed from: x0 */
    public float f56222x0 = 1.0f;

    /* JADX INFO: renamed from: y0 */
    public ARConfig f56224y0 = null;

    public static final class ARConfig {

        /* JADX INFO: renamed from: a */
        public AugmentedFaceMode f56226a = AugmentedFaceMode.DISABLED;

        /* JADX INFO: renamed from: b */
        public CloudAnchorMode f56227b = CloudAnchorMode.DISABLED;

        /* JADX INFO: renamed from: c */
        public DepthMode f56228c = DepthMode.DISABLED;

        /* JADX INFO: renamed from: d */
        public FocusMode f56229d = FocusMode.FIXED;

        /* JADX INFO: renamed from: e */
        public LightEstimationMode f56230e = LightEstimationMode.DISABLED;

        /* JADX INFO: renamed from: f */
        public PlaneFindingMode f56231f = PlaneFindingMode.DISABLED;

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
    public interface InterfaceC13463a {
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$b */
    public interface InterfaceC13464b {
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$c */
    public interface InterfaceC13465c {
        /* JADX INFO: renamed from: a */
        void m81688a(Exception exc);
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$d */
    public static class C13466d {

        /* JADX INFO: renamed from: a */
        public int f56232a = 0;

        /* JADX INFO: renamed from: b */
        public int f56233b = 0;

        /* JADX INFO: renamed from: c */
        public int f56234c = 0;

        /* JADX INFO: renamed from: d */
        public float f56235d = 0.0f;

        /* JADX INFO: renamed from: a */
        public boolean m81689a() {
            return this.f56232a > this.f56234c && this.f56235d > 0.001f;
        }

        public String toString() {
            return "ExposureCompensationInfo{max = " + this.f56232a + ", exposure = " + this.f56233b + ", min = " + this.f56234c + ", step = " + this.f56235d + "}";
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$e */
    public interface InterfaceC13467e {
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$f */
    public static final class C13468f {

        /* JADX INFO: renamed from: a */
        private static final Map<String, Class> f56236a;

        static {
            HashMap map = new HashMap();
            f56236a = map;
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
        public static Class m81690a(String str) {
            Map<String, Class> map = f56236a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$g */
    public interface InterfaceC13469g {
        /* JADX INFO: renamed from: a */
        void mo81691a(int i);
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$h */
    public interface InterfaceC13470h {
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$i */
    public interface InterfaceC13471i {
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$j */
    public static class C13472j {
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$k */
    public static final class C13473k {

        /* JADX INFO: renamed from: a */
        public static final Map<String, Class> f56237a;

        static {
            HashMap map = new HashMap();
            f56237a = map;
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
        public static boolean m81692a(String str, Object obj) {
            Map<String, Class> map = f56237a;
            if (map.containsKey(str)) {
                return obj == null || obj.getClass() == map.get(str);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$l */
    public interface InterfaceC13474l {
        /* JADX INFO: renamed from: a */
        void m81693a(Exception exc);
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$m */
    public interface InterfaceC13475m {
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$n */
    public interface InterfaceC13476n {
        /* JADX INFO: renamed from: a */
        void m81694a(float f);
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$o */
    public interface InterfaceC13477o {
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraSettings$p */
    public interface InterfaceC13478p {
        boolean enableSmooth();

        void onChange(int i, float f, boolean z);

        void onZoomSupport(int i, boolean z, boolean z2, float f, List<Integer> list);
    }

    public TECameraSettings(@NonNull Context context, int i, int i2, int i3) {
        this.f56177b = 1;
        this.f56175a = context;
        this.f56177b = i;
        TEFrameSizei tEFrameSizei = this.f56207q;
        tEFrameSizei.width = i2;
        tEFrameSizei.height = i3;
    }

    /* JADX INFO: renamed from: a */
    public TEFrameSizei m81687a() {
        return this.f56207q;
    }

    public TECameraSettings(@NonNull Context context, int i) {
        this.f56177b = 1;
        this.f56175a = context;
        this.f56177b = i;
    }
}
