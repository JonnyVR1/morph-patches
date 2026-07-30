package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.api.AssetsSettingsBaseApi;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes9.dex */
public abstract class jf00<T> {

    /* JADX INFO: renamed from: b */
    public static boolean f120545b = false;

    /* JADX INFO: renamed from: a */
    public pf60<String, T> f120546a;

    public jf00() {
        AssetsSettingsBaseApi.f17816i.take(1).flatMap(new qcj() { // from class: l.ff00
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((AssetsSettingsBaseApi) obj).m159275l(false);
            }
        }).observeOn(Schedulers.m222739io()).doOnNext(new y20() { // from class: l.gf00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f103871a.m144647j((String) obj);
            }
        }).subscribe(psd0.m173595F());
    }

    /* JADX INFO: renamed from: d */
    public C22421c<T> m144642d() {
        return m144643e(true);
    }

    /* JADX INFO: renamed from: e */
    public C22421c<T> m144643e(boolean z) {
        return uqb0.f180393Y.m159275l(z).observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.hf00
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f109214a.m144647j((String) obj);
            }
        }).observeOn(fo0.m126432a()).filter(new if00());
    }

    /* JADX INFO: renamed from: f */
    public <R> R m144644f(qcj<T, R> qcjVar, R r) {
        T tM144645g = m144645g();
        return tM144645g != null ? qcjVar.call(tM144645g) : r;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public T m144645g() {
        return m144647j(uqb0.f180393Y.m159277n());
    }

    /* JADX INFO: renamed from: i */
    public abstract JsonAdapter<T> mo135323i();

    /* JADX INFO: renamed from: j */
    public final T m144647j(String str) {
        String str2;
        T t = null;
        if (str == null) {
            return null;
        }
        pf60<String, T> pf60Var = this.f120546a;
        if (pf60Var != null && (str2 = pf60Var.f152156a) != null && str2.equals(str)) {
            return this.f120546a.f152157b;
        }
        int i = 0;
        try {
            t = mo135323i().parse(str);
            tu2.m192703a("[putong-common][assets]", "Success");
            f120545b = false;
        } catch (IOException e) {
            uqb0.f180393Y.m159278o();
            tu2.m192703a("[putong-common][assets]", "Failed");
            if (!f120545b) {
                CrashHelper.m82479c(e);
                while (i < str.length()) {
                    int i2 = i + 10240;
                    tu2.m192703a("[putong-common][assets]", str.substring(i, Math.min(i2, str.length())));
                    i = i2;
                }
                f120545b = true;
            }
        }
        if (t != null) {
            mo144646h(t);
            this.f120546a = new pf60<>(str, t);
        }
        return t;
    }

    /* JADX INFO: renamed from: k */
    public C22421c<uxj0> m144648k() {
        return uqb0.f180393Y.m159280q();
    }

    /* JADX INFO: renamed from: h */
    public void mo144646h(@NonNull T t) {
    }
}
