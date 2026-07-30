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
import p153l.kye;
import p153l.msi0;
import p153l.vpe;

/* JADX INFO: loaded from: classes.dex */
public class EmojiEditText extends EditText {

    /* JADX INFO: renamed from: a */
    public kye f1821a;

    /* JADX INFO: renamed from: b */
    public boolean f1822b;

    public EmojiEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2451a(attributeSet, R.attr.editTextStyle, 0);
    }

    private kye getEmojiEditTextHelper() {
        if (this.f1821a == null) {
            this.f1821a = new kye(this);
        }
        return this.f1821a;
    }

    /* JADX INFO: renamed from: a */
    public final void m2451a(@Nullable AttributeSet attributeSet, int i, int i2) {
        if (this.f1822b) {
            return;
        }
        this.f1822b = true;
        setMaxEmojiCount(new vpe(this, attributeSet, i, i2).m202229a());
        setKeyListener(super.getKeyListener());
    }

    public int getMaxEmojiCount() {
        return getEmojiEditTextHelper().m151961c();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return getEmojiEditTextHelper().m151962d(super.onCreateInputConnection(editorInfo), editorInfo);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(msi0.m159819q(this, callback));
    }

    @Override // android.widget.TextView
    public void setKeyListener(@Nullable KeyListener keyListener) {
        if (keyListener != null) {
            keyListener = getEmojiEditTextHelper().m151960b(keyListener);
        }
        super.setKeyListener(keyListener);
    }

    public void setMaxEmojiCount(@IntRange(from = 0) int i) {
        getEmojiEditTextHelper().m151964f(i);
    }

    public EmojiEditText(Context context) {
        super(context);
        m2451a(null, 0, 0);
    }

    public EmojiEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2451a(attributeSet, i, 0);
    }
}
