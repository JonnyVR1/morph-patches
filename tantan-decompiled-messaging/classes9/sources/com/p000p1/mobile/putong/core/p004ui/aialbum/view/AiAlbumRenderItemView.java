package com.p000p1.mobile.putong.core.p004ui.aialbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import l.ig0;
import l.t100;
import l.xdl0;
import p006l.qib0;
import v.VDraweeView;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AiAlbumRenderItemView extends VRelative {

    /* JADX INFO: renamed from: d */
    public AiAlbumRenderItemView f4469d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f4470e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f4471f;

    public AiAlbumRenderItemView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        SVGAnimationView sVGAnimationView = this.f4471f;
        if (sVGAnimationView != null) {
            sVGAnimationView.stopAnimation(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7229p(this);
        int iY0 = (xdl0.y0() - t100.v) / 2;
        xdl0.D0(iY0, new View[]{this.f4469d});
        xdl0.C0(this.f4469d, (int) (iY0 * 1.27f));
    }

    /* JADX INFO: renamed from: p */
    public final void m7229p(View view) {
        ig0.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public void m7230q(Integer num) {
        qib0.f19782G.m12767Y0(this.f4470e, num.intValue());
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/886ad2d2-744b-4bb7-9613-7b20a96141df14.svga").autoPlay(true).into(this.f4471f);
    }

    public AiAlbumRenderItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AiAlbumRenderItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
