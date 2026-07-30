package p149l;

import android.content.DialogInterface;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;

/* JADX INFO: loaded from: classes11.dex */
public class kq80 extends AbstractC18834o4 {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m146927c(DialogInterface dialogInterface) {
        CoreModule.f17545c.f19701y2.m155349X3();
        rxa0.m181505z(false);
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Boolean mo37497a(z5l.C21640a c21640a) {
        rxa0.m181505z(true);
        hq80 hq80Var = new hq80(c21640a.m217363a(), "");
        hq80Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.jq80
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                kq80.m146927c(dialogInterface);
            }
        });
        hq80Var.show();
        return Boolean.TRUE;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(z5l.C21640a c21640a) {
        return CoreModule.f17545c.f19701y2.m155330E3() && CoreModule.f17545c.f19701y2.m155354q3() && (c21640a.f201827a.getParentFragment() instanceof psl) && ((psl) c21640a.f201827a.getParentFragment()).mo38555T() == NewTanFragTag.HOME && !rxa0.m181487h();
    }
}
