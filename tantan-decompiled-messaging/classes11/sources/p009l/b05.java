package p009l;

import android.os.Bundle;
import android.text.TextUtils;
import com.mm.mmfile.Nullable;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatPartnersHistoryItem;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class b05 extends jq2<e05> {

    /* JADX INFO: renamed from: a */
    public List<ChatPartnersHistoryItem> f9779a;

    /* JADX INFO: renamed from: b */
    public Map<String, User> f9780b;

    /* JADX INFO: renamed from: c */
    public String f9781c;

    public b05(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ User m11796g0(User user) {
        return user;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m11798i0(Bundle bundle) {
        ((e05) ((jq2) this).viewModel).m13538r();
    }

    /* JADX INFO: renamed from: k0 */
    private void m11799k0(String str) {
        act().duringCreated(CoreModule.c.e0.k7(str)).take(1).subscribe(mkd0.G(new e30() { // from class: l.yz4
            public final void call(Object obj) {
                this.f23296a.m11802j0((Envelope) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z */
    public void m11800Z() {
        super.Z();
        creates(new e30() { // from class: l.xz4
            public final void call(Object obj) {
                this.f22817a.m11798i0((Bundle) obj);
            }
        });
        m11799k0("");
    }

    /* JADX INFO: renamed from: b */
    public void m11801b() {
        if (TextUtils.isEmpty(this.f9781c)) {
            return;
        }
        m11799k0(this.f9781c);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m11802j0(Envelope envelope) {
        if (envelope.meta.code == 200) {
            CoreData moduleData = envelope.data.getModuleData(CoreData.class);
            CommonData moduleData2 = envelope.data.getModuleData(CommonData.class);
            if (NullChecker.a(moduleData) && NullChecker.a(moduleData2)) {
                if (this.f9779a == null) {
                    this.f9779a = new ArrayList();
                }
                if (this.f9780b == null) {
                    this.f9780b = new HashMap();
                }
                this.f9779a.addAll(moduleData.chatPartnersSignals);
                this.f9780b.putAll(vwb.d(moduleData2.users, new w9j() { // from class: l.zz4
                    public final Object call(Object obj) {
                        return ((DbObject) ((User) obj)).id;
                    }
                }, new w9j() { // from class: l.a05
                    public final Object call(Object obj) {
                        return b05.m11796g0((User) obj);
                    }
                }));
                ((e05) ((jq2) this).viewModel).m13536f(this.f9779a);
            }
            this.f9781c = envelope.pagination.links.next;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: l0 */
    public User m11803l0(String str) {
        Map<String, User> map = this.f9780b;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public void destroy() {
    }
}
