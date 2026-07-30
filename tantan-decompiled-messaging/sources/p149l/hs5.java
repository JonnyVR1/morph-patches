package p149l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import com.idv.identity.ocr.compress.CompressConfig;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes7.dex */
public class hs5 {

    /* JADX INFO: renamed from: a */
    private CompressConfig f109291a;

    /* JADX INFO: renamed from: b */
    private Context f109292b;

    /* JADX INFO: renamed from: c */
    Handler f109293c = new Handler();

    /* JADX INFO: renamed from: l.hs5$a */
    public class RunnableC17382a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Bitmap f109294a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f109295b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC17384c f109296c;

        public RunnableC17382a(Bitmap bitmap, String str, InterfaceC17384c interfaceC17384c) {
            this.f109294a = bitmap;
            this.f109295b = str;
            this.f109296c = interfaceC17384c;
        }

        @Override // java.lang.Runnable
        public void run() {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i = 100;
            this.f109294a.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            while (byteArrayOutputStream.toByteArray().length > hs5.this.f109291a.getMaxSize()) {
                byteArrayOutputStream.reset();
                i -= 5;
                if (i <= 5) {
                    i = 5;
                }
                this.f109294a.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
                if (i == 5) {
                    break;
                }
            }
            try {
                File fileM132776g = hs5.this.m132776g(new File(this.f109295b));
                FileOutputStream fileOutputStream = new FileOutputStream(fileM132776g);
                fileOutputStream.write(byteArrayOutputStream.toByteArray());
                fileOutputStream.flush();
                fileOutputStream.close();
                hs5.this.m132777h(true, fileM132776g.getPath(), null, this.f109296c);
            } catch (Exception e) {
                hs5.this.m132777h(false, this.f109295b, "质量压缩失败", this.f109296c);
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: l.hs5$b */
    public class RunnableC17383b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f109298a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC17384c f109299b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f109300c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f109301d;

        public RunnableC17383b(boolean z, InterfaceC17384c interfaceC17384c, String str, String str2) {
            this.f109298a = z;
            this.f109299b = interfaceC17384c;
            this.f109300c = str;
            this.f109301d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = this.f109298a;
            InterfaceC17384c interfaceC17384c = this.f109299b;
            if (z) {
                interfaceC17384c.mo127783b(this.f109300c);
            } else {
                interfaceC17384c.mo127782a(this.f109300c, this.f109301d);
            }
        }
    }

    /* JADX INFO: renamed from: l.hs5$c */
    public interface InterfaceC17384c {
        /* JADX INFO: renamed from: a */
        void mo127782a(String str, String str2);

        /* JADX INFO: renamed from: b */
        void mo127783b(String str);
    }

    public hs5(Context context, CompressConfig compressConfig) {
        this.f109292b = context;
        this.f109291a = compressConfig == null ? CompressConfig.ofDefaultConfig() : compressConfig;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    /* JADX WARN: Code duplicated, block: B:21:0x0054  */
    /* JADX INFO: renamed from: e */
    private void m132774e(String str, InterfaceC17384c interfaceC17384c) throws FileNotFoundException {
        int i;
        int i2;
        Bitmap bitmapDecodeFile;
        if (str == null) {
            m132777h(false, str, "要压缩的文件不存在", interfaceC17384c);
            return;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inJustDecodeBounds = false;
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        float maxPixel = this.f109291a.getMaxPixel();
        if (i3 < i4 || i3 <= maxPixel) {
            if (i3 >= i4 || i4 <= maxPixel) {
                i = 1;
            } else {
                i2 = options.outHeight;
            }
            options.inSampleSize = i;
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            options.inPurgeable = true;
            options.inInputShareable = true;
            bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
            if (this.f109291a.isEnableQualityCompress()) {
                m132775f(bitmapDecodeFile, str, interfaceC17384c);
                return;
            }
            File fileM132776g = m132776g(new File(str));
            bitmapDecodeFile.compress(Bitmap.CompressFormat.JPEG, 100, new FileOutputStream(fileM132776g));
            interfaceC17384c.mo127783b(fileM132776g.getPath());
        }
        i2 = options.outWidth;
        i = ((int) (i2 / maxPixel)) + 1;
        options.inSampleSize = i;
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        options.inPurgeable = true;
        options.inInputShareable = true;
        bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
        if (this.f109291a.isEnableQualityCompress()) {
            m132775f(bitmapDecodeFile, str, interfaceC17384c);
            return;
        }
        File fileM132776g2 = m132776g(new File(str));
        bitmapDecodeFile.compress(Bitmap.CompressFormat.JPEG, 100, new FileOutputStream(fileM132776g2));
        interfaceC17384c.mo127783b(fileM132776g2.getPath());
    }

    /* JADX INFO: renamed from: f */
    private void m132775f(Bitmap bitmap, String str, InterfaceC17384c interfaceC17384c) {
        if (bitmap == null) {
            m132777h(false, str, "像素压缩失败,bitmap is null", interfaceC17384c);
        } else {
            new Thread(new RunnableC17382a(bitmap, str, interfaceC17384c)).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public File m132776g(File file) {
        return (file == null || !file.exists()) ? file : dkh0.m112224b(this.f109292b, file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m132777h(boolean z, String str, String str2, InterfaceC17384c interfaceC17384c) {
        this.f109293c.post(new RunnableC17383b(z, interfaceC17384c, str, str2));
    }

    /* JADX INFO: renamed from: d */
    public void m132778d(String str, InterfaceC17384c interfaceC17384c) {
        if (!this.f109291a.isEnablePixelCompress()) {
            m132775f(BitmapFactory.decodeFile(str), str, interfaceC17384c);
            return;
        }
        try {
            m132774e(str, interfaceC17384c);
        } catch (FileNotFoundException e) {
            interfaceC17384c.mo127782a(str, String.format("图片压缩失败,%s", e.toString()));
            e.printStackTrace();
        }
    }
}
