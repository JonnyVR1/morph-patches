package p153l;

import android.content.DialogInterface;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;

/* JADX INFO: loaded from: classes11.dex */
public class oy80 extends AbstractC18774n4 {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m169832c(DialogInterface dialogInterface) {
        CoreModule.f18264c.f20443y2.m216818X3();
        v5b0.m199800z(false);
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Boolean mo38500a(p8l.C19323a c19323a) {
        v5b0.m199800z(true);
        ly80 ly80Var = new ly80(c19323a.m171258a(), "");
        ly80Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ny80
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                oy80.m169832c(dialogInterface);
            }
        });
        ly80Var.show();
        return Boolean.TRUE;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(p8l.C19323a c19323a) {
        return CoreModule.f18264c.f20443y2.m216799E3() && CoreModule.f18264c.f20443y2.m216823q3() && (c19323a.f151040a.getParentFragment() instanceof cvl) && ((cvl) c19323a.f151040a.getParentFragment()).mo39558T() == NewTanFragTag.HOME && !v5b0.m199782h();
    }
}
