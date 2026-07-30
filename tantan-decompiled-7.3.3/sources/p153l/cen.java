package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.VerifyData;
import com.p051p1.mobile.putong.data.VerifyReason;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p137rx.C22421c;
import p151v.VButton;
import p151v.VEditText;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\bJ\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\bJ\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\bJ\u001f\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\tH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0006¢\u0006\u0004\b)\u0010\bJ\r\u0010*\u001a\u00020\u0006¢\u0006\u0004\b*\u0010\bJ\r\u0010+\u001a\u00020\u0006¢\u0006\u0004\b+\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010;\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00102\u001a\u0004\b9\u00104\"\u0004\b:\u00106R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010G\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u00102\u001a\u0004\bE\u00104\"\u0004\bF\u00106R\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010S\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010J\u001a\u0004\bQ\u0010L\"\u0004\bR\u0010NR\"\u0010W\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u00102\u001a\u0004\bU\u00104\"\u0004\bV\u00106R\"\u0010[\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u00102\u001a\u0004\bY\u00104\"\u0004\bZ\u00106R\"\u0010c\u001a\u00020\\8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010g\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bd\u00102\u001a\u0004\be\u00104\"\u0004\bf\u00106R$\u0010o\u001a\u0004\u0018\u00010h8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR$\u0010s\u001a\u0004\u0018\u00010h8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bp\u0010j\u001a\u0004\bq\u0010l\"\u0004\br\u0010nR\u001a\u0010x\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR\u001a\u0010{\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\by\u0010u\u001a\u0004\bz\u0010wR\u001a\u0010~\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\b|\u0010u\u001a\u0004\b}\u0010wR\u001c\u0010\u0081\u0001\u001a\u00020\t8\u0006X\u0086D¢\u0006\r\n\u0004\b\u007f\u0010u\u001a\u0005\b\u0080\u0001\u0010wR\u0018\u0010\u0085\u0001\u001a\u00030\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001¨\u0006\u0088\u0001"}, m88121d2 = {"Ll/cen;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", p7f.GPS_DIRECTION_TRUE, "()V", "", "phoneNumber", "", "isChinaCountryCode", BaseSei.f14625Y, "(Ljava/lang/String;Z)Z", "", "A", "()I", "J", BaseSei.f14624X, "K", "Lcom/p1/mobile/android/app/Dialog;", OMSTemplateType.dialog, BaseSei.f14626Z, "(Lcom/p1/mobile/android/app/Dialog;)V", "N", "Landroid/view/View;", "rootView", "B", "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Lcom/p1/mobile/android/app/Dialog;", p7f.GPS_MEASUREMENT_INTERRUPTED, "(Lcom/p1/mobile/android/app/Act;)Z", "eid", "Y", "(Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "w", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Z", "X", "W", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Lv/VText;", "b", "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "c", "get_subtitle", "set_subtitle", "_subtitle", "Landroid/widget/LinearLayout;", Constants.INAPP_DATA_TAG, "Landroid/widget/LinearLayout;", "get_verify", "()Landroid/widget/LinearLayout;", "set_verify", "(Landroid/widget/LinearLayout;)V", "_verify", "e", "E", "set_verify_ccode", "_verify_ccode", "Lv/VEditText;", "f", "Lv/VEditText;", "I", "()Lv/VEditText;", "set_verify_phone_num", "(Lv/VEditText;)V", "_verify_phone_num", "g", "F", "set_verify_code", "_verify_code", "h", "H", "set_verify_get_code", "_verify_get_code", RXScreenCaptureService.KEY_INDEX, "G", "set_verify_error_code", "_verify_error_code", "Lv/VButton;", "j", "Lv/VButton;", "D", "()Lv/VButton;", "set_positive_primary", "(Lv/VButton;)V", "_positive_primary", "k", c4s.C_ZONE, "set_nega", "_nega", "Ll/kcg0;", BLiveStormDanmakuGiftResourceType.f45292l, "Ll/kcg0;", "getCodeSubscribe", "()Ll/kcg0;", "setCodeSubscribe", "(Ll/kcg0;)V", "codeSubscribe", "m", "getPositiveBtSubscribe", "setPositiveBtSubscribe", "positiveBtSubscribe", "n", "Ljava/lang/String;", "getDIALOG_P_ID", "()Ljava/lang/String;", "DIALOG_P_ID", "o", "getCODE_BUTTON_E_ID", "CODE_BUTTON_E_ID", "p", "getBAND_PHONE_BUTTON_E_ID", "BAND_PHONE_BUTTON_E_ID", "q", "getPHONE_LATER_BUTTON_E_ID", "PHONE_LATER_BUTTON_E_ID", "Ll/l4g0;", "r", "Ll/l4g0;", "pageHelper", BLiveStormDanmakuGiftResourceType.f45294s, "Lcom/p1/mobile/android/app/Dialog;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class cen {

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
    public kcg0 codeSubscribe;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public kcg0 positiveBtSubscribe;

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
    public final l4g0 pageHelper;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public Dialog dialog;

    public cen(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.DIALOG_P_ID = "p_intl_band_phone_popup";
        this.CODE_BUTTON_E_ID = "e_intl_get_code_button";
        this.BAND_PHONE_BUTTON_E_ID = "e_intl_band_phone_button";
        this.PHONE_LATER_BUTTON_E_ID = "e_intl_phone_later_button";
        l4g0 l4g0VarM204399c = w1e.m204399c("p_intl_band_phone_popup", cen.class.getName());
        l4g0VarM204399c.getClass();
        this.pageHelper = l4g0VarM204399c;
    }

    /* JADX INFO: renamed from: L */
    public static final void m109380L(cen cenVar, uxj0 uxj0Var) {
        if (cenVar.m109423V(cenVar.act)) {
            cenVar.act.progressDismiss();
            CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
            Dialog dialog = cenVar.dialog;
            Dialog dialog2 = null;
            if (dialog == null) {
                Intrinsics.m88391r(OMSTemplateType.dialog);
                dialog = null;
            }
            l51.m152891K(dialog.getClass().getName());
            o1j0.m165651y(cenVar.act.string(R$string.f19816xt));
            Dialog dialog3 = cenVar.dialog;
            if (dialog3 == null) {
                Intrinsics.m88391r(OMSTemplateType.dialog);
                dialog3 = null;
            }
            cenVar.m109431z(dialog3);
            Dialog dialog4 = cenVar.dialog;
            if (dialog4 == null) {
                Intrinsics.m88391r(OMSTemplateType.dialog);
            } else {
                dialog2 = dialog4;
            }
            dialog2.dismiss();
            new hen(cenVar.act).m134666j();
        }
    }

    /* JADX INFO: renamed from: M */
    public static final void m109381M(cen cenVar, Throwable th) {
        if (cenVar.m109423V(cenVar.act)) {
            cenVar.act.progressDismiss();
            if (!(th instanceof TantanException.Client.AccountService)) {
                bsj0.m106249G(th);
                return;
            }
            int i = ((TantanException.Client.AccountService) th).code;
            if (i == 40000) {
                bsj0.m106249G(th);
                return;
            }
            String strM106276l = bsj0.m106276l(i);
            if (strM106276l == null) {
                bsj0.m106249G(th);
            } else {
                bnl0.m105525M0(cenVar.m109416G(), true);
                cenVar.m109416G().setText(strM106276l);
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public static final C22421c m109382O(cen cenVar, uxj0 uxj0Var) {
        Dialog dialog = null;
        if (!cenVar.m109423V(cenVar.act)) {
            return C22421c.error(null);
        }
        cenVar.m109415F().setEnabled(true);
        cenVar.m109415F().requestFocus();
        bnl0.m105591y(cenVar.m109417H(), false);
        cenVar.m109417H().setText(R$string.f19318hp);
        Dialog dialog2 = cenVar.dialog;
        if (dialog2 == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
        } else {
            dialog = dialog2;
        }
        return l51.m152894N(dialog.getClass().getName(), 60);
    }

    /* JADX INFO: renamed from: P */
    public static final C22421c m109383P(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Q */
    public static final void m109384Q(cen cenVar, Long l2) {
        if (cenVar.m109423V(cenVar.act)) {
            l2.getClass();
            long jLongValue = 60 - l2.longValue();
            if (jLongValue > 0) {
                VText vTextM109417H = cenVar.m109417H();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                vTextM109417H.setText(String.format(Locale.getDefault(), "%d%s", Arrays.copyOf(new Object[]{Long.valueOf(jLongValue), cenVar.act.getString(R$string.f19537ot)}, 2)));
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public static final void m109385R(cen cenVar, Throwable th) {
        if (cenVar.m109423V(cenVar.act)) {
            cenVar.m109417H().setText(R$string.f19760w4);
            bnl0.m105591y(cenVar.m109417H(), false);
            cenVar.m109415F().setEnabled(false);
            if (!(th instanceof TantanException.Client.AccountService)) {
                bsj0.m106249G(th);
                return;
            }
            int i = ((TantanException.Client.AccountService) th).code;
            if (i == 40000) {
                bsj0.m106249G(th);
                return;
            }
            String strM106276l = bsj0.m106276l(i);
            if (strM106276l == null) {
                bsj0.m106249G(th);
            } else {
                bnl0.m105525M0(cenVar.m109416G(), true);
                cenVar.m109416G().setText(strM106276l);
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public static final void m109386S(cen cenVar) {
        cenVar.m109417H().setText(R$string.f19760w4);
        if (cenVar.m109418I().getText().toString().length() == 0) {
            bnl0.m105591y(cenVar.m109417H(), false);
        } else {
            bnl0.m105591y(cenVar.m109417H(), true);
        }
    }

    /* JADX INFO: renamed from: U */
    public static final void m109387U(cen cenVar, String str) {
        cenVar.m109414E().setText(str);
        cenVar.m109429x();
    }

    /* JADX INFO: renamed from: b */
    public static void m109389b(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static void m109392e(final cen cenVar, View view) {
        CoreModule.m30929H().mo29150Aq(cenVar.act, new y20() { // from class: l.vdn
            @Override // p153l.y20
            public final void call(Object obj) {
                cen.m109387U(this.f183642a, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static void m109393f(cen cenVar, Pair pair) {
        if (TextUtils.isEmpty((CharSequence) pair.getFirst()) || TextUtils.isEmpty((CharSequence) pair.getSecond())) {
            bnl0.m105591y(cenVar.m109413D(), false);
        } else {
            bnl0.m105591y(cenVar.m109413D(), true);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m109394g(cen cenVar, DialogInterface dialogInterface) {
        cenVar.m109424W();
    }

    /* JADX INFO: renamed from: i */
    public static void m109396i(cen cenVar, CharSequence charSequence) {
        cenVar.m109429x();
    }

    /* JADX INFO: renamed from: k */
    public static void m109398k(Throwable th) {
    }

    /* JADX INFO: renamed from: m */
    public static void m109400m(cen cenVar, CharSequence charSequence) {
        bnl0.m105524M(cenVar.m109416G(), false);
    }

    /* JADX INFO: renamed from: n */
    public static void m109401n(cen cenVar, View view) {
        cenVar.m109426Y(cenVar.PHONE_LATER_BUTTON_E_ID);
        Dialog dialog = cenVar.dialog;
        if (dialog == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            dialog = null;
        }
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: p */
    public static void m109403p(cen cenVar) {
        cenVar.m109417H().setText(R$string.f19760w4);
        if (TextUtils.isEmpty(cenVar.m109418I().getText().toString())) {
            bnl0.m105591y(cenVar.m109417H(), false);
        } else {
            bnl0.m105591y(cenVar.m109417H(), true);
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m109404q(final cen cenVar, View view) {
        cenVar.m109426Y(cenVar.BAND_PHONE_BUTTON_E_ID);
        cenVar.act.progress(R$string.f18632L5);
        VerifyData verifyData = new VerifyData();
        verifyData.code = bsj0.m106251I(cenVar.m109415F());
        verifyData.action = VerifyReason.get(VerifyReason.bind_mobile);
        verifyData.codeLength = 6;
        verifyData.countryCode = bsj0.m106251I(cenVar.m109414E());
        verifyData.mobileNumber = bsj0.m106255M(cenVar.m109418I());
        verifyData.forceLogin = true;
        cenVar.act.duringCreated(CoreModule.m30929H().verify(verifyData)).subscribe(psd0.m173600K(new y20() { // from class: l.sdn
            @Override // p153l.y20
            public final void call(Object obj) {
                cen.m109380L(this.f167446a, (uxj0) obj);
            }
        }, new y20() { // from class: l.tdn
            @Override // p153l.y20
            public final void call(Object obj) {
                cen.m109381M(this.f173374a, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: r */
    public static Pair m109405r(CharSequence charSequence, CharSequence charSequence2) {
        return new Pair(charSequence, charSequence2);
    }

    /* JADX INFO: renamed from: s */
    public static void m109406s(final cen cenVar, View view) {
        cenVar.m109426Y(cenVar.CODE_BUTTON_E_ID);
        VerifyData verifyData = new VerifyData();
        verifyData.language = q8g0.m175820y();
        verifyData.action = VerifyReason.get(VerifyReason.bind_mobile);
        verifyData.codeLength = 6;
        verifyData.countryCode = bsj0.m106251I(cenVar.m109414E());
        verifyData.mobileNumber = bsj0.m106255M(cenVar.m109418I());
        bnl0.m105591y(cenVar.m109417H(), false);
        cenVar.m109417H().setText("...");
        Act act = cenVar.act;
        C22421c<uxj0> c22421cSend = CoreModule.m30929H().send(verifyData);
        final Function1 function1 = new Function1() { // from class: l.mdn
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return cen.m109382O(this.f136396a, (uxj0) obj);
            }
        };
        act.duringCreated((C22421c) c22421cSend.flatMap(new qcj() { // from class: l.ndn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return cen.m109383P(function1, obj);
            }
        })).subscribe(psd0.m173599J(new y20() { // from class: l.odn
            @Override // p153l.y20
            public final void call(Object obj) {
                cen.m109384Q(this.f146930a, (Long) obj);
            }
        }, new y20() { // from class: l.pdn
            @Override // p153l.y20
            public final void call(Object obj) {
                cen.m109385R(this.f151815a, (Throwable) obj);
            }
        }, new x20() { // from class: l.qdn
            @Override // p153l.x20
            public final void call() {
                cen.m109386S(this.f156750a);
            }
        }, false));
    }

    /* JADX INFO: renamed from: t */
    public static void m109407t(Long l2) {
    }

    /* JADX INFO: renamed from: v */
    public static Pair m109409v(Function2 function2, Object obj, Object obj2) {
        return (Pair) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: A */
    public final int m109410A() {
        return !TextUtils.isEmpty(m109414E().getText()) ? Integer.parseInt(m109414E().getText().toString().substring(1)) : nsb.f143476d.get(0).f143479b;
    }

    /* JADX INFO: renamed from: B */
    public final Dialog m109411B(Act act, View rootView) {
        Dialog.C4460e c4460eM21519P = act.dialog().m21515L(agc0.f71129o).m21519P(rootView, false);
        int i = qa00.f156335v;
        Dialog dialogM21566z = c4460eM21519P.m21497C(i, 0, i, 0).m21495B(true).m21566z();
        dialogM21566z.getClass();
        return dialogM21566z;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final VText m109412C() {
        VText vText = this._nega;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_nega");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final VButton m109413D() {
        VButton vButton = this._positive_primary;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_positive_primary");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final VText m109414E() {
        VText vText = this._verify_ccode;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_verify_ccode");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final VEditText m109415F() {
        VEditText vEditText = this._verify_code;
        if (vEditText != null) {
            return vEditText;
        }
        Intrinsics.m88391r("_verify_code");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final VText m109416G() {
        VText vText = this._verify_error_code;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_verify_error_code");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final VText m109417H() {
        VText vText = this._verify_get_code;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_verify_get_code");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final VEditText m109418I() {
        VEditText vEditText = this._verify_phone_num;
        if (vEditText != null) {
            return vEditText;
        }
        Intrinsics.m88391r("_verify_phone_num");
        return null;
    }

    /* JADX INFO: renamed from: J */
    public final void m109419J() {
        this.positiveBtSubscribe = m109418I().mo29616h().subscribe(psd0.m173596G(new y20() { // from class: l.wdn
            @Override // p153l.y20
            public final void call(Object obj) {
                cen.m109396i(this.f188623a, (CharSequence) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public final void m109420K() {
        bnl0.m105509E0(m109413D(), new View.OnClickListener() { // from class: l.hdn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cen.m109404q(this.f109012a, view);
            }
        });
        C22421c<CharSequence> c22421cMo29616h = m109415F().mo29616h();
        C22421c<CharSequence> c22421cMo29616h2 = m109418I().mo29616h();
        final Function2 function2 = new Function2() { // from class: l.idn
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return cen.m109405r((CharSequence) obj, (CharSequence) obj2);
            }
        };
        C22421c.combineLatest(c22421cMo29616h, c22421cMo29616h2, new rcj() { // from class: l.jdn
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return cen.m109409v(function2, obj, obj2);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.kdn
            @Override // p153l.y20
            public final void call(Object obj) {
                cen.m109393f(this.f125266a, (Pair) obj);
            }
        }, new y20() { // from class: l.ldn
            @Override // p153l.y20
            public final void call(Object obj) {
                cen.m109398k((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N */
    public final void m109421N() {
        m109415F().setEnabled(false);
        Dialog dialog = this.dialog;
        Dialog dialog2 = null;
        if (dialog == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            dialog = null;
        }
        if (l51.m152882B(dialog.getClass().getName())) {
            bnl0.m105591y(m109417H(), false);
            m109417H().setText(R$string.f19760w4);
            Act act = this.act;
            Dialog dialog3 = this.dialog;
            if (dialog3 == null) {
                Intrinsics.m88391r(OMSTemplateType.dialog);
            } else {
                dialog2 = dialog3;
            }
            act.duringCreated(l51.m152894N(dialog2.getClass().getName(), 60)).subscribe(psd0.m173598I(new y20() { // from class: l.xdn
                @Override // p153l.y20
                public final void call(Object obj) {
                    cen.m109407t((Long) obj);
                }
            }, new y20() { // from class: l.ydn
                @Override // p153l.y20
                public final void call(Object obj) {
                    cen.m109389b((Throwable) obj);
                }
            }, new x20() { // from class: l.zdn
                @Override // p153l.x20
                public final void call() {
                    cen.m109403p(this.f203901a);
                }
            }));
        } else {
            Editable text = m109418I().getText();
            text.getClass();
            bnl0.m105591y(m109417H(), text.length() > 0);
        }
        bnl0.m105509E0(m109417H(), new View.OnClickListener() { // from class: l.aen
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cen.m109406s(this.f70815a, view);
            }
        });
        this.codeSubscribe = m109415F().mo29616h().subscribe(psd0.m173596G(new y20() { // from class: l.ben
            @Override // p153l.y20
            public final void call(Object obj) {
                cen.m109400m(this.f76402a, (CharSequence) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T */
    public final void m109422T() {
        m109414E().setText(Marker.ANY_NON_NULL_MARKER + nsb.f143476d.get(0).f143479b);
        bnl0.m105509E0(m109414E(), new View.OnClickListener() { // from class: l.udn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cen.m109392e(this.f178556a, view);
            }
        });
        m109421N();
        m109420K();
        m109419J();
    }

    /* JADX INFO: renamed from: V */
    public final boolean m109423V(Act act) {
        Dialog dialog = this.dialog;
        if (dialog == null) {
            return false;
        }
        Dialog dialog2 = null;
        if (dialog == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            dialog = null;
        }
        if (!NullChecker.m82486a(dialog)) {
            return false;
        }
        Dialog dialog3 = this.dialog;
        if (dialog3 == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
        } else {
            dialog2 = dialog3;
        }
        return dialog2.isShowing() && NullChecker.m82486a(act) && !act.isFinishing() && !act.isDestroyed();
    }

    /* JADX INFO: renamed from: W */
    public final void m109424W() {
        l4g0 l4g0Var = this.pageHelper;
        if (l4g0Var != null) {
            l4g0Var.m152776k();
            l4g0Var.m152775j();
        }
        psd0.m173633z(this.codeSubscribe);
        psd0.m173633z(this.positiveBtSubscribe);
    }

    /* JADX INFO: renamed from: X */
    public final void m109425X() {
        l4g0 l4g0Var = this.pageHelper;
        if (l4g0Var != null) {
            l4g0Var.m152774i();
            l4g0Var.m152777l();
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m109426Y(String eid) {
        i4g0.m138520r(eid, this.DIALOG_P_ID);
    }

    /* JADX INFO: renamed from: Z */
    public final void m109427Z() {
        LayoutInflater layoutInflaterM171370a = p9r.m171370a(this.act);
        layoutInflaterM171370a.getClass();
        Dialog dialog = null;
        this.dialog = m109411B(this.act, m109428w(layoutInflaterM171370a, null));
        bnl0.m105509E0(m109412C(), new View.OnClickListener() { // from class: l.gdn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cen.m109401n(this.f103727a, view);
            }
        });
        Dialog dialog2 = this.dialog;
        if (dialog2 == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            dialog2 = null;
        }
        dialog2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.rdn
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                cen.m109394g(this.f162322a, dialogInterface);
            }
        });
        m109422T();
        Dialog dialog3 = this.dialog;
        if (dialog3 == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
        } else {
            dialog = dialog3;
        }
        dialog.show();
        m109425X();
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final View m109428w(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM115445b = den.m115445b(this, inflater, parent);
        viewM115445b.getClass();
        return viewM115445b;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    /* JADX INFO: renamed from: x */
    public final void m109429x() {
        if (m109418I().getText().toString().length() == 0) {
            bnl0.m105591y(m109417H(), false);
        } else {
            Dialog dialog = this.dialog;
            if (dialog == null) {
                Intrinsics.m88391r(OMSTemplateType.dialog);
                dialog = null;
            }
            if (l51.m152882B(dialog.getClass().getName())) {
                bnl0.m105591y(m109417H(), false);
            } else {
                if (m109430y(m109418I().getText().toString(), m109410A() == 86)) {
                    bnl0.m105591y(m109417H(), true);
                } else {
                    bnl0.m105591y(m109417H(), false);
                }
            }
        }
        bnl0.m105524M(m109416G(), false);
    }

    /* JADX INFO: renamed from: y */
    public final boolean m109430y(String phoneNumber, boolean isChinaCountryCode) {
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
    public final void m109431z(Dialog dialog) {
        try {
            Window window = dialog.getWindow();
            Object systemService = dialog.getContext().getSystemService("input_method");
            systemService.getClass();
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            if (NullChecker.m82486a(window) && NullChecker.m82486a(inputMethodManager)) {
                window.getClass();
                window.setSoftInputMode(2);
                if (!NullChecker.m82486a(window.getCurrentFocus())) {
                    inputMethodManager.hideSoftInputFromWindow(window.getDecorView().getWindowToken(), 0);
                    return;
                }
                View currentFocus = window.getCurrentFocus();
                currentFocus.getClass();
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }
}
