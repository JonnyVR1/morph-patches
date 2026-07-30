package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.TTCMigrateGuideConfig;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.VerifyData;
import com.p046p1.mobile.putong.data.VerifyReason;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import java.util.regex.Pattern;
import org.slf4j.Marker;
import p133rx.C22306c;
import p147v.VButton;
import p147v.VEditText;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class xy2 {

    /* JADX INFO: renamed from: a */
    public VText_Bold f194998a;

    /* JADX INFO: renamed from: b */
    public VText f194999b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f195000c;

    /* JADX INFO: renamed from: d */
    public VText_Medium f195001d;

    /* JADX INFO: renamed from: e */
    public VEditText f195002e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f195003f;

    /* JADX INFO: renamed from: g */
    public VEditText f195004g;

    /* JADX INFO: renamed from: h */
    public VText_Medium f195005h;

    /* JADX INFO: renamed from: i */
    public VText f195006i;

    /* JADX INFO: renamed from: j */
    public VButton f195007j;

    /* JADX INFO: renamed from: k */
    public VText_Medium f195008k;

    /* JADX INFO: renamed from: l */
    public c4g0 f195009l = null;

    /* JADX INFO: renamed from: m */
    public c4g0 f195010m = null;

    /* JADX INFO: renamed from: n */
    public final String f195011n = "p_intl_verify_phone";

    /* JADX INFO: renamed from: o */
    public final String f195012o = "e_intl_verify_phone";

    /* JADX INFO: renamed from: p */
    public final String f195013p = "e_intl_verify_phone_skip";

    /* JADX INFO: renamed from: q */
    public final cwf0 f195014q = i0e.m133794c("p_intl_verify_phone", xy2.class.getName());

    /* JADX INFO: renamed from: r */
    public Dialog f195015r;

    /* JADX INFO: renamed from: s */
    public final Act f195016s;

    /* JADX INFO: renamed from: t */
    public TTCMigrateGuideConfig f195017t;

    /* JADX INFO: renamed from: l.xy2$a */
    public class C21258a extends ClickableSpan {
        public C21258a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (xy2.this.f195016s instanceof MessagesAct) {
                CoreModule.m29931H().mo28167ji(xy2.this.f195016s, false, "messageDeeplink", "");
            } else {
                CoreModule.m29931H().mo28167ji(xy2.this.f195016s, false, "home", "");
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(xy2.this.f195016s.getColor(w0c0.f183779K));
        }
    }

    public xy2(Act act) {
        this.f195016s = act;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m211661d(Throwable th) {
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m211676s(Throwable th) {
    }

    /* JADX INFO: renamed from: A */
    public final void m211680A() {
        m211683D(this.f195015r);
        zvf0.m220396r("e_intl_verify_phone_skip", "p_intl_verify_phone");
        this.f195015r.dismiss();
    }

    /* JADX INFO: renamed from: B */
    public final ClickableSpan m211681B() {
        return new C21258a();
    }

    /* JADX INFO: renamed from: C */
    public void m211682C() {
        Dialog dialog = this.f195015r;
        if (dialog == null) {
            return;
        }
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: D */
    public final void m211683D(Dialog dialog) {
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
            CrashHelper.m81296c(e);
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
    public final void m211684E(String str, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Drawable drawable = this.f195016s.drawable(x2c0.f190276jp);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        ImageSpan imageSpan = new ImageSpan(drawable);
        SpannableString spannableString = new SpannableString("图片");
        spannableString.setSpan(imageSpan, 0, 2, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        SpannableString spannableString2 = new SpannableString(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str);
        if (z) {
            m211687H(spannableString2);
        }
        spannableStringBuilder.append((CharSequence) spannableString2);
        this.f195006i.setText(spannableStringBuilder);
        xdl0.m208345M0(this.f195006i, true);
    }

    /* JADX INFO: renamed from: F */
    public final int m211685F() {
        return !TextUtils.isEmpty(this.f195001d.getText()) ? Integer.parseInt(this.f195001d.getText().toString().substring(1)) : zqb.f204369d.get(0).f204372b;
    }

    /* JADX INFO: renamed from: G */
    public final Dialog m211686G(Act act, View view) {
        Dialog.C4309e c4309eM20520P = act.dialog().m20516L(v7c0.f180368o).m20520P(view, false);
        int i = t100.f167267p;
        return c4309eM20520P.m20498C(i, 0, i, t100.m186890d(80.0f)).m20496B(true).m20567z();
    }

    /* JADX INFO: renamed from: H */
    public final void m211687H(SpannableString spannableString) {
        String string = this.f195016s.getString(R$string.f18517fg);
        String string2 = this.f195016s.getString(R$string.f18486eg);
        int iIndexOf = string.indexOf(string2);
        int length = string2.length() + iIndexOf;
        ClickableSpan clickableSpanM211681B = m211681B();
        if (iIndexOf >= 0) {
            spannableString.setSpan(clickableSpanM211681B, iIndexOf + 1, length + 1, 33);
            this.f195006i.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m211688I() {
        this.f195010m = this.f195016s.duringCreated(this.f195002e.mo28617h()).subscribe(mkd0.m154955G(new e30() { // from class: l.uy2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f178821a.m211696Q((CharSequence) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J */
    public final void m211689J() {
        xdl0.m208329E0(this.f195007j, new View.OnClickListener() { // from class: l.dy2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f88342a.m211697R(view);
            }
        });
        this.f195016s.duringCreated(C22306c.combineLatest(this.f195004g.mo28617h(), this.f195002e.mo28617h(), new x9j() { // from class: l.ey2
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return new j760((CharSequence) obj, (CharSequence) obj2);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.fy2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99825a.m211698S((j760) obj);
            }
        }, new e30() { // from class: l.gy2
            @Override // p149l.e30
            public final void call(Object obj) {
                xy2.m211661d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public final void m211690K() {
        this.f195004g.setEnabled(false);
        xdl0.m208411y(this.f195005h, false);
        xdl0.m208329E0(this.f195005h, new View.OnClickListener() { // from class: l.vy2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183490a.m211699T(view);
            }
        });
        this.f195009l = this.f195016s.duringCreated(this.f195004g.mo28617h()).subscribe(mkd0.m154955G(new e30() { // from class: l.wy2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f188538a.m211700U((CharSequence) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public final void m211691L() {
        xdl0.m208329E0(this.f195008k, new View.OnClickListener() { // from class: l.ry2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f161531a.m211701V(view);
            }
        });
        if (!vwb.m200296J(zqb.f204369d) && NullChecker.m81303a(zqb.f204369d.get(0)) && zqb.f204369d.get(0).f204372b != 0) {
            this.f195001d.setText(Marker.ANY_NON_NULL_MARKER + zqb.f204369d.get(0).f204372b);
        }
        xdl0.m208329E0(this.f195001d, new View.OnClickListener() { // from class: l.sy2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166882a.m211702W(view);
            }
        });
        xdl0.m208329E0(this.f195003f, new View.OnClickListener() { // from class: l.ty2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f172557a.m211703X(view);
            }
        });
        m211690K();
        m211689J();
        m211688I();
    }

    /* JADX INFO: renamed from: M */
    public final boolean m211692M(Act act) {
        return (this.f195015r == null || act == null || act.isFinishing() || act.isDestroyed()) ? false : true;
    }

    /* JADX INFO: renamed from: N */
    public boolean m211693N() {
        Dialog dialog = this.f195015r;
        if (dialog == null) {
            return false;
        }
        return dialog.isShowing();
    }

    /* JADX INFO: renamed from: O */
    public final boolean m211694O() {
        if (!e51.m114737B(this.f195015r.getClass().getName())) {
            if (m211721y(this.f195002e.getText().toString(), m211685F() == 86)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m211695P(String str) {
        this.f195001d.setText(str);
        m211720x();
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m211696Q(CharSequence charSequence) {
        m211720x();
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m211697R(View view) {
        m211718m0();
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m211698S(j760 j760Var) {
        xdl0.m208411y(this.f195007j, !(TextUtils.isEmpty((CharSequence) j760Var.f116564a) || TextUtils.isEmpty((CharSequence) j760Var.f116565b)));
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m211699T(View view) {
        m211716k0();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m211700U(CharSequence charSequence) {
        xdl0.m208344M(this.f195006i, false);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m211701V(View view) {
        m211680A();
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m211702W(View view) {
        m211722z();
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m211703X(View view) {
        this.f195002e.setText("");
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C22306c m211704Y(roj0 roj0Var) {
        if (!m211692M(this.f195016s)) {
            return C22306c.error(null);
        }
        this.f195004g.setEnabled(true);
        this.f195004g.requestFocus();
        xdl0.m208411y(this.f195005h, false);
        this.f195005h.setText(R$string.f17921Lo);
        return e51.m114749N(this.f195015r.getClass().getName(), 60);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m211705Z(Long l2) {
        int iIntValue;
        if (!m211692M(this.f195016s) || (iIntValue = 60 - l2.intValue()) <= 0) {
            return;
        }
        this.f195005h.setText(this.f195016s.getString(R$string.f18579hg) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + String.format(Locale.getDefault(), "%d%s", Integer.valueOf(iIntValue), this.f195016s.getString(R$string.f18105Rs)));
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m211706a0(Throwable th) {
        if (m211692M(this.f195016s)) {
            this.f195005h.setText(R$string.f18579hg);
            xdl0.m208411y(this.f195005h, false);
            this.f195004g.setEnabled(false);
            if (!(th instanceof TantanException.Client.AccountService)) {
                yij0.m214929G(th);
                return;
            }
            int i = ((TantanException.Client.AccountService) th).code;
            if (i == 40000) {
                yij0.m214929G(th);
            } else if (yij0.m214956l(i) == null) {
                yij0.m214929G(th);
            }
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m211707b0() {
        this.f195005h.setText(R$string.f18579hg);
        xdl0.m208411y(this.f195005h, !this.f195002e.getText().toString().isEmpty());
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m211708c0(CharSequence charSequence) {
        xdl0.m208344M(this.f195006i, false);
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m211709d0(DialogInterface dialogInterface) {
        m211714i0();
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m211710e0(TTCMigrateGuideConfig tTCMigrateGuideConfig, Long l2) {
        long jIntValue = (tTCMigrateGuideConfig.skipTime - l2.intValue()) - 1;
        if (jIntValue > 0) {
            this.f195008k.setText(this.f195016s.getString(R$string.f18609ig) + " (" + jIntValue + "s)");
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m211711f0() {
        this.f195008k.setText(this.f195016s.getString(R$string.f18609ig));
        xdl0.m208411y(this.f195008k, true);
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m211712g0(Throwable th) {
        int i;
        if (m211692M(this.f195016s)) {
            this.f195016s.progressDismiss();
            if (!(th instanceof TantanException.Client.AccountService) || (i = ((TantanException.Client.AccountService) th).code) == 40000) {
                yij0.m214929G(th);
            } else {
                Act act = this.f195016s;
                if (i == 40011) {
                    m211684E(act.getString(R$string.f18517fg), true);
                } else {
                    m211684E(act.getString(R$string.f18548gg), false);
                }
            }
        }
        zvf0.m220399u("e_intl_verify_phone", "p_intl_verify_phone", j760.m140076a("verify_result", "fail"));
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m211713h0(roj0 roj0Var) {
        if (m211692M(this.f195016s)) {
            this.f195016s.progressDismiss();
            m211683D(this.f195015r);
            CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
            e51.m114746K(this.f195015r.getClass().getName());
            lsi0.m151595y(this.f195016s.string(R$string.f18639jg));
            this.f195015r.dismiss();
            zvf0.m220399u("e_intl_verify_phone", "p_intl_verify_phone", j760.m140076a("verify_result", "success"));
            CoreModule.f17545c.f19597Q0.m173708A3(true);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m211714i0() {
        this.f195014q.m109035k();
        this.f195014q.m109034j();
        mkd0.m154992z(this.f195009l);
        mkd0.m154992z(this.f195010m);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m211715j0() {
        String str;
        cwf0 cwf0Var = this.f195014q;
        if (cwf0Var != null) {
            cwf0Var.m109033i();
            int i = this.f195017t.dlgType;
            if (i == 1) {
                str = "mild";
            } else if (i == 2) {
                str = "intensification";
            } else {
                str = i == 3 ? "enforcement" : "";
            }
            this.f195014q.m109040p(j760.m140076a("verify_popup_type", str));
            this.f195014q.m109036l();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m211716k0() {
        VerifyData verifyData = new VerifyData();
        verifyData.language = i0g0.m133885y();
        verifyData.action = VerifyReason.get(VerifyReason.bind_mobile);
        verifyData.codeLength = 6;
        verifyData.countryCode = yij0.m214931I(this.f195001d);
        verifyData.mobileNumber = yij0.m214935M(this.f195002e);
        xdl0.m208411y(this.f195005h, false);
        this.f195005h.setText("...");
        this.f195016s.duringCreated((C22306c) CoreModule.m29931H().send(verifyData).flatMap(new w9j() { // from class: l.jy2
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f120278a.m211704Y((roj0) obj);
            }
        })).subscribe(mkd0.m154958J(new e30() { // from class: l.ky2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125239a.m211705Z((Long) obj);
            }
        }, new e30() { // from class: l.ly2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f130490a.m211706a0((Throwable) obj);
            }
        }, new d30() { // from class: l.ny2
            @Override // p149l.d30
            public final void call() {
                this.f141076a.m211707b0();
            }
        }, false));
        this.f195016s.duringCreated(this.f195004g.mo28617h()).subscribe(mkd0.m154955G(new e30() { // from class: l.oy2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f146274a.m211708c0((CharSequence) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l0 */
    public void m211717l0(final TTCMigrateGuideConfig tTCMigrateGuideConfig) {
        if (tTCMigrateGuideConfig == null) {
            return;
        }
        this.f195017t = tTCMigrateGuideConfig;
        Dialog dialogM211686G = m211686G(this.f195016s, m211719w(o7r.m163037a(this.f195016s), null));
        this.f195015r = dialogM211686G;
        dialogM211686G.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.by2
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f77850a.m211709d0(dialogInterface);
            }
        });
        this.f195015r.setCanceledOnTouchOutside(false);
        this.f195015r.setCancelable(false);
        if (tTCMigrateGuideConfig.dlgType == 2) {
            this.f195008k.setText(this.f195016s.getString(R$string.f18609ig) + " (" + tTCMigrateGuideConfig.skipTime + "s)");
        }
        m211691L();
        this.f195015r.show();
        m211715j0();
        int i = tTCMigrateGuideConfig.dlgType;
        if (i != 1) {
            if (i == 2) {
                xdl0.m208411y(this.f195008k, false);
                this.f195016s.duringCreated(e51.m114749N(String.valueOf(this.f195008k.getId()), tTCMigrateGuideConfig.skipTime + 1)).subscribe(mkd0.m154957I(new e30() { // from class: l.my2
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f136243a.m211710e0(tTCMigrateGuideConfig, (Long) obj);
                    }
                }, new e30() { // from class: l.py2
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        xy2.m211676s((Throwable) obj);
                    }
                }, new d30() { // from class: l.qy2
                    @Override // p149l.d30
                    public final void call() {
                        this.f156897a.m211711f0();
                    }
                }));
            } else if (i == 3) {
                xdl0.m208344M(this.f195008k, false);
            }
        }
        CoreModule.f17545c.f19627a0.f151419T.put(Integer.valueOf(tTCMigrateGuideConfig.dlgType));
    }

    /* JADX INFO: renamed from: m0 */
    public final void m211718m0() {
        this.f195016s.progress(R$string.f17842J5);
        VerifyData verifyDataNew_ = VerifyData.new_();
        verifyDataNew_.code = yij0.m214931I(this.f195004g);
        verifyDataNew_.action = VerifyReason.get(VerifyReason.bind_mobile_force_login);
        verifyDataNew_.codeLength = 6;
        verifyDataNew_.countryCode = yij0.m214931I(this.f195001d);
        verifyDataNew_.mobileNumber = yij0.m214935M(this.f195002e);
        verifyDataNew_.forceLogin = true;
        this.f195016s.duringCreated(CoreModule.m29931H().verify(verifyDataNew_)).subscribe(mkd0.m154959K(new e30() { // from class: l.hy2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110024a.m211713h0((roj0) obj);
            }
        }, new e30() { // from class: l.iy2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115423a.m211712g0((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: w */
    public View m211719w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return yy2.m216512b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: x */
    public final void m211720x() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f195002e.getText().toString());
        VText_Medium vText_Medium = this.f195005h;
        if (zIsEmpty) {
            xdl0.m208411y(vText_Medium, false);
            xdl0.m208344M(this.f195003f, false);
        } else {
            xdl0.m208411y(vText_Medium, m211694O());
            xdl0.m208344M(this.f195003f, true);
        }
        xdl0.m208344M(this.f195006i, false);
    }

    /* JADX INFO: renamed from: y */
    public final boolean m211721y(String str, boolean z) {
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
    public final void m211722z() {
        CoreModule.m29931H().mo28151Aq(this.f195016s, new e30() { // from class: l.cy2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f82917a.m211695P((String) obj);
            }
        });
    }
}
