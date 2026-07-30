package p153l;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.Nullable;
import com.google.common.collect.Lists;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.voicecall.VoiceCallAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class f2n0 extends h2n0 {

    /* JADX INFO: renamed from: f */
    public final dzm0 f96892f;

    public f2n0(xzm0 xzm0Var, u1n0 u1n0Var) {
        super(xzm0Var, u1n0Var);
        this.f96892f = new dzm0(this);
        m133397d(u1n0Var);
    }

    @Override // p153l.h2n0
    /* JADX INFO: renamed from: c */
    public void mo123637c(int i) {
        Activity activity = Act.foreground_() == null ? null : Act.foreground_().f16062a.get();
        m133396b(i);
        if (i == 0) {
            m133398h(activity, 0);
            return;
        }
        if (i != 1) {
            return;
        }
        if (m133395a() == 0) {
            m133398h(activity, 1);
        }
        if (activity != null) {
            activity.startActivity(VoiceCallAct.m45010a2(activity));
        }
    }

    @Override // p153l.h2n0
    /* JADX INFO: renamed from: e */
    public void mo123638e(Activity activity) {
        if (this.f107568a.m194038n()) {
            m133398h(activity, 0);
        } else {
            m123642m(activity);
        }
    }

    @Override // p153l.h2n0
    /* JADX INFO: renamed from: f */
    public void mo123639f(@Nullable Context context) {
        if (context instanceof Activity) {
            this.f96892f.m118753c(m133395a(), (Activity) context, this.f107568a.m194036l());
        }
    }

    @Override // p153l.h2n0
    /* JADX INFO: renamed from: g */
    public void mo123640g(Context context) {
        m133398h(context, 2);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m123641l(Activity activity, String str) {
        if (!(activity instanceof Act)) {
            return false;
        }
        ArrayList<Act.C4450r> arrayList = Act.globalLifeCycle_().get(Integer.valueOf(((Act) activity).getTaskId()));
        ArrayList arrayList2 = new ArrayList();
        if (jyb.m147479J(arrayList)) {
            return false;
        }
        for (Act.C4450r c4450r : Lists.m15984q(arrayList)) {
            if (NullChecker.m82486a(c4450r.f16062a) && NullChecker.m82486a(c4450r.f16062a.get())) {
                if (c4450r.f16062a.get() instanceof VoiceCallAct) {
                    if (jyb.m147479J(arrayList2)) {
                        return false;
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((Activity) it.next()).finish();
                    }
                    return true;
                }
                arrayList2.add(c4450r.f16062a.get());
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m123642m(Activity activity) {
        if (activity instanceof VoiceCallAct) {
            m133398h(activity, 1);
        } else if (m133395a() == 1) {
            m133398h(activity, 2);
        } else {
            this.f96892f.m118753c(m133395a(), activity, this.f107568a.m194036l());
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Boolean m123643n(Activity activity) {
        if (m123641l(activity, this.f107568a.m194036l())) {
            return Boolean.TRUE;
        }
        activity.startActivity(VoiceCallAct.m45010a2(activity));
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m123644o() {
        this.f107569b.m213772o(false);
    }

    /* JADX INFO: renamed from: p */
    public void m123645p(final Activity activity) {
        qzm0.m178812h().m178823o("voice_entry_floating");
        if (CoreModule.m30934Q().mo68436Zo().mo136898b()) {
            o1j0.m165651y("当前正在语聊中，无法语音电话");
        } else {
            w1n0.m204454a(new pcj() { // from class: l.d2n0
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f84801a.m123643n(activity);
                }
            }, new x20() { // from class: l.e2n0
                @Override // p153l.x20
                public final void call() {
                    this.f91801a.m123644o();
                }
            });
        }
    }
}
