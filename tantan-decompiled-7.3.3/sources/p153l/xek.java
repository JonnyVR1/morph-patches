package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.GroupCreate;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.DetectCategoryType;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.util.AntiSpamHelper;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
public class xek extends ar2<bfk> {

    /* JADX INFO: renamed from: a */
    public GroupCreate f193963a;

    /* JADX INFO: renamed from: b */
    public Picture f193964b;

    public xek(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m210707e0(List list, Media media) {
        if (media instanceof Picture) {
            list.add((Picture) media);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ List m210712j0(List list) {
        final ArrayList arrayList = new ArrayList(1);
        jyb.m147537z(list, new y20() { // from class: l.wek
            @Override // p153l.y20
            public final void call(Object obj) {
                xek.m210707e0(arrayList, (Media) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m210714n0(Bundle bundle) {
        ((bfk) this.viewModel).m103923r();
    }

    private String pageId() {
        return ((PutongAct) act()).pageId();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        this.f193963a = (GroupCreate) act().getIntent().getSerializableExtra("group_create");
        this.f193964b = (Picture) act().getIntent().getSerializableExtra("picture");
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.qek
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f157189a.m210714n0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m210715l0() {
        return !TextUtils.isEmpty(this.f193963a.description);
    }

    /* JADX INFO: renamed from: m0 */
    public void m210716m0(View view) {
        sfj0.m185596c("e_add_group_state", pageId(), new sfj0.C20032a[0]);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C22421c m210717o0(uxj0 uxj0Var) {
        return yb5.m214980I(jyb.m147507f0(this.f193964b), "group-create").map(new qcj() { // from class: l.vek
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return xek.m210712j0((List) obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C22421c m210718p0(List list) {
        return CoreModule.f18264c.f20387g0.m32835P6(this.f193963a, list);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m210719q0(uxj0 uxj0Var) {
        act().progressDismiss();
        o1j0.m165649w(R$string.f21483E0);
        act().setResult(-1);
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m210720r0(Throwable th) {
        act().progressDismiss();
        if (th instanceof AntiSpamHelper.AntispamException) {
            r1j0.m179420g(th.getMessage());
        } else {
            CoreModule.m30933P().m143412i().mo180452d(th);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m210721s0(View view) {
        sfj0.m185596c("e_group_complete_button", pageId(), new sfj0.C20032a[0]);
        act().progress("");
        duringCreated(AntiSpamHelper.m81450b(act(), this.f193963a.description, DetectCategoryType.get(DetectCategoryType.group_profile), "group_description", pageId()).switchMap(new qcj() { // from class: l.rek
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f162657a.m210717o0((uxj0) obj);
            }
        }).flatMap(new qcj() { // from class: l.sek
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f167628a.m210718p0((List) obj);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.tek
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f173841a.m210719q0((uxj0) obj);
            }
        }, new y20() { // from class: l.uek
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178670a.m210720r0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t0 */
    public void m210722t0(String str) {
        this.f193963a.description = str;
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
