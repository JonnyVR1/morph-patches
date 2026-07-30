package com.p046p1.mobile.putong.core.p053ui.messages.model.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;
import p149l.bt0;
import p149l.d36;
import p149l.e36;
import p149l.t100;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ConvNextView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f32092c;

    /* JADX INFO: renamed from: d */
    public VFrame f32093d;

    /* JADX INFO: renamed from: e */
    public final String f32094e;

    /* JADX INFO: renamed from: f */
    public boolean f32095f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.view.ConvNextView$a */
    public class ViewOnClickListenerC8571a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessagesAct f32096a;

        public ViewOnClickListenerC8571a(MessagesAct messagesAct) {
            this.f32096a = messagesAct;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d36.m109868c().m109873f();
            zvf0.m220396r(ConvNextView.this.f32094e, OMSDialogPositon.p_chat_view);
            if (d36.m109868c().m109871d(this.f32096a.f31640f.f96911c)) {
                List<String> listM109870b = d36.m109868c().m109870b();
                String str = listM109870b.get(listM109870b.indexOf(this.f32096a.f31640f.f96911c) + 1);
                d36.m109868c().m109875h(this.f32096a.f31640f.f96911c);
                this.f32096a.startActivity(MessagesAct.m48944k2(this.f32096a, str, false, false, 29));
                this.f32096a.lambda$debugItems$19();
            }
        }
    }

    public ConvNextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32094e = CoreModule.m29935P().m94651a().mo33537lh() ? "e_nextchat_unread" : "e_nextchat_noreply";
    }

    private void init() {
        if (getContext() instanceof MessagesAct) {
            MessagesAct messagesAct = (MessagesAct) getContext();
            if (NullChecker.m81303a(messagesAct.f31640f) && messagesAct.f31640f.m120813o3() != 29) {
                d36.m109868c().m109869a();
                return;
            }
            this.f32092c.setTypeface(Typeface.DEFAULT_BOLD);
            this.f32092c.setText(CoreModule.m29935P().m94651a().mo33537lh() ? "下一条未读" : " 下一条未回复");
            if (d36.m109868c().m109871d(messagesAct.f31640f.f96911c)) {
                setVisible(true);
            }
            xdl0.m208329E0(this, new ViewOnClickListenerC8571a(messagesAct));
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m49476Q(View view) {
        e36.m114584a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public void m49477R(boolean z) {
        if (this.f32095f == z) {
            return;
        }
        this.f32095f = z;
        int width = getWidth();
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        float fM186890d = z ? 0.0f : width - t100.m186890d(36.0f);
        float fM186890d2 = z ? width - t100.m186890d(36.0f) : 0.0f;
        Property property = View.TRANSLATION_X;
        bt0.m103753z(bt0.m103739l(this, property, 0L, 300L, linearInterpolator, fM186890d, fM186890d2), bt0.m103739l(this.f32093d, property, 0L, 300L, new LinearInterpolator(), z ? 0.0f : t100.m186890d(36.0f) - width, z ? t100.m186890d(36.0f) - width : 0.0f), bt0.m103739l(this.f32092c, property, 0L, 300L, new LinearInterpolator(), z ? 0.0f : width - t100.m186890d(36.0f), z ? width - t100.m186890d(36.0f) : 0.0f)).start();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49476Q(this);
        init();
    }

    public void setMarginBottom(int i) {
        if (xdl0.m208349O0(this)) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams.setMargins(0, 0, 0, t100.m186890d(i));
            setLayoutParams(layoutParams);
        }
    }

    public void setVisible(boolean z) {
        if (xdl0.m208349O0(this) == z) {
            return;
        }
        if (z) {
            if (d36.m109868c().m109872e()) {
                return;
            }
            d36.m109868c().m109874g();
            zvf0.m220402x(this.f32094e, OMSDialogPositon.p_chat_view);
        }
        xdl0.m208344M(this, z);
    }

    public ConvNextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ConvNextView(Context context) {
        this(context, null);
    }
}
