package com.sina.weibo.sdk.utils;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ResourceManager {
    private static final String TAG = "com.sina.weibo.sdk.utils.ResourceManager";
    private static final String DRAWABLE_XXHDPI = "drawable-xxhdpi";
    private static final String DRAWABLE_XHDPI = "drawable-xhdpi";
    private static final String DRAWABLE_HDPI = "drawable-hdpi";
    private static final String DRAWABLE_MDPI = "drawable-mdpi";
    private static final String DRAWABLE_LDPI = "drawable-ldpi";
    private static final String DRAWABLE = "drawable";
    private static final String[] PRE_INSTALL_DRAWBLE_PATHS = {DRAWABLE_XXHDPI, DRAWABLE_XHDPI, DRAWABLE_HDPI, DRAWABLE_MDPI, DRAWABLE_LDPI, DRAWABLE};

    public static ColorStateList createColorStateList(int i, int i2) {
        return new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}, new int[]{R.attr.state_selected}, new int[]{R.attr.state_focused}, StateSet.WILD_CARD}, new int[]{i2, i2, i2, i});
    }

    public static StateListDrawable createStateListDrawable(Context context, String str, String str2, String str3) {
        Drawable ninePatchDrawable = str.indexOf(".9") > -1 ? getNinePatchDrawable(context, str) : getDrawable(context, str);
        Drawable ninePatchDrawable2 = str3.indexOf(".9") > -1 ? getNinePatchDrawable(context, str3) : getDrawable(context, str3);
        Drawable ninePatchDrawable3 = str2.indexOf(".9") > -1 ? getNinePatchDrawable(context, str2) : getDrawable(context, str2);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, ninePatchDrawable3);
        stateListDrawable.addState(new int[]{R.attr.state_selected}, ninePatchDrawable3);
        stateListDrawable.addState(new int[]{R.attr.state_focused}, ninePatchDrawable3);
        stateListDrawable.addState(new int[]{R.attr.enabled}, ninePatchDrawable2);
        stateListDrawable.addState(StateSet.WILD_CARD, ninePatchDrawable);
        return stateListDrawable;
    }

    public static int dp2px(Context context, int i) {
        return (int) (((double) (i * context.getResources().getDisplayMetrics().density)) + 0.5d);
    }

    private static Drawable extractDrawable(Context context, String str) throws Exception {
        InputStream inputStreamOpen = context.getAssets().open(str);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        TypedValue typedValue = new TypedValue();
        typedValue.density = displayMetrics.densityDpi;
        Drawable drawableCreateFromResourceStream = Drawable.createFromResourceStream(context.getResources(), typedValue, inputStreamOpen, str);
        inputStreamOpen.close();
        return drawableCreateFromResourceStream;
    }

    private static View extractView(Context context, String str, ViewGroup viewGroup) throws Exception {
        return ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(context.getAssets().openXmlResourceParser(str), viewGroup);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    private static String getAppropriatePathOfDrawable(Context context, String str) {
        String[] strArr;
        if (TextUtils.isEmpty(str)) {
            LogUtil.m10830e(TAG, "id is NOT correct!");
            return null;
        }
        String currentDpiFolder = getCurrentDpiFolder(context);
        LogUtil.m10829d(TAG, "find Appropriate path...");
        int i = -1;
        int i2 = 0;
        int i3 = -1;
        int i4 = -1;
        while (true) {
            strArr = PRE_INSTALL_DRAWBLE_PATHS;
            if (i2 >= strArr.length) {
                i2 = -1;
                break;
            }
            if (strArr[i2].equals(currentDpiFolder)) {
                i3 = i2;
            }
            String str2 = strArr[i2] + "/" + str;
            if (isFileExisted(context, str2)) {
                if (i3 != i2) {
                    if (i3 >= 0) {
                        break;
                    }
                    i4 = i2;
                } else {
                    return str2;
                }
            }
            i2++;
        }
        if (i4 <= 0 || i2 <= 0) {
            if (i4 > 0 && i2 < 0) {
                i = i4;
            } else if (i4 >= 0 || i2 <= 0) {
                LogUtil.m10830e(TAG, "Not find the appropriate path for drawable");
            } else {
                i = i2;
            }
        } else if (Math.abs(i3 - i2) <= Math.abs(i3 - i4)) {
            i = i2;
        } else {
            i = i4;
        }
        if (i < 0) {
            LogUtil.m10830e(TAG, "Not find the appropriate path for drawable");
            return null;
        }
        return strArr[i] + "/" + str;
    }

    private static String getCurrentDpiFolder(Context context) {
        int i = context.getResources().getDisplayMetrics().densityDpi;
        if (i <= 120) {
            return DRAWABLE_LDPI;
        }
        if (i > 120 && i <= 160) {
            return DRAWABLE_MDPI;
        }
        if (i <= 160 || i > 240) {
            return (i <= 240 || i > 320) ? DRAWABLE_XXHDPI : DRAWABLE_XHDPI;
        }
        return DRAWABLE_HDPI;
    }

    public static Drawable getDrawable(Context context, String str) {
        return getDrawableFromAssert(context, getAppropriatePathOfDrawable(context, str), false);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0054 A[EXC_TOP_SPLITTER, PHI: r1 r9
      0x0054: PHI (r1v4 android.graphics.drawable.Drawable) = (r1v3 android.graphics.drawable.Drawable), (r1v10 android.graphics.drawable.Drawable) binds: [B:24:0x0067, B:14:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0054: PHI (r9v5 java.io.InputStream) = (r9v4 java.io.InputStream), (r9v6 java.io.InputStream) binds: [B:24:0x0067, B:14:0x0052] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:? A[SYNTHETIC] */
    private static Drawable getDrawableFromAssert(Context context, String str, boolean z) throws Throwable {
        Throwable th;
        IOException iOException;
        InputStream inputStreamOpen;
        InputStream inputStream = null;
        bitmapDrawable = null;
        bitmapDrawable = null;
        Drawable bitmapDrawable = null;
        try {
            inputStreamOpen = context.getAssets().open(str);
            if (inputStreamOpen != null) {
                try {
                    try {
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen);
                        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                        if (z) {
                            bitmapDrawable = new NinePatchDrawable(new Resources(context.getAssets(), displayMetrics, context.getResources().getConfiguration()), bitmapDecodeStream, bitmapDecodeStream.getNinePatchChunk(), new Rect(0, 0, 0, 0), null);
                        } else {
                            bitmapDecodeStream.setDensity(displayMetrics.densityDpi);
                            bitmapDrawable = new BitmapDrawable(context.getResources(), bitmapDecodeStream);
                        }
                    } catch (IOException e) {
                        iOException = e;
                        iOException.printStackTrace();
                        if (inputStreamOpen != null) {
                            try {
                                inputStreamOpen.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = inputStreamOpen;
                    if (inputStream != null) {
                        throw th;
                    }
                    try {
                        inputStream.close();
                        throw th;
                    } catch (IOException e3) {
                        e3.printStackTrace();
                        throw th;
                    }
                }
            }
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
        } catch (IOException e4) {
            iOException = e4;
            inputStreamOpen = null;
        } catch (Throwable th3) {
            th = th3;
            if (inputStream != null) {
                throw th;
            }
            inputStream.close();
            throw th;
        }
        return bitmapDrawable;
    }

    public static Locale getLanguage() {
        Locale locale = Locale.getDefault();
        if (Locale.SIMPLIFIED_CHINESE.equals(locale) || Locale.TRADITIONAL_CHINESE.equals(locale)) {
            return locale;
        }
        return (locale.getLanguage().equals("zh") && (locale.getCountry().contains("CN") || locale.getCountry().contains("TW"))) ? locale : Locale.ENGLISH;
    }

    public static Drawable getNinePatchDrawable(Context context, String str) {
        return getDrawableFromAssert(context, getAppropriatePathOfDrawable(context, str), true);
    }

    public static String getString(Context context, String str, String str2, String str3) {
        Locale language = getLanguage();
        if (Locale.SIMPLIFIED_CHINESE.equals(language) || ("zh".equals(language.getLanguage()) && language.getCountry().contains("CN"))) {
            return str2;
        }
        return (Locale.TRADITIONAL_CHINESE.equals(language) || ("zh".equals(language.getLanguage()) && language.getCountry().contains("TW"))) ? str3 : str;
    }

    private static boolean isFileExisted(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        InputStream inputStreamOpen = null;
        try {
            try {
                inputStreamOpen = context.getAssets().open(str);
                LogUtil.m10829d(TAG, "file [" + str + "] existed");
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                        return true;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                return true;
            } catch (IOException unused) {
                LogUtil.m10829d(TAG, "file [" + str + "] NOT existed");
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                return false;
            }
        } catch (Throwable th) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static String readCountryFromAsset(Context context, String str) {
        String str2 = "";
        try {
            InputStream inputStreamOpen = context.getAssets().open(str);
            if (inputStreamOpen == null) {
                return "";
            }
            DataInputStream dataInputStream = new DataInputStream(inputStreamOpen);
            byte[] bArr = new byte[dataInputStream.available()];
            dataInputStream.read(bArr);
            String str3 = new String(bArr, "UTF-8");
            try {
                inputStreamOpen.close();
                return str3;
            } catch (IOException e) {
                e = e;
                str2 = str3;
            }
        } catch (IOException e2) {
            e = e2;
        }
        e.printStackTrace();
        return str2;
    }

    public static StateListDrawable createStateListDrawable(Context context, String str, String str2) {
        Drawable drawable;
        Drawable drawable2;
        if (str.indexOf(".9") > -1) {
            drawable = getNinePatchDrawable(context, str);
        } else {
            drawable = getDrawable(context, str);
        }
        if (str2.indexOf(".9") > -1) {
            drawable2 = getNinePatchDrawable(context, str2);
        } else {
            drawable2 = getDrawable(context, str2);
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, drawable2);
        stateListDrawable.addState(new int[]{R.attr.state_selected}, drawable2);
        stateListDrawable.addState(new int[]{R.attr.state_focused}, drawable2);
        stateListDrawable.addState(StateSet.WILD_CARD, drawable);
        return stateListDrawable;
    }
}
