package com.p046p1.mobile.putong.core.p053ui.gift.message;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatGiftInfoExtra;
import com.p046p1.mobile.putong.core.data.CoreGiftInfo;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemMessageBase;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VDraweeView;
import p149l.fcz;
import p149l.knb0;
import p149l.qib0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class NewItemGiftMessageBase extends LinearLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public CoreGiftInfo f29224a;

    /* JADX INFO: renamed from: b */
    public Message f29225b;

    /* JADX INFO: renamed from: c */
    public ChatGiftInfoExtra f29226c;

    public NewItemGiftMessageBase(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m45468d(View view) {
        mo45471e(m45470c());
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public Act mo45469b() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: c */
    public boolean m45470c() {
        return NullChecker.m81303a(this.f29226c) && this.f29226c.isOpened;
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo45471e(boolean z);

    /* JADX INFO: renamed from: f */
    public void m45472f(Message message, TextView textView, VDraweeView vDraweeView, LinearLayout linearLayout, TextView textView2) {
        this.f29225b = message;
        this.f29226c = CoreModule.m29935P().m94658i().mo158257K2(message);
        qib0.f154691G.m184725o(vDraweeView);
        textView.setText("");
        textView2.setText("");
        mo45473g(m45470c());
        if (NullChecker.m81303a(message.additionalData)) {
            if (TEnum.equals(message.messageType(), MessageType.chat_gift) && NullChecker.m81303a(message.additionalData.chatGiftInfo)) {
                CoreGiftInfo coreGiftInfoM118054R3 = CoreModule.f17545c.f19643f1.m118054R3(message.additionalData.chatGiftInfo.f20361id);
                this.f29224a = coreGiftInfoM118054R3;
                if (!NullChecker.m81303a(coreGiftInfoM118054R3) || TextUtils.isEmpty(this.f29224a.extra.blessingText)) {
                    textView.setText(CoreModule.m29935P().m94658i().mo158254K());
                } else {
                    textView.setText(this.f29224a.extra.blessingText);
                }
            }
            if (NullChecker.m81303a(this.f29224a)) {
                qib0.f154691G.m102331L0(vDraweeView, this.f29224a.url);
                xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.nt20
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f140327a.m45468d(view);
                    }
                });
                double d = this.f29224a.unitCoinPrice;
                if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    textView2.setText(String.format("价值：%s探探币", Integer.valueOf((int) d)));
                } else {
                    textView2.setText("");
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo45473g(boolean z);

    public fcz getMainPresenter() {
        if (mo45469b() instanceof MessagesAct) {
            return ((MessagesAct) mo45469b()).mo48974l();
        }
        return null;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    public NewItemGiftMessageBase(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewItemGiftMessageBase(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
