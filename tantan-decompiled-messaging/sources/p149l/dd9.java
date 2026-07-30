package p149l;

import com.p046p1.mobile.android.p048ui.label.LabelModule;
import com.p046p1.mobile.putong.core.p053ui.label.CoreLabelTag;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class dd9 implements u6r {
    @Override // p149l.u6r
    /* JADX INFO: renamed from: a */
    public List<q6r> mo110997a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new q6r.C19436a("闪聊匹配", n3c0.f136951P).m173158d(-7198452).m173156b(-10818).m173157c(CoreLabelTag.QUICK_CHAT).m173155a());
        arrayList.add(new q6r.C19436a("直播中", n3c0.f136950O).m173158d(-6808954).m173156b(-11801).m173157c(CoreLabelTag.VOICING).m173155a());
        arrayList.add(new q6r.C19436a("实名·头像本人", n3c0.f136949N).m173158d(-8960000).m173156b(-8307).m173157c(CoreLabelTag.ID_VERIFIED).m173155a());
        arrayList.add(new q6r.C19436a("头像本人", n3c0.f136945J).m173158d(-16097927).m173156b(-5444609).m173157c(CoreLabelTag.AVATAR_VERIFIED).m173155a());
        arrayList.add(new q6r.C19436a("学生", n3c0.f136953R).m173158d(-16162460).m173156b(-5571329).m173157c(CoreLabelTag.STUDENT).m173155a());
        arrayList.add(new q6r.C19436a(ura.m195053e().m195057d().mo33699I4() ? n3c0.f136946K : n3c0.f136956U).m173157c(CoreLabelTag.NEW).m173155a());
        arrayList.add(new q6r.C19436a(n3c0.f136954S).m173157c(CoreLabelTag.SVIP).m173155a());
        arrayList.add(new q6r.C19436a(n3c0.f136947L).m173157c(CoreLabelTag.DIAMOND).m173155a());
        arrayList.add(new q6r.C19436a(n3c0.f136955T).m173157c(CoreLabelTag.VIP).m173155a());
        arrayList.add(new q6r.C19436a("", n3c0.f136944I).m173156b(-3483924).m173157c(CoreLabelTag.AVATAR_ICON).m173155a());
        arrayList.add(new q6r.C19436a(n3c0.f136961Z).m173157c(CoreLabelTag.OLD_VERIFIED_ICON).m173155a());
        arrayList.add(new q6r.C19436a(n3c0.f136960Y).m173157c(CoreLabelTag.OLD_AVATAR_ICON).m173155a());
        return arrayList;
    }

    @Override // p149l.u6r
    /* JADX INFO: renamed from: b */
    public LabelModule mo110998b() {
        return LabelModule.CORE;
    }
}
