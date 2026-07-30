package com.p000p1.mobile.putong.live.livingroom.intl.common.bottom.gamepanel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.C0200a;
import com.p000p1.mobile.putong.live.livingroom.intl.common.bottom.gamepanel.IntlGameBoardView;
import com.p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p1.mobile.putong.live.base.view.LoopViewPager;
import com.p1.mobile.putong.live.base.view.LoopViewPagerIndicator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.i7n;
import l.t100;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p002l.hgn;
import p002l.ihn;
import p002l.pgn;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0012\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0018\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\r2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\n0\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\fJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010$\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\u001eR\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010@\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010 \u001a\u0004\b>\u0010\"\"\u0004\b?\u0010\u001eR\"\u0010D\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010 \u001a\u0004\bB\u0010\"\"\u0004\bC\u0010\u001eR\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010T\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010\\\u001a\u00020U8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u0014\u0010`\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_¨\u0006a"}, d2 = {"Lcom/p1/mobile/putong/live/livingroom/intl/common/bottom/gamepanel/IntlGameBoardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "", "Ll/pgn;", "items", "Lcom/p1/mobile/putong/live/livingroom/archi/dialogcenter/a;", "dialog", "m0", "(Ljava/util/List;Lcom/p1/mobile/putong/live/livingroom/archi/dialogcenter/a;)V", "Ll/hgn;", "banners", "Lkotlin/Function1;", "onBannerClick", "k0", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "l0", "Landroid/view/View;", "view", "j0", "(Landroid/view/View;)V", "d", "Landroid/view/View;", "get_backView", "()Landroid/view/View;", "set_backView", "_backView", "Lcom/p1/mobile/putong/live/livingroom/intl/common/bottom/gamepanel/IntlGameBoardBannerView;", "e", "Lcom/p1/mobile/putong/live/livingroom/intl/common/bottom/gamepanel/IntlGameBoardBannerView;", "get_game_banner", "()Lcom/p1/mobile/putong/live/livingroom/intl/common/bottom/gamepanel/IntlGameBoardBannerView;", "set_game_banner", "(Lcom/p1/mobile/putong/live/livingroom/intl/common/bottom/gamepanel/IntlGameBoardBannerView;)V", "_game_banner", "Lcom/p1/mobile/putong/live/base/view/LoopViewPager;", "f", "Lcom/p1/mobile/putong/live/base/view/LoopViewPager;", "get_banner_page", "()Lcom/p1/mobile/putong/live/base/view/LoopViewPager;", "set_banner_page", "(Lcom/p1/mobile/putong/live/base/view/LoopViewPager;)V", "_banner_page", "Lcom/p1/mobile/putong/live/base/view/LoopViewPagerIndicator;", "g", "Lcom/p1/mobile/putong/live/base/view/LoopViewPagerIndicator;", "get_banner_indicator", "()Lcom/p1/mobile/putong/live/base/view/LoopViewPagerIndicator;", "set_banner_indicator", "(Lcom/p1/mobile/putong/live/base/view/LoopViewPagerIndicator;)V", "_banner_indicator", "h", "get_panel_bg", "set_panel_bg", "_panel_bg", "i", "get_guide_line", "set_guide_line", "_guide_line", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "j", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "get_svga", "()Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "set_svga", "(Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;)V", "_svga", "Lv/VRecyclerView;", "k", "Lv/VRecyclerView;", "get_gameList", "()Lv/VRecyclerView;", "set_gameList", "(Lv/VRecyclerView;)V", "_gameList", "Lv/VText;", "l", "Lv/VText;", "get_tvGameList", "()Lv/VText;", "set_tvGameList", "(Lv/VText;)V", "_tvGameList", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "m", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "adatper", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IntlGameBoardView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public View _backView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public IntlGameBoardBannerView _game_banner;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public LoopViewPager _banner_page;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public LoopViewPagerIndicator _banner_indicator;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public View _panel_bg;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public View _guide_line;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public AnimEffectPlayer _svga;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VRecyclerView _gameList;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VText _tvGameList;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final LiveBaseAdapter adatper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntlGameBoardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.adatper = new LiveBaseAdapter();
    }

    /* JADX INFO: renamed from: h0 */
    public static void m8855h0(IntlGameBoardView intlGameBoardView) {
        xdl0.C0(intlGameBoardView.get_svga(), intlGameBoardView.get_gameList().getHeight());
    }

    /* JADX INFO: renamed from: i0 */
    public static void m8856i0(C0200a c0200a, View view) {
        c0200a.dismiss();
    }

    @NotNull
    public final View get_backView() {
        View view = this._backView;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_backView");
        return null;
    }

    @NotNull
    public final LoopViewPagerIndicator get_banner_indicator() {
        LoopViewPagerIndicator loopViewPagerIndicator = this._banner_indicator;
        if (loopViewPagerIndicator != null) {
            return loopViewPagerIndicator;
        }
        Intrinsics.r("_banner_indicator");
        return null;
    }

    @NotNull
    public final LoopViewPager get_banner_page() {
        LoopViewPager loopViewPager = this._banner_page;
        if (loopViewPager != null) {
            return loopViewPager;
        }
        Intrinsics.r("_banner_page");
        return null;
    }

    @NotNull
    public final VRecyclerView get_gameList() {
        VRecyclerView vRecyclerView = this._gameList;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.r("_gameList");
        return null;
    }

    @NotNull
    public final IntlGameBoardBannerView get_game_banner() {
        IntlGameBoardBannerView intlGameBoardBannerView = this._game_banner;
        if (intlGameBoardBannerView != null) {
            return intlGameBoardBannerView;
        }
        Intrinsics.r("_game_banner");
        return null;
    }

    @NotNull
    public final View get_guide_line() {
        View view = this._guide_line;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_guide_line");
        return null;
    }

    @NotNull
    public final View get_panel_bg() {
        View view = this._panel_bg;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_panel_bg");
        return null;
    }

    @NotNull
    public final AnimEffectPlayer get_svga() {
        AnimEffectPlayer animEffectPlayer = this._svga;
        if (animEffectPlayer != null) {
            return animEffectPlayer;
        }
        Intrinsics.r("_svga");
        return null;
    }

    @NotNull
    public final VText get_tvGameList() {
        VText vText = this._tvGameList;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_tvGameList");
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m8857j0(View view) {
        ihn.m15151a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m8858k0(@NotNull List<? extends hgn> banners, @NotNull Function1<? super hgn, Unit> onBannerClick) {
        banners.getClass();
        onBannerClick.getClass();
        get_game_banner().m8848f(banners, onBannerClick);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m8859l0() {
        get_game_banner().m8852l();
        get_svga().o();
    }

    /* JADX INFO: renamed from: m0 */
    public final void m8860m0(@NotNull List<pgn> items, @NotNull final C0200a dialog) {
        items.getClass();
        dialog.getClass();
        if (items.size() > 12) {
            xdl0.C0(get_gameList(), t100.d(280.0f));
        } else {
            get_gameList().getLayoutParams().height = -2;
        }
        get_gameList().post(new Runnable() { // from class: l.ghn
            @Override // java.lang.Runnable
            public final void run() {
                IntlGameBoardView.m8855h0(this.f11446a);
            }
        });
        get_gameList().scrollToPosition(0);
        this.adatper.J().clear();
        this.adatper.Z(items);
        if (!i7n.b()) {
            get_svga().j("https://auto.tancdn.com/v1/raw/dd64c66a-551e-4a3e-8bde-1fac501b9a9411.pdf", -1);
        }
        xdl0.E0(get_backView(), new View.OnClickListener() { // from class: l.hhn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlGameBoardView.m8856i0(dialog, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8857j0(this);
        get_gameList().setAdapter(this.adatper);
        get_gameList().setLayoutManager(new GridLayoutManager(getContext(), 4));
    }

    public final void set_backView(@NotNull View view) {
        view.getClass();
        this._backView = view;
    }

    public final void set_banner_indicator(@NotNull LoopViewPagerIndicator loopViewPagerIndicator) {
        loopViewPagerIndicator.getClass();
        this._banner_indicator = loopViewPagerIndicator;
    }

    public final void set_banner_page(@NotNull LoopViewPager loopViewPager) {
        loopViewPager.getClass();
        this._banner_page = loopViewPager;
    }

    public final void set_gameList(@NotNull VRecyclerView vRecyclerView) {
        vRecyclerView.getClass();
        this._gameList = vRecyclerView;
    }

    public final void set_game_banner(@NotNull IntlGameBoardBannerView intlGameBoardBannerView) {
        intlGameBoardBannerView.getClass();
        this._game_banner = intlGameBoardBannerView;
    }

    public final void set_guide_line(@NotNull View view) {
        view.getClass();
        this._guide_line = view;
    }

    public final void set_panel_bg(@NotNull View view) {
        view.getClass();
        this._panel_bg = view;
    }

    public final void set_svga(@NotNull AnimEffectPlayer animEffectPlayer) {
        animEffectPlayer.getClass();
        this._svga = animEffectPlayer;
    }

    public final void set_tvGameList(@NotNull VText vText) {
        vText.getClass();
        this._tvGameList = vText;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntlGameBoardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntlGameBoardView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ IntlGameBoardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
