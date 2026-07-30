package com.p046p1.mobile.putong.core.p053ui.intl.greet.message;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.BreakIce;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.intl.greet.IntlGreetAct;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.VText;
import p149l.hvc0;
import p149l.xpn;
import p149l.zvf0;

/* JADX INFO: loaded from: classes10.dex */
public class IntlItemBreakIceMessage extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public IntlItemBreakIceMessage f29793a;

    /* JADX INFO: renamed from: b */
    public VText f29794b;

    /* JADX INFO: renamed from: c */
    public VText f29795c;

    /* JADX INFO: renamed from: d */
    public VText f29796d;

    /* JADX INFO: renamed from: e */
    public InterfaceC8378a f29797e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.intl.greet.message.IntlItemBreakIceMessage$a */
    public interface InterfaceC8378a {
        /* JADX INFO: renamed from: a */
        void mo46181a(Message message);
    }

    public IntlItemBreakIceMessage(Context context) {
        super(context);
        this.f29797e = null;
    }

    /* JADX INFO: renamed from: c */
    public final void m46175c(View view) {
        xpn.m210517a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final void m46176d(String str) {
        zvf0.m220396r("e_intl_ilike_im_icebreak", str);
    }

    /* JADX INFO: renamed from: e */
    public final Message m46177e(String str) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        messageNew_.value = str;
        return messageNew_;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m46178f(IntlGreetAct intlGreetAct, View view) {
        m46176d(intlGreetAct.pageId());
        if (NullChecker.m81303a(this.f29797e)) {
            this.f29797e.mo46181a(m46177e(this.f29795c.getText().toString()));
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m46179g(IntlGreetAct intlGreetAct, View view) {
        m46176d(intlGreetAct.pageId());
        if (NullChecker.m81303a(this.f29797e)) {
            this.f29797e.mo46181a(m46177e(this.f29796d.getText().toString()));
        }
    }

    /* JADX INFO: renamed from: h */
    public void m46180h(User user, final IntlGreetAct intlGreetAct) {
        if (NullChecker.m81303a(user) && NullChecker.m81303a(intlGreetAct.getPresenter())) {
            ArrayList<BreakIce> arrayListMo35098Ls = CoreModule.m29935P().m94652b().mo35098Ls(2, user.gender);
            if (!NullChecker.m81303a(arrayListMo35098Ls) || arrayListMo35098Ls.size() < 2) {
                return;
            }
            this.f29794b.setText(hvc0.m133156c(R$string.f21136z3));
            this.f29795c.setText(arrayListMo35098Ls.get(0).content);
            this.f29796d.setText(arrayListMo35098Ls.get(1).content);
            this.f29795c.setOnClickListener(new View.OnClickListener() { // from class: l.vpn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f182512a.m46178f(intlGreetAct, view);
                }
            });
            this.f29796d.setOnClickListener(new View.OnClickListener() { // from class: l.wpn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f187564a.m46179g(intlGreetAct, view);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46175c(this);
        VText vText = this.f29795c;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f29796d.setTypeface(typeface);
    }

    public IntlItemBreakIceMessage(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29797e = null;
    }

    public IntlItemBreakIceMessage(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29797e = null;
    }
}
