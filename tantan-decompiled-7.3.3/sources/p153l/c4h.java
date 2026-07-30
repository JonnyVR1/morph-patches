package p153l;

import android.text.Editable;
import android.widget.EditText;

/* JADX INFO: loaded from: classes13.dex */
public class c4h {
    /* JADX INFO: renamed from: a */
    public static void m107883a(EditText editText, String str) {
        int selectionStart = editText.getSelectionStart();
        Editable editableText = editText.getEditableText();
        if (selectionStart < 0 || selectionStart >= editableText.length()) {
            editableText.append((CharSequence) str);
        } else {
            editableText.insert(selectionStart, str);
        }
    }
}
