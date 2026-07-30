package p149l;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;

/* JADX INFO: loaded from: classes8.dex */
public class r5l0 {

    /* JADX INFO: renamed from: a */
    public String f157830a;

    /* JADX INFO: renamed from: b */
    public long f157831b;

    /* JADX INFO: renamed from: c */
    public int f157832c;

    /* JADX INFO: renamed from: d */
    public int f157833d;

    /* JADX INFO: renamed from: e */
    public String f157834e;

    /* JADX INFO: renamed from: f */
    public int f157835f;

    /* JADX INFO: renamed from: g */
    public boolean f157836g;

    /* JADX INFO: renamed from: h */
    public int f157837h;

    /* JADX INFO: renamed from: i */
    public long f157838i;

    public r5l0(String str) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                try {
                    mediaMetadataRetriever.setDataSource(str);
                    this.f157831b = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
                    this.f157834e = mediaMetadataRetriever.extractMetadata(12);
                    this.f157836g = "yes".equals(mediaMetadataRetriever.extractMetadata(16));
                    String strExtractMetadata = mediaMetadataRetriever.extractMetadata(24);
                    if (strExtractMetadata != null) {
                        this.f157835f = Integer.parseInt(strExtractMetadata);
                    }
                    Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime();
                    if (frameAtTime != null) {
                        this.f157832c = frameAtTime.getWidth();
                        this.f157833d = frameAtTime.getHeight();
                        frameAtTime.recycle();
                        int i = this.f157835f;
                        if (i == 90 || i == 270) {
                            int i2 = this.f157832c;
                            this.f157832c = this.f157833d;
                            this.f157833d = i2;
                        }
                    } else {
                        this.f157832c = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                        this.f157833d = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                    }
                    this.f157837h = Integer.parseInt(mediaMetadataRetriever.extractMetadata(20));
                    File file = new File(str);
                    if (file.exists()) {
                        this.f157838i = file.length();
                    }
                    this.f157830a = str;
                    mediaMetadataRetriever.release();
                } catch (Throwable th) {
                    try {
                        mediaMetadataRetriever.release();
                    } catch (Exception unused) {
                    }
                    throw th;
                }
            } catch (Exception e) {
                CrashHelper.m81296c(new Exception("VideoInfo exception:" + e.getMessage(), e));
                mediaMetadataRetriever.release();
            }
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m177946a() {
        if (this.f157830a == null || this.f157832c <= 0 || this.f157833d <= 0) {
            upk0.m194883a("Bad or not supported video");
        }
    }
}
