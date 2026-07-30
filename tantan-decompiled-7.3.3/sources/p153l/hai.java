package p153l;

import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPlayerView;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;

/* JADX INFO: loaded from: classes13.dex */
public class hai extends jbi {

    /* JADX INFO: renamed from: o1 */
    public boolean f108498o1;

    /* JADX INFO: renamed from: p1 */
    public boolean f108499p1;

    /* JADX INFO: renamed from: q1 */
    public boolean f108500q1;

    /* JADX INFO: renamed from: r1 */
    public boolean f108501r1;

    public hai(Act act, mxh mxhVar) {
        super(null, false, false, act, mxhVar);
        this.f108500q1 = false;
        this.f108501r1 = false;
    }

    /* JADX INFO: renamed from: A1 */
    public void m134155A1() {
        if (NullChecker.m82486a(this.f201184G)) {
            this.f201184G.m123504b();
        }
    }

    @Override // p153l.yqg
    /* JADX INFO: renamed from: O */
    public ogh mo134156O(ixh ixhVar) {
        ogh oghVarMo134156O = super.mo134156O(ixhVar);
        oghVarMo134156O.f147263g = this.f108498o1;
        this.f108500q1 = false;
        return oghVarMo134156O;
    }

    @Override // p153l.jbi, p153l.yqg, p153l.jxh
    /* JADX INFO: renamed from: b */
    public void mo107410b(cf60 cf60Var) {
        super.mo107410b(cf60Var);
        if (cf60Var instanceof wf70) {
            ((wf70) cf60Var).m206089f0(this.f108499p1);
        }
    }

    @Override // p153l.yqg
    /* JADX INFO: renamed from: e0 */
    public void mo134157e0() {
        super.mo134157e0();
        wf70.m206060l0(true);
    }

    @Override // p153l.yqg, p153l.d0r
    /* JADX INFO: renamed from: h */
    public void mo43567h(int i, int i2) {
        super.mo43567h(i, i2);
        wf70.m206060l0(i != 0);
    }

    @Override // p153l.jbi, p153l.yqg
    /* JADX INFO: renamed from: i0 */
    public void mo134158i0(Moment moment) {
        super.mo134158i0(moment);
        if (NullChecker.m82486a(moment) && cmg.m111190R()) {
            String recommendReason = moment.getRecommendReason();
            if (TextUtils.isEmpty(recommendReason)) {
                bnl0.m105524M(this.f119914Z, false);
                this.f119926k0.setText("");
                this.f108500q1 = false;
            } else {
                if (!this.f108500q1) {
                    this.f108500q1 = true;
                    tfj0.m190942e("e_video_recommend_reasons", this.f201185H.f147264h, new pf60("moment_id", moment.f56859id), new pf60("video_moment_preview_showfrom", er60.m122103D(this.f201185H.f147268l)));
                }
                bnl0.m105524M(this.f119914Z, true);
                this.f119926k0.setText(recommendReason);
            }
        }
    }

    @Override // p153l.jbi, p153l.yqg, p153l.jxh
    /* JADX INFO: renamed from: j */
    public void mo107416j(int i, PhotoAlbumPlayerView photoAlbumPlayerView) {
        super.mo107416j(i, photoAlbumPlayerView);
        m134161x1(photoAlbumPlayerView);
        if (this.f108501r1) {
            photoAlbumPlayerView.m66601F();
            this.f108501r1 = false;
        }
    }

    /* JADX INFO: renamed from: w1 */
    public void m134160w1() {
        this.f108501r1 = true;
    }

    /* JADX INFO: renamed from: x1 */
    public void m134161x1(PhotoAlbumPlayerView photoAlbumPlayerView) {
        m134162y1(photoAlbumPlayerView);
    }

    /* JADX INFO: renamed from: y1 */
    public void m134162y1(PhotoAlbumPlayerView photoAlbumPlayerView) {
        photoAlbumPlayerView.f43519h.removeView(photoAlbumPlayerView.f43521j);
    }

    /* JADX INFO: renamed from: z1 */
    public void m134163z1() {
        if (this.f201184G == null) {
            this.f201184G = new f0r(this.f201180C);
        }
        this.f201184G.m123509g(this);
        View decorView = this.f201180C.getWindow().getDecorView();
        f0r f0rVar = this.f201184G;
        Objects.requireNonNull(f0rVar);
        decorView.post(new kqg(f0rVar));
    }

    @Override // p153l.yqg
    /* JADX INFO: renamed from: j0 */
    public void mo134159j0() {
    }
}
