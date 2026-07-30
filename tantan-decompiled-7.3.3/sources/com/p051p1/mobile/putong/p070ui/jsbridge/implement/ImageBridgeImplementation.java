package com.p051p1.mobile.putong.p070ui.jsbridge.implement;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.common.R$string;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.UploadSource;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.p070ui.download.C13274a;
import com.p051p1.mobile.putong.p070ui.download.DownloadTask;
import com.p051p1.mobile.putong.p070ui.jsbridge.implement.ImageBridgeImplementation;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.p051p1.mobile.putong.p070ui.webview.AccessTokenWebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p153l.aqq;
import p153l.bqq;
import p153l.dxd0;
import p153l.hqq;
import p153l.i1y;
import p153l.jec0;
import p153l.jyb;
import p153l.l51;
import p153l.l7y;
import p153l.lf2;
import p153l.lkq;
import p153l.o1j0;
import p153l.oki;
import p153l.psd0;
import p153l.qcj;
import p153l.sim;
import p153l.uqb0;
import p153l.vel0;
import p153l.wel0;
import p153l.wzx;
import p153l.x20;
import p153l.y20;
import p153l.ycc0;
import p153l.z20;
import p153l.zfc0;

/* JADX INFO: loaded from: classes10.dex */
public class ImageBridgeImplementation extends lf2 {

    /* JADX INFO: renamed from: a */
    public String f55388a;

    /* JADX INFO: renamed from: b */
    public C13280e f55389b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.ImageBridgeImplementation$a */
    public class C13276a implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ bqq f55390a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f55391b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f55392c;

