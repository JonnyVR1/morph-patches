package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.livingroom.voice.fans.VoiceLiveFansItem;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class xon0 extends zon0 {

    /* JADX INFO: renamed from: b */
    public boolean f193863b;

    /* JADX INFO: renamed from: l.xon0$a */
    public static class C21195a {

        /* JADX INFO: renamed from: a */
        public final mqv<y4n0> f193864a;

        /* JADX INFO: renamed from: b */
        public final boolean f193865b;

        public C21195a(mqv<y4n0> mqvVar, boolean z) {
            this.f193864a = mqvVar;
            this.f193865b = z;
        }
    }

    public xon0(@NonNull mqv<y4n0> mqvVar) {
        super(mqvVar);
        this.f193863b = false;
    }

    @Override // p149l.zon0, p149l.d1q
    /* JADX INFO: renamed from: H */
    public void mo70566u(VoiceLiveFansItem voiceLiveFansItem) {
        super.mo70566u(voiceLiveFansItem);
        if (this.f193863b) {
            voiceLiveFansItem.m78079j(this.f204136a.f135304a.f196307a);
        } else {
            voiceLiveFansItem.m78080k();
        }
    }

    @Override // p149l.zon0, p149l.d1q
    /* JADX INFO: renamed from: I */
    public void mo70759v(VoiceLiveFansItem voiceLiveFansItem, @NonNull List<Object> list) {
        super.mo70759v(voiceLiveFansItem, list);
        Object obj = list.get(0);
        if (obj instanceof C21195a) {
            C21195a c21195a = (C21195a) obj;
            voiceLiveFansItem.m78078i(c21195a.f193864a);
            if (c21195a.f193865b) {
                voiceLiveFansItem.m78079j(c21195a.f193864a.f135304a.f196307a);
            } else {
                voiceLiveFansItem.m78080k();
            }
            this.f193863b = c21195a.f193865b;
            this.f204136a = c21195a.f193864a;
            xdl0.m208329E0(voiceLiveFansItem, this.onItemClick);
        }
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo70999m(VoiceLiveFansItem voiceLiveFansItem) {
        xdl0.m208358V(voiceLiveFansItem, t100.m186890d(10.0f));
        voiceLiveFansItem.setTranslationZ(1.0f);
        super.mo70999m(voiceLiveFansItem);
    }

    /* JADX INFO: renamed from: L */
    public void m210437L(boolean z) {
        this.f193863b = z;
    }

    @Override // p149l.zon0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && super.equals(obj) && this.f193863b == ((xon0) obj).f193863b;
    }

    @Override // p149l.zon0
    public int hashCode() {
        return v050.m196471b(Integer.valueOf(super.hashCode()), Boolean.valueOf(this.f193863b));
    }

    @Override // p149l.zon0, p149l.d1q
    @Nullable
    /* JADX INFO: renamed from: n */
    public Object mo109666n() {
        return new C21195a(this.f204136a, this.f193863b);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: r */
    public int mo109066r() {
        return 1;
    }
}
