package p149l;

import android.content.Context;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.EditTagsData;
import com.p046p1.mobile.putong.core.data.NewTags;
import com.p046p1.mobile.putong.core.data.TagCategories;
import com.p046p1.mobile.putong.core.data.TagUserCounts;
import com.p046p1.mobile.putong.core.data.UserTagData;
import com.p046p1.mobile.putong.core.data.UserTagsData;
import com.p046p1.mobile.putong.core.newui.profile.TagChooseMkAct;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Extensions;
import com.p046p1.mobile.putong.data.Interest;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OmsTagUserCounts;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.Tag;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
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
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes4.dex */
public class sa40 {

    /* JADX INFO: renamed from: r */
    public static volatile sa40 f163260r;

    /* JADX INFO: renamed from: s */
    public static final String f163261s;

    /* JADX INFO: renamed from: t */
    public static final String f163262t;

    /* JADX INFO: renamed from: u */
    public static final String f163263u;

    /* JADX INFO: renamed from: v */
    public static final String f163264v;

    /* JADX INFO: renamed from: w */
    public static final String f163265w;

    /* JADX INFO: renamed from: l */
    public C19883g f163277l;

    /* JADX INFO: renamed from: m */
    public C19879c f163278m;

    /* JADX INFO: renamed from: n */
    public C19879c f163279n;

    /* JADX INFO: renamed from: o */
    public C19881e f163280o;

    /* JADX INFO: renamed from: p */
    public C19882f f163281p;

    /* JADX INFO: renamed from: a */
    public uqd0 f163266a = new uqd0("tag_md5" + CoreModule.m29931H().userId(), "");

    /* JADX INFO: renamed from: b */
    public uqd0 f163267b = new uqd0("tag_picture_strategy_md5" + CoreModule.m29931H().userId(), "");

    /* JADX INFO: renamed from: c */
    public uqd0 f163268c = new uqd0("core_oms_me_tags_tag_content_" + CoreModule.m29931H().userId(), "");

    /* JADX INFO: renamed from: d */
    public uqd0 f163269d = new uqd0("core_oms_me_tags_tag_content_pic_" + CoreModule.m29931H().userId(), "");

    /* JADX INFO: renamed from: e */
    public uqd0 f163270e = new uqd0("category_md5" + CoreModule.m29931H().userId(), "");

    /* JADX INFO: renamed from: f */
    public uqd0 f163271f = new uqd0("core_oms_me_category_content_" + CoreModule.m29931H().userId(), "");

    /* JADX INFO: renamed from: g */
    public uqd0 f163272g = new uqd0("core_oms_me_tags_users_number_" + CoreModule.m29931H().userId(), "");

