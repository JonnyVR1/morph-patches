package com.p051p1.mobile.putong.core.p058ui.profile.profilelist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import java.util.List;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p153l.bnl0;
import p153l.jyb;
import p153l.kl70;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes4.dex */
public class PicPostDlgView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VDraweeView f34452a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f34453b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f34454c;

    /* JADX INFO: renamed from: d */
    public VImage f34455d;

    public PicPostDlgView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m53005p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m53005p(View view) {
        kl70.m150354a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m53006s(List<Media> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        if (list.size() == 1) {
            m53008v(list.get(0));
        } else if (list.size() == 2) {
            m53010z(list.get(0), list.get(1));
        } else {
            m53009w(list.get(0), list.get(1), list.get(2));
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m53007u(VDraweeView vDraweeView, Media media) {
        if (media instanceof Picture) {
            uqb0.f180374G.m127111J0(vDraweeView, ((Picture) media).profileSmall(), false);
        } else if (media instanceof Video) {
            uqb0.f180374G.m127111J0(vDraweeView, media.cover().profileSmall(), false);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m53008v(Media media) {
        this.f34452a.setVisibility(8);
        this.f34453b.setVisibility(8);
        m53007u(this.f34454c, media);
    }

    /* JADX INFO: renamed from: w */
    public final void m53009w(Media media, Media media2, Media media3) {
        this.f34452a.setVisibility(0);
        this.f34453b.setVisibility(0);
        bnl0.m105538V(this.f34454c, qa00.m175859d(-20.0f));
        bnl0.m105537U(this.f34454c, qa00.m175859d(4.0f));
        bnl0.m105538V(this.f34453b, qa00.m175859d(-7.0f));
        bnl0.m105537U(this.f34453b, qa00.m175859d(20.0f));
        bnl0.m105538V(this.f34452a, qa00.m175859d(18.0f));
        bnl0.m105537U(this.f34452a, qa00.m175859d(8.0f));
        bnl0.m105538V(this.f34455d, qa00.m175859d(34.0f));
        this.f34454c.setRotation(-4.0f);
        this.f34453b.setRotation(3.0f);
        this.f34452a.setRotation(8.0f);
        m53007u(this.f34454c, media);
        m53007u(this.f34453b, media2);
        m53007u(this.f34452a, media3);
    }

    /* JADX INFO: renamed from: z */
    public final void m53010z(Media media, Media media2) {
        this.f34452a.setVisibility(8);
        this.f34453b.setVisibility(0);
        bnl0.m105538V(this.f34454c, qa00.m175859d(-10.0f));
        bnl0.m105537U(this.f34454c, qa00.m175859d(4.0f));
        bnl0.m105538V(this.f34453b, qa00.m175859d(28.0f));
        bnl0.m105537U(this.f34453b, qa00.m175859d(8.0f));
        this.f34454c.setRotation(-4.0f);
        this.f34453b.setRotation(8.0f);
        m53007u(this.f34454c, media);
        m53007u(this.f34453b, media2);
    }

    public PicPostDlgView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PicPostDlgView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
