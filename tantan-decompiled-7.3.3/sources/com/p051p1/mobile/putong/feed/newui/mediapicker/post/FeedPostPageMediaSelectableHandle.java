package com.p051p1.mobile.putong.feed.newui.mediapicker.post;

import com.p051p1.mobile.putong.data.Audio;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p153l.o1j0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedPostPageMediaSelectableHandle {

    /* JADX INFO: renamed from: a */
    public static MomentMediaType f41466a;

    public enum MomentMediaType {
        ALBUM_PHOTO,
        SHOOT_PHOTO,
        ALBUM_VIDEO,
        SHOOT_VIDEO,
        AUDIO,
        NOTHING
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.FeedPostPageMediaSelectableHandle$a */
    public static /* synthetic */ class C11406a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f41467a;

        static {
            int[] iArr = new int[MomentMediaType.values().length];
            f41467a = iArr;
            try {
                iArr[MomentMediaType.SHOOT_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41467a[MomentMediaType.ALBUM_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41467a[MomentMediaType.AUDIO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41467a[MomentMediaType.SHOOT_PHOTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41467a[MomentMediaType.ALBUM_PHOTO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m63859a(ArrayList<Media> arrayList, Audio audio) {
        m63863e(arrayList, audio);
        int i = C11406a.f41467a[f41466a.ordinal()];
        if (i == 1 || i == 2) {
            o1j0.m165634h(R$string.f39915h0);
            return false;
        }
        if (i != 3) {
            return true;
        }
        o1j0.m165634h(R$string.f40022x2);
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m63860b(ArrayList<Media> arrayList, Audio audio) {
        m63863e(arrayList, audio);
        int i = C11406a.f41467a[f41466a.ordinal()];
        if (i == 1 || i == 2) {
            o1j0.m165634h(R$string.f40028y2);
            return false;
        }
        if (i == 3) {
            o1j0.m165634h(R$string.f39901f0);
            return false;
        }
        if (i != 4 && i != 5) {
            return true;
        }
        o1j0.m165634h(R$string.f40016w2);
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m63861c(ArrayList<Media> arrayList, Audio audio) {
        m63863e(arrayList, audio);
        int i = C11406a.f41467a[f41466a.ordinal()];
        if (i == 1 || i == 2) {
            o1j0.m165634h(R$string.f39915h0);
            return false;
        }
        if (i != 3) {
            return true;
        }
        o1j0.m165634h(R$string.f40022x2);
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static MomentMediaType m63862d(ArrayList<Media> arrayList, Audio audio) {
        if (NullChecker.m82486a(audio)) {
            return MomentMediaType.AUDIO;
        }
        if (arrayList.size() == 0) {
            return MomentMediaType.NOTHING;
        }
        Media media = arrayList.get(0);
        if (media instanceof Video) {
            return media.isFromShoot() ? MomentMediaType.SHOOT_VIDEO : MomentMediaType.ALBUM_VIDEO;
        }
        if (media instanceof Picture) {
            return media.isFromShoot() ? MomentMediaType.SHOOT_PHOTO : MomentMediaType.ALBUM_PHOTO;
        }
        return MomentMediaType.NOTHING;
    }

    /* JADX INFO: renamed from: e */
    public static void m63863e(ArrayList<Media> arrayList, Audio audio) {
        f41466a = m63862d(arrayList, audio);
    }
}
