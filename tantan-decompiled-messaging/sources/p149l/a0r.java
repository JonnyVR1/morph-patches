package p149l;

import android.graphics.Color;
import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4740g;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.data.OMSDialogPositon;

/* JADX INFO: loaded from: classes11.dex */
public class a0r implements j4m {

    /* JADX INFO: renamed from: b */
    public static final j4m f67062b = new a0r();

    /* JADX INFO: renamed from: d */
    public static j4m m94462d() {
        return f67062b;
    }

    @Override // p149l.j4m
    /* JADX INFO: renamed from: a */
    public boolean mo94463a(pi6 pi6Var, Message message) {
        return CoreModule.m29935P().m94656g().mo35054d9() && !xma.m210047L3() && TextUtils.equals(pi6Var.f149101a.f56011id, C4740g.f19836Y2);
    }

    @Override // p149l.j4m
    /* JADX INFO: renamed from: b */
    public CharSequence mo94464b(pi6 pi6Var, Message message) {
        String str = String.format("更了解%s", pi6Var.f149102b.isFemale() ? "她" : "他");
        zvf0.m220402x("e_know_him_better_guide", OMSDialogPositon.p_messages_view);
        int color = pi6Var.f149124x.getResources().getColor(w0c0.f183773I);
        if (upa.m194847z()) {
            color = Color.parseColor("#FF700A");
        }
        return zz6.m221002s0(str, color);
    }
}
