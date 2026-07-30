package p153l;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.data.NewTags;
import com.p051p1.mobile.putong.core.data.ProfileLikeComment;
import com.p051p1.mobile.putong.core.data.ProfileLikeSnapshot;
import com.p051p1.mobile.putong.core.data.ProfileLikeType;
import com.p051p1.mobile.putong.core.data.TagCategories;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.view.CardPhotoFrame;
import com.p051p1.mobile.putong.core.p058ui.PictureView;
import com.p051p1.mobile.putong.core.p058ui.VText_Default_Bold;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class vlf implements eof {

    /* JADX INFO: renamed from: a */
    public CardPhotoFrame f184571a;

    /* JADX INFO: renamed from: b */
    public PictureView f184572b;

    /* JADX INFO: renamed from: c */
    public VLinear f184573c;

    /* JADX INFO: renamed from: d */
    public SimpleDraweeView f184574d;

    /* JADX INFO: renamed from: e */
    public VText_Default_Bold f184575e;

    /* JADX INFO: renamed from: f */
    public VText f184576f;

    /* JADX INFO: renamed from: g */
    public View f184577g;

    /* JADX INFO: renamed from: h */
    public User f184578h;

    /* JADX INFO: renamed from: i */
    public CoreSuggested.UserInfo f184579i;

    /* JADX INFO: renamed from: j */
    public int f184580j;

    /* JADX INFO: renamed from: k */
    public String f184581k = "";

    /* JADX INFO: renamed from: l */
    public String f184582l = "";

    @Override // p153l.eof
    /* JADX INFO: renamed from: a */
    public ProfileLikeComment mo121742a(boolean z) {
        ProfileLikeComment profileLikeCommentNew_ = ProfileLikeComment.new_();
        profileLikeCommentNew_.userId = this.f184578h.f56859id;
        profileLikeCommentNew_.module = ProfileLikeType.life_pic;
        profileLikeCommentNew_.category = ProfileLikeType.life_pic;
        profileLikeCommentNew_.identifier = ProfileLikeType.life_pic;
        ProfileLikeSnapshot profileLikeSnapshotNew_ = ProfileLikeSnapshot.new_();
        profileLikeSnapshotNew_.picture = this.f184581k;
        profileLikeSnapshotNew_.title = "生活照";
        profileLikeSnapshotNew_.desc = this.f184582l;
        profileLikeSnapshotNew_.hasComment = z;
        profileLikeCommentNew_.snapshot = profileLikeSnapshotNew_.toJson();
        return profileLikeCommentNew_;
    }

    @Override // p153l.eof
    /* JADX INFO: renamed from: b */
    public void mo121743b(int i) {
        bnl0.m105507D0(i, this.f184577g);
        bnl0.m105505C0(this.f184577g, i);
    }

    @Override // p153l.eof
    /* JADX INFO: renamed from: c */
    public void mo121744c(CoreSuggested.UserInfo userInfo, User user, int i) {
        this.f184578h = user;
        this.f184579i = userInfo;
        this.f184580j = i;
        if (userInfo != null && userInfo.isMomentInfoCard()) {
            m201620j(i);
            return;
        }
        int i2 = i + 1;
        m201621k(i2);
        m201622l(user, i2);
    }

    @Override // p153l.eof
    /* JADX INFO: renamed from: d */
    public String mo121745d() {
        return "赞了你的生活照";
    }

    @Override // p153l.eof
    /* JADX INFO: renamed from: e */
    public void mo121746e(ViewGroup viewGroup) {
        this.f184577g = m201617g(LayoutInflater.from(viewGroup.getContext()), viewGroup);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 1;
        viewGroup.addView(this.f184577g, layoutParams);
        viewGroup.setClipChildren(false);
        m201618h();
    }

    /* JADX INFO: renamed from: f */
    public final void m201616f(View view) {
        wlf.m207021a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public View m201617g(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wlf.m207022b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: h */
    public void m201618h() {
        m201616f(this.f184577g);
        this.f184572b.m45167L(true, false, true, true);
        this.f184572b.f28902N = true;
    }

    /* JADX INFO: renamed from: i */
    public boolean m201619i() {
        CoreMomentInfo coreMomentInfo;
        User user;
        CoreSuggested.UserInfo userInfo = this.f184579i;
        return (userInfo == null || (coreMomentInfo = userInfo.coreMomentInfo) == null || jyb.m147479J(coreMomentInfo.media) || (user = this.f184578h) == null || jyb.m147479J(user.pictures) || !TextUtils.equals(this.f184578h.pictures.get(0).url, this.f184579i.coreMomentInfo.media.get(0).url)) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    public final void m201620j(int i) {
        CoreMomentInfo coreMomentInfo;
        CoreSuggested.UserInfo userInfo = this.f184579i;
        if (userInfo == null || (coreMomentInfo = userInfo.coreMomentInfo) == null || jyb.m147479J(coreMomentInfo.media)) {
            return;
        }
        if (m201619i()) {
            i++;
        }
        m201621k(i);
        m201622l(this.f184578h, i);
    }

    /* JADX INFO: renamed from: k */
    public final void m201621k(int i) {
        List<Media> list;
        User user = this.f184578h;
        if (user == null || (list = user.pictures) == null || list.size() <= i) {
            return;
        }
        Media media = this.f184578h.media(i);
        this.f184581k = media.cover().url;
        this.f184572b.m45176X(media);
    }

    /* JADX INFO: renamed from: l */
    public final void m201622l(User user, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        bnl0.m105524M(this.f184576f, false);
        bnl0.m105524M(this.f184573c, false);
        if (user.pictures.size() <= i || !NullChecker.m82486a(user.pictures.get(i))) {
            return;
        }
        if (!jyb.m147479J(user.pictures.get(i).tags)) {
            NewTags newTagsM130430O = gj40.m130415o().m130430O(user.pictures.get(i).tags.get(0));
            TagCategories tagCategories = null;
            if (NullChecker.m82486a(newTagsM130430O)) {
                str = newTagsM130430O.name;
                this.f184582l = str;
                List<TagCategories> list = newTagsM130430O.localTagCategories;
                if (!jyb.m147479J(list)) {
                    tagCategories = list.get(0);
                }
            } else {
                str = "";
            }
            if (NullChecker.m82486a(tagCategories) && !TextUtils.isEmpty(str)) {
                if (gra.m131778z()) {
                    str2 = zgf.m219609Z().get(tagCategories.f21256id);
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
                        bnl0.m105524M(this.f184573c, true);
                        bnl0.m105524M(this.f184574d, true);
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setCornerRadius(qa00.m175859d(6.0f));
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(Integer.valueOf(Color.parseColor(str3)));
                        arrayList.add(Integer.valueOf(Color.parseColor(str3)));
                        int[] iArr = new int[arrayList.size()];
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
                            iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
                        }
                        gradientDrawable.setColors(iArr);
                        this.f184573c.setBackground(gradientDrawable);
                        uqb0.f180374G.m127115L0(this.f184574d, str2);
                        this.f184575e.setTextColor(Color.parseColor(str4));
                        this.f184575e.setText(str);
                        return;
                    } catch (Exception unused) {
                        CrashHelper.m82479c(new RuntimeException(" 图片标签颜色配置错误"));
                    }
                }
            }
        }
        CoreSuggested.UserInfo userInfo = this.f184579i;
        if (userInfo == null || !userInfo.isMomentInfoCard() || i != 0 || m201619i()) {
            return;
        }
        bnl0.m105524M(this.f184573c, false);
        bnl0.m105524M(this.f184574d, false);
        bnl0.m105524M(this.f184576f, true);
        this.f184576f.setTypeface(lyh0.m156283c(3), 1);
    }
}
