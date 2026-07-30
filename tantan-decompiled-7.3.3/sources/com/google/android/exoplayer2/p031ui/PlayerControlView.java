package com.google.android.exoplayer2.p031ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.AbstractC1857c0;
import com.google.android.exoplayer2.InterfaceC2026t;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import p153l.bmk0;
import p153l.g0d0;
import p153l.hfc0;
import p153l.lcc0;
import p153l.t9f;
import p153l.w11;
import p153l.ydc0;
import p153l.ygc0;
import p153l.zbc0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class PlayerControlView extends FrameLayout {

    /* JADX INFO: renamed from: A */
    public final Drawable f9222A;

    /* JADX INFO: renamed from: B */
    public final Drawable f9223B;

    /* JADX INFO: renamed from: C */
    public final float f9224C;

    /* JADX INFO: renamed from: D */
    public final float f9225D;

    /* JADX INFO: renamed from: E */
    public final String f9226E;

    /* JADX INFO: renamed from: E0 */
    public long f9227E0;

    /* JADX INFO: renamed from: F */
    public final String f9228F;

    /* JADX INFO: renamed from: F0 */
    public long f9229F0;

    /* JADX INFO: renamed from: G */
    @Nullable
    public InterfaceC2026t f9230G;

    /* JADX INFO: renamed from: H */
    public boolean f9231H;

    /* JADX INFO: renamed from: I */
    public boolean f9232I;

    /* JADX INFO: renamed from: J */
    public boolean f9233J;

    /* JADX INFO: renamed from: K */
    public boolean f9234K;

    /* JADX INFO: renamed from: L */
    public int f9235L;

    /* JADX INFO: renamed from: M */
    public int f9236M;

    /* JADX INFO: renamed from: N */
    public int f9237N;

    /* JADX INFO: renamed from: O */
    public boolean f9238O;

    /* JADX INFO: renamed from: P */
    public boolean f9239P;

    /* JADX INFO: renamed from: Q */
    public boolean f9240Q;

    /* JADX INFO: renamed from: R */
    public boolean f9241R;

    /* JADX INFO: renamed from: S */
    public boolean f9242S;

    /* JADX INFO: renamed from: T */
    public long f9243T;

    /* JADX INFO: renamed from: U */
    public long[] f9244U;

    /* JADX INFO: renamed from: V */
    public boolean[] f9245V;

    /* JADX INFO: renamed from: W */
    public long[] f9246W;

    /* JADX INFO: renamed from: a */
    public final ViewOnClickListenerC2033c f9247a;

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList<InterfaceC2035e> f9248b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final View f9249c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final View f9250d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final View f9251e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final View f9252f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public final View f9253g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final View f9254h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final ImageView f9255i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final ImageView f9256j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final View f9257k;

    /* JADX INFO: renamed from: k0 */
    public boolean[] f9258k0;

    /* JADX INFO: renamed from: l */
    @Nullable
    public final TextView f9259l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public final TextView f9260m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public final InterfaceC2061b f9261n;

    /* JADX INFO: renamed from: o */
    public final StringBuilder f9262o;

    /* JADX INFO: renamed from: p */
    public final Formatter f9263p;

    /* JADX INFO: renamed from: p0 */
    public long f9264p0;

    /* JADX INFO: renamed from: q */
    public final AbstractC1857c0.b f9265q;

    /* JADX INFO: renamed from: r */
    public final AbstractC1857c0.d f9266r;

    /* JADX INFO: renamed from: s */
    public final Runnable f9267s;

    /* JADX INFO: renamed from: t */
    public final Runnable f9268t;

    /* JADX INFO: renamed from: u */
    public final Drawable f9269u;

    /* JADX INFO: renamed from: v */
    public final Drawable f9270v;

    /* JADX INFO: renamed from: w */
    public final Drawable f9271w;

    /* JADX INFO: renamed from: x */
    public final String f9272x;

    /* JADX INFO: renamed from: y */
    public final String f9273y;

    /* JADX INFO: renamed from: z */
    public final String f9274z;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.PlayerControlView$b */
    @RequiresApi(21)
    public static final class C2032b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static boolean m11930a(View view) {
            return view.isAccessibilityFocused();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.PlayerControlView$c */
    public final class ViewOnClickListenerC2033c implements InterfaceC2026t.d, InterfaceC2061b.a, View.OnClickListener {
        public ViewOnClickListenerC2033c() {
        }

        @Override // com.google.android.exoplayer2.p031ui.InterfaceC2061b.a
        /* JADX INFO: renamed from: L */
        public void mo11931L(InterfaceC2061b interfaceC2061b, long j) {
            if (PlayerControlView.this.f9260m != null) {
                PlayerControlView.this.f9260m.setText(bmk0.m105148k0(PlayerControlView.this.f9262o, PlayerControlView.this.f9263p, j));
            }
        }

        @Override // com.google.android.exoplayer2.p031ui.InterfaceC2061b.a
        /* JADX INFO: renamed from: N */
        public void mo11932N(InterfaceC2061b interfaceC2061b, long j) {
            PlayerControlView.this.f9234K = true;
            if (PlayerControlView.this.f9260m != null) {
                PlayerControlView.this.f9260m.setText(bmk0.m105148k0(PlayerControlView.this.f9262o, PlayerControlView.this.f9263p, j));
            }
        }

        @Override // com.google.android.exoplayer2.InterfaceC2026t.d
        /* JADX INFO: renamed from: l0 */
        public void mo11831l0(InterfaceC2026t interfaceC2026t, InterfaceC2026t.c cVar) {
            if (cVar.m11806b(4, 5)) {
                PlayerControlView.this.m11923N();
            }
            if (cVar.m11806b(4, 5, 7)) {
                PlayerControlView.this.m11924O();
            }
            if (cVar.m11805a(8)) {
                PlayerControlView.this.m11925P();
            }
            if (cVar.m11805a(9)) {
                PlayerControlView.this.m11926Q();
            }
            if (cVar.m11806b(8, 9, 11, 0, 13)) {
                PlayerControlView.this.m11922M();
            }
            if (cVar.m11806b(11, 0)) {
                PlayerControlView.this.m11927R();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            InterfaceC2026t interfaceC2026t = PlayerControlView.this.f9230G;
            if (interfaceC2026t == null) {
                return;
            }
            if (PlayerControlView.this.f9250d == view) {
                interfaceC2026t.seekToNext();
                return;
            }
            if (PlayerControlView.this.f9249c == view) {
                interfaceC2026t.seekToPrevious();
                return;
            }
            if (PlayerControlView.this.f9253g == view) {
                if (interfaceC2026t.getPlaybackState() != 4) {
                    interfaceC2026t.seekForward();
                    return;
                }
                return;
            }
            if (PlayerControlView.this.f9254h == view) {
                interfaceC2026t.seekBack();
                return;
            }
            if (PlayerControlView.this.f9251e == view) {
                bmk0.m105169t0(interfaceC2026t);
                return;
            }
            if (PlayerControlView.this.f9252f == view) {
                bmk0.m105167s0(interfaceC2026t);
            } else if (PlayerControlView.this.f9255i == view) {
                interfaceC2026t.setRepeatMode(g0d0.m128417a(interfaceC2026t.getRepeatMode(), PlayerControlView.this.f9237N));
            } else if (PlayerControlView.this.f9256j == view) {
                interfaceC2026t.setShuffleModeEnabled(!interfaceC2026t.getShuffleModeEnabled());
            }
        }

        @Override // com.google.android.exoplayer2.p031ui.InterfaceC2061b.a
        /* JADX INFO: renamed from: u */
        public void mo11933u(InterfaceC2061b interfaceC2061b, long j, boolean z) {
            PlayerControlView.this.f9234K = false;
            if (z || PlayerControlView.this.f9230G == null) {
                return;
            }
            PlayerControlView playerControlView = PlayerControlView.this;
            playerControlView.m11918I(playerControlView.f9230G, j);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.PlayerControlView$d */
    public interface InterfaceC2034d {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.PlayerControlView$e */
    public interface InterfaceC2035e {
        /* JADX INFO: renamed from: u */
        void mo11934u(int i);
    }

    static {
        t9f.m189752a("goog.exo.ui");
    }

    public PlayerControlView(Context context, @Nullable AttributeSet attributeSet, int i, @Nullable AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        int resourceId = hfc0.f109269b;
        this.f9235L = 5000;
        this.f9237N = 0;
        this.f9236M = 200;
        this.f9243T = -9223372036854775807L;
        this.f9238O = true;
        this.f9239P = true;
        this.f9240Q = true;
        this.f9241R = true;
        this.f9242S = false;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, ygc0.f199810r, i, 0);
            try {
                this.f9235L = typedArrayObtainStyledAttributes.getInt(ygc0.f199818z, this.f9235L);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(ygc0.f199811s, resourceId);
                this.f9237N = m11910z(typedArrayObtainStyledAttributes, this.f9237N);
                this.f9238O = typedArrayObtainStyledAttributes.getBoolean(ygc0.f199816x, this.f9238O);
                this.f9239P = typedArrayObtainStyledAttributes.getBoolean(ygc0.f199813u, this.f9239P);
                this.f9240Q = typedArrayObtainStyledAttributes.getBoolean(ygc0.f199815w, this.f9240Q);
                this.f9241R = typedArrayObtainStyledAttributes.getBoolean(ygc0.f199814v, this.f9241R);
                this.f9242S = typedArrayObtainStyledAttributes.getBoolean(ygc0.f199817y, this.f9242S);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(ygc0.f199750A, this.f9236M));
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f9248b = new CopyOnWriteArrayList<>();
        this.f9265q = new AbstractC1857c0.b();
        this.f9266r = new AbstractC1857c0.d();
        StringBuilder sb = new StringBuilder();
        this.f9262o = sb;
        this.f9263p = new Formatter(sb, Locale.getDefault());
        this.f9244U = new long[0];
        this.f9245V = new boolean[0];
        this.f9246W = new long[0];
        this.f9258k0 = new boolean[0];
        ViewOnClickListenerC2033c viewOnClickListenerC2033c = new ViewOnClickListenerC2033c();
        this.f9247a = viewOnClickListenerC2033c;
        this.f9267s = new Runnable() { // from class: l.ze80
            @Override // java.lang.Runnable
            public final void run() {
                this.f203984a.m11924O();
            }
        };
        this.f9268t = new Runnable() { // from class: l.af80
            @Override // java.lang.Runnable
            public final void run() {
                this.f70879a.m11911A();
            }
        };
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        InterfaceC2061b interfaceC2061b = (InterfaceC2061b) findViewById(lcc0.f131308H);
        View viewFindViewById = findViewById(lcc0.f131309I);
        if (interfaceC2061b != null) {
            this.f9261n = interfaceC2061b;
        } else if (viewFindViewById != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2);
            defaultTimeBar.setId(lcc0.f131308H);
            defaultTimeBar.setLayoutParams(viewFindViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.f9261n = defaultTimeBar;
        } else {
            this.f9261n = null;
        }
        this.f9259l = (TextView) findViewById(lcc0.f131334m);
        this.f9260m = (TextView) findViewById(lcc0.f131306F);
        InterfaceC2061b interfaceC2061b2 = this.f9261n;
        if (interfaceC2061b2 != null) {
            interfaceC2061b2.mo11868b(viewOnClickListenerC2033c);
        }
        View viewFindViewById2 = findViewById(lcc0.f131303C);
        this.f9251e = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(viewOnClickListenerC2033c);
        }
        View viewFindViewById3 = findViewById(lcc0.f131302B);
        this.f9252f = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(viewOnClickListenerC2033c);
        }
        View viewFindViewById4 = findViewById(lcc0.f131307G);
        this.f9249c = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(viewOnClickListenerC2033c);
        }
        View viewFindViewById5 = findViewById(lcc0.f131345x);
        this.f9250d = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(viewOnClickListenerC2033c);
        }
        View viewFindViewById6 = findViewById(lcc0.f131311K);
        this.f9254h = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(viewOnClickListenerC2033c);
        }
        View viewFindViewById7 = findViewById(lcc0.f131338q);
        this.f9253g = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(viewOnClickListenerC2033c);
        }
        ImageView imageView = (ImageView) findViewById(lcc0.f131310J);
        this.f9255i = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(viewOnClickListenerC2033c);
        }
        ImageView imageView2 = (ImageView) findViewById(lcc0.f131314N);
        this.f9256j = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(viewOnClickListenerC2033c);
        }
        View viewFindViewById8 = findViewById(lcc0.f131321U);
        this.f9257k = viewFindViewById8;
        setShowVrButton(false);
        m11921L(false, false, viewFindViewById8);
        Resources resources = context.getResources();
        this.f9224C = resources.getInteger(ydc0.f198591b) / 100.0f;
        this.f9225D = resources.getInteger(ydc0.f198590a) / 100.0f;
        this.f9269u = bmk0.m105109W(context, resources, zbc0.f203641b);
        this.f9270v = bmk0.m105109W(context, resources, zbc0.f203642c);
        this.f9271w = bmk0.m105109W(context, resources, zbc0.f203640a);
        this.f9222A = bmk0.m105109W(context, resources, zbc0.f203644e);
        this.f9223B = bmk0.m105109W(context, resources, zbc0.f203643d);
        this.f9272x = resources.getString(R$string.f9317j);
        this.f9273y = resources.getString(R$string.f9318k);
        this.f9274z = resources.getString(R$string.f9316i);
        this.f9226E = resources.getString(R$string.f9321n);
        this.f9228F = resources.getString(R$string.f9320m);
        this.f9227E0 = -9223372036854775807L;
        this.f9229F0 = -9223372036854775807L;
    }

    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: C */
    public static boolean m11886C(int i) {
        return i == 90 || i == 89 || i == 85 || i == 79 || i == 126 || i == 127 || i == 87 || i == 88;
    }

    /* JADX INFO: renamed from: x */
    public static boolean m11909x(AbstractC1857c0 abstractC1857c0, AbstractC1857c0.d dVar) {
        if (abstractC1857c0.mo9775t() > 100) {
            return false;
        }
        int iMo9775t = abstractC1857c0.mo9775t();
        for (int i = 0; i < iMo9775t; i++) {
            if (abstractC1857c0.m9774r(i, dVar).f7378n == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: z */
    public static int m11910z(TypedArray typedArray, int i) {
        return typedArray.getInt(ygc0.f199812t, i);
    }

    /* JADX INFO: renamed from: A */
    public void m11911A() {
        if (m11913D()) {
            setVisibility(8);
            Iterator<InterfaceC2035e> it = this.f9248b.iterator();
            while (it.hasNext()) {
                it.next().mo11934u(getVisibility());
            }
            removeCallbacks(this.f9267s);
            removeCallbacks(this.f9268t);
            this.f9243T = -9223372036854775807L;
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m11912B() {
        removeCallbacks(this.f9268t);
        if (this.f9235L <= 0) {
            this.f9243T = -9223372036854775807L;
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        int i = this.f9235L;
        this.f9243T = jUptimeMillis + ((long) i);
        if (this.f9231H) {
            postDelayed(this.f9268t, i);
        }
    }

    /* JADX INFO: renamed from: D */
    public boolean m11913D() {
        return getVisibility() == 0;
    }

    /* JADX INFO: renamed from: E */
    public void m11914E(InterfaceC2035e interfaceC2035e) {
        this.f9248b.remove(interfaceC2035e);
    }

    /* JADX INFO: renamed from: F */
    public final void m11915F() {
        View view;
        View view2;
        boolean zM105116Z0 = bmk0.m105116Z0(this.f9230G);
        if (zM105116Z0 && (view2 = this.f9251e) != null) {
            view2.sendAccessibilityEvent(8);
        } else {
            if (zM105116Z0 || (view = this.f9252f) == null) {
                return;
            }
            view.sendAccessibilityEvent(8);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m11916G() {
        View view;
        View view2;
        boolean zM105116Z0 = bmk0.m105116Z0(this.f9230G);
        if (zM105116Z0 && (view2 = this.f9251e) != null) {
            view2.requestFocus();
        } else {
            if (zM105116Z0 || (view = this.f9252f) == null) {
                return;
            }
            view.requestFocus();
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m11917H(InterfaceC2026t interfaceC2026t, int i, long j) {
        interfaceC2026t.seekTo(i, j);
    }

    /* JADX INFO: renamed from: I */
    public final void m11918I(InterfaceC2026t interfaceC2026t, long j) {
        int currentMediaItemIndex;
        AbstractC1857c0 currentTimeline = interfaceC2026t.getCurrentTimeline();
        if (this.f9233J && !currentTimeline.m9776u()) {
            int iMo9775t = currentTimeline.mo9775t();
            currentMediaItemIndex = 0;
            while (true) {
                long jM9806f = currentTimeline.m9774r(currentMediaItemIndex, this.f9266r).m9806f();
                if (j < jM9806f) {
                    break;
                }
                if (currentMediaItemIndex == iMo9775t - 1) {
                    j = jM9806f;
                    break;
                } else {
                    j -= jM9806f;
                    currentMediaItemIndex++;
                }
            }
        } else {
            currentMediaItemIndex = interfaceC2026t.getCurrentMediaItemIndex();
        }
        m11917H(interfaceC2026t, currentMediaItemIndex, j);
        m11924O();
    }

    /* JADX INFO: renamed from: J */
    public void m11919J() {
        if (!m11913D()) {
            setVisibility(0);
            Iterator<InterfaceC2035e> it = this.f9248b.iterator();
            while (it.hasNext()) {
                it.next().mo11934u(getVisibility());
            }
            m11920K();
            m11916G();
            m11915F();
        }
        m11912B();
    }

    /* JADX INFO: renamed from: K */
    public final void m11920K() {
        m11923N();
        m11922M();
        m11925P();
        m11926Q();
        m11927R();
    }

    /* JADX INFO: renamed from: L */
    public final void m11921L(boolean z, boolean z2, @Nullable View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z2);
        view.setAlpha(z2 ? this.f9224C : this.f9225D);
        view.setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: renamed from: M */
    public final void m11922M() {
        boolean zIsCommandAvailable;
        boolean zIsCommandAvailable2;
        boolean zIsCommandAvailable3;
        boolean zIsCommandAvailable4;
        boolean zIsCommandAvailable5;
        if (m11913D() && this.f9231H) {
            InterfaceC2026t interfaceC2026t = this.f9230G;
            if (interfaceC2026t != null) {
                zIsCommandAvailable = interfaceC2026t.isCommandAvailable(5);
                zIsCommandAvailable3 = interfaceC2026t.isCommandAvailable(7);
                zIsCommandAvailable4 = interfaceC2026t.isCommandAvailable(11);
                zIsCommandAvailable5 = interfaceC2026t.isCommandAvailable(12);
                zIsCommandAvailable2 = interfaceC2026t.isCommandAvailable(9);
            } else {
                zIsCommandAvailable = false;
                zIsCommandAvailable2 = false;
                zIsCommandAvailable3 = false;
                zIsCommandAvailable4 = false;
                zIsCommandAvailable5 = false;
            }
            m11921L(this.f9240Q, zIsCommandAvailable3, this.f9249c);
            m11921L(this.f9238O, zIsCommandAvailable4, this.f9254h);
            m11921L(this.f9239P, zIsCommandAvailable5, this.f9253g);
            m11921L(this.f9241R, zIsCommandAvailable2, this.f9250d);
            InterfaceC2061b interfaceC2061b = this.f9261n;
            if (interfaceC2061b != null) {
                interfaceC2061b.setEnabled(zIsCommandAvailable);
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m11923N() {
        boolean z;
        boolean z2;
        if (m11913D() && this.f9231H) {
            boolean zM105116Z0 = bmk0.m105116Z0(this.f9230G);
            View view = this.f9251e;
            boolean z3 = true;
            if (view != null) {
                z = !zM105116Z0 && view.isFocused();
                if (bmk0.f77313a < 21) {
                    z2 = z;
                } else {
                    z2 = !zM105116Z0 && C2032b.m11930a(this.f9251e);
                }
                this.f9251e.setVisibility(zM105116Z0 ? 0 : 8);
            } else {
                z = false;
                z2 = false;
            }
            View view2 = this.f9252f;
            if (view2 != null) {
                z |= zM105116Z0 && view2.isFocused();
                if (bmk0.f77313a < 21) {
                    z3 = z;
                } else if (!zM105116Z0 || !C2032b.m11930a(this.f9252f)) {
                    z3 = false;
                }
                z2 |= z3;
                this.f9252f.setVisibility(zM105116Z0 ? 8 : 0);
            }
            if (z) {
                m11916G();
            }
            if (z2) {
                m11915F();
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m11924O() {
        long contentPosition;
        long contentBufferedPosition;
        if (m11913D() && this.f9231H) {
            InterfaceC2026t interfaceC2026t = this.f9230G;
            if (interfaceC2026t != null) {
                contentPosition = this.f9264p0 + interfaceC2026t.getContentPosition();
                contentBufferedPosition = this.f9264p0 + interfaceC2026t.getContentBufferedPosition();
            } else {
                contentPosition = 0;
                contentBufferedPosition = 0;
            }
            boolean z = contentPosition != this.f9227E0;
            this.f9227E0 = contentPosition;
            this.f9229F0 = contentBufferedPosition;
            TextView textView = this.f9260m;
            if (textView != null && !this.f9234K && z) {
                textView.setText(bmk0.m105148k0(this.f9262o, this.f9263p, contentPosition));
            }
            InterfaceC2061b interfaceC2061b = this.f9261n;
            if (interfaceC2061b != null) {
                interfaceC2061b.setPosition(contentPosition);
                this.f9261n.setBufferedPosition(contentBufferedPosition);
            }
            removeCallbacks(this.f9267s);
            int playbackState = interfaceC2026t == null ? 1 : interfaceC2026t.getPlaybackState();
            if (interfaceC2026t == null || !interfaceC2026t.isPlaying()) {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(this.f9267s, 1000L);
                return;
            }
            InterfaceC2061b interfaceC2061b2 = this.f9261n;
            long jMin = Math.min(interfaceC2061b2 != null ? interfaceC2061b2.getPreferredUpdateDelay() : 1000L, 1000 - (contentPosition % 1000));
            float f = interfaceC2026t.getPlaybackParameters().f8288a;
            postDelayed(this.f9267s, bmk0.m105164r(f > 0.0f ? (long) (jMin / f) : 1000L, this.f9236M, 1000L));
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m11925P() {
        ImageView imageView;
        if (m11913D() && this.f9231H && (imageView = this.f9255i) != null) {
            if (this.f9237N == 0) {
                m11921L(false, false, imageView);
                return;
            }
            InterfaceC2026t interfaceC2026t = this.f9230G;
            if (interfaceC2026t == null) {
                m11921L(true, false, imageView);
                this.f9255i.setImageDrawable(this.f9269u);
                this.f9255i.setContentDescription(this.f9272x);
                return;
            }
            m11921L(true, true, imageView);
            int repeatMode = interfaceC2026t.getRepeatMode();
            if (repeatMode == 0) {
                this.f9255i.setImageDrawable(this.f9269u);
                this.f9255i.setContentDescription(this.f9272x);
            } else if (repeatMode == 1) {
                this.f9255i.setImageDrawable(this.f9270v);
                this.f9255i.setContentDescription(this.f9273y);
            } else if (repeatMode == 2) {
                this.f9255i.setImageDrawable(this.f9271w);
                this.f9255i.setContentDescription(this.f9274z);
            }
            this.f9255i.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m11926Q() {
        ImageView imageView;
        if (m11913D() && this.f9231H && (imageView = this.f9256j) != null) {
            InterfaceC2026t interfaceC2026t = this.f9230G;
            if (!this.f9242S) {
                m11921L(false, false, imageView);
                return;
            }
            if (interfaceC2026t == null) {
                m11921L(true, false, imageView);
                this.f9256j.setImageDrawable(this.f9223B);
                this.f9256j.setContentDescription(this.f9228F);
            } else {
                m11921L(true, true, imageView);
                this.f9256j.setImageDrawable(interfaceC2026t.getShuffleModeEnabled() ? this.f9222A : this.f9223B);
                this.f9256j.setContentDescription(interfaceC2026t.getShuffleModeEnabled() ? this.f9226E : this.f9228F);
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m11927R() {
        int i;
        AbstractC1857c0.d dVar;
        long j;
        InterfaceC2026t interfaceC2026t = this.f9230G;
        if (interfaceC2026t == null) {
            return;
        }
        boolean z = true;
        this.f9233J = this.f9232I && m11909x(interfaceC2026t.getCurrentTimeline(), this.f9266r);
        long j2 = 0;
        this.f9264p0 = 0L;
        AbstractC1857c0 currentTimeline = interfaceC2026t.getCurrentTimeline();
        if (currentTimeline.m9776u()) {
            i = 0;
        } else {
            int currentMediaItemIndex = interfaceC2026t.getCurrentMediaItemIndex();
            boolean z2 = this.f9233J;
            int i2 = z2 ? 0 : currentMediaItemIndex;
            int iMo9775t = z2 ? currentTimeline.mo9775t() - 1 : currentMediaItemIndex;
            i = 0;
            long j3 = 0;
            while (i2 <= iMo9775t) {
                if (i2 == currentMediaItemIndex) {
                    this.f9264p0 = bmk0.m105152l1(j3);
                }
                currentTimeline.m9774r(i2, this.f9266r);
                AbstractC1857c0.d dVar2 = this.f9266r;
                if (dVar2.f7378n == -9223372036854775807L) {
                    w11.m204371g(this.f9233J ^ z);
                    break;
                }
                int i3 = dVar2.f7379o;
                while (true) {
                    dVar = this.f9266r;
                    if (i3 <= dVar.f7380p) {
                        currentTimeline.m9770j(i3, this.f9265q);
                        int iM9795r = this.f9265q.m9795r();
                        int iM9783f = this.f9265q.m9783f();
                        while (iM9795r < iM9783f) {
                            long jM9786i = this.f9265q.m9786i(iM9795r);
                            if (jM9786i == Long.MIN_VALUE) {
                                j = j2;
                                long j4 = this.f9265q.f7340d;
                                if (j4 != -9223372036854775807L) {
                                    jM9786i = j4;
                                }
                                iM9795r++;
                                j2 = j;
                            } else {
                                j = j2;
                            }
                            long jM9794q = jM9786i + this.f9265q.m9794q();
                            if (jM9794q >= j) {
                                long[] jArr = this.f9244U;
                                if (i == jArr.length) {
                                    int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                    this.f9244U = Arrays.copyOf(jArr, length);
                                    this.f9245V = Arrays.copyOf(this.f9245V, length);
                                }
                                this.f9244U[i] = bmk0.m105152l1(j3 + jM9794q);
                                this.f9245V[i] = this.f9265q.m9796s(iM9795r);
                                i++;
                            }
                            iM9795r++;
                            j2 = j;
                        }
                        i3++;
                    }
                }
                j3 += dVar.f7378n;
                i2++;
                j2 = j2;
                z = true;
            }
            j2 = j3;
        }
        long jM105152l1 = bmk0.m105152l1(j2);
        TextView textView = this.f9259l;
        if (textView != null) {
            textView.setText(bmk0.m105148k0(this.f9262o, this.f9263p, jM105152l1));
        }
        InterfaceC2061b interfaceC2061b = this.f9261n;
        if (interfaceC2061b != null) {
            interfaceC2061b.setDuration(jM105152l1);
            int length2 = this.f9246W.length;
            int i4 = i + length2;
            long[] jArr2 = this.f9244U;
            if (i4 > jArr2.length) {
                this.f9244U = Arrays.copyOf(jArr2, i4);
                this.f9245V = Arrays.copyOf(this.f9245V, i4);
            }
            System.arraycopy(this.f9246W, 0, this.f9244U, i, length2);
            System.arraycopy(this.f9258k0, 0, this.f9245V, i, length2);
            this.f9261n.mo11867a(this.f9244U, this.f9245V, i4);
        }
        m11924O();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return m11929y(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f9268t);
        } else if (motionEvent.getAction() == 1) {
            m11912B();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    public InterfaceC2026t getPlayer() {
        return this.f9230G;
    }

    public int getRepeatToggleModes() {
        return this.f9237N;
    }

    public boolean getShowShuffleButton() {
        return this.f9242S;
    }

    public int getShowTimeoutMs() {
        return this.f9235L;
    }

    public boolean getShowVrButton() {
        View view = this.f9257k;
        return view != null && view.getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9231H = true;
        long j = this.f9243T;
        if (j != -9223372036854775807L) {
            long jUptimeMillis = j - SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                m11911A();
            } else {
                postDelayed(this.f9268t, jUptimeMillis);
            }
        } else if (m11913D()) {
            m11912B();
        }
        m11920K();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f9231H = false;
        removeCallbacks(this.f9267s);
        removeCallbacks(this.f9268t);
    }

    public void setPlayer(@Nullable InterfaceC2026t interfaceC2026t) {
        w11.m204371g(Looper.myLooper() == Looper.getMainLooper());
        w11.m204365a(interfaceC2026t == null || interfaceC2026t.getApplicationLooper() == Looper.getMainLooper());
        InterfaceC2026t interfaceC2026t2 = this.f9230G;
        if (interfaceC2026t2 == interfaceC2026t) {
            return;
        }
        if (interfaceC2026t2 != null) {
            interfaceC2026t2.removeListener(this.f9247a);
        }
        this.f9230G = interfaceC2026t;
        if (interfaceC2026t != null) {
            interfaceC2026t.addListener(this.f9247a);
        }
        m11920K();
    }

    public void setProgressUpdateListener(@Nullable InterfaceC2034d interfaceC2034d) {
    }

    public void setRepeatToggleModes(int i) {
        this.f9237N = i;
        InterfaceC2026t interfaceC2026t = this.f9230G;
        if (interfaceC2026t != null) {
            int repeatMode = interfaceC2026t.getRepeatMode();
            if (i == 0 && repeatMode != 0) {
                this.f9230G.setRepeatMode(0);
            } else if (i == 1 && repeatMode == 2) {
                this.f9230G.setRepeatMode(1);
            } else if (i == 2 && repeatMode == 1) {
                this.f9230G.setRepeatMode(2);
            }
        }
        m11925P();
    }

    public void setShowFastForwardButton(boolean z) {
        this.f9239P = z;
        m11922M();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.f9232I = z;
        m11927R();
    }

    public void setShowNextButton(boolean z) {
        this.f9241R = z;
        m11922M();
    }

    public void setShowPreviousButton(boolean z) {
        this.f9240Q = z;
        m11922M();
    }

    public void setShowRewindButton(boolean z) {
        this.f9238O = z;
        m11922M();
    }

    public void setShowShuffleButton(boolean z) {
        this.f9242S = z;
        m11926Q();
    }

    public void setShowTimeoutMs(int i) {
        this.f9235L = i;
        if (m11913D()) {
            m11912B();
        }
    }

    public void setShowVrButton(boolean z) {
        View view = this.f9257k;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.f9236M = bmk0.m105162q(i, 16, 1000);
    }

    public void setVrButtonListener(@Nullable View.OnClickListener onClickListener) {
        View view = this.f9257k;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            m11921L(getShowVrButton(), onClickListener != null, this.f9257k);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m11928w(InterfaceC2035e interfaceC2035e) {
        w11.m204369e(interfaceC2035e);
        this.f9248b.add(interfaceC2035e);
    }

    /* JADX INFO: renamed from: y */
    public boolean m11929y(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        InterfaceC2026t interfaceC2026t = this.f9230G;
        if (interfaceC2026t == null || !m11886C(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (interfaceC2026t.getPlaybackState() == 4) {
                return true;
            }
            interfaceC2026t.seekForward();
            return true;
        }
        if (keyCode == 89) {
            interfaceC2026t.seekBack();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            bmk0.m105171u0(interfaceC2026t);
            return true;
        }
        if (keyCode == 87) {
            interfaceC2026t.seekToNext();
            return true;
        }
        if (keyCode == 88) {
            interfaceC2026t.seekToPrevious();
            return true;
        }
        if (keyCode == 126) {
            bmk0.m105169t0(interfaceC2026t);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        bmk0.m105167s0(interfaceC2026t);
        return true;
    }

    public PlayerControlView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerControlView(Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public PlayerControlView(Context context) {
        this(context, null);
    }
}
