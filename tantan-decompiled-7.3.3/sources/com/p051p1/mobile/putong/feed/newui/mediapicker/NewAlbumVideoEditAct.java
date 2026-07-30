package com.p051p1.mobile.putong.feed.newui.mediapicker;

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
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.newui.camera.ReloadSoAct;
import com.p051p1.mobile.putong.feed.newui.camera.VideoEditAct;
import com.p051p1.mobile.putong.feed.newui.mediapicker.NewAlbumVideoEditAct;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.could.component.common.p084ai.eventreport.entry.NetWorkParam;
import java.io.File;
import java.util.concurrent.Callable;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;
import p153l.a30;
import p153l.asx;
import p153l.be00;
import p153l.bnl0;
import p153l.ecj;
import p153l.fam;
import p153l.fe00;
import p153l.ikl0;
import p153l.ipw;
import p153l.jic0;
import p153l.jyb;
import p153l.k9c0;
import p153l.l51;
import p153l.niw;
import p153l.oki;
import p153l.pp20;
import p153l.psd0;
import p153l.qa00;
import p153l.uc4;
import p153l.uqb0;
import p153l.uxj0;
import p153l.vel0;
import p153l.wel0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class NewAlbumVideoEditAct extends ReloadSoAct implements ipw {

    /* JADX INFO: renamed from: C */
    public int f41269C;

    /* JADX INFO: renamed from: D */
    public int f41270D;

    /* JADX INFO: renamed from: E */
    public VImage f41271E;

    /* JADX INFO: renamed from: F */
    public VImage f41272F;

    /* JADX INFO: renamed from: G */
    public C11396e f41273G;

    /* JADX INFO: renamed from: H */
    public VideoDataRetrieverBySoft f41274H;

    /* JADX INFO: renamed from: I */
    public vel0 f41275I;

    /* JADX INFO: renamed from: J */
    public String f41276J;

    /* JADX INFO: renamed from: K */
    public String f41277K;

    /* JADX INFO: renamed from: L */
    public File f41278L;

    /* JADX INFO: renamed from: M */
    public int[] f41279M;

    /* JADX INFO: renamed from: N */
    public TextView f41280N;

    /* JADX INFO: renamed from: c */
    public VLinear f41281c;

    /* JADX INFO: renamed from: d */
    public VNavigationBar f41282d;

    /* JADX INFO: renamed from: e */
    public TextureView f41283e;

    /* JADX INFO: renamed from: f */
    public VText f41284f;

    /* JADX INFO: renamed from: g */
    public VRecyclerView f41285g;

    /* JADX INFO: renamed from: h */
    public VideoCutDrawView f41286h;

    /* JADX INFO: renamed from: i */
    public Video f41287i;

    /* JADX INFO: renamed from: j */
    public String f41288j;

    /* JADX INFO: renamed from: k */
    public fe00 f41289k;

    /* JADX INFO: renamed from: l */
    public VideoCut f41290l;

    /* JADX INFO: renamed from: n */
    public fam f41292n;

    /* JADX INFO: renamed from: x */
    public int f41302x;

    /* JADX INFO: renamed from: y */
    public int f41303y;

    /* JADX INFO: renamed from: m */
    public boolean f41291m = false;

    /* JADX INFO: renamed from: o */
    public long f41293o = 0;

    /* JADX INFO: renamed from: p */
    public long f41294p = 0;

    /* JADX INFO: renamed from: q */
    public int f41295q = NetWorkParam.DEFAULT_CONNECT_TIME_OUT;

    /* JADX INFO: renamed from: r */
    public int f41296r = 3000;

    /* JADX INFO: renamed from: s */
    public float f41297s = 1500.0f;

    /* JADX INFO: renamed from: t */
    public final int f41298t = qa00.m175859d(4.0f);

    /* JADX INFO: renamed from: u */
    public final int f41299u = qa00.m175859d(56.0f);

    /* JADX INFO: renamed from: v */
    public int f41300v = Color.parseColor("#EEEFF1");

    /* JADX INFO: renamed from: w */
    public int f41301w = Color.parseColor("#F6F7F8");

    /* JADX INFO: renamed from: z */
    public float f41304z = 0.0f;

    /* JADX INFO: renamed from: A */
    public int f41267A = 0;

    /* JADX INFO: renamed from: B */
    public C22507a<Pair<Integer, VDraweeView>> f41268B = C22507a.m222758b();

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.NewAlbumVideoEditAct$a */
    public class TextureViewSurfaceTextureListenerC11392a implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC11392a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            if (NullChecker.m82486a(NewAlbumVideoEditAct.this.f41279M)) {
                surfaceTexture.setDefaultBufferSize(NewAlbumVideoEditAct.this.f41279M[0], NewAlbumVideoEditAct.this.f41279M[1]);
            }
            if (NullChecker.m82487b(surfaceTexture)) {
                NewAlbumVideoEditAct.this.f41292n.mo124756h(surfaceTexture);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            if (!NullChecker.m82486a(NewAlbumVideoEditAct.this.f41292n)) {
                return false;
            }
            NewAlbumVideoEditAct.this.f41292n.mo124749a();
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            if (NullChecker.m82486a(NewAlbumVideoEditAct.this.f41279M)) {
                surfaceTexture.setDefaultBufferSize(NewAlbumVideoEditAct.this.f41279M[0], NewAlbumVideoEditAct.this.f41279M[1]);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            if (NullChecker.m82486a(NewAlbumVideoEditAct.this.f41279M)) {
                surfaceTexture.setDefaultBufferSize(NewAlbumVideoEditAct.this.f41279M[0], NewAlbumVideoEditAct.this.f41279M[1]);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.NewAlbumVideoEditAct$b */
    public class RunnableC11393b implements Runnable {
        public RunnableC11393b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NullChecker.m82486a(NewAlbumVideoEditAct.this.f41274H)) {
                NewAlbumVideoEditAct.this.f41274H.release();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.NewAlbumVideoEditAct$c */
    public class C11394c extends l51.AbstractRunnableC18350c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Pair f41307a;

        public C11394c(Pair pair) {
            this.f41307a = pair;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m63636a(Pair pair, String str) {
            if (((VDraweeView) pair.second).getTag() != pair.first) {
                return;
            }
            uqb0.f180374G.m127146i0((SimpleDraweeView) pair.second, "file://" + str);
        }

        @Override // java.lang.Runnable
        public void run() {
            final String strM120379M;
            Object tag = ((VDraweeView) this.f41307a.second).getTag();
            Object obj = this.f41307a.first;
            if (tag != obj) {
                return;
            }
            long jM63589N2 = NewAlbumVideoEditAct.this.m63589N2(((Integer) obj).intValue());
            File file = new File(NewAlbumVideoEditAct.this.f41278L, jM63589N2 + ".jpeg");
            if (file.exists()) {
                strM120379M = file.getAbsolutePath();
            } else {
                Bitmap frameAtTime = NewAlbumVideoEditAct.this.f41274H.getFrameAtTime(jM63589N2);
                strM120379M = NullChecker.m82486a(frameAtTime) ? ecj.m120379M(frameAtTime, file, NewAlbumVideoEditAct.this.f41275I.f183810f, NewAlbumVideoEditAct.this.f41299u) : wel0.m206009d(file.getAbsolutePath(), NewAlbumVideoEditAct.this.f41287i.url, (int) (jM63589N2 / 1000));
            }
            if (((VDraweeView) this.f41307a.second).getTag() != this.f41307a.first || TextUtils.isEmpty(strM120379M)) {
                return;
            }
            final Pair pair = this.f41307a;
            l51.m152887G(new Runnable() { // from class: l.op20
                @Override // java.lang.Runnable
                public final void run() {
                    NewAlbumVideoEditAct.C11394c.m63636a(pair, strM120379M);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.NewAlbumVideoEditAct$d */
    public class C11395d extends RecyclerView.AbstractC0584t {
        public C11395d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 0 && NullChecker.m82486a(NewAlbumVideoEditAct.this.f41292n)) {
                NewAlbumVideoEditAct.this.m63630c3();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.NewAlbumVideoEditAct$e */
    public class C11396e extends jic0<String> {

        /* JADX INFO: renamed from: c */
        public final int f41310c = 0;

        /* JADX INFO: renamed from: d */
        public final int f41311d = 1;

        /* JADX INFO: renamed from: e */
        public final int f41312e = 2;

        public C11396e() {
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return ((int) Math.ceil(NewAlbumVideoEditAct.this.f41304z / NewAlbumVideoEditAct.this.f41297s)) + 2;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            if (i == 2) {
                NewAlbumVideoEditAct.this.f41272F = new VImage(NewAlbumVideoEditAct.this.act);
                NewAlbumVideoEditAct.this.f41272F.setLayoutParams(new FrameLayout.LayoutParams(bnl0.m105592y0() - NewAlbumVideoEditAct.this.f41270D, NewAlbumVideoEditAct.this.f41299u));
                return NewAlbumVideoEditAct.this.f41272F;
            }
            if (i != 0) {
                return new VDraweeView(NewAlbumVideoEditAct.this.act);
            }
            NewAlbumVideoEditAct.this.f41271E = new VImage(NewAlbumVideoEditAct.this.act);
            NewAlbumVideoEditAct.this.f41271E.setLayoutParams(new FrameLayout.LayoutParams(bnl0.m105592y0(), NewAlbumVideoEditAct.this.f41299u));
            NewAlbumVideoEditAct.this.f41271E.setTag(0);
            return NewAlbumVideoEditAct.this.f41271E;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, String str, int i, int i2) {
            FrameLayout.LayoutParams layoutParams;
            if (i == 2) {
                if (NewAlbumVideoEditAct.this.f41272F.getLayoutParams().width != bnl0.m105592y0() - NewAlbumVideoEditAct.this.f41270D) {
                    NewAlbumVideoEditAct.this.f41272F.getLayoutParams().width = bnl0.m105592y0() - NewAlbumVideoEditAct.this.f41270D;
                    NewAlbumVideoEditAct.this.f41272F.setTag(Integer.valueOf(i2));
                    return;
                }
                return;
            }
            if (i == 1) {
                VDraweeView vDraweeView = (VDraweeView) view;
                int i3 = i2 % 2;
                NewAlbumVideoEditAct newAlbumVideoEditAct = NewAlbumVideoEditAct.this;
                vDraweeView.setBackgroundColor(i3 == 0 ? newAlbumVideoEditAct.f41300v : newAlbumVideoEditAct.f41301w);
                if (i2 == getPageCount() - 2) {
                    vDraweeView.getHierarchy().m207045H(new RoundingParams().m8318r(0.0f, NewAlbumVideoEditAct.this.f41298t, NewAlbumVideoEditAct.this.f41298t, 0.0f));
                    layoutParams = new FrameLayout.LayoutParams(NewAlbumVideoEditAct.this.f41303y - (NewAlbumVideoEditAct.this.f41267A * (getPageCount() - 3)), NewAlbumVideoEditAct.this.f41299u);
                } else if (i2 == 1) {
                    vDraweeView.getHierarchy().m207045H(new RoundingParams().m8318r(NewAlbumVideoEditAct.this.f41298t, 0.0f, 0.0f, NewAlbumVideoEditAct.this.f41298t));
                    layoutParams = new FrameLayout.LayoutParams(NewAlbumVideoEditAct.this.f41267A, NewAlbumVideoEditAct.this.f41299u);
                } else {
                    vDraweeView.getHierarchy().m207045H(new RoundingParams().m8318r(0.0f, 0.0f, 0.0f, 0.0f));
                    layoutParams = new FrameLayout.LayoutParams(NewAlbumVideoEditAct.this.f41267A, NewAlbumVideoEditAct.this.f41299u);
                }
                vDraweeView.setLayoutParams(layoutParams);
                vDraweeView.setTag(Integer.valueOf(i2));
                NewAlbumVideoEditAct.this.f41268B.onNext(new Pair(Integer.valueOf(i2), vDraweeView));
            }
        }

        @Override // p153l.jic0
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

    /* JADX INFO: renamed from: L2 */
    public static Intent m63587L2(Context context, Media media, String str) {
        Intent intent = new Intent(context, (Class<?>) NewAlbumVideoEditAct.class);
        intent.putExtra("media", media);
        intent.putExtra("extra_from", str);
        return intent;
    }

    /* JADX INFO: renamed from: M2 */
    private void m63588M2() {
        startActivity(VideoEditAct.m62417Z1(act(), this.f41276J, this.f41293o, this.f41294p, true, this.f41288j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N2 */
    public long m63589N2(int i) {
        return ((long) this.f41297s) * ((long) (i - 1)) * 1000;
    }

    /* JADX INFO: renamed from: Q2 */
    private void m63590Q2() {
        this.f41282d.setTitle(R$string.f39971p0);
        this.f41282d.setLeftIconAsBack(this);
        TextView textView = new TextView(this);
        this.f41280N = textView;
        textView.setText(actionItemPadding(getResources().getString(R$string.f39949m)));
        this.f41280N.setTextColor(getResources().getColor(k9c0.f124521n));
        this.f41280N.setTextSize(18.0f);
        this.f41280N.setText(actionItemPadding(string(R$string.f39949m)));
        this.f41282d.m224835z(this.f41280N);
        this.f41280N.setOnClickListener(new View.OnClickListener() { // from class: l.lp20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f132996a.m63624R2(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S2 */
    public /* synthetic */ void m63591S2(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            if (NullChecker.m82487b(this.f41292n) && NullChecker.m82486a(this.f41275I)) {
                this.f41292n.resume();
            }
            if (NullChecker.m82486a(this.f41280N)) {
                this.f41280N.setEnabled(true);
                return;
            }
            return;
        }
        if (c4470c == C4470c.f16268j) {
            this.f41291m = false;
            if (NullChecker.m82487b(this.f41292n)) {
                this.f41292n.pause();
                return;
            }
            return;
        }
        if (c4470c == C4470c.f16271m && NullChecker.m82487b(this.f41292n)) {
            this.f41292n.release();
            this.f41292n = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U2 */
    public /* synthetic */ void m63592U2(uxj0 uxj0Var) {
        m63614r();
        this.act.progressDismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V2 */
    public /* synthetic */ void m63593V2(Throwable th) {
        this.act.progressDismiss();
        m48999H2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W2 */
    public /* synthetic */ void m63594W2(Bundle bundle) {
        m63590Q2();
        act().progress(act().getString(R$string.f39832U2));
        C22421c.fromCallable(new Callable() { // from class: l.ip20
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f116251a.m63625T2();
            }
        }).compose(psd0.m173592C()).subscribe(psd0.m173597H(new y20() { // from class: l.jp20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122071a.m63592U2((uxj0) obj);
            }
        }, new y20() { // from class: l.kp20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127826a.m63593V2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X2 */
    public /* synthetic */ void m63596X2() {
        l51.m152919y(new RunnableC11393b());
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: r */
    private void m63614r() {
        m63623K2();
        Video video = this.f41287i;
        this.f41304z = video.duration;
        video.size = new Dimension();
        this.f41284f.setText(m63632e3(this.f41294p - this.f41293o));
        vel0 vel0Var = this.f41275I;
        int i = vel0Var.f183810f;
        if (i == 90 || i == 270) {
            Dimension dimension = this.f41287i.size;
            dimension.width = vel0Var.f183808d;
            dimension.height = vel0Var.f183807c;
        } else {
            Dimension dimension2 = this.f41287i.size;
            dimension2.width = vel0Var.f183807c;
            dimension2.height = vel0Var.f183808d;
        }
        this.f41303y = (qa00.m175859d(270.0f) * ((int) this.f41304z)) / this.f41295q;
        int iM175859d = (qa00.m175859d(270.0f) * this.f41296r) / this.f41295q;
        this.f41267A = qa00.m175859d(270.0f) / 10;
        this.f41302x = this.f41303y > bnl0.m105592y0() ? bnl0.m105592y0() : this.f41303y;
        int iM175859d2 = qa00.m175859d(16.0f);
        this.f41269C = iM175859d2;
        int iM175859d3 = qa00.m175859d(270.0f);
        int iM175859d4 = this.f41302x;
        if (iM175859d3 <= iM175859d4) {
            iM175859d4 = qa00.m175859d(270.0f);
        }
        this.f41270D = iM175859d2 + iM175859d4;
        this.f41286h.m63772l(this.f41269C, this.f41302x, iM175859d, qa00.m175859d(270.0f), new a30() { // from class: l.mp20
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                this.f137867a.m63628a3((Integer) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
        bnl0.m105525M0(this.f41286h, true);
        C11396e c11396e = new C11396e();
        this.f41273G = c11396e;
        c11396e.setHasStableIds(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.act);
        linearLayoutManager.setOrientation(0);
        l51.m152887G(new Runnable() { // from class: l.np20
            @Override // java.lang.Runnable
            public final void run() {
                this.f143068a.m63629b3();
            }
        });
        this.f41285g.setLayoutManager(linearLayoutManager);
        this.f41285g.setAdapter(this.f41273G);
        this.f41285g.addOnScrollListener(new C11395d());
        linearLayoutManager.scrollToPositionWithOffset(1, qa00.m175859d(16.0f));
        this.f41292n.mo124755g();
    }

    /* JADX INFO: renamed from: I2 */
    public View m63622I2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pp20.m173177b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: K2 */
    public final void m63623K2() {
        int i;
        int i2;
        int width = this.f41283e.getWidth();
        int height = this.f41283e.getHeight();
        if (width <= 0 || height <= 0 || this.f41289k == null) {
            return;
        }
        com.p051p1.mobile.putong.feed.newui.camera.momosdk.Video video = new com.p051p1.mobile.putong.feed.newui.camera.momosdk.Video();
        video.path = this.f41289k.f98533a;
        ikl0.m140409a(video);
        int i3 = video.width;
        int i4 = video.height;
        this.f41279M = new int[]{i3, i4};
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
        this.f41283e.setLayoutParams(new LinearLayout.LayoutParams(marginLayoutParams));
    }

    /* JADX INFO: renamed from: R2 */
    public final /* synthetic */ void m63624R2(View view) {
        view.setEnabled(false);
        m63588M2();
    }

    /* JADX INFO: renamed from: T2 */
    public final /* synthetic */ uxj0 m63625T2() throws Exception {
        String strM168033u = oki.m168033u(this.f41287i.url);
        this.f41276J = strM168033u;
        this.f41275I = new vel0(strM168033u);
        String strM163312b = niw.m163312b(this.f41287i.url + this.f41287i.duration);
        this.f41277K = strM163312b;
        this.f41278L = ecj.m120378L(strM163312b);
        VideoDataRetrieverBySoft videoDataRetrieverBySoft = new VideoDataRetrieverBySoft();
        this.f41274H = videoDataRetrieverBySoft;
        videoDataRetrieverBySoft.init(this.f41276J);
        return uxj0.f181467a;
    }

    @Override // p153l.ipw
    /* JADX INFO: renamed from: W */
    public void mo63626W(float f) {
        this.f41286h.setPointIndex((int) (f * (this.f41270D - this.f41269C)));
    }

    /* JADX INFO: renamed from: Z2 */
    public final /* synthetic */ void m63627Z2(Pair pair) {
        l51.m152919y(new C11394c(pair));
    }

    /* JADX INFO: renamed from: a3 */
    public final /* synthetic */ void m63628a3(Integer num, Integer num2, Boolean bool) {
        if (!bool.booleanValue()) {
            this.f41284f.setText(m63632e3((long) (((this.f41270D - this.f41269C) * this.f41297s) / this.f41267A)));
            return;
        }
        this.f41269C = num.intValue();
        this.f41270D = num2.intValue();
        m63630c3();
    }

    /* JADX INFO: renamed from: b3 */
    public final /* synthetic */ void m63629b3() {
        if (NullChecker.m82487b(act()) && !act().isFinishing() && NullChecker.m82486a(this.f41292n)) {
            this.f41292n.resume();
        }
    }

    /* JADX INFO: renamed from: c3 */
    public final void m63630c3() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f41285g.getLayoutManager();
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        View viewFindViewWithTag = this.f41285g.findViewWithTag(Integer.valueOf(iFindFirstVisibleItemPosition));
        int[] iArr = new int[2];
        int iM105592y0 = this.f41269C;
        viewFindViewWithTag.getLocationInWindow(iArr);
        int iM105592y1 = 0;
        if (iFindFirstVisibleItemPosition == 0) {
            if (this.f41269C < bnl0.m105592y0() + iArr[0]) {
                linearLayoutManager.scrollToPositionWithOffset(0, this.f41269C - bnl0.m105592y0());
            } else {
                iM105592y0 = iArr[0] + bnl0.m105592y0();
            }
        }
        this.f41286h.m63774n(this.f41302x + iM105592y0 > bnl0.m105592y0() ? bnl0.m105592y0() : iM105592y0 + this.f41302x);
        if (NullChecker.m82486a(this.f41272F) && this.f41272F.getLayoutParams().width != bnl0.m105592y0() - this.f41270D) {
            this.f41273G.notifyDataSetChanged();
        }
        if (iFindFirstVisibleItemPosition != 0) {
            iM105592y1 = ((this.f41267A * (iFindFirstVisibleItemPosition - 1)) - iArr[0]) + this.f41269C;
        } else if (this.f41269C >= bnl0.m105592y0() + iArr[0]) {
            iM105592y1 = (this.f41269C - bnl0.m105592y0()) - iArr[0];
        }
        float f = this.f41297s;
        float f2 = iM105592y1 * f;
        int i = this.f41267A;
        long j = (long) (f2 / i);
        this.f41293o = j;
        long j2 = ((long) (((this.f41270D - this.f41269C) * f) / i)) + j;
        this.f41294p = j2;
        this.f41284f.setText(m63632e3(j2 - j));
        m63631d3();
    }

    /* JADX INFO: renamed from: d3 */
    public final void m63631d3() {
        VideoCut videoCut = new VideoCut(this.f41289k.f98533a, this.f41293o, this.f41294p);
        this.f41290l = videoCut;
        this.f41289k.f98539g.setVideoCuts(videoCut);
        this.f41292n.mo124751c(jyb.m147507f0(this.f41290l), null, 0L, true);
        this.f41292n.mo124763p();
        this.f41286h.setPointIndex(0);
        this.f41286h.f41395s = true;
    }

    /* JADX INFO: renamed from: e3 */
    public String m63632e3(long j) {
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

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM63622I2 = m63622I2(layoutInflater, viewGroup);
        this.f41283e.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC11392a());
        bnl0.m105525M0(this.f41286h, false);
        return viewM63622I2;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.ep20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f95198a.m63591S2((C4470c) obj);
            }
        }));
        creates(new y20() { // from class: l.fp20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f100097a.m63594W2((Bundle) obj);
            }
        }, new x20() { // from class: l.gp20
            @Override // p153l.x20
            public final void call() {
                this.f105407a.m63596X2();
            }
        });
        duringCreated(this.f41268B).subscribe(psd0.m173596G(new y20() { // from class: l.hp20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f110977a.m63627Z2((Pair) obj);
            }
        }));
    }

    @Override // p153l.ipw
    /* JADX INFO: renamed from: l0 */
    public void mo63633l0() {
    }

    @Override // p153l.ipw
    /* JADX INFO: renamed from: n */
    public void mo63634n(long j) {
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_camera_album_video_clip";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        this.f41287i = (Video) getIntent().getSerializableExtra("media");
        this.f41288j = getIntent().getStringExtra("extra_from");
        if (this.f41287i == null) {
            m48999H2();
            return;
        }
        int iM99991a = asx.m99990h().m99991a() * 1000;
        this.f41295q = iM99991a;
        this.f41297s = (iM99991a / 15.0f) * 1.5f;
        fe00 fe00Var = new fe00();
        this.f41289k = fe00Var;
        fe00Var.f98533a = oki.m168033u(this.f41287i.url);
        this.f41290l = new VideoCut(this.f41289k.f98533a, 0L, this.f41295q);
        VideoEffects videoEffects = new VideoEffects();
        videoEffects.setVideoCuts(this.f41290l);
        this.f41289k.f98539g = videoEffects;
        if (!uc4.m195359i() || !uc4.m195356f()) {
            m48999H2();
            return;
        }
        fam famVarM103675b = be00.m103675b();
        this.f41292n = famVarM103675b;
        famVarM103675b.mo124765r(this);
        this.f41292n.mo124752d(true);
        this.f41292n.mo124753e(false);
        this.f41292n.mo124750b(this.f41289k);
        setSwipeBackEnable(false);
        float f = this.f41287i.duration;
        int i = this.f41295q;
        this.f41294p = f > ((float) i) ? i : (int) f;
        super.preCreateView(bundle);
    }

    @Override // p153l.ipw
    /* JADX INFO: renamed from: z */
    public void mo63635z() {
    }
}
