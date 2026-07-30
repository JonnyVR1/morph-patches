package com.p051p1.mobile.android.p053ui.cropiwa;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.R$string;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.cropiwa.config.InitialPosition;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import p151v.VProgressBar;
import p153l.bnl0;
import p153l.bwb;
import p153l.ewb;
import p153l.gec0;
import p153l.gxb;
import p153l.iam;
import p153l.o1j0;
import p153l.q11;
import p153l.svb;
import p153l.tvb;
import p153l.vcc0;

/* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.c */
/* JADX INFO: loaded from: classes8.dex */
public class C4518c implements iam<gxb> {

    /* JADX INFO: renamed from: e */
    public static int f16551e = 1080;

    /* JADX INFO: renamed from: f */
    public static int f16552f = 1080;

    /* JADX INFO: renamed from: a */
    public CropperAct f16553a;

    /* JADX INFO: renamed from: b */
    public gxb f16554b;

    /* JADX INFO: renamed from: c */
    public CropIwaView f16555c;

    /* JADX INFO: renamed from: d */
    public VProgressBar f16556d;

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.c$a */
    public class a implements tvb.InterfaceC20409a {
        public a() {
        }

        @Override // p153l.tvb.InterfaceC20409a
        /* JADX INFO: renamed from: a */
        public void mo22043a(Uri uri, Bitmap bitmap) {
            bnl0.m105524M(C4518c.this.f16556d, false);
        }

        @Override // p153l.tvb.InterfaceC20409a
        /* JADX INFO: renamed from: b */
        public void mo22044b(Throwable th) {
            bnl0.m105524M(C4518c.this.f16556d, false);
            if (th instanceof TooLargeException) {
                o1j0.m165634h(R$string.f15863j7);
            } else {
                o1j0.m165634h(R$string.f15853i7);
            }
            C4518c.this.f16553a.lambda$debugItems$19();
        }
    }

    public C4518c(CropperAct cropperAct) {
        this.f16553a = cropperAct;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f16553a;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f16553a;
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: f */
    public void m22062f() {
        this.f16555c.m22029l().m208053u(0.02f).m208052t((bnl0.m105592y0() * 0.9f) / 540.0f).m208036b();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(gxb gxbVar) {
        this.f16554b = gxbVar;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(gec0.f103812y, viewGroup);
        this.f16555c = (CropIwaView) viewInflate.findViewById(vcc0.f183359C);
        this.f16556d = (VProgressBar) viewInflate.findViewById(vcc0.f183419h0);
        return viewInflate;
    }

    /* JADX INFO: renamed from: j */
    public void m22065j(ewb ewbVar) {
        this.f16555c.m22031n(ewbVar);
    }

    /* JADX INFO: renamed from: k */
    public void m22066k(String str) {
        bwb bwbVarM22030m = this.f16555c.m22030m();
        if (!this.f16554b.m132804j0() || this.f16554b.m132805k0()) {
            bwbVarM22030m.m106664O(false).m106688x(new q11(1, 1)).m106654E(false).m106668b();
        } else {
            bwbVarM22030m.m106652C(new svb(bwbVarM22030m)).m106664O(false).m106663N(true).m106688x(new q11(4, 5)).m106654E(false).m106668b();
        }
        this.f16555c.m22029l().m208048p(f16551e, f16552f).m208054v(0.02f).m208052t(6.0f).m208053u(0.2f).m208049q(InitialPosition.CENTER_INSIDE).m208036b();
        Uri uriFromFile = Uri.fromFile(new File(str));
        this.f16555c.setImageUri(uriFromFile);
        if (uriFromFile == null) {
            CrashHelper.m82479c(new RuntimeException("4.8.4 report imageUri null imageFilepath= " + str));
        }
        this.f16555c.setCropSaveCompleteListener(new CropIwaView.InterfaceC4512c() { // from class: l.ixb
            @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropIwaView.InterfaceC4512c
            /* JADX INFO: renamed from: a */
            public final void mo22048a(Uri uri) {
                this.f117377a.m22068m(uri);
            }
        });
        this.f16555c.setInvalidCroppingListener(new CropIwaView.InterfaceC4514e() { // from class: l.kxb
            @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropIwaView.InterfaceC4514e
            /* JADX INFO: renamed from: a */
            public final void mo22049a() {
                this.f129182a.m22069n();
            }
        });
        this.f16555c.setErrorListener(new CropIwaView.InterfaceC4513d() { // from class: l.mxb
            @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropIwaView.InterfaceC4513d
            public final void onError(Throwable th) {
                this.f139218a.m22070p(th);
            }
        });
        this.f16555c.setImageLoadListener(new a());
    }

    /* JADX INFO: renamed from: l */
    public boolean m22067l() {
        return this.f16555c.m22035r();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m22068m(Uri uri) {
        this.f16553a.progressDismiss();
        Intent intent = new Intent();
        intent.putExtra("path", uri.getPath());
        this.f16553a.setResult(-1, intent);
        this.f16553a.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m22069n() {
        this.f16553a.progressDismiss();
        o1j0.m165634h(R$string.f15853i7);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m22070p(Throwable th) {
        this.f16553a.progressDismiss();
        if (th instanceof TooLargeException) {
            o1j0.m165634h(R$string.f15863j7);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m22071q() {
        this.f16555c.m22042y();
    }
}
