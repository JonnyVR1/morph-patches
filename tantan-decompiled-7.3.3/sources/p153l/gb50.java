package p153l;

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
public class gb50 extends RecyclerView.Adapter<C17191b> {

    /* JADX INFO: renamed from: a */
    private List<e3q> f103049a;

    /* JADX INFO: renamed from: b */
    private boolean f103050b = true;

    /* JADX INFO: renamed from: l.gb50$b */
    public static class C17191b extends RecyclerView.AbstractC0569e0 {

        /* JADX INFO: renamed from: a */
        OcrContentTitleView f103053a;

        /* JADX INFO: renamed from: b */
        OcrEditText f103054b;

        public C17191b(@NonNull View view) {
            super(view);
            this.f103053a = (OcrContentTitleView) view.findViewById(rcc0.f162102H0);
            this.f103054b = (OcrEditText) view.findViewById(rcc0.f162098F0);
        }
    }

    public gb50(List<e3q> list) {
        this.f103049a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull C17191b c17191b, int i) {
        c17191b.f103054b.setEnabled(this.f103050b);
        c17191b.f103054b.setText(this.f103049a.get(i).f91991b);
        c17191b.f103053a.setText(this.f103049a.get(i).f91990a);
        c17191b.f103054b.addTextChangedListener(new C17190a(c17191b));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public C17191b onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new C17191b(LayoutInflater.from(viewGroup.getContext()).inflate(dec0.f88010n, viewGroup, false));
    }

    /* JADX INFO: renamed from: D */
    public void m129773D(boolean z) {
        this.f103050b = z;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f103049a.size();
    }

    /* JADX INFO: renamed from: z */
    public Map<String, Object> m129774z() {
        HashMap map = new HashMap();
        for (e3q e3qVar : this.f103049a) {
            map.put(e3qVar.f91990a, e3qVar.f91991b);
        }
        return map;
    }

    /* JADX INFO: renamed from: l.gb50$a */
    public class C17190a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C17191b f103051a;

        public C17190a(C17191b c17191b) {
            this.f103051a = c17191b;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((e3q) gb50.this.f103049a.get(this.f103051a.getAdapterPosition())).f91991b = editable.toString();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
