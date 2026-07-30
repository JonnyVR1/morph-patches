package com.p051p1.mobile.putong.core.p058ui.gift.message;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemMessageBase;
import java.util.List;
import p151v.VDraweeView;
import p151v.VText;
import p153l.ovb0;
import p153l.t5q;

/* JADX INFO: loaded from: classes3.dex */
public class ItemGiftMessageLeft extends ItemGiftMessageBase {

    /* JADX INFO: renamed from: b */
    public ItemGiftMessageLeft f30064b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f30065c;

    /* JADX INFO: renamed from: d */
    public VText_Bold f30066d;

    /* JADX INFO: renamed from: e */
    public VText f30067e;

    public ItemGiftMessageLeft(Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.gift.message.ItemGiftMessageBase, com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        super.m46646d(message, this.f30066d, this.f30065c, this.f30064b, this.f30067e);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.gift.message.ItemGiftMessageBase, com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final void m46648f(View view) {
        t5q.m189416a(this, view);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.gift.message.ItemGiftMessageBase, com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46648f(this);
    }

    public ItemGiftMessageLeft(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemGiftMessageLeft(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
