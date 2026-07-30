package p009l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p1.mobile.putong.core.data.LabelData;
import com.p1.mobile.putong.core.view.CardLabelShowView3;
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
public class cbm extends a11 {

    /* JADX INFO: renamed from: d */
    public static final int f10497d = f6c0.T6;

    /* JADX INFO: renamed from: a */
    public CardLabelShowView3 f10498a;

    /* JADX INFO: renamed from: b */
    public VText f10499b;

    /* JADX INFO: renamed from: c */
    public VText f10500c;

    /* JADX INFO: renamed from: l.cbm$a */
    public static class C0804a extends dcl0 {
        /* JADX INFO: renamed from: a */
        public a11 m12475a(ViewGroup viewGroup) {
            return new cbm(LayoutInflater.from(viewGroup.getContext()).inflate(cbm.f10497d, viewGroup, false));
        }
    }

    public cbm(@NonNull View view) {
        super(view);
        this.f10498a = view.findViewById(u4c0.E6);
        this.f10499b = view.findViewById(u4c0.I5);
        VText vTextFindViewById = view.findViewById(u4c0.ge);
        this.f10500c = vTextFindViewById;
        vTextFindViewById.setTypeface(eqh0.c(3), 1);
    }

    /* JADX INFO: renamed from: a */
    public void m12474a(@Nullable User user, boolean z) {
        Extensions extensions;
        ProfileExtensionMarriage profileExtensionMarriage;
        Profile profile = user.profile;
        if (profile == null || (extensions = profile.extensions) == null || (profileExtensionMarriage = extensions.marriage) == null || vwb.J(profileExtensionMarriage.mateDescription)) {
            this.f10499b.setText("");
            xdl0.M(this.f10499b, false);
        } else {
            String str = (String) user.profile.extensions.marriage.mateDescription.get(0);
            xdl0.M(this.f10499b, true);
            this.f10499b.setText(str);
        }
        List<LabelData> listM19586o = o0x.m19586o(user);
        boolean zJ = vwb.J(listM19586o);
        CardLabelShowView3 cardLabelShowView3 = this.f10498a;
        if (zJ) {
            xdl0.M(cardLabelShowView3, false);
        } else {
            xdl0.M(cardLabelShowView3, true);
            this.f10498a.setLabel(listM19586o);
        }
        if (vwb.J(listM19586o) && TextUtils.isEmpty(this.f10499b.getText())) {
            xdl0.M(((RecyclerView.d0) this).itemView, false);
        } else {
            xdl0.M(((RecyclerView.d0) this).itemView, true);
        }
    }
}
