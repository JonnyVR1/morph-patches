package p153l;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.data.CardButtonsShowAndHideType;
import com.p051p1.mobile.putong.core.data.TagCategories;
import com.p051p1.mobile.putong.core.data.UserTagData;
import com.p051p1.mobile.putong.core.data.UserTagsData;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public abstract class rwa0 extends ep90 {
    public rwa0(@NonNull @NotNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ Boolean m183347R(UserTagData userTagData, TagCategories tagCategories) {
        String str = tagCategories.f21256id;
        List<String> list = userTagData.categories;
        return Boolean.valueOf(TextUtils.equals(str, list.get(list.size() - 1)));
    }

    /* JADX INFO: renamed from: T */
    public View mo112170T(UserTagsData userTagsData, final UserTagData userTagData) {
        View viewInflate = mo53983O().act().inflater().inflate(kec0.f125523Ma, (ViewGroup) null);
        final VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(adc0.f70031N5);
        VText vText = (VText) viewInflate.findViewById(adc0.f70409je);
        VText vText2 = (VText) viewInflate.findViewById(adc0.f70273bd);
        if (gra.m131596L3()) {
            viewInflate.setBackgroundResource(dbc0.f86175G6);
        }
        if (!TextUtils.isEmpty(userTagData.icon)) {
            vDraweeView.post(new Runnable() { // from class: l.qwa0
                @Override // java.lang.Runnable
                public final void run() {
                    uqb0.f180374G.m127115L0(vDraweeView, userTagData.icon);
                }
            });
        }
        vText.setTypeface(Typeface.DEFAULT_BOLD);
        vText.setText(userTagData.title);
        if (TextUtils.isEmpty(userTagData.subtitle)) {
            bnl0.m105524M(vText2, false);
            return viewInflate;
        }
        vText2.setText(userTagData.subtitle);
        bnl0.m105524M(vText2, true);
        return viewInflate;
    }

    /* JADX INFO: renamed from: U */
    public List<View> m183349U(UserTagsData userTagsData) {
        if (!NullChecker.m82486a(userTagsData)) {
            return null;
        }
        List<UserTagData> list = userTagsData.tags;
        ArrayList arrayList = new ArrayList();
        for (UserTagData userTagData : list) {
            if (NullChecker.m82486a(userTagData)) {
                arrayList.add(mo112170T(userTagsData, userTagData));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: V */
    public void m183350V(boolean z) {
        if (mo53983O().mo53472m3(mo53983O().mo52252K2()) || "from_guess_liker_result".equals(mo53983O().from())) {
            return;
        }
        if (z) {
            sfj0.m185601h("e_profile_check_all_tag", OMSDialogPositon.p_suggest_user_profile_info_view, new sfj0.C20032a[0]);
        } else {
            sfj0.m185596c("e_profile_check_all_tag", OMSDialogPositon.p_suggest_user_profile_info_view, new sfj0.C20032a[0]);
        }
    }

    /* JADX INFO: renamed from: W */
    public void m183351W(UserTagsData userTagsData, final UserTagData userTagData, boolean z) {
        if (mo53983O().mo53472m3(mo53983O().mo52252K2()) || "from_guess_liker_result".equals(mo53983O().from())) {
            return;
        }
        TagCategories tagCategories = (TagCategories) jyb.m147529r(userTagsData.tagCategories, new qcj() { // from class: l.pwa0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return rwa0.m183347R(userTagData, (TagCategories) obj);
            }
        });
        String str = tagCategories == null ? CardButtonsShowAndHideType.unknow : tagCategories.name;
        if (z) {
            sfj0.m185601h("e_profile_tag", OMSDialogPositon.p_suggest_user_profile_info_view, sfj0.C20032a.m185615h("personal_tag_name", userTagData.title), sfj0.C20032a.m185615h("personal_tag_category", str), sfj0.C20032a.m185616i("is_common_personal_tag", userTagData.highlighted));
        } else {
            sfj0.m185596c("e_profile_tag", OMSDialogPositon.p_suggest_user_profile_info_view, sfj0.C20032a.m185615h("personal_tag_name", userTagData.title), sfj0.C20032a.m185615h("personal_tag_category", str), sfj0.C20032a.m185616i("is_common_personal_tag", userTagData.highlighted));
        }
    }
}
