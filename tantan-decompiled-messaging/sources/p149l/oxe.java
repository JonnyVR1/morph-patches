package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p046p1.mobile.putong.data.User;
import java.util.List;
import java.util.concurrent.Callable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public class oxe implements a9m {

    /* JADX INFO: renamed from: a */
    public final bpz f146200a;

    /* JADX INFO: renamed from: b */
    public final wmz f146201b;

    /* JADX INFO: renamed from: c */
    public int f146202c = 0;

    public oxe(bpz bpzVar, wmz wmzVar) {
        this.f146200a = bpzVar;
        this.f146201b = wmzVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ j760 m166543f() throws Exception {
        return vwb.m200311Y(CoreModule.f17553k.f91940c.m206049G(this.f146201b.mo120828r3(), CoreModule.m29931H().userId()), CoreModule.f17553k.f91940c.m206049G(this.f146201b.mo120828r3(), this.f146201b.mo120828r3()));
    }

    @Override // p149l.a9m
    /* JADX INFO: renamed from: a */
    public boolean mo95447a(@Nullable Conversation conversation, @Nullable User user) {
        return false;
    }

    @Override // p149l.a9m
    @NonNull
    /* JADX INFO: renamed from: b */
    public C22306c<Boolean> mo95448b() {
        return C22306c.fromCallable(new Callable() { // from class: l.lxe
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f130414a.m166543f();
            }
        }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.mxe
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f136168a.m166544g((j760) obj);
            }
        }).map(new w9j() { // from class: l.nxe
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f141015a.m166545h((Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Integer m166544g(j760 j760Var) {
        List list = (List) j760Var.f116564a;
        List list2 = (List) j760Var.f116565b;
        if (vwb.m200296J(list) && vwb.m200296J(list2) && CoreModule.f17545c.f19639e0.m169527p9().isFemale()) {
            return 7;
        }
        if (vwb.m200296J(list) && !vwb.m200296J(list2)) {
            return 8;
        }
        if (ConversationCounterTypeSp.iceBreakLastMessageShowCountLimit.get(this.f146201b.m120783i3()) >= y19.m212186u().iceBreakLastMessageShowCountLimit) {
            return 0;
        }
        double dMax = Math.max(vwb.m200296J(list) ? 0.0d : ((Message) list.get(0)).createdTime, vwb.m200296J(list2) ? 0.0d : ((Message) list2.get(0)).createdTime);
        if (dMax == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return 0;
        }
        return ((double) mqi0.m155944o()) - dMax > ((double) (((long) y19.m212186u().iceBreakLastMessageTimeLimit) * 86400000)) ? 9 : 0;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Boolean m166545h(Integer num) {
        int iIntValue = num.intValue();
        this.f146202c = iIntValue;
        return Boolean.valueOf(iIntValue != 0);
    }

    @Override // p149l.a9m
    public boolean handle() {
        return this.f146200a.m103235g5(this.f146202c, false);
    }
}
