package p149l;

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
public final class l6g0 implements Runnable {

    /* JADX INFO: renamed from: t */
    public static final Object f126617t = new Object();

    /* JADX INFO: renamed from: u */
    public static final jlg0 f126618u = new jlg0();

    /* JADX INFO: renamed from: v */
    public static final AtomicInteger f126619v = new AtomicInteger();

    /* JADX INFO: renamed from: w */
    public static final vng0 f126620w = new vng0();

    /* JADX INFO: renamed from: a */
    public final int f126621a = f126619v.incrementAndGet();

    /* JADX INFO: renamed from: b */
    public final x5g0 f126622b;

    /* JADX INFO: renamed from: c */
    public final b6g0 f126623c;

    /* JADX INFO: renamed from: d */
    public final e8g0 f126624d;

    /* JADX INFO: renamed from: e */
    public final rqg0 f126625e;

    /* JADX INFO: renamed from: f */
    public final String f126626f;

    /* JADX INFO: renamed from: g */
    public final dpg0 f126627g;

    /* JADX INFO: renamed from: h */
    public final int f126628h;

    /* JADX INFO: renamed from: i */
    public int f126629i;

    /* JADX INFO: renamed from: j */
    public final mpg0 f126630j;

    /* JADX INFO: renamed from: k */
    public oig0 f126631k;

    /* JADX INFO: renamed from: l */
    public ArrayList f126632l;

    /* JADX INFO: renamed from: m */
    public Bitmap f126633m;

    /* JADX INFO: renamed from: n */
    public Future f126634n;

    /* JADX INFO: renamed from: o */
    public int f126635o;

    /* JADX INFO: renamed from: p */
    public Exception f126636p;

    /* JADX INFO: renamed from: q */
    public int f126637q;

    /* JADX INFO: renamed from: r */
    public int f126638r;

    /* JADX INFO: renamed from: s */
    public int f126639s;

