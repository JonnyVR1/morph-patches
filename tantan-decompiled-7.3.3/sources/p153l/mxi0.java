package p153l;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mxi0 {

    /* JADX INFO: renamed from: a */
    public String f139252a;

    /* JADX INFO: renamed from: b */
    public List<sxi0> f139253b = new LinkedList();

    public mxi0(String str) {
        this.f139252a = str;
    }

    /* JADX INFO: renamed from: a */
    public int m160680a() {
        return this.f139253b.size();
    }

    public boolean equals(Object obj) {
        if (obj instanceof sxi0) {
            return this.f139252a.equals(((sxi0) obj).f171140a);
        }
        return false;
    }

    public int hashCode() {
        return this.f139252a.hashCode();
    }

    public String toString() {
        return this.f139252a + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f139253b + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + m160680a();
    }
}
