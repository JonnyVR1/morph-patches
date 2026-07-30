package p153l;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.momo.momortc.MMConstants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import okio.Utf8;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class io4 extends ko4 {

    /* JADX INFO: renamed from: g */
    public final ig60 f116070g = new ig60();

    /* JADX INFO: renamed from: h */
    public final hg60 f116071h = new hg60();

    /* JADX INFO: renamed from: i */
    public int f116072i = -1;

    /* JADX INFO: renamed from: j */
    public final boolean f116073j;

    /* JADX INFO: renamed from: k */
    public final int f116074k;

    /* JADX INFO: renamed from: l */
    public final C17756b[] f116075l;

    /* JADX INFO: renamed from: m */
    public C17756b f116076m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public List<myb> f116077n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public List<myb> f116078o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public C17757c f116079p;

    /* JADX INFO: renamed from: q */
    public int f116080q;

    /* JADX INFO: renamed from: l.io4$a */
    public static final class C17755a {

        /* JADX INFO: renamed from: c */
        public static final Comparator<C17755a> f116081c = new Comparator() { // from class: l.ho4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((io4.C17755a) obj2).f116083b, ((io4.C17755a) obj).f116083b);
            }
        };

        /* JADX INFO: renamed from: a */
        public final myb f116082a;

        /* JADX INFO: renamed from: b */
        public final int f116083b;

        public C17755a(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
            myb.C18746b c18746bM160767n = new myb.C18746b().m160768o(charSequence).m160769p(alignment).m160761h(f, i).m160762i(i2).m160764k(f2).m160765l(i3).m160767n(f3);
            if (z) {
                c18746bM160767n.m160772s(i4);
            }
            this.f116082a = c18746bM160767n.m160754a();
            this.f116083b = i5;
        }
    }

    /* JADX INFO: renamed from: l.io4$b */
    public static final class C17756b {

        /* JADX INFO: renamed from: A */
        public static final int[] f116084A;

        /* JADX INFO: renamed from: B */
        public static final int[] f116085B;

        /* JADX INFO: renamed from: C */
        public static final boolean[] f116086C;

        /* JADX INFO: renamed from: D */
        public static final int[] f116087D;

        /* JADX INFO: renamed from: E */
        public static final int[] f116088E;

        /* JADX INFO: renamed from: F */
        public static final int[] f116089F;

        /* JADX INFO: renamed from: G */
        public static final int[] f116090G;

        /* JADX INFO: renamed from: w */
        public static final int f116091w = m141265h(2, 2, 2, 0);

        /* JADX INFO: renamed from: x */
        public static final int f116092x;

        /* JADX INFO: renamed from: y */
        public static final int f116093y;

        /* JADX INFO: renamed from: z */
        public static final int[] f116094z;

        /* JADX INFO: renamed from: a */
        public final List<SpannableString> f116095a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final SpannableStringBuilder f116096b = new SpannableStringBuilder();

        /* JADX INFO: renamed from: c */
        public boolean f116097c;

        /* JADX INFO: renamed from: d */
        public boolean f116098d;

        /* JADX INFO: renamed from: e */
        public int f116099e;

        /* JADX INFO: renamed from: f */
        public boolean f116100f;

        /* JADX INFO: renamed from: g */
        public int f116101g;

        /* JADX INFO: renamed from: h */
        public int f116102h;

        /* JADX INFO: renamed from: i */
        public int f116103i;

        /* JADX INFO: renamed from: j */
        public int f116104j;

        /* JADX INFO: renamed from: k */
        public boolean f116105k;

        /* JADX INFO: renamed from: l */
        public int f116106l;

        /* JADX INFO: renamed from: m */
        public int f116107m;

        /* JADX INFO: renamed from: n */
        public int f116108n;

        /* JADX INFO: renamed from: o */
        public int f116109o;

        /* JADX INFO: renamed from: p */
        public int f116110p;

        /* JADX INFO: renamed from: q */
        public int f116111q;

        /* JADX INFO: renamed from: r */
        public int f116112r;

        /* JADX INFO: renamed from: s */
        public int f116113s;

        /* JADX INFO: renamed from: t */
        public int f116114t;

        /* JADX INFO: renamed from: u */
        public int f116115u;

        /* JADX INFO: renamed from: v */
        public int f116116v;

        static {
            int iM141265h = m141265h(0, 0, 0, 0);
            f116092x = iM141265h;
            int iM141265h2 = m141265h(0, 0, 0, 3);
            f116093y = iM141265h2;
            f116094z = new int[]{0, 0, 0, 0, 0, 2, 0};
            f116084A = new int[]{0, 0, 0, 0, 0, 0, 2};
            f116085B = new int[]{3, 3, 3, 3, 3, 3, 1};
            f116086C = new boolean[]{false, false, false, true, true, true, false};
            f116087D = new int[]{iM141265h, iM141265h2, iM141265h, iM141265h, iM141265h2, iM141265h, iM141265h};
            f116088E = new int[]{0, 1, 2, 3, 4, 3, 4};
            f116089F = new int[]{0, 0, 0, 0, 0, 3, 3};
            f116090G = new int[]{iM141265h, iM141265h, iM141265h, iM141265h, iM141265h, iM141265h2, iM141265h2};
        }

        public C17756b() {
            m141275l();
        }

        /* JADX INFO: renamed from: g */
        public static int m141264g(int i, int i2, int i3) {
            return m141265h(i, i2, i3, 0);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x001b  */
        /* JADX INFO: renamed from: h */
        public static int m141265h(int i, int i2, int i3, int i4) {
            int i5;
            w11.m204367c(i, 0, 4);
            w11.m204367c(i2, 0, 4);
            w11.m204367c(i3, 0, 4);
            w11.m204367c(i4, 0, 4);
            if (i4 == 0 || i4 == 1) {
                i5 = 255;
            } else if (i4 == 2) {
                i5 = 127;
            } else if (i4 != 3) {
                i5 = 255;
            } else {
                i5 = 0;
            }
            return Color.argb(i5, i > 1 ? 255 : 0, i2 > 1 ? 255 : 0, i3 > 1 ? 255 : 0);
        }

        /* JADX INFO: renamed from: a */
        public void m141266a(char c) {
            if (c != '\n') {
                this.f116096b.append(c);
                return;
            }
            this.f116095a.add(m141269d());
            this.f116096b.clear();
            if (this.f116110p != -1) {
                this.f116110p = 0;
            }
            if (this.f116111q != -1) {
                this.f116111q = 0;
            }
            if (this.f116112r != -1) {
                this.f116112r = 0;
            }
            if (this.f116114t != -1) {
                this.f116114t = 0;
            }
            while (true) {
                if ((!this.f116105k || this.f116095a.size() < this.f116104j) && this.f116095a.size() < 15) {
                    return;
                } else {
                    this.f116095a.remove(0);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m141267b() {
            int length = this.f116096b.length();
            if (length > 0) {
                this.f116096b.delete(length - 1, length);
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: LoopRegionVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: No SSA var for result arg: (r9 I:??) from 0x0099: PHI (r9 I:??) = (r9v7 boolean) binds: [B:42:0x0098] A[DONT_GENERATE, DONT_INLINE, REMOVE]
            	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:506)
            	at jadx.core.dex.instructions.mods.TernaryInsn.rebindArgs(TernaryInsn.java:100)
            	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:517)
            	at jadx.core.dex.instructions.mods.TernaryInsn.rebindArgs(TernaryInsn.java:96)
            	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:134)
            	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
            	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
            	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.processIfRequested(IfRegionVisitor.java:36)
            	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:56)
            */
        @androidx.annotation.Nullable
        /* JADX INFO: renamed from: c */
        public p153l.io4.C17755a m141268c() {
            /*
                r12 = this;
                boolean r0 = r12.m141273j()
                if (r0 == 0) goto L8
                r12 = 0
                return r12
            L8:
                android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
                r1.<init>()
                r0 = 0
                r2 = r0
            Lf:
                java.util.List<android.text.SpannableString> r3 = r12.f116095a
                int r3 = r3.size()
                if (r2 >= r3) goto L2a
                java.util.List<android.text.SpannableString> r3 = r12.f116095a
                java.lang.Object r3 = r3.get(r2)
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r1.append(r3)
                r3 = 10
                r1.append(r3)
                int r2 = r2 + 1
                goto Lf
            L2a:
                android.text.SpannableString r2 = r12.m141269d()
                r1.append(r2)
                int r2 = r12.f116106l
                r3 = 2
                r4 = 3
                r5 = 1
                if (r2 == 0) goto L4e
                if (r2 == r5) goto L4b
                if (r2 == r3) goto L48
                if (r2 != r4) goto L3f
                goto L4e
            L3f:
                java.lang.String r0 = "Unexpected justification value: "
                int r12 = r12.f116106l
                p153l.pvb.m173939a(r0, r12)
                r12 = 0
                return r12
            L48:
                android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_CENTER
                goto L50
            L4b:
                android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_OPPOSITE
                goto L50
            L4e:
                android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_NORMAL
            L50:
                boolean r6 = r12.f116100f
                int r7 = r12.f116102h
                if (r6 == 0) goto L5f
                float r6 = (float) r7
                r7 = 1120272384(0x42c60000, float:99.0)
                float r6 = r6 / r7
                int r8 = r12.f116101g
                float r8 = (float) r8
                float r8 = r8 / r7
                goto L6a
            L5f:
                float r6 = (float) r7
                r7 = 1129381888(0x43510000, float:209.0)
                float r6 = r6 / r7
                int r7 = r12.f116101g
                float r7 = (float) r7
                r8 = 1116995584(0x42940000, float:74.0)
                float r8 = r7 / r8
            L6a:
                r7 = 1063675494(0x3f666666, float:0.9)
                float r6 = r6 * r7
                r9 = 1028443341(0x3d4ccccd, float:0.05)
                float r6 = r6 + r9
                float r8 = r8 * r7
                float r8 = r8 + r9
                int r7 = r12.f116103i
                int r9 = r7 / 3
                if (r9 != 0) goto L7d
                r9 = r5
                r5 = r0
                goto L85
            L7d:
                int r9 = r7 / 3
                if (r9 != r5) goto L83
                r9 = r5
                goto L85
            L83:
                r9 = r5
                r5 = r3
            L85:
                int r10 = r7 % 3
                if (r10 != 0) goto L8b
                r7 = r0
                goto L91
            L8b:
                int r7 = r7 % r4
                if (r7 != r9) goto L90
                r7 = r9
                goto L91
            L90:
                r7 = r3
            L91:
                int r3 = r12.f116109o
                int r4 = p153l.io4.C17756b.f116092x
                if (r3 == r4) goto L98
                goto L99
            L98:
                r9 = r0
            L99:
                l.io4$a r0 = new l.io4$a
                int r10 = r12.f116109o
                int r11 = r12.f116099e
                r4 = 0
                r3 = r8
                r8 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p153l.io4.C17756b.m141268c():l.io4$a");
        }

        /* JADX INFO: renamed from: d */
        public SpannableString m141269d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f116096b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f116110p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f116110p, length, 33);
                }
                if (this.f116111q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f116111q, length, 33);
                }
                if (this.f116112r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f116113s), this.f116112r, length, 33);
                }
                if (this.f116114t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f116115u), this.f116114t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* JADX INFO: renamed from: e */
        public void m141270e() {
            this.f116095a.clear();
            this.f116096b.clear();
            this.f116110p = -1;
            this.f116111q = -1;
            this.f116112r = -1;
            this.f116114t = -1;
            this.f116116v = 0;
        }

        /* JADX INFO: renamed from: f */
        public void m141271f(boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f116097c = true;
            this.f116098d = z;
            this.f116105k = z2;
            this.f116099e = i;
            this.f116100f = z4;
            this.f116101g = i2;
            this.f116102h = i3;
            this.f116103i = i6;
            int i9 = i4 + 1;
            if (this.f116104j != i9) {
                this.f116104j = i9;
                while (true) {
                    if ((!z2 || this.f116095a.size() < this.f116104j) && this.f116095a.size() < 15) {
                        break;
                    } else {
                        this.f116095a.remove(0);
                    }
                }
            }
            if (i7 != 0 && this.f116107m != i7) {
                this.f116107m = i7;
                int i10 = i7 - 1;
                m141280q(f116087D[i10], f116093y, f116086C[i10], 0, f116084A[i10], f116085B[i10], f116094z[i10]);
            }
            if (i8 == 0 || this.f116108n == i8) {
                return;
            }
            this.f116108n = i8;
            int i11 = i8 - 1;
            m141276m(0, 1, 1, false, false, f116089F[i11], f116088E[i11]);
            m141277n(f116091w, f116090G[i11], f116092x);
        }

        /* JADX INFO: renamed from: i */
        public boolean m141272i() {
            return this.f116097c;
        }

        /* JADX INFO: renamed from: j */
        public boolean m141273j() {
            if (m141272i()) {
                return this.f116095a.isEmpty() && this.f116096b.length() == 0;
            }
            return true;
        }

        /* JADX INFO: renamed from: k */
        public boolean m141274k() {
            return this.f116098d;
        }

        /* JADX INFO: renamed from: l */
        public void m141275l() {
            m141270e();
            this.f116097c = false;
            this.f116098d = false;
            this.f116099e = 4;
            this.f116100f = false;
            this.f116101g = 0;
            this.f116102h = 0;
            this.f116103i = 0;
            this.f116104j = 15;
            this.f116105k = true;
            this.f116106l = 0;
            this.f116107m = 0;
            this.f116108n = 0;
            int i = f116092x;
            this.f116109o = i;
            this.f116113s = f116091w;
            this.f116115u = i;
        }

        /* JADX INFO: renamed from: m */
        public void m141276m(int i, int i2, int i3, boolean z, boolean z2, int i4, int i5) {
            if (this.f116110p != -1) {
                if (!z) {
                    this.f116096b.setSpan(new StyleSpan(2), this.f116110p, this.f116096b.length(), 33);
                    this.f116110p = -1;
                }
            } else if (z) {
                this.f116110p = this.f116096b.length();
            }
            if (this.f116111q == -1) {
                if (z2) {
                    this.f116111q = this.f116096b.length();
                }
            } else {
                if (z2) {
                    return;
                }
                this.f116096b.setSpan(new UnderlineSpan(), this.f116111q, this.f116096b.length(), 33);
                this.f116111q = -1;
            }
        }

        /* JADX INFO: renamed from: n */
        public void m141277n(int i, int i2, int i3) {
            if (this.f116112r != -1 && this.f116113s != i) {
                this.f116096b.setSpan(new ForegroundColorSpan(this.f116113s), this.f116112r, this.f116096b.length(), 33);
            }
            if (i != f116091w) {
                this.f116112r = this.f116096b.length();
                this.f116113s = i;
            }
            if (this.f116114t != -1 && this.f116115u != i2) {
                this.f116096b.setSpan(new BackgroundColorSpan(this.f116115u), this.f116114t, this.f116096b.length(), 33);
            }
            if (i2 != f116092x) {
                this.f116114t = this.f116096b.length();
                this.f116115u = i2;
            }
        }

        /* JADX INFO: renamed from: o */
        public void m141278o(int i, int i2) {
            if (this.f116116v != i) {
                m141266a('\n');
            }
            this.f116116v = i;
        }

        /* JADX INFO: renamed from: p */
        public void m141279p(boolean z) {
            this.f116098d = z;
        }

        /* JADX INFO: renamed from: q */
        public void m141280q(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
            this.f116109o = i;
            this.f116106l = i6;
        }
    }

    /* JADX INFO: renamed from: l.io4$c */
    public static final class C17757c {

        /* JADX INFO: renamed from: a */
        public final int f116117a;

        /* JADX INFO: renamed from: b */
        public final int f116118b;

        /* JADX INFO: renamed from: c */
        public final byte[] f116119c;

        /* JADX INFO: renamed from: d */
        public int f116120d = 0;

        public C17757c(int i, int i2) {
            this.f116117a = i;
            this.f116118b = i2;
            this.f116119c = new byte[(i2 * 2) - 1];
        }
    }

    public io4(int i, @Nullable List<byte[]> list) {
        this.f116074k = i == -1 ? 1 : i;
        this.f116073j = list != null && lc5.m153629i(list);
        this.f116075l = new C17756b[8];
        int i2 = 0;
        while (true) {
            C17756b[] c17756bArr = this.f116075l;
            if (i2 >= 8) {
                this.f116076m = c17756bArr[0];
                return;
            } else {
                c17756bArr[i2] = new C17756b();
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: E */
    private void m141245E() {
        for (int i = 0; i < 8; i++) {
            this.f116075l[i].m141275l();
        }
    }

    /* JADX INFO: renamed from: p */
    private List<myb> m141246p() {
        C17755a c17755aM141268c;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            if (!this.f116075l[i].m141273j() && this.f116075l[i].m141274k() && (c17755aM141268c = this.f116075l[i].m141268c()) != null) {
                arrayList.add(c17755aM141268c);
            }
        }
        Collections.sort(arrayList, C17755a.f116081c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.add(((C17755a) arrayList.get(i2)).f116082a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    /* JADX INFO: renamed from: A */
    public final void m141247A() {
        int iM141265h = C17756b.m141265h(this.f116071h.m134905h(2), this.f116071h.m134905h(2), this.f116071h.m134905h(2), this.f116071h.m134905h(2));
        int iM141265h2 = C17756b.m141265h(this.f116071h.m134905h(2), this.f116071h.m134905h(2), this.f116071h.m134905h(2), this.f116071h.m134905h(2));
        this.f116071h.m134915r(2);
        this.f116076m.m141277n(iM141265h, iM141265h2, C17756b.m141264g(this.f116071h.m134905h(2), this.f116071h.m134905h(2), this.f116071h.m134905h(2)));
    }

    /* JADX INFO: renamed from: B */
    public final void m141248B() {
        this.f116071h.m134915r(4);
        int iM134905h = this.f116071h.m134905h(4);
        this.f116071h.m134915r(2);
        this.f116076m.m141278o(iM134905h, this.f116071h.m134905h(6));
    }

    /* JADX INFO: renamed from: C */
    public final void m141249C() {
        int iM141265h = C17756b.m141265h(this.f116071h.m134905h(2), this.f116071h.m134905h(2), this.f116071h.m134905h(2), this.f116071h.m134905h(2));
        int iM134905h = this.f116071h.m134905h(2);
        int iM141264g = C17756b.m141264g(this.f116071h.m134905h(2), this.f116071h.m134905h(2), this.f116071h.m134905h(2));
        if (this.f116071h.m134904g()) {
            iM134905h |= 4;
        }
        boolean zM134904g = this.f116071h.m134904g();
        int iM134905h2 = this.f116071h.m134905h(2);
        int iM134905h3 = this.f116071h.m134905h(2);
        int iM134905h4 = this.f116071h.m134905h(2);
        this.f116071h.m134915r(8);
        this.f116076m.m141280q(iM141265h, iM141264g, zM134904g, iM134905h, iM134905h2, iM134905h3, iM134905h4);
    }

    @RequiresNonNull({"currentDtvCcPacket"})
    /* JADX INFO: renamed from: D */
    public final void m141250D() {
        C17757c c17757c = this.f116079p;
        if (c17757c.f116120d != (c17757c.f116118b * 2) - 1) {
            kyv.m152144b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f116079p.f116118b * 2) - 1) + ", but current index is " + this.f116079p.f116120d + " (sequence number " + this.f116079p.f116117a + ");");
        }
        hg60 hg60Var = this.f116071h;
        C17757c c17757c2 = this.f116079p;
        hg60Var.m134912o(c17757c2.f116119c, c17757c2.f116120d);
        boolean z = false;
        while (this.f116071h.m134899b() > 0) {
            int iM134905h = this.f116071h.m134905h(3);
            int iM134905h2 = this.f116071h.m134905h(5);
            if (iM134905h == 7) {
                this.f116071h.m134915r(2);
                iM134905h = this.f116071h.m134905h(6);
                if (iM134905h < 7) {
                    kyv.m152151i("Cea708Decoder", "Invalid extended service number: " + iM134905h);
                }
            }
            if (iM134905h2 == 0) {
                if (iM134905h == 0) {
                    break;
                }
                kyv.m152151i("Cea708Decoder", "serviceNumber is non-zero (" + iM134905h + ") when blockSize is 0");
                break;
            }
            int i = this.f116074k;
            hg60 hg60Var2 = this.f116071h;
            if (iM134905h != i) {
                hg60Var2.m134916s(iM134905h2);
            } else {
                int iM134902e = hg60Var2.m134902e() + (iM134905h2 * 8);
                while (this.f116071h.m134902e() < iM134902e) {
                    int iM134905h3 = this.f116071h.m134905h(8);
                    if (iM134905h3 == 16) {
                        int iM134905h4 = this.f116071h.m134905h(8);
                        if (iM134905h4 <= 31) {
                            m141254s(iM134905h4);
                        } else {
                            if (iM134905h4 <= 127) {
                                m141259x(iM134905h4);
                            } else if (iM134905h4 <= 159) {
                                m141255t(iM134905h4);
                            } else if (iM134905h4 <= 255) {
                                m141260y(iM134905h4);
                            } else {
                                kyv.m152151i("Cea708Decoder", "Invalid extended command: " + iM134905h4);
                            }
                            z = true;
                        }
                    } else if (iM134905h3 <= 31) {
                        m141252q(iM134905h3);
                    } else {
                        if (iM134905h3 <= 127) {
                            m141257v(iM134905h3);
                        } else if (iM134905h3 <= 159) {
                            m141253r(iM134905h3);
                        } else if (iM134905h3 <= 255) {
                            m141258w(iM134905h3);
                        } else {
                            kyv.m152151i("Cea708Decoder", "Invalid base command: " + iM134905h3);
                        }
                        z = true;
                    }
                }
            }
        }
        if (z) {
            this.f116077n = m141246p();
        }
    }

    @Override // p153l.ko4, p153l.odg0
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ void mo131055b(long j) {
        super.mo131055b(j);
    }

    @Override // p153l.ko4
    /* JADX INFO: renamed from: e */
    public mdg0 mo131057e() {
        List<myb> list = this.f116077n;
        this.f116078o = list;
        return new lo4((List) w11.m204369e(list));
    }

    @Override // p153l.ko4
    /* JADX INFO: renamed from: f */
    public void mo131058f(rdg0 rdg0Var) {
        ByteBuffer byteBuffer = (ByteBuffer) w11.m204369e(rdg0Var.f7412c);
        this.f116070g.m139806S(byteBuffer.array(), byteBuffer.limit());
        while (this.f116070g.m139811a() >= 3) {
            int iM139795H = this.f116070g.m139795H();
            int i = iM139795H & 3;
            boolean z = (iM139795H & 4) == 4;
            byte bM139795H = (byte) this.f116070g.m139795H();
            byte bM139795H2 = (byte) this.f116070g.m139795H();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        m141251o();
                        int i2 = (bM139795H & 192) >> 6;
                        int i3 = this.f116072i;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            m141245E();
                            kyv.m152151i("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f116072i + " current=" + i2);
                        }
                        this.f116072i = i2;
                        int i4 = bM139795H & Utf8.REPLACEMENT_BYTE;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        C17757c c17757c = new C17757c(i2, i4);
                        this.f116079p = c17757c;
                        byte[] bArr = c17757c.f116119c;
                        int i5 = c17757c.f116120d;
                        c17757c.f116120d = i5 + 1;
                        bArr[i5] = bM139795H2;
                    } else {
                        w11.m204365a(i == 2);
                        C17757c c17757c2 = this.f116079p;
                        if (c17757c2 == null) {
                            kyv.m152145c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c17757c2.f116119c;
                            int i6 = c17757c2.f116120d;
                            int i7 = i6 + 1;
                            c17757c2.f116120d = i7;
                            bArr2[i6] = bM139795H;
                            c17757c2.f116120d = i6 + 2;
                            bArr2[i7] = bM139795H2;
                        }
                    }
                    C17757c c17757c3 = this.f116079p;
                    if (c17757c3.f116120d == (c17757c3.f116118b * 2) - 1) {
                        m141251o();
                    }
                }
            }
        }
    }

    @Override // p153l.ko4, p153l.hid
    public void flush() {
        super.flush();
        this.f116077n = null;
        this.f116078o = null;
        this.f116080q = 0;
        this.f116076m = this.f116075l[0];
        m141245E();
        this.f116079p = null;
    }

    @Override // p153l.ko4
    @Nullable
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ rdg0 mo135120a() throws SubtitleDecoderException {
        return super.mo135120a();
    }

    @Override // p153l.ko4
    @Nullable
    /* JADX INFO: renamed from: h */
    public /* bridge */ /* synthetic */ sdg0 mo131056c() throws SubtitleDecoderException {
        return super.mo131056c();
    }

    @Override // p153l.ko4
    /* JADX INFO: renamed from: k */
    public boolean mo131061k() {
        return this.f116077n != this.f116078o;
    }

    @Override // p153l.ko4
    /* JADX INFO: renamed from: l */
    public /* bridge */ /* synthetic */ void mo135121d(rdg0 rdg0Var) throws SubtitleDecoderException {
        super.mo135121d(rdg0Var);
    }

    /* JADX INFO: renamed from: o */
    public final void m141251o() {
        if (this.f116079p == null) {
            return;
        }
        m141250D();
        this.f116079p = null;
    }

    /* JADX INFO: renamed from: q */
    public final void m141252q(int i) {
        if (i != 0) {
            if (i == 3) {
                this.f116077n = m141246p();
                return;
            }
            if (i == 8) {
                this.f116076m.m141267b();
                return;
            }
            switch (i) {
                case 12:
                    m141245E();
                    break;
                case 13:
                    this.f116076m.m141266a('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i >= 17 && i <= 23) {
                        kyv.m152151i("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i);
                        this.f116071h.m134915r(8);
                    } else if (i >= 24 && i <= 31) {
                        kyv.m152151i("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i);
                        this.f116071h.m134915r(16);
                    } else {
                        kyv.m152151i("Cea708Decoder", "Invalid C0 command: " + i);
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: r */
    public final void m141253r(int i) {
        int i2 = 1;
        switch (i) {
            case 128:
            case MMConstants.ERR_WATERMARK_READ /* 129 */:
            case 130:
            case 131:
            case CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA /* 132 */:
            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA /* 133 */:
            case 134:
            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA /* 135 */:
                int i3 = i - 128;
                if (this.f116080q != i3) {
                    this.f116080q = i3;
                    this.f116076m = this.f116075l[i3];
                }
                break;
            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA /* 136 */:
                while (i2 <= 8) {
                    if (this.f116071h.m134904g()) {
                        this.f116075l[8 - i2].m141270e();
                    }
                    i2++;
                }
                break;
            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA /* 137 */:
                for (int i4 = 1; i4 <= 8; i4++) {
                    if (this.f116071h.m134904g()) {
                        this.f116075l[8 - i4].m141279p(true);
                    }
                }
                break;
            case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                while (i2 <= 8) {
                    if (this.f116071h.m134904g()) {
                        this.f116075l[8 - i2].m141279p(false);
                    }
                    i2++;
                }
                break;
            case CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA /* 139 */:
                for (int i5 = 1; i5 <= 8; i5++) {
                    if (this.f116071h.m134904g()) {
                        C17756b c17756b = this.f116075l[8 - i5];
                        c17756b.m141279p(!c17756b.m141274k());
                    }
                }
                break;
            case 140:
                while (i2 <= 8) {
                    if (this.f116071h.m134904g()) {
                        this.f116075l[8 - i2].m141275l();
                    }
                    i2++;
                }
                break;
            case CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA /* 141 */:
                this.f116071h.m134915r(8);
                break;
            case CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA /* 142 */:
                break;
            case CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA /* 143 */:
                m141245E();
                break;
            case 144:
                if (this.f116076m.m141272i()) {
                    m141261z();
                } else {
                    this.f116071h.m134915r(16);
                }
                break;
            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA /* 145 */:
                if (this.f116076m.m141272i()) {
                    m141247A();
                } else {
                    this.f116071h.m134915r(24);
                }
                break;
            case CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA /* 146 */:
                if (this.f116076m.m141272i()) {
                    m141248B();
                } else {
                    this.f116071h.m134915r(16);
                }
                break;
            case CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA /* 147 */:
            case 148:
            case 149:
            case 150:
            default:
                kyv.m152151i("Cea708Decoder", "Invalid C1 command: " + i);
                break;
            case 151:
                if (this.f116076m.m141272i()) {
                    m141249C();
                } else {
                    this.f116071h.m134915r(32);
                }
                break;
            case CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA /* 152 */:
            case 153:
            case 154:
            case CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA /* 155 */:
            case CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256 /* 156 */:
            case 157:
            case 158:
            case 159:
                int i6 = i - 152;
                m141256u(i6);
                if (this.f116080q != i6) {
                    this.f116080q = i6;
                    this.f116076m = this.f116075l[i6];
                }
                break;
        }
    }

    @Override // p153l.ko4, p153l.hid
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    /* JADX INFO: renamed from: s */
    public final void m141254s(int i) {
        if (i <= 7) {
            return;
        }
        if (i <= 15) {
            this.f116071h.m134915r(8);
        } else if (i <= 23) {
            this.f116071h.m134915r(16);
        } else if (i <= 31) {
            this.f116071h.m134915r(24);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m141255t(int i) {
        if (i <= 135) {
            this.f116071h.m134915r(32);
            return;
        }
        if (i <= 143) {
            this.f116071h.m134915r(40);
        } else if (i <= 159) {
            this.f116071h.m134915r(2);
            this.f116071h.m134915r(this.f116071h.m134905h(6) * 8);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m141256u(int i) {
        C17756b c17756b = this.f116075l[i];
        this.f116071h.m134915r(2);
        boolean zM134904g = this.f116071h.m134904g();
        boolean zM134904g2 = this.f116071h.m134904g();
        boolean zM134904g3 = this.f116071h.m134904g();
        int iM134905h = this.f116071h.m134905h(3);
        boolean zM134904g4 = this.f116071h.m134904g();
        int iM134905h2 = this.f116071h.m134905h(7);
        int iM134905h3 = this.f116071h.m134905h(8);
        int iM134905h4 = this.f116071h.m134905h(4);
        int iM134905h5 = this.f116071h.m134905h(4);
        this.f116071h.m134915r(2);
        int iM134905h6 = this.f116071h.m134905h(6);
        this.f116071h.m134915r(2);
        c17756b.m141271f(zM134904g, zM134904g2, zM134904g3, iM134905h, zM134904g4, iM134905h2, iM134905h3, iM134905h5, iM134905h6, iM134905h4, this.f116071h.m134905h(3), this.f116071h.m134905h(3));
    }

    /* JADX INFO: renamed from: v */
    public final void m141257v(int i) {
        C17756b c17756b = this.f116076m;
        if (i == 127) {
            c17756b.m141266a((char) 9835);
        } else {
            c17756b.m141266a((char) (i & 255));
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m141258w(int i) {
        this.f116076m.m141266a((char) (i & 255));
    }

    /* JADX INFO: renamed from: x */
    public final void m141259x(int i) {
        if (i == 32) {
            this.f116076m.m141266a(' ');
            return;
        }
        if (i == 33) {
            this.f116076m.m141266a((char) 160);
            return;
        }
        if (i == 37) {
            this.f116076m.m141266a((char) 8230);
            return;
        }
        if (i == 42) {
            this.f116076m.m141266a((char) 352);
            return;
        }
        if (i == 44) {
            this.f116076m.m141266a((char) 338);
            return;
        }
        if (i == 63) {
            this.f116076m.m141266a((char) 376);
            return;
        }
        if (i == 57) {
            this.f116076m.m141266a((char) 8482);
            return;
        }
        if (i == 58) {
            this.f116076m.m141266a((char) 353);
            return;
        }
        if (i == 60) {
            this.f116076m.m141266a((char) 339);
            return;
        }
        if (i == 61) {
            this.f116076m.m141266a((char) 8480);
            return;
        }
        switch (i) {
            case 48:
                this.f116076m.m141266a((char) 9608);
                break;
            case 49:
                this.f116076m.m141266a((char) 8216);
                break;
            case 50:
                this.f116076m.m141266a((char) 8217);
                break;
            case 51:
                this.f116076m.m141266a((char) 8220);
                break;
            case 52:
                this.f116076m.m141266a((char) 8221);
                break;
            case 53:
                this.f116076m.m141266a((char) 8226);
                break;
            default:
                switch (i) {
                    case 118:
                        this.f116076m.m141266a((char) 8539);
                        break;
                    case 119:
                        this.f116076m.m141266a((char) 8540);
                        break;
                    case 120:
                        this.f116076m.m141266a((char) 8541);
                        break;
                    case 121:
                        this.f116076m.m141266a((char) 8542);
                        break;
                    case 122:
                        this.f116076m.m141266a((char) 9474);
                        break;
                    case 123:
                        this.f116076m.m141266a((char) 9488);
                        break;
                    case 124:
                        this.f116076m.m141266a((char) 9492);
                        break;
                    case 125:
                        this.f116076m.m141266a((char) 9472);
                        break;
                    case 126:
                        this.f116076m.m141266a((char) 9496);
                        break;
                    case 127:
                        this.f116076m.m141266a((char) 9484);
                        break;
                    default:
                        kyv.m152151i("Cea708Decoder", "Invalid G2 character: " + i);
                        break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m141260y(int i) {
        if (i == 160) {
            this.f116076m.m141266a((char) 13252);
            return;
        }
        kyv.m152151i("Cea708Decoder", "Invalid G3 character: " + i);
        this.f116076m.m141266a('_');
    }

    /* JADX INFO: renamed from: z */
    public final void m141261z() {
        this.f116076m.m141276m(this.f116071h.m134905h(4), this.f116071h.m134905h(2), this.f116071h.m134905h(2), this.f116071h.m134904g(), this.f116071h.m134904g(), this.f116071h.m134905h(3), this.f116071h.m134905h(3));
    }
}
