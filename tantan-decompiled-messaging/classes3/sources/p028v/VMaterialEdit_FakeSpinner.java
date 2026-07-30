package p028v;

import android.content.Context;
import android.text.Editable;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VMaterialEdit_FakeSpinner extends VMaterialEdit {
    public VMaterialEdit_FakeSpinner(Context context) {
        super(context);
        m11610J(context);
    }

    /* JADX INFO: renamed from: J */
    public final void m11610J(Context context) {
        E(t100.d(8.0f), 0, t100.d(8.0f), 0);
    }

    public boolean getDefaultEditable() {
        return false;
    }

    public MovementMethod getDefaultMovementMethod() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super/*android.widget.TextView*/.setText(charSequence, bufferType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getText, reason: merged with bridge method [inline-methods] */
    public Editable m12298getText() {
        return super/*android.widget.EditText*/.getText();
    }

    public VMaterialEdit_FakeSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m11610J(context);
    }

    public VMaterialEdit_FakeSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m11610J(context);
    }
}
