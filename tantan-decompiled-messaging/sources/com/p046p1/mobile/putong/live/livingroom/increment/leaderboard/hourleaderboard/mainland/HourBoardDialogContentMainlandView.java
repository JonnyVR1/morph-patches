package com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.base.view.DialogTitleBar;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardDialogContentMainlandView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p147v.VImage;
import p149l.ap0;
import p149l.dfl;
import p149l.g5c0;
import p149l.h1c0;
import p149l.hxs;
import p149l.kfl;
import p149l.kvc0;
import p149l.ogl;
import p149l.rsl;
import p149l.t100;
import p149l.xdl0;
import p149l.ydt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\r2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\r2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\rH\u0016¢\u0006\u0004\b'\u0010\u0011J\u000f\u0010(\u001a\u00020\rH\u0016¢\u0006\u0004\b(\u0010\u0011J\u000f\u0010)\u001a\u00020\rH\u0016¢\u0006\u0004\b)\u0010\u0011J\u0017\u0010,\u001a\u00020\r2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\rH\u0016¢\u0006\u0004\b.\u0010\u0011J\u000f\u0010/\u001a\u00020\u0007H\u0016¢\u0006\u0004\b/\u0010\u001aR\"\u00105\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u0010\u000fR\"\u00109\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00101\u001a\u0004\b7\u00103\"\u0004\b8\u0010\u000fR\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010H\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010W\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010[\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u00101\u001a\u0004\bY\u00103\"\u0004\bZ\u0010\u000fR\"\u0010c\u001a\u00020\\8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010j\u001a\u00020d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\"\u0010r\u001a\u00020k8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u0018\u0010v\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0018\u0010{\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0018\u0010\u007f\u001a\u0004\u0018\u00010|8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~¨\u0006\u0080\u0001"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardDialogContentMainlandView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Ll/rsl;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "j0", "(Landroid/view/View;)V", "m0", "()V", "onFinishInflate", "g", "(Landroid/content/Context;)Landroid/view/View;", "Ll/dfl;", "actionListener", "K", "(Ll/dfl;)V", "getDialogViewHeight", "()I", "", "Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoardItem;", "allLeaderboards", BLiveStormDanmakuGiftResourceType.f44444l, "(Ljava/util/List;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoard;", "leaderBoard", "H", "(Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoard;)V", "hourLeaderBoard", "Y", "(Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoardItem;)V", "G", RXScreenCaptureService.KEY_INDEX, "onDestroy", "", "show", "I", "(Z)V", "b", "getContentHeight", Constants.INAPP_DATA_TAG, "Landroid/view/View;", "get_empty", "()Landroid/view/View;", "set_empty", "_empty", "e", "get_bg", "set_bg", "_bg", "Lv/VDraweeView;", "f", "Lv/VDraweeView;", "get_bottom_bg", "()Lv/VDraweeView;", "set_bottom_bg", "(Lv/VDraweeView;)V", "_bottom_bg", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "get_bg_svga", "()Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "set_bg_svga", "(Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;)V", "_bg_svga", "Lv/VImage;", "h", "Lv/VImage;", "get_top_bg", "()Lv/VImage;", "set_top_bg", "(Lv/VImage;)V", "_top_bg", "Lcom/p1/mobile/putong/live/base/view/DialogTitleBar;", "Lcom/p1/mobile/putong/live/base/view/DialogTitleBar;", "get_title_bar", "()Lcom/p1/mobile/putong/live/base/view/DialogTitleBar;", "set_title_bar", "(Lcom/p1/mobile/putong/live/base/view/DialogTitleBar;)V", "_title_bar", "j", "get_top_divider", "set_top_divider", "_top_divider", "Landroidx/recyclerview/widget/RecyclerView;", "k", "Landroidx/recyclerview/widget/RecyclerView;", "get_recyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "set_recyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "_recyclerView", "Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardEmptyView;", "Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardEmptyView;", "get_empty_view", "()Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardEmptyView;", "set_empty_view", "(Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardEmptyView;)V", "_empty_view", "Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardMainlandMeItemView;", "m", "Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardMainlandMeItemView;", "get_own", "()Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardMainlandMeItemView;", "set_own", "(Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardMainlandMeItemView;)V", "_own", "Ll/ogl;", "n", "Ll/ogl;", "boardAdapter", "o", "Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoard;", "p", "Ll/dfl;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/animation/Animator;", "q", "Landroid/animation/Animator;", "bgAnim", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class HourBoardDialogContentMainlandView extends ConstraintLayout implements rsl {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public View _empty;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public View _bg;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VDraweeView _bottom_bg;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public AnimEffectPlayer _bg_svga;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VImage _top_bg;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public DialogTitleBar _title_bar;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public View _top_divider;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public RecyclerView _recyclerView;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public HourBoardEmptyView _empty_view;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public HourBoardMainlandMeItemView _own;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public ogl boardAdapter;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public BLiveHourLeaderBoard leaderBoard;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public dfl listener;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public Animator bgAnim;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardDialogContentMainlandView$a */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"com/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardDialogContentMainlandView$a", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationStart", "(Landroid/animation/Animator;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C12851a extends AnimatorListenerAdapter {
        public C12851a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            animation.getClass();
            xdl0.m208345M0(HourBoardDialogContentMainlandView.this.get_bg_svga(), true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardDialogContentMainlandView$b */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"com/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardDialogContentMainlandView$b", "Ll/ap0;", "", "g", "()V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C12852b extends ap0 {
        public C12852b() {
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: g */
        public void mo69603g() {
            super.mo69603g();
            BLiveHourLeaderBoard bLiveHourLeaderBoard = HourBoardDialogContentMainlandView.this.leaderBoard;
            if (bLiveHourLeaderBoard != null) {
                HourBoardDialogContentMainlandView hourBoardDialogContentMainlandView = HourBoardDialogContentMainlandView.this;
                if (bLiveHourLeaderBoard.isHeaderBgAnimFinish) {
                    return;
                }
                Animator animator = hourBoardDialogContentMainlandView.bgAnim;
                if (animator != null) {
                    animator.start();
                }
                bLiveHourLeaderBoard.isHeaderBgAnimFinish = true;
            }
        }
    }

    public /* synthetic */ HourBoardDialogContentMainlandView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m74810h0(HourBoardDialogContentMainlandView hourBoardDialogContentMainlandView, View view) {
        dfl dflVar = hourBoardDialogContentMainlandView.listener;
        if (dflVar != null) {
            dflVar.mo74925G();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static void m74811i0(HourBoardDialogContentMainlandView hourBoardDialogContentMainlandView, View view) {
        dfl dflVar;
        BLiveHourLeaderBoard bLiveHourLeaderBoard = hourBoardDialogContentMainlandView.leaderBoard;
        if (bLiveHourLeaderBoard == null || (dflVar = hourBoardDialogContentMainlandView.listener) == null) {
            return;
        }
        String str = bLiveHourLeaderBoard.helperPageUrl;
        str.getClass();
        dflVar.mo74923E(str, true);
    }

    /* JADX INFO: renamed from: m0 */
    private final void m74814m0() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(get_bg_svga(), (Property<AnimEffectPlayer, Float>) View.TRANSLATION_X, -t100.m186890d(100.0f), 0.0f);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        objectAnimatorOfFloat.setDuration(1500L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(get_bg_svga(), (Property<AnimEffectPlayer, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator());
        objectAnimatorOfFloat2.setDuration(1500L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.addListener(new C12851a());
        this.bgAnim = animatorSet;
    }

    @Override // p149l.rsl
    /* JADX INFO: renamed from: G */
    public void mo74749G() {
        get_own().reset();
        HourBoardHeaderView hourBoardHeaderView = (HourBoardHeaderView) get_recyclerView().findViewWithTag(Integer.valueOf(g5c0.f100651B3));
        if (hourBoardHeaderView != null) {
            hourBoardHeaderView.m74838G();
        }
    }

    @Override // p149l.rsl
    /* JADX INFO: renamed from: H */
    public void mo74750H(@NotNull BLiveHourLeaderBoard leaderBoard) {
        leaderBoard.getClass();
        this.leaderBoard = leaderBoard;
        ogl oglVar = this.boardAdapter;
        if (oglVar != null) {
            oglVar.m164220T(leaderBoard);
        }
    }

    @Override // p149l.rsl
    /* JADX INFO: renamed from: I */
    public void mo74751I(boolean show) {
        ogl oglVar = this.boardAdapter;
        if (oglVar != null) {
            oglVar.m164219S(show);
        }
    }

    @Override // p149l.rsl
    /* JADX INFO: renamed from: K */
    public void mo74752K(@NotNull dfl actionListener) {
        actionListener.getClass();
        this.listener = actionListener;
        xdl0.m208329E0(get_empty(), new View.OnClickListener() { // from class: l.ifl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HourBoardDialogContentMainlandView.m74810h0(this.f113035a, view);
            }
        });
        xdl0.m208344M(get_title_bar(), true);
        get_title_bar().setFAQListener(new View.OnClickListener() { // from class: l.jfl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HourBoardDialogContentMainlandView.m74811i0(this.f117674a, view);
            }
        });
        get_title_bar().m68715f(kvc0.m147355d(R$string.f46987U), h1c0.f105395p1);
        get_title_bar().setRightView(3);
        this.boardAdapter = new ogl(this.listener);
        get_recyclerView().setLayoutManager(new LinearLayoutManager(getContext()));
        get_recyclerView().setAdapter(this.boardAdapter);
        m74814m0();
    }

    @Override // p149l.rsl
    /* JADX INFO: renamed from: Y */
    public void mo74753Y(@NotNull BLiveHourLeaderBoardItem hourLeaderBoard) {
        hourLeaderBoard.getClass();
        hourLeaderBoard.isOwn = true;
        get_own().setOnClickListener(null);
        get_own().m74869M(hourLeaderBoard, this.leaderBoard);
    }

    @Override // p149l.rsl
    /* JADX INFO: renamed from: b */
    public void mo74754b() {
        ogl oglVar = this.boardAdapter;
        if (oglVar != null) {
            oglVar.m164215I();
        }
        this.leaderBoard = null;
        Animator animator = this.bgAnim;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.bgAnim;
        if (animator2 != null) {
            animator2.end();
        }
        get_bg_svga().m68505o();
        xdl0.m208345M0(get_bg_svga(), false);
    }

    @Override // p149l.rsl
    @NotNull
    /* JADX INFO: renamed from: g */
    public View mo74755g(@NotNull Context context) {
        context.getClass();
        return this;
    }

    @Override // p149l.rsl
    public int getContentHeight() {
        return (xdl0.m208410x0(getContext()) - get_empty().getHeight()) - t100.m186890d(2.0f);
    }

    @Override // p149l.rsl
    public int getDialogViewHeight() {
        return xdl0.m208408w0() - t100.m186890d(145.0f);
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
    public final AnimEffectPlayer get_bg_svga() {
        AnimEffectPlayer animEffectPlayer = this._bg_svga;
        if (animEffectPlayer != null) {
            return animEffectPlayer;
        }
        Intrinsics.m87502r("_bg_svga");
        return null;
    }

    @NotNull
    public final VDraweeView get_bottom_bg() {
        VDraweeView vDraweeView = this._bottom_bg;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_bottom_bg");
        return null;
    }

    @NotNull
    public final View get_empty() {
        View view = this._empty;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_empty");
        return null;
    }

    @NotNull
    public final HourBoardEmptyView get_empty_view() {
        HourBoardEmptyView hourBoardEmptyView = this._empty_view;
        if (hourBoardEmptyView != null) {
            return hourBoardEmptyView;
        }
        Intrinsics.m87502r("_empty_view");
        return null;
    }

    @NotNull
    public final HourBoardMainlandMeItemView get_own() {
        HourBoardMainlandMeItemView hourBoardMainlandMeItemView = this._own;
        if (hourBoardMainlandMeItemView != null) {
            return hourBoardMainlandMeItemView;
        }
        Intrinsics.m87502r("_own");
        return null;
    }

    @NotNull
    public final RecyclerView get_recyclerView() {
        RecyclerView recyclerView = this._recyclerView;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.m87502r("_recyclerView");
        return null;
    }

    @NotNull
    public final DialogTitleBar get_title_bar() {
        DialogTitleBar dialogTitleBar = this._title_bar;
        if (dialogTitleBar != null) {
            return dialogTitleBar;
        }
        Intrinsics.m87502r("_title_bar");
        return null;
    }

    @NotNull
    public final VImage get_top_bg() {
        VImage vImage = this._top_bg;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_top_bg");
        return null;
    }

    @NotNull
    public final View get_top_divider() {
        View view = this._top_divider;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_top_divider");
        return null;
    }

    @Override // p149l.rsl
    /* JADX INFO: renamed from: i */
    public void mo74756i() {
        get_recyclerView().scrollToPosition(0);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m74815j0(View view) {
        kfl.m145858a(this, view);
    }

    @Override // p149l.rsl
    /* JADX INFO: renamed from: l */
    public void mo74758l(@NotNull List<? extends BLiveHourLeaderBoardItem> allLeaderboards) {
        allLeaderboards.getClass();
        xdl0.m208344M(get_empty_view(), allLeaderboards.isEmpty());
        xdl0.m208344M(get_recyclerView(), true);
        ogl oglVar = this.boardAdapter;
        if (oglVar != null) {
            oglVar.m164221U(allLeaderboards);
        }
        get_bg_svga().m68505o();
        get_bg_svga().mo68502l("https://auto.tancdn.com/v1/raw/f9f9b9db-0e97-4823-8f39-547baf3e7f4f12.pdf", -1, new C12852b());
    }

    @Override // p149l.rsl
    public void onDestroy() {
        ogl oglVar = this.boardAdapter;
        if (oglVar != null) {
            oglVar.m164218R();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74815j0(this);
        xdl0.m208325C0(get_empty(), (int) (xdl0.m208408w0() * 0.22413793f));
        xdl0.m208360X(get_empty_view(), (int) (xdl0.m208408w0() * 0.3140394f));
        hxs.m133408u("context_livingAct", get_bottom_bg(), ydt.f197605H, xdl0.m208412y0(), t100.m186890d(207.0f));
    }

    public final void set_bg(@NotNull View view) {
        view.getClass();
        this._bg = view;
    }

    public final void set_bg_svga(@NotNull AnimEffectPlayer animEffectPlayer) {
        animEffectPlayer.getClass();
        this._bg_svga = animEffectPlayer;
    }

    public final void set_bottom_bg(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._bottom_bg = vDraweeView;
    }

    public final void set_empty(@NotNull View view) {
        view.getClass();
        this._empty = view;
    }

    public final void set_empty_view(@NotNull HourBoardEmptyView hourBoardEmptyView) {
        hourBoardEmptyView.getClass();
        this._empty_view = hourBoardEmptyView;
    }

    public final void set_own(@NotNull HourBoardMainlandMeItemView hourBoardMainlandMeItemView) {
        hourBoardMainlandMeItemView.getClass();
        this._own = hourBoardMainlandMeItemView;
    }

    public final void set_recyclerView(@NotNull RecyclerView recyclerView) {
        recyclerView.getClass();
        this._recyclerView = recyclerView;
    }

    public final void set_title_bar(@NotNull DialogTitleBar dialogTitleBar) {
        dialogTitleBar.getClass();
        this._title_bar = dialogTitleBar;
    }

    public final void set_top_bg(@NotNull VImage vImage) {
        vImage.getClass();
        this._top_bg = vImage;
    }

    public final void set_top_divider(@NotNull View view) {
        view.getClass();
        this._top_divider = view;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HourBoardDialogContentMainlandView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HourBoardDialogContentMainlandView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HourBoardDialogContentMainlandView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
