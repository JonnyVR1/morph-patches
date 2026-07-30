package p153l;

import android.content.DialogInterface;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;

/* JADX INFO: loaded from: classes11.dex */
public class xnq0 extends AbstractC18774n4 {
    @Override // p153l.g6m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Boolean mo38500a(p8l.C19323a c19323a) {
        v5b0.m199800z(true);
        CoreModule.f18264c.f20389g2.m192271n3();
        unq0 unq0Var = new unq0(c19323a.m171258a(), "");
        unq0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.wnq0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                v5b0.m199800z(false);
            }
        });
        unq0Var.show();
        return Boolean.TRUE;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(p8l.C19323a c19323a) {
        return s7a.m184997z() && !joa.m146364P3() && (c19323a.f151040a.getParentFragment() instanceof cvl) && ((cvl) c19323a.f151040a.getParentFragment()).mo39558T() == NewTanFragTag.HOME && !CoreModule.f18264c.f20389g2.m192266i3() && !v5b0.m199782h();
    }
}
