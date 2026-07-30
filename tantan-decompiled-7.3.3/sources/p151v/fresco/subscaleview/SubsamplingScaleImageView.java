package p151v.fresco.subscaleview;

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
import p153l.akm;
import p153l.hhc0;
import p153l.kid;
import p153l.ko5;
import p153l.krf0;
import p153l.lrf0;
import p153l.mnd0;
import p153l.o4c;
import p153l.p7f;
import p153l.qkm;
import p153l.rhm;
import p153l.wg3;
import p153l.za50;

/* JADX INFO: loaded from: classes3.dex */
public class SubsamplingScaleImageView extends View {

    /* JADX INFO: renamed from: U0 */
    public static final List<Integer> f210503U0 = Arrays.asList(0, 90, 180, 270, -1);

    /* JADX INFO: renamed from: V0 */
    public static final List<Integer> f210504V0 = Arrays.asList(1, 2, 3);

    /* JADX INFO: renamed from: W0 */
    public static final List<Integer> f210505W0 = Arrays.asList(2, 1);

    /* JADX INFO: renamed from: X0 */
    public static final List<Integer> f210506X0 = Arrays.asList(1, 2, 3);

    /* JADX INFO: renamed from: Y0 */
    public static final List<Integer> f210507Y0 = Arrays.asList(2, 1, 3);

    /* JADX INFO: renamed from: Z0 */
    public static int f210508Z0 = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: A */
    public PointF f210509A;

    /* JADX INFO: renamed from: B */
    public Float f210510B;

    /* JADX INFO: renamed from: C */
    public PointF f210511C;

    /* JADX INFO: renamed from: D */
    public PointF f210512D;

    /* JADX INFO: renamed from: E */
    public int f210513E;

    /* JADX INFO: renamed from: E0 */
    public PointF f210514E0;

    /* JADX INFO: renamed from: F */
    public int f210515F;

    /* JADX INFO: renamed from: F0 */
    public C22712c f210516F0;

    /* JADX INFO: renamed from: G */
    public int f210517G;

    /* JADX INFO: renamed from: G0 */
    public boolean f210518G0;

    /* JADX INFO: renamed from: H */
    public Rect f210519H;

    /* JADX INFO: renamed from: H0 */
    public boolean f210520H0;

    /* JADX INFO: renamed from: I */
    public Rect f210521I;

    /* JADX INFO: renamed from: I0 */
    public InterfaceC22717h f210522I0;

    /* JADX INFO: renamed from: J */
    public boolean f210523J;

    /* JADX INFO: renamed from: J0 */
    public View.OnLongClickListener f210524J0;

    /* JADX INFO: renamed from: K */
    public boolean f210525K;

    /* JADX INFO: renamed from: K0 */
    public Handler f210526K0;

    /* JADX INFO: renamed from: L */
    public boolean f210527L;

    /* JADX INFO: renamed from: L0 */
    public Paint f210528L0;

    /* JADX INFO: renamed from: M */
    public int f210529M;

    /* JADX INFO: renamed from: M0 */
    public Paint f210530M0;

    /* JADX INFO: renamed from: N */
    public GestureDetector f210531N;

    /* JADX INFO: renamed from: N0 */
    public Paint f210532N0;

    /* JADX INFO: renamed from: O */
    public akm f210533O;

    /* JADX INFO: renamed from: O0 */
    public C22719j f210534O0;

    /* JADX INFO: renamed from: P */
    public final Object f210535P;

    /* JADX INFO: renamed from: P0 */
    public Matrix f210536P0;

    /* JADX INFO: renamed from: Q */
    public kid<? extends rhm> f210537Q;

    /* JADX INFO: renamed from: Q0 */
    public RectF f210538Q0;

    /* JADX INFO: renamed from: R */
    public kid<? extends akm> f210539R;

    /* JADX INFO: renamed from: R0 */
    public float[] f210540R0;

    /* JADX INFO: renamed from: S */
    public PointF f210541S;

    /* JADX INFO: renamed from: S0 */
    public float[] f210542S0;

    /* JADX INFO: renamed from: T */
    public float f210543T;

    /* JADX INFO: renamed from: T0 */
    public float f210544T0;

    /* JADX INFO: renamed from: U */
    public final float f210545U;

    /* JADX INFO: renamed from: V */
    public float f210546V;

    /* JADX INFO: renamed from: W */
    public boolean f210547W;

    /* JADX INFO: renamed from: a */
    public Bitmap f210548a;

    /* JADX INFO: renamed from: b */
    public boolean f210549b;

    /* JADX INFO: renamed from: c */
    public boolean f210550c;

    /* JADX INFO: renamed from: d */
    public Uri f210551d;

    /* JADX INFO: renamed from: e */
    public int f210552e;

    /* JADX INFO: renamed from: f */
    public Map<Integer, List<C22720k>> f210553f;

    /* JADX INFO: renamed from: g */
    public boolean f210554g;

    /* JADX INFO: renamed from: h */
    public int f210555h;

    /* JADX INFO: renamed from: i */
    public float f210556i;

    /* JADX INFO: renamed from: j */
    public float f210557j;

    /* JADX INFO: renamed from: k */
    public int f210558k;

    /* JADX INFO: renamed from: k0 */
    public PointF f210559k0;

    /* JADX INFO: renamed from: l */
    public int f210560l;

    /* JADX INFO: renamed from: m */
    public int f210561m;

    /* JADX INFO: renamed from: n */
    public int f210562n;

    /* JADX INFO: renamed from: o */
    public int f210563o;

    /* JADX INFO: renamed from: p */
    public boolean f210564p;

    /* JADX INFO: renamed from: p0 */
    public PointF f210565p0;

    /* JADX INFO: renamed from: q */
    public boolean f210566q;

    /* JADX INFO: renamed from: r */
    public boolean f210567r;

    /* JADX INFO: renamed from: s */
    public boolean f210568s;

    /* JADX INFO: renamed from: t */
    public float f210569t;

    /* JADX INFO: renamed from: u */
    public int f210570u;

    /* JADX INFO: renamed from: v */
    public int f210571v;

    /* JADX INFO: renamed from: w */
    public float f210572w;

    /* JADX INFO: renamed from: x */
    public float f210573x;

    /* JADX INFO: renamed from: y */
    public PointF f210574y;

    /* JADX INFO: renamed from: z */
    public PointF f210575z;

