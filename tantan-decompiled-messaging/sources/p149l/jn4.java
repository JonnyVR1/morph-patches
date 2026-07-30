package p149l;

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
public final class jn4 extends ln4 {

    /* JADX INFO: renamed from: g */
    public final d860 f118761g = new d860();

    /* JADX INFO: renamed from: h */
    public final c860 f118762h = new c860();

    /* JADX INFO: renamed from: i */
    public int f118763i = -1;

    /* JADX INFO: renamed from: j */
    public final boolean f118764j;

    /* JADX INFO: renamed from: k */
    public final int f118765k;

    /* JADX INFO: renamed from: l */
    public final C17822b[] f118766l;

    /* JADX INFO: renamed from: m */
    public C17822b f118767m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public List<ywb> f118768n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public List<ywb> f118769o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public C17823c f118770p;

    /* JADX INFO: renamed from: q */
    public int f118771q;

    /* JADX INFO: renamed from: l.jn4$a */
    public static final class C17821a {

        /* JADX INFO: renamed from: c */
        public static final Comparator<C17821a> f118772c = new Comparator() { // from class: l.in4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((jn4.C17821a) obj2).f118774b, ((jn4.C17821a) obj).f118774b);
            }
        };

        /* JADX INFO: renamed from: a */
        public final ywb f118773a;

        /* JADX INFO: renamed from: b */
        public final int f118774b;

