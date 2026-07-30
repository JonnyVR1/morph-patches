package com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.Group;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p051p1.mobile.putong.live.base.data.BLiveState;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.view.LivingNewTagView;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardMainlandMeItemView;
import com.p051p1.mobile.putong.live.livingroom.view.rollview.LiveTextRollView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VProgressBar;
import p151v.VText;
import p153l.bnl0;
import p153l.c4s;
import p153l.dhw;
import p153l.i0k;
import p153l.icr;
import p153l.izs;
import p153l.l51;
import p153l.obc0;
import p153l.ojl;
import p153l.qa00;
import p153l.vxr;
import p153l.xau;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 x2\u00020\u0001:\u0001(B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\fH\u0014¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\f¢\u0006\u0004\b%\u0010$J\u001f\u0010&\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b&\u0010\u001cR\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010B\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010)\u001a\u0004\b@\u0010+\"\u0004\bA\u0010-R\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010N\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u00101\u001a\u0004\bL\u00103\"\u0004\bM\u00105R\"\u0010V\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010^\u001a\u00020W8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010f\u001a\u00020_8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010j\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bg\u0010Q\u001a\u0004\bh\u0010S\"\u0004\bi\u0010UR\"\u0010n\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bk\u0010)\u001a\u0004\bl\u0010+\"\u0004\bm\u0010-R\u0018\u0010r\u001a\u0004\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010t\u001a\u0004\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010qR\u0016\u0010w\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010v¨\u0006y"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardMainlandMeItemView;", "Lv/VFrame;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", OMSTemplateModeType.view, "", BaseSei.f14626Z, "(Landroid/view/View;)V", "", "bgUrl", "E", "(Ljava/lang/String;)V", "content", "next", c4s.C_ZONE, "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoardItem;", Item.TYPE, "Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoard;", "leaderBoard", "F", "(Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoardItem;Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoard;)V", "", "progress", "G", "(FLcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoardItem;Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoard;)V", "B", "(Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoardItem;)Ljava/lang/String;", "onFinishInflate", "()V", "reset", "M", "Lv/VText;", "a", "Lv/VText;", "get_rank", "()Lv/VText;", "set_rank", "(Lv/VText;)V", "_rank", "Lv/VDraweeView;", "b", "Lv/VDraweeView;", "get_avatar", "()Lv/VDraweeView;", "set_avatar", "(Lv/VDraweeView;)V", "_avatar", "Lcom/p1/mobile/putong/live/base/view/LivingNewTagView;", "c", "Lcom/p1/mobile/putong/live/base/view/LivingNewTagView;", "get_live_tag", "()Lcom/p1/mobile/putong/live/base/view/LivingNewTagView;", "set_live_tag", "(Lcom/p1/mobile/putong/live/base/view/LivingNewTagView;)V", "_live_tag", Constants.INAPP_DATA_TAG, "get_name", "set_name", "_name", "Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/LiveGenderMedalView;", "e", "Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/LiveGenderMedalView;", "get_live_gender", "()Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/LiveGenderMedalView;", "set_live_gender", "(Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/LiveGenderMedalView;)V", "_live_gender", "f", "get_live_level", "set_live_level", "_live_level", "Landroidx/constraintlayout/widget/Group;", "g", "Landroidx/constraintlayout/widget/Group;", "get_medal", "()Landroidx/constraintlayout/widget/Group;", "set_medal", "(Landroidx/constraintlayout/widget/Group;)V", "_medal", "Lv/VProgressBar;", "h", "Lv/VProgressBar;", "get_live_progressBar", "()Lv/VProgressBar;", "set_live_progressBar", "(Lv/VProgressBar;)V", "_live_progressBar", "Lcom/p1/mobile/putong/live/livingroom/view/rollview/LiveTextRollView;", RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/putong/live/livingroom/view/rollview/LiveTextRollView;", "get_live_roll_text", "()Lcom/p1/mobile/putong/live/livingroom/view/rollview/LiveTextRollView;", "set_live_roll_text", "(Lcom/p1/mobile/putong/live/livingroom/view/rollview/LiveTextRollView;)V", "_live_roll_text", "j", "get_progress_layout", "set_progress_layout", "_progress_layout", "k", "get_heart", "set_heart", "_heart", "Ljava/lang/Runnable;", BLiveStormDanmakuGiftResourceType.f45292l, "Ljava/lang/Runnable;", "showPreText", "m", "showProgressText", "n", "Ljava/lang/String;", "nextText", "Companion", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
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
    public static final void m76040K(HourBoardMainlandMeItemView hourBoardMainlandMeItemView) {
        l51.m152888H(hourBoardMainlandMeItemView.getContext(), hourBoardMainlandMeItemView.showPreText, 2000L);
    }

    /* JADX INFO: renamed from: L */
    public static final void m76041L() {
    }

    /* JADX INFO: renamed from: s */
    public static void m76043s(HourBoardMainlandMeItemView hourBoardMainlandMeItemView, String str, Integer num) {
        hourBoardMainlandMeItemView.m76048C(str, hourBoardMainlandMeItemView.nextText);
    }

    /* JADX INFO: renamed from: v */
    public static void m76045v(HourBoardMainlandMeItemView hourBoardMainlandMeItemView, String str) {
        hourBoardMainlandMeItemView.get_live_roll_text().setPreAnim(400L);
        hourBoardMainlandMeItemView.get_live_roll_text().m77898G(str, new Runnable() { // from class: l.mjl
            @Override // java.lang.Runnable
            public final void run() {
                HourBoardMainlandMeItemView.m76041L();
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public static void m76046w(final HourBoardMainlandMeItemView hourBoardMainlandMeItemView) {
        hourBoardMainlandMeItemView.get_live_roll_text().setGap(10);
        hourBoardMainlandMeItemView.get_live_roll_text().setNextAnim(400L);
        hourBoardMainlandMeItemView.get_live_roll_text().m77898G(hourBoardMainlandMeItemView.nextText, new Runnable() { // from class: l.njl
            @Override // java.lang.Runnable
            public final void run() {
                HourBoardMainlandMeItemView.m76040K(this.f142304a);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public final String m76047B(BLiveHourLeaderBoardItem item) {
        long j = item.rank;
        if (j <= 0) {
            return "--";
        }
        return j > 100 ? "100+" : String.valueOf(j);
    }

    /* JADX INFO: renamed from: C */
    public final void m76048C(String content, String next) {
        get_live_roll_text().m77894C(content, true);
        get_live_roll_text().m77887v(0, true);
        get_live_roll_text().m77894C(next, false);
        get_live_roll_text().m77887v(0, false);
    }

    /* JADX INFO: renamed from: E */
    public final void m76049E(String bgUrl) {
        if (bgUrl == null || bgUrl.length() == 0) {
            bnl0.m105525M0(get_live_level(), false);
        } else {
            bnl0.m105525M0(get_live_level(), true);
            i0k.m137976c(bgUrl, get_live_level(), qa00.f156324k);
        }
    }

    @SuppressLint({"RtlHardcoded"})
    /* JADX INFO: renamed from: F */
    public final void m76050F(BLiveHourLeaderBoardItem item, BLiveHourLeaderBoard leaderBoard) {
        if (NullChecker.m82486a(leaderBoard)) {
            leaderBoard.getClass();
            if (leaderBoard.currentHourSuggestConfig.enable) {
                bnl0.m105524M(get_progress_layout(), true);
                bnl0.m105525M0(get_medal(), false);
                int i = leaderBoard.currentHourSuggestConfig.target;
                float f = (i > 0 ? (item.amount * 1.0f) / i : 0.0f) * 100.0f;
                get_live_progressBar().setProgress(f > 100.0f ? 100 : (int) f);
                bnl0.m105525M0(get_live_progressBar(), item.amount > 0);
                m76051G(f, item, leaderBoard);
                return;
            }
        }
        get_live_roll_text().reset();
        bnl0.m105524M(get_progress_layout(), false);
        bnl0.m105525M0(get_medal(), true);
    }

    /* JADX INFO: renamed from: G */
    public final void m76051G(float progress, BLiveHourLeaderBoardItem item, BLiveHourLeaderBoard leaderBoard) {
        final String strM209912v;
        if (progress >= 1.0f) {
            strM209912v = xau.m209910t(R$string.f48407u6);
            strM209912v.getClass();
        } else {
            int i = R$string.f48385t6;
            boolean zM171022s0 = vxr.m203876d().m171022s0();
            leaderBoard.getClass();
            String strM209911u = xau.m209911u(i, icr.m139458a(zM171022s0, leaderBoard.currentHourSuggestConfig.target));
            strM209911u.getClass();
            this.nextText = strM209911u;
            strM209912v = xau.m209912v(vxr.m203876d().m171022s0() ? R$string.f48473x6 : R$string.f48429v6, icr.m139459b((int) item.amount), icr.m139459b(leaderBoard.currentHourSuggestConfig.target));
            strM209912v.getClass();
            this.showProgressText = new Runnable() { // from class: l.jjl
                @Override // java.lang.Runnable
                public final void run() {
                    HourBoardMainlandMeItemView.m76046w(this.f121193a);
                }
            };
            this.showPreText = new Runnable() { // from class: l.kjl
                @Override // java.lang.Runnable
                public final void run() {
                    HourBoardMainlandMeItemView.m76045v(this.f127108a, strM209912v);
                }
            };
            l51.m152888H(getContext(), this.showProgressText, 2000L);
        }
        if (get_live_roll_text().getWidth() > 0) {
            m76048C(strM209912v, this.nextText);
        } else {
            bnl0.m105520K(get_live_roll_text()).first().subscribe(dhw.m115825d(new y20() { // from class: l.ljl
                @Override // p153l.y20
                public final void call(Object obj) {
                    HourBoardMainlandMeItemView.m76043s(this.f132344a, strM209912v, (Integer) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m76052M(@NotNull BLiveHourLeaderBoardItem item, @Nullable BLiveHourLeaderBoard leaderBoard) {
        item.getClass();
        get_name().setText(item.userName);
        get_rank().setText(m76047B(item));
        get_rank().setTextSize(item.rank > 99 ? 14.0f : 18.0f);
        bnl0.m105524M(get_heart(), vxr.m203876d().m171026u0());
        if (xau.m209897B()) {
            get_heart().setText(icr.m139460c(vxr.m203876d().m171022s0(), item.amount));
        } else {
            get_heart().setText(String.valueOf(item.amount));
            bnl0.m105563k(get_heart(), getResources().getDrawable(vxr.m203876d().m171022s0() ? obc0.f146113M3 : obc0.f146421n));
            get_heart().setCompoundDrawablePadding(qa00.f156316c);
        }
        izs.m142869t("context_single_room", get_avatar(), item.userImage, qa00.f156337x);
        LivingNewTagView livingNewTagView = get_live_tag();
        BLiveState bLiveState = item.liveState;
        bLiveState.getClass();
        livingNewTagView.m69968s(bLiveState);
        bnl0.m105524M(get_progress_layout(), true);
        LiveGenderMedalView liveGenderMedalView = get_live_gender();
        String str = item.gender;
        str.getClass();
        liveGenderMedalView.m76072Q(str, item.age, false);
        m76049E(item.backgroundUrl);
        m76050F(item, leaderBoard);
    }

    @NotNull
    public final VDraweeView get_avatar() {
        VDraweeView vDraweeView = this._avatar;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_avatar");
        return null;
    }

    @NotNull
    public final VText get_heart() {
        VText vText = this._heart;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_heart");
        return null;
    }

    @NotNull
    public final LiveGenderMedalView get_live_gender() {
        LiveGenderMedalView liveGenderMedalView = this._live_gender;
        if (liveGenderMedalView != null) {
            return liveGenderMedalView;
        }
        Intrinsics.m88391r("_live_gender");
        return null;
    }

    @NotNull
    public final VDraweeView get_live_level() {
        VDraweeView vDraweeView = this._live_level;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_live_level");
        return null;
    }

    @NotNull
    public final VProgressBar get_live_progressBar() {
        VProgressBar vProgressBar = this._live_progressBar;
        if (vProgressBar != null) {
            return vProgressBar;
        }
        Intrinsics.m88391r("_live_progressBar");
        return null;
    }

    @NotNull
    public final LiveTextRollView get_live_roll_text() {
        LiveTextRollView liveTextRollView = this._live_roll_text;
        if (liveTextRollView != null) {
            return liveTextRollView;
        }
        Intrinsics.m88391r("_live_roll_text");
        return null;
    }

    @NotNull
    public final LivingNewTagView get_live_tag() {
        LivingNewTagView livingNewTagView = this._live_tag;
        if (livingNewTagView != null) {
            return livingNewTagView;
        }
        Intrinsics.m88391r("_live_tag");
        return null;
    }

    @NotNull
    public final Group get_medal() {
        Group group = this._medal;
        if (group != null) {
            return group;
        }
        Intrinsics.m88391r("_medal");
        return null;
    }

    @NotNull
    public final VText get_name() {
        VText vText = this._name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_name");
        return null;
    }

    @NotNull
    public final Group get_progress_layout() {
        Group group = this._progress_layout;
        if (group != null) {
            return group;
        }
        Intrinsics.m88391r("_progress_layout");
        return null;
    }

    @NotNull
    public final VText get_rank() {
        VText vText = this._rank;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_rank");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76053z(this);
        get_live_progressBar().setMax(100);
        get_rank().setTypeface(Typeface.defaultFromStyle(1));
    }

    public final void reset() {
        l51.m152890J(this.showProgressText);
        l51.m152890J(this.showPreText);
        get_live_progressBar().setProgress(0);
        get_live_roll_text().mo77885t();
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
    public final void m76053z(View view) {
        ojl.m167866a(this, view);
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
