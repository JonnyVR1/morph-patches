package p006l;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.account.data.AccountShareItemBean;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.o7r;

/* JADX INFO: renamed from: l.gy */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0784gy extends RecyclerView.Adapter<c> {

    /* JADX INFO: renamed from: a */
    public List<AccountShareItemBean> f13566a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public Act f13567b;

    /* JADX INFO: renamed from: c */
    public b f13568c;

    /* JADX INFO: renamed from: l.gy$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f13569a;

        public a(int i) {
            this.f13569a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0784gy.this.f13568c.mo15414a(view, this.f13569a);
        }
    }

    /* JADX INFO: renamed from: l.gy$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo15414a(View view, int i);
    }

    /* JADX INFO: renamed from: l.gy$c */
    public class c extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a */
        public TextView f13571a;

        /* JADX INFO: renamed from: b */
        public ImageView f13572b;

        /* JADX INFO: renamed from: c */
        public LinearLayout f13573c;

        public c(View view) {
            super(view);
            this.f13573c = (LinearLayout) view.findViewById(q4c0.f19569C);
            this.f13572b = (ImageView) view.findViewById(q4c0.f19567A);
            this.f13571a = (TextView) view.findViewById(q4c0.f19610i0);
        }
    }

    public C0784gy(Act act) {
        this.f13567b = act;
    }

    @NonNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public c onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new c(o7r.a(this.f13567b).inflate(c6c0.f9408R, viewGroup, false));
    }

    /* JADX INFO: renamed from: C */
    public void m16006C(List<AccountShareItemBean> list) {
        if (NullChecker.a(list)) {
            this.f13566a.clear();
            this.f13566a.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: D */
    public void m16007D(b bVar) {
        this.f13568c = bVar;
    }

    public int getItemCount() {
        return this.f13566a.size();
    }

    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull c cVar, @SuppressLint({"RecyclerView"}) int i) {
        cVar.f13571a.setText(this.f13566a.get(i).getName());
        cVar.f13572b.setImageResource(this.f13566a.get(i).getIcon());
        if (this.f13568c != null) {
            cVar.f13573c.setOnClickListener(new a(i));
        }
    }
}
