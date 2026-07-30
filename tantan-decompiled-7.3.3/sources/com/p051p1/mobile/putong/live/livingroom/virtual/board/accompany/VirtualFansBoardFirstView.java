package com.p051p1.mobile.putong.live.livingroom.virtual.board.accompany;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceHourLeaderBoardItem;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.base.view.LivingNewTagView;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.virtual.board.accompany.VirtualFansBoardFirstView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.n3d0;
import p153l.n9c0;
import p153l.obc0;
import p153l.osn0;
import p153l.qa00;
import p153l.usn0;
import p153l.xyl0;
import p153l.zrv;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0012\u0010\u0010J\u001d\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u0010J\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u0010R\"\u0010!\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010'\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\u000eR\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010C\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010#\u001a\u0004\bA\u0010%\"\u0004\bB\u0010\u000eR\"\u0010K\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010S\u001a\u00020L8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010W\u001a\u00020L8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010N\u001a\u0004\bU\u0010P\"\u0004\bV\u0010RR\u0018\u0010Z\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010Y¨\u0006["}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/board/accompany/VirtualFansBoardFirstView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "j0", "(Landroid/view/View;)V", "r", "()V", "l0", "onFinishInflate", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceHourLeaderBoardItem;", "leaderBoards", "Ll/osn0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "m0", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceHourLeaderBoardItem;Ll/osn0;)V", "n0", "k0", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/live/livingroom/virtual/board/accompany/VirtualFansBoardFirstView;", "get_root", "()Lcom/p1/mobile/putong/live/livingroom/virtual/board/accompany/VirtualFansBoardFirstView;", "set_root", "(Lcom/p1/mobile/putong/live/livingroom/virtual/board/accompany/VirtualFansBoardFirstView;)V", "_root", "e", "Landroid/view/View;", "get_bg", "()Landroid/view/View;", "set_bg", "_bg", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "f", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "get_rank_svga", "()Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "set_rank_svga", "(Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;)V", "_rank_svga", "Lcom/p1/mobile/putong/live/livingroom/common/avatar/CommonMaskAvatarView;", "g", "Lcom/p1/mobile/putong/live/livingroom/common/avatar/CommonMaskAvatarView;", "get_avatar", "()Lcom/p1/mobile/putong/live/livingroom/common/avatar/CommonMaskAvatarView;", "set_avatar", "(Lcom/p1/mobile/putong/live/livingroom/common/avatar/CommonMaskAvatarView;)V", "_avatar", "Lv/VImage;", "h", "Lv/VImage;", "get_crown", "()Lv/VImage;", "set_crown", "(Lv/VImage;)V", "_crown", RXScreenCaptureService.KEY_INDEX, "get_avatar_bottom", "set_avatar_bottom", "_avatar_bottom", "Lcom/p1/mobile/putong/live/base/view/LivingNewTagView;", "j", "Lcom/p1/mobile/putong/live/base/view/LivingNewTagView;", "get_living", "()Lcom/p1/mobile/putong/live/base/view/LivingNewTagView;", "set_living", "(Lcom/p1/mobile/putong/live/base/view/LivingNewTagView;)V", "_living", "Lv/VText;", "k", "Lv/VText;", "get_name", "()Lv/VText;", "set_name", "(Lv/VText;)V", "_name", BLiveStormDanmakuGiftResourceType.f45292l, "get_heart", "set_heart", "_heart", "m", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceHourLeaderBoardItem;", "mHourLeaderBoardItem", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class VirtualFansBoardFirstView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VirtualFansBoardFirstView _root;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public View _bg;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public AnimEffectPlayer _rank_svga;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public CommonMaskAvatarView _avatar;

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
    @Nullable
    public BLiveVoiceHourLeaderBoardItem mHourLeaderBoardItem;

    public /* synthetic */ VirtualFansBoardFirstView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m78029h0(osn0 osn0Var, BLiveVoiceHourLeaderBoardItem bLiveVoiceHourLeaderBoardItem, View view) {
        osn0Var.mo78062p(bLiveVoiceHourLeaderBoardItem);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m78030i0(View view) {
    }

    /* JADX INFO: renamed from: l0 */
    private final void m78031l0() {
        get_rank_svga().m69686m("https://auto.tancdn.com/v1/raw/5aa8daac-87da-4bca-9ea9-61a6985b620413.pdf", -1, null, false);
    }

    /* JADX INFO: renamed from: r */
    private final void m78032r() {
        float fM105592y0 = bnl0.m105592y0() * 0.35466668f;
        float f = fM105592y0 / 0.66169155f;
        int i = (int) fM105592y0;
        bnl0.m105507D0(i, this);
        int i2 = (int) f;
        bnl0.m105505C0(this, i2);
        bnl0.m105507D0(i, get_rank_svga());
        bnl0.m105505C0(get_rank_svga(), i2);
        bnl0.m105507D0(i, get_bg());
        bnl0.m105505C0(get_bg(), i2);
    }

    @NotNull
    public final CommonMaskAvatarView get_avatar() {
        CommonMaskAvatarView commonMaskAvatarView = this._avatar;
        if (commonMaskAvatarView != null) {
            return commonMaskAvatarView;
        }
        Intrinsics.m88391r("_avatar");
        return null;
    }

    @NotNull
    public final View get_avatar_bottom() {
        View view = this._avatar_bottom;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_avatar_bottom");
        return null;
    }

    @NotNull
    public final View get_bg() {
        View view = this._bg;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_bg");
        return null;
    }

    @NotNull
    public final VImage get_crown() {
        VImage vImage = this._crown;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_crown");
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
    public final LivingNewTagView get_living() {
        LivingNewTagView livingNewTagView = this._living;
        if (livingNewTagView != null) {
            return livingNewTagView;
        }
        Intrinsics.m88391r("_living");
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
    public final AnimEffectPlayer get_rank_svga() {
        AnimEffectPlayer animEffectPlayer = this._rank_svga;
        if (animEffectPlayer != null) {
            return animEffectPlayer;
        }
        Intrinsics.m88391r("_rank_svga");
        return null;
    }

    @NotNull
    public final VirtualFansBoardFirstView get_root() {
        VirtualFansBoardFirstView virtualFansBoardFirstView = this._root;
        if (virtualFansBoardFirstView != null) {
            return virtualFansBoardFirstView;
        }
        Intrinsics.m88391r("_root");
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m78033j0(View view) {
        xyl0.m213632a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m78034k0() {
        this.mHourLeaderBoardItem = null;
        get_avatar().m73302i0();
        get_avatar().getRealAvatarView().getHierarchy().m207041D(obc0.f146169R2);
        get_name().setText(zrv.f205803e.getString(R$string.f48209l6));
        get_heart().setText("");
        bnl0.m105524M(get_heart(), false);
        setOnClickListener(new View.OnClickListener() { // from class: l.wyl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VirtualFansBoardFirstView.m78030i0(view);
            }
        });
        bnl0.m105524M(get_crown(), true);
        get_bg().setBackgroundResource(obc0.f146461q3);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m78035m0(@NotNull final BLiveVoiceHourLeaderBoardItem leaderBoards, @NotNull final osn0 listener) {
        leaderBoards.getClass();
        listener.getClass();
        this.mHourLeaderBoardItem = leaderBoards;
        get_name().setTextColor(n3d0.m161277a(n9c0.f140856p1));
        get_avatar().getRealAvatarView().getHierarchy().m207041D(obc0.f146169R2);
        usn0.m197951f(get_avatar(), leaderBoards, qa00.f156304Q);
        bnl0.m105524M(get_crown(), !get_avatar().m73304k0());
        get_name().setText(leaderBoards.user.name);
        bnl0.m105524M(get_living(), false);
        get_bg().setBackgroundResource(obc0.f146461q3);
        bnl0.m105524M(get_heart(), true);
        get_heart().setText(usn0.m197949d(leaderBoards.amount));
        setOnClickListener(new View.OnClickListener() { // from class: l.vyl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VirtualFansBoardFirstView.m78029h0(listener, leaderBoards, view);
            }
        });
        m78031l0();
    }

    /* JADX INFO: renamed from: n0 */
    public final void m78036n0() {
        m78034k0();
        m78031l0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78033j0(this);
        m78032r();
    }

    public final void set_avatar(@NotNull CommonMaskAvatarView commonMaskAvatarView) {
        commonMaskAvatarView.getClass();
        this._avatar = commonMaskAvatarView;
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

    public final void set_rank_svga(@NotNull AnimEffectPlayer animEffectPlayer) {
        animEffectPlayer.getClass();
        this._rank_svga = animEffectPlayer;
    }

    public final void set_root(@NotNull VirtualFansBoardFirstView virtualFansBoardFirstView) {
        virtualFansBoardFirstView.getClass();
        this._root = virtualFansBoardFirstView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VirtualFansBoardFirstView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VirtualFansBoardFirstView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VirtualFansBoardFirstView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
