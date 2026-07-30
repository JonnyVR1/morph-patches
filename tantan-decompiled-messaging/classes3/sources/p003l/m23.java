package p003l;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class m23 {
    /* JADX INFO: renamed from: a */
    public static void m6192a(StringBuilder sb, View view, Resources resources) {
        sb.append(view.getClass().getName());
        if (view.getId() != -1) {
            sb.append(", id: ");
            sb.append(resources.getResourceName(view.getId()));
        }
        sb.append("\n");
    }

    /* JADX INFO: renamed from: b */
    public static void m6193b(View view, Throwable th, d30 d30Var) {
        if (th instanceof RuntimeException) {
            String message = ((RuntimeException) th).getMessage();
            Resources resources = view.getResources();
            try {
                if (!TextUtils.isEmpty(message) && message.contains("recycled")) {
                    StringBuilder sb = new StringBuilder(message);
                    sb.append("\n");
                    m6192a(sb, view, resources);
                    Object parent = view.getParent();
                    int i = 7;
                    while (i > 0 && (parent instanceof View)) {
                        i--;
                        View view2 = (View) parent;
                        m6192a(sb, view2, resources);
                        parent = view2.getParent();
                    }
                    CrashHelper.c(new RuntimeException(sb.toString()));
                }
                d30Var.call();
            } catch (Throwable unused) {
                d30Var.call();
            }
        }
    }
}
