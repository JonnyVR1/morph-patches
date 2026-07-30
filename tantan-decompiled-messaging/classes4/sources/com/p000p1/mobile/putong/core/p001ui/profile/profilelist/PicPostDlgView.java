package com.p000p1.mobile.putong.core.p001ui.profile.profilelist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Video;
import java.util.List;
import l.ed70;
import l.qib0;
import l.t100;
import l.vwb;
import l.xdl0;
import v.VDraweeView;
import v.VFrame;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class PicPostDlgView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VDraweeView f1426a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f1427b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f1428c;

    /* JADX INFO: renamed from: d */
    public VImage f1429d;

    public PicPostDlgView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2350p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m2350p(View view) {
        ed70.a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m2351s(List<Media> list) {
        if (vwb.J(list)) {
            return;
        }
        if (list.size() == 1) {
            m2353v(list.get(0));
        } else if (list.size() == 2) {
            m2355z(list.get(0), list.get(1));
        } else {
            m2354w(list.get(0), list.get(1), list.get(2));
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m2352u(VDraweeView vDraweeView, Media media) {
        if (media instanceof Picture) {
            qib0.G.J0(vDraweeView, ((Picture) media).profileSmall(), false);
        } else if (media instanceof Video) {
            qib0.G.J0(vDraweeView, media.cover().profileSmall(), false);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m2353v(Media media) {
        this.f1426a.setVisibility(8);
        this.f1427b.setVisibility(8);
        m2352u(this.f1428c, media);
    }

    /* JADX INFO: renamed from: w */
    public final void m2354w(Media media, Media media2, Media media3) {
        this.f1426a.setVisibility(0);
        this.f1427b.setVisibility(0);
        xdl0.V(this.f1428c, t100.d(-20.0f));
        xdl0.U(this.f1428c, t100.d(4.0f));
        xdl0.V(this.f1427b, t100.d(-7.0f));
        xdl0.U(this.f1427b, t100.d(20.0f));
        xdl0.V(this.f1426a, t100.d(18.0f));
        xdl0.U(this.f1426a, t100.d(8.0f));
        xdl0.V(this.f1429d, t100.d(34.0f));
        this.f1428c.setRotation(-4.0f);
        this.f1427b.setRotation(3.0f);
        this.f1426a.setRotation(8.0f);
        m2352u(this.f1428c, media);
        m2352u(this.f1427b, media2);
        m2352u(this.f1426a, media3);
    }

    /* JADX INFO: renamed from: z */
    public final void m2355z(Media media, Media media2) {
        this.f1426a.setVisibility(8);
        this.f1427b.setVisibility(0);
        xdl0.V(this.f1428c, t100.d(-10.0f));
        xdl0.U(this.f1428c, t100.d(4.0f));
        xdl0.V(this.f1427b, t100.d(28.0f));
        xdl0.U(this.f1427b, t100.d(8.0f));
        this.f1428c.setRotation(-4.0f);
        this.f1427b.setRotation(8.0f);
        m2352u(this.f1428c, media);
        m2352u(this.f1427b, media2);
    }

    public PicPostDlgView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PicPostDlgView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
