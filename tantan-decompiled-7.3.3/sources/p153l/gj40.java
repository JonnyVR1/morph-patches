package p153l;

import android.content.Context;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.EditTagsData;
import com.p051p1.mobile.putong.core.data.NewTags;
import com.p051p1.mobile.putong.core.data.TagCategories;
import com.p051p1.mobile.putong.core.data.TagUserCounts;
import com.p051p1.mobile.putong.core.data.UserTagData;
import com.p051p1.mobile.putong.core.data.UserTagsData;
import com.p051p1.mobile.putong.core.newui.profile.TagChooseMkAct;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Extensions;
import com.p051p1.mobile.putong.data.Interest;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OmsTagUserCounts;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.Tag;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
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
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes4.dex */
public class gj40 {

    /* JADX INFO: renamed from: r */
    public static volatile gj40 f104557r;

    /* JADX INFO: renamed from: s */
    public static final String f104558s;

    /* JADX INFO: renamed from: t */
    public static final String f104559t;

    /* JADX INFO: renamed from: u */
    public static final String f104560u;

    /* JADX INFO: renamed from: v */
    public static final String f104561v;

    /* JADX INFO: renamed from: w */
    public static final String f104562w;

    /* JADX INFO: renamed from: l */
    public C17226g f104574l;

    /* JADX INFO: renamed from: m */
    public C17222c f104575m;

    /* JADX INFO: renamed from: n */
    public C17222c f104576n;

    /* JADX INFO: renamed from: o */
    public C17224e f104577o;

    /* JADX INFO: renamed from: p */
    public C17225f f104578p;

    /* JADX INFO: renamed from: a */
    public wyd0 f104563a = new wyd0("tag_md5" + CoreModule.m30929H().userId(), "");

    /* JADX INFO: renamed from: b */
    public wyd0 f104564b = new wyd0("tag_picture_strategy_md5" + CoreModule.m30929H().userId(), "");

    /* JADX INFO: renamed from: c */
    public wyd0 f104565c = new wyd0("core_oms_me_tags_tag_content_" + CoreModule.m30929H().userId(), "");

    /* JADX INFO: renamed from: d */
    public wyd0 f104566d = new wyd0("core_oms_me_tags_tag_content_pic_" + CoreModule.m30929H().userId(), "");

    /* JADX INFO: renamed from: e */
    public wyd0 f104567e = new wyd0("category_md5" + CoreModule.m30929H().userId(), "");

    /* JADX INFO: renamed from: f */
    public wyd0 f104568f = new wyd0("core_oms_me_category_content_" + CoreModule.m30929H().userId(), "");

    /* JADX INFO: renamed from: g */
    public wyd0 f104569g = new wyd0("core_oms_me_tags_users_number_" + CoreModule.m30929H().userId(), "");

