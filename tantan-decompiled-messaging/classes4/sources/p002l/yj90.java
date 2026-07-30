package p002l;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.p001ui.profile.views.FlowTagsView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.data.UserTagData;
import com.p1.mobile.putong.core.data.UserTagsData;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.c40;
import l.eqh0;
import l.mcr;
import l.o6j0;
import l.sth0;
import l.upa;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.zj90;
import org.jetbrains.annotations.NotNull;
import v.VImage;
import v.VLinear;
import v.VListCell;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class yj90 extends noa0 {

    /* JADX INFO: renamed from: A */
    public VLinear f22918A;

    /* JADX INFO: renamed from: B */
    public VImage f22919B;

    /* JADX INFO: renamed from: C */
    public VText f22920C;

    /* JADX INFO: renamed from: D */
    public VText f22921D;

    /* JADX INFO: renamed from: E */
    public ConstraintLayout f22922E;

    /* JADX INFO: renamed from: F */
    public VText f22923F;

    /* JADX INFO: renamed from: G */
    public VText f22924G;

    /* JADX INFO: renamed from: H */
    public VText f22925H;

    /* JADX INFO: renamed from: I */
    public c40 f22926I;

    /* JADX INFO: renamed from: u */
    public VLinear f22927u;

    /* JADX INFO: renamed from: v */
    public VText f22928v;

    /* JADX INFO: renamed from: w */
    public VImage f22929w;

    /* JADX INFO: renamed from: x */
    public FlowTagsView f22930x;

    /* JADX INFO: renamed from: y */
    public VLinear f22931y;

    /* JADX INFO: renamed from: z */
    public VText f22932z;

    /* JADX INFO: renamed from: l.yj90$a */
    public class ViewOnClickListenerC0921a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ UserTagData f22933a;

        /* JADX INFO: renamed from: l.yj90$a$a */
        public class a implements c40.d {
            public a() {
            }

            /* JADX INFO: renamed from: a */
            public void m26773a(VListCell vListCell, VListCell.a aVar, int i) {
                List<String> listM22310z = sa40.m22270o().m22310z();
                if (!vwb.J(listM22310z)) {
                    listM22310z.remove(ViewOnClickListenerC0921a.this.f22933a.id);
                    sa40.m22270o().m22290T(listM22310z);
                    yj90.this.mo3282t();
                    if (upa.L3() && listM22310z.size() == 0) {
                        yj90.this.mo3351O().mo1515J3();
                    }
                }
                yj90.this.f22926I.b();
            }
        }

        public ViewOnClickListenerC0921a(UserTagData userTagData) {
            this.f22933a = userTagData;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m26772b(View view) {
            yj90.this.f22926I.b();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!upa.L3()) {
                sa40.m22270o().m22274D(yj90.this.mo3351O().mo1514J1(), 3001, "p_edit_profile_view", true);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add("删除标签");
            c40.b bVar = new c40.b(yj90.this.mo3351O().act());
            yj90.this.f22926I = bVar.I("取消").U(new View.OnClickListener() { // from class: l.xj90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f22314a.m26772b(view2);
                }
            }).Q(arrayList).P(eqh0.c(3)).V(new a()).F();
            yj90.this.f22926I.f();
        }
    }

    public yj90(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: g0 */
    private void m26763g0() {
        Act act = (PutongAct) this.f22930x.getContext();
        User userM9268i2 = mo3351O().m9268i2();
        UserTagsData userTagsDataM22307w = upa.L3() ? sa40.m22270o().m22307w(userM9268i2) : sa40.m22270o().m22271A(act, userM9268i2, true);
        if (!NullChecker.a(userTagsDataM22307w) || vwb.J(userTagsDataM22307w.tags)) {
            xdl0.M(this.f22930x, false);
            xdl0.M(this.f22931y, true);
            xdl0.M(this.f22918A, false);
            xdl0.M(this.f22929w, false);
        } else {
            xdl0.M(this.f22930x, true);
            xdl0.M(this.f22931y, false);
            xdl0.M(this.f22918A, false);
            xdl0.M(this.f22929w, true);
            this.f22930x.setMaxLines(3);
            this.f22930x.setCallBack(new FlowTagsView.InterfaceC0167a() { // from class: l.wj90
                @Override // com.p000p1.mobile.putong.core.p001ui.profile.views.FlowTagsView.InterfaceC0167a
                /* JADX INFO: renamed from: a */
                public final void mo3469a() {
                    this.f21801a.m26764h0();
                }
            });
            this.f22930x.setTags(m18878U(userTagsDataM22307w));
        }
        if (upa.L3() && NullChecker.a(userTagsDataM22307w) && !vwb.J(userTagsDataM22307w.tags)) {
            this.f22918A.setBackgroundResource(x2c0.F6);
            this.f22919B.setBackgroundResource(x2c0.Nm);
            xdl0.M(this.f22921D, true);
            this.f22921D.setText("共" + userTagsDataM22307w.tags.size() + "个");
        } else {
            xdl0.M(this.f22921D, false);
        }
        if (!upa.L3()) {
            xdl0.M(this.f22922E, false);
        } else if (vwb.J(sa40.m22270o().m22306v(userM9268i2)) || userM9268i2.pictures.size() >= 9) {
            xdl0.M(this.f22922E, false);
        } else {
            xdl0.M(this.f22922E, true);
            o6j0.h("e_tag_add_photo_guidance", "p_edit_profile_view", new o6j0.a[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m26764h0() {
        if (xdl0.O0(this.f22918A) || upa.L3()) {
            return;
        }
        xdl0.M(this.f22918A, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m26765i0(View view) {
        sa40.m22270o().m22278H(mo3351O().mo1514J1(), 3001, mo3351O().mo1517K2(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m26766j0(View view) {
        o6j0.c("e_tag_add_photo_guidance", "p_edit_profile_view", new o6j0.a[0]);
        sth0.b().e(mo3351O().m9268i2().clone());
        qth0.m21547M(this.f22930x.getContext(), false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m26767k0(View view) {
        sa40.m22270o().m22274D(mo3351O().mo1514J1(), 3001, "p_edit_profile_view", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m26768l0(View view) {
        sa40.m22270o().m22274D(mo3351O().mo1514J1(), 3001, "p_edit_profile_view", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m26769m0(View view) {
        sa40.m22270o().m22277G(mo3351O().mo1514J1(), 3001, mo3351O().mo1517K2(), true);
    }

    @Override // p002l.noa0
    /* JADX INFO: renamed from: T */
    public View mo18877T(UserTagsData userTagsData, UserTagData userTagData) {
        View viewMo18877T = super.mo18877T(userTagsData, userTagData);
        xdl0.E0(viewMo18877T, new ViewOnClickListenerC0921a(userTagData));
        return viewMo18877T;
    }

    /* JADX INFO: renamed from: f0 */
    public View m26770f0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return zj90.b(this, layoutInflater, viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        VText vText = this.f22928v;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f22920C.setTypeface(typeface);
        this.f22932z.setTypeface(typeface);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        UserTagsData userTagsDataM22307w;
        User userM9268i2 = mo3351O().m9268i2();
        if (upa.L3() && NullChecker.a(userM9268i2) && (userTagsDataM22307w = sa40.m22270o().m22307w(userM9268i2)) != null) {
            vwb.J(userTagsDataM22307w.tags);
        }
        return false;
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        return m26770f0(mo3351O().mo9267H2(), viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        if (NullChecker.a(this.f22930x) && (this.f22930x.getContext() instanceof PutongAct)) {
            m26763g0();
            boolean zL3 = upa.L3();
            VLinear vLinear = this.f22927u;
            if (zL3) {
                xdl0.E0(vLinear, new View.OnClickListener() { // from class: l.rj90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f18565a.m26765i0(view);
                    }
                });
                xdl0.E0(this.f22922E, new View.OnClickListener() { // from class: l.sj90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f19055a.m26766j0(view);
                    }
                });
            } else {
                xdl0.E0(vLinear, new View.OnClickListener() { // from class: l.tj90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f20276a.m26767k0(view);
                    }
                });
                xdl0.E0(this.f22931y, new View.OnClickListener() { // from class: l.uj90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f20673a.m26768l0(view);
                    }
                });
                xdl0.E0(this.f22918A, new View.OnClickListener() { // from class: l.vj90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f21187a.m26769m0(view);
                    }
                });
            }
        }
    }
}
