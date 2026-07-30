package com.google.android.exoplayer2.p031ui;

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
import com.google.android.exoplayer2.AbstractC1857c0;
import com.google.android.exoplayer2.C1861d0;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.InterfaceC2026t;
import com.google.android.exoplayer2.p031ui.StyledPlayerControlView;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import p153l.agj0;
import p153l.bmk0;
import p153l.c5d0;
import p153l.dcc0;
import p153l.dfj0;
import p153l.g0d0;
import p153l.g8c0;
import p153l.hfc0;
import p153l.lcc0;
import p153l.pfj0;
import p153l.qgc0;
import p153l.qsd;
import p153l.sac0;
import p153l.sfc0;
import p153l.t9f;
import p153l.tbg0;
import p153l.w11;
import p153l.ydc0;
import p153l.yfj0;
import p153l.ygc0;
import p153l.zbc0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class StyledPlayerControlView extends FrameLayout {

    /* JADX INFO: renamed from: Z0 */
    public static final float[] f9334Z0;

    /* JADX INFO: renamed from: A */
    @Nullable
    public final View f9335A;

    /* JADX INFO: renamed from: B */
    @Nullable
    public final View f9336B;

    /* JADX INFO: renamed from: C */
    @Nullable
    public final TextView f9337C;

    /* JADX INFO: renamed from: D */
    @Nullable
    public final TextView f9338D;

    /* JADX INFO: renamed from: E */
    @Nullable
    public final InterfaceC2061b f9339E;

    /* JADX INFO: renamed from: E0 */
    public final String f9340E0;

    /* JADX INFO: renamed from: F */
    public final StringBuilder f9341F;

    /* JADX INFO: renamed from: F0 */
    public final Drawable f9342F0;

    /* JADX INFO: renamed from: G */
    public final Formatter f9343G;

    /* JADX INFO: renamed from: G0 */
    public final Drawable f9344G0;

    /* JADX INFO: renamed from: H */
    public final AbstractC1857c0.b f9345H;

    /* JADX INFO: renamed from: H0 */
    public final String f9346H0;

    /* JADX INFO: renamed from: I */
    public final AbstractC1857c0.d f9347I;

    /* JADX INFO: renamed from: I0 */
    public final String f9348I0;

    /* JADX INFO: renamed from: J */
    public final Runnable f9349J;

    /* JADX INFO: renamed from: J0 */
    @Nullable
    public InterfaceC2026t f9350J0;

    /* JADX INFO: renamed from: K */
    public final Drawable f9351K;

    /* JADX INFO: renamed from: K0 */
    @Nullable
    public InterfaceC2041d f9352K0;

    /* JADX INFO: renamed from: L */
    public final Drawable f9353L;

    /* JADX INFO: renamed from: L0 */
    public boolean f9354L0;

    /* JADX INFO: renamed from: M */
    public final Drawable f9355M;

    /* JADX INFO: renamed from: M0 */
    public boolean f9356M0;

    /* JADX INFO: renamed from: N */
    public final String f9357N;

    /* JADX INFO: renamed from: N0 */
    public boolean f9358N0;

    /* JADX INFO: renamed from: O */
    public final String f9359O;

    /* JADX INFO: renamed from: O0 */
    public boolean f9360O0;

    /* JADX INFO: renamed from: P */
    public final String f9361P;

    /* JADX INFO: renamed from: P0 */
    public boolean f9362P0;

    /* JADX INFO: renamed from: Q */
    public final Drawable f9363Q;

    /* JADX INFO: renamed from: Q0 */
    public int f9364Q0;

    /* JADX INFO: renamed from: R */
    public final Drawable f9365R;

    /* JADX INFO: renamed from: R0 */
    public int f9366R0;

    /* JADX INFO: renamed from: S */
    public final float f9367S;

    /* JADX INFO: renamed from: S0 */
    public int f9368S0;

    /* JADX INFO: renamed from: T */
    public final float f9369T;

    /* JADX INFO: renamed from: T0 */
    public long[] f9370T0;

    /* JADX INFO: renamed from: U */
    public final String f9371U;

    /* JADX INFO: renamed from: U0 */
    public boolean[] f9372U0;

    /* JADX INFO: renamed from: V */
    public final String f9373V;

    /* JADX INFO: renamed from: V0 */
    public long[] f9374V0;

    /* JADX INFO: renamed from: W */
    public final Drawable f9375W;

    /* JADX INFO: renamed from: W0 */
    public boolean[] f9376W0;

    /* JADX INFO: renamed from: X0 */
    public long f9377X0;

    /* JADX INFO: renamed from: Y0 */
    public boolean f9378Y0;

    /* JADX INFO: renamed from: a */
    public final tbg0 f9379a;

    /* JADX INFO: renamed from: b */
    public final Resources f9380b;

    /* JADX INFO: renamed from: c */
    public final ViewOnClickListenerC2040c f9381c;

    /* JADX INFO: renamed from: d */
    public final CopyOnWriteArrayList<InterfaceC2050m> f9382d;

    /* JADX INFO: renamed from: e */
    public final RecyclerView f9383e;

    /* JADX INFO: renamed from: f */
    public final C2045h f9384f;

    /* JADX INFO: renamed from: g */
    public final C2042e f9385g;

    /* JADX INFO: renamed from: h */
    public final C2047j f9386h;

    /* JADX INFO: renamed from: i */
    public final C2039b f9387i;

    /* JADX INFO: renamed from: j */
    public final pfj0 f9388j;

    /* JADX INFO: renamed from: k */
    public final PopupWindow f9389k;

    /* JADX INFO: renamed from: k0 */
    public final Drawable f9390k0;

    /* JADX INFO: renamed from: l */
    public final int f9391l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public final View f9392m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public final View f9393n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public final View f9394o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public final View f9395p;

    /* JADX INFO: renamed from: p0 */
    public final String f9396p0;

    /* JADX INFO: renamed from: q */
    @Nullable
    public final View f9397q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public final TextView f9398r;

    /* JADX INFO: renamed from: s */
    @Nullable
    public final TextView f9399s;

    /* JADX INFO: renamed from: t */
    @Nullable
    public final ImageView f9400t;

    /* JADX INFO: renamed from: u */
    @Nullable
    public final ImageView f9401u;

    /* JADX INFO: renamed from: v */
    @Nullable
    public final View f9402v;

    /* JADX INFO: renamed from: w */
    @Nullable
    public final ImageView f9403w;

    /* JADX INFO: renamed from: x */
    @Nullable
    public final ImageView f9404x;

    /* JADX INFO: renamed from: y */
    @Nullable
    public final ImageView f9405y;

    /* JADX INFO: renamed from: z */
    @Nullable
    public final View f9406z;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$b */
    public final class C2039b extends AbstractC2049l {
        public C2039b() {
            super();
        }

        /* JADX INFO: renamed from: F */
        public static /* synthetic */ void m12062F(C2039b c2039b, View view) {
            if (StyledPlayerControlView.this.f9350J0 == null || !StyledPlayerControlView.this.f9350J0.isCommandAvailable(29)) {
                return;
            }
            ((InterfaceC2026t) bmk0.m105144j(StyledPlayerControlView.this.f9350J0)).setTrackSelectionParameters(StyledPlayerControlView.this.f9350J0.getTrackSelectionParameters().mo97663A().mo97692B(1).mo97699J(1, false).mo97691A());
            StyledPlayerControlView.this.f9384f.m12078C(1, StyledPlayerControlView.this.getResources().getString(R$string.f9330w));
            StyledPlayerControlView.this.f9389k.dismiss();
        }

        @Override // com.google.android.exoplayer2.p031ui.StyledPlayerControlView.AbstractC2049l
        /* JADX INFO: renamed from: C */
        public void mo12063C(C2046i c2046i) {
            c2046i.f9421a.setText(R$string.f9330w);
            c2046i.f9422b.setVisibility(m12065G(((InterfaceC2026t) w11.m204369e(StyledPlayerControlView.this.f9350J0)).getTrackSelectionParameters()) ? 4 : 0);
            c2046i.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.bbg0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StyledPlayerControlView.C2039b.m12062F(this.f75946a, view);
                }
            });
        }

        @Override // com.google.android.exoplayer2.p031ui.StyledPlayerControlView.AbstractC2049l
        /* JADX INFO: renamed from: E */
        public void mo12064E(String str) {
            StyledPlayerControlView.this.f9384f.m12078C(1, str);
        }

        /* JADX INFO: renamed from: G */
        public final boolean m12065G(agj0 agj0Var) {
            for (int i = 0; i < this.f9427a.size(); i++) {
                if (agj0Var.f71218y.containsKey(this.f9427a.get(i).f9424a.m9847b())) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: H */
        public void m12066H(List<C2048k> list) {
            this.f9427a = list;
            agj0 trackSelectionParameters = ((InterfaceC2026t) w11.m204369e(StyledPlayerControlView.this.f9350J0)).getTrackSelectionParameters();
            if (list.isEmpty()) {
                StyledPlayerControlView.this.f9384f.m12078C(1, StyledPlayerControlView.this.getResources().getString(R$string.f9331x));
                return;
            }
            if (!m12065G(trackSelectionParameters)) {
                StyledPlayerControlView.this.f9384f.m12078C(1, StyledPlayerControlView.this.getResources().getString(R$string.f9330w));
                return;
            }
            for (int i = 0; i < list.size(); i++) {
                C2048k c2048k = list.get(i);
                if (c2048k.m12085a()) {
                    StyledPlayerControlView.this.f9384f.m12078C(1, c2048k.f9426c);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$c */
    public final class ViewOnClickListenerC2040c implements InterfaceC2026t.d, InterfaceC2061b.a, View.OnClickListener, PopupWindow.OnDismissListener {
        public ViewOnClickListenerC2040c() {
        }

        @Override // com.google.android.exoplayer2.p031ui.InterfaceC2061b.a
        /* JADX INFO: renamed from: L */
        public void mo11931L(InterfaceC2061b interfaceC2061b, long j) {
            if (StyledPlayerControlView.this.f9338D != null) {
                StyledPlayerControlView.this.f9338D.setText(bmk0.m105148k0(StyledPlayerControlView.this.f9341F, StyledPlayerControlView.this.f9343G, j));
            }
        }

        @Override // com.google.android.exoplayer2.p031ui.InterfaceC2061b.a
        /* JADX INFO: renamed from: N */
        public void mo11932N(InterfaceC2061b interfaceC2061b, long j) {
            StyledPlayerControlView.this.f9362P0 = true;
            if (StyledPlayerControlView.this.f9338D != null) {
                StyledPlayerControlView.this.f9338D.setText(bmk0.m105148k0(StyledPlayerControlView.this.f9341F, StyledPlayerControlView.this.f9343G, j));
            }
            StyledPlayerControlView.this.f9379a.m190056R();
        }

        @Override // com.google.android.exoplayer2.InterfaceC2026t.d
        /* JADX INFO: renamed from: l0 */
        public void mo11831l0(InterfaceC2026t interfaceC2026t, InterfaceC2026t.c cVar) {
            if (cVar.m11806b(4, 5, 13)) {
                StyledPlayerControlView.this.m12056u0();
            }
            if (cVar.m11806b(4, 5, 7, 13)) {
                StyledPlayerControlView.this.m12058w0();
            }
            if (cVar.m11806b(8, 13)) {
                StyledPlayerControlView.this.m12059x0();
            }
            if (cVar.m11806b(9, 13)) {
                StyledPlayerControlView.this.m12029B0();
            }
            if (cVar.m11806b(8, 9, 11, 0, 16, 17, 13)) {
                StyledPlayerControlView.this.m12055t0();
            }
            if (cVar.m11806b(11, 0, 13)) {
                StyledPlayerControlView.this.m12030C0();
            }
            if (cVar.m11806b(12, 13)) {
                StyledPlayerControlView.this.m12057v0();
            }
            if (cVar.m11806b(2, 13)) {
                StyledPlayerControlView.this.m12031D0();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            InterfaceC2026t interfaceC2026t = StyledPlayerControlView.this.f9350J0;
            if (interfaceC2026t == null) {
                return;
            }
            StyledPlayerControlView.this.f9379a.m190057S();
            if (StyledPlayerControlView.this.f9393n == view) {
                if (interfaceC2026t.isCommandAvailable(9)) {
                    interfaceC2026t.seekToNext();
                    return;
                }
                return;
            }
            if (StyledPlayerControlView.this.f9392m == view) {
                if (interfaceC2026t.isCommandAvailable(7)) {
                    interfaceC2026t.seekToPrevious();
                    return;
                }
                return;
            }
            if (StyledPlayerControlView.this.f9395p == view) {
                if (interfaceC2026t.getPlaybackState() == 4 || !interfaceC2026t.isCommandAvailable(12)) {
                    return;
                }
                interfaceC2026t.seekForward();
                return;
            }
            if (StyledPlayerControlView.this.f9397q == view) {
                if (interfaceC2026t.isCommandAvailable(11)) {
                    interfaceC2026t.seekBack();
                    return;
                }
                return;
            }
            if (StyledPlayerControlView.this.f9394o == view) {
                bmk0.m105171u0(interfaceC2026t);
                return;
            }
            if (StyledPlayerControlView.this.f9400t == view) {
                if (interfaceC2026t.isCommandAvailable(15)) {
                    interfaceC2026t.setRepeatMode(g0d0.m128417a(interfaceC2026t.getRepeatMode(), StyledPlayerControlView.this.f9368S0));
                    return;
                }
                return;
            }
            if (StyledPlayerControlView.this.f9401u == view) {
                if (interfaceC2026t.isCommandAvailable(14)) {
                    interfaceC2026t.setShuffleModeEnabled(!interfaceC2026t.getShuffleModeEnabled());
                    return;
                }
                return;
            }
            View view2 = StyledPlayerControlView.this.f9406z;
            StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
            if (view2 == view) {
                styledPlayerControlView.f9379a.m190056R();
                StyledPlayerControlView styledPlayerControlView2 = StyledPlayerControlView.this;
                styledPlayerControlView2.m12034U(styledPlayerControlView2.f9384f, StyledPlayerControlView.this.f9406z);
                return;
            }
            View view3 = styledPlayerControlView.f9335A;
            StyledPlayerControlView styledPlayerControlView3 = StyledPlayerControlView.this;
            if (view3 == view) {
                styledPlayerControlView3.f9379a.m190056R();
                StyledPlayerControlView styledPlayerControlView4 = StyledPlayerControlView.this;
                styledPlayerControlView4.m12034U(styledPlayerControlView4.f9385g, StyledPlayerControlView.this.f9335A);
                return;
            }
            View view4 = styledPlayerControlView3.f9336B;
            StyledPlayerControlView styledPlayerControlView5 = StyledPlayerControlView.this;
            if (view4 == view) {
                styledPlayerControlView5.f9379a.m190056R();
                StyledPlayerControlView styledPlayerControlView6 = StyledPlayerControlView.this;
                styledPlayerControlView6.m12034U(styledPlayerControlView6.f9387i, StyledPlayerControlView.this.f9336B);
            } else if (styledPlayerControlView5.f9403w == view) {
                StyledPlayerControlView.this.f9379a.m190056R();
                StyledPlayerControlView styledPlayerControlView7 = StyledPlayerControlView.this;
                styledPlayerControlView7.m12034U(styledPlayerControlView7.f9386h, StyledPlayerControlView.this.f9403w);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (StyledPlayerControlView.this.f9378Y0) {
                StyledPlayerControlView.this.f9379a.m190057S();
            }
        }

        @Override // com.google.android.exoplayer2.p031ui.InterfaceC2061b.a
        /* JADX INFO: renamed from: u */
        public void mo11933u(InterfaceC2061b interfaceC2061b, long j, boolean z) {
            StyledPlayerControlView.this.f9362P0 = false;
            if (!z && StyledPlayerControlView.this.f9350J0 != null) {
                StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                styledPlayerControlView.m12047k0(styledPlayerControlView.f9350J0, j);
            }
            StyledPlayerControlView.this.f9379a.m190057S();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$d */
    @Deprecated
    public interface InterfaceC2041d {
        /* JADX INFO: renamed from: L */
        void mo12067L(boolean z);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$e */
    public final class C2042e extends RecyclerView.Adapter<C2046i> {

        /* JADX INFO: renamed from: a */
        public final String[] f9409a;

        /* JADX INFO: renamed from: b */
        public final float[] f9410b;

        /* JADX INFO: renamed from: c */
        public int f9411c;

        public C2042e(String[] strArr, float[] fArr) {
            this.f9409a = strArr;
            this.f9410b = fArr;
        }

        /* JADX INFO: renamed from: y */
        public static /* synthetic */ void m12068y(C2042e c2042e, int i, View view) {
            if (i != c2042e.f9411c) {
                StyledPlayerControlView.this.setPlaybackSpeed(c2042e.f9410b[i]);
            }
            StyledPlayerControlView.this.f9389k.dismiss();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C2046i c2046i, final int i) {
            String[] strArr = this.f9409a;
            if (i < strArr.length) {
                c2046i.f9421a.setText(strArr[i]);
            }
            if (i == this.f9411c) {
                c2046i.itemView.setSelected(true);
                c2046i.f9422b.setVisibility(0);
            } else {
                c2046i.itemView.setSelected(false);
                c2046i.f9422b.setVisibility(4);
            }
            c2046i.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.cbg0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StyledPlayerControlView.C2042e.m12068y(this.f80817a, i, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public C2046i onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C2046i(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(hfc0.f109275h, viewGroup, false));
        }

        /* JADX INFO: renamed from: D */
        public void m12071D(float f) {
            int i = 0;
            float f2 = Float.MAX_VALUE;
            int i2 = 0;
            while (true) {
                float[] fArr = this.f9410b;
                if (i >= fArr.length) {
                    this.f9411c = i2;
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
            return this.f9409a.length;
        }

        /* JADX INFO: renamed from: z */
        public String m12072z() {
            return this.f9409a[this.f9411c];
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$f */
    public interface InterfaceC2043f {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$g */
    public final class C2044g extends RecyclerView.AbstractC0569e0 {

        /* JADX INFO: renamed from: a */
        public final TextView f9413a;

        /* JADX INFO: renamed from: b */
        public final TextView f9414b;

        /* JADX INFO: renamed from: c */
        public final ImageView f9415c;

        public C2044g(View view) {
            super(view);
            if (bmk0.f77313a < 26) {
                view.setFocusable(true);
            }
            this.f9413a = (TextView) view.findViewById(lcc0.f131342u);
            this.f9414b = (TextView) view.findViewById(lcc0.f131316P);
            this.f9415c = (ImageView) view.findViewById(lcc0.f131341t);
            view.setOnClickListener(new View.OnClickListener() { // from class: l.dbg0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    StyledPlayerControlView.C2044g c2044g = this.f87668a;
                    StyledPlayerControlView.this.m12044h0(c2044g.getAdapterPosition());
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$h */
    public class C2045h extends RecyclerView.Adapter<C2044g> {

        /* JADX INFO: renamed from: a */
        public final String[] f9417a;

        /* JADX INFO: renamed from: b */
        public final String[] f9418b;

        /* JADX INFO: renamed from: c */
        public final Drawable[] f9419c;

        public C2045h(String[] strArr, Drawable[] drawableArr) {
            this.f9417a = strArr;
            this.f9418b = new String[strArr.length];
            this.f9419c = drawableArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public C2044g onCreateViewHolder(ViewGroup viewGroup, int i) {
            return StyledPlayerControlView.this.new C2044g(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(hfc0.f109274g, viewGroup, false));
        }

        /* JADX INFO: renamed from: C */
        public void m12078C(int i, String str) {
            this.f9418b[i] = str;
        }

        /* JADX INFO: renamed from: D */
        public final boolean m12079D(int i) {
            if (StyledPlayerControlView.this.f9350J0 == null) {
                return false;
            }
            if (i == 0) {
                return StyledPlayerControlView.this.f9350J0.isCommandAvailable(13);
            }
            if (i != 1) {
                return true;
            }
            return StyledPlayerControlView.this.f9350J0.isCommandAvailable(30) && StyledPlayerControlView.this.f9350J0.isCommandAvailable(29);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f9417a.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }

        /* JADX INFO: renamed from: y */
        public boolean m12080y() {
            return m12079D(1) || m12079D(0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C2044g c2044g, int i) {
            if (m12079D(i)) {
                c2044g.itemView.setLayoutParams(new RecyclerView.C0580p(-1, -2));
            } else {
                c2044g.itemView.setLayoutParams(new RecyclerView.C0580p(0, 0));
            }
            c2044g.f9413a.setText(this.f9417a[i]);
            if (this.f9418b[i] == null) {
                c2044g.f9414b.setVisibility(8);
            } else {
                c2044g.f9414b.setText(this.f9418b[i]);
            }
            if (this.f9419c[i] == null) {
                c2044g.f9415c.setVisibility(8);
            } else {
                c2044g.f9415c.setImageDrawable(this.f9419c[i]);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$i */
    public static class C2046i extends RecyclerView.AbstractC0569e0 {

        /* JADX INFO: renamed from: a */
        public final TextView f9421a;

        /* JADX INFO: renamed from: b */
        public final View f9422b;

        public C2046i(View view) {
            super(view);
            if (bmk0.f77313a < 26) {
                view.setFocusable(true);
            }
            this.f9421a = (TextView) view.findViewById(lcc0.f131319S);
            this.f9422b = view.findViewById(lcc0.f131329h);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$j */
    public final class C2047j extends AbstractC2049l {
        public C2047j() {
            super();
        }

        /* JADX INFO: renamed from: F */
        public static /* synthetic */ void m12082F(C2047j c2047j, View view) {
            if (StyledPlayerControlView.this.f9350J0 == null || !StyledPlayerControlView.this.f9350J0.isCommandAvailable(29)) {
                return;
            }
            StyledPlayerControlView.this.f9350J0.setTrackSelectionParameters(StyledPlayerControlView.this.f9350J0.getTrackSelectionParameters().mo97663A().mo97692B(3).mo97695F(-3).mo97691A());
            StyledPlayerControlView.this.f9389k.dismiss();
        }

        @Override // com.google.android.exoplayer2.p031ui.StyledPlayerControlView.AbstractC2049l, androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C2046i c2046i, int i) {
            super.onBindViewHolder(c2046i, i);
            if (i > 0) {
                c2046i.f9422b.setVisibility(this.f9427a.get(i + (-1)).m12085a() ? 0 : 4);
            }
        }

        @Override // com.google.android.exoplayer2.p031ui.StyledPlayerControlView.AbstractC2049l
        /* JADX INFO: renamed from: C */
        public void mo12063C(C2046i c2046i) {
            boolean z;
            c2046i.f9421a.setText(R$string.f9331x);
            int i = 0;
            while (true) {
                if (i >= this.f9427a.size()) {
                    z = true;
                    break;
                } else {
                    if (this.f9427a.get(i).m12085a()) {
                        z = false;
                        break;
                    }
                    i++;
                }
            }
            c2046i.f9422b.setVisibility(z ? 0 : 4);
            c2046i.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.ebg0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StyledPlayerControlView.C2047j.m12082F(this.f92925a, view);
                }
            });
        }

        @Override // com.google.android.exoplayer2.p031ui.StyledPlayerControlView.AbstractC2049l
        /* JADX INFO: renamed from: E */
        public void mo12064E(String str) {
        }

        /* JADX INFO: renamed from: G */
        public void m12084G(List<C2048k> list) {
            boolean z = false;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).m12085a()) {
                    z = true;
                    break;
                }
            }
            if (StyledPlayerControlView.this.f9403w != null) {
                ImageView imageView = StyledPlayerControlView.this.f9403w;
                StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                imageView.setImageDrawable(z ? styledPlayerControlView.f9375W : styledPlayerControlView.f9390k0);
                ImageView imageView2 = StyledPlayerControlView.this.f9403w;
                StyledPlayerControlView styledPlayerControlView2 = StyledPlayerControlView.this;
                imageView2.setContentDescription(z ? styledPlayerControlView2.f9396p0 : styledPlayerControlView2.f9340E0);
            }
            this.f9427a = list;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$k */
    public static final class C2048k {

        /* JADX INFO: renamed from: a */
        public final C1861d0.a f9424a;

        /* JADX INFO: renamed from: b */
        public final int f9425b;

        /* JADX INFO: renamed from: c */
        public final String f9426c;

        public C2048k(C1861d0 c1861d0, int i, int i2, String str) {
            this.f9424a = c1861d0.m9841b().get(i);
            this.f9425b = i2;
            this.f9426c = str;
        }

        /* JADX INFO: renamed from: a */
        public boolean m12085a() {
            return this.f9424a.m9853h(this.f9425b);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$l */
    public abstract class AbstractC2049l extends RecyclerView.Adapter<C2046i> {

        /* JADX INFO: renamed from: a */
        public List<C2048k> f9427a = new ArrayList();

        public AbstractC2049l() {
        }

        /* JADX INFO: renamed from: y */
        public static /* synthetic */ void m12086y(AbstractC2049l abstractC2049l, InterfaceC2026t interfaceC2026t, dfj0 dfj0Var, C2048k c2048k, View view) {
            abstractC2049l.getClass();
            if (interfaceC2026t.isCommandAvailable(29)) {
                interfaceC2026t.setTrackSelectionParameters(interfaceC2026t.getTrackSelectionParameters().mo97663A().mo97696G(new yfj0(dfj0Var, ImmutableList.m15740of(Integer.valueOf(c2048k.f9425b)))).mo97699J(c2048k.f9424a.m9849d(), false).mo97691A());
                abstractC2049l.mo12064E(c2048k.f9426c);
                StyledPlayerControlView.this.f9389k.dismiss();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: A */
        public void onBindViewHolder(C2046i c2046i, int i) {
            final InterfaceC2026t interfaceC2026t = StyledPlayerControlView.this.f9350J0;
            if (interfaceC2026t == null) {
                return;
            }
            if (i == 0) {
                mo12063C(c2046i);
                return;
            }
            final C2048k c2048k = this.f9427a.get(i - 1);
            final dfj0 dfj0VarM9847b = c2048k.f9424a.m9847b();
            boolean z = interfaceC2026t.getTrackSelectionParameters().f71218y.get(dfj0VarM9847b) != null && c2048k.m12085a();
            c2046i.f9421a.setText(c2048k.f9426c);
            c2046i.f9422b.setVisibility(z ? 0 : 4);
            c2046i.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.fbg0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StyledPlayerControlView.AbstractC2049l.m12086y(this.f98106a, interfaceC2026t, dfj0VarM9847b, c2048k, view);
                }
            });
        }

        /* JADX INFO: renamed from: C */
        public abstract void mo12063C(C2046i c2046i);

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public C2046i onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C2046i(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(hfc0.f109275h, viewGroup, false));
        }

        /* JADX INFO: renamed from: E */
        public abstract void mo12064E(String str);

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            if (this.f9427a.isEmpty()) {
                return 0;
            }
            return this.f9427a.size() + 1;
        }

        /* JADX INFO: renamed from: z */
        public void m12088z() {
            this.f9427a = Collections.EMPTY_LIST;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$m */
    @Deprecated
    public interface InterfaceC2050m {
        /* JADX INFO: renamed from: u */
        void mo12089u(int i);
    }

    static {
        t9f.m189752a("goog.exo.ui");
        f9334Z0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
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
        ViewOnClickListenerC2040c viewOnClickListenerC2040c;
        ImageView imageView;
        TextView textView;
        Context context2;
        boolean z9;
        super(context, attributeSet, i);
        int resourceId = hfc0.f109271d;
        this.f9364Q0 = 5000;
        this.f9368S0 = 0;
        this.f9366R0 = 200;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, ygc0.f199765P, i, 0);
            try {
                resourceId = typedArrayObtainStyledAttributes.getResourceId(ygc0.f199767R, resourceId);
                this.f9364Q0 = typedArrayObtainStyledAttributes.getInt(ygc0.f199775Z, this.f9364Q0);
                this.f9368S0 = m11998W(typedArrayObtainStyledAttributes, this.f9368S0);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(ygc0.f199772W, true);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(ygc0.f199769T, true);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(ygc0.f199771V, true);
                boolean z13 = typedArrayObtainStyledAttributes.getBoolean(ygc0.f199770U, true);
                boolean z14 = typedArrayObtainStyledAttributes.getBoolean(ygc0.f199773X, false);
                boolean z15 = typedArrayObtainStyledAttributes.getBoolean(ygc0.f199774Y, false);
                boolean z16 = typedArrayObtainStyledAttributes.getBoolean(ygc0.f199777a0, false);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(ygc0.f199779b0, this.f9366R0));
                boolean z17 = typedArrayObtainStyledAttributes.getBoolean(ygc0.f199766Q, true);
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
        ViewOnClickListenerC2040c viewOnClickListenerC2040c2 = new ViewOnClickListenerC2040c();
        this.f9381c = viewOnClickListenerC2040c2;
        this.f9382d = new CopyOnWriteArrayList<>();
        this.f9345H = new AbstractC1857c0.b();
        this.f9347I = new AbstractC1857c0.d();
        StringBuilder sb = new StringBuilder();
        this.f9341F = sb;
        this.f9343G = new Formatter(sb, Locale.getDefault());
        this.f9370T0 = new long[0];
        this.f9372U0 = new boolean[0];
        this.f9374V0 = new long[0];
        this.f9376W0 = new boolean[0];
        this.f9349J = new Runnable() { // from class: l.yag0
            @Override // java.lang.Runnable
            public final void run() {
                this.f198184a.m12058w0();
            }
        };
        this.f9337C = (TextView) findViewById(lcc0.f131334m);
        this.f9338D = (TextView) findViewById(lcc0.f131306F);
        ImageView imageView2 = (ImageView) findViewById(lcc0.f131317Q);
        this.f9403w = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(viewOnClickListenerC2040c2);
        }
        ImageView imageView3 = (ImageView) findViewById(lcc0.f131340s);
        this.f9404x = imageView3;
        m12000a0(imageView3, new View.OnClickListener() { // from class: l.zag0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203562a.m12042f0(view);
            }
        });
        ImageView imageView4 = (ImageView) findViewById(lcc0.f131344w);
        this.f9405y = imageView4;
        m12000a0(imageView4, new View.OnClickListener() { // from class: l.zag0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203562a.m12042f0(view);
            }
        });
        View viewFindViewById = findViewById(lcc0.f131313M);
        this.f9406z = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(viewOnClickListenerC2040c2);
        }
        View viewFindViewById2 = findViewById(lcc0.f131305E);
        this.f9335A = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(viewOnClickListenerC2040c2);
        }
        View viewFindViewById3 = findViewById(lcc0.f131324c);
        this.f9336B = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(viewOnClickListenerC2040c2);
        }
        InterfaceC2061b interfaceC2061b = (InterfaceC2061b) findViewById(lcc0.f131308H);
        View viewFindViewById4 = findViewById(lcc0.f131309I);
        if (interfaceC2061b != null) {
            this.f9339E = interfaceC2061b;
            viewOnClickListenerC2040c = viewOnClickListenerC2040c2;
            imageView = imageView2;
            textView = null;
            context2 = context;
        } else if (viewFindViewById4 != null) {
            viewOnClickListenerC2040c = viewOnClickListenerC2040c2;
            imageView = imageView2;
            textView = null;
            context2 = context;
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context2, null, 0, attributeSet2, qgc0.f157402a);
            defaultTimeBar.setId(lcc0.f131308H);
            defaultTimeBar.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.f9339E = defaultTimeBar;
        } else {
            viewOnClickListenerC2040c = viewOnClickListenerC2040c2;
            imageView = imageView2;
            textView = null;
            context2 = context;
            this.f9339E = null;
        }
        InterfaceC2061b interfaceC2061b2 = this.f9339E;
        if (interfaceC2061b2 != null) {
            interfaceC2061b2.mo11868b(viewOnClickListenerC2040c);
        }
        View viewFindViewById5 = findViewById(lcc0.f131304D);
        this.f9394o = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(viewOnClickListenerC2040c);
        }
        View viewFindViewById6 = findViewById(lcc0.f131307G);
        this.f9392m = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(viewOnClickListenerC2040c);
        }
        View viewFindViewById7 = findViewById(lcc0.f131345x);
        this.f9393n = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(viewOnClickListenerC2040c);
        }
        Typeface typefaceM108036f = c5d0.m108036f(context2, dcc0.f87777a);
        View viewFindViewById8 = findViewById(lcc0.f131311K);
        TextView textView2 = viewFindViewById8 == null ? (TextView) findViewById(lcc0.f131312L) : textView;
        this.f9399s = textView2;
        if (textView2 != null) {
            textView2.setTypeface(typefaceM108036f);
        }
        viewFindViewById8 = viewFindViewById8 == null ? textView2 : viewFindViewById8;
        this.f9397q = viewFindViewById8;
        if (viewFindViewById8 != null) {
            viewFindViewById8.setOnClickListener(viewOnClickListenerC2040c);
        }
        View viewFindViewById9 = findViewById(lcc0.f131338q);
        TextView textView3 = viewFindViewById9 == null ? (TextView) findViewById(lcc0.f131339r) : null;
        this.f9398r = textView3;
        if (textView3 != null) {
            textView3.setTypeface(typefaceM108036f);
        }
        viewFindViewById9 = viewFindViewById9 == null ? textView3 : viewFindViewById9;
        this.f9395p = viewFindViewById9;
        if (viewFindViewById9 != null) {
            viewFindViewById9.setOnClickListener(viewOnClickListenerC2040c);
        }
        ImageView imageView5 = (ImageView) findViewById(lcc0.f131310J);
        this.f9400t = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(viewOnClickListenerC2040c);
        }
        ImageView imageView6 = (ImageView) findViewById(lcc0.f131314N);
        this.f9401u = imageView6;
        if (imageView6 != null) {
            imageView6.setOnClickListener(viewOnClickListenerC2040c);
        }
        Resources resources = context2.getResources();
        this.f9380b = resources;
        boolean z18 = z3;
        this.f9367S = resources.getInteger(ydc0.f198591b) / 100.0f;
        this.f9369T = resources.getInteger(ydc0.f198590a) / 100.0f;
        View viewFindViewById10 = findViewById(lcc0.f131321U);
        this.f9402v = viewFindViewById10;
        boolean z19 = z2;
        if (viewFindViewById10 != null) {
            m12052p0(false, viewFindViewById10);
        }
        tbg0 tbg0Var = new tbg0(this);
        this.f9379a = tbg0Var;
        tbg0Var.m190058T(z4);
        boolean z20 = z;
        C2045h c2045h = new C2045h(new String[]{resources.getString(R$string.f9315h), resources.getString(R$string.f9332y)}, new Drawable[]{bmk0.m105109W(context2, resources, zbc0.f203658s), bmk0.m105109W(context2, resources, zbc0.f203648i)});
        this.f9384f = c2045h;
        this.f9391l = resources.getDimensionPixelSize(sac0.f167026a);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context2).inflate(hfc0.f109273f, (ViewGroup) null);
        this.f9383e = recyclerView;
        recyclerView.setAdapter(c2045h);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.f9389k = popupWindow;
        if (bmk0.f77313a < 23) {
            z9 = false;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            z9 = false;
        }
        popupWindow.setOnDismissListener(viewOnClickListenerC2040c);
        this.f9378Y0 = true;
        this.f9388j = new qsd(getResources());
        this.f9375W = bmk0.m105109W(context2, resources, zbc0.f203660u);
        this.f9390k0 = bmk0.m105109W(context2, resources, zbc0.f203659t);
        this.f9396p0 = resources.getString(R$string.f9309b);
        this.f9340E0 = resources.getString(R$string.f9308a);
        this.f9386h = new C2047j();
        this.f9387i = new C2039b();
        this.f9385g = new C2042e(resources.getStringArray(g8c0.f102677a), f9334Z0);
        this.f9342F0 = bmk0.m105109W(context2, resources, zbc0.f203650k);
        this.f9344G0 = bmk0.m105109W(context2, resources, zbc0.f203649j);
        this.f9351K = bmk0.m105109W(context2, resources, zbc0.f203654o);
        this.f9353L = bmk0.m105109W(context2, resources, zbc0.f203655p);
        this.f9355M = bmk0.m105109W(context2, resources, zbc0.f203653n);
        this.f9363Q = bmk0.m105109W(context2, resources, zbc0.f203657r);
        this.f9365R = bmk0.m105109W(context2, resources, zbc0.f203656q);
        this.f9346H0 = resources.getString(R$string.f9311d);
        this.f9348I0 = resources.getString(R$string.f9310c);
        this.f9357N = resources.getString(R$string.f9317j);
        this.f9359O = resources.getString(R$string.f9318k);
        this.f9361P = resources.getString(R$string.f9316i);
        this.f9371U = resources.getString(R$string.f9321n);
        this.f9373V = resources.getString(R$string.f9320m);
        tbg0Var.m190059U((ViewGroup) findViewById(lcc0.f131326e), true);
        tbg0Var.m190059U(viewFindViewById9, z6);
        tbg0Var.m190059U(viewFindViewById8, z5);
        tbg0Var.m190059U(viewFindViewById6, z7);
        tbg0Var.m190059U(viewFindViewById7, z8);
        tbg0Var.m190059U(imageView6, z20);
        tbg0Var.m190059U(imageView, z19);
        tbg0Var.m190059U(viewFindViewById10, z18);
        tbg0Var.m190059U(imageView5, this.f9368S0 != 0 ? true : z9);
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.abg0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                this.f69620a.m12043g0(view, i2, i3, i4, i5, i6, i7, i8, i9);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public static boolean m11997S(InterfaceC2026t interfaceC2026t, AbstractC1857c0.d dVar) {
        AbstractC1857c0 currentTimeline;
        int iMo9775t;
        if (!interfaceC2026t.isCommandAvailable(17) || (iMo9775t = (currentTimeline = interfaceC2026t.getCurrentTimeline()).mo9775t()) <= 1 || iMo9775t > 100) {
            return false;
        }
        for (int i = 0; i < iMo9775t; i++) {
            if (currentTimeline.m9774r(i, dVar).f7378n == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: W */
    public static int m11998W(TypedArray typedArray, int i) {
        return typedArray.getInt(ygc0.f199768S, i);
    }

    /* JADX INFO: renamed from: a0 */
    public static void m12000a0(View view, View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        view.setVisibility(8);
        view.setOnClickListener(onClickListener);
    }

    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: c0 */
    public static boolean m12003c0(int i) {
        return i == 90 || i == 89 || i == 85 || i == 79 || i == 126 || i == 127 || i == 87 || i == 88;
    }

    /* JADX INFO: renamed from: s0 */
    public static void m12020s0(@Nullable View view, boolean z) {
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
        InterfaceC2026t interfaceC2026t = this.f9350J0;
        if (interfaceC2026t == null || !interfaceC2026t.isCommandAvailable(13)) {
            return;
        }
        InterfaceC2026t interfaceC2026t2 = this.f9350J0;
        interfaceC2026t2.setPlaybackParameters(interfaceC2026t2.getPlaybackParameters().m10952c(f));
    }

    /* JADX INFO: renamed from: A0 */
    public final void m12028A0() {
        this.f9383e.measure(0, 0);
        this.f9389k.setWidth(Math.min(this.f9383e.getMeasuredWidth(), getWidth() - (this.f9391l * 2)));
        this.f9389k.setHeight(Math.min(getHeight() - (this.f9391l * 2), this.f9383e.getMeasuredHeight()));
    }

    /* JADX INFO: renamed from: B0 */
    public final void m12029B0() {
        ImageView imageView;
        if (m12040d0() && this.f9356M0 && (imageView = this.f9401u) != null) {
            InterfaceC2026t interfaceC2026t = this.f9350J0;
            if (!this.f9379a.m190041A(imageView)) {
                m12052p0(false, this.f9401u);
                return;
            }
            if (interfaceC2026t == null || !interfaceC2026t.isCommandAvailable(14)) {
                m12052p0(false, this.f9401u);
                this.f9401u.setImageDrawable(this.f9365R);
                this.f9401u.setContentDescription(this.f9373V);
            } else {
                m12052p0(true, this.f9401u);
                this.f9401u.setImageDrawable(interfaceC2026t.getShuffleModeEnabled() ? this.f9363Q : this.f9365R);
                this.f9401u.setContentDescription(interfaceC2026t.getShuffleModeEnabled() ? this.f9371U : this.f9373V);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0116  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v6, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX INFO: renamed from: C0 */
    public final void m12030C0() {
        int i;
        long jM105084J0;
        AbstractC1857c0.d dVar;
        long j;
        InterfaceC2026t interfaceC2026t = this.f9350J0;
        if (interfaceC2026t == null) {
            return;
        }
        boolean z = true;
        this.f9360O0 = this.f9358N0 && m11997S(interfaceC2026t, this.f9347I);
        long j2 = 0;
        this.f9377X0 = 0L;
        AbstractC1857c0 currentTimeline = interfaceC2026t.isCommandAvailable(17) ? interfaceC2026t.getCurrentTimeline() : AbstractC1857c0.f7326a;
        long j3 = -9223372036854775807L;
        if (!currentTimeline.m9776u()) {
            int currentMediaItemIndex = interfaceC2026t.getCurrentMediaItemIndex();
            boolean z2 = this.f9360O0;
            int i2 = z2 ? 0 : currentMediaItemIndex;
            int iMo9775t = z2 ? currentTimeline.mo9775t() - 1 : currentMediaItemIndex;
            i = 0;
            long j4 = 0;
            while (i2 <= iMo9775t) {
                if (i2 == currentMediaItemIndex) {
                    this.f9377X0 = bmk0.m105152l1(j4);
                }
                currentTimeline.m9774r(i2, this.f9347I);
                AbstractC1857c0.d dVar2 = this.f9347I;
                boolean z3 = z;
                long j5 = j2;
                if (dVar2.f7378n == j3) {
                    w11.m204371g(this.f9360O0 ^ z3);
                    break;
                }
                int i3 = dVar2.f7379o;
                while (true) {
                    dVar = this.f9347I;
                    if (i3 <= dVar.f7380p) {
                        currentTimeline.m9770j(i3, this.f9345H);
                        int iM9795r = this.f9345H.m9795r();
                        int iM9783f = this.f9345H.m9783f();
                        while (iM9795r < iM9783f) {
                            long jM9786i = this.f9345H.m9786i(iM9795r);
                            if (jM9786i == Long.MIN_VALUE) {
                                j = j3;
                                long j6 = this.f9345H.f7340d;
                                if (j6 != j) {
                                    jM9786i = j6;
                                }
                                iM9795r++;
                                j3 = j;
                            } else {
                                j = j3;
                            }
                            long jM9794q = jM9786i + this.f9345H.m9794q();
                            if (jM9794q >= j5) {
                                long[] jArr = this.f9370T0;
                                if (i == jArr.length) {
                                    ?? length = jArr.length == 0 ? z3 : jArr.length * 2;
                                    this.f9370T0 = Arrays.copyOf(jArr, (int) length);
                                    this.f9372U0 = Arrays.copyOf(this.f9372U0, (int) length);
                                }
                                this.f9370T0[i] = bmk0.m105152l1(j4 + jM9794q);
                                this.f9372U0[i] = this.f9345H.m9796s(iM9795r);
                                i++;
                            }
                            iM9795r++;
                            j3 = j;
                        }
                        i3++;
                    }
                }
                j4 += dVar.f7378n;
                i2++;
                z = z3;
                j2 = j5;
            }
            jM105084J0 = j4;
        } else if (interfaceC2026t.isCommandAvailable(16)) {
            long contentDuration = interfaceC2026t.getContentDuration();
            if (contentDuration != -9223372036854775807L) {
                jM105084J0 = bmk0.m105084J0(contentDuration);
                i = 0;
            } else {
                i = 0;
                jM105084J0 = 0;
            }
        } else {
            i = 0;
            jM105084J0 = 0;
        }
        long jM105152l1 = bmk0.m105152l1(jM105084J0);
        TextView textView = this.f9337C;
        if (textView != null) {
            textView.setText(bmk0.m105148k0(this.f9341F, this.f9343G, jM105152l1));
        }
        InterfaceC2061b interfaceC2061b = this.f9339E;
        if (interfaceC2061b != null) {
            interfaceC2061b.setDuration(jM105152l1);
            int length2 = this.f9374V0.length;
            int i4 = i + length2;
            long[] jArr2 = this.f9370T0;
            if (i4 > jArr2.length) {
                this.f9370T0 = Arrays.copyOf(jArr2, i4);
                this.f9372U0 = Arrays.copyOf(this.f9372U0, i4);
            }
            System.arraycopy(this.f9374V0, 0, this.f9370T0, i, length2);
            System.arraycopy(this.f9376W0, 0, this.f9372U0, i, length2);
            this.f9339E.mo11867a(this.f9370T0, this.f9372U0, i4);
        }
        m12058w0();
    }

    /* JADX INFO: renamed from: D0 */
    public final void m12031D0() {
        m12038Z();
        m12052p0(this.f9386h.getItemCount() > 0, this.f9403w);
        m12061z0();
    }

    @Deprecated
    /* JADX INFO: renamed from: R */
    public void m12032R(InterfaceC2050m interfaceC2050m) {
        w11.m204369e(interfaceC2050m);
        this.f9382d.add(interfaceC2050m);
    }

    /* JADX INFO: renamed from: T */
    public boolean m12033T(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        InterfaceC2026t interfaceC2026t = this.f9350J0;
        if (interfaceC2026t == null || !m12003c0(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (interfaceC2026t.getPlaybackState() == 4 || !interfaceC2026t.isCommandAvailable(12)) {
                return true;
            }
            interfaceC2026t.seekForward();
            return true;
        }
        if (keyCode == 89 && interfaceC2026t.isCommandAvailable(11)) {
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
            if (!interfaceC2026t.isCommandAvailable(9)) {
                return true;
            }
            interfaceC2026t.seekToNext();
            return true;
        }
        if (keyCode == 88) {
            if (!interfaceC2026t.isCommandAvailable(7)) {
                return true;
            }
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

    /* JADX INFO: renamed from: U */
    public final void m12034U(RecyclerView.Adapter<?> adapter, View view) {
        this.f9383e.setAdapter(adapter);
        m12028A0();
        this.f9378Y0 = false;
        this.f9389k.dismiss();
        this.f9378Y0 = true;
        this.f9389k.showAsDropDown(view, (getWidth() - this.f9389k.getWidth()) - this.f9391l, (-this.f9389k.getHeight()) - this.f9391l);
    }

    /* JADX INFO: renamed from: V */
    public final ImmutableList<C2048k> m12035V(C1861d0 c1861d0, int i) {
        ImmutableList.C2804a c2804a = new ImmutableList.C2804a();
        ImmutableList<C1861d0.a> immutableListM9841b = c1861d0.m9841b();
        for (int i2 = 0; i2 < immutableListM9841b.size(); i2++) {
            C1861d0.a aVar = immutableListM9841b.get(i2);
            if (aVar.m9849d() == i) {
                for (int i3 = 0; i3 < aVar.f7406a; i3++) {
                    if (aVar.m9854i(i3)) {
                        C1894k c1894kM9848c = aVar.m9848c(i3);
                        if ((c1894kM9848c.f7777d & 2) == 0) {
                            c2804a.mo15737a(new C2048k(c1861d0, i2, i3, this.f9388j.mo172102a(c1894kM9848c)));
                        }
                    }
                }
            }
        }
        return c2804a.m15756m();
    }

    /* JADX INFO: renamed from: X */
    public void m12036X() {
        this.f9379a.m190042C();
    }

    /* JADX INFO: renamed from: Y */
    public void m12037Y() {
        this.f9379a.m190045F();
    }

    /* JADX INFO: renamed from: Z */
    public final void m12038Z() {
        this.f9386h.m12088z();
        this.f9387i.m12088z();
        InterfaceC2026t interfaceC2026t = this.f9350J0;
        if (interfaceC2026t != null && interfaceC2026t.isCommandAvailable(30) && this.f9350J0.isCommandAvailable(29)) {
            C1861d0 currentTracks = this.f9350J0.getCurrentTracks();
            this.f9387i.m12066H(m12035V(currentTracks, 1));
            boolean zM190041A = this.f9379a.m190041A(this.f9403w);
            C2047j c2047j = this.f9386h;
            if (zM190041A) {
                c2047j.m12084G(m12035V(currentTracks, 3));
            } else {
                c2047j.m12084G(ImmutableList.m15739of());
            }
        }
    }

    /* JADX INFO: renamed from: b0 */
    public boolean m12039b0() {
        return this.f9379a.m190048I();
    }

    /* JADX INFO: renamed from: d0 */
    public boolean m12040d0() {
        return getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return m12033T(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX INFO: renamed from: e0 */
    public void m12041e0() {
        Iterator<InterfaceC2050m> it = this.f9382d.iterator();
        while (it.hasNext()) {
            it.next().mo12089u(getVisibility());
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m12042f0(View view) {
        if (this.f9352K0 == null) {
            return;
        }
        boolean z = !this.f9354L0;
        this.f9354L0 = z;
        m12054r0(this.f9404x, z);
        m12054r0(this.f9405y, this.f9354L0);
        InterfaceC2041d interfaceC2041d = this.f9352K0;
        if (interfaceC2041d != null) {
            interfaceC2041d.mo12067L(this.f9354L0);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m12043g0(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i4 - i2;
        int i10 = i8 - i6;
        if (!(i3 - i == i7 - i5 && i9 == i10) && this.f9389k.isShowing()) {
            m12028A0();
            this.f9389k.update(view, (getWidth() - this.f9389k.getWidth()) - this.f9391l, (-this.f9389k.getHeight()) - this.f9391l, -1, -1);
        }
    }

    @Nullable
    public InterfaceC2026t getPlayer() {
        return this.f9350J0;
    }

    public int getRepeatToggleModes() {
        return this.f9368S0;
    }

    public boolean getShowShuffleButton() {
        return this.f9379a.m190041A(this.f9401u);
    }

    public boolean getShowSubtitleButton() {
        return this.f9379a.m190041A(this.f9403w);
    }

    public int getShowTimeoutMs() {
        return this.f9364Q0;
    }

    public boolean getShowVrButton() {
        return this.f9379a.m190041A(this.f9402v);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m12044h0(int i) {
        if (i == 0) {
            m12034U(this.f9385g, (View) w11.m204369e(this.f9406z));
        } else if (i == 1) {
            m12034U(this.f9387i, (View) w11.m204369e(this.f9406z));
        } else {
            this.f9389k.dismiss();
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: i0 */
    public void m12045i0(InterfaceC2050m interfaceC2050m) {
        this.f9382d.remove(interfaceC2050m);
    }

    /* JADX INFO: renamed from: j0 */
    public void m12046j0() {
        View view = this.f9394o;
        if (view != null) {
            view.requestFocus();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m12047k0(InterfaceC2026t interfaceC2026t, long j) {
        if (this.f9360O0) {
            if (interfaceC2026t.isCommandAvailable(17) && interfaceC2026t.isCommandAvailable(10)) {
                AbstractC1857c0 currentTimeline = interfaceC2026t.getCurrentTimeline();
                int iMo9775t = currentTimeline.mo9775t();
                int i = 0;
                while (true) {
                    long jM9806f = currentTimeline.m9774r(i, this.f9347I).m9806f();
                    if (j < jM9806f) {
                        break;
                    }
                    if (i == iMo9775t - 1) {
                        j = jM9806f;
                        break;
                    } else {
                        j -= jM9806f;
                        i++;
                    }
                }
                interfaceC2026t.seekTo(i, j);
            }
        } else if (interfaceC2026t.isCommandAvailable(5)) {
            interfaceC2026t.seekTo(j);
        }
        m12058w0();
    }

    /* JADX INFO: renamed from: l0 */
    public void m12048l0(@Nullable long[] jArr, @Nullable boolean[] zArr) {
        if (jArr == null) {
            this.f9374V0 = new long[0];
            this.f9376W0 = new boolean[0];
        } else {
            boolean[] zArr2 = (boolean[]) w11.m204369e(zArr);
            w11.m204365a(jArr.length == zArr2.length);
            this.f9374V0 = jArr;
            this.f9376W0 = zArr2;
        }
        m12030C0();
    }

    /* JADX INFO: renamed from: m0 */
    public final boolean m12049m0() {
        InterfaceC2026t interfaceC2026t = this.f9350J0;
        if (interfaceC2026t == null || !interfaceC2026t.isCommandAvailable(1)) {
            return false;
        }
        return (this.f9350J0.isCommandAvailable(17) && this.f9350J0.getCurrentTimeline().m9776u()) ? false : true;
    }

    /* JADX INFO: renamed from: n0 */
    public void m12050n0() {
        this.f9379a.m190062X();
    }

    /* JADX INFO: renamed from: o0 */
    public void m12051o0() {
        m12056u0();
        m12055t0();
        m12059x0();
        m12029B0();
        m12031D0();
        m12057v0();
        m12030C0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9379a.m190049K();
        this.f9356M0 = true;
        if (m12039b0()) {
            this.f9379a.m190057S();
        }
        m12051o0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f9379a.m190050L();
        this.f9356M0 = false;
        removeCallbacks(this.f9349J);
        this.f9379a.m190056R();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f9379a.m190051M(z, i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m12052p0(boolean z, @Nullable View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? this.f9367S : this.f9369T);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m12053q0() {
        InterfaceC2026t interfaceC2026t = this.f9350J0;
        int seekForwardIncrement = (int) ((interfaceC2026t != null ? interfaceC2026t.getSeekForwardIncrement() : 15000L) / 1000);
        TextView textView = this.f9398r;
        if (textView != null) {
            textView.setText(String.valueOf(seekForwardIncrement));
        }
        View view = this.f9395p;
        if (view != null) {
            view.setContentDescription(this.f9380b.getQuantityString(sfc0.f167685a, seekForwardIncrement, Integer.valueOf(seekForwardIncrement)));
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m12054r0(@Nullable ImageView imageView, boolean z) {
        if (imageView == null) {
            return;
        }
        if (z) {
            imageView.setImageDrawable(this.f9342F0);
            imageView.setContentDescription(this.f9346H0);
        } else {
            imageView.setImageDrawable(this.f9344G0);
            imageView.setContentDescription(this.f9348I0);
        }
    }

    public void setAnimationEnabled(boolean z) {
        this.f9379a.m190058T(z);
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(@Nullable InterfaceC2041d interfaceC2041d) {
        this.f9352K0 = interfaceC2041d;
        m12020s0(this.f9404x, interfaceC2041d != null);
        m12020s0(this.f9405y, interfaceC2041d != null);
    }

    public void setPlayer(@Nullable InterfaceC2026t interfaceC2026t) {
        w11.m204371g(Looper.myLooper() == Looper.getMainLooper());
        w11.m204365a(interfaceC2026t == null || interfaceC2026t.getApplicationLooper() == Looper.getMainLooper());
        InterfaceC2026t interfaceC2026t2 = this.f9350J0;
        if (interfaceC2026t2 == interfaceC2026t) {
            return;
        }
        if (interfaceC2026t2 != null) {
            interfaceC2026t2.removeListener(this.f9381c);
        }
        this.f9350J0 = interfaceC2026t;
        if (interfaceC2026t != null) {
            interfaceC2026t.addListener(this.f9381c);
        }
        m12051o0();
    }

    public void setProgressUpdateListener(@Nullable InterfaceC2043f interfaceC2043f) {
    }

    public void setRepeatToggleModes(int i) {
        this.f9368S0 = i;
        InterfaceC2026t interfaceC2026t = this.f9350J0;
        if (interfaceC2026t != null && interfaceC2026t.isCommandAvailable(15)) {
            int repeatMode = this.f9350J0.getRepeatMode();
            if (i == 0 && repeatMode != 0) {
                this.f9350J0.setRepeatMode(0);
            } else if (i == 1 && repeatMode == 2) {
                this.f9350J0.setRepeatMode(1);
            } else if (i == 2 && repeatMode == 1) {
                this.f9350J0.setRepeatMode(2);
            }
        }
        this.f9379a.m190059U(this.f9400t, i != 0);
        m12059x0();
    }

    public void setShowFastForwardButton(boolean z) {
        this.f9379a.m190059U(this.f9395p, z);
        m12055t0();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.f9358N0 = z;
        m12030C0();
    }

    public void setShowNextButton(boolean z) {
        this.f9379a.m190059U(this.f9393n, z);
        m12055t0();
    }

    public void setShowPreviousButton(boolean z) {
        this.f9379a.m190059U(this.f9392m, z);
        m12055t0();
    }

    public void setShowRewindButton(boolean z) {
        this.f9379a.m190059U(this.f9397q, z);
        m12055t0();
    }

    public void setShowShuffleButton(boolean z) {
        this.f9379a.m190059U(this.f9401u, z);
        m12029B0();
    }

    public void setShowSubtitleButton(boolean z) {
        this.f9379a.m190059U(this.f9403w, z);
    }

    public void setShowTimeoutMs(int i) {
        this.f9364Q0 = i;
        if (m12039b0()) {
            this.f9379a.m190057S();
        }
    }

    public void setShowVrButton(boolean z) {
        this.f9379a.m190059U(this.f9402v, z);
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.f9366R0 = bmk0.m105162q(i, 16, 1000);
    }

    public void setVrButtonListener(@Nullable View.OnClickListener onClickListener) {
        View view = this.f9402v;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            m12052p0(onClickListener != null, this.f9402v);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m12055t0() {
        boolean zIsCommandAvailable;
        boolean zIsCommandAvailable2;
        boolean zIsCommandAvailable3;
        boolean zIsCommandAvailable4;
        boolean zIsCommandAvailable5;
        if (m12040d0() && this.f9356M0) {
            InterfaceC2026t interfaceC2026t = this.f9350J0;
            if (interfaceC2026t != null) {
                zIsCommandAvailable = (this.f9358N0 && m11997S(interfaceC2026t, this.f9347I)) ? interfaceC2026t.isCommandAvailable(10) : interfaceC2026t.isCommandAvailable(5);
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
            if (zIsCommandAvailable4) {
                m12060y0();
            }
            if (zIsCommandAvailable5) {
                m12053q0();
            }
            m12052p0(zIsCommandAvailable3, this.f9392m);
            m12052p0(zIsCommandAvailable4, this.f9397q);
            m12052p0(zIsCommandAvailable5, this.f9395p);
            m12052p0(zIsCommandAvailable2, this.f9393n);
            InterfaceC2061b interfaceC2061b = this.f9339E;
            if (interfaceC2061b != null) {
                interfaceC2061b.setEnabled(zIsCommandAvailable);
            }
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m12056u0() {
        if (m12040d0() && this.f9356M0 && this.f9394o != null) {
            boolean zM105116Z0 = bmk0.m105116Z0(this.f9350J0);
            int i = zM105116Z0 ? zbc0.f203652m : zbc0.f203651l;
            int i2 = zM105116Z0 ? R$string.f9314g : R$string.f9313f;
            ((ImageView) this.f9394o).setImageDrawable(bmk0.m105109W(getContext(), this.f9380b, i));
            this.f9394o.setContentDescription(this.f9380b.getString(i2));
            m12052p0(m12049m0(), this.f9394o);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m12057v0() {
        InterfaceC2026t interfaceC2026t = this.f9350J0;
        if (interfaceC2026t == null) {
            return;
        }
        this.f9385g.m12071D(interfaceC2026t.getPlaybackParameters().f8288a);
        this.f9384f.m12078C(0, this.f9385g.m12072z());
        m12061z0();
    }

    /* JADX INFO: renamed from: w0 */
    public final void m12058w0() {
        long contentPosition;
        long contentBufferedPosition;
        if (m12040d0() && this.f9356M0) {
            InterfaceC2026t interfaceC2026t = this.f9350J0;
            if (interfaceC2026t == null || !interfaceC2026t.isCommandAvailable(16)) {
                contentPosition = 0;
                contentBufferedPosition = 0;
            } else {
                contentPosition = this.f9377X0 + interfaceC2026t.getContentPosition();
                contentBufferedPosition = this.f9377X0 + interfaceC2026t.getContentBufferedPosition();
            }
            TextView textView = this.f9338D;
            if (textView != null && !this.f9362P0) {
                textView.setText(bmk0.m105148k0(this.f9341F, this.f9343G, contentPosition));
            }
            InterfaceC2061b interfaceC2061b = this.f9339E;
            if (interfaceC2061b != null) {
                interfaceC2061b.setPosition(contentPosition);
                this.f9339E.setBufferedPosition(contentBufferedPosition);
            }
            removeCallbacks(this.f9349J);
            int playbackState = interfaceC2026t == null ? 1 : interfaceC2026t.getPlaybackState();
            if (interfaceC2026t == null || !interfaceC2026t.isPlaying()) {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(this.f9349J, 1000L);
                return;
            }
            InterfaceC2061b interfaceC2061b2 = this.f9339E;
            long jMin = Math.min(interfaceC2061b2 != null ? interfaceC2061b2.getPreferredUpdateDelay() : 1000L, 1000 - (contentPosition % 1000));
            float f = interfaceC2026t.getPlaybackParameters().f8288a;
            postDelayed(this.f9349J, bmk0.m105164r(f > 0.0f ? (long) (jMin / f) : 1000L, this.f9366R0, 1000L));
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m12059x0() {
        ImageView imageView;
        if (m12040d0() && this.f9356M0 && (imageView = this.f9400t) != null) {
            if (this.f9368S0 == 0) {
                m12052p0(false, imageView);
                return;
            }
            InterfaceC2026t interfaceC2026t = this.f9350J0;
            if (interfaceC2026t == null || !interfaceC2026t.isCommandAvailable(15)) {
                m12052p0(false, this.f9400t);
                this.f9400t.setImageDrawable(this.f9351K);
                this.f9400t.setContentDescription(this.f9357N);
                return;
            }
            m12052p0(true, this.f9400t);
            int repeatMode = interfaceC2026t.getRepeatMode();
            if (repeatMode == 0) {
                this.f9400t.setImageDrawable(this.f9351K);
                this.f9400t.setContentDescription(this.f9357N);
            } else if (repeatMode == 1) {
                this.f9400t.setImageDrawable(this.f9353L);
                this.f9400t.setContentDescription(this.f9359O);
            } else {
                if (repeatMode != 2) {
                    return;
                }
                this.f9400t.setImageDrawable(this.f9355M);
                this.f9400t.setContentDescription(this.f9361P);
            }
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m12060y0() {
        InterfaceC2026t interfaceC2026t = this.f9350J0;
        int seekBackIncrement = (int) ((interfaceC2026t != null ? interfaceC2026t.getSeekBackIncrement() : Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS) / 1000);
        TextView textView = this.f9399s;
        if (textView != null) {
            textView.setText(String.valueOf(seekBackIncrement));
        }
        View view = this.f9397q;
        if (view != null) {
            view.setContentDescription(this.f9380b.getQuantityString(sfc0.f167686b, seekBackIncrement, Integer.valueOf(seekBackIncrement)));
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m12061z0() {
        m12052p0(this.f9384f.m12080y(), this.f9406z);
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
