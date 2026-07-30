package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.livingroom.common.fans.LiveFansItem;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class hes extends d3q<LiveFansItem> {

    /* JADX INFO: renamed from: a */
    public nsv<w5g> f109184a;

    public hes(nsv<w5g> nsvVar) {
        this.f109184a = nsvVar;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo71749u(LiveFansItem liveFansItem) {
        super.mo71749u(liveFansItem);
        liveFansItem.m74015i(this.f109184a);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo71942v(LiveFansItem liveFansItem, @NonNull List<Object> list) {
        super.mo71942v(liveFansItem, list);
        Object obj = list.get(0);
        if (obj instanceof nsv) {
            nsv<w5g> nsvVar = (nsv) obj;
            this.f109184a = nsvVar;
            liveFansItem.m74015i(nsvVar);
            bnl0.m105509E0(liveFansItem, this.onItemClick);
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo72183w(LiveFansItem liveFansItem) {
        super.mo72183w(liveFansItem);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return k950.m148863a(this.f109184a, ((hes) obj).f109184a);
    }

    public int hashCode() {
        return k950.m148864b(this.f109184a);
    }

    @Override // p153l.d3q
    @Nullable
    /* JADX INFO: renamed from: n */
    public Object mo107030n() {
        return this.f109184a;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198932U0;
    }
}
