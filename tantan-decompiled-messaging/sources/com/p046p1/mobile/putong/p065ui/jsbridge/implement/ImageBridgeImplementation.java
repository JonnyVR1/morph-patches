package com.p046p1.mobile.putong.p065ui.jsbridge.implement;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.common.R$string;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.data.UploadSource;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.p065ui.download.C13111a;
import com.p046p1.mobile.putong.p065ui.download.DownloadTask;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.ImageBridgeImplementation;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.p046p1.mobile.putong.p065ui.webview.AccessTokenWebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p149l.boq;
import p149l.bpd0;
import p149l.coq;
import p149l.d30;
import p149l.e30;
import p149l.e51;
import p149l.e6c0;
import p149l.ef2;
import p149l.f30;
import p149l.hoq;
import p149l.liq;
import p149l.lsi0;
import p149l.lsx;
import p149l.mkd0;
import p149l.oyx;
import p149l.pgm;
import p149l.qib0;
import p149l.r5l0;
import p149l.rhi;
import p149l.s4c0;
import p149l.s5l0;
import p149l.u7c0;
import p149l.vwb;
import p149l.w9j;
import p149l.zqx;

/* JADX INFO: loaded from: classes11.dex */
public class ImageBridgeImplementation extends ef2 {

    /* JADX INFO: renamed from: a */
    public String f54540a;

    /* JADX INFO: renamed from: b */
    public C13117e f54541b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.ImageBridgeImplementation$a */
    public class C13113a implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ coq f54542a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f54543b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f54544c;

