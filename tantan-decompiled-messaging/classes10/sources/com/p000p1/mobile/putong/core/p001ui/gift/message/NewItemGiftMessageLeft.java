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
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.knb0;
import p003l.a1c0;
import p003l.ot20;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class NewItemGiftMessageLeft extends NewItemGiftMessageBase {

    /* JADX INFO: renamed from: d */
    public NewItemGiftMessageLeft f1621d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f1622e;

    /* JADX INFO: renamed from: f */
    public VText f1623f;

    /* JADX INFO: renamed from: g */
    public VText f1624g;

    /* JADX INFO: renamed from: h */
    public VText f1625h;

    public NewItemGiftMessageLeft(Context context) {
        super(context);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.gift.message.NewItemGiftMessageBase
    /* JADX INFO: renamed from: A */
    public void mo2802A(Message message) {
        super.m2807f(message, this.f1623f, this.f1622e, this.f1621d, this.f1624g);
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
            getMainPresenter().z6(this.f1619b, this.f1618a, "", m2811i());
            if (z) {
                return;
            }
            mo2804b().f.t6(this.f1619b);
            return;
        }
        if (CoreModule.P().i().t4(mo2804b())) {
            CoreModule.P().i().j4(mo2804b(), this.f1619b, this.f1618a, "");
            if (z) {
                return;
            }
            CoreModule.P().i().V2(mo2804b(), this.f1619b);
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.gift.message.NewItemGiftMessageBase
    /* JADX INFO: renamed from: g */
    public void mo2808g(boolean z) {
        this.f1625h.setTextColor(z ? mo2804b().getResources().getColor(a1c0.f2718z) : mo2804b().getResources().getColor(a1c0.f2707o));
        VText vText = this.f1625h;
        if (z) {
            vText.setText("已拆开");
        } else {
            vText.setText("待拆开");
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m2810h(View view) {
        ot20.m8589a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m2811i() {
        return NullChecker.a(this.f1620c) && this.f1620c.beThanked;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.gift.message.NewItemGiftMessageBase
    /* JADX INFO: renamed from: m */
    public void mo2809m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2810h(this);
        this.f1623f.getPaint().setFakeBoldText(true);
        this.f1625h.getPaint().setFakeBoldText(true);
    }

    public NewItemGiftMessageLeft(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewItemGiftMessageLeft(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
