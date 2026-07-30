package p153l;

import android.app.Application;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLivePkInvite;
import com.p051p1.mobile.putong.live.base.data.BLivePkInviteSource;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;
import com.tencent.connect.common.Constants;
import java.util.concurrent.TimeUnit;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class bz70 extends qct<oo2> {

    /* JADX INFO: renamed from: i */
    public View f79098i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f79099j;

    /* JADX INFO: renamed from: k */
    public TextView f79100k;

    /* JADX INFO: renamed from: l */
    public VText f79101l;

    /* JADX INFO: renamed from: m */
    public VText f79102m;

    /* JADX INFO: renamed from: n */
    public VText f79103n;

    /* JADX INFO: renamed from: o */
    public VText f79104o;

    /* JADX INFO: renamed from: p */
    public VText f79105p;

    /* JADX INFO: renamed from: q */
    public VText f79106q;

    /* JADX INFO: renamed from: r */
    public VImage f79107r;

    /* JADX INFO: renamed from: s */
    public VText f79108s;

    /* JADX INFO: renamed from: t */
    public DialogC12774a f79109t;

    /* JADX INFO: renamed from: u */
    public String f79110u;

    /* JADX INFO: renamed from: v */
    public kcg0 f79111v;

    /* JADX INFO: renamed from: w */
    public String f79112w;

    /* JADX INFO: renamed from: x */
    public String f79113x;

    public bz70(dum dumVar) {
        super(dumVar);
        this.f79112w = "accept";
        this.f79113x = "unaccept";
    }

    /* JADX INFO: renamed from: M3 */
    public static /* synthetic */ BLivePkInvite m107112M3(String str, BLivePkInvite bLivePkInvite) {
        return (BLivePkInvite) n180.m161092i("acceptPkInvite id:" + str, bLivePkInvite);
    }

    /* JADX INFO: renamed from: P3 */
    public static /* synthetic */ void m107115P3(BLivePkInvite bLivePkInvite) {
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ boolean m107117S3(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return i == 4;
    }

    /* JADX INFO: renamed from: U3 */
    public static /* synthetic */ BLivePkInvite m107119U3(String str, BLivePkInvite bLivePkInvite) {
        return (BLivePkInvite) n180.m161092i("rejectInvite id:" + str, bLivePkInvite);
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ void m107120V3(BLivePkInvite bLivePkInvite) {
    }

    /* JADX INFO: renamed from: Y3 */
    private void m107122Y3(final String str) {
        psd0.m173633z(this.f79111v);
        su70.m187994b(this, false);
        m213811F2().LivePkEvent.cancelMatch().m199277p();
        m213811F2().LivePkEvent.cancelMatch().m199277p();
        su70.m187997e(this, false);
        m213811F2().WebViewDialogEvent.dismiss().mo199273j(new ztp0.C21893a(600).m221569c(efv.f93852i).m221568b());
        m107133Z3();
        duringCreated(LivingNormalApiProvider.m72780v3(str)).map(new qcj() { // from class: l.yy70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return bz70.m107112M3(str, (BLivePkInvite) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.zy70
            @Override // p153l.y20
            public final void call(Object obj) {
                bz70.m107120V3((BLivePkInvite) obj);
            }
        }, new ga80()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m107123a4(Long l2) {
        VText vText = this.f79105p;
        Application application = zrv.f205803e;
        int i = R$string.f47889Wb;
        StringBuilder sb = new StringBuilder();
        sb.append(l2.longValue() > 10 ? 0L : 10 - l2.longValue());
        sb.append("");
        vText.setText(application.getString(i, sb.toString()));
        if (l2.longValue() >= 10) {
            m107130i4(this.f79110u);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public /* synthetic */ void m107124b4(View view) {
        m107122Y3(this.f79110u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ void m107125c4(View view) {
        m107130i4(this.f79110u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public /* synthetic */ void m107126d4(View view) {
        boolean zEquals = TextUtils.equals((String) this.f79107r.getTag(), this.f79112w);
        VImage vImage = this.f79107r;
        if (zEquals) {
            vImage.setTag(this.f79113x);
            this.f79107r.setImageResource(obc0.f146139O5);
        } else {
            vImage.setTag(this.f79112w);
            this.f79107r.setImageResource(obc0.f146498t4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e4 */
    public /* synthetic */ void m107127e4(hct hctVar) {
        if (hctVar.f108746b) {
            return;
        }
        m107133Z3();
    }

    /* JADX INFO: renamed from: f4 */
    private void m107128f4(String str) {
        duringCreated(LivingNormalApiProvider.m72431I5(str)).subscribe(dhw.m115826e(new y20() { // from class: l.az70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f74099a.m107131j4((BLivePkInvite) obj);
            }
        }, new ga80()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public void m107129h4(LivePkMessage livePkMessage) {
        if (TextUtils.equals(livePkMessage.type, "pk_invite_cancel")) {
            m107134g4(livePkMessage.f48600id);
        } else if (TextUtils.equals(livePkMessage.type, "pk_invite_notify")) {
            if (!((Boolean) m138856F3(new qc80(600))).booleanValue() || livePkMessage.isOnceMore) {
                m107135k4(livePkMessage.f48600id);
            }
        }
    }

    /* JADX INFO: renamed from: i4 */
    private void m107130i4(final String str) {
        m107133Z3();
        psd0.m173633z(this.f79111v);
        o1j0.m165649w(fct.f98266f);
        duringCreated(LivingNormalApiProvider.m72513R6(str, TextUtils.equals((String) this.f79107r.getTag(), this.f79113x))).map(new qcj() { // from class: l.py70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return bz70.m107119U3(str, (BLivePkInvite) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.qy70
            @Override // p153l.y20
            public final void call(Object obj) {
                bz70.m107115P3((BLivePkInvite) obj);
            }
        }, new ga80()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r9v7, types: [l.oo2] */
    /* JADX INFO: renamed from: j4 */
    public void m107131j4(BLivePkInvite bLivePkInvite) {
        BLivePkInviteSource bLivePkInviteSource = bLivePkInvite.source;
        User user = bLivePkInvite.userInfo;
        if (user == null) {
            return;
        }
        this.f79101l.setText(user.name);
        this.f79099j.setImageResource(obc0.f146082J8);
        izs.m142869t("context_single_room", this.f79099j, user.m61308fp().url, qa00.f156297J);
        byte b = 0;
        this.f79102m.setCompoundDrawablesWithIntrinsicBounds(TEnum.equals(user.gender, "male") ? obc0.f146096Ka : obc0.f146084Ja, 0, 0, 0);
        this.f79102m.setBackground(jde.m144406b(TEnum.equals(user.gender, "male") ? -8013326 : -800523, qa00.m175859d(2.0f)));
        this.f79102m.setText(String.valueOf(user.age));
        this.f79108s.setText(R$string.f47950Z9);
        BLive bLive = bLivePkInvite.live;
        double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        String strM214935c = yau.m214935c(bLive == null ? 0.0d : bLive.memberCount);
        BLive bLive2 = bLivePkInvite.live;
        if (bLive2 != null) {
            d = bLive2.rewardPoint;
        }
        this.f79103n.setText(zrv.f205803e.getString(((civ) zrv.m221194l(htd0.f111524f)).m109970n() ? R$string.f48514z3 : R$string.f48492y3, strM214935c, yau.m214935c(d)));
        this.f79105p.setText(zrv.f205803e.getString(R$string.f47889Wb, Constants.VIA_REPORT_TYPE_SHARE_TO_QQ));
        psd0.m173633z(this.f79111v);
        this.f79111v = m138858H3(m213810E2().m168521h2(1, TimeUnit.SECONDS)).subscribe(dhw.m115825d(new y20() { // from class: l.ry70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f165415a.m107123a4((Long) obj);
            }
        }));
        boolean zEquals = TEnum.equals(bLivePkInviteSource, BLivePkInviteSource.onceMore);
        VText vText = this.f79104o;
        if (zEquals) {
            vText.setText(String.format("%s", xau.m209910t(fct.f98277q)));
            bnl0.m105524M(this.f79100k, false);
        }
        vText.setText(String.format("%s", xau.m209910t(fct.f98276p)));
        bnl0.m105524M(this.f79100k, true);
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
                this.f79100k.setText(fct.f98281u);
                break;
            case 1:
                this.f79100k.setText(fct.f98279s);
                break;
            case 2:
                this.f79100k.setText(fct.f98278r);
                break;
            case 3:
                this.f79100k.setText(fct.f98280t);
                break;
        }
    }

    /* JADX INFO: renamed from: X3 */
    public View m107132X3(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cz70.m113270b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Z3 */
    public void m107133Z3() {
        DialogC12774a dialogC12774a = this.f79109t;
        if (dialogC12774a != null) {
            dialogC12774a.dismiss();
        }
        this.f79110u = null;
    }

    /* JADX INFO: renamed from: g4 */
    public void m107134g4(String str) {
        if (TextUtils.equals(this.f79110u, str)) {
            psd0.m173633z(this.f79111v);
            o1j0.m165649w(fct.f98265e);
            m107133Z3();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m107135k4(String str) {
        this.f79110u = str;
        if (this.f79109t == null) {
            this.f79109t = new c0s(this, m107132X3(act().inflater(), null));
            this.f79106q.setOnClickListener(new View.OnClickListener() { // from class: l.uy70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f181545a.m107124b4(view);
                }
            });
            this.f79105p.setOnClickListener(new View.OnClickListener() { // from class: l.vy70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f186345a.m107125c4(view);
                }
            });
            this.f79107r.setOnClickListener(new View.OnClickListener() { // from class: l.wy70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f191576a.m107126d4(view);
                }
            });
        }
        this.f79107r.setTag(this.f79112w);
        this.f79107r.setImageResource(obc0.f146498t4);
        this.f79109t.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.xy70
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return bz70.m107117S3(dialogInterface, i, keyEvent);
            }
        });
        this.f79109t.show();
        m107128f4(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213810E2().m168545q1().m98256U()).subscribe(dhw.m115825d(new y20() { // from class: l.oy70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f149757a.m107129h4((LivePkMessage) obj);
            }
        }));
        duringCreated(m213811F2().LivePkEvent.showPkDialog().m199270g()).filter(new qcj() { // from class: l.sy70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((hct) obj).f108745a == 4);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.ty70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176641a.m107127e4((hct) obj);
            }
        }));
    }
}
