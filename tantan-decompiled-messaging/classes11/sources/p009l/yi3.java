package p009l;

import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import l.w0c0;
import l.zz6;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class yi3 implements j4m {

    /* JADX INFO: renamed from: b */
    public static final j4m f23079b = new yi3();

    /* JADX INFO: renamed from: d */
    public static j4m m25376d() {
        return f23079b;
    }

    @Override // p009l.j4m
    /* JADX INFO: renamed from: a */
    public boolean mo11180a(pi6 pi6Var, Message message) {
        return User.isBusinessAI1V1(((DbObject) pi6Var.f18622a).id);
    }

    @Override // p009l.j4m
    /* JADX INFO: renamed from: b */
    public CharSequence mo11181b(pi6 pi6Var, Message message) {
        return zz6.s0("AI伴侣", pi6Var.f18645x.getResources().getColor(w0c0.I));
    }
}
