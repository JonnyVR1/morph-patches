package p153l;

import com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class lfg0 extends gpg0 {
    @Override // p153l.oxg0
    /* JADX INFO: renamed from: a */
    public final void mo112981a() {
        this.f149667b.getClass();
        m131257g();
    }

    @Override // p153l.oxg0
    /* JADX INFO: renamed from: c */
    public final boolean mo112982c(String str, JSONObject jSONObject) {
        str.getClass();
        return str.equals(TrackLoadSettingsAtom.TYPE) || str.equals("show");
    }

    @Override // p153l.oxg0
    /* JADX INFO: renamed from: d */
    public final void mo112983d() {
    }
}
