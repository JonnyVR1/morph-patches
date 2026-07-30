package p153l;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes9.dex */
public class svn extends txs {

    /* JADX INFO: renamed from: f */
    public final View f170862f;

    public svn(ner nerVar, nus nusVar, View view) {
        super(nerVar, nusVar);
        this.f170862f = view;
    }

    /* JADX INFO: renamed from: S2 */
    public final /* synthetic */ void m188220S2(String str, View view) {
        nae0.m162083m(getAct(), Uri.parse(str));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m160238F2().LiveHomePageEvent.tabSelected().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.qvn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159789a.m188221T2((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T2 */
    public final void m188221T2(String str) {
        if (this.f170862f != null) {
            if (y6u.m214509m(str)) {
                bnl0.m105524M(this.f170862f, false);
            } else {
                m188222U2(str);
            }
        }
    }

    /* JADX INFO: renamed from: U2 */
    public final void m188222U2(String str) {
        final String strM203760w4 = zrv.m221193k().m203760w4();
        if (y6u.m214517u(str)) {
            strM203760w4 = zrv.m221193k().m203379B4();
        }
        boolean zIsEmpty = TextUtils.isEmpty(strM203760w4);
        View view = this.f170862f;
        if (zIsEmpty) {
            bnl0.m105524M(view, false);
        } else {
            bnl0.m105524M(view, true);
            bnl0.m105509E0(this.f170862f, new View.OnClickListener() { // from class: l.rvn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f165034a.m188220S2(strM203760w4, view2);
                }
            });
        }
    }
}
