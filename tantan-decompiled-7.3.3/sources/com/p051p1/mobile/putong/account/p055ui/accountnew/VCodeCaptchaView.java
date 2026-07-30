package com.p051p1.mobile.putong.account.p055ui.accountnew;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Pair;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.data.CaptchaData;
import com.p051p1.mobile.putong.account.p055ui.accountnew.VCodeCaptchaView;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.tantanapp.common.utils.CrashHelper;
import p151v.VButton;
import p151v.VImage;
import p151v.VLinear;
import p151v.VMaterialEdit;
import p151v.VText;
import p153l.a9c0;
import p153l.bnl0;
import p153l.i4g0;
import p153l.jxk0;
import p153l.jyb;
import p153l.psd0;
import p153l.uxj0;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class VCodeCaptchaView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VImage f17164d;

    /* JADX INFO: renamed from: e */
    public VLinear f17165e;

    /* JADX INFO: renamed from: f */
    public VImage f17166f;

    /* JADX INFO: renamed from: g */
    public VImage f17167g;

    /* JADX INFO: renamed from: h */
    public VMaterialEdit f17168h;

    /* JADX INFO: renamed from: i */
    public VText f17169i;

    /* JADX INFO: renamed from: j */
    public VButton f17170j;

    /* JADX INFO: renamed from: k */
    public Act f17171k;

    public VCodeCaptchaView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m29508m0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m29510r0(y20 y20Var, View view) {
        m29512p0(y20Var);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m29511o0(View view) {
        jxk0.m147364a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m29511o0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m29512p0(final y20<Pair<String, String>> y20Var) {
        this.f17171k.duringCreated(AccountModule.f16756c.m29313W0()).subscribe(psd0.m173597H(new y20() { // from class: l.hxk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112022a.m29513q0(y20Var, (CaptchaData) obj);
            }
        }, new y20() { // from class: l.ixk0
            @Override // p153l.y20
            public final void call(Object obj) {
                VCodeCaptchaView.m29508m0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m29513q0(y20 y20Var, CaptchaData captchaData) {
        m29518w0(this.f17171k, captchaData, y20Var);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m29514s0(final y20 y20Var, VImage vImage) {
        vImage.setOnClickListener(new View.OnClickListener() { // from class: l.gxk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f106955a.m29510r0(y20Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m29515t0(y20 y20Var, CaptchaData captchaData, uxj0 uxj0Var) {
        bnl0.m105524M(this.f17169i, false);
        y20Var.call(Pair.create(captchaData.token, this.f17168h.getText().toString().trim()));
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m29516u0(y20 y20Var, Throwable th) {
        m29512p0(y20Var);
        if ((th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).code == 400003) {
            bnl0.m105524M(this.f17169i, true);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m29517v0(Act act, final CaptchaData captchaData, final y20 y20Var, View view) {
        i4g0.m138520r("e_intl_captcha_confirm", "p_intl_captcha_popup");
        act.duringCreated(AccountModule.f16756c.m29284H0(captchaData.token, this.f17168h.getText().toString().trim())).subscribe(psd0.m173597H(new y20() { // from class: l.exk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96297a.m29515t0(y20Var, captchaData, (uxj0) obj);
            }
        }, new y20() { // from class: l.fxk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101272a.m29516u0(y20Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w0 */
    public void m29518w0(final Act act, final CaptchaData captchaData, final y20<Pair<String, String>> y20Var) {
        this.f17171k = act;
        try {
            byte[] bArrDecode = Base64.decode(captchaData.images.chars.content.split(Constants.SEPARATOR_COMMA)[1], 0);
            this.f17166f.setImageBitmap(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            this.f17166f.setImageResource(a9c0.f69030o);
        }
        this.f17168h.setText("");
        jyb.m147537z(jyb.m147507f0(this.f17167g, this.f17166f), new y20() { // from class: l.cxk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84251a.m29514s0(y20Var, (VImage) obj);
            }
        });
        bnl0.m105509E0(this.f17170j, new View.OnClickListener() { // from class: l.dxk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f91091a.m29517v0(act, captchaData, y20Var, view);
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
