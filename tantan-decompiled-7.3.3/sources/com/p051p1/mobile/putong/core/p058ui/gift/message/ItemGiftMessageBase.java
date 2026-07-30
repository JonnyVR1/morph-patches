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
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.p058ui.greet.GreetAct;
import com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemMessageBase;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VDraweeView;
import p153l.i4g0;
import p153l.jyb;
import p153l.ovb0;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemGiftMessageBase extends LinearLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public CoreGiftInfo f30063a;

    public ItemGiftMessageBase(Context context) {
        super(context);
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
    public Act m46644b() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m46645c(Message message, View view) {
        if (NullChecker.m82486a(this.f30063a)) {
            if (!TextUtils.equals(message.owner, CoreModule.m30929H().userId())) {
                i4g0.m138523u("e_chat_gift_message", m46644b().pageId(), jyb.m147494Y("chat_gift_id", this.f30063a.f56859id), jyb.m147494Y("other_user_id", message.getHostId()));
            }
            if (m46644b() instanceof MessagesAct) {
                ((MessagesAct) m46644b()).mo50158l().mo110866I2(this.f30063a);
            } else if (m46644b() instanceof GreetAct) {
                ChatGiftInfoExtra chatGiftInfoExtraMo180349K2 = CoreModule.m30933P().m143412i().mo180349K2(message);
                if (NullChecker.m82486a(chatGiftInfoExtraMo180349K2)) {
                    ((GreetAct) m46644b()).m46775o2(message, this.f30063a, chatGiftInfoExtraMo180349K2.isOpened ? "对方已拆开" : "待对方拆开");
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m46646d(final Message message, TextView textView, VDraweeView vDraweeView, LinearLayout linearLayout, TextView textView2) {
        uqb0.f180374G.m98798o(vDraweeView);
        textView.setText("");
        if (NullChecker.m82486a(message.additionalData)) {
            if (TEnum.equals(message.messageType(), MessageType.chat_gift) && NullChecker.m82486a(message.additionalData.chatGiftInfo)) {
                linearLayout.getLayoutParams().width = qa00.m175859d(271.0f);
                CoreGiftInfo coreGiftInfoM155892R3 = CoreModule.f18264c.f20385f1.m155892R3(message.additionalData.chatGiftInfo.f21103id);
                this.f30063a = coreGiftInfoM155892R3;
                if (NullChecker.m82486a(coreGiftInfoM155892R3)) {
                    textView.setText("送你一个 " + this.f30063a.name);
                }
            } else if (TEnum.equals(message.messageType(), MessageType.moment_gift) && NullChecker.m82486a(message.additionalData.momentGiftInfo)) {
                this.f30063a = CoreModule.f18264c.f20385f1.m155892R3(message.additionalData.momentGiftInfo.f21103id);
                CoreMomentInfo coreMomentInfoM33880Yn = CoreModule.f18264c.f20384f0.m33880Yn(message.additionalData.momentGiftInfo.momentID);
                if (NullChecker.m82486a(coreMomentInfoM33880Yn)) {
                    linearLayout.getLayoutParams().width = qa00.m175859d(230.0f);
                    if (TextUtils.isEmpty(m46647e(coreMomentInfoM33880Yn.value))) {
                        textView.setText("给你的动态送了一个礼物");
                    } else {
                        textView.setText("给你的动态「" + m46647e(coreMomentInfoM33880Yn.value) + "」送了一个礼物");
                    }
                } else if (NullChecker.m82486a(this.f30063a)) {
                    textView.setText("送你一个 " + this.f30063a.name);
                }
            }
            if (NullChecker.m82486a(this.f30063a)) {
                double d = this.f30063a.unitCoinPrice;
                if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    textView2.setText(String.format("价值：%s探探币", Integer.valueOf((int) d)));
                } else {
                    textView2.setText("");
                }
                uqb0.f180374G.m127115L0(vDraweeView, this.f30063a.url);
                setOnClickListener(new View.OnClickListener() { // from class: l.s5q
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f166445a.m46645c(message, view);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final String m46647e(String str) {
        return str.length() > 6 ? str.substring(0, str.offsetByCodePoints(0, str.codePointCount(0, 6))).concat("...") : str;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    public ItemGiftMessageBase(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemGiftMessageBase(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
