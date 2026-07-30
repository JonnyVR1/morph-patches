package com.p046p1.mobile.android.p048ui.cropiwa;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.R$string;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.cropiwa.config.InitialPosition;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import p147v.VProgressBar;
import p149l.b6c0;
import p149l.eub;
import p149l.fub;
import p149l.j11;
import p149l.lsi0;
import p149l.nub;
import p149l.p4c0;
import p149l.qub;
import p149l.s7m;
import p149l.svb;
import p149l.xdl0;

/* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.c */
/* JADX INFO: loaded from: classes8.dex */
public class C4367c implements s7m<svb> {

    /* JADX INFO: renamed from: e */
    public static int f15832e = 1080;

    /* JADX INFO: renamed from: f */
    public static int f15833f = 1080;

    /* JADX INFO: renamed from: a */
    public CropperAct f15834a;

    /* JADX INFO: renamed from: b */
    public svb f15835b;

    /* JADX INFO: renamed from: c */
    public CropIwaView f15836c;

    /* JADX INFO: renamed from: d */
    public VProgressBar f15837d;

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.c$a */
    public class a implements fub.InterfaceC16922a {
        public a() {
        }

        @Override // p149l.fub.InterfaceC16922a
        /* JADX INFO: renamed from: a */
        public void mo21044a(Uri uri, Bitmap bitmap) {
            xdl0.m208344M(C4367c.this.f15837d, false);
        }

        @Override // p149l.fub.InterfaceC16922a
        /* JADX INFO: renamed from: b */
        public void mo21045b(Throwable th) {
            xdl0.m208344M(C4367c.this.f15837d, false);
            if (th instanceof TooLargeException) {
                lsi0.m151578h(R$string.f15144j7);
            } else {
                lsi0.m151578h(R$string.f15134i7);
            }
            C4367c.this.f15834a.lambda$debugItems$19();
        }
    }

    public C4367c(CropperAct cropperAct) {
        this.f15834a = cropperAct;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f15834a;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f15834a;
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: f */
    public void m21063f() {
        this.f15836c.m21030l().m138385u(0.02f).m138384t((xdl0.m208412y0() * 0.9f) / 540.0f).m138368b();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(svb svbVar) {
        this.f15835b = svbVar;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(b6c0.f73799y, viewGroup);
        this.f15836c = (CropIwaView) viewInflate.findViewById(p4c0.f147059C);
        this.f15837d = (VProgressBar) viewInflate.findViewById(p4c0.f147119h0);
        return viewInflate;
    }

    /* JADX INFO: renamed from: j */
    public void m21066j(qub qubVar) {
        this.f15836c.m21032n(qubVar);
    }

    /* JADX INFO: renamed from: k */
    public void m21067k(String str) {
        nub nubVarM21031m = this.f15836c.m21031m();
        if (!this.f15835b.m186056j0() || this.f15835b.m186057k0()) {
            nubVarM21031m.m161456O(false).m161480x(new j11(1, 1)).m161446E(false).m161460b();
        } else {
            nubVarM21031m.m161444C(new eub(nubVarM21031m)).m161456O(false).m161455N(true).m161480x(new j11(4, 5)).m161446E(false).m161460b();
        }
        this.f15836c.m21030l().m138380p(f15832e, f15833f).m138386v(0.02f).m138384t(6.0f).m138385u(0.2f).m138381q(InitialPosition.CENTER_INSIDE).m138368b();
        Uri uriFromFile = Uri.fromFile(new File(str));
        this.f15836c.setImageUri(uriFromFile);
        if (uriFromFile == null) {
            CrashHelper.m81296c(new RuntimeException("4.8.4 report imageUri null imageFilepath= " + str));
        }
        this.f15836c.setCropSaveCompleteListener(new CropIwaView.InterfaceC4361c() { // from class: l.uvb
            @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropIwaView.InterfaceC4361c
            /* JADX INFO: renamed from: a */
            public final void mo21049a(Uri uri) {
                this.f178521a.m21069m(uri);
            }
        });
        this.f15836c.setInvalidCroppingListener(new CropIwaView.InterfaceC4363e() { // from class: l.wvb
            @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropIwaView.InterfaceC4363e
            /* JADX INFO: renamed from: a */
            public final void mo21050a() {
                this.f188229a.m21070n();
            }
        });
        this.f15836c.setErrorListener(new CropIwaView.InterfaceC4362d() { // from class: l.yvb
            @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropIwaView.InterfaceC4362d
            public final void onError(Throwable th) {
                this.f200244a.m21071p(th);
            }
        });
        this.f15836c.setImageLoadListener(new a());
    }

    /* JADX INFO: renamed from: l */
    public boolean m21068l() {
        return this.f15836c.m21036r();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m21069m(Uri uri) {
        this.f15834a.progressDismiss();
        Intent intent = new Intent();
        intent.putExtra("path", uri.getPath());
        this.f15834a.setResult(-1, intent);
        this.f15834a.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m21070n() {
        this.f15834a.progressDismiss();
        lsi0.m151578h(R$string.f15134i7);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m21071p(Throwable th) {
        this.f15834a.progressDismiss();
        if (th instanceof TooLargeException) {
            lsi0.m151578h(R$string.f15144j7);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m21072q() {
        this.f15836c.m21043y();
    }
}