    /* JADX INFO: renamed from: h */
    public vxd0 f104570h = new vxd0("core_close_tag_guide_number_" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: i */
    public jxd0 f104571i = new jxd0("core_tag_guide_show_" + CoreModule.m30929H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: j */
    public C22508b<uxj0> f104572j = C22508b.m222767b();

    /* JADX INFO: renamed from: k */
    public C22507a<uxj0> f104573k = C22507a.m222758b();

    /* JADX INFO: renamed from: q */
    public boolean f104579q = false;

    /* JADX INFO: renamed from: l.gj40$a */
    public class C17220a implements qcj<String, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f104580a;

        public C17220a(List list) {
            this.f104580a = list;
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(String str) {
            return Boolean.valueOf(!this.f104580a.contains(str));
        }
    }

    /* JADX INFO: renamed from: l.gj40$b */
    public class C17221b implements Comparator<UserTagData> {
        public C17221b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(UserTagData userTagData, UserTagData userTagData2) {
            return userTagData.index - userTagData2.index;
        }
    }

    /* JADX INFO: renamed from: l.gj40$c */
    public static class C17222c {

        /* JADX INFO: renamed from: a */
        public List<NewTags> f104583a;

        /* JADX INFO: renamed from: b */
        public String f104584b;

        /* JADX INFO: renamed from: c */
        public String f104585c;
    }

    /* JADX INFO: renamed from: l.gj40$d */
    public static class C17223d {

        /* JADX INFO: renamed from: a */
        public boolean f104586a;

        /* JADX INFO: renamed from: b */
        public List<NewTags> f104587b;

        public C17223d(boolean z, List<NewTags> list) {
            this.f104586a = z;
            this.f104587b = list;
        }

        /* JADX INFO: renamed from: a */
        public List<NewTags> m130458a() {
            return this.f104586a ? this.f104587b : new ArrayList();
        }
    }

    /* JADX INFO: renamed from: l.gj40$e */
    public static class C17224e {

        /* JADX INFO: renamed from: a */
        public List<TagCategories> f104588a;

        /* JADX INFO: renamed from: b */
        public String f104589b;

        /* JADX INFO: renamed from: c */
        public String f104590c;
    }

    /* JADX INFO: renamed from: l.gj40$f */
    public static class C17225f {

        /* JADX INFO: renamed from: a */
        public List<TagUserCounts> f104591a;

        /* JADX INFO: renamed from: b */
        public String f104592b;

        /* JADX INFO: renamed from: c */
        public String f104593c;
    }

    /* JADX INFO: renamed from: l.gj40$g */
    public static class C17226g {

        /* JADX INFO: renamed from: a */
        public List<NewTags> f104594a;

        /* JADX INFO: renamed from: b */
        public String f104595b;
    }

    /* JADX INFO: renamed from: l.gj40$h */
    public static class C17227h {

        /* JADX INFO: renamed from: a */
        public boolean f104596a;

        /* JADX INFO: renamed from: b */
        public List<NewTags> f104597b;

        public C17227h(boolean z, List<NewTags> list) {
            this.f104596a = z;
            this.f104597b = list;
        }

        /* JADX INFO: renamed from: b */
        public List<NewTags> m130460b() {
            return this.f104596a ? this.f104597b : new ArrayList();
        }
    }

    /* JADX INFO: renamed from: l.gj40$i */
    public static class C17228i {

        /* JADX INFO: renamed from: a */
        public boolean f104598a;

        /* JADX INFO: renamed from: b */
        public List<TagCategories> f104599b;

        public C17228i(boolean z, List<TagCategories> list) {
            this.f104598a = z;
            this.f104599b = list;
        }

        /* JADX INFO: renamed from: a */
        public List<TagCategories> m130461a() {
            return this.f104598a ? this.f104599b : new ArrayList();
        }
    }

    /* JADX INFO: renamed from: l.gj40$j */
    public static class C17229j {

        /* JADX INFO: renamed from: a */
        public boolean f104600a;

        /* JADX INFO: renamed from: b */
        public List<TagUserCounts> f104601b;

        public C17229j(boolean z, List<TagUserCounts> list) {
            this.f104600a = z;
            this.f104601b = list;
        }
    }

    static {
        f104558s = (zwk.m221905e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/dating-optimization-tags/index.html?speed=true&_bid=1004745&hideNavigationBar=1&showAddTagBtn=false");
        f104559t = (zwk.m221905e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/label-optimization-new/index.html?speed=true&_bid=1002880&hideNavigationBar=1");
        f104560u = (zwk.m221905e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/label-optimization-new/index.html?speed=true&_bid=1002880&hideNavigationBar=1");
        f104561v = (zwk.m221905e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/label-optimization-new/index.html?speed=true&_bid=1002880&hideNavigationBar=1");
        f104562w = (zwk.m221905e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/heart-beat/index.html?speed=true&_bid=1002785&hideNotch=1&hideNavigationBar=1&_ui=128");
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m130412e(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Tag m130414g(NewTags newTags) {
        return new Tag("personality", newTags.name);
    }

    /* JADX INFO: renamed from: o */
    public static gj40 m130415o() {
        if (f104557r == null) {
            synchronized (gj40.class) {
                try {
                    if (f104557r == null) {
                        f104557r = new gj40();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f104557r;
    }

    /* JADX INFO: renamed from: A */
    public UserTagsData m130416A(Act act, User user, boolean z) {
        return m130417B(act, user, z, false);
    }

    /* JADX INFO: renamed from: B */
    public UserTagsData m130417B(Act act, User user, boolean z, boolean z2) {
        Profile profile;
        Extensions extensions;
        Interest interest;
        if (user != null && (profile = user.profile) != null && (extensions = profile.extensions) != null && (interest = extensions.interest) != null && ((z || !jyb.m147479J(interest.tags)) && (!user.isMe() || !z || !jyb.m147479J(m130455z())))) {
            if (user.isMe()) {
                C17227h c17227hM130432Q = m130432Q(z ? m130455z() : user.profile.extensions.interest.tags, z2);
                C17228i c17228iM130453x = m130453x();
                if (!c17227hM130432Q.f104596a || !c17228iM130453x.f104598a) {
                    return null;
                }
                UserTagsData userTagsData = new UserTagsData();
                userTagsData.tags = m130426K(c17227hM130432Q.m130460b());
                userTagsData.tagCategories = c17228iM130453x.m130461a();
                userTagsData.clickable = gra.m131741r2();
                return userTagsData;
            }
            ArrayList<String> arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            List<String> list = user.profile.extensions.interest.tags;
            List<String> list2 = CoreModule.m30930K().me_().profile.extensions.interest.tags;
            if (!jyb.m147479J(list)) {
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
                if (CoreModule.f18264c.f20381e0.f89125S6.containsKey(str2)) {
                    arrayList4.add(str2);
                } else {
                    arrayList5.add(str2);
                }
            }
            m130445p(arrayList5);
            C17227h c17227hM130432Q2 = m130432Q(arrayList4, z2);
            C17228i c17228iM130453x2 = m130453x();
            if (c17227hM130432Q2 != null && c17227hM130432Q2.f104596a && c17228iM130453x2.f104598a) {
                List<NewTags> listM130460b = c17227hM130432Q2.m130460b();
                if (!jyb.m147479J(arrayList2)) {
                    for (NewTags newTags : listM130460b) {
                        if (arrayList2.contains(newTags.f21199id)) {
                            newTags.localIsCommonLabel = true;
                        } else {
                            newTags.localIsCommonLabel = false;
                        }
                    }
                }
                UserTagsData userTagsData2 = new UserTagsData();
                userTagsData2.tags = m130426K(listM130460b);
                userTagsData2.tagCategories = c17228iM130453x2.m130461a();
                userTagsData2.clickable = gra.m131741r2();
                return userTagsData2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: C */
    public void m130418C(Act act, String str, boolean z) {
        act.startActivity(MkWebViewAct.m81421d2(act, "", f104560u + "&preview=" + z + "&showFrom=" + str + "#/tagEditing#/", true, true, null));
    }

    /* JADX INFO: renamed from: D */
    public void m130419D(Frag frag, int i, String str, boolean z) {
        frag.startActivityForResult(MkWebViewAct.m81421d2(frag.getContext(), "", f104560u + "&preview=" + z + "&showFrom=" + str + "#/tagEditing#/", true, true, null), i);
    }

    /* JADX INFO: renamed from: E */
    public void m130420E(Context context, String str, String str2, String str3) {
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(str);
        if (NullChecker.m82486a(userM116503Pa)) {
            context.startActivity(MkWebViewAct.m81421d2(context, "", f104562w + "&from=" + str2 + "&tabName=" + str3 + "&otherGender=" + (userM116503Pa.isFemale() ? "female" : "male"), true, true, null));
        }
    }

    /* JADX INFO: renamed from: F */
    public void m130421F(Frag frag, String str, String str2, String str3, int i) {
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(str);
        if (NullChecker.m82486a(userM116503Pa)) {
            frag.startActivityForResult(MkWebViewAct.m81421d2(frag.getContext(), "", f104562w + "&from=" + str2 + "&tabName=" + str3 + "&otherGender=" + (userM116503Pa.isFemale() ? "female" : "male"), true, true, null), i);
        }
    }

    /* JADX INFO: renamed from: G */
    public void m130422G(Frag frag, int i, User user, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.equals(user.f56859id, CoreModule.m30930K().me_().f56859id) ? "我" : user.name);
        sb.append("的标签");
        frag.startActivityForResult(MkWebViewAct.m81421d2(frag.getContext(), "", f104559t + "&userID=" + user.f56859id + "&preview=" + z + "&title=" + URLEncoder.encode(sb.toString()) + "#/", true, true, null), i);
    }

    /* JADX INFO: renamed from: H */
    public void m130423H(Frag frag, int i, User user, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.equals(user.f56859id, CoreModule.m30930K().me_().f56859id) ? "我" : user.name);
        sb.append("的标签");
        frag.startActivityForResult(MkWebViewAct.m81421d2(frag.getContext(), "", f104558s + "&userID=" + user.f56859id + "&preview=" + z + "&title=" + URLEncoder.encode(sb.toString()) + "#/", true, true, null), i);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m130424I(Envelope envelope) {
        List<NewTags> list = ((CoreData) envelope.data.getModuleData(CoreData.class)).tags;
        m130429N(m130439i(list, list.size()));
        this.f104572j.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: J */
    public boolean m130425J(User user) {
        if (!NullChecker.m82486a(user) || user.isMe() || !NullChecker.m82486a(user.profile) || !NullChecker.m82486a(user.profile.extensions) || !NullChecker.m82486a(user.profile.extensions.interest) || jyb.m147479J(user.profile.extensions.interest.tags)) {
            return false;
        }
        Iterator<String> it = user.profile.extensions.interest.tags.iterator();
        while (it.hasNext()) {
            if (!CoreModule.f18264c.f20381e0.f89125S6.containsKey(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: K */
    public final List<UserTagData> m130426K(List<NewTags> list) {
        if (jyb.m147479J(list)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (NewTags newTags : list) {
            if (NullChecker.m82486a(newTags)) {
                UserTagData userTagData = new UserTagData();
                userTagData.f21269id = newTags.f21199id;
                userTagData.title = newTags.name;
                userTagData.icon = newTags.icon;
                userTagData.subtitle = m130442l(newTags.localTagUserCounts);
                userTagData.highlighted = newTags.localIsCommonLabel;
                userTagData.categories = newTags.categories;
                userTagData.status = newTags.status;
                userTagData.gender = newTags.gender;
                userTagData.index = newTags.index;
                arrayList.add(userTagData);
            }
        }
        Collections.sort(arrayList, new C17221b());
        return arrayList;
    }

    /* JADX INFO: renamed from: L */
    public void m130427L() {
        f104557r = null;
    }

    /* JADX INFO: renamed from: M */
    public void m130428M(List<NewTags> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        List<NewTags> listM130439i = m130439i(list, list.size());
        if (jyb.m147479J(listM130439i)) {
            return;
        }
        for (NewTags newTags : listM130439i) {
            CoreModule.f18264c.f20381e0.f89125S6.put(newTags.f21199id, newTags);
            CoreModule.f18264c.f20381e0.f89133T6.put(newTags.f21199id, newTags);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m130429N(List<NewTags> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        List<NewTags> listM130439i = m130439i(list, list.size());
        if (jyb.m147479J(listM130439i)) {
            return;
        }
        for (NewTags newTags : listM130439i) {
            CoreModule.f18264c.f20381e0.f89125S6.put(newTags.f21199id, newTags);
        }
    }

    /* JADX INFO: renamed from: O */
    public NewTags m130430O(String str) {
        if (CoreModule.f18264c.f20381e0.f89125S6.size() == 0 && gra.m131653Z1() && !this.f104579q) {
            this.f104579q = true;
            m130447r();
        }
        return CoreModule.f18264c.f20381e0.f89125S6.get(str);
    }

    /* JADX INFO: renamed from: P */
    public C17227h m130431P(List<String> list) {
        return m130432Q(list, false);
    }

    /* JADX INFO: renamed from: Q */
    public C17227h m130432Q(List<String> list, boolean z) {
        if (list == null || list.isEmpty()) {
            return new C17227h(false, null);
        }
        ArrayList<NewTags> arrayList = new ArrayList();
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                NewTags newTags = CoreModule.f18264c.f20381e0.f89125S6.get(str);
                if (NullChecker.m82486a(newTags)) {
                    newTags.localIsCommonLabel = false;
                    arrayList.add(newTags);
                }
            }
        }
        if (!jyb.m147479J(arrayList) && z) {
            ArrayList arrayList2 = new ArrayList();
            for (NewTags newTags2 : arrayList) {
                if (newTags2.isPictureTag) {
                    arrayList2.add(newTags2);
                }
            }
            arrayList = arrayList2;
        }
        return new C17227h(true, arrayList);
    }

    /* JADX INFO: renamed from: R */
    public C17227h m130433R(List<OmsTagUserCounts> list) {
        if (list == null || list.isEmpty()) {
            return new C17227h(false, null);
        }
        List<NewTags> listM130447r = m130447r();
        if (jyb.m147479J(listM130447r)) {
            return new C17227h(false, null);
        }
        HashMap map = new HashMap(((int) (((double) listM130447r.size()) / 0.75d)) + 1);
        for (NewTags newTags : listM130447r) {
            map.put(newTags.f21199id, newTags);
        }
        HashMap map2 = new HashMap(((int) (((double) list.size()) / 0.75d)) + 1);
        for (OmsTagUserCounts omsTagUserCounts : list) {
            map2.put(omsTagUserCounts.f39650id, omsTagUserCounts);
        }
        ArrayList arrayList = new ArrayList();
        for (OmsTagUserCounts omsTagUserCounts2 : list) {
            NewTags newTags2 = (NewTags) map.get(omsTagUserCounts2.f39650id);
            OmsTagUserCounts omsTagUserCounts3 = (OmsTagUserCounts) map2.get(omsTagUserCounts2.f39650id);
            if (NullChecker.m82486a(newTags2) && NullChecker.m82486a(omsTagUserCounts3)) {
                newTags2.localTagUserCounts = omsTagUserCounts3.count;
                arrayList.add(newTags2);
            }
        }
        return new C17227h(true, arrayList);
    }

    /* JADX INFO: renamed from: T */
    public void m130435T(List<String> list) {
        if (NullChecker.m82486a(aw90.m100562F().f73701a)) {
            aw90.m100562F().f73701a.profile.extensions.interest.tags = list;
            if (jyb.m147479J(list)) {
                aw90.m100562F().f73701a.profile.tags.clear();
                return;
            }
            C17227h c17227hM130431P = m130415o().m130431P(list);
            if (NullChecker.m82486a(c17227hM130431P) && c17227hM130431P.f104596a) {
                List<NewTags> listM130460b = c17227hM130431P.m130460b();
                List<NewTags> listSubList = listM130460b.subList(0, Math.min(listM130460b.size(), 10));
                aw90.m100562F().f73701a.profile.tags = jyb.m147486Q(listSubList, new qcj() { // from class: l.zi40
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return gj40.m130414g((NewTags) obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public void m130436U(Act act, String str) {
        if (!NullChecker.m82486a(act) || act.isFinishing()) {
            return;
        }
        new c1i0(act, str).show();
    }

    /* JADX INFO: renamed from: V */
    public List<String> m130437V(List<String> list) {
        C17227h c17227hM130431P;
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() != 0 && (c17227hM130431P = m130431P(list)) != null && !c17227hM130431P.m130460b().isEmpty()) {
            for (NewTags newTags : c17227hM130431P.m130460b()) {
                if (NullChecker.m82486a(newTags)) {
                    arrayList.add(newTags.name);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public void m130438h() {
        this.f104563a.clear();
        this.f104564b.clear();
        this.f104567e.clear();
    }

    /* JADX INFO: renamed from: i */
    public final List<NewTags> m130439i(List<NewTags> list, int i) {
        return m130440j(list, i, null, null);
    }

    /* JADX INFO: renamed from: j */
    public final List<NewTags> m130440j(List<NewTags> list, int i, C17228i c17228i, C17229j c17229j) {
        if (jyb.m147479J(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i);
        if (c17228i == null) {
            c17228i = m130453x();
        }
        if (c17228i.f104598a) {
            List<TagCategories> listM130461a = c17228i.m130461a();
            HashMap map = new HashMap(((int) (((double) listM130461a.size()) / 0.75d)) + 1);
            for (TagCategories tagCategories : listM130461a) {
                map.put(tagCategories.f21256id, tagCategories);
            }
            if (c17229j == null) {
                c17229j = m130454y();
            }
            HashMap map2 = new HashMap();
            if (c17229j.f104600a && !jyb.m147479J(c17229j.f104601b)) {
                List<TagUserCounts> list2 = c17229j.f104601b;
                HashMap map3 = new HashMap(((int) (((double) list2.size()) / 0.75d)) + 1);
                for (TagUserCounts tagUserCounts : list2) {
                    map3.put(tagUserCounts.f21257id, tagUserCounts);
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
                        if (NullChecker.m82486a(tagCategories2)) {
                            arrayList2.add(tagCategories2);
                        } else {
                            TagCategories tagCategories3 = (TagCategories) jyb.m147529r(listM130461a, new qcj() { // from class: l.yi40
                                @Override // p153l.qcj
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
                if (!c17229j.f104600a || jyb.m147479J(c17229j.f104601b)) {
                    newTags.localTagUserCounts = 1L;
                } else {
                    TagUserCounts tagUserCounts2 = (TagUserCounts) map2.get(newTags.f21199id);
                    if (NullChecker.m82486a(tagUserCounts2)) {
                        newTags.localTagUserCounts = tagUserCounts2.count;
                    } else {
                        newTags.localTagUserCounts = 1L;
                    }
                }
                if (!jyb.m147479J(newTags.localTagCategories)) {
                    arrayList.add(newTags);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public C17223d m130441k() {
        CoreData coreData;
        try {
            if (NullChecker.m82486a(this.f104575m) && !jyb.m147479J(this.f104575m.f104583a) && TextUtils.equals(this.f104575m.f104584b, this.f104563a.get()) && TextUtils.equals(this.f104575m.f104585c, CoreModule.m30929H().userId())) {
                return new C17223d(true, this.f104575m.f104583a);
            }
            this.f104575m = null;
            String str = this.f104565c.get();
            if (!TextUtils.isEmpty(str) && (coreData = CoreData.JSON_ADAPTER.parse(str)) != null && !jyb.m147479J(coreData.tags)) {
                C17222c c17222c = new C17222c();
                this.f104575m = c17222c;
                c17222c.f104584b = this.f104563a.get();
                this.f104575m.f104585c = CoreModule.m30929H().userId();
                C17222c c17222c2 = this.f104575m;
                List<NewTags> list = coreData.tags;
                c17222c2.f104583a = list;
                return new C17223d(true, list);
            }
            return new C17223d(false, null);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: l */
    public String m130442l(long j) {
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
    public EditTagsData m130443m(Act act) {
        List<NewTags> listM130450u = m130450u();
        C17228i c17228iM130453x = m130453x();
        if (jyb.m147479J(listM130450u)) {
            return null;
        }
        EditTagsData editTagsData = new EditTagsData();
        for (Map.Entry<String, NewTags> entry : CoreModule.f18264c.f20381e0.f89133T6.entrySet()) {
            String key = entry.getKey();
            Iterator<NewTags> it = listM130450u.iterator();
            do {
                if (!it.hasNext()) {
                    listM130450u.add(0, entry.getValue());
                    break;
                }
            } while (!TextUtils.equals(it.next().f21199id, key));
        }
        editTagsData.tags = m130426K(listM130450u);
        editTagsData.tagCategories = c17228iM130453x.m130461a();
        editTagsData.picUrls = new ArrayList();
        editTagsData.selectedTags = new ArrayList();
        if (act instanceof TagChooseMkAct) {
            TagChooseMkAct tagChooseMkAct = (TagChooseMkAct) act;
            editTagsData.selectedTags = tagChooseMkAct.m44235r2();
            editTagsData.picUrls = tagChooseMkAct.m44236u2();
            editTagsData.urlTags = tagChooseMkAct.m44237v2();
        }
        editTagsData.maximumSelectableCount = 200;
        editTagsData.minimumSelectableCount = 5;
        Objects.toString(editTagsData.picUrls);
        return editTagsData;
    }

    /* JADX INFO: renamed from: n */
    public EditTagsData m130444n(User user, boolean z) {
        List<NewTags> listM130447r = m130447r();
        C17228i c17228iM130453x = m130453x();
        if (jyb.m147479J(listM130447r)) {
            return null;
        }
        EditTagsData editTagsData = new EditTagsData();
        for (Map.Entry<String, NewTags> entry : CoreModule.f18264c.f20381e0.f89133T6.entrySet()) {
            String key = entry.getKey();
            Iterator<NewTags> it = listM130447r.iterator();
            do {
                if (!it.hasNext()) {
                    listM130447r.add(0, entry.getValue());
                    break;
                }
            } while (!TextUtils.equals(it.next().f21199id, key));
        }
        editTagsData.tags = m130426K(listM130447r);
        editTagsData.tagCategories = c17228iM130453x.m130461a();
        if (z) {
            editTagsData.selectedTags = m130455z();
        } else {
            editTagsData.selectedTags = user.profile.extensions.interest.tags;
        }
        if (!jyb.m147479J(listM130447r)) {
            final ArrayList arrayListM147486Q = jyb.m147486Q(listM130447r, new qcj() { // from class: l.aj40
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((NewTags) obj).f21199id;
                }
            });
            if (!jyb.m147479J(arrayListM147486Q)) {
                List<String> list = editTagsData.selectedTags;
                Objects.requireNonNull(arrayListM147486Q);
                editTagsData.selectedTags = jyb.m147522n(list, new qcj() { // from class: l.bj40
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(arrayListM147486Q.contains((String) obj));
                    }
                });
            }
        }
        editTagsData.maximumSelectableCount = 200;
        editTagsData.minimumSelectableCount = 5;
        return editTagsData;
    }

    /* JADX INFO: renamed from: p */
    public void m130445p(List<String> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        final String str = "/oms/me/tags/batch?ids=" + jyb.m147490U(list, Constants.SEPARATOR_COMMA);
        CoreModule.f18264c.scheduled("/oms/me/tags/batch/" + CoreModule.m30930K().me_().f56859id, 0, new pcj() { // from class: l.cj40
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.fj40
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return xi5.network.auth().m209043q(xi5.m211107i(str)).m209032f().m209028b();
                    }
                });
            }
        }).compose(psd0.m173592C()).subscribe(psd0.m173597H(new y20() { // from class: l.dj40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f88778a.m130424I((Envelope) obj);
            }
        }, new y20() { // from class: l.ej40
            @Override // p153l.y20
            public final void call(Object obj) {
                gj40.m130412e((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    public C17223d m130446q() {
        CoreData coreData;
        try {
            if (NullChecker.m82486a(this.f104576n) && !jyb.m147479J(this.f104576n.f104583a) && TextUtils.equals(this.f104576n.f104584b, this.f104564b.get()) && TextUtils.equals(this.f104576n.f104585c, CoreModule.m30929H().userId())) {
                return new C17223d(true, this.f104576n.f104583a);
            }
            this.f104576n = null;
            String str = this.f104566d.get();
            if (!TextUtils.isEmpty(str) && (coreData = CoreData.JSON_ADAPTER.parse(str)) != null && !jyb.m147479J(coreData.pictureTags)) {
                C17222c c17222c = new C17222c();
                this.f104576n = c17222c;
                c17222c.f104584b = this.f104564b.get();
                this.f104576n.f104585c = CoreModule.m30929H().userId();
                C17222c c17222c2 = this.f104576n;
                List<NewTags> list = coreData.pictureTags;
                c17222c2.f104583a = list;
                return new C17223d(true, list);
            }
            return new C17223d(false, null);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: r */
    public List<NewTags> m130447r() {
        return m130448s(true);
    }

    /* JADX INFO: renamed from: s */
    public List<NewTags> m130448s(boolean z) {
        try {
            if (NullChecker.m82486a(this.f104574l) && !jyb.m147479J(this.f104574l.f104594a) && TextUtils.equals(this.f104574l.f104595b, CoreModule.m30929H().userId())) {
                return this.f104574l.f104594a;
            }
            this.f104574l = null;
            List<NewTags> arrayList = new ArrayList<>();
            HashMap map = new HashMap();
            for (NewTags newTags : m130441k().m130458a()) {
                map.put(newTags.f21199id, newTags);
            }
            if (gra.m131596L3()) {
                for (NewTags newTags2 : m130446q().m130458a()) {
                    NewTags newTags3 = (NewTags) map.get(newTags2.f21199id);
                    if (newTags3 != null) {
                        newTags3.isPictureTag = true;
                        newTags3.status = newTags2.status;
                        newTags3.index = newTags2.index;
                        map.put(newTags2.f21199id, newTags3);
                    } else {
                        newTags2.isPictureTag = true;
                        map.put(newTags2.f21199id, newTags2);
                    }
                }
            }
            if (map.size() > 0) {
                ArrayList arrayList2 = new ArrayList(map.size());
                Iterator it = map.keySet().iterator();
                while (it.hasNext()) {
                    arrayList2.add((NewTags) map.get((String) it.next()));
                }
                arrayList = m130439i(arrayList2, arrayList2.size());
            }
            if (gra.m131653Z1() && !jyb.m147479J(arrayList)) {
                for (NewTags newTags4 : arrayList) {
                    CoreModule.f18264c.f20381e0.f89125S6.put(newTags4.f21199id, newTags4);
                }
            }
            if (!jyb.m147479J(arrayList)) {
                C17226g c17226g = new C17226g();
                this.f104574l = c17226g;
                c17226g.f104594a = arrayList;
                c17226g.f104595b = CoreModule.m30929H().userId();
                return arrayList;
            }
            return new ArrayList();
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: t */
    public List<NewTags> m130449t(User user) {
        Profile profile;
        Extensions extensions;
        Interest interest;
        if (user == null || (profile = user.profile) == null || (extensions = profile.extensions) == null || (interest = extensions.interest) == null || jyb.m147479J(interest.tags)) {
            return null;
        }
        List<String> list = user.profile.extensions.interest.tags;
        ArrayList arrayList = new ArrayList();
        Iterator<Media> it = user.pictures.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().tags);
        }
        return m130431P(jyb.m147522n(list, new C17220a(arrayList))).f104597b;
    }

    /* JADX INFO: renamed from: u */
    public List<NewTags> m130450u() {
        List<NewTags> listM130448s = m130448s(true);
        ArrayList arrayList = new ArrayList();
        for (NewTags newTags : listM130448s) {
            if (newTags.isPictureTag) {
                arrayList.add(newTags);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: v */
    public List<NewTags> m130451v(User user) {
        Profile profile;
        Extensions extensions;
        Interest interest;
        List<NewTags> listM130448s = m130448s(true);
        HashMap map = new HashMap();
        for (NewTags newTags : listM130448s) {
            if (newTags.isPictureTag) {
                map.put(newTags.f21199id, newTags);
            }
        }
        if (user == null || (profile = user.profile) == null || (extensions = profile.extensions) == null || (interest = extensions.interest) == null || jyb.m147479J(interest.tags)) {
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
            if (!jyb.m147479J(media.tags)) {
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
    public UserTagsData m130452w(User user) {
        UserTagsData userTagsData = new UserTagsData();
        userTagsData.tags = m130426K(m130449t(user));
        userTagsData.tagCategories = m130453x().m130461a();
        userTagsData.clickable = gra.m131741r2();
        return userTagsData;
    }

    /* JADX INFO: renamed from: x */
    public C17228i m130453x() {
        CoreData coreData;
        try {
            if (NullChecker.m82486a(this.f104577o) && !jyb.m147479J(this.f104577o.f104588a) && TextUtils.equals(this.f104577o.f104589b, this.f104567e.get()) && TextUtils.equals(this.f104577o.f104590c, CoreModule.m30929H().userId())) {
                return new C17228i(true, this.f104577o.f104588a);
            }
            this.f104577o = null;
            String str = this.f104568f.get();
            if (!TextUtils.isEmpty(str) && (coreData = CoreData.JSON_ADAPTER.parse(str)) != null && !jyb.m147479J(coreData.tagCategories)) {
                C17224e c17224e = new C17224e();
                this.f104577o = c17224e;
                c17224e.f104589b = this.f104567e.get();
                this.f104577o.f104590c = CoreModule.m30929H().userId();
                C17224e c17224e2 = this.f104577o;
                List<TagCategories> list = coreData.tagCategories;
                c17224e2.f104588a = list;
                return new C17228i(true, list);
            }
            return new C17228i(false, null);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: y */
    public C17229j m130454y() {
        CoreData coreData;
        try {
            if (NullChecker.m82486a(this.f104578p) && !jyb.m147479J(this.f104578p.f104591a) && TextUtils.equals(this.f104578p.f104592b, this.f104563a.get()) && TextUtils.equals(this.f104578p.f104593c, CoreModule.m30929H().userId())) {
                return new C17229j(true, this.f104578p.f104591a);
            }
            this.f104578p = null;
            String str = this.f104569g.get();
            if (!TextUtils.isEmpty(str) && (coreData = CoreData.JSON_ADAPTER.parse(str)) != null && !coreData.tagUserCounts.isEmpty()) {
                C17225f c17225f = new C17225f();
                this.f104578p = c17225f;
                c17225f.f104592b = this.f104563a.get();
                this.f104578p.f104593c = CoreModule.m30929H().userId();
                C17225f c17225f2 = this.f104578p;
                List<TagUserCounts> list = coreData.tagUserCounts;
                c17225f2.f104591a = list;
                return new C17229j(true, list);
            }
            return new C17229j(false, null);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: z */
    public List<String> m130455z() {
        return !NullChecker.m82486a(aw90.m100562F().f73701a) ? new ArrayList() : aw90.m100562F().f73701a.profile.extensions.interest.tags;
    }

    /* JADX INFO: renamed from: S */
    public void m130434S() {
    }
}
