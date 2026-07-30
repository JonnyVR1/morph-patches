package p002l;

import android.content.Context;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.EditTagsData;
import com.p1.mobile.putong.core.data.NewTags;
import com.p1.mobile.putong.core.data.TagCategories;
import com.p1.mobile.putong.core.data.TagUserCounts;
import com.p1.mobile.putong.core.data.UserTagData;
import com.p1.mobile.putong.core.data.UserTagsData;
import com.p1.mobile.putong.core.newui.profile.TagChooseMkAct;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Extensions;
import com.p1.mobile.putong.data.Interest;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.OmsTagUserCounts;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.Tag;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.ui.webview.mk.MkWebViewAct;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.math.RoundingMode;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import l.e30;
import l.hpd0;
import l.ia20;
import l.juk;
import l.mkd0;
import l.roj0;
import l.tpd0;
import l.upa;
import l.uqd0;
import l.ush0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.wn90;
import l.xh5;
import rx.subjects.a;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class sa40 {

    /* JADX INFO: renamed from: r */
    public static volatile sa40 f18853r;

    /* JADX INFO: renamed from: s */
    public static final String f18854s;

    /* JADX INFO: renamed from: t */
    public static final String f18855t;

    /* JADX INFO: renamed from: u */
    public static final String f18856u;

    /* JADX INFO: renamed from: v */
    public static final String f18857v;

    /* JADX INFO: renamed from: w */
    public static final String f18858w;

    /* JADX INFO: renamed from: l */
    public C0810g f18870l;

    /* JADX INFO: renamed from: m */
    public C0806c f18871m;

    /* JADX INFO: renamed from: n */
    public C0806c f18872n;

    /* JADX INFO: renamed from: o */
    public C0808e f18873o;

    /* JADX INFO: renamed from: p */
    public C0809f f18874p;

    /* JADX INFO: renamed from: a */
    public uqd0 f18859a = new uqd0("tag_md5" + CoreModule.H().userId(), "");

    /* JADX INFO: renamed from: b */
    public uqd0 f18860b = new uqd0("tag_picture_strategy_md5" + CoreModule.H().userId(), "");

    /* JADX INFO: renamed from: c */
    public uqd0 f18861c = new uqd0("core_oms_me_tags_tag_content_" + CoreModule.H().userId(), "");

    /* JADX INFO: renamed from: d */
    public uqd0 f18862d = new uqd0("core_oms_me_tags_tag_content_pic_" + CoreModule.H().userId(), "");

    /* JADX INFO: renamed from: e */
    public uqd0 f18863e = new uqd0("category_md5" + CoreModule.H().userId(), "");

    /* JADX INFO: renamed from: f */
    public uqd0 f18864f = new uqd0("core_oms_me_category_content_" + CoreModule.H().userId(), "");

    /* JADX INFO: renamed from: g */
    public uqd0 f18865g = new uqd0("core_oms_me_tags_users_number_" + CoreModule.H().userId(), "");

    /* JADX INFO: renamed from: h */
    public tpd0 f18866h = new tpd0("core_close_tag_guide_number_" + CoreModule.H().userId(), 0);

    /* JADX INFO: renamed from: i */
    public hpd0 f18867i = new hpd0("core_tag_guide_show_" + CoreModule.H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: j */
    public b<roj0> f18868j = b.b();

    /* JADX INFO: renamed from: k */
    public a<roj0> f18869k = a.b();

    /* JADX INFO: renamed from: q */
    public boolean f18875q = false;

    /* JADX INFO: renamed from: l.sa40$a */
    public class C0804a implements w9j<String, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f18876a;

        public C0804a(List list) {
            this.f18876a = list;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(String str) {
            return Boolean.valueOf(!this.f18876a.contains(str));
        }
    }

    /* JADX INFO: renamed from: l.sa40$b */
    public class C0805b implements Comparator<UserTagData> {
        public C0805b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(UserTagData userTagData, UserTagData userTagData2) {
            return userTagData.index - userTagData2.index;
        }
    }

    /* JADX INFO: renamed from: l.sa40$c */
    public static class C0806c {

        /* JADX INFO: renamed from: a */
        public List<NewTags> f18879a;

        /* JADX INFO: renamed from: b */
        public String f18880b;

        /* JADX INFO: renamed from: c */
        public String f18881c;
    }

    /* JADX INFO: renamed from: l.sa40$d */
    public static class C0807d {

        /* JADX INFO: renamed from: a */
        public boolean f18882a;

        /* JADX INFO: renamed from: b */
        public List<NewTags> f18883b;

        public C0807d(boolean z, List<NewTags> list) {
            this.f18882a = z;
            this.f18883b = list;
        }

        /* JADX INFO: renamed from: a */
        public List<NewTags> m22313a() {
            return this.f18882a ? this.f18883b : new ArrayList();
        }
    }

    /* JADX INFO: renamed from: l.sa40$e */
    public static class C0808e {

        /* JADX INFO: renamed from: a */
        public List<TagCategories> f18884a;

        /* JADX INFO: renamed from: b */
        public String f18885b;

        /* JADX INFO: renamed from: c */
        public String f18886c;
    }

    /* JADX INFO: renamed from: l.sa40$f */
    public static class C0809f {

        /* JADX INFO: renamed from: a */
        public List<TagUserCounts> f18887a;

        /* JADX INFO: renamed from: b */
        public String f18888b;

        /* JADX INFO: renamed from: c */
        public String f18889c;
    }

    /* JADX INFO: renamed from: l.sa40$g */
    public static class C0810g {

        /* JADX INFO: renamed from: a */
        public List<NewTags> f18890a;

        /* JADX INFO: renamed from: b */
        public String f18891b;
    }

    /* JADX INFO: renamed from: l.sa40$h */
    public static class C0811h {

        /* JADX INFO: renamed from: a */
        public boolean f18892a;

        /* JADX INFO: renamed from: b */
        public List<NewTags> f18893b;

        public C0811h(boolean z, List<NewTags> list) {
            this.f18892a = z;
            this.f18893b = list;
        }

        /* JADX INFO: renamed from: b */
        public List<NewTags> m22315b() {
            return this.f18892a ? this.f18893b : new ArrayList();
        }
    }

    /* JADX INFO: renamed from: l.sa40$i */
    public static class C0812i {

        /* JADX INFO: renamed from: a */
        public boolean f18894a;

        /* JADX INFO: renamed from: b */
        public List<TagCategories> f18895b;

        public C0812i(boolean z, List<TagCategories> list) {
            this.f18894a = z;
            this.f18895b = list;
        }

        /* JADX INFO: renamed from: a */
        public List<TagCategories> m22316a() {
            return this.f18894a ? this.f18895b : new ArrayList();
        }
    }

    /* JADX INFO: renamed from: l.sa40$j */
    public static class C0813j {

        /* JADX INFO: renamed from: a */
        public boolean f18896a;

        /* JADX INFO: renamed from: b */
        public List<TagUserCounts> f18897b;

        public C0813j(boolean z, List<TagUserCounts> list) {
            this.f18896a = z;
            this.f18897b = list;
        }
    }

    static {
        f18854s = (juk.e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/dating-optimization-tags/index.html?speed=true&_bid=1004745&hideNavigationBar=1&showAddTagBtn=false");
        f18855t = (juk.e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/label-optimization-new/index.html?speed=true&_bid=1002880&hideNavigationBar=1");
        f18856u = (juk.e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/label-optimization-new/index.html?speed=true&_bid=1002880&hideNavigationBar=1");
        f18857v = (juk.e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/label-optimization-new/index.html?speed=true&_bid=1002880&hideNavigationBar=1");
        f18858w = (juk.e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/heart-beat/index.html?speed=true&_bid=1002785&hideNotch=1&hideNavigationBar=1&_ui=128");
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m22267e(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Tag m22269g(NewTags newTags) {
        return new Tag("personality", newTags.name);
    }

    /* JADX INFO: renamed from: o */
    public static sa40 m22270o() {
        if (f18853r == null) {
            synchronized (sa40.class) {
                try {
                    if (f18853r == null) {
                        f18853r = new sa40();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f18853r;
    }

    /* JADX INFO: renamed from: A */
    public UserTagsData m22271A(Act act, User user, boolean z) {
        return m22272B(act, user, z, false);
    }

    /* JADX INFO: renamed from: B */
    public UserTagsData m22272B(Act act, User user, boolean z, boolean z2) {
        Profile profile;
        Extensions extensions;
        Interest interest;
        if (user != null && (profile = user.profile) != null && (extensions = profile.extensions) != null && (interest = extensions.interest) != null && ((z || !vwb.J(interest.tags)) && (!user.isMe() || !z || !vwb.J(m22310z())))) {
            if (user.isMe()) {
                C0811h c0811hM22287Q = m22287Q(z ? m22310z() : user.profile.extensions.interest.tags, z2);
                C0812i c0812iM22308x = m22308x();
                if (!c0811hM22287Q.f18892a || !c0812iM22308x.f18894a) {
                    return null;
                }
                UserTagsData userTagsData = new UserTagsData();
                userTagsData.tags = m22281K(c0811hM22287Q.m22315b());
                userTagsData.tagCategories = c0812iM22308x.m22316a();
                userTagsData.clickable = upa.r2();
                return userTagsData;
            }
            ArrayList<String> arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            List<String> list = user.profile.extensions.interest.tags;
            List list2 = CoreModule.K().me_().profile.extensions.interest.tags;
            if (!vwb.J(list)) {
                for (String str : list) {
                    if (!TextUtils.isEmpty(str)) {
                        if (list2.contains(str)) {
                            arrayList2.add(str);
                        } else {
                            arrayList3.add(str);
                        }
                    }
                }
                arrayList.addAll(arrayList2);
                arrayList.addAll(arrayList3);
            }
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            for (String str2 : arrayList) {
                if (CoreModule.c.e0.S6.containsKey(str2)) {
                    arrayList4.add(str2);
                } else {
                    arrayList5.add(str2);
                }
            }
            m22300p(arrayList5);
            C0811h c0811hM22287Q2 = m22287Q(arrayList4, z2);
            C0812i c0812iM22308x2 = m22308x();
            if (c0811hM22287Q2 != null && c0811hM22287Q2.f18892a && c0812iM22308x2.f18894a) {
                List<NewTags> listM22315b = c0811hM22287Q2.m22315b();
                if (!vwb.J(arrayList2)) {
                    for (NewTags newTags : listM22315b) {
                        if (arrayList2.contains(newTags.id)) {
                            newTags.localIsCommonLabel = true;
                        } else {
                            newTags.localIsCommonLabel = false;
                        }
                    }
                }
                UserTagsData userTagsData2 = new UserTagsData();
                userTagsData2.tags = m22281K(listM22315b);
                userTagsData2.tagCategories = c0812iM22308x2.m22316a();
                userTagsData2.clickable = upa.r2();
                return userTagsData2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: C */
    public void m22273C(Act act, String str, boolean z) {
        act.startActivity(MkWebViewAct.c2(act, "", f18856u + "&preview=" + z + "&showFrom=" + str + "#/tagEditing#/", true, true, (ResultReceiver) null));
    }

    /* JADX INFO: renamed from: D */
    public void m22274D(Frag frag, int i, String str, boolean z) {
        frag.startActivityForResult(MkWebViewAct.c2(frag.getContext(), "", f18856u + "&preview=" + z + "&showFrom=" + str + "#/tagEditing#/", true, true, (ResultReceiver) null), i);
    }

    /* JADX INFO: renamed from: E */
    public void m22275E(Context context, String str, String str2, String str3) {
        User userPa = CoreModule.c.e0.Pa(str);
        if (NullChecker.a(userPa)) {
            context.startActivity(MkWebViewAct.c2(context, "", f18858w + "&from=" + str2 + "&tabName=" + str3 + "&otherGender=" + (userPa.isFemale() ? "female" : "male"), true, true, (ResultReceiver) null));
        }
    }

    /* JADX INFO: renamed from: F */
    public void m22276F(Frag frag, String str, String str2, String str3, int i) {
        User userPa = CoreModule.c.e0.Pa(str);
        if (NullChecker.a(userPa)) {
            frag.startActivityForResult(MkWebViewAct.c2(frag.getContext(), "", f18858w + "&from=" + str2 + "&tabName=" + str3 + "&otherGender=" + (userPa.isFemale() ? "female" : "male"), true, true, (ResultReceiver) null), i);
        }
    }

    /* JADX INFO: renamed from: G */
    public void m22277G(Frag frag, int i, User user, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.equals(((DbObject) user).id, ((DbObject) CoreModule.K().me_()).id) ? "我" : user.name);
        sb.append("的标签");
        frag.startActivityForResult(MkWebViewAct.c2(frag.getContext(), "", f18855t + "&userID=" + ((DbObject) user).id + "&preview=" + z + "&title=" + URLEncoder.encode(sb.toString()) + "#/", true, true, (ResultReceiver) null), i);
    }

    /* JADX INFO: renamed from: H */
    public void m22278H(Frag frag, int i, User user, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.equals(((DbObject) user).id, ((DbObject) CoreModule.K().me_()).id) ? "我" : user.name);
        sb.append("的标签");
        frag.startActivityForResult(MkWebViewAct.c2(frag.getContext(), "", f18854s + "&userID=" + ((DbObject) user).id + "&preview=" + z + "&title=" + URLEncoder.encode(sb.toString()) + "#/", true, true, (ResultReceiver) null), i);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m22279I(Envelope envelope) {
        List<NewTags> list = envelope.data.getModuleData(CoreData.class).tags;
        m22284N(m22294i(list, list.size()));
        this.f18868j.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: J */
    public boolean m22280J(User user) {
        if (!NullChecker.a(user) || user.isMe() || !NullChecker.a(user.profile) || !NullChecker.a(user.profile.extensions) || !NullChecker.a(user.profile.extensions.interest) || vwb.J(user.profile.extensions.interest.tags)) {
            return false;
        }
        Iterator it = user.profile.extensions.interest.tags.iterator();
        while (it.hasNext()) {
            if (!CoreModule.c.e0.S6.containsKey((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: K */
    public final List<UserTagData> m22281K(List<NewTags> list) {
        if (vwb.J(list)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (NewTags newTags : list) {
            if (NullChecker.a(newTags)) {
                UserTagData userTagData = new UserTagData();
                userTagData.id = newTags.id;
                userTagData.title = newTags.name;
                userTagData.icon = newTags.icon;
                userTagData.subtitle = m22297l(newTags.localTagUserCounts);
                userTagData.highlighted = newTags.localIsCommonLabel;
                userTagData.categories = newTags.categories;
                userTagData.status = newTags.status;
                userTagData.gender = newTags.gender;
                userTagData.index = newTags.index;
                arrayList.add(userTagData);
            }
        }
        Collections.sort(arrayList, new C0805b());
        return arrayList;
    }

    /* JADX INFO: renamed from: L */
    public void m22282L() {
        f18853r = null;
    }

    /* JADX INFO: renamed from: M */
    public void m22283M(List<NewTags> list) {
        if (vwb.J(list)) {
            return;
        }
        List<NewTags> listM22294i = m22294i(list, list.size());
        if (vwb.J(listM22294i)) {
            return;
        }
        for (NewTags newTags : listM22294i) {
            CoreModule.c.e0.S6.put(newTags.id, newTags);
            CoreModule.c.e0.T6.put(newTags.id, newTags);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m22284N(List<NewTags> list) {
        if (vwb.J(list)) {
            return;
        }
        List<NewTags> listM22294i = m22294i(list, list.size());
        if (vwb.J(listM22294i)) {
            return;
        }
        for (NewTags newTags : listM22294i) {
            CoreModule.c.e0.S6.put(newTags.id, newTags);
        }
    }

    /* JADX INFO: renamed from: O */
    public NewTags m22285O(String str) {
        if (CoreModule.c.e0.S6.size() == 0 && upa.Z1() && !this.f18875q) {
            this.f18875q = true;
            m22302r();
        }
        return (NewTags) CoreModule.c.e0.S6.get(str);
    }

    /* JADX INFO: renamed from: P */
    public C0811h m22286P(List<String> list) {
        return m22287Q(list, false);
    }

    /* JADX INFO: renamed from: Q */
    public C0811h m22287Q(List<String> list, boolean z) {
        if (list == null || list.isEmpty()) {
            return new C0811h(false, null);
        }
        ArrayList<NewTags> arrayList = new ArrayList();
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                NewTags newTags = (NewTags) CoreModule.c.e0.S6.get(str);
                if (NullChecker.a(newTags)) {
                    newTags.localIsCommonLabel = false;
                    arrayList.add(newTags);
                }
            }
        }
        if (!vwb.J(arrayList) && z) {
            ArrayList arrayList2 = new ArrayList();
            for (NewTags newTags2 : arrayList) {
                if (newTags2.isPictureTag) {
                    arrayList2.add(newTags2);
                }
            }
            arrayList = arrayList2;
        }
        return new C0811h(true, arrayList);
    }

    /* JADX INFO: renamed from: R */
    public C0811h m22288R(List<OmsTagUserCounts> list) {
        if (list == null || list.isEmpty()) {
            return new C0811h(false, null);
        }
        List<NewTags> listM22302r = m22302r();
        if (vwb.J(listM22302r)) {
            return new C0811h(false, null);
        }
        HashMap map = new HashMap(((int) (((double) listM22302r.size()) / 0.75d)) + 1);
        for (NewTags newTags : listM22302r) {
            map.put(newTags.id, newTags);
        }
        HashMap map2 = new HashMap(((int) (((double) list.size()) / 0.75d)) + 1);
        for (OmsTagUserCounts omsTagUserCounts : list) {
            map2.put(omsTagUserCounts.id, omsTagUserCounts);
        }
        ArrayList arrayList = new ArrayList();
        for (OmsTagUserCounts omsTagUserCounts2 : list) {
            NewTags newTags2 = (NewTags) map.get(omsTagUserCounts2.id);
            OmsTagUserCounts omsTagUserCounts3 = (OmsTagUserCounts) map2.get(omsTagUserCounts2.id);
            if (NullChecker.a(newTags2) && NullChecker.a(omsTagUserCounts3)) {
                newTags2.localTagUserCounts = omsTagUserCounts3.count;
                arrayList.add(newTags2);
            }
        }
        return new C0811h(true, arrayList);
    }

    /* JADX INFO: renamed from: T */
    public void m22290T(List<String> list) {
        if (NullChecker.a(wn90.F().a)) {
            wn90.F().a.profile.extensions.interest.tags = list;
            if (vwb.J(list)) {
                wn90.F().a.profile.tags.clear();
                return;
            }
            C0811h c0811hM22286P = m22270o().m22286P(list);
            if (NullChecker.a(c0811hM22286P) && c0811hM22286P.f18892a) {
                List<NewTags> listM22315b = c0811hM22286P.m22315b();
                List<NewTags> listSubList = listM22315b.subList(0, Math.min(listM22315b.size(), 10));
                wn90.F().a.profile.tags = vwb.Q(listSubList, new w9j() { // from class: l.la40
                    public final Object call(Object obj) {
                        return sa40.m22269g((NewTags) obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public void m22291U(Act act, String str) {
        if (!NullChecker.a(act) || act.isFinishing()) {
            return;
        }
        new ush0(act, str).show();
    }

    /* JADX INFO: renamed from: V */
    public List<String> m22292V(List<String> list) {
        C0811h c0811hM22286P;
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() != 0 && (c0811hM22286P = m22286P(list)) != null && !c0811hM22286P.m22315b().isEmpty()) {
            for (NewTags newTags : c0811hM22286P.m22315b()) {
                if (NullChecker.a(newTags)) {
                    arrayList.add(newTags.name);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public void m22293h() {
        this.f18859a.clear();
        this.f18860b.clear();
        this.f18863e.clear();
    }

    /* JADX INFO: renamed from: i */
    public final List<NewTags> m22294i(List<NewTags> list, int i) {
        return m22295j(list, i, null, null);
    }

    /* JADX INFO: renamed from: j */
    public final List<NewTags> m22295j(List<NewTags> list, int i, C0812i c0812i, C0813j c0813j) {
        if (vwb.J(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i);
        if (c0812i == null) {
            c0812i = m22308x();
        }
        if (c0812i.f18894a) {
            List<TagCategories> listM22316a = c0812i.m22316a();
            HashMap map = new HashMap(((int) (((double) listM22316a.size()) / 0.75d)) + 1);
            for (TagCategories tagCategories : listM22316a) {
                map.put(tagCategories.id, tagCategories);
            }
            if (c0813j == null) {
                c0813j = m22309y();
            }
            HashMap map2 = new HashMap();
            if (c0813j.f18896a && !vwb.J(c0813j.f18897b)) {
                List<TagUserCounts> list2 = c0813j.f18897b;
                HashMap map3 = new HashMap(((int) (((double) list2.size()) / 0.75d)) + 1);
                for (TagUserCounts tagUserCounts : list2) {
                    map3.put(tagUserCounts.id, tagUserCounts);
                }
                map2 = map3;
            }
            for (int i2 = 0; i2 < list.size(); i2++) {
                NewTags newTags = list.get(i2);
                List list3 = newTags.categories;
                ArrayList arrayList2 = new ArrayList();
                if (!list3.isEmpty()) {
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        TagCategories tagCategories2 = (TagCategories) map.get((String) it.next());
                        if (NullChecker.a(tagCategories2)) {
                            arrayList2.add(tagCategories2);
                        } else {
                            TagCategories tagCategories3 = (TagCategories) vwb.r(listM22316a, new w9j() { // from class: l.ka40
                                public final Object call(Object obj) {
                                    return Boolean.valueOf(TextUtils.equals(((TagCategories) obj).name, "推荐"));
                                }
                            });
                            if (tagCategories3 != null) {
                                arrayList2.add(tagCategories3);
                            }
                        }
                    }
                    newTags.localTagCategories = arrayList2;
                }
                if (!c0813j.f18896a || vwb.J(c0813j.f18897b)) {
                    newTags.localTagUserCounts = 1L;
                } else {
                    TagUserCounts tagUserCounts2 = (TagUserCounts) map2.get(newTags.id);
                    if (NullChecker.a(tagUserCounts2)) {
                        newTags.localTagUserCounts = tagUserCounts2.count;
                    } else {
                        newTags.localTagUserCounts = 1L;
                    }
                }
                if (!vwb.J(newTags.localTagCategories)) {
                    arrayList.add(newTags);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public C0807d m22296k() {
        CoreData coreData;
        try {
            if (NullChecker.a(this.f18871m) && !vwb.J(this.f18871m.f18879a) && TextUtils.equals(this.f18871m.f18880b, (CharSequence) this.f18859a.get()) && TextUtils.equals(this.f18871m.f18881c, CoreModule.H().userId())) {
                return new C0807d(true, this.f18871m.f18879a);
            }
            this.f18871m = null;
            String str = (String) this.f18861c.get();
            if (!TextUtils.isEmpty(str) && (coreData = (CoreData) CoreData.JSON_ADAPTER.parse(str)) != null && !vwb.J(coreData.tags)) {
                C0806c c0806c = new C0806c();
                this.f18871m = c0806c;
                c0806c.f18880b = (String) this.f18859a.get();
                this.f18871m.f18881c = CoreModule.H().userId();
                C0806c c0806c2 = this.f18871m;
                List<NewTags> list = coreData.tags;
                c0806c2.f18879a = list;
                return new C0807d(true, list);
            }
            return new C0807d(false, null);
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: l */
    public String m22297l(long j) {
        if (j < 0) {
            j = 0;
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        double d = j;
        if (d < 1000.0d) {
            return j + "人已添加";
        }
        if (d < 10000.0d) {
            return decimalFormat.format(d / 1000.0d) + "k人已添加";
        }
        if (d < 1.0E8d) {
            return decimalFormat.format(d / 10000.0d) + "w人已添加";
        }
        return decimalFormat.format(d / 1.0E8d) + "亿人已添加";
    }

    /* JADX INFO: renamed from: m */
    public EditTagsData m22298m(Act act) {
        List<NewTags> listM22305u = m22305u();
        C0812i c0812iM22308x = m22308x();
        if (vwb.J(listM22305u)) {
            return null;
        }
        EditTagsData editTagsData = new EditTagsData();
        for (Map.Entry entry : CoreModule.c.e0.T6.entrySet()) {
            String str = (String) entry.getKey();
            Iterator<NewTags> it = listM22305u.iterator();
            do {
                if (!it.hasNext()) {
                    listM22305u.add(0, (NewTags) entry.getValue());
                    break;
                }
            } while (!TextUtils.equals(it.next().id, str));
        }
        editTagsData.tags = m22281K(listM22305u);
        editTagsData.tagCategories = c0812iM22308x.m22316a();
        editTagsData.picUrls = new ArrayList();
        editTagsData.selectedTags = new ArrayList();
        if (act instanceof TagChooseMkAct) {
            TagChooseMkAct tagChooseMkAct = (TagChooseMkAct) act;
            editTagsData.selectedTags = tagChooseMkAct.q2();
            editTagsData.picUrls = tagChooseMkAct.s2();
            editTagsData.urlTags = tagChooseMkAct.u2();
        }
        editTagsData.maximumSelectableCount = 200;
        editTagsData.minimumSelectableCount = 5;
        Objects.toString(editTagsData.picUrls);
        return editTagsData;
    }

    /* JADX INFO: renamed from: n */
    public EditTagsData m22299n(User user, boolean z) {
        List<NewTags> listM22302r = m22302r();
        C0812i c0812iM22308x = m22308x();
        if (vwb.J(listM22302r)) {
            return null;
        }
        EditTagsData editTagsData = new EditTagsData();
        for (Map.Entry entry : CoreModule.c.e0.T6.entrySet()) {
            String str = (String) entry.getKey();
            Iterator<NewTags> it = listM22302r.iterator();
            do {
                if (!it.hasNext()) {
                    listM22302r.add(0, (NewTags) entry.getValue());
                    break;
                }
            } while (!TextUtils.equals(it.next().id, str));
        }
        editTagsData.tags = m22281K(listM22302r);
        editTagsData.tagCategories = c0812iM22308x.m22316a();
        if (z) {
            editTagsData.selectedTags = m22310z();
        } else {
            editTagsData.selectedTags = user.profile.extensions.interest.tags;
        }
        if (!vwb.J(listM22302r)) {
            final ArrayList arrayListQ = vwb.Q(listM22302r, new w9j() { // from class: l.ma40
                public final Object call(Object obj) {
                    return ((NewTags) obj).id;
                }
            });
            if (!vwb.J(arrayListQ)) {
                List list = editTagsData.selectedTags;
                Objects.requireNonNull(arrayListQ);
                editTagsData.selectedTags = vwb.n(list, new w9j() { // from class: l.na40
                    public final Object call(Object obj) {
                        return Boolean.valueOf(arrayListQ.contains((String) obj));
                    }
                });
            }
        }
        editTagsData.maximumSelectableCount = 200;
        editTagsData.minimumSelectableCount = 5;
        return editTagsData;
    }

    /* JADX INFO: renamed from: p */
    public void m22300p(List<String> list) {
        if (vwb.J(list)) {
            return;
        }
        final String str = "/oms/me/tags/batch?ids=" + vwb.U(list, ",");
        CoreModule.c.scheduled("/oms/me/tags/batch/" + ((DbObject) CoreModule.K().me_()).id, 0, new v9j() { // from class: l.oa40
            public final Object call() {
                return ia20.e(new v9j() { // from class: l.ra40
                    public final Object call() {
                        return xh5.network.auth().q(xh5.i(str)).f().b();
                    }
                });
            }
        }).compose(mkd0.C()).subscribe(mkd0.H(new e30() { // from class: l.pa40
            public final void call(Object obj) {
                this.f17167a.m22279I((Envelope) obj);
            }
        }, new e30() { // from class: l.qa40
            public final void call(Object obj) {
                sa40.m22267e((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    public C0807d m22301q() {
        CoreData coreData;
        try {
            if (NullChecker.a(this.f18872n) && !vwb.J(this.f18872n.f18879a) && TextUtils.equals(this.f18872n.f18880b, (CharSequence) this.f18860b.get()) && TextUtils.equals(this.f18872n.f18881c, CoreModule.H().userId())) {
                return new C0807d(true, this.f18872n.f18879a);
            }
            this.f18872n = null;
            String str = (String) this.f18862d.get();
            if (!TextUtils.isEmpty(str) && (coreData = (CoreData) CoreData.JSON_ADAPTER.parse(str)) != null && !vwb.J(coreData.pictureTags)) {
                C0806c c0806c = new C0806c();
                this.f18872n = c0806c;
                c0806c.f18880b = (String) this.f18860b.get();
                this.f18872n.f18881c = CoreModule.H().userId();
                C0806c c0806c2 = this.f18872n;
                List<NewTags> list = coreData.pictureTags;
                c0806c2.f18879a = list;
                return new C0807d(true, list);
            }
            return new C0807d(false, null);
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: r */
    public List<NewTags> m22302r() {
        return m22303s(true);
    }

    /* JADX INFO: renamed from: s */
    public List<NewTags> m22303s(boolean z) {
        try {
            if (NullChecker.a(this.f18870l) && !vwb.J(this.f18870l.f18890a) && TextUtils.equals(this.f18870l.f18891b, CoreModule.H().userId())) {
                return this.f18870l.f18890a;
            }
            this.f18870l = null;
            List<NewTags> arrayList = new ArrayList<>();
            HashMap map = new HashMap();
            for (NewTags newTags : m22296k().m22313a()) {
                map.put(newTags.id, newTags);
            }
            if (upa.L3()) {
                for (NewTags newTags2 : m22301q().m22313a()) {
                    NewTags newTags3 = (NewTags) map.get(newTags2.id);
                    if (newTags3 != null) {
                        newTags3.isPictureTag = true;
                        newTags3.status = newTags2.status;
                        newTags3.index = newTags2.index;
                        map.put(newTags2.id, newTags3);
                    } else {
                        newTags2.isPictureTag = true;
                        map.put(newTags2.id, newTags2);
                    }
                }
            }
            if (map.size() > 0) {
                ArrayList arrayList2 = new ArrayList(map.size());
                Iterator it = map.keySet().iterator();
                while (it.hasNext()) {
                    arrayList2.add((NewTags) map.get((String) it.next()));
                }
                arrayList = m22294i(arrayList2, arrayList2.size());
            }
            if (upa.Z1() && !vwb.J(arrayList)) {
                for (NewTags newTags4 : arrayList) {
                    CoreModule.c.e0.S6.put(newTags4.id, newTags4);
                }
            }
            if (!vwb.J(arrayList)) {
                C0810g c0810g = new C0810g();
                this.f18870l = c0810g;
                c0810g.f18890a = arrayList;
                c0810g.f18891b = CoreModule.H().userId();
                return arrayList;
            }
            return new ArrayList();
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: t */
    public List<NewTags> m22304t(User user) {
        Profile profile;
        Extensions extensions;
        Interest interest;
        if (user == null || (profile = user.profile) == null || (extensions = profile.extensions) == null || (interest = extensions.interest) == null || vwb.J(interest.tags)) {
            return null;
        }
        List list = user.profile.extensions.interest.tags;
        ArrayList arrayList = new ArrayList();
        Iterator it = user.pictures.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((Media) it.next()).tags);
        }
        return m22286P(vwb.n(list, new C0804a(arrayList))).f18893b;
    }

    /* JADX INFO: renamed from: u */
    public List<NewTags> m22305u() {
        List<NewTags> listM22303s = m22303s(true);
        ArrayList arrayList = new ArrayList();
        for (NewTags newTags : listM22303s) {
            if (newTags.isPictureTag) {
                arrayList.add(newTags);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: v */
    public List<NewTags> m22306v(User user) {
        Profile profile;
        Extensions extensions;
        Interest interest;
        List<NewTags> listM22303s = m22303s(true);
        HashMap map = new HashMap();
        for (NewTags newTags : listM22303s) {
            if (newTags.isPictureTag) {
                map.put(newTags.id, newTags);
            }
        }
        if (user == null || (profile = user.profile) == null || (extensions = profile.extensions) == null || (interest = extensions.interest) == null || vwb.J(interest.tags)) {
            return null;
        }
        List<String> list = user.profile.extensions.interest.tags;
        HashMap map2 = new HashMap();
        for (String str : list) {
            if (map.containsKey(str)) {
                map2.put(str, (NewTags) map.get(str));
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Media media : user.pictures) {
            if (!vwb.J(media.tags)) {
                arrayList.addAll(media.tags);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            map2.remove((String) it.next());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = map2.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList2.add((NewTags) ((Map.Entry) it2.next()).getValue());
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: w */
    public UserTagsData m22307w(User user) {
        UserTagsData userTagsData = new UserTagsData();
        userTagsData.tags = m22281K(m22304t(user));
        userTagsData.tagCategories = m22308x().m22316a();
        userTagsData.clickable = upa.r2();
        return userTagsData;
    }

    /* JADX INFO: renamed from: x */
    public C0812i m22308x() {
        CoreData coreData;
        try {
            if (NullChecker.a(this.f18873o) && !vwb.J(this.f18873o.f18884a) && TextUtils.equals(this.f18873o.f18885b, (CharSequence) this.f18863e.get()) && TextUtils.equals(this.f18873o.f18886c, CoreModule.H().userId())) {
                return new C0812i(true, this.f18873o.f18884a);
            }
            this.f18873o = null;
            String str = (String) this.f18864f.get();
            if (!TextUtils.isEmpty(str) && (coreData = (CoreData) CoreData.JSON_ADAPTER.parse(str)) != null && !vwb.J(coreData.tagCategories)) {
                C0808e c0808e = new C0808e();
                this.f18873o = c0808e;
                c0808e.f18885b = (String) this.f18863e.get();
                this.f18873o.f18886c = CoreModule.H().userId();
                C0808e c0808e2 = this.f18873o;
                List<TagCategories> list = coreData.tagCategories;
                c0808e2.f18884a = list;
                return new C0812i(true, list);
            }
            return new C0812i(false, null);
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: y */
    public C0813j m22309y() {
        CoreData coreData;
        try {
            if (NullChecker.a(this.f18874p) && !vwb.J(this.f18874p.f18887a) && TextUtils.equals(this.f18874p.f18888b, (CharSequence) this.f18859a.get()) && TextUtils.equals(this.f18874p.f18889c, CoreModule.H().userId())) {
                return new C0813j(true, this.f18874p.f18887a);
            }
            this.f18874p = null;
            String str = (String) this.f18865g.get();
            if (!TextUtils.isEmpty(str) && (coreData = (CoreData) CoreData.JSON_ADAPTER.parse(str)) != null && !coreData.tagUserCounts.isEmpty()) {
                C0809f c0809f = new C0809f();
                this.f18874p = c0809f;
                c0809f.f18888b = (String) this.f18859a.get();
                this.f18874p.f18889c = CoreModule.H().userId();
                C0809f c0809f2 = this.f18874p;
                List<TagUserCounts> list = coreData.tagUserCounts;
                c0809f2.f18887a = list;
                return new C0813j(true, list);
            }
            return new C0813j(false, null);
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: z */
    public List<String> m22310z() {
        return !NullChecker.a(wn90.F().a) ? new ArrayList() : wn90.F().a.profile.extensions.interest.tags;
    }

    /* JADX INFO: renamed from: S */
    public void m22289S() {
    }
}
