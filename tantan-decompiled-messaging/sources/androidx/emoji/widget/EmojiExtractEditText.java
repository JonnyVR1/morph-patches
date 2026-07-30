package androidx.emoji.widget;

import android.R;
import android.content.Context;
import android.inputmethodservice.ExtractEditText;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import p149l.gxe;
import p149l.mji0;
import p149l.roe;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class EmojiExtractEditText extends ExtractEditText {

    /* JADX INFO: renamed from: a */
    public gxe f1823a;

    /* JADX INFO: renamed from: b */
    public boolean f1824b;

    public EmojiExtractEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2451a(attributeSet, R.attr.editTextStyle, 0);
    }

    private gxe getEmojiEditTextHelper() {
        if (this.f1823a == null) {
            this.f1823a = new gxe(this);
        }
        return this.f1823a;
    }

    /* JADX INFO: renamed from: a */
    public final void m2451a(@Nullable AttributeSet attributeSet, int i, int i2) {
        if (this.f1824b) {
            return;
        }
        this.f1824b = true;
        setMaxEmojiCount(new roe(this, attributeSet, i, i2).m180240a());
        setKeyListener(super.getKeyListener());
    }

    public int getEmojiReplaceStrategy() {
        return getEmojiEditTextHelper().m128556a();
    }

    public int getMaxEmojiCount() {
        return getEmojiEditTextHelper().m128558c();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return getEmojiEditTextHelper().m128559d(super.onCreateInputConnection(editorInfo), editorInfo);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(mji0.m154823q(this, callback));
    }

    public void setEmojiReplaceStrategy(int i) {
        getEmojiEditTextHelper().m128560e(i);
    }

    @Override // android.widget.TextView
    public void setKeyListener(@Nullable KeyListener keyListener) {
        if (keyListener != null) {
            keyListener = getEmojiEditTextHelper().m128557b(keyListener);
        }
        super.setKeyListener(keyListener);
    }

    public void setMaxEmojiCount(@IntRange(from = 0) int i) {
        getEmojiEditTextHelper().m128561f(i);
    }

    public EmojiExtractEditText(Context context) {
        super(context);
        m2451a(null, 0, 0);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2451a(attributeSet, i, 0);
    }

    @RequiresApi(21)
    public EmojiExtractEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m2451a(attributeSet, i, i2);
    }
}
