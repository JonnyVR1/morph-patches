package p153l;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.data.ProtocolItemBean;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.zu */
/* JADX INFO: loaded from: classes9.dex */
public class C21897zu extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: a */
    public List<ProtocolItemBean> f206074a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public Act f206075b;

    /* JADX INFO: renamed from: l.zu$a */
    public class a implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l4g0 f206076a;

        public a(l4g0 l4g0Var) {
            this.f206076a = l4g0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            w1e.m204401e(this.f206076a);
        }
    }

    /* JADX INFO: renamed from: l.zu$b */
    public class b extends RecyclerView.AbstractC0569e0 {

        /* JADX INFO: renamed from: a */
        public CheckBox f206078a;

        /* JADX INFO: renamed from: b */
        public TextView f206079b;

        /* JADX INFO: renamed from: c */
        public TextView f206080c;

        public b(View view) {
            super(view);
            this.f206078a = (CheckBox) view.findViewById(gdc0.f103674d);
            this.f206079b = (TextView) view.findViewById(gdc0.f103667Z);
            TextView textView = (TextView) view.findViewById(gdc0.f103669a0);
            this.f206080c = textView;
            textView.setTypeface(lyh0.m156283c(3), 1);
        }
    }

    public C21897zu(Act act) {
        this.f206075b = act;
    }

    /* JADX INFO: renamed from: C */
    public List<ProtocolItemBean> m221584C() {
        return this.f206074a;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m221585D(b bVar, int i, View view) {
        i4g0.m138520r("e_settle_account_popup_confirm", "p_settle_account_popup");
        bVar.f206078a.setChecked(true);
        this.f206074a.get(i).isShow = true;
        this.f206074a.get(i).isCheck = true;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m221586E(final int i, final b bVar, View view) {
        if (i == 0 && !this.f206074a.get(i).isShow) {
            i4g0.m138524v("e_delete_account_interact_block_button", this.f206075b.pageId(), new pf60("select_click_type", "settle_account"));
            bVar.f206078a.setChecked(false);
            l4g0 l4g0VarM204399c = w1e.m204399c("p_settle_account_popup", Dialog.class.getName());
            th0.C20312a c20312aM191144c = new th0.C20312a(this.f206075b).m191160s("账号内钱包结清").m191151j("通过使用探探服务获得的资产或虚拟权益等财产性利益，您可以选择提现或消费，若直接注销则视为您主动放弃，是否确认舍弃？").m191159r("我再想想").m191147f("确认舍弃").m191148g(false).m191154m(new a(l4g0VarM204399c)).m191149h(false).m191156o(new View.OnClickListener() { // from class: l.xu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    i4g0.m138520r("e_settle_account_popup_cancel", "p_settle_account_popup");
                }
            }).m191144c(new View.OnClickListener() { // from class: l.yu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f201559a.m221585D(bVar, i, view2);
                }
            });
            w1e.m204402f(l4g0VarM204399c);
            c20312aM191144c.m191142a().m191141g();
            return;
        }
        if (i == 0 && this.f206074a.get(i).isShow) {
            i4g0.m138524v("e_delete_account_interact_block_button", this.f206075b.pageId(), new pf60("select_click_type", "settle_account"));
            this.f206074a.get(i).isShow = false;
            bVar.f206078a.setChecked(!this.f206074a.get(i).isCheck);
            this.f206074a.get(i).isCheck = !this.f206074a.get(i).isCheck;
            return;
        }
        if (i == 1) {
            i4g0.m138524v("e_delete_account_interact_block_button", this.f206075b.pageId(), new pf60("select_click_type", "settle_vip"));
        } else if (i == 2) {
            i4g0.m138524v("e_delete_account_interact_block_button", this.f206075b.pageId(), new pf60("select_click_type", "block_infor"));
        } else if (i == 3) {
            i4g0.m138524v("e_delete_account_interact_block_button", this.f206075b.pageId(), new pf60("select_click_type", "auto_pay"));
        } else if (i == 4) {
            i4g0.m138524v("e_delete_account_interact_block_button", this.f206075b.pageId(), new pf60("select_click_type", "security_check"));
        }
        bVar.f206078a.setChecked(!this.f206074a.get(i).isCheck);
        this.f206074a.get(i).isCheck = !this.f206074a.get(i).isCheck;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @SuppressLint({"RecyclerView"})
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull final b bVar, final int i) {
        bVar.f206079b.setText(this.f206074a.get(i).tip);
        bVar.f206080c.setText(this.f206074a.get(i).title);
        bVar.f206078a.setChecked(this.f206074a.get(i).isCheck);
        bnl0.m105509E0(bVar.f206078a, new View.OnClickListener() { // from class: l.wu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f190825a.m221586E(i, bVar, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new b(p9r.m171370a(this.f206075b).inflate(sec0.f167576l, viewGroup, false));
    }

    /* JADX INFO: renamed from: H */
    public void m221589H(List<ProtocolItemBean> list) {
        if (NullChecker.m82486a(list)) {
            this.f206074a.clear();
            this.f206074a.addAll(list);
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 5;
    }
}
