package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.data.BreakIce;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import java.util.List;
import p147v.VText;
import p149l.a1c0;
import p149l.dml;
import p149l.hvc0;
import p149l.ura;
import p149l.vwb;
import p149l.y5q;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemLoveBuzzBreakIceMessage extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ItemLoveBuzzBreakIceMessage f31106a;

    /* JADX INFO: renamed from: b */
    public VText f31107b;

    /* JADX INFO: renamed from: c */
    public VText f31108c;

    /* JADX INFO: renamed from: d */
    public VText f31109d;

    /* JADX INFO: renamed from: e */
    public HashSet<String> f31110e;

    public ItemLoveBuzzBreakIceMessage(Context context) {
        super(context);
        this.f31110e = new HashSet<>();
    }

    /* JADX INFO: renamed from: c */
    public final void m48288c(View view) {
        y5q.m213009a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final void m48289d() {
        zvf0.m220396r("e_intl_buzz_message_guide", OMSDialogPositon.p_chat_view);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m48290e(MessagesAct messagesAct, View view) {
        m48289d();
        messagesAct.f31640f.m120708S6(this.f31108c.getText().toString());
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m48291f(MessagesAct messagesAct, View view) {
        m48289d();
        messagesAct.f31640f.m120708S6(this.f31109d.getText().toString());
    }

    /* JADX INFO: renamed from: g */
    public void m48292g(final MessagesAct messagesAct, dml dmlVar, Message message) {
        if (NullChecker.m81303a(message) && NullChecker.m81303a(message.additionalData) && !vwb.m200296J(message.additionalData.localBreakIce)) {
            List<BreakIce> list = message.additionalData.localBreakIce;
            this.f31107b.setText(hvc0.m133156c(R$string.f21136z3));
            this.f31108c.setText(list.get(0).content);
            this.f31109d.setText(list.get(1).content);
            this.f31108c.setOnClickListener(new View.OnClickListener() { // from class: l.w5q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f184734a.m48290e(messagesAct, view);
                }
            });
            this.f31109d.setOnClickListener(new View.OnClickListener() { // from class: l.x5q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f191178a.m48291f(messagesAct, view);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48288c(this);
        VText vText = this.f31108c;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f31109d.setTypeface(typeface);
        zvf0.m220402x("e_intl_buzz_message_guide", OMSDialogPositon.p_chat_view);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f31107b.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f31108c.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f31109d.setTextColor(getResources().getColor(a1c0.f67153g));
        }
    }

    public ItemLoveBuzzBreakIceMessage(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31110e = new HashSet<>();
    }

    public ItemLoveBuzzBreakIceMessage(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31110e = new HashSet<>();
    }
}
