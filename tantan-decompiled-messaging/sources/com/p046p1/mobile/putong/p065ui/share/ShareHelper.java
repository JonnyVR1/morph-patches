package com.p046p1.mobile.putong.p065ui.share;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.app.web.WebViewX;
import com.p046p1.mobile.putong.common.R$string;
import com.p046p1.mobile.putong.data.Link;
import com.p046p1.mobile.putong.data.LinkChannel;
import com.p046p1.mobile.putong.data.LinkIntent;
import com.p046p1.mobile.putong.p065ui.download.C13111a;
import com.p046p1.mobile.putong.p065ui.download.DownloadTask;
import com.p046p1.mobile.putong.p065ui.share.ShareHelper;
import com.p046p1.mobile.share_sdk.content.PicContent;
import com.p046p1.mobile.share_sdk.content.WebPageContent;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.connect.common.Constants;
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
import p133rx.AsyncEmitter;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p149l.c0e;
import p149l.c16;
import p149l.cnb0;
import p149l.d30;
import p149l.dnb0;
import p149l.du2;
import p149l.e30;
import p149l.e51;
import p149l.e6c0;
import p149l.f30;
import p149l.g30;
import p149l.gmp0;
import p149l.j760;
import p149l.jo0;
import p149l.k0g0;
import p149l.k9j;
import p149l.lsi0;
import p149l.md60;
import p149l.mkd0;
import p149l.q480;
import p149l.qib0;
import p149l.rmp0;
import p149l.roj0;
import p149l.s4c0;
import p149l.sw3;
import p149l.t95;
import p149l.vwb;
import p149l.w9j;
import p149l.whf0;
import p149l.yue0;
import p149l.zue0;

/* JADX INFO: loaded from: classes11.dex */
public class ShareHelper implements zue0 {

    /* JADX INFO: renamed from: j */
    public static boolean f54658j = false;

    /* JADX INFO: renamed from: a */
    public final String f54659a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final Map<String, String> f54660b;

    /* JADX INFO: renamed from: c */
    public Link f54661c;

    /* JADX INFO: renamed from: d */
    public f30<String, String> f54662d;

    /* JADX INFO: renamed from: e */
    public g30<String, String, Throwable> f54663e;

    /* JADX INFO: renamed from: f */
    public C22392a<roj0> f54664f;

    /* JADX INFO: renamed from: g */
    public boolean f54665g;

    /* JADX INFO: renamed from: h */
    public boolean f54666h;

    /* JADX INFO: renamed from: i */
    public boolean f54667i;

