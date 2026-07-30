package com.hellogroup.p036mk.core.utils.globalevent;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.Gson;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.jzv;
import p153l.rf3;
import p153l.wg3;

/* JADX INFO: loaded from: classes7.dex */
public class MKEventManager {

    /* JADX INFO: renamed from: c */
    private static volatile MKEventManager f12536c;

    /* JADX INFO: renamed from: a */
    private final Map<String, List<InterfaceC3606a>> f12537a = new HashMap();

    /* JADX INFO: renamed from: b */
    private Context f12538b;

    /* JADX INFO: renamed from: com.hellogroup.mk.core.utils.globalevent.MKEventManager$a */
    public interface InterfaceC3606a {
        /* JADX INFO: renamed from: i */
        void mo17965i(Event event);
    }

    private MKEventManager() {
    }

    /* JADX INFO: renamed from: b */
    public static MKEventManager m18492b() {
        if (f12536c == null) {
            synchronized (MKEventManager.class) {
                try {
                    if (f12536c == null) {
                        f12536c = new MKEventManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12536c;
    }

    /* JADX INFO: renamed from: c */
    public void m18493c(@NonNull Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f12538b = applicationContext;
        rf3.m181164b(applicationContext, new BroadcastReceiver() { // from class: com.hellogroup.mk.core.utils.globalevent.MKEventManager.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                try {
                    Event event = (Event) intent.getParcelableExtra("global_event");
                    if (event != null) {
                        ArrayList arrayList = new ArrayList();
                        synchronized (MKEventManager.this) {
                            try {
                                if (event.dsts != null) {
                                    for (String str : event.dsts) {
                                        List list = (List) MKEventManager.this.f12537a.get(str);
                                        if (list != null) {
                                            arrayList.addAll(list);
                                        }
                                    }
                                } else {
                                    Iterator it = MKEventManager.this.f12537a.entrySet().iterator();
                                    while (it.hasNext()) {
                                        List list2 = (List) ((Map.Entry) it.next()).getValue();
                                        if (list2 != null) {
                                            arrayList.addAll(list2);
                                        }
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC3606a) it2.next()).mo17965i(event);
                        }
                    }
                } catch (Throwable th2) {
                    jzv.m147731d("global", th2);
                }
            }
        }, "com.immomo.momo.globalevent.ACTION_MK_GLOBAL_EVENT");
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m18494d(@NonNull InterfaceC3606a interfaceC3606a, @NonNull String str) {
        try {
            List<InterfaceC3606a> linkedList = this.f12537a.get(str);
            if (linkedList == null) {
                linkedList = new LinkedList<>();
                this.f12537a.put(str, linkedList);
            }
            if (!linkedList.contains(interfaceC3606a)) {
                linkedList.add(interfaceC3606a);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m18495e(@NonNull Event event) {
        event.m18500b();
        Intent intent = new Intent("com.immomo.momo.globalevent.ACTION_MK_GLOBAL_EVENT");
        intent.putExtra("global_event", event);
        rf3.m181165c(this.f12538b, intent);
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m18496f(@NonNull InterfaceC3606a interfaceC3606a, @NonNull String str) {
        List<InterfaceC3606a> list = this.f12537a.get(str);
        if (list != null) {
            list.remove(interfaceC3606a);
            if (list.isEmpty()) {
                this.f12537a.remove(str);
            }
        }
    }

    public static class Event implements Parcelable {
        public static final Parcelable.Creator<Event> CREATOR = new C3605a();
        private String[] dsts;
        private Map<String, Object> msg;
        private String name;
        private String src;

        /* JADX INFO: renamed from: com.hellogroup.mk.core.utils.globalevent.MKEventManager$Event$a */
        public class C3605a implements Parcelable.Creator<Event> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Event createFromParcel(Parcel parcel) {
                return new Event(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Event[] newArray(int i) {
                return new Event[i];
            }
        }

        public Event(Parcel parcel) {
            this.name = parcel.readString();
            parcel.readStringArray(this.dsts);
            this.src = parcel.readString();
            parcel.readMap(this.msg, Map.class.getClassLoader());
        }

        /* JADX INFO: renamed from: d */
        private String m18498d() {
            String[] strArr = this.dsts;
            if (strArr == null) {
                return "";
            }
            int length = strArr.length;
            if (length <= 1) {
                return length > 0 ? strArr[0] : "";
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < length; i++) {
                if (i != 0) {
                    sb.append('|');
                }
                sb.append(this.dsts[i]);
            }
            return sb.toString();
        }

        /* JADX INFO: renamed from: g */
        private JSONObject m18499g() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("event_name", this.name);
                jSONObject.put("dst_l_evn", m18498d());
                jSONObject.put("l_evn", this.src);
                jSONObject.put("event_msg", new JSONObject(new Gson().toJson(this.msg)));
                return jSONObject;
            } catch (JSONException e) {
                Log.e("MKEventManager", "", e);
                return jSONObject;
            }
        }

        /* JADX INFO: renamed from: b */
        public void m18500b() {
            String[] strArr;
            if (TextUtils.isEmpty(this.name) || (strArr = this.dsts) == null || strArr.length == 0) {
                wg3.m206174a("name dsts src cannot be empty!");
            }
        }

        /* JADX INFO: renamed from: c */
        public Event m18501c(@NonNull List<String> list) {
            this.dsts = (String[]) list.toArray(new String[0]);
            return this;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e */
        public Map<String, Object> m18502e() {
            return this.msg;
        }

        /* JADX INFO: renamed from: f */
        public String m18503f() {
            return this.name;
        }

        /* JADX INFO: renamed from: h */
        public String m18504h() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(LovePlanetStage.result, m18499g());
            } catch (JSONException e) {
                Log.e("MKEventManager", "", e);
            }
            return jSONObject.toString();
        }

        /* JADX INFO: renamed from: i */
        public Event m18505i(@Nullable String str) {
            if (TextUtils.isEmpty(str)) {
                this.msg = null;
                return this;
            }
            this.msg = (Map) new Gson().fromJson(str, Map.class);
            return this;
        }

        /* JADX INFO: renamed from: k */
        public Event m18506k(@NonNull String str) {
            this.src = str;
            return this;
        }

        public String toString() {
            return m18499g().toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.name);
            parcel.writeStringArray(this.dsts);
            parcel.writeString(this.src);
            parcel.writeMap(this.msg);
        }

        public Event(@NonNull String str) {
            this.name = str;
        }
    }
}
