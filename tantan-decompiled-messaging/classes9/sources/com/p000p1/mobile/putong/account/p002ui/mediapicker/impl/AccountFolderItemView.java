package com.p000p1.mobile.putong.account.p002ui.mediapicker.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.p002ui.mediapicker.AccountMediaPickerBaseAct;
import com.p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import l.iti;
import l.xdl0;
import p006l.C0683ep;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AccountFolderItemView extends RelativeLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public VDraweeView f989a;

    /* JADX INFO: renamed from: b */
    public VText f990b;

    /* JADX INFO: renamed from: c */
    public VText f991c;

    /* JADX INFO: renamed from: d */
    public ImageView f992d;

    /* JADX INFO: renamed from: e */
    public AccountMediaPickerBaseAct.InterfaceC0097a f993e;

    /* JADX INFO: renamed from: f */
    public iti f994f;

    public AccountFolderItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m1075a(View view) {
        C0683ep.m14754a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public AccountMediaPickerBaseAct m1076b() {
        return (AccountMediaPickerBaseAct) getContext();
    }

    /* JADX INFO: renamed from: c */
    public void m1077c(iti itiVar, boolean z, int i, Media media, AccountMediaPickerBaseAct.InterfaceC0097a interfaceC0097a) {
        int i2;
        this.f993e = interfaceC0097a;
        this.f994f = z ? null : itiVar;
        boolean z2 = m1076b().f986e == m1076b().f985d;
        if (!z) {
            i = itiVar.d > itiVar.c.a.size() ? itiVar.d : itiVar.c.a.size();
        }
        if (z2) {
            i2 = i == 1 ? R$string.f34A2 : R$string.f304z2;
        } else {
            i2 = i == 1 ? R$string.f284v2 : R$string.f279u2;
        }
        this.f991c.setText(m1076b().getResources().getString(i2, Integer.valueOf(i)));
        VText vText = this.f990b;
        if (z) {
            vText.setText(z2 ? R$string.f274t2 : R$string.f269s2);
            boolean zA = NullChecker.a(media);
            VDraweeView vDraweeView = this.f989a;
            if (zA) {
                vDraweeView.setVisibility(0);
                AccountMediaItemView.m1079e(media, this.f989a);
            } else {
                vDraweeView.setVisibility(4);
            }
            xdl0.M0(this.f992d, m1076b().f986e.c == null);
            return;
        }
        vText.setText(itiVar.a);
        int size = itiVar.c.a.size();
        VDraweeView vDraweeView2 = this.f989a;
        if (size > 0) {
            vDraweeView2.setVisibility(0);
            AccountMediaItemView.m1079e((Media) itiVar.c.a.get(0), this.f989a);
        } else {
            vDraweeView2.setVisibility(4);
        }
        xdl0.M0(this.f992d, itiVar.equals(m1076b().f986e.c));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f993e.mo1074b(this.f994f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1075a(this);
        setOnClickListener(this);
    }

    public AccountFolderItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AccountFolderItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
