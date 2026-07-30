package com.p051p1.mobile.putong.feed.newui.mediapicker.post;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import p151v.VEditText;

/* JADX INFO: loaded from: classes13.dex */
public class FeedEditText extends VEditText {

    /* JADX INFO: renamed from: d */
    public View.OnKeyListener f41460d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.FeedEditText$a */
    public class C11405a extends InputConnectionWrapper {
        public C11405a(InputConnection inputConnection, boolean z) {
            super(inputConnection, z);
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean deleteSurroundingText(int i, int i2) {
            return sendKeyEvent(new KeyEvent(0, 67)) || super.deleteSurroundingText(i, i2);
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean sendKeyEvent(KeyEvent keyEvent) {
            return (FeedEditText.this.f41460d != null ? FeedEditText.this.f41460d.onKey(FeedEditText.this, keyEvent.getKeyCode(), keyEvent) : false) || super.sendKeyEvent(keyEvent);
        }
    }

    public FeedEditText(Context context) {
        super(context);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (super.onCheckIsTextEditor() && super.isEnabled()) {
            return new C11405a(super.onCreateInputConnection(editorInfo), true);
        }
        return null;
    }

    public void setOnKeyEventListener(View.OnKeyListener onKeyListener) {
        this.f41460d = onKeyListener;
    }

    public FeedEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
