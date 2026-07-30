package p006l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.act.CropperAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.cropiwa.CropIwaView;
import com.p1.mobile.android.ui.cropiwa.TooLargeException;
import com.p1.mobile.android.ui.cropiwa.config.InitialPosition;
import com.p1.mobile.putong.data.SignUpData;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import l.e30;
import l.eub;
import l.fub;
import l.j11;
import l.j760;
import l.lsi0;
import l.nub;
import l.qub;
import l.s7m;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.VButton_FakeShadow;
import v.VProgressBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class bwb implements s7m<rvb> {

    /* JADX INFO: renamed from: f */
    public static int f9126f = 1080;

    /* JADX INFO: renamed from: g */
    public static int f9127g = 1080;

    /* JADX INFO: renamed from: a */
    public CropperAct f9128a;

    /* JADX INFO: renamed from: b */
    public rvb f9129b;

    /* JADX INFO: renamed from: c */
    public CropIwaView f9130c;

    /* JADX INFO: renamed from: d */
    public VProgressBar f9131d;

    /* JADX INFO: renamed from: e */
    public VButton_FakeShadow f9132e;

    /* JADX INFO: renamed from: l.bwb$a */
    public class C0578a implements fub.a {
        public C0578a() {
        }

        /* JADX INFO: renamed from: a */
        public void m12934a(Uri uri, Bitmap bitmap) {
            xdl0.M(bwb.this.f9131d, false);
        }

        /* JADX INFO: renamed from: b */
        public void m12935b(Throwable th) {
            xdl0.M(bwb.this.f9131d, false);
            if (th instanceof TooLargeException) {
                lsi0.h(R$string.f180d0);
            } else {
                lsi0.h(R$string.f116R);
            }
            bwb.this.f9128a.finish();
        }
    }

    public bwb(CropperAct cropperAct) {
        this.f9128a = cropperAct;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m12924C0() {
        return this.f9128a;
    }

    @Nullable
    public Act act() {
        return this.f9128a;
    }

    public void destroy() {
        if (NullChecker.a(this.f9130c)) {
            this.f9130c.y();
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f9445o, viewGroup);
        this.f9130c = viewInflate.findViewById(q4c0.f19618n);
        this.f9131d = viewInflate.findViewById(q4c0.f19570D);
        VButton_FakeShadow vButton_FakeShadowFindViewById = viewInflate.findViewById(q4c0.f19600d0);
        this.f9132e = vButton_FakeShadowFindViewById;
        vButton_FakeShadowFindViewById.setTypeface(Typeface.DEFAULT_BOLD);
        return viewInflate;
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void m12925i1(rvb rvbVar) {
        this.f9129b = rvbVar;
    }

    /* JADX INFO: renamed from: k */
    public void m12927k(qub qubVar) {
        this.f9130c.n(qubVar);
    }

    /* JADX INFO: renamed from: l */
    public void m12928l(String str) {
        boolean zM16063c = h7n.m16063c();
        CropIwaView cropIwaView = this.f9130c;
        if (zM16063c) {
            nub nubVarM = cropIwaView.m();
            nubVarM.C(new eub(nubVarM)).O(false).N(true).x(new j11(4, 5)).E(false).b();
            xdl0.Q0(this.f9130c, new e30() { // from class: l.tvb
                public final void call(Object obj) {
                    this.f22294a.m12929m((int[]) obj);
                }
            });
        } else {
            cropIwaView.m().z(t100.d(2.0f)).O(false).x(new j11(1, 1)).E(false).b();
        }
        this.f9130c.l().p(f9126f, f9127g).v(0.02f).t(6.0f).u(0.2f).q(InitialPosition.CENTER_INSIDE).b();
        this.f9130c.setImageUri(Uri.fromFile(new File(str)));
        this.f9130c.setCropSaveCompleteListener(new CropIwaView.c() { // from class: l.vvb
            /* JADX INFO: renamed from: a */
            public final void m25902a(Uri uri) {
                this.f24483a.m12930n(uri);
            }
        });
        this.f9130c.setInvalidCroppingListener(new CropIwaView.e() { // from class: l.xvb
            /* JADX INFO: renamed from: a */
            public final void m27648a() {
                this.f27737a.m12931p();
            }
        });
        this.f9130c.setErrorListener(new CropIwaView.d() { // from class: l.zvb
            public final void onError(Throwable th) {
                this.f28997a.m12932q(th);
            }
        });
        this.f9130c.setImageLoadListener(new C0578a());
        xdl0.E0(this.f9132e, new View.OnClickListener() { // from class: l.awb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8569a.m12933s(view);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m12929m(int[] iArr) {
        int i = (iArr[1] - ((int) ((iArr[0] - t100.m) / 0.8f))) / 2;
        int measuredHeight = this.f9132e.getMeasuredHeight();
        int i2 = t100.q;
        if (i > measuredHeight + i2) {
            VButton_FakeShadow vButton_FakeShadow = this.f9132e;
            xdl0.U(vButton_FakeShadow, (i - i2) - vButton_FakeShadow.getMeasuredHeight());
        } else if (i >= t100.d(52.0f)) {
            xdl0.U(this.f9132e, (i - t100.d(52.0f)) / 2);
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m12930n(Uri uri) {
        this.f9129b.m23324x0(uri.getPath());
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m12931p() {
        this.f9128a.progressDismiss();
        lsi0.h(R$string.f121S);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m12932q(Throwable th) {
        this.f9128a.progressDismiss();
        if (th instanceof TooLargeException) {
            lsi0.h(R$string.f180d0);
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m12933s(View view) {
        zvf0.u("e_imagepage_signup_edit_done_button", this.f9128a.pageId(), new j760[]{vwb.Y("phone_num", SignUpData.getNonNullPhoneNumber()), vwb.Y("signup_source", AccountModule.m26F().getSignUpType()), vwb.Y("upload_image_cnt", 1), vwb.Y("magic_used", "no")});
        if (h7n.m16063c()) {
            zvf0.u("e_imagepage_signup_start_button", act().pageId(), new j760[]{vwb.Y("phone_num", SignUpData.getNonNullPhoneNumber()), vwb.Y("signup_source", AccountModule.f26c.m220c1().signUpType), vwb.Y("upload_image_cnt", 1)});
        }
        if (this.f9129b.m23325z0()) {
            zvf0.r("e_pre_signup_picture_start_button", this.f9128a.pageId());
        }
        this.f9129b.m23323u0();
    }
}
