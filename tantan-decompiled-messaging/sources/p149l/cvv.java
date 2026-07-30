package p149l;

import com.google.common.base.Optional;
import com.p046p1.mobile.putong.data.User;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class cvv {

    /* JADX INFO: renamed from: a */
    public Map<String, InterfaceC16251b<Object>> f82688a = new HashMap();

    /* JADX INFO: renamed from: b */
    public Map<String, InterfaceC16250a<Object>> f82689b = new HashMap();

    /* JADX INFO: renamed from: l.cvv$a */
    public interface InterfaceC16250a<T> {
        /* JADX INFO: renamed from: a */
        T mo106017a(User user);
    }

    /* JADX INFO: renamed from: l.cvv$b */
    public interface InterfaceC16251b<T> {
        T execute();
    }

    /* JADX INFO: renamed from: l.cvv$c */
    public interface InterfaceC16252c {
        /* JADX INFO: renamed from: a */
        void mo95740a(Map<String, InterfaceC16251b<Object>> map);

        /* JADX INFO: renamed from: b */
        void mo95741b(Map<String, InterfaceC16250a<Object>> map);
    }

    /* JADX INFO: renamed from: a */
    public Optional<Object> m108955a(String str) {
        if (!str.contains(".")) {
            return !this.f82688a.containsKey(str) ? Optional.absent() : Optional.m15413of(this.f82688a.get(str).execute());
        }
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length < 2 || !this.f82688a.containsKey(strArrSplit[0])) {
            return Optional.absent();
        }
        Object objExecute = this.f82688a.get(strArrSplit[0]).execute();
        return ((objExecute instanceof User) && this.f82689b.containsKey(strArrSplit[1])) ? Optional.m15413of(this.f82689b.get(strArrSplit[1]).mo106017a((User) objExecute)) : Optional.absent();
    }

    /* JADX INFO: renamed from: b */
    public String m108956b(String str) {
        Optional<Object> optionalM108955a = m108955a(str);
        return optionalM108955a.isPresent() ? optionalM108955a.get().toString() : "";
    }

    /* JADX INFO: renamed from: c */
    public void m108957c(List<InterfaceC16252c> list) {
        for (InterfaceC16252c interfaceC16252c : list) {
            interfaceC16252c.mo95740a(this.f82688a);
            interfaceC16252c.mo95741b(this.f82689b);
        }
    }
}
