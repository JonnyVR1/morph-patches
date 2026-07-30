package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046mm.mmfile.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatPartnersHistoryItem;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class a15 extends ar2<d15> {

    /* JADX INFO: renamed from: a */
    public List<ChatPartnersHistoryItem> f67779a;

    /* JADX INFO: renamed from: b */
    public Map<String, User> f67780b;

    /* JADX INFO: renamed from: c */
    public String f67781c;

    public a15(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ User m95443g0(User user) {
        return user;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m95445i0(Bundle bundle) {
        ((d15) this.viewModel).m113498r();
    }

    /* JADX INFO: renamed from: k0 */
    private void m95446k0(String str) {
        act().duringCreated(CoreModule.f18264c.f20381e0.m116578k7(str)).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.x05
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191867a.m95448j0((Envelope) obj);
            }
        }));
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        creates(new y20() { // from class: l.w05
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186539a.m95445i0((Bundle) obj);
            }
        });
        m95446k0("");
    }

    /* JADX INFO: renamed from: b */
    public void m95447b() {
        if (TextUtils.isEmpty(this.f67781c)) {
            return;
        }
        m95446k0(this.f67781c);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m95448j0(Envelope envelope) {
        if (envelope.meta.code == 200) {
            CoreData coreData = (CoreData) envelope.data.getModuleData(CoreData.class);
            CommonData commonData = (CommonData) envelope.data.getModuleData(CommonData.class);
            if (NullChecker.m82486a(coreData) && NullChecker.m82486a(commonData)) {
                if (this.f67779a == null) {
                    this.f67779a = new ArrayList();
                }
                if (this.f67780b == null) {
                    this.f67780b = new HashMap();
                }
                this.f67779a.addAll(coreData.chatPartnersSignals);
                this.f67780b.putAll(jyb.m147502d(commonData.users, new qcj() { // from class: l.y05
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((User) obj).f56859id;
                    }
                }, new qcj() { // from class: l.z05
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return a15.m95443g0((User) obj);
                    }
                }));
                ((d15) this.viewModel).m113497f(this.f67779a);
            }
            this.f67781c = envelope.pagination.links.next;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: l0 */
    public User m95449l0(String str) {
        Map<String, User> map = this.f67780b;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
