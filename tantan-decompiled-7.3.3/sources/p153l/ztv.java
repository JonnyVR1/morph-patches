package p153l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ztv {

    /* JADX INFO: renamed from: f */
    public static final Object f206042f = new Object();

    /* JADX INFO: renamed from: g */
    public static ztv f206043g;

    /* JADX INFO: renamed from: a */
    public final Context f206044a;

    /* JADX INFO: renamed from: b */
    public final HashMap<BroadcastReceiver, ArrayList<C21896c>> f206045b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public final HashMap<String, ArrayList<C21896c>> f206046c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    public final ArrayList<C21895b> f206047d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public final Handler f206048e;

    /* JADX INFO: renamed from: l.ztv$a */
    public class HandlerC21894a extends Handler {
        public HandlerC21894a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                ztv.this.m221573a();
            }
        }
    }

    /* JADX INFO: renamed from: l.ztv$b */
    public static final class C21895b {

        /* JADX INFO: renamed from: a */
        public final Intent f206050a;

        /* JADX INFO: renamed from: b */
        public final ArrayList<C21896c> f206051b;

        public C21895b(Intent intent, ArrayList<C21896c> arrayList) {
            this.f206050a = intent;
            this.f206051b = arrayList;
        }
    }

    /* JADX INFO: renamed from: l.ztv$c */
    public static final class C21896c {

        /* JADX INFO: renamed from: a */
        public final IntentFilter f206052a;

        /* JADX INFO: renamed from: b */
        public final BroadcastReceiver f206053b;

        /* JADX INFO: renamed from: c */
        public boolean f206054c;

        /* JADX INFO: renamed from: d */
        public boolean f206055d;

        public C21896c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f206052a = intentFilter;
            this.f206053b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f206053b);
            sb.append(" filter=");
            sb.append(this.f206052a);
            if (this.f206055d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public ztv(Context context) {
        this.f206044a = context;
        this.f206048e = new HandlerC21894a(context.getMainLooper());
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static ztv m221572b(@NonNull Context context) {
        ztv ztvVar;
        synchronized (f206042f) {
            try {
                if (f206043g == null) {
                    f206043g = new ztv(context.getApplicationContext());
                }
                ztvVar = f206043g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ztvVar;
    }

    /* JADX INFO: renamed from: a */
    public void m221573a() {
        int size;
        C21895b[] c21895bArr;
        while (true) {
            synchronized (this.f206045b) {
                try {
                    size = this.f206047d.size();
                    if (size <= 0) {
                        return;
                    }
                    c21895bArr = new C21895b[size];
                    this.f206047d.toArray(c21895bArr);
                    this.f206047d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i = 0; i < size; i++) {
                C21895b c21895b = c21895bArr[i];
                int size2 = c21895b.f206051b.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C21896c c21896c = c21895b.f206051b.get(i2);
                    if (!c21896c.f206055d) {
                        c21896c.f206053b.onReceive(this.f206044a, c21895b.f206050a);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m221574c(@NonNull BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter) {
        synchronized (this.f206045b) {
            try {
                C21896c c21896c = new C21896c(intentFilter, broadcastReceiver);
                ArrayList<C21896c> arrayList = this.f206045b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.f206045b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(c21896c);
                for (int i = 0; i < intentFilter.countActions(); i++) {
                    String action = intentFilter.getAction(i);
                    ArrayList<C21896c> arrayList2 = this.f206046c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.f206046c.put(action, arrayList2);
                    }
                    arrayList2.add(c21896c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m221575d(@NonNull Intent intent) {
        int iMatch;
        synchronized (this.f206045b) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f206044a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z = (intent.getFlags() & 8) != 0;
                if (z) {
                    intent.toString();
                }
                ArrayList<C21896c> arrayList = this.f206046c.get(intent.getAction());
                if (arrayList != null) {
                    if (z) {
                        arrayList.toString();
                    }
                    ArrayList arrayList2 = null;
                    for (int i = 0; i < arrayList.size(); i++) {
                        C21896c c21896c = arrayList.get(i);
                        if (z) {
                            Objects.toString(c21896c.f206052a);
                        }
                        if (!c21896c.f206054c && (iMatch = c21896c.f206052a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager")) >= 0) {
                            if (z) {
                                Integer.toHexString(iMatch);
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(c21896c);
                            c21896c.f206054c = true;
                        }
                    }
                    if (arrayList2 != null) {
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            ((C21896c) arrayList2.get(i2)).f206054c = false;
                        }
                        this.f206047d.add(new C21895b(intent, arrayList2));
                        if (!this.f206048e.hasMessages(1)) {
                            this.f206048e.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m221576e(@NonNull BroadcastReceiver broadcastReceiver) {
        synchronized (this.f206045b) {
            try {
                ArrayList<C21896c> arrayListRemove = this.f206045b.remove(broadcastReceiver);
                if (arrayListRemove == null) {
                    return;
                }
                for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                    C21896c c21896c = arrayListRemove.get(size);
                    c21896c.f206055d = true;
                    for (int i = 0; i < c21896c.f206052a.countActions(); i++) {
                        String action = c21896c.f206052a.getAction(i);
                        ArrayList<C21896c> arrayList = this.f206046c.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                C21896c c21896c2 = arrayList.get(size2);
                                if (c21896c2.f206053b == broadcastReceiver) {
                                    c21896c2.f206055d = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.f206046c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
