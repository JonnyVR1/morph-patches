package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4732c;
import java.util.HashSet;

/* JADX INFO: loaded from: classes9.dex */
public class dx6 extends ax6 {

    /* JADX INFO: renamed from: R */
    public zpd0 f88268R;

    /* JADX INFO: renamed from: S */
    public final vqd0 f88269S;

    /* JADX INFO: renamed from: T */
    public final vqd0 f88270T;

    public dx6(C4732c c4732c) {
        super(c4732c);
        this.f88268R = new zpd0("app_first_show_main_time", 0L);
        this.f88269S = new vqd0("app_update_version_dot_set", new HashSet());
        this.f88270T = new vqd0("app_update_version_new_set", new HashSet());
    }

    /* JADX INFO: renamed from: a3 */
    public boolean m113988a3() {
        return TextUtils.isEmpty(CoreModule.f17546d.m200500F()) || "7.2.7".compareTo(CoreModule.f17546d.m200500F()) >= 0;
    }

    /* JADX INFO: renamed from: b3 */
    public boolean m113989b3() {
        return !TextUtils.isEmpty(CoreModule.f17546d.m200510z()) && !TextUtils.isEmpty(CoreModule.f17546d.m200500F()) && CoreModule.f17546d.m200509y() && "7.2.7".compareTo(CoreModule.f17546d.m200510z()) < 0;
    }

    /* JADX INFO: renamed from: c3 */
    public boolean m113990c3() {
        return ((this.f72126Q.f19549A0.f88268R.get().longValue() > 0L ? 1 : (this.f72126Q.f19549A0.f88268R.get().longValue() == 0L ? 0 : -1)) == 0 ? false : qqi0.m175940h(mqi0.m155943n(), this.f72126Q.f19549A0.f88268R.get().longValue(), 21)) && !new HashSet(this.f88269S.get()).contains(CoreModule.f17546d.m200500F());
    }

    /* JADX INFO: renamed from: d3 */
    public void m113991d3() {
        HashSet hashSet = new HashSet(this.f88269S.get());
        if (hashSet.contains(CoreModule.f17546d.m200500F())) {
            return;
        }
        hashSet.add(CoreModule.f17546d.m200500F());
        this.f88269S.put(hashSet);
    }
}
