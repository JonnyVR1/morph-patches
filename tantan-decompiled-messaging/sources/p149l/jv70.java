package p149l;

import android.app.Application;
import android.graphics.Color;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
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
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.PkMatchLoadView;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.PkMatchProfileView;
import com.tencent.connect.common.Constants;
import java.util.concurrent.TimeUnit;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class jv70 extends pat<ho2> {

    /* JADX INFO: renamed from: A */
    public TextView f119889A;

    /* JADX INFO: renamed from: B */
    public DialogC12611a f119890B;

    /* JADX INFO: renamed from: C */
    public String f119891C;

    /* JADX INFO: renamed from: D */
    public c4g0 f119892D;

    /* JADX INFO: renamed from: E */
    public String f119893E;

    /* JADX INFO: renamed from: F */
    public int f119894F;

    /* JADX INFO: renamed from: G */
    public c4g0 f119895G;

    /* JADX INFO: renamed from: H */
    public int f119896H;

    /* JADX INFO: renamed from: i */
    public View f119897i;

    /* JADX INFO: renamed from: j */
    public ImageView f119898j;

    /* JADX INFO: renamed from: k */
    public VText f119899k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f119900l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f119901m;

    /* JADX INFO: renamed from: n */
    public VText f119902n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f119903o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f119904p;

    /* JADX INFO: renamed from: q */
    public PkMatchProfileView f119905q;

    /* JADX INFO: renamed from: r */
    public VImage f119906r;

    /* JADX INFO: renamed from: s */
    public VImage f119907s;

    /* JADX INFO: renamed from: t */
    public VImage f119908t;

    /* JADX INFO: renamed from: u */
    public VImage f119909u;

    /* JADX INFO: renamed from: v */
    public VText f119910v;

    /* JADX INFO: renamed from: w */
    public AnimEffectPlayer f119911w;

    /* JADX INFO: renamed from: x */
    public PkMatchLoadView f119912x;

    /* JADX INFO: renamed from: y */
    public Button f119913y;

    /* JADX INFO: renamed from: z */
    public Button f119914z;

    public jv70(bsm bsmVar) {
        super(bsmVar);
        this.f119894F = 0;
        this.f119896H = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public /* synthetic */ void m143422A4(soj0 soj0Var) {
        m143427G4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B4 */
    public /* synthetic */ void m143423B4(gat gatVar) {
        if (gatVar.f101704b) {
            m143478S4();
        } else {
            m143481l4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C4 */
    public /* synthetic */ void m143424C4(soj0 soj0Var) {
        m143480i4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D4 */
    public /* synthetic */ void m143425D4(LivePkMessage livePkMessage) {
        if (TextUtils.equals(livePkMessage.type, "pk_invite_reject")) {
            m143428H4(livePkMessage);
        } else if (TextUtils.equals(livePkMessage.type, "pk_seek_timeout")) {
            m143435O4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F4 */
    public void m143426F4(User user) {
        BLivePkInviteSource bLivePkInviteSource = BLivePkInviteSource.get(BLivePkInviteSource.onceMore);
        if (m143459o4()) {
            mm70.m155308d(this, true);
        } else {
            m206028F2().LivePkEvent.createInvite().mo172463j(new hat(user.f56011id, user.name, user.m60124fp().url, bLivePkInviteSource, true, null));
        }
    }

    /* JADX INFO: renamed from: G4 */
    private void m143427G4() {
        if (m143458n4()) {
            this.f119890B.dismiss();
        }
        mkd0.m154992z(this.f119895G);
        this.f119894F = 0;
    }

    /* JADX INFO: renamed from: H4 */
    private void m143428H4(LivePkMessage livePkMessage) {
        m206028F2().LivePkEvent.pkStateEvent().mo172463j(iat.m135196a(1));
        m143472I4(livePkMessage.f47752id);
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m143430K3(BLivePkInvite bLivePkInvite) {
    }

    /* JADX INFO: renamed from: M3 */
    public static /* synthetic */ void m143432M3(BLivePkSeek bLivePkSeek) {
    }

    /* JADX INFO: renamed from: O4 */
    private void m143435O4() {
        if (((Integer) m129297F3(new u180(600))).intValue() == 2) {
            m206028F2().LivePkEvent.pkStateEvent().mo172463j(iat.m135196a(1));
            m143475L4();
        }
    }

    /* JADX INFO: renamed from: P4 */
    private void m143437P4(User user) {
        hxs.m133405r("context_single_room", this.f119904p, user.m60124fp().profileSmall());
        this.f119910v.setText(user.name);
    }

    /* JADX INFO: renamed from: Q4 */
    private void m143438Q4(String str, String str2, String str3) {
        hxs.m133406s("context_single_room", this.f119904p, str3);
        this.f119910v.setText(str2);
    }

    /* JADX INFO: renamed from: R4 */
    private void m143440R4(String str, String str2, String str3) {
        if (str == null || str3 == null) {
            return;
        }
        m143438Q4(str, str2, str3);
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ BLivePkInvite m143441S3(String str, BLivePkInvite bLivePkInvite) {
        return (BLivePkInvite) ht70.m132852i("cancelInvite id:" + str, bLivePkInvite);
    }

    /* JADX INFO: renamed from: c4 */
    public static /* synthetic */ BLivePkSeek m143451c4(String str, BLivePkSeek bLivePkSeek) {
        return (BLivePkSeek) ht70.m132852i("cancelSeek id:" + str, bLivePkSeek);
    }

    /* JADX INFO: renamed from: h4 */
    private void m143455h4(final String str) {
        m206028F2().LivePkEvent.pkStateEvent().mo172463j(iat.m135196a(1));
        duringCreated(LivingNormalApiProvider.m71372W3(str)).map(new w9j() { // from class: l.iv70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return jv70.m143441S3(str, (BLivePkInvite) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.mu70
            @Override // p149l.e30
            public final void call(Object obj) {
                jv70.m143430K3((BLivePkInvite) obj);
            }
        }, new a280()));
    }

    /* JADX INFO: renamed from: j4 */
    private void m143456j4(final String str) {
        duringCreated(LivingNormalApiProvider.m71381X3(str)).map(new w9j() { // from class: l.nu70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return jv70.m143451c4(str, (BLivePkSeek) obj);
            }
        }).doOnNext(new e30() { // from class: l.ou70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f145675a.m143460p4((BLivePkSeek) obj);
            }
        }).doOnError(new e30() { // from class: l.pu70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f151255a.m143461q4((Throwable) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.qu70
            @Override // p149l.e30
            public final void call(Object obj) {
                jv70.m143432M3((BLivePkSeek) obj);
            }
        }, new a280()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public void m143457k4(final hat hatVar) {
        duringCreated(LivingNormalApiProvider.m71463g4(hatVar.f106832c, hatVar.f106833d, hatVar.f106834e)).subscribe(ffw.m121194e(new e30() { // from class: l.ru70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161036a.m143462r4(hatVar, (BLivePkInvite) obj);
            }
        }, new a280()));
    }

    /* JADX INFO: renamed from: n4 */
    private boolean m143458n4() {
        DialogC12611a dialogC12611a = this.f119890B;
        return dialogC12611a != null && dialogC12611a.isShowing();
    }

    /* JADX INFO: renamed from: o4 */
    private boolean m143459o4() {
        return this.f119894F == 4 && !TextUtils.isEmpty(this.f119893E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public /* synthetic */ void m143460p4(BLivePkSeek bLivePkSeek) {
        m206028F2().LivePkEvent.pkStateEvent().mo172463j(iat.m135196a(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q4 */
    public /* synthetic */ void m143461q4(Throwable th) {
        m206028F2().LivePkEvent.pkStateEvent().mo172463j(iat.m135196a(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r4 */
    public /* synthetic */ void m143462r4(hat hatVar, BLivePkInvite bLivePkInvite) {
        m206028F2().LivePkEvent.pkStateEvent().mo172463j(iat.m135196a(2));
        m143473J4(hatVar.f106832c, hatVar.f106831b, hatVar.f106830a, bLivePkInvite.f44425id);
        e30<BLivePkInvite> e30Var = hatVar.f106835f;
        if (e30Var != null) {
            e30Var.call(bLivePkInvite);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s4 */
    public /* synthetic */ void m143463s4(View view) {
        m143481l4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t4 */
    public /* synthetic */ void m143464t4(View view) {
        m143480i4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u4 */
    public /* synthetic */ void m143465u4(View view) {
        m143477N4(this.f119896H);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v4 */
    public /* synthetic */ void m143466v4(View view) {
        if (this.f119894F == 4 && !((Boolean) m129297F3(new k480(600))).booleanValue()) {
            mm70.m155309e(this, true);
        }
        m143480i4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w4 */
    public /* synthetic */ void m143467w4(Long l2) {
        Button button = this.f119913y;
        Application application = ypv.f199497e;
        int i = R$string.f46926R1;
        StringBuilder sb = new StringBuilder();
        sb.append(l2.longValue() > 15 ? 0L : 15 - l2.longValue());
        sb.append("");
        button.setText(application.getString(i, sb.toString()));
        if (l2.longValue() >= 15) {
            m143480i4();
            lsi0.m151593w(R$string.f46615Ce);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x4 */
    public /* synthetic */ void m143468x4(Long l2) {
        m143435O4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y4 */
    public /* synthetic */ void m143469y4(Long l2) {
        m143481l4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z4 */
    public /* synthetic */ void m143470z4(BLivePkSeek bLivePkSeek) {
        if (bLivePkSeek == null) {
            u280.m191442a(new Throwable("seek is Null"));
        } else {
            m206028F2().LivePkEvent.pkStateEvent().mo172463j(iat.m135196a(2));
            m143474K4(bLivePkSeek);
        }
    }

    /* JADX INFO: renamed from: E4 */
    public void m143471E4(PkData pkData) {
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
            m143482m4().show();
            m143437P4(userOtherUser);
            m143476M4(3);
            mkd0.m154992z(this.f119895G);
            return;
        }
        if (!m143482m4().isShowing()) {
            lsi0.m151593w(R$string.f46743Ia);
        } else {
            m143437P4(userOtherUser);
            m143476M4(3);
        }
    }

    /* JADX INFO: renamed from: I4 */
    public void m143472I4(String str) {
        if (this.f119894F == 4 && m143458n4() && TextUtils.equals(str, this.f119893E)) {
            xdl0.m208344M(this.f119914z, false);
            this.f119913y.setText(eat.f90249g);
            this.f119913y.setTextColor(Color.parseColor("#bfbfbf"));
            this.f119913y.setBackgroundResource(i3c0.f111070l0);
            this.f119913y.setEnabled(false);
            mkd0.m154992z(this.f119895G);
            this.f119912x.m76177d();
            xdl0.m208344M(this.f119912x, false);
            this.f119893E = null;
        }
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [l.ho2] */
    /* JADX INFO: renamed from: J4 */
    public void m143473J4(String str, String str2, String str3, String str4) {
        this.f119893E = str4;
        mkd0.m154992z(this.f119895G);
        this.f119895G = duringCreated(m206027E2().m132135h2(1, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.av70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71917a.m143467w4((Long) obj);
            }
        }));
        if (m143482m4() != null) {
            m143476M4(4);
            m143440R4(str, str2, str3);
        }
        m143478S4();
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [l.ho2] */
    /* JADX INFO: renamed from: K4 */
    public void m143474K4(BLivePkSeek bLivePkSeek) {
        this.f119891C = bLivePkSeek.f44428id;
        mkd0.m154992z(this.f119892D);
        this.f119892D = m129299H3(m206027E2().m132135h2(5, TimeUnit.MINUTES)).take(1).subscribe(ffw.m121193d(new e30() { // from class: l.zu70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204828a.m143468x4((Long) obj);
            }
        }));
        if (m143482m4() != null) {
            m143476M4(1);
        }
        m143478S4();
    }

    /* JADX INFO: renamed from: L4 */
    public void m143475L4() {
        if (m143482m4() == null) {
            return;
        }
        if (!m143482m4().isShowing()) {
            lsi0.m151593w(R$string.f46721Ha);
        }
        m143476M4(2);
    }

    /* JADX WARN: Type inference failed for: r7v31, types: [l.ho2] */
    /* JADX INFO: renamed from: M4 */
    public void m143476M4(int i) {
        ht70.m132855l(i);
        if (i == 1) {
            this.f119894F = i;
            this.f119899k.setText(R$string.f46956Sa);
            this.f119899k.setTextColor(Color.parseColor("#f57c00"));
            this.f119905q.m76211i();
            this.f119910v.setText(R$string.f47406n7);
            xdl0.m208344M(this.f119911w, false);
            xdl0.m208344M(this.f119904p, false);
            this.f119912x.m76183j();
            xdl0.m208344M(this.f119914z, false);
            xdl0.m208344M(this.f119913y, true);
            this.f119913y.setEnabled(true);
            this.f119913y.setText(R$string.f46947S1);
            this.f119913y.setTextColor(Color.parseColor("#212121"));
            this.f119913y.setBackgroundResource(i3c0.f110681D7);
            xdl0.m208344M(this.f119889A, false);
            return;
        }
        if (i == 2) {
            this.f119899k.setText(this.f119894F == 1 ? R$string.f46956Sa : R$string.f46611Ca);
            this.f119894F = i;
            this.f119899k.setTextColor(Color.parseColor("#f57c00"));
            this.f119905q.m76209g();
            xdl0.m208344M(this.f119904p, false);
            this.f119910v.setText(R$string.f46611Ca);
            xdl0.m208344M(this.f119911w, false);
            this.f119912x.m76184k();
            xdl0.m208344M(this.f119914z, true);
            xdl0.m208344M(this.f119913y, false);
            xdl0.m208344M(this.f119889A, false);
            return;
        }
        if (i == 3) {
            this.f119899k.setText(this.f119894F == 1 ? R$string.f46956Sa : R$string.f46611Ca);
            this.f119894F = i;
            this.f119899k.setTextColor(Color.parseColor("#f57c00"));
            this.f119905q.m76210h();
            this.f119911w.m68500j("https://auto.tancdn.com/v1/raw/dea9b7f8-1bdc-4260-8a16-3e18c3ca767910.so", 1);
            xdl0.m208344M(this.f119911w, true);
            this.f119912x.m76177d();
            xdl0.m208344M(this.f119904p, true);
            xdl0.m208344M(this.f119914z, false);
            xdl0.m208344M(this.f119913y, false);
            xdl0.m208344M(this.f119889A, true);
            m129299H3(m206027E2().m132135h2(3, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.m142408a()).take(1).subscribe(ffw.m121193d(new e30() { // from class: l.xu70
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f194477a.m143469y4((Long) obj);
                }
            }));
            return;
        }
        if (i != 4) {
            return;
        }
        this.f119894F = i;
        this.f119899k.setText(R$string.f46866O4);
        this.f119899k.setTextColor(Color.parseColor("#923bff"));
        xdl0.m208344M(this.f119905q, false);
        xdl0.m208344M(this.f119911w, false);
        xdl0.m208344M(this.f119904p, true);
        xdl0.m208344M(this.f119912x, true);
        this.f119912x.m76183j();
        xdl0.m208344M(this.f119914z, false);
        xdl0.m208344M(this.f119913y, true);
        this.f119913y.setEnabled(true);
        xdl0.m208344M(this.f119889A, false);
        this.f119913y.setBackgroundResource(i3c0.f110681D7);
        this.f119913y.setText(ypv.f199497e.getString(R$string.f46926R1, Constants.VIA_REPORT_TYPE_WPA_STATE));
        this.f119913y.setTextColor(Color.parseColor("#212121"));
    }

    /* JADX INFO: renamed from: N4 */
    public void m143477N4(int i) {
        this.f119896H = i;
        zvf0.m220396r("e_pk_start_randompk", mo77274R2());
        duringCreated(LivingNormalApiProvider.m71472h4(i)).subscribe(ffw.m121194e(new e30() { // from class: l.yu70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200054a.m143470z4((BLivePkSeek) obj);
            }
        }, new a280()));
    }

    /* JADX INFO: renamed from: S4 */
    public void m143478S4() {
        if (this.f119890B == null) {
            return;
        }
        if (this.f119891C != null && this.f119894F == 1) {
            this.f119905q.m76211i();
        }
        this.f119890B.show();
    }

    /* JADX INFO: renamed from: g4 */
    public View m143479g4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kv70.m147351b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i4 */
    public void m143480i4() {
        m143481l4();
        int i = this.f119894F;
        if (i == 1) {
            mkd0.m154992z(this.f119892D);
            String str = this.f119891C;
            if (str != null) {
                m143456j4(str);
                this.f119891C = null;
            }
        } else if (i == 4) {
            mkd0.m154992z(this.f119895G);
            String str2 = this.f119893E;
            if (str2 != null) {
                m143455h4(str2);
                this.f119893E = null;
            }
        }
        this.f119894F = 0;
    }

    /* JADX INFO: renamed from: l4 */
    public void m143481l4() {
        if (m143458n4()) {
            this.f119890B.dismiss();
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v7, types: [l.ho2] */
    /* JADX INFO: renamed from: m4 */
    public DialogC12611a m143482m4() {
        if (this.f119890B == null) {
            this.f119890B = new byr(this, m143479g4(act().inflater(), null));
            hxs.m133405r("context_single_room", this.f119901m, m206027E2().m132146l0().m60124fp().profileSmall());
            this.f119902n.setText(m206027E2().m132146l0().name);
            this.f119897i.setOnClickListener(new View.OnClickListener() { // from class: l.su70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f166454a.m143463s4(view);
                }
            });
            this.f119913y.setOnClickListener(new View.OnClickListener() { // from class: l.tu70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f172153a.m143464t4(view);
                }
            });
            this.f119914z.setOnClickListener(new View.OnClickListener() { // from class: l.uu70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f178325a.m143465u4(view);
                }
            });
            this.f119898j.setOnClickListener(new View.OnClickListener() { // from class: l.vu70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f183037a.m143466v4(view);
                }
            });
            this.f119889A.setText(Html.fromHtml(ypv.f199497e.getString(R$string.f46998Ua, " <font color='#f36c4e'>5</font> ")));
        }
        return this.f119890B;
    }

    /* JADX WARN: Type inference failed for: r0v43, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().LivePkEvent.createInvite().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.lu70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f130033a.m143457k4((hat) obj);
            }
        }));
        duringCreated(m206028F2().LivePkEvent.pkPrepare().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.wu70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f188094a.m143471E4((PkData) obj);
            }
        }));
        duringCreated(m206028F2().LivePkEvent.pkOnceMoreSuccess().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.bv70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f77408a.m143422A4((soj0) obj);
            }
        }));
        duringCreated(m206028F2().LivePkEvent.showPkDialog().m172460g()).filter(new w9j() { // from class: l.cv70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((gat) obj).f101703a == 2);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.dv70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88043a.m143423B4((gat) obj);
            }
        }));
        duringCreated(m206028F2().LivePkEvent.startRandomSeek().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.ev70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93319a.m143477N4(((Integer) obj).intValue());
            }
        }));
        duringCreated(m206028F2().LivePkEvent.cancelMatch().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.fv70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99409a.m143424C4((soj0) obj);
            }
        }));
        duringCreated(m206028F2().LivePkEvent.clickOnceMore().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.gv70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104540a.m143426F4((User) obj);
            }
        }));
        duringCreated(m206027E2().m132160q1().m189074U()).subscribe(ffw.m121193d(new e30() { // from class: l.hv70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109627a.m143425D4((LivePkMessage) obj);
            }
        }));
    }
}
