package com.hellogroup.p036mk.core.configs.p040ua;

import android.content.Context;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.meituan.robust.Constants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.lv0;
import p153l.nde0;
import p153l.q0e;
import p153l.sjw;
import p153l.ujw;
import p153l.wi20;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\r\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u000e\u0010\f¨\u0006\u0010"}, m88121d2 = {"Lcom/hellogroup/mk/core/configs/ua/MKCoreUserAgent;", "", "<init>", "()V", "Ll/ujw;", "appendUA", "", "pageUrl", "a", "(Ll/ujw;Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/Lazy;", "b", "()Ljava/lang/String;", "versionCode", "c", "versionName", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class MKCoreUserAgent {
    public static final MKCoreUserAgent INSTANCE = new MKCoreUserAgent();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final Lazy versionCode = LazyKt__LazyJVMKt.m88118b(new Function0<String>() { // from class: com.hellogroup.mk.core.configs.ua.MKCoreUserAgent$versionCode$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            q0e q0eVar = q0e.INSTANCE;
            Context contextM155971a = lv0.m155971a();
            contextM155971a.getClass();
            return String.valueOf(q0eVar.m174695f(contextM155971a));
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final Lazy versionName = LazyKt__LazyJVMKt.m88118b(new Function0<String>() { // from class: com.hellogroup.mk.core.configs.ua.MKCoreUserAgent$versionName$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            q0e q0eVar = q0e.INSTANCE;
            Context contextM155971a = lv0.m155971a();
            contextM155971a.getClass();
            return q0eVar.m174694e(contextM155971a);
        }
    });

    private MKCoreUserAgent() {
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:5:0x0013, B:11:0x0023, B:13:0x0042, B:17:0x004f, B:19:0x0077, B:23:0x0083, B:27:0x009c, B:29:0x00b4, B:31:0x00ba, B:36:0x00c4, B:38:0x00ce, B:42:0x00d7, B:44:0x00dd, B:46:0x00e9, B:47:0x0102, B:22:0x007e, B:16:0x0049, B:10:0x001d), top: B:52:0x0013 }] */
    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final synchronized String m18384a(@Nullable ujw appendUA, @Nullable String pageUrl) {
        String versionName2;
        StringBuilder sb;
        String strM18385b;
        Object appChanel;
        Function1<String, String> function1M196466c;
        String customAppendUA;
        if (appendUA != null) {
            try {
                versionName2 = appendUA.getVersionName();
                if (versionName2 == null) {
                    versionName2 = INSTANCE.m18386c();
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            versionName2 = INSTANCE.m18386c();
        }
        q0e q0eVar = q0e.INSTANCE;
        String strM174693c = q0eVar.m174693c();
        String strM174692b = q0eVar.m174692b();
        String strM174691a = q0eVar.m174691a();
        String strM155974d = lv0.m155974d();
        sb = new StringBuilder("momoKit/1.0.0 momoWebView/");
        sb.append(versionName2);
        sb.append(" android/");
        if (appendUA == null || (strM18385b = appendUA.getVersionCode()) == null) {
            strM18385b = INSTANCE.m18385b();
        }
        sb.append(strM18385b);
        sb.append("(");
        sb.append(strM174692b);
        sb.append(";android ");
        sb.append(strM174693c);
        sb.append(Constants.PACKNAME_END);
        sb.append(strM155974d);
        sb.append(Constants.PACKNAME_END);
        sb.append(strM174691a);
        sb.append(Constants.PACKNAME_END);
        if (appendUA == null || (appChanel = appendUA.getAppChanel()) == null) {
            appChanel = 1;
        }
        sb.append(appChanel);
        sb.append(";netType/");
        sb.append(wi20.m206539c());
        sb.append(";appId/");
        String strM186315d = sjw.m186315d();
        if (strM186315d == null) {
            strM186315d = "";
        }
        sb.append(strM186315d);
        sb.append(";statusBar/");
        sb.append(nde0.m162697a(lv0.m155971a()));
        sb.append(")");
        if (appendUA != null && (customAppendUA = appendUA.getCustomAppendUA()) != null) {
            if (customAppendUA.length() <= 0) {
                customAppendUA = null;
            }
            if (customAppendUA != null) {
                sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                sb.append(customAppendUA);
            }
        }
        if (pageUrl != null && pageUrl.length() != 0 && appendUA != null && (function1M196466c = appendUA.m196466c()) != null) {
            String strInvoke = function1M196466c.invoke(pageUrl);
            if (strInvoke.length() > 0) {
                sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                sb.append("(" + strInvoke + ')');
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    private final String m18385b() {
        return (String) versionCode.getValue();
    }

    /* JADX INFO: renamed from: c */
    private final String m18386c() {
        return (String) versionName.getValue();
    }
}
