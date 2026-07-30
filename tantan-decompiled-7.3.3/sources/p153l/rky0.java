package p153l;

import com.google.android.gms.common.api.Api;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class rky0 extends eoy0 {

    /* JADX INFO: renamed from: a */
    public Object[] f163657a = new Object[4];

    /* JADX INFO: renamed from: b */
    public int f163658b = 0;

    /* JADX INFO: renamed from: c */
    public boolean f163659c;

    public rky0(int i) {
    }

    /* JADX INFO: renamed from: a */
    public final rky0 m181884a(Object obj) {
        obj.getClass();
        m181885b(this.f163658b + 1);
        Object[] objArr = this.f163657a;
        int i = this.f163658b;
        this.f163658b = i + 1;
        objArr[i] = obj;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m181885b(int i) {
        Object[] objArr = this.f163657a;
        int length = objArr.length;
        if (length >= i) {
            if (this.f163659c) {
                this.f163657a = (Object[]) objArr.clone();
                this.f163659c = false;
                return;
            }
            return;
        }
        int i2 = length + (length >> 1) + 1;
        if (i2 < i) {
            int iHighestOneBit = Integer.highestOneBit(i - 1);
            i2 = iHighestOneBit + iHighestOneBit;
        }
        if (i2 < 0) {
            i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        this.f163657a = Arrays.copyOf(objArr, i2);
        this.f163659c = false;
    }
}
