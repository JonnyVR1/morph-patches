package p009l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C0034d;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p000p1.mobile.putong.core.newui.home.views.CardBottomTagLayout;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.NewTags;
import com.p1.mobile.putong.core.data.TagCategories;
import com.p1.mobile.putong.data.Extensions;
import com.p1.mobile.putong.data.Interest;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.Tag;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.o6j0;
import l.sa40;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class e5j extends wl2 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.wl2
    /* JADX INFO: renamed from: c */
    public void mo11838c(C0034d c0034d, View view, FrameLayout frameLayout, int i, Context context) {
        super.mo11838c(c0034d, view, frameLayout, i, context);
        if (view instanceof CardBottomTagLayout) {
            CardBottomTagLayout cardBottomTagLayout = (CardBottomTagLayout) view;
            m24310k(cardBottomTagLayout.f2357c, c0034d, i);
            C0034d.a aVar = c0034d.f815j;
            List<String> list = aVar.f824g;
            sa40.h hVar = aVar.f823f;
            if (IntlCountryCodeController.v()) {
                VText vText = cardBottomTagLayout.f2360f;
                int i2 = t100.Q;
                xdl0.W(vText, i2);
                xdl0.W(cardBottomTagLayout.f2361g, i2);
            }
            cardBottomTagLayout.f2359e.setVisibility(0);
            cardBottomTagLayout.f2362h.setVisibility(8);
            if (c0034d.f815j.f821d.size() > 0) {
                cardBottomTagLayout.f2360f.setText(c0034d.f815j.f821d.get(0));
            }
            if (c0034d.f815j.f821d.size() > 1) {
                cardBottomTagLayout.f2361g.setText(c0034d.f815j.f821d.get(1));
            }
            xdl0.M(cardBottomTagLayout.f2360f, c0034d.f815j.f821d.size() > 0);
            xdl0.M(cardBottomTagLayout.f2361g, c0034d.f815j.f821d.size() > 1);
            if (c0034d.f815j.f821d.size() == 0) {
                c0034d.m1466w(CardBottomFrame.TAG, t100.d(86.0f));
            }
        }
    }

    @Override // p009l.wl2
    /* JADX INFO: renamed from: j */
    public void mo13735j(C0034d c0034d, rj4 rj4Var, int i) {
        super.mo13735j(c0034d, rj4Var, i);
        if (rj4Var.m21680c() instanceof CardBottomTagLayout) {
            if (m13737r(c0034d.getUser(), c0034d)) {
                m13738s(c0034d);
            } else {
                lra0.m17995i(c0034d.f815j.f822e);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m13736q(User user, String str, final String str2, Map<String, String> map, List<String> list) {
        ArrayList arrayListN = vwb.n(user.profile.tags, new w9j() { // from class: l.c5j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((Tag) obj).category, str2));
            }
        });
        List listN = NullChecker.a(CoreModule.c.e0.p9()) ? vwb.n(CoreModule.c.e0.p9().profile.tags, new w9j() { // from class: l.d5j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((Tag) obj).category, str2));
            }
        }) : Collections.EMPTY_LIST;
        listN.retainAll(arrayListN);
        if (!listN.isEmpty()) {
            arrayListN.removeAll(listN);
            arrayListN.addAll(0, listN);
        }
        if (vwb.J(arrayListN)) {
            return;
        }
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < arrayListN.size(); i++) {
            Tag tag = (Tag) arrayListN.get(i);
            if (i != 0) {
                sb.append("、");
            }
            sb.append(tag.value);
        }
        map.put(str2, sb.substring(str.length(), sb.length()));
        list.add(sb.toString());
    }

    /* JADX INFO: renamed from: r */
    public boolean m13737r(User user, C0034d c0034d) {
        Profile profile;
        Extensions extensions;
        Interest interest;
        if (user == null || (profile = user.profile) == null || (extensions = profile.extensions) == null || (interest = extensions.interest) == null) {
            return false;
        }
        List list = interest.tags;
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final void m13738s(C0034d c0034d) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        if (NullChecker.a(c0034d.f815j.f823f) && !c0034d.f815j.f823f.b().isEmpty()) {
            for (NewTags newTags : c0034d.f815j.f823f.b()) {
                if (!TextUtils.isEmpty(newTags.name)) {
                    sb2.append(newTags.name);
                    sb2.append(",");
                }
                if (newTags.localIsCommonLabel) {
                    sb3.append(newTags.name);
                    sb3.append(",");
                }
                if (!newTags.localTagCategories.isEmpty()) {
                    for (TagCategories tagCategories : newTags.localTagCategories) {
                        if (!TextUtils.isEmpty(tagCategories.name)) {
                            sb.append(tagCategories.name);
                            sb.append(",");
                        }
                    }
                }
            }
        }
        o6j0.h("e_card_personal_tag", "p_suggest_users_home_view", new o6j0.a[]{o6j0.a.h("receiver_user_id", ((DbObject) c0034d.getUser()).id), o6j0.a.h("personal_tag_category", sb.toString()), o6j0.a.h("personal_tag_name", sb2.toString()), o6j0.a.h("common_personal_tag", sb3.toString())});
    }

    @Override // p009l.fol
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public boolean mo11837a(C0034d c0034d, int i, CardBottomFrame cardBottomFrame, Context context) {
        sa40.h hVarP;
        User user = c0034d.getUser();
        if (user == null) {
            return false;
        }
        c0034d.m1466w(CardBottomFrame.TAG, t100.d(80.0f));
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        List<String> arrayList2 = user.profile.extensions.interest.tags;
        if (user.isMe()) {
            arrayList2 = new ArrayList<>();
        }
        map.clear();
        map.put("userId", ((DbObject) c0034d.getUser()).id);
        if (vwb.J(arrayList2)) {
            hVarP = null;
        } else {
            hVarP = sa40.o().P(arrayList2);
            if (hVarP.a && !hVarP.b().isEmpty()) {
                List listB = hVarP.b();
                String string = context.getString(R.string.S0);
                StringBuilder sb = new StringBuilder(string);
                for (int i2 = 0; i2 < listB.size(); i2++) {
                    NewTags newTags = (NewTags) listB.get(i2);
                    if (i2 != 0) {
                        sb.append("、");
                    }
                    sb.append(newTags.name);
                }
                map.put("newTags", sb.substring(string.length(), sb.length()));
                arrayList.add(sb.toString());
                C0034d.a aVar = c0034d.f815j;
                aVar.f824g = arrayList2;
                aVar.f823f = hVarP;
                aVar.f821d = arrayList;
                aVar.f822e = map;
                return true;
            }
        }
        sa40.h hVar = hVarP;
        m13736q(user, context.getString(R.string.S0), "sports", map, arrayList);
        m13736q(user, context.getString(R.string.R0), "places", map, arrayList);
        m13736q(user, context.getString(R.string.U0), "movies", map, arrayList);
        m13736q(user, context.getString(R.string.S0), "literature", map, arrayList);
        m13736q(user, context.getString(R.string.S0), "music", map, arrayList);
        m13736q(user, context.getString(R.string.T0), "food", map, arrayList);
        C0034d.a aVar2 = c0034d.f815j;
        aVar2.f824g = arrayList2;
        aVar2.f823f = hVar;
        aVar2.f821d = arrayList;
        aVar2.f822e = map;
        return !arrayList.isEmpty();
    }
}
