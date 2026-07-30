package p009l;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e30;
import l.f30;
import l.n3b0;

/* JADX INFO: renamed from: l.w4 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class AbstractC1278w4<T> {

    /* JADX INFO: renamed from: a */
    public Context f21883a;

    /* JADX INFO: renamed from: b */
    public T f21884b;

    /* JADX INFO: renamed from: c */
    public f30<Picture.ImageUri, Integer> f21885c;

    /* JADX INFO: renamed from: d */
    public e30<CharSequence> f21886d;

    /* JADX INFO: renamed from: e */
    public e30<CharSequence> f21887e;

    /* JADX INFO: renamed from: f */
    public d30 f21888f;

    public AbstractC1278w4(Context context) {
        this.f21883a = context;
    }

    /* JADX INFO: renamed from: e */
    public void m23860e(@NonNull f30<Picture.ImageUri, Integer> f30Var) {
        this.f21885c = f30Var;
    }

    /* JADX INFO: renamed from: f */
    public void m23861f(@NonNull e30<CharSequence> e30Var) {
        this.f21886d = e30Var;
    }

    /* JADX INFO: renamed from: g */
    public void m23862g(@NonNull e30<CharSequence> e30Var) {
        this.f21887e = e30Var;
    }

    /* JADX INFO: renamed from: h */
    public void m23863h(@NonNull d30 d30Var) {
        this.f21888f = d30Var;
    }

    /* JADX INFO: renamed from: i */
    public abstract Picture.ImageUri mo15380i();

    /* JADX INFO: renamed from: j */
    public Context m23864j() {
        return this.f21883a;
    }

    /* JADX INFO: renamed from: k */
    public T m23865k() {
        return this.f21884b;
    }

    /* JADX INFO: renamed from: l */
    public abstract Integer mo15381l();

    /* JADX INFO: renamed from: m */
    public abstract CharSequence mo15382m();

    /* JADX INFO: renamed from: n */
    public abstract CharSequence mo15383n();

    /* JADX INFO: renamed from: o */
    public boolean m23866o() {
        return !n3b0.q();
    }

    /* JADX INFO: renamed from: p */
    public CharSequence mo20768p() {
        return null;
    }

    /* JADX INFO: renamed from: q */
    public void m23867q() {
        if (NullChecker.a(this.f21884b)) {
            if (NullChecker.a(this.f21888f)) {
                this.f21888f.call();
            }
            m23868r();
            if (NullChecker.a(this.f21887e)) {
                this.f21887e.call(mo15383n());
            }
            if (NullChecker.a(this.f21885c)) {
                this.f21885c.call(mo15380i(), mo15381l());
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public void m23868r() {
        if (NullChecker.a(this.f21886d)) {
            CharSequence charSequenceMo20768p = mo20768p();
            boolean zIsEmpty = TextUtils.isEmpty(charSequenceMo20768p);
            e30<CharSequence> e30Var = this.f21886d;
            if (zIsEmpty) {
                e30Var.call(mo15382m());
            } else {
                e30Var.call(charSequenceMo20768p);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void m23869s(T t) {
        this.f21884b = t;
    }

    /* JADX INFO: renamed from: t */
    public boolean m23870t() {
        return true;
    }
}
