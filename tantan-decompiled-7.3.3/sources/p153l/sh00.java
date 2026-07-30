package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.Field;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
public class sh00 {

    /* JADX INFO: renamed from: a */
    public static int f168573a = 86400000;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m185831a(Throwable th) {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Boolean m185832b(String str) {
        List<Message> listQuery = CoreModule.f18272k.f115535c.query(Filter.AND(Message.CID.mo61359EQ(str), Message.MESSAGETYPE.m61360EQ(MessageType.local_moment_post_guide)), Message.CREATEDTIME.DESC, 1);
        if (jyb.m147479J(listQuery)) {
            if (m185842l()) {
                m185835e(str);
            }
        } else if (uqb0.f180376H.guessedCurrentServerTime() - ((long) listQuery.get(0).createdTime) < Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS) {
            CoreModule.f18264c.f20384f0.m33753Of(listQuery.get(0).f56859id);
            m185835e(str);
        } else if (m185842l()) {
            m185835e(str);
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Boolean m185833c(String str) {
        List<Message> listM33831Um = CoreModule.f18264c.f20384f0.m33831Um(str);
        Message message = (listM33831Um == null || listM33831Um.isEmpty()) ? null : listM33831Um.get(0);
        int iCount = CoreModule.f18272k.f115535c.count(Filter.AND(Message.CID.mo61359EQ(str), Message.MESSAGETYPE.m61360EQ("moment_like"), Message.OWNER.NEQ(uqb0.f180397c0.userId())), -1);
        if (NullChecker.m82486a(message) && TEnum.equals(message.messageType, "moment_like") && !message.isMe() && iCount >= m185836f()) {
            m185835e(str);
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m185834d(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: e */
    public static void m185835e(String str) {
        j000.m142891j(str).subscribe(psd0.m173597H(new y20() { // from class: l.ph00
            @Override // p153l.y20
            public final void call(Object obj) {
                sh00.m185834d((uxj0) obj);
            }
        }, new y20() { // from class: l.qh00
            @Override // p153l.y20
            public final void call(Object obj) {
                sh00.m185831a((Throwable) obj);
            }
        }));
        m185843m();
        CoreModule.f18264c.f20384f0.m34018kh(str);
    }

    /* JADX INFO: renamed from: f */
    public static int m185836f() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("dynamic_release_guide");
            if (TextUtils.isEmpty(strM80485F)) {
                return 1;
            }
            return new JSONObject(strM80485F).getInt("interactivenumber");
        } catch (Exception unused) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m185837g(Throwable th) {
        try {
            Field declaredField = th.getClass().getDeclaredField("code");
            if (!NullChecker.m82486a(declaredField)) {
                return 0;
            }
            declaredField.setAccessible(true);
            return ((Integer) declaredField.get(th)).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m185838h(final String str) {
        C22421c.fromCallable(new Callable() { // from class: l.rh00
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return sh00.m185832b(str);
            }
        }).compose(psd0.m173592C()).subscribe(psd0.m173591B());
    }

    /* JADX INFO: renamed from: i */
    public static void m185839i(final String str) {
        if (m185842l()) {
            C22421c.fromCallable(new Callable() { // from class: l.oh00
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return sh00.m185833c(str);
                }
            }).compose(psd0.m173592C()).subscribe(psd0.m173591B());
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m185840j() {
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        if (userM116593na == null) {
            return false;
        }
        return !userM116593na.isFemale();
    }

    /* JADX INFO: renamed from: k */
    public static boolean m185841k() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("dynamic_release_guide");
            if (TextUtils.isEmpty(strM80485F)) {
                return true;
            }
            return new JSONObject(strM80485F).optBoolean("momentCardCanClick", true);
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: l */
    public static boolean m185842l() {
        long jLongValue = CoreModule.f18264c.f20381e0.f89288n2.get().longValue();
        long jM174454o = pzi0.m174454o();
        if (jM174454o - jLongValue > f168573a) {
            CoreModule.f18264c.f20381e0.f89373z2.put(0);
            return true;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jLongValue);
        int i = calendar.get(5);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(jM174454o);
        int i2 = calendar2.get(5);
        if (m185840j() && i == i2) {
            return CoreModule.f18264c.f20381e0.f89373z2.get().intValue() < 5;
        }
        return i != i2;
    }

    /* JADX INFO: renamed from: m */
    public static void m185843m() {
        CoreModule.f18264c.f20381e0.f89288n2.put(Long.valueOf(pzi0.m174454o()));
        CoreModule.f18264c.f20381e0.f89373z2.put(Integer.valueOf(CoreModule.f18264c.f20381e0.f89373z2.get().intValue() + 1));
    }
}
