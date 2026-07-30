package com.p000p1.mobile.putong.core.p001ui.messages;

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
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.Media;
import com.tantanapp.common.data.DbObject;
import java.util.List;
import l.a1c0;
import l.i0g0;
import l.knb0;
import l.ura;
import l.vwb;
import l.y4c0;
import l.zvf0;
import p003l.eqh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemMomentPostGuide extends LinearLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: a */
    public String f1205a;

    /* JADX INFO: renamed from: b */
    public boolean f1206b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemMomentPostGuide$a */
    public class C0090a extends ClickableSpan {
        public C0090a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            zvf0.r("e_chat_post_guide", "p_chat_view");
            CoreModule.N().toCaptionPage(ItemMomentPostGuide.this.m1615a(), vwb.f0(new Media[0]), true, "p_chat_view");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(ItemMomentPostGuide.this.getResources().getColor(a1c0.D));
        }
    }

    public ItemMomentPostGuide(Context context) {
        super(context);
        this.f1205a = null;
        this.f1206b = false;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
        TextView textView = (TextView) findViewById(y4c0.A4);
        if (ura.e().d().I4()) {
            textView.setTextColor(getResources().getColor(a1c0.i));
        }
        if (!TextUtils.equals(this.f1205a, ((DbObject) message).id)) {
            this.f1205a = ((DbObject) message).id;
            this.f1206b = false;
        }
        if (!this.f1206b) {
            this.f1206b = true;
            zvf0.x("e_chat_post_guide", "p_chat_view");
        }
        SpannableStringBuilder spannableStringBuilderB0 = i0g0.b0("发布动态 分享生活拉近距离，更容易得到回应", vwb.M("发布动态"), ura.e().d().I4() ? a1c0.j : a1c0.E, eqh0.m3924c(3));
        spannableStringBuilderB0.setSpan(new C0090a(), 0, 4, 33);
        textView.setText(spannableStringBuilderB0);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(CoreModule.b.getResources().getColor(a1c0.Y));
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public MessagesAct m1615a() {
        return (MessagesAct) getContext();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1206b = false;
    }

    public ItemMomentPostGuide(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1205a = null;
        this.f1206b = false;
    }

    public ItemMomentPostGuide(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1205a = null;
        this.f1206b = false;
    }

    public ItemMomentPostGuide(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1205a = null;
        this.f1206b = false;
    }
}
