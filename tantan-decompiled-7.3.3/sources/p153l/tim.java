package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.p051p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p051p1.mobile.putong.core.p058ui.PictureView;
import com.p051p1.mobile.putong.data.Extensions;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.ProfileExtensionMarriage;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p151v.VFrame;
import p151v.VLinear;

/* JADX INFO: loaded from: classes11.dex */
public class tim extends h11 {

    /* JADX INFO: renamed from: h */
    public static final int f174472h = kec0.f125663V6;

    /* JADX INFO: renamed from: a */
    public VFrame f174473a;

    /* JADX INFO: renamed from: b */
    public VLinear f174474b;

    /* JADX INFO: renamed from: c */
    public View f174475c;

    /* JADX INFO: renamed from: d */
    public View f174476d;

    /* JADX INFO: renamed from: e */
    public PictureView f174477e;

    /* JADX INFO: renamed from: f */
    public NewPictureContainerIndicator f174478f;

    /* JADX INFO: renamed from: g */
    public int f174479g;

    /* JADX INFO: renamed from: l.tim$a */
    public class ViewOnClickListenerC20325a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f174480a;

        public ViewOnClickListenerC20325a(List list) {
            this.f174480a = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i = tim.this.f174479g;
            if (i <= 0 || i >= this.f174480a.size()) {
                return;
            }
            tim timVar = tim.this;
            int i2 = timVar.f174479g - 1;
            timVar.f174479g = i2;
            tim.this.f174477e.m45176X((Picture) this.f174480a.get(i2));
            tim timVar2 = tim.this;
            timVar2.f174478f.setSelectedIndex(timVar2.f174479g);
        }
    }

    /* JADX INFO: renamed from: l.tim$b */
    public class ViewOnClickListenerC20326b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f174482a;

        public ViewOnClickListenerC20326b(List list) {
            this.f174482a = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (tim.this.f174479g < this.f174482a.size() - 1) {
                tim timVar = tim.this;
                int i = timVar.f174479g + 1;
                timVar.f174479g = i;
                tim.this.f174477e.m45176X((Picture) this.f174482a.get(i));
                tim timVar2 = tim.this;
                timVar2.f174478f.setSelectedIndex(timVar2.f174479g);
            }
        }
    }

    /* JADX INFO: renamed from: l.tim$c */
    public static class C20327c extends hll0 {
        @Override // p153l.hll0
        /* JADX INFO: renamed from: a */
        public h11 mo135759a(ViewGroup viewGroup) {
            return new tim(LayoutInflater.from(viewGroup.getContext()).inflate(tim.f174472h, viewGroup, false));
        }
    }

    public tim(@NonNull View view) {
        super(view);
        this.f174479g = 0;
        m191337c(view);
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.m8319s(qa00.m175859d(10.0f));
        this.f174477e.f28918a.getHierarchy().m207045H(roundingParams);
        this.f174477e.f28918a.getHierarchy().m207065z(dbc0.f86649V0);
        this.f174477e.m45167L(true, false, true, true);
    }

    @Override // p153l.h11
    /* JADX INFO: renamed from: a */
    public void mo133267a(@Nullable User user, boolean z) {
        Extensions extensions;
        ProfileExtensionMarriage profileExtensionMarriage;
        Profile profile = user.profile;
        if (profile == null || (extensions = profile.extensions) == null || (profileExtensionMarriage = extensions.marriage) == null || jyb.m147479J(profileExtensionMarriage.lifeMoment)) {
            bnl0.m105524M(this.itemView, false);
            return;
        }
        List<String> list = user.profile.extensions.marriage.lifeMoment;
        ArrayList<String> arrayList = new ArrayList();
        for (String str : list) {
            if (str.startsWith("http")) {
                arrayList.add(str);
            }
        }
        boolean zM147479J = jyb.m147479J(arrayList);
        View view = this.itemView;
        if (zM147479J) {
            bnl0.m105524M(view, false);
            return;
        }
        bnl0.m105524M(view, true);
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
            CrashHelper.m82479c(new RuntimeException("AbnormalURL_RuntimeException:user.id:" + user.f56859id));
        }
        PictureView pictureView = this.f174477e;
        pictureView.f28900M = true;
        pictureView.m45176X((Media) arrayList2.get(0));
        int size = arrayList2.size();
        NewPictureContainerIndicator newPictureContainerIndicator = this.f174478f;
        if (size > 1) {
            bnl0.m105524M(newPictureContainerIndicator, true);
            this.f174478f.setIndicatorCount(arrayList2.size());
            this.f174478f.setSelectedIndex(0);
        } else {
            bnl0.m105524M(newPictureContainerIndicator, false);
        }
        this.f174475c.setOnClickListener(new ViewOnClickListenerC20325a(arrayList2));
        this.f174476d.setOnClickListener(new ViewOnClickListenerC20326b(arrayList2));
    }

    /* JADX INFO: renamed from: c */
    public final void m191337c(View view) {
        uim.m196296a(this, view);
    }
}
