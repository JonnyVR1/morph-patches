package p002l;

import android.view.View;
import androidx.cardview.widget.CardView;
import com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p1.mobile.putong.data.Followship;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveOfficialShowCurrentAnchorInfo;
import java.util.Locale;
import l.hxs;
import l.sds;
import l.uvr;
import l.uxi;
import l.xdl0;
import l.zcu;
import v.VDraweeView;
import v.VFrame;
import v.VProgress;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class a450 extends LiveMenuDialogHolder<f450> {

    /* JADX INFO: renamed from: k */
    public VFrame f7360k;

    /* JADX INFO: renamed from: l */
    public CardView f7361l;

    /* JADX INFO: renamed from: m */
    public VText f7362m;

    /* JADX INFO: renamed from: n */
    public VText f7363n;

    /* JADX INFO: renamed from: o */
    public VText f7364o;

    /* JADX INFO: renamed from: p */
    public View f7365p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f7366q;

    /* JADX INFO: renamed from: r */
    public VText f7367r;

    /* JADX INFO: renamed from: s */
    public VText f7368s;

    /* JADX INFO: renamed from: t */
    public VText f7369t;

    /* JADX INFO: renamed from: u */
    public VText f7370u;

    /* JADX INFO: renamed from: v */
    public VProgress f7371v;

    /* JADX INFO: renamed from: w */
    public VDraweeView f7372w;

    public a450(f450 f450Var) {
        super(t6c0.f19532G4, f450Var.act(), f450Var);
    }

    /* JADX INFO: renamed from: H */
    public final void m9311H(View view) {
        g450.m13622a(this, view);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m9312I(View view) {
        ((f450) this.f3799b).m12941W3();
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m9313J(BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo, View view) {
        ((f450) this.f3799b).m12942Y3(bLiveOfficialShowCurrentAnchorInfo);
    }

    /* JADX INFO: renamed from: K */
    public void m9314K() {
        xdl0.M(this.f7364o, false);
        this.f7364o.setText("已订阅");
        this.f7364o.setEnabled(false);
    }

    /* JADX INFO: renamed from: L */
    public void m9315L(int i) {
        this.f7370u.setText(String.format(Locale.CHINA, "%ds后将随机跳转推荐的直播间", Integer.valueOf(i)));
        this.f7371v.setProgress(i);
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [l.ho2] */
    /* JADX INFO: renamed from: M */
    public void m9316M(User user, Followship followship, final BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo) {
        m5211E();
        hxs.s("context_common", this.f7372w, ((Media) user.fp()).url);
        boolean z = uxi.b(user, followship) && uvr.d().D0();
        if (z || !uvr.d().D0()) {
            xdl0.M(this.f7363n, false);
            xdl0.M(this.f7364o, false);
        } else {
            xdl0.M(this.f7363n, true);
            xdl0.M(this.f7364o, true);
        }
        if (!z) {
            zcu.d("p_user_live_end", sds.k().b((ho2) ((f450) this.f3799b).m25547E2(), true).e("LiveEnd").a());
        }
        xdl0.E0(this.f7364o, new View.OnClickListener() { // from class: l.y350
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22640a.m9312I(view);
            }
        });
        if (bLiveOfficialShowCurrentAnchorInfo != null && TEnum.equals(bLiveOfficialShowCurrentAnchorInfo.state, "onlive")) {
            hxs.s("context_common", this.f7366q, bLiveOfficialShowCurrentAnchorInfo.anchorAvatar);
            this.f7368s.setText(bLiveOfficialShowCurrentAnchorInfo.anchorName);
            this.f7369t.setText("去他直播间继续观看");
            xdl0.E0(this.f7367r, new View.OnClickListener() { // from class: l.z350
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f23196a.m9313J(bLiveOfficialShowCurrentAnchorInfo, view);
                }
            });
            return;
        }
        this.f7365p.setVisibility(8);
        this.f7366q.setVisibility(8);
        this.f7368s.setVisibility(8);
        this.f7369t.setVisibility(8);
        this.f7367r.setVisibility(8);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo5214m(View view) {
        super.mo5214m(view);
        m9311H(view);
    }
}
