package com.tencent.rtmp.p113a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.tencent.could.component.common.p084ai.eventreport.entry.NetWorkParam;
import com.tencent.liteav.basic.log.TXCLog;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.rtmp.a.b */
/* JADX INFO: loaded from: classes2.dex */
public class C14570b implements InterfaceC14569a {

    /* JADX INFO: renamed from: a */
    private final BitmapFactory.Options f61261a = new BitmapFactory.Options();

    /* JADX INFO: renamed from: b */
    private HandlerThread f61262b;

    /* JADX INFO: renamed from: c */
    private Handler f61263c;

    /* JADX INFO: renamed from: d */
    private List<C14571c> f61264d;

    /* JADX INFO: renamed from: e */
    private Map<String, BitmapRegionDecoder> f61265e;

    /* JADX INFO: renamed from: com.tencent.rtmp.a.b$a */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: a */
        private WeakReference<C14570b> f61267a;

        /* JADX INFO: renamed from: b */
        private String f61268b;

        public a(C14570b c14570b, String str) {
            this.f61267a = new WeakReference<>(c14570b);
            this.f61268b = str;
        }

        /* JADX INFO: renamed from: a */
        private float m85770a(String str) {
            String str2;
            String str3;
            String[] strArrSplit = str.split(":");
            if (strArrSplit.length == 3) {
                String str4 = strArrSplit[0];
                str3 = strArrSplit[1];
                str2 = strArrSplit[2];
            } else if (strArrSplit.length == 2) {
                str3 = strArrSplit[0];
                str2 = strArrSplit[1];
            } else if (strArrSplit.length == 1) {
                str2 = strArrSplit[0];
                str3 = null;
            } else {
                str2 = null;
                str3 = null;
            }
            float fFloatValue = str3 != null ? 0.0f + (Float.valueOf(str3).floatValue() * 60.0f) : 0.0f;
            return str2 != null ? fFloatValue + Float.valueOf(str2).floatValue() : fFloatValue;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            String line;
            int i;
            C14570b c14570b = this.f61267a.get();
            BufferedReader bufferedReader = null;
            try {
                try {
                    try {
                        InputStream inputStreamM85764a = c14570b.m85764a(this.f61268b);
                        if (inputStreamM85764a == null) {
                        }
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStreamM85764a));
                        try {
                            String line2 = bufferedReader2.readLine();
                            if (line2 != null && line2.length() != 0 && line2.contains("WEBVTT")) {
                                do {
                                    line = bufferedReader2.readLine();
                                    if (line != null && line.contains("-->")) {
                                        String[] strArrSplit = line.split(" --> ");
                                        if (strArrSplit.length == 2) {
                                            String line3 = bufferedReader2.readLine();
                                            C14571c c14571c = new C14571c();
                                            c14571c.f61272a = m85770a(strArrSplit[0]);
                                            c14571c.f61273b = m85770a(strArrSplit[1]);
                                            c14571c.f61274c = line3;
                                            int iIndexOf = line3.indexOf("#");
                                            if (iIndexOf != -1) {
                                                c14571c.f61275d = line3.substring(0, iIndexOf);
                                            }
                                            int iIndexOf2 = line3.indexOf("=");
                                            if (iIndexOf2 != -1 && (i = iIndexOf2 + 1) < line3.length()) {
                                                String[] strArrSplit2 = line3.substring(i, line3.length()).split(Constants.SEPARATOR_COMMA);
                                                if (strArrSplit2.length == 4) {
                                                    c14571c.f61276e = Integer.valueOf(strArrSplit2[0]).intValue();
                                                    c14571c.f61277f = Integer.valueOf(strArrSplit2[1]).intValue();
                                                    c14571c.f61278g = Integer.valueOf(strArrSplit2[2]).intValue();
                                                    c14571c.f61279h = Integer.valueOf(strArrSplit2[3]).intValue();
                                                }
                                            }
                                            if (c14570b != null && c14570b.f61264d != null) {
                                                c14570b.f61264d.add(c14571c);
                                            }
                                        }
                                    }
                                } while (line != null);
                                bufferedReader2.close();
                                return;
                            }
                            TXCLog.m84149e("TXImageSprite", "DownloadAndParseVTTFileTask : getVTT File Error!");
                            if (c14570b != null) {
                                c14570b.m85768b();
                            }
                            try {
                                bufferedReader2.close();
                                return;
                            } catch (IOException unused) {
                                return;
                            }
                        } catch (IOException e) {
                            e = e;
                            bufferedReader = bufferedReader2;
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    } catch (IOException unused3) {
                        return;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
                TXCLog.m84150e("TXImageSprite", "load image sprite failed.", e);
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.rtmp.a.b$b */
    public static class b implements Runnable {

        /* JADX INFO: renamed from: a */
        private WeakReference<C14570b> f61269a;

        /* JADX INFO: renamed from: b */
        private String f61270b;

        /* JADX INFO: renamed from: c */
        private String f61271c;

        public b(C14570b c14570b, String str, String str2) {
            this.f61269a = new WeakReference<>(c14570b);
            this.f61270b = str;
            this.f61271c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            C14570b c14570b = this.f61269a.get();
            if (this.f61269a == null || c14570b == null) {
                return;
            }
            InputStream inputStreamM85764a = null;
            try {
                try {
                    try {
                        inputStreamM85764a = c14570b.m85764a(this.f61271c);
                        int iLastIndexOf = this.f61271c.lastIndexOf("/");
                        if (iLastIndexOf != -1 && (i = iLastIndexOf + 1) < this.f61271c.length()) {
                            String str = this.f61271c;
                            String strSubstring = str.substring(i, str.length());
                            if (c14570b.f61265e != null) {
                                c14570b.f61265e.put(strSubstring, BitmapRegionDecoder.newInstance(inputStreamM85764a, true));
                            }
                        }
                        if (inputStreamM85764a != null) {
                            inputStreamM85764a.close();
                        }
                    } catch (IOException e) {
                        TXCLog.m84150e("TXImageSprite", "load bitmap from network failed.", e);
                        if (inputStreamM85764a != null) {
                            inputStreamM85764a.close();
                        }
                    }
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                if (inputStreamM85764a != null) {
                    try {
                        inputStreamM85764a.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        }
    }

    public C14570b() {
        ArrayList arrayList = new ArrayList();
        this.f61264d = arrayList;
        this.f61264d = Collections.synchronizedList(arrayList);
        HashMap map = new HashMap();
        this.f61265e = map;
        this.f61265e = Collections.synchronizedMap(map);
    }

    /* JADX INFO: renamed from: a */
    private C14571c m85762a(int i, int i2, float f) {
        int i3 = ((i2 - i) / 2) + i;
        if (this.f61264d.get(i3).f61272a <= f && this.f61264d.get(i3).f61273b > f) {
            return this.f61264d.get(i3);
        }
        List<C14571c> list = this.f61264d;
        if (i >= i2) {
            return list.get(i);
        }
        if (f >= list.get(i3).f61273b) {
            return m85762a(i3 + 1, i2, f);
        }
        if (f < this.f61264d.get(i3).f61272a) {
            return m85762a(i, i3 - 1, f);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m85768b() {
        if (this.f61263c != null) {
            TXCLog.m84152i("TXImageSprite", " remove all tasks!");
            this.f61263c.removeCallbacksAndMessages(null);
            this.f61263c.post(new Runnable() { // from class: com.tencent.rtmp.a.b.1
                @Override // java.lang.Runnable
                public void run() {
                    if (C14570b.this.f61264d != null) {
                        C14570b.this.f61264d.clear();
                    }
                    if (C14570b.this.f61265e != null) {
                        for (BitmapRegionDecoder bitmapRegionDecoder : C14570b.this.f61265e.values()) {
                            if (bitmapRegionDecoder != null) {
                                bitmapRegionDecoder.recycle();
                            }
                        }
                        C14570b.this.f61265e.clear();
                    }
                }
            });
        }
    }

    @Override // com.tencent.rtmp.p113a.InterfaceC14569a
    public Bitmap getThumbnail(float f) {
        C14571c c14571cM85762a;
        if (this.f61264d.size() == 0 || (c14571cM85762a = m85762a(0, this.f61264d.size() - 1, f)) == null) {
            return null;
        }
        BitmapRegionDecoder bitmapRegionDecoder = this.f61265e.get(c14571cM85762a.f61275d);
        if (bitmapRegionDecoder == null) {
            return null;
        }
        Rect rect = new Rect();
        int i = c14571cM85762a.f61276e;
        rect.left = i;
        int i2 = c14571cM85762a.f61277f;
        rect.top = i2;
        rect.right = i + c14571cM85762a.f61278g;
        rect.bottom = i2 + c14571cM85762a.f61279h;
        return bitmapRegionDecoder.decodeRegion(rect, this.f61261a);
    }

    @Override // com.tencent.rtmp.p113a.InterfaceC14569a
    public void release() {
        m85768b();
        HandlerThread handlerThread = this.f61262b;
        if (handlerThread == null || this.f61263c == null) {
            return;
        }
        handlerThread.quitSafely();
        this.f61263c = null;
        this.f61262b = null;
    }

    @Override // com.tencent.rtmp.p113a.InterfaceC14569a
    public void setVTTUrlAndImageUrls(String str, List<String> list) {
        if (TextUtils.isEmpty(str)) {
            TXCLog.m84149e("TXImageSprite", "setVTTUrlAndImageUrls: vttUrl can't be null!");
            return;
        }
        m85768b();
        m85766a();
        this.f61263c.post(new a(this, str));
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.f61263c.post(new b(this, str, it.next()));
        }
    }

    /* JADX INFO: renamed from: a */
    private void m85766a() {
        if (this.f61262b == null) {
            HandlerThread handlerThread = new HandlerThread("SuperVodThumbnailsWorkThread");
            this.f61262b = handlerThread;
            handlerThread.start();
            this.f61263c = new Handler(this.f61262b.getLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public InputStream m85764a(String str) throws IOException {
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        uRLConnectionOpenConnection.connect();
        uRLConnectionOpenConnection.getInputStream();
        uRLConnectionOpenConnection.setConnectTimeout(NetWorkParam.DEFAULT_CONNECT_TIME_OUT);
        uRLConnectionOpenConnection.setReadTimeout(NetWorkParam.DEFAULT_CONNECT_TIME_OUT);
        return uRLConnectionOpenConnection.getInputStream();
    }
}
