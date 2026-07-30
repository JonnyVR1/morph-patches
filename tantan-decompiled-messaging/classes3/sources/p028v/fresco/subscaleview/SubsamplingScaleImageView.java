package p028v.fresco.subscaleview;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import com.tantanapp.common.utils.CrashHelper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import l.b9c0;
import l.f3c;
import l.ig3;
import l.jfd0;
import org.eclipse.jetty.http.HttpStatus;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.spongycastle.crypto.tls.CipherSuite;
import p003l.bfm;
import p003l.bjf0;
import p003l.cjf0;
import p003l.ehd;
import p003l.gn5;
import p003l.k250;
import p003l.nim;
import p003l.xhm;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SubsamplingScaleImageView extends View {

    /* JADX INFO: renamed from: U0 */
    public static final List<Integer> f13206U0 = Arrays.asList(0, 90, Integer.valueOf(CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256), 270, -1);

    /* JADX INFO: renamed from: V0 */
    public static final List<Integer> f13207V0 = Arrays.asList(1, 2, 3);

    /* JADX INFO: renamed from: W0 */
    public static final List<Integer> f13208W0 = Arrays.asList(2, 1);

    /* JADX INFO: renamed from: X0 */
    public static final List<Integer> f13209X0 = Arrays.asList(1, 2, 3);

    /* JADX INFO: renamed from: Y0 */
    public static final List<Integer> f13210Y0 = Arrays.asList(2, 1, 3);

    /* JADX INFO: renamed from: Z0 */
    public static int f13211Z0 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: A */
    public PointF f13212A;

    /* JADX INFO: renamed from: B */
    public Float f13213B;

    /* JADX INFO: renamed from: C */
    public PointF f13214C;

    /* JADX INFO: renamed from: D */
    public PointF f13215D;

    /* JADX INFO: renamed from: E */
    public int f13216E;

    /* JADX INFO: renamed from: E0 */
    public PointF f13217E0;

    /* JADX INFO: renamed from: F */
    public int f13218F;

    /* JADX INFO: renamed from: F0 */
    public C1390c f13219F0;

    /* JADX INFO: renamed from: G */
    public int f13220G;

    /* JADX INFO: renamed from: G0 */
    public boolean f13221G0;

    /* JADX INFO: renamed from: H */
    public Rect f13222H;

    /* JADX INFO: renamed from: H0 */
    public boolean f13223H0;

    /* JADX INFO: renamed from: I */
    public Rect f13224I;

    /* JADX INFO: renamed from: I0 */
    public InterfaceC1395h f13225I0;

    /* JADX INFO: renamed from: J */
    public boolean f13226J;

    /* JADX INFO: renamed from: J0 */
    public View.OnLongClickListener f13227J0;

    /* JADX INFO: renamed from: K */
    public boolean f13228K;

    /* JADX INFO: renamed from: K0 */
    public Handler f13229K0;

    /* JADX INFO: renamed from: L */
    public boolean f13230L;

    /* JADX INFO: renamed from: L0 */
    public Paint f13231L0;

    /* JADX INFO: renamed from: M */
    public int f13232M;

    /* JADX INFO: renamed from: M0 */
    public Paint f13233M0;

    /* JADX INFO: renamed from: N */
    public GestureDetector f13234N;

    /* JADX INFO: renamed from: N0 */
    public Paint f13235N0;

    /* JADX INFO: renamed from: O */
    public xhm f13236O;

    /* JADX INFO: renamed from: O0 */
    public C1397j f13237O0;

    /* JADX INFO: renamed from: P */
    public final Object f13238P;

    /* JADX INFO: renamed from: P0 */
    public Matrix f13239P0;

    /* JADX INFO: renamed from: Q */
    public ehd<? extends bfm> f13240Q;

    /* JADX INFO: renamed from: Q0 */
    public RectF f13241Q0;

    /* JADX INFO: renamed from: R */
    public ehd<? extends xhm> f13242R;

    /* JADX INFO: renamed from: R0 */
    public float[] f13243R0;

    /* JADX INFO: renamed from: S */
    public PointF f13244S;

    /* JADX INFO: renamed from: S0 */
    public float[] f13245S0;

    /* JADX INFO: renamed from: T */
    public float f13246T;

    /* JADX INFO: renamed from: T0 */
    public float f13247T0;

    /* JADX INFO: renamed from: U */
    public final float f13248U;

    /* JADX INFO: renamed from: V */
    public float f13249V;

    /* JADX INFO: renamed from: W */
    public boolean f13250W;

    /* JADX INFO: renamed from: a */
    public Bitmap f13251a;

    /* JADX INFO: renamed from: b */
    public boolean f13252b;

    /* JADX INFO: renamed from: c */
    public boolean f13253c;

    /* JADX INFO: renamed from: d */
    public Uri f13254d;

    /* JADX INFO: renamed from: e */
    public int f13255e;

    /* JADX INFO: renamed from: f */
    public Map<Integer, List<C1398k>> f13256f;

    /* JADX INFO: renamed from: g */
    public boolean f13257g;

    /* JADX INFO: renamed from: h */
    public int f13258h;

    /* JADX INFO: renamed from: i */
    public float f13259i;

    /* JADX INFO: renamed from: j */
    public float f13260j;

    /* JADX INFO: renamed from: k */
    public int f13261k;

    /* JADX INFO: renamed from: k0 */
    public PointF f13262k0;

    /* JADX INFO: renamed from: l */
    public int f13263l;

    /* JADX INFO: renamed from: m */
    public int f13264m;

    /* JADX INFO: renamed from: n */
    public int f13265n;

    /* JADX INFO: renamed from: o */
    public int f13266o;

    /* JADX INFO: renamed from: p */
    public boolean f13267p;

    /* JADX INFO: renamed from: p0 */
    public PointF f13268p0;

    /* JADX INFO: renamed from: q */
    public boolean f13269q;

    /* JADX INFO: renamed from: r */
    public boolean f13270r;

    /* JADX INFO: renamed from: s */
    public boolean f13271s;

    /* JADX INFO: renamed from: t */
    public float f13272t;

    /* JADX INFO: renamed from: u */
    public int f13273u;

    /* JADX INFO: renamed from: v */
    public int f13274v;

    /* JADX INFO: renamed from: w */
    public float f13275w;

    /* JADX INFO: renamed from: x */
    public float f13276x;

    /* JADX INFO: renamed from: y */
    public PointF f13277y;

    /* JADX INFO: renamed from: z */
    public PointF f13278z;

    /* JADX INFO: renamed from: v.fresco.subscaleview.SubsamplingScaleImageView$a */
    public class C1388a implements Handler.Callback {
        public C1388a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1 && SubsamplingScaleImageView.this.f13227J0 != null) {
                SubsamplingScaleImageView.this.f13232M = 0;
                SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
                SubsamplingScaleImageView.super.setOnLongClickListener(subsamplingScaleImageView.f13227J0);
                SubsamplingScaleImageView.this.performLongClick();
                SubsamplingScaleImageView.super.setOnLongClickListener(null);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: v.fresco.subscaleview.SubsamplingScaleImageView$b */
    public class C1389b extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f13280a;

        public C1389b(Context context) {
            this.f13280a = context;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (!SubsamplingScaleImageView.this.f13270r || !SubsamplingScaleImageView.this.f13221G0 || SubsamplingScaleImageView.this.f13277y == null) {
                return super.onDoubleTapEvent(motionEvent);
            }
            SubsamplingScaleImageView.this.setGestureDetector(this.f13280a);
            boolean z = SubsamplingScaleImageView.this.f13271s;
            SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
            if (!z) {
                subsamplingScaleImageView.m11966V(subsamplingScaleImageView.m11957N0(new PointF(motionEvent.getX(), motionEvent.getY())), new PointF(motionEvent.getX(), motionEvent.getY()));
                return true;
            }
            subsamplingScaleImageView.f13244S = new PointF(motionEvent.getX(), motionEvent.getY());
            SubsamplingScaleImageView.this.f13278z = new PointF(SubsamplingScaleImageView.this.f13277y.x, SubsamplingScaleImageView.this.f13277y.y);
            SubsamplingScaleImageView subsamplingScaleImageView2 = SubsamplingScaleImageView.this;
            subsamplingScaleImageView2.f13276x = subsamplingScaleImageView2.f13275w;
            SubsamplingScaleImageView.this.f13230L = true;
            SubsamplingScaleImageView.this.f13226J = true;
            SubsamplingScaleImageView.this.f13249V = -1.0f;
            SubsamplingScaleImageView subsamplingScaleImageView3 = SubsamplingScaleImageView.this;
            subsamplingScaleImageView3.f13268p0 = subsamplingScaleImageView3.m11957N0(subsamplingScaleImageView3.f13244S);
            SubsamplingScaleImageView.this.f13217E0 = new PointF(motionEvent.getX(), motionEvent.getY());
            SubsamplingScaleImageView.this.f13262k0 = new PointF(SubsamplingScaleImageView.this.f13268p0.x, SubsamplingScaleImageView.this.f13268p0.y);
            SubsamplingScaleImageView.this.f13250W = false;
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!SubsamplingScaleImageView.this.f13269q || !SubsamplingScaleImageView.this.f13221G0 || SubsamplingScaleImageView.this.f13277y == null || motionEvent == null || motionEvent2 == null || ((Math.abs(motionEvent.getX() - motionEvent2.getX()) <= 50.0f && Math.abs(motionEvent.getY() - motionEvent2.getY()) <= 50.0f) || ((Math.abs(f) <= 500.0f && Math.abs(f2) <= 500.0f) || SubsamplingScaleImageView.this.f13226J))) {
                return super.onFling(motionEvent, motionEvent2, f, f2);
            }
            PointF pointF = new PointF(SubsamplingScaleImageView.this.f13277y.x + (f * 0.25f), SubsamplingScaleImageView.this.f13277y.y + (f2 * 0.25f));
            new C1391d(new PointF(((SubsamplingScaleImageView.this.getWidth() / 2) - pointF.x) / SubsamplingScaleImageView.this.f13275w, ((SubsamplingScaleImageView.this.getHeight() / 2) - pointF.y) / SubsamplingScaleImageView.this.f13275w)).m12027e(1).m12030h(false).m12029g(3).m12025c();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            SubsamplingScaleImageView.this.performClick();
            return true;
        }
    }

    /* JADX INFO: renamed from: v.fresco.subscaleview.SubsamplingScaleImageView$c */
    public static class C1390c {

        /* JADX INFO: renamed from: a */
        public float f13282a;

        /* JADX INFO: renamed from: b */
        public float f13283b;

        /* JADX INFO: renamed from: c */
        public PointF f13284c;

        /* JADX INFO: renamed from: d */
        public PointF f13285d;

        /* JADX INFO: renamed from: e */
        public PointF f13286e;

        /* JADX INFO: renamed from: f */
        public PointF f13287f;

        /* JADX INFO: renamed from: g */
        public PointF f13288g;

        /* JADX INFO: renamed from: h */
        public long f13289h;

        /* JADX INFO: renamed from: i */
        public boolean f13290i;

        /* JADX INFO: renamed from: j */
        public int f13291j;

        /* JADX INFO: renamed from: k */
        public int f13292k;

        /* JADX INFO: renamed from: l */
        public long f13293l;

        public C1390c() {
            this.f13289h = 500L;
            this.f13290i = true;
            this.f13291j = 2;
            this.f13292k = 1;
            this.f13293l = System.currentTimeMillis();
        }

        /* JADX INFO: renamed from: d */
        public static /* bridge */ /* synthetic */ InterfaceC1394g m12000d(C1390c c1390c) {
            c1390c.getClass();
            return null;
        }
    }

    /* JADX INFO: renamed from: v.fresco.subscaleview.SubsamplingScaleImageView$e */
    public static class AsyncTaskC1392e extends AsyncTask<Void, Void, Integer> {

        /* JADX INFO: renamed from: a */
        public final WeakReference<SubsamplingScaleImageView> f13303a;

        /* JADX INFO: renamed from: b */
        public final WeakReference<Context> f13304b;

        /* JADX INFO: renamed from: c */
        public final WeakReference<ehd<? extends bfm>> f13305c;

        /* JADX INFO: renamed from: d */
        public final Uri f13306d;

        /* JADX INFO: renamed from: e */
        public final boolean f13307e;

        /* JADX INFO: renamed from: f */
        public Bitmap f13308f;

        /* JADX INFO: renamed from: g */
        public Exception f13309g;

        public AsyncTaskC1392e(SubsamplingScaleImageView subsamplingScaleImageView, Context context, ehd<? extends bfm> ehdVar, Uri uri, boolean z) {
            this.f13303a = new WeakReference<>(subsamplingScaleImageView);
            this.f13304b = new WeakReference<>(context);
            this.f13305c = new WeakReference<>(ehdVar);
            this.f13306d = uri;
            this.f13307e = z;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(Void... voidArr) {
            try {
                String string = this.f13306d.toString();
                Context context = this.f13304b.get();
                ehd<? extends bfm> ehdVar = this.f13305c.get();
                SubsamplingScaleImageView subsamplingScaleImageView = this.f13303a.get();
                if (context == null || ehdVar == null || subsamplingScaleImageView == null) {
                    return null;
                }
                subsamplingScaleImageView.m11964T("BitmapLoadTask.doInBackground", new Object[0]);
                this.f13308f = ehdVar.mo3835a().mo2943a(context, this.f13306d);
                return Integer.valueOf(subsamplingScaleImageView.m11974d0(context, string));
            } catch (Exception e) {
                CrashHelper.c(e);
                this.f13309g = e;
                return null;
            } catch (OutOfMemoryError e2) {
                CrashHelper.c(e2);
                this.f13309g = new RuntimeException(e2);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            SubsamplingScaleImageView subsamplingScaleImageView = this.f13303a.get();
            if (subsamplingScaleImageView != null) {
                Bitmap bitmap = this.f13308f;
                if (bitmap != null && num != null) {
                    if (this.f13307e) {
                        subsamplingScaleImageView.m11985o0(bitmap);
                        return;
                    } else {
                        subsamplingScaleImageView.m11984n0(bitmap, num.intValue(), false);
                        return;
                    }
                }
                if (this.f13309g == null || subsamplingScaleImageView.f13225I0 == null) {
                    return;
                }
                if (this.f13307e) {
                    subsamplingScaleImageView.f13225I0.mo12035c(this.f13309g);
                } else {
                    subsamplingScaleImageView.f13225I0.mo12038f(this.f13309g);
                }
            }
        }
    }

    /* JADX INFO: renamed from: v.fresco.subscaleview.SubsamplingScaleImageView$f */
    public static class C1393f implements InterfaceC1395h {
        @Override // p028v.fresco.subscaleview.SubsamplingScaleImageView.InterfaceC1395h
        /* JADX INFO: renamed from: a */
        public void mo12033a() {
        }

        @Override // p028v.fresco.subscaleview.SubsamplingScaleImageView.InterfaceC1395h
        /* JADX INFO: renamed from: b */
        public void mo12034b() {
        }

        @Override // p028v.fresco.subscaleview.SubsamplingScaleImageView.InterfaceC1395h
        /* JADX INFO: renamed from: c */
        public void mo12035c(Exception exc) {
        }

        @Override // p028v.fresco.subscaleview.SubsamplingScaleImageView.InterfaceC1395h
        /* JADX INFO: renamed from: d */
        public void mo12036d(Exception exc) {
        }

        @Override // p028v.fresco.subscaleview.SubsamplingScaleImageView.InterfaceC1395h
        /* JADX INFO: renamed from: e */
        public void mo12037e() {
        }

        @Override // p028v.fresco.subscaleview.SubsamplingScaleImageView.InterfaceC1395h
        /* JADX INFO: renamed from: f */
        public void mo12038f(Exception exc) {
        }
    }

    /* JADX INFO: renamed from: v.fresco.subscaleview.SubsamplingScaleImageView$g */
    public interface InterfaceC1394g {
    }

    /* JADX INFO: renamed from: v.fresco.subscaleview.SubsamplingScaleImageView$h */
    public interface InterfaceC1395h {
        /* JADX INFO: renamed from: a */
        void mo12033a();

        /* JADX INFO: renamed from: b */
        void mo12034b();

        /* JADX INFO: renamed from: c */
        void mo12035c(Exception exc);

        /* JADX INFO: renamed from: d */
        void mo12036d(Exception exc);

        /* JADX INFO: renamed from: e */
        void mo12037e();

        /* JADX INFO: renamed from: f */
        void mo12038f(Exception exc);
    }

    /* JADX INFO: renamed from: v.fresco.subscaleview.SubsamplingScaleImageView$i */
    public interface InterfaceC1396i {
    }

    /* JADX INFO: renamed from: v.fresco.subscaleview.SubsamplingScaleImageView$j */
    public static class C1397j {

        /* JADX INFO: renamed from: a */
        public float f13310a;

        /* JADX INFO: renamed from: b */
        public PointF f13311b;

        public C1397j(float f, PointF pointF) {
            this.f13310a = f;
            this.f13311b = pointF;
        }
    }

    /* JADX INFO: renamed from: v.fresco.subscaleview.SubsamplingScaleImageView$k */
    public static class C1398k {

        /* JADX INFO: renamed from: a */
        public Rect f13312a;

        /* JADX INFO: renamed from: b */
        public int f13313b;

        /* JADX INFO: renamed from: c */
        public Bitmap f13314c;

        /* JADX INFO: renamed from: d */
        public boolean f13315d;

        /* JADX INFO: renamed from: e */
        public boolean f13316e;

        /* JADX INFO: renamed from: f */
        public Rect f13317f;

        /* JADX INFO: renamed from: g */
        public Rect f13318g;

        public C1398k() {
        }
    }

    /* JADX INFO: renamed from: v.fresco.subscaleview.SubsamplingScaleImageView$l */
    public static class AsyncTaskC1399l extends AsyncTask<Void, Void, Bitmap> {

        /* JADX INFO: renamed from: a */
        public final WeakReference<SubsamplingScaleImageView> f13319a;

        /* JADX INFO: renamed from: b */
        public final WeakReference<xhm> f13320b;

        /* JADX INFO: renamed from: c */
        public final WeakReference<C1398k> f13321c;

        /* JADX INFO: renamed from: d */
        public Exception f13322d;

        public AsyncTaskC1399l(SubsamplingScaleImageView subsamplingScaleImageView, xhm xhmVar, C1398k c1398k) {
            this.f13319a = new WeakReference<>(subsamplingScaleImageView);
            this.f13320b = new WeakReference<>(xhmVar);
            this.f13321c = new WeakReference<>(c1398k);
            c1398k.f13315d = true;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap doInBackground(Void... voidArr) {
            Bitmap bitmapMo3341c;
            try {
                SubsamplingScaleImageView subsamplingScaleImageView = this.f13319a.get();
                xhm xhmVar = this.f13320b.get();
                C1398k c1398k = this.f13321c.get();
                if (xhmVar == null || c1398k == null || subsamplingScaleImageView == null || !xhmVar.mo3340b() || !c1398k.f13316e) {
                    if (c1398k == null) {
                        return null;
                    }
                    c1398k.f13315d = false;
                    return null;
                }
                subsamplingScaleImageView.m11964T("TileLoadTask.doInBackground, tile.sRect=%s, tile.sampleSize=%d", c1398k.f13312a, Integer.valueOf(c1398k.f13313b));
                synchronized (subsamplingScaleImageView.f13238P) {
                    try {
                        subsamplingScaleImageView.m11971a0(c1398k.f13312a, c1398k.f13318g);
                        if (subsamplingScaleImageView.f13222H != null) {
                            c1398k.f13318g.offset(subsamplingScaleImageView.f13222H.left, subsamplingScaleImageView.f13222H.top);
                        }
                        bitmapMo3341c = xhmVar.mo3341c(c1398k.f13318g, c1398k.f13313b);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return bitmapMo3341c;
            } catch (Exception e) {
                CrashHelper.c(e);
                this.f13322d = e;
                return null;
            } catch (OutOfMemoryError e2) {
                CrashHelper.c(e2);
                this.f13322d = new RuntimeException(e2);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Bitmap bitmap) {
            SubsamplingScaleImageView subsamplingScaleImageView = this.f13319a.get();
            C1398k c1398k = this.f13321c.get();
            if (subsamplingScaleImageView == null || c1398k == null) {
                return;
            }
            if (bitmap != null) {
                c1398k.f13314c = bitmap;
                c1398k.f13315d = false;
                subsamplingScaleImageView.m11987q0();
            } else {
                if (this.f13322d == null || subsamplingScaleImageView.f13225I0 == null) {
                    return;
                }
                subsamplingScaleImageView.f13225I0.mo12036d(this.f13322d);
            }
        }
    }

    /* JADX INFO: renamed from: v.fresco.subscaleview.SubsamplingScaleImageView$m */
    public static class AsyncTaskC1400m extends AsyncTask<Void, Void, int[]> {

        /* JADX INFO: renamed from: a */
        public final WeakReference<SubsamplingScaleImageView> f13323a;

        /* JADX INFO: renamed from: b */
        public final WeakReference<Context> f13324b;

        /* JADX INFO: renamed from: c */
        public final WeakReference<ehd<? extends xhm>> f13325c;

        /* JADX INFO: renamed from: d */
        public final Uri f13326d;

        /* JADX INFO: renamed from: e */
        public xhm f13327e;

        /* JADX INFO: renamed from: f */
        public Exception f13328f;

        public AsyncTaskC1400m(SubsamplingScaleImageView subsamplingScaleImageView, Context context, ehd<? extends xhm> ehdVar, Uri uri) {
            this.f13323a = new WeakReference<>(subsamplingScaleImageView);
            this.f13324b = new WeakReference<>(context);
            this.f13325c = new WeakReference<>(ehdVar);
            this.f13326d = uri;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int[] doInBackground(Void... voidArr) {
            try {
                String string = this.f13326d.toString();
                Context context = this.f13324b.get();
                ehd<? extends xhm> ehdVar = this.f13325c.get();
                SubsamplingScaleImageView subsamplingScaleImageView = this.f13323a.get();
                if (context == null || ehdVar == null || subsamplingScaleImageView == null) {
                    return null;
                }
                subsamplingScaleImageView.m11964T("TilesInitTask.doInBackground", new Object[0]);
                xhm xhmVarMo3835a = ehdVar.mo3835a();
                this.f13327e = xhmVarMo3835a;
                Point pointMo3339a = xhmVarMo3835a.mo3339a(context, this.f13326d);
                int iWidth = pointMo3339a.x;
                int iHeight = pointMo3339a.y;
                int iM11974d0 = subsamplingScaleImageView.m11974d0(context, string);
                if (subsamplingScaleImageView.f13222H != null) {
                    iWidth = subsamplingScaleImageView.f13222H.width();
                    iHeight = subsamplingScaleImageView.f13222H.height();
                }
                return new int[]{iWidth, iHeight, iM11974d0};
            } catch (Exception e) {
                CrashHelper.c(e);
                this.f13328f = e;
                return null;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(int[] iArr) {
            SubsamplingScaleImageView subsamplingScaleImageView = this.f13323a.get();
            if (subsamplingScaleImageView != null) {
                xhm xhmVar = this.f13327e;
                if (xhmVar != null && iArr != null && iArr.length == 3) {
                    subsamplingScaleImageView.m11988r0(xhmVar, iArr[0], iArr[1], iArr[2]);
                } else {
                    if (this.f13328f == null || subsamplingScaleImageView.f13225I0 == null) {
                        return;
                    }
                    subsamplingScaleImageView.f13225I0.mo12038f(this.f13328f);
                }
            }
        }
    }

    public SubsamplingScaleImageView(Context context, AttributeSet attributeSet) {
        int resourceId;
        String string;
        super(context, attributeSet);
        this.f13258h = 0;
        this.f13259i = 2.0f;
        this.f13260j = m11982l0();
        this.f13261k = -1;
        this.f13263l = 1;
        this.f13264m = 1;
        int i = f13211Z0;
        this.f13265n = i;
        this.f13266o = i;
        this.f13269q = true;
        this.f13270r = true;
        this.f13271s = true;
        this.f13272t = 1.0f;
        this.f13273u = 1;
        this.f13274v = HttpStatus.INTERNAL_SERVER_ERROR_500;
        this.f13238P = new Object();
        this.f13240Q = new gn5(bjf0.class);
        this.f13242R = new gn5(cjf0.class);
        this.f13243R0 = new float[8];
        this.f13245S0 = new float[8];
        this.f13247T0 = getResources().getDisplayMetrics().density;
        setMinimumDpi(CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256);
        setDoubleTapZoomDpi(CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256);
        setGestureDetector(context);
        this.f13229K0 = new Handler(new C1388a());
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b9c0.Y1);
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.Z1) && (string = typedArrayObtainStyledAttributes.getString(b9c0.Z1)) != null && string.length() > 0) {
                setImage(nim.m6537a(string).m6549l());
            }
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.c2) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(b9c0.c2, 0)) > 0) {
                setImage(nim.m6538j(resourceId).m6549l());
            }
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.a2)) {
                setPanEnabled(typedArrayObtainStyledAttributes.getBoolean(b9c0.a2, true));
            }
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.e2)) {
                setZoomEnabled(typedArrayObtainStyledAttributes.getBoolean(b9c0.e2, true));
            }
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.b2)) {
                setQuickScaleEnabled(typedArrayObtainStyledAttributes.getBoolean(b9c0.b2, true));
            }
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.d2)) {
                setTileBackgroundColor(typedArrayObtainStyledAttributes.getColor(b9c0.d2, Color.argb(0, 0, 0, 0)));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f13248U = TypedValue.applyDimension(1, 20.0f, context.getResources().getDisplayMetrics());
    }

    @AnyThread
    private int getRequiredRotation() {
        int i = this.f13258h;
        return i == -1 ? this.f13220G : i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGestureDetector(Context context) {
        this.f13234N = new GestureDetector(context, new C1389b(context));
    }

    /* JADX INFO: renamed from: A0 */
    public final void m11944A0(float f, PointF pointF, int i) {
    }

    /* JADX INFO: renamed from: B0 */
    public final void m11945B0(nim nimVar, nim nimVar2, ImageViewState imageViewState) {
        if (nimVar == null) {
            jfd0.a("imageSource must not be null");
            return;
        }
        m11993w0(true);
        if (imageViewState != null) {
            m11994x0(imageViewState);
        }
        if (nimVar2 != null) {
            if (nimVar.m6540b() != null) {
                ig3.a("Preview image cannot be used when a bitmap is provided for the main image");
                return;
            }
            if (nimVar.m6544f() <= 0 || nimVar.m6542d() <= 0) {
                ig3.a("Preview image cannot be used unless dimensions are provided for the main image");
                return;
            }
            this.f13216E = nimVar.m6544f();
            this.f13218F = nimVar.m6542d();
            this.f13224I = nimVar2.m6543e();
            if (nimVar2.m6540b() != null) {
                this.f13253c = nimVar2.m6547i();
                m11985o0(nimVar2.m6540b());
            } else {
                Uri uriM6546h = nimVar2.m6546h();
                if (uriM6546h == null && nimVar2.m6541c() != null) {
                    uriM6546h = Uri.parse("android.resource://" + getContext().getPackageName() + "/" + nimVar2.m6541c());
                }
                m11970Z(new AsyncTaskC1392e(this, getContext(), this.f13240Q, uriM6546h, true));
            }
        }
        if (nimVar.m6540b() != null && nimVar.m6543e() != null) {
            m11984n0(Bitmap.createBitmap(nimVar.m6540b(), nimVar.m6543e().left, nimVar.m6543e().top, nimVar.m6543e().width(), nimVar.m6543e().height()), 0, false);
            return;
        }
        if (nimVar.m6540b() != null) {
            m11984n0(nimVar.m6540b(), 0, nimVar.m6547i());
            return;
        }
        this.f13222H = nimVar.m6543e();
        Uri uriM6546h2 = nimVar.m6546h();
        this.f13254d = uriM6546h2;
        if (uriM6546h2 == null && nimVar.m6541c() != null) {
            this.f13254d = Uri.parse("android.resource://" + getContext().getPackageName() + "/" + nimVar.m6541c());
        }
        if (nimVar.m6545g() || this.f13222H != null) {
            m11970Z(new AsyncTaskC1400m(this, getContext(), this.f13242R, this.f13254d));
        } else {
            m11970Z(new AsyncTaskC1392e(this, getContext(), this.f13240Q, this.f13254d, false));
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final void m11946C0(float[] fArr, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m11947D0(float f, PointF pointF) {
        this.f13219F0 = null;
        this.f13213B = Float.valueOf(f);
        this.f13214C = pointF;
        this.f13215D = pointF;
        invalidate();
    }

    /* JADX INFO: renamed from: E0 */
    public final PointF m11948E0(float f, float f2, PointF pointF) {
        if (this.f13277y == null) {
            return null;
        }
        pointF.set(m11951H0(f), m11952I0(f2));
        return pointF;
    }

    /* JADX INFO: renamed from: F0 */
    public final PointF m11949F0(PointF pointF) {
        return m11948E0(pointF.x, pointF.y, new PointF());
    }

    /* JADX INFO: renamed from: G0 */
    public final Rect m11950G0(Rect rect, Rect rect2) {
        rect2.set((int) m11951H0(rect.left), (int) m11952I0(rect.top), (int) m11951H0(rect.right), (int) m11952I0(rect.bottom));
        return rect2;
    }

    /* JADX INFO: renamed from: H0 */
    public final float m11951H0(float f) {
        PointF pointF = this.f13277y;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f * this.f13275w) + pointF.x;
    }

    /* JADX INFO: renamed from: I0 */
    public final float m11952I0(float f) {
        PointF pointF = this.f13277y;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f * this.f13275w) + pointF.y;
    }

    /* JADX INFO: renamed from: J0 */
    public final boolean m11953J0(C1398k c1398k) {
        return m11958O0(0.0f) <= ((float) c1398k.f13312a.right) && ((float) c1398k.f13312a.left) <= m11958O0((float) getWidth()) && m11960P0(0.0f) <= ((float) c1398k.f13312a.bottom) && ((float) c1398k.f13312a.top) <= m11960P0((float) getHeight());
    }

    /* JADX INFO: renamed from: K0 */
    public final PointF m11954K0(float f, float f2, float f3) {
        int paddingLeft = getPaddingLeft() + (((getWidth() - getPaddingRight()) - getPaddingLeft()) / 2);
        int paddingTop = getPaddingTop() + (((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
        if (this.f13237O0 == null) {
            this.f13237O0 = new C1397j(0.0f, new PointF(0.0f, 0.0f));
        }
        this.f13237O0.f13310a = f3;
        this.f13237O0.f13311b.set(paddingLeft - (f * f3), paddingTop - (f2 * f3));
        m11973c0(true, this.f13237O0);
        return this.f13237O0.f13311b;
    }

    /* JADX INFO: renamed from: L0 */
    public final PointF m11955L0(float f, float f2) {
        return m11956M0(f, f2, new PointF());
    }

    /* JADX INFO: renamed from: M0 */
    public final PointF m11956M0(float f, float f2, PointF pointF) {
        if (this.f13277y == null) {
            return null;
        }
        pointF.set(m11958O0(f), m11960P0(f2));
        return pointF;
    }

    /* JADX INFO: renamed from: N0 */
    public final PointF m11957N0(PointF pointF) {
        return m11956M0(pointF.x, pointF.y, new PointF());
    }

    /* JADX INFO: renamed from: O0 */
    public final float m11958O0(float f) {
        PointF pointF = this.f13277y;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f - pointF.x) / this.f13275w;
    }

    /* JADX INFO: renamed from: P */
    public final int m11959P(float f) {
        int iRound;
        if (this.f13261k > 0) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            f *= this.f13261k / ((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f);
        }
        int iM11996z0 = (int) (m11996z0() * f);
        int iM11995y0 = (int) (m11995y0() * f);
        if (iM11996z0 == 0 || iM11995y0 == 0) {
            return 32;
        }
        int i = 1;
        if (m11995y0() > iM11995y0 || m11996z0() > iM11996z0) {
            iRound = Math.round(m11995y0() / iM11995y0);
            int iRound2 = Math.round(m11996z0() / iM11996z0);
            if (iRound >= iRound2) {
                iRound = iRound2;
            }
        } else {
            iRound = 1;
        }
        while (true) {
            int i2 = i * 2;
            if (i2 >= iRound) {
                return i;
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final float m11960P0(float f) {
        PointF pointF = this.f13277y;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f - pointF.y) / this.f13275w;
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m11961Q() {
        boolean zM11978h0 = m11978h0();
        if (!this.f13223H0 && zM11978h0) {
            m11990t0();
            this.f13223H0 = true;
            m11983m0();
            InterfaceC1395h interfaceC1395h = this.f13225I0;
            if (interfaceC1395h != null) {
                interfaceC1395h.mo12034b();
            }
        }
        return zM11978h0;
    }

    /* JADX INFO: renamed from: R */
    public final boolean m11962R() {
        boolean z = getWidth() > 0 && getHeight() > 0 && this.f13216E > 0 && this.f13218F > 0 && (this.f13251a != null || m11978h0());
        if (!this.f13221G0 && z) {
            m11990t0();
            this.f13221G0 = true;
            m11986p0();
            InterfaceC1395h interfaceC1395h = this.f13225I0;
            if (interfaceC1395h != null) {
                interfaceC1395h.mo12037e();
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: S */
    public final void m11963S() {
        if (this.f13231L0 == null) {
            Paint paint = new Paint();
            this.f13231L0 = paint;
            paint.setAntiAlias(true);
            this.f13231L0.setFilterBitmap(true);
            this.f13231L0.setDither(true);
        }
        if (this.f13233M0 == null && this.f13257g) {
            Paint paint2 = new Paint();
            this.f13233M0 = paint2;
            paint2.setTextSize(18.0f);
            this.f13233M0.setColor(-65281);
            this.f13233M0.setStyle(Paint.Style.STROKE);
        }
    }

    @AnyThread
    /* JADX INFO: renamed from: T */
    public final void m11964T(String str, Object... objArr) {
    }

    /* JADX INFO: renamed from: U */
    public final float m11965U(float f, float f2, float f3, float f4) {
        float f5 = f - f2;
        float f6 = f3 - f4;
        return (float) Math.sqrt((f5 * f5) + (f6 * f6));
    }

    /* JADX INFO: renamed from: V */
    public final void m11966V(PointF pointF, PointF pointF2) {
        SubsamplingScaleImageView subsamplingScaleImageView;
        if (!this.f13269q) {
            PointF pointF3 = this.f13215D;
            if (pointF3 != null) {
                pointF.x = pointF3.x;
                pointF.y = pointF3.y;
            } else {
                pointF.x = m11996z0() / 2;
                pointF.y = m11995y0() / 2;
            }
        }
        float fMin = Math.min(this.f13259i, this.f13272t);
        boolean z = ((double) this.f13275w) <= ((double) fMin) * 0.9d;
        if (!z) {
            fMin = m11982l0();
        }
        float f = fMin;
        int i = this.f13273u;
        if (i != 3) {
            if (i == 2 || !z || !this.f13269q) {
                subsamplingScaleImageView = this;
                new C1391d(f, pointF).m12028f(false).m12026d(subsamplingScaleImageView.f13274v).m12029g(4).m12025c();
            } else if (i == 1) {
                subsamplingScaleImageView = this;
                new C1391d(f, pointF, pointF2).m12028f(false).m12026d(subsamplingScaleImageView.f13274v).m12029g(4).m12025c();
            }
            subsamplingScaleImageView.invalidate();
        }
        m11947D0(f, pointF);
        subsamplingScaleImageView = this;
        subsamplingScaleImageView.invalidate();
    }

    /* JADX INFO: renamed from: W */
    public final float m11967W(int i, long j, float f, float f2, long j2) {
        if (i == 1) {
            return m11969Y(j, f, f2, j2);
        }
        if (i == 2) {
            return m11968X(j, f, f2, j2);
        }
        f3c.a("Unexpected easing type: ", i);
        return 0.0f;
    }

    /* JADX INFO: renamed from: X */
    public final float m11968X(long j, float f, float f2, long j2) {
        float f3;
        float f4 = j / (j2 / 2.0f);
        if (f4 < 1.0f) {
            f3 = (f2 / 2.0f) * f4;
        } else {
            float f5 = f4 - 1.0f;
            f3 = (-f2) / 2.0f;
            f4 = (f5 * (f5 - 2.0f)) - 1.0f;
        }
        return (f3 * f4) + f;
    }

    /* JADX INFO: renamed from: Y */
    public final float m11969Y(long j, float f, float f2, long j2) {
        float f3 = j / j2;
        return ((-f2) * f3 * (f3 - 2.0f)) + f;
    }

    /* JADX INFO: renamed from: Z */
    public final void m11970Z(AsyncTask<Void, Void, ?> asyncTask) {
        if (this.f13267p) {
            try {
                AsyncTask.class.getMethod("executeOnExecutor", Executor.class, Object[].class).invoke(asyncTask, (Executor) AsyncTask.class.getField("THREAD_POOL_EXECUTOR").get(null), null);
                return;
            } catch (Exception e) {
                CrashHelper.c(e);
            }
        }
        asyncTask.execute(new Void[0]);
    }

    @AnyThread
    /* JADX INFO: renamed from: a0 */
    public final void m11971a0(Rect rect, Rect rect2) {
        if (getRequiredRotation() == 0) {
            rect2.set(rect);
            return;
        }
        if (getRequiredRotation() == 90) {
            int i = rect.top;
            int i2 = this.f13218F;
            rect2.set(i, i2 - rect.right, rect.bottom, i2 - rect.left);
            return;
        }
        int requiredRotation = getRequiredRotation();
        int i3 = this.f13216E;
        if (requiredRotation != 180) {
            rect2.set(i3 - rect.bottom, rect.left, i3 - rect.top, rect.right);
            return;
        }
        int i4 = i3 - rect.right;
        int i5 = this.f13218F;
        rect2.set(i4, i5 - rect.bottom, i3 - rect.left, i5 - rect.top);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m11972b0(boolean z) {
        boolean z2;
        float f = 0.0f;
        if (this.f13277y == null) {
            this.f13277y = new PointF(0.0f, 0.0f);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f13237O0 == null) {
            this.f13237O0 = new C1397j(f, new PointF(0.0f, 0.0f));
        }
        this.f13237O0.f13310a = this.f13275w;
        this.f13237O0.f13311b.set(this.f13277y);
        m11973c0(z, this.f13237O0);
        this.f13275w = this.f13237O0.f13310a;
        this.f13277y.set(this.f13237O0.f13311b);
        if (z2) {
            this.f13277y.set(m11954K0(m11996z0() / 2, m11995y0() / 2, this.f13275w));
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m11973c0(boolean z, C1397j c1397j) {
        float fMax;
        int iMax;
        float fMax2;
        if (this.f13263l == 2 && m11979i0()) {
            z = false;
        }
        PointF pointF = c1397j.f13311b;
        float fM11981k0 = m11981k0(c1397j.f13310a);
        float fM11996z0 = m11996z0() * fM11981k0;
        float fM11995y0 = m11995y0() * fM11981k0;
        if (this.f13263l == 3 && m11979i0()) {
            pointF.x = Math.max(pointF.x, (getWidth() / 2) - fM11996z0);
            pointF.y = Math.max(pointF.y, (getHeight() / 2) - fM11995y0);
        } else if (z) {
            pointF.x = Math.max(pointF.x, getWidth() - fM11996z0);
            pointF.y = Math.max(pointF.y, getHeight() - fM11995y0);
        } else {
            pointF.x = Math.max(pointF.x, -fM11996z0);
            pointF.y = Math.max(pointF.y, -fM11995y0);
        }
        float paddingLeft = (getPaddingLeft() > 0 || getPaddingRight() > 0) ? getPaddingLeft() / (getPaddingLeft() + getPaddingRight()) : 0.5f;
        float paddingTop = (getPaddingTop() > 0 || getPaddingBottom() > 0) ? getPaddingTop() / (getPaddingTop() + getPaddingBottom()) : 0.5f;
        if (this.f13263l != 3 || !m11979i0()) {
            if (z) {
                fMax = Math.max(0.0f, (getWidth() - fM11996z0) * paddingLeft);
                fMax2 = Math.max(0.0f, (getHeight() - fM11995y0) * paddingTop);
            } else {
                fMax = Math.max(0, getWidth());
                iMax = Math.max(0, getHeight());
            }
            pointF.x = Math.min(pointF.x, fMax);
            pointF.y = Math.min(pointF.y, fMax2);
            c1397j.f13310a = fM11981k0;
        }
        fMax = Math.max(0, getWidth() / 2);
        iMax = Math.max(0, getHeight() / 2);
        fMax2 = iMax;
        pointF.x = Math.min(pointF.x, fMax);
        pointF.y = Math.min(pointF.y, fMax2);
        c1397j.f13310a = fM11981k0;
    }

    @AnyThread
    /* JADX INFO: renamed from: d0 */
    public final int m11974d0(Context context, String str) {
        int i = 0;
        if (str.startsWith("content")) {
            Cursor cursorQuery = null;
            try {
                try {
                    cursorQuery = context.getContentResolver().query(Uri.parse(str), new String[]{"orientation"}, null, null, null);
                    if (cursorQuery != null && cursorQuery.moveToFirst()) {
                        int i2 = cursorQuery.getInt(0);
                        if (f13206U0.contains(Integer.valueOf(i2)) && i2 != -1) {
                            i = i2;
                        }
                    }
                } catch (Exception e) {
                    CrashHelper.c(e);
                }
            } finally {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        } else if (str.startsWith("file:///") && !str.startsWith("file:///android_asset/")) {
            try {
                int attributeInt = new ExifInterface(str.substring(7)).getAttributeInt("Orientation", 1);
                if (attributeInt != 1 && attributeInt != 0) {
                    if (attributeInt == 6) {
                        return 90;
                    }
                    if (attributeInt == 3) {
                        return CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256;
                    }
                    if (attributeInt == 8) {
                        return 270;
                    }
                }
                return 0;
            } catch (Exception e2) {
                CrashHelper.c(e2);
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: e0 */
    public final Point m11975e0(Canvas canvas) {
        int iIntValue;
        int iIntValue2 = PKIFailureInfo.wrongIntegrity;
        try {
            iIntValue = ((Integer) Canvas.class.getMethod("getMaximumBitmapWidth", null).invoke(canvas, null)).intValue();
            try {
                iIntValue2 = ((Integer) Canvas.class.getMethod("getMaximumBitmapHeight", null).invoke(canvas, null)).intValue();
            } catch (Exception e) {
                e = e;
                CrashHelper.c(e);
            }
        } catch (Exception e2) {
            e = e2;
            iIntValue = 2048;
        }
        return new Point(Math.min(iIntValue, this.f13265n), Math.min(iIntValue2, this.f13266o));
    }

    /* JADX INFO: renamed from: f0 */
    public final synchronized void m11976f0(Point point) throws Throwable {
        Throwable th;
        SubsamplingScaleImageView subsamplingScaleImageView;
        try {
            try {
                m11964T("initialiseBaseLayer maxTileDimensions=%dx%d", Integer.valueOf(point.x), Integer.valueOf(point.y));
                C1397j c1397j = new C1397j(0.0f, new PointF(0.0f, 0.0f));
                this.f13237O0 = c1397j;
                m11973c0(true, c1397j);
                int iM11959P = m11959P(this.f13237O0.f13310a);
                this.f13255e = iM11959P;
                if (iM11959P > 1) {
                    try {
                        this.f13255e = iM11959P / 2;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                if (this.f13255e != 1 || this.f13222H != null || m11996z0() >= point.x || m11995y0() >= point.y) {
                    subsamplingScaleImageView = this;
                    subsamplingScaleImageView.m11977g0(point);
                    Iterator<C1398k> it = subsamplingScaleImageView.f13256f.get(Integer.valueOf(subsamplingScaleImageView.f13255e)).iterator();
                    while (it.hasNext()) {
                        subsamplingScaleImageView.m11970Z(new AsyncTaskC1399l(subsamplingScaleImageView, subsamplingScaleImageView.f13236O, it.next()));
                    }
                    subsamplingScaleImageView.m11991u0(true);
                } else {
                    this.f13236O.recycle();
                    this.f13236O = null;
                    subsamplingScaleImageView = this;
                    subsamplingScaleImageView.m11970Z(new AsyncTaskC1392e(subsamplingScaleImageView, getContext(), this.f13240Q, this.f13254d, false));
                }
                return;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g0 */
    public final void m11977g0(Point point) {
        m11964T("initialiseTileMap maxTileDimensions=%dx%d", Integer.valueOf(point.x), Integer.valueOf(point.y));
        this.f13256f = new LinkedHashMap();
        int i = this.f13255e;
        int i2 = 1;
        int i3 = 1;
        int i4 = 1;
        while (true) {
            int iM11996z0 = m11996z0() / i3;
            int iM11995y0 = m11995y0() / i4;
            int i5 = iM11996z0 / i;
            int i6 = iM11995y0 / i;
            while (true) {
                if (i5 + i3 + i2 <= point.x && (i5 <= ((double) getWidth()) * 1.25d || i >= this.f13255e)) {
                    break;
                }
                i3++;
                iM11996z0 = m11996z0() / i3;
                i5 = iM11996z0 / i;
            }
            while (true) {
                if (i6 + i4 + i2 <= point.y && (i6 <= ((double) getHeight()) * 1.25d || i >= this.f13255e)) {
                    break;
                }
                i4++;
                iM11995y0 = m11995y0() / i4;
                i6 = iM11995y0 / i;
            }
            ArrayList arrayList = new ArrayList(i3 * i4);
            int i7 = 0;
            while (i7 < i3) {
                int i8 = 0;
                while (i8 < i4) {
                    C1398k c1398k = new C1398k();
                    c1398k.f13313b = i;
                    c1398k.f13316e = i == this.f13255e ? i2 : 0;
                    c1398k.f13312a = new Rect(i7 * iM11996z0, i8 * iM11995y0, i7 == i3 + (-1) ? m11996z0() : (i7 + 1) * iM11996z0, i8 == i4 + (-1) ? m11995y0() : (i8 + 1) * iM11995y0);
                    c1398k.f13317f = new Rect(0, 0, 0, 0);
                    c1398k.f13318g = new Rect(c1398k.f13312a);
                    arrayList.add(c1398k);
                    i8++;
                    i2 = 1;
                }
                i7++;
                i2 = 1;
            }
            this.f13256f.put(Integer.valueOf(i), arrayList);
            i2 = 1;
            if (i == 1) {
                return;
            } else {
                i /= 2;
            }
        }
    }

    public final int getAppliedOrientation() {
        return getRequiredRotation();
    }

    public final PointF getCenter() {
        return m11955L0(getWidth() / 2, getHeight() / 2);
    }

    public float getMaxScale() {
        return this.f13259i;
    }

    public final float getMinScale() {
        return m11982l0();
    }

    public final int getOrientation() {
        return this.f13258h;
    }

    public final int getSHeight() {
        return this.f13218F;
    }

    public final int getSWidth() {
        return this.f13216E;
    }

    public final float getScale() {
        return this.f13275w;
    }

    public final ImageViewState getState() {
        if (this.f13277y == null || this.f13216E <= 0 || this.f13218F <= 0) {
            return null;
        }
        return new ImageViewState(getScale(), getCenter(), getOrientation());
    }

    /* JADX INFO: renamed from: h0 */
    public final boolean m11978h0() {
        boolean z = true;
        if (this.f13251a != null && !this.f13252b) {
            return true;
        }
        Map<Integer, List<C1398k>> map = this.f13256f;
        if (map == null) {
            return false;
        }
        for (Map.Entry<Integer, List<C1398k>> entry : map.entrySet()) {
            if (entry.getKey().intValue() == this.f13255e) {
                for (C1398k c1398k : entry.getValue()) {
                    if (c1398k.f13315d || c1398k.f13314c == null) {
                        z = false;
                    }
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m11979i0() {
        return this.f13221G0;
    }

    /* JADX INFO: renamed from: j0 */
    public final PointF m11980j0(float f, float f2, float f3, PointF pointF) {
        PointF pointFM11954K0 = m11954K0(f, f2, f3);
        pointF.set(((getPaddingLeft() + (((getWidth() - getPaddingRight()) - getPaddingLeft()) / 2)) - pointFM11954K0.x) / f3, ((getPaddingTop() + (((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2)) - pointFM11954K0.y) / f3);
        return pointF;
    }

    /* JADX INFO: renamed from: k0 */
    public final float m11981k0(float f) {
        return Math.min(this.f13259i, Math.max(m11982l0(), f));
    }

    /* JADX INFO: renamed from: l0 */
    public final float m11982l0() {
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int i = this.f13264m;
        if (i == 2) {
            return Math.max((getWidth() - paddingLeft) / m11996z0(), (getHeight() - paddingBottom) / m11995y0());
        }
        if (i == 3) {
            float f = this.f13260j;
            if (f > 0.0f) {
                return f;
            }
        }
        return Math.min((getWidth() - paddingLeft) / m11996z0(), (getHeight() - paddingBottom) / m11995y0());
    }

    /* JADX INFO: renamed from: m0 */
    public void m11983m0() {
    }

    /* JADX INFO: renamed from: n0 */
    public final synchronized void m11984n0(Bitmap bitmap, int i, boolean z) {
        InterfaceC1395h interfaceC1395h;
        try {
            m11964T("onImageLoaded", new Object[0]);
            int i2 = this.f13216E;
            if (i2 > 0 && this.f13218F > 0 && (i2 != bitmap.getWidth() || this.f13218F != bitmap.getHeight())) {
                m11993w0(false);
            }
            Bitmap bitmap2 = this.f13251a;
            if (bitmap2 != null && !this.f13253c) {
                bitmap2.recycle();
            }
            if (this.f13251a != null && this.f13253c && (interfaceC1395h = this.f13225I0) != null) {
                interfaceC1395h.mo12033a();
            }
            this.f13252b = false;
            this.f13253c = z;
            this.f13251a = bitmap;
            this.f13216E = bitmap.getWidth();
            this.f13218F = bitmap.getHeight();
            this.f13220G = i;
            boolean zM11962R = m11962R();
            boolean zM11961Q = m11961Q();
            if (zM11962R || zM11961Q) {
                invalidate();
                requestLayout();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final synchronized void m11985o0(Bitmap bitmap) {
        try {
            m11964T("onPreviewLoaded", new Object[0]);
            if (this.f13251a == null && !this.f13223H0) {
                Rect rect = this.f13224I;
                if (rect != null) {
                    this.f13251a = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), this.f13224I.height());
                } else {
                    this.f13251a = bitmap;
                }
                this.f13252b = true;
                if (m11962R()) {
                    invalidate();
                    requestLayout();
                }
                return;
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) throws Throwable {
        float height;
        super.onDraw(canvas);
        m11963S();
        if (this.f13216E == 0 || this.f13218F == 0 || getWidth() == 0 || getHeight() == 0) {
            return;
        }
        if (this.f13256f == null && this.f13236O != null) {
            m11976f0(m11975e0(canvas));
        }
        if (m11962R()) {
            m11990t0();
            if (this.f13219F0 != null) {
                float f = this.f13275w;
                if (this.f13212A == null) {
                    this.f13212A = new PointF(0.0f, 0.0f);
                }
                this.f13212A.set(this.f13277y);
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f13219F0.f13293l;
                boolean z = jCurrentTimeMillis > this.f13219F0.f13289h;
                long jMin = Math.min(jCurrentTimeMillis, this.f13219F0.f13289h);
                this.f13275w = m11967W(this.f13219F0.f13291j, jMin, this.f13219F0.f13282a, this.f13219F0.f13283b - this.f13219F0.f13282a, this.f13219F0.f13289h);
                float fM11967W = m11967W(this.f13219F0.f13291j, jMin, this.f13219F0.f13287f.x, this.f13219F0.f13288g.x - this.f13219F0.f13287f.x, this.f13219F0.f13289h);
                float fM11967W2 = m11967W(this.f13219F0.f13291j, jMin, this.f13219F0.f13287f.y, this.f13219F0.f13288g.y - this.f13219F0.f13287f.y, this.f13219F0.f13289h);
                this.f13277y.x -= m11951H0(this.f13219F0.f13285d.x) - fM11967W;
                this.f13277y.y -= m11952I0(this.f13219F0.f13285d.y) - fM11967W2;
                m11972b0(z || this.f13219F0.f13282a == this.f13219F0.f13283b);
                m11944A0(f, this.f13212A, this.f13219F0.f13292k);
                m11991u0(z);
                if (z) {
                    C1390c.m12000d(this.f13219F0);
                    this.f13219F0 = null;
                }
                invalidate();
            }
            if (this.f13256f == null || !m11978h0()) {
                Bitmap bitmap = this.f13251a;
                if (bitmap != null) {
                    float width = this.f13275w;
                    if (this.f13252b) {
                        width *= this.f13216E / bitmap.getWidth();
                        height = this.f13275w * (this.f13218F / this.f13251a.getHeight());
                    } else {
                        height = width;
                    }
                    if (this.f13239P0 == null) {
                        this.f13239P0 = new Matrix();
                    }
                    this.f13239P0.reset();
                    this.f13239P0.postScale(width, height);
                    this.f13239P0.postRotate(getRequiredRotation());
                    Matrix matrix = this.f13239P0;
                    PointF pointF = this.f13277y;
                    matrix.postTranslate(pointF.x, pointF.y);
                    if (getRequiredRotation() == 180) {
                        Matrix matrix2 = this.f13239P0;
                        float f2 = this.f13275w;
                        matrix2.postTranslate(this.f13216E * f2, f2 * this.f13218F);
                    } else if (getRequiredRotation() == 90) {
                        this.f13239P0.postTranslate(this.f13275w * this.f13218F, 0.0f);
                    } else if (getRequiredRotation() == 270) {
                        this.f13239P0.postTranslate(0.0f, this.f13275w * this.f13216E);
                    }
                    if (this.f13235N0 != null) {
                        if (this.f13241Q0 == null) {
                            this.f13241Q0 = new RectF();
                        }
                        this.f13241Q0.set(0.0f, 0.0f, this.f13252b ? this.f13251a.getWidth() : this.f13216E, this.f13252b ? this.f13251a.getHeight() : this.f13218F);
                        this.f13239P0.mapRect(this.f13241Q0);
                        canvas.drawRect(this.f13241Q0, this.f13235N0);
                    }
                    canvas.drawBitmap(this.f13251a, this.f13239P0, this.f13231L0);
                }
            } else {
                int iMin = Math.min(this.f13255e, m11959P(this.f13275w));
                boolean z2 = false;
                for (Map.Entry<Integer, List<C1398k>> entry : this.f13256f.entrySet()) {
                    if (entry.getKey().intValue() == iMin) {
                        for (C1398k c1398k : entry.getValue()) {
                            if (c1398k.f13316e && (c1398k.f13315d || c1398k.f13314c == null)) {
                                z2 = true;
                            }
                        }
                    }
                }
                for (Map.Entry<Integer, List<C1398k>> entry2 : this.f13256f.entrySet()) {
                    if (entry2.getKey().intValue() == iMin || z2) {
                        for (C1398k c1398k2 : entry2.getValue()) {
                            m11950G0(c1398k2.f13312a, c1398k2.f13317f);
                            if (!c1398k2.f13315d && c1398k2.f13314c != null) {
                                if (this.f13235N0 != null) {
                                    canvas.drawRect(c1398k2.f13317f, this.f13235N0);
                                }
                                if (this.f13239P0 == null) {
                                    this.f13239P0 = new Matrix();
                                }
                                this.f13239P0.reset();
                                m11946C0(this.f13243R0, 0.0f, 0.0f, c1398k2.f13314c.getWidth(), 0.0f, c1398k2.f13314c.getWidth(), c1398k2.f13314c.getHeight(), 0.0f, c1398k2.f13314c.getHeight());
                                if (getRequiredRotation() == 0) {
                                    m11946C0(this.f13245S0, c1398k2.f13317f.left, c1398k2.f13317f.top, c1398k2.f13317f.right, c1398k2.f13317f.top, c1398k2.f13317f.right, c1398k2.f13317f.bottom, c1398k2.f13317f.left, c1398k2.f13317f.bottom);
                                } else if (getRequiredRotation() == 90) {
                                    m11946C0(this.f13245S0, c1398k2.f13317f.right, c1398k2.f13317f.top, c1398k2.f13317f.right, c1398k2.f13317f.bottom, c1398k2.f13317f.left, c1398k2.f13317f.bottom, c1398k2.f13317f.left, c1398k2.f13317f.top);
                                } else if (getRequiredRotation() == 180) {
                                    m11946C0(this.f13245S0, c1398k2.f13317f.right, c1398k2.f13317f.bottom, c1398k2.f13317f.left, c1398k2.f13317f.bottom, c1398k2.f13317f.left, c1398k2.f13317f.top, c1398k2.f13317f.right, c1398k2.f13317f.top);
                                } else if (getRequiredRotation() == 270) {
                                    m11946C0(this.f13245S0, c1398k2.f13317f.left, c1398k2.f13317f.bottom, c1398k2.f13317f.left, c1398k2.f13317f.top, c1398k2.f13317f.right, c1398k2.f13317f.top, c1398k2.f13317f.right, c1398k2.f13317f.bottom);
                                }
                                this.f13239P0.setPolyToPoly(this.f13243R0, 0, this.f13245S0, 0, 4);
                                canvas.drawBitmap(c1398k2.f13314c, this.f13239P0, this.f13231L0);
                                if (this.f13257g) {
                                    canvas.drawRect(c1398k2.f13317f, this.f13233M0);
                                }
                            } else if (c1398k2.f13315d && this.f13257g) {
                                canvas.drawText("LOADING", c1398k2.f13317f.left + 5, c1398k2.f13317f.top + 35, this.f13233M0);
                            }
                            if (c1398k2.f13316e && this.f13257g) {
                                canvas.drawText("ISS " + c1398k2.f13313b + " RECT " + c1398k2.f13312a.top + "," + c1398k2.f13312a.left + "," + c1398k2.f13312a.bottom + "," + c1398k2.f13312a.right, c1398k2.f13317f.left + 5, c1398k2.f13317f.top + 15, this.f13233M0);
                            }
                        }
                    }
                }
            }
            if (this.f13257g) {
                Locale locale = Locale.ENGLISH;
                canvas.drawText("Scale: ".concat(String.format(locale, "%.2f", Float.valueOf(this.f13275w))), 5.0f, 15.0f, this.f13233M0);
                canvas.drawText("Translate: " + String.format(locale, "%.2f", Float.valueOf(this.f13277y.x)) + ":" + String.format(locale, "%.2f", Float.valueOf(this.f13277y.y)), 5.0f, 35.0f, this.f13233M0);
                PointF center = getCenter();
                canvas.drawText("Source center: " + String.format(locale, "%.2f", Float.valueOf(center.x)) + ":" + String.format(locale, "%.2f", Float.valueOf(center.y)), 5.0f, 55.0f, this.f13233M0);
                this.f13233M0.setStrokeWidth(2.0f);
                C1390c c1390c = this.f13219F0;
                if (c1390c != null) {
                    PointF pointFM11949F0 = m11949F0(c1390c.f13284c);
                    PointF pointFM11949F1 = m11949F0(this.f13219F0.f13286e);
                    PointF pointFM11949F2 = m11949F0(this.f13219F0.f13285d);
                    canvas.drawCircle(pointFM11949F0.x, pointFM11949F0.y, 10.0f, this.f13233M0);
                    this.f13233M0.setColor(-65536);
                    canvas.drawCircle(pointFM11949F1.x, pointFM11949F1.y, 20.0f, this.f13233M0);
                    this.f13233M0.setColor(-16776961);
                    canvas.drawCircle(pointFM11949F2.x, pointFM11949F2.y, 25.0f, this.f13233M0);
                    this.f13233M0.setColor(-16711681);
                    canvas.drawCircle(getWidth() / 2, getHeight() / 2, 30.0f, this.f13233M0);
                }
                if (this.f13244S != null) {
                    this.f13233M0.setColor(-65536);
                    PointF pointF2 = this.f13244S;
                    canvas.drawCircle(pointF2.x, pointF2.y, 20.0f, this.f13233M0);
                }
                if (this.f13268p0 != null) {
                    this.f13233M0.setColor(-16776961);
                    canvas.drawCircle(m11951H0(this.f13268p0.x), m11952I0(this.f13268p0.y), 35.0f, this.f13233M0);
                }
                if (this.f13217E0 != null) {
                    this.f13233M0.setColor(-16711681);
                    PointF pointF3 = this.f13217E0;
                    canvas.drawCircle(pointF3.x, pointF3.y, 30.0f, this.f13233M0);
                }
                this.f13233M0.setColor(-65281);
                this.f13233M0.setStrokeWidth(1.0f);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        boolean z = mode != 1073741824;
        boolean z2 = mode2 != 1073741824;
        if (this.f13216E > 0 && this.f13218F > 0) {
            if (z && z2) {
                size = m11996z0();
                size2 = m11995y0();
            } else if (z2) {
                size2 = (int) ((((double) m11995y0()) / ((double) m11996z0())) * ((double) size));
            } else if (z) {
                size = (int) ((((double) m11996z0()) / ((double) m11995y0())) * ((double) size2));
            }
        }
        setMeasuredDimension(Math.max(size, getSuggestedMinimumWidth()), Math.max(size2, getSuggestedMinimumHeight()));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        m11964T("onSizeChanged %dx%d -> %dx%d", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i), Integer.valueOf(i2));
        PointF center = getCenter();
        if (!this.f13221G0 || center == null) {
            return;
        }
        this.f13219F0 = null;
        this.f13213B = Float.valueOf(this.f13275w);
        this.f13214C = center;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        GestureDetector gestureDetector;
        C1390c c1390c = this.f13219F0;
        if (c1390c != null && !c1390c.f13290i) {
            m11992v0(true);
            return true;
        }
        C1390c c1390c2 = this.f13219F0;
        if (c1390c2 != null) {
            C1390c.m12000d(c1390c2);
        }
        this.f13219F0 = null;
        if (this.f13277y == null) {
            return true;
        }
        if (!this.f13230L && ((gestureDetector = this.f13234N) == null || gestureDetector.onTouchEvent(motionEvent))) {
            this.f13226J = false;
            this.f13228K = false;
            this.f13232M = 0;
            return true;
        }
        if (this.f13278z == null) {
            this.f13278z = new PointF(0.0f, 0.0f);
        }
        if (this.f13212A == null) {
            this.f13212A = new PointF(0.0f, 0.0f);
        }
        if (this.f13244S == null) {
            this.f13244S = new PointF(0.0f, 0.0f);
        }
        float f = this.f13275w;
        this.f13212A.set(this.f13277y);
        boolean zM11989s0 = m11989s0(motionEvent);
        m11944A0(f, this.f13212A, 2);
        return zM11989s0 || super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: p0 */
    public void m11986p0() {
    }

    /* JADX INFO: renamed from: q0 */
    public final synchronized void m11987q0() {
        Bitmap bitmap;
        try {
            m11964T("onTileLoaded", new Object[0]);
            m11962R();
            m11961Q();
            if (m11978h0() && (bitmap = this.f13251a) != null) {
                if (!this.f13253c) {
                    bitmap.recycle();
                }
                this.f13251a = null;
                InterfaceC1395h interfaceC1395h = this.f13225I0;
                if (interfaceC1395h != null && this.f13253c) {
                    interfaceC1395h.mo12033a();
                }
                this.f13252b = false;
                this.f13253c = false;
            }
            invalidate();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final synchronized void m11988r0(xhm xhmVar, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        try {
            m11964T("onTilesInited sWidth=%d, sHeight=%d, sOrientation=%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.f13258h));
            int i8 = this.f13216E;
            if (i8 > 0 && (i7 = this.f13218F) > 0 && (i8 != i || i7 != i2)) {
                m11993w0(false);
                Bitmap bitmap = this.f13251a;
                if (bitmap != null) {
                    if (!this.f13253c) {
                        bitmap.recycle();
                    }
                    this.f13251a = null;
                    InterfaceC1395h interfaceC1395h = this.f13225I0;
                    if (interfaceC1395h != null && this.f13253c) {
                        interfaceC1395h.mo12033a();
                    }
                    this.f13252b = false;
                    this.f13253c = false;
                }
            }
            this.f13236O = xhmVar;
            this.f13216E = i;
            this.f13218F = i2;
            this.f13220G = i3;
            m11962R();
            if (!m11961Q() && (i4 = this.f13265n) > 0 && i4 != (i5 = f13211Z0) && (i6 = this.f13266o) > 0 && i6 != i5 && getWidth() > 0 && getHeight() > 0) {
                m11976f0(new Point(this.f13265n, this.f13266o));
            }
            invalidate();
            requestLayout();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
    
        if (r1 != 262) goto L119;
     */
    /* JADX INFO: renamed from: s0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m11989s0(@androidx.annotation.NonNull android.view.MotionEvent r13) {
        /*
            Method dump skipped, instruction units count: 1130
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p028v.fresco.subscaleview.SubsamplingScaleImageView.m11989s0(android.view.MotionEvent):boolean");
    }

    public final void setBitmapDecoderClass(Class<? extends bfm> cls) {
        if (cls != null) {
            this.f13240Q = new gn5(cls);
        } else {
            ig3.a("Decoder class cannot be set to null");
        }
    }

    public final void setBitmapDecoderFactory(ehd<? extends bfm> ehdVar) {
        if (ehdVar != null) {
            this.f13240Q = ehdVar;
        } else {
            ig3.a("Decoder factory cannot be set to null");
        }
    }

    public final void setDebug(boolean z) {
        this.f13257g = z;
    }

    public final void setDoubleTapZoomDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setDoubleTapZoomScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / i);
    }

    public final void setDoubleTapZoomDuration(int i) {
        this.f13274v = Math.max(0, i);
    }

    public final void setDoubleTapZoomScale(float f) {
        this.f13272t = f;
    }

    public final void setDoubleTapZoomStyle(int i) {
        if (f13207V0.contains(Integer.valueOf(i))) {
            this.f13273u = i;
        } else {
            k250.m5546a("Invalid zoom style: ", i);
        }
    }

    public final void setImage(nim nimVar) {
        m11945B0(nimVar, null, null);
    }

    public final void setMaxScale(float f) {
        this.f13259i = f;
    }

    public void setMaxTileSize(int i) {
        this.f13265n = i;
        this.f13266o = i;
    }

    public final void setMaximumDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setMinScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / i);
    }

    public final void setMinScale(float f) {
        this.f13260j = f;
    }

    public final void setMinimumDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setMaxScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / i);
    }

    public final void setMinimumScaleType(int i) {
        if (!f13210Y0.contains(Integer.valueOf(i))) {
            k250.m5546a("Invalid scale type: ", i);
            return;
        }
        this.f13264m = i;
        if (m11979i0()) {
            m11972b0(true);
            invalidate();
        }
    }

    public void setMinimumTileDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f13261k = (int) Math.min((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f, i);
        if (m11979i0()) {
            m11993w0(false);
            invalidate();
        }
    }

    public void setOnImageEventListener(InterfaceC1395h interfaceC1395h) {
        this.f13225I0 = interfaceC1395h;
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f13227J0 = onLongClickListener;
    }

    public void setOnStateChangedListener(InterfaceC1396i interfaceC1396i) {
    }

    public final void setOrientation(int i) {
        if (!f13206U0.contains(Integer.valueOf(i))) {
            k250.m5546a("Invalid orientation: ", i);
            return;
        }
        this.f13258h = i;
        m11993w0(false);
        invalidate();
        requestLayout();
    }

    public final void setPanEnabled(boolean z) {
        PointF pointF;
        this.f13269q = z;
        if (z || (pointF = this.f13277y) == null) {
            return;
        }
        pointF.x = (getWidth() / 2) - (this.f13275w * (m11996z0() / 2));
        this.f13277y.y = (getHeight() / 2) - (this.f13275w * (m11995y0() / 2));
        if (m11979i0()) {
            m11991u0(true);
            invalidate();
        }
    }

    public final void setPanLimit(int i) {
        if (!f13209X0.contains(Integer.valueOf(i))) {
            k250.m5546a("Invalid pan limit: ", i);
            return;
        }
        this.f13263l = i;
        if (m11979i0()) {
            m11972b0(true);
            invalidate();
        }
    }

    public void setParallelLoadingEnabled(boolean z) {
        this.f13267p = z;
    }

    public final void setQuickScaleEnabled(boolean z) {
        this.f13271s = z;
    }

    public final void setRegionDecoderClass(Class<? extends xhm> cls) {
        if (cls != null) {
            this.f13242R = new gn5(cls);
        } else {
            ig3.a("Decoder class cannot be set to null");
        }
    }

    public final void setRegionDecoderFactory(ehd<? extends xhm> ehdVar) {
        if (ehdVar != null) {
            this.f13242R = ehdVar;
        } else {
            ig3.a("Decoder factory cannot be set to null");
        }
    }

    public final void setTileBackgroundColor(int i) {
        if (Color.alpha(i) == 0) {
            this.f13235N0 = null;
        } else {
            Paint paint = new Paint();
            this.f13235N0 = paint;
            paint.setStyle(Paint.Style.FILL);
            this.f13235N0.setColor(i);
        }
        invalidate();
    }

    public final void setZoomEnabled(boolean z) {
        this.f13270r = z;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m11990t0() {
        Float f;
        if (getWidth() == 0 || getHeight() == 0 || this.f13216E <= 0 || this.f13218F <= 0) {
            return;
        }
        if (this.f13214C != null && (f = this.f13213B) != null) {
            this.f13275w = f.floatValue();
            if (this.f13277y == null) {
                this.f13277y = new PointF();
            }
            this.f13277y.x = (getWidth() / 2) - (this.f13275w * this.f13214C.x);
            this.f13277y.y = (getHeight() / 2) - (this.f13275w * this.f13214C.y);
            this.f13214C = null;
            this.f13213B = null;
            m11972b0(true);
            m11991u0(true);
        }
        m11972b0(false);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m11991u0(boolean z) {
        if (this.f13236O == null || this.f13256f == null) {
            return;
        }
        int iMin = Math.min(this.f13255e, m11959P(this.f13275w));
        Iterator<Map.Entry<Integer, List<C1398k>>> it = this.f13256f.entrySet().iterator();
        while (it.hasNext()) {
            for (C1398k c1398k : it.next().getValue()) {
                if (c1398k.f13313b < iMin || (c1398k.f13313b > iMin && c1398k.f13313b != this.f13255e)) {
                    c1398k.f13316e = false;
                    if (c1398k.f13314c != null) {
                        c1398k.f13314c.recycle();
                        c1398k.f13314c = null;
                    }
                }
                if (c1398k.f13313b == iMin) {
                    if (m11953J0(c1398k)) {
                        c1398k.f13316e = true;
                        if (!c1398k.f13315d && c1398k.f13314c == null && z) {
                            m11970Z(new AsyncTaskC1399l(this, this.f13236O, c1398k));
                        }
                    } else if (c1398k.f13313b != this.f13255e) {
                        c1398k.f13316e = false;
                        if (c1398k.f13314c != null) {
                            c1398k.f13314c.recycle();
                            c1398k.f13314c = null;
                        }
                    }
                } else if (c1398k.f13313b == this.f13255e) {
                    c1398k.f13316e = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m11992v0(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m11993w0(boolean z) {
        InterfaceC1395h interfaceC1395h;
        m11964T("reset newImage=" + z, new Object[0]);
        this.f13275w = 0.0f;
        this.f13276x = 0.0f;
        this.f13277y = null;
        this.f13278z = null;
        this.f13212A = null;
        this.f13213B = Float.valueOf(0.0f);
        this.f13214C = null;
        this.f13215D = null;
        this.f13226J = false;
        this.f13228K = false;
        this.f13230L = false;
        this.f13232M = 0;
        this.f13255e = 0;
        this.f13244S = null;
        this.f13246T = 0.0f;
        this.f13249V = 0.0f;
        this.f13250W = false;
        this.f13268p0 = null;
        this.f13262k0 = null;
        this.f13217E0 = null;
        this.f13219F0 = null;
        this.f13237O0 = null;
        this.f13239P0 = null;
        this.f13241Q0 = null;
        if (z) {
            this.f13254d = null;
            if (this.f13236O != null) {
                synchronized (this.f13238P) {
                    this.f13236O.recycle();
                    this.f13236O = null;
                }
            }
            Bitmap bitmap = this.f13251a;
            if (bitmap != null && !this.f13253c) {
                bitmap.recycle();
            }
            if (this.f13251a != null && this.f13253c && (interfaceC1395h = this.f13225I0) != null) {
                interfaceC1395h.mo12033a();
            }
            this.f13216E = 0;
            this.f13218F = 0;
            this.f13220G = 0;
            this.f13222H = null;
            this.f13224I = null;
            this.f13221G0 = false;
            this.f13223H0 = false;
            this.f13251a = null;
            this.f13252b = false;
            this.f13253c = false;
        }
        Map<Integer, List<C1398k>> map = this.f13256f;
        if (map != null) {
            Iterator<Map.Entry<Integer, List<C1398k>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                for (C1398k c1398k : it.next().getValue()) {
                    c1398k.f13316e = false;
                    if (c1398k.f13314c != null) {
                        c1398k.f13314c.recycle();
                        c1398k.f13314c = null;
                    }
                }
            }
            this.f13256f = null;
        }
        setGestureDetector(getContext());
    }

    /* JADX INFO: renamed from: x0 */
    public final void m11994x0(ImageViewState imageViewState) {
        if (imageViewState == null || imageViewState.getCenter() == null || !f13206U0.contains(Integer.valueOf(imageViewState.getOrientation()))) {
            return;
        }
        this.f13258h = imageViewState.getOrientation();
        this.f13213B = Float.valueOf(imageViewState.getScale());
        this.f13214C = imageViewState.getCenter();
        invalidate();
    }

    /* JADX INFO: renamed from: y0 */
    public final int m11995y0() {
        int requiredRotation = getRequiredRotation();
        return (requiredRotation == 90 || requiredRotation == 270) ? this.f13216E : this.f13218F;
    }

    /* JADX INFO: renamed from: z0 */
    public final int m11996z0() {
        int requiredRotation = getRequiredRotation();
        return (requiredRotation == 90 || requiredRotation == 270) ? this.f13218F : this.f13216E;
    }

    /* JADX INFO: renamed from: v.fresco.subscaleview.SubsamplingScaleImageView$d */
    public final class C1391d {

        /* JADX INFO: renamed from: a */
        public final float f13294a;

        /* JADX INFO: renamed from: b */
        public final PointF f13295b;

        /* JADX INFO: renamed from: c */
        public final PointF f13296c;

        /* JADX INFO: renamed from: d */
        public long f13297d;

        /* JADX INFO: renamed from: e */
        public int f13298e;

        /* JADX INFO: renamed from: f */
        public int f13299f;

        /* JADX INFO: renamed from: g */
        public boolean f13300g;

        /* JADX INFO: renamed from: h */
        public boolean f13301h;

        public C1391d(PointF pointF) {
            this.f13297d = 500L;
            this.f13298e = 2;
            this.f13299f = 1;
            this.f13300g = true;
            this.f13301h = true;
            this.f13294a = SubsamplingScaleImageView.this.f13275w;
            this.f13295b = pointF;
            this.f13296c = null;
        }

        /* JADX INFO: renamed from: c */
        public void m12025c() {
            PointF pointFM11980j0;
            if (SubsamplingScaleImageView.this.f13219F0 != null) {
                C1390c.m12000d(SubsamplingScaleImageView.this.f13219F0);
            }
            int paddingLeft = SubsamplingScaleImageView.this.getPaddingLeft() + (((SubsamplingScaleImageView.this.getWidth() - SubsamplingScaleImageView.this.getPaddingRight()) - SubsamplingScaleImageView.this.getPaddingLeft()) / 2);
            int paddingTop = SubsamplingScaleImageView.this.getPaddingTop() + (((SubsamplingScaleImageView.this.getHeight() - SubsamplingScaleImageView.this.getPaddingBottom()) - SubsamplingScaleImageView.this.getPaddingTop()) / 2);
            float fM11981k0 = SubsamplingScaleImageView.this.m11981k0(this.f13294a);
            if (this.f13301h) {
                SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
                PointF pointF = this.f13295b;
                pointFM11980j0 = subsamplingScaleImageView.m11980j0(pointF.x, pointF.y, fM11981k0, new PointF());
            } else {
                pointFM11980j0 = this.f13295b;
            }
            SubsamplingScaleImageView.this.f13219F0 = new C1390c();
            SubsamplingScaleImageView.this.f13219F0.f13282a = SubsamplingScaleImageView.this.f13275w;
            SubsamplingScaleImageView.this.f13219F0.f13283b = fM11981k0;
            SubsamplingScaleImageView.this.f13219F0.f13293l = System.currentTimeMillis();
            SubsamplingScaleImageView.this.f13219F0.f13286e = pointFM11980j0;
            SubsamplingScaleImageView.this.f13219F0.f13284c = SubsamplingScaleImageView.this.getCenter();
            SubsamplingScaleImageView.this.f13219F0.f13285d = pointFM11980j0;
            SubsamplingScaleImageView.this.f13219F0.f13287f = SubsamplingScaleImageView.this.m11949F0(pointFM11980j0);
            SubsamplingScaleImageView.this.f13219F0.f13288g = new PointF(paddingLeft, paddingTop);
            SubsamplingScaleImageView.this.f13219F0.f13289h = this.f13297d;
            SubsamplingScaleImageView.this.f13219F0.f13290i = this.f13300g;
            SubsamplingScaleImageView.this.f13219F0.f13291j = this.f13298e;
            SubsamplingScaleImageView.this.f13219F0.f13292k = this.f13299f;
            SubsamplingScaleImageView.this.f13219F0.f13293l = System.currentTimeMillis();
            SubsamplingScaleImageView.this.f13219F0.getClass();
            PointF pointF2 = this.f13296c;
            if (pointF2 != null) {
                float f = pointF2.x - (SubsamplingScaleImageView.this.f13219F0.f13284c.x * fM11981k0);
                float f2 = this.f13296c.y - (SubsamplingScaleImageView.this.f13219F0.f13284c.y * fM11981k0);
                C1397j c1397j = new C1397j(fM11981k0, new PointF(f, f2));
                SubsamplingScaleImageView.this.m11973c0(true, c1397j);
                SubsamplingScaleImageView.this.f13219F0.f13288g = new PointF(this.f13296c.x + (c1397j.f13311b.x - f), this.f13296c.y + (c1397j.f13311b.y - f2));
            }
            SubsamplingScaleImageView.this.invalidate();
        }

        /* JADX INFO: renamed from: d */
        public C1391d m12026d(long j) {
            this.f13297d = j;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C1391d m12027e(int i) {
            if (SubsamplingScaleImageView.f13208W0.contains(Integer.valueOf(i))) {
                this.f13298e = i;
                return this;
            }
            k250.m5546a("Unknown easing type: ", i);
            return null;
        }

        /* JADX INFO: renamed from: f */
        public C1391d m12028f(boolean z) {
            this.f13300g = z;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public final C1391d m12029g(int i) {
            this.f13299f = i;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public final C1391d m12030h(boolean z) {
            this.f13301h = z;
            return this;
        }

        public C1391d(float f, PointF pointF) {
            this.f13297d = 500L;
            this.f13298e = 2;
            this.f13299f = 1;
            this.f13300g = true;
            this.f13301h = true;
            this.f13294a = f;
            this.f13295b = pointF;
            this.f13296c = null;
        }

        public C1391d(float f, PointF pointF, PointF pointF2) {
            this.f13297d = 500L;
            this.f13298e = 2;
            this.f13299f = 1;
            this.f13300g = true;
            this.f13301h = true;
            this.f13294a = f;
            this.f13295b = pointF;
            this.f13296c = pointF2;
        }
    }

    public SubsamplingScaleImageView(Context context) {
        this(context, null);
    }
}
