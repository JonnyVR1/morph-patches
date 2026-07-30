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
import com.p1.mobile.putong.data.ProfileExtensionBasic;
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
public class y3g extends a11 {

    /* JADX INFO: renamed from: c */
    public static final int f22871c = f6c0.Q6;

    /* JADX INFO: renamed from: a */
    public VText f22872a;

    /* JADX INFO: renamed from: b */
    public VText f22873b;

    /* JADX INFO: renamed from: l.y3g$a */
    public static class C1321a extends dcl0 {
        /* JADX INFO: renamed from: a */
        public a11 m25181a(ViewGroup viewGroup) {
            return new y3g(LayoutInflater.from(viewGroup.getContext()).inflate(y3g.f22871c, viewGroup, false));
        }
    }

    public y3g(@NonNull View view) {
        super(view);
        this.f22872a = view.findViewById(u4c0.m2);
        VText vTextFindViewById = view.findViewById(u4c0.ge);
        this.f22873b = vTextFindViewById;
        vTextFindViewById.setTypeface(eqh0.c(3), 1);
    }

    /* JADX INFO: renamed from: a */
    public void m25180a(@Nullable User user, boolean z) {
        Extensions extensions;
        ProfileExtensionBasic profileExtensionBasic;
        List list;
        Profile profile = user.profile;
        if (profile == null || (extensions = profile.extensions) == null || (profileExtensionBasic = extensions.basic) == null || (list = profileExtensionBasic.familyBackground) == null || vwb.J(list) || TextUtils.isEmpty((CharSequence) user.profile.extensions.basic.familyBackground.get(0))) {
            xdl0.M(((RecyclerView.d0) this).itemView, false);
        } else {
            this.f22872a.setText((String) user.profile.extensions.basic.familyBackground.get(0));
            xdl0.M(((RecyclerView.d0) this).itemView, true);
        }
    }
}
