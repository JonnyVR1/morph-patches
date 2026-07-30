package p149l;

import com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class uog0 extends ygg0 {
    @Override // p149l.gpg0
    /* JADX INFO: renamed from: a */
    public final void mo110226a() {
        this.f103801b.getClass();
        m214641g();
    }

    @Override // p149l.gpg0
    /* JADX INFO: renamed from: c */
    public final boolean mo110227c(String str, JSONObject jSONObject) {
        str.getClass();
        return str.equals(TrackLoadSettingsAtom.TYPE) || str.equals("show");
    }

    @Override // p149l.gpg0
    /* JADX INFO: renamed from: d */
    public final void mo110228d() {
    }
}
