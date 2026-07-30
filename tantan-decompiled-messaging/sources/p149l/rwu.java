package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.Survey;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Data;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes11.dex */
public class rwu {

    /* JADX INFO: renamed from: a */
    public static c4g0 f161378a;

    /* JADX INFO: renamed from: b */
    public static final zpd0 f161379b = new zpd0("VIP_WELCOME_TIME_DIFF", 0L);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m181452a(j760 j760Var) {
        if (((Boolean) j760Var.f116565b).booleanValue()) {
            CoreModule.f17545c.f19642f0.m32810Tg((User) j760Var.f116564a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ j760 m181453b(xaj0 xaj0Var) {
        j760 j760VarM200311Y = vwb.m200311Y((User) xaj0Var.f191751a, ((Conversation) xaj0Var.f191752b).property.liveVIP.lastOrderMsgId);
        if (!NullChecker.m81303a(((Conversation) xaj0Var.f191752b).property) || !NullChecker.m81303a(((Conversation) xaj0Var.f191752b).property.liveVIP) || TextUtils.isEmpty(((Conversation) xaj0Var.f191752b).property.liveVIP.lastOrderMsgId)) {
            return vwb.m200311Y((User) xaj0Var.f191751a, "");
        }
        C c = xaj0Var.f191753c;
        if (c == 0 || vwb.m200296J(((q860) c).f153135a) || !TEnum.equals(((Message) ((q860) xaj0Var.f191753c).f153135a.get(0)).messageType, MessageType.new_survey) || "submitted".equals(Survey.parse(((Message) ((q860) xaj0Var.f191753c).f153135a.get(0)).msgData).status)) {
            return j760VarM200311Y;
        }
        zpd0 zpd0Var = f161379b;
        if (zpd0Var.get().longValue() == 0) {
            zpd0Var.put(Long.valueOf(System.currentTimeMillis()));
            return null;
        }
        if ((System.currentTimeMillis() - zpd0Var.get().longValue()) / 3600000 <= 12) {
            return null;
        }
        zpd0Var.put(Long.valueOf(System.currentTimeMillis()));
        return j760VarM200311Y;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m181457f(Throwable th) {
        if (th != null) {
            th.printStackTrace();
            hfw.m130790a("lsy", "tryInsertGreetMsg has error :" + th.toString());
        }
    }

    /* JADX INFO: renamed from: h */
    public static String m181459h() {
        return User.ID_LIVE_VIP_SERVICE;
    }

    /* JADX INFO: renamed from: i */
    public static void m181460i(final String str) {
        mkd0.m154992z(f161378a);
        f161378a = CoreModule.f17545c.f19642f0.m32914bp(m181459h()).timeout(500L, TimeUnit.MILLISECONDS).observeOn(Schedulers.m221493io()).flatMap(new w9j() { // from class: l.kwu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C22306c.zip(C22306c.just((User) vwb.m200339n(((CommonData) ((Data) obj).getModuleData(CommonData.class)).users, new w9j() { // from class: l.qwu
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(!CoreModule.m29931H().userId().equals(((User) obj2).f56011id));
                    }
                }).get(0)), CoreModule.f17545c.f19642f0.m32737Ne(rwu.m181459h()), CoreModule.f17545c.f19642f0.m32817Tn(str), new wj20());
            }
        }).first().observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.lwu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return rwu.m181453b((xaj0) obj);
            }
        }).filter(new w9j() { // from class: l.mwu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((j760) obj) != null);
            }
        }).flatMap(new w9j() { // from class: l.nwu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                j760 j760Var = (j760) obj;
                return C22306c.just(vwb.m200311Y((User) j760Var.f116564a, Boolean.valueOf(CoreModule.f17545c.f19642f0.m32629Eg((String) j760Var.f116565b) == 0)));
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.owu
            @Override // p149l.e30
            public final void call(Object obj) {
                rwu.m181452a((j760) obj);
            }
        }, new e30() { // from class: l.pwu
            @Override // p149l.e30
            public final void call(Object obj) {
                rwu.m181457f((Throwable) obj);
            }
        }));
    }
}
