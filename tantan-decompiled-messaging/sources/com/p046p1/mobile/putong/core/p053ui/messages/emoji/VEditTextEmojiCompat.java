package com.p046p1.mobile.putong.core.p053ui.messages.emoji;

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
import com.p046p1.mobile.putong.core.p053ui.messages.VEditTextSougouGif;
import com.p046p1.mobile.putong.core.p053ui.messages.view.MessageInputBaseEditView;
import p149l.gxe;
import p149l.mji0;
import p149l.roe;

/* JADX INFO: loaded from: classes3.dex */
public class VEditTextEmojiCompat extends MessageInputBaseEditView {

    /* JADX INFO: renamed from: q */
    public gxe f31784q;

    /* JADX INFO: renamed from: r */
    public boolean f31785r;

    /* JADX INFO: renamed from: s */
    public VEditTextSougouGif.InterfaceC8518a f31786s;

    public VEditTextEmojiCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m49088A(attributeSet, R.attr.editTextStyle, 0);
    }

    private gxe getEmojiEditTextHelper() {
        if (this.f31784q == null) {
            this.f31784q = new gxe(this);
        }
        return this.f31784q;
    }

    @SuppressLint({"RestrictedApi"})
    /* JADX INFO: renamed from: A */
    public final void m49088A(@Nullable AttributeSet attributeSet, int i, int i2) {
        if (this.f31785r) {
            return;
        }
        this.f31785r = true;
        getEmojiEditTextHelper().m128561f(new roe(this, attributeSet, i, i2).m180240a());
        setKeyListener(super.getKeyListener());
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.view.MessageInputBaseEditView, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return getEmojiEditTextHelper().m128559d(super.onCreateInputConnection(editorInfo), editorInfo);
    }

    @Override // android.widget.TextView
    public boolean onPrivateIMECommand(String str, Bundle bundle) {
        if (TextUtils.equals(str, "com.sogou.inputmethod.exp.commit")) {
            Uri uri = (Uri) bundle.getParcelable("EXP_PATH_URI");
            VEditTextSougouGif.InterfaceC8518a interfaceC8518a = this.f31786s;
            if (interfaceC8518a != null && uri != null) {
                interfaceC8518a.mo49009a(uri);
                return true;
            }
        }
        return super.onPrivateIMECommand(str, bundle);
    }

    @Override // android.widget.TextView
    @SuppressLint({"RestrictedApi"})
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

    public void setOnSogouGifListener(VEditTextSougouGif.InterfaceC8518a interfaceC8518a) {
        this.f31786s = interfaceC8518a;
    }

    public VEditTextEmojiCompat(Context context) {
        super(context);
        m49088A(null, 0, 0);
    }

    public VEditTextEmojiCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m49088A(attributeSet, i, 0);
    }
}
