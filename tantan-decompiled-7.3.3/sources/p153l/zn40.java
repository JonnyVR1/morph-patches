package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.data.UserCheckWrapper;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class zn40 extends RecyclerView.Adapter<C21842a> {

    /* JADX INFO: renamed from: a */
    public List<UserCheckWrapper> f205175a = new ArrayList();

    /* JADX INFO: renamed from: l.zn40$a */
    public static class C21842a extends RecyclerView.AbstractC0569e0 {

        /* JADX INFO: renamed from: a */
        public VDraweeView f205176a;

        /* JADX INFO: renamed from: b */
        public VText f205177b;

        /* JADX INFO: renamed from: c */
        public ImageView f205178c;

        public C21842a(@NonNull @NotNull View view) {
            super(view);
            this.f205176a = (VDraweeView) view.findViewById(edc0.f93427p);
            this.f205177b = (VText) view.findViewById(edc0.f93267Q4);
            this.f205178c = (ImageView) view.findViewById(edc0.f93226K);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public /* synthetic */ void m220575D(int i, View view) {
        m220578A(i);
    }

    /* JADX INFO: renamed from: A */
    public final void m220578A(int i) {
        this.f205175a.get(i).checked = !this.f205175a.get(i).checked;
        notifyItemChanged(i, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: C */
    public List<String> m220579C() {
        ArrayList arrayList = new ArrayList();
        for (UserCheckWrapper userCheckWrapper : this.f205175a) {
            if (userCheckWrapper.checked) {
                arrayList.add(userCheckWrapper.user.f56859id);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m220580E(int i, View view) {
        m220578A(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull C21842a c21842a, final int i) {
        uqb0.f180374G.m127115L0(c21842a.f205176a, this.f205175a.get(i).user.m61308fp().profileSmall().formatted());
        boolean z = this.f205175a.get(i).checked;
        ImageView imageView = c21842a.f205178c;
        if (z) {
            bnl0.m105526N(imageView, ibc0.f113872O3);
        } else {
            bnl0.m105526N(imageView, ibc0.f113881P3);
        }
        bnl0.m105515H0(c21842a.f205177b, this.f205175a.get(i).user.name);
        bnl0.m105509E0(c21842a.f205176a, new View.OnClickListener() { // from class: l.xn40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195357a.m220575D(i, view);
            }
        });
        bnl0.m105509E0(c21842a.f205178c, new View.OnClickListener() { // from class: l.yn40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f200771a.m220580E(i, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull C21842a c21842a, int i, @NonNull List<Object> list) {
        if (jyb.m147479J(list)) {
            onBindViewHolder(c21842a, i);
        } else if (this.f205175a.get(i).checked) {
            bnl0.m105526N(c21842a.f205178c, ibc0.f113872O3);
        } else {
            bnl0.m105526N(c21842a.f205178c, ibc0.f113881P3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public C21842a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new C21842a(p9r.m171370a(viewGroup.getContext()).inflate(qec0.f157006c4, viewGroup, false));
    }

    /* JADX INFO: renamed from: I */
    public void m220584I(List<User> list) {
        this.f205175a.clear();
        for (User user : list) {
            UserCheckWrapper userCheckWrapperNew_ = UserCheckWrapper.new_();
            userCheckWrapperNew_.checked = true;
            userCheckWrapperNew_.user = user;
            this.f205175a.add(userCheckWrapperNew_);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f205175a.size();
    }
}
