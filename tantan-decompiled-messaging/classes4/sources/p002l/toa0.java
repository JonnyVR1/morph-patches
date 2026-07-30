package p002l;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.views.FlowTagsView;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.UserTagData;
import com.p1.mobile.putong.core.data.UserTagsData;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.e51;
import l.mcr;
import l.mkd0;
import l.roj0;
import l.t100;
import l.uoa0;
import l.vwb;
import l.w0c0;
import l.x2c0;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import v.VFrame;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class toa0 extends noa0 {

    /* JADX INFO: renamed from: A */
    public UserTagsData f20318A;

    /* JADX INFO: renamed from: u */
    public VText f20319u;

    /* JADX INFO: renamed from: v */
    public VText f20320v;

    /* JADX INFO: renamed from: w */
    public FlowTagsView f20321w;

    /* JADX INFO: renamed from: x */
    public VFrame f20322x;

    /* JADX INFO: renamed from: y */
    public boolean f20323y;

    /* JADX INFO: renamed from: z */
    public boolean f20324z;

    public toa0(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f20323y = false;
        this.f20324z = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m23093f0() {
        if (xdl0.O0(this.f20320v)) {
            return;
        }
        xdl0.M(this.f20320v, true);
    }

    @Override // p002l.noa0
    /* JADX INFO: renamed from: T */
    public View mo18877T(UserTagsData userTagsData, UserTagData userTagData) {
        View viewMo18877T = super.mo18877T(userTagsData, userTagData);
        if (mo3351O().mo1523P1() || !userTagData.highlighted) {
            xdl0.A0(mo3351O().getContext(), viewMo18877T, x2c0.Lm);
            return viewMo18877T;
        }
        xdl0.A0(mo3351O().getContext(), viewMo18877T, x2c0.Mm);
        return viewMo18877T;
    }

    /* JADX INFO: renamed from: c0 */
    public View m23094c0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return uoa0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m23095d0(UserTagsData userTagsData, int i) {
        xdl0.M(this.f20320v, false);
        this.f20321w.setMaxLines(i);
        this.f20321w.setCallBack(new FlowTagsView.InterfaceC0167a() { // from class: l.roa0
            @Override // com.p000p1.mobile.putong.core.p001ui.profile.views.FlowTagsView.InterfaceC0167a
            /* JADX INFO: renamed from: a */
            public final void mo3469a() {
                this.f18623a.m23093f0();
            }
        });
        FlowTagsView flowTagsView = this.f20321w;
        flowTagsView.f1942f = true;
        flowTagsView.setTags(m18878U(userTagsData));
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m23096e0(roj0 roj0Var) {
        UserTagsData userTagsDataM22271A = sa40.m22270o().m22271A(mo3351O().act(), mo3351O().mo1517K2(), mo3351O().mo2659N2());
        if (!NullChecker.a(userTagsDataM22271A) || vwb.J(userTagsDataM22271A.tags)) {
            this.f20324z = true;
        } else {
            this.f20324z = false;
            this.f20323y = userTagsDataM22271A.clickable;
            m23095d0(userTagsDataM22271A, 3);
        }
        mo3351O().mo1515J3();
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m23097g0(User user, View view) {
        m18879V(false);
        sa40.m22270o().m22277G(mo3351O().mo1514J1(), 3001, user, mo3351O().mo2659N2());
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m23098h0(UserTagsData userTagsData) {
        for (int i = 0; i < this.f20321w.getChildCount() && NullChecker.a(userTagsData) && !vwb.J(userTagsData.tags) && i < userTagsData.tags.size(); i++) {
            m18880W(userTagsData, (UserTagData) userTagsData.tags.get(i), true);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m23099i0() {
        if (NullChecker.a(mo3351O().act())) {
            d.l().k("bubble_new_tag_click_guide");
            a aVar = new a(mo3351O().act());
            aVar.l(t100.d(7.0f)).H(t100.d(10.0f), t100.d(10.0f), t100.d(10.0f), t100.d(10.0f)).G(w0c0.e).k(new int[]{-98787}).p(75).J(13.0f).b(3000L).D("点击看看还有谁添加了这个标签，\n遇见有共鸣的".concat(mo3351O().mo1517K2().isFemale() ? "她" : "他")).A(this.f20322x).q(a.R | a.Q).K(0).v(t100.o).x(-t100.d(8.0f));
            d dVarL = d.l();
            boolean zA = NullChecker.a(this.f20321w.getChildAt(0));
            FlowTagsView flowTagsView = this.f20321w;
            FlowTagsView childAt = flowTagsView;
            if (zA) {
                childAt = flowTagsView.getChildAt(0);
            }
            dVarL.u(aVar, childAt, "bubble_new_tag_click_guide");
        }
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        VText vText = this.f20319u;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f20320v.setTypeface(typeface);
        mo3351O().act().duringCreated(sa40.m22270o().f18868j.take(2)).subscribe(mkd0.G(new e30() { // from class: l.qoa0
            public final void call(Object obj) {
                this.f18108a.m23096e0((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public final void m23100j0(final UserTagsData userTagsData) {
        e51.H(this.f20321w.getContext(), new Runnable() { // from class: l.soa0
            @Override // java.lang.Runnable
            public final void run() {
                this.f19144a.m23098h0(userTagsData);
            }
        }, 100L);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        return false;
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        return m23094c0(mo3351O().mo9267H2(), viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        final User userMo1517K2 = mo3351O().mo1517K2();
        if (NullChecker.a(this.f20321w) && (this.f20321w.getContext() instanceof PutongAct)) {
            UserTagsData userTagsDataM22271A = sa40.m22270o().m22271A((PutongAct) this.f20321w.getContext(), userMo1517K2, mo3351O().mo2659N2());
            this.f20318A = userTagsDataM22271A;
            if (NullChecker.a(userTagsDataM22271A)) {
                this.f20323y = this.f20318A.clickable;
            }
            m23095d0(this.f20318A, 3);
            xdl0.E0(this.f20320v, new View.OnClickListener() { // from class: l.ooa0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f16731a.m23097g0(userMo1517K2, view);
                }
            });
            if (NullChecker.a(this.f20318A) && this.f20318A.clickable && ((Boolean) CoreModule.c.e0.X1.get()).booleanValue()) {
                xdl0.M(this.f20322x, true);
                e51.H(mo3351O().act(), new Runnable() { // from class: l.poa0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f17559a.m23099i0();
                    }
                }, 1000L);
                CoreModule.c.e0.X1.put(Boolean.FALSE);
            }
            m18879V(true);
            m23100j0(this.f20318A);
        }
    }
}
