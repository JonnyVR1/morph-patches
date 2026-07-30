package p149l;

import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class gqt0 implements hqt0 {

    /* JADX INFO: renamed from: a */
    public final Map f103981a;

    public gqt0(Map map) {
        this.f103981a = map;
    }

    @Override // p149l.hqt0
    @Nullable
    /* JADX INFO: renamed from: d */
    public final j3v0 mo110632d(int i, String str) {
        return (j3v0) this.f103981a.get(str);
    }
}
