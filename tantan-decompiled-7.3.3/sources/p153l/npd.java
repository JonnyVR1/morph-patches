package p153l;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import com.facebook.imagepipeline.decoder.DecodeException;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class npd implements shm {

    /* JADX INFO: renamed from: a */
    public final shm f143081a;

    /* JADX INFO: renamed from: b */
    public final shm f143082b;

    /* JADX INFO: renamed from: c */
    public final zc80 f143083c;

    /* JADX INFO: renamed from: d */
    public final a7h0<Boolean> f143084d;

    /* JADX INFO: renamed from: e */
    public final shm f143085e;

    /* JADX INFO: renamed from: f */
    public final Map<him, shm> f143086f;

    /* JADX INFO: renamed from: l.npd$a */
    public class C18918a implements shm {
        public C18918a() {
        }

        @Override // p153l.shm
        /* JADX INFO: renamed from: a */
        public db5 mo8431a(n0f n0fVar, int i, qvb0 qvb0Var, phm phmVar) {
            ColorSpace colorSpaceM160988v;
            him himVarM160961F = n0fVar.m160961F();
            if (((Boolean) npd.this.f143084d.get()).booleanValue()) {
                colorSpaceM160988v = phmVar.f152458k;
                if (colorSpaceM160988v == null) {
                    colorSpaceM160988v = n0fVar.m160988v();
                }
            } else {
                colorSpaceM160988v = phmVar.f152458k;
            }
            ColorSpace colorSpace = colorSpaceM160988v;
            if (himVarM160961F == ppd.JPEG) {
                return npd.this.m164223e(n0fVar, i, qvb0Var, phmVar, colorSpace);
            }
            if (himVarM160961F == ppd.GIF) {
                return npd.this.m164222d(n0fVar, i, qvb0Var, phmVar);
            }
            if (himVarM160961F == ppd.WEBP_ANIMATED) {
                return npd.this.m164221c(n0fVar, i, qvb0Var, phmVar);
            }
            if (himVarM160961F != him.f110036c) {
                return npd.this.m164224f(n0fVar, phmVar);
            }
            throw new DecodeException("unknown image format", n0fVar);
        }
    }

    public npd(shm shmVar, shm shmVar2, zc80 zc80Var, Map<him, shm> map) {
        this.f143085e = new C18918a();
        this.f143081a = shmVar;
        this.f143082b = shmVar2;
        this.f143083c = zc80Var;
        this.f143086f = map;
        this.f143084d = d7h0.f85513b;
    }

    @Override // p153l.shm
    /* JADX INFO: renamed from: a */
    public db5 mo8431a(n0f n0fVar, int i, qvb0 qvb0Var, phm phmVar) {
        InputStream inputStreamM160962H;
        shm shmVar;
        shm shmVar2 = phmVar.f152457j;
        if (shmVar2 != null) {
            return shmVar2.mo8431a(n0fVar, i, qvb0Var, phmVar);
        }
        him himVarM160961F = n0fVar.m160961F();
        if ((himVarM160961F == null || himVarM160961F == him.f110036c) && (inputStreamM160962H = n0fVar.m160962H()) != null) {
            himVarM160961F = jim.m144985d(inputStreamM160962H);
            n0fVar.m160980n0(himVarM160961F);
        }
        Map<him, shm> map = this.f143086f;
        return (map == null || (shmVar = map.get(himVarM160961F)) == null) ? this.f143085e.mo8431a(n0fVar, i, qvb0Var, phmVar) : shmVar.mo8431a(n0fVar, i, qvb0Var, phmVar);
    }

    /* JADX INFO: renamed from: c */
    public db5 m164221c(n0f n0fVar, int i, qvb0 qvb0Var, phm phmVar) {
        shm shmVar;
        return (phmVar.f152454g || (shmVar = this.f143082b) == null) ? m164224f(n0fVar, phmVar) : shmVar.mo8431a(n0fVar, i, qvb0Var, phmVar);
    }

    /* JADX INFO: renamed from: d */
    public db5 m164222d(n0f n0fVar, int i, qvb0 qvb0Var, phm phmVar) {
        shm shmVar;
        if (n0fVar.getWidth() == -1 || n0fVar.getHeight() == -1) {
            throw new DecodeException("image width or height is incorrect", n0fVar);
        }
        return (phmVar.f152454g || (shmVar = this.f143081a) == null) ? m164224f(n0fVar, phmVar) : shmVar.mo8431a(n0fVar, i, qvb0Var, phmVar);
    }

    /* JADX INFO: renamed from: e */
    public ib5 m164223e(n0f n0fVar, int i, qvb0 qvb0Var, phm phmVar, ColorSpace colorSpace) {
        fb5<Bitmap> fb5VarMo8506b = this.f143083c.mo8506b(n0fVar, phmVar.f152455h, null, i, colorSpace);
        try {
            vgj0.m201234a(null, fb5VarMo8506b);
            wn80.m207182g(fb5VarMo8506b);
            ib5 ib5VarM139280O = ib5.m139280O(fb5VarMo8506b, qvb0Var, n0fVar.m160970V(), n0fVar.m160989x());
            ib5VarM139280O.mo97949b("is_rounded", false);
            return ib5VarM139280O;
        } finally {
            fb5.m124874v(fb5VarMo8506b);
        }
    }

    /* JADX INFO: renamed from: f */
    public ib5 m164224f(n0f n0fVar, phm phmVar) {
        fb5<Bitmap> fb5VarMo8505a = this.f143083c.mo8505a(n0fVar, phmVar.f152455h, null, phmVar.f152458k);
        try {
            vgj0.m201234a(null, fb5VarMo8505a);
            wn80.m207182g(fb5VarMo8505a);
            ib5 ib5VarM139280O = ib5.m139280O(fb5VarMo8505a, anm.f72363d, n0fVar.m160970V(), n0fVar.m160989x());
            ib5VarM139280O.mo97949b("is_rounded", false);
            return ib5VarM139280O;
        } finally {
            fb5.m124874v(fb5VarMo8505a);
        }
    }

    public npd(shm shmVar, shm shmVar2, zc80 zc80Var) {
        this(shmVar, shmVar2, zc80Var, null);
    }
}
