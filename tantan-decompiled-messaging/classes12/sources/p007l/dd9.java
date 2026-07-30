package p007l;

import com.p000p1.mobile.putong.core.p001ui.label.CoreLabelTag;
import com.p1.mobile.android.ui.label.LabelModule;
import java.util.ArrayList;
import java.util.List;
import l.n3c0;
import l.q6r;
import l.u6r;
import l.ura;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class dd9 implements u6r {
    /* JADX INFO: renamed from: a */
    public List<q6r> m9366a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new q6r.a("闪聊匹配", n3c0.P).d(-7198452).b(-10818).c(CoreLabelTag.QUICK_CHAT).a());
        arrayList.add(new q6r.a("直播中", n3c0.O).d(-6808954).b(-11801).c(CoreLabelTag.VOICING).a());
        arrayList.add(new q6r.a("实名·头像本人", n3c0.N).d(-8960000).b(-8307).c(CoreLabelTag.ID_VERIFIED).a());
        arrayList.add(new q6r.a("头像本人", n3c0.J).d(-16097927).b(-5444609).c(CoreLabelTag.AVATAR_VERIFIED).a());
        arrayList.add(new q6r.a("学生", n3c0.R).d(-16162460).b(-5571329).c(CoreLabelTag.STUDENT).a());
        arrayList.add(new q6r.a(ura.e().d().I4() ? n3c0.K : n3c0.U).c(CoreLabelTag.NEW).a());
        arrayList.add(new q6r.a(n3c0.S).c(CoreLabelTag.SVIP).a());
        arrayList.add(new q6r.a(n3c0.L).c(CoreLabelTag.DIAMOND).a());
        arrayList.add(new q6r.a(n3c0.T).c(CoreLabelTag.VIP).a());
        arrayList.add(new q6r.a("", n3c0.I).b(-3483924).c(CoreLabelTag.AVATAR_ICON).a());
        arrayList.add(new q6r.a(n3c0.Z).c(CoreLabelTag.OLD_VERIFIED_ICON).a());
        arrayList.add(new q6r.a(n3c0.Y).c(CoreLabelTag.OLD_AVATAR_ICON).a());
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public LabelModule m9367b() {
        return LabelModule.CORE;
    }
}
