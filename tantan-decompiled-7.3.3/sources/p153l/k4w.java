package p153l;

import androidx.annotation.NonNull;
import com.google.protobuf.InterfaceC3442q;
import com.p051p1.mobile.longlink.msg.connector.LongLinkAuthMessage;
import com.p051p1.mobile.longlink.msg.connector.LongLinkMessage;

/* JADX INFO: loaded from: classes9.dex */
public class k4w extends l4w<LongLinkAuthMessage.AuthAck> {

    /* JADX INFO: renamed from: a */
    public y20<pq60> f123937a;

    /* JADX INFO: renamed from: b */
    public y20<pq60> f123938b;

    public k4w(y20<pq60> y20Var, y20<pq60> y20Var2) {
        this.f123937a = y20Var;
        this.f123938b = y20Var2;
    }

    @Override // p153l.fxl, p153l.exl
    /* JADX INFO: renamed from: a */
    public boolean mo123068a(InterfaceC3442q interfaceC3442q, pq60 pq60Var) {
        if (((LongLinkAuthMessage.AuthAck) interfaceC3442q).getCode() == LongLinkAuthMessage.AuthResCode.AUTH_SUCC) {
            this.f123937a.call(pq60Var);
            return false;
        }
        this.f123938b.call(pq60Var);
        return false;
    }

    @Override // p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkAuthMessage.AuthAck> mo95510b() {
        return LongLinkAuthMessage.AuthAck.class;
    }

    @Override // p153l.l4w, p153l.fxl
    @NonNull
    /* JADX INFO: renamed from: c */
    public String mo96253c() {
        return null;
    }

    @Override // p153l.fxl
    /* JADX INFO: renamed from: f */
    public LongLinkMessage.MsgTypeEnum mo102648f() {
        return LongLinkMessage.MsgTypeEnum.MSG_TYPE_AUTH_ACK;
    }
}
