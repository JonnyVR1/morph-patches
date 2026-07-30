package p009l;

import android.graphics.Color;
import com.p1.mobile.putong.core.data.Message;
import l.upa;
import l.w0c0;
import l.zz6;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class v1g implements j4m {

    /* JADX INFO: renamed from: b */
    public static final j4m f21413b = new v1g();

    /* JADX INFO: renamed from: d */
    public static j4m m23231d() {
        return f21413b;
    }

    @Override // p009l.j4m
    /* JADX INFO: renamed from: a */
    public boolean mo11180a(pi6 pi6Var, Message message) {
        return rd6.m21519o(pi6Var.f18622a);
    }

    @Override // p009l.j4m
    /* JADX INFO: renamed from: b */
    public CharSequence mo11181b(pi6 pi6Var, Message message) {
        int color = pi6Var.f18645x.getResources().getColor(w0c0.I);
        if (upa.z()) {
            color = Color.parseColor("#FF700A");
        }
        StringBuilder sb = new StringBuilder("解锁");
        sb.append(pi6Var.f18623b.isFemale() ? "她" : "他");
        sb.append("的消息");
        return zz6.s0(sb.toString(), color);
    }
}
