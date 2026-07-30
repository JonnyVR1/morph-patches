package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.p1.mobile.putong.core.ui.messages.view.MessageInputBaseEditView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VEditTextSougouGif extends MessageInputBaseEditView {

    /* JADX INFO: renamed from: q */
    public InterfaceC0101a f1579q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.VEditTextSougouGif$a */
    public interface InterfaceC0101a {
        /* JADX INFO: renamed from: a */
        void mo2107a(Uri uri);
    }

    public VEditTextSougouGif(Context context) {
        super(context);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return super.onCreateInputConnection(editorInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onPrivateIMECommand(String str, Bundle bundle) {
        if (TextUtils.equals(str, "com.sogou.inputmethod.exp.commit")) {
            Uri uri = (Uri) bundle.getParcelable("EXP_PATH_URI");
            if (NullChecker.a(this.f1579q) && NullChecker.a(uri)) {
                this.f1579q.mo2107a(uri);
                return true;
            }
        }
        return super/*android.widget.TextView*/.onPrivateIMECommand(str, bundle);
    }

    public void setOnSogouGifListener(InterfaceC0101a interfaceC0101a) {
        this.f1579q = interfaceC0101a;
    }

    public VEditTextSougouGif(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VEditTextSougouGif(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
