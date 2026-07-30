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
import com.p000p1.mobile.putong.core.data.CoreMomentInfo;
import com.p000p1.mobile.putong.core.data.Message;
import com.p000p1.mobile.putong.core.data.MessageType;
import com.p000p1.mobile.putong.core.p001ui.greet.GreetAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.messages.ItemMessageBase;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.core.ui.messages.a;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.j760;
import l.knb0;
import l.qib0;
import l.t100;
import l.vwb;
import l.zvf0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ItemGiftMessageBase extends LinearLayout implements a {

    /* JADX INFO: renamed from: a */
    public CoreGiftInfo f1609a;

    public ItemGiftMessageBase(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: A */
    public void mo2791A(Message message) {
    }

    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo2792J() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public Act m2793b() {
        return getContext();
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m2794c(Message message, View view) {
        if (NullChecker.a(this.f1609a)) {
            if (!TextUtils.equals(message.owner, CoreModule.H().userId())) {
                zvf0.u("e_chat_gift_message", m2793b().pageId(), new j760[]{vwb.Y("chat_gift_id", ((DbObject) this.f1609a).id), vwb.Y("other_user_id", message.getHostId())});
            }
            if (m2793b() instanceof MessagesAct) {
                m2793b().l().I2(this.f1609a);
            } else if (m2793b() instanceof GreetAct) {
                ChatGiftInfoExtra chatGiftInfoExtraK2 = CoreModule.P().i().K2(message);
                if (NullChecker.a(chatGiftInfoExtraK2)) {
                    m2793b().m2928n2(message, this.f1609a, chatGiftInfoExtraK2.isOpened ? "对方已拆开" : "待对方拆开");
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m2795d(final Message message, TextView textView, VDraweeView vDraweeView, LinearLayout linearLayout, TextView textView2) {
        qib0.G.o(vDraweeView);
        textView.setText("");
        if (NullChecker.a(message.additionalData)) {
            if (TEnum.equals(message.messageType(), MessageType.chat_gift) && NullChecker.a(message.additionalData.chatGiftInfo)) {
                linearLayout.getLayoutParams().width = t100.d(271.0f);
                CoreGiftInfo coreGiftInfoR3 = CoreModule.c.f1.R3(message.additionalData.chatGiftInfo.f23id);
                this.f1609a = coreGiftInfoR3;
                if (NullChecker.a(coreGiftInfoR3)) {
                    textView.setText("送你一个 " + this.f1609a.name);
                }
            } else if (TEnum.equals(message.messageType(), MessageType.moment_gift) && NullChecker.a(message.additionalData.momentGiftInfo)) {
                this.f1609a = CoreModule.c.f1.R3(message.additionalData.momentGiftInfo.f23id);
                CoreMomentInfo coreMomentInfoYn = CoreModule.c.f0.Yn(message.additionalData.momentGiftInfo.momentID);
                if (NullChecker.a(coreMomentInfoYn)) {
                    linearLayout.getLayoutParams().width = t100.d(230.0f);
                    if (TextUtils.isEmpty(m2796e(coreMomentInfoYn.value))) {
                        textView.setText("给你的动态送了一个礼物");
                    } else {
                        textView.setText("给你的动态「" + m2796e(coreMomentInfoYn.value) + "」送了一个礼物");
                    }
                } else if (NullChecker.a(this.f1609a)) {
                    textView.setText("送你一个 " + this.f1609a.name);
                }
            }
            if (NullChecker.a(this.f1609a)) {
                double d = this.f1609a.unitCoinPrice;
                if (d > 0.0d) {
                    textView2.setText(String.format("价值：%s探探币", Integer.valueOf((int) d)));
                } else {
                    textView2.setText("");
                }
                qib0.G.L0(vDraweeView, this.f1609a.url);
                setOnClickListener(new View.OnClickListener() { // from class: l.s3q
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f7269a.m2794c(message, view);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final String m2796e(String str) {
        return str.length() > 6 ? str.substring(0, str.offsetByCodePoints(0, str.codePointCount(0, 6))).concat("...") : str;
    }

    /* JADX INFO: renamed from: m */
    public void mo2797m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    public ItemGiftMessageBase(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemGiftMessageBase(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
