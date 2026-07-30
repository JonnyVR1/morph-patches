package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.Extensions;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.ProfileExtensionMarriage;
import com.p051p1.mobile.putong.data.User;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class xxw extends h11 {

    /* JADX INFO: renamed from: c */
    public static final int f196701c = kec0.f125679W6;

    /* JADX INFO: renamed from: a */
    public VText f196702a;

    /* JADX INFO: renamed from: b */
    public VText f196703b;

    /* JADX INFO: renamed from: l.xxw$a */
    public static class C21474a extends hll0 {
        @Override // p153l.hll0
        /* JADX INFO: renamed from: a */
        public h11 mo135759a(ViewGroup viewGroup) {
            return new xxw(LayoutInflater.from(viewGroup.getContext()).inflate(xxw.f196701c, viewGroup, false));
        }
    }

    public xxw(@NonNull View view) {
        super(view);
        this.f196702a = (VText) view.findViewById(adc0.f70135T7);
        VText vText = (VText) view.findViewById(adc0.f70152U7);
        this.f196703b = vText;
        vText.setTypeface(lyh0.m156283c(3), 1);
    }

    @Override // p153l.h11
    /* JADX INFO: renamed from: a */
    public void mo133267a(@Nullable User user, boolean z) {
        Extensions extensions;
        ProfileExtensionMarriage profileExtensionMarriage;
        Profile profile = user.profile;
        if (profile == null || (extensions = profile.extensions) == null || (profileExtensionMarriage = extensions.marriage) == null || jyb.m147479J(profileExtensionMarriage.declaration)) {
            bnl0.m105524M(this.itemView, false);
        } else {
            bnl0.m105524M(this.itemView, true);
            this.f196702a.setText(user.profile.extensions.marriage.declaration.get(0));
        }
    }
}
