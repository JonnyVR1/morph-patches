package p149l;

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
import com.p046p1.mobile.putong.data.UploadSource;
import com.p046p1.mobile.putong.p065ui.download.C13111a;
import com.p046p1.mobile.putong.p065ui.download.DownloadTask;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.p046p1.mobile.putong.p065ui.webview.AccessTokenWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class b7i0 extends e400 {

    /* JADX INFO: renamed from: h */
    public String f73974h;

    /* JADX INFO: renamed from: i */
    public C15824e f73975i;

    /* JADX INFO: renamed from: l.b7i0$a */
    public class C15820a implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ f400 f73976a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f73977b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f73978c;

        public C15820a(f400 f400Var, String str, String str2) {
            this.f73976a = f400Var;
            this.f73977b = str;
            this.f73978c = str2;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m100676b(f400 f400Var, String str, String str2) {
            b7i0.this.m100663l0(f400Var, str2, str);
        }

        @Override // p149l.d30
        public void call() {
            b7i0 b7i0Var = b7i0.this;
            final f400 f400Var = this.f73976a;
            String str = this.f73977b;
            final String str2 = this.f73978c;
            b7i0Var.m100651a0(f400Var, str, new e30() { // from class: l.a7i0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f67931a.m100676b(f400Var, str2, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.b7i0$b */
    public class C15821b implements e30<PermissionHelper.PermissionDeniedReason> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ f400 f73980a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f73981b;

        public C15821b(f400 f400Var, String str) {
            this.f73980a = f400Var;
            this.f73981b = str;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
            b7i0.this.m100663l0(this.f73980a, "refuse", this.f73981b);
        }
    }

    /* JADX INFO: renamed from: l.b7i0$c */
    public class C15822c implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ f400 f73983a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f73984b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f73985c;

        public C15822c(f400 f400Var, String str, String str2) {
            this.f73983a = f400Var;
            this.f73984b = str;
            this.f73985c = str2;
        }

        @Override // p149l.d30
        public void call() {
            b7i0.this.m100652b0(this.f73983a, this.f73984b, this.f73985c);
        }
    }

    /* JADX INFO: renamed from: l.b7i0$d */
    public class C15823d implements e30<PermissionHelper.PermissionDeniedReason> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ f400 f73987a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f73988b;

        public C15823d(f400 f400Var, String str) {
            this.f73987a = f400Var;
            this.f73988b = str;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
            b7i0.this.m100663l0(this.f73987a, "refuse", this.f73988b);
        }
    }

    /* JADX INFO: renamed from: l.b7i0$e */
    public class C15824e implements C4317a.a {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final f400 f73990a;

        public C15824e(f400 f400Var) {
            this.f73990a = f400Var;
        }

        @Override // com.p046p1.mobile.android.app.C4317a.a
        /* JADX INFO: renamed from: a */
        public boolean mo20401a(int i, int i2, Intent intent) {
            if (i2 != -1) {
                return false;
            }
            b7i0 b7i0Var = b7i0.this;
            b7i0Var.m100665n0(this.f73990a, i, i2, intent, Act.tempFileName, b7i0Var.f73974h);
            Act.tempFileName = null;
            return true;
        }

        /* JADX INFO: renamed from: b */
        public void m100679b() {
            if (this.f73990a.mo102961c() != null) {
                this.f73990a.mo102961c().registerOnActivityResultListener(this);
            }
        }

        /* JADX INFO: renamed from: c */
        public void m100680c() {
            if (this.f73990a.mo102961c() != null) {
                this.f73990a.mo102961c().unregisterOnActivityResultListener(this);
            }
        }
    }

    public b7i0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m100627C(PutongAct putongAct, Dialog dialog, View view) {
        if (putongAct instanceof AccessTokenWebViewAct) {
            putongAct.pickImagesWithPicker(1, false, false, false, qib0.f154714c0.mo97502P1(), gen.REQUEST_JSCODE_PICKER);
        } else {
            putongAct.pickImagesWithPicker(1, false, false, false, gen.REQUEST_JSCODE_PICKER);
        }
        if (dialog.isShowing()) {
            dialog.dismiss();
            dialog.m20458P().setTag("cancel");
        }
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m100628D(PutongAct putongAct, Dialog dialog, View view) {
        oyx.m166738l(putongAct);
        if (dialog.isShowing()) {
            dialog.dismiss();
            dialog.m20458P().setTag("cancel");
        }
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m100629E(coq coqVar, DownloadTask downloadTask, e30 e30Var) {
        if (coqVar.mo102960b()) {
            return;
        }
        App.f15369e.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://" + downloadTask.m79621v())));
        e30Var.call("success");
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m100634J(Dialog dialog, d30 d30Var, DialogInterface dialogInterface) {
        if (TextUtils.isEmpty((String) dialog.m20458P().getTag()) && NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m100637M(Dialog dialog, d30 d30Var, View view) {
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ Picture m100642R(List list) {
        return (Picture) list.get(0);
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m100643S(coq coqVar, e30 e30Var) {
        if (coqVar.mo102960b()) {
            return;
        }
        e30Var.call("failed");
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m100645U(f400 f400Var, Throwable th) {
        f400Var.mo102961c().progressDismiss();
        lsi0.m151593w(R$string.f17321F);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m100651a0(@NonNull final coq coqVar, String str, final e30<String> e30Var) {
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
        DownloadTask downloadTaskM79626a = new DownloadTask.C13110b(qib0.f154693H.getDownloadHttp()).m79642q(str).m79640o(str3).m79635j(new f30() { // from class: l.j6i0
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                e51.m114742G(new Runnable() { // from class: l.o6i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        b7i0.m100629E(coqVar, downloadTask, e30Var);
                    }
                });
            }
        }).m79631f(new f30() { // from class: l.k6i0
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                e51.m114742G(new Runnable() { // from class: l.p6i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        b7i0.m100643S(coqVar, e30Var);
                    }
                });
            }
        }).m79626a();
        if (C13111a.m79654u().m79674y(downloadTaskM79626a.m79623x())) {
            return;
        }
        C13111a.m79654u().m79665o(downloadTaskM79626a);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m100652b0(@NonNull final f400 f400Var, final String str, final String str2) {
        e51.m114774y(new Runnable() { // from class: l.r6i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f157940a.m100660j0(f400Var, str2, str);
            }
        });
    }

    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final void m100656f0(@NonNull f400 f400Var, JSONObject jSONObject) {
        final String strOptString = jSONObject.optString("success");
        this.f73974h = strOptString;
        C15824e c15824e = this.f73975i;
        if (c15824e != null) {
            c15824e.m100680c();
        }
        C15824e c15824e2 = new C15824e(f400Var);
        this.f73975i = c15824e2;
        c15824e2.m100679b();
        m100668q0(f400Var.mo102961c(), new d30() { // from class: l.t6i0
            @Override // p149l.d30
            public final void call() {
                this.f168617a.m100661k0(strOptString);
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    public final void m100654d0(@NonNull f400 f400Var, JSONObject jSONObject) {
        m100655e0(f400Var, jSONObject.optString("url"), jSONObject.optString("resultCallback"));
    }

    /* JADX INFO: renamed from: e0 */
    public final void m100655e0(@NonNull final f400 f400Var, String str, final String str2) {
        if (zqx.m219898k()) {
            m100651a0(f400Var, str, new e30() { // from class: l.s6i0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f162826a.m100663l0(f400Var, str2, (String) obj);
                }
            });
        } else {
            PermissionHelper.m79882c().m79900r("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE").m79895m(new C15820a(f400Var, str, str2), new C15821b(f400Var, str2)).m79891i(f400Var.mo102961c());
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m100657g0(f400 f400Var, String str) {
        m100663l0(f400Var, "failed", str);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m100658h0(f400 f400Var, String str) {
        m100663l0(f400Var, "success", str);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m100659i0(f400 f400Var, String str) {
        m100663l0(f400Var, "failed", str);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m100660j0(final f400 f400Var, final String str, String str2) {
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
            e51.m114748M(new Runnable() { // from class: l.u6i0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f174839a.m100657g0(f400Var, str);
                }
            });
        } else if (bpd0.m103053a(str2, new File(str3))) {
            e51.m114748M(new Runnable() { // from class: l.v6i0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f180193a.m100658h0(f400Var, str);
                }
            });
        } else {
            e51.m114748M(new Runnable() { // from class: l.w6i0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f184847a.m100659i0(f400Var, str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m100661k0(String str) {
        m114660y(str, "", "canceled");
    }

    @Override // p149l.e400
    /* JADX INFO: renamed from: l */
    public void mo100662l(MKWebView mKWebView) {
        super.mo100662l(mKWebView);
        C15824e c15824e = this.f73975i;
        if (c15824e != null) {
            c15824e.m100680c();
        }
        this.f73975i = null;
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m100664m0(f400 f400Var, String str, Picture picture) {
        f400Var.mo102961c().progressDismiss();
        m100670s0(f400Var, picture.url, null, str);
    }

    @Override // p149l.e400
    /* JADX INFO: renamed from: n */
    public boolean mo46640n(@NonNull final f400 f400Var, String str, String str2, final JSONObject jSONObject) {
        str2.getClass();
        switch (str2) {
            case "imageSave":
                m100654d0(f400Var, jSONObject);
                return true;
            case "saveBase64ImageData":
                m100672u0(f400Var, jSONObject);
                return true;
            case "pickImages":
                m100669r0(f400Var, jSONObject);
                return true;
            case "imagePicker":
                e51.m114748M(new Runnable() { // from class: l.h6i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f106064a.m100656f0(f400Var, jSONObject);
                    }
                });
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final boolean m100665n0(@NonNull f400 f400Var, int i, int i2, Intent intent, String str, String str2) {
        if (i == 789) {
            m100666o0(f400Var, i2 == -1 ? (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f54603h) : null, i2, str2);
            return true;
        }
        if (i == 16384) {
            m100667p0(f400Var, str, i2, str2);
            return true;
        }
        m100673v0(f400Var);
        return false;
    }

    /* JADX INFO: renamed from: o0 */
    public void m100666o0(@NonNull f400 f400Var, List<Media> list, int i, String str) {
        if (i != -1 || list.size() <= 0) {
            m100670s0(f400Var, "", "canceled", str);
            return;
        }
        Media media = list.get(0);
        if (media instanceof Picture) {
            Picture picture = (Picture) media;
            picture.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
            pgm pgmVar = new pgm(rhi.m179382z(picture.url));
            picture.mediaType = pgmVar.f148729c;
            picture.size = new Dimension(pgmVar.f148730d);
            m100674w0(f400Var, picture, str);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m100667p0(@NonNull f400 f400Var, String str, int i, String str2) {
        if (i != -1) {
            m100670s0(f400Var, "", "canceled", str2);
            return;
        }
        Picture picture = new Picture();
        picture.url = rhi.m179355B(str);
        picture.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
        pgm pgmVar = new pgm(rhi.m179382z(picture.url));
        picture.mediaType = pgmVar.f148729c;
        picture.size = new Dimension(pgmVar.f148730d);
        m100674w0(f400Var, picture, str2);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m100668q0(final PutongAct putongAct, final d30 d30Var) {
        View viewInflate = LayoutInflater.from(putongAct).inflate(e6c0.f89531M, (ViewGroup) null, false);
        View viewFindViewById = viewInflate.findViewById(s4c0.f162291E);
        View viewFindViewById2 = viewInflate.findViewById(s4c0.f162289D);
        View viewFindViewById3 = viewInflate.findViewById(s4c0.f162351o);
        final Dialog dialogM20567z = putongAct.dialog().m20516L(u7c0.f174992j).m20519O(viewInflate).m20567z();
        dialogM20567z.setCanceledOnTouchOutside(false);
        dialogM20567z.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.x6i0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                b7i0.m100634J(dialogM20567z, d30Var, dialogInterface);
            }
        });
        dialogM20567z.show();
        Window window = dialogM20567z.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.gravity = 80;
        window.setAttributes(attributes);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.y6i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b7i0.m100628D(putongAct, dialogM20567z, view);
            }
        });
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: l.z6i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b7i0.m100627C(putongAct, dialogM20567z, view);
            }
        });
        viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: l.i6i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b7i0.m100637M(dialogM20567z, d30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public final void m100669r0(@NonNull f400 f400Var, JSONObject jSONObject) {
        rd70.m178956n(f400Var, jSONObject);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m100670s0(@NonNull f400 f400Var, String str, String str2, String str3) {
        m114660y(str3, str, str2);
    }

    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public final void m100663l0(@NonNull f400 f400Var, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "adtp";
        }
        m114660y(str2, str);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m100672u0(@NonNull f400 f400Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("data");
        String strOptString2 = jSONObject.optString("callback");
        if (zqx.m219898k()) {
            m100652b0(f400Var, strOptString, strOptString2);
        } else {
            PermissionHelper.m79882c().m79900r("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE").m79895m(new C15822c(f400Var, strOptString, strOptString2), new C15823d(f400Var, strOptString2)).m79891i(f400Var.mo102961c());
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m100673v0(@NonNull f400 f400Var) {
        C15824e c15824e = this.f73975i;
        if (c15824e != null) {
            c15824e.m100680c();
        }
        this.f73975i = null;
    }

    /* JADX INFO: renamed from: w0 */
    public final void m100674w0(@NonNull final f400 f400Var, final Picture picture, final String str) {
        f400Var.mo102961c().progress(R$string.f17389W);
        new lsx(vwb.m200324f0(picture), false).flatMap(new w9j() { // from class: l.l6i0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ya5.m213795K(vwb.m200324f0(picture), "profile", null, UploadSource.get("report")).map(new w9j() { // from class: l.q6i0
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return b7i0.m100642R((List) obj2);
                    }
                });
            }
        }).compose(mkd0.m154951C()).subscribe(mkd0.m154956H(new e30() { // from class: l.m6i0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f131692a.m100664m0(f400Var, str, (Picture) obj);
            }
        }, new e30() { // from class: l.n6i0
            @Override // p149l.e30
            public final void call(Object obj) {
                b7i0.m100645U(f400Var, (Throwable) obj);
            }
        }));
    }
}
