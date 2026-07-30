package com.p051p1.mobile.putong.core.p058ui.jsbridge;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.room.RoomDatabase;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.facebook.AuthenticationTokenClaims;
import com.google.gson.Gson;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.EditTagsData;
import com.p051p1.mobile.putong.core.data.HeartbeatPushInfo;
import com.p051p1.mobile.putong.core.data.NewTags;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.UserBanAppealSwitch;
import com.p051p1.mobile.putong.core.data.UserTagData;
import com.p051p1.mobile.putong.core.data.UserTagsData;
import com.p051p1.mobile.putong.core.newui.profile.TagChooseMkAct;
import com.p051p1.mobile.putong.core.p058ui.jsbridge.UserCenterBridgeImplementation;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.ProfileInfoLoopEditAct;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Extensions;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.Tag;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p153l.bsj0;
import p153l.fo0;
import p153l.gj40;
import p153l.gra;
import p153l.joa;
import p153l.jyb;
import p153l.l51;
import p153l.lf2;
import p153l.lkq;
import p153l.nae0;
import p153l.psd0;
import p153l.pu90;
import p153l.qcj;
import p153l.rbk0;
import p153l.sbk0;
import p153l.upm;
import p153l.uxj0;
import p153l.xc00;
import p153l.y20;
import p153l.z20;

