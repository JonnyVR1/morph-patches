package p153l;

import com.p051p1.mobile.android.p053ui.label.LabelModule;
import com.p051p1.mobile.putong.core.p058ui.label.CoreLabelTag;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class me9 implements v8r {
    @Override // p153l.v8r
    /* JADX INFO: renamed from: a */
    public List<r8r> mo158014a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new r8r.C19791a("闪聊匹配", tbc0.f172866P).m180247d(-7198452).m180245b(-10818).m180246c(CoreLabelTag.QUICK_CHAT).m180244a());
        arrayList.add(new r8r.C19791a("直播中", tbc0.f172865O).m180247d(-6808954).m180245b(-11801).m180246c(CoreLabelTag.VOICING).m180244a());
        arrayList.add(new r8r.C19791a("实名·头像本人", tbc0.f172864N).m180247d(-8960000).m180245b(-8307).m180246c(CoreLabelTag.ID_VERIFIED).m180244a());
        arrayList.add(new r8r.C19791a("头像本人", tbc0.f172860J).m180247d(-16097927).m180245b(-5444609).m180246c(CoreLabelTag.AVATAR_VERIFIED).m180244a());
        arrayList.add(new r8r.C19791a("学生", tbc0.f172868R).m180247d(-16162460).m180245b(-5571329).m180246c(CoreLabelTag.STUDENT).m180244a());
        arrayList.add(new r8r.C19791a(gta.m132210e().m132214d().mo34702I4() ? tbc0.f172861K : tbc0.f172871U).m180246c(CoreLabelTag.NEW).m180244a());
        arrayList.add(new r8r.C19791a(tbc0.f172869S).m180246c(CoreLabelTag.SVIP).m180244a());
        arrayList.add(new r8r.C19791a(tbc0.f172862L).m180246c(CoreLabelTag.DIAMOND).m180244a());
        arrayList.add(new r8r.C19791a(tbc0.f172870T).m180246c(CoreLabelTag.VIP).m180244a());
        arrayList.add(new r8r.C19791a("", tbc0.f172859I).m180245b(-3483924).m180246c(CoreLabelTag.AVATAR_ICON).m180244a());
        arrayList.add(new r8r.C19791a(tbc0.f172876Z).m180246c(CoreLabelTag.OLD_VERIFIED_ICON).m180244a());
        arrayList.add(new r8r.C19791a(tbc0.f172875Y).m180246c(CoreLabelTag.OLD_AVATAR_ICON).m180244a());
        return arrayList;
    }

    @Override // p153l.v8r
    /* JADX INFO: renamed from: b */
    public LabelModule mo158015b() {
        return LabelModule.CORE;
    }
}
