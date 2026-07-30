package com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p051p1.mobile.putong.live.base.data.BLivePkCategory;
import com.p051p1.mobile.putong.live.base.data.BLiveState;
import com.p051p1.mobile.putong.live.base.view.LivingNewTagView;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardMainlandItemView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.i0k;
import p153l.icr;
import p153l.ijl;
import p153l.izs;
import p153l.obc0;
import p153l.qa00;
import p153l.uhl;
import p153l.vxr;
import p153l.xau;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 R\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010<\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010#\u001a\u0004\b:\u0010%\"\u0004\b;\u0010'R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010H\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010+\u001a\u0004\bF\u0010-\"\u0004\bG\u0010/R\"\u0010L\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010#\u001a\u0004\bJ\u0010%\"\u0004\bK\u0010'¨\u0006M"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardMainlandItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "bgUrl", "", "k0", "(Ljava/lang/String;)V", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoardItem;", Item.TYPE, "Ll/uhl;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoard;", "leaderBoard", "l0", "(Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoardItem;Ll/uhl;Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoard;)V", "Landroid/view/View;", OMSTemplateModeType.view, "i0", "(Landroid/view/View;)V", "", BLivePkCategory.rank, "j0", "(J)Ljava/lang/String;", "Lv/VText;", Constants.INAPP_DATA_TAG, "Lv/VText;", "get_rank", "()Lv/VText;", "set_rank", "(Lv/VText;)V", "_rank", "Lv/VDraweeView;", "e", "Lv/VDraweeView;", "get_avatar", "()Lv/VDraweeView;", "set_avatar", "(Lv/VDraweeView;)V", "_avatar", "Lcom/p1/mobile/putong/live/base/view/LivingNewTagView;", "f", "Lcom/p1/mobile/putong/live/base/view/LivingNewTagView;", "get_live_tag", "()Lcom/p1/mobile/putong/live/base/view/LivingNewTagView;", "set_live_tag", "(Lcom/p1/mobile/putong/live/base/view/LivingNewTagView;)V", "_live_tag", "g", "get_name", "set_name", "_name", "Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/LiveGenderMedalView;", "h", "Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/LiveGenderMedalView;", "get_gender", "()Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/LiveGenderMedalView;", "set_gender", "(Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/LiveGenderMedalView;)V", "_gender", RXScreenCaptureService.KEY_INDEX, "get_level", "set_level", "_level", "j", "get_heart", "set_heart", "_heart", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class HourBoardMainlandItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText _rank;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VDraweeView _avatar;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public LivingNewTagView _live_tag;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _name;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public LiveGenderMedalView _gender;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VDraweeView _level;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VText _heart;

    public /* synthetic */ HourBoardMainlandItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m76035h0(uhl uhlVar, BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem, View view) {
        uhlVar.mo76107F(bLiveHourLeaderBoardItem);
    }

    /* JADX INFO: renamed from: k0 */
    private final void m76036k0(String bgUrl) {
        if (bgUrl == null || bgUrl.length() == 0) {
            bnl0.m105524M(get_level(), false);
        } else {
            bnl0.m105524M(get_level(), true);
            i0k.m137976c(bgUrl, get_level(), qa00.f156324k);
        }
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
    public final LiveGenderMedalView get_gender() {
        LiveGenderMedalView liveGenderMedalView = this._gender;
        if (liveGenderMedalView != null) {
            return liveGenderMedalView;
        }
        Intrinsics.m88391r("_gender");
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
    public final VDraweeView get_level() {
        VDraweeView vDraweeView = this._level;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_level");
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
    public final VText get_name() {
        VText vText = this._name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_name");
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

    /* JADX INFO: renamed from: i0 */
    public final void m76037i0(View view) {
        ijl.m140211a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final String m76038j0(long rank) {
        if (rank <= 0) {
            return "--";
        }
        return rank > 100 ? "100+" : String.valueOf(rank);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m76039l0(@NotNull final BLiveHourLeaderBoardItem item, @NotNull final uhl listener, @Nullable BLiveHourLeaderBoard leaderBoard) {
        item.getClass();
        listener.getClass();
        get_name().setText(item.userName);
        get_rank().setText(m76038j0(item.rank));
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
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.hjl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HourBoardMainlandItemView.m76035h0(listener, item, view);
            }
        });
        LiveGenderMedalView liveGenderMedalView = get_gender();
        String str = item.gender;
        str.getClass();
        liveGenderMedalView.m76072Q(str, item.age, false);
        m76036k0(item.backgroundUrl);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76037i0(this);
        get_rank().setTypeface(Typeface.defaultFromStyle(1));
    }

    public final void set_avatar(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._avatar = vDraweeView;
    }

    public final void set_gender(@NotNull LiveGenderMedalView liveGenderMedalView) {
        liveGenderMedalView.getClass();
        this._gender = liveGenderMedalView;
    }

    public final void set_heart(@NotNull VText vText) {
        vText.getClass();
        this._heart = vText;
    }

    public final void set_level(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._level = vDraweeView;
    }

    public final void set_live_tag(@NotNull LivingNewTagView livingNewTagView) {
        livingNewTagView.getClass();
        this._live_tag = livingNewTagView;
    }

    public final void set_name(@NotNull VText vText) {
        vText.getClass();
        this._name = vText;
    }

    public final void set_rank(@NotNull VText vText) {
        vText.getClass();
        this._rank = vText;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HourBoardMainlandItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HourBoardMainlandItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HourBoardMainlandItemView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
