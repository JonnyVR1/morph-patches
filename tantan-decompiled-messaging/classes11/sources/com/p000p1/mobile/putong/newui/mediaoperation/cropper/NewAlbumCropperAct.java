package com.p000p1.mobile.putong.newui.mediaoperation.cropper;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.cropiwa.CropIwaView;
import com.p1.mobile.android.ui.cropiwa.TooLargeException;
import com.p1.mobile.android.ui.cropiwa.config.InitialPosition;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.common.R;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import l.c4g0;
import l.d30;
import l.e30;
import l.e51;
import l.fub;
import l.j11;
import l.k9j;
import l.lsi0;
import l.mkd0;
import l.pgm;
import l.qub;
import l.t100;
import l.uf20;
import l.v0c0;
import l.w9j;
import l.wc40;
import l.xdl0;
import p009l.bvb;
import v.VLinear;
import v.VProgressBar;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class NewAlbumCropperAct extends PutongAct {

    /* JADX INFO: renamed from: s */
    public static int f7587s = 1080;

    /* JADX INFO: renamed from: t */
    public static int f7588t = 1080;

    /* JADX INFO: renamed from: u */
    public static int f7589u = xdl0.y0() - t100.d(56.0f);

    /* JADX INFO: renamed from: c */
    public CropIwaView f7590c;

    /* JADX INFO: renamed from: d */
    public VProgressBar f7591d;

    /* JADX INFO: renamed from: e */
    public ImageView f7592e;

    /* JADX INFO: renamed from: f */
    public VLinear f7593f;

    /* JADX INFO: renamed from: g */
    public ImageView f7594g;

    /* JADX INFO: renamed from: h */
    public VText f7595h;

    /* JADX INFO: renamed from: i */
    public ImageView f7596i;

    /* JADX INFO: renamed from: j */
    public String f7597j;

    /* JADX INFO: renamed from: k */
    public int f7598k = 1;

    /* JADX INFO: renamed from: l */
    public int f7599l = 1;

    /* JADX INFO: renamed from: m */
    public float f7600m;

    /* JADX INFO: renamed from: n */
    public int f7601n;

    /* JADX INFO: renamed from: o */
    public boolean f7602o;

    /* JADX INFO: renamed from: p */
    public boolean f7603p;

    /* JADX INFO: renamed from: q */
    public c4g0 f7604q;

    /* JADX INFO: renamed from: r */
    public View f7605r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.mediaoperation.cropper.NewAlbumCropperAct$a */
    public class C0467a implements fub.a {
        public C0467a() {
        }

        /* JADX INFO: renamed from: a */
        public void m9213a(Uri uri, Bitmap bitmap) {
            xdl0.M(NewAlbumCropperAct.this.f7591d, false);
        }

        /* JADX INFO: renamed from: b */
        public void m9214b(Throwable th) {
            xdl0.M(NewAlbumCropperAct.this.f7591d, false);
            if (th instanceof TooLargeException) {
                lsi0.h(R.string.Q);
            } else {
                lsi0.h(R.string.D);
            }
            NewAlbumCropperAct.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A2 */
    public /* synthetic */ void m9184A2() {
        progressDismiss();
        lsi0.h(R.string.E);
    }

    /* JADX INFO: renamed from: l2 */
    public static Intent m9197l2(Act act, String str, float f, int i) {
        Intent intent = new Intent((Context) act, (Class<?>) NewAlbumCropperAct.class);
        intent.putExtra("IMAGE_URI", str);
        intent.putExtra("CROP_PROPORTION", f);
        intent.putExtra("OVERLAY_WIDTH", i);
        return intent;
    }

    /* JADX INFO: renamed from: m2 */
    public static Intent m9198m2(Act act, String str, float f, int i, boolean z) {
        Intent intent = new Intent((Context) act, (Class<?>) NewAlbumCropperAct.class);
        intent.putExtra("IMAGE_URI", str);
        intent.putExtra("CROP_PROPORTION", f);
        intent.putExtra("OVERLAY_WIDTH", i);
        intent.putExtra("CROPP_INGNEWS_TYLE", z);
        return intent;
    }

    /* JADX INFO: renamed from: n2 */
    private void m9199n2() {
        this.f7590c.n(m9201p2());
    }

    /* JADX INFO: renamed from: o2 */
    private void m9200o2() {
        if (e51.x() || e51.w()) {
            xdl0.g0(new View[]{this.f7605r});
        }
    }

    /* JADX INFO: renamed from: p2 */
    private qub m9201p2() {
        qub.a aVar = new qub.a(Uri.fromFile(k9j.O(wc40.c() ? "webp" : "jpg")));
        aVar.b(wc40.c() ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG);
        if (wc40.c()) {
            aVar.e(new w9j() { // from class: l.kf20
                public final Object call(Object obj) {
                    return Integer.valueOf(pgm.a((Bitmap) obj));
                }
            });
        }
        return aVar.d(1080, 1080).c(100).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q2 */
    public /* synthetic */ void m9202q2(View view) {
        mkd0.z(this.f7604q);
        if (this.f7590c.r()) {
            progress(R.string.W);
            m9199n2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u2 */
    public /* synthetic */ void m9203u2(View view) {
        finish();
        this.f7590c.y();
    }

    /* JADX INFO: renamed from: B2 */
    public final /* synthetic */ void m9204B2() {
        if (this.f7595h.isEnabled()) {
            return;
        }
        this.f7595h.setTextColor(getResources().getColor(v0c0.p));
        xdl0.y(this.f7595h, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C2 */
    public final void m9205C2(Uri uri) {
        progressDismiss();
        Intent intent = new Intent();
        intent.putExtra("path", uri.getPath());
        setResult(-1, intent);
        finish();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM9206k2 = m9206k2(layoutInflater, viewGroup);
        this.f7605r = viewM9206k2;
        return viewM9206k2;
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        ((PutongAct) this).mIfInNewUi1ShouldUseThemNewUI2 = true;
        creates(new e30() { // from class: l.if20
            public final void call(Object obj) {
                this.f14600a.m9208s2((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public View m9206k2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return uf20.b(this, layoutInflater, viewGroup);
    }

    public String pageId() {
        return "p_camera_album_cut_picture";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        setTransparentStatusBar();
        setSwipeBackEnable(false);
        this.f7597j = getIntent().getStringExtra("IMAGE_URI");
        this.f7600m = getIntent().getFloatExtra("CROP_PROPORTION", 0.0f);
        this.f7601n = getIntent().getIntExtra("OVERLAY_WIDTH", f7589u);
        this.f7603p = getIntent().getBooleanExtra("CROPP_INGNEWS_TYLE", false);
        if (this.f7601n <= 0) {
            this.f7601n = f7589u;
        }
        float f = this.f7600m;
        if (f > 0.0f) {
            this.f7598k = (int) (f * 10.0f);
            this.f7599l = 10;
            this.f7602o = true;
        }
    }

    /* JADX INFO: renamed from: r2 */
    public final /* synthetic */ void m9207r2(View view) {
        this.f7590c.x();
    }

    /* JADX INFO: renamed from: s2 */
    public final /* synthetic */ void m9208s2(Bundle bundle) {
        final boolean z = false;
        xdl0.M(this.f7592e, false);
        this.f7593f.setVisibility(8);
        m9200o2();
        this.f7596i.setOnClickListener(new View.OnClickListener() { // from class: l.lf20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16130a.m9202q2(view);
            }
        });
        this.f7594g.setOnClickListener(new View.OnClickListener() { // from class: l.mf20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16868a.m9203u2(view);
            }
        });
        this.f7595h.setOnClickListener(new View.OnClickListener() { // from class: l.nf20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17435a.m9209v2(z, view);
            }
        });
        xdl0.y(this.f7595h, false);
        this.f7590c.m().O(true).x(new j11(this.f7598k, this.f7599l)).E(false).P(this.f7601n).G(t100.d(2.0f)).D(false).K(this.f7602o).b();
        this.f7590c.l().p(f7587s, f7588t).v(0.02f).u(0.2f).q(InitialPosition.CENTER_INSIDE).t(6.0f).b();
        this.f7590c.setImageUri(Uri.fromFile(new File(this.f7597j)));
        this.f7590c.setCropSaveCompleteListener(new CropIwaView.c() { // from class: l.of20
            /* JADX INFO: renamed from: a */
            public final void m19730a(Uri uri) {
                this.f17943a.m9211y2(uri);
            }
        });
        this.f7590c.setErrorListener(new CropIwaView.d() { // from class: l.pf20
            public final void onError(Throwable th) {
                this.f18517a.m9212z2(th);
            }
        });
        this.f7590c.setInvalidCroppingListener(new CropIwaView.e() { // from class: l.qf20
            /* JADX INFO: renamed from: a */
            public final void m20935a() {
                this.f19202a.m9184A2();
            }
        });
        this.f7590c.setTouchAction(new d30() { // from class: l.rf20
            public final void call() {
                this.f19791a.m9204B2();
            }
        });
        this.f7592e.setOnClickListener(new View.OnClickListener() { // from class: l.sf20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20218a.m9207r2(view);
            }
        });
        this.f7590c.setImageLoadListener(new C0467a());
    }

    /* JADX INFO: renamed from: v2 */
    public final /* synthetic */ void m9209v2(boolean z, View view) {
        this.f7590c.w();
        this.f7590c.v();
        this.f7590c.m().O(true).x(new j11(this.f7598k, this.f7599l)).E(false).P(this.f7601n).G(t100.d(2.0f)).D(z).K(this.f7602o).b();
        this.f7590c.l().p(f7587s, f7588t).v(0.02f).u(0.2f).q(InitialPosition.CENTER_INSIDE).t(z ? 1.6f : 6.0f).b();
        this.f7595h.setTextColor(getResources().getColor(v0c0.l));
        xdl0.y(this.f7595h, false);
    }

    /* JADX INFO: renamed from: w2 */
    public final /* synthetic */ void m9210w2(Uri uri, Pair pair) {
        if (((Integer) pair.second).intValue() == 3) {
            m9205C2(uri);
        } else if (((Integer) pair.second).intValue() == 4) {
            progressDismiss();
            bvb.m12279c("", 1);
        }
    }

    /* JADX INFO: renamed from: y2 */
    public final /* synthetic */ void m9211y2(final Uri uri) {
        mkd0.z(this.f7604q);
        if (!NullChecker.a(bvb.m12278b()) || ((Integer) bvb.m12278b().second).intValue() != 1) {
            m9205C2(uri);
        } else {
            bvb.m12279c(uri.getPath(), 2);
            this.f7604q = ((Act) this).act.duringCreated(bvb.m12277a().filter(new w9j() { // from class: l.tf20
                public final Object call(Object obj) {
                    Pair pair = (Pair) obj;
                    return Boolean.valueOf(((Integer) pair.second).intValue() == 3 || ((Integer) pair.second).intValue() == 4);
                }
            }).take(1)).subscribe(mkd0.G(new e30() { // from class: l.jf20
                public final void call(Object obj) {
                    this.f15091a.m9210w2(uri, (Pair) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: z2 */
    public final /* synthetic */ void m9212z2(Throwable th) {
        progressDismiss();
        if (th instanceof TooLargeException) {
            lsi0.h(R.string.Q);
        }
    }
}
