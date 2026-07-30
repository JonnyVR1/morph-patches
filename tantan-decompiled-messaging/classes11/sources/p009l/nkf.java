package p009l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.view.CardPhotoFrame;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.ProfileLikeComment;
import com.p1.mobile.putong.core.data.ProfileLikeSnapshot;
import com.p1.mobile.putong.core.ui.PictureView;
import com.p1.mobile.putong.core.ui.VText_Default_Bold;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import l.okf;
import l.xdl0;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class nkf implements ymf {

    /* JADX INFO: renamed from: a */
    public CardPhotoFrame f17553a;

    /* JADX INFO: renamed from: b */
    public PictureView f17554b;

    /* JADX INFO: renamed from: c */
    public VLinear f17555c;

    /* JADX INFO: renamed from: d */
    public SimpleDraweeView f17556d;

    /* JADX INFO: renamed from: e */
    public VText_Default_Bold f17557e;

    /* JADX INFO: renamed from: f */
    public VText f17558f;

    /* JADX INFO: renamed from: g */
    public View f17559g;

    /* JADX INFO: renamed from: h */
    public User f17560h;

    /* JADX INFO: renamed from: i */
    public CoreSuggested.UserInfo f17561i;

    /* JADX INFO: renamed from: j */
    public int f17562j;

    /* JADX INFO: renamed from: k */
    public String f17563k = "";

    /* JADX INFO: renamed from: l */
    public String f17564l = "";

    @Override // p009l.ymf
    /* JADX INFO: renamed from: a */
    public ProfileLikeComment mo18506a(boolean z) {
        ProfileLikeComment profileLikeCommentNew_ = ProfileLikeComment.new_();
        profileLikeCommentNew_.userId = ((DbObject) this.f17560h).id;
        profileLikeCommentNew_.module = "life_pic";
        profileLikeCommentNew_.category = "life_pic";
        profileLikeCommentNew_.identifier = "life_pic";
        ProfileLikeSnapshot profileLikeSnapshotNew_ = ProfileLikeSnapshot.new_();
        profileLikeSnapshotNew_.picture = this.f17563k;
        profileLikeSnapshotNew_.title = "生活照";
        profileLikeSnapshotNew_.desc = this.f17564l;
        profileLikeSnapshotNew_.hasComment = z;
        profileLikeCommentNew_.snapshot = profileLikeSnapshotNew_.toJson();
        return profileLikeCommentNew_;
    }

    @Override // p009l.ymf
    /* JADX INFO: renamed from: b */
    public void mo18507b(int i) {
        xdl0.D0(i, new View[]{this.f17559g});
        xdl0.C0(this.f17559g, i);
    }

    @Override // p009l.ymf
    /* JADX INFO: renamed from: c */
    public void mo18508c(CoreSuggested.UserInfo userInfo, User user, int i) {
        this.f17560h = user;
        this.f17561i = userInfo;
        this.f17562j = i;
        m18994i();
    }

    @Override // p009l.ymf
    /* JADX INFO: renamed from: d */
    public String mo18509d() {
        return "";
    }

    @Override // p009l.ymf
    /* JADX INFO: renamed from: e */
    public void mo18510e(ViewGroup viewGroup) {
        this.f17559g = m18992g(LayoutInflater.from(viewGroup.getContext()), viewGroup);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 1;
        viewGroup.addView(this.f17559g, layoutParams);
        viewGroup.setClipChildren(false);
        m18993h();
    }

    /* JADX INFO: renamed from: f */
    public final void m18991f(View view) {
        okf.a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public View m18992g(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return okf.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: h */
    public void m18993h() {
        m18991f(this.f17559g);
        this.f17554b.L(true, false, true, true);
        this.f17554b.N = true;
    }

    /* JADX INFO: renamed from: i */
    public final void m18994i() {
        User user = this.f17560h;
        if (user == null || user.pictures == null) {
            return;
        }
        Media media = user.media(0);
        this.f17563k = ((Media) media.cover()).url;
        this.f17554b.X(media);
    }
}
