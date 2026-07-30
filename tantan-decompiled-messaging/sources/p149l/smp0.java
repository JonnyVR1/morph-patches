package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.Extensions;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.ProfileExtensionMarriage;
import com.p046p1.mobile.putong.data.User;
import java.util.List;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class smp0 extends a11 {

    /* JADX INFO: renamed from: c */
    public static final int f165365c = f6c0.f95657Y6;

    /* JADX INFO: renamed from: a */
    public VText f165366a;

    /* JADX INFO: renamed from: b */
    public VText f165367b;

    /* JADX INFO: renamed from: l.smp0$a */
    public static class C19993a extends dcl0 {
        @Override // p149l.dcl0
        /* JADX INFO: renamed from: a */
        public a11 mo103900a(ViewGroup viewGroup) {
            return new smp0(LayoutInflater.from(viewGroup.getContext()).inflate(smp0.f165365c, viewGroup, false));
        }
    }

    public smp0(@NonNull View view) {
        super(view);
        this.f165366a = (VText) view.findViewById(u4c0.f174357m2);
        VText vText = (VText) view.findViewById(u4c0.f174268ge);
        this.f165367b = vText;
        vText.setTypeface(eqh0.m117752c(3), 1);
    }

    @Override // p149l.a11
    /* JADX INFO: renamed from: a */
    public void mo94503a(@Nullable User user, boolean z) {
        Extensions extensions;
        ProfileExtensionMarriage profileExtensionMarriage;
        List<String> list;
        Profile profile = user.profile;
        if (profile == null || (extensions = profile.extensions) == null || (profileExtensionMarriage = extensions.marriage) == null || (list = profileExtensionMarriage.bridePrice) == null || vwb.m200296J(list) || TextUtils.isEmpty(user.profile.extensions.marriage.bridePrice.get(0))) {
            xdl0.m208344M(this.itemView, false);
        } else {
            this.f165366a.setText(user.profile.extensions.marriage.bridePrice.get(0));
            xdl0.m208344M(this.itemView, true);
        }
    }
}
