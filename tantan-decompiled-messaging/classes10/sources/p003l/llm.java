package p003l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.data.ProfileLikeCategoryType;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.Tag;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import l.e30;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class llm {
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m7742d(List list, final Tag tag, final Tag tag2) {
        return vwb.G(list, new w9j() { // from class: l.jlm
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals((String) obj, tag.category));
            }
        }) - vwb.G(list, new w9j() { // from class: l.klm
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals((String) obj, tag2.category));
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public static void m7750l(Act act, User user, e30<String> e30Var) {
        if (user == null || act == null || e30Var == null) {
            return;
        }
        if (!TextUtils.isEmpty(user.description)) {
            snm.m9374C(user, act, "\"" + user.description + "\"", e30Var, false);
            return;
        }
        String str = TEnum.equals(user.gender, "female") ? "她" : "他";
        Profile profile = user.profile;
        if (profile != null && !TextUtils.isEmpty(profile.hangouts)) {
            snm.m9374C(user, act, str + "经常去" + user.profile.hangouts, e30Var, false);
            return;
        }
        String strM7752n = m7752n(user);
        if (TextUtils.isEmpty(strM7752n)) {
            e30Var.call("");
            return;
        }
        snm.m9374C(user, act, str + strM7752n, e30Var, false);
    }

    /* JADX INFO: renamed from: m */
    public static List<Tag> m7751m(User user, User user2) {
        if (user == null || user2 == null) {
            return new ArrayList();
        }
        final ArrayList arrayList = new ArrayList();
        arrayList.add(ProfileLikeCategoryType.sports);
        arrayList.add(ProfileLikeCategoryType.music);
        arrayList.add(ProfileLikeCategoryType.places);
        arrayList.add(ProfileLikeCategoryType.food);
        arrayList.add(ProfileLikeCategoryType.movies);
        ArrayList arrayListN = vwb.n(user2.profile.tags, new w9j() { // from class: l.clm
            public final Object call(Object obj) {
                return Boolean.valueOf(vwb.m(arrayList, new w9j() { // from class: l.ilm
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(TextUtils.equals((String) obj2, tag.category));
                    }
                }));
            }
        });
        if (vwb.J(arrayListN)) {
            return new ArrayList();
        }
        final ArrayList arrayListN2 = vwb.n(user.profile.tags, new w9j() { // from class: l.dlm
            public final Object call(Object obj) {
                return Boolean.valueOf(vwb.m(arrayList, new w9j() { // from class: l.blm
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(TextUtils.equals((String) obj2, tag.category));
                    }
                }));
            }
        });
        if (vwb.J(arrayListN2)) {
            return new ArrayList();
        }
        Comparator comparator = new Comparator() { // from class: l.elm
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return llm.m7742d(arrayList, (Tag) obj, (Tag) obj2);
            }
        };
        Collections.sort(arrayListN2, comparator);
        Collections.sort(arrayListN, comparator);
        ArrayList arrayListN3 = vwb.n(arrayListN, new w9j() { // from class: l.flm
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a(vwb.r(arrayListN2, new w9j() { // from class: l.hlm
                    public final Object call(Object obj2) {
                        Tag tag = tag;
                        Tag tag2 = (Tag) obj2;
                        return Boolean.valueOf(TextUtils.equals(tag.category, tag2.category) && TextUtils.equals(tag.value, tag2.value));
                    }
                })));
            }
        });
        return vwb.J(arrayListN3) ? new ArrayList() : arrayListN3;
    }

    /* JADX INFO: renamed from: n */
    public static String m7752n(User user) {
        List<Tag> listM7751m = m7751m(CoreModule.c.e0.p9(), user);
        final ArrayList arrayList = new ArrayList();
        arrayList.add(ProfileLikeCategoryType.sports);
        arrayList.add(ProfileLikeCategoryType.music);
        arrayList.add(ProfileLikeCategoryType.places);
        arrayList.add("literature");
        arrayList.add(ProfileLikeCategoryType.food);
        arrayList.add(ProfileLikeCategoryType.movies);
        ArrayList<Tag> arrayListN = vwb.n(user.profile.tags, new w9j() { // from class: l.alm
            public final Object call(Object obj) {
                return Boolean.valueOf(vwb.m(arrayList, new w9j() { // from class: l.glm
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(TextUtils.equals((String) obj2, tag.category));
                    }
                }));
            }
        });
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(listM7751m);
        if (!vwb.J(arrayListN)) {
            for (Tag tag : arrayListN) {
                if (!arrayList2.contains(tag)) {
                    arrayList2.add(tag);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayList2.size(); i++) {
            if (i != 0) {
                sb.append("、");
            }
            sb.append(((Tag) arrayList2.get(i)).value);
        }
        if (arrayList2.size() > 3) {
            sb.append("等");
        }
        return sb.toString();
    }
}
