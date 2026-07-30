package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.Survey;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.Data;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.e30;
import l.hfw;
import l.j760;
import l.mkd0;
import l.vwb;
import l.w9j;
import l.xaj0;
import l.zpd0;
import rx.c;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class rwu {

    /* JADX INFO: renamed from: a */
    public static c4g0 f20013a;

    /* JADX INFO: renamed from: b */
    public static final zpd0 f20014b = new zpd0("VIP_WELCOME_TIME_DIFF", 0L);

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m21855a(j760 j760Var) {
        if (((Boolean) j760Var.b).booleanValue()) {
            CoreModule.c.f0.Tg((User) j760Var.a);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ j760 m21856b(xaj0 xaj0Var) {
        j760 j760VarY = vwb.Y((User) xaj0Var.a, ((Conversation) xaj0Var.b).property.liveVIP.lastOrderMsgId);
        if (!NullChecker.a(((Conversation) xaj0Var.b).property) || !NullChecker.a(((Conversation) xaj0Var.b).property.liveVIP) || TextUtils.isEmpty(((Conversation) xaj0Var.b).property.liveVIP.lastOrderMsgId)) {
            return vwb.Y((User) xaj0Var.a, "");
        }
        Object obj = xaj0Var.c;
        if (obj == null || vwb.J(((q860) obj).f19068a) || !TEnum.equals(((Message) ((q860) xaj0Var.c).f19068a.get(0)).messageType, "new_survey") || "submitted".equals(Survey.parse(((Message) ((q860) xaj0Var.c).f19068a.get(0)).msgData).status)) {
            return j760VarY;
        }
        zpd0 zpd0Var = f20014b;
        if (((Long) zpd0Var.get()).longValue() == 0) {
            zpd0Var.put(Long.valueOf(System.currentTimeMillis()));
            return null;
        }
        if ((System.currentTimeMillis() - ((Long) zpd0Var.get()).longValue()) / 3600000 <= 12) {
            return null;
        }
        zpd0Var.put(Long.valueOf(System.currentTimeMillis()));
        return j760VarY;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m21860f(Throwable th) {
        if (th != null) {
            th.printStackTrace();
            hfw.a("lsy", "tryInsertGreetMsg has error :" + th.toString());
        }
    }

    /* JADX INFO: renamed from: h */
    public static String m21862h() {
        return "-11000";
    }

    /* JADX INFO: renamed from: i */
    public static void m21863i(final String str) {
        mkd0.z(f20013a);
        f20013a = CoreModule.c.f0.bp(m21862h()).timeout(500L, TimeUnit.MILLISECONDS).observeOn(Schedulers.io()).flatMap(new w9j() { // from class: l.kwu
            public final Object call(Object obj) {
                return c.zip(c.just((User) vwb.n(((Data) obj).getModuleData(CommonData.class).users, new w9j() { // from class: l.qwu
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(!CoreModule.H().userId().equals(((DbObject) ((User) obj2)).id));
                    }
                }).get(0)), CoreModule.c.f0.Ne(rwu.m21862h()), CoreModule.c.f0.Tn(str), new wj20());
            }
        }).first().observeOn(Schedulers.io()).map(new w9j() { // from class: l.lwu
            public final Object call(Object obj) {
                return rwu.m21856b((xaj0) obj);
            }
        }).filter(new w9j() { // from class: l.mwu
            public final Object call(Object obj) {
                return Boolean.valueOf(((j760) obj) != null);
            }
        }).flatMap(new w9j() { // from class: l.nwu
            public final Object call(Object obj) {
                j760 j760Var = (j760) obj;
                return c.just(vwb.Y((User) j760Var.a, Boolean.valueOf(CoreModule.c.f0.Eg((String) j760Var.b) == 0)));
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.owu
            public final void call(Object obj) {
                rwu.m21855a((j760) obj);
            }
        }, new e30() { // from class: l.pwu
            public final void call(Object obj) {
                rwu.m21860f((Throwable) obj);
            }
        }));
    }
}
