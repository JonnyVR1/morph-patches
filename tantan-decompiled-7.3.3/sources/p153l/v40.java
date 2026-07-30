package p153l;

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
public class v40 extends j26 {

    /* JADX INFO: renamed from: l.v40$a */
    @RequiresApi(21)
    public static class C20746a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m199650a(Activity activity) {
            activity.finishAfterTransition();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static void m199651b(Activity activity) {
            activity.postponeEnterTransition();
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static void m199652c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        @DoNotInline
        /* JADX INFO: renamed from: d */
        public static void m199653d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        @DoNotInline
        /* JADX INFO: renamed from: e */
        public static void m199654e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    /* JADX INFO: renamed from: l.v40$b */
    @RequiresApi(23)
    public static class C20747b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m199655a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static void m199656b(Activity activity, String[] strArr, int i) {
            activity.requestPermissions(strArr, i);
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static boolean m199657c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* JADX INFO: renamed from: l.v40$c */
    @RequiresApi(31)
    public static class C20748c {
        @DoNotInline
        @SuppressLint({"BanUncheckedReflection"})
        /* JADX INFO: renamed from: a */
        public static boolean m199658a(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    /* JADX INFO: renamed from: l.v40$d */
    @RequiresApi(32)
    public static class C20749d {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static boolean m199659a(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* JADX INFO: renamed from: l.v40$e */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface InterfaceC20750e {
        void validateRequestPermissionsRequestCode(int i);
    }

    /* JADX INFO: renamed from: l.v40$f */
    @RequiresApi(21)
    public static class SharedElementCallbackC20751f extends SharedElementCallback {

        /* JADX INFO: renamed from: a */
        public final j3f0 f182321a;

        public SharedElementCallbackC20751f(j3f0 j3f0Var) {
            this.f182321a = j3f0Var;
        }

        @Override // android.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.f182321a.m143342b(view, matrix, rectF);
        }

        @Override // android.app.SharedElementCallback
        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.f182321a.m143343c(context, parcelable);
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.f182321a.m143344d(list, map);
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(List<View> list) {
            this.f182321a.m143345e(list);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.f182321a.m143346f(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.f182321a.m143347g(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        @RequiresApi(23)
        public void onSharedElementsArrived(List<String> list, List<View> list2, final SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.f182321a.m143348h(list, list2, new j3f0.InterfaceC17865a() { // from class: l.w40
                @Override // p153l.j3f0.InterfaceC17865a
                public final void onSharedElementsReady() {
                    v40.C20747b.m199655a(onSharedElementsReadyListener);
                }
            });
        }
    }

    /* JADX INFO: renamed from: A */
    public static void m199638A(@NonNull Activity activity) {
        C20746a.m199654e(activity);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m199639p(Activity activity) {
        if (activity.isFinishing() || v50.m199763i(activity)) {
            return;
        }
        activity.recreate();
    }

    /* JADX INFO: renamed from: q */
    public static void m199640q(@NonNull Activity activity) {
        activity.finishAffinity();
    }

    /* JADX INFO: renamed from: r */
    public static void m199641r(@NonNull Activity activity) {
        C20746a.m199650a(activity);
    }

    /* JADX INFO: renamed from: s */
    public static void m199642s(@NonNull Activity activity) {
        C20746a.m199651b(activity);
    }

    /* JADX INFO: renamed from: t */
    public static void m199643t(@NonNull final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: l.u40
                @Override // java.lang.Runnable
                public final void run() {
                    v40.m199639p(activity);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public static void m199644u(@NonNull Activity activity, @NonNull String[] strArr, @IntRange(from = 0) int i) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (TextUtils.isEmpty(strArr[i2])) {
                pnl.m173070a("Permission request for permissions ", Arrays.toString(strArr), " must not contain null or empty values");
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
        if (activity instanceof InterfaceC20750e) {
            ((InterfaceC20750e) activity).validateRequestPermissionsRequestCode(i);
        }
        C20747b.m199656b(activity, strArr, i);
    }

    /* JADX INFO: renamed from: v */
    public static void m199645v(@NonNull Activity activity, @Nullable j3f0 j3f0Var) {
        C20746a.m199652c(activity, j3f0Var != null ? new SharedElementCallbackC20751f(j3f0Var) : null);
    }

    /* JADX INFO: renamed from: w */
    public static void m199646w(@NonNull Activity activity, @Nullable j3f0 j3f0Var) {
        C20746a.m199653d(activity, j3f0Var != null ? new SharedElementCallbackC20751f(j3f0Var) : null);
    }

    /* JADX INFO: renamed from: x */
    public static boolean m199647x(@NonNull Activity activity, @NonNull String str) {
        int i = Build.VERSION.SDK_INT;
        if (i < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i >= 32) {
            return C20749d.m199659a(activity, str);
        }
        return i == 31 ? C20748c.m199658a(activity, str) : C20747b.m199657c(activity, str);
    }

    /* JADX INFO: renamed from: y */
    public static void m199648y(@NonNull Activity activity, @NonNull Intent intent, int i, @Nullable Bundle bundle) {
        activity.startActivityForResult(intent, i, bundle);
    }

    /* JADX INFO: renamed from: z */
    public static void m199649z(@NonNull Activity activity, @NonNull IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
