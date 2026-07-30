package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.data.AccountRecord;
import com.p051p1.mobile.putong.core.p058ui.svip.WithdrawRecordsItemView;
import com.p051p1.mobile.putong.core.pay.R$string;
import java.util.ArrayList;
import java.util.List;
import p151v.VProgressBar;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class ohq0 implements iam<nhq0> {

    /* JADX INFO: renamed from: a */
    public VProgressBar f147473a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f147474b;

    /* JADX INFO: renamed from: c */
    public VText f147475c;

    /* JADX INFO: renamed from: d */
    public VRecyclerView f147476d;

    /* JADX INFO: renamed from: e */
    public final PutongAct f147477e;

    /* JADX INFO: renamed from: f */
    public C19137a f147478f;

    /* JADX INFO: renamed from: l.ohq0$a */
    public class C19137a extends jic0<AccountRecord> {

        /* JADX INFO: renamed from: c */
        public List<AccountRecord> f147479c;

        public C19137a() {
            this.f147479c = new ArrayList();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int mo29823C() {
            return this.f147479c.size();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            return p9r.m171370a(ohq0.this.f147477e).inflate(rec0.f162559h2, viewGroup, false);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, AccountRecord accountRecord, int i, int i2) {
            ((WithdrawRecordsItemView) view).m57024i0(accountRecord, i2 != mo29823C() - 1);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public AccountRecord getItem(int i) {
            return this.f147479c.get(i);
        }

        /* JADX INFO: renamed from: G */
        public void m167720G(List<AccountRecord> list) {
            this.f147479c.clear();
            this.f147479c.addAll(list);
            notifyDataSetChanged();
        }
    }

    public ohq0(PutongAct putongAct) {
        this.f147477e = putongAct;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f147477e;
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f147477e;
    }

    /* JADX INFO: renamed from: b */
    public View m167714b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return qhq0.m176612b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d */
    public void m167716d(List<AccountRecord> list) {
        boolean zM147479J = jyb.m147479J(list);
        VProgressBar vProgressBar = this.f147473a;
        if (zM147479J) {
            bnl0.m105524M(vProgressBar, false);
            bnl0.m105524M(this.f147474b, true);
            bnl0.m105524M(this.f147476d, false);
        } else {
            bnl0.m105524M(vProgressBar, false);
            bnl0.m105524M(this.f147474b, false);
            bnl0.m105524M(this.f147476d, true);
            this.f147478f.m167720G(list);
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m167714b(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m167717r() {
        act().setTitle(R$string.f28415pa);
        this.f147475c.setText(R$string.f28403oa);
        this.f147476d.setLayoutManager(new LinearLayoutManager(this.f147477e));
        C19137a c19137a = new C19137a();
        this.f147478f = c19137a;
        this.f147476d.setAdapter(c19137a);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(nhq0 nhq0Var) {
    }
}
