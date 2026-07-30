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
import com.p051p1.mobile.putong.core.data.ShareItemBean;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class k0f0 extends RecyclerView.Adapter<C18072c> {

    /* JADX INFO: renamed from: a */
    public List<ShareItemBean> f123387a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public Act f123388b;

    /* JADX INFO: renamed from: c */
    public InterfaceC18071b f123389c;

    /* JADX INFO: renamed from: l.k0f0$a */
    public class ViewOnClickListenerC18070a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f123390a;

        public ViewOnClickListenerC18070a(int i) {
            this.f123390a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            k0f0.this.f123389c.mo147791a(view, this.f123390a);
        }
    }

    /* JADX INFO: renamed from: l.k0f0$b */
    public interface InterfaceC18071b {
        /* JADX INFO: renamed from: a */
        void mo147791a(View view, int i);
    }

    /* JADX INFO: renamed from: l.k0f0$c */
    public class C18072c extends RecyclerView.AbstractC0569e0 {

        /* JADX INFO: renamed from: a */
        public TextView f123392a;

        /* JADX INFO: renamed from: b */
        public ImageView f123393b;

        /* JADX INFO: renamed from: c */
        public LinearLayout f123394c;

        public C18072c(View view) {
            super(view);
            this.f123394c = (LinearLayout) view.findViewById(gdc0.f103646E);
            this.f123393b = (ImageView) view.findViewById(gdc0.f103642A);
            this.f123392a = (TextView) view.findViewById(gdc0.f103671b0);
        }
    }

    public k0f0(Act act) {
        this.f123388b = act;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public C18072c onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new C18072c(p9r.m171370a(this.f123388b).inflate(sec0.f167538T0, viewGroup, false));
    }

    /* JADX INFO: renamed from: C */
    public void m147788C(List<ShareItemBean> list) {
        if (NullChecker.m82486a(list)) {
            this.f123387a.clear();
            this.f123387a.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: D */
    public void m147789D(InterfaceC18071b interfaceC18071b) {
        this.f123389c = interfaceC18071b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f123387a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull C18072c c18072c, @SuppressLint({"RecyclerView"}) int i) {
        c18072c.f123392a.setText(this.f123387a.get(i).getName());
        c18072c.f123393b.setImageResource(this.f123387a.get(i).getIcon());
        if (this.f123389c != null) {
            c18072c.f123394c.setOnClickListener(new ViewOnClickListenerC18070a(i));
        }
    }
}
