package com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.Group;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p046p1.mobile.putong.live.base.data.BLiveState;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.view.LivingNewTagView;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardMainlandMeItemView;
import com.p046p1.mobile.putong.live.livingroom.view.rollview.LiveTextRollView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VProgressBar;
import p147v.VText;
import p149l.b2s;
import p149l.e30;
import p149l.e51;
import p149l.ffw;
import p149l.gar;
import p149l.hxs;
import p149l.i3c0;
import p149l.sxj;
import p149l.t100;
import p149l.uvr;
import p149l.w8u;
import p149l.xdl0;
import p149l.xgl;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 x2\u00020\u0001:\u0001(B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\fH\u0014¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\f¢\u0006\u0004\b%\u0010$J\u001f\u0010&\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b&\u0010\u001cR\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010B\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010)\u001a\u0004\b@\u0010+\"\u0004\bA\u0010-R\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010N\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u00101\u001a\u0004\bL\u00103\"\u0004\bM\u00105R\"\u0010V\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010^\u001a\u00020W8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010f\u001a\u00020_8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010j\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bg\u0010Q\u001a\u0004\bh\u0010S\"\u0004\bi\u0010UR\"\u0010n\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bk\u0010)\u001a\u0004\bl\u0010+\"\u0004\bm\u0010-R\u0018\u0010r\u001a\u0004\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010t\u001a\u0004\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010qR\u0016\u0010w\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010v¨\u0006y"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardMainlandMeItemView;", "Lv/VFrame;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", OMSTemplateModeType.view, "", BaseSei.f13932Z, "(Landroid/view/View;)V", "", "bgUrl", "E", "(Ljava/lang/String;)V", "content", "next", b2s.C_ZONE, "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoardItem;", Item.TYPE, "Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoard;", "leaderBoard", "F", "(Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoardItem;Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoard;)V", "", "progress", "G", "(FLcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoardItem;Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoard;)V", "B", "(Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoardItem;)Ljava/lang/String;", "onFinishInflate", "()V", "reset", "M", "Lv/VText;", "a", "Lv/VText;", "get_rank", "()Lv/VText;", "set_rank", "(Lv/VText;)V", "_rank", "Lv/VDraweeView;", "b", "Lv/VDraweeView;", "get_avatar", "()Lv/VDraweeView;", "set_avatar", "(Lv/VDraweeView;)V", "_avatar", "Lcom/p1/mobile/putong/live/base/view/LivingNewTagView;", "c", "Lcom/p1/mobile/putong/live/base/view/LivingNewTagView;", "get_live_tag", "()Lcom/p1/mobile/putong/live/base/view/LivingNewTagView;", "set_live_tag", "(Lcom/p1/mobile/putong/live/base/view/LivingNewTagView;)V", "_live_tag", Constants.INAPP_DATA_TAG, "get_name", "set_name", "_name", "Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/LiveGenderMedalView;", "e", "Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/LiveGenderMedalView;", "get_live_gender", "()Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/LiveGenderMedalView;", "set_live_gender", "(Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/LiveGenderMedalView;)V", "_live_gender", "f", "get_live_level", "set_live_level", "_live_level", "Landroidx/constraintlayout/widget/Group;", "g", "Landroidx/constraintlayout/widget/Group;", "get_medal", "()Landroidx/constraintlayout/widget/Group;", "set_medal", "(Landroidx/constraintlayout/widget/Group;)V", "_medal", "Lv/VProgressBar;", "h", "Lv/VProgressBar;", "get_live_progressBar", "()Lv/VProgressBar;", "set_live_progressBar", "(Lv/VProgressBar;)V", "_live_progressBar", "Lcom/p1/mobile/putong/live/livingroom/view/rollview/LiveTextRollView;", RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/putong/live/livingroom/view/rollview/LiveTextRollView;", "get_live_roll_text", "()Lcom/p1/mobile/putong/live/livingroom/view/rollview/LiveTextRollView;", "set_live_roll_text", "(Lcom/p1/mobile/putong/live/livingroom/view/rollview/LiveTextRollView;)V", "_live_roll_text", "j", "get_progress_layout", "set_progress_layout", "_progress_layout", "k", "get_heart", "set_heart", "_heart", "Ljava/lang/Runnable;", BLiveStormDanmakuGiftResourceType.f44444l, "Ljava/lang/Runnable;", "showPreText", "m", "showProgressText", "n", "Ljava/lang/String;", "nextText", "Companion", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class HourBoardMainlandMeItemView extends VFrame {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VText _rank;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VDraweeView _avatar;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public LivingNewTagView _live_tag;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText _name;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public LiveGenderMedalView _live_gender;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VDraweeView _live_level;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public Group _medal;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VProgressBar _live_progressBar;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public LiveTextRollView _live_roll_text;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public Group _progress_layout;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VText _heart;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public Runnable showPreText;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public Runnable showProgressText;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public String nextText;

    public /* synthetic */ HourBoardMainlandMeItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: K */
    public static final void m74857K(HourBoardMainlandMeItemView hourBoardMainlandMeItemView) {
        e51.m114743H(hourBoardMainlandMeItemView.getContext(), hourBoardMainlandMeItemView.showPreText, 2000L);
    }

    /* JADX INFO: renamed from: L */
    public static final void m74858L() {
    }

    /* JADX INFO: renamed from: s */
    public static void m74860s(HourBoardMainlandMeItemView hourBoardMainlandMeItemView, String str, Integer num) {
        hourBoardMainlandMeItemView.m74865C(str, hourBoardMainlandMeItemView.nextText);
    }

    /* JADX INFO: renamed from: v */
    public static void m74862v(HourBoardMainlandMeItemView hourBoardMainlandMeItemView, String str) {
        hourBoardMainlandMeItemView.get_live_roll_text().setPreAnim(400L);
        hourBoardMainlandMeItemView.get_live_roll_text().m76715G(str, new Runnable() { // from class: l.vgl
            @Override // java.lang.Runnable
            public final void run() {
                HourBoardMainlandMeItemView.m74858L();
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public static void m74863w(final HourBoardMainlandMeItemView hourBoardMainlandMeItemView) {
        hourBoardMainlandMeItemView.get_live_roll_text().setGap(10);
        hourBoardMainlandMeItemView.get_live_roll_text().setNextAnim(400L);
        hourBoardMainlandMeItemView.get_live_roll_text().m76715G(hourBoardMainlandMeItemView.nextText, new Runnable() { // from class: l.wgl
            @Override // java.lang.Runnable
            public final void run() {
                HourBoardMainlandMeItemView.m74857K(this.f186207a);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public final String m74864B(BLiveHourLeaderBoardItem item) {
        long j = item.rank;
        if (j <= 0) {
            return "--";
        }
        return j > 100 ? "100+" : String.valueOf(j);
    }

    /* JADX INFO: renamed from: C */
    public final void m74865C(String content, String next) {
        get_live_roll_text().m76711C(content, true);
        get_live_roll_text().m76704v(0, true);
        get_live_roll_text().m76711C(next, false);
        get_live_roll_text().m76704v(0, false);
    }

    /* JADX INFO: renamed from: E */
    public final void m74866E(String bgUrl) {
        if (bgUrl == null || bgUrl.length() == 0) {
            xdl0.m208345M0(get_live_level(), false);
        } else {
            xdl0.m208345M0(get_live_level(), true);
            sxj.m186442c(bgUrl, get_live_level(), t100.f167262k);
        }
    }

    @SuppressLint({"RtlHardcoded"})
    /* JADX INFO: renamed from: F */
    public final void m74867F(BLiveHourLeaderBoardItem item, BLiveHourLeaderBoard leaderBoard) {
        if (NullChecker.m81303a(leaderBoard)) {
            leaderBoard.getClass();
            if (leaderBoard.currentHourSuggestConfig.enable) {
                xdl0.m208344M(get_progress_layout(), true);
                xdl0.m208345M0(get_medal(), false);
                int i = leaderBoard.currentHourSuggestConfig.target;
                float f = (i > 0 ? (item.amount * 1.0f) / i : 0.0f) * 100.0f;
                get_live_progressBar().setProgress(f > 100.0f ? 100 : (int) f);
                xdl0.m208345M0(get_live_progressBar(), item.amount > 0);
                m74868G(f, item, leaderBoard);
                return;
            }
        }
        get_live_roll_text().reset();
        xdl0.m208344M(get_progress_layout(), false);
        xdl0.m208345M0(get_medal(), true);
    }

    /* JADX INFO: renamed from: G */
    public final void m74868G(float progress, BLiveHourLeaderBoardItem item, BLiveHourLeaderBoard leaderBoard) {
        final String strM202219v;
        if (progress >= 1.0f) {
            strM202219v = w8u.m202217t(R$string.f47559u6);
            strM202219v.getClass();
        } else {
            int i = R$string.f47537t6;
            boolean zM162715s0 = uvr.m196087d().m162715s0();
            leaderBoard.getClass();
            String strM202218u = w8u.m202218u(i, gar.m125007a(zM162715s0, leaderBoard.currentHourSuggestConfig.target));
            strM202218u.getClass();
            this.nextText = strM202218u;
            strM202219v = w8u.m202219v(uvr.m196087d().m162715s0() ? R$string.f47625x6 : R$string.f47581v6, gar.m125008b((int) item.amount), gar.m125008b(leaderBoard.currentHourSuggestConfig.target));
            strM202219v.getClass();
            this.showProgressText = new Runnable() { // from class: l.sgl
                @Override // java.lang.Runnable
                public final void run() {
                    HourBoardMainlandMeItemView.m74863w(this.f164450a);
                }
            };
            this.showPreText = new Runnable() { // from class: l.tgl
                @Override // java.lang.Runnable
                public final void run() {
                    HourBoardMainlandMeItemView.m74862v(this.f170101a, strM202219v);
                }
            };
            e51.m114743H(getContext(), this.showProgressText, 2000L);
        }
        if (get_live_roll_text().getWidth() > 0) {
            m74865C(strM202219v, this.nextText);
        } else {
            xdl0.m208340K(get_live_roll_text()).first().subscribe(ffw.m121193d(new e30() { // from class: l.ugl
                @Override // p149l.e30
                public final void call(Object obj) {
                    HourBoardMainlandMeItemView.m74860s(this.f176400a, strM202219v, (Integer) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m74869M(@NotNull BLiveHourLeaderBoardItem item, @Nullable BLiveHourLeaderBoard leaderBoard) {
        item.getClass();
        get_name().setText(item.userName);
        get_rank().setText(m74864B(item));
        get_rank().setTextSize(item.rank > 99 ? 14.0f : 18.0f);
        xdl0.m208344M(get_heart(), uvr.m196087d().m162719u0());
        if (w8u.m202204B()) {
            get_heart().setText(gar.m125009c(uvr.m196087d().m162715s0(), item.amount));
        } else {
            get_heart().setText(String.valueOf(item.amount));
            xdl0.m208383k(get_heart(), getResources().getDrawable(uvr.m196087d().m162715s0() ? i3c0.f110785M3 : i3c0.f111093n));
            get_heart().setCompoundDrawablePadding(t100.f167254c);
        }
        hxs.m133407t("context_single_room", get_avatar(), item.userImage, t100.f167275x);
        LivingNewTagView livingNewTagView = get_live_tag();
        BLiveState bLiveState = item.liveState;
        bLiveState.getClass();
        livingNewTagView.m68785s(bLiveState);
        xdl0.m208344M(get_progress_layout(), true);
        LiveGenderMedalView liveGenderMedalView = get_live_gender();
        String str = item.gender;
        str.getClass();
        liveGenderMedalView.m74889Q(str, item.age, false);
        m74866E(item.backgroundUrl);
        m74867F(item, leaderBoard);
    }

    @NotNull
    public final VDraweeView get_avatar() {
        VDraweeView vDraweeView = this._avatar;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_avatar");
        return null;
    }

    @NotNull
    public final VText get_heart() {
        VText vText = this._heart;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_heart");
        return null;
    }

    @NotNull
    public final LiveGenderMedalView get_live_gender() {
        LiveGenderMedalView liveGenderMedalView = this._live_gender;
        if (liveGenderMedalView != null) {
            return liveGenderMedalView;
        }
        Intrinsics.m87502r("_live_gender");
        return null;
    }

    @NotNull
    public final VDraweeView get_live_level() {
        VDraweeView vDraweeView = this._live_level;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_live_level");
        return null;
    }

    @NotNull
    public final VProgressBar get_live_progressBar() {
        VProgressBar vProgressBar = this._live_progressBar;
        if (vProgressBar != null) {
            return vProgressBar;
        }
        Intrinsics.m87502r("_live_progressBar");
        return null;
    }

    @NotNull
    public final LiveTextRollView get_live_roll_text() {
        LiveTextRollView liveTextRollView = this._live_roll_text;
        if (liveTextRollView != null) {
            return liveTextRollView;
        }
        Intrinsics.m87502r("_live_roll_text");
        return null;
    }

    @NotNull
    public final LivingNewTagView get_live_tag() {
        LivingNewTagView livingNewTagView = this._live_tag;
        if (livingNewTagView != null) {
            return livingNewTagView;
        }
        Intrinsics.m87502r("_live_tag");
        return null;
    }

    @NotNull
    public final Group get_medal() {
        Group group = this._medal;
        if (group != null) {
            return group;
        }
        Intrinsics.m87502r("_medal");
        return null;
    }

    @NotNull
    public final VText get_name() {
        VText vText = this._name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_name");
        return null;
    }

    @NotNull
    public final Group get_progress_layout() {
        Group group = this._progress_layout;
        if (group != null) {
            return group;
        }
        Intrinsics.m87502r("_progress_layout");
        return null;
    }

    @NotNull
    public final VText get_rank() {
        VText vText = this._rank;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_rank");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74870z(this);
        get_live_progressBar().setMax(100);
        get_rank().setTypeface(Typeface.defaultFromStyle(1));
    }

    public final void reset() {
        e51.m114745J(this.showProgressText);
        e51.m114745J(this.showPreText);
        get_live_progressBar().setProgress(0);
        get_live_roll_text().mo76702t();
    }

    public final void set_avatar(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._avatar = vDraweeView;
    }

    public final void set_heart(@NotNull VText vText) {
        vText.getClass();
        this._heart = vText;
    }

    public final void set_live_gender(@NotNull LiveGenderMedalView liveGenderMedalView) {
        liveGenderMedalView.getClass();
        this._live_gender = liveGenderMedalView;
    }

    public final void set_live_level(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._live_level = vDraweeView;
    }

    public final void set_live_progressBar(@NotNull VProgressBar vProgressBar) {
        vProgressBar.getClass();
        this._live_progressBar = vProgressBar;
    }

    public final void set_live_roll_text(@NotNull LiveTextRollView liveTextRollView) {
        liveTextRollView.getClass();
        this._live_roll_text = liveTextRollView;
    }

    public final void set_live_tag(@NotNull LivingNewTagView livingNewTagView) {
        livingNewTagView.getClass();
        this._live_tag = livingNewTagView;
    }

    public final void set_medal(@NotNull Group group) {
        group.getClass();
        this._medal = group;
    }

    public final void set_name(@NotNull VText vText) {
        vText.getClass();
        this._name = vText;
    }

    public final void set_progress_layout(@NotNull Group group) {
        group.getClass();
        this._progress_layout = group;
    }

    public final void set_rank(@NotNull VText vText) {
        vText.getClass();
        this._rank = vText;
    }

    /* JADX INFO: renamed from: z */
    public final void m74870z(View view) {
        xgl.m208682a(this, view);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HourBoardMainlandMeItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HourBoardMainlandMeItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.nextText = "";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HourBoardMainlandMeItemView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
