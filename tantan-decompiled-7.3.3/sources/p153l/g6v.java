package p153l;

import android.text.TextUtils;
import android.util.Pair;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes11.dex */
public class g6v {

    /* JADX INFO: renamed from: c */
    public static g6v f102482c;

    /* JADX INFO: renamed from: a */
    public HashMap<String, bkj0<ValueObject, ValueObject, Boolean>> f102483a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public C22508b<Pair<String, bkj0<ValueObject, ValueObject, Boolean>>> f102484b = C22508b.m222767b();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ bkj0 m129269a(Pair pair) {
        return (bkj0) pair.second;
    }

    /* JADX INFO: renamed from: f */
    public static g6v m129273f() {
        if (f102482c == null) {
            synchronized (g6v.class) {
                try {
                    if (f102482c == null) {
                        f102482c = new g6v();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f102482c;
    }

    /* JADX INFO: renamed from: e */
    public void m129274e(String str, ValueObject valueObject, ValueObject valueObject2, Boolean bool) {
        if (this.f102483a.containsKey(str)) {
            return;
        }
        this.f102483a.put(str, bkj0.m104818a(valueObject, valueObject2, bool));
    }

    /* JADX INFO: renamed from: g */
    public bkj0<ValueObject, ValueObject, Boolean> m129275g(String str) {
        return this.f102483a.get(str);
    }

    /* JADX INFO: renamed from: h */
    public boolean m129276h(ValueObject valueObject) {
        if (!NullChecker.m82486a(valueObject) || CoreModule.m30934Q().mo68470ub(valueObject) || !NullChecker.m82486a(CoreModule.f18264c.f20381e0.f89110R)) {
            return false;
        }
        SettingGroups settingGroups = CoreModule.f18264c.f20381e0.f89110R.get();
        if (NullChecker.m82486a(settingGroups) && NullChecker.m82486a(settingGroups.live) && NullChecker.m82486a(settingGroups.live.hideStoppedRoom)) {
            return settingGroups.live.hideStoppedRoom.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public boolean m129277i(String str) {
        if (this.f102483a.containsKey(str)) {
            bkj0<ValueObject, ValueObject, Boolean> bkj0Var = this.f102483a.get(str);
            if (TextUtils.equals(str, CoreModule.m30929H().userId()) && NullChecker.m82486a(bkj0Var) && m129276h(bkj0Var.f77081a)) {
                return false;
            }
            if (bkj0Var == null || !bkj0Var.f77083c.booleanValue() || bkj0Var.f77081a != null) {
                return true;
            }
            if (bkj0Var.f77082b != null) {
                return CoreModule.m30934Q().mo68429Vm(bkj0Var.f77082b);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m129278j(String str, pf60 pf60Var) {
        bkj0<ValueObject, ValueObject, Boolean> bkj0VarM104818a = bkj0.m104818a((ValueObject) pf60Var.f152156a, (ValueObject) pf60Var.f152157b, Boolean.TRUE);
        this.f102483a.put(str, bkj0VarM104818a);
        this.f102484b.m137019l(Pair.create(str, bkj0VarM104818a));
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m129279k(String str, Throwable th) {
        this.f102483a.remove(str);
    }

    /* JADX INFO: renamed from: l */
    public C22421c<bkj0<ValueObject, ValueObject, Boolean>> m129280l(final String str) {
        return this.f102484b.filter(new qcj() { // from class: l.e6v
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals((CharSequence) ((Pair) obj).first, str));
            }
        }).map(new qcj() { // from class: l.f6v
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return g6v.m129269a((Pair) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public void m129281m(String str) {
        if (this.f102483a.containsKey(str)) {
            return;
        }
        this.f102483a.put(str, bkj0.m104818a(null, null, Boolean.FALSE));
        m129283o(str);
    }

    /* JADX INFO: renamed from: n */
    public void m129282n(String str) {
        this.f102483a.remove(str);
    }

    /* JADX INFO: renamed from: o */
    public final void m129283o(final String str) {
        CoreModule.m30934Q().mo68424S8(str).subscribe(psd0.m173597H(new y20() { // from class: l.c6v
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79999a.m129278j(str, (pf60) obj);
            }
        }, new y20() { // from class: l.d6v
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85411a.m129279k(str, (Throwable) obj);
            }
        }));
    }
}
