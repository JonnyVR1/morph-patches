package com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.p1.mobile.putong.common.R;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import l.qib0;
import l.sjx;
import l.t100;
import l.v0c0;
import l.xdl0;
import p009l.iti;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class MediaFolderItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f7637a;

    /* JADX INFO: renamed from: b */
    public ImageView f7638b;

    /* JADX INFO: renamed from: c */
    public ImageView f7639c;

    /* JADX INFO: renamed from: d */
    public TextView f7640d;

    /* JADX INFO: renamed from: e */
    public TextView f7641e;

    /* JADX INFO: renamed from: f */
    public View f7642f;

    public MediaFolderItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public static void m9311c(Media media, VDraweeView vDraweeView) {
        qib0.G.m0(vDraweeView, media.url);
    }

    /* JADX INFO: renamed from: a */
    public final void m9312a(View view) {
        sjx.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m9313b() {
        this.f7640d.setTextColor(getResources().getColor(v0c0.c));
        this.f7641e.setTextColor(getResources().getColor(v0c0.e));
        this.f7642f.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f7638b.getLayoutParams();
        layoutParams.setMargins(t100.d(40.0f), 0, 0, 0);
        layoutParams.height = t100.d(20.0f);
        layoutParams.width = t100.d(20.0f);
        this.f7638b.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: d */
    public void m9314d(iti itiVar, boolean z, MediaWrapper mediaWrapper) {
        int size = mediaWrapper.allMediasInPhoto.f19068a.size();
        Media media = size > 0 ? mediaWrapper.allMediasInPhoto.f19068a.get(0) : null;
        if (!z) {
            size = Math.max(itiVar.f14800d, itiVar.f14799c.f19068a.size());
        }
        this.f7641e.setText(String.format("%d", Integer.valueOf(size)));
        TextView textView = this.f7640d;
        if (!z) {
            textView.setText(itiVar.f14797a);
            if (itiVar.f14799c.f19068a.size() <= 0) {
                xdl0.M0(this.f7637a, false);
                return;
            }
            Media media2 = itiVar.f14799c.f19068a.get(0);
            xdl0.M0(this.f7637a, true);
            m9311c(media2, this.f7637a);
            xdl0.M0(this.f7638b, media2 instanceof Video);
            return;
        }
        textView.setText(R.string.G0);
        boolean zA = NullChecker.a(media);
        VDraweeView vDraweeView = this.f7637a;
        if (!zA) {
            xdl0.M0(vDraweeView, false);
            return;
        }
        xdl0.M0(vDraweeView, true);
        m9311c(media, this.f7637a);
        xdl0.M0(this.f7638b, media instanceof Video);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9312a(this);
    }

    public MediaFolderItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaFolderItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
