package p153l;

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
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLivePkInvite;
import com.p051p1.mobile.putong.live.base.data.BLivePkInviteSource;
import com.p051p1.mobile.putong.live.base.data.BLivePkSeek;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkData;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.PkMatchProfileBlackView;
import com.tencent.connect.common.Constants;
import java.util.concurrent.TimeUnit;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class n280 extends qct<oo2> {

    /* JADX INFO: renamed from: A */
    public Button f139823A;

    /* JADX INFO: renamed from: B */
    public TextView f139824B;

    /* JADX INFO: renamed from: C */
    public DialogC12774a f139825C;

    /* JADX INFO: renamed from: D */
    public String f139826D;

    /* JADX INFO: renamed from: E */
    public kcg0 f139827E;

    /* JADX INFO: renamed from: F */
    public String f139828F;

    /* JADX INFO: renamed from: G */
    public int f139829G;

    /* JADX INFO: renamed from: H */
    public kcg0 f139830H;

    /* JADX INFO: renamed from: I */
    public int f139831I;

    /* JADX INFO: renamed from: i */
    public View f139832i;

    /* JADX INFO: renamed from: j */
    public VImage f139833j;

    /* JADX INFO: renamed from: k */
    public TextView f139834k;

    /* JADX INFO: renamed from: l */
    public View f139835l;

    /* JADX INFO: renamed from: m */
    public View f139836m;

    /* JADX INFO: renamed from: n */
    public AnimEffectPlayer f139837n;

    /* JADX INFO: renamed from: o */
    public AnimEffectPlayer f139838o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f139839p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f139840q;

    /* JADX INFO: renamed from: r */
    public VText f139841r;

    /* JADX INFO: renamed from: s */
    public LinearLayout f139842s;

    /* JADX INFO: renamed from: t */
    public VDraweeView f139843t;

    /* JADX INFO: renamed from: u */
    public PkMatchProfileBlackView f139844u;

    /* JADX INFO: renamed from: v */
    public VDraweeView f139845v;

    /* JADX INFO: renamed from: w */
    public VDraweeView f139846w;

    /* JADX INFO: renamed from: x */
    public VImage f139847x;

    /* JADX INFO: renamed from: y */
    public VText f139848y;

    /* JADX INFO: renamed from: z */
    public Button f139849z;

    /* JADX INFO: renamed from: l.n280$a */
    public class C18766a extends wo0 {
        public C18766a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j */
        public /* synthetic */ void m161218j() {
            bnl0.m105524M(n280.this.f139837n, true);
            bnl0.m105524M(n280.this.f139838o, false);
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: d */
        public void mo71712d(@NonNull so0 so0Var) {
            super.mo71712d(so0Var);
            n280.this.f139837n.postDelayed(new Runnable() { // from class: l.m280
                @Override // java.lang.Runnable
                public final void run() {
                    this.f134531a.m161218j();
                }
            }, 200L);
        }
    }

    public n280(dum dumVar) {
        super(dumVar);
        this.f139829G = 0;
        this.f139831I = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public /* synthetic */ void m161156A4(vxj0 vxj0Var) {
        m161185G4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C4 */
    public /* synthetic */ void m161157C4(vxj0 vxj0Var) {
        m161200i4();
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ BLivePkInvite m161160L3(String str, BLivePkInvite bLivePkInvite) {
        return (BLivePkInvite) n180.m161092i("cancelInvite id:" + str, bLivePkInvite);
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m161163O3(BLivePkSeek bLivePkSeek) {
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ void m161169V3(BLivePkInvite bLivePkInvite) {
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ BLivePkSeek m161170W3(String str, BLivePkSeek bLivePkSeek) {
        return (BLivePkSeek) n180.m161092i("cancelSeek id:" + str, bLivePkSeek);
    }

    /* JADX INFO: renamed from: n4 */
    private boolean m161180n4() {
        DialogC12774a dialogC12774a = this.f139825C;
        return dialogC12774a != null && dialogC12774a.isShowing();
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m161181B4(hct hctVar) {
        if (hctVar.f108746b) {
            m161197S4();
        } else {
            m161203l4();
        }
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m161182D4(LivePkMessage livePkMessage) {
        if (TextUtils.equals(livePkMessage.type, "pk_invite_reject")) {
            m161186H4(livePkMessage);
        } else if (TextUtils.equals(livePkMessage.type, "pk_seek_timeout")) {
            m161193O4();
        }
    }

    /* JADX INFO: renamed from: E4 */
    public void m161183E4(PkData pkData) {
        if (pkData == null) {
            ab80.m96733a(new Throwable("pk create pkinfo is null"));
            return;
        }
        User userOtherUser = pkData.otherUser();
        if (userOtherUser == null) {
            ab80.m96733a(new Throwable("user is null"));
            return;
        }
        if (TEnum.equals(pkData.f52415pk.categoryV2, "specified")) {
            m161204m4().show();
            m161194P4(userOtherUser);
            m161191M4(3);
            psd0.m173633z(this.f139830H);
            return;
        }
        if (!m161204m4().isShowing()) {
            o1j0.m165649w(R$string.f47591Ia);
        } else {
            m161194P4(userOtherUser);
            m161191M4(3);
        }
    }

    /* JADX INFO: renamed from: F4 */
    public final void m161184F4(User user) {
        BLivePkInviteSource bLivePkInviteSource = BLivePkInviteSource.get(BLivePkInviteSource.onceMore);
        if (m161205o4()) {
            su70.m187996d(this, true);
        } else {
            m213811F2().LivePkEvent.createInvite().mo199273j(new ict(user.f56859id, user.name, user.m61308fp().originUrl, bLivePkInviteSource, true, null));
        }
    }

    /* JADX INFO: renamed from: G4 */
    public final void m161185G4() {
        if (m161180n4()) {
            this.f139825C.dismiss();
        }
        psd0.m173633z(this.f139830H);
        this.f139829G = 0;
    }

    /* JADX INFO: renamed from: H4 */
    public final void m161186H4(LivePkMessage livePkMessage) {
        m213811F2().LivePkEvent.pkStateEvent().mo199273j(jct.m144374a(1));
        m161187I4(livePkMessage.f48600id);
    }

    /* JADX INFO: renamed from: I4 */
    public void m161187I4(String str) {
        if (this.f139829G == 4 && m161180n4() && TextUtils.equals(str, this.f139828F)) {
            bnl0.m105524M(this.f139823A, false);
            this.f139849z.setText(fct.f98267g);
            this.f139849z.setEnabled(false);
            psd0.m173633z(this.f139830H);
            this.f139828F = null;
        }
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [l.oo2] */
    /* JADX INFO: renamed from: J4 */
    public void m161188J4(String str, String str2, String str3, String str4) {
        this.f139828F = str4;
        psd0.m173633z(this.f139830H);
        this.f139830H = duringCreated(m213810E2().m168521h2(1, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.d280
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84760a.m161213w4((Long) obj);
            }
        }));
        if (m161204m4() != null) {
            m161191M4(4);
            m161196R4(str, str2, str3);
        }
        m161197S4();
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [l.oo2] */
    /* JADX INFO: renamed from: K4 */
    public void m161189K4(BLivePkSeek bLivePkSeek) {
        this.f139826D = bLivePkSeek.f45276id;
        psd0.m173633z(this.f139827E);
        this.f139827E = m138858H3(m213810E2().m168521h2(5, TimeUnit.MINUTES)).take(1).subscribe(dhw.m115825d(new y20() { // from class: l.c280
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79455a.m161214x4((Long) obj);
            }
        }));
        if (m161204m4() != null) {
            m161191M4(1);
        }
        m161197S4();
    }

    /* JADX INFO: renamed from: L4 */
    public void m161190L4() {
        if (m161204m4() == null) {
            return;
        }
        if (!m161204m4().isShowing()) {
            o1j0.m165649w(R$string.f47569Ha);
        }
        m161191M4(2);
    }

    /* JADX WARN: Type inference failed for: r9v30, types: [l.oo2] */
    /* JADX INFO: renamed from: M4 */
    public void m161191M4(int i) {
        n180.m161095l(i);
        if (i == 1) {
            this.f139829G = i;
            int i2 = this.f139831I;
            TextView textView = this.f139834k;
            if (i2 == 4) {
                textView.setText("PK排位赛");
            } else {
                textView.setText(R$string.f47804Sa);
            }
            this.f139844u.m77384q();
            this.f139848y.setText("正在匹配中");
            bnl0.m105524M(this.f139844u, false);
            bnl0.m105524M(this.f139837n, false);
            bnl0.m105524M(this.f139838o, true);
            this.f139838o.m69683j("https://auto.tancdn.com/v1/raw/a5bfc1eb-a860-4bbb-8e22-dc109e4c751e13.so", -1);
            bnl0.m105524M(this.f139843t, false);
            bnl0.m105524M(this.f139823A, false);
            bnl0.m105524M(this.f139849z, true);
            this.f139849z.setEnabled(true);
            this.f139849z.setText(R$string.f47961a);
            bnl0.m105524M(this.f139824B, false);
            return;
        }
        if (i == 2) {
            if (this.f139829G == 1) {
                int i3 = this.f139831I;
                TextView textView2 = this.f139834k;
                if (i3 == 4) {
                    textView2.setText("PK排位赛");
                } else {
                    textView2.setText(R$string.f47804Sa);
                }
            } else {
                this.f139834k.setText(R$string.f47459Ca);
            }
            this.f139829G = i;
            this.f139844u.m77382o();
            bnl0.m105524M(this.f139843t, false);
            this.f139848y.setText("匹配失败");
            bnl0.m105524M(this.f139844u, true);
            bnl0.m105524M(this.f139837n, false);
            bnl0.m105524M(this.f139838o, true);
            this.f139838o.m69683j("https://auto.tancdn.com/v1/raw/a5bfc1eb-a860-4bbb-8e22-dc109e4c751e13.so", -1);
            bnl0.m105524M(this.f139823A, true);
            bnl0.m105524M(this.f139849z, false);
            bnl0.m105524M(this.f139824B, false);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            this.f139829G = i;
            this.f139834k.setText(R$string.f47714O4);
            bnl0.m105524M(this.f139844u, false);
            bnl0.m105524M(this.f139837n, false);
            bnl0.m105524M(this.f139838o, true);
            this.f139838o.m69683j("https://auto.tancdn.com/v1/raw/a5bfc1eb-a860-4bbb-8e22-dc109e4c751e13.so", -1);
            bnl0.m105524M(this.f139843t, true);
            bnl0.m105524M(this.f139823A, false);
            bnl0.m105524M(this.f139849z, true);
            this.f139849z.setEnabled(true);
            bnl0.m105524M(this.f139824B, false);
            this.f139849z.setText(zrv.f205803e.getString(R$string.f47774R1, Constants.VIA_REPORT_TYPE_WPA_STATE));
            return;
        }
        if (this.f139829G == 1) {
            int i4 = this.f139831I;
            TextView textView3 = this.f139834k;
            if (i4 == 4) {
                textView3.setText("PK排位赛");
            } else {
                textView3.setText(R$string.f47804Sa);
            }
        } else {
            this.f139834k.setText(R$string.f47459Ca);
        }
        this.f139829G = i;
        bnl0.m105524M(this.f139844u, true);
        this.f139844u.m77383p();
        this.f139837n.mo69685l("https://auto.tancdn.com/v1/raw/8b07635e-e8c6-4ac2-bb5c-9808e95d178212.so", -1, new C18766a());
        bnl0.m105524M(this.f139843t, true);
        bnl0.m105524M(this.f139823A, false);
        bnl0.m105524M(this.f139849z, false);
        bnl0.m105524M(this.f139824B, true);
        m138858H3(m213810E2().m168521h2(3, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(fo0.m126432a()).take(1).subscribe(dhw.m115825d(new y20() { // from class: l.r180
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f160783a.m161215y4((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N4 */
    public void m161192N4(int i) {
        this.f139831I = i;
        if (i == 4) {
            i4g0.m138520r("e_pk_start_qualifyingpk", mo78457R2());
        } else {
            i4g0.m138520r("e_pk_start_randompk", mo78457R2());
        }
        duringCreated(LivingNormalApiProvider.m72655h4(i)).subscribe(dhw.m115826e(new y20() { // from class: l.l280
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129755a.m161216z4((BLivePkSeek) obj);
            }
        }, new ga80()));
    }

    /* JADX INFO: renamed from: O4 */
    public final void m161193O4() {
        if (((Integer) m138856F3(new aa80(600))).intValue() == 2) {
            m213811F2().LivePkEvent.pkStateEvent().mo199273j(jct.m144374a(1));
            m161190L4();
        }
    }

    /* JADX INFO: renamed from: P4 */
    public final void m161194P4(User user) {
        izs.m142867r("context_single_room", this.f139843t, user.m61308fp().profileSmall());
        this.f139848y.setText(user.name);
    }

    /* JADX INFO: renamed from: Q4 */
    public final void m161195Q4(String str, String str2, String str3) {
        izs.m142868s("context_single_room", this.f139843t, str3);
        this.f139848y.setText(str2);
    }

    /* JADX INFO: renamed from: R4 */
    public final void m161196R4(String str, String str2, String str3) {
        if (str == null || str3 == null) {
            return;
        }
        m161195Q4(str, str2, str3);
    }

    /* JADX INFO: renamed from: S4 */
    public void m161197S4() {
        if (this.f139825C == null) {
            return;
        }
        if (this.f139826D != null && this.f139829G == 1) {
            this.f139844u.m77384q();
        }
        this.f139825C.show();
    }

    /* JADX INFO: renamed from: g4 */
    public View m161198g4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return o280.m165702b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: h4 */
    public final void m161199h4(final String str) {
        m213811F2().LivePkEvent.pkStateEvent().mo199273j(jct.m144374a(1));
        duringCreated(LivingNormalApiProvider.m72555W3(str)).map(new qcj() { // from class: l.p180
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return n280.m161160L3(str, (BLivePkInvite) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.q180
            @Override // p153l.y20
            public final void call(Object obj) {
                n280.m161169V3((BLivePkInvite) obj);
            }
        }, new ga80()));
    }

    /* JADX INFO: renamed from: i4 */
    public void m161200i4() {
        m161203l4();
        int i = this.f139829G;
        if (i == 1) {
            psd0.m173633z(this.f139827E);
            String str = this.f139826D;
            if (str != null) {
                m161201j4(str);
                this.f139826D = null;
            }
        } else if (i == 4) {
            psd0.m173633z(this.f139830H);
            String str2 = this.f139828F;
            if (str2 != null) {
                m161199h4(str2);
                this.f139828F = null;
            }
        }
        this.f139829G = 0;
    }

    /* JADX INFO: renamed from: j4 */
    public final void m161201j4(final String str) {
        duringCreated(LivingNormalApiProvider.m72564X3(str)).map(new qcj() { // from class: l.x180
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return n280.m161170W3(str, (BLivePkSeek) obj);
            }
        }).doOnNext(new y20() { // from class: l.y180
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197083a.m161206p4((BLivePkSeek) obj);
            }
        }).doOnError(new y20() { // from class: l.a280
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f67944a.m161207q4((Throwable) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.b280
            @Override // p153l.y20
            public final void call(Object obj) {
                n280.m161163O3((BLivePkSeek) obj);
            }
        }, new ga80()));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m161202k4(final ict ictVar) {
        duringCreated(LivingNormalApiProvider.m72646g4(ictVar.f114440c, ictVar.f114441d, ictVar.f114442e)).subscribe(dhw.m115826e(new y20() { // from class: l.w180
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186772a.m161208r4(ictVar, (BLivePkInvite) obj);
            }
        }, new ga80()));
    }

    /* JADX INFO: renamed from: l4 */
    public void m161203l4() {
        if (m161180n4()) {
            this.f139844u.m77385r();
            this.f139825C.dismiss();
        }
        AnimEffectPlayer animEffectPlayer = this.f139837n;
        if (animEffectPlayer != null) {
            animEffectPlayer.m69687n();
        }
        AnimEffectPlayer animEffectPlayer2 = this.f139838o;
        if (animEffectPlayer2 != null) {
            animEffectPlayer2.m69687n();
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v7, types: [l.oo2] */
    /* JADX INFO: renamed from: m4 */
    public DialogC12774a m161204m4() {
        if (this.f139825C == null) {
            this.f139825C = new c0s(this, m161198g4(act().inflater(), null));
            izs.m142867r("context_single_room", this.f139840q, m213810E2().m168532l0().m61308fp().profileSmall());
            this.f139841r.setText(m213810E2().m168532l0().name);
            this.f139832i.setOnClickListener(new View.OnClickListener() { // from class: l.s180
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f165761a.m161209s4(view);
                }
            });
            this.f139849z.setOnClickListener(new View.OnClickListener() { // from class: l.t180
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f171608a.m161210t4(view);
                }
            });
            this.f139823A.setOnClickListener(new View.OnClickListener() { // from class: l.u180
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f176979a.m161211u4(view);
                }
            });
            this.f139833j.setOnClickListener(new View.OnClickListener() { // from class: l.v180
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f181938a.m161212v4(view);
                }
            });
            this.f139824B.setText(Html.fromHtml("匹配成功 <font color='#f36c4e'>5</font>秒后开始PK"));
        }
        return this.f139825C;
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
    }

    /* JADX INFO: renamed from: o4 */
    public final boolean m161205o4() {
        return this.f139829G == 4 && !TextUtils.isEmpty(this.f139828F);
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m161206p4(BLivePkSeek bLivePkSeek) {
        m213811F2().LivePkEvent.pkStateEvent().mo199273j(jct.m144374a(1));
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m161207q4(Throwable th) {
        m213811F2().LivePkEvent.pkStateEvent().mo199273j(jct.m144374a(1));
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m161208r4(ict ictVar, BLivePkInvite bLivePkInvite) {
        m213811F2().LivePkEvent.pkStateEvent().mo199273j(jct.m144374a(2));
        m161188J4(ictVar.f114440c, ictVar.f114439b, ictVar.f114438a, bLivePkInvite.f45273id);
        y20<BLivePkInvite> y20Var = ictVar.f114443f;
        if (y20Var != null) {
            y20Var.call(bLivePkInvite);
        }
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m161209s4(View view) {
        m161203l4();
    }

    /* JADX WARN: Type inference failed for: r0v43, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().LivePkEvent.createInvite().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.o180
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f144629a.m161202k4((ict) obj);
            }
        }));
        duringCreated(m213811F2().LivePkEvent.pkPrepare().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.z180
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f202491a.m161183E4((PkData) obj);
            }
        }));
        duringCreated(m213811F2().LivePkEvent.pkOnceMoreSuccess().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.e280
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91709a.m161156A4((vxj0) obj);
            }
        }));
        duringCreated(m213811F2().LivePkEvent.showPkDialog().m199270g()).filter(new qcj() { // from class: l.f280
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((hct) obj).f108745a == 2);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.g280
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101814a.m161181B4((hct) obj);
            }
        }));
        duringCreated(m213811F2().LivePkEvent.startRandomSeek().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.h280
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107529a.m161192N4(((Integer) obj).intValue());
            }
        }));
        duringCreated(m213811F2().LivePkEvent.cancelMatch().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.i280
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112589a.m161157C4((vxj0) obj);
            }
        }));
        duringCreated(m213811F2().LivePkEvent.clickOnceMore().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.j280
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118038a.m161184F4((User) obj);
            }
        }));
        duringCreated(m213810E2().m168545q1().m98256U()).subscribe(dhw.m115825d(new y20() { // from class: l.k280
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123581a.m161182D4((LivePkMessage) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m161210t4(View view) {
        m161200i4();
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m161211u4(View view) {
        m161192N4(this.f139831I);
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m161212v4(View view) {
        m161203l4();
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m161213w4(Long l2) {
        Button button = this.f139849z;
        Application application = zrv.f205803e;
        int i = R$string.f47774R1;
        StringBuilder sb = new StringBuilder();
        sb.append(l2.longValue() > 15 ? 0L : 15 - l2.longValue());
        sb.append("");
        button.setText(application.getString(i, sb.toString()));
        if (l2.longValue() >= 15) {
            m161200i4();
            o1j0.m165649w(R$string.f47463Ce);
        }
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m161214x4(Long l2) {
        m161193O4();
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m161215y4(Long l2) {
        m161203l4();
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m161216z4(BLivePkSeek bLivePkSeek) {
        if (bLivePkSeek == null) {
            ab80.m96733a(new Throwable("seek is Null"));
        } else {
            m213811F2().LivePkEvent.pkStateEvent().mo199273j(jct.m144374a(2));
            m161189K4(bLivePkSeek);
        }
    }
}
