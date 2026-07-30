package p149l;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.data.ProtocolItemBean;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.fv */
/* JADX INFO: loaded from: classes8.dex */
public class C16923fv extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: a */
    public List<ProtocolItemBean> f99374a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public Act f99375b;

    /* JADX INFO: renamed from: l.fv$a */
    public class a implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f99376a;

        public a(cwf0 cwf0Var) {
            this.f99376a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.m133796e(this.f99376a);
        }
    }

    /* JADX INFO: renamed from: l.fv$b */
    public class b extends RecyclerView.AbstractC0566d0 {

        /* JADX INFO: renamed from: a */
        public CheckBox f99378a;

        /* JADX INFO: renamed from: b */
        public TextView f99379b;

        /* JADX INFO: renamed from: c */
        public TextView f99380c;

        public b(View view) {
            super(view);
            this.f99378a = (CheckBox) view.findViewById(a5c0.f67679d);
            this.f99379b = (TextView) view.findViewById(a5c0.f67672Z);
            TextView textView = (TextView) view.findViewById(a5c0.f67674a0);
            this.f99380c = textView;
            textView.setTypeface(eqh0.m117752c(3), 1);
        }
    }

    public C16923fv(Act act) {
        this.f99375b = act;
    }

    /* JADX INFO: renamed from: C */
    public List<ProtocolItemBean> m123243C() {
        return this.f99374a;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m123244D(b bVar, int i, View view) {
        zvf0.m220396r("e_settle_account_popup_confirm", "p_settle_account_popup");
        bVar.f99378a.setChecked(true);
        this.f99374a.get(i).isShow = true;
        this.f99374a.get(i).isCheck = true;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m123245E(final int i, final b bVar, View view) {
        if (i == 0 && !this.f99374a.get(i).isShow) {
            zvf0.m220400v("e_delete_account_interact_block_button", this.f99375b.pageId(), new j760("select_click_type", "settle_account"));
            bVar.f99378a.setChecked(false);
            cwf0 cwf0VarM133794c = i0e.m133794c("p_settle_account_popup", Dialog.class.getName());
            xh0.C21150a c21150aM208724c = new xh0.C21150a(this.f99375b).m208740s("账号内钱包结清").m208731j("通过使用探探服务获得的资产或虚拟权益等财产性利益，您可以选择提现或消费，若直接注销则视为您主动放弃，是否确认舍弃？").m208739r("我再想想").m208727f("确认舍弃").m208728g(false).m208734m(new a(cwf0VarM133794c)).m208729h(false).m208736o(new View.OnClickListener() { // from class: l.dv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    zvf0.m220396r("e_settle_account_popup_cancel", "p_settle_account_popup");
                }
            }).m208724c(new View.OnClickListener() { // from class: l.ev
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f93297a.m123244D(bVar, i, view2);
                }
            });
            i0e.m133797f(cwf0VarM133794c);
            c21150aM208724c.m208722a().m208721g();
            return;
        }
        if (i == 0 && this.f99374a.get(i).isShow) {
            zvf0.m220400v("e_delete_account_interact_block_button", this.f99375b.pageId(), new j760("select_click_type", "settle_account"));
            this.f99374a.get(i).isShow = false;
            bVar.f99378a.setChecked(!this.f99374a.get(i).isCheck);
            this.f99374a.get(i).isCheck = !this.f99374a.get(i).isCheck;
            return;
        }
        if (i == 1) {
            zvf0.m220400v("e_delete_account_interact_block_button", this.f99375b.pageId(), new j760("select_click_type", "settle_vip"));
        } else if (i == 2) {
            zvf0.m220400v("e_delete_account_interact_block_button", this.f99375b.pageId(), new j760("select_click_type", "block_infor"));
        } else if (i == 3) {
            zvf0.m220400v("e_delete_account_interact_block_button", this.f99375b.pageId(), new j760("select_click_type", "auto_pay"));
        } else if (i == 4) {
            zvf0.m220400v("e_delete_account_interact_block_button", this.f99375b.pageId(), new j760("select_click_type", "security_check"));
        }
        bVar.f99378a.setChecked(!this.f99374a.get(i).isCheck);
        this.f99374a.get(i).isCheck = !this.f99374a.get(i).isCheck;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @SuppressLint({"RecyclerView"})
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull final b bVar, final int i) {
        bVar.f99379b.setText(this.f99374a.get(i).tip);
        bVar.f99380c.setText(this.f99374a.get(i).title);
        bVar.f99378a.setChecked(this.f99374a.get(i).isCheck);
        xdl0.m208329E0(bVar.f99378a, new View.OnClickListener() { // from class: l.cv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82613a.m123245E(i, bVar, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new b(o7r.m163037a(this.f99375b).inflate(n6c0.f137362l, viewGroup, false));
    }

    /* JADX INFO: renamed from: H */
    public void m123248H(List<ProtocolItemBean> list) {
        if (NullChecker.m81303a(list)) {
            this.f99374a.clear();
            this.f99374a.addAll(list);
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 5;
    }
}
