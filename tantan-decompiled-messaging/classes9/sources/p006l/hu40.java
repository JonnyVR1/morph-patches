package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.notifications.NotificationCheckerCommon;
import java.util.HashSet;
import l.mqi0;
import l.qqi0;
import l.uq40;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class hu40 {

    /* JADX INFO: renamed from: b */
    public static long f14078b = 86400000;

    /* JADX INFO: renamed from: c */
    public static volatile hu40 f14079c;

    /* JADX INFO: renamed from: a */
    public int f14080a = 0;

    /* JADX INFO: renamed from: a */
    public static hu40 m16380a() {
        if (f14079c == null) {
            synchronized (hu40.class) {
                try {
                    if (f14079c == null) {
                        f14079c = new hu40();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14079c;
    }

    /* JADX INFO: renamed from: b */
    public boolean m16381b() {
        return NotificationCheckerCommon.a() != NotificationCheckerCommon.State.closed && CoreModule.f1534c.f3628e0.m21490p9().getUserPushAllEnable();
    }

    /* JADX INFO: renamed from: c */
    public boolean m16382c() {
        if (this.f14080a > 0 && mqi0.o() >= ((Long) CoreModule.f1534c.f3628e0.f19056p0.get()).longValue() && qqi0.h(mqi0.o(), ((Long) CoreModule.f1534c.f3628e0.f19041n0.get()).longValue(), 1)) {
            return NotificationCheckerCommon.a() == NotificationCheckerCommon.State.closed || !CoreModule.f1534c.f3628e0.m21490p9().getUserPushAllEnable();
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public boolean m16383d(String str) {
        if (!qqi0.h(mqi0.o(), ((Long) CoreModule.f1534c.f3628e0.f19070r0.get()).longValue(), 1)) {
            if (((HashSet) CoreModule.f1534c.f3628e0.f19077s0.get()).contains(str)) {
                return false;
            }
            return ((HashSet) CoreModule.f1534c.f3628e0.f19063q0.get()).contains(str) || ((HashSet) CoreModule.f1534c.f3628e0.f19063q0.get()).size() < 2;
        }
        CoreModule.f1534c.f3628e0.f19070r0.put(Long.valueOf(mqi0.o()));
        CoreModule.f1534c.f3628e0.f19063q0.put(new HashSet());
        CoreModule.f1534c.f3628e0.f19077s0.put(new HashSet());
        return true;
    }

    /* JADX INFO: renamed from: e */
    public void m16384e(int i) {
        this.f14080a = i;
    }

    /* JADX INFO: renamed from: f */
    public boolean m16385f(Act act, boolean z) {
        if (this.f14080a <= 0 && ((Long) CoreModule.f1534c.f3611Y0.f11580d.get()).longValue() < 1) {
            return false;
        }
        if ((NotificationCheckerCommon.a() != NotificationCheckerCommon.State.closed && CoreModule.f1534c.f3628e0.m21490p9().getUserPushAllEnable()) || !qqi0.h(mqi0.o(), ((Long) CoreModule.f1534c.f3628e0.f19009j0.get()).longValue(), 1) || mqi0.o() < ((Long) CoreModule.f1534c.f3628e0.f19025l0.get()).longValue()) {
            return false;
        }
        if (z) {
            uq40.G(act, false);
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public boolean m16386g() {
        HashSet hashSet = (HashSet) CoreModule.f1534c.f3628e0.f19049o0.get();
        if (hashSet.size() >= upa.m25520u()) {
            hashSet.clear();
        }
        hashSet.add(mqi0.o() + "");
        int size = hashSet.size();
        if (size >= upa.m25500q() && size < upa.m25520u()) {
            CoreModule.f1534c.f3628e0.f19056p0.put(Long.valueOf(mqi0.o() + (((long) upa.m25505r()) * f14078b)));
        } else if (size == upa.m25520u()) {
            CoreModule.f1534c.f3628e0.f19056p0.put(Long.valueOf(mqi0.o() + (((long) upa.m25525v()) * f14078b)));
        }
        CoreModule.f1534c.f3628e0.f19049o0.put(hashSet);
        return false;
    }

    /* JADX INFO: renamed from: h */
    public void m16387h() {
        HashSet hashSet = (HashSet) CoreModule.f1534c.f3628e0.f19017k0.get();
        if (hashSet.size() >= upa.m25510s()) {
            hashSet.clear();
        }
        hashSet.add(mqi0.o() + "");
        int size = hashSet.size();
        if (size >= 1 && size < upa.m25510s()) {
            CoreModule.f1534c.f3628e0.f19025l0.put(Long.valueOf(mqi0.o() + (((long) upa.m25530w()) * f14078b)));
        } else if (size == upa.m25510s()) {
            CoreModule.f1534c.f3628e0.f19025l0.put(Long.valueOf(mqi0.o() + (((long) upa.m25515t()) * f14078b)));
        }
        CoreModule.f1534c.f3628e0.f19017k0.put(hashSet);
    }
}