    /* JADX INFO: renamed from: h */
    public tpd0 f163273h = new tpd0("core_close_tag_guide_number_" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: i */
    public hpd0 f163274i = new hpd0("core_tag_guide_show_" + CoreModule.m29931H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: j */
    public C22393b<roj0> f163275j = C22393b.m221521b();

    /* JADX INFO: renamed from: k */
    public C22392a<roj0> f163276k = C22392a.m221512b();

    /* JADX INFO: renamed from: q */
    public boolean f163282q = false;

    /* JADX INFO: renamed from: l.sa40$a */
    public class C19877a implements w9j<String, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f163283a;

        public C19877a(List list) {
            this.f163283a = list;
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(String str) {
            return Boolean.valueOf(!this.f163283a.contains(str));
        }
    }

    /* JADX INFO: renamed from: l.sa40$b */
    public class C19878b implements Comparator<UserTagData> {
        public C19878b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(UserTagData userTagData, UserTagData userTagData2) {
            return userTagData.index - userTagData2.index;
        }
    }

    /* JADX INFO: renamed from: l.sa40$c */
    public static class C19879c {

        /* JADX INFO: renamed from: a */
        public List<NewTags> f163286a;

        /* JADX INFO: renamed from: b */
        public String f163287b;

        /* JADX INFO: renamed from: c */
        public String f163288c;
    }

    /* JADX INFO: renamed from: l.sa40$d */
    public static class C19880d {

        /* JADX INFO: renamed from: a */
        public boolean f163289a;

        /* JADX INFO: renamed from: b */
        public List<NewTags> f163290b;

        public C19880d(boolean z, List<NewTags> list) {
            this.f163289a = z;
            this.f163290b = list;
        }

        /* JADX INFO: renamed from: a */
        public List<NewTags> m182845a() {
            return this.f163289a ? this.f163290b : new ArrayList();
        }
    }

    /* JADX INFO: renamed from: l.sa40$e */
    public static class C19881e {

        /* JADX INFO: renamed from: a */
        public List<TagCategories> f163291a;

        /* JADX INFO: renamed from: b */
        public String f163292b;

        /* JADX INFO: renamed from: c */
        public String f163293c;
    }

    /* JADX INFO: renamed from: l.sa40$f */
    public static class C19882f {

        /* JADX INFO: renamed from: a */
        public List<TagUserCounts> f163294a;

        /* JADX INFO: renamed from: b */
        public String f163295b;

        /* JADX INFO: renamed from: c */
        public String f163296c;
    }

    /* JADX INFO: renamed from: l.sa40$g */
    public static class C19883g {

        /* JADX INFO: renamed from: a */
        public List<NewTags> f163297a;

        /* JADX INFO: renamed from: b */
        public String f163298b;
    }

    /* JADX INFO: renamed from: l.sa40$h */
    public static class C19884h {

        /* JADX INFO: renamed from: a */
        public boolean f163299a;

        /* JADX INFO: renamed from: b */
        public List<NewTags> f163300b;

        public C19884h(boolean z, List<NewTags> list) {
            this.f163299a = z;
            this.f163300b = list;
        }

        /* JADX INFO: renamed from: b */
        public List<NewTags> m182847b() {
            return this.f163299a ? this.f163300b : new ArrayList();
        }
    }

    /* JADX INFO: renamed from: l.sa40$i */
    public static class C19885i {

        /* JADX INFO: renamed from: a */
        public boolean f163301a;

        /* JADX INFO: renamed from: b */
        public List<TagCategories> f163302b;

        public C19885i(boolean z, List<TagCategories> list) {
            this.f163301a = z;
            this.f163302b = list;
        }

        /* JADX INFO: renamed from: a */
        public List<TagCategories> m182848a() {
            return this.f163301a ? this.f163302b : new ArrayList();
        }
    }

    /* JADX INFO: renamed from: l.sa40$j */
    public static class C19886j {

        /* JADX INFO: renamed from: a */
        public boolean f163303a;

        /* JADX INFO: renamed from: b */
        public List<TagUserCounts> f163304b;

        public C19886j(boolean z, List<TagUserCounts> list) {
            this.f163303a = z;
            this.f163304b = list;
        }
    }

    static {
        f163261s = (juk.m143323e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/dating-optimization-tags/index.html?speed=true&_bid=1004745&hideNavigationBar=1&showAddTagBtn=false");
        f163262t = (juk.m143323e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/label-optimization-new/index.html?speed=true&_bid=1002880&hideNavigationBar=1");
        f163263u = (juk.m143323e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/label-optimization-new/index.html?speed=true&_bid=1002880&hideNavigationBar=1");
        f163264v = (juk.m143323e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/label-optimization-new/index.html?speed=true&_bid=1002880&hideNavigationBar=1");
        f163265w = (juk.m143323e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/heart-beat/index.html?speed=true&_bid=1002785&hideNotch=1&hideNavigationBar=1&_ui=128");
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m182799e(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Tag m182801g(NewTags newTags) {
        return new Tag("personality", newTags.name);
    }

    /* JADX INFO: renamed from: o */
    public static sa40 m182802o() {
        if (f163260r == null) {
            synchronized (sa40.class) {
                try {
                    if (f163260r == null) {
                        f163260r = new sa40();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f163260r;
    }

    /* JADX INFO: renamed from: A */
    public UserTagsData m182803A(Act act, User user, boolean z) {
        return m182804B(act, user, z, false);
    }

    /* JADX INFO: renamed from: B */
    public UserTagsData m182804B(Act act, User user, boolean z, boolean z2) {
        Profile profile;
        Extensions extensions;
        Interest interest;
        if (user != null && (profile = user.profile) != null && (extensions = profile.extensions) != null && (interest = extensions.interest) != null && ((z || !vwb.m200296J(interest.tags)) && (!user.isMe() || !z || !vwb.m200296J(m182842z())))) {
            if (user.isMe()) {
                C19884h c19884hM182819Q = m182819Q(z ? m182842z() : user.profile.extensions.interest.tags, z2);
                C19885i c19885iM182840x = m182840x();
                if (!c19884hM182819Q.f163299a || !c19885iM182840x.f163301a) {
                    return null;
                }
                UserTagsData userTagsData = new UserTagsData();
                userTagsData.tags = m182813K(c19884hM182819Q.m182847b());
                userTagsData.tagCategories = c19885iM182840x.m182848a();
                userTagsData.clickable = upa.m194810r2();
                return userTagsData;
            }
            ArrayList<String> arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            List<String> list = user.profile.extensions.interest.tags;
            List<String> list2 = CoreModule.m29932K().me_().profile.extensions.interest.tags;
            if (!vwb.m200296J(list)) {
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
                if (CoreModule.f17545c.f19639e0.f149268S6.containsKey(str2)) {
                    arrayList4.add(str2);
                } else {
                    arrayList5.add(str2);
                }
            }
            m182832p(arrayList5);
            C19884h c19884hM182819Q2 = m182819Q(arrayList4, z2);
            C19885i c19885iM182840x2 = m182840x();
            if (c19884hM182819Q2 != null && c19884hM182819Q2.f163299a && c19885iM182840x2.f163301a) {
                List<NewTags> listM182847b = c19884hM182819Q2.m182847b();
                if (!vwb.m200296J(arrayList2)) {
                    for (NewTags newTags : listM182847b) {
                        if (arrayList2.contains(newTags.f20457id)) {
                            newTags.localIsCommonLabel = true;
                        } else {
                            newTags.localIsCommonLabel = false;
                        }
                    }
                }
                UserTagsData userTagsData2 = new UserTagsData();
                userTagsData2.tags = m182813K(listM182847b);
                userTagsData2.tagCategories = c19885iM182840x2.m182848a();
                userTagsData2.clickable = upa.m194810r2();
                return userTagsData2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: C */
    public void m182805C(Act act, String str, boolean z) {
        act.startActivity(MkWebViewAct.m80238c2(act, "", f163263u + "&preview=" + z + "&showFrom=" + str + "#/tagEditing#/", true, true, null));
    }

    /* JADX INFO: renamed from: D */
    public void m182806D(Frag frag, int i, String str, boolean z) {
        frag.startActivityForResult(MkWebViewAct.m80238c2(frag.getContext(), "", f163263u + "&preview=" + z + "&showFrom=" + str + "#/tagEditing#/", true, true, null), i);
    }

    /* JADX INFO: renamed from: E */
    public void m182807E(Context context, String str, String str2, String str3) {
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(str);
        if (NullChecker.m81303a(userM169430Pa)) {
            context.startActivity(MkWebViewAct.m80238c2(context, "", f163265w + "&from=" + str2 + "&tabName=" + str3 + "&otherGender=" + (userM169430Pa.isFemale() ? "female" : "male"), true, true, null));
        }
    }

    /* JADX INFO: renamed from: F */
    public void m182808F(Frag frag, String str, String str2, String str3, int i) {
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(str);
        if (NullChecker.m81303a(userM169430Pa)) {
            frag.startActivityForResult(MkWebViewAct.m80238c2(frag.getContext(), "", f163265w + "&from=" + str2 + "&tabName=" + str3 + "&otherGender=" + (userM169430Pa.isFemale() ? "female" : "male"), true, true, null), i);
        }
    }

    /* JADX INFO: renamed from: G */
    public void m182809G(Frag frag, int i, User user, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.equals(user.f56011id, CoreModule.m29932K().me_().f56011id) ? "我" : user.name);
        sb.append("的标签");
        frag.startActivityForResult(MkWebViewAct.m80238c2(frag.getContext(), "", f163262t + "&userID=" + user.f56011id + "&preview=" + z + "&title=" + URLEncoder.encode(sb.toString()) + "#/", true, true, null), i);
    }

    /* JADX INFO: renamed from: H */
    public void m182810H(Frag frag, int i, User user, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.equals(user.f56011id, CoreModule.m29932K().me_().f56011id) ? "我" : user.name);
        sb.append("的标签");
        frag.startActivityForResult(MkWebViewAct.m80238c2(frag.getContext(), "", f163261s + "&userID=" + user.f56011id + "&preview=" + z + "&title=" + URLEncoder.encode(sb.toString()) + "#/", true, true, null), i);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m182811I(Envelope envelope) {
        List<NewTags> list = ((CoreData) envelope.data.getModuleData(CoreData.class)).tags;
        m182816N(m182826i(list, list.size()));
        this.f163275j.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: J */
    public boolean m182812J(User user) {
        if (!NullChecker.m81303a(user) || user.isMe() || !NullChecker.m81303a(user.profile) || !NullChecker.m81303a(user.profile.extensions) || !NullChecker.m81303a(user.profile.extensions.interest) || vwb.m200296J(user.profile.extensions.interest.tags)) {
            return false;
        }
        Iterator<String> it = user.profile.extensions.interest.tags.iterator();
        while (it.hasNext()) {
            if (!CoreModule.f17545c.f19639e0.f149268S6.containsKey(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: K */
    public final List<UserTagData> m182813K(List<NewTags> list) {
        if (vwb.m200296J(list)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (NewTags newTags : list) {
            if (NullChecker.m81303a(newTags)) {
                UserTagData userTagData = new UserTagData();
                userTagData.f20527id = newTags.f20457id;
                userTagData.title = newTags.name;
                userTagData.icon = newTags.icon;
                userTagData.subtitle = m182829l(newTags.localTagUserCounts);
                userTagData.highlighted = newTags.localIsCommonLabel;
                userTagData.categories = newTags.categories;
                userTagData.status = newTags.status;
                userTagData.gender = newTags.gender;
                userTagData.index = newTags.index;
                arrayList.add(userTagData);
            }
        }
        Collections.sort(arrayList, new C19878b());
        return arrayList;
    }

    /* JADX INFO: renamed from: L */
    public void m182814L() {
        f163260r = null;
    }

    /* JADX INFO: renamed from: M */
    public void m182815M(List<NewTags> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        List<NewTags> listM182826i = m182826i(list, list.size());
        if (vwb.m200296J(listM182826i)) {
            return;
        }
        for (NewTags newTags : listM182826i) {
            CoreModule.f17545c.f19639e0.f149268S6.put(newTags.f20457id, newTags);
            CoreModule.f17545c.f19639e0.f149276T6.put(newTags.f20457id, newTags);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m182816N(List<NewTags> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        List<NewTags> listM182826i = m182826i(list, list.size());
        if (vwb.m200296J(listM182826i)) {
            return;
        }
        for (NewTags newTags : listM182826i) {
            CoreModule.f17545c.f19639e0.f149268S6.put(newTags.f20457id, newTags);
        }
    }

    /* JADX INFO: renamed from: O */
    public NewTags m182817O(String str) {
        if (CoreModule.f17545c.f19639e0.f149268S6.size() == 0 && upa.m194722Z1() && !this.f163282q) {
            this.f163282q = true;
            m182834r();
        }
        return CoreModule.f17545c.f19639e0.f149268S6.get(str);
    }

    /* JADX INFO: renamed from: P */
    public C19884h m182818P(List<String> list) {
        return m182819Q(list, false);
    }

    /* JADX INFO: renamed from: Q */
    public C19884h m182819Q(List<String> list, boolean z) {
        if (list == null || list.isEmpty()) {
            return new C19884h(false, null);
        }
        ArrayList<NewTags> arrayList = new ArrayList();
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                NewTags newTags = CoreModule.f17545c.f19639e0.f149268S6.get(str);
                if (NullChecker.m81303a(newTags)) {
                    newTags.localIsCommonLabel = false;
                    arrayList.add(newTags);
                }
            }
        }
        if (!vwb.m200296J(arrayList) && z) {
            ArrayList arrayList2 = new ArrayList();
            for (NewTags newTags2 : arrayList) {
                if (newTags2.isPictureTag) {
                    arrayList2.add(newTags2);
                }
            }
            arrayList = arrayList2;
        }
        return new C19884h(true, arrayList);
    }

    /* JADX INFO: renamed from: R */
    public C19884h m182820R(List<OmsTagUserCounts> list) {
        if (list == null || list.isEmpty()) {
            return new C19884h(false, null);
        }
        List<NewTags> listM182834r = m182834r();
        if (vwb.m200296J(listM182834r)) {
            return new C19884h(false, null);
        }
        HashMap map = new HashMap(((int) (((double) listM182834r.size()) / 0.75d)) + 1);
        for (NewTags newTags : listM182834r) {
            map.put(newTags.f20457id, newTags);
        }
        HashMap map2 = new HashMap(((int) (((double) list.size()) / 0.75d)) + 1);
        for (OmsTagUserCounts omsTagUserCounts : list) {
            map2.put(omsTagUserCounts.f38802id, omsTagUserCounts);
        }
        ArrayList arrayList = new ArrayList();
        for (OmsTagUserCounts omsTagUserCounts2 : list) {
            NewTags newTags2 = (NewTags) map.get(omsTagUserCounts2.f38802id);
            OmsTagUserCounts omsTagUserCounts3 = (OmsTagUserCounts) map2.get(omsTagUserCounts2.f38802id);
            if (NullChecker.m81303a(newTags2) && NullChecker.m81303a(omsTagUserCounts3)) {
                newTags2.localTagUserCounts = omsTagUserCounts3.count;
                arrayList.add(newTags2);
            }
        }
        return new C19884h(true, arrayList);
    }

    /* JADX INFO: renamed from: T */
    public void m182822T(List<String> list) {
        if (NullChecker.m81303a(wn90.m204602F().f187269a)) {
            wn90.m204602F().f187269a.profile.extensions.interest.tags = list;
            if (vwb.m200296J(list)) {
                wn90.m204602F().f187269a.profile.tags.clear();
                return;
            }
            C19884h c19884hM182818P = m182802o().m182818P(list);
            if (NullChecker.m81303a(c19884hM182818P) && c19884hM182818P.f163299a) {
                List<NewTags> listM182847b = c19884hM182818P.m182847b();
                List<NewTags> listSubList = listM182847b.subList(0, Math.min(listM182847b.size(), 10));
                wn90.m204602F().f187269a.profile.tags = vwb.m200303Q(listSubList, new w9j() { // from class: l.la40
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return sa40.m182801g((NewTags) obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public void m182823U(Act act, String str) {
        if (!NullChecker.m81303a(act) || act.isFinishing()) {
            return;
        }
        new ush0(act, str).show();
    }

    /* JADX INFO: renamed from: V */
    public List<String> m182824V(List<String> list) {
        C19884h c19884hM182818P;
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() != 0 && (c19884hM182818P = m182818P(list)) != null && !c19884hM182818P.m182847b().isEmpty()) {
            for (NewTags newTags : c19884hM182818P.m182847b()) {
                if (NullChecker.m81303a(newTags)) {
                    arrayList.add(newTags.name);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public void m182825h() {
        this.f163266a.clear();
        this.f163267b.clear();
        this.f163270e.clear();
    }

    /* JADX INFO: renamed from: i */
    public final List<NewTags> m182826i(List<NewTags> list, int i) {
        return m182827j(list, i, null, null);
    }

    /* JADX INFO: renamed from: j */
    public final List<NewTags> m182827j(List<NewTags> list, int i, C19885i c19885i, C19886j c19886j) {
        if (vwb.m200296J(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i);
        if (c19885i == null) {
            c19885i = m182840x();
        }
        if (c19885i.f163301a) {
            List<TagCategories> listM182848a = c19885i.m182848a();
            HashMap map = new HashMap(((int) (((double) listM182848a.size()) / 0.75d)) + 1);
            for (TagCategories tagCategories : listM182848a) {
                map.put(tagCategories.f20514id, tagCategories);
            }
            if (c19886j == null) {
                c19886j = m182841y();
            }
            HashMap map2 = new HashMap();
            if (c19886j.f163303a && !vwb.m200296J(c19886j.f163304b)) {
                List<TagUserCounts> list2 = c19886j.f163304b;
                HashMap map3 = new HashMap(((int) (((double) list2.size()) / 0.75d)) + 1);
                for (TagUserCounts tagUserCounts : list2) {
                    map3.put(tagUserCounts.f20515id, tagUserCounts);
                }
                map2 = map3;
            }
            for (int i2 = 0; i2 < list.size(); i2++) {
                NewTags newTags = list.get(i2);
                List<String> list3 = newTags.categories;
                ArrayList arrayList2 = new ArrayList();
                if (!list3.isEmpty()) {
                    Iterator<String> it = list3.iterator();
                    while (it.hasNext()) {
                        TagCategories tagCategories2 = (TagCategories) map.get(it.next());
                        if (NullChecker.m81303a(tagCategories2)) {
                            arrayList2.add(tagCategories2);
                        } else {
                            TagCategories tagCategories3 = (TagCategories) vwb.m200346r(listM182848a, new w9j() { // from class: l.ka40
                                @Override // p149l.w9j
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
                if (!c19886j.f163303a || vwb.m200296J(c19886j.f163304b)) {
                    newTags.localTagUserCounts = 1L;
                } else {
                    TagUserCounts tagUserCounts2 = (TagUserCounts) map2.get(newTags.f20457id);
                    if (NullChecker.m81303a(tagUserCounts2)) {
                        newTags.localTagUserCounts = tagUserCounts2.count;
                    } else {
                        newTags.localTagUserCounts = 1L;
                    }
                }
                if (!vwb.m200296J(newTags.localTagCategories)) {
                    arrayList.add(newTags);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public C19880d m182828k() {
        CoreData coreData;
        try {
            if (NullChecker.m81303a(this.f163278m) && !vwb.m200296J(this.f163278m.f163286a) && TextUtils.equals(this.f163278m.f163287b, this.f163266a.get()) && TextUtils.equals(this.f163278m.f163288c, CoreModule.m29931H().userId())) {
                return new C19880d(true, this.f163278m.f163286a);
            }
            this.f163278m = null;
            String str = this.f163268c.get();
            if (!TextUtils.isEmpty(str) && (coreData = CoreData.JSON_ADAPTER.parse(str)) != null && !vwb.m200296J(coreData.tags)) {
                C19879c c19879c = new C19879c();
                this.f163278m = c19879c;
                c19879c.f163287b = this.f163266a.get();
                this.f163278m.f163288c = CoreModule.m29931H().userId();
                C19879c c19879c2 = this.f163278m;
                List<NewTags> list = coreData.tags;
                c19879c2.f163286a = list;
                return new C19880d(true, list);
            }
            return new C19880d(false, null);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: l */
    public String m182829l(long j) {
        if (j < 0) {
            j = 0;
        }
        DecimalFormat decimalFormat = new DecimalFormat(IdManager.DEFAULT_VERSION_NAME);
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
    public EditTagsData m182830m(Act act) {
        List<NewTags> listM182837u = m182837u();
        C19885i c19885iM182840x = m182840x();
        if (vwb.m200296J(listM182837u)) {
            return null;
        }
        EditTagsData editTagsData = new EditTagsData();
        for (Map.Entry<String, NewTags> entry : CoreModule.f17545c.f19639e0.f149276T6.entrySet()) {
            String key = entry.getKey();
            Iterator<NewTags> it = listM182837u.iterator();
            do {
                if (!it.hasNext()) {
                    listM182837u.add(0, entry.getValue());
                    break;
                }
            } while (!TextUtils.equals(it.next().f20457id, key));
        }
        editTagsData.tags = m182813K(listM182837u);
        editTagsData.tagCategories = c19885iM182840x.m182848a();
        editTagsData.picUrls = new ArrayList();
        editTagsData.selectedTags = new ArrayList();
        if (act instanceof TagChooseMkAct) {
            TagChooseMkAct tagChooseMkAct = (TagChooseMkAct) act;
            editTagsData.selectedTags = tagChooseMkAct.m43224q2();
            editTagsData.picUrls = tagChooseMkAct.m43225s2();
            editTagsData.urlTags = tagChooseMkAct.m43226u2();
        }
        editTagsData.maximumSelectableCount = 200;
        editTagsData.minimumSelectableCount = 5;
        Objects.toString(editTagsData.picUrls);
        return editTagsData;
    }

    /* JADX INFO: renamed from: n */
    public EditTagsData m182831n(User user, boolean z) {
        List<NewTags> listM182834r = m182834r();
        C19885i c19885iM182840x = m182840x();
        if (vwb.m200296J(listM182834r)) {
            return null;
        }
        EditTagsData editTagsData = new EditTagsData();
        for (Map.Entry<String, NewTags> entry : CoreModule.f17545c.f19639e0.f149276T6.entrySet()) {
            String key = entry.getKey();
            Iterator<NewTags> it = listM182834r.iterator();
            do {
                if (!it.hasNext()) {
                    listM182834r.add(0, entry.getValue());
                    break;
                }
            } while (!TextUtils.equals(it.next().f20457id, key));
        }
        editTagsData.tags = m182813K(listM182834r);
        editTagsData.tagCategories = c19885iM182840x.m182848a();
        if (z) {
            editTagsData.selectedTags = m182842z();
        } else {
            editTagsData.selectedTags = user.profile.extensions.interest.tags;
        }
        if (!vwb.m200296J(listM182834r)) {
            final ArrayList arrayListM200303Q = vwb.m200303Q(listM182834r, new w9j() { // from class: l.ma40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((NewTags) obj).f20457id;
                }
            });
            if (!vwb.m200296J(arrayListM200303Q)) {
                List<String> list = editTagsData.selectedTags;
                Objects.requireNonNull(arrayListM200303Q);
                editTagsData.selectedTags = vwb.m200339n(list, new w9j() { // from class: l.na40
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(arrayListM200303Q.contains((String) obj));
                    }
                });
            }
        }
        editTagsData.maximumSelectableCount = 200;
        editTagsData.minimumSelectableCount = 5;
        return editTagsData;
    }

    /* JADX INFO: renamed from: p */
    public void m182832p(List<String> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        final String str = "/oms/me/tags/batch?ids=" + vwb.m200307U(list, Constants.SEPARATOR_COMMA);
        CoreModule.f17545c.scheduled("/oms/me/tags/batch/" + CoreModule.m29932K().me_().f56011id, 0, new v9j() { // from class: l.oa40
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.ra40
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return xh5.network.auth().m185898q(xh5.m208761i(str)).m185887f().m185883b();
                    }
                });
            }
        }).compose(mkd0.m154951C()).subscribe(mkd0.m154956H(new e30() { // from class: l.pa40
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147945a.m182811I((Envelope) obj);
            }
        }, new e30() { // from class: l.qa40
            @Override // p149l.e30
            public final void call(Object obj) {
                sa40.m182799e((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    public C19880d m182833q() {
        CoreData coreData;
        try {
            if (NullChecker.m81303a(this.f163279n) && !vwb.m200296J(this.f163279n.f163286a) && TextUtils.equals(this.f163279n.f163287b, this.f163267b.get()) && TextUtils.equals(this.f163279n.f163288c, CoreModule.m29931H().userId())) {
                return new C19880d(true, this.f163279n.f163286a);
            }
            this.f163279n = null;
            String str = this.f163269d.get();
            if (!TextUtils.isEmpty(str) && (coreData = CoreData.JSON_ADAPTER.parse(str)) != null && !vwb.m200296J(coreData.pictureTags)) {
                C19879c c19879c = new C19879c();
                this.f163279n = c19879c;
                c19879c.f163287b = this.f163267b.get();
                this.f163279n.f163288c = CoreModule.m29931H().userId();
                C19879c c19879c2 = this.f163279n;
                List<NewTags> list = coreData.pictureTags;
                c19879c2.f163286a = list;
                return new C19880d(true, list);
            }
            return new C19880d(false, null);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: r */
    public List<NewTags> m182834r() {
        return m182835s(true);
    }

    /* JADX INFO: renamed from: s */
    public List<NewTags> m182835s(boolean z) {
        try {
            if (NullChecker.m81303a(this.f163277l) && !vwb.m200296J(this.f163277l.f163297a) && TextUtils.equals(this.f163277l.f163298b, CoreModule.m29931H().userId())) {
                return this.f163277l.f163297a;
            }
            this.f163277l = null;
            List<NewTags> arrayList = new ArrayList<>();
            HashMap map = new HashMap();
            for (NewTags newTags : m182828k().m182845a()) {
                map.put(newTags.f20457id, newTags);
            }
            if (upa.m194665L3()) {
                for (NewTags newTags2 : m182833q().m182845a()) {
                    NewTags newTags3 = (NewTags) map.get(newTags2.f20457id);
                    if (newTags3 != null) {
                        newTags3.isPictureTag = true;
                        newTags3.status = newTags2.status;
                        newTags3.index = newTags2.index;
                        map.put(newTags2.f20457id, newTags3);
                    } else {
                        newTags2.isPictureTag = true;
                        map.put(newTags2.f20457id, newTags2);
                    }
                }
            }
            if (map.size() > 0) {
                ArrayList arrayList2 = new ArrayList(map.size());
                Iterator it = map.keySet().iterator();
                while (it.hasNext()) {
                    arrayList2.add((NewTags) map.get((String) it.next()));
                }
                arrayList = m182826i(arrayList2, arrayList2.size());
            }
            if (upa.m194722Z1() && !vwb.m200296J(arrayList)) {
                for (NewTags newTags4 : arrayList) {
                    CoreModule.f17545c.f19639e0.f149268S6.put(newTags4.f20457id, newTags4);
                }
            }
            if (!vwb.m200296J(arrayList)) {
                C19883g c19883g = new C19883g();
                this.f163277l = c19883g;
                c19883g.f163297a = arrayList;
                c19883g.f163298b = CoreModule.m29931H().userId();
                return arrayList;
            }
            return new ArrayList();
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: t */
    public List<NewTags> m182836t(User user) {
        Profile profile;
        Extensions extensions;
        Interest interest;
        if (user == null || (profile = user.profile) == null || (extensions = profile.extensions) == null || (interest = extensions.interest) == null || vwb.m200296J(interest.tags)) {
            return null;
        }
        List<String> list = user.profile.extensions.interest.tags;
        ArrayList arrayList = new ArrayList();
        Iterator<Media> it = user.pictures.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().tags);
        }
        return m182818P(vwb.m200339n(list, new C19877a(arrayList))).f163300b;
    }

    /* JADX INFO: renamed from: u */
    public List<NewTags> m182837u() {
        List<NewTags> listM182835s = m182835s(true);
        ArrayList arrayList = new ArrayList();
        for (NewTags newTags : listM182835s) {
            if (newTags.isPictureTag) {
                arrayList.add(newTags);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: v */
    public List<NewTags> m182838v(User user) {
        Profile profile;
        Extensions extensions;
        Interest interest;
        List<NewTags> listM182835s = m182835s(true);
        HashMap map = new HashMap();
        for (NewTags newTags : listM182835s) {
            if (newTags.isPictureTag) {
                map.put(newTags.f20457id, newTags);
            }
        }
        if (user == null || (profile = user.profile) == null || (extensions = profile.extensions) == null || (interest = extensions.interest) == null || vwb.m200296J(interest.tags)) {
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
            if (!vwb.m200296J(media.tags)) {
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
    public UserTagsData m182839w(User user) {
        UserTagsData userTagsData = new UserTagsData();
        userTagsData.tags = m182813K(m182836t(user));
        userTagsData.tagCategories = m182840x().m182848a();
        userTagsData.clickable = upa.m194810r2();
        return userTagsData;
    }

    /* JADX INFO: renamed from: x */
    public C19885i m182840x() {
        CoreData coreData;
        try {
            if (NullChecker.m81303a(this.f163280o) && !vwb.m200296J(this.f163280o.f163291a) && TextUtils.equals(this.f163280o.f163292b, this.f163270e.get()) && TextUtils.equals(this.f163280o.f163293c, CoreModule.m29931H().userId())) {
                return new C19885i(true, this.f163280o.f163291a);
            }
            this.f163280o = null;
            String str = this.f163271f.get();
            if (!TextUtils.isEmpty(str) && (coreData = CoreData.JSON_ADAPTER.parse(str)) != null && !vwb.m200296J(coreData.tagCategories)) {
                C19881e c19881e = new C19881e();
                this.f163280o = c19881e;
                c19881e.f163292b = this.f163270e.get();
                this.f163280o.f163293c = CoreModule.m29931H().userId();
                C19881e c19881e2 = this.f163280o;
                List<TagCategories> list = coreData.tagCategories;
                c19881e2.f163291a = list;
                return new C19885i(true, list);
            }
            return new C19885i(false, null);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: y */
    public C19886j m182841y() {
        CoreData coreData;
        try {
            if (NullChecker.m81303a(this.f163281p) && !vwb.m200296J(this.f163281p.f163294a) && TextUtils.equals(this.f163281p.f163295b, this.f163266a.get()) && TextUtils.equals(this.f163281p.f163296c, CoreModule.m29931H().userId())) {
                return new C19886j(true, this.f163281p.f163294a);
            }
            this.f163281p = null;
            String str = this.f163272g.get();
            if (!TextUtils.isEmpty(str) && (coreData = CoreData.JSON_ADAPTER.parse(str)) != null && !coreData.tagUserCounts.isEmpty()) {
                C19882f c19882f = new C19882f();
                this.f163281p = c19882f;
                c19882f.f163295b = this.f163266a.get();
                this.f163281p.f163296c = CoreModule.m29931H().userId();
                C19882f c19882f2 = this.f163281p;
                List<TagUserCounts> list = coreData.tagUserCounts;
                c19882f2.f163294a = list;
                return new C19886j(true, list);
            }
            return new C19886j(false, null);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: z */
    public List<String> m182842z() {
        return !NullChecker.m81303a(wn90.m204602F().f187269a) ? new ArrayList() : wn90.m204602F().f187269a.profile.extensions.interest.tags;
    }

    /* JADX INFO: renamed from: S */
    public void m182821S() {
    }
}
