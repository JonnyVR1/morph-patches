package p002l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.common.fans.LiveFansItem;
import java.util.List;
import l.d1q;
import l.mqv;
import l.t100;
import l.v050;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ecs extends gcs {

    /* JADX INFO: renamed from: b */
    public boolean f9671b;

    /* JADX INFO: renamed from: l.ecs$a */
    public static class C0539a {

        /* JADX INFO: renamed from: a */
        public final mqv<i4g> f9672a;

        /* JADX INFO: renamed from: b */
        public final boolean f9673b;

        public C0539a(mqv<i4g> mqvVar, boolean z) {
            this.f9672a = mqvVar;
            this.f9673b = z;
        }
    }

    public ecs(@NonNull mqv<i4g> mqvVar) {
        super(mqvVar);
        this.f9671b = false;
    }

    @Override // p002l.gcs
    /* JADX INFO: renamed from: H */
    public void mo12315u(LiveFansItem liveFansItem) {
        super.mo12315u(liveFansItem);
        if (this.f9671b) {
            liveFansItem.m6346j(((i4g) this.f11367a.a).f13039a);
        } else {
            liveFansItem.m6347k();
        }
    }

    @Override // p002l.gcs
    /* JADX INFO: renamed from: I */
    public void mo12316v(LiveFansItem liveFansItem, @NonNull List<Object> list) {
        super.mo12316v(liveFansItem, list);
        Object obj = list.get(0);
        if (obj instanceof C0539a) {
            C0539a c0539a = (C0539a) obj;
            liveFansItem.m6345i(c0539a.f9672a);
            if (c0539a.f9673b) {
                liveFansItem.m6346j(((i4g) c0539a.f9672a.a).f13039a);
            } else {
                liveFansItem.m6347k();
            }
            this.f9671b = c0539a.f9673b;
            this.f11367a = c0539a.f9672a;
            xdl0.E0(liveFansItem, ((d1q) this).onItemClick);
        }
    }

    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void m12312m(LiveFansItem liveFansItem) {
        xdl0.V(liveFansItem, t100.d(10.0f));
        liveFansItem.setTranslationZ(1.0f);
        super.m(liveFansItem);
    }

    /* JADX INFO: renamed from: L */
    public void m12311L(boolean z) {
        this.f9671b = z;
    }

    @Override // p002l.gcs
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && super.equals(obj) && this.f9671b == ((ecs) obj).f9671b;
    }

    @Override // p002l.gcs
    public int hashCode() {
        return v050.b(new Object[]{Integer.valueOf(super.hashCode()), Boolean.valueOf(this.f9671b)});
    }

    @Override // p002l.gcs
    @Nullable
    /* JADX INFO: renamed from: n */
    public Object mo12313n() {
        return new C0539a(this.f11367a, this.f9671b);
    }

    /* JADX INFO: renamed from: r */
    public int m12314r() {
        return 1;
    }
}
