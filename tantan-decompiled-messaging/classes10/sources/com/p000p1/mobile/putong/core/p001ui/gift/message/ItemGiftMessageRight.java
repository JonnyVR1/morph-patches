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
import p003l.u3q;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ItemGiftMessageRight extends ItemGiftMessageBase {

    /* JADX INFO: renamed from: b */
    public ItemGiftMessageRight f1614b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f1615c;

    /* JADX INFO: renamed from: d */
    public VText_Bold f1616d;

    /* JADX INFO: renamed from: e */
    public VText f1617e;

    public ItemGiftMessageRight(Context context) {
        super(context);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.gift.message.ItemGiftMessageBase
    /* JADX INFO: renamed from: A */
    public void mo2791A(Message message) {
        super.m2795d(message, this.f1616d, this.f1615c, this.f1614b, this.f1617e);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.gift.message.ItemGiftMessageBase
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo2792J() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final void m2799f(View view) {
        u3q.m9645a(this, view);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.gift.message.ItemGiftMessageBase
    /* JADX INFO: renamed from: m */
    public void mo2797m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2799f(this);
    }

    public ItemGiftMessageRight(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemGiftMessageRight(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
