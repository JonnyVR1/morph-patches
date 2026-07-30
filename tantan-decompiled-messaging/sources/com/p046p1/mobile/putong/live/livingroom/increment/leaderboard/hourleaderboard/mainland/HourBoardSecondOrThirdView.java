package com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.core.data.MerchandiseTimeUnit;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p046p1.mobile.putong.live.base.data.BLiveLeaderBoards;
import com.p046p1.mobile.putong.live.base.data.BLiveState;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.base.view.LivingNewTagView;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardSecondOrThirdView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.ap0;
import p149l.dfl;
import p149l.e30;
import p149l.gar;
import p149l.hxs;
import p149l.i3c0;
import p149l.mqv;
import p149l.rhl;
import p149l.t100;
import p149l.uvr;
import p149l.w8u;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00112\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\fH\u0014¢\u0006\u0004\b$\u0010\u0010J%\u0010(\u001a\u00020\f2\u0006\u0010%\u001a\u00020 2\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b(\u0010)J9\u0010-\u001a\u00020\f2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00190*2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00110,2\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b/\u0010\u001fJ\u0015\u00100\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b0\u0010\u001fJ\r\u00101\u001a\u00020\f¢\u0006\u0004\b1\u0010\u0010J\u0015\u00102\u001a\u00020\f2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b2\u00103R\"\u0010:\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010@\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010\u000eR\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010\\\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010<\u001a\u0004\bZ\u0010>\"\u0004\b[\u0010\u000eR\"\u0010d\u001a\u00020]8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010l\u001a\u00020e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\"\u0010p\u001a\u00020e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bm\u0010g\u001a\u0004\bn\u0010i\"\u0004\bo\u0010kR\"\u0010t\u001a\u00020e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bq\u0010g\u001a\u0004\br\u0010i\"\u0004\bs\u0010kR\"\u0010x\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bu\u0010S\u001a\u0004\bv\u0010U\"\u0004\bw\u0010W¨\u0006y"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardSecondOrThirdView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "k0", "(Landroid/view/View;)V", "r", "()V", "", "userImage", "userName", "", "amount", FirebaseAnalytics.Param.INDEX, "o0", "(Ljava/lang/String;Ljava/lang/String;JI)V", "Lcom/p1/mobile/putong/live/base/data/BLiveLeaderBoards;", "boards", MerchandiseTimeUnit.week, "q0", "(Lcom/p1/mobile/putong/live/base/data/BLiveLeaderBoards;Ljava/lang/String;)V", "p0", "(I)V", "Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoardItem;", Item.TYPE, "m0", "(Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoardItem;)Ljava/lang/String;", "onFinishInflate", "hourLeaderBoardItem", "Ll/dfl;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "r0", "(Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoardItem;Ll/dfl;I)V", "Ll/mqv;", "leaderBoards", "Ll/e30;", "s0", "(Ll/mqv;Ll/e30;ILjava/lang/String;)V", "n0", "t0", "l0", "setHeartColorAndText", "(Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoardItem;)V", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardSecondOrThirdView;", "get_root", "()Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardSecondOrThirdView;", "set_root", "(Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardSecondOrThirdView;)V", "_root", "e", "Landroid/view/View;", "get_bg", "()Landroid/view/View;", "set_bg", "_bg", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "f", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "get_rank_svga", "()Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "set_rank_svga", "(Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;)V", "_rank_svga", "Lv/VDraweeView;", "g", "Lv/VDraweeView;", "get_avatar", "()Lv/VDraweeView;", "set_avatar", "(Lv/VDraweeView;)V", "_avatar", "Lv/VImage;", "h", "Lv/VImage;", "get_crown", "()Lv/VImage;", "set_crown", "(Lv/VImage;)V", "_crown", RXScreenCaptureService.KEY_INDEX, "get_avatar_bottom", "set_avatar_bottom", "_avatar_bottom", "Lcom/p1/mobile/putong/live/base/view/LivingNewTagView;", "j", "Lcom/p1/mobile/putong/live/base/view/LivingNewTagView;", "get_living", "()Lcom/p1/mobile/putong/live/base/view/LivingNewTagView;", "set_living", "(Lcom/p1/mobile/putong/live/base/view/LivingNewTagView;)V", "_living", "Lv/VText;", "k", "Lv/VText;", "get_name", "()Lv/VText;", "set_name", "(Lv/VText;)V", "_name", BLiveStormDanmakuGiftResourceType.f44444l, "get_heart", "set_heart", "_heart", "m", "get_rank", "set_rank", "_rank", "n", "get_rank_icon", "set_rank_icon", "_rank_icon", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class HourBoardSecondOrThirdView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public HourBoardSecondOrThirdView _root;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public View _bg;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public AnimEffectPlayer _rank_svga;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VDraweeView _avatar;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VImage _crown;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public View _avatar_bottom;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public LivingNewTagView _living;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VText _name;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VText _heart;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VText _rank;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VImage _rank_icon;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardSecondOrThirdView$a */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m87232d2 = {"com/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardSecondOrThirdView$a", "Ll/ap0;", "", "b", "()V", "g", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C12860a extends ap0 {
        public C12860a() {
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: b */
        public void mo69562b() {
            xdl0.m208345M0(HourBoardSecondOrThirdView.this.get_rank_svga(), false);
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: g */
        public void mo69603g() {
            super.mo69603g();
            xdl0.m208345M0(HourBoardSecondOrThirdView.this.get_rank_svga(), true);
        }
    }

    public /* synthetic */ HourBoardSecondOrThirdView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m74871h0(e30 e30Var, User user, View view) {
        e30Var.call(user.f56011id);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m74872i0(dfl dflVar, BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem, View view) {
        dflVar.mo74924F(bLiveHourLeaderBoardItem);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m74873j0(View view) {
    }

    /* JADX INFO: renamed from: p0 */
    private final void m74874p0(int index) {
        if (index == 1) {
            get_crown().setImageResource(i3c0.f111181u3);
            get_bg().setBackgroundResource(i3c0.f111145r3);
        } else {
            if (index != 2) {
                return;
            }
            get_crown().setImageResource(i3c0.f111193v3);
            get_bg().setBackgroundResource(i3c0.f111157s3);
        }
    }

    /* JADX INFO: renamed from: q0 */
    private final void m74875q0(BLiveLeaderBoards boards, String week) {
        if (!TextUtils.equals(week, "currentWeek")) {
            xdl0.m208344M(get_rank(), false);
            xdl0.m208344M(get_rank_icon(), false);
            return;
        }
        xdl0.m208344M(get_rank(), true);
        if (boards.isNewUser) {
            xdl0.m208344M(get_rank_icon(), false);
            xdl0.m208335H0(get_rank(), "NEW");
            get_rank().setTextColor(Color.parseColor("#FF603D"));
            return;
        }
        xdl0.m208344M(get_rank_icon(), true);
        VText vText = get_rank();
        int i = boards.rankDiff;
        xdl0.m208335H0(vText, "本周排名" + (i == 0 ? "" : Integer.valueOf(i)));
        int i2 = boards.rankDiff;
        if (i2 > 0) {
            xdl0.m208346N(get_rank_icon(), i3c0.f110932Z5);
        } else if (i2 < 0) {
            xdl0.m208346N(get_rank_icon(), i3c0.f110910X5);
        } else {
            xdl0.m208346N(get_rank_icon(), i3c0.f110921Y5);
        }
    }

    /* JADX INFO: renamed from: r */
    private final void m74876r() {
        float fM208412y0 = xdl0.m208412y0() * 0.26933333f;
        int i = (int) fM208412y0;
        xdl0.m208327D0(i, this);
        int i2 = (int) (fM208412y0 / 0.58381504f);
        xdl0.m208325C0(this, i2);
        xdl0.m208327D0(i, get_rank_svga());
        xdl0.m208325C0(get_rank_svga(), i2);
        xdl0.m208327D0(i, get_bg());
        xdl0.m208325C0(get_bg(), i2);
        int i3 = (int) (0.41353384f * fM208412y0);
        xdl0.m208327D0(i3, get_avatar());
        xdl0.m208325C0(get_avatar(), i3);
        int i4 = (int) (0.6315789f * fM208412y0);
        xdl0.m208327D0(i4, get_crown());
        xdl0.m208325C0(get_crown(), i4);
        xdl0.m208360X(get_avatar(), (int) (0.22556391f * fM208412y0));
        xdl0.m208360X(get_name(), (int) (fM208412y0 * 0.120300755f));
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
    public final View get_avatar_bottom() {
        View view = this._avatar_bottom;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_avatar_bottom");
        return null;
    }

    @NotNull
    public final View get_bg() {
        View view = this._bg;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_bg");
        return null;
    }

    @NotNull
    public final VImage get_crown() {
        VImage vImage = this._crown;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_crown");
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
    public final LivingNewTagView get_living() {
        LivingNewTagView livingNewTagView = this._living;
        if (livingNewTagView != null) {
            return livingNewTagView;
        }
        Intrinsics.m87502r("_living");
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
    public final VText get_rank() {
        VText vText = this._rank;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_rank");
        return null;
    }

    @NotNull
    public final VImage get_rank_icon() {
        VImage vImage = this._rank_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_rank_icon");
        return null;
    }

    @NotNull
    public final AnimEffectPlayer get_rank_svga() {
        AnimEffectPlayer animEffectPlayer = this._rank_svga;
        if (animEffectPlayer != null) {
            return animEffectPlayer;
        }
        Intrinsics.m87502r("_rank_svga");
        return null;
    }

    @NotNull
    public final HourBoardSecondOrThirdView get_root() {
        HourBoardSecondOrThirdView hourBoardSecondOrThirdView = this._root;
        if (hourBoardSecondOrThirdView != null) {
            return hourBoardSecondOrThirdView;
        }
        Intrinsics.m87502r("_root");
        return null;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m74877k0(View view) {
        rhl.m179387a(this, view);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m74878l0() {
        get_avatar().setController(null);
        get_name().setText(ypv.f199497e.getString(R$string.f47361l6));
        get_heart().setText("");
        get_rank().setText("");
        get_rank_svga().stepToFrame(0.0f, false);
        get_rank_svga().setAnimListener(null);
        xdl0.m208345M0(get_rank_svga(), false);
        xdl0.m208344M(get_heart(), false);
        xdl0.m208344M(get_rank(), false);
        xdl0.m208344M(get_rank_icon(), false);
    }

    /* JADX INFO: renamed from: m0 */
    public final String m74879m0(BLiveHourLeaderBoardItem item) {
        long j = item.rank;
        if (j < 0) {
            return "上榜还需" + gar.m125008b(item.gap) + "人气";
        }
        long j2 = item.gap;
        if (j > 1) {
            return "落后" + gar.m125008b(j2) + "人气";
        }
        return "领先" + gar.m125008b(j2) + "人气";
    }

    /* JADX INFO: renamed from: n0 */
    public final void m74880n0(int index) {
        xdl0.m208345M0(get_rank_svga(), true);
        get_rank_svga().clearDynamicData();
        get_rank_svga().m68504n();
        get_rank_svga().mo68502l(index == 1 ? "https://auto.tancdn.com/v1/raw/69cadcb7-182a-4b98-870f-ba7525d5954d12.pdf" : "https://auto.tancdn.com/v1/raw/2dc517cd-df03-4c46-bfa2-0fa8c16604d413.pdf", 1, new C12860a());
    }

    /* JADX INFO: renamed from: o0 */
    public final void m74881o0(String userImage, String userName, long amount, int index) {
        xdl0.m208345M0(get_avatar(), true);
        if (userImage.length() > 0) {
            hxs.m133406s("context_single_room", get_avatar(), userImage);
        }
        get_name().setText(userName);
        xdl0.m208344M(get_heart(), uvr.m196087d().m162719u0());
        if (w8u.m202204B()) {
            get_heart().setText(gar.m125009c(uvr.m196087d().m162715s0(), amount));
        } else {
            get_heart().setText(String.valueOf(amount));
            xdl0.m208383k(get_heart(), getResources().getDrawable(uvr.m196087d().m162715s0() ? i3c0.f110785M3 : i3c0.f111093n));
            get_heart().setCompoundDrawablePadding(t100.f167254c);
        }
        m74874p0(index);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74877k0(this);
        if (!ypv.m215672k().m195802b7()) {
            m74876r();
        }
        get_rank_svga().setAlpha(0.8f);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m74882r0(@NotNull final BLiveHourLeaderBoardItem hourLeaderBoardItem, @NotNull final dfl listener, int index) {
        hourLeaderBoardItem.getClass();
        listener.getClass();
        String str = hourLeaderBoardItem.userImage;
        str.getClass();
        String str2 = hourLeaderBoardItem.userName;
        str2.getClass();
        m74881o0(str, str2, hourLeaderBoardItem.amount, index);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.ohl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HourBoardSecondOrThirdView.m74872i0(listener, hourLeaderBoardItem, view);
            }
        });
        LivingNewTagView livingNewTagView = get_living();
        BLiveState bLiveState = hourLeaderBoardItem.liveState;
        bLiveState.getClass();
        livingNewTagView.m68785s(bLiveState);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m74883s0(@NotNull mqv<BLiveLeaderBoards> leaderBoards, @NotNull final e30<String> listener, int index, @NotNull String week) {
        leaderBoards.getClass();
        listener.getClass();
        week.getClass();
        final User user = leaderBoards.f135304a.user;
        if (NullChecker.m81303a(user)) {
            get_heart().setTextColor(Color.parseColor("#FE7E1D"));
            BLiveLeaderBoards bLiveLeaderBoards = leaderBoards.f135304a;
            bLiveLeaderBoards.getClass();
            m74875q0(bLiveLeaderBoards, week);
            String str = user.pictures.get(0).url;
            str.getClass();
            String str2 = user.name;
            str2.getClass();
            m74881o0(str, str2, (long) leaderBoards.f135304a.amount, index);
            setOnClickListener(new View.OnClickListener() { // from class: l.phl
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HourBoardSecondOrThirdView.m74871h0(listener, user, view);
                }
            });
        }
    }

    public final void setHeartColorAndText(@NotNull BLiveHourLeaderBoardItem item) {
        item.getClass();
        get_heart().setTextColor(Color.parseColor("#FE7E1D"));
        get_heart().setText(m74879m0(item));
        get_name().setHeight(t100.f167267p);
        get_heart().setHeight(t100.f167265n);
    }

    public final void set_avatar(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._avatar = vDraweeView;
    }

    public final void set_avatar_bottom(@NotNull View view) {
        view.getClass();
        this._avatar_bottom = view;
    }

    public final void set_bg(@NotNull View view) {
        view.getClass();
        this._bg = view;
    }

    public final void set_crown(@NotNull VImage vImage) {
        vImage.getClass();
        this._crown = vImage;
    }

    public final void set_heart(@NotNull VText vText) {
        vText.getClass();
        this._heart = vText;
    }

    public final void set_living(@NotNull LivingNewTagView livingNewTagView) {
        livingNewTagView.getClass();
        this._living = livingNewTagView;
    }

    public final void set_name(@NotNull VText vText) {
        vText.getClass();
        this._name = vText;
    }

    public final void set_rank(@NotNull VText vText) {
        vText.getClass();
        this._rank = vText;
    }

    public final void set_rank_icon(@NotNull VImage vImage) {
        vImage.getClass();
        this._rank_icon = vImage;
    }

    public final void set_rank_svga(@NotNull AnimEffectPlayer animEffectPlayer) {
        animEffectPlayer.getClass();
        this._rank_svga = animEffectPlayer;
    }

    public final void set_root(@NotNull HourBoardSecondOrThirdView hourBoardSecondOrThirdView) {
        hourBoardSecondOrThirdView.getClass();
        this._root = hourBoardSecondOrThirdView;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m74884t0(int index) {
        m74874p0(index);
        get_name().setText(ypv.f199497e.getString(R$string.f47361l6));
        setOnClickListener(new View.OnClickListener() { // from class: l.qhl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HourBoardSecondOrThirdView.m74873j0(view);
            }
        });
        xdl0.m208344M(get_living(), false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HourBoardSecondOrThirdView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HourBoardSecondOrThirdView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HourBoardSecondOrThirdView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
