package p009l;

import android.text.TextUtils;
import android.util.Pair;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.SettingGroups;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import l.e30;
import l.j760;
import l.mkd0;
import l.w9j;
import l.xaj0;
import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class f4v {

    /* JADX INFO: renamed from: c */
    public static f4v f12809c;

    /* JADX INFO: renamed from: a */
    public HashMap<String, xaj0<ValueObject, ValueObject, Boolean>> f12810a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public b<Pair<String, xaj0<ValueObject, ValueObject, Boolean>>> f12811b = b.b();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ xaj0 m14247a(Pair pair) {
        return (xaj0) pair.second;
    }

    /* JADX INFO: renamed from: f */
    public static f4v m14251f() {
        if (f12809c == null) {
            synchronized (f4v.class) {
                try {
                    if (f12809c == null) {
                        f12809c = new f4v();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12809c;
    }

    /* JADX INFO: renamed from: e */
    public void m14252e(String str, ValueObject valueObject, ValueObject valueObject2, Boolean bool) {
        if (this.f12810a.containsKey(str)) {
            return;
        }
        this.f12810a.put(str, xaj0.a(valueObject, valueObject2, bool));
    }

    /* JADX INFO: renamed from: g */
    public xaj0<ValueObject, ValueObject, Boolean> m14253g(String str) {
        return this.f12810a.get(str);
    }

    /* JADX INFO: renamed from: h */
    public boolean m14254h(ValueObject valueObject) {
        if (!NullChecker.a(valueObject) || CoreModule.Q().m9072ub(valueObject) || !NullChecker.a(CoreModule.c.e0.R)) {
            return false;
        }
        SettingGroups settingGroups = (SettingGroups) CoreModule.c.e0.R.get();
        if (NullChecker.a(settingGroups) && NullChecker.a(settingGroups.live) && NullChecker.a(settingGroups.live.hideStoppedRoom)) {
            return settingGroups.live.hideStoppedRoom.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public boolean m14255i(String str) {
        if (this.f12810a.containsKey(str)) {
            xaj0<ValueObject, ValueObject, Boolean> xaj0Var = this.f12810a.get(str);
            if (TextUtils.equals(str, CoreModule.H().userId()) && NullChecker.a(xaj0Var) && m14254h((ValueObject) xaj0Var.a)) {
                return false;
            }
            if (xaj0Var == null || !((Boolean) xaj0Var.c).booleanValue() || xaj0Var.a != null) {
                return true;
            }
            if (xaj0Var.b != null) {
                return CoreModule.Q().m9031Vm((ValueObject) xaj0Var.b);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m14256j(String str, j760 j760Var) {
        xaj0<ValueObject, ValueObject, Boolean> xaj0VarA = xaj0.a((ValueObject) j760Var.a, (ValueObject) j760Var.b, Boolean.TRUE);
        this.f12810a.put(str, xaj0VarA);
        this.f12811b.onNext(Pair.create(str, xaj0VarA));
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m14257k(String str, Throwable th) {
        this.f12810a.remove(str);
    }

    /* JADX INFO: renamed from: l */
    public c<xaj0<ValueObject, ValueObject, Boolean>> m14258l(final String str) {
        return this.f12811b.filter(new w9j() { // from class: l.d4v
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals((CharSequence) ((Pair) obj).first, str));
            }
        }).map(new w9j() { // from class: l.e4v
            public final Object call(Object obj) {
                return f4v.m14247a((Pair) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public void m14259m(String str) {
        if (this.f12810a.containsKey(str)) {
            return;
        }
        this.f12810a.put(str, xaj0.a((Object) null, (Object) null, Boolean.FALSE));
        m14261o(str);
    }

    /* JADX INFO: renamed from: n */
    public void m14260n(String str) {
        this.f12810a.remove(str);
    }

    /* JADX INFO: renamed from: o */
    public final void m14261o(final String str) {
        CoreModule.Q().m9027S8(str).subscribe(mkd0.H(new e30() { // from class: l.b4v
            public final void call(Object obj) {
                this.f9898a.m14256j(str, (j760) obj);
            }
        }, new e30() { // from class: l.c4v
            public final void call(Object obj) {
                this.f10434a.m14257k(str, (Throwable) obj);
            }
        }));
    }
}
