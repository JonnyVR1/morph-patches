package com.p046p1.mobile.putong.core.p053ui.mediapicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VText;
import p149l.iti;
import p149l.oti;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class FolderItemView extends RelativeLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public VDraweeView f30610a;

    /* JADX INFO: renamed from: b */
    public VText f30611b;

    /* JADX INFO: renamed from: c */
    public VText f30612c;

    /* JADX INFO: renamed from: d */
    public ImageView f30613d;

    /* JADX INFO: renamed from: e */
    public MediaPickerBaseAct.InterfaceC13127a f30614e;

    /* JADX INFO: renamed from: f */
    public iti f30615f;

    public FolderItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m47770a(View view) {
        oti.m165945a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public MediaPickerBaseAct m47771b() {
        return (MediaPickerBaseAct) getContext();
    }

    /* JADX INFO: renamed from: c */
    public void m47772c(iti itiVar, boolean z, int i, Media media, MediaPickerBaseAct.InterfaceC13127a interfaceC13127a) {
        int i2;
        this.f30614e = interfaceC13127a;
        this.f30615f = z ? null : itiVar;
        boolean z2 = m47771b().f54609e == m47771b().f54608d;
        if (!z) {
            i = itiVar.f114887d > itiVar.f114886c.f153135a.size() ? itiVar.f114887d : itiVar.f114886c.f153135a.size();
        }
        if (z2) {
            i2 = i == 1 ? R$string.f18244Wh : R$string.f18214Vh;
        } else {
            i2 = i == 1 ? R$string.f18094Rh : R$string.f18064Qh;
        }
        this.f30612c.setText(m47771b().getResources().getString(i2, Integer.valueOf(i)));
        VText vText = this.f30611b;
        if (z) {
            vText.setText(z2 ? R$string.f18004Oh : R$string.f17974Nh);
            boolean zM81303a = NullChecker.m81303a(media);
            VDraweeView vDraweeView = this.f30610a;
            if (zM81303a) {
                vDraweeView.setVisibility(0);
                MediaItemView.m47774e(media, this.f30610a);
            } else {
                vDraweeView.setVisibility(4);
            }
            xdl0.m208345M0(this.f30613d, m47771b().f54609e.f140068c == null);
            return;
        }
        vText.setText(itiVar.f114884a);
        int size = itiVar.f114886c.f153135a.size();
        VDraweeView vDraweeView2 = this.f30610a;
        if (size > 0) {
            vDraweeView2.setVisibility(0);
            MediaItemView.m47774e(itiVar.f114886c.f153135a.get(0), this.f30610a);
        } else {
            vDraweeView2.setVisibility(4);
        }
        xdl0.m208345M0(this.f30613d, itiVar.equals(m47771b().f54609e.f140068c));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f30614e.mo47792b(this.f30615f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47770a(this);
        setOnClickListener(this);
    }

    public FolderItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FolderItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
