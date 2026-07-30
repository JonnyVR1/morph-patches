package p153l;

/* JADX INFO: loaded from: classes11.dex */
public class lk90 extends ok90<Integer> {
    public lk90(Integer num, Integer num2) {
        super(num, num2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Integer] */
    @Override // p153l.ok90
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Integer mo150085a(float f) {
        ?? ValueOf = Integer.valueOf(((Integer) this.f147740a).intValue() + ((int) (((Integer) this.f147742c).intValue() * m167989d(f))));
        this.f147743d = ValueOf;
        return ValueOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Integer] */
    @Override // p153l.ok90
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public lk90 mo150086i(Integer num, Integer num2) {
        this.f147740a = num;
        this.f147741b = num2;
        this.f147742c = Integer.valueOf(num2.intValue() - num.intValue());
        this.f147743d = num;
        return this;
    }
}
