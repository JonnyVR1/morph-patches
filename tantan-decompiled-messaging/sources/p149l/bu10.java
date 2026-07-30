package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.data.User;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class bu10 extends a11 {

    /* JADX INFO: renamed from: c */
    public static final int f77276c = f6c0.f95625W6;

    /* JADX INFO: renamed from: a */
    public VText f77277a;

    /* JADX INFO: renamed from: b */
    public VText f77278b;

    /* JADX INFO: renamed from: l.bu10$a */
    public static class C15974a extends dcl0 {
        @Override // p149l.dcl0
        /* JADX INFO: renamed from: a */
        public a11 mo103900a(ViewGroup viewGroup) {
            return new bu10(LayoutInflater.from(viewGroup.getContext()).inflate(bu10.f77276c, viewGroup, false));
        }
    }

    public bu10(@NonNull View view) {
        super(view);
        this.f77277a = (VText) view.findViewById(u4c0.f174357m2);
        VText vText = (VText) view.findViewById(u4c0.f174268ge);
        this.f77278b = vText;
        vText.setTypeface(eqh0.m117752c(3), 1);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m103899c(User user, View view) {
        e51.m114766q(user.publicId);
        lsi0.m151593w(R$string.f17587Ak);
    }

    @Override // p149l.a11
    /* JADX INFO: renamed from: a */
    public void mo94503a(@Nullable final User user, boolean z) {
        if (CoreModule.f17545c.f19642f0.m32856Xe(user.f56011id) == null) {
            xdl0.m208344M(this.itemView, false);
            return;
        }
        this.f77277a.setText(user.publicId);
        xdl0.m208344M(this.itemView, true);
        xdl0.m208329E0(this.f77277a, new View.OnClickListener() { // from class: l.au10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bu10.m103899c(user, view);
            }
        });
    }
}
