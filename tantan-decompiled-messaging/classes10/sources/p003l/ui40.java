package p003l;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.data.NextQuestionnaireOptions;
import java.util.List;
import l.f6c0;
import l.u4c0;
import v.VCheckBox;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ui40 extends RecyclerView.Adapter<C3442a> {

    /* JADX INFO: renamed from: a */
    public Context f7751a;

    /* JADX INFO: renamed from: b */
    public List<NextQuestionnaireOptions> f7752b;

    /* JADX INFO: renamed from: c */
    public InterfaceC3443b f7753c;

    /* JADX INFO: renamed from: l.ui40$a */
    public class C3442a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a */
        public VText f7754a;

        /* JADX INFO: renamed from: b */
        public VCheckBox f7755b;

        public C3442a(View view) {
            super(view);
            this.f7754a = view.findViewById(u4c0.ge);
            this.f7755b = view.findViewById(u4c0.f1);
        }

        /* JADX INFO: renamed from: b */
        public void m9734b(NextQuestionnaireOptions nextQuestionnaireOptions) {
            this.f7754a.setText(nextQuestionnaireOptions.value);
            this.f7755b.setChecked(nextQuestionnaireOptions.checked);
        }
    }

    /* JADX INFO: renamed from: l.ui40$b */
    public interface InterfaceC3443b {
        /* JADX INFO: renamed from: a */
        void mo9735a(View view, NextQuestionnaireOptions nextQuestionnaireOptions, int i);
    }

    public ui40(Context context, List<NextQuestionnaireOptions> list) {
        this.f7751a = context;
        this.f7752b = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m9729z(int i, View view) {
        InterfaceC3443b interfaceC3443b = this.f7753c;
        if (interfaceC3443b != null) {
            interfaceC3443b.mo9735a(view, this.f7752b.get(i), i);
        }
    }

    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull C3442a c3442a, final int i) {
        c3442a.f7754a.setTypeface(Typeface.defaultFromStyle(1));
        c3442a.m9734b(this.f7752b.get(i));
        ((RecyclerView.d0) c3442a).itemView.setOnClickListener(new View.OnClickListener() { // from class: l.ti40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7566a.m9729z(i, view);
            }
        });
    }

    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public C3442a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new C3442a(LayoutInflater.from(viewGroup.getContext()).inflate(f6c0.Mc, (ViewGroup) null));
    }

    /* JADX INFO: renamed from: D */
    public void m9732D(InterfaceC3443b interfaceC3443b) {
        this.f7753c = interfaceC3443b;
    }

    public int getItemCount() {
        List<NextQuestionnaireOptions> list = this.f7752b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
