package com.p003p1.mobile.android.p005ui.cropiwa;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p003p1.mobile.android.R$string;
import com.p003p1.mobile.android.app.Act;
import com.p003p1.mobile.android.p005ui.cropiwa.config.InitialPosition;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import l.xdl0;
import p007l.b6c0;
import p007l.eub;
import p007l.fub;
import p007l.j11;
import p007l.lsi0;
import p007l.nub;
import p007l.p4c0;
import p007l.qub;
import p007l.s7m;
import p007l.svb;
import v.VProgressBar;

/* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.c */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class C0279c implements s7m<svb> {

    /* JADX INFO: renamed from: e */
    public static int f1531e = 1080;

    /* JADX INFO: renamed from: f */
    public static int f1532f = 1080;

    /* JADX INFO: renamed from: a */
    public CropperAct f1533a;

    /* JADX INFO: renamed from: b */
    public svb f1534b;

    /* JADX INFO: renamed from: c */
    public CropIwaView f1535c;

    /* JADX INFO: renamed from: d */
    public VProgressBar f1536d;

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.c$a */
    public class a implements fub.InterfaceC0547a {
        public a() {
        }

        @Override // p007l.fub.InterfaceC0547a
        /* JADX INFO: renamed from: a */
        public void mo1316a(Uri uri, Bitmap bitmap) {
            xdl0.M(C0279c.this.f1536d, false);
        }

        @Override // p007l.fub.InterfaceC0547a
        /* JADX INFO: renamed from: b */
        public void mo1317b(Throwable th) {
            xdl0.M(C0279c.this.f1536d, false);
            if (th instanceof TooLargeException) {
                lsi0.m9834h(R$string.f843j7);
            } else {
                lsi0.m9834h(R$string.f833i7);
            }
            C0279c.this.f1533a.lambda$debugItems$19();
        }
    }

    public C0279c(CropperAct cropperAct) {
        this.f1533a = cropperAct;
    }

    @Override // p007l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo1334C0() {
        return this.f1533a;
    }

    @Override // p007l.s7m
    @Nullable
    public Act act() {
        return this.f1533a;
    }

    @Override // p007l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: f */
    public void m1335f() {
        this.f1535c.m1302l().m9446u(0.02f).m9445t((xdl0.y0() * 0.9f) / 540.0f).m9429b();
    }

    @Override // p007l.s7m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo1337i1(svb svbVar) {
        this.f1534b = svbVar;
    }

    @Override // p007l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(b6c0.f1939y, viewGroup);
        this.f1535c = (CropIwaView) viewInflate.findViewById(p4c0.f3607C);
        this.f1536d = viewInflate.findViewById(p4c0.f3667h0);
        return viewInflate;
    }

    /* JADX INFO: renamed from: j */
    public void m1338j(qub qubVar) {
        this.f1535c.m1304n(qubVar);
    }

    /* JADX INFO: renamed from: k */
    public void m1339k(String str) {
        nub nubVarM1303m = this.f1535c.m1303m();
        if (!this.f1534b.m10738j0() || this.f1534b.m10739k0()) {
            nubVarM1303m.m10111O(false).m10135x(new j11(1, 1)).m10101E(false).m10115b();
        } else {
            nubVarM1303m.m10099C(new eub(nubVarM1303m)).m10111O(false).m10110N(true).m10135x(new j11(4, 5)).m10101E(false).m10115b();
        }
        this.f1535c.m1302l().m9441p(f1531e, f1532f).m9447v(0.02f).m9445t(6.0f).m9446u(0.2f).m9442q(InitialPosition.CENTER_INSIDE).m9429b();
        Uri uriFromFile = Uri.fromFile(new File(str));
        this.f1535c.setImageUri(uriFromFile);
        if (uriFromFile == null) {
            CrashHelper.c(new RuntimeException("4.8.4 report imageUri null imageFilepath= " + str));
        }
        this.f1535c.setCropSaveCompleteListener(new CropIwaView.InterfaceC0273c() { // from class: l.uvb
            @Override // com.p003p1.mobile.android.p005ui.cropiwa.CropIwaView.InterfaceC0273c
            /* JADX INFO: renamed from: a */
            public final void mo1321a(Uri uri) {
                this.f4939a.m1341m(uri);
            }
        });
        this.f1535c.setInvalidCroppingListener(new CropIwaView.InterfaceC0275e() { // from class: l.wvb
            @Override // com.p003p1.mobile.android.p005ui.cropiwa.CropIwaView.InterfaceC0275e
            /* JADX INFO: renamed from: a */
            public final void mo1322a() {
                this.f5077a.m1342n();
            }
        });
        this.f1535c.setErrorListener(new CropIwaView.InterfaceC0274d() { // from class: l.yvb
            @Override // com.p003p1.mobile.android.p005ui.cropiwa.CropIwaView.InterfaceC0274d
            public final void onError(Throwable th) {
                this.f5465a.m1343p(th);
            }
        });
        this.f1535c.setImageLoadListener(new a());
    }

    /* JADX INFO: renamed from: l */
    public boolean m1340l() {
        return this.f1535c.m1308r();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m1341m(Uri uri) {
        this.f1533a.progressDismiss();
        Intent intent = new Intent();
        intent.putExtra("path", uri.getPath());
        this.f1533a.setResult(-1, intent);
        this.f1533a.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m1342n() {
        this.f1533a.progressDismiss();
        lsi0.m9834h(R$string.f833i7);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m1343p(Throwable th) {
        this.f1533a.progressDismiss();
        if (th instanceof TooLargeException) {
            lsi0.m9834h(R$string.f843j7);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m1344q() {
        this.f1535c.m1315y();
    }
}
