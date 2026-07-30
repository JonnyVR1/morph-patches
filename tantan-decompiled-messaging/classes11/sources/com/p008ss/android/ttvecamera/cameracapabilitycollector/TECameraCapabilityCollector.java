package com.p008ss.android.ttvecamera.cameracapabilitycollector;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class TECameraCapabilityCollector {

    /* JADX INFO: renamed from: d */
    public static final Map<Integer, Capability> f9087d;

    /* JADX INFO: renamed from: a */
    private List<C0730a> f9088a;

    /* JADX INFO: renamed from: b */
    private InterfaceC0731b f9089b;

    /* JADX INFO: renamed from: c */
    private boolean f9090c = false;

    public enum Capability {
        DEPTH_OUTPUT,
        PREVIEW_SIZE,
        FPS_RANGE,
        MANUAL_3A,
        HIGH_SPEED_VIDEO_FPS_RANGE,
        SUPPORT_APERTURES,
        LOGICAL_MULTI_CAMERA,
        SUPPORT_EXTENSIONS,
        FRONT_BACK_MULTICAM_COMBOS
    }

    public enum DataType {
        UNKNOWN,
        BOOLEAN,
        INTEGER,
        LONG,
        FLOAT,
        STRING
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.cameracapabilitycollector.TECameraCapabilityCollector$a */
    public static class C0730a {

        /* JADX INFO: renamed from: a */
        public Capability f9091a;

        /* JADX INFO: renamed from: b */
        public DataType f9092b;

        /* JADX INFO: renamed from: c */
        public Object f9093c;

        public C0730a(Capability capability, DataType dataType, Object obj) {
            this.f9091a = capability;
            this.f9092b = dataType;
            this.f9093c = obj;
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.cameracapabilitycollector.TECameraCapabilityCollector$b */
    public interface InterfaceC0731b {
        /* JADX INFO: renamed from: a */
        DataType mo11023a(Capability capability);

        /* JADX INFO: renamed from: b */
        void mo11024b(List<C0730a> list);
    }

    static {
        HashMap map = new HashMap();
        f9087d = map;
        map.put(8, Capability.DEPTH_OUTPUT);
        map.put(1, Capability.MANUAL_3A);
        map.put(11, Capability.LOGICAL_MULTI_CAMERA);
    }

    /* JADX INFO: renamed from: a */
    public void m11019a(C0730a c0730a) {
        List<C0730a> list = this.f9088a;
        if (list != null) {
            list.add(c0730a);
        }
    }

    /* JADX INFO: renamed from: b */
    public DataType m11020b(Capability capability) {
        return this.f9089b.mo11023a(capability);
    }

    /* JADX INFO: renamed from: c */
    public void m11021c(InterfaceC0731b interfaceC0731b) {
        if (this.f9090c) {
            return;
        }
        if (this.f9088a == null) {
            this.f9088a = new ArrayList();
        }
        if (this.f9089b == null) {
            this.f9089b = interfaceC0731b;
        }
        this.f9090c = true;
    }

    /* JADX INFO: renamed from: d */
    public void m11022d() {
        this.f9089b.mo11024b(this.f9088a);
        this.f9088a.clear();
    }
}
