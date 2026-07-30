package p153l;

import android.view.View;
import androidx.cardview.widget.CardView;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveOfficialShowCurrentAnchorInfo;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import java.util.Locale;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VProgress;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class pc50 extends LiveMenuDialogHolder<uc50> {

    /* JADX INFO: renamed from: k */
    public VFrame f151523k;

    /* JADX INFO: renamed from: l */
    public CardView f151524l;

    /* JADX INFO: renamed from: m */
    public VText f151525m;

    /* JADX INFO: renamed from: n */
    public VText f151526n;

    /* JADX INFO: renamed from: o */
    public VText f151527o;

    /* JADX INFO: renamed from: p */
    public View f151528p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f151529q;

    /* JADX INFO: renamed from: r */
    public VText f151530r;

    /* JADX INFO: renamed from: s */
    public VText f151531s;

    /* JADX INFO: renamed from: t */
    public VText f151532t;

    /* JADX INFO: renamed from: u */
    public VText f151533u;

    /* JADX INFO: renamed from: v */
    public VProgress f151534v;

    /* JADX INFO: renamed from: w */
    public VDraweeView f151535w;

    public pc50(uc50 uc50Var) {
        super(yec0.f198768G4, uc50Var.act(), uc50Var);
    }

    /* JADX INFO: renamed from: H */
    public final void m171633H(View view) {
        vc50.m200785a(this, view);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m171634I(View view) {
        ((uc50) this.f48605b).m195374W3();
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m171635J(BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo, View view) {
        ((uc50) this.f48605b).m195375Y3(bLiveOfficialShowCurrentAnchorInfo);
    }

    /* JADX INFO: renamed from: K */
    public void m171636K() {
        bnl0.m105524M(this.f151527o, false);
        this.f151527o.setText("已订阅");
        this.f151527o.setEnabled(false);
    }

    /* JADX INFO: renamed from: L */
    public void m171637L(int i) {
        this.f151533u.setText(String.format(Locale.CHINA, "%ds后将随机跳转推荐的直播间", Integer.valueOf(i)));
        this.f151534v.setProgress(i);
    }

    /* JADX INFO: renamed from: M */
    public void m171638M(User user, Followship followship, final BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo) {
        m73017E();
        izs.m142868s("context_common", this.f151535w, user.m61308fp().url);
        boolean z = q0j.m174711b(user, followship) && vxr.m203876d().m170970D0();
        if (z || !vxr.m203876d().m170970D0()) {
            bnl0.m105524M(this.f151526n, false);
            bnl0.m105524M(this.f151527o, false);
        } else {
            bnl0.m105524M(this.f151526n, true);
            bnl0.m105524M(this.f151527o, true);
        }
        if (!z) {
            afu.m97555d("p_user_live_end", tfs.m190969k().m190972b(((uc50) this.f48605b).m213810E2(), true).m190975e("LiveEnd").m190971a());
        }
        bnl0.m105509E0(this.f151527o, new View.OnClickListener() { // from class: l.nc50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f141318a.m171634I(view);
            }
        });
        if (bLiveOfficialShowCurrentAnchorInfo != null && TEnum.equals(bLiveOfficialShowCurrentAnchorInfo.state, "onlive")) {
            izs.m142868s("context_common", this.f151529q, bLiveOfficialShowCurrentAnchorInfo.anchorAvatar);
            this.f151531s.setText(bLiveOfficialShowCurrentAnchorInfo.anchorName);
            this.f151532t.setText("去他直播间继续观看");
            bnl0.m105509E0(this.f151530r, new View.OnClickListener() { // from class: l.oc50
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f146662a.m171635J(bLiveOfficialShowCurrentAnchorInfo, view);
                }
            });
            return;
        }
        this.f151528p.setVisibility(8);
        this.f151529q.setVisibility(8);
        this.f151531s.setVisibility(8);
        this.f151532t.setVisibility(8);
        this.f151530r.setVisibility(8);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        super.mo73019m(view);
        m171633H(view);
    }
}
