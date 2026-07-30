package p153l;

import androidx.annotation.AnyThread;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.clevertap.android.sdk.inbox.InboxDeleteCoordinator;
import com.clevertap.android.sdk.inbox.InboxMessageSource;
import com.clevertap.android.sdk.response.InboxV2DeliverySource;
import com.clevertap.android.sdk.task.Task;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ew3 {

    /* JADX INFO: renamed from: a */
    private final h1c f96071a;

    /* JADX INFO: renamed from: b */
    private ArrayList<ow3> f96072b;

    /* JADX INFO: renamed from: c */
    private final Object f96073c;

    /* JADX INFO: renamed from: d */
    private final String f96074d;

    /* JADX INFO: renamed from: e */
    private final boolean f96075e;

    /* JADX INFO: renamed from: f */
    private final nw3 f96076f;

    /* JADX INFO: renamed from: g */
    private final ch2 f96077g;

    /* JADX INFO: renamed from: h */
    private final CleverTapInstanceConfig f96078h;

    /* JADX INFO: renamed from: i */
    private final InboxDeleteCoordinator f96079i;

    /* JADX INFO: renamed from: j */
    private final oa5 f96080j;

    /* JADX INFO: renamed from: l.ew3$a */
    public class CallableC16846a implements Callable<Void> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CTInboxMessage f96081a;

        public CallableC16846a(CTInboxMessage cTInboxMessage) {
            this.f96081a = cTInboxMessage;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (ew3.this.f96076f.m164938b()) {
                try {
                    if (ew3.this.m122873d(this.f96081a.m6737e())) {
                        ew3.this.f96077g.mo96508b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: l.ew3$b */
    public class CallableC16847b implements Callable<Void> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f96083a;

        public CallableC16847b(String str) {
            this.f96083a = str;
        }

        @Override // java.util.concurrent.Callable
        @WorkerThread
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            ew3.this.f96071a.m133307l(this.f96083a, ew3.this.f96074d);
            return null;
        }
    }

    /* JADX INFO: renamed from: l.ew3$c */
    public class CallableC16848c implements Callable<Void> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f96085a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f96086b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ long f96087c;

        public CallableC16848c(String str, boolean z, long j) {
            this.f96085a = str;
            this.f96086b = z;
            this.f96087c = j;
        }

        @Override // java.util.concurrent.Callable
        @WorkerThread
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            ew3.this.f96071a.m133289H(this.f96085a, ew3.this.f96074d);
            if (!this.f96086b) {
                return null;
            }
            ew3.this.f96071a.m133302g(this.f96085a, ew3.this.f96074d, this.f96087c);
            return null;
        }
    }

    @VisibleForTesting
    public ew3(CleverTapInstanceConfig cleverTapInstanceConfig, String str, h1c h1cVar, nw3 nw3Var, ch2 ch2Var, boolean z, InboxDeleteCoordinator inboxDeleteCoordinator, oa5 oa5Var) {
        this.f96073c = new Object();
        this.f96074d = str;
        this.f96071a = h1cVar;
        this.f96072b = h1cVar.m133317y(str);
        this.f96075e = z;
        this.f96076f = nw3Var;
        this.f96077g = ch2Var;
        this.f96078h = cleverTapInstanceConfig;
        this.f96079i = inboxDeleteCoordinator;
        this.f96080j = oa5Var;
    }

    @AnyThread
    /* JADX INFO: renamed from: j */
    private ow3 m122869j(String str) {
        synchronized (this.f96073c) {
            try {
                for (ow3 ow3Var : this.f96072b) {
                    if (ow3Var.m169496e().equals(str)) {
                        return ow3Var;
                    }
                }
                Logger.m5927v("Inbox Message for message id - " + str + " not found");
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    private static long m122870q(ow3 ow3Var, long j) {
        long jM169495d = ow3Var == null ? 0L : ow3Var.m169495d();
        if (jM169495d == 0) {
            return 0L;
        }
        return jM169495d > 0 ? jM169495d : j + 86400;
    }

    @AnyThread
    /* JADX INFO: renamed from: r */
    private void m122871r() {
        Logger.m5927v("CTInboxController:trimMessages() called");
        ArrayList arrayList = new ArrayList();
        synchronized (this.f96073c) {
            try {
                for (ow3 ow3Var : this.f96072b) {
                    if (this.f96075e || !ow3Var.m169492a()) {
                        long jM169495d = ow3Var.m169495d();
                        if (jM169495d > 0 && this.f96080j.mo166827c() > jM169495d) {
                            Logger.m5927v("Inbox Message: " + ow3Var.m169496e() + " is expired - removing");
                            arrayList.add(ow3Var);
                        }
                    } else {
                        Logger.m5919d("Removing inbox message containing video/audio as app does not support video. For more information checkout CleverTap documentation.");
                        arrayList.add(ow3Var);
                    }
                }
                if (arrayList.size() <= 0) {
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m122872c(((ow3) it.next()).m169496e());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @AnyThread
    /* JADX INFO: renamed from: c */
    public boolean m122872c(String str) {
        ow3 ow3VarM122869j = m122869j(str);
        if (ow3VarM122869j == null) {
            return false;
        }
        synchronized (this.f96073c) {
            this.f96072b.remove(ow3VarM122869j);
        }
        ru3.m183186c(this.f96078h).m187990d().m7000g("RunDeleteMessage", new CallableC16847b(str));
        return true;
    }

    @AnyThread
    /* JADX INFO: renamed from: d */
    public boolean m122873d(final String str) {
        ow3 ow3VarM122869j = m122869j(str);
        if (ow3VarM122869j == null) {
            return false;
        }
        boolean z = ow3VarM122869j.m169499h() == InboxMessageSource.V2;
        long jM122870q = z ? m122870q(ow3VarM122869j, this.f96080j.mo166827c()) : 0L;
        synchronized (this.f96073c) {
            ow3VarM122869j.m169510u(1);
        }
        Task taskM187990d = ru3.m183186c(this.f96078h).m187990d();
        taskM187990d.m6999f(new vo50() { // from class: l.cw3
            @Override // p153l.vo50
            public final void onSuccess(Object obj) {
                this.f84090a.f96077g.mo96508b();
            }
        });
        taskM187990d.m6997d(new hm50() { // from class: l.dw3
            @Override // p153l.hm50
            /* JADX INFO: renamed from: a */
            public final void mo118349a(Object obj) {
                Logger.m5922d("Failed to update message read state for id:" + str, (Exception) obj);
            }
        });
        taskM187990d.m7000g("RunMarkMessageRead", new CallableC16848c(str, z, jM122870q));
        return true;
    }

    /* JADX INFO: renamed from: i */
    public int m122874i() {
        return m122876l().size();
    }

    @AnyThread
    /* JADX INFO: renamed from: k */
    public ow3 m122875k(String str) {
        return m122869j(str);
    }

    @AnyThread
    /* JADX INFO: renamed from: l */
    public ArrayList<ow3> m122876l() {
        ArrayList<ow3> arrayList;
        synchronized (this.f96073c) {
            m122871r();
            arrayList = this.f96072b;
        }
        return arrayList;
    }

    @AnyThread
    /* JADX INFO: renamed from: m */
    public String m122877m() {
        return this.f96074d;
    }

    @AnyThread
    /* JADX INFO: renamed from: n */
    public boolean m122878n(String str) {
        if (str == null) {
            return false;
        }
        synchronized (this.f96073c) {
            try {
                for (ow3 ow3Var : this.f96072b) {
                    if (str.equals(ow3Var.m169496e())) {
                        return ow3Var.m169499h() == InboxMessageSource.V2;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @AnyThread
    /* JADX INFO: renamed from: o */
    public void m122879o(CTInboxMessage cTInboxMessage) {
        ru3.m183186c(this.f96078h).m187990d().m7000g("markReadInboxMessage", new CallableC16846a(cTInboxMessage));
    }

    @WorkerThread
    /* JADX INFO: renamed from: p */
    public boolean m122880p(List<ow3> list, InboxV2DeliverySource inboxV2DeliverySource) {
        boolean z;
        long jMo166827c = this.f96080j.mo166827c();
        boolean z2 = true;
        if (inboxV2DeliverySource == InboxV2DeliverySource.FETCH) {
            HashSet hashSet = new HashSet(list.size());
            Iterator<ow3> it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().m169496e());
            }
            if (!hashSet.isEmpty()) {
                this.f96078h.getLogger().verbose(this.f96078h.getAccountId(), "InboxV2: markIndexed " + hashSet.size() + " msg(s)");
                this.f96071a.m133287F(new ArrayList(hashSet), this.f96074d);
            }
            Set<String> setM133315t = this.f96071a.m133315t(this.f96074d, jMo166827c - 21600);
            setM133315t.removeAll(hashSet);
            boolean zIsEmpty = setM133315t.isEmpty();
            CleverTapInstanceConfig cleverTapInstanceConfig = this.f96078h;
            if (zIsEmpty) {
                cleverTapInstanceConfig.getLogger().verbose(this.f96078h.getAccountId(), "InboxV2: cross-device sweep — nothing to remove");
                z = false;
            } else {
                cleverTapInstanceConfig.getLogger().verbose(this.f96078h.getAccountId(), "InboxV2: cross-device sweep — removing " + setM133315t.size() + " msg(s): " + setM133315t);
                this.f96071a.m133308m(new ArrayList(setM133315t), this.f96074d);
                z = true;
            }
        } else {
            z = false;
        }
        int iM133292K = this.f96071a.m133292K(this.f96074d, jMo166827c);
        if (iM133292K > 0) {
            this.f96078h.getLogger().verbose(this.f96078h.getAccountId(), "InboxV2: removed " + iM133292K + " expired AWAITING_CONFIRM row(s)");
        }
        int iM133293L = this.f96071a.m133293L(this.f96074d, jMo166827c);
        if (iM133293L > 0) {
            this.f96078h.getLogger().verbose(this.f96078h.getAccountId(), "InboxV2: removed " + iM133293L + " expired pending-read row(s)");
        }
        Set<String> setM133318z = this.f96071a.m133318z(this.f96074d);
        Set<String> setM133286B = this.f96071a.m133286B(this.f96074d);
        if (!setM133286B.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (ow3 ow3Var : list) {
                if (ow3Var.m169503n() == 1 && setM133286B.contains(ow3Var.m169496e())) {
                    arrayList.add(ow3Var.m169496e());
                }
            }
            if (!arrayList.isEmpty()) {
                this.f96071a.m133294M(arrayList, this.f96074d);
            }
        }
        List<ow3> listM122475c = etm.INSTANCE.m122475c(list, setM133318z, setM133286B, this.f96075e, jMo166827c);
        if (!listM122475c.isEmpty()) {
            if (inboxV2DeliverySource == InboxV2DeliverySource.FETCH) {
                Iterator<ow3> it2 = listM122475c.iterator();
                while (it2.hasNext()) {
                    it2.next().m169508s("INDEXED");
                }
            }
            this.f96071a.m133300S(listM122475c);
        }
        boolean z3 = z || !listM122475c.isEmpty();
        synchronized (this.f96073c) {
            try {
                p85 p85VarM122474b = etm.INSTANCE.m122474b(this.f96071a.m133317y(this.f96074d), setM133318z, setM133286B, this.f96075e, jMo166827c);
                if (p85VarM122474b.m171182b().isEmpty()) {
                    z2 = z3;
                } else {
                    this.f96071a.m133308m(p85VarM122474b.m171182b(), this.f96074d);
                }
                this.f96072b = new ArrayList<>(p85VarM122474b.m171181a());
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    @WorkerThread
    /* JADX INFO: renamed from: s */
    public boolean m122881s(JSONArray jSONArray) {
        Logger.m5927v("CTInboxController:updateMessages() called");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                ow3 ow3VarM169491m = ow3.m169491m(jSONArray.getJSONObject(i), this.f96074d, InboxMessageSource.V1);
                if (ow3VarM169491m != null) {
                    if (this.f96075e || !ow3VarM169491m.m169492a()) {
                        arrayList.add(ow3VarM169491m);
                        Logger.m5927v("Inbox Message for message id - " + ow3VarM169491m.m169496e() + " added");
                    } else {
                        Logger.m5919d("Dropping inbox message containing video/audio as app does not support video. For more information checkout CleverTap documentation.");
                    }
                }
            } catch (JSONException e) {
                Logger.m5919d("Unable to update notification inbox messages - " + e.getLocalizedMessage());
            }
        }
        if (arrayList.size() <= 0) {
            return false;
        }
        this.f96071a.m133300S(arrayList);
        Logger.m5927v("New Notification Inbox messages added");
        synchronized (this.f96073c) {
            this.f96072b = this.f96071a.m133317y(this.f96074d);
            m122871r();
        }
        return true;
    }

    @WorkerThread
    public ew3(CleverTapInstanceConfig cleverTapInstanceConfig, String str, h1c h1cVar, nw3 nw3Var, ch2 ch2Var, boolean z, InboxDeleteCoordinator inboxDeleteCoordinator) {
        this(cleverTapInstanceConfig, str, h1cVar, nw3Var, ch2Var, z, inboxDeleteCoordinator, oa5.f145660a);
    }
}
