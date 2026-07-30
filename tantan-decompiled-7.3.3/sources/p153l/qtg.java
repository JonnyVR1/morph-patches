package p153l;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterImageView;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import org.json.JSONObject;
import p151v.AutoVDraweeView;
import p151v.VDraweeView;
import p151v.VRelative;

/* JADX INFO: loaded from: classes13.dex */
public class qtg {
    /* JADX INFO: renamed from: a */
    public static int m177925a() {
        return cai.m108495c(cai.f80594c, cai.f80595d);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0036 A[PHI: r3
      0x0036: PHI (r3v19 int) = (r3v15 int), (r3v21 int) binds: [B:17:0x0047, B:11:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x0038 A[PHI: r3
      0x0038: PHI (r3v16 int) = (r3v15 int), (r3v21 int) binds: [B:17:0x0047, B:11:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x0057  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX INFO: renamed from: b */
    public static Dimension m177926b(Picture picture, boolean z) {
        Dimension dimension;
        int i;
        int iM177925a = (m177925a() * 2) + qa00.m175859d(FeedCenterImageView.f42665F);
        if (NullChecker.m82487b(picture.size)) {
            dimension = picture.size;
            if (dimension.height <= 0) {
                dimension = new Dimension(iM177925a, iM177925a);
            }
        } else {
            dimension = new Dimension(iM177925a, iM177925a);
        }
        float f = dimension.width / dimension.height;
        if (f <= 0.7f) {
            i = (iM177925a * 9) / 16;
            if (z) {
                iM177925a = i;
            } else {
                iM177925a = i;
                i = iM177925a;
            }
        } else if (f <= 0.83f) {
            i = (iM177925a * 3) / 4;
            if (z) {
                iM177925a = i;
            } else {
                iM177925a = i;
                i = iM177925a;
            }
        } else if (f >= 1.2f) {
            i = (iM177925a * 3) / 4;
            if (z) {
                i = iM177925a;
            }
        } else {
            i = iM177925a;
        }
        return new Dimension(iM177925a, i);
    }

    /* JADX INFO: renamed from: c */
    public static void m177927c(View view, boolean z) {
        if (NullChecker.m82486a(view)) {
            bnl0.m105524M(view, z);
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m177928d(Picture.ImageUri imageUri) {
        try {
            JSONObject jSONObject = new JSONObject(RemoteConfig.m80481x().m80485F("community_optimization_long_graphic"));
            int iOptInt = jSONObject.optInt("horizontal_ratio", 1);
            int iOptInt2 = jSONObject.optInt("vertical_ratio", 1);
            Dimension dimension = imageUri.orignalDimen;
            float f = dimension.height / dimension.width;
            if (f >= 2.0f && f <= iOptInt2) {
                return !cgw.m109764h(App.f16088e);
            }
            if (f >= 1.0f / iOptInt && f <= 0.33333334f) {
                return !cgw.m109764h(App.f16088e);
            }
            return false;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m177929e(Moment moment, List<Media> list, FrameLayout frameLayout, String str, a30 a30Var) {
        m177930f(moment, list, frameLayout, str, false, a30Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m177930f(Moment moment, List<Media> list, FrameLayout frameLayout, String str, boolean z, a30 a30Var) {
        Picture picture;
        float f;
        Picture picture2;
        boolean z2 = false;
        int i = 0;
        while (true) {
            picture = null;
            if (i >= frameLayout.getChildCount()) {
                break;
            }
            m177927c(frameLayout.getChildAt(i), false);
            if (frameLayout.getChildAt(i) instanceof VRelative) {
                VRelative vRelative = (VRelative) frameLayout.getChildAt(i);
                m177927c(vRelative, false);
                View childAt = vRelative.getChildAt(0);
                if (childAt instanceof VDraweeView) {
                    VDraweeView vDraweeView = (VDraweeView) childAt;
                    uqb0.f180374G.m98798o(vDraweeView);
                    vDraweeView.setOnClickListener(null);
                    childAt.setOnClickListener(null);
                    vDraweeView.setZoomAnimationKey(null);
                }
                m177927c(vRelative.getChildAt(1), false);
                if (vRelative.getChildCount() >= 3) {
                    m177927c(vRelative.getChildAt(2), false);
                }
            }
            i++;
        }
        float f2 = 4.0f;
        if (list.size() == 1) {
            Media media = list.get(0);
            boolean z3 = media instanceof Video;
            if (media instanceof Picture) {
                picture = (Picture) media;
            } else if (z3) {
                picture = ((Video) media).cover;
            }
            if (NullChecker.m82487b(picture)) {
                VRelative vRelative2 = (VRelative) frameLayout.getChildAt(0);
                View childAt2 = vRelative2.getChildAt(0);
                boolean z4 = !jyb.m147479J(moment.mediaRepeatIndexList) && moment.mediaRepeatIndexList.contains(0);
                View childAt3 = vRelative2.getChildAt(1);
                if (z4 && cmg.m111174C0()) {
                    z2 = true;
                }
                bnl0.m105524M(childAt3, z2);
                bnl0.m105525M0(vRelative2, true);
                if (vRelative2.getChildCount() >= 3 && NullChecker.m82486a(picture.livePhoto) && cmg.m111240v0()) {
                    m177927c(vRelative2.getChildAt(2), true);
                }
                Dimension dimensionM177926b = m177926b(picture, z);
                vRelative2.setLayoutParams(new FrameLayout.LayoutParams(dimensionM177926b.width, dimensionM177926b.height));
                if (childAt2 instanceof VDraweeView) {
                    VDraweeView vDraweeView2 = (VDraweeView) childAt2;
                    if (NullChecker.m82486a(a30Var)) {
                        a30Var.mo37058a(vDraweeView2, 0, 0);
                    }
                    if (!TEnum.equals(picture.status, "raw") && !TextUtils.isEmpty(picture.url)) {
                        String str2 = z3 ? "" : str;
                        Picture.ImageUri imageUriCalculatedWidth = picture.calculatedWidth(qa00.m175859d(FeedCenterImageView.f42665F) + (m177925a() * 2));
                        if (m177928d(imageUriCalculatedWidth)) {
                            if (vDraweeView2 instanceof AutoVDraweeView) {
                                ((AutoVDraweeView) vDraweeView2).m224130u();
                            }
                            uqb0.f180374G.m127123P0(vDraweeView2, imageUriCalculatedWidth, dimensionM177926b.width, dimensionM177926b.height);
                        } else if (vDraweeView2 instanceof AutoVDraweeView) {
                            ((AutoVDraweeView) vDraweeView2).setImageUrl(picture.url);
                        } else {
                            uqb0.f180374G.m127127R0(vDraweeView2, imageUriCalculatedWidth, str2);
                        }
                        vDraweeView2.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
                    }
                    vDraweeView2.getHierarchy().m207045H(RoundingParams.m8303c(4.0f).m8323w(RoundingParams.RoundingMethod.BITMAP_ONLY));
                    return;
                }
                return;
            }
            return;
        }
        int i2 = 0;
        while (i2 < Math.min(list.size(), 9)) {
            Media media2 = list.get(i2);
            if (media2 instanceof Picture) {
                picture2 = (Picture) media2;
            } else {
                if (media2 instanceof Video) {
                    picture2 = ((Video) media2).cover;
                } else {
                    f = f2;
                }
                i2++;
                f2 = f;
            }
            VRelative vRelative3 = (VRelative) frameLayout.getChildAt(i2);
            if (!(vRelative3.getChildAt(0) instanceof VDraweeView)) {
                return;
            }
            VDraweeView vDraweeView3 = (VDraweeView) vRelative3.getChildAt(0);
            bnl0.m105525M0(vRelative3, true);
            bnl0.m105524M(vRelative3.getChildAt(1), (!jyb.m147479J(moment.mediaRepeatIndexList) && moment.mediaRepeatIndexList.contains(Integer.valueOf(i2))) && cmg.m111174C0());
            if (vRelative3.getChildCount() >= 3 && NullChecker.m82486a(picture2.livePhoto) && cmg.m111240v0()) {
                m177927c(vRelative3.getChildAt(2), true);
            }
            f = f2;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(m177925a(), m177925a());
            vDraweeView3.getHierarchy().m207045H(RoundingParams.m8303c(f).m8323w(RoundingParams.RoundingMethod.BITMAP_ONLY));
            vRelative3.setLayoutParams(layoutParams);
            switch (i2) {
                case 1:
                    layoutParams.setMargins(qa00.m175859d(FeedCenterImageView.f42665F) + m177925a(), 0, 0, 0);
                    break;
                case 2:
                    layoutParams.setMargins(qa00.m175859d(FeedCenterImageView.f42665F * 2) + (m177925a() * 2), 0, 0, 0);
                    break;
                case 3:
                    layoutParams.setMargins(0, qa00.m175859d(FeedCenterImageView.f42665F) + m177925a(), 0, 0);
                    break;
                case 4:
                    layoutParams.setMargins(qa00.m175859d(FeedCenterImageView.f42665F) + m177925a(), qa00.m175859d(FeedCenterImageView.f42665F) + m177925a(), 0, 0);
                    break;
                case 5:
                    layoutParams.setMargins(qa00.m175859d(FeedCenterImageView.f42665F * 2) + (m177925a() * 2), qa00.m175859d(FeedCenterImageView.f42665F) + m177925a(), 0, 0);
                    break;
                case 6:
                    layoutParams.setMargins(0, qa00.m175859d(FeedCenterImageView.f42665F * 2) + (m177925a() * 2), 0, 0);
                    break;
                case 7:
                    layoutParams.setMargins(qa00.m175859d(FeedCenterImageView.f42665F) + m177925a(), qa00.m175859d(FeedCenterImageView.f42665F * 2) + (m177925a() * 2), 0, 0);
                    break;
                case 8:
                    layoutParams.setMargins(qa00.m175859d(FeedCenterImageView.f42665F * 2) + (m177925a() * 2), qa00.m175859d(FeedCenterImageView.f42665F * 2) + (m177925a() * 2), 0, 0);
                    break;
            }
            if (!TEnum.equals(picture2.status, "raw") && !TextUtils.isEmpty(picture2.url)) {
                Picture.ImageUri imageUriCalculatedWidth2 = picture2.calculatedWidth(qa00.m175859d(FeedCenterImageView.f42665F) + (m177925a() * 2));
                if (m177928d(imageUriCalculatedWidth2)) {
                    if (vDraweeView3 instanceof AutoVDraweeView) {
                        ((AutoVDraweeView) vDraweeView3).m224130u();
                    }
                    uqb0.f180374G.m127123P0(vDraweeView3, imageUriCalculatedWidth2, m177925a(), m177925a());
                } else {
                    if (vDraweeView3 instanceof AutoVDraweeView) {
                        ((AutoVDraweeView) vDraweeView3).setImageUrl(picture2.url);
                    } else {
                        uqb0.f180374G.m127127R0(vDraweeView3, imageUriCalculatedWidth2, str);
                    }
                    vDraweeView3.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture2.url));
                }
                vDraweeView3.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture2.url));
            }
            if (NullChecker.m82486a(a30Var)) {
                a30Var.mo37058a(vDraweeView3, Integer.valueOf(i2), Integer.valueOf(i2));
            }
            i2++;
            f2 = f;
        }
    }
}
