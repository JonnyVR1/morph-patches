package com.p000p1.mobile.putong.feed.newui.mediapicker.picker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.feed.R$string;
import com.p1.mobile.putong.ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.NullChecker;
import l.iti;
import l.qib0;
import l.xdl0;
import p007l.i3h;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedFolderItemView extends RelativeLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public VDraweeView f2067a;

    /* JADX INFO: renamed from: b */
    public VText f2068b;

    /* JADX INFO: renamed from: c */
    public VText f2069c;

    /* JADX INFO: renamed from: d */
    public ImageView f2070d;

    /* JADX INFO: renamed from: e */
    public MediaPickerBaseAct.a f2071e;

    /* JADX INFO: renamed from: f */
    public iti f2072f;

    public FeedFolderItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m3673a(View view) {
        i3h.m10773a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public MediaPickerBaseAct m3674b() {
        return getContext();
    }

    /* JADX INFO: renamed from: c */
    public void m3675c(iti itiVar, boolean z, int i, Media media, MediaPickerBaseAct.a aVar) {
        int i2;
        this.f2071e = aVar;
        this.f2072f = z ? null : itiVar;
        boolean z2 = m3674b().e == m3674b().d;
        if (!z) {
            i = itiVar.d > itiVar.c.a.size() ? itiVar.d : itiVar.c.a.size();
        }
        if (z2) {
            i2 = i == 1 ? R$string.f587p3 : R$string.f580o3;
        } else {
            i2 = i == 1 ? R$string.f573n3 : R$string.f566m3;
        }
        this.f2069c.setText(m3674b().getResources().getString(i2, Integer.valueOf(i)));
        VText vText = this.f2068b;
        if (z) {
            vText.setText(z2 ? R$string.f552k3 : R$string.f545j3);
            boolean zA = NullChecker.a(media);
            VDraweeView vDraweeView = this.f2067a;
            if (zA) {
                vDraweeView.setVisibility(0);
                qib0.G.m0(this.f2067a, media.url);
            } else {
                vDraweeView.setVisibility(4);
            }
            xdl0.M0(this.f2070d, m3674b().e.c == null);
            return;
        }
        vText.setText(itiVar.a);
        int size = itiVar.c.a.size();
        VDraweeView vDraweeView2 = this.f2067a;
        if (size > 0) {
            vDraweeView2.setVisibility(0);
            qib0.G.m0(this.f2067a, ((Media) itiVar.c.a.get(0)).url);
        } else {
            vDraweeView2.setVisibility(4);
        }
        xdl0.M0(this.f2070d, itiVar.equals(m3674b().e.c));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f2071e.b(this.f2072f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m3673a(this);
        setOnClickListener(this);
    }

    public FeedFolderItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedFolderItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
