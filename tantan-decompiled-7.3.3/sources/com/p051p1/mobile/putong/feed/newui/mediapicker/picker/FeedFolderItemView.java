package com.p051p1.mobile.putong.feed.newui.mediapicker.picker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.ewi;
import p153l.uqb0;
import p153l.x4h;

/* JADX INFO: loaded from: classes13.dex */
public class FeedFolderItemView extends RelativeLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public VDraweeView f41454a;

    /* JADX INFO: renamed from: b */
    public VText f41455b;

    /* JADX INFO: renamed from: c */
    public VText f41456c;

    /* JADX INFO: renamed from: d */
    public ImageView f41457d;

    /* JADX INFO: renamed from: e */
    public MediaPickerBaseAct.InterfaceC13290a f41458e;

    /* JADX INFO: renamed from: f */
    public ewi f41459f;

    public FeedFolderItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m63851a(View view) {
        x4h.m209342a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public MediaPickerBaseAct m63852b() {
        return (MediaPickerBaseAct) getContext();
    }

    /* JADX INFO: renamed from: c */
    public void m63853c(ewi ewiVar, boolean z, int i, Media media, MediaPickerBaseAct.InterfaceC13290a interfaceC13290a) {
        int i2;
        this.f41458e = interfaceC13290a;
        this.f41459f = z ? null : ewiVar;
        boolean z2 = m63852b().f55457e == m63852b().f55456d;
        if (!z) {
            i = ewiVar.f96164d > ewiVar.f96163c.f184001a.size() ? ewiVar.f96164d : ewiVar.f96163c.f184001a.size();
        }
        if (z2) {
            i2 = i == 1 ? R$string.f39974p3 : R$string.f39967o3;
        } else {
            i2 = i == 1 ? R$string.f39960n3 : R$string.f39953m3;
        }
        this.f41456c.setText(m63852b().getResources().getString(i2, Integer.valueOf(i)));
        VText vText = this.f41455b;
        if (z) {
            vText.setText(z2 ? R$string.f39939k3 : R$string.f39932j3);
            boolean zM82486a = NullChecker.m82486a(media);
            VDraweeView vDraweeView = this.f41454a;
            if (zM82486a) {
                vDraweeView.setVisibility(0);
                uqb0.f180374G.m127150m0(this.f41454a, media.url);
            } else {
                vDraweeView.setVisibility(4);
            }
            bnl0.m105525M0(this.f41457d, m63852b().f55457e.f181619c == null);
            return;
        }
        vText.setText(ewiVar.f96161a);
        int size = ewiVar.f96163c.f184001a.size();
        VDraweeView vDraweeView2 = this.f41454a;
        if (size > 0) {
            vDraweeView2.setVisibility(0);
            uqb0.f180374G.m127150m0(this.f41454a, ewiVar.f96163c.f184001a.get(0).url);
        } else {
            vDraweeView2.setVisibility(4);
        }
        bnl0.m105525M0(this.f41457d, ewiVar.equals(m63852b().f55457e.f181619c));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f41458e.mo48975b(this.f41459f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m63851a(this);
        setOnClickListener(this);
    }

    public FeedFolderItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedFolderItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
