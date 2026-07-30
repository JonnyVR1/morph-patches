package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLivePkInvite;
import com.p051p1.mobile.putong.live.base.data.BLivePkInviteSource;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkFriendInfo;
import p137rx.C22421c;
import p151v.VImage;

/* JADX INFO: loaded from: classes5.dex */
public class jw70 extends qct<oo2> {

    /* JADX INFO: renamed from: i */
    public View f122887i;

    /* JADX INFO: renamed from: j */
    public VImage f122888j;

    /* JADX INFO: renamed from: k */
    public TextView f122889k;

    /* JADX INFO: renamed from: l */
    public RecyclerView f122890l;

    /* JADX INFO: renamed from: m */
    public DialogC12774a f122891m;

    /* JADX INFO: renamed from: n */
    public pv70 f122892n;

    /* JADX INFO: renamed from: o */
    public boolean f122893o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public Pagination f122894p;

    /* JADX INFO: renamed from: q */
    public y20<Boolean> f122895q;

    /* JADX INFO: renamed from: l.jw70$a */
    public class C18045a implements y20<Boolean> {
        public C18045a() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
            if (jw70.this.f122891m.isShowing()) {
                n180.m161093j("getPkAcceptSetting unaccept:" + bool);
                jw70.this.f122893o = bool.booleanValue();
                jw70.this.m147137f4(bool);
            }
        }
    }

    public jw70(dum dumVar) {
        super(dumVar);
        this.f122895q = new C18045a();
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ PkFriendInfo m147119L3(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        PkFriendInfo pkFriendInfo = new PkFriendInfo(bLiveData.users, bLiveData.lives, bLiveData.anchors);
        Pagination pagination = bLiveEnvelope.pagination;
        return pkFriendInfo.setHasNextPage((pagination == null || TextUtils.isEmpty(pagination.links.next)) ? false : true);
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ PkFriendInfo m147121N3(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        PkFriendInfo pkFriendInfo = new PkFriendInfo(bLiveData.users, bLiveData.lives, bLiveData.anchors);
        Pagination pagination = bLiveEnvelope.pagination;
        return pkFriendInfo.setHasNextPage((pagination == null || TextUtils.isEmpty(pagination.links.next)) ? false : true);
    }

    /* JADX INFO: renamed from: T3 */
    public static /* synthetic */ void m147126T3(y20 y20Var, BLiveAnchor bLiveAnchor) {
        if (y20Var != null) {
            y20Var.call(Boolean.valueOf(bLiveAnchor.liveSetting.unacceptPk));
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public static /* synthetic */ void m147132Z3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public void m147137f4(Boolean bool) {
        this.f122892n.m173931j0(bool);
    }

    private boolean isShowing() {
        DialogC12774a dialogC12774a = this.f122891m;
        return dialogC12774a != null && dialogC12774a.isShowing();
    }

    /* JADX INFO: renamed from: j4 */
    private void m147138j4() {
        this.f122890l.setLayoutManager(new LinearLayoutManager(act()));
        pv70 pv70Var = new pv70(this);
        this.f122892n = pv70Var;
        pv70Var.m173936p0(new z20() { // from class: l.hw70
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f111872a.m147148m4((BLiveAnchor) obj, (PkFriendInfo) obj2);
            }
        });
        this.f122892n.m173938r0(new x20() { // from class: l.iw70
            @Override // p153l.x20
            public final void call() {
                this.f117250a.m147149n4();
            }
        });
        this.f122890l.setAdapter(this.f122892n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s4 */
    public /* synthetic */ void m147139s4(View view) {
        m147144h4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t4 */
    public /* synthetic */ void m147140t4(View view) {
        m147144h4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u4 */
    public /* synthetic */ void m147141u4(hct hctVar) {
        if (hctVar.f108746b) {
            m147158z4();
        } else {
            m147144h4();
        }
    }

    /* JADX INFO: renamed from: e4 */
    public View m147142e4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ix70.m142497b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: g4 */
    public void m147143g4(User user, BLivePkInviteSource bLivePkInviteSource, boolean z) {
        m213811F2().LivePkEvent.createInvite().mo199273j(new ict(user.f56859id, user.name, user.m61308fp().url, bLivePkInviteSource, z, new y20() { // from class: l.uv70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181125a.m147147l4((BLivePkInvite) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h4 */
    public void m147144h4() {
        DialogC12774a dialogC12774a = this.f122891m;
        if (dialogC12774a == null || !dialogC12774a.isShowing()) {
            return;
        }
        this.f122891m.dismiss();
    }

    /* JADX INFO: renamed from: i4 */
    public void m147145i4(final y20<Boolean> y20Var) {
        duringCreated(LivingNormalApiProvider.m72772u4(zrv.f205799a.m207631D0())).subscribe(dhw.m115826e(new y20() { // from class: l.dw70
            @Override // p153l.y20
            public final void call(Object obj) {
                y20Var.call(Boolean.valueOf(((BLiveAnchor) obj).liveSetting.unacceptPk));
            }
        }, new y20() { // from class: l.ew70
            @Override // p153l.y20
            public final void call(Object obj) {
                jw70.m147132Z3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m147146k4(Boolean bool) {
        this.f122895q.call(bool);
        o1j0.m165649w(fct.f98268h);
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m147147l4(BLivePkInvite bLivePkInvite) {
        m147144h4();
        if (this.f122893o) {
            m147157y4(false, new y20() { // from class: l.wv70
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f190929a.m147146k4((Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m147148m4(BLiveAnchor bLiveAnchor, PkFriendInfo pkFriendInfo) {
        m147143g4(pkFriendInfo.queryUserById(bLiveAnchor.f45179id), bLiveAnchor.pkRecommendSource, false);
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m147149n4() {
        m147157y4(!this.f122893o, this.f122895q);
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m147150o4(BLiveEnvelope bLiveEnvelope) {
        this.f122894p = bLiveEnvelope.pagination;
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m147151p4(pf60 pf60Var) {
        if (isShowing()) {
            this.f122892n.m173937q0(pf60Var);
        }
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m147152q4(y20 y20Var, PkFriendInfo pkFriendInfo) {
        if (isShowing()) {
            y20Var.call(pkFriendInfo);
        }
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m147153r4(BLiveEnvelope bLiveEnvelope) {
        this.f122894p = bLiveEnvelope.pagination;
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().LivePkEvent.showPkDialog().m199270g()).filter(new qcj() { // from class: l.rv70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((hct) obj).f108745a == 3);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.aw70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f73695a.m147141u4((hct) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v4 */
    public final C22421c<PkFriendInfo> m147154v4(String str, int i) {
        return duringCreated(LivingNormalApiProvider.m72386D5(str, i)).doOnNext(new y20() { // from class: l.sv70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170814a.m147150o4((BLiveEnvelope) obj);
            }
        }).map(new qcj() { // from class: l.tv70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return jw70.m147119L3((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w4 */
    public final void m147155w4() {
        duringCreated(C22421c.zip(m147154v4("", 50), LivingNormalApiProvider.m72575Y5(), new rcj() { // from class: l.fw70
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return new pf60((PkFriendInfo) obj, (PkFriendInfo) obj2);
            }
        })).observeOn(fo0.m126432a()).subscribe(dhw.m115826e(new y20() { // from class: l.gw70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f106736a.m147151p4((pf60) obj);
            }
        }, new ga80()));
    }

    /* JADX INFO: renamed from: x4 */
    public void m147156x4(final y20<PkFriendInfo> y20Var) {
        Pagination pagination = this.f122894p;
        if (pagination == null || TextUtils.isEmpty(pagination.links.next)) {
            return;
        }
        duringCreated(LivingNormalApiProvider.m72818z5(this.f122894p.links.next)).doOnNext(new y20() { // from class: l.xv70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196356a.m147153r4((BLiveEnvelope) obj);
            }
        }).map(new qcj() { // from class: l.yv70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return jw70.m147121N3((BLiveEnvelope) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.zv70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f206189a.m147152q4(y20Var, (PkFriendInfo) obj);
            }
        }, new ga80()));
    }

    /* JADX INFO: renamed from: y4 */
    public void m147157y4(boolean z, final y20<Boolean> y20Var) {
        n180.m161093j("setPkAcceptSetting unaccept:" + z);
        duringCreated(LivingNormalApiProvider.m72433I7(z)).subscribe(dhw.m115826e(new y20() { // from class: l.vv70
            @Override // p153l.y20
            public final void call(Object obj) {
                jw70.m147126T3(y20Var, (BLiveAnchor) obj);
            }
        }, new ga80()));
    }

    /* JADX INFO: renamed from: z4 */
    public void m147158z4() {
        i4g0.m138520r("e_pk_start_specifiedpk", mo78457R2());
        if (this.f122891m == null) {
            this.f122891m = new c0s(this, m147142e4(act().inflater(), null));
            this.f122888j.setOnClickListener(new View.OnClickListener() { // from class: l.bw70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f78686a.m147139s4(view);
                }
            });
            this.f122887i.setOnClickListener(new View.OnClickListener() { // from class: l.cw70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f84105a.m147140t4(view);
                }
            });
            m147138j4();
        }
        this.f122890l.scrollToPosition(0);
        m147145i4(this.f122895q);
        m147155w4();
        this.f122891m.show();
    }
}
