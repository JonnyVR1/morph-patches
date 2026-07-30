package com.p000p1.mobile.putong.core.p001ui.messages.emoji;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.messages.VEditTextSougouGif;
import com.p1.mobile.putong.core.ui.messages.view.MessageInputBaseEditView;
import l.gxe;
import l.mji0;
import l.roe;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VEditTextEmojiCompat extends MessageInputBaseEditView {

    /* JADX INFO: renamed from: q */
    public gxe f1675q;

    /* JADX INFO: renamed from: r */
    public boolean f1676r;

    /* JADX INFO: renamed from: s */
    public VEditTextSougouGif.InterfaceC0101a f1677s;

    public VEditTextEmojiCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2186A(attributeSet, R.attr.editTextStyle, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private gxe getEmojiEditTextHelper() {
        if (this.f1675q == null) {
            this.f1675q = new gxe(this);
        }
        return this.f1675q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"RestrictedApi"})
    /* JADX INFO: renamed from: A */
    public final void m2186A(@Nullable AttributeSet attributeSet, int i, int i2) {
        if (this.f1676r) {
            return;
        }
        this.f1676r = true;
        getEmojiEditTextHelper().f(new roe(this, attributeSet, i, i2).a());
        setKeyListener(super/*android.widget.TextView*/.getKeyListener());
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return getEmojiEditTextHelper().d(super.onCreateInputConnection(editorInfo), editorInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onPrivateIMECommand(String str, Bundle bundle) {
        if (TextUtils.equals(str, "com.sogou.inputmethod.exp.commit")) {
            Uri uri = (Uri) bundle.getParcelable("EXP_PATH_URI");
            VEditTextSougouGif.InterfaceC0101a interfaceC0101a = this.f1677s;
            if (interfaceC0101a != null && uri != null) {
                interfaceC0101a.mo2107a(uri);
                return true;
            }
        }
        return super/*android.widget.TextView*/.onPrivateIMECommand(str, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"RestrictedApi"})
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super/*android.widget.TextView*/.setCustomSelectionActionModeCallback(mji0.q(this, callback));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setKeyListener(@Nullable KeyListener keyListener) {
        if (keyListener != null) {
            keyListener = getEmojiEditTextHelper().b(keyListener);
        }
        super/*android.widget.TextView*/.setKeyListener(keyListener);
    }

    public void setOnSogouGifListener(VEditTextSougouGif.InterfaceC0101a interfaceC0101a) {
        this.f1677s = interfaceC0101a;
    }

    public VEditTextEmojiCompat(Context context) {
        super(context);
        m2186A(null, 0, 0);
    }

    public VEditTextEmojiCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2186A(attributeSet, i, 0);
    }
}
