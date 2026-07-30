package com.p051p1.mobile.putong.core.p058ui.vip.picks;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.pushbubble.SimplePushBubble;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.CardInfos;
import com.p051p1.mobile.putong.core.data.ContainerLabelsType;
import com.p051p1.mobile.putong.core.data.PicksTagType;
import com.p051p1.mobile.putong.core.data.PicksUser;
import com.p051p1.mobile.putong.core.p058ui.poplevel.CorePopLevel;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.PicksHelper;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.p074ss.bytertc.engine.BuildConfig;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p153l.byd0;
import p153l.ddc0;
import p153l.ela;
import p153l.gta;
import p153l.joa;
import p153l.jyb;
import p153l.llb0;
import p153l.pec0;
import p153l.pzi0;
import p153l.qcj;
import p153l.uqb0;
import p153l.vg60;
import p153l.vxd0;
import p153l.wyd0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 62\u00020\u0001:\u00027\u001bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J'\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0006J\r\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0006J\r\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0006J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0003J\u0015\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010%\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010(\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\u001eR\u0014\u0010)\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u0017\u0010,\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b*\u0010\u001c\u001a\u0004\b+\u0010\u001eR\u0017\u00101\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b\u001d\u0010.\u001a\u0004\b/\u00100R\u0014\u00102\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u001cR\u0014\u00103\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0014\u00104\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u0014\u00105\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001c¨\u00068"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/vip/picks/PicksHelper;", "", "<init>", "()V", "", "k", "()Z", BLiveStormDanmakuGiftResourceType.f45292l, "", "h", "()I", RXScreenCaptureService.KEY_INDEX, "", "time", "hourBegin", "hourEnd", "j", "(JII)Z", "m", "n", Constants.INAPP_DATA_TAG, "", "q", BuildConfig.BUILD_TYPE, "p", "(Z)V", "Ll/byd0;", "a", "Ll/byd0;", "f", "()Ll/byd0;", "expandViewShow", "Ll/wyd0;", "b", "Ll/wyd0;", "getGuideText", "()Ll/wyd0;", "guideText", "c", "getGuideTextTime", "guideTextTime", "lastConversationPicksItemClickedTime", "e", "getLastConversationGuideShowTime", "lastConversationGuideShowTime", "Ll/vxd0;", "Ll/vxd0;", "g", "()Ll/vxd0;", "guideToUsePicksCounterInToday", "picksCardSwipeCount", "picksCardSwipeCountStartMills", "picksCardSwipeGuideLastShowMills", "picksMemberEntryClickTime", "Companion", "HeaderType", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class PicksHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k */
    @Nullable
    public static volatile PicksHelper f38211k;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final byd0 expandViewShow;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final wyd0 guideText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final byd0 guideTextTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final byd0 lastConversationPicksItemClickedTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final byd0 lastConversationGuideShowTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final vxd0 guideToUsePicksCounterInToday;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final byd0 picksCardSwipeCount;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final byd0 picksCardSwipeCountStartMills;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final byd0 picksCardSwipeGuideLastShowMills;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final byd0 picksMemberEntryClickTime;

    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/vip/picks/PicksHelper$HeaderType;", "", "<init>", "(Ljava/lang/String;I)V", "HIDE", "EXPAND", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public enum HeaderType {
        HIDE,
        EXPAND;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());

        @NotNull
        public static EnumEntries<HeaderType> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.picks.PicksHelper$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\u000e\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/vip/picks/PicksHelper$a;", "", "<init>", "()V", "Lcom/p1/mobile/putong/core/ui/vip/picks/PicksHelper;", "b", "()Lcom/p1/mobile/putong/core/ui/vip/picks/PicksHelper;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/data/User;", "user", "", "superlike", "", "c", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;Z)V", "", "lastMills", "", "days", "a", "(JI)Z", "instance", "Lcom/p1/mobile/putong/core/ui/vip/picks/PicksHelper;", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final boolean m57922a(long lastMills, int days) {
            long jM174454o = pzi0.m174454o() - lastMills;
            return jM174454o > 0 && days >= 0 && jM174454o > ((long) days) * 86400000;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: b */
        public final PicksHelper m57923b() {
            if (PicksHelper.f38211k == null) {
                synchronized (this) {
                    try {
                        if (PicksHelper.f38211k == null) {
                            PicksHelper.f38211k = new PicksHelper(null);
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            PicksHelper picksHelper = PicksHelper.f38211k;
            picksHelper.getClass();
            return picksHelper;
        }

        @JvmStatic
        /* JADX INFO: renamed from: c */
        public final void m57924c(@Nullable Act act, @NotNull User user, boolean superlike) {
            user.getClass();
            View viewInflate = LayoutInflater.from(act).inflate(pec0.f151979d1, (ViewGroup) null);
            VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(ddc0.f87895a);
            TextView textView = (TextView) viewInflate.findViewById(ddc0.f87913s);
            TextView textView2 = (TextView) viewInflate.findViewById(ddc0.f87872B);
            uqb0.f180374G.m127115L0(vDraweeView, user.m61308fp().profileSmall().formatted());
            if (superlike) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                textView.setText(String.format("你超级喜欢了 %s", Arrays.copyOf(new Object[]{user.name}, 1)));
            } else {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                textView.setText(String.format("你喜欢了 %s", Arrays.copyOf(new Object[]{user.name}, 1)));
            }
            textView2.setText("剩余0个每日心动");
            if (gta.m132210e().m132214d().mo34719Lc()) {
                textView2.setText("剩余0次机会");
            }
            act.getClass();
            llb0.m154703c().m154710i(new SimplePushBubble.C4523a(act, viewInflate).m22163B(1).m22170u(CoreModule.f18273l.m143405a().mo34323Fi()).m22171v(CoreModule.f18273l.m143405a().mo34323Fi()).m22175z(CorePopLevel.PICKS).m22168s());
        }

        public Companion() {
        }
    }

    public PicksHelper() {
        this.expandViewShow = new byd0("picks_expandView_show_" + CoreModule.m30929H().userId(), 0L);
        this.guideText = new wyd0("picks_guide_text_" + CoreModule.m30929H().userId(), "");
        this.guideTextTime = new byd0("picks_guide_text_time" + CoreModule.m30929H().userId(), 0L);
        this.lastConversationPicksItemClickedTime = new byd0("last_conversation_picks_item_clicked_time_" + CoreModule.m30929H().userId(), 0L);
        this.lastConversationGuideShowTime = new byd0("last_conversation_guide_show_time_" + CoreModule.m30929H().userId(), 0L);
        this.guideToUsePicksCounterInToday = new vxd0("guide_use_picks_times_in_today_" + CoreModule.m30929H().userId(), 0);
        this.picksCardSwipeCount = new byd0("picks_swipe_card_count_" + CoreModule.m30929H().userId(), 0L);
        this.picksCardSwipeCountStartMills = new byd0("picks_swipe_card_count_start_mills_" + CoreModule.m30929H().userId(), 0L);
        this.picksCardSwipeGuideLastShowMills = new byd0("picks_swipe_card_guide_last_show_mills_" + CoreModule.m30929H().userId(), 0L);
        this.picksMemberEntryClickTime = new byd0("picks_member_entry_click_time" + CoreModule.m30929H().userId(), 0L);
    }

    /* JADX INFO: renamed from: a */
    public static Boolean m57905a(PicksUser picksUser) {
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(picksUser.f21210id);
        return Boolean.valueOf(!TEnum.equals(picksUser.picksTagType, PicksTagType.masking) && NullChecker.m82486a(userM116503Pa) && (userM116503Pa.isHideIconFromSVip() || !userM116503Pa.isODiamond()));
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final boolean m57908e(long j, int i) {
        return INSTANCE.m57922a(j, i);
    }

    @JvmStatic
    /* JADX INFO: renamed from: o */
    public static final void m57909o(@Nullable Act act, @NotNull User user, boolean z) {
        INSTANCE.m57924c(act, user, z);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m57910d() {
        if (!CoreModule.f18273l.m143405a().mo34414Sp() || joa.m146358H3() || ela.m121122r3() <= 0 || !CoreModule.f18273l.m143405a().mo34508gd() || !CoreModule.f18273l.m143405a().mo34393Ph()) {
            return false;
        }
        if (this.picksCardSwipeCount.get().longValue() < Math.max(((long) CoreModule.f18273l.m143405a().mo34357Kp()) - 1, 0L)) {
            return false;
        }
        Long l2 = this.picksCardSwipeGuideLastShowMills.get();
        l2.getClass();
        long jLongValue = l2.longValue();
        if (joa.m146386f4() || pzi0.m174439D(jLongValue)) {
            return joa.m146386f4() && INSTANCE.m57922a(jLongValue, 3);
        }
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final byd0 getExpandViewShow() {
        return this.expandViewShow;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final vxd0 getGuideToUsePicksCounterInToday() {
        return this.guideToUsePicksCounterInToday;
    }

    /* JADX INFO: renamed from: h */
    public final int m57913h() {
        Long l2 = this.lastConversationGuideShowTime.get();
        l2.getClass();
        if (!pzi0.m174439D(l2.longValue())) {
            this.guideToUsePicksCounterInToday.put(0);
        }
        Integer num = this.guideToUsePicksCounterInToday.get();
        num.getClass();
        return num.intValue();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m57914i() {
        Long l2 = this.lastConversationPicksItemClickedTime.get();
        l2.getClass();
        boolean zM174439D = pzi0.m174439D(l2.longValue());
        if (pzi0.m174465z(12, 0, 0)) {
            return zM174439D && m57915j(l2.longValue(), 12, 23);
        }
        if (zM174439D) {
            return m57915j(l2.longValue(), 0, 11);
        }
        if (CoreModule.f18273l.m143405a().mo34332H8(new Date(l2.longValue()))) {
            return m57915j(l2.longValue(), 12, 23);
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m57915j(long time, int hourBegin, int hourEnd) {
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
    public final boolean m57916k() {
        if (CoreModule.f18273l.m143405a().mo34391P7() || CoreModule.f18273l.m143405a().mo34612vc() < m57913h() || m57914i() || !CoreModule.f18273l.m143405a().mo34462Zi()) {
            return false;
        }
        return pzi0.m174463x(12, 13);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m57917l() {
        if (m57914i()) {
            return false;
        }
        return pzi0.m174463x(12, 13);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m57918m() {
        if (!CoreModule.f18273l.m143405a().mo34532k() || CoreModule.f18273l.m143405a().mo34601ts(1)) {
            return false;
        }
        return joa.m146361M3() ? m57917l() : m57916k();
    }

    /* JADX INFO: renamed from: n */
    public final boolean m57919n() {
        Long l2 = this.expandViewShow.get();
        l2.getClass();
        return !pzi0.m174439D(l2.longValue());
    }

    /* JADX INFO: renamed from: p */
    public final void m57920p(boolean debug) {
        PicksUser picksUser;
        if (debug || m57910d()) {
            vg60<PicksUser> vg60VarM121127F3 = CoreModule.f18264c.f20400k1.m121127F3();
            if (!NullChecker.m82486a(vg60VarM121127F3) || jyb.m147479J(vg60VarM121127F3.f184001a) || (picksUser = (PicksUser) jyb.m147529r(vg60VarM121127F3.f184001a, new qcj() { // from class: l.cn70
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return PicksHelper.m57905a((PicksUser) obj);
                }
            })) == null) {
                return;
            }
            CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
            CardInfos cardInfosNew_ = CardInfos.new_();
            String str = picksUser.f21210id;
            cardInfosNew_.userId = str;
            cardInfosNew_.cardName = ContainerLabelsType.daily_picks;
            userInfo.f20214id = str;
            userInfo.cardInfos = cardInfosNew_;
            userInfo.canUndo = false;
            userInfo.picksGuideUser = true;
            if (CoreModule.f18264c.f20405m0.m32054T5(userInfo)) {
                return;
            }
            CoreModule.f18264c.f20405m0.m32149t6(userInfo, 1, true);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m57921q() {
        this.picksCardSwipeGuideLastShowMills.put(Long.valueOf(pzi0.m174454o()));
    }

    public /* synthetic */ PicksHelper(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
