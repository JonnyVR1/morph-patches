package p149l;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class koi0 {

    /* JADX INFO: renamed from: a */
    public String f124024a;

    /* JADX INFO: renamed from: b */
    public List<qoi0> f124025b = new LinkedList();

    public koi0(String str) {
        this.f124024a = str;
    }

    /* JADX INFO: renamed from: a */
    public int m146715a() {
        return this.f124025b.size();
    }

    public boolean equals(Object obj) {
        if (obj instanceof qoi0) {
            return this.f124024a.equals(((qoi0) obj).f155582a);
        }
        return false;
    }

    public int hashCode() {
        return this.f124024a.hashCode();
    }

    public String toString() {
        return this.f124024a + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f124025b + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + m146715a();
    }
}
