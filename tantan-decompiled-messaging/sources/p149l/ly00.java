package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import java.util.List;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ly00 {

    /* JADX INFO: renamed from: a */
    public final long f130484a;

    /* JADX INFO: renamed from: b */
    public final List<C18349a> f130485b;

    /* JADX INFO: renamed from: l.ly00$a */
    public static final class C18349a {

        /* JADX INFO: renamed from: a */
        public final String f130486a;

        /* JADX INFO: renamed from: b */
        public final String f130487b;

        /* JADX INFO: renamed from: c */
        public final long f130488c;

        /* JADX INFO: renamed from: d */
        public final long f130489d;

        public C18349a(String str, String str2, long j, long j2) {
            this.f130486a = str;
            this.f130487b = str2;
            this.f130488c = j;
            this.f130489d = j2;
        }
    }

    public ly00(long j, List<C18349a> list) {
        this.f130484a = j;
        this.f130485b = list;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public MotionPhotoMetadata m152116a(long j) {
        long j2;
        if (this.f130485b.size() < 2) {
            return null;
        }
        long j3 = j;
        long j4 = -1;
        long j5 = -1;
        long j6 = -1;
        long j7 = -1;
        boolean z = false;
        for (int size = this.f130485b.size() - 1; size >= 0; size--) {
            C18349a c18349a = this.f130485b.get(size);
            boolean zEquals = DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4.equals(c18349a.f130486a) | z;
            if (size == 0) {
                j3 -= c18349a.f130489d;
                j2 = 0;
            } else {
                j2 = j3 - c18349a.f130488c;
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
        return new MotionPhotoMetadata(j4, j5, this.f130484a, j6, j7);
    }
}
