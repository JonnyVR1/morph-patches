package p149l;

import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPlayerView;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public class s8i extends u9i {

    /* JADX INFO: renamed from: o1 */
    public boolean f163064o1;

    /* JADX INFO: renamed from: p1 */
    public boolean f163065p1;

    /* JADX INFO: renamed from: q1 */
    public boolean f163066q1;

    /* JADX INFO: renamed from: r1 */
    public boolean f163067r1;

    public s8i(Act act, xvh xvhVar) {
        super(null, false, false, act, xvhVar);
        this.f163066q1 = false;
        this.f163067r1 = false;
    }

    /* JADX INFO: renamed from: A1 */
    public void m182590A1() {
        if (NullChecker.m81303a(this.f119157G)) {
            this.f119157G.m123789b();
        }
    }

    @Override // p149l.jpg
    /* JADX INFO: renamed from: O */
    public zeh mo142708O(tvh tvhVar) {
        zeh zehVarMo142708O = super.mo142708O(tvhVar);
        zehVarMo142708O.f202821g = this.f163064o1;
        this.f163066q1 = false;
        return zehVarMo142708O;
    }

    @Override // p149l.u9i, p149l.jpg, p149l.uvh
    /* JADX INFO: renamed from: b */
    public void mo142717b(w660 w660Var) {
        super.mo142717b(w660Var);
        if (w660Var instanceof q770) {
            ((q770) w660Var).m173226f0(this.f163065p1);
        }
    }

    @Override // p149l.jpg
    /* JADX INFO: renamed from: e0 */
    public void mo142723e0() {
        super.mo142723e0();
        q770.m173197l0(true);
    }

    @Override // p149l.jpg, p149l.dyq
    /* JADX INFO: renamed from: h */
    public void mo42557h(int i, int i2) {
        super.mo42557h(i, i2);
        q770.m173197l0(i != 0);
    }

    @Override // p149l.u9i, p149l.jpg
    /* JADX INFO: renamed from: i0 */
    public void mo142212i0(Moment moment) {
        super.mo142212i0(moment);
        if (NullChecker.m81303a(moment) && nkg.m159861R()) {
            String recommendReason = moment.getRecommendReason();
            if (TextUtils.isEmpty(recommendReason)) {
                xdl0.m208344M(this.f175309Z, false);
                this.f175321k0.setText("");
                this.f163066q1 = false;
            } else {
                if (!this.f163066q1) {
                    this.f163066q1 = true;
                    p6j0.m167671e("e_video_recommend_reasons", this.f119158H.f202822h, new j760("moment_id", moment.f56011id), new j760("video_moment_preview_showfrom", zi60.m218960D(this.f119158H.f202826l)));
                }
                xdl0.m208344M(this.f175309Z, true);
                this.f175321k0.setText(recommendReason);
            }
        }
    }

    @Override // p149l.u9i, p149l.jpg, p149l.uvh
    /* JADX INFO: renamed from: j */
    public void mo142726j(int i, PhotoAlbumPlayerView photoAlbumPlayerView) {
        super.mo142726j(i, photoAlbumPlayerView);
        m182592x1(photoAlbumPlayerView);
        if (this.f163067r1) {
            photoAlbumPlayerView.m65418F();
            this.f163067r1 = false;
        }
    }

    /* JADX INFO: renamed from: w1 */
    public void m182591w1() {
        this.f163067r1 = true;
    }

    /* JADX INFO: renamed from: x1 */
    public void m182592x1(PhotoAlbumPlayerView photoAlbumPlayerView) {
        m182593y1(photoAlbumPlayerView);
    }

    /* JADX INFO: renamed from: y1 */
    public void m182593y1(PhotoAlbumPlayerView photoAlbumPlayerView) {
        photoAlbumPlayerView.f42671h.removeView(photoAlbumPlayerView.f42673j);
    }

    /* JADX INFO: renamed from: z1 */
    public void m182594z1() {
        if (this.f119157G == null) {
            this.f119157G = new fyq(this.f119153C);
        }
        this.f119157G.m123794g(this);
        View decorView = this.f119153C.getWindow().getDecorView();
        fyq fyqVar = this.f119157G;
        Objects.requireNonNull(fyqVar);
        decorView.post(new vog(fyqVar));
    }

    @Override // p149l.jpg
    /* JADX INFO: renamed from: j0 */
    public void mo142727j0() {
    }
}
