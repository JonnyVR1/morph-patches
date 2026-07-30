package p149l;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes7.dex */
public abstract class udl extends tdl {

    /* JADX INFO: renamed from: e */
    private LinkedHashMap<Integer, Interpolator> f175928e;

    public udl(wdl wdlVar, Interpolator interpolator) {
        super(wdlVar, interpolator);
        this.f175928e = new LinkedHashMap<>();
    }

    @Override // p149l.tdl
    /* JADX INFO: renamed from: b */
    public Interpolator mo188137b(int i) {
        return this.f175928e.containsKey(Integer.valueOf(i)) ? this.f175928e.get(Integer.valueOf(i)) : super.mo188137b(i);
    }

    /* JADX INFO: renamed from: f */
    public void m193144f(int i, float f, Interpolator interpolator) {
        m188136a(i, f);
        if (interpolator != null) {
            this.f175928e.put(Integer.valueOf(i), interpolator);
        }
    }

    public udl() {
        this(null, new LinearInterpolator());
    }
}
