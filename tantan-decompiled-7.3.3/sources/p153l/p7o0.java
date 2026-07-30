package p153l;

import com.p051p1.mobile.putong.live.base.bean.LivingUsers;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveMember;
import com.p051p1.mobile.putong.live.base.data.BLiveStarlightHierarchy;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class p7o0 {

    /* JADX INFO: renamed from: a */
    public LivingUsers<BLiveMember> f150952a;

    /* JADX INFO: renamed from: b */
    public HashMap<String, String> f150953b;

    public p7o0(BLiveData bLiveData, final boolean z) {
        this.f150952a = new LivingUsers<>();
        this.f150953b = new HashMap<>();
        if (bLiveData == null || jyb.m147479J(bLiveData.members)) {
            return;
        }
        final HashMap<String, m6o0> mapM205187l = w6o0.m205187l(bLiveData.users, bLiveData.masks, z);
        final HashMap mapM147502d = jyb.m147502d(bLiveData.voiceCalls, new qcj() { // from class: l.k7o0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveVoiceCall) obj).user;
            }
        }, new qcj() { // from class: l.l7o0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return p7o0.m171162c((BLiveVoiceCall) obj);
            }
        });
        this.f150953b = jyb.m147502d(bLiveData.starlightHierarchies, new qcj() { // from class: l.m7o0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveStarlightHierarchy) obj).userId;
            }
        }, new qcj() { // from class: l.n7o0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveStarlightHierarchy) obj).imageUrl;
            }
        });
        this.f150952a = LivingUsers.convert(bLiveData.members, new qcj() { // from class: l.o7o0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return p7o0.m171161b(mapM205187l, mapM147502d, z, (nsv) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ nsv m171161b(HashMap map, HashMap map2, boolean z, nsv nsvVar) {
        m6o0 m6o0Var = (m6o0) map.get(((BLiveMember) nsvVar.f143542a).reference);
        if (m6o0Var == null) {
            return null;
        }
        nsvVar.m164637a(m6o0Var.f135019a);
        if (zrv.m221193k().m203746u7() && iek0.m139635b(nsvVar) && iek0.m139634a(nsvVar).hierarchy != null) {
            ((BLiveMember) nsvVar.f143542a).liveUserLevel = ((hiv) zrv.m221194l(htd0.f111521c)).m135170v(iek0.m139634a(nsvVar).hierarchy.grade);
        }
        BLiveVoiceCall bLiveVoiceCall = (BLiveVoiceCall) map2.get(((BLiveMember) nsvVar.f143542a).reference);
        if (bLiveVoiceCall != null) {
            nsvVar.m164638b(bLiveVoiceCall);
        }
        return nsvVar.m164639c(((BLiveMember) nsvVar.f143542a).reference, m6o0Var.f135020b, z);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ BLiveVoiceCall m171162c(BLiveVoiceCall bLiveVoiceCall) {
        return bLiveVoiceCall;
    }
}
