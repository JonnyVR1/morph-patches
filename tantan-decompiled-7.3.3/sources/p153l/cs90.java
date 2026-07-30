package p153l;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.data.UserTagData;
import com.p051p1.mobile.putong.core.data.UserTagsData;
import com.p051p1.mobile.putong.core.p058ui.profile.views.FlowTagsView;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p151v.VImage;
import p151v.VLinear;
import p151v.VListCell;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class cs90 extends rwa0 {

    /* JADX INFO: renamed from: A */
    public VLinear f83431A;

    /* JADX INFO: renamed from: B */
    public VImage f83432B;

    /* JADX INFO: renamed from: C */
    public VText f83433C;

    /* JADX INFO: renamed from: D */
    public VText f83434D;

    /* JADX INFO: renamed from: E */
    public ConstraintLayout f83435E;

    /* JADX INFO: renamed from: F */
    public VText f83436F;

    /* JADX INFO: renamed from: G */
    public VText f83437G;

    /* JADX INFO: renamed from: H */
    public VText f83438H;

    /* JADX INFO: renamed from: I */
    public w30 f83439I;

    /* JADX INFO: renamed from: u */
    public VLinear f83440u;

    /* JADX INFO: renamed from: v */
    public VText f83441v;

    /* JADX INFO: renamed from: w */
    public VImage f83442w;

    /* JADX INFO: renamed from: x */
    public FlowTagsView f83443x;

    /* JADX INFO: renamed from: y */
    public VLinear f83444y;

    /* JADX INFO: renamed from: z */
    public VText f83445z;

    /* JADX INFO: renamed from: l.cs90$a */
    public class ViewOnClickListenerC16350a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ UserTagData f83446a;

        /* JADX INFO: renamed from: l.cs90$a$a */
        public class a implements w30.InterfaceC21003d {
            public a() {
            }

            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                List<String> listM130455z = gj40.m130415o().m130455z();
                if (!jyb.m147479J(listM130455z)) {
                    listM130455z.remove(ViewOnClickListenerC16350a.this.f83446a.f21269id);
                    gj40.m130415o().m130435T(listM130455z);
                    cs90.this.mo53914t();
                    if (gra.m131596L3() && listM130455z.size() == 0) {
                        cs90.this.mo53983O().mo52250J3();
                    }
                }
                cs90.this.f83439I.m204614b();
            }
        }

        public ViewOnClickListenerC16350a(UserTagData userTagData) {
            this.f83446a = userTagData;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m112173b(View view) {
            cs90.this.f83439I.m204614b();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!gra.m131596L3()) {
                gj40.m130415o().m130419D(cs90.this.mo53983O().mo52249J1(), 3001, "p_edit_profile_view", true);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add("删除标签");
            w30.C21001b c21001b = new w30.C21001b(cs90.this.mo53983O().act());
            cs90.this.f83439I = c21001b.m204657I("取消").m204669U(new View.OnClickListener() { // from class: l.bs90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f78133a.m112173b(view2);
                }
            }).m204665Q(arrayList).m204664P(lyh0.m156283c(3)).m204670V(new a()).m204654F();
            cs90.this.f83439I.m204618f();
        }
    }

    public cs90(@NonNull @NotNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: renamed from: g0 */
    private void m112163g0() {
        PutongAct putongAct = (PutongAct) this.f83443x.getContext();
        User userM189086i2 = mo53983O().m189086i2();
        UserTagsData userTagsDataM130452w = gra.m131596L3() ? gj40.m130415o().m130452w(userM189086i2) : gj40.m130415o().m130416A(putongAct, userM189086i2, true);
        if (!NullChecker.m82486a(userTagsDataM130452w) || jyb.m147479J(userTagsDataM130452w.tags)) {
            bnl0.m105524M(this.f83443x, false);
            bnl0.m105524M(this.f83444y, true);
            bnl0.m105524M(this.f83431A, false);
            bnl0.m105524M(this.f83442w, false);
        } else {
            bnl0.m105524M(this.f83443x, true);
            bnl0.m105524M(this.f83444y, false);
            bnl0.m105524M(this.f83431A, false);
            bnl0.m105524M(this.f83442w, true);
            this.f83443x.setMaxLines(3);
            this.f83443x.setCallBack(new FlowTagsView.InterfaceC8905a() { // from class: l.as90
                @Override // com.p051p1.mobile.putong.core.p058ui.profile.views.FlowTagsView.InterfaceC8905a
                /* JADX INFO: renamed from: a */
                public final void mo54097a() {
                    this.f73100a.m112164h0();
                }
            });
            this.f83443x.setTags(m183349U(userTagsDataM130452w));
        }
        if (gra.m131596L3() && NullChecker.m82486a(userTagsDataM130452w) && !jyb.m147479J(userTagsDataM130452w.tags)) {
            this.f83431A.setBackgroundResource(dbc0.f86175G6);
            this.f83432B.setBackgroundResource(dbc0.f86032Bn);
            bnl0.m105524M(this.f83434D, true);
            this.f83434D.setText("共" + userTagsDataM130452w.tags.size() + "个");
        } else {
            bnl0.m105524M(this.f83434D, false);
        }
        if (!gra.m131596L3()) {
            bnl0.m105524M(this.f83435E, false);
        } else if (jyb.m147479J(gj40.m130415o().m130451v(userM189086i2)) || userM189086i2.pictures.size() >= 9) {
            bnl0.m105524M(this.f83435E, false);
        } else {
            bnl0.m105524M(this.f83435E, true);
            sfj0.m185601h("e_tag_add_photo_guidance", "p_edit_profile_view", new sfj0.C20032a[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m112164h0() {
        if (bnl0.m105529O0(this.f83431A) || gra.m131596L3()) {
            return;
        }
        bnl0.m105524M(this.f83431A, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m112165i0(View view) {
        gj40.m130415o().m130423H(mo53983O().mo52249J1(), 3001, mo53983O().mo52252K2(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m112166j0(View view) {
        sfj0.m185596c("e_tag_add_photo_guidance", "p_edit_profile_view", new sfj0.C20032a[0]);
        a2i0.m95674b().m95678e(mo53983O().m189086i2().mo225055clone());
        y1i0.m213948M((PutongAct) this.f83443x.getContext(), false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m112167k0(View view) {
        gj40.m130415o().m130419D(mo53983O().mo52249J1(), 3001, "p_edit_profile_view", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m112168l0(View view) {
        gj40.m130415o().m130419D(mo53983O().mo52249J1(), 3001, "p_edit_profile_view", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m112169m0(View view) {
        gj40.m130415o().m130422G(mo53983O().mo52249J1(), 3001, mo53983O().mo52252K2(), true);
    }

    @Override // p153l.rwa0
    /* JADX INFO: renamed from: T */
    public View mo112170T(UserTagsData userTagsData, UserTagData userTagData) {
        View viewMo112170T = super.mo112170T(userTagsData, userTagData);
        bnl0.m105509E0(viewMo112170T, new ViewOnClickListenerC16350a(userTagData));
        return viewMo112170T;
    }

    /* JADX INFO: renamed from: f0 */
    public View m112171f0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ds90.m117721b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        VText vText = this.f83441v;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f83433C.setTypeface(typeface);
        this.f83445z.setTypeface(typeface);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        UserTagsData userTagsDataM130452w;
        User userM189086i2 = mo53983O().m189086i2();
        if (gra.m131596L3() && NullChecker.m82486a(userM189086i2) && (userTagsDataM130452w = gj40.m130415o().m130452w(userM189086i2)) != null) {
            jyb.m147479J(userTagsDataM130452w.tags);
        }
        return false;
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        return m112171f0(mo53983O().mo146493H2(), viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        if (NullChecker.m82486a(this.f83443x) && (this.f83443x.getContext() instanceof PutongAct)) {
            m112163g0();
            boolean zM131596L3 = gra.m131596L3();
            VLinear vLinear = this.f83440u;
            if (zM131596L3) {
                bnl0.m105509E0(vLinear, new View.OnClickListener() { // from class: l.vr90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f185439a.m112165i0(view);
                    }
                });
                bnl0.m105509E0(this.f83435E, new View.OnClickListener() { // from class: l.wr90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f190493a.m112166j0(view);
                    }
                });
            } else {
                bnl0.m105509E0(vLinear, new View.OnClickListener() { // from class: l.xr90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f195892a.m112167k0(view);
                    }
                });
                bnl0.m105509E0(this.f83444y, new View.OnClickListener() { // from class: l.yr90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f201298a.m112168l0(view);
                    }
                });
                bnl0.m105509E0(this.f83431A, new View.OnClickListener() { // from class: l.zr90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f205747a.m112169m0(view);
                    }
                });
            }
        }
    }
}
