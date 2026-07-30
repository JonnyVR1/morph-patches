package p149l;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class j5y0 extends dmx0 {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ int f116362o = 0;

    /* JADX INFO: renamed from: h */
    public final int f116363h;

    /* JADX INFO: renamed from: i */
    public final int f116364i;

    /* JADX INFO: renamed from: j */
    public final int[] f116365j;

    /* JADX INFO: renamed from: k */
    public final int[] f116366k;

    /* JADX INFO: renamed from: l */
    public final xqt0[] f116367l;

    /* JADX INFO: renamed from: m */
    public final Object[] f116368m;

    /* JADX INFO: renamed from: n */
    public final HashMap f116369n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5y0(xqt0[] xqt0VarArr, Object[] objArr, cty0 cty0Var) {
        super(false, cty0Var);
        int i = 0;
        this.f116367l = xqt0VarArr;
        int length = xqt0VarArr.length;
        this.f116365j = new int[length];
        this.f116366k = new int[length];
        this.f116368m = objArr;
        this.f116369n = new HashMap();
        int iMo113618c = 0;
        int iMo113617b = 0;
        int i2 = 0;
        while (i < xqt0VarArr.length) {
            xqt0 xqt0Var = xqt0VarArr[i];
            this.f116367l[i2] = xqt0Var;
            this.f116366k[i2] = iMo113618c;
            this.f116365j[i2] = iMo113617b;
            iMo113618c += xqt0Var.mo113618c();
            iMo113617b += this.f116367l[i2].mo113617b();
            this.f116369n.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.f116363h = iMo113618c;
        this.f116364i = iMo113617b;
    }

    @Override // p149l.xqt0
    /* JADX INFO: renamed from: b */
    public final int mo113617b() {
        return this.f116364i;
    }

    @Override // p149l.xqt0
    /* JADX INFO: renamed from: c */
    public final int mo113618c() {
        return this.f116363h;
    }

    @Override // p149l.dmx0
    /* JADX INFO: renamed from: p */
    public final int mo112559p(Object obj) {
        Integer num = (Integer) this.f116369n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // p149l.dmx0
    /* JADX INFO: renamed from: q */
    public final int mo112560q(int i) {
        return ggw0.m126075q(this.f116365j, i + 1, false, false);
    }

    @Override // p149l.dmx0
    /* JADX INFO: renamed from: r */
    public final int mo112561r(int i) {
        return ggw0.m126075q(this.f116366k, i + 1, false, false);
    }

    @Override // p149l.dmx0
    /* JADX INFO: renamed from: s */
    public final int mo112562s(int i) {
        return this.f116365j[i];
    }

    @Override // p149l.dmx0
    /* JADX INFO: renamed from: t */
    public final int mo112563t(int i) {
        return this.f116366k[i];
    }

    @Override // p149l.dmx0
    /* JADX INFO: renamed from: u */
    public final xqt0 mo112564u(int i) {
        return this.f116367l[i];
    }

    @Override // p149l.dmx0
    /* JADX INFO: renamed from: v */
    public final Object mo112565v(int i) {
        return this.f116368m[i];
    }

    /* JADX INFO: renamed from: y */
    public final List m139874y() {
        return Arrays.asList(this.f116367l);
    }

    /* JADX INFO: renamed from: z */
    public final j5y0 m139875z(cty0 cty0Var) {
        xqt0[] xqt0VarArr = new xqt0[this.f116367l.length];
        int i = 0;
        while (true) {
            xqt0[] xqt0VarArr2 = this.f116367l;
            if (i >= xqt0VarArr2.length) {
                return new j5y0(xqt0VarArr, this.f116368m, cty0Var);
            }
            xqt0VarArr[i] = new g5y0(this, xqt0VarArr2[i]);
            i++;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j5y0(Collection collection, cty0 cty0Var) {
        xqt0[] xqt0VarArr = new xqt0[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            xqt0VarArr[i2] = ((b2y0) it.next()).zza();
            i2++;
        }
        Object[] objArr = new Object[collection.size()];
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((b2y0) it2.next()).zzb();
            i++;
        }
        this(xqt0VarArr, objArr, cty0Var);
    }
}
