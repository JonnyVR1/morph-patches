package p147v;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import p149l.eqh0;

/* JADX INFO: loaded from: classes3.dex */
public class VRadioButton extends AppCompatRadioButton {
    public VRadioButton(Context context) {
        super(context);
        m223166a(context, null, 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m223166a(Context context, AttributeSet attributeSet, int i) {
        eqh0.m117750a(this, context, attributeSet, i);
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        eqh0.m117751b(this, context, i);
    }

    public VRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m223166a(context, attributeSet, 0);
    }

    public VRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m223166a(context, attributeSet, i);
    }
}
