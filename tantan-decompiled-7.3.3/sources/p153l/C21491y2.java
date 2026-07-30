package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.data.LabelData;
import com.p051p1.mobile.putong.core.view.CardLabelShowView2;
import com.p051p1.mobile.putong.data.User;
import java.util.List;
import p151v.VText;

/* JADX INFO: renamed from: l.y2 */
/* JADX INFO: loaded from: classes11.dex */
public class C21491y2 extends h11 {

    /* JADX INFO: renamed from: c */
    public static final int f197161c = kec0.f125583Q6;

    /* JADX INFO: renamed from: a */
    public CardLabelShowView2 f197162a;

    /* JADX INFO: renamed from: b */
    public VText f197163b;

    /* JADX INFO: renamed from: l.y2$a */
    public static class a extends hll0 {
        @Override // p153l.hll0
        /* JADX INFO: renamed from: a */
        public h11 mo135759a(ViewGroup viewGroup) {
            return new C21491y2(LayoutInflater.from(viewGroup.getContext()).inflate(C21491y2.f197161c, viewGroup, false));
        }
    }

    public C21491y2(@NonNull View view) {
        super(view);
        this.f197162a = (CardLabelShowView2) view.findViewById(adc0.f69913G6);
        VText vText = (VText) view.findViewById(adc0.f70409je);
        this.f197163b = vText;
        vText.setTypeface(lyh0.m156283c(3), 1);
    }

    @Override // p153l.h11
    /* JADX INFO: renamed from: a */
    public void mo133267a(@Nullable User user, boolean z) {
        List<LabelData> listM161360a = n3x.m161360a(user);
        if (jyb.m147479J(listM161360a)) {
            bnl0.m105524M(this.itemView, false);
        } else {
            this.f197162a.setLabel(listM161360a);
            bnl0.m105524M(this.itemView, true);
        }
    }
}
