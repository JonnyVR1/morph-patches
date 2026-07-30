package com.p000p1.mobile.putong.feed.newui.mediapicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.immomo.moment.mediautils.VideoDataRetrieverBySoft;
import com.immomo.moment.mediautils.cmds.VideoCut;
import com.immomo.moment.mediautils.cmds.VideoEffects;
import com.p000p1.mobile.putong.data.Dimension;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.newui.camera.ReloadSoAct;
import com.p000p1.mobile.putong.feed.newui.camera.VideoEditAct;
import com.p000p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView;
import com.p000p1.mobile.putong.feed.newui.mediapicker.NewAlbumVideoEditAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;
import l.d30;
import l.dac0;
import l.djx;
import l.e30;
import l.e51;
import l.g30;
import l.jmw;
import l.k9j;
import l.mkd0;
import l.n500;
import l.ogw;
import l.p7m;
import l.qib0;
import l.r5l0;
import l.rhi;
import l.roj0;
import l.s5l0;
import l.t100;
import l.v500;
import l.vwb;
import l.xdl0;
import p007l.e1c0;
import p007l.ebl0;
import p007l.fh20;
import p007l.vb4;
import rx.subjects.a;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VRecyclerView;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class NewAlbumVideoEditAct extends ReloadSoAct implements jmw {

    /* JADX INFO: renamed from: C */
    public int f1882C;

    /* JADX INFO: renamed from: D */
    public int f1883D;

    /* JADX INFO: renamed from: E */
    public VImage f1884E;

    /* JADX INFO: renamed from: F */
    public VImage f1885F;

    /* JADX INFO: renamed from: G */
    public C2077e f1886G;

    /* JADX INFO: renamed from: H */
    public VideoDataRetrieverBySoft f1887H;

    /* JADX INFO: renamed from: I */
    public r5l0 f1888I;

    /* JADX INFO: renamed from: J */
    public String f1889J;

    /* JADX INFO: renamed from: K */
    public String f1890K;

    /* JADX INFO: renamed from: L */
    public File f1891L;

    /* JADX INFO: renamed from: M */
    public int[] f1892M;

    /* JADX INFO: renamed from: N */
    public TextView f1893N;

    /* JADX INFO: renamed from: c */
    public VLinear f1894c;

    /* JADX INFO: renamed from: d */
    public VNavigationBar f1895d;

    /* JADX INFO: renamed from: e */
    public TextureView f1896e;

    /* JADX INFO: renamed from: f */
    public VText f1897f;

    /* JADX INFO: renamed from: g */
    public VRecyclerView f1898g;

    /* JADX INFO: renamed from: h */
    public VideoCutDrawView f1899h;

    /* JADX INFO: renamed from: i */
    public Video f1900i;

    /* JADX INFO: renamed from: j */
    public String f1901j;

    /* JADX INFO: renamed from: k */
    public v500 f1902k;

    /* JADX INFO: renamed from: l */
    public VideoCut f1903l;

    /* JADX INFO: renamed from: n */
    public p7m f1905n;

    /* JADX INFO: renamed from: x */
    public int f1915x;

    /* JADX INFO: renamed from: y */
    public int f1916y;

    /* JADX INFO: renamed from: m */
    public boolean f1904m = false;

    /* JADX INFO: renamed from: o */
    public long f1906o = 0;

    /* JADX INFO: renamed from: p */
    public long f1907p = 0;

    /* JADX INFO: renamed from: q */
    public int f1908q = 15000;

    /* JADX INFO: renamed from: r */
    public int f1909r = 3000;

    /* JADX INFO: renamed from: s */
    public float f1910s = 1500.0f;

    /* JADX INFO: renamed from: t */
    public final int f1911t = t100.d(4.0f);

    /* JADX INFO: renamed from: u */
    public final int f1912u = t100.d(56.0f);

    /* JADX INFO: renamed from: v */
    public int f1913v = Color.parseColor("#EEEFF1");

    /* JADX INFO: renamed from: w */
    public int f1914w = Color.parseColor("#F6F7F8");

    /* JADX INFO: renamed from: z */
    public float f1917z = 0.0f;

    /* JADX INFO: renamed from: A */
    public int f1880A = 0;

    /* JADX INFO: renamed from: B */
    public a<Pair<Integer, VDraweeView>> f1881B = a.b();

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.NewAlbumVideoEditAct$a */
    public class TextureViewSurfaceTextureListenerC2073a implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC2073a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            if (NullChecker.a(NewAlbumVideoEditAct.this.f1892M)) {
                surfaceTexture.setDefaultBufferSize(NewAlbumVideoEditAct.this.f1892M[0], NewAlbumVideoEditAct.this.f1892M[1]);
            }
            if (NullChecker.b(surfaceTexture)) {
                NewAlbumVideoEditAct.this.f1905n.h(surfaceTexture);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            if (!NullChecker.a(NewAlbumVideoEditAct.this.f1905n)) {
                return false;
            }
            NewAlbumVideoEditAct.this.f1905n.a();
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            if (NullChecker.a(NewAlbumVideoEditAct.this.f1892M)) {
                surfaceTexture.setDefaultBufferSize(NewAlbumVideoEditAct.this.f1892M[0], NewAlbumVideoEditAct.this.f1892M[1]);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            if (NullChecker.a(NewAlbumVideoEditAct.this.f1892M)) {
                surfaceTexture.setDefaultBufferSize(NewAlbumVideoEditAct.this.f1892M[0], NewAlbumVideoEditAct.this.f1892M[1]);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.NewAlbumVideoEditAct$b */
    public class RunnableC2074b implements Runnable {
        public RunnableC2074b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NullChecker.a(NewAlbumVideoEditAct.this.f1887H)) {
                NewAlbumVideoEditAct.this.f1887H.release();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.NewAlbumVideoEditAct$c */
    public class C2075c extends e51.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Pair f1920a;

        public C2075c(Pair pair) {
            this.f1920a = pair;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m3452a(Pair pair, String str) {
            if (((VDraweeView) pair.second).getTag() != pair.first) {
                return;
            }
            qib0.G.i0((SimpleDraweeView) pair.second, "file://" + str);
        }

        public void run() {
            final String strM;
            Object tag = ((VDraweeView) this.f1920a.second).getTag();
            Object obj = this.f1920a.first;
            if (tag != obj) {
                return;
            }
            long jM3404M2 = NewAlbumVideoEditAct.this.m3404M2(((Integer) obj).intValue());
            File file = new File(NewAlbumVideoEditAct.this.f1891L, jM3404M2 + ".jpeg");
            if (file.exists()) {
                strM = file.getAbsolutePath();
            } else {
                Bitmap frameAtTime = NewAlbumVideoEditAct.this.f1887H.getFrameAtTime(jM3404M2);
                strM = NullChecker.a(frameAtTime) ? k9j.M(frameAtTime, file, NewAlbumVideoEditAct.this.f1888I.f, NewAlbumVideoEditAct.this.f1912u) : s5l0.d(file.getAbsolutePath(), NewAlbumVideoEditAct.this.f1900i.url, (int) (jM3404M2 / 1000));
            }
            if (((VDraweeView) this.f1920a.second).getTag() != this.f1920a.first || TextUtils.isEmpty(strM)) {
                return;
            }
            final Pair pair = this.f1920a;
            e51.G(new Runnable() { // from class: l.eh20
                @Override // java.lang.Runnable
                public final void run() {
                    NewAlbumVideoEditAct.C2075c.m3452a(pair, strM);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.NewAlbumVideoEditAct$d */
    public class C2076d extends RecyclerView.t {
        public C2076d() {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 0 && NullChecker.a(NewAlbumVideoEditAct.this.f1905n)) {
                NewAlbumVideoEditAct.this.m3446a3();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.NewAlbumVideoEditAct$e */
    public class C2077e extends dac0<String> {

        /* JADX INFO: renamed from: c */
        public final int f1923c = 0;

        /* JADX INFO: renamed from: d */
        public final int f1924d = 1;

        /* JADX INFO: renamed from: e */
        public final int f1925e = 2;

        public C2077e() {
        }

        /* JADX INFO: renamed from: C */
        public int m3454C() {
            return ((int) Math.ceil(NewAlbumVideoEditAct.this.f1917z / NewAlbumVideoEditAct.this.f1910s)) + 2;
        }

        /* JADX INFO: renamed from: D */
        public View m3455D(ViewGroup viewGroup, int i) {
            if (i == 2) {
                NewAlbumVideoEditAct.this.f1885F = new VImage(((Act) NewAlbumVideoEditAct.this).act);
                NewAlbumVideoEditAct.this.f1885F.setLayoutParams(new FrameLayout.LayoutParams(xdl0.y0() - NewAlbumVideoEditAct.this.f1883D, NewAlbumVideoEditAct.this.f1912u));
                return NewAlbumVideoEditAct.this.f1885F;
            }
            if (i != 0) {
                return new VDraweeView(((Act) NewAlbumVideoEditAct.this).act);
            }
            NewAlbumVideoEditAct.this.f1884E = new VImage(((Act) NewAlbumVideoEditAct.this).act);
            NewAlbumVideoEditAct.this.f1884E.setLayoutParams(new FrameLayout.LayoutParams(xdl0.y0(), NewAlbumVideoEditAct.this.f1912u));
            NewAlbumVideoEditAct.this.f1884E.setTag(0);
            return NewAlbumVideoEditAct.this.f1884E;
        }

        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void m3453A(View view, String str, int i, int i2) {
            FrameLayout.LayoutParams layoutParams;
            if (i == 2) {
                if (NewAlbumVideoEditAct.this.f1885F.getLayoutParams().width != xdl0.y0() - NewAlbumVideoEditAct.this.f1883D) {
                    NewAlbumVideoEditAct.this.f1885F.getLayoutParams().width = xdl0.y0() - NewAlbumVideoEditAct.this.f1883D;
                    NewAlbumVideoEditAct.this.f1885F.setTag(Integer.valueOf(i2));
                    return;
                }
                return;
            }
            if (i == 1) {
                VDraweeView vDraweeView = (VDraweeView) view;
                int i3 = i2 % 2;
                NewAlbumVideoEditAct newAlbumVideoEditAct = NewAlbumVideoEditAct.this;
                vDraweeView.setBackgroundColor(i3 == 0 ? newAlbumVideoEditAct.f1913v : newAlbumVideoEditAct.f1914w);
                if (i2 == m3454C() - 2) {
                    vDraweeView.getHierarchy().H(new RoundingParams().r(0.0f, NewAlbumVideoEditAct.this.f1911t, NewAlbumVideoEditAct.this.f1911t, 0.0f));
                    layoutParams = new FrameLayout.LayoutParams(NewAlbumVideoEditAct.this.f1916y - (NewAlbumVideoEditAct.this.f1880A * (m3454C() - 3)), NewAlbumVideoEditAct.this.f1912u);
                } else if (i2 == 1) {
                    vDraweeView.getHierarchy().H(new RoundingParams().r(NewAlbumVideoEditAct.this.f1911t, 0.0f, 0.0f, NewAlbumVideoEditAct.this.f1911t));
                    layoutParams = new FrameLayout.LayoutParams(NewAlbumVideoEditAct.this.f1880A, NewAlbumVideoEditAct.this.f1912u);
                } else {
                    vDraweeView.getHierarchy().H(new RoundingParams().r(0.0f, 0.0f, 0.0f, 0.0f));
                    layoutParams = new FrameLayout.LayoutParams(NewAlbumVideoEditAct.this.f1880A, NewAlbumVideoEditAct.this.f1912u);
                }
                vDraweeView.setLayoutParams(layoutParams);
                vDraweeView.setTag(Integer.valueOf(i2));
                NewAlbumVideoEditAct.this.f1881B.onNext(new Pair(Integer.valueOf(i2), vDraweeView));
            }
        }

        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public String getItem(int i) {
            return String.valueOf(i);
        }

        public long getItemId(int i) {
            return i;
        }

        public int getItemViewType(int i) {
            if (i == m3454C() - 1) {
                return 2;
            }
            return i == 0 ? 0 : 1;
        }
    }

    /* JADX INFO: renamed from: K2 */
    public static Intent m3402K2(Context context, Media media, String str) {
        Intent intent = new Intent(context, (Class<?>) NewAlbumVideoEditAct.class);
        intent.putExtra(Media.TYPE, media);
        intent.putExtra("extra_from", str);
        return intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L2 */
    private void m3403L2() {
        startActivity(VideoEditAct.m2169Y1(act(), this.f1889J, this.f1906o, this.f1907p, true, this.f1901j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M2 */
    public long m3404M2(int i) {
        return ((long) this.f1910s) * ((long) (i - 1)) * 1000;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N2 */
    private void m3405N2() {
        this.f1895d.setTitle(R$string.f584p0);
        this.f1895d.setLeftIconAsBack(this);
        TextView textView = new TextView(this);
        this.f1893N = textView;
        textView.setText(actionItemPadding(getResources().getString(R$string.f562m)));
        this.f1893N.setTextColor(getResources().getColor(e1c0.f7154n));
        this.f1893N.setTextSize(18.0f);
        this.f1893N.setText(actionItemPadding(string(R$string.f562m)));
        this.f1895d.z(new View[]{this.f1893N});
        this.f1893N.setOnClickListener(new View.OnClickListener() { // from class: l.bh20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6328a.m3440Q2(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R2 */
    public /* synthetic */ void m3406R2(c cVar) {
        if (cVar == c.i) {
            if (NullChecker.b(this.f1905n) && NullChecker.a(this.f1888I)) {
                this.f1905n.resume();
            }
            if (NullChecker.a(this.f1893N)) {
                this.f1893N.setEnabled(true);
                return;
            }
            return;
        }
        if (cVar == c.j) {
            this.f1904m = false;
            if (NullChecker.b(this.f1905n)) {
                this.f1905n.pause();
                return;
            }
            return;
        }
        if (cVar == c.m && NullChecker.b(this.f1905n)) {
            this.f1905n.release();
            this.f1905n = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T2 */
    public /* synthetic */ void m3407T2(roj0 roj0Var) {
        m3430r();
        ((Act) this).act.progressDismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U2 */
    public /* synthetic */ void m3408U2(Throwable th) {
        ((Act) this).act.progressDismiss();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V2 */
    public /* synthetic */ void m3410V2(Bundle bundle) {
        m3405N2();
        act().progress(act().getString(R$string.f445U2));
        rx.c.fromCallable(new Callable() { // from class: l.yg20
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f15424a.m3441S2();
            }
        }).compose(mkd0.C()).subscribe(mkd0.H(new e30() { // from class: l.zg20
            public final void call(Object obj) {
                this.f15731a.m3407T2((roj0) obj);
            }
        }, new e30() { // from class: l.ah20
            public final void call(Object obj) {
                this.f5744a.m3408U2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W2 */
    public /* synthetic */ void m3411W2() {
        e51.y(new RunnableC2074b());
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: r */
    private void m3430r() {
        m3439I2();
        Video video = this.f1900i;
        this.f1917z = video.duration;
        video.size = new Dimension();
        this.f1897f.setText(m3448c3(this.f1907p - this.f1906o));
        r5l0 r5l0Var = this.f1888I;
        int i = r5l0Var.f;
        if (i == 90 || i == 270) {
            Dimension dimension = this.f1900i.size;
            dimension.width = r5l0Var.d;
            dimension.height = r5l0Var.c;
        } else {
            Dimension dimension2 = this.f1900i.size;
            dimension2.width = r5l0Var.c;
            dimension2.height = r5l0Var.d;
        }
        this.f1916y = (t100.d(270.0f) * ((int) this.f1917z)) / this.f1908q;
        int iD = (t100.d(270.0f) * this.f1909r) / this.f1908q;
        this.f1880A = t100.d(270.0f) / 10;
        this.f1915x = this.f1916y > xdl0.y0() ? xdl0.y0() : this.f1916y;
        int iD2 = t100.d(16.0f);
        this.f1882C = iD2;
        int iD3 = t100.d(270.0f);
        int iD4 = this.f1915x;
        if (iD3 <= iD4) {
            iD4 = t100.d(270.0f);
        }
        this.f1883D = iD2 + iD4;
        this.f1899h.m3594l(this.f1882C, this.f1915x, iD, t100.d(270.0f), new g30() { // from class: l.ch20
            /* JADX INFO: renamed from: a */
            public final void m9170a(Object obj, Object obj2, Object obj3) {
                this.f6646a.m3444Y2((Integer) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
        xdl0.M0(this.f1899h, true);
        C2077e c2077e = new C2077e();
        this.f1886G = c2077e;
        c2077e.setHasStableIds(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(((Act) this).act);
        linearLayoutManager.setOrientation(0);
        e51.G(new Runnable() { // from class: l.dh20
            @Override // java.lang.Runnable
            public final void run() {
                this.f6930a.m3445Z2();
            }
        });
        this.f1898g.setLayoutManager(linearLayoutManager);
        this.f1898g.setAdapter(this.f1886G);
        this.f1898g.addOnScrollListener(new C2076d());
        linearLayoutManager.scrollToPositionWithOffset(1, t100.d(16.0f));
        this.f1905n.g();
    }

    /* JADX INFO: renamed from: H2 */
    public View m3438H2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fh20.m10113b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: I2 */
    public final void m3439I2() {
        int i;
        int i2;
        int width = this.f1896e.getWidth();
        int height = this.f1896e.getHeight();
        if (width <= 0 || height <= 0 || this.f1902k == null) {
            return;
        }
        com.p000p1.mobile.putong.feed.newui.camera.momosdk.Video video = new com.p000p1.mobile.putong.feed.newui.camera.momosdk.Video();
        video.path = this.f1902k.a;
        ebl0.m9701a(video);
        int i3 = video.width;
        int i4 = video.height;
        this.f1892M = new int[]{i3, i4};
        float f = i3 / i4;
        float f2 = width;
        float f3 = height;
        if (f2 / f3 > f) {
            i2 = (int) (f3 * f);
            i = height;
        } else {
            i = (int) (f2 / f);
            i2 = width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i2, i);
        int i5 = (width - i2) / 2;
        int i6 = (height - i) / 2;
        marginLayoutParams.setMargins(i5, i6, i5, i6);
        this.f1896e.setLayoutParams(new LinearLayout.LayoutParams(marginLayoutParams));
    }

    /* JADX INFO: renamed from: Q2 */
    public final /* synthetic */ void m3440Q2(View view) {
        view.setEnabled(false);
        m3403L2();
    }

    /* JADX INFO: renamed from: S2 */
    public final /* synthetic */ roj0 m3441S2() throws Exception {
        String strU = rhi.u(this.f1900i.url);
        this.f1889J = strU;
        this.f1888I = new r5l0(strU);
        String strB = ogw.b(this.f1900i.url + this.f1900i.duration);
        this.f1890K = strB;
        this.f1891L = k9j.L(strB);
        VideoDataRetrieverBySoft videoDataRetrieverBySoft = new VideoDataRetrieverBySoft();
        this.f1887H = videoDataRetrieverBySoft;
        videoDataRetrieverBySoft.init(this.f1889J);
        return roj0.a;
    }

    /* JADX INFO: renamed from: V */
    public void m3442V(float f) {
        this.f1899h.setPointIndex((int) (f * (this.f1883D - this.f1882C)));
    }

    /* JADX INFO: renamed from: X2 */
    public final /* synthetic */ void m3443X2(Pair pair) {
        e51.y(new C2075c(pair));
    }

    /* JADX INFO: renamed from: Y2 */
    public final /* synthetic */ void m3444Y2(Integer num, Integer num2, Boolean bool) {
        if (!bool.booleanValue()) {
            this.f1897f.setText(m3448c3((long) (((this.f1883D - this.f1882C) * this.f1910s) / this.f1880A)));
            return;
        }
        this.f1882C = num.intValue();
        this.f1883D = num2.intValue();
        m3446a3();
    }

    /* JADX INFO: renamed from: Z2 */
    public final /* synthetic */ void m3445Z2() {
        if (NullChecker.b(act()) && !act().isFinishing() && NullChecker.a(this.f1905n)) {
            this.f1905n.resume();
        }
    }

    /* JADX INFO: renamed from: a3 */
    public final void m3446a3() {
        LinearLayoutManager layoutManager = this.f1898g.getLayoutManager();
        int iFindFirstVisibleItemPosition = layoutManager.findFirstVisibleItemPosition();
        View viewFindViewWithTag = this.f1898g.findViewWithTag(Integer.valueOf(iFindFirstVisibleItemPosition));
        int[] iArr = new int[2];
        int iY0 = this.f1882C;
        viewFindViewWithTag.getLocationInWindow(iArr);
        int iY1 = 0;
        if (iFindFirstVisibleItemPosition == 0) {
            if (this.f1882C < xdl0.y0() + iArr[0]) {
                layoutManager.scrollToPositionWithOffset(0, this.f1882C - xdl0.y0());
            } else {
                iY0 = iArr[0] + xdl0.y0();
            }
        }
        this.f1899h.m3596n(this.f1915x + iY0 > xdl0.y0() ? xdl0.y0() : iY0 + this.f1915x);
        if (NullChecker.a(this.f1885F) && this.f1885F.getLayoutParams().width != xdl0.y0() - this.f1883D) {
            this.f1886G.notifyDataSetChanged();
        }
        if (iFindFirstVisibleItemPosition != 0) {
            iY1 = ((this.f1880A * (iFindFirstVisibleItemPosition - 1)) - iArr[0]) + this.f1882C;
        } else if (this.f1882C >= xdl0.y0() + iArr[0]) {
            iY1 = (this.f1882C - xdl0.y0()) - iArr[0];
        }
        float f = this.f1910s;
        float f2 = iY1 * f;
        int i = this.f1880A;
        long j = (long) (f2 / i);
        this.f1906o = j;
        long j2 = ((long) (((this.f1883D - this.f1882C) * f) / i)) + j;
        this.f1907p = j2;
        this.f1897f.setText(m3448c3(j2 - j));
        m3447b3();
    }

    /* JADX INFO: renamed from: b3 */
    public final void m3447b3() {
        VideoCut videoCut = new VideoCut(this.f1902k.a, this.f1906o, this.f1907p);
        this.f1903l = videoCut;
        this.f1902k.g.setVideoCuts(new VideoCut[]{videoCut});
        this.f1905n.c(vwb.f0(new VideoCut[]{this.f1903l}), (List) null, 0L, true);
        this.f1905n.p();
        this.f1899h.setPointIndex(0);
        this.f1899h.f2008s = true;
    }

    /* JADX INFO: renamed from: c3 */
    public String m3448c3(long j) {
        Object objValueOf;
        Object objValueOf2;
        long j2 = j / 1000;
        long j3 = j2 / 60;
        long j4 = j2 % 60;
        StringBuilder sb = new StringBuilder();
        if (j3 >= 10) {
            objValueOf = Long.valueOf(j3);
        } else {
            objValueOf = "0" + j3;
        }
        sb.append(objValueOf);
        sb.append(":");
        if (j4 >= 10) {
            objValueOf2 = Long.valueOf(j4);
        } else {
            objValueOf2 = "0" + j4;
        }
        sb.append(objValueOf2);
        return sb.toString();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM3438H2 = m3438H2(layoutInflater, viewGroup);
        this.f1896e.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC2073a());
        xdl0.M0(this.f1899h, false);
        return viewM3438H2;
    }

    public void initSubscription() {
        super.initSubscription();
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.ug20
            public final void call(Object obj) {
                this.f13829a.m3406R2((c) obj);
            }
        }));
        creates(new e30() { // from class: l.vg20
            public final void call(Object obj) {
                this.f14164a.m3410V2((Bundle) obj);
            }
        }, new d30() { // from class: l.wg20
            public final void call() {
                this.f14537a.m3411W2();
            }
        });
        duringCreated(this.f1881B).subscribe(mkd0.G(new e30() { // from class: l.xg20
            public final void call(Object obj) {
                this.f14892a.m3443X2((Pair) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public void m3449k0() {
    }

    /* JADX INFO: renamed from: n */
    public void m3450n(long j) {
    }

    public String pageId() {
        return "p_camera_album_video_clip";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        this.f1900i = (Video) getIntent().getSerializableExtra(Media.TYPE);
        this.f1901j = getIntent().getStringExtra("extra_from");
        if (this.f1900i == null) {
            finish();
            return;
        }
        int iA = djx.h().a() * MakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO;
        this.f1908q = iA;
        this.f1910s = (iA / 15.0f) * 1.5f;
        v500 v500Var = new v500();
        this.f1902k = v500Var;
        v500Var.a = rhi.u(this.f1900i.url);
        this.f1903l = new VideoCut(this.f1902k.a, 0L, this.f1908q);
        VideoEffects videoEffects = new VideoEffects();
        videoEffects.setVideoCuts(new VideoCut[]{this.f1903l});
        this.f1902k.g = videoEffects;
        if (!vb4.m15410i() || !vb4.m15407f()) {
            finish();
            return;
        }
        p7m p7mVarB = n500.b();
        this.f1905n = p7mVarB;
        p7mVarB.r(this);
        this.f1905n.d(true);
        this.f1905n.e(false);
        this.f1905n.b(this.f1902k);
        setSwipeBackEnable(false);
        float f = this.f1900i.duration;
        int i = this.f1908q;
        this.f1907p = f > ((float) i) ? i : (int) f;
        super.preCreateView(bundle);
    }

    /* JADX INFO: renamed from: z */
    public void m3451z() {
    }
}
