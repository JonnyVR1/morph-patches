package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.core.ui.messages.view.MessageInputBaseEditView;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.a1c0;
import l.c3c0;
import l.i0g0;
import l.roj0;
import l.ura;
import l.vwb;
import l.y4c0;
import l.zvf0;
import org.spongycastle.i18n.TextBundle;
import p003l.bpz;
import p003l.dml;
import p003l.eqh0;
import p003l.fcz;
import p003l.guy;
import p003l.j000;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemRecalled extends ItemBase {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemRecalled$a */
    public class C0091a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Message f1337a;

        public C0091a(Message message) {
            this.f1337a = message;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            if (ItemMessageBase.m1396Y(ItemRecalled.this.getContext())) {
                return;
            }
            MessageBar messageBarM4844t0 = ItemRecalled.this.m1713j().f1531f.m6497e0().mo2046A0().m6499g0().m4844t0();
            if (NullChecker.a(messageBarM4844t0) && messageBarM4844t0.getVisibility() == 8) {
                return;
            }
            zvf0.r("e_message_re_edit", "p_chat_view");
            guy guyVarM6499g0 = ((MessagesAct) ItemRecalled.this.getContext()).mo2046A0().m6499g0();
            MessageInputBaseEditView bar_center_text = guyVarM6499g0.m4844t0().getBar_center_text();
            bar_center_text.append(this.f1337a.value);
            bar_center_text.requestFocus();
            bar_center_text.setSelection(bar_center_text.length());
            ItemRecalled.this.m1713j().showInput(bar_center_text, 0);
            if (NullChecker.a(guyVarM6499g0.m4846u0()) && guyVarM6499g0.m4846u0().m3703d0()) {
                guyVarM6499g0.m4846u0().m3678G();
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(ItemRecalled.this.getResources().getColor(a1c0.D));
        }
    }

    public ItemRecalled(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m1712k(View view) {
        if (ItemMessageBase.m1396Y(getContext())) {
            return;
        }
        MessageBar messageBarM4844t0 = m1713j().f1531f.m6497e0().mo2046A0().m6499g0().m4844t0();
        if (NullChecker.a(messageBarM4844t0) && messageBarM4844t0.getVisibility() == 8) {
            return;
        }
        fcz.f3512F0.onNext(roj0.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.core.p001ui.messages.ItemBase
    /* JADX INFO: renamed from: g */
    public void mo1114g(dml dmlVar, Message message, Message message2, Message message3) {
        int color;
        super.mo1114g(dmlVar, message, message2, message3);
        TextView textView = (TextView) findViewById(y4c0.A4);
        if ((getContext() instanceof MessagesAct) && (((MessagesAct) getContext()).f1531f.m4309t7() instanceof bpz)) {
            if (((bpz) ((MessagesAct) getContext()).f1531f.m4309t7()).f2427M1) {
                textView.setBackground(getResources().getDrawable(c3c0.R4));
                textView.setTextColor(getContext().getResources().getColor(a1c0.a0));
            } else {
                textView.setTextColor(getContext().getResources().getColor(ura.e().d().I4() ? a1c0.i : a1c0.k));
                textView.setBackgroundColor(0);
            }
        }
        if (!TextUtils.isEmpty(message.recalledReason) && !TextUtils.isEmpty(message.recalledHint) && CoreModule.H().userId().equals(message.owner)) {
            String str = message.recalledHint;
            int iIndexOf = str.indexOf("<<<");
            int iIndexOf2 = str.indexOf(">>>");
            textView.setText(i0g0.b0(str.replace("<<<", "").replace(">>>", ""), vwb.f0(new String[]{(iIndexOf <= 0 || iIndexOf2 <= 0) ? "" : str.substring(iIndexOf, iIndexOf2).substring(3)}), ura.e().d().I4() ? a1c0.j : a1c0.E, eqh0.m3924c(3)));
            textView.setOnClickListener(new View.OnClickListener() { // from class: l.edq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f3256a.m1712k(view);
                }
            });
        } else if (TEnum.equals(message.messageType(), "profile_cover_comment") || TEnum.equals(message.messageType(), "profile_cover_like") || TEnum.equals(message.messageType(), "mood_like") || TEnum.equals(message.messageType(), "mood_comment")) {
            textView.setText(getContext().getResources().getString(R.string.N4));
        } else {
            textView.setText(CoreModule.P().i().P5(message));
        }
        boolean zM5278V = dmlVar instanceof j000 ? ((j000) dmlVar).m5278V(message) : false;
        if (CoreModule.P().i().G1() && !zM5278V && CoreModule.P().i().l() && CoreModule.H().userId().equals(message.owner) && TEnum.equals(message.messageType, TextBundle.TEXT_ENTRY)) {
            String str2 = CoreModule.P().i().P5(message) + " " + m1713j().getString(R.string.R4);
            ArrayList arrayListM = vwb.M(m1713j().getString(R.string.R4));
            if (ura.e().d().I4()) {
                color = a1c0.j;
            } else {
                color = CoreModule.P().i().G1() ? a1c0.E : Color.parseColor("#006DF7");
            }
            SpannableStringBuilder spannableStringBuilderB0 = i0g0.b0(str2, arrayListM, color, eqh0.m3924c(3));
            C0091a c0091a = new C0091a(message);
            String str3 = CoreModule.P().i().P5(message) + " " + m1713j().getString(R.string.R4);
            spannableStringBuilderB0.setSpan(c0091a, str3.indexOf(m1713j().getString(R.string.R4)), str3.length(), 33);
            textView.setText(spannableStringBuilderB0);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setHighlightColor(CoreModule.b.getResources().getColor(a1c0.Y));
        }
    }

    /* JADX INFO: renamed from: j */
    public MessagesAct m1713j() {
        return (MessagesAct) getContext();
    }

    public ItemRecalled(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemRecalled(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
