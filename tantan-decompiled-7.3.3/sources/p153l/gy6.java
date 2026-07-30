package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4883c;
import java.util.HashSet;

/* JADX INFO: loaded from: classes9.dex */
public class gy6 extends dy6 {

    /* JADX INFO: renamed from: R */
    public byd0 f107031R;

    /* JADX INFO: renamed from: S */
    public final xyd0 f107032S;

    /* JADX INFO: renamed from: T */
    public final xyd0 f107033T;

    public gy6(C4883c c4883c) {
        super(c4883c);
        this.f107031R = new byd0("app_first_show_main_time", 0L);
        this.f107032S = new xyd0("app_update_version_dot_set", new HashSet());
        this.f107033T = new xyd0("app_update_version_new_set", new HashSet());
    }

    /* JADX INFO: renamed from: a3 */
    public boolean m132933a3() {
        return TextUtils.isEmpty(CoreModule.f18265d.m217946F()) || "7.3.3".compareTo(CoreModule.f18265d.m217946F()) >= 0;
    }

    /* JADX INFO: renamed from: b3 */
    public boolean m132934b3() {
        return !TextUtils.isEmpty(CoreModule.f18265d.m217956z()) && !TextUtils.isEmpty(CoreModule.f18265d.m217946F()) && CoreModule.f18265d.m217955y() && "7.3.3".compareTo(CoreModule.f18265d.m217956z()) < 0;
    }

    /* JADX INFO: renamed from: c3 */
    public boolean m132935c3() {
        return ((this.f91137Q.f20291A0.f107031R.get().longValue() > 0L ? 1 : (this.f91137Q.f20291A0.f107031R.get().longValue() == 0L ? 0 : -1)) == 0 ? false : tzi0.m193670h(pzi0.m174453n(), this.f91137Q.f20291A0.f107031R.get().longValue(), 21)) && !new HashSet(this.f107032S.get()).contains(CoreModule.f18265d.m217946F());
    }

    /* JADX INFO: renamed from: d3 */
    public void m132936d3() {
        HashSet hashSet = new HashSet(this.f107032S.get());
        if (hashSet.contains(CoreModule.f18265d.m217946F())) {
            return;
        }
        hashSet.add(CoreModule.f18265d.m217946F());
        this.f107032S.put(hashSet);
    }
}
