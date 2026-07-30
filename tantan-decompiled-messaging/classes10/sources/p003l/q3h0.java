package p003l;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.data.Message;
import com.p000p1.mobile.putong.core.data.MessageType;
import com.p000p1.mobile.putong.core.data.Sticker;
import com.p000p1.mobile.putong.core.p001ui.greet.C3135d;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.data.Channel;
import com.p1.mobile.putong.data.NavigationIntent;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;
import l.d30;
import l.e30;
import l.g4h0;
import l.j760;
import l.mkd0;
import l.mqi0;
import l.osi0;
import l.qib0;
import l.roj0;
import l.szd;
import l.t100;
import l.upa;
import l.vwb;
import l.w9j;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import rx.c;
import v.VDraweeView;
import v.VFrame;
import v.VIcon;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class q3h0 extends szd {

    /* JADX INFO: renamed from: A */
    public VText f6940A;

    /* JADX INFO: renamed from: B */
    public final Act f6941B;

    /* JADX INFO: renamed from: C */
    public int f6942C;

    /* JADX INFO: renamed from: D */
    public User f6943D;

    /* JADX INFO: renamed from: E */
    public d30 f6944E;

    /* JADX INFO: renamed from: j */
    public VDraweeView f6945j;

    /* JADX INFO: renamed from: k */
    public FrameLayout f6946k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f6947l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f6948m;

    /* JADX INFO: renamed from: n */
    public VIcon f6949n;

    /* JADX INFO: renamed from: o */
    public VIcon f6950o;

    /* JADX INFO: renamed from: p */
    public VFrame f6951p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f6952q;

    /* JADX INFO: renamed from: r */
    public VImage f6953r;

    /* JADX INFO: renamed from: s */
    public TextView f6954s;

    /* JADX INFO: renamed from: t */
    public TextView f6955t;

    /* JADX INFO: renamed from: u */
    public TextView f6956u;

    /* JADX INFO: renamed from: v */
    public TextView f6957v;

    /* JADX INFO: renamed from: w */
    public VLinear f6958w;

    /* JADX INFO: renamed from: x */
    public VText f6959x;

    /* JADX INFO: renamed from: y */
    public VText f6960y;

    /* JADX INFO: renamed from: z */
    public VText f6961z;

    /* JADX INFO: renamed from: l.q3h0$a */
    public class C3406a implements e30<roj0> {
        public C3406a() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(roj0 roj0Var) {
            g4h0.d();
            q3h0.this.f6941B.startActivity(MessagesAct.i2(q3h0.this.f6941B, ((DbObject) q3h0.this.f6943D).id, false, false));
        }
    }

    /* JADX INFO: renamed from: l.q3h0$b */
    public static class C3407b {

        /* JADX INFO: renamed from: a */
        public int f6963a;

        /* JADX INFO: renamed from: b */
        public User f6964b;

        /* JADX INFO: renamed from: l.q3h0$b$a */
        public class a implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Act f6965a;

            public a(Act act) {
                this.f6965a = act;
            }

            public void call() {
                if (TextUtils.isEmpty((CharSequence) CoreModule.c.k2.Z.get())) {
                    return;
                }
                NewMainAct newMainAct = this.f6965a;
                if (newMainAct instanceof NewMainAct) {
                    g4h0.f(newMainAct);
                }
            }
        }

        /* JADX INFO: renamed from: l.q3h0$b$b */
        public class b implements DialogInterface.OnCancelListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Act f6967a;

            public b(Act act) {
                this.f6967a = act;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                if (TextUtils.isEmpty((CharSequence) CoreModule.c.k2.Z.get())) {
                    return;
                }
                NewMainAct newMainAct = this.f6967a;
                if (newMainAct instanceof NewMainAct) {
                    g4h0.f(newMainAct);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public C3407b m8907a(int i) {
            this.f6963a = i;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C3407b m8908b(User user) {
            this.f6964b = user;
            return this;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.app.Dialog, l.q3h0] */
        /* JADX INFO: renamed from: c */
        public void m8909c(Act act) {
            ?? q3h0Var = new q3h0(act);
            q3h0Var.m8882B0(this.f6963a);
            q3h0Var.m8854D0(this.f6964b);
            q3h0Var.show();
            q3h0Var.m8883C0(new a(act));
            q3h0Var.setOnCancelListener(new b(act));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q3h0(Context context) {
        super(context, false, 0);
        if (NullChecker.a(getWindow())) {
            getWindow().setBackgroundDrawableResource(x2c0.Lq);
        }
        this.f6941B = (Act) context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public void m8854D0(User user) {
        this.f6943D = user;
    }

    /* JADX INFO: renamed from: e0 */
    private void m8878e0() {
        xdl0.M(this.f6953r, true);
        xdl0.M(this.f6958w, false);
        xdl0.M(this.f6951p, false);
        xdl0.M(this.f6946k, false);
        this.f6954s.setText("恭喜获得优先推荐特权");
        this.f6955t.setText("恭喜获得配对利器，30分钟内你将曝光给比现在多10倍的人");
        this.f6956u.setText("确认使用");
        xdl0.M(this.f6957v, true);
        xdl0.E0(this.f6956u, new View.OnClickListener() { // from class: l.l3h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5752a.m8892l0(view);
            }
        });
        xdl0.E0(this.f6957v, new View.OnClickListener() { // from class: l.m3h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6246a.m8880m0(view);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    private void m8879i0() {
        User userMe_ = CoreModule.K().me_();
        int i = this.f6942C;
        if (i == 0 || i == 1) {
            m8889h0(userMe_);
        } else if (i == 2) {
            m8878e0();
        } else {
            if (i != 3) {
                return;
            }
            m8887f0(userMe_);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m8880m0(View view) {
        m8885c0();
    }

    /* JADX INFO: renamed from: A0 */
    public final void m8881A0(int i, final User user, String str) {
        zvf0.u("e_surprisebox_user", "p_suggest_users_home_view", new j760[]{vwb.Y("other_user_id", ((DbObject) user).id), vwb.Y("is_emoji", Boolean.TRUE), vwb.Y("is_click_avatar", Boolean.FALSE)});
        final Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        messageNew_.value = str;
        if (i == 0) {
            duringCreated(CoreModule.c.m0.V7(true, false, (Map) null, user, "").doOnNext(new e30() { // from class: l.b3h0
                public final void call(Object obj) {
                    CoreModule.c.m0.E8(((DbObject) user).id);
                }
            }).switchMap(new w9j() { // from class: l.c3h0
                public final Object call(Object obj) {
                    return CoreModule.c.f0.Dn(((DbObject) user).id, messageNew_, (Sticker) null);
                }
            })).subscribe(mkd0.H(new e30() { // from class: l.d3h0
                public final void call(Object obj) {
                    this.f4105a.m8902w0((Message) obj);
                }
            }, new e30() { // from class: l.e3h0
                public final void call(Object obj) {
                    this.f4253a.m8903x0((Throwable) obj);
                }
            }));
        } else if (i == 1) {
            duringCreated(CoreModule.c.r0.u6(((DbObject) user).id, Channel.get("surprise_box"), messageNew_, (String) null, (d30) null)).subscribe(mkd0.H(new e30() { // from class: l.f3h0
                public final void call(Object obj) {
                    this.f4381a.m8904y0((Message) obj);
                }
            }, new e30() { // from class: l.g3h0
                public final void call(Object obj) {
                    this.f4540a.m8905z0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: B0 */
    public void m8882B0(int i) {
        this.f6942C = i;
    }

    /* JADX INFO: renamed from: C0 */
    public void m8883C0(d30 d30Var) {
        this.f6944E = d30Var;
    }

    /* JADX INFO: renamed from: b0 */
    public View m8884b0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return r3h0.m9082b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m8885c0() {
        dismiss();
        if (v930.m10192h() != TabName.Card) {
            this.f6941B.startActivity(NewMainAct.I5(this.f6941B, NavigationIntent.get("cards")));
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m8886d0(boolean z) {
        User user = this.f6943D;
        if (user == null) {
            return;
        }
        zvf0.u("e_surprisebox_user", "p_suggest_users_home_view", new j760[]{vwb.Y("other_user_id", ((DbObject) user).id), vwb.Y("is_emoji", Boolean.FALSE), vwb.Y("is_click_avatar", Boolean.valueOf(z))});
        if (this.f6942C == 0) {
            CoreModule.c.m0.V7(true, false, (Map) null, this.f6943D, "").doOnNext(new e30() { // from class: l.n3h0
                public final void call(Object obj) {
                    this.f6476a.m8890j0((Relationship) obj);
                }
            }).switchMap(new w9j() { // from class: l.o3h0
                public final Object call(Object obj) {
                    return this.f6587a.m8891k0((Relationship) obj);
                }
            }).subscribe(mkd0.H(new C3406a(), new e30() { // from class: l.p3h0
                public final void call(Object obj) {
                    osi0.g("发送失败");
                }
            }));
            dismiss();
        } else {
            C3135d.m3243f(this.f6941B, ((DbObject) this.f6943D).id);
            dismiss();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m8887f0(User user) {
        xdl0.M(this.f6951p, true);
        xdl0.M(this.f6958w, false);
        xdl0.M(this.f6953r, false);
        xdl0.M(this.f6946k, false);
        if (NullChecker.a(user)) {
            qib0.G.L0(this.f6952q, user.fp().profile480().formatted());
        }
        this.f6954s.setText("恭喜获得50次曝光机会");
        this.f6955t.setText("你心仪的女生将会更容易看到你，立即划卡体验！");
        this.f6956u.setText("确认使用");
        xdl0.E0(this.f6956u, new View.OnClickListener() { // from class: l.j3h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5239a.m8893n0(view);
            }
        });
        xdl0.E0(this.f6957v, new View.OnClickListener() { // from class: l.k3h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5432a.m8894o0(view);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public final void m8888g0() {
        this.f6959x.setText("[嘿哈]");
        this.f6960y.setText("[暗中观察]");
        this.f6961z.setText("[在吗]");
        this.f6940A.setText("[微笑]");
        xdl0.E0(this.f6959x, new View.OnClickListener() { // from class: l.x2h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8296a.m8895p0(view);
            }
        });
        xdl0.E0(this.f6960y, new View.OnClickListener() { // from class: l.y2h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8626a.m8896q0(view);
            }
        });
        xdl0.E0(this.f6961z, new View.OnClickListener() { // from class: l.z2h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9180a.m8897r0(view);
            }
        });
        xdl0.E0(this.f6940A, new View.OnClickListener() { // from class: l.a3h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2724a.m8898s0(view);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public final void m8889h0(User user) {
        xdl0.E0(this.f6949n, new View.OnClickListener() { // from class: l.w2h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8113a.m8899t0(view);
            }
        });
        if (NullChecker.a(user)) {
            qib0.G.I0(this.f6947l, user.fp().profileMiddle().formatted(), t100.d(90.0f), t100.d(90.0f));
        }
        if (NullChecker.b(this.f6943D)) {
            qib0.G.I0(this.f6948m, this.f6943D.fp().profileMiddle().formatted(), t100.d(90.0f), t100.d(90.0f));
        }
        xdl0.M(this.f6950o, true);
        this.f6954s.setText("和你最匹配的人出现了");
        this.f6955t.setText("根据你的浏览记录，探探君为你推荐了一位最匹配的人，马上去聊聊吧");
        this.f6956u.setText("打个招呼");
        xdl0.M(this.f6946k, true);
        xdl0.M(this.f6957v, false);
        xdl0.M(this.f6958w, true);
        m8888g0();
        xdl0.E0(this.f6956u, new View.OnClickListener() { // from class: l.h3h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4786a.m8900u0(view);
            }
        });
        xdl0.E0(this.f6948m, new View.OnClickListener() { // from class: l.i3h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4986a.m8901v0(view);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m8890j0(Relationship relationship) {
        CoreModule.c.m0.E8(((DbObject) this.f6943D).id);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ c m8891k0(Relationship relationship) {
        return CoreModule.c.f0.ap(((DbObject) this.f6943D).id);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m8892l0(View view) {
        m8885c0();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m8893n0(View view) {
        if (upa.M2()) {
            CoreModule.c.k2.S.put(Long.valueOf(mqi0.o() + 600000));
        }
        m8885c0();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m8894o0(View view) {
        if (upa.M2()) {
            CoreModule.c.k2.S.put(Long.valueOf(mqi0.o() + 600000));
        }
        m8885c0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        super/*androidx.appcompat.app.a*/.onCreate(bundle);
        setContentView(m8884b0(this.f6941B.inflater(), null));
        m8879i0();
        setCancelable(false);
        xdl0.M(this.f6945j, true);
        qib0.G.Y0(this.f6945j, x2c0.Fp);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m8895p0(View view) {
        m8881A0(this.f6942C, this.f6943D, this.f6959x.getText().toString());
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m8896q0(View view) {
        m8881A0(this.f6942C, this.f6943D, this.f6960y.getText().toString());
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m8897r0(View view) {
        m8881A0(this.f6942C, this.f6943D, this.f6961z.getText().toString());
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m8898s0(View view) {
        m8881A0(this.f6942C, this.f6943D, this.f6940A.getText().toString());
    }

    public void show() {
        super.show();
        int i = this.f6942C;
        if (i == 0 || i == 1) {
            zvf0.A("e_surprisebox_user", "p_suggest_users_home_view", new j760[]{vwb.Y("other_user_id", NullChecker.a(this.f6943D) ? ((DbObject) this.f6943D).id : "")});
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m8899t0(View view) {
        d30 d30Var = this.f6944E;
        if (d30Var != null) {
            d30Var.call();
        }
        dismiss();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m8900u0(View view) {
        m8886d0(false);
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m8901v0(View view) {
        m8886d0(true);
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m8902w0(Message message) {
        g4h0.d();
        dismiss();
        osi0.g("消息发送成功");
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m8903x0(Throwable th) {
        dismiss();
        osi0.g("消息发送失败");
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m8904y0(Message message) {
        g4h0.d();
        dismiss();
        osi0.g("消息发送成功");
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m8905z0(Throwable th) {
        dismiss();
        osi0.g("消息发送失败");
    }
}
