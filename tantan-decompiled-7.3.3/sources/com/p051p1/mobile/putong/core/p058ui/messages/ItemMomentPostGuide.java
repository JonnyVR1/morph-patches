package com.p051p1.mobile.putong.core.p058ui.messages;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import java.util.List;
import p153l.edc0;
import p153l.g9c0;
import p153l.gta;
import p153l.i4g0;
import p153l.jyb;
import p153l.lyh0;
import p153l.ovb0;
import p153l.q8g0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemMomentPostGuide extends LinearLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public String f32162a;

    /* JADX INFO: renamed from: b */
    public boolean f32163b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemMomentPostGuide$a */
    public class C8670a extends ClickableSpan {
        public C8670a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            i4g0.m138520r("e_chat_post_guide", OMSDialogPositon.p_chat_view);
            CoreModule.m30932N().toCaptionPage(ItemMomentPostGuide.this.m49714a(), jyb.m147507f0(new Media[0]), true, OMSDialogPositon.p_chat_view);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(ItemMomentPostGuide.this.getResources().getColor(g9c0.f102786D));
        }
    }

    public ItemMomentPostGuide(Context context) {
        super(context);
        this.f32162a = null;
        this.f32163b = false;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        TextView textView = (TextView) findViewById(edc0.f93168A4);
        if (gta.m132210e().m132214d().mo34702I4()) {
            textView.setTextColor(getResources().getColor(g9c0.f102819i));
        }
        if (!TextUtils.equals(this.f32162a, message.f56859id)) {
            this.f32162a = message.f56859id;
            this.f32163b = false;
        }
        if (!this.f32163b) {
            this.f32163b = true;
            i4g0.m138526x("e_chat_post_guide", OMSDialogPositon.p_chat_view);
        }
        SpannableStringBuilder spannableStringBuilderM175796b0 = q8g0.m175796b0("发布动态 分享生活拉近距离，更容易得到回应", jyb.m147482M("发布动态"), gta.m132210e().m132214d().mo34702I4() ? g9c0.f102820j : g9c0.f102787E, lyh0.m156283c(3));
        spannableStringBuilderM175796b0.setSpan(new C8670a(), 0, 4, 33);
        textView.setText(spannableStringBuilderM175796b0);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(CoreModule.f18263b.getResources().getColor(g9c0.f102807Y));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public MessagesAct m49714a() {
        return (MessagesAct) getContext();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32163b = false;
    }

    public ItemMomentPostGuide(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32162a = null;
        this.f32163b = false;
    }

    public ItemMomentPostGuide(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32162a = null;
        this.f32163b = false;
    }

    public ItemMomentPostGuide(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f32162a = null;
        this.f32163b = false;
    }
}
