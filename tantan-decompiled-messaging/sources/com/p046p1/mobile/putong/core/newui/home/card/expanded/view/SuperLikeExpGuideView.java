package com.p046p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.view.SuperLikeExpGuideView;
import com.p046p1.mobile.putong.core.p053ui.VText_Default_Bold;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import p149l.ixg0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class SuperLikeExpGuideView extends CardView {

    /* JADX INFO: renamed from: a */
    public SVGAnimationView f22666a;

    /* JADX INFO: renamed from: b */
    public SVGAnimationView f22667b;

    /* JADX INFO: renamed from: c */
    public TextView f22668c;

    /* JADX INFO: renamed from: d */
    public TextView f22669d;

    /* JADX INFO: renamed from: e */
    public VText_Default_Bold f22670e;

    /* JADX INFO: renamed from: f */
    public boolean f22671f;

    public SuperLikeExpGuideView(@NonNull Context context) {
        super(context);
        this.f22671f = false;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m38353b(View view) {
    }

    /* JADX INFO: renamed from: e */
    public final void m38354e(View view) {
        ixg0.m138848a(this, view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22671f = false;
        if (NullChecker.m81303a(this.f22666a)) {
            this.f22666a.stopAnimation(true);
        }
        if (NullChecker.m81303a(this.f22667b)) {
            this.f22667b.stopAnimation(true);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38354e(this);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.hxg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SuperLikeExpGuideView.m38353b(view);
            }
        });
    }

    public SuperLikeExpGuideView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22671f = false;
    }

    public SuperLikeExpGuideView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22671f = false;
    }
}
