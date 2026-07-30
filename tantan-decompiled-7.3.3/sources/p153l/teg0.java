package p153l;

import Suddo.Sudimport;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;

/* JADX INFO: loaded from: classes.dex */
public final class teg0 implements Runnable {

    /* JADX INFO: renamed from: t */
    public static final Object f173815t = new Object();

    /* JADX INFO: renamed from: u */
    public static final rtg0 f173816u = new rtg0();

    /* JADX INFO: renamed from: v */
    public static final AtomicInteger f173817v = new AtomicInteger();

    /* JADX INFO: renamed from: w */
    public static final dwg0 f173818w = new dwg0();

    /* JADX INFO: renamed from: a */
    public final int f173819a = f173817v.incrementAndGet();

    /* JADX INFO: renamed from: b */
    public final feg0 f173820b;

    /* JADX INFO: renamed from: c */
    public final jeg0 f173821c;

    /* JADX INFO: renamed from: d */
    public final mgg0 f173822d;

    /* JADX INFO: renamed from: e */
    public final zyg0 f173823e;

    /* JADX INFO: renamed from: f */
    public final String f173824f;

    /* JADX INFO: renamed from: g */
    public final lxg0 f173825g;

    /* JADX INFO: renamed from: h */
    public final int f173826h;

    /* JADX INFO: renamed from: i */
    public int f173827i;

    /* JADX INFO: renamed from: j */
    public final uxg0 f173828j;

    /* JADX INFO: renamed from: k */
    public wqg0 f173829k;

    /* JADX INFO: renamed from: l */
    public ArrayList f173830l;

    /* JADX INFO: renamed from: m */
    public Bitmap f173831m;

    /* JADX INFO: renamed from: n */
    public Future f173832n;

    /* JADX INFO: renamed from: o */
    public int f173833o;

    /* JADX INFO: renamed from: p */
    public Exception f173834p;

    /* JADX INFO: renamed from: q */
    public int f173835q;

    /* JADX INFO: renamed from: r */
    public int f173836r;

    /* JADX INFO: renamed from: s */
    public int f173837s;

