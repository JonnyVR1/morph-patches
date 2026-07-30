package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.Tag;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class nnm {
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m163895d(List list, final Tag tag, final Tag tag2) {
        return jyb.m147476G(list, new qcj() { // from class: l.lnm
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals((String) obj, tag.category));
            }
        }) - jyb.m147476G(list, new qcj() { // from class: l.mnm
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals((String) obj, tag2.category));
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public static void m163903l(Act act, User user, y20<String> y20Var) {
        if (user == null || act == null || y20Var == null) {
            return;
        }
        if (!TextUtils.isEmpty(user.description)) {
            upm.m197106C(user, act, "\"" + user.description + "\"", y20Var, false);
            return;
        }
        String str = TEnum.equals(user.gender, "female") ? "她" : "他";
        Profile profile = user.profile;
        if (profile != null && !TextUtils.isEmpty(profile.hangouts)) {
            upm.m197106C(user, act, str + "经常去" + user.profile.hangouts, y20Var, false);
            return;
        }
        String strM163905n = m163905n(user);
        if (TextUtils.isEmpty(strM163905n)) {
            y20Var.call("");
            return;
        }
        upm.m197106C(user, act, str + strM163905n, y20Var, false);
    }

    /* JADX INFO: renamed from: m */
    public static List<Tag> m163904m(User user, User user2) {
        if (user == null || user2 == null) {
            return new ArrayList();
        }
        final ArrayList arrayList = new ArrayList();
        arrayList.add("sports");
        arrayList.add("music");
        arrayList.add("places");
        arrayList.add("food");
        arrayList.add("movies");
        ArrayList arrayListM147522n = jyb.m147522n(user2.profile.tags, new qcj() { // from class: l.enm
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(jyb.m147520m(arrayList, new qcj() { // from class: l.knm
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(TextUtils.equals((String) obj2, tag.category));
                    }
                }));
            }
        });
        if (jyb.m147479J(arrayListM147522n)) {
            return new ArrayList();
        }
        final ArrayList arrayListM147522n2 = jyb.m147522n(user.profile.tags, new qcj() { // from class: l.fnm
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(jyb.m147520m(arrayList, new qcj() { // from class: l.dnm
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(TextUtils.equals((String) obj2, tag.category));
                    }
                }));
            }
        });
        if (jyb.m147479J(arrayListM147522n2)) {
            return new ArrayList();
        }
        Comparator comparator = new Comparator() { // from class: l.gnm
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return nnm.m163895d(arrayList, (Tag) obj, (Tag) obj2);
            }
        };
        Collections.sort(arrayListM147522n2, comparator);
        Collections.sort(arrayListM147522n, comparator);
        ArrayList arrayListM147522n3 = jyb.m147522n(arrayListM147522n, new qcj() { // from class: l.hnm
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a(jyb.m147529r(arrayListM147522n2, new qcj() { // from class: l.jnm
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        Tag tag = tag;
                        Tag tag2 = (Tag) obj2;
                        return Boolean.valueOf(TextUtils.equals(tag.category, tag2.category) && TextUtils.equals(tag.value, tag2.value));
                    }
                })));
            }
        });
        return jyb.m147479J(arrayListM147522n3) ? new ArrayList() : arrayListM147522n3;
    }

    /* JADX INFO: renamed from: n */
    public static String m163905n(User user) {
        List<Tag> listM163904m = m163904m(CoreModule.f18264c.f20381e0.m116600p9(), user);
        final ArrayList arrayList = new ArrayList();
        arrayList.add("sports");
        arrayList.add("music");
        arrayList.add("places");
        arrayList.add("literature");
        arrayList.add("food");
        arrayList.add("movies");
        ArrayList<Tag> arrayListM147522n = jyb.m147522n(user.profile.tags, new qcj() { // from class: l.cnm
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(jyb.m147520m(arrayList, new qcj() { // from class: l.inm
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(TextUtils.equals((String) obj2, tag.category));
                    }
                }));
            }
        });
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(listM163904m);
        if (!jyb.m147479J(arrayListM147522n)) {
            for (Tag tag : arrayListM147522n) {
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
