package p153l;

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
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.TTCMigrateGuideConfig;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.VerifyData;
import com.p051p1.mobile.putong.data.VerifyReason;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import java.util.regex.Pattern;
import org.slf4j.Marker;
import p137rx.C22421c;
import p151v.VButton;
import p151v.VEditText;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class mz2 {

    /* JADX INFO: renamed from: a */
    public VText_Bold f139453a;

    /* JADX INFO: renamed from: b */
    public VText f139454b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f139455c;

    /* JADX INFO: renamed from: d */
    public VText_Medium f139456d;

    /* JADX INFO: renamed from: e */
    public VEditText f139457e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f139458f;

    /* JADX INFO: renamed from: g */
    public VEditText f139459g;

    /* JADX INFO: renamed from: h */
    public VText_Medium f139460h;

    /* JADX INFO: renamed from: i */
    public VText f139461i;

    /* JADX INFO: renamed from: j */
    public VButton f139462j;

    /* JADX INFO: renamed from: k */
    public VText_Medium f139463k;

    /* JADX INFO: renamed from: l */
    public kcg0 f139464l = null;

    /* JADX INFO: renamed from: m */
    public kcg0 f139465m = null;

    /* JADX INFO: renamed from: n */
    public final String f139466n = "p_intl_verify_phone";

    /* JADX INFO: renamed from: o */
    public final String f139467o = "e_intl_verify_phone";

    /* JADX INFO: renamed from: p */
    public final String f139468p = "e_intl_verify_phone_skip";

    /* JADX INFO: renamed from: q */
    public final l4g0 f139469q = w1e.m204399c("p_intl_verify_phone", mz2.class.getName());

    /* JADX INFO: renamed from: r */
    public Dialog f139470r;

    /* JADX INFO: renamed from: s */
    public final Act f139471s;

    /* JADX INFO: renamed from: t */
    public TTCMigrateGuideConfig f139472t;

    /* JADX INFO: renamed from: l.mz2$a */
    public class C18748a extends ClickableSpan {
        public C18748a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (mz2.this.f139471s instanceof MessagesAct) {
                CoreModule.m30929H().mo29166ji(mz2.this.f139471s, false, "messageDeeplink", "");
            } else {
                CoreModule.m30929H().mo29166ji(mz2.this.f139471s, false, "home", "");
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(mz2.this.f139471s.getColor(c9c0.f80348K));
        }
    }

    public mz2(Act act) {
        this.f139471s = act;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m160815d(Throwable th) {
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m160830s(Throwable th) {
    }

    /* JADX INFO: renamed from: A */
    public final void m160834A() {
        m160837D(this.f139470r);
        i4g0.m138520r("e_intl_verify_phone_skip", "p_intl_verify_phone");
        this.f139470r.dismiss();
    }

    /* JADX INFO: renamed from: B */
    public final ClickableSpan m160835B() {
        return new C18748a();
    }

    /* JADX INFO: renamed from: C */
    public void m160836C() {
        Dialog dialog = this.f139470r;
        if (dialog == null) {
            return;
        }
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: D */
    public final void m160837D(Dialog dialog) {
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
            CrashHelper.m82479c(e);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: E */
    public final void m160838E(String str, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Drawable drawable = this.f139471s.drawable(dbc0.f86738Xp);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        ImageSpan imageSpan = new ImageSpan(drawable);
        SpannableString spannableString = new SpannableString("图片");
        spannableString.setSpan(imageSpan, 0, 2, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        SpannableString spannableString2 = new SpannableString(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str);
        if (z) {
            m160841H(spannableString2);
        }
        spannableStringBuilder.append((CharSequence) spannableString2);
        this.f139461i.setText(spannableStringBuilder);
        bnl0.m105525M0(this.f139461i, true);
    }

    /* JADX INFO: renamed from: F */
    public final int m160839F() {
        return !TextUtils.isEmpty(this.f139456d.getText()) ? Integer.parseInt(this.f139456d.getText().toString().substring(1)) : nsb.f143476d.get(0).f143479b;
    }

    /* JADX INFO: renamed from: G */
    public final Dialog m160840G(Act act, View view) {
        Dialog.C4460e c4460eM21519P = act.dialog().m21515L(agc0.f71129o).m21519P(view, false);
        int i = qa00.f156329p;
        return c4460eM21519P.m21497C(i, 0, i, qa00.m175859d(80.0f)).m21495B(true).m21566z();
    }

    /* JADX INFO: renamed from: H */
    public final void m160841H(SpannableString spannableString) {
        String string = this.f139471s.getString(R$string.f19834yg);
        String string2 = this.f139471s.getString(R$string.f19803xg);
        int iIndexOf = string.indexOf(string2);
        int length = string2.length() + iIndexOf;
        ClickableSpan clickableSpanM160835B = m160835B();
        if (iIndexOf >= 0) {
            spannableString.setSpan(clickableSpanM160835B, iIndexOf + 1, length + 1, 33);
            this.f139461i.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m160842I() {
        this.f139465m = this.f139471s.duringCreated(this.f139457e.mo29616h()).subscribe(psd0.m173596G(new y20() { // from class: l.jz2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123219a.m160850Q((CharSequence) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J */
    public final void m160843J() {
        bnl0.m105509E0(this.f139462j, new View.OnClickListener() { // from class: l.sy2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171207a.m160851R(view);
            }
        });
        this.f139471s.duringCreated(C22421c.combineLatest(this.f139459g.mo29616h(), this.f139457e.mo29616h(), new rcj() { // from class: l.ty2
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return new pf60((CharSequence) obj, (CharSequence) obj2);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.uy2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181532a.m160852S((pf60) obj);
            }
        }, new y20() { // from class: l.vy2
            @Override // p153l.y20
            public final void call(Object obj) {
                mz2.m160815d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public final void m160844K() {
        this.f139459g.setEnabled(false);
        bnl0.m105591y(this.f139460h, false);
        bnl0.m105509E0(this.f139460h, new View.OnClickListener() { // from class: l.kz2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f129381a.m160853T(view);
            }
        });
        this.f139464l = this.f139471s.duringCreated(this.f139459g.mo29616h()).subscribe(psd0.m173596G(new y20() { // from class: l.lz2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134155a.m160854U((CharSequence) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public final void m160845L() {
        bnl0.m105509E0(this.f139463k, new View.OnClickListener() { // from class: l.gz2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107137a.m160855V(view);
            }
        });
        if (!jyb.m147479J(nsb.f143476d) && NullChecker.m82486a(nsb.f143476d.get(0)) && nsb.f143476d.get(0).f143479b != 0) {
            this.f139456d.setText(Marker.ANY_NON_NULL_MARKER + nsb.f143476d.get(0).f143479b);
        }
        bnl0.m105509E0(this.f139456d, new View.OnClickListener() { // from class: l.hz2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f112187a.m160856W(view);
            }
        });
        bnl0.m105509E0(this.f139458f, new View.OnClickListener() { // from class: l.iz2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117655a.m160857X(view);
            }
        });
        m160844K();
        m160843J();
        m160842I();
    }

    /* JADX INFO: renamed from: M */
    public final boolean m160846M(Act act) {
        return (this.f139470r == null || act == null || act.isFinishing() || act.isDestroyed()) ? false : true;
    }

    /* JADX INFO: renamed from: N */
    public boolean m160847N() {
        Dialog dialog = this.f139470r;
        if (dialog == null) {
            return false;
        }
        return dialog.isShowing();
    }

    /* JADX INFO: renamed from: O */
    public final boolean m160848O() {
        if (!l51.m152882B(this.f139470r.getClass().getName())) {
            if (m160875y(this.f139457e.getText().toString(), m160839F() == 86)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m160849P(String str) {
        this.f139456d.setText(str);
        m160874x();
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m160850Q(CharSequence charSequence) {
        m160874x();
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m160851R(View view) {
        m160872m0();
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m160852S(pf60 pf60Var) {
        bnl0.m105591y(this.f139462j, !(TextUtils.isEmpty((CharSequence) pf60Var.f152156a) || TextUtils.isEmpty((CharSequence) pf60Var.f152157b)));
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m160853T(View view) {
        m160870k0();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m160854U(CharSequence charSequence) {
        bnl0.m105524M(this.f139461i, false);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m160855V(View view) {
        m160834A();
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m160856W(View view) {
        m160876z();
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m160857X(View view) {
        this.f139457e.setText("");
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C22421c m160858Y(uxj0 uxj0Var) {
        if (!m160846M(this.f139471s)) {
            return C22421c.error(null);
        }
        this.f139459g.setEnabled(true);
        this.f139459g.requestFocus();
        bnl0.m105591y(this.f139460h, false);
        this.f139460h.setText(R$string.f19318hp);
        return l51.m152894N(this.f139470r.getClass().getName(), 60);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m160859Z(Long l2) {
        int iIntValue;
        if (!m160846M(this.f139471s) || (iIntValue = 60 - l2.intValue()) <= 0) {
            return;
        }
        this.f139460h.setText(this.f139471s.getString(R$string.f18302Ag) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + String.format(Locale.getDefault(), "%d%s", Integer.valueOf(iIntValue), this.f139471s.getString(R$string.f19537ot)));
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m160860a0(Throwable th) {
        if (m160846M(this.f139471s)) {
            this.f139460h.setText(R$string.f18302Ag);
            bnl0.m105591y(this.f139460h, false);
            this.f139459g.setEnabled(false);
            if (!(th instanceof TantanException.Client.AccountService)) {
                bsj0.m106249G(th);
                return;
            }
            int i = ((TantanException.Client.AccountService) th).code;
            if (i == 40000) {
                bsj0.m106249G(th);
            } else if (bsj0.m106276l(i) == null) {
                bsj0.m106249G(th);
            }
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m160861b0() {
        this.f139460h.setText(R$string.f18302Ag);
        bnl0.m105591y(this.f139460h, !this.f139457e.getText().toString().isEmpty());
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m160862c0(CharSequence charSequence) {
        bnl0.m105524M(this.f139461i, false);
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m160863d0(DialogInterface dialogInterface) {
        m160868i0();
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m160864e0(TTCMigrateGuideConfig tTCMigrateGuideConfig, Long l2) {
        long jIntValue = (tTCMigrateGuideConfig.skipTime - l2.intValue()) - 1;
        if (jIntValue > 0) {
            this.f139463k.setText(this.f139471s.getString(R$string.f18333Bg) + " (" + jIntValue + "s)");
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m160865f0() {
        this.f139463k.setText(this.f139471s.getString(R$string.f18333Bg));
        bnl0.m105591y(this.f139463k, true);
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m160866g0(Throwable th) {
        int i;
        if (m160846M(this.f139471s)) {
            this.f139471s.progressDismiss();
            if (!(th instanceof TantanException.Client.AccountService) || (i = ((TantanException.Client.AccountService) th).code) == 40000) {
                bsj0.m106249G(th);
            } else {
                Act act = this.f139471s;
                if (i == 40011) {
                    m160838E(act.getString(R$string.f19834yg), true);
                } else {
                    m160838E(act.getString(R$string.f19865zg), false);
                }
            }
        }
        i4g0.m138523u("e_intl_verify_phone", "p_intl_verify_phone", pf60.m172085a("verify_result", "fail"));
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m160867h0(uxj0 uxj0Var) {
        if (m160846M(this.f139471s)) {
            this.f139471s.progressDismiss();
            m160837D(this.f139470r);
            CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
            l51.m152891K(this.f139470r.getClass().getName());
            o1j0.m165651y(this.f139471s.string(R$string.f18364Cg));
            this.f139470r.dismiss();
            i4g0.m138523u("e_intl_verify_phone", "p_intl_verify_phone", pf60.m172085a("verify_result", "success"));
            CoreModule.f18264c.f20339Q0.m115262A3(true);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m160868i0() {
        this.f139469q.m152776k();
        this.f139469q.m152775j();
        psd0.m173633z(this.f139464l);
        psd0.m173633z(this.f139465m);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m160869j0() {
        String str;
        l4g0 l4g0Var = this.f139469q;
        if (l4g0Var != null) {
            l4g0Var.m152774i();
            int i = this.f139472t.dlgType;
            if (i == 1) {
                str = "mild";
            } else if (i == 2) {
                str = "intensification";
            } else {
                str = i == 3 ? "enforcement" : "";
            }
            this.f139469q.m152781p(pf60.m172085a("verify_popup_type", str));
            this.f139469q.m152777l();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m160870k0() {
        VerifyData verifyData = new VerifyData();
        verifyData.language = q8g0.m175820y();
        verifyData.action = VerifyReason.get(VerifyReason.bind_mobile);
        verifyData.codeLength = 6;
        verifyData.countryCode = bsj0.m106251I(this.f139456d);
        verifyData.mobileNumber = bsj0.m106255M(this.f139457e);
        bnl0.m105591y(this.f139460h, false);
        this.f139460h.setText("...");
        this.f139471s.duringCreated((C22421c) CoreModule.m30929H().send(verifyData).flatMap(new qcj() { // from class: l.yy2
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f202073a.m160858Y((uxj0) obj);
            }
        })).subscribe(psd0.m173599J(new y20() { // from class: l.zy2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f206547a.m160859Z((Long) obj);
            }
        }, new y20() { // from class: l.az2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f74071a.m160860a0((Throwable) obj);
            }
        }, new x20() { // from class: l.cz2
            @Override // p153l.x20
            public final void call() {
                this.f84417a.m160861b0();
            }
        }, false));
        this.f139471s.duringCreated(this.f139459g.mo29616h()).subscribe(psd0.m173596G(new y20() { // from class: l.dz2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91319a.m160862c0((CharSequence) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l0 */
    public void m160871l0(final TTCMigrateGuideConfig tTCMigrateGuideConfig) {
        if (tTCMigrateGuideConfig == null) {
            return;
        }
        this.f139472t = tTCMigrateGuideConfig;
        Dialog dialogM160840G = m160840G(this.f139471s, m160873w(p9r.m171370a(this.f139471s), null));
        this.f139470r = dialogM160840G;
        dialogM160840G.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.qy2
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f160090a.m160863d0(dialogInterface);
            }
        });
        this.f139470r.setCanceledOnTouchOutside(false);
        this.f139470r.setCancelable(false);
        if (tTCMigrateGuideConfig.dlgType == 2) {
            this.f139463k.setText(this.f139471s.getString(R$string.f18333Bg) + " (" + tTCMigrateGuideConfig.skipTime + "s)");
        }
        m160845L();
        this.f139470r.show();
        m160869j0();
        int i = tTCMigrateGuideConfig.dlgType;
        if (i != 1) {
            if (i == 2) {
                bnl0.m105591y(this.f139463k, false);
                this.f139471s.duringCreated(l51.m152894N(String.valueOf(this.f139463k.getId()), tTCMigrateGuideConfig.skipTime + 1)).subscribe(psd0.m173598I(new y20() { // from class: l.bz2
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f79090a.m160864e0(tTCMigrateGuideConfig, (Long) obj);
                    }
                }, new y20() { // from class: l.ez2
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        mz2.m160830s((Throwable) obj);
                    }
                }, new x20() { // from class: l.fz2
                    @Override // p153l.x20
                    public final void call() {
                        this.f101439a.m160865f0();
                    }
                }));
            } else if (i == 3) {
                bnl0.m105524M(this.f139463k, false);
            }
        }
        CoreModule.f18264c.f20369a0.f170921T.put(Integer.valueOf(tTCMigrateGuideConfig.dlgType));
    }

    /* JADX INFO: renamed from: m0 */
    public final void m160872m0() {
        this.f139471s.progress(R$string.f18632L5);
        VerifyData verifyDataNew_ = VerifyData.new_();
        verifyDataNew_.code = bsj0.m106251I(this.f139459g);
        verifyDataNew_.action = VerifyReason.get(VerifyReason.bind_mobile_force_login);
        verifyDataNew_.codeLength = 6;
        verifyDataNew_.countryCode = bsj0.m106251I(this.f139456d);
        verifyDataNew_.mobileNumber = bsj0.m106255M(this.f139457e);
        verifyDataNew_.forceLogin = true;
        this.f139471s.duringCreated(CoreModule.m30929H().verify(verifyDataNew_)).subscribe(psd0.m173600K(new y20() { // from class: l.wy2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191566a.m160867h0((uxj0) obj);
            }
        }, new y20() { // from class: l.xy2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196710a.m160866g0((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: w */
    public View m160873w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return nz2.m165365b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: x */
    public final void m160874x() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f139457e.getText().toString());
        VText_Medium vText_Medium = this.f139460h;
        if (zIsEmpty) {
            bnl0.m105591y(vText_Medium, false);
            bnl0.m105524M(this.f139458f, false);
        } else {
            bnl0.m105591y(vText_Medium, m160848O());
            bnl0.m105524M(this.f139458f, true);
        }
        bnl0.m105524M(this.f139461i, false);
    }

    /* JADX INFO: renamed from: y */
    public final boolean m160875y(String str, boolean z) {
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
    public final void m160876z() {
        CoreModule.m30929H().mo29150Aq(this.f139471s, new y20() { // from class: l.ry2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f165395a.m160849P((String) obj);
            }
        });
    }
}
