package p147v.fresco.subscaleview;

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
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Api;
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
import p149l.b9c0;
import p149l.bfm;
import p149l.bjf0;
import p149l.cjf0;
import p149l.ehd;
import p149l.f3c;
import p149l.gn5;
import p149l.ig3;
import p149l.j6f;
import p149l.jfd0;
import p149l.k250;
import p149l.nim;
import p149l.xhm;

/* JADX INFO: loaded from: classes3.dex */
public class SubsamplingScaleImageView extends View {

    /* JADX INFO: renamed from: U0 */
    public static final List<Integer> f209581U0 = Arrays.asList(0, 90, 180, 270, -1);

    /* JADX INFO: renamed from: V0 */
    public static final List<Integer> f209582V0 = Arrays.asList(1, 2, 3);

    /* JADX INFO: renamed from: W0 */
    public static final List<Integer> f209583W0 = Arrays.asList(2, 1);

    /* JADX INFO: renamed from: X0 */
    public static final List<Integer> f209584X0 = Arrays.asList(1, 2, 3);

    /* JADX INFO: renamed from: Y0 */
    public static final List<Integer> f209585Y0 = Arrays.asList(2, 1, 3);

    /* JADX INFO: renamed from: Z0 */
    public static int f209586Z0 = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: A */
    public PointF f209587A;

    /* JADX INFO: renamed from: B */
    public Float f209588B;

    /* JADX INFO: renamed from: C */
    public PointF f209589C;

    /* JADX INFO: renamed from: D */
    public PointF f209590D;

    /* JADX INFO: renamed from: E */
    public int f209591E;

    /* JADX INFO: renamed from: E0 */
    public PointF f209592E0;

    /* JADX INFO: renamed from: F */
    public int f209593F;

    /* JADX INFO: renamed from: F0 */
    public C22597c f209594F0;

    /* JADX INFO: renamed from: G */
    public int f209595G;

    /* JADX INFO: renamed from: G0 */
    public boolean f209596G0;

    /* JADX INFO: renamed from: H */
    public Rect f209597H;

    /* JADX INFO: renamed from: H0 */
    public boolean f209598H0;

    /* JADX INFO: renamed from: I */
    public Rect f209599I;

    /* JADX INFO: renamed from: I0 */
    public InterfaceC22602h f209600I0;

    /* JADX INFO: renamed from: J */
    public boolean f209601J;

    /* JADX INFO: renamed from: J0 */
    public View.OnLongClickListener f209602J0;

    /* JADX INFO: renamed from: K */
    public boolean f209603K;

    /* JADX INFO: renamed from: K0 */
    public Handler f209604K0;

    /* JADX INFO: renamed from: L */
    public boolean f209605L;

    /* JADX INFO: renamed from: L0 */
    public Paint f209606L0;

    /* JADX INFO: renamed from: M */
    public int f209607M;

    /* JADX INFO: renamed from: M0 */
    public Paint f209608M0;

    /* JADX INFO: renamed from: N */
    public GestureDetector f209609N;

    /* JADX INFO: renamed from: N0 */
    public Paint f209610N0;

    /* JADX INFO: renamed from: O */
    public xhm f209611O;

    /* JADX INFO: renamed from: O0 */
    public C22604j f209612O0;

    /* JADX INFO: renamed from: P */
    public final Object f209613P;

    /* JADX INFO: renamed from: P0 */
    public Matrix f209614P0;

    /* JADX INFO: renamed from: Q */
    public ehd<? extends bfm> f209615Q;

    /* JADX INFO: renamed from: Q0 */
    public RectF f209616Q0;

    /* JADX INFO: renamed from: R */
    public ehd<? extends xhm> f209617R;

    /* JADX INFO: renamed from: R0 */
    public float[] f209618R0;

    /* JADX INFO: renamed from: S */
    public PointF f209619S;

    /* JADX INFO: renamed from: S0 */
    public float[] f209620S0;

    /* JADX INFO: renamed from: T */
    public float f209621T;

    /* JADX INFO: renamed from: T0 */
    public float f209622T0;

    /* JADX INFO: renamed from: U */
    public final float f209623U;

    /* JADX INFO: renamed from: V */
    public float f209624V;

    /* JADX INFO: renamed from: W */
    public boolean f209625W;

    /* JADX INFO: renamed from: a */
    public Bitmap f209626a;

    /* JADX INFO: renamed from: b */
    public boolean f209627b;

    /* JADX INFO: renamed from: c */
    public boolean f209628c;

    /* JADX INFO: renamed from: d */
    public Uri f209629d;

    /* JADX INFO: renamed from: e */
    public int f209630e;

    /* JADX INFO: renamed from: f */
    public Map<Integer, List<C22605k>> f209631f;

    /* JADX INFO: renamed from: g */
    public boolean f209632g;

    /* JADX INFO: renamed from: h */
    public int f209633h;

    /* JADX INFO: renamed from: i */
    public float f209634i;

    /* JADX INFO: renamed from: j */
    public float f209635j;

    /* JADX INFO: renamed from: k */
    public int f209636k;

    /* JADX INFO: renamed from: k0 */
    public PointF f209637k0;

    /* JADX INFO: renamed from: l */
    public int f209638l;

    /* JADX INFO: renamed from: m */
    public int f209639m;

    /* JADX INFO: renamed from: n */
    public int f209640n;

    /* JADX INFO: renamed from: o */
    public int f209641o;

    /* JADX INFO: renamed from: p */
    public boolean f209642p;

    /* JADX INFO: renamed from: p0 */
    public PointF f209643p0;

    /* JADX INFO: renamed from: q */
    public boolean f209644q;

    /* JADX INFO: renamed from: r */
    public boolean f209645r;

    /* JADX INFO: renamed from: s */
    public boolean f209646s;

    /* JADX INFO: renamed from: t */
    public float f209647t;

    /* JADX INFO: renamed from: u */
    public int f209648u;

    /* JADX INFO: renamed from: v */
    public int f209649v;

    /* JADX INFO: renamed from: w */
    public float f209650w;

    /* JADX INFO: renamed from: x */
    public float f209651x;

    /* JADX INFO: renamed from: y */
    public PointF f209652y;

    /* JADX INFO: renamed from: z */
    public PointF f209653z;

