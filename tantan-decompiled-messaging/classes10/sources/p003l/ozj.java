package p003l;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p000p1.mobile.putong.core.data.CoreGiftInfo;
import com.p000p1.mobile.putong.core.data.GiftWallSocialItem;
import com.p000p1.mobile.putong.core.data.NewGiftWall;
import com.p000p1.mobile.putong.core.message.R$string;
import com.p000p1.mobile.putong.core.p001ui.gift.layer.CoreGiftLayer;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.util.List;
import l.bkb0;
import l.d30;
import l.eqh0;
import l.i0g0;
import l.qib0;
import l.s7m;
import l.t100;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;
import v.VImage;
import v.VPullUpRecyclerView;
import v.VText;
import v.VText_AutoFit;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ozj implements s7m<hzj> {

    /* JADX INFO: renamed from: a */
    public LinearLayout f6768a;

    /* JADX INFO: renamed from: b */
    public VImage f6769b;

    /* JADX INFO: renamed from: c */
    public TextView f6770c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f6771d;

    /* JADX INFO: renamed from: e */
    public VText f6772e;

    /* JADX INFO: renamed from: f */
    public VText f6773f;

    /* JADX INFO: renamed from: g */
    public VText_AutoFit f6774g;

    /* JADX INFO: renamed from: h */
    public VPullUpRecyclerView f6775h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f6776i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f6777j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f6778k;

    /* JADX INFO: renamed from: l */
    public TextView f6779l;

    /* JADX INFO: renamed from: m */
    public TextView f6780m;

    /* JADX INFO: renamed from: n */
    public CoreGiftLayer f6781n;

    /* JADX INFO: renamed from: o */
    public Act f6782o;

    /* JADX INFO: renamed from: p */
    public hzj f6783p;

    /* JADX INFO: renamed from: q */
    public vyj f6784q;

    public ozj(Act act) {
        this.f6782o = act;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m8624b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m8629m(View view) {
        this.f6782o.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m8630n() {
        this.f6783p.m7103b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m8631p(View view) {
        zvf0.r("e_presentwall_share", m8643v());
        this.f6783p.m7110x0();
    }

    /* JADX INFO: renamed from: r */
    private void m8632r() {
        int iF0 = xdl0.F0();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f6768a.getLayoutParams();
        marginLayoutParams.topMargin = iF0;
        this.f6768a.setLayoutParams(marginLayoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f6781n.getLayoutParams();
        marginLayoutParams2.topMargin += xdl0.F0();
        this.f6781n.setLayoutParams(marginLayoutParams2);
        qib0.G.L0(this.f6771d, CoreModule.c.e0.p9().fp().profileSmall().formatted());
        this.f6772e.setText(String.format("%s:", this.f6782o.getString(R$string.f543V4)));
        xdl0.E0(this.f6769b, new View.OnClickListener() { // from class: l.izj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5232a.m8629m(view);
            }
        });
        this.f6775h.setPullUpInterval(500L);
        this.f6775h.setOnPullUpListener(new d30() { // from class: l.jzj
            public final void call() {
                this.f5400a.m8630n();
            }
        });
        qib0.G.L0(this.f6778k, CoreModule.c.e0.p9().fp().profileSmall().formatted());
        xdl0.E0(this.f6770c, new View.OnClickListener() { // from class: l.kzj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5728a.m8631p(view);
            }
        });
        vyj vyjVar = new vyj();
        this.f6784q = vyjVar;
        vyjVar.m10422J(new vyj.InterfaceC3458a() { // from class: l.lzj
            @Override // p003l.vyj.InterfaceC3458a
            /* JADX INFO: renamed from: a */
            public final void mo7932a(View view, int i, NewGiftWall newGiftWall) {
                this.f6236a.m8641q(view, i, newGiftWall);
            }
        });
        this.f6781n.f1593h = true;
        this.f6775h.setLayoutManager(new GridLayoutManager(this.f6782o, 3));
        this.f6775h.setAdapter(this.f6784q);
        xdl0.E0(this.f6777j, new View.OnClickListener() { // from class: l.mzj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6461a.m8633s(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m8633s(View view) {
        zvf0.r("e_presentwall_sender", m8643v());
        this.f6783p.m7111y0();
    }

    /* JADX INFO: renamed from: A */
    public void m8634A(boolean z, GiftWallSocialItem giftWallSocialItem) {
        if (!xdl0.O0(this.f6777j)) {
            xdl0.M(this.f6777j, true);
        }
        bkb0 bkb0Var = qib0.G;
        VDraweeView vDraweeView = this.f6778k;
        String str = giftWallSocialItem.userAvatar;
        int i = t100.x;
        bkb0Var.I0(vDraweeView, str, i, i);
        this.f6779l.setText(giftWallSocialItem.userName);
        Gender gender = giftWallSocialItem.gender;
        if (z) {
            this.f6780m.setText(i0g0.N(String.format("%s今天送了你 %s个礼物，快去聊聊吧！", TEnum.equals(gender, "female") ? "她" : "他", giftWallSocialItem.giftAmount), Color.parseColor("#212121"), eqh0.c(3)));
        } else {
            this.f6780m.setText(String.format("%s送你的礼物最多，快去打个招呼吧！", TEnum.equals(gender, "female") ? "她" : "他"));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m8635C0() {
        return this.f6782o;
    }

    /* JADX INFO: renamed from: i */
    public View m8636i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pzj.m8847b(this, layoutInflater, viewGroup);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM8636i = m8636i(layoutInflater, viewGroup);
        m8632r();
        return viewM8636i;
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void m8637i1(hzj hzjVar) {
        this.f6783p = hzjVar;
    }

    /* JADX INFO: renamed from: k */
    public void m8639k() {
        xdl0.M(this.f6770c, false);
        this.f6774g.setText("暂时获取不到地理位置");
        this.f6774g.setAlpha(0.6f);
        xdl0.M(this.f6774g, true);
    }

    /* JADX INFO: renamed from: l */
    public void m8640l() {
        xdl0.M(this.f6777j, false);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m8641q(View view, int i, NewGiftWall newGiftWall) {
        CoreGiftInfo coreGiftInfo = newGiftWall.giftInfo;
        if (coreGiftInfo.dynamicGift) {
            this.f6781n.m2785w(coreGiftInfo, new d30() { // from class: l.nzj
                public final void call() {
                    ozj.m8624b();
                }
            });
        }
    }

    /* JADX INFO: renamed from: u */
    public void m8642u() {
        this.f6781n.m2773F();
    }

    /* JADX INFO: renamed from: v */
    public String m8643v() {
        return "p_presentwall";
    }

    /* JADX INFO: renamed from: w */
    public void m8644w(int i) {
        this.f6773f.setText(syj.m9511g(i));
    }

    /* JADX INFO: renamed from: x */
    public void m8645x(List<NewGiftWall> list, boolean z) {
        if (!z) {
            this.f6784q.notifyDataSetChanged();
            return;
        }
        xdl0.M(this.f6775h, true);
        xdl0.M(this.f6776i, false);
        this.f6784q.m10421I(list);
    }

    /* JADX INFO: renamed from: y */
    public void m8646y() {
        xdl0.M(this.f6775h, false);
        xdl0.M(this.f6776i, true);
        this.f6773f.setText("0");
        xdl0.M(this.f6774g, false);
    }

    /* JADX INFO: renamed from: z */
    public void m8647z(String str) {
        this.f6774g.setText(i0g0.N(str, Color.parseColor("#212121"), eqh0.c(3)));
        this.f6774g.setAlpha(1.0f);
        xdl0.M(this.f6770c, true);
        xdl0.M(this.f6774g, true);
    }

    public void destroy() {
    }
}
