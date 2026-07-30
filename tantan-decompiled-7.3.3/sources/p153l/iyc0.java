package p153l;

import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.bean.LrcWrapperBean;

/* JADX INFO: loaded from: classes10.dex */
public class iyc0 implements hyc0 {

    /* JADX INFO: renamed from: a */
    public final String f117537a;

    /* JADX INFO: renamed from: b */
    public final int f117538b;

    public iyc0(String str, int i) {
        this.f117537a = str;
        this.f117538b = i;
    }

    @Override // p153l.hyc0
    /* JADX INFO: renamed from: a */
    public String mo137716a() {
        int i = this.f117538b;
        if (i != 1) {
            return i != 2 ? "Static" : "Online";
        }
        return LrcWrapperBean.LrcWrapperType.LrcWrapperType_Default;
    }

    @Override // p153l.hyc0
    public String asString() {
        if (this.f117538b == 0) {
            return "";
        }
        m142618b();
        return this.f117537a;
    }

    /* JADX INFO: renamed from: b */
    public final void m142618b() {
        if (this.f117537a != null) {
            return;
        }
        wg3.m206174a("Value is null, and cannot be converted to the desired type.");
    }
}
