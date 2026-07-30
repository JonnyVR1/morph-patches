package p006l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.api.AssetsSettingsBaseApi;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import l.du2;
import l.e30;
import l.j760;
import l.jo0;
import l.mkd0;
import l.roj0;
import l.w9j;
import rx.c;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public abstract class a700<T> {

    /* JADX INFO: renamed from: b */
    public static boolean f8128b = false;

    /* JADX INFO: renamed from: a */
    public j760<String, T> f8129a;

    public a700() {
        AssetsSettingsBaseApi.f1086i.take(1).flatMap(new w9j() { // from class: l.w600
            public final Object call(Object obj) {
                return ((AssetsSettingsBaseApi) obj).l(false);
            }
        }).observeOn(Schedulers.io()).doOnNext(new e30() { // from class: l.x600
            public final void call(Object obj) {
                this.f27366a.m11770j((String) obj);
            }
        }).subscribe(mkd0.F());
    }

    /* JADX INFO: renamed from: d */
    public c<T> m11764d() {
        return m11765e(true);
    }

    /* JADX INFO: renamed from: e */
    public c<T> m11765e(boolean z) {
        return qib0.f19801Y.l(z).observeOn(Schedulers.io()).map(new w9j() { // from class: l.y600
            public final Object call(Object obj) {
                return this.f28041a.m11770j((String) obj);
            }
        }).observeOn(jo0.a()).filter(new z600());
    }

    /* JADX INFO: renamed from: f */
    public <R> R m11766f(w9j<T, R> w9jVar, R r) {
        T tM11767g = m11767g();
        return tM11767g != null ? (R) w9jVar.call(tM11767g) : r;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public T m11767g() {
        return m11770j((String) qib0.f19801Y.n());
    }

    /* JADX INFO: renamed from: i */
    public abstract JsonAdapter<T> mo11769i();

    /* JADX INFO: renamed from: j */
    public final T m11770j(String str) {
        Object obj;
        T t = null;
        if (str == null) {
            return null;
        }
        j760<String, T> j760Var = this.f8129a;
        if (j760Var != null && (obj = j760Var.a) != null && ((String) obj).equals(str)) {
            return (T) this.f8129a.b;
        }
        int i = 0;
        try {
            t = (T) mo11769i().parse(str);
            du2.a("[putong-common][assets]", "Success");
            f8128b = false;
        } catch (IOException e) {
            qib0.f19801Y.o();
            du2.a("[putong-common][assets]", "Failed");
            if (!f8128b) {
                CrashHelper.c(e);
                while (i < str.length()) {
                    int i2 = i + 10240;
                    du2.a("[putong-common][assets]", str.substring(i, Math.min(i2, str.length())));
                    i = i2;
                }
                f8128b = true;
            }
        }
        if (t != null) {
            mo11768h(t);
            this.f8129a = new j760<>(str, t);
        }
        return t;
    }

    /* JADX INFO: renamed from: k */
    public c<roj0> m11771k() {
        return qib0.f19801Y.z();
    }

    /* JADX INFO: renamed from: h */
    public void mo11768h(@NonNull T t) {
    }
}
