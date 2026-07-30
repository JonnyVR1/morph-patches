package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.Survey;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Data;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes11.dex */
public class syu {

    /* JADX INFO: renamed from: a */
    public static kcg0 f171294a;

    /* JADX INFO: renamed from: b */
    public static final byd0 f171295b = new byd0("VIP_WELCOME_TIME_DIFF", 0L);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m188580a(pf60 pf60Var) {
        if (((Boolean) pf60Var.f152157b).booleanValue()) {
            CoreModule.f18264c.f20384f0.m33813Tg((User) pf60Var.f152156a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ pf60 m188581b(bkj0 bkj0Var) {
        pf60 pf60VarM147494Y = jyb.m147494Y((User) bkj0Var.f77081a, ((Conversation) bkj0Var.f77082b).property.liveVIP.lastOrderMsgId);
        if (!NullChecker.m82486a(((Conversation) bkj0Var.f77082b).property) || !NullChecker.m82486a(((Conversation) bkj0Var.f77082b).property.liveVIP) || TextUtils.isEmpty(((Conversation) bkj0Var.f77082b).property.liveVIP.lastOrderMsgId)) {
            return jyb.m147494Y((User) bkj0Var.f77081a, "");
        }
        C c = bkj0Var.f77083c;
        if (c == 0 || jyb.m147479J(((vg60) c).f184001a) || !TEnum.equals(((Message) ((vg60) bkj0Var.f77083c).f184001a.get(0)).messageType, MessageType.new_survey) || "submitted".equals(Survey.parse(((Message) ((vg60) bkj0Var.f77083c).f184001a.get(0)).msgData).status)) {
            return pf60VarM147494Y;
        }
        byd0 byd0Var = f171295b;
        if (byd0Var.get().longValue() == 0) {
            byd0Var.put(Long.valueOf(System.currentTimeMillis()));
            return null;
        }
        if ((System.currentTimeMillis() - byd0Var.get().longValue()) / 3600000 <= 12) {
            return null;
        }
        byd0Var.put(Long.valueOf(System.currentTimeMillis()));
        return pf60VarM147494Y;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m188585f(Throwable th) {
        if (th != null) {
            th.printStackTrace();
            fhw.m125605a("lsy", "tryInsertGreetMsg has error :" + th.toString());
        }
    }

    /* JADX INFO: renamed from: h */
    public static String m188587h() {
        return User.ID_LIVE_VIP_SERVICE;
    }

    /* JADX INFO: renamed from: i */
    public static void m188588i(final String str) {
        psd0.m173633z(f171294a);
        f171294a = CoreModule.f18264c.f20384f0.m33917bp(m188587h()).timeout(500L, TimeUnit.MILLISECONDS).observeOn(Schedulers.m222739io()).flatMap(new qcj() { // from class: l.lyu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C22421c.zip(C22421c.just((User) jyb.m147522n(((CommonData) ((Data) obj).getModuleData(CommonData.class)).users, new qcj() { // from class: l.ryu
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(!CoreModule.m30929H().userId().equals(((User) obj2).f56859id));
                    }
                }).get(0)), CoreModule.f18264c.f20384f0.m33740Ne(syu.m188587h()), CoreModule.f18264c.f20384f0.m33820Tn(str), new gs20());
            }
        }).first().observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.myu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return syu.m188581b((bkj0) obj);
            }
        }).filter(new qcj() { // from class: l.nyu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((pf60) obj) != null);
            }
        }).flatMap(new qcj() { // from class: l.oyu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                pf60 pf60Var = (pf60) obj;
                return C22421c.just(jyb.m147494Y((User) pf60Var.f152156a, Boolean.valueOf(CoreModule.f18264c.f20384f0.m33632Eg((String) pf60Var.f152157b) == 0)));
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.pyu
            @Override // p153l.y20
            public final void call(Object obj) {
                syu.m188580a((pf60) obj);
            }
        }, new y20() { // from class: l.qyu
            @Override // p153l.y20
            public final void call(Object obj) {
                syu.m188585f((Throwable) obj);
            }
        }));
    }
}
