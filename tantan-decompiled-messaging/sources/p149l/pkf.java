package p149l;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.data.NewTags;
import com.p046p1.mobile.putong.core.data.ProfileLikeComment;
import com.p046p1.mobile.putong.core.data.ProfileLikeSnapshot;
import com.p046p1.mobile.putong.core.data.ProfileLikeType;
import com.p046p1.mobile.putong.core.data.TagCategories;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.view.CardPhotoFrame;
import com.p046p1.mobile.putong.core.p053ui.PictureView;
import com.p046p1.mobile.putong.core.p053ui.VText_Default_Bold;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class pkf implements ymf {

    /* JADX INFO: renamed from: a */
    public CardPhotoFrame f149968a;

    /* JADX INFO: renamed from: b */
    public PictureView f149969b;

    /* JADX INFO: renamed from: c */
    public VLinear f149970c;

    /* JADX INFO: renamed from: d */
    public SimpleDraweeView f149971d;

    /* JADX INFO: renamed from: e */
    public VText_Default_Bold f149972e;

    /* JADX INFO: renamed from: f */
    public VText f149973f;

    /* JADX INFO: renamed from: g */
    public View f149974g;

    /* JADX INFO: renamed from: h */
    public User f149975h;

    /* JADX INFO: renamed from: i */
    public CoreSuggested.UserInfo f149976i;

    /* JADX INFO: renamed from: j */
    public int f149977j;

    /* JADX INFO: renamed from: k */
    public String f149978k = "";

    /* JADX INFO: renamed from: l */
    public String f149979l = "";

    @Override // p149l.ymf
    /* JADX INFO: renamed from: a */
    public ProfileLikeComment mo154799a(boolean z) {
        ProfileLikeComment profileLikeCommentNew_ = ProfileLikeComment.new_();
        profileLikeCommentNew_.userId = this.f149975h.f56011id;
        profileLikeCommentNew_.module = ProfileLikeType.life_pic;
        profileLikeCommentNew_.category = ProfileLikeType.life_pic;
        profileLikeCommentNew_.identifier = ProfileLikeType.life_pic;
        ProfileLikeSnapshot profileLikeSnapshotNew_ = ProfileLikeSnapshot.new_();
        profileLikeSnapshotNew_.picture = this.f149978k;
        profileLikeSnapshotNew_.title = "生活照";
        profileLikeSnapshotNew_.desc = this.f149979l;
        profileLikeSnapshotNew_.hasComment = z;
        profileLikeCommentNew_.snapshot = profileLikeSnapshotNew_.toJson();
        return profileLikeCommentNew_;
    }

    @Override // p149l.ymf
    /* JADX INFO: renamed from: b */
    public void mo154800b(int i) {
        xdl0.m208327D0(i, this.f149974g);
        xdl0.m208325C0(this.f149974g, i);
    }

    @Override // p149l.ymf
    /* JADX INFO: renamed from: c */
    public void mo154801c(CoreSuggested.UserInfo userInfo, User user, int i) {
        this.f149975h = user;
        this.f149976i = userInfo;
        this.f149977j = i;
        if (userInfo != null && userInfo.isMomentInfoCard()) {
            m170028j(i);
            return;
        }
        int i2 = i + 1;
        m170029k(i2);
        m170030l(user, i2);
    }

    @Override // p149l.ymf
    /* JADX INFO: renamed from: d */
    public String mo154802d() {
        return "赞了你的生活照";
    }

    @Override // p149l.ymf
    /* JADX INFO: renamed from: e */
    public void mo154803e(ViewGroup viewGroup) {
        this.f149974g = m170025g(LayoutInflater.from(viewGroup.getContext()), viewGroup);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 1;
        viewGroup.addView(this.f149974g, layoutParams);
        viewGroup.setClipChildren(false);
        m170026h();
    }

    /* JADX INFO: renamed from: f */
    public final void m170024f(View view) {
        qkf.m175373a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public View m170025g(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return qkf.m175374b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: h */
    public void m170026h() {
        m170024f(this.f149974g);
        this.f149969b.m43984L(true, false, true, true);
        this.f149969b.f28054N = true;
    }

    /* JADX INFO: renamed from: i */
    public boolean m170027i() {
        CoreMomentInfo coreMomentInfo;
        User user;
        CoreSuggested.UserInfo userInfo = this.f149976i;
        return (userInfo == null || (coreMomentInfo = userInfo.coreMomentInfo) == null || vwb.m200296J(coreMomentInfo.media) || (user = this.f149975h) == null || vwb.m200296J(user.pictures) || !TextUtils.equals(this.f149975h.pictures.get(0).url, this.f149976i.coreMomentInfo.media.get(0).url)) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    public final void m170028j(int i) {
        CoreMomentInfo coreMomentInfo;
        CoreSuggested.UserInfo userInfo = this.f149976i;
        if (userInfo == null || (coreMomentInfo = userInfo.coreMomentInfo) == null || vwb.m200296J(coreMomentInfo.media)) {
            return;
        }
        if (m170027i()) {
            i++;
        }
        m170029k(i);
        m170030l(this.f149975h, i);
    }

    /* JADX INFO: renamed from: k */
    public final void m170029k(int i) {
        List<Media> list;
        User user = this.f149975h;
        if (user == null || (list = user.pictures) == null || list.size() <= i) {
            return;
        }
        Media media = this.f149975h.media(i);
        this.f149978k = media.cover().url;
        this.f149969b.m43993X(media);
    }

    /* JADX INFO: renamed from: l */
    public final void m170030l(User user, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        xdl0.m208344M(this.f149973f, false);
        xdl0.m208344M(this.f149970c, false);
        if (user.pictures.size() <= i || !NullChecker.m81303a(user.pictures.get(i))) {
            return;
        }
        if (!vwb.m200296J(user.pictures.get(i).tags)) {
            NewTags newTagsM182817O = sa40.m182802o().m182817O(user.pictures.get(i).tags.get(0));
            TagCategories tagCategories = null;
            if (NullChecker.m81303a(newTagsM182817O)) {
                str = newTagsM182817O.name;
                this.f149979l = str;
                List<TagCategories> list = newTagsM182817O.localTagCategories;
                if (!vwb.m200296J(list)) {
                    tagCategories = list.get(0);
                }
            } else {
                str = "";
            }
            if (NullChecker.m81303a(tagCategories) && !TextUtils.isEmpty(str)) {
                if (upa.m194847z()) {
                    str2 = tff.m188696Z().get(tagCategories.f20514id);
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
                        xdl0.m208344M(this.f149970c, true);
                        xdl0.m208344M(this.f149971d, true);
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setCornerRadius(t100.m186890d(6.0f));
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(Integer.valueOf(Color.parseColor(str3)));
                        arrayList.add(Integer.valueOf(Color.parseColor(str3)));
                        int[] iArr = new int[arrayList.size()];
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
                            iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
                        }
                        gradientDrawable.setColors(iArr);
                        this.f149970c.setBackground(gradientDrawable);
                        qib0.f154691G.m102331L0(this.f149971d, str2);
                        this.f149972e.setTextColor(Color.parseColor(str4));
                        this.f149972e.setText(str);
                        return;
                    } catch (Exception unused) {
                        CrashHelper.m81296c(new RuntimeException(" 图片标签颜色配置错误"));
                    }
                }
            }
        }
        CoreSuggested.UserInfo userInfo = this.f149976i;
        if (userInfo == null || !userInfo.isMomentInfoCard() || i != 0 || m170027i()) {
            return;
        }
        xdl0.m208344M(this.f149970c, false);
        xdl0.m208344M(this.f149971d, false);
        xdl0.m208344M(this.f149973f, true);
        this.f149973f.setTypeface(eqh0.m117752c(3), 1);
    }
}
