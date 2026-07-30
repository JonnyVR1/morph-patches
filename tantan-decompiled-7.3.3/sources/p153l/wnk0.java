package p153l;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes7.dex */
public class wnk0 {

    /* JADX INFO: renamed from: a */
    private static DisplayMetrics f189963a;

    /* JADX INFO: renamed from: a */
    public static String m207213a(String str, int i) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            try {
                int iOffsetByCodePoints = str.offsetByCodePoints(i2, 1);
                i3 = str.substring(i2, iOffsetByCodePoints).getBytes("utf-8").length >= 3 ? i3 + 2 : i3 + 1;
                if (i3 == i) {
                    return str.substring(0, iOffsetByCodePoints);
                }
                if (i3 > i) {
                    return str.substring(0, i4);
                }
                i2++;
                i4 = iOffsetByCodePoints;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return str;
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: b */
    public static DisplayMetrics m207214b(Context context) {
        if (f189963a == null) {
            f189963a = new DisplayMetrics();
            ((WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window)).getDefaultDisplay().getRealMetrics(f189963a);
        }
        return f189963a;
    }

    /* JADX INFO: renamed from: c */
    public static int m207215c(Context context) {
        return m207214b(context).widthPixels;
    }

    /* JADX INFO: renamed from: d */
    public static int m207216d(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            try {
                i2 = str.substring(i, i3).getBytes("utf-8").length >= 3 ? i2 + 2 : i2 + 1;
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            i = i3;
        }
        return i2;
    }

    /* JADX INFO: renamed from: e */
    public static String m207217e(File file) throws Throwable {
        if (file == null || !file.exists()) {
            return "";
        }
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                try {
                    StringBuilder sb = new StringBuilder((int) file.length());
                    while (true) {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            String string = sb.toString();
                            try {
                                bufferedReader2.close();
                                return string;
                            } catch (IOException e) {
                                e.printStackTrace();
                                return string;
                            }
                        }
                        if (sb.length() != 0) {
                            sb.append('\n');
                        }
                        sb.append(line);
                    }
                } catch (IOException e2) {
                    e = e2;
                    bufferedReader = bufferedReader2;
                    e.printStackTrace();
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    return "";
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e5) {
            e = e5;
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m207218f(String str) {
        return m207217e(new File(str));
    }
}
