package com.google.android.material.textfield;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;
import com.google.android.material.C2489R;
import p153l.tu0;

/* JADX INFO: loaded from: classes7.dex */
class PasswordToggleEndIconDelegate extends EndIconDelegate {
    private final TextInputLayout.OnEditTextAttachedListener onEditTextAttachedListener;
    private final TextInputLayout.OnEndIconChangedListener onEndIconChangedListener;
    private final TextWatcher textWatcher;

    public PasswordToggleEndIconDelegate(@NonNull TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.textWatcher = new TextWatcher() { // from class: com.google.android.material.textfield.PasswordToggleEndIconDelegate.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                PasswordToggleEndIconDelegate passwordToggleEndIconDelegate = PasswordToggleEndIconDelegate.this;
                passwordToggleEndIconDelegate.endIconView.setChecked(!passwordToggleEndIconDelegate.hasPasswordTransformation());
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        };
        this.onEditTextAttachedListener = new TextInputLayout.OnEditTextAttachedListener() { // from class: com.google.android.material.textfield.PasswordToggleEndIconDelegate.2
            @Override // com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener
            public void onEditTextAttached(@NonNull TextInputLayout textInputLayout2) {
                EditText editText = textInputLayout2.getEditText();
                textInputLayout2.setEndIconVisible(true);
                PasswordToggleEndIconDelegate passwordToggleEndIconDelegate = PasswordToggleEndIconDelegate.this;
                passwordToggleEndIconDelegate.endIconView.setChecked(!passwordToggleEndIconDelegate.hasPasswordTransformation());
                editText.removeTextChangedListener(PasswordToggleEndIconDelegate.this.textWatcher);
                editText.addTextChangedListener(PasswordToggleEndIconDelegate.this.textWatcher);
            }
        };
        this.onEndIconChangedListener = new TextInputLayout.OnEndIconChangedListener() { // from class: com.google.android.material.textfield.PasswordToggleEndIconDelegate.3
            @Override // com.google.android.material.textfield.TextInputLayout.OnEndIconChangedListener
            public void onEndIconChanged(@NonNull TextInputLayout textInputLayout2, int i) {
                EditText editText = textInputLayout2.getEditText();
                if (editText == null || i != 1) {
                    return;
                }
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasPasswordTransformation() {
        EditText editText = this.textInputLayout.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void initialize() {
        this.textInputLayout.setEndIconDrawable(tu0.m192702b(this.context, C2489R.drawable.design_password_eye));
        TextInputLayout textInputLayout = this.textInputLayout;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C2489R.string.password_toggle_content_description));
        this.textInputLayout.setEndIconOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.textfield.PasswordToggleEndIconDelegate.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                EditText editText = PasswordToggleEndIconDelegate.this.textInputLayout.getEditText();
                if (editText == null) {
                    return;
                }
                int selectionEnd = editText.getSelectionEnd();
                if (PasswordToggleEndIconDelegate.this.hasPasswordTransformation()) {
                    editText.setTransformationMethod(null);
                } else {
                    editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    editText.setSelection(selectionEnd);
                }
            }
        });
        this.textInputLayout.addOnEditTextAttachedListener(this.onEditTextAttachedListener);
        this.textInputLayout.addOnEndIconChangedListener(this.onEndIconChangedListener);
    }
}
