package com.p046p1.mobile.putong.core.p053ui.messages;

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
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.view.MessageInputBaseEditView;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p149l.a1c0;
import p149l.bpz;
import p149l.c3c0;
import p149l.dml;
import p149l.eqh0;
import p149l.fcz;
import p149l.guy;
import p149l.i0g0;
import p149l.j000;
import p149l.roj0;
import p149l.ura;
import p149l.vwb;
import p149l.y4c0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemRecalled extends ItemBase {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemRecalled$a */
    public class C8508a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Message f31446a;

        public C8508a(Message message) {
            this.f31446a = message;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            if (ItemMessageBase.m48312Y(ItemRecalled.this.getContext())) {
                return;
            }
            MessageBar messageBarM128210t0 = ItemRecalled.this.m48629j().f31640f.m156455e0().mo48954A0().m156457g0().m128210t0();
            if (NullChecker.m81303a(messageBarM128210t0) && messageBarM128210t0.getVisibility() == 8) {
                return;
            }
            zvf0.m220396r("e_message_re_edit", OMSDialogPositon.p_chat_view);
            guy guyVarM156457g0 = ((MessagesAct) ItemRecalled.this.getContext()).mo48954A0().m156457g0();
            MessageInputBaseEditView bar_center_text = guyVarM156457g0.m128210t0().getBar_center_text();
            bar_center_text.append(this.f31446a.value);
            bar_center_text.requestFocus();
            bar_center_text.setSelection(bar_center_text.length());
            ItemRecalled.this.m48629j().showInput(bar_center_text, 0);
            if (NullChecker.m81303a(guyVarM156457g0.m128212u0()) && guyVarM156457g0.m128212u0().m113220d0()) {
                guyVarM156457g0.m128212u0().m113195G();
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(ItemRecalled.this.getResources().getColor(a1c0.f67122D));
        }
    }

    public ItemRecalled(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m48628k(View view) {
        if (ItemMessageBase.m48312Y(getContext())) {
            return;
        }
        MessageBar messageBarM128210t0 = m48629j().f31640f.m156455e0().mo48954A0().m156457g0().m128210t0();
        if (NullChecker.m81303a(messageBarM128210t0) && messageBarM128210t0.getVisibility() == 8) {
            return;
        }
        fcz.f96880F0.m132487l(roj0.f160388a);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.ItemBase
    /* JADX INFO: renamed from: g */
    public void mo48034g(dml dmlVar, Message message, Message message2, Message message3) {
        int color;
        super.mo48034g(dmlVar, message, message2, message3);
        TextView textView = (TextView) findViewById(y4c0.f195933A4);
        if ((getContext() instanceof MessagesAct) && (((MessagesAct) getContext()).f31640f.m120842t7() instanceof bpz)) {
            if (((bpz) ((MessagesAct) getContext()).f31640f.m120842t7()).f76692M1) {
                textView.setBackground(getResources().getDrawable(c3c0.f78625R4));
                textView.setTextColor(getContext().getResources().getColor(a1c0.f67146a0));
            } else {
                textView.setTextColor(getContext().getResources().getColor(ura.m195053e().m195057d().mo33699I4() ? a1c0.f67155i : a1c0.f67157k));
                textView.setBackgroundColor(0);
            }
        }
        if (!TextUtils.isEmpty(message.recalledReason) && !TextUtils.isEmpty(message.recalledHint) && CoreModule.m29931H().userId().equals(message.owner)) {
            String str = message.recalledHint;
            int iIndexOf = str.indexOf("<<<");
            int iIndexOf2 = str.indexOf(">>>");
            textView.setText(i0g0.m133861b0(str.replace("<<<", "").replace(">>>", ""), vwb.m200324f0((iIndexOf <= 0 || iIndexOf2 <= 0) ? "" : str.substring(iIndexOf, iIndexOf2).substring(3)), ura.m195053e().m195057d().mo33699I4() ? a1c0.f67156j : a1c0.f67123E, eqh0.m117752c(3)));
            textView.setOnClickListener(new View.OnClickListener() { // from class: l.edq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f90638a.m48628k(view);
                }
            });
        } else if (TEnum.equals(message.messageType(), "profile_cover_comment") || TEnum.equals(message.messageType(), "profile_cover_like") || TEnum.equals(message.messageType(), "mood_like") || TEnum.equals(message.messageType(), "mood_comment")) {
            textView.setText(getContext().getResources().getString(R$string.f20817N4));
        } else {
            textView.setText(CoreModule.m29935P().m94658i().mo158286P5(message));
        }
        boolean zM139103V = dmlVar instanceof j000 ? ((j000) dmlVar).m139103V(message) : false;
        if (CoreModule.m29935P().m94658i().mo158233G1() && !zM139103V && CoreModule.m29935P().m94658i().mo158403l() && CoreModule.m29931H().userId().equals(message.owner) && TEnum.equals(message.messageType, "text")) {
            String str2 = CoreModule.m29935P().m94658i().mo158286P5(message) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + m48629j().getString(R$string.f20849R4);
            ArrayList arrayListM200299M = vwb.m200299M(m48629j().getString(R$string.f20849R4));
            if (ura.m195053e().m195057d().mo33699I4()) {
                color = a1c0.f67156j;
            } else {
                color = CoreModule.m29935P().m94658i().mo158233G1() ? a1c0.f67123E : Color.parseColor("#006DF7");
            }
            SpannableStringBuilder spannableStringBuilderM133861b0 = i0g0.m133861b0(str2, arrayListM200299M, color, eqh0.m117752c(3));
            C8508a c8508a = new C8508a(message);
            String str3 = CoreModule.m29935P().m94658i().mo158286P5(message) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + m48629j().getString(R$string.f20849R4);
            spannableStringBuilderM133861b0.setSpan(c8508a, str3.indexOf(m48629j().getString(R$string.f20849R4)), str3.length(), 33);
            textView.setText(spannableStringBuilderM133861b0);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setHighlightColor(CoreModule.f17544b.getResources().getColor(a1c0.f67143Y));
        }
    }

    /* JADX INFO: renamed from: j */
    public MessagesAct m48629j() {
        return (MessagesAct) getContext();
    }

    public ItemRecalled(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemRecalled(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
