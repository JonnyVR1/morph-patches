package com.google.android.material.resources;

import android.graphics.Typeface;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class TextAppearanceFontCallback {
    public abstract void onFontRetrievalFailed(int i);

    public abstract void onFontRetrieved(Typeface typeface, boolean z);
}
