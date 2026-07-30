package p007l;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentVoiceLiveInfos;
import com.p1.mobile.android.app.Act;
import l.e30;
import l.nvc0;
import l.qib0;
import l.vwb;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class l6i extends AbstractC2409k7 implements e5i {

    /* JADX INFO: renamed from: a */
    public xa70 f9906a;

    /* JADX INFO: renamed from: b */
    public wlh f9907b;

    public l6i(zll zllVar, xa70 xa70Var) {
        this.f9907b = (wlh) zllVar;
        this.f9906a = xa70Var;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m11561n(View view) {
    }

    /* JADX INFO: renamed from: t */
    private wlh m11564t() {
        return this.f9907b;
    }

    @Override // p007l.g6i
    /* JADX INFO: renamed from: b */
    public boolean mo10419b(xa70 xa70Var) {
        Moment moment = xa70Var.f14820a;
        return moment != null && moment.isVoiceLive;
    }

    @Override // p007l.g6i
    /* JADX INFO: renamed from: c */
    public void mo10420c(xa70 xa70Var) {
        this.f9906a = xa70Var;
    }

    @Override // p007l.g6i
    /* JADX INFO: renamed from: j */
    public void mo9676j() {
        m11564t().f14601j.setOnClickListener(new View.OnClickListener() { // from class: l.h6i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l6i.m11561n(view);
            }
        });
    }

    @Override // p007l.AbstractC2409k7
    /* JADX INFO: renamed from: l */
    public void mo11392l(xa70 xa70Var) {
        MomentVoiceLiveInfos momentVoiceLiveInfos;
        this.f9906a = xa70Var;
        Moment moment = xa70Var.f14820a;
        if (!moment.isVoiceLive || (momentVoiceLiveInfos = moment.momentVoiceLiveInfos) == null || momentVoiceLiveInfos.momentVoiceUser == null || "from_live_square_tab".equals(xa70Var.f14821b)) {
            return;
        }
        this.f9907b.f14606o.setVisibility(8);
        this.f9907b.f14613v.setVisibility(0);
        m11564t().f14610s.m5813c(Color.parseColor("#35d3ff"), Color.parseColor("#35d3ff"));
        qib0.G.F(qib0.G.n(xa70Var.f14820a.momentVoiceLiveInfos.momentVoiceUser.momentAvatar).O(new nvc0(m11564t().f14610s.getAvatarSize(), m11564t().f14610s.getAvatarSize())).a(), new e30() { // from class: l.i6i
            public final void call(Object obj) {
                this.f8916a.m11569v((Bitmap) obj);
            }
        });
        this.f9907b.f14610s.setVisibility(0);
        this.f9907b.f14601j.setVisibility(0);
        this.f9907b.f14602k.setText("加入");
        this.f9907b.f14602k.setTextColor(-1);
        this.f9907b.f14602k.setTextSize(2, 12.0f);
        this.f9907b.f14601j.setBackgroundResource(f3c0.f7949y1);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f9907b.f14602k.getLayoutParams();
        layoutParams.width = xdl0.w(44.0f);
        layoutParams.height = xdl0.w(28.0f);
        this.f9907b.f14602k.setPadding(0, 0, 0, 0);
        this.f9907b.f14602k.setGravity(17);
        this.f9907b.f14602k.setLayoutParams(layoutParams);
        this.f9907b.f14612u.setText(xa70Var.f14820a.momentVoiceLiveInfos.momentVoiceUser.momentName);
        if (!m11570w().momentVoiceLiveInfos.momentVoiceUser.momentIsAnchor) {
            for (int i = 0; i < this.f9907b.f14611t.getChildCount(); i++) {
                this.f9907b.f14611t.getChildAt(i).setVisibility(8);
            }
        }
        this.f9907b.f14612u.setVisibility(0);
        this.f9907b.f14579K.setVisibility(0);
        this.f9907b.f14581M.setText(xa70Var.f14820a.momentVoiceLiveInfos.momentVoiceUser.momentDesc);
        this.f9907b.f14582N.setVisibility(8);
        this.f9907b.f14583O.setVisibility(8);
        this.f9907b.f14584P.setVisibility(8);
        this.f9907b.f14585Q.setVisibility(8);
        this.f9907b.f14575G.setVisibility(8);
        this.f9907b.f14578J.setVisibility(8);
        this.f9907b.f14580L.setVisibility(0);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f9907b.f14581M.getLayoutParams();
        layoutParams2.leftMargin = xdl0.w(4.0f);
        this.f9907b.f14581M.setLayoutParams(layoutParams2);
        String str = xa70Var.f14820a.momentVoiceLiveInfos.momentVoiceUser.momentDescStatus;
        str.getClass();
        switch (str) {
            case "follow":
                this.f9907b.f14580L.setImageResource(f3c0.f7565A1);
                break;
            case "superLike":
                this.f9907b.f14580L.setImageResource(f3c0.f7589D1);
                break;
            case "like":
                this.f9907b.f14580L.setImageResource(f3c0.f7581C1);
                break;
            case "match":
                this.f9907b.f14580L.setImageResource(f3c0.f7573B1);
                break;
            default:
                this.f9907b.f14580L.setVisibility(8);
                layoutParams2.leftMargin = 0;
                this.f9907b.f14581M.setLayoutParams(layoutParams2);
                break;
        }
        if (m11567s()) {
            m11566r(this.f9907b.f14612u);
        }
        wlh wlhVar = this.f9907b;
        vwb.z(vwb.f0(new View[]{wlhVar.f14604m, wlhVar.f14606o}), new e30() { // from class: l.j6i
            public final void call(Object obj) {
                this.f9241a.m11566r((View) obj);
            }
        });
        m11566r(this.f9907b.f14610s);
        m11566r(this.f9907b.f14602k);
    }

    /* JADX INFO: renamed from: q */
    public Act m11565q() {
        return this.f9906a.f14826g;
    }

    /* JADX INFO: renamed from: r */
    public void m11566r(final View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.k6i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f9624a.m11568u(view, view2);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final boolean m11567s() {
        return (!m11570w().isVoiceLive || m11570w().momentVoiceLiveInfos == null || m11570w().momentVoiceLiveInfos.momentVoiceUser.momentIsAnchor) ? false : true;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m11568u(View view, View view2) {
        String str;
        wlh wlhVar = this.f9907b;
        if (view == wlhVar.f14610s) {
            str = "photo";
        } else {
            str = view == wlhVar.f14602k ? "enter_room" : "content";
        }
        f5i.m10066d(this.f9906a, m11565q(), m11570w());
        Moment momentM11570w = m11570w();
        xa70 xa70Var = this.f9906a;
        osg.m12855k(momentM11570w, xa70Var.f14827h + 1, z5i.m17228u(xa70Var.f14821b), z5i.m17227t(this.f9906a.f14821b), str);
        Moment momentM11570w2 = m11570w();
        xa70 xa70Var2 = this.f9906a;
        osg.m12851g(momentM11570w2, xa70Var2.f14821b, xa70Var2.f14822c, null);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m11569v(Bitmap bitmap) {
        m11564t().f14610s.setAvatar(bitmap);
    }

    /* JADX INFO: renamed from: w */
    public Moment m11570w() {
        return this.f9906a.f14820a;
    }

    @Override // p007l.g6i
    /* JADX INFO: renamed from: f */
    public void mo9669f() {
    }

    @Override // p007l.g6i
    /* JADX INFO: renamed from: h */
    public void mo9673h() {
    }

    @Override // p007l.AbstractC2409k7, p007l.g6i
    /* JADX INFO: renamed from: d */
    public void mo10421d(xa70 xa70Var) {
    }

    @Override // p007l.AbstractC2409k7
    /* JADX INFO: renamed from: m */
    public void mo11393m(xa70 xa70Var) {
    }
}
