package p002l;

import android.content.DialogInterface;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import java.util.ArrayList;
import java.util.Arrays;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class s6s {

    /* JADX INFO: renamed from: a */
    public final bsm f18809a;

    /* JADX INFO: renamed from: b */
    public boolean f18810b = false;

    /* JADX INFO: renamed from: c */
    public boolean f18811c = false;

    /* JADX INFO: renamed from: d */
    public ArrayList<vtl> f18812d = new ArrayList<>();

    public s6s(bsm bsmVar) {
        this.f18809a = bsmVar;
    }

    /* JADX INFO: renamed from: f */
    public boolean m22218f(final LiveDialogEnum liveDialogEnum) {
        return ((vtl) vwb.r(this.f18812d, new w9j() { // from class: l.n6s
            public final Object call(Object obj) {
                return Boolean.valueOf(((vtl) obj).getType() == liveDialogEnum);
            }
        })) != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m22219g() {
        return this.f18811c;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m22220h(vtl vtlVar, DialogInterface dialogInterface) {
        this.f18809a.f8343l.DialogCenterEvent.changeVisibility().m(new tzd().m23239c(true).m23238b(vtlVar.getType()).m23237a(vtlVar.mo5150b()));
        this.f18812d.add(vtlVar);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m22221i(vtl vtlVar, DialogInterface dialogInterface) {
        this.f18809a.f8343l.DialogCenterEvent.changeVisibility().m(new tzd().m23239c(false).m23238b(vtlVar.getType()).m23237a(vtlVar.mo5150b()));
        this.f18812d.remove(vtlVar);
    }

    /* JADX INFO: renamed from: j */
    public void m22222j(final vtl vtlVar) {
        vtlVar.mo5151c(new DialogInterface.OnShowListener() { // from class: l.q6s
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f17826a.m22220h(vtlVar, dialogInterface);
            }
        });
        vtlVar.mo5149a(new DialogInterface.OnDismissListener() { // from class: l.r6s
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f18397a.m22221i(vtlVar, dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m22223k(boolean z) {
        this.f18811c = z;
    }

    /* JADX INFO: renamed from: l */
    public boolean m22224l(final LiveDialogEnum... liveDialogEnumArr) {
        return (this.f18812d.size() == 0 || vwb.r(this.f18812d, new w9j() { // from class: l.o6s
            public final Object call(Object obj) {
                return Boolean.valueOf(Arrays.asList(liveDialogEnumArr).contains(((vtl) obj).getType()));
            }
        }) == null) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    public boolean m22225m(final LiveDialogEnum liveDialogEnum) {
        vtl vtlVar = (vtl) vwb.r(this.f18812d, new w9j() { // from class: l.p6s
            public final Object call(Object obj) {
                return Boolean.valueOf(((vtl) obj).getType() == liveDialogEnum);
            }
        });
        if (vtlVar == null) {
            return false;
        }
        vtlVar.dismiss();
        return true;
    }
}
