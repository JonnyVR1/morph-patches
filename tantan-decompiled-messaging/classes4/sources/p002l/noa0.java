package p002l;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.core.data.TagCategories;
import com.p1.mobile.putong.core.data.UserTagData;
import com.p1.mobile.putong.core.data.UserTagsData;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.f6c0;
import l.mcr;
import l.o6j0;
import l.qib0;
import l.u4c0;
import l.upa;
import l.vwb;
import l.w9j;
import l.x2c0;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class noa0 extends ah90 {
    public noa0(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ Boolean m18875R(UserTagData userTagData, TagCategories tagCategories) {
        String str = tagCategories.id;
        List list = userTagData.categories;
        return Boolean.valueOf(TextUtils.equals(str, (CharSequence) list.get(list.size() - 1)));
    }

    /* JADX INFO: renamed from: T */
    public View mo18877T(UserTagsData userTagsData, final UserTagData userTagData) {
        View viewInflate = mo3351O().act().inflater().inflate(f6c0.Fa, (ViewGroup) null);
        final VDraweeView vDraweeViewFindViewById = viewInflate.findViewById(u4c0.L5);
        VText vTextFindViewById = viewInflate.findViewById(u4c0.ge);
        VText vTextFindViewById2 = viewInflate.findViewById(u4c0.Zc);
        if (upa.L3()) {
            viewInflate.setBackgroundResource(x2c0.F6);
        }
        if (!TextUtils.isEmpty(userTagData.icon)) {
            vDraweeViewFindViewById.post(new Runnable() { // from class: l.moa0
                @Override // java.lang.Runnable
                public final void run() {
                    qib0.G.L0(vDraweeViewFindViewById, userTagData.icon);
                }
            });
        }
        vTextFindViewById.setTypeface(Typeface.DEFAULT_BOLD);
        vTextFindViewById.setText(userTagData.title);
        if (TextUtils.isEmpty(userTagData.subtitle)) {
            xdl0.M(vTextFindViewById2, false);
            return viewInflate;
        }
        vTextFindViewById2.setText(userTagData.subtitle);
        xdl0.M(vTextFindViewById2, true);
        return viewInflate;
    }

    /* JADX INFO: renamed from: U */
    public List<View> m18878U(UserTagsData userTagsData) {
        if (!NullChecker.a(userTagsData)) {
            return null;
        }
        List<UserTagData> list = userTagsData.tags;
        ArrayList arrayList = new ArrayList();
        for (UserTagData userTagData : list) {
            if (NullChecker.a(userTagData)) {
                arrayList.add(mo18877T(userTagsData, userTagData));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: V */
    public void m18879V(boolean z) {
        if (mo3351O().mo2821m3(mo3351O().mo1517K2()) || "from_guess_liker_result".equals(mo3351O().from())) {
            return;
        }
        if (z) {
            o6j0.h("e_profile_check_all_tag", "p_suggest_user_profile_info_view", new o6j0.a[0]);
        } else {
            o6j0.c("e_profile_check_all_tag", "p_suggest_user_profile_info_view", new o6j0.a[0]);
        }
    }

    /* JADX INFO: renamed from: W */
    public void m18880W(UserTagsData userTagsData, final UserTagData userTagData, boolean z) {
        if (mo3351O().mo2821m3(mo3351O().mo1517K2()) || "from_guess_liker_result".equals(mo3351O().from())) {
            return;
        }
        TagCategories tagCategories = (TagCategories) vwb.r(userTagsData.tagCategories, new w9j() { // from class: l.loa0
            public final Object call(Object obj) {
                return noa0.m18875R(userTagData, (TagCategories) obj);
            }
        });
        String str = tagCategories == null ? "unknow" : tagCategories.name;
        if (z) {
            o6j0.h("e_profile_tag", "p_suggest_user_profile_info_view", new o6j0.a[]{o6j0.a.h("personal_tag_name", userTagData.title), o6j0.a.h("personal_tag_category", str), o6j0.a.i("is_common_personal_tag", userTagData.highlighted)});
        } else {
            o6j0.c("e_profile_tag", "p_suggest_user_profile_info_view", new o6j0.a[]{o6j0.a.h("personal_tag_name", userTagData.title), o6j0.a.h("personal_tag_category", str), o6j0.a.i("is_common_personal_tag", userTagData.highlighted)});
        }
    }
}
