package p009l;

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
import com.sina.weibo.sdk.web.WebPicUploadResult;
import com.tantanapp.common.utils.NullChecker;
import immomo.com.mklibrary.core.base.ui.MKWebView;
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
import l.rhi;
import l.s4c0;
import l.u7c0;
import l.vwb;
import l.w9j;
import l.ya5;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class b7i0 extends e400 {

    /* JADX INFO: renamed from: h */
    public String f9927h;

    /* JADX INFO: renamed from: i */
    public C0778e f9928i;

    /* JADX INFO: renamed from: l.b7i0$a */
    public class C0774a implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ f400 f9929a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f9930b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f9931c;

        public C0774a(f400 f400Var, String str, String str2) {
            this.f9929a = f400Var;
            this.f9930b = str;
            this.f9931c = str2;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m11893b(f400 f400Var, String str, String str2) {
            b7i0.this.m11880l0(f400Var, str2, str);
        }

        public void call() {
            b7i0 b7i0Var = b7i0.this;
            final f400 f400Var = this.f9929a;
            String str = this.f9930b;
            final String str2 = this.f9931c;
            b7i0Var.m11868a0(f400Var, str, new e30() { // from class: l.a7i0
                public final void call(Object obj) {
                    this.f9319a.m11893b(f400Var, str2, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.b7i0$b */
    public class C0775b implements e30<PermissionHelper.PermissionDeniedReason> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ f400 f9933a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f9934b;

        public C0775b(f400 f400Var, String str) {
            this.f9933a = f400Var;
            this.f9934b = str;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
            b7i0.this.m11880l0(this.f9933a, "refuse", this.f9934b);
        }
    }

    /* JADX INFO: renamed from: l.b7i0$c */
    public class C0776c implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ f400 f9936a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f9937b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f9938c;

        public C0776c(f400 f400Var, String str, String str2) {
            this.f9936a = f400Var;
            this.f9937b = str;
            this.f9938c = str2;
        }

        public void call() {
            b7i0.this.m11869b0(this.f9936a, this.f9937b, this.f9938c);
        }
    }

    /* JADX INFO: renamed from: l.b7i0$d */
    public class C0777d implements e30<PermissionHelper.PermissionDeniedReason> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ f400 f9940a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f9941b;

        public C0777d(f400 f400Var, String str) {
            this.f9940a = f400Var;
            this.f9941b = str;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
            b7i0.this.m11880l0(this.f9940a, "refuse", this.f9941b);
        }
    }

    /* JADX INFO: renamed from: l.b7i0$e */
    public class C0778e implements a.a {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final f400 f9943a;

        public C0778e(f400 f400Var) {
            this.f9943a = f400Var;
        }

        /* JADX INFO: renamed from: a */
        public boolean m11896a(int i, int i2, Intent intent) {
            if (i2 != -1) {
                return false;
            }
            b7i0 b7i0Var = b7i0.this;
            b7i0Var.m11882n0(this.f9943a, i, i2, intent, Act.tempFileName, b7i0Var.f9927h);
            Act.tempFileName = null;
            return true;
        }

        /* JADX INFO: renamed from: b */
        public void m11897b() {
            if (this.f9943a.mo12184c() != null) {
                this.f9943a.mo12184c().registerOnActivityResultListener(this);
            }
        }

        /* JADX INFO: renamed from: c */
        public void m11898c() {
            if (this.f9943a.mo12184c() != null) {
                this.f9943a.mo12184c().unregisterOnActivityResultListener(this);
            }
        }
    }

    public b7i0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m11844C(PutongAct putongAct, Dialog dialog, View view) {
        if (putongAct instanceof AccessTokenWebViewAct) {
            putongAct.pickImagesWithPicker(1, false, false, false, qib0.c0.P1(), 789);
        } else {
            putongAct.pickImagesWithPicker(1, false, false, false, 789);
        }
        if (dialog.isShowing()) {
            dialog.dismiss();
            dialog.P().setTag("cancel");
        }
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m11845D(PutongAct putongAct, Dialog dialog, View view) {
        oyx.m20072l(putongAct);
        if (dialog.isShowing()) {
            dialog.dismiss();
            dialog.P().setTag("cancel");
        }
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m11846E(coq coqVar, DownloadTask downloadTask, e30 e30Var) {
        if (coqVar.mo12183b()) {
            return;
        }
        App.e.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://" + downloadTask.m9942v())));
        e30Var.call("success");
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m11851J(Dialog dialog, d30 d30Var, DialogInterface dialogInterface) {
        if (TextUtils.isEmpty((String) dialog.P().getTag()) && NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m11854M(Dialog dialog, d30 d30Var, View view) {
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ Picture m11859R(List list) {
        return (Picture) list.get(0);
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m11860S(coq coqVar, e30 e30Var) {
        if (coqVar.mo12183b()) {
            return;
        }
        e30Var.call("failed");
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m11862U(f400 f400Var, Throwable th) {
        f400Var.mo12184c().progressDismiss();
        lsi0.w(R.string.F);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m11868a0(@NonNull final coq coqVar, String str, final e30<String> e30Var) {
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
        DownloadTask downloadTaskM9947a = new DownloadTask.C0512b(qib0.H.getDownloadHttp()).m9963q(str).m9961o(str3).m9956j(new f30() { // from class: l.j6i0
            public final void call(Object obj, Object obj2) {
                e51.G(new Runnable() { // from class: l.o6i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        b7i0.m11846E(coqVar, downloadTask, e30Var);
                    }
                });
            }
        }).m9952f(new f30() { // from class: l.k6i0
            public final void call(Object obj, Object obj2) {
                e51.G(new Runnable() { // from class: l.p6i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        b7i0.m11860S(coqVar, e30Var);
                    }
                });
            }
        }).m9947a();
        if (C0513a.m9975u().m9995y(downloadTaskM9947a.m9944x())) {
            return;
        }
        C0513a.m9975u().m9986o(downloadTaskM9947a);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m11869b0(@NonNull final f400 f400Var, final String str, final String str2) {
        e51.y(new Runnable() { // from class: l.r6i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f19649a.m11877j0(f400Var, str2, str);
            }
        });
    }

    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final void m11873f0(@NonNull f400 f400Var, JSONObject jSONObject) {
        final String strOptString = jSONObject.optString("success");
        this.f9927h = strOptString;
        C0778e c0778e = this.f9928i;
        if (c0778e != null) {
            c0778e.m11898c();
        }
        C0778e c0778e2 = new C0778e(f400Var);
        this.f9928i = c0778e2;
        c0778e2.m11897b();
        m11885q0(f400Var.mo12184c(), new d30() { // from class: l.t6i0
            public final void call() {
                this.f20569a.m11878k0(strOptString);
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    public final void m11871d0(@NonNull f400 f400Var, JSONObject jSONObject) {
        m11872e0(f400Var, jSONObject.optString("url"), jSONObject.optString("resultCallback"));
    }

    /* JADX INFO: renamed from: e0 */
    public final void m11872e0(@NonNull final f400 f400Var, String str, final String str2) {
        if (zqx.m25938k()) {
            m11868a0(f400Var, str, new e30() { // from class: l.s6i0
                public final void call(Object obj) {
                    this.f20116a.m11880l0(f400Var, str2, (String) obj);
                }
            });
        } else {
            PermissionHelper.m10211c().m10229r("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE").m10224m(new C0774a(f400Var, str, str2), new C0775b(f400Var, str2)).m10220i(f400Var.mo12184c());
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m11874g0(f400 f400Var, String str) {
        m11880l0(f400Var, "failed", str);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m11875h0(f400 f400Var, String str) {
        m11880l0(f400Var, "success", str);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m11876i0(f400 f400Var, String str) {
        m11880l0(f400Var, "failed", str);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m11877j0(final f400 f400Var, final String str, String str2) {
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
            e51.M(new Runnable() { // from class: l.u6i0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21004a.m11874g0(f400Var, str);
                }
            });
        } else if (bpd0.m12187a(str2, new File(str3))) {
            e51.M(new Runnable() { // from class: l.v6i0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21465a.m11875h0(f400Var, str);
                }
            });
        } else {
            e51.M(new Runnable() { // from class: l.w6i0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21922a.m11876i0(f400Var, str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m11878k0(String str) {
        m13719y(str, "", "canceled");
    }

    @Override // p009l.e400
    /* JADX INFO: renamed from: l */
    public void mo11879l(MKWebView mKWebView) {
        super.mo11879l(mKWebView);
        C0778e c0778e = this.f9928i;
        if (c0778e != null) {
            c0778e.m11898c();
        }
        this.f9928i = null;
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m11881m0(f400 f400Var, String str, Picture picture) {
        f400Var.mo12184c().progressDismiss();
        m11887s0(f400Var, ((Media) picture).url, null, str);
    }

    @Override // p009l.e400
    /* JADX INFO: renamed from: n */
    public boolean mo10568n(@NonNull final f400 f400Var, String str, String str2, final JSONObject jSONObject) {
        str2.getClass();
        switch (str2) {
            case "imageSave":
                m11871d0(f400Var, jSONObject);
                return true;
            case "saveBase64ImageData":
                m11889u0(f400Var, jSONObject);
                return true;
            case "pickImages":
                m11886r0(f400Var, jSONObject);
                return true;
            case "imagePicker":
                e51.M(new Runnable() { // from class: l.h6i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f13885a.m11873f0(f400Var, jSONObject);
                    }
                });
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final boolean m11882n0(@NonNull f400 f400Var, int i, int i2, Intent intent, String str, String str2) {
        if (i == 789) {
            m11883o0(f400Var, i2 == -1 ? (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f8209h) : null, i2, str2);
            return true;
        }
        if (i == 16384) {
            m11884p0(f400Var, str, i2, str2);
            return true;
        }
        m11890v0(f400Var);
        return false;
    }

    /* JADX INFO: renamed from: o0 */
    public void m11883o0(@NonNull f400 f400Var, List<Media> list, int i, String str) {
        if (i != -1 || list.size() <= 0) {
            m11887s0(f400Var, "", "canceled", str);
            return;
        }
        Media media = list.get(0);
        if (media instanceof Picture) {
            Picture picture = (Picture) media;
            ((Media) picture).status = MediaLocalStatus.get("preprocessed");
            pgm pgmVar = new pgm(rhi.z(((Media) picture).url));
            ((Media) picture).mediaType = pgmVar.c;
            picture.size = new Dimension(pgmVar.d);
            m11891w0(f400Var, picture, str);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m11884p0(@NonNull f400 f400Var, String str, int i, String str2) {
        if (i != -1) {
            m11887s0(f400Var, "", "canceled", str2);
            return;
        }
        Picture picture = new Picture();
        ((Media) picture).url = rhi.B(str);
        ((Media) picture).status = MediaLocalStatus.get("preprocessed");
        pgm pgmVar = new pgm(rhi.z(((Media) picture).url));
        ((Media) picture).mediaType = pgmVar.c;
        picture.size = new Dimension(pgmVar.d);
        m11891w0(f400Var, picture, str2);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m11885q0(final PutongAct putongAct, final d30 d30Var) {
        View viewInflate = LayoutInflater.from(putongAct).inflate(e6c0.M, (ViewGroup) null, false);
        View viewFindViewById = viewInflate.findViewById(s4c0.E);
        View viewFindViewById2 = viewInflate.findViewById(s4c0.D);
        View viewFindViewById3 = viewInflate.findViewById(s4c0.o);
        final Dialog dialogZ = putongAct.dialog().L(u7c0.j).O(viewInflate).z();
        dialogZ.setCanceledOnTouchOutside(false);
        dialogZ.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.x6i0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                b7i0.m11851J(dialogZ, d30Var, dialogInterface);
            }
        });
        dialogZ.show();
        Window window = dialogZ.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.gravity = 80;
        window.setAttributes(attributes);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.y6i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b7i0.m11845D(putongAct, dialogZ, view);
            }
        });
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: l.z6i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b7i0.m11844C(putongAct, dialogZ, view);
            }
        });
        viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: l.i6i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b7i0.m11854M(dialogZ, d30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public final void m11886r0(@NonNull f400 f400Var, JSONObject jSONObject) {
        rd70.m21597n(f400Var, jSONObject);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m11887s0(@NonNull f400 f400Var, String str, String str2, String str3) {
        m13719y(str3, str, str2);
    }

    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public final void m11880l0(@NonNull f400 f400Var, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "adtp";
        }
        m13719y(str2, str);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m11889u0(@NonNull f400 f400Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString(WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_DATA);
        String strOptString2 = jSONObject.optString("callback");
        if (zqx.m25938k()) {
            m11869b0(f400Var, strOptString, strOptString2);
        } else {
            PermissionHelper.m10211c().m10229r("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE").m10224m(new C0776c(f400Var, strOptString, strOptString2), new C0777d(f400Var, strOptString2)).m10220i(f400Var.mo12184c());
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m11890v0(@NonNull f400 f400Var) {
        C0778e c0778e = this.f9928i;
        if (c0778e != null) {
            c0778e.m11898c();
        }
        this.f9928i = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w0 */
    public final void m11891w0(@NonNull final f400 f400Var, final Picture picture, final String str) {
        f400Var.mo12184c().progress(R.string.W);
        new lsx(vwb.f0(new Media[]{picture}), false).flatMap(new w9j() { // from class: l.l6i0
            public final Object call(Object obj) {
                return ya5.K(vwb.f0(new Media[]{picture}), "profile", (String) null, UploadSource.get("report")).map(new w9j() { // from class: l.q6i0
                    public final Object call(Object obj2) {
                        return b7i0.m11859R((List) obj2);
                    }
                });
            }
        }).compose(mkd0.C()).subscribe(mkd0.H(new e30() { // from class: l.m6i0
            public final void call(Object obj) {
                this.f16737a.m11881m0(f400Var, str, (Picture) obj);
            }
        }, new e30() { // from class: l.n6i0
            public final void call(Object obj) {
                b7i0.m11862U(f400Var, (Throwable) obj);
            }
        }));
    }
}
