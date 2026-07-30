package p149l;

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
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLivePkInvite;
import com.p046p1.mobile.putong.live.base.data.BLivePkInviteSource;
import com.p046p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class gq70 extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public View f103890i;

    /* JADX INFO: renamed from: j */
    public TextView f103891j;

    /* JADX INFO: renamed from: k */
    public View f103892k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f103893l;

    /* JADX INFO: renamed from: m */
    public VText f103894m;

    /* JADX INFO: renamed from: n */
    public VText f103895n;

    /* JADX INFO: renamed from: o */
    public VLinear f103896o;

    /* JADX INFO: renamed from: p */
    public VImage f103897p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f103898q;

    /* JADX INFO: renamed from: r */
    public VText f103899r;

    /* JADX INFO: renamed from: s */
    public VText f103900s;

    /* JADX INFO: renamed from: t */
    public VImage f103901t;

    /* JADX INFO: renamed from: u */
    public VText f103902u;

    /* JADX INFO: renamed from: v */
    public DialogC12611a f103903v;

    /* JADX INFO: renamed from: w */
    public String f103904w;

    /* JADX INFO: renamed from: x */
    public c4g0 f103905x;

    /* JADX INFO: renamed from: y */
    public String f103906y;

    /* JADX INFO: renamed from: z */
    public String f103907z;

    public gq70(bsm bsmVar) {
        super(bsmVar);
        this.f103906y = "accept";
        this.f103907z = "unaccept";
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ BLivePkInvite m127539L3(String str, BLivePkInvite bLivePkInvite) {
        return (BLivePkInvite) ht70.m132852i("acceptPkInvite id:" + str, bLivePkInvite);
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m127541N3(BLivePkInvite bLivePkInvite) {
    }

    /* JADX INFO: renamed from: P3 */
    public static /* synthetic */ void m127543P3(BLivePkInvite bLivePkInvite) {
    }

    /* JADX INFO: renamed from: R3 */
    public static /* synthetic */ boolean m127544R3(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return i == 4;
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ BLivePkInvite m127549W3(String str, BLivePkInvite bLivePkInvite) {
        return (BLivePkInvite) ht70.m132852i("rejectInvite id:" + str, bLivePkInvite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public /* synthetic */ void m127550b4(View view) {
        m127556Y3(this.f103904w);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ void m127551c4(View view) {
        m127554i4(this.f103904w);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public /* synthetic */ void m127552d4(View view) {
        boolean zEquals = TextUtils.equals((String) this.f103901t.getTag(), this.f103906y);
        VImage vImage = this.f103901t;
        if (zEquals) {
            vImage.setTag(this.f103907z);
            this.f103901t.setImageResource(i3c0.f110799N5);
        } else {
            vImage.setTag(this.f103906y);
            this.f103901t.setImageResource(i3c0.f111158s4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e4 */
    public /* synthetic */ void m127553e4(gat gatVar) {
        if (gatVar.f101704b) {
            return;
        }
        m127557Z3();
    }

    /* JADX INFO: renamed from: i4 */
    private void m127554i4(final String str) {
        m127557Z3();
        mkd0.m154992z(this.f103905x);
        lsi0.m151593w(eat.f90248f);
        duringCreated(LivingNormalApiProvider.m71330R6(str, TextUtils.equals((String) this.f103901t.getTag(), this.f103907z))).map(new w9j() { // from class: l.dq70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return gq70.m127549W3(str, (BLivePkInvite) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.eq70
            @Override // p149l.e30
            public final void call(Object obj) {
                gq70.m127541N3((BLivePkInvite) obj);
            }
        }, new a280()));
    }

    /* JADX INFO: renamed from: X3 */
    public View m127555X3(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hq70.m132433b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m127556Y3(final String str) {
        mkd0.m154992z(this.f103905x);
        mm70.m155306b(this, false);
        m206028F2().LivePkEvent.cancelMatch().m172467p();
        m206028F2().LivePkEvent.cancelMatch().m172467p();
        mm70.m155309e(this, false);
        m206028F2().WebViewDialogEvent.dismiss().mo172463j(new vkp0.C20656a(600).m198753c(ddv.f85659i).m198752b());
        m127557Z3();
        duringCreated(LivingNormalApiProvider.m71597v3(str)).map(new w9j() { // from class: l.up70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return gq70.m127539L3(str, (BLivePkInvite) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.vp70
            @Override // p149l.e30
            public final void call(Object obj) {
                gq70.m127543P3((BLivePkInvite) obj);
            }
        }, new a280()));
    }

    /* JADX INFO: renamed from: Z3 */
    public void m127557Z3() {
        DialogC12611a dialogC12611a = this.f103903v;
        if (dialogC12611a != null) {
            dialogC12611a.dismiss();
        }
        this.f103904w = null;
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m127558a4(Long l2) {
        VText vText = this.f103899r;
        Application application = ypv.f199497e;
        int i = R$string.f47041Wb;
        StringBuilder sb = new StringBuilder();
        sb.append(l2.longValue() > 10 ? 0L : 10 - l2.longValue());
        sb.append("");
        vText.setText(application.getString(i, sb.toString()));
        this.f103899r.setText(String.format(Locale.CHINA, "拒绝(%d)", Long.valueOf(l2.longValue() <= 10 ? 10 - l2.longValue() : 0L)));
        if (l2.longValue() >= 10) {
            m127554i4(this.f103904w);
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final void m127559f4(String str) {
        duringCreated(LivingNormalApiProvider.m71248I5(str)).subscribe(ffw.m121194e(new e30() { // from class: l.fq70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f98769a.m127562j4((BLivePkInvite) obj);
            }
        }, new a280()));
    }

    /* JADX INFO: renamed from: g4 */
    public void m127560g4(String str) {
        if (TextUtils.equals(this.f103904w, str)) {
            mkd0.m154992z(this.f103905x);
            lsi0.m151593w(eat.f90247e);
            m127557Z3();
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final void m127561h4(LivePkMessage livePkMessage) {
        if (TextUtils.equals(livePkMessage.type, "pk_invite_cancel")) {
            m127560g4(livePkMessage.f47752id);
        } else if (TextUtils.equals(livePkMessage.type, "pk_invite_notify")) {
            if (!((Boolean) m129297F3(new k480(600))).booleanValue() || livePkMessage.isOnceMore) {
                m127563k4(livePkMessage.f47752id);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r8v9, types: [l.ho2] */
    /* JADX INFO: renamed from: j4 */
    public final void m127562j4(BLivePkInvite bLivePkInvite) {
        BLivePkInviteSource bLivePkInviteSource = bLivePkInvite.source;
        User user = bLivePkInvite.userInfo;
        if (user == null) {
            return;
        }
        this.f103894m.setText(user.name);
        this.f103893l.setImageResource(i3c0.f110754J8);
        hxs.m133407t("context_single_room", this.f103893l, user.m60124fp().url, t100.f167235J);
        this.f103897p.setBackground(kvc0.m147353b(TEnum.equals(user.gender, "male") ? i3c0.f110718G8 : i3c0.f110694E8));
        BLiveUserLevel bLiveUserLevelM126036v = ((ggv) ypv.m215673l(fld0.f98148c)).m126036v(user.hierarchy.grade);
        if (bLiveUserLevelM126036v == null || TextUtils.isEmpty(bLiveUserLevelM126036v.backendUrl)) {
            xdl0.m208344M(this.f103898q, false);
        } else {
            xdl0.m208344M(this.f103898q, true);
            sxj.m186442c(bLiveUserLevelM126036v.backendUrl, this.f103898q, ney.m159134a(bLiveUserLevelM126036v.grade) ? sxj.f166798b : sxj.f166797a);
        }
        this.f103902u.setText(R$string.f47102Z9);
        BLive bLive = bLivePkInvite.live;
        double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        String strM207433c = x8u.m207433c(bLive == null ? 0.0d : bLive.memberCount);
        BLive bLive2 = bLivePkInvite.live;
        if (bLive2 != null) {
            d = bLive2.rewardPoint;
        }
        this.f103895n.setText(String.format(Locale.CHINA, "%s观众 · %s心动", strM207433c, x8u.m207433c(d)));
        this.f103899r.setText("拒绝(10)");
        VText vText = this.f103899r;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f103900s.setTypeface(typeface);
        mkd0.m154992z(this.f103905x);
        this.f103905x = m129299H3(m206027E2().m132135h2(1, TimeUnit.SECONDS)).subscribe(ffw.m121193d(new e30() { // from class: l.wp70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187493a.m127558a4((Long) obj);
            }
        }));
        boolean zEquals = TEnum.equals(bLivePkInviteSource, BLivePkInviteSource.onceMore);
        TextView textView = this.f103891j;
        if (zEquals) {
            textView.setText("邀请你再来一局PK");
        } else {
            textView.setText("邀请你参与PK");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m127563k4(String str) {
        this.f103904w = str;
        if (this.f103903v == null) {
            this.f103903v = new byr(this, m127555X3(act().inflater(), null));
            this.f103900s.setOnClickListener(new View.OnClickListener() { // from class: l.zp70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f204182a.m127550b4(view);
                }
            });
            this.f103899r.setOnClickListener(new View.OnClickListener() { // from class: l.aq70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f71134a.m127551c4(view);
                }
            });
            this.f103901t.setOnClickListener(new View.OnClickListener() { // from class: l.bq70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f76757a.m127552d4(view);
                }
            });
        }
        this.f103901t.setTag(this.f103906y);
        this.f103901t.setImageResource(i3c0.f111158s4);
        this.f103903v.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.cq70
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return gq70.m127544R3(dialogInterface, i, keyEvent);
            }
        });
        this.f103903v.show();
        m127559f4(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206027E2().m132160q1().m189074U()).subscribe(ffw.m121193d(new e30() { // from class: l.tp70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f171449a.m127561h4((LivePkMessage) obj);
            }
        }));
        duringCreated(m206028F2().LivePkEvent.showPkDialog().m172460g()).filter(new w9j() { // from class: l.xp70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((gat) obj).f101703a == 4);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.yp70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f199400a.m127553e4((gat) obj);
            }
        }));
    }
}
