package p149l;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterImageView;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import org.json.JSONObject;
import p147v.AutoVDraweeView;
import p147v.VDraweeView;
import p147v.VRelative;

/* JADX INFO: loaded from: classes12.dex */
public class bsg {
    /* JADX INFO: renamed from: a */
    public static int m103710a() {
        return n8i.m158496c(n8i.f137647c, n8i.f137648d);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0036 A[PHI: r3
      0x0036: PHI (r3v19 int) = (r3v15 int), (r3v21 int) binds: [B:17:0x0047, B:11:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x0038 A[PHI: r3
      0x0038: PHI (r3v16 int) = (r3v15 int), (r3v21 int) binds: [B:17:0x0047, B:11:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x0057  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX INFO: renamed from: b */
    public static Dimension m103711b(Picture picture, boolean z) {
        Dimension dimension;
        int i;
        int iM103710a = (m103710a() * 2) + t100.m186890d(FeedCenterImageView.f41817F);
        if (NullChecker.m81304b(picture.size)) {
            dimension = picture.size;
            if (dimension.height <= 0) {
                dimension = new Dimension(iM103710a, iM103710a);
            }
        } else {
            dimension = new Dimension(iM103710a, iM103710a);
        }
        float f = dimension.width / dimension.height;
        if (f <= 0.7f) {
            i = (iM103710a * 9) / 16;
            if (z) {
                iM103710a = i;
            } else {
                iM103710a = i;
                i = iM103710a;
            }
        } else if (f <= 0.83f) {
            i = (iM103710a * 3) / 4;
            if (z) {
                iM103710a = i;
            } else {
                iM103710a = i;
                i = iM103710a;
            }
        } else if (f >= 1.2f) {
            i = (iM103710a * 3) / 4;
            if (z) {
                i = iM103710a;
            }
        } else {
            i = iM103710a;
        }
        return new Dimension(iM103710a, i);
    }

    /* JADX INFO: renamed from: c */
    public static void m103712c(View view, boolean z) {
        if (NullChecker.m81303a(view)) {
            xdl0.m208344M(view, z);
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m103713d(Picture.ImageUri imageUri) {
        try {
            JSONObject jSONObject = new JSONObject(RemoteConfig.m79298x().m79302F("community_optimization_long_graphic"));
            int iOptInt = jSONObject.optInt("horizontal_ratio", 1);
            int iOptInt2 = jSONObject.optInt("vertical_ratio", 1);
            Dimension dimension = imageUri.orignalDimen;
            float f = dimension.height / dimension.width;
            if (f >= 2.0f && f <= iOptInt2) {
                return !eew.m116012h(App.f15369e);
            }
            if (f >= 1.0f / iOptInt && f <= 0.33333334f) {
                return !eew.m116012h(App.f15369e);
            }
            return false;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m103714e(Moment moment, List<Media> list, FrameLayout frameLayout, String str, g30 g30Var) {
        m103715f(moment, list, frameLayout, str, false, g30Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m103715f(Moment moment, List<Media> list, FrameLayout frameLayout, String str, boolean z, g30 g30Var) {
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
            m103712c(frameLayout.getChildAt(i), false);
            if (frameLayout.getChildAt(i) instanceof VRelative) {
                VRelative vRelative = (VRelative) frameLayout.getChildAt(i);
                m103712c(vRelative, false);
                View childAt = vRelative.getChildAt(0);
                if (childAt instanceof VDraweeView) {
                    VDraweeView vDraweeView = (VDraweeView) childAt;
                    qib0.f154691G.m184725o(vDraweeView);
                    vDraweeView.setOnClickListener(null);
                    childAt.setOnClickListener(null);
                    vDraweeView.setZoomAnimationKey(null);
                }
                m103712c(vRelative.getChildAt(1), false);
                if (vRelative.getChildCount() >= 3) {
                    m103712c(vRelative.getChildAt(2), false);
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
            if (NullChecker.m81304b(picture)) {
                VRelative vRelative2 = (VRelative) frameLayout.getChildAt(0);
                View childAt2 = vRelative2.getChildAt(0);
                boolean z4 = !vwb.m200296J(moment.mediaRepeatIndexList) && moment.mediaRepeatIndexList.contains(0);
                View childAt3 = vRelative2.getChildAt(1);
                if (z4 && nkg.m159845C0()) {
                    z2 = true;
                }
                xdl0.m208344M(childAt3, z2);
                xdl0.m208345M0(vRelative2, true);
                if (vRelative2.getChildCount() >= 3 && NullChecker.m81303a(picture.livePhoto) && nkg.m159911v0()) {
                    m103712c(vRelative2.getChildAt(2), true);
                }
                Dimension dimensionM103711b = m103711b(picture, z);
                vRelative2.setLayoutParams(new FrameLayout.LayoutParams(dimensionM103711b.width, dimensionM103711b.height));
                if (childAt2 instanceof VDraweeView) {
                    VDraweeView vDraweeView2 = (VDraweeView) childAt2;
                    if (NullChecker.m81303a(g30Var)) {
                        g30Var.mo36055a(vDraweeView2, 0, 0);
                    }
                    if (!TEnum.equals(picture.status, "raw") && !TextUtils.isEmpty(picture.url)) {
                        String str2 = z3 ? "" : str;
                        Picture.ImageUri imageUriCalculatedWidth = picture.calculatedWidth(t100.m186890d(FeedCenterImageView.f41817F) + (m103710a() * 2));
                        if (m103713d(imageUriCalculatedWidth)) {
                            if (vDraweeView2 instanceof AutoVDraweeView) {
                                ((AutoVDraweeView) vDraweeView2).m222884u();
                            }
                            qib0.f154691G.m102339P0(vDraweeView2, imageUriCalculatedWidth, dimensionM103711b.width, dimensionM103711b.height);
                        } else if (vDraweeView2 instanceof AutoVDraweeView) {
                            ((AutoVDraweeView) vDraweeView2).setImageUrl(picture.url);
                        } else {
                            qib0.f154691G.m102343R0(vDraweeView2, imageUriCalculatedWidth, str2);
                        }
                        vDraweeView2.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
                    }
                    vDraweeView2.getHierarchy().m112053H(RoundingParams.m8249c(4.0f).m8269w(RoundingParams.RoundingMethod.BITMAP_ONLY));
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
            xdl0.m208345M0(vRelative3, true);
            xdl0.m208344M(vRelative3.getChildAt(1), (!vwb.m200296J(moment.mediaRepeatIndexList) && moment.mediaRepeatIndexList.contains(Integer.valueOf(i2))) && nkg.m159845C0());
            if (vRelative3.getChildCount() >= 3 && NullChecker.m81303a(picture2.livePhoto) && nkg.m159911v0()) {
                m103712c(vRelative3.getChildAt(2), true);
            }
            f = f2;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(m103710a(), m103710a());
            vDraweeView3.getHierarchy().m112053H(RoundingParams.m8249c(f).m8269w(RoundingParams.RoundingMethod.BITMAP_ONLY));
            vRelative3.setLayoutParams(layoutParams);
            switch (i2) {
                case 1:
                    layoutParams.setMargins(t100.m186890d(FeedCenterImageView.f41817F) + m103710a(), 0, 0, 0);
                    break;
                case 2:
                    layoutParams.setMargins(t100.m186890d(FeedCenterImageView.f41817F * 2) + (m103710a() * 2), 0, 0, 0);
                    break;
                case 3:
                    layoutParams.setMargins(0, t100.m186890d(FeedCenterImageView.f41817F) + m103710a(), 0, 0);
                    break;
                case 4:
                    layoutParams.setMargins(t100.m186890d(FeedCenterImageView.f41817F) + m103710a(), t100.m186890d(FeedCenterImageView.f41817F) + m103710a(), 0, 0);
                    break;
                case 5:
                    layoutParams.setMargins(t100.m186890d(FeedCenterImageView.f41817F * 2) + (m103710a() * 2), t100.m186890d(FeedCenterImageView.f41817F) + m103710a(), 0, 0);
                    break;
                case 6:
                    layoutParams.setMargins(0, t100.m186890d(FeedCenterImageView.f41817F * 2) + (m103710a() * 2), 0, 0);
                    break;
                case 7:
                    layoutParams.setMargins(t100.m186890d(FeedCenterImageView.f41817F) + m103710a(), t100.m186890d(FeedCenterImageView.f41817F * 2) + (m103710a() * 2), 0, 0);
                    break;
                case 8:
                    layoutParams.setMargins(t100.m186890d(FeedCenterImageView.f41817F * 2) + (m103710a() * 2), t100.m186890d(FeedCenterImageView.f41817F * 2) + (m103710a() * 2), 0, 0);
                    break;
            }
            if (!TEnum.equals(picture2.status, "raw") && !TextUtils.isEmpty(picture2.url)) {
                Picture.ImageUri imageUriCalculatedWidth2 = picture2.calculatedWidth(t100.m186890d(FeedCenterImageView.f41817F) + (m103710a() * 2));
                if (m103713d(imageUriCalculatedWidth2)) {
                    if (vDraweeView3 instanceof AutoVDraweeView) {
                        ((AutoVDraweeView) vDraweeView3).m222884u();
                    }
                    qib0.f154691G.m102339P0(vDraweeView3, imageUriCalculatedWidth2, m103710a(), m103710a());
                } else {
                    if (vDraweeView3 instanceof AutoVDraweeView) {
                        ((AutoVDraweeView) vDraweeView3).setImageUrl(picture2.url);
                    } else {
                        qib0.f154691G.m102343R0(vDraweeView3, imageUriCalculatedWidth2, str);
                    }
                    vDraweeView3.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture2.url));
                }
                vDraweeView3.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture2.url));
            }
            if (NullChecker.m81303a(g30Var)) {
                g30Var.mo36055a(vDraweeView3, Integer.valueOf(i2), Integer.valueOf(i2));
            }
            i2++;
            f2 = f;
        }
    }
}
