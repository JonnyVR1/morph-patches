package p007l;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tantanapp.common.utils.NullChecker;
import l.d30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class u5j extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    public int f13552a;

    /* JADX INFO: renamed from: b */
    public d30 f13553b;

    public u5j(int i, d30 d30Var) {
        this.f13552a = i;
        this.f13553b = d30Var;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        if (NullChecker.a(this.f13553b)) {
            this.f13553b.call();
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.f13552a);
    }
}
