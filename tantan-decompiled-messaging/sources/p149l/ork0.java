package p149l;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ork0 {

    /* JADX INFO: renamed from: b */
    private static final Object f145335b = new Object();

    /* JADX INFO: renamed from: a */
    private ArrayList<mrk0> f145336a = new ArrayList<>();

    /* JADX INFO: renamed from: a */
    public mrk0 m165674a() {
        mrk0 mrk0VarRemove;
        synchronized (f145335b) {
            mrk0VarRemove = null;
            try {
                if (!this.f145336a.isEmpty()) {
                    mrk0VarRemove = this.f145336a.remove(0);
                }
            } catch (Exception unused) {
            }
        }
        return mrk0VarRemove;
    }

    /* JADX INFO: renamed from: b */
    public void m165675b(List<mrk0> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        synchronized (f145335b) {
            try {
                try {
                    int size = this.f145336a.size();
                    int size2 = list.size() + size;
                    if (size2 > 50) {
                        ArrayList<mrk0> arrayList = new ArrayList<>();
                        int i = size2 - 40;
                        if (i >= size) {
                            for (int iMax = Math.max(0, list.size() - 40); iMax < list.size(); iMax++) {
                                arrayList.add(list.get(iMax));
                            }
                        } else {
                            while (i < size) {
                                arrayList.add(this.f145336a.get(i));
                                i++;
                            }
                            arrayList.addAll(list);
                        }
                        this.f145336a = arrayList;
                    } else {
                        this.f145336a.addAll(list);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m165676c(mrk0 mrk0Var) {
        synchronized (f145335b) {
            try {
                try {
                    int size = this.f145336a.size();
                    if (size > 50) {
                        ArrayList<mrk0> arrayList = new ArrayList<>();
                        for (int i = 10; i < size; i++) {
                            arrayList.add(this.f145336a.get(i));
                        }
                        arrayList.add(mrk0Var);
                        this.f145336a = arrayList;
                    } else {
                        this.f145336a.add(mrk0Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Exception unused) {
            }
        }
    }
}
