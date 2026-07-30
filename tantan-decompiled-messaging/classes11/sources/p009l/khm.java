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
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.a11;
import l.dcl0;
import l.f6c0;
import l.lhm;
import l.t100;
import l.x2c0;
import l.xdl0;
import v.VFrame;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class khm extends a11 {

    /* JADX INFO: renamed from: h */
    public static final int f15677h = f6c0.X6;

    /* JADX INFO: renamed from: a */
    public VFrame f15678a;

    /* JADX INFO: renamed from: b */
    public VLinear f15679b;

    /* JADX INFO: renamed from: c */
    public View f15680c;

    /* JADX INFO: renamed from: d */
    public View f15681d;

    /* JADX INFO: renamed from: e */
    public PictureView f15682e;

    /* JADX INFO: renamed from: f */
    public NewPictureContainerIndicator f15683f;

    /* JADX INFO: renamed from: g */
    public int f15684g;

    /* JADX INFO: renamed from: l.khm$a */
    public class ViewOnClickListenerC0997a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f15685a;

        public ViewOnClickListenerC0997a(User user) {
            this.f15685a = user;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i = khm.this.f15684g;
            if (i > 0) {
                if (this.f15685a.media(i) instanceof Video) {
                    khm.this.f15682e.d();
                    khm.this.f15682e.U();
                }
                khm khmVar = khm.this;
                int i2 = khmVar.f15684g - 1;
                khmVar.f15684g = i2;
                khm.this.f15682e.X(this.f15685a.media(i2));
                khm khmVar2 = khm.this;
                khmVar2.f15683f.setSelectedIndex(khmVar2.f15684g);
            }
        }
    }

    /* JADX INFO: renamed from: l.khm$b */
    public class ViewOnClickListenerC0998b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f15687a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ User f15688b;

        public ViewOnClickListenerC0998b(List list, User user) {
            this.f15687a = list;
            this.f15688b = user;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (khm.this.f15684g < this.f15687a.size() - 1) {
                if (this.f15688b.media(khm.this.f15684g) instanceof Video) {
                    khm.this.f15682e.d();
                }
                khm khmVar = khm.this;
                int i = khmVar.f15684g + 1;
                khmVar.f15684g = i;
                khm.this.f15682e.X(this.f15688b.media(i));
                khm khmVar2 = khm.this;
                khmVar2.f15683f.setSelectedIndex(khmVar2.f15684g);
            }
        }
    }

    /* JADX INFO: renamed from: l.khm$c */
    public static class C0999c extends dcl0 {
        /* JADX INFO: renamed from: a */
        public a11 m17503a(ViewGroup viewGroup) {
            return new khm(LayoutInflater.from(viewGroup.getContext()).inflate(khm.f15677h, viewGroup, false));
        }
    }

    public khm(@NonNull View view) {
        super(view);
        this.f15684g = 0;
        m17502c(view);
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.s(t100.d(10.0f));
        this.f15682e.a.getHierarchy().H(roundingParams);
        this.f15682e.a.getHierarchy().z(x2c0.U0);
        this.f15682e.setVideoViewRadius(10);
        this.f15682e.L(true, false, true, true);
    }

    /* JADX INFO: renamed from: a */
    public void m17500a(@Nullable User user, boolean z) {
        Media media;
        List list = user.pictures;
        int size = list.size();
        View view = ((RecyclerView.d0) this).itemView;
        if (size <= 0) {
            xdl0.M(view, false);
            return;
        }
        xdl0.M(view, true);
        this.f15682e.M = true;
        int size2 = list.size();
        NewPictureContainerIndicator newPictureContainerIndicator = this.f15683f;
        if (size2 >= 2) {
            xdl0.M(newPictureContainerIndicator, true);
            this.f15683f.setIndicatorCount(list.size());
            this.f15683f.setSelectedIndex(1);
            media = user.media(1);
            this.f15684g = 1;
        } else {
            xdl0.M(newPictureContainerIndicator, false);
            media = user.media(0);
            this.f15684g = 0;
        }
        this.f15682e.X(media);
        this.f15680c.setOnClickListener(new ViewOnClickListenerC0997a(user));
        this.f15681d.setOnClickListener(new ViewOnClickListenerC0998b(list, user));
    }

    /* JADX INFO: renamed from: b */
    public void m17501b() {
        super.b();
        if (NullChecker.a(this.f15682e)) {
            this.f15682e.d();
            this.f15682e.U();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m17502c(View view) {
        lhm.a(this, view);
    }
}
