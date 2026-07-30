package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.notifications.NotificationCheckerCommon;
import java.util.HashSet;

/* JADX INFO: loaded from: classes12.dex */
public class w250 {

    /* JADX INFO: renamed from: b */
    public static long f186872b = 86400000;

    /* JADX INFO: renamed from: c */
    public static volatile w250 f186873c;

    /* JADX INFO: renamed from: a */
    public int f186874a = 0;

    /* JADX INFO: renamed from: a */
    public static w250 m204531a() {
        if (f186873c == null) {
            synchronized (w250.class) {
                try {
                    if (f186873c == null) {
                        f186873c = new w250();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f186873c;
    }

    /* JADX INFO: renamed from: b */
    public boolean m204532b() {
        return NotificationCheckerCommon.m80403a() != NotificationCheckerCommon.State.closed && CoreModule.f18264c.f20381e0.m116600p9().getUserPushAllEnable();
    }

    /* JADX INFO: renamed from: c */
    public boolean m204533c() {
        if (this.f186874a > 0 && pzi0.m174454o() >= CoreModule.f18264c.f20381e0.f89301p0.get().longValue() && tzi0.m193670h(pzi0.m174454o(), CoreModule.f18264c.f20381e0.f89286n0.get().longValue(), 1)) {
            return NotificationCheckerCommon.m80403a() == NotificationCheckerCommon.State.closed || !CoreModule.f18264c.f20381e0.m116600p9().getUserPushAllEnable();
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public boolean m204534d(String str) {
        if (!tzi0.m193670h(pzi0.m174454o(), CoreModule.f18264c.f20381e0.f89315r0.get().longValue(), 1)) {
            if (CoreModule.f18264c.f20381e0.f89322s0.get().contains(str)) {
                return false;
            }
            return CoreModule.f18264c.f20381e0.f89308q0.get().contains(str) || CoreModule.f18264c.f20381e0.f89308q0.get().size() < 2;
        }
        CoreModule.f18264c.f20381e0.f89315r0.put(Long.valueOf(pzi0.m174454o()));
        CoreModule.f18264c.f20381e0.f89308q0.put(new HashSet());
        CoreModule.f18264c.f20381e0.f89322s0.put(new HashSet());
        return true;
    }

    /* JADX INFO: renamed from: e */
    public void m204535e(int i) {
        this.f186874a = i;
    }

    /* JADX INFO: renamed from: f */
    public boolean m204536f(Act act, boolean z) {
        if (this.f186874a <= 0 && CoreModule.f18264c.f20364Y0.f161162d.get().longValue() < 1) {
            return false;
        }
        if ((NotificationCheckerCommon.m80403a() != NotificationCheckerCommon.State.closed && CoreModule.f18264c.f20381e0.m116600p9().getUserPushAllEnable()) || !tzi0.m193670h(pzi0.m174454o(), CoreModule.f18264c.f20381e0.f89254j0.get().longValue(), 1) || pzi0.m174454o() < CoreModule.f18264c.f20381e0.f89270l0.get().longValue()) {
            return false;
        }
        if (z) {
            iz40.m142762G(act, false);
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public boolean m204537g() {
        HashSet<String> hashSet = CoreModule.f18264c.f20381e0.f89294o0.get();
        if (hashSet.size() >= gra.m131753u()) {
            hashSet.clear();
        }
        hashSet.add(pzi0.m174454o() + "");
        int size = hashSet.size();
        if (size >= gra.m131733q() && size < gra.m131753u()) {
            CoreModule.f18264c.f20381e0.f89301p0.put(Long.valueOf(pzi0.m174454o() + (((long) gra.m131738r()) * f186872b)));
        } else if (size == gra.m131753u()) {
            CoreModule.f18264c.f20381e0.f89301p0.put(Long.valueOf(pzi0.m174454o() + (((long) gra.m131758v()) * f186872b)));
        }
        CoreModule.f18264c.f20381e0.f89294o0.put(hashSet);
        return false;
    }

    /* JADX INFO: renamed from: h */
    public void m204538h() {
        HashSet<String> hashSet = CoreModule.f18264c.f20381e0.f89262k0.get();
        if (hashSet.size() >= gra.m131743s()) {
            hashSet.clear();
        }
        hashSet.add(pzi0.m174454o() + "");
        int size = hashSet.size();
        if (size >= 1 && size < gra.m131743s()) {
            CoreModule.f18264c.f20381e0.f89270l0.put(Long.valueOf(pzi0.m174454o() + (((long) gra.m131763w()) * f186872b)));
        } else if (size == gra.m131743s()) {
            CoreModule.f18264c.f20381e0.f89270l0.put(Long.valueOf(pzi0.m174454o() + (((long) gra.m131748t()) * f186872b)));
        }
        CoreModule.f18264c.f20381e0.f89262k0.put(hashSet);
    }
}
