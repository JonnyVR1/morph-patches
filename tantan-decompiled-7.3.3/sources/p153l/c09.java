package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.ChatGroupMember;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes9.dex */
public class c09 extends dy6 {

    /* JADX INFO: renamed from: R */
    public ConcurrentHashMap<String, String> f79234R;

    /* JADX INFO: renamed from: S */
    public List<String> f79235S;

    /* JADX INFO: renamed from: T */
    public Runnable f79236T;

    /* JADX INFO: renamed from: l.c09$a */
    public class RunnableC16155a implements Runnable {
        public RunnableC16155a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (jyb.m147479J(c09.this.f79235S)) {
                return;
            }
            c09 c09Var = c09.this;
            c09Var.m107382k3(c09Var.f79235S);
            c09.this.f79235S.clear();
        }
    }

    public c09(C4883c c4883c) {
        super(c4883c);
        this.f79236T = new RunnableC16155a();
        this.f79234R = new ConcurrentHashMap<>();
        this.f79235S = Collections.synchronizedList(new ArrayList());
    }

    /* JADX INFO: renamed from: f3 */
    public static /* synthetic */ void m107377f3() {
    }

    /* JADX INFO: renamed from: k3 */
    public final void m107382k3(List<String> list) {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next());
        }
        final ArrayList arrayList = new ArrayList(list);
        this.f91137Q.scheduled(stringBuffer.toString(), 0, new pcj() { // from class: l.uz8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f181709a.m107389r3(arrayList);
            }
        }, false);
    }

    /* JADX INFO: renamed from: l3 */
    public synchronized void m107383l3(String str) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.equals("0", str)) {
                if (!this.f79234R.contains(str)) {
                    this.f79234R.put(str, str);
                    this.f79235S.add(str);
                    if (this.f79235S.size() == 1) {
                        l51.m152888H(CoreModule.f18263b, this.f79236T, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
                    } else if (this.f79235S.size() >= 40) {
                        m107382k3(this.f79235S);
                        l51.m152890J(this.f79236T);
                        this.f79235S.clear();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: m3 */
    public void m107384m3(Envelope envelope) {
        if (gta.m132210e().m132214d().mo34679E()) {
            HashMap map = new HashMap();
            if (!jyb.m147479J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
                for (User user : ((CommonData) envelope.getModuleData(CommonData.class)).users) {
                    if (user != null) {
                        String str = user.f56859id;
                        map.put(str, str);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).messages)) {
                for (Message message : ((CoreData) envelope.getModuleData(CoreData.class)).messages) {
                    if (message != null && TEnum.equals(message.channel, "group") && !map.containsKey(message.owner)) {
                        arrayList.add(message.owner);
                    }
                }
            }
            if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).chatGroupMembers)) {
                for (ChatGroupMember chatGroupMember : ((CoreData) envelope.getModuleData(CoreData.class)).chatGroupMembers) {
                    if (chatGroupMember != null && !map.containsKey(chatGroupMember.userId)) {
                        arrayList.add(chatGroupMember.userId);
                    }
                }
            }
            m107385n3(arrayList);
        }
    }

    /* JADX INFO: renamed from: n3 */
    public void m107385n3(List<String> list) {
        if (jyb.m147479J(list) || this.f79234R == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!this.f79234R.contains(str)) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m107383l3((String) it.next());
        }
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ void m107386o3(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, new x20() { // from class: l.b09
            @Override // p153l.x20
            public final void call() {
                c09.m107377f3();
            }
        });
    }

    /* JADX INFO: renamed from: p3 */
    public final /* synthetic */ void m107387p3(List list, Throwable th) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f79234R.remove((String) it.next());
        }
    }

    /* JADX INFO: renamed from: q3 */
    public final /* synthetic */ C22421c m107388q3(final List list) {
        if (jyb.m147479J(list)) {
            return C22421c.just(uxj0.f181467a);
        }
        final String strM32203G = C4879a.m32203G("/simplified-users?ids=" + TextUtils.join(Constants.SEPARATOR_COMMA, list));
        return qi20.m176658e(new pcj() { // from class: l.xz8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(strM32203G).m209032f().m209028b();
            }
        }).doOnNext(new y20() { // from class: l.yz8
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f202177a.m107386o3((Envelope) obj);
            }
        }).doOnError(new y20() { // from class: l.zz8
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f206681a.m107387p3(list, (Throwable) obj);
            }
        }).map(new qcj() { // from class: l.a09
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ C22421c m107389r3(List list) {
        return C22421c.from(list).observeOn(Schedulers.m222739io()).filter(new qcj() { // from class: l.vz8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(CoreModule.f18264c.f20381e0.m116506Q9((String) obj) == null);
            }
        }).toList().flatMap(new qcj() { // from class: l.wz8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f191734a.m107388q3((List) obj);
            }
        });
    }
}
