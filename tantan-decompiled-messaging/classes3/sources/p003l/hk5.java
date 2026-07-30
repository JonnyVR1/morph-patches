package p003l;

import android.os.Bundle;
import com.p000p1.mobile.putong.core.p001ui.mediapreview.CommonMediaPreviewAct;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.PlayerView;
import com.p1.mobile.putong.data.Media;
import java.util.ArrayList;
import l.ib1;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.vwb;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class hk5 extends jq2<ik5> {

    /* JADX INFO: renamed from: a */
    public final CommonMediaPreviewAct f4215a;

    /* JADX INFO: renamed from: b */
    public cxx<Media> f4216b;

    /* JADX INFO: renamed from: c */
    public int f4217c;

    /* JADX INFO: renamed from: d */
    public boolean f4218d;

    /* JADX INFO: renamed from: e */
    public int f4219e;

    public hk5(mcr mcrVar) {
        super(mcrVar);
        this.f4215a = (CommonMediaPreviewAct) mcrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m4973j0(Bundle bundle) {
        ((ik5) ((jq2) this).viewModel).m5142j(this.f4216b.source());
        ((ik5) ((jq2) this).viewModel).m5136c(this.f4217c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m4974k0(c cVar) {
        ib1.b().e(PlayerView.A);
        ((ik5) ((jq2) this).viewModel).m5143k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m4975l0(c cVar) {
        if (cVar == c.m || cVar == c.j || cVar == c.k || cVar == c.o) {
            CoreModule.Q().Zo().f(false);
        } else {
            if (m4978i0() == null || !DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4.equals(m4978i0().mediaType)) {
                return;
            }
            CoreModule.Q().Zo().f(true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0046  */
    /* JADX WARN: Code duplicated, block: B:13:0x004e  */
    /* JADX INFO: renamed from: Z */
    public void m4976Z() {
        super.Z();
        String stringExtra = this.f4215a.getIntent().getStringExtra("user_id");
        this.f4219e = this.f4215a.getIntent().getIntExtra("source_type", -1);
        String stringExtra2 = this.f4215a.getIntent().getStringExtra("current_data");
        ArrayList<String> stringArrayListExtra = this.f4215a.getIntent().getStringArrayListExtra("all_data");
        int i = this.f4219e;
        if (i == -1) {
            this.f4216b = new bpd(stringArrayListExtra);
        } else if (i == 0) {
            this.f4216b = new vpa0(stringExtra, i);
        } else if (i == 1) {
            this.f4216b = new om90(stringExtra, i);
        } else if (i == 2) {
            this.f4216b = new vpa0(stringExtra, i);
        } else if (i == 3) {
            this.f4216b = new om90(stringExtra, i);
        }
        this.f4217c = this.f4216b.mo2976a(stringExtra2);
    }

    /* JADX INFO: renamed from: a0 */
    public void m4977a0() {
        super.a0();
        creates(new e30() { // from class: l.dk5
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f3014a.m4973j0((Bundle) obj);
            }
        });
        lifecycle().filter(new w9j() { // from class: l.ek5
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.j);
            }
        }).subscribe((m250) mkd0.G(new e30() { // from class: l.fk5
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f3653a.m4974k0((c) obj);
            }
        }));
        lifecycle().subscribe((m250) mkd0.G(new e30() { // from class: l.gk5
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f3922a.m4975l0((c) obj);
            }
        }));
    }

    public void destroy() {
        ib1.b().e(PlayerView.A);
    }

    /* JADX INFO: renamed from: i0 */
    public Media m4978i0() {
        if (vwb.J(this.f4216b.source())) {
            return null;
        }
        return this.f4216b.source().get(this.f4217c);
    }

    /* JADX INFO: renamed from: m0 */
    public cxx<Media> m4979m0() {
        return this.f4216b;
    }
}
