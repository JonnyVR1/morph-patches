package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.livingroom.voice.fans.VoiceLiveFansItem;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class zon0 extends d1q<VoiceLiveFansItem> {

    /* JADX INFO: renamed from: a */
    public mqv<y4n0> f204136a;

    public zon0(mqv<y4n0> mqvVar) {
        this.f204136a = mqvVar;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(VoiceLiveFansItem voiceLiveFansItem) {
        super.mo70566u(voiceLiveFansItem);
        voiceLiveFansItem.m78078i(this.f204136a);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo70759v(VoiceLiveFansItem voiceLiveFansItem, @NonNull List<Object> list) {
        super.mo70759v(voiceLiveFansItem, list);
        Object obj = list.get(0);
        if (obj instanceof mqv) {
            mqv<y4n0> mqvVar = (mqv) obj;
            this.f204136a = mqvVar;
            voiceLiveFansItem.m78078i(mqvVar);
            xdl0.m208329E0(voiceLiveFansItem, this.onItemClick);
        }
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo71000w(VoiceLiveFansItem voiceLiveFansItem) {
        super.mo71000w(voiceLiveFansItem);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return v050.m196470a(this.f204136a, ((zon0) obj).f204136a);
    }

    public int hashCode() {
        return v050.m196471b(this.f204136a);
    }

    @Override // p149l.d1q
    @Nullable
    /* JADX INFO: renamed from: n */
    public Object mo109666n() {
        return this.f204136a;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f167980B8;
    }
}
