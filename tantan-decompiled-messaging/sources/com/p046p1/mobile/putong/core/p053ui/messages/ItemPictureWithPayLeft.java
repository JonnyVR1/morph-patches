package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.p046p1.mobile.putong.core.data.Message;
import java.util.List;
import p147v.AutoVDraweeView;
import p147v.VCheckBox;
import p147v.VImage;
import p147v.VText;
import p149l.ccq;
import p149l.knb0;
import p149l.t100;
import p149l.zbq;

/* JADX INFO: loaded from: classes3.dex */
public class ItemPictureWithPayLeft extends LinearLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public ItemPictureWithPayLeft f31380a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f31381b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f31382c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f31383d;

    /* JADX INFO: renamed from: e */
    public VText f31384e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f31385f;

    /* JADX INFO: renamed from: g */
    public VImage f31386g;

    /* JADX INFO: renamed from: h */
    public VText f31387h;

    /* JADX INFO: renamed from: i */
    public ImageView f31388i;

    /* JADX INFO: renamed from: j */
    public VText f31389j;

    /* JADX INFO: renamed from: k */
    public VText f31390k;

    /* JADX INFO: renamed from: l */
    public VCheckBox f31391l;

    /* JADX INFO: renamed from: m */
    public VText f31392m;

    /* JADX INFO: renamed from: n */
    public final zbq f31393n;

    public ItemPictureWithPayLeft(Context context) {
        super(context);
        this.f31393n = new zbq();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        this.f31393n.mo192930x(message);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return this.f31393n.m192927u();
    }

    /* JADX INFO: renamed from: a */
    public final void m48576a(View view) {
        ccq.m106136a(this, view);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
        this.f31393n.m192922n(i, z, itemMessageBase);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31393n.mo192924r();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48576a(this);
        this.f31381b.getHierarchy().m112053H(RoundingParams.m8248b(t100.m186890d(8.0f), t100.m186890d(8.0f), 0.0f, 0.0f).m8266t(-1));
        this.f31393n.m192920l(this.f31380a, this.f31381b, this.f31382c, this.f31384e, this.f31389j, this.f31390k, this.f31383d);
        this.f31393n.m217990M(this.f31385f, this.f31386g, this.f31387h, this.f31392m, this.f31391l);
    }

    public ItemPictureWithPayLeft(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31393n = new zbq();
    }

    public ItemPictureWithPayLeft(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31393n = new zbq();
    }

    public ItemPictureWithPayLeft(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f31393n = new zbq();
    }
}
