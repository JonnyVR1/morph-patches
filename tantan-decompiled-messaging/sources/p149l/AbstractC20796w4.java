package p149l;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: renamed from: l.w4 */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC20796w4<T> {

    /* JADX INFO: renamed from: a */
    public Context f184458a;

    /* JADX INFO: renamed from: b */
    public T f184459b;

    /* JADX INFO: renamed from: c */
    public f30<Picture.ImageUri, Integer> f184460c;

    /* JADX INFO: renamed from: d */
    public e30<CharSequence> f184461d;

    /* JADX INFO: renamed from: e */
    public e30<CharSequence> f184462e;

    /* JADX INFO: renamed from: f */
    public d30 f184463f;

    public AbstractC20796w4(Context context) {
        this.f184458a = context;
    }

    /* JADX INFO: renamed from: e */
    public void m201435e(@NonNull f30<Picture.ImageUri, Integer> f30Var) {
        this.f184460c = f30Var;
    }

    /* JADX INFO: renamed from: f */
    public void m201436f(@NonNull e30<CharSequence> e30Var) {
        this.f184461d = e30Var;
    }

    /* JADX INFO: renamed from: g */
    public void m201437g(@NonNull e30<CharSequence> e30Var) {
        this.f184462e = e30Var;
    }

    /* JADX INFO: renamed from: h */
    public void m201438h(@NonNull d30 d30Var) {
        this.f184463f = d30Var;
    }

    /* JADX INFO: renamed from: i */
    public abstract Picture.ImageUri mo128981i();

    /* JADX INFO: renamed from: j */
    public Context m201439j() {
        return this.f184458a;
    }

    /* JADX INFO: renamed from: k */
    public T m201440k() {
        return this.f184459b;
    }

    /* JADX INFO: renamed from: l */
    public abstract Integer mo128982l();

    /* JADX INFO: renamed from: m */
    public abstract CharSequence mo128983m();

    /* JADX INFO: renamed from: n */
    public abstract CharSequence mo128984n();

    /* JADX INFO: renamed from: o */
    public boolean m201441o() {
        return !n3b0.m157742q();
    }

    /* JADX INFO: renamed from: p */
    public CharSequence mo172098p() {
        return null;
    }

    /* JADX INFO: renamed from: q */
    public void m201442q() {
        if (NullChecker.m81303a(this.f184459b)) {
            if (NullChecker.m81303a(this.f184463f)) {
                this.f184463f.call();
            }
            m201443r();
            if (NullChecker.m81303a(this.f184462e)) {
                this.f184462e.call(mo128984n());
            }
            if (NullChecker.m81303a(this.f184460c)) {
                this.f184460c.call(mo128981i(), mo128982l());
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public void m201443r() {
        if (NullChecker.m81303a(this.f184461d)) {
            CharSequence charSequenceMo172098p = mo172098p();
            boolean zIsEmpty = TextUtils.isEmpty(charSequenceMo172098p);
            e30<CharSequence> e30Var = this.f184461d;
            if (zIsEmpty) {
                e30Var.call(mo128983m());
            } else {
                e30Var.call(charSequenceMo172098p);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void m201444s(T t) {
        this.f184459b = t;
    }

    /* JADX INFO: renamed from: t */
    public boolean m201445t() {
        return true;
    }
}
