package com.p051p1.mobile.putong.p070ui.share;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.LabeledIntent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.FileProvider;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.google.common.base.Optional;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.app.web.WebViewX;
import com.p051p1.mobile.putong.common.R$string;
import com.p051p1.mobile.putong.data.Link;
import com.p051p1.mobile.putong.data.LinkChannel;
import com.p051p1.mobile.putong.data.LinkIntent;
import com.p051p1.mobile.putong.p070ui.download.C13274a;
import com.p051p1.mobile.putong.p070ui.download.DownloadTask;
import com.p051p1.mobile.putong.p070ui.share.ShareHelper;
import com.p051p1.mobile.share_sdk.content.PicContent;
import com.p051p1.mobile.share_sdk.content.WebPageContent;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.connect.common.Constants;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.eclipse.jetty.http.MimeTypes;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p137rx.AsyncEmitter;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p153l.a30;
import p153l.ecj;
import p153l.f3f0;
import p153l.fo0;
import p153l.fqf0;
import p153l.g3f0;
import p153l.gvb0;
import p153l.h26;
import p153l.hvb0;
import p153l.jec0;
import p153l.jyb;
import p153l.kvp0;
import p153l.l51;
import p153l.o1j0;
import p153l.pf60;
import p153l.psd0;
import p153l.q1e;
import p153l.qcj;
import p153l.r8g0;
import p153l.rl60;
import p153l.rx3;
import p153l.tu2;
import p153l.ua5;
import p153l.uqb0;
import p153l.uxj0;
import p153l.vvp0;
import p153l.wc80;
import p153l.x20;
import p153l.y20;
import p153l.ycc0;
import p153l.z20;

/* JADX INFO: loaded from: classes10.dex */
public class ShareHelper implements g3f0 {

    /* JADX INFO: renamed from: j */
    public static boolean f55506j = false;

    /* JADX INFO: renamed from: a */
    public final String f55507a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final Map<String, String> f55508b;

    /* JADX INFO: renamed from: c */
    public Link f55509c;

    /* JADX INFO: renamed from: d */
    public z20<String, String> f55510d;

    /* JADX INFO: renamed from: e */
    public a30<String, String, Throwable> f55511e;

    /* JADX INFO: renamed from: f */
    public C22507a<uxj0> f55512f;

    /* JADX INFO: renamed from: g */
    public boolean f55513g;

    /* JADX INFO: renamed from: h */
    public boolean f55514h;

    /* JADX INFO: renamed from: i */
    public boolean f55515i;

