package p153l;

import android.util.Log;
import com.clevertap.android.sdk.Constants;
import com.hellogroup.p036mk.core.dispatcher.dispatch.MKTaskScheduler;
import com.hellogroup.p036mk.core.dispatcher.task.MKTaskByCheckUpdate;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.could.huiyansdk.overseas.HuiYanResultSender;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0015\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0014\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001b\u001a\u00020\f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u001a\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R0\u0010'\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020$0#j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020$`%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010&R\u001c\u0010)\u001a\u00020(8B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010-\u001a\u00020\n8B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0018R\"\u00100\u001a\u00020\n8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010.\u001a\u0004\b1\u0010\u0018\"\u0004\b2\u00103¨\u00064"}, m88121d2 = {"Ll/dlw;", "", "<init>", "()V", "Ll/a7m;", "k", "()Ll/a7m;", "", "url", "bid", "", "needUrlCheckGrey", "", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "Ll/cd00;", "callback", "f", "(Ll/cd00;)V", "originBid", "isPageFinished", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", BLiveStormDanmakuGiftResourceType.f45292l, "()Z", "sid", "forceUpload", "n", "(Ljava/lang/String;Z)V", "loadUrl", "p", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ll/a7m;", "taskExecutor", "Ljava/util/HashMap;", "Ll/mc60;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "checkUpdateRecords", "", "mkSecondPkgFrequency", "I", "h", "()I", "mkSecondPkgUpdateEnable", "Z", RXScreenCaptureService.KEY_INDEX, "requestDispatchEnable", "j", "setRequestDispatchEnable", "(Z)V", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class dlw {
    public static final dlw INSTANCE = new dlw();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static volatile a7m taskExecutor = new rhi();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final HashMap<String, mc60> checkUpdateRecords = new HashMap<>();

    private dlw() {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m116893c(dlw dlwVar, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 4) != 0) {
            bool = Boolean.FALSE;
        }
        dlwVar.m116900b(str, str2, bool);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m116894g(dlw dlwVar, cd00 cd00Var, int i, Object obj) {
        if ((i & 1) != 0) {
            cd00Var = null;
        }
        dlwVar.m116903f(cd00Var);
    }

    /* JADX INFO: renamed from: h */
    private final int m116895h() {
        a7m a7mVarM116897k = m116897k();
        if (a7mVarM116897k != null) {
            return a7mVarM116897k.mo96374b();
        }
        return 0;
    }

    /* JADX INFO: renamed from: i */
    private final boolean m116896i() {
        a7m a7mVarM116897k = m116897k();
        if (a7mVarM116897k != null) {
            return a7mVarM116897k.mo96378f();
        }
        return false;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: k */
    public static final a7m m116897k() {
        return taskExecutor;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m116898o(dlw dlwVar, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        dlwVar.m116907n(str, z);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: a */
    public final void m116899a(@Nullable String str, @Nullable String str2) {
        m116893c(this, str, str2, null, 4, null);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: b */
    public final void m116900b(@Nullable String url, @Nullable String bid, @Nullable Boolean needUrlCheckGrey) {
        if (!m116905l()) {
            a7m a7mVarM116897k = m116897k();
            if (a7mVarM116897k != null) {
                a7mVarM116897k.mo96379g(url, bid);
                return;
            }
            return;
        }
        fjw fjwVar = new fjw();
        fjwVar.m125929m(url);
        fjwVar.m125925i(bid);
        fjwVar.m125927k(needUrlCheckGrey != null ? needUrlCheckGrey.booleanValue() : false);
        fjwVar.m125926j(2);
        fjwVar.m125928l(500);
        MKTaskScheduler.INSTANCE.m18396a(MKTaskByCheckUpdate.INSTANCE.m18417a(fjwVar));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    @JvmOverloads
    /* JADX INFO: renamed from: d */
    public final void m116901d(@Nullable String url, @Nullable String bid, @Nullable String originBid, boolean isPageFinished) {
        if (bid == null || originBid == null) {
            return;
        }
        try {
            if (StringsKt.m94329e0(originBid) || Intrinsics.m88377d(originBid, bid) || !m116896i()) {
                return;
            }
            HashMap<String, mc60> map = checkUpdateRecords;
            mc60 mc60Var = map.get(bid);
            boolean z = true;
            boolean z2 = mc60Var == null;
            if (z2) {
                z = z2;
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                a7m a7mVarM116897k = m116897k();
                a7m.InterfaceC15666a interfaceC15666aMo96376d = a7mVarM116897k != null ? a7mVarM116897k.mo96376d(bid, url) : null;
                long jMo96380a = (interfaceC15666aMo96376d != null ? (int) interfaceC15666aMo96376d.mo96380a() : m116895h()) * HuiYanResultSender.TIMEOUT_MS;
                if (mc60Var == null || jCurrentTimeMillis - mc60Var.getLastCheckTime() <= jMo96380a) {
                    z = z2;
                }
            }
            if (z) {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (mc60Var == null) {
                    mc60 mc60Var2 = new mc60();
                    mc60Var2.m157917b(jCurrentTimeMillis2);
                    map.put(bid, mc60Var2);
                } else {
                    mc60Var.m157917b(jCurrentTimeMillis2);
                }
                m116900b(url, bid, Boolean.TRUE);
                if (isPageFinished) {
                    m116898o(this, null, false, 3, null);
                }
            }
        } catch (Throwable th) {
            Log.e("MKTaskExecutor", "", th);
        }
    }

    @JvmOverloads
    /* JADX INFO: renamed from: e */
    public final void m116902e() {
        m116894g(this, null, 1, null);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: f */
    public final void m116903f(@Nullable cd00 callback) {
        if (!m116905l()) {
            a7m a7mVarM116897k = m116897k();
            if (a7mVarM116897k != null) {
                a7mVarM116897k.mo96377e(callback);
                return;
            }
            return;
        }
        fjw fjwVar = new fjw();
        fjwVar.m125917a(callback);
        fjwVar.m125926j(101);
        fjwVar.m125928l(1000);
        MKTaskScheduler.INSTANCE.m18396a(clw.INSTANCE.m110705a(fjwVar));
    }

    /* JADX INFO: renamed from: j */
    public final boolean m116904j() {
        a7m a7mVarM116897k = m116897k();
        if (a7mVarM116897k != null) {
            return a7mVarM116897k.mo96373a();
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m116905l() {
        return m116904j();
    }

    @JvmOverloads
    /* JADX INFO: renamed from: m */
    public final void m116906m(@Nullable String str) {
        m116898o(this, str, false, 2, null);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: n */
    public final void m116907n(@Nullable String sid, boolean forceUpload) {
        if (m116905l()) {
            MKTaskScheduler.INSTANCE.m18399l(forceUpload, sid);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m116908p(@Nullable String sid, @Nullable String loadUrl) {
        if (m116905l()) {
            MKTaskScheduler.INSTANCE.m18402o(sid, loadUrl);
        }
    }
}
