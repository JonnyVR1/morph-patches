package p149l;

import androidx.annotation.NonNull;
import com.google.protobuf.InterfaceC3419q;
import com.p046p1.mobile.longlink.msg.connector.LongLinkAuthMessage;
import com.p046p1.mobile.longlink.msg.connector.LongLinkMessage;

/* JADX INFO: loaded from: classes9.dex */
public class m2w extends n2w<LongLinkAuthMessage.AuthAck> {

    /* JADX INFO: renamed from: a */
    public e30<ki60> f130946a;

    /* JADX INFO: renamed from: b */
    public e30<ki60> f130947b;

    public m2w(e30<ki60> e30Var, e30<ki60> e30Var2) {
        this.f130946a = e30Var;
        this.f130947b = e30Var2;
    }

    @Override // p149l.sul, p149l.rul
    /* JADX INFO: renamed from: a */
    public boolean mo133933a(InterfaceC3419q interfaceC3419q, ki60 ki60Var) {
        if (((LongLinkAuthMessage.AuthAck) interfaceC3419q).getCode() == LongLinkAuthMessage.AuthResCode.AUTH_SUCC) {
            this.f130946a.call(ki60Var);
            return false;
        }
        this.f130947b.call(ki60Var);
        return false;
    }

    @Override // p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkAuthMessage.AuthAck> mo94398b() {
        return LongLinkAuthMessage.AuthAck.class;
    }

    @Override // p149l.n2w, p149l.sul
    @NonNull
    /* JADX INFO: renamed from: c */
    public String mo94754c() {
        return null;
    }

    @Override // p149l.sul
    /* JADX INFO: renamed from: f */
    public LongLinkMessage.MsgTypeEnum mo94756f() {
        return LongLinkMessage.MsgTypeEnum.MSG_TYPE_AUTH_ACK;
    }
}
