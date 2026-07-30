package p149l;

import android.content.DialogInterface;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;

/* JADX INFO: loaded from: classes11.dex */
public class kdi extends AbstractC18834o4 {
    @Override // p149l.p3m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Boolean mo37497a(z5l.C21640a c21640a) {
        rxa0.m181505z(true);
        CoreModule.f17545c.f19561E0.m203797a4();
        sci sciVar = new sci(c21640a.m217363a(), "");
        sciVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.jdi
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                rxa0.m181505z(false);
            }
        });
        sciVar.show();
        return Boolean.TRUE;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(z5l.C21640a c21640a) {
        return g6a.m124562k() && !xma.m210039B3() && (c21640a.f201827a.getParentFragment() instanceof psl) && ((psl) c21640a.f201827a.getParentFragment()).mo38555T() == NewTanFragTag.HOME && !CoreModule.f17545c.f19561E0.m203773C3() && !rxa0.m181487h() && CoreModule.f17545c.f19598Q1.f20117R.m34750D();
    }
}
