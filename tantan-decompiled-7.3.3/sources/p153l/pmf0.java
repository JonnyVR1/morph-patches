package p153l;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.p055ui.accountnew.SignUpProfileImageAct;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.SignUpData;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VScroll;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class pmf0 implements iam<kmf0> {

    /* JADX INFO: renamed from: a */
    public VScroll f153163a;

    /* JADX INFO: renamed from: b */
    public VText f153164b;

    /* JADX INFO: renamed from: c */
    public VLinear f153165c;

    /* JADX INFO: renamed from: d */
    public VText f153166d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f153167e;

    /* JADX INFO: renamed from: f */
    public VImage f153168f;

    /* JADX INFO: renamed from: g */
    public VImage f153169g;

    /* JADX INFO: renamed from: h */
    public VImage f153170h;

    /* JADX INFO: renamed from: i */
    public VLinear f153171i;

    /* JADX INFO: renamed from: j */
    public VText f153172j;

    /* JADX INFO: renamed from: k */
    public VText f153173k;

    /* JADX INFO: renamed from: l */
    public ConstraintLayout f153174l;

    /* JADX INFO: renamed from: m */
    public VImage f153175m;

    /* JADX INFO: renamed from: n */
    public VImage f153176n;

    /* JADX INFO: renamed from: o */
    public VText f153177o;

    /* JADX INFO: renamed from: p */
    public VText f153178p;

    /* JADX INFO: renamed from: q */
    public final SignUpProfileImageAct f153179q;

    /* JADX INFO: renamed from: r */
    public kmf0 f153180r;

    /* JADX INFO: renamed from: l.pmf0$a */
    public static /* synthetic */ class C19402a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f153181a;

        static {
            int[] iArr = new int[IntlCountryCodeController.ModelRegion.values().length];
            f153181a = iArr;
            try {
                iArr[IntlCountryCodeController.ModelRegion.SEA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f153181a[IntlCountryCodeController.ModelRegion.SA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f153181a[IntlCountryCodeController.ModelRegion.OTHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public pmf0(@NonNull SignUpProfileImageAct signUpProfileImageAct) {
        this.f153179q = signUpProfileImageAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m172939m(View view) {
        this.f153180r.m150457J0();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f153179q;
    }

    /* JADX INFO: renamed from: e */
    public View m172940e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return qmf0.m177109b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public PutongAct act() {
        return this.f153179q;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(kmf0 kmf0Var) {
        this.f153180r = kmf0Var;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m172940e(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m172943j(final SignUpData signUpData) {
        bnl0.m105524M(this.f153175m, false);
        bnl0.m105524M(this.f153177o, false);
        bnl0.m105509E0(this.f153165c, new View.OnClickListener() { // from class: l.mmf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137563a.m172945l(signUpData, view);
            }
        });
        bnl0.m105509E0(this.f153172j, new View.OnClickListener() { // from class: l.nmf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f142701a.m172939m(view);
            }
        });
        bnl0.m105509E0(this.f153173k, new View.OnClickListener() { // from class: l.omf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f147940a.m172946n(signUpData, view);
            }
        });
        m172948q(signUpData);
    }

    /* JADX INFO: renamed from: k */
    public void m172944k(final SignUpData signUpData) {
        bnl0.m105509E0(this.f153165c, new View.OnClickListener() { // from class: l.lmf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f132686a.m172947p(signUpData, view);
            }
        });
        m172948q(signUpData);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m172945l(SignUpData signUpData, View view) {
        i4g0.m138523u("e_imagepage_signup_photo", this.f153179q.pageId(), jyb.m147494Y("photo_type", TextUtils.isEmpty(signUpData.profilePath) ? "empty" : "uploaded"));
        i4g0.m138523u("e_imagepage_signup_upload_button", this.f153179q.pageId(), jyb.m147494Y(Oauth2AccessToken.KEY_PHONE_NUM, this.f153180r.m150455H0()));
        act().pickImagesWithPicker(1, false, false, true, "from_sign_up");
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m172946n(SignUpData signUpData, View view) {
        i4g0.m138523u("e_imagepage_signup_photo", this.f153179q.pageId(), jyb.m147494Y("photo_type", TextUtils.isEmpty(signUpData.profilePath) ? "empty" : "uploaded"));
        i4g0.m138523u("e_imagepage_signup_upload_button", this.f153179q.pageId(), jyb.m147494Y(Oauth2AccessToken.KEY_PHONE_NUM, this.f153180r.m150455H0()));
        act().pickImagesWithPicker(1, false, false, true, "from_sign_up");
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m172947p(SignUpData signUpData, View view) {
        i4g0.m138523u("e_imagepage_signup_photo", this.f153179q.pageId(), jyb.m147494Y("photo_type", TextUtils.isEmpty(signUpData.profilePath) ? "empty" : "uploaded"));
        i4g0.m138523u("e_imagepage_signup_upload_button", this.f153179q.pageId(), jyb.m147494Y(Oauth2AccessToken.KEY_PHONE_NUM, this.f153180r.m150455H0()));
        act().pickImagesWithPicker(1, false, false, true, "from_sign_up");
    }

    /* JADX INFO: renamed from: q */
    public void m172948q(SignUpData signUpData) {
        boolean zIsEmpty = TextUtils.isEmpty(signUpData.profilePath);
        VLinear vLinear = this.f153165c;
        if (zIsEmpty) {
            bnl0.m105524M(vLinear, true);
            bnl0.m105524M(this.f153167e, false);
            bnl0.m105524M(this.f153171i, false);
        } else {
            bnl0.m105524M(vLinear, false);
            bnl0.m105524M(this.f153167e, true);
            bnl0.m105524M(this.f153171i, true);
            uqb0.f180374G.m127150m0(this.f153167e, oki.m168011B(signUpData.profilePath));
        }
        this.f153166d.setText(q8g0.m175796b0(act().string(R$string.f16770B3), jyb.m147507f0(act().string(R$string.f16775C3)), Color.parseColor("#FE7E1D"), lyh0.m156283c(2)));
        ino inoVar = ino.INSTANCE;
        if (inoVar.m141162h("female", signUpData)) {
            int i = C19402a.f153181a[IntlCountryCodeController.m29106c().ordinal()];
            if (i == 1) {
                this.f153168f.setImageResource(bbc0.f75867d);
                return;
            }
            if (i == 2) {
                this.f153168f.setImageResource(bbc0.f75864c);
                return;
            }
            VImage vImage = this.f153168f;
            if (i != 3) {
                vImage.setImageResource(bbc0.f75858a);
                return;
            } else {
                vImage.setImageResource(bbc0.f75861b);
                return;
            }
        }
        if (inoVar.m141162h("male", signUpData)) {
            int i2 = C19402a.f153181a[IntlCountryCodeController.m29106c().ordinal()];
            if (i2 == 1) {
                this.f153168f.setImageResource(bbc0.f75879h);
                return;
            }
            if (i2 == 2) {
                this.f153168f.setImageResource(bbc0.f75876g);
                return;
            }
            VImage vImage2 = this.f153168f;
            if (i2 != 3) {
                vImage2.setImageResource(bbc0.f75870e);
                return;
            } else {
                vImage2.setImageResource(bbc0.f75873f);
                return;
            }
        }
        if (inoVar.m141162h("nonbinary", signUpData)) {
            this.f153169g.setImageResource(bbc0.f75882i);
            int i3 = C19402a.f153181a[IntlCountryCodeController.m29106c().ordinal()];
            if (i3 == 1) {
                this.f153168f.setImageResource(bbc0.f75894m);
                return;
            }
            if (i3 == 2) {
                this.f153168f.setImageResource(bbc0.f75891l);
                return;
            }
            VImage vImage3 = this.f153168f;
            if (i3 != 3) {
                vImage3.setImageResource(bbc0.f75885j);
            } else {
                vImage3.setImageResource(bbc0.f75888k);
            }
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