    /* JADX INFO: renamed from: v.fresco.subscaleview.SubsamplingScaleImageView$a */
    public class C22595a implements Handler.Callback {
        public C22595a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1 && SubsamplingScaleImageView.this.f209602J0 != null) {
                SubsamplingScaleImageView.this.f209607M = 0;
                SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
                SubsamplingScaleImageView.super.setOnLongClickListener(subsamplingScaleImageView.f209602J0);
                SubsamplingScaleImageView.this.performLongClick();
                SubsamplingScaleImageView.super.setOnLongClickListener(null);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: v.fresco.subscaleview.SubsamplingScaleImageView$b */
    public class C22596b extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f209655a;

        public C22596b(Context context) {
            this.f209655a = context;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (!SubsamplingScaleImageView.this.f209645r || !SubsamplingScaleImageView.this.f209596G0 || SubsamplingScaleImageView.this.f209652y == null) {
                return super.onDoubleTapEvent(motionEvent);
            }
            SubsamplingScaleImageView.this.setGestureDetector(this.f209655a);
            boolean z = SubsamplingScaleImageView.this.f209646s;
            SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
            if (!z) {
                subsamplingScaleImageView.m223465V(subsamplingScaleImageView.m223456N0(new PointF(motionEvent.getX(), motionEvent.getY())), new PointF(motionEvent.getX(), motionEvent.getY()));
                return true;
            }
            subsamplingScaleImageView.f209619S = new PointF(motionEvent.getX(), motionEvent.getY());
            SubsamplingScaleImageView.this.f209653z = new PointF(SubsamplingScaleImageView.this.f209652y.x, SubsamplingScaleImageView.this.f209652y.y);
            SubsamplingScaleImageView subsamplingScaleImageView2 = SubsamplingScaleImageView.this;
            subsamplingScaleImageView2.f209651x = subsamplingScaleImageView2.f209650w;
            SubsamplingScaleImageView.this.f209605L = true;
            SubsamplingScaleImageView.this.f209601J = true;
            SubsamplingScaleImageView.this.f209624V = -1.0f;
            SubsamplingScaleImageView subsamplingScaleImageView3 = SubsamplingScaleImageView.this;
            subsamplingScaleImageView3.f209643p0 = subsamplingScaleImageView3.m223456N0(subsamplingScaleImageView3.f209619S);
            SubsamplingScaleImageView.this.f209592E0 = new PointF(motionEvent.getX(), motionEvent.getY());
            SubsamplingScaleImageView.this.f209637k0 = new PointF(SubsamplingScaleImageView.this.f209643p0.x, SubsamplingScaleImageView.this.f209643p0.y);
            SubsamplingScaleImageView.this.f209625W = false;
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!SubsamplingScaleImageView.this.f209644q || !SubsamplingScaleImageView.this.f209596G0 || SubsamplingScaleImageView.this.f209652y == null || motionEvent == null || motionEvent2 == null || ((Math.abs(motionEvent.getX() - motionEvent2.getX()) <= 50.0f && Math.abs(motionEvent.getY() - motionEvent2.getY()) <= 50.0f) || ((Math.abs(f) <= 500.0f && Math.abs(f2) <= 500.0f) || SubsamplingScaleImageView.this.f209601J))) {
                return super.onFling(motionEvent, motionEvent2, f, f2);
            }
            PointF pointF = new PointF(SubsamplingScaleImageView.this.f209652y.x + (f * 0.25f), SubsamplingScaleImageView.this.f209652y.y + (f2 * 0.25f));
            new C22598d(new PointF(((SubsamplingScaleImageView.this.getWidth() / 2) - pointF.x) / SubsamplingScaleImageView.this.f209650w, ((SubsamplingScaleImageView.this.getHeight() / 2) - pointF.y) / SubsamplingScaleImageView.this.f209650w)).m223526e(1).m223529h(false).m223528g(3).m223524c();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            SubsamplingScaleImageView.this.performClick();
            return true;
        }
    }

    /* JADX INFO: renamed from: v.fresco.subscaleview.SubsamplingScaleImageView$c */
    public static class C22597c {

        /* JADX INFO: renamed from: a */
        public float f209657a;

        /* JADX INFO: renamed from: b */
        public float f209658b;

        /* JADX INFO: renamed from: c */
        public PointF f209659c;

        /* JADX INFO: renamed from: d */
        public PointF f209660d;

        /* JADX INFO: renamed from: e */
        public PointF f209661e;

        /* JADX INFO: renamed from: f */
        public PointF f209662f;

        /* JADX INFO: renamed from: g */
        public PointF f209663g;

        /* JADX INFO: renamed from: h */
        public long f209664h;

        /* JADX INFO: renamed from: i */
        public boolean f209665i;

        /* JADX INFO: renamed from: j */
        public int f209666j;

        /* JADX INFO: renamed from: k */
        public int f209667k;

        /* JADX INFO: renamed from: l */
        public long f209668l;

        public C22597c() {
            this.f209664h = 500L;
            this.f209665i = true;
            this.f209666j = 2;
            this.f209667k = 1;
            this.f209668l = System.currentTimeMillis();
        }

        /* JADX INFO: renamed from: d */
        public static /* bridge */ /* synthetic */ InterfaceC22601g m223499d(C22597c c22597c) {
            c22597c.getClass();
            return null;
        }
    }

    /* JADX INFO: renamed from: v.fresco.subscaleview.SubsamplingScaleImageView$e */
    public static class AsyncTaskC22599e extends AsyncTask<Void, Void, Integer> {

        /* JADX INFO: renamed from: a */
        public final WeakReference<SubsamplingScaleImageView> f209678a;

        /* JADX INFO: renamed from: b */
        public final WeakReference<Context> f209679b;

        /* JADX INFO: renamed from: c */
        public final WeakReference<ehd<? extends bfm>> f209680c;

        /* JADX INFO: renamed from: d */
        public final Uri f209681d;

        /* JADX INFO: renamed from: e */
        public final boolean f209682e;

        /* JADX INFO: renamed from: f */
        public Bitmap f209683f;

        /* JADX INFO: renamed from: g */
        public Exception f209684g;

        public AsyncTaskC22599e(SubsamplingScaleImageView subsamplingScaleImageView, Context context, ehd<? extends bfm> ehdVar, Uri uri, boolean z) {
            this.f209678a = new WeakReference<>(subsamplingScaleImageView);
            this.f209679b = new WeakReference<>(context);
            this.f209680c = new WeakReference<>(ehdVar);
            this.f209681d = uri;
            this.f209682e = z;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(Void... voidArr) {
            try {
                String string = this.f209681d.toString();
                Context context = this.f209679b.get();
                ehd<? extends bfm> ehdVar = this.f209680c.get();
                SubsamplingScaleImageView subsamplingScaleImageView = this.f209678a.get();
                if (context == null || ehdVar == null || subsamplingScaleImageView == null) {
                    return null;
                }
                subsamplingScaleImageView.m223463T("BitmapLoadTask.doInBackground", new Object[0]);
                this.f209683f = ehdVar.mo116451a().mo101546a(context, this.f209681d);
                return Integer.valueOf(subsamplingScaleImageView.m223473d0(context, string));
            } catch (Exception e) {
                CrashHelper.m81296c(e);
                this.f209684g = e;
                return null;
            } catch (OutOfMemoryError e2) {
                CrashHelper.m81296c(e2);
                this.f209684g = new RuntimeException(e2);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            SubsamplingScaleImageView subsamplingScaleImageView = this.f209678a.get();
            if (subsamplingScaleImageView != null) {
                Bitmap bitmap = this.f209683f;
                if (bitmap != null && num != null) {
                    if (this.f209682e) {
                        subsamplingScaleImageView.m223484o0(bitmap);
                        return;
                    } else {
                        subsamplingScaleImageView.m223483n0(bitmap, num.intValue(), false);
                        return;
                    }
                }
                if (this.f209684g == null || subsamplingScaleImageView.f209600I0 == null) {
                    return;
                }
                if (this.f209682e) {
                    subsamplingScaleImageView.f209600I0.mo223533c(this.f209684g);
                } else {
                    subsamplingScaleImageView.f209600I0.mo79105f(this.f209684g);
                }
            }
        }
    }

    /* JADX INFO: renamed from: v.fresco.subscaleview.SubsamplingScaleImageView$f */
    public static class C22600f implements InterfaceC22602h {
        @Override // p147v.fresco.subscaleview.SubsamplingScaleImageView.InterfaceC22602h
        /* JADX INFO: renamed from: a */
        public void mo223532a() {
        }

        @Override // p147v.fresco.subscaleview.SubsamplingScaleImageView.InterfaceC22602h
        /* JADX INFO: renamed from: b */
        public void mo79104b() {
        }

        @Override // p147v.fresco.subscaleview.SubsamplingScaleImageView.InterfaceC22602h
        /* JADX INFO: renamed from: c */
        public void mo223533c(Exception exc) {
        }

        @Override // p147v.fresco.subscaleview.SubsamplingScaleImageView.InterfaceC22602h
        /* JADX INFO: renamed from: d */
        public void mo223534d(Exception exc) {
        }

        @Override // p147v.fresco.subscaleview.SubsamplingScaleImageView.InterfaceC22602h
        /* JADX INFO: renamed from: e */
        public void mo223535e() {
        }

        @Override // p147v.fresco.subscaleview.SubsamplingScaleImageView.InterfaceC22602h
        /* JADX INFO: renamed from: f */
        public void mo79105f(Exception exc) {
        }
    }

    /* JADX INFO: renamed from: v.fresco.subscaleview.SubsamplingScaleImageView$g */
    public interface InterfaceC22601g {
    }

    /* JADX INFO: renamed from: v.fresco.subscaleview.SubsamplingScaleImageView$h */
    public interface InterfaceC22602h {
        /* JADX INFO: renamed from: a */
        void mo223532a();

        /* JADX INFO: renamed from: b */
        void mo79104b();

        /* JADX INFO: renamed from: c */
        void mo223533c(Exception exc);

        /* JADX INFO: renamed from: d */
        void mo223534d(Exception exc);

        /* JADX INFO: renamed from: e */
        void mo223535e();

        /* JADX INFO: renamed from: f */
        void mo79105f(Exception exc);
    }

    /* JADX INFO: renamed from: v.fresco.subscaleview.SubsamplingScaleImageView$i */
    public interface InterfaceC22603i {
    }

    /* JADX INFO: renamed from: v.fresco.subscaleview.SubsamplingScaleImageView$j */
    public static class C22604j {

        /* JADX INFO: renamed from: a */
        public float f209685a;

        /* JADX INFO: renamed from: b */
        public PointF f209686b;

        public C22604j(float f, PointF pointF) {
            this.f209685a = f;
            this.f209686b = pointF;
        }
    }

    /* JADX INFO: renamed from: v.fresco.subscaleview.SubsamplingScaleImageView$k */
    public static class C22605k {

        /* JADX INFO: renamed from: a */
        public Rect f209687a;

        /* JADX INFO: renamed from: b */
        public int f209688b;

        /* JADX INFO: renamed from: c */
        public Bitmap f209689c;

        /* JADX INFO: renamed from: d */
        public boolean f209690d;

        /* JADX INFO: renamed from: e */
        public boolean f209691e;

        /* JADX INFO: renamed from: f */
        public Rect f209692f;

        /* JADX INFO: renamed from: g */
        public Rect f209693g;

        public C22605k() {
        }
    }

    /* JADX INFO: renamed from: v.fresco.subscaleview.SubsamplingScaleImageView$l */
    public static class AsyncTaskC22606l extends AsyncTask<Void, Void, Bitmap> {

        /* JADX INFO: renamed from: a */
        public final WeakReference<SubsamplingScaleImageView> f209694a;

        /* JADX INFO: renamed from: b */
        public final WeakReference<xhm> f209695b;

        /* JADX INFO: renamed from: c */
        public final WeakReference<C22605k> f209696c;

        /* JADX INFO: renamed from: d */
        public Exception f209697d;

        public AsyncTaskC22606l(SubsamplingScaleImageView subsamplingScaleImageView, xhm xhmVar, C22605k c22605k) {
            this.f209694a = new WeakReference<>(subsamplingScaleImageView);
            this.f209695b = new WeakReference<>(xhmVar);
            this.f209696c = new WeakReference<>(c22605k);
            c22605k.f209690d = true;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap doInBackground(Void... voidArr) {
            Bitmap bitmapMo107154c;
            try {
                SubsamplingScaleImageView subsamplingScaleImageView = this.f209694a.get();
                xhm xhmVar = this.f209695b.get();
                C22605k c22605k = this.f209696c.get();
                if (xhmVar == null || c22605k == null || subsamplingScaleImageView == null || !xhmVar.mo107153b() || !c22605k.f209691e) {
                    if (c22605k == null) {
                        return null;
                    }
                    c22605k.f209690d = false;
                    return null;
                }
                subsamplingScaleImageView.m223463T("TileLoadTask.doInBackground, tile.sRect=%s, tile.sampleSize=%d", c22605k.f209687a, Integer.valueOf(c22605k.f209688b));
                synchronized (subsamplingScaleImageView.f209613P) {
                    try {
                        subsamplingScaleImageView.m223470a0(c22605k.f209687a, c22605k.f209693g);
                        if (subsamplingScaleImageView.f209597H != null) {
                            c22605k.f209693g.offset(subsamplingScaleImageView.f209597H.left, subsamplingScaleImageView.f209597H.top);
                        }
                        bitmapMo107154c = xhmVar.mo107154c(c22605k.f209693g, c22605k.f209688b);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return bitmapMo107154c;
            } catch (Exception e) {
                CrashHelper.m81296c(e);
                this.f209697d = e;
                return null;
            } catch (OutOfMemoryError e2) {
                CrashHelper.m81296c(e2);
                this.f209697d = new RuntimeException(e2);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Bitmap bitmap) {
            SubsamplingScaleImageView subsamplingScaleImageView = this.f209694a.get();
            C22605k c22605k = this.f209696c.get();
            if (subsamplingScaleImageView == null || c22605k == null) {
                return;
            }
            if (bitmap != null) {
                c22605k.f209689c = bitmap;
                c22605k.f209690d = false;
                subsamplingScaleImageView.m223486q0();
            } else {
                if (this.f209697d == null || subsamplingScaleImageView.f209600I0 == null) {
                    return;
                }
                subsamplingScaleImageView.f209600I0.mo223534d(this.f209697d);
            }
        }
    }

    /* JADX INFO: renamed from: v.fresco.subscaleview.SubsamplingScaleImageView$m */
    public static class AsyncTaskC22607m extends AsyncTask<Void, Void, int[]> {

        /* JADX INFO: renamed from: a */
        public final WeakReference<SubsamplingScaleImageView> f209698a;

        /* JADX INFO: renamed from: b */
        public final WeakReference<Context> f209699b;

        /* JADX INFO: renamed from: c */
        public final WeakReference<ehd<? extends xhm>> f209700c;

        /* JADX INFO: renamed from: d */
        public final Uri f209701d;

        /* JADX INFO: renamed from: e */
        public xhm f209702e;

        /* JADX INFO: renamed from: f */
        public Exception f209703f;

        public AsyncTaskC22607m(SubsamplingScaleImageView subsamplingScaleImageView, Context context, ehd<? extends xhm> ehdVar, Uri uri) {
            this.f209698a = new WeakReference<>(subsamplingScaleImageView);
            this.f209699b = new WeakReference<>(context);
            this.f209700c = new WeakReference<>(ehdVar);
            this.f209701d = uri;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int[] doInBackground(Void... voidArr) {
            try {
                String string = this.f209701d.toString();
                Context context = this.f209699b.get();
                ehd<? extends xhm> ehdVar = this.f209700c.get();
                SubsamplingScaleImageView subsamplingScaleImageView = this.f209698a.get();
                if (context == null || ehdVar == null || subsamplingScaleImageView == null) {
                    return null;
                }
                subsamplingScaleImageView.m223463T("TilesInitTask.doInBackground", new Object[0]);
                xhm xhmVarMo116451a = ehdVar.mo116451a();
                this.f209702e = xhmVarMo116451a;
                Point pointMo107152a = xhmVarMo116451a.mo107152a(context, this.f209701d);
                int iWidth = pointMo107152a.x;
                int iHeight = pointMo107152a.y;
                int iM223473d0 = subsamplingScaleImageView.m223473d0(context, string);
                if (subsamplingScaleImageView.f209597H != null) {
                    iWidth = subsamplingScaleImageView.f209597H.width();
                    iHeight = subsamplingScaleImageView.f209597H.height();
                }
                return new int[]{iWidth, iHeight, iM223473d0};
            } catch (Exception e) {
                CrashHelper.m81296c(e);
                this.f209703f = e;
                return null;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(int[] iArr) {
            SubsamplingScaleImageView subsamplingScaleImageView = this.f209698a.get();
            if (subsamplingScaleImageView != null) {
                xhm xhmVar = this.f209702e;
                if (xhmVar != null && iArr != null && iArr.length == 3) {
                    subsamplingScaleImageView.m223487r0(xhmVar, iArr[0], iArr[1], iArr[2]);
                } else {
                    if (this.f209703f == null || subsamplingScaleImageView.f209600I0 == null) {
                        return;
                    }
                    subsamplingScaleImageView.f209600I0.mo79105f(this.f209703f);
                }
            }
        }
    }

    public SubsamplingScaleImageView(Context context, AttributeSet attributeSet) {
        int resourceId;
        String string;
        super(context, attributeSet);
        this.f209633h = 0;
        this.f209634i = 2.0f;
        this.f209635j = m223481l0();
        this.f209636k = -1;
        this.f209638l = 1;
        this.f209639m = 1;
        int i = f209586Z0;
        this.f209640n = i;
        this.f209641o = i;
        this.f209644q = true;
        this.f209645r = true;
        this.f209646s = true;
        this.f209647t = 1.0f;
        this.f209648u = 1;
        this.f209649v = 500;
        this.f209613P = new Object();
        this.f209615Q = new gn5(bjf0.class);
        this.f209617R = new gn5(cjf0.class);
        this.f209618R0 = new float[8];
        this.f209620S0 = new float[8];
        this.f209622T0 = getResources().getDisplayMetrics().density;
        setMinimumDpi(160);
        setDoubleTapZoomDpi(160);
        setGestureDetector(context);
        this.f209604K0 = new Handler(new C22595a());
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b9c0.f74375Y1);
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.f74381Z1) && (string = typedArrayObtainStyledAttributes.getString(b9c0.f74381Z1)) != null && string.length() > 0) {
                setImage(nim.m159526a(string).m159538l());
            }
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.f74402c2) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(b9c0.f74402c2, 0)) > 0) {
                setImage(nim.m159527j(resourceId).m159538l());
            }
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.f74388a2)) {
                setPanEnabled(typedArrayObtainStyledAttributes.getBoolean(b9c0.f74388a2, true));
            }
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.f74416e2)) {
                setZoomEnabled(typedArrayObtainStyledAttributes.getBoolean(b9c0.f74416e2, true));
            }
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.f74395b2)) {
                setQuickScaleEnabled(typedArrayObtainStyledAttributes.getBoolean(b9c0.f74395b2, true));
            }
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.f74409d2)) {
                setTileBackgroundColor(typedArrayObtainStyledAttributes.getColor(b9c0.f74409d2, Color.argb(0, 0, 0, 0)));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f209623U = TypedValue.applyDimension(1, 20.0f, context.getResources().getDisplayMetrics());
    }

    @AnyThread
    private int getRequiredRotation() {
        int i = this.f209633h;
        return i == -1 ? this.f209595G : i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGestureDetector(Context context) {
        this.f209609N = new GestureDetector(context, new C22596b(context));
    }

    /* JADX INFO: renamed from: A0 */
    public final void m223443A0(float f, PointF pointF, int i) {
    }

    /* JADX INFO: renamed from: B0 */
    public final void m223444B0(nim nimVar, nim nimVar2, ImageViewState imageViewState) {
        if (nimVar == null) {
            jfd0.m141176a("imageSource must not be null");
            return;
        }
        m223492w0(true);
        if (imageViewState != null) {
            m223493x0(imageViewState);
        }
        if (nimVar2 != null) {
            if (nimVar.m159529b() != null) {
                ig3.m135964a("Preview image cannot be used when a bitmap is provided for the main image");
                return;
            }
            if (nimVar.m159533f() <= 0 || nimVar.m159531d() <= 0) {
                ig3.m135964a("Preview image cannot be used unless dimensions are provided for the main image");
                return;
            }
            this.f209591E = nimVar.m159533f();
            this.f209593F = nimVar.m159531d();
            this.f209599I = nimVar2.m159532e();
            if (nimVar2.m159529b() != null) {
                this.f209628c = nimVar2.m159536i();
                m223484o0(nimVar2.m159529b());
            } else {
                Uri uriM159535h = nimVar2.m159535h();
                if (uriM159535h == null && nimVar2.m159530c() != null) {
                    uriM159535h = Uri.parse("android.resource://" + getContext().getPackageName() + "/" + nimVar2.m159530c());
                }
                m223469Z(new AsyncTaskC22599e(this, getContext(), this.f209615Q, uriM159535h, true));
            }
        }
        if (nimVar.m159529b() != null && nimVar.m159532e() != null) {
            m223483n0(Bitmap.createBitmap(nimVar.m159529b(), nimVar.m159532e().left, nimVar.m159532e().top, nimVar.m159532e().width(), nimVar.m159532e().height()), 0, false);
            return;
        }
        if (nimVar.m159529b() != null) {
            m223483n0(nimVar.m159529b(), 0, nimVar.m159536i());
            return;
        }
        this.f209597H = nimVar.m159532e();
        Uri uriM159535h2 = nimVar.m159535h();
        this.f209629d = uriM159535h2;
        if (uriM159535h2 == null && nimVar.m159530c() != null) {
            this.f209629d = Uri.parse("android.resource://" + getContext().getPackageName() + "/" + nimVar.m159530c());
        }
        if (nimVar.m159534g() || this.f209597H != null) {
            m223469Z(new AsyncTaskC22607m(this, getContext(), this.f209617R, this.f209629d));
        } else {
            m223469Z(new AsyncTaskC22599e(this, getContext(), this.f209615Q, this.f209629d, false));
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final void m223445C0(float[] fArr, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
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
    public final void m223446D0(float f, PointF pointF) {
        this.f209594F0 = null;
        this.f209588B = Float.valueOf(f);
        this.f209589C = pointF;
        this.f209590D = pointF;
        invalidate();
    }

    /* JADX INFO: renamed from: E0 */
    public final PointF m223447E0(float f, float f2, PointF pointF) {
        if (this.f209652y == null) {
            return null;
        }
        pointF.set(m223450H0(f), m223451I0(f2));
        return pointF;
    }

    /* JADX INFO: renamed from: F0 */
    public final PointF m223448F0(PointF pointF) {
        return m223447E0(pointF.x, pointF.y, new PointF());
    }

    /* JADX INFO: renamed from: G0 */
    public final Rect m223449G0(Rect rect, Rect rect2) {
        rect2.set((int) m223450H0(rect.left), (int) m223451I0(rect.top), (int) m223450H0(rect.right), (int) m223451I0(rect.bottom));
        return rect2;
    }

    /* JADX INFO: renamed from: H0 */
    public final float m223450H0(float f) {
        PointF pointF = this.f209652y;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f * this.f209650w) + pointF.x;
    }

    /* JADX INFO: renamed from: I0 */
    public final float m223451I0(float f) {
        PointF pointF = this.f209652y;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f * this.f209650w) + pointF.y;
    }

    /* JADX INFO: renamed from: J0 */
    public final boolean m223452J0(C22605k c22605k) {
        return m223457O0(0.0f) <= ((float) c22605k.f209687a.right) && ((float) c22605k.f209687a.left) <= m223457O0((float) getWidth()) && m223459P0(0.0f) <= ((float) c22605k.f209687a.bottom) && ((float) c22605k.f209687a.top) <= m223459P0((float) getHeight());
    }

    /* JADX INFO: renamed from: K0 */
    public final PointF m223453K0(float f, float f2, float f3) {
        int paddingLeft = getPaddingLeft() + (((getWidth() - getPaddingRight()) - getPaddingLeft()) / 2);
        int paddingTop = getPaddingTop() + (((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
        if (this.f209612O0 == null) {
            this.f209612O0 = new C22604j(0.0f, new PointF(0.0f, 0.0f));
        }
        this.f209612O0.f209685a = f3;
        this.f209612O0.f209686b.set(paddingLeft - (f * f3), paddingTop - (f2 * f3));
        m223472c0(true, this.f209612O0);
        return this.f209612O0.f209686b;
    }

    /* JADX INFO: renamed from: L0 */
    public final PointF m223454L0(float f, float f2) {
        return m223455M0(f, f2, new PointF());
    }

    /* JADX INFO: renamed from: M0 */
    public final PointF m223455M0(float f, float f2, PointF pointF) {
        if (this.f209652y == null) {
            return null;
        }
        pointF.set(m223457O0(f), m223459P0(f2));
        return pointF;
    }

    /* JADX INFO: renamed from: N0 */
    public final PointF m223456N0(PointF pointF) {
        return m223455M0(pointF.x, pointF.y, new PointF());
    }

    /* JADX INFO: renamed from: O0 */
    public final float m223457O0(float f) {
        PointF pointF = this.f209652y;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f - pointF.x) / this.f209650w;
    }

    /* JADX INFO: renamed from: P */
    public final int m223458P(float f) {
        int iRound;
        if (this.f209636k > 0) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            f *= this.f209636k / ((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f);
        }
        int iM223495z0 = (int) (m223495z0() * f);
        int iM223494y0 = (int) (m223494y0() * f);
        if (iM223495z0 == 0 || iM223494y0 == 0) {
            return 32;
        }
        int i = 1;
        if (m223494y0() > iM223494y0 || m223495z0() > iM223495z0) {
            iRound = Math.round(m223494y0() / iM223494y0);
            int iRound2 = Math.round(m223495z0() / iM223495z0);
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
    public final float m223459P0(float f) {
        PointF pointF = this.f209652y;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f - pointF.y) / this.f209650w;
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m223460Q() {
        boolean zM223477h0 = m223477h0();
        if (!this.f209598H0 && zM223477h0) {
            m223489t0();
            this.f209598H0 = true;
            m223482m0();
            InterfaceC22602h interfaceC22602h = this.f209600I0;
            if (interfaceC22602h != null) {
                interfaceC22602h.mo79104b();
            }
        }
        return zM223477h0;
    }

    /* JADX INFO: renamed from: R */
    public final boolean m223461R() {
        boolean z = getWidth() > 0 && getHeight() > 0 && this.f209591E > 0 && this.f209593F > 0 && (this.f209626a != null || m223477h0());
        if (!this.f209596G0 && z) {
            m223489t0();
            this.f209596G0 = true;
            m223485p0();
            InterfaceC22602h interfaceC22602h = this.f209600I0;
            if (interfaceC22602h != null) {
                interfaceC22602h.mo223535e();
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: S */
    public final void m223462S() {
        if (this.f209606L0 == null) {
            Paint paint = new Paint();
            this.f209606L0 = paint;
            paint.setAntiAlias(true);
            this.f209606L0.setFilterBitmap(true);
            this.f209606L0.setDither(true);
        }
        if (this.f209608M0 == null && this.f209632g) {
            Paint paint2 = new Paint();
            this.f209608M0 = paint2;
            paint2.setTextSize(18.0f);
            this.f209608M0.setColor(-65281);
            this.f209608M0.setStyle(Paint.Style.STROKE);
        }
    }

    @AnyThread
    /* JADX INFO: renamed from: T */
    public final void m223463T(String str, Object... objArr) {
    }

    /* JADX INFO: renamed from: U */
    public final float m223464U(float f, float f2, float f3, float f4) {
        float f5 = f - f2;
        float f6 = f3 - f4;
        return (float) Math.sqrt((f5 * f5) + (f6 * f6));
    }

    /* JADX INFO: renamed from: V */
    public final void m223465V(PointF pointF, PointF pointF2) {
        SubsamplingScaleImageView subsamplingScaleImageView;
        if (!this.f209644q) {
            PointF pointF3 = this.f209590D;
            if (pointF3 != null) {
                pointF.x = pointF3.x;
                pointF.y = pointF3.y;
            } else {
                pointF.x = m223495z0() / 2;
                pointF.y = m223494y0() / 2;
            }
        }
        float fMin = Math.min(this.f209634i, this.f209647t);
        boolean z = ((double) this.f209650w) <= ((double) fMin) * 0.9d;
        if (!z) {
            fMin = m223481l0();
        }
        float f = fMin;
        int i = this.f209648u;
        if (i != 3) {
            if (i == 2 || !z || !this.f209644q) {
                subsamplingScaleImageView = this;
                new C22598d(f, pointF).m223527f(false).m223525d(subsamplingScaleImageView.f209649v).m223528g(4).m223524c();
            } else if (i == 1) {
                subsamplingScaleImageView = this;
                new C22598d(f, pointF, pointF2).m223527f(false).m223525d(subsamplingScaleImageView.f209649v).m223528g(4).m223524c();
            }
            subsamplingScaleImageView.invalidate();
        }
        m223446D0(f, pointF);
        subsamplingScaleImageView = this;
        subsamplingScaleImageView.invalidate();
    }

    /* JADX INFO: renamed from: W */
    public final float m223466W(int i, long j, float f, float f2, long j2) {
        if (i == 1) {
            return m223468Y(j, f, f2, j2);
        }
        if (i == 2) {
            return m223467X(j, f, f2, j2);
        }
        f3c.m119257a("Unexpected easing type: ", i);
        return 0.0f;
    }

    /* JADX INFO: renamed from: X */
    public final float m223467X(long j, float f, float f2, long j2) {
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
    public final float m223468Y(long j, float f, float f2, long j2) {
        float f3 = j / j2;
        return ((-f2) * f3 * (f3 - 2.0f)) + f;
    }

    /* JADX INFO: renamed from: Z */
    public final void m223469Z(AsyncTask<Void, Void, ?> asyncTask) {
        if (this.f209642p) {
            try {
                AsyncTask.class.getMethod("executeOnExecutor", Executor.class, Object[].class).invoke(asyncTask, (Executor) AsyncTask.class.getField("THREAD_POOL_EXECUTOR").get(null), null);
                return;
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
        }
        asyncTask.execute(new Void[0]);
    }

    @AnyThread
    /* JADX INFO: renamed from: a0 */
    public final void m223470a0(Rect rect, Rect rect2) {
        if (getRequiredRotation() == 0) {
            rect2.set(rect);
            return;
        }
        if (getRequiredRotation() == 90) {
            int i = rect.top;
            int i2 = this.f209593F;
            rect2.set(i, i2 - rect.right, rect.bottom, i2 - rect.left);
            return;
        }
        int requiredRotation = getRequiredRotation();
        int i3 = this.f209591E;
        if (requiredRotation != 180) {
            rect2.set(i3 - rect.bottom, rect.left, i3 - rect.top, rect.right);
            return;
        }
        int i4 = i3 - rect.right;
        int i5 = this.f209593F;
        rect2.set(i4, i5 - rect.bottom, i3 - rect.left, i5 - rect.top);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m223471b0(boolean z) {
        boolean z2;
        float f = 0.0f;
        if (this.f209652y == null) {
            this.f209652y = new PointF(0.0f, 0.0f);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f209612O0 == null) {
            this.f209612O0 = new C22604j(f, new PointF(0.0f, 0.0f));
        }
        this.f209612O0.f209685a = this.f209650w;
        this.f209612O0.f209686b.set(this.f209652y);
        m223472c0(z, this.f209612O0);
        this.f209650w = this.f209612O0.f209685a;
        this.f209652y.set(this.f209612O0.f209686b);
        if (z2) {
            this.f209652y.set(m223453K0(m223495z0() / 2, m223494y0() / 2, this.f209650w));
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m223472c0(boolean z, C22604j c22604j) {
        float fMax;
        int iMax;
        float fMax2;
        if (this.f209638l == 2 && m223478i0()) {
            z = false;
        }
        PointF pointF = c22604j.f209686b;
        float fM223480k0 = m223480k0(c22604j.f209685a);
        float fM223495z0 = m223495z0() * fM223480k0;
        float fM223494y0 = m223494y0() * fM223480k0;
        if (this.f209638l == 3 && m223478i0()) {
            pointF.x = Math.max(pointF.x, (getWidth() / 2) - fM223495z0);
            pointF.y = Math.max(pointF.y, (getHeight() / 2) - fM223494y0);
        } else if (z) {
            pointF.x = Math.max(pointF.x, getWidth() - fM223495z0);
            pointF.y = Math.max(pointF.y, getHeight() - fM223494y0);
        } else {
            pointF.x = Math.max(pointF.x, -fM223495z0);
            pointF.y = Math.max(pointF.y, -fM223494y0);
        }
        float paddingLeft = (getPaddingLeft() > 0 || getPaddingRight() > 0) ? getPaddingLeft() / (getPaddingLeft() + getPaddingRight()) : 0.5f;
        float paddingTop = (getPaddingTop() > 0 || getPaddingBottom() > 0) ? getPaddingTop() / (getPaddingTop() + getPaddingBottom()) : 0.5f;
        if (this.f209638l != 3 || !m223478i0()) {
            if (z) {
                fMax = Math.max(0.0f, (getWidth() - fM223495z0) * paddingLeft);
                fMax2 = Math.max(0.0f, (getHeight() - fM223494y0) * paddingTop);
            } else {
                fMax = Math.max(0, getWidth());
                iMax = Math.max(0, getHeight());
            }
            pointF.x = Math.min(pointF.x, fMax);
            pointF.y = Math.min(pointF.y, fMax2);
            c22604j.f209685a = fM223480k0;
        }
        fMax = Math.max(0, getWidth() / 2);
        iMax = Math.max(0, getHeight() / 2);
        fMax2 = iMax;
        pointF.x = Math.min(pointF.x, fMax);
        pointF.y = Math.min(pointF.y, fMax2);
        c22604j.f209685a = fM223480k0;
    }

    @AnyThread
    /* JADX INFO: renamed from: d0 */
    public final int m223473d0(Context context, String str) {
        int i = 0;
        if (str.startsWith("content")) {
            Cursor cursorQuery = null;
            try {
                try {
                    cursorQuery = context.getContentResolver().query(Uri.parse(str), new String[]{Constants.KEY_ORIENTATION}, null, null, null);
                    if (cursorQuery != null && cursorQuery.moveToFirst()) {
                        int i2 = cursorQuery.getInt(0);
                        if (f209581U0.contains(Integer.valueOf(i2)) && i2 != -1) {
                            i = i2;
                        }
                    }
                } catch (Exception e) {
                    CrashHelper.m81296c(e);
                }
            } finally {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        } else if (str.startsWith("file:///") && !str.startsWith("file:///android_asset/")) {
            try {
                int attributeInt = new ExifInterface(str.substring(7)).getAttributeInt(j6f.TAG_ORIENTATION, 1);
                if (attributeInt != 1 && attributeInt != 0) {
                    if (attributeInt == 6) {
                        return 90;
                    }
                    if (attributeInt == 3) {
                        return 180;
                    }
                    if (attributeInt == 8) {
                        return 270;
                    }
                }
                return 0;
            } catch (Exception e2) {
                CrashHelper.m81296c(e2);
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: e0 */
    public final Point m223474e0(Canvas canvas) {
        int iIntValue;
        int iIntValue2 = 2048;
        try {
            iIntValue = ((Integer) Canvas.class.getMethod("getMaximumBitmapWidth", null).invoke(canvas, null)).intValue();
            try {
                iIntValue2 = ((Integer) Canvas.class.getMethod("getMaximumBitmapHeight", null).invoke(canvas, null)).intValue();
            } catch (Exception e) {
                e = e;
                CrashHelper.m81296c(e);
            }
        } catch (Exception e2) {
            e = e2;
            iIntValue = 2048;
        }
        return new Point(Math.min(iIntValue, this.f209640n), Math.min(iIntValue2, this.f209641o));
    }

    /* JADX INFO: renamed from: f0 */
    public final synchronized void m223475f0(Point point) throws Throwable {
        Throwable th;
        SubsamplingScaleImageView subsamplingScaleImageView;
        try {
            try {
                m223463T("initialiseBaseLayer maxTileDimensions=%dx%d", Integer.valueOf(point.x), Integer.valueOf(point.y));
                C22604j c22604j = new C22604j(0.0f, new PointF(0.0f, 0.0f));
                this.f209612O0 = c22604j;
                m223472c0(true, c22604j);
                int iM223458P = m223458P(this.f209612O0.f209685a);
                this.f209630e = iM223458P;
                if (iM223458P > 1) {
                    try {
                        this.f209630e = iM223458P / 2;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                if (this.f209630e != 1 || this.f209597H != null || m223495z0() >= point.x || m223494y0() >= point.y) {
                    subsamplingScaleImageView = this;
                    subsamplingScaleImageView.m223476g0(point);
                    Iterator<C22605k> it = subsamplingScaleImageView.f209631f.get(Integer.valueOf(subsamplingScaleImageView.f209630e)).iterator();
                    while (it.hasNext()) {
                        subsamplingScaleImageView.m223469Z(new AsyncTaskC22606l(subsamplingScaleImageView, subsamplingScaleImageView.f209611O, it.next()));
                    }
                    subsamplingScaleImageView.m223490u0(true);
                } else {
                    this.f209611O.recycle();
                    this.f209611O = null;
                    subsamplingScaleImageView = this;
                    subsamplingScaleImageView.m223469Z(new AsyncTaskC22599e(subsamplingScaleImageView, getContext(), this.f209615Q, this.f209629d, false));
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
    public final void m223476g0(Point point) {
        m223463T("initialiseTileMap maxTileDimensions=%dx%d", Integer.valueOf(point.x), Integer.valueOf(point.y));
        this.f209631f = new LinkedHashMap();
        int i = this.f209630e;
        int i2 = 1;
        int i3 = 1;
        int i4 = 1;
        while (true) {
            int iM223495z0 = m223495z0() / i3;
            int iM223494y0 = m223494y0() / i4;
            int i5 = iM223495z0 / i;
            int i6 = iM223494y0 / i;
            while (true) {
                if (i5 + i3 + i2 <= point.x && (i5 <= ((double) getWidth()) * 1.25d || i >= this.f209630e)) {
                    break;
                }
                i3++;
                iM223495z0 = m223495z0() / i3;
                i5 = iM223495z0 / i;
            }
            while (true) {
                if (i6 + i4 + i2 <= point.y && (i6 <= ((double) getHeight()) * 1.25d || i >= this.f209630e)) {
                    break;
                }
                i4++;
                iM223494y0 = m223494y0() / i4;
                i6 = iM223494y0 / i;
            }
            ArrayList arrayList = new ArrayList(i3 * i4);
            int i7 = 0;
            while (i7 < i3) {
                int i8 = 0;
                while (i8 < i4) {
                    C22605k c22605k = new C22605k();
                    c22605k.f209688b = i;
                    c22605k.f209691e = i == this.f209630e ? i2 : 0;
                    c22605k.f209687a = new Rect(i7 * iM223495z0, i8 * iM223494y0, i7 == i3 + (-1) ? m223495z0() : (i7 + 1) * iM223495z0, i8 == i4 + (-1) ? m223494y0() : (i8 + 1) * iM223494y0);
                    c22605k.f209692f = new Rect(0, 0, 0, 0);
                    c22605k.f209693g = new Rect(c22605k.f209687a);
                    arrayList.add(c22605k);
                    i8++;
                    i2 = 1;
                }
                i7++;
                i2 = 1;
            }
            this.f209631f.put(Integer.valueOf(i), arrayList);
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
        return m223454L0(getWidth() / 2, getHeight() / 2);
    }

    public float getMaxScale() {
        return this.f209634i;
    }

    public final float getMinScale() {
        return m223481l0();
    }

    public final int getOrientation() {
        return this.f209633h;
    }

    public final int getSHeight() {
        return this.f209593F;
    }

    public final int getSWidth() {
        return this.f209591E;
    }

    public final float getScale() {
        return this.f209650w;
    }

    public final ImageViewState getState() {
        if (this.f209652y == null || this.f209591E <= 0 || this.f209593F <= 0) {
            return null;
        }
        return new ImageViewState(getScale(), getCenter(), getOrientation());
    }

    /* JADX INFO: renamed from: h0 */
    public final boolean m223477h0() {
        boolean z = true;
        if (this.f209626a != null && !this.f209627b) {
            return true;
        }
        Map<Integer, List<C22605k>> map = this.f209631f;
        if (map == null) {
            return false;
        }
        for (Map.Entry<Integer, List<C22605k>> entry : map.entrySet()) {
            if (entry.getKey().intValue() == this.f209630e) {
                for (C22605k c22605k : entry.getValue()) {
                    if (c22605k.f209690d || c22605k.f209689c == null) {
                        z = false;
                    }
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m223478i0() {
        return this.f209596G0;
    }

    /* JADX INFO: renamed from: j0 */
    public final PointF m223479j0(float f, float f2, float f3, PointF pointF) {
        PointF pointFM223453K0 = m223453K0(f, f2, f3);
        pointF.set(((getPaddingLeft() + (((getWidth() - getPaddingRight()) - getPaddingLeft()) / 2)) - pointFM223453K0.x) / f3, ((getPaddingTop() + (((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2)) - pointFM223453K0.y) / f3);
        return pointF;
    }

    /* JADX INFO: renamed from: k0 */
    public final float m223480k0(float f) {
        return Math.min(this.f209634i, Math.max(m223481l0(), f));
    }

    /* JADX INFO: renamed from: l0 */
    public final float m223481l0() {
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int i = this.f209639m;
        if (i == 2) {
            return Math.max((getWidth() - paddingLeft) / m223495z0(), (getHeight() - paddingBottom) / m223494y0());
        }
        if (i == 3) {
            float f = this.f209635j;
            if (f > 0.0f) {
                return f;
            }
        }
        return Math.min((getWidth() - paddingLeft) / m223495z0(), (getHeight() - paddingBottom) / m223494y0());
    }

    /* JADX INFO: renamed from: m0 */
    public void m223482m0() {
    }

    /* JADX INFO: renamed from: n0 */
    public final synchronized void m223483n0(Bitmap bitmap, int i, boolean z) {
        InterfaceC22602h interfaceC22602h;
        try {
            m223463T("onImageLoaded", new Object[0]);
            int i2 = this.f209591E;
            if (i2 > 0 && this.f209593F > 0 && (i2 != bitmap.getWidth() || this.f209593F != bitmap.getHeight())) {
                m223492w0(false);
            }
            Bitmap bitmap2 = this.f209626a;
            if (bitmap2 != null && !this.f209628c) {
                bitmap2.recycle();
            }
            if (this.f209626a != null && this.f209628c && (interfaceC22602h = this.f209600I0) != null) {
                interfaceC22602h.mo223532a();
            }
            this.f209627b = false;
            this.f209628c = z;
            this.f209626a = bitmap;
            this.f209591E = bitmap.getWidth();
            this.f209593F = bitmap.getHeight();
            this.f209595G = i;
            boolean zM223461R = m223461R();
            boolean zM223460Q = m223460Q();
            if (zM223461R || zM223460Q) {
                invalidate();
                requestLayout();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final synchronized void m223484o0(Bitmap bitmap) {
        try {
            m223463T("onPreviewLoaded", new Object[0]);
            if (this.f209626a == null && !this.f209598H0) {
                Rect rect = this.f209599I;
                if (rect != null) {
                    this.f209626a = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), this.f209599I.height());
                } else {
                    this.f209626a = bitmap;
                }
                this.f209627b = true;
                if (m223461R()) {
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
        m223462S();
        if (this.f209591E == 0 || this.f209593F == 0 || getWidth() == 0 || getHeight() == 0) {
            return;
        }
        if (this.f209631f == null && this.f209611O != null) {
            m223475f0(m223474e0(canvas));
        }
        if (m223461R()) {
            m223489t0();
            if (this.f209594F0 != null) {
                float f = this.f209650w;
                if (this.f209587A == null) {
                    this.f209587A = new PointF(0.0f, 0.0f);
                }
                this.f209587A.set(this.f209652y);
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f209594F0.f209668l;
                boolean z = jCurrentTimeMillis > this.f209594F0.f209664h;
                long jMin = Math.min(jCurrentTimeMillis, this.f209594F0.f209664h);
                this.f209650w = m223466W(this.f209594F0.f209666j, jMin, this.f209594F0.f209657a, this.f209594F0.f209658b - this.f209594F0.f209657a, this.f209594F0.f209664h);
                float fM223466W = m223466W(this.f209594F0.f209666j, jMin, this.f209594F0.f209662f.x, this.f209594F0.f209663g.x - this.f209594F0.f209662f.x, this.f209594F0.f209664h);
                float fM223466W2 = m223466W(this.f209594F0.f209666j, jMin, this.f209594F0.f209662f.y, this.f209594F0.f209663g.y - this.f209594F0.f209662f.y, this.f209594F0.f209664h);
                this.f209652y.x -= m223450H0(this.f209594F0.f209660d.x) - fM223466W;
                this.f209652y.y -= m223451I0(this.f209594F0.f209660d.y) - fM223466W2;
                m223471b0(z || this.f209594F0.f209657a == this.f209594F0.f209658b);
                m223443A0(f, this.f209587A, this.f209594F0.f209667k);
                m223490u0(z);
                if (z) {
                    C22597c.m223499d(this.f209594F0);
                    this.f209594F0 = null;
                }
                invalidate();
            }
            if (this.f209631f == null || !m223477h0()) {
                Bitmap bitmap = this.f209626a;
                if (bitmap != null) {
                    float width = this.f209650w;
                    if (this.f209627b) {
                        width *= this.f209591E / bitmap.getWidth();
                        height = this.f209650w * (this.f209593F / this.f209626a.getHeight());
                    } else {
                        height = width;
                    }
                    if (this.f209614P0 == null) {
                        this.f209614P0 = new Matrix();
                    }
                    this.f209614P0.reset();
                    this.f209614P0.postScale(width, height);
                    this.f209614P0.postRotate(getRequiredRotation());
                    Matrix matrix = this.f209614P0;
                    PointF pointF = this.f209652y;
                    matrix.postTranslate(pointF.x, pointF.y);
                    if (getRequiredRotation() == 180) {
                        Matrix matrix2 = this.f209614P0;
                        float f2 = this.f209650w;
                        matrix2.postTranslate(this.f209591E * f2, f2 * this.f209593F);
                    } else if (getRequiredRotation() == 90) {
                        this.f209614P0.postTranslate(this.f209650w * this.f209593F, 0.0f);
                    } else if (getRequiredRotation() == 270) {
                        this.f209614P0.postTranslate(0.0f, this.f209650w * this.f209591E);
                    }
                    if (this.f209610N0 != null) {
                        if (this.f209616Q0 == null) {
                            this.f209616Q0 = new RectF();
                        }
                        this.f209616Q0.set(0.0f, 0.0f, this.f209627b ? this.f209626a.getWidth() : this.f209591E, this.f209627b ? this.f209626a.getHeight() : this.f209593F);
                        this.f209614P0.mapRect(this.f209616Q0);
                        canvas.drawRect(this.f209616Q0, this.f209610N0);
                    }
                    canvas.drawBitmap(this.f209626a, this.f209614P0, this.f209606L0);
                }
            } else {
                int iMin = Math.min(this.f209630e, m223458P(this.f209650w));
                boolean z2 = false;
                for (Map.Entry<Integer, List<C22605k>> entry : this.f209631f.entrySet()) {
                    if (entry.getKey().intValue() == iMin) {
                        for (C22605k c22605k : entry.getValue()) {
                            if (c22605k.f209691e && (c22605k.f209690d || c22605k.f209689c == null)) {
                                z2 = true;
                            }
                        }
                    }
                }
                for (Map.Entry<Integer, List<C22605k>> entry2 : this.f209631f.entrySet()) {
                    if (entry2.getKey().intValue() == iMin || z2) {
                        for (C22605k c22605k2 : entry2.getValue()) {
                            m223449G0(c22605k2.f209687a, c22605k2.f209692f);
                            if (!c22605k2.f209690d && c22605k2.f209689c != null) {
                                if (this.f209610N0 != null) {
                                    canvas.drawRect(c22605k2.f209692f, this.f209610N0);
                                }
                                if (this.f209614P0 == null) {
                                    this.f209614P0 = new Matrix();
                                }
                                this.f209614P0.reset();
                                m223445C0(this.f209618R0, 0.0f, 0.0f, c22605k2.f209689c.getWidth(), 0.0f, c22605k2.f209689c.getWidth(), c22605k2.f209689c.getHeight(), 0.0f, c22605k2.f209689c.getHeight());
                                if (getRequiredRotation() == 0) {
                                    m223445C0(this.f209620S0, c22605k2.f209692f.left, c22605k2.f209692f.top, c22605k2.f209692f.right, c22605k2.f209692f.top, c22605k2.f209692f.right, c22605k2.f209692f.bottom, c22605k2.f209692f.left, c22605k2.f209692f.bottom);
                                } else if (getRequiredRotation() == 90) {
                                    m223445C0(this.f209620S0, c22605k2.f209692f.right, c22605k2.f209692f.top, c22605k2.f209692f.right, c22605k2.f209692f.bottom, c22605k2.f209692f.left, c22605k2.f209692f.bottom, c22605k2.f209692f.left, c22605k2.f209692f.top);
                                } else if (getRequiredRotation() == 180) {
                                    m223445C0(this.f209620S0, c22605k2.f209692f.right, c22605k2.f209692f.bottom, c22605k2.f209692f.left, c22605k2.f209692f.bottom, c22605k2.f209692f.left, c22605k2.f209692f.top, c22605k2.f209692f.right, c22605k2.f209692f.top);
                                } else if (getRequiredRotation() == 270) {
                                    m223445C0(this.f209620S0, c22605k2.f209692f.left, c22605k2.f209692f.bottom, c22605k2.f209692f.left, c22605k2.f209692f.top, c22605k2.f209692f.right, c22605k2.f209692f.top, c22605k2.f209692f.right, c22605k2.f209692f.bottom);
                                }
                                this.f209614P0.setPolyToPoly(this.f209618R0, 0, this.f209620S0, 0, 4);
                                canvas.drawBitmap(c22605k2.f209689c, this.f209614P0, this.f209606L0);
                                if (this.f209632g) {
                                    canvas.drawRect(c22605k2.f209692f, this.f209608M0);
                                }
                            } else if (c22605k2.f209690d && this.f209632g) {
                                canvas.drawText("LOADING", c22605k2.f209692f.left + 5, c22605k2.f209692f.top + 35, this.f209608M0);
                            }
                            if (c22605k2.f209691e && this.f209632g) {
                                canvas.drawText("ISS " + c22605k2.f209688b + " RECT " + c22605k2.f209687a.top + Constants.SEPARATOR_COMMA + c22605k2.f209687a.left + Constants.SEPARATOR_COMMA + c22605k2.f209687a.bottom + Constants.SEPARATOR_COMMA + c22605k2.f209687a.right, c22605k2.f209692f.left + 5, c22605k2.f209692f.top + 15, this.f209608M0);
                            }
                        }
                    }
                }
            }
            if (this.f209632g) {
                Locale locale = Locale.ENGLISH;
                canvas.drawText("Scale: ".concat(String.format(locale, "%.2f", Float.valueOf(this.f209650w))), 5.0f, 15.0f, this.f209608M0);
                canvas.drawText("Translate: " + String.format(locale, "%.2f", Float.valueOf(this.f209652y.x)) + ":" + String.format(locale, "%.2f", Float.valueOf(this.f209652y.y)), 5.0f, 35.0f, this.f209608M0);
                PointF center = getCenter();
                canvas.drawText("Source center: " + String.format(locale, "%.2f", Float.valueOf(center.x)) + ":" + String.format(locale, "%.2f", Float.valueOf(center.y)), 5.0f, 55.0f, this.f209608M0);
                this.f209608M0.setStrokeWidth(2.0f);
                C22597c c22597c = this.f209594F0;
                if (c22597c != null) {
                    PointF pointFM223448F0 = m223448F0(c22597c.f209659c);
                    PointF pointFM223448F1 = m223448F0(this.f209594F0.f209661e);
                    PointF pointFM223448F2 = m223448F0(this.f209594F0.f209660d);
                    canvas.drawCircle(pointFM223448F0.x, pointFM223448F0.y, 10.0f, this.f209608M0);
                    this.f209608M0.setColor(-65536);
                    canvas.drawCircle(pointFM223448F1.x, pointFM223448F1.y, 20.0f, this.f209608M0);
                    this.f209608M0.setColor(-16776961);
                    canvas.drawCircle(pointFM223448F2.x, pointFM223448F2.y, 25.0f, this.f209608M0);
                    this.f209608M0.setColor(-16711681);
                    canvas.drawCircle(getWidth() / 2, getHeight() / 2, 30.0f, this.f209608M0);
                }
                if (this.f209619S != null) {
                    this.f209608M0.setColor(-65536);
                    PointF pointF2 = this.f209619S;
                    canvas.drawCircle(pointF2.x, pointF2.y, 20.0f, this.f209608M0);
                }
                if (this.f209643p0 != null) {
                    this.f209608M0.setColor(-16776961);
                    canvas.drawCircle(m223450H0(this.f209643p0.x), m223451I0(this.f209643p0.y), 35.0f, this.f209608M0);
                }
                if (this.f209592E0 != null) {
                    this.f209608M0.setColor(-16711681);
                    PointF pointF3 = this.f209592E0;
                    canvas.drawCircle(pointF3.x, pointF3.y, 30.0f, this.f209608M0);
                }
                this.f209608M0.setColor(-65281);
                this.f209608M0.setStrokeWidth(1.0f);
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
        if (this.f209591E > 0 && this.f209593F > 0) {
            if (z && z2) {
                size = m223495z0();
                size2 = m223494y0();
            } else if (z2) {
                size2 = (int) ((((double) m223494y0()) / ((double) m223495z0())) * ((double) size));
            } else if (z) {
                size = (int) ((((double) m223495z0()) / ((double) m223494y0())) * ((double) size2));
            }
        }
        setMeasuredDimension(Math.max(size, getSuggestedMinimumWidth()), Math.max(size2, getSuggestedMinimumHeight()));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        m223463T("onSizeChanged %dx%d -> %dx%d", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i), Integer.valueOf(i2));
        PointF center = getCenter();
        if (!this.f209596G0 || center == null) {
            return;
        }
        this.f209594F0 = null;
        this.f209588B = Float.valueOf(this.f209650w);
        this.f209589C = center;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        GestureDetector gestureDetector;
        C22597c c22597c = this.f209594F0;
        if (c22597c != null && !c22597c.f209665i) {
            m223491v0(true);
            return true;
        }
        C22597c c22597c2 = this.f209594F0;
        if (c22597c2 != null) {
            C22597c.m223499d(c22597c2);
        }
        this.f209594F0 = null;
        if (this.f209652y == null) {
            return true;
        }
        if (!this.f209605L && ((gestureDetector = this.f209609N) == null || gestureDetector.onTouchEvent(motionEvent))) {
            this.f209601J = false;
            this.f209603K = false;
            this.f209607M = 0;
            return true;
        }
        if (this.f209653z == null) {
            this.f209653z = new PointF(0.0f, 0.0f);
        }
        if (this.f209587A == null) {
            this.f209587A = new PointF(0.0f, 0.0f);
        }
        if (this.f209619S == null) {
            this.f209619S = new PointF(0.0f, 0.0f);
        }
        float f = this.f209650w;
        this.f209587A.set(this.f209652y);
        boolean zM223488s0 = m223488s0(motionEvent);
        m223443A0(f, this.f209587A, 2);
        return zM223488s0 || super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: p0 */
    public void m223485p0() {
    }

    /* JADX INFO: renamed from: q0 */
    public final synchronized void m223486q0() {
        Bitmap bitmap;
        try {
            m223463T("onTileLoaded", new Object[0]);
            m223461R();
            m223460Q();
            if (m223477h0() && (bitmap = this.f209626a) != null) {
                if (!this.f209628c) {
                    bitmap.recycle();
                }
                this.f209626a = null;
                InterfaceC22602h interfaceC22602h = this.f209600I0;
                if (interfaceC22602h != null && this.f209628c) {
                    interfaceC22602h.mo223532a();
                }
                this.f209627b = false;
                this.f209628c = false;
            }
            invalidate();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final synchronized void m223487r0(xhm xhmVar, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        try {
            m223463T("onTilesInited sWidth=%d, sHeight=%d, sOrientation=%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.f209633h));
            int i8 = this.f209591E;
            if (i8 > 0 && (i7 = this.f209593F) > 0 && (i8 != i || i7 != i2)) {
                m223492w0(false);
                Bitmap bitmap = this.f209626a;
                if (bitmap != null) {
                    if (!this.f209628c) {
                        bitmap.recycle();
                    }
                    this.f209626a = null;
                    InterfaceC22602h interfaceC22602h = this.f209600I0;
                    if (interfaceC22602h != null && this.f209628c) {
                        interfaceC22602h.mo223532a();
                    }
                    this.f209627b = false;
                    this.f209628c = false;
                }
            }
            this.f209611O = xhmVar;
            this.f209591E = i;
            this.f209593F = i2;
            this.f209595G = i3;
            m223461R();
            if (!m223460Q() && (i4 = this.f209640n) > 0 && i4 != (i5 = f209586Z0) && (i6 = this.f209641o) > 0 && i6 != i5 && getWidth() > 0 && getHeight() > 0) {
                m223475f0(new Point(this.f209640n, this.f209641o));
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
    public final boolean m223488s0(@androidx.annotation.NonNull android.view.MotionEvent r13) {
        /*
            Method dump skipped, instruction units count: 1130
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p147v.fresco.subscaleview.SubsamplingScaleImageView.m223488s0(android.view.MotionEvent):boolean");
    }

    public final void setBitmapDecoderClass(Class<? extends bfm> cls) {
        if (cls != null) {
            this.f209615Q = new gn5(cls);
        } else {
            ig3.m135964a("Decoder class cannot be set to null");
        }
    }

    public final void setBitmapDecoderFactory(ehd<? extends bfm> ehdVar) {
        if (ehdVar != null) {
            this.f209615Q = ehdVar;
        } else {
            ig3.m135964a("Decoder factory cannot be set to null");
        }
    }

    public final void setDebug(boolean z) {
        this.f209632g = z;
    }

    public final void setDoubleTapZoomDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setDoubleTapZoomScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / i);
    }

    public final void setDoubleTapZoomDuration(int i) {
        this.f209649v = Math.max(0, i);
    }

    public final void setDoubleTapZoomScale(float f) {
        this.f209647t = f;
    }

    public final void setDoubleTapZoomStyle(int i) {
        if (f209582V0.contains(Integer.valueOf(i))) {
            this.f209648u = i;
        } else {
            k250.m144273a("Invalid zoom style: ", i);
        }
    }

    public final void setImage(nim nimVar) {
        m223444B0(nimVar, null, null);
    }

    public final void setMaxScale(float f) {
        this.f209634i = f;
    }

    public void setMaxTileSize(int i) {
        this.f209640n = i;
        this.f209641o = i;
    }

    public final void setMaximumDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setMinScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / i);
    }

    public final void setMinScale(float f) {
        this.f209635j = f;
    }

    public final void setMinimumDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setMaxScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / i);
    }

    public final void setMinimumScaleType(int i) {
        if (!f209585Y0.contains(Integer.valueOf(i))) {
            k250.m144273a("Invalid scale type: ", i);
            return;
        }
        this.f209639m = i;
        if (m223478i0()) {
            m223471b0(true);
            invalidate();
        }
    }

    public void setMinimumTileDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f209636k = (int) Math.min((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f, i);
        if (m223478i0()) {
            m223492w0(false);
            invalidate();
        }
    }

    public void setOnImageEventListener(InterfaceC22602h interfaceC22602h) {
        this.f209600I0 = interfaceC22602h;
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f209602J0 = onLongClickListener;
    }

    public void setOnStateChangedListener(InterfaceC22603i interfaceC22603i) {
    }

    public final void setOrientation(int i) {
        if (!f209581U0.contains(Integer.valueOf(i))) {
            k250.m144273a("Invalid orientation: ", i);
            return;
        }
        this.f209633h = i;
        m223492w0(false);
        invalidate();
        requestLayout();
    }

    public final void setPanEnabled(boolean z) {
        PointF pointF;
        this.f209644q = z;
        if (z || (pointF = this.f209652y) == null) {
            return;
        }
        pointF.x = (getWidth() / 2) - (this.f209650w * (m223495z0() / 2));
        this.f209652y.y = (getHeight() / 2) - (this.f209650w * (m223494y0() / 2));
        if (m223478i0()) {
            m223490u0(true);
            invalidate();
        }
    }

    public final void setPanLimit(int i) {
        if (!f209584X0.contains(Integer.valueOf(i))) {
            k250.m144273a("Invalid pan limit: ", i);
            return;
        }
        this.f209638l = i;
        if (m223478i0()) {
            m223471b0(true);
            invalidate();
        }
    }

    public void setParallelLoadingEnabled(boolean z) {
        this.f209642p = z;
    }

    public final void setQuickScaleEnabled(boolean z) {
        this.f209646s = z;
    }

    public final void setRegionDecoderClass(Class<? extends xhm> cls) {
        if (cls != null) {
            this.f209617R = new gn5(cls);
        } else {
            ig3.m135964a("Decoder class cannot be set to null");
        }
    }

    public final void setRegionDecoderFactory(ehd<? extends xhm> ehdVar) {
        if (ehdVar != null) {
            this.f209617R = ehdVar;
        } else {
            ig3.m135964a("Decoder factory cannot be set to null");
        }
    }

    public final void setTileBackgroundColor(int i) {
        if (Color.alpha(i) == 0) {
            this.f209610N0 = null;
        } else {
            Paint paint = new Paint();
            this.f209610N0 = paint;
            paint.setStyle(Paint.Style.FILL);
            this.f209610N0.setColor(i);
        }
        invalidate();
    }

    public final void setZoomEnabled(boolean z) {
        this.f209645r = z;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m223489t0() {
        Float f;
        if (getWidth() == 0 || getHeight() == 0 || this.f209591E <= 0 || this.f209593F <= 0) {
            return;
        }
        if (this.f209589C != null && (f = this.f209588B) != null) {
            this.f209650w = f.floatValue();
            if (this.f209652y == null) {
                this.f209652y = new PointF();
            }
            this.f209652y.x = (getWidth() / 2) - (this.f209650w * this.f209589C.x);
            this.f209652y.y = (getHeight() / 2) - (this.f209650w * this.f209589C.y);
            this.f209589C = null;
            this.f209588B = null;
            m223471b0(true);
            m223490u0(true);
        }
        m223471b0(false);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m223490u0(boolean z) {
        if (this.f209611O == null || this.f209631f == null) {
            return;
        }
        int iMin = Math.min(this.f209630e, m223458P(this.f209650w));
        Iterator<Map.Entry<Integer, List<C22605k>>> it = this.f209631f.entrySet().iterator();
        while (it.hasNext()) {
            for (C22605k c22605k : it.next().getValue()) {
                if (c22605k.f209688b < iMin || (c22605k.f209688b > iMin && c22605k.f209688b != this.f209630e)) {
                    c22605k.f209691e = false;
                    if (c22605k.f209689c != null) {
                        c22605k.f209689c.recycle();
                        c22605k.f209689c = null;
                    }
                }
                if (c22605k.f209688b == iMin) {
                    if (m223452J0(c22605k)) {
                        c22605k.f209691e = true;
                        if (!c22605k.f209690d && c22605k.f209689c == null && z) {
                            m223469Z(new AsyncTaskC22606l(this, this.f209611O, c22605k));
                        }
                    } else if (c22605k.f209688b != this.f209630e) {
                        c22605k.f209691e = false;
                        if (c22605k.f209689c != null) {
                            c22605k.f209689c.recycle();
                            c22605k.f209689c = null;
                        }
                    }
                } else if (c22605k.f209688b == this.f209630e) {
                    c22605k.f209691e = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m223491v0(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m223492w0(boolean z) {
        InterfaceC22602h interfaceC22602h;
        m223463T("reset newImage=" + z, new Object[0]);
        this.f209650w = 0.0f;
        this.f209651x = 0.0f;
        this.f209652y = null;
        this.f209653z = null;
        this.f209587A = null;
        this.f209588B = Float.valueOf(0.0f);
        this.f209589C = null;
        this.f209590D = null;
        this.f209601J = false;
        this.f209603K = false;
        this.f209605L = false;
        this.f209607M = 0;
        this.f209630e = 0;
        this.f209619S = null;
        this.f209621T = 0.0f;
        this.f209624V = 0.0f;
        this.f209625W = false;
        this.f209643p0 = null;
        this.f209637k0 = null;
        this.f209592E0 = null;
        this.f209594F0 = null;
        this.f209612O0 = null;
        this.f209614P0 = null;
        this.f209616Q0 = null;
        if (z) {
            this.f209629d = null;
            if (this.f209611O != null) {
                synchronized (this.f209613P) {
                    this.f209611O.recycle();
                    this.f209611O = null;
                }
            }
            Bitmap bitmap = this.f209626a;
            if (bitmap != null && !this.f209628c) {
                bitmap.recycle();
            }
            if (this.f209626a != null && this.f209628c && (interfaceC22602h = this.f209600I0) != null) {
                interfaceC22602h.mo223532a();
            }
            this.f209591E = 0;
            this.f209593F = 0;
            this.f209595G = 0;
            this.f209597H = null;
            this.f209599I = null;
            this.f209596G0 = false;
            this.f209598H0 = false;
            this.f209626a = null;
            this.f209627b = false;
            this.f209628c = false;
        }
        Map<Integer, List<C22605k>> map = this.f209631f;
        if (map != null) {
            Iterator<Map.Entry<Integer, List<C22605k>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                for (C22605k c22605k : it.next().getValue()) {
                    c22605k.f209691e = false;
                    if (c22605k.f209689c != null) {
                        c22605k.f209689c.recycle();
                        c22605k.f209689c = null;
                    }
                }
            }
            this.f209631f = null;
        }
        setGestureDetector(getContext());
    }

    /* JADX INFO: renamed from: x0 */
    public final void m223493x0(ImageViewState imageViewState) {
        if (imageViewState == null || imageViewState.getCenter() == null || !f209581U0.contains(Integer.valueOf(imageViewState.getOrientation()))) {
            return;
        }
        this.f209633h = imageViewState.getOrientation();
        this.f209588B = Float.valueOf(imageViewState.getScale());
        this.f209589C = imageViewState.getCenter();
        invalidate();
    }

    /* JADX INFO: renamed from: y0 */
    public final int m223494y0() {
        int requiredRotation = getRequiredRotation();
        return (requiredRotation == 90 || requiredRotation == 270) ? this.f209591E : this.f209593F;
    }

    /* JADX INFO: renamed from: z0 */
    public final int m223495z0() {
        int requiredRotation = getRequiredRotation();
        return (requiredRotation == 90 || requiredRotation == 270) ? this.f209593F : this.f209591E;
    }

    /* JADX INFO: renamed from: v.fresco.subscaleview.SubsamplingScaleImageView$d */
    public final class C22598d {

        /* JADX INFO: renamed from: a */
        public final float f209669a;

        /* JADX INFO: renamed from: b */
        public final PointF f209670b;

        /* JADX INFO: renamed from: c */
        public final PointF f209671c;

        /* JADX INFO: renamed from: d */
        public long f209672d;

        /* JADX INFO: renamed from: e */
        public int f209673e;

        /* JADX INFO: renamed from: f */
        public int f209674f;

        /* JADX INFO: renamed from: g */
        public boolean f209675g;

        /* JADX INFO: renamed from: h */
        public boolean f209676h;

        public C22598d(PointF pointF) {
            this.f209672d = 500L;
            this.f209673e = 2;
            this.f209674f = 1;
            this.f209675g = true;
            this.f209676h = true;
            this.f209669a = SubsamplingScaleImageView.this.f209650w;
            this.f209670b = pointF;
            this.f209671c = null;
        }

        /* JADX INFO: renamed from: c */
        public void m223524c() {
            PointF pointFM223479j0;
            if (SubsamplingScaleImageView.this.f209594F0 != null) {
                C22597c.m223499d(SubsamplingScaleImageView.this.f209594F0);
            }
            int paddingLeft = SubsamplingScaleImageView.this.getPaddingLeft() + (((SubsamplingScaleImageView.this.getWidth() - SubsamplingScaleImageView.this.getPaddingRight()) - SubsamplingScaleImageView.this.getPaddingLeft()) / 2);
            int paddingTop = SubsamplingScaleImageView.this.getPaddingTop() + (((SubsamplingScaleImageView.this.getHeight() - SubsamplingScaleImageView.this.getPaddingBottom()) - SubsamplingScaleImageView.this.getPaddingTop()) / 2);
            float fM223480k0 = SubsamplingScaleImageView.this.m223480k0(this.f209669a);
            if (this.f209676h) {
                SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
                PointF pointF = this.f209670b;
                pointFM223479j0 = subsamplingScaleImageView.m223479j0(pointF.x, pointF.y, fM223480k0, new PointF());
            } else {
                pointFM223479j0 = this.f209670b;
            }
            SubsamplingScaleImageView.this.f209594F0 = new C22597c();
            SubsamplingScaleImageView.this.f209594F0.f209657a = SubsamplingScaleImageView.this.f209650w;
            SubsamplingScaleImageView.this.f209594F0.f209658b = fM223480k0;
            SubsamplingScaleImageView.this.f209594F0.f209668l = System.currentTimeMillis();
            SubsamplingScaleImageView.this.f209594F0.f209661e = pointFM223479j0;
            SubsamplingScaleImageView.this.f209594F0.f209659c = SubsamplingScaleImageView.this.getCenter();
            SubsamplingScaleImageView.this.f209594F0.f209660d = pointFM223479j0;
            SubsamplingScaleImageView.this.f209594F0.f209662f = SubsamplingScaleImageView.this.m223448F0(pointFM223479j0);
            SubsamplingScaleImageView.this.f209594F0.f209663g = new PointF(paddingLeft, paddingTop);
            SubsamplingScaleImageView.this.f209594F0.f209664h = this.f209672d;
            SubsamplingScaleImageView.this.f209594F0.f209665i = this.f209675g;
            SubsamplingScaleImageView.this.f209594F0.f209666j = this.f209673e;
            SubsamplingScaleImageView.this.f209594F0.f209667k = this.f209674f;
            SubsamplingScaleImageView.this.f209594F0.f209668l = System.currentTimeMillis();
            SubsamplingScaleImageView.this.f209594F0.getClass();
            PointF pointF2 = this.f209671c;
            if (pointF2 != null) {
                float f = pointF2.x - (SubsamplingScaleImageView.this.f209594F0.f209659c.x * fM223480k0);
                float f2 = this.f209671c.y - (SubsamplingScaleImageView.this.f209594F0.f209659c.y * fM223480k0);
                C22604j c22604j = new C22604j(fM223480k0, new PointF(f, f2));
                SubsamplingScaleImageView.this.m223472c0(true, c22604j);
                SubsamplingScaleImageView.this.f209594F0.f209663g = new PointF(this.f209671c.x + (c22604j.f209686b.x - f), this.f209671c.y + (c22604j.f209686b.y - f2));
            }
            SubsamplingScaleImageView.this.invalidate();
        }

        /* JADX INFO: renamed from: d */
        public C22598d m223525d(long j) {
            this.f209672d = j;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C22598d m223526e(int i) {
            if (SubsamplingScaleImageView.f209583W0.contains(Integer.valueOf(i))) {
                this.f209673e = i;
                return this;
            }
            k250.m144273a("Unknown easing type: ", i);
            return null;
        }

        /* JADX INFO: renamed from: f */
        public C22598d m223527f(boolean z) {
            this.f209675g = z;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public final C22598d m223528g(int i) {
            this.f209674f = i;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public final C22598d m223529h(boolean z) {
            this.f209676h = z;
            return this;
        }

        public C22598d(float f, PointF pointF) {
            this.f209672d = 500L;
            this.f209673e = 2;
            this.f209674f = 1;
            this.f209675g = true;
            this.f209676h = true;
            this.f209669a = f;
            this.f209670b = pointF;
            this.f209671c = null;
        }

        public C22598d(float f, PointF pointF, PointF pointF2) {
            this.f209672d = 500L;
            this.f209673e = 2;
            this.f209674f = 1;
            this.f209675g = true;
            this.f209676h = true;
            this.f209669a = f;
            this.f209670b = pointF;
            this.f209671c = pointF2;
        }
    }

    public SubsamplingScaleImageView(Context context) {
        this(context, null);
    }
}
