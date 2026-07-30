package p009l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.newui.profile.expandprofilelike.view.ProfileLikeContentRootLayout;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.ProfileLikeComment;
import com.p1.mobile.putong.core.data.ProfileLikeSnapshot;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import l.eqh0;
import l.njf;
import l.upa;
import l.x2c0;
import l.xdl0;
import v.VImage;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class mjf implements ymf {

    /* JADX INFO: renamed from: a */
    public ProfileLikeContentRootLayout f16969a;

    /* JADX INFO: renamed from: b */
    public VLinear f16970b;

    /* JADX INFO: renamed from: c */
    public VLinear f16971c;

    /* JADX INFO: renamed from: d */
    public VImage f16972d;

    /* JADX INFO: renamed from: e */
    public VText_Bold f16973e;

    /* JADX INFO: renamed from: f */
    public VText_Bold f16974f;

    /* JADX INFO: renamed from: g */
    public User f16975g;

    /* JADX INFO: renamed from: h */
    public View f16976h;

    @Override // p009l.ymf
    /* JADX INFO: renamed from: a */
    public ProfileLikeComment mo18506a(boolean z) {
        ProfileLikeComment profileLikeCommentNew_ = ProfileLikeComment.new_();
        profileLikeCommentNew_.userId = ((DbObject) this.f16975g).id;
        profileLikeCommentNew_.module = "aboutMe";
        profileLikeCommentNew_.category = "aboutMe";
        profileLikeCommentNew_.identifier = "aboutMe";
        ProfileLikeSnapshot profileLikeSnapshotNew_ = ProfileLikeSnapshot.new_();
        profileLikeSnapshotNew_.picture = upa.z() ? "https://auto.tancdn.com/v1/images/eyJpZCI6Ik1DRE41VE9HNjZPVkpISTJQQUk0R04yRlZUUjdZVzE0IiwidyI6MTI2LCJoIjoxMjYsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMzA2ODgwOTEyMjQ3NzI2MjE1M30.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlY0UTNERFM2NlVFTEREVjVSUk4zVERBUENBSzdHMzE0IiwidyI6MTYwLCJoIjoxNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NTgwMjg5ODU4NDg0MzMzOTA1fQ.png";
        profileLikeSnapshotNew_.title = "自我介绍";
        profileLikeSnapshotNew_.desc = this.f16975g.description;
        profileLikeSnapshotNew_.hasComment = z;
        profileLikeCommentNew_.snapshot = profileLikeSnapshotNew_.toJson();
        return profileLikeCommentNew_;
    }

    @Override // p009l.ymf
    /* JADX INFO: renamed from: b */
    public void mo18507b(int i) {
        xdl0.D0(i, new View[]{this.f16976h});
        xdl0.C0(this.f16976h, i);
    }

    @Override // p009l.ymf
    /* JADX INFO: renamed from: c */
    public void mo18508c(CoreSuggested.UserInfo userInfo, User user, int i) {
        this.f16975g = user;
        if (!TextUtils.isEmpty(user.description)) {
            this.f16974f.setText(user.description);
        }
        if (upa.z()) {
            this.f16973e.setText("自我介绍");
            this.f16972d.setImageResource(x2c0.W1);
        }
        this.f16969a.m7477b(x2c0.pm, -660226);
    }

    @Override // p009l.ymf
    /* JADX INFO: renamed from: d */
    public String mo18509d() {
        return "赞了你的自我介绍";
    }

    @Override // p009l.ymf
    /* JADX INFO: renamed from: e */
    public void mo18510e(ViewGroup viewGroup) {
        View viewM18512g = m18512g(LayoutInflater.from(viewGroup.getContext()), viewGroup);
        this.f16976h = viewM18512g;
        m18511f(viewM18512g);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 1;
        viewGroup.addView(this.f16976h, layoutParams);
        this.f16974f.setTypeface(eqh0.c(3), 1);
    }

    /* JADX INFO: renamed from: f */
    public final void m18511f(View view) {
        njf.a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public View m18512g(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return njf.b(this, layoutInflater, viewGroup);
    }
}
