package com.p051p1.mobile.putong.core.p058ui.messages.emoji;

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
import com.p051p1.mobile.putong.core.p058ui.messages.VEditTextSougouGif;
import com.p051p1.mobile.putong.core.p058ui.messages.view.MessageInputBaseEditView;
import p153l.kye;
import p153l.msi0;
import p153l.vpe;

/* JADX INFO: loaded from: classes3.dex */
public class VEditTextEmojiCompat extends MessageInputBaseEditView {

    /* JADX INFO: renamed from: q */
    public kye f32632q;

    /* JADX INFO: renamed from: r */
    public boolean f32633r;

    /* JADX INFO: renamed from: s */
    public VEditTextSougouGif.InterfaceC8681a f32634s;

    public VEditTextEmojiCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m50271A(attributeSet, R.attr.editTextStyle, 0);
    }

    private kye getEmojiEditTextHelper() {
        if (this.f32632q == null) {
            this.f32632q = new kye(this);
        }
        return this.f32632q;
    }

    @SuppressLint({"RestrictedApi"})
    /* JADX INFO: renamed from: A */
    public final void m50271A(@Nullable AttributeSet attributeSet, int i, int i2) {
        if (this.f32633r) {
            return;
        }
        this.f32633r = true;
        getEmojiEditTextHelper().m151964f(new vpe(this, attributeSet, i, i2).m202229a());
        setKeyListener(super.getKeyListener());
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.view.MessageInputBaseEditView, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return getEmojiEditTextHelper().m151962d(super.onCreateInputConnection(editorInfo), editorInfo);
    }

    @Override // android.widget.TextView
    public boolean onPrivateIMECommand(String str, Bundle bundle) {
        if (TextUtils.equals(str, "com.sogou.inputmethod.exp.commit")) {
            Uri uri = (Uri) bundle.getParcelable("EXP_PATH_URI");
            VEditTextSougouGif.InterfaceC8681a interfaceC8681a = this.f32634s;
            if (interfaceC8681a != null && uri != null) {
                interfaceC8681a.mo50192a(uri);
                return true;
            }
        }
        return super.onPrivateIMECommand(str, bundle);
    }

    @Override // android.widget.TextView
    @SuppressLint({"RestrictedApi"})
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

    public void setOnSogouGifListener(VEditTextSougouGif.InterfaceC8681a interfaceC8681a) {
        this.f32634s = interfaceC8681a;
    }

    public VEditTextEmojiCompat(Context context) {
        super(context);
        m50271A(null, 0, 0);
    }

    public VEditTextEmojiCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m50271A(attributeSet, i, 0);
    }
}
