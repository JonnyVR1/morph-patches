package com.p051p1.mobile.putong.feed.newui.mediapicker;

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
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.newui.camera.ReloadSoAct;
import com.p051p1.mobile.putong.feed.newui.mediapicker.NewAlbumSelectFrameAct;
import com.p051p1.mobile.putong.feed.p065ui.PlayerView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;
import p153l.bnl0;
import p153l.dp20;
import p153l.ecj;
import p153l.gcg0;
import p153l.ie80;
import p153l.jic0;
import p153l.k9c0;
import p153l.l51;
import p153l.niw;
import p153l.psd0;
import p153l.qa00;
import p153l.re80;
import p153l.uqb0;
import p153l.uxj0;
import p153l.vel0;
import p153l.wel0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class NewAlbumSelectFrameAct extends ReloadSoAct {

    /* JADX INFO: renamed from: A */
    public VideoDataRetrieverBySoft f41229A;

    /* JADX INFO: renamed from: B */
    public vel0 f41230B;

    /* JADX INFO: renamed from: C */
    public String f41231C;

    /* JADX INFO: renamed from: D */
    public String f41232D;

    /* JADX INFO: renamed from: E */
    public File f41233E;

    /* JADX INFO: renamed from: c */
    public VLinear f41235c;

    /* JADX INFO: renamed from: d */
    public VNavigationBar f41236d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f41237e;

    /* JADX INFO: renamed from: f */
    public VText f41238f;

    /* JADX INFO: renamed from: g */
    public VRecyclerView f41239g;

    /* JADX INFO: renamed from: h */
    public SelectFrameView f41240h;

    /* JADX INFO: renamed from: i */
    public Video f41241i;

    /* JADX INFO: renamed from: j */
    public re80 f41242j;

    /* JADX INFO: renamed from: k */
    public PlayerView f41243k;

    /* JADX INFO: renamed from: r */
    public int f41250r;

    /* JADX INFO: renamed from: s */
    public int f41251s;

    /* JADX INFO: renamed from: t */
    public int f41252t;

    /* JADX INFO: renamed from: w */
    public int f41255w;

    /* JADX INFO: renamed from: y */
    public VImage f41257y;

    /* JADX INFO: renamed from: z */
    public C11391d f41258z;

    /* JADX INFO: renamed from: l */
    public long f41244l = 0;

    /* JADX INFO: renamed from: m */
    public final int f41245m = qa00.m175859d(56.0f);

    /* JADX INFO: renamed from: n */
    public final int f41246n = qa00.m175859d(20.0f);

    /* JADX INFO: renamed from: o */
    public final int f41247o = qa00.m175859d(4.0f);

    /* JADX INFO: renamed from: p */
    public int f41248p = Color.parseColor("#EEEFF1");

    /* JADX INFO: renamed from: q */
    public int f41249q = Color.parseColor("#F6F7F8");

    /* JADX INFO: renamed from: u */
    public float f41253u = 0.0f;

    /* JADX INFO: renamed from: v */
    public int f41254v = qa00.m175859d(32.0f);

    /* JADX INFO: renamed from: x */
    public int f41256x = 0;

    /* JADX INFO: renamed from: F */
    public boolean f41234F = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.NewAlbumSelectFrameAct$a */
    public class RunnableC11388a implements Runnable {
        public RunnableC11388a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NullChecker.m82486a(NewAlbumSelectFrameAct.this.f41229A)) {
                NewAlbumSelectFrameAct.this.f41229A.release();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.NewAlbumSelectFrameAct$b */
    public class C11389b extends ie80.C17711c {
        public C11389b() {
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: b */
        public void mo45234b(int i) {
            boolean z = NewAlbumSelectFrameAct.this.f41234F;
            NewAlbumSelectFrameAct newAlbumSelectFrameAct = NewAlbumSelectFrameAct.this;
            if (z) {
                newAlbumSelectFrameAct.f41242j.pause();
            } else {
                newAlbumSelectFrameAct.m63570d3();
            }
            NewAlbumSelectFrameAct.this.f41234F = true;
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: d */
        public void mo45236d() {
            NewAlbumSelectFrameAct.this.f41234F = false;
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        public void onStart() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.NewAlbumSelectFrameAct$c */
    public class C11390c extends l51.AbstractRunnableC18350c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VDraweeView f41261a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Integer f41262b;

        public C11390c(VDraweeView vDraweeView, Integer num) {
            this.f41261a = vDraweeView;
            this.f41262b = num;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m63577a(VDraweeView vDraweeView, Integer num, String str) {
            if (vDraweeView.getTag() != num) {
                return;
            }
            uqb0.f180374G.m127146i0(vDraweeView, "file://" + str);
        }

        @Override // java.lang.Runnable
        public void run() {
            final String strM120379M;
            Object tag = this.f41261a.getTag();
            Integer num = this.f41262b;
            if (tag != num) {
                return;
            }
            long jM63561N2 = NewAlbumSelectFrameAct.this.m63561N2(num.intValue());
            File file = new File(NewAlbumSelectFrameAct.this.f41233E, jM63561N2 + ".jpeg");
            if (file.exists()) {
                strM120379M = file.getAbsolutePath();
            } else {
                Bitmap frameAtTime = NewAlbumSelectFrameAct.this.f41229A.getFrameAtTime(jM63561N2);
                strM120379M = NullChecker.m82486a(frameAtTime) ? ecj.m120379M(frameAtTime, file, NewAlbumSelectFrameAct.this.f41230B.f183810f, NewAlbumSelectFrameAct.this.f41245m) : wel0.m206009d(file.getAbsolutePath(), NewAlbumSelectFrameAct.this.f41241i.url, (int) (jM63561N2 / 1000));
            }
            if (this.f41261a.getTag() != this.f41262b || TextUtils.isEmpty(strM120379M)) {
                return;
            }
            final VDraweeView vDraweeView = this.f41261a;
            final Integer num2 = this.f41262b;
            l51.m152887G(new Runnable() { // from class: l.cp20
                @Override // java.lang.Runnable
                public final void run() {
                    NewAlbumSelectFrameAct.C11390c.m63577a(vDraweeView, num2, strM120379M);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.NewAlbumSelectFrameAct$d */
    public class C11391d extends jic0<String> {

        /* JADX INFO: renamed from: c */
        public final int f41264c = 0;

        /* JADX INFO: renamed from: d */
        public final int f41265d = 1;

        public C11391d() {
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return NewAlbumSelectFrameAct.this.f41251s + 1;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            if (i != 0) {
                return new VDraweeView(NewAlbumSelectFrameAct.this.act);
            }
            NewAlbumSelectFrameAct.this.f41257y = new VImage(NewAlbumSelectFrameAct.this.act);
            NewAlbumSelectFrameAct.this.f41257y.setLayoutParams(new FrameLayout.LayoutParams(NewAlbumSelectFrameAct.this.f41256x, NewAlbumSelectFrameAct.this.f41245m));
            return NewAlbumSelectFrameAct.this.f41257y;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, String str, int i, int i2) {
            FrameLayout.LayoutParams layoutParams;
            if (i == 0) {
                NewAlbumSelectFrameAct.this.f41257y.setTag(Integer.valueOf(i2));
                return;
            }
            VDraweeView vDraweeView = (VDraweeView) view;
            int i3 = i2 % 2;
            NewAlbumSelectFrameAct newAlbumSelectFrameAct = NewAlbumSelectFrameAct.this;
            vDraweeView.setBackgroundColor(i3 == 0 ? newAlbumSelectFrameAct.f41248p : newAlbumSelectFrameAct.f41249q);
            if (i2 == getPageCount() - 1) {
                vDraweeView.getHierarchy().m207045H(new RoundingParams().m8318r(0.0f, NewAlbumSelectFrameAct.this.f41247o, NewAlbumSelectFrameAct.this.f41247o, 0.0f));
                layoutParams = new FrameLayout.LayoutParams(NewAlbumSelectFrameAct.this.f41252t - (NewAlbumSelectFrameAct.this.f41254v * (getPageCount() - 2)), NewAlbumSelectFrameAct.this.f41245m);
            } else if (i2 == 1) {
                vDraweeView.getHierarchy().m207045H(new RoundingParams().m8318r(NewAlbumSelectFrameAct.this.f41247o, 0.0f, 0.0f, NewAlbumSelectFrameAct.this.f41247o));
                layoutParams = new FrameLayout.LayoutParams(NewAlbumSelectFrameAct.this.f41254v, NewAlbumSelectFrameAct.this.f41245m);
            } else {
                layoutParams = new FrameLayout.LayoutParams(NewAlbumSelectFrameAct.this.f41254v, NewAlbumSelectFrameAct.this.f41245m);
            }
            vDraweeView.setLayoutParams(layoutParams);
            vDraweeView.setTag(Integer.valueOf(i2));
            NewAlbumSelectFrameAct.this.m63574h3(Integer.valueOf(i2), vDraweeView);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public String getItem(int i) {
            return "";
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return i == 0 ? 0 : 1;
        }
    }

    /* JADX INFO: renamed from: L2 */
    public static Intent m63528L2(Context context, Media media) {
        Intent intent = new Intent(context, (Class<?>) NewAlbumSelectFrameAct.class);
        intent.putExtra("media", media);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X2 */
    public /* synthetic */ void m63530X2(Throwable th) {
        this.act.progressDismiss();
        m48999H2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z2 */
    public /* synthetic */ void m63533Z2(Bundle bundle) {
        m63562Q2();
        FeedModule.f39703d.m145587Pb().mo144673h(this, toolbar());
        bnl0.m105525M0(this.f41240h, false);
        C22421c.create(new C22421c.a() { // from class: l.vo20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184990a.m63567V2((gcg0) obj);
            }
        }).compose(psd0.m173592C()).subscribe(psd0.m173597H(new y20() { // from class: l.wo20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190007a.m63568W2(obj);
            }
        }, new y20() { // from class: l.xo20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f195552a.m63530X2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a3 */
    public /* synthetic */ void m63535a3() {
        if (NullChecker.m82486a(this.f41242j)) {
            this.f41242j.release();
        }
        l51.m152919y(new RunnableC11388a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c3 */
    public /* synthetic */ void m63538c3(C4470c c4470c) {
        if (c4470c == C4470c.f16267i && NullChecker.m82486a(this.f41243k)) {
            if (this.f41234F) {
                m63570d3();
            } else {
                this.f41243k.m67756N();
                this.f41240h.m63741h(this.f41255w);
            }
        }
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: r */
    private void m63551r() {
        bnl0.m105525M0(this.f41240h, true);
        Video video = this.f41241i;
        this.f41253u = video.duration;
        video.size = new Dimension();
        this.f41238f.setText(m63576j3(this.f41244l));
        vel0 vel0Var = this.f41230B;
        int i = vel0Var.f183810f;
        if (i == 90 || i == 270) {
            Dimension dimension = this.f41241i.size;
            dimension.width = vel0Var.f183808d;
            dimension.height = vel0Var.f183807c;
        } else {
            Dimension dimension2 = this.f41241i.size;
            dimension2.width = vel0Var.f183807c;
            dimension2.height = vel0Var.f183808d;
        }
        int iM105592y0 = bnl0.m105592y0() - (this.f41246n * 2);
        this.f41250r = iM105592y0;
        this.f41252t = iM105592y0;
        this.f41251s = (int) Math.ceil(iM105592y0 / this.f41254v);
        int iM105592y1 = this.f41252t > bnl0.m105592y0() ? bnl0.m105592y0() : this.f41252t;
        this.f41252t = iM105592y1;
        int i2 = this.f41246n;
        this.f41255w = i2;
        this.f41256x = i2;
        this.f41240h.m63739f(i2, iM105592y1, this.f41250r, new y20() { // from class: l.yo20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f200946a.m63573g3((Integer) obj);
            }
        });
        this.f41258z = new C11391d();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.act);
        linearLayoutManager.setOrientation(0);
        this.f41243k = m63563R2(this.f41237e);
        this.f41239g.setLayoutManager(linearLayoutManager);
        this.f41239g.setAdapter(this.f41258z);
    }

    /* JADX INFO: renamed from: K2 */
    public View m63559K2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dp20.m117371b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: M2 */
    public final void m63560M2() {
        act().progress(act().getString(R$string.f39832U2));
        C22421c.fromCallable(new Callable() { // from class: l.ap20
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f72685a.m63564S2();
            }
        }).compose(psd0.m173592C()).subscribe(psd0.m173597H(new y20() { // from class: l.bp20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f77725a.m63565T2((String) obj);
            }
        }, new y20() { // from class: l.po20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153359a.m63566U2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N2 */
    public final long m63561N2(int i) {
        return ((long) (((i - 1.0f) / this.f41251s) * this.f41230B.f183806b)) * 1000;
    }

    /* JADX INFO: renamed from: Q2 */
    public final void m63562Q2() {
        this.f41236d.setTitle(R$string.f39735E1);
        this.f41236d.setLeftIconAsBack(this.act);
        TextView textView = new TextView(this.act);
        textView.setText(actionItemPadding(string(R$string.f39921i)));
        textView.setTextColor(getResources().getColor(k9c0.f124521n));
        textView.setTextSize(18.0f);
        this.f41236d.m224835z(textView);
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.zo20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f205270a.m63569b3(view);
            }
        });
    }

    /* JADX INFO: renamed from: R2 */
    public final PlayerView m63563R2(ViewGroup viewGroup) {
        re80 re80Var = new re80();
        this.f41242j = re80Var;
        re80Var.m180984u(new x20() { // from class: l.qo20
            @Override // p153l.x20
            public final void call() {
                this.f158693a.m63570d3();
            }
        });
        this.f41242j.m180985v(new MediaPlayer.OnSeekCompleteListener() { // from class: l.ro20
            @Override // android.media.MediaPlayer.OnSeekCompleteListener
            public final void onSeekComplete(MediaPlayer mediaPlayer) {
                this.f164149a.m63571e3(mediaPlayer);
            }
        });
        final PlayerView playerView = new PlayerView(this.act);
        playerView.setProgressBarsEnabled(false);
        playerView.setBackgroundColor(getResources().getColor(k9c0.f124526p0));
        playerView.setPlayer(this.f41242j);
        viewGroup.addView(playerView);
        playerView.setVideo(this.f41241i);
        bnl0.m105525M0(playerView.f44450h, false);
        bnl0.m105525M0(playerView.f44444b, false);
        playerView.f44444b.setAlpha(0.0f);
        playerView.f44450h.setAlpha(0.0f);
        playerView.m67762x(new C11389b());
        playerView.post(new Runnable() { // from class: l.so20
            @Override // java.lang.Runnable
            public final void run() {
                this.f169827a.m63572f3(playerView);
            }
        });
        bnl0.m105591y(playerView, false);
        bnl0.m105591y(playerView.f44450h, false);
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
    /* JADX INFO: renamed from: S2 */
    public final /* synthetic */ String m63564S2() throws Exception {
        String absolutePath;
        FileOutputStream fileOutputStream;
        OutOfMemoryError e;
        IOException e2;
        FileOutputStream fileOutputStream2;
        File file = new File(this.f41231C);
        ?? r2 = 30;
        if (Build.VERSION.SDK_INT >= 30) {
            File fileM197287t0 = uqb0.m197287t0();
            String str = System.currentTimeMillis() + ".jpg";
            absolutePath = new File(fileM197287t0, str).getAbsolutePath();
            r2 = str;
        } else {
            absolutePath = file.getParentFile().getAbsolutePath() + File.separator + System.currentTimeMillis() + ".jpg";
        }
        Bitmap bitmap = this.f41243k.f44443a.getBitmap();
        ?? r1 = 0;
        try {
            try {
                fileOutputStream = new FileOutputStream(new File(absolutePath));
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 95, fileOutputStream);
                    fileOutputStream.flush();
                    fileOutputStream.getFD().sync();
                    boolean zM82486a = NullChecker.m82486a(fileOutputStream);
                    r2 = fileOutputStream;
                    fileOutputStream2 = fileOutputStream;
                    if (zM82486a) {
                        try {
                            fileOutputStream2.close();
                            r2 = fileOutputStream2;
                        } catch (IOException e3) {
                            CrashHelper.m82479c(e3);
                            r2 = fileOutputStream2;
                        }
                    }
                } catch (IOException e4) {
                    e2 = e4;
                    CrashHelper.m82479c(e2);
                    boolean zM82486a2 = NullChecker.m82486a(fileOutputStream);
                    r2 = fileOutputStream;
                    fileOutputStream2 = fileOutputStream;
                    if (zM82486a2) {
                        fileOutputStream2.close();
                        r2 = fileOutputStream2;
                    }
                } catch (OutOfMemoryError e5) {
                    e = e5;
                    CrashHelper.m82479c(e);
                    boolean zM82486a3 = NullChecker.m82486a(fileOutputStream);
                    r2 = fileOutputStream;
                    fileOutputStream2 = fileOutputStream;
                    if (zM82486a3) {
                        fileOutputStream2.close();
                        r2 = fileOutputStream2;
                    }
                }
            } catch (Throwable th) {
                th = th;
                r1 = r2;
                if (NullChecker.m82486a(r1)) {
                    try {
                        r1.close();
                    } catch (IOException e6) {
                        CrashHelper.m82479c(e6);
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
            if (NullChecker.m82486a(r1)) {
                r1.close();
            }
            bitmap.recycle();
            throw th;
        }
        bitmap.recycle();
        return absolutePath;
    }

    /* JADX INFO: renamed from: T2 */
    public final /* synthetic */ void m63565T2(String str) {
        this.act.progressDismiss();
        Intent intent = new Intent();
        intent.putExtra("framePath", str);
        setResult(-1, intent);
        m48999H2();
    }

    /* JADX INFO: renamed from: U2 */
    public final /* synthetic */ void m63566U2(Throwable th) {
        this.act.progressDismiss();
        m48999H2();
    }

    /* JADX INFO: renamed from: V2 */
    public final /* synthetic */ void m63567V2(gcg0 gcg0Var) {
        Video video = this.f41241i;
        String str = video.url;
        this.f41231C = str;
        video.url = str;
        this.f41230B = new vel0(str);
        String strM163312b = niw.m163312b(this.f41241i.url + this.f41241i.duration);
        this.f41232D = strM163312b;
        this.f41233E = ecj.m120378L(strM163312b);
        VideoDataRetrieverBySoft videoDataRetrieverBySoft = new VideoDataRetrieverBySoft();
        this.f41229A = videoDataRetrieverBySoft;
        videoDataRetrieverBySoft.init(str);
        gcg0Var.onNext(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: W2 */
    public final /* synthetic */ void m63568W2(Object obj) {
        m63551r();
        this.act.progressDismiss();
    }

    /* JADX INFO: renamed from: b3 */
    public final /* synthetic */ void m63569b3(View view) {
        if (this.f41234F) {
            view.setEnabled(false);
            m63560M2();
        }
    }

    /* JADX INFO: renamed from: e3 */
    public final /* synthetic */ void m63571e3(MediaPlayer mediaPlayer) {
        this.f41253u = mediaPlayer.getDuration();
        this.f41243k.f44444b.setAlpha(0);
        this.f41243k.f44450h.setAlpha(0.0f);
    }

    /* JADX INFO: renamed from: f3 */
    public final /* synthetic */ void m63572f3(PlayerView playerView) {
        if (lifecycle_() == C4470c.f16267i) {
            playerView.m67756N();
        }
    }

    /* JADX INFO: renamed from: g3 */
    public final /* synthetic */ void m63573g3(Integer num) {
        long jIntValue = (long) ((num.intValue() / this.f41252t) * this.f41230B.f183806b);
        this.f41244l = jIntValue;
        this.f41238f.setText(m63576j3(jIntValue));
        long j = this.f41244l;
        float f = j;
        float f2 = this.f41253u;
        if (f >= f2) {
            j = (long) (f2 - 1.0f);
        }
        this.f41244l = j;
        m63570d3();
    }

    /* JADX INFO: renamed from: h3 */
    public void m63574h3(Integer num, VDraweeView vDraweeView) {
        l51.m152919y(new C11390c(vDraweeView, num));
    }

    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final void m63570d3() {
        this.f41242j.m180983t((int) this.f41244l);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m63559K2(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.mIfInNewUi1ShouldUseThemNewUI2 = FeedModule.f39703d.m145587Pb().mo144674i();
        creates(new y20() { // from class: l.oo20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f148283a.m63533Z2((Bundle) obj);
            }
        }, new x20() { // from class: l.to20
            @Override // p153l.x20
            public final void call() {
                this.f175354a.m63535a3();
            }
        });
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.uo20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f180012a.m63538c3((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j3 */
    public String m63576j3(long j) {
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

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        Video video = (Video) getIntent().getSerializableExtra("media");
        this.f41241i = video;
        if (video == null) {
            m48999H2();
        }
        setSwipeBackEnable(false);
        super.preCreateView(bundle);
    }
}
