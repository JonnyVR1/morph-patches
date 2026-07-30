package p149l;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes13.dex */
public class stn extends svs {

    /* JADX INFO: renamed from: f */
    public final View f166376f;

    public stn(mcr mcrVar, mss mssVar, View view) {
        super(mcrVar, mssVar);
        this.f166376f = view;
    }

    /* JADX INFO: renamed from: S2 */
    public final /* synthetic */ void m185961S2(String str, View view) {
        j2e0.m139446m(getAct(), Uri.parse(str));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m151642F2().LiveHomePageEvent.tabSelected().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.qtn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f156371a.m185962T2((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T2 */
    public final void m185962T2(String str) {
        if (this.f166376f != null) {
            if (x4u.m207027m(str)) {
                xdl0.m208344M(this.f166376f, false);
            } else {
                m185963U2(str);
            }
        }
    }

    /* JADX INFO: renamed from: U2 */
    public final void m185963U2(String str) {
        final String strM195973w4 = ypv.m215672k().m195973w4();
        if (x4u.m207035u(str)) {
            strM195973w4 = ypv.m215672k().m195592B4();
        }
        boolean zIsEmpty = TextUtils.isEmpty(strM195973w4);
        View view = this.f166376f;
        if (zIsEmpty) {
            xdl0.m208344M(view, false);
        } else {
            xdl0.m208344M(view, true);
            xdl0.m208329E0(this.f166376f, new View.OnClickListener() { // from class: l.rtn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f160976a.m185961S2(strM195973w4, view2);
                }
            });
        }
    }
}
