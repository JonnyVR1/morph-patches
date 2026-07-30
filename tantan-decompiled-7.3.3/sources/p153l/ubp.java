package p153l;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Prices;
import com.p051p1.mobile.putong.core.data.SalvagePopUser;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0003J\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\bJ\r\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u0003Jw\u0010$\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0010\u0010\u001e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u001d2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001d2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001d2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b$\u0010%J\u007f\u0010)\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010&2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001d2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001d2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001d2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b)\u0010*J\u001d\u0010+\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b+\u0010\rJ\r\u0010,\u001a\u00020\t¢\u0006\u0004\b,\u0010-J-\u00100\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010/\u001a\u00020.2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b0\u00101R\u0016\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b2\u00103R$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010?\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010-\"\u0004\b=\u0010>R*\u0010D\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040A\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u001e\u0010I\u001a\n\u0012\u0004\u0012\u00020F\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR$\u0010Q\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010TR\u0017\u0010Z\u001a\u00020.8\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u0017\u0010\\\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b\u001a\u0010W\u001a\u0004\b[\u0010YR\u001a\u0010`\u001a\u00020]8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0012\u0010$\u001a\u0004\b^\u0010_R\u0014\u0010b\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u0010-¨\u0006c"}, m88121d2 = {"Ll/ubp;", "", "<init>", "()V", "", "from", "", "q", "(Ljava/lang/String;)V", "", "isUltra", "isFromPayFail", "u", "(ZZ)Z", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/data/User;", "user", "k", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;Ljava/lang/String;)V", "payFromSalvageAction", BLiveStormDanmakuGiftResourceType.f45292l, "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Z)V", BaseSei.f14624X, "componentType", "w", "j", "Landroid/content/Context;", "ctx", "Ll/y20;", "onUnlock", "onInstantMatchSend", "onOpenProfile", "Landroid/content/DialogInterface;", "parentDialog", "parentActivity", "D", "(Landroid/content/Context;Ll/y20;Ll/y20;Ll/y20;ZLjava/lang/String;Landroid/content/DialogInterface;Lcom/p1/mobile/android/app/Act;)Z", "Ljava/lang/Runnable;", "onSuperLikeSend", "onLikeSend", c4s.C_ZONE, "(Landroid/content/Context;Ljava/lang/Runnable;Ll/y20;Ll/y20;Ll/y20;ZLjava/lang/String;Landroid/content/DialogInterface;Lcom/p1/mobile/android/app/Act;)Z", "B", Constants.KEY_T, "()Z", "", "resultCode", ResourceDirection.f39656v, "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;IZ)Z", "a", "Ljava/lang/String;", "b", "Lcom/p1/mobile/putong/data/User;", "getUser", "()Lcom/p1/mobile/putong/data/User;", "A", "(Lcom/p1/mobile/putong/data/User;)V", "c", "Z", "r", BaseSei.f14625Y, "(Z)V", "isFromSalvage", "", "Ll/pf60;", Constants.INAPP_DATA_TAG, "[Ll/pf60;", "statisticsData", "Ll/c60;", "Landroid/content/Intent;", "e", "Ll/c60;", "activityResultLauncher", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "f", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "getSectionDetail", "()Lcom/p1/mobile/putong/core/ui/purchase/d$a;", BaseSei.f14626Z, "(Lcom/p1/mobile/putong/core/ui/purchase/d$a;)V", "sectionDetail", "Ljava/lang/ref/WeakReference;", "g", "Ljava/lang/ref/WeakReference;", "h", RXScreenCaptureService.KEY_INDEX, "I", "n", "()I", "itemHeight", "o", "rvMaxWidth", "", "p", "()D", "rvRatio", BLiveStormDanmakuGiftResourceType.f45294s, "isNewRegisterUser", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ubp {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static User user;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static boolean isFromSalvage;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public static pf60<String, String>[] statisticsData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public static c60<Intent> activityResultLauncher;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public static C8928d.a sectionDetail;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public static WeakReference<DialogInterface> parentDialog;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public static WeakReference<Act> parentActivity;

    @NotNull
    public static final ubp INSTANCE = new ubp();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static String payFromSalvageAction = "";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public static final int itemHeight = (int) (((double) bnl0.m105588w0()) * 0.25d);

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public static final int rvMaxWidth = bnl0.m105592y0() - qa00.m175859d(64.0f);

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public static final double rvRatio = 1.555d;

    /* JADX INFO: renamed from: E */
    public static final Unit m195261E(l4g0 l4g0Var) {
        w1e.m204401e(l4g0Var);
        parentActivity = null;
        parentDialog = null;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static void m195262a(User user2, int i, Act act, boolean z, C4470c c4470c) {
        if (NullChecker.m82486a(user2)) {
            CoreModule.m30933P().m143405a().mo34290Ao(i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue(), i == SwipeDirection.UP.getValue(), true, user2, act, "p_vas_paid_recovery_pop,e_vas_paid_recovery_component_click,click", z);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m195263b(l4g0 l4g0Var, DialogInterface dialogInterface) {
        w1e.m204401e(l4g0Var);
    }

    /* JADX INFO: renamed from: d */
    public static void m195265d(final l4g0 l4g0Var, DialogInterface dialogInterface) {
        new Function0() { // from class: l.nbp
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ubp.m195261E(l4g0Var);
            }
        };
    }

    /* JADX INFO: renamed from: e */
    public static Boolean m195266e(C4470c c4470c) {
        c4470c.getClass();
        return Boolean.valueOf(c4470c == C4470c.f16267i);
    }

    /* JADX INFO: renamed from: f */
    public static Boolean m195267f(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: g */
    public static void m195268g(String str, final Act act, final boolean z) {
        final User user2 = user;
        if (user2 != null) {
            switch (str.hashCode()) {
                case -2003078698:
                    if (str.equals("seeProfile")) {
                        act.getClass();
                        c60<Intent> c60VarM212i = act.getActivityResultRegistry().m212i("from_intl_salvage_" + pzi0.m174454o(), new a60(), new w50() { // from class: l.pbp
                            @Override // p153l.w50
                            /* JADX INFO: renamed from: a */
                            public final void mo2611a(Object obj) {
                                ubp.m195272m(act, user2, z, (ActivityResult) obj);
                            }
                        });
                        c60VarM212i.m108087b(CoreModule.m30930K().mo31676Ar(act, user2.f56859id, "from_intl_salvage", true));
                        activityResultLauncher = c60VarM212i;
                    }
                    break;
                case -1736025870:
                    if (str.equals(MatchFrom.superLiked)) {
                        CoreModule.m30933P().m143405a().mo34290Ao(true, true, true, user2, act, "p_vas_paid_recovery_pop,e_vas_paid_recovery_component_click,click", false);
                    }
                    break;
                case -1321433458:
                    if (str.equals("oneMath")) {
                        INSTANCE.m195278k(act, user2, "p_vas_paid_recovery_pop");
                    }
                    break;
                case 102974381:
                    if (str.equals("liked")) {
                        CoreModule.m30933P().m143405a().mo34290Ao(true, false, true, user2, act, "p_vas_paid_recovery_pop,e_vas_paid_recovery_component_click,click", false);
                    }
                    break;
            }
        }
        INSTANCE.m195277j();
        user = null;
    }

    /* JADX INFO: renamed from: h */
    public static void m195269h() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: l */
    public static final void m195271l(@NotNull final Act act, @NotNull final String payFromSalvageAction2, final boolean isUltra) {
        act.getClass();
        payFromSalvageAction2.getClass();
        act.postDelayed(new Runnable() { // from class: l.obp
            @Override // java.lang.Runnable
            public final void run() {
                ubp.m195268g(payFromSalvageAction2, act, isUltra);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: m */
    public static final void m195272m(Act act, User user2, boolean z, ActivityResult activityResult) {
        INSTANCE.m195287v(act, user2, activityResult.m202b(), z);
    }

    /* JADX INFO: renamed from: A */
    public final void m195273A(@Nullable User user2) {
        user = user2;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m195274B(boolean isUltra, boolean isFromPayFail) {
        boolean zM195286u = m195286u(isUltra, isFromPayFail);
        cb9 cb9Var = CoreModule.f18264c.f20314H2;
        List<SalvagePopUser> list = cb9Var.f80713U;
        List<SalvagePopUser> list2 = cb9Var.f80712T;
        return zM195286u && (isUltra ? NullChecker.m82486a(list) : NullChecker.m82486a(list2)) && (!isUltra ? !(jyb.m147479J(list2) || (list2.size() != 4 && list2.size() != 6)) : !(jyb.m147479J(list) || (list.size() != 1 && list.size() != 4)));
    }

    /* JADX INFO: renamed from: C */
    public final boolean m195275C(@Nullable Context ctx, @Nullable Runnable onUnlock, @Nullable y20<User> onSuperLikeSend, @Nullable y20<User> onLikeSend, @Nullable y20<User> onOpenProfile, boolean isFromPayFail, @Nullable String from, @Nullable DialogInterface parentDialog2, @Nullable Act parentActivity2) {
        m195277j();
        parentDialog = null;
        parentActivity = null;
        if (!m195274B(false, isFromPayFail) || !NullChecker.m82486a(CoreModule.f18264c.f20314H2.f80712T)) {
            return false;
        }
        List<SalvagePopUser> list = CoreModule.f18264c.f20314H2.f80712T;
        list.getClass();
        if (jyb.m147479J(list) || !(list.size() == 4 || list.size() == 6)) {
            return false;
        }
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_vas_paid_recovery_pop", Dialog.class.getName());
        m195282q(from);
        pf60<String, String>[] pf60VarArr = statisticsData;
        if (pf60VarArr != null) {
            l4g0VarM204399c.m152781p((pf60[]) Arrays.copyOf(pf60VarArr, pf60VarArr.length));
        }
        CoreModule.f18264c.f20314H2.f80710R.put(Long.valueOf(pzi0.m174454o()));
        parentDialog = parentDialog2 != null ? new WeakReference<>(parentDialog2) : null;
        parentActivity = parentActivity2 != null ? new WeakReference<>(parentActivity2) : null;
        fbp.Companion c16939b = fbp.INSTANCE;
        ctx.getClass();
        c16939b.m124913i(ctx, list.size() == 6, list, onUnlock, onSuperLikeSend, onLikeSend, onOpenProfile).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.lbp
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ubp.m195263b(l4g0VarM204399c, dialogInterface);
            }
        });
        w1e.m204402f(l4g0VarM204399c);
        return true;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m195276D(@Nullable Context ctx, @Nullable y20<User> onUnlock, @Nullable y20<User> onInstantMatchSend, @Nullable y20<User> onOpenProfile, boolean isFromPayFail, @Nullable String from, @Nullable DialogInterface parentDialog2, @Nullable Act parentActivity2) {
        m195277j();
        if (!m195274B(true, isFromPayFail) || !NullChecker.m82486a(CoreModule.f18264c.f20314H2.f80713U)) {
            return false;
        }
        List<SalvagePopUser> list = CoreModule.f18264c.f20314H2.f80713U;
        list.getClass();
        if (jyb.m147479J(list) || !(list.size() == 1 || list.size() == 4)) {
            return false;
        }
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_vas_paid_recovery_pop", Dialog.class.getName());
        m195282q(from);
        pf60<String, String>[] pf60VarArr = statisticsData;
        if (pf60VarArr != null) {
            l4g0VarM204399c.m152781p((pf60[]) Arrays.copyOf(pf60VarArr, pf60VarArr.length));
        }
        CoreModule.f18264c.f20314H2.f80711S.put(Long.valueOf(pzi0.m174454o()));
        parentDialog = parentDialog2 != null ? new WeakReference<>(parentDialog2) : null;
        parentActivity = parentActivity2 != null ? new WeakReference<>(parentActivity2) : null;
        slp.Companion c20096b = slp.INSTANCE;
        ctx.getClass();
        c20096b.m186615i(ctx, list.size() == 4, list, onUnlock, onInstantMatchSend, onOpenProfile).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.mbp
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ubp.m195265d(l4g0VarM204399c, dialogInterface);
            }
        });
        w1e.m204402f(l4g0VarM204399c);
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final void m195277j() {
        payFromSalvageAction = "";
        isFromSalvage = false;
    }

    /* JADX INFO: renamed from: k */
    public final void m195278k(Act act, User user2, String from) {
        CoreModule.m30933P().m143405a().mo34370Me(act, user2, from, new x20() { // from class: l.tbp
            @Override // p153l.x20
            public final void call() {
                ubp.m195269h();
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final int m195279n() {
        return itemHeight;
    }

    /* JADX INFO: renamed from: o */
    public final int m195280o() {
        return rvMaxWidth;
    }

    /* JADX INFO: renamed from: p */
    public final double m195281p() {
        return rvRatio;
    }

    /* JADX INFO: renamed from: q */
    public final void m195282q(String from) {
        C8928d.a aVar = sectionDetail;
        if (aVar != null) {
            Prices prices = aVar.m54784s().defaultStockKeepUnit.prices;
            prices.getClass();
            String str = prices.currencyCode;
            str.getClass();
            double d = prices.price;
            String str2 = aVar.m54784s().defaultStockKeepUnit.f21249id;
            str2.getClass();
            String string = aVar.m54762f().toString();
            string.getClass();
            pf60 pf60VarM147494Y = jyb.m147494Y("subtype", string);
            pf60VarM147494Y.getClass();
            pf60 pf60VarM147494Y2 = jyb.m147494Y("productType", string);
            pf60VarM147494Y2.getClass();
            pf60 pf60VarM147494Y3 = jyb.m147494Y("skuID", str2);
            pf60VarM147494Y3.getClass();
            pf60 pf60VarM147494Y4 = jyb.m147494Y("platform", "googleplay");
            pf60VarM147494Y4.getClass();
            pf60 pf60VarM147494Y5 = jyb.m147494Y(FirebaseAnalytics.Param.PRICE, String.valueOf(d));
            pf60VarM147494Y5.getClass();
            pf60 pf60VarM147494Y6 = jyb.m147494Y("currency_code", str);
            pf60VarM147494Y6.getClass();
            if (from == null) {
                from = "";
            }
            pf60 pf60VarM147494Y7 = jyb.m147494Y("purchaseShowFrom", from);
            pf60VarM147494Y7.getClass();
            statisticsData = new pf60[]{pf60VarM147494Y, pf60VarM147494Y2, pf60VarM147494Y3, pf60VarM147494Y4, pf60VarM147494Y5, pf60VarM147494Y6, pf60VarM147494Y7};
        }
    }

    /* JADX INFO: renamed from: r */
    public final boolean m195283r() {
        return isFromSalvage;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m195284s() {
        return true ^ tzi0.m193670h(pzi0.m174454o(), (long) CoreModule.f18264c.f20381e0.m116600p9().createdTime, 1);
    }

    /* JADX INFO: renamed from: t */
    public final boolean m195285t() {
        return (IntlCountryCodeController.m29114k() || m195284s()) ? false : true;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m195286u(boolean isUltra, boolean isFromPayFail) {
        if (IntlCountryCodeController.m29114k() || m195284s()) {
            return false;
        }
        if (isUltra ? joa.m146354D3() : joa.m146361M3()) {
            return false;
        }
        if (isFromPayFail) {
            return true;
        }
        Long l2 = isUltra ? CoreModule.f18264c.f20314H2.f80711S.get() : CoreModule.f18264c.f20314H2.f80710R.get();
        l2.getClass();
        return !pzi0.m174439D(l2.longValue());
    }

    /* JADX INFO: renamed from: v */
    public final boolean m195287v(@NotNull final Act act, @NotNull final User user2, final int resultCode, final boolean isUltra) {
        act.getClass();
        user2.getClass();
        c60<Intent> c60Var = activityResultLauncher;
        if (c60Var != null) {
            c60Var.mo218d();
        }
        activityResultLauncher = null;
        if (resultCode != SwipeDirection.RIGHT.getValue() && resultCode != SwipeDirection.LEFT.getValue() && resultCode != SwipeDirection.UP.getValue()) {
            return false;
        }
        C22421c<C4470c> c22421cLifecycle = act.lifecycle();
        final Function1 function1 = new Function1() { // from class: l.qbp
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ubp.m195266e((C4470c) obj);
            }
        };
        c22421cLifecycle.takeFirst(new qcj() { // from class: l.rbp
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ubp.m195267f(function1, obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.sbp
            @Override // p153l.y20
            public final void call(Object obj) {
                ubp.m195262a(user2, resultCode, act, isUltra, (C4470c) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: w */
    public final void m195288w(@NotNull String componentType) {
        componentType.getClass();
        pf60<String, String>[] pf60VarArr = statisticsData;
        if (pf60VarArr != null) {
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.m88420b(pf60VarArr);
            spreadBuilder.m88419a(jyb.m147494Y("component_type", componentType));
            i4g0.m138523u("e_vas_paid_recovery_component_click", "p_vas_paid_recovery_pop", (pf60[]) spreadBuilder.m88422d(new pf60[spreadBuilder.m88421c()]));
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m195289x() {
        pf60<String, String>[] pf60VarArr = statisticsData;
        if (pf60VarArr != null) {
            i4g0.m138523u("e_vas_paid_recovery_continue", "p_vas_paid_recovery_pop", (pf60[]) Arrays.copyOf(pf60VarArr, pf60VarArr.length));
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m195290y(boolean z) {
        isFromSalvage = z;
    }

    /* JADX INFO: renamed from: z */
    public final void m195291z(@Nullable C8928d.a aVar) {
        sectionDetail = aVar;
    }
}
