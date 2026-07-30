package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.data.QuestionnaireOptions;
import java.util.List;
import p147v.VCheckBox;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class tob0 extends RecyclerView.Adapter<C20219a> {

    /* JADX INFO: renamed from: a */
    public Context f171333a;

    /* JADX INFO: renamed from: b */
    public List<QuestionnaireOptions> f171334b;

    /* JADX INFO: renamed from: c */
    public InterfaceC20220b f171335c;

    /* JADX INFO: renamed from: l.tob0$a */
    public class C20219a extends RecyclerView.AbstractC0566d0 {

        /* JADX INFO: renamed from: a */
        public VText f171336a;

        /* JADX INFO: renamed from: b */
        public VCheckBox f171337b;

        public C20219a(View view) {
            super(view);
            this.f171336a = (VText) view.findViewById(u4c0.f174268ge);
            this.f171337b = (VCheckBox) view.findViewById(u4c0.f174238f1);
        }

        /* JADX INFO: renamed from: a */
        public void m189864a(QuestionnaireOptions questionnaireOptions) {
            this.f171336a.setText(questionnaireOptions.value);
            this.f171337b.setChecked(questionnaireOptions.checked);
        }
    }

    /* JADX INFO: renamed from: l.tob0$b */
    public interface InterfaceC20220b {
        /* JADX INFO: renamed from: a */
        void mo189865a(View view, QuestionnaireOptions questionnaireOptions, int i);
    }

    public tob0(Context context, List<QuestionnaireOptions> list) {
        this.f171333a = context;
        this.f171334b = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m189860z(int i, View view) {
        InterfaceC20220b interfaceC20220b = this.f171335c;
        if (interfaceC20220b != null) {
            interfaceC20220b.mo189865a(view, this.f171334b.get(i), i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull C20219a c20219a, final int i) {
        c20219a.m189864a(this.f171334b.get(i));
        c20219a.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.sob0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165669a.m189860z(i, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public C20219a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new C20219a(LayoutInflater.from(viewGroup.getContext()).inflate(f6c0.f95471Mc, (ViewGroup) null));
    }

    /* JADX INFO: renamed from: D */
    public void m189863D(InterfaceC20220b interfaceC20220b) {
        this.f171335c = interfaceC20220b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<QuestionnaireOptions> list = this.f171334b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
