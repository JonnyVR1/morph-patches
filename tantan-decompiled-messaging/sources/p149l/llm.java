package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.Tag;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class llm {
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m150517d(List list, final Tag tag, final Tag tag2) {
        return vwb.m200293G(list, new w9j() { // from class: l.jlm
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals((String) obj, tag.category));
            }
        }) - vwb.m200293G(list, new w9j() { // from class: l.klm
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals((String) obj, tag2.category));
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public static void m150525l(Act act, User user, e30<String> e30Var) {
        if (user == null || act == null || e30Var == null) {
            return;
        }
        if (!TextUtils.isEmpty(user.description)) {
            snm.m185072C(user, act, "\"" + user.description + "\"", e30Var, false);
            return;
        }
        String str = TEnum.equals(user.gender, "female") ? "她" : "他";
        Profile profile = user.profile;
        if (profile != null && !TextUtils.isEmpty(profile.hangouts)) {
            snm.m185072C(user, act, str + "经常去" + user.profile.hangouts, e30Var, false);
            return;
        }
        String strM150527n = m150527n(user);
        if (TextUtils.isEmpty(strM150527n)) {
            e30Var.call("");
            return;
        }
        snm.m185072C(user, act, str + strM150527n, e30Var, false);
    }

    /* JADX INFO: renamed from: m */
    public static List<Tag> m150526m(User user, User user2) {
        if (user == null || user2 == null) {
            return new ArrayList();
        }
        final ArrayList arrayList = new ArrayList();
        arrayList.add("sports");
        arrayList.add("music");
        arrayList.add("places");
        arrayList.add("food");
        arrayList.add("movies");
        ArrayList arrayListM200339n = vwb.m200339n(user2.profile.tags, new w9j() { // from class: l.clm
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(vwb.m200337m(arrayList, new w9j() { // from class: l.ilm
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(TextUtils.equals((String) obj2, tag.category));
                    }
                }));
            }
        });
        if (vwb.m200296J(arrayListM200339n)) {
            return new ArrayList();
        }
        final ArrayList arrayListM200339n2 = vwb.m200339n(user.profile.tags, new w9j() { // from class: l.dlm
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(vwb.m200337m(arrayList, new w9j() { // from class: l.blm
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(TextUtils.equals((String) obj2, tag.category));
                    }
                }));
            }
        });
        if (vwb.m200296J(arrayListM200339n2)) {
            return new ArrayList();
        }
        Comparator comparator = new Comparator() { // from class: l.elm
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return llm.m150517d(arrayList, (Tag) obj, (Tag) obj2);
            }
        };
        Collections.sort(arrayListM200339n2, comparator);
        Collections.sort(arrayListM200339n, comparator);
        ArrayList arrayListM200339n3 = vwb.m200339n(arrayListM200339n, new w9j() { // from class: l.flm
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a(vwb.m200346r(arrayListM200339n2, new w9j() { // from class: l.hlm
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        Tag tag = tag;
                        Tag tag2 = (Tag) obj2;
                        return Boolean.valueOf(TextUtils.equals(tag.category, tag2.category) && TextUtils.equals(tag.value, tag2.value));
                    }
                })));
            }
        });
        return vwb.m200296J(arrayListM200339n3) ? new ArrayList() : arrayListM200339n3;
    }

    /* JADX INFO: renamed from: n */
    public static String m150527n(User user) {
        List<Tag> listM150526m = m150526m(CoreModule.f17545c.f19639e0.m169527p9(), user);
        final ArrayList arrayList = new ArrayList();
        arrayList.add("sports");
        arrayList.add("music");
        arrayList.add("places");
        arrayList.add("literature");
        arrayList.add("food");
        arrayList.add("movies");
        ArrayList<Tag> arrayListM200339n = vwb.m200339n(user.profile.tags, new w9j() { // from class: l.alm
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(vwb.m200337m(arrayList, new w9j() { // from class: l.glm
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(TextUtils.equals((String) obj2, tag.category));
                    }
                }));
            }
        });
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(listM150526m);
        if (!vwb.m200296J(arrayListM200339n)) {
            for (Tag tag : arrayListM200339n) {
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
