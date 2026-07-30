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
import p153l.ouq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.am */
/* JADX INFO: loaded from: classes2.dex */
public class C14990am {

    /* JADX INFO: renamed from: a */
    private static C14990am f63725a;

    /* JADX INFO: renamed from: a */
    private ConcurrentHashMap<String, HashMap<String, b>> f63727a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a */
    private List<a> f63726a = new ArrayList();

    /* JADX INFO: renamed from: com.xiaomi.push.service.am$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo87536a();
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.am$c */
    public enum c {
        unbind,
        binding,
        binded
    }

    private C14990am() {
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m87687a(b bVar) {
        try {
            HashMap<String, b> map = this.f63727a.get(bVar.f63747g);
            if (map == null) {
                map = new HashMap<>();
                this.f63727a.put(bVar.f63747g, map);
            }
            map.put(m87677a(bVar.f63741b), bVar);
            ouq0.m169393m("add active client. " + bVar.f63737a);
            Iterator<a> it = this.f63726a.iterator();
            while (it.hasNext()) {
                it.next().mo87536a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m87690b() {
        this.f63726a.clear();
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.am$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public Context f63729a;

        /* JADX INFO: renamed from: a */
        Messenger f63731a;

        /* JADX INFO: renamed from: a */
        private XMPushService f63733a;

        /* JADX INFO: renamed from: a */
        public C15014h f63736a;

        /* JADX INFO: renamed from: a */
        public String f63737a;

        /* JADX INFO: renamed from: a */
        public boolean f63739a;

        /* JADX INFO: renamed from: b */
        public String f63741b;

        /* JADX INFO: renamed from: c */
        public String f63743c;

        /* JADX INFO: renamed from: d */
        public String f63744d;

        /* JADX INFO: renamed from: e */
        public String f63745e;

        /* JADX INFO: renamed from: f */
        public String f63746f;

        /* JADX INFO: renamed from: g */
        public String f63747g;

        /* JADX INFO: renamed from: h */
        public String f63748h;

        /* JADX INFO: renamed from: i */
        public String f63749i;

        /* JADX INFO: renamed from: a */
        c f63735a = c.unbind;

        /* JADX INFO: renamed from: a */
        private int f63728a = 0;

        /* JADX INFO: renamed from: a */
        private final CopyOnWriteArrayList<a> f63738a = new CopyOnWriteArrayList<>();

        /* JADX INFO: renamed from: b */
        c f63740b = null;

        /* JADX INFO: renamed from: b */
        private boolean f63742b = false;

        /* JADX INFO: renamed from: a */
        private XMPushService.C14959c f63732a = new XMPushService.C14959c(this);

        /* JADX INFO: renamed from: a */
        IBinder.DeathRecipient f63730a = null;

        /* JADX INFO: renamed from: a */
        final C22831b f63734a = new C22831b();

        /* JADX INFO: renamed from: com.xiaomi.push.service.am$b$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void mo86632a(c cVar, c cVar2, int i);
        }

        /* JADX INFO: renamed from: com.xiaomi.push.service.am$b$c */
        public class c implements IBinder.DeathRecipient {

            /* JADX INFO: renamed from: a */
            final Messenger f63756a;

            /* JADX INFO: renamed from: a */
            final b f63757a;

            public c(b bVar, Messenger messenger) {
                this.f63757a = bVar;
                this.f63756a = messenger;
            }

            @Override // android.os.IBinder.DeathRecipient
            public void binderDied() {
                ouq0.m169403w("peer died, chid = " + this.f63757a.f63747g);
                int i = 0;
                b.this.f63733a.m87517a(new XMPushService.AbstractC14966j(i) { // from class: com.xiaomi.push.service.am.b.c.1
                    @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
                    /* JADX INFO: renamed from: a */
                    public void mo86634a() {
                        c cVar = c.this;
                        if (cVar.f63756a == cVar.f63757a.f63731a) {
                            ouq0.m169403w("clean peer, chid = " + c.this.f63757a.f63747g);
                            c.this.f63757a.f63731a = null;
                        }
                    }

                    @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
                    /* JADX INFO: renamed from: a */
                    public String mo86633a() {
                        return "clear peer job";
                    }
                }, 0L);
                if (Constants.VIA_SHARE_TYPE_MINI_PROGRAM.equals(this.f63757a.f63747g) && "com.xiaomi.xmsf".equals(b.this.f63733a.getPackageName())) {
                    b.this.f63733a.m87517a(new XMPushService.AbstractC14966j(i) { // from class: com.xiaomi.push.service.am.b.c.2
                        @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
                        /* JADX INFO: renamed from: a */
                        public void mo86634a() {
                            C14990am c14990amM87676a = C14990am.m87676a();
                            b bVar = c.this.f63757a;
                            if (c14990amM87676a.m87679a(bVar.f63747g, bVar.f63741b).f63731a == null) {
                                XMPushService xMPushService = b.this.f63733a;
                                b bVar2 = c.this.f63757a;
                                xMPushService.m87520a(bVar2.f63747g, bVar2.f63741b, 2, null, null);
                            }
                        }

                        @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
                        /* JADX INFO: renamed from: a */
                        public String mo86633a() {
                            return "check peer job";
                        }
                    }, com.clevertap.android.sdk.Constants.ONE_MIN_IN_MILLIS);
                }
            }
        }

        public b(XMPushService xMPushService) {
            this.f63733a = xMPushService;
            m87703a(new a() { // from class: com.xiaomi.push.service.am.b.1
                @Override // com.xiaomi.push.service.C14990am.b.a
                /* JADX INFO: renamed from: a */
                public void mo86632a(c cVar, c cVar2, int i) {
                    c cVar3 = c.binding;
                    b bVar = b.this;
                    if (cVar2 == cVar3) {
                        bVar.f63733a.m87517a(b.this.f63732a, com.clevertap.android.sdk.Constants.ONE_MIN_IN_MILLIS);
                    } else {
                        bVar.f63733a.m87530b(b.this.f63732a);
                    }
                }
            });
        }

        /* JADX INFO: renamed from: b */
        private boolean m87698b(int i, int i2, String str) {
            if (i == 1) {
                return (this.f63735a == c.binded || !this.f63733a.m87532c() || i2 == 21 || (i2 == 7 && "wait".equals(str))) ? false : true;
            }
            if (i == 2) {
                return this.f63733a.m87532c();
            }
            if (i != 3) {
                return false;
            }
            return !"wait".equals(str);
        }

        /* JADX INFO: renamed from: a */
        public void m87704a(c cVar, int i, int i2, String str, String str2) {
            c cVar2;
            String str3;
            String str4;
            boolean z;
            for (a aVar : this.f63738a) {
                if (aVar != null) {
                    aVar.mo86632a(this.f63735a, cVar, i2);
                }
            }
            c cVar3 = this.f63735a;
            if (cVar3 != cVar) {
                cVar2 = cVar;
                str3 = str;
                str4 = str2;
                ouq0.m169393m(String.format("update the client %7$s status. %1$s->%2$s %3$s %4$s %5$s %6$s", cVar3, cVar2, m87700a(i), AbstractC14991an.m87707a(i2), str3, str4, this.f63747g));
                this.f63735a = cVar2;
            } else {
                cVar2 = cVar;
                str3 = str;
                str4 = str2;
            }
            if (this.f63736a == null) {
                ouq0.m169378B("status changed while the client dispatcher is missing");
                return;
            }
            if (cVar2 == c.binding) {
                return;
            }
            int i3 = (this.f63740b == null || !(z = this.f63742b)) ? 0 : (this.f63731a == null || !z) ? 10100 : 1000;
            this.f63733a.m87530b(this.f63734a);
            if (m87698b(i, i2, str4)) {
                m87694a(i, i2, str3, str4);
            } else {
                this.f63733a.m87517a(this.f63734a.m87706a(i, i2, str3, str4), i3);
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.push.service.am$b$b, reason: collision with other inner class name */
        public class C22831b extends XMPushService.AbstractC14966j {

            /* JADX INFO: renamed from: a */
            String f63752a;

            /* JADX INFO: renamed from: b */
            int f63753b;

            /* JADX INFO: renamed from: b */
            String f63754b;

            /* JADX INFO: renamed from: c */
            int f63755c;

            public C22831b() {
                super(0);
            }

            @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
            /* JADX INFO: renamed from: a */
            public void mo86634a() {
                boolean zM87696a = b.this.m87696a(this.f63753b, this.f63755c, this.f63754b);
                b bVar = b.this;
                if (zM87696a) {
                    bVar.m87694a(this.f63753b, this.f63755c, this.f63752a, this.f63754b);
                    return;
                }
                ouq0.m169403w(" ignore notify client :" + bVar.f63747g);
            }

            @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
            /* JADX INFO: renamed from: a */
            public String mo86633a() {
                return "notify job";
            }

            /* JADX INFO: renamed from: a */
            public XMPushService.AbstractC14966j m87706a(int i, int i2, String str, String str2) {
                this.f63753b = i;
                this.f63755c = i2;
                this.f63754b = str2;
                this.f63752a = str;
                return this;
            }
        }

        public b() {
        }

        /* JADX INFO: renamed from: b */
        public void m87705b(a aVar) {
            this.f63738a.remove(aVar);
        }

        /* JADX INFO: renamed from: a */
        public void m87701a() {
            try {
                Messenger messenger = this.f63731a;
                if (messenger != null && this.f63730a != null) {
                    messenger.getBinder().unlinkToDeath(this.f63730a, 0);
                }
            } catch (Exception unused) {
            }
            this.f63740b = null;
        }

        /* JADX INFO: renamed from: a */
        public void m87702a(Messenger messenger) {
            m87701a();
            try {
                if (messenger != null) {
                    this.f63731a = messenger;
                    this.f63742b = true;
                    this.f63730a = new c(this, messenger);
                    messenger.getBinder().linkToDeath(this.f63730a, 0);
                    return;
                }
                ouq0.m169403w("peer linked with old sdk chid = " + this.f63747g);
            } catch (Exception e) {
                ouq0.m169403w("peer linkToDeath err: " + e.getMessage());
                this.f63731a = null;
                this.f63742b = false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public void m87694a(int i, int i2, String str, String str2) {
            c cVar = this.f63735a;
            this.f63740b = cVar;
            if (i == 2) {
                this.f63736a.m87834a(this.f63729a, this, i2);
                return;
            }
            if (i == 3) {
                this.f63736a.m87835a(this.f63729a, this, str2, str);
                return;
            }
            if (i == 1) {
                boolean z = cVar == c.binded;
                if (!z && "wait".equals(str2)) {
                    this.f63728a++;
                } else if (z) {
                    this.f63728a = 0;
                    if (this.f63731a != null) {
                        try {
                            this.f63731a.send(Message.obtain(null, 16, this.f63733a.f63606a));
                        } catch (RemoteException unused) {
                        }
                    }
                }
                this.f63736a.m87836a(this.f63733a, this, z, i2, str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public boolean m87696a(int i, int i2, String str) {
            boolean z;
            c cVar = this.f63740b;
            if (cVar == null || !(z = this.f63742b)) {
                return true;
            }
            if (cVar == this.f63735a) {
                ouq0.m169403w(" status recovered, don't notify client:" + this.f63747g);
                return false;
            }
            if (this.f63731a != null && z) {
                ouq0.m169403w("Peer alive notify status to client:" + this.f63747g);
                return true;
            }
            ouq0.m169403w("peer died, ignore notify " + this.f63747g);
            return false;
        }

        /* JADX INFO: renamed from: a */
        public String m87700a(int i) {
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
        public void m87703a(a aVar) {
            this.f63738a.add(aVar);
        }

        /* JADX INFO: renamed from: a */
        public long m87699a() {
            return (((long) ((Math.random() * 20.0d) - 10.0d)) + ((long) ((this.f63728a + 1) * 15))) * 1000;
        }

        /* JADX INFO: renamed from: a */
        public static String m87693a(String str) {
            int iLastIndexOf;
            if (!TextUtils.isEmpty(str) && (iLastIndexOf = str.lastIndexOf("/")) != -1) {
                return str.substring(iLastIndexOf + 1);
            }
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C14990am m87676a() {
        try {
            if (f63725a == null) {
                f63725a = new C14990am();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f63725a;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m87689a(String str, String str2) {
        try {
            HashMap<String, b> map = this.f63727a.get(str);
            if (map != null) {
                b bVar = map.get(m87677a(str2));
                if (bVar != null) {
                    bVar.m87701a();
                }
                map.remove(m87677a(str2));
                if (map.isEmpty()) {
                    this.f63727a.remove(str);
                }
            }
            Iterator<a> it = this.f63726a.iterator();
            while (it.hasNext()) {
                it.next().mo87536a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m87688a(String str) {
        try {
            HashMap<String, b> map = this.f63727a.get(str);
            if (map != null) {
                Iterator<b> it = map.values().iterator();
                while (it.hasNext()) {
                    it.next().m87701a();
                }
                map.clear();
                this.f63727a.remove(str);
            }
            Iterator<a> it2 = this.f63726a.iterator();
            while (it2.hasNext()) {
                it2.next().mo87536a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized List<String> m87682a(String str) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<HashMap<String, b>> it = this.f63727a.values().iterator();
        while (it.hasNext()) {
            for (b bVar : it.next().values()) {
                if (str.equals(bVar.f63737a)) {
                    arrayList.add(bVar.f63747g);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public synchronized ArrayList<b> m87680a() {
        ArrayList<b> arrayList;
        arrayList = new ArrayList<>();
        Iterator<HashMap<String, b>> it = this.f63727a.values().iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().values());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public synchronized Collection<b> m87681a(String str) {
        if (!this.f63727a.containsKey(str)) {
            return new ArrayList();
        }
        return ((HashMap) this.f63727a.get(str).clone()).values();
    }

    /* JADX INFO: renamed from: a */
    public synchronized b m87679a(String str, String str2) {
        HashMap<String, b> map = this.f63727a.get(str);
        if (map == null) {
            return null;
        }
        return map.get(m87677a(str2));
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m87685a(Context context, int i) {
        Iterator<HashMap<String, b>> it = this.f63727a.values().iterator();
        while (it.hasNext()) {
            Iterator<b> it2 = it.next().values().iterator();
            while (it2.hasNext()) {
                int i2 = i;
                it2.next().m87704a(c.unbind, 2, i2, (String) null, (String) null);
                i = i2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized int m87678a() {
        return this.f63727a.size();
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m87683a() {
        try {
            Iterator<b> it = m87680a().iterator();
            while (it.hasNext()) {
                it.next().m87701a();
            }
            this.f63727a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m87684a(Context context) {
        Iterator<HashMap<String, b>> it = this.f63727a.values().iterator();
        while (it.hasNext()) {
            Iterator<b> it2 = it.next().values().iterator();
            while (it2.hasNext()) {
                it2.next().m87704a(c.unbind, 1, 3, (String) null, (String) null);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private String m87677a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int iIndexOf = str.indexOf("@");
        return iIndexOf > 0 ? str.substring(0, iIndexOf) : str;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m87686a(a aVar) {
        this.f63726a.add(aVar);
    }
}
