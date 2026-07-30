package p002l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.common.fans.LiveFansItem;
import java.util.List;
import l.d1q;
import l.mqv;
import l.v050;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class gcs extends d1q<LiveFansItem> {

    /* JADX INFO: renamed from: a */
    public mqv<i4g> f11367a;

    public gcs(mqv<i4g> mqvVar) {
        this.f11367a = mqvVar;
    }

    @Override // 
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo12315u(LiveFansItem liveFansItem) {
        super.u(liveFansItem);
        liveFansItem.m6345i(this.f11367a);
    }

    @Override // 
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo12316v(LiveFansItem liveFansItem, @NonNull List<Object> list) {
        super.v(liveFansItem, list);
        Object obj = list.get(0);
        if (obj instanceof mqv) {
            mqv<i4g> mqvVar = (mqv) obj;
            this.f11367a = mqvVar;
            liveFansItem.m6345i(mqvVar);
            xdl0.E0(liveFansItem, ((d1q) this).onItemClick);
        }
    }

    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void m13720w(LiveFansItem liveFansItem) {
        super.w(liveFansItem);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return v050.a(this.f11367a, ((gcs) obj).f11367a);
    }

    public int hashCode() {
        return v050.b(new Object[]{this.f11367a});
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public Object mo12313n() {
        return this.f11367a;
    }

    /* JADX INFO: renamed from: o */
    public int m13719o() {
        return t6c0.f19696U0;
    }
}
