package com.p046p1.mobile.putong.api.mobile;

import com.p046p1.mobile.putong.data.MobileRespInfo;
import p133rx.C22306c;
import p149l.aqb;
import p149l.ioj0;
import p149l.j760;
import p149l.y500;

/* JADX INFO: loaded from: classes9.dex */
public class ChinaMobileController {

    /* JADX INFO: renamed from: d */
    public static ChinaMobileController f17166d;

    /* JADX INFO: renamed from: a */
    public ioj0 f17167a = new ioj0();

    /* JADX INFO: renamed from: b */
    public y500 f17168b = new y500();

    /* JADX INFO: renamed from: c */
    public aqb f17169c = new aqb();

    public enum MobileType {
        mobile,
        unicom,
        telecom,
        unknown
    }

    /* JADX INFO: renamed from: b */
    public static ChinaMobileController m29593b() {
        if (f17166d == null) {
            synchronized (ChinaMobileController.class) {
                try {
                    if (f17166d == null) {
                        f17166d = new ChinaMobileController();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17166d;
    }

    /* JADX INFO: renamed from: c */
    public static String m29594c() {
        return "";
    }

    /* JADX INFO: renamed from: d */
    public static j760<String, String> m29595d() {
        return j760.m140076a("", "");
    }

    /* JADX INFO: renamed from: e */
    public static MobileType m29596e() {
        return MobileType.unknown;
    }

    /* JADX INFO: renamed from: a */
    public aqb m29597a() {
        return this.f17169c;
    }

    /* JADX INFO: renamed from: f */
    public y500 m29598f() {
        return this.f17168b;
    }

    /* JADX INFO: renamed from: g */
    public ioj0 m29599g() {
        return this.f17167a;
    }

    /* JADX INFO: renamed from: h */
    public C22306c<MobileRespInfo> m29600h(int i) {
        return C22306c.empty();
    }

    /* JADX INFO: renamed from: i */
    public C22306c<MobileRespInfo> m29601i(int i) {
        return C22306c.empty();
    }
}
