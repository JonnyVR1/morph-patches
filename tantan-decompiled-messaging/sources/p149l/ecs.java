package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.livingroom.common.fans.LiveFansItem;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ecs extends gcs {

    /* JADX INFO: renamed from: b */
    public boolean f90564b;

    /* JADX INFO: renamed from: l.ecs$a */
    public static class C16576a {

        /* JADX INFO: renamed from: a */
        public final mqv<i4g> f90565a;

        /* JADX INFO: renamed from: b */
        public final boolean f90566b;

        public C16576a(mqv<i4g> mqvVar, boolean z) {
            this.f90565a = mqvVar;
            this.f90566b = z;
        }
    }

    public ecs(@NonNull mqv<i4g> mqvVar) {
        super(mqvVar);
        this.f90564b = false;
    }

    @Override // p149l.gcs, p149l.d1q
    /* JADX INFO: renamed from: H */
    public void mo70566u(LiveFansItem liveFansItem) {
        super.mo70566u(liveFansItem);
        if (this.f90564b) {
            liveFansItem.m72833j(this.f102048a.f135304a.f111441a);
        } else {
            liveFansItem.m72834k();
        }
    }

    @Override // p149l.gcs, p149l.d1q
    /* JADX INFO: renamed from: I */
    public void mo70759v(LiveFansItem liveFansItem, @NonNull List<Object> list) {
        super.mo70759v(liveFansItem, list);
        Object obj = list.get(0);
        if (obj instanceof C16576a) {
            C16576a c16576a = (C16576a) obj;
            liveFansItem.m72832i(c16576a.f90565a);
            if (c16576a.f90566b) {
                liveFansItem.m72833j(c16576a.f90565a.f135304a.f111441a);
            } else {
                liveFansItem.m72834k();
            }
            this.f90564b = c16576a.f90566b;
            this.f102048a = c16576a.f90565a;
            xdl0.m208329E0(liveFansItem, this.onItemClick);
        }
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo70999m(LiveFansItem liveFansItem) {
        xdl0.m208358V(liveFansItem, t100.m186890d(10.0f));
        liveFansItem.setTranslationZ(1.0f);
        super.mo70999m(liveFansItem);
    }

    /* JADX INFO: renamed from: L */
    public void m115751L(boolean z) {
        this.f90564b = z;
    }

    @Override // p149l.gcs
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && super.equals(obj) && this.f90564b == ((ecs) obj).f90564b;
    }

    @Override // p149l.gcs
    public int hashCode() {
        return v050.m196471b(Integer.valueOf(super.hashCode()), Boolean.valueOf(this.f90564b));
    }

    @Override // p149l.gcs, p149l.d1q
    @Nullable
    /* JADX INFO: renamed from: n */
    public Object mo109666n() {
        return new C16576a(this.f102048a, this.f90564b);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: r */
    public int mo109066r() {
        return 1;
    }
}
