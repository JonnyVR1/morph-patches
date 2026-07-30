package com.p000p1.mobile.putong.core.p001ui.gift.message;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.data.Message;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.messages.ItemMessageBase;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import java.util.List;
import l.knb0;
import p003l.a1c0;
import p003l.pt20;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class NewItemGiftMessageRight extends NewItemGiftMessageBase {

    /* JADX INFO: renamed from: d */
    public NewItemGiftMessageRight f1626d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f1627e;

    /* JADX INFO: renamed from: f */
    public VText f1628f;

    /* JADX INFO: renamed from: g */
    public VText f1629g;

    /* JADX INFO: renamed from: h */
    public VText f1630h;

    public NewItemGiftMessageRight(Context context) {
        super(context);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.gift.message.NewItemGiftMessageBase
    /* JADX INFO: renamed from: A */
    public void mo2802A(Message message) {
        super.m2807f(message, this.f1628f, this.f1627e, this.f1626d, this.f1629g);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.gift.message.NewItemGiftMessageBase
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo2803J() {
        return null;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.gift.message.NewItemGiftMessageBase
    /* JADX INFO: renamed from: b */
    public Act mo2804b() {
        return getContext();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.gift.message.NewItemGiftMessageBase
    /* JADX INFO: renamed from: e */
    public void mo2806e(boolean z) {
        if (mo2804b() instanceof MessagesAct) {
            getMainPresenter().z6(this.f1619b, this.f1618a, z ? "对方已拆开" : "待对方拆开", true);
        } else if (CoreModule.P().i().t4(mo2804b())) {
            CoreModule.l.i().j4(mo2804b(), this.f1619b, this.f1618a, z ? "对方已拆开" : "待对方拆开");
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.gift.message.NewItemGiftMessageBase
    /* JADX INFO: renamed from: g */
    public void mo2808g(boolean z) {
        this.f1630h.setTextColor(z ? mo2804b().getResources().getColor(a1c0.f2718z) : mo2804b().getResources().getColor(a1c0.f2707o));
        VText vText = this.f1630h;
        if (z) {
            vText.setText("对方已拆开");
        } else {
            vText.setText("待对方拆开");
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m2812h(View view) {
        pt20.m8793a(this, view);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.gift.message.NewItemGiftMessageBase
    /* JADX INFO: renamed from: m */
    public void mo2809m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2812h(this);
        this.f1628f.getPaint().setFakeBoldText(true);
        this.f1630h.getPaint().setFakeBoldText(true);
    }

    public NewItemGiftMessageRight(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewItemGiftMessageRight(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
