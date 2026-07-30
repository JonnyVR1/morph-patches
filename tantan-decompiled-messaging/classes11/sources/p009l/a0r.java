package p009l;

import android.graphics.Color;
import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.g;
import com.p1.mobile.putong.core.data.Message;
import com.tantanapp.common.data.DbObject;
import l.upa;
import l.w0c0;
import l.xma;
import l.zvf0;
import l.zz6;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class a0r implements j4m {

    /* JADX INFO: renamed from: b */
    public static final j4m f9181b = new a0r();

    /* JADX INFO: renamed from: d */
    public static j4m m11179d() {
        return f9181b;
    }

    @Override // p009l.j4m
    /* JADX INFO: renamed from: a */
    public boolean mo11180a(pi6 pi6Var, Message message) {
        return CoreModule.P().g().d9() && !xma.L3() && TextUtils.equals(((DbObject) pi6Var.f18622a).id, g.Y2);
    }

    @Override // p009l.j4m
    /* JADX INFO: renamed from: b */
    public CharSequence mo11181b(pi6 pi6Var, Message message) {
        String str = String.format("更了解%s", pi6Var.f18623b.isFemale() ? "她" : "他");
        zvf0.x("e_know_him_better_guide", "p_messages_view");
        int color = pi6Var.f18645x.getResources().getColor(w0c0.I);
        if (upa.z()) {
            color = Color.parseColor("#FF700A");
        }
        return zz6.s0(str, color);
    }
}
