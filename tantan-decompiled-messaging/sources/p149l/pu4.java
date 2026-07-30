package p149l;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.RunnableC4733c0;
import com.p046p1.mobile.putong.core.data.ChatHeat;
import com.p046p1.mobile.putong.core.data.ChatHeatActionData;
import com.p046p1.mobile.putong.core.data.CoreBoxData;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class pu4 {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m171399c(View view) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m171400d(long[] jArr, VText vText, String str, dd80[] dd80VarArr, CoreBoxData coreBoxData) {
        if (!NullChecker.m81303a(coreBoxData.box) || ((long) ((ChatHeat) coreBoxData.box).exclusiveChatEndTime) - mqi0.m155944o() <= 0) {
            if (NullChecker.m81303a(dd80VarArr[0]) && dd80VarArr[0].isShowing()) {
                dd80VarArr[0].dismiss();
            }
            jArr[0] = 0;
            return;
        }
        jArr[0] = (((long) ((ChatHeat) coreBoxData.box).exclusiveChatEndTime) - mqi0.m155944o()) / Constants.ONE_MIN_IN_MILLIS;
        vText.setText(RunnableC4733c0.m31502l(((long) ((ChatHeat) coreBoxData.box).exclusiveChatEndTime) - mqi0.m155944o()) + "后结束，期间不能和其他好友聊天哦");
        RunnableC4733c0.a aVar = new RunnableC4733c0.a();
        aVar.m31517a(true).m31523g("current_exclusive_progress_" + str).m31521e(true).m31522f((long) ((ChatHeat) coreBoxData.box).exclusiveChatEndTime);
        CoreModule.f17545c.f19685t1.m31513r(aVar);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m171402f(Act act, String str, long[] jArr) {
        m171405i(act, str);
        zvf0.m220399u("e_end_private_chat_button", "p_during_private_chat", vwb.m200311Y("private_chat_remaining_time", Long.valueOf(jArr[0])));
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m171403g(cwf0 cwf0Var, c4g0[] c4g0VarArr, DialogInterface dialogInterface) {
        i0e.m133796e(cwf0Var);
        mkd0.m154992z(c4g0VarArr[0]);
        mkd0.m154992z(c4g0VarArr[1]);
        mkd0.m154992z(c4g0VarArr[2]);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m171404h() {
    }

    /* JADX INFO: renamed from: i */
    public static void m171405i(Act act, final String str) {
        xh0.C21150a c21150a = new xh0.C21150a(act);
        c21150a.m208731j("是否提前结束专属聊天？");
        c21150a.m208739r("在想想").m208736o(new View.OnClickListener() { // from class: l.nu4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pu4.m171399c(view);
            }
        });
        c21150a.m208727f("结束").m208724c(new View.OnClickListener() { // from class: l.ou4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreModule.f17545c.f19586M1.m215244n3(str);
            }
        });
        c21150a.m208722a().m208721g();
    }

    /* JADX INFO: renamed from: j */
    public static void m171406j(final Act act, final String str, ChatHeatActionData.ExclusiveAction exclusiveAction) {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_during_private_chat", Dialog.class.getName());
        if (exclusiveAction == ChatHeatActionData.ExclusiveAction.ENTER_CHECK) {
            cwf0VarM133794c.m109040p(vwb.m200311Y("during_private_chat_show_from", "click_private_chat_entrance"));
        } else {
            cwf0VarM133794c.m109040p(vwb.m200311Y("during_private_chat_show_from", "send_message_to_others"));
        }
        i0e.m133797f(cwf0VarM133794c);
        dd80.C16336a c16336aNewDialog = act.newDialog();
        View viewInflate = o7r.m163037a(act).inflate(l6c0.f126378R3, (ViewGroup) null);
        VText vText = (VText) viewInflate.findViewById(y4c0.f196235v0);
        final VText vText2 = (VText) viewInflate.findViewById(y4c0.f196183n4);
        vText.getPaint().setFakeBoldText(true);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(y4c0.f196222t1);
        final VDraweeView vDraweeView2 = (VDraweeView) viewInflate.findViewById(y4c0.f196236v1);
        qib0.f154691G.m102341Q0(vDraweeView, rw6.m181386b(CoreModule.f17545c.f19639e0.m169527p9()).profileSmall());
        final long[] jArr = {0};
        final c4g0[] c4g0VarArr = {act.duringCreated(CoreModule.f17545c.f19639e0.m169410Ka(str)).subscribe(mkd0.m154955G(new e30() { // from class: l.hu4
            @Override // p149l.e30
            public final void call(Object obj) {
                qib0.f154691G.m102341Q0(vDraweeView2, rw6.m181386b((User) obj).profileSmall());
            }
        })), act.duringCreated(CoreModule.f17545c.f19586M1.m215250t3(str).first()).subscribe(mkd0.m154955G(new e30() { // from class: l.iu4
            @Override // p149l.e30
            public final void call(Object obj) {
                pu4.m171400d(jArr, vText2, str, dd80VarArr, (CoreBoxData) obj);
            }
        })), act.duringCreated(CoreModule.f17545c.f19685t1.m31509n("current_exclusive_progress_" + str)).subscribe(mkd0.m154955G(new e30() { // from class: l.ju4
            @Override // p149l.e30
            public final void call(Object obj) {
                vText2.setText(RunnableC4733c0.m31502l(((RunnableC4733c0.b) obj).f19724d - mqi0.m155944o()) + "后结束，期间不能和其他好友聊天哦");
            }
        }))};
        c16336aNewDialog.m110963R(viewInflate);
        c16336aNewDialog.m110985n0(new DialogInterface.OnDismissListener() { // from class: l.ku4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                pu4.m171403g(cwf0VarM133794c, c4g0VarArr, dialogInterface);
            }
        });
        c16336aNewDialog.m110974c0("知道了", new Runnable() { // from class: l.lu4
            @Override // java.lang.Runnable
            public final void run() {
                pu4.m171404h();
            }
        }).m110969X("提前结束专属聊天", new Runnable() { // from class: l.mu4
            @Override // java.lang.Runnable
            public final void run() {
                pu4.m171402f(act, str, jArr);
            }
        });
        final dd80[] dd80VarArr = {c16336aNewDialog.m110989r0()};
    }
}
