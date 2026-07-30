package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.data.User;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class j220 extends h11 {

    /* JADX INFO: renamed from: c */
    public static final int f118026c = kec0.f125695X6;

    /* JADX INFO: renamed from: a */
    public VText f118027a;

    /* JADX INFO: renamed from: b */
    public VText f118028b;

    /* JADX INFO: renamed from: l.j220$a */
    public static class C17855a extends hll0 {
        @Override // p153l.hll0
        /* JADX INFO: renamed from: a */
        public h11 mo135759a(ViewGroup viewGroup) {
            return new j220(LayoutInflater.from(viewGroup.getContext()).inflate(j220.f118026c, viewGroup, false));
        }
    }

    public j220(@NonNull View view) {
        super(view);
        this.f118027a = (VText) view.findViewById(adc0.f70482o2);
        VText vText = (VText) view.findViewById(adc0.f70409je);
        this.f118028b = vText;
        vText.setTypeface(lyh0.m156283c(3), 1);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m143185c(User user, View view) {
        l51.m152911q(user.publicId);
        o1j0.m165649w(R$string.f18977Wk);
    }

    @Override // p153l.h11
    /* JADX INFO: renamed from: a */
    public void mo133267a(@Nullable final User user, boolean z) {
        if (CoreModule.f18264c.f20384f0.m33859Xe(user.f56859id) == null) {
            bnl0.m105524M(this.itemView, false);
            return;
        }
        this.f118027a.setText(user.publicId);
        bnl0.m105524M(this.itemView, true);
        bnl0.m105509E0(this.f118027a, new View.OnClickListener() { // from class: l.i220
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j220.m143185c(user, view);
            }
        });
    }
}
