package p149l;

import android.text.TextUtils;
import android.util.Pair;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes11.dex */
public class f4v {

    /* JADX INFO: renamed from: c */
    public static f4v f94941c;

    /* JADX INFO: renamed from: a */
    public HashMap<String, xaj0<ValueObject, ValueObject, Boolean>> f94942a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public C22393b<Pair<String, xaj0<ValueObject, ValueObject, Boolean>>> f94943b = C22393b.m221521b();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ xaj0 m119455a(Pair pair) {
        return (xaj0) pair.second;
    }

    /* JADX INFO: renamed from: f */
    public static f4v m119459f() {
        if (f94941c == null) {
            synchronized (f4v.class) {
                try {
                    if (f94941c == null) {
                        f94941c = new f4v();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f94941c;
    }

    /* JADX INFO: renamed from: e */
    public void m119460e(String str, ValueObject valueObject, ValueObject valueObject2, Boolean bool) {
        if (this.f94942a.containsKey(str)) {
            return;
        }
        this.f94942a.put(str, xaj0.m207578a(valueObject, valueObject2, bool));
    }

    /* JADX INFO: renamed from: g */
    public xaj0<ValueObject, ValueObject, Boolean> m119461g(String str) {
        return this.f94942a.get(str);
    }

    /* JADX INFO: renamed from: h */
    public boolean m119462h(ValueObject valueObject) {
        if (!NullChecker.m81303a(valueObject) || CoreModule.m29936Q().mo67287ub(valueObject) || !NullChecker.m81303a(CoreModule.f17545c.f19639e0.f149253R)) {
            return false;
        }
        SettingGroups settingGroups = CoreModule.f17545c.f19639e0.f149253R.get();
        if (NullChecker.m81303a(settingGroups) && NullChecker.m81303a(settingGroups.live) && NullChecker.m81303a(settingGroups.live.hideStoppedRoom)) {
            return settingGroups.live.hideStoppedRoom.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public boolean m119463i(String str) {
        if (this.f94942a.containsKey(str)) {
            xaj0<ValueObject, ValueObject, Boolean> xaj0Var = this.f94942a.get(str);
            if (TextUtils.equals(str, CoreModule.m29931H().userId()) && NullChecker.m81303a(xaj0Var) && m119462h(xaj0Var.f191751a)) {
                return false;
            }
            if (xaj0Var == null || !xaj0Var.f191753c.booleanValue() || xaj0Var.f191751a != null) {
                return true;
            }
            if (xaj0Var.f191752b != null) {
                return CoreModule.m29936Q().mo67246Vm(xaj0Var.f191752b);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m119464j(String str, j760 j760Var) {
        xaj0<ValueObject, ValueObject, Boolean> xaj0VarM207578a = xaj0.m207578a((ValueObject) j760Var.f116564a, (ValueObject) j760Var.f116565b, Boolean.TRUE);
        this.f94942a.put(str, xaj0VarM207578a);
        this.f94943b.m132487l(Pair.create(str, xaj0VarM207578a));
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m119465k(String str, Throwable th) {
        this.f94942a.remove(str);
    }

    /* JADX INFO: renamed from: l */
    public C22306c<xaj0<ValueObject, ValueObject, Boolean>> m119466l(final String str) {
        return this.f94943b.filter(new w9j() { // from class: l.d4v
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals((CharSequence) ((Pair) obj).first, str));
            }
        }).map(new w9j() { // from class: l.e4v
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return f4v.m119455a((Pair) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public void m119467m(String str) {
        if (this.f94942a.containsKey(str)) {
            return;
        }
        this.f94942a.put(str, xaj0.m207578a(null, null, Boolean.FALSE));
        m119469o(str);
    }

    /* JADX INFO: renamed from: n */
    public void m119468n(String str) {
        this.f94942a.remove(str);
    }

    /* JADX INFO: renamed from: o */
    public final void m119469o(final String str) {
        CoreModule.m29936Q().mo67241S8(str).subscribe(mkd0.m154956H(new e30() { // from class: l.b4v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f73405a.m119464j(str, (j760) obj);
            }
        }, new e30() { // from class: l.c4v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f79298a.m119465k(str, (Throwable) obj);
            }
        }));
    }
}
