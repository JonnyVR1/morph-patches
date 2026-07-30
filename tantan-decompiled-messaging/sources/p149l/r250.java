package p149l;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.idv.identity.ocr.widget.OcrContentTitleView;
import com.idv.identity.ocr.widget.OcrEditText;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class r250 extends RecyclerView.Adapter<C19625b> {

    /* JADX INFO: renamed from: a */
    private List<e1q> f157360a;

    /* JADX INFO: renamed from: b */
    private boolean f157361b = true;

    /* JADX INFO: renamed from: l.r250$b */
    public static class C19625b extends RecyclerView.AbstractC0566d0 {

        /* JADX INFO: renamed from: a */
        OcrContentTitleView f157364a;

        /* JADX INFO: renamed from: b */
        OcrEditText f157365b;

        public C19625b(@NonNull View view) {
            super(view);
            this.f157364a = (OcrContentTitleView) view.findViewById(k4c0.f120983H0);
            this.f157365b = (OcrEditText) view.findViewById(k4c0.f120979F0);
        }
    }

    public r250(List<e1q> list) {
        this.f157360a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull C19625b c19625b, int i) {
        c19625b.f157365b.setEnabled(this.f157361b);
        c19625b.f157365b.setText(this.f157360a.get(i).f88841b);
        c19625b.f157364a.setText(this.f157360a.get(i).f88840a);
        c19625b.f157365b.addTextChangedListener(new C19624a(c19625b));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public C19625b onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new C19625b(LayoutInflater.from(viewGroup.getContext()).inflate(x5c0.f191126n, viewGroup, false));
    }

    /* JADX INFO: renamed from: D */
    public void m177564D(boolean z) {
        this.f157361b = z;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f157360a.size();
    }

    /* JADX INFO: renamed from: z */
    public Map<String, Object> m177565z() {
        HashMap map = new HashMap();
        for (e1q e1qVar : this.f157360a) {
            map.put(e1qVar.f88840a, e1qVar.f88841b);
        }
        return map;
    }

    /* JADX INFO: renamed from: l.r250$a */
    public class C19624a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C19625b f157362a;

        public C19624a(C19625b c19625b) {
            this.f157362a = c19625b;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((e1q) r250.this.f157360a.get(this.f157362a.getAdapterPosition())).f88841b = editable.toString();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
