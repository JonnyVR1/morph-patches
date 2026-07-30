package com.p046p1.mobile.putong.feed.newui.mediapicker.post;

import com.p046p1.mobile.putong.data.Audio;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p149l.lsi0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedPostPageMediaSelectableHandle {

    /* JADX INFO: renamed from: a */
    public static MomentMediaType f40618a;

    public enum MomentMediaType {
        ALBUM_PHOTO,
        SHOOT_PHOTO,
        ALBUM_VIDEO,
        SHOOT_VIDEO,
        AUDIO,
        NOTHING
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.FeedPostPageMediaSelectableHandle$a */
    public static /* synthetic */ class C11243a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f40619a;

        static {
            int[] iArr = new int[MomentMediaType.values().length];
            f40619a = iArr;
            try {
                iArr[MomentMediaType.SHOOT_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40619a[MomentMediaType.ALBUM_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40619a[MomentMediaType.AUDIO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40619a[MomentMediaType.SHOOT_PHOTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f40619a[MomentMediaType.ALBUM_PHOTO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m62676a(ArrayList<Media> arrayList, Audio audio) {
        m62680e(arrayList, audio);
        int i = C11243a.f40619a[f40618a.ordinal()];
        if (i == 1 || i == 2) {
            lsi0.m151578h(R$string.f39067h0);
            return false;
        }
        if (i != 3) {
            return true;
        }
        lsi0.m151578h(R$string.f39174x2);
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m62677b(ArrayList<Media> arrayList, Audio audio) {
        m62680e(arrayList, audio);
        int i = C11243a.f40619a[f40618a.ordinal()];
        if (i == 1 || i == 2) {
            lsi0.m151578h(R$string.f39180y2);
            return false;
        }
        if (i == 3) {
            lsi0.m151578h(R$string.f39053f0);
            return false;
        }
        if (i != 4 && i != 5) {
            return true;
        }
        lsi0.m151578h(R$string.f39168w2);
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m62678c(ArrayList<Media> arrayList, Audio audio) {
        m62680e(arrayList, audio);
        int i = C11243a.f40619a[f40618a.ordinal()];
        if (i == 1 || i == 2) {
            lsi0.m151578h(R$string.f39067h0);
            return false;
        }
        if (i != 3) {
            return true;
        }
        lsi0.m151578h(R$string.f39174x2);
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static MomentMediaType m62679d(ArrayList<Media> arrayList, Audio audio) {
        if (NullChecker.m81303a(audio)) {
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
    public static void m62680e(ArrayList<Media> arrayList, Audio audio) {
        f40618a = m62679d(arrayList, audio);
    }
}
