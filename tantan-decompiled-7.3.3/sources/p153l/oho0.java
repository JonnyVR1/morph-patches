package p153l;

import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.preview.VoicePreviewViewModel;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class oho0 extends qct<rwn0> {

    /* JADX INFO: renamed from: i */
    public l4g0 f147468i;

    /* JADX INFO: renamed from: j */
    public boolean f147469j;

    public oho0(dum dumVar) {
        super(dumVar);
        this.f147469j = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L3 */
    private void m167709L3() {
        if (this.f147468i == null) {
            this.f147468i = new l4g0("p_start_audio_room", VoicePreviewViewModel.class.getName());
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("anchorId", zrv.f205799a.m207631D0());
                jSONObject.put("entrance_type", ((rwn0) m213810E2()).f165204a0);
            } catch (JSONException e) {
                CrashHelper.m82479c(e);
            }
            this.f147468i.m152780o(jSONObject);
        }
        this.f147468i.m152774i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public void m167710N3(jsv jsvVar) {
        int iM146875a = jsvVar.m146875a();
        if (iM146875a != 1) {
            if (iM146875a != 2) {
                return;
            }
            m167711O3();
        } else {
            l4g0 l4g0Var = this.f147468i;
            if (l4g0Var != null) {
                l4g0Var.m152777l();
            }
        }
    }

    /* JADX INFO: renamed from: O3 */
    private void m167711O3() {
        l4g0 l4g0Var = this.f147468i;
        if (l4g0Var != null) {
            l4g0Var.m152776k();
            this.f147468i.m152775j();
            this.f147468i = null;
        }
    }

    /* JADX INFO: renamed from: M3 */
    public final void m167712M3(C4470c c4470c) {
        l4g0 l4g0Var = this.f147468i;
        if (l4g0Var == null) {
            return;
        }
        if (c4470c == C4470c.f16267i && this.f147469j) {
            this.f147469j = false;
            l4g0Var.m152777l();
        } else if (c4470c == C4470c.f16268j) {
            this.f147469j = true;
            l4g0Var.m152776k();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        if (((rwn0) m213810E2()).f165194Q) {
            return;
        }
        m167709L3();
        duringCreated(((rwn0) m213810E2()).m202192l()).takeUntil(new mbt()).subscribe(dhw.m115825d(new y20() { // from class: l.mho0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f136866a.m167710N3((jsv) obj);
            }
        }));
        m213812H2().lifecycle().subscribe(dhw.m115825d(new y20() { // from class: l.nho0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142016a.m167712M3((C4470c) obj);
            }
        }));
    }
}
