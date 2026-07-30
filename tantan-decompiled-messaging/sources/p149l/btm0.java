package p149l;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.Nullable;
import com.google.common.collect.Lists;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.voicecall.VoiceCallAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class btm0 extends dtm0 {

    /* JADX INFO: renamed from: f */
    public final zpm0 f77248f;

    public btm0(tqm0 tqm0Var, qsm0 qsm0Var) {
        super(tqm0Var, qsm0Var);
        this.f77248f = new zpm0(this);
        m113577d(qsm0Var);
    }

    @Override // p149l.dtm0
    /* JADX INFO: renamed from: c */
    public void mo103873c(int i) {
        Activity activity = Act.foreground_() == null ? null : Act.foreground_().f15343a.get();
        m113576b(i);
        if (i == 0) {
            m113578h(activity, 0);
            return;
        }
        if (i != 1) {
            return;
        }
        if (m113575a() == 0) {
            m113578h(activity, 1);
        }
        if (activity != null) {
            activity.startActivity(VoiceCallAct.m43824Z1(activity));
        }
    }

    @Override // p149l.dtm0
    /* JADX INFO: renamed from: e */
    public void mo103874e(Activity activity) {
        if (this.f87855a.m176320n()) {
            m113578h(activity, 0);
        } else {
            m103878m(activity);
        }
    }

    @Override // p149l.dtm0
    /* JADX INFO: renamed from: f */
    public void mo103875f(@Nullable Context context) {
        if (context instanceof Activity) {
            this.f77248f.m219697c(m113575a(), (Activity) context, this.f87855a.m176318l());
        }
    }

    @Override // p149l.dtm0
    /* JADX INFO: renamed from: g */
    public void mo103876g(Context context) {
        m113578h(context, 2);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m103877l(Activity activity, String str) {
        if (!(activity instanceof Act)) {
            return false;
        }
        ArrayList<Act.C4299r> arrayList = Act.globalLifeCycle_().get(Integer.valueOf(((Act) activity).getTaskId()));
        ArrayList arrayList2 = new ArrayList();
        if (vwb.m200296J(arrayList)) {
            return false;
        }
        for (Act.C4299r c4299r : Lists.m15930q(arrayList)) {
            if (NullChecker.m81303a(c4299r.f15343a) && NullChecker.m81303a(c4299r.f15343a.get())) {
                if (c4299r.f15343a.get() instanceof VoiceCallAct) {
                    if (vwb.m200296J(arrayList2)) {
                        return false;
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((Activity) it.next()).finish();
                    }
                    return true;
                }
                arrayList2.add(c4299r.f15343a.get());
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m103878m(Activity activity) {
        if (activity instanceof VoiceCallAct) {
            m113578h(activity, 1);
        } else if (m113575a() == 1) {
            m113578h(activity, 2);
        } else {
            this.f77248f.m219697c(m113575a(), activity, this.f87855a.m176318l());
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Boolean m103879n(Activity activity) {
        if (m103877l(activity, this.f87855a.m176318l())) {
            return Boolean.TRUE;
        }
        activity.startActivity(VoiceCallAct.m43824Z1(activity));
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m103880o() {
        this.f87856b.m190143o(false);
    }

    /* JADX INFO: renamed from: p */
    public void m103881p(final Activity activity) {
        mqm0.m155965h().m155976o("voice_entry_floating");
        if (CoreModule.m29936Q().mo67253Zo().mo111891b()) {
            lsi0.m151595y("当前正在语聊中，无法语音电话");
        } else {
            ssm0.m185757a(new v9j() { // from class: l.zsm0
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f204612a.m103879n(activity);
                }
            }, new d30() { // from class: l.atm0
                @Override // p149l.d30
                public final void call() {
                    this.f71634a.m103880o();
                }
            });
        }
    }
}
