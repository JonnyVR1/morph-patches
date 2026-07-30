package p003l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.data.CoreGiftPanelName;
import com.p000p1.mobile.putong.core.data.TTCMigrateGuideConfig;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.p1.mobile.putong.core.ui.VText_Medium;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.data.VerifyData;
import com.p1.mobile.putong.data.VerifyReason;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import java.util.regex.Pattern;
import l.c4g0;
import l.cwf0;
import l.d30;
import l.e30;
import l.e51;
import l.i0e;
import l.i0g0;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.o7r;
import l.roj0;
import l.t100;
import l.v7c0;
import l.vwb;
import l.w0c0;
import l.w9j;
import l.x2c0;
import l.x9j;
import l.xdl0;
import l.yij0;
import l.zqb;
import l.zvf0;
import rx.c;
import v.VButton;
import v.VEditText;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class xy2 {

    /* JADX INFO: renamed from: a */
    public VText_Bold f8594a;

    /* JADX INFO: renamed from: b */
    public VText f8595b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f8596c;

    /* JADX INFO: renamed from: d */
    public VText_Medium f8597d;

    /* JADX INFO: renamed from: e */
    public VEditText f8598e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f8599f;

    /* JADX INFO: renamed from: g */
    public VEditText f8600g;

    /* JADX INFO: renamed from: h */
    public VText_Medium f8601h;

    /* JADX INFO: renamed from: i */
    public VText f8602i;

    /* JADX INFO: renamed from: j */
    public VButton f8603j;

    /* JADX INFO: renamed from: k */
    public VText_Medium f8604k;

    /* JADX INFO: renamed from: l */
    public c4g0 f8605l = null;

    /* JADX INFO: renamed from: m */
    public c4g0 f8606m = null;

    /* JADX INFO: renamed from: n */
    public final String f8607n = "p_intl_verify_phone";

    /* JADX INFO: renamed from: o */
    public final String f8608o = "e_intl_verify_phone";

    /* JADX INFO: renamed from: p */
    public final String f8609p = "e_intl_verify_phone_skip";

    /* JADX INFO: renamed from: q */
    public final cwf0 f8610q = i0e.c("p_intl_verify_phone", xy2.class.getName());

    /* JADX INFO: renamed from: r */
    public Dialog f8611r;

    /* JADX INFO: renamed from: s */
    public final Act f8612s;

    /* JADX INFO: renamed from: t */
    public TTCMigrateGuideConfig f8613t;

    /* JADX INFO: renamed from: l.xy2$a */
    public class C3487a extends ClickableSpan {
        public C3487a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (xy2.this.f8612s instanceof MessagesAct) {
                CoreModule.H().ji(xy2.this.f8612s, false, "messageDeeplink", "");
            } else {
                CoreModule.H().ji(xy2.this.f8612s, false, CoreGiftPanelName.home, "");
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(xy2.this.f8612s.getColor(w0c0.K));
        }
    }

    public xy2(Act act) {
        this.f8612s = act;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m11003d(Throwable th) {
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m11018s(Throwable th) {
    }

    /* JADX INFO: renamed from: A */
    public final void m11022A() {
        m11025D(this.f8611r);
        zvf0.r("e_intl_verify_phone_skip", "p_intl_verify_phone");
        this.f8611r.dismiss();
    }

    /* JADX INFO: renamed from: B */
    public final ClickableSpan m11023B() {
        return new C3487a();
    }

    /* JADX INFO: renamed from: C */
    public void m11024C() {
        Dialog dialog = this.f8611r;
        if (dialog == null) {
            return;
        }
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: D */
    public final void m11025D(Dialog dialog) {
        try {
            Window window = dialog.getWindow();
            InputMethodManager inputMethodManager = (InputMethodManager) dialog.getContext().getSystemService("input_method");
            if (window == null || inputMethodManager == null) {
                return;
            }
            window.setSoftInputMode(2);
            if (window.getCurrentFocus() != null) {
                inputMethodManager.hideSoftInputFromWindow(window.getCurrentFocus().getWindowToken(), 0);
            } else {
                inputMethodManager.hideSoftInputFromWindow(window.getDecorView().getWindowToken(), 0);
            }
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m11026E(String str, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Drawable drawable = this.f8612s.drawable(x2c0.jp);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        ImageSpan imageSpan = new ImageSpan(drawable);
        SpannableString spannableString = new SpannableString("图片");
        spannableString.setSpan(imageSpan, 0, 2, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        SpannableString spannableString2 = new SpannableString(" " + str);
        if (z) {
            m11029H(spannableString2);
        }
        spannableStringBuilder.append((CharSequence) spannableString2);
        this.f8602i.setText(spannableStringBuilder);
        xdl0.M0(this.f8602i, true);
    }

    /* JADX INFO: renamed from: F */
    public final int m11027F() {
        return !TextUtils.isEmpty(this.f8597d.getText()) ? Integer.parseInt(this.f8597d.getText().toString().substring(1)) : ((zqb) zqb.d.get(0)).b;
    }

    /* JADX INFO: renamed from: G */
    public final Dialog m11028G(Act act, View view) {
        Dialog.e eVarP = act.dialog().L(v7c0.o).P(view, false);
        int i = t100.p;
        return eVarP.C(i, 0, i, t100.d(80.0f)).B(true).z();
    }

    /* JADX INFO: renamed from: H */
    public final void m11029H(SpannableString spannableString) {
        String string = this.f8612s.getString(R.string.fg);
        String string2 = this.f8612s.getString(R.string.eg);
        int iIndexOf = string.indexOf(string2);
        int length = string2.length() + iIndexOf;
        ClickableSpan clickableSpanM11023B = m11023B();
        if (iIndexOf >= 0) {
            spannableString.setSpan(clickableSpanM11023B, iIndexOf + 1, length + 1, 33);
            this.f8602i.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m11030I() {
        this.f8606m = this.f8612s.duringCreated(this.f8598e.h()).subscribe(mkd0.G(new e30() { // from class: l.uy2
            public final void call(Object obj) {
                this.f7840a.m11038Q((CharSequence) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J */
    public final void m11031J() {
        xdl0.E0(this.f8603j, new View.OnClickListener() { // from class: l.dy2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4237a.m11039R(view);
            }
        });
        this.f8612s.duringCreated(c.combineLatest(this.f8600g.h(), this.f8598e.h(), new x9j() { // from class: l.ey2
            public final Object call(Object obj, Object obj2) {
                return new j760((CharSequence) obj, (CharSequence) obj2);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.fy2
            public final void call(Object obj) {
                this.f4525a.m11040S((j760) obj);
            }
        }, new e30() { // from class: l.gy2
            public final void call(Object obj) {
                xy2.m11003d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public final void m11032K() {
        this.f8600g.setEnabled(false);
        xdl0.y(this.f8601h, false);
        xdl0.E0(this.f8601h, new View.OnClickListener() { // from class: l.vy2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8099a.m11041T(view);
            }
        });
        this.f8605l = this.f8612s.duringCreated(this.f8600g.h()).subscribe(mkd0.G(new e30() { // from class: l.wy2
            public final void call(Object obj) {
                this.f8272a.m11042U((CharSequence) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public final void m11033L() {
        xdl0.E0(this.f8604k, new View.OnClickListener() { // from class: l.ry2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7252a.m11043V(view);
            }
        });
        if (!vwb.J(zqb.d) && NullChecker.a(zqb.d.get(0)) && ((zqb) zqb.d.get(0)).b != 0) {
            this.f8597d.setText("+" + ((zqb) zqb.d.get(0)).b);
        }
        xdl0.E0(this.f8597d, new View.OnClickListener() { // from class: l.sy2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7479a.m11044W(view);
            }
        });
        xdl0.E0(this.f8599f, new View.OnClickListener() { // from class: l.ty2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7640a.m11045X(view);
            }
        });
        m11032K();
        m11031J();
        m11030I();
    }

    /* JADX INFO: renamed from: M */
    public final boolean m11034M(Act act) {
        return (this.f8611r == null || act == null || act.isFinishing() || act.isDestroyed()) ? false : true;
    }

    /* JADX INFO: renamed from: N */
    public boolean m11035N() {
        Dialog dialog = this.f8611r;
        if (dialog == null) {
            return false;
        }
        return dialog.isShowing();
    }

    /* JADX INFO: renamed from: O */
    public final boolean m11036O() {
        if (!e51.B(this.f8611r.getClass().getName())) {
            if (m11063y(this.f8598e.getText().toString(), m11027F() == 86)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m11037P(String str) {
        this.f8597d.setText(str);
        m11062x();
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m11038Q(CharSequence charSequence) {
        m11062x();
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m11039R(View view) {
        m11060m0();
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m11040S(j760 j760Var) {
        xdl0.y(this.f8603j, !(TextUtils.isEmpty((CharSequence) j760Var.a) || TextUtils.isEmpty((CharSequence) j760Var.b)));
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m11041T(View view) {
        m11058k0();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m11042U(CharSequence charSequence) {
        xdl0.M(this.f8602i, false);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m11043V(View view) {
        m11022A();
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m11044W(View view) {
        m11064z();
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m11045X(View view) {
        this.f8598e.setText("");
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ c m11046Y(roj0 roj0Var) {
        if (!m11034M(this.f8612s)) {
            return c.error((Throwable) null);
        }
        this.f8600g.setEnabled(true);
        this.f8600g.requestFocus();
        xdl0.y(this.f8601h, false);
        this.f8601h.setText(R.string.Lo);
        return e51.N(this.f8611r.getClass().getName(), 60);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m11047Z(Long l2) {
        int iIntValue;
        if (!m11034M(this.f8612s) || (iIntValue = 60 - l2.intValue()) <= 0) {
            return;
        }
        this.f8601h.setText(this.f8612s.getString(R.string.hg) + " " + String.format(Locale.getDefault(), "%d%s", Integer.valueOf(iIntValue), this.f8612s.getString(R.string.Rs)));
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m11048a0(Throwable th) {
        if (m11034M(this.f8612s)) {
            this.f8601h.setText(R.string.hg);
            xdl0.y(this.f8601h, false);
            this.f8600g.setEnabled(false);
            if (!(th instanceof TantanException.Client.AccountService)) {
                yij0.G(th);
                return;
            }
            int i = ((TantanException.Client.AccountService) th).code;
            if (i == 40000) {
                yij0.G(th);
            } else if (yij0.l(i) == null) {
                yij0.G(th);
            }
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m11049b0() {
        this.f8601h.setText(R.string.hg);
        xdl0.y(this.f8601h, !this.f8598e.getText().toString().isEmpty());
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m11050c0(CharSequence charSequence) {
        xdl0.M(this.f8602i, false);
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m11051d0(DialogInterface dialogInterface) {
        m11056i0();
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m11052e0(TTCMigrateGuideConfig tTCMigrateGuideConfig, Long l2) {
        long jIntValue = (tTCMigrateGuideConfig.skipTime - l2.intValue()) - 1;
        if (jIntValue > 0) {
            this.f8604k.setText(this.f8612s.getString(R.string.ig) + " (" + jIntValue + "s)");
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m11053f0() {
        this.f8604k.setText(this.f8612s.getString(R.string.ig));
        xdl0.y(this.f8604k, true);
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m11054g0(Throwable th) {
        int i;
        if (m11034M(this.f8612s)) {
            this.f8612s.progressDismiss();
            if (!(th instanceof TantanException.Client.AccountService) || (i = ((TantanException.Client.AccountService) th).code) == 40000) {
                yij0.G(th);
            } else {
                Act act = this.f8612s;
                if (i == 40011) {
                    m11026E(act.getString(R.string.fg), true);
                } else {
                    m11026E(act.getString(R.string.gg), false);
                }
            }
        }
        zvf0.u("e_intl_verify_phone", "p_intl_verify_phone", new j760[]{j760.a("verify_result", "fail")});
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m11055h0(roj0 roj0Var) {
        if (m11034M(this.f8612s)) {
            this.f8612s.progressDismiss();
            m11025D(this.f8611r);
            CoreModule.c.e0.W9(CoreModule.H().userId());
            e51.K(this.f8611r.getClass().getName());
            lsi0.y(this.f8612s.string(R.string.jg));
            this.f8611r.dismiss();
            zvf0.u("e_intl_verify_phone", "p_intl_verify_phone", new j760[]{j760.a("verify_result", "success")});
            CoreModule.c.Q0.A3(true);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m11056i0() {
        this.f8610q.k();
        this.f8610q.j();
        mkd0.z(this.f8605l);
        mkd0.z(this.f8606m);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m11057j0() {
        String str;
        cwf0 cwf0Var = this.f8610q;
        if (cwf0Var != null) {
            cwf0Var.i();
            int i = this.f8613t.dlgType;
            if (i == 1) {
                str = "mild";
            } else if (i == 2) {
                str = "intensification";
            } else {
                str = i == 3 ? "enforcement" : "";
            }
            this.f8610q.p(new j760[]{j760.a("verify_popup_type", str)});
            this.f8610q.l();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m11058k0() {
        VerifyData verifyData = new VerifyData();
        verifyData.language = i0g0.y();
        verifyData.action = VerifyReason.get("bind_mobile");
        verifyData.codeLength = 6;
        verifyData.countryCode = yij0.I(this.f8597d);
        verifyData.mobileNumber = yij0.M(this.f8598e);
        xdl0.y(this.f8601h, false);
        this.f8601h.setText("...");
        this.f8612s.duringCreated(CoreModule.H().send(verifyData).flatMap(new w9j() { // from class: l.jy2
            public final Object call(Object obj) {
                return this.f5393a.m11046Y((roj0) obj);
            }
        })).subscribe(mkd0.J(new e30() { // from class: l.ky2
            public final void call(Object obj) {
                this.f5721a.m11047Z((Long) obj);
            }
        }, new e30() { // from class: l.ly2
            public final void call(Object obj) {
                this.f6230a.m11048a0((Throwable) obj);
            }
        }, new d30() { // from class: l.ny2
            public final void call() {
                this.f6570a.m11049b0();
            }
        }, false));
        this.f8612s.duringCreated(this.f8600g.h()).subscribe(mkd0.G(new e30() { // from class: l.oy2
            public final void call(Object obj) {
                this.f6759a.m11050c0((CharSequence) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l0 */
    public void m11059l0(final TTCMigrateGuideConfig tTCMigrateGuideConfig) {
        if (tTCMigrateGuideConfig == null) {
            return;
        }
        this.f8613t = tTCMigrateGuideConfig;
        Dialog dialogM11028G = m11028G(this.f8612s, m11061w(o7r.a(this.f8612s), null));
        this.f8611r = dialogM11028G;
        dialogM11028G.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.by2
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f3488a.m11051d0(dialogInterface);
            }
        });
        this.f8611r.setCanceledOnTouchOutside(false);
        this.f8611r.setCancelable(false);
        if (tTCMigrateGuideConfig.dlgType == 2) {
            this.f8604k.setText(this.f8612s.getString(R.string.ig) + " (" + tTCMigrateGuideConfig.skipTime + "s)");
        }
        m11033L();
        this.f8611r.show();
        m11057j0();
        int i = tTCMigrateGuideConfig.dlgType;
        if (i != 1) {
            if (i == 2) {
                xdl0.y(this.f8604k, false);
                this.f8612s.duringCreated(e51.N(String.valueOf(this.f8604k.getId()), tTCMigrateGuideConfig.skipTime + 1)).subscribe(mkd0.I(new e30() { // from class: l.my2
                    public final void call(Object obj) {
                        this.f6454a.m11052e0(tTCMigrateGuideConfig, (Long) obj);
                    }
                }, new e30() { // from class: l.py2
                    public final void call(Object obj) {
                        xy2.m11018s((Throwable) obj);
                    }
                }, new d30() { // from class: l.qy2
                    public final void call() {
                        this.f7110a.m11053f0();
                    }
                }));
            } else if (i == 3) {
                xdl0.M(this.f8604k, false);
            }
        }
        CoreModule.c.a0.T.put(Integer.valueOf(tTCMigrateGuideConfig.dlgType));
    }

    /* JADX INFO: renamed from: m0 */
    public final void m11060m0() {
        this.f8612s.progress(R.string.J5);
        VerifyData verifyDataNew_ = VerifyData.new_();
        verifyDataNew_.code = yij0.I(this.f8600g);
        verifyDataNew_.action = VerifyReason.get("bind_mobile_force_login");
        verifyDataNew_.codeLength = 6;
        verifyDataNew_.countryCode = yij0.I(this.f8597d);
        verifyDataNew_.mobileNumber = yij0.M(this.f8598e);
        verifyDataNew_.forceLogin = true;
        this.f8612s.duringCreated(CoreModule.H().verify(verifyDataNew_)).subscribe(mkd0.K(new e30() { // from class: l.hy2
            public final void call(Object obj) {
                this.f4965a.m11055h0((roj0) obj);
            }
        }, new e30() { // from class: l.iy2
            public final void call(Object obj) {
                this.f5224a.m11054g0((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: w */
    public View m11061w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return yy2.m11319b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: x */
    public final void m11062x() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f8598e.getText().toString());
        VText_Medium vText_Medium = this.f8601h;
        if (zIsEmpty) {
            xdl0.y(vText_Medium, false);
            xdl0.M(this.f8599f, false);
        } else {
            xdl0.y(vText_Medium, m11036O());
            xdl0.M(this.f8599f, true);
        }
        xdl0.M(this.f8602i, false);
    }

    /* JADX INFO: renamed from: y */
    public final boolean m11063y(String str, boolean z) {
        if (str.length() < 3) {
            return false;
        }
        if (!z) {
            return Pattern.compile("^[0-9]*$").matcher(str).matches();
        }
        if (str.length() != 11) {
            return false;
        }
        return Pattern.compile("^1[0-9]{10}$").matcher(str).matches();
    }

    /* JADX INFO: renamed from: z */
    public final void m11064z() {
        CoreModule.H().Aq(this.f8612s, new e30() { // from class: l.cy2
            public final void call(Object obj) {
                this.f4090a.m11037P((String) obj);
            }
        });
    }
}
