package p149l;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreGiftInfo;
import com.p046p1.mobile.putong.core.data.GiftWallSocialItem;
import com.p046p1.mobile.putong.core.data.NewGiftWall;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.gift.layer.CoreGiftLayer;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import java.util.List;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VPullUpRecyclerView;
import p147v.VText;
import p147v.VText_AutoFit;

/* JADX INFO: loaded from: classes10.dex */
public class ozj implements s7m<hzj> {

    /* JADX INFO: renamed from: a */
    public LinearLayout f146456a;

    /* JADX INFO: renamed from: b */
    public VImage f146457b;

    /* JADX INFO: renamed from: c */
    public TextView f146458c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f146459d;

    /* JADX INFO: renamed from: e */
    public VText f146460e;

    /* JADX INFO: renamed from: f */
    public VText f146461f;

    /* JADX INFO: renamed from: g */
    public VText_AutoFit f146462g;

    /* JADX INFO: renamed from: h */
    public VPullUpRecyclerView f146463h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f146464i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f146465j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f146466k;

    /* JADX INFO: renamed from: l */
    public TextView f146467l;

    /* JADX INFO: renamed from: m */
    public TextView f146468m;

    /* JADX INFO: renamed from: n */
    public CoreGiftLayer f146469n;

    /* JADX INFO: renamed from: o */
    public Act f146470o;

    /* JADX INFO: renamed from: p */
    public hzj f146471p;

    /* JADX INFO: renamed from: q */
    public vyj f146472q;

    public ozj(Act act) {
        this.f146470o = act;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m166866b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m166871m(View view) {
        this.f146470o.m47815F2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m166872n() {
        this.f146471p.m133685b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m166873p(View view) {
        zvf0.m220396r("e_presentwall_share", m166883v());
        this.f146471p.m133692x0();
    }

    /* JADX INFO: renamed from: r */
    private void m166874r() {
        int iM208331F0 = xdl0.m208331F0();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f146456a.getLayoutParams();
        marginLayoutParams.topMargin = iM208331F0;
        this.f146456a.setLayoutParams(marginLayoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f146469n.getLayoutParams();
        marginLayoutParams2.topMargin += xdl0.m208331F0();
        this.f146469n.setLayoutParams(marginLayoutParams2);
        qib0.f154691G.m102331L0(this.f146459d, CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profileSmall().formatted());
        this.f146460e.setText(String.format("%s:", this.f146470o.getString(R$string.f20881V4)));
        xdl0.m208329E0(this.f146457b, new View.OnClickListener() { // from class: l.izj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f115575a.m166871m(view);
            }
        });
        this.f146463h.setPullUpInterval(500L);
        this.f146463h.setOnPullUpListener(new d30() { // from class: l.jzj
            @Override // p149l.d30
            public final void call() {
                this.f120395a.m166872n();
            }
        });
        qib0.f154691G.m102331L0(this.f146466k, CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profileSmall().formatted());
        xdl0.m208329E0(this.f146458c, new View.OnClickListener() { // from class: l.kzj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f125387a.m166873p(view);
            }
        });
        vyj vyjVar = new vyj();
        this.f146472q = vyjVar;
        vyjVar.m200661J(new vyj.InterfaceC20766a() { // from class: l.lzj
            @Override // p149l.vyj.InterfaceC20766a
            /* JADX INFO: renamed from: a */
            public final void mo152350a(View view, int i, NewGiftWall newGiftWall) {
                this.f130655a.m166881q(view, i, newGiftWall);
            }
        });
        this.f146469n.f29199h = true;
        this.f146463h.setLayoutManager(new GridLayoutManager(this.f146470o, 3));
        this.f146463h.setAdapter(this.f146472q);
        xdl0.m208329E0(this.f146465j, new View.OnClickListener() { // from class: l.mzj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f136388a.m166875s(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m166875s(View view) {
        zvf0.m220396r("e_presentwall_sender", m166883v());
        this.f146471p.m133693y0();
    }

    /* JADX INFO: renamed from: A */
    public void m166876A(boolean z, GiftWallSocialItem giftWallSocialItem) {
        if (!xdl0.m208349O0(this.f146465j)) {
            xdl0.m208344M(this.f146465j, true);
        }
        bkb0 bkb0Var = qib0.f154691G;
        VDraweeView vDraweeView = this.f146466k;
        String str = giftWallSocialItem.userAvatar;
        int i = t100.f167275x;
        bkb0Var.m102325I0(vDraweeView, str, i, i);
        this.f146467l.setText(giftWallSocialItem.userName);
        Gender gender = giftWallSocialItem.gender;
        if (z) {
            this.f146468m.setText(i0g0.m133847N(String.format("%s今天送了你 %s个礼物，快去聊聊吧！", TEnum.equals(gender, "female") ? "她" : "他", giftWallSocialItem.giftAmount), Color.parseColor("#212121"), eqh0.m117752c(3)));
        } else {
            this.f146468m.setText(String.format("%s送你的礼物最多，快去打个招呼吧！", TEnum.equals(gender, "female") ? "她" : "他"));
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f146470o;
    }

    /* JADX INFO: renamed from: i */
    public View m166877i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pzj.m172237b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM166877i = m166877i(layoutInflater, viewGroup);
        m166874r();
        return viewM166877i;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(hzj hzjVar) {
        this.f146471p = hzjVar;
    }

    /* JADX INFO: renamed from: k */
    public void m166879k() {
        xdl0.m208344M(this.f146458c, false);
        this.f146462g.setText("暂时获取不到地理位置");
        this.f146462g.setAlpha(0.6f);
        xdl0.m208344M(this.f146462g, true);
    }

    /* JADX INFO: renamed from: l */
    public void m166880l() {
        xdl0.m208344M(this.f146465j, false);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m166881q(View view, int i, NewGiftWall newGiftWall) {
        CoreGiftInfo coreGiftInfo = newGiftWall.giftInfo;
        if (coreGiftInfo.dynamicGift) {
            this.f146469n.m45455w(coreGiftInfo, new d30() { // from class: l.nzj
                @Override // p149l.d30
                public final void call() {
                    ozj.m166866b();
                }
            });
        }
    }

    /* JADX INFO: renamed from: u */
    public void m166882u() {
        this.f146469n.m45443F();
    }

    /* JADX INFO: renamed from: v */
    public String m166883v() {
        return "p_presentwall";
    }

    /* JADX INFO: renamed from: w */
    public void m166884w(int i) {
        this.f146461f.setText(syj.m186678g(i));
    }

    /* JADX INFO: renamed from: x */
    public void m166885x(List<NewGiftWall> list, boolean z) {
        if (!z) {
            this.f146472q.notifyDataSetChanged();
            return;
        }
        xdl0.m208344M(this.f146463h, true);
        xdl0.m208344M(this.f146464i, false);
        this.f146472q.m200660I(list);
    }

    /* JADX INFO: renamed from: y */
    public void m166886y() {
        xdl0.m208344M(this.f146463h, false);
        xdl0.m208344M(this.f146464i, true);
        this.f146461f.setText("0");
        xdl0.m208344M(this.f146462g, false);
    }

    /* JADX INFO: renamed from: z */
    public void m166887z(String str) {
        this.f146462g.setText(i0g0.m133847N(str, Color.parseColor("#212121"), eqh0.m117752c(3)));
        this.f146462g.setAlpha(1.0f);
        xdl0.m208344M(this.f146458c, true);
        xdl0.m208344M(this.f146462g, true);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
