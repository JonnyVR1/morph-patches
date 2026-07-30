package p149l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.NewTags;
import com.p046p1.mobile.putong.core.data.ProfileLikeType;
import com.p046p1.mobile.putong.core.data.Questions;
import com.p046p1.mobile.putong.core.data.UserHomeMode;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.CoreTaskCenterAct;
import com.p046p1.mobile.putong.core.p053ui.account.JailedDialogLikeAct;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.edit.MarryProfileEditAct;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.ProfileLoopFragAct;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class gzd0 extends kxd0 {

    /* JADX INFO: renamed from: a */
    public String f105125a = FirebaseAnalytics.Event.PURCHASE;

    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(w2e0 w2e0Var, f30<String, String> f30Var) {
        String strReplaceFirst = TextUtils.isEmpty(w2e0Var.m201099g()) ? "" : w2e0Var.m201099g().replaceFirst("/", "");
        String str = w2e0Var.m201098f().get("type");
        if (SchemeKey.edit.equals(strReplaceFirst) && "gameComposite".equals(str)) {
            w2e0Var.m201094b().startActivity(ProfileLoopFragAct.m51649Y1(w2e0Var.m201094b(), LoopInputType.GAME_CP));
        } else if (SchemeKey.edit.equals(strReplaceFirst) && ProfileLikeType.mbti.equals(str)) {
            w2e0Var.m201094b().startActivity(MkWebViewAct.m80240e2(w2e0Var.m201094b(), "", String.format(pj90.f149727o, "edit_profile"), true, true, true, true, null));
        } else {
            super.mo94421a(w2e0Var, f30Var);
        }
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(final w2e0 w2e0Var, f30<String, String> f30Var) {
        String strReplaceFirst = !TextUtils.isEmpty(w2e0Var.m201099g()) ? w2e0Var.m201099g().replaceFirst("/", "") : "";
        NavigationIntent navigationIntent = NavigationIntent.get("profile");
        if (SchemeKey.edit.equals(strReplaceFirst)) {
            NavigationIntent navigationIntent2 = NavigationIntent.get(NavigationIntent.profile_edit);
            Map<String, String> mapM201098f = w2e0Var.m201098f();
            String str = mapM201098f.get("type");
            String str2 = mapM201098f.get("autoScrollTo");
            if ("a".equals(str)) {
                o6j0.m162859c("e_assistant_smart_portrait_failed", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h("assistant_smart_portrait_type", "功能介绍文案"));
            }
            if ("b".equals(str)) {
                o6j0.m162859c("e_assistant_smart_portrait_failed", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h("assistant_smart_portrait_type", "失败提示文案"));
            }
            if ("continuousEdit".equals(str)) {
                o6j0.m162859c("e_assistant_update_profile", OMSDialogPositon.p_chat_view, new o6j0.C18854a[0]);
                navigationIntent2 = NavigationIntent.get(NavigationIntent.profile_edit_continuous);
            }
            navigationIntent = navigationIntent2;
            if (TextUtils.equals(str2, Questions.TYPE)) {
                return ProfileAct.m50738p2(w2e0Var.m201094b(), CoreModule.f17545c.f19639e0.m169527p9().f56011id, "from_auto_scroll_to_question", false, true);
            }
            String str3 = mapM201098f.get("mode");
            String str4 = mapM201098f.get("from");
            if (TextUtils.equals(str3, "marriage")) {
                if (CoreModule.m29935P().m94658i().mo158329X()) {
                    return MarryProfileEditAct.m47418Y1(w2e0Var.m201094b());
                }
                return null;
            }
            if (TextUtils.equals(str3, "dating")) {
                if (wn90.m204607V() || !upa.m194665L3()) {
                    return null;
                }
                if (wn90.m204602F().f187269a == null) {
                    wn90.m204602F().f187269a = CoreModule.f17545c.f19639e0.m169520na();
                }
                if (TextUtils.isEmpty(str4)) {
                    str4 = "chat_complete_profile";
                }
                return ProfileAct.m50738p2(w2e0Var.m201094b(), CoreModule.m29931H().userId(), str4, false, true);
            }
            if (!TextUtils.equals(str3, "profileLikes")) {
                if (TextUtils.equals(str3, "tagMatchPic")) {
                    if (!wn90.m204607V() && upa.m194665L3()) {
                        if (upa.m194847z()) {
                            gjf.m126489M((Act) w2e0Var.m201094b(), false, true);
                        } else {
                            qth0.m176454M((Act) w2e0Var.m201094b(), true, true);
                        }
                    }
                    return null;
                }
                if (!TextUtils.equals(str3, "addPicForTag")) {
                    if (TextUtils.equals(str3, "picMatchTag")) {
                        if (!wn90.m204607V() && upa.m194665L3()) {
                            wn90.m204602F().m204661i0((Act) w2e0Var.m201094b());
                        }
                        return null;
                    }
                    if (!TextUtils.equals(str3, "guidePicAndTag")) {
                        return (CoreModule.m29935P().m94658i().mo158329X() && TextUtils.equals(CoreModule.f17545c.f19639e0.f149321Z3.get(), UserHomeMode.marryMode)) ? MarryProfileEditAct.m47418Y1(w2e0Var.m201094b()) : lva.m151855k(w2e0Var.m201094b(), navigationIntent);
                    }
                    if (!wn90.m204607V() && upa.m194665L3()) {
                        if (TextUtils.isEmpty(str4)) {
                            str4 = "receive_like_add_lifestyle";
                        }
                        sth0.m185950b().m185954e(CoreModule.f17545c.f19639e0.m169520na().mo223809clone());
                        wn90.m204602F().m204646P((Act) w2e0Var.m201094b(), pj90.f149721i, str4, null);
                    }
                    return null;
                }
                if (!wn90.m204607V() && upa.m194665L3()) {
                    NewTags newTagsNew_ = NewTags.new_();
                    String str5 = mapM201098f.get("tagID");
                    if (!TextUtils.isEmpty(str5)) {
                        String[] strArrSplit = str5.split("_");
                        if (strArrSplit.length > 0) {
                            newTagsNew_.categories = Arrays.asList(strArrSplit);
                        }
                    }
                    String str6 = mapM201098f.get("tagID");
                    if (str6 == null) {
                        str6 = "";
                    }
                    newTagsNew_.f20457id = str6;
                    String str7 = mapM201098f.get("tagName");
                    newTagsNew_.name = str7 != null ? str7 : "";
                    wn90.m204602F().m204670t0((Act) w2e0Var.m201094b(), newTagsNew_, str4);
                }
                return null;
            }
            if (wn90.m204607V() || !upa.m194665L3()) {
                return null;
            }
            if (wn90.m204602F().f187269a == null) {
                wn90.m204602F().f187269a = CoreModule.f17545c.f19639e0.m169520na();
            }
            if (wn90.m204602F().m204662k0(wn90.m204602F().f187269a)) {
                return ProfileAct.m50738p2(w2e0Var.m201094b(), CoreModule.m29931H().userId(), str4, false, true);
            }
        } else if (this.f105125a.equals(strReplaceFirst)) {
            String str8 = w2e0Var.m201098f().get("type");
            if ("vip".equals(str8)) {
                navigationIntent = NavigationIntent.get(NavigationIntent.profile_purchase_vip);
            } else if ("see".equals(str8)) {
                navigationIntent = NavigationIntent.get(NavigationIntent.profile_purchase_see);
            } else if ("svip".equals(str8)) {
                navigationIntent = NavigationIntent.get(NavigationIntent.profile_purchase_svip);
            }
        } else if ("task-center".equals(strReplaceFirst)) {
            if (!upa.m194850z2() && !upa.m194609A2()) {
                osi0.m165783g("功能已下线");
                return null;
            }
            User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
            if (userM169527p9.isBanned()) {
                JailedDialogLikeAct.m44186o2(true);
                return null;
            }
            if (userM169527p9.isFakeUser()) {
                ark.m98453V0((Act) w2e0Var.m201094b(), true, userM169527p9.m60124fp(), w2e0Var.m201094b().getString(R$string.f17827Ik), new Runnable() { // from class: l.fzd0
                    @Override // java.lang.Runnable
                    public final void run() {
                        r3g.m177669h((Act) w2e0Var.m201094b());
                    }
                });
                return null;
            }
            if (!userM169527p9.isProfileJailed()) {
                return CoreTaskCenterAct.m43295Y1(w2e0Var.m201094b());
            }
            xx0.m211439h((Act) w2e0Var.m201094b());
            return null;
        }
        return lva.m151855k(w2e0Var.m201094b(), navigationIntent);
    }
}
