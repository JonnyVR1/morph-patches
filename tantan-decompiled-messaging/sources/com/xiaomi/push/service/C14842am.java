package com.xiaomi.push.service;

import android.content.Context;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p149l.ilq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.am */
/* JADX INFO: loaded from: classes2.dex */
public class C14842am {

    /* JADX INFO: renamed from: a */
    private static C14842am f62878a;

    /* JADX INFO: renamed from: a */
    private ConcurrentHashMap<String, HashMap<String, b>> f62880a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a */
    private List<a> f62879a = new ArrayList();

    /* JADX INFO: renamed from: com.xiaomi.push.service.am$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo86365a();
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.am$c */
    public enum c {
        unbind,
        binding,
        binded
    }

    private C14842am() {
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m86516a(b bVar) {
        try {
            HashMap<String, b> map = this.f62880a.get(bVar.f62900g);
            if (map == null) {
                map = new HashMap<>();
                this.f62880a.put(bVar.f62900g, map);
            }
            map.put(m86506a(bVar.f62894b), bVar);
            ilq0.m137040m("add active client. " + bVar.f62890a);
            Iterator<a> it = this.f62879a.iterator();
            while (it.hasNext()) {
                it.next().mo86365a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m86519b() {
        this.f62879a.clear();
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.am$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public Context f62882a;

        /* JADX INFO: renamed from: a */
        Messenger f62884a;

        /* JADX INFO: renamed from: a */
        private XMPushService f62886a;

        /* JADX INFO: renamed from: a */
        public C14866h f62889a;

        /* JADX INFO: renamed from: a */
        public String f62890a;

        /* JADX INFO: renamed from: a */
        public boolean f62892a;

        /* JADX INFO: renamed from: b */
        public String f62894b;

        /* JADX INFO: renamed from: c */
        public String f62896c;

        /* JADX INFO: renamed from: d */
        public String f62897d;

        /* JADX INFO: renamed from: e */
        public String f62898e;

        /* JADX INFO: renamed from: f */
        public String f62899f;

        /* JADX INFO: renamed from: g */
        public String f62900g;

        /* JADX INFO: renamed from: h */
        public String f62901h;

        /* JADX INFO: renamed from: i */
        public String f62902i;

        /* JADX INFO: renamed from: a */
        c f62888a = c.unbind;

        /* JADX INFO: renamed from: a */
        private int f62881a = 0;

        /* JADX INFO: renamed from: a */
        private final CopyOnWriteArrayList<a> f62891a = new CopyOnWriteArrayList<>();

        /* JADX INFO: renamed from: b */
        c f62893b = null;

        /* JADX INFO: renamed from: b */
        private boolean f62895b = false;

        /* JADX INFO: renamed from: a */
        private XMPushService.C14811c f62885a = new XMPushService.C14811c(this);

        /* JADX INFO: renamed from: a */
        IBinder.DeathRecipient f62883a = null;

        /* JADX INFO: renamed from: a */
        final C22715b f62887a = new C22715b();

        /* JADX INFO: renamed from: com.xiaomi.push.service.am$b$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void mo85461a(c cVar, c cVar2, int i);
        }

        /* JADX INFO: renamed from: com.xiaomi.push.service.am$b$c */
        public class c implements IBinder.DeathRecipient {

            /* JADX INFO: renamed from: a */
            final Messenger f62909a;

            /* JADX INFO: renamed from: a */
            final b f62910a;

            public c(b bVar, Messenger messenger) {
                this.f62910a = bVar;
                this.f62909a = messenger;
            }

            @Override // android.os.IBinder.DeathRecipient
            public void binderDied() {
                ilq0.m137050w("peer died, chid = " + this.f62910a.f62900g);
                int i = 0;
                b.this.f62886a.m86346a(new XMPushService.AbstractC14818j(i) { // from class: com.xiaomi.push.service.am.b.c.1
                    @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
                    /* JADX INFO: renamed from: a */
                    public void mo85463a() {
                        c cVar = c.this;
                        if (cVar.f62909a == cVar.f62910a.f62884a) {
                            ilq0.m137050w("clean peer, chid = " + c.this.f62910a.f62900g);
                            c.this.f62910a.f62884a = null;
                        }
                    }

                    @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
                    /* JADX INFO: renamed from: a */
                    public String mo85462a() {
                        return "clear peer job";
                    }
                }, 0L);
                if (Constants.VIA_SHARE_TYPE_MINI_PROGRAM.equals(this.f62910a.f62900g) && "com.xiaomi.xmsf".equals(b.this.f62886a.getPackageName())) {
                    b.this.f62886a.m86346a(new XMPushService.AbstractC14818j(i) { // from class: com.xiaomi.push.service.am.b.c.2
                        @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
                        /* JADX INFO: renamed from: a */
                        public void mo85463a() {
                            C14842am c14842amM86505a = C14842am.m86505a();
                            b bVar = c.this.f62910a;
                            if (c14842amM86505a.m86508a(bVar.f62900g, bVar.f62894b).f62884a == null) {
                                XMPushService xMPushService = b.this.f62886a;
                                b bVar2 = c.this.f62910a;
                                xMPushService.m86349a(bVar2.f62900g, bVar2.f62894b, 2, null, null);
                            }
                        }

                        @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
                        /* JADX INFO: renamed from: a */
                        public String mo85462a() {
                            return "check peer job";
                        }
                    }, com.clevertap.android.sdk.Constants.ONE_MIN_IN_MILLIS);
                }
            }
        }

        public b(XMPushService xMPushService) {
            this.f62886a = xMPushService;
            m86532a(new a() { // from class: com.xiaomi.push.service.am.b.1
                @Override // com.xiaomi.push.service.C14842am.b.a
                /* JADX INFO: renamed from: a */
                public void mo85461a(c cVar, c cVar2, int i) {
                    c cVar3 = c.binding;
                    b bVar = b.this;
                    if (cVar2 == cVar3) {
                        bVar.f62886a.m86346a(b.this.f62885a, com.clevertap.android.sdk.Constants.ONE_MIN_IN_MILLIS);
                    } else {
                        bVar.f62886a.m86359b(b.this.f62885a);
                    }
                }
            });
        }

        /* JADX INFO: renamed from: b */
        private boolean m86527b(int i, int i2, String str) {
            if (i == 1) {
                return (this.f62888a == c.binded || !this.f62886a.m86361c() || i2 == 21 || (i2 == 7 && "wait".equals(str))) ? false : true;
            }
            if (i == 2) {
                return this.f62886a.m86361c();
            }
            if (i != 3) {
                return false;
            }
            return !"wait".equals(str);
        }

        /* JADX INFO: renamed from: a */
        public void m86533a(c cVar, int i, int i2, String str, String str2) {
            c cVar2;
            String str3;
            String str4;
            boolean z;
            for (a aVar : this.f62891a) {
                if (aVar != null) {
                    aVar.mo85461a(this.f62888a, cVar, i2);
                }
            }
            c cVar3 = this.f62888a;
            if (cVar3 != cVar) {
                cVar2 = cVar;
                str3 = str;
                str4 = str2;
                ilq0.m137040m(String.format("update the client %7$s status. %1$s->%2$s %3$s %4$s %5$s %6$s", cVar3, cVar2, m86529a(i), AbstractC14843an.m86536a(i2), str3, str4, this.f62900g));
                this.f62888a = cVar2;
            } else {
                cVar2 = cVar;
                str3 = str;
                str4 = str2;
            }
            if (this.f62889a == null) {
                ilq0.m137025B("status changed while the client dispatcher is missing");
                return;
            }
            if (cVar2 == c.binding) {
                return;
            }
            int i3 = (this.f62893b == null || !(z = this.f62895b)) ? 0 : (this.f62884a == null || !z) ? 10100 : 1000;
            this.f62886a.m86359b(this.f62887a);
            if (m86527b(i, i2, str4)) {
                m86523a(i, i2, str3, str4);
            } else {
                this.f62886a.m86346a(this.f62887a.m86535a(i, i2, str3, str4), i3);
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.push.service.am$b$b, reason: collision with other inner class name */
        public class C22715b extends XMPushService.AbstractC14818j {

            /* JADX INFO: renamed from: a */
            String f62905a;

            /* JADX INFO: renamed from: b */
            int f62906b;

            /* JADX INFO: renamed from: b */
            String f62907b;

            /* JADX INFO: renamed from: c */
            int f62908c;

            public C22715b() {
                super(0);
            }

            @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
            /* JADX INFO: renamed from: a */
            public void mo85463a() {
                boolean zM86525a = b.this.m86525a(this.f62906b, this.f62908c, this.f62907b);
                b bVar = b.this;
                if (zM86525a) {
                    bVar.m86523a(this.f62906b, this.f62908c, this.f62905a, this.f62907b);
                    return;
                }
                ilq0.m137050w(" ignore notify client :" + bVar.f62900g);
            }

            @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
            /* JADX INFO: renamed from: a */
            public String mo85462a() {
                return "notify job";
            }

            /* JADX INFO: renamed from: a */
            public XMPushService.AbstractC14818j m86535a(int i, int i2, String str, String str2) {
                this.f62906b = i;
                this.f62908c = i2;
                this.f62907b = str2;
                this.f62905a = str;
                return this;
            }
        }

        public b() {
        }

        /* JADX INFO: renamed from: b */
        public void m86534b(a aVar) {
            this.f62891a.remove(aVar);
        }

        /* JADX INFO: renamed from: a */
        public void m86530a() {
            try {
                Messenger messenger = this.f62884a;
                if (messenger != null && this.f62883a != null) {
                    messenger.getBinder().unlinkToDeath(this.f62883a, 0);
                }
            } catch (Exception unused) {
            }
            this.f62893b = null;
        }

        /* JADX INFO: renamed from: a */
        public void m86531a(Messenger messenger) {
            m86530a();
            try {
                if (messenger != null) {
                    this.f62884a = messenger;
                    this.f62895b = true;
                    this.f62883a = new c(this, messenger);
                    messenger.getBinder().linkToDeath(this.f62883a, 0);
                    return;
                }
                ilq0.m137050w("peer linked with old sdk chid = " + this.f62900g);
            } catch (Exception e) {
                ilq0.m137050w("peer linkToDeath err: " + e.getMessage());
                this.f62884a = null;
                this.f62895b = false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public void m86523a(int i, int i2, String str, String str2) {
            c cVar = this.f62888a;
            this.f62893b = cVar;
            if (i == 2) {
                this.f62889a.m86663a(this.f62882a, this, i2);
                return;
            }
            if (i == 3) {
                this.f62889a.m86664a(this.f62882a, this, str2, str);
                return;
            }
            if (i == 1) {
                boolean z = cVar == c.binded;
                if (!z && "wait".equals(str2)) {
                    this.f62881a++;
                } else if (z) {
                    this.f62881a = 0;
                    if (this.f62884a != null) {
                        try {
                            this.f62884a.send(Message.obtain(null, 16, this.f62886a.f62759a));
                        } catch (RemoteException unused) {
                        }
                    }
                }
                this.f62889a.m86665a(this.f62886a, this, z, i2, str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public boolean m86525a(int i, int i2, String str) {
            boolean z;
            c cVar = this.f62893b;
            if (cVar == null || !(z = this.f62895b)) {
                return true;
            }
            if (cVar == this.f62888a) {
                ilq0.m137050w(" status recovered, don't notify client:" + this.f62900g);
                return false;
            }
            if (this.f62884a != null && z) {
                ilq0.m137050w("Peer alive notify status to client:" + this.f62900g);
                return true;
            }
            ilq0.m137050w("peer died, ignore notify " + this.f62900g);
            return false;
        }

        /* JADX INFO: renamed from: a */
        public String m86529a(int i) {
            if (i == 1) {
                return "OPEN";
            }
            if (i == 2) {
                return "CLOSE";
            }
            if (i != 3) {
                return "unknown";
            }
            return "KICK";
        }

        /* JADX INFO: renamed from: a */
        public void m86532a(a aVar) {
            this.f62891a.add(aVar);
        }

        /* JADX INFO: renamed from: a */
        public long m86528a() {
            return (((long) ((Math.random() * 20.0d) - 10.0d)) + ((long) ((this.f62881a + 1) * 15))) * 1000;
        }

        /* JADX INFO: renamed from: a */
        public static String m86522a(String str) {
            int iLastIndexOf;
            if (!TextUtils.isEmpty(str) && (iLastIndexOf = str.lastIndexOf("/")) != -1) {
                return str.substring(iLastIndexOf + 1);
            }
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C14842am m86505a() {
        try {
            if (f62878a == null) {
                f62878a = new C14842am();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f62878a;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m86518a(String str, String str2) {
        try {
            HashMap<String, b> map = this.f62880a.get(str);
            if (map != null) {
                b bVar = map.get(m86506a(str2));
                if (bVar != null) {
                    bVar.m86530a();
                }
                map.remove(m86506a(str2));
                if (map.isEmpty()) {
                    this.f62880a.remove(str);
                }
            }
            Iterator<a> it = this.f62879a.iterator();
            while (it.hasNext()) {
                it.next().mo86365a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m86517a(String str) {
        try {
            HashMap<String, b> map = this.f62880a.get(str);
            if (map != null) {
                Iterator<b> it = map.values().iterator();
                while (it.hasNext()) {
                    it.next().m86530a();
                }
                map.clear();
                this.f62880a.remove(str);
            }
            Iterator<a> it2 = this.f62879a.iterator();
            while (it2.hasNext()) {
                it2.next().mo86365a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized List<String> m86511a(String str) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<HashMap<String, b>> it = this.f62880a.values().iterator();
        while (it.hasNext()) {
            for (b bVar : it.next().values()) {
                if (str.equals(bVar.f62890a)) {
                    arrayList.add(bVar.f62900g);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public synchronized ArrayList<b> m86509a() {
        ArrayList<b> arrayList;
        arrayList = new ArrayList<>();
        Iterator<HashMap<String, b>> it = this.f62880a.values().iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().values());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public synchronized Collection<b> m86510a(String str) {
        if (!this.f62880a.containsKey(str)) {
            return new ArrayList();
        }
        return ((HashMap) this.f62880a.get(str).clone()).values();
    }

    /* JADX INFO: renamed from: a */
    public synchronized b m86508a(String str, String str2) {
        HashMap<String, b> map = this.f62880a.get(str);
        if (map == null) {
            return null;
        }
        return map.get(m86506a(str2));
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m86514a(Context context, int i) {
        Iterator<HashMap<String, b>> it = this.f62880a.values().iterator();
        while (it.hasNext()) {
            Iterator<b> it2 = it.next().values().iterator();
            while (it2.hasNext()) {
                int i2 = i;
                it2.next().m86533a(c.unbind, 2, i2, (String) null, (String) null);
                i = i2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized int m86507a() {
        return this.f62880a.size();
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m86512a() {
        try {
            Iterator<b> it = m86509a().iterator();
            while (it.hasNext()) {
                it.next().m86530a();
            }
            this.f62880a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m86513a(Context context) {
        Iterator<HashMap<String, b>> it = this.f62880a.values().iterator();
        while (it.hasNext()) {
            Iterator<b> it2 = it.next().values().iterator();
            while (it2.hasNext()) {
                it2.next().m86533a(c.unbind, 1, 3, (String) null, (String) null);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private String m86506a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int iIndexOf = str.indexOf("@");
        return iIndexOf > 0 ? str.substring(0, iIndexOf) : str;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m86515a(a aVar) {
        this.f62879a.add(aVar);
    }
}
