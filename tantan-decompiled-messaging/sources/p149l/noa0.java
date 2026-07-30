package p149l;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.data.CardButtonsShowAndHideType;
import com.p046p1.mobile.putong.core.data.TagCategories;
import com.p046p1.mobile.putong.core.data.UserTagData;
import com.p046p1.mobile.putong.core.data.UserTagsData;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public abstract class noa0 extends ah90 {
    public noa0(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ Boolean m160401R(UserTagData userTagData, TagCategories tagCategories) {
        String str = tagCategories.f20514id;
        List<String> list = userTagData.categories;
        return Boolean.valueOf(TextUtils.equals(str, list.get(list.size() - 1)));
    }

    /* JADX INFO: renamed from: T */
    public View mo160403T(UserTagsData userTagsData, final UserTagData userTagData) {
        View viewInflate = mo52800O().act().inflater().inflate(f6c0.f95357Fa, (ViewGroup) null);
        final VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(u4c0.f173909L5);
        VText vText = (VText) viewInflate.findViewById(u4c0.f174268ge);
        VText vText2 = (VText) viewInflate.findViewById(u4c0.f174148Zc);
        if (upa.m194665L3()) {
            viewInflate.setBackgroundResource(x2c0.f189320F6);
        }
        if (!TextUtils.isEmpty(userTagData.icon)) {
            vDraweeView.post(new Runnable() { // from class: l.moa0
                @Override // java.lang.Runnable
                public final void run() {
                    qib0.f154691G.m102331L0(vDraweeView, userTagData.icon);
                }
            });
        }
        vText.setTypeface(Typeface.DEFAULT_BOLD);
        vText.setText(userTagData.title);
        if (TextUtils.isEmpty(userTagData.subtitle)) {
            xdl0.m208344M(vText2, false);
            return viewInflate;
        }
        vText2.setText(userTagData.subtitle);
        xdl0.m208344M(vText2, true);
        return viewInflate;
    }

    /* JADX INFO: renamed from: U */
    public List<View> m160404U(UserTagsData userTagsData) {
        if (!NullChecker.m81303a(userTagsData)) {
            return null;
        }
        List<UserTagData> list = userTagsData.tags;
        ArrayList arrayList = new ArrayList();
        for (UserTagData userTagData : list) {
            if (NullChecker.m81303a(userTagData)) {
                arrayList.add(mo160403T(userTagsData, userTagData));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: V */
    public void m160405V(boolean z) {
        if (mo52800O().mo52289m3(mo52800O().mo51069K2()) || "from_guess_liker_result".equals(mo52800O().from())) {
            return;
        }
        if (z) {
            o6j0.m162864h("e_profile_check_all_tag", OMSDialogPositon.p_suggest_user_profile_info_view, new o6j0.C18854a[0]);
        } else {
            o6j0.m162859c("e_profile_check_all_tag", OMSDialogPositon.p_suggest_user_profile_info_view, new o6j0.C18854a[0]);
        }
    }

    /* JADX INFO: renamed from: W */
    public void m160406W(UserTagsData userTagsData, final UserTagData userTagData, boolean z) {
        if (mo52800O().mo52289m3(mo52800O().mo51069K2()) || "from_guess_liker_result".equals(mo52800O().from())) {
            return;
        }
        TagCategories tagCategories = (TagCategories) vwb.m200346r(userTagsData.tagCategories, new w9j() { // from class: l.loa0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return noa0.m160401R(userTagData, (TagCategories) obj);
            }
        });
        String str = tagCategories == null ? CardButtonsShowAndHideType.unknow : tagCategories.name;
        if (z) {
            o6j0.m162864h("e_profile_tag", OMSDialogPositon.p_suggest_user_profile_info_view, o6j0.C18854a.m162878h("personal_tag_name", userTagData.title), o6j0.C18854a.m162878h("personal_tag_category", str), o6j0.C18854a.m162879i("is_common_personal_tag", userTagData.highlighted));
        } else {
            o6j0.m162859c("e_profile_tag", OMSDialogPositon.p_suggest_user_profile_info_view, o6j0.C18854a.m162878h("personal_tag_name", userTagData.title), o6j0.C18854a.m162878h("personal_tag_category", str), o6j0.C18854a.m162879i("is_common_personal_tag", userTagData.highlighted));
        }
    }
}
