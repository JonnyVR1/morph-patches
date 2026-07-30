package p153l;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes13.dex */
public class ph4 {
    private final uxr card;
    private volatile boolean isPlaying;

    public <V extends View> ph4(uxr uxrVar) {
        this.card = uxrVar;
    }

    /* JADX INFO: renamed from: a */
    public float m172316a() {
        ztf0 ztf0Var = this.card;
        if (ztf0Var instanceof gpl) {
            return ((gpl) ztf0Var).mo115538a();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: b */
    public <V extends View> boolean m172317b(V v2, Object obj) {
        if (obj instanceof gj1) {
            ztf0 ztf0Var = this.card;
            if (ztf0Var instanceof gpl) {
                gpl gplVar = (gpl) ztf0Var;
                boolean z = this.isPlaying;
                boolean z2 = ((gj1) obj).f104545a;
                if (z == z2) {
                    return true;
                }
                this.isPlaying = z2;
                if (!this.isPlaying || TextUtils.isEmpty(gplVar.mo115539f())) {
                    gplVar.mo115540g(v2, false);
                } else {
                    gplVar.mo115540g(v2, true);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public <V extends View> void m172318c(V v2) {
        if (this.isPlaying) {
            this.isPlaying = false;
            ztf0 ztf0Var = this.card;
            if (ztf0Var instanceof gpl) {
                ((gpl) ztf0Var).mo115540g(v2, false);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m172319d() {
        return this.isPlaying;
    }

    /* JADX INFO: renamed from: e */
    public boolean m172320e() {
        ztf0 ztf0Var = this.card;
        return (ztf0Var instanceof gpl) && !TextUtils.isEmpty(((gpl) ztf0Var).mo115539f());
    }
}
