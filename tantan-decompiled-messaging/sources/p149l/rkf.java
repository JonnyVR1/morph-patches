package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.ProfileLikeComment;
import com.p046p1.mobile.putong.core.data.ProfileLikeSnapshot;
import com.p046p1.mobile.putong.core.data.Question;
import com.p046p1.mobile.putong.core.newui.profile.expandprofilelike.view.ProfileLikeContentRootLayout;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.data.Answer;
import com.p046p1.mobile.putong.data.User;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes11.dex */
public class rkf implements ymf {

    /* JADX INFO: renamed from: a */
    public ProfileLikeContentRootLayout f159828a;

    /* JADX INFO: renamed from: b */
    public VLinear f159829b;

    /* JADX INFO: renamed from: c */
    public VLinear f159830c;

    /* JADX INFO: renamed from: d */
    public VImage f159831d;

    /* JADX INFO: renamed from: e */
    public VText_Bold f159832e;

    /* JADX INFO: renamed from: f */
    public VText_Bold f159833f;

    /* JADX INFO: renamed from: g */
    public View f159834g;

    /* JADX INFO: renamed from: h */
    public User f159835h;

    /* JADX INFO: renamed from: i */
    public String f159836i = "";

    /* JADX INFO: renamed from: j */
    public String f159837j = "";

    @Override // p149l.ymf
    /* JADX INFO: renamed from: a */
    public ProfileLikeComment mo154799a(boolean z) {
        ProfileLikeComment profileLikeCommentNew_ = ProfileLikeComment.new_();
        profileLikeCommentNew_.userId = this.f159835h.f56011id;
        profileLikeCommentNew_.module = "question";
        profileLikeCommentNew_.category = "question";
        profileLikeCommentNew_.identifier = "question";
        ProfileLikeSnapshot profileLikeSnapshotNew_ = ProfileLikeSnapshot.new_();
        profileLikeSnapshotNew_.picture = upa.m194847z() ? "https://auto.tancdn.com/v1/images/eyJpZCI6Ik5JRE1CNzIzRzNDSUxIVVdKUTVKUVVPSExGNTNUWDE0IiwidyI6MTI2LCJoIjoxMjYsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMTk4NTYzNzUyMTQwMjcxMzUyNn0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlRMNkE0VUFXQ0pONVpHSE5ZUzdEUFFZQ1c0WFcyUzE0IiwidyI6MTYwLCJoIjoxNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0Mjc1NTM5NDIxMjY2NDcxMjAzfQ.png";
        profileLikeSnapshotNew_.title = this.f159836i;
        profileLikeSnapshotNew_.desc = this.f159837j;
        profileLikeSnapshotNew_.hasComment = z;
        profileLikeCommentNew_.snapshot = profileLikeSnapshotNew_.toJson();
        return profileLikeCommentNew_;
    }

    @Override // p149l.ymf
    /* JADX INFO: renamed from: b */
    public void mo154800b(int i) {
        xdl0.m208327D0(i, this.f159834g);
        xdl0.m208325C0(this.f159834g, i);
    }

    @Override // p149l.ymf
    /* JADX INFO: renamed from: c */
    public void mo154801c(CoreSuggested.UserInfo userInfo, User user, int i) {
        this.f159835h = user;
        if (i < 0 || user.profile.answers.size() <= i) {
            return;
        }
        Answer answer = user.profile.answers.get(i);
        Question questionM215900o3 = CoreModule.f17545c.f19636d0.m215900o3(answer.question);
        String str = questionM215900o3 != null ? questionM215900o3.text : "";
        this.f159836i = str;
        this.f159837j = answer.value;
        this.f159832e.setText(str);
        this.f159833f.setText(answer.value);
    }

    @Override // p149l.ymf
    /* JADX INFO: renamed from: d */
    public String mo154802d() {
        return "赞了你的问答";
    }

    @Override // p149l.ymf
    /* JADX INFO: renamed from: e */
    public void mo154803e(ViewGroup viewGroup) {
        View viewM179740g = m179740g(LayoutInflater.from(viewGroup.getContext()), viewGroup);
        this.f159834g = viewM179740g;
        m179739f(viewM179740g);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 1;
        viewGroup.addView(this.f159834g, layoutParams);
        this.f159833f.setTypeface(eqh0.m117752c(3), 1);
        if (upa.m194847z()) {
            this.f159831d.setImageResource(x2c0.f190285k2);
        }
        this.f159828a.m43256b(x2c0.f190657vm, -66836);
    }

    /* JADX INFO: renamed from: f */
    public final void m179739f(View view) {
        skf.m184595a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public View m179740g(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return skf.m184596b(this, layoutInflater, viewGroup);
    }
}
