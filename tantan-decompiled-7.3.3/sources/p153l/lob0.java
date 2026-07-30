package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.medialog.util.LimitedQueue;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class lob0 {

    /* JADX INFO: renamed from: a */
    public LimitedQueue<Integer> f132890a;

    /* JADX INFO: renamed from: b */
    public int[] f132891b;

    /* JADX INFO: renamed from: c */
    private int f132892c;

    public lob0(int i) {
        i = i <= 0 ? 5 : i;
        this.f132890a = new LimitedQueue<>(i);
        this.f132891b = new int[i];
        this.f132892c = 0;
    }

    /* JADX INFO: renamed from: b */
    private String m155043b(Object... objArr) {
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
    public String m155044a() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Integer> it = this.f132890a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (i != 0) {
                sb.append(Constants.SEPARATOR_COMMA);
            }
            sb.append(m155043b(it.next()));
            i++;
        }
        sb.append(Constants.AES_SUFFIX);
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public void m155045c(int i, int i2) {
        if (this.f132892c >= this.f132891b.length) {
            this.f132892c = 0;
        }
        this.f132890a.add(Integer.valueOf(i));
        int[] iArr = this.f132891b;
        int i3 = this.f132892c;
        iArr[i3] = i2;
        this.f132892c = i3 + 1;
    }
}
