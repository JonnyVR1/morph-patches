package p153l;

import com.p051p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew;

/* JADX INFO: loaded from: classes5.dex */
public class au6 extends bzm {

    /* JADX INFO: renamed from: b */
    public kbt f73470b = new kbt();

    @Override // p153l.bzm
    /* JADX INFO: renamed from: a */
    public void mo76663a(ur4 ur4Var) throws Exception {
        yc60 yc60VarMo196644c = ur4Var.mo196644c();
        ftf0 ftf0VarM215136b = yc60VarMo196644c.m215136b();
        if (ftf0VarM215136b.m127318f()) {
            yc60VarMo196644c.m215140f("connect");
        } else if (ftf0VarM215136b.m127319g() || ftf0VarM215136b.m127317e()) {
            liveAuthMessageNew.Msg msgM149077a = this.f73470b.m149077a(yc60VarMo196644c.m215135a());
            yc60VarMo196644c.m215140f(msgM149077a.getMsgId());
            String strM76670a = ur4Var.mo196643b().m186785c().m76670a();
            ur4Var.mo196643b().m186795m().mo204126a(strM76670a + "ConvertInterceptor received message type:" + msgM149077a.getMsgTypeName());
        }
        if (ftf0VarM215136b.m127319g() && (ftf0VarM215136b instanceof myt) && ((myt) ftf0VarM215136b).m160806k()) {
            ur4Var.mo196643b().m186788f().m147328z();
        }
        ur4Var.mo196642a(ur4Var.mo196644c());
    }

    @Override // p153l.bzm
    /* JADX INFO: renamed from: b */
    public void mo76664b(ur4 ur4Var) throws Exception {
        if (ur4Var.call() instanceof rct) {
            liveAuthMessageNew.Msg from = liveAuthMessageNew.Msg.parseFrom(ur4Var.mo196644c().m215135a());
            ur4Var.mo196643b().m186795m().mo204126a("ConvertInterceptor send message:" + from.getMsgTypeName());
        }
        ur4Var.mo196642a(ur4Var.mo196644c());
    }
}
