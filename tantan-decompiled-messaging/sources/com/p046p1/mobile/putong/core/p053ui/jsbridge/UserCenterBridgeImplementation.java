package com.p046p1.mobile.putong.core.p053ui.jsbridge;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.room.RoomDatabase;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.facebook.AuthenticationTokenClaims;
import com.google.gson.Gson;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.EditTagsData;
import com.p046p1.mobile.putong.core.data.HeartbeatPushInfo;
import com.p046p1.mobile.putong.core.data.NewTags;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.UserBanAppealSwitch;
import com.p046p1.mobile.putong.core.data.UserTagData;
import com.p046p1.mobile.putong.core.data.UserTagsData;
import com.p046p1.mobile.putong.core.newui.profile.TagChooseMkAct;
import com.p046p1.mobile.putong.core.p053ui.jsbridge.UserCenterBridgeImplementation;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.ProfileInfoLoopEditAct;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Extensions;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.Tag;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p149l.e30;
import p149l.e51;
import p149l.ef2;
import p149l.f30;
import p149l.f400;
import p149l.j2e0;
import p149l.jo0;
import p149l.l2k0;
import p149l.liq;
import p149l.lm90;
import p149l.m2k0;
import p149l.mkd0;
import p149l.roj0;
import p149l.sa40;
import p149l.snm;
import p149l.upa;
import p149l.vwb;
import p149l.w9j;
import p149l.xma;
import p149l.yij0;

