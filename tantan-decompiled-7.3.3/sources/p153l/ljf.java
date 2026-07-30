package p153l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.ExpProfileInfoLoopEditAct;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;

/* JADX INFO: loaded from: classes4.dex */
public class ljf {
    /* JADX INFO: renamed from: a */
    public static void m154504a(Context context, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType, ExpLoopInputType expLoopInputType) {
        context.startActivity(ExpProfileInfoLoopEditAct.m52411Y1(context, loopCreateEntryType, expLoopInputType, true, ""));
        if (context instanceof Activity) {
            ((Activity) context).overridePendingTransition(x7c0.f192710y, x7c0.f192702q);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m154505b(Act act, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType, ExpLoopInputType expLoopInputType, C4468a.a aVar) {
        Intent intentM52411Y1 = ExpProfileInfoLoopEditAct.m52411Y1(act, loopCreateEntryType, expLoopInputType, true, "");
        if (aVar != null) {
            act.startActivityForResult(3500, intentM52411Y1, aVar);
        } else {
            act.startActivity(intentM52411Y1);
        }
        act.overridePendingTransition(x7c0.f192710y, x7c0.f192702q);
    }

    /* JADX INFO: renamed from: c */
    public static void m154506c(Frag frag, ExpLoopInputType expLoopInputType) {
        frag.startActivityForResult(ExpProfileInfoLoopEditAct.m52411Y1(frag.getContext(), LoopFragmentFactory.LoopCreateEntryType.ENTRY_EDIT, expLoopInputType, false, ""), 3500);
        frag.getActivity().overridePendingTransition(x7c0.f192710y, x7c0.f192702q);
    }
}
