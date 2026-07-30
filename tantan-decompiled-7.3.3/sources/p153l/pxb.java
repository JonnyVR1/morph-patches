package p153l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.cropiwa.CropIwaView;
import com.p051p1.mobile.android.p053ui.cropiwa.TooLargeException;
import com.p051p1.mobile.android.p053ui.cropiwa.config.InitialPosition;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.act.CropperAct;
import com.p051p1.mobile.putong.data.SignUpData;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import p151v.VButton_FakeShadow;
import p151v.VProgressBar;

/* JADX INFO: loaded from: classes9.dex */
public class pxb implements iam<fxb> {

    /* JADX INFO: renamed from: f */
    public static int f154548f = 1080;

    /* JADX INFO: renamed from: g */
    public static int f154549g = 1080;

    /* JADX INFO: renamed from: a */
    public CropperAct f154550a;

    /* JADX INFO: renamed from: b */
    public fxb f154551b;

    /* JADX INFO: renamed from: c */
    public CropIwaView f154552c;

    /* JADX INFO: renamed from: d */
    public VProgressBar f154553d;

    /* JADX INFO: renamed from: e */
    public VButton_FakeShadow f154554e;

    /* JADX INFO: renamed from: l.pxb$a */
    public class C19462a implements tvb.InterfaceC20409a {
        public C19462a() {
        }

        @Override // p153l.tvb.InterfaceC20409a
        /* JADX INFO: renamed from: a */
        public void mo22043a(Uri uri, Bitmap bitmap) {
            bnl0.m105524M(pxb.this.f154553d, false);
        }

        @Override // p153l.tvb.InterfaceC20409a
        /* JADX INFO: renamed from: b */
        public void mo22044b(Throwable th) {
            bnl0.m105524M(pxb.this.f154553d, false);
            if (th instanceof TooLargeException) {
                o1j0.m165634h(R$string.f16910d0);
            } else {
                o1j0.m165634h(R$string.f16846R);
            }
            pxb.this.f154550a.m68056e2();
        }
    }

    public pxb(CropperAct cropperAct) {
        this.f154550a = cropperAct;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f154550a;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f154550a;
    }

    @Override // p153l.iam
    public void destroy() {
        if (NullChecker.m82486a(this.f154552c)) {
            this.f154552c.m22042y();
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(hec0.f109127o, viewGroup);
        this.f154552c = (CropIwaView) viewInflate.findViewById(wcc0.f188456n);
        this.f154553d = (VProgressBar) viewInflate.findViewById(wcc0.f188408D);
        VButton_FakeShadow vButton_FakeShadow = (VButton_FakeShadow) viewInflate.findViewById(wcc0.f188438d0);
        this.f154554e = vButton_FakeShadow;
        vButton_FakeShadow.setTypeface(Typeface.DEFAULT_BOLD);
        return viewInflate;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(fxb fxbVar) {
        this.f154551b = fxbVar;
    }

    /* JADX INFO: renamed from: k */
    public void m174209k(ewb ewbVar) {
        this.f154552c.m22031n(ewbVar);
    }

    /* JADX INFO: renamed from: l */
    public void m174210l(String str) {
        boolean zM134081c = h9n.m134081c();
        CropIwaView cropIwaView = this.f154552c;
        if (zM134081c) {
            bwb bwbVarM22030m = cropIwaView.m22030m();
            bwbVarM22030m.m106652C(new svb(bwbVarM22030m)).m106664O(false).m106663N(true).m106688x(new q11(4, 5)).m106654E(false).m106668b();
            bnl0.m105533Q0(this.f154552c, new y20() { // from class: l.hxb
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f111973a.m174211m((int[]) obj);
                }
            });
        } else {
            cropIwaView.m22030m().m106690z(qa00.m175859d(2.0f)).m106664O(false).m106688x(new q11(1, 1)).m106654E(false).m106668b();
        }
        this.f154552c.m22029l().m208048p(f154548f, f154549g).m208054v(0.02f).m208052t(6.0f).m208053u(0.2f).m208049q(InitialPosition.CENTER_INSIDE).m208036b();
        this.f154552c.setImageUri(Uri.fromFile(new File(str)));
        this.f154552c.setCropSaveCompleteListener(new CropIwaView.InterfaceC4512c() { // from class: l.jxb
            @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropIwaView.InterfaceC4512c
            /* JADX INFO: renamed from: a */
            public final void mo22048a(Uri uri) {
                this.f123014a.m174212n(uri);
            }
        });
        this.f154552c.setInvalidCroppingListener(new CropIwaView.InterfaceC4514e() { // from class: l.lxb
            @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropIwaView.InterfaceC4514e
            /* JADX INFO: renamed from: a */
            public final void mo22049a() {
                this.f133915a.m174213p();
            }
        });
        this.f154552c.setErrorListener(new CropIwaView.InterfaceC4513d() { // from class: l.nxb
            @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropIwaView.InterfaceC4513d
            public final void onError(Throwable th) {
                this.f144105a.m174214q(th);
            }
        });
        this.f154552c.setImageLoadListener(new C19462a());
        bnl0.m105509E0(this.f154554e, new View.OnClickListener() { // from class: l.oxb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f149634a.m174215s(view);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m174211m(int[] iArr) {
        int i = (iArr[1] - ((int) ((iArr[0] - qa00.f156326m) / 0.8f))) / 2;
        int measuredHeight = this.f154554e.getMeasuredHeight();
        int i2 = qa00.f156330q;
        if (i > measuredHeight + i2) {
            VButton_FakeShadow vButton_FakeShadow = this.f154554e;
            bnl0.m105537U(vButton_FakeShadow, (i - i2) - vButton_FakeShadow.getMeasuredHeight());
        } else if (i >= qa00.m175859d(52.0f)) {
            bnl0.m105537U(this.f154554e, (i - qa00.m175859d(52.0f)) / 2);
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m174212n(Uri uri) {
        this.f154551b.m127968x0(uri.getPath());
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m174213p() {
        this.f154550a.progressDismiss();
        o1j0.m165634h(R$string.f16851S);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m174214q(Throwable th) {
        this.f154550a.progressDismiss();
        if (th instanceof TooLargeException) {
            o1j0.m165634h(R$string.f16910d0);
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m174215s(View view) {
        i4g0.m138523u("e_imagepage_signup_edit_done_button", this.f154550a.pageId(), jyb.m147494Y(Oauth2AccessToken.KEY_PHONE_NUM, SignUpData.getNonNullPhoneNumber()), jyb.m147494Y("signup_source", AccountModule.m29130F().getSignUpType()), jyb.m147494Y("upload_image_cnt", 1), jyb.m147494Y("magic_used", "no"));
        if (h9n.m134081c()) {
            i4g0.m138523u("e_imagepage_signup_start_button", getAct().pageId(), jyb.m147494Y(Oauth2AccessToken.KEY_PHONE_NUM, SignUpData.getNonNullPhoneNumber()), jyb.m147494Y("signup_source", AccountModule.f16756c.m29324c1().signUpType), jyb.m147494Y("upload_image_cnt", 1));
        }
        if (this.f154551b.m127969z0()) {
            i4g0.m138520r("e_pre_signup_picture_start_button", this.f154550a.pageId());
        }
        this.f154551b.m127967u0();
    }
}
