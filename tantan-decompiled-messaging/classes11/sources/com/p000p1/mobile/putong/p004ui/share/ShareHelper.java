package com.p000p1.mobile.putong.p004ui.share;

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
import com.google.common.base.Optional;
import com.p000p1.mobile.putong.p004ui.download.C0513a;
import com.p000p1.mobile.putong.p004ui.download.DownloadTask;
import com.p000p1.mobile.putong.p004ui.share.ShareHelper;
import com.p000p1.mobile.share_sdk.content.PicContent;
import com.p000p1.mobile.share_sdk.content.WebPageContent;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.app.web.WebViewX;
import com.p1.mobile.putong.common.R;
import com.p1.mobile.putong.data.Link;
import com.p1.mobile.putong.data.LinkChannel;
import com.p1.mobile.putong.data.LinkIntent;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import l.c0e;
import l.c16;
import l.d30;
import l.du2;
import l.e30;
import l.e51;
import l.e6c0;
import l.f30;
import l.g30;
import l.j760;
import l.jo0;
import l.k0g0;
import l.k9j;
import l.lsi0;
import l.mkd0;
import l.o460;
import l.qib0;
import l.roj0;
import l.s4c0;
import l.t95;
import l.vwb;
import l.w9j;
import p009l.cnb0;
import p009l.dnb0;
import p009l.gmp0;
import p009l.md60;
import p009l.q480;
import p009l.rmp0;
import p009l.sw3;
import p009l.whf0;
import p009l.yue0;
import p009l.zue0;
import rx.AsyncEmitter;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ShareHelper implements zue0 {

    /* JADX INFO: renamed from: j */
    public static boolean f8264j = false;

    /* JADX INFO: renamed from: a */
    public final String f8265a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final Map<String, String> f8266b;

    /* JADX INFO: renamed from: c */
    public Link f8267c;

    /* JADX INFO: renamed from: d */
    public f30<String, String> f8268d;

    /* JADX INFO: renamed from: e */
    public g30<String, String, Throwable> f8269e;

    /* JADX INFO: renamed from: f */
    public a<roj0> f8270f;

    /* JADX INFO: renamed from: g */
    public boolean f8271g;

    /* JADX INFO: renamed from: h */
    public boolean f8272h;

    /* JADX INFO: renamed from: i */
    public boolean f8273i;

    public static class PlatformNotFoundException extends Exception {
        public PlatformNotFoundException() {
            super("share platform not found");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.share.ShareHelper$a */
    public class C0535a extends sw3 {
        final /* synthetic */ ProgressBar val$progressBar;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0535a(Context context, ProgressBar progressBar) {
            super(context);
            this.val$progressBar = progressBar;
        }

        @Override // p009l.sw3
        public void onPageFinishedX(WebViewX webViewX, String str) {
            super.onPageFinishedX(webViewX, str);
            this.val$progressBar.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.share.ShareHelper$b */
    public class C0536b implements zue0 {
        public C0536b() {
        }

        @Override // p009l.zue0
        /* JADX INFO: renamed from: a */
        public void mo10325a(q480 q480Var, Throwable th) {
            ShareHelper.this.f8270f.onError((Throwable) null);
            ShareHelper.this.m10344s0(q480Var, "error", th);
        }

        @Override // p009l.zue0
        /* JADX INFO: renamed from: b */
        public void mo10326b(q480 q480Var) {
            ShareHelper.this.f8270f.onNext(roj0.a);
            ShareHelper.this.f8270f.onCompleted();
            ShareHelper.this.m10322I0(q480Var);
            ShareHelper.this.m10343r0(q480Var, "complete");
        }

        @Override // p009l.zue0
        /* JADX INFO: renamed from: c */
        public void mo10327c(q480 q480Var) {
            ShareHelper.this.f8270f.onCompleted();
            ShareHelper.this.m10343r0(q480Var, "cancel");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.share.ShareHelper$c */
    public static class C0537c {

        /* JADX INFO: renamed from: a */
        public final String f8275a;

        /* JADX INFO: renamed from: b */
        public final String f8276b;

        /* JADX INFO: renamed from: c */
        public final LinkChannel f8277c;

        /* JADX INFO: renamed from: d */
        public final String[] f8278d;

        public C0537c(String str, String str2, LinkChannel linkChannel, String[] strArr) {
            this.f8275a = str;
            this.f8276b = str2;
            this.f8277c = linkChannel;
            this.f8278d = strArr;
        }
    }

    public ShareHelper(Link link, String str, @Nullable Map<String, String> map) {
        this.f8270f = a.b();
        this.f8271g = false;
        this.f8272h = false;
        this.f8273i = false;
        this.f8267c = link;
        this.f8265a = str;
        this.f8266b = map;
        if (f8264j) {
            return;
        }
        yue0.m25510b(App.e.getResources().getString(R.string.w0));
        f8264j = true;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m10268D(List list, e30 e30Var, c0e c0eVar, Dialog dialog, View view, int i, CharSequence charSequence) {
        e30Var.call((C0537c) list.get(i));
        if (NullChecker.a(c0eVar)) {
            c0eVar.g();
        }
    }

    /* JADX INFO: renamed from: N */
    public static void m10278N(Context context, String str, String str2, String str3, String str4, String str5) {
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", str2 + "\n" + str);
            intent.setType("text/plain");
            context.startActivity(Intent.createChooser(intent, str2));
        } catch (ActivityNotFoundException e) {
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: Q */
    public static c<String> m10279Q(final String str) {
        return c.fromAsync(new e30() { // from class: l.qte0
            public final void call(Object obj) {
                ShareHelper.m10297j(str, (AsyncEmitter) obj);
            }
        }, AsyncEmitter.BackpressureMode.BUFFER);
    }

    /* JADX INFO: renamed from: R */
    public static List<String> m10280R(Act act) {
        List<C0537c> listM10282T = m10282T(act, null);
        ArrayList arrayList = new ArrayList(5);
        Iterator<C0537c> it = listM10282T.iterator();
        while (it.hasNext()) {
            String string = it.next().f8277c.toString();
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
    public static List<String> m10281S(Act act, List<LinkChannel> list) {
        List<C0537c> listM10282T = m10282T(act, list);
        ArrayList arrayList = new ArrayList(5);
        Iterator<C0537c> it = listM10282T.iterator();
        while (it.hasNext()) {
            String string = it.next().f8277c.toString();
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
    public static List<C0537c> m10282T(Act act, @Nullable final List<LinkChannel> list) {
        return vwb.n(Arrays.asList(new C0537c(act.string(R.string.d2), gmp0.f13644b, LinkChannel.get("wechat-moments"), new String[]{"com.tencent.mm"}), new C0537c(act.string(R.string.c2), rmp0.f19913b, LinkChannel.get("wechat-session"), new String[]{"com.tencent.mm"}), new C0537c(act.string(R.string.q2), dnb0.f11916b, LinkChannel.get("qq_friend"), new String[]{"com.tencent.tim", "com.tencent.mobileqq", "com.tencent.mobileqqi"}), new C0537c(act.string(R.string.b2), cnb0.f10700b, LinkChannel.get("qq-space"), new String[]{"com.tencent.tim", "com.tencent.mobileqq", "com.tencent.mobileqqi"}), new C0537c(act.string(R.string.e2), whf0.f22112b, LinkChannel.get("sina-weibo"), new String[]{"com.sina.weibo", "com.sina.weibog3", "com.sina.weibolite"})), new w9j() { // from class: l.wse0
            public final Object call(Object obj) {
                List list2 = list;
                ShareHelper.C0537c c0537c = (ShareHelper.C0537c) obj;
                return Boolean.valueOf(o460.b(c0537c.f8278d) && (list2 == null || list2.contains(c0537c.f8277c)));
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX INFO: renamed from: U */
    public static String m10283U(@DrawableRes int i) throws Throwable {
        FileOutputStream fileOutputStream;
        Bitmap bitmapDecodeResource;
        File fileO = k9j.O("png");
        Bitmap bitmap = null;
        try {
            bitmapDecodeResource = BitmapFactory.decodeResource(App.e.getResources(), i);
            try {
                fileOutputStream = new FileOutputStream(fileO);
                try {
                    try {
                        bitmapDecodeResource.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        String absolutePath = fileO.getAbsolutePath();
                        if (NullChecker.a(bitmapDecodeResource)) {
                            bitmapDecodeResource.recycle();
                        }
                        t95.b(fileOutputStream);
                        return absolutePath;
                    } catch (IOException e) {
                        e = e;
                        CrashHelper.c(e);
                        if (NullChecker.a(bitmapDecodeResource)) {
                            bitmapDecodeResource.recycle();
                        }
                        t95.b(fileOutputStream);
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    bitmap = bitmapDecodeResource;
                    if (NullChecker.a(bitmap)) {
                        bitmap.recycle();
                    }
                    t95.b(fileOutputStream);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
                bitmap = bitmapDecodeResource;
                if (NullChecker.a(bitmap)) {
                    bitmap.recycle();
                }
                t95.b(fileOutputStream);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            bitmapDecodeResource = null;
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
            if (NullChecker.a(bitmap)) {
                bitmap.recycle();
            }
            t95.b(fileOutputStream);
            throw th;
        }
    }

    /* JADX INFO: renamed from: V */
    public static String m10284V() {
        return m10285W("share_icon.png");
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
    public static String m10285W(String str) throws Throwable {
        FileOutputStream fileOutputStream;
        File fileO = k9j.O("png");
        ?? r1 = 0;
        try {
            try {
                str = App.e.getResources().getAssets().open(str);
                try {
                    fileOutputStream = new FileOutputStream(fileO);
                    try {
                        c16.a((InputStream) str, fileOutputStream);
                        String absolutePath = fileO.getAbsolutePath();
                        t95.b((Closeable) str);
                        t95.b(fileOutputStream);
                        return absolutePath;
                    } catch (IOException e) {
                        e = e;
                        CrashHelper.c(e);
                        t95.b((Closeable) str);
                        t95.b(fileOutputStream);
                        return null;
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = null;
                } catch (Throwable th) {
                    th = th;
                    r1 = str;
                    t95.b((Closeable) r1);
                    t95.b((Closeable) 0);
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
            t95.b((Closeable) r1);
            t95.b((Closeable) 0);
            throw th;
        }
    }

    /* JADX INFO: renamed from: X */
    public static ArrayList<LinkChannel> m10286X(String str) {
        if ("qq".equals(str)) {
            return vwb.f0(new LinkChannel[]{LinkChannel.get("qq_friend")});
        }
        if ("qz".equals(str)) {
            return vwb.f0(new LinkChannel[]{LinkChannel.get("qq-space")});
        }
        if ("mo".equals(str)) {
            return vwb.f0(new LinkChannel[]{LinkChannel.get("wechat-moments")});
        }
        if ("wx".equals(str)) {
            return vwb.f0(new LinkChannel[]{LinkChannel.get("wechat-session")});
        }
        return "wb".equals(str) ? vwb.f0(new LinkChannel[]{LinkChannel.get("sina-weibo")}) : vwb.f0(new LinkChannel[]{LinkChannel.get("wechat-moments"), LinkChannel.get("wechat-session"), LinkChannel.get("qq-space"), LinkChannel.get("qq_friend"), LinkChannel.get("sina-weibo")});
    }

    /* JADX INFO: renamed from: Y */
    public static ArrayList<LinkChannel> m10287Y(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return vwb.f0(new LinkChannel[]{LinkChannel.get("wechat-moments"), LinkChannel.get("wechat-session"), LinkChannel.get("qq_friend"), LinkChannel.get("qq-space"), LinkChannel.get("sina-weibo")});
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
    public static ArrayList<LinkChannel> m10288Z(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return vwb.f0(new LinkChannel[]{LinkChannel.get("wechat-moments"), LinkChannel.get("wechat-session"), LinkChannel.get("qq-space"), LinkChannel.get("qq_friend"), LinkChannel.get("sina-weibo")});
        }
        String[] strArrSplit = str.split(",\\s*");
        ArrayList<LinkChannel> arrayList = new ArrayList<>(strArrSplit.length);
        for (String str2 : strArrSplit) {
            if ("qq".equals(str2)) {
                arrayList.add(LinkChannel.get("qq_friend"));
            } else if ("qz".equals(str)) {
                arrayList = vwb.f0(new LinkChannel[]{LinkChannel.get("qq-space")});
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
    public static String m10289a0(@Nullable LinkChannel linkChannel) {
        return linkChannel == null ? "unknown" : linkChannel.toString();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX INFO: renamed from: b0 */
    public static void m10290b0(ArrayList<LinkChannel> arrayList, Throwable th) {
        String str;
        if (th instanceof PlatformNotFoundException) {
            if (arrayList.size() == 1) {
                String string = arrayList.get(0).toString();
                string.getClass();
                switch (string) {
                    case "qq-space":
                    case "qq_friend":
                        str = "QQ";
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
                lsi0.j("分享失败");
            } else {
                lsi0.j("未安装".concat(str));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m10291d(List list, e30 e30Var, c0e c0eVar, Dialog dialog, View view, int i, CharSequence charSequence) {
        e30Var.call((C0537c) list.get(i));
        if (NullChecker.a(c0eVar)) {
            c0eVar.g();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m10292e(c0e c0eVar, Runnable runnable) {
        if (NullChecker.a(c0eVar)) {
            c0eVar.k(1, new Object[0]);
        }
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m10297j(String str, final AsyncEmitter asyncEmitter) {
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
            CrashHelper.c(e);
            str = null;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            asyncEmitter.onError(new IllegalStateException("error download failed"));
        } else {
            C0513a.m9975u().m9986o(new DownloadTask.C0512b(qib0.H.getDownloadHttp()).m9963q(str).m9961o(str3).m9956j(new f30() { // from class: l.tte0
                public final void call(Object obj, Object obj2) {
                    e51.G(new Runnable() { // from class: l.vte0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ShareHelper.m10306s(downloadTask, asyncEmitter);
                        }
                    });
                }
            }).m9952f(new f30() { // from class: l.ute0
                public final void call(Object obj, Object obj2) {
                    asyncEmitter.onError((Throwable) obj2);
                }
            }).m9947a());
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m10306s(DownloadTask downloadTask, AsyncEmitter asyncEmitter) {
        App.e.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://" + downloadTask.m9942v())));
        asyncEmitter.onNext(downloadTask.m9942v());
        asyncEmitter.onCompleted();
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m10309v(c0e c0eVar, Runnable runnable, DialogInterface dialogInterface) {
        if (NullChecker.a(c0eVar)) {
            c0eVar.g();
        }
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m10313z(Throwable th) {
    }

    /* JADX INFO: renamed from: A0 */
    public void m10314A0(Act act, C0537c c0537c, final String str, final String str2, final String str3, String str4) {
        final ShareHelper shareHelper;
        final q480 q480VarM25509a = yue0.m25509a(c0537c.f8276b, act);
        if (TextUtils.isEmpty(str4)) {
            str4 = m10284V();
        }
        if (!TextUtils.isEmpty(str) && !str.startsWith("http://") && !str.startsWith("https://") && c0537c.f8276b.contains("QQ")) {
            m10343r0(q480VarM25509a, "error");
            return;
        }
        if (TextUtils.isEmpty(str4) || !str4.toLowerCase().startsWith("http") || c0537c.f8276b.contains("QQ")) {
            shareHelper = this;
            WebPageContent webPageContent = new WebPageContent(str2, str3, str, str4);
            q480VarM25509a.mo12720b(shareHelper);
            q480VarM25509a.mo12719a(webPageContent);
        } else {
            shareHelper = this;
            qib0.G.i(str4, new e30() { // from class: l.zte0
                public final void call(Object obj) {
                    this.f23896a.m10338m0(str2, str3, str, q480VarM25509a, (String) obj);
                }
            });
        }
        shareHelper.m10319F0(c0537c);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m10315B0(Act act, C0537c c0537c, String str, @NonNull String str2, String str3) {
        q480 q480VarM25509a = yue0.m25509a(c0537c.f8276b, act);
        PicContent picContent = new PicContent(str2, new File(str3));
        q480VarM25509a.mo12720b(new C0536b());
        q480VarM25509a.mo12719a(picContent);
        m10319F0(c0537c);
    }

    /* JADX INFO: renamed from: C0 */
    public final c<roj0> m10316C0(boolean z, final Act act, final String str, final String str2, final String str3, final ArrayList<LinkChannel> arrayList, final boolean z2, final String str4, final String str5, final LinkIntent linkIntent) {
        e51.G(new Runnable() { // from class: l.hte0
            @Override // java.lang.Runnable
            public final void run() {
                this.f14247a.m10339n0();
            }
        });
        du2.a("[putong-common][share]", "share_base dialogTitle = " + str + ", shareTitle = " + str2 + ", thumbnailUrl = " + str4 + ", needPreview = " + z + ", description = " + str3 + ", allowedChannels = " + arrayList + ", fallbackToSystem = " + z2 + ", previewActionName = " + str5);
        if (!z) {
            m10342q0(act, str, str2, str3, arrayList, z2, str4, null);
        } else if (m10282T(act, arrayList).size() < 2) {
            m10351z0(act, new Runnable() { // from class: l.ste0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20457a.m10340o0(act, str, str2, str3, arrayList, z2, str4);
                }
            }, null, null, str5, linkIntent);
        } else {
            act.flow().o(new w9j[]{new w9j() { // from class: l.wte0
                public final Object call(Object obj) {
                    return this.f22309a.m10341p0(act, str5, linkIntent, (c0e) obj);
                }
            }, new w9j() { // from class: l.xte0
                public final Object call(Object obj) {
                    return this.f22716a.m10342q0(act, str, str2, str3, arrayList, z2, str4, (c0e) obj);
                }
            }}).q();
        }
        return this.f8270f.observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: D0 */
    public final void m10317D0(Activity activity, String str, String str2, String str3) {
        m10320G0("system");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("image/*");
        intent.putExtra("android.intent.extra.TEXT", str2);
        PackageManager packageManager = activity.getPackageManager();
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayListF0 = vwb.f0(new String[]{"com.tencent.mm.ui.tools.ShareToTimeLineUI", "com.tencent.mm.ui.tools.ShareToStatusUI"});
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            final ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.packageName.contains("com.facebook.orca") && !vwb.m(arrayListF0, new w9j() { // from class: l.rte0
                public final Object call(Object obj) {
                    return Boolean.valueOf(((String) obj).equals(activityInfo.name));
                }
            })) {
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                intent2.setPackage(activityInfo.packageName);
                intent2.setType("text/plain");
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
    public final void m10318E0(Activity activity, @Nullable String str, @Nullable String str2, Uri uri) {
        m10320G0("system");
        if (NullChecker.b(activity)) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("image/png");
            intent.putExtra("android.intent.extra.STREAM", uri);
            if (!TextUtils.isEmpty(str2)) {
                intent.putExtra("android.intent.extra.TEXT", str2);
            }
            intent.setFlags(268435456);
            activity.startActivity(Intent.createChooser(intent, str));
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final void m10319F0(@Nullable C0537c c0537c) {
        m10320G0(m10289a0(c0537c == null ? LinkChannel.get("unknown_") : c0537c.f8277c));
    }

    /* JADX INFO: renamed from: G0 */
    public final void m10320G0(String str) {
        if (this.f8272h) {
            return;
        }
        this.f8272h = true;
    }

    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m10339n0() {
        if (this.f8271g) {
            return;
        }
        this.f8271g = true;
    }

    /* JADX INFO: renamed from: I0 */
    public final void m10322I0(q480 q480Var) {
        if (this.f8273i) {
            return;
        }
        this.f8273i = true;
    }

    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final Dialog m10342q0(final Act act, final String str, final String str2, final String str3, ArrayList<LinkChannel> arrayList, final boolean z, final String str4, final c0e c0eVar) {
        final e30 e30Var = new e30() { // from class: l.aue0
            public final void call(Object obj) {
                this.f9693a.m10328c0(z, act, str2, str, str3, str4, (ShareHelper.C0537c) obj);
            }
        };
        final List<C0537c> listM10282T = m10282T(act, arrayList);
        if (listM10282T.size() == 0) {
            e30Var.call((Object) null);
            return null;
        }
        if (listM10282T.size() != 1) {
            return act.dialog().G0(str).e0(vwb.Q(listM10282T, new w9j() { // from class: l.bue0
                public final Object call(Object obj) {
                    return ((ShareHelper.C0537c) obj).f8275a;
                }
            })).g0(new Dialog.g() { // from class: l.cue0
                /* JADX INFO: renamed from: a */
                public final void m12848a(Dialog dialog, View view, int i, CharSequence charSequence) {
                    ShareHelper.m10268D(listM10282T, e30Var, c0eVar, dialog, view, i, charSequence);
                }
            }).z0();
        }
        e30Var.call(listM10282T.get(0));
        return null;
    }

    /* JADX INFO: renamed from: P */
    public final Dialog m10324P(final Act act, final String str, final String str2, ArrayList<LinkChannel> arrayList, final boolean z, final String str3, final c0e c0eVar) {
        final c cVarJust;
        if (str3.toLowerCase().startsWith("http")) {
            c cVarDoOnSubscribe = m10279Q(str3).map(new w9j() { // from class: l.fte0
                public final Object call(Object obj) {
                    return Optional.fromNullable((String) obj);
                }
            }).onErrorResumeNext(new w9j() { // from class: l.gte0
                public final Object call(Object obj) {
                    return c.just(Optional.absent());
                }
            }).observeOn(jo0.a()).doOnSubscribe(new d30() { // from class: l.ite0
                public final void call() {
                    act.progress(R.string.W, true);
                }
            });
            Objects.requireNonNull(act);
            cVarJust = cVarDoOnSubscribe.doOnTerminate(new md60(act));
        } else {
            cVarJust = c.just(Optional.of(str3));
        }
        final e30 e30Var = new e30() { // from class: l.jte0
            public final void call(Object obj) {
                this.f15282a.m10333h0(z, str3, act, str, str2, (j760) obj);
            }
        };
        final e30 e30Var2 = new e30() { // from class: l.kte0
            public final void call(Object obj) {
                this.f15846a.m10336k0(cVarJust, e30Var, (ShareHelper.C0537c) obj);
            }
        };
        final List<C0537c> listM10282T = m10282T(act, arrayList);
        if (listM10282T.size() == 0) {
            e30Var2.call((Object) null);
            return null;
        }
        if (listM10282T.size() != 1) {
            return act.dialog().G0(str).e0(vwb.Q(listM10282T, new w9j() { // from class: l.lte0
                public final Object call(Object obj) {
                    return ((ShareHelper.C0537c) obj).f8275a;
                }
            })).g0(new Dialog.g() { // from class: l.mte0
                /* JADX INFO: renamed from: a */
                public final void m18586a(Dialog dialog, View view, int i, CharSequence charSequence) {
                    ShareHelper.m10291d(listM10282T, e30Var2, c0eVar, dialog, view, i, charSequence);
                }
            }).z0();
        }
        e30Var2.call(listM10282T.get(0));
        return null;
    }

    @Override // p009l.zue0
    /* JADX INFO: renamed from: a */
    public void mo10325a(q480 q480Var, Throwable th) {
        this.f8270f.onError(th);
        m10344s0(q480Var, "error", th);
    }

    @Override // p009l.zue0
    /* JADX INFO: renamed from: b */
    public void mo10326b(q480 q480Var) {
        m10322I0(q480Var);
        if (NullChecker.b(this.f8267c)) {
            if (TextUtils.isEmpty(this.f8267c.id)) {
                this.f8270f.onNext(roj0.a);
                this.f8270f.onCompleted();
            } else {
                qib0.P.B(this.f8267c.id).map(new w9j() { // from class: l.nte0
                    public final Object call(Object obj) {
                        return roj0.a;
                    }
                }).subscribe(this.f8270f);
            }
        }
        m10343r0(q480Var, "complete");
    }

    @Override // p009l.zue0
    /* JADX INFO: renamed from: c */
    public void mo10327c(q480 q480Var) {
        this.f8270f.onCompleted();
        m10343r0(q480Var, "cancel");
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m10328c0(boolean z, final Act act, final String str, final String str2, final String str3, final String str4, final C0537c c0537c) {
        if (c0537c != null) {
            Link link = this.f8267c;
            link.channel = c0537c.f8277c;
            String str5 = link.href;
            if (str5 != null) {
                m10314A0(act, c0537c, str5, str, str3, str4);
                return;
            } else {
                act.progress(R.string.W, true);
                qib0.P.C(link).subscribe(mkd0.H(new e30() { // from class: l.dte0
                    public final void call(Object obj) {
                        this.f11982a.m10331f0(act, str, c0537c, str3, str4, (Link) obj);
                    }
                }, new e30() { // from class: l.ete0
                    public final void call(Object obj) {
                        this.f12683a.m10332g0(act, (Throwable) obj);
                    }
                }));
                return;
            }
        }
        if (!z) {
            mo10325a(null, new PlatformNotFoundException());
            return;
        }
        this.f8267c.channel = LinkChannel.get("unknown");
        if (this.f8267c.href == null) {
            act.progress(R.string.W, true);
            qib0.P.C(this.f8267c).subscribe(mkd0.H(new e30() { // from class: l.bte0
                public final void call(Object obj) {
                    this.f10299a.m10329d0(act, str, str2, (Link) obj);
                }
            }, new e30() { // from class: l.cte0
                public final void call(Object obj) {
                    this.f10762a.m10330e0(act, (Throwable) obj);
                }
            }));
            return;
        }
        m10317D0(act, str2, str + " ( " + this.f8267c.href + " ) ", this.f8267c.href);
        this.f8270f.onCompleted();
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m10329d0(Act act, String str, String str2, Link link) {
        act.progressDismiss();
        this.f8267c = link;
        if (!k0g0.b(link.title)) {
            str = link.title;
        }
        m10317D0(act, str2, str + "（ " + link.href + " ) ", link.href);
        this.f8270f.onCompleted();
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m10330e0(Act act, Throwable th) {
        act.progressDismiss();
        mo10325a(null, th);
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m10331f0(Act act, String str, C0537c c0537c, String str2, String str3, Link link) {
        this.f8267c = link;
        act.progressDismiss();
        if (!k0g0.b(link.title)) {
            str = link.title;
        }
        m10314A0(act, c0537c, link.href, str, str2, str3);
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m10332g0(Act act, Throwable th) {
        act.progressDismiss();
        mo10325a(null, th);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m10333h0(boolean z, String str, Act act, String str2, String str3, j760 j760Var) {
        Object obj = j760Var.a;
        if (obj != null) {
            this.f8267c.channel = ((C0537c) obj).f8277c;
            m10339n0();
            m10315B0(act, (C0537c) j760Var.a, str3, str, (String) j760Var.b);
            return;
        }
        if (!z) {
            mo10325a(null, new PlatformNotFoundException());
            return;
        }
        this.f8267c.channel = LinkChannel.get("unknown");
        Object obj2 = j760Var.b;
        if (obj2 != null) {
            str = (String) obj2;
        }
        m10318E0(act, str2, null, FileProvider.getUriForFile(act, "files." + App.e.getPackageName(), new File(str)));
        this.f8270f.onCompleted();
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m10334i0(e30 e30Var, C0537c c0537c, Optional optional) {
        if (optional.isPresent()) {
            e30Var.call(new j760(c0537c, (String) optional.get()));
        } else {
            mo10325a(null, new NullPointerException("can't save image file or picUrlOrLocalPath is null"));
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m10335j0(Throwable th) {
        mo10325a(null, th);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m10336k0(c cVar, final e30 e30Var, final C0537c c0537c) {
        cVar.subscribe(mkd0.H(new e30() { // from class: l.ote0
            public final void call(Object obj) {
                this.f18241a.m10334i0(e30Var, c0537c, (Optional) obj);
            }
        }, new e30() { // from class: l.pte0
            public final void call(Object obj) {
                this.f18901a.m10335j0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m10338m0(String str, String str2, String str3, q480 q480Var, String str4) {
        WebPageContent webPageContent = new WebPageContent(str, str2, str3, str4);
        q480Var.mo12720b(this);
        q480Var.mo12719a(webPageContent);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m10340o0(Act act, String str, String str2, String str3, ArrayList arrayList, boolean z, String str4) {
        m10342q0(act, str, str2, str3, arrayList, z, str4, null);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Dialog m10341p0(Act act, String str, LinkIntent linkIntent, c0e c0eVar) {
        return m10351z0(act, null, null, c0eVar, str, linkIntent);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m10343r0(q480 q480Var, String str) {
        boolean z = str.contains("cancel") || str.contains("error");
        g30<String, String, Throwable> g30Var = this.f8269e;
        if (g30Var != null && z) {
            g30Var.a(q480Var != null ? q480Var.getName() : null, str, (Object) null);
            return;
        }
        f30<String, String> f30Var = this.f8268d;
        if (f30Var != null) {
            f30Var.call(q480Var != null ? q480Var.getName() : null, str);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m10344s0(q480 q480Var, String str, Throwable th) {
        boolean z = str.contains("cancel") || str.contains("error");
        g30<String, String, Throwable> g30Var = this.f8269e;
        if (g30Var != null && z) {
            g30Var.a(q480Var != null ? q480Var.getName() : null, str, th);
            return;
        }
        f30<String, String> f30Var = this.f8268d;
        if (f30Var != null) {
            f30Var.call(q480Var != null ? q480Var.getName() : null, str);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public ShareHelper m10345t0(f30<String, String> f30Var) {
        this.f8268d = f30Var;
        return this;
    }

    /* JADX INFO: renamed from: u0 */
    public ShareHelper m10346u0(g30<String, String, Throwable> g30Var) {
        this.f8269e = g30Var;
        return this;
    }

    /* JADX INFO: renamed from: v0 */
    public c<roj0> m10347v0(Act act, String str, String str2, String str3, ArrayList<LinkChannel> arrayList, boolean z, String str4) {
        return m10316C0(false, act, str, str2, str3, arrayList, z, str4, "", null);
    }

    /* JADX INFO: renamed from: w0 */
    public c<roj0> m10348w0(Act act, String str, String str2, ArrayList<LinkChannel> arrayList, boolean z) {
        return m10347v0(act, str, str2, null, arrayList, z, null);
    }

    /* JADX INFO: renamed from: x0 */
    public c<roj0> m10349x0(Act act, String str, String str2, ArrayList<LinkChannel> arrayList, boolean z, String str3) {
        return m10347v0(act, str, str2, null, arrayList, z, str3);
    }

    /* JADX INFO: renamed from: y0 */
    public c<roj0> m10350y0(Act act, String str, String str2, ArrayList<LinkChannel> arrayList, boolean z, String str3) {
        du2.a("[putong-common][share]", "shareImage dialogTitle = " + str + ", shareTitle = " + str2 + ", picUrlOrLocalPath = " + str3 + ", allowedChannels = " + arrayList + ", fallbackToSystem = " + z);
        e51.M(new Runnable() { // from class: l.yte0
            @Override // java.lang.Runnable
            public final void run() {
                this.f23227a.m10337l0();
            }
        });
        m10324P(act, str, str2, arrayList, z, str3, null);
        return this.f8270f.observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: z0 */
    public Dialog m10351z0(Act act, final Runnable runnable, final Runnable runnable2, final c0e c0eVar, String str, LinkIntent linkIntent) {
        Dialog dialogZ0 = act.dialog().N(e6c0.Q, true).u().v0(str, new Runnable() { // from class: l.xse0
            @Override // java.lang.Runnable
            public final void run() {
                ShareHelper.m10292e(c0eVar, runnable);
            }
        }).A(new DialogInterface.OnCancelListener() { // from class: l.yse0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                ShareHelper.m10309v(c0eVar, runnable2, dialogInterface);
            }
        }).E0(R.string.Y1).J0(17).t().z0();
        View viewP = dialogZ0.P();
        final WebViewX webViewXFindViewById = viewP.findViewById(s4c0.H0);
        webViewXFindViewById.setWebViewClientX(new C0535a(act, (ProgressBar) viewP.findViewById(s4c0.c0)));
        Link linkClone = this.f8267c.clone();
        linkClone.intent = linkIntent;
        qib0.P.C(linkClone).subscribe(mkd0.H(new e30() { // from class: l.zse0
            public final void call(Object obj) {
                webViewXFindViewById.loadUrl(((Link) obj).href);
            }
        }, new e30() { // from class: l.ate0
            public final void call(Object obj) {
                ShareHelper.m10313z((Throwable) obj);
            }
        }));
        return dialogZ0;
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