    public static class PlatformNotFoundException extends Exception {
        public PlatformNotFoundException() {
            super("share platform not found");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.share.ShareHelper$a */
    public class C13296a extends rx3 {
        final /* synthetic */ ProgressBar val$progressBar;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13296a(Context context, ProgressBar progressBar) {
            super(context);
            this.val$progressBar = progressBar;
        }

        @Override // p153l.rx3, com.p051p1.mobile.putong.app.web.WebViewClientX
        public void onPageFinishedX(WebViewX webViewX, String str) {
            super.onPageFinishedX(webViewX, str);
            this.val$progressBar.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.share.ShareHelper$b */
    public class C13297b implements g3f0 {
        public C13297b() {
        }

        @Override // p153l.g3f0
        /* JADX INFO: renamed from: a */
        public void mo81179a(wc80 wc80Var, Throwable th) {
            ShareHelper.this.f55512f.onError(null);
            ShareHelper.this.m81198s0(wc80Var, "error", th);
        }

        @Override // p153l.g3f0
        /* JADX INFO: renamed from: b */
        public void mo81180b(wc80 wc80Var) {
            ShareHelper.this.f55512f.m137019l(uxj0.f181467a);
            ShareHelper.this.f55512f.onCompleted();
            ShareHelper.this.m81176I0(wc80Var);
            ShareHelper.this.m81197r0(wc80Var, "complete");
        }

        @Override // p153l.g3f0
        /* JADX INFO: renamed from: c */
        public void mo81181c(wc80 wc80Var) {
            ShareHelper.this.f55512f.onCompleted();
            ShareHelper.this.m81197r0(wc80Var, "cancel");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.share.ShareHelper$c */
    public static class C13298c {

        /* JADX INFO: renamed from: a */
        public final String f55517a;

        /* JADX INFO: renamed from: b */
        public final String f55518b;

        /* JADX INFO: renamed from: c */
        public final LinkChannel f55519c;

        /* JADX INFO: renamed from: d */
        public final String[] f55520d;

        public C13298c(String str, String str2, LinkChannel linkChannel, String[] strArr) {
            this.f55517a = str;
            this.f55518b = str2;
            this.f55519c = linkChannel;
            this.f55520d = strArr;
        }
    }

    public ShareHelper(Link link, String str, @Nullable Map<String, String> map) {
        this.f55512f = C22507a.m222758b();
        this.f55513g = false;
        this.f55514h = false;
        this.f55515i = false;
        this.f55509c = link;
        this.f55507a = str;
        this.f55508b = map;
        if (f55506j) {
            return;
        }
        f3f0.m123731b(App.f16088e.getResources().getString(R$string.f18235w0));
        f55506j = true;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m81122D(List list, y20 y20Var, q1e q1eVar, Dialog dialog, View view, int i, CharSequence charSequence) {
        y20Var.call((C13298c) list.get(i));
        if (NullChecker.m82486a(q1eVar)) {
            q1eVar.m174875g();
        }
    }

    /* JADX INFO: renamed from: N */
    public static void m81132N(Context context, String str, String str2, String str3, String str4, String str5) {
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", str2 + SignParameters.NEW_LINE + str);
            intent.setType(MimeTypes.TEXT_PLAIN);
            context.startActivity(Intent.createChooser(intent, str2));
        } catch (ActivityNotFoundException e) {
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: Q */
    public static C22421c<String> m81133Q(final String str) {
        return C22421c.fromAsync(new y20() { // from class: l.x1f0
            @Override // p153l.y20
            public final void call(Object obj) {
                ShareHelper.m81151j(str, (AsyncEmitter) obj);
            }
        }, AsyncEmitter.BackpressureMode.BUFFER);
    }

    /* JADX INFO: renamed from: R */
    public static List<String> m81134R(Act act) {
        List<C13298c> listM81136T = m81136T(act, null);
        ArrayList arrayList = new ArrayList(5);
        Iterator<C13298c> it = listM81136T.iterator();
        while (it.hasNext()) {
            String string = it.next().f55519c.toString();
            string.getClass();
            switch (string) {
                case "qq-space":
                    arrayList.add("qz");
                    break;
                case "sina-weibo":
                    arrayList.add("wb");
                    break;
                case "qq_friend":
                    arrayList.add("qq");
                    break;
                case "wechat-moments":
                    arrayList.add("mo");
                    break;
                case "wechat-session":
                    arrayList.add("wx");
                    break;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: S */
    public static List<String> m81135S(Act act, List<LinkChannel> list) {
        List<C13298c> listM81136T = m81136T(act, list);
        ArrayList arrayList = new ArrayList(5);
        Iterator<C13298c> it = listM81136T.iterator();
        while (it.hasNext()) {
            String string = it.next().f55519c.toString();
            string.getClass();
            switch (string) {
                case "qq-space":
                    arrayList.add("qz");
                    break;
                case "sina-weibo":
                    arrayList.add("wb");
                    break;
                case "qq_friend":
                    arrayList.add("qq");
                    break;
                case "wechat-moments":
                    arrayList.add("mo");
                    break;
                case "wechat-session":
                    arrayList.add("wx");
                    break;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: T */
    public static List<C13298c> m81136T(Act act, @Nullable final List<LinkChannel> list) {
        return jyb.m147522n(Arrays.asList(new C13298c(act.string(R$string.f18142d2), kvp0.f128981b, LinkChannel.get("wechat-moments"), new String[]{"com.tencent.mm"}), new C13298c(act.string(R$string.f18137c2), vvp0.f185950b, LinkChannel.get("wechat-session"), new String[]{"com.tencent.mm"}), new C13298c(act.string(R$string.f18207q2), hvb0.f111748b, LinkChannel.get("qq_friend"), new String[]{Constants.PACKAGE_TIM, "com.tencent.mobileqq", "com.tencent.mobileqqi"}), new C13298c(act.string(R$string.f18132b2), gvb0.f106619b, LinkChannel.get("qq-space"), new String[]{Constants.PACKAGE_TIM, "com.tencent.mobileqq", "com.tencent.mobileqqi"}), new C13298c(act.string(R$string.f18147e2), fqf0.f100284b, LinkChannel.get("sina-weibo"), new String[]{"com.sina.weibo", "com.sina.weibog3", "com.sina.weibolite"})), new qcj() { // from class: l.d1f0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                List list2 = list;
                ShareHelper.C13298c c13298c = (ShareHelper.C13298c) obj;
                return Boolean.valueOf(uc60.m195379b(c13298c.f55520d) && (list2 == null || list2.contains(c13298c.f55519c)));
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX INFO: renamed from: U */
    public static String m81137U(@DrawableRes int i) throws Throwable {
        FileOutputStream fileOutputStream;
        Bitmap bitmapDecodeResource;
        File fileM120381O = ecj.m120381O("png");
        Bitmap bitmap = null;
        try {
            bitmapDecodeResource = BitmapFactory.decodeResource(App.f16088e.getResources(), i);
            try {
                fileOutputStream = new FileOutputStream(fileM120381O);
                try {
                    try {
                        bitmapDecodeResource.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        String absolutePath = fileM120381O.getAbsolutePath();
                        if (NullChecker.m82486a(bitmapDecodeResource)) {
                            bitmapDecodeResource.recycle();
                        }
                        ua5.m195158b(fileOutputStream);
                        return absolutePath;
                    } catch (IOException e) {
                        e = e;
                        CrashHelper.m82479c(e);
                        if (NullChecker.m82486a(bitmapDecodeResource)) {
                            bitmapDecodeResource.recycle();
                        }
                        ua5.m195158b(fileOutputStream);
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    bitmap = bitmapDecodeResource;
                    if (NullChecker.m82486a(bitmap)) {
                        bitmap.recycle();
                    }
                    ua5.m195158b(fileOutputStream);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
                bitmap = bitmapDecodeResource;
                if (NullChecker.m82486a(bitmap)) {
                    bitmap.recycle();
                }
                ua5.m195158b(fileOutputStream);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            bitmapDecodeResource = null;
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
            if (NullChecker.m82486a(bitmap)) {
                bitmap.recycle();
            }
            ua5.m195158b(fileOutputStream);
            throw th;
        }
    }

    /* JADX INFO: renamed from: V */
    public static String m81138V() {
        return m81139W("share_icon.png");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX INFO: renamed from: W */
    public static String m81139W(String str) throws Throwable {
        FileOutputStream fileOutputStream;
        File fileM120381O = ecj.m120381O("png");
        ?? r1 = 0;
        try {
            try {
                str = App.f16088e.getResources().getAssets().open(str);
                try {
                    fileOutputStream = new FileOutputStream(fileM120381O);
                    try {
                        h26.m133364a(str, fileOutputStream);
                        String absolutePath = fileM120381O.getAbsolutePath();
                        ua5.m195158b(str);
                        ua5.m195158b(fileOutputStream);
                        return absolutePath;
                    } catch (IOException e) {
                        e = e;
                        CrashHelper.m82479c(e);
                        ua5.m195158b(str);
                        ua5.m195158b(fileOutputStream);
                        return null;
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = null;
                } catch (Throwable th) {
                    th = th;
                    r1 = str;
                    ua5.m195158b(r1);
                    ua5.m195158b(0);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e3) {
            e = e3;
            str = 0;
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            ua5.m195158b(r1);
            ua5.m195158b(0);
            throw th;
        }
    }

    /* JADX INFO: renamed from: X */
    public static ArrayList<LinkChannel> m81140X(String str) {
        if ("qq".equals(str)) {
            return jyb.m147507f0(LinkChannel.get("qq_friend"));
        }
        if ("qz".equals(str)) {
            return jyb.m147507f0(LinkChannel.get("qq-space"));
        }
        if ("mo".equals(str)) {
            return jyb.m147507f0(LinkChannel.get("wechat-moments"));
        }
        if ("wx".equals(str)) {
            return jyb.m147507f0(LinkChannel.get("wechat-session"));
        }
        return "wb".equals(str) ? jyb.m147507f0(LinkChannel.get("sina-weibo")) : jyb.m147507f0(LinkChannel.get("wechat-moments"), LinkChannel.get("wechat-session"), LinkChannel.get("qq-space"), LinkChannel.get("qq_friend"), LinkChannel.get("sina-weibo"));
    }

    /* JADX INFO: renamed from: Y */
    public static ArrayList<LinkChannel> m81141Y(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return jyb.m147507f0(LinkChannel.get("wechat-moments"), LinkChannel.get("wechat-session"), LinkChannel.get("qq_friend"), LinkChannel.get("qq-space"), LinkChannel.get("sina-weibo"));
        }
        String[] strArrSplit = str.split(",\\s*");
        ArrayList<LinkChannel> arrayList = new ArrayList<>(strArrSplit.length);
        for (String str2 : strArrSplit) {
            if ("qq".equals(str2)) {
                arrayList.add(LinkChannel.get("qq_friend"));
            } else if ("mo".equals(str2)) {
                arrayList.add(LinkChannel.get("wechat-moments"));
            } else if ("wx".equals(str2)) {
                arrayList.add(LinkChannel.get("wechat-session"));
            } else if ("wb".equals(str2)) {
                arrayList.add(LinkChannel.get("sina-weibo"));
            } else if ("qz".equals(str2)) {
                arrayList.add(LinkChannel.get("qq-space"));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: Z */
    public static ArrayList<LinkChannel> m81142Z(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return jyb.m147507f0(LinkChannel.get("wechat-moments"), LinkChannel.get("wechat-session"), LinkChannel.get("qq-space"), LinkChannel.get("qq_friend"), LinkChannel.get("sina-weibo"));
        }
        String[] strArrSplit = str.split(",\\s*");
        ArrayList<LinkChannel> arrayList = new ArrayList<>(strArrSplit.length);
        for (String str2 : strArrSplit) {
            if ("qq".equals(str2)) {
                arrayList.add(LinkChannel.get("qq_friend"));
            } else if ("qz".equals(str)) {
                arrayList = jyb.m147507f0(LinkChannel.get("qq-space"));
            } else if ("mo".equals(str2)) {
                arrayList.add(LinkChannel.get("wechat-moments"));
            } else if ("wx".equals(str2)) {
                arrayList.add(LinkChannel.get("wechat-session"));
            } else if ("wb".equals(str2)) {
                arrayList.add(LinkChannel.get("sina-weibo"));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a0 */
    public static String m81143a0(@Nullable LinkChannel linkChannel) {
        return linkChannel == null ? "unknown" : linkChannel.toString();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX INFO: renamed from: b0 */
    public static void m81144b0(ArrayList<LinkChannel> arrayList, Throwable th) {
        String str;
        if (th instanceof PlatformNotFoundException) {
            if (arrayList.size() == 1) {
                String string = arrayList.get(0).toString();
                string.getClass();
                switch (string) {
                    case "qq-space":
                    case "qq_friend":
                        str = Constants.SOURCE_QQ;
                        break;
                    case "sina-weibo":
                        str = "新浪微博";
                        break;
                    case "wechat-moments":
                    case "wechat-session":
                        str = "微信";
                        break;
                    default:
                        str = "";
                        break;
                }
            } else {
                str = "";
            }
            if (str.isEmpty()) {
                o1j0.m165636j("分享失败");
            } else {
                o1j0.m165636j("未安装".concat(str));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m81145d(List list, y20 y20Var, q1e q1eVar, Dialog dialog, View view, int i, CharSequence charSequence) {
        y20Var.call((C13298c) list.get(i));
        if (NullChecker.m82486a(q1eVar)) {
            q1eVar.m174875g();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m81146e(q1e q1eVar, Runnable runnable) {
        if (NullChecker.m82486a(q1eVar)) {
            q1eVar.m174879k(1, new Object[0]);
        }
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m81151j(String str, final AsyncEmitter asyncEmitter) {
        String str2;
        String str3 = null;
        try {
            String str4 = Environment.DIRECTORY_PICTURES;
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str4)) {
                String strSubstring = str.substring(str.lastIndexOf("."), str.length());
                int iIndexOf = strSubstring.indexOf(63);
                if (iIndexOf == -1) {
                    str2 = System.currentTimeMillis() + strSubstring;
                } else {
                    str2 = System.currentTimeMillis() + strSubstring.substring(0, iIndexOf);
                }
                StringBuilder sb = new StringBuilder(Environment.getExternalStoragePublicDirectory(str4).getAbsolutePath());
                String str5 = File.separator;
                sb.append(str5);
                sb.append("Tantan");
                String string = sb.toString();
                File file = new File(string);
                if (file.exists() || (!file.exists() && file.mkdirs())) {
                    str3 = string + str5 + str2;
                }
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            str = null;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            asyncEmitter.onError(new IllegalStateException("error download failed"));
        } else {
            C13274a.m80837u().m80848o(new DownloadTask.C13273b(uqb0.f180376H.getDownloadHttp()).m80825q(str).m80823o(str3).m80818j(new z20() { // from class: l.a2f0
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    l51.m152887G(new Runnable() { // from class: l.c2f0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ShareHelper.m81160s(downloadTask, asyncEmitter);
                        }
                    });
                }
            }).m80814f(new z20() { // from class: l.b2f0
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    asyncEmitter.onError((Throwable) obj2);
                }
            }).m80809a());
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m81160s(DownloadTask downloadTask, AsyncEmitter asyncEmitter) {
        App.f16088e.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://" + downloadTask.m80804v())));
        asyncEmitter.m137019l(downloadTask.m80804v());
        asyncEmitter.onCompleted();
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m81163v(q1e q1eVar, Runnable runnable, DialogInterface dialogInterface) {
        if (NullChecker.m82486a(q1eVar)) {
            q1eVar.m174875g();
        }
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m81167z(Throwable th) {
    }

    /* JADX INFO: renamed from: A0 */
    public void m81168A0(Act act, C13298c c13298c, final String str, final String str2, final String str3, String str4) {
        final ShareHelper shareHelper;
        final wc80 wc80VarM123730a = f3f0.m123730a(c13298c.f55518b, act);
        if (TextUtils.isEmpty(str4)) {
            str4 = m81138V();
        }
        if (!TextUtils.isEmpty(str) && !str.startsWith("http://") && !str.startsWith("https://") && c13298c.f55518b.contains(Constants.SOURCE_QQ)) {
            m81197r0(wc80VarM123730a, "error");
            return;
        }
        if (TextUtils.isEmpty(str4) || !str4.toLowerCase().startsWith("http") || c13298c.f55518b.contains(Constants.SOURCE_QQ)) {
            shareHelper = this;
            WebPageContent webPageContent = new WebPageContent(str2, str3, str, str4);
            wc80VarM123730a.mo126749b(shareHelper);
            wc80VarM123730a.mo126748a(webPageContent);
        } else {
            shareHelper = this;
            uqb0.f180374G.m98793i(str4, new y20() { // from class: l.g2f0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f101835a.m81192m0(str2, str3, str, wc80VarM123730a, (String) obj);
                }
            });
        }
        shareHelper.m81173F0(c13298c);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m81169B0(Act act, C13298c c13298c, String str, @NonNull String str2, String str3) {
        wc80 wc80VarM123730a = f3f0.m123730a(c13298c.f55518b, act);
        PicContent picContent = new PicContent(str2, new File(str3));
        wc80VarM123730a.mo126749b(new C13297b());
        wc80VarM123730a.mo126748a(picContent);
        m81173F0(c13298c);
    }

    /* JADX INFO: renamed from: C0 */
    public final C22421c<uxj0> m81170C0(boolean z, final Act act, final String str, final String str2, final String str3, final ArrayList<LinkChannel> arrayList, final boolean z2, final String str4, final String str5, final LinkIntent linkIntent) {
        l51.m152887G(new Runnable() { // from class: l.o1f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f144639a.m81193n0();
            }
        });
        tu2.m192703a("[putong-common][share]", "share_base dialogTitle = " + str + ", shareTitle = " + str2 + ", thumbnailUrl = " + str4 + ", needPreview = " + z + ", description = " + str3 + ", allowedChannels = " + arrayList + ", fallbackToSystem = " + z2 + ", previewActionName = " + str5);
        if (!z) {
            m81196q0(act, str, str2, str3, arrayList, z2, str4, null);
        } else if (m81136T(act, arrayList).size() < 2) {
            m81205z0(act, new Runnable() { // from class: l.z1f0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f202515a.m81194o0(act, str, str2, str3, arrayList, z2, str4);
                }
            }, null, null, str5, linkIntent);
        } else {
            act.flow().m174883o(new qcj() { // from class: l.d2f0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f84784a.m81195p0(act, str5, linkIntent, (q1e) obj);
                }
            }, new qcj() { // from class: l.e2f0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f91752a.m81196q0(act, str, str2, str3, arrayList, z2, str4, (q1e) obj);
                }
            }).m174885q();
        }
        return this.f55512f.observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: D0 */
    public final void m81171D0(Activity activity, String str, String str2, String str3) {
        m81174G0("system");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("image/*");
        intent.putExtra("android.intent.extra.TEXT", str2);
        PackageManager packageManager = activity.getPackageManager();
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayListM147507f0 = jyb.m147507f0("com.tencent.mm.ui.tools.ShareToTimeLineUI", "com.tencent.mm.ui.tools.ShareToStatusUI");
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            final ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.packageName.contains("com.facebook.orca") && !jyb.m147520m(arrayListM147507f0, new qcj() { // from class: l.y1f0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((String) obj).equals(activityInfo.name));
                }
            })) {
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                intent2.setPackage(activityInfo.packageName);
                intent2.setType(MimeTypes.TEXT_PLAIN);
                if (activityInfo.packageName.contains("com.facebook.katana")) {
                    intent2.putExtra("android.intent.extra.TEXT", str3);
                } else {
                    intent2.putExtra("android.intent.extra.TEXT", str2);
                }
                arrayList.add(new LabeledIntent(intent2, activityInfo.packageName, resolveInfo.loadLabel(packageManager), activityInfo.icon));
            }
        }
        if (arrayList.size() > 0) {
            intent = (Intent) arrayList.remove(0);
        }
        Intent intentCreateChooser = Intent.createChooser(intent, str);
        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (LabeledIntent[]) arrayList.toArray(new LabeledIntent[arrayList.size()]));
        activity.startActivity(intentCreateChooser);
    }

    /* JADX INFO: renamed from: E0 */
    public final void m81172E0(Activity activity, @Nullable String str, @Nullable String str2, Uri uri) {
        m81174G0("system");
        if (NullChecker.m82487b(activity)) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_PNG);
            intent.putExtra("android.intent.extra.STREAM", uri);
            if (!TextUtils.isEmpty(str2)) {
                intent.putExtra("android.intent.extra.TEXT", str2);
            }
            intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            activity.startActivity(Intent.createChooser(intent, str));
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final void m81173F0(@Nullable C13298c c13298c) {
        m81174G0(m81143a0(c13298c == null ? LinkChannel.get("unknown_") : c13298c.f55519c));
    }

    /* JADX INFO: renamed from: G0 */
    public final void m81174G0(String str) {
        if (this.f55514h) {
            return;
        }
        this.f55514h = true;
    }

    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m81193n0() {
        if (this.f55513g) {
            return;
        }
        this.f55513g = true;
    }

    /* JADX INFO: renamed from: I0 */
    public final void m81176I0(wc80 wc80Var) {
        if (this.f55515i) {
            return;
        }
        this.f55515i = true;
    }

    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final Dialog m81196q0(final Act act, final String str, final String str2, final String str3, ArrayList<LinkChannel> arrayList, final boolean z, final String str4, final q1e q1eVar) {
        final y20 y20Var = new y20() { // from class: l.h2f0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107539a.m81182c0(z, act, str2, str, str3, str4, (ShareHelper.C13298c) obj);
            }
        };
        final List<C13298c> listM81136T = m81136T(act, arrayList);
        if (listM81136T.size() == 0) {
            y20Var.call(null);
            return null;
        }
        if (listM81136T.size() != 1) {
            return act.dialog().m21506G0(str).m21534e0(jyb.m147486Q(listM81136T, new qcj() { // from class: l.i2f0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((ShareHelper.C13298c) obj).f55517a;
                }
            })).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.j2f0
                @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
                /* JADX INFO: renamed from: a */
                public final void mo21568a(Dialog dialog, View view, int i, CharSequence charSequence) {
                    ShareHelper.m81122D(listM81136T, y20Var, q1eVar, dialog, view, i, charSequence);
                }
            }).m21567z0();
        }
        y20Var.call(listM81136T.get(0));
        return null;
    }

    /* JADX INFO: renamed from: P */
    public final Dialog m81178P(final Act act, final String str, final String str2, ArrayList<LinkChannel> arrayList, final boolean z, final String str3, final q1e q1eVar) {
        final C22421c c22421cJust;
        if (str3.toLowerCase().startsWith("http")) {
            C22421c c22421cDoOnSubscribe = m81133Q(str3).map(new qcj() { // from class: l.m1f0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Optional.fromNullable((String) obj);
                }
            }).onErrorResumeNext((qcj<Throwable, ? extends C22421c<? extends R>>) new qcj() { // from class: l.n1f0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return C22421c.just(Optional.absent());
                }
            }).observeOn(fo0.m126432a()).doOnSubscribe(new x20() { // from class: l.p1f0
                @Override // p153l.x20
                public final void call() {
                    act.progress(R$string.f18108W, true);
                }
            });
            Objects.requireNonNull(act);
            c22421cJust = c22421cDoOnSubscribe.doOnTerminate(new rl60(act));
        } else {
            c22421cJust = C22421c.just(Optional.m15467of(str3));
        }
        final y20 y20Var = new y20() { // from class: l.q1f0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155183a.m81187h0(z, str3, act, str, str2, (pf60) obj);
            }
        };
        final y20 y20Var2 = new y20() { // from class: l.r1f0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f160819a.m81190k0(c22421cJust, y20Var, (ShareHelper.C13298c) obj);
            }
        };
        final List<C13298c> listM81136T = m81136T(act, arrayList);
        if (listM81136T.size() == 0) {
            y20Var2.call(null);
            return null;
        }
        if (listM81136T.size() != 1) {
            return act.dialog().m21506G0(str).m21534e0(jyb.m147486Q(listM81136T, new qcj() { // from class: l.s1f0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((ShareHelper.C13298c) obj).f55517a;
                }
            })).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.t1f0
                @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
                /* JADX INFO: renamed from: a */
                public final void mo21568a(Dialog dialog, View view, int i, CharSequence charSequence) {
                    ShareHelper.m81145d(listM81136T, y20Var2, q1eVar, dialog, view, i, charSequence);
                }
            }).m21567z0();
        }
        y20Var2.call(listM81136T.get(0));
        return null;
    }

    @Override // p153l.g3f0
    /* JADX INFO: renamed from: a */
    public void mo81179a(wc80 wc80Var, Throwable th) {
        this.f55512f.onError(th);
        m81198s0(wc80Var, "error", th);
    }

    @Override // p153l.g3f0
    /* JADX INFO: renamed from: b */
    public void mo81180b(wc80 wc80Var) {
        m81176I0(wc80Var);
        if (NullChecker.m82487b(this.f55509c)) {
            if (TextUtils.isEmpty(this.f55509c.f39613id)) {
                this.f55512f.m137019l(uxj0.f181467a);
                this.f55512f.onCompleted();
            } else {
                uqb0.f180384P.m211352B(this.f55509c.f39613id).map(new qcj() { // from class: l.u1f0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return uxj0.f181467a;
                    }
                }).subscribe(this.f55512f);
            }
        }
        m81197r0(wc80Var, "complete");
    }

    @Override // p153l.g3f0
    /* JADX INFO: renamed from: c */
    public void mo81181c(wc80 wc80Var) {
        this.f55512f.onCompleted();
        m81197r0(wc80Var, "cancel");
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m81182c0(boolean z, final Act act, final String str, final String str2, final String str3, final String str4, final C13298c c13298c) {
        if (c13298c != null) {
            Link link = this.f55509c;
            link.channel = c13298c.f55519c;
            String str5 = link.href;
            if (str5 != null) {
                m81168A0(act, c13298c, str5, str, str3, str4);
                return;
            } else {
                act.progress(R$string.f18108W, true);
                uqb0.f180384P.m211353C(link).subscribe(psd0.m173597H(new y20() { // from class: l.k1f0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f123485a.m81185f0(act, str, c13298c, str3, str4, (Link) obj);
                    }
                }, new y20() { // from class: l.l1f0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f129669a.m81186g0(act, (Throwable) obj);
                    }
                }));
                return;
            }
        }
        if (!z) {
            mo81179a(null, new PlatformNotFoundException());
            return;
        }
        this.f55509c.channel = LinkChannel.get("unknown");
        if (this.f55509c.href == null) {
            act.progress(R$string.f18108W, true);
            uqb0.f180384P.m211353C(this.f55509c).subscribe(psd0.m173597H(new y20() { // from class: l.i1f0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f112511a.m81183d0(act, str, str2, (Link) obj);
                }
            }, new y20() { // from class: l.j1f0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f117961a.m81184e0(act, (Throwable) obj);
                }
            }));
            return;
        }
        m81171D0(act, str2, str + " ( " + this.f55509c.href + " ) ", this.f55509c.href);
        this.f55512f.onCompleted();
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m81183d0(Act act, String str, String str2, Link link) {
        act.progressDismiss();
        this.f55509c = link;
        if (!r8g0.m180203b(link.title)) {
            str = link.title;
        }
        m81171D0(act, str2, str + "（ " + link.href + " ) ", link.href);
        this.f55512f.onCompleted();
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m81184e0(Act act, Throwable th) {
        act.progressDismiss();
        mo81179a(null, th);
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m81185f0(Act act, String str, C13298c c13298c, String str2, String str3, Link link) {
        this.f55509c = link;
        act.progressDismiss();
        if (!r8g0.m180203b(link.title)) {
            str = link.title;
        }
        m81168A0(act, c13298c, link.href, str, str2, str3);
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m81186g0(Act act, Throwable th) {
        act.progressDismiss();
        mo81179a(null, th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m81187h0(boolean z, String str, Act act, String str2, String str3, pf60 pf60Var) {
        F f = pf60Var.f152156a;
        if (f != 0) {
            this.f55509c.channel = ((C13298c) f).f55519c;
            m81193n0();
            m81169B0(act, (C13298c) pf60Var.f152156a, str3, str, (String) pf60Var.f152157b);
            return;
        }
        if (!z) {
            mo81179a(null, new PlatformNotFoundException());
            return;
        }
        this.f55509c.channel = LinkChannel.get("unknown");
        S s = pf60Var.f152157b;
        if (s != 0) {
            str = (String) s;
        }
        m81172E0(act, str2, null, FileProvider.getUriForFile(act, "files." + App.f16088e.getPackageName(), new File(str)));
        this.f55512f.onCompleted();
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m81188i0(y20 y20Var, C13298c c13298c, Optional optional) {
        if (optional.isPresent()) {
            y20Var.call(new pf60(c13298c, (String) optional.get()));
        } else {
            mo81179a(null, new NullPointerException("can't save image file or picUrlOrLocalPath is null"));
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m81189j0(Throwable th) {
        mo81179a(null, th);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m81190k0(C22421c c22421c, final y20 y20Var, final C13298c c13298c) {
        c22421c.subscribe(psd0.m173597H(new y20() { // from class: l.v1f0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181969a.m81188i0(y20Var, c13298c, (Optional) obj);
            }
        }, new y20() { // from class: l.w1f0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186812a.m81189j0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m81192m0(String str, String str2, String str3, wc80 wc80Var, String str4) {
        WebPageContent webPageContent = new WebPageContent(str, str2, str3, str4);
        wc80Var.mo126749b(this);
        wc80Var.mo126748a(webPageContent);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m81194o0(Act act, String str, String str2, String str3, ArrayList arrayList, boolean z, String str4) {
        m81196q0(act, str, str2, str3, arrayList, z, str4, null);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Dialog m81195p0(Act act, String str, LinkIntent linkIntent, q1e q1eVar) {
        return m81205z0(act, null, null, q1eVar, str, linkIntent);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m81197r0(wc80 wc80Var, String str) {
        boolean z = str.contains("cancel") || str.contains("error");
        a30<String, String, Throwable> a30Var = this.f55511e;
        if (a30Var != null && z) {
            a30Var.mo37058a(wc80Var != null ? wc80Var.getName() : null, str, null);
            return;
        }
        z20<String, String> z20Var = this.f55510d;
        if (z20Var != null) {
            z20Var.call(wc80Var != null ? wc80Var.getName() : null, str);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m81198s0(wc80 wc80Var, String str, Throwable th) {
        boolean z = str.contains("cancel") || str.contains("error");
        a30<String, String, Throwable> a30Var = this.f55511e;
        if (a30Var != null && z) {
            a30Var.mo37058a(wc80Var != null ? wc80Var.getName() : null, str, th);
            return;
        }
        z20<String, String> z20Var = this.f55510d;
        if (z20Var != null) {
            z20Var.call(wc80Var != null ? wc80Var.getName() : null, str);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public ShareHelper m81199t0(z20<String, String> z20Var) {
        this.f55510d = z20Var;
        return this;
    }

    /* JADX INFO: renamed from: u0 */
    public ShareHelper m81200u0(a30<String, String, Throwable> a30Var) {
        this.f55511e = a30Var;
        return this;
    }

    /* JADX INFO: renamed from: v0 */
    public C22421c<uxj0> m81201v0(Act act, String str, String str2, String str3, ArrayList<LinkChannel> arrayList, boolean z, String str4) {
        return m81170C0(false, act, str, str2, str3, arrayList, z, str4, "", null);
    }

    /* JADX INFO: renamed from: w0 */
    public C22421c<uxj0> m81202w0(Act act, String str, String str2, ArrayList<LinkChannel> arrayList, boolean z) {
        return m81201v0(act, str, str2, null, arrayList, z, null);
    }

    /* JADX INFO: renamed from: x0 */
    public C22421c<uxj0> m81203x0(Act act, String str, String str2, ArrayList<LinkChannel> arrayList, boolean z, String str3) {
        return m81201v0(act, str, str2, null, arrayList, z, str3);
    }

    /* JADX INFO: renamed from: y0 */
    public C22421c<uxj0> m81204y0(Act act, String str, String str2, ArrayList<LinkChannel> arrayList, boolean z, String str3) {
        tu2.m192703a("[putong-common][share]", "shareImage dialogTitle = " + str + ", shareTitle = " + str2 + ", picUrlOrLocalPath = " + str3 + ", allowedChannels = " + arrayList + ", fallbackToSystem = " + z);
        l51.m152893M(new Runnable() { // from class: l.f2f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f96883a.m81191l0();
            }
        });
        m81178P(act, str, str2, arrayList, z, str3, null);
        return this.f55512f.observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: z0 */
    public Dialog m81205z0(Act act, final Runnable runnable, final Runnable runnable2, final q1e q1eVar, String str, LinkIntent linkIntent) {
        Dialog dialogM21567z0 = act.dialog().m21517N(jec0.f120448Q, true).m21556u().m21559v0(str, new Runnable() { // from class: l.e1f0
            @Override // java.lang.Runnable
            public final void run() {
                ShareHelper.m81146e(q1eVar, runnable);
            }
        }).m21493A(new DialogInterface.OnCancelListener() { // from class: l.f1f0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                ShareHelper.m81163v(q1eVar, runnable2, dialogInterface);
            }
        }).m21502E0(R$string.f18118Y1).m21512J0(17).m21554t().m21567z0();
        View viewM21457P = dialogM21567z0.m21457P();
        final WebViewX webViewX = (WebViewX) viewM21457P.findViewById(ycc0.f198419H0);
        webViewX.setWebViewClientX(new C13296a(act, (ProgressBar) viewM21457P.findViewById(ycc0.f198449c0)));
        Link linkMo225055clone = this.f55509c.mo225055clone();
        linkMo225055clone.intent = linkIntent;
        uqb0.f180384P.m211353C(linkMo225055clone).subscribe(psd0.m173597H(new y20() { // from class: l.g1f0
            @Override // p153l.y20
            public final void call(Object obj) {
                webViewX.loadUrl(((Link) obj).href);
            }
        }, new y20() { // from class: l.h1f0
            @Override // p153l.y20
            public final void call(Object obj) {
                ShareHelper.m81167z((Throwable) obj);
            }
        }));
        return dialogM21567z0;
    }

    public ShareHelper(Link link, String str) {
        this(link, str, null);
    }

    public ShareHelper(Link link, @Nullable Map<String, String> map) {
        this(link, null, map);
    }

    public ShareHelper(Link link) {
        this(link, null, null);
    }
}
