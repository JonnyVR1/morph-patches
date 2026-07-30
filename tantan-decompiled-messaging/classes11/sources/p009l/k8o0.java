package p009l;

import com.p000p1.mobile.putong.live.livingroom.voice.intl.preview.VoicePreviewViewModel;
import com.p1.mobile.android.app.c;
import com.tantanapp.common.utils.CrashHelper;
import l.bsm;
import l.cwf0;
import l.e30;
import l.ffw;
import l.iqv;
import l.l9t;
import l.nnn0;
import l.pat;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class k8o0 extends pat<nnn0> {

    /* JADX INFO: renamed from: i */
    public cwf0 f15478i;

    /* JADX INFO: renamed from: j */
    public boolean f15479j;

    public k8o0(bsm bsmVar) {
        super(bsmVar);
        this.f15479j = false;
    }

    /* JADX INFO: renamed from: L3 */
    private void m17343L3() {
        if (this.f15478i == null) {
            this.f15478i = new cwf0("p_start_audio_room", VoicePreviewViewModel.class.getName());
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("anchorId", ypv.f23196a.m23619D0());
                jSONObject.put("entrance_type", E2().a0);
            } catch (JSONException e) {
                CrashHelper.c(e);
            }
            this.f15478i.o(jSONObject);
        }
        this.f15478i.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public void m17344N3(iqv iqvVar) {
        int iA = iqvVar.a();
        if (iA != 1) {
            if (iA != 2) {
                return;
            }
            m17345O3();
        } else {
            cwf0 cwf0Var = this.f15478i;
            if (cwf0Var != null) {
                cwf0Var.l();
            }
        }
    }

    /* JADX INFO: renamed from: O3 */
    private void m17345O3() {
        cwf0 cwf0Var = this.f15478i;
        if (cwf0Var != null) {
            cwf0Var.k();
            this.f15478i.j();
            this.f15478i = null;
        }
    }

    /* JADX INFO: renamed from: M3 */
    public final void m17346M3(c cVar) {
        cwf0 cwf0Var = this.f15478i;
        if (cwf0Var == null) {
            return;
        }
        if (cVar == c.i && this.f15479j) {
            this.f15479j = false;
            cwf0Var.l();
        } else if (cVar == c.j) {
            this.f15479j = true;
            cwf0Var.k();
        }
    }

    /* JADX INFO: renamed from: T */
    public void m17347T() {
        super/*l.k4t*/.T();
        if (E2().Q) {
            return;
        }
        m17343L3();
        duringCreated(E2().l()).takeUntil(new l9t()).subscribe(ffw.d(new e30() { // from class: l.i8o0
            public final void call(Object obj) {
                this.f14438a.m17344N3((iqv) obj);
            }
        }));
        H2().lifecycle().subscribe(ffw.d(new e30() { // from class: l.j8o0
            public final void call(Object obj) {
                this.f14988a.m17346M3((c) obj);
            }
        }));
    }
}
