package com.p000p1.mobile.putong.core.p001ui.jsbridge;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.p000p1.mobile.putong.core.p001ui.jsbridge.UserCenterBridgeImplementation;
import com.p000p1.mobile.putong.data.Action;
import com.p000p1.mobile.putong.data.Channel;
import com.p000p1.mobile.putong.data.Data;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.Extensions;
import com.p000p1.mobile.putong.data.Gender;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Profile;
import com.p000p1.mobile.putong.data.Relationship;
import com.p000p1.mobile.putong.data.Tag;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.EditTagsData;
import com.p1.mobile.putong.core.data.HeartbeatPushInfo;
import com.p1.mobile.putong.core.data.NewTags;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.UserTagData;
import com.p1.mobile.putong.core.data.UserTagsData;
import com.p1.mobile.putong.core.newui.profile.TagChooseMkAct;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.core.ui.profile.loop.ProfileInfoLoopEditAct;
import com.p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.e51;
import l.ef2;
import l.f30;
import l.f400;
import l.j2e0;
import l.jo0;
import l.liq;
import l.lm90;
import l.mkd0;
import l.roj0;
import l.sa40;
import l.snm;
import l.upa;
import l.vwb;
import l.w9j;
import l.x9j;
import l.xma;
import l.yij0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007l.l2k0;
import rx.c;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class UserCenterBridgeImplementation extends ef2 {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.jsbridge.UserCenterBridgeImplementation$a */
    public class C0013a implements w9j<roj0, User> {
        public C0013a() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public User call(roj0 roj0Var) {
            return CoreModule.c.e0.na();
        }
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m336K(f400 f400Var, String str, roj0 roj0Var) {
        f400Var.c().startActivity(MessagesAct.o2(f400Var.c(), str, false, false, false, false, (Intent) null, 38));
        snm.Z(false);
        f400Var.c().finish();
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ c m340O(User user) {
        return !NullChecker.a(user) ? c.just(roj0.a) : CoreModule.c.e0.u9(user);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m343R(boolean z, final f400 f400Var, final String str, String str2, String str3) {
        if (z && !xma.L3()) {
            CoreModule.P().a().pr(f400Var.c(), "p_suggest_user_profile_info_view,e_profile_comment_button,click", Privilege.see_who_likes_me);
            return;
        }
        Intent intentAr = CoreModule.K().Ar(f400Var.c(), str, str2, false);
        intentAr.putExtra("profile_like_id", str3);
        f400Var.c().startActivityForResult(999, intentAr, new a.a() { // from class: l.l4k0
            /* JADX INFO: renamed from: a */
            public final boolean m11556a(int i, int i2, Intent intent) {
                return UserCenterBridgeImplementation.m363g0(str, f400Var, i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ ArrayList m350Y(User user) {
        ArrayList arrayList = new ArrayList();
        for (Media media : user.pictures) {
            if (media != null && media.mediaType.startsWith("image/")) {
                arrayList.add(media.url);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ c m351Z(User user) {
        return !NullChecker.a(user) ? c.just(roj0.a) : CoreModule.c.e0.u9(user);
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ User m357d0(String str, String str2, User user) {
        User userM19150clone = user.m19150clone();
        List<String> list = userM19150clone.profile.extensions.interest.tags;
        if (TextUtils.equals(str, "add")) {
            if (!list.contains(str2)) {
                list.add(0, str2);
                userM19150clone.profile.extensions.interest.tags = list;
            }
        } else if (TextUtils.equals(str, "delete") && list.contains(str2)) {
            list.remove(str2);
            userM19150clone.profile.extensions.interest.tags = list;
        }
        if (vwb.J(list)) {
            userM19150clone.profile.tags.clear();
        } else {
            sa40.h hVarP = sa40.o().P(list);
            if (NullChecker.a(hVarP) && hVarP.a) {
                List listB = hVarP.b();
                List listSubList = listB.subList(0, Math.min(listB.size(), 10));
                userM19150clone.profile.tags = vwb.Q(listSubList, new w9j() { // from class: l.e3k0
                    public final Object call(Object obj) {
                        return UserCenterBridgeImplementation.m369j0((NewTags) obj);
                    }
                });
            }
        }
        return userM19150clone.subtract(user);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ EditTagsData m359e0(final EditTagsData editTagsData) {
        if (NullChecker.a(CoreModule.c.e0.na()) && !vwb.J(editTagsData.tags)) {
            List list = editTagsData.tags;
            Gender gender = CoreModule.c.e0.na().gender;
            if (TEnum.equals(gender, "female")) {
                vwb.d0(list, new w9j() { // from class: l.j4k0
                    public final Object call(Object obj) {
                        UserTagData userTagData = (UserTagData) obj;
                        return Boolean.valueOf(TextUtils.equals(userTagData.gender, "male") && !editTagsData.selectedTags.contains(userTagData.id));
                    }
                });
            }
            if (TEnum.equals(gender, "male")) {
                vwb.d0(list, new w9j() { // from class: l.k4k0
                    public final Object call(Object obj) {
                        UserTagData userTagData = (UserTagData) obj;
                        return Boolean.valueOf(TextUtils.equals(userTagData.gender, "female") && !editTagsData.selectedTags.contains(userTagData.id));
                    }
                });
            }
            editTagsData.tags = list;
        }
        return editTagsData;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m360f(f400 f400Var, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        f400Var.d().b(str, new String[]{str2});
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ User m361f0(String str, User user) {
        User userM19150clone = user.m19150clone();
        Extensions extensions = userM19150clone.profile.extensions;
        if (extensions != null && extensions.basic != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            userM19150clone.profile.extensions.basic.facialFeature = arrayList;
        }
        return userM19150clone.subtract(user);
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ boolean m363g0(String str, final f400 f400Var, int i, int i2, Intent intent) {
        Relationship relationship;
        Relationship relationship2;
        if (i == 999) {
            String string = "";
            if (i2 == SwipeDirection.LEFT.getValue()) {
                String stringExtra = intent.getStringExtra("userId");
                if (TextUtils.equals(intent.getStringExtra(Action.TYPE), "report")) {
                    string = "reported";
                } else {
                    User userById = CoreModule.K().getUserById(str);
                    if (userById != null && (relationship2 = userById.localRelationship) != null) {
                        string = relationship2.state.toString();
                    }
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("otherId", stringExtra);
                    jSONObject.put(Channel.state, string);
                } catch (JSONException unused) {
                }
                String strQuote = JSONObject.quote(jSONObject.toString());
                final String strSubstring = strQuote.substring(1, strQuote.length() - 1);
                e51.H(f400Var.c(), new Runnable() { // from class: l.m4k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        f400Var.d().b("datingProfileAction", new String[]{strSubstring});
                    }
                }, 100L);
                return true;
            }
            if (i2 == SwipeDirection.REMOVE.getValue()) {
                String stringExtra2 = intent.getStringExtra("currentUserId");
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("otherId", stringExtra2);
                    jSONObject2.put(Channel.state, "matched");
                } catch (JSONException unused2) {
                }
                String strQuote2 = JSONObject.quote(jSONObject2.toString());
                final String strSubstring2 = strQuote2.substring(1, strQuote2.length() - 1);
                e51.H(f400Var.c(), new Runnable() { // from class: l.n4k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        f400Var.d().b("datingProfileAction", new String[]{strSubstring2});
                    }
                }, 100L);
                return true;
            }
            if (i2 == SwipeDirection.RIGHT.getValue() || i2 == SwipeDirection.UP.getValue()) {
                String stringExtra3 = intent.getStringExtra("currentUserId");
                String stringExtra4 = intent.getStringExtra("relationship_result");
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("otherId", stringExtra3);
                    jSONObject3.put(Channel.state, stringExtra4);
                } catch (JSONException unused3) {
                }
                String strQuote3 = JSONObject.quote(jSONObject3.toString());
                f400Var.d().b("datingProfileAction", new String[]{strQuote3.substring(1, strQuote3.length() - 1)});
                return true;
            }
            User userById2 = CoreModule.K().getUserById(str);
            if (userById2 != null && (relationship = userById2.localRelationship) != null) {
                string = relationship.state.toString();
            }
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("otherId", str);
                jSONObject4.put(Channel.state, string);
            } catch (JSONException unused4) {
            }
            String strQuote4 = JSONObject.quote(jSONObject4.toString());
            f400Var.d().b("datingProfileAction", new String[]{strQuote4.substring(1, strQuote4.length() - 1)});
        }
        return false;
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ Tag m369j0(NewTags newTags) {
        return new Tag(Profile.PERSONALITY, newTags.name);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ c m370k(User user) {
        return !NullChecker.a(user) ? c.just(roj0.a) : CoreModule.c.e0.u9(user);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ EditTagsData m372l(final EditTagsData editTagsData) {
        if (NullChecker.a(CoreModule.c.e0.na()) && !vwb.J(editTagsData.tags)) {
            List list = editTagsData.tags;
            Gender gender = CoreModule.c.e0.na().gender;
            if (TEnum.equals(gender, "female")) {
                vwb.d0(list, new w9j() { // from class: l.w2k0
                    public final Object call(Object obj) {
                        UserTagData userTagData = (UserTagData) obj;
                        return Boolean.valueOf(TextUtils.equals(userTagData.gender, "male") && !editTagsData.selectedTags.contains(userTagData.id));
                    }
                });
            }
            if (TEnum.equals(gender, "male")) {
                vwb.d0(list, new w9j() { // from class: l.y2k0
                    public final Object call(Object obj) {
                        UserTagData userTagData = (UserTagData) obj;
                        return Boolean.valueOf(TextUtils.equals(userTagData.gender, "female") && !editTagsData.selectedTags.contains(userTagData.id));
                    }
                });
            }
            editTagsData.tags = list;
        }
        return editTagsData;
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ User m373l0(List list, User user) {
        User userM19150clone = user.m19150clone();
        userM19150clone.profile.extensions.interest.tags = list;
        if (vwb.J(list)) {
            userM19150clone.profile.tags.clear();
        } else {
            sa40.h hVarP = sa40.o().P(list);
            if (NullChecker.a(hVarP) && hVarP.a) {
                List listB = hVarP.b();
                List listSubList = listB.subList(0, Math.min(listB.size(), 10));
                userM19150clone.profile.tags = vwb.Q(listSubList, new w9j() { // from class: l.z2k0
                    public final Object call(Object obj) {
                        return UserCenterBridgeImplementation.m376n((NewTags) obj);
                    }
                });
            }
        }
        return userM19150clone.subtract(user);
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ c m375m0(User user) {
        return !NullChecker.a(user) ? c.just(roj0.a) : CoreModule.c.e0.u9(user);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ Tag m376n(NewTags newTags) {
        return new Tag(Profile.PERSONALITY, newTags.name);
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ c m379o0(User user) {
        return !NullChecker.a(user) ? c.just(roj0.a) : CoreModule.c.e0.u9(user);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ User m382q(String str, List list, User user) {
        User userM19150clone = user.m19150clone();
        if ("food".equals(str)) {
            userM19150clone.profile.extensions.interest.taste = list;
        } else if ("game".equals(str)) {
            userM19150clone.profile.extensions.game.together = list;
        } else if ("game_name".equals(str)) {
            userM19150clone.profile.extensions.game.name = list;
        }
        return userM19150clone.subtract(user);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ EditTagsData m383r(final EditTagsData editTagsData) {
        List list = editTagsData.tags;
        vwb.d0(list, new w9j() { // from class: l.a3k0
            public final Object call(Object obj) {
                UserTagData userTagData = (UserTagData) obj;
                return Boolean.valueOf(TextUtils.equals(userTagData.status, "offline") && !editTagsData.selectedTags.contains(userTagData.id));
            }
        });
        editTagsData.tags = list;
        return editTagsData;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ Tag m384s(NewTags newTags) {
        return new Tag(Profile.PERSONALITY, newTags.name);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ boolean m386u(final f400 f400Var, int i, int i2, Intent intent) {
        if (i != 999) {
            return false;
        }
        if (i2 == SwipeDirection.LEFT.getValue()) {
            String stringExtra = intent.getStringExtra("userId");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("otherId", stringExtra);
            } catch (JSONException unused) {
            }
            String strQuote = JSONObject.quote(jSONObject.toString());
            final String strSubstring = strQuote.substring(1, strQuote.length() - 1);
            e51.H(f400Var.c(), new Runnable() { // from class: l.k3k0
                @Override // java.lang.Runnable
                public final void run() {
                    f400Var.d().b("dislikeFromProfile", new String[]{strSubstring});
                }
            }, 100L);
        } else if (i2 == SwipeDirection.REMOVE.getValue()) {
            String stringExtra2 = intent.getStringExtra("currentUserId");
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("otherId", stringExtra2);
            } catch (JSONException unused2) {
            }
            String strQuote2 = JSONObject.quote(jSONObject2.toString());
            final String strSubstring2 = strQuote2.substring(1, strQuote2.length() - 1);
            e51.H(f400Var.c(), new Runnable() { // from class: l.l3k0
                @Override // java.lang.Runnable
                public final void run() {
                    f400Var.d().b("likeResultsFromProfile", new String[]{strSubstring2});
                }
            }, 100L);
        } else {
            if (i2 != SwipeDirection.RIGHT.getValue() && i2 != SwipeDirection.UP.getValue()) {
                return false;
            }
            String stringExtra3 = intent.getStringExtra("currentUserId");
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("otherId", stringExtra3);
            } catch (JSONException unused3) {
            }
            String strQuote3 = JSONObject.quote(jSONObject3.toString());
            final String strSubstring3 = strQuote3.substring(1, strQuote3.length() - 1);
            e51.H(f400Var.c(), new Runnable() { // from class: l.m3k0
                @Override // java.lang.Runnable
                public final void run() {
                    f400Var.d().b("likeResultsFromProfile", new String[]{strSubstring3});
                }
            }, 100L);
        }
        return true;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m387v(String str, f400 f400Var, String str2, roj0 roj0Var) {
        User userPa = CoreModule.c.e0.Pa(str);
        if (NullChecker.a(userPa) && userPa.isMe()) {
            f400Var.c().startActivity(CoreModule.K().Ar(f400Var.c(), str, str2, false));
        } else if (NullChecker.a(userPa) && NullChecker.a(userPa.localRelationship)) {
            f400Var.c().startActivity(CoreModule.K().Ar(f400Var.c(), str, str2, !(TEnum.equals(userPa.localRelationship.state, "liked") || TEnum.equals(userPa.localRelationship.state, "matched"))));
        } else {
            f400Var.c().startActivity(CoreModule.K().Ar(f400Var.c(), str, str2, true));
        }
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m389x(f400 f400Var) {
        if (f400Var.c() instanceof ProfileInfoLoopEditAct) {
            f400Var.c().c2(true);
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ User m390y(List list, User user) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(user.profile.extensions.interest.tags);
        User userM19150clone = user.m19150clone();
        userM19150clone.profile.extensions.interest.tags.clear();
        userM19150clone.profile.extensions.interest.tags = arrayList;
        if (!vwb.J(list)) {
            sa40.h hVarP = sa40.o().P(arrayList);
            if (NullChecker.a(hVarP) && hVarP.a) {
                List listB = hVarP.b();
                if (!vwb.J(listB)) {
                    List listSubList = listB.subList(0, Math.min(listB.size(), 10));
                    userM19150clone.profile.tags = vwb.Q(listSubList, new w9j() { // from class: l.v2k0
                        public final Object call(Object obj) {
                            return UserCenterBridgeImplementation.m384s((NewTags) obj);
                        }
                    });
                }
            }
        }
        return userM19150clone.subtract(user);
    }

    /* JADX INFO: renamed from: A0 */
    public void m392A0(@NonNull final f400 f400Var, final String str) {
        f400Var.c().duringCreated(c.just(roj0.a).observeOn(Schedulers.io()).map(new w9j() { // from class: l.b4k0
            public final Object call(Object obj) {
                return sa40.o().m(f400Var.c());
            }
        }).filter(new l2k0()).map(new w9j() { // from class: l.c4k0
            public final Object call(Object obj) {
                return UserCenterBridgeImplementation.m359e0((EditTagsData) obj);
            }
        })).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.d4k0
            public final void call(Object obj) {
                this.f6818a.m406O0(f400Var, str, (EditTagsData) obj);
            }
        }, new e30() { // from class: l.f4k0
            public final void call(Object obj) {
                this.f7982a.m407P0(f400Var, str, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B0 */
    public void m393B0(@NonNull f400 f400Var, JSONObject jSONObject) {
        m392A0(f400Var, jSONObject.optString("callback"));
    }

    /* JADX INFO: renamed from: C0 */
    public void m394C0(@NonNull final f400 f400Var, final String str, final String str2) {
        e51.M(new Runnable() { // from class: l.v3k0
            @Override // java.lang.Runnable
            public final void run() {
                this.f14056a.m410S0(f400Var, str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: D0 */
    public void m395D0(@NonNull f400 f400Var, JSONObject jSONObject) {
        m394C0(f400Var, jSONObject.optString("userId"), jSONObject.optString("callback"));
    }

    /* JADX INFO: renamed from: E0 */
    public void m396E0(@NonNull f400 f400Var, JSONObject jSONObject) {
        m397F0(f400Var, jSONObject.optString("userID"), jSONObject.optBoolean("preview"), jSONObject.optString("callback"));
    }

    /* JADX INFO: renamed from: F0 */
    public void m397F0(@NonNull final f400 f400Var, final String str, final boolean z, final String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        e51.M(new Runnable() { // from class: l.b2k0
            @Override // java.lang.Runnable
            public final void run() {
                this.f5895a.m413V0(f400Var, str, z, str2);
            }
        });
    }

    /* JADX INFO: renamed from: G0 */
    public void m398G0(@NonNull final f400 f400Var, final JSONObject jSONObject) {
        e51.F(f400Var.c(), new Runnable() { // from class: l.u3k0
            @Override // java.lang.Runnable
            public final void run() {
                this.f13525a.m414W0(jSONObject, f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: H0 */
    public void m399H0(@NonNull f400 f400Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("from");
        if (TextUtils.equals(strOptString, "from_portrait_like_list") || TextUtils.equals(strOptString, "from_find_partner") || TextUtils.equals(strOptString, "p_picks_profile")) {
            m400I0(f400Var, jSONObject.optString("userId"), strOptString);
        } else {
            m400I0(f400Var, jSONObject.optString("userId"), "from_mew_tags");
        }
    }

    /* JADX INFO: renamed from: I0 */
    public void m400I0(@NonNull final f400 f400Var, final String str, final String str2) {
        if (TextUtils.equals(str2, "from_find_partner")) {
            f400Var.c().duringCreated(CoreModule.c.e0.t9(str)).subscribe(mkd0.G(new e30() { // from class: l.d2k0
                public final void call(Object obj) {
                    UserCenterBridgeImplementation.m387v(str, f400Var, str2, (roj0) obj);
                }
            }));
        } else if (TextUtils.equals(str2, "p_picks_profile")) {
            e51.M(new Runnable() { // from class: l.e2k0
                @Override // java.lang.Runnable
                public final void run() {
                    f400 f400Var2 = f400Var;
                    f400Var2.c().startActivityForResult(999, CoreModule.K().Ar(f400Var2.c(), str, str2, false), new a.a() { // from class: l.d3k0
                        /* JADX INFO: renamed from: a */
                        public final boolean m9304a(int i, int i2, Intent intent) {
                            return UserCenterBridgeImplementation.m386u(f400Var2, i, i2, intent);
                        }
                    });
                }
            });
        } else {
            f400Var.c().duringCreated(CoreModule.K().userObsById(str)).take(1).subscribe(mkd0.G(new e30() { // from class: l.f2k0
                public final void call(Object obj) {
                    f400 f400Var2 = f400Var;
                    f400Var2.c().startActivity(CoreModule.K().Ar(f400Var2.c(), str, str2, false));
                }
            }));
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m401J0(f400 f400Var, String str, Throwable th) {
        m443x0(f400Var, str);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m402K0(final f400 f400Var, final String str, final String str2, Envelope envelope) {
        CoreData moduleData = envelope.getModuleData(CoreData.class);
        if (NullChecker.a(moduleData) && moduleData.heartbeatMatch.matched) {
            f400Var.c().duringCreated(CoreModule.c.f0.ap(str)).subscribe(mkd0.H(new e30() { // from class: l.p3k0
                public final void call(Object obj) {
                    UserCenterBridgeImplementation.m336K(f400Var, str, (roj0) obj);
                }
            }, new e30() { // from class: l.q3k0
                public final void call(Object obj) {
                    this.f12075a.m401J0(f400Var, str2, (Throwable) obj);
                }
            }));
        } else {
            m443x0(f400Var, str2);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m403L0(f400 f400Var, String str, Throwable th) {
        m443x0(f400Var, str);
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m404M0(f400 f400Var, String str, EditTagsData editTagsData) {
        m431n1(f400Var, str, editTagsData.toJson());
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m405N0(f400 f400Var, String str, Throwable th) {
        m443x0(f400Var, str);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m406O0(f400 f400Var, String str, EditTagsData editTagsData) {
        m431n1(f400Var, str, editTagsData.toJson());
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m407P0(f400 f400Var, String str, Throwable th) {
        m443x0(f400Var, str);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m408Q0(f400 f400Var, String str, ArrayList arrayList) {
        m432o1(f400Var, str, new Gson().toJson(arrayList), true);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m409R0(f400 f400Var, String str, Throwable th) {
        m443x0(f400Var, str);
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m410S0(final f400 f400Var, String str, final String str2) {
        f400Var.c().duringCreated(CoreModule.K().userObsById(str)).take(1).map(new w9j() { // from class: l.g4k0
            public final Object call(Object obj) {
                return UserCenterBridgeImplementation.m350Y((User) obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.h4k0
            public final void call(Object obj) {
                this.f8595a.m408Q0(f400Var, str2, (ArrayList) obj);
            }
        }, new e30() { // from class: l.i4k0
            public final void call(Object obj) {
                this.f8899a.m409R0(f400Var, str2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m411T0(f400 f400Var, String str, UserTagsData userTagsData) {
        m431n1(f400Var, str, userTagsData.toJson());
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m412U0(f400 f400Var, String str, Throwable th) {
        m443x0(f400Var, str);
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m413V0(final f400 f400Var, String str, final boolean z, final String str2) {
        f400Var.c().duringCreated(CoreModule.K().userObsById(str)).take(1).map(new w9j() { // from class: l.f3k0
            public final Object call(Object obj) {
                return sa40.o().A(f400Var.c(), (User) obj, z);
            }
        }).filter(new w9j() { // from class: l.g3k0
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a((UserTagsData) obj));
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.h3k0
            public final void call(Object obj) {
                this.f8570a.m411T0(f400Var, str2, (UserTagsData) obj);
            }
        }, new e30() { // from class: l.j3k0
            public final void call(Object obj) {
                this.f9212a.m412U0(f400Var, str2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m414W0(JSONObject jSONObject, f400 f400Var) {
        String strOptString = jSONObject.optString("callback");
        JSONObject jSONObject2 = new JSONObject();
        if (f400Var.c() instanceof ProfileInfoLoopEditAct) {
            try {
                jSONObject2.put("success", f400Var.c().b2());
            } catch (JSONException unused) {
            }
            m439t0(f400Var, strOptString, jSONObject2);
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m415X0(f400 f400Var, String str, roj0 roj0Var) {
        f400Var.c().setResult(-1, new Intent());
        m431n1(f400Var, str, null);
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m416Y0(f400 f400Var, String str, Throwable th) {
        if (yij0.H(th)) {
            return;
        }
        m443x0(f400Var, str);
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m417Z0(f400 f400Var, String str, roj0 roj0Var) {
        f400Var.c().setResult(-1, new Intent());
        m431n1(f400Var, str, null);
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m418a1(f400 f400Var, String str, Throwable th) {
        if (yij0.H(th)) {
            return;
        }
        m443x0(f400Var, str);
    }

    @liq(key = Action.TYPE)
    public void action(@NonNull f400 f400Var, String str) {
        m438s0(f400Var, str);
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m419b1(f400 f400Var, String str, String str2, String str3, Envelope envelope) {
        m434q0(f400Var, TabName.transform(str), str2, str3);
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m420c1(f400 f400Var, String str, Throwable th) {
        m443x0(f400Var, str);
    }

    @liq(key = "createUserTag")
    public void createUserTag(@NonNull f400 f400Var, JSONObject jSONObject) {
        m440u0(f400Var, jSONObject);
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m421d1(final String str, final f400 f400Var, final String str2, final String str3, roj0 roj0Var) {
        if (TextUtils.equals(str, "from_heartbeat")) {
            HeartbeatPushInfo heartbeatPushInfoO = snm.O();
            if (NullChecker.a(heartbeatPushInfoO) && NullChecker.a(heartbeatPushInfoO.pushMessage) && NullChecker.a(heartbeatPushInfoO.pushMessage.tracker)) {
                f400Var.c().duringCreated(CoreModule.c.H1.v3(heartbeatPushInfoO.pushMessage.tracker)).subscribe(mkd0.H(new e30() { // from class: l.b3k0
                    public final void call(Object obj) {
                        this.f5910a.m419b1(f400Var, str2, str3, str, (Envelope) obj);
                    }
                }, new e30() { // from class: l.c3k0
                    public final void call(Object obj) {
                        this.f6520a.m420c1(f400Var, str3, (Throwable) obj);
                    }
                }));
                return;
            }
            return;
        }
        if (TextUtils.equals(str, "from_message_tag_guide")) {
            CoreModule.c.f0.f2.onNext(str);
            f400Var.c().finish();
        } else {
            if (!TextUtils.equals(str, "from_card_tag_guide")) {
                m443x0(f400Var, str3);
                return;
            }
            CoreModule.c.f0.e2.onNext(str);
            f400Var.c().setResult(-1, new Intent());
            f400Var.c().finish();
        }
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m422e1(f400 f400Var, String str, Throwable th) {
        if (yij0.H(th)) {
            return;
        }
        m443x0(f400Var, str);
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m423f1(f400 f400Var, String str, roj0 roj0Var) {
        m431n1(f400Var, str, null);
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m424g1(f400 f400Var, String str, Throwable th) {
        m443x0(f400Var, str);
    }

    @liq(key = "getEditTagData")
    public void getEditTagData(@NonNull f400 f400Var, boolean z, String str) {
        m445z0(f400Var, z, str);
    }

    @liq(key = "getUserTagData")
    public void getUserTagData(@NonNull f400 f400Var, String str, boolean z, String str2) {
        m397F0(f400Var, str, z, str2);
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m425h1(String str, f400 f400Var, String str2, roj0 roj0Var) {
        NewTags newTags = (NewTags) CoreModule.c.e0.S6.get(str);
        if (NullChecker.a(newTags)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(newTags);
            sa40.o().M(arrayList);
        }
        f400Var.c().setResult(-1, new Intent());
        m431n1(f400Var, str2, null);
    }

    /* JADX INFO: renamed from: i1 */
    public final /* synthetic */ void m426i1(f400 f400Var, String str, Throwable th) {
        if (yij0.H(th)) {
            return;
        }
        m443x0(f400Var, str);
    }

    /* JADX INFO: renamed from: j1 */
    public void m427j1(@NonNull final f400 f400Var, JSONObject jSONObject) {
        e51.F(f400Var.c(), new Runnable() { // from class: l.r3k0
            @Override // java.lang.Runnable
            public final void run() {
                UserCenterBridgeImplementation.m389x(f400Var);
            }
        });
    }

    @liq(key = "jumpToProfileAct")
    public void jumpToProfileAct(@NonNull f400 f400Var, String str) {
        m400I0(f400Var, str, "from_mew_tags");
    }

    /* JADX INFO: renamed from: k1 */
    public void m428k1(@NonNull final f400 f400Var, JSONObject jSONObject) {
        String strOptString;
        final String strOptString2 = jSONObject.optString("callback");
        final String strOptString3 = jSONObject.optString("type");
        final ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("tags");
        if (jSONArrayOptJSONArray != null) {
            int i = 0;
            while (i < jSONArrayOptJSONArray.length()) {
                if ("food".equals(strOptString3)) {
                    strOptString = lm90.b(jSONArrayOptJSONArray.optString(i));
                } else {
                    strOptString = ("game".equals(strOptString3) || "game_name".equals(strOptString3)) ? jSONArrayOptJSONArray.optString(i) : null;
                }
                if (!TextUtils.isEmpty(strOptString)) {
                    arrayList.add(strOptString);
                }
                i++;
            }
        }
        f400Var.c().duringCreated(CoreModule.c.e0.o9()).take(1).map(new w9j() { // from class: l.g2k0
            public final Object call(Object obj) {
                return UserCenterBridgeImplementation.m382q(strOptString3, arrayList, (User) obj);
            }
        }).flatMap(new w9j() { // from class: l.h2k0
            public final Object call(Object obj) {
                return UserCenterBridgeImplementation.m340O((User) obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.i2k0
            public final void call(Object obj) {
                this.f8875a.m415X0(f400Var, strOptString2, (roj0) obj);
            }
        }, new e30() { // from class: l.j2k0
            public final void call(Object obj) {
                this.f9204a.m416Y0(f400Var, strOptString2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l1 */
    public void m429l1(@NonNull final f400 f400Var, JSONObject jSONObject) {
        boolean zOptBoolean = jSONObject.optBoolean("preview");
        final String strOptString = jSONObject.optString("callback");
        final ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("selectedTags");
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(jSONArrayOptJSONArray.optString(i));
            }
        }
        if (!zOptBoolean) {
            f400Var.c().duringCreated(CoreModule.c.e0.o9()).take(1).map(new w9j() { // from class: l.x2k0
                public final Object call(Object obj) {
                    return UserCenterBridgeImplementation.m373l0(arrayList, (User) obj);
                }
            }).flatMap(new w9j() { // from class: l.i3k0
                public final Object call(Object obj) {
                    return UserCenterBridgeImplementation.m379o0((User) obj);
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.t3k0
                public final void call(Object obj) {
                    this.f13183a.m417Z0(f400Var, strOptString, (roj0) obj);
                }
            }, new e30() { // from class: l.e4k0
                public final void call(Object obj) {
                    this.f7212a.m418a1(f400Var, strOptString, (Throwable) obj);
                }
            }));
            return;
        }
        if (!vwb.l(arrayList, sa40.o().z(), new x9j() { // from class: l.m2k0
            public final Object call(Object obj, Object obj2) {
                return Boolean.valueOf(TextUtils.equals((String) obj, (String) obj2));
            }
        })) {
            sa40.o().T(arrayList);
        }
        f400Var.c().setResult(-1, new Intent());
        m431n1(f400Var, strOptString, null);
    }

    /* JADX INFO: renamed from: m1 */
    public void m430m1(@NonNull final f400 f400Var, JSONObject jSONObject) {
        if (NullChecker.a(jSONObject)) {
            final String strOptString = jSONObject.optString("callback");
            final String strOptString2 = jSONObject.optString("tabName");
            final String strOptString3 = jSONObject.optString("from");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("selectedTags");
            final ArrayList arrayList = new ArrayList();
            if (NullChecker.a(jSONArrayOptJSONArray)) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(0, jSONArrayOptJSONArray.optString(i));
                }
            }
            f400Var.c().duringCreated(CoreModule.c.e0.o9()).first().map(new w9j() { // from class: l.o4k0
                public final Object call(Object obj) {
                    return UserCenterBridgeImplementation.m390y(arrayList, (User) obj);
                }
            }).flatMap(new w9j() { // from class: l.p4k0
                public final Object call(Object obj) {
                    return UserCenterBridgeImplementation.m351Z((User) obj);
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.q4k0
                public final void call(Object obj) {
                    this.f12083a.m421d1(strOptString3, f400Var, strOptString2, strOptString, (roj0) obj);
                }
            }, new e30() { // from class: l.r4k0
                public final void call(Object obj) {
                    this.f12481a.m422e1(f400Var, strOptString, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: n1 */
    public final void m431n1(f400 f400Var, String str, String str2) {
        m432o1(f400Var, str, str2, false);
    }

    /* JADX INFO: renamed from: o1 */
    public final void m432o1(f400 f400Var, String str, String str2, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", "true");
            if (!TextUtils.isEmpty(str2)) {
                if (z) {
                    jSONObject.put(Data.TYPE, new JSONArray(str2));
                } else {
                    jSONObject.put(Data.TYPE, new JSONObject(str2));
                }
            }
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        m439t0(f400Var, str, jSONObject);
    }

    /* JADX INFO: renamed from: p1 */
    public void m433p1(@NonNull final f400 f400Var, JSONObject jSONObject) {
        final String strOptString = jSONObject.optString("callback");
        final String strOptString2 = jSONObject.optString("facialFeature");
        if (TextUtils.isEmpty(strOptString2)) {
            m443x0(f400Var, strOptString);
        } else {
            f400Var.c().duringCreated(CoreModule.c.e0.o9()).take(1).map(new w9j() { // from class: l.x3k0
                public final Object call(Object obj) {
                    return UserCenterBridgeImplementation.m361f0(strOptString2, (User) obj);
                }
            }).flatMap(new w9j() { // from class: l.y3k0
                public final Object call(Object obj) {
                    return UserCenterBridgeImplementation.m370k((User) obj);
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.z3k0
                public final void call(Object obj) {
                    this.f15577a.m423f1(f400Var, strOptString, (roj0) obj);
                }
            }, new e30() { // from class: l.a4k0
                public final void call(Object obj) {
                    this.f5581a.m424g1(f400Var, strOptString, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m434q0(final f400 f400Var, TabName tabName, final String str, String str2) {
        if (!NullChecker.a(snm.O())) {
            snm.I(tabName);
            return;
        }
        String str3 = snm.O().pushMessage.tracker;
        final String str4 = snm.O().pushMessage.userId;
        snm.I(tabName);
        f400Var.c().duringCreated(CoreModule.c.H1.v3(str3).take(1)).subscribe(mkd0.H(new e30() { // from class: l.n3k0
            public final void call(Object obj) {
                this.f10640a.m402K0(f400Var, str4, str, (Envelope) obj);
            }
        }, new e30() { // from class: l.o3k0
            public final void call(Object obj) {
                this.f10993a.m403L0(f400Var, str, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q1 */
    public void m435q1(@NonNull f400 f400Var, JSONObject jSONObject) {
        m437r1(f400Var, jSONObject.optString("tagID"), jSONObject.optString(Action.TYPE), jSONObject.optBoolean("preview"), jSONObject.optString("callback"));
    }

    /* JADX INFO: renamed from: r0 */
    public void m436r0(@NonNull f400 f400Var, JSONObject jSONObject) {
        m438s0(f400Var, jSONObject.optString("url"));
    }

    /* JADX INFO: renamed from: r1 */
    public void m437r1(@NonNull final f400 f400Var, final String str, final String str2, boolean z, final String str3) {
        if (!z) {
            f400Var.c().duringCreated(CoreModule.c.e0.o9()).take(1).map(new w9j() { // from class: l.r2k0
                public final Object call(Object obj) {
                    return UserCenterBridgeImplementation.m357d0(str2, str, (User) obj);
                }
            }).flatMap(new w9j() { // from class: l.s2k0
                public final Object call(Object obj) {
                    return UserCenterBridgeImplementation.m375m0((User) obj);
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.t2k0
                public final void call(Object obj) {
                    this.f13167a.m425h1(str, f400Var, str3, (roj0) obj);
                }
            }, new e30() { // from class: l.u2k0
                public final void call(Object obj) {
                    this.f13513a.m426i1(f400Var, str3, (Throwable) obj);
                }
            }));
            return;
        }
        List listZ = sa40.o().z();
        if (vwb.J(listZ)) {
            return;
        }
        if (TextUtils.equals(str2, "add")) {
            if (!listZ.contains(str)) {
                listZ.add(0, str);
                sa40.o().T(listZ);
                f400Var.c().setResult(-1, new Intent());
                m431n1(f400Var, str3, null);
                return;
            }
        } else if (TextUtils.equals(str2, "delete") && listZ.contains(str)) {
            listZ.remove(str);
            sa40.o().T(listZ);
            f400Var.c().setResult(-1, new Intent());
            m431n1(f400Var, str3, null);
            return;
        }
        m443x0(f400Var, str3);
    }

    /* JADX INFO: renamed from: s0 */
    public void m438s0(@NonNull final f400 f400Var, String str) {
        j2e0.n(f400Var.c(), Uri.parse(str), new f30() { // from class: l.c2k0
            public final void call(Object obj, Object obj2) {
                UserCenterBridgeImplementation.m360f(f400Var, (String) obj, (String) obj2);
            }
        });
    }

    @liq(key = "safeQuitH5")
    public void safeQuitH5(@NonNull f400 f400Var) {
        snm.Z(false);
    }

    @liq(key = "saveExploreTagData")
    public void saveExploreTagData(@NonNull f400 f400Var, JSONObject jSONObject) {
        m428k1(f400Var, jSONObject);
    }

    @liq(key = "saveSelectedTagData")
    public void saveSelectedTagData(@NonNull f400 f400Var, JSONObject jSONObject) {
        m429l1(f400Var, jSONObject);
    }

    @liq(key = "saveTagData")
    public void saveTagData(@NonNull f400 f400Var, JSONObject jSONObject) {
        m430m1(f400Var, jSONObject);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m439t0(f400 f400Var, String str, JSONObject jSONObject) {
        if (NullChecker.a(jSONObject) && NullChecker.a(str)) {
            String strQuote = JSONObject.quote(jSONObject.toString());
            if (strQuote.length() < 1) {
                return;
            }
            f400Var.d().b(str, new String[]{strQuote.substring(1, strQuote.length() - 1)});
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m440u0(@NonNull f400 f400Var, JSONObject jSONObject) {
        if (NullChecker.a(jSONObject)) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("tagData");
            String strOptString = jSONObject.optString("callback");
            ArrayList<JSONObject> arrayList = new ArrayList();
            for (int i = 0; NullChecker.a(jSONArrayOptJSONArray) && i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(jSONArrayOptJSONArray.optJSONObject(i));
            }
            ArrayList arrayList2 = new ArrayList();
            for (JSONObject jSONObject2 : arrayList) {
                String strOptString2 = jSONObject2.optString("id");
                String strOptString3 = jSONObject2.optString("name");
                String strOptString4 = jSONObject2.optString("icon");
                long jOptLong = jSONObject2.optLong("count");
                String strOptString5 = jSONObject2.optString("status");
                JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("categories");
                ArrayList arrayList3 = new ArrayList();
                if (NullChecker.a(jSONArrayOptJSONArray2)) {
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                        arrayList3.add(jSONArrayOptJSONArray2.optString(i2));
                    }
                }
                if (!TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString3) && !vwb.J(arrayList3) && !TextUtils.isEmpty(strOptString4) && !TextUtils.isEmpty(strOptString5)) {
                    NewTags newTagsNew_ = NewTags.new_();
                    newTagsNew_.id = strOptString2;
                    newTagsNew_.name = strOptString3;
                    newTagsNew_.icon = strOptString4;
                    if (jOptLong <= 0) {
                        jOptLong = 1;
                    }
                    newTagsNew_.localTagUserCounts = jOptLong;
                    newTagsNew_.categories = arrayList3;
                    newTagsNew_.status = strOptString5;
                    if (upa.L3()) {
                        newTagsNew_.isPictureTag = true;
                    }
                    arrayList2.add(newTagsNew_);
                }
            }
            if (vwb.J(arrayList2)) {
                return;
            }
            m431n1(f400Var, strOptString, null);
            sa40.o().M(arrayList2);
        }
    }

    @liq(key = "updateTagState")
    public void updateTagState(@NonNull f400 f400Var, String str, String str2, boolean z, String str3) {
        m437r1(f400Var, str, str2, z, str3);
    }

    /* JADX INFO: renamed from: v0 */
    public void m441v0(final f400 f400Var, JSONObject jSONObject, final boolean z) {
        final String strOptString = jSONObject.optString("otherId");
        final String strOptString2 = jSONObject.optString("from");
        final String strOptString3 = jSONObject.optString("likeProfileId");
        e51.M(new Runnable() { // from class: l.w3k0
            @Override // java.lang.Runnable
            public final void run() {
                UserCenterBridgeImplementation.m343R(z, f400Var, strOptString, strOptString2, strOptString3);
            }
        });
    }

    /* JADX INFO: renamed from: w0 */
    public void m442w0(@NonNull f400 f400Var, JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("tagParams");
        String strOptString = jSONObject.optString("callback");
        jSONObject.toString();
        if (jSONArrayOptJSONArray == null) {
            return;
        }
        if (f400Var.c() instanceof TagChooseMkAct) {
            final TagChooseMkAct tagChooseMkActC = f400Var.c();
            final ArrayList arrayListQ2 = tagChooseMkActC.q2();
            arrayListQ2.clear();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayListQ2.add(jSONArrayOptJSONArray.optJSONObject(i).optString("tagID"));
            }
            tagChooseMkActC.runOnUiThread(new Runnable() { // from class: l.s3k0
                @Override // java.lang.Runnable
                public final void run() {
                    tagChooseMkActC.j.onNext(arrayListQ2);
                }
            });
        } else {
            f400Var.c().finish();
        }
        m431n1(f400Var, strOptString, null);
    }

    /* JADX INFO: renamed from: x0 */
    public final void m443x0(f400 f400Var, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", "false");
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        m439t0(f400Var, str, jSONObject);
    }

    /* JADX INFO: renamed from: y0 */
    public void m444y0(@NonNull f400 f400Var, JSONObject jSONObject) {
        m445z0(f400Var, jSONObject.optBoolean("preview"), jSONObject.optString("callback"));
    }

    /* JADX INFO: renamed from: z0 */
    public void m445z0(@NonNull final f400 f400Var, final boolean z, final String str) {
        f400Var.c().duringCreated(c.just(roj0.a).observeOn(jo0.a()).map(new C0013a()).observeOn(Schedulers.io()).map(new w9j() { // from class: l.k2k0
            public final Object call(Object obj) {
                return sa40.o().n((User) obj, z);
            }
        }).filter(new l2k0()).map(new w9j() { // from class: l.n2k0
            public final Object call(Object obj) {
                return UserCenterBridgeImplementation.m383r((EditTagsData) obj);
            }
        }).map(new w9j() { // from class: l.o2k0
            public final Object call(Object obj) {
                return UserCenterBridgeImplementation.m372l((EditTagsData) obj);
            }
        })).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.p2k0
            public final void call(Object obj) {
                this.f11677a.m404M0(f400Var, str, (EditTagsData) obj);
            }
        }, new e30() { // from class: l.q2k0
            public final void call(Object obj) {
                this.f12058a.m405N0(f400Var, str, (Throwable) obj);
            }
        }));
    }
}