        public C13276a(bqq bqqVar, String str, String str2) {
            this.f55390a = bqqVar;
            this.f55391b = str;
            this.f55392c = str2;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m80955b(bqq bqqVar, String str, String str2) {
            ImageBridgeImplementation.this.m80942G(bqqVar, str2, str);
        }

        @Override // p153l.x20
        public void call() {
            ImageBridgeImplementation imageBridgeImplementation = ImageBridgeImplementation.this;
            final bqq bqqVar = this.f55390a;
            String str = this.f55391b;
            final String str2 = this.f55392c;
            imageBridgeImplementation.m80952y(bqqVar, str, new y20() { // from class: l.khm
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f126884a.m80955b(bqqVar, str2, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.ImageBridgeImplementation$b */
    public class C13277b implements y20<PermissionHelper.PermissionDeniedReason> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ bqq f55394a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f55395b;

        public C13277b(bqq bqqVar, String str) {
            this.f55394a = bqqVar;
            this.f55395b = str;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
            ImageBridgeImplementation.this.m80942G(this.f55394a, "refuse", this.f55395b);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.ImageBridgeImplementation$c */
    public class C13278c implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ aqq f55397a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f55398b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f55399c;

        public C13278c(aqq aqqVar, String str, String str2) {
            this.f55397a = aqqVar;
            this.f55398b = str;
            this.f55399c = str2;
        }

        @Override // p153l.x20
        public void call() {
            ImageBridgeImplementation.this.m80953z(this.f55397a, this.f55398b, this.f55399c);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.ImageBridgeImplementation$d */
    public class C13279d implements y20<PermissionHelper.PermissionDeniedReason> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ aqq f55401a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f55402b;

        public C13279d(aqq aqqVar, String str) {
            this.f55401a = aqqVar;
            this.f55402b = str;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
            ImageBridgeImplementation.this.m80942G(this.f55401a, "refuse", this.f55402b);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.ImageBridgeImplementation$e */
    public class C13280e implements C4468a.a {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final aqq f55404a;

        public C13280e(aqq aqqVar) {
            this.f55404a = aqqVar;
        }

        @Override // com.p051p1.mobile.android.app.C4468a.a
        /* JADX INFO: renamed from: a */
        public boolean mo21400a(int i, int i2, Intent intent) {
            if (i2 != -1) {
                return false;
            }
            ImageBridgeImplementation imageBridgeImplementation = ImageBridgeImplementation.this;
            imageBridgeImplementation.m80944I(this.f55404a, i, i2, intent, Act.tempFileName, imageBridgeImplementation.f55388a);
            Act.tempFileName = null;
            return true;
        }

        /* JADX INFO: renamed from: b */
        public void m80958b() {
            if (this.f55404a.mo99543c() != null) {
                this.f55404a.mo99543c().registerOnActivityResultListener(this);
            }
        }

        /* JADX INFO: renamed from: c */
        public void m80959c() {
            if (this.f55404a.mo99543c() != null) {
                this.f55404a.mo99543c().unregisterOnActivityResultListener(this);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m80914c(Dialog dialog, x20 x20Var, DialogInterface dialogInterface) {
        if (TextUtils.isEmpty((String) dialog.m21457P().getTag()) && NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m80915d(bqq bqqVar, DownloadTask downloadTask, y20 y20Var) {
        if (bqqVar.mo99542b()) {
            return;
        }
        App.f16088e.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://" + downloadTask.m80804v())));
        y20Var.call("success");
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m80916e(String str, aqq aqqVar) {
        if (TextUtils.isEmpty(str)) {
            str = "adtp";
        }
        aqqVar.mo99544d().mo97004b(str, "", "canceled");
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m80919h(aqq aqqVar, Throwable th) {
        aqqVar.mo99543c().progressDismiss();
        o1j0.m165621C(R$string.f18040F);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m80921j(PutongAct putongAct, boolean z, Dialog dialog, View view) {
        if (putongAct instanceof AccessTokenWebViewAct) {
            putongAct.pickImagesWithPicker(1, false, z, false, uqb0.f180397c0.mo105291P1(), z ? 790 : 789);
        } else {
            putongAct.pickImagesWithPicker(1, false, z, false, z ? 790 : 789);
        }
        if (dialog.isShowing()) {
            dialog.dismiss();
            dialog.m21457P().setTag("cancel");
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m80922k(PutongAct putongAct, Dialog dialog, View view) {
        l7y.m153160l(putongAct);
        if (dialog.isShowing()) {
            dialog.dismiss();
            dialog.m21457P().setTag("cancel");
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m80925n(bqq bqqVar, y20 y20Var) {
        if (bqqVar.mo99542b()) {
            return;
        }
        y20Var.call("failed");
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m80930s(String str, aqq aqqVar) {
        if (TextUtils.isEmpty(str)) {
            str = "adtp";
        }
        aqqVar.mo99544d().mo97004b(str, "", "canceled", "false", "");
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ Media m80931t(List list) {
        return (Media) list.get(0);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m80932u(Dialog dialog, x20 x20Var, View view) {
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m80936A(@NonNull aqq aqqVar, String str, String str2, String str3, boolean z, String str4) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "adtp";
        }
        hqq hqqVarMo99544d = aqqVar.mo99544d();
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        hqqVarMo99544d.mo97004b(str3, str, str2, z ? "true" : "false", str4);
    }

    /* JADX INFO: renamed from: B */
    public final void m80937B(@NonNull final bqq bqqVar, String str, final String str2) {
        if (wzx.m208784k()) {
            m80952y(bqqVar, str, new y20() { // from class: l.rgm
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f163022a.m80942G(bqqVar, str2, (String) obj);
                }
            });
        } else {
            PermissionHelper.m81065c().m81083r("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE").m81078m(new C13276a(bqqVar, str, str2), new C13277b(bqqVar, str2)).m81074i(bqqVar.mo99543c());
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m80938C(final aqq aqqVar, final String str, String str2) {
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
            l51.m152893M(new Runnable() { // from class: l.ehm
                @Override // java.lang.Runnable
                public final void run() {
                    this.f94050a.m80939D(aqqVar, str);
                }
            });
        } else if (dxd0.m118465a(str2, new File(str3))) {
            l51.m152893M(new Runnable() { // from class: l.fhm
                @Override // java.lang.Runnable
                public final void run() {
                    this.f99083a.m80940E(aqqVar, str);
                }
            });
        } else {
            l51.m152893M(new Runnable() { // from class: l.ghm
                @Override // java.lang.Runnable
                public final void run() {
                    this.f104132a.m80941F(aqqVar, str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m80939D(aqq aqqVar, String str) {
        m80942G(aqqVar, "failed", str);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m80940E(aqq aqqVar, String str) {
        m80942G(aqqVar, "success", str);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m80941F(aqq aqqVar, String str) {
        m80942G(aqqVar, "failed", str);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m80943H(aqq aqqVar, boolean z, String str, Media media) {
        boolean z2;
        aqqVar.mo99543c().progressDismiss();
        if (!z) {
            m80948M(aqqVar, media.url, null, str);
            return;
        }
        String str2 = "";
        if (media instanceof Video) {
            z2 = true;
            if (NullChecker.m82486a(media.cover())) {
                str2 = media.cover().url;
            }
        } else {
            z2 = false;
        }
        m80936A(aqqVar, media.url, null, str, z2, str2);
    }

    /* JADX INFO: renamed from: I */
    public final boolean m80944I(@NonNull aqq aqqVar, int i, int i2, Intent intent, String str, String str2) {
        if (i == 789) {
            m80945J(aqqVar, i2 == -1 ? (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f55451h) : null, i2, str2, false);
            return true;
        }
        if (i == 790) {
            m80945J(aqqVar, i2 == -1 ? (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f55451h) : null, i2, str2, true);
            return true;
        }
        if (i == 16384) {
            m80946K(aqqVar, str, i2, str2);
            return true;
        }
        m80950O(aqqVar);
        return false;
    }

    /* JADX INFO: renamed from: J */
    public void m80945J(@NonNull aqq aqqVar, List<Media> list, int i, String str, boolean z) {
        if (i != -1 || list.size() <= 0) {
            m80948M(aqqVar, "", "canceled", str);
            return;
        }
        Media media = list.get(0);
        if (media instanceof Picture) {
            Picture picture = (Picture) media;
            picture.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
            sim simVar = new sim(oki.m168038z(picture.url));
            picture.mediaType = simVar.f168842c;
            picture.size = new Dimension(simVar.f168843d);
            m80951P(aqqVar, picture, str, z);
            return;
        }
        if (media instanceof Video) {
            Video video = (Video) media;
            video.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
            video.cover = Picture.new_();
            video.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4;
            wel0 wel0Var = new wel0(new vel0(oki.m168038z(video.url)), false, false);
            video.size = new Dimension(wel0Var.m206021m());
            try {
                video.cover.url = oki.m168011B(wel0Var.m206013c(0));
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
            video.cover.size = new Dimension(wel0Var.m206019k());
            video.cover.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
            float f = video.duration;
            if (f >= 16000.0f) {
                o1j0.m165636j("你的视频长度太长了，请保持在16秒内");
            } else if (f < 3000.0f) {
                o1j0.m165636j("你的视频长度太短了，请大于3秒");
            } else {
                m80951P(aqqVar, video, str, z);
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public void m80946K(@NonNull aqq aqqVar, String str, int i, String str2) {
        if (i != -1) {
            m80948M(aqqVar, "", "canceled", str2);
            return;
        }
        Picture picture = new Picture();
        picture.url = oki.m168011B(str);
        picture.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
        sim simVar = new sim(oki.m168038z(picture.url));
        picture.mediaType = simVar.f168842c;
        picture.size = new Dimension(simVar.f168843d);
        m80951P(aqqVar, picture, str2, false);
    }

    /* JADX INFO: renamed from: L */
    public final void m80947L(final PutongAct putongAct, final x20 x20Var, final boolean z) {
        View viewInflate = LayoutInflater.from(putongAct).inflate(jec0.f120444M, (ViewGroup) null, false);
        View viewFindViewById = viewInflate.findViewById(ycc0.f198412E);
        View viewFindViewById2 = viewInflate.findViewById(ycc0.f198410D);
        View viewFindViewById3 = viewInflate.findViewById(ycc0.f198472o);
        final Dialog dialogM21566z = putongAct.dialog().m21515L(zfc0.f204124j).m21518O(viewInflate).m21566z();
        dialogM21566z.setCanceledOnTouchOutside(false);
        dialogM21566z.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.jhm
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ImageBridgeImplementation.m80914c(dialogM21566z, x20Var, dialogInterface);
            }
        });
        dialogM21566z.show();
        Window window = dialogM21566z.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.gravity = 80;
        window.setAttributes(attributes);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.sgm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageBridgeImplementation.m80922k(putongAct, dialogM21566z, view);
            }
        });
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: l.tgm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageBridgeImplementation.m80921j(putongAct, z, dialogM21566z, view);
            }
        });
        viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: l.ugm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageBridgeImplementation.m80932u(dialogM21566z, x20Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public final void m80948M(@NonNull aqq aqqVar, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "adtp";
        }
        aqqVar.mo99544d().mo97004b(str3, str, str2);
    }

    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void m80942G(@NonNull bqq bqqVar, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "adtp";
        }
        bqqVar.mo99544d().mo97004b(str2, str);
    }

    /* JADX INFO: renamed from: O */
    public final void m80950O(@NonNull aqq aqqVar) {
        C13280e c13280e = this.f55389b;
        if (c13280e != null) {
            c13280e.m80959c();
        }
        this.f55389b = null;
    }

    /* JADX INFO: renamed from: P */
    public final void m80951P(@NonNull final aqq aqqVar, final Media media, final String str, final boolean z) {
        aqqVar.mo99543c().progress(R$string.f18108W);
        new i1y(jyb.m147507f0(media), false).flatMap(new qcj() { // from class: l.vgm
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return yb5.m214982K(jyb.m147507f0(media), "app-loading", "h5-loading", UploadSource.get("report")).map(new qcj() { // from class: l.ahm
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return ImageBridgeImplementation.m80931t((List) obj2);
                    }
                });
            }
        }).compose(psd0.m173592C()).subscribe(psd0.m173597H(new y20() { // from class: l.wgm
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188987a.m80943H(aqqVar, z, str, (Media) obj);
            }
        }, new y20() { // from class: l.xgm
            @Override // p153l.y20
            public final void call(Object obj) {
                ImageBridgeImplementation.m80919h(aqqVar, (Throwable) obj);
            }
        }));
    }

    @Override // p153l.lf2
    /* JADX INFO: renamed from: a */
    public synchronized void mo47711a() {
        try {
            super.mo47711a();
            C13280e c13280e = this.f55389b;
            if (c13280e != null) {
                c13280e.m80959c();
            }
            this.f55389b = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @lkq(key = SchemeKey.imagePicker, uiThread = true)
    public void imagePicker(@NonNull final aqq aqqVar, final String str) {
        this.f55388a = str;
        C13280e c13280e = this.f55389b;
        if (c13280e != null) {
            c13280e.m80959c();
        }
        C13280e c13280e2 = new C13280e(aqqVar);
        this.f55389b = c13280e2;
        c13280e2.m80958b();
        m80947L(aqqVar.mo99543c(), new x20() { // from class: l.dhm
            @Override // p153l.x20
            public final void call() {
                ImageBridgeImplementation.m80916e(str, aqqVar);
            }
        }, false);
    }

    @lkq(key = "imagePickerWithVideo", uiThread = true)
    public void imagePickerWithVideo(@NonNull final aqq aqqVar, final String str) {
        this.f55388a = str;
        this.f55389b = new C13280e(aqqVar);
        aqqVar.mo99543c().registerOnActivityResultListener(this.f55389b);
        m80947L(aqqVar.mo99543c(), new x20() { // from class: l.bhm
            @Override // p153l.x20
            public final void call() {
                ImageBridgeImplementation.m80930s(str, aqqVar);
            }
        }, true);
    }

    @lkq(key = "imageSave")
    public void imageSave(@NonNull aqq aqqVar, String str, String str2) {
        m80937B(aqqVar, str, str2);
    }

    @lkq(key = "saveBase64ImageData")
    public void saveBase64ImageData(@NonNull aqq aqqVar, String str, String str2) {
        if (wzx.m208784k()) {
            m80953z(aqqVar, str, str2);
        } else {
            PermissionHelper.m81065c().m81083r("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE").m81078m(new C13278c(aqqVar, str, str2), new C13279d(aqqVar, str2)).m81074i(aqqVar.mo99543c());
        }
    }

    /* JADX INFO: renamed from: y */
    public void m80952y(@NonNull final bqq bqqVar, String str, final y20<String> y20Var) {
        String str2;
        String str3;
        if (TextUtils.isEmpty(str)) {
            y20Var.call("failed");
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
            y20Var.call("failed");
            return;
        }
        DownloadTask downloadTaskM80809a = new DownloadTask.C13273b(uqb0.f180376H.getDownloadHttp()).m80825q(str).m80823o(str3).m80818j(new z20() { // from class: l.hhm
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                l51.m152887G(new Runnable() { // from class: l.ygm
                    @Override // java.lang.Runnable
                    public final void run() {
                        ImageBridgeImplementation.m80915d(bqqVar, downloadTask, y20Var);
                    }
                });
            }
        }).m80814f(new z20() { // from class: l.ihm
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                l51.m152887G(new Runnable() { // from class: l.zgm
                    @Override // java.lang.Runnable
                    public final void run() {
                        ImageBridgeImplementation.m80925n(bqqVar, y20Var);
                    }
                });
            }
        }).m80809a();
        if (C13274a.m80837u().m80857y(downloadTaskM80809a.m80806x())) {
            return;
        }
        C13274a.m80837u().m80848o(downloadTaskM80809a);
    }

    /* JADX INFO: renamed from: z */
    public final void m80953z(@NonNull final aqq aqqVar, final String str, final String str2) {
        l51.m152919y(new Runnable() { // from class: l.chm
            @Override // java.lang.Runnable
            public final void run() {
                this.f81849a.m80938C(aqqVar, str2, str);
            }
        });
    }
}
