package p007l;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.p000p1.mobile.putong.data.Dimension;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.MediaLocalStatus;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterImageView;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.eew;
import l.g30;
import l.qib0;
import l.t100;
import l.vwb;
import l.xdl0;
import org.json.JSONObject;
import v.AutoVDraweeView;
import v.VDraweeView;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class bsg {
    /* JADX INFO: renamed from: a */
    public static int m9023a() {
        return n8i.m12109c(n8i.f10701c, n8i.f10702d);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0036 A[PHI: r3
      0x0036: PHI (r3v19 int) = (r3v15 int), (r3v21 int) binds: [B:17:0x0047, B:11:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x0038 A[PHI: r3
      0x0038: PHI (r3v16 int) = (r3v15 int), (r3v21 int) binds: [B:17:0x0047, B:11:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x0057  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX INFO: renamed from: b */
    public static Dimension m9024b(Picture picture, boolean z) {
        Dimension dimension;
        int i;
        int iM9023a = (m9023a() * 2) + t100.d(FeedCenterImageView.f3278F);
        if (NullChecker.b(picture.size)) {
            dimension = picture.size;
            if (dimension.height <= 0) {
                dimension = new Dimension(iM9023a, iM9023a);
            }
        } else {
            dimension = new Dimension(iM9023a, iM9023a);
        }
        float f = dimension.width / dimension.height;
        if (f <= 0.7f) {
            i = (iM9023a * 9) / 16;
            if (z) {
                iM9023a = i;
            } else {
                iM9023a = i;
                i = iM9023a;
            }
        } else if (f <= 0.83f) {
            i = (iM9023a * 3) / 4;
            if (z) {
                iM9023a = i;
            } else {
                iM9023a = i;
                i = iM9023a;
            }
        } else if (f >= 1.2f) {
            i = (iM9023a * 3) / 4;
            if (z) {
                i = iM9023a;
            }
        } else {
            i = iM9023a;
        }
        return new Dimension(iM9023a, i);
    }

    /* JADX INFO: renamed from: c */
    public static void m9025c(View view, boolean z) {
        if (NullChecker.a(view)) {
            xdl0.M(view, z);
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m9026d(Picture.ImageUri imageUri) {
        try {
            JSONObject jSONObject = new JSONObject(RemoteConfig.x().F("community_optimization_long_graphic"));
            int iOptInt = jSONObject.optInt("horizontal_ratio", 1);
            int iOptInt2 = jSONObject.optInt("vertical_ratio", 1);
            Dimension dimension = imageUri.orignalDimen;
            float f = dimension.height / dimension.width;
            if (f >= 2.0f && f <= iOptInt2) {
                return !eew.h(App.e);
            }
            if (f >= 1.0f / iOptInt && f <= 0.33333334f) {
                return !eew.h(App.e);
            }
            return false;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m9027e(Moment moment, List<Media> list, FrameLayout frameLayout, String str, g30 g30Var) {
        m9028f(moment, list, frameLayout, str, false, g30Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m9028f(Moment moment, List<Media> list, FrameLayout frameLayout, String str, boolean z, g30 g30Var) {
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
            m9025c(frameLayout.getChildAt(i), false);
            if (frameLayout.getChildAt(i) instanceof VRelative) {
                VRelative childAt = frameLayout.getChildAt(i);
                m9025c(childAt, false);
                VDraweeView childAt2 = childAt.getChildAt(0);
                if (childAt2 instanceof VDraweeView) {
                    VDraweeView vDraweeView = childAt2;
                    qib0.G.o(vDraweeView);
                    vDraweeView.setOnClickListener(null);
                    childAt2.setOnClickListener(null);
                    vDraweeView.setZoomAnimationKey((String) null);
                }
                m9025c(childAt.getChildAt(1), false);
                if (childAt.getChildCount() >= 3) {
                    m9025c(childAt.getChildAt(2), false);
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
            if (NullChecker.b(picture)) {
                VRelative childAt3 = frameLayout.getChildAt(0);
                AutoVDraweeView childAt4 = childAt3.getChildAt(0);
                boolean z4 = !vwb.J(moment.mediaRepeatIndexList) && moment.mediaRepeatIndexList.contains(0);
                View childAt5 = childAt3.getChildAt(1);
                if (z4 && nkg.m12204C0()) {
                    z2 = true;
                }
                xdl0.M(childAt5, z2);
                xdl0.M0(childAt3, true);
                if (childAt3.getChildCount() >= 3 && NullChecker.a(picture.livePhoto) && nkg.m12270v0()) {
                    m9025c(childAt3.getChildAt(2), true);
                }
                Dimension dimensionM9024b = m9024b(picture, z);
                childAt3.setLayoutParams(new FrameLayout.LayoutParams(dimensionM9024b.width, dimensionM9024b.height));
                if (childAt4 instanceof VDraweeView) {
                    AutoVDraweeView autoVDraweeView = (VDraweeView) childAt4;
                    if (NullChecker.a(g30Var)) {
                        g30Var.a(autoVDraweeView, 0, 0);
                    }
                    if (!TEnum.equals(picture.status, MediaLocalStatus.raw) && !TextUtils.isEmpty(picture.url)) {
                        String str2 = z3 ? "" : str;
                        Picture.ImageUri imageUriCalculatedWidth = picture.calculatedWidth(t100.d(FeedCenterImageView.f3278F) + (m9023a() * 2));
                        if (m9026d(imageUriCalculatedWidth)) {
                            if (autoVDraweeView instanceof AutoVDraweeView) {
                                autoVDraweeView.u();
                            }
                            qib0.G.P0(autoVDraweeView, imageUriCalculatedWidth, dimensionM9024b.width, dimensionM9024b.height);
                        } else if (autoVDraweeView instanceof AutoVDraweeView) {
                            autoVDraweeView.setImageUrl(picture.url);
                        } else {
                            qib0.G.R0(autoVDraweeView, imageUriCalculatedWidth, str2);
                        }
                        autoVDraweeView.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
                    }
                    autoVDraweeView.getHierarchy().H(RoundingParams.c(4.0f).w(RoundingParams.RoundingMethod.BITMAP_ONLY));
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
            VRelative childAt6 = frameLayout.getChildAt(i2);
            if (!(childAt6.getChildAt(0) instanceof VDraweeView)) {
                return;
            }
            AutoVDraweeView autoVDraweeView2 = (VDraweeView) childAt6.getChildAt(0);
            xdl0.M0(childAt6, true);
            xdl0.M(childAt6.getChildAt(1), (!vwb.J(moment.mediaRepeatIndexList) && moment.mediaRepeatIndexList.contains(Integer.valueOf(i2))) && nkg.m12204C0());
            if (childAt6.getChildCount() >= 3 && NullChecker.a(picture2.livePhoto) && nkg.m12270v0()) {
                m9025c(childAt6.getChildAt(2), true);
            }
            f = f2;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(m9023a(), m9023a());
            autoVDraweeView2.getHierarchy().H(RoundingParams.c(f).w(RoundingParams.RoundingMethod.BITMAP_ONLY));
            childAt6.setLayoutParams(layoutParams);
            switch (i2) {
                case 1:
                    layoutParams.setMargins(t100.d(FeedCenterImageView.f3278F) + m9023a(), 0, 0, 0);
                    break;
                case 2:
                    layoutParams.setMargins(t100.d(FeedCenterImageView.f3278F * 2) + (m9023a() * 2), 0, 0, 0);
                    break;
                case 3:
                    layoutParams.setMargins(0, t100.d(FeedCenterImageView.f3278F) + m9023a(), 0, 0);
                    break;
                case 4:
                    layoutParams.setMargins(t100.d(FeedCenterImageView.f3278F) + m9023a(), t100.d(FeedCenterImageView.f3278F) + m9023a(), 0, 0);
                    break;
                case 5:
                    layoutParams.setMargins(t100.d(FeedCenterImageView.f3278F * 2) + (m9023a() * 2), t100.d(FeedCenterImageView.f3278F) + m9023a(), 0, 0);
                    break;
                case 6:
                    layoutParams.setMargins(0, t100.d(FeedCenterImageView.f3278F * 2) + (m9023a() * 2), 0, 0);
                    break;
                case 7:
                    layoutParams.setMargins(t100.d(FeedCenterImageView.f3278F) + m9023a(), t100.d(FeedCenterImageView.f3278F * 2) + (m9023a() * 2), 0, 0);
                    break;
                case 8:
                    layoutParams.setMargins(t100.d(FeedCenterImageView.f3278F * 2) + (m9023a() * 2), t100.d(FeedCenterImageView.f3278F * 2) + (m9023a() * 2), 0, 0);
                    break;
            }
            if (!TEnum.equals(picture2.status, MediaLocalStatus.raw) && !TextUtils.isEmpty(picture2.url)) {
                Picture.ImageUri imageUriCalculatedWidth2 = picture2.calculatedWidth(t100.d(FeedCenterImageView.f3278F) + (m9023a() * 2));
                if (m9026d(imageUriCalculatedWidth2)) {
                    if (autoVDraweeView2 instanceof AutoVDraweeView) {
                        autoVDraweeView2.u();
                    }
                    qib0.G.P0(autoVDraweeView2, imageUriCalculatedWidth2, m9023a(), m9023a());
                } else {
                    if (autoVDraweeView2 instanceof AutoVDraweeView) {
                        autoVDraweeView2.setImageUrl(picture2.url);
                    } else {
                        qib0.G.R0(autoVDraweeView2, imageUriCalculatedWidth2, str);
                    }
                    autoVDraweeView2.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture2.url));
                }
                autoVDraweeView2.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture2.url));
            }
            if (NullChecker.a(g30Var)) {
                g30Var.a(autoVDraweeView2, Integer.valueOf(i2), Integer.valueOf(i2));
            }
            i2++;
            f2 = f;
        }
    }
}
