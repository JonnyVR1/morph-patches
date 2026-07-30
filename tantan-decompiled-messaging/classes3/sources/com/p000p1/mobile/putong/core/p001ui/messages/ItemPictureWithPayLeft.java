package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.p1.mobile.putong.core.data.Message;
import java.util.List;
import l.ccq;
import l.knb0;
import l.t100;
import p003l.zbq;
import p028v.AutoVDraweeView;
import p028v.VCheckBox;
import p028v.VImage;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemPictureWithPayLeft extends LinearLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: a */
    public ItemPictureWithPayLeft f1271a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f1272b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f1273c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f1274d;

    /* JADX INFO: renamed from: e */
    public VText f1275e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f1276f;

    /* JADX INFO: renamed from: g */
    public VImage f1277g;

    /* JADX INFO: renamed from: h */
    public VText f1278h;

    /* JADX INFO: renamed from: i */
    public ImageView f1279i;

    /* JADX INFO: renamed from: j */
    public VText f1280j;

    /* JADX INFO: renamed from: k */
    public VText f1281k;

    /* JADX INFO: renamed from: l */
    public VCheckBox f1282l;

    /* JADX INFO: renamed from: m */
    public VText f1283m;

    /* JADX INFO: renamed from: n */
    public final zbq f1284n;

    public ItemPictureWithPayLeft(Context context) {
        super(context);
        this.f1284n = new zbq();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
        this.f1284n.mo8138x(message);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return this.f1284n.m8135u();
    }

    /* JADX INFO: renamed from: a */
    public final void m1660a(View view) {
        ccq.a(this, view);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
        this.f1284n.m8130n(i, z, itemMessageBase);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1284n.mo8132r();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1660a(this);
        this.f1272b.getHierarchy().H(RoundingParams.b(t100.d(8.0f), t100.d(8.0f), 0.0f, 0.0f).t(-1));
        this.f1284n.m8128l(this.f1271a, this.f1272b, this.f1273c, this.f1275e, this.f1280j, this.f1281k, this.f1274d);
        this.f1284n.m9392M(this.f1276f, this.f1277g, this.f1278h, this.f1283m, this.f1282l);
    }

    public ItemPictureWithPayLeft(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1284n = new zbq();
    }

    public ItemPictureWithPayLeft(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1284n = new zbq();
    }

    public ItemPictureWithPayLeft(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1284n = new zbq();
    }
}
