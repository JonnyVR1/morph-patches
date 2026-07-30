package p149l;

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
public class lxq {

    /* JADX INFO: renamed from: a */
    public static boolean f130425a = false;

    /* JADX INFO: renamed from: b */
    public static Method f130426b = null;

    /* JADX INFO: renamed from: c */
    public static boolean f130427c = false;

    /* JADX INFO: renamed from: d */
    public static Field f130428d;

    /* JADX INFO: renamed from: l.lxq$a */
    public interface InterfaceC18347a {
        boolean superDispatchKeyEvent(@NonNull KeyEvent keyEvent);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m152078a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f130425a) {
            try {
                f130426b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f130425a = true;
        }
        Method method = f130426b;
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
    public static boolean m152079b(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m152078a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (gbl0.m125192f(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m152080c(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListenerM152083f = m152083f(dialog);
        if (onKeyListenerM152083f != null && onKeyListenerM152083f.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (gbl0.m125192f(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m152081d(@NonNull View view, @NonNull KeyEvent keyEvent) {
        return gbl0.m125194g(view, keyEvent);
    }

    @SuppressLint({"LambdaLast"})
    /* JADX INFO: renamed from: e */
    public static boolean m152082e(@NonNull InterfaceC18347a interfaceC18347a, @Nullable View view, @Nullable Window.Callback callback, @NonNull KeyEvent keyEvent) {
        if (interfaceC18347a == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return interfaceC18347a.superDispatchKeyEvent(keyEvent);
        }
        if (callback instanceof Activity) {
            return m152079b((Activity) callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return m152080c((Dialog) callback, keyEvent);
        }
        return (view != null && gbl0.m125192f(view, keyEvent)) || interfaceC18347a.superDispatchKeyEvent(keyEvent);
    }

    /* JADX INFO: renamed from: f */
    public static DialogInterface.OnKeyListener m152083f(Dialog dialog) {
        if (!f130427c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f130428d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f130427c = true;
        }
        Field field = f130428d;
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
