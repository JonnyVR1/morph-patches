package p153l;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class uye extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public final TextView f181570a;

    public uye(@NonNull TextView textView, @NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        super(inputConnection, false);
        this.f181570a = textView;
        iye.m142622a().m142639r(editorInfo);
    }

    /* JADX INFO: renamed from: a */
    public final Editable m198601a() {
        return this.f181570a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        return iye.m142623d(this, m198601a(), i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return iye.m142623d(this, m198601a(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
