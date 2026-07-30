package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.livingroom.voice.fans.VoiceLiveFansItem;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class byn0 extends dyn0 {

    /* JADX INFO: renamed from: b */
    public boolean f79035b;

    /* JADX INFO: renamed from: l.byn0$a */
    public static class C16135a {

        /* JADX INFO: renamed from: a */
        public final nsv<cen0> f79036a;

        /* JADX INFO: renamed from: b */
        public final boolean f79037b;

        public C16135a(nsv<cen0> nsvVar, boolean z) {
            this.f79036a = nsvVar;
            this.f79037b = z;
        }
    }

    public byn0(@NonNull nsv<cen0> nsvVar) {
        super(nsvVar);
        this.f79035b = false;
    }

    @Override // p153l.dyn0, p153l.d3q
    /* JADX INFO: renamed from: H */
    public void mo71749u(VoiceLiveFansItem voiceLiveFansItem) {
        super.mo71749u(voiceLiveFansItem);
        if (this.f79035b) {
            voiceLiveFansItem.m79262j(this.f91265a.f143542a.f81391a);
        } else {
            voiceLiveFansItem.m79263k();
        }
    }

    @Override // p153l.dyn0, p153l.d3q
    /* JADX INFO: renamed from: I */
    public void mo71942v(VoiceLiveFansItem voiceLiveFansItem, @NonNull List<Object> list) {
        super.mo71942v(voiceLiveFansItem, list);
        Object obj = list.get(0);
        if (obj instanceof C16135a) {
            C16135a c16135a = (C16135a) obj;
            voiceLiveFansItem.m79261i(c16135a.f79036a);
            if (c16135a.f79037b) {
                voiceLiveFansItem.m79262j(c16135a.f79036a.f143542a.f81391a);
            } else {
                voiceLiveFansItem.m79263k();
            }
            this.f79035b = c16135a.f79037b;
            this.f91265a = c16135a.f79036a;
            bnl0.m105509E0(voiceLiveFansItem, this.onItemClick);
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo72182m(VoiceLiveFansItem voiceLiveFansItem) {
        bnl0.m105538V(voiceLiveFansItem, qa00.m175859d(10.0f));
        voiceLiveFansItem.setTranslationZ(1.0f);
        super.mo72182m(voiceLiveFansItem);
    }

    /* JADX INFO: renamed from: L */
    public void m107029L(boolean z) {
        this.f79035b = z;
    }

    @Override // p153l.dyn0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && super.equals(obj) && this.f79035b == ((byn0) obj).f79035b;
    }

    @Override // p153l.dyn0
    public int hashCode() {
        return k950.m148864b(Integer.valueOf(super.hashCode()), Boolean.valueOf(this.f79035b));
    }

    @Override // p153l.dyn0, p153l.d3q
    @Nullable
    /* JADX INFO: renamed from: n */
    public Object mo107030n() {
        return new C16135a(this.f91265a, this.f79035b);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: r */
    public int mo95343r() {
        return 1;
    }
}
