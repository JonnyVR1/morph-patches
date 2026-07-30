package p006l;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.visitor.myvisitors.MyVisitorRecoverHideFootPrintView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.data.ODiamondVisitorMessageGuideConfig;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l.cwf0;
import l.d30;
import l.dd80;
import l.e30;
import l.i0e;
import l.k6c0;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.o7r;
import l.qqi0;
import l.roj0;
import l.tpd0;
import l.zpd0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Ll/h120;", "", "<init>", "()V", "Companion", "a", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h120 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: l.h120$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006J\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0006J?\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010 J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u0004H\u0002¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"Ll/h120$a;", "", "<init>", "()V", "", "i", "()I", "g", "h", "j", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/data/User;", "user", "", "hidden", "Ll/e30;", "success", "", "from", "", "p", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;ZLl/e30;Ljava/lang/String;)V", "otherId", "n", "(Ljava/lang/String;)V", "k", "(Ljava/lang/String;)Z", "o", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;ZLl/e30;)V", "userLimitDaily", "q", "(Ljava/lang/String;I)Z", "conversationCloseIntervals", "l", "totalLimitDaily", "m", "(I)Z", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static void m16030a(Throwable th) {
        }

        /* JADX INFO: renamed from: b */
        public static void m16031b(dd80 dd80Var) {
            dd80Var.dismiss();
        }

        /* JADX INFO: renamed from: c */
        public static void m16032c(cwf0 cwf0Var, DialogInterface dialogInterface) {
            i0e.e(cwf0Var);
        }

        /* JADX INFO: renamed from: d */
        public static void m16033d(e30 e30Var, boolean z, roj0 roj0Var) {
            if (e30Var != null) {
                e30Var.call(Boolean.valueOf(z));
            }
        }

        /* JADX INFO: renamed from: e */
        public static void m16034e(User user, e30 e30Var, Boolean bool) {
            lsi0.y("已对" + (user.isFemale() ? "她" : "他") + "隐藏访问足迹");
            if (e30Var != null) {
                e30Var.call(bool);
            }
        }

        /* JADX INFO: renamed from: f */
        public static void m16035f(dd80 dd80Var, Act act, User user, e30 e30Var) {
            dd80Var.dismiss();
            CoreModule.f1534c.f3657n2.m22277l4();
            h120.INSTANCE.m16044o(act, user, false, e30Var);
        }

        /* JADX INFO: renamed from: g */
        public final int m16036g() {
            return RemoteConfig.x().z("vas_hide_visit_banner_show_times_someone_daily", 3);
        }

        /* JADX INFO: renamed from: h */
        public final int m16037h() {
            return RemoteConfig.x().z("vas_diamond_hide_visit_visit_other_times", 5);
        }

        /* JADX INFO: renamed from: i */
        public final int m16038i() {
            return RemoteConfig.x().z("vas_hide_visit_banner_show_total_times_daily", 10);
        }

        /* JADX INFO: renamed from: j */
        public final int m16039j() {
            return RemoteConfig.x().z("vas_diamond_hide_visit_privilege_count_permonth", 20);
        }

        /* JADX INFO: renamed from: k */
        public final boolean m16040k(@NotNull String otherId) {
            otherId.getClass();
            ODiamondVisitorMessageGuideConfig oDiamondVisitorMessageGuideConfig = (ODiamondVisitorMessageGuideConfig) RemoteConfig.x().v("vas_message_visitor_banner_config", ODiamondVisitorMessageGuideConfig.JSON_ADAPTER);
            if (NullChecker.a(oDiamondVisitorMessageGuideConfig)) {
                return (m16046q(otherId, oDiamondVisitorMessageGuideConfig.user_limit_daily) || m16041l(otherId, oDiamondVisitorMessageGuideConfig.conversation_close_intervals) || m16042m(oDiamondVisitorMessageGuideConfig.total_limit_daily)) ? false : true;
            }
            return true;
        }

        /* JADX INFO: renamed from: l */
        public final boolean m16041l(String otherId, int conversationCloseIntervals) {
            Long l2 = (Long) new zpd0("click_close_o_diamond_visitor_guide_time_" + otherId + CoreModule.m1850H().userId(), 0L).get();
            long jO = mqi0.o();
            l2.getClass();
            return qqi0.g(jO, l2.longValue(), conversationCloseIntervals);
        }

        /* JADX INFO: renamed from: m */
        public final boolean m16042m(int totalLimitDaily) {
            tpd0 tpd0Var = new tpd0("my_o_diamond_visitor_message_show_today_count_" + CoreModule.m1850H().userId(), 0);
            zpd0 zpd0Var = new zpd0("my_o_diamond_visitor_message_show_last_time_" + CoreModule.m1850H().userId(), 0L);
            Object obj = zpd0Var.get();
            obj.getClass();
            if (mqi0.D(((Number) obj).longValue())) {
                tpd0Var.a(1);
            } else {
                zpd0Var.put(Long.valueOf(mqi0.o()));
                tpd0Var.put(1);
            }
            return ((Number) tpd0Var.get()).intValue() > totalLimitDaily;
        }

        /* JADX INFO: renamed from: n */
        public final void m16043n(@NotNull String otherId) {
            otherId.getClass();
            new zpd0("click_close_o_diamond_visitor_guide_time_" + otherId + CoreModule.m1850H().userId(), 0L).put(Long.valueOf(mqi0.o()));
        }

        /* JADX INFO: renamed from: o */
        public final void m16044o(Act act, User user, final boolean hidden, final e30<Boolean> success) {
            act.duringCreated(CoreModule.f1534c.f3657n2.m22278m4(((DbObject) user).id, hidden)).subscribe(mkd0.H(new e30() { // from class: l.f120
                public final void call(Object obj) {
                    h120.Companion.m16033d(success, hidden, (roj0) obj);
                }
            }, new e30() { // from class: l.g120
                public final void call(Object obj) {
                    h120.Companion.m16030a((Throwable) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: p */
        public final void m16045p(@NotNull final Act act, @NotNull final User user, boolean hidden, @Nullable final e30<Boolean> success, @Nullable String from) {
            act.getClass();
            user.getClass();
            if (hidden) {
                if (!xma.m27351F3()) {
                    CoreModule.m1854P().m11706a().m5555wh(act, from, null, null, null, Privilege.visitor_hide_footprint);
                    return;
                } else if (xma.m27346A4() <= 0) {
                    lsi0.y("本月特权次数已用完");
                    return;
                } else {
                    m16044o(act, user, true, new e30() { // from class: l.b120
                        public final void call(Object obj) {
                            h120.Companion.m16034e(user, success, (Boolean) obj);
                        }
                    });
                    return;
                }
            }
            if (!CoreModule.f1534c.f3657n2.m22279n4()) {
                m16044o(act, user, false, success);
                return;
            }
            final cwf0 cwf0Var = new cwf0("p_recover_records_confirm", Dialog.class.getName());
            View viewInflate = o7r.a(act).inflate(k6c0.W1, (ViewGroup) null);
            viewInflate.getClass();
            MyVisitorRecoverHideFootPrintView myVisitorRecoverHideFootPrintView = (MyVisitorRecoverHideFootPrintView) viewInflate;
            final dd80 dd80VarO = new dd80.a(act).R(myVisitorRecoverHideFootPrintView).P(false).n0(new DialogInterface.OnDismissListener() { // from class: l.c120
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    h120.Companion.m16032c(cwf0Var, dialogInterface);
                }
            }).O();
            myVisitorRecoverHideFootPrintView.m11556e(user, new d30() { // from class: l.d120
                public final void call() {
                    h120.Companion.m16035f(dd80VarO, act, user, success);
                }
            }, new d30() { // from class: l.e120
                public final void call() {
                    h120.Companion.m16031b(dd80VarO);
                }
            });
            dd80VarO.show();
            i0e.f(cwf0Var);
        }

        /* JADX INFO: renamed from: q */
        public final boolean m16046q(String otherId, int userLimitDaily) {
            zpd0 zpd0Var = new zpd0("my_o_diamond_visitor_message_user_" + otherId + "_last_time_" + CoreModule.m1850H().userId(), 0L);
            tpd0 tpd0Var = new tpd0("my_o_diamond_visitor_message_show_user_" + otherId + "_today_count_" + CoreModule.m1850H().userId(), 0);
            Object obj = zpd0Var.get();
            obj.getClass();
            if (!mqi0.D(((Number) obj).longValue())) {
                tpd0Var.put(1);
                zpd0Var.put(Long.valueOf(mqi0.o()));
            }
            if (((Number) tpd0Var.get()).intValue() > userLimitDaily) {
                return true;
            }
            tpd0Var.a(1);
            return false;
        }

        public Companion() {
        }
    }
}
