package p153l;

import android.app.Application;
import android.content.DialogInterface;
import android.graphics.Typeface;
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
import com.p051p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class my70 extends qct<oo2> {

    /* JADX INFO: renamed from: i */
    public View f139319i;

    /* JADX INFO: renamed from: j */
    public TextView f139320j;

    /* JADX INFO: renamed from: k */
    public View f139321k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f139322l;

    /* JADX INFO: renamed from: m */
    public VText f139323m;

    /* JADX INFO: renamed from: n */
    public VText f139324n;

    /* JADX INFO: renamed from: o */
    public VLinear f139325o;

    /* JADX INFO: renamed from: p */
    public VImage f139326p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f139327q;

    /* JADX INFO: renamed from: r */
    public VText f139328r;

    /* JADX INFO: renamed from: s */
    public VText f139329s;

    /* JADX INFO: renamed from: t */
    public VImage f139330t;

    /* JADX INFO: renamed from: u */
    public VText f139331u;

    /* JADX INFO: renamed from: v */
    public DialogC12774a f139332v;

    /* JADX INFO: renamed from: w */
    public String f139333w;

    /* JADX INFO: renamed from: x */
    public kcg0 f139334x;

    /* JADX INFO: renamed from: y */
    public String f139335y;

    /* JADX INFO: renamed from: z */
    public String f139336z;

    public my70(dum dumVar) {
        super(dumVar);
        this.f139335y = "accept";
        this.f139336z = "unaccept";
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ BLivePkInvite m160716L3(String str, BLivePkInvite bLivePkInvite) {
        return (BLivePkInvite) n180.m161092i("acceptPkInvite id:" + str, bLivePkInvite);
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m160718N3(BLivePkInvite bLivePkInvite) {
    }

    /* JADX INFO: renamed from: P3 */
    public static /* synthetic */ void m160720P3(BLivePkInvite bLivePkInvite) {
    }

    /* JADX INFO: renamed from: R3 */
    public static /* synthetic */ boolean m160721R3(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return i == 4;
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ BLivePkInvite m160726W3(String str, BLivePkInvite bLivePkInvite) {
        return (BLivePkInvite) n180.m161092i("rejectInvite id:" + str, bLivePkInvite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public /* synthetic */ void m160727b4(View view) {
        m160733Y3(this.f139333w);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ void m160728c4(View view) {
        m160731i4(this.f139333w);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public /* synthetic */ void m160729d4(View view) {
        boolean zEquals = TextUtils.equals((String) this.f139330t.getTag(), this.f139335y);
        VImage vImage = this.f139330t;
        if (zEquals) {
            vImage.setTag(this.f139336z);
            this.f139330t.setImageResource(obc0.f146127N5);
        } else {
            vImage.setTag(this.f139335y);
            this.f139330t.setImageResource(obc0.f146486s4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e4 */
    public /* synthetic */ void m160730e4(hct hctVar) {
        if (hctVar.f108746b) {
            return;
        }
        m160734Z3();
    }

    /* JADX INFO: renamed from: i4 */
    private void m160731i4(final String str) {
        m160734Z3();
        psd0.m173633z(this.f139334x);
        o1j0.m165649w(fct.f98266f);
        duringCreated(LivingNormalApiProvider.m72513R6(str, TextUtils.equals((String) this.f139330t.getTag(), this.f139336z))).map(new qcj() { // from class: l.jy70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return my70.m160726W3(str, (BLivePkInvite) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.ky70
            @Override // p153l.y20
            public final void call(Object obj) {
                my70.m160718N3((BLivePkInvite) obj);
            }
        }, new ga80()));
    }

    /* JADX INFO: renamed from: X3 */
    public View m160732X3(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ny70.m165314b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m160733Y3(final String str) {
        psd0.m173633z(this.f139334x);
        su70.m187994b(this, false);
        m213811F2().LivePkEvent.cancelMatch().m199277p();
        m213811F2().LivePkEvent.cancelMatch().m199277p();
        su70.m187997e(this, false);
        m213811F2().WebViewDialogEvent.dismiss().mo199273j(new ztp0.C21893a(600).m221569c(efv.f93852i).m221568b());
        m160734Z3();
        duringCreated(LivingNormalApiProvider.m72780v3(str)).map(new qcj() { // from class: l.ay70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return my70.m160716L3(str, (BLivePkInvite) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.by70
            @Override // p153l.y20
            public final void call(Object obj) {
                my70.m160720P3((BLivePkInvite) obj);
            }
        }, new ga80()));
    }

    /* JADX INFO: renamed from: Z3 */
    public void m160734Z3() {
        DialogC12774a dialogC12774a = this.f139332v;
        if (dialogC12774a != null) {
            dialogC12774a.dismiss();
        }
        this.f139333w = null;
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m160735a4(Long l2) {
        VText vText = this.f139328r;
        Application application = zrv.f205803e;
        int i = R$string.f47889Wb;
        StringBuilder sb = new StringBuilder();
        sb.append(l2.longValue() > 10 ? 0L : 10 - l2.longValue());
        sb.append("");
        vText.setText(application.getString(i, sb.toString()));
        this.f139328r.setText(String.format(Locale.CHINA, "拒绝(%d)", Long.valueOf(l2.longValue() <= 10 ? 10 - l2.longValue() : 0L)));
        if (l2.longValue() >= 10) {
            m160731i4(this.f139333w);
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final void m160736f4(String str) {
        duringCreated(LivingNormalApiProvider.m72431I5(str)).subscribe(dhw.m115826e(new y20() { // from class: l.ly70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134035a.m160739j4((BLivePkInvite) obj);
            }
        }, new ga80()));
    }

    /* JADX INFO: renamed from: g4 */
    public void m160737g4(String str) {
        if (TextUtils.equals(this.f139333w, str)) {
            psd0.m173633z(this.f139334x);
            o1j0.m165649w(fct.f98265e);
            m160734Z3();
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final void m160738h4(LivePkMessage livePkMessage) {
        if (TextUtils.equals(livePkMessage.type, "pk_invite_cancel")) {
            m160737g4(livePkMessage.f48600id);
        } else if (TextUtils.equals(livePkMessage.type, "pk_invite_notify")) {
            if (!((Boolean) m138856F3(new qc80(600))).booleanValue() || livePkMessage.isOnceMore) {
                m160740k4(livePkMessage.f48600id);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r8v9, types: [l.oo2] */
    /* JADX INFO: renamed from: j4 */
    public final void m160739j4(BLivePkInvite bLivePkInvite) {
        BLivePkInviteSource bLivePkInviteSource = bLivePkInvite.source;
        User user = bLivePkInvite.userInfo;
        if (user == null) {
            return;
        }
        this.f139323m.setText(user.name);
        this.f139322l.setImageResource(obc0.f146082J8);
        izs.m142869t("context_single_room", this.f139322l, user.m61308fp().url, qa00.f156297J);
        this.f139326p.setBackground(n3d0.m161278b(TEnum.equals(user.gender, "male") ? obc0.f146046G8 : obc0.f146022E8));
        BLiveUserLevel bLiveUserLevelM135170v = ((hiv) zrv.m221194l(htd0.f111521c)).m135170v(user.hierarchy.grade);
        if (bLiveUserLevelM135170v == null || TextUtils.isEmpty(bLiveUserLevelM135170v.backendUrl)) {
            bnl0.m105524M(this.f139327q, false);
        } else {
            bnl0.m105524M(this.f139327q, true);
            i0k.m137976c(bLiveUserLevelM135170v.backendUrl, this.f139327q, kny.m150553a(bLiveUserLevelM135170v.grade) ? i0k.f112379b : i0k.f112378a);
        }
        this.f139331u.setText(R$string.f47950Z9);
        BLive bLive = bLivePkInvite.live;
        double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        String strM214935c = yau.m214935c(bLive == null ? 0.0d : bLive.memberCount);
        BLive bLive2 = bLivePkInvite.live;
        if (bLive2 != null) {
            d = bLive2.rewardPoint;
        }
        this.f139324n.setText(String.format(Locale.CHINA, "%s观众 · %s心动", strM214935c, yau.m214935c(d)));
        this.f139328r.setText("拒绝(10)");
        VText vText = this.f139328r;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f139329s.setTypeface(typeface);
        psd0.m173633z(this.f139334x);
        this.f139334x = m138858H3(m213810E2().m168521h2(1, TimeUnit.SECONDS)).subscribe(dhw.m115825d(new y20() { // from class: l.cy70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84303a.m160735a4((Long) obj);
            }
        }));
        boolean zEquals = TEnum.equals(bLivePkInviteSource, BLivePkInviteSource.onceMore);
        TextView textView = this.f139320j;
        if (zEquals) {
            textView.setText("邀请你再来一局PK");
        } else {
            textView.setText("邀请你参与PK");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m160740k4(String str) {
        this.f139333w = str;
        if (this.f139332v == null) {
            this.f139332v = new c0s(this, m160732X3(act().inflater(), null));
            this.f139329s.setOnClickListener(new View.OnClickListener() { // from class: l.fy70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f101345a.m160727b4(view);
                }
            });
            this.f139328r.setOnClickListener(new View.OnClickListener() { // from class: l.gy70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f107035a.m160728c4(view);
                }
            });
            this.f139330t.setOnClickListener(new View.OnClickListener() { // from class: l.hy70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f112102a.m160729d4(view);
                }
            });
        }
        this.f139330t.setTag(this.f139335y);
        this.f139330t.setImageResource(obc0.f146486s4);
        this.f139332v.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.iy70
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return my70.m160721R3(dialogInterface, i, keyEvent);
            }
        });
        this.f139332v.show();
        m160736f4(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213810E2().m168545q1().m98256U()).subscribe(dhw.m115825d(new y20() { // from class: l.zx70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f206444a.m160738h4((LivePkMessage) obj);
            }
        }));
        duringCreated(m213811F2().LivePkEvent.showPkDialog().m199270g()).filter(new qcj() { // from class: l.dy70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((hct) obj).f108745a == 4);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.ey70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96404a.m160730e4((hct) obj);
            }
        }));
    }
}
