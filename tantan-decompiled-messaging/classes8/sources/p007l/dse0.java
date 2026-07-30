package p007l;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p003p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.ShareItemBean;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.a5c0;
import l.n6c0;
import l.o7r;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class dse0 extends RecyclerView.Adapter<C0526c> {

    /* JADX INFO: renamed from: a */
    public List<ShareItemBean> f2590a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public Act f2591b;

    /* JADX INFO: renamed from: c */
    public InterfaceC0525b f2592c;

    /* JADX INFO: renamed from: l.dse0$a */
    public class ViewOnClickListenerC0524a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f2593a;

        public ViewOnClickListenerC0524a(int i) {
            this.f2593a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            dse0.this.f2592c.m9013a(view, this.f2593a);
        }
    }

    /* JADX INFO: renamed from: l.dse0$b */
    public interface InterfaceC0525b {
        /* JADX INFO: renamed from: a */
        void m9013a(View view, int i);
    }

    /* JADX INFO: renamed from: l.dse0$c */
    public class C0526c extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a */
        public TextView f2595a;

        /* JADX INFO: renamed from: b */
        public ImageView f2596b;

        /* JADX INFO: renamed from: c */
        public LinearLayout f2597c;

        public C0526c(View view) {
            super(view);
            this.f2597c = (LinearLayout) view.findViewById(a5c0.E);
            this.f2596b = (ImageView) view.findViewById(a5c0.A);
            this.f2595a = (TextView) view.findViewById(a5c0.b0);
        }
    }

    public dse0(Act act) {
        this.f2591b = act;
    }

    @NonNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public C0526c onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new C0526c(o7r.a(this.f2591b).inflate(n6c0.T0, viewGroup, false));
    }

    /* JADX INFO: renamed from: C */
    public void m9010C(List<ShareItemBean> list) {
        if (NullChecker.a(list)) {
            this.f2590a.clear();
            this.f2590a.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: D */
    public void m9011D(InterfaceC0525b interfaceC0525b) {
        this.f2592c = interfaceC0525b;
    }

    public int getItemCount() {
        return this.f2590a.size();
    }

    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull C0526c c0526c, @SuppressLint({"RecyclerView"}) int i) {
        c0526c.f2595a.setText(this.f2590a.get(i).getName());
        c0526c.f2596b.setImageResource(this.f2590a.get(i).getIcon());
        if (this.f2592c != null) {
            c0526c.f2597c.setOnClickListener(new ViewOnClickListenerC0524a(i));
        }
    }
}
