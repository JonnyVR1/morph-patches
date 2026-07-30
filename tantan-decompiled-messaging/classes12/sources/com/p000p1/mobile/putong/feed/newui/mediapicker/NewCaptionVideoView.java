package com.p000p1.mobile.putong.feed.newui.mediapicker;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p000p1.mobile.putong.data.Dimension;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.newui.mediapicker.NewCaptionVideoView;
import com.p1.mobile.android.media.TTFFmpegCommand;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import l.c40;
import l.e30;
import l.e51;
import l.lsi0;
import l.mkd0;
import l.oyx;
import l.qib0;
import l.r5l0;
import l.rhi;
import l.s5l0;
import l.t100;
import l.xdl0;
import l.z3g0;
import l.zvf0;
import p007l.b5c0;
import p007l.f3c0;
import p007l.fyl;
import p007l.od80;
import p007l.oe40;
import p007l.u2h;
import rx.c;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VListCell;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class NewCaptionVideoView extends VFrame {

    /* JADX INFO: renamed from: g */
    public static int f1937g = t100.d(156.0f);

    /* JADX INFO: renamed from: a */
    public VDraweeView f1938a;

    /* JADX INFO: renamed from: b */
    public VImage f1939b;

    /* JADX INFO: renamed from: c */
    public View f1940c;

    /* JADX INFO: renamed from: d */
    public ImageView f1941d;

    /* JADX INFO: renamed from: e */
    public ImageView f1942e;

    /* JADX INFO: renamed from: f */
    public c40 f1943f;

    public NewCaptionVideoView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m3470B(Video video, z3g0 z3g0Var) {
        z3g0Var.onNext(video);
        s5l0 s5l0Var = new s5l0(new r5l0(rhi.z(video.url)), false, false);
        Picture picture = video.cover;
        if (picture == null || TextUtils.isEmpty(picture.url)) {
            String strF = oyx.f(video);
            video.cover = new Picture();
            try {
                File fileG = s5l0.g(video.url, s5l0Var.k()[0], s5l0Var.k()[1], strF);
                if (NullChecker.a(fileG)) {
                    video.cover.url = rhi.B(fileG.getAbsolutePath());
                } else {
                    s5l0Var = m3472E(video, s5l0Var, strF);
                }
            } catch (IOException e) {
                CrashHelper.c(e);
                s5l0Var = m3472E(video, s5l0Var, strF);
            }
            video.cover.size = new Dimension(s5l0Var.k());
            video.cover.mediaType = "image/jpeg";
            qib0.G.x0(video.url);
        }
        z3g0Var.onNext(video);
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: E */
    public static s5l0 m3472E(Video video, s5l0 s5l0Var, String str) {
        try {
            video.cover.url = rhi.B(s5l0.d(str, video.url, 0));
            return s5l0Var;
        } catch (TTFFmpegCommand.FFmpegCommandException e) {
            if (!e.getMessage().contains("TTFFmpeg command failed with code 1 command")) {
                return s5l0Var;
            }
            File file = new File(rhi.z(video.url));
            File file2 = new File(qib0.t0(), "__copy__" + file.getName());
            if (!rhi.e(file.getAbsolutePath(), file2.getAbsolutePath())) {
                return s5l0Var;
            }
            video.cover.url = rhi.B(s5l0.d(str, file2.getAbsolutePath(), 0));
            video.url = file2.getAbsolutePath();
            return new s5l0(new r5l0(rhi.z(video.url)), false, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m3473F(View view) {
        this.f1943f.b();
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m3474p(PutongAct putongAct, ArrayList arrayList, View view) {
        zvf0.r("e_pick_cover", "p_moment_post");
        putongAct.hideInput();
        oe40.m12593p0(putongAct, (Media) arrayList.get(0));
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m3480G(ArrayList arrayList, int i, od80 od80Var, fyl fylVar, VListCell vListCell, VListCell.a aVar, int i2) {
        if (arrayList.size() >= i + 1) {
            arrayList.remove(i);
            od80Var.notifyDataSetChanged();
            fylVar.mo3893a();
        }
        this.f1943f.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m3481K(View view, final ArrayList arrayList, final int i, final od80 od80Var, final fyl fylVar) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(getResources().getString(R$string.f527h));
        c40.b bVar = new c40.b(view.getContext());
        bVar.H(R$string.f478a).U(new View.OnClickListener() { // from class: l.ri20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f12650a.m3473F(view2);
            }
        }).Q(arrayList2).V(new c40.d() { // from class: l.si20
            /* JADX INFO: renamed from: a */
            public final void m14224a(VListCell vListCell, VListCell.a aVar, int i2) {
                this.f12959a.m3480G(arrayList, i, od80Var, fylVar, vListCell, aVar, i2);
            }
        });
        c40 c40VarF = bVar.F();
        this.f1943f = c40VarF;
        c40VarF.f();
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m3482L(PutongAct putongAct, final ArrayList arrayList, final int i, final od80 od80Var, final fyl fylVar, final View view) {
        putongAct.hideInput();
        if (NullChecker.a(this.f1943f)) {
            this.f1943f.b();
        }
        e51.H(putongAct, new Runnable() { // from class: l.qi20
            @Override // java.lang.Runnable
            public final void run() {
                this.f12244a.m3481K(view, arrayList, i, od80Var, fylVar);
            }
        }, 400L);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m3483M(Video video) {
        if (!NullChecker.a(video.cover) || TextUtils.isEmpty(video.cover.url)) {
            xdl0.M0(this.f1940c, true);
        } else {
            xdl0.M0(this.f1940c, false);
            qib0.G.m0(this.f1938a, video.cover.url);
        }
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m3484N(ArrayList arrayList, Video video, od80 od80Var, fyl fylVar, Throwable th) {
        lsi0.h(R$string.f607s4);
        xdl0.M0(this.f1939b, true);
        xdl0.M0(this.f1940c, false);
        this.f1939b.setImageResource(f3c0.f7810g6);
        if (arrayList.remove(video)) {
            od80Var.notifyDataSetChanged();
            fylVar.mo3893a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O */
    public final void m3485O(Video video) {
        Dimension dimension;
        int i;
        Picture picture = video.cover;
        if (NullChecker.a(picture) && NullChecker.a(picture.size)) {
            dimension = picture.size;
            if (dimension.width <= 0) {
                if (NullChecker.a(video.size)) {
                    dimension = video.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(360, 640);
                    }
                } else {
                    dimension = new Dimension(360, 640);
                }
            }
        } else if (NullChecker.a(video.size)) {
            dimension = video.size;
            if (dimension.width <= 0) {
                dimension = new Dimension(360, 640);
            }
        } else {
            dimension = new Dimension(360, 640);
        }
        float f = dimension.width / dimension.height;
        int i2 = f1937g;
        if (f <= 0.83f) {
            i2 = (i2 * 4) / 3;
            i = i2;
        } else {
            i = f >= 1.2f ? (i2 * 4) / 3 : i2;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: P */
    public void m3486P(final PutongAct putongAct, final fyl fylVar, final ArrayList<Media> arrayList, final Video video, final od80 od80Var, final int i) {
        xdl0.E0(u2h.m14723h() ? this.f1942e : this.f1941d, new View.OnClickListener() { // from class: l.li20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10043a.m3482L(putongAct, arrayList, i, od80Var, fylVar, view);
            }
        });
        qib0.G.o(this.f1938a);
        m3485O(video);
        this.f1938a.setOnClickListener(new View.OnClickListener() { // from class: l.mi20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewCaptionVideoView.m3474p(putongAct, arrayList, view);
            }
        });
        od80Var.c(putongAct, c.create(new c.a() { // from class: l.ni20
            public final void call(Object obj) {
                NewCaptionVideoView.m3470B(video, (z3g0) obj);
            }
        }).compose(mkd0.C())).subscribe(mkd0.H(new e30() { // from class: l.oi20
            public final void call(Object obj) {
                this.f11485a.m3483M((Video) obj);
            }
        }, new e30() { // from class: l.pi20
            public final void call(Object obj) {
                this.f11843a.m3484N(arrayList, video, od80Var, fylVar, (Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        this.f1938a = findViewById(b5c0.f6070m0);
        this.f1939b = findViewById(b5c0.f6083q1);
        this.f1940c = findViewById(b5c0.f5966H0);
        this.f1941d = (ImageView) findViewById(b5c0.f5959F);
        this.f1942e = (ImageView) findViewById(b5c0.f5962G);
        xdl0.M(this.f1941d, !u2h.m14723h());
        xdl0.M(this.f1942e, u2h.m14723h());
    }

    public NewCaptionVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewCaptionVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
