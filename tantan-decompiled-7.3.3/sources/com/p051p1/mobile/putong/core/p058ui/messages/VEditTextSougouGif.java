package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.p051p1.mobile.putong.core.p058ui.messages.view.MessageInputBaseEditView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes3.dex */
public class VEditTextSougouGif extends MessageInputBaseEditView {

    /* JADX INFO: renamed from: q */
    public InterfaceC8681a f32536q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.VEditTextSougouGif$a */
    public interface InterfaceC8681a {
        /* JADX INFO: renamed from: a */
        void mo50192a(Uri uri);
    }

    public VEditTextSougouGif(Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.view.MessageInputBaseEditView, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return super.onCreateInputConnection(editorInfo);
    }

    @Override // android.widget.TextView
    public boolean onPrivateIMECommand(String str, Bundle bundle) {
        if (TextUtils.equals(str, "com.sogou.inputmethod.exp.commit")) {
            Uri uri = (Uri) bundle.getParcelable("EXP_PATH_URI");
            if (NullChecker.m82486a(this.f32536q) && NullChecker.m82486a(uri)) {
                this.f32536q.mo50192a(uri);
                return true;
            }
        }
        return super.onPrivateIMECommand(str, bundle);
    }

    public void setOnSogouGifListener(InterfaceC8681a interfaceC8681a) {
        this.f32536q = interfaceC8681a;
    }

    public VEditTextSougouGif(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VEditTextSougouGif(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
