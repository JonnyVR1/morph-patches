package p153l;

import android.graphics.Color;
import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4891g;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.data.OMSDialogPositon;

/* JADX INFO: loaded from: classes11.dex */
public class b2r implements z6m {

    /* JADX INFO: renamed from: b */
    public static final z6m f74649b = new b2r();

    /* JADX INFO: renamed from: d */
    public static z6m m102220d() {
        return f74649b;
    }

    @Override // p153l.z6m
    /* JADX INFO: renamed from: a */
    public boolean mo95724a(sj6 sj6Var, Message message) {
        return CoreModule.m30933P().m143410g().mo36057d9() && !joa.m146361M3() && TextUtils.equals(sj6Var.f168926a.f56859id, C4891g.f20578Y2);
    }

    @Override // p153l.z6m
    /* JADX INFO: renamed from: b */
    public CharSequence mo95725b(sj6 sj6Var, Message message) {
        String str = String.format("更了解%s", sj6Var.f168927b.isFemale() ? "她" : "他");
        i4g0.m138526x("e_know_him_better_guide", OMSDialogPositon.p_messages_view);
        int color = sj6Var.f168949x.getResources().getColor(c9c0.f80342I);
        if (gra.m131778z()) {
            color = Color.parseColor("#FF700A");
        }
        return c17.m107526s0(str, color);
    }
}
