package com.p051p1.mobile.putong.core.p058ui.aialbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VDraweeView;
import p151v.VRelative;
import p153l.bnl0;
import p153l.eg0;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes9.dex */
public class AiAlbumRenderItemView extends VRelative {

    /* JADX INFO: renamed from: d */
    public AiAlbumRenderItemView f29250d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f29251e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f29252f;

    public AiAlbumRenderItemView(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SVGAnimationView sVGAnimationView = this.f29252f;
        if (sVGAnimationView != null) {
            sVGAnimationView.stopAnimation(false);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45456p(this);
        int iM105592y0 = (bnl0.m105592y0() - qa00.f156335v) / 2;
        bnl0.m105507D0(iM105592y0, this.f29250d);
        bnl0.m105505C0(this.f29250d, (int) (iM105592y0 * 1.27f));
    }

    /* JADX INFO: renamed from: p */
    public final void m45456p(View view) {
        eg0.m120750a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public void m45457q(Integer num) {
        uqb0.f180374G.m127138Y0(this.f29251e, num.intValue());
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/886ad2d2-744b-4bb7-9613-7b20a96141df14.svga").autoPlay(true).into(this.f29252f);
    }

    public AiAlbumRenderItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AiAlbumRenderItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
