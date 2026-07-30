package p149l;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSON;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.verification.VerificationCenterAct;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserStatus;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
@Metadata(m87231d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0003J\u0019\u0010\u0016\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0014J\u0019\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010 \u001a\u0004\u0018\u00010\u001d2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000fH\u0002¢\u0006\u0004\b \u0010\u001fJ\u0019\u0010!\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b!\u0010\"J!\u0010#\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000fH\u0002¢\u0006\u0004\b#\u0010\u001fR&\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, m87232d2 = {"Ll/bcp;", "", "<init>", "()V", "", "n", "()Z", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", NotificationCompat.CATEGORY_STATUS, "", "p", "(Lcom/p1/mobile/android/app/Act;I)V", "o", "", "q", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "u", BLiveStormDanmakuGiftResourceType.f44444l, "(Lcom/p1/mobile/android/app/Act;)Z", "m", "k", "(Lcom/p1/mobile/android/app/Act;)V", RXScreenCaptureService.KEY_INDEX, "Landroid/content/Context;", "ctx", "j", "(Landroid/content/Context;)Z", "Ll/dd80;", Constants.KEY_T, "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)Ll/dd80;", "r", ResourceDirection.f38808v, "(Lcom/p1/mobile/android/app/Act;)Ll/dd80;", BLiveStormDanmakuGiftResourceType.f44446s, "Lkotlin/Pair;", "a", "Lkotlin/Pair;", "dlgPair", "b", "Ljava/lang/Boolean;", "controlEnable", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class bcp {

    @NotNull
    public static final bcp INSTANCE = new bcp();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static Pair<String, ? extends dd80> dlgPair;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static Boolean controlEnable;

    /* JADX INFO: renamed from: a */
    public static void m101097a(cwf0 cwf0Var, String str, DialogInterface dialogInterface) {
        Pair<String, ? extends dd80> pair = dlgPair;
        if (pair != null && Intrinsics.m87488d(pair.getFirst(), str)) {
            dlgPair = null;
        }
        i0e.m133796e(cwf0Var);
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m101098b(int i) {
        return Boolean.valueOf(i == -1 || qib0.f154717f0 == i);
    }

    /* JADX INFO: renamed from: c */
    public static void m101099c(cwf0 cwf0Var, String str, DialogInterface dialogInterface) {
        Pair<String, ? extends dd80> pair = dlgPair;
        if (pair != null && Intrinsics.m87488d(pair.getFirst(), str)) {
            dlgPair = null;
        }
        i0e.m133796e(cwf0Var);
    }

    /* JADX INFO: renamed from: d */
    public static void m101100d(Act act) {
        zvf0.m220396r("e_intl_must_verify_popup_button_avatar", "p_intl_must_verify_popup");
        Fragment fragmentM2557i0 = act.getSupportFragmentManager().m2557i0(TabName.Card.toString());
        Frag frag = fragmentM2557i0 instanceof Frag ? (Frag) fragmentM2557i0 : null;
        if (!NullChecker.m81303a(frag)) {
            CoreModule.m29935P().m94658i().mo158218D1(act);
            return;
        }
        qqh0 qqh0Var = qqh0.INSTANCE;
        frag.getClass();
        qqh0Var.m175932k(frag);
    }

    /* JADX INFO: renamed from: e */
    public static Boolean m101101e(UserStatus userStatus) {
        return Boolean.valueOf(TEnum.equals(userStatus, UserStatus.RISK_TAG_MANDATORY_PICTURE_VERIFICATION_PROCESS) || TEnum.equals(userStatus, UserStatus.RISK_TAG_MANDATORY_PICTURE_VERIFICATION_NEW));
    }

    /* JADX INFO: renamed from: f */
    public static void m101102f(cwf0 cwf0Var, String str, DialogInterface dialogInterface) {
        Pair<String, ? extends dd80> pair = dlgPair;
        if (pair != null && Intrinsics.m87488d(pair.getFirst(), str)) {
            dlgPair = null;
        }
        i0e.m133796e(cwf0Var);
    }

    /* JADX INFO: renamed from: g */
    public static void m101103g(Act act) {
        zvf0.m220396r("e_intl_antispam_alive_verify", "p_intl_antispam_alive_popup");
        if (CoreModule.f17545c.f19639e0.m169479d8()) {
            lsi0.m151593w(R$string.f18964u5);
        } else {
            tvf.m190730h(act, "fromPicVerificationDlg");
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m101104h(Act act) {
        zvf0.m220396r("e_intl_verify_popup_button_verify", "p_intl_must_verify_popup");
        if (CoreModule.f17545c.f19639e0.m169479d8()) {
            lsi0.m151593w(R$string.f18964u5);
        } else if (TEnum.equals(CoreModule.f17545c.f19552B0.m31620s4(), "pending")) {
            INSTANCE.m101117u(act, "auditing");
        } else {
            act.startActivity(VerificationCenterAct.m55991X1(act, false));
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m101105i(Act act) {
        dd80 second;
        dd80 second2;
        if (act == null || !m101106j(act)) {
            return false;
        }
        if (act.isDialogShowing()) {
            act.getShowingDialog().dismiss();
        }
        Pair<String, ? extends dd80> pair = dlgPair;
        if (pair != null && (second = pair.getSecond()) != null && second.isShowing()) {
            Pair<String, ? extends dd80> pair2 = dlgPair;
            if (pair2 != null && (second2 = pair2.getSecond()) != null) {
                second2.dismiss();
            }
            dlgPair = null;
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m101106j(Context ctx) {
        if (ctx == null) {
            return false;
        }
        if (ctx instanceof Act) {
            Act act = (Act) ctx;
            if (act.isFinishing() || act.isDestroyed()) {
                return false;
            }
        }
        return m101110n();
    }

    /* JADX INFO: renamed from: k */
    public final void m101107k(Act act) {
        Pair<String, ? extends dd80> pair;
        dd80 second;
        dd80 second2;
        if (act == null || !m101106j(act) || (pair = dlgPair) == null || (second = pair.getSecond()) == null || !second.isShowing()) {
            return;
        }
        Pair<String, ? extends dd80> pair2 = dlgPair;
        if (pair2 != null && (second2 = pair2.getSecond()) != null) {
            second2.dismiss();
        }
        Pair<String, ? extends dd80> pair3 = dlgPair;
        if (Objects.equals(pair3 != null ? pair3.getFirst() : null, "auditing")) {
            m101117u(act, "verified");
        }
        dlgPair = null;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m101108l(@Nullable Act act) {
        User userM169527p9;
        if (act == null || !m101106j(act) || (userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9()) == null) {
            return false;
        }
        Objects.toString(userM169527p9.status);
        UserStatus userStatus = (UserStatus) vwb.m200346r(userM169527p9.status, new w9j() { // from class: l.ubp
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return bcp.m101101e((UserStatus) obj);
            }
        });
        Objects.toString(userStatus);
        if (userStatus == null) {
            m101107k(act);
            return false;
        }
        m101117u(act, TEnum.equals(userStatus, UserStatus.RISK_TAG_MANDATORY_PICTURE_VERIFICATION_PROCESS) ? "auditing" : "need_verify");
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final void m101109m() {
        dd80 second;
        Pair<String, ? extends dd80> pair;
        dd80 second2;
        Objects.toString(dlgPair);
        Pair<String, ? extends dd80> pair2 = dlgPair;
        if (pair2 != null && (second = pair2.getSecond()) != null && second.isShowing() && (pair = dlgPair) != null && (second2 = pair.getSecond()) != null) {
            second2.dismiss();
        }
        dlgPair = null;
        controlEnable = null;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m101110n() {
        Boolean boolValueOf;
        Boolean bool = controlEnable;
        if (bool != null) {
            return bool.booleanValue();
        }
        String strM79302F = RemoteConfig.m79298x().m79302F("antispam_intl_forced_verify");
        strM79302F.getClass();
        boolean z = true;
        if (TextUtils.isEmpty(strM79302F)) {
            controlEnable = Boolean.TRUE;
            return true;
        }
        try {
            String string = JSON.parseObject(strM79302F).getString("verify_off");
            if (!TextUtils.isEmpty(string) && vwb.m200337m(JSON.parseArray(string, Integer.TYPE), new w9j() { // from class: l.tbp
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return bcp.m101098b(((Integer) obj).intValue());
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
    public final void m101111o(@Nullable Act act, int status) {
        m101113q(act, status == 1 ? "need_person_verify" : "auditing");
    }

    /* JADX INFO: renamed from: p */
    public final void m101112p(@Nullable Act act, int status) {
        m101113q(act, status == 1 ? "need_verify" : "auditing");
    }

    /* JADX INFO: renamed from: q */
    public final void m101113q(@Nullable Act act, @NotNull String status) {
        status.getClass();
        if (act == null || !m101106j(act)) {
            return;
        }
        j2e0.m139446m(act, Uri.parse("tantan://intl_spam_control/verify_avatar").buildUpon().appendQueryParameter(NotificationCompat.CATEGORY_STATUS, status).build());
    }

    /* JADX INFO: renamed from: r */
    public final dd80 m101114r(Act act, final String status) {
        if (!m101105i(act)) {
            return null;
        }
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_intl_review_popup", s4e.class.getName());
        dd80.C16336a c16336aM110985n0 = new dd80.C16336a(act).m110990s0(R$string.f19024w5, new Object[0]).m110964S(x2c0.f190654vj).m110995x0(R$string.f19054x5, new Object[0]).m110971Z(R$string.f19076xr).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.vbp
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                bcp.m101099c(cwf0VarM133794c, status, dialogInterface);
            }
        });
        i0e.m133797f(cwf0VarM133794c);
        return c16336aM110985n0.m110989r0();
    }

    /* JADX INFO: renamed from: s */
    public final dd80 m101115s(final Act act, final String status) {
        if (!m101105i(act)) {
            return null;
        }
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_intl_antispam_alive_popup", s4e.class.getName());
        dd80.C16336a c16336aM110985n0 = new dd80.C16336a(act).m110990s0(R$string.f18844q5, new Object[0]).m110995x0(R$string.f18874r5, new Object[0]).m110972a0(R$string.f18904s5, new Runnable() { // from class: l.wbp
            @Override // java.lang.Runnable
            public final void run() {
                bcp.m101103g(act);
            }
        }).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.xbp
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                bcp.m101097a(cwf0VarM133794c, status, dialogInterface);
            }
        });
        i0e.m133797f(cwf0VarM133794c);
        return c16336aM110985n0.m110989r0();
    }

    /* JADX INFO: renamed from: t */
    public final dd80 m101116t(final Act act, final String status) {
        if (!m101105i(act)) {
            return null;
        }
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_intl_must_verify_popup", Dialog.class.getName());
        act.getClass();
        dd80.C16336a c16336aM110985n0 = new dd80.C16336a(act).m110990s0(R$string.f19084y5, new Object[0]).m110972a0(R$string.f18994v5, new Runnable() { // from class: l.ybp
            @Override // java.lang.Runnable
            public final void run() {
                bcp.m101104h(act);
            }
        }).m110977f0(R$string.f18934t5, new Runnable() { // from class: l.zbp
            @Override // java.lang.Runnable
            public final void run() {
                bcp.m101100d(act);
            }
        }).m110964S(x2c0.f190643v8).m110995x0(R$string.f19114z5, new Object[0]).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.acp
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                bcp.m101102f(cwf0VarM133794c, status, dialogInterface);
            }
        });
        i0e.m133797f(cwf0VarM133794c);
        return c16336aM110985n0.m110989r0();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: u */
    public final void m101117u(@NotNull Act act, @Nullable String status) {
        dd80 dd80VarM101116t;
        dd80 dd80VarM101115s;
        dd80 dd80VarM101114r;
        act.getClass();
        Pair<String, ? extends dd80> pair = dlgPair;
        if ((pair == null || !Objects.equals(pair.getFirst(), status)) && status != null) {
            switch (status.hashCode()) {
                case -1994383672:
                    if (status.equals("verified")) {
                        m101118v(act);
                        break;
                    }
                    break;
                case -557561790:
                    if (status.equals("need_verify") && (dd80VarM101116t = m101116t(act, status)) != null) {
                        dlgPair = new Pair<>(status, dd80VarM101116t);
                    }
                    break;
                case -41939782:
                    if (status.equals("need_person_verify") && (dd80VarM101115s = m101115s(act, status)) != null) {
                        dlgPair = new Pair<>(status, dd80VarM101115s);
                    }
                    break;
                case 976071207:
                    if (status.equals("auditing") && (dd80VarM101114r = m101114r(act, status)) != null) {
                        dlgPair = new Pair<>(status, dd80VarM101114r);
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final dd80 m101118v(Act act) {
        if (m101105i(act)) {
            return new dd80.C16336a(act).m110990s0(R$string.f18194Ur, new Object[0]).m110964S(x2c0.f190750yj).m110995x0(R$string.f18224Vr, new Object[0]).m110971Z(R$string.f19076xr).m110989r0();
        }
        return null;
    }
}
