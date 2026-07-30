package com.p000p1.mobile.putong.feed.newui.mediapicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.drawee.generic.RoundingParams;
import com.immomo.moment.mediautils.VideoDataRetrieverBySoft;
import com.p000p1.mobile.putong.data.Dimension;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.newui.camera.ReloadSoAct;
import com.p000p1.mobile.putong.feed.newui.mediapicker.NewAlbumSelectFrameAct;
import com.p000p1.mobile.putong.feed.p005ui.PlayerView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;
import l.c680;
import l.d30;
import l.dac0;
import l.e30;
import l.e51;
import l.k9j;
import l.l680;
import l.mkd0;
import l.ogw;
import l.qib0;
import l.r5l0;
import l.roj0;
import l.s5l0;
import l.t100;
import l.xdl0;
import l.z3g0;
import p007l.e1c0;
import p007l.tg20;
import rx.c;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VRecyclerView;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class NewAlbumSelectFrameAct extends ReloadSoAct {

    /* JADX INFO: renamed from: A */
    public VideoDataRetrieverBySoft f1842A;

    /* JADX INFO: renamed from: B */
    public r5l0 f1843B;

    /* JADX INFO: renamed from: C */
    public String f1844C;

    /* JADX INFO: renamed from: D */
    public String f1845D;

    /* JADX INFO: renamed from: E */
    public File f1846E;

    /* JADX INFO: renamed from: c */
    public VLinear f1848c;

    /* JADX INFO: renamed from: d */
    public VNavigationBar f1849d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f1850e;

    /* JADX INFO: renamed from: f */
    public VText f1851f;

    /* JADX INFO: renamed from: g */
    public VRecyclerView f1852g;

    /* JADX INFO: renamed from: h */
    public SelectFrameView f1853h;

    /* JADX INFO: renamed from: i */
    public Video f1854i;

    /* JADX INFO: renamed from: j */
    public l680 f1855j;

    /* JADX INFO: renamed from: k */
    public PlayerView f1856k;

    /* JADX INFO: renamed from: r */
    public int f1863r;

    /* JADX INFO: renamed from: s */
    public int f1864s;

    /* JADX INFO: renamed from: t */
    public int f1865t;

    /* JADX INFO: renamed from: w */
    public int f1868w;

    /* JADX INFO: renamed from: y */
    public VImage f1870y;

    /* JADX INFO: renamed from: z */
    public C2072d f1871z;

    /* JADX INFO: renamed from: l */
    public long f1857l = 0;

    /* JADX INFO: renamed from: m */
    public final int f1858m = t100.d(56.0f);

    /* JADX INFO: renamed from: n */
    public final int f1859n = t100.d(20.0f);

    /* JADX INFO: renamed from: o */
    public final int f1860o = t100.d(4.0f);

    /* JADX INFO: renamed from: p */
    public int f1861p = Color.parseColor("#EEEFF1");

    /* JADX INFO: renamed from: q */
    public int f1862q = Color.parseColor("#F6F7F8");

    /* JADX INFO: renamed from: u */
    public float f1866u = 0.0f;

    /* JADX INFO: renamed from: v */
    public int f1867v = t100.d(32.0f);

    /* JADX INFO: renamed from: x */
    public int f1869x = 0;

    /* JADX INFO: renamed from: F */
    public boolean f1847F = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.NewAlbumSelectFrameAct$a */
    public class RunnableC2069a implements Runnable {
        public RunnableC2069a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NullChecker.a(NewAlbumSelectFrameAct.this.f1842A)) {
                NewAlbumSelectFrameAct.this.f1842A.release();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.NewAlbumSelectFrameAct$b */
    public class C2070b extends c680.c {
        public C2070b() {
        }

        /* JADX INFO: renamed from: b */
        public void m3388b(int i) {
            boolean z = NewAlbumSelectFrameAct.this.f1847F;
            NewAlbumSelectFrameAct newAlbumSelectFrameAct = NewAlbumSelectFrameAct.this;
            if (z) {
                newAlbumSelectFrameAct.f1855j.pause();
            } else {
                newAlbumSelectFrameAct.m3381b3();
            }
            NewAlbumSelectFrameAct.this.f1847F = true;
        }

        /* JADX INFO: renamed from: d */
        public void m3389d() {
            NewAlbumSelectFrameAct.this.f1847F = false;
        }

        public void onStart() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.NewAlbumSelectFrameAct$c */
    public class C2071c extends e51.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VDraweeView f1874a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Integer f1875b;

        public C2071c(VDraweeView vDraweeView, Integer num) {
            this.f1874a = vDraweeView;
            this.f1875b = num;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m3390a(VDraweeView vDraweeView, Integer num, String str) {
            if (vDraweeView.getTag() != num) {
                return;
            }
            qib0.G.i0(vDraweeView, "file://" + str);
        }

        public void run() {
            final String strM;
            Object tag = this.f1874a.getTag();
            Integer num = this.f1875b;
            if (tag != num) {
                return;
            }
            long jM3372M2 = NewAlbumSelectFrameAct.this.m3372M2(num.intValue());
            File file = new File(NewAlbumSelectFrameAct.this.f1846E, jM3372M2 + ".jpeg");
            if (file.exists()) {
                strM = file.getAbsolutePath();
            } else {
                Bitmap frameAtTime = NewAlbumSelectFrameAct.this.f1842A.getFrameAtTime(jM3372M2);
                strM = NullChecker.a(frameAtTime) ? k9j.M(frameAtTime, file, NewAlbumSelectFrameAct.this.f1843B.f, NewAlbumSelectFrameAct.this.f1858m) : s5l0.d(file.getAbsolutePath(), NewAlbumSelectFrameAct.this.f1854i.url, (int) (jM3372M2 / 1000));
            }
            if (this.f1874a.getTag() != this.f1875b || TextUtils.isEmpty(strM)) {
                return;
            }
            final VDraweeView vDraweeView = this.f1874a;
            final Integer num2 = this.f1875b;
            e51.G(new Runnable() { // from class: l.sg20
                @Override // java.lang.Runnable
                public final void run() {
                    NewAlbumSelectFrameAct.C2071c.m3390a(vDraweeView, num2, strM);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.NewAlbumSelectFrameAct$d */
    public class C2072d extends dac0<String> {

        /* JADX INFO: renamed from: c */
        public final int f1877c = 0;

        /* JADX INFO: renamed from: d */
        public final int f1878d = 1;

        public C2072d() {
        }

        /* JADX INFO: renamed from: C */
        public int m3392C() {
            return NewAlbumSelectFrameAct.this.f1864s + 1;
        }

        /* JADX INFO: renamed from: D */
        public View m3393D(ViewGroup viewGroup, int i) {
            if (i != 0) {
                return new VDraweeView(((Act) NewAlbumSelectFrameAct.this).act);
            }
            NewAlbumSelectFrameAct.this.f1870y = new VImage(((Act) NewAlbumSelectFrameAct.this).act);
            NewAlbumSelectFrameAct.this.f1870y.setLayoutParams(new FrameLayout.LayoutParams(NewAlbumSelectFrameAct.this.f1869x, NewAlbumSelectFrameAct.this.f1858m));
            return NewAlbumSelectFrameAct.this.f1870y;
        }

        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void m3391A(View view, String str, int i, int i2) {
            FrameLayout.LayoutParams layoutParams;
            if (i == 0) {
                NewAlbumSelectFrameAct.this.f1870y.setTag(Integer.valueOf(i2));
                return;
            }
            VDraweeView vDraweeView = (VDraweeView) view;
            int i3 = i2 % 2;
            NewAlbumSelectFrameAct newAlbumSelectFrameAct = NewAlbumSelectFrameAct.this;
            vDraweeView.setBackgroundColor(i3 == 0 ? newAlbumSelectFrameAct.f1861p : newAlbumSelectFrameAct.f1862q);
            if (i2 == m3392C() - 1) {
                vDraweeView.getHierarchy().H(new RoundingParams().r(0.0f, NewAlbumSelectFrameAct.this.f1860o, NewAlbumSelectFrameAct.this.f1860o, 0.0f));
                layoutParams = new FrameLayout.LayoutParams(NewAlbumSelectFrameAct.this.f1865t - (NewAlbumSelectFrameAct.this.f1867v * (m3392C() - 2)), NewAlbumSelectFrameAct.this.f1858m);
            } else if (i2 == 1) {
                vDraweeView.getHierarchy().H(new RoundingParams().r(NewAlbumSelectFrameAct.this.f1860o, 0.0f, 0.0f, NewAlbumSelectFrameAct.this.f1860o));
                layoutParams = new FrameLayout.LayoutParams(NewAlbumSelectFrameAct.this.f1867v, NewAlbumSelectFrameAct.this.f1858m);
            } else {
                layoutParams = new FrameLayout.LayoutParams(NewAlbumSelectFrameAct.this.f1867v, NewAlbumSelectFrameAct.this.f1858m);
            }
            vDraweeView.setLayoutParams(layoutParams);
            vDraweeView.setTag(Integer.valueOf(i2));
            NewAlbumSelectFrameAct.this.m3385f3(Integer.valueOf(i2), vDraweeView);
        }

        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public String getItem(int i) {
            return "";
        }

        public int getItemViewType(int i) {
            return i == 0 ? 0 : 1;
        }
    }

    /* JADX INFO: renamed from: K2 */
    public static Intent m3338K2(Context context, Media media) {
        Intent intent = new Intent(context, (Class<?>) NewAlbumSelectFrameAct.class);
        intent.putExtra(Media.TYPE, media);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W2 */
    public /* synthetic */ void m3340W2(Throwable th) {
        ((Act) this).act.progressDismiss();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X2 */
    public /* synthetic */ void m3342X2(Bundle bundle) {
        m3373N2();
        FeedModule.f316d.m16527Pb().mo15081h(this, toolbar());
        xdl0.M0(this.f1853h, false);
        c.create(new c.a() { // from class: l.lg20
            public final void call(Object obj) {
                this.f10026a.m3378U2((z3g0) obj);
            }
        }).compose(mkd0.C()).subscribe(mkd0.H(new e30() { // from class: l.mg20
            public final void call(Object obj) {
                this.f10459a.m3379V2(obj);
            }
        }, new e30() { // from class: l.ng20
            public final void call(Object obj) {
                this.f10798a.m3340W2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y2 */
    public /* synthetic */ void m3344Y2() {
        if (NullChecker.a(this.f1855j)) {
            this.f1855j.release();
        }
        e51.y(new RunnableC2069a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a3 */
    public /* synthetic */ void m3347a3(com.p1.mobile.android.app.c cVar) {
        if (cVar == com.p1.mobile.android.app.c.i && NullChecker.a(this.f1856k)) {
            if (this.f1847F) {
                m3381b3();
            } else {
                this.f1856k.m7757N();
                this.f1853h.m3563h(this.f1868w);
            }
        }
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: r */
    private void m3362r() {
        xdl0.M0(this.f1853h, true);
        Video video = this.f1854i;
        this.f1866u = video.duration;
        video.size = new Dimension();
        this.f1851f.setText(m3387h3(this.f1857l));
        r5l0 r5l0Var = this.f1843B;
        int i = r5l0Var.f;
        if (i == 90 || i == 270) {
            Dimension dimension = this.f1854i.size;
            dimension.width = r5l0Var.d;
            dimension.height = r5l0Var.c;
        } else {
            Dimension dimension2 = this.f1854i.size;
            dimension2.width = r5l0Var.c;
            dimension2.height = r5l0Var.d;
        }
        int iY0 = xdl0.y0() - (this.f1859n * 2);
        this.f1863r = iY0;
        this.f1865t = iY0;
        this.f1864s = (int) Math.ceil(iY0 / this.f1867v);
        int iY1 = this.f1865t > xdl0.y0() ? xdl0.y0() : this.f1865t;
        this.f1865t = iY1;
        int i2 = this.f1859n;
        this.f1868w = i2;
        this.f1869x = i2;
        this.f1853h.m3561f(i2, iY1, this.f1863r, new e30() { // from class: l.og20
            public final void call(Object obj) {
                this.f11467a.m3384e3((Integer) obj);
            }
        });
        this.f1871z = new C2072d();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(((Act) this).act);
        linearLayoutManager.setOrientation(0);
        this.f1856k = m3374Q2(this.f1850e);
        this.f1852g.setLayoutManager(linearLayoutManager);
        this.f1852g.setAdapter(this.f1871z);
    }

    /* JADX INFO: renamed from: I2 */
    public View m3370I2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tg20.m14533b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: L2 */
    public final void m3371L2() {
        act().progress(act().getString(R$string.f445U2));
        c.fromCallable(new Callable() { // from class: l.qg20
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f12231a.m3375R2();
            }
        }).compose(mkd0.C()).subscribe(mkd0.H(new e30() { // from class: l.rg20
            public final void call(Object obj) {
                this.f12643a.m3376S2((String) obj);
            }
        }, new e30() { // from class: l.fg20
            public final void call(Object obj) {
                this.f8089a.m3377T2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M2 */
    public final long m3372M2(int i) {
        return ((long) (((i - 1.0f) / this.f1864s) * this.f1843B.b)) * 1000;
    }

    /* JADX INFO: renamed from: N2 */
    public final void m3373N2() {
        this.f1849d.setTitle(R$string.f348E1);
        this.f1849d.setLeftIconAsBack(((Act) this).act);
        TextView textView = new TextView(((Act) this).act);
        textView.setText(actionItemPadding(string(R$string.f534i)));
        textView.setTextColor(getResources().getColor(e1c0.f7154n));
        textView.setTextSize(18.0f);
        this.f1849d.z(new View[]{textView});
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.pg20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11831a.m3380Z2(view);
            }
        });
    }

    /* JADX INFO: renamed from: Q2 */
    public final PlayerView m3374Q2(ViewGroup viewGroup) {
        l680 l680Var = new l680();
        this.f1855j = l680Var;
        l680Var.u(new d30() { // from class: l.gg20
            public final void call() {
                this.f8442a.m3381b3();
            }
        });
        this.f1855j.v(new MediaPlayer.OnSeekCompleteListener() { // from class: l.hg20
            @Override // android.media.MediaPlayer.OnSeekCompleteListener
            public final void onSeekComplete(MediaPlayer mediaPlayer) {
                this.f8710a.m3382c3(mediaPlayer);
            }
        });
        final PlayerView playerView = new PlayerView(((Act) this).act);
        playerView.setProgressBarsEnabled(false);
        playerView.setBackgroundColor(getResources().getColor(e1c0.f7159p0));
        playerView.setPlayer(this.f1855j);
        viewGroup.addView(playerView);
        playerView.setVideo(this.f1854i);
        xdl0.M0(playerView.f5063h, false);
        xdl0.M0(playerView.f5057b, false);
        playerView.f5057b.setAlpha(0.0f);
        playerView.f5063h.setAlpha(0.0f);
        playerView.m7763x(new C2070b());
        playerView.post(new Runnable() { // from class: l.ig20
            @Override // java.lang.Runnable
            public final void run() {
                this.f9011a.m3383d3(playerView);
            }
        });
        xdl0.y(playerView, false);
        xdl0.y(playerView.f5063h, false);
        return playerView;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x007d A[EXC_TOP_SPLITTER, PHI: r2
      0x007d: PHI (r2v10 java.io.FileOutputStream) = (r2v21 java.io.FileOutputStream), (r2v22 java.io.FileOutputStream), (r2v23 java.io.FileOutputStream) binds: [B:30:0x00a3, B:34:0x00ad, B:10:0x007b] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.FileOutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX INFO: renamed from: R2 */
    public final /* synthetic */ String m3375R2() throws Exception {
        String absolutePath;
        FileOutputStream fileOutputStream;
        OutOfMemoryError e;
        IOException e2;
        FileOutputStream fileOutputStream2;
        File file = new File(this.f1844C);
        ?? r2 = 30;
        if (Build.VERSION.SDK_INT >= 30) {
            File fileT0 = qib0.t0();
            String str = System.currentTimeMillis() + ".jpg";
            absolutePath = new File(fileT0, str).getAbsolutePath();
            r2 = str;
        } else {
            absolutePath = file.getParentFile().getAbsolutePath() + File.separator + System.currentTimeMillis() + ".jpg";
        }
        Bitmap bitmap = this.f1856k.f5056a.getBitmap();
        ?? r1 = 0;
        try {
            try {
                fileOutputStream = new FileOutputStream(new File(absolutePath));
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 95, fileOutputStream);
                    fileOutputStream.flush();
                    fileOutputStream.getFD().sync();
                    boolean zA = NullChecker.a(fileOutputStream);
                    r2 = fileOutputStream;
                    fileOutputStream2 = fileOutputStream;
                    if (zA) {
                        try {
                            fileOutputStream2.close();
                            r2 = fileOutputStream2;
                        } catch (IOException e3) {
                            CrashHelper.c(e3);
                            r2 = fileOutputStream2;
                        }
                    }
                } catch (IOException e4) {
                    e2 = e4;
                    CrashHelper.c(e2);
                    boolean zA2 = NullChecker.a(fileOutputStream);
                    r2 = fileOutputStream;
                    fileOutputStream2 = fileOutputStream;
                    if (zA2) {
                        fileOutputStream2.close();
                        r2 = fileOutputStream2;
                    }
                } catch (OutOfMemoryError e5) {
                    e = e5;
                    CrashHelper.c(e);
                    boolean zA3 = NullChecker.a(fileOutputStream);
                    r2 = fileOutputStream;
                    fileOutputStream2 = fileOutputStream;
                    if (zA3) {
                        fileOutputStream2.close();
                        r2 = fileOutputStream2;
                    }
                }
            } catch (Throwable th) {
                th = th;
                r1 = r2;
                if (NullChecker.a((Object) r1)) {
                    try {
                        r1.close();
                    } catch (IOException e6) {
                        CrashHelper.c(e6);
                    }
                }
                bitmap.recycle();
                throw th;
            }
        } catch (IOException e7) {
            fileOutputStream = null;
            e2 = e7;
        } catch (OutOfMemoryError e8) {
            fileOutputStream = null;
            e = e8;
        } catch (Throwable th2) {
            th = th2;
            if (NullChecker.a((Object) r1)) {
                r1.close();
            }
            bitmap.recycle();
            throw th;
        }
        bitmap.recycle();
        return absolutePath;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S2 */
    public final /* synthetic */ void m3376S2(String str) {
        ((Act) this).act.progressDismiss();
        Intent intent = new Intent();
        intent.putExtra("framePath", str);
        setResult(-1, intent);
        finish();
    }

    /* JADX INFO: renamed from: T2 */
    public final /* synthetic */ void m3377T2(Throwable th) {
        ((Act) this).act.progressDismiss();
        finish();
    }

    /* JADX INFO: renamed from: U2 */
    public final /* synthetic */ void m3378U2(z3g0 z3g0Var) {
        Video video = this.f1854i;
        String str = video.url;
        this.f1844C = str;
        video.url = str;
        this.f1843B = new r5l0(str);
        String strB = ogw.b(this.f1854i.url + this.f1854i.duration);
        this.f1845D = strB;
        this.f1846E = k9j.L(strB);
        VideoDataRetrieverBySoft videoDataRetrieverBySoft = new VideoDataRetrieverBySoft();
        this.f1842A = videoDataRetrieverBySoft;
        videoDataRetrieverBySoft.init(str);
        z3g0Var.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: V2 */
    public final /* synthetic */ void m3379V2(Object obj) {
        m3362r();
        ((Act) this).act.progressDismiss();
    }

    /* JADX INFO: renamed from: Z2 */
    public final /* synthetic */ void m3380Z2(View view) {
        if (this.f1847F) {
            view.setEnabled(false);
            m3371L2();
        }
    }

    /* JADX INFO: renamed from: c3 */
    public final /* synthetic */ void m3382c3(MediaPlayer mediaPlayer) {
        this.f1866u = mediaPlayer.getDuration();
        this.f1856k.f5057b.setAlpha(0);
        this.f1856k.f5063h.setAlpha(0.0f);
    }

    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ void m3383d3(PlayerView playerView) {
        if (lifecycle_() == com.p1.mobile.android.app.c.i) {
            playerView.m7757N();
        }
    }

    /* JADX INFO: renamed from: e3 */
    public final /* synthetic */ void m3384e3(Integer num) {
        long jIntValue = (long) ((num.intValue() / this.f1865t) * this.f1843B.b);
        this.f1857l = jIntValue;
        this.f1851f.setText(m3387h3(jIntValue));
        long j = this.f1857l;
        float f = j;
        float f2 = this.f1866u;
        if (f >= f2) {
            j = (long) (f2 - 1.0f);
        }
        this.f1857l = j;
        m3381b3();
    }

    /* JADX INFO: renamed from: f3 */
    public void m3385f3(Integer num, VDraweeView vDraweeView) {
        e51.y(new C2071c(vDraweeView, num));
    }

    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void m3381b3() {
        this.f1855j.t((int) this.f1857l);
    }

    /* JADX INFO: renamed from: h3 */
    public String m3387h3(long j) {
        Object objValueOf;
        long j2 = ((j / 1000) + ((long) (j % 1000 > 500 ? 1 : 0))) % 60;
        StringBuilder sb = new StringBuilder("00:");
        if (j2 >= 10) {
            objValueOf = Long.valueOf(j2);
        } else {
            objValueOf = "0" + j2;
        }
        sb.append(objValueOf);
        return sb.toString();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m3370I2(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        ((PutongAct) this).mIfInNewUi1ShouldUseThemNewUI2 = FeedModule.f316d.m16527Pb().mo15082i();
        creates(new e30() { // from class: l.eg20
            public final void call(Object obj) {
                this.f7349a.m3342X2((Bundle) obj);
            }
        }, new d30() { // from class: l.jg20
            public final void call() {
                this.f9343a.m3344Y2();
            }
        });
    }

    public void initSubscription() {
        super.initSubscription();
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.kg20
            public final void call(Object obj) {
                this.f9709a.m3347a3((com.p1.mobile.android.app.c) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        Video video = (Video) getIntent().getSerializableExtra(Media.TYPE);
        this.f1854i = video;
        if (video == null) {
            finish();
        }
        setSwipeBackEnable(false);
        super.preCreateView(bundle);
    }
}
