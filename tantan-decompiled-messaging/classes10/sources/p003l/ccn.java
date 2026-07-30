package p003l;

import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.VerifyData;
import com.p1.mobile.putong.data.VerifyReason;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import l.c4g0;
import l.cwf0;
import l.d30;
import l.e30;
import l.e51;
import l.i0e;
import l.i0g0;
import l.lsi0;
import l.mkd0;
import l.o7r;
import l.roj0;
import l.szd;
import l.t100;
import l.v7c0;
import l.w9j;
import l.x9j;
import l.xdl0;
import l.yij0;
import l.zqb;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;
import v.VButton;
import v.VEditText;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\bJ\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\bJ\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\bJ\u001f\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\tH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0006¢\u0006\u0004\b)\u0010\bJ\r\u0010*\u001a\u00020\u0006¢\u0006\u0004\b*\u0010\bJ\r\u0010+\u001a\u00020\u0006¢\u0006\u0004\b+\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010;\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00102\u001a\u0004\b9\u00104\"\u0004\b:\u00106R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010G\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u00102\u001a\u0004\bE\u00104\"\u0004\bF\u00106R\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010S\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010J\u001a\u0004\bQ\u0010L\"\u0004\bR\u0010NR\"\u0010W\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u00102\u001a\u0004\bU\u00104\"\u0004\bV\u00106R\"\u0010[\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u00102\u001a\u0004\bY\u00104\"\u0004\bZ\u00106R\"\u0010c\u001a\u00020\\8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010g\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bd\u00102\u001a\u0004\be\u00104\"\u0004\bf\u00106R$\u0010o\u001a\u0004\u0018\u00010h8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR$\u0010s\u001a\u0004\u0018\u00010h8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bp\u0010j\u001a\u0004\bq\u0010l\"\u0004\br\u0010nR\u001a\u0010x\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR\u001a\u0010{\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\by\u0010u\u001a\u0004\bz\u0010wR\u001a\u0010~\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\b|\u0010u\u001a\u0004\b}\u0010wR\u001c\u0010\u0081\u0001\u001a\u00020\t8\u0006X\u0086D¢\u0006\r\n\u0004\b\u007f\u0010u\u001a\u0005\b\u0080\u0001\u0010wR\u0018\u0010\u0085\u0001\u001a\u00030\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001¨\u0006\u0088\u0001"}, d2 = {"Ll/ccn;", "", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "T", "()V", "", "phoneNumber", "", "isChinaCountryCode", "y", "(Ljava/lang/String;Z)Z", "", "A", "()I", "J", "x", "K", "Lcom/p1/mobile/android/app/Dialog;", "dialog", "z", "(Lcom/p1/mobile/android/app/Dialog;)V", "N", "Landroid/view/View;", "rootView", "B", "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Lcom/p1/mobile/android/app/Dialog;", "V", "(Lcom/p1/mobile/android/app/Act;)Z", "eid", "Y", "(Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "w", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Z", "X", "W", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Lv/VText;", "b", "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "c", "get_subtitle", "set_subtitle", "_subtitle", "Landroid/widget/LinearLayout;", "d", "Landroid/widget/LinearLayout;", "get_verify", "()Landroid/widget/LinearLayout;", "set_verify", "(Landroid/widget/LinearLayout;)V", "_verify", "e", "E", "set_verify_ccode", "_verify_ccode", "Lv/VEditText;", "f", "Lv/VEditText;", "I", "()Lv/VEditText;", "set_verify_phone_num", "(Lv/VEditText;)V", "_verify_phone_num", "g", "F", "set_verify_code", "_verify_code", "h", "H", "set_verify_get_code", "_verify_get_code", "i", "G", "set_verify_error_code", "_verify_error_code", "Lv/VButton;", "j", "Lv/VButton;", "D", "()Lv/VButton;", "set_positive_primary", "(Lv/VButton;)V", "_positive_primary", "k", "C", "set_nega", "_nega", "Ll/c4g0;", "l", "Ll/c4g0;", "getCodeSubscribe", "()Ll/c4g0;", "setCodeSubscribe", "(Ll/c4g0;)V", "codeSubscribe", "m", "getPositiveBtSubscribe", "setPositiveBtSubscribe", "positiveBtSubscribe", "n", "Ljava/lang/String;", "getDIALOG_P_ID", "()Ljava/lang/String;", "DIALOG_P_ID", "o", "getCODE_BUTTON_E_ID", "CODE_BUTTON_E_ID", "p", "getBAND_PHONE_BUTTON_E_ID", "BAND_PHONE_BUTTON_E_ID", "q", "getPHONE_LATER_BUTTON_E_ID", "PHONE_LATER_BUTTON_E_ID", "Ll/cwf0;", "r", "Ll/cwf0;", "pageHelper", "s", "Lcom/p1/mobile/android/app/Dialog;", "b_core_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
public final class ccn {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VText _title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public LinearLayout _verify;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _verify_ccode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VEditText _verify_phone_num;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VEditText _verify_code;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _verify_get_code;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VText _verify_error_code;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VButton _positive_primary;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VText _nega;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public c4g0 codeSubscribe;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public c4g0 positiveBtSubscribe;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final String DIALOG_P_ID;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final String CODE_BUTTON_E_ID;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final String BAND_PHONE_BUTTON_E_ID;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final String PHONE_LATER_BUTTON_E_ID;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final cwf0 pageHelper;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public Dialog dialog;

    public ccn(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.DIALOG_P_ID = "p_intl_band_phone_popup";
        this.CODE_BUTTON_E_ID = "e_intl_get_code_button";
        this.BAND_PHONE_BUTTON_E_ID = "e_intl_band_phone_button";
        this.PHONE_LATER_BUTTON_E_ID = "e_intl_phone_later_button";
        cwf0 cwf0VarC = i0e.c("p_intl_band_phone_popup", ccn.class.getName());
        cwf0VarC.getClass();
        this.pageHelper = cwf0VarC;
    }

    /* JADX INFO: renamed from: L */
    public static final void m5877L(ccn ccnVar, roj0 roj0Var) {
        if (ccnVar.m5920V(ccnVar.act)) {
            ccnVar.act.progressDismiss();
            CoreModule.c.e0.W9(CoreModule.H().userId());
            Dialog dialog = ccnVar.dialog;
            szd szdVar = null;
            if (dialog == null) {
                Intrinsics.r("dialog");
                dialog = null;
            }
            e51.K(dialog.getClass().getName());
            lsi0.y(ccnVar.act.string(R.string.at));
            Dialog dialog2 = ccnVar.dialog;
            if (dialog2 == null) {
                Intrinsics.r("dialog");
                dialog2 = null;
            }
            ccnVar.m5928z(dialog2);
            szd szdVar2 = ccnVar.dialog;
            if (szdVar2 == null) {
                Intrinsics.r("dialog");
            } else {
                szdVar = szdVar2;
            }
            szdVar.dismiss();
            new hcn(ccnVar.act).m6949j();
        }
    }

    /* JADX INFO: renamed from: M */
    public static final void m5878M(ccn ccnVar, Throwable th) {
        if (ccnVar.m5920V(ccnVar.act)) {
            ccnVar.act.progressDismiss();
            if (!(th instanceof TantanException.Client.AccountService)) {
                yij0.G(th);
                return;
            }
            int i = ((TantanException.Client.AccountService) th).code;
            if (i == 40000) {
                yij0.G(th);
                return;
            }
            String strL = yij0.l(i);
            if (strL == null) {
                yij0.G(th);
            } else {
                xdl0.M0(ccnVar.m5913G(), true);
                ccnVar.m5913G().setText(strL);
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public static final c m5879O(ccn ccnVar, roj0 roj0Var) {
        Dialog dialog = null;
        if (!ccnVar.m5920V(ccnVar.act)) {
            return c.error((Throwable) null);
        }
        ccnVar.m5912F().setEnabled(true);
        ccnVar.m5912F().requestFocus();
        xdl0.y(ccnVar.m5914H(), false);
        ccnVar.m5914H().setText(R.string.Lo);
        Dialog dialog2 = ccnVar.dialog;
        if (dialog2 == null) {
            Intrinsics.r("dialog");
        } else {
            dialog = dialog2;
        }
        return e51.N(dialog.getClass().getName(), 60);
    }

    /* JADX INFO: renamed from: P */
    public static final c m5880P(Function1 function1, Object obj) {
        return (c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Q */
    public static final void m5881Q(ccn ccnVar, Long l2) {
        if (ccnVar.m5920V(ccnVar.act)) {
            l2.getClass();
            long jLongValue = 60 - l2.longValue();
            if (jLongValue > 0) {
                VText vTextM5914H = ccnVar.m5914H();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                vTextM5914H.setText(String.format(Locale.getDefault(), "%d%s", Arrays.copyOf(new Object[]{Long.valueOf(jLongValue), ccnVar.act.getString(R.string.Rs)}, 2)));
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public static final void m5882R(ccn ccnVar, Throwable th) {
        if (ccnVar.m5920V(ccnVar.act)) {
            ccnVar.m5914H().setText(R.string.u4);
            xdl0.y(ccnVar.m5914H(), false);
            ccnVar.m5912F().setEnabled(false);
            if (!(th instanceof TantanException.Client.AccountService)) {
                yij0.G(th);
                return;
            }
            int i = ((TantanException.Client.AccountService) th).code;
            if (i == 40000) {
                yij0.G(th);
                return;
            }
            String strL = yij0.l(i);
            if (strL == null) {
                yij0.G(th);
            } else {
                xdl0.M0(ccnVar.m5913G(), true);
                ccnVar.m5913G().setText(strL);
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public static final void m5883S(ccn ccnVar) {
        ccnVar.m5914H().setText(R.string.u4);
        if (ccnVar.m5915I().getText().toString().length() == 0) {
            xdl0.y(ccnVar.m5914H(), false);
        } else {
            xdl0.y(ccnVar.m5914H(), true);
        }
    }

    /* JADX INFO: renamed from: U */
    public static final void m5884U(ccn ccnVar, String str) {
        ccnVar.m5911E().setText(str);
        ccnVar.m5926x();
    }

    /* JADX INFO: renamed from: b */
    public static void m5886b(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static void m5889e(final ccn ccnVar, View view) {
        CoreModule.H().Aq(ccnVar.act, new e30() { // from class: l.vbn
            public final void call(Object obj) {
                ccn.m5884U(this.f7967a, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static void m5890f(ccn ccnVar, Pair pair) {
        if (TextUtils.isEmpty((CharSequence) pair.getFirst()) || TextUtils.isEmpty((CharSequence) pair.getSecond())) {
            xdl0.y(ccnVar.m5910D(), false);
        } else {
            xdl0.y(ccnVar.m5910D(), true);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m5891g(ccn ccnVar, DialogInterface dialogInterface) {
        ccnVar.m5921W();
    }

    /* JADX INFO: renamed from: i */
    public static void m5893i(ccn ccnVar, CharSequence charSequence) {
        ccnVar.m5926x();
    }

    /* JADX INFO: renamed from: k */
    public static void m5895k(Throwable th) {
    }

    /* JADX INFO: renamed from: m */
    public static void m5897m(ccn ccnVar, CharSequence charSequence) {
        xdl0.M(ccnVar.m5913G(), false);
    }

    /* JADX INFO: renamed from: n */
    public static void m5898n(ccn ccnVar, View view) {
        ccnVar.m5923Y(ccnVar.PHONE_LATER_BUTTON_E_ID);
        szd szdVar = ccnVar.dialog;
        if (szdVar == null) {
            Intrinsics.r("dialog");
            szdVar = null;
        }
        szdVar.dismiss();
    }

    /* JADX INFO: renamed from: p */
    public static void m5900p(ccn ccnVar) {
        ccnVar.m5914H().setText(R.string.u4);
        if (TextUtils.isEmpty(ccnVar.m5915I().getText().toString())) {
            xdl0.y(ccnVar.m5914H(), false);
        } else {
            xdl0.y(ccnVar.m5914H(), true);
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m5901q(final ccn ccnVar, View view) {
        ccnVar.m5923Y(ccnVar.BAND_PHONE_BUTTON_E_ID);
        ccnVar.act.progress(R.string.J5);
        VerifyData verifyData = new VerifyData();
        verifyData.code = yij0.I(ccnVar.m5912F());
        verifyData.action = VerifyReason.get("bind_mobile");
        verifyData.codeLength = 6;
        verifyData.countryCode = yij0.I(ccnVar.m5911E());
        verifyData.mobileNumber = yij0.M(ccnVar.m5915I());
        verifyData.forceLogin = true;
        ccnVar.act.duringCreated(CoreModule.H().verify(verifyData)).subscribe(mkd0.K(new e30() { // from class: l.sbn
            public final void call(Object obj) {
                ccn.m5877L(this.f7347a, (roj0) obj);
            }
        }, new e30() { // from class: l.tbn
            public final void call(Object obj) {
                ccn.m5878M(this.f7557a, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: r */
    public static Pair m5902r(CharSequence charSequence, CharSequence charSequence2) {
        return new Pair(charSequence, charSequence2);
    }

    /* JADX INFO: renamed from: s */
    public static void m5903s(final ccn ccnVar, View view) {
        ccnVar.m5923Y(ccnVar.CODE_BUTTON_E_ID);
        VerifyData verifyData = new VerifyData();
        verifyData.language = i0g0.y();
        verifyData.action = VerifyReason.get("bind_mobile");
        verifyData.codeLength = 6;
        verifyData.countryCode = yij0.I(ccnVar.m5911E());
        verifyData.mobileNumber = yij0.M(ccnVar.m5915I());
        xdl0.y(ccnVar.m5914H(), false);
        ccnVar.m5914H().setText("...");
        Act act = ccnVar.act;
        c cVarSend = CoreModule.H().send(verifyData);
        final Function1 function1 = new Function1() { // from class: l.mbn
            public final Object invoke(Object obj) {
                return ccn.m5879O(this.f6327a, (roj0) obj);
            }
        };
        act.duringCreated(cVarSend.flatMap(new w9j() { // from class: l.nbn
            public final Object call(Object obj) {
                return ccn.m5880P(function1, obj);
            }
        })).subscribe(mkd0.J(new e30() { // from class: l.obn
            public final void call(Object obj) {
                ccn.m5881Q(this.f6644a, (Long) obj);
            }
        }, new e30() { // from class: l.pbn
            public final void call(Object obj) {
                ccn.m5882R(this.f6848a, (Throwable) obj);
            }
        }, new d30() { // from class: l.qbn
            public final void call() {
                ccn.m5883S(this.f7003a);
            }
        }, false));
    }

    /* JADX INFO: renamed from: t */
    public static void m5904t(Long l2) {
    }

    /* JADX INFO: renamed from: v */
    public static Pair m5906v(Function2 function2, Object obj, Object obj2) {
        return (Pair) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: A */
    public final int m5907A() {
        return !TextUtils.isEmpty(m5911E().getText()) ? Integer.parseInt(m5911E().getText().toString().substring(1)) : ((zqb) zqb.d.get(0)).b;
    }

    /* JADX INFO: renamed from: B */
    public final Dialog m5908B(Act act, View rootView) {
        Dialog.e eVarP = act.dialog().L(v7c0.o).P(rootView, false);
        int i = t100.v;
        Dialog dialogZ = eVarP.C(i, 0, i, 0).B(true).z();
        dialogZ.getClass();
        return dialogZ;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final VText m5909C() {
        VText vText = this._nega;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_nega");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final VButton m5910D() {
        VButton vButton = this._positive_primary;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.r("_positive_primary");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final VText m5911E() {
        VText vText = this._verify_ccode;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_verify_ccode");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final VEditText m5912F() {
        VEditText vEditText = this._verify_code;
        if (vEditText != null) {
            return vEditText;
        }
        Intrinsics.r("_verify_code");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final VText m5913G() {
        VText vText = this._verify_error_code;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_verify_error_code");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final VText m5914H() {
        VText vText = this._verify_get_code;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_verify_get_code");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final VEditText m5915I() {
        VEditText vEditText = this._verify_phone_num;
        if (vEditText != null) {
            return vEditText;
        }
        Intrinsics.r("_verify_phone_num");
        return null;
    }

    /* JADX INFO: renamed from: J */
    public final void m5916J() {
        this.positiveBtSubscribe = m5915I().h().subscribe(mkd0.G(new e30() { // from class: l.wbn
            public final void call(Object obj) {
                ccn.m5893i(this.f8153a, (CharSequence) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public final void m5917K() {
        xdl0.E0(m5910D(), new View.OnClickListener() { // from class: l.hbn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ccn.m5901q(this.f4859a, view);
            }
        });
        c cVarH = m5912F().h();
        c cVarH2 = m5915I().h();
        final Function2 function2 = new Function2() { // from class: l.ibn
            public final Object invoke(Object obj, Object obj2) {
                return ccn.m5902r((CharSequence) obj, (CharSequence) obj2);
            }
        };
        c.combineLatest(cVarH, cVarH2, new x9j() { // from class: l.jbn
            public final Object call(Object obj, Object obj2) {
                return ccn.m5906v(function2, obj, obj2);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.kbn
            public final void call(Object obj) {
                ccn.m5890f(this.f5637a, (Pair) obj);
            }
        }, new e30() { // from class: l.lbn
            public final void call(Object obj) {
                ccn.m5895k((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N */
    public final void m5918N() {
        m5912F().setEnabled(false);
        Dialog dialog = this.dialog;
        Dialog dialog2 = null;
        if (dialog == null) {
            Intrinsics.r("dialog");
            dialog = null;
        }
        if (e51.B(dialog.getClass().getName())) {
            xdl0.y(m5914H(), false);
            m5914H().setText(R.string.u4);
            Act act = this.act;
            Dialog dialog3 = this.dialog;
            if (dialog3 == null) {
                Intrinsics.r("dialog");
            } else {
                dialog2 = dialog3;
            }
            act.duringCreated(e51.N(dialog2.getClass().getName(), 60)).subscribe(mkd0.I(new e30() { // from class: l.xbn
                public final void call(Object obj) {
                    ccn.m5904t((Long) obj);
                }
            }, new e30() { // from class: l.ybn
                public final void call(Object obj) {
                    ccn.m5886b((Throwable) obj);
                }
            }, new d30() { // from class: l.zbn
                public final void call() {
                    ccn.m5900p(this.f9219a);
                }
            }));
        } else {
            Editable text = m5915I().getText();
            text.getClass();
            xdl0.y(m5914H(), text.length() > 0);
        }
        xdl0.E0(m5914H(), new View.OnClickListener() { // from class: l.acn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ccn.m5903s(this.f2775a, view);
            }
        });
        this.codeSubscribe = m5912F().h().subscribe(mkd0.G(new e30() { // from class: l.bcn
            public final void call(Object obj) {
                ccn.m5897m(this.f3364a, (CharSequence) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T */
    public final void m5919T() {
        m5911E().setText("+" + ((zqb) zqb.d.get(0)).b);
        xdl0.E0(m5911E(), new View.OnClickListener() { // from class: l.ubn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ccn.m5889e(this.f7734a, view);
            }
        });
        m5918N();
        m5917K();
        m5916J();
    }

    /* JADX INFO: renamed from: V */
    public final boolean m5920V(Act act) {
        Dialog dialog = this.dialog;
        if (dialog == null) {
            return false;
        }
        android.app.Dialog dialog2 = null;
        if (dialog == null) {
            Intrinsics.r("dialog");
            dialog = null;
        }
        if (!NullChecker.a(dialog)) {
            return false;
        }
        android.app.Dialog dialog3 = this.dialog;
        if (dialog3 == null) {
            Intrinsics.r("dialog");
        } else {
            dialog2 = dialog3;
        }
        return dialog2.isShowing() && NullChecker.a(act) && !act.isFinishing() && !act.isDestroyed();
    }

    /* JADX INFO: renamed from: W */
    public final void m5921W() {
        cwf0 cwf0Var = this.pageHelper;
        if (cwf0Var != null) {
            cwf0Var.k();
            cwf0Var.j();
        }
        mkd0.z(this.codeSubscribe);
        mkd0.z(this.positiveBtSubscribe);
    }

    /* JADX INFO: renamed from: X */
    public final void m5922X() {
        cwf0 cwf0Var = this.pageHelper;
        if (cwf0Var != null) {
            cwf0Var.i();
            cwf0Var.l();
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m5923Y(String eid) {
        zvf0.r(eid, this.DIALOG_P_ID);
    }

    /* JADX INFO: renamed from: Z */
    public final void m5924Z() {
        LayoutInflater layoutInflaterA = o7r.a(this.act);
        layoutInflaterA.getClass();
        Dialog dialog = null;
        this.dialog = m5908B(this.act, m5925w(layoutInflaterA, null));
        xdl0.E0(m5909C(), new View.OnClickListener() { // from class: l.gbn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ccn.m5898n(this.f4607a, view);
            }
        });
        szd szdVar = this.dialog;
        if (szdVar == null) {
            Intrinsics.r("dialog");
            szdVar = null;
        }
        szdVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.rbn
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ccn.m5891g(this.f7166a, dialogInterface);
            }
        });
        m5919T();
        Dialog dialog2 = this.dialog;
        if (dialog2 == null) {
            Intrinsics.r("dialog");
        } else {
            dialog = dialog2;
        }
        dialog.show();
        m5922X();
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final View m5925w(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM6104b = dcn.m6104b(this, inflater, parent);
        viewM6104b.getClass();
        return viewM6104b;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    /* JADX INFO: renamed from: x */
    public final void m5926x() {
        if (m5915I().getText().toString().length() == 0) {
            xdl0.y(m5914H(), false);
        } else {
            Dialog dialog = this.dialog;
            if (dialog == null) {
                Intrinsics.r("dialog");
                dialog = null;
            }
            if (e51.B(dialog.getClass().getName())) {
                xdl0.y(m5914H(), false);
            } else {
                if (m5927y(m5915I().getText().toString(), m5907A() == 86)) {
                    xdl0.y(m5914H(), true);
                } else {
                    xdl0.y(m5914H(), false);
                }
            }
        }
        xdl0.M(m5913G(), false);
    }

    /* JADX INFO: renamed from: y */
    public final boolean m5927y(String phoneNumber, boolean isChinaCountryCode) {
        if (phoneNumber.length() < 3) {
            return false;
        }
        if (!isChinaCountryCode) {
            return Pattern.compile("^[0-9]*$").matcher(phoneNumber).matches();
        }
        if (phoneNumber.length() != 11) {
            return false;
        }
        return Pattern.compile("^1[0-9]{10}$").matcher(phoneNumber).matches();
    }

    /* JADX INFO: renamed from: z */
    public final void m5928z(Dialog dialog) {
        try {
            Window window = dialog.getWindow();
            Object systemService = dialog.getContext().getSystemService("input_method");
            systemService.getClass();
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            if (NullChecker.a(window) && NullChecker.a(inputMethodManager)) {
                window.getClass();
                window.setSoftInputMode(2);
                if (!NullChecker.a(window.getCurrentFocus())) {
                    inputMethodManager.hideSoftInputFromWindow(window.getDecorView().getWindowToken(), 0);
                    return;
                }
                View currentFocus = window.getCurrentFocus();
                currentFocus.getClass();
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }
}
