package p153l;

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
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
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
import com.p051p1.mobile.putong.data.UploadSource;
import com.p051p1.mobile.putong.p070ui.download.C13274a;
import com.p051p1.mobile.putong.p070ui.download.DownloadTask;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.p051p1.mobile.putong.p070ui.webview.AccessTokenWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class bgi0 extends wc00 {

    /* JADX INFO: renamed from: h */
    public String f76643h;

    /* JADX INFO: renamed from: i */
    public C16007e f76644i;

    /* JADX INFO: renamed from: l.bgi0$a */
    public class C16003a implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ xc00 f76645a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f76646b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f76647c;

        public C16003a(xc00 xc00Var, String str, String str2) {
            this.f76645a = xc00Var;
            this.f76646b = str;
            this.f76647c = str2;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m104219b(xc00 xc00Var, String str, String str2) {
            bgi0.this.m104211t0(xc00Var, str2, str);
        }

        @Override // p153l.x20
        public void call() {
            bgi0 bgi0Var = bgi0.this;
            final xc00 xc00Var = this.f76645a;
            String str = this.f76646b;
            final String str2 = this.f76647c;
            bgi0Var.m104199i0(xc00Var, str, new y20() { // from class: l.agi0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f71161a.m104219b(xc00Var, str2, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.bgi0$b */
    public class C16004b implements y20<PermissionHelper.PermissionDeniedReason> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ xc00 f76649a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f76650b;

        public C16004b(xc00 xc00Var, String str) {
            this.f76649a = xc00Var;
            this.f76650b = str;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
            bgi0.this.m104211t0(this.f76649a, "refuse", this.f76650b);
        }
    }

    /* JADX INFO: renamed from: l.bgi0$c */
    public class C16005c implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ xc00 f76652a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f76653b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f76654c;

        public C16005c(xc00 xc00Var, String str, String str2) {
            this.f76652a = xc00Var;
            this.f76653b = str;
            this.f76654c = str2;
        }

        @Override // p153l.x20
        public void call() {
            bgi0.this.m104200j0(this.f76652a, this.f76653b, this.f76654c);
        }
    }

    /* JADX INFO: renamed from: l.bgi0$d */
    public class C16006d implements y20<PermissionHelper.PermissionDeniedReason> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ xc00 f76656a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f76657b;

        public C16006d(xc00 xc00Var, String str) {
            this.f76656a = xc00Var;
            this.f76657b = str;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
            bgi0.this.m104211t0(this.f76656a, "refuse", this.f76657b);
        }
    }

    /* JADX INFO: renamed from: l.bgi0$e */
    public class C16007e implements C4468a.a {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final xc00 f76659a;

        public C16007e(xc00 xc00Var) {
            this.f76659a = xc00Var;
        }

        @Override // com.p051p1.mobile.android.app.C4468a.a
        /* JADX INFO: renamed from: a */
        public boolean mo21400a(int i, int i2, Intent intent) {
            if (i2 != -1) {
                return false;
            }
            bgi0 bgi0Var = bgi0.this;
            bgi0Var.m104213v0(this.f76659a, i, i2, intent, Act.tempFileName, bgi0Var.f76643h);
            Act.tempFileName = null;
            return true;
        }

        /* JADX INFO: renamed from: b */
        public void m104222b() {
            if (this.f76659a.mo99543c() != null) {
                this.f76659a.mo99543c().registerOnActivityResultListener(this);
            }
        }

        /* JADX INFO: renamed from: c */
        public void m104223c() {
            if (this.f76659a.mo99543c() != null) {
                this.f76659a.mo99543c().unregisterOnActivityResultListener(this);
            }
        }
    }

    public bgi0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m104170K(PutongAct putongAct, Dialog dialog, View view) {
        if (putongAct instanceof AccessTokenWebViewAct) {
            putongAct.pickImagesWithPicker(1, false, false, false, uqb0.f180397c0.mo105291P1(), ggn.REQUEST_JSCODE_PICKER);
        } else {
            putongAct.pickImagesWithPicker(1, false, false, false, ggn.REQUEST_JSCODE_PICKER);
        }
        if (dialog.isShowing()) {
            dialog.dismiss();
            dialog.m21457P().setTag("cancel");
        }
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m104171L(PutongAct putongAct, Dialog dialog, View view) {
        l7y.m153160l(putongAct);
        if (dialog.isShowing()) {
            dialog.dismiss();
            dialog.m21457P().setTag("cancel");
        }
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m104172M(bqq bqqVar, DownloadTask downloadTask, y20 y20Var) {
        if (bqqVar.mo99542b()) {
            return;
        }
        App.f16088e.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://" + downloadTask.m80804v())));
        y20Var.call("success");
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m104177R(Dialog dialog, x20 x20Var, DialogInterface dialogInterface) {
        if (TextUtils.isEmpty((String) dialog.m21457P().getTag()) && NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m104180U(Dialog dialog, x20 x20Var, View view) {
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ Picture m104185Z(List list) {
        return (Picture) list.get(0);
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ void m104186a0(bqq bqqVar, y20 y20Var) {
        if (bqqVar.mo99542b()) {
            return;
        }
        y20Var.call("failed");
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m104188c0(xc00 xc00Var, Throwable th) {
        xc00Var.mo99543c().progressDismiss();
        o1j0.m165649w(R$string.f18040F);
    }

    /* JADX INFO: renamed from: A0 */
    public final void m104194A0(@NonNull xc00 xc00Var, String str, String str2, String str3) {
        m205739G(str3, str, str2);
    }

    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public final void m104211t0(@NonNull xc00 xc00Var, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "adtp";
        }
        m205739G(str2, str);
    }

    /* JADX INFO: renamed from: C0 */
    public final void m104196C0(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("data");
        String strOptString2 = jSONObject.optString("callback");
        if (wzx.m208784k()) {
            m104200j0(xc00Var, strOptString, strOptString2);
        } else {
            PermissionHelper.m81065c().m81083r("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE").m81078m(new C16005c(xc00Var, strOptString, strOptString2), new C16006d(xc00Var, strOptString2)).m81074i(xc00Var.mo99543c());
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final void m104197D0(@NonNull xc00 xc00Var) {
        C16007e c16007e = this.f76644i;
        if (c16007e != null) {
            c16007e.m104223c();
        }
        this.f76644i = null;
    }

    /* JADX INFO: renamed from: E0 */
    public final void m104198E0(@NonNull final xc00 xc00Var, final Picture picture, final String str) {
        xc00Var.mo99543c().progress(R$string.f18108W);
        new i1y(jyb.m147507f0(picture), false).flatMap(new qcj() { // from class: l.lfi0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return yb5.m214982K(jyb.m147507f0(picture), "profile", null, UploadSource.get("report")).map(new qcj() { // from class: l.qfi0
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return bgi0.m104185Z((List) obj2);
                    }
                });
            }
        }).compose(psd0.m173592C()).subscribe(psd0.m173597H(new y20() { // from class: l.mfi0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f136648a.m104212u0(xc00Var, str, (Picture) obj);
            }
        }, new y20() { // from class: l.nfi0
            @Override // p153l.y20
            public final void call(Object obj) {
                bgi0.m104188c0(xc00Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i0 */
    public final void m104199i0(@NonNull final bqq bqqVar, String str, final y20<String> y20Var) {
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
        DownloadTask downloadTaskM80809a = new DownloadTask.C13273b(uqb0.f180376H.getDownloadHttp()).m80825q(str).m80823o(str3).m80818j(new z20() { // from class: l.jfi0
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                l51.m152887G(new Runnable() { // from class: l.ofi0
                    @Override // java.lang.Runnable
                    public final void run() {
                        bgi0.m104172M(bqqVar, downloadTask, y20Var);
                    }
                });
            }
        }).m80814f(new z20() { // from class: l.kfi0
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                l51.m152887G(new Runnable() { // from class: l.pfi0
                    @Override // java.lang.Runnable
                    public final void run() {
                        bgi0.m104186a0(bqqVar, y20Var);
                    }
                });
            }
        }).m80809a();
        if (C13274a.m80837u().m80857y(downloadTaskM80809a.m80806x())) {
            return;
        }
        C13274a.m80837u().m80848o(downloadTaskM80809a);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m104200j0(@NonNull final xc00 xc00Var, final String str, final String str2) {
        l51.m152919y(new Runnable() { // from class: l.rfi0
            @Override // java.lang.Runnable
            public final void run() {
                this.f162796a.m104208r0(xc00Var, str2, str);
            }
        });
    }

    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public final void m104204n0(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        final String strOptString = jSONObject.optString("success");
        this.f76643h = strOptString;
        C16007e c16007e = this.f76644i;
        if (c16007e != null) {
            c16007e.m104223c();
        }
        C16007e c16007e2 = new C16007e(xc00Var);
        this.f76644i = c16007e2;
        c16007e2.m104222b();
        m104216y0(xc00Var.mo99543c(), new x20() { // from class: l.tfi0
            @Override // p153l.x20
            public final void call() {
                this.f173966a.m104209s0(strOptString);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public final void m104202l0(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        m104203m0(xc00Var, jSONObject.optString("url"), jSONObject.optString("resultCallback"));
    }

    /* JADX INFO: renamed from: m0 */
    public final void m104203m0(@NonNull final xc00 xc00Var, String str, final String str2) {
        if (wzx.m208784k()) {
            m104199i0(xc00Var, str, new y20() { // from class: l.sfi0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f167710a.m104211t0(xc00Var, str2, (String) obj);
                }
            });
        } else {
            PermissionHelper.m81065c().m81083r("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE").m81078m(new C16003a(xc00Var, str, str2), new C16004b(xc00Var, str2)).m81074i(xc00Var.mo99543c());
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m104205o0(xc00 xc00Var, String str) {
        m104211t0(xc00Var, "failed", str);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m104206p0(xc00 xc00Var, String str) {
        m104211t0(xc00Var, "success", str);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m104207q0(xc00 xc00Var, String str) {
        m104211t0(xc00Var, "failed", str);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m104208r0(final xc00 xc00Var, final String str, String str2) {
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
            l51.m152893M(new Runnable() { // from class: l.ufi0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f178769a.m104205o0(xc00Var, str);
                }
            });
        } else if (dxd0.m118465a(str2, new File(str3))) {
            l51.m152893M(new Runnable() { // from class: l.vfi0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f183943a.m104206p0(xc00Var, str);
                }
            });
        } else {
            l51.m152893M(new Runnable() { // from class: l.wfi0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f188852a.m104207q0(xc00Var, str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m104209s0(String str) {
        m205739G(str, "", "canceled");
    }

    @Override // p153l.wc00
    /* JADX INFO: renamed from: t */
    public void mo104210t(MKWebView mKWebView) {
        super.mo104210t(mKWebView);
        C16007e c16007e = this.f76644i;
        if (c16007e != null) {
            c16007e.m104223c();
        }
        this.f76644i = null;
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m104212u0(xc00 xc00Var, String str, Picture picture) {
        xc00Var.mo99543c().progressDismiss();
        m104194A0(xc00Var, picture.url, null, str);
    }

    @Override // p153l.wc00
    /* JADX INFO: renamed from: v */
    public boolean mo47831v(@NonNull final xc00 xc00Var, String str, String str2, final JSONObject jSONObject) {
        str2.getClass();
        switch (str2) {
            case "imageSave":
                m104202l0(xc00Var, jSONObject);
                return true;
            case "saveBase64ImageData":
                m104196C0(xc00Var, jSONObject);
                return true;
            case "pickImages":
                m104217z0(xc00Var, jSONObject);
                return true;
            case "imagePicker":
                l51.m152893M(new Runnable() { // from class: l.hfi0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f109299a.m104204n0(xc00Var, jSONObject);
                    }
                });
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final boolean m104213v0(@NonNull xc00 xc00Var, int i, int i2, Intent intent, String str, String str2) {
        if (i == 789) {
            m104214w0(xc00Var, i2 == -1 ? (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f55451h) : null, i2, str2);
            return true;
        }
        if (i == 16384) {
            m104215x0(xc00Var, str, i2, str2);
            return true;
        }
        m104197D0(xc00Var);
        return false;
    }

    /* JADX INFO: renamed from: w0 */
    public void m104214w0(@NonNull xc00 xc00Var, List<Media> list, int i, String str) {
        if (i != -1 || list.size() <= 0) {
            m104194A0(xc00Var, "", "canceled", str);
            return;
        }
        Media media = list.get(0);
        if (media instanceof Picture) {
            Picture picture = (Picture) media;
            picture.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
            sim simVar = new sim(oki.m168038z(picture.url));
            picture.mediaType = simVar.f168842c;
            picture.size = new Dimension(simVar.f168843d);
            m104198E0(xc00Var, picture, str);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public void m104215x0(@NonNull xc00 xc00Var, String str, int i, String str2) {
        if (i != -1) {
            m104194A0(xc00Var, "", "canceled", str2);
            return;
        }
        Picture picture = new Picture();
        picture.url = oki.m168011B(str);
        picture.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
        sim simVar = new sim(oki.m168038z(picture.url));
        picture.mediaType = simVar.f168842c;
        picture.size = new Dimension(simVar.f168843d);
        m104198E0(xc00Var, picture, str2);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m104216y0(final PutongAct putongAct, final x20 x20Var) {
        View viewInflate = LayoutInflater.from(putongAct).inflate(jec0.f120444M, (ViewGroup) null, false);
        View viewFindViewById = viewInflate.findViewById(ycc0.f198412E);
        View viewFindViewById2 = viewInflate.findViewById(ycc0.f198410D);
        View viewFindViewById3 = viewInflate.findViewById(ycc0.f198472o);
        final Dialog dialogM21566z = putongAct.dialog().m21515L(zfc0.f204124j).m21518O(viewInflate).m21566z();
        dialogM21566z.setCanceledOnTouchOutside(false);
        dialogM21566z.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.xfi0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                bgi0.m104177R(dialogM21566z, x20Var, dialogInterface);
            }
        });
        dialogM21566z.show();
        Window window = dialogM21566z.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.gravity = 80;
        window.setAttributes(attributes);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.yfi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bgi0.m104171L(putongAct, dialogM21566z, view);
            }
        });
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: l.zfi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bgi0.m104170K(putongAct, dialogM21566z, view);
            }
        });
        viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: l.ifi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bgi0.m104180U(dialogM21566z, x20Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: z0 */
    public final void m104217z0(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        xl70.m211541n(xc00Var, jSONObject);
    }
}
