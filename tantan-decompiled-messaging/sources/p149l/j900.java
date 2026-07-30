package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.Field;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class j900 {

    /* JADX INFO: renamed from: a */
    public static int f116836a = 86400000;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m140487a(Throwable th) {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Boolean m140488b(String str) {
        List<Message> listQuery = CoreModule.f17553k.f91940c.query(Filter.AND(Message.CID.mo60175EQ(str), Message.MESSAGETYPE.m60176EQ(MessageType.local_moment_post_guide)), Message.CREATEDTIME.DESC, 1);
        if (vwb.m200296J(listQuery)) {
            if (m140498l()) {
                m140491e(str);
            }
        } else if (qib0.f154693H.guessedCurrentServerTime() - ((long) listQuery.get(0).createdTime) < Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS) {
            CoreModule.f17545c.f19642f0.m32750Of(listQuery.get(0).f56011id);
            m140491e(str);
        } else if (m140498l()) {
            m140491e(str);
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Boolean m140489c(String str) {
        List<Message> listM32828Um = CoreModule.f17545c.f19642f0.m32828Um(str);
        Message message = (listM32828Um == null || listM32828Um.isEmpty()) ? null : listM32828Um.get(0);
        int iCount = CoreModule.f17553k.f91940c.count(Filter.AND(Message.CID.mo60175EQ(str), Message.MESSAGETYPE.m60176EQ("moment_like"), Message.OWNER.NEQ(qib0.f154714c0.userId())), -1);
        if (NullChecker.m81303a(message) && TEnum.equals(message.messageType, "moment_like") && !message.isMe() && iCount >= m140492f()) {
            m140491e(str);
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m140490d(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: e */
    public static void m140491e(String str) {
        mrz.m156101j(str).subscribe(mkd0.m154956H(new e30() { // from class: l.g900
            @Override // p149l.e30
            public final void call(Object obj) {
                j900.m140490d((roj0) obj);
            }
        }, new e30() { // from class: l.h900
            @Override // p149l.e30
            public final void call(Object obj) {
                j900.m140487a((Throwable) obj);
            }
        }));
        m140499m();
        CoreModule.f17545c.f19642f0.m33015kh(str);
    }

    /* JADX INFO: renamed from: f */
    public static int m140492f() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("dynamic_release_guide");
            if (TextUtils.isEmpty(strM79302F)) {
                return 1;
            }
            return new JSONObject(strM79302F).getInt("interactivenumber");
        } catch (Exception unused) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m140493g(Throwable th) {
        try {
            Field declaredField = th.getClass().getDeclaredField("code");
            if (!NullChecker.m81303a(declaredField)) {
                return 0;
            }
            declaredField.setAccessible(true);
            return ((Integer) declaredField.get(th)).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m140494h(final String str) {
        C22306c.fromCallable(new Callable() { // from class: l.i900
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return j900.m140488b(str);
            }
        }).compose(mkd0.m154951C()).subscribe(mkd0.m154950B());
    }

    /* JADX INFO: renamed from: i */
    public static void m140495i(final String str) {
        if (m140498l()) {
            C22306c.fromCallable(new Callable() { // from class: l.f900
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return j900.m140489c(str);
                }
            }).compose(mkd0.m154951C()).subscribe(mkd0.m154950B());
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m140496j() {
        User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        if (userM169520na == null) {
            return false;
        }
        return !userM169520na.isFemale();
    }

    /* JADX INFO: renamed from: k */
    public static boolean m140497k() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("dynamic_release_guide");
            if (TextUtils.isEmpty(strM79302F)) {
                return true;
            }
            return new JSONObject(strM79302F).optBoolean("momentCardCanClick", true);
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: l */
    public static boolean m140498l() {
        long jLongValue = CoreModule.f17545c.f19639e0.f149431n2.get().longValue();
        long jM155944o = mqi0.m155944o();
        if (jM155944o - jLongValue > f116836a) {
            CoreModule.f17545c.f19639e0.f149516z2.put(0);
            return true;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jLongValue);
        int i = calendar.get(5);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(jM155944o);
        int i2 = calendar2.get(5);
        if (m140496j() && i == i2) {
            return CoreModule.f17545c.f19639e0.f149516z2.get().intValue() < 5;
        }
        return i != i2;
    }

    /* JADX INFO: renamed from: m */
    public static void m140499m() {
        CoreModule.f17545c.f19639e0.f149431n2.put(Long.valueOf(mqi0.m155944o()));
        CoreModule.f17545c.f19639e0.f149516z2.put(Integer.valueOf(CoreModule.f17545c.f19639e0.f149516z2.get().intValue() + 1));
    }
}
