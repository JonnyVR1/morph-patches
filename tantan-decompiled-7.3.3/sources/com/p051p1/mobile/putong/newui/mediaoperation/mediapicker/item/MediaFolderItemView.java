package com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.common.R$string;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p153l.b9c0;
import p153l.bnl0;
import p153l.ewi;
import p153l.psx;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes10.dex */
public class MediaFolderItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f54879a;

    /* JADX INFO: renamed from: b */
    public ImageView f54880b;

    /* JADX INFO: renamed from: c */
    public ImageView f54881c;

    /* JADX INFO: renamed from: d */
    public TextView f54882d;

    /* JADX INFO: renamed from: e */
    public TextView f54883e;

    /* JADX INFO: renamed from: f */
    public View f54884f;

    public MediaFolderItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public static void m80186c(Media media, VDraweeView vDraweeView) {
        uqb0.f180374G.m127150m0(vDraweeView, media.url);
    }

    /* JADX INFO: renamed from: a */
    public final void m80187a(View view) {
        psx.m173698a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m80188b() {
        this.f54882d.setTextColor(getResources().getColor(b9c0.f75557c));
        this.f54883e.setTextColor(getResources().getColor(b9c0.f75559e));
        this.f54884f.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f54880b.getLayoutParams();
        layoutParams.setMargins(qa00.m175859d(40.0f), 0, 0, 0);
        layoutParams.height = qa00.m175859d(20.0f);
        layoutParams.width = qa00.m175859d(20.0f);
        this.f54880b.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: d */
    public void m80189d(ewi ewiVar, boolean z, MediaWrapper mediaWrapper) {
        int size = mediaWrapper.allMediasInPhoto.f184001a.size();
        Media media = size > 0 ? mediaWrapper.allMediasInPhoto.f184001a.get(0) : null;
        if (!z) {
            size = Math.max(ewiVar.f96164d, ewiVar.f96163c.f184001a.size());
        }
        this.f54883e.setText(String.format("%d", Integer.valueOf(size)));
        TextView textView = this.f54882d;
        if (!z) {
            textView.setText(ewiVar.f96161a);
            if (ewiVar.f96163c.f184001a.size() <= 0) {
                bnl0.m105525M0(this.f54879a, false);
                return;
            }
            Media media2 = ewiVar.f96163c.f184001a.get(0);
            bnl0.m105525M0(this.f54879a, true);
            m80186c(media2, this.f54879a);
            bnl0.m105525M0(this.f54880b, media2 instanceof Video);
            return;
        }
        textView.setText(R$string.f18045G0);
        boolean zM82486a = NullChecker.m82486a(media);
        VDraweeView vDraweeView = this.f54879a;
        if (!zM82486a) {
            bnl0.m105525M0(vDraweeView, false);
            return;
        }
        bnl0.m105525M0(vDraweeView, true);
        m80186c(media, this.f54879a);
        bnl0.m105525M0(this.f54880b, media instanceof Video);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m80187a(this);
    }

    public MediaFolderItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaFolderItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
