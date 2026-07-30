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
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VDraweeView;
import p147v.VText;
import p149l.a1c0;
import p149l.knb0;
import p149l.ot20;

/* JADX INFO: loaded from: classes10.dex */
public class NewItemGiftMessageLeft extends NewItemGiftMessageBase {

    /* JADX INFO: renamed from: d */
    public NewItemGiftMessageLeft f29227d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f29228e;

    /* JADX INFO: renamed from: f */
    public VText f29229f;

    /* JADX INFO: renamed from: g */
    public VText f29230g;

    /* JADX INFO: renamed from: h */
    public VText f29231h;

    public NewItemGiftMessageLeft(Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.gift.message.NewItemGiftMessageBase, com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        super.m45472f(message, this.f29229f, this.f29228e, this.f29227d, this.f29230g);
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
            getMainPresenter().mo120866z6(this.f29225b, this.f29224a, "", m45475i());
            if (z) {
                return;
            }
            ((MessagesAct) mo45469b()).f31640f.mo120841t6(this.f29225b);
            return;
        }
        if (CoreModule.m29935P().m94658i().mo158449t4(mo45469b())) {
            CoreModule.m29935P().m94658i().mo158397j4(mo45469b(), this.f29225b, this.f29224a, "");
            if (z) {
                return;
            }
            CoreModule.m29935P().m94658i().mo158319V2(mo45469b(), this.f29225b);
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.gift.message.NewItemGiftMessageBase
    /* JADX INFO: renamed from: g */
    public void mo45473g(boolean z) {
        this.f29231h.setTextColor(z ? mo45469b().getResources().getColor(a1c0.f67172z) : mo45469b().getResources().getColor(a1c0.f67161o));
        VText vText = this.f29231h;
        if (z) {
            vText.setText("已拆开");
        } else {
            vText.setText("待拆开");
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m45474h(View view) {
        ot20.m165925a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m45475i() {
        return NullChecker.m81303a(this.f29226c) && this.f29226c.beThanked;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.gift.message.NewItemGiftMessageBase, com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45474h(this);
        this.f29229f.getPaint().setFakeBoldText(true);
        this.f29231h.getPaint().setFakeBoldText(true);
    }

    public NewItemGiftMessageLeft(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewItemGiftMessageLeft(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
