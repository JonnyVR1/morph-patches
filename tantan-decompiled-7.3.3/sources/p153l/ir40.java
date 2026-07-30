package p153l;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.data.NextQuestionnaireOptions;
import java.util.List;
import p151v.VCheckBox;
import p151v.VText;

/* JADX INFO: loaded from: classes2.dex */
public class ir40 extends RecyclerView.Adapter<C17781a> {

    /* JADX INFO: renamed from: a */
    public Context f116504a;

    /* JADX INFO: renamed from: b */
    public List<NextQuestionnaireOptions> f116505b;

    /* JADX INFO: renamed from: c */
    public InterfaceC17782b f116506c;

    /* JADX INFO: renamed from: l.ir40$a */
    public class C17781a extends RecyclerView.AbstractC0569e0 {

        /* JADX INFO: renamed from: a */
        public VText f116507a;

        /* JADX INFO: renamed from: b */
        public VCheckBox f116508b;

        public C17781a(View view) {
            super(view);
            this.f116507a = (VText) view.findViewById(adc0.f70409je);
            this.f116508b = (VCheckBox) view.findViewById(adc0.f70329f1);
        }

        /* JADX INFO: renamed from: b */
        public void m141773b(NextQuestionnaireOptions nextQuestionnaireOptions) {
            this.f116507a.setText(nextQuestionnaireOptions.value);
            this.f116508b.setChecked(nextQuestionnaireOptions.checked);
        }
    }

    /* JADX INFO: renamed from: l.ir40$b */
    public interface InterfaceC17782b {
        /* JADX INFO: renamed from: a */
        void mo141774a(View view, NextQuestionnaireOptions nextQuestionnaireOptions, int i);
    }

    public ir40(Context context, List<NextQuestionnaireOptions> list) {
        this.f116504a = context;
        this.f116505b = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m141768z(int i, View view) {
        InterfaceC17782b interfaceC17782b = this.f116506c;
        if (interfaceC17782b != null) {
            interfaceC17782b.mo141774a(view, this.f116505b.get(i), i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull C17781a c17781a, final int i) {
        c17781a.f116507a.setTypeface(Typeface.defaultFromStyle(1));
        c17781a.m141773b(this.f116505b.get(i));
        c17781a.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.hr40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f111269a.m141768z(i, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public C17781a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new C17781a(LayoutInflater.from(viewGroup.getContext()).inflate(kec0.f125637Tc, (ViewGroup) null));
    }

    /* JADX INFO: renamed from: D */
    public void m141771D(InterfaceC17782b interfaceC17782b) {
        this.f116506c = interfaceC17782b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<NextQuestionnaireOptions> list = this.f116505b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