    public teg0(feg0 feg0Var, jeg0 jeg0Var, cng0 cng0Var, zyg0 zyg0Var, wqg0 wqg0Var, uxg0 uxg0Var) {
        this.f173820b = feg0Var;
        this.f173821c = jeg0Var;
        this.f173822d = cng0Var;
        this.f173823e = zyg0Var;
        this.f173829k = wqg0Var;
        this.f173824f = wqg0Var.f190404e;
        lxg0 lxg0Var = wqg0Var.f190401b;
        this.f173825g = lxg0Var;
        this.f173837s = lxg0Var.f133957c;
        this.f173826h = wqg0Var.f190403d;
        this.f173827i = 0;
        this.f173828j = uxg0Var;
        this.f173836r = uxg0Var.mo192803a();
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap m190700b(Source source, lxg0 lxg0Var) throws IOException {
        BufferedSource bufferedSourceBuffer = Okio.buffer(source);
        boolean z = bufferedSourceBuffer.rangeEquals(0L, yuq0.f201658b) && bufferedSourceBuffer.rangeEquals(8L, yuq0.f201659c);
        lxg0Var.getClass();
        if (z) {
            byte[] byteArray = bufferedSourceBuffer.readByteArray();
            return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, null);
        }
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(bufferedSourceBuffer.inputStream(), null, null);
        if (bitmapDecodeStream != null) {
            return bitmapDecodeStream;
        }
        zpg0.m220844a("Failed to decode stream.");
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static void m190701d(lxg0 lxg0Var) {
        Uri uri = lxg0Var.f133955a;
        String strValueOf = uri != null ? String.valueOf(uri.getPath()) : Integer.toHexString(0);
        StringBuilder sb = (StringBuilder) f173816u.get();
        sb.ensureCapacity(strValueOf.length() + 11);
        sb.replace(11, sb.length(), strValueOf);
        Thread.currentThread().setName(sb.toString());
    }

    /* JADX INFO: renamed from: a */
    public final Bitmap m190702a() {
        Bitmap bitmapCreateBitmap;
        int i;
        Bitmap bitmap = null;
        if ((this.f173826h & 1) == 0) {
            bitmapCreateBitmap = ((cng0) this.f173822d).m111516b(this.f173824f);
            if (bitmapCreateBitmap != null) {
                this.f173823e.f206579b.sendEmptyMessage(0);
                this.f173833o = 1;
                this.f173820b.getClass();
                return bitmapCreateBitmap;
            }
        } else {
            bitmapCreateBitmap = null;
        }
        int i2 = this.f173836r == 0 ? 4 : this.f173827i;
        this.f173827i = i2;
        aig0 aig0VarMo118414b = this.f173828j.mo118414b(this.f173825g, i2);
        if (aig0VarMo118414b != null) {
            this.f173833o = aig0VarMo118414b.f71528a;
            this.f173835q = aig0VarMo118414b.f71531d;
            bitmapCreateBitmap = aig0VarMo118414b.f71529b;
            if (bitmapCreateBitmap == null) {
                Source source = aig0VarMo118414b.f71530c;
                try {
                    bitmapCreateBitmap = m190700b(source, this.f173825g);
                    try {
                        source.close();
                    } catch (IOException unused) {
                    }
                } catch (Throwable th) {
                    try {
                        source.close();
                        throw th;
                    } catch (IOException unused2) {
                        throw th;
                    }
                }
            }
        }
        if (bitmapCreateBitmap != null) {
            this.f173820b.getClass();
            zyg0 zyg0Var = this.f173823e;
            zyg0Var.getClass();
            int iM217466b = yuq0.m217466b(bitmapCreateBitmap);
            mxg0 mxg0Var = zyg0Var.f206579b;
            mxg0Var.sendMessage(mxg0Var.obtainMessage(2, iM217466b, 0));
            lxg0 lxg0Var = this.f173825g;
            lxg0Var.getClass();
            if (lxg0Var.f133956b != null || this.f173835q != 0) {
                synchronized (f173815t) {
                    try {
                        this.f173825g.getClass();
                        int i3 = this.f173835q;
                        if (i3 != 0) {
                            lxg0 lxg0Var2 = this.f173825g;
                            int width = bitmapCreateBitmap.getWidth();
                            int height = bitmapCreateBitmap.getHeight();
                            lxg0Var2.getClass();
                            Matrix matrix = new Matrix();
                            if (i3 != 0 && i3 != 0) {
                                switch (i3) {
                                    case 3:
                                    case 4:
                                        i = 180;
                                        break;
                                    case 5:
                                    case 6:
                                        i = 90;
                                        break;
                                    case 7:
                                    case 8:
                                        i = 270;
                                        break;
                                    default:
                                        i = 0;
                                        break;
                                }
                                int i4 = (i3 == 2 || i3 == 7 || i3 == 4 || i3 == 5) ? -1 : 1;
                                if (i != 0) {
                                    matrix.preRotate(i);
                                }
                                if (i4 != 1) {
                                    matrix.postScale(i4, 1.0f);
                                }
                            }
                            Bitmap bitmap2 = bitmapCreateBitmap;
                            bitmapCreateBitmap = Bitmap.createBitmap(bitmap2, 0, 0, width, height, matrix, true);
                            if (bitmapCreateBitmap != bitmap2) {
                                bitmap2.recycle();
                            } else {
                                bitmapCreateBitmap = bitmap2;
                            }
                            this.f173820b.getClass();
                        }
                        List list = this.f173825g.f133956b;
                        if (list != null) {
                            if (list.size() <= 0) {
                                bitmap = bitmapCreateBitmap;
                            } else {
                                if (list.get(0) != null) {
                                    throw new ClassCastException();
                                }
                                try {
                                    throw null;
                                } catch (RuntimeException e) {
                                    feg0.f98665i.post(new bzg0(e));
                                }
                            }
                            this.f173820b.getClass();
                            bitmapCreateBitmap = bitmap;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (bitmapCreateBitmap == null) {
                    return bitmapCreateBitmap;
                }
                zyg0 zyg0Var2 = this.f173823e;
                zyg0Var2.getClass();
                int iM217466b2 = yuq0.m217466b(bitmapCreateBitmap);
                mxg0 mxg0Var2 = zyg0Var2.f206579b;
                mxg0Var2.sendMessage(mxg0Var2.obtainMessage(3, iM217466b2, 0));
                return bitmapCreateBitmap;
            }
        }
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: c */
    public final void m190703c(wqg0 wqg0Var) {
        boolean zRemove;
        int i = 1;
        if (this.f173829k == wqg0Var) {
            this.f173829k = null;
            zRemove = true;
        } else {
            ArrayList arrayList = this.f173830l;
            zRemove = arrayList != null ? arrayList.remove(wqg0Var) : false;
        }
        if (zRemove && wqg0Var.f190401b.f133957c == this.f173837s) {
            ArrayList arrayList2 = this.f173830l;
            boolean z = (arrayList2 == null || arrayList2.isEmpty()) ? false : true;
            wqg0 wqg0Var2 = this.f173829k;
            if (wqg0Var2 != null || z) {
                i = wqg0Var2 != null ? wqg0Var2.f190401b.f133957c : 1;
                if (z) {
                    int size = this.f173830l.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        int i3 = ((wqg0) this.f173830l.get(i2)).f190401b.f133957c;
                        if (pxg0.m174221a(i3) > pxg0.m174221a(i)) {
                            i = i3;
                        }
                    }
                }
            }
            this.f173837s = i;
        }
        this.f173820b.getClass();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            m190701d(this.f173825g);
            this.f173820b.getClass();
            Bitmap bitmapM190702a = m190702a();
            this.f173831m = bitmapM190702a;
            jeg0 jeg0Var = this.f173821c;
            if (bitmapM190702a == null) {
                jeg0Var.m144565c(this);
            } else {
                jeg0Var.m144566d(this);
            }
        } catch (IOException e) {
            this.f173834p = e;
            nvg0 nvg0Var = this.f173821c.f120493h;
            nvg0Var.sendMessageDelayed(nvg0Var.obtainMessage(5, this), 500L);
        } catch (Exception e2) {
            this.f173834p = e2;
            nvg0 nvg0Var2 = this.f173821c.f120493h;
            nvg0Var2.sendMessage(nvg0Var2.obtainMessage(6, this));
        } catch (Sudimport e3) {
            this.f173834p = e3;
            nvg0 nvg0Var3 = this.f173821c.f120493h;
            nvg0Var3.sendMessage(nvg0Var3.obtainMessage(6, this));
        } catch (OutOfMemoryError e4) {
            StringWriter stringWriter = new StringWriter();
            this.f173823e.m222113a().m117869a(new PrintWriter(stringWriter));
            this.f173834p = new RuntimeException(stringWriter.toString(), e4);
            nvg0 nvg0Var4 = this.f173821c.f120493h;
            nvg0Var4.sendMessage(nvg0Var4.obtainMessage(6, this));
        } finally {
            Thread.currentThread().setName("SudPicasso-Idle");
        }
    }
}
