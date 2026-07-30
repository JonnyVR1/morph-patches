package p006l;

import androidx.annotation.NonNull;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.q;
import com.p1.mobile.longlink.msg.connector.LongLinkMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import l.du2;
import l.ki60;
import l.li60;
import l.n11;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class p2w extends n2w<q> {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap<String, List<rul<? extends q>>> f18573a = new LinkedHashMap<>();

    @Override // p006l.sul, p006l.rul
    /* JADX INFO: renamed from: a */
    public boolean mo16452a(q qVar, ki60 ki60Var) {
        StringBuilder sb = new StringBuilder("LonglinkCommonHandler handle anyMsg = ");
        sb.append(qVar);
        sb.append(", message = ");
        sb.append((Object) (ki60Var == null ? "" : ki60Var.a()));
        du2.a("[common][push]", sb.toString());
        List<rul<? extends q>> list = this.f18573a.get(ki60Var.a.getMsgTypeName());
        boolean zMo16452a = false;
        if (!vwb.J(list)) {
            Iterator<rul<? extends q>> it = list.iterator();
            while (it.hasNext()) {
                zMo16452a = it.next().mo16452a(qVar, ki60Var);
            }
        }
        return zMo16452a;
    }

    @Override // p006l.sul
    /* JADX INFO: renamed from: b */
    public Class<q> mo11743b() {
        return null;
    }

    @Override // p006l.n2w, p006l.sul
    @NonNull
    /* JADX INFO: renamed from: c */
    public String mo11744c() {
        return null;
    }

    @Override // p006l.n2w, p006l.sul
    /* JADX INFO: renamed from: d */
    public q mo19642d(LongLinkMessage.Msg msg) throws InvalidProtocolBufferException {
        if (msg.hasData()) {
            return li60.b(m21015g(msg.getMsgTypeName()), msg.getData());
        }
        return null;
    }

    @Override // p006l.sul
    /* JADX INFO: renamed from: f */
    public LongLinkMessage.MsgTypeEnum mo11746f() {
        return LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON;
    }

    /* JADX INFO: renamed from: g */
    public Class<? extends q> m21015g(String str) {
        List<rul<? extends q>> list = this.f18573a.get(str);
        if (vwb.J(list)) {
            return null;
        }
        return list.get(0).m22959b();
    }

    /* JADX INFO: renamed from: h */
    public void m21016h(rul rulVar) {
        List<rul<? extends q>> arrayList = this.f18573a.get(rulVar.mo11805e());
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f18573a.put(rulVar.mo11805e(), arrayList);
        }
        if (arrayList.size() > 0) {
            n11.h(arrayList.get(0).m22959b() == rulVar.m22959b());
        }
        arrayList.add(rulVar);
    }
}
