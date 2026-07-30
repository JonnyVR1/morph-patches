package com.p046p1.mobile.putong.core.p053ui.vip.picks;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.pushbubble.SimplePushBubble;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.CardInfos;
import com.p046p1.mobile.putong.core.data.ContainerLabelsType;
import com.p046p1.mobile.putong.core.data.PicksTagType;
import com.p046p1.mobile.putong.core.data.PicksUser;
import com.p046p1.mobile.putong.core.p053ui.poplevel.CorePopLevel;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.PicksHelper;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.p069ss.bytertc.engine.BuildConfig;
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
import p147v.VDraweeView;
import p149l.hdb0;
import p149l.k6c0;
import p149l.mqi0;
import p149l.q860;
import p149l.qib0;
import p149l.sja;
import p149l.tpd0;
import p149l.uqd0;
import p149l.ura;
import p149l.vwb;
import p149l.w9j;
import p149l.x4c0;
import p149l.xma;
import p149l.zpd0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 62\u00020\u0001:\u00027\u001bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J'\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0006J\r\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0006J\r\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0006J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0003J\u0015\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010%\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010(\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\u001eR\u0014\u0010)\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u0017\u0010,\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b*\u0010\u001c\u001a\u0004\b+\u0010\u001eR\u0017\u00101\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b\u001d\u0010.\u001a\u0004\b/\u00100R\u0014\u00102\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u001cR\u0014\u00103\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0014\u00104\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u0014\u00105\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001c¨\u00068"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/vip/picks/PicksHelper;", "", "<init>", "()V", "", "k", "()Z", BLiveStormDanmakuGiftResourceType.f44444l, "", "h", "()I", RXScreenCaptureService.KEY_INDEX, "", "time", "hourBegin", "hourEnd", "j", "(JII)Z", "m", "n", Constants.INAPP_DATA_TAG, "", "q", BuildConfig.BUILD_TYPE, "p", "(Z)V", "Ll/zpd0;", "a", "Ll/zpd0;", "f", "()Ll/zpd0;", "expandViewShow", "Ll/uqd0;", "b", "Ll/uqd0;", "getGuideText", "()Ll/uqd0;", "guideText", "c", "getGuideTextTime", "guideTextTime", "lastConversationPicksItemClickedTime", "e", "getLastConversationGuideShowTime", "lastConversationGuideShowTime", "Ll/tpd0;", "Ll/tpd0;", "g", "()Ll/tpd0;", "guideToUsePicksCounterInToday", "picksCardSwipeCount", "picksCardSwipeCountStartMills", "picksCardSwipeGuideLastShowMills", "picksMemberEntryClickTime", "Companion", "HeaderType", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class PicksHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k */
    @Nullable
    public static volatile PicksHelper f37363k;

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

    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/vip/picks/PicksHelper$HeaderType;", "", "<init>", "(Ljava/lang/String;I)V", "HIDE", "EXPAND", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public enum HeaderType {
        HIDE,
        EXPAND;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

        @NotNull
        public static EnumEntries<HeaderType> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.picks.PicksHelper$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\u000e\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/vip/picks/PicksHelper$a;", "", "<init>", "()V", "Lcom/p1/mobile/putong/core/ui/vip/picks/PicksHelper;", "b", "()Lcom/p1/mobile/putong/core/ui/vip/picks/PicksHelper;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/data/User;", "user", "", "superlike", "", "c", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;Z)V", "", "lastMills", "", "days", "a", "(JI)Z", "instance", "Lcom/p1/mobile/putong/core/ui/vip/picks/PicksHelper;", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final boolean m56739a(long lastMills, int days) {
            long jM155944o = mqi0.m155944o() - lastMills;
            return jM155944o > 0 && days >= 0 && jM155944o > ((long) days) * 86400000;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: b */
        public final PicksHelper m56740b() {
            if (PicksHelper.f37363k == null) {
                synchronized (this) {
                    try {
                        if (PicksHelper.f37363k == null) {
                            PicksHelper.f37363k = new PicksHelper(null);
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            PicksHelper picksHelper = PicksHelper.f37363k;
            picksHelper.getClass();
            return picksHelper;
        }

        @JvmStatic
        /* JADX INFO: renamed from: c */
        public final void m56741c(@Nullable Act act, @NotNull User user, boolean superlike) {
            user.getClass();
            View viewInflate = LayoutInflater.from(act).inflate(k6c0.f121371d1, (ViewGroup) null);
            VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(x4c0.f190990a);
            TextView textView = (TextView) viewInflate.findViewById(x4c0.f191008s);
            TextView textView2 = (TextView) viewInflate.findViewById(x4c0.f190967B);
            qib0.f154691G.m102331L0(vDraweeView, user.m60124fp().profileSmall().formatted());
            if (superlike) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                textView.setText(String.format("你超级喜欢了 %s", Arrays.copyOf(new Object[]{user.name}, 1)));
            } else {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                textView.setText(String.format("你喜欢了 %s", Arrays.copyOf(new Object[]{user.name}, 1)));
            }
            textView2.setText("剩余0个每日心动");
            if (ura.m195053e().m195057d().mo33716Lc()) {
                textView2.setText("剩余0次机会");
            }
            act.getClass();
            hdb0.m130575c().m130582i(new SimplePushBubble.C4372a(act, viewInflate).m21164B(1).m21171u(CoreModule.f17554l.m94651a().mo33320Fi()).m21172v(CoreModule.f17554l.m94651a().mo33320Fi()).m21176z(CorePopLevel.PICKS).m21169s());
        }

        public Companion() {
        }
    }

    public PicksHelper() {
        this.expandViewShow = new zpd0("picks_expandView_show_" + CoreModule.m29931H().userId(), 0L);
        this.guideText = new uqd0("picks_guide_text_" + CoreModule.m29931H().userId(), "");
        this.guideTextTime = new zpd0("picks_guide_text_time" + CoreModule.m29931H().userId(), 0L);
        this.lastConversationPicksItemClickedTime = new zpd0("last_conversation_picks_item_clicked_time_" + CoreModule.m29931H().userId(), 0L);
        this.lastConversationGuideShowTime = new zpd0("last_conversation_guide_show_time_" + CoreModule.m29931H().userId(), 0L);
        this.guideToUsePicksCounterInToday = new tpd0("guide_use_picks_times_in_today_" + CoreModule.m29931H().userId(), 0);
        this.picksCardSwipeCount = new zpd0("picks_swipe_card_count_" + CoreModule.m29931H().userId(), 0L);
        this.picksCardSwipeCountStartMills = new zpd0("picks_swipe_card_count_start_mills_" + CoreModule.m29931H().userId(), 0L);
        this.picksCardSwipeGuideLastShowMills = new zpd0("picks_swipe_card_guide_last_show_mills_" + CoreModule.m29931H().userId(), 0L);
        this.picksMemberEntryClickTime = new zpd0("picks_member_entry_click_time" + CoreModule.m29931H().userId(), 0L);
    }

    /* JADX INFO: renamed from: a */
    public static Boolean m56722a(PicksUser picksUser) {
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(picksUser.f20468id);
        return Boolean.valueOf(!TEnum.equals(picksUser.picksTagType, PicksTagType.masking) && NullChecker.m81303a(userM169430Pa) && (userM169430Pa.isHideIconFromSVip() || !userM169430Pa.isODiamond()));
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final boolean m56725e(long j, int i) {
        return INSTANCE.m56739a(j, i);
    }

    @JvmStatic
    /* JADX INFO: renamed from: o */
    public static final void m56726o(@Nullable Act act, @NotNull User user, boolean z) {
        INSTANCE.m56741c(act, user, z);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m56727d() {
        if (!CoreModule.f17554l.m94651a().mo33411Sp() || xma.m210044G3() || sja.m184461r3() <= 0 || !CoreModule.f17554l.m94651a().mo33505gd() || !CoreModule.f17554l.m94651a().mo33390Ph()) {
            return false;
        }
        if (this.picksCardSwipeCount.get().longValue() < Math.max(((long) CoreModule.f17554l.m94651a().mo33354Kp()) - 1, 0L)) {
            return false;
        }
        Long l2 = this.picksCardSwipeGuideLastShowMills.get();
        l2.getClass();
        long jLongValue = l2.longValue();
        if (xma.m210071e4() || mqi0.m155929D(jLongValue)) {
            return xma.m210071e4() && INSTANCE.m56739a(jLongValue, 3);
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
    public final int m56730h() {
        Long l2 = this.lastConversationGuideShowTime.get();
        l2.getClass();
        if (!mqi0.m155929D(l2.longValue())) {
            this.guideToUsePicksCounterInToday.put(0);
        }
        Integer num = this.guideToUsePicksCounterInToday.get();
        num.getClass();
        return num.intValue();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m56731i() {
        Long l2 = this.lastConversationPicksItemClickedTime.get();
        l2.getClass();
        boolean zM155929D = mqi0.m155929D(l2.longValue());
        if (mqi0.m155955z(12, 0, 0)) {
            return zM155929D && m56732j(l2.longValue(), 12, 23);
        }
        if (zM155929D) {
            return m56732j(l2.longValue(), 0, 11);
        }
        if (CoreModule.f17554l.m94651a().mo33329H8(new Date(l2.longValue()))) {
            return m56732j(l2.longValue(), 12, 23);
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m56732j(long time, int hourBegin, int hourEnd) {
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
    public final boolean m56733k() {
        if (CoreModule.f17554l.m94651a().mo33388P7() || CoreModule.f17554l.m94651a().mo33609vc() < m56730h() || m56731i() || !CoreModule.f17554l.m94651a().mo33459Zi()) {
            return false;
        }
        return mqi0.m155953x(12, 13);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m56734l() {
        if (m56731i()) {
            return false;
        }
        return mqi0.m155953x(12, 13);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m56735m() {
        if (!CoreModule.f17554l.m94651a().mo33529k() || CoreModule.f17554l.m94651a().mo33598ts(1)) {
            return false;
        }
        return xma.m210047L3() ? m56734l() : m56733k();
    }

    /* JADX INFO: renamed from: n */
    public final boolean m56736n() {
        Long l2 = this.expandViewShow.get();
        l2.getClass();
        return !mqi0.m155929D(l2.longValue());
    }

    /* JADX INFO: renamed from: p */
    public final void m56737p(boolean debug) {
        PicksUser picksUser;
        if (debug || m56727d()) {
            q860<PicksUser> q860VarM184466F3 = CoreModule.f17545c.f19658k1.m184466F3();
            if (!NullChecker.m81303a(q860VarM184466F3) || vwb.m200296J(q860VarM184466F3.f153135a) || (picksUser = (PicksUser) vwb.m200346r(q860VarM184466F3.f153135a, new w9j() { // from class: l.we70
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return PicksHelper.m56722a((PicksUser) obj);
                }
            })) == null) {
                return;
            }
            CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
            CardInfos cardInfosNew_ = CardInfos.new_();
            String str = picksUser.f20468id;
            cardInfosNew_.userId = str;
            cardInfosNew_.cardName = ContainerLabelsType.daily_picks;
            userInfo.f19472id = str;
            userInfo.cardInfos = cardInfosNew_;
            userInfo.canUndo = false;
            userInfo.picksGuideUser = true;
            if (CoreModule.f17545c.f19663m0.m31051T5(userInfo)) {
                return;
            }
            CoreModule.f17545c.f19663m0.m31146t6(userInfo, 1, true);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m56738q() {
        this.picksCardSwipeGuideLastShowMills.put(Long.valueOf(mqi0.m155944o()));
    }

    public /* synthetic */ PicksHelper(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
