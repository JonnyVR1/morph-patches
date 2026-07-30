package com.google.android.exoplayer2.p030ui;

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
import com.google.android.exoplayer2.AbstractC1834c0;
import com.google.android.exoplayer2.InterfaceC2003t;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import p149l.bsc0;
import p149l.d7c0;
import p149l.f4c0;
import p149l.n8f;
import p149l.p11;
import p149l.t3c0;
import p149l.t5c0;
import p149l.t8c0;
import p149l.vck0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class PlayerControlView extends FrameLayout {

    /* JADX INFO: renamed from: A */
    public final Drawable f9185A;

    /* JADX INFO: renamed from: B */
    public final Drawable f9186B;

    /* JADX INFO: renamed from: C */
    public final float f9187C;

    /* JADX INFO: renamed from: D */
    public final float f9188D;

    /* JADX INFO: renamed from: E */
    public final String f9189E;

    /* JADX INFO: renamed from: E0 */
    public long f9190E0;

    /* JADX INFO: renamed from: F */
    public final String f9191F;

    /* JADX INFO: renamed from: F0 */
    public long f9192F0;

    /* JADX INFO: renamed from: G */
    @Nullable
    public InterfaceC2003t f9193G;

    /* JADX INFO: renamed from: H */
    public boolean f9194H;

    /* JADX INFO: renamed from: I */
    public boolean f9195I;

    /* JADX INFO: renamed from: J */
    public boolean f9196J;

    /* JADX INFO: renamed from: K */
    public boolean f9197K;

    /* JADX INFO: renamed from: L */
    public int f9198L;

    /* JADX INFO: renamed from: M */
    public int f9199M;

    /* JADX INFO: renamed from: N */
    public int f9200N;

    /* JADX INFO: renamed from: O */
    public boolean f9201O;

    /* JADX INFO: renamed from: P */
    public boolean f9202P;

    /* JADX INFO: renamed from: Q */
    public boolean f9203Q;

    /* JADX INFO: renamed from: R */
    public boolean f9204R;

    /* JADX INFO: renamed from: S */
    public boolean f9205S;

    /* JADX INFO: renamed from: T */
    public long f9206T;

    /* JADX INFO: renamed from: U */
    public long[] f9207U;

    /* JADX INFO: renamed from: V */
    public boolean[] f9208V;

    /* JADX INFO: renamed from: W */
    public long[] f9209W;

    /* JADX INFO: renamed from: a */
    public final ViewOnClickListenerC2010c f9210a;

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList<InterfaceC2012e> f9211b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final View f9212c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final View f9213d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final View f9214e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final View f9215f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public final View f9216g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final View f9217h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final ImageView f9218i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final ImageView f9219j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final View f9220k;

    /* JADX INFO: renamed from: k0 */
    public boolean[] f9221k0;

    /* JADX INFO: renamed from: l */
    @Nullable
    public final TextView f9222l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public final TextView f9223m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public final InterfaceC2038b f9224n;

    /* JADX INFO: renamed from: o */
    public final StringBuilder f9225o;

    /* JADX INFO: renamed from: p */
    public final Formatter f9226p;

    /* JADX INFO: renamed from: p0 */
    public long f9227p0;

    /* JADX INFO: renamed from: q */
    public final AbstractC1834c0.b f9228q;

    /* JADX INFO: renamed from: r */
    public final AbstractC1834c0.d f9229r;

    /* JADX INFO: renamed from: s */
    public final Runnable f9230s;

    /* JADX INFO: renamed from: t */
    public final Runnable f9231t;

    /* JADX INFO: renamed from: u */
    public final Drawable f9232u;

    /* JADX INFO: renamed from: v */
    public final Drawable f9233v;

    /* JADX INFO: renamed from: w */
    public final Drawable f9234w;

    /* JADX INFO: renamed from: x */
    public final String f9235x;

    /* JADX INFO: renamed from: y */
    public final String f9236y;

    /* JADX INFO: renamed from: z */
    public final String f9237z;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.PlayerControlView$b */
    @RequiresApi(21)
    public static final class C2009b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static boolean m11876a(View view) {
            return view.isAccessibilityFocused();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.PlayerControlView$c */
    public final class ViewOnClickListenerC2010c implements InterfaceC2003t.d, InterfaceC2038b.a, View.OnClickListener {
        public ViewOnClickListenerC2010c() {
        }

        @Override // com.google.android.exoplayer2.p030ui.InterfaceC2038b.a
        /* JADX INFO: renamed from: L */
        public void mo11877L(InterfaceC2038b interfaceC2038b, long j) {
            if (PlayerControlView.this.f9223m != null) {
                PlayerControlView.this.f9223m.setText(vck0.m197870k0(PlayerControlView.this.f9225o, PlayerControlView.this.f9226p, j));
            }
        }

        @Override // com.google.android.exoplayer2.p030ui.InterfaceC2038b.a
        /* JADX INFO: renamed from: N */
        public void mo11878N(InterfaceC2038b interfaceC2038b, long j) {
            PlayerControlView.this.f9197K = true;
            if (PlayerControlView.this.f9223m != null) {
                PlayerControlView.this.f9223m.setText(vck0.m197870k0(PlayerControlView.this.f9225o, PlayerControlView.this.f9226p, j));
            }
        }

        @Override // com.google.android.exoplayer2.InterfaceC2003t.d
        /* JADX INFO: renamed from: l0 */
        public void mo11777l0(InterfaceC2003t interfaceC2003t, InterfaceC2003t.c cVar) {
            if (cVar.m11752b(4, 5)) {
                PlayerControlView.this.m11869N();
            }
            if (cVar.m11752b(4, 5, 7)) {
                PlayerControlView.this.m11870O();
            }
            if (cVar.m11751a(8)) {
                PlayerControlView.this.m11871P();
            }
            if (cVar.m11751a(9)) {
                PlayerControlView.this.m11872Q();
            }
            if (cVar.m11752b(8, 9, 11, 0, 13)) {
                PlayerControlView.this.m11868M();
            }
            if (cVar.m11752b(11, 0)) {
                PlayerControlView.this.m11873R();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            InterfaceC2003t interfaceC2003t = PlayerControlView.this.f9193G;
            if (interfaceC2003t == null) {
                return;
            }
            if (PlayerControlView.this.f9213d == view) {
                interfaceC2003t.seekToNext();
                return;
            }
            if (PlayerControlView.this.f9212c == view) {
                interfaceC2003t.seekToPrevious();
                return;
            }
            if (PlayerControlView.this.f9216g == view) {
                if (interfaceC2003t.getPlaybackState() != 4) {
                    interfaceC2003t.seekForward();
                    return;
                }
                return;
            }
            if (PlayerControlView.this.f9217h == view) {
                interfaceC2003t.seekBack();
                return;
            }
            if (PlayerControlView.this.f9214e == view) {
                vck0.m197891t0(interfaceC2003t);
                return;
            }
            if (PlayerControlView.this.f9215f == view) {
                vck0.m197889s0(interfaceC2003t);
            } else if (PlayerControlView.this.f9218i == view) {
                interfaceC2003t.setRepeatMode(bsc0.m103672a(interfaceC2003t.getRepeatMode(), PlayerControlView.this.f9200N));
            } else if (PlayerControlView.this.f9219j == view) {
                interfaceC2003t.setShuffleModeEnabled(!interfaceC2003t.getShuffleModeEnabled());
            }
        }

        @Override // com.google.android.exoplayer2.p030ui.InterfaceC2038b.a
        /* JADX INFO: renamed from: u */
        public void mo11879u(InterfaceC2038b interfaceC2038b, long j, boolean z) {
            PlayerControlView.this.f9197K = false;
            if (z || PlayerControlView.this.f9193G == null) {
                return;
            }
            PlayerControlView playerControlView = PlayerControlView.this;
            playerControlView.m11864I(playerControlView.f9193G, j);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.PlayerControlView$d */
    public interface InterfaceC2011d {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.PlayerControlView$e */
    public interface InterfaceC2012e {
        /* JADX INFO: renamed from: u */
        void mo11880u(int i);
    }

    static {
        n8f.m158492a("goog.exo.ui");
    }

    public PlayerControlView(Context context, @Nullable AttributeSet attributeSet, int i, @Nullable AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        int resourceId = d7c0.f84727b;
        this.f9198L = 5000;
        this.f9200N = 0;
        this.f9199M = 200;
        this.f9206T = -9223372036854775807L;
        this.f9201O = true;
        this.f9202P = true;
        this.f9203Q = true;
        this.f9204R = true;
        this.f9205S = false;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, t8c0.f168879r, i, 0);
            try {
                this.f9198L = typedArrayObtainStyledAttributes.getInt(t8c0.f168887z, this.f9198L);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(t8c0.f168880s, resourceId);
                this.f9200N = m11856z(typedArrayObtainStyledAttributes, this.f9200N);
                this.f9201O = typedArrayObtainStyledAttributes.getBoolean(t8c0.f168885x, this.f9201O);
                this.f9202P = typedArrayObtainStyledAttributes.getBoolean(t8c0.f168882u, this.f9202P);
                this.f9203Q = typedArrayObtainStyledAttributes.getBoolean(t8c0.f168884w, this.f9203Q);
                this.f9204R = typedArrayObtainStyledAttributes.getBoolean(t8c0.f168883v, this.f9204R);
                this.f9205S = typedArrayObtainStyledAttributes.getBoolean(t8c0.f168886y, this.f9205S);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(t8c0.f168819A, this.f9199M));
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f9211b = new CopyOnWriteArrayList<>();
        this.f9228q = new AbstractC1834c0.b();
        this.f9229r = new AbstractC1834c0.d();
        StringBuilder sb = new StringBuilder();
        this.f9225o = sb;
        this.f9226p = new Formatter(sb, Locale.getDefault());
        this.f9207U = new long[0];
        this.f9208V = new boolean[0];
        this.f9209W = new long[0];
        this.f9221k0 = new boolean[0];
        ViewOnClickListenerC2010c viewOnClickListenerC2010c = new ViewOnClickListenerC2010c();
        this.f9210a = viewOnClickListenerC2010c;
        this.f9230s = new Runnable() { // from class: l.t680
            @Override // java.lang.Runnable
            public final void run() {
                this.f167936a.m11870O();
            }
        };
        this.f9231t = new Runnable() { // from class: l.u680
            @Override // java.lang.Runnable
            public final void run() {
                this.f174817a.m11857A();
            }
        };
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        InterfaceC2038b interfaceC2038b = (InterfaceC2038b) findViewById(f4c0.f94763H);
        View viewFindViewById = findViewById(f4c0.f94764I);
        if (interfaceC2038b != null) {
            this.f9224n = interfaceC2038b;
        } else if (viewFindViewById != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2);
            defaultTimeBar.setId(f4c0.f94763H);
            defaultTimeBar.setLayoutParams(viewFindViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.f9224n = defaultTimeBar;
        } else {
            this.f9224n = null;
        }
        this.f9222l = (TextView) findViewById(f4c0.f94789m);
        this.f9223m = (TextView) findViewById(f4c0.f94761F);
        InterfaceC2038b interfaceC2038b2 = this.f9224n;
        if (interfaceC2038b2 != null) {
            interfaceC2038b2.mo11814b(viewOnClickListenerC2010c);
        }
        View viewFindViewById2 = findViewById(f4c0.f94758C);
        this.f9214e = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(viewOnClickListenerC2010c);
        }
        View viewFindViewById3 = findViewById(f4c0.f94757B);
        this.f9215f = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(viewOnClickListenerC2010c);
        }
        View viewFindViewById4 = findViewById(f4c0.f94762G);
        this.f9212c = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(viewOnClickListenerC2010c);
        }
        View viewFindViewById5 = findViewById(f4c0.f94800x);
        this.f9213d = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(viewOnClickListenerC2010c);
        }
        View viewFindViewById6 = findViewById(f4c0.f94766K);
        this.f9217h = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(viewOnClickListenerC2010c);
        }
        View viewFindViewById7 = findViewById(f4c0.f94793q);
        this.f9216g = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(viewOnClickListenerC2010c);
        }
        ImageView imageView = (ImageView) findViewById(f4c0.f94765J);
        this.f9218i = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(viewOnClickListenerC2010c);
        }
        ImageView imageView2 = (ImageView) findViewById(f4c0.f94769N);
        this.f9219j = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(viewOnClickListenerC2010c);
        }
        View viewFindViewById8 = findViewById(f4c0.f94776U);
        this.f9220k = viewFindViewById8;
        setShowVrButton(false);
        m11867L(false, false, viewFindViewById8);
        Resources resources = context.getResources();
        this.f9187C = resources.getInteger(t5c0.f167816b) / 100.0f;
        this.f9188D = resources.getInteger(t5c0.f167815a) / 100.0f;
        this.f9232u = vck0.m197831W(context, resources, t3c0.f167611b);
        this.f9233v = vck0.m197831W(context, resources, t3c0.f167612c);
        this.f9234w = vck0.m197831W(context, resources, t3c0.f167610a);
        this.f9185A = vck0.m197831W(context, resources, t3c0.f167614e);
        this.f9186B = vck0.m197831W(context, resources, t3c0.f167613d);
        this.f9235x = resources.getString(R$string.f9280j);
        this.f9236y = resources.getString(R$string.f9281k);
        this.f9237z = resources.getString(R$string.f9279i);
        this.f9189E = resources.getString(R$string.f9284n);
        this.f9191F = resources.getString(R$string.f9283m);
        this.f9190E0 = -9223372036854775807L;
        this.f9192F0 = -9223372036854775807L;
    }

    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: C */
    public static boolean m11832C(int i) {
        return i == 90 || i == 89 || i == 85 || i == 79 || i == 126 || i == 127 || i == 87 || i == 88;
    }

    /* JADX INFO: renamed from: x */
    public static boolean m11855x(AbstractC1834c0 abstractC1834c0, AbstractC1834c0.d dVar) {
        if (abstractC1834c0.mo9721t() > 100) {
            return false;
        }
        int iMo9721t = abstractC1834c0.mo9721t();
        for (int i = 0; i < iMo9721t; i++) {
            if (abstractC1834c0.m9720r(i, dVar).f7341n == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: z */
    public static int m11856z(TypedArray typedArray, int i) {
        return typedArray.getInt(t8c0.f168881t, i);
    }

    /* JADX INFO: renamed from: A */
    public void m11857A() {
        if (m11859D()) {
            setVisibility(8);
            Iterator<InterfaceC2012e> it = this.f9211b.iterator();
            while (it.hasNext()) {
                it.next().mo11880u(getVisibility());
            }
            removeCallbacks(this.f9230s);
            removeCallbacks(this.f9231t);
            this.f9206T = -9223372036854775807L;
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m11858B() {
        removeCallbacks(this.f9231t);
        if (this.f9198L <= 0) {
            this.f9206T = -9223372036854775807L;
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        int i = this.f9198L;
        this.f9206T = jUptimeMillis + ((long) i);
        if (this.f9194H) {
            postDelayed(this.f9231t, i);
        }
    }

    /* JADX INFO: renamed from: D */
    public boolean m11859D() {
        return getVisibility() == 0;
    }

    /* JADX INFO: renamed from: E */
    public void m11860E(InterfaceC2012e interfaceC2012e) {
        this.f9211b.remove(interfaceC2012e);
    }

    /* JADX INFO: renamed from: F */
    public final void m11861F() {
        View view;
        View view2;
        boolean zM197838Z0 = vck0.m197838Z0(this.f9193G);
        if (zM197838Z0 && (view2 = this.f9214e) != null) {
            view2.sendAccessibilityEvent(8);
        } else {
            if (zM197838Z0 || (view = this.f9215f) == null) {
                return;
            }
            view.sendAccessibilityEvent(8);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m11862G() {
        View view;
        View view2;
        boolean zM197838Z0 = vck0.m197838Z0(this.f9193G);
        if (zM197838Z0 && (view2 = this.f9214e) != null) {
            view2.requestFocus();
        } else {
            if (zM197838Z0 || (view = this.f9215f) == null) {
                return;
            }
            view.requestFocus();
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m11863H(InterfaceC2003t interfaceC2003t, int i, long j) {
        interfaceC2003t.seekTo(i, j);
    }

    /* JADX INFO: renamed from: I */
    public final void m11864I(InterfaceC2003t interfaceC2003t, long j) {
        int currentMediaItemIndex;
        AbstractC1834c0 currentTimeline = interfaceC2003t.getCurrentTimeline();
        if (this.f9196J && !currentTimeline.m9722u()) {
            int iMo9721t = currentTimeline.mo9721t();
            currentMediaItemIndex = 0;
            while (true) {
                long jM9752f = currentTimeline.m9720r(currentMediaItemIndex, this.f9229r).m9752f();
                if (j < jM9752f) {
                    break;
                }
                if (currentMediaItemIndex == iMo9721t - 1) {
                    j = jM9752f;
                    break;
                } else {
                    j -= jM9752f;
                    currentMediaItemIndex++;
                }
            }
        } else {
            currentMediaItemIndex = interfaceC2003t.getCurrentMediaItemIndex();
        }
        m11863H(interfaceC2003t, currentMediaItemIndex, j);
        m11870O();
    }

    /* JADX INFO: renamed from: J */
    public void m11865J() {
        if (!m11859D()) {
            setVisibility(0);
            Iterator<InterfaceC2012e> it = this.f9211b.iterator();
            while (it.hasNext()) {
                it.next().mo11880u(getVisibility());
            }
            m11866K();
            m11862G();
            m11861F();
        }
        m11858B();
    }

    /* JADX INFO: renamed from: K */
    public final void m11866K() {
        m11869N();
        m11868M();
        m11871P();
        m11872Q();
        m11873R();
    }

    /* JADX INFO: renamed from: L */
    public final void m11867L(boolean z, boolean z2, @Nullable View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z2);
        view.setAlpha(z2 ? this.f9187C : this.f9188D);
        view.setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: renamed from: M */
    public final void m11868M() {
        boolean zIsCommandAvailable;
        boolean zIsCommandAvailable2;
        boolean zIsCommandAvailable3;
        boolean zIsCommandAvailable4;
        boolean zIsCommandAvailable5;
        if (m11859D() && this.f9194H) {
            InterfaceC2003t interfaceC2003t = this.f9193G;
            if (interfaceC2003t != null) {
                zIsCommandAvailable = interfaceC2003t.isCommandAvailable(5);
                zIsCommandAvailable3 = interfaceC2003t.isCommandAvailable(7);
                zIsCommandAvailable4 = interfaceC2003t.isCommandAvailable(11);
                zIsCommandAvailable5 = interfaceC2003t.isCommandAvailable(12);
                zIsCommandAvailable2 = interfaceC2003t.isCommandAvailable(9);
            } else {
                zIsCommandAvailable = false;
                zIsCommandAvailable2 = false;
                zIsCommandAvailable3 = false;
                zIsCommandAvailable4 = false;
                zIsCommandAvailable5 = false;
            }
            m11867L(this.f9203Q, zIsCommandAvailable3, this.f9212c);
            m11867L(this.f9201O, zIsCommandAvailable4, this.f9217h);
            m11867L(this.f9202P, zIsCommandAvailable5, this.f9216g);
            m11867L(this.f9204R, zIsCommandAvailable2, this.f9213d);
            InterfaceC2038b interfaceC2038b = this.f9224n;
            if (interfaceC2038b != null) {
                interfaceC2038b.setEnabled(zIsCommandAvailable);
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m11869N() {
        boolean z;
        boolean z2;
        if (m11859D() && this.f9194H) {
            boolean zM197838Z0 = vck0.m197838Z0(this.f9193G);
            View view = this.f9214e;
            boolean z3 = true;
            if (view != null) {
                z = !zM197838Z0 && view.isFocused();
                if (vck0.f180948a < 21) {
                    z2 = z;
                } else {
                    z2 = !zM197838Z0 && C2009b.m11876a(this.f9214e);
                }
                this.f9214e.setVisibility(zM197838Z0 ? 0 : 8);
            } else {
                z = false;
                z2 = false;
            }
            View view2 = this.f9215f;
            if (view2 != null) {
                z |= zM197838Z0 && view2.isFocused();
                if (vck0.f180948a < 21) {
                    z3 = z;
                } else if (!zM197838Z0 || !C2009b.m11876a(this.f9215f)) {
                    z3 = false;
                }
                z2 |= z3;
                this.f9215f.setVisibility(zM197838Z0 ? 8 : 0);
            }
            if (z) {
                m11862G();
            }
            if (z2) {
                m11861F();
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m11870O() {
        long contentPosition;
        long contentBufferedPosition;
        if (m11859D() && this.f9194H) {
            InterfaceC2003t interfaceC2003t = this.f9193G;
            if (interfaceC2003t != null) {
                contentPosition = this.f9227p0 + interfaceC2003t.getContentPosition();
                contentBufferedPosition = this.f9227p0 + interfaceC2003t.getContentBufferedPosition();
            } else {
                contentPosition = 0;
                contentBufferedPosition = 0;
            }
            boolean z = contentPosition != this.f9190E0;
            this.f9190E0 = contentPosition;
            this.f9192F0 = contentBufferedPosition;
            TextView textView = this.f9223m;
            if (textView != null && !this.f9197K && z) {
                textView.setText(vck0.m197870k0(this.f9225o, this.f9226p, contentPosition));
            }
            InterfaceC2038b interfaceC2038b = this.f9224n;
            if (interfaceC2038b != null) {
                interfaceC2038b.setPosition(contentPosition);
                this.f9224n.setBufferedPosition(contentBufferedPosition);
            }
            removeCallbacks(this.f9230s);
            int playbackState = interfaceC2003t == null ? 1 : interfaceC2003t.getPlaybackState();
            if (interfaceC2003t == null || !interfaceC2003t.isPlaying()) {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(this.f9230s, 1000L);
                return;
            }
            InterfaceC2038b interfaceC2038b2 = this.f9224n;
            long jMin = Math.min(interfaceC2038b2 != null ? interfaceC2038b2.getPreferredUpdateDelay() : 1000L, 1000 - (contentPosition % 1000));
            float f = interfaceC2003t.getPlaybackParameters().f8251a;
            postDelayed(this.f9230s, vck0.m197886r(f > 0.0f ? (long) (jMin / f) : 1000L, this.f9199M, 1000L));
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m11871P() {
        ImageView imageView;
        if (m11859D() && this.f9194H && (imageView = this.f9218i) != null) {
            if (this.f9200N == 0) {
                m11867L(false, false, imageView);
                return;
            }
            InterfaceC2003t interfaceC2003t = this.f9193G;
            if (interfaceC2003t == null) {
                m11867L(true, false, imageView);
                this.f9218i.setImageDrawable(this.f9232u);
                this.f9218i.setContentDescription(this.f9235x);
                return;
            }
            m11867L(true, true, imageView);
            int repeatMode = interfaceC2003t.getRepeatMode();
            if (repeatMode == 0) {
                this.f9218i.setImageDrawable(this.f9232u);
                this.f9218i.setContentDescription(this.f9235x);
            } else if (repeatMode == 1) {
                this.f9218i.setImageDrawable(this.f9233v);
                this.f9218i.setContentDescription(this.f9236y);
            } else if (repeatMode == 2) {
                this.f9218i.setImageDrawable(this.f9234w);
                this.f9218i.setContentDescription(this.f9237z);
            }
            this.f9218i.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m11872Q() {
        ImageView imageView;
        if (m11859D() && this.f9194H && (imageView = this.f9219j) != null) {
            InterfaceC2003t interfaceC2003t = this.f9193G;
            if (!this.f9205S) {
                m11867L(false, false, imageView);
                return;
            }
            if (interfaceC2003t == null) {
                m11867L(true, false, imageView);
                this.f9219j.setImageDrawable(this.f9186B);
                this.f9219j.setContentDescription(this.f9191F);
            } else {
                m11867L(true, true, imageView);
                this.f9219j.setImageDrawable(interfaceC2003t.getShuffleModeEnabled() ? this.f9185A : this.f9186B);
                this.f9219j.setContentDescription(interfaceC2003t.getShuffleModeEnabled() ? this.f9189E : this.f9191F);
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m11873R() {
        int i;
        AbstractC1834c0.d dVar;
        long j;
        InterfaceC2003t interfaceC2003t = this.f9193G;
        if (interfaceC2003t == null) {
            return;
        }
        boolean z = true;
        this.f9196J = this.f9195I && m11855x(interfaceC2003t.getCurrentTimeline(), this.f9229r);
        long j2 = 0;
        this.f9227p0 = 0L;
        AbstractC1834c0 currentTimeline = interfaceC2003t.getCurrentTimeline();
        if (currentTimeline.m9722u()) {
            i = 0;
        } else {
            int currentMediaItemIndex = interfaceC2003t.getCurrentMediaItemIndex();
            boolean z2 = this.f9196J;
            int i2 = z2 ? 0 : currentMediaItemIndex;
            int iMo9721t = z2 ? currentTimeline.mo9721t() - 1 : currentMediaItemIndex;
            i = 0;
            long j3 = 0;
            while (i2 <= iMo9721t) {
                if (i2 == currentMediaItemIndex) {
                    this.f9227p0 = vck0.m197874l1(j3);
                }
                currentTimeline.m9720r(i2, this.f9229r);
                AbstractC1834c0.d dVar2 = this.f9229r;
                if (dVar2.f7341n == -9223372036854775807L) {
                    p11.m167013g(this.f9196J ^ z);
                    break;
                }
                int i3 = dVar2.f7342o;
                while (true) {
                    dVar = this.f9229r;
                    if (i3 <= dVar.f7343p) {
                        currentTimeline.m9716j(i3, this.f9228q);
                        int iM9741r = this.f9228q.m9741r();
                        int iM9729f = this.f9228q.m9729f();
                        while (iM9741r < iM9729f) {
                            long jM9732i = this.f9228q.m9732i(iM9741r);
                            if (jM9732i == Long.MIN_VALUE) {
                                j = j2;
                                long j4 = this.f9228q.f7303d;
                                if (j4 != -9223372036854775807L) {
                                    jM9732i = j4;
                                }
                                iM9741r++;
                                j2 = j;
                            } else {
                                j = j2;
                            }
                            long jM9740q = jM9732i + this.f9228q.m9740q();
                            if (jM9740q >= j) {
                                long[] jArr = this.f9207U;
                                if (i == jArr.length) {
                                    int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                    this.f9207U = Arrays.copyOf(jArr, length);
                                    this.f9208V = Arrays.copyOf(this.f9208V, length);
                                }
                                this.f9207U[i] = vck0.m197874l1(j3 + jM9740q);
                                this.f9208V[i] = this.f9228q.m9742s(iM9741r);
                                i++;
                            }
                            iM9741r++;
                            j2 = j;
                        }
                        i3++;
                    }
                }
                j3 += dVar.f7341n;
                i2++;
                j2 = j2;
                z = true;
            }
            j2 = j3;
        }
        long jM197874l1 = vck0.m197874l1(j2);
        TextView textView = this.f9222l;
        if (textView != null) {
            textView.setText(vck0.m197870k0(this.f9225o, this.f9226p, jM197874l1));
        }
        InterfaceC2038b interfaceC2038b = this.f9224n;
        if (interfaceC2038b != null) {
            interfaceC2038b.setDuration(jM197874l1);
            int length2 = this.f9209W.length;
            int i4 = i + length2;
            long[] jArr2 = this.f9207U;
            if (i4 > jArr2.length) {
                this.f9207U = Arrays.copyOf(jArr2, i4);
                this.f9208V = Arrays.copyOf(this.f9208V, i4);
            }
            System.arraycopy(this.f9209W, 0, this.f9207U, i, length2);
            System.arraycopy(this.f9221k0, 0, this.f9208V, i, length2);
            this.f9224n.mo11813a(this.f9207U, this.f9208V, i4);
        }
        m11870O();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return m11875y(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f9231t);
        } else if (motionEvent.getAction() == 1) {
            m11858B();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    public InterfaceC2003t getPlayer() {
        return this.f9193G;
    }

    public int getRepeatToggleModes() {
        return this.f9200N;
    }

    public boolean getShowShuffleButton() {
        return this.f9205S;
    }

    public int getShowTimeoutMs() {
        return this.f9198L;
    }

    public boolean getShowVrButton() {
        View view = this.f9220k;
        return view != null && view.getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9194H = true;
        long j = this.f9206T;
        if (j != -9223372036854775807L) {
            long jUptimeMillis = j - SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                m11857A();
            } else {
                postDelayed(this.f9231t, jUptimeMillis);
            }
        } else if (m11859D()) {
            m11858B();
        }
        m11866K();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f9194H = false;
        removeCallbacks(this.f9230s);
        removeCallbacks(this.f9231t);
    }

    public void setPlayer(@Nullable InterfaceC2003t interfaceC2003t) {
        p11.m167013g(Looper.myLooper() == Looper.getMainLooper());
        p11.m167007a(interfaceC2003t == null || interfaceC2003t.getApplicationLooper() == Looper.getMainLooper());
        InterfaceC2003t interfaceC2003t2 = this.f9193G;
        if (interfaceC2003t2 == interfaceC2003t) {
            return;
        }
        if (interfaceC2003t2 != null) {
            interfaceC2003t2.removeListener(this.f9210a);
        }
        this.f9193G = interfaceC2003t;
        if (interfaceC2003t != null) {
            interfaceC2003t.addListener(this.f9210a);
        }
        m11866K();
    }

    public void setProgressUpdateListener(@Nullable InterfaceC2011d interfaceC2011d) {
    }

    public void setRepeatToggleModes(int i) {
        this.f9200N = i;
        InterfaceC2003t interfaceC2003t = this.f9193G;
        if (interfaceC2003t != null) {
            int repeatMode = interfaceC2003t.getRepeatMode();
            if (i == 0 && repeatMode != 0) {
                this.f9193G.setRepeatMode(0);
            } else if (i == 1 && repeatMode == 2) {
                this.f9193G.setRepeatMode(1);
            } else if (i == 2 && repeatMode == 1) {
                this.f9193G.setRepeatMode(2);
            }
        }
        m11871P();
    }

    public void setShowFastForwardButton(boolean z) {
        this.f9202P = z;
        m11868M();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.f9195I = z;
        m11873R();
    }

    public void setShowNextButton(boolean z) {
        this.f9204R = z;
        m11868M();
    }

    public void setShowPreviousButton(boolean z) {
        this.f9203Q = z;
        m11868M();
    }

    public void setShowRewindButton(boolean z) {
        this.f9201O = z;
        m11868M();
    }

    public void setShowShuffleButton(boolean z) {
        this.f9205S = z;
        m11872Q();
    }

    public void setShowTimeoutMs(int i) {
        this.f9198L = i;
        if (m11859D()) {
            m11858B();
        }
    }

    public void setShowVrButton(boolean z) {
        View view = this.f9220k;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.f9199M = vck0.m197884q(i, 16, 1000);
    }

    public void setVrButtonListener(@Nullable View.OnClickListener onClickListener) {
        View view = this.f9220k;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            m11867L(getShowVrButton(), onClickListener != null, this.f9220k);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m11874w(InterfaceC2012e interfaceC2012e) {
        p11.m167011e(interfaceC2012e);
        this.f9211b.add(interfaceC2012e);
    }

    /* JADX INFO: renamed from: y */
    public boolean m11875y(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        InterfaceC2003t interfaceC2003t = this.f9193G;
        if (interfaceC2003t == null || !m11832C(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (interfaceC2003t.getPlaybackState() == 4) {
                return true;
            }
            interfaceC2003t.seekForward();
            return true;
        }
        if (keyCode == 89) {
            interfaceC2003t.seekBack();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            vck0.m197893u0(interfaceC2003t);
            return true;
        }
        if (keyCode == 87) {
            interfaceC2003t.seekToNext();
            return true;
        }
        if (keyCode == 88) {
            interfaceC2003t.seekToPrevious();
            return true;
        }
        if (keyCode == 126) {
            vck0.m197891t0(interfaceC2003t);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        vck0.m197889s0(interfaceC2003t);
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
