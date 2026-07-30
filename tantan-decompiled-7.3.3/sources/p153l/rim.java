package p153l;

import androidx.annotation.NonNull;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class rim implements qim {

    /* JADX INFO: renamed from: a */
    public final int f163374a;

    /* JADX INFO: renamed from: b */
    public final int f163375b;

    /* JADX INFO: renamed from: c */
    public final int f163376c;

    /* JADX INFO: renamed from: d */
    public final qvb0 f163377d;

    /* JADX INFO: renamed from: e */
    public final Map<String, Object> f163378e;

    public rim(int i, int i2, int i3, qvb0 qvb0Var, Map<String, Object> map) {
        this.f163374a = i;
        this.f163375b = i2;
        this.f163376c = i3;
        this.f163377d = qvb0Var;
        this.f163378e = map;
    }

    @Override // p153l.nyk, p153l.lyk
    @NonNull
    public Map<String, Object> getExtras() {
        return this.f163378e;
    }

    @Override // p153l.qim
    public int getHeight() {
        return this.f163375b;
    }

    @Override // p153l.qim
    public int getWidth() {
        return this.f163374a;
    }
}
