package com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.common.R$string;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p149l.iti;
import p149l.qib0;
import p149l.sjx;
import p149l.t100;
import p149l.v0c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class MediaFolderItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f54031a;

    /* JADX INFO: renamed from: b */
    public ImageView f54032b;

    /* JADX INFO: renamed from: c */
    public ImageView f54033c;

    /* JADX INFO: renamed from: d */
    public TextView f54034d;

    /* JADX INFO: renamed from: e */
    public TextView f54035e;

    /* JADX INFO: renamed from: f */
    public View f54036f;

    public MediaFolderItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public static void m79003c(Media media, VDraweeView vDraweeView) {
        qib0.f154691G.m102367m0(vDraweeView, media.url);
    }

    /* JADX INFO: renamed from: a */
    public final void m79004a(View view) {
        sjx.m184565a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m79005b() {
        this.f54034d.setTextColor(getResources().getColor(v0c0.f179096c));
        this.f54035e.setTextColor(getResources().getColor(v0c0.f179098e));
        this.f54036f.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f54032b.getLayoutParams();
        layoutParams.setMargins(t100.m186890d(40.0f), 0, 0, 0);
        layoutParams.height = t100.m186890d(20.0f);
        layoutParams.width = t100.m186890d(20.0f);
        this.f54032b.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: d */
    public void m79006d(iti itiVar, boolean z, MediaWrapper mediaWrapper) {
        int size = mediaWrapper.allMediasInPhoto.f153135a.size();
        Media media = size > 0 ? mediaWrapper.allMediasInPhoto.f153135a.get(0) : null;
        if (!z) {
            size = Math.max(itiVar.f114887d, itiVar.f114886c.f153135a.size());
        }
        this.f54035e.setText(String.format("%d", Integer.valueOf(size)));
        TextView textView = this.f54034d;
        if (!z) {
            textView.setText(itiVar.f114884a);
            if (itiVar.f114886c.f153135a.size() <= 0) {
                xdl0.m208345M0(this.f54031a, false);
                return;
            }
            Media media2 = itiVar.f114886c.f153135a.get(0);
            xdl0.m208345M0(this.f54031a, true);
            m79003c(media2, this.f54031a);
            xdl0.m208345M0(this.f54032b, media2 instanceof Video);
            return;
        }
        textView.setText(R$string.f17326G0);
        boolean zM81303a = NullChecker.m81303a(media);
        VDraweeView vDraweeView = this.f54031a;
        if (!zM81303a) {
            xdl0.m208345M0(vDraweeView, false);
            return;
        }
        xdl0.m208345M0(vDraweeView, true);
        m79003c(media, this.f54031a);
        xdl0.m208345M0(this.f54032b, media instanceof Video);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79004a(this);
    }

    public MediaFolderItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaFolderItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
