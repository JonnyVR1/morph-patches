package com.p051p1.mobile.putong.core.p058ui.messages.model.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.gt0;
import p153l.i46;
import p153l.i4g0;
import p153l.j46;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class ConvNextView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f32940c;

    /* JADX INFO: renamed from: d */
    public VFrame f32941d;

    /* JADX INFO: renamed from: e */
    public final String f32942e;

    /* JADX INFO: renamed from: f */
    public boolean f32943f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.view.ConvNextView$a */
    public class ViewOnClickListenerC8734a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessagesAct f32944a;

        public ViewOnClickListenerC8734a(MessagesAct messagesAct) {
            this.f32944a = messagesAct;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i46.m138395c().m138400f();
            i4g0.m138520r(ConvNextView.this.f32942e, OMSDialogPositon.p_chat_view);
            if (i46.m138395c().m138398d(this.f32944a.f32488f.f82474c)) {
                List<String> listM138397b = i46.m138395c().m138397b();
                String str = listM138397b.get(listM138397b.indexOf(this.f32944a.f32488f.f82474c) + 1);
                i46.m138395c().m138402h(this.f32944a.f32488f.f82474c);
                this.f32944a.startActivity(MessagesAct.m50127l2(this.f32944a, str, false, false, 29));
                this.f32944a.lambda$debugItems$19();
            }
        }
    }

    public ConvNextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32942e = CoreModule.m30933P().m143405a().mo34540lh() ? "e_nextchat_unread" : "e_nextchat_noreply";
    }

    private void init() {
        if (getContext() instanceof MessagesAct) {
            MessagesAct messagesAct = (MessagesAct) getContext();
            if (NullChecker.m82486a(messagesAct.f32488f) && messagesAct.f32488f.m111019o3() != 29) {
                i46.m138395c().m138396a();
                return;
            }
            this.f32940c.setTypeface(Typeface.DEFAULT_BOLD);
            this.f32940c.setText(CoreModule.m30933P().m143405a().mo34540lh() ? "下一条未读" : " 下一条未回复");
            if (i46.m138395c().m138398d(messagesAct.f32488f.f82474c)) {
                setVisible(true);
            }
            bnl0.m105509E0(this, new ViewOnClickListenerC8734a(messagesAct));
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m50659Q(View view) {
        j46.m143402a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public void m50660R(boolean z) {
        if (this.f32943f == z) {
            return;
        }
        this.f32943f = z;
        int width = getWidth();
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        float fM175859d = z ? 0.0f : width - qa00.m175859d(36.0f);
        float fM175859d2 = z ? width - qa00.m175859d(36.0f) : 0.0f;
        Property property = View.TRANSLATION_X;
        gt0.m132180z(gt0.m132166l(this, property, 0L, 300L, linearInterpolator, fM175859d, fM175859d2), gt0.m132166l(this.f32941d, property, 0L, 300L, new LinearInterpolator(), z ? 0.0f : qa00.m175859d(36.0f) - width, z ? qa00.m175859d(36.0f) - width : 0.0f), gt0.m132166l(this.f32940c, property, 0L, 300L, new LinearInterpolator(), z ? 0.0f : width - qa00.m175859d(36.0f), z ? width - qa00.m175859d(36.0f) : 0.0f)).start();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50659Q(this);
        init();
    }

    public void setMarginBottom(int i) {
        if (bnl0.m105529O0(this)) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams.setMargins(0, 0, 0, qa00.m175859d(i));
            setLayoutParams(layoutParams);
        }
    }

    public void setVisible(boolean z) {
        if (bnl0.m105529O0(this) == z) {
            return;
        }
        if (z) {
            if (i46.m138395c().m138399e()) {
                return;
            }
            i46.m138395c().m138401g();
            i4g0.m138526x(this.f32942e, OMSDialogPositon.p_chat_view);
        }
        bnl0.m105524M(this, z);
    }

    public ConvNextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ConvNextView(Context context) {
        this(context, null);
    }
}
