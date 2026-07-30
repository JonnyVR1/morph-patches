package p153l;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.google.common.collect.Lists;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import p137rx.C22421c;
import p153l.vuy;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ruy<T extends vuy> extends j3z<T> {

    /* JADX INFO: renamed from: b */
    public List<String> f164950b;

    /* JADX INFO: renamed from: c */
    public int f164951c;

    public ruy(ner nerVar) {
        super(nerVar);
        this.f164950b = new ArrayList();
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m183223i0(qzz qzzVar, Boolean bool) {
        if (bool.booleanValue()) {
            qzzVar.m178888B1();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m183224j0(Throwable th) {
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        String stringExtra = act().getIntent().getStringExtra("picked_messages");
        this.f164951c = act().getIntent().getIntExtra("max_limit", 100);
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        try {
            this.f164950b.clear();
            JSONArray jSONArray = new JSONArray(stringExtra);
            for (int i = 0; i < jSONArray.length(); i++) {
                this.f164950b.add(jSONArray.optString(i));
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: k0 */
    public int mo127908k0() {
        return 100;
    }

    /* JADX INFO: renamed from: l0 */
    public int mo127910l0() {
        return 100;
    }

    /* JADX INFO: renamed from: m0 */
    public List<String> m183225m0() {
        return this.f164950b;
    }

    /* JADX INFO: renamed from: n0 */
    public View m183226n0() {
        return ((vuy) this.viewModel).m202977e();
    }

    /* JADX INFO: renamed from: o0 */
    public View m183227o0() {
        return ((vuy) this.viewModel).m202978f();
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Boolean m183228p0(qzz qzzVar) throws Exception {
        List<Message> listM129496a0 = qzzVar.m178953j0().m129496a0();
        if (jyb.m147479J(listM129496a0)) {
            return Boolean.FALSE;
        }
        List listM15984q = Lists.m15984q(listM129496a0);
        for (int i = 0; i < listM15984q.size(); i++) {
            Message message = (Message) listM15984q.get(i);
            if (NullChecker.m82486a(message) && !message.f56859id.startsWith("fake_id_")) {
                jyb.m147524o(this.f164950b, message.f56859id);
                if (this.f164950b.size() >= this.f164951c) {
                    break;
                }
            }
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: q0 */
    public void m183229q0(boolean z) {
        final qzz qzzVarM111048t7 = m143372e0().mo50158l().m111048t7();
        if (z) {
            duringCreated(C22421c.fromCallable(new Callable() { // from class: l.ouy
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f149221a.m183228p0(qzzVarM111048t7);
                }
            })).compose(psd0.m173592C()).subscribe(psd0.m173597H(new y20() { // from class: l.puy
                @Override // p153l.y20
                public final void call(Object obj) {
                    ruy.m183223i0(qzzVarM111048t7, (Boolean) obj);
                }
            }, new y20() { // from class: l.quy
                @Override // p153l.y20
                public final void call(Object obj) {
                    ruy.m183224j0((Throwable) obj);
                }
            }));
        } else {
            this.f164950b.clear();
            qzzVarM111048t7.m178888B1();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public boolean m183230t0(String str, double d, boolean z) {
        List<String> list = this.f164950b;
        if (!z) {
            list.remove(str);
            return true;
        }
        if (list.size() >= this.f164951c) {
            return false;
        }
        jyb.m147524o(this.f164950b, str);
        return true;
    }

    /* JADX INFO: renamed from: u0 */
    public void m183231u0() {
        Intent intent = new Intent();
        intent.putStringArrayListExtra("message_picked", (ArrayList) this.f164950b);
        Act act = act();
        act();
        act.setResult(-1, intent);
        act().m68056e2();
    }

    /* JADX INFO: renamed from: y0 */
    public T m183232y0() {
        return (T) super.m143374g0();
    }

    /* JADX INFO: renamed from: r0 */
    public void mo127917r0() {
    }

    /* JADX INFO: renamed from: s0 */
    public void mo127919s0() {
    }

    /* JADX INFO: renamed from: x0 */
    public void mo127924x0(User user) {
    }
}
