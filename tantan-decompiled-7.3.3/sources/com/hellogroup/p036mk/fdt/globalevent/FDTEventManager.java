package com.hellogroup.p036mk.fdt.globalevent;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.gson.Gson;
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
public class FDTEventManager {

    /* JADX INFO: renamed from: c */
    private static volatile FDTEventManager f12553c;

    /* JADX INFO: renamed from: a */
    private final Map<String, List<InterfaceC3612a>> f12554a = new HashMap();

    /* JADX INFO: renamed from: b */
    private Context f12555b;

    /* JADX INFO: renamed from: com.hellogroup.mk.fdt.globalevent.FDTEventManager$1 */
    class C36101 extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ FDTEventManager f12556a;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Event event = (Event) intent.getParcelableExtra("global_fdt_event");
            if (event != null) {
                if (event.dsts == null) {
                    Iterator it = this.f12556a.f12554a.entrySet().iterator();
                    while (it.hasNext()) {
                        List list = (List) ((Map.Entry) it.next()).getValue();
                        if (list != null) {
                            Iterator it2 = new ArrayList(list).iterator();
                            while (it2.hasNext()) {
                                ((InterfaceC3612a) it2.next()).mo18037a(event);
                            }
                        }
                    }
                    return;
                }
                for (String str : event.dsts) {
                    List list2 = (List) this.f12556a.f12554a.get(str);
                    if (list2 != null) {
                        Iterator it3 = new ArrayList(list2).iterator();
                        while (it3.hasNext()) {
                            ((InterfaceC3612a) it3.next()).mo18037a(event);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.fdt.globalevent.FDTEventManager$a */
    public interface InterfaceC3612a {
        /* JADX INFO: renamed from: a */
        void mo18037a(Event event);
    }

    private FDTEventManager() {
    }

    /* JADX INFO: renamed from: b */
    public static FDTEventManager m18525b() {
        if (f12553c == null) {
            synchronized (FDTEventManager.class) {
                try {
                    if (f12553c == null) {
                        f12553c = new FDTEventManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12553c;
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m18526c(@NonNull InterfaceC3612a interfaceC3612a, @NonNull String str) {
        try {
            List<InterfaceC3612a> linkedList = this.f12554a.get(str);
            if (linkedList == null) {
                linkedList = new LinkedList<>();
                this.f12554a.put(str, linkedList);
            }
            if (!linkedList.contains(interfaceC3612a)) {
                linkedList.add(interfaceC3612a);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m18527d(@NonNull Event event) {
        event.m18532b();
        Intent intent = new Intent("com.immomo.momo.globalevent.ACTION_FDT_GLOBAL_EVENT");
        intent.putExtra("global_fdt_event", event);
        rf3.m181165c(this.f12555b, intent);
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m18528e(@NonNull InterfaceC3612a interfaceC3612a, @NonNull String str) {
        List<InterfaceC3612a> list = this.f12554a.get(str);
        if (list != null) {
            list.remove(interfaceC3612a);
            if (list.isEmpty()) {
                this.f12554a.remove(str);
            }
        }
    }

    public static class Event implements Parcelable {
        public static final Parcelable.Creator<Event> CREATOR = new C3611a();
        private String[] dsts;
        private Map<String, Object> msg;
        private String name;
        private String src;

        /* JADX INFO: renamed from: com.hellogroup.mk.fdt.globalevent.FDTEventManager$Event$a */
        public class C3611a implements Parcelable.Creator<Event> {
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
        private String m18530d() {
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

        /* JADX INFO: renamed from: e */
        private JSONObject m18531e() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("event_name", this.name);
                jSONObject.put("dst_l_evn", m18530d());
                jSONObject.put("l_evn", this.src);
                jSONObject.put("event_msg", new JSONObject(new Gson().toJson(this.msg)));
                return jSONObject;
            } catch (JSONException e) {
                jzv.m147730c("MKEventManager", "", e);
                return jSONObject;
            }
        }

        /* JADX INFO: renamed from: b */
        public void m18532b() {
            String[] strArr;
            if (TextUtils.isEmpty(this.name) || (strArr = this.dsts) == null || strArr.length == 0) {
                wg3.m206174a("name dsts src cannot be empty!");
            }
        }

        /* JADX INFO: renamed from: c */
        public Event m18533c(@NonNull String... strArr) {
            this.dsts = strArr;
            return this;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: f */
        public String m18534f() {
            return this.src;
        }

        public String toString() {
            return m18531e().toString();
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
