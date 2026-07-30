package com.tencent.open.utils;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import com.tencent.open.log.SLog;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: renamed from: com.tencent.open.utils.d */
/* JADX INFO: loaded from: classes2.dex */
public class C14386d {

    /* JADX INFO: renamed from: c */
    private static String f60318c;

    /* JADX INFO: renamed from: a */
    private String f60319a;

    /* JADX INFO: renamed from: b */
    private InterfaceC14387e f60320b;

    /* JADX INFO: renamed from: d */
    private long f60321d;

    /* JADX INFO: renamed from: e */
    private Handler f60322e;

    /* JADX INFO: renamed from: f */
    private WeakReference<Activity> f60323f;

    /* JADX INFO: renamed from: g */
    private Runnable f60324g = new Runnable() { // from class: com.tencent.open.utils.d.2
        @Override // java.lang.Runnable
        public void run() throws Throwable {
            boolean zM84393a;
            SLog.m84313v("AsynLoadImg", "saveFileRunnable:");
            String str = "share_qq_" + C14396n.m84503g(C14386d.this.f60319a) + ".jpg";
            String str2 = C14386d.f60318c + str;
            File file = new File(str2);
            Message messageObtainMessage = C14386d.this.f60322e.obtainMessage();
            if (file.exists()) {
                messageObtainMessage.arg1 = 0;
                messageObtainMessage.obj = str2;
                SLog.m84313v("AsynLoadImg", "file exists: time:" + (System.currentTimeMillis() - C14386d.this.f60321d));
            } else {
                Bitmap bitmapM84386a = C14386d.m84386a(C14386d.this.f60319a);
                if (bitmapM84386a != null) {
                    zM84393a = C14386d.this.m84393a(bitmapM84386a, str);
                } else {
                    SLog.m84313v("AsynLoadImg", "saveFileRunnable:get bmp fail---");
                    zM84393a = false;
                }
                if (zM84393a) {
                    messageObtainMessage.arg1 = 0;
                    messageObtainMessage.obj = str2;
                } else {
                    messageObtainMessage.arg1 = 1;
                }
                SLog.m84313v("AsynLoadImg", "file not exists: download time:" + (System.currentTimeMillis() - C14386d.this.f60321d));
            }
            C14386d.this.f60322e.sendMessage(messageObtainMessage);
        }
    };

    public C14386d(Activity activity) {
        this.f60323f = new WeakReference<>(activity);
        this.f60322e = new Handler(activity.getMainLooper()) { // from class: com.tencent.open.utils.d.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                SLog.m84313v("AsynLoadImg", "handleMessage:" + message.arg1);
                int i = message.arg1;
                C14386d c14386d = C14386d.this;
                if (i == 0) {
                    c14386d.f60320b.mo82170a(message.arg1, (String) message.obj);
                } else {
                    c14386d.f60320b.mo82170a(message.arg1, (String) null);
                }
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public void m84392a(String str, InterfaceC14387e interfaceC14387e) {
        SLog.m84313v("AsynLoadImg", "--save---");
        if (str == null || str.equals("")) {
            interfaceC14387e.mo82170a(1, (String) null);
            return;
        }
        if (!C14396n.m84477a()) {
            interfaceC14387e.mo82170a(2, (String) null);
            return;
        }
        if (this.f60323f.get() != null) {
            Activity activity = this.f60323f.get();
            File fileM84506h = C14396n.m84506h(activity, "Images");
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (fileM84506h == null) {
                SLog.m84307e("AsynLoadImg", "externalImageFile is null");
                interfaceC14387e.mo82170a(2, (String) null);
                return;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(C14394l.m84449d(activity) ? fileM84506h.getAbsolutePath() : externalStorageDirectory.getAbsolutePath());
                sb.append("/tmp/");
                f60318c = sb.toString();
            }
        }
        this.f60321d = System.currentTimeMillis();
        this.f60319a = str;
        this.f60320b = interfaceC14387e;
        new Thread(this.f60324g).start();
    }

    /* JADX INFO: renamed from: a */
    public boolean m84393a(Bitmap bitmap, String str) throws Throwable {
        String str2 = f60318c;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                File file = new File(str2);
                if (!file.exists()) {
                    file.mkdir();
                }
                SLog.m84313v("AsynLoadImg", "saveFile:" + str);
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(new File(str2 + str)));
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 80, bufferedOutputStream2);
                    bufferedOutputStream2.flush();
                    try {
                        bufferedOutputStream2.close();
                        return true;
                    } catch (IOException e) {
                        e.printStackTrace();
                        return true;
                    }
                } catch (IOException e2) {
                    e = e2;
                    bufferedOutputStream = bufferedOutputStream2;
                    e.printStackTrace();
                    SLog.m84308e("AsynLoadImg", "saveFile bmp fail---", e);
                    if (bufferedOutputStream == null) {
                        return false;
                    }
                    try {
                        bufferedOutputStream.close();
                        return false;
                    } catch (IOException e3) {
                        e3.printStackTrace();
                        return false;
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = bufferedOutputStream2;
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (IOException e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Bitmap m84386a(String str) {
        SLog.m84313v("AsynLoadImg", "getbitmap:" + str);
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            InputStream inputStream = httpURLConnection.getInputStream();
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream);
            inputStream.close();
            SLog.m84313v("AsynLoadImg", "image download finished." + str);
            return bitmapDecodeStream;
        } catch (IOException e) {
            e.printStackTrace();
            SLog.m84313v("AsynLoadImg", "getbitmap bmp fail---");
            return null;
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
            SLog.m84313v("AsynLoadImg", "getbitmap bmp fail---");
            return null;
        }
    }
}
