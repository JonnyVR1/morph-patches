package com.p000p1.mobile.putong.core.p001ui.messages.compliment;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemMessageBase;
import com.p1.mobile.putong.core.data.Message;
import java.util.List;
import l.knb0;
import l.vwb;
import l.y4c0;
import p003l.vq5;
import p028v.AutoVDraweeView;
import p028v.VImage;
import p028v.VText_NoTopPadding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemComplimentMessageRight extends ConstraintLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: d */
    public VImage f1672d;

    /* JADX INFO: renamed from: e */
    public AutoVDraweeView f1673e;

    /* JADX INFO: renamed from: f */
    public VText_NoTopPadding f1674f;

    public ItemComplimentMessageRight(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
        vq5.m8401b(message, this.f1672d, this.f1673e, this.f1674f, getContext());
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

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        this.f1672d = (VImage) findViewById(y4c0.X);
        this.f1673e = (AutoVDraweeView) findViewById(y4c0.V);
        this.f1674f = (VText_NoTopPadding) findViewById(y4c0.W);
    }

    public ItemComplimentMessageRight(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemComplimentMessageRight(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
