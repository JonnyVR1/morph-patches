package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.p051p1.mobile.putong.core.data.Message;
import java.util.List;
import p151v.AutoVDraweeView;
import p151v.VText;
import p153l.aeq;
import p153l.ovb0;
import p153l.qa00;
import p153l.udq;

/* JADX INFO: loaded from: classes3.dex */
public class ItemPictureTextLeft extends LinearLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public ItemPictureTextLeft f32213a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f32214b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f32215c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f32216d;

    /* JADX INFO: renamed from: e */
    public VText f32217e;

    /* JADX INFO: renamed from: f */
    public VText f32218f;

    /* JADX INFO: renamed from: g */
    public VText f32219g;

    /* JADX INFO: renamed from: h */
    public final udq f32220h;

    public ItemPictureTextLeft(Context context) {
        super(context);
        this.f32220h = new udq();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        this.f32220h.mo195554x(message);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return this.f32220h.m195551u();
    }

    /* JADX INFO: renamed from: a */
    public final void m49757a(View view) {
        aeq.m97258a(this, view);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
        this.f32220h.m195546n(i, z, itemMessageBase);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32220h.mo195548r();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49757a(this);
        this.f32214b.getHierarchy().m207045H(RoundingParams.m8302b(qa00.m175859d(8.0f), qa00.m175859d(8.0f), 0.0f, 0.0f).m8320t(-1));
        this.f32220h.m195544l(this.f32213a, this.f32214b, this.f32215c, this.f32217e, this.f32218f, this.f32219g, this.f32216d);
    }

    public ItemPictureTextLeft(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32220h = new udq();
    }

    public ItemPictureTextLeft(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32220h = new udq();
    }

    public ItemPictureTextLeft(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f32220h = new udq();
    }
}
