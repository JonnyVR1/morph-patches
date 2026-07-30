package p149l;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.p050ui.accountnew.SignUpProfileImageAct;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.SignUpData;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VScroll;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class ief0 implements s7m<def0> {

    /* JADX INFO: renamed from: a */
    public VScroll f112757a;

    /* JADX INFO: renamed from: b */
    public VText f112758b;

    /* JADX INFO: renamed from: c */
    public VLinear f112759c;

    /* JADX INFO: renamed from: d */
    public VText f112760d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f112761e;

    /* JADX INFO: renamed from: f */
    public VImage f112762f;

    /* JADX INFO: renamed from: g */
    public VImage f112763g;

    /* JADX INFO: renamed from: h */
    public VImage f112764h;

    /* JADX INFO: renamed from: i */
    public VLinear f112765i;

    /* JADX INFO: renamed from: j */
    public VText f112766j;

    /* JADX INFO: renamed from: k */
    public VText f112767k;

    /* JADX INFO: renamed from: l */
    public ConstraintLayout f112768l;

    /* JADX INFO: renamed from: m */
    public VImage f112769m;

    /* JADX INFO: renamed from: n */
    public VImage f112770n;

    /* JADX INFO: renamed from: o */
    public VText f112771o;

    /* JADX INFO: renamed from: p */
    public VText f112772p;

    /* JADX INFO: renamed from: q */
    public final SignUpProfileImageAct f112773q;

    /* JADX INFO: renamed from: r */
    public def0 f112774r;

    /* JADX INFO: renamed from: l.ief0$a */
    public static /* synthetic */ class C17532a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f112775a;

        static {
            int[] iArr = new int[IntlCountryCodeController.ModelRegion.values().length];
            f112775a = iArr;
            try {
                iArr[IntlCountryCodeController.ModelRegion.SEA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f112775a[IntlCountryCodeController.ModelRegion.SA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f112775a[IntlCountryCodeController.ModelRegion.OTHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ief0(@NonNull SignUpProfileImageAct signUpProfileImageAct) {
        this.f112773q = signUpProfileImageAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m135678m(View view) {
        this.f112774r.m111224J0();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f112773q;
    }

    /* JADX INFO: renamed from: e */
    public View m135679e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jef0.m141126b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public PutongAct act() {
        return this.f112773q;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(def0 def0Var) {
        this.f112774r = def0Var;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m135679e(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m135682j(final SignUpData signUpData) {
        xdl0.m208344M(this.f112769m, false);
        xdl0.m208344M(this.f112771o, false);
        xdl0.m208329E0(this.f112759c, new View.OnClickListener() { // from class: l.fef0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97122a.m135684l(signUpData, view);
            }
        });
        xdl0.m208329E0(this.f112766j, new View.OnClickListener() { // from class: l.gef0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f102242a.m135678m(view);
            }
        });
        xdl0.m208329E0(this.f112767k, new View.OnClickListener() { // from class: l.hef0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107368a.m135685n(signUpData, view);
            }
        });
        m135687q(signUpData);
    }

    /* JADX INFO: renamed from: k */
    public void m135683k(final SignUpData signUpData) {
        xdl0.m208329E0(this.f112759c, new View.OnClickListener() { // from class: l.eef0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90737a.m135686p(signUpData, view);
            }
        });
        m135687q(signUpData);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m135684l(SignUpData signUpData, View view) {
        zvf0.m220399u("e_imagepage_signup_photo", this.f112773q.pageId(), vwb.m200311Y("photo_type", TextUtils.isEmpty(signUpData.profilePath) ? "empty" : "uploaded"));
        zvf0.m220399u("e_imagepage_signup_upload_button", this.f112773q.pageId(), vwb.m200311Y(Oauth2AccessToken.KEY_PHONE_NUM, this.f112774r.m111222H0()));
        act().pickImagesWithPicker(1, false, false, true, "from_sign_up");
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m135685n(SignUpData signUpData, View view) {
        zvf0.m220399u("e_imagepage_signup_photo", this.f112773q.pageId(), vwb.m200311Y("photo_type", TextUtils.isEmpty(signUpData.profilePath) ? "empty" : "uploaded"));
        zvf0.m220399u("e_imagepage_signup_upload_button", this.f112773q.pageId(), vwb.m200311Y(Oauth2AccessToken.KEY_PHONE_NUM, this.f112774r.m111222H0()));
        act().pickImagesWithPicker(1, false, false, true, "from_sign_up");
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m135686p(SignUpData signUpData, View view) {
        zvf0.m220399u("e_imagepage_signup_photo", this.f112773q.pageId(), vwb.m200311Y("photo_type", TextUtils.isEmpty(signUpData.profilePath) ? "empty" : "uploaded"));
        zvf0.m220399u("e_imagepage_signup_upload_button", this.f112773q.pageId(), vwb.m200311Y(Oauth2AccessToken.KEY_PHONE_NUM, this.f112774r.m111222H0()));
        act().pickImagesWithPicker(1, false, false, true, "from_sign_up");
    }

    /* JADX INFO: renamed from: q */
    public void m135687q(SignUpData signUpData) {
        boolean zIsEmpty = TextUtils.isEmpty(signUpData.profilePath);
        VLinear vLinear = this.f112759c;
        if (zIsEmpty) {
            xdl0.m208344M(vLinear, true);
            xdl0.m208344M(this.f112761e, false);
            xdl0.m208344M(this.f112765i, false);
        } else {
            xdl0.m208344M(vLinear, false);
            xdl0.m208344M(this.f112761e, true);
            xdl0.m208344M(this.f112765i, true);
            qib0.f154691G.m102367m0(this.f112761e, rhi.m179355B(signUpData.profilePath));
        }
        this.f112760d.setText(i0g0.m133861b0(act().string(R$string.f16051B3), vwb.m200324f0(act().string(R$string.f16056C3)), Color.parseColor("#FE7E1D"), eqh0.m117752c(2)));
        ilo iloVar = ilo.INSTANCE;
        if (iloVar.m137015h("female", signUpData)) {
            int i = C17532a.f112775a[IntlCountryCodeController.m28107c().ordinal()];
            if (i == 1) {
                this.f112762f.setImageResource(v2c0.f179461d);
                return;
            }
            if (i == 2) {
                this.f112762f.setImageResource(v2c0.f179458c);
                return;
            }
            VImage vImage = this.f112762f;
            if (i != 3) {
                vImage.setImageResource(v2c0.f179452a);
                return;
            } else {
                vImage.setImageResource(v2c0.f179455b);
                return;
            }
        }
        if (iloVar.m137015h("male", signUpData)) {
            int i2 = C17532a.f112775a[IntlCountryCodeController.m28107c().ordinal()];
            if (i2 == 1) {
                this.f112762f.setImageResource(v2c0.f179473h);
                return;
            }
            if (i2 == 2) {
                this.f112762f.setImageResource(v2c0.f179470g);
                return;
            }
            VImage vImage2 = this.f112762f;
            if (i2 != 3) {
                vImage2.setImageResource(v2c0.f179464e);
                return;
            } else {
                vImage2.setImageResource(v2c0.f179467f);
                return;
            }
        }
        if (iloVar.m137015h("nonbinary", signUpData)) {
            this.f112763g.setImageResource(v2c0.f179476i);
            int i3 = C17532a.f112775a[IntlCountryCodeController.m28107c().ordinal()];
            if (i3 == 1) {
                this.f112762f.setImageResource(v2c0.f179488m);
                return;
            }
            if (i3 == 2) {
                this.f112762f.setImageResource(v2c0.f179485l);
                return;
            }
            VImage vImage3 = this.f112762f;
            if (i3 != 3) {
                vImage3.setImageResource(v2c0.f179479j);
            } else {
                vImage3.setImageResource(v2c0.f179482k);
            }
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
