package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.data.UserCheckWrapper;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class lf40 extends RecyclerView.Adapter<C18210a> {

    /* JADX INFO: renamed from: a */
    public List<UserCheckWrapper> f127830a = new ArrayList();

    /* JADX INFO: renamed from: l.lf40$a */
    public static class C18210a extends RecyclerView.AbstractC0566d0 {

        /* JADX INFO: renamed from: a */
        public VDraweeView f127831a;

        /* JADX INFO: renamed from: b */
        public VText f127832b;

        /* JADX INFO: renamed from: c */
        public ImageView f127833c;

        public C18210a(@NonNull @NotNull View view) {
            super(view);
            this.f127831a = (VDraweeView) view.findViewById(y4c0.f196192p);
            this.f127832b = (VText) view.findViewById(y4c0.f196032Q4);
            this.f127833c = (ImageView) view.findViewById(y4c0.f195991K);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public /* synthetic */ void m149630D(int i, View view) {
        m149633A(i);
    }

    /* JADX INFO: renamed from: A */
    public final void m149633A(int i) {
        this.f127830a.get(i).checked = !this.f127830a.get(i).checked;
        notifyItemChanged(i, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: C */
    public List<String> m149634C() {
        ArrayList arrayList = new ArrayList();
        for (UserCheckWrapper userCheckWrapper : this.f127830a) {
            if (userCheckWrapper.checked) {
                arrayList.add(userCheckWrapper.user.f56011id);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m149635E(int i, View view) {
        m149633A(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull C18210a c18210a, final int i) {
        qib0.f154691G.m102331L0(c18210a.f127831a, this.f127830a.get(i).user.m60124fp().profileSmall().formatted());
        boolean z = this.f127830a.get(i).checked;
        ImageView imageView = c18210a.f127833c;
        if (z) {
            xdl0.m208346N(imageView, c3c0.f78597O3);
        } else {
            xdl0.m208346N(imageView, c3c0.f78606P3);
        }
        xdl0.m208335H0(c18210a.f127832b, this.f127830a.get(i).user.name);
        xdl0.m208329E0(c18210a.f127831a, new View.OnClickListener() { // from class: l.jf40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117632a.m149630D(i, view);
            }
        });
        xdl0.m208329E0(c18210a.f127833c, new View.OnClickListener() { // from class: l.kf40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122896a.m149635E(i, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull C18210a c18210a, int i, @NonNull List<Object> list) {
        if (vwb.m200296J(list)) {
            onBindViewHolder(c18210a, i);
        } else if (this.f127830a.get(i).checked) {
            xdl0.m208346N(c18210a.f127833c, c3c0.f78597O3);
        } else {
            xdl0.m208346N(c18210a.f127833c, c3c0.f78606P3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public C18210a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new C18210a(o7r.m163037a(viewGroup.getContext()).inflate(l6c0.f126450c4, viewGroup, false));
    }

    /* JADX INFO: renamed from: I */
    public void m149639I(List<User> list) {
        this.f127830a.clear();
        for (User user : list) {
            UserCheckWrapper userCheckWrapperNew_ = UserCheckWrapper.new_();
            userCheckWrapperNew_.checked = true;
            userCheckWrapperNew_.user = user;
            this.f127830a.add(userCheckWrapperNew_);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f127830a.size();
    }
}
