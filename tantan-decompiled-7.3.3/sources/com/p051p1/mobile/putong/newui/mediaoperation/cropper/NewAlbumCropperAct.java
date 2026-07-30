package com.p051p1.mobile.putong.newui.mediaoperation.cropper;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.cropiwa.CropIwaView;
import com.p051p1.mobile.android.p053ui.cropiwa.TooLargeException;
import com.p051p1.mobile.android.p053ui.cropiwa.config.InitialPosition;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.common.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VText;
import p153l.b9c0;
import p153l.bnl0;
import p153l.ecj;
import p153l.eo20;
import p153l.ewb;
import p153l.kcg0;
import p153l.kl40;
import p153l.l51;
import p153l.o1j0;
import p153l.psd0;
import p153l.pwb;
import p153l.q11;
import p153l.qa00;
import p153l.qcj;
import p153l.tvb;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes10.dex */
public class NewAlbumCropperAct extends PutongAct {

    /* JADX INFO: renamed from: s */
    public static int f54829s = 1080;

    /* JADX INFO: renamed from: t */
    public static int f54830t = 1080;

    /* JADX INFO: renamed from: u */
    public static int f54831u = bnl0.m105592y0() - qa00.m175859d(56.0f);

    /* JADX INFO: renamed from: c */
    public CropIwaView f54832c;

    /* JADX INFO: renamed from: d */
    public VProgressBar f54833d;

    /* JADX INFO: renamed from: e */
    public ImageView f54834e;

    /* JADX INFO: renamed from: f */
    public VLinear f54835f;

    /* JADX INFO: renamed from: g */
    public ImageView f54836g;

    /* JADX INFO: renamed from: h */
    public VText f54837h;

    /* JADX INFO: renamed from: i */
    public ImageView f54838i;

    /* JADX INFO: renamed from: j */
    public String f54839j;

    /* JADX INFO: renamed from: k */
    public int f54840k = 1;

    /* JADX INFO: renamed from: l */
    public int f54841l = 1;

    /* JADX INFO: renamed from: m */
    public float f54842m;

    /* JADX INFO: renamed from: n */
    public int f54843n;

    /* JADX INFO: renamed from: o */
    public boolean f54844o;

    /* JADX INFO: renamed from: p */
    public boolean f54845p;

    /* JADX INFO: renamed from: q */
    public kcg0 f54846q;

    /* JADX INFO: renamed from: r */
    public View f54847r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.mediaoperation.cropper.NewAlbumCropperAct$a */
    public class C13228a implements tvb.InterfaceC20409a {
        public C13228a() {
        }

        @Override // p153l.tvb.InterfaceC20409a
        /* JADX INFO: renamed from: a */
        public void mo22043a(Uri uri, Bitmap bitmap) {
            bnl0.m105524M(NewAlbumCropperAct.this.f54833d, false);
        }

