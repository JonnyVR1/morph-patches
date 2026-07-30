package com.google.android.material.textfield;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes7.dex */
abstract class EndIconDelegate {
    Context context;
    CheckableImageButton endIconView;
    TextInputLayout textInputLayout;

    public EndIconDelegate(@NonNull TextInputLayout textInputLayout) {
        this.textInputLayout = textInputLayout;
        this.context = textInputLayout.getContext();
        this.endIconView = textInputLayout.getEndIconView();
    }

    public abstract void initialize();

    public boolean isBoxBackgroundModeSupported(int i) {
        return true;
    }

    public boolean shouldTintIconOnError() {
        return false;
    }
}
