package p009l;

import com.p1.mobile.putong.live.base.bean.LivingUsers;
import com.p1.mobile.putong.live.base.data.BLiveData;
import com.p1.mobile.putong.live.base.data.BLiveMember;
import com.p1.mobile.putong.live.base.data.BLiveStarlightHierarchy;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCall;
import java.util.HashMap;
import l.c5k0;
import l.ixn0;
import l.mqv;
import l.sxn0;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class lyn0 {

    /* JADX INFO: renamed from: a */
    public LivingUsers<BLiveMember> f16447a;

    /* JADX INFO: renamed from: b */
    public HashMap<String, String> f16448b;

    public lyn0(BLiveData bLiveData, final boolean z) {
        this.f16447a = new LivingUsers<>();
        this.f16448b = new HashMap<>();
        if (bLiveData == null || vwb.J(bLiveData.members)) {
            return;
        }
        final HashMap mapL = sxn0.l(bLiveData.users, bLiveData.masks, z);
        final HashMap mapD = vwb.d(bLiveData.voiceCalls, new w9j() { // from class: l.gyn0
            public final Object call(Object obj) {
                return ((BLiveVoiceCall) obj).user;
            }
        }, new w9j() { // from class: l.hyn0
            public final Object call(Object obj) {
                return lyn0.m18094c((BLiveVoiceCall) obj);
            }
        });
        this.f16448b = vwb.d(bLiveData.starlightHierarchies, new w9j() { // from class: l.iyn0
            public final Object call(Object obj) {
                return ((BLiveStarlightHierarchy) obj).userId;
            }
        }, new w9j() { // from class: l.jyn0
            public final Object call(Object obj) {
                return ((BLiveStarlightHierarchy) obj).imageUrl;
            }
        });
        this.f16447a = LivingUsers.convert(bLiveData.members, new w9j() { // from class: l.kyn0
            public final Object call(Object obj) {
                return lyn0.m18093b(mapL, mapD, z, (mqv) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ mqv m18093b(HashMap map, HashMap map2, boolean z, mqv mqvVar) {
        ixn0 ixn0Var = (ixn0) map.get(((BLiveMember) mqvVar.a).reference);
        if (ixn0Var == null) {
            return null;
        }
        mqvVar.a(ixn0Var.a);
        if (ypv.m25490k().u7() && c5k0.b(mqvVar) && c5k0.a(mqvVar).hierarchy != null) {
            ((BLiveMember) mqvVar.a).liveUserLevel = ((ggv) ypv.m25491l(fld0.f13077c)).m15033v(c5k0.a(mqvVar).hierarchy.grade);
        }
        BLiveVoiceCall bLiveVoiceCall = (BLiveVoiceCall) map2.get(((BLiveMember) mqvVar.a).reference);
        if (bLiveVoiceCall != null) {
            mqvVar.b(bLiveVoiceCall);
        }
        return mqvVar.c(((BLiveMember) mqvVar.a).reference, ixn0Var.b, z);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ BLiveVoiceCall m18094c(BLiveVoiceCall bLiveVoiceCall) {
        return bLiveVoiceCall;
    }
}
