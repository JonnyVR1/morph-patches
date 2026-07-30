package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import java.util.List;
import p149l.a1c0;
import p149l.eqh0;
import p149l.i0g0;
import p149l.knb0;
import p149l.ura;
import p149l.vwb;
import p149l.y4c0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemMomentPostGuide extends LinearLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public String f31314a;

    /* JADX INFO: renamed from: b */
    public boolean f31315b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemMomentPostGuide$a */
    public class C8507a extends ClickableSpan {
        public C8507a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            zvf0.m220396r("e_chat_post_guide", OMSDialogPositon.p_chat_view);
            CoreModule.m29934N().toCaptionPage(ItemMomentPostGuide.this.m48531a(), vwb.m200324f0(new Media[0]), true, OMSDialogPositon.p_chat_view);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(ItemMomentPostGuide.this.getResources().getColor(a1c0.f67122D));
        }
    }

    public ItemMomentPostGuide(Context context) {
        super(context);
        this.f31314a = null;
        this.f31315b = false;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        TextView textView = (TextView) findViewById(y4c0.f195933A4);
        if (ura.m195053e().m195057d().mo33699I4()) {
            textView.setTextColor(getResources().getColor(a1c0.f67155i));
        }
        if (!TextUtils.equals(this.f31314a, message.f56011id)) {
            this.f31314a = message.f56011id;
            this.f31315b = false;
        }
        if (!this.f31315b) {
            this.f31315b = true;
            zvf0.m220402x("e_chat_post_guide", OMSDialogPositon.p_chat_view);
        }
        SpannableStringBuilder spannableStringBuilderM133861b0 = i0g0.m133861b0("发布动态 分享生活拉近距离，更容易得到回应", vwb.m200299M("发布动态"), ura.m195053e().m195057d().mo33699I4() ? a1c0.f67156j : a1c0.f67123E, eqh0.m117752c(3));
        spannableStringBuilderM133861b0.setSpan(new C8507a(), 0, 4, 33);
        textView.setText(spannableStringBuilderM133861b0);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(CoreModule.f17544b.getResources().getColor(a1c0.f67143Y));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public MessagesAct m48531a() {
        return (MessagesAct) getContext();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31315b = false;
    }

    public ItemMomentPostGuide(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31314a = null;
        this.f31315b = false;
    }

    public ItemMomentPostGuide(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31314a = null;
        this.f31315b = false;
    }

    public ItemMomentPostGuide(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f31314a = null;
        this.f31315b = false;
    }
}
