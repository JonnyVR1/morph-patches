package com.p000p1.mobile.putong.live.livingroom.voice.membermanager.requestmic;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.v;
import com.p000p1.mobile.putong.live.livingroom.voice.membermanager.requestmic.MemberRequestMicPageView;
import com.p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.i3c0;
import l.kvc0;
import l.nnn0;
import l.t100;
import l.t6c0;
import l.ucy;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009l.ody;
import p009l.scy;
import v.VImage;
import v.VLinear;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 q2\u00020\u0001:\u0001rB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0019\u001a\u00020\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u0010R\"\u0010$\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010+\u001a\u00020\u00018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00107\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010.\u001a\u0004\b5\u00100\"\u0004\b6\u00102R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010E\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010\fR\"\u0010I\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010A\u001a\u0004\bG\u0010C\"\u0004\bH\u0010\fR\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010Y\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010a\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010i\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u0016\u0010l\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010p\u001a\u00020m8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bn\u0010o¨\u0006s"}, d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/membermanager/requestmic/MemberRequestMicPageView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/View;", "view", "", "i0", "(Landroid/view/View;)V", "", "isOpen", "m0", "(Z)V", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "adapter", "Ll/ody;", "Ll/nnn0;", "Ll/scy;", "presenter", "l0", "(Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;Ll/ody;)V", "k0", "(Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;)V", "n0", "d", "Lcom/p1/mobile/putong/live/livingroom/voice/membermanager/requestmic/MemberRequestMicPageView;", "get_rootView", "()Lcom/p1/mobile/putong/live/livingroom/voice/membermanager/requestmic/MemberRequestMicPageView;", "set_rootView", "(Lcom/p1/mobile/putong/live/livingroom/voice/membermanager/requestmic/MemberRequestMicPageView;)V", "_rootView", "e", "Landroidx/constraintlayout/widget/ConstraintLayout;", "get_free_call_container", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_free_call_container", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_free_call_container", "Landroid/widget/TextView;", "f", "Landroid/widget/TextView;", "get_title", "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "g", "get_desc", "set_desc", "_desc", "Landroid/widget/FrameLayout;", "h", "Landroid/widget/FrameLayout;", "get_switch_open", "()Landroid/widget/FrameLayout;", "set_switch_open", "(Landroid/widget/FrameLayout;)V", "_switch_open", "i", "Landroid/view/View;", "get_point_bg", "()Landroid/view/View;", "set_point_bg", "_point_bg", "j", "get_round_point", "set_round_point", "_round_point", "Lv/VRecyclerView;", "k", "Lv/VRecyclerView;", "get_recyclerView", "()Lv/VRecyclerView;", "set_recyclerView", "(Lv/VRecyclerView;)V", "_recyclerView", "Lv/VLinear;", "l", "Lv/VLinear;", "get_empty", "()Lv/VLinear;", "set_empty", "(Lv/VLinear;)V", "_empty", "Lv/VImage;", "m", "Lv/VImage;", "get_empty_icon", "()Lv/VImage;", "set_empty_icon", "(Lv/VImage;)V", "_empty_icon", "Lv/VText;", "n", "Lv/VText;", "get_empty_text", "()Lv/VText;", "set_empty_text", "(Lv/VText;)V", "_empty_text", "o", "Z", "switchIsOpen", "Landroid/animation/ObjectAnimator;", "p", "Landroid/animation/ObjectAnimator;", "animator", "Companion", "a", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class MemberRequestMicPageView extends ConstraintLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public MemberRequestMicPageView _rootView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public ConstraintLayout _free_call_container;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public TextView _title;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public TextView _desc;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public FrameLayout _switch_open;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public View _point_bg;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public View _round_point;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VRecyclerView _recyclerView;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VLinear _empty;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VImage _empty_icon;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VText _empty_text;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public boolean switchIsOpen;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public ObjectAnimator animator;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.membermanager.requestmic.MemberRequestMicPageView$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/membermanager/requestmic/MemberRequestMicPageView$a;", "", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Lcom/p1/mobile/putong/live/livingroom/voice/membermanager/requestmic/MemberRequestMicPageView;", "a", "(Landroid/view/LayoutInflater;)Lcom/p1/mobile/putong/live/livingroom/voice/membermanager/requestmic/MemberRequestMicPageView;", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final MemberRequestMicPageView m8868a(@NotNull LayoutInflater inflater) {
            inflater.getClass();
            Object objInflate = inflater.inflate(t6c0.T3, (ViewGroup) null, false);
            objInflate.getClass();
            return (MemberRequestMicPageView) objInflate;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.membermanager.requestmic.MemberRequestMicPageView$b */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\u000b¸\u0006\n"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "androidx/core/animation/AnimatorKt$doOnEnd$$inlined$addListener$1", "core-ktx_release"}, k = 1, mv = {2, 2, 0})
    @SourceDebugExtension
    public static final class C0448b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f7338b;

        public C0448b(boolean z) {
            this.f7338b = z;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull Animator animator) {
            animator.getClass();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animator) {
            animator.getClass();
            MemberRequestMicPageView.this.get_point_bg().setBackground(kvc0.b(this.f7338b ? i3c0.j7 : i3c0.i7));
            MemberRequestMicPageView.this.get_round_point().setBackground(kvc0.b(this.f7338b ? i3c0.l7 : i3c0.k7));
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull Animator animator) {
            animator.getClass();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animator) {
            animator.getClass();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public MemberRequestMicPageView(@NotNull Context context) {
        context.getClass();
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m8861h0(ody odyVar, MemberRequestMicPageView memberRequestMicPageView, View view) {
        odyVar.m19726v4(!memberRequestMicPageView.switchIsOpen);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: j0 */
    public static final MemberRequestMicPageView m8862j0(@NotNull LayoutInflater layoutInflater) {
        return INSTANCE.m8868a(layoutInflater);
    }

    /* JADX INFO: renamed from: m0 */
    private final void m8863m0(boolean isOpen) {
        Property property = View.TRANSLATION_X;
        ObjectAnimator objectAnimatorOfFloat = isOpen ? ObjectAnimator.ofFloat(get_round_point(), (Property<View, Float>) property, 0.0f, t100.d(16.0f)) : ObjectAnimator.ofFloat(get_round_point(), (Property<View, Float>) property, t100.d(16.0f), 0.0f);
        objectAnimatorOfFloat.getClass();
        this.animator = objectAnimatorOfFloat;
        ObjectAnimator objectAnimator = null;
        if (objectAnimatorOfFloat == null) {
            Intrinsics.r("animator");
            objectAnimatorOfFloat = null;
        }
        objectAnimatorOfFloat.addListener(new C0448b(isOpen));
        ObjectAnimator objectAnimator2 = this.animator;
        if (objectAnimator2 == null) {
            Intrinsics.r("animator");
        } else {
            objectAnimator = objectAnimator2;
        }
        objectAnimator.start();
    }

    @NotNull
    public final TextView get_desc() {
        TextView textView = this._desc;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_desc");
        return null;
    }

    @NotNull
    public final VLinear get_empty() {
        VLinear vLinear = this._empty;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_empty");
        return null;
    }

    @NotNull
    public final VImage get_empty_icon() {
        VImage vImage = this._empty_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_empty_icon");
        return null;
    }

    @NotNull
    public final VText get_empty_text() {
        VText vText = this._empty_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_empty_text");
        return null;
    }

    @NotNull
    public final ConstraintLayout get_free_call_container() {
        ConstraintLayout constraintLayout = this._free_call_container;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.r("_free_call_container");
        return null;
    }

    @NotNull
    public final View get_point_bg() {
        View view = this._point_bg;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_point_bg");
        return null;
    }

    @NotNull
    public final VRecyclerView get_recyclerView() {
        VRecyclerView vRecyclerView = this._recyclerView;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.r("_recyclerView");
        return null;
    }

    @NotNull
    public final MemberRequestMicPageView get_rootView() {
        MemberRequestMicPageView memberRequestMicPageView = this._rootView;
        if (memberRequestMicPageView != null) {
            return memberRequestMicPageView;
        }
        Intrinsics.r("_rootView");
        return null;
    }

    @NotNull
    public final View get_round_point() {
        View view = this._round_point;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_round_point");
        return null;
    }

    @NotNull
    public final FrameLayout get_switch_open() {
        FrameLayout frameLayout = this._switch_open;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_switch_open");
        return null;
    }

    @NotNull
    public final TextView get_title() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_title");
        return null;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m8864i0(View view) {
        ucy.a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m8865k0(@Nullable LiveBaseAdapter adapter) {
        VRecyclerView vRecyclerView = get_recyclerView();
        vRecyclerView.setAdapter(adapter);
        vRecyclerView.setHasFixedSize(true);
        vRecyclerView.setLayoutManager(new LinearLayoutManager(vRecyclerView.getContext()));
        v itemAnimator = vRecyclerView.getItemAnimator();
        itemAnimator.getClass();
        itemAnimator.setSupportsChangeAnimations(false);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m8866l0(@Nullable LiveBaseAdapter adapter, @NotNull final ody<nnn0, scy> presenter) {
        presenter.getClass();
        m8865k0(adapter);
        xdl0.E0(get_switch_open(), new View.OnClickListener() { // from class: l.tcy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MemberRequestMicPageView.m8861h0(presenter, this, view);
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public final void m8867n0(boolean isOpen) {
        this.switchIsOpen = isOpen;
        m8863m0(isOpen);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8864i0(this);
    }

    public final void set_desc(@NotNull TextView textView) {
        textView.getClass();
        this._desc = textView;
    }

    public final void set_empty(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._empty = vLinear;
    }

    public final void set_empty_icon(@NotNull VImage vImage) {
        vImage.getClass();
        this._empty_icon = vImage;
    }

    public final void set_empty_text(@NotNull VText vText) {
        vText.getClass();
        this._empty_text = vText;
    }

    public final void set_free_call_container(@NotNull ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        this._free_call_container = constraintLayout;
    }

    public final void set_point_bg(@NotNull View view) {
        view.getClass();
        this._point_bg = view;
    }

    public final void set_recyclerView(@NotNull VRecyclerView vRecyclerView) {
        vRecyclerView.getClass();
        this._recyclerView = vRecyclerView;
    }

    public final void set_rootView(@NotNull MemberRequestMicPageView memberRequestMicPageView) {
        memberRequestMicPageView.getClass();
        this._rootView = memberRequestMicPageView;
    }

    public final void set_round_point(@NotNull View view) {
        view.getClass();
        this._round_point = view;
    }

    public final void set_switch_open(@NotNull FrameLayout frameLayout) {
        frameLayout.getClass();
        this._switch_open = frameLayout;
    }

    public final void set_title(@NotNull TextView textView) {
        textView.getClass();
        this._title = textView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MemberRequestMicPageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ MemberRequestMicPageView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
