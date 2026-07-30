package p002l;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.google.common.collect.Lists;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.muy;
import l.tqz;
import l.vwb;
import l.yly;
import org.json.JSONArray;
import org.json.JSONException;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class uly<T extends yly> extends muy<T> {

    /* JADX INFO: renamed from: b */
    public List<String> f20705b;

    /* JADX INFO: renamed from: c */
    public int f20706c;

    public uly(mcr mcrVar) {
        super(mcrVar);
        this.f20705b = new ArrayList();
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m23520i0(tqz tqzVar, Boolean bool) {
        if (bool.booleanValue()) {
            tqzVar.B1();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m23521j0(Throwable th) {
    }

    /* JADX INFO: renamed from: Z */
    public void m23522Z() {
        super/*l.jq2*/.Z();
        String stringExtra = act().getIntent().getStringExtra("picked_messages");
        this.f20706c = act().getIntent().getIntExtra("max_limit", 100);
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        try {
            this.f20705b.clear();
            JSONArray jSONArray = new JSONArray(stringExtra);
            for (int i = 0; i < jSONArray.length(); i++) {
                this.f20705b.add(jSONArray.optString(i));
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: k0 */
    public int m23523k0() {
        return 100;
    }

    /* JADX INFO: renamed from: l0 */
    public int m23524l0() {
        return 100;
    }

    /* JADX INFO: renamed from: m0 */
    public List<String> m23525m0() {
        return this.f20705b;
    }

    /* JADX INFO: renamed from: n0 */
    public View m23526n0() {
        return ((jq2) this).viewModel.e();
    }

    /* JADX INFO: renamed from: o0 */
    public View m23527o0() {
        return ((jq2) this).viewModel.f();
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Boolean m23528p0(tqz tqzVar) throws Exception {
        List listA0 = tqzVar.j0().a0();
        if (vwb.J(listA0)) {
            return Boolean.FALSE;
        }
        List listQ = Lists.q(listA0);
        for (int i = 0; i < listQ.size(); i++) {
            Message message = (Message) listQ.get(i);
            if (NullChecker.a(message) && !((DbObject) message).id.startsWith("fake_id_")) {
                vwb.o(this.f20705b, ((DbObject) message).id);
                if (this.f20705b.size() >= this.f20706c) {
                    break;
                }
            }
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: q0 */
    public void m23529q0(boolean z) {
        final tqz tqzVarT7 = e0().l().t7();
        if (z) {
            duringCreated(c.fromCallable(new Callable() { // from class: l.rly
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f18602a.m23528p0(tqzVarT7);
                }
            })).compose(mkd0.C()).subscribe(mkd0.H(new e30() { // from class: l.sly
                public final void call(Object obj) {
                    uly.m23520i0(tqzVarT7, (Boolean) obj);
                }
            }, new e30() { // from class: l.tly
                public final void call(Object obj) {
                    uly.m23521j0((Throwable) obj);
                }
            }));
        } else {
            this.f20705b.clear();
            tqzVarT7.B1();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public boolean m23532t0(String str, double d, boolean z) {
        List<String> list = this.f20705b;
        if (!z) {
            list.remove(str);
            return true;
        }
        if (list.size() >= this.f20706c) {
            return false;
        }
        vwb.o(this.f20705b, str);
        return true;
    }

    /* JADX INFO: renamed from: u0 */
    public void m23533u0() {
        Intent intent = new Intent();
        intent.putStringArrayListExtra("message_picked", (ArrayList) this.f20705b);
        Act act = act();
        act();
        act.setResult(-1, intent);
        act().finish();
    }

    /* JADX INFO: renamed from: y0 */
    public T m23535y0() {
        return super.g0();
    }

    /* JADX INFO: renamed from: r0 */
    public void m23530r0() {
    }

    /* JADX INFO: renamed from: s0 */
    public void m23531s0() {
    }

    /* JADX INFO: renamed from: x0 */
    public void m23534x0(User user) {
    }
}
