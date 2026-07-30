package p149l;

import android.content.Context;
import android.graphics.Point;
import android.hardware.Camera;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Api;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
final class n84 {

    /* JADX INFO: renamed from: f */
    private static final Pattern f137575f = Pattern.compile(Constants.SEPARATOR_COMMA);

    /* JADX INFO: renamed from: a */
    private final Context f137576a;

    /* JADX INFO: renamed from: b */
    private Point f137577b;

    /* JADX INFO: renamed from: c */
    private Point f137578c;

    /* JADX INFO: renamed from: d */
    private int f137579d;

    /* JADX INFO: renamed from: e */
    private String f137580e;

    public n84(Context context) {
        this.f137576a = context;
    }

    /* JADX INFO: renamed from: a */
    private static int m158177a(CharSequence charSequence, int i) {
        int i2 = 0;
        for (String str : f137575f.split(charSequence)) {
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
    private static Point m158178b(CharSequence charSequence, Point point) {
        String[] strArrSplit = f137575f.split(charSequence);
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
    private static Point m158179d(Camera.Parameters parameters, Point point) {
        String str = parameters.get("preview-size-values");
        if (str == null) {
            str = parameters.get("preview-size-value");
        }
        Point pointM158178b = str != null ? m158178b(str, point) : null;
        return pointM158178b == null ? new Point((point.x >> 3) << 3, (point.y >> 3) << 3) : pointM158178b;
    }

    /* JADX INFO: renamed from: j */
    private void m158180j(Camera.Parameters parameters) {
        if (Build.MODEL.contains("Behold II") && y84.f196766o == 3) {
            parameters.set("flash-value", 1);
        } else {
            parameters.set("flash-value", 2);
        }
        parameters.set("flash-mode", BLiveOperationTitleShowType.off);
    }

    /* JADX INFO: renamed from: k */
    private void m158181k(Camera.Parameters parameters) {
        String str = parameters.get("zoom-supported");
        if (str == null || Boolean.parseBoolean(str)) {
            String str2 = parameters.get("max-zoom");
            int iM158177a = 27;
            if (str2 != null) {
                try {
                    int i = (int) (Double.parseDouble(str2) * 10.0d);
                    if (27 > i) {
                        iM158177a = i;
                    }
                } catch (NumberFormatException unused) {
                }
            }
            String str3 = parameters.get("taking-picture-zoom-max");
            if (str3 != null) {
                try {
                    int i2 = Integer.parseInt(str3);
                    if (iM158177a > i2) {
                        iM158177a = i2;
                    }
                } catch (NumberFormatException unused2) {
                }
            }
            String str4 = parameters.get("mot-zoom-values");
            if (str4 != null) {
                iM158177a = m158177a(str4, iM158177a);
            }
            String str5 = parameters.get("mot-zoom-step");
            if (str5 != null) {
                try {
                    int i3 = (int) (Double.parseDouble(str5.trim()) * 10.0d);
                    if (i3 > 1) {
                        iM158177a -= iM158177a % i3;
                    }
                } catch (NumberFormatException unused3) {
                }
            }
            if (str2 != null || str4 != null) {
                parameters.set("zoom", String.valueOf(((double) iM158177a) / 10.0d));
            }
            if (str3 != null) {
                parameters.set("taking-picture-zoom", iM158177a);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public Point m158182c() {
        return this.f137578c;
    }

    /* JADX INFO: renamed from: e */
    public int m158183e() {
        return this.f137579d;
    }

    /* JADX INFO: renamed from: f */
    public String m158184f() {
        return this.f137580e;
    }

    /* JADX INFO: renamed from: g */
    public Point m158185g() {
        return this.f137577b;
    }

    /* JADX INFO: renamed from: h */
    public void m158186h(Camera camera) {
        Camera.Parameters parameters = camera.getParameters();
        this.f137579d = parameters.getPreviewFormat();
        this.f137580e = parameters.get("preview-format");
        Display defaultDisplay = ((WindowManager) this.f137576a.getSystemService(BLiveBottomPopupStyleTypeEnum.window)).getDefaultDisplay();
        Point point = new Point(defaultDisplay.getWidth(), defaultDisplay.getHeight());
        this.f137577b = point;
        Objects.toString(point);
        Point point2 = new Point();
        Point point3 = this.f137577b;
        point2.x = point3.x;
        point2.y = point3.y;
        int i = point3.x;
        int i2 = point3.y;
        if (i < i2) {
            point2.x = i2;
            point2.y = point3.x;
        }
        this.f137578c = m158179d(parameters, point2);
        Objects.toString(this.f137577b);
    }

    /* JADX INFO: renamed from: i */
    public void m158187i(Camera camera) {
        Camera.Parameters parameters = camera.getParameters();
        Objects.toString(this.f137578c);
        Point point = this.f137578c;
        parameters.setPreviewSize(point.x, point.y);
        m158180j(parameters);
        m158181k(parameters);
        camera.setDisplayOrientation(90);
        camera.setParameters(parameters);
    }
}
