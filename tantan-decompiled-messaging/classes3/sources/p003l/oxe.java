package p003l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p1.mobile.putong.data.User;
import java.util.List;
import java.util.concurrent.Callable;
import l.j760;
import l.mkd0;
import l.mqi0;
import l.vwb;
import l.wmz;
import l.y19;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class oxe implements a9m {

    /* JADX INFO: renamed from: a */
    public final bpz f6279a;

    /* JADX INFO: renamed from: b */
    public final wmz f6280b;

    /* JADX INFO: renamed from: c */
    public int f6281c = 0;

    public oxe(bpz bpzVar, wmz wmzVar) {
        this.f6279a = bpzVar;
        this.f6280b = wmzVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ j760 m6780f() throws Exception {
        return vwb.Y(CoreModule.k.c.G(this.f6280b.r3(), CoreModule.H().userId()), CoreModule.k.c.G(this.f6280b.r3(), this.f6280b.r3()));
    }

    @Override // p003l.a9m
    /* JADX INFO: renamed from: a */
    public boolean mo2765a(@Nullable Conversation conversation, @Nullable User user) {
        return false;
    }

    @Override // p003l.a9m
    @NonNull
    /* JADX INFO: renamed from: b */
    public C1099c<Boolean> mo2766b() {
        return C1099c.fromCallable(new Callable() { // from class: l.lxe
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f5476a.m6780f();
            }
        }).compose(mkd0.C()).map(new w9j() { // from class: l.mxe
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f5792a.m6781g((j760) obj);
            }
        }).map(new w9j() { // from class: l.nxe
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f5995a.m6782h((Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Integer m6781g(j760 j760Var) {
        List list = (List) j760Var.a;
        List list2 = (List) j760Var.b;
        if (vwb.J(list) && vwb.J(list2) && CoreModule.c.e0.p9().isFemale()) {
            return 7;
        }
        if (vwb.J(list) && !vwb.J(list2)) {
            return 8;
        }
        if (ConversationCounterTypeSp.iceBreakLastMessageShowCountLimit.get(this.f6280b.m4250i3()) >= y19.u().iceBreakLastMessageShowCountLimit) {
            return 0;
        }
        double dMax = Math.max(vwb.J(list) ? 0.0d : ((Message) list.get(0)).createdTime, vwb.J(list2) ? 0.0d : ((Message) list2.get(0)).createdTime);
        if (dMax == 0.0d) {
            return 0;
        }
        return ((double) mqi0.o()) - dMax > ((double) (((long) y19.u().iceBreakLastMessageTimeLimit) * 86400000)) ? 9 : 0;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Boolean m6782h(Integer num) {
        int iIntValue = num.intValue();
        this.f6281c = iIntValue;
        return Boolean.valueOf(iIntValue != 0);
    }

    @Override // p003l.a9m
    public boolean handle() {
        return this.f6279a.m3115g5(this.f6281c, false);
    }
}
