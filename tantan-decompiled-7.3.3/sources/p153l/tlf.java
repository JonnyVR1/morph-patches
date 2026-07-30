package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.ProfileLikeComment;
import com.p051p1.mobile.putong.core.data.ProfileLikeSnapshot;
import com.p051p1.mobile.putong.core.data.ProfileLikeType;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.view.CardPhotoFrame;
import com.p051p1.mobile.putong.core.p058ui.PictureView;
import com.p051p1.mobile.putong.core.p058ui.VText_Default_Bold;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class tlf implements eof {

    /* JADX INFO: renamed from: a */
    public CardPhotoFrame f174814a;

    /* JADX INFO: renamed from: b */
    public PictureView f174815b;

    /* JADX INFO: renamed from: c */
    public VLinear f174816c;

    /* JADX INFO: renamed from: d */
    public SimpleDraweeView f174817d;

    /* JADX INFO: renamed from: e */
    public VText_Default_Bold f174818e;

    /* JADX INFO: renamed from: f */
    public VText f174819f;

    /* JADX INFO: renamed from: g */
    public View f174820g;

    /* JADX INFO: renamed from: h */
    public User f174821h;

    /* JADX INFO: renamed from: i */
    public CoreSuggested.UserInfo f174822i;

    /* JADX INFO: renamed from: j */
    public int f174823j;

    /* JADX INFO: renamed from: k */
    public String f174824k = "";

    /* JADX INFO: renamed from: l */
    public String f174825l = "";

    @Override // p153l.eof
    /* JADX INFO: renamed from: a */
    public ProfileLikeComment mo121742a(boolean z) {
        ProfileLikeComment profileLikeCommentNew_ = ProfileLikeComment.new_();
        profileLikeCommentNew_.userId = this.f174821h.f56859id;
        profileLikeCommentNew_.module = ProfileLikeType.life_pic;
        profileLikeCommentNew_.category = ProfileLikeType.life_pic;
        profileLikeCommentNew_.identifier = ProfileLikeType.life_pic;
        ProfileLikeSnapshot profileLikeSnapshotNew_ = ProfileLikeSnapshot.new_();
        profileLikeSnapshotNew_.picture = this.f174824k;
        profileLikeSnapshotNew_.title = "生活照";
        profileLikeSnapshotNew_.desc = this.f174825l;
        profileLikeSnapshotNew_.hasComment = z;
        profileLikeCommentNew_.snapshot = profileLikeSnapshotNew_.toJson();
        return profileLikeCommentNew_;
    }

    @Override // p153l.eof
    /* JADX INFO: renamed from: b */
    public void mo121743b(int i) {
        bnl0.m105507D0(i, this.f174820g);
        bnl0.m105505C0(this.f174820g, i);
    }

    @Override // p153l.eof
    /* JADX INFO: renamed from: c */
    public void mo121744c(CoreSuggested.UserInfo userInfo, User user, int i) {
        this.f174821h = user;
        this.f174822i = userInfo;
        this.f174823j = i;
        m191634i();
    }

    @Override // p153l.eof
    /* JADX INFO: renamed from: d */
    public String mo121745d() {
        return "";
    }

    @Override // p153l.eof
    /* JADX INFO: renamed from: e */
    public void mo121746e(ViewGroup viewGroup) {
        this.f174820g = m191632g(LayoutInflater.from(viewGroup.getContext()), viewGroup);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 1;
        viewGroup.addView(this.f174820g, layoutParams);
        viewGroup.setClipChildren(false);
        m191633h();
    }

    /* JADX INFO: renamed from: f */
    public final void m191631f(View view) {
        ulf.m196548a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public View m191632g(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ulf.m196549b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: h */
    public void m191633h() {
        m191631f(this.f174820g);
        this.f174815b.m45167L(true, false, true, true);
        this.f174815b.f28902N = true;
    }

    /* JADX INFO: renamed from: i */
    public final void m191634i() {
        User user = this.f174821h;
        if (user == null || user.pictures == null) {
            return;
        }
        Media media = user.media(0);
        this.f174824k = media.cover().url;
        this.f174815b.m45176X(media);
    }
}
