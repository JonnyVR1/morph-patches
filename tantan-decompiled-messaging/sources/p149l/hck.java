package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.GroupCreate;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.DetectCategoryType;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.util.AntiSpamHelper;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class hck extends jq2<lck> {

    /* JADX INFO: renamed from: a */
    public GroupCreate f107062a;

    /* JADX INFO: renamed from: b */
    public Picture f107063b;

    public hck(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m130427e0(List list, Media media) {
        if (media instanceof Picture) {
            list.add((Picture) media);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ List m130432j0(List list) {
        final ArrayList arrayList = new ArrayList(1);
        vwb.m200354z(list, new e30() { // from class: l.gck
            @Override // p149l.e30
            public final void call(Object obj) {
                hck.m130427e0(arrayList, (Media) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m130434n0(Bundle bundle) {
        ((lck) this.viewModel).m149317r();
    }

    private String pageId() {
        return ((PutongAct) act()).pageId();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        this.f107062a = (GroupCreate) act().getIntent().getSerializableExtra("group_create");
        this.f107063b = (Picture) act().getIntent().getSerializableExtra("picture");
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.ack
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68861a.m130434n0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m130435l0() {
        return !TextUtils.isEmpty(this.f107062a.description);
    }

    /* JADX INFO: renamed from: m0 */
    public void m130436m0(View view) {
        o6j0.m162859c("e_add_group_state", pageId(), new o6j0.C18854a[0]);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C22306c m130437o0(roj0 roj0Var) {
        return ya5.m213793I(vwb.m200324f0(this.f107063b), "group-create").map(new w9j() { // from class: l.fck
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return hck.m130432j0((List) obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C22306c m130438p0(List list) {
        return CoreModule.f17545c.f19645g0.m31832P6(this.f107062a, list);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m130439q0(roj0 roj0Var) {
        act().progressDismiss();
        lsi0.m151593w(R$string.f20741E0);
        act().setResult(-1);
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m130440r0(Throwable th) {
        act().progressDismiss();
        if (th instanceof AntiSpamHelper.AntispamException) {
            osi0.m165783g(th.getMessage());
        } else {
            CoreModule.m29935P().m94658i().mo158360d(th);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m130441s0(View view) {
        o6j0.m162859c("e_group_complete_button", pageId(), new o6j0.C18854a[0]);
        act().progress("");
        duringCreated(AntiSpamHelper.m80267b(act(), this.f107062a.description, DetectCategoryType.get(DetectCategoryType.group_profile), "group_description", pageId()).switchMap(new w9j() { // from class: l.bck
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f74945a.m130437o0((roj0) obj);
            }
        }).flatMap(new w9j() { // from class: l.cck
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f80254a.m130438p0((List) obj);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.dck
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f85438a.m130439q0((roj0) obj);
            }
        }, new e30() { // from class: l.eck
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f90544a.m130440r0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t0 */
    public void m130442t0(String str) {
        this.f107062a.description = str;
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
