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
import com.p046p1.mobile.putong.core.data.ShareItemBean;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class dse0 extends RecyclerView.Adapter<C16464c> {

    /* JADX INFO: renamed from: a */
    public List<ShareItemBean> f87750a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public Act f87751b;

    /* JADX INFO: renamed from: c */
    public InterfaceC16463b f87752c;

    /* JADX INFO: renamed from: l.dse0$a */
    public class ViewOnClickListenerC16462a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f87753a;

        public ViewOnClickListenerC16462a(int i) {
            this.f87753a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            dse0.this.f87752c.mo98511a(view, this.f87753a);
        }
    }

    /* JADX INFO: renamed from: l.dse0$b */
    public interface InterfaceC16463b {
        /* JADX INFO: renamed from: a */
        void mo98511a(View view, int i);
    }

    /* JADX INFO: renamed from: l.dse0$c */
    public class C16464c extends RecyclerView.AbstractC0566d0 {

        /* JADX INFO: renamed from: a */
        public TextView f87755a;

        /* JADX INFO: renamed from: b */
        public ImageView f87756b;

        /* JADX INFO: renamed from: c */
        public LinearLayout f87757c;

        public C16464c(View view) {
            super(view);
            this.f87757c = (LinearLayout) view.findViewById(a5c0.f67651E);
            this.f87756b = (ImageView) view.findViewById(a5c0.f67647A);
            this.f87755a = (TextView) view.findViewById(a5c0.f67676b0);
        }
    }

    public dse0(Act act) {
        this.f87751b = act;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public C16464c onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new C16464c(o7r.m163037a(this.f87751b).inflate(n6c0.f137324T0, viewGroup, false));
    }

    /* JADX INFO: renamed from: C */
    public void m113468C(List<ShareItemBean> list) {
        if (NullChecker.m81303a(list)) {
            this.f87750a.clear();
            this.f87750a.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: D */
    public void m113469D(InterfaceC16463b interfaceC16463b) {
        this.f87752c = interfaceC16463b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f87750a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull C16464c c16464c, @SuppressLint({"RecyclerView"}) int i) {
        c16464c.f87755a.setText(this.f87750a.get(i).getName());
        c16464c.f87756b.setImageResource(this.f87750a.get(i).getIcon());
        if (this.f87752c != null) {
            c16464c.f87757c.setOnClickListener(new ViewOnClickListenerC16462a(i));
        }
    }
}
