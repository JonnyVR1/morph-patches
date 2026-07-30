package com.p046p1.mobile.putong.core.p053ui.profile.profilelist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import java.util.List;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p149l.ed70;
import p149l.qib0;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class PicPostDlgView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VDraweeView f33604a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f33605b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f33606c;

    /* JADX INFO: renamed from: d */
    public VImage f33607d;

    public PicPostDlgView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m51822p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m51822p(View view) {
        ed70.m115788a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m51823s(List<Media> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        if (list.size() == 1) {
            m51825v(list.get(0));
        } else if (list.size() == 2) {
            m51827z(list.get(0), list.get(1));
        } else {
            m51826w(list.get(0), list.get(1), list.get(2));
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m51824u(VDraweeView vDraweeView, Media media) {
        if (media instanceof Picture) {
            qib0.f154691G.m102327J0(vDraweeView, ((Picture) media).profileSmall(), false);
        } else if (media instanceof Video) {
            qib0.f154691G.m102327J0(vDraweeView, media.cover().profileSmall(), false);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m51825v(Media media) {
        this.f33604a.setVisibility(8);
        this.f33605b.setVisibility(8);
        m51824u(this.f33606c, media);
    }

    /* JADX INFO: renamed from: w */
    public final void m51826w(Media media, Media media2, Media media3) {
        this.f33604a.setVisibility(0);
        this.f33605b.setVisibility(0);
        xdl0.m208358V(this.f33606c, t100.m186890d(-20.0f));
        xdl0.m208357U(this.f33606c, t100.m186890d(4.0f));
        xdl0.m208358V(this.f33605b, t100.m186890d(-7.0f));
        xdl0.m208357U(this.f33605b, t100.m186890d(20.0f));
        xdl0.m208358V(this.f33604a, t100.m186890d(18.0f));
        xdl0.m208357U(this.f33604a, t100.m186890d(8.0f));
        xdl0.m208358V(this.f33607d, t100.m186890d(34.0f));
        this.f33606c.setRotation(-4.0f);
        this.f33605b.setRotation(3.0f);
        this.f33604a.setRotation(8.0f);
        m51824u(this.f33606c, media);
        m51824u(this.f33605b, media2);
        m51824u(this.f33604a, media3);
    }

    /* JADX INFO: renamed from: z */
    public final void m51827z(Media media, Media media2) {
        this.f33604a.setVisibility(8);
        this.f33605b.setVisibility(0);
        xdl0.m208358V(this.f33606c, t100.m186890d(-10.0f));
        xdl0.m208357U(this.f33606c, t100.m186890d(4.0f));
        xdl0.m208358V(this.f33605b, t100.m186890d(28.0f));
        xdl0.m208357U(this.f33605b, t100.m186890d(8.0f));
        this.f33606c.setRotation(-4.0f);
        this.f33605b.setRotation(8.0f);
        m51824u(this.f33606c, media);
        m51824u(this.f33605b, media2);
    }

    public PicPostDlgView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PicPostDlgView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
