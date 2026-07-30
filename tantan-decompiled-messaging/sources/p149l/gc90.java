package p149l;

/* JADX INFO: loaded from: classes13.dex */
public class gc90 extends kc90<Float> {
    public gc90(Float f, Float f2) {
        super(f, f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Float] */
    @Override // p149l.kc90
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Float mo125466a(float f) {
        ?? ValueOf = Float.valueOf(((Float) this.f122305a).floatValue() + (((Float) this.f122307c).floatValue() * m145365d(f)));
        this.f122308d = ValueOf;
        return ValueOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Float] */
    @Override // p149l.kc90
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public gc90 mo125467i(Float f, Float f2) {
        this.f122305a = f;
        this.f122306b = f2;
        this.f122307c = Float.valueOf(f2.floatValue() - f.floatValue());
        this.f122308d = f;
        return this;
    }

    public gc90(Float f, Float f2, String str) {
        super(f, f2, str);
    }
}
