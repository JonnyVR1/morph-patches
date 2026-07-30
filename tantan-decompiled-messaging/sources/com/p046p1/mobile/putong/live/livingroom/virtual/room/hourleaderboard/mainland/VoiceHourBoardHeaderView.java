package com.p046p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceHourLeaderBoardItem;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveVoiceLeaderBoardPageHeaderBindings;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.VoiceHourBoardHeaderView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.bt0;
import p149l.g5c0;
import p149l.har;
import p149l.kjn0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u0000 72\u00020\u0001:\u00018B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0011\u0010\u000eJ=\u0010\u001b\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ5\u0010\u001e\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b\"\u0010#R\u001b\u0010(\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010+\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010'R\u001b\u0010.\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b-\u0010'R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00103\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00106\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00069"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/room/hourleaderboard/mainland/VoiceHourBoardHeaderView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVoiceLeaderBoardPageHeaderBindings;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "getSecondSvgaUrl", "()Ljava/lang/String;", "getThirdSvgaUrl", "", "q0", "()V", "t0", "p0", "onFinishInflate", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceHourLeaderBoardItem;", "list", "Ll/kjn0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, AuthenticationTokenClaims.JSON_KEY_NAME, "", "showRoomTile", "showMvp", "s0", "(Ljava/util/List;Ll/kjn0;Ljava/lang/String;ZZ)V", "isGroupOrHourBoard", "r0", "(Ljava/util/List;Ljava/lang/String;ZZ)V", "Landroid/animation/Animator;", "anim", "o0", "(Landroid/animation/Animator;)V", "h", "Lkotlin/Lazy;", "getFirstShowAnim", "()Landroid/animation/Animator;", "firstShowAnim", RXScreenCaptureService.KEY_INDEX, "getSecondShowAnim", "secondShowAnim", "j", "getThirdShowAnim", "thirdShowAnim", "k", "Ll/kjn0;", BLiveStormDanmakuGiftResourceType.f44444l, "Z", "canPlaySvga", "m", "Ljava/lang/String;", "boardName", "Companion", "a", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class VoiceHourBoardHeaderView extends LiveVoiceLeaderBoardPageHeaderBindings {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Lazy firstShowAnim;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy secondShowAnim;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Lazy thirdShowAnim;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public kjn0 listener;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public boolean canPlaySvga;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public String boardName;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.VoiceHourBoardHeaderView$b */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"com/p1/mobile/putong/live/livingroom/virtual/room/hourleaderboard/mainland/VoiceHourBoardHeaderView$b", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationStart", "(Landroid/animation/Animator;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C12980b extends AnimatorListenerAdapter {
        public C12980b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            animation.getClass();
            VoiceHourBoardHeaderView.this.f48382g.setAlpha(0.0f);
            xdl0.m208345M0(VoiceHourBoardHeaderView.this.f48382g, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.VoiceHourBoardHeaderView$c */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m87232d2 = {"com/p1/mobile/putong/live/livingroom/virtual/room/hourleaderboard/mainland/VoiceHourBoardHeaderView$c", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationEnd", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C12981c extends AnimatorListenerAdapter {
        public C12981c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            if (VoiceHourBoardHeaderView.this.canPlaySvga) {
                VoiceHourBoardHeaderView voiceHourBoardHeaderView = VoiceHourBoardHeaderView.this;
                voiceHourBoardHeaderView.f48380e.m77439k0(voiceHourBoardHeaderView.getSecondSvgaUrl());
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            animation.getClass();
            VoiceHourBoardHeaderView.this.f48380e.setAlpha(0.0f);
            xdl0.m208345M0(VoiceHourBoardHeaderView.this.f48380e, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.VoiceHourBoardHeaderView$d */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m87232d2 = {"com/p1/mobile/putong/live/livingroom/virtual/room/hourleaderboard/mainland/VoiceHourBoardHeaderView$d", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationEnd", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C12982d extends AnimatorListenerAdapter {
        public C12982d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            if (VoiceHourBoardHeaderView.this.canPlaySvga) {
                VoiceHourBoardHeaderView voiceHourBoardHeaderView = VoiceHourBoardHeaderView.this;
                voiceHourBoardHeaderView.f48381f.m77439k0(voiceHourBoardHeaderView.getThirdSvgaUrl());
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            animation.getClass();
            VoiceHourBoardHeaderView.this.f48381f.setAlpha(0.0f);
            xdl0.m208345M0(VoiceHourBoardHeaderView.this.f48381f, true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceHourBoardHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.firstShowAnim = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.tcn0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VoiceHourBoardHeaderView.m77423j0(this.f169466a);
            }
        });
        this.secondShowAnim = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.ucn0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VoiceHourBoardHeaderView.m77422i0(this.f175838a);
            }
        });
        this.thirdShowAnim = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.vcn0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VoiceHourBoardHeaderView.m77424k0(this.f180968a);
            }
        });
        this.boardName = "";
    }

    private final Animator getFirstShowAnim() {
        return (Animator) this.firstShowAnim.getValue();
    }

    private final Animator getSecondShowAnim() {
        return (Animator) this.secondShowAnim.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getSecondSvgaUrl() {
        if (har.f106811a.equals(this.boardName)) {
            return "https://fe-static.tancdn.com/v1/raw/5b6bab67-57d0-4cce-823c-7e40adf5847a13.svga";
        }
        return har.f106812b.equals(this.boardName) ? "https://fe-static.tancdn.com/v1/raw/26024cd2-ad50-4d5b-8316-34ec5f15188d12.svga" : "https://auto.tancdn.com/v1/raw/69cadcb7-182a-4b98-870f-ba7525d5954d12.pdf";
    }

    private final Animator getThirdShowAnim() {
        return (Animator) this.thirdShowAnim.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getThirdSvgaUrl() {
        if (har.f106811a.equals(this.boardName)) {
            return "https://fe-static.tancdn.com/v1/raw/d3b4e8e1-e455-4005-867b-f9d9908d916e12.svga";
        }
        return har.f106812b.equals(this.boardName) ? "https://fe-static.tancdn.com/v1/raw/95354606-5d83-46d9-b9e8-29988acab47012.svga" : "https://auto.tancdn.com/v1/raw/2dc517cd-df03-4c46-bfa2-0fa8c16604d413.pdf";
    }

    /* JADX INFO: renamed from: i0 */
    public static AnimatorSet m77422i0(VoiceHourBoardHeaderView voiceHourBoardHeaderView) {
        Animator animatorM103737j = bt0.m103737j(500);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(voiceHourBoardHeaderView.f48380e, (Property<VoiceHourBoardSecondOrThirdView, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(voiceHourBoardHeaderView.f48380e, (Property<VoiceHourBoardSecondOrThirdView, Float>) View.TRANSLATION_X, t100.f167260i, 0.0f);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).after(animatorM103737j);
        animatorSet.addListener(voiceHourBoardHeaderView.new C12981c());
        return animatorSet;
    }

    /* JADX INFO: renamed from: j0 */
    public static AnimatorSet m77423j0(VoiceHourBoardHeaderView voiceHourBoardHeaderView) {
        Animator animatorM103737j = bt0.m103737j(200);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(voiceHourBoardHeaderView.f48382g, (Property<VoiceHourBoardFirstView, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.play(objectAnimatorOfFloat).after(animatorM103737j);
        animatorSet.addListener(voiceHourBoardHeaderView.new C12980b());
        return animatorSet;
    }

    /* JADX INFO: renamed from: k0 */
    public static AnimatorSet m77424k0(VoiceHourBoardHeaderView voiceHourBoardHeaderView) {
        Animator animatorM103737j = bt0.m103737j(500);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(voiceHourBoardHeaderView.f48381f, (Property<VoiceHourBoardSecondOrThirdView, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(voiceHourBoardHeaderView.f48381f, (Property<VoiceHourBoardSecondOrThirdView, Float>) View.TRANSLATION_X, -t100.f167260i, 0.0f);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).after(animatorM103737j);
        animatorSet.addListener(voiceHourBoardHeaderView.new C12982d());
        return animatorSet;
    }

    /* JADX INFO: renamed from: p0 */
    private final void m77428p0() {
        if (getFirstShowAnim().isRunning()) {
            m77431o0(getFirstShowAnim());
        }
        if (getSecondShowAnim().isRunning()) {
            m77431o0(getSecondShowAnim());
        }
        if (getThirdShowAnim().isRunning()) {
            m77431o0(getThirdShowAnim());
        }
    }

    /* JADX INFO: renamed from: q0 */
    private final void m77429q0() {
        this.f48382g.setAlpha(0.0f);
        this.f48380e.setAlpha(0.0f);
        this.f48381f.setAlpha(0.0f);
    }

    /* JADX INFO: renamed from: t0 */
    private final void m77430t0() {
        this.canPlaySvga = true;
        m77428p0();
        getFirstShowAnim().start();
        getSecondShowAnim().start();
        getThirdShowAnim().start();
    }

    /* JADX INFO: renamed from: o0 */
    public final void m77431o0(Animator anim) {
        if (anim != null) {
            anim.end();
        }
        if (anim != null) {
            anim.cancel();
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.binding.LiveVoiceLeaderBoardPageHeaderBindings, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77429q0();
        setTag(Integer.valueOf(g5c0.f100651B3));
    }

    /* JADX INFO: renamed from: r0 */
    public final void m77432r0(List<? extends BLiveVoiceHourLeaderBoardItem> list, String name, boolean isGroupOrHourBoard, boolean showMvp) {
        kjn0 kjn0Var;
        kjn0 kjn0Var2;
        if (list.isEmpty()) {
            this.f48382g.m77421m0(name);
            this.f48380e.m77442n0(1);
            this.f48381f.m77442n0(2);
            return;
        }
        if (list.size() == 2) {
            this.f48381f.m77442n0(2);
        } else if (list.size() == 1) {
            this.f48380e.m77442n0(1);
            this.f48381f.m77442n0(2);
        }
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            BLiveVoiceHourLeaderBoardItem bLiveVoiceHourLeaderBoardItem = (BLiveVoiceHourLeaderBoardItem) obj;
            if (i == 0) {
                VoiceHourBoardFirstView voiceHourBoardFirstView = this.f48382g;
                kjn0 kjn0Var3 = this.listener;
                if (kjn0Var3 == null) {
                    Intrinsics.m87502r(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                    kjn0Var3 = null;
                }
                voiceHourBoardFirstView.m77420l0(bLiveVoiceHourLeaderBoardItem, kjn0Var3, name, isGroupOrHourBoard, showMvp);
            } else if (i == 1) {
                VoiceHourBoardSecondOrThirdView voiceHourBoardSecondOrThirdView = this.f48380e;
                kjn0 kjn0Var4 = this.listener;
                if (kjn0Var4 == null) {
                    Intrinsics.m87502r(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                    kjn0Var = null;
                } else {
                    kjn0Var = kjn0Var4;
                }
                voiceHourBoardSecondOrThirdView.m77441m0(bLiveVoiceHourLeaderBoardItem, i, kjn0Var, name, isGroupOrHourBoard, showMvp);
            } else if (i == 2) {
                VoiceHourBoardSecondOrThirdView voiceHourBoardSecondOrThirdView2 = this.f48381f;
                kjn0 kjn0Var5 = this.listener;
                if (kjn0Var5 == null) {
                    Intrinsics.m87502r(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                    kjn0Var2 = null;
                } else {
                    kjn0Var2 = kjn0Var5;
                }
                voiceHourBoardSecondOrThirdView2.m77441m0(bLiveVoiceHourLeaderBoardItem, i, kjn0Var2, name, isGroupOrHourBoard, showMvp);
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m77433s0(@NotNull List<? extends BLiveVoiceHourLeaderBoardItem> list, @NotNull kjn0 listener, @NotNull String name, boolean showRoomTile, boolean showMvp) {
        list.getClass();
        listener.getClass();
        name.getClass();
        this.listener = listener;
        this.boardName = name;
        m77432r0(list, name, showRoomTile, showMvp);
        m77430t0();
    }

    public /* synthetic */ VoiceHourBoardHeaderView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
