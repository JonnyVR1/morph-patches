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
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.p053ui.greet.GreetAct;
import com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemMessageBase;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VDraweeView;
import p149l.knb0;
import p149l.qib0;
import p149l.t100;
import p149l.vwb;
import p149l.zvf0;

/* JADX INFO: loaded from: classes10.dex */
public class ItemGiftMessageBase extends LinearLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public CoreGiftInfo f29215a;

    public ItemGiftMessageBase(Context context) {
        super(context);
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
    public Act m45461b() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m45462c(Message message, View view) {
        if (NullChecker.m81303a(this.f29215a)) {
            if (!TextUtils.equals(message.owner, CoreModule.m29931H().userId())) {
                zvf0.m220399u("e_chat_gift_message", m45461b().pageId(), vwb.m200311Y("chat_gift_id", this.f29215a.f56011id), vwb.m200311Y("other_user_id", message.getHostId()));
            }
            if (m45461b() instanceof MessagesAct) {
                ((MessagesAct) m45461b()).mo48974l().mo120660I2(this.f29215a);
            } else if (m45461b() instanceof GreetAct) {
                ChatGiftInfoExtra chatGiftInfoExtraMo158257K2 = CoreModule.m29935P().m94658i().mo158257K2(message);
                if (NullChecker.m81303a(chatGiftInfoExtraMo158257K2)) {
                    ((GreetAct) m45461b()).m45592n2(message, this.f29215a, chatGiftInfoExtraMo158257K2.isOpened ? "对方已拆开" : "待对方拆开");
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m45463d(final Message message, TextView textView, VDraweeView vDraweeView, LinearLayout linearLayout, TextView textView2) {
        qib0.f154691G.m184725o(vDraweeView);
        textView.setText("");
        if (NullChecker.m81303a(message.additionalData)) {
            if (TEnum.equals(message.messageType(), MessageType.chat_gift) && NullChecker.m81303a(message.additionalData.chatGiftInfo)) {
                linearLayout.getLayoutParams().width = t100.m186890d(271.0f);
                CoreGiftInfo coreGiftInfoM118054R3 = CoreModule.f17545c.f19643f1.m118054R3(message.additionalData.chatGiftInfo.f20361id);
                this.f29215a = coreGiftInfoM118054R3;
                if (NullChecker.m81303a(coreGiftInfoM118054R3)) {
                    textView.setText("送你一个 " + this.f29215a.name);
                }
            } else if (TEnum.equals(message.messageType(), MessageType.moment_gift) && NullChecker.m81303a(message.additionalData.momentGiftInfo)) {
                this.f29215a = CoreModule.f17545c.f19643f1.m118054R3(message.additionalData.momentGiftInfo.f20361id);
                CoreMomentInfo coreMomentInfoM32877Yn = CoreModule.f17545c.f19642f0.m32877Yn(message.additionalData.momentGiftInfo.momentID);
                if (NullChecker.m81303a(coreMomentInfoM32877Yn)) {
                    linearLayout.getLayoutParams().width = t100.m186890d(230.0f);
                    if (TextUtils.isEmpty(m45464e(coreMomentInfoM32877Yn.value))) {
                        textView.setText("给你的动态送了一个礼物");
                    } else {
                        textView.setText("给你的动态「" + m45464e(coreMomentInfoM32877Yn.value) + "」送了一个礼物");
                    }
                } else if (NullChecker.m81303a(this.f29215a)) {
                    textView.setText("送你一个 " + this.f29215a.name);
                }
            }
            if (NullChecker.m81303a(this.f29215a)) {
                double d = this.f29215a.unitCoinPrice;
                if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    textView2.setText(String.format("价值：%s探探币", Integer.valueOf((int) d)));
                } else {
                    textView2.setText("");
                }
                qib0.f154691G.m102331L0(vDraweeView, this.f29215a.url);
                setOnClickListener(new View.OnClickListener() { // from class: l.s3q
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f162187a.m45462c(message, view);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final String m45464e(String str) {
        return str.length() > 6 ? str.substring(0, str.offsetByCodePoints(0, str.codePointCount(0, 6))).concat("...") : str;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    public ItemGiftMessageBase(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemGiftMessageBase(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
