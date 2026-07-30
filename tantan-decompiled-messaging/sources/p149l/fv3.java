package p149l;

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
public class fv3 {

    /* JADX INFO: renamed from: a */
    private final tzb f99383a;

    /* JADX INFO: renamed from: b */
    private ArrayList<pv3> f99384b;

    /* JADX INFO: renamed from: c */
    private final Object f99385c;

    /* JADX INFO: renamed from: d */
    private final String f99386d;

    /* JADX INFO: renamed from: e */
    private final boolean f99387e;

    /* JADX INFO: renamed from: f */
    private final ov3 f99388f;

    /* JADX INFO: renamed from: g */
    private final vg2 f99389g;

    /* JADX INFO: renamed from: h */
    private final CleverTapInstanceConfig f99390h;

    /* JADX INFO: renamed from: i */
    private final InboxDeleteCoordinator f99391i;

    /* JADX INFO: renamed from: j */
    private final n95 f99392j;

    /* JADX INFO: renamed from: l.fv3$a */
    public class CallableC16924a implements Callable<Void> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CTInboxMessage f99393a;

        public CallableC16924a(CTInboxMessage cTInboxMessage) {
            this.f99393a = cTInboxMessage;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (fv3.this.f99388f.m166152b()) {
                try {
                    if (fv3.this.m123260d(this.f99393a.m6683e())) {
                        fv3.this.f99389g.mo100728b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: l.fv3$b */
    public class CallableC16925b implements Callable<Void> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f99395a;

        public CallableC16925b(String str) {
            this.f99395a = str;
        }

        @Override // java.util.concurrent.Callable
        @WorkerThread
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            fv3.this.f99383a.m191175l(this.f99395a, fv3.this.f99386d);
            return null;
        }
    }

    /* JADX INFO: renamed from: l.fv3$c */
    public class CallableC16926c implements Callable<Void> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f99397a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f99398b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ long f99399c;

        public CallableC16926c(String str, boolean z, long j) {
            this.f99397a = str;
            this.f99398b = z;
            this.f99399c = j;
        }

        @Override // java.util.concurrent.Callable
        @WorkerThread
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            fv3.this.f99383a.m191157H(this.f99397a, fv3.this.f99386d);
            if (!this.f99398b) {
                return null;
            }
            fv3.this.f99383a.m191170g(this.f99397a, fv3.this.f99386d, this.f99399c);
            return null;
        }
    }

    @VisibleForTesting
    public fv3(CleverTapInstanceConfig cleverTapInstanceConfig, String str, tzb tzbVar, ov3 ov3Var, vg2 vg2Var, boolean z, InboxDeleteCoordinator inboxDeleteCoordinator, n95 n95Var) {
        this.f99385c = new Object();
        this.f99386d = str;
        this.f99383a = tzbVar;
        this.f99384b = tzbVar.m191185y(str);
        this.f99387e = z;
        this.f99388f = ov3Var;
        this.f99389g = vg2Var;
        this.f99390h = cleverTapInstanceConfig;
        this.f99391i = inboxDeleteCoordinator;
        this.f99392j = n95Var;
    }