/* JADX INFO: loaded from: classes12.dex */
public class UserCenterBridgeImplementation extends ef2 {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.jsbridge.UserCenterBridgeImplementation$a */
    public class C8400a implements w9j<roj0, User> {
        public C8400a() {
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public User call(roj0 roj0Var) {
            return CoreModule.f17545c.f19639e0.m169520na();
        }
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m46664K(f400 f400Var, String str, roj0 roj0Var) {
        f400Var.mo102961c().startActivity(MessagesAct.m48948o2(f400Var.mo102961c(), str, false, false, false, false, null, 38));
        snm.m185095Z(false);
        f400Var.mo102961c().m66873d2();
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ C22306c m46668O(User user) {
        return !NullChecker.m81303a(user) ? C22306c.just(roj0.f160388a) : CoreModule.f17545c.f19639e0.m169547u9(user);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m46671R(boolean z, final f400 f400Var, final String str, String str2, String str3) {
        if (z && !xma.m210047L3()) {
            CoreModule.m29935P().m94651a().mo33565pr(f400Var.mo102961c(), "p_suggest_user_profile_info_view,e_profile_comment_button,click", Privilege.see_who_likes_me);
            return;
        }
        Intent intentMo30673Ar = CoreModule.m29932K().mo30673Ar(f400Var.mo102961c(), str, str2, false);
        intentMo30673Ar.putExtra("profile_like_id", str3);
        f400Var.mo102961c().startActivityForResult(RoomDatabase.MAX_BIND_PARAMETER_CNT, intentMo30673Ar, new C4317a.a() { // from class: l.l4k0
            @Override // com.p046p1.mobile.android.app.C4317a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo20401a(int i, int i2, Intent intent) {
                return UserCenterBridgeImplementation.m46691g0(str, f400Var, i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ ArrayList m46678Y(User user) {
        ArrayList arrayList = new ArrayList();
        for (Media media : user.pictures) {
            if (media != null && media.mediaType.startsWith("image/")) {
                arrayList.add(media.url);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ C22306c m46679Z(User user) {
        return !NullChecker.m81303a(user) ? C22306c.just(roj0.f160388a) : CoreModule.f17545c.f19639e0.m169547u9(user);
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ User m46685d0(String str, String str2, User user) {
        User userMo223809clone = user.mo223809clone();
        List<String> list = userMo223809clone.profile.extensions.interest.tags;
        if (TextUtils.equals(str, "add")) {
            if (!list.contains(str2)) {
                list.add(0, str2);
                userMo223809clone.profile.extensions.interest.tags = list;
            }
        } else if (TextUtils.equals(str, RequestParameters.SUBRESOURCE_DELETE) && list.contains(str2)) {
            list.remove(str2);
            userMo223809clone.profile.extensions.interest.tags = list;
        }
        if (vwb.m200296J(list)) {
            userMo223809clone.profile.tags.clear();
        } else {
            sa40.C19884h c19884hM182818P = sa40.m182802o().m182818P(list);
            if (NullChecker.m81303a(c19884hM182818P) && c19884hM182818P.f163299a) {
                List<NewTags> listM182847b = c19884hM182818P.m182847b();
                List<NewTags> listSubList = listM182847b.subList(0, Math.min(listM182847b.size(), 10));
                userMo223809clone.profile.tags = vwb.m200303Q(listSubList, new w9j() { // from class: l.e3k0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return UserCenterBridgeImplementation.m46697j0((NewTags) obj);
                    }
                });
            }
        }
        return userMo223809clone.subtract(user);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ EditTagsData m46687e0(final EditTagsData editTagsData) {
        if (NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169520na()) && !vwb.m200296J(editTagsData.tags)) {
            List<UserTagData> list = editTagsData.tags;
            Gender gender = CoreModule.f17545c.f19639e0.m169520na().gender;
            if (TEnum.equals(gender, "female")) {
                vwb.m200320d0(list, new w9j() { // from class: l.j4k0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        UserTagData userTagData = (UserTagData) obj;
                        return Boolean.valueOf(TextUtils.equals(userTagData.gender, "male") && !editTagsData.selectedTags.contains(userTagData.f20527id));
                    }
                });
            }
            if (TEnum.equals(gender, "male")) {
                vwb.m200320d0(list, new w9j() { // from class: l.k4k0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        UserTagData userTagData = (UserTagData) obj;
                        return Boolean.valueOf(TextUtils.equals(userTagData.gender, "female") && !editTagsData.selectedTags.contains(userTagData.f20527id));
                    }
                });
            }
            editTagsData.tags = list;
        }
        return editTagsData;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m46688f(f400 f400Var, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        f400Var.mo102962d().mo127285b(str, str2);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ User m46689f0(String str, User user) {
        User userMo223809clone = user.mo223809clone();
        Extensions extensions = userMo223809clone.profile.extensions;
        if (extensions != null && extensions.basic != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            userMo223809clone.profile.extensions.basic.facialFeature = arrayList;
        }
        return userMo223809clone.subtract(user);
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ boolean m46691g0(String str, final f400 f400Var, int i, int i2, Intent intent) {
        Relationship relationship;
        Relationship relationship2;
        if (i == 999) {
            String string = "";
            if (i2 == SwipeDirection.LEFT.getValue()) {
                String stringExtra = intent.getStringExtra("userId");
                if (TextUtils.equals(intent.getStringExtra("action"), "report")) {
                    string = "reported";
                } else {
                    User userById = CoreModule.m29932K().getUserById(str);
                    if (userById != null && (relationship2 = userById.localRelationship) != null) {
                        string = relationship2.state.toString();
                    }
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("otherId", stringExtra);
                    jSONObject.put("state", string);
                } catch (JSONException unused) {
                }
                String strQuote = JSONObject.quote(jSONObject.toString());
                final String strSubstring = strQuote.substring(1, strQuote.length() - 1);
                e51.m114743H(f400Var.mo102961c(), new Runnable() { // from class: l.m4k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        f400Var.mo102962d().mo127285b("datingProfileAction", strSubstring);
                    }
                }, 100L);
                return true;
            }
            if (i2 == SwipeDirection.REMOVE.getValue()) {
                String stringExtra2 = intent.getStringExtra("currentUserId");
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("otherId", stringExtra2);
                    jSONObject2.put("state", "matched");
                } catch (JSONException unused2) {
                }
                String strQuote2 = JSONObject.quote(jSONObject2.toString());
                final String strSubstring2 = strQuote2.substring(1, strQuote2.length() - 1);
                e51.m114743H(f400Var.mo102961c(), new Runnable() { // from class: l.n4k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        f400Var.mo102962d().mo127285b("datingProfileAction", strSubstring2);
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
                    jSONObject3.put("state", stringExtra4);
                } catch (JSONException unused3) {
                }
                String strQuote3 = JSONObject.quote(jSONObject3.toString());
                f400Var.mo102962d().mo127285b("datingProfileAction", strQuote3.substring(1, strQuote3.length() - 1));
                return true;
            }
            User userById2 = CoreModule.m29932K().getUserById(str);
            if (userById2 != null && (relationship = userById2.localRelationship) != null) {
                string = relationship.state.toString();
            }
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("otherId", str);
                jSONObject4.put("state", string);
            } catch (JSONException unused4) {
            }
            String strQuote4 = JSONObject.quote(jSONObject4.toString());
            f400Var.mo102962d().mo127285b("datingProfileAction", strQuote4.substring(1, strQuote4.length() - 1));
        }
        return false;
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ Tag m46697j0(NewTags newTags) {
        return new Tag("personality", newTags.name);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ C22306c m46698k(User user) {
        return !NullChecker.m81303a(user) ? C22306c.just(roj0.f160388a) : CoreModule.f17545c.f19639e0.m169547u9(user);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ EditTagsData m46700l(final EditTagsData editTagsData) {
        if (NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169520na()) && !vwb.m200296J(editTagsData.tags)) {
            List<UserTagData> list = editTagsData.tags;
            Gender gender = CoreModule.f17545c.f19639e0.m169520na().gender;
            if (TEnum.equals(gender, "female")) {
                vwb.m200320d0(list, new w9j() { // from class: l.w2k0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        UserTagData userTagData = (UserTagData) obj;
                        return Boolean.valueOf(TextUtils.equals(userTagData.gender, "male") && !editTagsData.selectedTags.contains(userTagData.f20527id));
                    }
                });
            }
            if (TEnum.equals(gender, "male")) {
                vwb.m200320d0(list, new w9j() { // from class: l.y2k0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        UserTagData userTagData = (UserTagData) obj;
                        return Boolean.valueOf(TextUtils.equals(userTagData.gender, "female") && !editTagsData.selectedTags.contains(userTagData.f20527id));
                    }
                });
            }
            editTagsData.tags = list;
        }
        return editTagsData;
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ User m46701l0(List list, User user) {
        User userMo223809clone = user.mo223809clone();
        userMo223809clone.profile.extensions.interest.tags = list;
        if (vwb.m200296J(list)) {
            userMo223809clone.profile.tags.clear();
        } else {
            sa40.C19884h c19884hM182818P = sa40.m182802o().m182818P(list);
            if (NullChecker.m81303a(c19884hM182818P) && c19884hM182818P.f163299a) {
                List<NewTags> listM182847b = c19884hM182818P.m182847b();
                List<NewTags> listSubList = listM182847b.subList(0, Math.min(listM182847b.size(), 10));
                userMo223809clone.profile.tags = vwb.m200303Q(listSubList, new w9j() { // from class: l.z2k0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return UserCenterBridgeImplementation.m46704n((NewTags) obj);
                    }
                });
            }
        }
        return userMo223809clone.subtract(user);
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ C22306c m46703m0(User user) {
        return !NullChecker.m81303a(user) ? C22306c.just(roj0.f160388a) : CoreModule.f17545c.f19639e0.m169547u9(user);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ Tag m46704n(NewTags newTags) {
        return new Tag("personality", newTags.name);
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ C22306c m46707o0(User user) {
        return !NullChecker.m81303a(user) ? C22306c.just(roj0.f160388a) : CoreModule.f17545c.f19639e0.m169547u9(user);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ User m46710q(String str, List list, User user) {
        User userMo223809clone = user.mo223809clone();
        if ("food".equals(str)) {
            userMo223809clone.profile.extensions.interest.taste = list;
        } else if ("game".equals(str)) {
            userMo223809clone.profile.extensions.game.together = list;
        } else if ("game_name".equals(str)) {
            userMo223809clone.profile.extensions.game.name = list;
        }
        return userMo223809clone.subtract(user);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ EditTagsData m46711r(final EditTagsData editTagsData) {
        List<UserTagData> list = editTagsData.tags;
        vwb.m200320d0(list, new w9j() { // from class: l.a3k0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                UserTagData userTagData = (UserTagData) obj;
                return Boolean.valueOf(TextUtils.equals(userTagData.status, UserBanAppealSwitch.offline) && !editTagsData.selectedTags.contains(userTagData.f20527id));
            }
        });
        editTagsData.tags = list;
        return editTagsData;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ Tag m46712s(NewTags newTags) {
        return new Tag("personality", newTags.name);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ boolean m46714u(final f400 f400Var, int i, int i2, Intent intent) {
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
            e51.m114743H(f400Var.mo102961c(), new Runnable() { // from class: l.k3k0
                @Override // java.lang.Runnable
                public final void run() {
                    f400Var.mo102962d().mo127285b("dislikeFromProfile", strSubstring);
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
            e51.m114743H(f400Var.mo102961c(), new Runnable() { // from class: l.l3k0
                @Override // java.lang.Runnable
                public final void run() {
                    f400Var.mo102962d().mo127285b("likeResultsFromProfile", strSubstring2);
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
            e51.m114743H(f400Var.mo102961c(), new Runnable() { // from class: l.m3k0
                @Override // java.lang.Runnable
                public final void run() {
                    f400Var.mo102962d().mo127285b("likeResultsFromProfile", strSubstring3);
                }
            }, 100L);
        }
        return true;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m46715v(String str, f400 f400Var, String str2, roj0 roj0Var) {
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(str);
        if (NullChecker.m81303a(userM169430Pa) && userM169430Pa.isMe()) {
            f400Var.mo102961c().startActivity(CoreModule.m29932K().mo30673Ar(f400Var.mo102961c(), str, str2, false));
        } else if (NullChecker.m81303a(userM169430Pa) && NullChecker.m81303a(userM169430Pa.localRelationship)) {
            f400Var.mo102961c().startActivity(CoreModule.m29932K().mo30673Ar(f400Var.mo102961c(), str, str2, !(TEnum.equals(userM169430Pa.localRelationship.state, "liked") || TEnum.equals(userM169430Pa.localRelationship.state, "matched"))));
        } else {
            f400Var.mo102961c().startActivity(CoreModule.m29932K().mo30673Ar(f400Var.mo102961c(), str, str2, true));
        }
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m46717x(f400 f400Var) {
        if (f400Var.mo102961c() instanceof ProfileInfoLoopEditAct) {
            ((ProfileInfoLoopEditAct) f400Var.mo102961c()).m51511c2(true);
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ User m46718y(List list, User user) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(user.profile.extensions.interest.tags);
        User userMo223809clone = user.mo223809clone();
        userMo223809clone.profile.extensions.interest.tags.clear();
        userMo223809clone.profile.extensions.interest.tags = arrayList;
        if (!vwb.m200296J(list)) {
            sa40.C19884h c19884hM182818P = sa40.m182802o().m182818P(arrayList);
            if (NullChecker.m81303a(c19884hM182818P) && c19884hM182818P.f163299a) {
                List<NewTags> listM182847b = c19884hM182818P.m182847b();
                if (!vwb.m200296J(listM182847b)) {
                    List<NewTags> listSubList = listM182847b.subList(0, Math.min(listM182847b.size(), 10));
                    userMo223809clone.profile.tags = vwb.m200303Q(listSubList, new w9j() { // from class: l.v2k0
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return UserCenterBridgeImplementation.m46712s((NewTags) obj);
                        }
                    });
                }
            }
        }
        return userMo223809clone.subtract(user);
    }

    /* JADX INFO: renamed from: A0 */
    public void m46720A0(@NonNull final f400 f400Var, final String str) {
        f400Var.mo102961c().duringCreated(C22306c.just(roj0.f160388a).observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.b4k0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return sa40.m182802o().m182830m(f400Var.mo102961c());
            }
        }).filter(new l2k0()).map(new w9j() { // from class: l.c4k0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return UserCenterBridgeImplementation.m46687e0((EditTagsData) obj);
            }
        })).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.d4k0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84313a.m46734O0(f400Var, str, (EditTagsData) obj);
            }
        }, new e30() { // from class: l.f4k0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f94830a.m46735P0(f400Var, str, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B0 */
    public void m46721B0(@NonNull f400 f400Var, JSONObject jSONObject) {
        m46720A0(f400Var, jSONObject.optString("callback"));
    }

    /* JADX INFO: renamed from: C0 */
    public void m46722C0(@NonNull final f400 f400Var, final String str, final String str2) {
        e51.m114748M(new Runnable() { // from class: l.v3k0
            @Override // java.lang.Runnable
            public final void run() {
                this.f179819a.m46738S0(f400Var, str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: D0 */
    public void m46723D0(@NonNull f400 f400Var, JSONObject jSONObject) {
        m46722C0(f400Var, jSONObject.optString("userId"), jSONObject.optString("callback"));
    }

    /* JADX INFO: renamed from: E0 */
    public void m46724E0(@NonNull f400 f400Var, JSONObject jSONObject) {
        m46725F0(f400Var, jSONObject.optString("userID"), jSONObject.optBoolean("preview"), jSONObject.optString("callback"));
    }

    /* JADX INFO: renamed from: F0 */
    public void m46725F0(@NonNull final f400 f400Var, final String str, final boolean z, final String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        e51.m114748M(new Runnable() { // from class: l.b2k0
            @Override // java.lang.Runnable
            public final void run() {
                this.f72705a.m46741V0(f400Var, str, z, str2);
            }
        });
    }

    /* JADX INFO: renamed from: G0 */
    public void m46726G0(@NonNull final f400 f400Var, final JSONObject jSONObject) {
        e51.m114741F(f400Var.mo102961c(), new Runnable() { // from class: l.u3k0
            @Override // java.lang.Runnable
            public final void run() {
                this.f173625a.m46742W0(jSONObject, f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: H0 */
    public void m46727H0(@NonNull f400 f400Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("from");
        if (TextUtils.equals(strOptString, "from_portrait_like_list") || TextUtils.equals(strOptString, "from_find_partner") || TextUtils.equals(strOptString, "p_picks_profile")) {
            m46728I0(f400Var, jSONObject.optString("userId"), strOptString);
        } else {
            m46728I0(f400Var, jSONObject.optString("userId"), "from_mew_tags");
        }
    }

    /* JADX INFO: renamed from: I0 */
    public void m46728I0(@NonNull final f400 f400Var, final String str, final String str2) {
        if (TextUtils.equals(str2, "from_find_partner")) {
            f400Var.mo102961c().duringCreated(CoreModule.f17545c.f19639e0.m169543t9(str)).subscribe(mkd0.m154955G(new e30() { // from class: l.d2k0
                @Override // p149l.e30
                public final void call(Object obj) {
                    UserCenterBridgeImplementation.m46715v(str, f400Var, str2, (roj0) obj);
                }
            }));
        } else if (TextUtils.equals(str2, "p_picks_profile")) {
            e51.m114748M(new Runnable() { // from class: l.e2k0
                @Override // java.lang.Runnable
                public final void run() {
                    f400 f400Var2 = f400Var;
                    f400Var2.mo102961c().startActivityForResult(RoomDatabase.MAX_BIND_PARAMETER_CNT, CoreModule.m29932K().mo30673Ar(f400Var2.mo102961c(), str, str2, false), new C4317a.a() { // from class: l.d3k0
                        @Override // com.p046p1.mobile.android.app.C4317a.a
                        /* JADX INFO: renamed from: a */
                        public final boolean mo20401a(int i, int i2, Intent intent) {
                            return UserCenterBridgeImplementation.m46714u(f400Var2, i, i2, intent);
                        }
                    });
                }
            });
        } else {
            f400Var.mo102961c().duringCreated(CoreModule.m29932K().userObsById(str)).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.f2k0
                @Override // p149l.e30
                public final void call(Object obj) {
                    f400 f400Var2 = f400Var;
                    f400Var2.mo102961c().startActivity(CoreModule.m29932K().mo30673Ar(f400Var2.mo102961c(), str, str2, false));
                }
            }));
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m46729J0(f400 f400Var, String str, Throwable th) {
        m46771x0(f400Var, str);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m46730K0(final f400 f400Var, final String str, final String str2, Envelope envelope) {
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        if (NullChecker.m81303a(coreData) && coreData.heartbeatMatch.matched) {
            f400Var.mo102961c().duringCreated(CoreModule.f17545c.f19642f0.m32902ap(str)).subscribe(mkd0.m154956H(new e30() { // from class: l.p3k0
                @Override // p149l.e30
                public final void call(Object obj) {
                    UserCenterBridgeImplementation.m46664K(f400Var, str, (roj0) obj);
                }
            }, new e30() { // from class: l.q3k0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f152478a.m46729J0(f400Var, str2, (Throwable) obj);
                }
            }));
        } else {
            m46771x0(f400Var, str2);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m46731L0(f400 f400Var, String str, Throwable th) {
        m46771x0(f400Var, str);
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m46732M0(f400 f400Var, String str, EditTagsData editTagsData) {
        m46759n1(f400Var, str, editTagsData.toJson());
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m46733N0(f400 f400Var, String str, Throwable th) {
        m46771x0(f400Var, str);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m46734O0(f400 f400Var, String str, EditTagsData editTagsData) {
        m46759n1(f400Var, str, editTagsData.toJson());
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m46735P0(f400 f400Var, String str, Throwable th) {
        m46771x0(f400Var, str);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m46736Q0(f400 f400Var, String str, ArrayList arrayList) {
        m46760o1(f400Var, str, new Gson().toJson(arrayList), true);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m46737R0(f400 f400Var, String str, Throwable th) {
        m46771x0(f400Var, str);
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m46738S0(final f400 f400Var, String str, final String str2) {
        f400Var.mo102961c().duringCreated(CoreModule.m29932K().userObsById(str)).take(1).map(new w9j() { // from class: l.g4k0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return UserCenterBridgeImplementation.m46678Y((User) obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.h4k0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105859a.m46736Q0(f400Var, str2, (ArrayList) obj);
            }
        }, new e30() { // from class: l.i4k0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f111468a.m46737R0(f400Var, str2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m46739T0(f400 f400Var, String str, UserTagsData userTagsData) {
        m46759n1(f400Var, str, userTagsData.toJson());
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m46740U0(f400 f400Var, String str, Throwable th) {
        m46771x0(f400Var, str);
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m46741V0(final f400 f400Var, String str, final boolean z, final String str2) {
        f400Var.mo102961c().duringCreated(CoreModule.m29932K().userObsById(str)).take(1).map(new w9j() { // from class: l.f3k0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return sa40.m182802o().m182803A(f400Var.mo102961c(), (User) obj, z);
            }
        }).filter(new w9j() { // from class: l.g3k0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((UserTagsData) obj));
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.h3k0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105745a.m46739T0(f400Var, str2, (UserTagsData) obj);
            }
        }, new e30() { // from class: l.j3k0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116082a.m46740U0(f400Var, str2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m46742W0(JSONObject jSONObject, f400 f400Var) {
        String strOptString = jSONObject.optString("callback");
        JSONObject jSONObject2 = new JSONObject();
        if (f400Var.mo102961c() instanceof ProfileInfoLoopEditAct) {
            try {
                jSONObject2.put("success", ((ProfileInfoLoopEditAct) f400Var.mo102961c()).m51510b2());
            } catch (JSONException unused) {
            }
            m46767t0(f400Var, strOptString, jSONObject2);
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m46743X0(f400 f400Var, String str, roj0 roj0Var) {
        f400Var.mo102961c().setResult(-1, new Intent());
        m46759n1(f400Var, str, null);
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m46744Y0(f400 f400Var, String str, Throwable th) {
        if (yij0.m214930H(th)) {
            return;
        }
        m46771x0(f400Var, str);
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m46745Z0(f400 f400Var, String str, roj0 roj0Var) {
        f400Var.mo102961c().setResult(-1, new Intent());
        m46759n1(f400Var, str, null);
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m46746a1(f400 f400Var, String str, Throwable th) {
        if (yij0.m214930H(th)) {
            return;
        }
        m46771x0(f400Var, str);
    }

    @liq(key = "action")
    public void action(@NonNull f400 f400Var, String str) {
        m46766s0(f400Var, str);
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m46747b1(f400 f400Var, String str, String str2, String str3, Envelope envelope) {
        m46762q0(f400Var, TabName.transform(str), str2, str3);
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m46748c1(f400 f400Var, String str, Throwable th) {
        m46771x0(f400Var, str);
    }

    @liq(key = "createUserTag")
    public void createUserTag(@NonNull f400 f400Var, JSONObject jSONObject) {
        m46768u0(f400Var, jSONObject);
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m46749d1(final String str, final f400 f400Var, final String str2, final String str3, roj0 roj0Var) {
        if (TextUtils.equals(str, "from_heartbeat")) {
            HeartbeatPushInfo heartbeatPushInfoM185084O = snm.m185084O();
            if (NullChecker.m81303a(heartbeatPushInfoM185084O) && NullChecker.m81303a(heartbeatPushInfoM185084O.pushMessage) && NullChecker.m81303a(heartbeatPushInfoM185084O.pushMessage.tracker)) {
                f400Var.mo102961c().duringCreated(CoreModule.f17545c.f19571H1.m201076v3(heartbeatPushInfoM185084O.pushMessage.tracker)).subscribe(mkd0.m154956H(new e30() { // from class: l.b3k0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f73239a.m46747b1(f400Var, str2, str3, str, (Envelope) obj);
                    }
                }, new e30() { // from class: l.c3k0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f78952a.m46748c1(f400Var, str3, (Throwable) obj);
                    }
                }));
                return;
            }
            return;
        }
        if (TextUtils.equals(str, "from_message_tag_guide")) {
            CoreModule.f17545c.f19642f0.f19936f2.m132487l(str);
            f400Var.mo102961c().m66873d2();
        } else {
            if (!TextUtils.equals(str, "from_card_tag_guide")) {
                m46771x0(f400Var, str3);
                return;
            }
            CoreModule.f17545c.f19642f0.f19933e2.m132487l(str);
            f400Var.mo102961c().setResult(-1, new Intent());
            f400Var.mo102961c().m66873d2();
        }
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m46750e1(f400 f400Var, String str, Throwable th) {
        if (yij0.m214930H(th)) {
            return;
        }
        m46771x0(f400Var, str);
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m46751f1(f400 f400Var, String str, roj0 roj0Var) {
        m46759n1(f400Var, str, null);
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m46752g1(f400 f400Var, String str, Throwable th) {
        m46771x0(f400Var, str);
    }

    @liq(key = "getEditTagData")
    public void getEditTagData(@NonNull f400 f400Var, boolean z, String str) {
        m46773z0(f400Var, z, str);
    }

    @liq(key = "getUserTagData")
    public void getUserTagData(@NonNull f400 f400Var, String str, boolean z, String str2) {
        m46725F0(f400Var, str, z, str2);
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m46753h1(String str, f400 f400Var, String str2, roj0 roj0Var) {
        NewTags newTags = CoreModule.f17545c.f19639e0.f149268S6.get(str);
        if (NullChecker.m81303a(newTags)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(newTags);
            sa40.m182802o().m182815M(arrayList);
        }
        f400Var.mo102961c().setResult(-1, new Intent());
        m46759n1(f400Var, str2, null);
    }

    /* JADX INFO: renamed from: i1 */
    public final /* synthetic */ void m46754i1(f400 f400Var, String str, Throwable th) {
        if (yij0.m214930H(th)) {
            return;
        }
        m46771x0(f400Var, str);
    }

    /* JADX INFO: renamed from: j1 */
    public void m46755j1(@NonNull final f400 f400Var, JSONObject jSONObject) {
        e51.m114741F(f400Var.mo102961c(), new Runnable() { // from class: l.r3k0
            @Override // java.lang.Runnable
            public final void run() {
                UserCenterBridgeImplementation.m46717x(f400Var);
            }
        });
    }

    @liq(key = "jumpToProfileAct")
    public void jumpToProfileAct(@NonNull f400 f400Var, String str) {
        m46728I0(f400Var, str, "from_mew_tags");
    }

    /* JADX INFO: renamed from: k1 */
    public void m46756k1(@NonNull final f400 f400Var, JSONObject jSONObject) {
        String strOptString;
        final String strOptString2 = jSONObject.optString("callback");
        final String strOptString3 = jSONObject.optString("type");
        final ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("tags");
        if (jSONArrayOptJSONArray != null) {
            int i = 0;
            while (i < jSONArrayOptJSONArray.length()) {
                if ("food".equals(strOptString3)) {
                    strOptString = lm90.m150559b(jSONArrayOptJSONArray.optString(i));
                } else {
                    strOptString = ("game".equals(strOptString3) || "game_name".equals(strOptString3)) ? jSONArrayOptJSONArray.optString(i) : null;
                }
                if (!TextUtils.isEmpty(strOptString)) {
                    arrayList.add(strOptString);
                }
                i++;
            }
        }
        f400Var.mo102961c().duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).take(1).map(new w9j() { // from class: l.g2k0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return UserCenterBridgeImplementation.m46710q(strOptString3, arrayList, (User) obj);
            }
        }).flatMap(new w9j() { // from class: l.h2k0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return UserCenterBridgeImplementation.m46668O((User) obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.i2k0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110558a.m46743X0(f400Var, strOptString2, (roj0) obj);
            }
        }, new e30() { // from class: l.j2k0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115932a.m46744Y0(f400Var, strOptString2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l1 */
    public void m46757l1(@NonNull final f400 f400Var, JSONObject jSONObject) {
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
            f400Var.mo102961c().duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).take(1).map(new w9j() { // from class: l.x2k0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return UserCenterBridgeImplementation.m46701l0(arrayList, (User) obj);
                }
            }).flatMap(new w9j() { // from class: l.i3k0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return UserCenterBridgeImplementation.m46707o0((User) obj);
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.t3k0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f167643a.m46745Z0(f400Var, strOptString, (roj0) obj);
                }
            }, new e30() { // from class: l.e4k0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f89294a.m46746a1(f400Var, strOptString, (Throwable) obj);
                }
            }));
            return;
        }
        if (!vwb.m200335l(arrayList, sa40.m182802o().m182842z(), new m2k0())) {
            sa40.m182802o().m182822T(arrayList);
        }
        f400Var.mo102961c().setResult(-1, new Intent());
        m46759n1(f400Var, strOptString, null);
    }

    /* JADX INFO: renamed from: m1 */
    public void m46758m1(@NonNull final f400 f400Var, JSONObject jSONObject) {
        if (NullChecker.m81303a(jSONObject)) {
            final String strOptString = jSONObject.optString("callback");
            final String strOptString2 = jSONObject.optString("tabName");
            final String strOptString3 = jSONObject.optString("from");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("selectedTags");
            final ArrayList arrayList = new ArrayList();
            if (NullChecker.m81303a(jSONArrayOptJSONArray)) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(0, jSONArrayOptJSONArray.optString(i));
                }
            }
            f400Var.mo102961c().duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).first().map(new w9j() { // from class: l.o4k0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return UserCenterBridgeImplementation.m46718y(arrayList, (User) obj);
                }
            }).flatMap(new w9j() { // from class: l.p4k0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return UserCenterBridgeImplementation.m46679Z((User) obj);
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.q4k0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f152643a.m46749d1(strOptString3, f400Var, strOptString2, strOptString, (roj0) obj);
                }
            }, new e30() { // from class: l.r4k0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f157705a.m46750e1(f400Var, strOptString, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: n1 */
    public final void m46759n1(f400 f400Var, String str, String str2) {
        m46760o1(f400Var, str, str2, false);
    }

    /* JADX INFO: renamed from: o1 */
    public final void m46760o1(f400 f400Var, String str, String str2, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", "true");
            if (!TextUtils.isEmpty(str2)) {
                if (z) {
                    jSONObject.put("data", new JSONArray(str2));
                } else {
                    jSONObject.put("data", new JSONObject(str2));
                }
            }
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        m46767t0(f400Var, str, jSONObject);
    }

    /* JADX INFO: renamed from: p1 */
    public void m46761p1(@NonNull final f400 f400Var, JSONObject jSONObject) {
        final String strOptString = jSONObject.optString("callback");
        final String strOptString2 = jSONObject.optString("facialFeature");
        if (TextUtils.isEmpty(strOptString2)) {
            m46771x0(f400Var, strOptString);
        } else {
            f400Var.mo102961c().duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).take(1).map(new w9j() { // from class: l.x3k0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return UserCenterBridgeImplementation.m46689f0(strOptString2, (User) obj);
                }
            }).flatMap(new w9j() { // from class: l.y3k0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return UserCenterBridgeImplementation.m46698k((User) obj);
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.z3k0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f201378a.m46751f1(f400Var, strOptString, (roj0) obj);
                }
            }, new e30() { // from class: l.a4k0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f67541a.m46752g1(f400Var, strOptString, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m46762q0(final f400 f400Var, TabName tabName, final String str, String str2) {
        if (!NullChecker.m81303a(snm.m185084O())) {
            snm.m185078I(tabName);
            return;
        }
        String str3 = snm.m185084O().pushMessage.tracker;
        final String str4 = snm.m185084O().pushMessage.userId;
        snm.m185078I(tabName);
        f400Var.mo102961c().duringCreated(CoreModule.f17545c.f19571H1.m201076v3(str3).take(1)).subscribe(mkd0.m154956H(new e30() { // from class: l.n3k0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137000a.m46730K0(f400Var, str4, str, (Envelope) obj);
            }
        }, new e30() { // from class: l.o3k0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141672a.m46731L0(f400Var, str, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q1 */
    public void m46763q1(@NonNull f400 f400Var, JSONObject jSONObject) {
        m46765r1(f400Var, jSONObject.optString("tagID"), jSONObject.optString("action"), jSONObject.optBoolean("preview"), jSONObject.optString("callback"));
    }

    /* JADX INFO: renamed from: r0 */
    public void m46764r0(@NonNull f400 f400Var, JSONObject jSONObject) {
        m46766s0(f400Var, jSONObject.optString("url"));
    }

    /* JADX INFO: renamed from: r1 */
    public void m46765r1(@NonNull final f400 f400Var, final String str, final String str2, boolean z, final String str3) {
        if (!z) {
            f400Var.mo102961c().duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).take(1).map(new w9j() { // from class: l.r2k0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return UserCenterBridgeImplementation.m46685d0(str2, str, (User) obj);
                }
            }).flatMap(new w9j() { // from class: l.s2k0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return UserCenterBridgeImplementation.m46703m0((User) obj);
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.t2k0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f167483a.m46753h1(str, f400Var, str3, (roj0) obj);
                }
            }, new e30() { // from class: l.u2k0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f173500a.m46754i1(f400Var, str3, (Throwable) obj);
                }
            }));
            return;
        }
        List<String> listM182842z = sa40.m182802o().m182842z();
        if (vwb.m200296J(listM182842z)) {
            return;
        }
        if (TextUtils.equals(str2, "add")) {
            if (!listM182842z.contains(str)) {
                listM182842z.add(0, str);
                sa40.m182802o().m182822T(listM182842z);
                f400Var.mo102961c().setResult(-1, new Intent());
                m46759n1(f400Var, str3, null);
                return;
            }
        } else if (TextUtils.equals(str2, RequestParameters.SUBRESOURCE_DELETE) && listM182842z.contains(str)) {
            listM182842z.remove(str);
            sa40.m182802o().m182822T(listM182842z);
            f400Var.mo102961c().setResult(-1, new Intent());
            m46759n1(f400Var, str3, null);
            return;
        }
        m46771x0(f400Var, str3);
    }

    /* JADX INFO: renamed from: s0 */
    public void m46766s0(@NonNull final f400 f400Var, String str) {
        j2e0.m139447n(f400Var.mo102961c(), Uri.parse(str), new f30() { // from class: l.c2k0
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                UserCenterBridgeImplementation.m46688f(f400Var, (String) obj, (String) obj2);
            }
        });
    }

    @liq(key = "safeQuitH5")
    public void safeQuitH5(@NonNull f400 f400Var) {
        snm.m185095Z(false);
    }

    @liq(key = "saveExploreTagData")
    public void saveExploreTagData(@NonNull f400 f400Var, JSONObject jSONObject) {
        m46756k1(f400Var, jSONObject);
    }

    @liq(key = "saveSelectedTagData")
    public void saveSelectedTagData(@NonNull f400 f400Var, JSONObject jSONObject) {
        m46757l1(f400Var, jSONObject);
    }

    @liq(key = "saveTagData")
    public void saveTagData(@NonNull f400 f400Var, JSONObject jSONObject) {
        m46758m1(f400Var, jSONObject);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m46767t0(f400 f400Var, String str, JSONObject jSONObject) {
        if (NullChecker.m81303a(jSONObject) && NullChecker.m81303a(str)) {
            String strQuote = JSONObject.quote(jSONObject.toString());
            if (strQuote.length() < 1) {
                return;
            }
            f400Var.mo102962d().mo127285b(str, strQuote.substring(1, strQuote.length() - 1));
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m46768u0(@NonNull f400 f400Var, JSONObject jSONObject) {
        if (NullChecker.m81303a(jSONObject)) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("tagData");
            String strOptString = jSONObject.optString("callback");
            ArrayList<JSONObject> arrayList = new ArrayList();
            for (int i = 0; NullChecker.m81303a(jSONArrayOptJSONArray) && i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(jSONArrayOptJSONArray.optJSONObject(i));
            }
            ArrayList arrayList2 = new ArrayList();
            for (JSONObject jSONObject2 : arrayList) {
                String strOptString2 = jSONObject2.optString("id");
                String strOptString3 = jSONObject2.optString(AuthenticationTokenClaims.JSON_KEY_NAME);
                String strOptString4 = jSONObject2.optString("icon");
                long jOptLong = jSONObject2.optLong("count");
                String strOptString5 = jSONObject2.optString(NotificationCompat.CATEGORY_STATUS);
                JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("categories");
                ArrayList arrayList3 = new ArrayList();
                if (NullChecker.m81303a(jSONArrayOptJSONArray2)) {
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                        arrayList3.add(jSONArrayOptJSONArray2.optString(i2));
                    }
                }
                if (!TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString3) && !vwb.m200296J(arrayList3) && !TextUtils.isEmpty(strOptString4) && !TextUtils.isEmpty(strOptString5)) {
                    NewTags newTagsNew_ = NewTags.new_();
                    newTagsNew_.f20457id = strOptString2;
                    newTagsNew_.name = strOptString3;
                    newTagsNew_.icon = strOptString4;
                    if (jOptLong <= 0) {
                        jOptLong = 1;
                    }
                    newTagsNew_.localTagUserCounts = jOptLong;
                    newTagsNew_.categories = arrayList3;
                    newTagsNew_.status = strOptString5;
                    if (upa.m194665L3()) {
                        newTagsNew_.isPictureTag = true;
                    }
                    arrayList2.add(newTagsNew_);
                }
            }
            if (vwb.m200296J(arrayList2)) {
                return;
            }
            m46759n1(f400Var, strOptString, null);
            sa40.m182802o().m182815M(arrayList2);
        }
    }

    @liq(key = "updateTagState")
    public void updateTagState(@NonNull f400 f400Var, String str, String str2, boolean z, String str3) {
        m46765r1(f400Var, str, str2, z, str3);
    }

    /* JADX INFO: renamed from: v0 */
    public void m46769v0(final f400 f400Var, JSONObject jSONObject, final boolean z) {
        final String strOptString = jSONObject.optString("otherId");
        final String strOptString2 = jSONObject.optString("from");
        final String strOptString3 = jSONObject.optString("likeProfileId");
        e51.m114748M(new Runnable() { // from class: l.w3k0
            @Override // java.lang.Runnable
            public final void run() {
                UserCenterBridgeImplementation.m46671R(z, f400Var, strOptString, strOptString2, strOptString3);
            }
        });
    }

    /* JADX INFO: renamed from: w0 */
    public void m46770w0(@NonNull f400 f400Var, JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("tagParams");
        String strOptString = jSONObject.optString("callback");
        jSONObject.toString();
        if (jSONArrayOptJSONArray == null) {
            return;
        }
        if (f400Var.mo102961c() instanceof TagChooseMkAct) {
            final TagChooseMkAct tagChooseMkAct = (TagChooseMkAct) f400Var.mo102961c();
            final ArrayList<String> arrayListM43224q2 = tagChooseMkAct.m43224q2();
            arrayListM43224q2.clear();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayListM43224q2.add(jSONArrayOptJSONArray.optJSONObject(i).optString("tagID"));
            }
            tagChooseMkAct.runOnUiThread(new Runnable() { // from class: l.s3k0
                @Override // java.lang.Runnable
                public final void run() {
                    tagChooseMkAct.f26500j.m132487l(arrayListM43224q2);
                }
            });
        } else {
            f400Var.mo102961c().m66873d2();
        }
        m46759n1(f400Var, strOptString, null);
    }

    /* JADX INFO: renamed from: x0 */
    public final void m46771x0(f400 f400Var, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", "false");
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        m46767t0(f400Var, str, jSONObject);
    }

    /* JADX INFO: renamed from: y0 */
    public void m46772y0(@NonNull f400 f400Var, JSONObject jSONObject) {
        m46773z0(f400Var, jSONObject.optBoolean("preview"), jSONObject.optString("callback"));
    }

    /* JADX INFO: renamed from: z0 */
    public void m46773z0(@NonNull final f400 f400Var, final boolean z, final String str) {
        f400Var.mo102961c().duringCreated(C22306c.just(roj0.f160388a).observeOn(jo0.m142408a()).map(new C8400a()).observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.k2k0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return sa40.m182802o().m182831n((User) obj, z);
            }
        }).filter(new l2k0()).map(new w9j() { // from class: l.n2k0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return UserCenterBridgeImplementation.m46711r((EditTagsData) obj);
            }
        }).map(new w9j() { // from class: l.o2k0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return UserCenterBridgeImplementation.m46700l((EditTagsData) obj);
            }
        })).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.p2k0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f146866a.m46732M0(f400Var, str, (EditTagsData) obj);
            }
        }, new e30() { // from class: l.q2k0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152278a.m46733N0(f400Var, str, (Throwable) obj);
            }
        }));
    }
}
