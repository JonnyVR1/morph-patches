package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4880a0;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ConversationType;
import com.p051p1.mobile.putong.core.data.InsertConversationUser;
import com.p051p1.mobile.putong.core.data.InsertConversationsList;
import com.p051p1.mobile.putong.core.data.SpecialCard;
import com.p051p1.mobile.putong.core.newui.messages.ConversationsList;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserStatus;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes11.dex */
public class r8n {

    /* JADX INFO: renamed from: p */
    public static volatile r8n f161726p;

    /* JADX INFO: renamed from: c */
    public kcg0 f161729c;

    /* JADX INFO: renamed from: d */
    public List<InsertConversationUser> f161730d;

    /* JADX INFO: renamed from: g */
    public jxd0 f161733g;

    /* JADX INFO: renamed from: h */
    public xyd0 f161734h;

    /* JADX INFO: renamed from: i */
    public wyd0 f161735i;

    /* JADX INFO: renamed from: j */
    public jxd0 f161736j;

    /* JADX INFO: renamed from: k */
    public wyd0 f161737k;

    /* JADX INFO: renamed from: l */
    public byd0 f161738l;

    /* JADX INFO: renamed from: m */
    public xyd0 f161739m;

    /* JADX INFO: renamed from: n */
    public List<String> f161740n;

    /* JADX INFO: renamed from: o */
    public String f161741o;

    /* JADX INFO: renamed from: a */
    public dji<InsertConversationsList> f161727a = new dji<>(new vod("intl_chat_request_insert_users", "_1", CoreModule.m30929H().userId()), -1, InsertConversationsList.PROTOBUF_ADAPTER);

    /* JADX INFO: renamed from: b */
    public C22507a<InsertConversationsList> f161728b = C22507a.m222758b();

