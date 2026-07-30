package com.p046p1.mobile.putong.core.newui.main.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.RedPointView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VOnlineIndicator;
import p147v.VText;
import p147v.bottombar.VBottomBarOldItem;
import p147v.bottombar.VBottomBarRippleView;
import p149l.ew40;
import p149l.f6c0;
import p149l.lac0;
import p149l.t0c0;
import p149l.u4c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010 \u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0016\u0010\"\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001b¨\u0006#"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/main/view/HomeWithBoostBottomBarItem;", "Lv/bottombar/VBottomBarOldItem;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "c", "()V", "", MatchFrom.selected, "selectedAnim", "a", "(ZZ)V", "enableDarkMode", "setDarkMode", "(Z)V", "Lcom/tantan/library/svga/SVGAnimationView;", "n", "Lcom/tantan/library/svga/SVGAnimationView;", "svgaAnim", "", "o", "Ljava/lang/String;", "nameString", "p", "boostingNameString", "q", "boostingSvga", "r", "darkModeSvga", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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

    @Override // p147v.bottombar.VBottomBarDefaultItem, p147v.bottombar.VBottomBar.InterfaceC22588b
    /* JADX INFO: renamed from: a */
    public void mo40491a(boolean selected, boolean selectedAnim) {
        SVGAnimationView sVGAnimationView;
        SVGAnimationView sVGAnimationView2;
        if ((lac0.INSTANCE.m149147b() && !CoreModule.f17545c.f19635c2.m99148t3()) || ew40.m118398j()) {
            this.f209529b.setText(this.nameString);
            xdl0.m208344M(this.f209542i, true);
            xdl0.m208344M(this.svgaAnim, false);
            SVGAnimationView sVGAnimationView3 = this.svgaAnim;
            if (sVGAnimationView3 != null && sVGAnimationView3.isAnimating() && (sVGAnimationView2 = this.svgaAnim) != null) {
                SVGAnimationView.stopAnimation$default(sVGAnimationView2, false, 1, null);
            }
            super.mo40491a(selected, selectedAnim);
            return;
        }
        VBottomBarRippleView vBottomBarRippleView = this.f209542i;
        if (selected) {
            xdl0.m208344M(vBottomBarRippleView, true);
            xdl0.m208344M(this.svgaAnim, false);
            SVGAnimationView sVGAnimationView4 = this.svgaAnim;
            if (sVGAnimationView4 != null && sVGAnimationView4.isAnimating() && (sVGAnimationView = this.svgaAnim) != null) {
                SVGAnimationView.stopAnimation$default(sVGAnimationView, false, 1, null);
            }
            VBottomBarRippleView vBottomBarRippleView2 = this.f209542i;
            if (selectedAnim) {
                vBottomBarRippleView2.m223381i();
            } else {
                vBottomBarRippleView2.m223377d();
            }
            this.f209529b.setText(this.nameString);
            this.f209529b.setTextColor(getResources().getColor(t0c0.f167168t));
            this.f209529b.setTypeface(null, 1);
        } else {
            xdl0.m208344M(vBottomBarRippleView, false);
            xdl0.m208344M(this.svgaAnim, true);
            SVGAnimationView sVGAnimationView5 = this.svgaAnim;
            if (sVGAnimationView5 != null) {
                sVGAnimationView5.startAnimation();
            }
            this.f209542i.m223378f();
            this.f209529b.setText(this.boostingNameString);
            boolean z = this.f209534g;
            VText vText = this.f209529b;
            if (z) {
                vText.setTextColor(getResources().getColor(t0c0.f167170v));
            } else {
                vText.setTextColor(getResources().getColor(t0c0.f167163o));
            }
            this.f209529b.setTypeface(null, 0);
        }
        setSelected(selected);
    }

    @Override // p147v.bottombar.VBottomBarOldItem, p147v.bottombar.VBottomBarDefaultItem
    /* JADX INFO: renamed from: c */
    public void mo40492c() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(f6c0.f95700b0, (ViewGroup) this, true);
        viewInflate.getClass();
        if (viewInflate.getLayoutParams() == null) {
            viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        }
        setClipChildren(false);
        setClipToPadding(false);
        View viewFindViewById = viewInflate.findViewById(u4c0.f173830Gb);
        viewFindViewById.getClass();
        this.f209542i = (VBottomBarRippleView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(u4c0.f173861I8);
        viewFindViewById2.getClass();
        this.f209529b = (VText) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(u4c0.f174314ja);
        viewFindViewById3.getClass();
        this.f209541h = (VDraweeView) viewFindViewById3;
        View viewFindViewById4 = findViewById(u4c0.f174338l0);
        viewFindViewById4.getClass();
        this.f209530c = (RedPointView) viewFindViewById4;
        View viewFindViewById5 = findViewById(u4c0.f174461s4);
        viewFindViewById5.getClass();
        this.f209545l = (FrameLayout) viewFindViewById5;
        View viewFindViewById6 = findViewById(u4c0.f174327k6);
        viewFindViewById6.getClass();
        this.f209531d = (VOnlineIndicator) viewFindViewById6;
        View viewFindViewById7 = findViewById(u4c0.f174348la);
        viewFindViewById7.getClass();
        this.f209544k = (RelativeLayout) viewFindViewById7;
        this.f209532e = (VImage) findViewById(u4c0.f174257g3);
        this.f209543j = (RelativeLayout) findViewById(u4c0.f173898Kb);
        View viewFindViewById8 = findViewById(u4c0.f174453rd);
        viewFindViewById8.getClass();
        this.svgaAnim = (SVGAnimationView) viewFindViewById8;
    }

    @Override // p147v.bottombar.VBottomBarOldItem, p147v.bottombar.VBottomBarDefaultItem
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
