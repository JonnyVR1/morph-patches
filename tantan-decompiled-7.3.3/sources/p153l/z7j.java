package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.NewTags;
import com.p051p1.mobile.putong.core.data.TagCategories;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C8021d;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomTagLayout;
import com.p051p1.mobile.putong.data.Extensions;
import com.p051p1.mobile.putong.data.Interest;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.Tag;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class z7j extends em2 {
    @Override // p153l.em2
    /* JADX INFO: renamed from: c */
    public void mo96365c(C8021d c8021d, View view, FrameLayout frameLayout, int i, Context context) {
        super.mo96365c(c8021d, view, frameLayout, i, context);
        if (view instanceof CardBottomTagLayout) {
            CardBottomTagLayout cardBottomTagLayout = (CardBottomTagLayout) view;
            m121321k(cardBottomTagLayout.f24321c, c8021d, i);
            C8021d.a aVar = c8021d.f22779j;
            List<String> list = aVar.f22788g;
            gj40.C17227h c17227h = aVar.f22787f;
            if (IntlCountryCodeController.m29125v()) {
                VText vText = cardBottomTagLayout.f24324f;
                int i2 = qa00.f156304Q;
                bnl0.m105539W(vText, i2);
                bnl0.m105539W(cardBottomTagLayout.f24325g, i2);
            }
            cardBottomTagLayout.f24323e.setVisibility(0);
            cardBottomTagLayout.f24326h.setVisibility(8);
            if (c8021d.f22779j.f22785d.size() > 0) {
                cardBottomTagLayout.f24324f.setText(c8021d.f22779j.f22785d.get(0));
            }
            if (c8021d.f22779j.f22785d.size() > 1) {
                cardBottomTagLayout.f24325g.setText(c8021d.f22779j.f22785d.get(1));
            }
            bnl0.m105524M(cardBottomTagLayout.f24324f, c8021d.f22779j.f22785d.size() > 0);
            bnl0.m105524M(cardBottomTagLayout.f24325g, c8021d.f22779j.f22785d.size() > 1);
            if (c8021d.f22779j.f22785d.size() == 0) {
                c8021d.m38498w(CardBottomFrame.TAG, qa00.m175859d(86.0f));
            }
        }
    }

    @Override // p153l.em2
    /* JADX INFO: renamed from: j */
    public void mo96367j(C8021d c8021d, qk4 qk4Var, int i) {
        super.mo96367j(c8021d, qk4Var, i);
        if (qk4Var.m176921c() instanceof CardBottomTagLayout) {
            if (m218900r(c8021d.getUser(), c8021d)) {
                m218901s(c8021d);
            } else {
                pza0.m174357i(c8021d.f22779j.f22786e);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m218899q(User user, String str, final String str2, Map<String, String> map, List<String> list) {
        ArrayList arrayListM147522n = jyb.m147522n(user.profile.tags, new qcj() { // from class: l.x7j
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((Tag) obj).category, str2));
            }
        });
        List listM147522n = NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116600p9()) ? jyb.m147522n(CoreModule.f18264c.f20381e0.m116600p9().profile.tags, new qcj() { // from class: l.y7j
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((Tag) obj).category, str2));
            }
        }) : Collections.EMPTY_LIST;
        listM147522n.retainAll(arrayListM147522n);
        if (!listM147522n.isEmpty()) {
            arrayListM147522n.removeAll(listM147522n);
            arrayListM147522n.addAll(0, listM147522n);
        }
        if (jyb.m147479J(arrayListM147522n)) {
            return;
        }
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < arrayListM147522n.size(); i++) {
            Tag tag = (Tag) arrayListM147522n.get(i);
            if (i != 0) {
                sb.append("、");
            }
            sb.append(tag.value);
        }
        map.put(str2, sb.substring(str.length(), sb.length()));
        list.add(sb.toString());
    }

    /* JADX INFO: renamed from: r */
    public boolean m218900r(User user, C8021d c8021d) {
        Profile profile;
        Extensions extensions;
        Interest interest;
        if (user == null || (profile = user.profile) == null || (extensions = profile.extensions) == null || (interest = extensions.interest) == null) {
            return false;
        }
        List<String> list = interest.tags;
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final void m218901s(C8021d c8021d) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        if (NullChecker.m82486a(c8021d.f22779j.f22787f) && !c8021d.f22779j.f22787f.m130460b().isEmpty()) {
            for (NewTags newTags : c8021d.f22779j.f22787f.m130460b()) {
                if (!TextUtils.isEmpty(newTags.name)) {
                    sb2.append(newTags.name);
                    sb2.append(Constants.SEPARATOR_COMMA);
                }
                if (newTags.localIsCommonLabel) {
                    sb3.append(newTags.name);
                    sb3.append(Constants.SEPARATOR_COMMA);
                }
                if (!newTags.localTagCategories.isEmpty()) {
                    for (TagCategories tagCategories : newTags.localTagCategories) {
                        if (!TextUtils.isEmpty(tagCategories.name)) {
                            sb.append(tagCategories.name);
                            sb.append(Constants.SEPARATOR_COMMA);
                        }
                    }
                }
            }
        }
        sfj0.m185601h("e_card_personal_tag", "p_suggest_users_home_view", sfj0.C20032a.m185615h("receiver_user_id", c8021d.getUser().f56859id), sfj0.C20032a.m185615h("personal_tag_category", sb.toString()), sfj0.C20032a.m185615h("personal_tag_name", sb2.toString()), sfj0.C20032a.m185615h("common_personal_tag", sb3.toString()));
    }

    @Override // p153l.qql
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public boolean mo96364a(C8021d c8021d, int i, CardBottomFrame cardBottomFrame, Context context) {
        gj40.C17227h c17227hM130431P;
        User user = c8021d.getUser();
        if (user == null) {
            return false;
        }
        c8021d.m38498w(CardBottomFrame.TAG, qa00.m175859d(80.0f));
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        List<String> arrayList2 = user.profile.extensions.interest.tags;
        if (user.isMe()) {
            arrayList2 = new ArrayList<>();
        }
        map.clear();
        map.put("userId", c8021d.getUser().f56859id);
        if (jyb.m147479J(arrayList2)) {
            c17227hM130431P = null;
        } else {
            c17227hM130431P = gj40.m130415o().m130431P(arrayList2);
            if (c17227hM130431P.f104596a && !c17227hM130431P.m130460b().isEmpty()) {
                List<NewTags> listM130460b = c17227hM130431P.m130460b();
                String string = context.getString(R$string.f18837S0);
                StringBuilder sb = new StringBuilder(string);
                for (int i2 = 0; i2 < listM130460b.size(); i2++) {
                    NewTags newTags = listM130460b.get(i2);
                    if (i2 != 0) {
                        sb.append("、");
                    }
                    sb.append(newTags.name);
                }
                map.put("newTags", sb.substring(string.length(), sb.length()));
                arrayList.add(sb.toString());
                C8021d.a aVar = c8021d.f22779j;
                aVar.f22788g = arrayList2;
                aVar.f22787f = c17227hM130431P;
                aVar.f22785d = arrayList;
                aVar.f22786e = map;
                return true;
            }
        }
        gj40.C17227h c17227h = c17227hM130431P;
        m218899q(user, context.getString(R$string.f18837S0), "sports", map, arrayList);
        m218899q(user, context.getString(R$string.f18807R0), "places", map, arrayList);
        m218899q(user, context.getString(R$string.f18897U0), "movies", map, arrayList);
        m218899q(user, context.getString(R$string.f18837S0), "literature", map, arrayList);
        m218899q(user, context.getString(R$string.f18837S0), "music", map, arrayList);
        m218899q(user, context.getString(R$string.f18867T0), "food", map, arrayList);
        C8021d.a aVar2 = c8021d.f22779j;
        aVar2.f22788g = arrayList2;
        aVar2.f22787f = c17227h;
        aVar2.f22785d = arrayList;
        aVar2.f22786e = map;
        return !arrayList.isEmpty();
    }
}