        public C13113a(coq coqVar, String str, String str2) {
            this.f54542a = coqVar;
            this.f54543b = str;
            this.f54544c = str2;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m79772b(coq coqVar, String str, String str2) {
            ImageBridgeImplementation.this.m79759G(coqVar, str2, str);
        }

        @Override // p149l.d30
        public void call() {
            ImageBridgeImplementation imageBridgeImplementation = ImageBridgeImplementation.this;
            final coq coqVar = this.f54542a;
            String str = this.f54543b;
            final String str2 = this.f54544c;
            imageBridgeImplementation.m79769y(coqVar, str, new e30() { // from class: l.uem
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f176049a.m79772b(coqVar, str2, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.ImageBridgeImplementation$b */
    public class C13114b implements e30<PermissionHelper.PermissionDeniedReason> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ coq f54546a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f54547b;

        public C13114b(coq coqVar, String str) {
            this.f54546a = coqVar;
            this.f54547b = str;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
            ImageBridgeImplementation.this.m79759G(this.f54546a, "refuse", this.f54547b);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.ImageBridgeImplementation$c */
    public class C13115c implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boq f54549a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f54550b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f54551c;

        public C13115c(boq boqVar, String str, String str2) {
            this.f54549a = boqVar;
            this.f54550b = str;
            this.f54551c = str2;
        }

        @Override // p149l.d30
        public void call() {
            ImageBridgeImplementation.this.m79770z(this.f54549a, this.f54550b, this.f54551c);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.ImageBridgeImplementation$d */
    public class C13116d implements e30<PermissionHelper.PermissionDeniedReason> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boq f54553a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f54554b;

        public C13116d(boq boqVar, String str) {
            this.f54553a = boqVar;
            this.f54554b = str;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
            ImageBridgeImplementation.this.m79759G(this.f54553a, "refuse", this.f54554b);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.ImageBridgeImplementation$e */
    public class C13117e implements C4317a.a {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final boq f54556a;

        public C13117e(boq boqVar) {
            this.f54556a = boqVar;
        }

        @Override // com.p046p1.mobile.android.app.C4317a.a
        /* JADX INFO: renamed from: a */
        public boolean mo20401a(int i, int i2, Intent intent) {
            if (i2 != -1) {
                return false;
            }
            ImageBridgeImplementation imageBridgeImplementation = ImageBridgeImplementation.this;
            imageBridgeImplementation.m79761I(this.f54556a, i, i2, intent, Act.tempFileName, imageBridgeImplementation.f54540a);
            Act.tempFileName = null;
            return true;
        }

        /* JADX INFO: renamed from: b */
        public void m79775b() {
            if (this.f54556a.mo102961c() != null) {
                this.f54556a.mo102961c().registerOnActivityResultListener(this);
            }
        }

        /* JADX INFO: renamed from: c */
        public void m79776c() {
            if (this.f54556a.mo102961c() != null) {
                this.f54556a.mo102961c().unregisterOnActivityResultListener(this);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m79731c(Dialog dialog, d30 d30Var, DialogInterface dialogInterface) {
        if (TextUtils.isEmpty((String) dialog.m20458P().getTag()) && NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m79732d(coq coqVar, DownloadTask downloadTask, e30 e30Var) {
        if (coqVar.mo102960b()) {
            return;
        }
        App.f15369e.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://" + downloadTask.m79621v())));
        e30Var.call("success");
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m79733e(String str, boq boqVar) {
        if (TextUtils.isEmpty(str)) {
            str = "adtp";
        }
        boqVar.mo102962d().mo127285b(str, "", "canceled");
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m79736h(boq boqVar, Throwable th) {
        boqVar.mo102961c().progressDismiss();
        lsi0.m151565C(R$string.f17321F);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m79738j(PutongAct putongAct, boolean z, Dialog dialog, View view) {
        if (putongAct instanceof AccessTokenWebViewAct) {
            putongAct.pickImagesWithPicker(1, false, z, false, qib0.f154714c0.mo97502P1(), z ? 790 : 789);
        } else {
            putongAct.pickImagesWithPicker(1, false, z, false, z ? 790 : 789);
        }
        if (dialog.isShowing()) {
            dialog.dismiss();
            dialog.m20458P().setTag("cancel");
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m79739k(PutongAct putongAct, Dialog dialog, View view) {
        oyx.m166738l(putongAct);
        if (dialog.isShowing()) {
            dialog.dismiss();
            dialog.m20458P().setTag("cancel");
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m79742n(coq coqVar, e30 e30Var) {
        if (coqVar.mo102960b()) {
            return;
        }
        e30Var.call("failed");
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m79747s(String str, boq boqVar) {
        if (TextUtils.isEmpty(str)) {
            str = "adtp";
        }
        boqVar.mo102962d().mo127285b(str, "", "canceled", "false", "");
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ Media m79748t(List list) {
        return (Media) list.get(0);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m79749u(Dialog dialog, d30 d30Var, View view) {
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m79753A(@NonNull boq boqVar, String str, String str2, String str3, boolean z, String str4) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "adtp";
        }
        hoq hoqVarMo102962d = boqVar.mo102962d();
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        hoqVarMo102962d.mo127285b(str3, str, str2, z ? "true" : "false", str4);
    }

    /* JADX INFO: renamed from: B */
    public final void m79754B(@NonNull final coq coqVar, String str, final String str2) {
        if (zqx.m219898k()) {
            m79769y(coqVar, str, new e30() { // from class: l.bem
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f75170a.m79759G(coqVar, str2, (String) obj);
                }
            });
        } else {
            PermissionHelper.m79882c().m79900r("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE").m79895m(new C13113a(coqVar, str, str2), new C13114b(coqVar, str2)).m79891i(coqVar.mo102961c());
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m79755C(final boq boqVar, final String str, String str2) {
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
            e51.m114748M(new Runnable() { // from class: l.oem
                @Override // java.lang.Runnable
                public final void run() {
                    this.f143346a.m79756D(boqVar, str);
                }
            });
        } else if (bpd0.m103053a(str2, new File(str3))) {
            e51.m114748M(new Runnable() { // from class: l.pem
                @Override // java.lang.Runnable
                public final void run() {
                    this.f148457a.m79757E(boqVar, str);
                }
            });
        } else {
            e51.m114748M(new Runnable() { // from class: l.qem
                @Override // java.lang.Runnable
                public final void run() {
                    this.f154041a.m79758F(boqVar, str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m79756D(boq boqVar, String str) {
        m79759G(boqVar, "failed", str);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m79757E(boq boqVar, String str) {
        m79759G(boqVar, "success", str);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m79758F(boq boqVar, String str) {
        m79759G(boqVar, "failed", str);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m79760H(boq boqVar, boolean z, String str, Media media) {
        boolean z2;
        boqVar.mo102961c().progressDismiss();
        if (!z) {
            m79765M(boqVar, media.url, null, str);
            return;
        }
        String str2 = "";
        if (media instanceof Video) {
            z2 = true;
            if (NullChecker.m81303a(media.cover())) {
                str2 = media.cover().url;
            }
        } else {
            z2 = false;
        }
        m79753A(boqVar, media.url, null, str, z2, str2);
    }

    /* JADX INFO: renamed from: I */
    public final boolean m79761I(@NonNull boq boqVar, int i, int i2, Intent intent, String str, String str2) {
        if (i == 789) {
            m79762J(boqVar, i2 == -1 ? (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f54603h) : null, i2, str2, false);
            return true;
        }
        if (i == 790) {
            m79762J(boqVar, i2 == -1 ? (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f54603h) : null, i2, str2, true);
            return true;
        }
        if (i == 16384) {
            m79763K(boqVar, str, i2, str2);
            return true;
        }
        m79767O(boqVar);
        return false;
    }

    /* JADX INFO: renamed from: J */
    public void m79762J(@NonNull boq boqVar, List<Media> list, int i, String str, boolean z) {
        if (i != -1 || list.size() <= 0) {
            m79765M(boqVar, "", "canceled", str);
            return;
        }
        Media media = list.get(0);
        if (media instanceof Picture) {
            Picture picture = (Picture) media;
            picture.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
            pgm pgmVar = new pgm(rhi.m179382z(picture.url));
            picture.mediaType = pgmVar.f148729c;
            picture.size = new Dimension(pgmVar.f148730d);
            m79768P(boqVar, picture, str, z);
            return;
        }
        if (media instanceof Video) {
            Video video = (Video) media;
            video.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
            video.cover = Picture.new_();
            video.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4;
            s5l0 s5l0Var = new s5l0(new r5l0(rhi.m179382z(video.url)), false, false);
            video.size = new Dimension(s5l0Var.m182364m());
            try {
                video.cover.url = rhi.m179355B(s5l0Var.m182356c(0));
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
            video.cover.size = new Dimension(s5l0Var.m182362k());
            video.cover.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
            float f = video.duration;
            if (f >= 16000.0f) {
                lsi0.m151580j("你的视频长度太长了，请保持在16秒内");
            } else if (f < 3000.0f) {
                lsi0.m151580j("你的视频长度太短了，请大于3秒");
            } else {
                m79768P(boqVar, video, str, z);
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public void m79763K(@NonNull boq boqVar, String str, int i, String str2) {
        if (i != -1) {
            m79765M(boqVar, "", "canceled", str2);
            return;
        }
        Picture picture = new Picture();
        picture.url = rhi.m179355B(str);
        picture.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
        pgm pgmVar = new pgm(rhi.m179382z(picture.url));
        picture.mediaType = pgmVar.f148729c;
        picture.size = new Dimension(pgmVar.f148730d);
        m79768P(boqVar, picture, str2, false);
    }

    /* JADX INFO: renamed from: L */
    public final void m79764L(final PutongAct putongAct, final d30 d30Var, final boolean z) {
        View viewInflate = LayoutInflater.from(putongAct).inflate(e6c0.f89531M, (ViewGroup) null, false);
        View viewFindViewById = viewInflate.findViewById(s4c0.f162291E);
        View viewFindViewById2 = viewInflate.findViewById(s4c0.f162289D);
        View viewFindViewById3 = viewInflate.findViewById(s4c0.f162351o);
        final Dialog dialogM20567z = putongAct.dialog().m20516L(u7c0.f174992j).m20519O(viewInflate).m20567z();
        dialogM20567z.setCanceledOnTouchOutside(false);
        dialogM20567z.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.tem
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ImageBridgeImplementation.m79731c(dialogM20567z, d30Var, dialogInterface);
            }
        });
        dialogM20567z.show();
        Window window = dialogM20567z.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.gravity = 80;
        window.setAttributes(attributes);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.cem
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageBridgeImplementation.m79739k(putongAct, dialogM20567z, view);
            }
        });
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: l.dem
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageBridgeImplementation.m79738j(putongAct, z, dialogM20567z, view);
            }
        });
        viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: l.eem
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageBridgeImplementation.m79749u(dialogM20567z, d30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public final void m79765M(@NonNull boq boqVar, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "adtp";
        }
        boqVar.mo102962d().mo127285b(str3, str, str2);
    }

    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void m79759G(@NonNull coq coqVar, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "adtp";
        }
        coqVar.mo102962d().mo127285b(str2, str);
    }

    /* JADX INFO: renamed from: O */
    public final void m79767O(@NonNull boq boqVar) {
        C13117e c13117e = this.f54541b;
        if (c13117e != null) {
            c13117e.m79776c();
        }
        this.f54541b = null;
    }

    /* JADX INFO: renamed from: P */
    public final void m79768P(@NonNull final boq boqVar, final Media media, final String str, final boolean z) {
        boqVar.mo102961c().progress(R$string.f17389W);
        new lsx(vwb.m200324f0(media), false).flatMap(new w9j() { // from class: l.fem
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ya5.m213795K(vwb.m200324f0(media), "app-loading", "h5-loading", UploadSource.get("report")).map(new w9j() { // from class: l.kem
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return ImageBridgeImplementation.m79748t((List) obj2);
                    }
                });
            }
        }).compose(mkd0.m154951C()).subscribe(mkd0.m154956H(new e30() { // from class: l.gem
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f102273a.m79760H(boqVar, z, str, (Media) obj);
            }
        }, new e30() { // from class: l.hem
            @Override // p149l.e30
            public final void call(Object obj) {
                ImageBridgeImplementation.m79736h(boqVar, (Throwable) obj);
            }
        }));
    }

    @Override // p149l.ef2
    /* JADX INFO: renamed from: a */
    public synchronized void mo46528a() {
        try {
            super.mo46528a();
            C13117e c13117e = this.f54541b;
            if (c13117e != null) {
                c13117e.m79776c();
            }
            this.f54541b = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @liq(key = SchemeKey.imagePicker, uiThread = true)
    public void imagePicker(@NonNull final boq boqVar, final String str) {
        this.f54540a = str;
        C13117e c13117e = this.f54541b;
        if (c13117e != null) {
            c13117e.m79776c();
        }
        C13117e c13117e2 = new C13117e(boqVar);
        this.f54541b = c13117e2;
        c13117e2.m79775b();
        m79764L(boqVar.mo102961c(), new d30() { // from class: l.nem
            @Override // p149l.d30
            public final void call() {
                ImageBridgeImplementation.m79733e(str, boqVar);
            }
        }, false);
    }

    @liq(key = "imagePickerWithVideo", uiThread = true)
    public void imagePickerWithVideo(@NonNull final boq boqVar, final String str) {
        this.f54540a = str;
        this.f54541b = new C13117e(boqVar);
        boqVar.mo102961c().registerOnActivityResultListener(this.f54541b);
        m79764L(boqVar.mo102961c(), new d30() { // from class: l.lem
            @Override // p149l.d30
            public final void call() {
                ImageBridgeImplementation.m79747s(str, boqVar);
            }
        }, true);
    }

    @liq(key = "imageSave")
    public void imageSave(@NonNull boq boqVar, String str, String str2) {
        m79754B(boqVar, str, str2);
    }

    @liq(key = "saveBase64ImageData")
    public void saveBase64ImageData(@NonNull boq boqVar, String str, String str2) {
        if (zqx.m219898k()) {
            m79770z(boqVar, str, str2);
        } else {
            PermissionHelper.m79882c().m79900r("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE").m79895m(new C13115c(boqVar, str, str2), new C13116d(boqVar, str2)).m79891i(boqVar.mo102961c());
        }
    }

    /* JADX INFO: renamed from: y */
    public void m79769y(@NonNull final coq coqVar, String str, final e30<String> e30Var) {
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
        DownloadTask downloadTaskM79626a = new DownloadTask.C13110b(qib0.f154693H.getDownloadHttp()).m79642q(str).m79640o(str3).m79635j(new f30() { // from class: l.rem
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                e51.m114742G(new Runnable() { // from class: l.iem
                    @Override // java.lang.Runnable
                    public final void run() {
                        ImageBridgeImplementation.m79732d(coqVar, downloadTask, e30Var);
                    }
                });
            }
        }).m79631f(new f30() { // from class: l.sem
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                e51.m114742G(new Runnable() { // from class: l.jem
                    @Override // java.lang.Runnable
                    public final void run() {
                        ImageBridgeImplementation.m79742n(coqVar, e30Var);
                    }
                });
            }
        }).m79626a();
        if (C13111a.m79654u().m79674y(downloadTaskM79626a.m79623x())) {
            return;
        }
        C13111a.m79654u().m79665o(downloadTaskM79626a);
    }

    /* JADX INFO: renamed from: z */
    public final void m79770z(@NonNull final boq boqVar, final String str, final String str2) {
        e51.m114774y(new Runnable() { // from class: l.mem
            @Override // java.lang.Runnable
            public final void run() {
                this.f133449a.m79755C(boqVar, str2, str);
            }
        });
    }
}
