package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.p1.mobile.putong.core.data.Message;
import java.util.List;
import l.acq;
import l.knb0;
import l.t100;
import p003l.ubq;
import p028v.AutoVDraweeView;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemPictureTextLeft extends LinearLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: a */
    public ItemPictureTextLeft f1256a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f1257b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f1258c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f1259d;

    /* JADX INFO: renamed from: e */
    public VText f1260e;

    /* JADX INFO: renamed from: f */
    public VText f1261f;

    /* JADX INFO: renamed from: g */
    public VText f1262g;

    /* JADX INFO: renamed from: h */
    public final ubq f1263h;

    public ItemPictureTextLeft(Context context) {
        super(context);
        this.f1263h = new ubq();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
        this.f1263h.mo8138x(message);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return this.f1263h.m8135u();
    }

    /* JADX INFO: renamed from: a */
    public final void m1658a(View view) {
        acq.a(this, view);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
        this.f1263h.m8130n(i, z, itemMessageBase);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1263h.mo8132r();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1658a(this);
        this.f1257b.getHierarchy().H(RoundingParams.b(t100.d(8.0f), t100.d(8.0f), 0.0f, 0.0f).t(-1));
        this.f1263h.m8128l(this.f1256a, this.f1257b, this.f1258c, this.f1260e, this.f1261f, this.f1262g, this.f1259d);
    }

    public ItemPictureTextLeft(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1263h = new ubq();
    }

    public ItemPictureTextLeft(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1263h = new ubq();
    }

    public ItemPictureTextLeft(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1263h = new ubq();
    }
}
