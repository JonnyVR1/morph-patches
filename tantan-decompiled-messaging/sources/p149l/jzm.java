package p149l;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.sunshine.engine.base.InterpolatorType;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class jzm {

    /* JADX INFO: renamed from: c */
    private static final Map<String, Interpolator> f120398c = new HashMap();

    /* JADX INFO: renamed from: a */
    private String f120399a = null;

    /* JADX INFO: renamed from: b */
    private Interpolator f120400b = null;

    public jzm() {
        m143939d(InterpolatorType.linear.toString());
    }

    /* JADX INFO: renamed from: c */
    public static Interpolator m143936c(String str) {
        Map<String, Interpolator> map = f120398c;
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
    public float m143937a(float f) {
        return this.f120400b.getInterpolation(f);
    }

    /* JADX INFO: renamed from: b */
    public String m143938b() {
        return this.f120399a;
    }

    /* JADX INFO: renamed from: d */
    public void m143939d(String str) {
        if (str != null) {
            this.f120399a = str;
            this.f120400b = m143936c(str);
        }
    }
}
