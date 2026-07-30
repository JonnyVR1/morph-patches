package p153l;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: renamed from: l.u4 */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC20482u4<T> {

    /* JADX INFO: renamed from: a */
    public Context f177417a;

    /* JADX INFO: renamed from: b */
    public T f177418b;

    /* JADX INFO: renamed from: c */
    public z20<Picture.ImageUri, Integer> f177419c;

    /* JADX INFO: renamed from: d */
    public y20<CharSequence> f177420d;

    /* JADX INFO: renamed from: e */
    public y20<CharSequence> f177421e;

    /* JADX INFO: renamed from: f */
    public x20 f177422f;

    public AbstractC20482u4(Context context) {
        this.f177417a = context;
    }

    /* JADX INFO: renamed from: e */
    public void m194452e(@NonNull z20<Picture.ImageUri, Integer> z20Var) {
        this.f177419c = z20Var;
    }

    /* JADX INFO: renamed from: f */
    public void m194453f(@NonNull y20<CharSequence> y20Var) {
        this.f177420d = y20Var;
    }

    /* JADX INFO: renamed from: g */
    public void m194454g(@NonNull y20<CharSequence> y20Var) {
        this.f177421e = y20Var;
    }

    /* JADX INFO: renamed from: h */
    public void m194455h(@NonNull x20 x20Var) {
        this.f177422f = x20Var;
    }

    /* JADX INFO: renamed from: i */
    public abstract Picture.ImageUri mo119959i();

    /* JADX INFO: renamed from: j */
    public Context m194456j() {
        return this.f177417a;
    }

    /* JADX INFO: renamed from: k */
    public T m194457k() {
        return this.f177418b;
    }

    /* JADX INFO: renamed from: l */
    public abstract Integer mo119960l();

    /* JADX INFO: renamed from: m */
    public abstract CharSequence mo119961m();

    /* JADX INFO: renamed from: n */
    public abstract CharSequence mo119962n();

    /* JADX INFO: renamed from: o */
    public boolean m194458o() {
        return !rbb0.m180744q();
    }

    /* JADX INFO: renamed from: p */
    public CharSequence mo189516p() {
        return null;
    }

    /* JADX INFO: renamed from: q */
    public void m194459q() {
        if (NullChecker.m82486a(this.f177418b)) {
            if (NullChecker.m82486a(this.f177422f)) {
                this.f177422f.call();
            }
            m194460r();
            if (NullChecker.m82486a(this.f177421e)) {
                this.f177421e.call(mo119962n());
            }
            if (NullChecker.m82486a(this.f177419c)) {
                this.f177419c.call(mo119959i(), mo119960l());
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public void m194460r() {
        if (NullChecker.m82486a(this.f177420d)) {
            CharSequence charSequenceMo189516p = mo189516p();
            boolean zIsEmpty = TextUtils.isEmpty(charSequenceMo189516p);
            y20<CharSequence> y20Var = this.f177420d;
            if (zIsEmpty) {
                y20Var.call(mo119961m());
            } else {
                y20Var.call(charSequenceMo189516p);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void m194461s(T t) {
        this.f177418b = t;
    }

    /* JADX INFO: renamed from: t */
    public boolean m194462t() {
        return true;
    }
}
