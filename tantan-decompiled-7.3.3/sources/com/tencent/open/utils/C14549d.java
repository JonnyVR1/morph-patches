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
public class C14549d {

    /* JADX INFO: renamed from: c */
    private static String f61166c;

    /* JADX INFO: renamed from: a */
    private String f61167a;

    /* JADX INFO: renamed from: b */
    private InterfaceC14550e f61168b;

    /* JADX INFO: renamed from: d */
    private long f61169d;

    /* JADX INFO: renamed from: e */
    private Handler f61170e;

    /* JADX INFO: renamed from: f */
    private WeakReference<Activity> f61171f;

    /* JADX INFO: renamed from: g */
    private Runnable f61172g = new Runnable() { // from class: com.tencent.open.utils.d.2
        @Override // java.lang.Runnable
        public void run() throws Throwable {
            boolean zM85576a;
            SLog.m85496v("AsynLoadImg", "saveFileRunnable:");
            String str = "share_qq_" + C14559n.m85686g(C14549d.this.f61167a) + ".jpg";
            String str2 = C14549d.f61166c + str;
            File file = new File(str2);
            Message messageObtainMessage = C14549d.this.f61170e.obtainMessage();
            if (file.exists()) {
                messageObtainMessage.arg1 = 0;
                messageObtainMessage.obj = str2;
                SLog.m85496v("AsynLoadImg", "file exists: time:" + (System.currentTimeMillis() - C14549d.this.f61169d));
            } else {
                Bitmap bitmapM85569a = C14549d.m85569a(C14549d.this.f61167a);
                if (bitmapM85569a != null) {
                    zM85576a = C14549d.this.m85576a(bitmapM85569a, str);
                } else {
                    SLog.m85496v("AsynLoadImg", "saveFileRunnable:get bmp fail---");
                    zM85576a = false;
                }
                if (zM85576a) {
                    messageObtainMessage.arg1 = 0;
                    messageObtainMessage.obj = str2;
                } else {
                    messageObtainMessage.arg1 = 1;
                }
                SLog.m85496v("AsynLoadImg", "file not exists: download time:" + (System.currentTimeMillis() - C14549d.this.f61169d));
            }
            C14549d.this.f61170e.sendMessage(messageObtainMessage);
        }
    };

    public C14549d(Activity activity) {
        this.f61171f = new WeakReference<>(activity);
        this.f61170e = new Handler(activity.getMainLooper()) { // from class: com.tencent.open.utils.d.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                SLog.m85496v("AsynLoadImg", "handleMessage:" + message.arg1);
                int i = message.arg1;
                C14549d c14549d = C14549d.this;
                if (i == 0) {
                    c14549d.f61168b.mo83353a(message.arg1, (String) message.obj);
                } else {
                    c14549d.f61168b.mo83353a(message.arg1, (String) null);
                }
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public void m85575a(String str, InterfaceC14550e interfaceC14550e) {
        SLog.m85496v("AsynLoadImg", "--save---");
        if (str == null || str.equals("")) {
            interfaceC14550e.mo83353a(1, (String) null);
            return;
        }
        if (!C14559n.m85660a()) {
            interfaceC14550e.mo83353a(2, (String) null);
            return;
        }
        if (this.f61171f.get() != null) {
            Activity activity = this.f61171f.get();
            File fileM85689h = C14559n.m85689h(activity, "Images");
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (fileM85689h == null) {
                SLog.m85490e("AsynLoadImg", "externalImageFile is null");
                interfaceC14550e.mo83353a(2, (String) null);
                return;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(C14557l.m85632d(activity) ? fileM85689h.getAbsolutePath() : externalStorageDirectory.getAbsolutePath());
                sb.append("/tmp/");
                f61166c = sb.toString();
            }
        }
        this.f61169d = System.currentTimeMillis();
        this.f61167a = str;
        this.f61168b = interfaceC14550e;
        new Thread(this.f61172g).start();
    }

    /* JADX INFO: renamed from: a */
    public boolean m85576a(Bitmap bitmap, String str) throws Throwable {
        String str2 = f61166c;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                File file = new File(str2);
                if (!file.exists()) {
                    file.mkdir();
                }
                SLog.m85496v("AsynLoadImg", "saveFile:" + str);
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
                    SLog.m85491e("AsynLoadImg", "saveFile bmp fail---", e);
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
    public static Bitmap m85569a(String str) {
        SLog.m85496v("AsynLoadImg", "getbitmap:" + str);
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            InputStream inputStream = httpURLConnection.getInputStream();
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream);
            inputStream.close();
            SLog.m85496v("AsynLoadImg", "image download finished." + str);
            return bitmapDecodeStream;
        } catch (IOException e) {
            e.printStackTrace();
            SLog.m85496v("AsynLoadImg", "getbitmap bmp fail---");
            return null;
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
            SLog.m85496v("AsynLoadImg", "getbitmap bmp fail---");
            return null;
        }
    }
}
