package com.p051p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.view.SuperLikeGuideView;
import com.tantan.library.svga.SVGAnimationView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.adc0;
import p153l.kec0;
import p153l.p9r;
import p153l.x20;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/home/card/expanded/view/SuperLikeGuideView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Ll/x20;", "tryBtnAction", "", "setTryBtnCallBack", "(Ll/x20;)V", "Landroid/view/View;", "a", "Landroid/view/View;", "getSuperLikeRoot", "()Landroid/view/View;", "setSuperLikeRoot", "(Landroid/view/View;)V", "superLikeRoot", "Lcom/tantan/library/svga/SVGAnimationView;", "b", "Lcom/tantan/library/svga/SVGAnimationView;", "playsvga", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "tryBtn", Constants.INAPP_DATA_TAG, "Ll/x20;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class SuperLikeGuideView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public View superLikeRoot;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public SVGAnimationView playsvga;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public TextView tryBtn;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public x20 tryBtnAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SuperLikeGuideView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        View viewInflate = p9r.m171370a(getContext()).inflate(kec0.f126003pc, (ViewGroup) this, true);
        viewInflate.getClass();
        this.superLikeRoot = viewInflate;
        View viewFindViewById = viewInflate.findViewById(adc0.f70541ra);
        viewFindViewById.getClass();
        this.playsvga = (SVGAnimationView) viewFindViewById;
        View viewFindViewById2 = this.superLikeRoot.findViewById(adc0.f70664ye);
        TextView textView = (TextView) viewFindViewById2;
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.r5h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SuperLikeGuideView.m39358a(this.f161358a, view);
            }
        });
        viewFindViewById2.getClass();
        this.tryBtn = textView;
        setClickable(true);
    }

    /* JADX INFO: renamed from: a */
    public static void m39358a(SuperLikeGuideView superLikeGuideView, View view) {
        x20 x20Var = superLikeGuideView.tryBtnAction;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    @NotNull
    public final View getSuperLikeRoot() {
        return this.superLikeRoot;
    }

    public final void setSuperLikeRoot(@NotNull View view) {
        view.getClass();
        this.superLikeRoot = view;
    }

    public final void setTryBtnCallBack(@NotNull x20 tryBtnAction) {
        tryBtnAction.getClass();
        this.tryBtnAction = tryBtnAction;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SuperLikeGuideView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SuperLikeGuideView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SuperLikeGuideView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }

    public /* synthetic */ SuperLikeGuideView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
