package p149l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.RectEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.newui.messages.ConversationsList;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tantanapp.common.utils.CrashHelper;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010,\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R$\u00104\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00107\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010/\u001a\u0004\b5\u00101\"\u0004\b6\u00103¨\u00068"}, m87232d2 = {"Ll/orb0;", "Lcom/p1/mobile/android/app/Act$w;", "Lcom/p1/mobile/android/app/Act;", "Ll/sub0;", "Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;", "conversationsList", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderBaseView;", "quickChatAudioHeaderView", "<init>", "(Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderBaseView;)V", "to", "Landroid/view/View;", "k", "(Ll/sub0;)Landroid/view/View;", SocialConstants.PARAM_ACT, "", "f", "(Lcom/p1/mobile/android/app/Act;)V", "g", "from", "toActHelper", "Landroid/animation/Animator;", BLiveStormDanmakuGiftResourceType.f44444l, "(Lcom/p1/mobile/android/app/Act;Ll/sub0;)Landroid/animation/Animator;", "m", "a", "Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;", "n", "()Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;", "b", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderBaseView;", "o", "()Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderBaseView;", "", "c", "I", "getStartY", "()I", "setStartY", "(I)V", "startY", Constants.INAPP_DATA_TAG, "getStartBottom", "setStartBottom", "startBottom", "Landroid/graphics/Rect;", "e", "Landroid/graphics/Rect;", "getStart", "()Landroid/graphics/Rect;", "setStart", "(Landroid/graphics/Rect;)V", "start", "getEnd", "setEnd", "end", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class orb0 extends Act.AbstractC4304w<Act, sub0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ConversationsList conversationsList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final QuickChatHeaderBaseView quickChatAudioHeaderView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int startY;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int startBottom;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public Rect start;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public Rect end;

    /* JADX INFO: renamed from: l.orb0$a */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"l/orb0$a", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C19006a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ sub0 f145262b;

        public C19006a(sub0 sub0Var) {
            this.f145262b = sub0Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            orb0.this.getQuickChatAudioHeaderView().mo41989h();
            orb0.this.getConversationsList().setTranslationY(0.0f);
            this.f145262b.mo41785C().setClipBounds(null);
        }
    }

    public orb0(@NotNull ConversationsList conversationsList, @NotNull QuickChatHeaderBaseView quickChatHeaderBaseView) {
        conversationsList.getClass();
        quickChatHeaderBaseView.getClass();
        this.conversationsList = conversationsList;
        this.quickChatAudioHeaderView = quickChatHeaderBaseView;
    }

    /* JADX INFO: renamed from: i */
    public static void m165545i(orb0 orb0Var, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        orb0Var.conversationsList.setTranslationY(((Rect) animatedValue).bottom - orb0Var.startY);
    }

    /* JADX INFO: renamed from: j */
    public static void m165546j(orb0 orb0Var, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        orb0Var.conversationsList.setTranslationY(((Rect) animatedValue).bottom - orb0Var.startBottom);
    }

    @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
    /* JADX INFO: renamed from: f */
    public void mo20412f(@NotNull Act act) {
        act.getClass();
        int i = rzb0.f161651w;
        act.overridePendingTransition(i, i);
    }

    @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
    /* JADX INFO: renamed from: g */
    public void mo20413g(@NotNull Act act) {
        act.getClass();
        int i = rzb0.f161651w;
        act.overridePendingTransition(i, i);
    }

    @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public View mo20422a(@NotNull sub0 to) {
        to.getClass();
        return to.mo41786p();
    }

    @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Animator mo20409c(@NotNull Act from, @NotNull sub0 toActHelper) {
        from.getClass();
        toActHelper.getClass();
        RectEvaluator rectEvaluator = new RectEvaluator(new Rect());
        xdl0.C21104g c21104gM208380i0 = xdl0.m208380i0(this.quickChatAudioHeaderView);
        int i = c21104gM208380i0.f192419b;
        this.startY = i;
        this.startBottom = c21104gM208380i0.f192421d + i;
        this.start = new Rect(0, c21104gM208380i0.f192419b, c21104gM208380i0.f192420c + c21104gM208380i0.f192418a, this.startBottom);
        this.end = new Rect(0, 0, toActHelper.mo41785C().getWidth(), toActHelper.mo41785C().getHeight());
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(toActHelper.mo41785C(), "clipBounds", rectEvaluator, this.start, this.end);
        objectAnimatorOfObject.getClass();
        toActHelper.mo41785C().setClipBounds(this.start);
        objectAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.mrb0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                orb0.m165546j(this.f135353a, valueAnimator);
            }
        });
        objectAnimatorOfObject.addListener(new C19006a(toActHelper));
        if (upa.m194847z()) {
            objectAnimatorOfObject.setDuration(300L);
            return objectAnimatorOfObject;
        }
        objectAnimatorOfObject.setDuration(700L);
        return objectAnimatorOfObject;
    }

    @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
    @NotNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Animator mo20410d(@NotNull Act from, @NotNull sub0 toActHelper) {
        from.getClass();
        toActHelper.getClass();
        xdl0.C21104g c21104gM208380i0 = xdl0.m208380i0(this.quickChatAudioHeaderView);
        int i = this.startY;
        this.start = new Rect(0, i, c21104gM208380i0.f192420c + c21104gM208380i0.f192418a, i);
        RectEvaluator rectEvaluator = new RectEvaluator(new Rect());
        if (this.end == null) {
            CrashHelper.m81296c(new Throwable(" end nullpoint exception check " + this.end + " ==  " + this.start + " === " + this.startY + " ==  " + c21104gM208380i0));
            this.end = new Rect(0, 0, toActHelper.mo41785C().getWidth(), toActHelper.mo41785C().getHeight());
        }
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(toActHelper.mo41785C(), "clipBounds", rectEvaluator, this.end, this.start);
        objectAnimatorOfObject.getClass();
        toActHelper.mo41785C().setClipBounds(this.end);
        objectAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.nrb0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                orb0.m165545i(this.f140179a, valueAnimator);
            }
        });
        if (upa.m194847z()) {
            objectAnimatorOfObject.setDuration(400L);
        } else {
            objectAnimatorOfObject.setDuration(700L);
        }
        toActHelper.stop();
        return objectAnimatorOfObject;
    }

    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public final ConversationsList getConversationsList() {
        return this.conversationsList;
    }

    @NotNull
    /* JADX INFO: renamed from: o, reason: from getter */
    public final QuickChatHeaderBaseView getQuickChatAudioHeaderView() {
        return this.quickChatAudioHeaderView;
    }
}
