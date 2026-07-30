package p009l;

import android.graphics.Color;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.upa;
import l.w0c0;
import l.zz6;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class few implements j4m {

    /* JADX INFO: renamed from: b */
    public static final j4m f12982b = new few();

    /* JADX INFO: renamed from: d */
    public static j4m m14433d() {
        return f12982b;
    }

    @Override // p009l.j4m
    /* JADX INFO: renamed from: a */
    public boolean mo11180a(pi6 pi6Var, Message message) {
        User userP9 = CoreModule.c.e0.p9();
        return (NullChecker.a(userP9) && userP9.isSVIP()) ? rd6.m21521s0(pi6Var.f18622a) : pi6Var.f18622a.lowPayOneSideConv();
    }

    @Override // p009l.j4m
    /* JADX INFO: renamed from: b */
    public CharSequence mo11181b(pi6 pi6Var, Message message) {
        int color = pi6Var.f18645x.getResources().getColor(w0c0.I);
        if (upa.z()) {
            color = Color.parseColor("#FF700A");
        }
        return zz6.s0("解锁新配对", color);
    }
}
