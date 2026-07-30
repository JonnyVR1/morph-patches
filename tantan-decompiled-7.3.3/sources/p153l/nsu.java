package p153l;

import com.p051p1.mobile.putong.live.external.internal.vchat.view.LiveVChatView;

/* JADX INFO: loaded from: classes9.dex */
public class nsu {
    /* JADX INFO: renamed from: a */
    public static void m164634a(wvk0 wvk0Var, knu knuVar, LiveVChatView liveVChatView) {
        if (knuVar.f127643f) {
            wvk0Var.m153103z2(new stu(knuVar, liveVChatView.f46285i));
            wvk0Var.m153103z2(new zvk0(knuVar, liveVChatView.f46277a));
            wvk0Var.m153103z2(new mgu(knuVar, liveVChatView.f46288l, liveVChatView.f46286j));
            wvk0Var.m153103z2(new ics(knuVar));
        } else {
            wvk0Var.m153103z2(new wgu(knuVar));
            wvk0Var.m153103z2(new ziu(knuVar));
            if (knuVar.f127642e.m212353w().isFakeCall()) {
                wvk0Var.m153103z2(new yju(knuVar, liveVChatView.f46288l));
            } else if (knuVar.f127642e.m212353w().isRandomMatch()) {
                wvk0Var.m153103z2(new kru(knuVar, liveVChatView.f46286j));
            } else {
                wvk0Var.m153103z2(new tgu(knuVar, liveVChatView.f46286j));
            }
            wvk0Var.m153103z2(new vlu(knuVar));
            wvk0Var.m153103z2(new soe0(knuVar));
            wvk0Var.m153103z2(new jgu(knuVar));
        }
        wvk0Var.m153103z2(new gru(knuVar, liveVChatView.f46278b));
        wvk0Var.m153103z2(new cou(knuVar, liveVChatView.f46279c));
        wvk0Var.m153103z2(new iqu(knuVar, liveVChatView.f46282f, liveVChatView.f46287k));
        wvk0Var.m153103z2(new kou(knuVar, liveVChatView.f46281e));
        wvk0Var.m153103z2(new spu(knuVar));
        wvk0Var.m153103z2(new zsu(knuVar));
        wvk0Var.m153103z2(new nns(knuVar, liveVChatView.f46283g));
        wvk0Var.m153103z2(new mvk0(knuVar, liveVChatView.f46289m));
        wvk0Var.m153103z2(new liu(knuVar, liveVChatView.f46280d));
        wvk0Var.m153103z2(new vuu(knuVar, liveVChatView.f46284h));
        wvk0Var.m153103z2(new gou(knuVar));
    }
}
