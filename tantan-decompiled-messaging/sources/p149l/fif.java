package p149l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.ExpProfileInfoLoopEditAct;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;

/* JADX INFO: loaded from: classes4.dex */
public class fif {
    /* JADX INFO: renamed from: a */
    public static void m121506a(Context context, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType, ExpLoopInputType expLoopInputType) {
        context.startActivity(ExpProfileInfoLoopEditAct.m51228X1(context, loopCreateEntryType, expLoopInputType, true, ""));
        if (context instanceof Activity) {
            ((Activity) context).overridePendingTransition(rzb0.f161653y, rzb0.f161645q);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m121507b(Act act, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType, ExpLoopInputType expLoopInputType, C4317a.a aVar) {
        Intent intentM51228X1 = ExpProfileInfoLoopEditAct.m51228X1(act, loopCreateEntryType, expLoopInputType, true, "");
        if (aVar != null) {
            act.startActivityForResult(3500, intentM51228X1, aVar);
        } else {
            act.startActivity(intentM51228X1);
        }
        act.overridePendingTransition(rzb0.f161653y, rzb0.f161645q);
    }

    /* JADX INFO: renamed from: c */
    public static void m121508c(Frag frag, ExpLoopInputType expLoopInputType) {
        frag.startActivityForResult(ExpProfileInfoLoopEditAct.m51228X1(frag.getContext(), LoopFragmentFactory.LoopCreateEntryType.ENTRY_EDIT, expLoopInputType, false, ""), 3500);
        frag.getActivity().overridePendingTransition(rzb0.f161653y, rzb0.f161645q);
    }
}
