package com.p000p1.mobile.putong.account.p002ui.accountnew;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Pair;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.data.CaptchaData;
import com.p000p1.mobile.putong.account.p002ui.accountnew.VCodeCaptchaView;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.CrashHelper;
import l.e30;
import l.mkd0;
import l.roj0;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p006l.dok0;
import p006l.u0c0;
import v.VButton;
import v.VImage;
import v.VLinear;
import v.VMaterialEdit;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VCodeCaptchaView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VImage f434d;

    /* JADX INFO: renamed from: e */
    public VLinear f435e;

    /* JADX INFO: renamed from: f */
    public VImage f436f;

    /* JADX INFO: renamed from: g */
    public VImage f437g;

    /* JADX INFO: renamed from: h */
    public VMaterialEdit f438h;

    /* JADX INFO: renamed from: i */
    public VText f439i;

    /* JADX INFO: renamed from: j */
    public VButton f440j;

    /* JADX INFO: renamed from: k */
    public Act f441k;

    public VCodeCaptchaView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m405m0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m407r0(e30 e30Var, View view) {
        m409p0(e30Var);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m408o0(View view) {
        dok0.m14165a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m408o0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m409p0(final e30<Pair<String, String>> e30Var) {
        this.f441k.duringCreated(AccountModule.f26c.m209W0()).subscribe(mkd0.H(new e30() { // from class: l.bok0
            public final void call(Object obj) {
                this.f9017a.m410q0(e30Var, (CaptchaData) obj);
            }
        }, new e30() { // from class: l.cok0
            public final void call(Object obj) {
                VCodeCaptchaView.m405m0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m410q0(e30 e30Var, CaptchaData captchaData) {
        m415w0(this.f441k, captchaData, e30Var);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m411s0(final e30 e30Var, VImage vImage) {
        vImage.setOnClickListener(new View.OnClickListener() { // from class: l.aok0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8422a.m407r0(e30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m412t0(e30 e30Var, CaptchaData captchaData, roj0 roj0Var) {
        xdl0.M(this.f439i, false);
        e30Var.call(Pair.create(captchaData.token, this.f438h.getText().toString().trim()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m413u0(e30 e30Var, Throwable th) {
        m409p0(e30Var);
        if ((th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).code == 400003) {
            xdl0.M(this.f439i, true);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m414v0(Act act, final CaptchaData captchaData, final e30 e30Var, View view) {
        zvf0.r("e_intl_captcha_confirm", "p_intl_captcha_popup");
        act.duringCreated(AccountModule.f26c.m180H0(captchaData.token, this.f438h.getText().toString().trim())).subscribe(mkd0.H(new e30() { // from class: l.ynk0
            public final void call(Object obj) {
                this.f28308a.m412t0(e30Var, captchaData, (roj0) obj);
            }
        }, new e30() { // from class: l.znk0
            public final void call(Object obj) {
                this.f28855a.m413u0(e30Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w0 */
    public void m415w0(final Act act, final CaptchaData captchaData, final e30<Pair<String, String>> e30Var) {
        this.f441k = act;
        try {
            byte[] bArrDecode = Base64.decode(captchaData.images.chars.content.split(",")[1], 0);
            this.f436f.setImageBitmap(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
        } catch (Exception e) {
            CrashHelper.c(e);
            this.f436f.setImageResource(u0c0.f22408o);
        }
        this.f438h.setText("");
        vwb.z(vwb.f0(new VImage[]{this.f437g, this.f436f}), new e30() { // from class: l.wnk0
            public final void call(Object obj) {
                this.f25256a.m411s0(e30Var, (VImage) obj);
            }
        });
        xdl0.E0(this.f440j, new View.OnClickListener() { // from class: l.xnk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f27624a.m414v0(act, captchaData, e30Var, view);
            }
        });
    }

    public VCodeCaptchaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VCodeCaptchaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
