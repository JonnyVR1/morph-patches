package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p051p1.mobile.putong.data.User;
import java.util.List;
import java.util.concurrent.Callable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public class sye implements qbm {

    /* JADX INFO: renamed from: a */
    public final yxz f171231a;

    /* JADX INFO: renamed from: b */
    public final tvz f171232b;

    /* JADX INFO: renamed from: c */
    public int f171233c = 0;

    public sye(yxz yxzVar, tvz tvzVar) {
        this.f171231a = yxzVar;
        this.f171232b = tvzVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ pf60 m188544f() throws Exception {
        return jyb.m147494Y(CoreModule.f18272k.f115535c.m189445G(this.f171232b.mo111034r3(), CoreModule.m30929H().userId()), CoreModule.f18272k.f115535c.m189445G(this.f171232b.mo111034r3(), this.f171232b.mo111034r3()));
    }

    @Override // p153l.qbm
    /* JADX INFO: renamed from: a */
    public boolean mo119523a(@Nullable Conversation conversation, @Nullable User user) {
        return false;
    }

    @Override // p153l.qbm
    @NonNull
    /* JADX INFO: renamed from: b */
    public C22421c<Boolean> mo119524b() {
        return C22421c.fromCallable(new Callable() { // from class: l.pye
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f154630a.m188544f();
            }
        }).compose(psd0.m173592C()).map(new qcj() { // from class: l.qye
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f160145a.m188545g((pf60) obj);
            }
        }).map(new qcj() { // from class: l.rye
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f165427a.m188546h((Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Integer m188545g(pf60 pf60Var) {
        List list = (List) pf60Var.f152156a;
        List list2 = (List) pf60Var.f152157b;
        if (jyb.m147479J(list) && jyb.m147479J(list2) && CoreModule.f18264c.f20381e0.m116600p9().isFemale()) {
            return 7;
        }
        if (jyb.m147479J(list) && !jyb.m147479J(list2)) {
            return 8;
        }
        if (ConversationCounterTypeSp.iceBreakLastMessageShowCountLimit.get(this.f171232b.m110989i3()) >= h39.m133457u().iceBreakLastMessageShowCountLimit) {
            return 0;
        }
        double dMax = Math.max(jyb.m147479J(list) ? 0.0d : ((Message) list.get(0)).createdTime, jyb.m147479J(list2) ? 0.0d : ((Message) list2.get(0)).createdTime);
        if (dMax == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return 0;
        }
        return ((double) pzi0.m174454o()) - dMax > ((double) (((long) h39.m133457u().iceBreakLastMessageTimeLimit) * 86400000)) ? 9 : 0;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Boolean m188546h(Integer num) {
        int iIntValue = num.intValue();
        this.f171233c = iIntValue;
        return Boolean.valueOf(iIntValue != 0);
    }

    @Override // p153l.qbm
    public boolean handle() {
        return this.f171231a.m217876g5(this.f171233c, false);
    }
}
