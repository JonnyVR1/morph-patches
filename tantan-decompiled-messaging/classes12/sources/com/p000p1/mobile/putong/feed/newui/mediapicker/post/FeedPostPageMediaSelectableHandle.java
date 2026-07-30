package com.p000p1.mobile.putong.feed.newui.mediapicker.post;

import com.p000p1.mobile.putong.data.Audio;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.lsi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedPostPageMediaSelectableHandle {

    /* JADX INFO: renamed from: a */
    public static MomentMediaType f2079a;

    public enum MomentMediaType {
        ALBUM_PHOTO,
        SHOOT_PHOTO,
        ALBUM_VIDEO,
        SHOOT_VIDEO,
        AUDIO,
        NOTHING
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.FeedPostPageMediaSelectableHandle$a */
    public static /* synthetic */ class C2087a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f2080a;

        static {
            int[] iArr = new int[MomentMediaType.values().length];
            f2080a = iArr;
            try {
                iArr[MomentMediaType.SHOOT_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2080a[MomentMediaType.ALBUM_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2080a[MomentMediaType.AUDIO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2080a[MomentMediaType.SHOOT_PHOTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2080a[MomentMediaType.ALBUM_PHOTO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3681a(ArrayList<Media> arrayList, Audio audio) {
        m3685e(arrayList, audio);
        int i = C2087a.f2080a[f2079a.ordinal()];
        if (i == 1 || i == 2) {
            lsi0.h(R$string.f528h0);
            return false;
        }
        if (i != 3) {
            return true;
        }
        lsi0.h(R$string.f635x2);
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m3682b(ArrayList<Media> arrayList, Audio audio) {
        m3685e(arrayList, audio);
        int i = C2087a.f2080a[f2079a.ordinal()];
        if (i == 1 || i == 2) {
            lsi0.h(R$string.f641y2);
            return false;
        }
        if (i == 3) {
            lsi0.h(R$string.f514f0);
            return false;
        }
        if (i != 4 && i != 5) {
            return true;
        }
        lsi0.h(R$string.f629w2);
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m3683c(ArrayList<Media> arrayList, Audio audio) {
        m3685e(arrayList, audio);
        int i = C2087a.f2080a[f2079a.ordinal()];
        if (i == 1 || i == 2) {
            lsi0.h(R$string.f528h0);
            return false;
        }
        if (i != 3) {
            return true;
        }
        lsi0.h(R$string.f635x2);
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static MomentMediaType m3684d(ArrayList<Media> arrayList, Audio audio) {
        if (NullChecker.a(audio)) {
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
    public static void m3685e(ArrayList<Media> arrayList, Audio audio) {
        f2079a = m3684d(arrayList, audio);
    }
}
