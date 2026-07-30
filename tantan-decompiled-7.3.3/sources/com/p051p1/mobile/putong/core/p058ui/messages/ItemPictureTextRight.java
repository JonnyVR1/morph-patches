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
import p153l.beq;
import p153l.ovb0;
import p153l.qa00;
import p153l.udq;

/* JADX INFO: loaded from: classes3.dex */
public class ItemPictureTextRight extends LinearLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public ItemPictureTextRight f32221a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f32222b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f32223c;

    /* JADX INFO: renamed from: d */
    public VText f32224d;

    /* JADX INFO: renamed from: e */
    public VText f32225e;

    /* JADX INFO: renamed from: f */
    public VText f32226f;

    /* JADX INFO: renamed from: g */
    public final udq f32227g;

    public ItemPictureTextRight(Context context) {
        super(context);
        this.f32227g = new udq();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        this.f32227g.mo195554x(message);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return this.f32227g.m195551u();
    }

    /* JADX INFO: renamed from: a */
    public final void m49758a(View view) {
        beq.m103774a(this, view);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
        this.f32227g.m195546n(i, z, itemMessageBase);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49758a(this);
        this.f32222b.getHierarchy().m207045H(RoundingParams.m8302b(qa00.m175859d(8.0f), qa00.m175859d(8.0f), 0.0f, 0.0f).m8320t(-1));
        this.f32227g.m195544l(this.f32221a, this.f32222b, null, this.f32224d, this.f32225e, this.f32226f, this.f32223c);
    }

    public ItemPictureTextRight(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32227g = new udq();
    }

    public ItemPictureTextRight(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32227g = new udq();
    }

    public ItemPictureTextRight(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f32227g = new udq();
    }
}
