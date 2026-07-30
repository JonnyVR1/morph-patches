package p153l;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.util.Base64;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import com.alibaba.fastjson.JSON;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class ac00 {
    /* JADX INFO: renamed from: a */
    public static String m96782a(byte[] bArr) {
        try {
            return Base64.encodeToString(bArr, 2);
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x001b: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:28), block:B:9:0x001b */
    /* JADX INFO: renamed from: b */
    public static byte[] m96783b(Bitmap bitmap) throws Throwable {
        OutputStream outputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        OutputStream outputStream2 = null;
        try {
            if (bitmap != null) {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
                        byteArrayOutputStream.flush();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        m96793l(byteArrayOutputStream);
                        return byteArray;
                    } catch (IOException e) {
                        e = e;
                        e.printStackTrace();
                        m96793l(byteArrayOutputStream);
                        return null;
                    }
                } catch (IOException e2) {
                    e = e2;
                    byteArrayOutputStream = null;
                } catch (Throwable th) {
                    th = th;
                    m96793l(outputStream2);
                    throw th;
                }
            } else {
                m96793l(null);
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            outputStream2 = outputStream;
        }
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m96784c(String str) {
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = fileInputStream.read(bArr);
                        if (i == -1) {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            fileInputStream.close();
                            return byteArray;
                        }
                        byteArrayOutputStream.write(bArr, 0, i);
                        try {
                            fileInputStream.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                fileInputStream.close();
                throw th4;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m96785d(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("_");
        String string = UUID.randomUUID().toString();
        sb.append(string.substring(string.length() - 4));
        sb.append(".");
        sb.append(str3);
        return sb.toString();
    }

    /* JADX INFO: renamed from: e */
    public static String m96786e(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m96787f(String str) {
        return str.endsWith(".zip");
    }

    /* JADX INFO: renamed from: g */
    public static <T> T m96788g(String str, Class<T> cls) {
        try {
            return (T) JSON.parseObject(str, cls);
        } catch (Exception e) {
            Log.getStackTraceString(e);
            e.getMessage();
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static <T> String m96789h(Object obj) {
        try {
            return JSON.toJSONString(obj);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: i */
    public static String m96790i(Context context, String str) {
        try {
            StringBuilder sb = new StringBuilder();
            InputStream inputStreamOpen = context.getResources().getAssets().open(str);
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStreamOpen.read(bArr);
                if (-1 == i) {
                    return sb.toString();
                }
                sb.append(new String(bArr, 0, i));
            }
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: j */
    public static byte[] m96791j(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                fileInputStream = new FileInputStream(str);
                while (true) {
                    try {
                        int i = fileInputStream.read(bArr, 0, 1024);
                        if (-1 == i) {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            m96792k(fileInputStream);
                            m96793l(byteArrayOutputStream);
                            return byteArray;
                        }
                        byteArrayOutputStream.write(bArr, 0, i);
                    } catch (Exception unused) {
                        m96792k(fileInputStream);
                        m96793l(byteArrayOutputStream);
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream2 = fileInputStream;
                        m96792k(fileInputStream2);
                        m96793l(byteArrayOutputStream);
                        throw th;
                    }
                }
            } catch (Exception unused2) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused3) {
            byteArrayOutputStream = null;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m96792k(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m96793l(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static Bitmap m96794m(Bitmap bitmap, int i) {
        int i2;
        if (bitmap == null) {
            return bitmap;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (height > width) {
                int i3 = (int) (i * (width / height));
                i2 = i;
                i = i3;
            } else {
                i2 = (int) ((i * height) / width);
            }
            return Bitmap.createScaledBitmap(bitmap, i, i2, true);
        } catch (Exception e) {
            e.printStackTrace();
            return bitmap;
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m96795n(Activity activity, float f) {
        Window window = activity.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.screenBrightness = f;
            window.setAttributes(attributes);
        }
    }
}
