package com.p046p1.mobile.putong.account.p050ui.mediapicker.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.p050ui.mediapicker.AccountMediaPickerBaseAct;
import com.p046p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VText;
import p149l.C16653ep;
import p149l.iti;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class AccountFolderItemView extends RelativeLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public VDraweeView f17000a;

    /* JADX INFO: renamed from: b */
    public VText f17001b;

    /* JADX INFO: renamed from: c */
    public VText f17002c;

    /* JADX INFO: renamed from: d */
    public ImageView f17003d;

    /* JADX INFO: renamed from: e */
    public AccountMediaPickerBaseAct.InterfaceC4671a f17004e;

    /* JADX INFO: renamed from: f */
    public iti f17005f;

    public AccountFolderItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m29169a(View view) {
        C16653ep.m117524a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public AccountMediaPickerBaseAct m29170b() {
        return (AccountMediaPickerBaseAct) getContext();
    }

    /* JADX INFO: renamed from: c */
    public void m29171c(iti itiVar, boolean z, int i, Media media, AccountMediaPickerBaseAct.InterfaceC4671a interfaceC4671a) {
        int i2;
        this.f17004e = interfaceC4671a;
        this.f17005f = z ? null : itiVar;
        boolean z2 = m29170b().f16997e == m29170b().f16996d;
        if (!z) {
            i = itiVar.f114887d > itiVar.f114886c.f153135a.size() ? itiVar.f114887d : itiVar.f114886c.f153135a.size();
        }
        if (z2) {
            i2 = i == 1 ? R$string.f16045A2 : R$string.f16315z2;
        } else {
            i2 = i == 1 ? R$string.f16295v2 : R$string.f16290u2;
        }
        this.f17002c.setText(m29170b().getResources().getString(i2, Integer.valueOf(i)));
        VText vText = this.f17001b;
        if (z) {
            vText.setText(z2 ? R$string.f16285t2 : R$string.f16280s2);
            boolean zM81303a = NullChecker.m81303a(media);
            VDraweeView vDraweeView = this.f17000a;
            if (zM81303a) {
                vDraweeView.setVisibility(0);
                AccountMediaItemView.m29173e(media, this.f17000a);
            } else {
                vDraweeView.setVisibility(4);
            }
            xdl0.m208345M0(this.f17003d, m29170b().f16997e.f140068c == null);
            return;
        }
        vText.setText(itiVar.f114884a);
        int size = itiVar.f114886c.f153135a.size();
        VDraweeView vDraweeView2 = this.f17000a;
        if (size > 0) {
            vDraweeView2.setVisibility(0);
            AccountMediaItemView.m29173e(itiVar.f114886c.f153135a.get(0), this.f17000a);
        } else {
            vDraweeView2.setVisibility(4);
        }
        xdl0.m208345M0(this.f17003d, itiVar.equals(m29170b().f16997e.f140068c));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f17004e.mo29168b(this.f17005f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m29169a(this);
        setOnClickListener(this);
    }

    public AccountFolderItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AccountFolderItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
