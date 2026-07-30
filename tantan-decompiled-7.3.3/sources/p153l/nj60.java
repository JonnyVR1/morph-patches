package p153l;

import android.animation.TimeInterpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class nj60 {

    /* JADX INFO: renamed from: a */
    private List<dj60> f142277a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public void m163404a(float f, float f2, float f3, float f4, float f5, float f6, TimeInterpolator timeInterpolator) {
        this.f142277a.add(ej60.m120975a(f, f2, f3, f4, f5, f6, timeInterpolator));
    }

    /* JADX INFO: renamed from: b */
    public List<dj60> m163405b() {
        return this.f142277a;
    }

    /* JADX INFO: renamed from: c */
    public void m163406c(float f, float f2, TimeInterpolator timeInterpolator) {
        this.f142277a.add(ej60.m120976b(f, f2, timeInterpolator));
    }

    /* JADX INFO: renamed from: d */
    public void m163407d(float f, float f2, TimeInterpolator timeInterpolator) {
        this.f142277a.add(ej60.m120979e(f, f2, timeInterpolator));
    }

    /* JADX INFO: renamed from: e */
    public void m163408e(float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        this.f142277a.add(ej60.m120977c(f, f2, f3, f4, timeInterpolator));
    }
}
