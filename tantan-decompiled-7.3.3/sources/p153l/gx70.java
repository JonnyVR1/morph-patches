package p153l;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p051p1.mobile.putong.live.base.data.BLivePkInvite;
import com.p051p1.mobile.putong.live.base.data.BLivePkInviteSource;
import com.p051p1.mobile.putong.live.base.data.BLivePkSuggestAnchor;
import com.p051p1.mobile.putong.live.base.data.BLivePkSuggestAnchors;
import com.p051p1.mobile.putong.live.base.view.LiveEmptyView;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p151v.VImage;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public class gx70 extends qct<oo2> {

    /* JADX INFO: renamed from: A */
    public kcg0 f106894A;

    /* JADX INFO: renamed from: B */
    public kcg0 f106895B;

    /* JADX INFO: renamed from: C */
    public ja80 f106896C;

    /* JADX INFO: renamed from: D */
    public boolean f106897D;

    /* JADX INFO: renamed from: i */
    public View f106898i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f106899j;

    /* JADX INFO: renamed from: k */
    public VImage f106900k;

    /* JADX INFO: renamed from: l */
    public TextView f106901l;

    /* JADX INFO: renamed from: m */
    public TextView f106902m;

    /* JADX INFO: renamed from: n */
    public TextView f106903n;

    /* JADX INFO: renamed from: o */
    public TabLayout f106904o;

    /* JADX INFO: renamed from: p */
    public ViewPager f106905p;

    /* JADX INFO: renamed from: q */
    public LinearLayout f106906q;

    /* JADX INFO: renamed from: r */
    public LinearLayout f106907r;

    /* JADX INFO: renamed from: s */
    public EditText f106908s;

    /* JADX INFO: renamed from: t */
    public ImageView f106909t;

    /* JADX INFO: renamed from: u */
    public TextView f106910u;

    /* JADX INFO: renamed from: v */
    public VRecyclerView f106911v;

    /* JADX INFO: renamed from: w */
    public LiveEmptyView f106912w;

    /* JADX INFO: renamed from: x */
    public DialogC12774a f106913x;

    /* JADX INFO: renamed from: y */
    public ra80 f106914y;

    /* JADX INFO: renamed from: z */
    public boolean f106915z;

    public gx70(dum dumVar) {
        super(dumVar);
    }

    /* JADX INFO: renamed from: C4 */
    private void m132746C4() {
        this.f196919f.hideInput(this.f106908s);
        bnl0.m105524M(this.f106906q, false);
        bnl0.m105524M(this.f106899j, true);
        this.f106908s.setText("");
    }

    /* JADX INFO: renamed from: D4 */
    private void m132747D4() {
        bnl0.m105524M(this.f106906q, true);
        bnl0.m105524M(this.f106899j, false);
        psd0.m173633z(this.f106895B);
        this.f106895B = act().duringCreated(ynp0.m216923H(this.f106908s)).throttleLast(500L, TimeUnit.MILLISECONDS).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.ow70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f149458a.m132775G4((CharSequence) obj);
            }
        }));
        this.f106908s.post(new Runnable() { // from class: l.pw70
            @Override // java.lang.Runnable
            public final void run() {
                this.f154379a.m132787p4();
            }
        });
        if (this.f106896C != null) {
            return;
        }
        this.f106911v.setLayoutManager(new LinearLayoutManager(this.f196919f));
        ja80 ja80Var = new ja80(this.f196918e, BLivePkSuggestAnchors.new_(), new z20() { // from class: l.qw70
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f159870a.m132788q4((BLivePkSuggestAnchor) obj, (BLivePkInviteSource) obj2);
            }
        });
        this.f106896C = ja80Var;
        this.f106911v.setAdapter(ja80Var);
        this.f106912w.m69907d(R$string.f48038da);
        this.f106912w.m69906c(n3d0.m161277a(n9c0.f140838j1));
        this.f106912w.m69905b(obc0.f146390k4);
        this.f106896C.m68553Y(this.f106911v, this.f106912w);
        this.f106896C.m144006g0();
        bnl0.m105509E0(this.f106909t, new View.OnClickListener() { // from class: l.rw70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165119a.m132789r4(view);
            }
        });
        this.f106908s.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.sw70
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return this.f170925a.m132786o4(textView, i, keyEvent);
            }
        });
    }

    /* JADX INFO: renamed from: E4 */
    private void m132748E4() {
        duringCreated(LivingNormalApiProvider.m72440J5()).subscribe(dhw.m115826e(new y20() { // from class: l.dx70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91075a.m132790s4((List) obj);
            }
        }, new ga80()));
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m132751L3(Throwable th) {
    }

    /* JADX INFO: renamed from: j4 */
    public static View m132770j4(Act act, BLivePkSuggestAnchors bLivePkSuggestAnchors) {
        View viewInflate = act.inflater().inflate(yec0.f198948V4, (ViewGroup) null);
        viewInflate.setTag(bLivePkSuggestAnchors.type);
        ((TextView) viewInflate.findViewById(mdc0.f136007N6)).setText(bLivePkSuggestAnchors.name);
        return viewInflate;
    }

    /* JADX INFO: renamed from: k4 */
    private void m132771k4() {
        this.f106914y = new ra80(this.f196918e, new z20() { // from class: l.ex70
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f96255a.m132774F4((ja80) obj, (Pagination) obj2);
            }
        }, new z20() { // from class: l.fx70
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f101240a.m132785n4((BLivePkSuggestAnchor) obj, (BLivePkInviteSource) obj2);
            }
        });
        this.f106904o.setupWithViewPager(this.f106905p);
        this.f106905p.setOffscreenPageLimit(1);
        this.f106905p.setAdapter(this.f106914y);
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m132772A4(View view) {
        m132776H4(!this.f106915z);
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m132773B4(hct hctVar) {
        if (hctVar.f108746b) {
            m132777I4();
        } else {
            m132781h4();
        }
    }

    /* JADX INFO: renamed from: F4 */
    public final void m132774F4(final ja80 ja80Var, Pagination pagination) {
        Links links;
        if (pagination == null || (links = pagination.links) == null || TextUtils.isEmpty(links.next) || this.f106897D) {
            return;
        }
        this.f106897D = true;
        duringCreated(LivingNormalApiProvider.m72449K5(pagination)).subscribe(dhw.m115825d(new y20() { // from class: l.uw70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181243a.m132791t4(ja80Var, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G4 */
    public void m132775G4(CharSequence charSequence) {
        String strTrim = charSequence.toString().trim();
        psd0.m173633z(this.f106894A);
        if (!TextUtils.isEmpty(strTrim)) {
            this.f106894A = duringCreated(LivingNormalApiProvider.m72539U5(strTrim)).subscribe(dhw.m115829h(new y20() { // from class: l.tw70
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f176382a.m132792u4((BLivePkSuggestAnchors) obj);
                }
            }));
            return;
        }
        ja80 ja80Var = this.f106896C;
        if (ja80Var != null) {
            ja80Var.m144006g0();
        }
    }

    /* JADX INFO: renamed from: H4 */
    public void m132776H4(boolean z) {
        n180.m161093j("setPkAcceptSetting unaccept:" + z);
        duringCreated(LivingNormalApiProvider.m72433I7(z)).subscribe(dhw.m115826e(new y20() { // from class: l.nw70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143932a.m132793v4((BLiveAnchor) obj);
            }
        }, new ga80()));
        i4g0.m138523u("e_pk_refuse_invite_button", "p_anchor_live_room", pf60.m172085a("anchorId", this.f196918e.f90822h.m168526j0()), pf60.m172085a("liveId", this.f196918e.f90822h.m202191k()), pf60.m172085a("switch_type", z ? "open" : "close"));
    }

    /* JADX INFO: renamed from: I4 */
    public void m132777I4() {
        i4g0.m138520r("e_pk_start_specifiedpk", mo78457R2());
        if (this.f106913x == null) {
            this.f106913x = new c0s(this, m132779f4(act().inflater(), null));
            this.f106900k.setOnClickListener(new View.OnClickListener() { // from class: l.yw70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f201803a.m132794w4(view);
                }
            });
            this.f106898i.setOnClickListener(new View.OnClickListener() { // from class: l.zw70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f206324a.m132795x4(view);
                }
            });
            bnl0.m105509E0(this.f106903n, new View.OnClickListener() { // from class: l.ax70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f73821a.m132796y4(view);
                }
            });
            bnl0.m105509E0(this.f106910u, new View.OnClickListener() { // from class: l.bx70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f78847a.m132797z4(view);
                }
            });
            bnl0.m105509E0(this.f106902m, new View.OnClickListener() { // from class: l.cx70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f84181a.m132772A4(view);
                }
            });
        }
        m132771k4();
        m132746C4();
        m132782i4();
        m132748E4();
        this.f106913x.show();
    }

    /* JADX INFO: renamed from: J4 */
    public final void m132778J4(boolean z) {
        if (this.f106913x.isShowing()) {
            n180.m161093j("getPkAcceptSetting unaccept:" + z);
            this.f106915z = z;
            this.f106902m.setSelected(z);
            this.f106902m.setCompoundDrawablesWithIntrinsicBounds(z ? obc0.f146265a : obc0.f146063I1, 0, 0, 0);
        }
    }

    /* JADX INFO: renamed from: f4 */
    public View m132779f4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hx70.m137560b(this, layoutInflater, viewGroup);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: g4 */
    public void m132780g4(BLivePkSuggestAnchor bLivePkSuggestAnchor, BLivePkInviteSource bLivePkInviteSource, boolean z) {
        i4g0.m138523u("e_pk_invite_button", "p_anchor_live_room", pf60.m172085a("anchorId", m213810E2().m168526j0()), pf60.m172085a("liveId", m213810E2().m202191k()), pf60.m172085a("other_user_id", bLivePkSuggestAnchor.userId), pf60.m172085a("page_tab_type", bLivePkSuggestAnchor.source.toString()));
        m213811F2().LivePkEvent.createInvite().mo199273j(new ict(bLivePkSuggestAnchor.userId, bLivePkSuggestAnchor.userName, bLivePkSuggestAnchor.avatar, bLivePkInviteSource, z, new y20() { // from class: l.ww70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191160a.m132783l4((BLivePkInvite) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h4 */
    public void m132781h4() {
        EditText editText;
        Act act = this.f196919f;
        if (act != null && (editText = this.f106908s) != null) {
            act.hideInput(editText);
        }
        psd0.m173633z(this.f106894A);
        psd0.m173633z(this.f106895B);
        DialogC12774a dialogC12774a = this.f106913x;
        if (dialogC12774a == null || !dialogC12774a.isShowing()) {
            return;
        }
        this.f106913x.dismiss();
    }

    /* JADX INFO: renamed from: i4 */
    public void m132782i4() {
        duringCreated(LivingNormalApiProvider.m72772u4(zrv.f205799a.m207631D0())).subscribe(dhw.m115826e(new y20() { // from class: l.lw70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f133784a.m132784m4((BLiveAnchor) obj);
            }
        }, new y20() { // from class: l.mw70
            @Override // p153l.y20
            public final void call(Object obj) {
                gx70.m132751L3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m132783l4(BLivePkInvite bLivePkInvite) {
        m132781h4();
        if (this.f106915z) {
            m132776H4(false);
            o1j0.m165649w(fct.f98268h);
        }
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m132784m4(BLiveAnchor bLiveAnchor) {
        m132778J4(bLiveAnchor.liveSetting.unacceptPk);
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m132785n4(BLivePkSuggestAnchor bLivePkSuggestAnchor, BLivePkInviteSource bLivePkInviteSource) {
        m132780g4(bLivePkSuggestAnchor, bLivePkInviteSource, false);
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ boolean m132786o4(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        act().hideInput(this.f106908s);
        return false;
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m132787p4() {
        this.f106908s.requestFocus();
        this.f196919f.showInput(this.f106908s, 0);
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m132788q4(BLivePkSuggestAnchor bLivePkSuggestAnchor, BLivePkInviteSource bLivePkInviteSource) {
        m132780g4(bLivePkSuggestAnchor, bLivePkInviteSource, false);
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m132789r4(View view) {
        this.f106908s.setText("");
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m132790s4(List list) {
        this.f106914y.m180714u(list);
        for (int i = 0; i < list.size(); i++) {
            TabLayout.Tab tabAt = this.f106904o.getTabAt(i);
            View viewM132770j4 = m132770j4(act(), (BLivePkSuggestAnchors) list.get(i));
            if (tabAt != null) {
                tabAt.setCustomView(viewM132770j4);
            }
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().LivePkEvent.showPkDialog().m199270g()).filter(new qcj() { // from class: l.kw70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((hct) obj).f108745a == 3);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.vw70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186106a.m132773B4((hct) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m132791t4(final ja80 ja80Var, List list) {
        BLivePkSuggestAnchors bLivePkSuggestAnchors = (BLivePkSuggestAnchors) jyb.m147529r(list, new qcj() { // from class: l.xw70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ja80Var.m144009j0(((BLivePkSuggestAnchors) obj).type));
            }
        });
        if (bLivePkSuggestAnchors != null) {
            ja80Var.m144005f0(bLivePkSuggestAnchors);
        }
        this.f106897D = false;
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m132792u4(BLivePkSuggestAnchors bLivePkSuggestAnchors) {
        ja80 ja80Var = this.f106896C;
        if (ja80Var != null) {
            ja80Var.m144011l0(bLivePkSuggestAnchors);
        }
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m132793v4(BLiveAnchor bLiveAnchor) {
        m132778J4(bLiveAnchor.liveSetting.unacceptPk);
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m132794w4(View view) {
        m132781h4();
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m132795x4(View view) {
        m132781h4();
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m132796y4(View view) {
        m132747D4();
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m132797z4(View view) {
        m132746C4();
    }
}
