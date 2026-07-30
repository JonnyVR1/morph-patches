package p149l;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.google.common.collect.Lists;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import p133rx.C22306c;
import p149l.yly;

/* JADX INFO: loaded from: classes4.dex */
public abstract class uly<T extends yly> extends muy<T> {

    /* JADX INFO: renamed from: b */
    public List<String> f177177b;

    /* JADX INFO: renamed from: c */
    public int f177178c;

    public uly(mcr mcrVar) {
        super(mcrVar);
        this.f177177b = new ArrayList();
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m194274i0(tqz tqzVar, Boolean bool) {
        if (bool.booleanValue()) {
            tqzVar.m190248B1();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m194275j0(Throwable th) {
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        String stringExtra = act().getIntent().getStringExtra("picked_messages");
        this.f177178c = act().getIntent().getIntExtra("max_limit", 100);
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        try {
            this.f177177b.clear();
            JSONArray jSONArray = new JSONArray(stringExtra);
            for (int i = 0; i < jSONArray.length(); i++) {
                this.f177177b.add(jSONArray.optString(i));
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: k0 */
    public int mo137233k0() {
        return 100;
    }

    /* JADX INFO: renamed from: l0 */
    public int mo137235l0() {
        return 100;
    }

    /* JADX INFO: renamed from: m0 */
    public List<String> m194276m0() {
        return this.f177177b;
    }

    /* JADX INFO: renamed from: n0 */
    public View m194277n0() {
        return ((yly) this.viewModel).m215319e();
    }

    /* JADX INFO: renamed from: o0 */
    public View m194278o0() {
        return ((yly) this.viewModel).m215320f();
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Boolean m194279p0(tqz tqzVar) throws Exception {
        List<Message> listM139109a0 = tqzVar.m190310j0().m139109a0();
        if (vwb.m200296J(listM139109a0)) {
            return Boolean.FALSE;
        }
        List listM15930q = Lists.m15930q(listM139109a0);
        for (int i = 0; i < listM15930q.size(); i++) {
            Message message = (Message) listM15930q.get(i);
            if (NullChecker.m81303a(message) && !message.f56011id.startsWith("fake_id_")) {
                vwb.m200341o(this.f177177b, message.f56011id);
                if (this.f177177b.size() >= this.f177178c) {
                    break;
                }
            }
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: q0 */
    public void m194280q0(boolean z) {
        final tqz tqzVarM120842t7 = m156455e0().mo48974l().m120842t7();
        if (z) {
            duringCreated(C22306c.fromCallable(new Callable() { // from class: l.rly
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f160037a.m194279p0(tqzVarM120842t7);
                }
            })).compose(mkd0.m154951C()).subscribe(mkd0.m154956H(new e30() { // from class: l.sly
                @Override // p149l.e30
                public final void call(Object obj) {
                    uly.m194274i0(tqzVarM120842t7, (Boolean) obj);
                }
            }, new e30() { // from class: l.tly
                @Override // p149l.e30
                public final void call(Object obj) {
                    uly.m194275j0((Throwable) obj);
                }
            }));
        } else {
            this.f177177b.clear();
            tqzVarM120842t7.m190248B1();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public boolean m194281t0(String str, double d, boolean z) {
        List<String> list = this.f177177b;
        if (!z) {
            list.remove(str);
            return true;
        }
        if (list.size() >= this.f177178c) {
            return false;
        }
        vwb.m200341o(this.f177177b, str);
        return true;
    }

    /* JADX INFO: renamed from: u0 */
    public void m194282u0() {
        Intent intent = new Intent();
        intent.putStringArrayListExtra("message_picked", (ArrayList) this.f177177b);
        Act act = act();
        act();
        act.setResult(-1, intent);
        act().m66873d2();
    }

    /* JADX INFO: renamed from: y0 */
    public T m194283y0() {
        return (T) super.m156457g0();
    }

    /* JADX INFO: renamed from: r0 */
    public void mo137242r0() {
    }

    /* JADX INFO: renamed from: s0 */
    public void mo137244s0() {
    }

    /* JADX INFO: renamed from: x0 */
    public void mo137249x0(User user) {
    }
}
