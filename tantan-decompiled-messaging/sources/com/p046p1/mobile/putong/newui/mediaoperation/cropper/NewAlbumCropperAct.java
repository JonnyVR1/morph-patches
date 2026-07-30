package com.p046p1.mobile.putong.newui.mediaoperation.cropper;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.cropiwa.CropIwaView;
import com.p046p1.mobile.android.p048ui.cropiwa.TooLargeException;
import com.p046p1.mobile.android.p048ui.cropiwa.config.InitialPosition;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.common.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.VText;
import p149l.bvb;
import p149l.c4g0;
import p149l.d30;
import p149l.e30;
import p149l.e51;
import p149l.fub;
import p149l.j11;
import p149l.k9j;
import p149l.lsi0;
import p149l.mkd0;
import p149l.qub;
import p149l.t100;
import p149l.uf20;
import p149l.v0c0;
import p149l.w9j;
import p149l.wc40;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class NewAlbumCropperAct extends PutongAct {

    /* JADX INFO: renamed from: s */
    public static int f53981s = 1080;

    /* JADX INFO: renamed from: t */
    public static int f53982t = 1080;

    /* JADX INFO: renamed from: u */
    public static int f53983u = xdl0.m208412y0() - t100.m186890d(56.0f);

    /* JADX INFO: renamed from: c */
    public CropIwaView f53984c;

    /* JADX INFO: renamed from: d */
    public VProgressBar f53985d;

    /* JADX INFO: renamed from: e */
    public ImageView f53986e;

    /* JADX INFO: renamed from: f */
    public VLinear f53987f;

    /* JADX INFO: renamed from: g */
    public ImageView f53988g;

    /* JADX INFO: renamed from: h */
    public VText f53989h;

    /* JADX INFO: renamed from: i */
    public ImageView f53990i;

    /* JADX INFO: renamed from: j */
    public String f53991j;

    /* JADX INFO: renamed from: k */
    public int f53992k = 1;

    /* JADX INFO: renamed from: l */
    public int f53993l = 1;

    /* JADX INFO: renamed from: m */
    public float f53994m;

    /* JADX INFO: renamed from: n */
    public int f53995n;

    /* JADX INFO: renamed from: o */
    public boolean f53996o;

    /* JADX INFO: renamed from: p */
    public boolean f53997p;

    /* JADX INFO: renamed from: q */
    public c4g0 f53998q;

    /* JADX INFO: renamed from: r */
    public View f53999r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.mediaoperation.cropper.NewAlbumCropperAct$a */
    public class C13065a implements fub.InterfaceC16922a {
        public C13065a() {
        }

        @Override // p149l.fub.InterfaceC16922a
        /* JADX INFO: renamed from: a */
        public void mo21044a(Uri uri, Bitmap bitmap) {
            xdl0.m208344M(NewAlbumCropperAct.this.f53985d, false);
        }

        @Override // p149l.fub.InterfaceC16922a
        /* JADX INFO: renamed from: b */
        public void mo21045b(Throwable th) {
            xdl0.m208344M(NewAlbumCropperAct.this.f53985d, false);
            if (th instanceof TooLargeException) {
                lsi0.m151578h(R$string.f17365Q);
            } else {
                lsi0.m151578h(R$string.f17313D);
            }
            NewAlbumCropperAct.this.m47815F2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A2 */
    public /* synthetic */ void m78889A2() {
        progressDismiss();
        lsi0.m151578h(R$string.f17317E);
    }

    /* JADX INFO: renamed from: l2 */
    public static Intent m78902l2(Act act, String str, float f, int i) {
        Intent intent = new Intent(act, (Class<?>) NewAlbumCropperAct.class);
        intent.putExtra("IMAGE_URI", str);
        intent.putExtra("CROP_PROPORTION", f);
        intent.putExtra("OVERLAY_WIDTH", i);
        return intent;
    }

    /* JADX INFO: renamed from: m2 */
    public static Intent m78903m2(Act act, String str, float f, int i, boolean z) {
        Intent intent = new Intent(act, (Class<?>) NewAlbumCropperAct.class);
        intent.putExtra("IMAGE_URI", str);
        intent.putExtra("CROP_PROPORTION", f);
        intent.putExtra("OVERLAY_WIDTH", i);
        intent.putExtra("CROPP_INGNEWS_TYLE", z);
        return intent;
    }

    /* JADX INFO: renamed from: n2 */
    private void m78904n2() {
        this.f53984c.m21032n(m78906p2());
    }

    /* JADX INFO: renamed from: o2 */
    private void m78905o2() {
        if (e51.m114773x() || e51.m114772w()) {
            xdl0.m208376g0(this.f53999r);
        }
    }

    /* JADX INFO: renamed from: p2 */
    private qub m78906p2() {
        qub.C19581a c19581a = new qub.C19581a(Uri.fromFile(k9j.m145083O(wc40.m202626c() ? "webp" : "jpg")));
        c19581a.m176593b(wc40.m202626c() ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG);
        if (wc40.m202626c()) {
            c19581a.m176596e(new w9j() { // from class: l.kf20
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Integer.valueOf(pgm.m168759a((Bitmap) obj));
                }
            });
        }
        return c19581a.m176595d(1080, 1080).m176594c(100).m176592a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q2 */
    public /* synthetic */ void m78907q2(View view) {
        mkd0.m154992z(this.f53998q);
        if (this.f53984c.m21036r()) {
            progress(R$string.f17389W);
            m78904n2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u2 */
    public /* synthetic */ void m78908u2(View view) {
        m47815F2();
        this.f53984c.m21043y();
    }

    /* JADX INFO: renamed from: B2 */
    public final /* synthetic */ void m78909B2() {
        if (this.f53989h.isEnabled()) {
            return;
        }
        this.f53989h.setTextColor(getResources().getColor(v0c0.f179109p));
        xdl0.m208411y(this.f53989h, true);
    }

    /* JADX INFO: renamed from: C2 */
    public final void m78910C2(Uri uri) {
        progressDismiss();
        Intent intent = new Intent();
        intent.putExtra("path", uri.getPath());
        setResult(-1, intent);
        m47815F2();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM78911k2 = m78911k2(layoutInflater, viewGroup);
        this.f53999r = viewM78911k2;
        return viewM78911k2;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.mIfInNewUi1ShouldUseThemNewUI2 = true;
        creates(new e30() { // from class: l.if20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f112956a.m78913s2((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public View m78911k2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return uf20.m193371b(this, layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_camera_album_cut_picture";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        setTransparentStatusBar();
        setSwipeBackEnable(false);
        this.f53991j = getIntent().getStringExtra("IMAGE_URI");
        this.f53994m = getIntent().getFloatExtra("CROP_PROPORTION", 0.0f);
        this.f53995n = getIntent().getIntExtra("OVERLAY_WIDTH", f53983u);
        this.f53997p = getIntent().getBooleanExtra("CROPP_INGNEWS_TYLE", false);
        if (this.f53995n <= 0) {
            this.f53995n = f53983u;
        }
        float f = this.f53994m;
        if (f > 0.0f) {
            this.f53992k = (int) (f * 10.0f);
            this.f53993l = 10;
            this.f53996o = true;
        }
    }

    /* JADX INFO: renamed from: r2 */
    public final /* synthetic */ void m78912r2(View view) {
        this.f53984c.m21042x();
    }

    /* JADX INFO: renamed from: s2 */
    public final /* synthetic */ void m78913s2(Bundle bundle) {
        final boolean z = false;
        xdl0.m208344M(this.f53986e, false);
        this.f53987f.setVisibility(8);
        m78905o2();
        this.f53990i.setOnClickListener(new View.OnClickListener() { // from class: l.lf20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f127827a.m78907q2(view);
            }
        });
        this.f53988g.setOnClickListener(new View.OnClickListener() { // from class: l.mf20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133554a.m78908u2(view);
            }
        });
        this.f53989h.setOnClickListener(new View.OnClickListener() { // from class: l.nf20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f138680a.m78914v2(z, view);
            }
        });
        xdl0.m208411y(this.f53989h, false);
        this.f53984c.m21031m().m161456O(true).m161480x(new j11(this.f53992k, this.f53993l)).m161446E(false).m161457P(this.f53995n).m161448G(t100.m186890d(2.0f)).m161445D(false).m161452K(this.f53996o).m161460b();
        this.f53984c.m21030l().m138380p(f53981s, f53982t).m138386v(0.02f).m138385u(0.2f).m138381q(InitialPosition.CENTER_INSIDE).m138384t(6.0f).m138368b();
        this.f53984c.setImageUri(Uri.fromFile(new File(this.f53991j)));
        this.f53984c.setCropSaveCompleteListener(new CropIwaView.InterfaceC4361c() { // from class: l.of20
            @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropIwaView.InterfaceC4361c
            /* JADX INFO: renamed from: a */
            public final void mo21049a(Uri uri) {
                this.f143619a.m78916y2(uri);
            }
        });
        this.f53984c.setErrorListener(new CropIwaView.InterfaceC4362d() { // from class: l.pf20
            @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropIwaView.InterfaceC4362d
            public final void onError(Throwable th) {
                this.f148510a.m78917z2(th);
            }
        });
        this.f53984c.setInvalidCroppingListener(new CropIwaView.InterfaceC4363e() { // from class: l.qf20
            @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropIwaView.InterfaceC4363e
            /* JADX INFO: renamed from: a */
            public final void mo21050a() {
                this.f154077a.m78889A2();
            }
        });
        this.f53984c.setTouchAction(new d30() { // from class: l.rf20
            @Override // p149l.d30
            public final void call() {
                this.f159099a.m78909B2();
            }
        });
        this.f53986e.setOnClickListener(new View.OnClickListener() { // from class: l.sf20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f164192a.m78912r2(view);
            }
        });
        this.f53984c.setImageLoadListener(new C13065a());
    }

    /* JADX INFO: renamed from: v2 */
    public final /* synthetic */ void m78914v2(boolean z, View view) {
        this.f53984c.m21041w();
        this.f53984c.m21040v();
        this.f53984c.m21031m().m161456O(true).m161480x(new j11(this.f53992k, this.f53993l)).m161446E(false).m161457P(this.f53995n).m161448G(t100.m186890d(2.0f)).m161445D(z).m161452K(this.f53996o).m161460b();
        this.f53984c.m21030l().m138380p(f53981s, f53982t).m138386v(0.02f).m138385u(0.2f).m138381q(InitialPosition.CENTER_INSIDE).m138384t(z ? 1.6f : 6.0f).m138368b();
        this.f53989h.setTextColor(getResources().getColor(v0c0.f179105l));
        xdl0.m208411y(this.f53989h, false);
    }

    /* JADX INFO: renamed from: w2 */
    public final /* synthetic */ void m78915w2(Uri uri, Pair pair) {
        if (((Integer) pair.second).intValue() == 3) {
            m78910C2(uri);
        } else if (((Integer) pair.second).intValue() == 4) {
            progressDismiss();
            bvb.m104013c("", 1);
        }
    }

    /* JADX INFO: renamed from: y2 */
    public final /* synthetic */ void m78916y2(final Uri uri) {
        mkd0.m154992z(this.f53998q);
        if (!NullChecker.m81303a(bvb.m104012b()) || ((Integer) bvb.m104012b().second).intValue() != 1) {
            m78910C2(uri);
        } else {
            bvb.m104013c(uri.getPath(), 2);
            this.f53998q = this.act.duringCreated(bvb.m104011a().filter(new w9j() { // from class: l.tf20
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    Pair pair = (Pair) obj;
                    return Boolean.valueOf(((Integer) pair.second).intValue() == 3 || ((Integer) pair.second).intValue() == 4);
                }
            }).take(1)).subscribe(mkd0.m154955G(new e30() { // from class: l.jf20
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f117626a.m78915w2(uri, (Pair) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: z2 */
    public final /* synthetic */ void m78917z2(Throwable th) {
        progressDismiss();
        if (th instanceof TooLargeException) {
            lsi0.m151578h(R$string.f17365Q);
        }
    }
}
