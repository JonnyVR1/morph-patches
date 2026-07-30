package p006l;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.p002ui.accountnew.SignUpProfileImageAct;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.putong.data.SignUpData;
import l.eqh0;
import l.i0g0;
import l.j760;
import l.rhi;
import l.s7m;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VScroll;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ief0 implements s7m<def0> {

    /* JADX INFO: renamed from: a */
    public VScroll f14393a;

    /* JADX INFO: renamed from: b */
    public VText f14394b;

    /* JADX INFO: renamed from: c */
    public VLinear f14395c;

    /* JADX INFO: renamed from: d */
    public VText f14396d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f14397e;

    /* JADX INFO: renamed from: f */
    public VImage f14398f;

    /* JADX INFO: renamed from: g */
    public VImage f14399g;

    /* JADX INFO: renamed from: h */
    public VImage f14400h;

    /* JADX INFO: renamed from: i */
    public VLinear f14401i;

    /* JADX INFO: renamed from: j */
    public VText f14402j;

    /* JADX INFO: renamed from: k */
    public VText f14403k;

    /* JADX INFO: renamed from: l */
    public ConstraintLayout f14404l;

    /* JADX INFO: renamed from: m */
    public VImage f14405m;

    /* JADX INFO: renamed from: n */
    public VImage f14406n;

    /* JADX INFO: renamed from: o */
    public VText f14407o;

    /* JADX INFO: renamed from: p */
    public VText f14408p;

    /* JADX INFO: renamed from: q */
    public final SignUpProfileImageAct f14409q;

    /* JADX INFO: renamed from: r */
    public def0 f14410r;

    /* JADX INFO: renamed from: l.ief0$a */
    public static /* synthetic */ class C0835a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f14411a;

        static {
            int[] iArr = new int[IntlCountryCodeController.ModelRegion.values().length];
            f14411a = iArr;
            try {
                iArr[IntlCountryCodeController.ModelRegion.SEA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14411a[IntlCountryCodeController.ModelRegion.SA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14411a[IntlCountryCodeController.ModelRegion.OTHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ief0(@NonNull SignUpProfileImageAct signUpProfileImageAct) {
        this.f14409q = signUpProfileImageAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m16634m(View view) {
        this.f14410r.m14000J0();
    }

    /* JADX INFO: renamed from: C0 */
    public Context m16635C0() {
        return this.f14409q;
    }

    /* JADX INFO: renamed from: e */
    public View m16636e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jef0.m17435b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public PutongAct act() {
        return this.f14409q;
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void m16639i1(def0 def0Var) {
        this.f14410r = def0Var;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m16636e(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m16640j(final SignUpData signUpData) {
        xdl0.M(this.f14405m, false);
        xdl0.M(this.f14407o, false);
        xdl0.E0(this.f14395c, new View.OnClickListener() { // from class: l.fef0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12676a.m16642l(signUpData, view);
            }
        });
        xdl0.E0(this.f14402j, new View.OnClickListener() { // from class: l.gef0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13283a.m16634m(view);
            }
        });
        xdl0.E0(this.f14403k, new View.OnClickListener() { // from class: l.hef0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13851a.m16643n(signUpData, view);
            }
        });
        m16645q(signUpData);
    }

    /* JADX INFO: renamed from: k */
    public void m16641k(final SignUpData signUpData) {
        xdl0.E0(this.f14395c, new View.OnClickListener() { // from class: l.eef0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11104a.m16644p(signUpData, view);
            }
        });
        m16645q(signUpData);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m16642l(SignUpData signUpData, View view) {
        zvf0.u("e_imagepage_signup_photo", this.f14409q.pageId(), new j760[]{vwb.Y("photo_type", TextUtils.isEmpty(signUpData.profilePath) ? "empty" : "uploaded")});
        zvf0.u("e_imagepage_signup_upload_button", this.f14409q.pageId(), new j760[]{vwb.Y("phone_num", this.f14410r.m13998H0())});
        act().pickImagesWithPicker(1, false, false, true, "from_sign_up");
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m16643n(SignUpData signUpData, View view) {
        zvf0.u("e_imagepage_signup_photo", this.f14409q.pageId(), new j760[]{vwb.Y("photo_type", TextUtils.isEmpty(signUpData.profilePath) ? "empty" : "uploaded")});
        zvf0.u("e_imagepage_signup_upload_button", this.f14409q.pageId(), new j760[]{vwb.Y("phone_num", this.f14410r.m13998H0())});
        act().pickImagesWithPicker(1, false, false, true, "from_sign_up");
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m16644p(SignUpData signUpData, View view) {
        zvf0.u("e_imagepage_signup_photo", this.f14409q.pageId(), new j760[]{vwb.Y("photo_type", TextUtils.isEmpty(signUpData.profilePath) ? "empty" : "uploaded")});
        zvf0.u("e_imagepage_signup_upload_button", this.f14409q.pageId(), new j760[]{vwb.Y("phone_num", this.f14410r.m13998H0())});
        act().pickImagesWithPicker(1, false, false, true, "from_sign_up");
    }

    /* JADX INFO: renamed from: q */
    public void m16645q(SignUpData signUpData) {
        boolean zIsEmpty = TextUtils.isEmpty(signUpData.profilePath);
        VLinear vLinear = this.f14395c;
        if (zIsEmpty) {
            xdl0.M(vLinear, true);
            xdl0.M(this.f14397e, false);
            xdl0.M(this.f14401i, false);
        } else {
            xdl0.M(vLinear, false);
            xdl0.M(this.f14397e, true);
            xdl0.M(this.f14401i, true);
            qib0.f19782G.m12780m0(this.f14397e, rhi.B(signUpData.profilePath));
        }
        this.f14396d.setText(i0g0.b0(act().string(R$string.f40B3), vwb.f0(new String[]{act().string(R$string.f45C3)}), Color.parseColor("#FE7E1D"), eqh0.c(2)));
        ilo iloVar = ilo.INSTANCE;
        if (iloVar.m16737h("female", signUpData)) {
            int i = C0835a.f14411a[IntlCountryCodeController.m2c().ordinal()];
            if (i == 1) {
                this.f14398f.setImageResource(v2c0.f24025d);
                return;
            }
            if (i == 2) {
                this.f14398f.setImageResource(v2c0.f24022c);
                return;
            }
            VImage vImage = this.f14398f;
            if (i != 3) {
                vImage.setImageResource(v2c0.f24016a);
                return;
            } else {
                vImage.setImageResource(v2c0.f24019b);
                return;
            }
        }
        if (iloVar.m16737h("male", signUpData)) {
            int i2 = C0835a.f14411a[IntlCountryCodeController.m2c().ordinal()];
            if (i2 == 1) {
                this.f14398f.setImageResource(v2c0.f24037h);
                return;
            }
            if (i2 == 2) {
                this.f14398f.setImageResource(v2c0.f24034g);
                return;
            }
            VImage vImage2 = this.f14398f;
            if (i2 != 3) {
                vImage2.setImageResource(v2c0.f24028e);
                return;
            } else {
                vImage2.setImageResource(v2c0.f24031f);
                return;
            }
        }
        if (iloVar.m16737h("nonbinary", signUpData)) {
            this.f14399g.setImageResource(v2c0.f24040i);
            int i3 = C0835a.f14411a[IntlCountryCodeController.m2c().ordinal()];
            if (i3 == 1) {
                this.f14398f.setImageResource(v2c0.f24052m);
                return;
            }
            if (i3 == 2) {
                this.f14398f.setImageResource(v2c0.f24049l);
                return;
            }
            VImage vImage3 = this.f14398f;
            if (i3 != 3) {
                vImage3.setImageResource(v2c0.f24043j);
            } else {
                vImage3.setImageResource(v2c0.f24046k);
            }
        }
    }

    public void destroy() {
    }
}
