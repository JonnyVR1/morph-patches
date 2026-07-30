package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.p046p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p046p1.mobile.putong.core.p053ui.PictureView;
import com.p046p1.mobile.putong.data.Extensions;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.ProfileExtensionMarriage;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p147v.VFrame;
import p147v.VLinear;

/* JADX INFO: loaded from: classes11.dex */
public class qgm extends a11 {

    /* JADX INFO: renamed from: h */
    public static final int f154349h = f6c0.f95593U6;

    /* JADX INFO: renamed from: a */
    public VFrame f154350a;

    /* JADX INFO: renamed from: b */
    public VLinear f154351b;

    /* JADX INFO: renamed from: c */
    public View f154352c;

    /* JADX INFO: renamed from: d */
    public View f154353d;

    /* JADX INFO: renamed from: e */
    public PictureView f154354e;

    /* JADX INFO: renamed from: f */
    public NewPictureContainerIndicator f154355f;

    /* JADX INFO: renamed from: g */
    public int f154356g;

    /* JADX INFO: renamed from: l.qgm$a */
    public class ViewOnClickListenerC19493a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f154357a;

        public ViewOnClickListenerC19493a(List list) {
            this.f154357a = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i = qgm.this.f154356g;
            if (i <= 0 || i >= this.f154357a.size()) {
                return;
            }
            qgm qgmVar = qgm.this;
            int i2 = qgmVar.f154356g - 1;
            qgmVar.f154356g = i2;
            qgm.this.f154354e.m43993X((Picture) this.f154357a.get(i2));
            qgm qgmVar2 = qgm.this;
            qgmVar2.f154355f.setSelectedIndex(qgmVar2.f154356g);
        }
    }

    /* JADX INFO: renamed from: l.qgm$b */
    public class ViewOnClickListenerC19494b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f154359a;

        public ViewOnClickListenerC19494b(List list) {
            this.f154359a = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (qgm.this.f154356g < this.f154359a.size() - 1) {
                qgm qgmVar = qgm.this;
                int i = qgmVar.f154356g + 1;
                qgmVar.f154356g = i;
                qgm.this.f154354e.m43993X((Picture) this.f154359a.get(i));
                qgm qgmVar2 = qgm.this;
                qgmVar2.f154355f.setSelectedIndex(qgmVar2.f154356g);
            }
        }
    }

    /* JADX INFO: renamed from: l.qgm$c */
    public static class C19495c extends dcl0 {
        @Override // p149l.dcl0
        /* JADX INFO: renamed from: a */
        public a11 mo103900a(ViewGroup viewGroup) {
            return new qgm(LayoutInflater.from(viewGroup.getContext()).inflate(qgm.f154349h, viewGroup, false));
        }
    }

    public qgm(@NonNull View view) {
        super(view);
        this.f154356g = 0;
        m174442c(view);
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.m8265s(t100.m186890d(10.0f));
        this.f154354e.f28070a.getHierarchy().m112053H(roundingParams);
        this.f154354e.f28070a.getHierarchy().m112079z(x2c0.f189780U0);
        this.f154354e.m43984L(true, false, true, true);
    }

    @Override // p149l.a11
    /* JADX INFO: renamed from: a */
    public void mo94503a(@Nullable User user, boolean z) {
        Extensions extensions;
        ProfileExtensionMarriage profileExtensionMarriage;
        Profile profile = user.profile;
        if (profile == null || (extensions = profile.extensions) == null || (profileExtensionMarriage = extensions.marriage) == null || vwb.m200296J(profileExtensionMarriage.lifeMoment)) {
            xdl0.m208344M(this.itemView, false);
            return;
        }
        List<String> list = user.profile.extensions.marriage.lifeMoment;
        ArrayList<String> arrayList = new ArrayList();
        for (String str : list) {
            if (str.startsWith("http")) {
                arrayList.add(str);
            }
        }
        boolean zM200296J = vwb.m200296J(arrayList);
        View view = this.itemView;
        if (zM200296J) {
            xdl0.m208344M(view, false);
            return;
        }
        xdl0.m208344M(view, true);
        ArrayList arrayList2 = new ArrayList();
        boolean z2 = false;
        for (String str2 : arrayList) {
            Picture pictureNew_ = Picture.new_();
            pictureNew_.status = MediaLocalStatus.get("normal");
            pictureNew_.url = str2;
            pictureNew_.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
            arrayList2.add(pictureNew_);
            if (!str2.startsWith("http")) {
                z2 = true;
            }
        }
        if (z2) {
            CrashHelper.m81296c(new RuntimeException("AbnormalURL_RuntimeException:user.id:" + user.f56011id));
        }
        PictureView pictureView = this.f154354e;
        pictureView.f28052M = true;
        pictureView.m43993X((Media) arrayList2.get(0));
        int size = arrayList2.size();
        NewPictureContainerIndicator newPictureContainerIndicator = this.f154355f;
        if (size > 1) {
            xdl0.m208344M(newPictureContainerIndicator, true);
            this.f154355f.setIndicatorCount(arrayList2.size());
            this.f154355f.setSelectedIndex(0);
        } else {
            xdl0.m208344M(newPictureContainerIndicator, false);
        }
        this.f154352c.setOnClickListener(new ViewOnClickListenerC19493a(arrayList2));
        this.f154353d.setOnClickListener(new ViewOnClickListenerC19494b(arrayList2));
    }

    /* JADX INFO: renamed from: c */
    public final void m174442c(View view) {
        rgm.m179171a(this, view);
    }
}
