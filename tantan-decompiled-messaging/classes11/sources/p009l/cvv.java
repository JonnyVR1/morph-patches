package p009l;

import com.google.common.base.Optional;
import com.p1.mobile.putong.data.User;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class cvv {

    /* JADX INFO: renamed from: a */
    public Map<String, InterfaceC0828b<Object>> f10785a = new HashMap();

    /* JADX INFO: renamed from: b */
    public Map<String, InterfaceC0827a<Object>> f10786b = new HashMap();

    /* JADX INFO: renamed from: l.cvv$a */
    public interface InterfaceC0827a<T> {
        /* JADX INFO: renamed from: a */
        T mo12473a(User user);
    }

    /* JADX INFO: renamed from: l.cvv$b */
    public interface InterfaceC0828b<T> {
        T execute();
    }

    /* JADX INFO: renamed from: l.cvv$c */
    public interface InterfaceC0829c {
        /* JADX INFO: renamed from: a */
        void mo11314a(Map<String, InterfaceC0828b<Object>> map);

        /* JADX INFO: renamed from: b */
        void mo11315b(Map<String, InterfaceC0827a<Object>> map);
    }

    /* JADX INFO: renamed from: a */
    public Optional<Object> m12852a(String str) {
        if (!str.contains(".")) {
            return !this.f10785a.containsKey(str) ? Optional.absent() : Optional.of(this.f10785a.get(str).execute());
        }
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length < 2 || !this.f10785a.containsKey(strArrSplit[0])) {
            return Optional.absent();
        }
        Object objExecute = this.f10785a.get(strArrSplit[0]).execute();
        return ((objExecute instanceof User) && this.f10786b.containsKey(strArrSplit[1])) ? Optional.of(this.f10786b.get(strArrSplit[1]).mo12473a((User) objExecute)) : Optional.absent();
    }

    /* JADX INFO: renamed from: b */
    public String m12853b(String str) {
        Optional<Object> optionalM12852a = m12852a(str);
        return optionalM12852a.isPresent() ? optionalM12852a.get().toString() : "";
    }

    /* JADX INFO: renamed from: c */
    public void m12854c(List<InterfaceC0829c> list) {
        for (InterfaceC0829c interfaceC0829c : list) {
            interfaceC0829c.mo11314a(this.f10785a);
            interfaceC0829c.mo11315b(this.f10786b);
        }
    }
}
