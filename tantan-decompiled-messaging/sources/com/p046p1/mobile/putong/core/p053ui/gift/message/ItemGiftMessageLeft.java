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
import p149l.t3q;

/* JADX INFO: loaded from: classes10.dex */
public class ItemGiftMessageLeft extends ItemGiftMessageBase {

    /* JADX INFO: renamed from: b */
    public ItemGiftMessageLeft f29216b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f29217c;

    /* JADX INFO: renamed from: d */
    public VText_Bold f29218d;

    /* JADX INFO: renamed from: e */
    public VText f29219e;

    public ItemGiftMessageLeft(Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.gift.message.ItemGiftMessageBase, com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        super.m45463d(message, this.f29218d, this.f29217c, this.f29216b, this.f29219e);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.gift.message.ItemGiftMessageBase, com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final void m45465f(View view) {
        t3q.m187116a(this, view);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.gift.message.ItemGiftMessageBase, com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45465f(this);
    }

    public ItemGiftMessageLeft(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemGiftMessageLeft(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
