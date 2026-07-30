package com.p046p1.mobile.putong.live.livingroom.virtual.board.accompany;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceHourLeaderBoardItem;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.base.view.LivingNewTagView;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.virtual.board.accompany.VirtualFansBoardSecondOrThirdView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VImage;
import p147v.VText;
import p149l.ap0;
import p149l.i3c0;
import p149l.kjn0;
import p149l.qjn0;
import p149l.t100;
import p149l.vpl0;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0014\u0010\u0010J%\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u0013J\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u0013J\r\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u0010R\"\u0010$\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010*\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010\u000eR\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010F\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010&\u001a\u0004\bD\u0010(\"\u0004\bE\u0010\u000eR\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010V\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010Z\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010Q\u001a\u0004\bX\u0010S\"\u0004\bY\u0010UR\u0018\u0010]\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\¨\u0006^"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/board/accompany/VirtualFansBoardSecondOrThirdView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "i0", "(Landroid/view/View;)V", "r", "()V", FirebaseAnalytics.Param.INDEX, "l0", "(I)V", "onFinishInflate", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceHourLeaderBoardItem;", Item.TYPE, "Ll/kjn0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "m0", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceHourLeaderBoardItem;Ll/kjn0;I)V", "k0", "n0", "j0", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/live/livingroom/virtual/board/accompany/VirtualFansBoardSecondOrThirdView;", "get_root", "()Lcom/p1/mobile/putong/live/livingroom/virtual/board/accompany/VirtualFansBoardSecondOrThirdView;", "set_root", "(Lcom/p1/mobile/putong/live/livingroom/virtual/board/accompany/VirtualFansBoardSecondOrThirdView;)V", "_root", "e", "Landroid/view/View;", "get_bg", "()Landroid/view/View;", "set_bg", "_bg", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "f", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "get_rank_svga", "()Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "set_rank_svga", "(Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;)V", "_rank_svga", "Lcom/p1/mobile/putong/live/livingroom/common/avatar/CommonMaskAvatarView;", "g", "Lcom/p1/mobile/putong/live/livingroom/common/avatar/CommonMaskAvatarView;", "get_avatar", "()Lcom/p1/mobile/putong/live/livingroom/common/avatar/CommonMaskAvatarView;", "set_avatar", "(Lcom/p1/mobile/putong/live/livingroom/common/avatar/CommonMaskAvatarView;)V", "_avatar", "Lv/VImage;", "h", "Lv/VImage;", "get_crown", "()Lv/VImage;", "set_crown", "(Lv/VImage;)V", "_crown", RXScreenCaptureService.KEY_INDEX, "get_avatar_bottom", "set_avatar_bottom", "_avatar_bottom", "Lcom/p1/mobile/putong/live/base/view/LivingNewTagView;", "j", "Lcom/p1/mobile/putong/live/base/view/LivingNewTagView;", "get_living", "()Lcom/p1/mobile/putong/live/base/view/LivingNewTagView;", "set_living", "(Lcom/p1/mobile/putong/live/base/view/LivingNewTagView;)V", "_living", "Lv/VText;", "k", "Lv/VText;", "get_name", "()Lv/VText;", "set_name", "(Lv/VText;)V", "_name", BLiveStormDanmakuGiftResourceType.f44444l, "get_heart", "set_heart", "_heart", "m", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceHourLeaderBoardItem;", "mHourLeaderBoardItem", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class VirtualFansBoardSecondOrThirdView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VirtualFansBoardSecondOrThirdView _root;

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

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.board.accompany.VirtualFansBoardSecondOrThirdView$a */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m87232d2 = {"com/p1/mobile/putong/live/livingroom/virtual/board/accompany/VirtualFansBoardSecondOrThirdView$a", "Ll/ap0;", "", "b", "()V", "g", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C12949a extends ap0 {
        public C12949a() {
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: b */
        public void mo69562b() {
            xdl0.m208345M0(VirtualFansBoardSecondOrThirdView.this.get_rank_svga(), false);
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: g */
        public void mo69603g() {
            super.mo69603g();
            xdl0.m208345M0(VirtualFansBoardSecondOrThirdView.this.get_rank_svga(), true);
        }
    }

    public /* synthetic */ VirtualFansBoardSecondOrThirdView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m76855h0(kjn0 kjn0Var, BLiveVoiceHourLeaderBoardItem bLiveVoiceHourLeaderBoardItem, View view) {
        kjn0Var.mo76879q(bLiveVoiceHourLeaderBoardItem);
    }

    /* JADX INFO: renamed from: l0 */
    private final void m76856l0(int index) {
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

    /* JADX INFO: renamed from: r */
    private final void m76857r() {
        float fM208412y0 = xdl0.m208412y0() * 0.26933333f;
        float f = fM208412y0 / 0.58381504f;
        int i = (int) fM208412y0;
        xdl0.m208327D0(i, this);
        int i2 = (int) f;
        xdl0.m208325C0(this, i2);
        xdl0.m208327D0(i, get_rank_svga());
        xdl0.m208325C0(get_rank_svga(), i2);
        xdl0.m208327D0(i, get_bg());
        xdl0.m208325C0(get_bg(), i2);
    }

    @NotNull
    public final CommonMaskAvatarView get_avatar() {
        CommonMaskAvatarView commonMaskAvatarView = this._avatar;
        if (commonMaskAvatarView != null) {
            return commonMaskAvatarView;
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
    public final AnimEffectPlayer get_rank_svga() {
        AnimEffectPlayer animEffectPlayer = this._rank_svga;
        if (animEffectPlayer != null) {
            return animEffectPlayer;
        }
        Intrinsics.m87502r("_rank_svga");
        return null;
    }

    @NotNull
    public final VirtualFansBoardSecondOrThirdView get_root() {
        VirtualFansBoardSecondOrThirdView virtualFansBoardSecondOrThirdView = this._root;
        if (virtualFansBoardSecondOrThirdView != null) {
            return virtualFansBoardSecondOrThirdView;
        }
        Intrinsics.m87502r("_root");
        return null;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m76858i0(View view) {
        vpl0.m199279a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m76859j0() {
        this.mHourLeaderBoardItem = null;
        get_avatar().m72119i0();
        get_avatar().getRealAvatarView().getHierarchy().m112049D(i3c0.f110841R2);
        get_name().setText(ypv.f199497e.getString(R$string.f47361l6));
        get_heart().setText("");
        get_rank_svga().stepToFrame(0.0f, false);
        get_rank_svga().setAnimListener(null);
        xdl0.m208345M0(get_rank_svga(), false);
        xdl0.m208344M(get_heart(), false);
        xdl0.m208344M(get_crown(), true);
        xdl0.m208344M(get_living(), false);
        setOnClickListener(null);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m76860k0(int index) {
        xdl0.m208345M0(get_rank_svga(), true);
        get_rank_svga().clearDynamicData();
        get_rank_svga().m68504n();
        get_rank_svga().m68503m(index == 1 ? "https://auto.tancdn.com/v1/raw/69cadcb7-182a-4b98-870f-ba7525d5954d12.pdf" : "https://auto.tancdn.com/v1/raw/2dc517cd-df03-4c46-bfa2-0fa8c16604d413.pdf", 1, new C12949a(), false);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m76861m0(@NotNull final BLiveVoiceHourLeaderBoardItem item, @NotNull final kjn0 listener, int index) {
        item.getClass();
        listener.getClass();
        this.mHourLeaderBoardItem = item;
        get_avatar().getRealAvatarView().getHierarchy().m112049D(i3c0.f110841R2);
        qjn0.m175025f(get_avatar(), item, t100.m186890d(73.0f));
        xdl0.m208344M(get_crown(), !get_avatar().m72121k0());
        get_name().setText(item.user.name);
        xdl0.m208344M(get_living(), false);
        xdl0.m208344M(get_heart(), true);
        get_heart().setText(qjn0.m175023d(item.amount));
        setOnClickListener(new View.OnClickListener() { // from class: l.upl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VirtualFansBoardSecondOrThirdView.m76855h0(listener, item, view);
            }
        });
        m76856l0(index);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m76862n0(int index) {
        m76859j0();
        m76856l0(index);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76858i0(this);
        if (!ypv.m215672k().m195802b7()) {
            m76857r();
        }
        get_rank_svga().setAlpha(0.8f);
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

    public final void set_root(@NotNull VirtualFansBoardSecondOrThirdView virtualFansBoardSecondOrThirdView) {
        virtualFansBoardSecondOrThirdView.getClass();
        this._root = virtualFansBoardSecondOrThirdView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VirtualFansBoardSecondOrThirdView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VirtualFansBoardSecondOrThirdView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VirtualFansBoardSecondOrThirdView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