/* JADX INFO: loaded from: classes3.dex */
public class UserCenterBridgeImplementation extends lf2 {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.jsbridge.UserCenterBridgeImplementation$a */
    public class C8563a implements qcj<uxj0, User> {
        public C8563a() {
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public User call(uxj0 uxj0Var) {
            return CoreModule.f18264c.f20381e0.m116593na();
        }
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m47847K(xc00 xc00Var, String str, uxj0 uxj0Var) {
        xc00Var.mo99543c().startActivity(MessagesAct.m50131p2(xc00Var.mo99543c(), str, false, false, false, false, null, 38));
        upm.m197129Z(false);
        xc00Var.mo99543c().m68056e2();
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ C22421c m47851O(User user) {
        return !NullChecker.m82486a(user) ? C22421c.just(uxj0.f181467a) : CoreModule.f18264c.f20381e0.m116620u9(user);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m47854R(boolean z, final xc00 xc00Var, final String str, String str2, String str3) {
        if (z && !joa.m146361M3()) {
            CoreModule.m30933P().m143405a().mo34568pr(xc00Var.mo99543c(), "p_suggest_user_profile_info_view,e_profile_comment_button,click", Privilege.see_who_likes_me);
            return;
        }
        Intent intentMo31676Ar = CoreModule.m30930K().mo31676Ar(xc00Var.mo99543c(), str, str2, false);
        intentMo31676Ar.putExtra("profile_like_id", str3);
        xc00Var.mo99543c().startActivityForResult(RoomDatabase.MAX_BIND_PARAMETER_CNT, intentMo31676Ar, new C4468a.a() { // from class: l.rdk0
            @Override // com.p051p1.mobile.android.app.C4468a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo21400a(int i, int i2, Intent intent) {
                return UserCenterBridgeImplementation.m47874g0(str, xc00Var, i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ ArrayList m47861Y(User user) {
        ArrayList arrayList = new ArrayList();
        for (Media media : user.pictures) {
            if (media != null && media.mediaType.startsWith("image/")) {
                arrayList.add(media.url);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ C22421c m47862Z(User user) {
        return !NullChecker.m82486a(user) ? C22421c.just(uxj0.f181467a) : CoreModule.f18264c.f20381e0.m116620u9(user);
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ User m47868d0(String str, String str2, User user) {
        User userMo225055clone = user.mo225055clone();
        List<String> list = userMo225055clone.profile.extensions.interest.tags;
        if (TextUtils.equals(str, "add")) {
            if (!list.contains(str2)) {
                list.add(0, str2);
                userMo225055clone.profile.extensions.interest.tags = list;
            }
        } else if (TextUtils.equals(str, RequestParameters.SUBRESOURCE_DELETE) && list.contains(str2)) {
            list.remove(str2);
            userMo225055clone.profile.extensions.interest.tags = list;
        }
        if (jyb.m147479J(list)) {
            userMo225055clone.profile.tags.clear();
        } else {
            gj40.C17227h c17227hM130431P = gj40.m130415o().m130431P(list);
            if (NullChecker.m82486a(c17227hM130431P) && c17227hM130431P.f104596a) {
                List<NewTags> listM130460b = c17227hM130431P.m130460b();
                List<NewTags> listSubList = listM130460b.subList(0, Math.min(listM130460b.size(), 10));
                userMo225055clone.profile.tags = jyb.m147486Q(listSubList, new qcj() { // from class: l.kck0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return UserCenterBridgeImplementation.m47880j0((NewTags) obj);
                    }
                });
            }
        }
        return userMo225055clone.subtract(user);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ EditTagsData m47870e0(final EditTagsData editTagsData) {
        if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116593na()) && !jyb.m147479J(editTagsData.tags)) {
            List<UserTagData> list = editTagsData.tags;
            Gender gender = CoreModule.f18264c.f20381e0.m116593na().gender;
            if (TEnum.equals(gender, "female")) {
                jyb.m147503d0(list, new qcj() { // from class: l.pdk0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        UserTagData userTagData = (UserTagData) obj;
                        return Boolean.valueOf(TextUtils.equals(userTagData.gender, "male") && !editTagsData.selectedTags.contains(userTagData.f21269id));
                    }
                });
            }
            if (TEnum.equals(gender, "male")) {
                jyb.m147503d0(list, new qcj() { // from class: l.qdk0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        UserTagData userTagData = (UserTagData) obj;
                        return Boolean.valueOf(TextUtils.equals(userTagData.gender, "female") && !editTagsData.selectedTags.contains(userTagData.f21269id));
                    }
                });
            }
            editTagsData.tags = list;
        }
        return editTagsData;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m47871f(xc00 xc00Var, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        xc00Var.mo99544d().mo97004b(str, str2);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ User m47872f0(String str, User user) {
        User userMo225055clone = user.mo225055clone();
        Extensions extensions = userMo225055clone.profile.extensions;
        if (extensions != null && extensions.basic != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            userMo225055clone.profile.extensions.basic.facialFeature = arrayList;
        }
        return userMo225055clone.subtract(user);
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ boolean m47874g0(String str, final xc00 xc00Var, int i, int i2, Intent intent) {
        Relationship relationship;
        Relationship relationship2;
        if (i == 999) {
            String string = "";
            if (i2 == SwipeDirection.LEFT.getValue()) {
                String stringExtra = intent.getStringExtra("userId");
                if (TextUtils.equals(intent.getStringExtra("action"), "report")) {
                    string = "reported";
                } else {
                    User userById = CoreModule.m30930K().getUserById(str);
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
                l51.m152888H(xc00Var.mo99543c(), new Runnable() { // from class: l.sdk0
                    @Override // java.lang.Runnable
                    public final void run() {
                        xc00Var.mo99544d().mo97004b("datingProfileAction", strSubstring);
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
                l51.m152888H(xc00Var.mo99543c(), new Runnable() { // from class: l.tdk0
                    @Override // java.lang.Runnable
                    public final void run() {
                        xc00Var.mo99544d().mo97004b("datingProfileAction", strSubstring2);
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
                xc00Var.mo99544d().mo97004b("datingProfileAction", strQuote3.substring(1, strQuote3.length() - 1));
                return true;
            }
            User userById2 = CoreModule.m30930K().getUserById(str);
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
            xc00Var.mo99544d().mo97004b("datingProfileAction", strQuote4.substring(1, strQuote4.length() - 1));
        }
        return false;
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ Tag m47880j0(NewTags newTags) {
        return new Tag("personality", newTags.name);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ C22421c m47881k(User user) {
        return !NullChecker.m82486a(user) ? C22421c.just(uxj0.f181467a) : CoreModule.f18264c.f20381e0.m116620u9(user);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ EditTagsData m47883l(final EditTagsData editTagsData) {
        if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116593na()) && !jyb.m147479J(editTagsData.tags)) {
            List<UserTagData> list = editTagsData.tags;
            Gender gender = CoreModule.f18264c.f20381e0.m116593na().gender;
            if (TEnum.equals(gender, "female")) {
                jyb.m147503d0(list, new qcj() { // from class: l.cck0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        UserTagData userTagData = (UserTagData) obj;
                        return Boolean.valueOf(TextUtils.equals(userTagData.gender, "male") && !editTagsData.selectedTags.contains(userTagData.f21269id));
                    }
                });
            }
            if (TEnum.equals(gender, "male")) {
                jyb.m147503d0(list, new qcj() { // from class: l.eck0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        UserTagData userTagData = (UserTagData) obj;
                        return Boolean.valueOf(TextUtils.equals(userTagData.gender, "female") && !editTagsData.selectedTags.contains(userTagData.f21269id));
                    }
                });
            }
            editTagsData.tags = list;
        }
        return editTagsData;
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ User m47884l0(List list, User user) {
        User userMo225055clone = user.mo225055clone();
        userMo225055clone.profile.extensions.interest.tags = list;
        if (jyb.m147479J(list)) {
            userMo225055clone.profile.tags.clear();
        } else {
            gj40.C17227h c17227hM130431P = gj40.m130415o().m130431P(list);
            if (NullChecker.m82486a(c17227hM130431P) && c17227hM130431P.f104596a) {
                List<NewTags> listM130460b = c17227hM130431P.m130460b();
                List<NewTags> listSubList = listM130460b.subList(0, Math.min(listM130460b.size(), 10));
                userMo225055clone.profile.tags = jyb.m147486Q(listSubList, new qcj() { // from class: l.fck0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return UserCenterBridgeImplementation.m47887n((NewTags) obj);
                    }
                });
            }
        }
        return userMo225055clone.subtract(user);
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ C22421c m47886m0(User user) {
        return !NullChecker.m82486a(user) ? C22421c.just(uxj0.f181467a) : CoreModule.f18264c.f20381e0.m116620u9(user);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ Tag m47887n(NewTags newTags) {
        return new Tag("personality", newTags.name);
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ C22421c m47890o0(User user) {
        return !NullChecker.m82486a(user) ? C22421c.just(uxj0.f181467a) : CoreModule.f18264c.f20381e0.m116620u9(user);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ User m47893q(String str, List list, User user) {
        User userMo225055clone = user.mo225055clone();
        if ("food".equals(str)) {
            userMo225055clone.profile.extensions.interest.taste = list;
        } else if ("game".equals(str)) {
            userMo225055clone.profile.extensions.game.together = list;
        } else if ("game_name".equals(str)) {
            userMo225055clone.profile.extensions.game.name = list;
        }
        return userMo225055clone.subtract(user);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ EditTagsData m47894r(final EditTagsData editTagsData) {
        List<UserTagData> list = editTagsData.tags;
        jyb.m147503d0(list, new qcj() { // from class: l.gck0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                UserTagData userTagData = (UserTagData) obj;
                return Boolean.valueOf(TextUtils.equals(userTagData.status, UserBanAppealSwitch.offline) && !editTagsData.selectedTags.contains(userTagData.f21269id));
            }
        });
        editTagsData.tags = list;
        return editTagsData;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ Tag m47895s(NewTags newTags) {
        return new Tag("personality", newTags.name);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ boolean m47897u(final xc00 xc00Var, int i, int i2, Intent intent) {
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
            l51.m152888H(xc00Var.mo99543c(), new Runnable() { // from class: l.qck0
                @Override // java.lang.Runnable
                public final void run() {
                    xc00Var.mo99544d().mo97004b("dislikeFromProfile", strSubstring);
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
            l51.m152888H(xc00Var.mo99543c(), new Runnable() { // from class: l.rck0
                @Override // java.lang.Runnable
                public final void run() {
                    xc00Var.mo99544d().mo97004b("likeResultsFromProfile", strSubstring2);
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
            l51.m152888H(xc00Var.mo99543c(), new Runnable() { // from class: l.sck0
                @Override // java.lang.Runnable
                public final void run() {
                    xc00Var.mo99544d().mo97004b("likeResultsFromProfile", strSubstring3);
                }
            }, 100L);
        }
        return true;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m47898v(String str, xc00 xc00Var, String str2, uxj0 uxj0Var) {
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(str);
        if (NullChecker.m82486a(userM116503Pa) && userM116503Pa.isMe()) {
            xc00Var.mo99543c().startActivity(CoreModule.m30930K().mo31676Ar(xc00Var.mo99543c(), str, str2, false));
        } else if (NullChecker.m82486a(userM116503Pa) && NullChecker.m82486a(userM116503Pa.localRelationship)) {
            xc00Var.mo99543c().startActivity(CoreModule.m30930K().mo31676Ar(xc00Var.mo99543c(), str, str2, !(TEnum.equals(userM116503Pa.localRelationship.state, "liked") || TEnum.equals(userM116503Pa.localRelationship.state, "matched"))));
        } else {
            xc00Var.mo99543c().startActivity(CoreModule.m30930K().mo31676Ar(xc00Var.mo99543c(), str, str2, true));
        }
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m47900x(xc00 xc00Var) {
        if (xc00Var.mo99543c() instanceof ProfileInfoLoopEditAct) {
            ((ProfileInfoLoopEditAct) xc00Var.mo99543c()).m52694d2(true);
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ User m47901y(List list, User user) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(user.profile.extensions.interest.tags);
        User userMo225055clone = user.mo225055clone();
        userMo225055clone.profile.extensions.interest.tags.clear();
        userMo225055clone.profile.extensions.interest.tags = arrayList;
        if (!jyb.m147479J(list)) {
            gj40.C17227h c17227hM130431P = gj40.m130415o().m130431P(arrayList);
            if (NullChecker.m82486a(c17227hM130431P) && c17227hM130431P.f104596a) {
                List<NewTags> listM130460b = c17227hM130431P.m130460b();
                if (!jyb.m147479J(listM130460b)) {
                    List<NewTags> listSubList = listM130460b.subList(0, Math.min(listM130460b.size(), 10));
                    userMo225055clone.profile.tags = jyb.m147486Q(listSubList, new qcj() { // from class: l.bck0
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return UserCenterBridgeImplementation.m47895s((NewTags) obj);
                        }
                    });
                }
            }
        }
        return userMo225055clone.subtract(user);
    }

    /* JADX INFO: renamed from: A0 */
    public void m47903A0(@NonNull final xc00 xc00Var, final String str) {
        xc00Var.mo99543c().duringCreated(C22421c.just(uxj0.f181467a).observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.hdk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return gj40.m130415o().m130443m(xc00Var.mo99543c());
            }
        }).filter(new rbk0()).map(new qcj() { // from class: l.idk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return UserCenterBridgeImplementation.m47870e0((EditTagsData) obj);
            }
        })).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.jdk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f120273a.m47917O0(xc00Var, str, (EditTagsData) obj);
            }
        }, new y20() { // from class: l.ldk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f131653a.m47918P0(xc00Var, str, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B0 */
    public void m47904B0(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        m47903A0(xc00Var, jSONObject.optString("callback"));
    }

    /* JADX INFO: renamed from: C0 */
    public void m47905C0(@NonNull final xc00 xc00Var, final String str, final String str2) {
        l51.m152893M(new Runnable() { // from class: l.bdk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f76270a.m47921S0(xc00Var, str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: D0 */
    public void m47906D0(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        m47905C0(xc00Var, jSONObject.optString("userId"), jSONObject.optString("callback"));
    }

    /* JADX INFO: renamed from: E0 */
    public void m47907E0(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        m47908F0(xc00Var, jSONObject.optString("userID"), jSONObject.optBoolean("preview"), jSONObject.optString("callback"));
    }

    /* JADX INFO: renamed from: F0 */
    public void m47908F0(@NonNull final xc00 xc00Var, final String str, final boolean z, final String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        l51.m152893M(new Runnable() { // from class: l.hbk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f108596a.m47924V0(xc00Var, str, z, str2);
            }
        });
    }

    /* JADX INFO: renamed from: G0 */
    public void m47909G0(@NonNull final xc00 xc00Var, final JSONObject jSONObject) {
        l51.m152886F(xc00Var.mo99543c(), new Runnable() { // from class: l.adk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f70697a.m47925W0(jSONObject, xc00Var);
            }
        });
    }

    /* JADX INFO: renamed from: H0 */
    public void m47910H0(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("from");
        if (TextUtils.equals(strOptString, "from_portrait_like_list") || TextUtils.equals(strOptString, "from_find_partner") || TextUtils.equals(strOptString, "p_picks_profile")) {
            m47911I0(xc00Var, jSONObject.optString("userId"), strOptString);
        } else {
            m47911I0(xc00Var, jSONObject.optString("userId"), "from_mew_tags");
        }
    }

    /* JADX INFO: renamed from: I0 */
    public void m47911I0(@NonNull final xc00 xc00Var, final String str, final String str2) {
        if (TextUtils.equals(str2, "from_find_partner")) {
            xc00Var.mo99543c().duringCreated(CoreModule.f18264c.f20381e0.m116616t9(str)).subscribe(psd0.m173596G(new y20() { // from class: l.jbk0
                @Override // p153l.y20
                public final void call(Object obj) {
                    UserCenterBridgeImplementation.m47898v(str, xc00Var, str2, (uxj0) obj);
                }
            }));
        } else if (TextUtils.equals(str2, "p_picks_profile")) {
            l51.m152893M(new Runnable() { // from class: l.kbk0
                @Override // java.lang.Runnable
                public final void run() {
                    xc00 xc00Var2 = xc00Var;
                    xc00Var2.mo99543c().startActivityForResult(RoomDatabase.MAX_BIND_PARAMETER_CNT, CoreModule.m30930K().mo31676Ar(xc00Var2.mo99543c(), str, str2, false), new C4468a.a() { // from class: l.jck0
                        @Override // com.p051p1.mobile.android.app.C4468a.a
                        /* JADX INFO: renamed from: a */
                        public final boolean mo21400a(int i, int i2, Intent intent) {
                            return UserCenterBridgeImplementation.m47897u(xc00Var2, i, i2, intent);
                        }
                    });
                }
            });
        } else {
            xc00Var.mo99543c().duringCreated(CoreModule.m30930K().userObsById(str)).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.lbk0
                @Override // p153l.y20
                public final void call(Object obj) {
                    xc00 xc00Var2 = xc00Var;
                    xc00Var2.mo99543c().startActivity(CoreModule.m30930K().mo31676Ar(xc00Var2.mo99543c(), str, str2, false));
                }
            }));
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m47912J0(xc00 xc00Var, String str, Throwable th) {
        m47954x0(xc00Var, str);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m47913K0(final xc00 xc00Var, final String str, final String str2, Envelope envelope) {
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        if (NullChecker.m82486a(coreData) && coreData.heartbeatMatch.matched) {
            xc00Var.mo99543c().duringCreated(CoreModule.f18264c.f20384f0.m33905ap(str)).subscribe(psd0.m173597H(new y20() { // from class: l.vck0
                @Override // p153l.y20
                public final void call(Object obj) {
                    UserCenterBridgeImplementation.m47847K(xc00Var, str, (uxj0) obj);
                }
            }, new y20() { // from class: l.wck0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f188481a.m47912J0(xc00Var, str2, (Throwable) obj);
                }
            }));
        } else {
            m47954x0(xc00Var, str2);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m47914L0(xc00 xc00Var, String str, Throwable th) {
        m47954x0(xc00Var, str);
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m47915M0(xc00 xc00Var, String str, EditTagsData editTagsData) {
        m47942n1(xc00Var, str, editTagsData.toJson());
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m47916N0(xc00 xc00Var, String str, Throwable th) {
        m47954x0(xc00Var, str);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m47917O0(xc00 xc00Var, String str, EditTagsData editTagsData) {
        m47942n1(xc00Var, str, editTagsData.toJson());
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m47918P0(xc00 xc00Var, String str, Throwable th) {
        m47954x0(xc00Var, str);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m47919Q0(xc00 xc00Var, String str, ArrayList arrayList) {
        m47943o1(xc00Var, str, new Gson().toJson(arrayList), true);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m47920R0(xc00 xc00Var, String str, Throwable th) {
        m47954x0(xc00Var, str);
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m47921S0(final xc00 xc00Var, String str, final String str2) {
        xc00Var.mo99543c().duringCreated(CoreModule.m30930K().userObsById(str)).take(1).map(new qcj() { // from class: l.mdk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return UserCenterBridgeImplementation.m47861Y((User) obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.ndk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141503a.m47919Q0(xc00Var, str2, (ArrayList) obj);
            }
        }, new y20() { // from class: l.odk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f146919a.m47920R0(xc00Var, str2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m47922T0(xc00 xc00Var, String str, UserTagsData userTagsData) {
        m47942n1(xc00Var, str, userTagsData.toJson());
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m47923U0(xc00 xc00Var, String str, Throwable th) {
        m47954x0(xc00Var, str);
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m47924V0(final xc00 xc00Var, String str, final boolean z, final String str2) {
        xc00Var.mo99543c().duringCreated(CoreModule.m30930K().userObsById(str)).take(1).map(new qcj() { // from class: l.lck0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return gj40.m130415o().m130416A(xc00Var.mo99543c(), (User) obj, z);
            }
        }).filter(new qcj() { // from class: l.mck0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((UserTagsData) obj));
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.nck0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141372a.m47922T0(xc00Var, str2, (UserTagsData) obj);
            }
        }, new y20() { // from class: l.pck0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f151603a.m47923U0(xc00Var, str2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m47925W0(JSONObject jSONObject, xc00 xc00Var) {
        String strOptString = jSONObject.optString("callback");
        JSONObject jSONObject2 = new JSONObject();
        if (xc00Var.mo99543c() instanceof ProfileInfoLoopEditAct) {
            try {
                jSONObject2.put("success", ((ProfileInfoLoopEditAct) xc00Var.mo99543c()).m52693c2());
            } catch (JSONException unused) {
            }
            m47950t0(xc00Var, strOptString, jSONObject2);
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m47926X0(xc00 xc00Var, String str, uxj0 uxj0Var) {
        xc00Var.mo99543c().setResult(-1, new Intent());
        m47942n1(xc00Var, str, null);
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m47927Y0(xc00 xc00Var, String str, Throwable th) {
        if (bsj0.m106250H(th)) {
            return;
        }
        m47954x0(xc00Var, str);
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m47928Z0(xc00 xc00Var, String str, uxj0 uxj0Var) {
        xc00Var.mo99543c().setResult(-1, new Intent());
        m47942n1(xc00Var, str, null);
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m47929a1(xc00 xc00Var, String str, Throwable th) {
        if (bsj0.m106250H(th)) {
            return;
        }
        m47954x0(xc00Var, str);
    }

    @lkq(key = "action")
    public void action(@NonNull xc00 xc00Var, String str) {
        m47949s0(xc00Var, str);
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m47930b1(xc00 xc00Var, String str, String str2, String str3, Envelope envelope) {
        m47945q0(xc00Var, TabName.transform(str), str2, str3);
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m47931c1(xc00 xc00Var, String str, Throwable th) {
        m47954x0(xc00Var, str);
    }

    @lkq(key = "createUserTag")
    public void createUserTag(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        m47951u0(xc00Var, jSONObject);
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m47932d1(final String str, final xc00 xc00Var, final String str2, final String str3, uxj0 uxj0Var) {
        if (TextUtils.equals(str, "from_heartbeat")) {
            HeartbeatPushInfo heartbeatPushInfoM197118O = upm.m197118O();
            if (NullChecker.m82486a(heartbeatPushInfoM197118O) && NullChecker.m82486a(heartbeatPushInfoM197118O.pushMessage) && NullChecker.m82486a(heartbeatPushInfoM197118O.pushMessage.tracker)) {
                xc00Var.mo99543c().duringCreated(CoreModule.f18264c.f20313H1.m123929v3(heartbeatPushInfoM197118O.pushMessage.tracker)).subscribe(psd0.m173597H(new y20() { // from class: l.hck0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f108705a.m47930b1(xc00Var, str2, str3, str, (Envelope) obj);
                    }
                }, new y20() { // from class: l.ick0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f114412a.m47931c1(xc00Var, str3, (Throwable) obj);
                    }
                }));
                return;
            }
            return;
        }
        if (TextUtils.equals(str, "from_message_tag_guide")) {
            CoreModule.f18264c.f20384f0.f20678f2.m137019l(str);
            xc00Var.mo99543c().m68056e2();
        } else {
            if (!TextUtils.equals(str, "from_card_tag_guide")) {
                m47954x0(xc00Var, str3);
                return;
            }
            CoreModule.f18264c.f20384f0.f20675e2.m137019l(str);
            xc00Var.mo99543c().setResult(-1, new Intent());
            xc00Var.mo99543c().m68056e2();
        }
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m47933e1(xc00 xc00Var, String str, Throwable th) {
        if (bsj0.m106250H(th)) {
            return;
        }
        m47954x0(xc00Var, str);
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m47934f1(xc00 xc00Var, String str, uxj0 uxj0Var) {
        m47942n1(xc00Var, str, null);
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m47935g1(xc00 xc00Var, String str, Throwable th) {
        m47954x0(xc00Var, str);
    }

    @lkq(key = "getEditTagData")
    public void getEditTagData(@NonNull xc00 xc00Var, boolean z, String str) {
        m47956z0(xc00Var, z, str);
    }

    @lkq(key = "getUserTagData")
    public void getUserTagData(@NonNull xc00 xc00Var, String str, boolean z, String str2) {
        m47908F0(xc00Var, str, z, str2);
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m47936h1(String str, xc00 xc00Var, String str2, uxj0 uxj0Var) {
        NewTags newTags = CoreModule.f18264c.f20381e0.f89125S6.get(str);
        if (NullChecker.m82486a(newTags)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(newTags);
            gj40.m130415o().m130428M(arrayList);
        }
        xc00Var.mo99543c().setResult(-1, new Intent());
        m47942n1(xc00Var, str2, null);
    }

    /* JADX INFO: renamed from: i1 */
    public final /* synthetic */ void m47937i1(xc00 xc00Var, String str, Throwable th) {
        if (bsj0.m106250H(th)) {
            return;
        }
        m47954x0(xc00Var, str);
    }

    /* JADX INFO: renamed from: j1 */
    public void m47938j1(@NonNull final xc00 xc00Var, JSONObject jSONObject) {
        l51.m152886F(xc00Var.mo99543c(), new Runnable() { // from class: l.xck0
            @Override // java.lang.Runnable
            public final void run() {
                UserCenterBridgeImplementation.m47900x(xc00Var);
            }
        });
    }

    @lkq(key = "jumpToProfileAct")
    public void jumpToProfileAct(@NonNull xc00 xc00Var, String str) {
        m47911I0(xc00Var, str, "from_mew_tags");
    }

    /* JADX INFO: renamed from: k1 */
    public void m47939k1(@NonNull final xc00 xc00Var, JSONObject jSONObject) {
        String strOptString;
        final String strOptString2 = jSONObject.optString("callback");
        final String strOptString3 = jSONObject.optString("type");
        final ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("tags");
        if (jSONArrayOptJSONArray != null) {
            int i = 0;
            while (i < jSONArrayOptJSONArray.length()) {
                if ("food".equals(strOptString3)) {
                    strOptString = pu90.m173838b(jSONArrayOptJSONArray.optString(i));
                } else {
                    strOptString = ("game".equals(strOptString3) || "game_name".equals(strOptString3)) ? jSONArrayOptJSONArray.optString(i) : null;
                }
                if (!TextUtils.isEmpty(strOptString)) {
                    arrayList.add(strOptString);
                }
                i++;
            }
        }
        xc00Var.mo99543c().duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).take(1).map(new qcj() { // from class: l.mbk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return UserCenterBridgeImplementation.m47893q(strOptString3, arrayList, (User) obj);
            }
        }).flatMap(new qcj() { // from class: l.nbk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return UserCenterBridgeImplementation.m47851O((User) obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.obk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f146596a.m47926X0(xc00Var, strOptString2, (uxj0) obj);
            }
        }, new y20() { // from class: l.pbk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f151395a.m47927Y0(xc00Var, strOptString2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l1 */
    public void m47940l1(@NonNull final xc00 xc00Var, JSONObject jSONObject) {
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
            xc00Var.mo99543c().duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).take(1).map(new qcj() { // from class: l.dck0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return UserCenterBridgeImplementation.m47884l0(arrayList, (User) obj);
                }
            }).flatMap(new qcj() { // from class: l.ock0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return UserCenterBridgeImplementation.m47890o0((User) obj);
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.zck0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f203799a.m47928Z0(xc00Var, strOptString, (uxj0) obj);
                }
            }, new y20() { // from class: l.kdk0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f125255a.m47929a1(xc00Var, strOptString, (Throwable) obj);
                }
            }));
            return;
        }
        if (!jyb.m147518l(arrayList, gj40.m130415o().m130455z(), new sbk0())) {
            gj40.m130415o().m130435T(arrayList);
        }
        xc00Var.mo99543c().setResult(-1, new Intent());
        m47942n1(xc00Var, strOptString, null);
    }

    /* JADX INFO: renamed from: m1 */
    public void m47941m1(@NonNull final xc00 xc00Var, JSONObject jSONObject) {
        if (NullChecker.m82486a(jSONObject)) {
            final String strOptString = jSONObject.optString("callback");
            final String strOptString2 = jSONObject.optString("tabName");
            final String strOptString3 = jSONObject.optString("from");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("selectedTags");
            final ArrayList arrayList = new ArrayList();
            if (NullChecker.m82486a(jSONArrayOptJSONArray)) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(0, jSONArrayOptJSONArray.optString(i));
                }
            }
            xc00Var.mo99543c().duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).first().map(new qcj() { // from class: l.udk0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return UserCenterBridgeImplementation.m47901y(arrayList, (User) obj);
                }
            }).flatMap(new qcj() { // from class: l.vdk0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return UserCenterBridgeImplementation.m47862Z((User) obj);
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.wdk0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f188614a.m47932d1(strOptString3, xc00Var, strOptString2, strOptString, (uxj0) obj);
                }
            }, new y20() { // from class: l.xdk0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f193606a.m47933e1(xc00Var, strOptString, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: n1 */
    public final void m47942n1(xc00 xc00Var, String str, String str2) {
        m47943o1(xc00Var, str, str2, false);
    }

    /* JADX INFO: renamed from: o1 */
    public final void m47943o1(xc00 xc00Var, String str, String str2, boolean z) {
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
            CrashHelper.m82479c(e);
        }
        m47950t0(xc00Var, str, jSONObject);
    }

    /* JADX INFO: renamed from: p1 */
    public void m47944p1(@NonNull final xc00 xc00Var, JSONObject jSONObject) {
        final String strOptString = jSONObject.optString("callback");
        final String strOptString2 = jSONObject.optString("facialFeature");
        if (TextUtils.isEmpty(strOptString2)) {
            m47954x0(xc00Var, strOptString);
        } else {
            xc00Var.mo99543c().duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).take(1).map(new qcj() { // from class: l.ddk0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return UserCenterBridgeImplementation.m47872f0(strOptString2, (User) obj);
                }
            }).flatMap(new qcj() { // from class: l.edk0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return UserCenterBridgeImplementation.m47881k((User) obj);
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.fdk0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f98481a.m47934f1(xc00Var, strOptString, (uxj0) obj);
                }
            }, new y20() { // from class: l.gdk0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f103719a.m47935g1(xc00Var, strOptString, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m47945q0(final xc00 xc00Var, TabName tabName, final String str, String str2) {
        if (!NullChecker.m82486a(upm.m197118O())) {
            upm.m197112I(tabName);
            return;
        }
        String str3 = upm.m197118O().pushMessage.tracker;
        final String str4 = upm.m197118O().pushMessage.userId;
        upm.m197112I(tabName);
        xc00Var.mo99543c().duringCreated(CoreModule.f18264c.f20313H1.m123929v3(str3).take(1)).subscribe(psd0.m173597H(new y20() { // from class: l.tck0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f173235a.m47913K0(xc00Var, str4, str, (Envelope) obj);
            }
        }, new y20() { // from class: l.uck0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178440a.m47914L0(xc00Var, str, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q1 */
    public void m47946q1(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        m47948r1(xc00Var, jSONObject.optString("tagID"), jSONObject.optString("action"), jSONObject.optBoolean("preview"), jSONObject.optString("callback"));
    }

    /* JADX INFO: renamed from: r0 */
    public void m47947r0(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        m47949s0(xc00Var, jSONObject.optString("url"));
    }

    /* JADX INFO: renamed from: r1 */
    public void m47948r1(@NonNull final xc00 xc00Var, final String str, final String str2, boolean z, final String str3) {
        if (!z) {
            xc00Var.mo99543c().duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).take(1).map(new qcj() { // from class: l.xbk0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return UserCenterBridgeImplementation.m47868d0(str2, str, (User) obj);
                }
            }).flatMap(new qcj() { // from class: l.ybk0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return UserCenterBridgeImplementation.m47886m0((User) obj);
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.zbk0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f203677a.m47936h1(str, xc00Var, str3, (uxj0) obj);
                }
            }, new y20() { // from class: l.ack0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f69719a.m47937i1(xc00Var, str3, (Throwable) obj);
                }
            }));
            return;
        }
        List<String> listM130455z = gj40.m130415o().m130455z();
        if (jyb.m147479J(listM130455z)) {
            return;
        }
        if (TextUtils.equals(str2, "add")) {
            if (!listM130455z.contains(str)) {
                listM130455z.add(0, str);
                gj40.m130415o().m130435T(listM130455z);
                xc00Var.mo99543c().setResult(-1, new Intent());
                m47942n1(xc00Var, str3, null);
                return;
            }
        } else if (TextUtils.equals(str2, RequestParameters.SUBRESOURCE_DELETE) && listM130455z.contains(str)) {
            listM130455z.remove(str);
            gj40.m130415o().m130435T(listM130455z);
            xc00Var.mo99543c().setResult(-1, new Intent());
            m47942n1(xc00Var, str3, null);
            return;
        }
        m47954x0(xc00Var, str3);
    }

    /* JADX INFO: renamed from: s0 */
    public void m47949s0(@NonNull final xc00 xc00Var, String str) {
        nae0.m162084n(xc00Var.mo99543c(), Uri.parse(str), new z20() { // from class: l.ibk0
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                UserCenterBridgeImplementation.m47871f(xc00Var, (String) obj, (String) obj2);
            }
        });
    }

    @lkq(key = "safeQuitH5")
    public void safeQuitH5(@NonNull xc00 xc00Var) {
        upm.m197129Z(false);
    }

    @lkq(key = "saveExploreTagData")
    public void saveExploreTagData(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        m47939k1(xc00Var, jSONObject);
    }

    @lkq(key = "saveSelectedTagData")
    public void saveSelectedTagData(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        m47940l1(xc00Var, jSONObject);
    }

    @lkq(key = "saveTagData")
    public void saveTagData(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        m47941m1(xc00Var, jSONObject);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m47950t0(xc00 xc00Var, String str, JSONObject jSONObject) {
        if (NullChecker.m82486a(jSONObject) && NullChecker.m82486a(str)) {
            String strQuote = JSONObject.quote(jSONObject.toString());
            if (strQuote.length() < 1) {
                return;
            }
            xc00Var.mo99544d().mo97004b(str, strQuote.substring(1, strQuote.length() - 1));
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m47951u0(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        if (NullChecker.m82486a(jSONObject)) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("tagData");
            String strOptString = jSONObject.optString("callback");
            ArrayList<JSONObject> arrayList = new ArrayList();
            for (int i = 0; NullChecker.m82486a(jSONArrayOptJSONArray) && i < jSONArrayOptJSONArray.length(); i++) {
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
                if (NullChecker.m82486a(jSONArrayOptJSONArray2)) {
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                        arrayList3.add(jSONArrayOptJSONArray2.optString(i2));
                    }
                }
                if (!TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString3) && !jyb.m147479J(arrayList3) && !TextUtils.isEmpty(strOptString4) && !TextUtils.isEmpty(strOptString5)) {
                    NewTags newTagsNew_ = NewTags.new_();
                    newTagsNew_.f21199id = strOptString2;
                    newTagsNew_.name = strOptString3;
                    newTagsNew_.icon = strOptString4;
                    if (jOptLong <= 0) {
                        jOptLong = 1;
                    }
                    newTagsNew_.localTagUserCounts = jOptLong;
                    newTagsNew_.categories = arrayList3;
                    newTagsNew_.status = strOptString5;
                    if (gra.m131596L3()) {
                        newTagsNew_.isPictureTag = true;
                    }
                    arrayList2.add(newTagsNew_);
                }
            }
            if (jyb.m147479J(arrayList2)) {
                return;
            }
            m47942n1(xc00Var, strOptString, null);
            gj40.m130415o().m130428M(arrayList2);
        }
    }

    @lkq(key = "updateTagState")
    public void updateTagState(@NonNull xc00 xc00Var, String str, String str2, boolean z, String str3) {
        m47948r1(xc00Var, str, str2, z, str3);
    }

    /* JADX INFO: renamed from: v0 */
    public void m47952v0(final xc00 xc00Var, JSONObject jSONObject, final boolean z) {
        final String strOptString = jSONObject.optString("otherId");
        final String strOptString2 = jSONObject.optString("from");
        final String strOptString3 = jSONObject.optString("likeProfileId");
        l51.m152893M(new Runnable() { // from class: l.cdk0
            @Override // java.lang.Runnable
            public final void run() {
                UserCenterBridgeImplementation.m47854R(z, xc00Var, strOptString, strOptString2, strOptString3);
            }
        });
    }

    /* JADX INFO: renamed from: w0 */
    public void m47953w0(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("tagParams");
        String strOptString = jSONObject.optString("callback");
        jSONObject.toString();
        if (jSONArrayOptJSONArray == null) {
            return;
        }
        if (xc00Var.mo99543c() instanceof TagChooseMkAct) {
            final TagChooseMkAct tagChooseMkAct = (TagChooseMkAct) xc00Var.mo99543c();
            final ArrayList<String> arrayListM44235r2 = tagChooseMkAct.m44235r2();
            arrayListM44235r2.clear();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayListM44235r2.add(jSONArrayOptJSONArray.optJSONObject(i).optString("tagID"));
            }
            tagChooseMkAct.runOnUiThread(new Runnable() { // from class: l.yck0
                @Override // java.lang.Runnable
                public final void run() {
                    tagChooseMkAct.f27242j.m137019l(arrayListM44235r2);
                }
            });
        } else {
            xc00Var.mo99543c().m68056e2();
        }
        m47942n1(xc00Var, strOptString, null);
    }

    /* JADX INFO: renamed from: x0 */
    public final void m47954x0(xc00 xc00Var, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", "false");
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        m47950t0(xc00Var, str, jSONObject);
    }

    /* JADX INFO: renamed from: y0 */
    public void m47955y0(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        m47956z0(xc00Var, jSONObject.optBoolean("preview"), jSONObject.optString("callback"));
    }

    /* JADX INFO: renamed from: z0 */
    public void m47956z0(@NonNull final xc00 xc00Var, final boolean z, final String str) {
        xc00Var.mo99543c().duringCreated(C22421c.just(uxj0.f181467a).observeOn(fo0.m126432a()).map(new C8563a()).observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.qbk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return gj40.m130415o().m130444n((User) obj, z);
            }
        }).filter(new rbk0()).map(new qcj() { // from class: l.tbk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return UserCenterBridgeImplementation.m47894r((EditTagsData) obj);
            }
        }).map(new qcj() { // from class: l.ubk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return UserCenterBridgeImplementation.m47883l((EditTagsData) obj);
            }
        })).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.vbk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f183258a.m47915M0(xc00Var, str, (EditTagsData) obj);
            }
        }, new y20() { // from class: l.wbk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188253a.m47916N0(xc00Var, str, (Throwable) obj);
            }
        }));
    }
}
