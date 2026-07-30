package androidx.emoji.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.widget.Button;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import p149l.mji0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ExtractButtonCompat extends Button {
    public ExtractButtonCompat(Context context) {
        super(context, null);
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return isEnabled() && getVisibility() == 0;
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(mji0.m154823q(this, callback));
    }

    public ExtractButtonCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExtractButtonCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @RequiresApi(api = 21)
    public ExtractButtonCompat(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
