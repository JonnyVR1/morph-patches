package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import p149l.zu0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatToggleButton extends ToggleButton {

    /* JADX INFO: renamed from: a */
    public final zu0 f653a;

    public AppCompatToggleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        zu0 zu0Var = new zu0(this);
        this.f653a = zu0Var;
        zu0Var.m220180m(attributeSet, i);
    }

    public AppCompatToggleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    public AppCompatToggleButton(Context context) {
        this(context, null);
    }
}