        @Override // p153l.tvb.InterfaceC20409a
        /* JADX INFO: renamed from: b */
        public void mo22044b(Throwable th) {
            bnl0.m105524M(NewAlbumCropperAct.this.f54833d, false);
            if (th instanceof TooLargeException) {
                o1j0.m165634h(R$string.f18084Q);
            } else {
                o1j0.m165634h(R$string.f18032D);
            }
            NewAlbumCropperAct.this.m48999H2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B2 */
    public /* synthetic */ void m80072B2() {
        progressDismiss();
        o1j0.m165634h(R$string.f18036E);
    }

    /* JADX INFO: renamed from: m2 */
    public static Intent m80085m2(Act act, String str, float f, int i) {
        Intent intent = new Intent(act, (Class<?>) NewAlbumCropperAct.class);
        intent.putExtra("IMAGE_URI", str);
        intent.putExtra("CROP_PROPORTION", f);
        intent.putExtra("OVERLAY_WIDTH", i);
        return intent;
    }

    /* JADX INFO: renamed from: n2 */
    public static Intent m80086n2(Act act, String str, float f, int i, boolean z) {
        Intent intent = new Intent(act, (Class<?>) NewAlbumCropperAct.class);
        intent.putExtra("IMAGE_URI", str);
        intent.putExtra("CROP_PROPORTION", f);
        intent.putExtra("OVERLAY_WIDTH", i);
        intent.putExtra("CROPP_INGNEWS_TYLE", z);
        return intent;
    }

    /* JADX INFO: renamed from: o2 */
    private void m80087o2() {
        this.f54832c.m22031n(m80089q2());
    }

    /* JADX INFO: renamed from: p2 */
    private void m80088p2() {
        if (l51.m152918x() || l51.m152917w()) {
            bnl0.m105556g0(this.f54847r);
        }
    }

    /* JADX INFO: renamed from: q2 */
    private ewb m80089q2() {
        ewb.C16850a c16850a = new ewb.C16850a(Uri.fromFile(ecj.m120381O(kl40.m150345c() ? "webp" : "jpg")));
        c16850a.m122940b(kl40.m150345c() ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG);
        if (kl40.m150345c()) {
            c16850a.m122943e(new qcj() { // from class: l.un20
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Integer.valueOf(sim.m186020a((Bitmap) obj));
                }
            });
        }
        return c16850a.m122942d(1080, 1080).m122941c(100).m122939a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r2 */
    public /* synthetic */ void m80090r2(View view) {
        psd0.m173633z(this.f54846q);
        if (this.f54832c.m22035r()) {
            progress(R$string.f18108W);
            m80087o2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v2 */
    public /* synthetic */ void m80091v2(View view) {
        m48999H2();
        this.f54832c.m22042y();
    }

    /* JADX INFO: renamed from: A2 */
    public final /* synthetic */ void m80092A2(Throwable th) {
        progressDismiss();
        if (th instanceof TooLargeException) {
            o1j0.m165634h(R$string.f18084Q);
        }
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ void m80093C2() {
        if (this.f54837h.isEnabled()) {
            return;
        }
        this.f54837h.setTextColor(getResources().getColor(b9c0.f75570p));
        bnl0.m105591y(this.f54837h, true);
    }

    /* JADX INFO: renamed from: D2 */
    public final void m80094D2(Uri uri) {
        progressDismiss();
        Intent intent = new Intent();
        intent.putExtra("path", uri.getPath());
        setResult(-1, intent);
        m48999H2();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM80095l2 = m80095l2(layoutInflater, viewGroup);
        this.f54847r = viewM80095l2;
        return viewM80095l2;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.mIfInNewUi1ShouldUseThemNewUI2 = true;
        creates(new y20() { // from class: l.sn20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f169640a.m80097u2((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l2 */
    public View m80095l2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return eo20.m121718b(this, layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_camera_album_cut_picture";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        setTransparentStatusBar();
        setSwipeBackEnable(false);
        this.f54839j = getIntent().getStringExtra("IMAGE_URI");
        this.f54842m = getIntent().getFloatExtra("CROP_PROPORTION", 0.0f);
        this.f54843n = getIntent().getIntExtra("OVERLAY_WIDTH", f54831u);
        this.f54845p = getIntent().getBooleanExtra("CROPP_INGNEWS_TYLE", false);
        if (this.f54843n <= 0) {
            this.f54843n = f54831u;
        }
        float f = this.f54842m;
        if (f > 0.0f) {
            this.f54840k = (int) (f * 10.0f);
            this.f54841l = 10;
            this.f54844o = true;
        }
    }

    /* JADX INFO: renamed from: s2 */
    public final /* synthetic */ void m80096s2(View view) {
        this.f54832c.m22041x();
    }

    /* JADX INFO: renamed from: u2 */
    public final /* synthetic */ void m80097u2(Bundle bundle) {
        final boolean z = false;
        bnl0.m105524M(this.f54834e, false);
        this.f54835f.setVisibility(8);
        m80088p2();
        this.f54838i.setOnClickListener(new View.OnClickListener() { // from class: l.vn20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f184803a.m80090r2(view);
            }
        });
        this.f54836g.setOnClickListener(new View.OnClickListener() { // from class: l.wn20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f189850a.m80091v2(view);
            }
        });
        this.f54837h.setOnClickListener(new View.OnClickListener() { // from class: l.xn20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195355a.m80098w2(z, view);
            }
        });
        bnl0.m105591y(this.f54837h, false);
        this.f54832c.m22030m().m106664O(true).m106688x(new q11(this.f54840k, this.f54841l)).m106654E(false).m106665P(this.f54843n).m106656G(qa00.m175859d(2.0f)).m106653D(false).m106660K(this.f54844o).m106668b();
        this.f54832c.m22029l().m208048p(f54829s, f54830t).m208054v(0.02f).m208053u(0.2f).m208049q(InitialPosition.CENTER_INSIDE).m208052t(6.0f).m208036b();
        this.f54832c.setImageUri(Uri.fromFile(new File(this.f54839j)));
        this.f54832c.setCropSaveCompleteListener(new CropIwaView.InterfaceC4512c() { // from class: l.yn20
            @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropIwaView.InterfaceC4512c
            /* JADX INFO: renamed from: a */
            public final void mo22048a(Uri uri) {
                this.f200769a.m80100z2(uri);
            }
        });
        this.f54832c.setErrorListener(new CropIwaView.InterfaceC4513d() { // from class: l.zn20
            @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropIwaView.InterfaceC4513d
            public final void onError(Throwable th) {
                this.f205172a.m80092A2(th);
            }
        });
        this.f54832c.setInvalidCroppingListener(new CropIwaView.InterfaceC4514e() { // from class: l.ao20
            @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropIwaView.InterfaceC4514e
            /* JADX INFO: renamed from: a */
            public final void mo22049a() {
                this.f72412a.m80072B2();
            }
        });
        this.f54832c.setTouchAction(new x20() { // from class: l.bo20
            @Override // p153l.x20
            public final void call() {
                this.f77608a.m80093C2();
            }
        });
        this.f54834e.setOnClickListener(new View.OnClickListener() { // from class: l.co20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82803a.m80096s2(view);
            }
        });
        this.f54832c.setImageLoadListener(new C13228a());
    }

    /* JADX INFO: renamed from: w2 */
    public final /* synthetic */ void m80098w2(boolean z, View view) {
        this.f54832c.m22040w();
        this.f54832c.m22039v();
        this.f54832c.m22030m().m106664O(true).m106688x(new q11(this.f54840k, this.f54841l)).m106654E(false).m106665P(this.f54843n).m106656G(qa00.m175859d(2.0f)).m106653D(z).m106660K(this.f54844o).m106668b();
        this.f54832c.m22029l().m208048p(f54829s, f54830t).m208054v(0.02f).m208053u(0.2f).m208049q(InitialPosition.CENTER_INSIDE).m208052t(z ? 1.6f : 6.0f).m208036b();
        this.f54837h.setTextColor(getResources().getColor(b9c0.f75566l));
        bnl0.m105591y(this.f54837h, false);
    }

    /* JADX INFO: renamed from: y2 */
    public final /* synthetic */ void m80099y2(Uri uri, Pair pair) {
        if (((Integer) pair.second).intValue() == 3) {
            m80094D2(uri);
        } else if (((Integer) pair.second).intValue() == 4) {
            progressDismiss();
            pwb.m174055c("", 1);
        }
    }

    /* JADX INFO: renamed from: z2 */
    public final /* synthetic */ void m80100z2(final Uri uri) {
        psd0.m173633z(this.f54846q);
        if (!NullChecker.m82486a(pwb.m174054b()) || ((Integer) pwb.m174054b().second).intValue() != 1) {
            m80094D2(uri);
        } else {
            pwb.m174055c(uri.getPath(), 2);
            this.f54846q = this.act.duringCreated(pwb.m174053a().filter(new qcj() { // from class: l.do20
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    Pair pair = (Pair) obj;
                    return Boolean.valueOf(((Integer) pair.second).intValue() == 3 || ((Integer) pair.second).intValue() == 4);
                }
            }).take(1)).subscribe(psd0.m173596G(new y20() { // from class: l.tn20
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f175221a.m80099y2(uri, (Pair) obj);
                }
            }));
        }
    }
}
