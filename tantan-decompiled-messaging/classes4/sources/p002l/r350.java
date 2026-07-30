package p002l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p1.mobile.putong.live.base.data.BLiveBanner;
import com.p1.mobile.putong.live.base.data.BLiveBannerTab;
import com.p1.mobile.putong.live.base.data.BLiveOfficialShowUser;
import com.p1.mobile.putong.live.livingroom.view.banner.LiveBannerView;
import java.util.List;
import l.e30;
import l.hxs;
import l.kvc0;
import l.lsi0;
import l.sds;
import l.uvr;
import l.xdl0;
import l.ydt;
import l.zcu;
import v.VDraweeView;
import v.VFrame;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class r350 extends LiveMenuDialogHolder<w350> {

    /* JADX INFO: renamed from: k */
    public ConstraintLayout f18335k;

    /* JADX INFO: renamed from: l */
    public View f18336l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f18337m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f18338n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f18339o;

    /* JADX INFO: renamed from: p */
    public TextView f18340p;

    /* JADX INFO: renamed from: q */
    public VFrame f18341q;

    /* JADX INFO: renamed from: r */
    public VText f18342r;

    /* JADX INFO: renamed from: s */
    public TextView f18343s;

    /* JADX INFO: renamed from: t */
    public LiveBannerView f18344t;

    /* JADX INFO: renamed from: u */
    public LinearLayout f18345u;

    /* JADX INFO: renamed from: v */
    public VText f18346v;

    /* JADX INFO: renamed from: w */
    public VText f18347w;

    public r350(@NonNull w350 w350Var) {
        super(t6c0.f19556I4, w350Var.act(), w350Var, j2g0.m15577c(0.3f));
    }

    /* JADX INFO: renamed from: H */
    public final void m21761H(View view) {
        s350.m22191a(this, view);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2] */
    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m21762I(BLiveBannerTab bLiveBannerTab) {
        T t = this.f3799b;
        if (t == 0 || bLiveBannerTab == null) {
            return;
        }
        if (t7t.m22811c(((w350) t).m25547E2())) {
            lsi0.y("您当前正在公演，无法查看该页面");
        } else {
            ((w350) this.f3799b).m25548F2().SchemeHandleEvent.handleScheme().j(new x1e0.C0891a(200).m25610e(bLiveBannerTab.jumpUrl).m25608c());
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [l.ho2] */
    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m21763J(View view) {
        T t = this.f3799b;
        if (t != 0) {
            ((w350) t).m24302V3();
            zcu.c("p_live_profile", sds.k().b((ho2) ((w350) this.f3799b).m25547E2(), true).a());
        }
    }

    /* JADX INFO: renamed from: K */
    public void m21764K() {
        this.f18346v.setText("已订阅");
        this.f18345u.setBackgroundResource(i3c0.f12646T0);
        this.f18346v.setTextColor(kvc0.a(h1c0.f11806m1));
        this.f18345u.setEnabled(false);
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [l.ho2] */
    /* JADX INFO: renamed from: L */
    public void m21765L(BLiveOfficialShowUser bLiveOfficialShowUser) {
        List list;
        if (bLiveOfficialShowUser != null) {
            m5211E();
            ViewGroup.LayoutParams layoutParams = this.f18338n.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = (int) (layoutParams.width / 2.1f);
                this.f18338n.setLayoutParams(layoutParams);
            }
            hxs.s("context_single_room", this.f18338n, ydt.a);
            hxs.o("context_single_room", this.f18339o, bLiveOfficialShowUser.userAvatar);
            this.f18340p.setText(bLiveOfficialShowUser.userName);
            boolean zIsEmpty = TextUtils.isEmpty(bLiveOfficialShowUser.timeDesc);
            VFrame vFrame = this.f18341q;
            if (zIsEmpty) {
                vFrame.setVisibility(8);
                this.f18342r.setVisibility(8);
            } else {
                vFrame.setVisibility(0);
                this.f18342r.setVisibility(0);
                this.f18342r.setText(bLiveOfficialShowUser.timeDesc);
            }
            this.f18343s.setVisibility(TextUtils.isEmpty(bLiveOfficialShowUser.userDesc) ? 8 : 0);
            this.f18343s.setText(bLiveOfficialShowUser.userDesc);
            BLiveBanner bLiveBanner = bLiveOfficialShowUser.userBanner;
            if (bLiveBanner == null || (list = bLiveBanner.tabs) == null || list.size() <= 0) {
                this.f18344t.setVisibility(8);
            } else {
                this.f18344t.k(this.f3799b, bLiveOfficialShowUser.userBanner.tabs, new e30() { // from class: l.p350
                    public final void call(Object obj) {
                        this.f16993a.m21762I((BLiveBannerTab) obj);
                    }
                });
                this.f18344t.setVisibility(0);
            }
            if (bLiveOfficialShowUser.isFollowed || !uvr.d().D0()) {
                this.f18345u.setVisibility(8);
            } else {
                this.f18345u.setVisibility(0);
                this.f18346v.setText("订阅");
                this.f18346v.getPaint().setFakeBoldText(true);
                this.f18346v.setTextColor(kvc0.a(h1c0.f11782e1));
                this.f18345u.setBackgroundResource(i3c0.f12891o0);
                this.f18345u.setEnabled(true);
                zcu.d("p_live_profile", sds.k().b((ho2) ((w350) this.f3799b).m25547E2(), true).a());
            }
            xdl0.E0(this.f18345u, new View.OnClickListener() { // from class: l.q350
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f17791a.m21763J(view);
                }
            });
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo5214m(View view) {
        super.mo5214m(view);
        m21761H(view);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: p */
    public void mo5216p() {
        super.mo5216p();
        LiveBannerView liveBannerView = this.f18344t;
        if (liveBannerView != null) {
            liveBannerView.i();
        }
    }
}
