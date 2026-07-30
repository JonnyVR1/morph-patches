package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.notifications.NotificationCheckerCommon;
import java.util.HashSet;

/* JADX INFO: loaded from: classes9.dex */
public class hu40 {

    /* JADX INFO: renamed from: b */
    public static long f109513b = 86400000;

    /* JADX INFO: renamed from: c */
    public static volatile hu40 f109514c;

    /* JADX INFO: renamed from: a */
    public int f109515a = 0;

    /* JADX INFO: renamed from: a */
    public static hu40 m133026a() {
        if (f109514c == null) {
            synchronized (hu40.class) {
                try {
                    if (f109514c == null) {
                        f109514c = new hu40();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f109514c;
    }

    /* JADX INFO: renamed from: b */
    public boolean m133027b() {
        return NotificationCheckerCommon.m79220a() != NotificationCheckerCommon.State.closed && CoreModule.f17545c.f19639e0.m169527p9().getUserPushAllEnable();
    }

    /* JADX INFO: renamed from: c */
    public boolean m133028c() {
        if (this.f109515a > 0 && mqi0.m155944o() >= CoreModule.f17545c.f19639e0.f149444p0.get().longValue() && qqi0.m175940h(mqi0.m155944o(), CoreModule.f17545c.f19639e0.f149429n0.get().longValue(), 1)) {
            return NotificationCheckerCommon.m79220a() == NotificationCheckerCommon.State.closed || !CoreModule.f17545c.f19639e0.m169527p9().getUserPushAllEnable();
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public boolean m133029d(String str) {
        if (!qqi0.m175940h(mqi0.m155944o(), CoreModule.f17545c.f19639e0.f149458r0.get().longValue(), 1)) {
            if (CoreModule.f17545c.f19639e0.f149465s0.get().contains(str)) {
                return false;
            }
            return CoreModule.f17545c.f19639e0.f149451q0.get().contains(str) || CoreModule.f17545c.f19639e0.f149451q0.get().size() < 2;
        }
        CoreModule.f17545c.f19639e0.f149458r0.put(Long.valueOf(mqi0.m155944o()));
        CoreModule.f17545c.f19639e0.f149451q0.put(new HashSet());
        CoreModule.f17545c.f19639e0.f149465s0.put(new HashSet());
        return true;
    }

    /* JADX INFO: renamed from: e */
    public void m133030e(int i) {
        this.f109515a = i;
    }

    /* JADX INFO: renamed from: f */
    public boolean m133031f(Act act, boolean z) {
        if (this.f109515a <= 0 && CoreModule.f17545c.f19622Y0.f94259d.get().longValue() < 1) {
            return false;
        }
        if ((NotificationCheckerCommon.m79220a() != NotificationCheckerCommon.State.closed && CoreModule.f17545c.f19639e0.m169527p9().getUserPushAllEnable()) || !qqi0.m175940h(mqi0.m155944o(), CoreModule.f17545c.f19639e0.f149397j0.get().longValue(), 1) || mqi0.m155944o() < CoreModule.f17545c.f19639e0.f149413l0.get().longValue()) {
            return false;
        }
        if (z) {
            uq40.m194957G(act, false);
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public boolean m133032g() {
        HashSet<String> hashSet = CoreModule.f17545c.f19639e0.f149437o0.get();
        if (hashSet.size() >= upa.m194822u()) {
            hashSet.clear();
        }
        hashSet.add(mqi0.m155944o() + "");
        int size = hashSet.size();
        if (size >= upa.m194802q() && size < upa.m194822u()) {
            CoreModule.f17545c.f19639e0.f149444p0.put(Long.valueOf(mqi0.m155944o() + (((long) upa.m194807r()) * f109513b)));
        } else if (size == upa.m194822u()) {
            CoreModule.f17545c.f19639e0.f149444p0.put(Long.valueOf(mqi0.m155944o() + (((long) upa.m194827v()) * f109513b)));
        }
        CoreModule.f17545c.f19639e0.f149437o0.put(hashSet);
        return false;
    }

    /* JADX INFO: renamed from: h */
    public void m133033h() {
        HashSet<String> hashSet = CoreModule.f17545c.f19639e0.f149405k0.get();
        if (hashSet.size() >= upa.m194812s()) {
            hashSet.clear();
        }
        hashSet.add(mqi0.m155944o() + "");
        int size = hashSet.size();
        if (size >= 1 && size < upa.m194812s()) {
            CoreModule.f17545c.f19639e0.f149413l0.put(Long.valueOf(mqi0.m155944o() + (((long) upa.m194832w()) * f109513b)));
        } else if (size == upa.m194812s()) {
            CoreModule.f17545c.f19639e0.f149413l0.put(Long.valueOf(mqi0.m155944o() + (((long) upa.m194817t()) * f109513b)));
        }
        CoreModule.f17545c.f19639e0.f149405k0.put(hashSet);
    }
}
