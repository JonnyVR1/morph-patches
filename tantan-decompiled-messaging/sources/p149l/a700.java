package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.api.AssetsSettingsBaseApi;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a700<T> {

    /* JADX INFO: renamed from: b */
    public static boolean f67830b = false;

    /* JADX INFO: renamed from: a */
    public j760<String, T> f67831a;

    public a700() {
        AssetsSettingsBaseApi.f17097i.take(1).flatMap(new w9j() { // from class: l.w600
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((AssetsSettingsBaseApi) obj).m121231l(false);
            }
        }).observeOn(Schedulers.m221493io()).doOnNext(new e30() { // from class: l.x600
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191208a.m95180j((String) obj);
            }
        }).subscribe(mkd0.m154954F());
    }

    /* JADX INFO: renamed from: d */
    public C22306c<T> m95174d() {
        return m95175e(true);
    }

    /* JADX INFO: renamed from: e */
    public C22306c<T> m95175e(boolean z) {
        return qib0.f154710Y.m121231l(z).observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.y600
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f196503a.m95180j((String) obj);
            }
        }).observeOn(jo0.m142408a()).filter(new z600());
    }

    /* JADX INFO: renamed from: f */
    public <R> R m95176f(w9j<T, R> w9jVar, R r) {
        T tM95177g = m95177g();
        return tM95177g != null ? w9jVar.call(tM95177g) : r;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public T m95177g() {
        return m95180j(qib0.f154710Y.m121233n());
    }

    /* JADX INFO: renamed from: i */
    public abstract JsonAdapter<T> mo95179i();

    /* JADX INFO: renamed from: j */
    public final T m95180j(String str) {
        String str2;
        T t = null;
        if (str == null) {
            return null;
        }
        j760<String, T> j760Var = this.f67831a;
        if (j760Var != null && (str2 = j760Var.f116564a) != null && str2.equals(str)) {
            return this.f67831a.f116565b;
        }
        int i = 0;
        try {
            t = mo95179i().parse(str);
            du2.m113670a("[putong-common][assets]", "Success");
            f67830b = false;
        } catch (IOException e) {
            qib0.f154710Y.m121234o();
            du2.m113670a("[putong-common][assets]", "Failed");
            if (!f67830b) {
                CrashHelper.m81296c(e);
                while (i < str.length()) {
                    int i2 = i + 10240;
                    du2.m113670a("[putong-common][assets]", str.substring(i, Math.min(i2, str.length())));
                    i = i2;
                }
                f67830b = true;
            }
        }
        if (t != null) {
            mo95178h(t);
            this.f67831a = new j760<>(str, t);
        }
        return t;
    }

    /* JADX INFO: renamed from: k */
    public C22306c<roj0> m95181k() {
        return qib0.f154710Y.m121236q();
    }

    /* JADX INFO: renamed from: h */
    public void mo95178h(@NonNull T t) {
    }
}
