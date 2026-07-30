package p153l;

import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import android.os.Build;
import com.p074ss.android.ttvecamera.C13496f;
import com.p074ss.android.ttvecamera.TEFocusSettings;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class nrh0 {

    /* JADX INFO: renamed from: h */
    public static final List<String> f143404h;

    /* JADX INFO: renamed from: d */
    private int f143408d;

    /* JADX INFO: renamed from: e */
    int f143409e;

    /* JADX INFO: renamed from: a */
    protected final int f143405a = 90;

    /* JADX INFO: renamed from: b */
    protected final float f143406b = 1.0f;

    /* JADX INFO: renamed from: c */
    protected final float f143407c = 2.0f;

    /* JADX INFO: renamed from: f */
    private List<Camera.Area> f143410f = new ArrayList();

    /* JADX INFO: renamed from: g */
    private List<Camera.Area> f143411g = new ArrayList();

    static {
        ArrayList arrayList = new ArrayList();
        f143404h = arrayList;
        arrayList.add("multilaser");
        arrayList.add("ms40");
    }

    public nrh0(int i) {
        this.f143408d = i;
    }

    /* JADX INFO: renamed from: a */
    public List<Camera.Area> m164483a(int i, int i2, float f, int i3, int i4, int i5, TEFocusSettings.CoordinatesMode coordinatesMode) {
        Rect rectM164485c = m164485c(i, i2, f, 90.0f, i3, i4, i5, coordinatesMode);
        if (this.f143410f.size() > 0) {
            this.f143410f.clear();
        }
        this.f143410f.add(new Camera.Area(rectM164485c, 1000));
        return this.f143410f;
    }

    /* JADX INFO: renamed from: b */
    public List<Camera.Area> m164484b(int i, int i2, float f, int i3, int i4, int i5, TEFocusSettings.CoordinatesMode coordinatesMode) {
        Rect rectM164485c = m164485c(i, i2, f, 180.0f, i3, i4, i5, coordinatesMode);
        if (this.f143411g.size() > 0) {
            this.f143411g.clear();
        }
        this.f143411g.add(new Camera.Area(rectM164485c, 1000));
        return this.f143411g;
    }

    /* JADX INFO: renamed from: c */
    public Rect m164485c(int i, int i2, float f, float f2, int i3, int i4, int i5, TEFocusSettings.CoordinatesMode coordinatesMode) {
        int iIntValue = Float.valueOf((f * f2) + 0.5f).intValue();
        int i6 = ((int) (((i3 * 2000) * 1.0f) / i)) - 1000;
        int i7 = ((int) (((i4 * 2000) * 1.0f) / i2)) - 1000;
        if (this.f143409e == 1 && coordinatesMode == TEFocusSettings.CoordinatesMode.VIEW) {
            i6 = -i6;
        }
        int i8 = iIntValue / 2;
        int iM81886e = C13496f.m81886e(i6 - i8, -1000, 1000);
        int iM81886e2 = C13496f.m81886e(i7 - i8, -1000, 1000);
        Rect rect = new Rect();
        RectF rectF = new RectF(iM81886e, iM81886e2, C13496f.m81885d(iM81886e + iIntValue), C13496f.m81885d(iM81886e2 + iIntValue));
        Rect rect2 = new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        Rect rect3 = new Rect(-1000, -1000, 1000, 1000);
        if (coordinatesMode == TEFocusSettings.CoordinatesMode.VIEW) {
            C13496f.m81904w(i5, rect3, rect2);
            rect = new Rect(rect2.left - 1000, rect2.top - 1000, rect2.right - 1000, rect2.bottom - 1000);
        } else if (coordinatesMode == TEFocusSettings.CoordinatesMode.ORIGINAL_FRAME) {
            rect = new Rect(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
        rect.left = C13496f.m81885d(rect.left);
        rect.right = C13496f.m81885d(rect.right);
        rect.top = C13496f.m81885d(rect.top);
        rect.bottom = C13496f.m81885d(rect.bottom);
        return rect;
    }

    /* JADX INFO: renamed from: d */
    public boolean m164486d(Camera.Parameters parameters) {
        return (parameters == null || f143404h.contains(Build.BRAND.toLowerCase()) || parameters.getMaxNumFocusAreas() <= 0) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public boolean m164487e(Camera.Parameters parameters, String str) {
        if (m164486d(parameters)) {
            return parameters.getSupportedFocusModes().contains(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m164488f(int i, Camera.Parameters parameters) {
        return parameters != null && parameters.getMaxNumMeteringAreas() > 0;
    }

    /* JADX INFO: renamed from: g */
    public String m164489g(int i, Camera.Parameters parameters, boolean z) {
        if (parameters == null) {
            return "";
        }
        this.f143409e = i;
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
