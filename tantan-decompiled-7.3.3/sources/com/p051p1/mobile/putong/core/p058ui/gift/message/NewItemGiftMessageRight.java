package com.p051p1.mobile.putong.core.p058ui.gift.message;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemMessageBase;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import java.util.List;
import p151v.VDraweeView;
import p151v.VText;
import p153l.g9c0;
import p153l.ovb0;
import p153l.z130;

/* JADX INFO: loaded from: classes3.dex */
public class NewItemGiftMessageRight extends NewItemGiftMessageBase {

    /* JADX INFO: renamed from: d */
    public NewItemGiftMessageRight f30080d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f30081e;

    /* JADX INFO: renamed from: f */
    public VText f30082f;

    /* JADX INFO: renamed from: g */
    public VText f30083g;

    /* JADX INFO: renamed from: h */
    public VText f30084h;

    public NewItemGiftMessageRight(Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.gift.message.NewItemGiftMessageBase, com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        super.m46655f(message, this.f30082f, this.f30081e, this.f30080d, this.f30083g);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.gift.message.NewItemGiftMessageBase, com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.gift.message.NewItemGiftMessageBase
    /* JADX INFO: renamed from: b */
    public Act mo46652b() {
        return (Act) getContext();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.gift.message.NewItemGiftMessageBase
    /* JADX INFO: renamed from: e */
    public void mo46654e(boolean z) {
        if (mo46652b() instanceof MessagesAct) {
            getMainPresenter().mo111072z6(this.f30073b, this.f30072a, z ? "对方已拆开" : "待对方拆开", true);
        } else if (CoreModule.m30933P().m143412i().mo180541t4(mo46652b())) {
            CoreModule.f18273l.m143412i().mo180489j4(mo46652b(), this.f30073b, this.f30072a, z ? "对方已拆开" : "待对方拆开");
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.gift.message.NewItemGiftMessageBase
    /* JADX INFO: renamed from: g */
    public void mo46656g(boolean z) {
        this.f30084h.setTextColor(z ? mo46652b().getResources().getColor(g9c0.f102836z) : mo46652b().getResources().getColor(g9c0.f102825o));
        VText vText = this.f30084h;
        if (z) {
            vText.setText("对方已拆开");
        } else {
            vText.setText("待对方拆开");
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m46659h(View view) {
        z130.m218276a(this, view);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.gift.message.NewItemGiftMessageBase, com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46659h(this);
        this.f30082f.getPaint().setFakeBoldText(true);
        this.f30084h.getPaint().setFakeBoldText(true);
    }

    public NewItemGiftMessageRight(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewItemGiftMessageRight(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
