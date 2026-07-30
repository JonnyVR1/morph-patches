package p009l;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p000p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.ui.verification.VerificationCenterAct;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserStatus;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.cwf0;
import l.dd80;
import l.j2e0;
import l.lsi0;
import l.qib0;
import l.s4e;
import l.tvf;
import l.vwb;
import l.w9j;
import l.x2c0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0003J\u0019\u0010\u0016\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0014J\u0019\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010 \u001a\u0004\u0018\u00010\u001d2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000fH\u0002¢\u0006\u0004\b \u0010\u001fJ\u0019\u0010!\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b!\u0010\"J!\u0010#\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000fH\u0002¢\u0006\u0004\b#\u0010\u001fR&\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Ll/bcp;", "", "<init>", "()V", "", "n", "()Z", "Lcom/p1/mobile/android/app/Act;", "act", "", "status", "", "p", "(Lcom/p1/mobile/android/app/Act;I)V", "o", "", "q", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "u", "l", "(Lcom/p1/mobile/android/app/Act;)Z", "m", "k", "(Lcom/p1/mobile/android/app/Act;)V", "i", "Landroid/content/Context;", "ctx", "j", "(Landroid/content/Context;)Z", "Ll/dd80;", "t", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)Ll/dd80;", "r", "v", "(Lcom/p1/mobile/android/app/Act;)Ll/dd80;", "s", "Lkotlin/Pair;", "a", "Lkotlin/Pair;", "dlgPair", "b", "Ljava/lang/Boolean;", "controlEnable", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public static void m11940a(cwf0 cwf0Var, String str, DialogInterface dialogInterface) {
        Pair<String, ? extends dd80> pair = dlgPair;
        if (pair != null && Intrinsics.d(pair.getFirst(), str)) {
            dlgPair = null;
        }
        i0e.m16064e(cwf0Var);
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m11941b(int i) {
        return Boolean.valueOf(i == -1 || qib0.f0 == i);
    }

    /* JADX INFO: renamed from: c */
    public static void m11942c(cwf0 cwf0Var, String str, DialogInterface dialogInterface) {
        Pair<String, ? extends dd80> pair = dlgPair;
        if (pair != null && Intrinsics.d(pair.getFirst(), str)) {
            dlgPair = null;
        }
        i0e.m16064e(cwf0Var);
    }

    /* JADX INFO: renamed from: d */
    public static void m11943d(Act act) {
        zvf0.r("e_intl_must_verify_popup_button_avatar", "p_intl_must_verify_popup");
        Frag fragI0 = act.getSupportFragmentManager().i0(TabName.Card.toString());
        Frag frag = fragI0 instanceof Frag ? fragI0 : null;
        if (!NullChecker.a(frag)) {
            CoreModule.P().i().D1(act);
            return;
        }
        qqh0 qqh0Var = qqh0.INSTANCE;
        frag.getClass();
        qqh0Var.m21184k(frag);
    }

    /* JADX INFO: renamed from: e */
    public static Boolean m11944e(UserStatus userStatus) {
        return Boolean.valueOf(TEnum.equals(userStatus, "RISK_TAG_MANDATORY_PICTURE_VERIFICATION_PROCESS") || TEnum.equals(userStatus, "RISK_TAG_MANDATORY_PICTURE_VERIFICATION_NEW"));
    }

    /* JADX INFO: renamed from: f */
    public static void m11945f(cwf0 cwf0Var, String str, DialogInterface dialogInterface) {
        Pair<String, ? extends dd80> pair = dlgPair;
        if (pair != null && Intrinsics.d(pair.getFirst(), str)) {
            dlgPair = null;
        }
        i0e.m16064e(cwf0Var);
    }

    /* JADX INFO: renamed from: g */
    public static void m11946g(Act act) {
        zvf0.r("e_intl_antispam_alive_verify", "p_intl_antispam_alive_popup");
        if (CoreModule.c.e0.d8()) {
            lsi0.w(R.string.u5);
        } else {
            tvf.h(act, "fromPicVerificationDlg");
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m11947h(Act act) {
        zvf0.r("e_intl_verify_popup_button_verify", "p_intl_must_verify_popup");
        if (CoreModule.c.e0.d8()) {
            lsi0.w(R.string.u5);
        } else if (TEnum.equals(CoreModule.c.B0.s4(), "pending")) {
            INSTANCE.m11960u(act, "auditing");
        } else {
            act.startActivity(VerificationCenterAct.X1(act, false));
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m11948i(Act act) {
        dd80 dd80Var;
        dd80 dd80Var2;
        if (act == null || !m11949j(act)) {
            return false;
        }
        if (act.isDialogShowing()) {
            act.getShowingDialog().dismiss();
        }
        Pair<String, ? extends dd80> pair = dlgPair;
        if (pair != null && (dd80Var = (dd80) pair.getSecond()) != null && dd80Var.isShowing()) {
            Pair<String, ? extends dd80> pair2 = dlgPair;
            if (pair2 != null && (dd80Var2 = (dd80) pair2.getSecond()) != null) {
                dd80Var2.dismiss();
            }
            dlgPair = null;
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m11949j(Context ctx) {
        if (ctx == null) {
            return false;
        }
        if (ctx instanceof Act) {
            Act act = (Act) ctx;
            if (act.isFinishing() || act.isDestroyed()) {
                return false;
            }
        }
        return m11953n();
    }

    /* JADX INFO: renamed from: k */
    public final void m11950k(Act act) {
        Pair<String, ? extends dd80> pair;
        dd80 dd80Var;
        dd80 dd80Var2;
        if (act == null || !m11949j(act) || (pair = dlgPair) == null || (dd80Var = (dd80) pair.getSecond()) == null || !dd80Var.isShowing()) {
            return;
        }
        Pair<String, ? extends dd80> pair2 = dlgPair;
        if (pair2 != null && (dd80Var2 = (dd80) pair2.getSecond()) != null) {
            dd80Var2.dismiss();
        }
        Pair<String, ? extends dd80> pair3 = dlgPair;
        if (Objects.equals(pair3 != null ? (String) pair3.getFirst() : null, "auditing")) {
            m11960u(act, "verified");
        }
        dlgPair = null;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m11951l(@Nullable Act act) {
        User userP9;
        if (act == null || !m11949j(act) || (userP9 = CoreModule.c.e0.p9()) == null) {
            return false;
        }
        Objects.toString(userP9.status);
        UserStatus userStatus = (UserStatus) vwb.r(userP9.status, new w9j() { // from class: l.ubp
            public final Object call(Object obj) {
                return bcp.m11944e((UserStatus) obj);
            }
        });
        Objects.toString(userStatus);
        if (userStatus == null) {
            m11950k(act);
            return false;
        }
        m11960u(act, TEnum.equals(userStatus, "RISK_TAG_MANDATORY_PICTURE_VERIFICATION_PROCESS") ? "auditing" : "need_verify");
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final void m11952m() {
        dd80 dd80Var;
        Pair<String, ? extends dd80> pair;
        dd80 dd80Var2;
        Objects.toString(dlgPair);
        Pair<String, ? extends dd80> pair2 = dlgPair;
        if (pair2 != null && (dd80Var = (dd80) pair2.getSecond()) != null && dd80Var.isShowing() && (pair = dlgPair) != null && (dd80Var2 = (dd80) pair.getSecond()) != null) {
            dd80Var2.dismiss();
        }
        dlgPair = null;
        controlEnable = null;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m11953n() {
        Boolean boolValueOf;
        Boolean bool = controlEnable;
        if (bool != null) {
            return bool.booleanValue();
        }
        String strM9623F = RemoteConfig.m9619x().m9623F("antispam_intl_forced_verify");
        strM9623F.getClass();
        boolean z = true;
        if (TextUtils.isEmpty(strM9623F)) {
            controlEnable = Boolean.TRUE;
            return true;
        }
        try {
            String string = JSON.parseObject(strM9623F).getString("verify_off");
            if (!TextUtils.isEmpty(string) && vwb.m(JSON.parseArray(string, Integer.TYPE), new w9j() { // from class: l.tbp
                public final Object call(Object obj) {
                    return bcp.m11941b(((Integer) obj).intValue());
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
    public final void m11954o(@Nullable Act act, int status) {
        m11956q(act, status == 1 ? "need_person_verify" : "auditing");
    }

    /* JADX INFO: renamed from: p */
    public final void m11955p(@Nullable Act act, int status) {
        m11956q(act, status == 1 ? "need_verify" : "auditing");
    }

    /* JADX INFO: renamed from: q */
    public final void m11956q(@Nullable Act act, @NotNull String status) {
        status.getClass();
        if (act == null || !m11949j(act)) {
            return;
        }
        j2e0.m(act, Uri.parse("tantan://intl_spam_control/verify_avatar").buildUpon().appendQueryParameter("status", status).build());
    }

    /* JADX INFO: renamed from: r */
    public final dd80 m11957r(Act act, final String status) {
        if (!m11948i(act)) {
            return null;
        }
        final cwf0 cwf0VarM16062c = i0e.m16062c("p_intl_review_popup", s4e.class.getName());
        dd80.a aVarN0 = new dd80.a(act).s0(R.string.w5, new Object[0]).S(x2c0.vj).x0(R.string.x5, new Object[0]).Z(R.string.xr).n0(new DialogInterface.OnDismissListener() { // from class: l.vbp
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                bcp.m11942c(cwf0VarM16062c, status, dialogInterface);
            }
        });
        i0e.m16065f(cwf0VarM16062c);
        return aVarN0.r0();
    }

    /* JADX INFO: renamed from: s */
    public final dd80 m11958s(final Act act, final String status) {
        if (!m11948i(act)) {
            return null;
        }
        final cwf0 cwf0VarM16062c = i0e.m16062c("p_intl_antispam_alive_popup", s4e.class.getName());
        dd80.a aVarN0 = new dd80.a(act).s0(R.string.q5, new Object[0]).x0(R.string.r5, new Object[0]).a0(R.string.s5, new Runnable() { // from class: l.wbp
            @Override // java.lang.Runnable
            public final void run() {
                bcp.m11946g(act);
            }
        }).n0(new DialogInterface.OnDismissListener() { // from class: l.xbp
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                bcp.m11940a(cwf0VarM16062c, status, dialogInterface);
            }
        });
        i0e.m16065f(cwf0VarM16062c);
        return aVarN0.r0();
    }

    /* JADX INFO: renamed from: t */
    public final dd80 m11959t(final Act act, final String status) {
        if (!m11948i(act)) {
            return null;
        }
        final cwf0 cwf0VarM16062c = i0e.m16062c("p_intl_must_verify_popup", Dialog.class.getName());
        act.getClass();
        dd80.a aVarN0 = new dd80.a(act).s0(R.string.y5, new Object[0]).a0(R.string.v5, new Runnable() { // from class: l.ybp
            @Override // java.lang.Runnable
            public final void run() {
                bcp.m11947h(act);
            }
        }).f0(R.string.t5, new Runnable() { // from class: l.zbp
            @Override // java.lang.Runnable
            public final void run() {
                bcp.m11943d(act);
            }
        }).S(x2c0.v8).x0(R.string.z5, new Object[0]).n0(new DialogInterface.OnDismissListener() { // from class: l.acp
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                bcp.m11945f(cwf0VarM16062c, status, dialogInterface);
            }
        });
        i0e.m16065f(cwf0VarM16062c);
        return aVarN0.r0();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: u */
    public final void m11960u(@NotNull Act act, @Nullable String status) {
        dd80 dd80VarM11959t;
        dd80 dd80VarM11958s;
        dd80 dd80VarM11957r;
        act.getClass();
        Pair<String, ? extends dd80> pair = dlgPair;
        if ((pair == null || !Objects.equals(pair.getFirst(), status)) && status != null) {
            switch (status.hashCode()) {
                case -1994383672:
                    if (status.equals("verified")) {
                        m11961v(act);
                        break;
                    }
                    break;
                case -557561790:
                    if (status.equals("need_verify") && (dd80VarM11959t = m11959t(act, status)) != null) {
                        dlgPair = new Pair<>(status, dd80VarM11959t);
                    }
                    break;
                case -41939782:
                    if (status.equals("need_person_verify") && (dd80VarM11958s = m11958s(act, status)) != null) {
                        dlgPair = new Pair<>(status, dd80VarM11958s);
                    }
                    break;
                case 976071207:
                    if (status.equals("auditing") && (dd80VarM11957r = m11957r(act, status)) != null) {
                        dlgPair = new Pair<>(status, dd80VarM11957r);
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final dd80 m11961v(Act act) {
        if (m11948i(act)) {
            return new dd80.a(act).s0(R.string.Ur, new Object[0]).S(x2c0.yj).x0(R.string.Vr, new Object[0]).Z(R.string.xr).r0();
        }
        return null;
    }
}
