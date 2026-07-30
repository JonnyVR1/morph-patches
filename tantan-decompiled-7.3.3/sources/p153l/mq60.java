package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.pay.R$string;

/* JADX INFO: loaded from: classes12.dex */
public class mq60 implements e2m {

    /* JADX INFO: renamed from: a */
    public boolean f138008a = false;

    /* JADX INFO: renamed from: b */
    public boolean f138009b = false;

    /* JADX INFO: renamed from: c */
    public boolean f138010c = false;

    /* JADX INFO: renamed from: d */
    public boolean f138011d = false;

    /* JADX INFO: renamed from: e */
    public CharSequence f138012e;

    /* JADX INFO: renamed from: f */
    public CharSequence f138013f;

    /* JADX INFO: renamed from: g */
    public CharSequence f138014g;

    /* JADX INFO: renamed from: h */
    public CharSequence f138015h;

    /* JADX INFO: renamed from: i */
    public static mq60 m159464i(Act act, PurchaseType purchaseType) {
        mq60 mq60Var = new mq60();
        mq60Var.m159473j(act, mq60Var, purchaseType);
        return mq60Var;
    }

    /* JADX INFO: renamed from: a */
    public CharSequence m159465a() {
        return this.f138013f;
    }

    /* JADX INFO: renamed from: b */
    public CharSequence m159466b() {
        return this.f138014g;
    }

    /* JADX INFO: renamed from: c */
    public CharSequence m159467c() {
        return this.f138015h;
    }

    /* JADX INFO: renamed from: d */
    public CharSequence m159468d() {
        return this.f138012e;
    }

    /* JADX INFO: renamed from: e */
    public boolean m159469e() {
        return this.f138008a;
    }

    /* JADX INFO: renamed from: f */
    public boolean m159470f() {
        return this.f138009b;
    }

    /* JADX INFO: renamed from: g */
    public boolean m159471g() {
        return this.f138010c;
    }

    /* JADX INFO: renamed from: h */
    public boolean m159472h() {
        return this.f138011d;
    }

    /* JADX INFO: renamed from: j */
    public final void m159473j(Act act, mq60 mq60Var, PurchaseType purchaseType) {
        if (mq60Var.f138012e == null) {
            mq60Var.f138012e = act.getString(R$string.f28201X9);
        }
        if (mq60Var.f138013f == null) {
            mq60Var.f138013f = act.getString(R$string.f28135R9);
        }
        if (mq60Var.f138014g == null) {
            mq60Var.f138014g = z090.m218107b(purchaseType);
        }
        if (mq60Var.f138015h == null) {
            mq60Var.f138015h = "";
        }
    }

    /* JADX INFO: renamed from: k */
    public void m159474k(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f138013f)) {
            this.f138009b = true;
        }
        this.f138013f = charSequence;
    }

    /* JADX INFO: renamed from: l */
    public void m159475l(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f138014g)) {
            this.f138008a = true;
        }
        this.f138014g = charSequence;
    }

    /* JADX INFO: renamed from: m */
    public void m159476m(CharSequence charSequence, boolean z) {
        if (!TextUtils.equals(charSequence, this.f138015h) || !z) {
            this.f138010c = true;
        }
        this.f138015h = charSequence;
    }
}
