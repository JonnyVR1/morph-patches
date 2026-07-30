package com.p046p1.mobile.putong.feed.newui.mediapicker.picker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VText;
import p149l.i3h;
import p149l.iti;
import p149l.qib0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedFolderItemView extends RelativeLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public VDraweeView f40606a;

    /* JADX INFO: renamed from: b */
    public VText f40607b;

    /* JADX INFO: renamed from: c */
    public VText f40608c;

    /* JADX INFO: renamed from: d */
    public ImageView f40609d;

    /* JADX INFO: renamed from: e */
    public MediaPickerBaseAct.InterfaceC13127a f40610e;

    /* JADX INFO: renamed from: f */
    public iti f40611f;

    public FeedFolderItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m62668a(View view) {
        i3h.m134211a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public MediaPickerBaseAct m62669b() {
        return (MediaPickerBaseAct) getContext();
    }

    /* JADX INFO: renamed from: c */
    public void m62670c(iti itiVar, boolean z, int i, Media media, MediaPickerBaseAct.InterfaceC13127a interfaceC13127a) {
        int i2;
        this.f40610e = interfaceC13127a;
        this.f40611f = z ? null : itiVar;
        boolean z2 = m62669b().f54609e == m62669b().f54608d;
        if (!z) {
            i = itiVar.f114887d > itiVar.f114886c.f153135a.size() ? itiVar.f114887d : itiVar.f114886c.f153135a.size();
        }
        if (z2) {
            i2 = i == 1 ? R$string.f39126p3 : R$string.f39119o3;
        } else {
            i2 = i == 1 ? R$string.f39112n3 : R$string.f39105m3;
        }
        this.f40608c.setText(m62669b().getResources().getString(i2, Integer.valueOf(i)));
        VText vText = this.f40607b;
        if (z) {
            vText.setText(z2 ? R$string.f39091k3 : R$string.f39084j3);
            boolean zM81303a = NullChecker.m81303a(media);
            VDraweeView vDraweeView = this.f40606a;
            if (zM81303a) {
                vDraweeView.setVisibility(0);
                qib0.f154691G.m102367m0(this.f40606a, media.url);
            } else {
                vDraweeView.setVisibility(4);
            }
            xdl0.m208345M0(this.f40609d, m62669b().f54609e.f140068c == null);
            return;
        }
        vText.setText(itiVar.f114884a);
        int size = itiVar.f114886c.f153135a.size();
        VDraweeView vDraweeView2 = this.f40606a;
        if (size > 0) {
            vDraweeView2.setVisibility(0);
            qib0.f154691G.m102367m0(this.f40606a, itiVar.f114886c.f153135a.get(0).url);
        } else {
            vDraweeView2.setVisibility(4);
        }
        xdl0.m208345M0(this.f40609d, itiVar.equals(m62669b().f54609e.f140068c));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f40610e.mo47792b(this.f40611f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m62668a(this);
        setOnClickListener(this);
    }

    public FeedFolderItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedFolderItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
