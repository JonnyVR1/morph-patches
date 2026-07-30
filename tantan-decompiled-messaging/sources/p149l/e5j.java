package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.NewTags;
import com.p046p1.mobile.putong.core.data.TagCategories;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C7870d;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomTagLayout;
import com.p046p1.mobile.putong.data.Extensions;
import com.p046p1.mobile.putong.data.Interest;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.Tag;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class e5j extends wl2 {
    @Override // p149l.wl2
    /* JADX INFO: renamed from: c */
    public void mo100261c(C7870d c7870d, View view, FrameLayout frameLayout, int i, Context context) {
        super.mo100261c(c7870d, view, frameLayout, i, context);
        if (view instanceof CardBottomTagLayout) {
            CardBottomTagLayout cardBottomTagLayout = (CardBottomTagLayout) view;
            m203741k(cardBottomTagLayout.f23579c, c7870d, i);
            C7870d.a aVar = c7870d.f22037j;
            List<String> list = aVar.f22046g;
            sa40.C19884h c19884h = aVar.f22045f;
            if (IntlCountryCodeController.m28126v()) {
                VText vText = cardBottomTagLayout.f23582f;
                int i2 = t100.f167242Q;
                xdl0.m208359W(vText, i2);
                xdl0.m208359W(cardBottomTagLayout.f23583g, i2);
            }
            cardBottomTagLayout.f23581e.setVisibility(0);
            cardBottomTagLayout.f23584h.setVisibility(8);
            if (c7870d.f22037j.f22043d.size() > 0) {
                cardBottomTagLayout.f23582f.setText(c7870d.f22037j.f22043d.get(0));
            }
            if (c7870d.f22037j.f22043d.size() > 1) {
                cardBottomTagLayout.f23583g.setText(c7870d.f22037j.f22043d.get(1));
            }
            xdl0.m208344M(cardBottomTagLayout.f23582f, c7870d.f22037j.f22043d.size() > 0);
            xdl0.m208344M(cardBottomTagLayout.f23583g, c7870d.f22037j.f22043d.size() > 1);
            if (c7870d.f22037j.f22043d.size() == 0) {
                c7870d.m37495w(CardBottomFrame.TAG, t100.m186890d(86.0f));
            }
        }
    }

    @Override // p149l.wl2
    /* JADX INFO: renamed from: j */
    public void mo114808j(C7870d c7870d, rj4 rj4Var, int i) {
        super.mo114808j(c7870d, rj4Var, i);
        if (rj4Var.m179548c() instanceof CardBottomTagLayout) {
            if (m114810r(c7870d.getUser(), c7870d)) {
                m114811s(c7870d);
            } else {
                lra0.m151150i(c7870d.f22037j.f22044e);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m114809q(User user, String str, final String str2, Map<String, String> map, List<String> list) {
        ArrayList arrayListM200339n = vwb.m200339n(user.profile.tags, new w9j() { // from class: l.c5j
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((Tag) obj).category, str2));
            }
        });
        List listM200339n = NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169527p9()) ? vwb.m200339n(CoreModule.f17545c.f19639e0.m169527p9().profile.tags, new w9j() { // from class: l.d5j
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((Tag) obj).category, str2));
            }
        }) : Collections.EMPTY_LIST;
        listM200339n.retainAll(arrayListM200339n);
        if (!listM200339n.isEmpty()) {
            arrayListM200339n.removeAll(listM200339n);
            arrayListM200339n.addAll(0, listM200339n);
        }
        if (vwb.m200296J(arrayListM200339n)) {
            return;
        }
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < arrayListM200339n.size(); i++) {
            Tag tag = (Tag) arrayListM200339n.get(i);
            if (i != 0) {
                sb.append("、");
            }
            sb.append(tag.value);
        }
        map.put(str2, sb.substring(str.length(), sb.length()));
        list.add(sb.toString());
    }

    /* JADX INFO: renamed from: r */
    public boolean m114810r(User user, C7870d c7870d) {
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
    public final void m114811s(C7870d c7870d) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        if (NullChecker.m81303a(c7870d.f22037j.f22045f) && !c7870d.f22037j.f22045f.m182847b().isEmpty()) {
            for (NewTags newTags : c7870d.f22037j.f22045f.m182847b()) {
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
        o6j0.m162864h("e_card_personal_tag", "p_suggest_users_home_view", o6j0.C18854a.m162878h("receiver_user_id", c7870d.getUser().f56011id), o6j0.C18854a.m162878h("personal_tag_category", sb.toString()), o6j0.C18854a.m162878h("personal_tag_name", sb2.toString()), o6j0.C18854a.m162878h("common_personal_tag", sb3.toString()));
    }

    @Override // p149l.fol
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public boolean mo100260a(C7870d c7870d, int i, CardBottomFrame cardBottomFrame, Context context) {
        sa40.C19884h c19884hM182818P;
        User user = c7870d.getUser();
        if (user == null) {
            return false;
        }
        c7870d.m37495w(CardBottomFrame.TAG, t100.m186890d(80.0f));
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        List<String> arrayList2 = user.profile.extensions.interest.tags;
        if (user.isMe()) {
            arrayList2 = new ArrayList<>();
        }
        map.clear();
        map.put("userId", c7870d.getUser().f56011id);
        if (vwb.m200296J(arrayList2)) {
            c19884hM182818P = null;
        } else {
            c19884hM182818P = sa40.m182802o().m182818P(arrayList2);
            if (c19884hM182818P.f163299a && !c19884hM182818P.m182847b().isEmpty()) {
                List<NewTags> listM182847b = c19884hM182818P.m182847b();
                String string = context.getString(R$string.f18107S0);
                StringBuilder sb = new StringBuilder(string);
                for (int i2 = 0; i2 < listM182847b.size(); i2++) {
                    NewTags newTags = listM182847b.get(i2);
                    if (i2 != 0) {
                        sb.append("、");
                    }
                    sb.append(newTags.name);
                }
                map.put("newTags", sb.substring(string.length(), sb.length()));
                arrayList.add(sb.toString());
                C7870d.a aVar = c7870d.f22037j;
                aVar.f22046g = arrayList2;
                aVar.f22045f = c19884hM182818P;
                aVar.f22043d = arrayList;
                aVar.f22044e = map;
                return true;
            }
        }
        sa40.C19884h c19884h = c19884hM182818P;
        m114809q(user, context.getString(R$string.f18107S0), "sports", map, arrayList);
        m114809q(user, context.getString(R$string.f18077R0), "places", map, arrayList);
        m114809q(user, context.getString(R$string.f18167U0), "movies", map, arrayList);
        m114809q(user, context.getString(R$string.f18107S0), "literature", map, arrayList);
        m114809q(user, context.getString(R$string.f18107S0), "music", map, arrayList);
        m114809q(user, context.getString(R$string.f18137T0), "food", map, arrayList);
        C7870d.a aVar2 = c7870d.f22037j;
        aVar2.f22046g = arrayList2;
        aVar2.f22045f = c19884h;
        aVar2.f22043d = arrayList;
        aVar2.f22044e = map;
        return !arrayList.isEmpty();
    }
}
