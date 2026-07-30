package p153l;

import Sudchar.Sudfor;
import Sudchar.Sudtry;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class iwg0 implements wng0, ztg0 {
    @Override // p153l.ztg0
    /* JADX INFO: renamed from: a */
    public final long mo126924a(jgg0 jgg0Var) throws IOException {
        try {
            return jgg0Var.m144774b();
        } catch (IOException e) {
            jgg0Var.f120716d.m142519b(e);
            throw e;
        }
    }

    @Override // p153l.wng0
    /* JADX INFO: renamed from: b */
    public final vkg0 mo110337b(jgg0 jgg0Var) throws IOException {
        ixg0 ixg0Var = jgg0Var.f120716d;
        while (true) {
            try {
                if (ixg0Var.m142520c()) {
                    throw Sudfor.f211027Suddo;
                }
                return jgg0Var.m144775c();
            } catch (IOException e) {
                if (!(e instanceof Sudtry)) {
                    jgg0Var.f120716d.m142519b(e);
                    jgg0Var.f120716d.m142518a().f183920t.add(Integer.valueOf(jgg0Var.f120713a));
                    throw e;
                }
                jgg0Var.f120719g = 1;
                synchronized (jgg0Var) {
                    try {
                        if (jgg0Var.f120722j != null) {
                            rug0 rug0Var = jgg0Var.f120722j;
                            rug0Var.f164920c = null;
                            i5d0 i5d0Var = rug0Var.f164921d;
                            if (i5d0Var != null) {
                                i5d0Var.close();
                            }
                            rug0Var.f164921d = null;
                            Objects.toString(jgg0Var.f120722j);
                            int i = jgg0Var.f120714b.f73493b;
                        }
                        jgg0Var.f120722j = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }
}
