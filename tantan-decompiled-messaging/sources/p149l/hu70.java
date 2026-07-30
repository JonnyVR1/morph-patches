package p149l;

import android.app.Application;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLivePkInvite;
import com.p046p1.mobile.putong.live.base.data.BLivePkInviteSource;
import com.p046p1.mobile.putong.live.base.data.BLivePkSeek;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkData;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.PkMatchProfileBlackView;
import com.tencent.connect.common.Constants;
import java.util.concurrent.TimeUnit;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class hu70 extends pat<ho2> {

    /* JADX INFO: renamed from: A */
    public Button f109520A;

    /* JADX INFO: renamed from: B */
    public TextView f109521B;

    /* JADX INFO: renamed from: C */
    public DialogC12611a f109522C;

    /* JADX INFO: renamed from: D */
    public String f109523D;

    /* JADX INFO: renamed from: E */
    public c4g0 f109524E;

    /* JADX INFO: renamed from: F */
    public String f109525F;

    /* JADX INFO: renamed from: G */
    public int f109526G;

    /* JADX INFO: renamed from: H */
    public c4g0 f109527H;

    /* JADX INFO: renamed from: I */
    public int f109528I;

    /* JADX INFO: renamed from: i */
    public View f109529i;

    /* JADX INFO: renamed from: j */
    public VImage f109530j;

    /* JADX INFO: renamed from: k */
    public TextView f109531k;

    /* JADX INFO: renamed from: l */
    public View f109532l;

    /* JADX INFO: renamed from: m */
    public View f109533m;

    /* JADX INFO: renamed from: n */
    public AnimEffectPlayer f109534n;

    /* JADX INFO: renamed from: o */
    public AnimEffectPlayer f109535o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f109536p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f109537q;

    /* JADX INFO: renamed from: r */
    public VText f109538r;

    /* JADX INFO: renamed from: s */
    public LinearLayout f109539s;

    /* JADX INFO: renamed from: t */
    public VDraweeView f109540t;

    /* JADX INFO: renamed from: u */
    public PkMatchProfileBlackView f109541u;

    /* JADX INFO: renamed from: v */
    public VDraweeView f109542v;

    /* JADX INFO: renamed from: w */
    public VDraweeView f109543w;

    /* JADX INFO: renamed from: x */
    public VImage f109544x;

    /* JADX INFO: renamed from: y */
    public VText f109545y;

    /* JADX INFO: renamed from: z */
    public Button f109546z;

    /* JADX INFO: renamed from: l.hu70$a */
    public class C17406a extends ap0 {
        public C17406a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j */
        public /* synthetic */ void m133096j() {
            xdl0.m208344M(hu70.this.f109534n, true);
            xdl0.m208344M(hu70.this.f109535o, false);
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: d */
        public void mo70529d(@NonNull wo0 wo0Var) {
            super.mo70529d(wo0Var);
            hu70.this.f109534n.postDelayed(new Runnable() { // from class: l.gu70
                @Override // java.lang.Runnable
                public final void run() {
                    this.f104380a.m133096j();
                }
            }, 200L);
        }
    }

    public hu70(bsm bsmVar) {
        super(bsmVar);
        this.f109526G = 0;
        this.f109528I = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public /* synthetic */ void m133034A4(soj0 soj0Var) {
        m133063G4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C4 */
    public /* synthetic */ void m133035C4(soj0 soj0Var) {
        m133078i4();
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ BLivePkInvite m133038L3(String str, BLivePkInvite bLivePkInvite) {
        return (BLivePkInvite) ht70.m132852i("cancelInvite id:" + str, bLivePkInvite);
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m133041O3(BLivePkSeek bLivePkSeek) {
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ void m133047V3(BLivePkInvite bLivePkInvite) {
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ BLivePkSeek m133048W3(String str, BLivePkSeek bLivePkSeek) {
        return (BLivePkSeek) ht70.m132852i("cancelSeek id:" + str, bLivePkSeek);
    }

    /* JADX INFO: renamed from: n4 */
    private boolean m133058n4() {
        DialogC12611a dialogC12611a = this.f109522C;
        return dialogC12611a != null && dialogC12611a.isShowing();
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m133059B4(gat gatVar) {
        if (gatVar.f101704b) {
            m133075S4();
        } else {
            m133081l4();
        }
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m133060D4(LivePkMessage livePkMessage) {
        if (TextUtils.equals(livePkMessage.type, "pk_invite_reject")) {
            m133064H4(livePkMessage);
        } else if (TextUtils.equals(livePkMessage.type, "pk_seek_timeout")) {
            m133071O4();
        }
    }

    /* JADX INFO: renamed from: E4 */
    public void m133061E4(PkData pkData) {
        if (pkData == null) {
            u280.m191442a(new Throwable("pk create pkinfo is null"));
            return;
        }
        User userOtherUser = pkData.otherUser();
        if (userOtherUser == null) {
            u280.m191442a(new Throwable("user is null"));
            return;
        }
        if (TEnum.equals(pkData.f51567pk.categoryV2, "specified")) {
            m133082m4().show();
            m133072P4(userOtherUser);
            m133069M4(3);
            mkd0.m154992z(this.f109527H);
            return;
        }
        if (!m133082m4().isShowing()) {
            lsi0.m151593w(R$string.f46743Ia);
        } else {
            m133072P4(userOtherUser);
            m133069M4(3);
        }
    }

    /* JADX INFO: renamed from: F4 */
    public final void m133062F4(User user) {
        BLivePkInviteSource bLivePkInviteSource = BLivePkInviteSource.get(BLivePkInviteSource.onceMore);
        if (m133083o4()) {
            mm70.m155308d(this, true);
        } else {
            m206028F2().LivePkEvent.createInvite().mo172463j(new hat(user.f56011id, user.name, user.m60124fp().originUrl, bLivePkInviteSource, true, null));
        }
    }

    /* JADX INFO: renamed from: G4 */
    public final void m133063G4() {
        if (m133058n4()) {
            this.f109522C.dismiss();
        }
        mkd0.m154992z(this.f109527H);
        this.f109526G = 0;
    }

    /* JADX INFO: renamed from: H4 */
    public final void m133064H4(LivePkMessage livePkMessage) {
        m206028F2().LivePkEvent.pkStateEvent().mo172463j(iat.m135196a(1));
        m133065I4(livePkMessage.f47752id);
    }

    /* JADX INFO: renamed from: I4 */
    public void m133065I4(String str) {
        if (this.f109526G == 4 && m133058n4() && TextUtils.equals(str, this.f109525F)) {
            xdl0.m208344M(this.f109520A, false);
            this.f109546z.setText(eat.f90249g);
            this.f109546z.setEnabled(false);
            mkd0.m154992z(this.f109527H);
            this.f109525F = null;
        }
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [l.ho2] */
    /* JADX INFO: renamed from: J4 */
    public void m133066J4(String str, String str2, String str3, String str4) {
        this.f109525F = str4;
        mkd0.m154992z(this.f109527H);
        this.f109527H = duringCreated(m206027E2().m132135h2(1, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.xt70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194357a.m133091w4((Long) obj);
            }
        }));
        if (m133082m4() != null) {
            m133069M4(4);
            m133074R4(str, str2, str3);
        }
        m133075S4();
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [l.ho2] */
    /* JADX INFO: renamed from: K4 */
    public void m133067K4(BLivePkSeek bLivePkSeek) {
        this.f109523D = bLivePkSeek.f44428id;
        mkd0.m154992z(this.f109524E);
        this.f109524E = m129299H3(m206027E2().m132135h2(5, TimeUnit.MINUTES)).take(1).subscribe(ffw.m121193d(new e30() { // from class: l.wt70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f188002a.m133092x4((Long) obj);
            }
        }));
        if (m133082m4() != null) {
            m133069M4(1);
        }
        m133075S4();
    }

    /* JADX INFO: renamed from: L4 */
    public void m133068L4() {
        if (m133082m4() == null) {
            return;
        }
        if (!m133082m4().isShowing()) {
            lsi0.m151593w(R$string.f46721Ha);
        }
        m133069M4(2);
    }

    /* JADX WARN: Type inference failed for: r9v30, types: [l.ho2] */
    /* JADX INFO: renamed from: M4 */
    public void m133069M4(int i) {
        ht70.m132855l(i);
        if (i == 1) {
            this.f109526G = i;
            int i2 = this.f109528I;
            TextView textView = this.f109531k;
            if (i2 == 4) {
                textView.setText("PK排位赛");
            } else {
                textView.setText(R$string.f46956Sa);
            }
            this.f109541u.m76201q();
            this.f109545y.setText("正在匹配中");
            xdl0.m208344M(this.f109541u, false);
            xdl0.m208344M(this.f109534n, false);
            xdl0.m208344M(this.f109535o, true);
            this.f109535o.m68500j("https://auto.tancdn.com/v1/raw/a5bfc1eb-a860-4bbb-8e22-dc109e4c751e13.so", -1);
            xdl0.m208344M(this.f109540t, false);
            xdl0.m208344M(this.f109520A, false);
            xdl0.m208344M(this.f109546z, true);
            this.f109546z.setEnabled(true);
            this.f109546z.setText(R$string.f47113a);
            xdl0.m208344M(this.f109521B, false);
            return;
        }
        if (i == 2) {
            if (this.f109526G == 1) {
                int i3 = this.f109528I;
                TextView textView2 = this.f109531k;
                if (i3 == 4) {
                    textView2.setText("PK排位赛");
                } else {
                    textView2.setText(R$string.f46956Sa);
                }
            } else {
                this.f109531k.setText(R$string.f46611Ca);
            }
            this.f109526G = i;
            this.f109541u.m76199o();
            xdl0.m208344M(this.f109540t, false);
            this.f109545y.setText("匹配失败");
            xdl0.m208344M(this.f109541u, true);
            xdl0.m208344M(this.f109534n, false);
            xdl0.m208344M(this.f109535o, true);
            this.f109535o.m68500j("https://auto.tancdn.com/v1/raw/a5bfc1eb-a860-4bbb-8e22-dc109e4c751e13.so", -1);
            xdl0.m208344M(this.f109520A, true);
            xdl0.m208344M(this.f109546z, false);
            xdl0.m208344M(this.f109521B, false);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            this.f109526G = i;
            this.f109531k.setText(R$string.f46866O4);
            xdl0.m208344M(this.f109541u, false);
            xdl0.m208344M(this.f109534n, false);
            xdl0.m208344M(this.f109535o, true);
            this.f109535o.m68500j("https://auto.tancdn.com/v1/raw/a5bfc1eb-a860-4bbb-8e22-dc109e4c751e13.so", -1);
            xdl0.m208344M(this.f109540t, true);
            xdl0.m208344M(this.f109520A, false);
            xdl0.m208344M(this.f109546z, true);
            this.f109546z.setEnabled(true);
            xdl0.m208344M(this.f109521B, false);
            this.f109546z.setText(ypv.f199497e.getString(R$string.f46926R1, Constants.VIA_REPORT_TYPE_WPA_STATE));
            return;
        }
        if (this.f109526G == 1) {
            int i4 = this.f109528I;
            TextView textView3 = this.f109531k;
            if (i4 == 4) {
                textView3.setText("PK排位赛");
            } else {
                textView3.setText(R$string.f46956Sa);
            }
        } else {
            this.f109531k.setText(R$string.f46611Ca);
        }
        this.f109526G = i;
        xdl0.m208344M(this.f109541u, true);
        this.f109541u.m76200p();
        this.f109534n.mo68502l("https://auto.tancdn.com/v1/raw/8b07635e-e8c6-4ac2-bb5c-9808e95d178212.so", -1, new C17406a());
        xdl0.m208344M(this.f109540t, true);
        xdl0.m208344M(this.f109520A, false);
        xdl0.m208344M(this.f109546z, false);
        xdl0.m208344M(this.f109521B, true);
        m129299H3(m206027E2().m132135h2(3, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.m142408a()).take(1).subscribe(ffw.m121193d(new e30() { // from class: l.lt70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f129943a.m133093y4((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N4 */
    public void m133070N4(int i) {
        this.f109528I = i;
        if (i == 4) {
            zvf0.m220396r("e_pk_start_qualifyingpk", mo77274R2());
        } else {
            zvf0.m220396r("e_pk_start_randompk", mo77274R2());
        }
        duringCreated(LivingNormalApiProvider.m71472h4(i)).subscribe(ffw.m121194e(new e30() { // from class: l.fu70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99318a.m133094z4((BLivePkSeek) obj);
            }
        }, new a280()));
    }

    /* JADX INFO: renamed from: O4 */
    public final void m133071O4() {
        if (((Integer) m129297F3(new u180(600))).intValue() == 2) {
            m206028F2().LivePkEvent.pkStateEvent().mo172463j(iat.m135196a(1));
            m133068L4();
        }
    }

    /* JADX INFO: renamed from: P4 */
    public final void m133072P4(User user) {
        hxs.m133405r("context_single_room", this.f109540t, user.m60124fp().profileSmall());
        this.f109545y.setText(user.name);
    }

    /* JADX INFO: renamed from: Q4 */
    public final void m133073Q4(String str, String str2, String str3) {
        hxs.m133406s("context_single_room", this.f109540t, str3);
        this.f109545y.setText(str2);
    }

    /* JADX INFO: renamed from: R4 */
    public final void m133074R4(String str, String str2, String str3) {
        if (str == null || str3 == null) {
            return;
        }
        m133073Q4(str, str2, str3);
    }

    /* JADX INFO: renamed from: S4 */
    public void m133075S4() {
        if (this.f109522C == null) {
            return;
        }
        if (this.f109523D != null && this.f109526G == 1) {
            this.f109541u.m76201q();
        }
        this.f109522C.show();
    }

    /* JADX INFO: renamed from: g4 */
    public View m133076g4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return iu70.m138353b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: h4 */
    public final void m133077h4(final String str) {
        m206028F2().LivePkEvent.pkStateEvent().mo172463j(iat.m135196a(1));
        duringCreated(LivingNormalApiProvider.m71372W3(str)).map(new w9j() { // from class: l.jt70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return hu70.m133038L3(str, (BLivePkInvite) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.kt70
            @Override // p149l.e30
            public final void call(Object obj) {
                hu70.m133047V3((BLivePkInvite) obj);
            }
        }, new a280()));
    }

    /* JADX INFO: renamed from: i4 */
    public void m133078i4() {
        m133081l4();
        int i = this.f109526G;
        if (i == 1) {
            mkd0.m154992z(this.f109524E);
            String str = this.f109523D;
            if (str != null) {
                m133079j4(str);
                this.f109523D = null;
            }
        } else if (i == 4) {
            mkd0.m154992z(this.f109527H);
            String str2 = this.f109525F;
            if (str2 != null) {
                m133077h4(str2);
                this.f109525F = null;
            }
        }
        this.f109526G = 0;
    }

    /* JADX INFO: renamed from: j4 */
    public final void m133079j4(final String str) {
        duringCreated(LivingNormalApiProvider.m71381X3(str)).map(new w9j() { // from class: l.rt70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return hu70.m133048W3(str, (BLivePkSeek) obj);
            }
        }).doOnNext(new e30() { // from class: l.st70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f166304a.m133084p4((BLivePkSeek) obj);
            }
        }).doOnError(new e30() { // from class: l.ut70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f178239a.m133085q4((Throwable) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.vt70
            @Override // p149l.e30
            public final void call(Object obj) {
                hu70.m133041O3((BLivePkSeek) obj);
            }
        }, new a280()));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m133080k4(final hat hatVar) {
        duringCreated(LivingNormalApiProvider.m71463g4(hatVar.f106832c, hatVar.f106833d, hatVar.f106834e)).subscribe(ffw.m121194e(new e30() { // from class: l.qt70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f156311a.m133086r4(hatVar, (BLivePkInvite) obj);
            }
        }, new a280()));
    }

    /* JADX INFO: renamed from: l4 */
    public void m133081l4() {
        if (m133058n4()) {
            this.f109541u.m76202r();
            this.f109522C.dismiss();
        }
        AnimEffectPlayer animEffectPlayer = this.f109534n;
        if (animEffectPlayer != null) {
            animEffectPlayer.m68504n();
        }
        AnimEffectPlayer animEffectPlayer2 = this.f109535o;
        if (animEffectPlayer2 != null) {
            animEffectPlayer2.m68504n();
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v7, types: [l.ho2] */
    /* JADX INFO: renamed from: m4 */
    public DialogC12611a m133082m4() {
        if (this.f109522C == null) {
            this.f109522C = new byr(this, m133076g4(act().inflater(), null));
            hxs.m133405r("context_single_room", this.f109537q, m206027E2().m132146l0().m60124fp().profileSmall());
            this.f109538r.setText(m206027E2().m132146l0().name);
            this.f109529i.setOnClickListener(new View.OnClickListener() { // from class: l.mt70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f135556a.m133087s4(view);
                }
            });
            this.f109546z.setOnClickListener(new View.OnClickListener() { // from class: l.nt70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f140445a.m133088t4(view);
                }
            });
            this.f109520A.setOnClickListener(new View.OnClickListener() { // from class: l.ot70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f145551a.m133089u4(view);
                }
            });
            this.f109530j.setOnClickListener(new View.OnClickListener() { // from class: l.pt70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f151123a.m133090v4(view);
                }
            });
            this.f109521B.setText(Html.fromHtml("匹配成功 <font color='#f36c4e'>5</font>秒后开始PK"));
        }
        return this.f109522C;
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
    }

    /* JADX INFO: renamed from: o4 */
    public final boolean m133083o4() {
        return this.f109526G == 4 && !TextUtils.isEmpty(this.f109525F);
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m133084p4(BLivePkSeek bLivePkSeek) {
        m206028F2().LivePkEvent.pkStateEvent().mo172463j(iat.m135196a(1));
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m133085q4(Throwable th) {
        m206028F2().LivePkEvent.pkStateEvent().mo172463j(iat.m135196a(1));
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m133086r4(hat hatVar, BLivePkInvite bLivePkInvite) {
        m206028F2().LivePkEvent.pkStateEvent().mo172463j(iat.m135196a(2));
        m133066J4(hatVar.f106832c, hatVar.f106831b, hatVar.f106830a, bLivePkInvite.f44425id);
        e30<BLivePkInvite> e30Var = hatVar.f106835f;
        if (e30Var != null) {
            e30Var.call(bLivePkInvite);
        }
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m133087s4(View view) {
        m133081l4();
    }

    /* JADX WARN: Type inference failed for: r0v43, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().LivePkEvent.createInvite().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.it70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f114862a.m133080k4((hat) obj);
            }
        }));
        duringCreated(m206028F2().LivePkEvent.pkPrepare().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.tt70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f171999a.m133061E4((PkData) obj);
            }
        }));
        duringCreated(m206028F2().LivePkEvent.pkOnceMoreSuccess().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.yt70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f199894a.m133034A4((soj0) obj);
            }
        }));
        duringCreated(m206028F2().LivePkEvent.showPkDialog().m172460g()).filter(new w9j() { // from class: l.zt70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((gat) obj).f101703a == 2);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.au70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71731a.m133059B4((gat) obj);
            }
        }));
        duringCreated(m206028F2().LivePkEvent.startRandomSeek().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.bu70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f77287a.m133070N4(((Integer) obj).intValue());
            }
        }));
        duringCreated(m206028F2().LivePkEvent.cancelMatch().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.cu70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f82532a.m133035C4((soj0) obj);
            }
        }));
        duringCreated(m206028F2().LivePkEvent.clickOnceMore().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.du70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87957a.m133062F4((User) obj);
            }
        }));
        duringCreated(m206027E2().m132160q1().m189074U()).subscribe(ffw.m121193d(new e30() { // from class: l.eu70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93219a.m133060D4((LivePkMessage) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m133088t4(View view) {
        m133078i4();
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m133089u4(View view) {
        m133070N4(this.f109528I);
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m133090v4(View view) {
        m133081l4();
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m133091w4(Long l2) {
        Button button = this.f109546z;
        Application application = ypv.f199497e;
        int i = R$string.f46926R1;
        StringBuilder sb = new StringBuilder();
        sb.append(l2.longValue() > 15 ? 0L : 15 - l2.longValue());
        sb.append("");
        button.setText(application.getString(i, sb.toString()));
        if (l2.longValue() >= 15) {
            m133078i4();
            lsi0.m151593w(R$string.f46615Ce);
        }
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m133092x4(Long l2) {
        m133071O4();
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m133093y4(Long l2) {
        m133081l4();
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m133094z4(BLivePkSeek bLivePkSeek) {
        if (bLivePkSeek == null) {
            u280.m191442a(new Throwable("seek is Null"));
        } else {
            m206028F2().LivePkEvent.pkStateEvent().mo172463j(iat.m135196a(2));
            m133067K4(bLivePkSeek);
        }
    }
}
