package com.p046p1.mobile.putong.feed.newui.mediapicker;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.android.media.TTFFmpegCommand;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.newui.mediapicker.NewCaptionVideoView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VListCell;
import p149l.b5c0;
import p149l.c40;
import p149l.e30;
import p149l.e51;
import p149l.f3c0;
import p149l.fyl;
import p149l.lsi0;
import p149l.mkd0;
import p149l.od80;
import p149l.oe40;
import p149l.oyx;
import p149l.qib0;
import p149l.r5l0;
import p149l.rhi;
import p149l.s5l0;
import p149l.t100;
import p149l.u2h;
import p149l.xdl0;
import p149l.z3g0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class NewCaptionVideoView extends VFrame {

    /* JADX INFO: renamed from: g */
    public static int f40476g = t100.m186890d(156.0f);

    /* JADX INFO: renamed from: a */
    public VDraweeView f40477a;

    /* JADX INFO: renamed from: b */
    public VImage f40478b;

    /* JADX INFO: renamed from: c */
    public View f40479c;

    /* JADX INFO: renamed from: d */
    public ImageView f40480d;

    /* JADX INFO: renamed from: e */
    public ImageView f40481e;

    /* JADX INFO: renamed from: f */
    public c40 f40482f;

    public NewCaptionVideoView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m62468B(Video video, z3g0 z3g0Var) {
        z3g0Var.m132487l(video);
        s5l0 s5l0Var = new s5l0(new r5l0(rhi.m179382z(video.url)), false, false);
        Picture picture = video.cover;
        if (picture == null || TextUtils.isEmpty(picture.url)) {
            String strM166732f = oyx.m166732f(video);
            video.cover = new Picture();
            try {
                File fileM182353g = s5l0.m182353g(video.url, s5l0Var.m182362k()[0], s5l0Var.m182362k()[1], strM166732f);
                if (NullChecker.m81303a(fileM182353g)) {
                    video.cover.url = rhi.m179355B(fileM182353g.getAbsolutePath());
                } else {
                    s5l0Var = m62470E(video, s5l0Var, strM166732f);
                }
            } catch (IOException e) {
                CrashHelper.m81296c(e);
                s5l0Var = m62470E(video, s5l0Var, strM166732f);
            }
            video.cover.size = new Dimension(s5l0Var.m182362k());
            video.cover.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
            qib0.f154691G.m102377x0(video.url);
        }
        z3g0Var.m132487l(video);
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: E */
    public static s5l0 m62470E(Video video, s5l0 s5l0Var, String str) {
        try {
            video.cover.url = rhi.m179355B(s5l0.m182352d(str, video.url, 0));
            return s5l0Var;
        } catch (TTFFmpegCommand.FFmpegCommandException e) {
            if (!e.getMessage().contains("TTFFmpeg command failed with code 1 command")) {
                return s5l0Var;
            }
            File file = new File(rhi.m179382z(video.url));
            File file2 = new File(qib0.m174833t0(), "__copy__" + file.getName());
            if (!rhi.m179361e(file.getAbsolutePath(), file2.getAbsolutePath())) {
                return s5l0Var;
            }
            video.cover.url = rhi.m179355B(s5l0.m182352d(str, file2.getAbsolutePath(), 0));
            video.url = file2.getAbsolutePath();
            return new s5l0(new r5l0(rhi.m179382z(video.url)), false, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m62471F(View view) {
        this.f40482f.m105113b();
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m62472p(PutongAct putongAct, ArrayList arrayList, View view) {
        zvf0.m220396r("e_pick_cover", "p_moment_post");
        putongAct.hideInput();
        oe40.m163856p0(putongAct, (Media) arrayList.get(0));
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m62478G(ArrayList arrayList, int i, od80 od80Var, fyl fylVar, VListCell vListCell, VListCell.C22545a c22545a, int i2) {
        if (arrayList.size() >= i + 1) {
            arrayList.remove(i);
            od80Var.notifyDataSetChanged();
            fylVar.mo62885a();
        }
        this.f40482f.m105113b();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m62479K(View view, final ArrayList arrayList, final int i, final od80 od80Var, final fyl fylVar) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(getResources().getString(R$string.f39066h));
        c40.C16057b c16057b = new c40.C16057b(view.getContext());
        c16057b.m105155H(R$string.f39017a).m105168U(new View.OnClickListener() { // from class: l.ri20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f159514a.m62471F(view2);
            }
        }).m105164Q(arrayList2).m105169V(new c40.InterfaceC16059d() { // from class: l.si20
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i2) {
                this.f164671a.m62478G(arrayList, i, od80Var, fylVar, vListCell, c22545a, i2);
            }
        });
        c40 c40VarM105153F = c16057b.m105153F();
        this.f40482f = c40VarM105153F;
        c40VarM105153F.m105117f();
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m62480L(PutongAct putongAct, final ArrayList arrayList, final int i, final od80 od80Var, final fyl fylVar, final View view) {
        putongAct.hideInput();
        if (NullChecker.m81303a(this.f40482f)) {
            this.f40482f.m105113b();
        }
        e51.m114743H(putongAct, new Runnable() { // from class: l.qi20
            @Override // java.lang.Runnable
            public final void run() {
                this.f154642a.m62479K(view, arrayList, i, od80Var, fylVar);
            }
        }, 400L);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m62481M(Video video) {
        if (!NullChecker.m81303a(video.cover) || TextUtils.isEmpty(video.cover.url)) {
            xdl0.m208345M0(this.f40479c, true);
        } else {
            xdl0.m208345M0(this.f40479c, false);
            qib0.f154691G.m102367m0(this.f40477a, video.cover.url);
        }
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m62482N(ArrayList arrayList, Video video, od80 od80Var, fyl fylVar, Throwable th) {
        lsi0.m151578h(R$string.f39146s4);
        xdl0.m208345M0(this.f40478b, true);
        xdl0.m208345M0(this.f40479c, false);
        this.f40478b.setImageResource(f3c0.f94527g6);
        if (arrayList.remove(video)) {
            od80Var.notifyDataSetChanged();
            fylVar.mo62885a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    /* JADX INFO: renamed from: O */
    public final void m62483O(Video video) {
        Dimension dimension;
        int i;
        Picture picture = video.cover;
        if (NullChecker.m81303a(picture) && NullChecker.m81303a(picture.size)) {
            dimension = picture.size;
            if (dimension.width <= 0) {
                if (NullChecker.m81303a(video.size)) {
                    dimension = video.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(360, 640);
                    }
                } else {
                    dimension = new Dimension(360, 640);
                }
            }
        } else if (NullChecker.m81303a(video.size)) {
            dimension = video.size;
            if (dimension.width <= 0) {
                dimension = new Dimension(360, 640);
            }
        } else {
            dimension = new Dimension(360, 640);
        }
        float f = dimension.width / dimension.height;
        int i2 = f40476g;
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
    public void m62484P(final PutongAct putongAct, final fyl fylVar, final ArrayList<Media> arrayList, final Video video, final od80 od80Var, final int i) {
        xdl0.m208329E0(u2h.m191499h() ? this.f40481e : this.f40480d, new View.OnClickListener() { // from class: l.li20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f128158a.m62480L(putongAct, arrayList, i, od80Var, fylVar, view);
            }
        });
        qib0.f154691G.m184725o(this.f40477a);
        m62483O(video);
        this.f40477a.setOnClickListener(new View.OnClickListener() { // from class: l.mi20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewCaptionVideoView.m62472p(putongAct, arrayList, view);
            }
        });
        od80Var.mo67374c(putongAct, C22306c.create(new C22306c.a() { // from class: l.ni20
            @Override // p149l.e30
            public final void call(Object obj) {
                NewCaptionVideoView.m62468B(video, (z3g0) obj);
            }
        }).compose(mkd0.m154951C())).subscribe(mkd0.m154956H(new e30() { // from class: l.oi20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144087a.m62481M((Video) obj);
            }
        }, new e30() { // from class: l.pi20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f149071a.m62482N(arrayList, video, od80Var, fylVar, (Throwable) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f40477a = (VDraweeView) findViewById(b5c0.f73589m0);
        this.f40478b = (VImage) findViewById(b5c0.f73602q1);
        this.f40479c = findViewById(b5c0.f73485H0);
        this.f40480d = (ImageView) findViewById(b5c0.f73478F);
        this.f40481e = (ImageView) findViewById(b5c0.f73481G);
        xdl0.m208344M(this.f40480d, !u2h.m191499h());
        xdl0.m208344M(this.f40481e, u2h.m191499h());
    }

    public NewCaptionVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewCaptionVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
