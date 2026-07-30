package p153l;

import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4887e;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.GroupTab;
import com.p051p1.mobile.putong.core.data.NotificationCounter;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.newui.group.GroupTabItemView;
import com.p051p1.mobile.putong.data.Links;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class hpk extends ar2<ppk> {

    /* JADX INFO: renamed from: a */
    public Links f111028a;

    /* JADX INFO: renamed from: b */
    public GroupTab f111029b;

    public hpk(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: renamed from: C0 */
    private void m136530C0() {
        duringCreated(CoreModule.f18264c.f20387g0.m32791A6()).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.apk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f72729a.m136552D0((uxj0) obj);
            }
        }, new y20() { // from class: l.epk
            @Override // p153l.y20
            public final void call(Object obj) {
                hpk.m136536i0((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20387g0.m32823L6()).subscribe(psd0.m173597H(new y20() { // from class: l.fpk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f100200a.m136555G0((Pair) obj);
            }
        }, new y20() { // from class: l.gpk
            @Override // p153l.y20
            public final void call(Object obj) {
                hpk.m136532e0((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20387g0.m32883f7()).distinctUntilChanged().subscribe(psd0.m173597H(new y20() { // from class: l.pok
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153413a.m136556H0((List) obj);
            }
        }, new y20() { // from class: l.qok
            @Override // p153l.y20
            public final void call(Object obj) {
                hpk.m136546s0((Throwable) obj);
            }
        }));
        if (CoreModule.f18264c.f20387g0.m32823L6().m222761e() == null || CoreModule.f18264c.f20387g0.m32823L6().m222761e().second == null || ((List) CoreModule.f18264c.f20387g0.m32823L6().m222761e().second).isEmpty() || CoreModule.m30933P().m143412i().mo180560x2()) {
            ((ppk) this.viewModel).m173239f();
            ((ppk) this.viewModel).m173243n(true);
            m136561P0();
        }
        duringCreated(ConnectivityReceiver.m82473m()).skip(1).filter(new qcj() { // from class: l.rok
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }).filter(new qcj() { // from class: l.sok
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(CoreModule.f18264c.f20387g0.m32823L6().m222761e() == null || jyb.m147479J((Collection) CoreModule.f18264c.f20387g0.m32823L6().m222761e().second));
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.tok
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f175427a.m136557I0((NetworkInfo) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20387g0.m32814H8()).subscribe(psd0.m173597H(new y20() { // from class: l.uok
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f180100a.m136553E0((NotificationCounter) obj);
            }
        }, new y20() { // from class: l.bpk
            @Override // p153l.y20
            public final void call(Object obj) {
                hpk.m136543p0((Throwable) obj);
            }
        }));
        CoreModule.f18264c.f20387g0.m32852U8();
        m136563R0();
        if (CoreModule.m30933P().m143412i().mo180560x2()) {
            lifecycle().filter(new qcj() { // from class: l.cpk
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4470c) obj) == C4470c.f16272n);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.dpk
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f90064a.m136554F0((C4470c) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public /* synthetic */ void m136531J0(Bundle bundle) {
        ((ppk) this.viewModel).m173245r();
        m136530C0();
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m136532e0(Throwable th) {
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m136536i0(Throwable th) {
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ void m136543p0(Throwable th) {
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m136544q0(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ void m136546s0(Throwable th) {
    }

    /* JADX INFO: renamed from: A0 */
    public boolean m136551A0() {
        return NullChecker.m82486a(this.f111028a) && !TextUtils.isEmpty(this.f111028a.next);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m136552D0(uxj0 uxj0Var) {
        ((ppk) this.viewModel).m173244q();
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m136553E0(NotificationCounter notificationCounter) {
        ((ppk) this.viewModel).m173246s(notificationCounter);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m136554F0(C4470c c4470c) {
        if (NullChecker.m82486a(this.f111029b)) {
            CoreModule.f18264c.f20387g0.m32885f9(this.f111029b);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m136555G0(Pair pair) {
        this.f111028a = (Links) pair.first;
        ((ppk) this.viewModel).m173241l((List) pair.second);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m136556H0(List list) {
        if (CoreModule.m30933P().m143412i().mo180560x2()) {
            if (jyb.m147479J(list)) {
                this.f111029b = null;
            } else {
                this.f111029b = (GroupTab) list.get(0);
            }
        }
        ((ppk) this.viewModel).m173242m(list);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m136557I0(NetworkInfo networkInfo) {
        ((ppk) this.viewModel).m173243n(true);
        m136561P0();
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m136558L0(uxj0 uxj0Var) {
        ((ppk) this.viewModel).m173243n(false);
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m136559N0(Throwable th) {
        o1j0.m165634h(R$string.f21461B2);
        ((ppk) this.viewModel).m173243n(false);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m136560O0(GroupTab groupTab, View view) {
        C4887e c4887e = CoreModule.f18264c.f20387g0;
        GroupTab groupTabM32894i9 = c4887e.m32894i9();
        if (groupTabM32894i9 == null || groupTabM32894i9.f21149id != groupTab.f21149id) {
            sfj0.m185596c("e_group_chat_type_tab", pageId(), sfj0.C20032a.m185615h("group_chat_type", groupTab.name));
            c4887e.m32885f9(groupTab);
            ((ppk) this.viewModel).m173241l(Collections.EMPTY_LIST);
            ((ppk) this.viewModel).m173243n(true);
            m136561P0();
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m136561P0() {
        duringCreated(CoreModule.f18264c.f20387g0.m32917q6()).subscribe(psd0.m173597H(new y20() { // from class: l.yok
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f200988a.m136558L0((uxj0) obj);
            }
        }, new y20() { // from class: l.zok
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205357a.m136559N0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q0 */
    public void m136562Q0(GroupTabItemView groupTabItemView, final GroupTab groupTab) {
        bnl0.m105509E0(groupTabItemView, new View.OnClickListener() { // from class: l.vok
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f185057a.m136560O0(groupTab, view);
            }
        });
    }

    /* JADX INFO: renamed from: R0 */
    public void m136563R0() {
        if (((ppk) this.viewModel).m173240i()) {
            sfj0.m185601h("e_group_notice_red_number_bubble", pageId(), new sfj0.C20032a[0]);
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.ook
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f148372a.m136531J0((Bundle) obj);
            }
        });
    }

    public String pageId() {
        return "p_group_chat_square";
    }

    /* JADX INFO: renamed from: r */
    public void m136564r() {
        Object obj;
        Pair<Links, List<ChatGroup>> pairM222761e = CoreModule.f18264c.f20387g0.m32823L6().m222761e();
        if (pairM222761e == null || (obj = pairM222761e.first) == null || TextUtils.isEmpty(((Links) obj).next)) {
            return;
        }
        Links links = (Links) pairM222761e.first;
        this.f111028a = links;
        duringCreated(CoreModule.f18264c.f20387g0.m32920r6(links.next)).subscribe(psd0.m173597H(new y20() { // from class: l.wok
            @Override // p153l.y20
            public final void call(Object obj2) {
                hpk.m136544q0((uxj0) obj2);
            }
        }, new y20() { // from class: l.xok
            @Override // p153l.y20
            public final void call(Object obj2) {
                o1j0.m165634h(R$string.f21461B2);
            }
        }));
    }

    /* JADX INFO: renamed from: z0 */
    public void m136565z0() {
        act().startActivity(jek.m144575g(act()));
        sfj0.m185596c("e_group_notice_entrance", pageId(), sfj0.C20032a.m185613f("is_red_bubble", ((ppk) this.viewModel).m173240i() ? 1 : 0));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
