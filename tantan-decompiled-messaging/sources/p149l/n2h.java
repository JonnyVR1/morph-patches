package p149l;

import android.text.Editable;
import android.widget.EditText;

/* JADX INFO: loaded from: classes12.dex */
public class n2h {
    /* JADX INFO: renamed from: a */
    public static void m157640a(EditText editText, String str) {
        int selectionStart = editText.getSelectionStart();
        Editable editableText = editText.getEditableText();
        if (selectionStart < 0 || selectionStart >= editableText.length()) {
            editableText.append((CharSequence) str);
        } else {
            editableText.insert(selectionStart, str);
        }
    }
}