    /* JADX INFO: renamed from: v.fresco.subscaleview.SubsamplingScaleImageView$a */
    public class C22710a implements Handler.Callback {
        public C22710a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1 && SubsamplingScaleImageView.this.f210524J0 != null) {
                SubsamplingScaleImageView.this.f210529M = 0;
                SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
                SubsamplingScaleImageView.super.setOnLongClickListener(subsamplingScaleImageView.f210524J0);
                SubsamplingScaleImageView.this.performLongClick();
                SubsamplingScaleImageView.super.setOnLongClickListener(null);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: v.fresco.subscaleview.SubsamplingScaleImageView$b */
    public class C22711b extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f210577a;

        public C22711b(Context context) {
            this.f210577a = context;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (!SubsamplingScaleImageView.this.f210567r || !SubsamplingScaleImageView.this.f210518G0 || SubsamplingScaleImageView.this.f210574y == null) {
                return super.onDoubleTapEvent(motionEvent);
            }
            SubsamplingScaleImageView.this.setGestureDetector(this.f210577a);
            boolean z = SubsamplingScaleImageView.this.f210568s;
            SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
            if (!z) {
                subsamplingScaleImageView.m224711V(subsamplingScaleImageView.m224702N0(new PointF(motionEvent.getX(), motionEvent.getY())), new PointF(motionEvent.getX(), motionEvent.getY()));
                return true;
            }
            subsamplingScaleImageView.f210541S = new PointF(motionEvent.getX(), motionEvent.getY());
            SubsamplingScaleImageView.this.f210575z = new PointF(SubsamplingScaleImageView.this.f210574y.x, SubsamplingScaleImageView.this.f210574y.y);
            SubsamplingScaleImageView subsamplingScaleImageView2 = SubsamplingScaleImageView.this;
            subsamplingScaleImageView2.f210573x = subsamplingScaleImageView2.f210572w;
            SubsamplingScaleImageView.this.f210527L = true;
            SubsamplingScaleImageView.this.f210523J = true;
            SubsamplingScaleImageView.this.f210546V = -1.0f;
            SubsamplingScaleImageView subsamplingScaleImageView3 = SubsamplingScaleImageView.this;
            subsamplingScaleImageView3.f210565p0 = subsamplingScaleImageView3.m224702N0(subsamplingScaleImageView3.f210541S);
            SubsamplingScaleImageView.this.f210514E0 = new PointF(motionEvent.getX(), motionEvent.getY());
            SubsamplingScaleImageView.this.f210559k0 = new PointF(SubsamplingScaleImageView.this.f210565p0.x, SubsamplingScaleImageView.this.f210565p0.y);
            SubsamplingScaleImageView.this.f210547W = false;
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!SubsamplingScaleImageView.this.f210566q || !SubsamplingScaleImageView.this.f210518G0 || SubsamplingScaleImageView.this.f210574y == null || motionEvent == null || motionEvent2 == null || ((Math.abs(motionEvent.getX() - motionEvent2.getX()) <= 50.0f && Math.abs(motionEvent.getY() - motionEvent2.getY()) <= 50.0f) || ((Math.abs(f) <= 500.0f && Math.abs(f2) <= 500.0f) || SubsamplingScaleImageView.this.f210523J))) {
                return super.onFling(motionEvent, motionEvent2, f, f2);
            }
            PointF pointF = new PointF(SubsamplingScaleImageView.this.f210574y.x + (f * 0.25f), SubsamplingScaleImageView.this.f210574y.y + (f2 * 0.25f));
            new C22713d(new PointF(((SubsamplingScaleImageView.this.getWidth() / 2) - pointF.x) / SubsamplingScaleImageView.this.f210572w, ((SubsamplingScaleImageView.this.getHeight() / 2) - pointF.y) / SubsamplingScaleImageView.this.f210572w)).m224772e(1).m224775h(false).m224774g(3).m224770c();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            SubsamplingScaleImageView.this.performClick();
            return true;
        }
    }

    /* JADX INFO: renamed from: v.fresco.subscaleview.SubsamplingScaleImageView$c */
    public static class C22712c {

        /* JADX INFO: renamed from: a */
        public float f210579a;

        /* JADX INFO: renamed from: b */
        public float f210580b;

        /* JADX INFO: renamed from: c */
        public PointF f210581c;

        /* JADX INFO: renamed from: d */
        public PointF f210582d;

        /* JADX INFO: renamed from: e */
        public PointF f210583e;

        /* JADX INFO: renamed from: f */
        public PointF f210584f;

        /* JADX INFO: renamed from: g */
        public PointF f210585g;

        /* JADX INFO: renamed from: h */
        public long f210586h;

        /* JADX INFO: renamed from: i */
        public boolean f210587i;

        /* JADX INFO: renamed from: j */
        public int f210588j;

        /* JADX INFO: renamed from: k */
        public int f210589k;

        /* JADX INFO: renamed from: l */
        public long f210590l;

        public C22712c() {
            this.f210586h = 500L;
            this.f210587i = true;
            this.f210588j = 2;
            this.f210589k = 1;
            this.f210590l = System.currentTimeMillis();
        }

        /* JADX INFO: renamed from: d */
        public static /* bridge */ /* synthetic */ InterfaceC22716g m224745d(C22712c c22712c) {
            c22712c.getClass();
            return null;
        }
    }

    /* JADX INFO: renamed from: v.fresco.subscaleview.SubsamplingScaleImageView$e */
    public static class AsyncTaskC22714e extends AsyncTask<Void, Void, Integer> {

        /* JADX INFO: renamed from: a */
        public final WeakReference<SubsamplingScaleImageView> f210600a;

        /* JADX INFO: renamed from: b */
        public final WeakReference<Context> f210601b;

        /* JADX INFO: renamed from: c */
        public final WeakReference<kid<? extends rhm>> f210602c;

        /* JADX INFO: renamed from: d */
        public final Uri f210603d;

        /* JADX INFO: renamed from: e */
        public final boolean f210604e;

        /* JADX INFO: renamed from: f */
        public Bitmap f210605f;

        /* JADX INFO: renamed from: g */
        public Exception f210606g;

        public AsyncTaskC22714e(SubsamplingScaleImageView subsamplingScaleImageView, Context context, kid<? extends rhm> kidVar, Uri uri, boolean z) {
            this.f210600a = new WeakReference<>(subsamplingScaleImageView);
            this.f210601b = new WeakReference<>(context);
            this.f210602c = new WeakReference<>(kidVar);
            this.f210603d = uri;
            this.f210604e = z;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(Void... voidArr) {
            try {
                String string = this.f210603d.toString();
                Context context = this.f210601b.get();
                kid<? extends rhm> kidVar = this.f210602c.get();
                SubsamplingScaleImageView subsamplingScaleImageView = this.f210600a.get();
                if (context == null || kidVar == null || subsamplingScaleImageView == null) {
                    return null;
                }
                subsamplingScaleImageView.m224709T("BitmapLoadTask.doInBackground", new Object[0]);
                this.f210605f = kidVar.mo149869a().mo151074a(context, this.f210603d);
                return Integer.valueOf(subsamplingScaleImageView.m224719d0(context, string));
            } catch (Exception e) {
                CrashHelper.m82479c(e);
                this.f210606g = e;
                return null;
            } catch (OutOfMemoryError e2) {
                CrashHelper.m82479c(e2);
                this.f210606g = new RuntimeException(e2);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            SubsamplingScaleImageView subsamplingScaleImageView = this.f210600a.get();
            if (subsamplingScaleImageView != null) {
                Bitmap bitmap = this.f210605f;
                if (bitmap != null && num != null) {
                    if (this.f210604e) {
                        subsamplingScaleImageView.m224730o0(bitmap);
                        return;
                    } else {
                        subsamplingScaleImageView.m224729n0(bitmap, num.intValue(), false);
                        return;
                    }
                }
                if (this.f210606g == null || subsamplingScaleImageView.f210522I0 == null) {
                    return;
                }
                if (this.f210604e) {
                    subsamplingScaleImageView.f210522I0.mo224779c(this.f210606g);
                } else {
                    subsamplingScaleImageView.f210522I0.mo80288f(this.f210606g);
                }
            }
        }
    }

    /* JADX INFO: renamed from: v.fresco.subscaleview.SubsamplingScaleImageView$f */
    public static class C22715f implements InterfaceC22717h {
        @Override // p151v.fresco.subscaleview.SubsamplingScaleImageView.InterfaceC22717h
        /* JADX INFO: renamed from: a */
        public void mo224778a() {
        }

        @Override // p151v.fresco.subscaleview.SubsamplingScaleImageView.InterfaceC22717h
        /* JADX INFO: renamed from: b */
        public void mo80287b() {
        }

        @Override // p151v.fresco.subscaleview.SubsamplingScaleImageView.InterfaceC22717h
        /* JADX INFO: renamed from: c */
        public void mo224779c(Exception exc) {
        }

        @Override // p151v.fresco.subscaleview.SubsamplingScaleImageView.InterfaceC22717h
        /* JADX INFO: renamed from: d */
        public void mo224780d(Exception exc) {
        }

        @Override // p151v.fresco.subscaleview.SubsamplingScaleImageView.InterfaceC22717h
        /* JADX INFO: renamed from: e */
        public void mo224781e() {
        }

        @Override // p151v.fresco.subscaleview.SubsamplingScaleImageView.InterfaceC22717h
        /* JADX INFO: renamed from: f */
        public void mo80288f(Exception exc) {
        }
    }

    /* JADX INFO: renamed from: v.fresco.subscaleview.SubsamplingScaleImageView$g */
    public interface InterfaceC22716g {
    }

    /* JADX INFO: renamed from: v.fresco.subscaleview.SubsamplingScaleImageView$h */
    public interface InterfaceC22717h {
        /* JADX INFO: renamed from: a */
        void mo224778a();

        /* JADX INFO: renamed from: b */
        void mo80287b();

        /* JADX INFO: renamed from: c */
        void mo224779c(Exception exc);

        /* JADX INFO: renamed from: d */
        void mo224780d(Exception exc);

        /* JADX INFO: renamed from: e */
        void mo224781e();

        /* JADX INFO: renamed from: f */
        void mo80288f(Exception exc);
    }

    /* JADX INFO: renamed from: v.fresco.subscaleview.SubsamplingScaleImageView$i */
    public interface InterfaceC22718i {
    }

    /* JADX INFO: renamed from: v.fresco.subscaleview.SubsamplingScaleImageView$j */
    public static class C22719j {

        /* JADX INFO: renamed from: a */
        public float f210607a;

        /* JADX INFO: renamed from: b */
        public PointF f210608b;

        public C22719j(float f, PointF pointF) {
            this.f210607a = f;
            this.f210608b = pointF;
        }
    }

    /* JADX INFO: renamed from: v.fresco.subscaleview.SubsamplingScaleImageView$k */
    public static class C22720k {

        /* JADX INFO: renamed from: a */
        public Rect f210609a;

        /* JADX INFO: renamed from: b */
        public int f210610b;

        /* JADX INFO: renamed from: c */
        public Bitmap f210611c;

        /* JADX INFO: renamed from: d */
        public boolean f210612d;

        /* JADX INFO: renamed from: e */
        public boolean f210613e;

        /* JADX INFO: renamed from: f */
        public Rect f210614f;

        /* JADX INFO: renamed from: g */
        public Rect f210615g;

        public C22720k() {
        }
    }

    /* JADX INFO: renamed from: v.fresco.subscaleview.SubsamplingScaleImageView$l */
    public static class AsyncTaskC22721l extends AsyncTask<Void, Void, Bitmap> {

        /* JADX INFO: renamed from: a */
        public final WeakReference<SubsamplingScaleImageView> f210616a;

        /* JADX INFO: renamed from: b */
        public final WeakReference<akm> f210617b;

        /* JADX INFO: renamed from: c */
        public final WeakReference<C22720k> f210618c;

        /* JADX INFO: renamed from: d */
        public Exception f210619d;

        public AsyncTaskC22721l(SubsamplingScaleImageView subsamplingScaleImageView, akm akmVar, C22720k c22720k) {
            this.f210616a = new WeakReference<>(subsamplingScaleImageView);
            this.f210617b = new WeakReference<>(akmVar);
            this.f210618c = new WeakReference<>(c22720k);
            c22720k.f210612d = true;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap doInBackground(Void... voidArr) {
            Bitmap bitmapMo98576c;
            try {
                SubsamplingScaleImageView subsamplingScaleImageView = this.f210616a.get();
                akm akmVar = this.f210617b.get();
                C22720k c22720k = this.f210618c.get();
                if (akmVar == null || c22720k == null || subsamplingScaleImageView == null || !akmVar.mo98575b() || !c22720k.f210613e) {
                    if (c22720k == null) {
                        return null;
                    }
                    c22720k.f210612d = false;
                    return null;
                }
                subsamplingScaleImageView.m224709T("TileLoadTask.doInBackground, tile.sRect=%s, tile.sampleSize=%d", c22720k.f210609a, Integer.valueOf(c22720k.f210610b));
                synchronized (subsamplingScaleImageView.f210535P) {
                    try {
                        subsamplingScaleImageView.m224716a0(c22720k.f210609a, c22720k.f210615g);
                        if (subsamplingScaleImageView.f210519H != null) {
                            c22720k.f210615g.offset(subsamplingScaleImageView.f210519H.left, subsamplingScaleImageView.f210519H.top);
                        }
                        bitmapMo98576c = akmVar.mo98576c(c22720k.f210615g, c22720k.f210610b);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return bitmapMo98576c;
            } catch (Exception e) {
                CrashHelper.m82479c(e);
                this.f210619d = e;
                return null;
            } catch (OutOfMemoryError e2) {
                CrashHelper.m82479c(e2);
                this.f210619d = new RuntimeException(e2);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Bitmap bitmap) {
            SubsamplingScaleImageView subsamplingScaleImageView = this.f210616a.get();
            C22720k c22720k = this.f210618c.get();
            if (subsamplingScaleImageView == null || c22720k == null) {
                return;
            }
            if (bitmap != null) {
                c22720k.f210611c = bitmap;
                c22720k.f210612d = false;
                subsamplingScaleImageView.m224732q0();
            } else {
                if (this.f210619d == null || subsamplingScaleImageView.f210522I0 == null) {
                    return;
                }
                subsamplingScaleImageView.f210522I0.mo224780d(this.f210619d);
            }
        }
    }

    /* JADX INFO: renamed from: v.fresco.subscaleview.SubsamplingScaleImageView$m */
    public static class AsyncTaskC22722m extends AsyncTask<Void, Void, int[]> {

        /* JADX INFO: renamed from: a */
        public final WeakReference<SubsamplingScaleImageView> f210620a;

        /* JADX INFO: renamed from: b */
        public final WeakReference<Context> f210621b;

        /* JADX INFO: renamed from: c */
        public final WeakReference<kid<? extends akm>> f210622c;

        /* JADX INFO: renamed from: d */
        public final Uri f210623d;

        /* JADX INFO: renamed from: e */
        public akm f210624e;

        /* JADX INFO: renamed from: f */
        public Exception f210625f;

        public AsyncTaskC22722m(SubsamplingScaleImageView subsamplingScaleImageView, Context context, kid<? extends akm> kidVar, Uri uri) {
            this.f210620a = new WeakReference<>(subsamplingScaleImageView);
            this.f210621b = new WeakReference<>(context);
            this.f210622c = new WeakReference<>(kidVar);
            this.f210623d = uri;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int[] doInBackground(Void... voidArr) {
            try {
                String string = this.f210623d.toString();
                Context context = this.f210621b.get();
                kid<? extends akm> kidVar = this.f210622c.get();
                SubsamplingScaleImageView subsamplingScaleImageView = this.f210620a.get();
                if (context == null || kidVar == null || subsamplingScaleImageView == null) {
                    return null;
                }
                subsamplingScaleImageView.m224709T("TilesInitTask.doInBackground", new Object[0]);
                akm akmVarMo149869a = kidVar.mo149869a();
                this.f210624e = akmVarMo149869a;
                Point pointMo98574a = akmVarMo149869a.mo98574a(context, this.f210623d);
                int iWidth = pointMo98574a.x;
                int iHeight = pointMo98574a.y;
                int iM224719d0 = subsamplingScaleImageView.m224719d0(context, string);
                if (subsamplingScaleImageView.f210519H != null) {
                    iWidth = subsamplingScaleImageView.f210519H.width();
                    iHeight = subsamplingScaleImageView.f210519H.height();
                }
                return new int[]{iWidth, iHeight, iM224719d0};
            } catch (Exception e) {
                CrashHelper.m82479c(e);
                this.f210625f = e;
                return null;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(int[] iArr) {
            SubsamplingScaleImageView subsamplingScaleImageView = this.f210620a.get();
            if (subsamplingScaleImageView != null) {
                akm akmVar = this.f210624e;
                if (akmVar != null && iArr != null && iArr.length == 3) {
                    subsamplingScaleImageView.m224733r0(akmVar, iArr[0], iArr[1], iArr[2]);
                } else {
                    if (this.f210625f == null || subsamplingScaleImageView.f210522I0 == null) {
                        return;
                    }
                    subsamplingScaleImageView.f210522I0.mo80288f(this.f210625f);
                }
            }
        }
    }

    public SubsamplingScaleImageView(Context context, AttributeSet attributeSet) {
        int resourceId;
        String string;
        super(context, attributeSet);
        this.f210555h = 0;
        this.f210556i = 2.0f;
        this.f210557j = m224727l0();
        this.f210558k = -1;
        this.f210560l = 1;
        this.f210561m = 1;
        int i = f210508Z0;
        this.f210562n = i;
        this.f210563o = i;
        this.f210566q = true;
        this.f210567r = true;
        this.f210568s = true;
        this.f210569t = 1.0f;
        this.f210570u = 1;
        this.f210571v = 500;
        this.f210535P = new Object();
        this.f210537Q = new ko5(krf0.class);
        this.f210539R = new ko5(lrf0.class);
        this.f210540R0 = new float[8];
        this.f210542S0 = new float[8];
        this.f210544T0 = getResources().getDisplayMetrics().density;
        setMinimumDpi(160);
        setDoubleTapZoomDpi(160);
        setGestureDetector(context);
        this.f210526K0 = new Handler(new C22710a());
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, hhc0.f109684Y1);
            if (typedArrayObtainStyledAttributes.hasValue(hhc0.f109690Z1) && (string = typedArrayObtainStyledAttributes.getString(hhc0.f109690Z1)) != null && string.length() > 0) {
                setImage(qkm.m176953a(string).m176965l());
            }
            if (typedArrayObtainStyledAttributes.hasValue(hhc0.f109711c2) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(hhc0.f109711c2, 0)) > 0) {
                setImage(qkm.m176954j(resourceId).m176965l());
            }
            if (typedArrayObtainStyledAttributes.hasValue(hhc0.f109697a2)) {
                setPanEnabled(typedArrayObtainStyledAttributes.getBoolean(hhc0.f109697a2, true));
            }
            if (typedArrayObtainStyledAttributes.hasValue(hhc0.f109725e2)) {
                setZoomEnabled(typedArrayObtainStyledAttributes.getBoolean(hhc0.f109725e2, true));
            }
            if (typedArrayObtainStyledAttributes.hasValue(hhc0.f109704b2)) {
                setQuickScaleEnabled(typedArrayObtainStyledAttributes.getBoolean(hhc0.f109704b2, true));
            }
            if (typedArrayObtainStyledAttributes.hasValue(hhc0.f109718d2)) {
                setTileBackgroundColor(typedArrayObtainStyledAttributes.getColor(hhc0.f109718d2, Color.argb(0, 0, 0, 0)));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f210545U = TypedValue.applyDimension(1, 20.0f, context.getResources().getDisplayMetrics());
    }

    @AnyThread
    private int getRequiredRotation() {
        int i = this.f210555h;
        return i == -1 ? this.f210517G : i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGestureDetector(Context context) {
        this.f210531N = new GestureDetector(context, new C22711b(context));
    }

    /* JADX INFO: renamed from: A0 */
    public final void m224689A0(float f, PointF pointF, int i) {
    }

    /* JADX INFO: renamed from: B0 */
    public final void m224690B0(qkm qkmVar, qkm qkmVar2, ImageViewState imageViewState) {
        if (qkmVar == null) {
            mnd0.m159157a("imageSource must not be null");
            return;
        }
        m224738w0(true);
        if (imageViewState != null) {
            m224739x0(imageViewState);
        }
        if (qkmVar2 != null) {
            if (qkmVar.m176956b() != null) {
                wg3.m206174a("Preview image cannot be used when a bitmap is provided for the main image");
                return;
            }
            if (qkmVar.m176960f() <= 0 || qkmVar.m176958d() <= 0) {
                wg3.m206174a("Preview image cannot be used unless dimensions are provided for the main image");
                return;
            }
            this.f210513E = qkmVar.m176960f();
            this.f210515F = qkmVar.m176958d();
            this.f210521I = qkmVar2.m176959e();
            if (qkmVar2.m176956b() != null) {
                this.f210550c = qkmVar2.m176963i();
                m224730o0(qkmVar2.m176956b());
            } else {
                Uri uriM176962h = qkmVar2.m176962h();
                if (uriM176962h == null && qkmVar2.m176957c() != null) {
                    uriM176962h = Uri.parse("android.resource://" + getContext().getPackageName() + "/" + qkmVar2.m176957c());
                }
                m224715Z(new AsyncTaskC22714e(this, getContext(), this.f210537Q, uriM176962h, true));
            }
        }
        if (qkmVar.m176956b() != null && qkmVar.m176959e() != null) {
            m224729n0(Bitmap.createBitmap(qkmVar.m176956b(), qkmVar.m176959e().left, qkmVar.m176959e().top, qkmVar.m176959e().width(), qkmVar.m176959e().height()), 0, false);
            return;
        }
        if (qkmVar.m176956b() != null) {
            m224729n0(qkmVar.m176956b(), 0, qkmVar.m176963i());
            return;
        }
        this.f210519H = qkmVar.m176959e();
        Uri uriM176962h2 = qkmVar.m176962h();
        this.f210551d = uriM176962h2;
        if (uriM176962h2 == null && qkmVar.m176957c() != null) {
            this.f210551d = Uri.parse("android.resource://" + getContext().getPackageName() + "/" + qkmVar.m176957c());
        }
        if (qkmVar.m176961g() || this.f210519H != null) {
            m224715Z(new AsyncTaskC22722m(this, getContext(), this.f210539R, this.f210551d));
        } else {
            m224715Z(new AsyncTaskC22714e(this, getContext(), this.f210537Q, this.f210551d, false));
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final void m224691C0(float[] fArr, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
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
    public final void m224692D0(float f, PointF pointF) {
        this.f210516F0 = null;
        this.f210510B = Float.valueOf(f);
        this.f210511C = pointF;
        this.f210512D = pointF;
        invalidate();
    }

    /* JADX INFO: renamed from: E0 */
    public final PointF m224693E0(float f, float f2, PointF pointF) {
        if (this.f210574y == null) {
            return null;
        }
        pointF.set(m224696H0(f), m224697I0(f2));
        return pointF;
    }

    /* JADX INFO: renamed from: F0 */
    public final PointF m224694F0(PointF pointF) {
        return m224693E0(pointF.x, pointF.y, new PointF());
    }

    /* JADX INFO: renamed from: G0 */
    public final Rect m224695G0(Rect rect, Rect rect2) {
        rect2.set((int) m224696H0(rect.left), (int) m224697I0(rect.top), (int) m224696H0(rect.right), (int) m224697I0(rect.bottom));
        return rect2;
    }

    /* JADX INFO: renamed from: H0 */
    public final float m224696H0(float f) {
        PointF pointF = this.f210574y;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f * this.f210572w) + pointF.x;
    }

    /* JADX INFO: renamed from: I0 */
    public final float m224697I0(float f) {
        PointF pointF = this.f210574y;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f * this.f210572w) + pointF.y;
    }

    /* JADX INFO: renamed from: J0 */
    public final boolean m224698J0(C22720k c22720k) {
        return m224703O0(0.0f) <= ((float) c22720k.f210609a.right) && ((float) c22720k.f210609a.left) <= m224703O0((float) getWidth()) && m224705P0(0.0f) <= ((float) c22720k.f210609a.bottom) && ((float) c22720k.f210609a.top) <= m224705P0((float) getHeight());
    }

    /* JADX INFO: renamed from: K0 */
    public final PointF m224699K0(float f, float f2, float f3) {
        int paddingLeft = getPaddingLeft() + (((getWidth() - getPaddingRight()) - getPaddingLeft()) / 2);
        int paddingTop = getPaddingTop() + (((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
        if (this.f210534O0 == null) {
            this.f210534O0 = new C22719j(0.0f, new PointF(0.0f, 0.0f));
        }
        this.f210534O0.f210607a = f3;
        this.f210534O0.f210608b.set(paddingLeft - (f * f3), paddingTop - (f2 * f3));
        m224718c0(true, this.f210534O0);
        return this.f210534O0.f210608b;
    }

    /* JADX INFO: renamed from: L0 */
    public final PointF m224700L0(float f, float f2) {
        return m224701M0(f, f2, new PointF());
    }

    /* JADX INFO: renamed from: M0 */
    public final PointF m224701M0(float f, float f2, PointF pointF) {
        if (this.f210574y == null) {
            return null;
        }
        pointF.set(m224703O0(f), m224705P0(f2));
        return pointF;
    }

    /* JADX INFO: renamed from: N0 */
    public final PointF m224702N0(PointF pointF) {
        return m224701M0(pointF.x, pointF.y, new PointF());
    }

    /* JADX INFO: renamed from: O0 */
    public final float m224703O0(float f) {
        PointF pointF = this.f210574y;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f - pointF.x) / this.f210572w;
    }

    /* JADX INFO: renamed from: P */
    public final int m224704P(float f) {
        int iRound;
        if (this.f210558k > 0) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            f *= this.f210558k / ((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f);
        }
        int iM224741z0 = (int) (m224741z0() * f);
        int iM224740y0 = (int) (m224740y0() * f);
        if (iM224741z0 == 0 || iM224740y0 == 0) {
            return 32;
        }
        int i = 1;
        if (m224740y0() > iM224740y0 || m224741z0() > iM224741z0) {
            iRound = Math.round(m224740y0() / iM224740y0);
            int iRound2 = Math.round(m224741z0() / iM224741z0);
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
    public final float m224705P0(float f) {
        PointF pointF = this.f210574y;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f - pointF.y) / this.f210572w;
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m224706Q() {
        boolean zM224723h0 = m224723h0();
        if (!this.f210520H0 && zM224723h0) {
            m224735t0();
            this.f210520H0 = true;
            m224728m0();
            InterfaceC22717h interfaceC22717h = this.f210522I0;
            if (interfaceC22717h != null) {
                interfaceC22717h.mo80287b();
            }
        }
        return zM224723h0;
    }

    /* JADX INFO: renamed from: R */
    public final boolean m224707R() {
        boolean z = getWidth() > 0 && getHeight() > 0 && this.f210513E > 0 && this.f210515F > 0 && (this.f210548a != null || m224723h0());
        if (!this.f210518G0 && z) {
            m224735t0();
            this.f210518G0 = true;
            m224731p0();
            InterfaceC22717h interfaceC22717h = this.f210522I0;
            if (interfaceC22717h != null) {
                interfaceC22717h.mo224781e();
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: S */
    public final void m224708S() {
        if (this.f210528L0 == null) {
            Paint paint = new Paint();
            this.f210528L0 = paint;
            paint.setAntiAlias(true);
            this.f210528L0.setFilterBitmap(true);
            this.f210528L0.setDither(true);
        }
        if (this.f210530M0 == null && this.f210554g) {
            Paint paint2 = new Paint();
            this.f210530M0 = paint2;
            paint2.setTextSize(18.0f);
            this.f210530M0.setColor(-65281);
            this.f210530M0.setStyle(Paint.Style.STROKE);
        }
    }

    @AnyThread
    /* JADX INFO: renamed from: T */
    public final void m224709T(String str, Object... objArr) {
    }

    /* JADX INFO: renamed from: U */
    public final float m224710U(float f, float f2, float f3, float f4) {
        float f5 = f - f2;
        float f6 = f3 - f4;
        return (float) Math.sqrt((f5 * f5) + (f6 * f6));
    }

    /* JADX INFO: renamed from: V */
    public final void m224711V(PointF pointF, PointF pointF2) {
        SubsamplingScaleImageView subsamplingScaleImageView;
        if (!this.f210566q) {
            PointF pointF3 = this.f210512D;
            if (pointF3 != null) {
                pointF.x = pointF3.x;
                pointF.y = pointF3.y;
            } else {
                pointF.x = m224741z0() / 2;
                pointF.y = m224740y0() / 2;
            }
        }
        float fMin = Math.min(this.f210556i, this.f210569t);
        boolean z = ((double) this.f210572w) <= ((double) fMin) * 0.9d;
        if (!z) {
            fMin = m224727l0();
        }
        float f = fMin;
        int i = this.f210570u;
        if (i != 3) {
            if (i == 2 || !z || !this.f210566q) {
                subsamplingScaleImageView = this;
                new C22713d(f, pointF).m224773f(false).m224771d(subsamplingScaleImageView.f210571v).m224774g(4).m224770c();
            } else if (i == 1) {
                subsamplingScaleImageView = this;
                new C22713d(f, pointF, pointF2).m224773f(false).m224771d(subsamplingScaleImageView.f210571v).m224774g(4).m224770c();
            }
            subsamplingScaleImageView.invalidate();
        }
        m224692D0(f, pointF);
        subsamplingScaleImageView = this;
        subsamplingScaleImageView.invalidate();
    }

    /* JADX INFO: renamed from: W */
    public final float m224712W(int i, long j, float f, float f2, long j2) {
        if (i == 1) {
            return m224714Y(j, f, f2, j2);
        }
        if (i == 2) {
            return m224713X(j, f, f2, j2);
        }
        o4c.m165980a("Unexpected easing type: ", i);
        return 0.0f;
    }

    /* JADX INFO: renamed from: X */
    public final float m224713X(long j, float f, float f2, long j2) {
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
    public final float m224714Y(long j, float f, float f2, long j2) {
        float f3 = j / j2;
        return ((-f2) * f3 * (f3 - 2.0f)) + f;
    }

    /* JADX INFO: renamed from: Z */
    public final void m224715Z(AsyncTask<Void, Void, ?> asyncTask) {
        if (this.f210564p) {
            try {
                AsyncTask.class.getMethod("executeOnExecutor", Executor.class, Object[].class).invoke(asyncTask, (Executor) AsyncTask.class.getField("THREAD_POOL_EXECUTOR").get(null), null);
                return;
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
        }
        asyncTask.execute(new Void[0]);
    }

    @AnyThread
    /* JADX INFO: renamed from: a0 */
    public final void m224716a0(Rect rect, Rect rect2) {
        if (getRequiredRotation() == 0) {
            rect2.set(rect);
            return;
        }
        if (getRequiredRotation() == 90) {
            int i = rect.top;
            int i2 = this.f210515F;
            rect2.set(i, i2 - rect.right, rect.bottom, i2 - rect.left);
            return;
        }
        int requiredRotation = getRequiredRotation();
        int i3 = this.f210513E;
        if (requiredRotation != 180) {
            rect2.set(i3 - rect.bottom, rect.left, i3 - rect.top, rect.right);
            return;
        }
        int i4 = i3 - rect.right;
        int i5 = this.f210515F;
        rect2.set(i4, i5 - rect.bottom, i3 - rect.left, i5 - rect.top);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m224717b0(boolean z) {
        boolean z2;
        float f = 0.0f;
        if (this.f210574y == null) {
            this.f210574y = new PointF(0.0f, 0.0f);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f210534O0 == null) {
            this.f210534O0 = new C22719j(f, new PointF(0.0f, 0.0f));
        }
        this.f210534O0.f210607a = this.f210572w;
        this.f210534O0.f210608b.set(this.f210574y);
        m224718c0(z, this.f210534O0);
        this.f210572w = this.f210534O0.f210607a;
        this.f210574y.set(this.f210534O0.f210608b);
        if (z2) {
            this.f210574y.set(m224699K0(m224741z0() / 2, m224740y0() / 2, this.f210572w));
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m224718c0(boolean z, C22719j c22719j) {
        float fMax;
        int iMax;
        float fMax2;
        if (this.f210560l == 2 && m224724i0()) {
            z = false;
        }
        PointF pointF = c22719j.f210608b;
        float fM224726k0 = m224726k0(c22719j.f210607a);
        float fM224741z0 = m224741z0() * fM224726k0;
        float fM224740y0 = m224740y0() * fM224726k0;
        if (this.f210560l == 3 && m224724i0()) {
            pointF.x = Math.max(pointF.x, (getWidth() / 2) - fM224741z0);
            pointF.y = Math.max(pointF.y, (getHeight() / 2) - fM224740y0);
        } else if (z) {
            pointF.x = Math.max(pointF.x, getWidth() - fM224741z0);
            pointF.y = Math.max(pointF.y, getHeight() - fM224740y0);
        } else {
            pointF.x = Math.max(pointF.x, -fM224741z0);
            pointF.y = Math.max(pointF.y, -fM224740y0);
        }
        float paddingLeft = (getPaddingLeft() > 0 || getPaddingRight() > 0) ? getPaddingLeft() / (getPaddingLeft() + getPaddingRight()) : 0.5f;
        float paddingTop = (getPaddingTop() > 0 || getPaddingBottom() > 0) ? getPaddingTop() / (getPaddingTop() + getPaddingBottom()) : 0.5f;
        if (this.f210560l != 3 || !m224724i0()) {
            if (z) {
                fMax = Math.max(0.0f, (getWidth() - fM224741z0) * paddingLeft);
                fMax2 = Math.max(0.0f, (getHeight() - fM224740y0) * paddingTop);
            } else {
                fMax = Math.max(0, getWidth());
                iMax = Math.max(0, getHeight());
            }
            pointF.x = Math.min(pointF.x, fMax);
            pointF.y = Math.min(pointF.y, fMax2);
            c22719j.f210607a = fM224726k0;
        }
        fMax = Math.max(0, getWidth() / 2);
        iMax = Math.max(0, getHeight() / 2);
        fMax2 = iMax;
        pointF.x = Math.min(pointF.x, fMax);
        pointF.y = Math.min(pointF.y, fMax2);
        c22719j.f210607a = fM224726k0;
    }

    @AnyThread
    /* JADX INFO: renamed from: d0 */
    public final int m224719d0(Context context, String str) {
        int i = 0;
        if (str.startsWith("content")) {
            Cursor cursorQuery = null;
            try {
                try {
                    cursorQuery = context.getContentResolver().query(Uri.parse(str), new String[]{Constants.KEY_ORIENTATION}, null, null, null);
                    if (cursorQuery != null && cursorQuery.moveToFirst()) {
                        int i2 = cursorQuery.getInt(0);
                        if (f210503U0.contains(Integer.valueOf(i2)) && i2 != -1) {
                            i = i2;
                        }
                    }
                } catch (Exception e) {
                    CrashHelper.m82479c(e);
                }
            } finally {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        } else if (str.startsWith("file:///") && !str.startsWith("file:///android_asset/")) {
            try {
                int attributeInt = new ExifInterface(str.substring(7)).getAttributeInt(p7f.TAG_ORIENTATION, 1);
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
                CrashHelper.m82479c(e2);
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: e0 */
    public final Point m224720e0(Canvas canvas) {
        int iIntValue;
        int iIntValue2 = 2048;
        try {
            iIntValue = ((Integer) Canvas.class.getMethod("getMaximumBitmapWidth", null).invoke(canvas, null)).intValue();
            try {
                iIntValue2 = ((Integer) Canvas.class.getMethod("getMaximumBitmapHeight", null).invoke(canvas, null)).intValue();
            } catch (Exception e) {
                e = e;
                CrashHelper.m82479c(e);
            }
        } catch (Exception e2) {
            e = e2;
            iIntValue = 2048;
        }
        return new Point(Math.min(iIntValue, this.f210562n), Math.min(iIntValue2, this.f210563o));
    }

    /* JADX INFO: renamed from: f0 */
    public final synchronized void m224721f0(Point point) throws Throwable {
        Throwable th;
        SubsamplingScaleImageView subsamplingScaleImageView;
        try {
            try {
                m224709T("initialiseBaseLayer maxTileDimensions=%dx%d", Integer.valueOf(point.x), Integer.valueOf(point.y));
                C22719j c22719j = new C22719j(0.0f, new PointF(0.0f, 0.0f));
                this.f210534O0 = c22719j;
                m224718c0(true, c22719j);
                int iM224704P = m224704P(this.f210534O0.f210607a);
                this.f210552e = iM224704P;
                if (iM224704P > 1) {
                    try {
                        this.f210552e = iM224704P / 2;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                if (this.f210552e != 1 || this.f210519H != null || m224741z0() >= point.x || m224740y0() >= point.y) {
                    subsamplingScaleImageView = this;
                    subsamplingScaleImageView.m224722g0(point);
                    Iterator<C22720k> it = subsamplingScaleImageView.f210553f.get(Integer.valueOf(subsamplingScaleImageView.f210552e)).iterator();
                    while (it.hasNext()) {
                        subsamplingScaleImageView.m224715Z(new AsyncTaskC22721l(subsamplingScaleImageView, subsamplingScaleImageView.f210533O, it.next()));
                    }
                    subsamplingScaleImageView.m224736u0(true);
                } else {
                    this.f210533O.recycle();
                    this.f210533O = null;
                    subsamplingScaleImageView = this;
                    subsamplingScaleImageView.m224715Z(new AsyncTaskC22714e(subsamplingScaleImageView, getContext(), this.f210537Q, this.f210551d, false));
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
    public final void m224722g0(Point point) {
        m224709T("initialiseTileMap maxTileDimensions=%dx%d", Integer.valueOf(point.x), Integer.valueOf(point.y));
        this.f210553f = new LinkedHashMap();
        int i = this.f210552e;
        int i2 = 1;
        int i3 = 1;
        int i4 = 1;
        while (true) {
            int iM224741z0 = m224741z0() / i3;
            int iM224740y0 = m224740y0() / i4;
            int i5 = iM224741z0 / i;
            int i6 = iM224740y0 / i;
            while (true) {
                if (i5 + i3 + i2 <= point.x && (i5 <= ((double) getWidth()) * 1.25d || i >= this.f210552e)) {
                    break;
                }
                i3++;
                iM224741z0 = m224741z0() / i3;
                i5 = iM224741z0 / i;
            }
            while (true) {
                if (i6 + i4 + i2 <= point.y && (i6 <= ((double) getHeight()) * 1.25d || i >= this.f210552e)) {
                    break;
                }
                i4++;
                iM224740y0 = m224740y0() / i4;
                i6 = iM224740y0 / i;
            }
            ArrayList arrayList = new ArrayList(i3 * i4);
            int i7 = 0;
            while (i7 < i3) {
                int i8 = 0;
                while (i8 < i4) {
                    C22720k c22720k = new C22720k();
                    c22720k.f210610b = i;
                    c22720k.f210613e = i == this.f210552e ? i2 : 0;
                    c22720k.f210609a = new Rect(i7 * iM224741z0, i8 * iM224740y0, i7 == i3 + (-1) ? m224741z0() : (i7 + 1) * iM224741z0, i8 == i4 + (-1) ? m224740y0() : (i8 + 1) * iM224740y0);
                    c22720k.f210614f = new Rect(0, 0, 0, 0);
                    c22720k.f210615g = new Rect(c22720k.f210609a);
                    arrayList.add(c22720k);
                    i8++;
                    i2 = 1;
                }
                i7++;
                i2 = 1;
            }
            this.f210553f.put(Integer.valueOf(i), arrayList);
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
        return m224700L0(getWidth() / 2, getHeight() / 2);
    }

    public float getMaxScale() {
        return this.f210556i;
    }

    public final float getMinScale() {
        return m224727l0();
    }

    public final int getOrientation() {
        return this.f210555h;
    }

    public final int getSHeight() {
        return this.f210515F;
    }

    public final int getSWidth() {
        return this.f210513E;
    }

    public final float getScale() {
        return this.f210572w;
    }

    public final ImageViewState getState() {
        if (this.f210574y == null || this.f210513E <= 0 || this.f210515F <= 0) {
            return null;
        }
        return new ImageViewState(getScale(), getCenter(), getOrientation());
    }

    /* JADX INFO: renamed from: h0 */
    public final boolean m224723h0() {
        boolean z = true;
        if (this.f210548a != null && !this.f210549b) {
            return true;
        }
        Map<Integer, List<C22720k>> map = this.f210553f;
        if (map == null) {
            return false;
        }
        for (Map.Entry<Integer, List<C22720k>> entry : map.entrySet()) {
            if (entry.getKey().intValue() == this.f210552e) {
                for (C22720k c22720k : entry.getValue()) {
                    if (c22720k.f210612d || c22720k.f210611c == null) {
                        z = false;
                    }
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m224724i0() {
        return this.f210518G0;
    }

    /* JADX INFO: renamed from: j0 */
    public final PointF m224725j0(float f, float f2, float f3, PointF pointF) {
        PointF pointFM224699K0 = m224699K0(f, f2, f3);
        pointF.set(((getPaddingLeft() + (((getWidth() - getPaddingRight()) - getPaddingLeft()) / 2)) - pointFM224699K0.x) / f3, ((getPaddingTop() + (((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2)) - pointFM224699K0.y) / f3);
        return pointF;
    }

    /* JADX INFO: renamed from: k0 */
    public final float m224726k0(float f) {
        return Math.min(this.f210556i, Math.max(m224727l0(), f));
    }

    /* JADX INFO: renamed from: l0 */
    public final float m224727l0() {
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int i = this.f210561m;
        if (i == 2) {
            return Math.max((getWidth() - paddingLeft) / m224741z0(), (getHeight() - paddingBottom) / m224740y0());
        }
        if (i == 3) {
            float f = this.f210557j;
            if (f > 0.0f) {
                return f;
            }
        }
        return Math.min((getWidth() - paddingLeft) / m224741z0(), (getHeight() - paddingBottom) / m224740y0());
    }

    /* JADX INFO: renamed from: m0 */
    public void m224728m0() {
    }

    /* JADX INFO: renamed from: n0 */
    public final synchronized void m224729n0(Bitmap bitmap, int i, boolean z) {
        InterfaceC22717h interfaceC22717h;
        try {
            m224709T("onImageLoaded", new Object[0]);
            int i2 = this.f210513E;
            if (i2 > 0 && this.f210515F > 0 && (i2 != bitmap.getWidth() || this.f210515F != bitmap.getHeight())) {
                m224738w0(false);
            }
            Bitmap bitmap2 = this.f210548a;
            if (bitmap2 != null && !this.f210550c) {
                bitmap2.recycle();
            }
            if (this.f210548a != null && this.f210550c && (interfaceC22717h = this.f210522I0) != null) {
                interfaceC22717h.mo224778a();
            }
            this.f210549b = false;
            this.f210550c = z;
            this.f210548a = bitmap;
            this.f210513E = bitmap.getWidth();
            this.f210515F = bitmap.getHeight();
            this.f210517G = i;
            boolean zM224707R = m224707R();
            boolean zM224706Q = m224706Q();
            if (zM224707R || zM224706Q) {
                invalidate();
                requestLayout();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final synchronized void m224730o0(Bitmap bitmap) {
        try {
            m224709T("onPreviewLoaded", new Object[0]);
            if (this.f210548a == null && !this.f210520H0) {
                Rect rect = this.f210521I;
                if (rect != null) {
                    this.f210548a = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), this.f210521I.height());
                } else {
                    this.f210548a = bitmap;
                }
                this.f210549b = true;
                if (m224707R()) {
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
        m224708S();
        if (this.f210513E == 0 || this.f210515F == 0 || getWidth() == 0 || getHeight() == 0) {
            return;
        }
        if (this.f210553f == null && this.f210533O != null) {
            m224721f0(m224720e0(canvas));
        }
        if (m224707R()) {
            m224735t0();
            if (this.f210516F0 != null) {
                float f = this.f210572w;
                if (this.f210509A == null) {
                    this.f210509A = new PointF(0.0f, 0.0f);
                }
                this.f210509A.set(this.f210574y);
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f210516F0.f210590l;
                boolean z = jCurrentTimeMillis > this.f210516F0.f210586h;
                long jMin = Math.min(jCurrentTimeMillis, this.f210516F0.f210586h);
                this.f210572w = m224712W(this.f210516F0.f210588j, jMin, this.f210516F0.f210579a, this.f210516F0.f210580b - this.f210516F0.f210579a, this.f210516F0.f210586h);
                float fM224712W = m224712W(this.f210516F0.f210588j, jMin, this.f210516F0.f210584f.x, this.f210516F0.f210585g.x - this.f210516F0.f210584f.x, this.f210516F0.f210586h);
                float fM224712W2 = m224712W(this.f210516F0.f210588j, jMin, this.f210516F0.f210584f.y, this.f210516F0.f210585g.y - this.f210516F0.f210584f.y, this.f210516F0.f210586h);
                this.f210574y.x -= m224696H0(this.f210516F0.f210582d.x) - fM224712W;
                this.f210574y.y -= m224697I0(this.f210516F0.f210582d.y) - fM224712W2;
                m224717b0(z || this.f210516F0.f210579a == this.f210516F0.f210580b);
                m224689A0(f, this.f210509A, this.f210516F0.f210589k);
                m224736u0(z);
                if (z) {
                    C22712c.m224745d(this.f210516F0);
                    this.f210516F0 = null;
                }
                invalidate();
            }
            if (this.f210553f == null || !m224723h0()) {
                Bitmap bitmap = this.f210548a;
                if (bitmap != null) {
                    float width = this.f210572w;
                    if (this.f210549b) {
                        width *= this.f210513E / bitmap.getWidth();
                        height = this.f210572w * (this.f210515F / this.f210548a.getHeight());
                    } else {
                        height = width;
                    }
                    if (this.f210536P0 == null) {
                        this.f210536P0 = new Matrix();
                    }
                    this.f210536P0.reset();
                    this.f210536P0.postScale(width, height);
                    this.f210536P0.postRotate(getRequiredRotation());
                    Matrix matrix = this.f210536P0;
                    PointF pointF = this.f210574y;
                    matrix.postTranslate(pointF.x, pointF.y);
                    if (getRequiredRotation() == 180) {
                        Matrix matrix2 = this.f210536P0;
                        float f2 = this.f210572w;
                        matrix2.postTranslate(this.f210513E * f2, f2 * this.f210515F);
                    } else if (getRequiredRotation() == 90) {
                        this.f210536P0.postTranslate(this.f210572w * this.f210515F, 0.0f);
                    } else if (getRequiredRotation() == 270) {
                        this.f210536P0.postTranslate(0.0f, this.f210572w * this.f210513E);
                    }
                    if (this.f210532N0 != null) {
                        if (this.f210538Q0 == null) {
                            this.f210538Q0 = new RectF();
                        }
                        this.f210538Q0.set(0.0f, 0.0f, this.f210549b ? this.f210548a.getWidth() : this.f210513E, this.f210549b ? this.f210548a.getHeight() : this.f210515F);
                        this.f210536P0.mapRect(this.f210538Q0);
                        canvas.drawRect(this.f210538Q0, this.f210532N0);
                    }
                    canvas.drawBitmap(this.f210548a, this.f210536P0, this.f210528L0);
                }
            } else {
                int iMin = Math.min(this.f210552e, m224704P(this.f210572w));
                boolean z2 = false;
                for (Map.Entry<Integer, List<C22720k>> entry : this.f210553f.entrySet()) {
                    if (entry.getKey().intValue() == iMin) {
                        for (C22720k c22720k : entry.getValue()) {
                            if (c22720k.f210613e && (c22720k.f210612d || c22720k.f210611c == null)) {
                                z2 = true;
                            }
                        }
                    }
                }
                for (Map.Entry<Integer, List<C22720k>> entry2 : this.f210553f.entrySet()) {
                    if (entry2.getKey().intValue() == iMin || z2) {
                        for (C22720k c22720k2 : entry2.getValue()) {
                            m224695G0(c22720k2.f210609a, c22720k2.f210614f);
                            if (!c22720k2.f210612d && c22720k2.f210611c != null) {
                                if (this.f210532N0 != null) {
                                    canvas.drawRect(c22720k2.f210614f, this.f210532N0);
                                }
                                if (this.f210536P0 == null) {
                                    this.f210536P0 = new Matrix();
                                }
                                this.f210536P0.reset();
                                m224691C0(this.f210540R0, 0.0f, 0.0f, c22720k2.f210611c.getWidth(), 0.0f, c22720k2.f210611c.getWidth(), c22720k2.f210611c.getHeight(), 0.0f, c22720k2.f210611c.getHeight());
                                if (getRequiredRotation() == 0) {
                                    m224691C0(this.f210542S0, c22720k2.f210614f.left, c22720k2.f210614f.top, c22720k2.f210614f.right, c22720k2.f210614f.top, c22720k2.f210614f.right, c22720k2.f210614f.bottom, c22720k2.f210614f.left, c22720k2.f210614f.bottom);
                                } else if (getRequiredRotation() == 90) {
                                    m224691C0(this.f210542S0, c22720k2.f210614f.right, c22720k2.f210614f.top, c22720k2.f210614f.right, c22720k2.f210614f.bottom, c22720k2.f210614f.left, c22720k2.f210614f.bottom, c22720k2.f210614f.left, c22720k2.f210614f.top);
                                } else if (getRequiredRotation() == 180) {
                                    m224691C0(this.f210542S0, c22720k2.f210614f.right, c22720k2.f210614f.bottom, c22720k2.f210614f.left, c22720k2.f210614f.bottom, c22720k2.f210614f.left, c22720k2.f210614f.top, c22720k2.f210614f.right, c22720k2.f210614f.top);
                                } else if (getRequiredRotation() == 270) {
                                    m224691C0(this.f210542S0, c22720k2.f210614f.left, c22720k2.f210614f.bottom, c22720k2.f210614f.left, c22720k2.f210614f.top, c22720k2.f210614f.right, c22720k2.f210614f.top, c22720k2.f210614f.right, c22720k2.f210614f.bottom);
                                }
                                this.f210536P0.setPolyToPoly(this.f210540R0, 0, this.f210542S0, 0, 4);
                                canvas.drawBitmap(c22720k2.f210611c, this.f210536P0, this.f210528L0);
                                if (this.f210554g) {
                                    canvas.drawRect(c22720k2.f210614f, this.f210530M0);
                                }
                            } else if (c22720k2.f210612d && this.f210554g) {
                                canvas.drawText("LOADING", c22720k2.f210614f.left + 5, c22720k2.f210614f.top + 35, this.f210530M0);
                            }
                            if (c22720k2.f210613e && this.f210554g) {
                                canvas.drawText("ISS " + c22720k2.f210610b + " RECT " + c22720k2.f210609a.top + Constants.SEPARATOR_COMMA + c22720k2.f210609a.left + Constants.SEPARATOR_COMMA + c22720k2.f210609a.bottom + Constants.SEPARATOR_COMMA + c22720k2.f210609a.right, c22720k2.f210614f.left + 5, c22720k2.f210614f.top + 15, this.f210530M0);
                            }
                        }
                    }
                }
            }
            if (this.f210554g) {
                Locale locale = Locale.ENGLISH;
                canvas.drawText("Scale: ".concat(String.format(locale, "%.2f", Float.valueOf(this.f210572w))), 5.0f, 15.0f, this.f210530M0);
                canvas.drawText("Translate: " + String.format(locale, "%.2f", Float.valueOf(this.f210574y.x)) + ":" + String.format(locale, "%.2f", Float.valueOf(this.f210574y.y)), 5.0f, 35.0f, this.f210530M0);
                PointF center = getCenter();
                canvas.drawText("Source center: " + String.format(locale, "%.2f", Float.valueOf(center.x)) + ":" + String.format(locale, "%.2f", Float.valueOf(center.y)), 5.0f, 55.0f, this.f210530M0);
                this.f210530M0.setStrokeWidth(2.0f);
                C22712c c22712c = this.f210516F0;
                if (c22712c != null) {
                    PointF pointFM224694F0 = m224694F0(c22712c.f210581c);
                    PointF pointFM224694F1 = m224694F0(this.f210516F0.f210583e);
                    PointF pointFM224694F2 = m224694F0(this.f210516F0.f210582d);
                    canvas.drawCircle(pointFM224694F0.x, pointFM224694F0.y, 10.0f, this.f210530M0);
                    this.f210530M0.setColor(-65536);
                    canvas.drawCircle(pointFM224694F1.x, pointFM224694F1.y, 20.0f, this.f210530M0);
                    this.f210530M0.setColor(-16776961);
                    canvas.drawCircle(pointFM224694F2.x, pointFM224694F2.y, 25.0f, this.f210530M0);
                    this.f210530M0.setColor(-16711681);
                    canvas.drawCircle(getWidth() / 2, getHeight() / 2, 30.0f, this.f210530M0);
                }
                if (this.f210541S != null) {
                    this.f210530M0.setColor(-65536);
                    PointF pointF2 = this.f210541S;
                    canvas.drawCircle(pointF2.x, pointF2.y, 20.0f, this.f210530M0);
                }
                if (this.f210565p0 != null) {
                    this.f210530M0.setColor(-16776961);
                    canvas.drawCircle(m224696H0(this.f210565p0.x), m224697I0(this.f210565p0.y), 35.0f, this.f210530M0);
                }
                if (this.f210514E0 != null) {
                    this.f210530M0.setColor(-16711681);
                    PointF pointF3 = this.f210514E0;
                    canvas.drawCircle(pointF3.x, pointF3.y, 30.0f, this.f210530M0);
                }
                this.f210530M0.setColor(-65281);
                this.f210530M0.setStrokeWidth(1.0f);
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
        if (this.f210513E > 0 && this.f210515F > 0) {
            if (z && z2) {
                size = m224741z0();
                size2 = m224740y0();
            } else if (z2) {
                size2 = (int) ((((double) m224740y0()) / ((double) m224741z0())) * ((double) size));
            } else if (z) {
                size = (int) ((((double) m224741z0()) / ((double) m224740y0())) * ((double) size2));
            }
        }
        setMeasuredDimension(Math.max(size, getSuggestedMinimumWidth()), Math.max(size2, getSuggestedMinimumHeight()));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        m224709T("onSizeChanged %dx%d -> %dx%d", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i), Integer.valueOf(i2));
        PointF center = getCenter();
        if (!this.f210518G0 || center == null) {
            return;
        }
        this.f210516F0 = null;
        this.f210510B = Float.valueOf(this.f210572w);
        this.f210511C = center;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        GestureDetector gestureDetector;
        C22712c c22712c = this.f210516F0;
        if (c22712c != null && !c22712c.f210587i) {
            m224737v0(true);
            return true;
        }
        C22712c c22712c2 = this.f210516F0;
        if (c22712c2 != null) {
            C22712c.m224745d(c22712c2);
        }
        this.f210516F0 = null;
        if (this.f210574y == null) {
            return true;
        }
        if (!this.f210527L && ((gestureDetector = this.f210531N) == null || gestureDetector.onTouchEvent(motionEvent))) {
            this.f210523J = false;
            this.f210525K = false;
            this.f210529M = 0;
            return true;
        }
        if (this.f210575z == null) {
            this.f210575z = new PointF(0.0f, 0.0f);
        }
        if (this.f210509A == null) {
            this.f210509A = new PointF(0.0f, 0.0f);
        }
        if (this.f210541S == null) {
            this.f210541S = new PointF(0.0f, 0.0f);
        }
        float f = this.f210572w;
        this.f210509A.set(this.f210574y);
        boolean zM224734s0 = m224734s0(motionEvent);
        m224689A0(f, this.f210509A, 2);
        return zM224734s0 || super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: p0 */
    public void m224731p0() {
    }

    /* JADX INFO: renamed from: q0 */
    public final synchronized void m224732q0() {
        Bitmap bitmap;
        try {
            m224709T("onTileLoaded", new Object[0]);
            m224707R();
            m224706Q();
            if (m224723h0() && (bitmap = this.f210548a) != null) {
                if (!this.f210550c) {
                    bitmap.recycle();
                }
                this.f210548a = null;
                InterfaceC22717h interfaceC22717h = this.f210522I0;
                if (interfaceC22717h != null && this.f210550c) {
                    interfaceC22717h.mo224778a();
                }
                this.f210549b = false;
                this.f210550c = false;
            }
            invalidate();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final synchronized void m224733r0(akm akmVar, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        try {
            m224709T("onTilesInited sWidth=%d, sHeight=%d, sOrientation=%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.f210555h));
            int i8 = this.f210513E;
            if (i8 > 0 && (i7 = this.f210515F) > 0 && (i8 != i || i7 != i2)) {
                m224738w0(false);
                Bitmap bitmap = this.f210548a;
                if (bitmap != null) {
                    if (!this.f210550c) {
                        bitmap.recycle();
                    }
                    this.f210548a = null;
                    InterfaceC22717h interfaceC22717h = this.f210522I0;
                    if (interfaceC22717h != null && this.f210550c) {
                        interfaceC22717h.mo224778a();
                    }
                    this.f210549b = false;
                    this.f210550c = false;
                }
            }
            this.f210533O = akmVar;
            this.f210513E = i;
            this.f210515F = i2;
            this.f210517G = i3;
            m224707R();
            if (!m224706Q() && (i4 = this.f210562n) > 0 && i4 != (i5 = f210508Z0) && (i6 = this.f210563o) > 0 && i6 != i5 && getWidth() > 0 && getHeight() > 0) {
                m224721f0(new Point(this.f210562n, this.f210563o));
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
    */
    public final boolean m224734s0(@NonNull MotionEvent motionEvent) {
        boolean z;
        int pointerCount = motionEvent.getPointerCount();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 5) {
                        if (action != 6) {
                            if (action != 261) {
                            }
                        }
                    }
                } else if (this.f210529M > 0) {
                    if (pointerCount < 2) {
                        if (this.f210527L) {
                            float fAbs = (Math.abs(this.f210514E0.y - motionEvent.getY()) * 2.0f) + this.f210545U;
                            if (this.f210546V == -1.0f) {
                                this.f210546V = fAbs;
                            }
                            float y = motionEvent.getY();
                            PointF pointF = this.f210559k0;
                            boolean z2 = y > pointF.y;
                            pointF.set(0.0f, motionEvent.getY());
                            float f = 1.0f;
                            float fAbs2 = Math.abs(1.0f - (fAbs / this.f210546V)) * 0.5f;
                            if (fAbs2 > 0.03f || this.f210547W) {
                                this.f210547W = true;
                                if (this.f210546V > 0.0f) {
                                    f = z2 ? fAbs2 + 1.0f : 1.0f - fAbs2;
                                }
                                double d = this.f210572w;
                                float fMax = Math.max(m224727l0(), Math.min(this.f210556i, this.f210572w * f));
                                this.f210572w = fMax;
                                if (this.f210566q) {
                                    PointF pointF2 = this.f210541S;
                                    float f2 = pointF2.x;
                                    PointF pointF3 = this.f210575z;
                                    float f3 = f2 - pointF3.x;
                                    float f4 = pointF2.y;
                                    float f5 = f4 - pointF3.y;
                                    float f6 = this.f210573x;
                                    float f7 = f3 * (fMax / f6);
                                    float f8 = f5 * (fMax / f6);
                                    PointF pointF4 = this.f210574y;
                                    pointF4.x = f2 - f7;
                                    pointF4.y = f4 - f8;
                                    if ((((double) m224740y0()) * d < getHeight() && this.f210572w * m224740y0() >= getHeight()) || (d * ((double) m224741z0()) < getWidth() && this.f210572w * m224741z0() >= getWidth())) {
                                        m224717b0(true);
                                        this.f210541S.set(m224694F0(this.f210565p0));
                                        this.f210575z.set(this.f210574y);
                                        this.f210573x = this.f210572w;
                                        fAbs = 0.0f;
                                    }
                                } else {
                                    PointF pointF5 = this.f210512D;
                                    PointF pointF6 = this.f210574y;
                                    if (pointF5 != null) {
                                        pointF6.x = (getWidth() / 2) - (this.f210572w * this.f210512D.x);
                                        this.f210574y.y = (getHeight() / 2) - (this.f210572w * this.f210512D.y);
                                    } else {
                                        pointF6.x = (getWidth() / 2) - (this.f210572w * (m224741z0() / 2));
                                        this.f210574y.y = (getHeight() / 2) - (this.f210572w * (m224740y0() / 2));
                                    }
                                }
                            }
                            this.f210546V = fAbs;
                            m224717b0(true);
                            m224736u0(false);
                        } else if (!this.f210523J) {
                            float fAbs3 = Math.abs(motionEvent.getX() - this.f210541S.x);
                            float fAbs4 = Math.abs(motionEvent.getY() - this.f210541S.y);
                            float f9 = this.f210544T0 * 5.0f;
                            if (fAbs3 > f9 || fAbs4 > f9 || this.f210525K) {
                                this.f210574y.x = this.f210575z.x + (motionEvent.getX() - this.f210541S.x);
                                this.f210574y.y = this.f210575z.y + (motionEvent.getY() - this.f210541S.y);
                                PointF pointF7 = this.f210574y;
                                float f10 = pointF7.x;
                                float f11 = pointF7.y;
                                m224717b0(true);
                                PointF pointF8 = this.f210574y;
                                boolean z3 = f10 != pointF8.x;
                                boolean z4 = z3 && fAbs3 > fAbs4 && !this.f210525K;
                                boolean z5 = f11 == pointF8.y && fAbs4 > f9 * 3.0f;
                                if (!z4 && (!z3 || z5 || this.f210525K)) {
                                    this.f210525K = true;
                                } else if (fAbs3 > f9) {
                                    this.f210529M = 0;
                                    this.f210526K0.removeMessages(1);
                                    m224737v0(false);
                                }
                                if (!this.f210566q) {
                                    PointF pointF9 = this.f210574y;
                                    PointF pointF10 = this.f210575z;
                                    pointF9.x = pointF10.x;
                                    pointF9.y = pointF10.y;
                                    m224737v0(false);
                                }
                                m224736u0(false);
                            }
                        }
                        this.f210526K0.removeMessages(1);
                        invalidate();
                        return true;
                    }
                    float fM224710U = m224710U(motionEvent.getX(0), motionEvent.getX(1), motionEvent.getY(0), motionEvent.getY(1));
                    float x = (motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f;
                    float y2 = (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f;
                    if (this.f210567r) {
                        PointF pointF11 = this.f210541S;
                        if (m224710U(pointF11.x, x, pointF11.y, y2) > 5.0f || Math.abs(fM224710U - this.f210543T) > 5.0f || this.f210525K) {
                            this.f210523J = true;
                            this.f210525K = true;
                            double d2 = this.f210572w;
                            float fMin = Math.min(this.f210556i, (fM224710U / this.f210543T) * this.f210573x);
                            this.f210572w = fMin;
                            if (fMin <= m224727l0()) {
                                this.f210543T = fM224710U;
                                this.f210573x = m224727l0();
                                this.f210541S.set(x, y2);
                                this.f210575z.set(this.f210574y);
                            } else if (this.f210566q) {
                                PointF pointF12 = this.f210541S;
                                float f12 = pointF12.x;
                                PointF pointF13 = this.f210575z;
                                float f13 = f12 - pointF13.x;
                                float f14 = pointF12.y - pointF13.y;
                                float f15 = this.f210572w;
                                float f16 = this.f210573x;
                                float f17 = f13 * (f15 / f16);
                                float f18 = f14 * (f15 / f16);
                                PointF pointF14 = this.f210574y;
                                pointF14.x = x - f17;
                                pointF14.y = y2 - f18;
                                if ((((double) m224740y0()) * d2 < getHeight() && this.f210572w * m224740y0() >= getHeight()) || (d2 * ((double) m224741z0()) < getWidth() && this.f210572w * m224741z0() >= getWidth())) {
                                    m224717b0(true);
                                    this.f210541S.set(x, y2);
                                    this.f210575z.set(this.f210574y);
                                    this.f210573x = this.f210572w;
                                    this.f210543T = fM224710U;
                                }
                            } else {
                                PointF pointF15 = this.f210512D;
                                PointF pointF16 = this.f210574y;
                                if (pointF15 != null) {
                                    pointF16.x = (getWidth() / 2) - (this.f210572w * this.f210512D.x);
                                    this.f210574y.y = (getHeight() / 2) - (this.f210572w * this.f210512D.y);
                                } else {
                                    pointF16.x = (getWidth() / 2) - (this.f210572w * (m224741z0() / 2));
                                    this.f210574y.y = (getHeight() / 2) - (this.f210572w * (m224740y0() / 2));
                                }
                            }
                            m224717b0(true);
                            m224736u0(false);
                            this.f210526K0.removeMessages(1);
                            invalidate();
                            return true;
                        }
                    }
                }
                return false;
            }
            this.f210526K0.removeMessages(1);
            if (this.f210527L) {
                this.f210527L = false;
                if (!this.f210547W) {
                    m224711V(this.f210565p0, this.f210541S);
                }
            }
            if (this.f210529M <= 0 || !((z = this.f210523J) || this.f210525K)) {
                if (pointerCount == 1) {
                    this.f210523J = false;
                    this.f210525K = false;
                    this.f210529M = 0;
                }
                return true;
            }
            if (z && pointerCount == 2) {
                this.f210525K = true;
                PointF pointF17 = this.f210575z;
                PointF pointF18 = this.f210574y;
                pointF17.set(pointF18.x, pointF18.y);
                int actionIndex = motionEvent.getActionIndex();
                PointF pointF19 = this.f210541S;
                if (actionIndex == 1) {
                    pointF19.set(motionEvent.getX(0), motionEvent.getY(0));
                } else {
                    pointF19.set(motionEvent.getX(1), motionEvent.getY(1));
                }
            }
            if (pointerCount < 3) {
                this.f210523J = false;
            }
            if (pointerCount < 2) {
                this.f210525K = false;
                this.f210529M = 0;
            }
            m224736u0(true);
            return true;
        }
        this.f210516F0 = null;
        m224737v0(true);
        this.f210529M = Math.max(this.f210529M, pointerCount);
        if (pointerCount >= 2) {
            if (this.f210567r) {
                float fM224710U2 = m224710U(motionEvent.getX(0), motionEvent.getX(1), motionEvent.getY(0), motionEvent.getY(1));
                this.f210573x = this.f210572w;
                this.f210543T = fM224710U2;
                PointF pointF20 = this.f210575z;
                PointF pointF21 = this.f210574y;
                pointF20.set(pointF21.x, pointF21.y);
                this.f210541S.set((motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f, (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f);
            } else {
                this.f210529M = 0;
            }
            this.f210526K0.removeMessages(1);
        } else if (!this.f210527L) {
            PointF pointF22 = this.f210575z;
            PointF pointF23 = this.f210574y;
            pointF22.set(pointF23.x, pointF23.y);
            this.f210541S.set(motionEvent.getX(), motionEvent.getY());
            this.f210526K0.sendEmptyMessageDelayed(1, 600L);
        }
        return true;
    }

    public final void setBitmapDecoderClass(Class<? extends rhm> cls) {
        if (cls != null) {
            this.f210537Q = new ko5(cls);
        } else {
            wg3.m206174a("Decoder class cannot be set to null");
        }
    }

    public final void setBitmapDecoderFactory(kid<? extends rhm> kidVar) {
        if (kidVar != null) {
            this.f210537Q = kidVar;
        } else {
            wg3.m206174a("Decoder factory cannot be set to null");
        }
    }

    public final void setDebug(boolean z) {
        this.f210554g = z;
    }

    public final void setDoubleTapZoomDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setDoubleTapZoomScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / i);
    }

    public final void setDoubleTapZoomDuration(int i) {
        this.f210571v = Math.max(0, i);
    }

    public final void setDoubleTapZoomScale(float f) {
        this.f210569t = f;
    }

    public final void setDoubleTapZoomStyle(int i) {
        if (f210504V0.contains(Integer.valueOf(i))) {
            this.f210570u = i;
        } else {
            za50.m219101a("Invalid zoom style: ", i);
        }
    }

    public final void setImage(qkm qkmVar) {
        m224690B0(qkmVar, null, null);
    }

    public final void setMaxScale(float f) {
        this.f210556i = f;
    }

    public void setMaxTileSize(int i) {
        this.f210562n = i;
        this.f210563o = i;
    }

    public final void setMaximumDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setMinScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / i);
    }

    public final void setMinScale(float f) {
        this.f210557j = f;
    }

    public final void setMinimumDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setMaxScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / i);
    }

    public final void setMinimumScaleType(int i) {
        if (!f210507Y0.contains(Integer.valueOf(i))) {
            za50.m219101a("Invalid scale type: ", i);
            return;
        }
        this.f210561m = i;
        if (m224724i0()) {
            m224717b0(true);
            invalidate();
        }
    }

    public void setMinimumTileDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f210558k = (int) Math.min((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f, i);
        if (m224724i0()) {
            m224738w0(false);
            invalidate();
        }
    }

    public void setOnImageEventListener(InterfaceC22717h interfaceC22717h) {
        this.f210522I0 = interfaceC22717h;
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f210524J0 = onLongClickListener;
    }

    public void setOnStateChangedListener(InterfaceC22718i interfaceC22718i) {
    }

    public final void setOrientation(int i) {
        if (!f210503U0.contains(Integer.valueOf(i))) {
            za50.m219101a("Invalid orientation: ", i);
            return;
        }
        this.f210555h = i;
        m224738w0(false);
        invalidate();
        requestLayout();
    }

    public final void setPanEnabled(boolean z) {
        PointF pointF;
        this.f210566q = z;
        if (z || (pointF = this.f210574y) == null) {
            return;
        }
        pointF.x = (getWidth() / 2) - (this.f210572w * (m224741z0() / 2));
        this.f210574y.y = (getHeight() / 2) - (this.f210572w * (m224740y0() / 2));
        if (m224724i0()) {
            m224736u0(true);
            invalidate();
        }
    }

    public final void setPanLimit(int i) {
        if (!f210506X0.contains(Integer.valueOf(i))) {
            za50.m219101a("Invalid pan limit: ", i);
            return;
        }
        this.f210560l = i;
        if (m224724i0()) {
            m224717b0(true);
            invalidate();
        }
    }

    public void setParallelLoadingEnabled(boolean z) {
        this.f210564p = z;
    }

    public final void setQuickScaleEnabled(boolean z) {
        this.f210568s = z;
    }

    public final void setRegionDecoderClass(Class<? extends akm> cls) {
        if (cls != null) {
            this.f210539R = new ko5(cls);
        } else {
            wg3.m206174a("Decoder class cannot be set to null");
        }
    }

    public final void setRegionDecoderFactory(kid<? extends akm> kidVar) {
        if (kidVar != null) {
            this.f210539R = kidVar;
        } else {
            wg3.m206174a("Decoder factory cannot be set to null");
        }
    }

    public final void setTileBackgroundColor(int i) {
        if (Color.alpha(i) == 0) {
            this.f210532N0 = null;
        } else {
            Paint paint = new Paint();
            this.f210532N0 = paint;
            paint.setStyle(Paint.Style.FILL);
            this.f210532N0.setColor(i);
        }
        invalidate();
    }

    public final void setZoomEnabled(boolean z) {
        this.f210567r = z;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m224735t0() {
        Float f;
        if (getWidth() == 0 || getHeight() == 0 || this.f210513E <= 0 || this.f210515F <= 0) {
            return;
        }
        if (this.f210511C != null && (f = this.f210510B) != null) {
            this.f210572w = f.floatValue();
            if (this.f210574y == null) {
                this.f210574y = new PointF();
            }
            this.f210574y.x = (getWidth() / 2) - (this.f210572w * this.f210511C.x);
            this.f210574y.y = (getHeight() / 2) - (this.f210572w * this.f210511C.y);
            this.f210511C = null;
            this.f210510B = null;
            m224717b0(true);
            m224736u0(true);
        }
        m224717b0(false);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m224736u0(boolean z) {
        if (this.f210533O == null || this.f210553f == null) {
            return;
        }
        int iMin = Math.min(this.f210552e, m224704P(this.f210572w));
        Iterator<Map.Entry<Integer, List<C22720k>>> it = this.f210553f.entrySet().iterator();
        while (it.hasNext()) {
            for (C22720k c22720k : it.next().getValue()) {
                if (c22720k.f210610b < iMin || (c22720k.f210610b > iMin && c22720k.f210610b != this.f210552e)) {
                    c22720k.f210613e = false;
                    if (c22720k.f210611c != null) {
                        c22720k.f210611c.recycle();
                        c22720k.f210611c = null;
                    }
                }
                if (c22720k.f210610b == iMin) {
                    if (m224698J0(c22720k)) {
                        c22720k.f210613e = true;
                        if (!c22720k.f210612d && c22720k.f210611c == null && z) {
                            m224715Z(new AsyncTaskC22721l(this, this.f210533O, c22720k));
                        }
                    } else if (c22720k.f210610b != this.f210552e) {
                        c22720k.f210613e = false;
                        if (c22720k.f210611c != null) {
                            c22720k.f210611c.recycle();
                            c22720k.f210611c = null;
                        }
                    }
                } else if (c22720k.f210610b == this.f210552e) {
                    c22720k.f210613e = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m224737v0(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m224738w0(boolean z) {
        InterfaceC22717h interfaceC22717h;
        m224709T("reset newImage=" + z, new Object[0]);
        this.f210572w = 0.0f;
        this.f210573x = 0.0f;
        this.f210574y = null;
        this.f210575z = null;
        this.f210509A = null;
        this.f210510B = Float.valueOf(0.0f);
        this.f210511C = null;
        this.f210512D = null;
        this.f210523J = false;
        this.f210525K = false;
        this.f210527L = false;
        this.f210529M = 0;
        this.f210552e = 0;
        this.f210541S = null;
        this.f210543T = 0.0f;
        this.f210546V = 0.0f;
        this.f210547W = false;
        this.f210565p0 = null;
        this.f210559k0 = null;
        this.f210514E0 = null;
        this.f210516F0 = null;
        this.f210534O0 = null;
        this.f210536P0 = null;
        this.f210538Q0 = null;
        if (z) {
            this.f210551d = null;
            if (this.f210533O != null) {
                synchronized (this.f210535P) {
                    this.f210533O.recycle();
                    this.f210533O = null;
                }
            }
            Bitmap bitmap = this.f210548a;
            if (bitmap != null && !this.f210550c) {
                bitmap.recycle();
            }
            if (this.f210548a != null && this.f210550c && (interfaceC22717h = this.f210522I0) != null) {
                interfaceC22717h.mo224778a();
            }
            this.f210513E = 0;
            this.f210515F = 0;
            this.f210517G = 0;
            this.f210519H = null;
            this.f210521I = null;
            this.f210518G0 = false;
            this.f210520H0 = false;
            this.f210548a = null;
            this.f210549b = false;
            this.f210550c = false;
        }
        Map<Integer, List<C22720k>> map = this.f210553f;
        if (map != null) {
            Iterator<Map.Entry<Integer, List<C22720k>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                for (C22720k c22720k : it.next().getValue()) {
                    c22720k.f210613e = false;
                    if (c22720k.f210611c != null) {
                        c22720k.f210611c.recycle();
                        c22720k.f210611c = null;
                    }
                }
            }
            this.f210553f = null;
        }
        setGestureDetector(getContext());
    }

    /* JADX INFO: renamed from: x0 */
    public final void m224739x0(ImageViewState imageViewState) {
        if (imageViewState == null || imageViewState.getCenter() == null || !f210503U0.contains(Integer.valueOf(imageViewState.getOrientation()))) {
            return;
        }
        this.f210555h = imageViewState.getOrientation();
        this.f210510B = Float.valueOf(imageViewState.getScale());
        this.f210511C = imageViewState.getCenter();
        invalidate();
    }

    /* JADX INFO: renamed from: y0 */
    public final int m224740y0() {
        int requiredRotation = getRequiredRotation();
        return (requiredRotation == 90 || requiredRotation == 270) ? this.f210513E : this.f210515F;
    }

    /* JADX INFO: renamed from: z0 */
    public final int m224741z0() {
        int requiredRotation = getRequiredRotation();
        return (requiredRotation == 90 || requiredRotation == 270) ? this.f210515F : this.f210513E;
    }

    /* JADX INFO: renamed from: v.fresco.subscaleview.SubsamplingScaleImageView$d */
    public final class C22713d {

        /* JADX INFO: renamed from: a */
        public final float f210591a;

        /* JADX INFO: renamed from: b */
        public final PointF f210592b;

        /* JADX INFO: renamed from: c */
        public final PointF f210593c;

        /* JADX INFO: renamed from: d */
        public long f210594d;

        /* JADX INFO: renamed from: e */
        public int f210595e;

        /* JADX INFO: renamed from: f */
        public int f210596f;

        /* JADX INFO: renamed from: g */
        public boolean f210597g;

        /* JADX INFO: renamed from: h */
        public boolean f210598h;

        public C22713d(PointF pointF) {
            this.f210594d = 500L;
            this.f210595e = 2;
            this.f210596f = 1;
            this.f210597g = true;
            this.f210598h = true;
            this.f210591a = SubsamplingScaleImageView.this.f210572w;
            this.f210592b = pointF;
            this.f210593c = null;
        }

        /* JADX INFO: renamed from: c */
        public void m224770c() {
            PointF pointFM224725j0;
            if (SubsamplingScaleImageView.this.f210516F0 != null) {
                C22712c.m224745d(SubsamplingScaleImageView.this.f210516F0);
            }
            int paddingLeft = SubsamplingScaleImageView.this.getPaddingLeft() + (((SubsamplingScaleImageView.this.getWidth() - SubsamplingScaleImageView.this.getPaddingRight()) - SubsamplingScaleImageView.this.getPaddingLeft()) / 2);
            int paddingTop = SubsamplingScaleImageView.this.getPaddingTop() + (((SubsamplingScaleImageView.this.getHeight() - SubsamplingScaleImageView.this.getPaddingBottom()) - SubsamplingScaleImageView.this.getPaddingTop()) / 2);
            float fM224726k0 = SubsamplingScaleImageView.this.m224726k0(this.f210591a);
            if (this.f210598h) {
                SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
                PointF pointF = this.f210592b;
                pointFM224725j0 = subsamplingScaleImageView.m224725j0(pointF.x, pointF.y, fM224726k0, new PointF());
            } else {
                pointFM224725j0 = this.f210592b;
            }
            SubsamplingScaleImageView.this.f210516F0 = new C22712c();
            SubsamplingScaleImageView.this.f210516F0.f210579a = SubsamplingScaleImageView.this.f210572w;
            SubsamplingScaleImageView.this.f210516F0.f210580b = fM224726k0;
            SubsamplingScaleImageView.this.f210516F0.f210590l = System.currentTimeMillis();
            SubsamplingScaleImageView.this.f210516F0.f210583e = pointFM224725j0;
            SubsamplingScaleImageView.this.f210516F0.f210581c = SubsamplingScaleImageView.this.getCenter();
            SubsamplingScaleImageView.this.f210516F0.f210582d = pointFM224725j0;
            SubsamplingScaleImageView.this.f210516F0.f210584f = SubsamplingScaleImageView.this.m224694F0(pointFM224725j0);
            SubsamplingScaleImageView.this.f210516F0.f210585g = new PointF(paddingLeft, paddingTop);
            SubsamplingScaleImageView.this.f210516F0.f210586h = this.f210594d;
            SubsamplingScaleImageView.this.f210516F0.f210587i = this.f210597g;
            SubsamplingScaleImageView.this.f210516F0.f210588j = this.f210595e;
            SubsamplingScaleImageView.this.f210516F0.f210589k = this.f210596f;
            SubsamplingScaleImageView.this.f210516F0.f210590l = System.currentTimeMillis();
            SubsamplingScaleImageView.this.f210516F0.getClass();
            PointF pointF2 = this.f210593c;
            if (pointF2 != null) {
                float f = pointF2.x - (SubsamplingScaleImageView.this.f210516F0.f210581c.x * fM224726k0);
                float f2 = this.f210593c.y - (SubsamplingScaleImageView.this.f210516F0.f210581c.y * fM224726k0);
                C22719j c22719j = new C22719j(fM224726k0, new PointF(f, f2));
                SubsamplingScaleImageView.this.m224718c0(true, c22719j);
                SubsamplingScaleImageView.this.f210516F0.f210585g = new PointF(this.f210593c.x + (c22719j.f210608b.x - f), this.f210593c.y + (c22719j.f210608b.y - f2));
            }
            SubsamplingScaleImageView.this.invalidate();
        }

        /* JADX INFO: renamed from: d */
        public C22713d m224771d(long j) {
            this.f210594d = j;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C22713d m224772e(int i) {
            if (SubsamplingScaleImageView.f210505W0.contains(Integer.valueOf(i))) {
                this.f210595e = i;
                return this;
            }
            za50.m219101a("Unknown easing type: ", i);
            return null;
        }

        /* JADX INFO: renamed from: f */
        public C22713d m224773f(boolean z) {
            this.f210597g = z;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public final C22713d m224774g(int i) {
            this.f210596f = i;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public final C22713d m224775h(boolean z) {
            this.f210598h = z;
            return this;
        }

        public C22713d(float f, PointF pointF) {
            this.f210594d = 500L;
            this.f210595e = 2;
            this.f210596f = 1;
            this.f210597g = true;
            this.f210598h = true;
            this.f210591a = f;
            this.f210592b = pointF;
            this.f210593c = null;
        }

        public C22713d(float f, PointF pointF, PointF pointF2) {
            this.f210594d = 500L;
            this.f210595e = 2;
            this.f210596f = 1;
            this.f210597g = true;
            this.f210598h = true;
            this.f210591a = f;
            this.f210592b = pointF;
            this.f210593c = pointF2;
        }
    }

    public SubsamplingScaleImageView(Context context) {
        this(context, null);
    }
}
