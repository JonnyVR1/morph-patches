package p153l;

import android.graphics.Color;
import com.p051p1.mobile.putong.core.data.Message;

/* JADX INFO: loaded from: classes11.dex */
public class j3g implements z6m {

    /* JADX INFO: renamed from: b */
    public static final z6m f118178b = new j3g();

    /* JADX INFO: renamed from: d */
    public static z6m m143349d() {
        return f118178b;
    }

    @Override // p153l.z6m
    /* JADX INFO: renamed from: a */
    public boolean mo95724a(sj6 sj6Var, Message message) {
        return ue6.m195672o(sj6Var.f168926a);
    }

    @Override // p153l.z6m
    /* JADX INFO: renamed from: b */
    public CharSequence mo95725b(sj6 sj6Var, Message message) {
        int color = sj6Var.f168949x.getResources().getColor(c9c0.f80342I);
        if (gra.m131778z()) {
            color = Color.parseColor("#FF700A");
        }
        StringBuilder sb = new StringBuilder("解锁");
        sb.append(sj6Var.f168927b.isFemale() ? "她" : "他");
        sb.append("的消息");
        return c17.m107526s0(sb.toString(), color);
    }
}
