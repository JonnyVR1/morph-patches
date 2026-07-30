package com.p046p1.mobile.putong.feed.newui.mediapicker;

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
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.newui.camera.ReloadSoAct;
import com.p046p1.mobile.putong.feed.newui.mediapicker.NewAlbumSelectFrameAct;
import com.p046p1.mobile.putong.feed.p060ui.PlayerView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;
import p149l.c680;
import p149l.d30;
import p149l.dac0;
import p149l.e1c0;
import p149l.e30;
import p149l.e51;
import p149l.k9j;
import p149l.l680;
import p149l.mkd0;
import p149l.ogw;
import p149l.qib0;
import p149l.r5l0;
import p149l.roj0;
import p149l.s5l0;
import p149l.t100;
import p149l.tg20;
import p149l.xdl0;
import p149l.z3g0;

/* JADX INFO: loaded from: classes12.dex */
public class NewAlbumSelectFrameAct extends ReloadSoAct {

    /* JADX INFO: renamed from: A */
    public VideoDataRetrieverBySoft f40381A;

    /* JADX INFO: renamed from: B */
    public r5l0 f40382B;

    /* JADX INFO: renamed from: C */
    public String f40383C;

    /* JADX INFO: renamed from: D */
    public String f40384D;

    /* JADX INFO: renamed from: E */
    public File f40385E;

    /* JADX INFO: renamed from: c */
    public VLinear f40387c;

    /* JADX INFO: renamed from: d */
    public VNavigationBar f40388d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f40389e;

    /* JADX INFO: renamed from: f */
    public VText f40390f;

    /* JADX INFO: renamed from: g */
    public VRecyclerView f40391g;

    /* JADX INFO: renamed from: h */
    public SelectFrameView f40392h;

    /* JADX INFO: renamed from: i */
    public Video f40393i;

    /* JADX INFO: renamed from: j */
    public l680 f40394j;

    /* JADX INFO: renamed from: k */
    public PlayerView f40395k;

    /* JADX INFO: renamed from: r */
    public int f40402r;

    /* JADX INFO: renamed from: s */
    public int f40403s;

    /* JADX INFO: renamed from: t */
    public int f40404t;

    /* JADX INFO: renamed from: w */
    public int f40407w;

    /* JADX INFO: renamed from: y */
    public VImage f40409y;

    /* JADX INFO: renamed from: z */
    public C11228d f40410z;

    /* JADX INFO: renamed from: l */
    public long f40396l = 0;

    /* JADX INFO: renamed from: m */
    public final int f40397m = t100.m186890d(56.0f);

    /* JADX INFO: renamed from: n */
    public final int f40398n = t100.m186890d(20.0f);

    /* JADX INFO: renamed from: o */
    public final int f40399o = t100.m186890d(4.0f);

    /* JADX INFO: renamed from: p */
    public int f40400p = Color.parseColor("#EEEFF1");

    /* JADX INFO: renamed from: q */
    public int f40401q = Color.parseColor("#F6F7F8");

    /* JADX INFO: renamed from: u */
    public float f40405u = 0.0f;

    /* JADX INFO: renamed from: v */
    public int f40406v = t100.m186890d(32.0f);

    /* JADX INFO: renamed from: x */
    public int f40408x = 0;

