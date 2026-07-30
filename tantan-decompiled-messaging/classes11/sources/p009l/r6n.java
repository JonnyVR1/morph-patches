package p009l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.newui.messages.ConversationsList;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.a0;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.InsertConversationUser;
import com.p1.mobile.putong.core.data.InsertConversationsList;
import com.p1.mobile.putong.core.data.SpecialCard;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserStatus;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import l.c4g0;
import l.e51;
import l.ggi;
import l.hpd0;
import l.n3b0;
import l.qib0;
import l.qnd;
import l.qqi0;
import l.uqd0;
import l.vqd0;
import l.vwb;
import l.zpd0;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class r6n {

    /* JADX INFO: renamed from: p */
    public static volatile r6n f19654p;

    /* JADX INFO: renamed from: c */
    public c4g0 f19657c;

    /* JADX INFO: renamed from: d */
    public List<InsertConversationUser> f19658d;

    /* JADX INFO: renamed from: g */
    public hpd0 f19661g;

    /* JADX INFO: renamed from: h */
    public vqd0 f19662h;

    /* JADX INFO: renamed from: i */
    public uqd0 f19663i;

    /* JADX INFO: renamed from: j */
    public hpd0 f19664j;

    /* JADX INFO: renamed from: k */
    public uqd0 f19665k;

    /* JADX INFO: renamed from: l */
    public zpd0 f19666l;

    /* JADX INFO: renamed from: m */
    public vqd0 f19667m;

    /* JADX INFO: renamed from: n */
    public List<String> f19668n;

    /* JADX INFO: renamed from: o */
    public String f19669o;

    /* JADX INFO: renamed from: a */
    public ggi<InsertConversationsList> f19655a = new ggi<>(new qnd("intl_chat_request_insert_users", "_1", CoreModule.H().userId()), -1, InsertConversationsList.PROTOBUF_ADAPTER);

    /* JADX INFO: renamed from: b */
    public a<InsertConversationsList> f19656b = a.b();

    /* JADX INFO: renamed from: e */
    public zpd0 f19659e = new zpd0("last_time_insert_chat_request" + CoreModule.H().userId(), 0L);

    /* JADX INFO: renamed from: f */
    public uqd0 f19660f = new uqd0("current_click_chat_request_user_id" + CoreModule.H().userId(), "");

    public r6n() {
        String str = "intl_has_chat_request_request" + CoreModule.H().userId();
        Boolean bool = Boolean.FALSE;
        this.f19661g = new hpd0(str, bool);
        this.f19662h = new vqd0("ignore_chat_request_user_set", new HashSet());
        this.f19663i = new uqd0("current_ignore_chat_request_user_id" + CoreModule.H().userId(), "");
        this.f19664j = new hpd0("intl_chat_request_chat_list_mv" + CoreModule.H().userId(), bool);
        this.f19665k = new uqd0("intl_chat_request_match_user" + CoreModule.H().userId(), "");
        this.f19666l = new zpd0("last_chat_request_on_top_time_" + CoreModule.H().userId(), 0L);
        this.f19667m = new vqd0("chat_request_match_set_" + CoreModule.H().userId(), new HashSet());
        this.f19668n = new ArrayList();
        this.f19669o = "";
    }

    /* JADX INFO: renamed from: f */
    public static r6n m21419f() {
        if (f19654p == null) {
            synchronized (r6n.class) {
                try {
                    if (f19654p == null) {
                        f19654p = new r6n();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f19654p;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m21420i(double d) {
        Calendar calendar = Calendar.getInstance();
        long j = (long) d;
        calendar.setTimeInMillis(j);
        return calendar.get(1) <= 1970 || (qib0.H.guessedCurrentServerTime() - j) / 1000 < 300;
    }

    /* JADX INFO: renamed from: b */
    public final String m21421b() {
        if (!NullChecker.a(CoreModule.c.m0.H2.e())) {
            return "";
        }
        List<T> list = ((q860) CoreModule.c.m0.H2.e()).f19068a;
        if (!vwb.J(list) && list.size() >= 2) {
            HashSet hashSet = new HashSet();
            if (this.f19656b.e() != null && !vwb.J(((InsertConversationsList) this.f19656b.e()).users)) {
                Iterator it = ((InsertConversationsList) this.f19656b.e()).users.iterator();
                while (it.hasNext()) {
                    hashSet.add(((InsertConversationUser) it.next()).userId);
                }
            }
            SpecialCard specialCardG = CoreModule.d.G();
            for (int i = (specialCardG != null && a0.j().p(specialCardG.device_OS) && a0.j().o(specialCardG.signup_country) && a0.j().q(specialCardG.gender, CoreModule.c.e0.p9())) ? 1 : 0; i < list.size(); i++) {
                User userPa = CoreModule.c.e0.Pa((String) list.get(i));
                if (!hashSet.contains(list.get(i)) && (userPa == null || !User.isMatched(userPa))) {
                    return (String) list.get(i);
                }
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: c */
    public boolean m21422c(String str) {
        if (this.f19656b.e() != null && !((InsertConversationsList) this.f19656b.e()).users.isEmpty()) {
            Iterator it = ((InsertConversationsList) this.f19656b.e()).users.iterator();
            while (it.hasNext()) {
                if (str.equals(((InsertConversationUser) it.next()).userId)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final List<InsertConversationUser> m21423d(List<InsertConversationUser> list) {
        if (!NullChecker.a(CoreModule.c.m0.H2.e()) || !NullChecker.a(((q860) CoreModule.c.m0.H2.e()).f19068a)) {
            return list;
        }
        HashSet hashSet = new HashSet();
        hashSet.addAll(((q860) CoreModule.c.m0.H2.e()).f19068a);
        ArrayList arrayList = new ArrayList();
        for (InsertConversationUser insertConversationUser : list) {
            if (hashSet.contains(insertConversationUser.userId) && (CoreModule.c.f0.Xe(insertConversationUser.userId) == null || TextUtils.equals(CoreModule.c.f0.Xe(insertConversationUser.userId).convType, "intlSeeChatRequest"))) {
                arrayList.add(insertConversationUser);
            } else if (CoreModule.c.f0.Xe(insertConversationUser.userId) != null && !TextUtils.equals(CoreModule.c.f0.Xe(insertConversationUser.userId).convType, "intlSeeChatRequest")) {
                m21435r(insertConversationUser.userId, true);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public List<InsertConversationUser> m21424e(int i) {
        this.f19658d = new ArrayList();
        if (this.f19656b.e() != null && !vwb.J(((InsertConversationsList) this.f19656b.e()).users)) {
            this.f19658d.addAll(m21423d(((InsertConversationsList) this.f19656b.e()).users));
        }
        if (!n3b0.q()) {
            return this.f19658d;
        }
        int i2 = 3;
        if (i <= 3) {
            i2 = 1;
        } else if (i <= 7) {
            i2 = 2;
        }
        if (i2 > this.f19658d.size() && m21428k()) {
            String strM21421b = m21421b();
            if (!strM21421b.isEmpty()) {
                CoreModule.c.m0.m8();
                InsertConversationUser insertConversationUserNew_ = InsertConversationUser.new_();
                insertConversationUserNew_.userId = strM21421b;
                insertConversationUserNew_.timeStamp = Long.valueOf(mqi0.m18550o());
                insertConversationUserNew_.clicked = Boolean.FALSE;
                this.f19658d.add(0, insertConversationUserNew_);
                InsertConversationsList insertConversationsListNew_ = InsertConversationsList.new_();
                insertConversationsListNew_.users.addAll(this.f19658d);
                this.f19656b.onNext(insertConversationsListNew_);
                this.f19659e.put(Long.valueOf(mqi0.m18550o()));
                m21434q(strM21421b);
            }
        }
        return this.f19658d;
    }

    /* JADX INFO: renamed from: g */
    public void m21425g(List<Conversation> list) {
        User userP9 = CoreModule.c.e0.p9();
        if (!NullChecker.a(userP9) || userP9.isFemale()) {
            return;
        }
        if (userP9.isBanned() && (!NullChecker.a(userP9) || !NullChecker.a(userP9.status) || !userP9.status.contains(UserStatus.get("hidden")))) {
            this.f19655a.c();
            this.f19656b.onNext(InsertConversationsList.new_());
        } else if (m21426h()) {
            if (NullChecker.a(CoreModule.c.m0.H2.e()) && NullChecker.a(((q860) CoreModule.c.m0.H2.e()).f19068a) && ((q860) CoreModule.c.m0.H2.e()).f19068a.size() + ((HashSet) this.f19662h.get()).size() < 3) {
                return;
            }
            CoreModule.c.f0.Rg(m21430m(list, m21424e(list.size())));
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m21426h() {
        return ((int) ((mqi0.m18549n() - qqi0.c((long) CoreModule.c.e0.p9().createdTime)) / 86400000)) >= 1;
    }

    /* JADX INFO: renamed from: j */
    public boolean m21427j(int i) {
        if (i <= 0) {
            return false;
        }
        if (IntlCountryCodeController.f()) {
            return ((double) i) * 6.214E-4d < 10.0d;
        }
        return i < 10000;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m21428k() {
        return mqi0.m18550o() - ((Long) this.f19659e.get()).longValue() >= 86400000;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m21429l(boolean z, String str, boolean z2) {
        InsertConversationsList insertConversationsListNew_ = InsertConversationsList.new_();
        List<InsertConversationUser> arrayList = new ArrayList();
        if (NullChecker.a(this.f19656b.e()) && !vwb.J(((InsertConversationsList) this.f19656b.e()).users)) {
            arrayList = ((InsertConversationsList) this.f19656b.e()).users;
        }
        ArrayList arrayList2 = new ArrayList();
        InsertConversationUser insertConversationUserNew_ = InsertConversationUser.new_();
        boolean z3 = false;
        for (InsertConversationUser insertConversationUser : arrayList) {
            if (z && str.equals(insertConversationUser.userId)) {
                this.f19661g.put(Boolean.TRUE);
            } else if (str.equals(insertConversationUser.userId)) {
                insertConversationUser.timeStamp = Long.valueOf(mqi0.m18550o());
                insertConversationUser.clicked = Boolean.valueOf(z2);
                insertConversationUserNew_.userId = insertConversationUser.userId;
                this.f19661g.put(Boolean.TRUE);
                z3 = true;
            } else {
                arrayList2.add(insertConversationUser);
            }
        }
        if (z3) {
            insertConversationUserNew_.timeStamp = Long.valueOf(mqi0.m18550o());
            insertConversationUserNew_.clicked = Boolean.valueOf(z2);
            arrayList2.add(0, insertConversationUserNew_);
        }
        if (!z3 && !z) {
            InsertConversationUser insertConversationUserNew_2 = InsertConversationUser.new_();
            insertConversationUserNew_2.userId = str;
            insertConversationUserNew_2.timeStamp = Long.valueOf(mqi0.m18550o());
            arrayList2.add(insertConversationUserNew_2);
        }
        if (z) {
            CoreModule.c.f0.zf(str);
        }
        insertConversationsListNew_.users.addAll(arrayList2);
        this.f19655a.c();
        this.f19655a.p(insertConversationsListNew_);
        this.f19656b.onNext(insertConversationsListNew_);
        CoreModule.c.f0.Rg(arrayList2);
    }

    /* JADX INFO: renamed from: m */
    public synchronized List<InsertConversationUser> m21430m(List<Conversation> list, List<InsertConversationUser> list2) {
        if (!vwb.J(list2) && !vwb.J(list) && !TextUtils.equals(this.f19669o, CoreModule.c.e0.p9().publicId)) {
            this.f19669o = CoreModule.c.e0.p9().publicId;
            InsertConversationUser insertConversationUser = list2.get(0);
            if (insertConversationUser.timeStamp.longValue() < list.get(0).updatedTime) {
                insertConversationUser.timeStamp = Long.valueOf(mqi0.m18550o());
                InsertConversationsList insertConversationsListNew_ = InsertConversationsList.new_();
                insertConversationsListNew_.users.addAll(list2);
                this.f19656b.onNext(insertConversationsListNew_);
                m21436s(insertConversationUser.userId, false, insertConversationUser.clicked.booleanValue());
            }
        }
        return list2;
    }

    /* JADX INFO: renamed from: n */
    public void m21431n(User user) {
        if (this.f19656b.e() == null || ((InsertConversationsList) this.f19656b.e()).users.isEmpty()) {
            return;
        }
        m21419f().f19661g.put(Boolean.TRUE);
        CoreModule.c.f0.Fo();
        ConversationsList.m5434A2();
        m21435r(((DbObject) user).id, true);
    }

    /* JADX INFO: renamed from: o */
    public void m21432o() {
        this.f19665k.put("");
        if (NullChecker.a(this.f19657c)) {
            this.f19657c.unsubscribe();
            this.f19657c = null;
        }
        f19654p = null;
    }

    /* JADX INFO: renamed from: p */
    public void m21433p(String str) {
        HashSet hashSet = (HashSet) this.f19667m.get();
        hashSet.add(str);
        this.f19667m.put(hashSet);
    }

    /* JADX INFO: renamed from: q */
    public void m21434q(String str) {
        m21435r(str, false);
    }

    /* JADX INFO: renamed from: r */
    public void m21435r(String str, boolean z) {
        m21436s(str, z, false);
    }

    /* JADX INFO: renamed from: s */
    public void m21436s(final String str, final boolean z, final boolean z2) {
        e51.y(new Runnable() { // from class: l.q6n
            @Override // java.lang.Runnable
            public final void run() {
                this.f19048a.m21429l(z, str, z2);
            }
        });
    }
}
