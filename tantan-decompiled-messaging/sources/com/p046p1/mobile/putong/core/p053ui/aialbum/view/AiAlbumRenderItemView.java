package com.p046p1.mobile.putong.core.p053ui.aialbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VDraweeView;
import p147v.VRelative;
import p149l.ig0;
import p149l.qib0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class AiAlbumRenderItemView extends VRelative {

    /* JADX INFO: renamed from: d */
    public AiAlbumRenderItemView f28402d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f28403e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f28404f;

    public AiAlbumRenderItemView(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SVGAnimationView sVGAnimationView = this.f28404f;
        if (sVGAnimationView != null) {
            sVGAnimationView.stopAnimation(false);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44273p(this);
        int iM208412y0 = (xdl0.m208412y0() - t100.f167273v) / 2;
        xdl0.m208327D0(iM208412y0, this.f28402d);
        xdl0.m208325C0(this.f28402d, (int) (iM208412y0 * 1.27f));
    }

    /* JADX INFO: renamed from: p */
    public final void m44273p(View view) {
        ig0.m135963a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public void m44274q(Integer num) {
        qib0.f154691G.m102354Y0(this.f28403e, num.intValue());
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/886ad2d2-744b-4bb7-9613-7b20a96141df14.svga").autoPlay(true).into(this.f28404f);
    }

    public AiAlbumRenderItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AiAlbumRenderItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
