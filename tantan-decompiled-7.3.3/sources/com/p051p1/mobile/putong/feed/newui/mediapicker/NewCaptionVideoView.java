package com.p051p1.mobile.putong.feed.newui.mediapicker;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.android.media.TTFFmpegCommand;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.newui.mediapicker.NewCaptionVideoView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VListCell;
import p153l.bnl0;
import p153l.cn40;
import p153l.gcg0;
import p153l.hdc0;
import p153l.i4g0;
import p153l.j4h;
import p153l.l51;
import p153l.l7y;
import p153l.lbc0;
import p153l.o1j0;
import p153l.oki;
import p153l.psd0;
import p153l.qa00;
import p153l.uqb0;
import p153l.vel0;
import p153l.w30;
import p153l.wel0;
import p153l.xl80;
import p153l.y0m;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class NewCaptionVideoView extends VFrame {

    /* JADX INFO: renamed from: g */
    public static int f41324g = qa00.m175859d(156.0f);

    /* JADX INFO: renamed from: a */
    public VDraweeView f41325a;

    /* JADX INFO: renamed from: b */
    public VImage f41326b;

    /* JADX INFO: renamed from: c */
    public View f41327c;

    /* JADX INFO: renamed from: d */
    public ImageView f41328d;

    /* JADX INFO: renamed from: e */
    public ImageView f41329e;

    /* JADX INFO: renamed from: f */
    public w30 f41330f;

    public NewCaptionVideoView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m63651B(Video video, gcg0 gcg0Var) {
        gcg0Var.m137019l(video);
        wel0 wel0Var = new wel0(new vel0(oki.m168038z(video.url)), false, false);
        Picture picture = video.cover;
        if (picture == null || TextUtils.isEmpty(picture.url)) {
            String strM153154f = l7y.m153154f(video);
            video.cover = new Picture();
            try {
                File fileM206010g = wel0.m206010g(video.url, wel0Var.m206019k()[0], wel0Var.m206019k()[1], strM153154f);
                if (NullChecker.m82486a(fileM206010g)) {
                    video.cover.url = oki.m168011B(fileM206010g.getAbsolutePath());
                } else {
                    wel0Var = m63653E(video, wel0Var, strM153154f);
                }
            } catch (IOException e) {
                CrashHelper.m82479c(e);
                wel0Var = m63653E(video, wel0Var, strM153154f);
            }
            video.cover.size = new Dimension(wel0Var.m206019k());
            video.cover.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
            uqb0.f180374G.m127160x0(video.url);
        }
        gcg0Var.m137019l(video);
        gcg0Var.onCompleted();
    }

    /* JADX INFO: renamed from: E */
    public static wel0 m63653E(Video video, wel0 wel0Var, String str) {
        try {
            video.cover.url = oki.m168011B(wel0.m206009d(str, video.url, 0));
            return wel0Var;
        } catch (TTFFmpegCommand.FFmpegCommandException e) {
            if (!e.getMessage().contains("TTFFmpeg command failed with code 1 command")) {
                return wel0Var;
            }
            File file = new File(oki.m168038z(video.url));
            File file2 = new File(uqb0.m197287t0(), "__copy__" + file.getName());
            if (!oki.m168017e(file.getAbsolutePath(), file2.getAbsolutePath())) {
                return wel0Var;
            }
            video.cover.url = oki.m168011B(wel0.m206009d(str, file2.getAbsolutePath(), 0));
            video.url = file2.getAbsolutePath();
            return new wel0(new vel0(oki.m168038z(video.url)), false, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m63654F(View view) {
        this.f41330f.m204614b();
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m63655p(PutongAct putongAct, ArrayList arrayList, View view) {
        i4g0.m138520r("e_pick_cover", "p_moment_post");
        putongAct.hideInput();
        cn40.m111406p0(putongAct, (Media) arrayList.get(0));
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m63661G(ArrayList arrayList, int i, xl80 xl80Var, y0m y0mVar, VListCell vListCell, VListCell.C22660a c22660a, int i2) {
        if (arrayList.size() >= i + 1) {
            arrayList.remove(i);
            xl80Var.notifyDataSetChanged();
            y0mVar.mo64068a();
        }
        this.f41330f.m204614b();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m63662K(View view, final ArrayList arrayList, final int i, final xl80 xl80Var, final y0m y0mVar) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(getResources().getString(R$string.f39914h));
        w30.C21001b c21001b = new w30.C21001b(view.getContext());
        c21001b.m204656H(R$string.f39865a).m204669U(new View.OnClickListener() { // from class: l.br20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f77975a.m63654F(view2);
            }
        }).m204665Q(arrayList2).m204670V(new w30.InterfaceC21003d() { // from class: l.cr20
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i2) {
                this.f83277a.m63661G(arrayList, i, xl80Var, y0mVar, vListCell, c22660a, i2);
            }
        });
        w30 w30VarM204654F = c21001b.m204654F();
        this.f41330f = w30VarM204654F;
        w30VarM204654F.m204618f();
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m63663L(PutongAct putongAct, final ArrayList arrayList, final int i, final xl80 xl80Var, final y0m y0mVar, final View view) {
        putongAct.hideInput();
        if (NullChecker.m82486a(this.f41330f)) {
            this.f41330f.m204614b();
        }
        l51.m152888H(putongAct, new Runnable() { // from class: l.ar20
            @Override // java.lang.Runnable
            public final void run() {
                this.f72903a.m63662K(view, arrayList, i, xl80Var, y0mVar);
            }
        }, 400L);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m63664M(Video video) {
        if (!NullChecker.m82486a(video.cover) || TextUtils.isEmpty(video.cover.url)) {
            bnl0.m105525M0(this.f41327c, true);
        } else {
            bnl0.m105525M0(this.f41327c, false);
            uqb0.f180374G.m127150m0(this.f41325a, video.cover.url);
        }
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m63665N(ArrayList arrayList, Video video, xl80 xl80Var, y0m y0mVar, Throwable th) {
        o1j0.m165634h(R$string.f39994s4);
        bnl0.m105525M0(this.f41326b, true);
        bnl0.m105525M0(this.f41327c, false);
        this.f41326b.setImageResource(lbc0.f131045g6);
        if (arrayList.remove(video)) {
            xl80Var.notifyDataSetChanged();
            y0mVar.mo64068a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    /* JADX INFO: renamed from: O */
    public final void m63666O(Video video) {
        Dimension dimension;
        int i;
        Picture picture = video.cover;
        if (NullChecker.m82486a(picture) && NullChecker.m82486a(picture.size)) {
            dimension = picture.size;
            if (dimension.width <= 0) {
                if (NullChecker.m82486a(video.size)) {
                    dimension = video.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(360, 640);
                    }
                } else {
                    dimension = new Dimension(360, 640);
                }
            }
        } else if (NullChecker.m82486a(video.size)) {
            dimension = video.size;
            if (dimension.width <= 0) {
                dimension = new Dimension(360, 640);
            }
        } else {
            dimension = new Dimension(360, 640);
        }
        float f = dimension.width / dimension.height;
        int i2 = f41324g;
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
    public void m63667P(final PutongAct putongAct, final y0m y0mVar, final ArrayList<Media> arrayList, final Video video, final xl80 xl80Var, final int i) {
        bnl0.m105509E0(j4h.m143424h() ? this.f41329e : this.f41328d, new View.OnClickListener() { // from class: l.vq20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f185319a.m63663L(putongAct, arrayList, i, xl80Var, y0mVar, view);
            }
        });
        uqb0.f180374G.m98798o(this.f41325a);
        m63666O(video);
        this.f41325a.setOnClickListener(new View.OnClickListener() { // from class: l.wq20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewCaptionVideoView.m63655p(putongAct, arrayList, view);
            }
        });
        xl80Var.mo68557c(putongAct, C22421c.create(new C22421c.a() { // from class: l.xq20
            @Override // p153l.y20
            public final void call(Object obj) {
                NewCaptionVideoView.m63651B(video, (gcg0) obj);
            }
        }).compose(psd0.m173592C())).subscribe(psd0.m173597H(new y20() { // from class: l.yq20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201147a.m63664M((Video) obj);
            }
        }, new y20() { // from class: l.zq20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205561a.m63665N(arrayList, video, xl80Var, y0mVar, (Throwable) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f41325a = (VDraweeView) findViewById(hdc0.f108942m0);
        this.f41326b = (VImage) findViewById(hdc0.f108955q1);
        this.f41327c = findViewById(hdc0.f108838H0);
        this.f41328d = (ImageView) findViewById(hdc0.f108831F);
        this.f41329e = (ImageView) findViewById(hdc0.f108834G);
        bnl0.m105524M(this.f41328d, !j4h.m143424h());
        bnl0.m105524M(this.f41329e, j4h.m143424h());
    }

    public NewCaptionVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewCaptionVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
