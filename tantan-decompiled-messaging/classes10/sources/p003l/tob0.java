package p003l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.data.QuestionnaireOptions;
import java.util.List;
import l.f6c0;
import l.u4c0;
import v.VCheckBox;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class tob0 extends RecyclerView.Adapter<C3433a> {

    /* JADX INFO: renamed from: a */
    public Context f7591a;

    /* JADX INFO: renamed from: b */
    public List<QuestionnaireOptions> f7592b;

    /* JADX INFO: renamed from: c */
    public InterfaceC3434b f7593c;

    /* JADX INFO: renamed from: l.tob0$a */
    public class C3433a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a */
        public VText f7594a;

        /* JADX INFO: renamed from: b */
        public VCheckBox f7595b;

        public C3433a(View view) {
            super(view);
            this.f7594a = view.findViewById(u4c0.ge);
            this.f7595b = view.findViewById(u4c0.f1);
        }

        /* JADX INFO: renamed from: a */
        public void m9609a(QuestionnaireOptions questionnaireOptions) {
            this.f7594a.setText(questionnaireOptions.value);
            this.f7595b.setChecked(questionnaireOptions.checked);
        }
    }

    /* JADX INFO: renamed from: l.tob0$b */
    public interface InterfaceC3434b {
        /* JADX INFO: renamed from: a */
        void mo9610a(View view, QuestionnaireOptions questionnaireOptions, int i);
    }

    public tob0(Context context, List<QuestionnaireOptions> list) {
        this.f7591a = context;
        this.f7592b = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m9605z(int i, View view) {
        InterfaceC3434b interfaceC3434b = this.f7593c;
        if (interfaceC3434b != null) {
            interfaceC3434b.mo9610a(view, this.f7592b.get(i), i);
        }
    }

    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull C3433a c3433a, final int i) {
        c3433a.m9609a(this.f7592b.get(i));
        ((RecyclerView.d0) c3433a).itemView.setOnClickListener(new View.OnClickListener() { // from class: l.sob0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7422a.m9605z(i, view);
            }
        });
    }

    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public C3433a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new C3433a(LayoutInflater.from(viewGroup.getContext()).inflate(f6c0.Mc, (ViewGroup) null));
    }

    /* JADX INFO: renamed from: D */
    public void m9608D(InterfaceC3434b interfaceC3434b) {
        this.f7593c = interfaceC3434b;
    }

    public int getItemCount() {
        List<QuestionnaireOptions> list = this.f7592b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
