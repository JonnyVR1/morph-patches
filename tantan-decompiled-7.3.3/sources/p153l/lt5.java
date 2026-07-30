package p153l;

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
public class lt5 {

    /* JADX INFO: renamed from: a */
    private CompressConfig f133515a;

    /* JADX INFO: renamed from: b */
    private Context f133516b;

    /* JADX INFO: renamed from: c */
    Handler f133517c = new Handler();

    /* JADX INFO: renamed from: l.lt5$a */
    public class RunnableC18455a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Bitmap f133518a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f133519b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC18457c f133520c;

        public RunnableC18455a(Bitmap bitmap, String str, InterfaceC18457c interfaceC18457c) {
            this.f133518a = bitmap;
            this.f133519b = str;
            this.f133520c = interfaceC18457c;
        }

        @Override // java.lang.Runnable
        public void run() {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i = 100;
            this.f133518a.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            while (byteArrayOutputStream.toByteArray().length > lt5.this.f133515a.getMaxSize()) {
                byteArrayOutputStream.reset();
                i -= 5;
                if (i <= 5) {
                    i = 5;
                }
                this.f133518a.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
                if (i == 5) {
                    break;
                }
            }
            try {
                File fileM155742g = lt5.this.m155742g(new File(this.f133519b));
                FileOutputStream fileOutputStream = new FileOutputStream(fileM155742g);
                fileOutputStream.write(byteArrayOutputStream.toByteArray());
                fileOutputStream.flush();
                fileOutputStream.close();
                lt5.this.m155743h(true, fileM155742g.getPath(), null, this.f133520c);
            } catch (Exception e) {
                lt5.this.m155743h(false, this.f133519b, "质量压缩失败", this.f133520c);
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: l.lt5$b */
    public class RunnableC18456b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f133522a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC18457c f133523b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f133524c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f133525d;

        public RunnableC18456b(boolean z, InterfaceC18457c interfaceC18457c, String str, String str2) {
            this.f133522a = z;
            this.f133523b = interfaceC18457c;
            this.f133524c = str;
            this.f133525d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = this.f133522a;
            InterfaceC18457c interfaceC18457c = this.f133523b;
            if (z) {
                interfaceC18457c.mo151333b(this.f133524c);
            } else {
                interfaceC18457c.mo151332a(this.f133524c, this.f133525d);
            }
        }
    }

    /* JADX INFO: renamed from: l.lt5$c */
    public interface InterfaceC18457c {
        /* JADX INFO: renamed from: a */
        void mo151332a(String str, String str2);

        /* JADX INFO: renamed from: b */
        void mo151333b(String str);
    }

    public lt5(Context context, CompressConfig compressConfig) {
        this.f133516b = context;
        this.f133515a = compressConfig == null ? CompressConfig.ofDefaultConfig() : compressConfig;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    /* JADX WARN: Code duplicated, block: B:21:0x0054  */
    /* JADX INFO: renamed from: e */
    private void m155740e(String str, InterfaceC18457c interfaceC18457c) throws FileNotFoundException {
        int i;
        int i2;
        Bitmap bitmapDecodeFile;
        if (str == null) {
            m155743h(false, str, "要压缩的文件不存在", interfaceC18457c);
            return;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inJustDecodeBounds = false;
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        float maxPixel = this.f133515a.getMaxPixel();
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
            if (this.f133515a.isEnableQualityCompress()) {
                m155741f(bitmapDecodeFile, str, interfaceC18457c);
                return;
            }
            File fileM155742g = m155742g(new File(str));
            bitmapDecodeFile.compress(Bitmap.CompressFormat.JPEG, 100, new FileOutputStream(fileM155742g));
            interfaceC18457c.mo151333b(fileM155742g.getPath());
        }
        i2 = options.outWidth;
        i = ((int) (i2 / maxPixel)) + 1;
        options.inSampleSize = i;
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        options.inPurgeable = true;
        options.inInputShareable = true;
        bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
        if (this.f133515a.isEnableQualityCompress()) {
            m155741f(bitmapDecodeFile, str, interfaceC18457c);
            return;
        }
        File fileM155742g2 = m155742g(new File(str));
        bitmapDecodeFile.compress(Bitmap.CompressFormat.JPEG, 100, new FileOutputStream(fileM155742g2));
        interfaceC18457c.mo151333b(fileM155742g2.getPath());
    }

    /* JADX INFO: renamed from: f */
    private void m155741f(Bitmap bitmap, String str, InterfaceC18457c interfaceC18457c) {
        if (bitmap == null) {
            m155743h(false, str, "像素压缩失败,bitmap is null", interfaceC18457c);
        } else {
            new Thread(new RunnableC18455a(bitmap, str, interfaceC18457c)).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public File m155742g(File file) {
        return (file == null || !file.exists()) ? file : ksh0.m151245b(this.f133516b, file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m155743h(boolean z, String str, String str2, InterfaceC18457c interfaceC18457c) {
        this.f133517c.post(new RunnableC18456b(z, interfaceC18457c, str, str2));
    }

    /* JADX INFO: renamed from: d */
    public void m155744d(String str, InterfaceC18457c interfaceC18457c) {
        if (!this.f133515a.isEnablePixelCompress()) {
            m155741f(BitmapFactory.decodeFile(str), str, interfaceC18457c);
            return;
        }
        try {
            m155740e(str, interfaceC18457c);
        } catch (FileNotFoundException e) {
            interfaceC18457c.mo151332a(str, String.format("图片压缩失败,%s", e.toString()));
            e.printStackTrace();
        }
    }
}
