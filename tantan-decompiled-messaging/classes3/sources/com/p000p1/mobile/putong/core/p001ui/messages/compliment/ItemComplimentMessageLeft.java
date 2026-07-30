package com.p000p1.mobile.putong.core.p001ui.messages.compliment;

import android.content.Context;
import android.util.AttributeSet;
import com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemMessageBase;
import com.p1.mobile.putong.core.data.Message;
import java.util.List;
import l.knb0;
import l.vwb;
import l.y4c0;
import p003l.vq5;
import p028v.AutoVDraweeView;
import p028v.VFrame;
import p028v.VImage;
import p028v.VText_NoTopPadding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemComplimentMessageLeft extends VFrame implements InterfaceC0102a {

    /* JADX INFO: renamed from: a */
    public VImage f1669a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f1670b;

    /* JADX INFO: renamed from: c */
    public VText_NoTopPadding f1671c;

    public ItemComplimentMessageLeft(Context context) {
        super(context);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
        vq5.m8401b(message, this.f1669a, this.f1670b, this.f1671c, getContext());
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return vwb.f0(new knb0[0]);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1669a = (VImage) findViewById(y4c0.X);
        this.f1670b = (AutoVDraweeView) findViewById(y4c0.V);
        this.f1671c = (VText_NoTopPadding) findViewById(y4c0.W);
    }

    public ItemComplimentMessageLeft(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemComplimentMessageLeft(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
