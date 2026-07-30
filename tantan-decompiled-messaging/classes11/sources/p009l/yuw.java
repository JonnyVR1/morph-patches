package p009l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p1.mobile.putong.data.Extensions;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.ProfileExtensionMarriage;
import com.p1.mobile.putong.data.User;
import l.a11;
import l.dcl0;
import l.eqh0;
import l.f6c0;
import l.u4c0;
import l.vwb;
import l.xdl0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class yuw extends a11 {

    /* JADX INFO: renamed from: c */
    public static final int f23249c = f6c0.V6;

    /* JADX INFO: renamed from: a */
    public VText f23250a;

    /* JADX INFO: renamed from: b */
    public VText f23251b;

    /* JADX INFO: renamed from: l.yuw$a */
    public static class C1337a extends dcl0 {
        /* JADX INFO: renamed from: a */
        public a11 m25532a(ViewGroup viewGroup) {
            return new yuw(LayoutInflater.from(viewGroup.getContext()).inflate(yuw.f23249c, viewGroup, false));
        }
    }

    public yuw(@NonNull View view) {
        super(view);
        this.f23250a = view.findViewById(u4c0.R7);
        VText vTextFindViewById = view.findViewById(u4c0.S7);
        this.f23251b = vTextFindViewById;
        vTextFindViewById.setTypeface(eqh0.c(3), 1);
    }

    /* JADX INFO: renamed from: a */
    public void m25531a(@Nullable User user, boolean z) {
        Extensions extensions;
        ProfileExtensionMarriage profileExtensionMarriage;
        Profile profile = user.profile;
        if (profile == null || (extensions = profile.extensions) == null || (profileExtensionMarriage = extensions.marriage) == null || vwb.J(profileExtensionMarriage.declaration)) {
            xdl0.M(((RecyclerView.d0) this).itemView, false);
        } else {
            xdl0.M(((RecyclerView.d0) this).itemView, true);
            this.f23250a.setText((String) user.profile.extensions.marriage.declaration.get(0));
        }
    }
}
