package com.google.android.material.textfield;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes7.dex */
class CustomEndIconDelegate extends EndIconDelegate {
    public CustomEndIconDelegate(@NonNull TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void initialize() {
        this.textInputLayout.setEndIconOnClickListener(null);
        this.textInputLayout.setEndIconOnLongClickListener(null);
    }
}
