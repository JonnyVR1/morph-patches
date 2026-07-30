package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveBanner;
import com.p051p1.mobile.putong.live.base.data.BLiveBannerTab;
import com.p051p1.mobile.putong.live.base.data.BLiveOfficialShowUser;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p051p1.mobile.putong.live.livingroom.view.banner.LiveBannerView;
import java.util.List;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class gc50 extends LiveMenuDialogHolder<lc50> {

    /* JADX INFO: renamed from: k */
    public ConstraintLayout f103528k;

    /* JADX INFO: renamed from: l */
    public View f103529l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f103530m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f103531n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f103532o;

    /* JADX INFO: renamed from: p */
    public TextView f103533p;

    /* JADX INFO: renamed from: q */
    public VFrame f103534q;

    /* JADX INFO: renamed from: r */
    public VText f103535r;

    /* JADX INFO: renamed from: s */
    public TextView f103536s;

    /* JADX INFO: renamed from: t */
    public LiveBannerView f103537t;

    /* JADX INFO: renamed from: u */
    public LinearLayout f103538u;

    /* JADX INFO: renamed from: v */
    public VText f103539v;

    /* JADX INFO: renamed from: w */
    public VText f103540w;

    public gc50(@NonNull lc50 lc50Var) {
        super(yec0.f198792I4, lc50Var.act(), lc50Var, qag0.m175922c(0.3f));
    }

    /* JADX INFO: renamed from: H */
    public final void m129855H(View view) {
        hc50.m134448a(this, view);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.oo2] */
    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m129856I(BLiveBannerTab bLiveBannerTab) {
        T t = this.f48605b;
        if (t == 0 || bLiveBannerTab == null) {
            return;
        }
        if (u9t.m195114c(((lc50) t).m213810E2())) {
            o1j0.m165651y("您当前正在公演，无法查看该页面");
        } else {
            ((lc50) this.f48605b).m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(200).m103154e(bLiveBannerTab.jumpUrl).m103152c());
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m129857J(View view) {
        T t = this.f48605b;
        if (t != 0) {
            ((lc50) t).m153634V3();
            afu.m97554c("p_live_profile", tfs.m190969k().m190972b(((lc50) this.f48605b).m213810E2(), true).m190971a());
        }
    }

    /* JADX INFO: renamed from: K */
    public void m129858K() {
        this.f103539v.setText("已订阅");
        this.f103538u.setBackgroundResource(obc0.f146189T0);
        this.f103539v.setTextColor(n3d0.m161277a(n9c0.f140847m1));
        this.f103538u.setEnabled(false);
    }

    /* JADX INFO: renamed from: L */
    public void m129859L(BLiveOfficialShowUser bLiveOfficialShowUser) {
        List<BLiveBannerTab> list;
        if (bLiveOfficialShowUser != null) {
            m73017E();
            ViewGroup.LayoutParams layoutParams = this.f103531n.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = (int) (layoutParams.width / 2.1f);
                this.f103531n.setLayoutParams(layoutParams);
            }
            izs.m142868s("context_single_room", this.f103531n, zft.f204206a);
            izs.m142864o("context_single_room", this.f103532o, bLiveOfficialShowUser.userAvatar);
            this.f103533p.setText(bLiveOfficialShowUser.userName);
            boolean zIsEmpty = TextUtils.isEmpty(bLiveOfficialShowUser.timeDesc);
            VFrame vFrame = this.f103534q;
            if (zIsEmpty) {
                vFrame.setVisibility(8);
                this.f103535r.setVisibility(8);
            } else {
                vFrame.setVisibility(0);
                this.f103535r.setVisibility(0);
                this.f103535r.setText(bLiveOfficialShowUser.timeDesc);
            }
            this.f103536s.setVisibility(TextUtils.isEmpty(bLiveOfficialShowUser.userDesc) ? 8 : 0);
            this.f103536s.setText(bLiveOfficialShowUser.userDesc);
            BLiveBanner bLiveBanner = bLiveOfficialShowUser.userBanner;
            if (bLiveBanner == null || (list = bLiveBanner.tabs) == null || list.size() <= 0) {
                this.f103537t.setVisibility(8);
            } else {
                this.f103537t.m77859k(this.f48605b, bLiveOfficialShowUser.userBanner.tabs, new y20() { // from class: l.ec50
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f93017a.m129856I((BLiveBannerTab) obj);
                    }
                });
                this.f103537t.setVisibility(0);
            }
            if (bLiveOfficialShowUser.isFollowed || !vxr.m203876d().m170970D0()) {
                this.f103538u.setVisibility(8);
            } else {
                this.f103538u.setVisibility(0);
                this.f103539v.setText("订阅");
                this.f103539v.getPaint().setFakeBoldText(true);
                this.f103539v.setTextColor(n3d0.m161277a(n9c0.f140823e1));
                this.f103538u.setBackgroundResource(obc0.f146434o0);
                this.f103538u.setEnabled(true);
                afu.m97555d("p_live_profile", tfs.m190969k().m190972b(((lc50) this.f48605b).m213810E2(), true).m190971a());
            }
            bnl0.m105509E0(this.f103538u, new View.OnClickListener() { // from class: l.fc50
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f98178a.m129857J(view);
                }
            });
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        super.mo73019m(view);
        m129855H(view);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: p */
    public void mo73021p() {
        super.mo73021p();
        LiveBannerView liveBannerView = this.f103537t;
        if (liveBannerView != null) {
            liveBannerView.m77858i();
        }
    }
}
