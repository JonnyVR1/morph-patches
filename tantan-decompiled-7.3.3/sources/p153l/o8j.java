package p153l;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class o8j extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    public int f145416a;

    /* JADX INFO: renamed from: b */
    public x20 f145417b;

    public o8j(int i, x20 x20Var) {
        this.f145416a = i;
        this.f145417b = x20Var;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        if (NullChecker.m82486a(this.f145417b)) {
            this.f145417b.call();
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.f145416a);
    }
}
