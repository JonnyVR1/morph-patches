package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import p153l.fv0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatToggleButton extends ToggleButton {

    /* JADX INFO: renamed from: a */
    public final fv0 f653a;

    public AppCompatToggleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        fv0 fv0Var = new fv0(this);
        this.f653a = fv0Var;
        fv0Var.m127572m(attributeSet, i);
    }

    public AppCompatToggleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    public AppCompatToggleButton(Context context) {
        this(context, null);
    }
}
