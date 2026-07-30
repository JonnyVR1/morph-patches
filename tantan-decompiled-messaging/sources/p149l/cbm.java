package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.data.LabelData;
import com.p046p1.mobile.putong.core.view.CardLabelShowView3;
import com.p046p1.mobile.putong.data.Extensions;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.ProfileExtensionMarriage;
import com.p046p1.mobile.putong.data.User;
import java.util.List;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class cbm extends a11 {

    /* JADX INFO: renamed from: d */
    public static final int f80166d = f6c0.f95577T6;

    /* JADX INFO: renamed from: a */
    public CardLabelShowView3 f80167a;

    /* JADX INFO: renamed from: b */
    public VText f80168b;

    /* JADX INFO: renamed from: c */
    public VText f80169c;

    /* JADX INFO: renamed from: l.cbm$a */
    public static class C16104a extends dcl0 {
        @Override // p149l.dcl0
        /* JADX INFO: renamed from: a */
        public a11 mo103900a(ViewGroup viewGroup) {
            return new cbm(LayoutInflater.from(viewGroup.getContext()).inflate(cbm.f80166d, viewGroup, false));
        }
    }

    public cbm(@NonNull View view) {
        super(view);
        this.f80167a = (CardLabelShowView3) view.findViewById(u4c0.f173791E6);
        this.f80168b = (VText) view.findViewById(u4c0.f173858I5);
        VText vText = (VText) view.findViewById(u4c0.f174268ge);
        this.f80169c = vText;
        vText.setTypeface(eqh0.m117752c(3), 1);
    }

    @Override // p149l.a11
    /* JADX INFO: renamed from: a */
    public void mo94503a(@Nullable User user, boolean z) {
        Extensions extensions;
        ProfileExtensionMarriage profileExtensionMarriage;
        Profile profile = user.profile;
        if (profile == null || (extensions = profile.extensions) == null || (profileExtensionMarriage = extensions.marriage) == null || vwb.m200296J(profileExtensionMarriage.mateDescription)) {
            this.f80168b.setText("");
            xdl0.m208344M(this.f80168b, false);
        } else {
            String str = user.profile.extensions.marriage.mateDescription.get(0);
            xdl0.m208344M(this.f80168b, true);
            this.f80168b.setText(str);
        }
        List<LabelData> listM162206o = o0x.m162206o(user);
        boolean zM200296J = vwb.m200296J(listM162206o);
        CardLabelShowView3 cardLabelShowView3 = this.f80167a;
        if (zM200296J) {
            xdl0.m208344M(cardLabelShowView3, false);
        } else {
            xdl0.m208344M(cardLabelShowView3, true);
            this.f80167a.setLabel(listM162206o);
        }
        if (vwb.m200296J(listM162206o) && TextUtils.isEmpty(this.f80168b.getText())) {
            xdl0.m208344M(this.itemView, false);
        } else {
            xdl0.m208344M(this.itemView, true);
        }
    }
}
