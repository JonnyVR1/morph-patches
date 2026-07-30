package com.p000p1.mobile.putong.core.newui.main.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l.ew40;
import l.f6c0;
import l.lac0;
import l.t0c0;
import l.u4c0;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.RedPointView;
import v.VDraweeView;
import v.VOnlineIndicator;
import v.VText;
import v.bottombar.VBottomBarDefaultItem;
import v.bottombar.VBottomBarOldItem;
import v.bottombar.VBottomBarRippleView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010 \u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0016\u0010\"\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001b¨\u0006#"}, d2 = {"Lcom/p1/mobile/putong/core/newui/main/view/HomeWithBoostBottomBarItem;", "Lv/bottombar/VBottomBarOldItem;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "c", "()V", "", "selected", "selectedAnim", "a", "(ZZ)V", "enableDarkMode", "setDarkMode", "(Z)V", "Lcom/tantan/library/svga/SVGAnimationView;", "n", "Lcom/tantan/library/svga/SVGAnimationView;", "svgaAnim", "", "o", "Ljava/lang/String;", "nameString", "p", "boostingNameString", "q", "boostingSvga", "r", "darkModeSvga", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HomeWithBoostBottomBarItem extends VBottomBarOldItem {

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public SVGAnimationView svgaAnim;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public String nameString;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public String boostingNameString;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public String boostingSvga;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public String darkModeSvga;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeWithBoostBottomBarItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.nameString = "";
        this.boostingNameString = "";
        this.boostingSvga = "";
        this.darkModeSvga = "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public void m4577a(boolean selected, boolean selectedAnim) {
        SVGAnimationView sVGAnimationView;
        SVGAnimationView sVGAnimationView2;
        if ((lac0.Companion.b() && !CoreModule.c.c2.t3()) || ew40.j()) {
            ((VBottomBarDefaultItem) this).b.setText(this.nameString);
            xdl0.M(((VBottomBarOldItem) this).i, true);
            xdl0.M(this.svgaAnim, false);
            SVGAnimationView sVGAnimationView3 = this.svgaAnim;
            if (sVGAnimationView3 != null && sVGAnimationView3.isAnimating() && (sVGAnimationView2 = this.svgaAnim) != null) {
                SVGAnimationView.stopAnimation$default(sVGAnimationView2, false, 1, (Object) null);
            }
            super/*v.bottombar.VBottomBarDefaultItem*/.a(selected, selectedAnim);
            return;
        }
        VBottomBarRippleView vBottomBarRippleView = ((VBottomBarOldItem) this).i;
        if (selected) {
            xdl0.M(vBottomBarRippleView, true);
            xdl0.M(this.svgaAnim, false);
            SVGAnimationView sVGAnimationView4 = this.svgaAnim;
            if (sVGAnimationView4 != null && sVGAnimationView4.isAnimating() && (sVGAnimationView = this.svgaAnim) != null) {
                SVGAnimationView.stopAnimation$default(sVGAnimationView, false, 1, (Object) null);
            }
            VBottomBarRippleView vBottomBarRippleView2 = ((VBottomBarOldItem) this).i;
            if (selectedAnim) {
                vBottomBarRippleView2.i();
            } else {
                vBottomBarRippleView2.d();
            }
            ((VBottomBarDefaultItem) this).b.setText(this.nameString);
            ((VBottomBarDefaultItem) this).b.setTextColor(getResources().getColor(t0c0.t));
            ((VBottomBarDefaultItem) this).b.setTypeface((Typeface) null, 1);
        } else {
            xdl0.M(vBottomBarRippleView, false);
            xdl0.M(this.svgaAnim, true);
            SVGAnimationView sVGAnimationView5 = this.svgaAnim;
            if (sVGAnimationView5 != null) {
                sVGAnimationView5.startAnimation();
            }
            ((VBottomBarOldItem) this).i.f();
            ((VBottomBarDefaultItem) this).b.setText(this.boostingNameString);
            boolean z = ((VBottomBarDefaultItem) this).g;
            VText vText = ((VBottomBarDefaultItem) this).b;
            if (z) {
                vText.setTextColor(getResources().getColor(t0c0.v));
            } else {
                vText.setTextColor(getResources().getColor(t0c0.o));
            }
            ((VBottomBarDefaultItem) this).b.setTypeface((Typeface) null, 0);
        }
        setSelected(selected);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public void m4578c() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(f6c0.b0, (ViewGroup) this, true);
        viewInflate.getClass();
        if (viewInflate.getLayoutParams() == null) {
            viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        }
        setClipChildren(false);
        setClipToPadding(false);
        VBottomBarRippleView vBottomBarRippleViewFindViewById = viewInflate.findViewById(u4c0.Gb);
        vBottomBarRippleViewFindViewById.getClass();
        ((VBottomBarOldItem) this).i = vBottomBarRippleViewFindViewById;
        VText vTextFindViewById = viewInflate.findViewById(u4c0.I8);
        vTextFindViewById.getClass();
        ((VBottomBarDefaultItem) this).b = vTextFindViewById;
        VDraweeView vDraweeViewFindViewById = viewInflate.findViewById(u4c0.ja);
        vDraweeViewFindViewById.getClass();
        ((VBottomBarOldItem) this).h = vDraweeViewFindViewById;
        RedPointView redPointViewFindViewById = findViewById(u4c0.l0);
        redPointViewFindViewById.getClass();
        ((VBottomBarDefaultItem) this).c = redPointViewFindViewById;
        View viewFindViewById = findViewById(u4c0.s4);
        viewFindViewById.getClass();
        ((VBottomBarOldItem) this).l = (FrameLayout) viewFindViewById;
        VOnlineIndicator vOnlineIndicatorFindViewById = findViewById(u4c0.k6);
        vOnlineIndicatorFindViewById.getClass();
        ((VBottomBarDefaultItem) this).d = vOnlineIndicatorFindViewById;
        View viewFindViewById2 = findViewById(u4c0.la);
        viewFindViewById2.getClass();
        ((VBottomBarOldItem) this).k = (RelativeLayout) viewFindViewById2;
        ((VBottomBarDefaultItem) this).e = findViewById(u4c0.g3);
        ((VBottomBarOldItem) this).j = (RelativeLayout) findViewById(u4c0.Kb);
        SVGAnimationView sVGAnimationViewFindViewById = findViewById(u4c0.rd);
        sVGAnimationViewFindViewById.getClass();
        this.svgaAnim = sVGAnimationViewFindViewById;
    }

    public void setDarkMode(boolean enableDarkMode) {
        super.setDarkMode(enableDarkMode);
        SVGAnimationView sVGAnimationView = this.svgaAnim;
        if (sVGAnimationView != null) {
            if (enableDarkMode) {
                Context context = sVGAnimationView.getContext();
                context.getClass();
                SVGALoader.with(context).from(this.darkModeSvga).autoPlay(false).repeatCount(-1).into(sVGAnimationView);
            } else {
                Context context2 = sVGAnimationView.getContext();
                context2.getClass();
                SVGALoader.with(context2).from(this.boostingSvga).autoPlay(false).repeatCount(-1).into(sVGAnimationView);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeWithBoostBottomBarItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeWithBoostBottomBarItem(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ HomeWithBoostBottomBarItem(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
