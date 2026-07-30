package p153l;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.sunshine.engine.base.InterpolatorType;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class i1n {

    /* JADX INFO: renamed from: c */
    private static final Map<String, Interpolator> f112537c = new HashMap();

    /* JADX INFO: renamed from: a */
    private String f112538a = null;

    /* JADX INFO: renamed from: b */
    private Interpolator f112539b = null;

    public i1n() {
        m138146d(InterpolatorType.linear.toString());
    }

    /* JADX INFO: renamed from: c */
    public static Interpolator m138143c(String str) {
        Map<String, Interpolator> map = f112537c;
        Interpolator interpolatorBuild = map.get(str);
        if (interpolatorBuild == null) {
            String[] strArrSplit = str.split("_");
            interpolatorBuild = InterpolatorType.valueOf(strArrSplit[0]).build(strArrSplit.length == 2 ? Integer.parseInt(strArrSplit[1]) : 2);
            if (interpolatorBuild == null) {
                interpolatorBuild = new LinearInterpolator();
            }
            map.put(str, interpolatorBuild);
        }
        return interpolatorBuild;
    }

    /* JADX INFO: renamed from: a */
    public float m138144a(float f) {
        return this.f112539b.getInterpolation(f);
    }

    /* JADX INFO: renamed from: b */
    public String m138145b() {
        return this.f112538a;
    }

    /* JADX INFO: renamed from: d */
    public void m138146d(String str) {
        if (str != null) {
            this.f112538a = str;
            this.f112539b = m138143c(str);
        }
    }
}
