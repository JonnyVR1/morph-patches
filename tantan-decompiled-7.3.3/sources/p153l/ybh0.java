package p153l;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.p058ui.greet.C8523d;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.Channel;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VIcon;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes2.dex */
public class ybh0 extends g1e {

    /* JADX INFO: renamed from: A */
    public VText f198310A;

    /* JADX INFO: renamed from: B */
    public final Act f198311B;

    /* JADX INFO: renamed from: C */
    public int f198312C;

    /* JADX INFO: renamed from: D */
    public User f198313D;

    /* JADX INFO: renamed from: E */
    public x20 f198314E;

    /* JADX INFO: renamed from: j */
    public VDraweeView f198315j;

    /* JADX INFO: renamed from: k */
    public FrameLayout f198316k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f198317l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f198318m;

    /* JADX INFO: renamed from: n */
    public VIcon f198319n;

    /* JADX INFO: renamed from: o */
    public VIcon f198320o;

    /* JADX INFO: renamed from: p */
    public VFrame f198321p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f198322q;

    /* JADX INFO: renamed from: r */
    public VImage f198323r;

    /* JADX INFO: renamed from: s */
    public TextView f198324s;

    /* JADX INFO: renamed from: t */
    public TextView f198325t;

    /* JADX INFO: renamed from: u */
    public TextView f198326u;

    /* JADX INFO: renamed from: v */
    public TextView f198327v;

    /* JADX INFO: renamed from: w */
    public VLinear f198328w;

    /* JADX INFO: renamed from: x */
    public VText f198329x;

    /* JADX INFO: renamed from: y */
    public VText f198330y;

    /* JADX INFO: renamed from: z */
    public VText f198331z;

    /* JADX INFO: renamed from: l.ybh0$a */
    public class C21556a implements y20<uxj0> {
        public C21556a() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(uxj0 uxj0Var) {
            och0.m167218d();
            ybh0.this.f198311B.startActivity(MessagesAct.m50126k2(ybh0.this.f198311B, ybh0.this.f198313D.f56859id, false, false));
        }
    }

    /* JADX INFO: renamed from: l.ybh0$b */
    public static class C21557b {

        /* JADX INFO: renamed from: a */
        public int f198333a;

        /* JADX INFO: renamed from: b */
        public User f198334b;

        /* JADX INFO: renamed from: l.ybh0$b$a */
        public class a implements x20 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Act f198335a;

            public a(Act act) {
                this.f198335a = act;
            }

            @Override // p153l.x20
            public void call() {
                if (TextUtils.isEmpty(CoreModule.f18264c.f20401k2.f118667Z.get())) {
                    return;
                }
                Act act = this.f198335a;
                if (act instanceof NewMainAct) {
                    och0.m167220f((NewMainAct) act);
                }
            }
        }

        /* JADX INFO: renamed from: l.ybh0$b$b */
        public class b implements DialogInterface.OnCancelListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Act f198337a;

