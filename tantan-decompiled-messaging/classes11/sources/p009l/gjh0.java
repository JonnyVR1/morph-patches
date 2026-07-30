package p009l;

import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import android.os.Build;
import com.p008ss.android.ttvecamera.C0735f;
import com.p008ss.android.ttvecamera.TEFocusSettings;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class gjh0 {

    /* JADX INFO: renamed from: h */
    public static final List<String> f13601h;

    /* JADX INFO: renamed from: d */
    private int f13605d;

    /* JADX INFO: renamed from: e */
    int f13606e;

    /* JADX INFO: renamed from: a */
    protected final int f13602a = 90;

    /* JADX INFO: renamed from: b */
    protected final float f13603b = 1.0f;

    /* JADX INFO: renamed from: c */
    protected final float f13604c = 2.0f;

    /* JADX INFO: renamed from: f */
    private List<Camera.Area> f13607f = new ArrayList();

    /* JADX INFO: renamed from: g */
    private List<Camera.Area> f13608g = new ArrayList();

    static {
        ArrayList arrayList = new ArrayList();
        f13601h = arrayList;
        arrayList.add("multilaser");
        arrayList.add("ms40");
    }

    public gjh0(int i) {
        this.f13605d = i;
    }

    /* JADX INFO: renamed from: a */
    public List<Camera.Area> m15080a(int i, int i2, float f, int i3, int i4, int i5, TEFocusSettings.CoordinatesMode coordinatesMode) {
        Rect rectM15082c = m15082c(i, i2, f, 90.0f, i3, i4, i5, coordinatesMode);
        if (this.f13607f.size() > 0) {
            this.f13607f.clear();
        }
        this.f13607f.add(new Camera.Area(rectM15082c, 1000));
        return this.f13607f;
    }

    /* JADX INFO: renamed from: b */
    public List<Camera.Area> m15081b(int i, int i2, float f, int i3, int i4, int i5, TEFocusSettings.CoordinatesMode coordinatesMode) {
        Rect rectM15082c = m15082c(i, i2, f, 180.0f, i3, i4, i5, coordinatesMode);
        if (this.f13608g.size() > 0) {
            this.f13608g.clear();
        }
        this.f13608g.add(new Camera.Area(rectM15082c, 1000));
        return this.f13608g;
    }

    /* JADX INFO: renamed from: c */
    public Rect m15082c(int i, int i2, float f, float f2, int i3, int i4, int i5, TEFocusSettings.CoordinatesMode coordinatesMode) {
        int iIntValue = Float.valueOf((f * f2) + 0.5f).intValue();
        int i6 = ((int) (((i3 * 2000) * 1.0f) / i)) - 1000;
        int i7 = ((int) (((i4 * 2000) * 1.0f) / i2)) - 1000;
        if (this.f13606e == 1 && coordinatesMode == TEFocusSettings.CoordinatesMode.VIEW) {
            i6 = -i6;
        }
        int i8 = iIntValue / 2;
        int iM11054e = C0735f.m11054e(i6 - i8, -1000, 1000);
        int iM11054e2 = C0735f.m11054e(i7 - i8, -1000, 1000);
        Rect rect = new Rect();
        RectF rectF = new RectF(iM11054e, iM11054e2, C0735f.m11053d(iM11054e + iIntValue), C0735f.m11053d(iM11054e2 + iIntValue));
        Rect rect2 = new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        Rect rect3 = new Rect(-1000, -1000, 1000, 1000);
        if (coordinatesMode == TEFocusSettings.CoordinatesMode.VIEW) {
            C0735f.m11072w(i5, rect3, rect2);
            rect = new Rect(rect2.left - 1000, rect2.top - 1000, rect2.right - 1000, rect2.bottom - 1000);
        } else if (coordinatesMode == TEFocusSettings.CoordinatesMode.ORIGINAL_FRAME) {
            rect = new Rect(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
        rect.left = C0735f.m11053d(rect.left);
        rect.right = C0735f.m11053d(rect.right);
        rect.top = C0735f.m11053d(rect.top);
        rect.bottom = C0735f.m11053d(rect.bottom);
        return rect;
    }

    /* JADX INFO: renamed from: d */
    public boolean m15083d(Camera.Parameters parameters) {
        return (parameters == null || f13601h.contains(Build.BRAND.toLowerCase()) || parameters.getMaxNumFocusAreas() <= 0) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public boolean m15084e(Camera.Parameters parameters, String str) {
        if (m15083d(parameters)) {
            return parameters.getSupportedFocusModes().contains(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m15085f(int i, Camera.Parameters parameters) {
        return parameters != null && parameters.getMaxNumMeteringAreas() > 0;
    }

    /* JADX INFO: renamed from: g */
    public String m15086g(int i, Camera.Parameters parameters, boolean z) {
        if (parameters == null) {
            return "";
        }
        this.f13606e = i;
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (i == 1) {
            if (z && supportedFocusModes.contains("continuous-video")) {
                return "continuous-video";
            }
            if (supportedFocusModes.contains("macro")) {
                return "macro";
            }
            if (supportedFocusModes.contains("auto")) {
                return "auto";
            }
        } else {
            if (supportedFocusModes.contains("continuous-video")) {
                return "continuous-video";
            }
            if (supportedFocusModes.contains("continuous-picture")) {
                return "continuous-picture";
            }
            if (supportedFocusModes.contains("auto")) {
                return "auto";
            }
        }
        return "";
    }
}
