package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.livingroom.voice.fans.VoiceLiveFansItem;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class dyn0 extends d3q<VoiceLiveFansItem> {

    /* JADX INFO: renamed from: a */
    public nsv<cen0> f91265a;

    public dyn0(nsv<cen0> nsvVar) {
        this.f91265a = nsvVar;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo71749u(VoiceLiveFansItem voiceLiveFansItem) {
        super.mo71749u(voiceLiveFansItem);
        voiceLiveFansItem.m79261i(this.f91265a);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo71942v(VoiceLiveFansItem voiceLiveFansItem, @NonNull List<Object> list) {
        super.mo71942v(voiceLiveFansItem, list);
        Object obj = list.get(0);
        if (obj instanceof nsv) {
            nsv<cen0> nsvVar = (nsv) obj;
            this.f91265a = nsvVar;
            voiceLiveFansItem.m79261i(nsvVar);
            bnl0.m105509E0(voiceLiveFansItem, this.onItemClick);
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo72183w(VoiceLiveFansItem voiceLiveFansItem) {
        super.mo72183w(voiceLiveFansItem);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return k950.m148863a(this.f91265a, ((dyn0) obj).f91265a);
    }

    public int hashCode() {
        return k950.m148864b(this.f91265a);
    }

    @Override // p153l.d3q
    @Nullable
    /* JADX INFO: renamed from: n */
    public Object mo107030n() {
        return this.f91265a;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198712B8;
    }
}
