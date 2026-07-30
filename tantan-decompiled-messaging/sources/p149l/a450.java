package p149l;

import android.view.View;
import androidx.cardview.widget.CardView;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveOfficialShowCurrentAnchorInfo;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import java.util.Locale;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VProgress;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class a450 extends LiveMenuDialogHolder<f450> {

    /* JADX INFO: renamed from: k */
    public VFrame f67443k;

    /* JADX INFO: renamed from: l */
    public CardView f67444l;

    /* JADX INFO: renamed from: m */
    public VText f67445m;

    /* JADX INFO: renamed from: n */
    public VText f67446n;

    /* JADX INFO: renamed from: o */
    public VText f67447o;

    /* JADX INFO: renamed from: p */
    public View f67448p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f67449q;

    /* JADX INFO: renamed from: r */
    public VText f67450r;

    /* JADX INFO: renamed from: s */
    public VText f67451s;

    /* JADX INFO: renamed from: t */
    public VText f67452t;

    /* JADX INFO: renamed from: u */
    public VText f67453u;

    /* JADX INFO: renamed from: v */
    public VProgress f67454v;

    /* JADX INFO: renamed from: w */
    public VDraweeView f67455w;

    public a450(f450 f450Var) {
        super(t6c0.f168036G4, f450Var.act(), f450Var);
    }

    /* JADX INFO: renamed from: H */
    public final void m94803H(View view) {
        g450.m124358a(this, view);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m94804I(View view) {
        ((f450) this.f47757b).m119278W3();
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m94805J(BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo, View view) {
        ((f450) this.f47757b).m119279Y3(bLiveOfficialShowCurrentAnchorInfo);
    }

    /* JADX INFO: renamed from: K */
    public void m94806K() {
        xdl0.m208344M(this.f67447o, false);
        this.f67447o.setText("已订阅");
        this.f67447o.setEnabled(false);
    }

    /* JADX INFO: renamed from: L */
    public void m94807L(int i) {
        this.f67453u.setText(String.format(Locale.CHINA, "%ds后将随机跳转推荐的直播间", Integer.valueOf(i)));
        this.f67454v.setProgress(i);
    }

    /* JADX INFO: renamed from: M */
    public void m94808M(User user, Followship followship, final BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo) {
        m71834E();
        hxs.m133406s("context_common", this.f67455w, user.m60124fp().url);
        boolean z = uxi.m196181b(user, followship) && uvr.m196087d().m162663D0();
        if (z || !uvr.m196087d().m162663D0()) {
            xdl0.m208344M(this.f67446n, false);
            xdl0.m208344M(this.f67447o, false);
        } else {
            xdl0.m208344M(this.f67446n, true);
            xdl0.m208344M(this.f67447o, true);
        }
        if (!z) {
            zcu.m218089d("p_user_live_end", sds.m183540k().m183543b(((f450) this.f47757b).m206027E2(), true).m183546e("LiveEnd").m183542a());
        }
        xdl0.m208329E0(this.f67447o, new View.OnClickListener() { // from class: l.y350
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195756a.m94804I(view);
            }
        });
        if (bLiveOfficialShowCurrentAnchorInfo != null && TEnum.equals(bLiveOfficialShowCurrentAnchorInfo.state, "onlive")) {
            hxs.m133406s("context_common", this.f67449q, bLiveOfficialShowCurrentAnchorInfo.anchorAvatar);
            this.f67451s.setText(bLiveOfficialShowCurrentAnchorInfo.anchorName);
            this.f67452t.setText("去他直播间继续观看");
            xdl0.m208329E0(this.f67450r, new View.OnClickListener() { // from class: l.z350
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f201310a.m94805J(bLiveOfficialShowCurrentAnchorInfo, view);
                }
            });
            return;
        }
        this.f67448p.setVisibility(8);
        this.f67449q.setVisibility(8);
        this.f67451s.setVisibility(8);
        this.f67452t.setVisibility(8);
        this.f67450r.setVisibility(8);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        super.mo71836m(view);
        m94803H(view);
    }
}
