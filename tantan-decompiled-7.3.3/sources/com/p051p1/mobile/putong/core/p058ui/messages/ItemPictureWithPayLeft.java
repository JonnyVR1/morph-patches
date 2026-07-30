package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.p051p1.mobile.putong.core.data.Message;
import java.util.List;
import p151v.AutoVDraweeView;
import p151v.VCheckBox;
import p151v.VImage;
import p151v.VText;
import p153l.ceq;
import p153l.ovb0;
import p153l.qa00;
import p153l.zdq;

/* JADX INFO: loaded from: classes3.dex */
public class ItemPictureWithPayLeft extends LinearLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public ItemPictureWithPayLeft f32228a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f32229b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f32230c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f32231d;

    /* JADX INFO: renamed from: e */
    public VText f32232e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f32233f;

    /* JADX INFO: renamed from: g */
    public VImage f32234g;

    /* JADX INFO: renamed from: h */
    public VText f32235h;

    /* JADX INFO: renamed from: i */
    public ImageView f32236i;

    /* JADX INFO: renamed from: j */
    public VText f32237j;

    /* JADX INFO: renamed from: k */
    public VText f32238k;

    /* JADX INFO: renamed from: l */
    public VCheckBox f32239l;

    /* JADX INFO: renamed from: m */
    public VText f32240m;

    /* JADX INFO: renamed from: n */
    public final zdq f32241n;

    public ItemPictureWithPayLeft(Context context) {
        super(context);
        this.f32241n = new zdq();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        this.f32241n.mo195554x(message);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return this.f32241n.m195551u();
    }

    /* JADX INFO: renamed from: a */
    public final void m49759a(View view) {
        ceq.m109448a(this, view);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
        this.f32241n.m195546n(i, z, itemMessageBase);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32241n.mo195548r();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49759a(this);
        this.f32229b.getHierarchy().m207045H(RoundingParams.m8302b(qa00.m175859d(8.0f), qa00.m175859d(8.0f), 0.0f, 0.0f).m8320t(-1));
        this.f32241n.m195544l(this.f32228a, this.f32229b, this.f32230c, this.f32232e, this.f32237j, this.f32238k, this.f32231d);
        this.f32241n.m219365M(this.f32233f, this.f32234g, this.f32235h, this.f32240m, this.f32239l);
    }

    public ItemPictureWithPayLeft(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32241n = new zdq();
    }

    public ItemPictureWithPayLeft(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32241n = new zdq();
    }

    public ItemPictureWithPayLeft(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f32241n = new zdq();
    }
}
