package p149l;

import androidx.annotation.NonNull;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ogm implements ngm {

    /* JADX INFO: renamed from: a */
    public final int f143879a;

    /* JADX INFO: renamed from: b */
    public final int f143880b;

    /* JADX INFO: renamed from: c */
    public final int f143881c;

    /* JADX INFO: renamed from: d */
    public final mnb0 f143882d;

    /* JADX INFO: renamed from: e */
    public final Map<String, Object> f143883e;

    public ogm(int i, int i2, int i3, mnb0 mnb0Var, Map<String, Object> map) {
        this.f143879a = i;
        this.f143880b = i2;
        this.f143881c = i3;
        this.f143882d = mnb0Var;
        this.f143883e = map;
    }

    @Override // p149l.xvk
    @NonNull
    public Map<String, Object> getExtras() {
        return this.f143883e;
    }

    @Override // p149l.ngm
    public int getHeight() {
        return this.f143880b;
    }

    @Override // p149l.ngm
    public int getWidth() {
        return this.f143879a;
    }
}
