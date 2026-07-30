package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.Extensions;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.ProfileExtensionMarriage;
import com.p046p1.mobile.putong.data.User;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class yuw extends a11 {

    /* JADX INFO: renamed from: c */
    public static final int f200136c = f6c0.f95609V6;

    /* JADX INFO: renamed from: a */
    public VText f200137a;

    /* JADX INFO: renamed from: b */
    public VText f200138b;

    /* JADX INFO: renamed from: l.yuw$a */
    public static class C21518a extends dcl0 {
        @Override // p149l.dcl0
        /* JADX INFO: renamed from: a */
        public a11 mo103900a(ViewGroup viewGroup) {
            return new yuw(LayoutInflater.from(viewGroup.getContext()).inflate(yuw.f200136c, viewGroup, false));
        }
    }

    public yuw(@NonNull View view) {
        super(view);
        this.f200137a = (VText) view.findViewById(u4c0.f174013R7);
        VText vText = (VText) view.findViewById(u4c0.f174030S7);
        this.f200138b = vText;
        vText.setTypeface(eqh0.m117752c(3), 1);
    }

    @Override // p149l.a11
    /* JADX INFO: renamed from: a */
    public void mo94503a(@Nullable User user, boolean z) {
        Extensions extensions;
        ProfileExtensionMarriage profileExtensionMarriage;
        Profile profile = user.profile;
        if (profile == null || (extensions = profile.extensions) == null || (profileExtensionMarriage = extensions.marriage) == null || vwb.m200296J(profileExtensionMarriage.declaration)) {
            xdl0.m208344M(this.itemView, false);
        } else {
            xdl0.m208344M(this.itemView, true);
            this.f200137a.setText(user.profile.extensions.marriage.declaration.get(0));
        }
    }
}
