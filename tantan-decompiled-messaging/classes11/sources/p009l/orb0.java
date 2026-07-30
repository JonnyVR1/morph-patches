package p009l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.RectEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import com.p000p1.mobile.putong.core.newui.messages.ConversationsList;
import com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.CrashHelper;
import kotlin.Metadata;
import l.rzb0;
import l.upa;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010,\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R$\u00104\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00107\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010/\u001a\u0004\b5\u00101\"\u0004\b6\u00103¨\u00068"}, d2 = {"Ll/orb0;", "Lcom/p1/mobile/android/app/Act$w;", "Lcom/p1/mobile/android/app/Act;", "Ll/sub0;", "Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;", "conversationsList", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderBaseView;", "quickChatAudioHeaderView", "<init>", "(Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderBaseView;)V", "to", "Landroid/view/View;", "k", "(Ll/sub0;)Landroid/view/View;", "act", "", "f", "(Lcom/p1/mobile/android/app/Act;)V", "g", "from", "toActHelper", "Landroid/animation/Animator;", "l", "(Lcom/p1/mobile/android/app/Act;Ll/sub0;)Landroid/animation/Animator;", "m", "a", "Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;", "n", "()Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;", "b", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderBaseView;", "o", "()Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderBaseView;", "", "c", "I", "getStartY", "()I", "setStartY", "(I)V", "startY", "d", "getStartBottom", "setStartBottom", "startBottom", "Landroid/graphics/Rect;", "e", "Landroid/graphics/Rect;", "getStart", "()Landroid/graphics/Rect;", "setStart", "(Landroid/graphics/Rect;)V", "start", "getEnd", "setEnd", "end", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class orb0 extends Act.w<Act, sub0> {

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
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"l/orb0$a", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1087a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ sub0 f18224b;

        public C1087a(sub0 sub0Var) {
            this.f18224b = sub0Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            orb0.this.getQuickChatAudioHeaderView().mo6131h();
            orb0.this.getConversationsList().setTranslationY(0.0f);
            this.f18224b.mo5909C().setClipBounds(null);
        }
    }

    public orb0(@NotNull ConversationsList conversationsList, @NotNull QuickChatHeaderBaseView quickChatHeaderBaseView) {
        conversationsList.getClass();
        quickChatHeaderBaseView.getClass();
        this.conversationsList = conversationsList;
        this.quickChatAudioHeaderView = quickChatHeaderBaseView;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: i */
    public static void m20013i(orb0 orb0Var, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        orb0Var.conversationsList.setTranslationY(((Rect) animatedValue).bottom - orb0Var.startY);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: j */
    public static void m20014j(orb0 orb0Var, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        orb0Var.conversationsList.setTranslationY(((Rect) animatedValue).bottom - orb0Var.startBottom);
    }

    /* JADX INFO: renamed from: f */
    public void m20018f(@NotNull Act act) {
        act.getClass();
        int i = rzb0.w;
        act.overridePendingTransition(i, i);
    }

    /* JADX INFO: renamed from: g */
    public void m20019g(@NotNull Act act) {
        act.getClass();
        int i = rzb0.w;
        act.overridePendingTransition(i, i);
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public View m20015a(@NotNull sub0 to) {
        to.getClass();
        return to.mo5910p();
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Animator m20016c(@NotNull Act from, @NotNull sub0 toActHelper) {
        from.getClass();
        toActHelper.getClass();
        RectEvaluator rectEvaluator = new RectEvaluator(new Rect());
        xdl0.g gVarI0 = xdl0.i0(this.quickChatAudioHeaderView);
        int i = gVarI0.b;
        this.startY = i;
        this.startBottom = gVarI0.d + i;
        this.start = new Rect(0, gVarI0.b, gVarI0.c + gVarI0.a, this.startBottom);
        this.end = new Rect(0, 0, toActHelper.mo5909C().getWidth(), toActHelper.mo5909C().getHeight());
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(toActHelper.mo5909C(), "clipBounds", rectEvaluator, this.start, this.end);
        objectAnimatorOfObject.getClass();
        toActHelper.mo5909C().setClipBounds(this.start);
        objectAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.mrb0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                orb0.m20014j(this.f17056a, valueAnimator);
            }
        });
        objectAnimatorOfObject.addListener(new C1087a(toActHelper));
        if (upa.z()) {
            objectAnimatorOfObject.setDuration(300L);
            return objectAnimatorOfObject;
        }
        objectAnimatorOfObject.setDuration(700L);
        return objectAnimatorOfObject;
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Animator m20017d(@NotNull Act from, @NotNull sub0 toActHelper) {
        from.getClass();
        toActHelper.getClass();
        xdl0.g gVarI0 = xdl0.i0(this.quickChatAudioHeaderView);
        int i = this.startY;
        this.start = new Rect(0, i, gVarI0.c + gVarI0.a, i);
        RectEvaluator rectEvaluator = new RectEvaluator(new Rect());
        if (this.end == null) {
            CrashHelper.c(new Throwable(" end nullpoint exception check " + this.end + " ==  " + this.start + " === " + this.startY + " ==  " + gVarI0));
            this.end = new Rect(0, 0, toActHelper.mo5909C().getWidth(), toActHelper.mo5909C().getHeight());
        }
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(toActHelper.mo5909C(), "clipBounds", rectEvaluator, this.end, this.start);
        objectAnimatorOfObject.getClass();
        toActHelper.mo5909C().setClipBounds(this.end);
        objectAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.nrb0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                orb0.m20013i(this.f17624a, valueAnimator);
            }
        });
        if (upa.z()) {
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
