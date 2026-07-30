package p153l;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.BuzzNotifySettingView;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.settings.ChatAndNotifiAct;
import com.p051p1.mobile.putong.core.p058ui.settings.NoticeSettingAct;
import com.p051p1.mobile.putong.core.p058ui.settings.NotificationManagerAct;
import com.p051p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.tantanapp.common.utils.NullChecker;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VRelative;
import p151v.VScroll;
import p151v.VSwitch;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class zt4 implements iam<qt4> {

    /* JADX INFO: renamed from: a */
    public VLinear f205912a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f205913b;

    /* JADX INFO: renamed from: c */
    public VProgressBar f205914c;

    /* JADX INFO: renamed from: d */
    public VScroll f205915d;

    /* JADX INFO: renamed from: e */
    public VText f205916e;

    /* JADX INFO: renamed from: f */
    public VFrame f205917f;

    /* JADX INFO: renamed from: g */
    public VFrame f205918g;

    /* JADX INFO: renamed from: h */
    public VFrame f205919h;

    /* JADX INFO: renamed from: i */
    public ViewStub f205920i;

    /* JADX INFO: renamed from: j */
    public VFrame f205921j;

    /* JADX INFO: renamed from: k */
    public VText f205922k;

    /* JADX INFO: renamed from: l */
    public VFrame f205923l;

    /* JADX INFO: renamed from: m */
    public VText f205924m;

    /* JADX INFO: renamed from: n */
    public View f205925n;

    /* JADX INFO: renamed from: o */
    public VText f205926o;

    /* JADX INFO: renamed from: p */
    public VFrame f205927p;

    /* JADX INFO: renamed from: q */
    public VFrame f205928q;

    /* JADX INFO: renamed from: r */
    public VLinear f205929r;

    /* JADX INFO: renamed from: s */
    public VText f205930s;

    /* JADX INFO: renamed from: t */
    public VRelative f205931t;

    /* JADX INFO: renamed from: u */
    public VSwitch f205932u;

    /* JADX INFO: renamed from: v */
    public qt4 f205933v;

    /* JADX INFO: renamed from: w */
    public ChatAndNotifiAct f205934w;

    /* JADX INFO: renamed from: x */
    public BuzzNotifySettingView f205935x;

    public zt4(ChatAndNotifiAct chatAndNotifiAct) {
        this.f205934w = chatAndNotifiAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m221396p(View view) {
        this.f205934w.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m221397q(View view) {
        if (NotificationCheckerCommon.m80403a() != NotificationCheckerCommon.State.closed) {
            this.f205934w.startActivity(new Intent(getAct(), (Class<?>) NotificationManagerAct.class));
        } else {
            o1j0.m165636j("您已关闭通知提醒，请设置开启");
            iz40.m142756A();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m221398s(View view) {
        this.f205934w.startActivity(new Intent(getAct(), (Class<?>) NoticeSettingAct.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m221399w(View view) {
        boolean zM106262T = bsj0.m106262T(this.f205927p);
        if (zM106262T) {
            MessagesAct.f32484s.put(Boolean.TRUE);
        }
        this.f205933v.m177884o0(zM106262T);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m221400x(View view) {
        this.f205933v.m177883n0(bsj0.m106262T(this.f205928q));
    }

    /* JADX INFO: renamed from: A */
    public void m221401A(boolean z, boolean z2, boolean z3, boolean z4) {
        bsj0.m106284t(this.f205921j, z);
        this.f205921j.setOnClickListener(new View.OnClickListener() { // from class: l.rt4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f164767a.m221409u(view);
            }
        });
        bsj0.m106284t(this.f205918g, z2);
        this.f205918g.setOnClickListener(new View.OnClickListener() { // from class: l.st4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f170544a.m221410v(view);
            }
        });
        bsj0.m106284t(this.f205927p, z3);
        this.f205927p.setOnClickListener(new View.OnClickListener() { // from class: l.tt4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176054a.m221399w(view);
            }
        });
        bsj0.m106284t(this.f205928q, z4);
        this.f205928q.setOnClickListener(new View.OnClickListener() { // from class: l.ut4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f180889a.m221400x(view);
            }
        });
        this.f205928q.setVisibility(8);
    }

    /* JADX INFO: renamed from: A3 */
    public void m221402A3(String str) {
        this.f205913b.setTitle(this.f205934w.getString(R$string.f19101ao));
        this.f205913b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.vt4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f185686a.m221396p(view);
            }
        });
        m221408n();
        if (ytk.m217339c()) {
            this.f205917f.setVisibility(0);
            this.f205917f.setOnClickListener(new View.OnClickListener() { // from class: l.wt4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f190712a.m221397q(view);
                }
            });
        }
        boolean zM113372i = d09.m113372i();
        VFrame vFrame = this.f205923l;
        if (zM113372i) {
            bnl0.m105524M(vFrame, true);
            bnl0.m105509E0(this.f205923l, new View.OnClickListener() { // from class: l.xt4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f196181a.m221398s(view);
                }
            });
        } else {
            bnl0.m105524M(vFrame, false);
        }
        if (d79.m114675e0() && !NullChecker.m82486a(this.f205935x)) {
            this.f205935x = (BuzzNotifySettingView) this.f205920i.inflate();
        }
        View viewMo103735a = CoreModule.m30934Q().mo68462qs().mo103735a(this.f205934w);
        this.f205919h.removeAllViews();
        VFrame vFrame2 = this.f205919h;
        if (viewMo103735a == null) {
            bnl0.m105524M(vFrame2, false);
        } else {
            vFrame2.addView(viewMo103735a);
            bnl0.m105524M(this.f205919h, true);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m221403B(boolean z) {
        bsj0.m106284t(this.f205931t, !z);
        bnl0.m105524M(this.f205929r, true);
        this.f205931t.setOnClickListener(new View.OnClickListener() { // from class: l.yt4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f201484a.m221411y(view);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public void m221404C() {
        this.f205915d.setVisibility(4);
        this.f205914c.setVisibility(0);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f205934w;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m221405k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m221405k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return au4.m100354b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public PutongAct getAct() {
        return this.f205934w;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(qt4 qt4Var) {
        this.f205933v = qt4Var;
    }

    /* JADX INFO: renamed from: n */
    public final void m221408n() {
        this.f205921j.setVisibility(8);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m221409u(View view) {
        this.f205933v.m177886q0(bsj0.m106262T(this.f205921j));
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m221410v(View view) {
        this.f205933v.m177885p0(bsj0.m106262T(this.f205918g));
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m221411y(View view) {
        this.f205933v.m177882D0(!bsj0.m106262T(this.f205931t));
    }

    /* JADX INFO: renamed from: z */
    public void m221412z() {
        if (this.f205915d.getVisibility() == 4) {
            this.f205915d.setVisibility(0);
            this.f205914c.setVisibility(4);
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
