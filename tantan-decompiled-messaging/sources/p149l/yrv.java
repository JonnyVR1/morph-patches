package p149l;

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
public final class yrv {

    /* JADX INFO: renamed from: f */
    public static final Object f199706f = new Object();

    /* JADX INFO: renamed from: g */
    public static yrv f199707g;

    /* JADX INFO: renamed from: a */
    public final Context f199708a;

    /* JADX INFO: renamed from: b */
    public final HashMap<BroadcastReceiver, ArrayList<C21493c>> f199709b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public final HashMap<String, ArrayList<C21493c>> f199710c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    public final ArrayList<C21492b> f199711d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public final Handler f199712e;

    /* JADX INFO: renamed from: l.yrv$a */
    public class HandlerC21491a extends Handler {
        public HandlerC21491a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                yrv.this.m215865a();
            }
        }
    }

    /* JADX INFO: renamed from: l.yrv$b */
    public static final class C21492b {

        /* JADX INFO: renamed from: a */
        public final Intent f199714a;

        /* JADX INFO: renamed from: b */
        public final ArrayList<C21493c> f199715b;

        public C21492b(Intent intent, ArrayList<C21493c> arrayList) {
            this.f199714a = intent;
            this.f199715b = arrayList;
        }
    }

    /* JADX INFO: renamed from: l.yrv$c */
    public static final class C21493c {

        /* JADX INFO: renamed from: a */
        public final IntentFilter f199716a;

        /* JADX INFO: renamed from: b */
        public final BroadcastReceiver f199717b;

        /* JADX INFO: renamed from: c */
        public boolean f199718c;

        /* JADX INFO: renamed from: d */
        public boolean f199719d;

        public C21493c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f199716a = intentFilter;
            this.f199717b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f199717b);
            sb.append(" filter=");
            sb.append(this.f199716a);
            if (this.f199719d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public yrv(Context context) {
        this.f199708a = context;
        this.f199712e = new HandlerC21491a(context.getMainLooper());
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static yrv m215864b(@NonNull Context context) {
        yrv yrvVar;
        synchronized (f199706f) {
            try {
                if (f199707g == null) {
                    f199707g = new yrv(context.getApplicationContext());
                }
                yrvVar = f199707g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return yrvVar;
    }

    /* JADX INFO: renamed from: a */
    public void m215865a() {
        int size;
        C21492b[] c21492bArr;
        while (true) {
            synchronized (this.f199709b) {
                try {
                    size = this.f199711d.size();
                    if (size <= 0) {
                        return;
                    }
                    c21492bArr = new C21492b[size];
                    this.f199711d.toArray(c21492bArr);
                    this.f199711d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i = 0; i < size; i++) {
                C21492b c21492b = c21492bArr[i];
                int size2 = c21492b.f199715b.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C21493c c21493c = c21492b.f199715b.get(i2);
                    if (!c21493c.f199719d) {
                        c21493c.f199717b.onReceive(this.f199708a, c21492b.f199714a);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m215866c(@NonNull BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter) {
        synchronized (this.f199709b) {
            try {
                C21493c c21493c = new C21493c(intentFilter, broadcastReceiver);
                ArrayList<C21493c> arrayList = this.f199709b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.f199709b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(c21493c);
                for (int i = 0; i < intentFilter.countActions(); i++) {
                    String action = intentFilter.getAction(i);
                    ArrayList<C21493c> arrayList2 = this.f199710c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.f199710c.put(action, arrayList2);
                    }
                    arrayList2.add(c21493c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m215867d(@NonNull Intent intent) {
        int iMatch;
        synchronized (this.f199709b) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f199708a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z = (intent.getFlags() & 8) != 0;
                if (z) {
                    intent.toString();
                }
                ArrayList<C21493c> arrayList = this.f199710c.get(intent.getAction());
                if (arrayList != null) {
                    if (z) {
                        arrayList.toString();
                    }
                    ArrayList arrayList2 = null;
                    for (int i = 0; i < arrayList.size(); i++) {
                        C21493c c21493c = arrayList.get(i);
                        if (z) {
                            Objects.toString(c21493c.f199716a);
                        }
                        if (!c21493c.f199718c && (iMatch = c21493c.f199716a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager")) >= 0) {
                            if (z) {
                                Integer.toHexString(iMatch);
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(c21493c);
                            c21493c.f199718c = true;
                        }
                    }
                    if (arrayList2 != null) {
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            ((C21493c) arrayList2.get(i2)).f199718c = false;
                        }
                        this.f199711d.add(new C21492b(intent, arrayList2));
                        if (!this.f199712e.hasMessages(1)) {
                            this.f199712e.sendEmptyMessage(1);
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
    public void m215868e(@NonNull BroadcastReceiver broadcastReceiver) {
        synchronized (this.f199709b) {
            try {
                ArrayList<C21493c> arrayListRemove = this.f199709b.remove(broadcastReceiver);
                if (arrayListRemove == null) {
                    return;
                }
                for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                    C21493c c21493c = arrayListRemove.get(size);
                    c21493c.f199719d = true;
                    for (int i = 0; i < c21493c.f199716a.countActions(); i++) {
                        String action = c21493c.f199716a.getAction(i);
                        ArrayList<C21493c> arrayList = this.f199710c.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                C21493c c21493c2 = arrayList.get(size2);
                                if (c21493c2.f199717b == broadcastReceiver) {
                                    c21493c2.f199719d = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.f199710c.remove(action);
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
