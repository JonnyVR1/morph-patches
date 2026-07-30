package p153l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.NewTags;
import com.p051p1.mobile.putong.core.data.ProfileLikeType;
import com.p051p1.mobile.putong.core.data.Questions;
import com.p051p1.mobile.putong.core.data.UserHomeMode;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.CoreTaskCenterAct;
import com.p051p1.mobile.putong.core.p058ui.account.JailedDialogLikeAct;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.edit.MarryProfileEditAct;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopFragAct;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class k7e0 extends o5e0 {

    /* JADX INFO: renamed from: a */
    public String f124263a = FirebaseAnalytics.Event.PURCHASE;

    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(abe0 abe0Var, z20<String, String> z20Var) {
        String strReplaceFirst = TextUtils.isEmpty(abe0Var.m96744g()) ? "" : abe0Var.m96744g().replaceFirst("/", "");
        String str = abe0Var.m96743f().get("type");
        if (SchemeKey.edit.equals(strReplaceFirst) && "gameComposite".equals(str)) {
            abe0Var.m96739b().startActivity(ProfileLoopFragAct.m52832Z1(abe0Var.m96739b(), LoopInputType.GAME_CP));
        } else if (SchemeKey.edit.equals(strReplaceFirst) && ProfileLikeType.mbti.equals(str)) {
            abe0Var.m96739b().startActivity(MkWebViewAct.m81423g2(abe0Var.m96739b(), "", String.format(tr90.f175821o, "edit_profile"), true, true, true, true, null));
        } else {
            super.mo95798a(abe0Var, z20Var);
        }
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(final abe0 abe0Var, z20<String, String> z20Var) {
        String strReplaceFirst = !TextUtils.isEmpty(abe0Var.m96744g()) ? abe0Var.m96744g().replaceFirst("/", "") : "";
        NavigationIntent navigationIntent = NavigationIntent.get("profile");
        if (SchemeKey.edit.equals(strReplaceFirst)) {
            NavigationIntent navigationIntent2 = NavigationIntent.get(NavigationIntent.profile_edit);
            Map<String, String> mapM96743f = abe0Var.m96743f();
            String str = mapM96743f.get("type");
            String str2 = mapM96743f.get("autoScrollTo");
            if ("a".equals(str)) {
                sfj0.m185596c("e_assistant_smart_portrait_failed", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h("assistant_smart_portrait_type", "功能介绍文案"));
            }
            if ("b".equals(str)) {
                sfj0.m185596c("e_assistant_smart_portrait_failed", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h("assistant_smart_portrait_type", "失败提示文案"));
            }
            if ("continuousEdit".equals(str)) {
                sfj0.m185596c("e_assistant_update_profile", OMSDialogPositon.p_chat_view, new sfj0.C20032a[0]);
                navigationIntent2 = NavigationIntent.get(NavigationIntent.profile_edit_continuous);
            }
            navigationIntent = navigationIntent2;
            if (TextUtils.equals(str2, Questions.TYPE)) {
                return ProfileAct.m51922q2(abe0Var.m96739b(), CoreModule.f18264c.f20381e0.m116600p9().f56859id, "from_auto_scroll_to_question", false, true);
            }
            String str3 = mapM96743f.get("mode");
            String str4 = mapM96743f.get("from");
            if (TextUtils.equals(str3, "marriage")) {
                if (CoreModule.m30933P().m143412i().mo180421X()) {
                    return MarryProfileEditAct.m48601Z1(abe0Var.m96739b());
                }
                return null;
            }
            if (TextUtils.equals(str3, "dating")) {
                if (aw90.m100567V() || !gra.m131596L3()) {
                    return null;
                }
                if (aw90.m100562F().f73701a == null) {
                    aw90.m100562F().f73701a = CoreModule.f18264c.f20381e0.m116593na();
                }
                if (TextUtils.isEmpty(str4)) {
                    str4 = "chat_complete_profile";
                }
                return ProfileAct.m51922q2(abe0Var.m96739b(), CoreModule.m30929H().userId(), str4, false, true);
            }
            if (!TextUtils.equals(str3, "profileLikes")) {
                if (TextUtils.equals(str3, "tagMatchPic")) {
                    if (!aw90.m100567V() && gra.m131596L3()) {
                        if (gra.m131778z()) {
                            mkf.m158776M((Act) abe0Var.m96739b(), false, true);
                        } else {
                            y1i0.m213948M((Act) abe0Var.m96739b(), true, true);
                        }
                    }
                    return null;
                }
                if (!TextUtils.equals(str3, "addPicForTag")) {
                    if (TextUtils.equals(str3, "picMatchTag")) {
                        if (!aw90.m100567V() && gra.m131596L3()) {
                            aw90.m100562F().m100621i0((Act) abe0Var.m96739b());
                        }
                        return null;
                    }
                    if (!TextUtils.equals(str3, "guidePicAndTag")) {
                        return (CoreModule.m30933P().m143412i().mo180421X() && TextUtils.equals(CoreModule.f18264c.f20381e0.f89178Z3.get(), UserHomeMode.marryMode)) ? MarryProfileEditAct.m48601Z1(abe0Var.m96739b()) : xwa.m213316k(abe0Var.m96739b(), navigationIntent);
                    }
                    if (!aw90.m100567V() && gra.m131596L3()) {
                        if (TextUtils.isEmpty(str4)) {
                            str4 = "receive_like_add_lifestyle";
                        }
                        a2i0.m95674b().m95678e(CoreModule.f18264c.f20381e0.m116593na().mo225055clone());
                        aw90.m100562F().m100606P((Act) abe0Var.m96739b(), tr90.f175815i, str4, null);
                    }
                    return null;
                }
                if (!aw90.m100567V() && gra.m131596L3()) {
                    NewTags newTagsNew_ = NewTags.new_();
                    String str5 = mapM96743f.get("tagID");
                    if (!TextUtils.isEmpty(str5)) {
                        String[] strArrSplit = str5.split("_");
                        if (strArrSplit.length > 0) {
                            newTagsNew_.categories = Arrays.asList(strArrSplit);
                        }
                    }
                    String str6 = mapM96743f.get("tagID");
                    if (str6 == null) {
                        str6 = "";
                    }
                    newTagsNew_.f21199id = str6;
                    String str7 = mapM96743f.get("tagName");
                    newTagsNew_.name = str7 != null ? str7 : "";
                    aw90.m100562F().m100630t0((Act) abe0Var.m96739b(), newTagsNew_, str4);
                }
                return null;
            }
            if (aw90.m100567V() || !gra.m131596L3()) {
                return null;
            }
            if (aw90.m100562F().f73701a == null) {
                aw90.m100562F().f73701a = CoreModule.f18264c.f20381e0.m116593na();
            }
            if (aw90.m100562F().m100622k0(aw90.m100562F().f73701a)) {
                return ProfileAct.m51922q2(abe0Var.m96739b(), CoreModule.m30929H().userId(), str4, false, true);
            }
        } else if (this.f124263a.equals(strReplaceFirst)) {
            String str8 = abe0Var.m96743f().get("type");
            if ("vip".equals(str8)) {
                navigationIntent = NavigationIntent.get(NavigationIntent.profile_purchase_vip);
            } else if ("see".equals(str8)) {
                navigationIntent = NavigationIntent.get(NavigationIntent.profile_purchase_see);
            } else if ("svip".equals(str8)) {
                navigationIntent = NavigationIntent.get(NavigationIntent.profile_purchase_svip);
            }
        } else if ("task-center".equals(strReplaceFirst)) {
            if (!gra.m131781z2() && !gra.m131540A2()) {
                r1j0.m179420g("功能已下线");
                return null;
            }
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            if (userM116600p9.isBanned()) {
                JailedDialogLikeAct.m45369p2(true);
                return null;
            }
            if (userM116600p9.isFakeUser()) {
                qtk.m178003V0((Act) abe0Var.m96739b(), true, userM116600p9.m61308fp(), abe0Var.m96739b().getString(R$string.f19221el), new Runnable() { // from class: l.j7e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        f5g.m124130h((Act) abe0Var.m96739b());
                    }
                });
                return null;
            }
            if (!userM116600p9.isProfileJailed()) {
                return CoreTaskCenterAct.m44481Z1(abe0Var.m96739b());
            }
            ey0.m123126h((Act) abe0Var.m96739b());
            return null;
        }
        return xwa.m213316k(abe0Var.m96739b(), navigationIntent);
    }
}
