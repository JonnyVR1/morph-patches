package com.p000p1.mobile.putong.core.p001ui.intl.greet.message;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.data.BreakIce;
import com.p000p1.mobile.putong.core.data.Message;
import com.p000p1.mobile.putong.core.data.MessageType;
import com.p000p1.mobile.putong.core.message.R$string;
import com.p000p1.mobile.putong.core.p001ui.intl.greet.IntlGreetAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.hvc0;
import l.zvf0;
import p003l.xpn;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class IntlItemBreakIceMessage extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public IntlItemBreakIceMessage f2187a;

    /* JADX INFO: renamed from: b */
    public VText f2188b;

    /* JADX INFO: renamed from: c */
    public VText f2189c;

    /* JADX INFO: renamed from: d */
    public VText f2190d;

    /* JADX INFO: renamed from: e */
    public InterfaceC3153a f2191e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.intl.greet.message.IntlItemBreakIceMessage$a */
    public interface InterfaceC3153a {
        /* JADX INFO: renamed from: a */
        void mo3549a(Message message);
    }

    public IntlItemBreakIceMessage(Context context) {
        super(context);
        this.f2191e = null;
    }

    /* JADX INFO: renamed from: c */
    public final void m3543c(View view) {
        xpn.m10941a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final void m3544d(String str) {
        zvf0.r("e_intl_ilike_im_icebreak", str);
    }

    /* JADX INFO: renamed from: e */
    public final Message m3545e(String str) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        messageNew_.value = str;
        return messageNew_;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m3546f(IntlGreetAct intlGreetAct, View view) {
        m3544d(intlGreetAct.pageId());
        if (NullChecker.a(this.f2191e)) {
            this.f2191e.mo3549a(m3545e(this.f2189c.getText().toString()));
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m3547g(IntlGreetAct intlGreetAct, View view) {
        m3544d(intlGreetAct.pageId());
        if (NullChecker.a(this.f2191e)) {
            this.f2191e.mo3549a(m3545e(this.f2190d.getText().toString()));
        }
    }

    /* JADX INFO: renamed from: h */
    public void m3548h(User user, final IntlGreetAct intlGreetAct) {
        if (NullChecker.a(user) && NullChecker.a(intlGreetAct.getPresenter())) {
            ArrayList arrayListLs = CoreModule.P().b().Ls(2, user.gender);
            if (!NullChecker.a(arrayListLs) || arrayListLs.size() < 2) {
                return;
            }
            this.f2188b.setText(hvc0.c(R$string.f798z3));
            this.f2189c.setText(((BreakIce) arrayListLs.get(0)).content);
            this.f2190d.setText(((BreakIce) arrayListLs.get(1)).content);
            this.f2189c.setOnClickListener(new View.OnClickListener() { // from class: l.vpn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8022a.m3546f(intlGreetAct, view);
                }
            });
            this.f2190d.setOnClickListener(new View.OnClickListener() { // from class: l.wpn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8215a.m3547g(intlGreetAct, view);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m3543c(this);
        VText vText = this.f2189c;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f2190d.setTypeface(typeface);
    }

    public IntlItemBreakIceMessage(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2191e = null;
    }

    public IntlItemBreakIceMessage(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2191e = null;
    }
}
