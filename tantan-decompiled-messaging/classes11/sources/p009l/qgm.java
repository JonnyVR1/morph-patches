package p009l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.generic.RoundingParams;
import com.p000p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p1.mobile.putong.core.ui.PictureView;
import com.p1.mobile.putong.data.Extensions;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.ProfileExtensionMarriage;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import l.a11;
import l.dcl0;
import l.f6c0;
import l.rgm;
import l.t100;
import l.vwb;
import l.x2c0;
import l.xdl0;
import v.VFrame;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class qgm extends a11 {

    /* JADX INFO: renamed from: h */
    public static final int f19237h = f6c0.U6;

    /* JADX INFO: renamed from: a */
    public VFrame f19238a;

    /* JADX INFO: renamed from: b */
    public VLinear f19239b;

    /* JADX INFO: renamed from: c */
    public View f19240c;

    /* JADX INFO: renamed from: d */
    public View f19241d;

    /* JADX INFO: renamed from: e */
    public PictureView f19242e;

    /* JADX INFO: renamed from: f */
    public NewPictureContainerIndicator f19243f;

    /* JADX INFO: renamed from: g */
    public int f19244g;

    /* JADX INFO: renamed from: l.qgm$a */
    public class ViewOnClickListenerC1142a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f19245a;

        public ViewOnClickListenerC1142a(List list) {
            this.f19245a = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i = qgm.this.f19244g;
            if (i <= 0 || i >= this.f19245a.size()) {
                return;
            }
            qgm qgmVar = qgm.this;
            int i2 = qgmVar.f19244g - 1;
            qgmVar.f19244g = i2;
            qgm.this.f19242e.X((Picture) this.f19245a.get(i2));
            qgm qgmVar2 = qgm.this;
            qgmVar2.f19243f.setSelectedIndex(qgmVar2.f19244g);
        }
    }

    /* JADX INFO: renamed from: l.qgm$b */
    public class ViewOnClickListenerC1143b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f19247a;

        public ViewOnClickListenerC1143b(List list) {
            this.f19247a = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (qgm.this.f19244g < this.f19247a.size() - 1) {
                qgm qgmVar = qgm.this;
                int i = qgmVar.f19244g + 1;
                qgmVar.f19244g = i;
                qgm.this.f19242e.X((Picture) this.f19247a.get(i));
                qgm qgmVar2 = qgm.this;
                qgmVar2.f19243f.setSelectedIndex(qgmVar2.f19244g);
            }
        }
    }

    /* JADX INFO: renamed from: l.qgm$c */
    public static class C1144c extends dcl0 {
        /* JADX INFO: renamed from: a */
        public a11 m20975a(ViewGroup viewGroup) {
            return new qgm(LayoutInflater.from(viewGroup.getContext()).inflate(qgm.f19237h, viewGroup, false));
        }
    }

    public qgm(@NonNull View view) {
        super(view);
        this.f19244g = 0;
        m20974c(view);
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.s(t100.d(10.0f));
        this.f19242e.a.getHierarchy().H(roundingParams);
        this.f19242e.a.getHierarchy().z(x2c0.U0);
        this.f19242e.L(true, false, true, true);
    }

    /* JADX INFO: renamed from: a */
    public void m20973a(@Nullable User user, boolean z) {
        Extensions extensions;
        ProfileExtensionMarriage profileExtensionMarriage;
        Profile profile = user.profile;
        if (profile == null || (extensions = profile.extensions) == null || (profileExtensionMarriage = extensions.marriage) == null || vwb.J(profileExtensionMarriage.lifeMoment)) {
            xdl0.M(((RecyclerView.d0) this).itemView, false);
            return;
        }
        List<String> list = user.profile.extensions.marriage.lifeMoment;
        ArrayList<String> arrayList = new ArrayList();
        for (String str : list) {
            if (str.startsWith("http")) {
                arrayList.add(str);
            }
        }
        boolean zJ = vwb.J(arrayList);
        View view = ((RecyclerView.d0) this).itemView;
        if (zJ) {
            xdl0.M(view, false);
            return;
        }
        xdl0.M(view, true);
        ArrayList arrayList2 = new ArrayList();
        boolean z2 = false;
        for (String str2 : arrayList) {
            Picture pictureNew_ = Picture.new_();
            ((Media) pictureNew_).status = MediaLocalStatus.get("normal");
            ((Media) pictureNew_).url = str2;
            ((Media) pictureNew_).mediaType = "image/jpeg";
            arrayList2.add(pictureNew_);
            if (!str2.startsWith("http")) {
                z2 = true;
            }
        }
        if (z2) {
            CrashHelper.c(new RuntimeException("AbnormalURL_RuntimeException:user.id:" + ((DbObject) user).id));
        }
        PictureView pictureView = this.f19242e;
        pictureView.M = true;
        pictureView.X((Media) arrayList2.get(0));
        int size = arrayList2.size();
        NewPictureContainerIndicator newPictureContainerIndicator = this.f19243f;
        if (size > 1) {
            xdl0.M(newPictureContainerIndicator, true);
            this.f19243f.setIndicatorCount(arrayList2.size());
            this.f19243f.setSelectedIndex(0);
        } else {
            xdl0.M(newPictureContainerIndicator, false);
        }
        this.f19240c.setOnClickListener(new ViewOnClickListenerC1142a(arrayList2));
        this.f19241d.setOnClickListener(new ViewOnClickListenerC1143b(arrayList2));
    }

    /* JADX INFO: renamed from: c */
    public final void m20974c(View view) {
        rgm.a(this, view);
    }
}
