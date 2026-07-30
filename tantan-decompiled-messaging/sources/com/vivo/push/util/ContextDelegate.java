package com.vivo.push.util;

import android.content.Context;
import com.p046p1.mobile.putong.core.data.CardButtonsShowAndHideType;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class ContextDelegate {
    private static final String TAG = "ContextDelegate";
    private static Context mContext = null;
    private static Method mCreateCredentialProtectedStorageContext = null;
    private static Method mCreateDeviceProtectedStorageContext = null;
    private static boolean mDelegateEnable = false;
    private static Boolean mIsFbeProject;

    /* JADX INFO: renamed from: com.vivo.push.util.ContextDelegate$a */
    public static class C14631a {

        /* JADX INFO: renamed from: a */
        private static ContextDelegate f61095a = new ContextDelegate();
    }

    private static Context createCredentialProtectedStorageContext(Context context) {
        try {
            if (mCreateCredentialProtectedStorageContext == null) {
                mCreateCredentialProtectedStorageContext = Context.class.getMethod("createCredentialProtectedStorageContext", null);
            }
            return (Context) mCreateCredentialProtectedStorageContext.invoke(context, null);
        } catch (Exception e) {
            e.printStackTrace();
            return context;
        }
    }

    private static Context createDeviceProtectedStorageContext(Context context) {
        try {
            if (mCreateDeviceProtectedStorageContext == null) {
                mCreateDeviceProtectedStorageContext = Context.class.getMethod("createDeviceProtectedStorageContext", null);
            }
            return (Context) mCreateDeviceProtectedStorageContext.invoke(context, null);
        } catch (Exception e) {
            e.printStackTrace();
            return context;
        }
    }

    public static Context getContext(Context context) {
        if (!isFBEProject() || context == null) {
            return context;
        }
        Context context2 = mContext;
        if (context2 != null) {
            return context2;
        }
        setContext(context);
        return mContext;
    }

    public static ContextDelegate getInstance() {
        return C14631a.f61095a;
    }

    public static boolean isFBEProject() {
        if (mIsFbeProject == null) {
            try {
                mIsFbeProject = Boolean.valueOf("file".equals(C14641j.m84984a("ro.crypto.type", CardButtonsShowAndHideType.unknow)));
                C14647p.m85015b(TAG, "mIsFbeProject = " + mIsFbeProject.toString());
            } catch (Exception e) {
                C14647p.m85008a(TAG, "mIsFbeProject = " + e.getMessage());
            }
        }
        Boolean bool = mIsFbeProject;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    private static void setAppContext() {
        Context context = mContext;
        if (context == null) {
            return;
        }
        setContext(context);
    }

    private static void setContext(Context context) {
        if (mDelegateEnable) {
            mContext = createDeviceProtectedStorageContext(context);
        } else {
            mContext = createCredentialProtectedStorageContext(context);
        }
    }

    public static void setEnable(boolean z) {
        mDelegateEnable = z;
        setAppContext();
    }
}
