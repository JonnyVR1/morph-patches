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
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VDraweeView;
import p151v.VText;
import p153l.g9c0;
import p153l.ovb0;
import p153l.y130;

/* JADX INFO: loaded from: classes3.dex */
public class NewItemGiftMessageLeft extends NewItemGiftMessageBase {

    /* JADX INFO: renamed from: d */
    public NewItemGiftMessageLeft f30075d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f30076e;

    /* JADX INFO: renamed from: f */
    public VText f30077f;

    /* JADX INFO: renamed from: g */
    public VText f30078g;

    /* JADX INFO: renamed from: h */
    public VText f30079h;

    public NewItemGiftMessageLeft(Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.gift.message.NewItemGiftMessageBase, com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        super.m46655f(message, this.f30077f, this.f30076e, this.f30075d, this.f30078g);
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
            getMainPresenter().mo111072z6(this.f30073b, this.f30072a, "", m46658i());
            if (z) {
                return;
            }
            ((MessagesAct) mo46652b()).f32488f.mo111047t6(this.f30073b);
            return;
        }
        if (CoreModule.m30933P().m143412i().mo180541t4(mo46652b())) {
            CoreModule.m30933P().m143412i().mo180489j4(mo46652b(), this.f30073b, this.f30072a, "");
            if (z) {
                return;
            }
            CoreModule.m30933P().m143412i().mo180411V2(mo46652b(), this.f30073b);
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.gift.message.NewItemGiftMessageBase
    /* JADX INFO: renamed from: g */
    public void mo46656g(boolean z) {
        this.f30079h.setTextColor(z ? mo46652b().getResources().getColor(g9c0.f102836z) : mo46652b().getResources().getColor(g9c0.f102825o));
        VText vText = this.f30079h;
        if (z) {
            vText.setText("已拆开");
        } else {
            vText.setText("待拆开");
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m46657h(View view) {
        y130.m213929a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m46658i() {
        return NullChecker.m82486a(this.f30074c) && this.f30074c.beThanked;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.gift.message.NewItemGiftMessageBase, com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46657h(this);
        this.f30077f.getPaint().setFakeBoldText(true);
        this.f30079h.getPaint().setFakeBoldText(true);
    }

    public NewItemGiftMessageLeft(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewItemGiftMessageLeft(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
