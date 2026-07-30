package p007l;

import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPlayerView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import l.fyq;
import l.j760;
import l.w660;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class s8i extends u9i {

    /* JADX INFO: renamed from: o1 */
    public boolean f12823o1;

    /* JADX INFO: renamed from: p1 */
    public boolean f12824p1;

    /* JADX INFO: renamed from: q1 */
    public boolean f12825q1;

    /* JADX INFO: renamed from: r1 */
    public boolean f12826r1;

    public s8i(Act act, xvh xvhVar) {
        super(null, false, false, act, xvhVar);
        this.f12825q1 = false;
        this.f12826r1 = false;
    }

    /* JADX INFO: renamed from: A1 */
    public void m14049A1() {
        if (NullChecker.a(this.f9472G)) {
            this.f9472G.b();
        }
    }

    @Override // p007l.jpg
    /* JADX INFO: renamed from: O */
    public zeh mo11291O(tvh tvhVar) {
        zeh zehVarMo11291O = super.mo11291O(tvhVar);
        zehVarMo11291O.f15712g = this.f12823o1;
        this.f12825q1 = false;
        return zehVarMo11291O;
    }

    @Override // p007l.u9i, p007l.jpg, p007l.uvh
    /* JADX INFO: renamed from: b */
    public void mo11300b(w660 w660Var) {
        super.mo11300b(w660Var);
        if (w660Var instanceof q770) {
            ((q770) w660Var).m13470f0(this.f12824p1);
        }
    }

    @Override // p007l.jpg
    /* JADX INFO: renamed from: e0 */
    public void mo11306e0() {
        super.mo11306e0();
        q770.m13441l0(true);
    }

    @Override // p007l.jpg
    /* JADX INFO: renamed from: h */
    public void mo11307h(int i, int i2) {
        super.mo11307h(i, i2);
        q770.m13441l0(i != 0);
    }

    @Override // p007l.u9i, p007l.jpg
    /* JADX INFO: renamed from: i0 */
    public void mo11230i0(Moment moment) {
        super.mo11230i0(moment);
        if (NullChecker.a(moment) && nkg.m12220R()) {
            String recommendReason = moment.getRecommendReason();
            if (TextUtils.isEmpty(recommendReason)) {
                xdl0.M(this.f13640Z, false);
                this.f13652k0.setText("");
                this.f12825q1 = false;
            } else {
                if (!this.f12825q1) {
                    this.f12825q1 = true;
                    p6j0.m12915e("e_video_recommend_reasons", this.f9473H.f15713h, new j760("moment_id", ((DbObject) moment).id), new j760("video_moment_preview_showfrom", zi60.m17435D(this.f9473H.f15717l)));
                }
                xdl0.M(this.f13640Z, true);
                this.f13652k0.setText(recommendReason);
            }
        }
    }

    @Override // p007l.u9i, p007l.jpg, p007l.uvh
    /* JADX INFO: renamed from: j */
    public void mo11310j(int i, PhotoAlbumPlayerView photoAlbumPlayerView) {
        super.mo11310j(i, photoAlbumPlayerView);
        m14051x1(photoAlbumPlayerView);
        if (this.f12826r1) {
            photoAlbumPlayerView.m6537F();
            this.f12826r1 = false;
        }
    }

    /* JADX INFO: renamed from: w1 */
    public void m14050w1() {
        this.f12826r1 = true;
    }

    /* JADX INFO: renamed from: x1 */
    public void m14051x1(PhotoAlbumPlayerView photoAlbumPlayerView) {
        m14052y1(photoAlbumPlayerView);
    }

    /* JADX INFO: renamed from: y1 */
    public void m14052y1(PhotoAlbumPlayerView photoAlbumPlayerView) {
        photoAlbumPlayerView.f4132h.removeView(photoAlbumPlayerView.f4134j);
    }

    /* JADX INFO: renamed from: z1 */
    public void m14053z1() {
        if (this.f9472G == null) {
            this.f9472G = new fyq(this.f9468C);
        }
        this.f9472G.g(this);
        View decorView = this.f9468C.getWindow().getDecorView();
        fyq fyqVar = this.f9472G;
        Objects.requireNonNull(fyqVar);
        decorView.post(new vog(fyqVar));
    }

    @Override // p007l.jpg
    /* JADX INFO: renamed from: j0 */
    public void mo11311j0() {
    }
}
