package p006l;

import android.content.Intent;
import android.os.ResultReceiver;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.putong.core.data.NewTags;
import com.p1.mobile.putong.core.newui.profile.newmine.newprofile.CoreTaskCenterAct;
import com.p1.mobile.putong.core.ui.account.JailedDialogLikeAct;
import com.p1.mobile.putong.core.ui.marry.profile.edit.MarryProfileEditAct;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.core.ui.profile.loop.LoopInputType;
import com.p1.mobile.putong.core.ui.profile.loop.input.ProfileLoopFragAct;
import com.p1.mobile.putong.data.NavigationIntent;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.ui.webview.mk.MkWebViewAct;
import com.tantanapp.common.data.DbObject;
import java.util.Arrays;
import java.util.Map;
import l.ark;
import l.f30;
import l.gjf;
import l.o6j0;
import l.osi0;
import l.pj90;
import l.qth0;
import l.r3g;
import l.sth0;
import l.wn90;
import l.xx0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class gzd0 extends kxd0 {

    /* JADX INFO: renamed from: a */
    public String f13611a = "purchase";

    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(w2e0 w2e0Var, f30<String, String> f30Var) {
        String strReplaceFirst = TextUtils.isEmpty(w2e0Var.m26161g()) ? "" : w2e0Var.m26161g().replaceFirst("/", "");
        String str = w2e0Var.m26160f().get("type");
        if ("edit".equals(strReplaceFirst) && "gameComposite".equals(str)) {
            w2e0Var.m26156b().startActivity(ProfileLoopFragAct.Y1(w2e0Var.m26156b(), LoopInputType.GAME_CP));
        } else if ("edit".equals(strReplaceFirst) && "mbti".equals(str)) {
            w2e0Var.m26156b().startActivity(MkWebViewAct.e2(w2e0Var.m26156b(), "", String.format(pj90.o, "edit_profile"), true, true, true, true, (ResultReceiver) null));
        } else {
            super.mo11681a(w2e0Var, f30Var);
        }
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(final w2e0 w2e0Var, f30<String, String> f30Var) {
        String strReplaceFirst = !TextUtils.isEmpty(w2e0Var.m26161g()) ? w2e0Var.m26161g().replaceFirst("/", "") : "";
        NavigationIntent navigationIntent = NavigationIntent.get("profile");
        if ("edit".equals(strReplaceFirst)) {
            NavigationIntent navigationIntent2 = NavigationIntent.get("profile_edit");
            Map<String, String> mapM26160f = w2e0Var.m26160f();
            String str = mapM26160f.get("type");
            String str2 = mapM26160f.get("autoScrollTo");
            if ("a".equals(str)) {
                o6j0.c("e_assistant_smart_portrait_failed", "p_chat_view", new o6j0.a[]{o6j0.a.h("assistant_smart_portrait_type", "功能介绍文案")});
            }
            if ("b".equals(str)) {
                o6j0.c("e_assistant_smart_portrait_failed", "p_chat_view", new o6j0.a[]{o6j0.a.h("assistant_smart_portrait_type", "失败提示文案")});
            }
            if ("continuousEdit".equals(str)) {
                o6j0.c("e_assistant_update_profile", "p_chat_view", new o6j0.a[0]);
                navigationIntent2 = NavigationIntent.get("profile_edit_continuous");
            }
            navigationIntent = navigationIntent2;
            if (TextUtils.equals(str2, "questions")) {
                return ProfileAct.p2(w2e0Var.m26156b(), ((DbObject) CoreModule.f1534c.f3628e0.m21490p9()).id, "from_auto_scroll_to_question", false, true);
            }
            String str3 = mapM26160f.get("mode");
            String str4 = mapM26160f.get("from");
            if (TextUtils.equals(str3, "marriage")) {
                if (CoreModule.m1854P().m11713i().m19837X()) {
                    return MarryProfileEditAct.Y1(w2e0Var.m26156b());
                }
                return null;
            }
            if (TextUtils.equals(str3, "dating")) {
                if (wn90.V() || !upa.m25363L3()) {
                    return null;
                }
                if (wn90.F().a == null) {
                    wn90.F().a = CoreModule.f1534c.f3628e0.m21483na();
                }
                if (TextUtils.isEmpty(str4)) {
                    str4 = "chat_complete_profile";
                }
                return ProfileAct.p2(w2e0Var.m26156b(), CoreModule.m1850H().userId(), str4, false, true);
            }
            if (!TextUtils.equals(str3, "profileLikes")) {
                if (TextUtils.equals(str3, "tagMatchPic")) {
                    if (!wn90.V() && upa.m25363L3()) {
                        if (upa.m25545z()) {
                            gjf.M(w2e0Var.m26156b(), false, true);
                        } else {
                            qth0.M(w2e0Var.m26156b(), true, true);
                        }
                    }
                    return null;
                }
                if (!TextUtils.equals(str3, "addPicForTag")) {
                    if (TextUtils.equals(str3, "picMatchTag")) {
                        if (!wn90.V() && upa.m25363L3()) {
                            wn90.F().i0(w2e0Var.m26156b());
                        }
                        return null;
                    }
                    if (!TextUtils.equals(str3, "guidePicAndTag")) {
                        return (CoreModule.m1854P().m11713i().m19837X() && TextUtils.equals((CharSequence) CoreModule.f1534c.f3628e0.f18933Z3.get(), "marryMode")) ? MarryProfileEditAct.Y1(w2e0Var.m26156b()) : lva.m19032k(w2e0Var.m26156b(), navigationIntent);
                    }
                    if (!wn90.V() && upa.m25363L3()) {
                        if (TextUtils.isEmpty(str4)) {
                            str4 = "receive_like_add_lifestyle";
                        }
                        sth0.b().e(CoreModule.f1534c.f3628e0.m21483na().clone());
                        wn90.F().P(w2e0Var.m26156b(), pj90.i, str4, (String) null);
                    }
                    return null;
                }
                if (!wn90.V() && upa.m25363L3()) {
                    NewTags newTagsNew_ = NewTags.new_();
                    String str5 = mapM26160f.get("tagID");
                    if (!TextUtils.isEmpty(str5)) {
                        String[] strArrSplit = str5.split("_");
                        if (strArrSplit.length > 0) {
                            newTagsNew_.categories = Arrays.asList(strArrSplit);
                        }
                    }
                    String str6 = mapM26160f.get("tagID");
                    if (str6 == null) {
                        str6 = "";
                    }
                    newTagsNew_.id = str6;
                    String str7 = mapM26160f.get("tagName");
                    newTagsNew_.name = str7 != null ? str7 : "";
                    wn90.F().t0(w2e0Var.m26156b(), newTagsNew_, str4);
                }
                return null;
            }
            if (wn90.V() || !upa.m25363L3()) {
                return null;
            }
            if (wn90.F().a == null) {
                wn90.F().a = CoreModule.f1534c.f3628e0.m21483na();
            }
            if (wn90.F().k0(wn90.F().a)) {
                return ProfileAct.p2(w2e0Var.m26156b(), CoreModule.m1850H().userId(), str4, false, true);
            }
        } else if (this.f13611a.equals(strReplaceFirst)) {
            String str8 = w2e0Var.m26160f().get("type");
            if ("vip".equals(str8)) {
                navigationIntent = NavigationIntent.get("profile_purchase_vip");
            } else if ("see".equals(str8)) {
                navigationIntent = NavigationIntent.get("profile_purchase_see");
            } else if ("svip".equals(str8)) {
                navigationIntent = NavigationIntent.get("profile_purchase_svip");
            }
        } else if ("task-center".equals(strReplaceFirst)) {
            if (!upa.m25548z2() && !upa.m25307A2()) {
                osi0.g("功能已下线");
                return null;
            }
            User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
            if (userM21490p9.isBanned()) {
                JailedDialogLikeAct.o2(true);
                return null;
            }
            if (userM21490p9.isFakeUser()) {
                ark.V0(w2e0Var.m26156b(), true, userM21490p9.fp(), w2e0Var.m26156b().getString(R$string.f1816Ik), new Runnable() { // from class: l.fzd0
                    @Override // java.lang.Runnable
                    public final void run() {
                        r3g.h(w2e0Var.m26156b());
                    }
                });
                return null;
            }
            if (!userM21490p9.isProfileJailed()) {
                return CoreTaskCenterAct.Y1(w2e0Var.m26156b());
            }
            xx0.h(w2e0Var.m26156b());
            return null;
        }
        return lva.m19032k(w2e0Var.m26156b(), navigationIntent);
    }
}
