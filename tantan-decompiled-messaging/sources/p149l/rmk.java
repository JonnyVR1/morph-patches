package p149l;

import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4736e;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.GroupTab;
import com.p046p1.mobile.putong.core.data.NotificationCounter;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.newui.group.GroupTabItemView;
import com.p046p1.mobile.putong.data.Links;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class rmk extends jq2<zmk> {

    /* JADX INFO: renamed from: a */
    public Links f160102a;

    /* JADX INFO: renamed from: b */
    public GroupTab f160103b;

    public rmk(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: C0 */
    private void m179982C0() {
        duringCreated(CoreModule.f17545c.f19645g0.m31788A6()).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.kmk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123808a.m180004D0((roj0) obj);
            }
        }, new e30() { // from class: l.omk
            @Override // p149l.e30
            public final void call(Object obj) {
                rmk.m179988i0((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19645g0.m31820L6()).subscribe(mkd0.m154956H(new e30() { // from class: l.pmk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150240a.m180007G0((Pair) obj);
            }
        }, new e30() { // from class: l.qmk
            @Override // p149l.e30
            public final void call(Object obj) {
                rmk.m179984e0((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19645g0.m31880f7()).distinctUntilChanged().subscribe(mkd0.m154956H(new e30() { // from class: l.zlk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203640a.m180008H0((List) obj);
            }
        }, new e30() { // from class: l.amk
            @Override // p149l.e30
            public final void call(Object obj) {
                rmk.m179998s0((Throwable) obj);
            }
        }));
        if (CoreModule.f17545c.f19645g0.m31820L6().m221515e() == null || CoreModule.f17545c.f19645g0.m31820L6().m221515e().second == null || ((List) CoreModule.f17545c.f19645g0.m31820L6().m221515e().second).isEmpty() || CoreModule.m29935P().m94658i().mo158468x2()) {
            ((zmk) this.viewModel).m219357f();
            ((zmk) this.viewModel).m219361n(true);
            m180013P0();
        }
        duringCreated(ConnectivityReceiver.m81290m()).skip(1).filter(new w9j() { // from class: l.bmk
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }).filter(new w9j() { // from class: l.cmk
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(CoreModule.f17545c.f19645g0.m31820L6().m221515e() == null || vwb.m200296J((Collection) CoreModule.f17545c.f19645g0.m31820L6().m221515e().second));
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.dmk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f86953a.m180009I0((NetworkInfo) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19645g0.m31811H8()).subscribe(mkd0.m154956H(new e30() { // from class: l.emk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f92222a.m180005E0((NotificationCounter) obj);
            }
        }, new e30() { // from class: l.lmk
            @Override // p149l.e30
            public final void call(Object obj) {
                rmk.m179995p0((Throwable) obj);
            }
        }));
        CoreModule.f17545c.f19645g0.m31849U8();
        m180015R0();
        if (CoreModule.m29935P().m94658i().mo158468x2()) {
            lifecycle().filter(new w9j() { // from class: l.mmk
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4319c) obj) == C4319c.f15553n);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.nmk
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f139631a.m180006F0((C4319c) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public /* synthetic */ void m179983J0(Bundle bundle) {
        ((zmk) this.viewModel).m219363r();
        m179982C0();
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m179984e0(Throwable th) {
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m179988i0(Throwable th) {
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ void m179995p0(Throwable th) {
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m179996q0(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ void m179998s0(Throwable th) {
    }

    /* JADX INFO: renamed from: A0 */
    public boolean m180003A0() {
        return NullChecker.m81303a(this.f160102a) && !TextUtils.isEmpty(this.f160102a.next);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m180004D0(roj0 roj0Var) {
        ((zmk) this.viewModel).m219362p();
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m180005E0(NotificationCounter notificationCounter) {
        ((zmk) this.viewModel).m219364s(notificationCounter);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m180006F0(C4319c c4319c) {
        if (NullChecker.m81303a(this.f160103b)) {
            CoreModule.f17545c.f19645g0.m31882f9(this.f160103b);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m180007G0(Pair pair) {
        this.f160102a = (Links) pair.first;
        ((zmk) this.viewModel).m219359l((List) pair.second);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m180008H0(List list) {
        if (CoreModule.m29935P().m94658i().mo158468x2()) {
            if (vwb.m200296J(list)) {
                this.f160103b = null;
            } else {
                this.f160103b = (GroupTab) list.get(0);
            }
        }
        ((zmk) this.viewModel).m219360m(list);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m180009I0(NetworkInfo networkInfo) {
        ((zmk) this.viewModel).m219361n(true);
        m180013P0();
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m180010L0(roj0 roj0Var) {
        ((zmk) this.viewModel).m219361n(false);
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m180011N0(Throwable th) {
        lsi0.m151578h(R$string.f20719B2);
        ((zmk) this.viewModel).m219361n(false);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m180012O0(GroupTab groupTab, View view) {
        C4736e c4736e = CoreModule.f17545c.f19645g0;
        GroupTab groupTabM31891i9 = c4736e.m31891i9();
        if (groupTabM31891i9 == null || groupTabM31891i9.f20407id != groupTab.f20407id) {
            o6j0.m162859c("e_group_chat_type_tab", pageId(), o6j0.C18854a.m162878h("group_chat_type", groupTab.name));
            c4736e.m31882f9(groupTab);
            ((zmk) this.viewModel).m219359l(Collections.EMPTY_LIST);
            ((zmk) this.viewModel).m219361n(true);
            m180013P0();
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m180013P0() {
        duringCreated(CoreModule.f17545c.f19645g0.m31914q6()).subscribe(mkd0.m154956H(new e30() { // from class: l.imk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113941a.m180010L0((roj0) obj);
            }
        }, new e30() { // from class: l.jmk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f118689a.m180011N0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q0 */
    public void m180014Q0(GroupTabItemView groupTabItemView, final GroupTab groupTab) {
        xdl0.m208329E0(groupTabItemView, new View.OnClickListener() { // from class: l.fmk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98306a.m180012O0(groupTab, view);
            }
        });
    }

    /* JADX INFO: renamed from: R0 */
    public void m180015R0() {
        if (((zmk) this.viewModel).m219358i()) {
            o6j0.m162864h("e_group_notice_red_number_bubble", pageId(), new o6j0.C18854a[0]);
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.ylk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198901a.m179983J0((Bundle) obj);
            }
        });
    }

    public String pageId() {
        return "p_group_chat_square";
    }

    /* JADX INFO: renamed from: r */
    public void m180016r() {
        Object obj;
        Pair<Links, List<ChatGroup>> pairM221515e = CoreModule.f17545c.f19645g0.m31820L6().m221515e();
        if (pairM221515e == null || (obj = pairM221515e.first) == null || TextUtils.isEmpty(((Links) obj).next)) {
            return;
        }
        Links links = (Links) pairM221515e.first;
        this.f160102a = links;
        duringCreated(CoreModule.f17545c.f19645g0.m31917r6(links.next)).subscribe(mkd0.m154956H(new e30() { // from class: l.gmk
            @Override // p149l.e30
            public final void call(Object obj2) {
                rmk.m179996q0((roj0) obj2);
            }
        }, new e30() { // from class: l.hmk
            @Override // p149l.e30
            public final void call(Object obj2) {
                lsi0.m151578h(R$string.f20719B2);
            }
        }));
    }

    /* JADX INFO: renamed from: z0 */
    public void m180017z0() {
        act().startActivity(tbk.m187860g(act()));
        o6j0.m162859c("e_group_notice_entrance", pageId(), o6j0.C18854a.m162876f("is_red_bubble", ((zmk) this.viewModel).m219358i() ? 1 : 0));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
