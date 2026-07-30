package p153l;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;

/* JADX INFO: loaded from: classes8.dex */
public class vel0 {

    /* JADX INFO: renamed from: a */
    public String f183805a;

    /* JADX INFO: renamed from: b */
    public long f183806b;

    /* JADX INFO: renamed from: c */
    public int f183807c;

    /* JADX INFO: renamed from: d */
    public int f183808d;

    /* JADX INFO: renamed from: e */
    public String f183809e;

    /* JADX INFO: renamed from: f */
    public int f183810f;

    /* JADX INFO: renamed from: g */
    public boolean f183811g;

    /* JADX INFO: renamed from: h */
    public int f183812h;

    /* JADX INFO: renamed from: i */
    public long f183813i;

    public vel0(String str) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                try {
                    mediaMetadataRetriever.setDataSource(str);
                    this.f183806b = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
                    this.f183809e = mediaMetadataRetriever.extractMetadata(12);
                    this.f183811g = "yes".equals(mediaMetadataRetriever.extractMetadata(16));
                    String strExtractMetadata = mediaMetadataRetriever.extractMetadata(24);
                    if (strExtractMetadata != null) {
                        this.f183810f = Integer.parseInt(strExtractMetadata);
                    }
                    Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime();
                    if (frameAtTime != null) {
                        this.f183807c = frameAtTime.getWidth();
                        this.f183808d = frameAtTime.getHeight();
                        frameAtTime.recycle();
                        int i = this.f183810f;
                        if (i == 90 || i == 270) {
                            int i2 = this.f183807c;
                            this.f183807c = this.f183808d;
                            this.f183808d = i2;
                        }
                    } else {
                        this.f183807c = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                        this.f183808d = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                    }
                    this.f183812h = Integer.parseInt(mediaMetadataRetriever.extractMetadata(20));
                    File file = new File(str);
                    if (file.exists()) {
                        this.f183813i = file.length();
                    }
                    this.f183805a = str;
                    mediaMetadataRetriever.release();
                } catch (Throwable th) {
                    try {
                        mediaMetadataRetriever.release();
                    } catch (Exception unused) {
                    }
                    throw th;
                }
            } catch (Exception e) {
                CrashHelper.m82479c(new Exception("VideoInfo exception:" + e.getMessage(), e));
                mediaMetadataRetriever.release();
            }
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m201068a() {
        if (this.f183805a == null || this.f183807c <= 0 || this.f183808d <= 0) {
            azk0.m101074a("Bad or not supported video");
        }
    }
}
