package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.data.BreakIce;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import java.util.List;
import p151v.VText;
import p153l.g9c0;
import p153l.gta;
import p153l.i4g0;
import p153l.jyb;
import p153l.k3d0;
import p153l.pol;
import p153l.y7q;

/* JADX INFO: loaded from: classes3.dex */
public class ItemLoveBuzzBreakIceMessage extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ItemLoveBuzzBreakIceMessage f31954a;

    /* JADX INFO: renamed from: b */
    public VText f31955b;

    /* JADX INFO: renamed from: c */
    public VText f31956c;

    /* JADX INFO: renamed from: d */
    public VText f31957d;

    /* JADX INFO: renamed from: e */
    public HashSet<String> f31958e;

    public ItemLoveBuzzBreakIceMessage(Context context) {
        super(context);
        this.f31958e = new HashSet<>();
    }

    /* JADX INFO: renamed from: c */
    public final void m49471c(View view) {
        y7q.m214591a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final void m49472d() {
        i4g0.m138520r("e_intl_buzz_message_guide", OMSDialogPositon.p_chat_view);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m49473e(MessagesAct messagesAct, View view) {
        m49472d();
        messagesAct.f32488f.m110914S6(this.f31956c.getText().toString());
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m49474f(MessagesAct messagesAct, View view) {
        m49472d();
        messagesAct.f32488f.m110914S6(this.f31957d.getText().toString());
    }

    /* JADX INFO: renamed from: g */
    public void m49475g(final MessagesAct messagesAct, pol polVar, Message message) {
        if (NullChecker.m82486a(message) && NullChecker.m82486a(message.additionalData) && !jyb.m147479J(message.additionalData.localBreakIce)) {
            List<BreakIce> list = message.additionalData.localBreakIce;
            this.f31955b.setText(k3d0.m148007c(R$string.f21878z3));
            this.f31956c.setText(list.get(0).content);
            this.f31957d.setText(list.get(1).content);
            this.f31956c.setOnClickListener(new View.OnClickListener() { // from class: l.w7q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f187775a.m49473e(messagesAct, view);
                }
            });
            this.f31957d.setOnClickListener(new View.OnClickListener() { // from class: l.x7q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f192741a.m49474f(messagesAct, view);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49471c(this);
        VText vText = this.f31956c;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f31957d.setTypeface(typeface);
        i4g0.m138526x("e_intl_buzz_message_guide", OMSDialogPositon.p_chat_view);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f31955b.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f31956c.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f31957d.setTextColor(getResources().getColor(g9c0.f102817g));
        }
    }

    public ItemLoveBuzzBreakIceMessage(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31958e = new HashSet<>();
    }

    public ItemLoveBuzzBreakIceMessage(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31958e = new HashSet<>();
    }
}
