package p028v;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import p003l.eqh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VRadioButton extends AppCompatRadioButton {
    public VRadioButton(Context context) {
        super(context);
        m11648a(context, null, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m11648a(Context context, AttributeSet attributeSet, int i) {
        eqh0.m3922a(this, context, attributeSet, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTextAppearance(Context context, int i) {
        super/*android.widget.TextView*/.setTextAppearance(context, i);
        eqh0.m3923b(this, context, i);
    }

    public VRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m11648a(context, attributeSet, 0);
    }

    public VRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m11648a(context, attributeSet, i);
    }
}
