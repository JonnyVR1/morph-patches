package p153l;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.data.AccountShareItemBean;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.zx */
/* JADX INFO: loaded from: classes9.dex */
public class C21914zx extends RecyclerView.Adapter<c> {

    /* JADX INFO: renamed from: a */
    public List<AccountShareItemBean> f206405a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public Act f206406b;

    /* JADX INFO: renamed from: c */
    public b f206407c;

    /* JADX INFO: renamed from: l.zx$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f206408a;

        public a(int i) {
            this.f206408a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C21914zx.this.f206407c.mo186719a(view, this.f206408a);
        }
    }

    /* JADX INFO: renamed from: l.zx$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo186719a(View view, int i);
    }

    /* JADX INFO: renamed from: l.zx$c */
    public class c extends RecyclerView.AbstractC0569e0 {

        /* JADX INFO: renamed from: a */
        public TextView f206410a;

        /* JADX INFO: renamed from: b */
        public ImageView f206411b;

        /* JADX INFO: renamed from: c */
        public LinearLayout f206412c;

        public c(View view) {
            super(view);
            this.f206412c = (LinearLayout) view.findViewById(wcc0.f188407C);
            this.f206411b = (ImageView) view.findViewById(wcc0.f188405A);
            this.f206410a = (TextView) view.findViewById(wcc0.f188448i0);
        }
    }

    public C21914zx(Act act) {
        this.f206406b = act;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public c onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new c(p9r.m171370a(this.f206406b).inflate(hec0.f109090R, viewGroup, false));
    }

    /* JADX INFO: renamed from: C */
    public void m221964C(List<AccountShareItemBean> list) {
        if (NullChecker.m82486a(list)) {
            this.f206405a.clear();
            this.f206405a.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: D */
    public void m221965D(b bVar) {
        this.f206407c = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f206405a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull c cVar, @SuppressLint({"RecyclerView"}) int i) {
        cVar.f206410a.setText(this.f206405a.get(i).getName());
        cVar.f206411b.setImageResource(this.f206405a.get(i).getIcon());
        if (this.f206407c != null) {
            cVar.f206412c.setOnClickListener(new a(i));
        }
    }
}
