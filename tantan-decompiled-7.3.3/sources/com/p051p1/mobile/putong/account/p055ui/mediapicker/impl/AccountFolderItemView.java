package com.p051p1.mobile.putong.account.p055ui.mediapicker.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.p055ui.mediapicker.AccountMediaPickerBaseAct;
import com.p051p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VText;
import p153l.C21843zo;
import p153l.bnl0;
import p153l.ewi;

/* JADX INFO: loaded from: classes9.dex */
public class AccountFolderItemView extends RelativeLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public VDraweeView f17719a;

    /* JADX INFO: renamed from: b */
    public VText f17720b;

    /* JADX INFO: renamed from: c */
    public VText f17721c;

    /* JADX INFO: renamed from: d */
    public ImageView f17722d;

    /* JADX INFO: renamed from: e */
    public AccountMediaPickerBaseAct.InterfaceC4822a f17723e;

    /* JADX INFO: renamed from: f */
    public ewi f17724f;

    public AccountFolderItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m30167a(View view) {
        C21843zo.m220686a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public AccountMediaPickerBaseAct m30168b() {
        return (AccountMediaPickerBaseAct) getContext();
    }

    /* JADX INFO: renamed from: c */
    public void m30169c(ewi ewiVar, boolean z, int i, Media media, AccountMediaPickerBaseAct.InterfaceC4822a interfaceC4822a) {
        int i2;
        this.f17723e = interfaceC4822a;
        this.f17724f = z ? null : ewiVar;
        boolean z2 = m30168b().f17716e == m30168b().f17715d;
        if (!z) {
            i = ewiVar.f96164d > ewiVar.f96163c.f184001a.size() ? ewiVar.f96164d : ewiVar.f96163c.f184001a.size();
        }
        if (z2) {
            i2 = i == 1 ? R$string.f16764A2 : R$string.f17034z2;
        } else {
            i2 = i == 1 ? R$string.f17014v2 : R$string.f17009u2;
        }
        this.f17721c.setText(m30168b().getResources().getString(i2, Integer.valueOf(i)));
        VText vText = this.f17720b;
        if (z) {
            vText.setText(z2 ? R$string.f17004t2 : R$string.f16999s2);
            boolean zM82486a = NullChecker.m82486a(media);
            VDraweeView vDraweeView = this.f17719a;
            if (zM82486a) {
                vDraweeView.setVisibility(0);
                AccountMediaItemView.m30171e(media, this.f17719a);
            } else {
                vDraweeView.setVisibility(4);
            }
            bnl0.m105525M0(this.f17722d, m30168b().f17716e.f181619c == null);
            return;
        }
        vText.setText(ewiVar.f96161a);
        int size = ewiVar.f96163c.f184001a.size();
        VDraweeView vDraweeView2 = this.f17719a;
        if (size > 0) {
            vDraweeView2.setVisibility(0);
            AccountMediaItemView.m30171e(ewiVar.f96163c.f184001a.get(0), this.f17719a);
        } else {
            vDraweeView2.setVisibility(4);
        }
        bnl0.m105525M0(this.f17722d, ewiVar.equals(m30168b().f17716e.f181619c));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f17723e.mo30166b(this.f17724f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m30167a(this);
        setOnClickListener(this);
    }

    public AccountFolderItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AccountFolderItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
