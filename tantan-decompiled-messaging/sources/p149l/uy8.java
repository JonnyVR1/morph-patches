package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.ChatGroupMember;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes9.dex */
public class uy8 extends ax6 {

    /* JADX INFO: renamed from: R */
    public ConcurrentHashMap<String, String> f178833R;

    /* JADX INFO: renamed from: S */
    public List<String> f178834S;

    /* JADX INFO: renamed from: T */
    public Runnable f178835T;

    /* JADX INFO: renamed from: l.uy8$a */
    public class RunnableC20539a implements Runnable {
        public RunnableC20539a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (vwb.m200296J(uy8.this.f178834S)) {
                return;
            }
            uy8 uy8Var = uy8.this;
            uy8Var.m196252k3(uy8Var.f178834S);
            uy8.this.f178834S.clear();
        }
    }

    public uy8(C4732c c4732c) {
        super(c4732c);
        this.f178835T = new RunnableC20539a();
        this.f178833R = new ConcurrentHashMap<>();
        this.f178834S = Collections.synchronizedList(new ArrayList());
    }

    /* JADX INFO: renamed from: f3 */
    public static /* synthetic */ void m196247f3() {
    }

    /* JADX INFO: renamed from: k3 */
    public final void m196252k3(List<String> list) {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next());
        }
        final ArrayList arrayList = new ArrayList(list);
        this.f72126Q.scheduled(stringBuffer.toString(), 0, new v9j() { // from class: l.my8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f136267a.m196259r3(arrayList);
            }
        }, false);
    }

    /* JADX INFO: renamed from: l3 */
    public synchronized void m196253l3(String str) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.equals("0", str)) {
                if (!this.f178833R.contains(str)) {
                    this.f178833R.put(str, str);
                    this.f178834S.add(str);
                    if (this.f178834S.size() == 1) {
                        e51.m114743H(CoreModule.f17544b, this.f178835T, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
                    } else if (this.f178834S.size() >= 40) {
                        m196252k3(this.f178834S);
                        e51.m114745J(this.f178835T);
                        this.f178834S.clear();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: m3 */
    public void m196254m3(Envelope envelope) {
        if (ura.m195053e().m195057d().mo33676E()) {
            HashMap map = new HashMap();
            if (!vwb.m200296J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
                for (User user : ((CommonData) envelope.getModuleData(CommonData.class)).users) {
                    if (user != null) {
                        String str = user.f56011id;
                        map.put(str, str);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).messages)) {
                for (Message message : ((CoreData) envelope.getModuleData(CoreData.class)).messages) {
                    if (message != null && TEnum.equals(message.channel, "group") && !map.containsKey(message.owner)) {
                        arrayList.add(message.owner);
                    }
                }
            }
            if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).chatGroupMembers)) {
                for (ChatGroupMember chatGroupMember : ((CoreData) envelope.getModuleData(CoreData.class)).chatGroupMembers) {
                    if (chatGroupMember != null && !map.containsKey(chatGroupMember.userId)) {
                        arrayList.add(chatGroupMember.userId);
                    }
                }
            }
            m196255n3(arrayList);
        }
    }

    /* JADX INFO: renamed from: n3 */
    public void m196255n3(List<String> list) {
        if (vwb.m200296J(list) || this.f178833R == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!this.f178833R.contains(str)) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m196253l3((String) it.next());
        }
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ void m196256o3(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, new d30() { // from class: l.ty8
            @Override // p149l.d30
            public final void call() {
                uy8.m196247f3();
            }
        });
    }

    /* JADX INFO: renamed from: p3 */
    public final /* synthetic */ void m196257p3(List list, Throwable th) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f178833R.remove((String) it.next());
        }
    }

    /* JADX INFO: renamed from: q3 */
    public final /* synthetic */ C22306c m196258q3(final List list) {
        if (vwb.m200296J(list)) {
            return C22306c.just(roj0.f160388a);
        }
        final String strM31200G = C4728a.m31200G("/simplified-users?ids=" + TextUtils.join(Constants.SEPARATOR_COMMA, list));
        return ia20.m135121e(new v9j() { // from class: l.py8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(strM31200G).m185887f().m185883b();
            }
        }).doOnNext(new e30() { // from class: l.qy8
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f156908a.m196256o3((Envelope) obj);
            }
        }).doOnError(new e30() { // from class: l.ry8
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161544a.m196257p3(list, (Throwable) obj);
            }
        }).map(new w9j() { // from class: l.sy8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ C22306c m196259r3(List list) {
        return C22306c.from(list).observeOn(Schedulers.m221493io()).filter(new w9j() { // from class: l.ny8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(CoreModule.f17545c.f19639e0.m169433Q9((String) obj) == null);
            }
        }).toList().flatMap(new w9j() { // from class: l.oy8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f146295a.m196258q3((List) obj);
            }
        });
    }
}
