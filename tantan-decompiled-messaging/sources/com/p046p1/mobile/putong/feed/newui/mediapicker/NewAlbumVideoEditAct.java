package com.p046p1.mobile.putong.feed.newui.mediapicker;

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
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.newui.camera.ReloadSoAct;
import com.p046p1.mobile.putong.feed.newui.camera.VideoEditAct;
import com.p046p1.mobile.putong.feed.newui.mediapicker.NewAlbumVideoEditAct;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.could.component.common.p079ai.eventreport.entry.NetWorkParam;
import java.io.File;
import java.util.concurrent.Callable;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;
import p149l.d30;
import p149l.dac0;
import p149l.djx;
import p149l.e1c0;
import p149l.e30;
import p149l.e51;
import p149l.ebl0;
import p149l.fh20;
import p149l.g30;
import p149l.jmw;
import p149l.k9j;
import p149l.mkd0;
import p149l.n500;
import p149l.ogw;
import p149l.p7m;
import p149l.qib0;
import p149l.r5l0;
import p149l.rhi;
import p149l.roj0;
import p149l.s5l0;
import p149l.t100;
import p149l.v500;
import p149l.vb4;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class NewAlbumVideoEditAct extends ReloadSoAct implements jmw {

    /* JADX INFO: renamed from: C */
    public int f40421C;

    /* JADX INFO: renamed from: D */
    public int f40422D;

    /* JADX INFO: renamed from: E */
    public VImage f40423E;

    /* JADX INFO: renamed from: F */
    public VImage f40424F;

    /* JADX INFO: renamed from: G */
    public C11233e f40425G;

    /* JADX INFO: renamed from: H */
    public VideoDataRetrieverBySoft f40426H;

    /* JADX INFO: renamed from: I */
    public r5l0 f40427I;

    /* JADX INFO: renamed from: J */
    public String f40428J;

    /* JADX INFO: renamed from: K */
    public String f40429K;

    /* JADX INFO: renamed from: L */
    public File f40430L;

    /* JADX INFO: renamed from: M */
    public int[] f40431M;

    /* JADX INFO: renamed from: N */
    public TextView f40432N;

    /* JADX INFO: renamed from: c */
    public VLinear f40433c;

    /* JADX INFO: renamed from: d */
    public VNavigationBar f40434d;

    /* JADX INFO: renamed from: e */
    public TextureView f40435e;

    /* JADX INFO: renamed from: f */
    public VText f40436f;

    /* JADX INFO: renamed from: g */
    public VRecyclerView f40437g;

    /* JADX INFO: renamed from: h */
    public VideoCutDrawView f40438h;

    /* JADX INFO: renamed from: i */
    public Video f40439i;

    /* JADX INFO: renamed from: j */
    public String f40440j;

    /* JADX INFO: renamed from: k */
    public v500 f40441k;

    /* JADX INFO: renamed from: l */
    public VideoCut f40442l;

    /* JADX INFO: renamed from: n */
    public p7m f40444n;

    /* JADX INFO: renamed from: x */
    public int f40454x;

    /* JADX INFO: renamed from: y */
    public int f40455y;

    /* JADX INFO: renamed from: m */
    public boolean f40443m = false;

    /* JADX INFO: renamed from: o */
    public long f40445o = 0;

    /* JADX INFO: renamed from: p */
    public long f40446p = 0;

    /* JADX INFO: renamed from: q */
    public int f40447q = NetWorkParam.DEFAULT_CONNECT_TIME_OUT;

    /* JADX INFO: renamed from: r */
    public int f40448r = 3000;

    /* JADX INFO: renamed from: s */
    public float f40449s = 1500.0f;

    /* JADX INFO: renamed from: t */
    public final int f40450t = t100.m186890d(4.0f);

    /* JADX INFO: renamed from: u */
    public final int f40451u = t100.m186890d(56.0f);

    /* JADX INFO: renamed from: v */
    public int f40452v = Color.parseColor("#EEEFF1");

    /* JADX INFO: renamed from: w */
    public int f40453w = Color.parseColor("#F6F7F8");

    /* JADX INFO: renamed from: z */
    public float f40456z = 0.0f;

    /* JADX INFO: renamed from: A */
    public int f40419A = 0;

    /* JADX INFO: renamed from: B */
    public C22392a<Pair<Integer, VDraweeView>> f40420B = C22392a.m221512b();

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.NewAlbumVideoEditAct$a */
    public class TextureViewSurfaceTextureListenerC11229a implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC11229a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            if (NullChecker.m81303a(NewAlbumVideoEditAct.this.f40431M)) {
                surfaceTexture.setDefaultBufferSize(NewAlbumVideoEditAct.this.f40431M[0], NewAlbumVideoEditAct.this.f40431M[1]);
            }
            if (NullChecker.m81304b(surfaceTexture)) {
                NewAlbumVideoEditAct.this.f40444n.mo129502h(surfaceTexture);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            if (!NullChecker.m81303a(NewAlbumVideoEditAct.this.f40444n)) {
                return false;
            }
            NewAlbumVideoEditAct.this.f40444n.mo129495a();
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            if (NullChecker.m81303a(NewAlbumVideoEditAct.this.f40431M)) {
                surfaceTexture.setDefaultBufferSize(NewAlbumVideoEditAct.this.f40431M[0], NewAlbumVideoEditAct.this.f40431M[1]);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            if (NullChecker.m81303a(NewAlbumVideoEditAct.this.f40431M)) {
                surfaceTexture.setDefaultBufferSize(NewAlbumVideoEditAct.this.f40431M[0], NewAlbumVideoEditAct.this.f40431M[1]);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.NewAlbumVideoEditAct$b */
    public class RunnableC11230b implements Runnable {
        public RunnableC11230b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NullChecker.m81303a(NewAlbumVideoEditAct.this.f40426H)) {
                NewAlbumVideoEditAct.this.f40426H.release();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.NewAlbumVideoEditAct$c */
    public class C11231c extends e51.AbstractRunnableC16541c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Pair f40459a;

        public C11231c(Pair pair) {
            this.f40459a = pair;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m62453a(Pair pair, String str) {
            if (((VDraweeView) pair.second).getTag() != pair.first) {
                return;
            }
            qib0.f154691G.m102363i0((SimpleDraweeView) pair.second, "file://" + str);
        }

        @Override // java.lang.Runnable
        public void run() {
            final String strM145081M;
            Object tag = ((VDraweeView) this.f40459a.second).getTag();
            Object obj = this.f40459a.first;
            if (tag != obj) {
                return;
            }
            long jM62405M2 = NewAlbumVideoEditAct.this.m62405M2(((Integer) obj).intValue());
            File file = new File(NewAlbumVideoEditAct.this.f40430L, jM62405M2 + ".jpeg");
            if (file.exists()) {
                strM145081M = file.getAbsolutePath();
            } else {
                Bitmap frameAtTime = NewAlbumVideoEditAct.this.f40426H.getFrameAtTime(jM62405M2);
                strM145081M = NullChecker.m81303a(frameAtTime) ? k9j.m145081M(frameAtTime, file, NewAlbumVideoEditAct.this.f40427I.f157835f, NewAlbumVideoEditAct.this.f40451u) : s5l0.m182352d(file.getAbsolutePath(), NewAlbumVideoEditAct.this.f40439i.url, (int) (jM62405M2 / 1000));
            }
            if (((VDraweeView) this.f40459a.second).getTag() != this.f40459a.first || TextUtils.isEmpty(strM145081M)) {
                return;
            }
            final Pair pair = this.f40459a;
            e51.m114742G(new Runnable() { // from class: l.eh20
                @Override // java.lang.Runnable
                public final void run() {
                    NewAlbumVideoEditAct.C11231c.m62453a(pair, strM145081M);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.NewAlbumVideoEditAct$d */
    public class C11232d extends RecyclerView.AbstractC0582t {
        public C11232d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 0 && NullChecker.m81303a(NewAlbumVideoEditAct.this.f40444n)) {
                NewAlbumVideoEditAct.this.m62447a3();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.NewAlbumVideoEditAct$e */
    public class C11233e extends dac0<String> {

        /* JADX INFO: renamed from: c */
        public final int f40462c = 0;

        /* JADX INFO: renamed from: d */
        public final int f40463d = 1;

        /* JADX INFO: renamed from: e */
        public final int f40464e = 2;

        public C11233e() {
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return ((int) Math.ceil(NewAlbumVideoEditAct.this.f40456z / NewAlbumVideoEditAct.this.f40449s)) + 2;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            if (i == 2) {
                NewAlbumVideoEditAct.this.f40424F = new VImage(NewAlbumVideoEditAct.this.act);
                NewAlbumVideoEditAct.this.f40424F.setLayoutParams(new FrameLayout.LayoutParams(xdl0.m208412y0() - NewAlbumVideoEditAct.this.f40422D, NewAlbumVideoEditAct.this.f40451u));
                return NewAlbumVideoEditAct.this.f40424F;
            }
            if (i != 0) {
                return new VDraweeView(NewAlbumVideoEditAct.this.act);
            }
            NewAlbumVideoEditAct.this.f40423E = new VImage(NewAlbumVideoEditAct.this.act);
            NewAlbumVideoEditAct.this.f40423E.setLayoutParams(new FrameLayout.LayoutParams(xdl0.m208412y0(), NewAlbumVideoEditAct.this.f40451u));
            NewAlbumVideoEditAct.this.f40423E.setTag(0);
            return NewAlbumVideoEditAct.this.f40423E;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, String str, int i, int i2) {
            FrameLayout.LayoutParams layoutParams;
            if (i == 2) {
                if (NewAlbumVideoEditAct.this.f40424F.getLayoutParams().width != xdl0.m208412y0() - NewAlbumVideoEditAct.this.f40422D) {
                    NewAlbumVideoEditAct.this.f40424F.getLayoutParams().width = xdl0.m208412y0() - NewAlbumVideoEditAct.this.f40422D;
                    NewAlbumVideoEditAct.this.f40424F.setTag(Integer.valueOf(i2));
                    return;
                }
                return;
            }
            if (i == 1) {
                VDraweeView vDraweeView = (VDraweeView) view;
                int i3 = i2 % 2;
                NewAlbumVideoEditAct newAlbumVideoEditAct = NewAlbumVideoEditAct.this;
                vDraweeView.setBackgroundColor(i3 == 0 ? newAlbumVideoEditAct.f40452v : newAlbumVideoEditAct.f40453w);
                if (i2 == getPageCount() - 2) {
                    vDraweeView.getHierarchy().m112053H(new RoundingParams().m8264r(0.0f, NewAlbumVideoEditAct.this.f40450t, NewAlbumVideoEditAct.this.f40450t, 0.0f));
                    layoutParams = new FrameLayout.LayoutParams(NewAlbumVideoEditAct.this.f40455y - (NewAlbumVideoEditAct.this.f40419A * (getPageCount() - 3)), NewAlbumVideoEditAct.this.f40451u);
                } else if (i2 == 1) {
                    vDraweeView.getHierarchy().m112053H(new RoundingParams().m8264r(NewAlbumVideoEditAct.this.f40450t, 0.0f, 0.0f, NewAlbumVideoEditAct.this.f40450t));
                    layoutParams = new FrameLayout.LayoutParams(NewAlbumVideoEditAct.this.f40419A, NewAlbumVideoEditAct.this.f40451u);
                } else {
                    vDraweeView.getHierarchy().m112053H(new RoundingParams().m8264r(0.0f, 0.0f, 0.0f, 0.0f));
                    layoutParams = new FrameLayout.LayoutParams(NewAlbumVideoEditAct.this.f40419A, NewAlbumVideoEditAct.this.f40451u);
                }
                vDraweeView.setLayoutParams(layoutParams);
                vDraweeView.setTag(Integer.valueOf(i2));
                NewAlbumVideoEditAct.this.f40420B.onNext(new Pair(Integer.valueOf(i2), vDraweeView));
            }
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public String getItem(int i) {
            return String.valueOf(i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            if (i == getPageCount() - 1) {
                return 2;
            }
            return i == 0 ? 0 : 1;
        }
    }

    /* JADX INFO: renamed from: K2 */
    public static Intent m62403K2(Context context, Media media, String str) {
        Intent intent = new Intent(context, (Class<?>) NewAlbumVideoEditAct.class);
        intent.putExtra("media", media);
        intent.putExtra("extra_from", str);
        return intent;
    }

    /* JADX INFO: renamed from: L2 */
    private void m62404L2() {
        startActivity(VideoEditAct.m61233Y1(act(), this.f40428J, this.f40445o, this.f40446p, true, this.f40440j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M2 */
    public long m62405M2(int i) {
        return ((long) this.f40449s) * ((long) (i - 1)) * 1000;
    }

    /* JADX INFO: renamed from: N2 */
    private void m62406N2() {
        this.f40434d.setTitle(R$string.f39123p0);
        this.f40434d.setLeftIconAsBack(this);
        TextView textView = new TextView(this);
        this.f40432N = textView;
        textView.setText(actionItemPadding(getResources().getString(R$string.f39101m)));
        this.f40432N.setTextColor(getResources().getColor(e1c0.f88798n));
        this.f40432N.setTextSize(18.0f);
        this.f40432N.setText(actionItemPadding(string(R$string.f39101m)));
        this.f40434d.m223589z(this.f40432N);
        this.f40432N.setOnClickListener(new View.OnClickListener() { // from class: l.bh20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f75552a.m62441Q2(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R2 */
    public /* synthetic */ void m62407R2(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            if (NullChecker.m81304b(this.f40444n) && NullChecker.m81303a(this.f40427I)) {
                this.f40444n.resume();
            }
            if (NullChecker.m81303a(this.f40432N)) {
                this.f40432N.setEnabled(true);
                return;
            }
            return;
        }
        if (c4319c == C4319c.f15549j) {
            this.f40443m = false;
            if (NullChecker.m81304b(this.f40444n)) {
                this.f40444n.pause();
                return;
            }
            return;
        }
        if (c4319c == C4319c.f15552m && NullChecker.m81304b(this.f40444n)) {
            this.f40444n.release();
            this.f40444n = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T2 */
    public /* synthetic */ void m62408T2(roj0 roj0Var) {
        m62431r();
        this.act.progressDismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U2 */
    public /* synthetic */ void m62409U2(Throwable th) {
        this.act.progressDismiss();
        m47815F2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V2 */
    public /* synthetic */ void m62411V2(Bundle bundle) {
        m62406N2();
        act().progress(act().getString(R$string.f38984U2));
        C22306c.fromCallable(new Callable() { // from class: l.yg20
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f198115a.m62442S2();
            }
        }).compose(mkd0.m154951C()).subscribe(mkd0.m154956H(new e30() { // from class: l.zg20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203004a.m62408T2((roj0) obj);
            }
        }, new e30() { // from class: l.ah20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f69543a.m62409U2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W2 */
    public /* synthetic */ void m62412W2() {
        e51.m114774y(new RunnableC11230b());
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: r */
    private void m62431r() {
        m62440I2();
        Video video = this.f40439i;
        this.f40456z = video.duration;
        video.size = new Dimension();
        this.f40436f.setText(m62449c3(this.f40446p - this.f40445o));
        r5l0 r5l0Var = this.f40427I;
        int i = r5l0Var.f157835f;
        if (i == 90 || i == 270) {
            Dimension dimension = this.f40439i.size;
            dimension.width = r5l0Var.f157833d;
            dimension.height = r5l0Var.f157832c;
        } else {
            Dimension dimension2 = this.f40439i.size;
            dimension2.width = r5l0Var.f157832c;
            dimension2.height = r5l0Var.f157833d;
        }
        this.f40455y = (t100.m186890d(270.0f) * ((int) this.f40456z)) / this.f40447q;
        int iM186890d = (t100.m186890d(270.0f) * this.f40448r) / this.f40447q;
        this.f40419A = t100.m186890d(270.0f) / 10;
        this.f40454x = this.f40455y > xdl0.m208412y0() ? xdl0.m208412y0() : this.f40455y;
        int iM186890d2 = t100.m186890d(16.0f);
        this.f40421C = iM186890d2;
        int iM186890d3 = t100.m186890d(270.0f);
        int iM186890d4 = this.f40454x;
        if (iM186890d3 <= iM186890d4) {
            iM186890d4 = t100.m186890d(270.0f);
        }
        this.f40422D = iM186890d2 + iM186890d4;
        this.f40438h.m62589l(this.f40421C, this.f40454x, iM186890d, t100.m186890d(270.0f), new g30() { // from class: l.ch20
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                this.f80829a.m62445Y2((Integer) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
        xdl0.m208345M0(this.f40438h, true);
        C11233e c11233e = new C11233e();
        this.f40425G = c11233e;
        c11233e.setHasStableIds(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.act);
        linearLayoutManager.setOrientation(0);
        e51.m114742G(new Runnable() { // from class: l.dh20
            @Override // java.lang.Runnable
            public final void run() {
                this.f86230a.m62446Z2();
            }
        });
        this.f40437g.setLayoutManager(linearLayoutManager);
        this.f40437g.setAdapter(this.f40425G);
        this.f40437g.addOnScrollListener(new C11232d());
        linearLayoutManager.scrollToPositionWithOffset(1, t100.m186890d(16.0f));
        this.f40444n.mo129501g();
    }

    /* JADX INFO: renamed from: H2 */
    public View m62439H2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fh20.m121337b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: I2 */
    public final void m62440I2() {
        int i;
        int i2;
        int width = this.f40435e.getWidth();
        int height = this.f40435e.getHeight();
        if (width <= 0 || height <= 0 || this.f40441k == null) {
            return;
        }
        com.p046p1.mobile.putong.feed.newui.camera.momosdk.Video video = new com.p046p1.mobile.putong.feed.newui.camera.momosdk.Video();
        video.path = this.f40441k.f179990a;
        ebl0.m115505a(video);
        int i3 = video.width;
        int i4 = video.height;
        this.f40431M = new int[]{i3, i4};
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
        this.f40435e.setLayoutParams(new LinearLayout.LayoutParams(marginLayoutParams));
    }

    /* JADX INFO: renamed from: Q2 */
    public final /* synthetic */ void m62441Q2(View view) {
        view.setEnabled(false);
        m62404L2();
    }

    /* JADX INFO: renamed from: S2 */
    public final /* synthetic */ roj0 m62442S2() throws Exception {
        String strM179377u = rhi.m179377u(this.f40439i.url);
        this.f40428J = strM179377u;
        this.f40427I = new r5l0(strM179377u);
        String strM164281b = ogw.m164281b(this.f40439i.url + this.f40439i.duration);
        this.f40429K = strM164281b;
        this.f40430L = k9j.m145080L(strM164281b);
        VideoDataRetrieverBySoft videoDataRetrieverBySoft = new VideoDataRetrieverBySoft();
        this.f40426H = videoDataRetrieverBySoft;
        videoDataRetrieverBySoft.init(this.f40428J);
        return roj0.f160388a;
    }

    @Override // p149l.jmw
    /* JADX INFO: renamed from: V */
    public void mo62443V(float f) {
        this.f40438h.setPointIndex((int) (f * (this.f40422D - this.f40421C)));
    }

    /* JADX INFO: renamed from: X2 */
    public final /* synthetic */ void m62444X2(Pair pair) {
        e51.m114774y(new C11231c(pair));
    }

    /* JADX INFO: renamed from: Y2 */
    public final /* synthetic */ void m62445Y2(Integer num, Integer num2, Boolean bool) {
        if (!bool.booleanValue()) {
            this.f40436f.setText(m62449c3((long) (((this.f40422D - this.f40421C) * this.f40449s) / this.f40419A)));
            return;
        }
        this.f40421C = num.intValue();
        this.f40422D = num2.intValue();
        m62447a3();
    }

    /* JADX INFO: renamed from: Z2 */
    public final /* synthetic */ void m62446Z2() {
        if (NullChecker.m81304b(act()) && !act().isFinishing() && NullChecker.m81303a(this.f40444n)) {
            this.f40444n.resume();
        }
    }

    /* JADX INFO: renamed from: a3 */
    public final void m62447a3() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f40437g.getLayoutManager();
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        View viewFindViewWithTag = this.f40437g.findViewWithTag(Integer.valueOf(iFindFirstVisibleItemPosition));
        int[] iArr = new int[2];
        int iM208412y0 = this.f40421C;
        viewFindViewWithTag.getLocationInWindow(iArr);
        int iM208412y1 = 0;
        if (iFindFirstVisibleItemPosition == 0) {
            if (this.f40421C < xdl0.m208412y0() + iArr[0]) {
                linearLayoutManager.scrollToPositionWithOffset(0, this.f40421C - xdl0.m208412y0());
            } else {
                iM208412y0 = iArr[0] + xdl0.m208412y0();
            }
        }
        this.f40438h.m62591n(this.f40454x + iM208412y0 > xdl0.m208412y0() ? xdl0.m208412y0() : iM208412y0 + this.f40454x);
        if (NullChecker.m81303a(this.f40424F) && this.f40424F.getLayoutParams().width != xdl0.m208412y0() - this.f40422D) {
            this.f40425G.notifyDataSetChanged();
        }
        if (iFindFirstVisibleItemPosition != 0) {
            iM208412y1 = ((this.f40419A * (iFindFirstVisibleItemPosition - 1)) - iArr[0]) + this.f40421C;
        } else if (this.f40421C >= xdl0.m208412y0() + iArr[0]) {
            iM208412y1 = (this.f40421C - xdl0.m208412y0()) - iArr[0];
        }
        float f = this.f40449s;
        float f2 = iM208412y1 * f;
        int i = this.f40419A;
        long j = (long) (f2 / i);
        this.f40445o = j;
        long j2 = ((long) (((this.f40422D - this.f40421C) * f) / i)) + j;
        this.f40446p = j2;
        this.f40436f.setText(m62449c3(j2 - j));
        m62448b3();
    }

    /* JADX INFO: renamed from: b3 */
    public final void m62448b3() {
        VideoCut videoCut = new VideoCut(this.f40441k.f179990a, this.f40445o, this.f40446p);
        this.f40442l = videoCut;
        this.f40441k.f179996g.setVideoCuts(videoCut);
        this.f40444n.mo129497c(vwb.m200324f0(this.f40442l), null, 0L, true);
        this.f40444n.mo129510p();
        this.f40438h.setPointIndex(0);
        this.f40438h.f40547s = true;
    }

    /* JADX INFO: renamed from: c3 */
    public String m62449c3(long j) {
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

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM62439H2 = m62439H2(layoutInflater, viewGroup);
        this.f40435e.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC11229a());
        xdl0.m208345M0(this.f40438h, false);
        return viewM62439H2;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.ug20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f176347a.m62407R2((C4319c) obj);
            }
        }));
        creates(new e30() { // from class: l.vg20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181342a.m62411V2((Bundle) obj);
            }
        }, new d30() { // from class: l.wg20
            @Override // p149l.d30
            public final void call() {
                this.f186135a.m62412W2();
            }
        });
        duringCreated(this.f40420B).subscribe(mkd0.m154955G(new e30() { // from class: l.xg20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f192733a.m62444X2((Pair) obj);
            }
        }));
    }

    @Override // p149l.jmw
    /* JADX INFO: renamed from: k0 */
    public void mo62450k0() {
    }

    @Override // p149l.jmw
    /* JADX INFO: renamed from: n */
    public void mo62451n(long j) {
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_camera_album_video_clip";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        this.f40439i = (Video) getIntent().getSerializableExtra("media");
        this.f40440j = getIntent().getStringExtra("extra_from");
        if (this.f40439i == null) {
            m47815F2();
            return;
        }
        int iM112145a = djx.m112144h().m112145a() * 1000;
        this.f40447q = iM112145a;
        this.f40449s = (iM112145a / 15.0f) * 1.5f;
        v500 v500Var = new v500();
        this.f40441k = v500Var;
        v500Var.f179990a = rhi.m179377u(this.f40439i.url);
        this.f40442l = new VideoCut(this.f40441k.f179990a, 0L, this.f40447q);
        VideoEffects videoEffects = new VideoEffects();
        videoEffects.setVideoCuts(this.f40442l);
        this.f40441k.f179996g = videoEffects;
        if (!vb4.m197675i() || !vb4.m197672f()) {
            m47815F2();
            return;
        }
        p7m p7mVarM157981b = n500.m157981b();
        this.f40444n = p7mVarM157981b;
        p7mVarM157981b.mo129512r(this);
        this.f40444n.mo129498d(true);
        this.f40444n.mo129499e(false);
        this.f40444n.mo129496b(this.f40441k);
        setSwipeBackEnable(false);
        float f = this.f40439i.duration;
        int i = this.f40447q;
        this.f40446p = f > ((float) i) ? i : (int) f;
        super.preCreateView(bundle);
    }

    @Override // p149l.jmw
    /* JADX INFO: renamed from: z */
    public void mo62452z() {
    }
}
