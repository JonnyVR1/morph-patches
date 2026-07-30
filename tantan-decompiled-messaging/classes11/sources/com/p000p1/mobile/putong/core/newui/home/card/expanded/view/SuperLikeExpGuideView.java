package com.p000p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.view.SuperLikeExpGuideView;
import com.p1.mobile.putong.core.ui.VText_Default_Bold;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import l.ixg0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class SuperLikeExpGuideView extends CardView {

    /* JADX INFO: renamed from: a */
    public SVGAnimationView f1444a;

    /* JADX INFO: renamed from: b */
    public SVGAnimationView f1445b;

    /* JADX INFO: renamed from: c */
    public TextView f1446c;

    /* JADX INFO: renamed from: d */
    public TextView f1447d;

    /* JADX INFO: renamed from: e */
    public VText_Default_Bold f1448e;

    /* JADX INFO: renamed from: f */
    public boolean f1449f;

    public SuperLikeExpGuideView(@NonNull Context context) {
        super(context);
        this.f1449f = false;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m2331b(View view) {
    }

    /* JADX INFO: renamed from: e */
    public final void m2332e(View view) {
        ixg0.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        this.f1449f = false;
        if (NullChecker.a(this.f1444a)) {
            this.f1444a.stopAnimation(true);
        }
        if (NullChecker.a(this.f1445b)) {
            this.f1445b.stopAnimation(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2332e(this);
        xdl0.E0(this, new View.OnClickListener() { // from class: l.hxg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SuperLikeExpGuideView.m2331b(view);
            }
        });
    }

    public SuperLikeExpGuideView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1449f = false;
    }

    public SuperLikeExpGuideView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1449f = false;
    }
}
