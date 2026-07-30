package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.RankLevel;

/* JADX INFO: loaded from: classes12.dex */
public class z90 {

    /* JADX INFO: renamed from: c */
    public static z90 f203432c;

    /* JADX INFO: renamed from: a */
    public wyd0 f203433a = new wyd0(RankLevel.city + CoreModule.m30929H().userId(), "");

    /* JADX INFO: renamed from: b */
    public vxd0 f203434b = new vxd0("advanced_swipe_card_times" + CoreModule.m30929H().userId(), 1);

    /* JADX INFO: renamed from: a */
    public static z90 m219037a() {
        if (f203432c == null) {
            synchronized (z90.class) {
                try {
                    if (f203432c == null) {
                        f203432c = new z90();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f203432c;
    }

    /* JADX INFO: renamed from: c */
    public static void m219038c() {
        f203432c = null;
    }

    /* JADX INFO: renamed from: b */
    public String m219039b() {
        return this.f203433a.get();
    }

    /* JADX INFO: renamed from: d */
    public void m219040d(String str) {
        this.f203433a.put(str);
    }
}
