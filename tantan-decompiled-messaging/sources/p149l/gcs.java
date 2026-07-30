package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.livingroom.common.fans.LiveFansItem;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class gcs extends d1q<LiveFansItem> {

    /* JADX INFO: renamed from: a */
    public mqv<i4g> f102048a;

    public gcs(mqv<i4g> mqvVar) {
        this.f102048a = mqvVar;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(LiveFansItem liveFansItem) {
        super.mo70566u(liveFansItem);
        liveFansItem.m72832i(this.f102048a);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo70759v(LiveFansItem liveFansItem, @NonNull List<Object> list) {
        super.mo70759v(liveFansItem, list);
        Object obj = list.get(0);
        if (obj instanceof mqv) {
            mqv<i4g> mqvVar = (mqv) obj;
            this.f102048a = mqvVar;
            liveFansItem.m72832i(mqvVar);
            xdl0.m208329E0(liveFansItem, this.onItemClick);
        }
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo71000w(LiveFansItem liveFansItem) {
        super.mo71000w(liveFansItem);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return v050.m196470a(this.f102048a, ((gcs) obj).f102048a);
    }

    public int hashCode() {
        return v050.m196471b(this.f102048a);
    }

    @Override // p149l.d1q
    @Nullable
    /* JADX INFO: renamed from: n */
    public Object mo109666n() {
        return this.f102048a;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168200U0;
    }
}
