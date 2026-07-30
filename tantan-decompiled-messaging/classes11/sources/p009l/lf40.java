package p009l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p1.mobile.putong.core.data.UserCheckWrapper;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.List;
import l.c3c0;
import l.l6c0;
import l.qib0;
import l.vwb;
import l.xdl0;
import l.y4c0;
import org.jetbrains.annotations.NotNull;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class lf40 extends RecyclerView.Adapter<C1012a> {

    /* JADX INFO: renamed from: a */
    public List<UserCheckWrapper> f16133a = new ArrayList();

    /* JADX INFO: renamed from: l.lf40$a */
    public static class C1012a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a */
        public VDraweeView f16134a;

        /* JADX INFO: renamed from: b */
        public VText f16135b;

        /* JADX INFO: renamed from: c */
        public ImageView f16136c;

        public C1012a(@NonNull @NotNull View view) {
            super(view);
            this.f16134a = view.findViewById(y4c0.p);
            this.f16135b = view.findViewById(y4c0.Q4);
            this.f16136c = (ImageView) view.findViewById(y4c0.K);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public /* synthetic */ void m17856D(int i, View view) {
        m17859A(i);
    }

    /* JADX INFO: renamed from: A */
    public final void m17859A(int i) {
        this.f16133a.get(i).checked = !this.f16133a.get(i).checked;
        notifyItemChanged(i, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: C */
    public List<String> m17860C() {
        ArrayList arrayList = new ArrayList();
        for (UserCheckWrapper userCheckWrapper : this.f16133a) {
            if (userCheckWrapper.checked) {
                arrayList.add(((DbObject) userCheckWrapper.user).id);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m17861E(int i, View view) {
        m17859A(i);
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull C1012a c1012a, final int i) {
        qib0.G.L0(c1012a.f16134a, this.f16133a.get(i).user.fp().profileSmall().formatted());
        boolean z = this.f16133a.get(i).checked;
        ImageView imageView = c1012a.f16136c;
        if (z) {
            xdl0.N(imageView, c3c0.O3);
        } else {
            xdl0.N(imageView, c3c0.P3);
        }
        xdl0.H0(c1012a.f16135b, this.f16133a.get(i).user.name);
        xdl0.E0(c1012a.f16134a, new View.OnClickListener() { // from class: l.jf40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15096a.m17856D(i, view);
            }
        });
        xdl0.E0(c1012a.f16136c, new View.OnClickListener() { // from class: l.kf40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15626a.m17861E(i, view);
            }
        });
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull C1012a c1012a, int i, @NonNull List<Object> list) {
        if (vwb.J(list)) {
            onBindViewHolder(c1012a, i);
        } else if (this.f16133a.get(i).checked) {
            xdl0.N(c1012a.f16136c, c3c0.O3);
        } else {
            xdl0.N(c1012a.f16136c, c3c0.P3);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public C1012a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new C1012a(o7r.m19649a(viewGroup.getContext()).inflate(l6c0.c4, viewGroup, false));
    }

    /* JADX INFO: renamed from: I */
    public void m17865I(List<User> list) {
        this.f16133a.clear();
        for (User user : list) {
            UserCheckWrapper userCheckWrapperNew_ = UserCheckWrapper.new_();
            userCheckWrapperNew_.checked = true;
            userCheckWrapperNew_.user = user;
            this.f16133a.add(userCheckWrapperNew_);
        }
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.f16133a.size();
    }
}
