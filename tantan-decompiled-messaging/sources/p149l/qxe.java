package p149l;

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
public final class qxe extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public final TextView f156839a;

    public qxe(@NonNull TextView textView, @NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        super(inputConnection, false);
        this.f156839a = textView;
        exe.m118631a().m118648r(editorInfo);
    }

    /* JADX INFO: renamed from: a */
    public final Editable m176993a() {
        return this.f156839a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        return exe.m118632d(this, m176993a(), i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return exe.m118632d(this, m176993a(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
