package com.p046p1.mobile.putong.core.newui.profile;

import android.content.Intent;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.UrlTag;
import com.p046p1.mobile.putong.core.data.UrlTagsHolder;
import com.p046p1.mobile.putong.core.newui.profile.TagChooseMkAct;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p133rx.subjects.C22392a;
import p149l.e30;
import p149l.juk;
import p149l.mkd0;
import p149l.vwb;

/* JADX INFO: loaded from: classes11.dex */
public class TagChooseMkAct extends MkWebViewAct {

    /* JADX INFO: renamed from: l */
    public static final String f26493l;

    /* JADX INFO: renamed from: m */
    public static Runnable f26494m;

    /* JADX INFO: renamed from: n */
    public static List<Media> f26495n;

    /* JADX INFO: renamed from: o */
    public static Runnable f26496o;

    /* JADX INFO: renamed from: g */
    public ArrayList<String> f26497g = new ArrayList<>();

    /* JADX INFO: renamed from: h */
    public ArrayList<String> f26498h = new ArrayList<>();

    /* JADX INFO: renamed from: i */
    public List<UrlTag> f26499i = new ArrayList();

    /* JADX INFO: renamed from: j */
    public C22392a<List<String>> f26500j = C22392a.m221512b();

    /* JADX INFO: renamed from: k */
    public boolean f26501k;

    static {
        f26493l = (juk.m143323e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/dating-optimization-tags/index.html?speed=true&_bid=1004745&hideNavigationBar=1&hideNotch=1&preview=true&picIdxList=%s&showAddTagBtn=false&datingTagsFrom=%s&tabId=%s#/tagEditing");
    }

    /* JADX INFO: renamed from: n2 */
    public static /* synthetic */ void m43218n2(Act act, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, List list) {
        act.progressDismiss();
        UrlTagsHolder urlTagsHolder = new UrlTagsHolder();
        urlTagsHolder.urlTags = list;
        Intent intentM43220p2 = m43220p2(act, arrayList, arrayList2, arrayList3, urlTagsHolder, str);
        if (intentM43220p2 != null) {
            act.startActivity(intentM43220p2);
        }
    }

    /* JADX INFO: renamed from: o2 */
    public static /* synthetic */ void m43219o2(Act act, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, Throwable th) {
        act.progressDismiss();
        Intent intentM43220p2 = m43220p2(act, arrayList, arrayList2, arrayList3, null, str);
        if (intentM43220p2 != null) {
            act.startActivity(intentM43220p2);
        }
    }

    /* JADX INFO: renamed from: p2 */
    public static Intent m43220p2(Act act, ArrayList<Integer> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3, UrlTagsHolder urlTagsHolder, String str) {
        if (vwb.m200296J(arrayList) || vwb.m200296J(arrayList2) || arrayList.size() != arrayList2.size() || arrayList.size() != arrayList3.size()) {
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
        Intent intentM80239d2 = MkWebViewAct.m80239d2(act, "", String.format(f26493l, sb, "", str), true, true, true, null);
        intentM80239d2.setClass(act, TagChooseMkAct.class);
        intentM80239d2.putExtra("hideNotch", true);
        intentM80239d2.putIntegerArrayListExtra("ext_position", arrayList);
        intentM80239d2.putStringArrayListExtra("ext_url", arrayList2);
        intentM80239d2.putStringArrayListExtra("ext_tag", arrayList3);
        intentM80239d2.putExtra("ext_url_tags", urlTagsHolder);
        return intentM80239d2;
    }

    /* JADX INFO: renamed from: r2 */
    public static String m43221r2(Media media) {
        if (media instanceof Picture) {
            return media.url;
        }
        return media instanceof Video ? media.cover().url : "";
    }

    /* JADX INFO: renamed from: v2 */
    public static void m43222v2(final Act act, List<Media> list, final String str, Runnable runnable, Runnable runnable2) {
        f26494m = runnable;
        f26495n = list;
        f26496o = runnable2;
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < f26495n.size(); i++) {
            Media media = f26495n.get(i);
            arrayList.add(Integer.valueOf(i));
            arrayList2.add(m43221r2(media));
            arrayList3.add(!vwb.m200296J(media.tags) ? media.tags.get(0) : "");
        }
        if (CoreModule.m29935P().m94651a().mo158376f4()) {
            act.progress("处理中...");
            act.duringCreated(CoreModule.f17545c.f19639e0.m169379D7(arrayList2)).subscribe(mkd0.m154956H(new e30() { // from class: l.zsh0
                @Override // p149l.e30
                public final void call(Object obj) {
                    TagChooseMkAct.m43218n2(act, arrayList, arrayList2, arrayList3, str, (List) obj);
                }
            }, new e30() { // from class: l.ath0
                @Override // p149l.e30
                public final void call(Object obj) {
                    TagChooseMkAct.m43219o2(act, arrayList, arrayList2, arrayList3, str, (Throwable) obj);
                }
            }));
        } else {
            Intent intentM43220p2 = m43220p2(act, arrayList, arrayList2, arrayList3, null, str);
            if (intentM43220p2 == null) {
                return;
            }
            act.startActivity(intentM43220p2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w2 */
    public /* synthetic */ void m43223w2(List list) {
        if (!vwb.m200296J(list) && !vwb.m200296J(f26495n) && list.size() == f26495n.size()) {
            for (int i = 0; i < list.size(); i++) {
                f26495n.get(i).tags = vwb.m200299M((String) list.get(i));
            }
            if (NullChecker.m81303a(f26494m)) {
                f26494m.run();
                this.f26501k = true;
            }
        }
        m66873d2();
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m66873d2() {
        if (!this.f26501k && NullChecker.m81303a(f26496o)) {
            f26496o.run();
            f26496o = null;
        }
        super.m66873d2();
        f26494m = null;
        f26495n = null;
    }

    @Override // com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f26497g = getIntent().getStringArrayListExtra("ext_url");
        this.f26498h = getIntent().getStringArrayListExtra("ext_tag");
        UrlTagsHolder urlTagsHolder = (UrlTagsHolder) getIntent().getSerializableExtra("ext_url_tags");
        if (urlTagsHolder != null) {
            this.f26499i = urlTagsHolder.urlTags;
        }
    }

    @Override // com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        duringCreated(this.f26500j).subscribe(mkd0.m154955G(new e30() { // from class: l.ysh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f199770a.m43223w2((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q2 */
    public ArrayList<String> m43224q2() {
        return this.f26498h;
    }

    /* JADX INFO: renamed from: s2 */
    public ArrayList<String> m43225s2() {
        return this.f26497g;
    }

    /* JADX INFO: renamed from: u2 */
    public List<UrlTag> m43226u2() {
        return this.f26499i;
    }
}