            public b(Act act) {
                this.f198337a = act;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                if (TextUtils.isEmpty(CoreModule.f18264c.f20401k2.f118667Z.get())) {
                    return;
                }
                Act act = this.f198337a;
                if (act instanceof NewMainAct) {
                    och0.m167220f((NewMainAct) act);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public C21557b m215072a(int i) {
            this.f198333a = i;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C21557b m215073b(User user) {
            this.f198334b = user;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public void m215074c(Act act) {
            ybh0 ybh0Var = new ybh0(act);
            ybh0Var.m215047B0(this.f198333a);
            ybh0Var.m215019D0(this.f198334b);
            ybh0Var.show();
            ybh0Var.m215048C0(new a(act));
            ybh0Var.setOnCancelListener(new b(act));
        }
    }

    public ybh0(Context context) {
        super(context, false, 0);
        if (NullChecker.m82486a(getWindow())) {
            getWindow().setBackgroundDrawableResource(dbc0.f87653zr);
        }
        this.f198311B = (Act) context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public void m215019D0(User user) {
        this.f198313D = user;
    }

    /* JADX INFO: renamed from: e0 */
    private void m215043e0() {
        bnl0.m105524M(this.f198323r, true);
        bnl0.m105524M(this.f198328w, false);
        bnl0.m105524M(this.f198321p, false);
        bnl0.m105524M(this.f198316k, false);
        this.f198324s.setText("恭喜获得优先推荐特权");
        this.f198325t.setText("恭喜获得配对利器，30分钟内你将曝光给比现在多10倍的人");
        this.f198326u.setText("确认使用");
        bnl0.m105524M(this.f198327v, true);
        bnl0.m105509E0(this.f198326u, new View.OnClickListener() { // from class: l.tbh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f172963a.m215057l0(view);
            }
        });
        bnl0.m105509E0(this.f198327v, new View.OnClickListener() { // from class: l.ubh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178309a.m215045m0(view);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    private void m215044i0() {
        User userMe_ = CoreModule.m30930K().me_();
        int i = this.f198312C;
        if (i == 0 || i == 1) {
            m215054h0(userMe_);
        } else if (i == 2) {
            m215043e0();
        } else {
            if (i != 3) {
                return;
            }
            m215052f0(userMe_);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m215045m0(View view) {
        m215050c0();
    }

    /* JADX INFO: renamed from: A0 */
    public final void m215046A0(int i, final User user, String str) {
        i4g0.m138523u("e_surprisebox_user", "p_suggest_users_home_view", jyb.m147494Y("other_user_id", user.f56859id), jyb.m147494Y("is_emoji", Boolean.TRUE), jyb.m147494Y("is_click_avatar", Boolean.FALSE));
        final Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        messageNew_.value = str;
        if (i == 0) {
            duringCreated(CoreModule.f18264c.f20405m0.m32064V7(true, false, null, user, "").doOnNext(new y20() { // from class: l.jbh0
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreModule.f18264c.f20405m0.m31997E8(user.f56859id);
                }
            }).switchMap(new qcj() { // from class: l.kbh0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return CoreModule.f18264c.f20384f0.m33626Dn(user.f56859id, messageNew_, null);
                }
            })).subscribe(psd0.m173597H(new y20() { // from class: l.lbh0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f131207a.m215067w0((Message) obj);
                }
            }, new y20() { // from class: l.mbh0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f135722a.m215068x0((Throwable) obj);
                }
            }));
        } else if (i == 1) {
            duringCreated(CoreModule.f18264c.f20420r0.m35152u6(user.f56859id, Channel.get(Channel.surprise_box), messageNew_, null, null)).subscribe(psd0.m173597H(new y20() { // from class: l.nbh0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f141225a.m215069y0((Message) obj);
                }
            }, new y20() { // from class: l.obh0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f146586a.m215070z0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: B0 */
    public void m215047B0(int i) {
        this.f198312C = i;
    }

    /* JADX INFO: renamed from: C0 */
    public void m215048C0(x20 x20Var) {
        this.f198314E = x20Var;
    }

    /* JADX INFO: renamed from: b0 */
    public View m215049b0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return zbh0.m219193b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m215050c0() {
        dismiss();
        if (ji30.m144964h() != TabName.Card) {
            this.f198311B.startActivity(NewMainAct.m40697M5(this.f198311B, NavigationIntent.get("cards")));
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m215051d0(boolean z) {
        User user = this.f198313D;
        if (user == null) {
            return;
        }
        i4g0.m138523u("e_surprisebox_user", "p_suggest_users_home_view", jyb.m147494Y("other_user_id", user.f56859id), jyb.m147494Y("is_emoji", Boolean.FALSE), jyb.m147494Y("is_click_avatar", Boolean.valueOf(z)));
        if (this.f198312C == 0) {
            CoreModule.f18264c.f20405m0.m32064V7(true, false, null, this.f198313D, "").doOnNext(new y20() { // from class: l.vbh0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f183252a.m215055j0((Relationship) obj);
                }
            }).switchMap(new qcj() { // from class: l.wbh0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f188248a.m215056k0((Relationship) obj);
                }
            }).subscribe(psd0.m173597H(new C21556a(), new y20() { // from class: l.xbh0
                @Override // p153l.y20
                public final void call(Object obj) {
                    r1j0.m179420g("发送失败");
                }
            }));
            dismiss();
        } else {
            C8523d.m47080f(this.f198311B, this.f198313D.f56859id);
            dismiss();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m215052f0(User user) {
        bnl0.m105524M(this.f198321p, true);
        bnl0.m105524M(this.f198328w, false);
        bnl0.m105524M(this.f198323r, false);
        bnl0.m105524M(this.f198316k, false);
        if (NullChecker.m82486a(user)) {
            uqb0.f180374G.m127115L0(this.f198322q, user.m61308fp().profile480().formatted());
        }
        this.f198324s.setText("恭喜获得50次曝光机会");
        this.f198325t.setText("你心仪的女生将会更容易看到你，立即划卡体验！");
        this.f198326u.setText("确认使用");
        bnl0.m105509E0(this.f198326u, new View.OnClickListener() { // from class: l.rbh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f162023a.m215058n0(view);
            }
        });
        bnl0.m105509E0(this.f198327v, new View.OnClickListener() { // from class: l.sbh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167147a.m215059o0(view);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public final void m215053g0() {
        this.f198329x.setText("[嘿哈]");
        this.f198330y.setText("[暗中观察]");
        this.f198331z.setText("[在吗]");
        this.f198310A.setText("[微笑]");
        bnl0.m105509E0(this.f198329x, new View.OnClickListener() { // from class: l.fbh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98111a.m215060p0(view);
            }
        });
        bnl0.m105509E0(this.f198330y, new View.OnClickListener() { // from class: l.gbh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103470a.m215061q0(view);
            }
        });
        bnl0.m105509E0(this.f198331z, new View.OnClickListener() { // from class: l.hbh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108591a.m215062r0(view);
            }
        });
        bnl0.m105509E0(this.f198310A, new View.OnClickListener() { // from class: l.ibh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114218a.m215063s0(view);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public final void m215054h0(User user) {
        bnl0.m105509E0(this.f198319n, new View.OnClickListener() { // from class: l.ebh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92926a.m215064t0(view);
            }
        });
        if (NullChecker.m82486a(user)) {
            uqb0.f180374G.m127109I0(this.f198317l, user.m61308fp().profileMiddle().formatted(), qa00.m175859d(90.0f), qa00.m175859d(90.0f));
        }
        if (NullChecker.m82487b(this.f198313D)) {
            uqb0.f180374G.m127109I0(this.f198318m, this.f198313D.m61308fp().profileMiddle().formatted(), qa00.m175859d(90.0f), qa00.m175859d(90.0f));
        }
        bnl0.m105524M(this.f198320o, true);
        this.f198324s.setText("和你最匹配的人出现了");
        this.f198325t.setText("根据你的浏览记录，探探君为你推荐了一位最匹配的人，马上去聊聊吧");
        this.f198326u.setText("打个招呼");
        bnl0.m105524M(this.f198316k, true);
        bnl0.m105524M(this.f198327v, false);
        bnl0.m105524M(this.f198328w, true);
        m215053g0();
        bnl0.m105509E0(this.f198326u, new View.OnClickListener() { // from class: l.pbh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f151379a.m215065u0(view);
            }
        });
        bnl0.m105509E0(this.f198318m, new View.OnClickListener() { // from class: l.qbh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f156482a.m215066v0(view);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m215055j0(Relationship relationship) {
        CoreModule.f18264c.f20405m0.m31997E8(this.f198313D.f56859id);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ C22421c m215056k0(Relationship relationship) {
        return CoreModule.f18264c.f20384f0.m33905ap(this.f198313D.f56859id);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m215057l0(View view) {
        m215050c0();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m215058n0(View view) {
        if (gra.m131600M2()) {
            CoreModule.f18264c.f20401k2.f118660S.put(Long.valueOf(pzi0.m174454o() + AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED));
        }
        m215050c0();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m215059o0(View view) {
        if (gra.m131600M2()) {
            CoreModule.f18264c.f20401k2.f118660S.put(Long.valueOf(pzi0.m174454o() + AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED));
        }
        m215050c0();
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0075a, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(m215049b0(this.f198311B.inflater(), null));
        m215044i0();
        setCancelable(false);
        bnl0.m105524M(this.f198315j, true);
        uqb0.f180374G.m127138Y0(this.f198315j, dbc0.f87459tq);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m215060p0(View view) {
        m215046A0(this.f198312C, this.f198313D, this.f198329x.getText().toString());
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m215061q0(View view) {
        m215046A0(this.f198312C, this.f198313D, this.f198330y.getText().toString());
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m215062r0(View view) {
        m215046A0(this.f198312C, this.f198313D, this.f198331z.getText().toString());
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m215063s0(View view) {
        m215046A0(this.f198312C, this.f198313D, this.f198310A.getText().toString());
    }

    @Override // p153l.g1e, android.app.Dialog
    public void show() {
        super.show();
        int i = this.f198312C;
        if (i == 0 || i == 1) {
            i4g0.m138492A("e_surprisebox_user", "p_suggest_users_home_view", jyb.m147494Y("other_user_id", NullChecker.m82486a(this.f198313D) ? this.f198313D.f56859id : ""));
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m215064t0(View view) {
        x20 x20Var = this.f198314E;
        if (x20Var != null) {
            x20Var.call();
        }
        dismiss();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m215065u0(View view) {
        m215051d0(false);
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m215066v0(View view) {
        m215051d0(true);
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m215067w0(Message message) {
        och0.m167218d();
        dismiss();
        r1j0.m179420g("消息发送成功");
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m215068x0(Throwable th) {
        dismiss();
        r1j0.m179420g("消息发送失败");
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m215069y0(Message message) {
        och0.m167218d();
        dismiss();
        r1j0.m179420g("消息发送成功");
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m215070z0(Throwable th) {
        dismiss();
        r1j0.m179420g("消息发送失败");
    }
}
