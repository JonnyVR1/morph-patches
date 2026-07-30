package p151v;

import android.content.Context;
import android.text.Editable;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import p153l.qa00;

/* JADX INFO: loaded from: classes3.dex */
public class VMaterialEdit_FakeSpinner extends VMaterialEdit {
    public VMaterialEdit_FakeSpinner(Context context) {
        super(context);
        m224375J(context);
    }

    /* JADX INFO: renamed from: J */
    public final void m224375J(Context context) {
        m81626E(qa00.m175859d(8.0f), 0, qa00.m175859d(8.0f), 0);
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
        m224375J(context);
    }

    public VMaterialEdit_FakeSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m224375J(context);
    }
}
