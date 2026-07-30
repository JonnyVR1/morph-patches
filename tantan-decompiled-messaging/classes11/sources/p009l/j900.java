package p009l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.data.orm.OrderedColumn;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.Field;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.Callable;
import l.e30;
import l.mkd0;
import l.mrz;
import l.qib0;
import l.roj0;
import l.vwb;
import org.json.JSONObject;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class j900 {

    /* JADX INFO: renamed from: a */
    public static int f14989a = 86400000;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m16872a(Throwable th) {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Boolean m16873b(String str) {
        List listQuery = CoreModule.k.c.query(Filter.AND(new Filter[]{Message.CID.EQ(str), Message.MESSAGETYPE.EQ("local_moment_post_guide")}), ((OrderedColumn) Message.CREATEDTIME).DESC, 1);
        if (vwb.J(listQuery)) {
            if (m16883l()) {
                m16876e(str);
            }
        } else if (qib0.H.guessedCurrentServerTime() - ((long) ((Message) listQuery.get(0)).createdTime) < 5000) {
            CoreModule.c.f0.Of(((DbObject) ((Message) listQuery.get(0))).id);
            m16876e(str);
        } else if (m16883l()) {
            m16876e(str);
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Boolean m16874c(String str) {
        List listUm = CoreModule.c.f0.Um(str);
        Message message = (listUm == null || listUm.isEmpty()) ? null : (Message) listUm.get(0);
        int iCount = CoreModule.k.c.count(Filter.AND(new Filter[]{Message.CID.EQ(str), Message.MESSAGETYPE.EQ("moment_like"), Message.OWNER.NEQ(qib0.c0.userId())}), -1);
        if (NullChecker.a(message) && TEnum.equals(message.messageType, "moment_like") && !message.isMe() && iCount >= m16877f()) {
            m16876e(str);
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m16875d(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: e */
    public static void m16876e(String str) {
        mrz.j(str).subscribe(mkd0.H(new e30() { // from class: l.g900
            public final void call(Object obj) {
                j900.m16875d((roj0) obj);
            }
        }, new e30() { // from class: l.h900
            public final void call(Object obj) {
                j900.m16872a((Throwable) obj);
            }
        }));
        m16884m();
        CoreModule.c.f0.kh(str);
    }

    /* JADX INFO: renamed from: f */
    public static int m16877f() {
        try {
            String strM9623F = RemoteConfig.m9619x().m9623F("dynamic_release_guide");
            if (TextUtils.isEmpty(strM9623F)) {
                return 1;
            }
            return new JSONObject(strM9623F).getInt("interactivenumber");
        } catch (Exception unused) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m16878g(Throwable th) {
        try {
            Field declaredField = th.getClass().getDeclaredField(WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_CODE);
            if (!NullChecker.a(declaredField)) {
                return 0;
            }
            declaredField.setAccessible(true);
            return ((Integer) declaredField.get(th)).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m16879h(final String str) {
        c.fromCallable(new Callable() { // from class: l.i900
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return j900.m16873b(str);
            }
        }).compose(mkd0.C()).subscribe(mkd0.B());
    }

    /* JADX INFO: renamed from: i */
    public static void m16880i(final String str) {
        if (m16883l()) {
            c.fromCallable(new Callable() { // from class: l.f900
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return j900.m16874c(str);
                }
            }).compose(mkd0.C()).subscribe(mkd0.B());
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m16881j() {
        User userNa = CoreModule.c.e0.na();
        if (userNa == null) {
            return false;
        }
        return !userNa.isFemale();
    }

    /* JADX INFO: renamed from: k */
    public static boolean m16882k() {
        try {
            String strM9623F = RemoteConfig.m9619x().m9623F("dynamic_release_guide");
            if (TextUtils.isEmpty(strM9623F)) {
                return true;
            }
            return new JSONObject(strM9623F).optBoolean("momentCardCanClick", true);
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: l */
    public static boolean m16883l() {
        long jLongValue = ((Long) CoreModule.c.e0.n2.get()).longValue();
        long jM18550o = mqi0.m18550o();
        if (jM18550o - jLongValue > f14989a) {
            CoreModule.c.e0.z2.put(0);
            return true;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jLongValue);
        int i = calendar.get(5);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(jM18550o);
        int i2 = calendar2.get(5);
        if (m16881j() && i == i2) {
            return ((Integer) CoreModule.c.e0.z2.get()).intValue() < 5;
        }
        return i != i2;
    }

    /* JADX INFO: renamed from: m */
    public static void m16884m() {
        CoreModule.c.e0.n2.put(Long.valueOf(mqi0.m18550o()));
        CoreModule.c.e0.z2.put(Integer.valueOf(((Integer) CoreModule.c.e0.z2.get()).intValue() + 1));
    }
}
