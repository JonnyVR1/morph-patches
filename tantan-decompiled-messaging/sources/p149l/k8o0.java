package p149l;

import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.preview.VoicePreviewViewModel;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class k8o0 extends pat<nnn0> {

    /* JADX INFO: renamed from: i */
    public cwf0 f121843i;

    /* JADX INFO: renamed from: j */
    public boolean f121844j;

    public k8o0(bsm bsmVar) {
        super(bsmVar);
        this.f121844j = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L3 */
    private void m144949L3() {
        if (this.f121843i == null) {
            this.f121843i = new cwf0("p_start_audio_room", VoicePreviewViewModel.class.getName());
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("anchorId", ypv.f199493a.m199309D0());
                jSONObject.put("entrance_type", ((nnn0) m206027E2()).f139757a0);
            } catch (JSONException e) {
                CrashHelper.m81296c(e);
            }
            this.f121843i.m109039o(jSONObject);
        }
        this.f121843i.m109033i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public void m144950N3(iqv iqvVar) {
        int iM137794a = iqvVar.m137794a();
        if (iM137794a != 1) {
            if (iM137794a != 2) {
                return;
            }
            m144951O3();
        } else {
            cwf0 cwf0Var = this.f121843i;
            if (cwf0Var != null) {
                cwf0Var.m109036l();
            }
        }
    }

    /* JADX INFO: renamed from: O3 */
    private void m144951O3() {
        cwf0 cwf0Var = this.f121843i;
        if (cwf0Var != null) {
            cwf0Var.m109035k();
            this.f121843i.m109034j();
            this.f121843i = null;
        }
    }

    /* JADX INFO: renamed from: M3 */
    public final void m144952M3(C4319c c4319c) {
        cwf0 cwf0Var = this.f121843i;
        if (cwf0Var == null) {
            return;
        }
        if (c4319c == C4319c.f15548i && this.f121844j) {
            this.f121844j = false;
            cwf0Var.m109036l();
        } else if (c4319c == C4319c.f15549j) {
            this.f121844j = true;
            cwf0Var.m109035k();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        if (((nnn0) m206027E2()).f139747Q) {
            return;
        }
        m144949L3();
        duringCreated(((nnn0) m206027E2()).m149815l()).takeUntil(new l9t()).subscribe(ffw.m121193d(new e30() { // from class: l.i8o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f112059a.m144950N3((iqv) obj);
            }
        }));
        m206029H2().lifecycle().subscribe(ffw.m121193d(new e30() { // from class: l.j8o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116733a.m144952M3((C4319c) obj);
            }
        }));
    }
}
