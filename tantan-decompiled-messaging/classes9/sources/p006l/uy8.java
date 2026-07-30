package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.ChatGroupMember;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import l.d30;
import l.e30;
import l.e51;
import l.roj0;
import l.v9j;
import l.vwb;
import l.w9j;
import rx.c;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class uy8 extends ax6 {

    /* JADX INFO: renamed from: R */
    public ConcurrentHashMap<String, String> f23803R;

    /* JADX INFO: renamed from: S */
    public List<String> f23804S;

    /* JADX INFO: renamed from: T */
    public Runnable f23805T;

    /* JADX INFO: renamed from: l.uy8$a */
    public class RunnableC1358a implements Runnable {
        public RunnableC1358a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (vwb.J(uy8.this.f23804S)) {
                return;
            }
            uy8 uy8Var = uy8.this;
            uy8Var.m25598k3(uy8Var.f23804S);
            uy8.this.f23804S.clear();
        }
    }

    public uy8(C0158c c0158c) {
        super(c0158c);
        this.f23805T = new RunnableC1358a();
        this.f23803R = new ConcurrentHashMap<>();
        this.f23804S = Collections.synchronizedList(new ArrayList());
    }

    /* JADX INFO: renamed from: f3 */
    public static /* synthetic */ void m25593f3() {
    }

    /* JADX INFO: renamed from: k3 */
    public final void m25598k3(List<String> list) {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next());
        }
        final ArrayList arrayList = new ArrayList(list);
        this.f8580Q.scheduled(stringBuffer.toString(), 0, new v9j() { // from class: l.my8
            public final Object call() {
                return this.f17365a.m25605r3(arrayList);
            }
        }, false);
    }

    /* JADX INFO: renamed from: l3 */
    public synchronized void m25599l3(String str) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.equals("0", str)) {
                if (!this.f23803R.contains(str)) {
                    this.f23803R.put(str, str);
                    this.f23804S.add(str);
                    if (this.f23804S.size() == 1) {
                        e51.H(CoreModule.f1533b, this.f23805T, 5000L);
                    } else if (this.f23804S.size() >= 40) {
                        m25598k3(this.f23804S);
                        e51.J(this.f23805T);
                        this.f23804S.clear();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: m3 */
    public void m25600m3(Envelope envelope) {
        if (ura.m25555e().m25559d().m5613E()) {
            HashMap map = new HashMap();
            if (!vwb.J(envelope.getModuleData(CommonData.class).users)) {
                for (User user : envelope.getModuleData(CommonData.class).users) {
                    if (user != null) {
                        String str = ((DbObject) user).id;
                        map.put(str, str);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            if (!vwb.J(envelope.getModuleData(CoreData.class).messages)) {
                for (Message message : envelope.getModuleData(CoreData.class).messages) {
                    if (message != null && TEnum.equals(message.channel, "group") && !map.containsKey(message.owner)) {
                        arrayList.add(message.owner);
                    }
                }
            }
            if (!vwb.J(envelope.getModuleData(CoreData.class).chatGroupMembers)) {
                for (ChatGroupMember chatGroupMember : envelope.getModuleData(CoreData.class).chatGroupMembers) {
                    if (chatGroupMember != null && !map.containsKey(chatGroupMember.userId)) {
                        arrayList.add(chatGroupMember.userId);
                    }
                }
            }
            m25601n3(arrayList);
        }
    }

    /* JADX INFO: renamed from: n3 */
    public void m25601n3(List<String> list) {
        if (vwb.J(list) || this.f23803R == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!this.f23803R.contains(str)) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m25599l3((String) it.next());
        }
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ void m25602o3(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, new d30() { // from class: l.ty8
            public final void call() {
                uy8.m25593f3();
            }
        });
    }

    /* JADX INFO: renamed from: p3 */
    public final /* synthetic */ void m25603p3(List list, Throwable th) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f23803R.remove((String) it.next());
        }
    }

    /* JADX INFO: renamed from: q3 */
    public final /* synthetic */ c m25604q3(final List list) {
        if (vwb.J(list)) {
            return c.just(roj0.a);
        }
        final String strM3130G = C0154a.m3130G("/simplified-users?ids=" + TextUtils.join(",", list));
        return ia20.m16571e(new v9j() { // from class: l.py8
            public final Object call() {
                return C0154a.f3483P.auth().q(strM3130G).f().b();
            }
        }).doOnNext(new e30() { // from class: l.qy8
            public final void call(Object obj) {
                this.f20154a.m25602o3((Envelope) obj);
            }
        }).doOnError(new e30() { // from class: l.ry8
            public final void call(Object obj) {
                this.f20910a.m25603p3(list, (Throwable) obj);
            }
        }).map(new w9j() { // from class: l.sy8
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ c m25605r3(List list) {
        return c.from(list).observeOn(Schedulers.io()).filter(new w9j() { // from class: l.ny8
            public final Object call(Object obj) {
                return Boolean.valueOf(CoreModule.f1534c.f3628e0.m21396Q9((String) obj) == null);
            }
        }).toList().flatMap(new w9j() { // from class: l.oy8
            public final Object call(Object obj) {
                return this.f18489a.m25604q3((List) obj);
            }
        });
    }
}
