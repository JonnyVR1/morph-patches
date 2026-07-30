package p009l;

import android.text.TextUtils;
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
import java.util.List;
import l.a11;
import l.dcl0;
import l.eqh0;
import l.f6c0;
import l.u4c0;
import l.vwb;
import l.xdl0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class smp0 extends a11 {

    /* JADX INFO: renamed from: c */
    public static final int f20370c = f6c0.Y6;

    /* JADX INFO: renamed from: a */
    public VText f20371a;

    /* JADX INFO: renamed from: b */
    public VText f20372b;

    /* JADX INFO: renamed from: l.smp0$a */
    public static class C1193a extends dcl0 {
        /* JADX INFO: renamed from: a */
        public a11 m22303a(ViewGroup viewGroup) {
            return new smp0(LayoutInflater.from(viewGroup.getContext()).inflate(smp0.f20370c, viewGroup, false));
        }
    }

    public smp0(@NonNull View view) {
        super(view);
        this.f20371a = view.findViewById(u4c0.m2);
        VText vTextFindViewById = view.findViewById(u4c0.ge);
        this.f20372b = vTextFindViewById;
        vTextFindViewById.setTypeface(eqh0.c(3), 1);
    }

    /* JADX INFO: renamed from: a */
    public void m22302a(@Nullable User user, boolean z) {
        Extensions extensions;
        ProfileExtensionMarriage profileExtensionMarriage;
        List list;
        Profile profile = user.profile;
        if (profile == null || (extensions = profile.extensions) == null || (profileExtensionMarriage = extensions.marriage) == null || (list = profileExtensionMarriage.bridePrice) == null || vwb.J(list) || TextUtils.isEmpty((CharSequence) user.profile.extensions.marriage.bridePrice.get(0))) {
            xdl0.M(((RecyclerView.d0) this).itemView, false);
        } else {
            this.f20371a.setText((String) user.profile.extensions.marriage.bridePrice.get(0));
            xdl0.M(((RecyclerView.d0) this).itemView, true);
        }
    }
}
