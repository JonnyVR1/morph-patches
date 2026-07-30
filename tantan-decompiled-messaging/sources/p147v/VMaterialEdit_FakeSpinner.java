package p147v;

import android.content.Context;
import android.text.Editable;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import p149l.t100;

/* JADX INFO: loaded from: classes3.dex */
public class VMaterialEdit_FakeSpinner extends VMaterialEdit {
    public VMaterialEdit_FakeSpinner(Context context) {
        super(context);
        m223129J(context);
    }

    /* JADX INFO: renamed from: J */
    public final void m223129J(Context context) {
        m80443E(t100.m186890d(8.0f), 0, t100.m186890d(8.0f), 0);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean getDefaultEditable() {
        return false;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public MovementMethod getDefaultMovementMethod() {
        return null;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return super.getText();
    }

    public VMaterialEdit_FakeSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m223129J(context);
    }

    public VMaterialEdit_FakeSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m223129J(context);
    }
}
