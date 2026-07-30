package p153l;

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
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.PkMatchLoadView;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.PkMatchProfileView;
import com.tencent.connect.common.Constants;
import java.util.concurrent.TimeUnit;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class p380 extends qct<oo2> {

    /* JADX INFO: renamed from: A */
    public TextView f150364A;

    /* JADX INFO: renamed from: B */
    public DialogC12774a f150365B;

    /* JADX INFO: renamed from: C */
    public String f150366C;

    /* JADX INFO: renamed from: D */
    public kcg0 f150367D;

    /* JADX INFO: renamed from: E */
    public String f150368E;

    /* JADX INFO: renamed from: F */
    public int f150369F;

    /* JADX INFO: renamed from: G */
    public kcg0 f150370G;

    /* JADX INFO: renamed from: H */
    public int f150371H;

    /* JADX INFO: renamed from: i */
    public View f150372i;

    /* JADX INFO: renamed from: j */
    public ImageView f150373j;

    /* JADX INFO: renamed from: k */
    public VText f150374k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f150375l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f150376m;

    /* JADX INFO: renamed from: n */
    public VText f150377n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f150378o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f150379p;

    /* JADX INFO: renamed from: q */
    public PkMatchProfileView f150380q;

    /* JADX INFO: renamed from: r */
    public VImage f150381r;

    /* JADX INFO: renamed from: s */
    public VImage f150382s;

    /* JADX INFO: renamed from: t */
    public VImage f150383t;

    /* JADX INFO: renamed from: u */
    public VImage f150384u;

    /* JADX INFO: renamed from: v */
    public VText f150385v;

    /* JADX INFO: renamed from: w */
    public AnimEffectPlayer f150386w;

    /* JADX INFO: renamed from: x */
    public PkMatchLoadView f150387x;

    /* JADX INFO: renamed from: y */
    public Button f150388y;

    /* JADX INFO: renamed from: z */
    public Button f150389z;

    public p380(dum dumVar) {
        super(dumVar);
        this.f150369F = 0;
        this.f150371H = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public /* synthetic */ void m170424A4(vxj0 vxj0Var) {
        m170429G4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B4 */
    public /* synthetic */ void m170425B4(hct hctVar) {
        if (hctVar.f108746b) {
            m170480S4();
        } else {
            m170483l4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C4 */
    public /* synthetic */ void m170426C4(vxj0 vxj0Var) {
        m170482i4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D4 */
    public /* synthetic */ void m170427D4(LivePkMessage livePkMessage) {
        if (TextUtils.equals(livePkMessage.type, "pk_invite_reject")) {
            m170430H4(livePkMessage);
        } else if (TextUtils.equals(livePkMessage.type, "pk_seek_timeout")) {
            m170437O4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F4 */
    public void m170428F4(User user) {
        BLivePkInviteSource bLivePkInviteSource = BLivePkInviteSource.get(BLivePkInviteSource.onceMore);
        if (m170461o4()) {
            su70.m187996d(this, true);
        } else {
            m213811F2().LivePkEvent.createInvite().mo199273j(new ict(user.f56859id, user.name, user.m61308fp().url, bLivePkInviteSource, true, null));
        }
    }

    /* JADX INFO: renamed from: G4 */
    private void m170429G4() {
        if (m170460n4()) {
            this.f150365B.dismiss();
        }
        psd0.m173633z(this.f150370G);
        this.f150369F = 0;
    }

    /* JADX INFO: renamed from: H4 */
    private void m170430H4(LivePkMessage livePkMessage) {
        m213811F2().LivePkEvent.pkStateEvent().mo199273j(jct.m144374a(1));
        m170474I4(livePkMessage.f48600id);
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m170432K3(BLivePkInvite bLivePkInvite) {
    }

    /* JADX INFO: renamed from: M3 */
    public static /* synthetic */ void m170434M3(BLivePkSeek bLivePkSeek) {
    }

    /* JADX INFO: renamed from: O4 */
    private void m170437O4() {
        if (((Integer) m138856F3(new aa80(600))).intValue() == 2) {
            m213811F2().LivePkEvent.pkStateEvent().mo199273j(jct.m144374a(1));
            m170477L4();
        }
    }

    /* JADX INFO: renamed from: P4 */
    private void m170439P4(User user) {
        izs.m142867r("context_single_room", this.f150379p, user.m61308fp().profileSmall());
        this.f150385v.setText(user.name);
    }

    /* JADX INFO: renamed from: Q4 */
    private void m170440Q4(String str, String str2, String str3) {
        izs.m142868s("context_single_room", this.f150379p, str3);
        this.f150385v.setText(str2);
    }

    /* JADX INFO: renamed from: R4 */
    private void m170442R4(String str, String str2, String str3) {
        if (str == null || str3 == null) {
            return;
        }
        m170440Q4(str, str2, str3);
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ BLivePkInvite m170443S3(String str, BLivePkInvite bLivePkInvite) {
        return (BLivePkInvite) n180.m161092i("cancelInvite id:" + str, bLivePkInvite);
    }

    /* JADX INFO: renamed from: c4 */
    public static /* synthetic */ BLivePkSeek m170453c4(String str, BLivePkSeek bLivePkSeek) {
        return (BLivePkSeek) n180.m161092i("cancelSeek id:" + str, bLivePkSeek);
    }

    /* JADX INFO: renamed from: h4 */
    private void m170457h4(final String str) {
        m213811F2().LivePkEvent.pkStateEvent().mo199273j(jct.m144374a(1));
        duringCreated(LivingNormalApiProvider.m72555W3(str)).map(new qcj() { // from class: l.o380
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return p380.m170443S3(str, (BLivePkInvite) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.s280
            @Override // p153l.y20
            public final void call(Object obj) {
                p380.m170432K3((BLivePkInvite) obj);
            }
        }, new ga80()));
    }

    /* JADX INFO: renamed from: j4 */
    private void m170458j4(final String str) {
        duringCreated(LivingNormalApiProvider.m72564X3(str)).map(new qcj() { // from class: l.t280
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return p380.m170453c4(str, (BLivePkSeek) obj);
            }
        }).doOnNext(new y20() { // from class: l.u280
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f177191a.m170462p4((BLivePkSeek) obj);
            }
        }).doOnError(new y20() { // from class: l.v280
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182084a.m170463q4((Throwable) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.w280
            @Override // p153l.y20
            public final void call(Object obj) {
                p380.m170434M3((BLivePkSeek) obj);
            }
        }, new ga80()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public void m170459k4(final ict ictVar) {
        duringCreated(LivingNormalApiProvider.m72646g4(ictVar.f114440c, ictVar.f114441d, ictVar.f114442e)).subscribe(dhw.m115826e(new y20() { // from class: l.x280
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192131a.m170464r4(ictVar, (BLivePkInvite) obj);
            }
        }, new ga80()));
    }

    /* JADX INFO: renamed from: n4 */
    private boolean m170460n4() {
        DialogC12774a dialogC12774a = this.f150365B;
        return dialogC12774a != null && dialogC12774a.isShowing();
    }

    /* JADX INFO: renamed from: o4 */
    private boolean m170461o4() {
        return this.f150369F == 4 && !TextUtils.isEmpty(this.f150368E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public /* synthetic */ void m170462p4(BLivePkSeek bLivePkSeek) {
        m213811F2().LivePkEvent.pkStateEvent().mo199273j(jct.m144374a(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q4 */
    public /* synthetic */ void m170463q4(Throwable th) {
        m213811F2().LivePkEvent.pkStateEvent().mo199273j(jct.m144374a(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r4 */
    public /* synthetic */ void m170464r4(ict ictVar, BLivePkInvite bLivePkInvite) {
        m213811F2().LivePkEvent.pkStateEvent().mo199273j(jct.m144374a(2));
        m170475J4(ictVar.f114440c, ictVar.f114439b, ictVar.f114438a, bLivePkInvite.f45273id);
        y20<BLivePkInvite> y20Var = ictVar.f114443f;
        if (y20Var != null) {
            y20Var.call(bLivePkInvite);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s4 */
    public /* synthetic */ void m170465s4(View view) {
        m170483l4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t4 */
    public /* synthetic */ void m170466t4(View view) {
        m170482i4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u4 */
    public /* synthetic */ void m170467u4(View view) {
        m170479N4(this.f150371H);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v4 */
    public /* synthetic */ void m170468v4(View view) {
        if (this.f150369F == 4 && !((Boolean) m138856F3(new qc80(600))).booleanValue()) {
            su70.m187997e(this, true);
        }
        m170482i4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w4 */
    public /* synthetic */ void m170469w4(Long l2) {
        Button button = this.f150388y;
        Application application = zrv.f205803e;
        int i = R$string.f47774R1;
        StringBuilder sb = new StringBuilder();
        sb.append(l2.longValue() > 15 ? 0L : 15 - l2.longValue());
        sb.append("");
        button.setText(application.getString(i, sb.toString()));
        if (l2.longValue() >= 15) {
            m170482i4();
            o1j0.m165649w(R$string.f47463Ce);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x4 */
    public /* synthetic */ void m170470x4(Long l2) {
        m170437O4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y4 */
    public /* synthetic */ void m170471y4(Long l2) {
        m170483l4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z4 */
    public /* synthetic */ void m170472z4(BLivePkSeek bLivePkSeek) {
        if (bLivePkSeek == null) {
            ab80.m96733a(new Throwable("seek is Null"));
        } else {
            m213811F2().LivePkEvent.pkStateEvent().mo199273j(jct.m144374a(2));
            m170476K4(bLivePkSeek);
        }
    }

    /* JADX INFO: renamed from: E4 */
    public void m170473E4(PkData pkData) {
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
            m170484m4().show();
            m170439P4(userOtherUser);
            m170478M4(3);
            psd0.m173633z(this.f150370G);
            return;
        }
        if (!m170484m4().isShowing()) {
            o1j0.m165649w(R$string.f47591Ia);
        } else {
            m170439P4(userOtherUser);
            m170478M4(3);
        }
    }

    /* JADX INFO: renamed from: I4 */
    public void m170474I4(String str) {
        if (this.f150369F == 4 && m170460n4() && TextUtils.equals(str, this.f150368E)) {
            bnl0.m105524M(this.f150389z, false);
            this.f150388y.setText(fct.f98267g);
            this.f150388y.setTextColor(Color.parseColor("#bfbfbf"));
            this.f150388y.setBackgroundResource(obc0.f146398l0);
            this.f150388y.setEnabled(false);
            psd0.m173633z(this.f150370G);
            this.f150387x.m77360d();
            bnl0.m105524M(this.f150387x, false);
            this.f150368E = null;
        }
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [l.oo2] */
    /* JADX INFO: renamed from: J4 */
    public void m170475J4(String str, String str2, String str3, String str4) {
        this.f150368E = str4;
        psd0.m173633z(this.f150370G);
        this.f150370G = duringCreated(m213810E2().m168521h2(1, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.g380
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101966a.m170469w4((Long) obj);
            }
        }));
        if (m170484m4() != null) {
            m170478M4(4);
            m170442R4(str, str2, str3);
        }
        m170480S4();
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [l.oo2] */
    /* JADX INFO: renamed from: K4 */
    public void m170476K4(BLivePkSeek bLivePkSeek) {
        this.f150366C = bLivePkSeek.f45276id;
        psd0.m173633z(this.f150367D);
        this.f150367D = m138858H3(m213810E2().m168521h2(5, TimeUnit.MINUTES)).take(1).subscribe(dhw.m115825d(new y20() { // from class: l.f380
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96974a.m170470x4((Long) obj);
            }
        }));
        if (m170484m4() != null) {
            m170478M4(1);
        }
        m170480S4();
    }

    /* JADX INFO: renamed from: L4 */
    public void m170477L4() {
        if (m170484m4() == null) {
            return;
        }
        if (!m170484m4().isShowing()) {
            o1j0.m165649w(R$string.f47569Ha);
        }
        m170478M4(2);
    }

    /* JADX WARN: Type inference failed for: r7v31, types: [l.oo2] */
    /* JADX INFO: renamed from: M4 */
    public void m170478M4(int i) {
        n180.m161095l(i);
        if (i == 1) {
            this.f150369F = i;
            this.f150374k.setText(R$string.f47804Sa);
            this.f150374k.setTextColor(Color.parseColor("#f57c00"));
            this.f150380q.m77394i();
            this.f150385v.setText(R$string.f48254n7);
            bnl0.m105524M(this.f150386w, false);
            bnl0.m105524M(this.f150379p, false);
            this.f150387x.m77366j();
            bnl0.m105524M(this.f150389z, false);
            bnl0.m105524M(this.f150388y, true);
            this.f150388y.setEnabled(true);
            this.f150388y.setText(R$string.f47795S1);
            this.f150388y.setTextColor(Color.parseColor("#212121"));
            this.f150388y.setBackgroundResource(obc0.f146009D7);
            bnl0.m105524M(this.f150364A, false);
            return;
        }
        if (i == 2) {
            this.f150374k.setText(this.f150369F == 1 ? R$string.f47804Sa : R$string.f47459Ca);
            this.f150369F = i;
            this.f150374k.setTextColor(Color.parseColor("#f57c00"));
            this.f150380q.m77392g();
            bnl0.m105524M(this.f150379p, false);
            this.f150385v.setText(R$string.f47459Ca);
            bnl0.m105524M(this.f150386w, false);
            this.f150387x.m77367k();
            bnl0.m105524M(this.f150389z, true);
            bnl0.m105524M(this.f150388y, false);
            bnl0.m105524M(this.f150364A, false);
            return;
        }
        if (i == 3) {
            this.f150374k.setText(this.f150369F == 1 ? R$string.f47804Sa : R$string.f47459Ca);
            this.f150369F = i;
            this.f150374k.setTextColor(Color.parseColor("#f57c00"));
            this.f150380q.m77393h();
            this.f150386w.m69683j("https://auto.tancdn.com/v1/raw/dea9b7f8-1bdc-4260-8a16-3e18c3ca767910.so", 1);
            bnl0.m105524M(this.f150386w, true);
            this.f150387x.m77360d();
            bnl0.m105524M(this.f150379p, true);
            bnl0.m105524M(this.f150389z, false);
            bnl0.m105524M(this.f150388y, false);
            bnl0.m105524M(this.f150364A, true);
            m138858H3(m213810E2().m168521h2(3, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(fo0.m126432a()).take(1).subscribe(dhw.m115825d(new y20() { // from class: l.d380
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f84874a.m170471y4((Long) obj);
                }
            }));
            return;
        }
        if (i != 4) {
            return;
        }
        this.f150369F = i;
        this.f150374k.setText(R$string.f47714O4);
        this.f150374k.setTextColor(Color.parseColor("#923bff"));
        bnl0.m105524M(this.f150380q, false);
        bnl0.m105524M(this.f150386w, false);
        bnl0.m105524M(this.f150379p, true);
        bnl0.m105524M(this.f150387x, true);
        this.f150387x.m77366j();
        bnl0.m105524M(this.f150389z, false);
        bnl0.m105524M(this.f150388y, true);
        this.f150388y.setEnabled(true);
        bnl0.m105524M(this.f150364A, false);
        this.f150388y.setBackgroundResource(obc0.f146009D7);
        this.f150388y.setText(zrv.f205803e.getString(R$string.f47774R1, Constants.VIA_REPORT_TYPE_WPA_STATE));
        this.f150388y.setTextColor(Color.parseColor("#212121"));
    }

    /* JADX INFO: renamed from: N4 */
    public void m170479N4(int i) {
        this.f150371H = i;
        i4g0.m138520r("e_pk_start_randompk", mo78457R2());
        duringCreated(LivingNormalApiProvider.m72655h4(i)).subscribe(dhw.m115826e(new y20() { // from class: l.e380
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91940a.m170472z4((BLivePkSeek) obj);
            }
        }, new ga80()));
    }

    /* JADX INFO: renamed from: S4 */
    public void m170480S4() {
        if (this.f150365B == null) {
            return;
        }
        if (this.f150366C != null && this.f150369F == 1) {
            this.f150380q.m77394i();
        }
        this.f150365B.show();
    }

    /* JADX INFO: renamed from: g4 */
    public View m170481g4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return q380.m175120b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i4 */
    public void m170482i4() {
        m170483l4();
        int i = this.f150369F;
        if (i == 1) {
            psd0.m173633z(this.f150367D);
            String str = this.f150366C;
            if (str != null) {
                m170458j4(str);
                this.f150366C = null;
            }
        } else if (i == 4) {
            psd0.m173633z(this.f150370G);
            String str2 = this.f150368E;
            if (str2 != null) {
                m170457h4(str2);
                this.f150368E = null;
            }
        }
        this.f150369F = 0;
    }

    /* JADX INFO: renamed from: l4 */
    public void m170483l4() {
        if (m170460n4()) {
            this.f150365B.dismiss();
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v7, types: [l.oo2] */
    /* JADX INFO: renamed from: m4 */
    public DialogC12774a m170484m4() {
        if (this.f150365B == null) {
            this.f150365B = new c0s(this, m170481g4(act().inflater(), null));
            izs.m142867r("context_single_room", this.f150376m, m213810E2().m168532l0().m61308fp().profileSmall());
            this.f150377n.setText(m213810E2().m168532l0().name);
            this.f150372i.setOnClickListener(new View.OnClickListener() { // from class: l.y280
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f197197a.m170465s4(view);
                }
            });
            this.f150388y.setOnClickListener(new View.OnClickListener() { // from class: l.z280
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f202660a.m170466t4(view);
                }
            });
            this.f150389z.setOnClickListener(new View.OnClickListener() { // from class: l.a380
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f68281a.m170467u4(view);
                }
            });
            this.f150373j.setOnClickListener(new View.OnClickListener() { // from class: l.b380
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f74719a.m170468v4(view);
                }
            });
            this.f150364A.setText(Html.fromHtml(zrv.f205803e.getString(R$string.f47846Ua, " <font color='#f36c4e'>5</font> ")));
        }
        return this.f150365B;
    }

    /* JADX WARN: Type inference failed for: r0v43, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().LivePkEvent.createInvite().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.r280
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f160922a.m170459k4((ict) obj);
            }
        }));
        duringCreated(m213811F2().LivePkEvent.pkPrepare().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.c380
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79583a.m170473E4((PkData) obj);
            }
        }));
        duringCreated(m213811F2().LivePkEvent.pkOnceMoreSuccess().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.h380
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107628a.m170424A4((vxj0) obj);
            }
        }));
        duringCreated(m213811F2().LivePkEvent.showPkDialog().m199270g()).filter(new qcj() { // from class: l.i380
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((hct) obj).f108745a == 2);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.j380
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118164a.m170425B4((hct) obj);
            }
        }));
        duringCreated(m213811F2().LivePkEvent.startRandomSeek().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.k380
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123697a.m170479N4(((Integer) obj).intValue());
            }
        }));
        duringCreated(m213811F2().LivePkEvent.cancelMatch().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.l380
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129853a.m170426C4((vxj0) obj);
            }
        }));
        duringCreated(m213811F2().LivePkEvent.clickOnceMore().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.m380
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134651a.m170428F4((User) obj);
            }
        }));
        duringCreated(m213810E2().m168545q1().m98256U()).subscribe(dhw.m115825d(new y20() { // from class: l.n380
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139952a.m170427D4((LivePkMessage) obj);
            }
        }));
    }
}
