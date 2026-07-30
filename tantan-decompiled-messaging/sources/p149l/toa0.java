package p149l;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.UserTagData;
import com.p046p1.mobile.putong.core.data.UserTagsData;
import com.p046p1.mobile.putong.core.p053ui.profile.views.FlowTagsView;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;
import p147v.VFrame;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class toa0 extends noa0 {

    /* JADX INFO: renamed from: A */
    public UserTagsData f171326A;

    /* JADX INFO: renamed from: u */
    public VText f171327u;

    /* JADX INFO: renamed from: v */
    public VText f171328v;

    /* JADX INFO: renamed from: w */
    public FlowTagsView f171329w;

    /* JADX INFO: renamed from: x */
    public VFrame f171330x;

    /* JADX INFO: renamed from: y */
    public boolean f171331y;

    /* JADX INFO: renamed from: z */
    public boolean f171332z;

    public toa0(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f171331y = false;
        this.f171332z = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m189851f0() {
        if (xdl0.m208349O0(this.f171328v)) {
            return;
        }
        xdl0.m208344M(this.f171328v, true);
    }

    @Override // p149l.noa0
    /* JADX INFO: renamed from: T */
    public View mo160403T(UserTagsData userTagsData, UserTagData userTagData) {
        View viewMo160403T = super.mo160403T(userTagsData, userTagData);
        if (mo52800O().mo51075P1() || !userTagData.highlighted) {
            xdl0.m208321A0(mo52800O().getContext(), viewMo160403T, x2c0.f189523Lm);
            return viewMo160403T;
        }
        xdl0.m208321A0(mo52800O().getContext(), viewMo160403T, x2c0.f189554Mm);
        return viewMo160403T;
    }

    /* JADX INFO: renamed from: c0 */
    public View m189852c0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return uoa0.m194547b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m189853d0(UserTagsData userTagsData, int i) {
        xdl0.m208344M(this.f171328v, false);
        this.f171329w.setMaxLines(i);
        this.f171329w.setCallBack(new FlowTagsView.InterfaceC8742a() { // from class: l.roa0
            @Override // com.p046p1.mobile.putong.core.p053ui.profile.views.FlowTagsView.InterfaceC8742a
            /* JADX INFO: renamed from: a */
            public final void mo52914a() {
                this.f160374a.m189851f0();
            }
        });
        FlowTagsView flowTagsView = this.f171329w;
        flowTagsView.f34120f = true;
        flowTagsView.setTags(m160404U(userTagsData));
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m189854e0(roj0 roj0Var) {
        UserTagsData userTagsDataM182803A = sa40.m182802o().m182803A(mo52800O().act(), mo52800O().mo51069K2(), mo52800O().mo52130N2());
        if (!NullChecker.m81303a(userTagsDataM182803A) || vwb.m200296J(userTagsDataM182803A.tags)) {
            this.f171332z = true;
        } else {
            this.f171332z = false;
            this.f171331y = userTagsDataM182803A.clickable;
            m189853d0(userTagsDataM182803A, 3);
        }
        mo52800O().mo51067J3();
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m189855g0(User user, View view) {
        m160405V(false);
        sa40.m182802o().m182809G(mo52800O().mo51066J1(), 3001, user, mo52800O().mo52130N2());
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m189856h0(UserTagsData userTagsData) {
        for (int i = 0; i < this.f171329w.getChildCount() && NullChecker.m81303a(userTagsData) && !vwb.m200296J(userTagsData.tags) && i < userTagsData.tags.size(); i++) {
            m160406W(userTagsData, userTagsData.tags.get(i), true);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m189857i0() {
        if (NullChecker.m81303a(mo52800O().act())) {
            C4348d.m20896l().m20900k("bubble_new_tag_click_guide");
            C4345a c4345a = new C4345a(mo52800O().act());
            c4345a.m20871l(t100.m186890d(7.0f)).m20853H(t100.m186890d(10.0f), t100.m186890d(10.0f), t100.m186890d(10.0f), t100.m186890d(10.0f)).m20852G(w0c0.f183842e).m20870k(-98787).m20874p(75).m20855J(13.0f).m20861b(3000L).m20849D("点击看看还有谁添加了这个标签，\n遇见有共鸣的".concat(mo52800O().mo51069K2().isFemale() ? "她" : "他")).m20846A(this.f171330x).m20875q(C4345a.f15684R | C4345a.f15683Q).m20856K(0).m20880v(t100.f167266o).m20882x(-t100.m186890d(8.0f));
            C4348d c4348dM20896l = C4348d.m20896l();
            boolean zM81303a = NullChecker.m81303a(this.f171329w.getChildAt(0));
            FlowTagsView flowTagsView = this.f171329w;
            FlowTagsView childAt = flowTagsView;
            if (zM81303a) {
                childAt = flowTagsView.getChildAt(0);
            }
            c4348dM20896l.m20909u(c4345a, childAt, "bubble_new_tag_click_guide");
        }
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        VText vText = this.f171327u;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f171328v.setTypeface(typeface);
        mo52800O().act().duringCreated(sa40.m182802o().f163275j.take(2)).subscribe(mkd0.m154955G(new e30() { // from class: l.qoa0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155546a.m189854e0((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public final void m189858j0(final UserTagsData userTagsData) {
        e51.m114743H(this.f171329w.getContext(), new Runnable() { // from class: l.soa0
            @Override // java.lang.Runnable
            public final void run() {
                this.f165664a.m189856h0(userTagsData);
            }
        }, 100L);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        return false;
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        return m189852c0(mo52800O().mo94568H2(), viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        final User userMo51069K2 = mo52800O().mo51069K2();
        if (NullChecker.m81303a(this.f171329w) && (this.f171329w.getContext() instanceof PutongAct)) {
            UserTagsData userTagsDataM182803A = sa40.m182802o().m182803A((PutongAct) this.f171329w.getContext(), userMo51069K2, mo52800O().mo52130N2());
            this.f171326A = userTagsDataM182803A;
            if (NullChecker.m81303a(userTagsDataM182803A)) {
                this.f171331y = this.f171326A.clickable;
            }
            m189853d0(this.f171326A, 3);
            xdl0.m208329E0(this.f171328v, new View.OnClickListener() { // from class: l.ooa0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f144864a.m189855g0(userMo51069K2, view);
                }
            });
            if (NullChecker.m81303a(this.f171326A) && this.f171326A.clickable && CoreModule.f17545c.f19639e0.f149303X1.get().booleanValue()) {
                xdl0.m208344M(this.f171330x, true);
                e51.m114743H(mo52800O().act(), new Runnable() { // from class: l.poa0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f150497a.m189857i0();
                    }
                }, 1000L);
                CoreModule.f17545c.f19639e0.f149303X1.put(Boolean.FALSE);
            }
            m160405V(true);
            m189858j0(this.f171326A);
        }
    }
}
