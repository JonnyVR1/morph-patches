package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.ProfileLikeComment;
import com.p051p1.mobile.putong.core.data.ProfileLikeSnapshot;
import com.p051p1.mobile.putong.core.data.Question;
import com.p051p1.mobile.putong.core.newui.profile.expandprofilelike.view.ProfileLikeContentRootLayout;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.data.Answer;
import com.p051p1.mobile.putong.data.User;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes11.dex */
public class xlf implements eof {

    /* JADX INFO: renamed from: a */
    public ProfileLikeContentRootLayout f194953a;

    /* JADX INFO: renamed from: b */
    public VLinear f194954b;

    /* JADX INFO: renamed from: c */
    public VLinear f194955c;

    /* JADX INFO: renamed from: d */
    public VImage f194956d;

    /* JADX INFO: renamed from: e */
    public VText_Bold f194957e;

    /* JADX INFO: renamed from: f */
    public VText_Bold f194958f;

    /* JADX INFO: renamed from: g */
    public View f194959g;

    /* JADX INFO: renamed from: h */
    public User f194960h;

    /* JADX INFO: renamed from: i */
    public String f194961i = "";

    /* JADX INFO: renamed from: j */
    public String f194962j = "";

    @Override // p153l.eof
    /* JADX INFO: renamed from: a */
    public ProfileLikeComment mo121742a(boolean z) {
        ProfileLikeComment profileLikeCommentNew_ = ProfileLikeComment.new_();
        profileLikeCommentNew_.userId = this.f194960h.f56859id;
        profileLikeCommentNew_.module = "question";
        profileLikeCommentNew_.category = "question";
        profileLikeCommentNew_.identifier = "question";
        ProfileLikeSnapshot profileLikeSnapshotNew_ = ProfileLikeSnapshot.new_();
        profileLikeSnapshotNew_.picture = gra.m131778z() ? "https://auto.tancdn.com/v1/images/eyJpZCI6Ik5JRE1CNzIzRzNDSUxIVVdKUTVKUVVPSExGNTNUWDE0IiwidyI6MTI2LCJoIjoxMjYsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMTk4NTYzNzUyMTQwMjcxMzUyNn0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlRMNkE0VUFXQ0pONVpHSE5ZUzdEUFFZQ1c0WFcyUzE0IiwidyI6MTYwLCJoIjoxNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0Mjc1NTM5NDIxMjY2NDcxMjAzfQ.png";
        profileLikeSnapshotNew_.title = this.f194961i;
        profileLikeSnapshotNew_.desc = this.f194962j;
        profileLikeSnapshotNew_.hasComment = z;
        profileLikeCommentNew_.snapshot = profileLikeSnapshotNew_.toJson();
        return profileLikeCommentNew_;
    }

    @Override // p153l.eof
    /* JADX INFO: renamed from: b */
    public void mo121743b(int i) {
        bnl0.m105507D0(i, this.f194959g);
        bnl0.m105505C0(this.f194959g, i);
    }

    @Override // p153l.eof
    /* JADX INFO: renamed from: c */
    public void mo121744c(CoreSuggested.UserInfo userInfo, User user, int i) {
        this.f194960h = user;
        if (i < 0 || user.profile.answers.size() <= i) {
            return;
        }
        Answer answer = user.profile.answers.get(i);
        Question questionM151465o3 = CoreModule.f18264c.f20378d0.m151465o3(answer.question);
        String str = questionM151465o3 != null ? questionM151465o3.text : "";
        this.f194961i = str;
        this.f194962j = answer.value;
        this.f194957e.setText(str);
        this.f194958f.setText(answer.value);
    }

    @Override // p153l.eof
    /* JADX INFO: renamed from: d */
    public String mo121745d() {
        return "赞了你的问答";
    }

    @Override // p153l.eof
    /* JADX INFO: renamed from: e */
    public void mo121746e(ViewGroup viewGroup) {
        View viewM211623g = m211623g(LayoutInflater.from(viewGroup.getContext()), viewGroup);
        this.f194959g = viewM211623g;
        m211622f(viewM211623g);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 1;
        viewGroup.addView(this.f194959g, layoutParams);
        this.f194958f.setTypeface(lyh0.m156283c(3), 1);
        if (gra.m131778z()) {
            this.f194956d.setImageResource(dbc0.f87171l2);
        }
        this.f194953a.m44267b(dbc0.f87126jn, -66836);
    }

    /* JADX INFO: renamed from: f */
    public final void m211622f(View view) {
        ylf.m216570a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public View m211623g(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ylf.m216571b(this, layoutInflater, viewGroup);
    }
}
