package p153l;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.RunnableC4884c0;
import com.p051p1.mobile.putong.core.data.ChatHeat;
import com.p051p1.mobile.putong.core.data.ChatHeatActionData;
import com.p051p1.mobile.putong.core.data.CoreBoxData;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class ov4 {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m169414c(View view) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m169415d(long[] jArr, VText vText, String str, jl80[] jl80VarArr, CoreBoxData coreBoxData) {
        if (!NullChecker.m82486a(coreBoxData.box) || ((long) ((ChatHeat) coreBoxData.box).exclusiveChatEndTime) - pzi0.m174454o() <= 0) {
            if (NullChecker.m82486a(jl80VarArr[0]) && jl80VarArr[0].isShowing()) {
                jl80VarArr[0].dismiss();
            }
            jArr[0] = 0;
            return;
        }
        jArr[0] = (((long) ((ChatHeat) coreBoxData.box).exclusiveChatEndTime) - pzi0.m174454o()) / Constants.ONE_MIN_IN_MILLIS;
        vText.setText(RunnableC4884c0.m32505l(((long) ((ChatHeat) coreBoxData.box).exclusiveChatEndTime) - pzi0.m174454o()) + "后结束，期间不能和其他好友聊天哦");
        RunnableC4884c0.a aVar = new RunnableC4884c0.a();
        aVar.m32520a(true).m32526g("current_exclusive_progress_" + str).m32524e(true).m32525f((long) ((ChatHeat) coreBoxData.box).exclusiveChatEndTime);
        CoreModule.f18264c.f20427t1.m32516r(aVar);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m169417f(Act act, String str, long[] jArr) {
        m169420i(act, str);
        i4g0.m138523u("e_end_private_chat_button", "p_during_private_chat", jyb.m147494Y("private_chat_remaining_time", Long.valueOf(jArr[0])));
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m169418g(l4g0 l4g0Var, kcg0[] kcg0VarArr, DialogInterface dialogInterface) {
        w1e.m204401e(l4g0Var);
        psd0.m173633z(kcg0VarArr[0]);
        psd0.m173633z(kcg0VarArr[1]);
        psd0.m173633z(kcg0VarArr[2]);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m169419h() {
    }

    /* JADX INFO: renamed from: i */
    public static void m169420i(Act act, final String str) {
        th0.C20312a c20312a = new th0.C20312a(act);
        c20312a.m191151j("是否提前结束专属聊天？");
        c20312a.m191159r("在想想").m191156o(new View.OnClickListener() { // from class: l.mv4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ov4.m169414c(view);
            }
        });
        c20312a.m191147f("结束").m191144c(new View.OnClickListener() { // from class: l.nv4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreModule.f18264c.f20328M1.m111469n3(str);
            }
        });
        c20312a.m191142a().m191141g();
    }

    /* JADX INFO: renamed from: j */
    public static void m169421j(final Act act, final String str, ChatHeatActionData.ExclusiveAction exclusiveAction) {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_during_private_chat", Dialog.class.getName());
        if (exclusiveAction == ChatHeatActionData.ExclusiveAction.ENTER_CHECK) {
            l4g0VarM204399c.m152781p(jyb.m147494Y("during_private_chat_show_from", "click_private_chat_entrance"));
        } else {
            l4g0VarM204399c.m152781p(jyb.m147494Y("during_private_chat_show_from", "send_message_to_others"));
        }
        w1e.m204402f(l4g0VarM204399c);
        jl80.C17971a c17971aNewDialog = act.newDialog();
        View viewInflate = p9r.m171370a(act).inflate(qec0.f156934R3, (ViewGroup) null);
        VText vText = (VText) viewInflate.findViewById(edc0.f93470v0);
        final VText vText2 = (VText) viewInflate.findViewById(edc0.f93418n4);
        vText.getPaint().setFakeBoldText(true);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(edc0.f93457t1);
        final VDraweeView vDraweeView2 = (VDraweeView) viewInflate.findViewById(edc0.f93471v1);
        uqb0.f180374G.m127125Q0(vDraweeView, ux6.m198404b(CoreModule.f18264c.f20381e0.m116600p9()).profileSmall());
        final long[] jArr = {0};
        final kcg0[] kcg0VarArr = {act.duringCreated(CoreModule.f18264c.f20381e0.m116483Ka(str)).subscribe(psd0.m173596G(new y20() { // from class: l.gv4
            @Override // p153l.y20
            public final void call(Object obj) {
                uqb0.f180374G.m127125Q0(vDraweeView2, ux6.m198404b((User) obj).profileSmall());
            }
        })), act.duringCreated(CoreModule.f18264c.f20328M1.m111475t3(str).first()).subscribe(psd0.m173596G(new y20() { // from class: l.hv4
            @Override // p153l.y20
            public final void call(Object obj) {
                ov4.m169415d(jArr, vText2, str, jl80VarArr, (CoreBoxData) obj);
            }
        })), act.duringCreated(CoreModule.f18264c.f20427t1.m32512n("current_exclusive_progress_" + str)).subscribe(psd0.m173596G(new y20() { // from class: l.iv4
            @Override // p153l.y20
            public final void call(Object obj) {
                vText2.setText(RunnableC4884c0.m32505l(((RunnableC4884c0.b) obj).f20466d - pzi0.m174454o()) + "后结束，期间不能和其他好友聊天哦");
            }
        }))};
        c17971aNewDialog.m146023R(viewInflate);
        c17971aNewDialog.m146045n0(new DialogInterface.OnDismissListener() { // from class: l.jv4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ov4.m169418g(l4g0VarM204399c, kcg0VarArr, dialogInterface);
            }
        });
        c17971aNewDialog.m146034c0("知道了", new Runnable() { // from class: l.kv4
            @Override // java.lang.Runnable
            public final void run() {
                ov4.m169419h();
            }
        }).m146029X("提前结束专属聊天", new Runnable() { // from class: l.lv4
            @Override // java.lang.Runnable
            public final void run() {
                ov4.m169417f(act, str, jArr);
            }
        });
        final jl80[] jl80VarArr = {c17971aNewDialog.m146049r0()};
    }
}
