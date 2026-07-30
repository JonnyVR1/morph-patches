package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.data.LabelData;
import com.p046p1.mobile.putong.core.view.CardLabelShowView2;
import com.p046p1.mobile.putong.data.User;
import java.util.List;
import p147v.VText;

/* JADX INFO: renamed from: l.y2 */
/* JADX INFO: loaded from: classes11.dex */
public class C21280y2 extends a11 {

    /* JADX INFO: renamed from: c */
    public static final int f195467c = f6c0.f95513P6;

    /* JADX INFO: renamed from: a */
    public CardLabelShowView2 f195468a;

    /* JADX INFO: renamed from: b */
    public VText f195469b;

    /* JADX INFO: renamed from: l.y2$a */
    public static class a extends dcl0 {
        @Override // p149l.dcl0
        /* JADX INFO: renamed from: a */
        public a11 mo103900a(ViewGroup viewGroup) {
            return new C21280y2(LayoutInflater.from(viewGroup.getContext()).inflate(C21280y2.f195467c, viewGroup, false));
        }
    }

    public C21280y2(@NonNull View view) {
        super(view);
        this.f195468a = (CardLabelShowView2) view.findViewById(u4c0.f173791E6);
        VText vText = (VText) view.findViewById(u4c0.f174268ge);
        this.f195469b = vText;
        vText.setTypeface(eqh0.m117752c(3), 1);
    }

    @Override // p149l.a11
    /* JADX INFO: renamed from: a */
    public void mo94503a(@Nullable User user, boolean z) {
        List<LabelData> listM162192a = o0x.m162192a(user);
        if (vwb.m200296J(listM162192a)) {
            xdl0.m208344M(this.itemView, false);
        } else {
            this.f195468a.setLabel(listM162192a);
            xdl0.m208344M(this.itemView, true);
        }
    }
}
