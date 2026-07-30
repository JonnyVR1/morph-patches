package com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.view.DialogTitleBar;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl.HourBoardDialogContentIntlView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bnl0;
import p153l.evl;
import p153l.qa00;
import p153l.qnp0;
import p153l.thl;
import p153l.uhl;
import p153l.yhl;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\r2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\rH\u0016¢\u0006\u0004\b&\u0010\u0011J\u000f\u0010'\u001a\u00020\rH\u0016¢\u0006\u0004\b'\u0010\u0011J\u000f\u0010(\u001a\u00020\rH\u0016¢\u0006\u0004\b(\u0010\u0011J\u0017\u0010+\u001a\u00020\r2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\rH\u0016¢\u0006\u0004\b-\u0010\u0011J\u000f\u0010.\u001a\u00020\u0007H\u0016¢\u0006\u0004\b.\u0010\u0019R\"\u00104\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u0010\u000fR\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010G\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u00100\u001a\u0004\bE\u00102\"\u0004\bF\u0010\u000fR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0018\u0010R\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010QR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010W\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010V¨\u0006X"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/intl/HourBoardDialogContentIntlView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Ll/evl;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "j0", "(Landroid/view/View;)V", "onFinishInflate", "()V", "g", "(Landroid/content/Context;)Landroid/view/View;", "Ll/uhl;", "actionListener", "K", "(Ll/uhl;)V", "getDialogViewHeight", "()I", "", "Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoardItem;", "allLeaderboards", BLiveStormDanmakuGiftResourceType.f45292l, "(Ljava/util/List;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoard;", "leaderBoard", "H", "(Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoard;)V", "hourLeaderBoard", "Y", "(Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoardItem;)V", "G", RXScreenCaptureService.KEY_INDEX, "onDestroy", "", "show", "I", "(Z)V", "b", "getContentHeight", Constants.INAPP_DATA_TAG, "Landroid/view/View;", "get_empty", "()Landroid/view/View;", "set_empty", "_empty", "Lcom/p1/mobile/putong/live/base/view/DialogTitleBar;", "e", "Lcom/p1/mobile/putong/live/base/view/DialogTitleBar;", "get_dialog_title_bar", "()Lcom/p1/mobile/putong/live/base/view/DialogTitleBar;", "set_dialog_title_bar", "(Lcom/p1/mobile/putong/live/base/view/DialogTitleBar;)V", "_dialog_title_bar", "Landroidx/recyclerview/widget/RecyclerView;", "f", "Landroidx/recyclerview/widget/RecyclerView;", "get_list", "()Landroidx/recyclerview/widget/RecyclerView;", "set_list", "(Landroidx/recyclerview/widget/RecyclerView;)V", "_list", "get_shadow", "set_shadow", "_shadow", "Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/intl/HourBoardListItem;", "h", "Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/intl/HourBoardListItem;", "get_own", "()Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/intl/HourBoardListItem;", "set_own", "(Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/intl/HourBoardListItem;)V", "_own", "Ll/thl;", "Ll/thl;", "boardAdapter", "j", "Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoard;", "k", "Ll/uhl;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class HourBoardDialogContentIntlView extends ConstraintLayout implements evl {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public View _empty;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public DialogTitleBar _dialog_title_bar;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public RecyclerView _list;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public View _shadow;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public HourBoardListItem _own;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public thl boardAdapter;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public BLiveHourLeaderBoard leaderBoard;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public uhl listener;

    public /* synthetic */ HourBoardDialogContentIntlView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m75930h0(HourBoardDialogContentIntlView hourBoardDialogContentIntlView, View view) {
        uhl uhlVar;
        BLiveHourLeaderBoard bLiveHourLeaderBoard = hourBoardDialogContentIntlView.leaderBoard;
        if (bLiveHourLeaderBoard == null || (uhlVar = hourBoardDialogContentIntlView.listener) == null) {
            return;
        }
        String str = bLiveHourLeaderBoard.helperPageUrl;
        str.getClass();
        uhlVar.mo76106E(str, false);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m75931i0(HourBoardDialogContentIntlView hourBoardDialogContentIntlView, View view) {
        uhl uhlVar = hourBoardDialogContentIntlView.listener;
        if (uhlVar != null) {
            uhlVar.mo76108G();
        }
    }

    @Override // p153l.evl
    /* JADX INFO: renamed from: G */
    public void mo75932G() {
        get_own().m75958y0();
    }

    @Override // p153l.evl
    /* JADX INFO: renamed from: H */
    public void mo75933H(@NotNull BLiveHourLeaderBoard leaderBoard) {
        leaderBoard.getClass();
        this.leaderBoard = leaderBoard;
        thl thlVar = this.boardAdapter;
        if (thlVar != null) {
            thlVar.m191275O(leaderBoard);
        }
    }

    @Override // p153l.evl
    /* JADX INFO: renamed from: I */
    public void mo75934I(boolean show) {
        thl thlVar = this.boardAdapter;
        if (thlVar != null) {
            thlVar.m191274N(show);
        }
    }

    @Override // p153l.evl
    /* JADX INFO: renamed from: K */
    public void mo75935K(@NotNull uhl actionListener) {
        actionListener.getClass();
        this.listener = actionListener;
        get_empty().setOnClickListener(new View.OnClickListener() { // from class: l.whl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HourBoardDialogContentIntlView.m75931i0(this.f189170a, view);
            }
        });
        get_dialog_title_bar().m69896d(R$string.f47835U, true);
        get_dialog_title_bar().setFAQListener(new View.OnClickListener() { // from class: l.xhl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HourBoardDialogContentIntlView.m75930h0(this.f194372a, view);
            }
        });
        get_dialog_title_bar().setRightView(2);
        DialogTitleBar dialogTitleBar = get_dialog_title_bar();
        int i = qa00.f156330q;
        qnp0.m177260c1(dialogTitleBar, 0, 0, 0, -i, i);
        this.boardAdapter = new thl(this.listener);
        get_list().setLayoutManager(new LinearLayoutManager(getContext()));
        get_list().setAdapter(this.boardAdapter);
    }

    @Override // p153l.evl
    /* JADX INFO: renamed from: Y */
    public void mo75936Y(@NotNull BLiveHourLeaderBoardItem hourLeaderBoard) {
        hourLeaderBoard.getClass();
        hourLeaderBoard.isOwn = true;
        get_own().m75957u0(hourLeaderBoard, null, this.leaderBoard);
    }

    @Override // p153l.evl
    /* JADX INFO: renamed from: b */
    public void mo75937b() {
    }

    @Override // p153l.evl
    @NotNull
    /* JADX INFO: renamed from: g */
    public View mo75938g(@NotNull Context context) {
        context.getClass();
        return this;
    }

    @Override // p153l.evl
    public int getContentHeight() {
        return bnl0.m105588w0() - get_empty().getHeight();
    }

    @Override // p153l.evl
    public int getDialogViewHeight() {
        return bnl0.m105588w0() - qa00.m175859d(145.0f);
    }

    @NotNull
    public final DialogTitleBar get_dialog_title_bar() {
        DialogTitleBar dialogTitleBar = this._dialog_title_bar;
        if (dialogTitleBar != null) {
            return dialogTitleBar;
        }
        Intrinsics.m88391r("_dialog_title_bar");
        return null;
    }

    @NotNull
    public final View get_empty() {
        View view = this._empty;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_empty");
        return null;
    }

    @NotNull
    public final RecyclerView get_list() {
        RecyclerView recyclerView = this._list;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.m88391r("_list");
        return null;
    }

    @NotNull
    public final HourBoardListItem get_own() {
        HourBoardListItem hourBoardListItem = this._own;
        if (hourBoardListItem != null) {
            return hourBoardListItem;
        }
        Intrinsics.m88391r("_own");
        return null;
    }

    @NotNull
    public final View get_shadow() {
        View view = this._shadow;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_shadow");
        return null;
    }

    @Override // p153l.evl
    /* JADX INFO: renamed from: i */
    public void mo75939i() {
        get_list().scrollToPosition(0);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m75940j0(View view) {
        yhl.m215972a(this, view);
    }

    @Override // p153l.evl
    /* JADX INFO: renamed from: l */
    public void mo75941l(@NotNull List<? extends BLiveHourLeaderBoardItem> allLeaderboards) {
        thl thlVar;
        allLeaderboards.getClass();
        if (allLeaderboards.isEmpty() || (thlVar = this.boardAdapter) == null) {
            return;
        }
        thlVar.m191276P(allLeaderboards);
    }

    @Override // p153l.evl
    public void onDestroy() {
        thl thlVar = this.boardAdapter;
        if (thlVar != null) {
            thlVar.m191273M();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75940j0(this);
    }

    public final void set_dialog_title_bar(@NotNull DialogTitleBar dialogTitleBar) {
        dialogTitleBar.getClass();
        this._dialog_title_bar = dialogTitleBar;
    }

    public final void set_empty(@NotNull View view) {
        view.getClass();
        this._empty = view;
    }

    public final void set_list(@NotNull RecyclerView recyclerView) {
        recyclerView.getClass();
        this._list = recyclerView;
    }

    public final void set_own(@NotNull HourBoardListItem hourBoardListItem) {
        hourBoardListItem.getClass();
        this._own = hourBoardListItem;
    }

    public final void set_shadow(@NotNull View view) {
        view.getClass();
        this._shadow = view;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HourBoardDialogContentIntlView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HourBoardDialogContentIntlView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HourBoardDialogContentIntlView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
