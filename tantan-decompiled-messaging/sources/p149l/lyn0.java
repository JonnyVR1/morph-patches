package p149l;

import com.p046p1.mobile.putong.live.base.bean.LivingUsers;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveMember;
import com.p046p1.mobile.putong.live.base.data.BLiveStarlightHierarchy;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class lyn0 {

    /* JADX INFO: renamed from: a */
    public LivingUsers<BLiveMember> f130587a;

    /* JADX INFO: renamed from: b */
    public HashMap<String, String> f130588b;

    public lyn0(BLiveData bLiveData, final boolean z) {
        this.f130587a = new LivingUsers<>();
        this.f130588b = new HashMap<>();
        if (bLiveData == null || vwb.m200296J(bLiveData.members)) {
            return;
        }
        final HashMap<String, ixn0> mapM186525l = sxn0.m186525l(bLiveData.users, bLiveData.masks, z);
        final HashMap mapM200319d = vwb.m200319d(bLiveData.voiceCalls, new w9j() { // from class: l.gyn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveVoiceCall) obj).user;
            }
        }, new w9j() { // from class: l.hyn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return lyn0.m152296c((BLiveVoiceCall) obj);
            }
        });
        this.f130588b = vwb.m200319d(bLiveData.starlightHierarchies, new w9j() { // from class: l.iyn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveStarlightHierarchy) obj).userId;
            }
        }, new w9j() { // from class: l.jyn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveStarlightHierarchy) obj).imageUrl;
            }
        });
        this.f130587a = LivingUsers.convert(bLiveData.members, new w9j() { // from class: l.kyn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return lyn0.m152295b(mapM186525l, mapM200319d, z, (mqv) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ mqv m152295b(HashMap map, HashMap map2, boolean z, mqv mqvVar) {
        ixn0 ixn0Var = (ixn0) map.get(((BLiveMember) mqvVar.f135304a).reference);
        if (ixn0Var == null) {
            return null;
        }
        mqvVar.m155999a(ixn0Var.f115379a);
        if (ypv.m215672k().m195959u7() && c5k0.m105345b(mqvVar) && c5k0.m105344a(mqvVar).hierarchy != null) {
            ((BLiveMember) mqvVar.f135304a).liveUserLevel = ((ggv) ypv.m215673l(fld0.f98148c)).m126036v(c5k0.m105344a(mqvVar).hierarchy.grade);
        }
        BLiveVoiceCall bLiveVoiceCall = (BLiveVoiceCall) map2.get(((BLiveMember) mqvVar.f135304a).reference);
        if (bLiveVoiceCall != null) {
            mqvVar.m156000b(bLiveVoiceCall);
        }
        return mqvVar.m156001c(((BLiveMember) mqvVar.f135304a).reference, ixn0Var.f115380b, z);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ BLiveVoiceCall m152296c(BLiveVoiceCall bLiveVoiceCall) {
        return bLiveVoiceCall;
    }
}
