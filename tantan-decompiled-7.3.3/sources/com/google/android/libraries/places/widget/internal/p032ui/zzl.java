package com.google.android.libraries.places.widget.internal.p032ui;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.libraries.places.internal.zzkd;
import p153l.j26;

/* JADX INFO: loaded from: classes7.dex */
final class zzl implements View.OnFocusChangeListener {
    public /* synthetic */ zzl(zzk zzkVar) {
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) j26.m143196i(view.getContext(), InputMethodManager.class);
            if (inputMethodManager == null) {
                return;
            }
            if (z) {
                inputMethodManager.showSoftInput(view, 1);
            } else {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        } catch (Error | RuntimeException e) {
            zzkd.zzb(e);
            throw e;
        }
    }

    private zzl() {
        throw null;
    }
}
