package p149l;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b50 extends e16 {

    /* JADX INFO: renamed from: l.b50$a */
    @RequiresApi(21)
    public static class C15803a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m100293a(Activity activity) {
            activity.finishAfterTransition();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static void m100294b(Activity activity) {
            activity.postponeEnterTransition();
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static void m100295c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        @DoNotInline
        /* JADX INFO: renamed from: d */
        public static void m100296d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        @DoNotInline
        /* JADX INFO: renamed from: e */
        public static void m100297e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    /* JADX INFO: renamed from: l.b50$b */
    @RequiresApi(23)
    public static class C15804b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m100298a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static void m100299b(Activity activity, String[] strArr, int i) {
            activity.requestPermissions(strArr, i);
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static boolean m100300c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* JADX INFO: renamed from: l.b50$c */
    @RequiresApi(31)
    public static class C15805c {
        @DoNotInline
        @SuppressLint({"BanUncheckedReflection"})
        /* JADX INFO: renamed from: a */
        public static boolean m100301a(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    /* JADX INFO: renamed from: l.b50$d */
    @RequiresApi(32)
    public static class C15806d {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static boolean m100302a(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* JADX INFO: renamed from: l.b50$e */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface InterfaceC15807e {
        void validateRequestPermissionsRequestCode(int i);
    }

    /* JADX INFO: renamed from: l.b50$f */
    @RequiresApi(21)
    public static class SharedElementCallbackC15808f extends SharedElementCallback {

        /* JADX INFO: renamed from: a */
        public final cve0 f73428a;

        public SharedElementCallbackC15808f(cve0 cve0Var) {
            this.f73428a = cve0Var;
        }

        @Override // android.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.f73428a.m108854b(view, matrix, rectF);
        }

        @Override // android.app.SharedElementCallback
        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.f73428a.m108855c(context, parcelable);
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.f73428a.m108856d(list, map);
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(List<View> list) {
            this.f73428a.m108857e(list);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.f73428a.m108858f(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.f73428a.m108859g(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        @RequiresApi(23)
        public void onSharedElementsArrived(List<String> list, List<View> list2, final SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.f73428a.m108860h(list, list2, new cve0.InterfaceC16248a() { // from class: l.c50
                @Override // p149l.cve0.InterfaceC16248a
                public final void onSharedElementsReady() {
                    b50.C15804b.m100298a(onSharedElementsReadyListener);
                }
            });
        }
    }

    /* JADX INFO: renamed from: A */
    public static void m100281A(@NonNull Activity activity) {
        C15803a.m100297e(activity);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m100282p(Activity activity) {
        if (activity.isFinishing() || z50.m217268i(activity)) {
            return;
        }
        activity.recreate();
    }

    /* JADX INFO: renamed from: q */
    public static void m100283q(@NonNull Activity activity) {
        activity.finishAffinity();
    }

    /* JADX INFO: renamed from: r */
    public static void m100284r(@NonNull Activity activity) {
        C15803a.m100293a(activity);
    }

    /* JADX INFO: renamed from: s */
    public static void m100285s(@NonNull Activity activity) {
        C15803a.m100294b(activity);
    }

    /* JADX INFO: renamed from: t */
    public static void m100286t(@NonNull final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: l.a50
                @Override // java.lang.Runnable
                public final void run() {
                    b50.m100282p(activity);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public static void m100287u(@NonNull Activity activity, @NonNull String[] strArr, @IntRange(from = 0) int i) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (TextUtils.isEmpty(strArr[i2])) {
                all.m97315a("Permission request for permissions ", Arrays.toString(strArr), " must not contain null or empty values");
                return;
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i2));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < strArr.length; i4++) {
                if (!hashSet.contains(Integer.valueOf(i4))) {
                    strArr2[i3] = strArr[i4];
                    i3++;
                }
            }
        }
        if (activity instanceof InterfaceC15807e) {
            ((InterfaceC15807e) activity).validateRequestPermissionsRequestCode(i);
        }
        C15804b.m100299b(activity, strArr, i);
    }

    /* JADX INFO: renamed from: v */
    public static void m100288v(@NonNull Activity activity, @Nullable cve0 cve0Var) {
        C15803a.m100295c(activity, cve0Var != null ? new SharedElementCallbackC15808f(cve0Var) : null);
    }

    /* JADX INFO: renamed from: w */
    public static void m100289w(@NonNull Activity activity, @Nullable cve0 cve0Var) {
        C15803a.m100296d(activity, cve0Var != null ? new SharedElementCallbackC15808f(cve0Var) : null);
    }

    /* JADX INFO: renamed from: x */
    public static boolean m100290x(@NonNull Activity activity, @NonNull String str) {
        int i = Build.VERSION.SDK_INT;
        if (i < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i >= 32) {
            return C15806d.m100302a(activity, str);
        }
        return i == 31 ? C15805c.m100301a(activity, str) : C15804b.m100300c(activity, str);
    }

    /* JADX INFO: renamed from: y */
    public static void m100291y(@NonNull Activity activity, @NonNull Intent intent, int i, @Nullable Bundle bundle) {
        activity.startActivityForResult(intent, i, bundle);
    }

    /* JADX INFO: renamed from: z */
    public static void m100292z(@NonNull Activity activity, @NonNull IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
