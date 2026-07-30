package com.p000p1.mobile.putong.core.p001ui.lovebuzz.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.p001ui.lovebuzz.widget.BuzzRegionPassiveView;
import com.p1.mobile.android.app.Act;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l.f6w;
import l.g9w;
import l.hvc0;
import l.j8w;
import l.jp3;
import l.o7r;
import l.p9w;
import l.t100;
import l.xdl0;
import l.y2c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0017R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzRegionPassiveView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "c", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "g", "()V", "d", "f", "Lv/VText;", "a", "Lv/VText;", "get_region_name", "()Lv/VText;", "set_region_name", "(Lv/VText;)V", "_region_name", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BuzzRegionPassiveView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VText _region_name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuzzRegionPassiveView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater layoutInflaterA = o7r.a(getContext());
        layoutInflaterA.getClass();
        m212c(layoutInflaterA, this);
        setOrientation(0);
        setLayoutTransition(new LayoutTransition());
        int i2 = t100.m;
        int i3 = t100.g;
        setPadding(i2, i3, i2, i3);
        setBackgroundResource(y2c0.i0);
        Drawable drawableB = hvc0.b(y2c0.d);
        drawableB.getClass();
        int i4 = t100.s;
        drawableB.setBounds(0, 0, i4, i4);
        xdl0.k(get_region_name(), drawableB);
        m213d();
    }

    /* JADX INFO: renamed from: a */
    public static void m209a(final BuzzRegionPassiveView buzzRegionPassiveView, View view) {
        p9w.INSTANCE.o0();
        f6w.INSTANCE.X(buzzRegionPassiveView.getAct(), new Function0() { // from class: l.ip3
            public final Object invoke() {
                return BuzzRegionPassiveView.m211e(this.f4449a);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m211e(BuzzRegionPassiveView buzzRegionPassiveView) {
        buzzRegionPassiveView.m214f();
        return Unit.INSTANCE;
    }

    private final Act getAct() {
        Act context = getContext();
        context.getClass();
        return context;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final View m212c(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = jp3.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: d */
    public final void m213d() {
        xdl0.E0(get_region_name(), new View.OnClickListener() { // from class: l.hp3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BuzzRegionPassiveView.m209a(this.f4244a, view);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final void m214f() {
        get_region_name().setText(g9w.INSTANCE.h(j8w.Companion.a().u0()));
    }

    /* JADX INFO: renamed from: g */
    public final void m215g() {
        if (xdl0.O0(this)) {
            m214f();
        }
    }

    @NotNull
    public final VText get_region_name() {
        VText vText = this._region_name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_region_name");
        return null;
    }

    public final void set_region_name(@NotNull VText vText) {
        vText.getClass();
        this._region_name = vText;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuzzRegionPassiveView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }
}
