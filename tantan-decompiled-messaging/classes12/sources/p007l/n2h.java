package p007l;

import android.text.Editable;
import android.widget.EditText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class n2h {
    /* JADX INFO: renamed from: a */
    public static void m12065a(EditText editText, String str) {
        int selectionStart = editText.getSelectionStart();
        Editable editableText = editText.getEditableText();
        if (selectionStart < 0 || selectionStart >= editableText.length()) {
            editableText.append((CharSequence) str);
        } else {
            editableText.insert(selectionStart, str);
        }
    }
}
