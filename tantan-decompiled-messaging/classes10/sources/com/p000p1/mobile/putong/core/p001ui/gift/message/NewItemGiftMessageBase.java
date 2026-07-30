package com.p000p1.mobile.putong.core.p001ui.gift.message;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.data.ChatGiftInfoExtra;
import com.p000p1.mobile.putong.core.data.CoreGiftInfo;
import com.p000p1.mobile.putong.core.data.Message;
import com.p000p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.messages.ItemMessageBase;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.core.ui.messages.a;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.fcz;
import l.knb0;
import l.qib0;
import l.xdl0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public abstract class NewItemGiftMessageBase extends LinearLayout implements a {

    /* JADX INFO: renamed from: a */
    public CoreGiftInfo f1618a;

    /* JADX INFO: renamed from: b */
    public Message f1619b;

    /* JADX INFO: renamed from: c */
    public ChatGiftInfoExtra f1620c;

    public NewItemGiftMessageBase(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m2801d(View view) {
        mo2806e(m2805c());
    }

    /* JADX INFO: renamed from: A */
    public void mo2802A(Message message) {
    }

    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo2803J() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public Act mo2804b() {
        return getContext();
    }

    /* JADX INFO: renamed from: c */
    public boolean m2805c() {
        return NullChecker.a(this.f1620c) && this.f1620c.isOpened;
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo2806e(boolean z);

    /* JADX INFO: renamed from: f */
    public void m2807f(Message message, TextView textView, VDraweeView vDraweeView, LinearLayout linearLayout, TextView textView2) {
        this.f1619b = message;
        this.f1620c = CoreModule.P().i().K2(message);
        qib0.G.o(vDraweeView);
        textView.setText("");
        textView2.setText("");
        mo2808g(m2805c());
        if (NullChecker.a(message.additionalData)) {
            if (TEnum.equals(message.messageType(), MessageType.chat_gift) && NullChecker.a(message.additionalData.chatGiftInfo)) {
                CoreGiftInfo coreGiftInfoR3 = CoreModule.c.f1.R3(message.additionalData.chatGiftInfo.f23id);
                this.f1618a = coreGiftInfoR3;
                if (!NullChecker.a(coreGiftInfoR3) || TextUtils.isEmpty(this.f1618a.extra.blessingText)) {
                    textView.setText(CoreModule.P().i().K());
                } else {
                    textView.setText(this.f1618a.extra.blessingText);
                }
            }
            if (NullChecker.a(this.f1618a)) {
                qib0.G.L0(vDraweeView, this.f1618a.url);
                xdl0.E0(this, new View.OnClickListener() { // from class: l.nt20
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f6558a.m2801d(view);
                    }
                });
                double d = this.f1618a.unitCoinPrice;
                if (d > 0.0d) {
                    textView2.setText(String.format("价值：%s探探币", Integer.valueOf((int) d)));
                } else {
                    textView2.setText("");
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo2808g(boolean z);

    public fcz getMainPresenter() {
        if (mo2804b() instanceof MessagesAct) {
            return mo2804b().l();
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public void mo2809m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    public NewItemGiftMessageBase(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewItemGiftMessageBase(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
