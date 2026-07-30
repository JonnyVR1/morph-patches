package p149l;

import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.data.VerifyData;
import com.p046p1.mobile.putong.data.VerifyReason;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Marker;
import p133rx.C22306c;
import p147v.VButton;
import p147v.VEditText;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\bJ\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\bJ\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\bJ\u001f\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\tH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0006¢\u0006\u0004\b)\u0010\bJ\r\u0010*\u001a\u00020\u0006¢\u0006\u0004\b*\u0010\bJ\r\u0010+\u001a\u00020\u0006¢\u0006\u0004\b+\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010;\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00102\u001a\u0004\b9\u00104\"\u0004\b:\u00106R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010G\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u00102\u001a\u0004\bE\u00104\"\u0004\bF\u00106R\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010S\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010J\u001a\u0004\bQ\u0010L\"\u0004\bR\u0010NR\"\u0010W\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u00102\u001a\u0004\bU\u00104\"\u0004\bV\u00106R\"\u0010[\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u00102\u001a\u0004\bY\u00104\"\u0004\bZ\u00106R\"\u0010c\u001a\u00020\\8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010g\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bd\u00102\u001a\u0004\be\u00104\"\u0004\bf\u00106R$\u0010o\u001a\u0004\u0018\u00010h8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR$\u0010s\u001a\u0004\u0018\u00010h8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bp\u0010j\u001a\u0004\bq\u0010l\"\u0004\br\u0010nR\u001a\u0010x\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR\u001a\u0010{\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\by\u0010u\u001a\u0004\bz\u0010wR\u001a\u0010~\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\b|\u0010u\u001a\u0004\b}\u0010wR\u001c\u0010\u0081\u0001\u001a\u00020\t8\u0006X\u0086D¢\u0006\r\n\u0004\b\u007f\u0010u\u001a\u0005\b\u0080\u0001\u0010wR\u0018\u0010\u0085\u0001\u001a\u00030\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001¨\u0006\u0088\u0001"}, m87232d2 = {"Ll/ccn;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", j6f.GPS_DIRECTION_TRUE, "()V", "", "phoneNumber", "", "isChinaCountryCode", BaseSei.f13931Y, "(Ljava/lang/String;Z)Z", "", "A", "()I", "J", BaseSei.f13930X, "K", "Lcom/p1/mobile/android/app/Dialog;", OMSTemplateType.dialog, BaseSei.f13932Z, "(Lcom/p1/mobile/android/app/Dialog;)V", "N", "Landroid/view/View;", "rootView", "B", "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Lcom/p1/mobile/android/app/Dialog;", j6f.GPS_MEASUREMENT_INTERRUPTED, "(Lcom/p1/mobile/android/app/Act;)Z", "eid", "Y", "(Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "w", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Z", "X", "W", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Lv/VText;", "b", "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "c", "get_subtitle", "set_subtitle", "_subtitle", "Landroid/widget/LinearLayout;", Constants.INAPP_DATA_TAG, "Landroid/widget/LinearLayout;", "get_verify", "()Landroid/widget/LinearLayout;", "set_verify", "(Landroid/widget/LinearLayout;)V", "_verify", "e", "E", "set_verify_ccode", "_verify_ccode", "Lv/VEditText;", "f", "Lv/VEditText;", "I", "()Lv/VEditText;", "set_verify_phone_num", "(Lv/VEditText;)V", "_verify_phone_num", "g", "F", "set_verify_code", "_verify_code", "h", "H", "set_verify_get_code", "_verify_get_code", RXScreenCaptureService.KEY_INDEX, "G", "set_verify_error_code", "_verify_error_code", "Lv/VButton;", "j", "Lv/VButton;", "D", "()Lv/VButton;", "set_positive_primary", "(Lv/VButton;)V", "_positive_primary", "k", b2s.C_ZONE, "set_nega", "_nega", "Ll/c4g0;", BLiveStormDanmakuGiftResourceType.f44444l, "Ll/c4g0;", "getCodeSubscribe", "()Ll/c4g0;", "setCodeSubscribe", "(Ll/c4g0;)V", "codeSubscribe", "m", "getPositiveBtSubscribe", "setPositiveBtSubscribe", "positiveBtSubscribe", "n", "Ljava/lang/String;", "getDIALOG_P_ID", "()Ljava/lang/String;", "DIALOG_P_ID", "o", "getCODE_BUTTON_E_ID", "CODE_BUTTON_E_ID", "p", "getBAND_PHONE_BUTTON_E_ID", "BAND_PHONE_BUTTON_E_ID", "q", "getPHONE_LATER_BUTTON_E_ID", "PHONE_LATER_BUTTON_E_ID", "Ll/cwf0;", "r", "Ll/cwf0;", "pageHelper", BLiveStormDanmakuGiftResourceType.f44446s, "Lcom/p1/mobile/android/app/Dialog;", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
        cwf0 cwf0VarM133794c = i0e.m133794c("p_intl_band_phone_popup", ccn.class.getName());
        cwf0VarM133794c.getClass();
        this.pageHelper = cwf0VarM133794c;
    }

    /* JADX INFO: renamed from: L */
    public static final void m106084L(ccn ccnVar, roj0 roj0Var) {
        if (ccnVar.m106127V(ccnVar.act)) {
            ccnVar.act.progressDismiss();
            CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
            Dialog dialog = ccnVar.dialog;
            Dialog dialog2 = null;
            if (dialog == null) {
                Intrinsics.m87502r(OMSTemplateType.dialog);
                dialog = null;
            }
            e51.m114746K(dialog.getClass().getName());
            lsi0.m151595y(ccnVar.act.string(R$string.f18376at));
            Dialog dialog3 = ccnVar.dialog;
            if (dialog3 == null) {
                Intrinsics.m87502r(OMSTemplateType.dialog);
                dialog3 = null;
            }
            ccnVar.m106135z(dialog3);
            Dialog dialog4 = ccnVar.dialog;
            if (dialog4 == null) {
                Intrinsics.m87502r(OMSTemplateType.dialog);
            } else {
                dialog2 = dialog4;
            }
            dialog2.dismiss();
            new hcn(ccnVar.act).m130466j();
        }
    }

    /* JADX INFO: renamed from: M */
    public static final void m106085M(ccn ccnVar, Throwable th) {
        if (ccnVar.m106127V(ccnVar.act)) {
            ccnVar.act.progressDismiss();
            if (!(th instanceof TantanException.Client.AccountService)) {
                yij0.m214929G(th);
                return;
            }
            int i = ((TantanException.Client.AccountService) th).code;
            if (i == 40000) {
                yij0.m214929G(th);
                return;
            }
            String strM214956l = yij0.m214956l(i);
            if (strM214956l == null) {
                yij0.m214929G(th);
            } else {
                xdl0.m208345M0(ccnVar.m106120G(), true);
                ccnVar.m106120G().setText(strM214956l);
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public static final C22306c m106086O(ccn ccnVar, roj0 roj0Var) {
        Dialog dialog = null;
        if (!ccnVar.m106127V(ccnVar.act)) {
            return C22306c.error(null);
        }
        ccnVar.m106119F().setEnabled(true);
        ccnVar.m106119F().requestFocus();
        xdl0.m208411y(ccnVar.m106121H(), false);
        ccnVar.m106121H().setText(R$string.f17921Lo);
        Dialog dialog2 = ccnVar.dialog;
        if (dialog2 == null) {
            Intrinsics.m87502r(OMSTemplateType.dialog);
        } else {
            dialog = dialog2;
        }
        return e51.m114749N(dialog.getClass().getName(), 60);
    }

    /* JADX INFO: renamed from: P */
    public static final C22306c m106087P(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Q */
    public static final void m106088Q(ccn ccnVar, Long l2) {
        if (ccnVar.m106127V(ccnVar.act)) {
            l2.getClass();
            long jLongValue = 60 - l2.longValue();
            if (jLongValue > 0) {
                VText vTextM106121H = ccnVar.m106121H();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                vTextM106121H.setText(String.format(Locale.getDefault(), "%d%s", Arrays.copyOf(new Object[]{Long.valueOf(jLongValue), ccnVar.act.getString(R$string.f18105Rs)}, 2)));
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public static final void m106089R(ccn ccnVar, Throwable th) {
        if (ccnVar.m106127V(ccnVar.act)) {
            ccnVar.m106121H().setText(R$string.f18963u4);
            xdl0.m208411y(ccnVar.m106121H(), false);
            ccnVar.m106119F().setEnabled(false);
            if (!(th instanceof TantanException.Client.AccountService)) {
                yij0.m214929G(th);
                return;
            }
            int i = ((TantanException.Client.AccountService) th).code;
            if (i == 40000) {
                yij0.m214929G(th);
                return;
            }
            String strM214956l = yij0.m214956l(i);
            if (strM214956l == null) {
                yij0.m214929G(th);
            } else {
                xdl0.m208345M0(ccnVar.m106120G(), true);
                ccnVar.m106120G().setText(strM214956l);
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public static final void m106090S(ccn ccnVar) {
        ccnVar.m106121H().setText(R$string.f18963u4);
        if (ccnVar.m106122I().getText().toString().length() == 0) {
            xdl0.m208411y(ccnVar.m106121H(), false);
        } else {
            xdl0.m208411y(ccnVar.m106121H(), true);
        }
    }

    /* JADX INFO: renamed from: U */
    public static final void m106091U(ccn ccnVar, String str) {
        ccnVar.m106118E().setText(str);
        ccnVar.m106133x();
    }

    /* JADX INFO: renamed from: b */
    public static void m106093b(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static void m106096e(final ccn ccnVar, View view) {
        CoreModule.m29931H().mo28151Aq(ccnVar.act, new e30() { // from class: l.vbn
            @Override // p149l.e30
            public final void call(Object obj) {
                ccn.m106091U(this.f180860a, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static void m106097f(ccn ccnVar, Pair pair) {
        if (TextUtils.isEmpty((CharSequence) pair.getFirst()) || TextUtils.isEmpty((CharSequence) pair.getSecond())) {
            xdl0.m208411y(ccnVar.m106117D(), false);
        } else {
            xdl0.m208411y(ccnVar.m106117D(), true);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m106098g(ccn ccnVar, DialogInterface dialogInterface) {
        ccnVar.m106128W();
    }

    /* JADX INFO: renamed from: i */
    public static void m106100i(ccn ccnVar, CharSequence charSequence) {
        ccnVar.m106133x();
    }

    /* JADX INFO: renamed from: k */
    public static void m106102k(Throwable th) {
    }

    /* JADX INFO: renamed from: m */
    public static void m106104m(ccn ccnVar, CharSequence charSequence) {
        xdl0.m208344M(ccnVar.m106120G(), false);
    }

    /* JADX INFO: renamed from: n */
    public static void m106105n(ccn ccnVar, View view) {
        ccnVar.m106130Y(ccnVar.PHONE_LATER_BUTTON_E_ID);
        Dialog dialog = ccnVar.dialog;
        if (dialog == null) {
            Intrinsics.m87502r(OMSTemplateType.dialog);
            dialog = null;
        }
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: p */
    public static void m106107p(ccn ccnVar) {
        ccnVar.m106121H().setText(R$string.f18963u4);
        if (TextUtils.isEmpty(ccnVar.m106122I().getText().toString())) {
            xdl0.m208411y(ccnVar.m106121H(), false);
        } else {
            xdl0.m208411y(ccnVar.m106121H(), true);
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m106108q(final ccn ccnVar, View view) {
        ccnVar.m106130Y(ccnVar.BAND_PHONE_BUTTON_E_ID);
        ccnVar.act.progress(R$string.f17842J5);
        VerifyData verifyData = new VerifyData();
        verifyData.code = yij0.m214931I(ccnVar.m106119F());
        verifyData.action = VerifyReason.get(VerifyReason.bind_mobile);
        verifyData.codeLength = 6;
        verifyData.countryCode = yij0.m214931I(ccnVar.m106118E());
        verifyData.mobileNumber = yij0.m214935M(ccnVar.m106122I());
        verifyData.forceLogin = true;
        ccnVar.act.duringCreated(CoreModule.m29931H().verify(verifyData)).subscribe(mkd0.m154959K(new e30() { // from class: l.sbn
            @Override // p149l.e30
            public final void call(Object obj) {
                ccn.m106084L(this.f163566a, (roj0) obj);
            }
        }, new e30() { // from class: l.tbn
            @Override // p149l.e30
            public final void call(Object obj) {
                ccn.m106085M(this.f169281a, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: r */
    public static Pair m106109r(CharSequence charSequence, CharSequence charSequence2) {
        return new Pair(charSequence, charSequence2);
    }

    /* JADX INFO: renamed from: s */
    public static void m106110s(final ccn ccnVar, View view) {
        ccnVar.m106130Y(ccnVar.CODE_BUTTON_E_ID);
        VerifyData verifyData = new VerifyData();
        verifyData.language = i0g0.m133885y();
        verifyData.action = VerifyReason.get(VerifyReason.bind_mobile);
        verifyData.codeLength = 6;
        verifyData.countryCode = yij0.m214931I(ccnVar.m106118E());
        verifyData.mobileNumber = yij0.m214935M(ccnVar.m106122I());
        xdl0.m208411y(ccnVar.m106121H(), false);
        ccnVar.m106121H().setText("...");
        Act act = ccnVar.act;
        C22306c<roj0> c22306cSend = CoreModule.m29931H().send(verifyData);
        final Function1 function1 = new Function1() { // from class: l.mbn
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ccn.m106086O(this.f133043a, (roj0) obj);
            }
        };
        act.duringCreated((C22306c) c22306cSend.flatMap(new w9j() { // from class: l.nbn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ccn.m106087P(function1, obj);
            }
        })).subscribe(mkd0.m154958J(new e30() { // from class: l.obn
            @Override // p149l.e30
            public final void call(Object obj) {
                ccn.m106088Q(this.f142966a, (Long) obj);
            }
        }, new e30() { // from class: l.pbn
            @Override // p149l.e30
            public final void call(Object obj) {
                ccn.m106089R(this.f148099a, (Throwable) obj);
            }
        }, new d30() { // from class: l.qbn
            @Override // p149l.d30
            public final void call() {
                ccn.m106090S(this.f153682a);
            }
        }, false));
    }

    /* JADX INFO: renamed from: t */
    public static void m106111t(Long l2) {
    }

    /* JADX INFO: renamed from: v */
    public static Pair m106113v(Function2 function2, Object obj, Object obj2) {
        return (Pair) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: A */
    public final int m106114A() {
        return !TextUtils.isEmpty(m106118E().getText()) ? Integer.parseInt(m106118E().getText().toString().substring(1)) : zqb.f204369d.get(0).f204372b;
    }

    /* JADX INFO: renamed from: B */
    public final Dialog m106115B(Act act, View rootView) {
        Dialog.C4309e c4309eM20520P = act.dialog().m20516L(v7c0.f180368o).m20520P(rootView, false);
        int i = t100.f167273v;
        Dialog dialogM20567z = c4309eM20520P.m20498C(i, 0, i, 0).m20496B(true).m20567z();
        dialogM20567z.getClass();
        return dialogM20567z;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final VText m106116C() {
        VText vText = this._nega;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_nega");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final VButton m106117D() {
        VButton vButton = this._positive_primary;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m87502r("_positive_primary");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final VText m106118E() {
        VText vText = this._verify_ccode;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_verify_ccode");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final VEditText m106119F() {
        VEditText vEditText = this._verify_code;
        if (vEditText != null) {
            return vEditText;
        }
        Intrinsics.m87502r("_verify_code");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final VText m106120G() {
        VText vText = this._verify_error_code;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_verify_error_code");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final VText m106121H() {
        VText vText = this._verify_get_code;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_verify_get_code");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final VEditText m106122I() {
        VEditText vEditText = this._verify_phone_num;
        if (vEditText != null) {
            return vEditText;
        }
        Intrinsics.m87502r("_verify_phone_num");
        return null;
    }

    /* JADX INFO: renamed from: J */
    public final void m106123J() {
        this.positiveBtSubscribe = m106122I().mo28617h().subscribe(mkd0.m154955G(new e30() { // from class: l.wbn
            @Override // p149l.e30
            public final void call(Object obj) {
                ccn.m106100i(this.f185604a, (CharSequence) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public final void m106124K() {
        xdl0.m208329E0(m106117D(), new View.OnClickListener() { // from class: l.hbn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ccn.m106108q(this.f106947a, view);
            }
        });
        C22306c<CharSequence> c22306cMo28617h = m106119F().mo28617h();
        C22306c<CharSequence> c22306cMo28617h2 = m106122I().mo28617h();
        final Function2 function2 = new Function2() { // from class: l.ibn
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ccn.m106109r((CharSequence) obj, (CharSequence) obj2);
            }
        };
        C22306c.combineLatest(c22306cMo28617h, c22306cMo28617h2, new x9j() { // from class: l.jbn
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return ccn.m106113v(function2, obj, obj2);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.kbn
            @Override // p149l.e30
            public final void call(Object obj) {
                ccn.m106097f(this.f122255a, (Pair) obj);
            }
        }, new e30() { // from class: l.lbn
            @Override // p149l.e30
            public final void call(Object obj) {
                ccn.m106102k((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N */
    public final void m106125N() {
        m106119F().setEnabled(false);
        Dialog dialog = this.dialog;
        Dialog dialog2 = null;
        if (dialog == null) {
            Intrinsics.m87502r(OMSTemplateType.dialog);
            dialog = null;
        }
        if (e51.m114737B(dialog.getClass().getName())) {
            xdl0.m208411y(m106121H(), false);
            m106121H().setText(R$string.f18963u4);
            Act act = this.act;
            Dialog dialog3 = this.dialog;
            if (dialog3 == null) {
                Intrinsics.m87502r(OMSTemplateType.dialog);
            } else {
                dialog2 = dialog3;
            }
            act.duringCreated(e51.m114749N(dialog2.getClass().getName(), 60)).subscribe(mkd0.m154957I(new e30() { // from class: l.xbn
                @Override // p149l.e30
                public final void call(Object obj) {
                    ccn.m106111t((Long) obj);
                }
            }, new e30() { // from class: l.ybn
                @Override // p149l.e30
                public final void call(Object obj) {
                    ccn.m106093b((Throwable) obj);
                }
            }, new d30() { // from class: l.zbn
                @Override // p149l.d30
                public final void call() {
                    ccn.m106107p(this.f202466a);
                }
            }));
        } else {
            Editable text = m106122I().getText();
            text.getClass();
            xdl0.m208411y(m106121H(), text.length() > 0);
        }
        xdl0.m208329E0(m106121H(), new View.OnClickListener() { // from class: l.acn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ccn.m106110s(this.f68866a, view);
            }
        });
        this.codeSubscribe = m106119F().mo28617h().subscribe(mkd0.m154955G(new e30() { // from class: l.bcn
            @Override // p149l.e30
            public final void call(Object obj) {
                ccn.m106104m(this.f74949a, (CharSequence) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T */
    public final void m106126T() {
        m106118E().setText(Marker.ANY_NON_NULL_MARKER + zqb.f204369d.get(0).f204372b);
        xdl0.m208329E0(m106118E(), new View.OnClickListener() { // from class: l.ubn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ccn.m106096e(this.f175731a, view);
            }
        });
        m106125N();
        m106124K();
        m106123J();
    }

    /* JADX INFO: renamed from: V */
    public final boolean m106127V(Act act) {
        Dialog dialog = this.dialog;
        if (dialog == null) {
            return false;
        }
        Dialog dialog2 = null;
        if (dialog == null) {
            Intrinsics.m87502r(OMSTemplateType.dialog);
            dialog = null;
        }
        if (!NullChecker.m81303a(dialog)) {
            return false;
        }
        Dialog dialog3 = this.dialog;
        if (dialog3 == null) {
            Intrinsics.m87502r(OMSTemplateType.dialog);
        } else {
            dialog2 = dialog3;
        }
        return dialog2.isShowing() && NullChecker.m81303a(act) && !act.isFinishing() && !act.isDestroyed();
    }

    /* JADX INFO: renamed from: W */
    public final void m106128W() {
        cwf0 cwf0Var = this.pageHelper;
        if (cwf0Var != null) {
            cwf0Var.m109035k();
            cwf0Var.m109034j();
        }
        mkd0.m154992z(this.codeSubscribe);
        mkd0.m154992z(this.positiveBtSubscribe);
    }

    /* JADX INFO: renamed from: X */
    public final void m106129X() {
        cwf0 cwf0Var = this.pageHelper;
        if (cwf0Var != null) {
            cwf0Var.m109033i();
            cwf0Var.m109036l();
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m106130Y(String eid) {
        zvf0.m220396r(eid, this.DIALOG_P_ID);
    }

    /* JADX INFO: renamed from: Z */
    public final void m106131Z() {
        LayoutInflater layoutInflaterM163037a = o7r.m163037a(this.act);
        layoutInflaterM163037a.getClass();
        Dialog dialog = null;
        this.dialog = m106115B(this.act, m106132w(layoutInflaterM163037a, null));
        xdl0.m208329E0(m106116C(), new View.OnClickListener() { // from class: l.gbn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ccn.m106105n(this.f101881a, view);
            }
        });
        Dialog dialog2 = this.dialog;
        if (dialog2 == null) {
            Intrinsics.m87502r(OMSTemplateType.dialog);
            dialog2 = null;
        }
        dialog2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.rbn
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ccn.m106098g(this.f158644a, dialogInterface);
            }
        });
        m106126T();
        Dialog dialog3 = this.dialog;
        if (dialog3 == null) {
            Intrinsics.m87502r(OMSTemplateType.dialog);
        } else {
            dialog = dialog3;
        }
        dialog.show();
        m106129X();
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final View m106132w(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM110863b = dcn.m110863b(this, inflater, parent);
        viewM110863b.getClass();
        return viewM110863b;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    /* JADX INFO: renamed from: x */
    public final void m106133x() {
        if (m106122I().getText().toString().length() == 0) {
            xdl0.m208411y(m106121H(), false);
        } else {
            Dialog dialog = this.dialog;
            if (dialog == null) {
                Intrinsics.m87502r(OMSTemplateType.dialog);
                dialog = null;
            }
            if (e51.m114737B(dialog.getClass().getName())) {
                xdl0.m208411y(m106121H(), false);
            } else {
                if (m106134y(m106122I().getText().toString(), m106114A() == 86)) {
                    xdl0.m208411y(m106121H(), true);
                } else {
                    xdl0.m208411y(m106121H(), false);
                }
            }
        }
        xdl0.m208344M(m106120G(), false);
    }

    /* JADX INFO: renamed from: y */
    public final boolean m106134y(String phoneNumber, boolean isChinaCountryCode) {
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
    public final void m106135z(Dialog dialog) {
        try {
            Window window = dialog.getWindow();
            Object systemService = dialog.getContext().getSystemService("input_method");
            systemService.getClass();
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            if (NullChecker.m81303a(window) && NullChecker.m81303a(inputMethodManager)) {
                window.getClass();
                window.setSoftInputMode(2);
                if (!NullChecker.m81303a(window.getCurrentFocus())) {
                    inputMethodManager.hideSoftInputFromWindow(window.getDecorView().getWindowToken(), 0);
                    return;
                }
                View currentFocus = window.getCurrentFocus();
                currentFocus.getClass();
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }
}
