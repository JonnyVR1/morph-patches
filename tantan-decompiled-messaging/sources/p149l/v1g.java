package p149l;

import android.graphics.Color;
import com.p046p1.mobile.putong.core.data.Message;

/* JADX INFO: loaded from: classes11.dex */
public class v1g implements j4m {

    /* JADX INFO: renamed from: b */
    public static final j4m f179231b = new v1g();

    /* JADX INFO: renamed from: d */
    public static j4m m196548d() {
        return f179231b;
    }

    @Override // p149l.j4m
    /* JADX INFO: renamed from: a */
    public boolean mo94463a(pi6 pi6Var, Message message) {
        return rd6.m178878o(pi6Var.f149101a);
    }

    @Override // p149l.j4m
    /* JADX INFO: renamed from: b */
    public CharSequence mo94464b(pi6 pi6Var, Message message) {
        int color = pi6Var.f149124x.getResources().getColor(w0c0.f183773I);
        if (upa.m194847z()) {
            color = Color.parseColor("#FF700A");
        }
        StringBuilder sb = new StringBuilder("解锁");
        sb.append(pi6Var.f149102b.isFemale() ? "她" : "他");
        sb.append("的消息");
        return zz6.m221002s0(sb.toString(), color);
    }
}