    public l6g0(x5g0 x5g0Var, b6g0 b6g0Var, ueg0 ueg0Var, rqg0 rqg0Var, oig0 oig0Var, mpg0 mpg0Var) {
        this.f126622b = x5g0Var;
        this.f126623c = b6g0Var;
        this.f126624d = ueg0Var;
        this.f126625e = rqg0Var;
        this.f126631k = oig0Var;
        this.f126626f = oig0Var.f144118e;
        dpg0 dpg0Var = oig0Var.f144115b;
        this.f126627g = dpg0Var;
        this.f126639s = dpg0Var.f87273c;
        this.f126628h = oig0Var.f144117d;
        this.f126629i = 0;
        this.f126630j = mpg0Var;
        this.f126638r = mpg0Var.mo150688a();
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap m148730b(Source source, dpg0 dpg0Var) throws IOException {
        BufferedSource bufferedSourceBuffer = Okio.buffer(source);
        boolean z = bufferedSourceBuffer.rangeEquals(0L, slq0.f165257b) && bufferedSourceBuffer.rangeEquals(8L, slq0.f165258c);
        dpg0Var.getClass();
        if (z) {
            byte[] byteArray = bufferedSourceBuffer.readByteArray();
            return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, null);
        }
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(bufferedSourceBuffer.inputStream(), null, null);
        if (bitmapDecodeStream != null) {
            return bitmapDecodeStream;
        }
        rhg0.m179353a("Failed to decode stream.");
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static void m148731d(dpg0 dpg0Var) {
        Uri uri = dpg0Var.f87271a;
        String strValueOf = uri != null ? String.valueOf(uri.getPath()) : Integer.toHexString(0);
        StringBuilder sb = (StringBuilder) f126618u.get();
        sb.ensureCapacity(strValueOf.length() + 11);
        sb.replace(11, sb.length(), strValueOf);
        Thread.currentThread().setName(sb.toString());
    }

    /* JADX INFO: renamed from: a */
    public final Bitmap m148732a() {
        Bitmap bitmapCreateBitmap;
        int i;
        Bitmap bitmap = null;
        if ((this.f126628h & 1) == 0) {
            bitmapCreateBitmap = ((ueg0) this.f126624d).m193253b(this.f126626f);
            if (bitmapCreateBitmap != null) {
                this.f126625e.f160631b.sendEmptyMessage(0);
                this.f126635o = 1;
                this.f126622b.getClass();
                return bitmapCreateBitmap;
            }
        } else {
            bitmapCreateBitmap = null;
        }
        int i2 = this.f126638r == 0 ? 4 : this.f126629i;
        this.f126629i = i2;
        s9g0 s9g0VarMo113471b = this.f126630j.mo113471b(this.f126627g, i2);
        if (s9g0VarMo113471b != null) {
            this.f126635o = s9g0VarMo113471b.f163179a;
            this.f126637q = s9g0VarMo113471b.f163182d;
            bitmapCreateBitmap = s9g0VarMo113471b.f163180b;
            if (bitmapCreateBitmap == null) {
                Source source = s9g0VarMo113471b.f163181c;
                try {
                    bitmapCreateBitmap = m148730b(source, this.f126627g);
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
            this.f126622b.getClass();
            rqg0 rqg0Var = this.f126625e;
            rqg0Var.getClass();
            int iM184845b = slq0.m184845b(bitmapCreateBitmap);
            epg0 epg0Var = rqg0Var.f160631b;
            epg0Var.sendMessage(epg0Var.obtainMessage(2, iM184845b, 0));
            dpg0 dpg0Var = this.f126627g;
            dpg0Var.getClass();
            if (dpg0Var.f87272b != null || this.f126637q != 0) {
                synchronized (f126617t) {
                    try {
                        this.f126627g.getClass();
                        int i3 = this.f126637q;
                        if (i3 != 0) {
                            dpg0 dpg0Var2 = this.f126627g;
                            int width = bitmapCreateBitmap.getWidth();
                            int height = bitmapCreateBitmap.getHeight();
                            dpg0Var2.getClass();
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
                            this.f126622b.getClass();
                        }
                        List list = this.f126627g.f87272b;
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
                                    x5g0.f191136i.post(new tqg0(e));
                                }
                            }
                            this.f126622b.getClass();
                            bitmapCreateBitmap = bitmap;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (bitmapCreateBitmap == null) {
                    return bitmapCreateBitmap;
                }
                rqg0 rqg0Var2 = this.f126625e;
                rqg0Var2.getClass();
                int iM184845b2 = slq0.m184845b(bitmapCreateBitmap);
                epg0 epg0Var2 = rqg0Var2.f160631b;
                epg0Var2.sendMessage(epg0Var2.obtainMessage(3, iM184845b2, 0));
                return bitmapCreateBitmap;
            }
        }
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: c */
    public final void m148733c(oig0 oig0Var) {
        boolean zRemove;
        int i = 1;
        if (this.f126631k == oig0Var) {
            this.f126631k = null;
            zRemove = true;
        } else {
            ArrayList arrayList = this.f126632l;
            zRemove = arrayList != null ? arrayList.remove(oig0Var) : false;
        }
        if (zRemove && oig0Var.f144115b.f87273c == this.f126639s) {
            ArrayList arrayList2 = this.f126632l;
            boolean z = (arrayList2 == null || arrayList2.isEmpty()) ? false : true;
            oig0 oig0Var2 = this.f126631k;
            if (oig0Var2 != null || z) {
                i = oig0Var2 != null ? oig0Var2.f144115b.f87273c : 1;
                if (z) {
                    int size = this.f126632l.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        int i3 = ((oig0) this.f126632l.get(i2)).f144115b.f87273c;
                        if (hpg0.m132337a(i3) > hpg0.m132337a(i)) {
                            i = i3;
                        }
                    }
                }
            }
            this.f126639s = i;
        }
        this.f126622b.getClass();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            m148731d(this.f126627g);
            this.f126622b.getClass();
            Bitmap bitmapM148732a = m148732a();
            this.f126633m = bitmapM148732a;
            b6g0 b6g0Var = this.f126623c;
            if (bitmapM148732a == null) {
                b6g0Var.m100405c(this);
            } else {
                b6g0Var.m100406d(this);
            }
        } catch (IOException e) {
            this.f126636p = e;
            fng0 fng0Var = this.f126623c.f73813h;
            fng0Var.sendMessageDelayed(fng0Var.obtainMessage(5, this), 500L);
        } catch (Exception e2) {
            this.f126636p = e2;
            fng0 fng0Var2 = this.f126623c.f73813h;
            fng0Var2.sendMessage(fng0Var2.obtainMessage(6, this));
        } catch (Sudimport e3) {
            this.f126636p = e3;
            fng0 fng0Var3 = this.f126623c.f73813h;
            fng0Var3.sendMessage(fng0Var3.obtainMessage(6, this));
        } catch (OutOfMemoryError e4) {
            StringWriter stringWriter = new StringWriter();
            this.f126625e.m180442a().m198720a(new PrintWriter(stringWriter));
            this.f126636p = new RuntimeException(stringWriter.toString(), e4);
            fng0 fng0Var4 = this.f126623c.f73813h;
            fng0Var4.sendMessage(fng0Var4.obtainMessage(6, this));
        } finally {
            Thread.currentThread().setName("SudPicasso-Idle");
        }
    }
}
