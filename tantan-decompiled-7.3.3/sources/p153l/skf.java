package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.ProfileLikeComment;
import com.p051p1.mobile.putong.core.data.ProfileLikeSnapshot;
import com.p051p1.mobile.putong.core.newui.profile.expandprofilelike.view.ProfileLikeContentRootLayout;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.data.User;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes11.dex */
public class skf implements eof {

    /* JADX INFO: renamed from: a */
    public ProfileLikeContentRootLayout f169268a;

    /* JADX INFO: renamed from: b */
    public VLinear f169269b;

    /* JADX INFO: renamed from: c */
    public VLinear f169270c;

    /* JADX INFO: renamed from: d */
    public VImage f169271d;

    /* JADX INFO: renamed from: e */
    public VText_Bold f169272e;

    /* JADX INFO: renamed from: f */
    public VText_Bold f169273f;

    /* JADX INFO: renamed from: g */
    public User f169274g;

    /* JADX INFO: renamed from: h */
    public View f169275h;

    @Override // p153l.eof
    /* JADX INFO: renamed from: a */
    public ProfileLikeComment mo121742a(boolean z) {
        ProfileLikeComment profileLikeCommentNew_ = ProfileLikeComment.new_();
        profileLikeCommentNew_.userId = this.f169274g.f56859id;
        profileLikeCommentNew_.module = "aboutMe";
        profileLikeCommentNew_.category = "aboutMe";
        profileLikeCommentNew_.identifier = "aboutMe";
        ProfileLikeSnapshot profileLikeSnapshotNew_ = ProfileLikeSnapshot.new_();
        profileLikeSnapshotNew_.picture = gra.m131778z() ? "https://auto.tancdn.com/v1/images/eyJpZCI6Ik1DRE41VE9HNjZPVkpISTJQQUk0R04yRlZUUjdZVzE0IiwidyI6MTI2LCJoIjoxMjYsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMzA2ODgwOTEyMjQ3NzI2MjE1M30.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlY0UTNERFM2NlVFTEREVjVSUk4zVERBUENBSzdHMzE0IiwidyI6MTYwLCJoIjoxNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NTgwMjg5ODU4NDg0MzMzOTA1fQ.png";
        profileLikeSnapshotNew_.title = "自我介绍";
        profileLikeSnapshotNew_.desc = this.f169274g.description;
        profileLikeSnapshotNew_.hasComment = z;
        profileLikeCommentNew_.snapshot = profileLikeSnapshotNew_.toJson();
        return profileLikeCommentNew_;
    }

    @Override // p153l.eof
    /* JADX INFO: renamed from: b */
    public void mo121743b(int i) {
        bnl0.m105507D0(i, this.f169275h);
        bnl0.m105505C0(this.f169275h, i);
    }

    @Override // p153l.eof
    /* JADX INFO: renamed from: c */
    public void mo121744c(CoreSuggested.UserInfo userInfo, User user, int i) {
        this.f169274g = user;
        if (!TextUtils.isEmpty(user.description)) {
            this.f169273f.setText(user.description);
        }
        if (gra.m131778z()) {
            this.f169272e.setText("自我介绍");
            this.f169271d.setImageResource(dbc0.f86714X1);
        }
        this.f169268a.m44267b(dbc0.f86931dn, -660226);
    }

    @Override // p153l.eof
    /* JADX INFO: renamed from: d */
    public String mo121745d() {
        return "赞了你的自我介绍";
    }

    @Override // p153l.eof
    /* JADX INFO: renamed from: e */
    public void mo121746e(ViewGroup viewGroup) {
        View viewM186445g = m186445g(LayoutInflater.from(viewGroup.getContext()), viewGroup);
        this.f169275h = viewM186445g;
        m186444f(viewM186445g);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 1;
        viewGroup.addView(this.f169275h, layoutParams);
        this.f169273f.setTypeface(lyh0.m156283c(3), 1);
    }

    /* JADX INFO: renamed from: f */
    public final void m186444f(View view) {
        tkf.m191549a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public View m186445g(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tkf.m191550b(this, layoutInflater, viewGroup);
    }
}
