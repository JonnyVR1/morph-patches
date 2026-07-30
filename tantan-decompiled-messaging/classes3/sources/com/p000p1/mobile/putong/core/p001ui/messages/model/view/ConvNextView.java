package com.p000p1.mobile.putong.core.p001ui.messages.model.view;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.bt0;
import l.d36;
import l.e36;
import l.t100;
import l.xdl0;
import l.zvf0;
import p028v.VFrame;
import p028v.VLinear;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ConvNextView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f1983c;

    /* JADX INFO: renamed from: d */
    public VFrame f1984d;

    /* JADX INFO: renamed from: e */
    public final String f1985e;

    /* JADX INFO: renamed from: f */
    public boolean f1986f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.view.ConvNextView$a */
    public class ViewOnClickListenerC0154a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessagesAct f1987a;

        public ViewOnClickListenerC0154a(MessagesAct messagesAct) {
            this.f1987a = messagesAct;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d36.c().f();
            zvf0.r(ConvNextView.this.f1985e, "p_chat_view");
            if (d36.c().d(this.f1987a.f1531f.f3543c)) {
                List listB = d36.c().b();
                String str = (String) listB.get(listB.indexOf(this.f1987a.f1531f.f3543c) + 1);
                d36.c().h(this.f1987a.f1531f.f3543c);
                this.f1987a.startActivity(MessagesAct.m2036k2(this.f1987a, str, false, false, 29));
                this.f1987a.finish();
            }
        }
    }

    public ConvNextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1985e = CoreModule.P().a().lh() ? "e_nextchat_unread" : "e_nextchat_noreply";
    }

    private void init() {
        if (getContext() instanceof MessagesAct) {
            MessagesAct messagesAct = (MessagesAct) getContext();
            if (NullChecker.a(messagesAct.f1531f) && messagesAct.f1531f.m4280o3() != 29) {
                d36.c().a();
                return;
            }
            this.f1983c.setTypeface(Typeface.DEFAULT_BOLD);
            this.f1983c.setText(CoreModule.P().a().lh() ? "下一条未读" : " 下一条未回复");
            if (d36.c().d(messagesAct.f1531f.f3543c)) {
                setVisible(true);
            }
            xdl0.E0(this, new ViewOnClickListenerC0154a(messagesAct));
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m2623Q(View view) {
        e36.a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public void m2624R(boolean z) {
        if (this.f1986f == z) {
            return;
        }
        this.f1986f = z;
        int width = getWidth();
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        float fD = z ? 0.0f : width - t100.d(36.0f);
        float fD2 = z ? width - t100.d(36.0f) : 0.0f;
        Property property = View.TRANSLATION_X;
        bt0.z(new Animator[]{bt0.l(this, property, 0L, 300L, linearInterpolator, new float[]{fD, fD2}), bt0.l(this.f1984d, property, 0L, 300L, new LinearInterpolator(), new float[]{z ? 0.0f : t100.d(36.0f) - width, z ? t100.d(36.0f) - width : 0.0f}), bt0.l(this.f1983c, property, 0L, 300L, new LinearInterpolator(), new float[]{z ? 0.0f : width - t100.d(36.0f), z ? width - t100.d(36.0f) : 0.0f})}).start();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2623Q(this);
        init();
    }

    public void setMarginBottom(int i) {
        if (xdl0.O0(this)) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams.setMargins(0, 0, 0, t100.d(i));
            setLayoutParams(layoutParams);
        }
    }

    public void setVisible(boolean z) {
        if (xdl0.O0(this) == z) {
            return;
        }
        if (z) {
            if (d36.c().e()) {
                return;
            }
            d36.c().g();
            zvf0.x(this.f1985e, "p_chat_view");
        }
        xdl0.M(this, z);
    }

    public ConvNextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ConvNextView(Context context) {
        this(context, null);
    }
}
