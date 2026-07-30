package p149l;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* JADX INFO: loaded from: classes.dex */
public class ju0 {
    /* JADX INFO: renamed from: a */
    public static InputConnection m143211a(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                if (parent instanceof c8q0) {
                    editorInfo.hintText = ((c8q0) parent).getHint();
                    return inputConnection;
                }
            }
        }
        return inputConnection;
    }
}
