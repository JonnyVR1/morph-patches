package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.Extensions;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.ProfileExtensionMarriage;
import com.p051p1.mobile.putong.data.User;
import java.util.List;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class wvp0 extends h11 {

    /* JADX INFO: renamed from: c */
    public static final int f190978c = kec0.f125727Z6;

    /* JADX INFO: renamed from: a */
    public VText f190979a;

    /* JADX INFO: renamed from: b */
    public VText f190980b;

    /* JADX INFO: renamed from: l.wvp0$a */
    public static class C21186a extends hll0 {
        @Override // p153l.hll0
        /* JADX INFO: renamed from: a */
        public h11 mo135759a(ViewGroup viewGroup) {
            return new wvp0(LayoutInflater.from(viewGroup.getContext()).inflate(wvp0.f190978c, viewGroup, false));
        }
    }

    public wvp0(@NonNull View view) {
        super(view);
        this.f190979a = (VText) view.findViewById(adc0.f70482o2);
        VText vText = (VText) view.findViewById(adc0.f70409je);
        this.f190980b = vText;
        vText.setTypeface(lyh0.m156283c(3), 1);
    }

    @Override // p153l.h11
    /* JADX INFO: renamed from: a */
    public void mo133267a(@Nullable User user, boolean z) {
        Extensions extensions;
        ProfileExtensionMarriage profileExtensionMarriage;
        List<String> list;
        Profile profile = user.profile;
        if (profile == null || (extensions = profile.extensions) == null || (profileExtensionMarriage = extensions.marriage) == null || (list = profileExtensionMarriage.bridePrice) == null || jyb.m147479J(list) || TextUtils.isEmpty(user.profile.extensions.marriage.bridePrice.get(0))) {
            bnl0.m105524M(this.itemView, false);
        } else {
            this.f190979a.setText(user.profile.extensions.marriage.bridePrice.get(0));
            bnl0.m105524M(this.itemView, true);
        }
    }
}
