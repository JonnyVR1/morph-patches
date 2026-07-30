package p153l;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class lzq {

    /* JADX INFO: renamed from: a */
    public static boolean f134251a = false;

    /* JADX INFO: renamed from: b */
    public static Method f134252b = null;

    /* JADX INFO: renamed from: c */
    public static boolean f134253c = false;

    /* JADX INFO: renamed from: d */
    public static Field f134254d;

    /* JADX INFO: renamed from: l.lzq$a */
    public interface InterfaceC18516a {
        boolean superDispatchKeyEvent(@NonNull KeyEvent keyEvent);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m156459a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f134251a) {
            try {
                f134252b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f134251a = true;
        }
        Method method = f134252b;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(actionBar, keyEvent);
                if (objInvoke == null) {
                    return false;
                }
                return ((Boolean) objInvoke).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m156460b(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m156459a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (kkl0.m150155f(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m156461c(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListenerM156464f = m156464f(dialog);
        if (onKeyListenerM156464f != null && onKeyListenerM156464f.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (kkl0.m150155f(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m156462d(@NonNull View view, @NonNull KeyEvent keyEvent) {
        return kkl0.m150157g(view, keyEvent);
    }

    @SuppressLint({"LambdaLast"})
    /* JADX INFO: renamed from: e */
    public static boolean m156463e(@NonNull InterfaceC18516a interfaceC18516a, @Nullable View view, @Nullable Window.Callback callback, @NonNull KeyEvent keyEvent) {
        if (interfaceC18516a == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return interfaceC18516a.superDispatchKeyEvent(keyEvent);
        }
        if (callback instanceof Activity) {
            return m156460b((Activity) callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return m156461c((Dialog) callback, keyEvent);
        }
        return (view != null && kkl0.m150155f(view, keyEvent)) || interfaceC18516a.superDispatchKeyEvent(keyEvent);
    }

    /* JADX INFO: renamed from: f */
    public static DialogInterface.OnKeyListener m156464f(Dialog dialog) {
        if (!f134253c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f134254d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f134253c = true;
        }
        Field field = f134254d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }
}
