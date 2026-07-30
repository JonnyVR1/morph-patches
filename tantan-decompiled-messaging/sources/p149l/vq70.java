package p149l;

import android.app.Application;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLivePkInvite;
import com.p046p1.mobile.putong.live.base.data.BLivePkInviteSource;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;
import com.tencent.connect.common.Constants;
import java.util.concurrent.TimeUnit;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class vq70 extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public View f182596i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f182597j;

    /* JADX INFO: renamed from: k */
    public TextView f182598k;

    /* JADX INFO: renamed from: l */
    public VText f182599l;

    /* JADX INFO: renamed from: m */
    public VText f182600m;

    /* JADX INFO: renamed from: n */
    public VText f182601n;

    /* JADX INFO: renamed from: o */
    public VText f182602o;

    /* JADX INFO: renamed from: p */
    public VText f182603p;

    /* JADX INFO: renamed from: q */
    public VText f182604q;

    /* JADX INFO: renamed from: r */
    public VImage f182605r;

    /* JADX INFO: renamed from: s */
    public VText f182606s;

    /* JADX INFO: renamed from: t */
    public DialogC12611a f182607t;

    /* JADX INFO: renamed from: u */
    public String f182608u;

    /* JADX INFO: renamed from: v */
    public c4g0 f182609v;

    /* JADX INFO: renamed from: w */
    public String f182610w;

    /* JADX INFO: renamed from: x */
    public String f182611x;

    public vq70(bsm bsmVar) {
        super(bsmVar);
        this.f182610w = "accept";
        this.f182611x = "unaccept";
    }

    /* JADX INFO: renamed from: M3 */
    public static /* synthetic */ BLivePkInvite m199454M3(String str, BLivePkInvite bLivePkInvite) {
        return (BLivePkInvite) ht70.m132852i("acceptPkInvite id:" + str, bLivePkInvite);
    }

    /* JADX INFO: renamed from: P3 */
    public static /* synthetic */ void m199457P3(BLivePkInvite bLivePkInvite) {
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ boolean m199459S3(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return i == 4;
    }

    /* JADX INFO: renamed from: U3 */
    public static /* synthetic */ BLivePkInvite m199461U3(String str, BLivePkInvite bLivePkInvite) {
        return (BLivePkInvite) ht70.m132852i("rejectInvite id:" + str, bLivePkInvite);
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ void m199462V3(BLivePkInvite bLivePkInvite) {
    }

    /* JADX INFO: renamed from: Y3 */
    private void m199464Y3(final String str) {
        mkd0.m154992z(this.f182609v);
        mm70.m155306b(this, false);
        m206028F2().LivePkEvent.cancelMatch().m172467p();
        m206028F2().LivePkEvent.cancelMatch().m172467p();
        mm70.m155309e(this, false);
        m206028F2().WebViewDialogEvent.dismiss().mo172463j(new vkp0.C20656a(600).m198753c(ddv.f85659i).m198752b());
        m199475Z3();
        duringCreated(LivingNormalApiProvider.m71597v3(str)).map(new w9j() { // from class: l.sq70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return vq70.m199454M3(str, (BLivePkInvite) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.tq70
            @Override // p149l.e30
            public final void call(Object obj) {
                vq70.m199462V3((BLivePkInvite) obj);
            }
        }, new a280()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m199465a4(Long l2) {
        VText vText = this.f182603p;
        Application application = ypv.f199497e;
        int i = R$string.f47041Wb;
        StringBuilder sb = new StringBuilder();
        sb.append(l2.longValue() > 10 ? 0L : 10 - l2.longValue());
        sb.append("");
        vText.setText(application.getString(i, sb.toString()));
        if (l2.longValue() >= 10) {
            m199472i4(this.f182608u);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public /* synthetic */ void m199466b4(View view) {
        m199464Y3(this.f182608u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ void m199467c4(View view) {
        m199472i4(this.f182608u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public /* synthetic */ void m199468d4(View view) {
        boolean zEquals = TextUtils.equals((String) this.f182605r.getTag(), this.f182610w);
        VImage vImage = this.f182605r;
        if (zEquals) {
            vImage.setTag(this.f182611x);
            this.f182605r.setImageResource(i3c0.f110811O5);
        } else {
            vImage.setTag(this.f182610w);
            this.f182605r.setImageResource(i3c0.f111170t4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e4 */
    public /* synthetic */ void m199469e4(gat gatVar) {
        if (gatVar.f101704b) {
            return;
        }
        m199475Z3();
    }

    /* JADX INFO: renamed from: f4 */
    private void m199470f4(String str) {
        duringCreated(LivingNormalApiProvider.m71248I5(str)).subscribe(ffw.m121194e(new e30() { // from class: l.uq70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177714a.m199473j4((BLivePkInvite) obj);
            }
        }, new a280()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public void m199471h4(LivePkMessage livePkMessage) {
        if (TextUtils.equals(livePkMessage.type, "pk_invite_cancel")) {
            m199476g4(livePkMessage.f47752id);
        } else if (TextUtils.equals(livePkMessage.type, "pk_invite_notify")) {
            if (!((Boolean) m129297F3(new k480(600))).booleanValue() || livePkMessage.isOnceMore) {
                m199477k4(livePkMessage.f47752id);
            }
        }
    }

    /* JADX INFO: renamed from: i4 */
    private void m199472i4(final String str) {
        m199475Z3();
        mkd0.m154992z(this.f182609v);
        lsi0.m151593w(eat.f90248f);
        duringCreated(LivingNormalApiProvider.m71330R6(str, TextUtils.equals((String) this.f182605r.getTag(), this.f182611x))).map(new w9j() { // from class: l.jq70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return vq70.m199461U3(str, (BLivePkInvite) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.kq70
            @Override // p149l.e30
            public final void call(Object obj) {
                vq70.m199457P3((BLivePkInvite) obj);
            }
        }, new a280()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r9v7, types: [l.ho2] */
    /* JADX INFO: renamed from: j4 */
    public void m199473j4(BLivePkInvite bLivePkInvite) {
        BLivePkInviteSource bLivePkInviteSource = bLivePkInvite.source;
        User user = bLivePkInvite.userInfo;
        if (user == null) {
            return;
        }
        this.f182599l.setText(user.name);
        this.f182597j.setImageResource(i3c0.f110754J8);
        hxs.m133407t("context_single_room", this.f182597j, user.m60124fp().url, t100.f167235J);
        byte b = 0;
        this.f182600m.setCompoundDrawablesWithIntrinsicBounds(TEnum.equals(user.gender, "male") ? i3c0.f110768Ka : i3c0.f110756Ja, 0, 0, 0);
        this.f182600m.setBackground(fce.m120425b(TEnum.equals(user.gender, "male") ? -8013326 : -800523, t100.m186890d(2.0f)));
        this.f182600m.setText(String.valueOf(user.age));
        this.f182606s.setText(R$string.f47102Z9);
        BLive bLive = bLivePkInvite.live;
        double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        String strM207433c = x8u.m207433c(bLive == null ? 0.0d : bLive.memberCount);
        BLive bLive2 = bLivePkInvite.live;
        if (bLive2 != null) {
            d = bLive2.rewardPoint;
        }
        this.f182601n.setText(ypv.f199497e.getString(((bgv) ypv.m215673l(fld0.f98151f)).m101734n() ? R$string.f47666z3 : R$string.f47644y3, strM207433c, x8u.m207433c(d)));
        this.f182603p.setText(ypv.f199497e.getString(R$string.f47041Wb, Constants.VIA_REPORT_TYPE_SHARE_TO_QQ));
        mkd0.m154992z(this.f182609v);
        this.f182609v = m129299H3(m206027E2().m132135h2(1, TimeUnit.SECONDS)).subscribe(ffw.m121193d(new e30() { // from class: l.lq70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f129305a.m199465a4((Long) obj);
            }
        }));
        boolean zEquals = TEnum.equals(bLivePkInviteSource, BLivePkInviteSource.onceMore);
        VText vText = this.f182602o;
        if (zEquals) {
            vText.setText(String.format("%s", w8u.m202217t(eat.f90259q)));
            xdl0.m208344M(this.f182598k, false);
        }
        vText.setText(String.format("%s", w8u.m202217t(eat.f90258p)));
        xdl0.m208344M(this.f182598k, true);
        String string = bLivePkInviteSource.toString();
        string.getClass();
        switch (string.hashCode()) {
            case -1049482625:
                if (!string.equals("nearby")) {
                    b = -1;
                }
                break;
            case 3135424:
                b = !string.equals("fans") ? (byte) -1 : (byte) 1;
                break;
            case 103668165:
                b = !string.equals("match") ? (byte) -1 : (byte) 2;
                break;
            case 2093667819:
                b = !string.equals(BLivePkInviteSource.similar) ? (byte) -1 : (byte) 3;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                this.f182598k.setText(eat.f90263u);
                break;
            case 1:
                this.f182598k.setText(eat.f90261s);
                break;
            case 2:
                this.f182598k.setText(eat.f90260r);
                break;
            case 3:
                this.f182598k.setText(eat.f90262t);
                break;
        }
    }

    /* JADX INFO: renamed from: X3 */
    public View m199474X3(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wq70.m205027b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Z3 */
    public void m199475Z3() {
        DialogC12611a dialogC12611a = this.f182607t;
        if (dialogC12611a != null) {
            dialogC12611a.dismiss();
        }
        this.f182608u = null;
    }

    /* JADX INFO: renamed from: g4 */
    public void m199476g4(String str) {
        if (TextUtils.equals(this.f182608u, str)) {
            mkd0.m154992z(this.f182609v);
            lsi0.m151593w(eat.f90247e);
            m199475Z3();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m199477k4(String str) {
        this.f182608u = str;
        if (this.f182607t == null) {
            this.f182607t = new byr(this, m199474X3(act().inflater(), null));
            this.f182604q.setOnClickListener(new View.OnClickListener() { // from class: l.oq70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f145112a.m199466b4(view);
                }
            });
            this.f182603p.setOnClickListener(new View.OnClickListener() { // from class: l.pq70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f150764a.m199467c4(view);
                }
            });
            this.f182605r.setOnClickListener(new View.OnClickListener() { // from class: l.qq70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f155871a.m199468d4(view);
                }
            });
        }
        this.f182605r.setTag(this.f182610w);
        this.f182605r.setImageResource(i3c0.f111170t4);
        this.f182607t.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.rq70
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return vq70.m199459S3(dialogInterface, i, keyEvent);
            }
        });
        this.f182607t.show();
        m199470f4(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206027E2().m132160q1().m189074U()).subscribe(ffw.m121193d(new e30() { // from class: l.iq70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f114433a.m199471h4((LivePkMessage) obj);
            }
        }));
        duringCreated(m206028F2().LivePkEvent.showPkDialog().m172460g()).filter(new w9j() { // from class: l.mq70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((gat) obj).f101703a == 4);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.nq70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f140043a.m199469e4((gat) obj);
            }
        }));
    }
}
