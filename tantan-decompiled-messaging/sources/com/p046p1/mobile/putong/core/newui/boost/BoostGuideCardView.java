package com.p046p1.mobile.putong.core.newui.boost;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.boost.BoostGuideCardView;
import com.p046p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import org.jetbrains.annotations.NotNull;
import p147v.VImage;
import p147v.VText;
import p149l.lac0;
import p149l.swh0;
import p149l.vwb;
import p149l.w73;
import p149l.xdl0;
import p149l.xma;
import p149l.y73;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class BoostGuideCardView extends CardView {

    /* JADX INFO: renamed from: a */
    public BoostGuideCardView f21279a;

    /* JADX INFO: renamed from: b */
    public SVGAnimationView f21280b;

    /* JADX INFO: renamed from: c */
    public VImage f21281c;

    /* JADX INFO: renamed from: d */
    public VText f21282d;

    /* JADX INFO: renamed from: e */
    public VText f21283e;

    /* JADX INFO: renamed from: f */
    public VText f21284f;

    /* JADX INFO: renamed from: g */
    public NewNewHomeFrag f21285g;

    /* JADX INFO: renamed from: h */
    public w73 f21286h;

    /* JADX INFO: renamed from: i */
    public boolean f21287i;

    public BoostGuideCardView(@NonNull @NotNull Context context) {
        super(context);
        this.f21287i = true;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m36175b(w73 w73Var, NewNewHomeFrag newNewHomeFrag, View view) {
        zvf0.m220399u("e_boost_card", "p_suggest_users_home_view", vwb.m200311Y("direction", "like"));
        w73Var.f185019c = Boolean.TRUE;
        newNewHomeFrag.f21678C.m37125A2().mo38801A(SwipeDirection.RIGHT);
    }

    /* JADX INFO: renamed from: e */
    public final void m36176e(View view) {
        y73.m213283a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m36177f(final NewNewHomeFrag newNewHomeFrag, final w73 w73Var) {
        if (newNewHomeFrag == null || w73Var == null) {
            return;
        }
        this.f21285g = newNewHomeFrag;
        this.f21286h = w73Var;
        this.f21284f.setTypeface(Typeface.defaultFromStyle(1));
        boolean zM149136m = lac0.m149136m();
        VText vText = this.f21284f;
        if (zM149136m) {
            xdl0.m208335H0(vText, xma.m210053R3() ? "立即获取" : "立即使用");
        } else {
            xdl0.m208335H0(vText, swh0.m186269v() ? "立即获取" : "立即使用");
        }
        if (this.f21287i) {
            this.f21287i = false;
            zvf0.m220402x("e_boost_card", "p_suggest_users_home_view");
            this.f21280b.startAnimation();
        }
        xdl0.m208329E0(this.f21284f, new View.OnClickListener() { // from class: l.x73
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoostGuideCardView.m36175b(w73Var, newNewHomeFrag, view);
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
        m36176e(this);
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/0fdc8f64-5452-4968-85c0-79b096797fdc12.svga").autoPlay(false).into(this.f21280b);
    }

    public BoostGuideCardView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21287i = true;
    }

    public BoostGuideCardView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21287i = true;
    }
}
