package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.medialog.util.LimitedQueue;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class hgb0 {

    /* JADX INFO: renamed from: a */
    public LimitedQueue<Integer> f107587a;

    /* JADX INFO: renamed from: b */
    public int[] f107588b;

    /* JADX INFO: renamed from: c */
    private int f107589c;

    public hgb0(int i) {
        i = i <= 0 ? 5 : i;
        this.f107587a = new LimitedQueue<>(i);
        this.f107588b = new int[i];
        this.f107589c = 0;
    }

    /* JADX INFO: renamed from: b */
    private String m130810b(Object... objArr) {
        StringBuilder sb = new StringBuilder("(");
        if (objArr != null) {
            for (int i = 0; i < objArr.length; i++) {
                if (i != 0) {
                    sb.append(Constants.SEPARATOR_COMMA);
                }
                sb.append(objArr[i]);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public String m130811a() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Integer> it = this.f107587a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (i != 0) {
                sb.append(Constants.SEPARATOR_COMMA);
            }
            sb.append(m130810b(it.next()));
            i++;
        }
        sb.append(Constants.AES_SUFFIX);
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public void m130812c(int i, int i2) {
        if (this.f107589c >= this.f107588b.length) {
            this.f107589c = 0;
        }
        this.f107587a.add(Integer.valueOf(i));
        int[] iArr = this.f107588b;
        int i3 = this.f107589c;
        iArr[i3] = i2;
        this.f107589c = i3 + 1;
    }
}
