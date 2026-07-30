package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0158c;
import java.util.Collection;
import java.util.HashSet;
import l.mqi0;
import l.qqi0;
import l.vqd0;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class dx6 extends ax6 {

    /* JADX INFO: renamed from: R */
    public zpd0 f10633R;

    /* JADX INFO: renamed from: S */
    public final vqd0 f10634S;

    /* JADX INFO: renamed from: T */
    public final vqd0 f10635T;

    public dx6(C0158c c0158c) {
        super(c0158c);
        this.f10633R = new zpd0("app_first_show_main_time", 0L);
        this.f10634S = new vqd0("app_update_version_dot_set", new HashSet());
        this.f10635T = new vqd0("app_update_version_new_set", new HashSet());
    }

    /* JADX INFO: renamed from: a3 */
    public boolean m14310a3() {
        return TextUtils.isEmpty(CoreModule.f1535d.m25979F()) || "7.2.7".compareTo(CoreModule.f1535d.m25979F()) >= 0;
    }

    /* JADX INFO: renamed from: b3 */
    public boolean m14311b3() {
        return !TextUtils.isEmpty(CoreModule.f1535d.m25989z()) && !TextUtils.isEmpty(CoreModule.f1535d.m25979F()) && CoreModule.f1535d.m25988y() && "7.2.7".compareTo(CoreModule.f1535d.m25989z()) < 0;
    }

    /* JADX INFO: renamed from: c3 */
    public boolean m14312c3() {
        return ((((Long) this.f8580Q.f3538A0.f10633R.get()).longValue() > 0L ? 1 : (((Long) this.f8580Q.f3538A0.f10633R.get()).longValue() == 0L ? 0 : -1)) == 0 ? false : qqi0.h(mqi0.n(), ((Long) this.f8580Q.f3538A0.f10633R.get()).longValue(), 21)) && !new HashSet((Collection) this.f10634S.get()).contains(CoreModule.f1535d.m25979F());
    }

    /* JADX INFO: renamed from: d3 */
    public void m14313d3() {
        HashSet hashSet = new HashSet((Collection) this.f10634S.get());
        if (hashSet.contains(CoreModule.f1535d.m25979F())) {
            return;
        }
        hashSet.add(CoreModule.f1535d.m25979F());
        this.f10634S.put(hashSet);
    }
}
