package p009l;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.view.CardPhotoFrame;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.data.NewTags;
import com.p1.mobile.putong.core.data.ProfileLikeComment;
import com.p1.mobile.putong.core.data.ProfileLikeSnapshot;
import com.p1.mobile.putong.core.data.TagCategories;
import com.p1.mobile.putong.core.ui.PictureView;
import com.p1.mobile.putong.core.ui.VText_Default_Bold;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.eqh0;
import l.qib0;
import l.qkf;
import l.sa40;
import l.t100;
import l.tff;
import l.upa;
import l.vwb;
import l.xdl0;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class pkf implements ymf {

    /* JADX INFO: renamed from: a */
    public CardPhotoFrame f18765a;

    /* JADX INFO: renamed from: b */
    public PictureView f18766b;

    /* JADX INFO: renamed from: c */
    public VLinear f18767c;

    /* JADX INFO: renamed from: d */
    public SimpleDraweeView f18768d;

    /* JADX INFO: renamed from: e */
    public VText_Default_Bold f18769e;

    /* JADX INFO: renamed from: f */
    public VText f18770f;

    /* JADX INFO: renamed from: g */
    public View f18771g;

    /* JADX INFO: renamed from: h */
    public User f18772h;

    /* JADX INFO: renamed from: i */
    public CoreSuggested.UserInfo f18773i;

    /* JADX INFO: renamed from: j */
    public int f18774j;

    /* JADX INFO: renamed from: k */
    public String f18775k = "";

    /* JADX INFO: renamed from: l */
    public String f18776l = "";

    @Override // p009l.ymf
    /* JADX INFO: renamed from: a */
    public ProfileLikeComment mo18506a(boolean z) {
        ProfileLikeComment profileLikeCommentNew_ = ProfileLikeComment.new_();
        profileLikeCommentNew_.userId = ((DbObject) this.f18772h).id;
        profileLikeCommentNew_.module = "life_pic";
        profileLikeCommentNew_.category = "life_pic";
        profileLikeCommentNew_.identifier = "life_pic";
        ProfileLikeSnapshot profileLikeSnapshotNew_ = ProfileLikeSnapshot.new_();
        profileLikeSnapshotNew_.picture = this.f18775k;
        profileLikeSnapshotNew_.title = "生活照";
        profileLikeSnapshotNew_.desc = this.f18776l;
        profileLikeSnapshotNew_.hasComment = z;
        profileLikeCommentNew_.snapshot = profileLikeSnapshotNew_.toJson();
        return profileLikeCommentNew_;
    }

    @Override // p009l.ymf
    /* JADX INFO: renamed from: b */
    public void mo18507b(int i) {
        xdl0.D0(i, new View[]{this.f18771g});
        xdl0.C0(this.f18771g, i);
    }

    @Override // p009l.ymf
    /* JADX INFO: renamed from: c */
    public void mo18508c(CoreSuggested.UserInfo userInfo, User user, int i) {
        this.f18772h = user;
        this.f18773i = userInfo;
        this.f18774j = i;
        if (userInfo != null && userInfo.isMomentInfoCard()) {
            m20495j(i);
            return;
        }
        int i2 = i + 1;
        m20496k(i2);
        m20497l(user, i2);
    }

    @Override // p009l.ymf
    /* JADX INFO: renamed from: d */
    public String mo18509d() {
        return "赞了你的生活照";
    }

    @Override // p009l.ymf
    /* JADX INFO: renamed from: e */
    public void mo18510e(ViewGroup viewGroup) {
        this.f18771g = m20492g(LayoutInflater.from(viewGroup.getContext()), viewGroup);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 1;
        viewGroup.addView(this.f18771g, layoutParams);
        viewGroup.setClipChildren(false);
        m20493h();
    }

    /* JADX INFO: renamed from: f */
    public final void m20491f(View view) {
        qkf.a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public View m20492g(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return qkf.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: h */
    public void m20493h() {
        m20491f(this.f18771g);
        this.f18766b.L(true, false, true, true);
        this.f18766b.N = true;
    }

    /* JADX INFO: renamed from: i */
    public boolean m20494i() {
        CoreMomentInfo coreMomentInfo;
        User user;
        CoreSuggested.UserInfo userInfo = this.f18773i;
        return (userInfo == null || (coreMomentInfo = userInfo.coreMomentInfo) == null || vwb.J(coreMomentInfo.media) || (user = this.f18772h) == null || vwb.J(user.pictures) || !TextUtils.equals(((Media) this.f18772h.pictures.get(0)).url, ((Media) this.f18773i.coreMomentInfo.media.get(0)).url)) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    public final void m20495j(int i) {
        CoreMomentInfo coreMomentInfo;
        CoreSuggested.UserInfo userInfo = this.f18773i;
        if (userInfo == null || (coreMomentInfo = userInfo.coreMomentInfo) == null || vwb.J(coreMomentInfo.media)) {
            return;
        }
        if (m20494i()) {
            i++;
        }
        m20496k(i);
        m20497l(this.f18772h, i);
    }

    /* JADX INFO: renamed from: k */
    public final void m20496k(int i) {
        List list;
        User user = this.f18772h;
        if (user == null || (list = user.pictures) == null || list.size() <= i) {
            return;
        }
        Media media = this.f18772h.media(i);
        this.f18775k = ((Media) media.cover()).url;
        this.f18766b.X(media);
    }

    /* JADX INFO: renamed from: l */
    public final void m20497l(User user, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        xdl0.M(this.f18770f, false);
        xdl0.M(this.f18767c, false);
        if (user.pictures.size() <= i || !NullChecker.a(user.pictures.get(i))) {
            return;
        }
        if (!vwb.J(((Media) user.pictures.get(i)).tags)) {
            NewTags newTagsO = sa40.o().O((String) ((Media) user.pictures.get(i)).tags.get(0));
            TagCategories tagCategories = null;
            if (NullChecker.a(newTagsO)) {
                str = newTagsO.name;
                this.f18776l = str;
                List list = newTagsO.localTagCategories;
                if (!vwb.J(list)) {
                    tagCategories = (TagCategories) list.get(0);
                }
            } else {
                str = "";
            }
            if (NullChecker.a(tagCategories) && !TextUtils.isEmpty(str)) {
                if (upa.z()) {
                    str2 = (String) tff.Z().get(tagCategories.id);
                    str3 = tagCategories.categoryBackground;
                    str4 = tagCategories.categoryTextColor;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "https://auto.tancdn.com/v1/images/eyJpZCI6IktPV0g3U0hGRUhQQVpQUUs0STdXNkxSUzVDRzRaNDE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png";
                    }
                } else {
                    str2 = tagCategories.categoryIcon;
                    str3 = tagCategories.categoryBackground;
                    str4 = tagCategories.categoryTextColor;
                }
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                    try {
                        Color.parseColor(str4);
                        Color.parseColor(str3);
                        xdl0.M(this.f18767c, true);
                        xdl0.M(this.f18768d, true);
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setCornerRadius(t100.d(6.0f));
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(Integer.valueOf(Color.parseColor(str3)));
                        arrayList.add(Integer.valueOf(Color.parseColor(str3)));
                        int[] iArr = new int[arrayList.size()];
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
                            iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
                        }
                        gradientDrawable.setColors(iArr);
                        this.f18767c.setBackground(gradientDrawable);
                        qib0.G.L0(this.f18768d, str2);
                        this.f18769e.setTextColor(Color.parseColor(str4));
                        this.f18769e.setText(str);
                        return;
                    } catch (Exception unused) {
                        CrashHelper.c(new RuntimeException(" 图片标签颜色配置错误"));
                    }
                }
            }
        }
        CoreSuggested.UserInfo userInfo = this.f18773i;
        if (userInfo == null || !userInfo.isMomentInfoCard() || i != 0 || m20494i()) {
            return;
        }
        xdl0.M(this.f18767c, false);
        xdl0.M(this.f18768d, false);
        xdl0.M(this.f18770f, true);
        this.f18770f.setTypeface(eqh0.c(3), 1);
    }
}
