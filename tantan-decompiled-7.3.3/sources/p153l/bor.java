package p153l;

import com.p051p1.mobile.putong.core.data.Message;

/* JADX INFO: loaded from: classes11.dex */
public class bor implements z6m {

    /* JADX INFO: renamed from: b */
    public static final z6m f77699b = new bor();

    /* JADX INFO: renamed from: d */
    public static z6m m105710d() {
        return f77699b;
    }

    @Override // p153l.z6m
    /* JADX INFO: renamed from: a */
    public boolean mo95724a(sj6 sj6Var, Message message) {
        return sj6Var.f168913D.m195726o0(sj6Var, message) && !message.isMe();
    }

    @Override // p153l.z6m
    /* JADX INFO: renamed from: b */
    public CharSequence mo95725b(sj6 sj6Var, Message message) {
        return m218804c("限时快拍");
    }
}
