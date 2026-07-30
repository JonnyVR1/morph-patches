package com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.BuzzRegionPassiveView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VText;
import p153l.bnl0;
import p153l.d8w;
import p153l.ebc0;
import p153l.ebw;
import p153l.haw;
import p153l.jq3;
import p153l.k3d0;
import p153l.nbw;
import p153l.p9r;
import p153l.qa00;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0017R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzRegionPassiveView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "c", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "g", "()V", Constants.INAPP_DATA_TAG, "f", "Lv/VText;", "a", "Lv/VText;", "get_region_name", "()Lv/VText;", "set_region_name", "(Lv/VText;)V", "_region_name", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class BuzzRegionPassiveView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VText _region_name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuzzRegionPassiveView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater layoutInflaterM171370a = p9r.m171370a(getContext());
        layoutInflaterM171370a.getClass();
        m48366c(layoutInflaterM171370a, this);
        setOrientation(0);
        setLayoutTransition(new LayoutTransition());
        int i2 = qa00.f156326m;
        int i3 = qa00.f156320g;
        setPadding(i2, i3, i2, i3);
        setBackgroundResource(ebc0.f92885i0);
        Drawable drawableM148006b = k3d0.m148006b(ebc0.f92874d);
        drawableM148006b.getClass();
        int i4 = qa00.f156332s;
        drawableM148006b.setBounds(0, 0, i4, i4);
        bnl0.m105563k(get_region_name(), drawableM148006b);
        m48367d();
    }

    /* JADX INFO: renamed from: a */
    public static void m48363a(final BuzzRegionPassiveView buzzRegionPassiveView, View view) {
        nbw.INSTANCE.m162251o0();
        d8w.INSTANCE.m114975X(buzzRegionPassiveView.getAct(), new Function0() { // from class: l.iq3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BuzzRegionPassiveView.m48365e(this.f116329a);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m48365e(BuzzRegionPassiveView buzzRegionPassiveView) {
        buzzRegionPassiveView.m48368f();
        return Unit.INSTANCE;
    }

    private final Act getAct() {
        Context context = getContext();
        context.getClass();
        return (Act) context;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final View m48366c(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM146552b = jq3.m146552b(this, inflater, parent);
        viewM146552b.getClass();
        return viewM146552b;
    }

    /* JADX INFO: renamed from: d */
    public final void m48367d() {
        bnl0.m105509E0(get_region_name(), new View.OnClickListener() { // from class: l.hq3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BuzzRegionPassiveView.m48363a(this.f111069a, view);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final void m48368f() {
        get_region_name().setText(ebw.INSTANCE.m120286h(haw.INSTANCE.m134320a().m134314u0()));
    }

    /* JADX INFO: renamed from: g */
    public final void m48369g() {
        if (bnl0.m105529O0(this)) {
            m48368f();
        }
    }

    @NotNull
    public final VText get_region_name() {
        VText vText = this._region_name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_region_name");
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
