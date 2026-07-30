package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.data.QuestionnaireOptions;
import java.util.List;
import p151v.VCheckBox;
import p151v.VText;

/* JADX INFO: loaded from: classes2.dex */
public class xwb0 extends RecyclerView.Adapter<C21461a> {

    /* JADX INFO: renamed from: a */
    public Context f196483a;

    /* JADX INFO: renamed from: b */
    public List<QuestionnaireOptions> f196484b;

    /* JADX INFO: renamed from: c */
    public InterfaceC21462b f196485c;

    /* JADX INFO: renamed from: l.xwb0$a */
    public class C21461a extends RecyclerView.AbstractC0569e0 {

        /* JADX INFO: renamed from: a */
        public VText f196486a;

        /* JADX INFO: renamed from: b */
        public VCheckBox f196487b;

        public C21461a(View view) {
            super(view);
            this.f196486a = (VText) view.findViewById(adc0.f70409je);
            this.f196487b = (VCheckBox) view.findViewById(adc0.f70329f1);
        }

        /* JADX INFO: renamed from: a */
        public void m213350a(QuestionnaireOptions questionnaireOptions) {
            this.f196486a.setText(questionnaireOptions.value);
            this.f196487b.setChecked(questionnaireOptions.checked);
        }
    }

    /* JADX INFO: renamed from: l.xwb0$b */
    public interface InterfaceC21462b {
        /* JADX INFO: renamed from: a */
        void mo112082a(View view, QuestionnaireOptions questionnaireOptions, int i);
    }

    public xwb0(Context context, List<QuestionnaireOptions> list) {
        this.f196483a = context;
        this.f196484b = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m213346z(int i, View view) {
        InterfaceC21462b interfaceC21462b = this.f196485c;
        if (interfaceC21462b != null) {
            interfaceC21462b.mo112082a(view, this.f196484b.get(i), i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull C21461a c21461a, final int i) {
        c21461a.m213350a(this.f196484b.get(i));
        c21461a.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.wwb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f191259a.m213346z(i, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public C21461a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new C21461a(LayoutInflater.from(viewGroup.getContext()).inflate(kec0.f125637Tc, (ViewGroup) null));
    }

    /* JADX INFO: renamed from: D */
    public void m213349D(InterfaceC21462b interfaceC21462b) {
        this.f196485c = interfaceC21462b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<QuestionnaireOptions> list = this.f196484b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
