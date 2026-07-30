package com.p046p1.mobile.putong.core.p053ui.gift.message;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemMessageBase;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import java.util.List;
import p147v.VDraweeView;
import p147v.VText;
import p149l.a1c0;
import p149l.knb0;
import p149l.pt20;

/* JADX INFO: loaded from: classes10.dex */
public class NewItemGiftMessageRight extends NewItemGiftMessageBase {

    /* JADX INFO: renamed from: d */
    public NewItemGiftMessageRight f29232d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f29233e;

    /* JADX INFO: renamed from: f */
    public VText f29234f;

    /* JADX INFO: renamed from: g */
    public VText f29235g;

    /* JADX INFO: renamed from: h */
    public VText f29236h;

    public NewItemGiftMessageRight(Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.gift.message.NewItemGiftMessageBase, com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        super.m45472f(message, this.f29234f, this.f29233e, this.f29232d, this.f29235g);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.gift.message.NewItemGiftMessageBase, com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.gift.message.NewItemGiftMessageBase
    /* JADX INFO: renamed from: b */
    public Act mo45469b() {
        return (Act) getContext();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.gift.message.NewItemGiftMessageBase
    /* JADX INFO: renamed from: e */
    public void mo45471e(boolean z) {
        if (mo45469b() instanceof MessagesAct) {
            getMainPresenter().mo120866z6(this.f29225b, this.f29224a, z ? "对方已拆开" : "待对方拆开", true);
        } else if (CoreModule.m29935P().m94658i().mo158449t4(mo45469b())) {
            CoreModule.f17554l.m94658i().mo158397j4(mo45469b(), this.f29225b, this.f29224a, z ? "对方已拆开" : "待对方拆开");
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.gift.message.NewItemGiftMessageBase
    /* JADX INFO: renamed from: g */
    public void mo45473g(boolean z) {
        this.f29236h.setTextColor(z ? mo45469b().getResources().getColor(a1c0.f67172z) : mo45469b().getResources().getColor(a1c0.f67161o));
        VText vText = this.f29236h;
        if (z) {
            vText.setText("对方已拆开");
        } else {
            vText.setText("待对方拆开");
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m45476h(View view) {
        pt20.m171277a(this, view);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.gift.message.NewItemGiftMessageBase, com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45476h(this);
        this.f29234f.getPaint().setFakeBoldText(true);
        this.f29236h.getPaint().setFakeBoldText(true);
    }

    public NewItemGiftMessageRight(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewItemGiftMessageRight(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
