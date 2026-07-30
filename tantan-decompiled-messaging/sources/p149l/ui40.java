package p149l;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.data.NextQuestionnaireOptions;
import java.util.List;
import p147v.VCheckBox;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ui40 extends RecyclerView.Adapter<C20436a> {

    /* JADX INFO: renamed from: a */
    public Context f176624a;

    /* JADX INFO: renamed from: b */
    public List<NextQuestionnaireOptions> f176625b;

    /* JADX INFO: renamed from: c */
    public InterfaceC20437b f176626c;

    /* JADX INFO: renamed from: l.ui40$a */
    public class C20436a extends RecyclerView.AbstractC0566d0 {

        /* JADX INFO: renamed from: a */
        public VText f176627a;

        /* JADX INFO: renamed from: b */
        public VCheckBox f176628b;

        public C20436a(View view) {
            super(view);
            this.f176627a = (VText) view.findViewById(u4c0.f174268ge);
            this.f176628b = (VCheckBox) view.findViewById(u4c0.f174238f1);
        }

        /* JADX INFO: renamed from: b */
        public void m193849b(NextQuestionnaireOptions nextQuestionnaireOptions) {
            this.f176627a.setText(nextQuestionnaireOptions.value);
            this.f176628b.setChecked(nextQuestionnaireOptions.checked);
        }
    }

    /* JADX INFO: renamed from: l.ui40$b */
    public interface InterfaceC20437b {
        /* JADX INFO: renamed from: a */
        void mo193850a(View view, NextQuestionnaireOptions nextQuestionnaireOptions, int i);
    }

    public ui40(Context context, List<NextQuestionnaireOptions> list) {
        this.f176624a = context;
        this.f176625b = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m193844z(int i, View view) {
        InterfaceC20437b interfaceC20437b = this.f176626c;
        if (interfaceC20437b != null) {
            interfaceC20437b.mo193850a(view, this.f176625b.get(i), i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull C20436a c20436a, final int i) {
        c20436a.f176627a.setTypeface(Typeface.defaultFromStyle(1));
        c20436a.m193849b(this.f176625b.get(i));
        c20436a.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.ti40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f170529a.m193844z(i, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public C20436a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new C20436a(LayoutInflater.from(viewGroup.getContext()).inflate(f6c0.f95471Mc, (ViewGroup) null));
    }

    /* JADX INFO: renamed from: D */
    public void m193847D(InterfaceC20437b interfaceC20437b) {
        this.f176626c = interfaceC20437b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<NextQuestionnaireOptions> list = this.f176625b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
