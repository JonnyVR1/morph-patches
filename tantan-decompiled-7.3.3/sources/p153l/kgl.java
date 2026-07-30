package p153l;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes7.dex */
public abstract class kgl extends jgl {

    /* JADX INFO: renamed from: e */
    private LinkedHashMap<Integer, Interpolator> f126626e;

    public kgl(mgl mglVar, Interpolator interpolator) {
        super(mglVar, interpolator);
        this.f126626e = new LinkedHashMap<>();
    }

    @Override // p153l.jgl
    /* JADX INFO: renamed from: b */
    public Interpolator mo144788b(int i) {
        return this.f126626e.containsKey(Integer.valueOf(i)) ? this.f126626e.get(Integer.valueOf(i)) : super.mo144788b(i);
    }

    /* JADX INFO: renamed from: f */
    public void m149755f(int i, float f, Interpolator interpolator) {
        m144787a(i, f);
        if (interpolator != null) {
            this.f126626e.put(Integer.valueOf(i), interpolator);
        }
    }

    public kgl() {
        this(null, new LinearInterpolator());
    }
}
