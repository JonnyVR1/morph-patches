package p149l;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import com.facebook.imagepipeline.decoder.DecodeException;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class iod implements cfm {

    /* JADX INFO: renamed from: a */
    public final cfm f114131a;

    /* JADX INFO: renamed from: b */
    public final cfm f114132b;

    /* JADX INFO: renamed from: c */
    public final t480 f114133c;

    /* JADX INFO: renamed from: d */
    public final syg0<Boolean> f114134d;

    /* JADX INFO: renamed from: e */
    public final cfm f114135e;

    /* JADX INFO: renamed from: f */
    public final Map<egm, cfm> f114136f;

    /* JADX INFO: renamed from: l.iod$a */
    public class C17582a implements cfm {
        public C17582a() {
        }

        @Override // p149l.cfm
        /* JADX INFO: renamed from: a */
        public da5 mo8377a(jze jzeVar, int i, mnb0 mnb0Var, zem zemVar) {
            ColorSpace colorSpaceM143925v;
            egm egmVarM143898F = jzeVar.m143898F();
            if (((Boolean) iod.this.f114134d.get()).booleanValue()) {
                colorSpaceM143925v = zemVar.f202848k;
                if (colorSpaceM143925v == null) {
                    colorSpaceM143925v = jzeVar.m143925v();
                }
            } else {
                colorSpaceM143925v = zemVar.f202848k;
            }
            ColorSpace colorSpace = colorSpaceM143925v;
            if (egmVarM143898F == kod.JPEG) {
                return iod.this.m137317e(jzeVar, i, mnb0Var, zemVar, colorSpace);
            }
            if (egmVarM143898F == kod.GIF) {
                return iod.this.m137316d(jzeVar, i, mnb0Var, zemVar);
            }
            if (egmVarM143898F == kod.WEBP_ANIMATED) {
                return iod.this.m137315c(jzeVar, i, mnb0Var, zemVar);
            }
            if (egmVarM143898F != egm.f90961c) {
                return iod.this.m137318f(jzeVar, zemVar);
            }
            throw new DecodeException("unknown image format", jzeVar);
        }
    }

    public iod(cfm cfmVar, cfm cfmVar2, t480 t480Var, Map<egm, cfm> map) {
        this.f114135e = new C17582a();
        this.f114131a = cfmVar;
        this.f114132b = cfmVar2;
        this.f114133c = t480Var;
        this.f114136f = map;
        this.f114134d = vyg0.f183524b;
    }

    @Override // p149l.cfm
    /* JADX INFO: renamed from: a */
    public da5 mo8377a(jze jzeVar, int i, mnb0 mnb0Var, zem zemVar) {
        InputStream inputStreamM143899H;
        cfm cfmVar;
        cfm cfmVar2 = zemVar.f202847j;
        if (cfmVar2 != null) {
            return cfmVar2.mo8377a(jzeVar, i, mnb0Var, zemVar);
        }
        egm egmVarM143898F = jzeVar.m143898F();
        if ((egmVarM143898F == null || egmVarM143898F == egm.f90961c) && (inputStreamM143899H = jzeVar.m143899H()) != null) {
            egmVarM143898F = ggm.m125989d(inputStreamM143899H);
            jzeVar.m143917m0(egmVarM143898F);
        }
        Map<egm, cfm> map = this.f114136f;
        return (map == null || (cfmVar = map.get(egmVarM143898F)) == null) ? this.f114135e.mo8377a(jzeVar, i, mnb0Var, zemVar) : cfmVar.mo8377a(jzeVar, i, mnb0Var, zemVar);
    }

    /* JADX INFO: renamed from: c */
    public da5 m137315c(jze jzeVar, int i, mnb0 mnb0Var, zem zemVar) {
        cfm cfmVar;
        return (zemVar.f202844g || (cfmVar = this.f114132b) == null) ? m137318f(jzeVar, zemVar) : cfmVar.mo8377a(jzeVar, i, mnb0Var, zemVar);
    }

    /* JADX INFO: renamed from: d */
    public da5 m137316d(jze jzeVar, int i, mnb0 mnb0Var, zem zemVar) {
        cfm cfmVar;
        if (jzeVar.getWidth() == -1 || jzeVar.getHeight() == -1) {
            throw new DecodeException("image width or height is incorrect", jzeVar);
        }
        return (zemVar.f202844g || (cfmVar = this.f114131a) == null) ? m137318f(jzeVar, zemVar) : cfmVar.mo8377a(jzeVar, i, mnb0Var, zemVar);
    }

    /* JADX INFO: renamed from: e */
    public ia5 m137317e(jze jzeVar, int i, mnb0 mnb0Var, zem zemVar, ColorSpace colorSpace) {
        fa5<Bitmap> fa5VarMo8452b = this.f114133c.mo8452b(jzeVar, zemVar.f202845h, null, i, colorSpace);
        try {
            r7j0.m178146a(null, fa5VarMo8452b);
            rf80.m179116g(fa5VarMo8452b);
            ia5 ia5VarM135129O = ia5.m135129O(fa5VarMo8452b, mnb0Var, jzeVar.m143907U(), jzeVar.m143926x());
            ia5VarM135129O.mo155861b("is_rounded", false);
            return ia5VarM135129O;
        } finally {
            fa5.m120154v(fa5VarMo8452b);
        }
    }

    /* JADX INFO: renamed from: f */
    public ia5 m137318f(jze jzeVar, zem zemVar) {
        fa5<Bitmap> fa5VarMo8451a = this.f114133c.mo8451a(jzeVar, zemVar.f202845h, null, zemVar.f202848k);
        try {
            r7j0.m178146a(null, fa5VarMo8451a);
            rf80.m179116g(fa5VarMo8451a);
            ia5 ia5VarM135129O = ia5.m135129O(fa5VarMo8451a, ykm.f198776d, jzeVar.m143907U(), jzeVar.m143926x());
            ia5VarM135129O.mo155861b("is_rounded", false);
            return ia5VarM135129O;
        } finally {
            fa5.m120154v(fa5VarMo8451a);
        }
    }

    public iod(cfm cfmVar, cfm cfmVar2, t480 t480Var) {
        this(cfmVar, cfmVar2, t480Var, null);
    }
}
