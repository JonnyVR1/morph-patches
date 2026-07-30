package com.p000p1.mobile.putong.api.mobile;

import com.p1.mobile.putong.data.MobileRespInfo;
import l.aqb;
import l.ioj0;
import l.j760;
import l.y500;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ChinaMobileController {

    /* JADX INFO: renamed from: d */
    public static ChinaMobileController f1155d;

    /* JADX INFO: renamed from: a */
    public ioj0 f1156a = new ioj0();

    /* JADX INFO: renamed from: b */
    public y500 f1157b = new y500();

    /* JADX INFO: renamed from: c */
    public aqb f1158c = new aqb();

    public enum MobileType {
        mobile,
        unicom,
        telecom,
        unknown
    }

    /* JADX INFO: renamed from: b */
    public static ChinaMobileController m1499b() {
        if (f1155d == null) {
            synchronized (ChinaMobileController.class) {
                try {
                    if (f1155d == null) {
                        f1155d = new ChinaMobileController();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f1155d;
    }

    /* JADX INFO: renamed from: c */
    public static String m1500c() {
        return "";
    }

    /* JADX INFO: renamed from: d */
    public static j760<String, String> m1501d() {
        return j760.a("", "");
    }

    /* JADX INFO: renamed from: e */
    public static MobileType m1502e() {
        return MobileType.unknown;
    }

    /* JADX INFO: renamed from: a */
    public aqb m1503a() {
        return this.f1158c;
    }

    /* JADX INFO: renamed from: f */
    public y500 m1504f() {
        return this.f1157b;
    }

    /* JADX INFO: renamed from: g */
    public ioj0 m1505g() {
        return this.f1156a;
    }

    /* JADX INFO: renamed from: h */
    public c<MobileRespInfo> m1506h(int i) {
        return c.empty();
    }

    /* JADX INFO: renamed from: i */
    public c<MobileRespInfo> m1507i(int i) {
        return c.empty();
    }
}
