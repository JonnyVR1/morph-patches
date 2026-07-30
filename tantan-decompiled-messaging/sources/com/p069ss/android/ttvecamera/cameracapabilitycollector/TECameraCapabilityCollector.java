package com.p069ss.android.ttvecamera.cameracapabilitycollector;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class TECameraCapabilityCollector {

    /* JADX INFO: renamed from: d */
    public static final Map<Integer, Capability> f55481d;

    /* JADX INFO: renamed from: a */
    private List<C13328a> f55482a;

    /* JADX INFO: renamed from: b */
    private InterfaceC13329b f55483b;

    /* JADX INFO: renamed from: c */
    private boolean f55484c = false;

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
    public static class C13328a {

        /* JADX INFO: renamed from: a */
        public Capability f55485a;

        /* JADX INFO: renamed from: b */
        public DataType f55486b;

        /* JADX INFO: renamed from: c */
        public Object f55487c;

        public C13328a(Capability capability, DataType dataType, Object obj) {
            this.f55485a = capability;
            this.f55486b = dataType;
            this.f55487c = obj;
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.cameracapabilitycollector.TECameraCapabilityCollector$b */
    public interface InterfaceC13329b {
        /* JADX INFO: renamed from: a */
        DataType mo80672a(Capability capability);

        /* JADX INFO: renamed from: b */
        void mo80673b(List<C13328a> list);
    }

    static {
        HashMap map = new HashMap();
        f55481d = map;
        map.put(8, Capability.DEPTH_OUTPUT);
        map.put(1, Capability.MANUAL_3A);
        map.put(11, Capability.LOGICAL_MULTI_CAMERA);
    }

    /* JADX INFO: renamed from: a */
    public void m80668a(C13328a c13328a) {
        List<C13328a> list = this.f55482a;
        if (list != null) {
            list.add(c13328a);
        }
    }

    /* JADX INFO: renamed from: b */
    public DataType m80669b(Capability capability) {
        return this.f55483b.mo80672a(capability);
    }

    /* JADX INFO: renamed from: c */
    public void m80670c(InterfaceC13329b interfaceC13329b) {
        if (this.f55484c) {
            return;
        }
        if (this.f55482a == null) {
            this.f55482a = new ArrayList();
        }
        if (this.f55483b == null) {
            this.f55483b = interfaceC13329b;
        }
        this.f55484c = true;
    }

    /* JADX INFO: renamed from: d */
    public void m80671d() {
        this.f55483b.mo80673b(this.f55482a);
        this.f55482a.clear();
    }
}
