package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.data.AccountRecord;
import com.p046p1.mobile.putong.core.p053ui.svip.WithdrawRecordsItemView;
import com.p046p1.mobile.putong.core.pay.R$string;
import java.util.ArrayList;
import java.util.List;
import p147v.VProgressBar;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class j8q0 implements s7m<i8q0> {

    /* JADX INFO: renamed from: a */
    public VProgressBar f116770a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f116771b;

    /* JADX INFO: renamed from: c */
    public VText f116772c;

    /* JADX INFO: renamed from: d */
    public VRecyclerView f116773d;

    /* JADX INFO: renamed from: e */
    public final PutongAct f116774e;

    /* JADX INFO: renamed from: f */
    public C17713a f116775f;

    /* JADX INFO: renamed from: l.j8q0$a */
    public class C17713a extends dac0<AccountRecord> {

        /* JADX INFO: renamed from: c */
        public List<AccountRecord> f116776c;

        public C17713a() {
            this.f116776c = new ArrayList();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int mo28824C() {
            return this.f116776c.size();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            return o7r.m163037a(j8q0.this.f116774e).inflate(m6c0.f131599h2, viewGroup, false);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, AccountRecord accountRecord, int i, int i2) {
            ((WithdrawRecordsItemView) view).m55841i0(accountRecord, i2 != mo28824C() - 1);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public AccountRecord getItem(int i) {
            return this.f116776c.get(i);
        }

        /* JADX INFO: renamed from: G */
        public void m140339G(List<AccountRecord> list) {
            this.f116776c.clear();
            this.f116776c.addAll(list);
            notifyDataSetChanged();
        }
    }

    public j8q0(PutongAct putongAct) {
        this.f116774e = putongAct;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f116774e;
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f116774e;
    }

    /* JADX INFO: renamed from: b */
    public View m140333b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return l8q0.m148950b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d */
    public void m140335d(List<AccountRecord> list) {
        boolean zM200296J = vwb.m200296J(list);
        VProgressBar vProgressBar = this.f116770a;
        if (zM200296J) {
            xdl0.m208344M(vProgressBar, false);
            xdl0.m208344M(this.f116771b, true);
            xdl0.m208344M(this.f116773d, false);
        } else {
            xdl0.m208344M(vProgressBar, false);
            xdl0.m208344M(this.f116771b, false);
            xdl0.m208344M(this.f116773d, true);
            this.f116775f.m140339G(list);
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m140333b(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m140336r() {
        act().setTitle(R$string.f27567pa);
        this.f116772c.setText(R$string.f27555oa);
        this.f116773d.setLayoutManager(new LinearLayoutManager(this.f116774e));
        C17713a c17713a = new C17713a();
        this.f116775f = c17713a;
        this.f116773d.setAdapter(c17713a);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(i8q0 i8q0Var) {
    }
}
