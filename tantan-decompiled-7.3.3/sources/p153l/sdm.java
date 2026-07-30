package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.data.LabelData;
import com.p051p1.mobile.putong.core.view.CardLabelShowView3;
import com.p051p1.mobile.putong.data.Extensions;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.ProfileExtensionMarriage;
import com.p051p1.mobile.putong.data.User;
import java.util.List;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class sdm extends h11 {

    /* JADX INFO: renamed from: d */
    public static final int f167441d = kec0.f125647U6;

    /* JADX INFO: renamed from: a */
    public CardLabelShowView3 f167442a;

    /* JADX INFO: renamed from: b */
    public VText f167443b;

    /* JADX INFO: renamed from: c */
    public VText f167444c;

    /* JADX INFO: renamed from: l.sdm$a */
    public static class C20025a extends hll0 {
        @Override // p153l.hll0
        /* JADX INFO: renamed from: a */
        public h11 mo135759a(ViewGroup viewGroup) {
            return new sdm(LayoutInflater.from(viewGroup.getContext()).inflate(sdm.f167441d, viewGroup, false));
        }
    }

    public sdm(@NonNull View view) {
        super(view);
        this.f167442a = (CardLabelShowView3) view.findViewById(adc0.f69913G6);
        this.f167443b = (VText) view.findViewById(adc0.f69980K5);
        VText vText = (VText) view.findViewById(adc0.f70409je);
        this.f167444c = vText;
        vText.setTypeface(lyh0.m156283c(3), 1);
    }

    @Override // p153l.h11
    /* JADX INFO: renamed from: a */
    public void mo133267a(@Nullable User user, boolean z) {
        Extensions extensions;
        ProfileExtensionMarriage profileExtensionMarriage;
        Profile profile = user.profile;
        if (profile == null || (extensions = profile.extensions) == null || (profileExtensionMarriage = extensions.marriage) == null || jyb.m147479J(profileExtensionMarriage.mateDescription)) {
            this.f167443b.setText("");
            bnl0.m105524M(this.f167443b, false);
        } else {
            String str = user.profile.extensions.marriage.mateDescription.get(0);
            bnl0.m105524M(this.f167443b, true);
            this.f167443b.setText(str);
        }
        List<LabelData> listM161374o = n3x.m161374o(user);
        boolean zM147479J = jyb.m147479J(listM161374o);
        CardLabelShowView3 cardLabelShowView3 = this.f167442a;
        if (zM147479J) {
            bnl0.m105524M(cardLabelShowView3, false);
        } else {
            bnl0.m105524M(cardLabelShowView3, true);
            this.f167442a.setLabel(listM161374o);
        }
        if (jyb.m147479J(listM161374o) && TextUtils.isEmpty(this.f167443b.getText())) {
            bnl0.m105524M(this.itemView, false);
        } else {
            bnl0.m105524M(this.itemView, true);
        }
    }
}
