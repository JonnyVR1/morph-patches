package p003l;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.c0;
import com.p1.mobile.putong.core.data.ChatHeat;
import com.p1.mobile.putong.core.data.ChatHeatActionData;
import com.p1.mobile.putong.core.data.CoreBoxData;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.dd80;
import l.i0e;
import l.j760;
import l.l6c0;
import l.mkd0;
import l.mqi0;
import l.o7r;
import l.qib0;
import l.rw6;
import l.vwb;
import l.xh0;
import l.y4c0;
import l.zvf0;
import p028v.VDraweeView;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class pu4 {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m6914c(View view) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m6915d(long[] jArr, VText vText, String str, dd80[] dd80VarArr, CoreBoxData coreBoxData) {
        if (!NullChecker.a(coreBoxData.box) || ((long) ((ChatHeat) coreBoxData.box).exclusiveChatEndTime) - mqi0.o() <= 0) {
            if (NullChecker.a(dd80VarArr[0]) && dd80VarArr[0].isShowing()) {
                dd80VarArr[0].dismiss();
            }
            jArr[0] = 0;
            return;
        }
        jArr[0] = (((long) ((ChatHeat) coreBoxData.box).exclusiveChatEndTime) - mqi0.o()) / 60000;
        vText.setText(c0.l(((long) ((ChatHeat) coreBoxData.box).exclusiveChatEndTime) - mqi0.o()) + "后结束，期间不能和其他好友聊天哦");
        c0.a aVar = new c0.a();
        aVar.a(true).g("current_exclusive_progress_" + str).e(true).f((long) ((ChatHeat) coreBoxData.box).exclusiveChatEndTime);
        CoreModule.c.t1.r(aVar);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m6917f(Act act, String str, long[] jArr) {
        m6920i(act, str);
        zvf0.u("e_end_private_chat_button", "p_during_private_chat", new j760[]{vwb.Y("private_chat_remaining_time", Long.valueOf(jArr[0]))});
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m6918g(cwf0 cwf0Var, c4g0[] c4g0VarArr, DialogInterface dialogInterface) {
        i0e.e(cwf0Var);
        mkd0.z(c4g0VarArr[0]);
        mkd0.z(c4g0VarArr[1]);
        mkd0.z(c4g0VarArr[2]);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m6919h() {
    }

    /* JADX INFO: renamed from: i */
    public static void m6920i(Act act, final String str) {
        xh0.a aVar = new xh0.a(act);
        aVar.j("是否提前结束专属聊天？");
        aVar.r("在想想").o(new View.OnClickListener() { // from class: l.nu4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pu4.m6914c(view);
            }
        });
        aVar.f("结束").c(new View.OnClickListener() { // from class: l.ou4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreModule.c.M1.n3(str);
            }
        });
        aVar.a().g();
    }

    /* JADX INFO: renamed from: j */
    public static void m6921j(final Act act, final String str, ChatHeatActionData.ExclusiveAction exclusiveAction) {
        final cwf0 cwf0VarC = i0e.c("p_during_private_chat", Dialog.class.getName());
        if (exclusiveAction == ChatHeatActionData.ExclusiveAction.ENTER_CHECK) {
            cwf0VarC.p(new j760[]{vwb.Y("during_private_chat_show_from", "click_private_chat_entrance")});
        } else {
            cwf0VarC.p(new j760[]{vwb.Y("during_private_chat_show_from", "send_message_to_others")});
        }
        i0e.f(cwf0VarC);
        dd80.a aVarNewDialog = act.newDialog();
        View viewInflate = o7r.a(act).inflate(l6c0.R3, (ViewGroup) null);
        AppCompatTextView appCompatTextView = (VText) viewInflate.findViewById(y4c0.v0);
        final VText vText = (VText) viewInflate.findViewById(y4c0.n4);
        appCompatTextView.getPaint().setFakeBoldText(true);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(y4c0.t1);
        final VDraweeView vDraweeView2 = (VDraweeView) viewInflate.findViewById(y4c0.v1);
        qib0.G.Q0(vDraweeView, rw6.b(CoreModule.c.e0.p9()).profileSmall());
        final long[] jArr = {0};
        final c4g0[] c4g0VarArr = {act.duringCreated(CoreModule.c.e0.Ka(str)).subscribe((m250) mkd0.G(new e30() { // from class: l.hu4
            @Override // p003l.e30
            public final void call(Object obj) {
                qib0.G.Q0(vDraweeView2, rw6.b((User) obj).profileSmall());
            }
        })), act.duringCreated(CoreModule.c.M1.t3(str).first()).subscribe((m250) mkd0.G(new e30() { // from class: l.iu4
            @Override // p003l.e30
            public final void call(Object obj) {
                pu4.m6915d(jArr, vText, str, dd80VarArr, (CoreBoxData) obj);
            }
        })), act.duringCreated(CoreModule.c.t1.n("current_exclusive_progress_" + str)).subscribe((m250) mkd0.G(new e30() { // from class: l.ju4
            @Override // p003l.e30
            public final void call(Object obj) {
                vText.setText(c0.l(((c0.b) obj).d - mqi0.o()) + "后结束，期间不能和其他好友聊天哦");
            }
        }))};
        aVarNewDialog.R(viewInflate);
        aVarNewDialog.n0(new DialogInterface.OnDismissListener() { // from class: l.ku4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                pu4.m6918g(cwf0VarC, c4g0VarArr, dialogInterface);
            }
        });
        aVarNewDialog.c0("知道了", new Runnable() { // from class: l.lu4
            @Override // java.lang.Runnable
            public final void run() {
                pu4.m6919h();
            }
        }).X("提前结束专属聊天", new Runnable() { // from class: l.mu4
            @Override // java.lang.Runnable
            public final void run() {
                pu4.m6917f(act, str, jArr);
            }
        });
        final dd80[] dd80VarArr = {aVarNewDialog.r0()};
    }
}
