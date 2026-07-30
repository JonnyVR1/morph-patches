package p009l;

import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.p000p1.mobile.putong.core.newui.group.GroupTabItemView;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.e;
import com.p1.mobile.putong.core.data.GroupTab;
import com.p1.mobile.putong.core.data.NotificationCounter;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.Links;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import l.e30;
import l.jo0;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.o6j0;
import l.roj0;
import l.tbk;
import l.vwb;
import l.w9j;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class rmk extends jq2<zmk> {

    /* JADX INFO: renamed from: a */
    public Links f19910a;

    /* JADX INFO: renamed from: b */
    public GroupTab f19911b;

    public rmk(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: C0 */
    private void m21700C0() {
        duringCreated(CoreModule.c.g0.A6()).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.kmk
            public final void call(Object obj) {
                this.f15768a.m21722D0((roj0) obj);
            }
        }, new e30() { // from class: l.omk
            public final void call(Object obj) {
                rmk.m21706i0((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.c.g0.L6()).subscribe(mkd0.H(new e30() { // from class: l.pmk
            public final void call(Object obj) {
                this.f18789a.m21725G0((Pair) obj);
            }
        }, new e30() { // from class: l.qmk
            public final void call(Object obj) {
                rmk.m21702e0((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.c.g0.f7()).distinctUntilChanged().subscribe(mkd0.H(new e30() { // from class: l.zlk
            public final void call(Object obj) {
                this.f23732a.m21726H0((List) obj);
            }
        }, new e30() { // from class: l.amk
            public final void call(Object obj) {
                rmk.m21716s0((Throwable) obj);
            }
        }));
        if (CoreModule.c.g0.L6().e() == null || ((Pair) CoreModule.c.g0.L6().e()).second == null || ((List) ((Pair) CoreModule.c.g0.L6().e()).second).isEmpty() || CoreModule.P().i().x2()) {
            ((zmk) ((jq2) this).viewModel).m25860f();
            ((zmk) ((jq2) this).viewModel).m25865n(true);
            m21731P0();
        }
        duringCreated(ConnectivityReceiver.m()).skip(1).filter(new w9j() { // from class: l.bmk
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.g());
            }
        }).filter(new w9j() { // from class: l.cmk
            public final Object call(Object obj) {
                return Boolean.valueOf(CoreModule.c.g0.L6().e() == null || vwb.J((Collection) ((Pair) CoreModule.c.g0.L6().e()).second));
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.dmk
            public final void call(Object obj) {
                this.f11908a.m21727I0((NetworkInfo) obj);
            }
        }));
        duringCreated(CoreModule.c.g0.H8()).subscribe(mkd0.H(new e30() { // from class: l.emk
            public final void call(Object obj) {
                this.f12605a.m21723E0((NotificationCounter) obj);
            }
        }, new e30() { // from class: l.lmk
            public final void call(Object obj) {
                rmk.m21713p0((Throwable) obj);
            }
        }));
        CoreModule.c.g0.U8();
        m21733R0();
        if (CoreModule.P().i().x2()) {
            lifecycle().filter(new w9j() { // from class: l.mmk
                public final Object call(Object obj) {
                    return Boolean.valueOf(((c) obj) == c.n);
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.nmk
                public final void call(Object obj) {
                    this.f17577a.m21724F0((c) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public /* synthetic */ void m21701J0(Bundle bundle) {
        ((zmk) ((jq2) this).viewModel).m25868r();
        m21700C0();
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m21702e0(Throwable th) {
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m21706i0(Throwable th) {
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ void m21713p0(Throwable th) {
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m21714q0(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ void m21716s0(Throwable th) {
    }

    /* JADX INFO: renamed from: A0 */
    public boolean m21721A0() {
        return NullChecker.a(this.f19910a) && !TextUtils.isEmpty(this.f19910a.next);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m21722D0(roj0 roj0Var) {
        ((zmk) ((jq2) this).viewModel).m25866p();
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m21723E0(NotificationCounter notificationCounter) {
        ((zmk) ((jq2) this).viewModel).m25869s(notificationCounter);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m21724F0(c cVar) {
        if (NullChecker.a(this.f19911b)) {
            CoreModule.c.g0.f9(this.f19911b);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m21725G0(Pair pair) {
        this.f19910a = (Links) pair.first;
        ((zmk) ((jq2) this).viewModel).m25863l((List) pair.second);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m21726H0(List list) {
        if (CoreModule.P().i().x2()) {
            if (vwb.J(list)) {
                this.f19911b = null;
            } else {
                this.f19911b = (GroupTab) list.get(0);
            }
        }
        ((zmk) ((jq2) this).viewModel).m25864m(list);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m21727I0(NetworkInfo networkInfo) {
        ((zmk) ((jq2) this).viewModel).m25865n(true);
        m21731P0();
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m21728L0(roj0 roj0Var) {
        ((zmk) ((jq2) this).viewModel).m25865n(false);
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m21729N0(Throwable th) {
        lsi0.h(R.string.B2);
        ((zmk) ((jq2) this).viewModel).m25865n(false);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m21730O0(GroupTab groupTab, View view) {
        e eVar = CoreModule.c.g0;
        GroupTab groupTabI9 = eVar.i9();
        if (groupTabI9 == null || groupTabI9.id != groupTab.id) {
            o6j0.c("e_group_chat_type_tab", pageId(), new o6j0.a[]{o6j0.a.h("group_chat_type", groupTab.name)});
            eVar.f9(groupTab);
            ((zmk) ((jq2) this).viewModel).m25863l(Collections.EMPTY_LIST);
            ((zmk) ((jq2) this).viewModel).m25865n(true);
            m21731P0();
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m21731P0() {
        duringCreated(CoreModule.c.g0.q6()).subscribe(mkd0.H(new e30() { // from class: l.imk
            public final void call(Object obj) {
                this.f14709a.m21728L0((roj0) obj);
            }
        }, new e30() { // from class: l.jmk
            public final void call(Object obj) {
                this.f15227a.m21729N0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q0 */
    public void m21732Q0(GroupTabItemView groupTabItemView, final GroupTab groupTab) {
        xdl0.E0(groupTabItemView, new View.OnClickListener() { // from class: l.fmk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13092a.m21730O0(groupTab, view);
            }
        });
    }

    /* JADX INFO: renamed from: R0 */
    public void m21733R0() {
        if (((zmk) ((jq2) this).viewModel).m25861i()) {
            o6j0.h("e_group_notice_red_number_bubble", pageId(), new o6j0.a[0]);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m21734a0() {
        super.a0();
        creates(new e30() { // from class: l.ylk
            public final void call(Object obj) {
                this.f23140a.m21701J0((Bundle) obj);
            }
        });
    }

    public String pageId() {
        return "p_group_chat_square";
    }

    /* JADX INFO: renamed from: r */
    public void m21735r() {
        Object obj;
        Pair pair = (Pair) CoreModule.c.g0.L6().e();
        if (pair == null || (obj = pair.first) == null || TextUtils.isEmpty(((Links) obj).next)) {
            return;
        }
        Links links = (Links) pair.first;
        this.f19910a = links;
        duringCreated(CoreModule.c.g0.r6(links.next)).subscribe(mkd0.H(new e30() { // from class: l.gmk
            public final void call(Object obj2) {
                rmk.m21714q0((roj0) obj2);
            }
        }, new e30() { // from class: l.hmk
            public final void call(Object obj2) {
                lsi0.h(R.string.B2);
            }
        }));
    }

    /* JADX INFO: renamed from: z0 */
    public void m21736z0() {
        act().startActivity(tbk.g(act()));
        o6j0.c("e_group_notice_entrance", pageId(), new o6j0.a[]{o6j0.a.f("is_red_bubble", ((zmk) ((jq2) this).viewModel).m25861i() ? 1 : 0)});
    }

    public void destroy() {
    }
}
