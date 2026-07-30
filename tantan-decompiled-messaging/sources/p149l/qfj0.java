package p149l;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.cosmos.mdlog.MDLog;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.immomo.mmutil.FileUtil;
import com.immomo.mmutil.task.C3804c;
import com.p046p1.mobile.putong.core.data.Target;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import immomo.com.mklibrary.core.utils.MKWebCaptureHelper;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes2.dex */
public class qfj0 extends fnl {

    /* JADX INFO: renamed from: c */
    protected jiw f154130c;

    /* JADX INFO: renamed from: l.qfj0$a */
    public class RunnableC19485a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ JSONObject f154131a;

        public RunnableC19485a(JSONObject jSONObject) {
            this.f154131a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            qfj0.this.m174349v(this.f154131a);
        }
    }

    /* JADX INFO: renamed from: l.qfj0$b */
    public class RunnableC19486b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ JSONObject f154133a;

        public RunnableC19486b(JSONObject jSONObject) {
            this.f154133a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            String strOptString = this.f154133a.optString("callback");
            try {
                if (qfj0.this.m122322a() == null) {
                    return;
                }
                String strOptString2 = this.f154133a.optString("url", "");
                int iOptInt = this.f154133a.optInt("type", 0);
                MDLog.m7395i("MKWebCaptureHelper", "saveCanvasCapture = " + strOptString2 + "   type=" + iOptInt);
                if (b0g0.m99769b(strOptString2)) {
                    qfj0.this.m122325d(strOptString, "", "url不能为空", "1");
                    return;
                }
                String strOptString3 = this.f154133a.optString("data");
                if (TextUtils.isEmpty(strOptString3)) {
                    qfj0.this.m122325d(strOptString, "", "文件数据为空", "1");
                    return;
                }
                File fileM164471i = ohw.m164471i();
                qfj0 qfj0Var = qfj0.this;
                if (fileM164471i == null) {
                    qfj0Var.m122325d(strOptString, "", "保存文件失败", "1");
                    return;
                }
                String strM174345r = qfj0Var.m174345r(strOptString2, iOptInt);
                if (b0g0.m99769b(strM174345r)) {
                    qfj0.this.m122325d(strOptString, "", "保存文件失败,不支持type类型", "1");
                    return;
                }
                File file = new File(fileM164471i, strM174345r);
                if (file.exists()) {
                    file.delete();
                }
                try {
                    if (FileUtil.m18413j(Base64.decode(strOptString3.replace(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, Marker.ANY_NON_NULL_MARKER).split(Constants.SEPARATOR_COMMA)[1], 0), file)) {
                        qfj0.this.m122325d(strOptString, "", "成功", "0");
                        qfj0.this.m174342o();
                        return;
                    }
                } catch (Exception e) {
                    MDLog.printErrStackTrace(fnl.f98429b, e);
                }
                qfj0.this.m122325d(strOptString, "", "保存文件失败", "1");
                qfj0.this.m174342o();
            } catch (Throwable th) {
                qfj0.this.m122325d(strOptString, "", th.getMessage(), "1");
                MDLog.printErrStackTrace(fnl.f98429b, th);
            }
        }
    }

    /* JADX INFO: renamed from: l.qfj0$c */
    public class RunnableC19487c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ JSONObject f154135a;

        public RunnableC19487c(JSONObject jSONObject) {
            this.f154135a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            String strOptString = this.f154135a.optString("callback");
            Bitmap bitmap = null;
            try {
                try {
                    String strOptString2 = this.f154135a.optString("url", "");
                    int iOptInt = this.f154135a.optInt("type", 0);
                    boolean zM99769b = b0g0.m99769b(strOptString2);
                    qfj0 qfj0Var = qfj0.this;
                    if (zM99769b) {
                        qfj0Var.m122324c(strOptString, qfj0.m174344q(1, "url不能为空"));
                        return;
                    }
                    Bitmap bitmapM174343p = qfj0.m174343p(qfj0Var.f98430a);
                    MDLog.m7395i("MKWebCaptureHelper", "saveCanvasCapture = " + strOptString2 + "   type=" + iOptInt);
                    qfj0 qfj0Var2 = qfj0.this;
                    if (bitmapM174343p == null) {
                        qfj0Var2.m122324c(strOptString, qfj0.m174344q(1, "截图失败"));
                        if (bitmapM174343p != null) {
                            try {
                                if (bitmapM174343p.isRecycled()) {
                                    return;
                                }
                                bitmapM174343p.recycle();
                                return;
                            } catch (Throwable th) {
                                MDLog.printErrStackTrace("MKWebCaptureHelper", th);
                                return;
                            }
                        }
                        return;
                    }
                    if (qfj0Var2.m122322a() == null) {
                        try {
                            if (bitmapM174343p.isRecycled()) {
                                return;
                            }
                            bitmapM174343p.recycle();
                            return;
                        } catch (Throwable th2) {
                            MDLog.printErrStackTrace("MKWebCaptureHelper", th2);
                            return;
                        }
                    }
                    if (bitmapM174343p.isRecycled()) {
                        qfj0.this.m122324c(strOptString, qfj0.m174344q(1, "截图失败"));
                        try {
                            if (bitmapM174343p.isRecycled()) {
                                return;
                            }
                            bitmapM174343p.recycle();
                            return;
                        } catch (Throwable th3) {
                            MDLog.printErrStackTrace("MKWebCaptureHelper", th3);
                            return;
                        }
                    }
                    File fileM164471i = ohw.m164471i();
                    qfj0 qfj0Var3 = qfj0.this;
                    if (fileM164471i == null) {
                        qfj0Var3.m122324c(strOptString, qfj0.m174344q(1, "存储截图失败"));
                        try {
                            if (bitmapM174343p.isRecycled()) {
                                return;
                            }
                            bitmapM174343p.recycle();
                            return;
                        } catch (Throwable th4) {
                            MDLog.printErrStackTrace("MKWebCaptureHelper", th4);
                            return;
                        }
                    }
                    File file = new File(fileM164471i, qfj0Var3.m174345r(strOptString2, iOptInt));
                    if (file.exists()) {
                        file.delete();
                    }
                    boolean zM174348u = qfj0.m174348u(file.getAbsolutePath(), bitmapM174343p);
                    qfj0 qfj0Var4 = qfj0.this;
                    if (zM174348u) {
                        qfj0Var4.m122324c(strOptString, qfj0.m174344q(0, "成功"));
                    } else {
                        qfj0Var4.m122324c(strOptString, qfj0.m174344q(1, "存储截图失败"));
                    }
                    qfj0.this.m174342o();
                    if (bitmapM174343p.isRecycled()) {
                        return;
                    }
                    bitmapM174343p.recycle();
                } catch (Throwable th5) {
                    MDLog.printErrStackTrace("MKWebCaptureHelper", th5);
                }
            } catch (Throwable th6) {
                try {
                    qfj0.this.m122324c(strOptString, qfj0.m174344q(1, th6.getMessage()));
                    MDLog.printErrStackTrace("MKWebCaptureHelper", th6);
                    if (0 == 0 || bitmap.isRecycled()) {
                        return;
                    }
                    bitmap.recycle();
                } catch (Throwable th7) {
                    if (0 != 0) {
                        try {
                            if (!bitmap.isRecycled()) {
                                bitmap.recycle();
                            }
                        } catch (Throwable th8) {
                            MDLog.printErrStackTrace("MKWebCaptureHelper", th8);
                        }
                    }
                    throw th7;
                }
            }
        }
    }

    public qfj0(MKWebView mKWebView, jiw jiwVar) {
        super(mKWebView);
        this.f154130c = jiwVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public void m174342o() {
        MKWebCaptureHelper.m87166f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static Bitmap m174343p(View view) {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            view.draw(canvas);
            canvas.setBitmap(null);
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            MDLog.printErrStackTrace("MKWebCaptureHelper", th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static String m174344q(int i, String str) {
        return liw.m149941b(new String[]{NotificationCompat.CATEGORY_STATUS, "message"}, new String[]{i + "", str}).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    /* JADX INFO: renamed from: r */
    public String m174345r(String str, int i) {
        if (i != 1) {
            if (i != 0) {
                return "";
            }
            return pgw.m168922f(str) + ".png_";
        }
        String strM87169j = MKWebCaptureHelper.m87169j(str);
        if (!b0g0.m99771d(strM87169j)) {
            return "";
        }
        return pgw.m168922f(strM87169j) + ".png_";
    }

    /* JADX INFO: renamed from: s */
    private void m174346s(JSONObject jSONObject) {
        shw.m184285e();
    }

    /* JADX INFO: renamed from: t */
    private void m174347t(JSONObject jSONObject) {
        if (m122322a() == null) {
            return;
        }
        C3804c.m18444d(2, new RunnableC19486b(jSONObject));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static boolean m174348u(String str, Bitmap bitmap) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(str);
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 70, fileOutputStream2);
                    try {
                        fileOutputStream2.close();
                        return true;
                    } catch (IOException e) {
                        MDLog.printErrStackTrace("MKWebCaptureHelper", e);
                        return true;
                    }
                } catch (Exception e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    MDLog.printErrStackTrace("MKWebCaptureHelper", e);
                    if (fileOutputStream == null) {
                        return false;
                    }
                    try {
                        fileOutputStream.close();
                        return false;
                    } catch (IOException e3) {
                        MDLog.printErrStackTrace("MKWebCaptureHelper", e3);
                        return false;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            MDLog.printErrStackTrace("MKWebCaptureHelper", e4);
                        }
                    }
                    throw th;
                }
            } catch (Exception e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public void m174349v(JSONObject jSONObject) {
        if (m122322a() == null) {
            return;
        }
        C3804c.m18444d(2, new RunnableC19487c(jSONObject));
    }

    /* JADX INFO: renamed from: w */
    private void m174350w(JSONObject jSONObject) {
        shw.m184285e();
    }

    /* JADX INFO: renamed from: x */
    private void m174351x(JSONObject jSONObject) {
        if (!TextUtils.isEmpty(jSONObject.optString("dst", null))) {
            m174346s(jSONObject);
            return;
        }
        Intent intent = new Intent();
        String strOptString = jSONObject.optString(AuthenticationTokenClaims.JSON_KEY_NAME);
        intent.putExtra("type", "bridgeMessage");
        intent.putExtra(Target.TYPE, jSONObject.optString(Target.TYPE));
        intent.putExtra(AuthenticationTokenClaims.JSON_KEY_NAME, strOptString);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
        if (jSONObjectOptJSONObject != null) {
            intent.putExtra("data", jSONObjectOptJSONObject.toString());
        }
        intent.putExtra("origin", this.f98430a.getUrl());
        if (TextUtils.isEmpty(strOptString) || strOptString.indexOf("bn:") < 0) {
            intent.setAction("com.immomo.momo.mk.post_message");
        } else {
            intent.setAction(strOptString);
        }
        df3.m111427c(m122322a(), intent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p149l.fnl
    /* JADX INFO: renamed from: h */
    public boolean mo104437h(String str, String str2, JSONObject jSONObject) throws Exception {
        if (m122322a() == null) {
            return true;
        }
        str2.getClass();
        switch (str2) {
            case "setDialogBackBtn":
                MKWebView mKWebView = this.f98430a;
                if (mKWebView != null) {
                    mKWebView.m87081J0(MKWebView.m87045g0(jSONObject));
                }
                return true;
            case "setBackBtn":
                MKWebView mKWebView2 = this.f98430a;
                if (mKWebView2 != null) {
                    mKWebView2.m87080I0(MKWebView.m87045g0(jSONObject));
                }
                return true;
            case "openLinkInExternalBrowser":
                m122322a().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(jSONObject.optString("url"))));
                return true;
            case "reload":
                this.f98430a.reload();
                return true;
            case "setCapture":
                if (MKWebCaptureHelper.m87170k()) {
                    m174347t(jSONObject);
                } else {
                    m122324c(jSONObject.optString("callback"), m174344q(1, "存储截图失败，截图开关未开启"));
                }
                return true;
            case "postGlobalMessage":
                m174350w(jSONObject);
                return true;
            case "showKeyboard":
                InputMethodManager inputMethodManager = (InputMethodManager) m122322a().getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.toggleSoftInput(0, 2);
                }
                return true;
            case "setDOMCapture":
                if (MKWebCaptureHelper.m87170k()) {
                    MKWebView mKWebView3 = this.f98430a;
                    if (mKWebView3 == null) {
                        return true;
                    }
                    mKWebView3.post(new RunnableC19485a(jSONObject));
                } else {
                    m122324c(jSONObject.optString("callback"), m174344q(1, "存储截图失败，截图开关未开启"));
                }
                return true;
            case "deleteCapture":
                MKWebCaptureHelper.m87167h(jSONObject.optString("url", ""), jSONObject.optInt("type", 0));
                m122325d(jSONObject.optString("callback"), "", "成功", "0");
                return false;
            case "showMessage":
                String strOptString = jSONObject.optString("message");
                if (!TextUtils.isEmpty(strOptString)) {
                    Toast.makeText(m122322a(), strOptString, 0).show();
                }
                return true;
            case "postMessage":
                m174351x(jSONObject);
                return true;
            case "getVisibility":
                boolean zM87090x0 = this.f98430a.m87090x0();
                m122324c(MKWebView.m87045g0(jSONObject), liw.m149941b(new String[]{NotificationCompat.CATEGORY_STATUS, "message"}, new Object[]{(zM87090x0 ? 1 : 0) + "", zM87090x0 ? "前台" : "后台"}).toString());
                return true;
            default:
                return false;
        }
    }
}
