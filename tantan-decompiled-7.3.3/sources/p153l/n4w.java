package p153l;

import androidx.annotation.NonNull;
import com.google.protobuf.InterfaceC3442q;
import com.google.protobuf.InvalidProtocolBufferException;
import com.p051p1.mobile.longlink.msg.connector.LongLinkMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class n4w extends l4w<InterfaceC3442q> {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap<String, List<exl<? extends InterfaceC3442q>>> f140261a = new LinkedHashMap<>();

    @Override // p153l.fxl, p153l.exl
    /* JADX INFO: renamed from: a */
    public boolean mo123068a(InterfaceC3442q interfaceC3442q, pq60 pq60Var) {
        StringBuilder sb = new StringBuilder("LonglinkCommonHandler handle anyMsg = ");
        sb.append(interfaceC3442q);
        sb.append(", message = ");
        sb.append(pq60Var == null ? "" : pq60Var.m173324a());
        tu2.m192703a("[common][push]", sb.toString());
        List<exl<? extends InterfaceC3442q>> list = this.f140261a.get(pq60Var.f153643a.getMsgTypeName());
        boolean zMo123068a = false;
        if (!jyb.m147479J(list)) {
            Iterator<exl<? extends InterfaceC3442q>> it = list.iterator();
            while (it.hasNext()) {
                zMo123068a = it.next().mo123068a(interfaceC3442q, pq60Var);
            }
        }
        return zMo123068a;
    }

    @Override // p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<InterfaceC3442q> mo95510b() {
        return null;
    }

    @Override // p153l.l4w, p153l.fxl
    @NonNull
    /* JADX INFO: renamed from: c */
    public String mo96253c() {
        return null;
    }

    @Override // p153l.l4w, p153l.fxl
    /* JADX INFO: renamed from: d */
    public InterfaceC3442q mo127983d(LongLinkMessage.Msg msg) throws InvalidProtocolBufferException {
        if (msg.hasData()) {
            return qq60.m177481b(m161604g(msg.getMsgTypeName()), msg.getData());
        }
        return null;
    }

    @Override // p153l.fxl
    /* JADX INFO: renamed from: f */
    public LongLinkMessage.MsgTypeEnum mo102648f() {
        return LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON;
    }

    /* JADX INFO: renamed from: g */
    public Class<? extends InterfaceC3442q> m161604g(String str) {
        List<exl<? extends InterfaceC3442q>> list = this.f140261a.get(str);
        if (jyb.m147479J(list)) {
            return null;
        }
        return list.get(0).m123069b();
    }

    /* JADX INFO: renamed from: h */
    public void m161605h(exl exlVar) {
        List<exl<? extends InterfaceC3442q>> arrayList = this.f140261a.get(exlVar.mo96254e());
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f140261a.put(exlVar.mo96254e(), arrayList);
        }
        if (arrayList.size() > 0) {
            u11.m193894h(arrayList.get(0).m123069b() == exlVar.m123069b());
        }
        arrayList.add(exlVar);
    }
}
