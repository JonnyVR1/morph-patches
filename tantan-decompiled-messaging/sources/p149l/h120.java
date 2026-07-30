package p149l;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ODiamondVisitorMessageGuideConfig;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.p053ui.visitor.myvisitors.MyVisitorRecoverHideFootPrintView;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m87232d2 = {"Ll/h120;", "", "<init>", "()V", "Companion", "a", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class h120 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: l.h120$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006J\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0006J?\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010 J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u0004H\u0002¢\u0006\u0004\b$\u0010%¨\u0006&"}, m87232d2 = {"Ll/h120$a;", "", "<init>", "()V", "", RXScreenCaptureService.KEY_INDEX, "()I", "g", "h", "j", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/data/User;", "user", "", "hidden", "Ll/e30;", "success", "", "from", "", "p", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;ZLl/e30;Ljava/lang/String;)V", "otherId", "n", "(Ljava/lang/String;)V", "k", "(Ljava/lang/String;)Z", "o", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;ZLl/e30;)V", "userLimitDaily", "q", "(Ljava/lang/String;I)Z", "conversationCloseIntervals", BLiveStormDanmakuGiftResourceType.f44444l, "totalLimitDaily", "m", "(I)Z", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static void m129003a(Throwable th) {
        }

        /* JADX INFO: renamed from: b */
        public static void m129004b(dd80 dd80Var) {
            dd80Var.dismiss();
        }

        /* JADX INFO: renamed from: c */
        public static void m129005c(cwf0 cwf0Var, DialogInterface dialogInterface) {
            i0e.m133796e(cwf0Var);
        }

        /* JADX INFO: renamed from: d */
        public static void m129006d(e30 e30Var, boolean z, roj0 roj0Var) {
            if (e30Var != null) {
                e30Var.call(Boolean.valueOf(z));
            }
        }

        /* JADX INFO: renamed from: e */
        public static void m129007e(User user, e30 e30Var, Boolean bool) {
            lsi0.m151595y("已对" + (user.isFemale() ? "她" : "他") + "隐藏访问足迹");
            if (e30Var != null) {
                e30Var.call(bool);
            }
        }

        /* JADX INFO: renamed from: f */
        public static void m129008f(dd80 dd80Var, Act act, User user, e30 e30Var) {
            dd80Var.dismiss();
            CoreModule.f17545c.f19668n2.m175461l4();
            h120.INSTANCE.m129017o(act, user, false, e30Var);
        }

        /* JADX INFO: renamed from: g */
        public final int m129009g() {
            return RemoteConfig.m79298x().m79336z("vas_hide_visit_banner_show_times_someone_daily", 3);
        }

        /* JADX INFO: renamed from: h */
        public final int m129010h() {
            return RemoteConfig.m79298x().m79336z("vas_diamond_hide_visit_visit_other_times", 5);
        }

        /* JADX INFO: renamed from: i */
        public final int m129011i() {
            return RemoteConfig.m79298x().m79336z("vas_hide_visit_banner_show_total_times_daily", 10);
        }

        /* JADX INFO: renamed from: j */
        public final int m129012j() {
            return RemoteConfig.m79298x().m79336z("vas_diamond_hide_visit_privilege_count_permonth", 20);
        }

        /* JADX INFO: renamed from: k */
        public final boolean m129013k(@NotNull String otherId) {
            otherId.getClass();
            ODiamondVisitorMessageGuideConfig oDiamondVisitorMessageGuideConfig = (ODiamondVisitorMessageGuideConfig) RemoteConfig.m79298x().m79333v("vas_message_visitor_banner_config", ODiamondVisitorMessageGuideConfig.JSON_ADAPTER);
            if (NullChecker.m81303a(oDiamondVisitorMessageGuideConfig)) {
                return (m129019q(otherId, oDiamondVisitorMessageGuideConfig.user_limit_daily) || m129014l(otherId, oDiamondVisitorMessageGuideConfig.conversation_close_intervals) || m129015m(oDiamondVisitorMessageGuideConfig.total_limit_daily)) ? false : true;
            }
            return true;
        }

        /* JADX INFO: renamed from: l */
        public final boolean m129014l(String otherId, int conversationCloseIntervals) {
            Long l2 = new zpd0("click_close_o_diamond_visitor_guide_time_" + otherId + CoreModule.m29931H().userId(), 0L).get();
            long jM155944o = mqi0.m155944o();
            l2.getClass();
            return qqi0.m175939g(jM155944o, l2.longValue(), conversationCloseIntervals);
        }

        /* JADX INFO: renamed from: m */
        public final boolean m129015m(int totalLimitDaily) {
            tpd0 tpd0Var = new tpd0("my_o_diamond_visitor_message_show_today_count_" + CoreModule.m29931H().userId(), 0);
            zpd0 zpd0Var = new zpd0("my_o_diamond_visitor_message_show_last_time_" + CoreModule.m29931H().userId(), 0L);
            Long l2 = zpd0Var.get();
            l2.getClass();
            if (mqi0.m155929D(l2.longValue())) {
                tpd0Var.m189988a(1);
            } else {
                zpd0Var.put(Long.valueOf(mqi0.m155944o()));
                tpd0Var.put(1);
            }
            return tpd0Var.get().intValue() > totalLimitDaily;
        }

        /* JADX INFO: renamed from: n */
        public final void m129016n(@NotNull String otherId) {
            otherId.getClass();
            new zpd0("click_close_o_diamond_visitor_guide_time_" + otherId + CoreModule.m29931H().userId(), 0L).put(Long.valueOf(mqi0.m155944o()));
        }

        /* JADX INFO: renamed from: o */
        public final void m129017o(Act act, User user, final boolean hidden, final e30<Boolean> success) {
            act.duringCreated(CoreModule.f17545c.f19668n2.m175462m4(user.f56011id, hidden)).subscribe(mkd0.m154956H(new e30() { // from class: l.f120
                @Override // p149l.e30
                public final void call(Object obj) {
                    h120.Companion.m129006d(success, hidden, (roj0) obj);
                }
            }, new e30() { // from class: l.g120
                @Override // p149l.e30
                public final void call(Object obj) {
                    h120.Companion.m129003a((Throwable) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: p */
        public final void m129018p(@NotNull final Act act, @NotNull final User user, boolean hidden, @Nullable final e30<Boolean> success, @Nullable String from) {
            act.getClass();
            user.getClass();
            if (hidden) {
                if (!xma.m210043F3()) {
                    CoreModule.m29935P().m94651a().mo33618wh(act, from, null, null, null, Privilege.visitor_hide_footprint);
                    return;
                } else if (xma.m210038A4() <= 0) {
                    lsi0.m151595y("本月特权次数已用完");
                    return;
                } else {
                    m129017o(act, user, true, new e30() { // from class: l.b120
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            h120.Companion.m129007e(user, success, (Boolean) obj);
                        }
                    });
                    return;
                }
            }
            if (!CoreModule.f17545c.f19668n2.m175463n4()) {
                m129017o(act, user, false, success);
                return;
            }
            final cwf0 cwf0Var = new cwf0("p_recover_records_confirm", Dialog.class.getName());
            View viewInflate = o7r.m163037a(act).inflate(k6c0.f121347W1, (ViewGroup) null);
            viewInflate.getClass();
            MyVisitorRecoverHideFootPrintView myVisitorRecoverHideFootPrintView = (MyVisitorRecoverHideFootPrintView) viewInflate;
            final dd80 dd80VarM110960O = new dd80.C16336a(act).m110963R(myVisitorRecoverHideFootPrintView).m110961P(false).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.c120
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    h120.Companion.m129005c(cwf0Var, dialogInterface);
                }
            }).m110960O();
            myVisitorRecoverHideFootPrintView.m58032e(user, new d30() { // from class: l.d120
                @Override // p149l.d30
                public final void call() {
                    h120.Companion.m129008f(dd80VarM110960O, act, user, success);
                }
            }, new d30() { // from class: l.e120
                @Override // p149l.d30
                public final void call() {
                    h120.Companion.m129004b(dd80VarM110960O);
                }
            });
            dd80VarM110960O.show();
            i0e.m133797f(cwf0Var);
        }

        /* JADX INFO: renamed from: q */
        public final boolean m129019q(String otherId, int userLimitDaily) {
            zpd0 zpd0Var = new zpd0("my_o_diamond_visitor_message_user_" + otherId + "_last_time_" + CoreModule.m29931H().userId(), 0L);
            tpd0 tpd0Var = new tpd0("my_o_diamond_visitor_message_show_user_" + otherId + "_today_count_" + CoreModule.m29931H().userId(), 0);
            Long l2 = zpd0Var.get();
            l2.getClass();
            if (!mqi0.m155929D(l2.longValue())) {
                tpd0Var.put(1);
                zpd0Var.put(Long.valueOf(mqi0.m155944o()));
            }
            if (tpd0Var.get().intValue() > userLimitDaily) {
                return true;
            }
            tpd0Var.m189988a(1);
            return false;
        }

        public Companion() {
        }
    }
}
