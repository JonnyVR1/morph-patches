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
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveVoiceLeaderBoardTopAnimViewBindings;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ap0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/room/hourleaderboard/mainland/LiveVoiceLeaderBoardTopAnimView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVoiceLeaderBoardTopAnimViewBindings;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "url", "", "k0", "(Ljava/lang/String;)V", AuthenticationTokenClaims.JSON_KEY_NAME, "type", "j0", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/animation/Animator;", "g", "Landroid/animation/Animator;", "bgAnim", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class LiveVoiceLeaderBoardTopAnimView extends LiveVoiceLeaderBoardTopAnimViewBindings {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public Animator bgAnim;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.LiveVoiceLeaderBoardTopAnimView$a */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"com/p1/mobile/putong/live/livingroom/virtual/room/hourleaderboard/mainland/LiveVoiceLeaderBoardTopAnimView$a", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationStart", "(Landroid/animation/Animator;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C12977a extends AnimatorListenerAdapter {
        public C12977a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            animation.getClass();
            xdl0.m208345M0(LiveVoiceLeaderBoardTopAnimView.this.f48385f, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.LiveVoiceLeaderBoardTopAnimView$b */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"com/p1/mobile/putong/live/livingroom/virtual/room/hourleaderboard/mainland/LiveVoiceLeaderBoardTopAnimView$b", "Ll/ap0;", "", "g", "()V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C12978b extends ap0 {
        public C12978b() {
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: g */
        public void mo69603g() {
            super.mo69603g();
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
    
        m77415k0("https://auto.tancdn.com/v1/raw/d6ac71d3-fa85-45c1-b0c0-0a9b3141cb1e13.pdf");
        r2.f48384e.setBackground(p149l.kvc0.m147353b(p149l.i3c0.f110803N9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: j0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m77414j0(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull java.lang.String r4) {
        /*
            r2 = this;
            r3.getClass()
            r4.getClass()
            com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer r0 = r2.f48385f
            r0.m68505o()
            java.lang.String r0 = "room"
            boolean r4 = kotlin.jvm.internal.Intrinsics.m87488d(r0, r4)
            java.lang.String r1 = "context_livingAct"
            if (r4 == 0) goto L28
            boolean r4 = kotlin.jvm.internal.Intrinsics.m87488d(r0, r3)
            if (r4 == 0) goto L28
            java.lang.String r3 = "https://auto.tancdn.com/v1/raw/f9f9b9db-0e97-4823-8f39-547baf3e7f4f12.pdf"
            r2.m77415k0(r3)
            v.VDraweeView r2 = r2.f48384e
            java.lang.String r3 = p149l.ydt.f197605H
            p149l.hxs.m133406s(r1, r2, r3)
            return
        L28:
            int r4 = r3.hashCode()
            r0 = -1271629221(0xffffffffb4347a5b, float:-1.6808319E-7)
            if (r4 == r0) goto L5b
            r0 = 104991738(0x6420bfa, float:3.6496144E-35)
            if (r4 == r0) goto L45
            r0 = 109850352(0x68c2ef0, float:5.2731115E-35)
            if (r4 == r0) goto L3c
            goto L63
        L3c:
            java.lang.String r4 = "sweet"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L70
            goto L63
        L45:
            java.lang.String r4 = "noble"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L4e
            goto L63
        L4e:
            java.lang.String r3 = "https://auto.tancdn.com/v1/raw/974cbc49-dcc1-4891-8d32-007358d0ef5913.pdf"
            r2.m77415k0(r3)
            v.VDraweeView r2 = r2.f48384e
            java.lang.String r3 = p149l.ydt.f197635y
            p149l.hxs.m133406s(r1, r2, r3)
            return
        L5b:
            java.lang.String r4 = "flower"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L70
        L63:
            java.lang.String r3 = "https://auto.tancdn.com/v1/raw/4ba39379-32d5-42c7-973b-7d6e52c17f5a12.pdf"
            r2.m77415k0(r3)
            v.VDraweeView r2 = r2.f48384e
            java.lang.String r3 = p149l.ydt.f197604G
            p149l.hxs.m133406s(r1, r2, r3)
            return
        L70:
            java.lang.String r3 = "https://auto.tancdn.com/v1/raw/d6ac71d3-fa85-45c1-b0c0-0a9b3141cb1e13.pdf"
            r2.m77415k0(r3)
            v.VDraweeView r2 = r2.f48384e
            int r3 = p149l.i3c0.f110803N9
            android.graphics.drawable.Drawable r3 = p149l.kvc0.m147353b(r3)
            r2.setBackground(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p046p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.LiveVoiceLeaderBoardTopAnimView.m77414j0(java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: renamed from: k0 */
    public final void m77415k0(@NotNull String url) {
        url.getClass();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f48385f, (Property<AnimEffectPlayer, Float>) View.TRANSLATION_X, -t100.m186890d(100.0f), 0.0f);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        objectAnimatorOfFloat.setDuration(1500L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f48385f, (Property<AnimEffectPlayer, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator());
        objectAnimatorOfFloat2.setDuration(1500L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.addListener(new C12977a());
        this.bgAnim = animatorSet;
        this.f48385f.m68505o();
        this.f48385f.m68503m(url, -1, new C12978b(), false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveVoiceLeaderBoardTopAnimView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }
}
