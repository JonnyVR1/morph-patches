package p149l;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class u5j extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    public int f174717a;

    /* JADX INFO: renamed from: b */
    public d30 f174718b;

    public u5j(int i, d30 d30Var) {
        this.f174717a = i;
        this.f174718b = d30Var;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        if (NullChecker.m81303a(this.f174718b)) {
            this.f174718b.call();
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.f174717a);
    }
}
