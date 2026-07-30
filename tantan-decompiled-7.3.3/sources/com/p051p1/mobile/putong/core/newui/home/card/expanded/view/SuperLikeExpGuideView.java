package com.p051p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.view.SuperLikeExpGuideView;
import com.p051p1.mobile.putong.core.p058ui.VText_Default_Bold;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import p153l.bnl0;
import p153l.q5h0;

/* JADX INFO: loaded from: classes11.dex */
public class SuperLikeExpGuideView extends CardView {

    /* JADX INFO: renamed from: a */
    public SVGAnimationView f23408a;

    /* JADX INFO: renamed from: b */
    public SVGAnimationView f23409b;

    /* JADX INFO: renamed from: c */
    public TextView f23410c;

    /* JADX INFO: renamed from: d */
    public TextView f23411d;

    /* JADX INFO: renamed from: e */
    public VText_Default_Bold f23412e;

    /* JADX INFO: renamed from: f */
    public boolean f23413f;

    public SuperLikeExpGuideView(@NonNull Context context) {
        super(context);
        this.f23413f = false;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m39356b(View view) {
    }

    /* JADX INFO: renamed from: e */
    public final void m39357e(View view) {
        q5h0.m175360a(this, view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f23413f = false;
        if (NullChecker.m82486a(this.f23408a)) {
            this.f23408a.stopAnimation(true);
        }
        if (NullChecker.m82486a(this.f23409b)) {
            this.f23409b.stopAnimation(true);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39357e(this);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.p5h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SuperLikeExpGuideView.m39356b(view);
            }
        });
    }

    public SuperLikeExpGuideView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23413f = false;
    }

    public SuperLikeExpGuideView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23413f = false;
    }
}
