package com.p000p1.mobile.putong.core.p004ui.vip.picks;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.CoreSuggested;
import com.p000p1.mobile.putong.core.p004ui.vip.picks.PicksHelper;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.pushbubble.SimplePushBubble;
import com.p1.mobile.putong.core.data.CardInfos;
import com.p1.mobile.putong.core.data.PicksUser;
import com.p1.mobile.putong.core.ui.poplevel.CorePopLevel;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.StringCompanionObject;
import l.hdb0;
import l.k6c0;
import l.mqi0;
import l.q860;
import l.tpd0;
import l.uqd0;
import l.vwb;
import l.w9j;
import l.x4c0;
import l.zpd0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.qib0;
import p006l.sja;
import p006l.ura;
import p006l.xma;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 62\u00020\u0001:\u00027\u001bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J'\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0006J\r\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0006J\r\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0006J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0003J\u0015\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010%\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010(\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\u001eR\u0014\u0010)\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u0017\u0010,\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b*\u0010\u001c\u001a\u0004\b+\u0010\u001eR\u0017\u00101\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b\u001d\u0010.\u001a\u0004\b/\u00100R\u0014\u00102\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u001cR\u0014\u00103\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0014\u00104\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u0014\u00105\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001c¨\u00068"}, d2 = {"Lcom/p1/mobile/putong/core/ui/vip/picks/PicksHelper;", "", "<init>", "()V", "", "k", "()Z", "l", "", "h", "()I", "i", "", "time", "hourBegin", "hourEnd", "j", "(JII)Z", "m", "n", "d", "", "q", "debug", "p", "(Z)V", "Ll/zpd0;", "a", "Ll/zpd0;", "f", "()Ll/zpd0;", "expandViewShow", "Ll/uqd0;", "b", "Ll/uqd0;", "getGuideText", "()Ll/uqd0;", "guideText", "c", "getGuideTextTime", "guideTextTime", "lastConversationPicksItemClickedTime", "e", "getLastConversationGuideShowTime", "lastConversationGuideShowTime", "Ll/tpd0;", "Ll/tpd0;", "g", "()Ll/tpd0;", "guideToUsePicksCounterInToday", "picksCardSwipeCount", "picksCardSwipeCountStartMills", "picksCardSwipeGuideLastShowMills", "picksMemberEntryClickTime", "Companion", "HeaderType", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PicksHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k */
    @Nullable
    public static volatile PicksHelper f7144k;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final zpd0 expandViewShow;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final uqd0 guideText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final zpd0 guideTextTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final zpd0 lastConversationPicksItemClickedTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final zpd0 lastConversationGuideShowTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final tpd0 guideToUsePicksCounterInToday;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final zpd0 picksCardSwipeCount;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final zpd0 picksCardSwipeCountStartMills;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final zpd0 picksCardSwipeGuideLastShowMills;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final zpd0 picksMemberEntryClickTime;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/p1/mobile/putong/core/ui/vip/picks/PicksHelper$HeaderType;", "", "<init>", "(Ljava/lang/String;I)V", "HIDE", "EXPAND", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum HeaderType {
        HIDE,
        EXPAND;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

        @NotNull
        public static EnumEntries<HeaderType> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.picks.PicksHelper$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\u000e\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/p1/mobile/putong/core/ui/vip/picks/PicksHelper$a;", "", "<init>", "()V", "Lcom/p1/mobile/putong/core/ui/vip/picks/PicksHelper;", "b", "()Lcom/p1/mobile/putong/core/ui/vip/picks/PicksHelper;", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/data/User;", "user", "", "superlike", "", "c", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;Z)V", "", "lastMills", "", "days", "a", "(JI)Z", "instance", "Lcom/p1/mobile/putong/core/ui/vip/picks/PicksHelper;", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final boolean m10198a(long lastMills, int days) {
            long jO = mqi0.o() - lastMills;
            return jO > 0 && days >= 0 && jO > ((long) days) * 86400000;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: b */
        public final PicksHelper m10199b() {
            if (PicksHelper.f7144k == null) {
                synchronized (this) {
                    try {
                        if (PicksHelper.f7144k == null) {
                            PicksHelper.f7144k = new PicksHelper(null);
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            PicksHelper picksHelper = PicksHelper.f7144k;
            picksHelper.getClass();
            return picksHelper;
        }

        @JvmStatic
        /* JADX INFO: renamed from: c */
        public final void m10200c(@Nullable Act act, @NotNull User user, boolean superlike) {
            user.getClass();
            View viewInflate = LayoutInflater.from(act).inflate(k6c0.d1, (ViewGroup) null);
            SimpleDraweeView simpleDraweeView = (VDraweeView) viewInflate.findViewById(x4c0.a);
            TextView textView = (TextView) viewInflate.findViewById(x4c0.s);
            TextView textView2 = (TextView) viewInflate.findViewById(x4c0.B);
            qib0.f19782G.m12744L0(simpleDraweeView, user.fp().profileSmall().formatted());
            if (superlike) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                textView.setText(String.format("你超级喜欢了 %s", Arrays.copyOf(new Object[]{user.name}, 1)));
            } else {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                textView.setText(String.format("你喜欢了 %s", Arrays.copyOf(new Object[]{user.name}, 1)));
            }
            textView2.setText("剩余0个每日心动");
            if (ura.m25555e().m25559d().m5653Lc()) {
                textView2.setText("剩余0次机会");
            }
            act.getClass();
            hdb0.c().i(new SimplePushBubble.a(act, viewInflate).B(1).u(CoreModule.f1543l.m11706a().m5257Fi()).v(CoreModule.f1543l.m11706a().m5257Fi()).z(CorePopLevel.PICKS).s());
        }

        public Companion() {
        }
    }

    public PicksHelper() {
        this.expandViewShow = new zpd0("picks_expandView_show_" + CoreModule.m1850H().userId(), 0L);
        this.guideText = new uqd0("picks_guide_text_" + CoreModule.m1850H().userId(), "");
        this.guideTextTime = new zpd0("picks_guide_text_time" + CoreModule.m1850H().userId(), 0L);
        this.lastConversationPicksItemClickedTime = new zpd0("last_conversation_picks_item_clicked_time_" + CoreModule.m1850H().userId(), 0L);
        this.lastConversationGuideShowTime = new zpd0("last_conversation_guide_show_time_" + CoreModule.m1850H().userId(), 0L);
        this.guideToUsePicksCounterInToday = new tpd0("guide_use_picks_times_in_today_" + CoreModule.m1850H().userId(), 0);
        this.picksCardSwipeCount = new zpd0("picks_swipe_card_count_" + CoreModule.m1850H().userId(), 0L);
        this.picksCardSwipeCountStartMills = new zpd0("picks_swipe_card_count_start_mills_" + CoreModule.m1850H().userId(), 0L);
        this.picksCardSwipeGuideLastShowMills = new zpd0("picks_swipe_card_guide_last_show_mills_" + CoreModule.m1850H().userId(), 0L);
        this.picksMemberEntryClickTime = new zpd0("picks_member_entry_click_time" + CoreModule.m1850H().userId(), 0L);
    }

    /* JADX INFO: renamed from: a */
    public static Boolean m10181a(PicksUser picksUser) {
        User userM21393Pa = CoreModule.f1534c.f3628e0.m21393Pa(picksUser.id);
        return Boolean.valueOf(!TEnum.equals(picksUser.picksTagType, "masking") && NullChecker.a(userM21393Pa) && (userM21393Pa.isHideIconFromSVip() || !userM21393Pa.isODiamond()));
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final boolean m10184e(long j, int i) {
        return INSTANCE.m10198a(j, i);
    }

    @JvmStatic
    /* JADX INFO: renamed from: o */
    public static final void m10185o(@Nullable Act act, @NotNull User user, boolean z) {
        INSTANCE.m10200c(act, user, z);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m10186d() {
        if (!CoreModule.f1543l.m11706a().m5348Sp() || xma.m27352G3() || sja.m23841r3() <= 0 || !CoreModule.f1543l.m11706a().m5442gd() || !CoreModule.f1543l.m11706a().m5327Ph()) {
            return false;
        }
        if (((Long) this.picksCardSwipeCount.get()).longValue() < Math.max(((long) CoreModule.f1543l.m11706a().m5291Kp()) - 1, 0L)) {
            return false;
        }
        Object obj = this.picksCardSwipeGuideLastShowMills.get();
        obj.getClass();
        long jLongValue = ((Number) obj).longValue();
        if (xma.m27379e4() || mqi0.D(jLongValue)) {
            return xma.m27379e4() && INSTANCE.m10198a(jLongValue, 3);
        }
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final zpd0 getExpandViewShow() {
        return this.expandViewShow;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final tpd0 getGuideToUsePicksCounterInToday() {
        return this.guideToUsePicksCounterInToday;
    }

    /* JADX INFO: renamed from: h */
    public final int m10189h() {
        Object obj = this.lastConversationGuideShowTime.get();
        obj.getClass();
        if (!mqi0.D(((Number) obj).longValue())) {
            this.guideToUsePicksCounterInToday.put(0);
        }
        Object obj2 = this.guideToUsePicksCounterInToday.get();
        obj2.getClass();
        return ((Number) obj2).intValue();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m10190i() {
        Long l2 = (Long) this.lastConversationPicksItemClickedTime.get();
        l2.getClass();
        boolean zD = mqi0.D(l2.longValue());
        if (mqi0.z(12, 0, 0)) {
            return zD && m10191j(l2.longValue(), 12, 23);
        }
        if (zD) {
            return m10191j(l2.longValue(), 0, 11);
        }
        if (CoreModule.f1543l.m11706a().m5266H8(new Date(l2.longValue()))) {
            return m10191j(l2.longValue(), 12, 23);
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m10191j(long time, int hourBegin, int hourEnd) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        Object objClone = calendar.clone();
        objClone.getClass();
        Calendar calendar2 = (Calendar) objClone;
        calendar2.set(11, hourBegin);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        Object objClone2 = calendar.clone();
        objClone2.getClass();
        Calendar calendar3 = (Calendar) objClone2;
        calendar3.set(11, hourEnd);
        calendar3.set(12, 59);
        calendar3.set(13, 59);
        if (hourBegin <= hourEnd) {
            return calendar.after(calendar2) && calendar.before(calendar3);
        }
        return calendar.after(calendar2) || calendar.before(calendar3);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m10192k() {
        if (CoreModule.f1543l.m11706a().m5325P7() || CoreModule.f1543l.m11706a().m5546vc() < m10189h() || m10190i() || !CoreModule.f1543l.m11706a().m5396Zi()) {
            return false;
        }
        return mqi0.x(12, 13);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m10193l() {
        if (m10190i()) {
            return false;
        }
        return mqi0.x(12, 13);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m10194m() {
        if (!CoreModule.f1543l.m11706a().m5466k() || CoreModule.f1543l.m11706a().m5535ts(1)) {
            return false;
        }
        return xma.m27355L3() ? m10193l() : m10192k();
    }

    /* JADX INFO: renamed from: n */
    public final boolean m10195n() {
        Object obj = this.expandViewShow.get();
        obj.getClass();
        return !mqi0.D(((Number) obj).longValue());
    }

    /* JADX INFO: renamed from: p */
    public final void m10196p(boolean debug) {
        PicksUser picksUser;
        if (debug || m10186d()) {
            q860<PicksUser> q860VarM23846F3 = CoreModule.f1534c.f3647k1.m23846F3();
            if (!NullChecker.a(q860VarM23846F3) || vwb.J(q860VarM23846F3.a) || (picksUser = (PicksUser) vwb.r(q860VarM23846F3.a, new w9j() { // from class: l.we70
                public final Object call(Object obj) {
                    return PicksHelper.m10181a((PicksUser) obj);
                }
            })) == null) {
                return;
            }
            CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
            CardInfos cardInfosNew_ = CardInfos.new_();
            String str = picksUser.id;
            cardInfosNew_.userId = str;
            cardInfosNew_.cardName = "daily_picks";
            userInfo.f3461id = str;
            userInfo.cardInfos = cardInfosNew_;
            userInfo.canUndo = false;
            userInfo.picksGuideUser = true;
            if (CoreModule.f1534c.f3652m0.m2981T5(userInfo)) {
                return;
            }
            CoreModule.f1534c.f3652m0.m3076t6(userInfo, 1, true);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m10197q() {
        this.picksCardSwipeGuideLastShowMills.put(Long.valueOf(mqi0.o()));
    }

    public /* synthetic */ PicksHelper(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
