package com.p000p1.mobile.putong.p004ui.jsbridge.implement;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.p004ui.download.C0513a;
import com.p000p1.mobile.putong.p004ui.download.DownloadTask;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.ImageBridgeImplementation;
import com.p000p1.mobile.putong.p004ui.mediapicker.MediaPickerBaseAct;
import com.p000p1.mobile.putong.p004ui.permission.PermissionHelper;
import com.p000p1.mobile.putong.p004ui.webview.AccessTokenWebViewAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.common.R;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.UploadSource;
import com.p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import l.d30;
import l.e30;
import l.e51;
import l.e6c0;
import l.f30;
import l.lsi0;
import l.lsx;
import l.mkd0;
import l.pgm;
import l.qib0;
import l.r5l0;
import l.rhi;
import l.s4c0;
import l.s5l0;
import l.u7c0;
import l.vwb;
import l.w9j;
import l.ya5;
import p009l.boq;
import p009l.bpd0;
import p009l.coq;
import p009l.ef2;
import p009l.hoq;
import p009l.liq;
import p009l.oyx;
import p009l.zqx;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ImageBridgeImplementation extends ef2 {

    /* JADX INFO: renamed from: a */
    public String f8146a;

    /* JADX INFO: renamed from: b */
    public C0519e f8147b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.ImageBridgeImplementation$a */
    public class C0515a implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ coq f8148a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f8149b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f8150c;

        public C0515a(coq coqVar, String str, String str2) {
            this.f8148a = coqVar;
            this.f8149b = str;
            this.f8150c = str2;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m10094b(coq coqVar, String str, String str2) {
            ImageBridgeImplementation.this.m10081G(coqVar, str2, str);
        }

        public void call() {
            ImageBridgeImplementation imageBridgeImplementation = ImageBridgeImplementation.this;
            final coq coqVar = this.f8148a;
            String str = this.f8149b;
            final String str2 = this.f8150c;
            imageBridgeImplementation.m10091y(coqVar, str, new e30() { // from class: l.uem
                public final void call(Object obj) {
                    this.f21099a.m10094b(coqVar, str2, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.ImageBridgeImplementation$b */
    public class C0516b implements e30<PermissionHelper.PermissionDeniedReason> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ coq f8152a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f8153b;

        public C0516b(coq coqVar, String str) {
            this.f8152a = coqVar;
            this.f8153b = str;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
            ImageBridgeImplementation.this.m10081G(this.f8152a, "refuse", this.f8153b);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.ImageBridgeImplementation$c */
    public class C0517c implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boq f8155a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f8156b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f8157c;

        public C0517c(boq boqVar, String str, String str2) {
            this.f8155a = boqVar;
            this.f8156b = str;
            this.f8157c = str2;
        }

        public void call() {
            ImageBridgeImplementation.this.m10092z(this.f8155a, this.f8156b, this.f8157c);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.ImageBridgeImplementation$d */
    public class C0518d implements e30<PermissionHelper.PermissionDeniedReason> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boq f8159a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f8160b;

        public C0518d(boq boqVar, String str) {
            this.f8159a = boqVar;
            this.f8160b = str;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
            ImageBridgeImplementation.this.m10081G(this.f8159a, "refuse", this.f8160b);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.ImageBridgeImplementation$e */
    public class C0519e implements a.a {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final boq f8162a;

        public C0519e(boq boqVar) {
            this.f8162a = boqVar;
        }

        /* JADX INFO: renamed from: a */
        public boolean m10097a(int i, int i2, Intent intent) {
            if (i2 != -1) {
                return false;
            }
            ImageBridgeImplementation imageBridgeImplementation = ImageBridgeImplementation.this;
            imageBridgeImplementation.m10083I(this.f8162a, i, i2, intent, Act.tempFileName, imageBridgeImplementation.f8146a);
            Act.tempFileName = null;
            return true;
        }

        /* JADX INFO: renamed from: b */
        public void m10098b() {
            if (this.f8162a.mo12184c() != null) {
                this.f8162a.mo12184c().registerOnActivityResultListener(this);
            }
        }

        /* JADX INFO: renamed from: c */
        public void m10099c() {
            if (this.f8162a.mo12184c() != null) {
                this.f8162a.mo12184c().unregisterOnActivityResultListener(this);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m10053c(Dialog dialog, d30 d30Var, DialogInterface dialogInterface) {
        if (TextUtils.isEmpty((String) dialog.P().getTag()) && NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m10054d(coq coqVar, DownloadTask downloadTask, e30 e30Var) {
        if (coqVar.mo12183b()) {
            return;
        }
        App.e.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://" + downloadTask.m9942v())));
        e30Var.call("success");
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m10055e(String str, boq boqVar) {
        if (TextUtils.isEmpty(str)) {
            str = "adtp";
        }
        boqVar.mo12185d().mo15130b(str, "", "canceled");
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m10058h(boq boqVar, Throwable th) {
        boqVar.mo12184c().progressDismiss();
        lsi0.C(R.string.F);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m10060j(PutongAct putongAct, boolean z, Dialog dialog, View view) {
        if (putongAct instanceof AccessTokenWebViewAct) {
            putongAct.pickImagesWithPicker(1, false, z, false, qib0.c0.P1(), z ? 790 : 789);
        } else {
            putongAct.pickImagesWithPicker(1, false, z, false, z ? 790 : 789);
        }
        if (dialog.isShowing()) {
            dialog.dismiss();
            dialog.P().setTag("cancel");
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m10061k(PutongAct putongAct, Dialog dialog, View view) {
        oyx.m20072l(putongAct);
        if (dialog.isShowing()) {
            dialog.dismiss();
            dialog.P().setTag("cancel");
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m10064n(coq coqVar, e30 e30Var) {
        if (coqVar.mo12183b()) {
            return;
        }
        e30Var.call("failed");
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m10069s(String str, boq boqVar) {
        if (TextUtils.isEmpty(str)) {
            str = "adtp";
        }
        boqVar.mo12185d().mo15130b(str, "", "canceled", "false", "");
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ Media m10070t(List list) {
        return (Media) list.get(0);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m10071u(Dialog dialog, d30 d30Var, View view) {
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m10075A(@NonNull boq boqVar, String str, String str2, String str3, boolean z, String str4) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "adtp";
        }
        hoq hoqVarMo12185d = boqVar.mo12185d();
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        hoqVarMo12185d.mo15130b(str3, str, str2, z ? "true" : "false", str4);
    }

    /* JADX INFO: renamed from: B */
    public final void m10076B(@NonNull final coq coqVar, String str, final String str2) {
        if (zqx.m25938k()) {
            m10091y(coqVar, str, new e30() { // from class: l.bem
                public final void call(Object obj) {
                    this.f10032a.m10081G(coqVar, str2, (String) obj);
                }
            });
        } else {
            PermissionHelper.m10211c().m10229r("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE").m10224m(new C0515a(coqVar, str, str2), new C0516b(coqVar, str2)).m10220i(coqVar.mo12184c());
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m10077C(final boq boqVar, final String str, String str2) {
        String str3;
        String str4 = System.currentTimeMillis() + "_web_image.png";
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath());
        String str5 = File.separator;
        sb.append(str5);
        sb.append("Tantan");
        String string = sb.toString();
        File file = new File(string);
        if ((file.exists() && file.isDirectory()) || file.mkdirs()) {
            str3 = string + str5 + str4;
        } else {
            str3 = null;
        }
        if (TextUtils.isEmpty(str3)) {
            e51.M(new Runnable() { // from class: l.oem
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17937a.m10078D(boqVar, str);
                }
            });
        } else if (bpd0.m12187a(str2, new File(str3))) {
            e51.M(new Runnable() { // from class: l.pem
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18510a.m10079E(boqVar, str);
                }
            });
        } else {
            e51.M(new Runnable() { // from class: l.qem
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19192a.m10080F(boqVar, str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m10078D(boq boqVar, String str) {
        m10081G(boqVar, "failed", str);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m10079E(boq boqVar, String str) {
        m10081G(boqVar, "success", str);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m10080F(boq boqVar, String str) {
        m10081G(boqVar, "failed", str);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m10082H(boq boqVar, boolean z, String str, Media media) {
        boolean z2;
        boqVar.mo12184c().progressDismiss();
        if (!z) {
            m10087M(boqVar, media.url, null, str);
            return;
        }
        String str2 = "";
        if (media instanceof Video) {
            z2 = true;
            if (NullChecker.a(media.cover())) {
                str2 = ((Media) media.cover()).url;
            }
        } else {
            z2 = false;
        }
        m10075A(boqVar, media.url, null, str, z2, str2);
    }

    /* JADX INFO: renamed from: I */
    public final boolean m10083I(@NonNull boq boqVar, int i, int i2, Intent intent, String str, String str2) {
        if (i == 789) {
            m10084J(boqVar, i2 == -1 ? (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f8209h) : null, i2, str2, false);
            return true;
        }
        if (i == 790) {
            m10084J(boqVar, i2 == -1 ? (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f8209h) : null, i2, str2, true);
            return true;
        }
        if (i == 16384) {
            m10085K(boqVar, str, i2, str2);
            return true;
        }
        m10089O(boqVar);
        return false;
    }

    /* JADX INFO: renamed from: J */
    public void m10084J(@NonNull boq boqVar, List<Media> list, int i, String str, boolean z) {
        if (i != -1 || list.size() <= 0) {
            m10087M(boqVar, "", "canceled", str);
            return;
        }
        Picture picture = (Media) list.get(0);
        if (picture instanceof Picture) {
            Picture picture2 = picture;
            ((Media) picture2).status = MediaLocalStatus.get("preprocessed");
            pgm pgmVar = new pgm(rhi.z(((Media) picture2).url));
            ((Media) picture2).mediaType = pgmVar.c;
            picture2.size = new Dimension(pgmVar.d);
            m10090P(boqVar, picture2, str, z);
            return;
        }
        if (picture instanceof Video) {
            Video video = (Video) picture;
            ((Media) video).status = MediaLocalStatus.get("preprocessed");
            video.cover = Picture.new_();
            ((Media) video).mediaType = "video/mp4";
            s5l0 s5l0Var = new s5l0(new r5l0(rhi.z(((Media) video).url)), false, false);
            video.size = new Dimension(s5l0Var.m());
            try {
                ((Media) video.cover).url = rhi.B(s5l0Var.c(0));
            } catch (Exception e) {
                CrashHelper.c(e);
            }
            video.cover.size = new Dimension(s5l0Var.k());
            ((Media) video.cover).mediaType = "image/jpeg";
            float f = video.duration;
            if (f >= 16000.0f) {
                lsi0.j("你的视频长度太长了，请保持在16秒内");
            } else if (f < 3000.0f) {
                lsi0.j("你的视频长度太短了，请大于3秒");
            } else {
                m10090P(boqVar, video, str, z);
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public void m10085K(@NonNull boq boqVar, String str, int i, String str2) {
        if (i != -1) {
            m10087M(boqVar, "", "canceled", str2);
            return;
        }
        Picture picture = new Picture();
        ((Media) picture).url = rhi.B(str);
        ((Media) picture).status = MediaLocalStatus.get("preprocessed");
        pgm pgmVar = new pgm(rhi.z(((Media) picture).url));
        ((Media) picture).mediaType = pgmVar.c;
        picture.size = new Dimension(pgmVar.d);
        m10090P(boqVar, picture, str2, false);
    }

    /* JADX INFO: renamed from: L */
    public final void m10086L(final PutongAct putongAct, final d30 d30Var, final boolean z) {
        View viewInflate = LayoutInflater.from(putongAct).inflate(e6c0.M, (ViewGroup) null, false);
        View viewFindViewById = viewInflate.findViewById(s4c0.E);
        View viewFindViewById2 = viewInflate.findViewById(s4c0.D);
        View viewFindViewById3 = viewInflate.findViewById(s4c0.o);
        final Dialog dialogZ = putongAct.dialog().L(u7c0.j).O(viewInflate).z();
        dialogZ.setCanceledOnTouchOutside(false);
        dialogZ.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.tem
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ImageBridgeImplementation.m10053c(dialogZ, d30Var, dialogInterface);
            }
        });
        dialogZ.show();
        Window window = dialogZ.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.gravity = 80;
        window.setAttributes(attributes);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.cem
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageBridgeImplementation.m10061k(putongAct, dialogZ, view);
            }
        });
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: l.dem
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageBridgeImplementation.m10060j(putongAct, z, dialogZ, view);
            }
        });
        viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: l.eem
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageBridgeImplementation.m10071u(dialogZ, d30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public final void m10087M(@NonNull boq boqVar, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "adtp";
        }
        boqVar.mo12185d().mo15130b(str3, str, str2);
    }

    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void m10081G(@NonNull coq coqVar, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "adtp";
        }
        coqVar.mo12185d().mo15130b(str2, str);
    }

    /* JADX INFO: renamed from: O */
    public final void m10089O(@NonNull boq boqVar) {
        C0519e c0519e = this.f8147b;
        if (c0519e != null) {
            c0519e.m10099c();
        }
        this.f8147b = null;
    }

    /* JADX INFO: renamed from: P */
    public final void m10090P(@NonNull final boq boqVar, final Media media, final String str, final boolean z) {
        boqVar.mo12184c().progress(R.string.W);
        new lsx(vwb.f0(new Media[]{media}), false).flatMap(new w9j() { // from class: l.fem
            public final Object call(Object obj) {
                return ya5.K(vwb.f0(new Media[]{media}), "app-loading", "h5-loading", UploadSource.get("report")).map(new w9j() { // from class: l.kem
                    public final Object call(Object obj2) {
                        return ImageBridgeImplementation.m10070t((List) obj2);
                    }
                });
            }
        }).compose(mkd0.C()).subscribe(mkd0.H(new e30() { // from class: l.gem
            public final void call(Object obj) {
                this.f13484a.m10082H(boqVar, z, str, (Media) obj);
            }
        }, new e30() { // from class: l.hem
            public final void call(Object obj) {
                ImageBridgeImplementation.m10058h(boqVar, (Throwable) obj);
            }
        }));
    }

    @Override // p009l.ef2
    /* JADX INFO: renamed from: a */
    public synchronized void mo10039a() {
        try {
            super.mo10039a();
            C0519e c0519e = this.f8147b;
            if (c0519e != null) {
                c0519e.m10099c();
            }
            this.f8147b = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @liq(key = "imagePicker", uiThread = true)
    public void imagePicker(@NonNull final boq boqVar, final String str) {
        this.f8146a = str;
        C0519e c0519e = this.f8147b;
        if (c0519e != null) {
            c0519e.m10099c();
        }
        C0519e c0519e2 = new C0519e(boqVar);
        this.f8147b = c0519e2;
        c0519e2.m10098b();
        m10086L(boqVar.mo12184c(), new d30() { // from class: l.nem
            public final void call() {
                ImageBridgeImplementation.m10055e(str, boqVar);
            }
        }, false);
    }

    @liq(key = "imagePickerWithVideo", uiThread = true)
    public void imagePickerWithVideo(@NonNull final boq boqVar, final String str) {
        this.f8146a = str;
        this.f8147b = new C0519e(boqVar);
        boqVar.mo12184c().registerOnActivityResultListener(this.f8147b);
        m10086L(boqVar.mo12184c(), new d30() { // from class: l.lem
            public final void call() {
                ImageBridgeImplementation.m10069s(str, boqVar);
            }
        }, true);
    }

    @liq(key = "imageSave")
    public void imageSave(@NonNull boq boqVar, String str, String str2) {
        m10076B(boqVar, str, str2);
    }

    @liq(key = "saveBase64ImageData")
    public void saveBase64ImageData(@NonNull boq boqVar, String str, String str2) {
        if (zqx.m25938k()) {
            m10092z(boqVar, str, str2);
        } else {
            PermissionHelper.m10211c().m10229r("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE").m10224m(new C0517c(boqVar, str, str2), new C0518d(boqVar, str2)).m10220i(boqVar.mo12184c());
        }
    }

    /* JADX INFO: renamed from: y */
    public void m10091y(@NonNull final coq coqVar, String str, final e30<String> e30Var) {
        String str2;
        String str3;
        if (TextUtils.isEmpty(str)) {
            e30Var.call("failed");
            return;
        }
        String strSubstring = str.substring(str.lastIndexOf("."), str.length());
        int iIndexOf = strSubstring.indexOf(63);
        if (iIndexOf == -1) {
            str2 = System.currentTimeMillis() + strSubstring;
        } else {
            str2 = System.currentTimeMillis() + strSubstring.substring(0, iIndexOf);
        }
        StringBuilder sb = new StringBuilder(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath());
        String str4 = File.separator;
        sb.append(str4);
        sb.append("Tantan");
        String string = sb.toString();
        File file = new File(string);
        if ((file.exists() && file.isDirectory()) || file.mkdirs()) {
            str3 = string + str4 + str2;
        } else {
            str3 = null;
        }
        if (TextUtils.isEmpty(str3)) {
            e30Var.call("failed");
            return;
        }
        DownloadTask downloadTaskM9947a = new DownloadTask.C0512b(qib0.H.getDownloadHttp()).m9963q(str).m9961o(str3).m9956j(new f30() { // from class: l.rem
            public final void call(Object obj, Object obj2) {
                e51.G(new Runnable() { // from class: l.iem
                    @Override // java.lang.Runnable
                    public final void run() {
                        ImageBridgeImplementation.m10054d(coqVar, downloadTask, e30Var);
                    }
                });
            }
        }).m9952f(new f30() { // from class: l.sem
            public final void call(Object obj, Object obj2) {
                e51.G(new Runnable() { // from class: l.jem
                    @Override // java.lang.Runnable
                    public final void run() {
                        ImageBridgeImplementation.m10064n(coqVar, e30Var);
                    }
                });
            }
        }).m9947a();
        if (C0513a.m9975u().m9995y(downloadTaskM9947a.m9944x())) {
            return;
        }
        C0513a.m9975u().m9986o(downloadTaskM9947a);
    }

    /* JADX INFO: renamed from: z */
    public final void m10092z(@NonNull final boq boqVar, final String str, final String str2) {
        e51.y(new Runnable() { // from class: l.mem
            @Override // java.lang.Runnable
            public final void run() {
                this.f16855a.m10077C(boqVar, str2, str);
            }
        });
    }
}
