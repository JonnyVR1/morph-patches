package p153l;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreGiftInfo;
import com.p051p1.mobile.putong.core.data.GiftWallSocialItem;
import com.p051p1.mobile.putong.core.data.NewGiftWall;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.gift.layer.CoreGiftLayer;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.util.List;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VPullUpRecyclerView;
import p151v.VText;
import p151v.VText_AutoFit;

/* JADX INFO: loaded from: classes3.dex */
public class e2k implements iam<x1k> {

    /* JADX INFO: renamed from: a */
    public LinearLayout f91771a;

    /* JADX INFO: renamed from: b */
    public VImage f91772b;

    /* JADX INFO: renamed from: c */
    public TextView f91773c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f91774d;

    /* JADX INFO: renamed from: e */
    public VText f91775e;

    /* JADX INFO: renamed from: f */
    public VText f91776f;

    /* JADX INFO: renamed from: g */
    public VText_AutoFit f91777g;

    /* JADX INFO: renamed from: h */
    public VPullUpRecyclerView f91778h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f91779i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f91780j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f91781k;

    /* JADX INFO: renamed from: l */
    public TextView f91782l;

    /* JADX INFO: renamed from: m */
    public TextView f91783m;

    /* JADX INFO: renamed from: n */
    public CoreGiftLayer f91784n;

    /* JADX INFO: renamed from: o */
    public Act f91785o;

    /* JADX INFO: renamed from: p */
    public x1k f91786p;

    /* JADX INFO: renamed from: q */
    public l1k f91787q;

    public e2k(Act act) {
        this.f91785o = act;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m119090b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m119095m(View view) {
        this.f91785o.m48999H2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m119096n() {
        this.f91786p.m209076b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m119097p(View view) {
        i4g0.m138520r("e_presentwall_share", m119107v());
        this.f91786p.m209083x0();
    }

    /* JADX INFO: renamed from: r */
    private void m119098r() {
        int iM105511F0 = bnl0.m105511F0();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f91771a.getLayoutParams();
        marginLayoutParams.topMargin = iM105511F0;
        this.f91771a.setLayoutParams(marginLayoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f91784n.getLayoutParams();
        marginLayoutParams2.topMargin += bnl0.m105511F0();
        this.f91784n.setLayoutParams(marginLayoutParams2);
        uqb0.f180374G.m127115L0(this.f91774d, CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profileSmall().formatted());
        this.f91775e.setText(String.format("%s:", this.f91785o.getString(R$string.f21623V4)));
        bnl0.m105509E0(this.f91772b, new View.OnClickListener() { // from class: l.y1k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197113a.m119095m(view);
            }
        });
        this.f91778h.setPullUpInterval(500L);
        this.f91778h.setOnPullUpListener(new x20() { // from class: l.z1k
            @Override // p153l.x20
            public final void call() {
                this.f202566a.m119096n();
            }
        });
        uqb0.f180374G.m127115L0(this.f91781k, CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profileSmall().formatted());
        bnl0.m105509E0(this.f91773c, new View.OnClickListener() { // from class: l.a2k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f68007a.m119097p(view);
            }
        });
        l1k l1kVar = new l1k();
        this.f91787q = l1kVar;
        l1kVar.m152504J(new l1k.InterfaceC18333a() { // from class: l.b2k
            @Override // p153l.l1k.InterfaceC18333a
            /* JADX INFO: renamed from: a */
            public final void mo102200a(View view, int i, NewGiftWall newGiftWall) {
                this.f74636a.m119105q(view, i, newGiftWall);
            }
        });
        this.f91784n.f30047h = true;
        this.f91778h.setLayoutManager(new GridLayoutManager(this.f91785o, 3));
        this.f91778h.setAdapter(this.f91787q);
        bnl0.m105509E0(this.f91780j, new View.OnClickListener() { // from class: l.c2k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79489a.m119099s(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m119099s(View view) {
        i4g0.m138520r("e_presentwall_sender", m119107v());
        this.f91786p.m209084y0();
    }

    /* JADX INFO: renamed from: A */
    public void m119100A(boolean z, GiftWallSocialItem giftWallSocialItem) {
        if (!bnl0.m105529O0(this.f91780j)) {
            bnl0.m105524M(this.f91780j, true);
        }
        fsb0 fsb0Var = uqb0.f180374G;
        VDraweeView vDraweeView = this.f91781k;
        String str = giftWallSocialItem.userAvatar;
        int i = qa00.f156337x;
        fsb0Var.m127109I0(vDraweeView, str, i, i);
        this.f91782l.setText(giftWallSocialItem.userName);
        Gender gender = giftWallSocialItem.gender;
        if (z) {
            this.f91783m.setText(q8g0.m175782N(String.format("%s今天送了你 %s个礼物，快去聊聊吧！", TEnum.equals(gender, "female") ? "她" : "他", giftWallSocialItem.giftAmount), Color.parseColor("#212121"), lyh0.m156283c(3)));
        } else {
            this.f91783m.setText(String.format("%s送你的礼物最多，快去打个招呼吧！", TEnum.equals(gender, "female") ? "她" : "他"));
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f91785o;
    }

    /* JADX INFO: renamed from: i */
    public View m119101i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return f2k.m123628b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM119101i = m119101i(layoutInflater, viewGroup);
        m119098r();
        return viewM119101i;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(x1k x1kVar) {
        this.f91786p = x1kVar;
    }

    /* JADX INFO: renamed from: k */
    public void m119103k() {
        bnl0.m105524M(this.f91773c, false);
        this.f91777g.setText("暂时获取不到地理位置");
        this.f91777g.setAlpha(0.6f);
        bnl0.m105524M(this.f91777g, true);
    }

    /* JADX INFO: renamed from: l */
    public void m119104l() {
        bnl0.m105524M(this.f91780j, false);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m119105q(View view, int i, NewGiftWall newGiftWall) {
        CoreGiftInfo coreGiftInfo = newGiftWall.giftInfo;
        if (coreGiftInfo.dynamicGift) {
            this.f91784n.m46638w(coreGiftInfo, new x20() { // from class: l.d2k
                @Override // p153l.x20
                public final void call() {
                    e2k.m119090b();
                }
            });
        }
    }

    /* JADX INFO: renamed from: u */
    public void m119106u() {
        this.f91784n.m46626F();
    }

    /* JADX INFO: renamed from: v */
    public String m119107v() {
        return "p_presentwall";
    }

    /* JADX INFO: renamed from: w */
    public void m119108w(int i) {
        this.f91776f.setText(i1k.m138110g(i));
    }

    /* JADX INFO: renamed from: x */
    public void m119109x(List<NewGiftWall> list, boolean z) {
        if (!z) {
            this.f91787q.notifyDataSetChanged();
            return;
        }
        bnl0.m105524M(this.f91778h, true);
        bnl0.m105524M(this.f91779i, false);
        this.f91787q.m152503I(list);
    }

    /* JADX INFO: renamed from: y */
    public void m119110y() {
        bnl0.m105524M(this.f91778h, false);
        bnl0.m105524M(this.f91779i, true);
        this.f91776f.setText("0");
        bnl0.m105524M(this.f91777g, false);
    }

    /* JADX INFO: renamed from: z */
    public void m119111z(String str) {
        this.f91777g.setText(q8g0.m175782N(str, Color.parseColor("#212121"), lyh0.m156283c(3)));
        this.f91777g.setAlpha(1.0f);
        bnl0.m105524M(this.f91773c, true);
        bnl0.m105524M(this.f91777g, true);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
