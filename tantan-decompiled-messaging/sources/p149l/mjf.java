package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.ProfileLikeComment;
import com.p046p1.mobile.putong.core.data.ProfileLikeSnapshot;
import com.p046p1.mobile.putong.core.newui.profile.expandprofilelike.view.ProfileLikeContentRootLayout;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.data.User;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes11.dex */
public class mjf implements ymf {

    /* JADX INFO: renamed from: a */
    public ProfileLikeContentRootLayout f134123a;

    /* JADX INFO: renamed from: b */
    public VLinear f134124b;

    /* JADX INFO: renamed from: c */
    public VLinear f134125c;

    /* JADX INFO: renamed from: d */
    public VImage f134126d;

    /* JADX INFO: renamed from: e */
    public VText_Bold f134127e;

    /* JADX INFO: renamed from: f */
    public VText_Bold f134128f;

    /* JADX INFO: renamed from: g */
    public User f134129g;

    /* JADX INFO: renamed from: h */
    public View f134130h;

    @Override // p149l.ymf
    /* JADX INFO: renamed from: a */
    public ProfileLikeComment mo154799a(boolean z) {
        ProfileLikeComment profileLikeCommentNew_ = ProfileLikeComment.new_();
        profileLikeCommentNew_.userId = this.f134129g.f56011id;
        profileLikeCommentNew_.module = "aboutMe";
        profileLikeCommentNew_.category = "aboutMe";
        profileLikeCommentNew_.identifier = "aboutMe";
        ProfileLikeSnapshot profileLikeSnapshotNew_ = ProfileLikeSnapshot.new_();
        profileLikeSnapshotNew_.picture = upa.m194847z() ? "https://auto.tancdn.com/v1/images/eyJpZCI6Ik1DRE41VE9HNjZPVkpISTJQQUk0R04yRlZUUjdZVzE0IiwidyI6MTI2LCJoIjoxMjYsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMzA2ODgwOTEyMjQ3NzI2MjE1M30.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlY0UTNERFM2NlVFTEREVjVSUk4zVERBUENBSzdHMzE0IiwidyI6MTYwLCJoIjoxNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NTgwMjg5ODU4NDg0MzMzOTA1fQ.png";
        profileLikeSnapshotNew_.title = "自我介绍";
        profileLikeSnapshotNew_.desc = this.f134129g.description;
        profileLikeSnapshotNew_.hasComment = z;
        profileLikeCommentNew_.snapshot = profileLikeSnapshotNew_.toJson();
        return profileLikeCommentNew_;
    }

    @Override // p149l.ymf
    /* JADX INFO: renamed from: b */
    public void mo154800b(int i) {
        xdl0.m208327D0(i, this.f134130h);
        xdl0.m208325C0(this.f134130h, i);
    }

    @Override // p149l.ymf
    /* JADX INFO: renamed from: c */
    public void mo154801c(CoreSuggested.UserInfo userInfo, User user, int i) {
        this.f134129g = user;
        if (!TextUtils.isEmpty(user.description)) {
            this.f134128f.setText(user.description);
        }
        if (upa.m194847z()) {
            this.f134127e.setText("自我介绍");
            this.f134126d.setImageResource(x2c0.f189843W1);
        }
        this.f134123a.m43256b(x2c0.f190465pm, -660226);
    }

    @Override // p149l.ymf
    /* JADX INFO: renamed from: d */
    public String mo154802d() {
        return "赞了你的自我介绍";
    }

    @Override // p149l.ymf
    /* JADX INFO: renamed from: e */
    public void mo154803e(ViewGroup viewGroup) {
        View viewM154805g = m154805g(LayoutInflater.from(viewGroup.getContext()), viewGroup);
        this.f134130h = viewM154805g;
        m154804f(viewM154805g);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 1;
        viewGroup.addView(this.f134130h, layoutParams);
        this.f134128f.setTypeface(eqh0.m117752c(3), 1);
    }

    /* JADX INFO: renamed from: f */
    public final void m154804f(View view) {
        njf.m159648a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public View m154805g(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return njf.m159649b(this, layoutInflater, viewGroup);
    }
}
