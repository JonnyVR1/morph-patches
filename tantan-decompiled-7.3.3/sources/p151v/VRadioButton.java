package p151v;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import p153l.lyh0;

/* JADX INFO: loaded from: classes3.dex */
public class VRadioButton extends AppCompatRadioButton {
    public VRadioButton(Context context) {
        super(context);
        m224412a(context, null, 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m224412a(Context context, AttributeSet attributeSet, int i) {
        lyh0.m156281a(this, context, attributeSet, i);
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        lyh0.m156282b(this, context, i);
    }

    public VRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m224412a(context, attributeSet, 0);
    }

    public VRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m224412a(context, attributeSet, i);
    }
}
