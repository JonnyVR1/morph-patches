package p006l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.core.p004ui.svip.WithdrawRecordsItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.AccountRecord;
import com.p1.mobile.putong.core.pay.R;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.l8q0;
import l.m6c0;
import l.o7r;
import l.s7m;
import l.vwb;
import l.xdl0;
import v.VProgressBar;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class j8q0 implements s7m<i8q0> {

    /* JADX INFO: renamed from: a */
    public VProgressBar f15065a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f15066b;

    /* JADX INFO: renamed from: c */
    public VText f15067c;

    /* JADX INFO: renamed from: d */
    public VRecyclerView f15068d;

    /* JADX INFO: renamed from: e */
    public final PutongAct f15069e;

    /* JADX INFO: renamed from: f */
    public C0876a f15070f;

    /* JADX INFO: renamed from: l.j8q0$a */
    public class C0876a extends dac0<AccountRecord> {

        /* JADX INFO: renamed from: c */
        public List<AccountRecord> f15071c;

        public C0876a() {
            this.f15071c = new ArrayList();
        }

        /* JADX INFO: renamed from: C */
        public int m17400C() {
            return this.f15071c.size();
        }

        /* JADX INFO: renamed from: D */
        public View m17401D(ViewGroup viewGroup, int i) {
            return o7r.a(j8q0.this.f15069e).inflate(m6c0.h2, viewGroup, false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void m17399A(View view, AccountRecord accountRecord, int i, int i2) {
            ((WithdrawRecordsItemView) view).m9239i0(accountRecord, i2 != m17400C() - 1);
        }

        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public AccountRecord getItem(int i) {
            return this.f15071c.get(i);
        }

        /* JADX INFO: renamed from: G */
        public void m17404G(List<AccountRecord> list) {
            this.f15071c.clear();
            this.f15071c.addAll(list);
            notifyDataSetChanged();
        }
    }

    public j8q0(PutongAct putongAct) {
        this.f15069e = putongAct;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m17393C0() {
        return this.f15069e;
    }

    @Nullable
    public Act act() {
        return this.f15069e;
    }

    /* JADX INFO: renamed from: b */
    public View m17394b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return l8q0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d */
    public void m17396d(List<AccountRecord> list) {
        boolean zJ = vwb.J(list);
        VProgressBar vProgressBar = this.f15065a;
        if (zJ) {
            xdl0.M(vProgressBar, false);
            xdl0.M(this.f15066b, true);
            xdl0.M(this.f15068d, false);
        } else {
            xdl0.M(vProgressBar, false);
            xdl0.M(this.f15066b, false);
            xdl0.M(this.f15068d, true);
            this.f15070f.m17404G(list);
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m17394b(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m17398r() {
        act().setTitle(R.string.pa);
        this.f15067c.setText(R.string.oa);
        this.f15068d.setLayoutManager(new LinearLayoutManager(this.f15069e));
        C0876a c0876a = new C0876a();
        this.f15070f = c0876a;
        this.f15068d.setAdapter(c0876a);
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m17397i1(i8q0 i8q0Var) {
    }
}
