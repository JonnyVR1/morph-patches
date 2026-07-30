package p149l;

import android.os.Bundle;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.PlayerView;
import com.p046p1.mobile.putong.core.p053ui.mediapreview.CommonMediaPreviewAct;
import com.p046p1.mobile.putong.data.Media;
import java.util.ArrayList;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes3.dex */
public class hk5 extends jq2<ik5> {

    /* JADX INFO: renamed from: a */
    public final CommonMediaPreviewAct f108153a;

    /* JADX INFO: renamed from: b */
    public cxx<Media> f108154b;

    /* JADX INFO: renamed from: c */
    public int f108155c;

    /* JADX INFO: renamed from: d */
    public boolean f108156d;

    /* JADX INFO: renamed from: e */
    public int f108157e;

    public hk5(mcr mcrVar) {
        super(mcrVar);
        this.f108153a = (CommonMediaPreviewAct) mcrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m131453j0(Bundle bundle) {
        ((ik5) this.viewModel).m136772j(this.f108154b.source());
        ((ik5) this.viewModel).m136767c(this.f108155c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m131454k0(C4319c c4319c) {
        ib1.m135233b().mo135237e(PlayerView.f28107A);
        ((ik5) this.viewModel).m136773k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m131455l0(C4319c c4319c) {
        if (c4319c == C4319c.f15552m || c4319c == C4319c.f15549j || c4319c == C4319c.f15550k || c4319c == C4319c.f15554o) {
            CoreModule.m29936Q().mo67253Zo().mo111895f(false);
        } else {
            if (m131456i0() == null || !DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4.equals(m131456i0().mediaType)) {
                return;
            }
            CoreModule.m29936Q().mo67253Zo().mo111895f(true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0046  */
    /* JADX WARN: Code duplicated, block: B:13:0x004e  */
    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        String stringExtra = this.f108153a.getIntent().getStringExtra("user_id");
        this.f108157e = this.f108153a.getIntent().getIntExtra("source_type", -1);
        String stringExtra2 = this.f108153a.getIntent().getStringExtra("current_data");
        ArrayList<String> stringArrayListExtra = this.f108153a.getIntent().getStringArrayListExtra("all_data");
        int i = this.f108157e;
        if (i == -1) {
            this.f108154b = new bpd(stringArrayListExtra);
        } else if (i == 0) {
            this.f108154b = new vpa0(stringExtra, i);
        } else if (i == 1) {
            this.f108154b = new om90(stringExtra, i);
        } else if (i == 2) {
            this.f108154b = new vpa0(stringExtra, i);
        } else if (i == 3) {
            this.f108154b = new om90(stringExtra, i);
        }
        this.f108155c = this.f108154b.mo103052a(stringExtra2);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.dk5
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f86597a.m131453j0((Bundle) obj);
            }
        });
        lifecycle().filter(new w9j() { // from class: l.ek5
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15549j);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.fk5
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f98037a.m131454k0((C4319c) obj);
            }
        }));
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.gk5
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103150a.m131455l0((C4319c) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
        ib1.m135233b().mo135237e(PlayerView.f28107A);
    }

    /* JADX INFO: renamed from: i0 */
    public Media m131456i0() {
        if (vwb.m200296J(this.f108154b.source())) {
            return null;
        }
        return this.f108154b.source().get(this.f108155c);
    }

    /* JADX INFO: renamed from: m0 */
    public cxx<Media> m131457m0() {
        return this.f108154b;
    }
}
