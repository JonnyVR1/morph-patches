package com.p051p1.mobile.putong.core.p058ui.messages.aichat;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p151v.VText;
import p153l.l51;

/* JADX INFO: loaded from: classes3.dex */
public class TextTypeView extends VText {

    /* JADX INFO: renamed from: i */
    public String f32602i;

    /* JADX INFO: renamed from: j */
    public int f32603j;

    /* JADX INFO: renamed from: k */
    public InterfaceC8686b f32604k;

    /* JADX INFO: renamed from: l */
    public final Runnable f32605l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.aichat.TextTypeView$a */
    public class RunnableC8685a implements Runnable {
        public RunnableC8685a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = TextTypeView.this.f32603j;
            int length = TextTypeView.this.f32602i.length();
            TextTypeView textTypeView = TextTypeView.this;
            if (i < length) {
                textTypeView.f32603j++;
                TextTypeView textTypeView2 = TextTypeView.this;
                textTypeView2.setText(textTypeView2.f32602i.substring(0, TextTypeView.this.f32603j));
                l51.m152888H(TextTypeView.this.getContext(), TextTypeView.this.f32605l, 50L);
                return;
            }
            textTypeView.setText(textTypeView.f32602i);
            TextTypeView.this.f32603j = 0;
            if (NullChecker.m82486a(TextTypeView.this.f32604k)) {
                TextTypeView.this.f32604k.mo50231a();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.aichat.TextTypeView$b */
    public interface InterfaceC8686b {
        /* JADX INFO: renamed from: a */
        void mo50231a();
    }

    public TextTypeView(Context context) {
        super(context);
        this.f32602i = "";
        this.f32603j = 0;
        this.f32605l = new RunnableC8685a();
    }

    public void setListener(InterfaceC8686b interfaceC8686b) {
        this.f32604k = interfaceC8686b;
    }

    public void setTextAnim(String str) {
        this.f32602i = str;
        if (l51.m152909o(this.f32605l) || this.f32603j != 0) {
            return;
        }
        setText("");
        this.f32603j = 0;
        l51.m152886F(getContext(), this.f32605l);
    }

    public TextTypeView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32602i = "";
        this.f32603j = 0;
        this.f32605l = new RunnableC8685a();
    }

    public TextTypeView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32602i = "";
        this.f32603j = 0;
        this.f32605l = new RunnableC8685a();
    }
}
