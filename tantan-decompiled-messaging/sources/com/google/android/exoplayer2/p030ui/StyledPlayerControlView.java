package com.google.android.exoplayer2.p030ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.AbstractC1834c0;
import com.google.android.exoplayer2.C1838d0;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.InterfaceC2003t;
import com.google.android.exoplayer2.p030ui.StyledPlayerControlView;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import p149l.b0c0;
import p149l.brd;
import p149l.bsc0;
import p149l.d7c0;
import p149l.f4c0;
import p149l.l2c0;
import p149l.l6j0;
import p149l.l8c0;
import p149l.m3g0;
import p149l.n8f;
import p149l.o7c0;
import p149l.p11;
import p149l.t3c0;
import p149l.t5c0;
import p149l.t8c0;
import p149l.u6j0;
import p149l.vck0;
import p149l.w6j0;
import p149l.x3c0;
import p149l.ywc0;
import p149l.z5j0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class StyledPlayerControlView extends FrameLayout {

    /* JADX INFO: renamed from: Z0 */
    public static final float[] f9297Z0;

    /* JADX INFO: renamed from: A */
    @Nullable
    public final View f9298A;

    /* JADX INFO: renamed from: B */
    @Nullable
    public final View f9299B;

    /* JADX INFO: renamed from: C */
    @Nullable
    public final TextView f9300C;

    /* JADX INFO: renamed from: D */
    @Nullable
    public final TextView f9301D;

    /* JADX INFO: renamed from: E */
    @Nullable
    public final InterfaceC2038b f9302E;

    /* JADX INFO: renamed from: E0 */
    public final String f9303E0;

    /* JADX INFO: renamed from: F */
    public final StringBuilder f9304F;

    /* JADX INFO: renamed from: F0 */
    public final Drawable f9305F0;

    /* JADX INFO: renamed from: G */
    public final Formatter f9306G;

    /* JADX INFO: renamed from: G0 */
    public final Drawable f9307G0;

    /* JADX INFO: renamed from: H */
    public final AbstractC1834c0.b f9308H;

    /* JADX INFO: renamed from: H0 */
    public final String f9309H0;

    /* JADX INFO: renamed from: I */
    public final AbstractC1834c0.d f9310I;

    /* JADX INFO: renamed from: I0 */
    public final String f9311I0;

    /* JADX INFO: renamed from: J */
    public final Runnable f9312J;

    /* JADX INFO: renamed from: J0 */
    @Nullable
    public InterfaceC2003t f9313J0;

    /* JADX INFO: renamed from: K */
    public final Drawable f9314K;

    /* JADX INFO: renamed from: K0 */
    @Nullable
    public InterfaceC2018d f9315K0;

    /* JADX INFO: renamed from: L */
    public final Drawable f9316L;

    /* JADX INFO: renamed from: L0 */
    public boolean f9317L0;

    /* JADX INFO: renamed from: M */
    public final Drawable f9318M;

    /* JADX INFO: renamed from: M0 */
    public boolean f9319M0;

    /* JADX INFO: renamed from: N */
    public final String f9320N;

    /* JADX INFO: renamed from: N0 */
    public boolean f9321N0;

    /* JADX INFO: renamed from: O */
    public final String f9322O;

    /* JADX INFO: renamed from: O0 */
    public boolean f9323O0;

    /* JADX INFO: renamed from: P */
    public final String f9324P;

    /* JADX INFO: renamed from: P0 */
    public boolean f9325P0;

    /* JADX INFO: renamed from: Q */
    public final Drawable f9326Q;

    /* JADX INFO: renamed from: Q0 */
    public int f9327Q0;

    /* JADX INFO: renamed from: R */
    public final Drawable f9328R;

    /* JADX INFO: renamed from: R0 */
    public int f9329R0;

    /* JADX INFO: renamed from: S */
    public final float f9330S;

    /* JADX INFO: renamed from: S0 */
    public int f9331S0;

    /* JADX INFO: renamed from: T */
    public final float f9332T;

    /* JADX INFO: renamed from: T0 */
    public long[] f9333T0;

    /* JADX INFO: renamed from: U */
    public final String f9334U;

    /* JADX INFO: renamed from: U0 */
    public boolean[] f9335U0;

    /* JADX INFO: renamed from: V */
    public final String f9336V;

    /* JADX INFO: renamed from: V0 */
    public long[] f9337V0;

    /* JADX INFO: renamed from: W */
    public final Drawable f9338W;

    /* JADX INFO: renamed from: W0 */
    public boolean[] f9339W0;

    /* JADX INFO: renamed from: X0 */
    public long f9340X0;

    /* JADX INFO: renamed from: Y0 */
    public boolean f9341Y0;

    /* JADX INFO: renamed from: a */
    public final m3g0 f9342a;

    /* JADX INFO: renamed from: b */
    public final Resources f9343b;

    /* JADX INFO: renamed from: c */
    public final ViewOnClickListenerC2017c f9344c;

    /* JADX INFO: renamed from: d */
    public final CopyOnWriteArrayList<InterfaceC2027m> f9345d;

    /* JADX INFO: renamed from: e */
    public final RecyclerView f9346e;

    /* JADX INFO: renamed from: f */
    public final C2022h f9347f;

    /* JADX INFO: renamed from: g */
    public final C2019e f9348g;

    /* JADX INFO: renamed from: h */
    public final C2024j f9349h;

    /* JADX INFO: renamed from: i */
    public final C2016b f9350i;

    /* JADX INFO: renamed from: j */
    public final l6j0 f9351j;

    /* JADX INFO: renamed from: k */
    public final PopupWindow f9352k;

    /* JADX INFO: renamed from: k0 */
    public final Drawable f9353k0;

    /* JADX INFO: renamed from: l */
    public final int f9354l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public final View f9355m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public final View f9356n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public final View f9357o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public final View f9358p;

    /* JADX INFO: renamed from: p0 */
    public final String f9359p0;

    /* JADX INFO: renamed from: q */
    @Nullable
    public final View f9360q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public final TextView f9361r;

    /* JADX INFO: renamed from: s */
    @Nullable
    public final TextView f9362s;

    /* JADX INFO: renamed from: t */
    @Nullable
    public final ImageView f9363t;

    /* JADX INFO: renamed from: u */
    @Nullable
    public final ImageView f9364u;

    /* JADX INFO: renamed from: v */
    @Nullable
    public final View f9365v;

    /* JADX INFO: renamed from: w */
    @Nullable
    public final ImageView f9366w;

    /* JADX INFO: renamed from: x */
    @Nullable
    public final ImageView f9367x;

    /* JADX INFO: renamed from: y */
    @Nullable
    public final ImageView f9368y;

    /* JADX INFO: renamed from: z */
    @Nullable
    public final View f9369z;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$b */
    public final class C2016b extends AbstractC2026l {
        public C2016b() {
            super();
        }

        /* JADX INFO: renamed from: F */
        public static /* synthetic */ void m12008F(C2016b c2016b, View view) {
            if (StyledPlayerControlView.this.f9313J0 == null || !StyledPlayerControlView.this.f9313J0.isCommandAvailable(29)) {
                return;
            }
            ((InterfaceC2003t) vck0.m197866j(StyledPlayerControlView.this.f9313J0)).setTrackSelectionParameters(StyledPlayerControlView.this.f9313J0.getTrackSelectionParameters().mo151287A().mo151311B(1).mo151318J(1, false).mo151309A());
            StyledPlayerControlView.this.f9347f.m12024C(1, StyledPlayerControlView.this.getResources().getString(R$string.f9293w));
            StyledPlayerControlView.this.f9352k.dismiss();
        }

        @Override // com.google.android.exoplayer2.p030ui.StyledPlayerControlView.AbstractC2026l
        /* JADX INFO: renamed from: C */
        public void mo12009C(C2023i c2023i) {
            c2023i.f9384a.setText(R$string.f9293w);
            c2023i.f9385b.setVisibility(m12011G(((InterfaceC2003t) p11.m167011e(StyledPlayerControlView.this.f9313J0)).getTrackSelectionParameters()) ? 4 : 0);
            c2023i.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.u2g0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StyledPlayerControlView.C2016b.m12008F(this.f173485a, view);
                }
            });
        }

        @Override // com.google.android.exoplayer2.p030ui.StyledPlayerControlView.AbstractC2026l
        /* JADX INFO: renamed from: E */
        public void mo12010E(String str) {
            StyledPlayerControlView.this.f9347f.m12024C(1, str);
        }

        /* JADX INFO: renamed from: G */
        public final boolean m12011G(w6j0 w6j0Var) {
            for (int i = 0; i < this.f9390a.size(); i++) {
                if (w6j0Var.f184903y.containsKey(this.f9390a.get(i).f9387a.m9793b())) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: H */
        public void m12012H(List<C2025k> list) {
            this.f9390a = list;
            w6j0 trackSelectionParameters = ((InterfaceC2003t) p11.m167011e(StyledPlayerControlView.this.f9313J0)).getTrackSelectionParameters();
            if (list.isEmpty()) {
                StyledPlayerControlView.this.f9347f.m12024C(1, StyledPlayerControlView.this.getResources().getString(R$string.f9294x));
                return;
            }
            if (!m12011G(trackSelectionParameters)) {
                StyledPlayerControlView.this.f9347f.m12024C(1, StyledPlayerControlView.this.getResources().getString(R$string.f9293w));
                return;
            }
            for (int i = 0; i < list.size(); i++) {
                C2025k c2025k = list.get(i);
                if (c2025k.m12031a()) {
                    StyledPlayerControlView.this.f9347f.m12024C(1, c2025k.f9389c);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$c */
    public final class ViewOnClickListenerC2017c implements InterfaceC2003t.d, InterfaceC2038b.a, View.OnClickListener, PopupWindow.OnDismissListener {
        public ViewOnClickListenerC2017c() {
        }

        @Override // com.google.android.exoplayer2.p030ui.InterfaceC2038b.a
        /* JADX INFO: renamed from: L */
        public void mo11877L(InterfaceC2038b interfaceC2038b, long j) {
            if (StyledPlayerControlView.this.f9301D != null) {
                StyledPlayerControlView.this.f9301D.setText(vck0.m197870k0(StyledPlayerControlView.this.f9304F, StyledPlayerControlView.this.f9306G, j));
            }
        }

        @Override // com.google.android.exoplayer2.p030ui.InterfaceC2038b.a
        /* JADX INFO: renamed from: N */
        public void mo11878N(InterfaceC2038b interfaceC2038b, long j) {
            StyledPlayerControlView.this.f9325P0 = true;
            if (StyledPlayerControlView.this.f9301D != null) {
                StyledPlayerControlView.this.f9301D.setText(vck0.m197870k0(StyledPlayerControlView.this.f9304F, StyledPlayerControlView.this.f9306G, j));
            }
            StyledPlayerControlView.this.f9342a.m152898R();
        }

        @Override // com.google.android.exoplayer2.InterfaceC2003t.d
        /* JADX INFO: renamed from: l0 */
        public void mo11777l0(InterfaceC2003t interfaceC2003t, InterfaceC2003t.c cVar) {
            if (cVar.m11752b(4, 5, 13)) {
                StyledPlayerControlView.this.m12002u0();
            }
            if (cVar.m11752b(4, 5, 7, 13)) {
                StyledPlayerControlView.this.m12004w0();
            }
            if (cVar.m11752b(8, 13)) {
                StyledPlayerControlView.this.m12005x0();
            }
            if (cVar.m11752b(9, 13)) {
                StyledPlayerControlView.this.m11975B0();
            }
            if (cVar.m11752b(8, 9, 11, 0, 16, 17, 13)) {
                StyledPlayerControlView.this.m12001t0();
            }
            if (cVar.m11752b(11, 0, 13)) {
                StyledPlayerControlView.this.m11976C0();
            }
            if (cVar.m11752b(12, 13)) {
                StyledPlayerControlView.this.m12003v0();
            }
            if (cVar.m11752b(2, 13)) {
                StyledPlayerControlView.this.m11977D0();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            InterfaceC2003t interfaceC2003t = StyledPlayerControlView.this.f9313J0;
            if (interfaceC2003t == null) {
                return;
            }
            StyledPlayerControlView.this.f9342a.m152899S();
            if (StyledPlayerControlView.this.f9356n == view) {
                if (interfaceC2003t.isCommandAvailable(9)) {
                    interfaceC2003t.seekToNext();
                    return;
                }
                return;
            }
            if (StyledPlayerControlView.this.f9355m == view) {
                if (interfaceC2003t.isCommandAvailable(7)) {
                    interfaceC2003t.seekToPrevious();
                    return;
                }
                return;
            }
            if (StyledPlayerControlView.this.f9358p == view) {
                if (interfaceC2003t.getPlaybackState() == 4 || !interfaceC2003t.isCommandAvailable(12)) {
                    return;
                }
                interfaceC2003t.seekForward();
                return;
            }
            if (StyledPlayerControlView.this.f9360q == view) {
                if (interfaceC2003t.isCommandAvailable(11)) {
                    interfaceC2003t.seekBack();
                    return;
                }
                return;
            }
            if (StyledPlayerControlView.this.f9357o == view) {
                vck0.m197893u0(interfaceC2003t);
                return;
            }
            if (StyledPlayerControlView.this.f9363t == view) {
                if (interfaceC2003t.isCommandAvailable(15)) {
                    interfaceC2003t.setRepeatMode(bsc0.m103672a(interfaceC2003t.getRepeatMode(), StyledPlayerControlView.this.f9331S0));
                    return;
                }
                return;
            }
            if (StyledPlayerControlView.this.f9364u == view) {
                if (interfaceC2003t.isCommandAvailable(14)) {
                    interfaceC2003t.setShuffleModeEnabled(!interfaceC2003t.getShuffleModeEnabled());
                    return;
                }
                return;
            }
            View view2 = StyledPlayerControlView.this.f9369z;
            StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
            if (view2 == view) {
                styledPlayerControlView.f9342a.m152898R();
                StyledPlayerControlView styledPlayerControlView2 = StyledPlayerControlView.this;
                styledPlayerControlView2.m11980U(styledPlayerControlView2.f9347f, StyledPlayerControlView.this.f9369z);
                return;
            }
            View view3 = styledPlayerControlView.f9298A;
            StyledPlayerControlView styledPlayerControlView3 = StyledPlayerControlView.this;
            if (view3 == view) {
                styledPlayerControlView3.f9342a.m152898R();
                StyledPlayerControlView styledPlayerControlView4 = StyledPlayerControlView.this;
                styledPlayerControlView4.m11980U(styledPlayerControlView4.f9348g, StyledPlayerControlView.this.f9298A);
                return;
            }
            View view4 = styledPlayerControlView3.f9299B;
            StyledPlayerControlView styledPlayerControlView5 = StyledPlayerControlView.this;
            if (view4 == view) {
                styledPlayerControlView5.f9342a.m152898R();
                StyledPlayerControlView styledPlayerControlView6 = StyledPlayerControlView.this;
                styledPlayerControlView6.m11980U(styledPlayerControlView6.f9350i, StyledPlayerControlView.this.f9299B);
            } else if (styledPlayerControlView5.f9366w == view) {
                StyledPlayerControlView.this.f9342a.m152898R();
                StyledPlayerControlView styledPlayerControlView7 = StyledPlayerControlView.this;
                styledPlayerControlView7.m11980U(styledPlayerControlView7.f9349h, StyledPlayerControlView.this.f9366w);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (StyledPlayerControlView.this.f9341Y0) {
                StyledPlayerControlView.this.f9342a.m152899S();
            }
        }

        @Override // com.google.android.exoplayer2.p030ui.InterfaceC2038b.a
        /* JADX INFO: renamed from: u */
        public void mo11879u(InterfaceC2038b interfaceC2038b, long j, boolean z) {
            StyledPlayerControlView.this.f9325P0 = false;
            if (!z && StyledPlayerControlView.this.f9313J0 != null) {
                StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                styledPlayerControlView.m11993k0(styledPlayerControlView.f9313J0, j);
            }
            StyledPlayerControlView.this.f9342a.m152899S();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$d */
    @Deprecated
    public interface InterfaceC2018d {
        /* JADX INFO: renamed from: L */
        void mo12013L(boolean z);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$e */
    public final class C2019e extends RecyclerView.Adapter<C2023i> {

        /* JADX INFO: renamed from: a */
        public final String[] f9372a;

        /* JADX INFO: renamed from: b */
        public final float[] f9373b;

        /* JADX INFO: renamed from: c */
        public int f9374c;

        public C2019e(String[] strArr, float[] fArr) {
            this.f9372a = strArr;
            this.f9373b = fArr;
        }

        /* JADX INFO: renamed from: y */
        public static /* synthetic */ void m12014y(C2019e c2019e, int i, View view) {
            if (i != c2019e.f9374c) {
                StyledPlayerControlView.this.setPlaybackSpeed(c2019e.f9373b[i]);
            }
            StyledPlayerControlView.this.f9352k.dismiss();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C2023i c2023i, final int i) {
            String[] strArr = this.f9372a;
            if (i < strArr.length) {
                c2023i.f9384a.setText(strArr[i]);
            }
            if (i == this.f9374c) {
                c2023i.itemView.setSelected(true);
                c2023i.f9385b.setVisibility(0);
            } else {
                c2023i.itemView.setSelected(false);
                c2023i.f9385b.setVisibility(4);
            }
            c2023i.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.v2g0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StyledPlayerControlView.C2019e.m12014y(this.f179546a, i, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public C2023i onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C2023i(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(d7c0.f84733h, viewGroup, false));
        }

        /* JADX INFO: renamed from: D */
        public void m12017D(float f) {
            int i = 0;
            float f2 = Float.MAX_VALUE;
            int i2 = 0;
            while (true) {
                float[] fArr = this.f9373b;
                if (i >= fArr.length) {
                    this.f9374c = i2;
                    return;
                }
                float fAbs = Math.abs(f - fArr[i]);
                if (fAbs < f2) {
                    i2 = i;
                    f2 = fAbs;
                }
                i++;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f9372a.length;
        }

        /* JADX INFO: renamed from: z */
        public String m12018z() {
            return this.f9372a[this.f9374c];
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$f */
    public interface InterfaceC2020f {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$g */
    public final class C2021g extends RecyclerView.AbstractC0566d0 {

        /* JADX INFO: renamed from: a */
        public final TextView f9376a;

        /* JADX INFO: renamed from: b */
        public final TextView f9377b;

        /* JADX INFO: renamed from: c */
        public final ImageView f9378c;

        public C2021g(View view) {
            super(view);
            if (vck0.f180948a < 26) {
                view.setFocusable(true);
            }
            this.f9376a = (TextView) view.findViewById(f4c0.f94797u);
            this.f9377b = (TextView) view.findViewById(f4c0.f94771P);
            this.f9378c = (ImageView) view.findViewById(f4c0.f94796t);
            view.setOnClickListener(new View.OnClickListener() { // from class: l.w2g0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    StyledPlayerControlView.C2021g c2021g = this.f184240a;
                    StyledPlayerControlView.this.m11990h0(c2021g.getAdapterPosition());
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$h */
    public class C2022h extends RecyclerView.Adapter<C2021g> {

        /* JADX INFO: renamed from: a */
        public final String[] f9380a;

        /* JADX INFO: renamed from: b */
        public final String[] f9381b;

        /* JADX INFO: renamed from: c */
        public final Drawable[] f9382c;

        public C2022h(String[] strArr, Drawable[] drawableArr) {
            this.f9380a = strArr;
            this.f9381b = new String[strArr.length];
            this.f9382c = drawableArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public C2021g onCreateViewHolder(ViewGroup viewGroup, int i) {
            return StyledPlayerControlView.this.new C2021g(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(d7c0.f84732g, viewGroup, false));
        }

        /* JADX INFO: renamed from: C */
        public void m12024C(int i, String str) {
            this.f9381b[i] = str;
        }

        /* JADX INFO: renamed from: D */
        public final boolean m12025D(int i) {
            if (StyledPlayerControlView.this.f9313J0 == null) {
                return false;
            }
            if (i == 0) {
                return StyledPlayerControlView.this.f9313J0.isCommandAvailable(13);
            }
            if (i != 1) {
                return true;
            }
            return StyledPlayerControlView.this.f9313J0.isCommandAvailable(30) && StyledPlayerControlView.this.f9313J0.isCommandAvailable(29);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f9380a.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }

        /* JADX INFO: renamed from: y */
        public boolean m12026y() {
            return m12025D(1) || m12025D(0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C2021g c2021g, int i) {
            if (m12025D(i)) {
                c2021g.itemView.setLayoutParams(new RecyclerView.C0578p(-1, -2));
            } else {
                c2021g.itemView.setLayoutParams(new RecyclerView.C0578p(0, 0));
            }
            c2021g.f9376a.setText(this.f9380a[i]);
            if (this.f9381b[i] == null) {
                c2021g.f9377b.setVisibility(8);
            } else {
                c2021g.f9377b.setText(this.f9381b[i]);
            }
            if (this.f9382c[i] == null) {
                c2021g.f9378c.setVisibility(8);
            } else {
                c2021g.f9378c.setImageDrawable(this.f9382c[i]);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$i */
    public static class C2023i extends RecyclerView.AbstractC0566d0 {

        /* JADX INFO: renamed from: a */
        public final TextView f9384a;

        /* JADX INFO: renamed from: b */
        public final View f9385b;

        public C2023i(View view) {
            super(view);
            if (vck0.f180948a < 26) {
                view.setFocusable(true);
            }
            this.f9384a = (TextView) view.findViewById(f4c0.f94774S);
            this.f9385b = view.findViewById(f4c0.f94784h);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$j */
    public final class C2024j extends AbstractC2026l {
        public C2024j() {
            super();
        }

        /* JADX INFO: renamed from: F */
        public static /* synthetic */ void m12028F(C2024j c2024j, View view) {
            if (StyledPlayerControlView.this.f9313J0 == null || !StyledPlayerControlView.this.f9313J0.isCommandAvailable(29)) {
                return;
            }
            StyledPlayerControlView.this.f9313J0.setTrackSelectionParameters(StyledPlayerControlView.this.f9313J0.getTrackSelectionParameters().mo151287A().mo151311B(3).mo151315F(-3).mo151309A());
            StyledPlayerControlView.this.f9352k.dismiss();
        }

        @Override // com.google.android.exoplayer2.p030ui.StyledPlayerControlView.AbstractC2026l, androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C2023i c2023i, int i) {
            super.onBindViewHolder(c2023i, i);
            if (i > 0) {
                c2023i.f9385b.setVisibility(this.f9390a.get(i + (-1)).m12031a() ? 0 : 4);
            }
        }

        @Override // com.google.android.exoplayer2.p030ui.StyledPlayerControlView.AbstractC2026l
        /* JADX INFO: renamed from: C */
        public void mo12009C(C2023i c2023i) {
            boolean z;
            c2023i.f9384a.setText(R$string.f9294x);
            int i = 0;
            while (true) {
                if (i >= this.f9390a.size()) {
                    z = true;
                    break;
                } else {
                    if (this.f9390a.get(i).m12031a()) {
                        z = false;
                        break;
                    }
                    i++;
                }
            }
            c2023i.f9385b.setVisibility(z ? 0 : 4);
            c2023i.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.x2g0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StyledPlayerControlView.C2024j.m12028F(this.f190802a, view);
                }
            });
        }

        @Override // com.google.android.exoplayer2.p030ui.StyledPlayerControlView.AbstractC2026l
        /* JADX INFO: renamed from: E */
        public void mo12010E(String str) {
        }

        /* JADX INFO: renamed from: G */
        public void m12030G(List<C2025k> list) {
            boolean z = false;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).m12031a()) {
                    z = true;
                    break;
                }
            }
            if (StyledPlayerControlView.this.f9366w != null) {
                ImageView imageView = StyledPlayerControlView.this.f9366w;
                StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                imageView.setImageDrawable(z ? styledPlayerControlView.f9338W : styledPlayerControlView.f9353k0);
                ImageView imageView2 = StyledPlayerControlView.this.f9366w;
                StyledPlayerControlView styledPlayerControlView2 = StyledPlayerControlView.this;
                imageView2.setContentDescription(z ? styledPlayerControlView2.f9359p0 : styledPlayerControlView2.f9303E0);
            }
            this.f9390a = list;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$k */
    public static final class C2025k {

        /* JADX INFO: renamed from: a */
        public final C1838d0.a f9387a;

        /* JADX INFO: renamed from: b */
        public final int f9388b;

        /* JADX INFO: renamed from: c */
        public final String f9389c;

        public C2025k(C1838d0 c1838d0, int i, int i2, String str) {
            this.f9387a = c1838d0.m9787b().get(i);
            this.f9388b = i2;
            this.f9389c = str;
        }

        /* JADX INFO: renamed from: a */
        public boolean m12031a() {
            return this.f9387a.m9799h(this.f9388b);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$l */
    public abstract class AbstractC2026l extends RecyclerView.Adapter<C2023i> {

        /* JADX INFO: renamed from: a */
        public List<C2025k> f9390a = new ArrayList();

        public AbstractC2026l() {
        }

        /* JADX INFO: renamed from: y */
        public static /* synthetic */ void m12032y(AbstractC2026l abstractC2026l, InterfaceC2003t interfaceC2003t, z5j0 z5j0Var, C2025k c2025k, View view) {
            abstractC2026l.getClass();
            if (interfaceC2003t.isCommandAvailable(29)) {
                interfaceC2003t.setTrackSelectionParameters(interfaceC2003t.getTrackSelectionParameters().mo151287A().mo151316G(new u6j0(z5j0Var, ImmutableList.m15686of(Integer.valueOf(c2025k.f9388b)))).mo151318J(c2025k.f9387a.m9795d(), false).mo151309A());
                abstractC2026l.mo12010E(c2025k.f9389c);
                StyledPlayerControlView.this.f9352k.dismiss();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: A */
        public void onBindViewHolder(C2023i c2023i, int i) {
            final InterfaceC2003t interfaceC2003t = StyledPlayerControlView.this.f9313J0;
            if (interfaceC2003t == null) {
                return;
            }
            if (i == 0) {
                mo12009C(c2023i);
                return;
            }
            final C2025k c2025k = this.f9390a.get(i - 1);
            final z5j0 z5j0VarM9793b = c2025k.f9387a.m9793b();
            boolean z = interfaceC2003t.getTrackSelectionParameters().f184903y.get(z5j0VarM9793b) != null && c2025k.m12031a();
            c2023i.f9384a.setText(c2025k.f9389c);
            c2023i.f9385b.setVisibility(z ? 0 : 4);
            c2023i.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.y2g0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StyledPlayerControlView.AbstractC2026l.m12032y(this.f195611a, interfaceC2003t, z5j0VarM9793b, c2025k, view);
                }
            });
        }

        /* JADX INFO: renamed from: C */
        public abstract void mo12009C(C2023i c2023i);

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public C2023i onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C2023i(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(d7c0.f84733h, viewGroup, false));
        }

        /* JADX INFO: renamed from: E */
        public abstract void mo12010E(String str);

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            if (this.f9390a.isEmpty()) {
                return 0;
            }
            return this.f9390a.size() + 1;
        }

        /* JADX INFO: renamed from: z */
        public void m12034z() {
            this.f9390a = Collections.EMPTY_LIST;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$m */
    @Deprecated
    public interface InterfaceC2027m {
        /* JADX INFO: renamed from: u */
        void mo12035u(int i);
    }

    static {
        n8f.m158492a("goog.exo.ui");
        f9297Z0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public StyledPlayerControlView(Context context, @Nullable AttributeSet attributeSet, int i, @Nullable AttributeSet attributeSet2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        ViewOnClickListenerC2017c viewOnClickListenerC2017c;
        ImageView imageView;
        TextView textView;
        Context context2;
        boolean z9;
        super(context, attributeSet, i);
        int resourceId = d7c0.f84729d;
        this.f9327Q0 = 5000;
        this.f9331S0 = 0;
        this.f9329R0 = 200;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, t8c0.f168834P, i, 0);
            try {
                resourceId = typedArrayObtainStyledAttributes.getResourceId(t8c0.f168836R, resourceId);
                this.f9327Q0 = typedArrayObtainStyledAttributes.getInt(t8c0.f168844Z, this.f9327Q0);
                this.f9331S0 = m11944W(typedArrayObtainStyledAttributes, this.f9331S0);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(t8c0.f168841W, true);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(t8c0.f168838T, true);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(t8c0.f168840V, true);
                boolean z13 = typedArrayObtainStyledAttributes.getBoolean(t8c0.f168839U, true);
                boolean z14 = typedArrayObtainStyledAttributes.getBoolean(t8c0.f168842X, false);
                boolean z15 = typedArrayObtainStyledAttributes.getBoolean(t8c0.f168843Y, false);
                boolean z16 = typedArrayObtainStyledAttributes.getBoolean(t8c0.f168846a0, false);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(t8c0.f168848b0, this.f9329R0));
                boolean z17 = typedArrayObtainStyledAttributes.getBoolean(t8c0.f168835Q, true);
                typedArrayObtainStyledAttributes.recycle();
                z2 = z15;
                z3 = z16;
                z4 = z17;
                z7 = z12;
                z8 = z13;
                z = z14;
                z5 = z10;
                z6 = z11;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            z = false;
            z2 = false;
            z3 = false;
            z4 = true;
            z5 = true;
            z6 = true;
            z7 = true;
            z8 = true;
        }
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        ViewOnClickListenerC2017c viewOnClickListenerC2017c2 = new ViewOnClickListenerC2017c();
        this.f9344c = viewOnClickListenerC2017c2;
        this.f9345d = new CopyOnWriteArrayList<>();
        this.f9308H = new AbstractC1834c0.b();
        this.f9310I = new AbstractC1834c0.d();
        StringBuilder sb = new StringBuilder();
        this.f9304F = sb;
        this.f9306G = new Formatter(sb, Locale.getDefault());
        this.f9333T0 = new long[0];
        this.f9335U0 = new boolean[0];
        this.f9337V0 = new long[0];
        this.f9339W0 = new boolean[0];
        this.f9312J = new Runnable() { // from class: l.r2g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f157411a.m12004w0();
            }
        };
        this.f9300C = (TextView) findViewById(f4c0.f94789m);
        this.f9301D = (TextView) findViewById(f4c0.f94761F);
        ImageView imageView2 = (ImageView) findViewById(f4c0.f94772Q);
        this.f9366w = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(viewOnClickListenerC2017c2);
        }
        ImageView imageView3 = (ImageView) findViewById(f4c0.f94795s);
        this.f9367x = imageView3;
        m11946a0(imageView3, new View.OnClickListener() { // from class: l.s2g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f161978a.m11988f0(view);
            }
        });
        ImageView imageView4 = (ImageView) findViewById(f4c0.f94799w);
        this.f9368y = imageView4;
        m11946a0(imageView4, new View.OnClickListener() { // from class: l.s2g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f161978a.m11988f0(view);
            }
        });
        View viewFindViewById = findViewById(f4c0.f94768M);
        this.f9369z = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(viewOnClickListenerC2017c2);
        }
        View viewFindViewById2 = findViewById(f4c0.f94760E);
        this.f9298A = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(viewOnClickListenerC2017c2);
        }
        View viewFindViewById3 = findViewById(f4c0.f94779c);
        this.f9299B = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(viewOnClickListenerC2017c2);
        }
        InterfaceC2038b interfaceC2038b = (InterfaceC2038b) findViewById(f4c0.f94763H);
        View viewFindViewById4 = findViewById(f4c0.f94764I);
        if (interfaceC2038b != null) {
            this.f9302E = interfaceC2038b;
            viewOnClickListenerC2017c = viewOnClickListenerC2017c2;
            imageView = imageView2;
            textView = null;
            context2 = context;
        } else if (viewFindViewById4 != null) {
            viewOnClickListenerC2017c = viewOnClickListenerC2017c2;
            imageView = imageView2;
            textView = null;
            context2 = context;
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context2, null, 0, attributeSet2, l8c0.f126802a);
            defaultTimeBar.setId(f4c0.f94763H);
            defaultTimeBar.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.f9302E = defaultTimeBar;
        } else {
            viewOnClickListenerC2017c = viewOnClickListenerC2017c2;
            imageView = imageView2;
            textView = null;
            context2 = context;
            this.f9302E = null;
        }
        InterfaceC2038b interfaceC2038b2 = this.f9302E;
        if (interfaceC2038b2 != null) {
            interfaceC2038b2.mo11814b(viewOnClickListenerC2017c);
        }
        View viewFindViewById5 = findViewById(f4c0.f94759D);
        this.f9357o = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(viewOnClickListenerC2017c);
        }
        View viewFindViewById6 = findViewById(f4c0.f94762G);
        this.f9355m = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(viewOnClickListenerC2017c);
        }
        View viewFindViewById7 = findViewById(f4c0.f94800x);
        this.f9356n = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(viewOnClickListenerC2017c);
        }
        Typeface typefaceM216335f = ywc0.m216335f(context2, x3c0.f190880a);
        View viewFindViewById8 = findViewById(f4c0.f94766K);
        TextView textView2 = viewFindViewById8 == null ? (TextView) findViewById(f4c0.f94767L) : textView;
        this.f9362s = textView2;
        if (textView2 != null) {
            textView2.setTypeface(typefaceM216335f);
        }
        viewFindViewById8 = viewFindViewById8 == null ? textView2 : viewFindViewById8;
        this.f9360q = viewFindViewById8;
        if (viewFindViewById8 != null) {
            viewFindViewById8.setOnClickListener(viewOnClickListenerC2017c);
        }
        View viewFindViewById9 = findViewById(f4c0.f94793q);
        TextView textView3 = viewFindViewById9 == null ? (TextView) findViewById(f4c0.f94794r) : null;
        this.f9361r = textView3;
        if (textView3 != null) {
            textView3.setTypeface(typefaceM216335f);
        }
        viewFindViewById9 = viewFindViewById9 == null ? textView3 : viewFindViewById9;
        this.f9358p = viewFindViewById9;
        if (viewFindViewById9 != null) {
            viewFindViewById9.setOnClickListener(viewOnClickListenerC2017c);
        }
        ImageView imageView5 = (ImageView) findViewById(f4c0.f94765J);
        this.f9363t = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(viewOnClickListenerC2017c);
        }
        ImageView imageView6 = (ImageView) findViewById(f4c0.f94769N);
        this.f9364u = imageView6;
        if (imageView6 != null) {
            imageView6.setOnClickListener(viewOnClickListenerC2017c);
        }
        Resources resources = context2.getResources();
        this.f9343b = resources;
        boolean z18 = z3;
        this.f9330S = resources.getInteger(t5c0.f167816b) / 100.0f;
        this.f9332T = resources.getInteger(t5c0.f167815a) / 100.0f;
        View viewFindViewById10 = findViewById(f4c0.f94776U);
        this.f9365v = viewFindViewById10;
        boolean z19 = z2;
        if (viewFindViewById10 != null) {
            m11998p0(false, viewFindViewById10);
        }
        m3g0 m3g0Var = new m3g0(this);
        this.f9342a = m3g0Var;
        m3g0Var.m152900T(z4);
        boolean z20 = z;
        C2022h c2022h = new C2022h(new String[]{resources.getString(R$string.f9278h), resources.getString(R$string.f9295y)}, new Drawable[]{vck0.m197831W(context2, resources, t3c0.f167628s), vck0.m197831W(context2, resources, t3c0.f167618i)});
        this.f9347f = c2022h;
        this.f9354l = resources.getDimensionPixelSize(l2c0.f125770a);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context2).inflate(d7c0.f84731f, (ViewGroup) null);
        this.f9346e = recyclerView;
        recyclerView.setAdapter(c2022h);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.f9352k = popupWindow;
        if (vck0.f180948a < 23) {
            z9 = false;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            z9 = false;
        }
        popupWindow.setOnDismissListener(viewOnClickListenerC2017c);
        this.f9341Y0 = true;
        this.f9351j = new brd(getResources());
        this.f9338W = vck0.m197831W(context2, resources, t3c0.f167630u);
        this.f9353k0 = vck0.m197831W(context2, resources, t3c0.f167629t);
        this.f9359p0 = resources.getString(R$string.f9272b);
        this.f9303E0 = resources.getString(R$string.f9271a);
        this.f9349h = new C2024j();
        this.f9350i = new C2016b();
        this.f9348g = new C2019e(resources.getStringArray(b0c0.f72423a), f9297Z0);
        this.f9305F0 = vck0.m197831W(context2, resources, t3c0.f167620k);
        this.f9307G0 = vck0.m197831W(context2, resources, t3c0.f167619j);
        this.f9314K = vck0.m197831W(context2, resources, t3c0.f167624o);
        this.f9316L = vck0.m197831W(context2, resources, t3c0.f167625p);
        this.f9318M = vck0.m197831W(context2, resources, t3c0.f167623n);
        this.f9326Q = vck0.m197831W(context2, resources, t3c0.f167627r);
        this.f9328R = vck0.m197831W(context2, resources, t3c0.f167626q);
        this.f9309H0 = resources.getString(R$string.f9274d);
        this.f9311I0 = resources.getString(R$string.f9273c);
        this.f9320N = resources.getString(R$string.f9280j);
        this.f9322O = resources.getString(R$string.f9281k);
        this.f9324P = resources.getString(R$string.f9279i);
        this.f9334U = resources.getString(R$string.f9284n);
        this.f9336V = resources.getString(R$string.f9283m);
        m3g0Var.m152901U((ViewGroup) findViewById(f4c0.f94781e), true);
        m3g0Var.m152901U(viewFindViewById9, z6);
        m3g0Var.m152901U(viewFindViewById8, z5);
        m3g0Var.m152901U(viewFindViewById6, z7);
        m3g0Var.m152901U(viewFindViewById7, z8);
        m3g0Var.m152901U(imageView6, z20);
        m3g0Var.m152901U(imageView, z19);
        m3g0Var.m152901U(viewFindViewById10, z18);
        m3g0Var.m152901U(imageView5, this.f9331S0 != 0 ? true : z9);
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.t2g0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                this.f167469a.m11989g0(view, i2, i3, i4, i5, i6, i7, i8, i9);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public static boolean m11943S(InterfaceC2003t interfaceC2003t, AbstractC1834c0.d dVar) {
        AbstractC1834c0 currentTimeline;
        int iMo9721t;
        if (!interfaceC2003t.isCommandAvailable(17) || (iMo9721t = (currentTimeline = interfaceC2003t.getCurrentTimeline()).mo9721t()) <= 1 || iMo9721t > 100) {
            return false;
        }
        for (int i = 0; i < iMo9721t; i++) {
            if (currentTimeline.m9720r(i, dVar).f7341n == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: W */
    public static int m11944W(TypedArray typedArray, int i) {
        return typedArray.getInt(t8c0.f168837S, i);
    }

    /* JADX INFO: renamed from: a0 */
    public static void m11946a0(View view, View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        view.setVisibility(8);
        view.setOnClickListener(onClickListener);
    }

    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: c0 */
    public static boolean m11949c0(int i) {
        return i == 90 || i == 89 || i == 85 || i == 79 || i == 126 || i == 127 || i == 87 || i == 88;
    }

    /* JADX INFO: renamed from: s0 */
    public static void m11966s0(@Nullable View view, boolean z) {
        if (view == null) {
            return;
        }
        if (z) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f) {
        InterfaceC2003t interfaceC2003t = this.f9313J0;
        if (interfaceC2003t == null || !interfaceC2003t.isCommandAvailable(13)) {
            return;
        }
        InterfaceC2003t interfaceC2003t2 = this.f9313J0;
        interfaceC2003t2.setPlaybackParameters(interfaceC2003t2.getPlaybackParameters().m10898c(f));
    }

    /* JADX INFO: renamed from: A0 */
    public final void m11974A0() {
        this.f9346e.measure(0, 0);
        this.f9352k.setWidth(Math.min(this.f9346e.getMeasuredWidth(), getWidth() - (this.f9354l * 2)));
        this.f9352k.setHeight(Math.min(getHeight() - (this.f9354l * 2), this.f9346e.getMeasuredHeight()));
    }

    /* JADX INFO: renamed from: B0 */
    public final void m11975B0() {
        ImageView imageView;
        if (m11986d0() && this.f9319M0 && (imageView = this.f9364u) != null) {
            InterfaceC2003t interfaceC2003t = this.f9313J0;
            if (!this.f9342a.m152883A(imageView)) {
                m11998p0(false, this.f9364u);
                return;
            }
            if (interfaceC2003t == null || !interfaceC2003t.isCommandAvailable(14)) {
                m11998p0(false, this.f9364u);
                this.f9364u.setImageDrawable(this.f9328R);
                this.f9364u.setContentDescription(this.f9336V);
            } else {
                m11998p0(true, this.f9364u);
                this.f9364u.setImageDrawable(interfaceC2003t.getShuffleModeEnabled() ? this.f9326Q : this.f9328R);
                this.f9364u.setContentDescription(interfaceC2003t.getShuffleModeEnabled() ? this.f9334U : this.f9336V);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0116  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v6, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX INFO: renamed from: C0 */
    public final void m11976C0() {
        int i;
        long jM197806J0;
        AbstractC1834c0.d dVar;
        long j;
        InterfaceC2003t interfaceC2003t = this.f9313J0;
        if (interfaceC2003t == null) {
            return;
        }
        boolean z = true;
        this.f9323O0 = this.f9321N0 && m11943S(interfaceC2003t, this.f9310I);
        long j2 = 0;
        this.f9340X0 = 0L;
        AbstractC1834c0 currentTimeline = interfaceC2003t.isCommandAvailable(17) ? interfaceC2003t.getCurrentTimeline() : AbstractC1834c0.f7289a;
        long j3 = -9223372036854775807L;
        if (!currentTimeline.m9722u()) {
            int currentMediaItemIndex = interfaceC2003t.getCurrentMediaItemIndex();
            boolean z2 = this.f9323O0;
            int i2 = z2 ? 0 : currentMediaItemIndex;
            int iMo9721t = z2 ? currentTimeline.mo9721t() - 1 : currentMediaItemIndex;
            i = 0;
            long j4 = 0;
            while (i2 <= iMo9721t) {
                if (i2 == currentMediaItemIndex) {
                    this.f9340X0 = vck0.m197874l1(j4);
                }
                currentTimeline.m9720r(i2, this.f9310I);
                AbstractC1834c0.d dVar2 = this.f9310I;
                boolean z3 = z;
                long j5 = j2;
                if (dVar2.f7341n == j3) {
                    p11.m167013g(this.f9323O0 ^ z3);
                    break;
                }
                int i3 = dVar2.f7342o;
                while (true) {
                    dVar = this.f9310I;
                    if (i3 <= dVar.f7343p) {
                        currentTimeline.m9716j(i3, this.f9308H);
                        int iM9741r = this.f9308H.m9741r();
                        int iM9729f = this.f9308H.m9729f();
                        while (iM9741r < iM9729f) {
                            long jM9732i = this.f9308H.m9732i(iM9741r);
                            if (jM9732i == Long.MIN_VALUE) {
                                j = j3;
                                long j6 = this.f9308H.f7303d;
                                if (j6 != j) {
                                    jM9732i = j6;
                                }
                                iM9741r++;
                                j3 = j;
                            } else {
                                j = j3;
                            }
                            long jM9740q = jM9732i + this.f9308H.m9740q();
                            if (jM9740q >= j5) {
                                long[] jArr = this.f9333T0;
                                if (i == jArr.length) {
                                    ?? length = jArr.length == 0 ? z3 : jArr.length * 2;
                                    this.f9333T0 = Arrays.copyOf(jArr, (int) length);
                                    this.f9335U0 = Arrays.copyOf(this.f9335U0, (int) length);
                                }
                                this.f9333T0[i] = vck0.m197874l1(j4 + jM9740q);
                                this.f9335U0[i] = this.f9308H.m9742s(iM9741r);
                                i++;
                            }
                            iM9741r++;
                            j3 = j;
                        }
                        i3++;
                    }
                }
                j4 += dVar.f7341n;
                i2++;
                z = z3;
                j2 = j5;
            }
            jM197806J0 = j4;
        } else if (interfaceC2003t.isCommandAvailable(16)) {
            long contentDuration = interfaceC2003t.getContentDuration();
            if (contentDuration != -9223372036854775807L) {
                jM197806J0 = vck0.m197806J0(contentDuration);
                i = 0;
            } else {
                i = 0;
                jM197806J0 = 0;
            }
        } else {
            i = 0;
            jM197806J0 = 0;
        }
        long jM197874l1 = vck0.m197874l1(jM197806J0);
        TextView textView = this.f9300C;
        if (textView != null) {
            textView.setText(vck0.m197870k0(this.f9304F, this.f9306G, jM197874l1));
        }
        InterfaceC2038b interfaceC2038b = this.f9302E;
        if (interfaceC2038b != null) {
            interfaceC2038b.setDuration(jM197874l1);
            int length2 = this.f9337V0.length;
            int i4 = i + length2;
            long[] jArr2 = this.f9333T0;
            if (i4 > jArr2.length) {
                this.f9333T0 = Arrays.copyOf(jArr2, i4);
                this.f9335U0 = Arrays.copyOf(this.f9335U0, i4);
            }
            System.arraycopy(this.f9337V0, 0, this.f9333T0, i, length2);
            System.arraycopy(this.f9339W0, 0, this.f9335U0, i, length2);
            this.f9302E.mo11813a(this.f9333T0, this.f9335U0, i4);
        }
        m12004w0();
    }

    /* JADX INFO: renamed from: D0 */
    public final void m11977D0() {
        m11984Z();
        m11998p0(this.f9349h.getItemCount() > 0, this.f9366w);
        m12007z0();
    }

    @Deprecated
    /* JADX INFO: renamed from: R */
    public void m11978R(InterfaceC2027m interfaceC2027m) {
        p11.m167011e(interfaceC2027m);
        this.f9345d.add(interfaceC2027m);
    }

    /* JADX INFO: renamed from: T */
    public boolean m11979T(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        InterfaceC2003t interfaceC2003t = this.f9313J0;
        if (interfaceC2003t == null || !m11949c0(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (interfaceC2003t.getPlaybackState() == 4 || !interfaceC2003t.isCommandAvailable(12)) {
                return true;
            }
            interfaceC2003t.seekForward();
            return true;
        }
        if (keyCode == 89 && interfaceC2003t.isCommandAvailable(11)) {
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
            if (!interfaceC2003t.isCommandAvailable(9)) {
                return true;
            }
            interfaceC2003t.seekToNext();
            return true;
        }
        if (keyCode == 88) {
            if (!interfaceC2003t.isCommandAvailable(7)) {
                return true;
            }
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

    /* JADX INFO: renamed from: U */
    public final void m11980U(RecyclerView.Adapter<?> adapter, View view) {
        this.f9346e.setAdapter(adapter);
        m11974A0();
        this.f9341Y0 = false;
        this.f9352k.dismiss();
        this.f9341Y0 = true;
        this.f9352k.showAsDropDown(view, (getWidth() - this.f9352k.getWidth()) - this.f9354l, (-this.f9352k.getHeight()) - this.f9354l);
    }

    /* JADX INFO: renamed from: V */
    public final ImmutableList<C2025k> m11981V(C1838d0 c1838d0, int i) {
        ImmutableList.C2781a c2781a = new ImmutableList.C2781a();
        ImmutableList<C1838d0.a> immutableListM9787b = c1838d0.m9787b();
        for (int i2 = 0; i2 < immutableListM9787b.size(); i2++) {
            C1838d0.a aVar = immutableListM9787b.get(i2);
            if (aVar.m9795d() == i) {
                for (int i3 = 0; i3 < aVar.f7369a; i3++) {
                    if (aVar.m9800i(i3)) {
                        C1871k c1871kM9794c = aVar.m9794c(i3);
                        if ((c1871kM9794c.f7740d & 2) == 0) {
                            c2781a.mo15683a(new C2025k(c1838d0, i2, i3, this.f9351j.mo103529a(c1871kM9794c)));
                        }
                    }
                }
            }
        }
        return c2781a.m15702m();
    }

    /* JADX INFO: renamed from: X */
    public void m11982X() {
        this.f9342a.m152884C();
    }

    /* JADX INFO: renamed from: Y */
    public void m11983Y() {
        this.f9342a.m152887F();
    }

    /* JADX INFO: renamed from: Z */
    public final void m11984Z() {
        this.f9349h.m12034z();
        this.f9350i.m12034z();
        InterfaceC2003t interfaceC2003t = this.f9313J0;
        if (interfaceC2003t != null && interfaceC2003t.isCommandAvailable(30) && this.f9313J0.isCommandAvailable(29)) {
            C1838d0 currentTracks = this.f9313J0.getCurrentTracks();
            this.f9350i.m12012H(m11981V(currentTracks, 1));
            boolean zM152883A = this.f9342a.m152883A(this.f9366w);
            C2024j c2024j = this.f9349h;
            if (zM152883A) {
                c2024j.m12030G(m11981V(currentTracks, 3));
            } else {
                c2024j.m12030G(ImmutableList.m15685of());
            }
        }
    }

    /* JADX INFO: renamed from: b0 */
    public boolean m11985b0() {
        return this.f9342a.m152890I();
    }

    /* JADX INFO: renamed from: d0 */
    public boolean m11986d0() {
        return getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return m11979T(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX INFO: renamed from: e0 */
    public void m11987e0() {
        Iterator<InterfaceC2027m> it = this.f9345d.iterator();
        while (it.hasNext()) {
            it.next().mo12035u(getVisibility());
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m11988f0(View view) {
        if (this.f9315K0 == null) {
            return;
        }
        boolean z = !this.f9317L0;
        this.f9317L0 = z;
        m12000r0(this.f9367x, z);
        m12000r0(this.f9368y, this.f9317L0);
        InterfaceC2018d interfaceC2018d = this.f9315K0;
        if (interfaceC2018d != null) {
            interfaceC2018d.mo12013L(this.f9317L0);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m11989g0(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i4 - i2;
        int i10 = i8 - i6;
        if (!(i3 - i == i7 - i5 && i9 == i10) && this.f9352k.isShowing()) {
            m11974A0();
            this.f9352k.update(view, (getWidth() - this.f9352k.getWidth()) - this.f9354l, (-this.f9352k.getHeight()) - this.f9354l, -1, -1);
        }
    }

    @Nullable
    public InterfaceC2003t getPlayer() {
        return this.f9313J0;
    }

    public int getRepeatToggleModes() {
        return this.f9331S0;
    }

    public boolean getShowShuffleButton() {
        return this.f9342a.m152883A(this.f9364u);
    }

    public boolean getShowSubtitleButton() {
        return this.f9342a.m152883A(this.f9366w);
    }

    public int getShowTimeoutMs() {
        return this.f9327Q0;
    }

    public boolean getShowVrButton() {
        return this.f9342a.m152883A(this.f9365v);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m11990h0(int i) {
        if (i == 0) {
            m11980U(this.f9348g, (View) p11.m167011e(this.f9369z));
        } else if (i == 1) {
            m11980U(this.f9350i, (View) p11.m167011e(this.f9369z));
        } else {
            this.f9352k.dismiss();
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: i0 */
    public void m11991i0(InterfaceC2027m interfaceC2027m) {
        this.f9345d.remove(interfaceC2027m);
    }

    /* JADX INFO: renamed from: j0 */
    public void m11992j0() {
        View view = this.f9357o;
        if (view != null) {
            view.requestFocus();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m11993k0(InterfaceC2003t interfaceC2003t, long j) {
        if (this.f9323O0) {
            if (interfaceC2003t.isCommandAvailable(17) && interfaceC2003t.isCommandAvailable(10)) {
                AbstractC1834c0 currentTimeline = interfaceC2003t.getCurrentTimeline();
                int iMo9721t = currentTimeline.mo9721t();
                int i = 0;
                while (true) {
                    long jM9752f = currentTimeline.m9720r(i, this.f9310I).m9752f();
                    if (j < jM9752f) {
                        break;
                    }
                    if (i == iMo9721t - 1) {
                        j = jM9752f;
                        break;
                    } else {
                        j -= jM9752f;
                        i++;
                    }
                }
                interfaceC2003t.seekTo(i, j);
            }
        } else if (interfaceC2003t.isCommandAvailable(5)) {
            interfaceC2003t.seekTo(j);
        }
        m12004w0();
    }

    /* JADX INFO: renamed from: l0 */
    public void m11994l0(@Nullable long[] jArr, @Nullable boolean[] zArr) {
        if (jArr == null) {
            this.f9337V0 = new long[0];
            this.f9339W0 = new boolean[0];
        } else {
            boolean[] zArr2 = (boolean[]) p11.m167011e(zArr);
            p11.m167007a(jArr.length == zArr2.length);
            this.f9337V0 = jArr;
            this.f9339W0 = zArr2;
        }
        m11976C0();
    }

    /* JADX INFO: renamed from: m0 */
    public final boolean m11995m0() {
        InterfaceC2003t interfaceC2003t = this.f9313J0;
        if (interfaceC2003t == null || !interfaceC2003t.isCommandAvailable(1)) {
            return false;
        }
        return (this.f9313J0.isCommandAvailable(17) && this.f9313J0.getCurrentTimeline().m9722u()) ? false : true;
    }

    /* JADX INFO: renamed from: n0 */
    public void m11996n0() {
        this.f9342a.m152904X();
    }

    /* JADX INFO: renamed from: o0 */
    public void m11997o0() {
        m12002u0();
        m12001t0();
        m12005x0();
        m11975B0();
        m11977D0();
        m12003v0();
        m11976C0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9342a.m152891K();
        this.f9319M0 = true;
        if (m11985b0()) {
            this.f9342a.m152899S();
        }
        m11997o0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f9342a.m152892L();
        this.f9319M0 = false;
        removeCallbacks(this.f9312J);
        this.f9342a.m152898R();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f9342a.m152893M(z, i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m11998p0(boolean z, @Nullable View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? this.f9330S : this.f9332T);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m11999q0() {
        InterfaceC2003t interfaceC2003t = this.f9313J0;
        int seekForwardIncrement = (int) ((interfaceC2003t != null ? interfaceC2003t.getSeekForwardIncrement() : 15000L) / 1000);
        TextView textView = this.f9361r;
        if (textView != null) {
            textView.setText(String.valueOf(seekForwardIncrement));
        }
        View view = this.f9358p;
        if (view != null) {
            view.setContentDescription(this.f9343b.getQuantityString(o7c0.f142482a, seekForwardIncrement, Integer.valueOf(seekForwardIncrement)));
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m12000r0(@Nullable ImageView imageView, boolean z) {
        if (imageView == null) {
            return;
        }
        if (z) {
            imageView.setImageDrawable(this.f9305F0);
            imageView.setContentDescription(this.f9309H0);
        } else {
            imageView.setImageDrawable(this.f9307G0);
            imageView.setContentDescription(this.f9311I0);
        }
    }

    public void setAnimationEnabled(boolean z) {
        this.f9342a.m152900T(z);
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(@Nullable InterfaceC2018d interfaceC2018d) {
        this.f9315K0 = interfaceC2018d;
        m11966s0(this.f9367x, interfaceC2018d != null);
        m11966s0(this.f9368y, interfaceC2018d != null);
    }

    public void setPlayer(@Nullable InterfaceC2003t interfaceC2003t) {
        p11.m167013g(Looper.myLooper() == Looper.getMainLooper());
        p11.m167007a(interfaceC2003t == null || interfaceC2003t.getApplicationLooper() == Looper.getMainLooper());
        InterfaceC2003t interfaceC2003t2 = this.f9313J0;
        if (interfaceC2003t2 == interfaceC2003t) {
            return;
        }
        if (interfaceC2003t2 != null) {
            interfaceC2003t2.removeListener(this.f9344c);
        }
        this.f9313J0 = interfaceC2003t;
        if (interfaceC2003t != null) {
            interfaceC2003t.addListener(this.f9344c);
        }
        m11997o0();
    }

    public void setProgressUpdateListener(@Nullable InterfaceC2020f interfaceC2020f) {
    }

    public void setRepeatToggleModes(int i) {
        this.f9331S0 = i;
        InterfaceC2003t interfaceC2003t = this.f9313J0;
        if (interfaceC2003t != null && interfaceC2003t.isCommandAvailable(15)) {
            int repeatMode = this.f9313J0.getRepeatMode();
            if (i == 0 && repeatMode != 0) {
                this.f9313J0.setRepeatMode(0);
            } else if (i == 1 && repeatMode == 2) {
                this.f9313J0.setRepeatMode(1);
            } else if (i == 2 && repeatMode == 1) {
                this.f9313J0.setRepeatMode(2);
            }
        }
        this.f9342a.m152901U(this.f9363t, i != 0);
        m12005x0();
    }

    public void setShowFastForwardButton(boolean z) {
        this.f9342a.m152901U(this.f9358p, z);
        m12001t0();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.f9321N0 = z;
        m11976C0();
    }

    public void setShowNextButton(boolean z) {
        this.f9342a.m152901U(this.f9356n, z);
        m12001t0();
    }

    public void setShowPreviousButton(boolean z) {
        this.f9342a.m152901U(this.f9355m, z);
        m12001t0();
    }

    public void setShowRewindButton(boolean z) {
        this.f9342a.m152901U(this.f9360q, z);
        m12001t0();
    }

    public void setShowShuffleButton(boolean z) {
        this.f9342a.m152901U(this.f9364u, z);
        m11975B0();
    }

    public void setShowSubtitleButton(boolean z) {
        this.f9342a.m152901U(this.f9366w, z);
    }

    public void setShowTimeoutMs(int i) {
        this.f9327Q0 = i;
        if (m11985b0()) {
            this.f9342a.m152899S();
        }
    }

    public void setShowVrButton(boolean z) {
        this.f9342a.m152901U(this.f9365v, z);
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.f9329R0 = vck0.m197884q(i, 16, 1000);
    }

    public void setVrButtonListener(@Nullable View.OnClickListener onClickListener) {
        View view = this.f9365v;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            m11998p0(onClickListener != null, this.f9365v);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m12001t0() {
        boolean zIsCommandAvailable;
        boolean zIsCommandAvailable2;
        boolean zIsCommandAvailable3;
        boolean zIsCommandAvailable4;
        boolean zIsCommandAvailable5;
        if (m11986d0() && this.f9319M0) {
            InterfaceC2003t interfaceC2003t = this.f9313J0;
            if (interfaceC2003t != null) {
                zIsCommandAvailable = (this.f9321N0 && m11943S(interfaceC2003t, this.f9310I)) ? interfaceC2003t.isCommandAvailable(10) : interfaceC2003t.isCommandAvailable(5);
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
            if (zIsCommandAvailable4) {
                m12006y0();
            }
            if (zIsCommandAvailable5) {
                m11999q0();
            }
            m11998p0(zIsCommandAvailable3, this.f9355m);
            m11998p0(zIsCommandAvailable4, this.f9360q);
            m11998p0(zIsCommandAvailable5, this.f9358p);
            m11998p0(zIsCommandAvailable2, this.f9356n);
            InterfaceC2038b interfaceC2038b = this.f9302E;
            if (interfaceC2038b != null) {
                interfaceC2038b.setEnabled(zIsCommandAvailable);
            }
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m12002u0() {
        if (m11986d0() && this.f9319M0 && this.f9357o != null) {
            boolean zM197838Z0 = vck0.m197838Z0(this.f9313J0);
            int i = zM197838Z0 ? t3c0.f167622m : t3c0.f167621l;
            int i2 = zM197838Z0 ? R$string.f9277g : R$string.f9276f;
            ((ImageView) this.f9357o).setImageDrawable(vck0.m197831W(getContext(), this.f9343b, i));
            this.f9357o.setContentDescription(this.f9343b.getString(i2));
            m11998p0(m11995m0(), this.f9357o);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m12003v0() {
        InterfaceC2003t interfaceC2003t = this.f9313J0;
        if (interfaceC2003t == null) {
            return;
        }
        this.f9348g.m12017D(interfaceC2003t.getPlaybackParameters().f8251a);
        this.f9347f.m12024C(0, this.f9348g.m12018z());
        m12007z0();
    }

    /* JADX INFO: renamed from: w0 */
    public final void m12004w0() {
        long contentPosition;
        long contentBufferedPosition;
        if (m11986d0() && this.f9319M0) {
            InterfaceC2003t interfaceC2003t = this.f9313J0;
            if (interfaceC2003t == null || !interfaceC2003t.isCommandAvailable(16)) {
                contentPosition = 0;
                contentBufferedPosition = 0;
            } else {
                contentPosition = this.f9340X0 + interfaceC2003t.getContentPosition();
                contentBufferedPosition = this.f9340X0 + interfaceC2003t.getContentBufferedPosition();
            }
            TextView textView = this.f9301D;
            if (textView != null && !this.f9325P0) {
                textView.setText(vck0.m197870k0(this.f9304F, this.f9306G, contentPosition));
            }
            InterfaceC2038b interfaceC2038b = this.f9302E;
            if (interfaceC2038b != null) {
                interfaceC2038b.setPosition(contentPosition);
                this.f9302E.setBufferedPosition(contentBufferedPosition);
            }
            removeCallbacks(this.f9312J);
            int playbackState = interfaceC2003t == null ? 1 : interfaceC2003t.getPlaybackState();
            if (interfaceC2003t == null || !interfaceC2003t.isPlaying()) {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(this.f9312J, 1000L);
                return;
            }
            InterfaceC2038b interfaceC2038b2 = this.f9302E;
            long jMin = Math.min(interfaceC2038b2 != null ? interfaceC2038b2.getPreferredUpdateDelay() : 1000L, 1000 - (contentPosition % 1000));
            float f = interfaceC2003t.getPlaybackParameters().f8251a;
            postDelayed(this.f9312J, vck0.m197886r(f > 0.0f ? (long) (jMin / f) : 1000L, this.f9329R0, 1000L));
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m12005x0() {
        ImageView imageView;
        if (m11986d0() && this.f9319M0 && (imageView = this.f9363t) != null) {
            if (this.f9331S0 == 0) {
                m11998p0(false, imageView);
                return;
            }
            InterfaceC2003t interfaceC2003t = this.f9313J0;
            if (interfaceC2003t == null || !interfaceC2003t.isCommandAvailable(15)) {
                m11998p0(false, this.f9363t);
                this.f9363t.setImageDrawable(this.f9314K);
                this.f9363t.setContentDescription(this.f9320N);
                return;
            }
            m11998p0(true, this.f9363t);
            int repeatMode = interfaceC2003t.getRepeatMode();
            if (repeatMode == 0) {
                this.f9363t.setImageDrawable(this.f9314K);
                this.f9363t.setContentDescription(this.f9320N);
            } else if (repeatMode == 1) {
                this.f9363t.setImageDrawable(this.f9316L);
                this.f9363t.setContentDescription(this.f9322O);
            } else {
                if (repeatMode != 2) {
                    return;
                }
                this.f9363t.setImageDrawable(this.f9318M);
                this.f9363t.setContentDescription(this.f9324P);
            }
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m12006y0() {
        InterfaceC2003t interfaceC2003t = this.f9313J0;
        int seekBackIncrement = (int) ((interfaceC2003t != null ? interfaceC2003t.getSeekBackIncrement() : Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS) / 1000);
        TextView textView = this.f9362s;
        if (textView != null) {
            textView.setText(String.valueOf(seekBackIncrement));
        }
        View view = this.f9360q;
        if (view != null) {
            view.setContentDescription(this.f9343b.getQuantityString(o7c0.f142483b, seekBackIncrement, Integer.valueOf(seekBackIncrement)));
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m12007z0() {
        m11998p0(this.f9347f.m12026y(), this.f9369z);
    }

    public StyledPlayerControlView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StyledPlayerControlView(Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public StyledPlayerControlView(Context context) {
        this(context, null);
    }
}