    @AnyThread
    /* JADX INFO: renamed from: j */
    private pv3 m123256j(String str) {
        synchronized (this.f99385c) {
            try {
                for (pv3 pv3Var : this.f99384b) {
                    if (pv3Var.m171502e().equals(str)) {
                        return pv3Var;
                    }
                }
                Logger.m5873v("Inbox Message for message id - " + str + " not found");
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    private static long m123257q(pv3 pv3Var, long j) {
        long jM171501d = pv3Var == null ? 0L : pv3Var.m171501d();
        if (jM171501d == 0) {
            return 0L;
        }
        return jM171501d > 0 ? jM171501d : j + 86400;
    }

    @AnyThread
    /* JADX INFO: renamed from: r */
    private void m123258r() {
        Logger.m5873v("CTInboxController:trimMessages() called");
        ArrayList arrayList = new ArrayList();
        synchronized (this.f99385c) {
            try {
                for (pv3 pv3Var : this.f99384b) {
                    if (this.f99387e || !pv3Var.m171498a()) {
                        long jM171501d = pv3Var.m171501d();
                        if (jM171501d > 0 && this.f99392j.mo158533c() > jM171501d) {
                            Logger.m5873v("Inbox Message: " + pv3Var.m171502e() + " is expired - removing");
                            arrayList.add(pv3Var);
                        }
                    } else {
                        Logger.m5865d("Removing inbox message containing video/audio as app does not support video. For more information checkout CleverTap documentation.");
                        arrayList.add(pv3Var);
                    }
                }
                if (arrayList.size() <= 0) {
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m123259c(((pv3) it.next()).m171502e());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @AnyThread
    /* JADX INFO: renamed from: c */
    public boolean m123259c(String str) {
        pv3 pv3VarM123256j = m123256j(str);
        if (pv3VarM123256j == null) {
            return false;
        }
        synchronized (this.f99385c) {
            this.f99384b.remove(pv3VarM123256j);
        }
        st3.m185849c(this.f99390h).m190592d().m6946g("RunDeleteMessage", new CallableC16925b(str));
        return true;
    }

    @AnyThread
    /* JADX INFO: renamed from: d */
    public boolean m123260d(final String str) {
        pv3 pv3VarM123256j = m123256j(str);
        if (pv3VarM123256j == null) {
            return false;
        }
        boolean z = pv3VarM123256j.m171505h() == InboxMessageSource.V2;
        long jM123257q = z ? m123257q(pv3VarM123256j, this.f99392j.mo158533c()) : 0L;
        synchronized (this.f99385c) {
            pv3VarM123256j.m171516u(1);
        }
        Task taskM190592d = st3.m185849c(this.f99390h).m190592d();
        taskM190592d.m6945f(new pg50() { // from class: l.dv3
            @Override // p149l.pg50
            public final void onSuccess(Object obj) {
                this.f88031a.f99389g.mo100728b();
            }
        });
        taskM190592d.m6943d(new ae50() { // from class: l.ev3
            @Override // p149l.ae50
            /* JADX INFO: renamed from: a */
            public final void mo96043a(Object obj) {
                Logger.m5868d("Failed to update message read state for id:" + str, (Exception) obj);
            }
        });
        taskM190592d.m6946g("RunMarkMessageRead", new CallableC16926c(str, z, jM123257q));
        return true;
    }

    /* JADX INFO: renamed from: i */
    public int m123261i() {
        return m123263l().size();
    }

    @AnyThread
    /* JADX INFO: renamed from: k */
    public pv3 m123262k(String str) {
        return m123256j(str);
    }

    @AnyThread
    /* JADX INFO: renamed from: l */
    public ArrayList<pv3> m123263l() {
        ArrayList<pv3> arrayList;
        synchronized (this.f99385c) {
            m123258r();
            arrayList = this.f99384b;
        }
        return arrayList;
    }

    @AnyThread
    /* JADX INFO: renamed from: m */
    public String m123264m() {
        return this.f99386d;
    }

    @AnyThread
    /* JADX INFO: renamed from: n */
    public boolean m123265n(String str) {
        if (str == null) {
            return false;
        }
        synchronized (this.f99385c) {
            try {
                for (pv3 pv3Var : this.f99384b) {
                    if (str.equals(pv3Var.m171502e())) {
                        return pv3Var.m171505h() == InboxMessageSource.V2;
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
    public void m123266o(CTInboxMessage cTInboxMessage) {
        st3.m185849c(this.f99390h).m190592d().m6946g("markReadInboxMessage", new CallableC16924a(cTInboxMessage));
    }

    @WorkerThread
    /* JADX INFO: renamed from: p */
    public boolean m123267p(List<pv3> list, InboxV2DeliverySource inboxV2DeliverySource) {
        boolean z;
        long jMo158533c = this.f99392j.mo158533c();
        boolean z2 = true;
        if (inboxV2DeliverySource == InboxV2DeliverySource.FETCH) {
            HashSet hashSet = new HashSet(list.size());
            Iterator<pv3> it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().m171502e());
            }
            if (!hashSet.isEmpty()) {
                this.f99390h.getLogger().verbose(this.f99390h.getAccountId(), "InboxV2: markIndexed " + hashSet.size() + " msg(s)");
                this.f99383a.m191155F(new ArrayList(hashSet), this.f99386d);
            }
            Set<String> setM191183t = this.f99383a.m191183t(this.f99386d, jMo158533c - 21600);
            setM191183t.removeAll(hashSet);
            boolean zIsEmpty = setM191183t.isEmpty();
            CleverTapInstanceConfig cleverTapInstanceConfig = this.f99390h;
            if (zIsEmpty) {
                cleverTapInstanceConfig.getLogger().verbose(this.f99390h.getAccountId(), "InboxV2: cross-device sweep — nothing to remove");
                z = false;
            } else {
                cleverTapInstanceConfig.getLogger().verbose(this.f99390h.getAccountId(), "InboxV2: cross-device sweep — removing " + setM191183t.size() + " msg(s): " + setM191183t);
                this.f99383a.m191176m(new ArrayList(setM191183t), this.f99386d);
                z = true;
            }
        } else {
            z = false;
        }
        int iM191160K = this.f99383a.m191160K(this.f99386d, jMo158533c);
        if (iM191160K > 0) {
            this.f99390h.getLogger().verbose(this.f99390h.getAccountId(), "InboxV2: removed " + iM191160K + " expired AWAITING_CONFIRM row(s)");
        }
        int iM191161L = this.f99383a.m191161L(this.f99386d, jMo158533c);
        if (iM191161L > 0) {
            this.f99390h.getLogger().verbose(this.f99390h.getAccountId(), "InboxV2: removed " + iM191161L + " expired pending-read row(s)");
        }
        Set<String> setM191186z = this.f99383a.m191186z(this.f99386d);
        Set<String> setM191154B = this.f99383a.m191154B(this.f99386d);
        if (!setM191154B.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (pv3 pv3Var : list) {
                if (pv3Var.m171509n() == 1 && setM191154B.contains(pv3Var.m171502e())) {
                    arrayList.add(pv3Var.m171502e());
                }
            }
            if (!arrayList.isEmpty()) {
                this.f99383a.m191162M(arrayList, this.f99386d);
            }
        }
        List<pv3> listM108421c = crm.INSTANCE.m108421c(list, setM191186z, setM191154B, this.f99387e, jMo158533c);
        if (!listM108421c.isEmpty()) {
            if (inboxV2DeliverySource == InboxV2DeliverySource.FETCH) {
                Iterator<pv3> it2 = listM108421c.iterator();
                while (it2.hasNext()) {
                    it2.next().m171514s("INDEXED");
                }
            }
            this.f99383a.m191168S(listM108421c);
        }
        boolean z3 = z || !listM108421c.isEmpty();
        synchronized (this.f99385c) {
            try {
                o75 o75VarM108420b = crm.INSTANCE.m108420b(this.f99383a.m191185y(this.f99386d), setM191186z, setM191154B, this.f99387e, jMo158533c);
                if (o75VarM108420b.m162974b().isEmpty()) {
                    z2 = z3;
                } else {
                    this.f99383a.m191176m(o75VarM108420b.m162974b(), this.f99386d);
                }
                this.f99384b = new ArrayList<>(o75VarM108420b.m162973a());
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    @WorkerThread
    /* JADX INFO: renamed from: s */
    public boolean m123268s(JSONArray jSONArray) {
        Logger.m5873v("CTInboxController:updateMessages() called");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                pv3 pv3VarM171497m = pv3.m171497m(jSONArray.getJSONObject(i), this.f99386d, InboxMessageSource.V1);
                if (pv3VarM171497m != null) {
                    if (this.f99387e || !pv3VarM171497m.m171498a()) {
                        arrayList.add(pv3VarM171497m);
                        Logger.m5873v("Inbox Message for message id - " + pv3VarM171497m.m171502e() + " added");
                    } else {
                        Logger.m5865d("Dropping inbox message containing video/audio as app does not support video. For more information checkout CleverTap documentation.");
                    }
                }
            } catch (JSONException e) {
                Logger.m5865d("Unable to update notification inbox messages - " + e.getLocalizedMessage());
            }
        }
        if (arrayList.size() <= 0) {
            return false;
        }
        this.f99383a.m191168S(arrayList);
        Logger.m5873v("New Notification Inbox messages added");
        synchronized (this.f99385c) {
            this.f99384b = this.f99383a.m191185y(this.f99386d);
            m123258r();
        }
        return true;
    }

    @WorkerThread
    public fv3(CleverTapInstanceConfig cleverTapInstanceConfig, String str, tzb tzbVar, ov3 ov3Var, vg2 vg2Var, boolean z, InboxDeleteCoordinator inboxDeleteCoordinator) {
        this(cleverTapInstanceConfig, str, tzbVar, ov3Var, vg2Var, z, inboxDeleteCoordinator, n95.f137721a);
    }
}
