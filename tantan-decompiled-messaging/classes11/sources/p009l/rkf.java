package p009l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.newui.profile.expandprofilelike.view.ProfileLikeContentRootLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.ProfileLikeComment;
import com.p1.mobile.putong.core.data.ProfileLikeSnapshot;
import com.p1.mobile.putong.core.data.Question;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.p1.mobile.putong.data.Answer;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import l.eqh0;
import l.skf;
import l.upa;
import l.x2c0;
import l.xdl0;
import v.VImage;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class rkf implements ymf {

    /* JADX INFO: renamed from: a */
    public ProfileLikeContentRootLayout f19888a;

    /* JADX INFO: renamed from: b */
    public VLinear f19889b;

    /* JADX INFO: renamed from: c */
    public VLinear f19890c;

    /* JADX INFO: renamed from: d */
    public VImage f19891d;

    /* JADX INFO: renamed from: e */
    public VText_Bold f19892e;

    /* JADX INFO: renamed from: f */
    public VText_Bold f19893f;

    /* JADX INFO: renamed from: g */
    public View f19894g;

    /* JADX INFO: renamed from: h */
    public User f19895h;

    /* JADX INFO: renamed from: i */
    public String f19896i = "";

    /* JADX INFO: renamed from: j */
    public String f19897j = "";

    @Override // p009l.ymf
    /* JADX INFO: renamed from: a */
    public ProfileLikeComment mo18506a(boolean z) {
        ProfileLikeComment profileLikeCommentNew_ = ProfileLikeComment.new_();
        profileLikeCommentNew_.userId = ((DbObject) this.f19895h).id;
        profileLikeCommentNew_.module = "question";
        profileLikeCommentNew_.category = "question";
        profileLikeCommentNew_.identifier = "question";
        ProfileLikeSnapshot profileLikeSnapshotNew_ = ProfileLikeSnapshot.new_();
        profileLikeSnapshotNew_.picture = upa.z() ? "https://auto.tancdn.com/v1/images/eyJpZCI6Ik5JRE1CNzIzRzNDSUxIVVdKUTVKUVVPSExGNTNUWDE0IiwidyI6MTI2LCJoIjoxMjYsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMTk4NTYzNzUyMTQwMjcxMzUyNn0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlRMNkE0VUFXQ0pONVpHSE5ZUzdEUFFZQ1c0WFcyUzE0IiwidyI6MTYwLCJoIjoxNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0Mjc1NTM5NDIxMjY2NDcxMjAzfQ.png";
        profileLikeSnapshotNew_.title = this.f19896i;
        profileLikeSnapshotNew_.desc = this.f19897j;
        profileLikeSnapshotNew_.hasComment = z;
        profileLikeCommentNew_.snapshot = profileLikeSnapshotNew_.toJson();
        return profileLikeCommentNew_;
    }

    @Override // p009l.ymf
    /* JADX INFO: renamed from: b */
    public void mo18507b(int i) {
        xdl0.D0(i, new View[]{this.f19894g});
        xdl0.C0(this.f19894g, i);
    }

    @Override // p009l.ymf
    /* JADX INFO: renamed from: c */
    public void mo18508c(CoreSuggested.UserInfo userInfo, User user, int i) {
        this.f19895h = user;
        if (i < 0 || user.profile.answers.size() <= i) {
            return;
        }
        Answer answer = (Answer) user.profile.answers.get(i);
        Question questionO3 = CoreModule.c.d0.o3(answer.question);
        String str = questionO3 != null ? questionO3.text : "";
        this.f19896i = str;
        this.f19897j = answer.value;
        this.f19892e.setText(str);
        this.f19893f.setText(answer.value);
    }

    @Override // p009l.ymf
    /* JADX INFO: renamed from: d */
    public String mo18509d() {
        return "赞了你的问答";
    }

    @Override // p009l.ymf
    /* JADX INFO: renamed from: e */
    public void mo18510e(ViewGroup viewGroup) {
        View viewM21691g = m21691g(LayoutInflater.from(viewGroup.getContext()), viewGroup);
        this.f19894g = viewM21691g;
        m21690f(viewM21691g);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 1;
        viewGroup.addView(this.f19894g, layoutParams);
        this.f19893f.setTypeface(eqh0.c(3), 1);
        if (upa.z()) {
            this.f19891d.setImageResource(x2c0.k2);
        }
        this.f19888a.m7477b(x2c0.vm, -66836);
    }

    /* JADX INFO: renamed from: f */
    public final void m21690f(View view) {
        skf.a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public View m21691g(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return skf.b(this, layoutInflater, viewGroup);
    }
}
