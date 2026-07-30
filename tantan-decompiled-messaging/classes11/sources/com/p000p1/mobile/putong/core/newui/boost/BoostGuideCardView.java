package com.p000p1.mobile.putong.core.newui.boost;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p000p1.mobile.putong.core.newui.boost.BoostGuideCardView;
import com.p000p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import l.j760;
import l.lac0;
import l.swh0;
import l.vwb;
import l.xdl0;
import l.xma;
import l.y73;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import p009l.w73;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class BoostGuideCardView extends CardView {

    /* JADX INFO: renamed from: a */
    public BoostGuideCardView f57a;

    /* JADX INFO: renamed from: b */
    public SVGAnimationView f58b;

    /* JADX INFO: renamed from: c */
    public VImage f59c;

    /* JADX INFO: renamed from: d */
    public VText f60d;

    /* JADX INFO: renamed from: e */
    public VText f61e;

    /* JADX INFO: renamed from: f */
    public VText f62f;

    /* JADX INFO: renamed from: g */
    public NewNewHomeFrag f63g;

    /* JADX INFO: renamed from: h */
    public w73 f64h;

    /* JADX INFO: renamed from: i */
    public boolean f65i;

    public BoostGuideCardView(@NonNull @NotNull Context context) {
        super(context);
        this.f65i = true;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m76b(w73 w73Var, NewNewHomeFrag newNewHomeFrag, View view) {
        zvf0.u("e_boost_card", "p_suggest_users_home_view", new j760[]{vwb.Y("direction", "like")});
        w73Var.f21930c = Boolean.TRUE;
        newNewHomeFrag.f456C.m1092A2().mo2797A(SwipeDirection.RIGHT);
    }

    /* JADX INFO: renamed from: e */
    public final void m77e(View view) {
        y73.a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m78f(final NewNewHomeFrag newNewHomeFrag, final w73 w73Var) {
        if (newNewHomeFrag == null || w73Var == null) {
            return;
        }
        this.f63g = newNewHomeFrag;
        this.f64h = w73Var;
        this.f62f.setTypeface(Typeface.defaultFromStyle(1));
        boolean zM = lac0.m();
        VText vText = this.f62f;
        if (zM) {
            xdl0.H0(vText, xma.R3() ? "立即获取" : "立即使用");
        } else {
            xdl0.H0(vText, swh0.v() ? "立即获取" : "立即使用");
        }
        if (this.f65i) {
            this.f65i = false;
            zvf0.x("e_boost_card", "p_suggest_users_home_view");
            this.f58b.startAnimation();
        }
        xdl0.E0(this.f62f, new View.OnClickListener() { // from class: l.x73
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoostGuideCardView.m76b(w73Var, newNewHomeFrag, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m77e(this);
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/0fdc8f64-5452-4968-85c0-79b096797fdc12.svga").autoPlay(false).into(this.f58b);
    }

    public BoostGuideCardView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f65i = true;
    }

    public BoostGuideCardView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f65i = true;
    }
}
