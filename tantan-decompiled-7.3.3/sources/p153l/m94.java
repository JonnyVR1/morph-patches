package p153l;

import android.content.Context;
import android.graphics.Point;
import android.hardware.Camera;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Api;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
final class m94 {

    /* JADX INFO: renamed from: f */
    private static final Pattern f135340f = Pattern.compile(Constants.SEPARATOR_COMMA);

    /* JADX INFO: renamed from: a */
    private final Context f135341a;

    /* JADX INFO: renamed from: b */
    private Point f135342b;

    /* JADX INFO: renamed from: c */
    private Point f135343c;

    /* JADX INFO: renamed from: d */
    private int f135344d;

    /* JADX INFO: renamed from: e */
    private String f135345e;

    public m94(Context context) {
        this.f135341a = context;
    }

    /* JADX INFO: renamed from: a */
    private static int m157549a(CharSequence charSequence, int i) {
        int i2 = 0;
        for (String str : f135340f.split(charSequence)) {
            try {
                double d = Double.parseDouble(str.trim());
                int i3 = (int) (10.0d * d);
                if (Math.abs(((double) i) - d) < Math.abs(i - i2)) {
                    i2 = i3;
                }
            } catch (NumberFormatException unused) {
                return i;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: b */
    private static Point m157550b(CharSequence charSequence, Point point) {
        String[] strArrSplit = f135340f.split(charSequence);
        int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i2 = 0;
        int i3 = 0;
        for (String str : strArrSplit) {
            String strTrim = str.trim();
            int iIndexOf = strTrim.indexOf(120);
            if (iIndexOf >= 0) {
                try {
                    int i4 = Integer.parseInt(strTrim.substring(0, iIndexOf));
                    int i5 = Integer.parseInt(strTrim.substring(iIndexOf + 1));
                    int iAbs = Math.abs(i4 - point.x) + Math.abs(i5 - point.y);
                    if (iAbs == 0) {
                        i3 = i5;
                        i2 = i4;
                        break;
                    }
                    if (iAbs < i) {
                        i3 = i5;
                        i = iAbs;
                        i2 = i4;
                    }
                } catch (NumberFormatException unused) {
                    continue;
                }
            }
        }
        if (i2 <= 0 || i3 <= 0) {
            return null;
        }
        return new Point(i2, i3);
    }

    /* JADX INFO: renamed from: d */
    private static Point m157551d(Camera.Parameters parameters, Point point) {
        String str = parameters.get("preview-size-values");
        if (str == null) {
            str = parameters.get("preview-size-value");
        }
        Point pointM157550b = str != null ? m157550b(str, point) : null;
        return pointM157550b == null ? new Point((point.x >> 3) << 3, (point.y >> 3) << 3) : pointM157550b;
    }

    /* JADX INFO: renamed from: j */
    private void m157552j(Camera.Parameters parameters) {
        if (Build.MODEL.contains("Behold II") && x94.f192902o == 3) {
            parameters.set("flash-value", 1);
        } else {
            parameters.set("flash-value", 2);
        }
        parameters.set("flash-mode", BLiveOperationTitleShowType.off);
    }

    /* JADX INFO: renamed from: k */
    private void m157553k(Camera.Parameters parameters) {
        String str = parameters.get("zoom-supported");
        if (str == null || Boolean.parseBoolean(str)) {
            String str2 = parameters.get("max-zoom");
            int iM157549a = 27;
            if (str2 != null) {
                try {
                    int i = (int) (Double.parseDouble(str2) * 10.0d);
                    if (27 > i) {
                        iM157549a = i;
                    }
                } catch (NumberFormatException unused) {
                }
            }
            String str3 = parameters.get("taking-picture-zoom-max");
            if (str3 != null) {
                try {
                    int i2 = Integer.parseInt(str3);
                    if (iM157549a > i2) {
                        iM157549a = i2;
                    }
                } catch (NumberFormatException unused2) {
                }
            }
            String str4 = parameters.get("mot-zoom-values");
            if (str4 != null) {
                iM157549a = m157549a(str4, iM157549a);
            }
            String str5 = parameters.get("mot-zoom-step");
            if (str5 != null) {
                try {
                    int i3 = (int) (Double.parseDouble(str5.trim()) * 10.0d);
                    if (i3 > 1) {
                        iM157549a -= iM157549a % i3;
                    }
                } catch (NumberFormatException unused3) {
                }
            }
            if (str2 != null || str4 != null) {
                parameters.set("zoom", String.valueOf(((double) iM157549a) / 10.0d));
            }
            if (str3 != null) {
                parameters.set("taking-picture-zoom", iM157549a);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public Point m157554c() {
        return this.f135343c;
    }

    /* JADX INFO: renamed from: e */
    public int m157555e() {
        return this.f135344d;
    }

    /* JADX INFO: renamed from: f */
    public String m157556f() {
        return this.f135345e;
    }

    /* JADX INFO: renamed from: g */
    public Point m157557g() {
        return this.f135342b;
    }

    /* JADX INFO: renamed from: h */
    public void m157558h(Camera camera) {
        Camera.Parameters parameters = camera.getParameters();
        this.f135344d = parameters.getPreviewFormat();
        this.f135345e = parameters.get("preview-format");
        Display defaultDisplay = ((WindowManager) this.f135341a.getSystemService(BLiveBottomPopupStyleTypeEnum.window)).getDefaultDisplay();
        Point point = new Point(defaultDisplay.getWidth(), defaultDisplay.getHeight());
        this.f135342b = point;
        Objects.toString(point);
        Point point2 = new Point();
        Point point3 = this.f135342b;
        point2.x = point3.x;
        point2.y = point3.y;
        int i = point3.x;
        int i2 = point3.y;
        if (i < i2) {
            point2.x = i2;
            point2.y = point3.x;
        }
        this.f135343c = m157551d(parameters, point2);
        Objects.toString(this.f135342b);
    }

    /* JADX INFO: renamed from: i */
    public void m157559i(Camera camera) {
        Camera.Parameters parameters = camera.getParameters();
        Objects.toString(this.f135343c);
        Point point = this.f135343c;
        parameters.setPreviewSize(point.x, point.y);
        m157552j(parameters);
        m157553k(parameters);
        camera.setDisplayOrientation(90);
        camera.setParameters(parameters);
    }
}
