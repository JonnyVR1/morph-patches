package p149l;

import androidx.annotation.NonNull;
import com.google.protobuf.InterfaceC3419q;
import com.google.protobuf.InvalidProtocolBufferException;
import com.p046p1.mobile.longlink.msg.connector.LongLinkMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class p2w extends n2w<InterfaceC3419q> {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap<String, List<rul<? extends InterfaceC3419q>>> f146935a = new LinkedHashMap<>();

    @Override // p149l.sul, p149l.rul
    /* JADX INFO: renamed from: a */
    public boolean mo133933a(InterfaceC3419q interfaceC3419q, ki60 ki60Var) {
        StringBuilder sb = new StringBuilder("LonglinkCommonHandler handle anyMsg = ");
        sb.append(interfaceC3419q);
        sb.append(", message = ");
        sb.append(ki60Var == null ? "" : ki60Var.m146053a());
        du2.m113670a("[common][push]", sb.toString());
        List<rul<? extends InterfaceC3419q>> list = this.f146935a.get(ki60Var.f123271a.getMsgTypeName());
        boolean zMo133933a = false;
        if (!vwb.m200296J(list)) {
            Iterator<rul<? extends InterfaceC3419q>> it = list.iterator();
            while (it.hasNext()) {
                zMo133933a = it.next().mo133933a(interfaceC3419q, ki60Var);
            }
        }
        return zMo133933a;
    }

    @Override // p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<InterfaceC3419q> mo94398b() {
        return null;
    }

    @Override // p149l.n2w, p149l.sul
    @NonNull
    /* JADX INFO: renamed from: c */
    public String mo94754c() {
        return null;
    }

    @Override // p149l.n2w, p149l.sul
    /* JADX INFO: renamed from: d */
    public InterfaceC3419q mo157683d(LongLinkMessage.Msg msg) throws InvalidProtocolBufferException {
        if (msg.hasData()) {
            return li60.m149879b(m167225g(msg.getMsgTypeName()), msg.getData());
        }
        return null;
    }

    @Override // p149l.sul
    /* JADX INFO: renamed from: f */
    public LongLinkMessage.MsgTypeEnum mo94756f() {
        return LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON;
    }

    /* JADX INFO: renamed from: g */
    public Class<? extends InterfaceC3419q> m167225g(String str) {
        List<rul<? extends InterfaceC3419q>> list = this.f146935a.get(str);
        if (vwb.m200296J(list)) {
            return null;
        }
        return list.get(0).m180880b();
    }

    /* JADX INFO: renamed from: h */
    public void m167226h(rul rulVar) {
        List<rul<? extends InterfaceC3419q>> arrayList = this.f146935a.get(rulVar.mo95580e());
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f146935a.put(rulVar.mo95580e(), arrayList);
        }
        if (arrayList.size() > 0) {
            n11.m157335h(arrayList.get(0).m180880b() == rulVar.m180880b());
        }
        arrayList.add(rulVar);
    }
}
