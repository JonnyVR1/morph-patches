package p149l;

import android.animation.TimeInterpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ib60 {

    /* JADX INFO: renamed from: a */
    private List<ya60> f112352a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public void m135247a(float f, float f2, float f3, float f4, float f5, float f6, TimeInterpolator timeInterpolator) {
        this.f112352a.add(za60.m217723a(f, f2, f3, f4, f5, f6, timeInterpolator));
    }

    /* JADX INFO: renamed from: b */
    public List<ya60> m135248b() {
        return this.f112352a;
    }

    /* JADX INFO: renamed from: c */
    public void m135249c(float f, float f2, TimeInterpolator timeInterpolator) {
        this.f112352a.add(za60.m217724b(f, f2, timeInterpolator));
    }

    /* JADX INFO: renamed from: d */
    public void m135250d(float f, float f2, TimeInterpolator timeInterpolator) {
        this.f112352a.add(za60.m217727e(f, f2, timeInterpolator));
    }

    /* JADX INFO: renamed from: e */
    public void m135251e(float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        this.f112352a.add(za60.m217725c(f, f2, f3, f4, timeInterpolator));
    }
}
