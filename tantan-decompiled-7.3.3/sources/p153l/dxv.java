package p153l;

import com.google.common.base.Optional;
import com.p051p1.mobile.putong.data.User;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class dxv {

    /* JADX INFO: renamed from: a */
    public Map<String, InterfaceC16647b<Object>> f91115a = new HashMap();

    /* JADX INFO: renamed from: b */
    public Map<String, InterfaceC16646a<Object>> f91116b = new HashMap();

    /* JADX INFO: renamed from: l.dxv$a */
    public interface InterfaceC16646a<T> {
        /* JADX INFO: renamed from: a */
        T mo98573a(User user);
    }

    /* JADX INFO: renamed from: l.dxv$b */
    public interface InterfaceC16647b<T> {
        T execute();
    }

    /* JADX INFO: renamed from: l.dxv$c */
    public interface InterfaceC16648c {
        /* JADX INFO: renamed from: a */
        void mo110417a(Map<String, InterfaceC16647b<Object>> map);

        /* JADX INFO: renamed from: b */
        void mo110418b(Map<String, InterfaceC16646a<Object>> map);
    }

    /* JADX INFO: renamed from: a */
    public Optional<Object> m118572a(String str) {
        if (!str.contains(".")) {
            return !this.f91115a.containsKey(str) ? Optional.absent() : Optional.m15467of(this.f91115a.get(str).execute());
        }
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length < 2 || !this.f91115a.containsKey(strArrSplit[0])) {
            return Optional.absent();
        }
        Object objExecute = this.f91115a.get(strArrSplit[0]).execute();
        return ((objExecute instanceof User) && this.f91116b.containsKey(strArrSplit[1])) ? Optional.m15467of(this.f91116b.get(strArrSplit[1]).mo98573a((User) objExecute)) : Optional.absent();
    }

    /* JADX INFO: renamed from: b */
    public String m118573b(String str) {
        Optional<Object> optionalM118572a = m118572a(str);
        return optionalM118572a.isPresent() ? optionalM118572a.get().toString() : "";
    }

    /* JADX INFO: renamed from: c */
    public void m118574c(List<InterfaceC16648c> list) {
        for (InterfaceC16648c interfaceC16648c : list) {
            interfaceC16648c.mo110417a(this.f91115a);
            interfaceC16648c.mo110418b(this.f91116b);
        }
    }
}
