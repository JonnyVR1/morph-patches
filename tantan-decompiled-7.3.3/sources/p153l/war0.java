package p153l;

import com.google.android.gms.common.api.Api;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class war0 extends gcr0 {

    /* JADX INFO: renamed from: a */
    public Object[] f188161a = new Object[4];

    /* JADX INFO: renamed from: b */
    public int f188162b = 0;

    /* JADX INFO: renamed from: c */
    public boolean f188163c;

    public war0(int i) {
    }

    /* JADX INFO: renamed from: a */
    public final war0 m205671a(Object obj) {
        obj.getClass();
        int i = this.f188162b;
        int i2 = i + 1;
        Object[] objArr = this.f188161a;
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
            this.f188161a = Arrays.copyOf(objArr, i3);
            this.f188163c = false;
        } else if (this.f188163c) {
            this.f188161a = (Object[]) objArr.clone();
            this.f188163c = false;
        }
        Object[] objArr2 = this.f188161a;
        int i4 = this.f188162b;
        this.f188162b = i4 + 1;
        objArr2[i4] = obj;
        return this;
    }
}
