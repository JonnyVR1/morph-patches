package p009l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p1.mobile.putong.core.data.LabelData;
import com.p1.mobile.putong.core.view.CardLabelShowView2;
import com.p1.mobile.putong.data.User;
import java.util.List;
import l.a11;
import l.dcl0;
import l.eqh0;
import l.f6c0;
import l.u4c0;
import l.vwb;
import l.xdl0;
import v.VText;

/* JADX INFO: renamed from: l.y2 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C1320y2 extends a11 {

    /* JADX INFO: renamed from: c */
    public static final int f22860c = f6c0.P6;

    /* JADX INFO: renamed from: a */
    public CardLabelShowView2 f22861a;

    /* JADX INFO: renamed from: b */
    public VText f22862b;

    /* JADX INFO: renamed from: l.y2$a */
    public static class a extends dcl0 {
        /* JADX INFO: renamed from: a */
        public a11 m25179a(ViewGroup viewGroup) {
            return new C1320y2(LayoutInflater.from(viewGroup.getContext()).inflate(C1320y2.f22860c, viewGroup, false));
        }
    }

    public C1320y2(@NonNull View view) {
        super(view);
        this.f22861a = view.findViewById(u4c0.E6);
        VText vTextFindViewById = view.findViewById(u4c0.ge);
        this.f22862b = vTextFindViewById;
        vTextFindViewById.setTypeface(eqh0.c(3), 1);
    }

    /* JADX INFO: renamed from: a */
    public void m25178a(@Nullable User user, boolean z) {
        List<LabelData> listM19572a = o0x.m19572a(user);
        if (vwb.J(listM19572a)) {
            xdl0.M(((RecyclerView.d0) this).itemView, false);
        } else {
            this.f22861a.setLabel(listM19572a);
            xdl0.M(((RecyclerView.d0) this).itemView, true);
        }
    }
}
