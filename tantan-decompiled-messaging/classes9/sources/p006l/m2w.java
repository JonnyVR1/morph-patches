package p006l;

import androidx.annotation.NonNull;
import com.google.protobuf.q;
import com.p1.mobile.longlink.msg.connector.LongLinkAuthMessage;
import com.p1.mobile.longlink.msg.connector.LongLinkMessage;
import l.e30;
import l.ki60;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class m2w extends n2w<LongLinkAuthMessage.AuthAck> {

    /* JADX INFO: renamed from: a */
    public e30<ki60> f16776a;

    /* JADX INFO: renamed from: b */
    public e30<ki60> f16777b;

    public m2w(e30<ki60> e30Var, e30<ki60> e30Var2) {
        this.f16776a = e30Var;
        this.f16777b = e30Var2;
    }

    @Override // p006l.sul, p006l.rul
    /* JADX INFO: renamed from: a */
    public boolean mo16452a(q qVar, ki60 ki60Var) {
        if (((LongLinkAuthMessage.AuthAck) qVar).getCode() == LongLinkAuthMessage.AuthResCode.AUTH_SUCC) {
            this.f16776a.call(ki60Var);
            return false;
        }
        this.f16777b.call(ki60Var);
        return false;
    }

    @Override // p006l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkAuthMessage.AuthAck> mo11743b() {
        return LongLinkAuthMessage.AuthAck.class;
    }

    @Override // p006l.n2w, p006l.sul
    @NonNull
    /* JADX INFO: renamed from: c */
    public String mo11744c() {
        return null;
    }

    @Override // p006l.sul
    /* JADX INFO: renamed from: f */
    public LongLinkMessage.MsgTypeEnum mo11746f() {
        return LongLinkMessage.MsgTypeEnum.MSG_TYPE_AUTH_ACK;
    }
}
