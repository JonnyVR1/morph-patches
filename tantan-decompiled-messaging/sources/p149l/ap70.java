package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.Pagination;
import com.p046p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p046p1.mobile.putong.live.base.data.BLivePkInvite;
import com.p046p1.mobile.putong.live.base.data.BLivePkInviteSource;
import com.p046p1.mobile.putong.live.base.data.BLivePkSuggestAnchor;
import com.p046p1.mobile.putong.live.base.data.BLivePkSuggestAnchors;
import com.p046p1.mobile.putong.live.base.view.LiveEmptyView;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p147v.VImage;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public class ap70 extends pat<ho2> {

    /* JADX INFO: renamed from: A */
    public c4g0 f70980A;

    /* JADX INFO: renamed from: B */
    public c4g0 f70981B;

    /* JADX INFO: renamed from: C */
    public d280 f70982C;

    /* JADX INFO: renamed from: D */
    public boolean f70983D;

    /* JADX INFO: renamed from: i */
    public View f70984i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f70985j;

    /* JADX INFO: renamed from: k */
    public VImage f70986k;

    /* JADX INFO: renamed from: l */
    public TextView f70987l;

    /* JADX INFO: renamed from: m */
    public TextView f70988m;

    /* JADX INFO: renamed from: n */
    public TextView f70989n;

    /* JADX INFO: renamed from: o */
    public TabLayout f70990o;

    /* JADX INFO: renamed from: p */
    public ViewPager f70991p;

    /* JADX INFO: renamed from: q */
    public LinearLayout f70992q;

    /* JADX INFO: renamed from: r */
    public LinearLayout f70993r;

    /* JADX INFO: renamed from: s */
    public EditText f70994s;

    /* JADX INFO: renamed from: t */
    public ImageView f70995t;

    /* JADX INFO: renamed from: u */
    public TextView f70996u;

    /* JADX INFO: renamed from: v */
    public VRecyclerView f70997v;

    /* JADX INFO: renamed from: w */
    public LiveEmptyView f70998w;

    /* JADX INFO: renamed from: x */
    public DialogC12611a f70999x;

    /* JADX INFO: renamed from: y */
    public l280 f71000y;

    /* JADX INFO: renamed from: z */
    public boolean f71001z;

    public ap70(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: C4 */
    private void m98033C4() {
        this.f188513f.hideInput(this.f70994s);
        xdl0.m208344M(this.f70992q, false);
        xdl0.m208344M(this.f70985j, true);
        this.f70994s.setText("");
    }

    /* JADX INFO: renamed from: D4 */
    private void m98034D4() {
        xdl0.m208344M(this.f70992q, true);
        xdl0.m208344M(this.f70985j, false);
        mkd0.m154992z(this.f70981B);
        this.f70981B = act().duringCreated(uep0.m193313H(this.f70994s)).throttleLast(500L, TimeUnit.MILLISECONDS).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.io70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f114109a.m98062G4((CharSequence) obj);
            }
        }));
        this.f70994s.post(new Runnable() { // from class: l.jo70
            @Override // java.lang.Runnable
            public final void run() {
                this.f118919a.m98074p4();
            }
        });
        if (this.f70982C != null) {
            return;
        }
        this.f70997v.setLayoutManager(new LinearLayoutManager(this.f188513f));
        d280 d280Var = new d280(this.f188512e, BLivePkSuggestAnchors.new_(), new f30() { // from class: l.ko70
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f123968a.m98075q4((BLivePkSuggestAnchor) obj, (BLivePkInviteSource) obj2);
            }
        });
        this.f70982C = d280Var;
        this.f70997v.setAdapter(d280Var);
        this.f70998w.m68724d(R$string.f47190da);
        this.f70998w.m68723c(kvc0.m147352a(h1c0.f105377j1));
        this.f70998w.m68722b(i3c0.f111062k4);
        this.f70982C.m67370Y(this.f70997v, this.f70998w);
        this.f70982C.m109711g0();
        xdl0.m208329E0(this.f70995t, new View.OnClickListener() { // from class: l.lo70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f129077a.m98076r4(view);
            }
        });
        this.f70994s.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.mo70
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return this.f134869a.m98073o4(textView, i, keyEvent);
            }
        });
    }

    /* JADX INFO: renamed from: E4 */
    private void m98035E4() {
        duringCreated(LivingNormalApiProvider.m71257J5()).subscribe(ffw.m121194e(new e30() { // from class: l.xo70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193788a.m98077s4((List) obj);
            }
        }, new a280()));
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m98038L3(Throwable th) {
    }

    /* JADX INFO: renamed from: j4 */
    public static View m98057j4(Act act, BLivePkSuggestAnchors bLivePkSuggestAnchors) {
        View viewInflate = act.inflater().inflate(t6c0.f168216V4, (ViewGroup) null);
        viewInflate.setTag(bLivePkSuggestAnchors.type);
        ((TextView) viewInflate.findViewById(g5c0.f100762N6)).setText(bLivePkSuggestAnchors.name);
        return viewInflate;
    }

    /* JADX INFO: renamed from: k4 */
    private void m98058k4() {
        this.f71000y = new l280(this.f188512e, new f30() { // from class: l.yo70
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f199274a.m98061F4((d280) obj, (Pagination) obj2);
            }
        }, new f30() { // from class: l.zo70
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f204091a.m98072n4((BLivePkSuggestAnchor) obj, (BLivePkInviteSource) obj2);
            }
        });
        this.f70990o.setupWithViewPager(this.f70991p);
        this.f70991p.setOffscreenPageLimit(1);
        this.f70991p.setAdapter(this.f71000y);
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m98059A4(View view) {
        m98063H4(!this.f71001z);
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m98060B4(gat gatVar) {
        if (gatVar.f101704b) {
            m98064I4();
        } else {
            m98068h4();
        }
    }

    /* JADX INFO: renamed from: F4 */
    public final void m98061F4(final d280 d280Var, Pagination pagination) {
        Links links;
        if (pagination == null || (links = pagination.links) == null || TextUtils.isEmpty(links.next) || this.f70983D) {
            return;
        }
        this.f70983D = true;
        duringCreated(LivingNormalApiProvider.m71266K5(pagination)).subscribe(ffw.m121193d(new e30() { // from class: l.oo70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144852a.m98078t4(d280Var, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G4 */
    public void m98062G4(CharSequence charSequence) {
        String strTrim = charSequence.toString().trim();
        mkd0.m154992z(this.f70980A);
        if (!TextUtils.isEmpty(strTrim)) {
            this.f70980A = duringCreated(LivingNormalApiProvider.m71356U5(strTrim)).subscribe(ffw.m121197h(new e30() { // from class: l.no70
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f139821a.m98079u4((BLivePkSuggestAnchors) obj);
                }
            }));
            return;
        }
        d280 d280Var = this.f70982C;
        if (d280Var != null) {
            d280Var.m109711g0();
        }
    }

    /* JADX INFO: renamed from: H4 */
    public void m98063H4(boolean z) {
        ht70.m132853j("setPkAcceptSetting unaccept:" + z);
        duringCreated(LivingNormalApiProvider.m71250I7(z)).subscribe(ffw.m121194e(new e30() { // from class: l.ho70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f108798a.m98080v4((BLiveAnchor) obj);
            }
        }, new a280()));
        zvf0.m220399u("e_pk_refuse_invite_button", "p_anchor_live_room", j760.m140076a("anchorId", this.f188512e.f77102h.m132140j0()), j760.m140076a("liveId", this.f188512e.f77102h.m149814k()), j760.m140076a("switch_type", z ? "open" : "close"));
    }

    /* JADX INFO: renamed from: I4 */
    public void m98064I4() {
        zvf0.m220396r("e_pk_start_specifiedpk", mo77274R2());
        if (this.f70999x == null) {
            this.f70999x = new byr(this, m98066f4(act().inflater(), null));
            this.f70986k.setOnClickListener(new View.OnClickListener() { // from class: l.so70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f165564a.m98081w4(view);
                }
            });
            this.f70984i.setOnClickListener(new View.OnClickListener() { // from class: l.to70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f171321a.m98082x4(view);
                }
            });
            xdl0.m208329E0(this.f70989n, new View.OnClickListener() { // from class: l.uo70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f177495a.m98083y4(view);
                }
            });
            xdl0.m208329E0(this.f70996u, new View.OnClickListener() { // from class: l.vo70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f182370a.m98084z4(view);
                }
            });
            xdl0.m208329E0(this.f70988m, new View.OnClickListener() { // from class: l.wo70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f187385a.m98059A4(view);
                }
            });
        }
        m98058k4();
        m98033C4();
        m98069i4();
        m98035E4();
        this.f70999x.show();
    }

    /* JADX INFO: renamed from: J4 */
    public final void m98065J4(boolean z) {
        if (this.f70999x.isShowing()) {
            ht70.m132853j("getPkAcceptSetting unaccept:" + z);
            this.f71001z = z;
            this.f70988m.setSelected(z);
            this.f70988m.setCompoundDrawablesWithIntrinsicBounds(z ? i3c0.f110937a : i3c0.f110735I1, 0, 0, 0);
        }
    }

    /* JADX INFO: renamed from: f4 */
    public View m98066f4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return bp70.m103043b(this, layoutInflater, viewGroup);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: g4 */
    public void m98067g4(BLivePkSuggestAnchor bLivePkSuggestAnchor, BLivePkInviteSource bLivePkInviteSource, boolean z) {
        zvf0.m220399u("e_pk_invite_button", "p_anchor_live_room", j760.m140076a("anchorId", m206027E2().m132140j0()), j760.m140076a("liveId", m206027E2().m149814k()), j760.m140076a("other_user_id", bLivePkSuggestAnchor.userId), j760.m140076a("page_tab_type", bLivePkSuggestAnchor.source.toString()));
        m206028F2().LivePkEvent.createInvite().mo172463j(new hat(bLivePkSuggestAnchor.userId, bLivePkSuggestAnchor.userName, bLivePkSuggestAnchor.avatar, bLivePkInviteSource, z, new e30() { // from class: l.qo70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155541a.m98070l4((BLivePkInvite) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h4 */
    public void m98068h4() {
        EditText editText;
        Act act = this.f188513f;
        if (act != null && (editText = this.f70994s) != null) {
            act.hideInput(editText);
        }
        mkd0.m154992z(this.f70980A);
        mkd0.m154992z(this.f70981B);
        DialogC12611a dialogC12611a = this.f70999x;
        if (dialogC12611a == null || !dialogC12611a.isShowing()) {
            return;
        }
        this.f70999x.dismiss();
    }

    /* JADX INFO: renamed from: i4 */
    public void m98069i4() {
        duringCreated(LivingNormalApiProvider.m71589u4(ypv.f199493a.m199309D0())).subscribe(ffw.m121194e(new e30() { // from class: l.fo70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f98514a.m98071m4((BLiveAnchor) obj);
            }
        }, new e30() { // from class: l.go70
            @Override // p149l.e30
            public final void call(Object obj) {
                ap70.m98038L3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m98070l4(BLivePkInvite bLivePkInvite) {
        m98068h4();
        if (this.f71001z) {
            m98063H4(false);
            lsi0.m151593w(eat.f90250h);
        }
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m98071m4(BLiveAnchor bLiveAnchor) {
        m98065J4(bLiveAnchor.liveSetting.unacceptPk);
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m98072n4(BLivePkSuggestAnchor bLivePkSuggestAnchor, BLivePkInviteSource bLivePkInviteSource) {
        m98067g4(bLivePkSuggestAnchor, bLivePkInviteSource, false);
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ boolean m98073o4(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        act().hideInput(this.f70994s);
        return false;
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m98074p4() {
        this.f70994s.requestFocus();
        this.f188513f.showInput(this.f70994s, 0);
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m98075q4(BLivePkSuggestAnchor bLivePkSuggestAnchor, BLivePkInviteSource bLivePkInviteSource) {
        m98067g4(bLivePkSuggestAnchor, bLivePkInviteSource, false);
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m98076r4(View view) {
        this.f70994s.setText("");
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m98077s4(List list) {
        this.f71000y.m148275u(list);
        for (int i = 0; i < list.size(); i++) {
            TabLayout.Tab tabAt = this.f70990o.getTabAt(i);
            View viewM98057j4 = m98057j4(act(), (BLivePkSuggestAnchors) list.get(i));
            if (tabAt != null) {
                tabAt.setCustomView(viewM98057j4);
            }
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().LivePkEvent.showPkDialog().m172460g()).filter(new w9j() { // from class: l.eo70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((gat) obj).f101703a == 3);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.po70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150491a.m98060B4((gat) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m98078t4(final d280 d280Var, List list) {
        BLivePkSuggestAnchors bLivePkSuggestAnchors = (BLivePkSuggestAnchors) vwb.m200346r(list, new w9j() { // from class: l.ro70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(d280Var.m109714j0(((BLivePkSuggestAnchors) obj).type));
            }
        });
        if (bLivePkSuggestAnchors != null) {
            d280Var.m109710f0(bLivePkSuggestAnchors);
        }
        this.f70983D = false;
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m98079u4(BLivePkSuggestAnchors bLivePkSuggestAnchors) {
        d280 d280Var = this.f70982C;
        if (d280Var != null) {
            d280Var.m109716l0(bLivePkSuggestAnchors);
        }
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m98080v4(BLiveAnchor bLiveAnchor) {
        m98065J4(bLiveAnchor.liveSetting.unacceptPk);
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m98081w4(View view) {
        m98068h4();
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m98082x4(View view) {
        m98068h4();
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m98083y4(View view) {
        m98034D4();
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m98084z4(View view) {
        m98033C4();
    }
}
