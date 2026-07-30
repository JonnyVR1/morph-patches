package p006l;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.data.Prices;
import com.p1.mobile.putong.core.data.SalvagePopUser;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
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
import l.a60;
import l.cwf0;
import l.d30;
import l.e30;
import l.e60;
import l.g60;
import l.i0e;
import l.j760;
import l.mkd0;
import l.mqi0;
import l.qqi0;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0003J\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\bJ\r\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u0003Jw\u0010$\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0010\u0010\u001e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u001d2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001d2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001d2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b$\u0010%J\u007f\u0010)\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010&2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001d2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001d2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001d2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b)\u0010*J\u001d\u0010+\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b+\u0010\rJ\r\u0010,\u001a\u00020\t¢\u0006\u0004\b,\u0010-J-\u00100\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010/\u001a\u00020.2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b0\u00101R\u0016\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b2\u00103R$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010?\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010-\"\u0004\b=\u0010>R*\u0010D\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040A\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u001e\u0010I\u001a\n\u0012\u0004\u0012\u00020F\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR$\u0010Q\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010TR\u0017\u0010Z\u001a\u00020.8\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u0017\u0010\\\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b\u001a\u0010W\u001a\u0004\b[\u0010YR\u001a\u0010`\u001a\u00020]8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0012\u0010$\u001a\u0004\b^\u0010_R\u0014\u0010b\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u0010-¨\u0006c"}, d2 = {"Ll/u9p;", "", "<init>", "()V", "", "from", "", "q", "(Ljava/lang/String;)V", "", "isUltra", "isFromPayFail", "u", "(ZZ)Z", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/data/User;", "user", "k", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;Ljava/lang/String;)V", "payFromSalvageAction", "l", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Z)V", "x", "componentType", "w", "j", "Landroid/content/Context;", "ctx", "Ll/e30;", "onUnlock", "onInstantMatchSend", "onOpenProfile", "Landroid/content/DialogInterface;", "parentDialog", "parentActivity", "D", "(Landroid/content/Context;Ll/e30;Ll/e30;Ll/e30;ZLjava/lang/String;Landroid/content/DialogInterface;Lcom/p1/mobile/android/app/Act;)Z", "Ljava/lang/Runnable;", "onSuperLikeSend", "onLikeSend", "C", "(Landroid/content/Context;Ljava/lang/Runnable;Ll/e30;Ll/e30;Ll/e30;ZLjava/lang/String;Landroid/content/DialogInterface;Lcom/p1/mobile/android/app/Act;)Z", "B", "t", "()Z", "", "resultCode", "v", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;IZ)Z", "a", "Ljava/lang/String;", "b", "Lcom/p1/mobile/putong/data/User;", "getUser", "()Lcom/p1/mobile/putong/data/User;", "A", "(Lcom/p1/mobile/putong/data/User;)V", "c", "Z", "r", "y", "(Z)V", "isFromSalvage", "", "Ll/j760;", "d", "[Ll/j760;", "statisticsData", "Ll/g60;", "Landroid/content/Intent;", "e", "Ll/g60;", "activityResultLauncher", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "f", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "getSectionDetail", "()Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "z", "(Lcom/p1/mobile/putong/core/ui/purchase/d$a;)V", "sectionDetail", "Ljava/lang/ref/WeakReference;", "g", "Ljava/lang/ref/WeakReference;", "h", "i", "I", "n", "()I", "itemHeight", "o", "rvMaxWidth", "", "p", "()D", "rvRatio", "s", "isNewRegisterUser", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class u9p {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static User user;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static boolean isFromSalvage;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public static j760<String, String>[] statisticsData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public static g60<Intent> activityResultLauncher;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public static d.a sectionDetail;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public static WeakReference<DialogInterface> parentDialog;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public static WeakReference<Act> parentActivity;

    @NotNull
    public static final u9p INSTANCE = new u9p();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static String payFromSalvageAction = "";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public static final int itemHeight = (int) (((double) xdl0.w0()) * 0.25d);

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public static final int rvMaxWidth = xdl0.y0() - t100.d(64.0f);

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public static final double rvRatio = 1.555d;

    /* JADX INFO: renamed from: E */
    public static final Unit m25135E(cwf0 cwf0Var) {
        i0e.e(cwf0Var);
        parentActivity = null;
        parentDialog = null;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static void m25136a(User user2, int i, Act act, boolean z, c cVar) {
        if (NullChecker.a(user2)) {
            CoreModule.m1854P().m11706a().m5224Ao(i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue(), i == SwipeDirection.UP.getValue(), true, user2, act, "p_vas_paid_recovery_pop,e_vas_paid_recovery_component_click,click", z);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m25137b(cwf0 cwf0Var, DialogInterface dialogInterface) {
        i0e.e(cwf0Var);
    }

    /* JADX INFO: renamed from: d */
    public static void m25139d(final cwf0 cwf0Var, DialogInterface dialogInterface) {
        new Function0() { // from class: l.n9p
            public final Object invoke() {
                return u9p.m25135E(cwf0Var);
            }
        };
    }

    /* JADX INFO: renamed from: e */
    public static Boolean m25140e(c cVar) {
        cVar.getClass();
        return Boolean.valueOf(cVar == c.i);
    }

    /* JADX INFO: renamed from: f */
    public static Boolean m25141f(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: g */
    public static void m25142g(String str, final Act act, final boolean z) {
        final User user2 = user;
        if (user2 != null) {
            switch (str.hashCode()) {
                case -2003078698:
                    if (str.equals("seeProfile")) {
                        act.getClass();
                        g60<Intent> g60VarI = act.getActivityResultRegistry().i("from_intl_salvage_" + mqi0.o(), new e60(), new a60() { // from class: l.p9p
                            /* JADX INFO: renamed from: a */
                            public final void m21051a(Object obj) {
                                u9p.m25146m(act, user2, z, (ActivityResult) obj);
                            }
                        });
                        g60VarI.b(CoreModule.m1851K().Ar(act, ((DbObject) user2).id, "from_intl_salvage", true));
                        activityResultLauncher = g60VarI;
                    }
                    break;
                case -1736025870:
                    if (str.equals("superLiked")) {
                        CoreModule.m1854P().m11706a().m5224Ao(true, true, true, user2, act, "p_vas_paid_recovery_pop,e_vas_paid_recovery_component_click,click", false);
                    }
                    break;
                case -1321433458:
                    if (str.equals("oneMath")) {
                        INSTANCE.m25152k(act, user2, "p_vas_paid_recovery_pop");
                    }
                    break;
                case 102974381:
                    if (str.equals("liked")) {
                        CoreModule.m1854P().m11706a().m5224Ao(true, false, true, user2, act, "p_vas_paid_recovery_pop,e_vas_paid_recovery_component_click,click", false);
                    }
                    break;
            }
        }
        INSTANCE.m25151j();
        user = null;
    }

    /* JADX INFO: renamed from: h */
    public static void m25143h() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: l */
    public static final void m25145l(@NotNull final Act act, @NotNull final String payFromSalvageAction2, final boolean isUltra) {
        act.getClass();
        payFromSalvageAction2.getClass();
        act.postDelayed(new Runnable() { // from class: l.o9p
            @Override // java.lang.Runnable
            public final void run() {
                u9p.m25142g(payFromSalvageAction2, act, isUltra);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: m */
    public static final void m25146m(Act act, User user2, boolean z, ActivityResult activityResult) {
        INSTANCE.m25161v(act, user2, activityResult.b(), z);
    }

    /* JADX INFO: renamed from: A */
    public final void m25147A(@Nullable User user2) {
        user = user2;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m25148B(boolean isUltra, boolean isFromPayFail) {
        boolean zM25160u = m25160u(isUltra, isFromPayFail);
        t99 t99Var = CoreModule.f1534c.f3561H2;
        List<SalvagePopUser> list = t99Var.f21962U;
        List<SalvagePopUser> list2 = t99Var.f21961T;
        return zM25160u && (isUltra ? NullChecker.a(list) : NullChecker.a(list2)) && (!isUltra ? !(vwb.J(list2) || (list2.size() != 4 && list2.size() != 6)) : !(vwb.J(list) || (list.size() != 1 && list.size() != 4)));
    }

    /* JADX INFO: renamed from: C */
    public final boolean m25149C(@Nullable Context ctx, @Nullable Runnable onUnlock, @Nullable e30<User> onSuperLikeSend, @Nullable e30<User> onLikeSend, @Nullable e30<User> onOpenProfile, boolean isFromPayFail, @Nullable String from, @Nullable DialogInterface parentDialog2, @Nullable Act parentActivity2) {
        m25151j();
        parentDialog = null;
        parentActivity = null;
        if (!m25148B(false, isFromPayFail) || !NullChecker.a(CoreModule.f1534c.f3561H2.f21961T)) {
            return false;
        }
        List<? extends SalvagePopUser> list = CoreModule.f1534c.f3561H2.f21961T;
        list.getClass();
        if (vwb.J(list) || !(list.size() == 4 || list.size() == 6)) {
            return false;
        }
        final cwf0 cwf0VarC = i0e.c("p_vas_paid_recovery_pop", Dialog.class.getName());
        m25156q(from);
        j760<String, String>[] j760VarArr = statisticsData;
        if (j760VarArr != null) {
            cwf0VarC.p((j760[]) Arrays.copyOf(j760VarArr, j760VarArr.length));
        }
        CoreModule.f1534c.f3561H2.f21959R.put(Long.valueOf(mqi0.o()));
        parentDialog = parentDialog2 != null ? new WeakReference<>(parentDialog2) : null;
        parentActivity = parentActivity2 != null ? new WeakReference<>(parentActivity2) : null;
        f9p.Companion c0710b = f9p.INSTANCE;
        ctx.getClass();
        c0710b.m15237i(ctx, list.size() == 6, list, onUnlock, onSuperLikeSend, onLikeSend, onOpenProfile).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.l9p
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                u9p.m25137b(cwf0VarC, dialogInterface);
            }
        });
        i0e.f(cwf0VarC);
        return true;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m25150D(@Nullable Context ctx, @Nullable e30<User> onUnlock, @Nullable e30<User> onInstantMatchSend, @Nullable e30<User> onOpenProfile, boolean isFromPayFail, @Nullable String from, @Nullable DialogInterface parentDialog2, @Nullable Act parentActivity2) {
        m25151j();
        if (!m25148B(true, isFromPayFail) || !NullChecker.a(CoreModule.f1534c.f3561H2.f21962U)) {
            return false;
        }
        List<? extends SalvagePopUser> list = CoreModule.f1534c.f3561H2.f21962U;
        list.getClass();
        if (vwb.J(list) || !(list.size() == 1 || list.size() == 4)) {
            return false;
        }
        final cwf0 cwf0VarC = i0e.c("p_vas_paid_recovery_pop", Dialog.class.getName());
        m25156q(from);
        j760<String, String>[] j760VarArr = statisticsData;
        if (j760VarArr != null) {
            cwf0VarC.p((j760[]) Arrays.copyOf(j760VarArr, j760VarArr.length));
        }
        CoreModule.f1534c.f3561H2.f21960S.put(Long.valueOf(mqi0.o()));
        parentDialog = parentDialog2 != null ? new WeakReference<>(parentDialog2) : null;
        parentActivity = parentActivity2 != null ? new WeakReference<>(parentActivity2) : null;
        sjp.Companion c1266b = sjp.INSTANCE;
        ctx.getClass();
        c1266b.m23876i(ctx, list.size() == 4, list, onUnlock, onInstantMatchSend, onOpenProfile).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.m9p
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                u9p.m25139d(cwf0VarC, dialogInterface);
            }
        });
        i0e.f(cwf0VarC);
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final void m25151j() {
        payFromSalvageAction = "";
        isFromSalvage = false;
    }

    /* JADX INFO: renamed from: k */
    public final void m25152k(Act act, User user2, String from) {
        CoreModule.m1854P().m11706a().m5304Me(act, user2, from, new d30() { // from class: l.t9p
            public final void call() {
                u9p.m25143h();
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final int m25153n() {
        return itemHeight;
    }

    /* JADX INFO: renamed from: o */
    public final int m25154o() {
        return rvMaxWidth;
    }

    /* JADX INFO: renamed from: p */
    public final double m25155p() {
        return rvRatio;
    }

    /* JADX INFO: renamed from: q */
    public final void m25156q(String from) {
        d.a aVar = sectionDetail;
        if (aVar != null) {
            Prices prices = aVar.s().defaultStockKeepUnit.prices;
            prices.getClass();
            String str = prices.currencyCode;
            str.getClass();
            double d = prices.price;
            String str2 = aVar.s().defaultStockKeepUnit.id;
            str2.getClass();
            String string = aVar.f().toString();
            string.getClass();
            j760 j760VarY = vwb.Y("subtype", string);
            j760VarY.getClass();
            j760 j760VarY2 = vwb.Y("productType", string);
            j760VarY2.getClass();
            j760 j760VarY3 = vwb.Y("skuID", str2);
            j760VarY3.getClass();
            j760 j760VarY4 = vwb.Y("platform", "googleplay");
            j760VarY4.getClass();
            j760 j760VarY5 = vwb.Y("price", String.valueOf(d));
            j760VarY5.getClass();
            j760 j760VarY6 = vwb.Y("currency_code", str);
            j760VarY6.getClass();
            if (from == null) {
                from = "";
            }
            j760 j760VarY7 = vwb.Y("purchaseShowFrom", from);
            j760VarY7.getClass();
            statisticsData = new j760[]{j760VarY, j760VarY2, j760VarY3, j760VarY4, j760VarY5, j760VarY6, j760VarY7};
        }
    }

    /* JADX INFO: renamed from: r */
    public final boolean m25157r() {
        return isFromSalvage;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m25158s() {
        return true ^ qqi0.h(mqi0.o(), (long) CoreModule.f1534c.f3628e0.m21490p9().createdTime, 1);
    }

    /* JADX INFO: renamed from: t */
    public final boolean m25159t() {
        return (IntlCountryCodeController.m10k() || m25158s()) ? false : true;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m25160u(boolean isUltra, boolean isFromPayFail) {
        if (IntlCountryCodeController.m10k() || m25158s()) {
            return false;
        }
        if (isUltra ? xma.m27348C3() : xma.m27355L3()) {
            return false;
        }
        if (isFromPayFail) {
            return true;
        }
        Long l2 = isUltra ? (Long) CoreModule.f1534c.f3561H2.f21960S.get() : (Long) CoreModule.f1534c.f3561H2.f21959R.get();
        l2.getClass();
        return !mqi0.D(l2.longValue());
    }

    /* JADX INFO: renamed from: v */
    public final boolean m25161v(@NotNull final Act act, @NotNull final User user2, final int resultCode, final boolean isUltra) {
        act.getClass();
        user2.getClass();
        g60<Intent> g60Var = activityResultLauncher;
        if (g60Var != null) {
            g60Var.d();
        }
        activityResultLauncher = null;
        if (resultCode != SwipeDirection.RIGHT.getValue() && resultCode != SwipeDirection.LEFT.getValue() && resultCode != SwipeDirection.UP.getValue()) {
            return false;
        }
        rx.c cVarLifecycle = act.lifecycle();
        final Function1 function1 = new Function1() { // from class: l.q9p
            public final Object invoke(Object obj) {
                return u9p.m25140e((c) obj);
            }
        };
        cVarLifecycle.takeFirst(new w9j() { // from class: l.r9p
            public final Object call(Object obj) {
                return u9p.m25141f(function1, obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.s9p
            public final void call(Object obj) {
                u9p.m25136a(user2, resultCode, act, isUltra, (c) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: w */
    public final void m25162w(@NotNull String componentType) {
        componentType.getClass();
        j760<String, String>[] j760VarArr = statisticsData;
        if (j760VarArr != null) {
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.b(j760VarArr);
            spreadBuilder.a(vwb.Y("component_type", componentType));
            zvf0.u("e_vas_paid_recovery_component_click", "p_vas_paid_recovery_pop", (j760[]) spreadBuilder.d(new j760[spreadBuilder.c()]));
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m25163x() {
        j760<String, String>[] j760VarArr = statisticsData;
        if (j760VarArr != null) {
            zvf0.u("e_vas_paid_recovery_continue", "p_vas_paid_recovery_pop", (j760[]) Arrays.copyOf(j760VarArr, j760VarArr.length));
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m25164y(boolean z) {
        isFromSalvage = z;
    }

    /* JADX INFO: renamed from: z */
    public final void m25165z(@Nullable d.a aVar) {
        sectionDetail = aVar;
    }
}
