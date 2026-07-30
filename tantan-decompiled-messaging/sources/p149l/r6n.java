package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4729a0;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ConversationType;
import com.p046p1.mobile.putong.core.data.InsertConversationUser;
import com.p046p1.mobile.putong.core.data.InsertConversationsList;
import com.p046p1.mobile.putong.core.data.SpecialCard;
import com.p046p1.mobile.putong.core.newui.messages.ConversationsList;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserStatus;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes11.dex */
public class r6n {

    /* JADX INFO: renamed from: p */
    public static volatile r6n f157952p;

    /* JADX INFO: renamed from: c */
    public c4g0 f157955c;

    /* JADX INFO: renamed from: d */
    public List<InsertConversationUser> f157956d;

    /* JADX INFO: renamed from: g */
    public hpd0 f157959g;

    /* JADX INFO: renamed from: h */
    public vqd0 f157960h;

    /* JADX INFO: renamed from: i */
    public uqd0 f157961i;

    /* JADX INFO: renamed from: j */
    public hpd0 f157962j;

    /* JADX INFO: renamed from: k */
    public uqd0 f157963k;

    /* JADX INFO: renamed from: l */
    public zpd0 f157964l;

    /* JADX INFO: renamed from: m */
    public vqd0 f157965m;

    /* JADX INFO: renamed from: n */
    public List<String> f157966n;

    /* JADX INFO: renamed from: o */
    public String f157967o;

    /* JADX INFO: renamed from: a */
    public ggi<InsertConversationsList> f157953a = new ggi<>(new qnd("intl_chat_request_insert_users", "_1", CoreModule.m29931H().userId()), -1, InsertConversationsList.PROTOBUF_ADAPTER);

    /* JADX INFO: renamed from: b */
    public C22392a<InsertConversationsList> f157954b = C22392a.m221512b();

