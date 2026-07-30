package p149l;

import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import android.os.Build;
import com.p069ss.android.ttvecamera.C13333f;
import com.p069ss.android.ttvecamera.TEFocusSettings;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class gjh0 {

    /* JADX INFO: renamed from: h */
    public static final List<String> f103040h;

    /* JADX INFO: renamed from: d */
    private int f103044d;

    /* JADX INFO: renamed from: e */
    int f103045e;

    /* JADX INFO: renamed from: a */
    protected final int f103041a = 90;

    /* JADX INFO: renamed from: b */
    protected final float f103042b = 1.0f;

    /* JADX INFO: renamed from: c */
    protected final float f103043c = 2.0f;

    /* JADX INFO: renamed from: f */
    private List<Camera.Area> f103046f = new ArrayList();

    /* JADX INFO: renamed from: g */
    private List<Camera.Area> f103047g = new ArrayList();

    static {
        ArrayList arrayList = new ArrayList();
        f103040h = arrayList;
        arrayList.add("multilaser");
        arrayList.add("ms40");
    }

    public gjh0(int i) {
        this.f103044d = i;
    }

    /* JADX INFO: renamed from: a */
    public List<Camera.Area> m126498a(int i, int i2, float f, int i3, int i4, int i5, TEFocusSettings.CoordinatesMode coordinatesMode) {
        Rect rectM126500c = m126500c(i, i2, f, 90.0f, i3, i4, i5, coordinatesMode);
        if (this.f103046f.size() > 0) {
            this.f103046f.clear();
        }
        this.f103046f.add(new Camera.Area(rectM126500c, 1000));
        return this.f103046f;
    }

    /* JADX INFO: renamed from: b */
    public List<Camera.Area> m126499b(int i, int i2, float f, int i3, int i4, int i5, TEFocusSettings.CoordinatesMode coordinatesMode) {
        Rect rectM126500c = m126500c(i, i2, f, 180.0f, i3, i4, i5, coordinatesMode);
        if (this.f103047g.size() > 0) {
            this.f103047g.clear();
        }
        this.f103047g.add(new Camera.Area(rectM126500c, 1000));
        return this.f103047g;
    }

    /* JADX INFO: renamed from: c */
    public Rect m126500c(int i, int i2, float f, float f2, int i3, int i4, int i5, TEFocusSettings.CoordinatesMode coordinatesMode) {
        int iIntValue = Float.valueOf((f * f2) + 0.5f).intValue();
        int i6 = ((int) (((i3 * 2000) * 1.0f) / i)) - 1000;
        int i7 = ((int) (((i4 * 2000) * 1.0f) / i2)) - 1000;
        if (this.f103045e == 1 && coordinatesMode == TEFocusSettings.CoordinatesMode.VIEW) {
            i6 = -i6;
        }
        int i8 = iIntValue / 2;
        int iM80703e = C13333f.m80703e(i6 - i8, -1000, 1000);
        int iM80703e2 = C13333f.m80703e(i7 - i8, -1000, 1000);
        Rect rect = new Rect();
        RectF rectF = new RectF(iM80703e, iM80703e2, C13333f.m80702d(iM80703e + iIntValue), C13333f.m80702d(iM80703e2 + iIntValue));
        Rect rect2 = new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        Rect rect3 = new Rect(-1000, -1000, 1000, 1000);
        if (coordinatesMode == TEFocusSettings.CoordinatesMode.VIEW) {
            C13333f.m80721w(i5, rect3, rect2);
            rect = new Rect(rect2.left - 1000, rect2.top - 1000, rect2.right - 1000, rect2.bottom - 1000);
        } else if (coordinatesMode == TEFocusSettings.CoordinatesMode.ORIGINAL_FRAME) {
            rect = new Rect(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
        rect.left = C13333f.m80702d(rect.left);
        rect.right = C13333f.m80702d(rect.right);
        rect.top = C13333f.m80702d(rect.top);
        rect.bottom = C13333f.m80702d(rect.bottom);
        return rect;
    }

    /* JADX INFO: renamed from: d */
    public boolean m126501d(Camera.Parameters parameters) {
        return (parameters == null || f103040h.contains(Build.BRAND.toLowerCase()) || parameters.getMaxNumFocusAreas() <= 0) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public boolean m126502e(Camera.Parameters parameters, String str) {
        if (m126501d(parameters)) {
            return parameters.getSupportedFocusModes().contains(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m126503f(int i, Camera.Parameters parameters) {
        return parameters != null && parameters.getMaxNumMeteringAreas() > 0;
    }

    /* JADX INFO: renamed from: g */
    public String m126504g(int i, Camera.Parameters parameters, boolean z) {
        if (parameters == null) {
            return "";
        }
        this.f103045e = i;
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
