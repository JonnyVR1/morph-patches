package p149l;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.bean.UserRightType;
import com.p046p1.mobile.putong.live.base.data.BLiveRightAnchorInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveRightAnchorResultItem;
import com.p046p1.mobile.putong.live.base.data.BLiveRightAnchorResultList;
import com.p046p1.mobile.putong.live.base.data.BLiveRightInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveRightItem;
import com.p046p1.mobile.putong.live.external.page.rights.list.model.RightHolderModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class s1d0 {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m181938b(List list, d1q d1qVar) {
        BLiveRightAnchorResultItem bLiveRightAnchorResultItemNew_;
        if (d1qVar instanceof g2d0) {
            g2d0 g2d0Var = (g2d0) d1qVar;
            if (g2d0Var.m124147H()) {
                bLiveRightAnchorResultItemNew_ = BLiveRightAnchorResultItem.new_();
                bLiveRightAnchorResultItemNew_.userRightId = g2d0Var.f100257a.userRightId;
                bLiveRightAnchorResultItemNew_.action = BLiveRightItem.ACTION_EQUIP;
            } else {
                bLiveRightAnchorResultItemNew_ = null;
            }
            if (g2d0Var.m124148I()) {
                bLiveRightAnchorResultItemNew_ = BLiveRightAnchorResultItem.new_();
                bLiveRightAnchorResultItemNew_.userRightId = g2d0Var.f100257a.userRightId;
                bLiveRightAnchorResultItemNew_.action = BLiveRightItem.ACTION_UN_EQUIP;
            }
            if (bLiveRightAnchorResultItemNew_ != null) {
                list.add(bLiveRightAnchorResultItemNew_);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m181940d(List list, b1d0 b1d0Var) {
        if (b1d0Var instanceof a1d0) {
            a1d0 a1d0Var = (a1d0) b1d0Var;
            if (a1d0Var.f67173e.isEquipped()) {
                list.add(a1d0Var.f67173e);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ n8k0 m181942f(Bundle bundle, UserRightType userRightType) {
        return new n8k0(bundle, userRightType);
    }

    /* JADX INFO: renamed from: g */
    public static List<d1q<?>> m181943g(Context context, x0d0 x0d0Var, UserRightType userRightType) {
        final ArrayList arrayList = new ArrayList();
        if (!vwb.m200296J(x0d0Var.m206607b())) {
            if (!x0d0Var.m206609d()) {
                arrayList.add(new q2d0(userRightType.getEquipNotice(context)));
            }
            vwb.m200354z(x0d0Var.m206607b(), new e30() { // from class: l.q1d0
                @Override // p149l.e30
                public final void call(Object obj) {
                    arrayList.add(new g2d0((BLiveRightAnchorInfo) obj));
                }
            });
            if (x0d0Var.m206608c().lastPage) {
                arrayList.add(new p2d0());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public static List<b1d0> m181944h(@Nullable BLiveRightInfo bLiveRightInfo, UserRightType userRightType, g1d0 g1d0Var, String str) {
        return h1d0.f105425b.equals(str) ? m181947k(bLiveRightInfo, userRightType, g1d0Var, true) : m181947k(bLiveRightInfo, userRightType, g1d0Var, false);
    }

    /* JADX INFO: renamed from: i */
    public static BLiveRightAnchorResultList m181945i(List<d1q<?>> list) {
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(list, new e30() { // from class: l.o1d0
            @Override // p149l.e30
            public final void call(Object obj) {
                s1d0.m181938b(arrayList, (d1q) obj);
            }
        });
        BLiveRightAnchorResultList bLiveRightAnchorResultListNew_ = BLiveRightAnchorResultList.new_();
        bLiveRightAnchorResultListNew_.userRightActions = arrayList;
        return bLiveRightAnchorResultListNew_;
    }

    /* JADX INFO: renamed from: j */
    public static List<n8k0> m181946j(final Bundle bundle, List<UserRightType> list) {
        return x4s.m207012b(bundle.getString("live_mode")) ? vwb.m200324f0(new n8k0(bundle, UserRightType.AVATAR_MANAGE), new n8k0(bundle, UserRightType.USER_MEDAL_MANAGE), new n8k0(bundle, UserRightType.ENTER_ROOM_EFFECT), new n8k0(bundle, UserRightType.CHAT_UNDER_SHADE), new n8k0(bundle, UserRightType.PROFILE_CARD_MANAGE), new n8k0(bundle, UserRightType.CALL_EFFECT)) : vwb.m200303Q(list, new w9j() { // from class: l.m1d0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return s1d0.m181942f(bundle, (UserRightType) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public static List<b1d0> m181947k(@Nullable BLiveRightInfo bLiveRightInfo, UserRightType userRightType, g1d0 g1d0Var, final boolean z) {
        ArrayList arrayList = new ArrayList();
        if (m181948l(userRightType)) {
            arrayList.add(new v4d0(userRightType, g1d0Var));
        }
        List<b1d0> listM181952p = m181952p();
        List<b1d0> listM181952p2 = m181952p();
        if (bLiveRightInfo == null) {
            arrayList.add(new p4d0(listM181952p, g1d0Var, false, true));
            arrayList.add(listM181952p.get(0));
            arrayList.add(new p4d0(listM181952p2, g1d0Var, true, true));
            arrayList.add(listM181952p2.get(0));
            return arrayList;
        }
        a3d0 displayParam = bLiveRightInfo.getDisplayParam();
        boolean z2 = displayParam != null && displayParam.m94660a();
        boolean z3 = displayParam != null && displayParam.m94661b();
        List<b1d0> listM181956t = m181956t(bLiveRightInfo.multiple, userRightType, bLiveRightInfo.getRoomId(), false, g1d0Var);
        List<b1d0> listM181956t2 = m181956t(bLiveRightInfo.single, userRightType, bLiveRightInfo.getRoomId(), true, g1d0Var);
        boolean z4 = vwb.m200296J(listM181956t) && vwb.m200296J(listM181956t2);
        if (!vwb.m200296J(listM181956t)) {
            listM181952p = listM181956t;
        }
        if (m181949m(userRightType)) {
            listM181952p.add(0, m181950n(listM181956t, false));
        }
        arrayList.add(new p4d0(listM181952p, g1d0Var, bLiveRightInfo.getAnchorName(), false, z4 || z2));
        if (z2) {
            arrayList.addAll(listM181952p);
        }
        if (z4) {
            arrayList.addAll(listM181952p);
        }
        if (!vwb.m200296J(listM181956t2)) {
            listM181952p2 = listM181956t2;
        }
        if (m181949m(userRightType) && !TextUtils.isEmpty(bLiveRightInfo.getRoomId())) {
            listM181952p2.add(0, m181950n(listM181956t2, true));
        }
        List<b1d0> list = listM181952p2;
        arrayList.add(new p4d0(list, g1d0Var, bLiveRightInfo.getAnchorName(), true, z4 || z3));
        if (z3) {
            arrayList.addAll(list);
        }
        if (z4) {
            arrayList.addAll(list);
        }
        arrayList.add(new RightHolderModel(RightHolderModel.HolderType.LIST_BOTTOM_HOLDER));
        vwb.m200354z(arrayList, new e30() { // from class: l.n1d0
            @Override // p149l.e30
            public final void call(Object obj) {
                ((b1d0) obj).f72587d = z;
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m181948l(UserRightType userRightType) {
        return s9s.f163228b.m195959u7() && userRightType == UserRightType.ENTER_ROOM_EFFECT;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m181949m(UserRightType userRightType) {
        return userRightType == UserRightType.USER_MEDAL_MANAGE;
    }

    /* JADX INFO: renamed from: n */
    public static w3d0 m181950n(List<b1d0> list, boolean z) {
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(list, new e30() { // from class: l.p1d0
            @Override // p149l.e30
            public final void call(Object obj) {
                s1d0.m181940d(arrayList, (b1d0) obj);
            }
        });
        return new w3d0(arrayList, z);
    }

    /* JADX INFO: renamed from: o */
    public static a3d0 m181951o(List<d1q<?>> list, boolean z) {
        Boolean bool = Boolean.TRUE;
        Pair pair = new Pair(bool, bool);
        if (vwb.m200296J(list)) {
            return new a3d0(((Boolean) pair.first).booleanValue(), ((Boolean) pair.second).booleanValue());
        }
        int size = list.size();
        if (z) {
            for (int i = 0; i < size; i++) {
                d1q<?> d1qVar = list.get(i);
                if (d1qVar instanceof p4d0) {
                    pair = new Pair(Boolean.valueOf(((p4d0) d1qVar).f147160i), Boolean.TRUE);
                    break;
                }
            }
        } else {
            for (int i2 = size - 1; i2 > 0; i2--) {
                d1q<?> d1qVar2 = list.get(i2);
                if (d1qVar2 instanceof p4d0) {
                    pair = new Pair(Boolean.TRUE, Boolean.valueOf(((p4d0) d1qVar2).f147160i));
                    break;
                }
            }
        }
        return new a3d0(((Boolean) pair.first).booleanValue(), ((Boolean) pair.second).booleanValue());
    }

    /* JADX INFO: renamed from: p */
    public static List<b1d0> m181952p() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a2d0());
        return arrayList;
    }

    /* JADX INFO: renamed from: q */
    public static b1d0 m181953q(BLiveRightItem bLiveRightItem, int i, UserRightType userRightType, String str, boolean z, g1d0 g1d0Var) {
        if (userRightType == UserRightType.CHAT_UNDER_SHADE) {
            return new e1d0(bLiveRightItem, i, str, z, g1d0Var);
        }
        if (userRightType == UserRightType.ENTER_ROOM_EFFECT) {
            return new b2d0(bLiveRightItem, i, str, z, g1d0Var);
        }
        if (userRightType == UserRightType.AVATAR_MANAGE || userRightType == UserRightType.CALL_EFFECT) {
            return new y0d0(bLiveRightItem, i, str, z, g1d0Var);
        }
        if (userRightType == UserRightType.PROFILE_CARD_MANAGE) {
            return new s4d0(bLiveRightItem, i, str, z, g1d0Var);
        }
        if (userRightType == UserRightType.USER_MEDAL_MANAGE) {
            return new u3d0(bLiveRightItem, i, str, z, g1d0Var);
        }
        qkq0.m175383a("未曾定义的 UserRightType，请检查");
        return null;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m181954r(UserRightType userRightType, int i) {
        return (userRightType == UserRightType.ENTER_ROOM_EFFECT || userRightType == UserRightType.AVATAR_MANAGE || userRightType == UserRightType.USER_MEDAL_MANAGE || userRightType == UserRightType.CALL_EFFECT) && i % 2 == 1;
    }

    /* JADX INFO: renamed from: s */
    public static List<d1q<?>> m181955s(List<b1d0> list) {
        ArrayList arrayList = new ArrayList();
        vwb.m200354z(list, new u2d0(arrayList));
        return arrayList;
    }

    /* JADX INFO: renamed from: t */
    public static List<b1d0> m181956t(List<BLiveRightItem> list, UserRightType userRightType, String str, boolean z, g1d0 g1d0Var) {
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            UserRightType userRightType2 = userRightType;
            arrayList.add(m181953q(list.get(i), i, userRightType2, str, z, g1d0Var));
            i++;
            userRightType = userRightType2;
        }
        if (m181954r(userRightType, size)) {
            arrayList.add(new RightHolderModel(RightHolderModel.HolderType.ENTER_ROOM_EFFECT_HOLDER));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: u */
    public static void m181957u(List<b1d0> list) {
        vwb.m200354z(list, new e30() { // from class: l.r1d0
            @Override // p149l.e30
            public final void call(Object obj) {
                ((b1d0) obj).f72585b = false;
            }
        });
    }
}
