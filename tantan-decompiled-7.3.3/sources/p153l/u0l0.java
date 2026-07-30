package p153l;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class u0l0 {

    /* JADX INFO: renamed from: b */
    private static final Object f176913b = new Object();

    /* JADX INFO: renamed from: a */
    private ArrayList<s0l0> f176914a = new ArrayList<>();

    /* JADX INFO: renamed from: a */
    public s0l0 m193843a() {
        s0l0 s0l0VarRemove;
        synchronized (f176913b) {
            s0l0VarRemove = null;
            try {
                if (!this.f176914a.isEmpty()) {
                    s0l0VarRemove = this.f176914a.remove(0);
                }
            } catch (Exception unused) {
            }
        }
        return s0l0VarRemove;
    }

    /* JADX INFO: renamed from: b */
    public void m193844b(List<s0l0> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        synchronized (f176913b) {
            try {
                try {
                    int size = this.f176914a.size();
                    int size2 = list.size() + size;
                    if (size2 > 50) {
                        ArrayList<s0l0> arrayList = new ArrayList<>();
                        int i = size2 - 40;
                        if (i >= size) {
                            for (int iMax = Math.max(0, list.size() - 40); iMax < list.size(); iMax++) {
                                arrayList.add(list.get(iMax));
                            }
                        } else {
                            while (i < size) {
                                arrayList.add(this.f176914a.get(i));
                                i++;
                            }
                            arrayList.addAll(list);
                        }
                        this.f176914a = arrayList;
                    } else {
                        this.f176914a.addAll(list);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m193845c(s0l0 s0l0Var) {
        synchronized (f176913b) {
            try {
                try {
                    int size = this.f176914a.size();
                    if (size > 50) {
                        ArrayList<s0l0> arrayList = new ArrayList<>();
                        for (int i = 10; i < size; i++) {
                            arrayList.add(this.f176914a.get(i));
                        }
                        arrayList.add(s0l0Var);
                        this.f176914a = arrayList;
                    } else {
                        this.f176914a.add(s0l0Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Exception unused) {
            }
        }
    }
}
