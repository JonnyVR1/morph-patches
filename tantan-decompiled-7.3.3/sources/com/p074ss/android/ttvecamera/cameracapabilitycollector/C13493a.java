package com.p074ss.android.ttvecamera.cameracapabilitycollector;

import com.p074ss.android.ttvecamera.C13504g;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p153l.hrh0;

/* JADX INFO: renamed from: com.ss.android.ttvecamera.cameracapabilitycollector.a */
/* JADX INFO: loaded from: classes11.dex */
public class C13493a implements TECameraCapabilityCollector.InterfaceC13492b {

    /* JADX INFO: renamed from: a */
    public static final Map<TECameraCapabilityCollector.Capability, TECameraCapabilityCollector.DataType> f56336a;

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.cameracapabilitycollector.a$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f56337a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f56338b;

        static {
            int[] iArr = new int[TECameraCapabilityCollector.Capability.values().length];
            f56338b = iArr;
            try {
                iArr[TECameraCapabilityCollector.Capability.DEPTH_OUTPUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56338b[TECameraCapabilityCollector.Capability.PREVIEW_SIZE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56338b[TECameraCapabilityCollector.Capability.FPS_RANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f56338b[TECameraCapabilityCollector.Capability.MANUAL_3A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f56338b[TECameraCapabilityCollector.Capability.HIGH_SPEED_VIDEO_FPS_RANGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f56338b[TECameraCapabilityCollector.Capability.SUPPORT_APERTURES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f56338b[TECameraCapabilityCollector.Capability.LOGICAL_MULTI_CAMERA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f56338b[TECameraCapabilityCollector.Capability.SUPPORT_EXTENSIONS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f56338b[TECameraCapabilityCollector.Capability.FRONT_BACK_MULTICAM_COMBOS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr2 = new int[TECameraCapabilityCollector.DataType.values().length];
            f56337a = iArr2;
            try {
                iArr2[TECameraCapabilityCollector.DataType.INTEGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f56337a[TECameraCapabilityCollector.DataType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f56337a[TECameraCapabilityCollector.DataType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f56337a[TECameraCapabilityCollector.DataType.BOOLEAN.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f56337a[TECameraCapabilityCollector.DataType.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    static {
        HashMap map = new HashMap();
        f56336a = map;
        TECameraCapabilityCollector.Capability capability = TECameraCapabilityCollector.Capability.DEPTH_OUTPUT;
        TECameraCapabilityCollector.DataType dataType = TECameraCapabilityCollector.DataType.STRING;
        map.put(capability, dataType);
        map.put(TECameraCapabilityCollector.Capability.PREVIEW_SIZE, dataType);
        map.put(TECameraCapabilityCollector.Capability.FPS_RANGE, dataType);
        map.put(TECameraCapabilityCollector.Capability.MANUAL_3A, dataType);
        map.put(TECameraCapabilityCollector.Capability.HIGH_SPEED_VIDEO_FPS_RANGE, dataType);
        map.put(TECameraCapabilityCollector.Capability.SUPPORT_APERTURES, dataType);
        map.put(TECameraCapabilityCollector.Capability.LOGICAL_MULTI_CAMERA, dataType);
        map.put(TECameraCapabilityCollector.Capability.SUPPORT_EXTENSIONS, dataType);
        map.put(TECameraCapabilityCollector.Capability.FRONT_BACK_MULTICAM_COMBOS, dataType);
    }

    /* JADX INFO: renamed from: c */
    private String m81857c(TECameraCapabilityCollector.Capability capability) {
        switch (a.f56338b[capability.ordinal()]) {
            case 1:
                return "te_record_camera_depth_capacity";
            case 2:
                return "te_record_camera_support_preview_size";
            case 3:
                return "te_record_camera_support_fps_range";
            case 4:
                return "te_record_camera_manual_3a_capability";
            case 5:
                return "te_record_camera_high_speed_video_fps_range";
            case 6:
                return "te_record_camera_support_apertures";
            case 7:
                return "te_record_camera_logical_multi_camera_capacity";
            case 8:
                return "te_record_camera_support_extensions";
            case 9:
                return "te_record_camera_front_back_multicam_combos";
            default:
                C13504g.m82006j("TECameraCapabilityKBUpload", "key is null, capability is incorrect!");
                return null;
        }
    }

    @Override // com.p074ss.android.ttvecamera.cameracapabilitycollector.TECameraCapabilityCollector.InterfaceC13492b
    /* JADX INFO: renamed from: a */
    public TECameraCapabilityCollector.DataType mo81855a(TECameraCapabilityCollector.Capability capability) {
        Map<TECameraCapabilityCollector.Capability, TECameraCapabilityCollector.DataType> map = f56336a;
        return map.get(capability) == null ? TECameraCapabilityCollector.DataType.UNKNOWN : map.get(capability);
    }

    @Override // com.p074ss.android.ttvecamera.cameracapabilitycollector.TECameraCapabilityCollector.InterfaceC13492b
    /* JADX INFO: renamed from: b */
    public void mo81856b(List<TECameraCapabilityCollector.C13491a> list) {
        for (TECameraCapabilityCollector.C13491a c13491a : list) {
            String strM81857c = m81857c(c13491a.f56333a);
            if (strM81857c != null) {
                int i = a.f56337a[c13491a.f56334b.ordinal()];
                if (i == 1 || i == 2) {
                    hrh0.m136853b(strM81857c, ((Long) c13491a.f56335c).longValue());
                } else if (i == 3) {
                    hrh0.m136852a(strM81857c, ((Double) c13491a.f56335c).doubleValue());
                } else if (i == 4) {
                    hrh0.m136854c(strM81857c, ((Boolean) c13491a.f56335c).booleanValue() ? "true" : "false");
                } else if (i == 5) {
                    hrh0.m136854c(strM81857c, (String) c13491a.f56335c);
                }
            }
        }
    }
}
