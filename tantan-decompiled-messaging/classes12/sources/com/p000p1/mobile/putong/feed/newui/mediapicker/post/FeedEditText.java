package com.p000p1.mobile.putong.feed.newui.mediapicker.post;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import v.VEditText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedEditText extends VEditText {

    /* JADX INFO: renamed from: d */
    public View.OnKeyListener f2073d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.FeedEditText$a */
    public class C2086a extends InputConnectionWrapper {
        public C2086a(InputConnection inputConnection, boolean z) {
            super(inputConnection, z);
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean deleteSurroundingText(int i, int i2) {
            return sendKeyEvent(new KeyEvent(0, 67)) || super.deleteSurroundingText(i, i2);
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean sendKeyEvent(KeyEvent keyEvent) {
            return (FeedEditText.this.f2073d != null ? FeedEditText.this.f2073d.onKey(FeedEditText.this, keyEvent.getKeyCode(), keyEvent) : false) || super.sendKeyEvent(keyEvent);
        }
    }

    public FeedEditText(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (super/*android.view.View*/.onCheckIsTextEditor() && super/*android.view.View*/.isEnabled()) {
            return new C2086a(super/*android.view.View*/.onCreateInputConnection(editorInfo), true);
        }
        return null;
    }

    public void setOnKeyEventListener(View.OnKeyListener onKeyListener) {
        this.f2073d = onKeyListener;
    }

    public FeedEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
