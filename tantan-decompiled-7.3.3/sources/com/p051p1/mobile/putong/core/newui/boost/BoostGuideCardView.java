package com.p051p1.mobile.putong.core.newui.boost;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.boost.BoostGuideCardView;
import com.p051p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import org.jetbrains.annotations.NotNull;
import p151v.VImage;
import p151v.VText;
import p153l.a5i0;
import p153l.bnl0;
import p153l.i4g0;
import p153l.joa;
import p153l.jyb;
import p153l.l83;
import p153l.n83;
import p153l.ric0;

/* JADX INFO: loaded from: classes11.dex */
public class BoostGuideCardView extends CardView {

    /* JADX INFO: renamed from: a */
    public BoostGuideCardView f22021a;

    /* JADX INFO: renamed from: b */
    public SVGAnimationView f22022b;

    /* JADX INFO: renamed from: c */
    public VImage f22023c;

    /* JADX INFO: renamed from: d */
    public VText f22024d;

    /* JADX INFO: renamed from: e */
    public VText f22025e;

    /* JADX INFO: renamed from: f */
    public VText f22026f;

    /* JADX INFO: renamed from: g */
    public NewNewHomeFrag f22027g;

    /* JADX INFO: renamed from: h */
    public l83 f22028h;

    /* JADX INFO: renamed from: i */
    public boolean f22029i;

    public BoostGuideCardView(@NonNull @NotNull Context context) {
        super(context);
        this.f22029i = true;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m37178b(l83 l83Var, NewNewHomeFrag newNewHomeFrag, View view) {
        i4g0.m138523u("e_boost_card", "p_suggest_users_home_view", jyb.m147494Y("direction", "like"));
        l83Var.f130409c = Boolean.TRUE;
        newNewHomeFrag.f22420C.m38128A2().mo39804A(SwipeDirection.RIGHT);
    }

    /* JADX INFO: renamed from: e */
    public final void m37179e(View view) {
        n83.m161891a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m37180f(final NewNewHomeFrag newNewHomeFrag, final l83 l83Var) {
        if (newNewHomeFrag == null || l83Var == null) {
            return;
        }
        this.f22027g = newNewHomeFrag;
        this.f22028h = l83Var;
        this.f22026f.setTypeface(Typeface.defaultFromStyle(1));
        boolean zM181583m = ric0.m181583m();
        VText vText = this.f22026f;
        if (zM181583m) {
            bnl0.m105515H0(vText, joa.m146367S3() ? "立即获取" : "立即使用");
        } else {
            bnl0.m105515H0(vText, a5i0.m96174v() ? "立即获取" : "立即使用");
        }
        if (this.f22029i) {
            this.f22029i = false;
            i4g0.m138526x("e_boost_card", "p_suggest_users_home_view");
            this.f22022b.startAnimation();
        }
        bnl0.m105509E0(this.f22026f, new View.OnClickListener() { // from class: l.m83
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoostGuideCardView.m37178b(l83Var, newNewHomeFrag, view);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m37179e(this);
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/0fdc8f64-5452-4968-85c0-79b096797fdc12.svga").autoPlay(false).into(this.f22022b);
    }

    public BoostGuideCardView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22029i = true;
    }

    public BoostGuideCardView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22029i = true;
    }
}
