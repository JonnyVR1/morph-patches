package com.p051p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland;

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
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceHourLeaderBoardItem;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveVoiceLeaderBoardPageHeaderBindings;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.VoiceHourBoardHeaderView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p153l.bnl0;
import p153l.gt0;
import p153l.jcr;
import p153l.mdc0;
import p153l.osn0;
import p153l.qa00;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u0000 72\u00020\u0001:\u00018B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0011\u0010\u000eJ=\u0010\u001b\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ5\u0010\u001e\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b\"\u0010#R\u001b\u0010(\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010+\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010'R\u001b\u0010.\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b-\u0010'R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00103\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00106\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00069"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/room/hourleaderboard/mainland/VoiceHourBoardHeaderView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVoiceLeaderBoardPageHeaderBindings;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "getSecondSvgaUrl", "()Ljava/lang/String;", "getThirdSvgaUrl", "", "q0", "()V", "t0", "p0", "onFinishInflate", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceHourLeaderBoardItem;", "list", "Ll/osn0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, AuthenticationTokenClaims.JSON_KEY_NAME, "", "showRoomTile", "showMvp", "s0", "(Ljava/util/List;Ll/osn0;Ljava/lang/String;ZZ)V", "isGroupOrHourBoard", "r0", "(Ljava/util/List;Ljava/lang/String;ZZ)V", "Landroid/animation/Animator;", "anim", "o0", "(Landroid/animation/Animator;)V", "h", "Lkotlin/Lazy;", "getFirstShowAnim", "()Landroid/animation/Animator;", "firstShowAnim", RXScreenCaptureService.KEY_INDEX, "getSecondShowAnim", "secondShowAnim", "j", "getThirdShowAnim", "thirdShowAnim", "k", "Ll/osn0;", BLiveStormDanmakuGiftResourceType.f45292l, "Z", "canPlaySvga", "m", "Ljava/lang/String;", "boardName", "Companion", "a", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
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
    public osn0 listener;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public boolean canPlaySvga;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public String boardName;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.VoiceHourBoardHeaderView$b */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"com/p1/mobile/putong/live/livingroom/virtual/room/hourleaderboard/mainland/VoiceHourBoardHeaderView$b", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationStart", "(Landroid/animation/Animator;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C13143b extends AnimatorListenerAdapter {
        public C13143b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            animation.getClass();
            VoiceHourBoardHeaderView.this.f49230g.setAlpha(0.0f);
            bnl0.m105525M0(VoiceHourBoardHeaderView.this.f49230g, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.VoiceHourBoardHeaderView$c */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m88121d2 = {"com/p1/mobile/putong/live/livingroom/virtual/room/hourleaderboard/mainland/VoiceHourBoardHeaderView$c", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationEnd", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C13144c extends AnimatorListenerAdapter {
        public C13144c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            if (VoiceHourBoardHeaderView.this.canPlaySvga) {
                VoiceHourBoardHeaderView voiceHourBoardHeaderView = VoiceHourBoardHeaderView.this;
                voiceHourBoardHeaderView.f49228e.m78622k0(voiceHourBoardHeaderView.getSecondSvgaUrl());
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            animation.getClass();
            VoiceHourBoardHeaderView.this.f49228e.setAlpha(0.0f);
            bnl0.m105525M0(VoiceHourBoardHeaderView.this.f49228e, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.VoiceHourBoardHeaderView$d */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m88121d2 = {"com/p1/mobile/putong/live/livingroom/virtual/room/hourleaderboard/mainland/VoiceHourBoardHeaderView$d", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationEnd", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C13145d extends AnimatorListenerAdapter {
        public C13145d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            if (VoiceHourBoardHeaderView.this.canPlaySvga) {
                VoiceHourBoardHeaderView voiceHourBoardHeaderView = VoiceHourBoardHeaderView.this;
                voiceHourBoardHeaderView.f49229f.m78622k0(voiceHourBoardHeaderView.getThirdSvgaUrl());
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            animation.getClass();
            VoiceHourBoardHeaderView.this.f49229f.setAlpha(0.0f);
            bnl0.m105525M0(VoiceHourBoardHeaderView.this.f49229f, true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceHourBoardHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.firstShowAnim = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.xln0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VoiceHourBoardHeaderView.m78606j0(this.f195003a);
            }
        });
        this.secondShowAnim = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.yln0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VoiceHourBoardHeaderView.m78605i0(this.f200569a);
            }
        });
        this.thirdShowAnim = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.zln0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VoiceHourBoardHeaderView.m78607k0(this.f204984a);
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
        if (jcr.f120090a.equals(this.boardName)) {
            return "https://fe-static.tancdn.com/v1/raw/5b6bab67-57d0-4cce-823c-7e40adf5847a13.svga";
        }
        return jcr.f120091b.equals(this.boardName) ? "https://fe-static.tancdn.com/v1/raw/26024cd2-ad50-4d5b-8316-34ec5f15188d12.svga" : "https://auto.tancdn.com/v1/raw/69cadcb7-182a-4b98-870f-ba7525d5954d12.pdf";
    }

    private final Animator getThirdShowAnim() {
        return (Animator) this.thirdShowAnim.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getThirdSvgaUrl() {
        if (jcr.f120090a.equals(this.boardName)) {
            return "https://fe-static.tancdn.com/v1/raw/d3b4e8e1-e455-4005-867b-f9d9908d916e12.svga";
        }
        return jcr.f120091b.equals(this.boardName) ? "https://fe-static.tancdn.com/v1/raw/95354606-5d83-46d9-b9e8-29988acab47012.svga" : "https://auto.tancdn.com/v1/raw/2dc517cd-df03-4c46-bfa2-0fa8c16604d413.pdf";
    }

    /* JADX INFO: renamed from: i0 */
    public static AnimatorSet m78605i0(VoiceHourBoardHeaderView voiceHourBoardHeaderView) {
        Animator animatorM132164j = gt0.m132164j(500);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(voiceHourBoardHeaderView.f49228e, (Property<VoiceHourBoardSecondOrThirdView, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(voiceHourBoardHeaderView.f49228e, (Property<VoiceHourBoardSecondOrThirdView, Float>) View.TRANSLATION_X, qa00.f156322i, 0.0f);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).after(animatorM132164j);
        animatorSet.addListener(voiceHourBoardHeaderView.new C13144c());
        return animatorSet;
    }

    /* JADX INFO: renamed from: j0 */
    public static AnimatorSet m78606j0(VoiceHourBoardHeaderView voiceHourBoardHeaderView) {
        Animator animatorM132164j = gt0.m132164j(200);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(voiceHourBoardHeaderView.f49230g, (Property<VoiceHourBoardFirstView, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.play(objectAnimatorOfFloat).after(animatorM132164j);
        animatorSet.addListener(voiceHourBoardHeaderView.new C13143b());
        return animatorSet;
    }

    /* JADX INFO: renamed from: k0 */
    public static AnimatorSet m78607k0(VoiceHourBoardHeaderView voiceHourBoardHeaderView) {
        Animator animatorM132164j = gt0.m132164j(500);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(voiceHourBoardHeaderView.f49229f, (Property<VoiceHourBoardSecondOrThirdView, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(voiceHourBoardHeaderView.f49229f, (Property<VoiceHourBoardSecondOrThirdView, Float>) View.TRANSLATION_X, -qa00.f156322i, 0.0f);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).after(animatorM132164j);
        animatorSet.addListener(voiceHourBoardHeaderView.new C13145d());
        return animatorSet;
    }

    /* JADX INFO: renamed from: p0 */
    private final void m78611p0() {
        if (getFirstShowAnim().isRunning()) {
            m78614o0(getFirstShowAnim());
        }
        if (getSecondShowAnim().isRunning()) {
            m78614o0(getSecondShowAnim());
        }
        if (getThirdShowAnim().isRunning()) {
            m78614o0(getThirdShowAnim());
        }
    }

    /* JADX INFO: renamed from: q0 */
    private final void m78612q0() {
        this.f49230g.setAlpha(0.0f);
        this.f49228e.setAlpha(0.0f);
        this.f49229f.setAlpha(0.0f);
    }

    /* JADX INFO: renamed from: t0 */
    private final void m78613t0() {
        this.canPlaySvga = true;
        m78611p0();
        getFirstShowAnim().start();
        getSecondShowAnim().start();
        getThirdShowAnim().start();
    }

    /* JADX INFO: renamed from: o0 */
    public final void m78614o0(Animator anim) {
        if (anim != null) {
            anim.end();
        }
        if (anim != null) {
            anim.cancel();
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.binding.LiveVoiceLeaderBoardPageHeaderBindings, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78612q0();
        setTag(Integer.valueOf(mdc0.f135896B3));
    }

    /* JADX INFO: renamed from: r0 */
    public final void m78615r0(List<? extends BLiveVoiceHourLeaderBoardItem> list, String name, boolean isGroupOrHourBoard, boolean showMvp) {
        osn0 osn0Var;
        osn0 osn0Var2;
        if (list.isEmpty()) {
            this.f49230g.m78604m0(name);
            this.f49228e.m78625n0(1);
            this.f49229f.m78625n0(2);
            return;
        }
        if (list.size() == 2) {
            this.f49229f.m78625n0(2);
        } else if (list.size() == 1) {
            this.f49228e.m78625n0(1);
            this.f49229f.m78625n0(2);
        }
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            BLiveVoiceHourLeaderBoardItem bLiveVoiceHourLeaderBoardItem = (BLiveVoiceHourLeaderBoardItem) obj;
            if (i == 0) {
                VoiceHourBoardFirstView voiceHourBoardFirstView = this.f49230g;
                osn0 osn0Var3 = this.listener;
                if (osn0Var3 == null) {
                    Intrinsics.m88391r(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                    osn0Var3 = null;
                }
                voiceHourBoardFirstView.m78603l0(bLiveVoiceHourLeaderBoardItem, osn0Var3, name, isGroupOrHourBoard, showMvp);
            } else if (i == 1) {
                VoiceHourBoardSecondOrThirdView voiceHourBoardSecondOrThirdView = this.f49228e;
                osn0 osn0Var4 = this.listener;
                if (osn0Var4 == null) {
                    Intrinsics.m88391r(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                    osn0Var = null;
                } else {
                    osn0Var = osn0Var4;
                }
                voiceHourBoardSecondOrThirdView.m78624m0(bLiveVoiceHourLeaderBoardItem, i, osn0Var, name, isGroupOrHourBoard, showMvp);
            } else if (i == 2) {
                VoiceHourBoardSecondOrThirdView voiceHourBoardSecondOrThirdView2 = this.f49229f;
                osn0 osn0Var5 = this.listener;
                if (osn0Var5 == null) {
                    Intrinsics.m88391r(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                    osn0Var2 = null;
                } else {
                    osn0Var2 = osn0Var5;
                }
                voiceHourBoardSecondOrThirdView2.m78624m0(bLiveVoiceHourLeaderBoardItem, i, osn0Var2, name, isGroupOrHourBoard, showMvp);
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m78616s0(@NotNull List<? extends BLiveVoiceHourLeaderBoardItem> list, @NotNull osn0 listener, @NotNull String name, boolean showRoomTile, boolean showMvp) {
        list.getClass();
        listener.getClass();
        name.getClass();
        this.listener = listener;
        this.boardName = name;
        m78615r0(list, name, showRoomTile, showMvp);
        m78613t0();
    }

    public /* synthetic */ VoiceHourBoardHeaderView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
