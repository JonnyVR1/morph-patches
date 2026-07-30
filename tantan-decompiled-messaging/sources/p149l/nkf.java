package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.ProfileLikeComment;
import com.p046p1.mobile.putong.core.data.ProfileLikeSnapshot;
import com.p046p1.mobile.putong.core.data.ProfileLikeType;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.view.CardPhotoFrame;
import com.p046p1.mobile.putong.core.p053ui.PictureView;
import com.p046p1.mobile.putong.core.p053ui.VText_Default_Bold;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class nkf implements ymf {

    /* JADX INFO: renamed from: a */
    public CardPhotoFrame f139401a;

    /* JADX INFO: renamed from: b */
    public PictureView f139402b;

    /* JADX INFO: renamed from: c */
    public VLinear f139403c;

    /* JADX INFO: renamed from: d */
    public SimpleDraweeView f139404d;

    /* JADX INFO: renamed from: e */
    public VText_Default_Bold f139405e;

    /* JADX INFO: renamed from: f */
    public VText f139406f;

    /* JADX INFO: renamed from: g */
    public View f139407g;

    /* JADX INFO: renamed from: h */
    public User f139408h;

    /* JADX INFO: renamed from: i */
    public CoreSuggested.UserInfo f139409i;

    /* JADX INFO: renamed from: j */
    public int f139410j;

    /* JADX INFO: renamed from: k */
    public String f139411k = "";

    /* JADX INFO: renamed from: l */
    public String f139412l = "";

    @Override // p149l.ymf
    /* JADX INFO: renamed from: a */
    public ProfileLikeComment mo154799a(boolean z) {
        ProfileLikeComment profileLikeCommentNew_ = ProfileLikeComment.new_();
        profileLikeCommentNew_.userId = this.f139408h.f56011id;
        profileLikeCommentNew_.module = ProfileLikeType.life_pic;
        profileLikeCommentNew_.category = ProfileLikeType.life_pic;
        profileLikeCommentNew_.identifier = ProfileLikeType.life_pic;
        ProfileLikeSnapshot profileLikeSnapshotNew_ = ProfileLikeSnapshot.new_();
        profileLikeSnapshotNew_.picture = this.f139411k;
        profileLikeSnapshotNew_.title = "生活照";
        profileLikeSnapshotNew_.desc = this.f139412l;
        profileLikeSnapshotNew_.hasComment = z;
        profileLikeCommentNew_.snapshot = profileLikeSnapshotNew_.toJson();
        return profileLikeCommentNew_;
    }

    @Override // p149l.ymf
    /* JADX INFO: renamed from: b */
    public void mo154800b(int i) {
        xdl0.m208327D0(i, this.f139407g);
        xdl0.m208325C0(this.f139407g, i);
    }

    @Override // p149l.ymf
    /* JADX INFO: renamed from: c */
    public void mo154801c(CoreSuggested.UserInfo userInfo, User user, int i) {
        this.f139408h = user;
        this.f139409i = userInfo;
        this.f139410j = i;
        m159835i();
    }

    @Override // p149l.ymf
    /* JADX INFO: renamed from: d */
    public String mo154802d() {
        return "";
    }

    @Override // p149l.ymf
    /* JADX INFO: renamed from: e */
    public void mo154803e(ViewGroup viewGroup) {
        this.f139407g = m159833g(LayoutInflater.from(viewGroup.getContext()), viewGroup);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 1;
        viewGroup.addView(this.f139407g, layoutParams);
        viewGroup.setClipChildren(false);
        m159834h();
    }

    /* JADX INFO: renamed from: f */
    public final void m159832f(View view) {
        okf.m164856a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public View m159833g(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return okf.m164857b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: h */
    public void m159834h() {
        m159832f(this.f139407g);
        this.f139402b.m43984L(true, false, true, true);
        this.f139402b.f28054N = true;
    }

    /* JADX INFO: renamed from: i */
    public final void m159835i() {
        User user = this.f139408h;
        if (user == null || user.pictures == null) {
            return;
        }
        Media media = user.media(0);
        this.f139411k = media.cover().url;
        this.f139402b.m43993X(media);
    }
}
