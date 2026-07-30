package com.p051p1.mobile.putong.core.newui.profile;

import android.content.Intent;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.UrlTag;
import com.p051p1.mobile.putong.core.data.UrlTagsHolder;
import com.p051p1.mobile.putong.core.newui.profile.TagChooseMkAct;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p137rx.subjects.C22507a;
import p153l.jyb;
import p153l.psd0;
import p153l.y20;
import p153l.zwk;

/* JADX INFO: loaded from: classes11.dex */
public class TagChooseMkAct extends MkWebViewAct {

    /* JADX INFO: renamed from: l */
    public static final String f27235l;

    /* JADX INFO: renamed from: m */
    public static Runnable f27236m;

    /* JADX INFO: renamed from: n */
    public static List<Media> f27237n;

    /* JADX INFO: renamed from: o */
    public static Runnable f27238o;

    /* JADX INFO: renamed from: g */
    public ArrayList<String> f27239g = new ArrayList<>();

    /* JADX INFO: renamed from: h */
    public ArrayList<String> f27240h = new ArrayList<>();

    /* JADX INFO: renamed from: i */
    public List<UrlTag> f27241i = new ArrayList();

    /* JADX INFO: renamed from: j */
    public C22507a<List<String>> f27242j = C22507a.m222758b();

    /* JADX INFO: renamed from: k */
    public boolean f27243k;

    static {
        f27235l = (zwk.m221905e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/dating-optimization-tags/index.html?speed=true&_bid=1004745&hideNavigationBar=1&hideNotch=1&preview=true&picIdxList=%s&showAddTagBtn=false&datingTagsFrom=%s&tabId=%s#/tagEditing");
    }

    /* JADX INFO: renamed from: o2 */
    public static /* synthetic */ void m44229o2(Act act, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, List list) {
        act.progressDismiss();
        UrlTagsHolder urlTagsHolder = new UrlTagsHolder();
        urlTagsHolder.urlTags = list;
        Intent intentM44231q2 = m44231q2(act, arrayList, arrayList2, arrayList3, urlTagsHolder, str);
        if (intentM44231q2 != null) {
            act.startActivity(intentM44231q2);
        }
    }

    /* JADX INFO: renamed from: p2 */
    public static /* synthetic */ void m44230p2(Act act, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, Throwable th) {
        act.progressDismiss();
        Intent intentM44231q2 = m44231q2(act, arrayList, arrayList2, arrayList3, null, str);
        if (intentM44231q2 != null) {
            act.startActivity(intentM44231q2);
        }
    }

    /* JADX INFO: renamed from: q2 */
    public static Intent m44231q2(Act act, ArrayList<Integer> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3, UrlTagsHolder urlTagsHolder, String str) {
        if (jyb.m147479J(arrayList) || jyb.m147479J(arrayList2) || arrayList.size() != arrayList2.size() || arrayList.size() != arrayList3.size()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            int iIntValue = arrayList.get(i).intValue();
            if (TextUtils.isEmpty(sb)) {
                sb.append(iIntValue);
            } else {
                sb.append("_");
                sb.append(iIntValue);
            }
        }
        Intent intentM81422e2 = MkWebViewAct.m81422e2(act, "", String.format(f27235l, sb, "", str), true, true, true, null);
        intentM81422e2.setClass(act, TagChooseMkAct.class);
        intentM81422e2.putExtra("hideNotch", true);
        intentM81422e2.putIntegerArrayListExtra("ext_position", arrayList);
        intentM81422e2.putStringArrayListExtra("ext_url", arrayList2);
        intentM81422e2.putStringArrayListExtra("ext_tag", arrayList3);
        intentM81422e2.putExtra("ext_url_tags", urlTagsHolder);
        return intentM81422e2;
    }

    /* JADX INFO: renamed from: s2 */
    public static String m44232s2(Media media) {
        if (media instanceof Picture) {
            return media.url;
        }
        return media instanceof Video ? media.cover().url : "";
    }

    /* JADX INFO: renamed from: w2 */
    public static void m44233w2(final Act act, List<Media> list, final String str, Runnable runnable, Runnable runnable2) {
        f27236m = runnable;
        f27237n = list;
        f27238o = runnable2;
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < f27237n.size(); i++) {
            Media media = f27237n.get(i);
            arrayList.add(Integer.valueOf(i));
            arrayList2.add(m44232s2(media));
            arrayList3.add(!jyb.m147479J(media.tags) ? media.tags.get(0) : "");
        }
        if (CoreModule.m30933P().m143405a().mo180468f4()) {
            act.progress("处理中...");
            act.duringCreated(CoreModule.f18264c.f20381e0.m116452D7(arrayList2)).subscribe(psd0.m173597H(new y20() { // from class: l.h1i0
                @Override // p153l.y20
                public final void call(Object obj) {
                    TagChooseMkAct.m44229o2(act, arrayList, arrayList2, arrayList3, str, (List) obj);
                }
            }, new y20() { // from class: l.i1i0
                @Override // p153l.y20
                public final void call(Object obj) {
                    TagChooseMkAct.m44230p2(act, arrayList, arrayList2, arrayList3, str, (Throwable) obj);
                }
            }));
        } else {
            Intent intentM44231q2 = m44231q2(act, arrayList, arrayList2, arrayList3, null, str);
            if (intentM44231q2 == null) {
                return;
            }
            act.startActivity(intentM44231q2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public /* synthetic */ void m44234y2(List list) {
        if (!jyb.m147479J(list) && !jyb.m147479J(f27237n) && list.size() == f27237n.size()) {
            for (int i = 0; i < list.size(); i++) {
                f27237n.get(i).tags = jyb.m147482M((String) list.get(i));
            }
            if (NullChecker.m82486a(f27236m)) {
                f27236m.run();
                this.f27243k = true;
            }
        }
        m68056e2();
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m68056e2() {
        if (!this.f27243k && NullChecker.m82486a(f27238o)) {
            f27238o.run();
            f27238o = null;
        }
        super.m68056e2();
        f27236m = null;
        f27237n = null;
    }

    @Override // com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f27239g = getIntent().getStringArrayListExtra("ext_url");
        this.f27240h = getIntent().getStringArrayListExtra("ext_tag");
        UrlTagsHolder urlTagsHolder = (UrlTagsHolder) getIntent().getSerializableExtra("ext_url_tags");
        if (urlTagsHolder != null) {
            this.f27241i = urlTagsHolder.urlTags;
        }
    }

    @Override // com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        duringCreated(this.f27242j).subscribe(psd0.m173596G(new y20() { // from class: l.g1i0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101759a.m44234y2((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r2 */
    public ArrayList<String> m44235r2() {
        return this.f27240h;
    }

    /* JADX INFO: renamed from: u2 */
    public ArrayList<String> m44236u2() {
        return this.f27239g;
    }

    /* JADX INFO: renamed from: v2 */
    public List<UrlTag> m44237v2() {
        return this.f27241i;
    }
}
