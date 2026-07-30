package p153l;

import android.os.Bundle;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.PlayerView;
import com.p051p1.mobile.putong.core.p058ui.mediapreview.CommonMediaPreviewAct;
import com.p051p1.mobile.putong.data.Media;
import java.util.ArrayList;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes3.dex */
public class il5 extends ar2<jl5> {

    /* JADX INFO: renamed from: a */
    public final CommonMediaPreviewAct f115525a;

    /* JADX INFO: renamed from: b */
    public z5y<Media> f115526b;

    /* JADX INFO: renamed from: c */
    public int f115527c;

    /* JADX INFO: renamed from: d */
    public boolean f115528d;

    /* JADX INFO: renamed from: e */
    public int f115529e;

    public il5(ner nerVar) {
        super(nerVar);
        this.f115525a = (CommonMediaPreviewAct) nerVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m140583j0(Bundle bundle) {
        ((jl5) this.viewModel).m145947j(this.f115526b.source());
        ((jl5) this.viewModel).m145942c(this.f115527c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m140584k0(C4470c c4470c) {
        pb1.m171472b().mo171476e(PlayerView.f28955A);
        ((jl5) this.viewModel).m145948k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m140585l0(C4470c c4470c) {
        if (c4470c == C4470c.f16271m || c4470c == C4470c.f16268j || c4470c == C4470c.f16269k || c4470c == C4470c.f16273o) {
            CoreModule.m30934Q().mo68436Zo().mo136902f(false);
        } else {
            if (m140586i0() == null || !DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4.equals(m140586i0().mediaType)) {
                return;
            }
            CoreModule.m30934Q().mo68436Zo().mo136902f(true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0046  */
    /* JADX WARN: Code duplicated, block: B:13:0x004e  */
    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        String stringExtra = this.f115525a.getIntent().getStringExtra("user_id");
        this.f115529e = this.f115525a.getIntent().getIntExtra("source_type", -1);
        String stringExtra2 = this.f115525a.getIntent().getStringExtra("current_data");
        ArrayList<String> stringArrayListExtra = this.f115525a.getIntent().getStringArrayListExtra("all_data");
        int i = this.f115529e;
        if (i == -1) {
            this.f115526b = new gqd(stringArrayListExtra);
        } else if (i == 0) {
            this.f115526b = new zxa0(stringExtra, i);
        } else if (i == 1) {
            this.f115526b = new su90(stringExtra, i);
        } else if (i == 2) {
            this.f115526b = new zxa0(stringExtra, i);
        } else if (i == 3) {
            this.f115526b = new su90(stringExtra, i);
        }
        this.f115527c = this.f115526b.mo131371a(stringExtra2);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.el5
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94479a.m140583j0((Bundle) obj);
            }
        });
        lifecycle().filter(new qcj() { // from class: l.fl5
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16268j);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.gl5
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f104796a.m140584k0((C4470c) obj);
            }
        }));
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.hl5
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f110482a.m140585l0((C4470c) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
        pb1.m171472b().mo171476e(PlayerView.f28955A);
    }

    /* JADX INFO: renamed from: i0 */
    public Media m140586i0() {
        if (jyb.m147479J(this.f115526b.source())) {
            return null;
        }
        return this.f115526b.source().get(this.f115527c);
    }

    /* JADX INFO: renamed from: m0 */
    public z5y<Media> m140587m0() {
        return this.f115526b;
    }
}
