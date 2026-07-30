package com.p008ss.android.ttvecamera.cameracapabilitycollector;

import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p008ss.android.ttvecamera.C0743g;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p009l.ajh0;

/* JADX INFO: renamed from: com.ss.android.ttvecamera.cameracapabilitycollector.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0732a implements TECameraCapabilityCollector.InterfaceC0731b {

    /* JADX INFO: renamed from: a */
    public static final Map<TECameraCapabilityCollector.Capability, TECameraCapabilityCollector.DataType> f9094a;

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.cameracapabilitycollector.a$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f9095a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f9096b;

        static {
            int[] iArr = new int[TECameraCapabilityCollector.Capability.values().length];
            f9096b = iArr;
            try {
                iArr[TECameraCapabilityCollector.Capability.DEPTH_OUTPUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9096b[TECameraCapabilityCollector.Capability.PREVIEW_SIZE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9096b[TECameraCapabilityCollector.Capability.FPS_RANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9096b[TECameraCapabilityCollector.Capability.MANUAL_3A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9096b[TECameraCapabilityCollector.Capability.HIGH_SPEED_VIDEO_FPS_RANGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9096b[TECameraCapabilityCollector.Capability.SUPPORT_APERTURES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9096b[TECameraCapabilityCollector.Capability.LOGICAL_MULTI_CAMERA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9096b[TECameraCapabilityCollector.Capability.SUPPORT_EXTENSIONS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9096b[TECameraCapabilityCollector.Capability.FRONT_BACK_MULTICAM_COMBOS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr2 = new int[TECameraCapabilityCollector.DataType.values().length];
            f9095a = iArr2;
            try {
                iArr2[TECameraCapabilityCollector.DataType.INTEGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9095a[TECameraCapabilityCollector.DataType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9095a[TECameraCapabilityCollector.DataType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f9095a[TECameraCapabilityCollector.DataType.BOOLEAN.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f9095a[TECameraCapabilityCollector.DataType.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    static {
        HashMap map = new HashMap();
        f9094a = map;
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
    private String m11025c(TECameraCapabilityCollector.Capability capability) {
        switch (a.f9096b[capability.ordinal()]) {
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
            case MediaPickerParamsObject.FROM_JS_BRIDGE_SWIPE_CARD /* 9 */:
                return "te_record_camera_front_back_multicam_combos";
            default:
                C0743g.m11174j("TECameraCapabilityKBUpload", "key is null, capability is incorrect!");
                return null;
        }
    }

    @Override // com.p008ss.android.ttvecamera.cameracapabilitycollector.TECameraCapabilityCollector.InterfaceC0731b
    /* JADX INFO: renamed from: a */
    public TECameraCapabilityCollector.DataType mo11023a(TECameraCapabilityCollector.Capability capability) {
        Map<TECameraCapabilityCollector.Capability, TECameraCapabilityCollector.DataType> map = f9094a;
        return map.get(capability) == null ? TECameraCapabilityCollector.DataType.UNKNOWN : map.get(capability);
    }

    @Override // com.p008ss.android.ttvecamera.cameracapabilitycollector.TECameraCapabilityCollector.InterfaceC0731b
    /* JADX INFO: renamed from: b */
    public void mo11024b(List<TECameraCapabilityCollector.C0730a> list) {
        for (TECameraCapabilityCollector.C0730a c0730a : list) {
            String strM11025c = m11025c(c0730a.f9091a);
            if (strM11025c != null) {
                int i = a.f9095a[c0730a.f9092b.ordinal()];
                if (i == 1 || i == 2) {
                    ajh0.m11494b(strM11025c, ((Long) c0730a.f9093c).longValue());
                } else if (i == 3) {
                    ajh0.m11493a(strM11025c, ((Double) c0730a.f9093c).doubleValue());
                } else if (i == 4) {
                    ajh0.m11495c(strM11025c, ((Boolean) c0730a.f9093c).booleanValue() ? "true" : "false");
                } else if (i == 5) {
                    ajh0.m11495c(strM11025c, (String) c0730a.f9093c);
                }
            }
        }
    }
}
