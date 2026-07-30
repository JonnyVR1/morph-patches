package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.Extensions;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.ProfileExtensionBasic;
import com.p051p1.mobile.putong.data.User;
import java.util.List;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class m5g extends h11 {

    /* JADX INFO: renamed from: c */
    public static final int f134894c = kec0.f125599R6;

    /* JADX INFO: renamed from: a */
    public VText f134895a;

    /* JADX INFO: renamed from: b */
    public VText f134896b;

    /* JADX INFO: renamed from: l.m5g$a */
    public static class C18550a extends hll0 {
        @Override // p153l.hll0
        /* JADX INFO: renamed from: a */
        public h11 mo135759a(ViewGroup viewGroup) {
            return new m5g(LayoutInflater.from(viewGroup.getContext()).inflate(m5g.f134894c, viewGroup, false));
        }
    }

    public m5g(@NonNull View view) {
        super(view);
        this.f134895a = (VText) view.findViewById(adc0.f70482o2);
        VText vText = (VText) view.findViewById(adc0.f70409je);
        this.f134896b = vText;
        vText.setTypeface(lyh0.m156283c(3), 1);
    }

    @Override // p153l.h11
    /* JADX INFO: renamed from: a */
    public void mo133267a(@Nullable User user, boolean z) {
        Extensions extensions;
        ProfileExtensionBasic profileExtensionBasic;
        List<String> list;
        Profile profile = user.profile;
        if (profile == null || (extensions = profile.extensions) == null || (profileExtensionBasic = extensions.basic) == null || (list = profileExtensionBasic.familyBackground) == null || jyb.m147479J(list) || TextUtils.isEmpty(user.profile.extensions.basic.familyBackground.get(0))) {
            bnl0.m105524M(this.itemView, false);
        } else {
            this.f134895a.setText(user.profile.extensions.basic.familyBackground.get(0));
            bnl0.m105524M(this.itemView, true);
        }
    }
}
