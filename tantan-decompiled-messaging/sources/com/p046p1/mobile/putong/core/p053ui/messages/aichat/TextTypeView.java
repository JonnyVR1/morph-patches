package com.p046p1.mobile.putong.core.p053ui.messages.aichat;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p147v.VText;
import p149l.e51;

/* JADX INFO: loaded from: classes3.dex */
public class TextTypeView extends VText {

    /* JADX INFO: renamed from: i */
    public String f31754i;

    /* JADX INFO: renamed from: j */
    public int f31755j;

    /* JADX INFO: renamed from: k */
    public InterfaceC8523b f31756k;

    /* JADX INFO: renamed from: l */
    public final Runnable f31757l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.aichat.TextTypeView$a */
    public class RunnableC8522a implements Runnable {
        public RunnableC8522a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = TextTypeView.this.f31755j;
            int length = TextTypeView.this.f31754i.length();
            TextTypeView textTypeView = TextTypeView.this;
            if (i < length) {
                textTypeView.f31755j++;
                TextTypeView textTypeView2 = TextTypeView.this;
                textTypeView2.setText(textTypeView2.f31754i.substring(0, TextTypeView.this.f31755j));
                e51.m114743H(TextTypeView.this.getContext(), TextTypeView.this.f31757l, 50L);
                return;
            }
            textTypeView.setText(textTypeView.f31754i);
            TextTypeView.this.f31755j = 0;
            if (NullChecker.m81303a(TextTypeView.this.f31756k)) {
                TextTypeView.this.f31756k.mo49048a();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.aichat.TextTypeView$b */
    public interface InterfaceC8523b {
        /* JADX INFO: renamed from: a */
        void mo49048a();
    }

    public TextTypeView(Context context) {
        super(context);
        this.f31754i = "";
        this.f31755j = 0;
        this.f31757l = new RunnableC8522a();
    }

    public void setListener(InterfaceC8523b interfaceC8523b) {
        this.f31756k = interfaceC8523b;
    }

    public void setTextAnim(String str) {
        this.f31754i = str;
        if (e51.m114764o(this.f31757l) || this.f31755j != 0) {
            return;
        }
        setText("");
        this.f31755j = 0;
        e51.m114741F(getContext(), this.f31757l);
    }

    public TextTypeView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31754i = "";
        this.f31755j = 0;
        this.f31757l = new RunnableC8522a();
    }

    public TextTypeView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31754i = "";
        this.f31755j = 0;
        this.f31757l = new RunnableC8522a();
    }
}
