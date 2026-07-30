package com.p074ss.android.ttvecamera.cameracapabilitycollector;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class TECameraCapabilityCollector {

    /* JADX INFO: renamed from: d */
    public static final Map<Integer, Capability> f56329d;

    /* JADX INFO: renamed from: a */
    private List<C13491a> f56330a;

    /* JADX INFO: renamed from: b */
    private InterfaceC13492b f56331b;

    /* JADX INFO: renamed from: c */
    private boolean f56332c = false;

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
    public static class C13491a {

        /* JADX INFO: renamed from: a */
        public Capability f56333a;

        /* JADX INFO: renamed from: b */
        public DataType f56334b;

        /* JADX INFO: renamed from: c */
        public Object f56335c;

        public C13491a(Capability capability, DataType dataType, Object obj) {
            this.f56333a = capability;
            this.f56334b = dataType;
            this.f56335c = obj;
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.cameracapabilitycollector.TECameraCapabilityCollector$b */
    public interface InterfaceC13492b {
        /* JADX INFO: renamed from: a */
        DataType mo81855a(Capability capability);

        /* JADX INFO: renamed from: b */
        void mo81856b(List<C13491a> list);
    }

    static {
        HashMap map = new HashMap();
        f56329d = map;
        map.put(8, Capability.DEPTH_OUTPUT);
        map.put(1, Capability.MANUAL_3A);
        map.put(11, Capability.LOGICAL_MULTI_CAMERA);
    }

    /* JADX INFO: renamed from: a */
    public void m81851a(C13491a c13491a) {
        List<C13491a> list = this.f56330a;
        if (list != null) {
            list.add(c13491a);
        }
    }

    /* JADX INFO: renamed from: b */
    public DataType m81852b(Capability capability) {
        return this.f56331b.mo81855a(capability);
    }

    /* JADX INFO: renamed from: c */
    public void m81853c(InterfaceC13492b interfaceC13492b) {
        if (this.f56332c) {
            return;
        }
        if (this.f56330a == null) {
            this.f56330a = new ArrayList();
        }
        if (this.f56331b == null) {
            this.f56331b = interfaceC13492b;
        }
        this.f56332c = true;
    }

    /* JADX INFO: renamed from: d */
    public void m81854d() {
        this.f56331b.mo81856b(this.f56330a);
        this.f56330a.clear();
    }
}
