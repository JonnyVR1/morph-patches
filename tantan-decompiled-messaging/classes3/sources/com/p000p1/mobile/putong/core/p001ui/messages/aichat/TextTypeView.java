package com.p000p1.mobile.putong.core.p001ui.messages.aichat;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import l.e51;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class TextTypeView extends VText {

    /* JADX INFO: renamed from: i */
    public String f1645i;

    /* JADX INFO: renamed from: j */
    public int f1646j;

    /* JADX INFO: renamed from: k */
    public InterfaceC0106b f1647k;

    /* JADX INFO: renamed from: l */
    public final Runnable f1648l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.aichat.TextTypeView$a */
    public class RunnableC0105a implements Runnable {
        public RunnableC0105a() {
        }

        /* JADX WARN: Type inference failed for: r0v9, types: [android.widget.TextView, com.p1.mobile.putong.core.ui.messages.aichat.TextTypeView] */
        /* JADX WARN: Type inference failed for: r2v0, types: [android.widget.TextView, com.p1.mobile.putong.core.ui.messages.aichat.TextTypeView] */
        @Override // java.lang.Runnable
        public void run() {
            int i = TextTypeView.this.f1646j;
            int length = TextTypeView.this.f1645i.length();
            ?? r2 = TextTypeView.this;
            if (i < length) {
                r2.f1646j++;
                ?? r0 = TextTypeView.this;
                r0.setText(r0.f1645i.substring(0, TextTypeView.this.f1646j));
                e51.H(TextTypeView.this.getContext(), TextTypeView.this.f1648l, 50L);
                return;
            }
            r2.setText(r2.f1645i);
            TextTypeView.this.f1646j = 0;
            if (NullChecker.a(TextTypeView.this.f1647k)) {
                TextTypeView.this.f1647k.mo2146a();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.aichat.TextTypeView$b */
    public interface InterfaceC0106b {
        /* JADX INFO: renamed from: a */
        void mo2146a();
    }

    public TextTypeView(Context context) {
        super(context);
        this.f1645i = "";
        this.f1646j = 0;
        this.f1648l = new RunnableC0105a();
    }

    public void setListener(InterfaceC0106b interfaceC0106b) {
        this.f1647k = interfaceC0106b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTextAnim(String str) {
        this.f1645i = str;
        if (e51.o(this.f1648l) || this.f1646j != 0) {
            return;
        }
        setText("");
        this.f1646j = 0;
        e51.F(getContext(), this.f1648l);
    }

    public TextTypeView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1645i = "";
        this.f1646j = 0;
        this.f1648l = new RunnableC0105a();
    }

    public TextTypeView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1645i = "";
        this.f1646j = 0;
        this.f1648l = new RunnableC0105a();
    }
}