    /* JADX INFO: renamed from: F */
    public boolean f40386F = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.NewAlbumSelectFrameAct$a */
    public class RunnableC11225a implements Runnable {
        public RunnableC11225a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NullChecker.m81303a(NewAlbumSelectFrameAct.this.f40381A)) {
                NewAlbumSelectFrameAct.this.f40381A.release();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.NewAlbumSelectFrameAct$b */
    public class C11226b extends c680.C16085c {
        public C11226b() {
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: b */
        public void mo44051b(int i) {
            boolean z = NewAlbumSelectFrameAct.this.f40386F;
            NewAlbumSelectFrameAct newAlbumSelectFrameAct = NewAlbumSelectFrameAct.this;
            if (z) {
                newAlbumSelectFrameAct.f40394j.pause();
            } else {
                newAlbumSelectFrameAct.m62387b3();
            }
            NewAlbumSelectFrameAct.this.f40386F = true;
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: d */
        public void mo44053d() {
            NewAlbumSelectFrameAct.this.f40386F = false;
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        public void onStart() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.NewAlbumSelectFrameAct$c */
    public class C11227c extends e51.AbstractRunnableC16541c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VDraweeView f40413a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Integer f40414b;

        public C11227c(VDraweeView vDraweeView, Integer num) {
            this.f40413a = vDraweeView;
            this.f40414b = num;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m62394a(VDraweeView vDraweeView, Integer num, String str) {
            if (vDraweeView.getTag() != num) {
                return;
            }
            qib0.f154691G.m102363i0(vDraweeView, "file://" + str);
        }

        @Override // java.lang.Runnable
        public void run() {
            final String strM145081M;
            Object tag = this.f40413a.getTag();
            Integer num = this.f40414b;
            if (tag != num) {
                return;
            }
            long jM62378M2 = NewAlbumSelectFrameAct.this.m62378M2(num.intValue());
            File file = new File(NewAlbumSelectFrameAct.this.f40385E, jM62378M2 + ".jpeg");
            if (file.exists()) {
                strM145081M = file.getAbsolutePath();
            } else {
                Bitmap frameAtTime = NewAlbumSelectFrameAct.this.f40381A.getFrameAtTime(jM62378M2);
                strM145081M = NullChecker.m81303a(frameAtTime) ? k9j.m145081M(frameAtTime, file, NewAlbumSelectFrameAct.this.f40382B.f157835f, NewAlbumSelectFrameAct.this.f40397m) : s5l0.m182352d(file.getAbsolutePath(), NewAlbumSelectFrameAct.this.f40393i.url, (int) (jM62378M2 / 1000));
            }
            if (this.f40413a.getTag() != this.f40414b || TextUtils.isEmpty(strM145081M)) {
                return;
            }
            final VDraweeView vDraweeView = this.f40413a;
            final Integer num2 = this.f40414b;
            e51.m114742G(new Runnable() { // from class: l.sg20
                @Override // java.lang.Runnable
                public final void run() {
                    NewAlbumSelectFrameAct.C11227c.m62394a(vDraweeView, num2, strM145081M);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.NewAlbumSelectFrameAct$d */
    public class C11228d extends dac0<String> {

        /* JADX INFO: renamed from: c */
        public final int f40416c = 0;

        /* JADX INFO: renamed from: d */
        public final int f40417d = 1;

        public C11228d() {
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return NewAlbumSelectFrameAct.this.f40403s + 1;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            if (i != 0) {
                return new VDraweeView(NewAlbumSelectFrameAct.this.act);
            }
            NewAlbumSelectFrameAct.this.f40409y = new VImage(NewAlbumSelectFrameAct.this.act);
            NewAlbumSelectFrameAct.this.f40409y.setLayoutParams(new FrameLayout.LayoutParams(NewAlbumSelectFrameAct.this.f40408x, NewAlbumSelectFrameAct.this.f40397m));
            return NewAlbumSelectFrameAct.this.f40409y;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, String str, int i, int i2) {
            FrameLayout.LayoutParams layoutParams;
            if (i == 0) {
                NewAlbumSelectFrameAct.this.f40409y.setTag(Integer.valueOf(i2));
                return;
            }
            VDraweeView vDraweeView = (VDraweeView) view;
            int i3 = i2 % 2;
            NewAlbumSelectFrameAct newAlbumSelectFrameAct = NewAlbumSelectFrameAct.this;
            vDraweeView.setBackgroundColor(i3 == 0 ? newAlbumSelectFrameAct.f40400p : newAlbumSelectFrameAct.f40401q);
            if (i2 == getPageCount() - 1) {
                vDraweeView.getHierarchy().m112053H(new RoundingParams().m8264r(0.0f, NewAlbumSelectFrameAct.this.f40399o, NewAlbumSelectFrameAct.this.f40399o, 0.0f));
                layoutParams = new FrameLayout.LayoutParams(NewAlbumSelectFrameAct.this.f40404t - (NewAlbumSelectFrameAct.this.f40406v * (getPageCount() - 2)), NewAlbumSelectFrameAct.this.f40397m);
            } else if (i2 == 1) {
                vDraweeView.getHierarchy().m112053H(new RoundingParams().m8264r(NewAlbumSelectFrameAct.this.f40399o, 0.0f, 0.0f, NewAlbumSelectFrameAct.this.f40399o));
                layoutParams = new FrameLayout.LayoutParams(NewAlbumSelectFrameAct.this.f40406v, NewAlbumSelectFrameAct.this.f40397m);
            } else {
                layoutParams = new FrameLayout.LayoutParams(NewAlbumSelectFrameAct.this.f40406v, NewAlbumSelectFrameAct.this.f40397m);
            }
            vDraweeView.setLayoutParams(layoutParams);
            vDraweeView.setTag(Integer.valueOf(i2));
            NewAlbumSelectFrameAct.this.m62391f3(Integer.valueOf(i2), vDraweeView);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public String getItem(int i) {
            return "";
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return i == 0 ? 0 : 1;
        }
    }

    /* JADX INFO: renamed from: K2 */
    public static Intent m62344K2(Context context, Media media) {
        Intent intent = new Intent(context, (Class<?>) NewAlbumSelectFrameAct.class);
        intent.putExtra("media", media);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W2 */
    public /* synthetic */ void m62346W2(Throwable th) {
        this.act.progressDismiss();
        m47815F2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X2 */
    public /* synthetic */ void m62348X2(Bundle bundle) {
        m62379N2();
        FeedModule.f38855d.m209346Pb().mo193136h(this, toolbar());
        xdl0.m208345M0(this.f40392h, false);
        C22306c.create(new C22306c.a() { // from class: l.lg20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f127946a.m62384U2((z3g0) obj);
            }
        }).compose(mkd0.m154951C()).subscribe(mkd0.m154956H(new e30() { // from class: l.mg20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133638a.m62385V2(obj);
            }
        }, new e30() { // from class: l.ng20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138834a.m62346W2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y2 */
    public /* synthetic */ void m62350Y2() {
        if (NullChecker.m81303a(this.f40394j)) {
            this.f40394j.release();
        }
        e51.m114774y(new RunnableC11225a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a3 */
    public /* synthetic */ void m62353a3(C4319c c4319c) {
        if (c4319c == C4319c.f15548i && NullChecker.m81303a(this.f40395k)) {
            if (this.f40386F) {
                m62387b3();
            } else {
                this.f40395k.m66573N();
                this.f40392h.m62558h(this.f40407w);
            }
        }
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: r */
    private void m62368r() {
        xdl0.m208345M0(this.f40392h, true);
        Video video = this.f40393i;
        this.f40405u = video.duration;
        video.size = new Dimension();
        this.f40390f.setText(m62393h3(this.f40396l));
        r5l0 r5l0Var = this.f40382B;
        int i = r5l0Var.f157835f;
        if (i == 90 || i == 270) {
            Dimension dimension = this.f40393i.size;
            dimension.width = r5l0Var.f157833d;
            dimension.height = r5l0Var.f157832c;
        } else {
            Dimension dimension2 = this.f40393i.size;
            dimension2.width = r5l0Var.f157832c;
            dimension2.height = r5l0Var.f157833d;
        }
        int iM208412y0 = xdl0.m208412y0() - (this.f40398n * 2);
        this.f40402r = iM208412y0;
        this.f40404t = iM208412y0;
        this.f40403s = (int) Math.ceil(iM208412y0 / this.f40406v);
        int iM208412y1 = this.f40404t > xdl0.m208412y0() ? xdl0.m208412y0() : this.f40404t;
        this.f40404t = iM208412y1;
        int i2 = this.f40398n;
        this.f40407w = i2;
        this.f40408x = i2;
        this.f40392h.m62556f(i2, iM208412y1, this.f40402r, new e30() { // from class: l.og20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f143799a.m62390e3((Integer) obj);
            }
        });
        this.f40410z = new C11228d();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.act);
        linearLayoutManager.setOrientation(0);
        this.f40395k = m62380Q2(this.f40389e);
        this.f40391g.setLayoutManager(linearLayoutManager);
        this.f40391g.setAdapter(this.f40410z);
    }

    /* JADX INFO: renamed from: I2 */
    public View m62376I2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tg20.m188800b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: L2 */
    public final void m62377L2() {
        act().progress(act().getString(R$string.f38984U2));
        C22306c.fromCallable(new Callable() { // from class: l.qg20
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f154306a.m62381R2();
            }
        }).compose(mkd0.m154951C()).subscribe(mkd0.m154956H(new e30() { // from class: l.rg20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159223a.m62382S2((String) obj);
            }
        }, new e30() { // from class: l.fg20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f97328a.m62383T2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M2 */
    public final long m62378M2(int i) {
        return ((long) (((i - 1.0f) / this.f40403s) * this.f40382B.f157831b)) * 1000;
    }

    /* JADX INFO: renamed from: N2 */
    public final void m62379N2() {
        this.f40388d.setTitle(R$string.f38887E1);
        this.f40388d.setLeftIconAsBack(this.act);
        TextView textView = new TextView(this.act);
        textView.setText(actionItemPadding(string(R$string.f39073i)));
        textView.setTextColor(getResources().getColor(e1c0.f88798n));
        textView.setTextSize(18.0f);
        this.f40388d.m223589z(textView);
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.pg20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f148608a.m62386Z2(view);
            }
        });
    }

    /* JADX INFO: renamed from: Q2 */
    public final PlayerView m62380Q2(ViewGroup viewGroup) {
        l680 l680Var = new l680();
        this.f40394j = l680Var;
        l680Var.m148711u(new d30() { // from class: l.gg20
            @Override // p149l.d30
            public final void call() {
                this.f102447a.m62387b3();
            }
        });
        this.f40394j.m148712v(new MediaPlayer.OnSeekCompleteListener() { // from class: l.hg20
            @Override // android.media.MediaPlayer.OnSeekCompleteListener
            public final void onSeekComplete(MediaPlayer mediaPlayer) {
                this.f107557a.m62388c3(mediaPlayer);
            }
        });
        final PlayerView playerView = new PlayerView(this.act);
        playerView.setProgressBarsEnabled(false);
        playerView.setBackgroundColor(getResources().getColor(e1c0.f88803p0));
        playerView.setPlayer(this.f40394j);
        viewGroup.addView(playerView);
        playerView.setVideo(this.f40393i);
        xdl0.m208345M0(playerView.f43602h, false);
        xdl0.m208345M0(playerView.f43596b, false);
        playerView.f43596b.setAlpha(0.0f);
        playerView.f43602h.setAlpha(0.0f);
        playerView.m66579x(new C11226b());
        playerView.post(new Runnable() { // from class: l.ig20
            @Override // java.lang.Runnable
            public final void run() {
                this.f113066a.m62389d3(playerView);
            }
        });
        xdl0.m208411y(playerView, false);
        xdl0.m208411y(playerView.f43602h, false);
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
    public final /* synthetic */ String m62381R2() throws Exception {
        String absolutePath;
        FileOutputStream fileOutputStream;
        OutOfMemoryError e;
        IOException e2;
        FileOutputStream fileOutputStream2;
        File file = new File(this.f40383C);
        ?? r2 = 30;
        if (Build.VERSION.SDK_INT >= 30) {
            File fileM174833t0 = qib0.m174833t0();
            String str = System.currentTimeMillis() + ".jpg";
            absolutePath = new File(fileM174833t0, str).getAbsolutePath();
            r2 = str;
        } else {
            absolutePath = file.getParentFile().getAbsolutePath() + File.separator + System.currentTimeMillis() + ".jpg";
        }
        Bitmap bitmap = this.f40395k.f43595a.getBitmap();
        ?? r1 = 0;
        try {
            try {
                fileOutputStream = new FileOutputStream(new File(absolutePath));
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 95, fileOutputStream);
                    fileOutputStream.flush();
                    fileOutputStream.getFD().sync();
                    boolean zM81303a = NullChecker.m81303a(fileOutputStream);
                    r2 = fileOutputStream;
                    fileOutputStream2 = fileOutputStream;
                    if (zM81303a) {
                        try {
                            fileOutputStream2.close();
                            r2 = fileOutputStream2;
                        } catch (IOException e3) {
                            CrashHelper.m81296c(e3);
                            r2 = fileOutputStream2;
                        }
                    }
                } catch (IOException e4) {
                    e2 = e4;
                    CrashHelper.m81296c(e2);
                    boolean zM81303a2 = NullChecker.m81303a(fileOutputStream);
                    r2 = fileOutputStream;
                    fileOutputStream2 = fileOutputStream;
                    if (zM81303a2) {
                        fileOutputStream2.close();
                        r2 = fileOutputStream2;
                    }
                } catch (OutOfMemoryError e5) {
                    e = e5;
                    CrashHelper.m81296c(e);
                    boolean zM81303a3 = NullChecker.m81303a(fileOutputStream);
                    r2 = fileOutputStream;
                    fileOutputStream2 = fileOutputStream;
                    if (zM81303a3) {
                        fileOutputStream2.close();
                        r2 = fileOutputStream2;
                    }
                }
            } catch (Throwable th) {
                th = th;
                r1 = r2;
                if (NullChecker.m81303a(r1)) {
                    try {
                        r1.close();
                    } catch (IOException e6) {
                        CrashHelper.m81296c(e6);
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
            if (NullChecker.m81303a(r1)) {
                r1.close();
            }
            bitmap.recycle();
            throw th;
        }
        bitmap.recycle();
        return absolutePath;
    }

    /* JADX INFO: renamed from: S2 */
    public final /* synthetic */ void m62382S2(String str) {
        this.act.progressDismiss();
        Intent intent = new Intent();
        intent.putExtra("framePath", str);
        setResult(-1, intent);
        m47815F2();
    }

    /* JADX INFO: renamed from: T2 */
    public final /* synthetic */ void m62383T2(Throwable th) {
        this.act.progressDismiss();
        m47815F2();
    }

    /* JADX INFO: renamed from: U2 */
    public final /* synthetic */ void m62384U2(z3g0 z3g0Var) {
        Video video = this.f40393i;
        String str = video.url;
        this.f40383C = str;
        video.url = str;
        this.f40382B = new r5l0(str);
        String strM164281b = ogw.m164281b(this.f40393i.url + this.f40393i.duration);
        this.f40384D = strM164281b;
        this.f40385E = k9j.m145080L(strM164281b);
        VideoDataRetrieverBySoft videoDataRetrieverBySoft = new VideoDataRetrieverBySoft();
        this.f40381A = videoDataRetrieverBySoft;
        videoDataRetrieverBySoft.init(str);
        z3g0Var.onNext(roj0.f160388a);
    }

    /* JADX INFO: renamed from: V2 */
    public final /* synthetic */ void m62385V2(Object obj) {
        m62368r();
        this.act.progressDismiss();
    }

    /* JADX INFO: renamed from: Z2 */
    public final /* synthetic */ void m62386Z2(View view) {
        if (this.f40386F) {
            view.setEnabled(false);
            m62377L2();
        }
    }

    /* JADX INFO: renamed from: c3 */
    public final /* synthetic */ void m62388c3(MediaPlayer mediaPlayer) {
        this.f40405u = mediaPlayer.getDuration();
        this.f40395k.f43596b.setAlpha(0);
        this.f40395k.f43602h.setAlpha(0.0f);
    }

    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ void m62389d3(PlayerView playerView) {
        if (lifecycle_() == C4319c.f15548i) {
            playerView.m66573N();
        }
    }

    /* JADX INFO: renamed from: e3 */
    public final /* synthetic */ void m62390e3(Integer num) {
        long jIntValue = (long) ((num.intValue() / this.f40404t) * this.f40382B.f157831b);
        this.f40396l = jIntValue;
        this.f40390f.setText(m62393h3(jIntValue));
        long j = this.f40396l;
        float f = j;
        float f2 = this.f40405u;
        if (f >= f2) {
            j = (long) (f2 - 1.0f);
        }
        this.f40396l = j;
        m62387b3();
    }

    /* JADX INFO: renamed from: f3 */
    public void m62391f3(Integer num, VDraweeView vDraweeView) {
        e51.m114774y(new C11227c(vDraweeView, num));
    }

    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void m62387b3() {
        this.f40394j.m148710t((int) this.f40396l);
    }

    /* JADX INFO: renamed from: h3 */
    public String m62393h3(long j) {
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

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m62376I2(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.mIfInNewUi1ShouldUseThemNewUI2 = FeedModule.f38855d.m209346Pb().mo193137i();
        creates(new e30() { // from class: l.eg20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f90882a.m62348X2((Bundle) obj);
            }
        }, new d30() { // from class: l.jg20
            @Override // p149l.d30
            public final void call() {
                this.f117706a.m62350Y2();
            }
        });
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.kg20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122993a.m62353a3((C4319c) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        Video video = (Video) getIntent().getSerializableExtra("media");
        this.f40393i = video;
        if (video == null) {
            m47815F2();
        }
        setSwipeBackEnable(false);
        super.preCreateView(bundle);
    }
}
