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
import p153l.u5q;

/* JADX INFO: loaded from: classes3.dex */
public class ItemGiftMessageRight extends ItemGiftMessageBase {

    /* JADX INFO: renamed from: b */
    public ItemGiftMessageRight f30068b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f30069c;

    /* JADX INFO: renamed from: d */
    public VText_Bold f30070d;

    /* JADX INFO: renamed from: e */
    public VText f30071e;

    public ItemGiftMessageRight(Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.gift.message.ItemGiftMessageBase, com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        super.m46646d(message, this.f30070d, this.f30069c, this.f30068b, this.f30071e);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.gift.message.ItemGiftMessageBase, com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final void m46649f(View view) {
        u5q.m194616a(this, view);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.gift.message.ItemGiftMessageBase, com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46649f(this);
    }

    public ItemGiftMessageRight(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemGiftMessageRight(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
