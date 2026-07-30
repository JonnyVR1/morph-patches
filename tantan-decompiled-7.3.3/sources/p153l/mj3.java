package p153l;

import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes11.dex */
public class mj3 implements z6m {

    /* JADX INFO: renamed from: b */
    public static final z6m f137052b = new mj3();

    /* JADX INFO: renamed from: d */
    public static z6m m158568d() {
        return f137052b;
    }

    @Override // p153l.z6m
    /* JADX INFO: renamed from: a */
    public boolean mo95724a(sj6 sj6Var, Message message) {
        return User.isBusinessAI1V1(sj6Var.f168926a.f56859id);
    }

    @Override // p153l.z6m
    /* JADX INFO: renamed from: b */
    public CharSequence mo95725b(sj6 sj6Var, Message message) {
        return c17.m107526s0("AI伴侣", sj6Var.f168949x.getResources().getColor(c9c0.f80342I));
    }
}
