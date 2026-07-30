package p149l;

import com.facebook.common.memory.PooledByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class ize {

    /* JADX INFO: renamed from: l.ize$a */
    public class C17650a implements rrk0<PooledByteBuffer> {
        @Override // p149l.rrk0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int mo101613a(PooledByteBuffer pooledByteBuffer) {
            return pooledByteBuffer.size();
        }
    }

    /* JADX INFO: renamed from: a */
    public static tqb<cx3, PooledByteBuffer> m139041a(syg0<qgy> syg0Var, jhy jhyVar, pgy.InterfaceC19209a interfaceC19209a) {
        bfw bfwVar = new bfw(new C17650a(), interfaceC19209a, syg0Var, null, false, false);
        jhyVar.mo141613a(bfwVar);
        return bfwVar;
    }
}
