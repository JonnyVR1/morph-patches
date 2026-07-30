package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.livingroom.common.fans.LiveFansItem;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class fes extends hes {

    /* JADX INFO: renamed from: b */
    public boolean f98710b;

    /* JADX INFO: renamed from: l.fes$a */
    public static class C16964a {

        /* JADX INFO: renamed from: a */
        public final nsv<w5g> f98711a;

        /* JADX INFO: renamed from: b */
        public final boolean f98712b;

        public C16964a(nsv<w5g> nsvVar, boolean z) {
            this.f98711a = nsvVar;
            this.f98712b = z;
        }
    }

    public fes(@NonNull nsv<w5g> nsvVar) {
        super(nsvVar);
        this.f98710b = false;
    }

    @Override // p153l.hes, p153l.d3q
    /* JADX INFO: renamed from: H */
    public void mo71749u(LiveFansItem liveFansItem) {
        super.mo71749u(liveFansItem);
        if (this.f98710b) {
            liveFansItem.m74016j(this.f109184a.f143542a.f187506a);
        } else {
            liveFansItem.m74017k();
        }
    }

    @Override // p153l.hes, p153l.d3q
    /* JADX INFO: renamed from: I */
    public void mo71942v(LiveFansItem liveFansItem, @NonNull List<Object> list) {
        super.mo71942v(liveFansItem, list);
        Object obj = list.get(0);
        if (obj instanceof C16964a) {
            C16964a c16964a = (C16964a) obj;
            liveFansItem.m74015i(c16964a.f98711a);
            if (c16964a.f98712b) {
                liveFansItem.m74016j(c16964a.f98711a.f143542a.f187506a);
            } else {
                liveFansItem.m74017k();
            }
            this.f98710b = c16964a.f98712b;
            this.f109184a = c16964a.f98711a;
            bnl0.m105509E0(liveFansItem, this.onItemClick);
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo72182m(LiveFansItem liveFansItem) {
        bnl0.m105538V(liveFansItem, qa00.m175859d(10.0f));
        liveFansItem.setTranslationZ(1.0f);
        super.mo72182m(liveFansItem);
    }

    /* JADX INFO: renamed from: L */
    public void m125329L(boolean z) {
        this.f98710b = z;
    }

    @Override // p153l.hes
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && super.equals(obj) && this.f98710b == ((fes) obj).f98710b;
    }

    @Override // p153l.hes
    public int hashCode() {
        return k950.m148864b(Integer.valueOf(super.hashCode()), Boolean.valueOf(this.f98710b));
    }

    @Override // p153l.hes, p153l.d3q
    @Nullable
    /* JADX INFO: renamed from: n */
    public Object mo107030n() {
        return new C16964a(this.f109184a, this.f98710b);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: r */
    public int mo95343r() {
        return 1;
    }
}