        public C17821a(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
            ywb.C21557b c21557bM216324n = new ywb.C21557b().m216325o(charSequence).m216326p(alignment).m216318h(f, i).m216319i(i2).m216321k(f2).m216322l(i3).m216324n(f3);
            if (z) {
                c21557bM216324n.m216329s(i4);
            }
            this.f118773a = c21557bM216324n.m216311a();
            this.f118774b = i5;
        }
    }

    /* JADX INFO: renamed from: l.jn4$b */
    public static final class C17822b {

        /* JADX INFO: renamed from: A */
        public static final int[] f118775A;

        /* JADX INFO: renamed from: B */
        public static final int[] f118776B;

        /* JADX INFO: renamed from: C */
        public static final boolean[] f118777C;

        /* JADX INFO: renamed from: D */
        public static final int[] f118778D;

        /* JADX INFO: renamed from: E */
        public static final int[] f118779E;

        /* JADX INFO: renamed from: F */
        public static final int[] f118780F;

        /* JADX INFO: renamed from: G */
        public static final int[] f118781G;

        /* JADX INFO: renamed from: w */
        public static final int f118782w = m142292h(2, 2, 2, 0);

        /* JADX INFO: renamed from: x */
        public static final int f118783x;

        /* JADX INFO: renamed from: y */
        public static final int f118784y;

        /* JADX INFO: renamed from: z */
        public static final int[] f118785z;

        /* JADX INFO: renamed from: a */
        public final List<SpannableString> f118786a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final SpannableStringBuilder f118787b = new SpannableStringBuilder();

        /* JADX INFO: renamed from: c */
        public boolean f118788c;

        /* JADX INFO: renamed from: d */
        public boolean f118789d;

        /* JADX INFO: renamed from: e */
        public int f118790e;

        /* JADX INFO: renamed from: f */
        public boolean f118791f;

        /* JADX INFO: renamed from: g */
        public int f118792g;

        /* JADX INFO: renamed from: h */
        public int f118793h;

        /* JADX INFO: renamed from: i */
        public int f118794i;

        /* JADX INFO: renamed from: j */
        public int f118795j;

        /* JADX INFO: renamed from: k */
        public boolean f118796k;

        /* JADX INFO: renamed from: l */
        public int f118797l;

        /* JADX INFO: renamed from: m */
        public int f118798m;

        /* JADX INFO: renamed from: n */
        public int f118799n;

        /* JADX INFO: renamed from: o */
        public int f118800o;

        /* JADX INFO: renamed from: p */
        public int f118801p;

        /* JADX INFO: renamed from: q */
        public int f118802q;

        /* JADX INFO: renamed from: r */
        public int f118803r;

        /* JADX INFO: renamed from: s */
        public int f118804s;

        /* JADX INFO: renamed from: t */
        public int f118805t;

        /* JADX INFO: renamed from: u */
        public int f118806u;

        /* JADX INFO: renamed from: v */
        public int f118807v;

        static {
            int iM142292h = m142292h(0, 0, 0, 0);
            f118783x = iM142292h;
            int iM142292h2 = m142292h(0, 0, 0, 3);
            f118784y = iM142292h2;
            f118785z = new int[]{0, 0, 0, 0, 0, 2, 0};
            f118775A = new int[]{0, 0, 0, 0, 0, 0, 2};
            f118776B = new int[]{3, 3, 3, 3, 3, 3, 1};
            f118777C = new boolean[]{false, false, false, true, true, true, false};
            f118778D = new int[]{iM142292h, iM142292h2, iM142292h, iM142292h, iM142292h2, iM142292h, iM142292h};
            f118779E = new int[]{0, 1, 2, 3, 4, 3, 4};
            f118780F = new int[]{0, 0, 0, 0, 0, 3, 3};
            f118781G = new int[]{iM142292h, iM142292h, iM142292h, iM142292h, iM142292h, iM142292h2, iM142292h2};
        }

        public C17822b() {
            m142302l();
        }

        /* JADX INFO: renamed from: g */
        public static int m142291g(int i, int i2, int i3) {
            return m142292h(i, i2, i3, 0);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x001b  */
        /* JADX INFO: renamed from: h */
        public static int m142292h(int i, int i2, int i3, int i4) {
            int i5;
            p11.m167009c(i, 0, 4);
            p11.m167009c(i2, 0, 4);
            p11.m167009c(i3, 0, 4);
            p11.m167009c(i4, 0, 4);
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
        public void m142293a(char c) {
            if (c != '\n') {
                this.f118787b.append(c);
                return;
            }
            this.f118786a.add(m142296d());
            this.f118787b.clear();
            if (this.f118801p != -1) {
                this.f118801p = 0;
            }
            if (this.f118802q != -1) {
                this.f118802q = 0;
            }
            if (this.f118803r != -1) {
                this.f118803r = 0;
            }
            if (this.f118805t != -1) {
                this.f118805t = 0;
            }
            while (true) {
                if ((!this.f118796k || this.f118786a.size() < this.f118795j) && this.f118786a.size() < 15) {
                    return;
                } else {
                    this.f118786a.remove(0);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m142294b() {
            int length = this.f118787b.length();
            if (length > 0) {
                this.f118787b.delete(length - 1, length);
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
        public p149l.jn4.C17821a m142295c() {
            /*
                r12 = this;
                boolean r0 = r12.m142300j()
                if (r0 == 0) goto L8
                r12 = 0
                return r12
            L8:
                android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
                r1.<init>()
                r0 = 0
                r2 = r0
            Lf:
                java.util.List<android.text.SpannableString> r3 = r12.f118786a
                int r3 = r3.size()
                if (r2 >= r3) goto L2a
                java.util.List<android.text.SpannableString> r3 = r12.f118786a
                java.lang.Object r3 = r3.get(r2)
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r1.append(r3)
                r3 = 10
                r1.append(r3)
                int r2 = r2 + 1
                goto Lf
            L2a:
                android.text.SpannableString r2 = r12.m142296d()
                r1.append(r2)
                int r2 = r12.f118797l
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
                int r12 = r12.f118797l
                p149l.bub.m103905a(r0, r12)
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
                boolean r6 = r12.f118791f
                int r7 = r12.f118793h
                if (r6 == 0) goto L5f
                float r6 = (float) r7
                r7 = 1120272384(0x42c60000, float:99.0)
                float r6 = r6 / r7
                int r8 = r12.f118792g
                float r8 = (float) r8
                float r8 = r8 / r7
                goto L6a
            L5f:
                float r6 = (float) r7
                r7 = 1129381888(0x43510000, float:209.0)
                float r6 = r6 / r7
                int r7 = r12.f118792g
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
                int r7 = r12.f118794i
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
                int r3 = r12.f118800o
                int r4 = p149l.jn4.C17822b.f118783x
                if (r3 == r4) goto L98
                goto L99
            L98:
                r9 = r0
            L99:
                l.jn4$a r0 = new l.jn4$a
                int r10 = r12.f118800o
                int r11 = r12.f118790e
                r4 = 0
                r3 = r8
                r8 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p149l.jn4.C17822b.m142295c():l.jn4$a");
        }

        /* JADX INFO: renamed from: d */
        public SpannableString m142296d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f118787b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f118801p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f118801p, length, 33);
                }
                if (this.f118802q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f118802q, length, 33);
                }
                if (this.f118803r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f118804s), this.f118803r, length, 33);
                }
                if (this.f118805t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f118806u), this.f118805t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* JADX INFO: renamed from: e */
        public void m142297e() {
            this.f118786a.clear();
            this.f118787b.clear();
            this.f118801p = -1;
            this.f118802q = -1;
            this.f118803r = -1;
            this.f118805t = -1;
            this.f118807v = 0;
        }

        /* JADX INFO: renamed from: f */
        public void m142298f(boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f118788c = true;
            this.f118789d = z;
            this.f118796k = z2;
            this.f118790e = i;
            this.f118791f = z4;
            this.f118792g = i2;
            this.f118793h = i3;
            this.f118794i = i6;
            int i9 = i4 + 1;
            if (this.f118795j != i9) {
                this.f118795j = i9;
                while (true) {
                    if ((!z2 || this.f118786a.size() < this.f118795j) && this.f118786a.size() < 15) {
                        break;
                    } else {
                        this.f118786a.remove(0);
                    }
                }
            }
            if (i7 != 0 && this.f118798m != i7) {
                this.f118798m = i7;
                int i10 = i7 - 1;
                m142307q(f118778D[i10], f118784y, f118777C[i10], 0, f118775A[i10], f118776B[i10], f118785z[i10]);
            }
            if (i8 == 0 || this.f118799n == i8) {
                return;
            }
            this.f118799n = i8;
            int i11 = i8 - 1;
            m142303m(0, 1, 1, false, false, f118780F[i11], f118779E[i11]);
            m142304n(f118782w, f118781G[i11], f118783x);
        }

        /* JADX INFO: renamed from: i */
        public boolean m142299i() {
            return this.f118788c;
        }

        /* JADX INFO: renamed from: j */
        public boolean m142300j() {
            if (m142299i()) {
                return this.f118786a.isEmpty() && this.f118787b.length() == 0;
            }
            return true;
        }

        /* JADX INFO: renamed from: k */
        public boolean m142301k() {
            return this.f118789d;
        }

        /* JADX INFO: renamed from: l */
        public void m142302l() {
            m142297e();
            this.f118788c = false;
            this.f118789d = false;
            this.f118790e = 4;
            this.f118791f = false;
            this.f118792g = 0;
            this.f118793h = 0;
            this.f118794i = 0;
            this.f118795j = 15;
            this.f118796k = true;
            this.f118797l = 0;
            this.f118798m = 0;
            this.f118799n = 0;
            int i = f118783x;
            this.f118800o = i;
            this.f118804s = f118782w;
            this.f118806u = i;
        }

        /* JADX INFO: renamed from: m */
        public void m142303m(int i, int i2, int i3, boolean z, boolean z2, int i4, int i5) {
            if (this.f118801p != -1) {
                if (!z) {
                    this.f118787b.setSpan(new StyleSpan(2), this.f118801p, this.f118787b.length(), 33);
                    this.f118801p = -1;
                }
            } else if (z) {
                this.f118801p = this.f118787b.length();
            }
            if (this.f118802q == -1) {
                if (z2) {
                    this.f118802q = this.f118787b.length();
                }
            } else {
                if (z2) {
                    return;
                }
                this.f118787b.setSpan(new UnderlineSpan(), this.f118802q, this.f118787b.length(), 33);
                this.f118802q = -1;
            }
        }

        /* JADX INFO: renamed from: n */
        public void m142304n(int i, int i2, int i3) {
            if (this.f118803r != -1 && this.f118804s != i) {
                this.f118787b.setSpan(new ForegroundColorSpan(this.f118804s), this.f118803r, this.f118787b.length(), 33);
            }
            if (i != f118782w) {
                this.f118803r = this.f118787b.length();
                this.f118804s = i;
            }
            if (this.f118805t != -1 && this.f118806u != i2) {
                this.f118787b.setSpan(new BackgroundColorSpan(this.f118806u), this.f118805t, this.f118787b.length(), 33);
            }
            if (i2 != f118783x) {
                this.f118805t = this.f118787b.length();
                this.f118806u = i2;
            }
        }

        /* JADX INFO: renamed from: o */
        public void m142305o(int i, int i2) {
            if (this.f118807v != i) {
                m142293a('\n');
            }
            this.f118807v = i;
        }

        /* JADX INFO: renamed from: p */
        public void m142306p(boolean z) {
            this.f118789d = z;
        }

        /* JADX INFO: renamed from: q */
        public void m142307q(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
            this.f118800o = i;
            this.f118797l = i6;
        }
    }

    /* JADX INFO: renamed from: l.jn4$c */
    public static final class C17823c {

        /* JADX INFO: renamed from: a */
        public final int f118808a;

        /* JADX INFO: renamed from: b */
        public final int f118809b;

        /* JADX INFO: renamed from: c */
        public final byte[] f118810c;

        /* JADX INFO: renamed from: d */
        public int f118811d = 0;

        public C17823c(int i, int i2) {
            this.f118808a = i;
            this.f118809b = i2;
            this.f118810c = new byte[(i2 * 2) - 1];
        }
    }

    public jn4(int i, @Nullable List<byte[]> list) {
        this.f118765k = i == -1 ? 1 : i;
        this.f118764j = list != null && lb5.m149207i(list);
        this.f118766l = new C17822b[8];
        int i2 = 0;
        while (true) {
            C17822b[] c17822bArr = this.f118766l;
            if (i2 >= 8) {
                this.f118767m = c17822bArr[0];
                return;
            } else {
                c17822bArr[i2] = new C17822b();
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: E */
    private void m142272E() {
        for (int i = 0; i < 8; i++) {
            this.f118766l[i].m142302l();
        }
    }

    /* JADX INFO: renamed from: p */
    private List<ywb> m142273p() {
        C17821a c17821aM142295c;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            if (!this.f118766l[i].m142300j() && this.f118766l[i].m142301k() && (c17821aM142295c = this.f118766l[i].m142295c()) != null) {
                arrayList.add(c17821aM142295c);
            }
        }
        Collections.sort(arrayList, C17821a.f118772c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.add(((C17821a) arrayList.get(i2)).f118773a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    /* JADX INFO: renamed from: A */
    public final void m142274A() {
        int iM142292h = C17822b.m142292h(this.f118762h.m105664h(2), this.f118762h.m105664h(2), this.f118762h.m105664h(2), this.f118762h.m105664h(2));
        int iM142292h2 = C17822b.m142292h(this.f118762h.m105664h(2), this.f118762h.m105664h(2), this.f118762h.m105664h(2), this.f118762h.m105664h(2));
        this.f118762h.m105674r(2);
        this.f118767m.m142304n(iM142292h, iM142292h2, C17822b.m142291g(this.f118762h.m105664h(2), this.f118762h.m105664h(2), this.f118762h.m105664h(2)));
    }

    /* JADX INFO: renamed from: B */
    public final void m142275B() {
        this.f118762h.m105674r(4);
        int iM105664h = this.f118762h.m105664h(4);
        this.f118762h.m105674r(2);
        this.f118767m.m142305o(iM105664h, this.f118762h.m105664h(6));
    }

    /* JADX INFO: renamed from: C */
    public final void m142276C() {
        int iM142292h = C17822b.m142292h(this.f118762h.m105664h(2), this.f118762h.m105664h(2), this.f118762h.m105664h(2), this.f118762h.m105664h(2));
        int iM105664h = this.f118762h.m105664h(2);
        int iM142291g = C17822b.m142291g(this.f118762h.m105664h(2), this.f118762h.m105664h(2), this.f118762h.m105664h(2));
        if (this.f118762h.m105663g()) {
            iM105664h |= 4;
        }
        boolean zM105663g = this.f118762h.m105663g();
        int iM105664h2 = this.f118762h.m105664h(2);
        int iM105664h3 = this.f118762h.m105664h(2);
        int iM105664h4 = this.f118762h.m105664h(2);
        this.f118762h.m105674r(8);
        this.f118767m.m142307q(iM142292h, iM142291g, zM105663g, iM105664h, iM105664h2, iM105664h3, iM105664h4);
    }

    @RequiresNonNull({"currentDtvCcPacket"})
    /* JADX INFO: renamed from: D */
    public final void m142277D() {
        C17823c c17823c = this.f118770p;
        if (c17823c.f118811d != (c17823c.f118809b * 2) - 1) {
            jwv.m143682b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f118770p.f118809b * 2) - 1) + ", but current index is " + this.f118770p.f118811d + " (sequence number " + this.f118770p.f118808a + ");");
        }
        c860 c860Var = this.f118762h;
        C17823c c17823c2 = this.f118770p;
        c860Var.m105671o(c17823c2.f118810c, c17823c2.f118811d);
        boolean z = false;
        while (this.f118762h.m105658b() > 0) {
            int iM105664h = this.f118762h.m105664h(3);
            int iM105664h2 = this.f118762h.m105664h(5);
            if (iM105664h == 7) {
                this.f118762h.m105674r(2);
                iM105664h = this.f118762h.m105664h(6);
                if (iM105664h < 7) {
                    jwv.m143689i("Cea708Decoder", "Invalid extended service number: " + iM105664h);
                }
            }
            if (iM105664h2 == 0) {
                if (iM105664h == 0) {
                    break;
                }
                jwv.m143689i("Cea708Decoder", "serviceNumber is non-zero (" + iM105664h + ") when blockSize is 0");
                break;
            }
            int i = this.f118765k;
            c860 c860Var2 = this.f118762h;
            if (iM105664h != i) {
                c860Var2.m105675s(iM105664h2);
            } else {
                int iM105661e = c860Var2.m105661e() + (iM105664h2 * 8);
                while (this.f118762h.m105661e() < iM105661e) {
                    int iM105664h3 = this.f118762h.m105664h(8);
                    if (iM105664h3 == 16) {
                        int iM105664h4 = this.f118762h.m105664h(8);
                        if (iM105664h4 <= 31) {
                            m142281s(iM105664h4);
                        } else {
                            if (iM105664h4 <= 127) {
                                m142286x(iM105664h4);
                            } else if (iM105664h4 <= 159) {
                                m142282t(iM105664h4);
                            } else if (iM105664h4 <= 255) {
                                m142287y(iM105664h4);
                            } else {
                                jwv.m143689i("Cea708Decoder", "Invalid extended command: " + iM105664h4);
                            }
                            z = true;
                        }
                    } else if (iM105664h3 <= 31) {
                        m142279q(iM105664h3);
                    } else {
                        if (iM105664h3 <= 127) {
                            m142284v(iM105664h3);
                        } else if (iM105664h3 <= 159) {
                            m142280r(iM105664h3);
                        } else if (iM105664h3 <= 255) {
                            m142285w(iM105664h3);
                        } else {
                            jwv.m143689i("Cea708Decoder", "Invalid base command: " + iM105664h3);
                        }
                        z = true;
                    }
                }
            }
        }
        if (z) {
            this.f118768n = m142273p();
        }
    }

    @Override // p149l.ln4, p149l.g5g0
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ void mo124526b(long j) {
        super.mo124526b(j);
    }

    @Override // p149l.ln4
    /* JADX INFO: renamed from: e */
    public e5g0 mo131851e() {
        List<ywb> list = this.f118768n;
        this.f118769o = list;
        return new mn4((List) p11.m167011e(list));
    }

    @Override // p149l.ln4
    /* JADX INFO: renamed from: f */
    public void mo131852f(j5g0 j5g0Var) {
        ByteBuffer byteBuffer = (ByteBuffer) p11.m167011e(j5g0Var.f7375c);
        this.f118761g.m110290S(byteBuffer.array(), byteBuffer.limit());
        while (this.f118761g.m110295a() >= 3) {
            int iM110279H = this.f118761g.m110279H();
            int i = iM110279H & 3;
            boolean z = (iM110279H & 4) == 4;
            byte bM110279H = (byte) this.f118761g.m110279H();
            byte bM110279H2 = (byte) this.f118761g.m110279H();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        m142278o();
                        int i2 = (bM110279H & 192) >> 6;
                        int i3 = this.f118763i;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            m142272E();
                            jwv.m143689i("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f118763i + " current=" + i2);
                        }
                        this.f118763i = i2;
                        int i4 = bM110279H & Utf8.REPLACEMENT_BYTE;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        C17823c c17823c = new C17823c(i2, i4);
                        this.f118770p = c17823c;
                        byte[] bArr = c17823c.f118810c;
                        int i5 = c17823c.f118811d;
                        c17823c.f118811d = i5 + 1;
                        bArr[i5] = bM110279H2;
                    } else {
                        p11.m167007a(i == 2);
                        C17823c c17823c2 = this.f118770p;
                        if (c17823c2 == null) {
                            jwv.m143683c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c17823c2.f118810c;
                            int i6 = c17823c2.f118811d;
                            int i7 = i6 + 1;
                            c17823c2.f118811d = i7;
                            bArr2[i6] = bM110279H;
                            c17823c2.f118811d = i6 + 2;
                            bArr2[i7] = bM110279H2;
                        }
                    }
                    C17823c c17823c3 = this.f118770p;
                    if (c17823c3.f118811d == (c17823c3.f118809b * 2) - 1) {
                        m142278o();
                    }
                }
            }
        }
    }

    @Override // p149l.ln4, p149l.bhd
    public void flush() {
        super.flush();
        this.f118768n = null;
        this.f118769o = null;
        this.f118771q = 0;
        this.f118767m = this.f118766l[0];
        m142272E();
        this.f118770p = null;
    }

    @Override // p149l.ln4
    @Nullable
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ j5g0 mo101811a() throws SubtitleDecoderException {
        return super.mo101811a();
    }

    @Override // p149l.ln4
    @Nullable
    /* JADX INFO: renamed from: h */
    public /* bridge */ /* synthetic */ k5g0 mo101812c() throws SubtitleDecoderException {
        return super.mo101812c();
    }

    @Override // p149l.ln4
    /* JADX INFO: renamed from: k */
    public boolean mo131855k() {
        return this.f118768n != this.f118769o;
    }

    @Override // p149l.ln4
    /* JADX INFO: renamed from: l */
    public /* bridge */ /* synthetic */ void mo101813d(j5g0 j5g0Var) throws SubtitleDecoderException {
        super.mo101813d(j5g0Var);
    }

    /* JADX INFO: renamed from: o */
    public final void m142278o() {
        if (this.f118770p == null) {
            return;
        }
        m142277D();
        this.f118770p = null;
    }

    /* JADX INFO: renamed from: q */
    public final void m142279q(int i) {
        if (i != 0) {
            if (i == 3) {
                this.f118768n = m142273p();
                return;
            }
            if (i == 8) {
                this.f118767m.m142294b();
                return;
            }
            switch (i) {
                case 12:
                    m142272E();
                    break;
                case 13:
                    this.f118767m.m142293a('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i >= 17 && i <= 23) {
                        jwv.m143689i("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i);
                        this.f118762h.m105674r(8);
                    } else if (i >= 24 && i <= 31) {
                        jwv.m143689i("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i);
                        this.f118762h.m105674r(16);
                    } else {
                        jwv.m143689i("Cea708Decoder", "Invalid C0 command: " + i);
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: r */
    public final void m142280r(int i) {
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
                if (this.f118771q != i3) {
                    this.f118771q = i3;
                    this.f118767m = this.f118766l[i3];
                }
                break;
            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA /* 136 */:
                while (i2 <= 8) {
                    if (this.f118762h.m105663g()) {
                        this.f118766l[8 - i2].m142297e();
                    }
                    i2++;
                }
                break;
            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA /* 137 */:
                for (int i4 = 1; i4 <= 8; i4++) {
                    if (this.f118762h.m105663g()) {
                        this.f118766l[8 - i4].m142306p(true);
                    }
                }
                break;
            case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                while (i2 <= 8) {
                    if (this.f118762h.m105663g()) {
                        this.f118766l[8 - i2].m142306p(false);
                    }
                    i2++;
                }
                break;
            case CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA /* 139 */:
                for (int i5 = 1; i5 <= 8; i5++) {
                    if (this.f118762h.m105663g()) {
                        C17822b c17822b = this.f118766l[8 - i5];
                        c17822b.m142306p(!c17822b.m142301k());
                    }
                }
                break;
            case 140:
                while (i2 <= 8) {
                    if (this.f118762h.m105663g()) {
                        this.f118766l[8 - i2].m142302l();
                    }
                    i2++;
                }
                break;
            case CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA /* 141 */:
                this.f118762h.m105674r(8);
                break;
            case CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA /* 142 */:
                break;
            case CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA /* 143 */:
                m142272E();
                break;
            case 144:
                if (this.f118767m.m142299i()) {
                    m142288z();
                } else {
                    this.f118762h.m105674r(16);
                }
                break;
            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA /* 145 */:
                if (this.f118767m.m142299i()) {
                    m142274A();
                } else {
                    this.f118762h.m105674r(24);
                }
                break;
            case CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA /* 146 */:
                if (this.f118767m.m142299i()) {
                    m142275B();
                } else {
                    this.f118762h.m105674r(16);
                }
                break;
            case CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA /* 147 */:
            case 148:
            case 149:
            case 150:
            default:
                jwv.m143689i("Cea708Decoder", "Invalid C1 command: " + i);
                break;
            case 151:
                if (this.f118767m.m142299i()) {
                    m142276C();
                } else {
                    this.f118762h.m105674r(32);
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
                m142283u(i6);
                if (this.f118771q != i6) {
                    this.f118771q = i6;
                    this.f118767m = this.f118766l[i6];
                }
                break;
        }
    }

    @Override // p149l.ln4, p149l.bhd
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    /* JADX INFO: renamed from: s */
    public final void m142281s(int i) {
        if (i <= 7) {
            return;
        }
        if (i <= 15) {
            this.f118762h.m105674r(8);
        } else if (i <= 23) {
            this.f118762h.m105674r(16);
        } else if (i <= 31) {
            this.f118762h.m105674r(24);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m142282t(int i) {
        if (i <= 135) {
            this.f118762h.m105674r(32);
            return;
        }
        if (i <= 143) {
            this.f118762h.m105674r(40);
        } else if (i <= 159) {
            this.f118762h.m105674r(2);
            this.f118762h.m105674r(this.f118762h.m105664h(6) * 8);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m142283u(int i) {
        C17822b c17822b = this.f118766l[i];
        this.f118762h.m105674r(2);
        boolean zM105663g = this.f118762h.m105663g();
        boolean zM105663g2 = this.f118762h.m105663g();
        boolean zM105663g3 = this.f118762h.m105663g();
        int iM105664h = this.f118762h.m105664h(3);
        boolean zM105663g4 = this.f118762h.m105663g();
        int iM105664h2 = this.f118762h.m105664h(7);
        int iM105664h3 = this.f118762h.m105664h(8);
        int iM105664h4 = this.f118762h.m105664h(4);
        int iM105664h5 = this.f118762h.m105664h(4);
        this.f118762h.m105674r(2);
        int iM105664h6 = this.f118762h.m105664h(6);
        this.f118762h.m105674r(2);
        c17822b.m142298f(zM105663g, zM105663g2, zM105663g3, iM105664h, zM105663g4, iM105664h2, iM105664h3, iM105664h5, iM105664h6, iM105664h4, this.f118762h.m105664h(3), this.f118762h.m105664h(3));
    }

    /* JADX INFO: renamed from: v */
    public final void m142284v(int i) {
        C17822b c17822b = this.f118767m;
        if (i == 127) {
            c17822b.m142293a((char) 9835);
        } else {
            c17822b.m142293a((char) (i & 255));
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m142285w(int i) {
        this.f118767m.m142293a((char) (i & 255));
    }

    /* JADX INFO: renamed from: x */
    public final void m142286x(int i) {
        if (i == 32) {
            this.f118767m.m142293a(' ');
            return;
        }
        if (i == 33) {
            this.f118767m.m142293a((char) 160);
            return;
        }
        if (i == 37) {
            this.f118767m.m142293a((char) 8230);
            return;
        }
        if (i == 42) {
            this.f118767m.m142293a((char) 352);
            return;
        }
        if (i == 44) {
            this.f118767m.m142293a((char) 338);
            return;
        }
        if (i == 63) {
            this.f118767m.m142293a((char) 376);
            return;
        }
        if (i == 57) {
            this.f118767m.m142293a((char) 8482);
            return;
        }
        if (i == 58) {
            this.f118767m.m142293a((char) 353);
            return;
        }
        if (i == 60) {
            this.f118767m.m142293a((char) 339);
            return;
        }
        if (i == 61) {
            this.f118767m.m142293a((char) 8480);
            return;
        }
        switch (i) {
            case 48:
                this.f118767m.m142293a((char) 9608);
                break;
            case 49:
                this.f118767m.m142293a((char) 8216);
                break;
            case 50:
                this.f118767m.m142293a((char) 8217);
                break;
            case 51:
                this.f118767m.m142293a((char) 8220);
                break;
            case 52:
                this.f118767m.m142293a((char) 8221);
                break;
            case 53:
                this.f118767m.m142293a((char) 8226);
                break;
            default:
                switch (i) {
                    case 118:
                        this.f118767m.m142293a((char) 8539);
                        break;
                    case 119:
                        this.f118767m.m142293a((char) 8540);
                        break;
                    case 120:
                        this.f118767m.m142293a((char) 8541);
                        break;
                    case 121:
                        this.f118767m.m142293a((char) 8542);
                        break;
                    case 122:
                        this.f118767m.m142293a((char) 9474);
                        break;
                    case 123:
                        this.f118767m.m142293a((char) 9488);
                        break;
                    case 124:
                        this.f118767m.m142293a((char) 9492);
                        break;
                    case 125:
                        this.f118767m.m142293a((char) 9472);
                        break;
                    case 126:
                        this.f118767m.m142293a((char) 9496);
                        break;
                    case 127:
                        this.f118767m.m142293a((char) 9484);
                        break;
                    default:
                        jwv.m143689i("Cea708Decoder", "Invalid G2 character: " + i);
                        break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m142287y(int i) {
        if (i == 160) {
            this.f118767m.m142293a((char) 13252);
            return;
        }
        jwv.m143689i("Cea708Decoder", "Invalid G3 character: " + i);
        this.f118767m.m142293a('_');
    }

    /* JADX INFO: renamed from: z */
    public final void m142288z() {
        this.f118767m.m142303m(this.f118762h.m105664h(4), this.f118762h.m105664h(2), this.f118762h.m105664h(2), this.f118762h.m105663g(), this.f118762h.m105663g(), this.f118762h.m105664h(3), this.f118762h.m105664h(3));
    }
}
