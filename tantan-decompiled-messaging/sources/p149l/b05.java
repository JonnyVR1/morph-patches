package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p041mm.mmfile.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatPartnersHistoryItem;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class b05 extends jq2<e05> {

    /* JADX INFO: renamed from: a */
    public List<ChatPartnersHistoryItem> f72406a;

    /* JADX INFO: renamed from: b */
    public Map<String, User> f72407b;

    /* JADX INFO: renamed from: c */
    public String f72408c;

    public b05(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ User m99736g0(User user) {
        return user;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m99738i0(Bundle bundle) {
        ((e05) this.viewModel).m114162r();
    }

    /* JADX INFO: renamed from: k0 */
    private void m99739k0(String str) {
        act().duringCreated(CoreModule.f17545c.f19639e0.m169505k7(str)).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.yz4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200847a.m99741j0((Envelope) obj);
            }
        }));
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        creates(new e30() { // from class: l.xz4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f195152a.m99738i0((Bundle) obj);
            }
        });
        m99739k0("");
    }

    /* JADX INFO: renamed from: b */
    public void m99740b() {
        if (TextUtils.isEmpty(this.f72408c)) {
            return;
        }
        m99739k0(this.f72408c);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m99741j0(Envelope envelope) {
        if (envelope.meta.code == 200) {
            CoreData coreData = (CoreData) envelope.data.getModuleData(CoreData.class);
            CommonData commonData = (CommonData) envelope.data.getModuleData(CommonData.class);
            if (NullChecker.m81303a(coreData) && NullChecker.m81303a(commonData)) {
                if (this.f72406a == null) {
                    this.f72406a = new ArrayList();
                }
                if (this.f72407b == null) {
                    this.f72407b = new HashMap();
                }
                this.f72406a.addAll(coreData.chatPartnersSignals);
                this.f72407b.putAll(vwb.m200319d(commonData.users, new w9j() { // from class: l.zz4
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((User) obj).f56011id;
                    }
                }, new w9j() { // from class: l.a05
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return b05.m99736g0((User) obj);
                    }
                }));
                ((e05) this.viewModel).m114161f(this.f72406a);
            }
            this.f72408c = envelope.pagination.links.next;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: l0 */
    public User m99742l0(String str) {
        Map<String, User> map = this.f72407b;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
