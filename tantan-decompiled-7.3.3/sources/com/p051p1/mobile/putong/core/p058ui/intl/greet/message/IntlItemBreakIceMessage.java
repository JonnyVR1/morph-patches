package com.p051p1.mobile.putong.core.p058ui.intl.greet.message;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.BreakIce;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.intl.greet.IntlGreetAct;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p151v.VText;
import p153l.i4g0;
import p153l.k3d0;
import p153l.xrn;

/* JADX INFO: loaded from: classes3.dex */
public class IntlItemBreakIceMessage extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public IntlItemBreakIceMessage f30641a;

    /* JADX INFO: renamed from: b */
    public VText f30642b;

    /* JADX INFO: renamed from: c */
    public VText f30643c;

    /* JADX INFO: renamed from: d */
    public VText f30644d;

    /* JADX INFO: renamed from: e */
    public InterfaceC8541a f30645e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.intl.greet.message.IntlItemBreakIceMessage$a */
    public interface InterfaceC8541a {
        /* JADX INFO: renamed from: a */
        void mo47364a(Message message);
    }

    public IntlItemBreakIceMessage(Context context) {
        super(context);
        this.f30645e = null;
    }

    /* JADX INFO: renamed from: c */
    public final void m47358c(View view) {
        xrn.m212844a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final void m47359d(String str) {
        i4g0.m138520r("e_intl_ilike_im_icebreak", str);
    }

    /* JADX INFO: renamed from: e */
    public final Message m47360e(String str) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        messageNew_.value = str;
        return messageNew_;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m47361f(IntlGreetAct intlGreetAct, View view) {
        m47359d(intlGreetAct.pageId());
        if (NullChecker.m82486a(this.f30645e)) {
            this.f30645e.mo47364a(m47360e(this.f30643c.getText().toString()));
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m47362g(IntlGreetAct intlGreetAct, View view) {
        m47359d(intlGreetAct.pageId());
        if (NullChecker.m82486a(this.f30645e)) {
            this.f30645e.mo47364a(m47360e(this.f30644d.getText().toString()));
        }
    }

    /* JADX INFO: renamed from: h */
    public void m47363h(User user, final IntlGreetAct intlGreetAct) {
        if (NullChecker.m82486a(user) && NullChecker.m82486a(intlGreetAct.getPresenter())) {
            ArrayList<BreakIce> arrayListMo36101Ls = CoreModule.m30933P().m143406b().mo36101Ls(2, user.gender);
            if (!NullChecker.m82486a(arrayListMo36101Ls) || arrayListMo36101Ls.size() < 2) {
                return;
            }
            this.f30642b.setText(k3d0.m148007c(R$string.f21878z3));
            this.f30643c.setText(arrayListMo36101Ls.get(0).content);
            this.f30644d.setText(arrayListMo36101Ls.get(1).content);
            this.f30643c.setOnClickListener(new View.OnClickListener() { // from class: l.vrn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f185502a.m47361f(intlGreetAct, view);
                }
            });
            this.f30644d.setOnClickListener(new View.OnClickListener() { // from class: l.wrn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f190535a.m47362g(intlGreetAct, view);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47358c(this);
        VText vText = this.f30643c;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f30644d.setTypeface(typeface);
    }

    public IntlItemBreakIceMessage(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30645e = null;
    }

    public IntlItemBreakIceMessage(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30645e = null;
    }
}
