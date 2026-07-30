package com.p051p1.mobile.putong.api.mobile;

import com.p051p1.mobile.putong.data.MobileRespInfo;
import p137rx.C22421c;
import p153l.ie00;
import p153l.lxj0;
import p153l.orb;
import p153l.pf60;

/* JADX INFO: loaded from: classes9.dex */
public class ChinaMobileController {

    /* JADX INFO: renamed from: d */
    public static ChinaMobileController f17885d;

    /* JADX INFO: renamed from: a */
    public lxj0 f17886a = new lxj0();

    /* JADX INFO: renamed from: b */
    public ie00 f17887b = new ie00();

    /* JADX INFO: renamed from: c */
    public orb f17888c = new orb();

    public enum MobileType {
        mobile,
        unicom,
        telecom,
        unknown
    }

    /* JADX INFO: renamed from: b */
    public static ChinaMobileController m30591b() {
        if (f17885d == null) {
            synchronized (ChinaMobileController.class) {
                try {
                    if (f17885d == null) {
                        f17885d = new ChinaMobileController();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17885d;
    }

    /* JADX INFO: renamed from: c */
    public static String m30592c() {
        return "";
    }

    /* JADX INFO: renamed from: d */
    public static pf60<String, String> m30593d() {
        return pf60.m172085a("", "");
    }

    /* JADX INFO: renamed from: e */
    public static MobileType m30594e() {
        return MobileType.unknown;
    }

    /* JADX INFO: renamed from: a */
    public orb m30595a() {
        return this.f17888c;
    }

    /* JADX INFO: renamed from: f */
    public ie00 m30596f() {
        return this.f17887b;
    }

    /* JADX INFO: renamed from: g */
    public lxj0 m30597g() {
        return this.f17886a;
    }

    /* JADX INFO: renamed from: h */
    public C22421c<MobileRespInfo> m30598h(int i) {
        return C22421c.empty();
    }

    /* JADX INFO: renamed from: i */
    public C22421c<MobileRespInfo> m30599i(int i) {
        return C22421c.empty();
    }
}
