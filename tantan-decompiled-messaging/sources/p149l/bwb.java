package p149l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.cropiwa.CropIwaView;
import com.p046p1.mobile.android.p048ui.cropiwa.TooLargeException;
import com.p046p1.mobile.android.p048ui.cropiwa.config.InitialPosition;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.act.CropperAct;
import com.p046p1.mobile.putong.data.SignUpData;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import p147v.VButton_FakeShadow;
import p147v.VProgressBar;

/* JADX INFO: loaded from: classes9.dex */
public class bwb implements s7m<rvb> {

    /* JADX INFO: renamed from: f */
    public static int f77597f = 1080;

    /* JADX INFO: renamed from: g */
    public static int f77598g = 1080;

    /* JADX INFO: renamed from: a */
    public CropperAct f77599a;

    /* JADX INFO: renamed from: b */
    public rvb f77600b;

    /* JADX INFO: renamed from: c */
    public CropIwaView f77601c;

    /* JADX INFO: renamed from: d */
    public VProgressBar f77602d;

    /* JADX INFO: renamed from: e */
    public VButton_FakeShadow f77603e;

    /* JADX INFO: renamed from: l.bwb$a */
    public class C15995a implements fub.InterfaceC16922a {
        public C15995a() {
        }

        @Override // p149l.fub.InterfaceC16922a
        /* JADX INFO: renamed from: a */
        public void mo21044a(Uri uri, Bitmap bitmap) {
            xdl0.m208344M(bwb.this.f77602d, false);
        }

        @Override // p149l.fub.InterfaceC16922a
        /* JADX INFO: renamed from: b */
        public void mo21045b(Throwable th) {
            xdl0.m208344M(bwb.this.f77602d, false);
            if (th instanceof TooLargeException) {
                lsi0.m151578h(R$string.f16191d0);
            } else {
                lsi0.m151578h(R$string.f16127R);
            }
            bwb.this.f77599a.m66873d2();
        }
    }

    public bwb(CropperAct cropperAct) {
        this.f77599a = cropperAct;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f77599a;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f77599a;
    }

    @Override // p149l.s7m
    public void destroy() {
        if (NullChecker.m81303a(this.f77601c)) {
            this.f77601c.m21043y();
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f79515o, viewGroup);
        this.f77601c = (CropIwaView) viewInflate.findViewById(q4c0.f152608n);
        this.f77602d = (VProgressBar) viewInflate.findViewById(q4c0.f152560D);
        VButton_FakeShadow vButton_FakeShadow = (VButton_FakeShadow) viewInflate.findViewById(q4c0.f152590d0);
        this.f77603e = vButton_FakeShadow;
        vButton_FakeShadow.setTypeface(Typeface.DEFAULT_BOLD);
        return viewInflate;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(rvb rvbVar) {
        this.f77600b = rvbVar;
    }

    /* JADX INFO: renamed from: k */
    public void m104142k(qub qubVar) {
        this.f77601c.m21032n(qubVar);
    }

    /* JADX INFO: renamed from: l */
    public void m104143l(String str) {
        boolean zM129754c = h7n.m129754c();
        CropIwaView cropIwaView = this.f77601c;
        if (zM129754c) {
            nub nubVarM21031m = cropIwaView.m21031m();
            nubVarM21031m.m161444C(new eub(nubVarM21031m)).m161456O(false).m161455N(true).m161480x(new j11(4, 5)).m161446E(false).m161460b();
            xdl0.m208353Q0(this.f77601c, new e30() { // from class: l.tvb
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f172275a.m104144m((int[]) obj);
                }
            });
        } else {
            cropIwaView.m21031m().m161482z(t100.m186890d(2.0f)).m161456O(false).m161480x(new j11(1, 1)).m161446E(false).m161460b();
        }
        this.f77601c.m21030l().m138380p(f77597f, f77598g).m138386v(0.02f).m138384t(6.0f).m138385u(0.2f).m138381q(InitialPosition.CENTER_INSIDE).m138368b();
        this.f77601c.setImageUri(Uri.fromFile(new File(str)));
        this.f77601c.setCropSaveCompleteListener(new CropIwaView.InterfaceC4361c() { // from class: l.vvb
            @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropIwaView.InterfaceC4361c
            /* JADX INFO: renamed from: a */
            public final void mo21049a(Uri uri) {
                this.f183205a.m104145n(uri);
            }
        });
        this.f77601c.setInvalidCroppingListener(new CropIwaView.InterfaceC4363e() { // from class: l.xvb
            @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropIwaView.InterfaceC4363e
            /* JADX INFO: renamed from: a */
            public final void mo21050a() {
                this.f194591a.m104146p();
            }
        });
        this.f77601c.setErrorListener(new CropIwaView.InterfaceC4362d() { // from class: l.zvb
            @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropIwaView.InterfaceC4362d
            public final void onError(Throwable th) {
                this.f204990a.m104147q(th);
            }
        });
        this.f77601c.setImageLoadListener(new C15995a());
        xdl0.m208329E0(this.f77603e, new View.OnClickListener() { // from class: l.awb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f72027a.m104148s(view);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m104144m(int[] iArr) {
        int i = (iArr[1] - ((int) ((iArr[0] - t100.f167264m) / 0.8f))) / 2;
        int measuredHeight = this.f77603e.getMeasuredHeight();
        int i2 = t100.f167268q;
        if (i > measuredHeight + i2) {
            VButton_FakeShadow vButton_FakeShadow = this.f77603e;
            xdl0.m208357U(vButton_FakeShadow, (i - i2) - vButton_FakeShadow.getMeasuredHeight());
        } else if (i >= t100.m186890d(52.0f)) {
            xdl0.m208357U(this.f77603e, (i - t100.m186890d(52.0f)) / 2);
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m104145n(Uri uri) {
        this.f77600b.m181276x0(uri.getPath());
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m104146p() {
        this.f77599a.progressDismiss();
        lsi0.m151578h(R$string.f16132S);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m104147q(Throwable th) {
        this.f77599a.progressDismiss();
        if (th instanceof TooLargeException) {
            lsi0.m151578h(R$string.f16191d0);
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m104148s(View view) {
        zvf0.m220399u("e_imagepage_signup_edit_done_button", this.f77599a.pageId(), vwb.m200311Y(Oauth2AccessToken.KEY_PHONE_NUM, SignUpData.getNonNullPhoneNumber()), vwb.m200311Y("signup_source", AccountModule.m28131F().getSignUpType()), vwb.m200311Y("upload_image_cnt", 1), vwb.m200311Y("magic_used", "no"));
        if (h7n.m129754c()) {
            zvf0.m220399u("e_imagepage_signup_start_button", getAct().pageId(), vwb.m200311Y(Oauth2AccessToken.KEY_PHONE_NUM, SignUpData.getNonNullPhoneNumber()), vwb.m200311Y("signup_source", AccountModule.f16037c.m28325c1().signUpType), vwb.m200311Y("upload_image_cnt", 1));
        }
        if (this.f77600b.m181277z0()) {
            zvf0.m220396r("e_pre_signup_picture_start_button", this.f77599a.pageId());
        }
        this.f77600b.m181275u0();
    }
}