    public static class PlatformNotFoundException extends Exception {
        public PlatformNotFoundException() {
            super("share platform not found");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.share.ShareHelper$a */
    public class C13133a extends sw3 {
        final /* synthetic */ ProgressBar val$progressBar;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13133a(Context context, ProgressBar progressBar) {
            super(context);
            this.val$progressBar = progressBar;
        }

        @Override // p149l.sw3, com.p046p1.mobile.putong.app.web.WebViewClientX
        public void onPageFinishedX(WebViewX webViewX, String str) {
            super.onPageFinishedX(webViewX, str);
            this.val$progressBar.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.share.ShareHelper$b */
    public class C13134b implements zue0 {
        public C13134b() {
        }

        @Override // p149l.zue0
        /* JADX INFO: renamed from: a */
        public void mo79996a(q480 q480Var, Throwable th) {
            ShareHelper.this.f54664f.onError(null);
            ShareHelper.this.m80015s0(q480Var, "error", th);
        }

        @Override // p149l.zue0
        /* JADX INFO: renamed from: b */
        public void mo79997b(q480 q480Var) {
            ShareHelper.this.f54664f.m132487l(roj0.f160388a);
            ShareHelper.this.f54664f.onCompleted();
            ShareHelper.this.m79993I0(q480Var);
            ShareHelper.this.m80014r0(q480Var, "complete");
        }

        @Override // p149l.zue0
        /* JADX INFO: renamed from: c */
        public void mo79998c(q480 q480Var) {
            ShareHelper.this.f54664f.onCompleted();
            ShareHelper.this.m80014r0(q480Var, "cancel");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.share.ShareHelper$c */
    public static class C13135c {

        /* JADX INFO: renamed from: a */
        public final String f54669a;

        /* JADX INFO: renamed from: b */
        public final String f54670b;

        /* JADX INFO: renamed from: c */
        public final LinkChannel f54671c;

        /* JADX INFO: renamed from: d */
        public final String[] f54672d;

        public C13135c(String str, String str2, LinkChannel linkChannel, String[] strArr) {
            this.f54669a = str;
            this.f54670b = str2;
            this.f54671c = linkChannel;
            this.f54672d = strArr;
        }
    }

    public ShareHelper(Link link, String str, @Nullable Map<String, String> map) {
        this.f54664f = C22392a.m221512b();
        this.f54665g = false;
        this.f54666h = false;
        this.f54667i = false;
        this.f54661c = link;
        this.f54659a = str;
        this.f54660b = map;
        if (f54658j) {
            return;
        }
        yue0.m216110b(App.f15369e.getResources().getString(R$string.f17516w0));
        f54658j = true;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m79939D(List list, e30 e30Var, c0e c0eVar, Dialog dialog, View view, int i, CharSequence charSequence) {
        e30Var.call((C13135c) list.get(i));
        if (NullChecker.m81303a(c0eVar)) {
            c0eVar.m104736g();
        }
    }

    /* JADX INFO: renamed from: N */
    public static void m79949N(Context context, String str, String str2, String str3, String str4, String str5) {
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
    public static C22306c<String> m79950Q(final String str) {
        return C22306c.fromAsync(new e30() { // from class: l.qte0
            @Override // p149l.e30
            public final void call(Object obj) {
                ShareHelper.m79968j(str, (AsyncEmitter) obj);
            }
        }, AsyncEmitter.BackpressureMode.BUFFER);
    }

    /* JADX INFO: renamed from: R */
    public static List<String> m79951R(Act act) {
        List<C13135c> listM79953T = m79953T(act, null);
        ArrayList arrayList = new ArrayList(5);
        Iterator<C13135c> it = listM79953T.iterator();
        while (it.hasNext()) {
            String string = it.next().f54671c.toString();
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
    public static List<String> m79952S(Act act, List<LinkChannel> list) {
        List<C13135c> listM79953T = m79953T(act, list);
        ArrayList arrayList = new ArrayList(5);
        Iterator<C13135c> it = listM79953T.iterator();
        while (it.hasNext()) {
            String string = it.next().f54671c.toString();
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
    public static List<C13135c> m79953T(Act act, @Nullable final List<LinkChannel> list) {
        return vwb.m200339n(Arrays.asList(new C13135c(act.string(R$string.f17423d2), gmp0.f103510b, LinkChannel.get("wechat-moments"), new String[]{"com.tencent.mm"}), new C13135c(act.string(R$string.f17418c2), rmp0.f160111b, LinkChannel.get("wechat-session"), new String[]{"com.tencent.mm"}), new C13135c(act.string(R$string.f17488q2), dnb0.f87044b, LinkChannel.get("qq_friend"), new String[]{Constants.PACKAGE_TIM, "com.tencent.mobileqq", "com.tencent.mobileqqi"}), new C13135c(act.string(R$string.f17413b2), cnb0.f81658b, LinkChannel.get("qq-space"), new String[]{Constants.PACKAGE_TIM, "com.tencent.mobileqq", "com.tencent.mobileqqi"}), new C13135c(act.string(R$string.f17428e2), whf0.f186432b, LinkChannel.get("sina-weibo"), new String[]{"com.sina.weibo", "com.sina.weibog3", "com.sina.weibolite"})), new w9j() { // from class: l.wse0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                List list2 = list;
                ShareHelper.C13135c c13135c = (ShareHelper.C13135c) obj;
                return Boolean.valueOf(o460.m162549b(c13135c.f54672d) && (list2 == null || list2.contains(c13135c.f54671c)));
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX INFO: renamed from: U */
    public static String m79954U(@DrawableRes int i) throws Throwable {
        FileOutputStream fileOutputStream;
        Bitmap bitmapDecodeResource;
        File fileM145083O = k9j.m145083O("png");
        Bitmap bitmap = null;
        try {
            bitmapDecodeResource = BitmapFactory.decodeResource(App.f15369e.getResources(), i);
            try {
                fileOutputStream = new FileOutputStream(fileM145083O);
                try {
                    try {
                        bitmapDecodeResource.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        String absolutePath = fileM145083O.getAbsolutePath();
                        if (NullChecker.m81303a(bitmapDecodeResource)) {
                            bitmapDecodeResource.recycle();
                        }
                        t95.m187604b(fileOutputStream);
                        return absolutePath;
                    } catch (IOException e) {
                        e = e;
                        CrashHelper.m81296c(e);
                        if (NullChecker.m81303a(bitmapDecodeResource)) {
                            bitmapDecodeResource.recycle();
                        }
                        t95.m187604b(fileOutputStream);
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    bitmap = bitmapDecodeResource;
                    if (NullChecker.m81303a(bitmap)) {
                        bitmap.recycle();
                    }
                    t95.m187604b(fileOutputStream);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
                bitmap = bitmapDecodeResource;
                if (NullChecker.m81303a(bitmap)) {
                    bitmap.recycle();
                }
                t95.m187604b(fileOutputStream);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            bitmapDecodeResource = null;
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
            if (NullChecker.m81303a(bitmap)) {
                bitmap.recycle();
            }
            t95.m187604b(fileOutputStream);
            throw th;
        }
    }

    /* JADX INFO: renamed from: V */
    public static String m79955V() {
        return m79956W("share_icon.png");
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
    public static String m79956W(String str) throws Throwable {
        FileOutputStream fileOutputStream;
        File fileM145083O = k9j.m145083O("png");
        ?? r1 = 0;
        try {
            try {
                str = App.f15369e.getResources().getAssets().open(str);
                try {
                    fileOutputStream = new FileOutputStream(fileM145083O);
                    try {
                        c16.m104824a(str, fileOutputStream);
                        String absolutePath = fileM145083O.getAbsolutePath();
                        t95.m187604b(str);
                        t95.m187604b(fileOutputStream);
                        return absolutePath;
                    } catch (IOException e) {
                        e = e;
                        CrashHelper.m81296c(e);
                        t95.m187604b(str);
                        t95.m187604b(fileOutputStream);
                        return null;
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = null;
                } catch (Throwable th) {
                    th = th;
                    r1 = str;
                    t95.m187604b(r1);
                    t95.m187604b(0);
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
            t95.m187604b(r1);
            t95.m187604b(0);
            throw th;
        }
    }

    /* JADX INFO: renamed from: X */
    public static ArrayList<LinkChannel> m79957X(String str) {
        if ("qq".equals(str)) {
            return vwb.m200324f0(LinkChannel.get("qq_friend"));
        }
        if ("qz".equals(str)) {
            return vwb.m200324f0(LinkChannel.get("qq-space"));
        }
        if ("mo".equals(str)) {
            return vwb.m200324f0(LinkChannel.get("wechat-moments"));
        }
        if ("wx".equals(str)) {
            return vwb.m200324f0(LinkChannel.get("wechat-session"));
        }
        return "wb".equals(str) ? vwb.m200324f0(LinkChannel.get("sina-weibo")) : vwb.m200324f0(LinkChannel.get("wechat-moments"), LinkChannel.get("wechat-session"), LinkChannel.get("qq-space"), LinkChannel.get("qq_friend"), LinkChannel.get("sina-weibo"));
    }

    /* JADX INFO: renamed from: Y */
    public static ArrayList<LinkChannel> m79958Y(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return vwb.m200324f0(LinkChannel.get("wechat-moments"), LinkChannel.get("wechat-session"), LinkChannel.get("qq_friend"), LinkChannel.get("qq-space"), LinkChannel.get("sina-weibo"));
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
    public static ArrayList<LinkChannel> m79959Z(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return vwb.m200324f0(LinkChannel.get("wechat-moments"), LinkChannel.get("wechat-session"), LinkChannel.get("qq-space"), LinkChannel.get("qq_friend"), LinkChannel.get("sina-weibo"));
        }
        String[] strArrSplit = str.split(",\\s*");
        ArrayList<LinkChannel> arrayList = new ArrayList<>(strArrSplit.length);
        for (String str2 : strArrSplit) {
            if ("qq".equals(str2)) {
                arrayList.add(LinkChannel.get("qq_friend"));
            } else if ("qz".equals(str)) {
                arrayList = vwb.m200324f0(LinkChannel.get("qq-space"));
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
    public static String m79960a0(@Nullable LinkChannel linkChannel) {
        return linkChannel == null ? "unknown" : linkChannel.toString();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX INFO: renamed from: b0 */
    public static void m79961b0(ArrayList<LinkChannel> arrayList, Throwable th) {
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
                lsi0.m151580j("分享失败");
            } else {
                lsi0.m151580j("未安装".concat(str));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m79962d(List list, e30 e30Var, c0e c0eVar, Dialog dialog, View view, int i, CharSequence charSequence) {
        e30Var.call((C13135c) list.get(i));
        if (NullChecker.m81303a(c0eVar)) {
            c0eVar.m104736g();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m79963e(c0e c0eVar, Runnable runnable) {
        if (NullChecker.m81303a(c0eVar)) {
            c0eVar.m104740k(1, new Object[0]);
        }
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m79968j(String str, final AsyncEmitter asyncEmitter) {
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
            CrashHelper.m81296c(e);
            str = null;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            asyncEmitter.onError(new IllegalStateException("error download failed"));
        } else {
            C13111a.m79654u().m79665o(new DownloadTask.C13110b(qib0.f154693H.getDownloadHttp()).m79642q(str).m79640o(str3).m79635j(new f30() { // from class: l.tte0
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    e51.m114742G(new Runnable() { // from class: l.vte0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ShareHelper.m79977s(downloadTask, asyncEmitter);
                        }
                    });
                }
            }).m79631f(new f30() { // from class: l.ute0
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    asyncEmitter.onError((Throwable) obj2);
                }
            }).m79626a());
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m79977s(DownloadTask downloadTask, AsyncEmitter asyncEmitter) {
        App.f15369e.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://" + downloadTask.m79621v())));
        asyncEmitter.m132487l(downloadTask.m79621v());
        asyncEmitter.onCompleted();
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m79980v(c0e c0eVar, Runnable runnable, DialogInterface dialogInterface) {
        if (NullChecker.m81303a(c0eVar)) {
            c0eVar.m104736g();
        }
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m79984z(Throwable th) {
    }

    /* JADX INFO: renamed from: A0 */
    public void m79985A0(Act act, C13135c c13135c, final String str, final String str2, final String str3, String str4) {
        final ShareHelper shareHelper;
        final q480 q480VarM216109a = yue0.m216109a(c13135c.f54670b, act);
        if (TextUtils.isEmpty(str4)) {
            str4 = m79955V();
        }
        if (!TextUtils.isEmpty(str) && !str.startsWith("http://") && !str.startsWith("https://") && c13135c.f54670b.contains(Constants.SOURCE_QQ)) {
            m80014r0(q480VarM216109a, "error");
            return;
        }
        if (TextUtils.isEmpty(str4) || !str4.toLowerCase().startsWith("http") || c13135c.f54670b.contains(Constants.SOURCE_QQ)) {
            shareHelper = this;
            WebPageContent webPageContent = new WebPageContent(str2, str3, str, str4);
            q480VarM216109a.mo107748b(shareHelper);
            q480VarM216109a.mo107747a(webPageContent);
        } else {
            shareHelper = this;
            qib0.f154691G.m184720i(str4, new e30() { // from class: l.zte0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f204716a.m80009m0(str2, str3, str, q480VarM216109a, (String) obj);
                }
            });
        }
        shareHelper.m79990F0(c13135c);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m79986B0(Act act, C13135c c13135c, String str, @NonNull String str2, String str3) {
        q480 q480VarM216109a = yue0.m216109a(c13135c.f54670b, act);
        PicContent picContent = new PicContent(str2, new File(str3));
        q480VarM216109a.mo107748b(new C13134b());
        q480VarM216109a.mo107747a(picContent);
        m79990F0(c13135c);
    }

    /* JADX INFO: renamed from: C0 */
    public final C22306c<roj0> m79987C0(boolean z, final Act act, final String str, final String str2, final String str3, final ArrayList<LinkChannel> arrayList, final boolean z2, final String str4, final String str5, final LinkIntent linkIntent) {
        e51.m114742G(new Runnable() { // from class: l.hte0
            @Override // java.lang.Runnable
            public final void run() {
                this.f109388a.m80010n0();
            }
        });
        du2.m113670a("[putong-common][share]", "share_base dialogTitle = " + str + ", shareTitle = " + str2 + ", thumbnailUrl = " + str4 + ", needPreview = " + z + ", description = " + str3 + ", allowedChannels = " + arrayList + ", fallbackToSystem = " + z2 + ", previewActionName = " + str5);
        if (!z) {
            m80013q0(act, str, str2, str3, arrayList, z2, str4, null);
        } else if (m79953T(act, arrayList).size() < 2) {
            m80022z0(act, new Runnable() { // from class: l.ste0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f166330a.m80011o0(act, str, str2, str3, arrayList, z2, str4);
                }
            }, null, null, str5, linkIntent);
        } else {
            act.flow().m104744o(new w9j() { // from class: l.wte0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f188007a.m80012p0(act, str5, linkIntent, (c0e) obj);
                }
            }, new w9j() { // from class: l.xte0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f194374a.m80013q0(act, str, str2, str3, arrayList, z2, str4, (c0e) obj);
                }
            }).m104746q();
        }
        return this.f54664f.observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: D0 */
    public final void m79988D0(Activity activity, String str, String str2, String str3) {
        m79991G0("system");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("image/*");
        intent.putExtra("android.intent.extra.TEXT", str2);
        PackageManager packageManager = activity.getPackageManager();
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayListM200324f0 = vwb.m200324f0("com.tencent.mm.ui.tools.ShareToTimeLineUI", "com.tencent.mm.ui.tools.ShareToStatusUI");
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            final ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.packageName.contains("com.facebook.orca") && !vwb.m200337m(arrayListM200324f0, new w9j() { // from class: l.rte0
                @Override // p149l.w9j
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
    public final void m79989E0(Activity activity, @Nullable String str, @Nullable String str2, Uri uri) {
        m79991G0("system");
        if (NullChecker.m81304b(activity)) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_PNG);
            intent.putExtra("android.intent.extra.STREAM", uri);
            if (!TextUtils.isEmpty(str2)) {
                intent.putExtra("android.intent.extra.TEXT", str2);
            }
            intent.setFlags(268435456);
            activity.startActivity(Intent.createChooser(intent, str));
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final void m79990F0(@Nullable C13135c c13135c) {
        m79991G0(m79960a0(c13135c == null ? LinkChannel.get("unknown_") : c13135c.f54671c));
    }

    /* JADX INFO: renamed from: G0 */
    public final void m79991G0(String str) {
        if (this.f54666h) {
            return;
        }
        this.f54666h = true;
    }

    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m80010n0() {
        if (this.f54665g) {
            return;
        }
        this.f54665g = true;
    }

    /* JADX INFO: renamed from: I0 */
    public final void m79993I0(q480 q480Var) {
        if (this.f54667i) {
            return;
        }
        this.f54667i = true;
    }

    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final Dialog m80013q0(final Act act, final String str, final String str2, final String str3, ArrayList<LinkChannel> arrayList, final boolean z, final String str4, final c0e c0eVar) {
        final e30 e30Var = new e30() { // from class: l.aue0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71756a.m79999c0(z, act, str2, str, str3, str4, (ShareHelper.C13135c) obj);
            }
        };
        final List<C13135c> listM79953T = m79953T(act, arrayList);
        if (listM79953T.size() == 0) {
            e30Var.call(null);
            return null;
        }
        if (listM79953T.size() != 1) {
            return act.dialog().m20507G0(str).m20535e0(vwb.m200303Q(listM79953T, new w9j() { // from class: l.bue0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((ShareHelper.C13135c) obj).f54669a;
                }
            })).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.cue0
                @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
                /* JADX INFO: renamed from: a */
                public final void mo20569a(Dialog dialog, View view, int i, CharSequence charSequence) {
                    ShareHelper.m79939D(listM79953T, e30Var, c0eVar, dialog, view, i, charSequence);
                }
            }).m20568z0();
        }
        e30Var.call(listM79953T.get(0));
        return null;
    }

    /* JADX INFO: renamed from: P */
    public final Dialog m79995P(final Act act, final String str, final String str2, ArrayList<LinkChannel> arrayList, final boolean z, final String str3, final c0e c0eVar) {
        final C22306c c22306cJust;
        if (str3.toLowerCase().startsWith("http")) {
            C22306c c22306cDoOnSubscribe = m79950Q(str3).map(new w9j() { // from class: l.fte0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Optional.fromNullable((String) obj);
                }
            }).onErrorResumeNext((w9j<Throwable, ? extends C22306c<? extends R>>) new w9j() { // from class: l.gte0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return C22306c.just(Optional.absent());
                }
            }).observeOn(jo0.m142408a()).doOnSubscribe(new d30() { // from class: l.ite0
                @Override // p149l.d30
                public final void call() {
                    act.progress(R$string.f17389W, true);
                }
            });
            Objects.requireNonNull(act);
            c22306cJust = c22306cDoOnSubscribe.doOnTerminate(new md60(act));
        } else {
            c22306cJust = C22306c.just(Optional.m15413of(str3));
        }
        final e30 e30Var = new e30() { // from class: l.jte0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119593a.m80004h0(z, str3, act, str, str2, (j760) obj);
            }
        };
        final e30 e30Var2 = new e30() { // from class: l.kte0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f124579a.m80007k0(c22306cJust, e30Var, (ShareHelper.C13135c) obj);
            }
        };
        final List<C13135c> listM79953T = m79953T(act, arrayList);
        if (listM79953T.size() == 0) {
            e30Var2.call(null);
            return null;
        }
        if (listM79953T.size() != 1) {
            return act.dialog().m20507G0(str).m20535e0(vwb.m200303Q(listM79953T, new w9j() { // from class: l.lte0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((ShareHelper.C13135c) obj).f54669a;
                }
            })).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.mte0
                @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
                /* JADX INFO: renamed from: a */
                public final void mo20569a(Dialog dialog, View view, int i, CharSequence charSequence) {
                    ShareHelper.m79962d(listM79953T, e30Var2, c0eVar, dialog, view, i, charSequence);
                }
            }).m20568z0();
        }
        e30Var2.call(listM79953T.get(0));
        return null;
    }

    @Override // p149l.zue0
    /* JADX INFO: renamed from: a */
    public void mo79996a(q480 q480Var, Throwable th) {
        this.f54664f.onError(th);
        m80015s0(q480Var, "error", th);
    }

    @Override // p149l.zue0
    /* JADX INFO: renamed from: b */
    public void mo79997b(q480 q480Var) {
        m79993I0(q480Var);
        if (NullChecker.m81304b(this.f54661c)) {
            if (TextUtils.isEmpty(this.f54661c.f38765id)) {
                this.f54664f.m132487l(roj0.f160388a);
                this.f54664f.onCompleted();
            } else {
                qib0.f154701P.m164640B(this.f54661c.f38765id).map(new w9j() { // from class: l.nte0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return roj0.f160388a;
                    }
                }).subscribe(this.f54664f);
            }
        }
        m80014r0(q480Var, "complete");
    }

    @Override // p149l.zue0
    /* JADX INFO: renamed from: c */
    public void mo79998c(q480 q480Var) {
        this.f54664f.onCompleted();
        m80014r0(q480Var, "cancel");
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m79999c0(boolean z, final Act act, final String str, final String str2, final String str3, final String str4, final C13135c c13135c) {
        if (c13135c != null) {
            Link link = this.f54661c;
            link.channel = c13135c.f54671c;
            String str5 = link.href;
            if (str5 != null) {
                m79985A0(act, c13135c, str5, str, str3, str4);
                return;
            } else {
                act.progress(R$string.f17389W, true);
                qib0.f154701P.m164641C(link).subscribe(mkd0.m154956H(new e30() { // from class: l.dte0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f87834a.m80002f0(act, str, c13135c, str3, str4, (Link) obj);
                    }
                }, new e30() { // from class: l.ete0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f93107a.m80003g0(act, (Throwable) obj);
                    }
                }));
                return;
            }
        }
        if (!z) {
            mo79996a(null, new PlatformNotFoundException());
            return;
        }
        this.f54661c.channel = LinkChannel.get("unknown");
        if (this.f54661c.href == null) {
            act.progress(R$string.f17389W, true);
            qib0.f154701P.m164641C(this.f54661c).subscribe(mkd0.m154956H(new e30() { // from class: l.bte0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f77212a.m80000d0(act, str, str2, (Link) obj);
                }
            }, new e30() { // from class: l.cte0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f82471a.m80001e0(act, (Throwable) obj);
                }
            }));
            return;
        }
        m79988D0(act, str2, str + " ( " + this.f54661c.href + " ) ", this.f54661c.href);
        this.f54664f.onCompleted();
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m80000d0(Act act, String str, String str2, Link link) {
        act.progressDismiss();
        this.f54661c = link;
        if (!k0g0.m144048b(link.title)) {
            str = link.title;
        }
        m79988D0(act, str2, str + "（ " + link.href + " ) ", link.href);
        this.f54664f.onCompleted();
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m80001e0(Act act, Throwable th) {
        act.progressDismiss();
        mo79996a(null, th);
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m80002f0(Act act, String str, C13135c c13135c, String str2, String str3, Link link) {
        this.f54661c = link;
        act.progressDismiss();
        if (!k0g0.m144048b(link.title)) {
            str = link.title;
        }
        m79985A0(act, c13135c, link.href, str, str2, str3);
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m80003g0(Act act, Throwable th) {
        act.progressDismiss();
        mo79996a(null, th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m80004h0(boolean z, String str, Act act, String str2, String str3, j760 j760Var) {
        F f = j760Var.f116564a;
        if (f != 0) {
            this.f54661c.channel = ((C13135c) f).f54671c;
            m80010n0();
            m79986B0(act, (C13135c) j760Var.f116564a, str3, str, (String) j760Var.f116565b);
            return;
        }
        if (!z) {
            mo79996a(null, new PlatformNotFoundException());
            return;
        }
        this.f54661c.channel = LinkChannel.get("unknown");
        S s = j760Var.f116565b;
        if (s != 0) {
            str = (String) s;
        }
        m79989E0(act, str2, null, FileProvider.getUriForFile(act, "files." + App.f15369e.getPackageName(), new File(str)));
        this.f54664f.onCompleted();
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m80005i0(e30 e30Var, C13135c c13135c, Optional optional) {
        if (optional.isPresent()) {
            e30Var.call(new j760(c13135c, (String) optional.get()));
        } else {
            mo79996a(null, new NullPointerException("can't save image file or picUrlOrLocalPath is null"));
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m80006j0(Throwable th) {
        mo79996a(null, th);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m80007k0(C22306c c22306c, final e30 e30Var, final C13135c c13135c) {
        c22306c.subscribe(mkd0.m154956H(new e30() { // from class: l.ote0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f145577a.m80005i0(e30Var, c13135c, (Optional) obj);
            }
        }, new e30() { // from class: l.pte0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f151157a.m80006j0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m80009m0(String str, String str2, String str3, q480 q480Var, String str4) {
        WebPageContent webPageContent = new WebPageContent(str, str2, str3, str4);
        q480Var.mo107748b(this);
        q480Var.mo107747a(webPageContent);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m80011o0(Act act, String str, String str2, String str3, ArrayList arrayList, boolean z, String str4) {
        m80013q0(act, str, str2, str3, arrayList, z, str4, null);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Dialog m80012p0(Act act, String str, LinkIntent linkIntent, c0e c0eVar) {
        return m80022z0(act, null, null, c0eVar, str, linkIntent);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m80014r0(q480 q480Var, String str) {
        boolean z = str.contains("cancel") || str.contains("error");
        g30<String, String, Throwable> g30Var = this.f54663e;
        if (g30Var != null && z) {
            g30Var.mo36055a(q480Var != null ? q480Var.getName() : null, str, null);
            return;
        }
        f30<String, String> f30Var = this.f54662d;
        if (f30Var != null) {
            f30Var.call(q480Var != null ? q480Var.getName() : null, str);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m80015s0(q480 q480Var, String str, Throwable th) {
        boolean z = str.contains("cancel") || str.contains("error");
        g30<String, String, Throwable> g30Var = this.f54663e;
        if (g30Var != null && z) {
            g30Var.mo36055a(q480Var != null ? q480Var.getName() : null, str, th);
            return;
        }
        f30<String, String> f30Var = this.f54662d;
        if (f30Var != null) {
            f30Var.call(q480Var != null ? q480Var.getName() : null, str);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public ShareHelper m80016t0(f30<String, String> f30Var) {
        this.f54662d = f30Var;
        return this;
    }

    /* JADX INFO: renamed from: u0 */
    public ShareHelper m80017u0(g30<String, String, Throwable> g30Var) {
        this.f54663e = g30Var;
        return this;
    }

    /* JADX INFO: renamed from: v0 */
    public C22306c<roj0> m80018v0(Act act, String str, String str2, String str3, ArrayList<LinkChannel> arrayList, boolean z, String str4) {
        return m79987C0(false, act, str, str2, str3, arrayList, z, str4, "", null);
    }

    /* JADX INFO: renamed from: w0 */
    public C22306c<roj0> m80019w0(Act act, String str, String str2, ArrayList<LinkChannel> arrayList, boolean z) {
        return m80018v0(act, str, str2, null, arrayList, z, null);
    }

    /* JADX INFO: renamed from: x0 */
    public C22306c<roj0> m80020x0(Act act, String str, String str2, ArrayList<LinkChannel> arrayList, boolean z, String str3) {
        return m80018v0(act, str, str2, null, arrayList, z, str3);
    }

    /* JADX INFO: renamed from: y0 */
    public C22306c<roj0> m80021y0(Act act, String str, String str2, ArrayList<LinkChannel> arrayList, boolean z, String str3) {
        du2.m113670a("[putong-common][share]", "shareImage dialogTitle = " + str + ", shareTitle = " + str2 + ", picUrlOrLocalPath = " + str3 + ", allowedChannels = " + arrayList + ", fallbackToSystem = " + z);
        e51.m114748M(new Runnable() { // from class: l.yte0
            @Override // java.lang.Runnable
            public final void run() {
                this.f199913a.m80008l0();
            }
        });
        m79995P(act, str, str2, arrayList, z, str3, null);
        return this.f54664f.observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: z0 */
    public Dialog m80022z0(Act act, final Runnable runnable, final Runnable runnable2, final c0e c0eVar, String str, LinkIntent linkIntent) {
        Dialog dialogM20568z0 = act.dialog().m20518N(e6c0.f89535Q, true).m20557u().m20560v0(str, new Runnable() { // from class: l.xse0
            @Override // java.lang.Runnable
            public final void run() {
                ShareHelper.m79963e(c0eVar, runnable);
            }
        }).m20494A(new DialogInterface.OnCancelListener() { // from class: l.yse0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                ShareHelper.m79980v(c0eVar, runnable2, dialogInterface);
            }
        }).m20503E0(R$string.f17399Y1).m20513J0(17).m20555t().m20568z0();
        View viewM20458P = dialogM20568z0.m20458P();
        final WebViewX webViewX = (WebViewX) viewM20458P.findViewById(s4c0.f162298H0);
        webViewX.setWebViewClientX(new C13133a(act, (ProgressBar) viewM20458P.findViewById(s4c0.f162328c0)));
        Link linkMo223809clone = this.f54661c.mo223809clone();
        linkMo223809clone.intent = linkIntent;
        qib0.f154701P.m164641C(linkMo223809clone).subscribe(mkd0.m154956H(new e30() { // from class: l.zse0
            @Override // p149l.e30
            public final void call(Object obj) {
                webViewX.loadUrl(((Link) obj).href);
            }
        }, new e30() { // from class: l.ate0
            @Override // p149l.e30
            public final void call(Object obj) {
                ShareHelper.m79984z((Throwable) obj);
            }
        }));
        return dialogM20568z0;
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
