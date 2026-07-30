package p153l;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.UserTagData;
import com.p051p1.mobile.putong.core.data.UserTagsData;
import com.p051p1.mobile.putong.core.p058ui.profile.views.FlowTagsView;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;
import p151v.VFrame;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class xwa0 extends rwa0 {

    /* JADX INFO: renamed from: A */
    public UserTagsData f196475A;

    /* JADX INFO: renamed from: u */
    public VText f196476u;

    /* JADX INFO: renamed from: v */
    public VText f196477v;

    /* JADX INFO: renamed from: w */
    public FlowTagsView f196478w;

    /* JADX INFO: renamed from: x */
    public VFrame f196479x;

    /* JADX INFO: renamed from: y */
    public boolean f196480y;

    /* JADX INFO: renamed from: z */
    public boolean f196481z;

    public xwa0(@NonNull @NotNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
        this.f196480y = false;
        this.f196481z = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m213337f0() {
        if (bnl0.m105529O0(this.f196477v)) {
            return;
        }
        bnl0.m105524M(this.f196477v, true);
    }

    @Override // p153l.rwa0
    /* JADX INFO: renamed from: T */
    public View mo112170T(UserTagsData userTagsData, UserTagData userTagData) {
        View viewMo112170T = super.mo112170T(userTagsData, userTagData);
        if (mo53983O().mo52258P1() || !userTagData.highlighted) {
            bnl0.m105501A0(mo53983O().getContext(), viewMo112170T, dbc0.f87649zn);
            return viewMo112170T;
        }
        bnl0.m105501A0(mo53983O().getContext(), viewMo112170T, dbc0.f86000An);
        return viewMo112170T;
    }

    /* JADX INFO: renamed from: c0 */
    public View m213338c0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ywa0.m217588b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m213339d0(UserTagsData userTagsData, int i) {
        bnl0.m105524M(this.f196477v, false);
        this.f196478w.setMaxLines(i);
        this.f196478w.setCallBack(new FlowTagsView.InterfaceC8905a() { // from class: l.vwa0
            @Override // com.p051p1.mobile.putong.core.p058ui.profile.views.FlowTagsView.InterfaceC8905a
            /* JADX INFO: renamed from: a */
            public final void mo54097a() {
                this.f186118a.m213337f0();
            }
        });
        FlowTagsView flowTagsView = this.f196478w;
        flowTagsView.f34968f = true;
        flowTagsView.setTags(m183349U(userTagsData));
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m213340e0(uxj0 uxj0Var) {
        UserTagsData userTagsDataM130416A = gj40.m130415o().m130416A(mo53983O().act(), mo53983O().mo52252K2(), mo53983O().mo53313N2());
        if (!NullChecker.m82486a(userTagsDataM130416A) || jyb.m147479J(userTagsDataM130416A.tags)) {
            this.f196481z = true;
        } else {
            this.f196481z = false;
            this.f196480y = userTagsDataM130416A.clickable;
            m213339d0(userTagsDataM130416A, 3);
        }
        mo53983O().mo52250J3();
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m213341g0(User user, View view) {
        m183350V(false);
        gj40.m130415o().m130422G(mo53983O().mo52249J1(), 3001, user, mo53983O().mo53313N2());
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m213342h0(UserTagsData userTagsData) {
        for (int i = 0; i < this.f196478w.getChildCount() && NullChecker.m82486a(userTagsData) && !jyb.m147479J(userTagsData.tags) && i < userTagsData.tags.size(); i++) {
            m183351W(userTagsData, userTagsData.tags.get(i), true);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m213343i0() {
        if (NullChecker.m82486a(mo53983O().act())) {
            C4499d.m21895l().m21899k("bubble_new_tag_click_guide");
            C4496a c4496a = new C4496a(mo53983O().act());
            c4496a.m21870l(qa00.m175859d(7.0f)).m21852H(qa00.m175859d(10.0f), qa00.m175859d(10.0f), qa00.m175859d(10.0f), qa00.m175859d(10.0f)).m21851G(c9c0.f80412e).m21869k(-98787).m21873p(75).m21854J(13.0f).m21860b(3000L).m21848D("点击看看还有谁添加了这个标签，\n遇见有共鸣的".concat(mo53983O().mo52252K2().isFemale() ? "她" : "他")).m21845A(this.f196479x).m21874q(C4496a.f16403R | C4496a.f16402Q).m21855K(0).m21879v(qa00.f156328o).m21881x(-qa00.m175859d(8.0f));
            C4499d c4499dM21895l = C4499d.m21895l();
            boolean zM82486a = NullChecker.m82486a(this.f196478w.getChildAt(0));
            FlowTagsView flowTagsView = this.f196478w;
            FlowTagsView childAt = flowTagsView;
            if (zM82486a) {
                childAt = flowTagsView.getChildAt(0);
            }
            c4499dM21895l.m21908u(c4496a, childAt, "bubble_new_tag_click_guide");
        }
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        VText vText = this.f196476u;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f196477v.setTypeface(typeface);
        mo53983O().act().duringCreated(gj40.m130415o().f104572j.take(2)).subscribe(psd0.m173596G(new y20() { // from class: l.uwa0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181251a.m213340e0((uxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public final void m213344j0(final UserTagsData userTagsData) {
        l51.m152888H(this.f196478w.getContext(), new Runnable() { // from class: l.wwa0
            @Override // java.lang.Runnable
            public final void run() {
                this.f191256a.m213342h0(userTagsData);
            }
        }, 100L);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        return false;
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        return m213338c0(mo53983O().mo146493H2(), viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        final User userMo52252K2 = mo53983O().mo52252K2();
        if (NullChecker.m82486a(this.f196478w) && (this.f196478w.getContext() instanceof PutongAct)) {
            UserTagsData userTagsDataM130416A = gj40.m130415o().m130416A((PutongAct) this.f196478w.getContext(), userMo52252K2, mo53983O().mo53313N2());
            this.f196475A = userTagsDataM130416A;
            if (NullChecker.m82486a(userTagsDataM130416A)) {
                this.f196480y = this.f196475A.clickable;
            }
            m213339d0(this.f196475A, 3);
            bnl0.m105509E0(this.f196477v, new View.OnClickListener() { // from class: l.swa0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f170934a.m213341g0(userMo52252K2, view);
                }
            });
            if (NullChecker.m82486a(this.f196475A) && this.f196475A.clickable && CoreModule.f18264c.f20381e0.f89160X1.get().booleanValue()) {
                bnl0.m105524M(this.f196479x, true);
                l51.m152888H(mo53983O().act(), new Runnable() { // from class: l.twa0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f176390a.m213343i0();
                    }
                }, 1000L);
                CoreModule.f18264c.f20381e0.f89160X1.put(Boolean.FALSE);
            }
            m183350V(true);
            m213344j0(this.f196475A);
        }
    }
}
