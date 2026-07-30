package p153l;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* JADX INFO: loaded from: classes.dex */
public class pu0 {
    /* JADX INFO: renamed from: a */
    public static InputConnection m173795a(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                if (parent instanceof hhq0) {
                    editorInfo.hintText = ((hhq0) parent).getHint();
                    return inputConnection;
                }
            }
        }
        return inputConnection;
    }
}
