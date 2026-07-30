package p007l;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import l.upk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class r5l0 {

    /* JADX INFO: renamed from: a */
    public String f4050a;

    /* JADX INFO: renamed from: b */
    public long f4051b;

    /* JADX INFO: renamed from: c */
    public int f4052c;

    /* JADX INFO: renamed from: d */
    public int f4053d;

    /* JADX INFO: renamed from: e */
    public String f4054e;

    /* JADX INFO: renamed from: f */
    public int f4055f;

    /* JADX INFO: renamed from: g */
    public boolean f4056g;

    /* JADX INFO: renamed from: h */
    public int f4057h;

    /* JADX INFO: renamed from: i */
    public long f4058i;

    public r5l0(String str) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                try {
                    mediaMetadataRetriever.setDataSource(str);
                    this.f4051b = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
                    this.f4054e = mediaMetadataRetriever.extractMetadata(12);
                    this.f4056g = "yes".equals(mediaMetadataRetriever.extractMetadata(16));
                    String strExtractMetadata = mediaMetadataRetriever.extractMetadata(24);
                    if (strExtractMetadata != null) {
                        this.f4055f = Integer.parseInt(strExtractMetadata);
                    }
                    Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime();
                    if (frameAtTime != null) {
                        this.f4052c = frameAtTime.getWidth();
                        this.f4053d = frameAtTime.getHeight();
                        frameAtTime.recycle();
                        int i = this.f4055f;
                        if (i == 90 || i == 270) {
                            int i2 = this.f4052c;
                            this.f4052c = this.f4053d;
                            this.f4053d = i2;
                        }
                    } else {
                        this.f4052c = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                        this.f4053d = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                    }
                    this.f4057h = Integer.parseInt(mediaMetadataRetriever.extractMetadata(20));
                    File file = new File(str);
                    if (file.exists()) {
                        this.f4058i = file.length();
                    }
                    this.f4050a = str;
                    mediaMetadataRetriever.release();
                } catch (Throwable th) {
                    try {
                        mediaMetadataRetriever.release();
                    } catch (Exception unused) {
                    }
                    throw th;
                }
            } catch (Exception e) {
                CrashHelper.c(new Exception("VideoInfo exception:" + e.getMessage(), e));
                mediaMetadataRetriever.release();
            }
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m10552a() {
        if (this.f4050a == null || this.f4052c <= 0 || this.f4053d <= 0) {
            upk0.a("Bad or not supported video");
        }
    }
}
