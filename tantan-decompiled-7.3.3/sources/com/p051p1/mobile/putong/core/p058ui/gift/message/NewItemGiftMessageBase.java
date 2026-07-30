package com.p051p1.mobile.putong.core.p058ui.gift.message;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatGiftInfoExtra;
import com.p051p1.mobile.putong.core.data.CoreGiftInfo;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemMessageBase;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.clz;
import p153l.ovb0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NewItemGiftMessageBase extends LinearLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public CoreGiftInfo f30072a;

    /* JADX INFO: renamed from: b */
    public Message f30073b;

    /* JADX INFO: renamed from: c */
    public ChatGiftInfoExtra f30074c;

    public NewItemGiftMessageBase(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m46651d(View view) {
        mo46654e(m46653c());
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public Act mo46652b() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: c */
    public boolean m46653c() {
        return NullChecker.m82486a(this.f30074c) && this.f30074c.isOpened;
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo46654e(boolean z);

    /* JADX INFO: renamed from: f */
    public void m46655f(Message message, TextView textView, VDraweeView vDraweeView, LinearLayout linearLayout, TextView textView2) {
        this.f30073b = message;
        this.f30074c = CoreModule.m30933P().m143412i().mo180349K2(message);
        uqb0.f180374G.m98798o(vDraweeView);
        textView.setText("");
        textView2.setText("");
        mo46656g(m46653c());
        if (NullChecker.m82486a(message.additionalData)) {
            if (TEnum.equals(message.messageType(), MessageType.chat_gift) && NullChecker.m82486a(message.additionalData.chatGiftInfo)) {
                CoreGiftInfo coreGiftInfoM155892R3 = CoreModule.f18264c.f20385f1.m155892R3(message.additionalData.chatGiftInfo.f21103id);
                this.f30072a = coreGiftInfoM155892R3;
                if (!NullChecker.m82486a(coreGiftInfoM155892R3) || TextUtils.isEmpty(this.f30072a.extra.blessingText)) {
                    textView.setText(CoreModule.m30933P().m143412i().mo180346K());
                } else {
                    textView.setText(this.f30072a.extra.blessingText);
                }
            }
            if (NullChecker.m82486a(this.f30072a)) {
                uqb0.f180374G.m127115L0(vDraweeView, this.f30072a.url);
                bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.x130
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f191980a.m46651d(view);
                    }
                });
                double d = this.f30072a.unitCoinPrice;
                if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    textView2.setText(String.format("价值：%s探探币", Integer.valueOf((int) d)));
                } else {
                    textView2.setText("");
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo46656g(boolean z);

    public clz getMainPresenter() {
        if (mo46652b() instanceof MessagesAct) {
            return ((MessagesAct) mo46652b()).mo50158l();
        }
        return null;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    public NewItemGiftMessageBase(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewItemGiftMessageBase(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
