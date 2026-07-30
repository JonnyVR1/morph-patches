package p153l;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ODiamondVisitorMessageGuideConfig;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.p058ui.visitor.myvisitors.MyVisitorRecoverHideFootPrintView;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m88121d2 = {"Ll/p920;", "", "<init>", "()V", "Companion", "a", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class p920 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: l.p920$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006J\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0006J?\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010 J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u0004H\u0002¢\u0006\u0004\b$\u0010%¨\u0006&"}, m88121d2 = {"Ll/p920$a;", "", "<init>", "()V", "", RXScreenCaptureService.KEY_INDEX, "()I", "g", "h", "j", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/data/User;", "user", "", "hidden", "Ll/y20;", "success", "", "from", "", "p", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;ZLl/y20;Ljava/lang/String;)V", "otherId", "n", "(Ljava/lang/String;)V", "k", "(Ljava/lang/String;)Z", "o", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;ZLl/y20;)V", "userLimitDaily", "q", "(Ljava/lang/String;I)Z", "conversationCloseIntervals", BLiveStormDanmakuGiftResourceType.f45292l, "totalLimitDaily", "m", "(I)Z", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static void m171317a(Throwable th) {
        }

        /* JADX INFO: renamed from: b */
        public static void m171318b(jl80 jl80Var) {
            jl80Var.dismiss();
        }

        /* JADX INFO: renamed from: c */
        public static void m171319c(l4g0 l4g0Var, DialogInterface dialogInterface) {
            w1e.m204401e(l4g0Var);
        }

        /* JADX INFO: renamed from: d */
        public static void m171320d(y20 y20Var, boolean z, uxj0 uxj0Var) {
            if (y20Var != null) {
                y20Var.call(Boolean.valueOf(z));
            }
        }

        /* JADX INFO: renamed from: e */
        public static void m171321e(User user, y20 y20Var, Boolean bool) {
            o1j0.m165651y("已对" + (user.isFemale() ? "她" : "他") + "隐藏访问足迹");
            if (y20Var != null) {
                y20Var.call(bool);
            }
        }

        /* JADX INFO: renamed from: f */
        public static void m171322f(jl80 jl80Var, Act act, User user, y20 y20Var) {
            jl80Var.dismiss();
            CoreModule.f18264c.f20410n2.m121492l4();
            p920.INSTANCE.m171331o(act, user, false, y20Var);
        }

        /* JADX INFO: renamed from: g */
        public final int m171323g() {
            return RemoteConfig.m80481x().m80519z("vas_hide_visit_banner_show_times_someone_daily", 3);
        }

        /* JADX INFO: renamed from: h */
        public final int m171324h() {
            return RemoteConfig.m80481x().m80519z("vas_diamond_hide_visit_visit_other_times", 5);
        }

        /* JADX INFO: renamed from: i */
        public final int m171325i() {
            return RemoteConfig.m80481x().m80519z("vas_hide_visit_banner_show_total_times_daily", 10);
        }

        /* JADX INFO: renamed from: j */
        public final int m171326j() {
            return RemoteConfig.m80481x().m80519z("vas_diamond_hide_visit_privilege_count_permonth", 20);
        }

        /* JADX INFO: renamed from: k */
        public final boolean m171327k(@NotNull String otherId) {
            otherId.getClass();
            ODiamondVisitorMessageGuideConfig oDiamondVisitorMessageGuideConfig = (ODiamondVisitorMessageGuideConfig) RemoteConfig.m80481x().m80516v("vas_message_visitor_banner_config", ODiamondVisitorMessageGuideConfig.JSON_ADAPTER);
            if (NullChecker.m82486a(oDiamondVisitorMessageGuideConfig)) {
                return (m171333q(otherId, oDiamondVisitorMessageGuideConfig.user_limit_daily) || m171328l(otherId, oDiamondVisitorMessageGuideConfig.conversation_close_intervals) || m171329m(oDiamondVisitorMessageGuideConfig.total_limit_daily)) ? false : true;
            }
            return true;
        }

        /* JADX INFO: renamed from: l */
        public final boolean m171328l(String otherId, int conversationCloseIntervals) {
            Long l2 = new byd0("click_close_o_diamond_visitor_guide_time_" + otherId + CoreModule.m30929H().userId(), 0L).get();
            long jM174454o = pzi0.m174454o();
            l2.getClass();
            return tzi0.m193669g(jM174454o, l2.longValue(), conversationCloseIntervals);
        }

        /* JADX INFO: renamed from: m */
        public final boolean m171329m(int totalLimitDaily) {
            vxd0 vxd0Var = new vxd0("my_o_diamond_visitor_message_show_today_count_" + CoreModule.m30929H().userId(), 0);
            byd0 byd0Var = new byd0("my_o_diamond_visitor_message_show_last_time_" + CoreModule.m30929H().userId(), 0L);
            Long l2 = byd0Var.get();
            l2.getClass();
            if (pzi0.m174439D(l2.longValue())) {
                vxd0Var.m203841a(1);
            } else {
                byd0Var.put(Long.valueOf(pzi0.m174454o()));
                vxd0Var.put(1);
            }
            return vxd0Var.get().intValue() > totalLimitDaily;
        }

        /* JADX INFO: renamed from: n */
        public final void m171330n(@NotNull String otherId) {
            otherId.getClass();
            new byd0("click_close_o_diamond_visitor_guide_time_" + otherId + CoreModule.m30929H().userId(), 0L).put(Long.valueOf(pzi0.m174454o()));
        }

        /* JADX INFO: renamed from: o */
        public final void m171331o(Act act, User user, final boolean hidden, final y20<Boolean> success) {
            act.duringCreated(CoreModule.f18264c.f20410n2.m121493m4(user.f56859id, hidden)).subscribe(psd0.m173597H(new y20() { // from class: l.n920
                @Override // p153l.y20
                public final void call(Object obj) {
                    p920.Companion.m171320d(success, hidden, (uxj0) obj);
                }
            }, new y20() { // from class: l.o920
                @Override // p153l.y20
                public final void call(Object obj) {
                    p920.Companion.m171317a((Throwable) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: p */
        public final void m171332p(@NotNull final Act act, @NotNull final User user, boolean hidden, @Nullable final y20<Boolean> success, @Nullable String from) {
            act.getClass();
            user.getClass();
            if (hidden) {
                if (!joa.m146357G3()) {
                    CoreModule.m30933P().m143405a().mo34621wh(act, from, null, null, null, Privilege.visitor_hide_footprint);
                    return;
                } else if (joa.m146352B4() <= 0) {
                    o1j0.m165651y("本月特权次数已用完");
                    return;
                } else {
                    m171331o(act, user, true, new y20() { // from class: l.j920
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            p920.Companion.m171321e(user, success, (Boolean) obj);
                        }
                    });
                    return;
                }
            }
            if (!CoreModule.f18264c.f20410n2.m121494n4()) {
                m171331o(act, user, false, success);
                return;
            }
            final l4g0 l4g0Var = new l4g0("p_recover_records_confirm", Dialog.class.getName());
            View viewInflate = p9r.m171370a(act).inflate(pec0.f151955W1, (ViewGroup) null);
            viewInflate.getClass();
            MyVisitorRecoverHideFootPrintView myVisitorRecoverHideFootPrintView = (MyVisitorRecoverHideFootPrintView) viewInflate;
            final jl80 jl80VarM146020O = new jl80.C17971a(act).m146023R(myVisitorRecoverHideFootPrintView).m146021P(false).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.k920
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    p920.Companion.m171319c(l4g0Var, dialogInterface);
                }
            }).m146020O();
            myVisitorRecoverHideFootPrintView.m59215e(user, new x20() { // from class: l.l920
                @Override // p153l.x20
                public final void call() {
                    p920.Companion.m171322f(jl80VarM146020O, act, user, success);
                }
            }, new x20() { // from class: l.m920
                @Override // p153l.x20
                public final void call() {
                    p920.Companion.m171318b(jl80VarM146020O);
                }
            });
            jl80VarM146020O.show();
            w1e.m204402f(l4g0Var);
        }

        /* JADX INFO: renamed from: q */
        public final boolean m171333q(String otherId, int userLimitDaily) {
            byd0 byd0Var = new byd0("my_o_diamond_visitor_message_user_" + otherId + "_last_time_" + CoreModule.m30929H().userId(), 0L);
            vxd0 vxd0Var = new vxd0("my_o_diamond_visitor_message_show_user_" + otherId + "_today_count_" + CoreModule.m30929H().userId(), 0);
            Long l2 = byd0Var.get();
            l2.getClass();
            if (!pzi0.m174439D(l2.longValue())) {
                vxd0Var.put(1);
                byd0Var.put(Long.valueOf(pzi0.m174454o()));
            }
            if (vxd0Var.get().intValue() > userLimitDaily) {
                return true;
            }
            vxd0Var.m203841a(1);
            return false;
        }

        public Companion() {
        }
    }
}
