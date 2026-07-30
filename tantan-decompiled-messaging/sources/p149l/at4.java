package p149l;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.BuzzNotifySettingView;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.settings.ChatAndNotifiAct;
import com.p046p1.mobile.putong.core.p053ui.settings.NoticeSettingAct;
import com.p046p1.mobile.putong.core.p053ui.settings.NotificationManagerAct;
import com.p046p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.tantanapp.common.utils.NullChecker;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.VRelative;
import p147v.VScroll;
import p147v.VSwitch;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class at4 implements s7m<rs4> {

    /* JADX INFO: renamed from: a */
    public VLinear f71532a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f71533b;

    /* JADX INFO: renamed from: c */
    public VProgressBar f71534c;

    /* JADX INFO: renamed from: d */
    public VScroll f71535d;

    /* JADX INFO: renamed from: e */
    public VText f71536e;

    /* JADX INFO: renamed from: f */
    public VFrame f71537f;

    /* JADX INFO: renamed from: g */
    public VFrame f71538g;

    /* JADX INFO: renamed from: h */
    public VFrame f71539h;

    /* JADX INFO: renamed from: i */
    public ViewStub f71540i;

    /* JADX INFO: renamed from: j */
    public VFrame f71541j;

    /* JADX INFO: renamed from: k */
    public VText f71542k;

    /* JADX INFO: renamed from: l */
    public VFrame f71543l;

    /* JADX INFO: renamed from: m */
    public VText f71544m;

    /* JADX INFO: renamed from: n */
    public View f71545n;

    /* JADX INFO: renamed from: o */
    public VText f71546o;

    /* JADX INFO: renamed from: p */
    public VFrame f71547p;

    /* JADX INFO: renamed from: q */
    public VFrame f71548q;

    /* JADX INFO: renamed from: r */
    public VLinear f71549r;

    /* JADX INFO: renamed from: s */
    public VText f71550s;

    /* JADX INFO: renamed from: t */
    public VRelative f71551t;

    /* JADX INFO: renamed from: u */
    public VSwitch f71552u;

    /* JADX INFO: renamed from: v */
    public rs4 f71553v;

    /* JADX INFO: renamed from: w */
    public ChatAndNotifiAct f71554w;

    /* JADX INFO: renamed from: x */
    public BuzzNotifySettingView f71555x;

    public at4(ChatAndNotifiAct chatAndNotifiAct) {
        this.f71554w = chatAndNotifiAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m98746p(View view) {
        this.f71554w.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m98747q(View view) {
        if (NotificationCheckerCommon.m79220a() != NotificationCheckerCommon.State.closed) {
            this.f71554w.startActivity(new Intent(getAct(), (Class<?>) NotificationManagerAct.class));
        } else {
            lsi0.m151580j("您已关闭通知提醒，请设置开启");
            uq40.m194951A();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m98748s(View view) {
        this.f71554w.startActivity(new Intent(getAct(), (Class<?>) NoticeSettingAct.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m98749w(View view) {
        boolean zM214942T = yij0.m214942T(this.f71547p);
        if (zM214942T) {
            MessagesAct.f31636s.put(Boolean.TRUE);
        }
        this.f71553v.m180632o0(zM214942T);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m98750x(View view) {
        this.f71553v.m180631n0(yij0.m214942T(this.f71548q));
    }

    /* JADX INFO: renamed from: A */
    public void m98751A(boolean z, boolean z2, boolean z3, boolean z4) {
        yij0.m214964t(this.f71541j, z);
        this.f71541j.setOnClickListener(new View.OnClickListener() { // from class: l.ss4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166158a.m98759u(view);
            }
        });
        yij0.m214964t(this.f71538g, z2);
        this.f71538g.setOnClickListener(new View.OnClickListener() { // from class: l.ts4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171906a.m98760v(view);
            }
        });
        yij0.m214964t(this.f71547p, z3);
        this.f71547p.setOnClickListener(new View.OnClickListener() { // from class: l.us4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f177936a.m98749w(view);
            }
        });
        yij0.m214964t(this.f71548q, z4);
        this.f71548q.setOnClickListener(new View.OnClickListener() { // from class: l.vs4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182797a.m98750x(view);
            }
        });
        this.f71548q.setVisibility(8);
    }

    /* JADX INFO: renamed from: A3 */
    public void m98752A3(String str) {
        this.f71533b.setTitle(this.f71554w.getString(R$string.f17710En));
        this.f71533b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.ws4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187862a.m98746p(view);
            }
        });
        m98758n();
        if (irk.m137901c()) {
            this.f71537f.setVisibility(0);
            this.f71537f.setOnClickListener(new View.OnClickListener() { // from class: l.xs4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f194200a.m98747q(view);
                }
            });
        }
        boolean zM200611i = vy8.m200611i();
        VFrame vFrame = this.f71543l;
        if (zM200611i) {
            xdl0.m208344M(vFrame, true);
            xdl0.m208329E0(this.f71543l, new View.OnClickListener() { // from class: l.ys4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f199745a.m98748s(view);
                }
            });
        } else {
            xdl0.m208344M(vFrame, false);
        }
        if (u59.m191823d0() && !NullChecker.m81303a(this.f71555x)) {
            this.f71555x = (BuzzNotifySettingView) this.f71540i.inflate();
        }
        View viewMo101096a = CoreModule.m29936Q().mo67279qs().mo101096a(this.f71554w);
        this.f71539h.removeAllViews();
        VFrame vFrame2 = this.f71539h;
        if (viewMo101096a == null) {
            xdl0.m208344M(vFrame2, false);
        } else {
            vFrame2.addView(viewMo101096a);
            xdl0.m208344M(this.f71539h, true);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m98753B(boolean z) {
        yij0.m214964t(this.f71551t, !z);
        xdl0.m208344M(this.f71549r, true);
        this.f71551t.setOnClickListener(new View.OnClickListener() { // from class: l.zs4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f204567a.m98761y(view);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public void m98754C() {
        this.f71535d.setVisibility(4);
        this.f71534c.setVisibility(0);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f71554w;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m98755k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m98755k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return bt4.m103809b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public PutongAct getAct() {
        return this.f71554w;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(rs4 rs4Var) {
        this.f71553v = rs4Var;
    }

    /* JADX INFO: renamed from: n */
    public final void m98758n() {
        this.f71541j.setVisibility(8);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m98759u(View view) {
        this.f71553v.m180634q0(yij0.m214942T(this.f71541j));
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m98760v(View view) {
        this.f71553v.m180633p0(yij0.m214942T(this.f71538g));
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m98761y(View view) {
        this.f71553v.m180630D0(!yij0.m214942T(this.f71551t));
    }

    /* JADX INFO: renamed from: z */
    public void m98762z() {
        if (this.f71535d.getVisibility() == 4) {
            this.f71535d.setVisibility(0);
            this.f71534c.setVisibility(4);
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
