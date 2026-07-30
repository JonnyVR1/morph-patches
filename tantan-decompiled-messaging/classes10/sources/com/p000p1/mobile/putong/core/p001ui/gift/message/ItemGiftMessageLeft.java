package com.p000p1.mobile.putong.core.p001ui.gift.message;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.p1.mobile.putong.core.ui.messages.ItemMessageBase;
import java.util.List;
import l.knb0;
import p003l.t3q;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ItemGiftMessageLeft extends ItemGiftMessageBase {

    /* JADX INFO: renamed from: b */
    public ItemGiftMessageLeft f1610b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f1611c;

    /* JADX INFO: renamed from: d */
    public VText_Bold f1612d;

    /* JADX INFO: renamed from: e */
    public VText f1613e;

    public ItemGiftMessageLeft(Context context) {
        super(context);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.gift.message.ItemGiftMessageBase
    /* JADX INFO: renamed from: A */
    public void mo2791A(Message message) {
        super.m2795d(message, this.f1612d, this.f1611c, this.f1610b, this.f1613e);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.gift.message.ItemGiftMessageBase
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo2792J() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final void m2798f(View view) {
        t3q.m9524a(this, view);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.gift.message.ItemGiftMessageBase
    /* JADX INFO: renamed from: m */
    public void mo2797m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2798f(this);
    }

    public ItemGiftMessageLeft(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemGiftMessageLeft(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
