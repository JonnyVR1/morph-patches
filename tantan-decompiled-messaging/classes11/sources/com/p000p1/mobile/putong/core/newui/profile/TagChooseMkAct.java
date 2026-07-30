package com.p000p1.mobile.putong.core.newui.profile;

import android.content.Intent;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.newui.profile.TagChooseMkAct;
import com.p000p1.mobile.putong.p004ui.webview.p007mk.MkWebViewAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.UrlTag;
import com.p1.mobile.putong.core.data.UrlTagsHolder;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.mkd0;
import l.vwb;
import p009l.juk;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class TagChooseMkAct extends MkWebViewAct {

    /* JADX INFO: renamed from: l */
    public static final String f5271l;

    /* JADX INFO: renamed from: m */
    public static Runnable f5272m;

    /* JADX INFO: renamed from: n */
    public static List<Media> f5273n;

    /* JADX INFO: renamed from: o */
    public static Runnable f5274o;

    /* JADX INFO: renamed from: g */
    public ArrayList<String> f5275g = new ArrayList<>();

    /* JADX INFO: renamed from: h */
    public ArrayList<String> f5276h = new ArrayList<>();

    /* JADX INFO: renamed from: i */
    public List<UrlTag> f5277i = new ArrayList();

    /* JADX INFO: renamed from: j */
    public a<List<String>> f5278j = a.b();

    /* JADX INFO: renamed from: k */
    public boolean f5279k;

    static {
        f5271l = (juk.m17221e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/dating-optimization-tags/index.html?speed=true&_bid=1004745&hideNavigationBar=1&hideNotch=1&preview=true&picIdxList=%s&showAddTagBtn=false&datingTagsFrom=%s&tabId=%s#/tagEditing");
    }

    /* JADX INFO: renamed from: n2 */
    public static /* synthetic */ void m7439n2(Act act, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, List list) {
        act.progressDismiss();
        UrlTagsHolder urlTagsHolder = new UrlTagsHolder();
        urlTagsHolder.urlTags = list;
        Intent intentM7441p2 = m7441p2(act, arrayList, arrayList2, arrayList3, urlTagsHolder, str);
        if (intentM7441p2 != null) {
            act.startActivity(intentM7441p2);
        }
    }

    /* JADX INFO: renamed from: o2 */
    public static /* synthetic */ void m7440o2(Act act, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, Throwable th) {
        act.progressDismiss();
        Intent intentM7441p2 = m7441p2(act, arrayList, arrayList2, arrayList3, null, str);
        if (intentM7441p2 != null) {
            act.startActivity(intentM7441p2);
        }
    }

    /* JADX INFO: renamed from: p2 */
    public static Intent m7441p2(Act act, ArrayList<Integer> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3, UrlTagsHolder urlTagsHolder, String str) {
        if (vwb.J(arrayList) || vwb.J(arrayList2) || arrayList.size() != arrayList2.size() || arrayList.size() != arrayList3.size()) {
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
        Intent intentM10586d2 = MkWebViewAct.m10586d2(act, "", String.format(f5271l, sb, "", str), true, true, true, null);
        intentM10586d2.setClass(act, TagChooseMkAct.class);
        intentM10586d2.putExtra("hideNotch", true);
        intentM10586d2.putIntegerArrayListExtra("ext_position", arrayList);
        intentM10586d2.putStringArrayListExtra("ext_url", arrayList2);
        intentM10586d2.putStringArrayListExtra("ext_tag", arrayList3);
        intentM10586d2.putExtra("ext_url_tags", (Serializable) urlTagsHolder);
        return intentM10586d2;
    }

    /* JADX INFO: renamed from: r2 */
    public static String m7442r2(Media media) {
        if (media instanceof Picture) {
            return media.url;
        }
        return media instanceof Video ? ((Media) media.cover()).url : "";
    }

    /* JADX INFO: renamed from: v2 */
    public static void m7443v2(final Act act, List<Media> list, final String str, Runnable runnable, Runnable runnable2) {
        f5272m = runnable;
        f5273n = list;
        f5274o = runnable2;
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < f5273n.size(); i++) {
            Media media = f5273n.get(i);
            arrayList.add(Integer.valueOf(i));
            arrayList2.add(m7442r2(media));
            arrayList3.add(!vwb.J(media.tags) ? (String) media.tags.get(0) : "");
        }
        if (CoreModule.P().a().f4()) {
            act.progress("处理中...");
            act.duringCreated(CoreModule.c.e0.D7(arrayList2)).subscribe(mkd0.H(new e30() { // from class: l.zsh0
                public final void call(Object obj) {
                    TagChooseMkAct.m7439n2(act, arrayList, arrayList2, arrayList3, str, (List) obj);
                }
            }, new e30() { // from class: l.ath0
                public final void call(Object obj) {
                    TagChooseMkAct.m7440o2(act, arrayList, arrayList2, arrayList3, str, (Throwable) obj);
                }
            }));
        } else {
            Intent intentM7441p2 = m7441p2(act, arrayList, arrayList2, arrayList3, null, str);
            if (intentM7441p2 == null) {
                return;
            }
            act.startActivity(intentM7441p2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w2 */
    public /* synthetic */ void m7444w2(List list) {
        if (!vwb.J(list) && !vwb.J(f5273n) && list.size() == f5273n.size()) {
            for (int i = 0; i < list.size(); i++) {
                f5273n.get(i).tags = vwb.M((String) list.get(i));
            }
            if (NullChecker.a(f5272m)) {
                f5272m.run();
                this.f5279k = true;
            }
        }
        finish();
    }

    public void finish() {
        if (!this.f5279k && NullChecker.a(f5274o)) {
            f5274o.run();
            f5274o = null;
        }
        super/*com.p1.mobile.android.app.Act*/.finish();
        f5272m = null;
        f5273n = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.p004ui.webview.p007mk.MkWebViewAct
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f5275g = getIntent().getStringArrayListExtra("ext_url");
        this.f5276h = getIntent().getStringArrayListExtra("ext_tag");
        UrlTagsHolder serializableExtra = getIntent().getSerializableExtra("ext_url_tags");
        if (serializableExtra != null) {
            this.f5277i = serializableExtra.urlTags;
        }
    }

    @Override // com.p000p1.mobile.putong.p004ui.webview.p007mk.MkWebViewAct
    public void initSubscription() {
        super.initSubscription();
        duringCreated(this.f5278j).subscribe(mkd0.G(new e30() { // from class: l.ysh0
            public final void call(Object obj) {
                this.f23221a.m7444w2((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q2 */
    public ArrayList<String> m7445q2() {
        return this.f5276h;
    }

    /* JADX INFO: renamed from: s2 */
    public ArrayList<String> m7446s2() {
        return this.f5275g;
    }

    /* JADX INFO: renamed from: u2 */
    public List<UrlTag> m7447u2() {
        return this.f5277i;
    }
}
