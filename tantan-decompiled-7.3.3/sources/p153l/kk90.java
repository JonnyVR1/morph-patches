package p153l;

/* JADX INFO: loaded from: classes11.dex */
public class kk90 extends ok90<Float> {
    public kk90(Float f, Float f2) {
        super(f, f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Float] */
    @Override // p153l.ok90
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Float mo150085a(float f) {
        ?? ValueOf = Float.valueOf(((Float) this.f147740a).floatValue() + (((Float) this.f147742c).floatValue() * m167989d(f)));
        this.f147743d = ValueOf;
        return ValueOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Float] */
    @Override // p153l.ok90
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public kk90 mo150086i(Float f, Float f2) {
        this.f147740a = f;
        this.f147741b = f2;
        this.f147742c = Float.valueOf(f2.floatValue() - f.floatValue());
        this.f147743d = f;
        return this;
    }

    public kk90(Float f, Float f2, String str) {
        super(f, f2, str);
    }
}
