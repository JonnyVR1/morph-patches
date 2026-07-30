package com.p051p1.mobile.putong.core.p058ui.messages;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.view.MessageInputBaseEditView;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p153l.clz;
import p153l.d3z;
import p153l.edc0;
import p153l.g900;
import p153l.g9c0;
import p153l.gta;
import p153l.i4g0;
import p153l.ibc0;
import p153l.jyb;
import p153l.lyh0;
import p153l.pol;
import p153l.q8g0;
import p153l.uxj0;
import p153l.yxz;

/* JADX INFO: loaded from: classes3.dex */
public class ItemRecalled extends ItemBase {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemRecalled$a */
    public class C8671a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Message f32294a;

        public C8671a(Message message) {
            this.f32294a = message;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            if (ItemMessageBase.m49495Y(ItemRecalled.this.getContext())) {
                return;
            }
            MessageBar messageBarM114041t0 = ItemRecalled.this.m49812j().f32488f.m143372e0().mo50138B0().m143374g0().m114041t0();
            if (NullChecker.m82486a(messageBarM114041t0) && messageBarM114041t0.getVisibility() == 8) {
                return;
            }
            i4g0.m138520r("e_message_re_edit", OMSDialogPositon.p_chat_view);
            d3z d3zVarM143374g0 = ((MessagesAct) ItemRecalled.this.getContext()).mo50138B0().m143374g0();
            MessageInputBaseEditView bar_center_text = d3zVarM143374g0.m114041t0().getBar_center_text();
            bar_center_text.append(this.f32294a.value);
            bar_center_text.requestFocus();
            bar_center_text.setSelection(bar_center_text.length());
            ItemRecalled.this.m49812j().showInput(bar_center_text, 0);
            if (NullChecker.m82486a(d3zVarM143374g0.m114043u0()) && d3zVarM143374g0.m114043u0().m101199d0()) {
                d3zVarM143374g0.m114043u0().m101174G();
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(ItemRecalled.this.getResources().getColor(g9c0.f102786D));
        }
    }

    public ItemRecalled(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m49811k(View view) {
        if (ItemMessageBase.m49495Y(getContext())) {
            return;
        }
        MessageBar messageBarM114041t0 = m49812j().f32488f.m143372e0().mo50138B0().m143374g0().m114041t0();
        if (NullChecker.m82486a(messageBarM114041t0) && messageBarM114041t0.getVisibility() == 8) {
            return;
        }
        clz.f82443F0.m137019l(uxj0.f181467a);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.ItemBase
    /* JADX INFO: renamed from: g */
    public void mo49217g(pol polVar, Message message, Message message2, Message message3) {
        int color;
        super.mo49217g(polVar, message, message2, message3);
        TextView textView = (TextView) findViewById(edc0.f93168A4);
        if ((getContext() instanceof MessagesAct) && (((MessagesAct) getContext()).f32488f.m111048t7() instanceof yxz)) {
            if (((yxz) ((MessagesAct) getContext()).f32488f.m111048t7()).f202025M1) {
                textView.setBackground(getResources().getDrawable(ibc0.f113900R4));
                textView.setTextColor(getContext().getResources().getColor(g9c0.f102810a0));
            } else {
                textView.setTextColor(getContext().getResources().getColor(gta.m132210e().m132214d().mo34702I4() ? g9c0.f102819i : g9c0.f102821k));
                textView.setBackgroundColor(0);
            }
        }
        if (!TextUtils.isEmpty(message.recalledReason) && !TextUtils.isEmpty(message.recalledHint) && CoreModule.m30929H().userId().equals(message.owner)) {
            String str = message.recalledHint;
            int iIndexOf = str.indexOf("<<<");
            int iIndexOf2 = str.indexOf(">>>");
            textView.setText(q8g0.m175796b0(str.replace("<<<", "").replace(">>>", ""), jyb.m147507f0((iIndexOf <= 0 || iIndexOf2 <= 0) ? "" : str.substring(iIndexOf, iIndexOf2).substring(3)), gta.m132210e().m132214d().mo34702I4() ? g9c0.f102820j : g9c0.f102787E, lyh0.m156283c(3)));
            textView.setOnClickListener(new View.OnClickListener() { // from class: l.efq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f93815a.m49811k(view);
                }
            });
        } else if (TEnum.equals(message.messageType(), "profile_cover_comment") || TEnum.equals(message.messageType(), "profile_cover_like") || TEnum.equals(message.messageType(), "mood_like") || TEnum.equals(message.messageType(), "mood_comment")) {
            textView.setText(getContext().getResources().getString(R$string.f21559N4));
        } else {
            textView.setText(CoreModule.m30933P().m143412i().mo180378P5(message));
        }
        boolean zM129490V = polVar instanceof g900 ? ((g900) polVar).m129490V(message) : false;
        if (CoreModule.m30933P().m143412i().mo180325G1() && !zM129490V && CoreModule.m30933P().m143412i().mo180495l() && CoreModule.m30929H().userId().equals(message.owner) && TEnum.equals(message.messageType, "text")) {
            String str2 = CoreModule.m30933P().m143412i().mo180378P5(message) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + m49812j().getString(R$string.f21591R4);
            ArrayList arrayListM147482M = jyb.m147482M(m49812j().getString(R$string.f21591R4));
            if (gta.m132210e().m132214d().mo34702I4()) {
                color = g9c0.f102820j;
            } else {
                color = CoreModule.m30933P().m143412i().mo180325G1() ? g9c0.f102787E : Color.parseColor("#006DF7");
            }
            SpannableStringBuilder spannableStringBuilderM175796b0 = q8g0.m175796b0(str2, arrayListM147482M, color, lyh0.m156283c(3));
            C8671a c8671a = new C8671a(message);
            String str3 = CoreModule.m30933P().m143412i().mo180378P5(message) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + m49812j().getString(R$string.f21591R4);
            spannableStringBuilderM175796b0.setSpan(c8671a, str3.indexOf(m49812j().getString(R$string.f21591R4)), str3.length(), 33);
            textView.setText(spannableStringBuilderM175796b0);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setHighlightColor(CoreModule.f18263b.getResources().getColor(g9c0.f102807Y));
        }
    }

    /* JADX INFO: renamed from: j */
    public MessagesAct m49812j() {
        return (MessagesAct) getContext();
    }

    public ItemRecalled(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemRecalled(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
