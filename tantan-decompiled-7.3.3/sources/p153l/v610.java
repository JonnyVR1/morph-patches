package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import java.util.List;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class v610 {

    /* JADX INFO: renamed from: a */
    public final long f182594a;

    /* JADX INFO: renamed from: b */
    public final List<C20768a> f182595b;

    /* JADX INFO: renamed from: l.v610$a */
    public static final class C20768a {

        /* JADX INFO: renamed from: a */
        public final String f182596a;

        /* JADX INFO: renamed from: b */
        public final String f182597b;

        /* JADX INFO: renamed from: c */
        public final long f182598c;

        /* JADX INFO: renamed from: d */
        public final long f182599d;

        public C20768a(String str, String str2, long j, long j2) {
            this.f182596a = str;
            this.f182597b = str2;
            this.f182598c = j;
            this.f182599d = j2;
        }
    }

    public v610(long j, List<C20768a> list) {
        this.f182594a = j;
        this.f182595b = list;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public MotionPhotoMetadata m199962a(long j) {
        long j2;
        if (this.f182595b.size() < 2) {
            return null;
        }
        long j3 = j;
        long j4 = -1;
        long j5 = -1;
        long j6 = -1;
        long j7 = -1;
        boolean z = false;
        for (int size = this.f182595b.size() - 1; size >= 0; size--) {
            C20768a c20768a = this.f182595b.get(size);
            boolean zEquals = DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4.equals(c20768a.f182596a) | z;
            if (size == 0) {
                j3 -= c20768a.f182599d;
                j2 = 0;
            } else {
                j2 = j3 - c20768a.f182598c;
            }
            long j8 = j2;
            long j9 = j3;
            j3 = j8;
            if (!zEquals || j3 == j9) {
                z = zEquals;
            } else {
                j7 = j9 - j3;
                j6 = j3;
                z = false;
            }
            if (size == 0) {
                j4 = j3;
                j5 = j9;
            }
        }
        if (j6 == -1 || j7 == -1 || j4 == -1 || j5 == -1) {
            return null;
        }
        return new MotionPhotoMetadata(j4, j5, this.f182594a, j6, j7);
    }
}
