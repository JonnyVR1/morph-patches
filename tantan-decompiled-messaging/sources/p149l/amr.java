package p149l;

import com.p046p1.mobile.putong.core.data.Message;

/* JADX INFO: loaded from: classes11.dex */
public class amr implements j4m {

    /* JADX INFO: renamed from: b */
    public static final j4m f70672b = new amr();

    /* JADX INFO: renamed from: d */
    public static j4m m97684d() {
        return f70672b;
    }

    @Override // p149l.j4m
    /* JADX INFO: renamed from: a */
    public boolean mo94463a(pi6 pi6Var, Message message) {
        return pi6Var.f149088D.m178932o0(pi6Var, message) && !message.isMe();
    }

    @Override // p149l.j4m
    /* JADX INFO: renamed from: b */
    public CharSequence mo94464b(pi6 pi6Var, Message message) {
        return m139684c("限时快拍");
    }
}
