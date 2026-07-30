package com.p046p1.mobile.putong.account.p050ui.accountnew;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Pair;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.data.CaptchaData;
import com.p046p1.mobile.putong.account.p050ui.accountnew.VCodeCaptchaView;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.tantanapp.common.utils.CrashHelper;
import p147v.VButton;
import p147v.VImage;
import p147v.VLinear;
import p147v.VMaterialEdit;
import p147v.VText;
import p149l.dok0;
import p149l.e30;
import p149l.mkd0;
import p149l.roj0;
import p149l.u0c0;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class VCodeCaptchaView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VImage f16445d;

    /* JADX INFO: renamed from: e */
    public VLinear f16446e;

    /* JADX INFO: renamed from: f */
    public VImage f16447f;

    /* JADX INFO: renamed from: g */
    public VImage f16448g;

    /* JADX INFO: renamed from: h */
    public VMaterialEdit f16449h;

    /* JADX INFO: renamed from: i */
    public VText f16450i;

    /* JADX INFO: renamed from: j */
    public VButton f16451j;

    /* JADX INFO: renamed from: k */
    public Act f16452k;

    public VCodeCaptchaView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m28509m0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m28511r0(e30 e30Var, View view) {
        m28513p0(e30Var);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m28512o0(View view) {
        dok0.m112808a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m28512o0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m28513p0(final e30<Pair<String, String>> e30Var) {
        this.f16452k.duringCreated(AccountModule.f16037c.m28314W0()).subscribe(mkd0.m154956H(new e30() { // from class: l.bok0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f76529a.m28514q0(e30Var, (CaptchaData) obj);
            }
        }, new e30() { // from class: l.cok0
            @Override // p149l.e30
            public final void call(Object obj) {
                VCodeCaptchaView.m28509m0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m28514q0(e30 e30Var, CaptchaData captchaData) {
        m28519w0(this.f16452k, captchaData, e30Var);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m28515s0(final e30 e30Var, VImage vImage) {
        vImage.setOnClickListener(new View.OnClickListener() { // from class: l.aok0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f70874a.m28511r0(e30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m28516t0(e30 e30Var, CaptchaData captchaData, roj0 roj0Var) {
        xdl0.m208344M(this.f16450i, false);
        e30Var.call(Pair.create(captchaData.token, this.f16449h.getText().toString().trim()));
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m28517u0(e30 e30Var, Throwable th) {
        m28513p0(e30Var);
        if ((th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).code == 400003) {
            xdl0.m208344M(this.f16450i, true);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m28518v0(Act act, final CaptchaData captchaData, final e30 e30Var, View view) {
        zvf0.m220396r("e_intl_captcha_confirm", "p_intl_captcha_popup");
        act.duringCreated(AccountModule.f16037c.m28285H0(captchaData.token, this.f16449h.getText().toString().trim())).subscribe(mkd0.m154956H(new e30() { // from class: l.ynk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f199181a.m28516t0(e30Var, captchaData, (roj0) obj);
            }
        }, new e30() { // from class: l.znk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203981a.m28517u0(e30Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w0 */
    public void m28519w0(final Act act, final CaptchaData captchaData, final e30<Pair<String, String>> e30Var) {
        this.f16452k = act;
        try {
            byte[] bArrDecode = Base64.decode(captchaData.images.chars.content.split(Constants.SEPARATOR_COMMA)[1], 0);
            this.f16447f.setImageBitmap(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            this.f16447f.setImageResource(u0c0.f172894o);
        }
        this.f16449h.setText("");
        vwb.m200354z(vwb.m200324f0(this.f16448g, this.f16447f), new e30() { // from class: l.wnk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187314a.m28515s0(e30Var, (VImage) obj);
            }
        });
        xdl0.m208329E0(this.f16451j, new View.OnClickListener() { // from class: l.xnk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f193706a.m28518v0(act, captchaData, e30Var, view);
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
