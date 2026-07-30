package p149l;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes13.dex */
public class qg4 {
    private final tvr card;
    private volatile boolean isPlaying;

    public <V extends View> qg4(tvr tvrVar) {
        this.card = tvrVar;
    }

    /* JADX INFO: renamed from: a */
    public float m174379a() {
        Object obj = this.card;
        if (obj instanceof vml) {
            return ((vml) obj).mo106286a();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: b */
    public <V extends View> boolean m174380b(V v2, Object obj) {
        if (obj instanceof zi1) {
            Object obj2 = this.card;
            if (obj2 instanceof vml) {
                vml vmlVar = (vml) obj2;
                boolean z = this.isPlaying;
                boolean z2 = ((zi1) obj).f203249a;
                if (z == z2) {
                    return true;
                }
                this.isPlaying = z2;
                if (!this.isPlaying || TextUtils.isEmpty(vmlVar.mo106287f())) {
                    vmlVar.mo106288g(v2, false);
                } else {
                    vmlVar.mo106288g(v2, true);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public <V extends View> void m174381c(V v2) {
        if (this.isPlaying) {
            this.isPlaying = false;
            Object obj = this.card;
            if (obj instanceof vml) {
                ((vml) obj).mo106288g(v2, false);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m174382d() {
        return this.isPlaying;
    }

    /* JADX INFO: renamed from: e */
    public boolean m174383e() {
        Object obj = this.card;
        return (obj instanceof vml) && !TextUtils.isEmpty(((vml) obj).mo106287f());
    }
}
