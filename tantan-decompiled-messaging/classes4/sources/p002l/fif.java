package p002l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.ExpProfileInfoLoopEditAct;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.android.app.a;
import l.rzb0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class fif {
    /* JADX INFO: renamed from: a */
    public static void m13248a(Context context, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType, ExpLoopInputType expLoopInputType) {
        context.startActivity(ExpProfileInfoLoopEditAct.m1683X1(context, loopCreateEntryType, expLoopInputType, true, ""));
        if (context instanceof Activity) {
            ((Activity) context).overridePendingTransition(rzb0.y, rzb0.q);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m13249b(Act act, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType, ExpLoopInputType expLoopInputType, a.a aVar) {
        Intent intentM1683X1 = ExpProfileInfoLoopEditAct.m1683X1(act, loopCreateEntryType, expLoopInputType, true, "");
        if (aVar != null) {
            act.startActivityForResult(3500, intentM1683X1, aVar);
        } else {
            act.startActivity(intentM1683X1);
        }
        act.overridePendingTransition(rzb0.y, rzb0.q);
    }

    /* JADX INFO: renamed from: c */
    public static void m13250c(Frag frag, ExpLoopInputType expLoopInputType) {
        frag.startActivityForResult(ExpProfileInfoLoopEditAct.m1683X1(frag.getContext(), LoopFragmentFactory.LoopCreateEntryType.ENTRY_EDIT, expLoopInputType, false, ""), 3500);
        frag.getActivity().overridePendingTransition(rzb0.y, rzb0.q);
    }
}
