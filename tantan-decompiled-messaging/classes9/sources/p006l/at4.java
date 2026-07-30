package p006l;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.settings.ChatAndNotifiAct;
import com.p000p1.mobile.putong.core.p004ui.settings.NoticeSettingAct;
import com.p000p1.mobile.putong.core.p004ui.settings.NotificationManagerAct;
import com.p1.mobile.putong.core.ui.lovebuzz.widget.BuzzNotifySettingView;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.tantanapp.common.utils.NullChecker;
import l.bt4;
import l.lsi0;
import l.s7m;
import l.uq40;
import l.xdl0;
import l.yij0;
import v.VFrame;
import v.VLinear;
import v.VProgressBar;
import v.VRelative;
import v.VScroll;
import v.VSwitch;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class at4 implements s7m<rs4> {

    /* JADX INFO: renamed from: a */
    public VLinear f8481a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f8482b;

    /* JADX INFO: renamed from: c */
    public VProgressBar f8483c;

    /* JADX INFO: renamed from: d */
    public VScroll f8484d;

    /* JADX INFO: renamed from: e */
    public VText f8485e;

    /* JADX INFO: renamed from: f */
    public VFrame f8486f;

    /* JADX INFO: renamed from: g */
    public VFrame f8487g;

    /* JADX INFO: renamed from: h */
    public VFrame f8488h;

    /* JADX INFO: renamed from: i */
    public ViewStub f8489i;

    /* JADX INFO: renamed from: j */
    public VFrame f8490j;

    /* JADX INFO: renamed from: k */
    public VText f8491k;

    /* JADX INFO: renamed from: l */
    public VFrame f8492l;

    /* JADX INFO: renamed from: m */
    public VText f8493m;

    /* JADX INFO: renamed from: n */
    public View f8494n;

    /* JADX INFO: renamed from: o */
    public VText f8495o;

    /* JADX INFO: renamed from: p */
    public VFrame f8496p;

    /* JADX INFO: renamed from: q */
    public VFrame f8497q;

    /* JADX INFO: renamed from: r */
    public VLinear f8498r;

    /* JADX INFO: renamed from: s */
    public VText f8499s;

    /* JADX INFO: renamed from: t */
    public VRelative f8500t;

    /* JADX INFO: renamed from: u */
    public VSwitch f8501u;

    /* JADX INFO: renamed from: v */
    public rs4 f8502v;

    /* JADX INFO: renamed from: w */
    public ChatAndNotifiAct f8503w;

    /* JADX INFO: renamed from: x */
    public BuzzNotifySettingView f8504x;

    public at4(ChatAndNotifiAct chatAndNotifiAct) {
        this.f8503w = chatAndNotifiAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m12192p(View view) {
        this.f8503w.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m12193q(View view) {
        if (NotificationCheckerCommon.a() != NotificationCheckerCommon.State.closed) {
            this.f8503w.startActivity(new Intent((Context) act(), (Class<?>) NotificationManagerAct.class));
        } else {
            lsi0.j("您已关闭通知提醒，请设置开启");
            uq40.A();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m12194s(View view) {
        this.f8503w.startActivity(new Intent((Context) act(), (Class<?>) NoticeSettingAct.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m12195w(View view) {
        boolean zT = yij0.T(this.f8496p);
        if (zT) {
            MessagesAct.s.put(Boolean.TRUE);
        }
        this.f8502v.m22906o0(zT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m12196x(View view) {
        this.f8502v.m22905n0(yij0.T(this.f8497q));
    }

    /* JADX INFO: renamed from: A */
    public void m12197A(boolean z, boolean z2, boolean z3, boolean z4) {
        yij0.t(this.f8490j, z);
        this.f8490j.setOnClickListener(new View.OnClickListener() { // from class: l.ss4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21630a.m12207u(view);
            }
        });
        yij0.t(this.f8487g, z2);
        this.f8487g.setOnClickListener(new View.OnClickListener() { // from class: l.ts4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22255a.m12208v(view);
            }
        });
        yij0.t(this.f8496p, z3);
        this.f8496p.setOnClickListener(new View.OnClickListener() { // from class: l.us4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23724a.m12195w(view);
            }
        });
        yij0.t(this.f8497q, z4);
        this.f8497q.setOnClickListener(new View.OnClickListener() { // from class: l.vs4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f24439a.m12196x(view);
            }
        });
        this.f8497q.setVisibility(8);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: A3 */
    public void m12198A3(String str) {
        this.f8482b.setTitle(this.f8503w.getString(R$string.f1699En));
        this.f8482b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.ws4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f25341a.m12192p(view);
            }
        });
        m12206n();
        if (irk.m16952c()) {
            this.f8486f.setVisibility(0);
            this.f8486f.setOnClickListener(new View.OnClickListener() { // from class: l.xs4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f27699a.m12193q(view);
                }
            });
        }
        boolean zM26018i = vy8.m26018i();
        VFrame vFrame = this.f8492l;
        if (zM26018i) {
            xdl0.M(vFrame, true);
            xdl0.E0(this.f8492l, new View.OnClickListener() { // from class: l.ys4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f28365a.m12194s(view);
                }
            });
        } else {
            xdl0.M(vFrame, false);
        }
        if (u59.m24994d0() && !NullChecker.a(this.f8504x)) {
            this.f8504x = this.f8489i.inflate();
        }
        View viewA = CoreModule.m1855Q().qs().a(this.f8503w);
        this.f8488h.removeAllViews();
        VFrame vFrame2 = this.f8488h;
        if (viewA == null) {
            xdl0.M(vFrame2, false);
        } else {
            vFrame2.addView(viewA);
            xdl0.M(this.f8488h, true);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m12199B(boolean z) {
        yij0.t(this.f8500t, !z);
        xdl0.M(this.f8498r, true);
        this.f8500t.setOnClickListener(new View.OnClickListener() { // from class: l.zs4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f28951a.m12209y(view);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public void m12200C() {
        this.f8484d.setVisibility(4);
        this.f8483c.setVisibility(0);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m12201C0() {
        return this.f8503w;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m12203k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m12203k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return bt4.b(this, layoutInflater, viewGroup);
    }

    @Nullable
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public PutongAct act() {
        return this.f8503w;
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void m12202i1(rs4 rs4Var) {
        this.f8502v = rs4Var;
    }

    /* JADX INFO: renamed from: n */
    public final void m12206n() {
        this.f8490j.setVisibility(8);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m12207u(View view) {
        this.f8502v.m22908q0(yij0.T(this.f8490j));
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m12208v(View view) {
        this.f8502v.m22907p0(yij0.T(this.f8487g));
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m12209y(View view) {
        this.f8502v.m22903D0(!yij0.T(this.f8500t));
    }

    /* JADX INFO: renamed from: z */
    public void m12210z() {
        if (this.f8484d.getVisibility() == 4) {
            this.f8484d.setVisibility(0);
            this.f8483c.setVisibility(4);
        }
    }

    public void destroy() {
    }
}
