package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.p1.mobile.putong.core.data.Message;
import java.util.List;
import l.bcq;
import l.knb0;
import l.t100;
import p003l.ubq;
import p028v.AutoVDraweeView;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemPictureTextRight extends LinearLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: a */
    public ItemPictureTextRight f1264a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f1265b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f1266c;

    /* JADX INFO: renamed from: d */
    public VText f1267d;

    /* JADX INFO: renamed from: e */
    public VText f1268e;

    /* JADX INFO: renamed from: f */
    public VText f1269f;

    /* JADX INFO: renamed from: g */
    public final ubq f1270g;

    public ItemPictureTextRight(Context context) {
        super(context);
        this.f1270g = new ubq();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
        this.f1270g.mo8138x(message);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return this.f1270g.m8135u();
    }

    /* JADX INFO: renamed from: a */
    public final void m1659a(View view) {
        bcq.a(this, view);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
        this.f1270g.m8130n(i, z, itemMessageBase);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1659a(this);
        this.f1265b.getHierarchy().H(RoundingParams.b(t100.d(8.0f), t100.d(8.0f), 0.0f, 0.0f).t(-1));
        this.f1270g.m8128l(this.f1264a, this.f1265b, null, this.f1267d, this.f1268e, this.f1269f, this.f1266c);
    }

    public ItemPictureTextRight(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1270g = new ubq();
    }

    public ItemPictureTextRight(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1270g = new ubq();
    }

    public ItemPictureTextRight(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1270g = new ubq();
    }
}
