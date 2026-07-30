package p009l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import l.a11;
import l.dcl0;
import l.e51;
import l.eqh0;
import l.f6c0;
import l.lsi0;
import l.u4c0;
import l.xdl0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class bu10 extends a11 {

    /* JADX INFO: renamed from: c */
    public static final int f10308c = f6c0.W6;

    /* JADX INFO: renamed from: a */
    public VText f10309a;

    /* JADX INFO: renamed from: b */
    public VText f10310b;

    /* JADX INFO: renamed from: l.bu10$a */
    public static class C0792a extends dcl0 {
        /* JADX INFO: renamed from: a */
        public a11 m12253a(ViewGroup viewGroup) {
            return new bu10(LayoutInflater.from(viewGroup.getContext()).inflate(bu10.f10308c, viewGroup, false));
        }
    }

    public bu10(@NonNull View view) {
        super(view);
        this.f10309a = view.findViewById(u4c0.m2);
        VText vTextFindViewById = view.findViewById(u4c0.ge);
        this.f10310b = vTextFindViewById;
        vTextFindViewById.setTypeface(eqh0.c(3), 1);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m12251c(User user, View view) {
        e51.q(user.publicId);
        lsi0.w(R.string.Ak);
    }

    /* JADX INFO: renamed from: a */
    public void m12252a(@Nullable final User user, boolean z) {
        if (CoreModule.c.f0.Xe(((DbObject) user).id) == null) {
            xdl0.M(((RecyclerView.d0) this).itemView, false);
            return;
        }
        this.f10309a.setText(user.publicId);
        xdl0.M(((RecyclerView.d0) this).itemView, true);
        xdl0.E0(this.f10309a, new View.OnClickListener() { // from class: l.au10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bu10.m12251c(user, view);
            }
        });
    }
}
