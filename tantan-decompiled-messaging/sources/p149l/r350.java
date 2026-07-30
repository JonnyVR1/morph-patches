package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveBanner;
import com.p046p1.mobile.putong.live.base.data.BLiveBannerTab;
import com.p046p1.mobile.putong.live.base.data.BLiveOfficialShowUser;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.view.banner.LiveBannerView;
import java.util.List;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class r350 extends LiveMenuDialogHolder<w350> {

    /* JADX INFO: renamed from: k */
    public ConstraintLayout f157493k;

    /* JADX INFO: renamed from: l */
    public View f157494l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f157495m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f157496n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f157497o;

    /* JADX INFO: renamed from: p */
    public TextView f157498p;

    /* JADX INFO: renamed from: q */
    public VFrame f157499q;

    /* JADX INFO: renamed from: r */
    public VText f157500r;

    /* JADX INFO: renamed from: s */
    public TextView f157501s;

    /* JADX INFO: renamed from: t */
    public LiveBannerView f157502t;

    /* JADX INFO: renamed from: u */
    public LinearLayout f157503u;

    /* JADX INFO: renamed from: v */
    public VText f157504v;

    /* JADX INFO: renamed from: w */
    public VText f157505w;

    public r350(@NonNull w350 w350Var) {
        super(t6c0.f168060I4, w350Var.act(), w350Var, j2g0.m139456c(0.3f));
    }

    /* JADX INFO: renamed from: H */
    public final void m177657H(View view) {
        s350.m182121a(this, view);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2] */
    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m177658I(BLiveBannerTab bLiveBannerTab) {
        T t = this.f47757b;
        if (t == 0 || bLiveBannerTab == null) {
            return;
        }
        if (t7t.m187503c(((w350) t).m206027E2())) {
            lsi0.m151595y("您当前正在公演，无法查看该页面");
        } else {
            ((w350) this.f47757b).m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(200).m206701e(bLiveBannerTab.jumpUrl).m206699c());
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m177659J(View view) {
        T t = this.f47757b;
        if (t != 0) {
            ((w350) t).m201254V3();
            zcu.m218088c("p_live_profile", sds.m183540k().m183543b(((w350) this.f47757b).m206027E2(), true).m183542a());
        }
    }

    /* JADX INFO: renamed from: K */
    public void m177660K() {
        this.f157504v.setText("已订阅");
        this.f157503u.setBackgroundResource(i3c0.f110861T0);
        this.f157504v.setTextColor(kvc0.m147352a(h1c0.f105386m1));
        this.f157503u.setEnabled(false);
    }

    /* JADX INFO: renamed from: L */
    public void m177661L(BLiveOfficialShowUser bLiveOfficialShowUser) {
        List<BLiveBannerTab> list;
        if (bLiveOfficialShowUser != null) {
            m71834E();
            ViewGroup.LayoutParams layoutParams = this.f157496n.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = (int) (layoutParams.width / 2.1f);
                this.f157496n.setLayoutParams(layoutParams);
            }
            hxs.m133406s("context_single_room", this.f157496n, ydt.f197611a);
            hxs.m133402o("context_single_room", this.f157497o, bLiveOfficialShowUser.userAvatar);
            this.f157498p.setText(bLiveOfficialShowUser.userName);
            boolean zIsEmpty = TextUtils.isEmpty(bLiveOfficialShowUser.timeDesc);
            VFrame vFrame = this.f157499q;
            if (zIsEmpty) {
                vFrame.setVisibility(8);
                this.f157500r.setVisibility(8);
            } else {
                vFrame.setVisibility(0);
                this.f157500r.setVisibility(0);
                this.f157500r.setText(bLiveOfficialShowUser.timeDesc);
            }
            this.f157501s.setVisibility(TextUtils.isEmpty(bLiveOfficialShowUser.userDesc) ? 8 : 0);
            this.f157501s.setText(bLiveOfficialShowUser.userDesc);
            BLiveBanner bLiveBanner = bLiveOfficialShowUser.userBanner;
            if (bLiveBanner == null || (list = bLiveBanner.tabs) == null || list.size() <= 0) {
                this.f157502t.setVisibility(8);
            } else {
                this.f157502t.m76676k(this.f47757b, bLiveOfficialShowUser.userBanner.tabs, new e30() { // from class: l.p350
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f146962a.m177658I((BLiveBannerTab) obj);
                    }
                });
                this.f157502t.setVisibility(0);
            }
            if (bLiveOfficialShowUser.isFollowed || !uvr.m196087d().m162663D0()) {
                this.f157503u.setVisibility(8);
            } else {
                this.f157503u.setVisibility(0);
                this.f157504v.setText("订阅");
                this.f157504v.getPaint().setFakeBoldText(true);
                this.f157504v.setTextColor(kvc0.m147352a(h1c0.f105362e1));
                this.f157503u.setBackgroundResource(i3c0.f111106o0);
                this.f157503u.setEnabled(true);
                zcu.m218089d("p_live_profile", sds.m183540k().m183543b(((w350) this.f47757b).m206027E2(), true).m183542a());
            }
            xdl0.m208329E0(this.f157503u, new View.OnClickListener() { // from class: l.q350
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f152381a.m177659J(view);
                }
            });
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        super.mo71836m(view);
        m177657H(view);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: p */
    public void mo71838p() {
        super.mo71838p();
        LiveBannerView liveBannerView = this.f157502t;
        if (liveBannerView != null) {
            liveBannerView.m76675i();
        }
    }
}
