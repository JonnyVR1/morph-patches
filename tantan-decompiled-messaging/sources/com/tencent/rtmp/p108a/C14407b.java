package com.tencent.rtmp.p108a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.tencent.could.component.common.p079ai.eventreport.entry.NetWorkParam;
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
public class C14407b implements InterfaceC14406a {

    /* JADX INFO: renamed from: a */
    private final BitmapFactory.Options f60413a = new BitmapFactory.Options();

    /* JADX INFO: renamed from: b */
    private HandlerThread f60414b;

    /* JADX INFO: renamed from: c */
    private Handler f60415c;

    /* JADX INFO: renamed from: d */
    private List<C14408c> f60416d;

    /* JADX INFO: renamed from: e */
    private Map<String, BitmapRegionDecoder> f60417e;

    /* JADX INFO: renamed from: com.tencent.rtmp.a.b$a */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: a */
        private WeakReference<C14407b> f60419a;

        /* JADX INFO: renamed from: b */
        private String f60420b;

        public a(C14407b c14407b, String str) {
            this.f60419a = new WeakReference<>(c14407b);
            this.f60420b = str;
        }

        /* JADX INFO: renamed from: a */
        private float m84587a(String str) {
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
            C14407b c14407b = this.f60419a.get();
            BufferedReader bufferedReader = null;
            try {
                try {
                    try {
                        InputStream inputStreamM84581a = c14407b.m84581a(this.f60420b);
                        if (inputStreamM84581a == null) {
                        }
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStreamM84581a));
                        try {
                            String line2 = bufferedReader2.readLine();
                            if (line2 != null && line2.length() != 0 && line2.contains("WEBVTT")) {
                                do {
                                    line = bufferedReader2.readLine();
                                    if (line != null && line.contains("-->")) {
                                        String[] strArrSplit = line.split(" --> ");
                                        if (strArrSplit.length == 2) {
                                            String line3 = bufferedReader2.readLine();
                                            C14408c c14408c = new C14408c();
                                            c14408c.f60424a = m84587a(strArrSplit[0]);
                                            c14408c.f60425b = m84587a(strArrSplit[1]);
                                            c14408c.f60426c = line3;
                                            int iIndexOf = line3.indexOf("#");
                                            if (iIndexOf != -1) {
                                                c14408c.f60427d = line3.substring(0, iIndexOf);
                                            }
                                            int iIndexOf2 = line3.indexOf("=");
                                            if (iIndexOf2 != -1 && (i = iIndexOf2 + 1) < line3.length()) {
                                                String[] strArrSplit2 = line3.substring(i, line3.length()).split(Constants.SEPARATOR_COMMA);
                                                if (strArrSplit2.length == 4) {
                                                    c14408c.f60428e = Integer.valueOf(strArrSplit2[0]).intValue();
                                                    c14408c.f60429f = Integer.valueOf(strArrSplit2[1]).intValue();
                                                    c14408c.f60430g = Integer.valueOf(strArrSplit2[2]).intValue();
                                                    c14408c.f60431h = Integer.valueOf(strArrSplit2[3]).intValue();
                                                }
                                            }
                                            if (c14407b != null && c14407b.f60416d != null) {
                                                c14407b.f60416d.add(c14408c);
                                            }
                                        }
                                    }
                                } while (line != null);
                                bufferedReader2.close();
                                return;
                            }
                            TXCLog.m82966e("TXImageSprite", "DownloadAndParseVTTFileTask : getVTT File Error!");
                            if (c14407b != null) {
                                c14407b.m84585b();
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
                TXCLog.m82967e("TXImageSprite", "load image sprite failed.", e);
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
        private WeakReference<C14407b> f60421a;

        /* JADX INFO: renamed from: b */
        private String f60422b;

        /* JADX INFO: renamed from: c */
        private String f60423c;

        public b(C14407b c14407b, String str, String str2) {
            this.f60421a = new WeakReference<>(c14407b);
            this.f60422b = str;
            this.f60423c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            C14407b c14407b = this.f60421a.get();
            if (this.f60421a == null || c14407b == null) {
                return;
            }
            InputStream inputStreamM84581a = null;
            try {
                try {
                    try {
                        inputStreamM84581a = c14407b.m84581a(this.f60423c);
                        int iLastIndexOf = this.f60423c.lastIndexOf("/");
                        if (iLastIndexOf != -1 && (i = iLastIndexOf + 1) < this.f60423c.length()) {
                            String str = this.f60423c;
                            String strSubstring = str.substring(i, str.length());
                            if (c14407b.f60417e != null) {
                                c14407b.f60417e.put(strSubstring, BitmapRegionDecoder.newInstance(inputStreamM84581a, true));
                            }
                        }
                        if (inputStreamM84581a != null) {
                            inputStreamM84581a.close();
                        }
                    } catch (IOException e) {
                        TXCLog.m82967e("TXImageSprite", "load bitmap from network failed.", e);
                        if (inputStreamM84581a != null) {
                            inputStreamM84581a.close();
                        }
                    }
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                if (inputStreamM84581a != null) {
                    try {
                        inputStreamM84581a.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        }
    }

    public C14407b() {
        ArrayList arrayList = new ArrayList();
        this.f60416d = arrayList;
        this.f60416d = Collections.synchronizedList(arrayList);
        HashMap map = new HashMap();
        this.f60417e = map;
        this.f60417e = Collections.synchronizedMap(map);
    }

    /* JADX INFO: renamed from: a */
    private C14408c m84579a(int i, int i2, float f) {
        int i3 = ((i2 - i) / 2) + i;
        if (this.f60416d.get(i3).f60424a <= f && this.f60416d.get(i3).f60425b > f) {
            return this.f60416d.get(i3);
        }
        List<C14408c> list = this.f60416d;
        if (i >= i2) {
            return list.get(i);
        }
        if (f >= list.get(i3).f60425b) {
            return m84579a(i3 + 1, i2, f);
        }
        if (f < this.f60416d.get(i3).f60424a) {
            return m84579a(i, i3 - 1, f);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m84585b() {
        if (this.f60415c != null) {
            TXCLog.m82969i("TXImageSprite", " remove all tasks!");
            this.f60415c.removeCallbacksAndMessages(null);
            this.f60415c.post(new Runnable() { // from class: com.tencent.rtmp.a.b.1
                @Override // java.lang.Runnable
                public void run() {
                    if (C14407b.this.f60416d != null) {
                        C14407b.this.f60416d.clear();
                    }
                    if (C14407b.this.f60417e != null) {
                        for (BitmapRegionDecoder bitmapRegionDecoder : C14407b.this.f60417e.values()) {
                            if (bitmapRegionDecoder != null) {
                                bitmapRegionDecoder.recycle();
                            }
                        }
                        C14407b.this.f60417e.clear();
                    }
                }
            });
        }
    }

    @Override // com.tencent.rtmp.p108a.InterfaceC14406a
    public Bitmap getThumbnail(float f) {
        C14408c c14408cM84579a;
        if (this.f60416d.size() == 0 || (c14408cM84579a = m84579a(0, this.f60416d.size() - 1, f)) == null) {
            return null;
        }
        BitmapRegionDecoder bitmapRegionDecoder = this.f60417e.get(c14408cM84579a.f60427d);
        if (bitmapRegionDecoder == null) {
            return null;
        }
        Rect rect = new Rect();
        int i = c14408cM84579a.f60428e;
        rect.left = i;
        int i2 = c14408cM84579a.f60429f;
        rect.top = i2;
        rect.right = i + c14408cM84579a.f60430g;
        rect.bottom = i2 + c14408cM84579a.f60431h;
        return bitmapRegionDecoder.decodeRegion(rect, this.f60413a);
    }

    @Override // com.tencent.rtmp.p108a.InterfaceC14406a
    public void release() {
        m84585b();
        HandlerThread handlerThread = this.f60414b;
        if (handlerThread == null || this.f60415c == null) {
            return;
        }
        handlerThread.quitSafely();
        this.f60415c = null;
        this.f60414b = null;
    }

    @Override // com.tencent.rtmp.p108a.InterfaceC14406a
    public void setVTTUrlAndImageUrls(String str, List<String> list) {
        if (TextUtils.isEmpty(str)) {
            TXCLog.m82966e("TXImageSprite", "setVTTUrlAndImageUrls: vttUrl can't be null!");
            return;
        }
        m84585b();
        m84583a();
        this.f60415c.post(new a(this, str));
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.f60415c.post(new b(this, str, it.next()));
        }
    }

    /* JADX INFO: renamed from: a */
    private void m84583a() {
        if (this.f60414b == null) {
            HandlerThread handlerThread = new HandlerThread("SuperVodThumbnailsWorkThread");
            this.f60414b = handlerThread;
            handlerThread.start();
            this.f60415c = new Handler(this.f60414b.getLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public InputStream m84581a(String str) throws IOException {
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        uRLConnectionOpenConnection.connect();
        uRLConnectionOpenConnection.getInputStream();
        uRLConnectionOpenConnection.setConnectTimeout(NetWorkParam.DEFAULT_CONNECT_TIME_OUT);
        uRLConnectionOpenConnection.setReadTimeout(NetWorkParam.DEFAULT_CONNECT_TIME_OUT);
        return uRLConnectionOpenConnection.getInputStream();
    }
}
