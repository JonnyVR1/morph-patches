package com.cosmos.photon.push.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import androidx.annotation.RequiresApi;
import com.cosmos.mdlog.MDLog;
import com.cosmos.photon.push.log.LogTag;
import p149l.dvc0;
import p149l.evc0;

/* JADX INFO: loaded from: classes.dex */
public class Res {
    public static final int anim(Context context, String str) {
        return context.getResources().getIdentifier(context.getPackageName() + ":anim/" + str, null, null);
    }

    public static final int dimension(Context context, String str) {
        return context.getResources().getIdentifier(context.getPackageName() + ":dimen/" + str, null, null);
    }

    public static final int drawable(Context context, String str) {
        return context.getResources().getIdentifier(context.getPackageName() + ":drawable/" + str, null, null);
    }

    public static Bitmap getAppIcon(Context context, String str) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 26) {
            return getAppIconV26(packageManager, str);
        }
        try {
            return ((BitmapDrawable) packageManager.getApplicationIcon(str)).getBitmap();
        } catch (Exception e) {
            MDLog.printErrStackTrace(LogTag.COMMON, e);
            return null;
        }
    }

    public static int getAppIconRes(Context context, String str) {
        try {
            return context.getApplicationContext().getPackageManager().getApplicationInfo(str, 0).icon;
        } catch (Exception e) {
            MDLog.printErrStackTrace(LogTag.COMMON, e);
            return -1;
        }
    }

    @RequiresApi(api = 26)
    public static Bitmap getAppIconV26(PackageManager packageManager, String str) {
        try {
            Drawable applicationIcon = packageManager.getApplicationIcon(str);
            if (applicationIcon instanceof BitmapDrawable) {
                return ((BitmapDrawable) applicationIcon).getBitmap();
            }
            if (!dvc0.m113774a(applicationIcon)) {
                return null;
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{evc0.m118258a(applicationIcon).getBackground(), evc0.m118258a(applicationIcon).getForeground()});
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(layerDrawable.getIntrinsicWidth(), layerDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            layerDrawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            layerDrawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (PackageManager.NameNotFoundException e) {
            MDLog.printErrStackTrace(LogTag.COMMON, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: id */
    public static final int m7407id(Context context, String str) {
        return context.getResources().getIdentifier(context.getPackageName() + ":id/" + str, null, null);
    }

    public static final int integer(Context context, String str) {
        return context.getResources().getIdentifier(context.getPackageName() + ":integer/" + str, null, null);
    }

    public static final int layout(Context context, String str) {
        return context.getResources().getIdentifier(context.getPackageName() + ":layout/" + str, null, null);
    }

    public static final int raw(Context context, String str) {
        return context.getResources().getIdentifier(context.getPackageName() + ":raw/" + str, null, null);
    }

    public static final String string(Context context, String str) {
        return context.getString(stringId(context, str));
    }

    public static final int stringId(Context context, String str) {
        return context.getResources().getIdentifier(context.getPackageName() + ":string/" + str, null, null);
    }

    public static final int style(Context context, String str) {
        return context.getResources().getIdentifier(context.getPackageName() + ":style/" + str, null, null);
    }
}
