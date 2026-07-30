package p153l;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSON;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.verification.VerificationCenterAct;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserStatus;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0003J\u0019\u0010\u0016\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0014J\u0019\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010 \u001a\u0004\u0018\u00010\u001d2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000fH\u0002¢\u0006\u0004\b \u0010\u001fJ\u0019\u0010!\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b!\u0010\"J!\u0010#\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000fH\u0002¢\u0006\u0004\b#\u0010\u001fR&\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, m88121d2 = {"Ll/bep;", "", "<init>", "()V", "", "n", "()Z", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", NotificationCompat.CATEGORY_STATUS, "", "p", "(Lcom/p1/mobile/android/app/Act;I)V", "o", "", "q", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "u", BLiveStormDanmakuGiftResourceType.f45292l, "(Lcom/p1/mobile/android/app/Act;)Z", "m", "k", "(Lcom/p1/mobile/android/app/Act;)V", RXScreenCaptureService.KEY_INDEX, "Landroid/content/Context;", "ctx", "j", "(Landroid/content/Context;)Z", "Ll/jl80;", Constants.KEY_T, "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)Ll/jl80;", "r", ResourceDirection.f39656v, "(Lcom/p1/mobile/android/app/Act;)Ll/jl80;", BLiveStormDanmakuGiftResourceType.f45294s, "Lkotlin/Pair;", "a", "Lkotlin/Pair;", "dlgPair", "b", "Ljava/lang/Boolean;", "controlEnable", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class bep {

    @NotNull
    public static final bep INSTANCE = new bep();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static Pair<String, ? extends jl80> dlgPair;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static Boolean controlEnable;

    /* JADX INFO: renamed from: a */
    public static void m103736a(l4g0 l4g0Var, String str, DialogInterface dialogInterface) {
        Pair<String, ? extends jl80> pair = dlgPair;
        if (pair != null && Intrinsics.m88377d(pair.getFirst(), str)) {
            dlgPair = null;
        }
        w1e.m204401e(l4g0Var);
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m103737b(int i) {
        return Boolean.valueOf(i == -1 || uqb0.f180400f0 == i);
    }

    /* JADX INFO: renamed from: c */
    public static void m103738c(l4g0 l4g0Var, String str, DialogInterface dialogInterface) {
        Pair<String, ? extends jl80> pair = dlgPair;
        if (pair != null && Intrinsics.m88377d(pair.getFirst(), str)) {
            dlgPair = null;
        }
        w1e.m204401e(l4g0Var);
    }

    /* JADX INFO: renamed from: d */
    public static void m103739d(Act act) {
        i4g0.m138520r("e_intl_must_verify_popup_button_avatar", "p_intl_must_verify_popup");
        Fragment fragmentM2558i0 = act.getSupportFragmentManager().m2558i0(TabName.Card.toString());
        Frag frag = fragmentM2558i0 instanceof Frag ? (Frag) fragmentM2558i0 : null;
        if (!NullChecker.m82486a(frag)) {
            CoreModule.m30933P().m143412i().mo180310D1(act);
            return;
        }
        yyh0 yyh0Var = yyh0.INSTANCE;
        frag.getClass();
        yyh0Var.m217995k(frag);
    }

    /* JADX INFO: renamed from: e */
    public static Boolean m103740e(UserStatus userStatus) {
        return Boolean.valueOf(TEnum.equals(userStatus, UserStatus.RISK_TAG_MANDATORY_PICTURE_VERIFICATION_PROCESS) || TEnum.equals(userStatus, UserStatus.RISK_TAG_MANDATORY_PICTURE_VERIFICATION_NEW));
    }

    /* JADX INFO: renamed from: f */
    public static void m103741f(l4g0 l4g0Var, String str, DialogInterface dialogInterface) {
        Pair<String, ? extends jl80> pair = dlgPair;
        if (pair != null && Intrinsics.m88377d(pair.getFirst(), str)) {
            dlgPair = null;
        }
        w1e.m204401e(l4g0Var);
    }

    /* JADX INFO: renamed from: g */
    public static void m103742g(Act act) {
        i4g0.m138520r("e_intl_antispam_alive_verify", "p_intl_antispam_alive_popup");
        if (CoreModule.f18264c.f20381e0.m116552d8()) {
            o1j0.m165649w(R$string.f19761w5);
        } else {
            hxf.m137587h(act, "fromPicVerificationDlg");
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m103743h(Act act) {
        i4g0.m138520r("e_intl_verify_popup_button_verify", "p_intl_must_verify_popup");
        if (CoreModule.f18264c.f20381e0.m116552d8()) {
            o1j0.m165649w(R$string.f19761w5);
        } else if (TEnum.equals(CoreModule.f18264c.f20294B0.m32623s4(), "pending")) {
            INSTANCE.m103756u(act, "auditing");
        } else {
            act.startActivity(VerificationCenterAct.m57174Y1(act, false));
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m103744i(Act act) {
        jl80 second;
        jl80 second2;
        if (act == null || !m103745j(act)) {
            return false;
        }
        if (act.isDialogShowing()) {
            act.getShowingDialog().dismiss();
        }
        Pair<String, ? extends jl80> pair = dlgPair;
        if (pair != null && (second = pair.getSecond()) != null && second.isShowing()) {
            Pair<String, ? extends jl80> pair2 = dlgPair;
            if (pair2 != null && (second2 = pair2.getSecond()) != null) {
                second2.dismiss();
            }
            dlgPair = null;
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m103745j(Context ctx) {
        if (ctx == null) {
            return false;
        }
        if (ctx instanceof Act) {
            Act act = (Act) ctx;
            if (act.isFinishing() || act.isDestroyed()) {
                return false;
            }
        }
        return m103749n();
    }

    /* JADX INFO: renamed from: k */
    public final void m103746k(Act act) {
        Pair<String, ? extends jl80> pair;
        jl80 second;
        jl80 second2;
        if (act == null || !m103745j(act) || (pair = dlgPair) == null || (second = pair.getSecond()) == null || !second.isShowing()) {
            return;
        }
        Pair<String, ? extends jl80> pair2 = dlgPair;
        if (pair2 != null && (second2 = pair2.getSecond()) != null) {
            second2.dismiss();
        }
        Pair<String, ? extends jl80> pair3 = dlgPair;
        if (Objects.equals(pair3 != null ? pair3.getFirst() : null, "auditing")) {
            m103756u(act, "verified");
        }
        dlgPair = null;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m103747l(@Nullable Act act) {
        User userM116600p9;
        if (act == null || !m103745j(act) || (userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9()) == null) {
            return false;
        }
        Objects.toString(userM116600p9.status);
        UserStatus userStatus = (UserStatus) jyb.m147529r(userM116600p9.status, new qcj() { // from class: l.udp
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return bep.m103740e((UserStatus) obj);
            }
        });
        Objects.toString(userStatus);
        if (userStatus == null) {
            m103746k(act);
            return false;
        }
        m103756u(act, TEnum.equals(userStatus, UserStatus.RISK_TAG_MANDATORY_PICTURE_VERIFICATION_PROCESS) ? "auditing" : "need_verify");
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final void m103748m() {
        jl80 second;
        Pair<String, ? extends jl80> pair;
        jl80 second2;
        Objects.toString(dlgPair);
        Pair<String, ? extends jl80> pair2 = dlgPair;
        if (pair2 != null && (second = pair2.getSecond()) != null && second.isShowing() && (pair = dlgPair) != null && (second2 = pair.getSecond()) != null) {
            second2.dismiss();
        }
        dlgPair = null;
        controlEnable = null;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m103749n() {
        Boolean boolValueOf;
        Boolean bool = controlEnable;
        if (bool != null) {
            return bool.booleanValue();
        }
        String strM80485F = RemoteConfig.m80481x().m80485F("antispam_intl_forced_verify");
        strM80485F.getClass();
        boolean z = true;
        if (TextUtils.isEmpty(strM80485F)) {
            controlEnable = Boolean.TRUE;
            return true;
        }
        try {
            String string = JSON.parseObject(strM80485F).getString("verify_off");
            if (!TextUtils.isEmpty(string) && jyb.m147520m(JSON.parseArray(string, Integer.TYPE), new qcj() { // from class: l.tdp
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return bep.m103737b(((Integer) obj).intValue());
                }
            })) {
                z = false;
            }
            boolValueOf = Boolean.valueOf(z);
        } catch (Exception unused) {
            boolValueOf = Boolean.FALSE;
        }
        controlEnable = boolValueOf;
        return boolValueOf.booleanValue();
    }

    /* JADX INFO: renamed from: o */
    public final void m103750o(@Nullable Act act, int status) {
        m103752q(act, status == 1 ? "need_person_verify" : "auditing");
    }

    /* JADX INFO: renamed from: p */
    public final void m103751p(@Nullable Act act, int status) {
        m103752q(act, status == 1 ? "need_verify" : "auditing");
    }

    /* JADX INFO: renamed from: q */
    public final void m103752q(@Nullable Act act, @NotNull String status) {
        status.getClass();
        if (act == null || !m103745j(act)) {
            return;
        }
        nae0.m162083m(act, Uri.parse("tantan://intl_spam_control/verify_avatar").buildUpon().appendQueryParameter(NotificationCompat.CATEGORY_STATUS, status).build());
    }

    /* JADX INFO: renamed from: r */
    public final jl80 m103753r(Act act, final String status) {
        if (!m103744i(act)) {
            return null;
        }
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_intl_review_popup", g6e.class.getName());
        jl80.C17971a c17971aM146045n0 = new jl80.C17971a(act).m146050s0(R$string.f19823y5, new Object[0]).m146024S(dbc0.f87123jk).m146055x0(R$string.f19854z5, new Object[0]).m146031Z(R$string.f18894Tr).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.vdp
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                bep.m103738c(l4g0VarM204399c, status, dialogInterface);
            }
        });
        w1e.m204402f(l4g0VarM204399c);
        return c17971aM146045n0.m146049r0();
    }

    /* JADX INFO: renamed from: s */
    public final jl80 m103754s(final Act act, final String status) {
        if (!m103744i(act)) {
            return null;
        }
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_intl_antispam_alive_popup", g6e.class.getName());
        jl80.C17971a c17971aM146045n0 = new jl80.C17971a(act).m146050s0(R$string.f19637s5, new Object[0]).m146055x0(R$string.f19668t5, new Object[0]).m146032a0(R$string.f19699u5, new Runnable() { // from class: l.wdp
            @Override // java.lang.Runnable
            public final void run() {
                bep.m103742g(act);
            }
        }).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.xdp
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                bep.m103736a(l4g0VarM204399c, status, dialogInterface);
            }
        });
        w1e.m204402f(l4g0VarM204399c);
        return c17971aM146045n0.m146049r0();
    }

    /* JADX INFO: renamed from: t */
    public final jl80 m103755t(final Act act, final String status) {
        if (!m103744i(act)) {
            return null;
        }
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_intl_must_verify_popup", Dialog.class.getName());
        act.getClass();
        jl80.C17971a c17971aM146045n0 = new jl80.C17971a(act).m146050s0(R$string.f18291A5, new Object[0]).m146032a0(R$string.f19792x5, new Runnable() { // from class: l.ydp
            @Override // java.lang.Runnable
            public final void run() {
                bep.m103743h(act);
            }
        }).m146037f0(R$string.f19730v5, new Runnable() { // from class: l.zdp
            @Override // java.lang.Runnable
            public final void run() {
                bep.m103739d(act);
            }
        }).m146024S(dbc0.f87538w8).m146055x0(R$string.f18322B5, new Object[0]).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.aep
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                bep.m103741f(l4g0VarM204399c, status, dialogInterface);
            }
        });
        w1e.m204402f(l4g0VarM204399c);
        return c17971aM146045n0.m146049r0();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: u */
    public final void m103756u(@NotNull Act act, @Nullable String status) {
        jl80 jl80VarM103755t;
        jl80 jl80VarM103754s;
        jl80 jl80VarM103753r;
        act.getClass();
        Pair<String, ? extends jl80> pair = dlgPair;
        if ((pair == null || !Objects.equals(pair.getFirst(), status)) && status != null) {
            switch (status.hashCode()) {
                case -1994383672:
                    if (status.equals("verified")) {
                        m103757v(act);
                        break;
                    }
                    break;
                case -557561790:
                    if (status.equals("need_verify") && (jl80VarM103755t = m103755t(act, status)) != null) {
                        dlgPair = new Pair<>(status, jl80VarM103755t);
                    }
                    break;
                case -41939782:
                    if (status.equals("need_person_verify") && (jl80VarM103754s = m103754s(act, status)) != null) {
                        dlgPair = new Pair<>(status, jl80VarM103754s);
                    }
                    break;
                case 976071207:
                    if (status.equals("auditing") && (jl80VarM103753r = m103753r(act, status)) != null) {
                        dlgPair = new Pair<>(status, jl80VarM103753r);
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final jl80 m103757v(Act act) {
        if (m103744i(act)) {
            return new jl80.C17971a(act).m146050s0(R$string.f19598qs, new Object[0]).m146024S(dbc0.f87222mk).m146055x0(R$string.f19629rs, new Object[0]).m146031Z(R$string.f18894Tr).m146049r0();
        }
        return null;
    }
}
