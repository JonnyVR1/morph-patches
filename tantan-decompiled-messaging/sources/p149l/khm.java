package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.p046p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p046p1.mobile.putong.core.p053ui.PictureView;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VFrame;
import p147v.VLinear;

/* JADX INFO: loaded from: classes11.dex */
public class khm extends a11 {

    /* JADX INFO: renamed from: h */
    public static final int f123177h = f6c0.f95641X6;

    /* JADX INFO: renamed from: a */
    public VFrame f123178a;

    /* JADX INFO: renamed from: b */
    public VLinear f123179b;

    /* JADX INFO: renamed from: c */
    public View f123180c;

    /* JADX INFO: renamed from: d */
    public View f123181d;

    /* JADX INFO: renamed from: e */
    public PictureView f123182e;

    /* JADX INFO: renamed from: f */
    public NewPictureContainerIndicator f123183f;

    /* JADX INFO: renamed from: g */
    public int f123184g;

    /* JADX INFO: renamed from: l.khm$a */
    public class ViewOnClickListenerC18017a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f123185a;

        public ViewOnClickListenerC18017a(User user) {
            this.f123185a = user;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i = khm.this.f123184g;
            if (i > 0) {
                if (this.f123185a.media(i) instanceof Video) {
                    khm.this.f123182e.mo36116d();
                    khm.this.f123182e.m43990U();
                }
                khm khmVar = khm.this;
                int i2 = khmVar.f123184g - 1;
                khmVar.f123184g = i2;
                khm.this.f123182e.m43993X(this.f123185a.media(i2));
                khm khmVar2 = khm.this;
                khmVar2.f123183f.setSelectedIndex(khmVar2.f123184g);
            }
        }
    }

    /* JADX INFO: renamed from: l.khm$b */
    public class ViewOnClickListenerC18018b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f123187a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ User f123188b;

        public ViewOnClickListenerC18018b(List list, User user) {
            this.f123187a = list;
            this.f123188b = user;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (khm.this.f123184g < this.f123187a.size() - 1) {
                if (this.f123188b.media(khm.this.f123184g) instanceof Video) {
                    khm.this.f123182e.mo36116d();
                }
                khm khmVar = khm.this;
                int i = khmVar.f123184g + 1;
                khmVar.f123184g = i;
                khm.this.f123182e.m43993X(this.f123188b.media(i));
                khm khmVar2 = khm.this;
                khmVar2.f123183f.setSelectedIndex(khmVar2.f123184g);
            }
        }
    }

    /* JADX INFO: renamed from: l.khm$c */
    public static class C18019c extends dcl0 {
        @Override // p149l.dcl0
        /* JADX INFO: renamed from: a */
        public a11 mo103900a(ViewGroup viewGroup) {
            return new khm(LayoutInflater.from(viewGroup.getContext()).inflate(khm.f123177h, viewGroup, false));
        }
    }

    public khm(@NonNull View view) {
        super(view);
        this.f123184g = 0;
        m145980c(view);
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.m8265s(t100.m186890d(10.0f));
        this.f123182e.f28070a.getHierarchy().m112053H(roundingParams);
        this.f123182e.f28070a.getHierarchy().m112079z(x2c0.f189780U0);
        this.f123182e.setVideoViewRadius(10);
        this.f123182e.m43984L(true, false, true, true);
    }

    @Override // p149l.a11
    /* JADX INFO: renamed from: a */
    public void mo94503a(@Nullable User user, boolean z) {
        Media media;
        List<Media> list = user.pictures;
        int size = list.size();
        View view = this.itemView;
        if (size <= 0) {
            xdl0.m208344M(view, false);
            return;
        }
        xdl0.m208344M(view, true);
        this.f123182e.f28052M = true;
        int size2 = list.size();
        NewPictureContainerIndicator newPictureContainerIndicator = this.f123183f;
        if (size2 >= 2) {
            xdl0.m208344M(newPictureContainerIndicator, true);
            this.f123183f.setIndicatorCount(list.size());
            this.f123183f.setSelectedIndex(1);
            media = user.media(1);
            this.f123184g = 1;
        } else {
            xdl0.m208344M(newPictureContainerIndicator, false);
            media = user.media(0);
            this.f123184g = 0;
        }
        this.f123182e.m43993X(media);
        this.f123180c.setOnClickListener(new ViewOnClickListenerC18017a(user));
        this.f123181d.setOnClickListener(new ViewOnClickListenerC18018b(list, user));
    }

    @Override // p149l.a11
    /* JADX INFO: renamed from: b */
    public void mo94504b() {
        super.mo94504b();
        if (NullChecker.m81303a(this.f123182e)) {
            this.f123182e.mo36116d();
            this.f123182e.m43990U();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m145980c(View view) {
        lhm.m149847a(this, view);
    }
}
