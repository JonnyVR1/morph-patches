package p009l;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.Nullable;
import com.google.common.collect.Lists;
import com.p000p1.mobile.putong.core.newui.voicecall.VoiceCallAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import l.d30;
import l.lsi0;
import l.v9j;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class btm0 extends dtm0 {

    /* JADX INFO: renamed from: f */
    public final zpm0 f10303f;

    public btm0(tqm0 tqm0Var, qsm0 qsm0Var) {
        super(tqm0Var, qsm0Var);
        this.f10303f = new zpm0(this);
        m13478d(qsm0Var);
    }

    @Override // p009l.dtm0
    /* JADX INFO: renamed from: c */
    public void mo12238c(int i) {
        Activity activity = Act.foreground_() == null ? null : (Activity) Act.foreground_().a.get();
        m13477b(i);
        if (i == 0) {
            m13479h(activity, 0);
            return;
        }
        if (i != 1) {
            return;
        }
        if (m13476a() == 0) {
            m13479h(activity, 1);
        }
        if (activity != null) {
            activity.startActivity(VoiceCallAct.m8088Z1(activity));
        }
    }

    @Override // p009l.dtm0
    /* JADX INFO: renamed from: e */
    public void mo12239e(Activity activity) {
        if (this.f11988a.m21253n()) {
            m13479h(activity, 0);
        } else {
            m12243m(activity);
        }
    }

    @Override // p009l.dtm0
    /* JADX INFO: renamed from: f */
    public void mo12240f(@Nullable Context context) {
        if (context instanceof Activity) {
            this.f10303f.m25913c(m13476a(), (Activity) context, this.f11988a.m21251l());
        }
    }

    @Override // p009l.dtm0
    /* JADX INFO: renamed from: g */
    public void mo12241g(Context context) {
        m13479h(context, 2);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m12242l(Activity activity, String str) {
        if (!(activity instanceof Act)) {
            return false;
        }
        ArrayList arrayList = (ArrayList) Act.globalLifeCycle_().get(Integer.valueOf(((Act) activity).getTaskId()));
        ArrayList arrayList2 = new ArrayList();
        if (vwb.J(arrayList)) {
            return false;
        }
        for (Act.r rVar : Lists.q(arrayList)) {
            if (NullChecker.a(rVar.a) && NullChecker.a(rVar.a.get())) {
                if (rVar.a.get() instanceof VoiceCallAct) {
                    if (vwb.J(arrayList2)) {
                        return false;
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((Activity) it.next()).finish();
                    }
                    return true;
                }
                arrayList2.add((Activity) rVar.a.get());
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m12243m(Activity activity) {
        if (activity instanceof VoiceCallAct) {
            m13479h(activity, 1);
        } else if (m13476a() == 1) {
            m13479h(activity, 2);
        } else {
            this.f10303f.m25913c(m13476a(), activity, this.f11988a.m21251l());
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Boolean m12244n(Activity activity) {
        if (m12242l(activity, this.f11988a.m21251l())) {
            return Boolean.TRUE;
        }
        activity.startActivity(VoiceCallAct.m8088Z1(activity));
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m12245o() {
        this.f11989b.m22649o(false);
    }

    /* JADX INFO: renamed from: p */
    public void m12246p(final Activity activity) {
        mqm0.m18565h().m18576o("voice_entry_floating");
        if (CoreModule.Q().m9038Zo().m24729b()) {
            lsi0.y("当前正在语聊中，无法语音电话");
        } else {
            ssm0.m22365a(new v9j() { // from class: l.zsm0
                public final Object call() {
                    return this.f23864a.m12244n(activity);
                }
            }, new d30() { // from class: l.atm0
                public final void call() {
                    this.f9677a.m12245o();
                }
            });
        }
    }
}
