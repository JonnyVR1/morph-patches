package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.Extensions;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.ProfileExtensionBasic;
import com.p046p1.mobile.putong.data.User;
import java.util.List;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class y3g extends a11 {

    /* JADX INFO: renamed from: c */
    public static final int f195797c = f6c0.f95529Q6;

    /* JADX INFO: renamed from: a */
    public VText f195798a;

    /* JADX INFO: renamed from: b */
    public VText f195799b;

    /* JADX INFO: renamed from: l.y3g$a */
    public static class C21302a extends dcl0 {
        @Override // p149l.dcl0
        /* JADX INFO: renamed from: a */
        public a11 mo103900a(ViewGroup viewGroup) {
            return new y3g(LayoutInflater.from(viewGroup.getContext()).inflate(y3g.f195797c, viewGroup, false));
        }
    }

    public y3g(@NonNull View view) {
        super(view);
        this.f195798a = (VText) view.findViewById(u4c0.f174357m2);
        VText vText = (VText) view.findViewById(u4c0.f174268ge);
        this.f195799b = vText;
        vText.setTypeface(eqh0.m117752c(3), 1);
    }

    @Override // p149l.a11
    /* JADX INFO: renamed from: a */
    public void mo94503a(@Nullable User user, boolean z) {
        Extensions extensions;
        ProfileExtensionBasic profileExtensionBasic;
        List<String> list;
        Profile profile = user.profile;
        if (profile == null || (extensions = profile.extensions) == null || (profileExtensionBasic = extensions.basic) == null || (list = profileExtensionBasic.familyBackground) == null || vwb.m200296J(list) || TextUtils.isEmpty(user.profile.extensions.basic.familyBackground.get(0))) {
            xdl0.m208344M(this.itemView, false);
        } else {
            this.f195798a.setText(user.profile.extensions.basic.familyBackground.get(0));
            xdl0.m208344M(this.itemView, true);
        }
    }
}
