package p149l;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.data.AccountShareItemBean;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.gy */
/* JADX INFO: loaded from: classes9.dex */
public class C17199gy extends RecyclerView.Adapter<c> {

    /* JADX INFO: renamed from: a */
    public List<AccountShareItemBean> f104950a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public Act f104951b;

    /* JADX INFO: renamed from: c */
    public b f104952c;

    /* JADX INFO: renamed from: l.gy$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f104953a;

        public a(int i) {
            this.f104953a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C17199gy.this.f104952c.mo122428a(view, this.f104953a);
        }
    }

    /* JADX INFO: renamed from: l.gy$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo122428a(View view, int i);
    }

    /* JADX INFO: renamed from: l.gy$c */
    public class c extends RecyclerView.AbstractC0566d0 {

        /* JADX INFO: renamed from: a */
        public TextView f104955a;

        /* JADX INFO: renamed from: b */
        public ImageView f104956b;

        /* JADX INFO: renamed from: c */
        public LinearLayout f104957c;

        public c(View view) {
            super(view);
            this.f104957c = (LinearLayout) view.findViewById(q4c0.f152559C);
            this.f104956b = (ImageView) view.findViewById(q4c0.f152557A);
            this.f104955a = (TextView) view.findViewById(q4c0.f152600i0);
        }
    }

    public C17199gy(Act act) {
        this.f104951b = act;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public c onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new c(o7r.m163037a(this.f104951b).inflate(c6c0.f79478R, viewGroup, false));
    }

    /* JADX INFO: renamed from: C */
    public void m128672C(List<AccountShareItemBean> list) {
        if (NullChecker.m81303a(list)) {
            this.f104950a.clear();
            this.f104950a.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: D */
    public void m128673D(b bVar) {
        this.f104952c = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f104950a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull c cVar, @SuppressLint({"RecyclerView"}) int i) {
        cVar.f104955a.setText(this.f104950a.get(i).getName());
        cVar.f104956b.setImageResource(this.f104950a.get(i).getIcon());
        if (this.f104952c != null) {
            cVar.f104957c.setOnClickListener(new a(i));
        }
    }
}
