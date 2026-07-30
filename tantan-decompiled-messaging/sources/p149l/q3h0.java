package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.p053ui.greet.C8360d;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.Channel;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VIcon;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class q3h0 extends szd {

    /* JADX INFO: renamed from: A */
    public VText f152438A;

    /* JADX INFO: renamed from: B */
    public final Act f152439B;

    /* JADX INFO: renamed from: C */
    public int f152440C;

    /* JADX INFO: renamed from: D */
    public User f152441D;

    /* JADX INFO: renamed from: E */
    public d30 f152442E;

    /* JADX INFO: renamed from: j */
    public VDraweeView f152443j;

    /* JADX INFO: renamed from: k */
    public FrameLayout f152444k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f152445l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f152446m;

    /* JADX INFO: renamed from: n */
    public VIcon f152447n;

    /* JADX INFO: renamed from: o */
    public VIcon f152448o;

    /* JADX INFO: renamed from: p */
    public VFrame f152449p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f152450q;

    /* JADX INFO: renamed from: r */
    public VImage f152451r;

    /* JADX INFO: renamed from: s */
    public TextView f152452s;

    /* JADX INFO: renamed from: t */
    public TextView f152453t;

    /* JADX INFO: renamed from: u */
    public TextView f152454u;

    /* JADX INFO: renamed from: v */
    public TextView f152455v;

    /* JADX INFO: renamed from: w */
    public VLinear f152456w;

    /* JADX INFO: renamed from: x */
    public VText f152457x;

    /* JADX INFO: renamed from: y */
    public VText f152458y;

    /* JADX INFO: renamed from: z */
    public VText f152459z;

    /* JADX INFO: renamed from: l.q3h0$a */
    public class C19422a implements e30<roj0> {
        public C19422a() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(roj0 roj0Var) {
            g4h0.m124372d();
            q3h0.this.f152439B.startActivity(MessagesAct.m48943i2(q3h0.this.f152439B, q3h0.this.f152441D.f56011id, false, false));
        }
    }

    /* JADX INFO: renamed from: l.q3h0$b */
    public static class C19423b {

        /* JADX INFO: renamed from: a */
        public int f152461a;

        /* JADX INFO: renamed from: b */
        public User f152462b;

        /* JADX INFO: renamed from: l.q3h0$b$a */
        public class a implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Act f152463a;

            public a(Act act) {
                this.f152463a = act;
            }

            @Override // p149l.d30
            public void call() {
                if (TextUtils.isEmpty(CoreModule.f17545c.f19659k2.f184664Z.get())) {
                    return;
                }
                Act act = this.f152463a;
                if (act instanceof NewMainAct) {
                    g4h0.m124374f((NewMainAct) act);
                }
            }
        }

        /* JADX INFO: renamed from: l.q3h0$b$b */
        public class b implements DialogInterface.OnCancelListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Act f152465a;

            public b(Act act) {
                this.f152465a = act;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                if (TextUtils.isEmpty(CoreModule.f17545c.f19659k2.f184664Z.get())) {
                    return;
                }
                Act act = this.f152465a;
                if (act instanceof NewMainAct) {
                    g4h0.m124374f((NewMainAct) act);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public C19423b m172864a(int i) {
            this.f152461a = i;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C19423b m172865b(User user) {
            this.f152462b = user;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public void m172866c(Act act) {
            q3h0 q3h0Var = new q3h0(act);
            q3h0Var.m172839B0(this.f152461a);
            q3h0Var.m172811D0(this.f152462b);
            q3h0Var.show();
            q3h0Var.m172840C0(new a(act));
            q3h0Var.setOnCancelListener(new b(act));
        }
    }

    public q3h0(Context context) {
        super(context, false, 0);
        if (NullChecker.m81303a(getWindow())) {
            getWindow().setBackgroundDrawableResource(x2c0.f189527Lq);
        }
        this.f152439B = (Act) context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public void m172811D0(User user) {
        this.f152441D = user;
    }

    /* JADX INFO: renamed from: e0 */
    private void m172835e0() {
        xdl0.m208344M(this.f152451r, true);
        xdl0.m208344M(this.f152456w, false);
        xdl0.m208344M(this.f152449p, false);
        xdl0.m208344M(this.f152444k, false);
        this.f152452s.setText("恭喜获得优先推荐特权");
        this.f152453t.setText("恭喜获得配对利器，30分钟内你将曝光给比现在多10倍的人");
        this.f152454u.setText("确认使用");
        xdl0.m208344M(this.f152455v, true);
        xdl0.m208329E0(this.f152454u, new View.OnClickListener() { // from class: l.l3h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f125908a.m172849l0(view);
            }
        });
        xdl0.m208329E0(this.f152455v, new View.OnClickListener() { // from class: l.m3h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f131085a.m172837m0(view);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    private void m172836i0() {
        User userMe_ = CoreModule.m29932K().me_();
        int i = this.f152440C;
        if (i == 0 || i == 1) {
            m172846h0(userMe_);
        } else if (i == 2) {
            m172835e0();
        } else {
            if (i != 3) {
                return;
            }
            m172844f0(userMe_);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m172837m0(View view) {
        m172842c0();
    }

    /* JADX INFO: renamed from: A0 */
    public final void m172838A0(int i, final User user, String str) {
        zvf0.m220399u("e_surprisebox_user", "p_suggest_users_home_view", vwb.m200311Y("other_user_id", user.f56011id), vwb.m200311Y("is_emoji", Boolean.TRUE), vwb.m200311Y("is_click_avatar", Boolean.FALSE));
        final Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        messageNew_.value = str;
        if (i == 0) {
            duringCreated(CoreModule.f17545c.f19663m0.m31061V7(true, false, null, user, "").doOnNext(new e30() { // from class: l.b3h0
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreModule.f17545c.f19663m0.m30994E8(user.f56011id);
                }
            }).switchMap(new w9j() { // from class: l.c3h0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CoreModule.f17545c.f19642f0.m32623Dn(user.f56011id, messageNew_, null);
                }
            })).subscribe(mkd0.m154956H(new e30() { // from class: l.d3h0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f84220a.m172859w0((Message) obj);
                }
            }, new e30() { // from class: l.e3h0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f89180a.m172860x0((Throwable) obj);
                }
            }));
        } else if (i == 1) {
            duringCreated(CoreModule.f17545c.f19678r0.m34149u6(user.f56011id, Channel.get(Channel.surprise_box), messageNew_, null, null)).subscribe(mkd0.m154956H(new e30() { // from class: l.f3h0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f94685a.m172861y0((Message) obj);
                }
            }, new e30() { // from class: l.g3h0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f100473a.m172862z0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: B0 */
    public void m172839B0(int i) {
        this.f152440C = i;
    }

    /* JADX INFO: renamed from: C0 */
    public void m172840C0(d30 d30Var) {
        this.f152442E = d30Var;
    }

    /* JADX INFO: renamed from: b0 */
    public View m172841b0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return r3h0.m177672b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m172842c0() {
        dismiss();
        if (v930.m197534h() != TabName.Card) {
            this.f152439B.startActivity(NewMainAct.m39685I5(this.f152439B, NavigationIntent.get("cards")));
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m172843d0(boolean z) {
        User user = this.f152441D;
        if (user == null) {
            return;
        }
        zvf0.m220399u("e_surprisebox_user", "p_suggest_users_home_view", vwb.m200311Y("other_user_id", user.f56011id), vwb.m200311Y("is_emoji", Boolean.FALSE), vwb.m200311Y("is_click_avatar", Boolean.valueOf(z)));
        if (this.f152440C == 0) {
            CoreModule.f17545c.f19663m0.m31061V7(true, false, null, this.f152441D, "").doOnNext(new e30() { // from class: l.n3h0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f136993a.m172847j0((Relationship) obj);
                }
            }).switchMap(new w9j() { // from class: l.o3h0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f141668a.m172848k0((Relationship) obj);
                }
            }).subscribe(mkd0.m154956H(new C19422a(), new e30() { // from class: l.p3h0
                @Override // p149l.e30
                public final void call(Object obj) {
                    osi0.m165783g("发送失败");
                }
            }));
            dismiss();
        } else {
            C8360d.m45897f(this.f152439B, this.f152441D.f56011id);
            dismiss();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m172844f0(User user) {
        xdl0.m208344M(this.f152449p, true);
        xdl0.m208344M(this.f152456w, false);
        xdl0.m208344M(this.f152451r, false);
        xdl0.m208344M(this.f152444k, false);
        if (NullChecker.m81303a(user)) {
            qib0.f154691G.m102331L0(this.f152450q, user.m60124fp().profile480().formatted());
        }
        this.f152452s.setText("恭喜获得50次曝光机会");
        this.f152453t.setText("你心仪的女生将会更容易看到你，立即划卡体验！");
        this.f152454u.setText("确认使用");
        xdl0.m208329E0(this.f152454u, new View.OnClickListener() { // from class: l.j3h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f116073a.m172850n0(view);
            }
        });
        xdl0.m208329E0(this.f152455v, new View.OnClickListener() { // from class: l.k3h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120841a.m172851o0(view);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public final void m172845g0() {
        this.f152457x.setText("[嘿哈]");
        this.f152458y.setText("[暗中观察]");
        this.f152459z.setText("[在吗]");
        this.f152438A.setText("[微笑]");
        xdl0.m208329E0(this.f152457x, new View.OnClickListener() { // from class: l.x2h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f190803a.m172852p0(view);
            }
        });
        xdl0.m208329E0(this.f152458y, new View.OnClickListener() { // from class: l.y2h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195616a.m172853q0(view);
            }
        });
        xdl0.m208329E0(this.f152459z, new View.OnClickListener() { // from class: l.z2h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f201234a.m172854r0(view);
            }
        });
        xdl0.m208329E0(this.f152438A, new View.OnClickListener() { // from class: l.a3h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f67367a.m172855s0(view);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public final void m172846h0(User user) {
        xdl0.m208329E0(this.f152447n, new View.OnClickListener() { // from class: l.w2h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f184244a.m172856t0(view);
            }
        });
        if (NullChecker.m81303a(user)) {
            qib0.f154691G.m102325I0(this.f152445l, user.m60124fp().profileMiddle().formatted(), t100.m186890d(90.0f), t100.m186890d(90.0f));
        }
        if (NullChecker.m81304b(this.f152441D)) {
            qib0.f154691G.m102325I0(this.f152446m, this.f152441D.m60124fp().profileMiddle().formatted(), t100.m186890d(90.0f), t100.m186890d(90.0f));
        }
        xdl0.m208344M(this.f152448o, true);
        this.f152452s.setText("和你最匹配的人出现了");
        this.f152453t.setText("根据你的浏览记录，探探君为你推荐了一位最匹配的人，马上去聊聊吧");
        this.f152454u.setText("打个招呼");
        xdl0.m208344M(this.f152444k, true);
        xdl0.m208344M(this.f152455v, false);
        xdl0.m208344M(this.f152456w, true);
        m172845g0();
        xdl0.m208329E0(this.f152454u, new View.OnClickListener() { // from class: l.h3h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f105741a.m172857u0(view);
            }
        });
        xdl0.m208329E0(this.f152446m, new View.OnClickListener() { // from class: l.i3h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f111285a.m172858v0(view);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m172847j0(Relationship relationship) {
        CoreModule.f17545c.f19663m0.m30994E8(this.f152441D.f56011id);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ C22306c m172848k0(Relationship relationship) {
        return CoreModule.f17545c.f19642f0.m32902ap(this.f152441D.f56011id);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m172849l0(View view) {
        m172842c0();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m172850n0(View view) {
        if (upa.m194669M2()) {
            CoreModule.f17545c.f19659k2.f184657S.put(Long.valueOf(mqi0.m155944o() + AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED));
        }
        m172842c0();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m172851o0(View view) {
        if (upa.m194669M2()) {
            CoreModule.f17545c.f19659k2.f184657S.put(Long.valueOf(mqi0.m155944o() + AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED));
        }
        m172842c0();
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0074a, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(m172841b0(this.f152439B.inflater(), null));
        m172836i0();
        setCancelable(false);
        xdl0.m208344M(this.f152443j, true);
        qib0.f154691G.m102354Y0(this.f152443j, x2c0.f189339Fp);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m172852p0(View view) {
        m172838A0(this.f152440C, this.f152441D, this.f152457x.getText().toString());
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m172853q0(View view) {
        m172838A0(this.f152440C, this.f152441D, this.f152458y.getText().toString());
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m172854r0(View view) {
        m172838A0(this.f152440C, this.f152441D, this.f152459z.getText().toString());
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m172855s0(View view) {
        m172838A0(this.f152440C, this.f152441D, this.f152438A.getText().toString());
    }

    @Override // p149l.szd, android.app.Dialog
    public void show() {
        super.show();
        int i = this.f152440C;
        if (i == 0 || i == 1) {
            zvf0.m220368A("e_surprisebox_user", "p_suggest_users_home_view", vwb.m200311Y("other_user_id", NullChecker.m81303a(this.f152441D) ? this.f152441D.f56011id : ""));
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m172856t0(View view) {
        d30 d30Var = this.f152442E;
        if (d30Var != null) {
            d30Var.call();
        }
        dismiss();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m172857u0(View view) {
        m172843d0(false);
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m172858v0(View view) {
        m172843d0(true);
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m172859w0(Message message) {
        g4h0.m124372d();
        dismiss();
        osi0.m165783g("消息发送成功");
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m172860x0(Throwable th) {
        dismiss();
        osi0.m165783g("消息发送失败");
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m172861y0(Message message) {
        g4h0.m124372d();
        dismiss();
        osi0.m165783g("消息发送成功");
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m172862z0(Throwable th) {
        dismiss();
        osi0.m165783g("消息发送失败");
    }
}
