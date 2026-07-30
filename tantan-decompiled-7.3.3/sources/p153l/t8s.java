package p153l;

import android.content.DialogInterface;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class t8s {

    /* JADX INFO: renamed from: a */
    public final dum f172569a;

    /* JADX INFO: renamed from: b */
    public boolean f172570b = false;

    /* JADX INFO: renamed from: c */
    public boolean f172571c = false;

    /* JADX INFO: renamed from: d */
    public ArrayList<jwl> f172572d = new ArrayList<>();

    public t8s(dum dumVar) {
        this.f172569a = dumVar;
    }

    /* JADX INFO: renamed from: f */
    public boolean m189699f(final LiveDialogEnum liveDialogEnum) {
        return ((jwl) jyb.m147529r(this.f172572d, new qcj() { // from class: l.o8s
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((jwl) obj).getType() == liveDialogEnum);
            }
        })) != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m189700g() {
        return this.f172571c;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m189701h(jwl jwlVar, DialogInterface dialogInterface) {
        this.f172569a.f90826l.DialogCenterEvent.changeVisibility().mo199274m(new h1e().m133325c(true).m133324b(jwlVar.getType()).m133323a(jwlVar.mo72965b()));
        this.f172572d.add(jwlVar);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m189702i(jwl jwlVar, DialogInterface dialogInterface) {
        this.f172569a.f90826l.DialogCenterEvent.changeVisibility().mo199274m(new h1e().m133325c(false).m133324b(jwlVar.getType()).m133323a(jwlVar.mo72965b()));
        this.f172572d.remove(jwlVar);
    }

    /* JADX INFO: renamed from: j */
    public void m189703j(final jwl jwlVar) {
        jwlVar.mo72966c(new DialogInterface.OnShowListener() { // from class: l.r8s
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f161762a.m189701h(jwlVar, dialogInterface);
            }
        });
        jwlVar.mo72964a(new DialogInterface.OnDismissListener() { // from class: l.s8s
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f166842a.m189702i(jwlVar, dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m189704k(boolean z) {
        this.f172571c = z;
    }

    /* JADX INFO: renamed from: l */
    public boolean m189705l(final LiveDialogEnum... liveDialogEnumArr) {
        return (this.f172572d.size() == 0 || jyb.m147529r(this.f172572d, new qcj() { // from class: l.p8s
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(Arrays.asList(liveDialogEnumArr).contains(((jwl) obj).getType()));
            }
        }) == null) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    public boolean m189706m(final LiveDialogEnum liveDialogEnum) {
        jwl jwlVar = (jwl) jyb.m147529r(this.f172572d, new qcj() { // from class: l.q8s
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((jwl) obj).getType() == liveDialogEnum);
            }
        });
        if (jwlVar == null) {
            return false;
        }
        jwlVar.dismiss();
        return true;
    }
}
