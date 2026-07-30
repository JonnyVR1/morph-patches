package p153l;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes3.dex */
public class c33 {
    /* JADX INFO: renamed from: a */
    public static void m107765a(StringBuilder sb, View view, Resources resources) {
        sb.append(view.getClass().getName());
        if (view.getId() != -1) {
            sb.append(", id: ");
            sb.append(resources.getResourceName(view.getId()));
        }
        sb.append(SignParameters.NEW_LINE);
    }

    /* JADX INFO: renamed from: b */
    public static void m107766b(View view, Throwable th, x20 x20Var) {
        if (th instanceof RuntimeException) {
            String message = ((RuntimeException) th).getMessage();
            Resources resources = view.getResources();
            try {
                if (!TextUtils.isEmpty(message) && message.contains("recycled")) {
                    StringBuilder sb = new StringBuilder(message);
                    sb.append(SignParameters.NEW_LINE);
                    m107765a(sb, view, resources);
                    Object parent = view.getParent();
                    int i = 7;
                    while (i > 0 && (parent instanceof View)) {
                        i--;
                        View view2 = (View) parent;
                        m107765a(sb, view2, resources);
                        parent = view2.getParent();
                    }
                    CrashHelper.m82479c(new RuntimeException(sb.toString()));
                }
                x20Var.call();
            } catch (Throwable unused) {
                x20Var.call();
            }
        }
    }
}
