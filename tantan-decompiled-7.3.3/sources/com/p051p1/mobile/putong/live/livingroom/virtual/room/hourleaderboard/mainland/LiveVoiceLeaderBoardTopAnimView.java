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
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveVoiceLeaderBoardTopAnimViewBindings;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bnl0;
import p153l.izs;
import p153l.qa00;
import p153l.wo0;
import p153l.zft;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/room/hourleaderboard/mainland/LiveVoiceLeaderBoardTopAnimView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVoiceLeaderBoardTopAnimViewBindings;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "url", "", "k0", "(Ljava/lang/String;)V", AuthenticationTokenClaims.JSON_KEY_NAME, "type", "j0", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/animation/Animator;", "g", "Landroid/animation/Animator;", "bgAnim", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class LiveVoiceLeaderBoardTopAnimView extends LiveVoiceLeaderBoardTopAnimViewBindings {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public Animator bgAnim;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.LiveVoiceLeaderBoardTopAnimView$a */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"com/p1/mobile/putong/live/livingroom/virtual/room/hourleaderboard/mainland/LiveVoiceLeaderBoardTopAnimView$a", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationStart", "(Landroid/animation/Animator;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C13140a extends AnimatorListenerAdapter {
        public C13140a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            animation.getClass();
            bnl0.m105525M0(LiveVoiceLeaderBoardTopAnimView.this.f49233f, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.LiveVoiceLeaderBoardTopAnimView$b */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"com/p1/mobile/putong/live/livingroom/virtual/room/hourleaderboard/mainland/LiveVoiceLeaderBoardTopAnimView$b", "Ll/wo0;", "", "g", "()V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C13141b extends wo0 {
        public C13141b() {
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: g */
        public void mo70786g() {
            super.mo70786g();
            Animator animator = LiveVoiceLeaderBoardTopAnimView.this.bgAnim;
            if (animator != null) {
                animator.start();
            }
        }
    }

    public /* synthetic */ LiveVoiceLeaderBoardTopAnimView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r3.equals("sweet") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (r3.equals("flower") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        m78598k0("https://auto.tancdn.com/v1/raw/d6ac71d3-fa85-45c1-b0c0-0a9b3141cb1e13.pdf");
        r2.f49232e.setBackground(p153l.n3d0.m161278b(p153l.obc0.f146131N9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: j0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m78597j0(@NotNull String name, @NotNull String type) {
        name.getClass();
        type.getClass();
        this.f49233f.m69688o();
        if (Intrinsics.m88377d("room", type) && Intrinsics.m88377d("room", name)) {
            m78598k0("https://auto.tancdn.com/v1/raw/f9f9b9db-0e97-4823-8f39-547baf3e7f4f12.pdf");
            izs.m142868s("context_livingAct", this.f49232e, zft.f204200H);
            return;
        }
        int iHashCode = name.hashCode();
        if (iHashCode != -1271629221) {
            if (iHashCode != 104991738) {
                if (iHashCode == 109850352) {
                }
            } else if (name.equals("noble")) {
                m78598k0("https://auto.tancdn.com/v1/raw/974cbc49-dcc1-4891-8d32-007358d0ef5913.pdf");
                izs.m142868s("context_livingAct", this.f49232e, zft.f204230y);
                return;
            }
            m78598k0("https://auto.tancdn.com/v1/raw/4ba39379-32d5-42c7-973b-7d6e52c17f5a12.pdf");
            izs.m142868s("context_livingAct", this.f49232e, zft.f204199G);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m78598k0(@NotNull String url) {
        url.getClass();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f49233f, (Property<AnimEffectPlayer, Float>) View.TRANSLATION_X, -qa00.m175859d(100.0f), 0.0f);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        objectAnimatorOfFloat.setDuration(1500L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f49233f, (Property<AnimEffectPlayer, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator());
        objectAnimatorOfFloat2.setDuration(1500L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.addListener(new C13140a());
        this.bgAnim = animatorSet;
        this.f49233f.m69688o();
        this.f49233f.m69686m(url, -1, new C13141b(), false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveVoiceLeaderBoardTopAnimView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }
}
