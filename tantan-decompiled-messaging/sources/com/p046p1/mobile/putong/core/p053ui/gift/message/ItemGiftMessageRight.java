package com.p046p1.mobile.putong.core.p053ui.gift.message;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemMessageBase;
import java.util.List;
import p147v.VDraweeView;
import p147v.VText;
import p149l.knb0;
import p149l.u3q;

/* JADX INFO: loaded from: classes10.dex */
public class ItemGiftMessageRight extends ItemGiftMessageBase {

    /* JADX INFO: renamed from: b */
    public ItemGiftMessageRight f29220b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f29221c;

    /* JADX INFO: renamed from: d */
    public VText_Bold f29222d;

    /* JADX INFO: renamed from: e */
    public VText f29223e;

    public ItemGiftMessageRight(Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.gift.message.ItemGiftMessageBase, com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        super.m45463d(message, this.f29222d, this.f29221c, this.f29220b, this.f29223e);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.gift.message.ItemGiftMessageBase, com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final void m45466f(View view) {
        u3q.m191610a(this, view);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.gift.message.ItemGiftMessageBase, com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45466f(this);
    }

    public ItemGiftMessageRight(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemGiftMessageRight(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