    /* JADX INFO: renamed from: e */
    public byd0 f161731e = new byd0("last_time_insert_chat_request" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: f */
    public wyd0 f161732f = new wyd0("current_click_chat_request_user_id" + CoreModule.m30929H().userId(), "");

    public r8n() {
        String str = "intl_has_chat_request_request" + CoreModule.m30929H().userId();
        Boolean bool = Boolean.FALSE;
        this.f161733g = new jxd0(str, bool);
        this.f161734h = new xyd0("ignore_chat_request_user_set", new HashSet());
        this.f161735i = new wyd0("current_ignore_chat_request_user_id" + CoreModule.m30929H().userId(), "");
        this.f161736j = new jxd0("intl_chat_request_chat_list_mv" + CoreModule.m30929H().userId(), bool);
        this.f161737k = new wyd0("intl_chat_request_match_user" + CoreModule.m30929H().userId(), "");
        this.f161738l = new byd0("last_chat_request_on_top_time_" + CoreModule.m30929H().userId(), 0L);
        this.f161739m = new xyd0("chat_request_match_set_" + CoreModule.m30929H().userId(), new HashSet());
        this.f161740n = new ArrayList();
        this.f161741o = "";
    }

    /* JADX INFO: renamed from: f */
    public static r8n m180219f() {
        if (f161726p == null) {
            synchronized (r8n.class) {
                try {
                    if (f161726p == null) {
                        f161726p = new r8n();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f161726p;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m180220i(double d) {
        Calendar calendar = Calendar.getInstance();
        long j = (long) d;
        calendar.setTimeInMillis(j);
        return calendar.get(1) <= 1970 || (uqb0.f180376H.guessedCurrentServerTime() - j) / 1000 < 300;
    }

    /* JADX INFO: renamed from: b */
    public final String m180221b() {
        if (!NullChecker.m82486a(CoreModule.f18264c.f20405m0.f20085H2.m222761e())) {
            return "";
        }
        List<String> list = CoreModule.f18264c.f20405m0.f20085H2.m222761e().f184001a;
        if (!jyb.m147479J(list) && list.size() >= 2) {
            HashSet hashSet = new HashSet();
            if (this.f161728b.m222761e() != null && !jyb.m147479J(this.f161728b.m222761e().users)) {
                Iterator<InsertConversationUser> it = this.f161728b.m222761e().users.iterator();
                while (it.hasNext()) {
                    hashSet.add(it.next().userId);
                }
            }
            SpecialCard specialCardM217947G = CoreModule.f18265d.m217947G();
            for (int i = (specialCardM217947G != null && C4880a0.m32390j().m32401p(specialCardM217947G.device_OS) && C4880a0.m32390j().m32400o(specialCardM217947G.signup_country) && C4880a0.m32390j().m32402q(specialCardM217947G.gender, CoreModule.f18264c.f20381e0.m116600p9())) ? 1 : 0; i < list.size(); i++) {
                User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(list.get(i));
                if (!hashSet.contains(list.get(i)) && (userM116503Pa == null || !User.isMatched(userM116503Pa))) {
                    return list.get(i);
                }
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: c */
    public boolean m180222c(String str) {
        if (this.f161728b.m222761e() != null && !this.f161728b.m222761e().users.isEmpty()) {
            Iterator<InsertConversationUser> it = this.f161728b.m222761e().users.iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().userId)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final List<InsertConversationUser> m180223d(List<InsertConversationUser> list) {
        if (!NullChecker.m82486a(CoreModule.f18264c.f20405m0.f20085H2.m222761e()) || !NullChecker.m82486a(CoreModule.f18264c.f20405m0.f20085H2.m222761e().f184001a)) {
            return list;
        }
        HashSet hashSet = new HashSet();
        hashSet.addAll(CoreModule.f18264c.f20405m0.f20085H2.m222761e().f184001a);
        ArrayList arrayList = new ArrayList();
        for (InsertConversationUser insertConversationUser : list) {
            if (hashSet.contains(insertConversationUser.userId) && (CoreModule.f18264c.f20384f0.m33859Xe(insertConversationUser.userId) == null || TextUtils.equals(CoreModule.f18264c.f20384f0.m33859Xe(insertConversationUser.userId).convType, ConversationType.intlSeeChatRequest))) {
                arrayList.add(insertConversationUser);
            } else if (CoreModule.f18264c.f20384f0.m33859Xe(insertConversationUser.userId) != null && !TextUtils.equals(CoreModule.f18264c.f20384f0.m33859Xe(insertConversationUser.userId).convType, ConversationType.intlSeeChatRequest)) {
                m180235r(insertConversationUser.userId, true);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public List<InsertConversationUser> m180224e(int i) {
        this.f161730d = new ArrayList();
        if (this.f161728b.m222761e() != null && !jyb.m147479J(this.f161728b.m222761e().users)) {
            this.f161730d.addAll(m180223d(this.f161728b.m222761e().users));
        }
        if (!rbb0.m180744q()) {
            return this.f161730d;
        }
        int i2 = 3;
        if (i <= 3) {
            i2 = 1;
        } else if (i <= 7) {
            i2 = 2;
        }
        if (i2 > this.f161730d.size() && m180228k()) {
            String strM180221b = m180221b();
            if (!strM180221b.isEmpty()) {
                CoreModule.f18264c.f20405m0.m32130m8();
                InsertConversationUser insertConversationUserNew_ = InsertConversationUser.new_();
                insertConversationUserNew_.userId = strM180221b;
                insertConversationUserNew_.timeStamp = Long.valueOf(pzi0.m174454o());
                insertConversationUserNew_.clicked = Boolean.FALSE;
                this.f161730d.add(0, insertConversationUserNew_);
                InsertConversationsList insertConversationsListNew_ = InsertConversationsList.new_();
                insertConversationsListNew_.users.addAll(this.f161730d);
                this.f161728b.m137019l(insertConversationsListNew_);
                this.f161731e.put(Long.valueOf(pzi0.m174454o()));
                m180234q(strM180221b);
            }
        }
        return this.f161730d;
    }

    /* JADX INFO: renamed from: g */
    public void m180225g(List<Conversation> list) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (!NullChecker.m82486a(userM116600p9) || userM116600p9.isFemale()) {
            return;
        }
        if (userM116600p9.isBanned() && (!NullChecker.m82486a(userM116600p9) || !NullChecker.m82486a(userM116600p9.status) || !userM116600p9.status.contains(UserStatus.get("hidden")))) {
            this.f161727a.m116099c();
            this.f161728b.m137019l(InsertConversationsList.new_());
        } else if (m180226h()) {
            if (NullChecker.m82486a(CoreModule.f18264c.f20405m0.f20085H2.m222761e()) && NullChecker.m82486a(CoreModule.f18264c.f20405m0.f20085H2.m222761e().f184001a) && CoreModule.f18264c.f20405m0.f20085H2.m222761e().f184001a.size() + this.f161734h.get().size() < 3) {
                return;
            }
            CoreModule.f18264c.f20384f0.m33790Rg(m180230m(list, m180224e(list.size())));
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m180226h() {
        return ((int) ((pzi0.m174453n() - tzi0.m193665c((long) CoreModule.f18264c.f20381e0.m116600p9().createdTime)) / 86400000)) >= 1;
    }

    /* JADX INFO: renamed from: j */
    public boolean m180227j(int i) {
        if (i <= 0) {
            return false;
        }
        if (IntlCountryCodeController.m29109f()) {
            return ((double) i) * 6.214E-4d < 10.0d;
        }
        return i < 10000;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m180228k() {
        return pzi0.m174454o() - this.f161731e.get().longValue() >= 86400000;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m180229l(boolean z, String str, boolean z2) {
        InsertConversationsList insertConversationsListNew_ = InsertConversationsList.new_();
        List<InsertConversationUser> arrayList = new ArrayList();
        if (NullChecker.m82486a(this.f161728b.m222761e()) && !jyb.m147479J(this.f161728b.m222761e().users)) {
            arrayList = this.f161728b.m222761e().users;
        }
        ArrayList arrayList2 = new ArrayList();
        InsertConversationUser insertConversationUserNew_ = InsertConversationUser.new_();
        boolean z3 = false;
        for (InsertConversationUser insertConversationUser : arrayList) {
            if (z && str.equals(insertConversationUser.userId)) {
                this.f161733g.put(Boolean.TRUE);
            } else if (str.equals(insertConversationUser.userId)) {
                insertConversationUser.timeStamp = Long.valueOf(pzi0.m174454o());
                insertConversationUser.clicked = Boolean.valueOf(z2);
                insertConversationUserNew_.userId = insertConversationUser.userId;
                this.f161733g.put(Boolean.TRUE);
                z3 = true;
            } else {
                arrayList2.add(insertConversationUser);
            }
        }
        if (z3) {
            insertConversationUserNew_.timeStamp = Long.valueOf(pzi0.m174454o());
            insertConversationUserNew_.clicked = Boolean.valueOf(z2);
            arrayList2.add(0, insertConversationUserNew_);
        }
        if (!z3 && !z) {
            InsertConversationUser insertConversationUserNew_2 = InsertConversationUser.new_();
            insertConversationUserNew_2.userId = str;
            insertConversationUserNew_2.timeStamp = Long.valueOf(pzi0.m174454o());
            arrayList2.add(insertConversationUserNew_2);
        }
        if (z) {
            CoreModule.f18264c.f20384f0.m34209zf(str);
        }
        insertConversationsListNew_.users.addAll(arrayList2);
        this.f161727a.m116099c();
        this.f161727a.m116110p(insertConversationsListNew_);
        this.f161728b.m137019l(insertConversationsListNew_);
        CoreModule.f18264c.f20384f0.m33790Rg(arrayList2);
    }

    /* JADX INFO: renamed from: m */
    public synchronized List<InsertConversationUser> m180230m(List<Conversation> list, List<InsertConversationUser> list2) {
        if (!jyb.m147479J(list2) && !jyb.m147479J(list) && !TextUtils.equals(this.f161741o, CoreModule.f18264c.f20381e0.m116600p9().publicId)) {
            this.f161741o = CoreModule.f18264c.f20381e0.m116600p9().publicId;
            InsertConversationUser insertConversationUser = list2.get(0);
            if (insertConversationUser.timeStamp.longValue() < list.get(0).updatedTime) {
                insertConversationUser.timeStamp = Long.valueOf(pzi0.m174454o());
                InsertConversationsList insertConversationsListNew_ = InsertConversationsList.new_();
                insertConversationsListNew_.users.addAll(list2);
                this.f161728b.m137019l(insertConversationsListNew_);
                m180236s(insertConversationUser.userId, false, insertConversationUser.clicked.booleanValue());
            }
        }
        return list2;
    }

    /* JADX INFO: renamed from: n */
    public void m180231n(User user) {
        if (this.f161728b.m222761e() == null || this.f161728b.m222761e().users.isEmpty()) {
            return;
        }
        m180219f().f161733g.put(Boolean.TRUE);
        CoreModule.f18264c.f20384f0.m33653Fo();
        ConversationsList.m42339A2();
        m180235r(user.f56859id, true);
    }

    /* JADX INFO: renamed from: o */
    public void m180232o() {
        this.f161737k.put("");
        if (NullChecker.m82486a(this.f161729c)) {
            this.f161729c.unsubscribe();
            this.f161729c = null;
        }
        f161726p = null;
    }

    /* JADX INFO: renamed from: p */
    public void m180233p(String str) {
        HashSet<String> hashSet = this.f161739m.get();
        hashSet.add(str);
        this.f161739m.put(hashSet);
    }

    /* JADX INFO: renamed from: q */
    public void m180234q(String str) {
        m180235r(str, false);
    }

    /* JADX INFO: renamed from: r */
    public void m180235r(String str, boolean z) {
        m180236s(str, z, false);
    }

    /* JADX INFO: renamed from: s */
    public void m180236s(final String str, final boolean z, final boolean z2) {
        l51.m152919y(new Runnable() { // from class: l.q8n
            @Override // java.lang.Runnable
            public final void run() {
                this.f156145a.m180229l(z, str, z2);
            }
        });
    }
}
