package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.data.Pagination;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLivePkInvite;
import com.p046p1.mobile.putong.live.base.data.BLivePkInviteSource;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkFriendInfo;
import p133rx.C22306c;
import p147v.VImage;

/* JADX INFO: loaded from: classes5.dex */
public class do70 extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public View f87136i;

    /* JADX INFO: renamed from: j */
    public VImage f87137j;

    /* JADX INFO: renamed from: k */
    public TextView f87138k;

    /* JADX INFO: renamed from: l */
    public RecyclerView f87139l;

    /* JADX INFO: renamed from: m */
    public DialogC12611a f87140m;

    /* JADX INFO: renamed from: n */
    public jn70 f87141n;

    /* JADX INFO: renamed from: o */
    public boolean f87142o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public Pagination f87143p;

    /* JADX INFO: renamed from: q */
    public e30<Boolean> f87144q;

    /* JADX INFO: renamed from: l.do70$a */
    public class C16418a implements e30<Boolean> {
        public C16418a() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
            if (do70.this.f87140m.isShowing()) {
                ht70.m132853j("getPkAcceptSetting unaccept:" + bool);
                do70.this.f87142o = bool.booleanValue();
                do70.this.m112721f4(bool);
            }
        }
    }

    public do70(bsm bsmVar) {
        super(bsmVar);
        this.f87144q = new C16418a();
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ PkFriendInfo m112703L3(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        PkFriendInfo pkFriendInfo = new PkFriendInfo(bLiveData.users, bLiveData.lives, bLiveData.anchors);
        Pagination pagination = bLiveEnvelope.pagination;
        return pkFriendInfo.setHasNextPage((pagination == null || TextUtils.isEmpty(pagination.links.next)) ? false : true);
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ PkFriendInfo m112705N3(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        PkFriendInfo pkFriendInfo = new PkFriendInfo(bLiveData.users, bLiveData.lives, bLiveData.anchors);
        Pagination pagination = bLiveEnvelope.pagination;
        return pkFriendInfo.setHasNextPage((pagination == null || TextUtils.isEmpty(pagination.links.next)) ? false : true);
    }

    /* JADX INFO: renamed from: T3 */
    public static /* synthetic */ void m112710T3(e30 e30Var, BLiveAnchor bLiveAnchor) {
        if (e30Var != null) {
            e30Var.call(Boolean.valueOf(bLiveAnchor.liveSetting.unacceptPk));
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public static /* synthetic */ void m112716Z3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public void m112721f4(Boolean bool) {
        this.f87141n.m142362j0(bool);
    }

    private boolean isShowing() {
        DialogC12611a dialogC12611a = this.f87140m;
        return dialogC12611a != null && dialogC12611a.isShowing();
    }

    /* JADX INFO: renamed from: j4 */
    private void m112722j4() {
        this.f87139l.setLayoutManager(new LinearLayoutManager(act()));
        jn70 jn70Var = new jn70(this);
        this.f87141n = jn70Var;
        jn70Var.m142367p0(new f30() { // from class: l.bo70
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f76483a.m112732m4((BLiveAnchor) obj, (PkFriendInfo) obj2);
            }
        });
        this.f87141n.m142369r0(new d30() { // from class: l.co70
            @Override // p149l.d30
            public final void call() {
                this.f81753a.m112733n4();
            }
        });
        this.f87139l.setAdapter(this.f87141n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s4 */
    public /* synthetic */ void m112723s4(View view) {
        m112728h4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t4 */
    public /* synthetic */ void m112724t4(View view) {
        m112728h4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u4 */
    public /* synthetic */ void m112725u4(gat gatVar) {
        if (gatVar.f101704b) {
            m112742z4();
        } else {
            m112728h4();
        }
    }

    /* JADX INFO: renamed from: e4 */
    public View m112726e4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cp70.m108114b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: g4 */
    public void m112727g4(User user, BLivePkInviteSource bLivePkInviteSource, boolean z) {
        m206028F2().LivePkEvent.createInvite().mo172463j(new hat(user.f56011id, user.name, user.m60124fp().url, bLivePkInviteSource, z, new e30() { // from class: l.on70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144748a.m112731l4((BLivePkInvite) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h4 */
    public void m112728h4() {
        DialogC12611a dialogC12611a = this.f87140m;
        if (dialogC12611a == null || !dialogC12611a.isShowing()) {
            return;
        }
        this.f87140m.dismiss();
    }

    /* JADX INFO: renamed from: i4 */
    public void m112729i4(final e30<Boolean> e30Var) {
        duringCreated(LivingNormalApiProvider.m71589u4(ypv.f199493a.m199309D0())).subscribe(ffw.m121194e(new e30() { // from class: l.xn70
            @Override // p149l.e30
            public final void call(Object obj) {
                e30Var.call(Boolean.valueOf(((BLiveAnchor) obj).liveSetting.unacceptPk));
            }
        }, new e30() { // from class: l.yn70
            @Override // p149l.e30
            public final void call(Object obj) {
                do70.m112716Z3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m112730k4(Boolean bool) {
        this.f87144q.call(bool);
        lsi0.m151593w(eat.f90250h);
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m112731l4(BLivePkInvite bLivePkInvite) {
        m112728h4();
        if (this.f87142o) {
            m112741y4(false, new e30() { // from class: l.qn70
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f155402a.m112730k4((Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m112732m4(BLiveAnchor bLiveAnchor, PkFriendInfo pkFriendInfo) {
        m112727g4(pkFriendInfo.queryUserById(bLiveAnchor.f44331id), bLiveAnchor.pkRecommendSource, false);
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m112733n4() {
        m112741y4(!this.f87142o, this.f87144q);
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m112734o4(BLiveEnvelope bLiveEnvelope) {
        this.f87143p = bLiveEnvelope.pagination;
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m112735p4(j760 j760Var) {
        if (isShowing()) {
            this.f87141n.m142368q0(j760Var);
        }
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m112736q4(e30 e30Var, PkFriendInfo pkFriendInfo) {
        if (isShowing()) {
            e30Var.call(pkFriendInfo);
        }
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m112737r4(BLiveEnvelope bLiveEnvelope) {
        this.f87143p = bLiveEnvelope.pagination;
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().LivePkEvent.showPkDialog().m172460g()).filter(new w9j() { // from class: l.ln70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((gat) obj).f101703a == 3);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.un70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177340a.m112725u4((gat) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v4 */
    public final C22306c<PkFriendInfo> m112738v4(String str, int i) {
        return duringCreated(LivingNormalApiProvider.m71203D5(str, i)).doOnNext(new e30() { // from class: l.mn70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f134742a.m112734o4((BLiveEnvelope) obj);
            }
        }).map(new w9j() { // from class: l.nn70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return do70.m112703L3((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w4 */
    public final void m112739w4() {
        duringCreated(C22306c.zip(m112738v4("", 50), LivingNormalApiProvider.m71392Y5(), new x9j() { // from class: l.zn70
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return new j760((PkFriendInfo) obj, (PkFriendInfo) obj2);
            }
        })).observeOn(jo0.m142408a()).subscribe(ffw.m121194e(new e30() { // from class: l.ao70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f70791a.m112735p4((j760) obj);
            }
        }, new a280()));
    }

    /* JADX INFO: renamed from: x4 */
    public void m112740x4(final e30<PkFriendInfo> e30Var) {
        Pagination pagination = this.f87143p;
        if (pagination == null || TextUtils.isEmpty(pagination.links.next)) {
            return;
        }
        duringCreated(LivingNormalApiProvider.m71635z5(this.f87143p.links.next)).doOnNext(new e30() { // from class: l.rn70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160248a.m112737r4((BLiveEnvelope) obj);
            }
        }).map(new w9j() { // from class: l.sn70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return do70.m112705N3((BLiveEnvelope) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.tn70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f171212a.m112736q4(e30Var, (PkFriendInfo) obj);
            }
        }, new a280()));
    }

    /* JADX INFO: renamed from: y4 */
    public void m112741y4(boolean z, final e30<Boolean> e30Var) {
        ht70.m132853j("setPkAcceptSetting unaccept:" + z);
        duringCreated(LivingNormalApiProvider.m71250I7(z)).subscribe(ffw.m121194e(new e30() { // from class: l.pn70
            @Override // p149l.e30
            public final void call(Object obj) {
                do70.m112710T3(e30Var, (BLiveAnchor) obj);
            }
        }, new a280()));
    }

    /* JADX INFO: renamed from: z4 */
    public void m112742z4() {
        zvf0.m220396r("e_pk_start_specifiedpk", mo77274R2());
        if (this.f87140m == null) {
            this.f87140m = new byr(this, m112726e4(act().inflater(), null));
            this.f87137j.setOnClickListener(new View.OnClickListener() { // from class: l.vn70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f182213a.m112723s4(view);
                }
            });
            this.f87136i.setOnClickListener(new View.OnClickListener() { // from class: l.wn70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f187262a.m112724t4(view);
                }
            });
            m112722j4();
        }
        this.f87139l.scrollToPosition(0);
        m112729i4(this.f87144q);
        m112739w4();
        this.f87140m.show();
    }
}
