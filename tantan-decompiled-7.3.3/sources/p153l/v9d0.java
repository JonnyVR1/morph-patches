package p153l;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.bean.UserRightType;
import com.p051p1.mobile.putong.live.base.data.BLiveRightAnchorInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveRightAnchorResultItem;
import com.p051p1.mobile.putong.live.base.data.BLiveRightAnchorResultList;
import com.p051p1.mobile.putong.live.base.data.BLiveRightInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveRightItem;
import com.p051p1.mobile.putong.live.external.page.rights.list.model.RightHolderModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class v9d0 {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m200418b(List list, d3q d3qVar) {
        BLiveRightAnchorResultItem bLiveRightAnchorResultItemNew_;
        if (d3qVar instanceof jad0) {
            jad0 jad0Var = (jad0) d3qVar;
            if (jad0Var.m144013H()) {
                bLiveRightAnchorResultItemNew_ = BLiveRightAnchorResultItem.new_();
                bLiveRightAnchorResultItemNew_.userRightId = jad0Var.f118975a.userRightId;
                bLiveRightAnchorResultItemNew_.action = BLiveRightItem.ACTION_EQUIP;
            } else {
                bLiveRightAnchorResultItemNew_ = null;
            }
            if (jad0Var.m144014I()) {
                bLiveRightAnchorResultItemNew_ = BLiveRightAnchorResultItem.new_();
                bLiveRightAnchorResultItemNew_.userRightId = jad0Var.f118975a.userRightId;
                bLiveRightAnchorResultItemNew_.action = BLiveRightItem.ACTION_UN_EQUIP;
            }
            if (bLiveRightAnchorResultItemNew_ != null) {
                list.add(bLiveRightAnchorResultItemNew_);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m200420d(List list, e9d0 e9d0Var) {
        if (e9d0Var instanceof d9d0) {
            d9d0 d9d0Var = (d9d0) e9d0Var;
            if (d9d0Var.f85760e.isEquipped()) {
                list.add(d9d0Var.f85760e);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ thk0 m200422f(Bundle bundle, UserRightType userRightType) {
        return new thk0(bundle, userRightType);
    }

    /* JADX INFO: renamed from: g */
    public static List<d3q<?>> m200423g(Context context, a9d0 a9d0Var, UserRightType userRightType) {
        final ArrayList arrayList = new ArrayList();
        if (!jyb.m147479J(a9d0Var.m96556b())) {
            if (!a9d0Var.m96558d()) {
                arrayList.add(new tad0(userRightType.getEquipNotice(context)));
            }
            jyb.m147537z(a9d0Var.m96556b(), new y20() { // from class: l.t9d0
                @Override // p153l.y20
                public final void call(Object obj) {
                    arrayList.add(new jad0((BLiveRightAnchorInfo) obj));
                }
            });
            if (a9d0Var.m96557c().lastPage) {
                arrayList.add(new sad0());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public static List<e9d0> m200424h(@Nullable BLiveRightInfo bLiveRightInfo, UserRightType userRightType, j9d0 j9d0Var, String str) {
        return k9d0.f124539b.equals(str) ? m200427k(bLiveRightInfo, userRightType, j9d0Var, true) : m200427k(bLiveRightInfo, userRightType, j9d0Var, false);
    }

    /* JADX INFO: renamed from: i */
    public static BLiveRightAnchorResultList m200425i(List<d3q<?>> list) {
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(list, new y20() { // from class: l.r9d0
            @Override // p153l.y20
            public final void call(Object obj) {
                v9d0.m200418b(arrayList, (d3q) obj);
            }
        });
        BLiveRightAnchorResultList bLiveRightAnchorResultListNew_ = BLiveRightAnchorResultList.new_();
        bLiveRightAnchorResultListNew_.userRightActions = arrayList;
        return bLiveRightAnchorResultListNew_;
    }

    /* JADX INFO: renamed from: j */
    public static List<thk0> m200426j(final Bundle bundle, List<UserRightType> list) {
        return y6s.m214494b(bundle.getString("live_mode")) ? jyb.m147507f0(new thk0(bundle, UserRightType.AVATAR_MANAGE), new thk0(bundle, UserRightType.USER_MEDAL_MANAGE), new thk0(bundle, UserRightType.ENTER_ROOM_EFFECT), new thk0(bundle, UserRightType.CHAT_UNDER_SHADE), new thk0(bundle, UserRightType.PROFILE_CARD_MANAGE), new thk0(bundle, UserRightType.CALL_EFFECT)) : jyb.m147486Q(list, new qcj() { // from class: l.p9d0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return v9d0.m200422f(bundle, (UserRightType) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public static List<e9d0> m200427k(@Nullable BLiveRightInfo bLiveRightInfo, UserRightType userRightType, j9d0 j9d0Var, final boolean z) {
        ArrayList arrayList = new ArrayList();
        if (m200428l(userRightType)) {
            arrayList.add(new ycd0(userRightType, j9d0Var));
        }
        List<e9d0> listM200432p = m200432p();
        List<e9d0> listM200432p2 = m200432p();
        if (bLiveRightInfo == null) {
            arrayList.add(new scd0(listM200432p, j9d0Var, false, true));
            arrayList.add(listM200432p.get(0));
            arrayList.add(new scd0(listM200432p2, j9d0Var, true, true));
            arrayList.add(listM200432p2.get(0));
            return arrayList;
        }
        dbd0 displayParam = bLiveRightInfo.getDisplayParam();
        boolean z2 = displayParam != null && displayParam.m115160a();
        boolean z3 = displayParam != null && displayParam.m115161b();
        List<e9d0> listM200436t = m200436t(bLiveRightInfo.multiple, userRightType, bLiveRightInfo.getRoomId(), false, j9d0Var);
        List<e9d0> listM200436t2 = m200436t(bLiveRightInfo.single, userRightType, bLiveRightInfo.getRoomId(), true, j9d0Var);
        boolean z4 = jyb.m147479J(listM200436t) && jyb.m147479J(listM200436t2);
        if (!jyb.m147479J(listM200436t)) {
            listM200432p = listM200436t;
        }
        if (m200429m(userRightType)) {
            listM200432p.add(0, m200430n(listM200436t, false));
        }
        arrayList.add(new scd0(listM200432p, j9d0Var, bLiveRightInfo.getAnchorName(), false, z4 || z2));
        if (z2) {
            arrayList.addAll(listM200432p);
        }
        if (z4) {
            arrayList.addAll(listM200432p);
        }
        if (!jyb.m147479J(listM200436t2)) {
            listM200432p2 = listM200436t2;
        }
        if (m200429m(userRightType) && !TextUtils.isEmpty(bLiveRightInfo.getRoomId())) {
            listM200432p2.add(0, m200430n(listM200436t2, true));
        }
        List<e9d0> list = listM200432p2;
        arrayList.add(new scd0(list, j9d0Var, bLiveRightInfo.getAnchorName(), true, z4 || z3));
        if (z3) {
            arrayList.addAll(list);
        }
        if (z4) {
            arrayList.addAll(list);
        }
        arrayList.add(new RightHolderModel(RightHolderModel.HolderType.LIST_BOTTOM_HOLDER));
        jyb.m147537z(arrayList, new y20() { // from class: l.q9d0
            @Override // p153l.y20
            public final void call(Object obj) {
                ((e9d0) obj).f92629d = z;
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m200428l(UserRightType userRightType) {
        return tbs.f172989b.m203746u7() && userRightType == UserRightType.ENTER_ROOM_EFFECT;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m200429m(UserRightType userRightType) {
        return userRightType == UserRightType.USER_MEDAL_MANAGE;
    }

    /* JADX INFO: renamed from: n */
    public static zbd0 m200430n(List<e9d0> list, boolean z) {
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(list, new y20() { // from class: l.s9d0
            @Override // p153l.y20
            public final void call(Object obj) {
                v9d0.m200420d(arrayList, (e9d0) obj);
            }
        });
        return new zbd0(arrayList, z);
    }

    /* JADX INFO: renamed from: o */
    public static dbd0 m200431o(List<d3q<?>> list, boolean z) {
        Boolean bool = Boolean.TRUE;
        Pair pair = new Pair(bool, bool);
        if (jyb.m147479J(list)) {
            return new dbd0(((Boolean) pair.first).booleanValue(), ((Boolean) pair.second).booleanValue());
        }
        int size = list.size();
        if (z) {
            for (int i = 0; i < size; i++) {
                d3q<?> d3qVar = list.get(i);
                if (d3qVar instanceof scd0) {
                    pair = new Pair(Boolean.valueOf(((scd0) d3qVar).f167242i), Boolean.TRUE);
                    break;
                }
            }
        } else {
            for (int i2 = size - 1; i2 > 0; i2--) {
                d3q<?> d3qVar2 = list.get(i2);
                if (d3qVar2 instanceof scd0) {
                    pair = new Pair(Boolean.TRUE, Boolean.valueOf(((scd0) d3qVar2).f167242i));
                    break;
                }
            }
        }
        return new dbd0(((Boolean) pair.first).booleanValue(), ((Boolean) pair.second).booleanValue());
    }

    /* JADX INFO: renamed from: p */
    public static List<e9d0> m200432p() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new dad0());
        return arrayList;
    }

    /* JADX INFO: renamed from: q */
    public static e9d0 m200433q(BLiveRightItem bLiveRightItem, int i, UserRightType userRightType, String str, boolean z, j9d0 j9d0Var) {
        if (userRightType == UserRightType.CHAT_UNDER_SHADE) {
            return new h9d0(bLiveRightItem, i, str, z, j9d0Var);
        }
        if (userRightType == UserRightType.ENTER_ROOM_EFFECT) {
            return new ead0(bLiveRightItem, i, str, z, j9d0Var);
        }
        if (userRightType == UserRightType.AVATAR_MANAGE || userRightType == UserRightType.CALL_EFFECT) {
            return new b9d0(bLiveRightItem, i, str, z, j9d0Var);
        }
        if (userRightType == UserRightType.PROFILE_CARD_MANAGE) {
            return new vcd0(bLiveRightItem, i, str, z, j9d0Var);
        }
        if (userRightType == UserRightType.USER_MEDAL_MANAGE) {
            return new xbd0(bLiveRightItem, i, str, z, j9d0Var);
        }
        wtq0.m207906a("未曾定义的 UserRightType，请检查");
        return null;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m200434r(UserRightType userRightType, int i) {
        return (userRightType == UserRightType.ENTER_ROOM_EFFECT || userRightType == UserRightType.AVATAR_MANAGE || userRightType == UserRightType.USER_MEDAL_MANAGE || userRightType == UserRightType.CALL_EFFECT) && i % 2 == 1;
    }

    /* JADX INFO: renamed from: s */
    public static List<d3q<?>> m200435s(List<e9d0> list) {
        ArrayList arrayList = new ArrayList();
        jyb.m147537z(list, new xad0(arrayList));
        return arrayList;
    }

    /* JADX INFO: renamed from: t */
    public static List<e9d0> m200436t(List<BLiveRightItem> list, UserRightType userRightType, String str, boolean z, j9d0 j9d0Var) {
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            UserRightType userRightType2 = userRightType;
            arrayList.add(m200433q(list.get(i), i, userRightType2, str, z, j9d0Var));
            i++;
            userRightType = userRightType2;
        }
        if (m200434r(userRightType, size)) {
            arrayList.add(new RightHolderModel(RightHolderModel.HolderType.ENTER_ROOM_EFFECT_HOLDER));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: u */
    public static void m200437u(List<e9d0> list) {
        jyb.m147537z(list, new y20() { // from class: l.u9d0
            @Override // p153l.y20
            public final void call(Object obj) {
                ((e9d0) obj).f92627b = false;
            }
        });
    }
}
