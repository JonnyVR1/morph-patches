package p149l;

/* JADX INFO: loaded from: classes13.dex */
public class hc90 extends kc90<Integer> {
    public hc90(Integer num, Integer num2) {
        super(num, num2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Integer] */
    @Override // p149l.kc90
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Integer mo125466a(float f) {
        ?? ValueOf = Integer.valueOf(((Integer) this.f122305a).intValue() + ((int) (((Integer) this.f122307c).intValue() * m145365d(f))));
        this.f122308d = ValueOf;
        return ValueOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Integer] */
    @Override // p149l.kc90
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public hc90 mo125467i(Integer num, Integer num2) {
        this.f122305a = num;
        this.f122306b = num2;
        this.f122307c = Integer.valueOf(num2.intValue() - num.intValue());
        this.f122308d = num;
        return this;
    }
}
