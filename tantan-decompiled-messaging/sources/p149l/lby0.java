package p149l;

import com.google.android.gms.common.api.Api;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class lby0 extends yey0 {

    /* JADX INFO: renamed from: a */
    public Object[] f127353a = new Object[4];

    /* JADX INFO: renamed from: b */
    public int f127354b = 0;

    /* JADX INFO: renamed from: c */
    public boolean f127355c;

    public lby0(int i) {
    }

    /* JADX INFO: renamed from: a */
    public final lby0 m149270a(Object obj) {
        obj.getClass();
        m149271b(this.f127354b + 1);
        Object[] objArr = this.f127353a;
        int i = this.f127354b;
        this.f127354b = i + 1;
        objArr[i] = obj;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m149271b(int i) {
        Object[] objArr = this.f127353a;
        int length = objArr.length;
        if (length >= i) {
            if (this.f127355c) {
                this.f127353a = (Object[]) objArr.clone();
                this.f127355c = false;
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
        this.f127353a = Arrays.copyOf(objArr, i2);
        this.f127355c = false;
    }
}
