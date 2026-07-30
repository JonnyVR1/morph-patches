package p149l;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.data.UserTagData;
import com.p046p1.mobile.putong.core.data.UserTagsData;
import com.p046p1.mobile.putong.core.p053ui.profile.views.FlowTagsView;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p147v.VImage;
import p147v.VLinear;
import p147v.VListCell;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class yj90 extends noa0 {

    /* JADX INFO: renamed from: A */
    public VLinear f198601A;

    /* JADX INFO: renamed from: B */
    public VImage f198602B;

    /* JADX INFO: renamed from: C */
    public VText f198603C;

    /* JADX INFO: renamed from: D */
    public VText f198604D;

    /* JADX INFO: renamed from: E */
    public ConstraintLayout f198605E;

    /* JADX INFO: renamed from: F */
    public VText f198606F;

    /* JADX INFO: renamed from: G */
    public VText f198607G;

    /* JADX INFO: renamed from: H */
    public VText f198608H;

    /* JADX INFO: renamed from: I */
    public c40 f198609I;

    /* JADX INFO: renamed from: u */
    public VLinear f198610u;

    /* JADX INFO: renamed from: v */
    public VText f198611v;

    /* JADX INFO: renamed from: w */
    public VImage f198612w;

    /* JADX INFO: renamed from: x */
    public FlowTagsView f198613x;

    /* JADX INFO: renamed from: y */
    public VLinear f198614y;

    /* JADX INFO: renamed from: z */
    public VText f198615z;

    /* JADX INFO: renamed from: l.yj90$a */
    public class ViewOnClickListenerC21418a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ UserTagData f198616a;

        /* JADX INFO: renamed from: l.yj90$a$a */
        public class a implements c40.InterfaceC16059d {
            public a() {
            }

            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                List<String> listM182842z = sa40.m182802o().m182842z();
                if (!vwb.m200296J(listM182842z)) {
                    listM182842z.remove(ViewOnClickListenerC21418a.this.f198616a.f20527id);
                    sa40.m182802o().m182822T(listM182842z);
                    yj90.this.mo52731t();
                    if (upa.m194665L3() && listM182842z.size() == 0) {
                        yj90.this.mo52800O().mo51067J3();
                    }
                }
                yj90.this.f198609I.m105113b();
            }
        }

        public ViewOnClickListenerC21418a(UserTagData userTagData) {
            this.f198616a = userTagData;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m215062b(View view) {
            yj90.this.f198609I.m105113b();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!upa.m194665L3()) {
                sa40.m182802o().m182806D(yj90.this.mo52800O().mo51066J1(), 3001, "p_edit_profile_view", true);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add("删除标签");
            c40.C16057b c16057b = new c40.C16057b(yj90.this.mo52800O().act());
            yj90.this.f198609I = c16057b.m105156I("取消").m105168U(new View.OnClickListener() { // from class: l.xj90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f193191a.m215062b(view2);
                }
            }).m105164Q(arrayList).m105163P(eqh0.m117752c(3)).m105169V(new a()).m105153F();
            yj90.this.f198609I.m105117f();
        }
    }

    public yj90(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: g0 */
    private void m215053g0() {
        PutongAct putongAct = (PutongAct) this.f198613x.getContext();
        User userM94569i2 = mo52800O().m94569i2();
        UserTagsData userTagsDataM182839w = upa.m194665L3() ? sa40.m182802o().m182839w(userM94569i2) : sa40.m182802o().m182803A(putongAct, userM94569i2, true);
        if (!NullChecker.m81303a(userTagsDataM182839w) || vwb.m200296J(userTagsDataM182839w.tags)) {
            xdl0.m208344M(this.f198613x, false);
            xdl0.m208344M(this.f198614y, true);
            xdl0.m208344M(this.f198601A, false);
            xdl0.m208344M(this.f198612w, false);
        } else {
            xdl0.m208344M(this.f198613x, true);
            xdl0.m208344M(this.f198614y, false);
            xdl0.m208344M(this.f198601A, false);
            xdl0.m208344M(this.f198612w, true);
            this.f198613x.setMaxLines(3);
            this.f198613x.setCallBack(new FlowTagsView.InterfaceC8742a() { // from class: l.wj90
                @Override // com.p046p1.mobile.putong.core.p053ui.profile.views.FlowTagsView.InterfaceC8742a
                /* JADX INFO: renamed from: a */
                public final void mo52914a() {
                    this.f186621a.m215054h0();
                }
            });
            this.f198613x.setTags(m160404U(userTagsDataM182839w));
        }
        if (upa.m194665L3() && NullChecker.m81303a(userTagsDataM182839w) && !vwb.m200296J(userTagsDataM182839w.tags)) {
            this.f198601A.setBackgroundResource(x2c0.f189320F6);
            this.f198602B.setBackgroundResource(x2c0.f189585Nm);
            xdl0.m208344M(this.f198604D, true);
            this.f198604D.setText("共" + userTagsDataM182839w.tags.size() + "个");
        } else {
            xdl0.m208344M(this.f198604D, false);
        }
        if (!upa.m194665L3()) {
            xdl0.m208344M(this.f198605E, false);
        } else if (vwb.m200296J(sa40.m182802o().m182838v(userM94569i2)) || userM94569i2.pictures.size() >= 9) {
            xdl0.m208344M(this.f198605E, false);
        } else {
            xdl0.m208344M(this.f198605E, true);
            o6j0.m162864h("e_tag_add_photo_guidance", "p_edit_profile_view", new o6j0.C18854a[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m215054h0() {
        if (xdl0.m208349O0(this.f198601A) || upa.m194665L3()) {
            return;
        }
        xdl0.m208344M(this.f198601A, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m215055i0(View view) {
        sa40.m182802o().m182810H(mo52800O().mo51066J1(), 3001, mo52800O().mo51069K2(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m215056j0(View view) {
        o6j0.m162859c("e_tag_add_photo_guidance", "p_edit_profile_view", new o6j0.C18854a[0]);
        sth0.m185950b().m185954e(mo52800O().m94569i2().mo223809clone());
        qth0.m176454M((PutongAct) this.f198613x.getContext(), false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m215057k0(View view) {
        sa40.m182802o().m182806D(mo52800O().mo51066J1(), 3001, "p_edit_profile_view", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m215058l0(View view) {
        sa40.m182802o().m182806D(mo52800O().mo51066J1(), 3001, "p_edit_profile_view", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m215059m0(View view) {
        sa40.m182802o().m182809G(mo52800O().mo51066J1(), 3001, mo52800O().mo51069K2(), true);
    }

    @Override // p149l.noa0
    /* JADX INFO: renamed from: T */
    public View mo160403T(UserTagsData userTagsData, UserTagData userTagData) {
        View viewMo160403T = super.mo160403T(userTagsData, userTagData);
        xdl0.m208329E0(viewMo160403T, new ViewOnClickListenerC21418a(userTagData));
        return viewMo160403T;
    }

    /* JADX INFO: renamed from: f0 */
    public View m215060f0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return zj90.m219087b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        VText vText = this.f198611v;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f198603C.setTypeface(typeface);
        this.f198615z.setTypeface(typeface);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        UserTagsData userTagsDataM182839w;
        User userM94569i2 = mo52800O().m94569i2();
        if (upa.m194665L3() && NullChecker.m81303a(userM94569i2) && (userTagsDataM182839w = sa40.m182802o().m182839w(userM94569i2)) != null) {
            vwb.m200296J(userTagsDataM182839w.tags);
        }
        return false;
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        return m215060f0(mo52800O().mo94568H2(), viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        if (NullChecker.m81303a(this.f198613x) && (this.f198613x.getContext() instanceof PutongAct)) {
            m215053g0();
            boolean zM194665L3 = upa.m194665L3();
            VLinear vLinear = this.f198610u;
            if (zM194665L3) {
                xdl0.m208329E0(vLinear, new View.OnClickListener() { // from class: l.rj90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f159659a.m215055i0(view);
                    }
                });
                xdl0.m208329E0(this.f198605E, new View.OnClickListener() { // from class: l.sj90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f164816a.m215056j0(view);
                    }
                });
            } else {
                xdl0.m208329E0(vLinear, new View.OnClickListener() { // from class: l.tj90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f170660a.m215057k0(view);
                    }
                });
                xdl0.m208329E0(this.f198614y, new View.OnClickListener() { // from class: l.uj90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f176748a.m215058l0(view);
                    }
                });
                xdl0.m208329E0(this.f198601A, new View.OnClickListener() { // from class: l.vj90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f181669a.m215059m0(view);
                    }
                });
            }
        }
    }
}
