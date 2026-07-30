package com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.BuzzRegionPassiveView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VText;
import p149l.f6w;
import p149l.g9w;
import p149l.hvc0;
import p149l.j8w;
import p149l.jp3;
import p149l.o7r;
import p149l.p9w;
import p149l.t100;
import p149l.xdl0;
import p149l.y2c0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m87231d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0017R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzRegionPassiveView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "c", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "g", "()V", Constants.INAPP_DATA_TAG, "f", "Lv/VText;", "a", "Lv/VText;", "get_region_name", "()Lv/VText;", "set_region_name", "(Lv/VText;)V", "_region_name", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class BuzzRegionPassiveView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VText _region_name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuzzRegionPassiveView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater layoutInflaterM163037a = o7r.m163037a(getContext());
        layoutInflaterM163037a.getClass();
        m47183c(layoutInflaterM163037a, this);
        setOrientation(0);
        setLayoutTransition(new LayoutTransition());
        int i2 = t100.f167264m;
        int i3 = t100.f167258g;
        setPadding(i2, i3, i2, i3);
        setBackgroundResource(y2c0.f195563i0);
        Drawable drawableM133155b = hvc0.m133155b(y2c0.f195552d);
        drawableM133155b.getClass();
        int i4 = t100.f167270s;
        drawableM133155b.setBounds(0, 0, i4, i4);
        xdl0.m208383k(get_region_name(), drawableM133155b);
        m47184d();
    }

    /* JADX INFO: renamed from: a */
    public static void m47180a(final BuzzRegionPassiveView buzzRegionPassiveView, View view) {
        p9w.INSTANCE.m167947o0();
        f6w.INSTANCE.m119690X(buzzRegionPassiveView.getAct(), new Function0() { // from class: l.ip3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BuzzRegionPassiveView.m47182e(this.f114263a);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m47182e(BuzzRegionPassiveView buzzRegionPassiveView) {
        buzzRegionPassiveView.m47185f();
        return Unit.INSTANCE;
    }

    private final Act getAct() {
        Context context = getContext();
        context.getClass();
        return (Act) context;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final View m47183c(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM142567b = jp3.m142567b(this, inflater, parent);
        viewM142567b.getClass();
        return viewM142567b;
    }

    /* JADX INFO: renamed from: d */
    public final void m47184d() {
        xdl0.m208329E0(get_region_name(), new View.OnClickListener() { // from class: l.hp3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BuzzRegionPassiveView.m47180a(this.f108890a, view);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final void m47185f() {
        get_region_name().setText(g9w.INSTANCE.m124857h(j8w.INSTANCE.m140473a().m140467u0()));
    }

    /* JADX INFO: renamed from: g */
    public final void m47186g() {
        if (xdl0.m208349O0(this)) {
            m47185f();
        }
    }

    @NotNull
    public final VText get_region_name() {
        VText vText = this._region_name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_region_name");
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
