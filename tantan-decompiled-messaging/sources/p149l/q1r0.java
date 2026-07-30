package p149l;

import com.google.android.gms.common.api.Api;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class q1r0 extends a3r0 {

    /* JADX INFO: renamed from: a */
    public Object[] f152160a = new Object[4];

    /* JADX INFO: renamed from: b */
    public int f152161b = 0;

    /* JADX INFO: renamed from: c */
    public boolean f152162c;

    public q1r0(int i) {
    }

    /* JADX INFO: renamed from: a */
    public final q1r0 m172412a(Object obj) {
        obj.getClass();
        int i = this.f152161b;
        int i2 = i + 1;
        Object[] objArr = this.f152160a;
        int length = objArr.length;
        if (length < i2) {
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int iHighestOneBit = Integer.highestOneBit(i);
                i3 = iHighestOneBit + iHighestOneBit;
            }
            if (i3 < 0) {
                i3 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            this.f152160a = Arrays.copyOf(objArr, i3);
            this.f152162c = false;
        } else if (this.f152162c) {
            this.f152160a = (Object[]) objArr.clone();
            this.f152162c = false;
        }
        Object[] objArr2 = this.f152160a;
        int i4 = this.f152161b;
        this.f152161b = i4 + 1;
        objArr2[i4] = obj;
        return this;
    }
}
