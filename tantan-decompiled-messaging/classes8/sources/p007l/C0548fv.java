package p007l;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p003p1.mobile.android.app.Act;
import com.p003p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.data.ProtocolItemBean;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.a5c0;
import l.cwf0;
import l.eqh0;
import l.i0e;
import l.j760;
import l.n6c0;
import l.o7r;
import l.xdl0;
import l.zvf0;

/* JADX INFO: renamed from: l.fv */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class C0548fv extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: a */
    public List<ProtocolItemBean> f2742a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public Act f2743b;

    /* JADX INFO: renamed from: l.fv$a */
    public class a implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f2744a;

        public a(cwf0 cwf0Var) {
            this.f2744a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.e(this.f2744a);
        }
    }

    /* JADX INFO: renamed from: l.fv$b */
    public class b extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a */
        public CheckBox f2746a;

        /* JADX INFO: renamed from: b */
        public TextView f2747b;

        /* JADX INFO: renamed from: c */
        public TextView f2748c;

        public b(View view) {
            super(view);
            this.f2746a = (CheckBox) view.findViewById(a5c0.d);
            this.f2747b = (TextView) view.findViewById(a5c0.Z);
            TextView textView = (TextView) view.findViewById(a5c0.a0);
            this.f2748c = textView;
            textView.setTypeface(eqh0.c(3), 1);
        }
    }

    public C0548fv(Act act) {
        this.f2743b = act;
    }

    /* JADX INFO: renamed from: C */
    public List<ProtocolItemBean> m9167C() {
        return this.f2742a;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m9168D(b bVar, int i, View view) {
        zvf0.r("e_settle_account_popup_confirm", "p_settle_account_popup");
        bVar.f2746a.setChecked(true);
        this.f2742a.get(i).isShow = true;
        this.f2742a.get(i).isCheck = true;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m9169E(final int i, final b bVar, View view) {
        if (i == 0 && !this.f2742a.get(i).isShow) {
            zvf0.v("e_delete_account_interact_block_button", this.f2743b.pageId(), new j760[]{new j760("select_click_type", "settle_account")});
            bVar.f2746a.setChecked(false);
            cwf0 cwf0VarC = i0e.c("p_settle_account_popup", Dialog.class.getName());
            xh0.C0776a c0776aM11804c = new xh0.C0776a(this.f2743b).m11820s("账号内钱包结清").m11811j("通过使用探探服务获得的资产或虚拟权益等财产性利益，您可以选择提现或消费，若直接注销则视为您主动放弃，是否确认舍弃？").m11819r("我再想想").m11807f("确认舍弃").m11808g(false).m11814m(new a(cwf0VarC)).m11809h(false).m11816o(new View.OnClickListener() { // from class: l.dv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    zvf0.r("e_settle_account_popup_cancel", "p_settle_account_popup");
                }
            }).m11804c(new View.OnClickListener() { // from class: l.ev
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f2644a.m9168D(bVar, i, view2);
                }
            });
            i0e.f(cwf0VarC);
            c0776aM11804c.m11802a().m11801g();
            return;
        }
        if (i == 0 && this.f2742a.get(i).isShow) {
            zvf0.v("e_delete_account_interact_block_button", this.f2743b.pageId(), new j760[]{new j760("select_click_type", "settle_account")});
            this.f2742a.get(i).isShow = false;
            bVar.f2746a.setChecked(!this.f2742a.get(i).isCheck);
            this.f2742a.get(i).isCheck = !this.f2742a.get(i).isCheck;
            return;
        }
        if (i == 1) {
            zvf0.v("e_delete_account_interact_block_button", this.f2743b.pageId(), new j760[]{new j760("select_click_type", "settle_vip")});
        } else if (i == 2) {
            zvf0.v("e_delete_account_interact_block_button", this.f2743b.pageId(), new j760[]{new j760("select_click_type", "block_infor")});
        } else if (i == 3) {
            zvf0.v("e_delete_account_interact_block_button", this.f2743b.pageId(), new j760[]{new j760("select_click_type", "auto_pay")});
        } else if (i == 4) {
            zvf0.v("e_delete_account_interact_block_button", this.f2743b.pageId(), new j760[]{new j760("select_click_type", "security_check")});
        }
        bVar.f2746a.setChecked(!this.f2742a.get(i).isCheck);
        this.f2742a.get(i).isCheck = !this.f2742a.get(i).isCheck;
    }

    @SuppressLint({"RecyclerView"})
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull final b bVar, final int i) {
        bVar.f2747b.setText(this.f2742a.get(i).tip);
        bVar.f2748c.setText(this.f2742a.get(i).title);
        bVar.f2746a.setChecked(this.f2742a.get(i).isCheck);
        xdl0.E0(bVar.f2746a, new View.OnClickListener() { // from class: l.cv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2485a.m9169E(i, bVar, view);
            }
        });
    }

    @NonNull
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new b(o7r.a(this.f2743b).inflate(n6c0.l, viewGroup, false));
    }

    /* JADX INFO: renamed from: H */
    public void m9172H(List<ProtocolItemBean> list) {
        if (NullChecker.a(list)) {
            this.f2742a.clear();
            this.f2742a.addAll(list);
            notifyDataSetChanged();
        }
    }

    public int getItemCount() {
        return 5;
    }
}
