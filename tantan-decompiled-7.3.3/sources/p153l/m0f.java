package p153l;

import com.facebook.common.memory.PooledByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class m0f {

    /* JADX INFO: renamed from: l.m0f$a */
    public class C18519a implements x0l0<PooledByteBuffer> {
        @Override // p153l.x0l0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int mo127073a(PooledByteBuffer pooledByteBuffer) {
            return pooledByteBuffer.size();
        }
    }

    /* JADX INFO: renamed from: a */
    public static hsb<by3, PooledByteBuffer> m156511a(a7h0<npy> a7h0Var, gqy gqyVar, mpy.InterfaceC18667a interfaceC18667a) {
        zgw zgwVar = new zgw(new C18519a(), interfaceC18667a, a7h0Var, null, false, false);
        gqyVar.mo131504a(zgwVar);
        return zgwVar;
    }
}
