package androidx.emoji.widget;

import android.R;
import android.content.Context;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import p149l.gxe;
import p149l.mji0;
import p149l.roe;

/* JADX INFO: loaded from: classes.dex */
public class EmojiEditText extends EditText {

    /* JADX INFO: renamed from: a */
    public gxe f1821a;

    /* JADX INFO: renamed from: b */
    public boolean f1822b;

    public EmojiEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2450a(attributeSet, R.attr.editTextStyle, 0);
    }

    private gxe getEmojiEditTextHelper() {
        if (this.f1821a == null) {
            this.f1821a = new gxe(this);
        }
        return this.f1821a;
    }

    /* JADX INFO: renamed from: a */
    public final void m2450a(@Nullable AttributeSet attributeSet, int i, int i2) {
        if (this.f1822b) {
            return;
        }
        this.f1822b = true;
        setMaxEmojiCount(new roe(this, attributeSet, i, i2).m180240a());
        setKeyListener(super.getKeyListener());
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

    public EmojiEditText(Context context) {
        super(context);
        m2450a(null, 0, 0);
    }

    public EmojiEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2450a(attributeSet, i, 0);
    }
}
