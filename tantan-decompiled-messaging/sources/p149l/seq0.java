package p149l;

import android.content.DialogInterface;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;

/* JADX INFO: loaded from: classes11.dex */
public class seq0 extends AbstractC18834o4 {
    @Override // p149l.p3m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Boolean mo37497a(z5l.C21640a c21640a) {
        rxa0.m181505z(true);
        CoreModule.f17545c.f19647g2.m122581n3();
        peq0 peq0Var = new peq0(c21640a.m217363a(), "");
        peq0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.req0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                rxa0.m181505z(false);
            }
        });
        peq0Var.show();
        return Boolean.TRUE;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(z5l.C21640a c21640a) {
        return g6a.m124577z() && !xma.m210050O3() && (c21640a.f201827a.getParentFragment() instanceof psl) && ((psl) c21640a.f201827a.getParentFragment()).mo38555T() == NewTanFragTag.HOME && !CoreModule.f17545c.f19647g2.m122576i3() && !rxa0.m181487h();
    }
}
