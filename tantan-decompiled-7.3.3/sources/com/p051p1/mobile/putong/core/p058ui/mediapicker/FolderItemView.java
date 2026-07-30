package com.p051p1.mobile.putong.core.p058ui.mediapicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.ewi;
import p153l.kwi;

/* JADX INFO: loaded from: classes3.dex */
public class FolderItemView extends RelativeLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public VDraweeView f31458a;

    /* JADX INFO: renamed from: b */
    public VText f31459b;

    /* JADX INFO: renamed from: c */
    public VText f31460c;

    /* JADX INFO: renamed from: d */
    public ImageView f31461d;

    /* JADX INFO: renamed from: e */
    public MediaPickerBaseAct.InterfaceC13290a f31462e;

    /* JADX INFO: renamed from: f */
    public ewi f31463f;

    public FolderItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m48953a(View view) {
        kwi.m151700a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public MediaPickerBaseAct m48954b() {
        return (MediaPickerBaseAct) getContext();
    }

    /* JADX INFO: renamed from: c */
    public void m48955c(ewi ewiVar, boolean z, int i, Media media, MediaPickerBaseAct.InterfaceC13290a interfaceC13290a) {
        int i2;
        this.f31462e = interfaceC13290a;
        this.f31463f = z ? null : ewiVar;
        boolean z2 = m48954b().f55457e == m48954b().f55456d;
        if (!z) {
            i = ewiVar.f96164d > ewiVar.f96163c.f184001a.size() ? ewiVar.f96164d : ewiVar.f96163c.f184001a.size();
        }
        if (z2) {
            i2 = i == 1 ? R$string.f19619ri : R$string.f19588qi;
        } else {
            i2 = i == 1 ? R$string.f19464mi : R$string.f19433li;
        }
        this.f31460c.setText(m48954b().getResources().getString(i2, Integer.valueOf(i)));
        VText vText = this.f31459b;
        if (z) {
            vText.setText(z2 ? R$string.f19371ji : R$string.f19341ii);
            boolean zM82486a = NullChecker.m82486a(media);
            VDraweeView vDraweeView = this.f31458a;
            if (zM82486a) {
                vDraweeView.setVisibility(0);
                MediaItemView.m48957e(media, this.f31458a);
            } else {
                vDraweeView.setVisibility(4);
            }
            bnl0.m105525M0(this.f31461d, m48954b().f55457e.f181619c == null);
            return;
        }
        vText.setText(ewiVar.f96161a);
        int size = ewiVar.f96163c.f184001a.size();
        VDraweeView vDraweeView2 = this.f31458a;
        if (size > 0) {
            vDraweeView2.setVisibility(0);
            MediaItemView.m48957e(ewiVar.f96163c.f184001a.get(0), this.f31458a);
        } else {
            vDraweeView2.setVisibility(4);
        }
        bnl0.m105525M0(this.f31461d, ewiVar.equals(m48954b().f55457e.f181619c));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f31462e.mo48975b(this.f31463f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48953a(this);
        setOnClickListener(this);
    }

    public FolderItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FolderItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
