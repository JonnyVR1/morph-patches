package com.vivo.push.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.vivo.push.C14617m;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.p113d.C14599r;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.vivo.push.util.k */
/* JADX INFO: loaded from: classes2.dex */
public final class AsyncTaskC14642k extends AsyncTask<String, Void, List<Bitmap>> {

    /* JADX INFO: renamed from: a */
    private Context f61121a;

    /* JADX INFO: renamed from: b */
    private InsideNotificationItem f61122b;

    /* JADX INFO: renamed from: c */
    private long f61123c;

    /* JADX INFO: renamed from: d */
    private boolean f61124d;

    /* JADX INFO: renamed from: e */
    private int f61125e = 0;

    /* JADX INFO: renamed from: f */
    private C14599r.a f61126f;

    public AsyncTaskC14642k(Context context, InsideNotificationItem insideNotificationItem, long j, boolean z, C14599r.a aVar) {
        this.f61121a = context;
        this.f61122b = insideNotificationItem;
        this.f61123c = j;
        this.f61124d = z;
        this.f61126f = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:49:0x008d A[EXC_TOP_SPLITTER, PHI: r4
      0x008d: PHI (r4v5 java.io.InputStream) = (r4v4 java.io.InputStream), (r4v6 java.io.InputStream) binds: [B:26:0x008b, B:31:0x0097] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<Bitmap> doInBackground(String... strArr) throws Throwable {
        InputStream inputStream;
        Bitmap bitmapDecodeStream;
        this.f61125e = this.f61122b.getNotifyDisplayStatus();
        InputStream inputStream2 = null;
        if (!this.f61124d) {
            C14647p.m85021d("ImageDownTask", "bitmap is not display by forbid net");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            String str = strArr[i];
            C14647p.m85021d("ImageDownTask", "imgUrl=" + str + " i=" + i);
            if (!TextUtils.isEmpty(str)) {
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                    httpURLConnection.setConnectTimeout(30000);
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.connect();
                    int responseCode = httpURLConnection.getResponseCode();
                    C14647p.m85019c("ImageDownTask", "code=".concat(String.valueOf(responseCode)));
                    if (responseCode == 200) {
                        inputStream = httpURLConnection.getInputStream();
                        try {
                            try {
                                bitmapDecodeStream = BitmapFactory.decodeStream(inputStream);
                            } catch (Throwable th) {
                                th = th;
                                inputStream2 = inputStream;
                                if (inputStream2 != null) {
                                    try {
                                        inputStream2.close();
                                    } catch (Exception unused) {
                                    }
                                }
                                throw th;
                            }
                        } catch (MalformedURLException unused2) {
                            C14647p.m85008a("ImageDownTask", "MalformedURLException");
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Exception unused3) {
                                }
                            }
                            bitmapDecodeStream = null;
                        } catch (IOException unused4) {
                            C14647p.m85008a("ImageDownTask", "IOException");
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            bitmapDecodeStream = null;
                        }
                    } else {
                        inputStream = null;
                        bitmapDecodeStream = null;
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception unused5) {
                        }
                    }
                } catch (MalformedURLException unused6) {
                    inputStream = null;
                } catch (IOException unused7) {
                    inputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                arrayList.add(bitmapDecodeStream);
            } else if (i == 0) {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(List<Bitmap> list) {
        List<Bitmap> list2 = list;
        super.onPostExecute(list2);
        C14647p.m85019c("ImageDownTask", "onPostExecute");
        C14617m.m84916c(new RunnableC14643l(this, list2));
    }
}
