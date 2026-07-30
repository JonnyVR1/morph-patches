package p149l;

import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.bean.LrcWrapperBean;

/* JADX INFO: loaded from: classes11.dex */
public class dqc0 implements cqc0 {

    /* JADX INFO: renamed from: a */
    public final String f87401a;

    /* JADX INFO: renamed from: b */
    public final int f87402b;

    public dqc0(String str, int i) {
        this.f87401a = str;
        this.f87402b = i;
    }

    @Override // p149l.cqc0
    /* JADX INFO: renamed from: a */
    public String mo108246a() {
        int i = this.f87402b;
        if (i != 1) {
            return i != 2 ? "Static" : "Online";
        }
        return LrcWrapperBean.LrcWrapperType.LrcWrapperType_Default;
    }

    @Override // p149l.cqc0
    public String asString() {
        if (this.f87402b == 0) {
            return "";
        }
        m112998b();
        return this.f87401a;
    }

    /* JADX INFO: renamed from: b */
    public final void m112998b() {
        if (this.f87401a != null) {
            return;
        }
        ig3.m135964a("Value is null, and cannot be converted to the desired type.");
    }
}