    /* JADX INFO: renamed from: e */
    public zpd0 f157957e = new zpd0("last_time_insert_chat_request" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: f */
    public uqd0 f157958f = new uqd0("current_click_chat_request_user_id" + CoreModule.m29931H().userId(), "");

    public r6n() {
        String str = "intl_has_chat_request_request" + CoreModule.m29931H().userId();
        Boolean bool = Boolean.FALSE;
        this.f157959g = new hpd0(str, bool);
        this.f157960h = new vqd0("ignore_chat_request_user_set", new HashSet());
        this.f157961i = new uqd0("current_ignore_chat_request_user_id" + CoreModule.m29931H().userId(), "");
        this.f157962j = new hpd0("intl_chat_request_chat_list_mv" + CoreModule.m29931H().userId(), bool);
        this.f157963k = new uqd0("intl_chat_request_match_user" + CoreModule.m29931H().userId(), "");
        this.f157964l = new zpd0("last_chat_request_on_top_time_" + CoreModule.m29931H().userId(), 0L);
        this.f157965m = new vqd0("chat_request_match_set_" + CoreModule.m29931H().userId(), new HashSet());
        this.f157966n = new ArrayList();
        this.f157967o = "";
    }

    /* JADX INFO: renamed from: f */
    public static r6n m178067f() {
        if (f157952p == null) {
            synchronized (r6n.class) {
                try {
                    if (f157952p == null) {
                        f157952p = new r6n();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f157952p;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m178068i(double d) {
        Calendar calendar = Calendar.getInstance();
        long j = (long) d;
        calendar.setTimeInMillis(j);
        return calendar.get(1) <= 1970 || (qib0.f154693H.guessedCurrentServerTime() - j) / 1000 < 300;
    }

    /* JADX INFO: renamed from: b */
    public final String m178069b() {
        if (!NullChecker.m81303a(CoreModule.f17545c.f19663m0.f19343H2.m221515e())) {
            return "";
        }
        List<String> list = CoreModule.f17545c.f19663m0.f19343H2.m221515e().f153135a;
        if (!vwb.m200296J(list) && list.size() >= 2) {
            HashSet hashSet = new HashSet();
            if (this.f157954b.m221515e() != null && !vwb.m200296J(this.f157954b.m221515e().users)) {
                Iterator<InsertConversationUser> it = this.f157954b.m221515e().users.iterator();
                while (it.hasNext()) {
                    hashSet.add(it.next().userId);
                }
            }
            SpecialCard specialCardM200501G = CoreModule.f17546d.m200501G();
            for (int i = (specialCardM200501G != null && C4729a0.m31387j().m31398p(specialCardM200501G.device_OS) && C4729a0.m31387j().m31397o(specialCardM200501G.signup_country) && C4729a0.m31387j().m31399q(specialCardM200501G.gender, CoreModule.f17545c.f19639e0.m169527p9())) ? 1 : 0; i < list.size(); i++) {
                User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(list.get(i));
                if (!hashSet.contains(list.get(i)) && (userM169430Pa == null || !User.isMatched(userM169430Pa))) {
                    return list.get(i);
                }
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: c */
    public boolean m178070c(String str) {
        if (this.f157954b.m221515e() != null && !this.f157954b.m221515e().users.isEmpty()) {
            Iterator<InsertConversationUser> it = this.f157954b.m221515e().users.iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().userId)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final List<InsertConversationUser> m178071d(List<InsertConversationUser> list) {
        if (!NullChecker.m81303a(CoreModule.f17545c.f19663m0.f19343H2.m221515e()) || !NullChecker.m81303a(CoreModule.f17545c.f19663m0.f19343H2.m221515e().f153135a)) {
            return list;
        }
        HashSet hashSet = new HashSet();
        hashSet.addAll(CoreModule.f17545c.f19663m0.f19343H2.m221515e().f153135a);
        ArrayList arrayList = new ArrayList();
        for (InsertConversationUser insertConversationUser : list) {
            if (hashSet.contains(insertConversationUser.userId) && (CoreModule.f17545c.f19642f0.m32856Xe(insertConversationUser.userId) == null || TextUtils.equals(CoreModule.f17545c.f19642f0.m32856Xe(insertConversationUser.userId).convType, ConversationType.intlSeeChatRequest))) {
                arrayList.add(insertConversationUser);
            } else if (CoreModule.f17545c.f19642f0.m32856Xe(insertConversationUser.userId) != null && !TextUtils.equals(CoreModule.f17545c.f19642f0.m32856Xe(insertConversationUser.userId).convType, ConversationType.intlSeeChatRequest)) {
                m178083r(insertConversationUser.userId, true);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public List<InsertConversationUser> m178072e(int i) {
        this.f157956d = new ArrayList();
        if (this.f157954b.m221515e() != null && !vwb.m200296J(this.f157954b.m221515e().users)) {
            this.f157956d.addAll(m178071d(this.f157954b.m221515e().users));
        }
        if (!n3b0.m157742q()) {
            return this.f157956d;
        }
        int i2 = 3;
        if (i <= 3) {
            i2 = 1;
        } else if (i <= 7) {
            i2 = 2;
        }
        if (i2 > this.f157956d.size() && m178076k()) {
            String strM178069b = m178069b();
            if (!strM178069b.isEmpty()) {
                CoreModule.f17545c.f19663m0.m31127m8();
                InsertConversationUser insertConversationUserNew_ = InsertConversationUser.new_();
                insertConversationUserNew_.userId = strM178069b;
                insertConversationUserNew_.timeStamp = Long.valueOf(mqi0.m155944o());
                insertConversationUserNew_.clicked = Boolean.FALSE;
                this.f157956d.add(0, insertConversationUserNew_);
                InsertConversationsList insertConversationsListNew_ = InsertConversationsList.new_();
                insertConversationsListNew_.users.addAll(this.f157956d);
                this.f157954b.m132487l(insertConversationsListNew_);
                this.f157957e.put(Long.valueOf(mqi0.m155944o()));
                m178082q(strM178069b);
            }
        }
        return this.f157956d;
    }

    /* JADX INFO: renamed from: g */
    public void m178073g(List<Conversation> list) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (!NullChecker.m81303a(userM169527p9) || userM169527p9.isFemale()) {
            return;
        }
        if (userM169527p9.isBanned() && (!NullChecker.m81303a(userM169527p9) || !NullChecker.m81303a(userM169527p9.status) || !userM169527p9.status.contains(UserStatus.get("hidden")))) {
            this.f157953a.m125967c();
            this.f157954b.m132487l(InsertConversationsList.new_());
        } else if (m178074h()) {
            if (NullChecker.m81303a(CoreModule.f17545c.f19663m0.f19343H2.m221515e()) && NullChecker.m81303a(CoreModule.f17545c.f19663m0.f19343H2.m221515e().f153135a) && CoreModule.f17545c.f19663m0.f19343H2.m221515e().f153135a.size() + this.f157960h.get().size() < 3) {
                return;
            }
            CoreModule.f17545c.f19642f0.m32787Rg(m178078m(list, m178072e(list.size())));
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m178074h() {
        return ((int) ((mqi0.m155943n() - qqi0.m175935c((long) CoreModule.f17545c.f19639e0.m169527p9().createdTime)) / 86400000)) >= 1;
    }

    /* JADX INFO: renamed from: j */
    public boolean m178075j(int i) {
        if (i <= 0) {
            return false;
        }
        if (IntlCountryCodeController.m28110f()) {
            return ((double) i) * 6.214E-4d < 10.0d;
        }
        return i < 10000;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m178076k() {
        return mqi0.m155944o() - this.f157957e.get().longValue() >= 86400000;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m178077l(boolean z, String str, boolean z2) {
        InsertConversationsList insertConversationsListNew_ = InsertConversationsList.new_();
        List<InsertConversationUser> arrayList = new ArrayList();
        if (NullChecker.m81303a(this.f157954b.m221515e()) && !vwb.m200296J(this.f157954b.m221515e().users)) {
            arrayList = this.f157954b.m221515e().users;
        }
        ArrayList arrayList2 = new ArrayList();
        InsertConversationUser insertConversationUserNew_ = InsertConversationUser.new_();
        boolean z3 = false;
        for (InsertConversationUser insertConversationUser : arrayList) {
            if (z && str.equals(insertConversationUser.userId)) {
                this.f157959g.put(Boolean.TRUE);
            } else if (str.equals(insertConversationUser.userId)) {
                insertConversationUser.timeStamp = Long.valueOf(mqi0.m155944o());
                insertConversationUser.clicked = Boolean.valueOf(z2);
                insertConversationUserNew_.userId = insertConversationUser.userId;
                this.f157959g.put(Boolean.TRUE);
                z3 = true;
            } else {
                arrayList2.add(insertConversationUser);
            }
        }
        if (z3) {
            insertConversationUserNew_.timeStamp = Long.valueOf(mqi0.m155944o());
            insertConversationUserNew_.clicked = Boolean.valueOf(z2);
            arrayList2.add(0, insertConversationUserNew_);
        }
        if (!z3 && !z) {
            InsertConversationUser insertConversationUserNew_2 = InsertConversationUser.new_();
            insertConversationUserNew_2.userId = str;
            insertConversationUserNew_2.timeStamp = Long.valueOf(mqi0.m155944o());
            arrayList2.add(insertConversationUserNew_2);
        }
        if (z) {
            CoreModule.f17545c.f19642f0.m33206zf(str);
        }
        insertConversationsListNew_.users.addAll(arrayList2);
        this.f157953a.m125967c();
        this.f157953a.m125978p(insertConversationsListNew_);
        this.f157954b.m132487l(insertConversationsListNew_);
        CoreModule.f17545c.f19642f0.m32787Rg(arrayList2);
    }

    /* JADX INFO: renamed from: m */
    public synchronized List<InsertConversationUser> m178078m(List<Conversation> list, List<InsertConversationUser> list2) {
        if (!vwb.m200296J(list2) && !vwb.m200296J(list) && !TextUtils.equals(this.f157967o, CoreModule.f17545c.f19639e0.m169527p9().publicId)) {
            this.f157967o = CoreModule.f17545c.f19639e0.m169527p9().publicId;
            InsertConversationUser insertConversationUser = list2.get(0);
            if (insertConversationUser.timeStamp.longValue() < list.get(0).updatedTime) {
                insertConversationUser.timeStamp = Long.valueOf(mqi0.m155944o());
                InsertConversationsList insertConversationsListNew_ = InsertConversationsList.new_();
                insertConversationsListNew_.users.addAll(list2);
                this.f157954b.m132487l(insertConversationsListNew_);
                m178084s(insertConversationUser.userId, false, insertConversationUser.clicked.booleanValue());
            }
        }
        return list2;
    }

    /* JADX INFO: renamed from: n */
    public void m178079n(User user) {
        if (this.f157954b.m221515e() == null || this.f157954b.m221515e().users.isEmpty()) {
            return;
        }
        m178067f().f157959g.put(Boolean.TRUE);
        CoreModule.f17545c.f19642f0.m32650Fo();
        ConversationsList.m41328A2();
        m178083r(user.f56011id, true);
    }

    /* JADX INFO: renamed from: o */
    public void m178080o() {
        this.f157963k.put("");
        if (NullChecker.m81303a(this.f157955c)) {
            this.f157955c.unsubscribe();
            this.f157955c = null;
        }
        f157952p = null;
    }

    /* JADX INFO: renamed from: p */
    public void m178081p(String str) {
        HashSet<String> hashSet = this.f157965m.get();
        hashSet.add(str);
        this.f157965m.put(hashSet);
    }

    /* JADX INFO: renamed from: q */
    public void m178082q(String str) {
        m178083r(str, false);
    }

    /* JADX INFO: renamed from: r */
    public void m178083r(String str, boolean z) {
        m178084s(str, z, false);
    }

    /* JADX INFO: renamed from: s */
    public void m178084s(final String str, final boolean z, final boolean z2) {
        e51.m114774y(new Runnable() { // from class: l.q6n
            @Override // java.lang.Runnable
            public final void run() {
                this.f152923a.m178077l(z, str, z2);
            }
        });
    }
}
