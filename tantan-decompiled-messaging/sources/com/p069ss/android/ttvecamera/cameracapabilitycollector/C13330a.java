package com.p069ss.android.ttvecamera.cameracapabilitycollector;

import com.p069ss.android.ttvecamera.C13341g;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p149l.ajh0;

/* JADX INFO: renamed from: com.ss.android.ttvecamera.cameracapabilitycollector.a */
/* JADX INFO: loaded from: classes11.dex */
public class C13330a implements TECameraCapabilityCollector.InterfaceC13329b {

    /* JADX INFO: renamed from: a */
    public static final Map<TECameraCapabilityCollector.Capability, TECameraCapabilityCollector.DataType> f55488a;

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.cameracapabilitycollector.a$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f55489a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f55490b;

        static {
            int[] iArr = new int[TECameraCapabilityCollector.Capability.values().length];
            f55490b = iArr;
            try {
                iArr[TECameraCapabilityCollector.Capability.DEPTH_OUTPUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55490b[TECameraCapabilityCollector.Capability.PREVIEW_SIZE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55490b[TECameraCapabilityCollector.Capability.FPS_RANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55490b[TECameraCapabilityCollector.Capability.MANUAL_3A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f55490b[TECameraCapabilityCollector.Capability.HIGH_SPEED_VIDEO_FPS_RANGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55490b[TECameraCapabilityCollector.Capability.SUPPORT_APERTURES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f55490b[TECameraCapabilityCollector.Capability.LOGICAL_MULTI_CAMERA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f55490b[TECameraCapabilityCollector.Capability.SUPPORT_EXTENSIONS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f55490b[TECameraCapabilityCollector.Capability.FRONT_BACK_MULTICAM_COMBOS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr2 = new int[TECameraCapabilityCollector.DataType.values().length];
            f55489a = iArr2;
            try {
                iArr2[TECameraCapabilityCollector.DataType.INTEGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f55489a[TECameraCapabilityCollector.DataType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f55489a[TECameraCapabilityCollector.DataType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f55489a[TECameraCapabilityCollector.DataType.BOOLEAN.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f55489a[TECameraCapabilityCollector.DataType.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    static {
        HashMap map = new HashMap();
        f55488a = map;
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
    private String m80674c(TECameraCapabilityCollector.Capability capability) {
        switch (a.f55490b[capability.ordinal()]) {
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
                C13341g.m80823j("TECameraCapabilityKBUpload", "key is null, capability is incorrect!");
                return null;
        }
    }

    @Override // com.p069ss.android.ttvecamera.cameracapabilitycollector.TECameraCapabilityCollector.InterfaceC13329b
    /* JADX INFO: renamed from: a */
    public TECameraCapabilityCollector.DataType mo80672a(TECameraCapabilityCollector.Capability capability) {
        Map<TECameraCapabilityCollector.Capability, TECameraCapabilityCollector.DataType> map = f55488a;
        return map.get(capability) == null ? TECameraCapabilityCollector.DataType.UNKNOWN : map.get(capability);
    }

    @Override // com.p069ss.android.ttvecamera.cameracapabilitycollector.TECameraCapabilityCollector.InterfaceC13329b
    /* JADX INFO: renamed from: b */
    public void mo80673b(List<TECameraCapabilityCollector.C13328a> list) {
        for (TECameraCapabilityCollector.C13328a c13328a : list) {
            String strM80674c = m80674c(c13328a.f55485a);
            if (strM80674c != null) {
                int i = a.f55489a[c13328a.f55486b.ordinal()];
                if (i == 1 || i == 2) {
                    ajh0.m96973b(strM80674c, ((Long) c13328a.f55487c).longValue());
                } else if (i == 3) {
                    ajh0.m96972a(strM80674c, ((Double) c13328a.f55487c).doubleValue());
                } else if (i == 4) {
                    ajh0.m96974c(strM80674c, ((Boolean) c13328a.f55487c).booleanValue() ? "true" : "false");
                } else if (i == 5) {
                    ajh0.m96974c(strM80674c, (String) c13328a.f55487c);
                }
            }
        }
    }
}
